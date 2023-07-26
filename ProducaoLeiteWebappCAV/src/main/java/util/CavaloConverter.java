package util;

import controle.DaoCavalo;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import modelo.Cavalo;



@FacesConverter(value = "CavaloConverter")
public class CavaloConverter implements Converter {
    
@Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String nome) {
        Cavalo temp = null;
        DaoCavalo dao = new DaoCavalo();
        try {
            temp = dao.buscarPorNome(nome);
	} catch (Exception e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro","Selecione um Cavalo"));
	}
 	return temp;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj instanceof Cavalo){
            Cavalo v = (Cavalo)obj;
            return v.getNome();
        }
        return "";
    }
    
}