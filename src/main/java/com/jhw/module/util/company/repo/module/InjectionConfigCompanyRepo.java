package com.jhw.module.util.company.repo.module;

import com.jhw.module.util.company.repo.repo_impl.CompanyRepoImpl;
import com.google.inject.AbstractModule;
import com.jhw.module.util.company.core.repo_def.CompanyRepo;

/**
 * Configuracion del injection del modulo de licencia-repo.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class InjectionConfigCompanyRepo extends AbstractModule {

    @Override
    protected void configure() {
        bind(CompanyRepo.class).to(CompanyRepoImpl.class);
    }

}
