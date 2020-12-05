package com.jhw.module.util.company.core.module;

import com.google.inject.AbstractModule;
import com.jhw.module.util.company.core.usecase_impl.CompanyUseCaseImpl;
import com.jhw.module.util.company.core.usecase_def.CompanyUseCase;

/**
 * Configuracion del injection del modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class CompanyCoreInjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(CompanyUseCase.class).to(CompanyUseCaseImpl.class)/*.in(Singleton.class)*/;
    }

}
