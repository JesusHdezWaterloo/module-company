/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.util.company.ui.module;

import com.root101.clean.core.app.services.ExceptionHandler;
import com.root101.clean.swing.app.AbstractSwingApplication;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;
import com.root101.clean.swing.app.dashboard.DashBoardSimple;
import com.root101.clean.swing.app.dashboard.DashboardConstants;
import com.root101.module.util.company.core.module.CompanyCoreModule;
import com.root101.module.util.company.repo.module.CompanyRepoModule;
import com.root101.module.util.company.services.CompanyResourceService;
import com.root101.module.util.company.services.CompanyHandler;
import com.root101.swing.util.AbstractActionUtils;
import java.net.MalformedURLException;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class CompanySwingModule extends DefaultAbstractSwingMainModule {

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
