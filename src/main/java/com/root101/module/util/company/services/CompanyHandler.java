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
package com.root101.module.util.company.services;

import com.root101.module.util.company.core.domain.CompanyDomain;
import com.root101.module.util.company.core.module.CompanyCoreModule;
import com.root101.module.util.company.core.usecase_def.CompanyUseCase;
import com.root101.utils.others.SemanticVersioningModel;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class CompanyHandler {

    private static CompanyDomain company;

    static {
        try {
            company = CompanyCoreModule.getInstance().getImplementation(CompanyUseCase.class).read();
        } catch (Exception e) {
            company = new CompanyDomain();
        }
    }

    public static ImageIcon getLogo() {
        return new ImageIcon(company.getLogo_URL());
    }

    public static String getCompanyName() {
        return company.getName();
    }

    public static Image getIcon() {
        return new ImageIcon(company.getIcon_URL()).getImage();
    }

    public static String getTitle() {
        return company.getTitle();
    }

    public static SemanticVersioningModel getVersion() {
        return company.getVersion();
    }
}
