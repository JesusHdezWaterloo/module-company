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
package com.root101.module.util.company.core.usecase_impl;

import com.root101.clean.core.app.usecase.DefaultReadWriteUseCase;
import com.root101.module.util.company.core.domain.CompanyDomain;
import com.root101.module.util.company.core.module.CompanyCoreModule;
import com.root101.module.util.company.core.repo_def.CompanyRepo;
import com.root101.module.util.company.core.usecase_def.CompanyUseCase;
import javax.inject.Inject;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
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
