package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Usuario", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtUsuario_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtUsuario>
{
   public SdtUsuario_RESTInterface( )
   {
      super(new com.colaveco.SdtUsuario (-1));
   }

   public SdtUsuario_RESTInterface( com.colaveco.SdtUsuario psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("UsuarioId")
   public String getgxTv_SdtUsuario_Usuarioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtUsuario_Usuarioid(), 18, 0)) ;
   }

   @JsonProperty("UsuarioId")
   public void setgxTv_SdtUsuario_Usuarioid(  String Value )
   {
      sdt.setgxTv_SdtUsuario_Usuarioid( GXutil.lval( Value) );
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


   @GxSeudo
   @JsonProperty("UsuarioUsuarioWeb")
   public String getgxTv_SdtUsuario_Usuariousuarioweb( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariousuarioweb()) ;
   }

   @JsonProperty("UsuarioUsuarioWeb")
   public void setgxTv_SdtUsuario_Usuariousuarioweb(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariousuarioweb(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNombre")
   public String getgxTv_SdtUsuario_Usuarionombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionombre()) ;
   }

   @JsonProperty("UsuarioNombre")
   public void setgxTv_SdtUsuario_Usuarionombre(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionombre(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioDicose")
   public String getgxTv_SdtUsuario_Usuariodicose( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariodicose()) ;
   }

   @JsonProperty("UsuarioDicose")
   public void setgxTv_SdtUsuario_Usuariodicose(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodicose(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioRazonSocial")
   public String getgxTv_SdtUsuario_Usuariorazonsocial( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariorazonsocial()) ;
   }

   @JsonProperty("UsuarioRazonSocial")
   public void setgxTv_SdtUsuario_Usuariorazonsocial(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariorazonsocial(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioRut")
   public String getgxTv_SdtUsuario_Usuariorut( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariorut()) ;
   }

   @JsonProperty("UsuarioRut")
   public void setgxTv_SdtUsuario_Usuariorut(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariorut(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioIdNet")
   public String getgxTv_SdtUsuario_Usuarioidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtUsuario_Usuarioidnet(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdNet")
   public void setgxTv_SdtUsuario_Usuarioidnet(  String Value )
   {
      sdt.setgxTv_SdtUsuario_Usuarioidnet( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("UsuarioDireccion")
   public String getgxTv_SdtUsuario_Usuariodireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariodireccion()) ;
   }

   @JsonProperty("UsuarioDireccion")
   public void setgxTv_SdtUsuario_Usuariodireccion(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodireccion(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTipousuario")
   public Short getgxTv_SdtUsuario_Usuariotipousuario( )
   {
      return ((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotipousuario() ;
   }

   @JsonProperty("UsuarioTipousuario")
   public void setgxTv_SdtUsuario_Usuariotipousuario(  Short Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotipousuario(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioIdTecnico1")
   public String getgxTv_SdtUsuario_Usuarioidtecnico1( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtUsuario_Usuarioidtecnico1(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico1")
   public void setgxTv_SdtUsuario_Usuarioidtecnico1(  String Value )
   {
      sdt.setgxTv_SdtUsuario_Usuarioidtecnico1( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("UsuarioIdTecnico2")
   public String getgxTv_SdtUsuario_Usuarioidtecnico2( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtUsuario_Usuarioidtecnico2(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico2")
   public void setgxTv_SdtUsuario_Usuarioidtecnico2(  String Value )
   {
      sdt.setgxTv_SdtUsuario_Usuarioidtecnico2( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("UsuarioIdTecnico3")
   public String getgxTv_SdtUsuario_Usuarioidtecnico3( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtUsuario_Usuarioidtecnico3(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico3")
   public void setgxTv_SdtUsuario_Usuarioidtecnico3(  String Value )
   {
      sdt.setgxTv_SdtUsuario_Usuarioidtecnico3( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("UsuarioDireccionFrasco")
   public String getgxTv_SdtUsuario_Usuariodireccionfrasco( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariodireccionfrasco()) ;
   }

   @JsonProperty("UsuarioDireccionFrasco")
   public void setgxTv_SdtUsuario_Usuariodireccionfrasco(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodireccionfrasco(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioAgenciaFrasco")
   public Short getgxTv_SdtUsuario_Usuarioagenciafrasco( )
   {
      return ((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarioagenciafrasco() ;
   }

   @JsonProperty("UsuarioAgenciaFrasco")
   public void setgxTv_SdtUsuario_Usuarioagenciafrasco(  Short Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioagenciafrasco(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionFrasco1")
   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionfrasco1()) ;
   }

   @JsonProperty("UsuarioNotificacionFrasco1")
   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionfrasco1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionFrasco2")
   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionfrasco2()) ;
   }

   @JsonProperty("UsuarioNotificacionFrasco2")
   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionfrasco2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionSolicitud1")
   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionsolicitud1()) ;
   }

   @JsonProperty("UsuarioNotificacionSolicitud1")
   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionsolicitud1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionSolicitud2")
   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionsolicitud2()) ;
   }

   @JsonProperty("UsuarioNotificacionSolicitud2")
   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionsolicitud2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionResultado1")
   public String getgxTv_SdtUsuario_Usuarionotificacionresultado1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionresultado1()) ;
   }

   @JsonProperty("UsuarioNotificacionResultado1")
   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionresultado1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionResultado2")
   public String getgxTv_SdtUsuario_Usuarionotificacionresultado2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionresultado2()) ;
   }

   @JsonProperty("UsuarioNotificacionResultado2")
   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionresultado2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionAvisos1")
   public String getgxTv_SdtUsuario_Usuarionotificacionavisos1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionavisos1()) ;
   }

   @JsonProperty("UsuarioNotificacionAvisos1")
   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionavisos1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioNotificacionAvisos2")
   public String getgxTv_SdtUsuario_Usuarionotificacionavisos2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarionotificacionavisos2()) ;
   }

   @JsonProperty("UsuarioNotificacionAvisos2")
   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionavisos2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoCelular1")
   public String getgxTv_SdtUsuario_Usuariotecnicocelular1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicocelular1()) ;
   }

   @JsonProperty("UsuarioTecnicoCelular1")
   public void setgxTv_SdtUsuario_Usuariotecnicocelular1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelular1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoCelular2")
   public String getgxTv_SdtUsuario_Usuariotecnicocelular2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicocelular2()) ;
   }

   @JsonProperty("UsuarioTecnicoCelular2")
   public void setgxTv_SdtUsuario_Usuariotecnicocelular2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelular2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoCelularNombre1")
   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicocelularnombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoCelularNombre1")
   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelularnombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoCelularNombre2")
   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicocelularnombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoCelularNombre2")
   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelularnombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoTelefono1")
   public String getgxTv_SdtUsuario_Usuariotecnicotelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicotelefono1()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefono1")
   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefono1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoTelefono2")
   public String getgxTv_SdtUsuario_Usuariotecnicotelefono2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicotelefono2()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefono2")
   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefono2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoTelefonoNombre1")
   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicotelefononombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefonoNombre1")
   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefononombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoTelefonoNombre2")
   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicotelefononombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefonoNombre2")
   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefononombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoEmail1")
   public String getgxTv_SdtUsuario_Usuariotecnicoemail1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicoemail1()) ;
   }

   @JsonProperty("UsuarioTecnicoEmail1")
   public void setgxTv_SdtUsuario_Usuariotecnicoemail1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemail1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoEmail2")
   public String getgxTv_SdtUsuario_Usuariotecnicoemail2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicoemail2()) ;
   }

   @JsonProperty("UsuarioTecnicoEmail2")
   public void setgxTv_SdtUsuario_Usuariotecnicoemail2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemail2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoEmailNombre1")
   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicoemailnombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoEmailNombre1")
   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemailnombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioTecnicoEmailNombre2")
   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariotecnicoemailnombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoEmailNombre2")
   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemailnombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioRutTipo")
   public String getgxTv_SdtUsuario_Usuarioruttipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuarioruttipo()) ;
   }

   @JsonProperty("UsuarioRutTipo")
   public void setgxTv_SdtUsuario_Usuarioruttipo(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioruttipo(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioFacDireccion")
   public String getgxTv_SdtUsuario_Usuariofacdireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariofacdireccion()) ;
   }

   @JsonProperty("UsuarioFacDireccion")
   public void setgxTv_SdtUsuario_Usuariofacdireccion(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacdireccion(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioFacLocalidad")
   public String getgxTv_SdtUsuario_Usuariofaclocalidad( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariofaclocalidad()) ;
   }

   @JsonProperty("UsuarioFacLocalidad")
   public void setgxTv_SdtUsuario_Usuariofaclocalidad(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofaclocalidad(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioFacDepartamento")
   public String getgxTv_SdtUsuario_Usuariofacdepartamento( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariofacdepartamento()) ;
   }

   @JsonProperty("UsuarioFacDepartamento")
   public void setgxTv_SdtUsuario_Usuariofacdepartamento(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacdepartamento(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioFacEmailEnvio")
   public String getgxTv_SdtUsuario_Usuariofacemailenvio( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariofacemailenvio()) ;
   }

   @JsonProperty("UsuarioFacEmailEnvio")
   public void setgxTv_SdtUsuario_Usuariofacemailenvio(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacemailenvio(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaCelular1")
   public String getgxTv_SdtUsuario_Usuariocobranzacelular1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzacelular1()) ;
   }

   @JsonProperty("UsuarioCobranzaCelular1")
   public void setgxTv_SdtUsuario_Usuariocobranzacelular1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelular1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaCelular2")
   public String getgxTv_SdtUsuario_Usuariocobranzacelular2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzacelular2()) ;
   }

   @JsonProperty("UsuarioCobranzaCelular2")
   public void setgxTv_SdtUsuario_Usuariocobranzacelular2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelular2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaCelularNombre1")
   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzacelularnombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaCelularNombre1")
   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelularnombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaCelularNombre2")
   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzacelularnombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaCelularNombre2")
   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelularnombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaTelefono1")
   public String getgxTv_SdtUsuario_Usuariocobranzatelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzatelefono1()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefono1")
   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefono1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaTelefono2")
   public String getgxTv_SdtUsuario_Usuariocobranzatelefono2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzatelefono2()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefono2")
   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefono2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaTelefonoNombre1")
   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzatelefononombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefonoNombre1")
   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefononombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaTelefonoNombre2")
   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzatelefononombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefonoNombre2")
   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefononombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaEmail1")
   public String getgxTv_SdtUsuario_Usuariocobranzaemail1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzaemail1()) ;
   }

   @JsonProperty("UsuarioCobranzaEmail1")
   public void setgxTv_SdtUsuario_Usuariocobranzaemail1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemail1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaEmail2")
   public String getgxTv_SdtUsuario_Usuariocobranzaemail2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzaemail2()) ;
   }

   @JsonProperty("UsuarioCobranzaEmail2")
   public void setgxTv_SdtUsuario_Usuariocobranzaemail2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemail2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaEmailNombre1")
   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzaemailnombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaEmailNombre1")
   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemailnombre1(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCobranzaEmailNombre2")
   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocobranzaemailnombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaEmailNombre2")
   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemailnombre2(Value);
   }


   @GxSeudo
   @JsonProperty("UsuarioCedula")
   public String getgxTv_SdtUsuario_Usuariocedula( )
   {
      return GXutil.rtrim(((com.colaveco.SdtUsuario)getSdt()).getgxTv_SdtUsuario_Usuariocedula()) ;
   }

   @JsonProperty("UsuarioCedula")
   public void setgxTv_SdtUsuario_Usuariocedula(  String Value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocedula(Value);
   }


   public void copyFrom( com.colaveco.SdtUsuario_RESTInterface value )
   {
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioid(((com.colaveco.SdtUsuario)value.getSdt()).getgxTv_SdtUsuario_Usuarioid());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioemail(value.getgxTv_SdtUsuario_Usuarioemail());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariousuarioweb(value.getgxTv_SdtUsuario_Usuariousuarioweb());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionombre(value.getgxTv_SdtUsuario_Usuarionombre());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodicose(value.getgxTv_SdtUsuario_Usuariodicose());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariorazonsocial(value.getgxTv_SdtUsuario_Usuariorazonsocial());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariorut(value.getgxTv_SdtUsuario_Usuariorut());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioidnet(((com.colaveco.SdtUsuario)value.getSdt()).getgxTv_SdtUsuario_Usuarioidnet());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodireccion(value.getgxTv_SdtUsuario_Usuariodireccion());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotipousuario(value.getgxTv_SdtUsuario_Usuariotipousuario());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioidtecnico1(((com.colaveco.SdtUsuario)value.getSdt()).getgxTv_SdtUsuario_Usuarioidtecnico1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioidtecnico2(((com.colaveco.SdtUsuario)value.getSdt()).getgxTv_SdtUsuario_Usuarioidtecnico2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioidtecnico3(((com.colaveco.SdtUsuario)value.getSdt()).getgxTv_SdtUsuario_Usuarioidtecnico3());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariodireccionfrasco(value.getgxTv_SdtUsuario_Usuariodireccionfrasco());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioagenciafrasco(value.getgxTv_SdtUsuario_Usuarioagenciafrasco());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionfrasco1(value.getgxTv_SdtUsuario_Usuarionotificacionfrasco1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionfrasco2(value.getgxTv_SdtUsuario_Usuarionotificacionfrasco2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionsolicitud1(value.getgxTv_SdtUsuario_Usuarionotificacionsolicitud1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionsolicitud2(value.getgxTv_SdtUsuario_Usuarionotificacionsolicitud2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionresultado1(value.getgxTv_SdtUsuario_Usuarionotificacionresultado1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionresultado2(value.getgxTv_SdtUsuario_Usuarionotificacionresultado2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionavisos1(value.getgxTv_SdtUsuario_Usuarionotificacionavisos1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarionotificacionavisos2(value.getgxTv_SdtUsuario_Usuarionotificacionavisos2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelular1(value.getgxTv_SdtUsuario_Usuariotecnicocelular1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelular2(value.getgxTv_SdtUsuario_Usuariotecnicocelular2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelularnombre1(value.getgxTv_SdtUsuario_Usuariotecnicocelularnombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicocelularnombre2(value.getgxTv_SdtUsuario_Usuariotecnicocelularnombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefono1(value.getgxTv_SdtUsuario_Usuariotecnicotelefono1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefono2(value.getgxTv_SdtUsuario_Usuariotecnicotelefono2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefononombre1(value.getgxTv_SdtUsuario_Usuariotecnicotelefononombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicotelefononombre2(value.getgxTv_SdtUsuario_Usuariotecnicotelefononombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemail1(value.getgxTv_SdtUsuario_Usuariotecnicoemail1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemail2(value.getgxTv_SdtUsuario_Usuariotecnicoemail2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemailnombre1(value.getgxTv_SdtUsuario_Usuariotecnicoemailnombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariotecnicoemailnombre2(value.getgxTv_SdtUsuario_Usuariotecnicoemailnombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuarioruttipo(value.getgxTv_SdtUsuario_Usuarioruttipo());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacdireccion(value.getgxTv_SdtUsuario_Usuariofacdireccion());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofaclocalidad(value.getgxTv_SdtUsuario_Usuariofaclocalidad());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacdepartamento(value.getgxTv_SdtUsuario_Usuariofacdepartamento());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariofacemailenvio(value.getgxTv_SdtUsuario_Usuariofacemailenvio());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelular1(value.getgxTv_SdtUsuario_Usuariocobranzacelular1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelular2(value.getgxTv_SdtUsuario_Usuariocobranzacelular2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelularnombre1(value.getgxTv_SdtUsuario_Usuariocobranzacelularnombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzacelularnombre2(value.getgxTv_SdtUsuario_Usuariocobranzacelularnombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefono1(value.getgxTv_SdtUsuario_Usuariocobranzatelefono1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefono2(value.getgxTv_SdtUsuario_Usuariocobranzatelefono2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefononombre1(value.getgxTv_SdtUsuario_Usuariocobranzatelefononombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzatelefononombre2(value.getgxTv_SdtUsuario_Usuariocobranzatelefononombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemail1(value.getgxTv_SdtUsuario_Usuariocobranzaemail1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemail2(value.getgxTv_SdtUsuario_Usuariocobranzaemail2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemailnombre1(value.getgxTv_SdtUsuario_Usuariocobranzaemailnombre1());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocobranzaemailnombre2(value.getgxTv_SdtUsuario_Usuariocobranzaemailnombre2());
      ((com.colaveco.SdtUsuario)getSdt()).setgxTv_SdtUsuario_Usuariocedula(value.getgxTv_SdtUsuario_Usuariocedula());
   }

   @JsonProperty("gx_md5_hash")
   public String getHash( )
   {
      if ( GXutil.strcmp(md5Hash, null) == 0 )
      {
         md5Hash = super.getHash() ;
      }
      return md5Hash ;
   }

   @JsonProperty("gx_md5_hash")
   public void setHash(  String Value )
   {
      md5Hash = Value ;
   }


   private String md5Hash ;
}

