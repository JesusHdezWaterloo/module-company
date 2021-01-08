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
package com.root101.module.util.company.core.domain;

import com.root101.utils.clean.EntityDomainObjectValidated;
import com.root101.utils.others.SemanticVersioningModel;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class CompanyDomain extends EntityDomainObjectValidated {

    @NotEmpty(message = "#msg.company.domain.no_logo#")
    private String logo_URL = "company/logo.png";

    @NotEmpty(message = "#msg.company.domain.no_name#")
    private String name = "company name";

    @NotEmpty(message = "#msg.company.domain.no_title#")
    private String title = "program name";

    @NotEmpty(message = "#msg.company.domain.no_icon#")
    private String icon_URL = "company/icon.png";

    private SemanticVersioningModel version = new SemanticVersioningModel(0, 0, 0);

    public CompanyDomain() {
    }

    public CompanyDomain(String logo_URL, String name, String title, String icon_URL, SemanticVersioningModel version) {
        this.logo_URL = logo_URL;
        this.name = name;
        this.title = title;
        this.icon_URL = icon_URL;
        this.version = version;
    }

    public String getLogo_URL() {
        return logo_URL;
    }

    public void setLogo_URL(String logo_URL) {
        this.logo_URL = logo_URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon_URL() {
        return icon_URL;
    }

    public void setIcon_URL(String icon_URL) {
        this.icon_URL = icon_URL;
    }

    public SemanticVersioningModel getVersion() {
        return version;
    }

    public void setVersion(SemanticVersioningModel version) {
        this.version = version;
    }

}
