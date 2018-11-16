package mx.com.coppel.domain;

import java.io.Serializable;

public class Entrada implements Serializable {
	
	private String estatusSolicitud;
	private String idDecision36;
	private float puntajeCN;
	private Integer BanderaCreditoInicial;
	private float iMinimoCreditoInicial;
	private float iMaximoCreditoInicial;
	private Integer clienteHit;
	private Integer iRangoTestigoParametrico;
	private Integer formaPago;
	private Integer confirmacionTelefonica;
	private Integer iFlagCoppel;
	private float iPuntosTotal;
	private float lPuntuacionAltaAutomatica;
	private float iDisminucionPuntajeAdd;
	private String opc_PresentoCredElect;
	private Integer iNumeroCiudad;
	private Integer numCiudadCredE; 
	private Integer numcolonia;
	private Integer numlColoniaCredE; 
	private Integer numCalle ;
	private Integer numCalleCredE; 
	private Integer numCasa; 
	private Integer numCasaCredE;
	private Integer iTipotelefono; 
	private Integer porcentajeLRC;
	
	public String getEstatusSolicitud() {
		return estatusSolicitud;
	}
	public void setEstatusSolicitud(String estatusSolicitud) {
		this.estatusSolicitud = estatusSolicitud;
	}
	public String getIdDecision36() {
		return idDecision36;
	}
	public void setIdDecision36(String idDecision36) {
		this.idDecision36 = idDecision36;
	}
	public float getPuntajeCN() {
		return puntajeCN;
	}
	public void setPuntajeCN(float puntajeCN) {
		this.puntajeCN = puntajeCN;
	}
	public Integer getBanderaCreditoInicial() {
		return BanderaCreditoInicial;
	}
	public void setBanderaCreditoInicial(Integer banderaCreditoInicial) {
		BanderaCreditoInicial = banderaCreditoInicial;
	}
	public float getiMinimoCreditoInicial() {
		return iMinimoCreditoInicial;
	}
	public void setiMinimoCreditoInicial(float iMinimoCreditoInicial) {
		this.iMinimoCreditoInicial = iMinimoCreditoInicial;
	}
	public float getiMaximoCreditoInicial() {
		return iMaximoCreditoInicial;
	}
	public void setiMaximoCreditoInicial(float iMaximoCreditoInicial) {
		this.iMaximoCreditoInicial = iMaximoCreditoInicial;
	}
	public Integer getClienteHit() {
		return clienteHit;
	}
	public void setClienteHit(Integer clienteHit) {
		this.clienteHit = clienteHit;
	}
	public Integer getiRangoTestigoParametrico() {
		return iRangoTestigoParametrico;
	}
	public void setiRangoTestigoParametrico(Integer iRangoTestigoParametrico) {
		this.iRangoTestigoParametrico = iRangoTestigoParametrico;
	}
	public Integer getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(Integer formaPago) {
		this.formaPago = formaPago;
	}
	public Integer getConfirmacionTelefonica() {
		return confirmacionTelefonica;
	}
	public void setConfirmacionTelefonica(Integer confirmacionTelefonica) {
		this.confirmacionTelefonica = confirmacionTelefonica;
	}
	public Integer getiFlagCoppel() {
		return iFlagCoppel;
	}
	public void setiFlagCoppel(Integer iFlagCoppel) {
		this.iFlagCoppel = iFlagCoppel;
	}
	public float getiPuntosTotal() {
		return iPuntosTotal;
	}
	public void setiPuntosTotal(float iPuntosTotal) {
		this.iPuntosTotal = iPuntosTotal;
	}
	public float getlPuntuacionAltaAutomatica() {
		return lPuntuacionAltaAutomatica;
	}
	public void setlPuntuacionAltaAutomatica(float lPuntuacionAltaAutomatica) {
		this.lPuntuacionAltaAutomatica = lPuntuacionAltaAutomatica;
	}
	public float getiDisminucionPuntajeAdd() {
		return iDisminucionPuntajeAdd;
	}
	public void setiDisminucionPuntajeAdd(float iDisminucionPuntajeAdd) {
		this.iDisminucionPuntajeAdd = iDisminucionPuntajeAdd;
	}
	public String getOpc_PresentoCredElect() {
		return opc_PresentoCredElect;
	}
	public void setOpc_PresentoCredElect(String opc_PresentoCredElect) {
		this.opc_PresentoCredElect = opc_PresentoCredElect;
	}
	public Integer getiNumeroCiudad() {
		return iNumeroCiudad;
	}
	public void setiNumeroCiudad(Integer iNumeroCiudad) {
		this.iNumeroCiudad = iNumeroCiudad;
	}
	public Integer getNumCiudadCredE() {
		return numCiudadCredE;
	}
	public void setNumCiudadCredE(Integer numCiudadCredE) {
		this.numCiudadCredE = numCiudadCredE;
	}
	public Integer getNumcolonia() {
		return numcolonia;
	}
	public void setNumcolonia(Integer numcolonia) {
		this.numcolonia = numcolonia;
	}
	public Integer getNumlColoniaCredE() {
		return numlColoniaCredE;
	}
	public void setNumlColoniaCredE(Integer numlColoniaCredE) {
		this.numlColoniaCredE = numlColoniaCredE;
	}
	public Integer getNumCalle() {
		return numCalle;
	}
	public void setNumCalle(Integer numCalle) {
		this.numCalle = numCalle;
	}
	public Integer getNumCalleCredE() {
		return numCalleCredE;
	}
	public void setNumCalleCredE(Integer numCalleCredE) {
		this.numCalleCredE = numCalleCredE;
	}
	public Integer getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(Integer numCasa) {
		this.numCasa = numCasa;
	}
	public Integer getNumCasaCredE() {
		return numCasaCredE;
	}
	public void setNumCasaCredE(Integer numCasaCredE) {
		this.numCasaCredE = numCasaCredE;
	}
	public Integer getiTipotelefono() {
		return iTipotelefono;
	}
	public void setiTipotelefono(Integer iTipotelefono) {
		this.iTipotelefono = iTipotelefono;
	}
	public Integer getPorcentajeLRC() {
		return porcentajeLRC;
	}
	public void setPorcentajeLRC(Integer porcentajeLRC) {
		this.porcentajeLRC = porcentajeLRC;
	}
	
