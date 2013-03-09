package br.com.caelum.notasfiscais.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.caelum.stella.format.CNPJFormatter;

@FacesConverter("cnpj")
public class ConversorCNPJ implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return new CNPJFormatter().unformat(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		return new CNPJFormatter().format(value.toString());
	}

}
