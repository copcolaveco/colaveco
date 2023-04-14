package com.colaveco ;
import com.genexus.*;

public final  class StructSdtUsuario implements Cloneable, java.io.Serializable
{
   public StructSdtUsuario( )
   {
      this( -1, new ModelContext( StructSdtUsuario.class ));
   }

   public StructSdtUsuario( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtUsuario_Usuarioemail = "" ;
      gxTv_SdtUsuario_Usuariousuarioweb = "" ;
      gxTv_SdtUsuario_Usuarionombre = "" ;
      gxTv_SdtUsuario_Usuariodicose = "" ;
      gxTv_SdtUsuario_Usuariorazonsocial = "" ;
      gxTv_SdtUsuario_Usuariorut = "" ;
      gxTv_SdtUsuario_Usuariodireccion = "" ;
      gxTv_SdtUsuario_Usuariodireccionfrasco = "" ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1 = "" ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelular1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelular2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemail1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemail2 = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = "" ;
      gxTv_SdtUsuario_Usuarioruttipo = "" ;
      gxTv_SdtUsuario_Usuariofacdireccion = "" ;
      gxTv_SdtUsuario_Usuariofaclocalidad = "" ;
      gxTv_SdtUsuario_Usuariofacdepartamento = "" ;
      gxTv_SdtUsuario_Usuariofacemailenvio = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelular1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelular2 = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2 = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemail1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemail2 = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = "" ;
      gxTv_SdtUsuario_Usuariocedula = "" ;
      gxTv_SdtUsuario_Mode = "" ;
      gxTv_SdtUsuario_Usuarioemail_Z = "" ;
      gxTv_SdtUsuario_Usuariousuarioweb_Z = "" ;
      gxTv_SdtUsuario_Usuarionombre_Z = "" ;
      gxTv_SdtUsuario_Usuariodicose_Z = "" ;
      gxTv_SdtUsuario_Usuariorazonsocial_Z = "" ;
      gxTv_SdtUsuario_Usuariorut_Z = "" ;
      gxTv_SdtUsuario_Usuariodireccion_Z = "" ;
      gxTv_SdtUsuario_Usuariodireccionfrasco_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1_Z = "" ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelular1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelular2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemail1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemail2_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z = "" ;
      gxTv_SdtUsuario_Usuarioruttipo_Z = "" ;
      gxTv_SdtUsuario_Usuariofacdireccion_Z = "" ;
      gxTv_SdtUsuario_Usuariofaclocalidad_Z = "" ;
      gxTv_SdtUsuario_Usuariofacdepartamento_Z = "" ;
      gxTv_SdtUsuario_Usuariofacemailenvio_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelular1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelular2_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemail1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemail2_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z = "" ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z = "" ;
      gxTv_SdtUsuario_Usuariocedula_Z = "" ;
      gxTv_SdtUsuario_Usuarioemail_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionombre_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodicose_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariorut_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidnet_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodireccion_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocedula_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public long getUsuarioid( )
   {
      return gxTv_SdtUsuario_Usuarioid ;
   }

   public void setUsuarioid( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioid = value ;
   }

   public String getUsuarioemail( )
   {
      return gxTv_SdtUsuario_Usuarioemail ;
   }

   public void setUsuarioemail( String value )
   {
      gxTv_SdtUsuario_Usuarioemail_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioemail = value ;
   }

   public String getUsuariousuarioweb( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb ;
   }

   public void setUsuariousuarioweb( String value )
   {
      gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariousuarioweb = value ;
   }

   public String getUsuarionombre( )
   {
      return gxTv_SdtUsuario_Usuarionombre ;
   }

   public void setUsuarionombre( String value )
   {
      gxTv_SdtUsuario_Usuarionombre_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionombre = value ;
   }

   public String getUsuariodicose( )
   {
      return gxTv_SdtUsuario_Usuariodicose ;
   }

   public void setUsuariodicose( String value )
   {
      gxTv_SdtUsuario_Usuariodicose_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodicose = value ;
   }

   public String getUsuariorazonsocial( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial ;
   }

   public void setUsuariorazonsocial( String value )
   {
      gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorazonsocial = value ;
   }

   public String getUsuariorut( )
   {
      return gxTv_SdtUsuario_Usuariorut ;
   }

   public void setUsuariorut( String value )
   {
      gxTv_SdtUsuario_Usuariorut_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorut = value ;
   }

   public long getUsuarioidnet( )
   {
      return gxTv_SdtUsuario_Usuarioidnet ;
   }

   public void setUsuarioidnet( long value )
   {
      gxTv_SdtUsuario_Usuarioidnet_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidnet = value ;
   }

   public String getUsuariodireccion( )
   {
      return gxTv_SdtUsuario_Usuariodireccion ;
   }

   public void setUsuariodireccion( String value )
   {
      gxTv_SdtUsuario_Usuariodireccion_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccion = value ;
   }

   public short getUsuariotipousuario( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario ;
   }

   public void setUsuariotipousuario( short value )
   {
      gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotipousuario = value ;
   }

   public long getUsuarioidtecnico1( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1 ;
   }

   public void setUsuarioidtecnico1( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico1 = value ;
   }

   public long getUsuarioidtecnico2( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2 ;
   }

   public void setUsuarioidtecnico2( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico2 = value ;
   }

   public long getUsuarioidtecnico3( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3 ;
   }

   public void setUsuarioidtecnico3( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico3 = value ;
   }

   public String getUsuariodireccionfrasco( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco ;
   }

   public void setUsuariodireccionfrasco( String value )
   {
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccionfrasco = value ;
   }

   public short getUsuarioagenciafrasco( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco ;
   }

   public void setUsuarioagenciafrasco( short value )
   {
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioagenciafrasco = value ;
   }

   public String getUsuarionotificacionfrasco1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1 ;
   }

