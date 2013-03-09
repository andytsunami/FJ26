package br.com.caelum.notasfiscais.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CicloDeVidaListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent evento) {
		System.out.println("Depois da fase: " + evento.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent evento) {
		System.out.println("Depois da fase: " + evento.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