	public Entrada(String estatusSolicitud, String idDecision36,
			float puntajeCN, Integer banderaCreditoInicial,
			float iMinimoCreditoInicial, float iMaximoCreditoInicial,
			Integer clienteHit, Integer iRangoTestigoParametrico,
			Integer formaPago, Integer confirmacionTelefonica,
			Integer iFlagCoppel, float iPuntosTotal,
			float lPuntuacionAltaAutomatica, float iDisminucionPuntajeAdd,
			String opc_PresentoCredElect, Integer iNumeroCiudad,
			Integer numCiudadCredE, Integer numcolonia,
			Integer numlColoniaCredE, Integer numCalle, Integer numCalleCredE,
			Integer numCasa, Integer numCasaCredE, Integer iTipotelefono,
			Integer porcentajeLRC) {
		super();
		this.estatusSolicitud = estatusSolicitud;
		this.idDecision36 = idDecision36;
		this.puntajeCN = puntajeCN;
		BanderaCreditoInicial = banderaCreditoInicial;
		this.iMinimoCreditoInicial = iMinimoCreditoInicial;
		this.iMaximoCreditoInicial = iMaximoCreditoInicial;
		this.clienteHit = clienteHit;
		this.iRangoTestigoParametrico = iRangoTestigoParametrico;
		this.formaPago = formaPago;
		this.confirmacionTelefonica = confirmacionTelefonica;
		this.iFlagCoppel = iFlagCoppel;
		this.iPuntosTotal = iPuntosTotal;
		this.lPuntuacionAltaAutomatica = lPuntuacionAltaAutomatica;
		this.iDisminucionPuntajeAdd = iDisminucionPuntajeAdd;
		this.opc_PresentoCredElect = opc_PresentoCredElect;
		this.iNumeroCiudad = iNumeroCiudad;
		this.numCiudadCredE = numCiudadCredE;
		this.numcolonia = numcolonia;
		this.numlColoniaCredE = numlColoniaCredE;
		this.numCalle = numCalle;
		this.numCalleCredE = numCalleCredE;
		this.numCasa = numCasa;
		this.numCasaCredE = numCasaCredE;
		this.iTipotelefono = iTipotelefono;
		this.porcentajeLRC = porcentajeLRC;
	}
	
	public Entrada() {
		super();
		this.estatusSolicitud = "";
		this.idDecision36 = "";
		this.puntajeCN = 0f;
		this.BanderaCreditoInicial = 0;
		this.iMinimoCreditoInicial = 0f;
		this.iMaximoCreditoInicial = 0f;
		this.clienteHit = 0;
		this.iRangoTestigoParametrico = 0;
		this.formaPago = 0;
		this.confirmacionTelefonica = 0;
		this.iFlagCoppel = 0;
		this.iPuntosTotal = 0f;
		this.lPuntuacionAltaAutomatica = 0f;
		this.iDisminucionPuntajeAdd = 0f;
		this.opc_PresentoCredElect = "";
		this.iNumeroCiudad = 0;
		this.numCiudadCredE = 0;
		this.numcolonia = 0;
		this.numlColoniaCredE = 0;
		this.numCalle = 0;
		this.numCalleCredE = 0;
		this.numCasa = 0;
		this.numCasaCredE = 0;
		this.iTipotelefono = 0;
		this.porcentajeLRC = 0;
	}
	
	
}
