package com.jhw.company.ui.module;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingMainModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.company.core.module.CompanyCoreModule;
import com.jhw.company.repo.module.CompanyRepoModule;
import com.jhw.company.services.CompanyResourceService;
import com.jhw.company.services.CompanyHandler;
import com.jhw.swing.util.AbstractActionUtils;
import java.net.MalformedURLException;

public class CompanySwingModule implements AbstractSwingMainModule {

    private final CompanyModuleNavigator navigator = new CompanyModuleNavigator();

    private CompanySwingModule() {
    }

    public static CompanySwingModule init() {
        System.out.println("Iniciando 'Company'");
        try {
            CompanyResourceService.init();
        } catch (MalformedURLException ex) {
            ExceptionHandler.handleException(ex);
        }
        CompanyCoreModule.init(CompanyRepoModule.init());
        return new CompanySwingModule();
    }

    @Override
    public void register(AbstractSwingApplication app) {
        registerLicence(app);
    }

    private void registerLicence(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();

        dash.putKeyValue(DashboardConstants.UP_COMPANY,
                AbstractActionUtils.from(CompanyHandler.getCompanyName(), CompanyHandler.getLogo()));

        app.rootView().setIconImage(CompanyHandler.getIcon());
        app.rootView().setTitle(CompanyHandler.getTitle());

    }

    @Override
    public void navigateTo(String string, Object... o) {
        navigator.navigateTo(string, o);
    }

}
