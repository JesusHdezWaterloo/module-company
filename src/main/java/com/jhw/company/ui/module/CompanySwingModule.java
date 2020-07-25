package com.jhw.company.ui.module;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingMainModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.company.core.module.CompanyCoreModule;
import com.jhw.company.repo.module.CompanyRepoModule;
import com.jhw.company.services.CompanyResourceService;
import com.jhw.company.ui.utils.UIUtils;
import com.jhw.swing.util.AbstractActionUtils;
import java.net.MalformedURLException;

public class CompanySwingModule implements AbstractSwingMainModule {

    private final CompanyModuleNavigator navigator = new CompanyModuleNavigator();

    public CompanySwingModule() {
        init();
    }

    private void init() {
        System.out.println("Creando 'Company'");
        try {
            CompanyResourceService.init();
        } catch (MalformedURLException ex) {
            ExceptionHandler.handleException(ex);
        }
        CompanyCoreModule.init(CompanyRepoModule.init());
    }

    @Override
    public void register(AbstractSwingApplication app) {
        registerLicence(app);
    }

    private void registerLicence(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();

        dash.putKeyValue(DashboardConstants.UP_COMPANY,
                AbstractActionUtils.from(UIUtils.getCompanyName(), UIUtils.getLogo()));

        app.rootView().setIconImage(UIUtils.getIcon());
        app.rootView().setTitle(UIUtils.getTitle());

    }

    @Override
    public void navigateTo(String string, Object... o) {
        navigator.navigateTo(string, o);
    }

}
