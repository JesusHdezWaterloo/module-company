package com.jhw.module.util.company.repo.repo_impl;

import com.clean.core.app.services.Notification;
import com.clean.core.app.services.NotificationsGeneralType;
import com.clean.core.domain.services.Resource;
import com.jhw.module.util.company.core.domain.CompanyDomain;
import javax.inject.Inject;
import com.jhw.module.util.company.core.repo_def.CompanyRepo;
import com.jhw.utils.jackson.JACKSONRepoGeneral;

/**
 * Implementacion de la Interfaz {@code LicenceRepo} para manejar el
 * comportamiento de las definiciones de su interfaz
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class CompanyRepoImpl extends JACKSONRepoGeneral<CompanyDomain> implements CompanyRepo {

    /**
     * Constructor por defecto, usado para injectar.
     */
    @Inject
    public CompanyRepoImpl() {
        super("company/company.json", CompanyDomain.class);
    }

    @Override
    protected void onReadError(Exception e) {
        Notification.showConfirmDialog(NotificationsGeneralType.CONFIRM_INFO,
                Resource.getString("msg.company.error.read"));
    }

}
