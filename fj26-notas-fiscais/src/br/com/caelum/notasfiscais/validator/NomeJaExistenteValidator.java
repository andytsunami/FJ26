package br.com.caelum.notasfiscais.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.seam.faces.validation.InputField;

@FacesValidator("nomejaexistente")
public class NomeJaExistenteValidator implements Validator {
	@Inject
	private EntityManager em;
	@Inject
	@InputField
	private String nome;

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		Query q = em
				.createQuery("select count(p) from Produto p where p.nome like :nome");
		q.setParameter("nome", nome);
		Long count = (Long) q.getSingleResult();
		if (count > 0) {
			throw new ValidatorException(new FacesMessage(
					"Nome de produto já existente"));
		}

	}

}
