package com.jhw.company.core.domain;

import com.jhw.utils.clean.EntityDomainObjectValidated;
import com.jhw.utils.others.SemanticVersioningModel;
import javax.validation.constraints.NotEmpty;

/**
 * Objeto dominio Company.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class Company extends EntityDomainObjectValidated {

    @NotEmpty(message = "#msg.company.domain.no_logo#")
    private String logo_URL = "company/logo.png";

    @NotEmpty(message = "#msg.company.domain.no_name#")
    private String name = "company name";

    @NotEmpty(message = "#msg.company.domain.no_title#")
    private String title = "program name";

    @NotEmpty(message = "#msg.company.domain.no_icon#")
    private String icon_URL = "company/icon.png";

    private SemanticVersioningModel version = new SemanticVersioningModel(0, 0, 0);

    public Company() {
    }

    public Company(String logo_URL, String name, String title, String icon_URL, SemanticVersioningModel version) {
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
