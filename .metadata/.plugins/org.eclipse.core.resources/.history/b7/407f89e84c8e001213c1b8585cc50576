package br.com.caelum.notasfiscais.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.notasfiscais.dao.UsuarioDAO;
import br.com.caelum.notasfiscais.modelo.Usuario;
import br.com.caelum.notasfiscais.validator.UsuarioLogado;

@Named
@RequestScoped
public class LoginBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1324074040336058951L;
	private Usuario usuario = new Usuario();

	@Inject
	private UsuarioLogado usuarioLogado;

	@Inject
	private UsuarioDAO dao;

	public String efetuaLogin() {
		boolean loginValido = dao.existe(this.usuario);
		if (loginValido) {
			usuarioLogado.setUsuario(usuario);
			return "produto?faces-redirect=true";
		} else {
			usuarioLogado.setUsuario(null);
			return "login";

		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isLogado() {
		return usuarioLogado.isLogado();
	}

	public String efetuaLogout() {

		usuarioLogado.setUsuario(null);
		return "login?faces-redirect=true";

	}

}
