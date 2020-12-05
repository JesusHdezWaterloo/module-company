package com.jhw.module.util.company.core.module;

import com.clean.core.app.modules.AbstractModule;
import com.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jhw.module.util.company.repo.module.CompanyRepoModule;

/**
 * Modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class CompanyCoreModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new CompanyCoreInjectionConfig());

    private static CompanyCoreModule INSTANCE;

    public static CompanyCoreModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de company no se ha inicializado");
        }
        return INSTANCE;
    }


    public static CompanyCoreModule init() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new CompanyCoreModule();
        INSTANCE.registerModule(CompanyRepoModule.init());
        return getInstance();
    }

    /**
     * Usar init() sin repo por parametro para usar el repo por defecto
     *
     * @param repoModule
     * @return
     * @deprecated
     */
    @Deprecated
    public static CompanyCoreModule init(AbstractModule repoModule) {
        INSTANCE = new CompanyCoreModule();
        INSTANCE.registerModule(repoModule);
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Company Module";
    }

}
