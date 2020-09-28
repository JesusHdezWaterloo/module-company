package com.jhw.company.core.usecase_def;

import com.clean.core.app.usecase.ReadWriteUseCase;
import com.jhw.company.core.domain.CompanyDomain;

/**
 * Interfaz del caso de uso de la licencia para definir las principales
 * funcionalidades de la licencia
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public interface CompanyUseCase extends ReadWriteUseCase<CompanyDomain> {

    public String getLogoURL() throws Exception;

    public String getName() throws Exception;

    public String getIconURL() throws Exception;

    public String getTitle() throws Exception;

}
