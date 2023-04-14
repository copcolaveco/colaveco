package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesUsuario_Usuario_Section_GeneralSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt>
{
   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt ());
   }

   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("UsuarioId")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid(), 18, 0)) ;
   }

   @JsonProperty("UsuarioId")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioEmail")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail()) ;
   }

   @JsonProperty("UsuarioEmail")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail(Value);
   }


   @JsonProperty("UsuarioUsuarioWeb")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb()) ;
   }

   @JsonProperty("UsuarioUsuarioWeb")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb(Value);
   }


   @JsonProperty("UsuarioNombre")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre()) ;
   }

   @JsonProperty("UsuarioNombre")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre(Value);
   }


   @JsonProperty("UsuarioDicose")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose()) ;
   }

   @JsonProperty("UsuarioDicose")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose(Value);
   }


   @JsonProperty("UsuarioRazonSocial")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial()) ;
   }

   @JsonProperty("UsuarioRazonSocial")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial(Value);
   }


   @JsonProperty("UsuarioRut")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut()) ;
   }

   @JsonProperty("UsuarioRut")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut(Value);
   }


   @JsonProperty("UsuarioIdNet")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdNet")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioDireccion")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion()) ;
   }

   @JsonProperty("UsuarioDireccion")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion(Value);
   }


   @JsonProperty("UsuarioTipousuario")
   public Short getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario( )
   {
      return ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario() ;
   }

   @JsonProperty("UsuarioTipousuario")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario(Value);
   }


   @JsonProperty("UsuarioIdTecnico1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioIdTecnico2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioIdTecnico3")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdTecnico3")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioDireccionFrasco")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco()) ;
   }

   @JsonProperty("UsuarioDireccionFrasco")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco(Value);
   }


   @JsonProperty("UsuarioAgenciaFrasco")
   public Short getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco( )
   {
      return ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco() ;
   }

   @JsonProperty("UsuarioAgenciaFrasco")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco(Value);
   }


   @JsonProperty("UsuarioNotificacionFrasco1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1()) ;
   }

   @JsonProperty("UsuarioNotificacionFrasco1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1(Value);
   }


   @JsonProperty("UsuarioNotificacionFrasco2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2()) ;
   }

   @JsonProperty("UsuarioNotificacionFrasco2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2(Value);
   }


   @JsonProperty("UsuarioNotificacionSolicitud1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1()) ;
   }

   @JsonProperty("UsuarioNotificacionSolicitud1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1(Value);
   }


   @JsonProperty("UsuarioNotificacionSolicitud2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2()) ;
   }

   @JsonProperty("UsuarioNotificacionSolicitud2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2(Value);
   }


   @JsonProperty("UsuarioNotificacionResultado1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1()) ;
   }

   @JsonProperty("UsuarioNotificacionResultado1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1(Value);
   }


   @JsonProperty("UsuarioNotificacionResultado2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2()) ;
   }

   @JsonProperty("UsuarioNotificacionResultado2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2(Value);
   }


   @JsonProperty("UsuarioNotificacionAvisos1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1()) ;
   }

   @JsonProperty("UsuarioNotificacionAvisos1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1(Value);
   }


   @JsonProperty("UsuarioNotificacionAvisos2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2()) ;
   }

   @JsonProperty("UsuarioNotificacionAvisos2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2(Value);
   }


   @JsonProperty("UsuarioTecnicoCelular1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1()) ;
   }

   @JsonProperty("UsuarioTecnicoCelular1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1(Value);
   }


   @JsonProperty("UsuarioTecnicoCelular2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2()) ;
   }

   @JsonProperty("UsuarioTecnicoCelular2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2(Value);
   }


   @JsonProperty("UsuarioTecnicoCelularNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoCelularNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1(Value);
   }


   @JsonProperty("UsuarioTecnicoCelularNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoCelularNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2(Value);
   }


   @JsonProperty("UsuarioTecnicoTelefono1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefono1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1(Value);
   }


   @JsonProperty("UsuarioTecnicoTelefono2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefono2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2(Value);
   }


   @JsonProperty("UsuarioTecnicoTelefonoNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefonoNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1(Value);
   }


   @JsonProperty("UsuarioTecnicoTelefonoNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefonoNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2(Value);
   }


   @JsonProperty("UsuarioTecnicoEmail1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1()) ;
   }

   @JsonProperty("UsuarioTecnicoEmail1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1(Value);
   }


   @JsonProperty("UsuarioTecnicoEmail2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2()) ;
   }

   @JsonProperty("UsuarioTecnicoEmail2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2(Value);
   }


   @JsonProperty("UsuarioTecnicoEmailNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1()) ;
   }

   @JsonProperty("UsuarioTecnicoEmailNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1(Value);
   }


   @JsonProperty("UsuarioTecnicoEmailNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2()) ;
   }

   @JsonProperty("UsuarioTecnicoEmailNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2(Value);
   }


   @JsonProperty("UsuarioRutTipo")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo()) ;
   }

   @JsonProperty("UsuarioRutTipo")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo(Value);
   }


   @JsonProperty("UsuarioFacDireccion")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion()) ;
   }

   @JsonProperty("UsuarioFacDireccion")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion(Value);
   }


   @JsonProperty("UsuarioFacLocalidad")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad()) ;
   }

   @JsonProperty("UsuarioFacLocalidad")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad(Value);
   }


   @JsonProperty("UsuarioFacDepartamento")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento()) ;
   }

   @JsonProperty("UsuarioFacDepartamento")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento(Value);
   }


   @JsonProperty("UsuarioFacEmailEnvio")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio()) ;
   }

   @JsonProperty("UsuarioFacEmailEnvio")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio(Value);
   }


   @JsonProperty("UsuarioCobranzaCelular1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1()) ;
   }

   @JsonProperty("UsuarioCobranzaCelular1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1(Value);
   }


   @JsonProperty("UsuarioCobranzaCelular2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2()) ;
   }

   @JsonProperty("UsuarioCobranzaCelular2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2(Value);
   }


   @JsonProperty("UsuarioCobranzaCelularNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaCelularNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1(Value);
   }


   @JsonProperty("UsuarioCobranzaCelularNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaCelularNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2(Value);
   }


   @JsonProperty("UsuarioCobranzaTelefono1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefono1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1(Value);
   }


   @JsonProperty("UsuarioCobranzaTelefono2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefono2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2(Value);
   }


   @JsonProperty("UsuarioCobranzaTelefonoNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefonoNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1(Value);
   }


   @JsonProperty("UsuarioCobranzaTelefonoNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaTelefonoNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2(Value);
   }


   @JsonProperty("UsuarioCobranzaEmail1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1()) ;
   }

   @JsonProperty("UsuarioCobranzaEmail1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1(Value);
   }


   @JsonProperty("UsuarioCobranzaEmail2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2()) ;
   }

   @JsonProperty("UsuarioCobranzaEmail2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2(Value);
   }


   @JsonProperty("UsuarioCobranzaEmailNombre1")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1()) ;
   }

   @JsonProperty("UsuarioCobranzaEmailNombre1")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1(Value);
   }


   @JsonProperty("UsuarioCobranzaEmailNombre2")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2()) ;
   }

   @JsonProperty("UsuarioCobranzaEmailNombre2")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2(Value);
   }


   @JsonProperty("UsuarioCedula")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula()) ;
   }

   @JsonProperty("UsuarioCedula")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula(Value);
   }


   int remoteHandle = -1;
}

