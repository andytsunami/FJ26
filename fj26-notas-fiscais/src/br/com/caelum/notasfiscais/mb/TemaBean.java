package br.com.caelum.notasfiscais.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class TemaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1993257154029226476L;
	private String tema = "vader";

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {

		this.tema = tema;
	}

	public List<String> getTemas() {
		return Arrays.asList("aristo", "black-tie", "blitzer", "bluesky",
				"casablanca", "cupertino", "dark-hive", "dot-luv", "eggplant",
				"excite-bike", "flick", "glass-x", "hot-sneaks", "humanity",
				"le-frog", "midnight", "mint-choc", "overcast",
				"pepper-grinder", "redmond", "rocket", "sam", "smoothness",
				"south-street", "start", "sunny", "swanky-purse", "trontastic",
				"ui-darkness", "ui-lightness", "vader");
	}

}
