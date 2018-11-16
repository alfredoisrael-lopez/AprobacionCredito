package mx.com.coppel.domain;

import java.io.Serializable;

public class Salida implements Serializable {
	
	private String estatusSolicitud;
	private String situacionEspecial;
	private String mensajeRechazo;
	private Boolean logroPuntaje;
	private Integer testigoParametrico;
	
	public String getEstatusSolicitud() {
		return estatusSolicitud;
	}
	public void setEstatusSolicitud(String estatusSolicitud) {
		this.estatusSolicitud = estatusSolicitud;
	}
	public String getSituacionEspecial() {
		return situacionEspecial;
	}
	public void setSituacionEspecial(String situacionEspecial) {
		this.situacionEspecial = situacionEspecial;
	}
	public String getMensajeRechazo() {
		return mensajeRechazo;
	}
	public void setMensajeRechazo(String mensajeRechazo) {
		this.mensajeRechazo = mensajeRechazo;
	}
	public Boolean getLogroPuntaje() {
		return logroPuntaje;
	}
	public void setLogroPuntaje(Boolean logroPuntaje) {
		this.logroPuntaje = logroPuntaje;
	}
	public Integer getTestigoParametrico() {
		return testigoParametrico;
	}
	public void setTestigoParametrico(Integer testigoParametrico) {
		this.testigoParametrico = testigoParametrico;
	}
	
	public Salida(String estatusSolicitud, String situacionEspecial,
			String mensajeRechazo, Boolean logroPuntaje,
			Integer testigoParametrico) {
		super();
		this.estatusSolicitud = estatusSolicitud;
		this.situacionEspecial = situacionEspecial;
		this.mensajeRechazo = mensajeRechazo;
		this.logroPuntaje = logroPuntaje;
		this.testigoParametrico = testigoParametrico;
	}
	
	public Salida() {
		super();
		this.estatusSolicitud = "";
		this.situacionEspecial = "";
		this.mensajeRechazo = "";
		this.logroPuntaje = false;
		this.testigoParametrico = 0;
	}


}