   public void setUsuarionotificacionfrasco1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1 = value ;
   }

   public String getUsuarionotificacionfrasco2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2 ;
   }

   public void setUsuarionotificacionfrasco2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2 = value ;
   }

   public String getUsuarionotificacionsolicitud1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1 ;
   }

   public void setUsuarionotificacionsolicitud1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = value ;
   }

   public String getUsuarionotificacionsolicitud2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2 ;
   }

   public void setUsuarionotificacionsolicitud2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = value ;
   }

   public String getUsuarionotificacionresultado1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1 ;
   }

   public void setUsuarionotificacionresultado1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1 = value ;
   }

   public String getUsuarionotificacionresultado2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2 ;
   }

   public void setUsuarionotificacionresultado2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2 = value ;
   }

   public String getUsuarionotificacionavisos1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1 ;
   }

   public void setUsuarionotificacionavisos1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1 = value ;
   }

   public String getUsuarionotificacionavisos2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2 ;
   }

   public void setUsuarionotificacionavisos2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2 = value ;
   }

   public String getUsuariotecnicocelular1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1 ;
   }

   public void setUsuariotecnicocelular1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular1 = value ;
   }

   public String getUsuariotecnicocelular2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2 ;
   }

   public void setUsuariotecnicocelular2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular2 = value ;
   }

   public String getUsuariotecnicocelularnombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1 ;
   }

   public void setUsuariotecnicocelularnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = value ;
   }

   public String getUsuariotecnicocelularnombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2 ;
   }

   public void setUsuariotecnicocelularnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = value ;
   }

   public String getUsuariotecnicotelefono1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1 ;
   }

   public void setUsuariotecnicotelefono1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1 = value ;
   }

   public String getUsuariotecnicotelefono2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2 ;
   }

   public void setUsuariotecnicotelefono2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2 = value ;
   }

   public String getUsuariotecnicotelefononombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1 ;
   }

   public void setUsuariotecnicotelefononombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = value ;
   }

   public String getUsuariotecnicotelefononombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2 ;
   }

   public void setUsuariotecnicotelefononombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = value ;
   }

   public String getUsuariotecnicoemail1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1 ;
   }

   public void setUsuariotecnicoemail1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail1 = value ;
   }

   public String getUsuariotecnicoemail2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2 ;
   }

   public void setUsuariotecnicoemail2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail2 = value ;
   }

   public String getUsuariotecnicoemailnombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1 ;
   }

   public void setUsuariotecnicoemailnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = value ;
   }

   public String getUsuariotecnicoemailnombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2 ;
   }

   public void setUsuariotecnicoemailnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = value ;
   }

   public String getUsuarioruttipo( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo ;
   }

   public void setUsuarioruttipo( String value )
   {
      gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioruttipo = value ;
   }

   public String getUsuariofacdireccion( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion ;
   }

   public void setUsuariofacdireccion( String value )
   {
      gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdireccion = value ;
   }

   public String getUsuariofaclocalidad( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad ;
   }

   public void setUsuariofaclocalidad( String value )
   {
      gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofaclocalidad = value ;
   }

   public String getUsuariofacdepartamento( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento ;
   }

   public void setUsuariofacdepartamento( String value )
   {
      gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdepartamento = value ;
   }

   public String getUsuariofacemailenvio( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio ;
   }

   public void setUsuariofacemailenvio( String value )
   {
      gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacemailenvio = value ;
   }

   public String getUsuariocobranzacelular1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1 ;
   }

   public void setUsuariocobranzacelular1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular1 = value ;
   }

   public String getUsuariocobranzacelular2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2 ;
   }

   public void setUsuariocobranzacelular2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular2 = value ;
   }

   public String getUsuariocobranzacelularnombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1 ;
   }

   public void setUsuariocobranzacelularnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = value ;
   }

   public String getUsuariocobranzacelularnombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2 ;
   }

   public void setUsuariocobranzacelularnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = value ;
   }

   public String getUsuariocobranzatelefono1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1 ;
   }

   public void setUsuariocobranzatelefono1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1 = value ;
   }

   public String getUsuariocobranzatelefono2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2 ;
   }

   public void setUsuariocobranzatelefono2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2 = value ;
   }

   public String getUsuariocobranzatelefononombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1 ;
   }

   public void setUsuariocobranzatelefononombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = value ;
   }

   public String getUsuariocobranzatelefononombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2 ;
   }

   public void setUsuariocobranzatelefononombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = value ;
   }

   public String getUsuariocobranzaemail1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1 ;
   }

   public void setUsuariocobranzaemail1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail1 = value ;
   }

   public String getUsuariocobranzaemail2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2 ;
   }

   public void setUsuariocobranzaemail2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail2 = value ;
   }

   public String getUsuariocobranzaemailnombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1 ;
   }

   public void setUsuariocobranzaemailnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = value ;
   }

   public String getUsuariocobranzaemailnombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2 ;
   }

   public void setUsuariocobranzaemailnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = value ;
   }

   public String getUsuariocedula( )
   {
      return gxTv_SdtUsuario_Usuariocedula ;
   }

   public void setUsuariocedula( String value )
   {
      gxTv_SdtUsuario_Usuariocedula_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocedula = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtUsuario_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtUsuario_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Initialized = value ;
   }

   public long getUsuarioid_Z( )
   {
      return gxTv_SdtUsuario_Usuarioid_Z ;
   }

   public void setUsuarioid_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioid_Z = value ;
   }

   public String getUsuarioemail_Z( )
   {
      return gxTv_SdtUsuario_Usuarioemail_Z ;
   }

   public void setUsuarioemail_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioemail_Z = value ;
   }

   public String getUsuariousuarioweb_Z( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb_Z ;
   }

   public void setUsuariousuarioweb_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariousuarioweb_Z = value ;
   }

   public String getUsuarionombre_Z( )
   {
      return gxTv_SdtUsuario_Usuarionombre_Z ;
   }

   public void setUsuarionombre_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionombre_Z = value ;
   }

   public String getUsuariodicose_Z( )
   {
      return gxTv_SdtUsuario_Usuariodicose_Z ;
   }

   public void setUsuariodicose_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodicose_Z = value ;
   }

   public String getUsuariorazonsocial_Z( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial_Z ;
   }

   public void setUsuariorazonsocial_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorazonsocial_Z = value ;
   }

   public String getUsuariorut_Z( )
   {
      return gxTv_SdtUsuario_Usuariorut_Z ;
   }

   public void setUsuariorut_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorut_Z = value ;
   }

   public long getUsuarioidnet_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidnet_Z ;
   }

   public void setUsuarioidnet_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidnet_Z = value ;
   }

   public String getUsuariodireccion_Z( )
   {
      return gxTv_SdtUsuario_Usuariodireccion_Z ;
   }

   public void setUsuariodireccion_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccion_Z = value ;
   }

   public short getUsuariotipousuario_Z( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario_Z ;
   }

   public void setUsuariotipousuario_Z( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotipousuario_Z = value ;
   }

   public long getUsuarioidtecnico1_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1_Z ;
   }

   public void setUsuarioidtecnico1_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico1_Z = value ;
   }

   public long getUsuarioidtecnico2_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2_Z ;
   }

   public void setUsuarioidtecnico2_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico2_Z = value ;
   }

   public long getUsuarioidtecnico3_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3_Z ;
   }

   public void setUsuarioidtecnico3_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico3_Z = value ;
   }

   public String getUsuariodireccionfrasco_Z( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco_Z ;
   }

   public void setUsuariodireccionfrasco_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccionfrasco_Z = value ;
   }

   public short getUsuarioagenciafrasco_Z( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco_Z ;
   }

   public void setUsuarioagenciafrasco_Z( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioagenciafrasco_Z = value ;
   }

   public String getUsuarionotificacionfrasco1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z ;
   }

   public void setUsuarionotificacionfrasco1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z = value ;
   }

   public String getUsuarionotificacionfrasco2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z ;
   }

   public void setUsuarionotificacionfrasco2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z = value ;
   }

   public String getUsuarionotificacionsolicitud1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z ;
   }

   public void setUsuarionotificacionsolicitud1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z = value ;
   }

   public String getUsuarionotificacionsolicitud2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z ;
   }

   public void setUsuarionotificacionsolicitud2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z = value ;
   }

   public String getUsuarionotificacionresultado1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1_Z ;
   }

   public void setUsuarionotificacionresultado1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1_Z = value ;
   }

   public String getUsuarionotificacionresultado2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2_Z ;
   }

   public void setUsuarionotificacionresultado2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2_Z = value ;
   }

   public String getUsuarionotificacionavisos1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1_Z ;
   }

   public void setUsuarionotificacionavisos1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1_Z = value ;
   }

   public String getUsuarionotificacionavisos2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2_Z ;
   }

   public void setUsuarionotificacionavisos2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2_Z = value ;
   }

   public String getUsuariotecnicocelular1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1_Z ;
   }

   public void setUsuariotecnicocelular1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular1_Z = value ;
   }

   public String getUsuariotecnicocelular2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2_Z ;
   }

   public void setUsuariotecnicocelular2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular2_Z = value ;
   }

   public String getUsuariotecnicocelularnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z ;
   }

   public void setUsuariotecnicocelularnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z = value ;
   }

   public String getUsuariotecnicocelularnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z ;
   }

   public void setUsuariotecnicocelularnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z = value ;
   }

   public String getUsuariotecnicotelefono1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1_Z ;
   }

   public void setUsuariotecnicotelefono1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1_Z = value ;
   }

   public String getUsuariotecnicotelefono2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2_Z ;
   }

   public void setUsuariotecnicotelefono2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2_Z = value ;
   }

   public String getUsuariotecnicotelefononombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z ;
   }

   public void setUsuariotecnicotelefononombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z = value ;
   }

   public String getUsuariotecnicotelefononombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z ;
   }

   public void setUsuariotecnicotelefononombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z = value ;
   }

   public String getUsuariotecnicoemail1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1_Z ;
   }

   public void setUsuariotecnicoemail1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail1_Z = value ;
   }

   public String getUsuariotecnicoemail2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2_Z ;
   }

   public void setUsuariotecnicoemail2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail2_Z = value ;
   }

   public String getUsuariotecnicoemailnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z ;
   }

   public void setUsuariotecnicoemailnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z = value ;
   }

   public String getUsuariotecnicoemailnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z ;
   }

   public void setUsuariotecnicoemailnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z = value ;
   }

   public String getUsuarioruttipo_Z( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo_Z ;
   }

   public void setUsuarioruttipo_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioruttipo_Z = value ;
   }

   public String getUsuariofacdireccion_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion_Z ;
   }

   public void setUsuariofacdireccion_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdireccion_Z = value ;
   }

   public String getUsuariofaclocalidad_Z( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad_Z ;
   }

   public void setUsuariofaclocalidad_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofaclocalidad_Z = value ;
   }

   public String getUsuariofacdepartamento_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento_Z ;
   }

   public void setUsuariofacdepartamento_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdepartamento_Z = value ;
   }

   public String getUsuariofacemailenvio_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio_Z ;
   }

   public void setUsuariofacemailenvio_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacemailenvio_Z = value ;
   }

   public String getUsuariocobranzacelular1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1_Z ;
   }

   public void setUsuariocobranzacelular1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular1_Z = value ;
   }

   public String getUsuariocobranzacelular2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2_Z ;
   }

   public void setUsuariocobranzacelular2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular2_Z = value ;
   }

   public String getUsuariocobranzacelularnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z ;
   }

   public void setUsuariocobranzacelularnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z = value ;
   }

   public String getUsuariocobranzacelularnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z ;
   }

   public void setUsuariocobranzacelularnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z = value ;
   }

   public String getUsuariocobranzatelefono1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1_Z ;
   }

   public void setUsuariocobranzatelefono1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1_Z = value ;
   }

   public String getUsuariocobranzatelefono2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2_Z ;
   }

   public void setUsuariocobranzatelefono2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2_Z = value ;
   }

   public String getUsuariocobranzatelefononombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z ;
   }

   public void setUsuariocobranzatelefononombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z = value ;
   }

   public String getUsuariocobranzatelefononombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z ;
   }

   public void setUsuariocobranzatelefononombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z = value ;
   }

   public String getUsuariocobranzaemail1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1_Z ;
   }

   public void setUsuariocobranzaemail1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail1_Z = value ;
   }

   public String getUsuariocobranzaemail2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2_Z ;
   }

   public void setUsuariocobranzaemail2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail2_Z = value ;
   }

   public String getUsuariocobranzaemailnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z ;
   }

   public void setUsuariocobranzaemailnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z = value ;
   }

   public String getUsuariocobranzaemailnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z ;
   }

   public void setUsuariocobranzaemailnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z = value ;
   }

   public String getUsuariocedula_Z( )
   {
      return gxTv_SdtUsuario_Usuariocedula_Z ;
   }

   public void setUsuariocedula_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocedula_Z = value ;
   }

   public byte getUsuarioemail_N( )
   {
      return gxTv_SdtUsuario_Usuarioemail_N ;
   }

   public void setUsuarioemail_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioemail_N = value ;
   }

   public byte getUsuariousuarioweb_N( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb_N ;
   }

   public void setUsuariousuarioweb_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariousuarioweb_N = value ;
   }

   public byte getUsuarionombre_N( )
   {
      return gxTv_SdtUsuario_Usuarionombre_N ;
   }

   public void setUsuarionombre_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionombre_N = value ;
   }

   public byte getUsuariodicose_N( )
   {
      return gxTv_SdtUsuario_Usuariodicose_N ;
   }

   public void setUsuariodicose_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodicose_N = value ;
   }

   public byte getUsuariorazonsocial_N( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial_N ;
   }

   public void setUsuariorazonsocial_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorazonsocial_N = value ;
   }

   public byte getUsuariorut_N( )
   {
      return gxTv_SdtUsuario_Usuariorut_N ;
   }

   public void setUsuariorut_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariorut_N = value ;
   }

   public byte getUsuarioidnet_N( )
   {
      return gxTv_SdtUsuario_Usuarioidnet_N ;
   }

   public void setUsuarioidnet_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidnet_N = value ;
   }

   public byte getUsuariodireccion_N( )
   {
      return gxTv_SdtUsuario_Usuariodireccion_N ;
   }

   public void setUsuariodireccion_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccion_N = value ;
   }

   public byte getUsuariotipousuario_N( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario_N ;
   }

   public void setUsuariotipousuario_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotipousuario_N = value ;
   }

   public byte getUsuarioidtecnico1_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1_N ;
   }

   public void setUsuarioidtecnico1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico1_N = value ;
   }

   public byte getUsuarioidtecnico2_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2_N ;
   }

   public void setUsuarioidtecnico2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico2_N = value ;
   }

   public byte getUsuarioidtecnico3_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3_N ;
   }

   public void setUsuarioidtecnico3_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioidtecnico3_N = value ;
   }

   public byte getUsuariodireccionfrasco_N( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco_N ;
   }

   public void setUsuariodireccionfrasco_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = value ;
   }

   public byte getUsuarioagenciafrasco_N( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco_N ;
   }

   public void setUsuarioagenciafrasco_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = value ;
   }

   public byte getUsuarionotificacionfrasco1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1_N ;
   }

   public void setUsuarionotificacionfrasco1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = value ;
   }

   public byte getUsuarionotificacionfrasco2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2_N ;
   }

   public void setUsuarionotificacionfrasco2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = value ;
   }

   public byte getUsuarionotificacionsolicitud1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N ;
   }

   public void setUsuarionotificacionsolicitud1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = value ;
   }

   public byte getUsuarionotificacionsolicitud2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N ;
   }

   public void setUsuarionotificacionsolicitud2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = value ;
   }

   public byte getUsuarionotificacionresultado1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1_N ;
   }

   public void setUsuarionotificacionresultado1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = value ;
   }

   public byte getUsuarionotificacionresultado2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2_N ;
   }

   public void setUsuarionotificacionresultado2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = value ;
   }

   public byte getUsuarionotificacionavisos1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1_N ;
   }

   public void setUsuarionotificacionavisos1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = value ;
   }

   public byte getUsuarionotificacionavisos2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2_N ;
   }

   public void setUsuarionotificacionavisos2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = value ;
   }

   public byte getUsuariotecnicocelular1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1_N ;
   }

   public void setUsuariotecnicocelular1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = value ;
   }

   public byte getUsuariotecnicocelular2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2_N ;
   }

   public void setUsuariotecnicocelular2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = value ;
   }

   public byte getUsuariotecnicocelularnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N ;
   }

   public void setUsuariotecnicocelularnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = value ;
   }

   public byte getUsuariotecnicocelularnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N ;
   }

   public void setUsuariotecnicocelularnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = value ;
   }

   public byte getUsuariotecnicotelefono1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1_N ;
   }

   public void setUsuariotecnicotelefono1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = value ;
   }

   public byte getUsuariotecnicotelefono2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2_N ;
   }

   public void setUsuariotecnicotelefono2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = value ;
   }

   public byte getUsuariotecnicotelefononombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N ;
   }

   public void setUsuariotecnicotelefononombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = value ;
   }

   public byte getUsuariotecnicotelefononombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N ;
   }

   public void setUsuariotecnicotelefononombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = value ;
   }

   public byte getUsuariotecnicoemail1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1_N ;
   }

   public void setUsuariotecnicoemail1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = value ;
   }

   public byte getUsuariotecnicoemail2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2_N ;
   }

   public void setUsuariotecnicoemail2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = value ;
   }

   public byte getUsuariotecnicoemailnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N ;
   }

   public void setUsuariotecnicoemailnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = value ;
   }

   public byte getUsuariotecnicoemailnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N ;
   }

   public void setUsuariotecnicoemailnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = value ;
   }

   public byte getUsuarioruttipo_N( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo_N ;
   }

   public void setUsuarioruttipo_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuarioruttipo_N = value ;
   }

   public byte getUsuariofacdireccion_N( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion_N ;
   }

   public void setUsuariofacdireccion_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdireccion_N = value ;
   }

   public byte getUsuariofaclocalidad_N( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad_N ;
   }

   public void setUsuariofaclocalidad_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofaclocalidad_N = value ;
   }

   public byte getUsuariofacdepartamento_N( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento_N ;
   }

   public void setUsuariofacdepartamento_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacdepartamento_N = value ;
   }

   public byte getUsuariofacemailenvio_N( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio_N ;
   }

   public void setUsuariofacemailenvio_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariofacemailenvio_N = value ;
   }

   public byte getUsuariocobranzacelular1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1_N ;
   }

   public void setUsuariocobranzacelular1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = value ;
   }

   public byte getUsuariocobranzacelular2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2_N ;
   }

   public void setUsuariocobranzacelular2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = value ;
   }

   public byte getUsuariocobranzacelularnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N ;
   }

   public void setUsuariocobranzacelularnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = value ;
   }

   public byte getUsuariocobranzacelularnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N ;
   }

   public void setUsuariocobranzacelularnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = value ;
   }

   public byte getUsuariocobranzatelefono1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1_N ;
   }

   public void setUsuariocobranzatelefono1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = value ;
   }

   public byte getUsuariocobranzatelefono2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2_N ;
   }

   public void setUsuariocobranzatelefono2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = value ;
   }

   public byte getUsuariocobranzatelefononombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N ;
   }

   public void setUsuariocobranzatelefononombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = value ;
   }

   public byte getUsuariocobranzatelefononombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N ;
   }

   public void setUsuariocobranzatelefononombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = value ;
   }

   public byte getUsuariocobranzaemail1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1_N ;
   }

   public void setUsuariocobranzaemail1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = value ;
   }

   public byte getUsuariocobranzaemail2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2_N ;
   }

   public void setUsuariocobranzaemail2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = value ;
   }

   public byte getUsuariocobranzaemailnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N ;
   }

   public void setUsuariocobranzaemailnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = value ;
   }

   public byte getUsuariocobranzaemailnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N ;
   }

   public void setUsuariocobranzaemailnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = value ;
   }

   public byte getUsuariocedula_N( )
   {
      return gxTv_SdtUsuario_Usuariocedula_N ;
   }

   public void setUsuariocedula_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      gxTv_SdtUsuario_Usuariocedula_N = value ;
   }

   protected byte gxTv_SdtUsuario_Usuarioemail_N ;
   protected byte gxTv_SdtUsuario_Usuariousuarioweb_N ;
   protected byte gxTv_SdtUsuario_Usuarionombre_N ;
   protected byte gxTv_SdtUsuario_Usuariodicose_N ;
   protected byte gxTv_SdtUsuario_Usuariorazonsocial_N ;
   protected byte gxTv_SdtUsuario_Usuariorut_N ;
   protected byte gxTv_SdtUsuario_Usuarioidnet_N ;
   protected byte gxTv_SdtUsuario_Usuariodireccion_N ;
   protected byte gxTv_SdtUsuario_Usuariotipousuario_N ;
   protected byte gxTv_SdtUsuario_Usuarioidtecnico1_N ;
   protected byte gxTv_SdtUsuario_Usuarioidtecnico2_N ;
   protected byte gxTv_SdtUsuario_Usuarioidtecnico3_N ;
   protected byte gxTv_SdtUsuario_Usuariodireccionfrasco_N ;
   protected byte gxTv_SdtUsuario_Usuarioagenciafrasco_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionfrasco1_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionfrasco2_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionresultado1_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionresultado2_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionavisos1_N ;
   protected byte gxTv_SdtUsuario_Usuarionotificacionavisos2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicocelular1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicocelular2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicotelefono1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicotelefono2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicoemail1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicoemail2_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N ;
   protected byte gxTv_SdtUsuario_Usuarioruttipo_N ;
   protected byte gxTv_SdtUsuario_Usuariofacdireccion_N ;
   protected byte gxTv_SdtUsuario_Usuariofaclocalidad_N ;
   protected byte gxTv_SdtUsuario_Usuariofacdepartamento_N ;
   protected byte gxTv_SdtUsuario_Usuariofacemailenvio_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzacelular1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzacelular2_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzatelefono1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzatelefono2_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzaemail1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzaemail2_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N ;
   protected byte gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N ;
   protected byte gxTv_SdtUsuario_Usuariocedula_N ;
   private byte gxTv_SdtUsuario_N ;
   protected short gxTv_SdtUsuario_Usuariotipousuario ;
   protected short gxTv_SdtUsuario_Usuarioagenciafrasco ;
   protected short gxTv_SdtUsuario_Initialized ;
   protected short gxTv_SdtUsuario_Usuariotipousuario_Z ;
   protected short gxTv_SdtUsuario_Usuarioagenciafrasco_Z ;
   protected long gxTv_SdtUsuario_Usuarioid ;
   protected long gxTv_SdtUsuario_Usuarioidnet ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico1 ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico2 ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico3 ;
   protected long gxTv_SdtUsuario_Usuarioid_Z ;
   protected long gxTv_SdtUsuario_Usuarioidnet_Z ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico1_Z ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico2_Z ;
   protected long gxTv_SdtUsuario_Usuarioidtecnico3_Z ;
   protected String gxTv_SdtUsuario_Mode ;
   protected String gxTv_SdtUsuario_Usuarioemail ;
   protected String gxTv_SdtUsuario_Usuariousuarioweb ;
   protected String gxTv_SdtUsuario_Usuarionombre ;
   protected String gxTv_SdtUsuario_Usuariodicose ;
   protected String gxTv_SdtUsuario_Usuariorazonsocial ;
   protected String gxTv_SdtUsuario_Usuariorut ;
   protected String gxTv_SdtUsuario_Usuariodireccion ;
   protected String gxTv_SdtUsuario_Usuariodireccionfrasco ;
   protected String gxTv_SdtUsuario_Usuarionotificacionfrasco1 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionfrasco2 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionsolicitud1 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionsolicitud2 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionresultado1 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionresultado2 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionavisos1 ;
   protected String gxTv_SdtUsuario_Usuarionotificacionavisos2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelular1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelular2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelularnombre1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelularnombre2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefono1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefono2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefononombre1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefononombre2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemail1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemail2 ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemailnombre1 ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemailnombre2 ;
   protected String gxTv_SdtUsuario_Usuarioruttipo ;
   protected String gxTv_SdtUsuario_Usuariofacdireccion ;
   protected String gxTv_SdtUsuario_Usuariofaclocalidad ;
   protected String gxTv_SdtUsuario_Usuariofacdepartamento ;
   protected String gxTv_SdtUsuario_Usuariofacemailenvio ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelular1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelular2 ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelularnombre1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelularnombre2 ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefono1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefono2 ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefononombre1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefononombre2 ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemail1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemail2 ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemailnombre1 ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemailnombre2 ;
   protected String gxTv_SdtUsuario_Usuariocedula ;
   protected String gxTv_SdtUsuario_Usuarioemail_Z ;
   protected String gxTv_SdtUsuario_Usuariousuarioweb_Z ;
   protected String gxTv_SdtUsuario_Usuarionombre_Z ;
   protected String gxTv_SdtUsuario_Usuariodicose_Z ;
   protected String gxTv_SdtUsuario_Usuariorazonsocial_Z ;
   protected String gxTv_SdtUsuario_Usuariorut_Z ;
   protected String gxTv_SdtUsuario_Usuariodireccion_Z ;
   protected String gxTv_SdtUsuario_Usuariodireccionfrasco_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionresultado1_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionresultado2_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionavisos1_Z ;
   protected String gxTv_SdtUsuario_Usuarionotificacionavisos2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelular1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelular2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefono1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefono2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemail1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemail2_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z ;
   protected String gxTv_SdtUsuario_Usuarioruttipo_Z ;
   protected String gxTv_SdtUsuario_Usuariofacdireccion_Z ;
   protected String gxTv_SdtUsuario_Usuariofaclocalidad_Z ;
   protected String gxTv_SdtUsuario_Usuariofacdepartamento_Z ;
   protected String gxTv_SdtUsuario_Usuariofacemailenvio_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelular1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelular2_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefono1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefono2_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemail1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemail2_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z ;
   protected String gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z ;
   protected String gxTv_SdtUsuario_Usuariocedula_Z ;
}

