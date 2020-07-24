package com.jhw.company.repo.repo_impl;

import com.clean.core.app.services.Notification;
import com.clean.core.app.services.NotificationsGeneralType;
import com.clean.core.domain.services.Resource;
import com.jhw.company.core.domain.Company;
import com.jhw.utils.jackson.JACKSON;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.inject.Inject;
import com.jhw.company.core.repo_def.CompanyRepo;
import com.jhw.utils.jackson.JACKSONRepoGeneral;

/**
 * Implementacion de la Interfaz {@code LicenceRepo} para manejar el
 * comportamiento de las definiciones de su interfaz
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class CompanyRepoImpl extends JACKSONRepoGeneral<Company> implements CompanyRepo {

    /**
     * Constructor por defecto, usado para injectar.
     */
    @Inject
    public CompanyRepoImpl() {
        super("company.json", Company.class);
    }

    @Override
    protected void onReadError(Exception e) {
        Notification.showConfirmDialog(NotificationsGeneralType.CONFIRM_INFO,
                Resource.getString("msg.company.error.read"));
    }

}
