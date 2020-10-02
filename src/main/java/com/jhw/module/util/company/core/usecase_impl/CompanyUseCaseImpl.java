package com.jhw.module.util.company.core.usecase_impl;

import com.clean.core.app.usecase.DefaultReadWriteUseCase;
import com.jhw.module.util.company.core.domain.CompanyDomain;
import com.jhw.module.util.company.core.module.CompanyCoreModule;
import com.jhw.module.util.company.core.repo_def.CompanyRepo;
import com.jhw.module.util.company.core.usecase_def.CompanyUseCase;
import javax.inject.Inject;

/**
 * Implementacion de la Interfaz {@code LicenceUseCase} para manejar el
 * comportamiento de las definiciones de su interfaz
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class CompanyUseCaseImpl extends DefaultReadWriteUseCase<CompanyDomain> implements CompanyUseCase {

    /**
     * Instancia del repo para almacenar las cosas en memoria
     */
    private final CompanyRepo repo = CompanyCoreModule.getInstance().getImplementation(CompanyRepo.class);

    /**
     * Constructor por defecto, usado par injectar.
     */
    @Inject
    public CompanyUseCaseImpl() {
        super.setRepo(repo);
    }

    @Override
    public String getLogoURL() throws Exception {
        return read().getLogo_URL();
    }

    @Override
    public String getName() throws Exception {
        return read().getName();
    }

    @Override
    public String getIconURL() throws Exception {
        return read().getIcon_URL();
    }

    @Override
    public String getTitle() throws Exception {
        return read().getTitle();
    }

}
