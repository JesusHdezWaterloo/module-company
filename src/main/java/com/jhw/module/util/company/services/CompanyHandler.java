/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.util.company.services;

import com.jhw.module.util.company.core.domain.CompanyDomain;
import com.jhw.module.util.company.core.module.CompanyCoreModule;
import com.jhw.module.util.company.core.usecase_def.CompanyUseCase;
import com.root101.utils.others.SemanticVersioningModel;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
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
