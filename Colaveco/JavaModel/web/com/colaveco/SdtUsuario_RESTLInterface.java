package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Usuario", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtUsuario_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtUsuario>
{
   public SdtUsuario_RESTLInterface( )
   {
      super(new com.colaveco.SdtUsuario (-1));
   }

   public SdtUsuario_RESTLInterface( com.colaveco.SdtUsuario psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("UsuarioEmail")
   public String getgxTv_SdtUsuario_Usuarioemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarioemail()) ;
   }

   @JsonProperty("UsuarioEmail")
   public void setgxTv_SdtUsuario_Usuarioemail(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioemail(Value);
   }


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
   private boolean n114UsuarioEmail ;
   private boolean n115UsuarioUsuarioWeb ;
   private boolean n116UsuarioNombre ;
   private boolean n117UsuarioDicose ;
   private boolean n118UsuarioRazonSocial ;
   private boolean n119UsuarioRut ;
   private boolean n120UsuarioIdNet ;
   private boolean n121UsuarioDireccion ;
   private boolean n122UsuarioTipousuario ;
   private boolean n123UsuarioIdTecnico1 ;
   private boolean n124UsuarioIdTecnico2 ;
   private boolean n125UsuarioIdTecnico3 ;
   private boolean n126UsuarioDireccionFrasco ;
   private boolean n127UsuarioAgenciaFrasco ;
   private boolean n128UsuarioNotificacionFrasco1 ;
   private boolean n129UsuarioNotificacionFrasco2 ;
   private boolean n130UsuarioNotificacionSolicitud1 ;
   private boolean n131UsuarioNotificacionSolicitud2 ;
   private boolean n132UsuarioNotificacionResultado1 ;
   private boolean n133UsuarioNotificacionResultado2 ;
   private boolean n134UsuarioNotificacionAvisos1 ;
   private boolean n135UsuarioNotificacionAvisos2 ;
   private boolean n136UsuarioTecnicoCelular1 ;
   private boolean n137UsuarioTecnicoCelular2 ;
   private boolean n138UsuarioTecnicoCelularNombre1 ;
   private boolean n139UsuarioTecnicoCelularNombre2 ;
   private boolean n140UsuarioTecnicoTelefono1 ;
   private boolean n141UsuarioTecnicoTelefono2 ;
   private boolean n142UsuarioTecnicoTelefonoNombre1 ;
   private boolean n143UsuarioTecnicoTelefonoNombre2 ;
   private boolean n144UsuarioTecnicoEmail1 ;
   private boolean n145UsuarioTecnicoEmail2 ;
   private boolean n146UsuarioTecnicoEmailNombre1 ;
   private boolean n147UsuarioTecnicoEmailNombre2 ;
   private boolean n148UsuarioRutTipo ;
   private boolean n149UsuarioFacDireccion ;
   private boolean n150UsuarioFacLocalidad ;
   private boolean n151UsuarioFacDepartamento ;
   private boolean n152UsuarioFacEmailEnvio ;
   private boolean n153UsuarioCobranzaCelular1 ;
   private boolean n154UsuarioCobranzaCelular2 ;
   private boolean n155UsuarioCobranzaCelularNombre1 ;
   private boolean n156UsuarioCobranzaCelularNombre2 ;
   private boolean n157UsuarioCobranzaTelefono1 ;
   private boolean n158UsuarioCobranzaTelefono2 ;
   private boolean n159UsuarioCobranzaTelefonoNombre1 ;
   private boolean n160UsuarioCobranzaTelefonoNombre2 ;
   private boolean n161UsuarioCobranzaEmail1 ;
   private boolean n162UsuarioCobranzaEmail2 ;
   private boolean n163UsuarioCobranzaEmailNombre1 ;
   private boolean n164UsuarioCobranzaEmailNombre2 ;
   private boolean n165UsuarioCedula ;
}

