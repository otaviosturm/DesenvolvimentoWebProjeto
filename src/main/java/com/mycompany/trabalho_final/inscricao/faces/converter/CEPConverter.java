package com.mycompany.trabalho_final.inscricao.faces.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Wilson
 */
public class CEPConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return string == null || string.isEmpty() ? null : Integer.valueOf(string.replace("-", ""));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Integer cep = (Integer) o;
        return String.format("%05d-%03d", cep / 1000, cep % 1000);
    }
    
}
