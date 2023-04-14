package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTUsuario implements Cloneable, java.io.Serializable
{
   public StructSdtSDTUsuario( )
   {
      this( -1, new ModelContext( StructSdtSDTUsuario.class ));
   }

   public StructSdtSDTUsuario( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSDTUsuario_Usuarioemail = "" ;
      gxTv_SdtSDTUsuario_Usuariousuarioweb = "" ;
      gxTv_SdtSDTUsuario_Usuarionombre = "" ;
      gxTv_SdtSDTUsuario_Usuariodicose = "" ;
      gxTv_SdtSDTUsuario_Usuariorazonsocial = "" ;
      gxTv_SdtSDTUsuario_Usuariorut = "" ;
      gxTv_SdtSDTUsuario_Usuariodireccion = "" ;
      gxTv_SdtSDTUsuario_Usuariodireccionfrasco = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionfrasco1 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionfrasco2 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud1 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud2 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionresultado1 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionresultado2 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionavisos1 = "" ;
      gxTv_SdtSDTUsuario_Usuarionotificacionavisos2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelular1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelular2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefono1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefono2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemail1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemail2 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuarioruttipo = "" ;
      gxTv_SdtSDTUsuario_Usuariofacdireccion = "" ;
      gxTv_SdtSDTUsuario_Usuariofaclocalidad = "" ;
      gxTv_SdtSDTUsuario_Usuariofacdepartamento = "" ;
      gxTv_SdtSDTUsuario_Usuariofacemailenvio = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelular1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelular2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefono1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefono2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemail1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemail2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre1 = "" ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre2 = "" ;
      gxTv_SdtSDTUsuario_Usuariocedula = "" ;
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
      return gxTv_SdtSDTUsuario_Usuarioid ;
   }

   public void setUsuarioid( long value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioid = value ;
   }

   public String getUsuarioemail( )
   {
      return gxTv_SdtSDTUsuario_Usuarioemail ;
   }

   public void setUsuarioemail( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioemail = value ;
   }

   public String getUsuariousuarioweb( )
   {
      return gxTv_SdtSDTUsuario_Usuariousuarioweb ;
   }

   public void setUsuariousuarioweb( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariousuarioweb = value ;
   }

   public String getUsuarionombre( )
   {
      return gxTv_SdtSDTUsuario_Usuarionombre ;
   }

   public void setUsuarionombre( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionombre = value ;
   }

   public String getUsuariodicose( )
   {
      return gxTv_SdtSDTUsuario_Usuariodicose ;
   }

   public void setUsuariodicose( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariodicose = value ;
   }

   public String getUsuariorazonsocial( )
   {
      return gxTv_SdtSDTUsuario_Usuariorazonsocial ;
   }

   public void setUsuariorazonsocial( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariorazonsocial = value ;
   }

   public String getUsuariorut( )
   {
      return gxTv_SdtSDTUsuario_Usuariorut ;
   }

   public void setUsuariorut( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariorut = value ;
   }

   public long getUsuarioidnet( )
   {
      return gxTv_SdtSDTUsuario_Usuarioidnet ;
   }

   public void setUsuarioidnet( long value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioidnet = value ;
   }

   public String getUsuariodireccion( )
   {
      return gxTv_SdtSDTUsuario_Usuariodireccion ;
   }

   public void setUsuariodireccion( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariodireccion = value ;
   }

   public short getUsuariotipousuario( )
   {
      return gxTv_SdtSDTUsuario_Usuariotipousuario ;
   }

   public void setUsuariotipousuario( short value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotipousuario = value ;
   }

   public long getUsuarioidtecnico1( )
   {
      return gxTv_SdtSDTUsuario_Usuarioidtecnico1 ;
   }

   public void setUsuarioidtecnico1( long value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioidtecnico1 = value ;
   }

   public long getUsuarioidtecnico2( )
   {
      return gxTv_SdtSDTUsuario_Usuarioidtecnico2 ;
   }

   public void setUsuarioidtecnico2( long value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioidtecnico2 = value ;
   }

   public long getUsuarioidtecnico3( )
   {
      return gxTv_SdtSDTUsuario_Usuarioidtecnico3 ;
   }

   public void setUsuarioidtecnico3( long value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioidtecnico3 = value ;
   }

   public String getUsuariodireccionfrasco( )
   {
      return gxTv_SdtSDTUsuario_Usuariodireccionfrasco ;
   }

   public void setUsuariodireccionfrasco( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariodireccionfrasco = value ;
   }

   public short getUsuarioagenciafrasco( )
   {
      return gxTv_SdtSDTUsuario_Usuarioagenciafrasco ;
   }

   public void setUsuarioagenciafrasco( short value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioagenciafrasco = value ;
   }

   public String getUsuarionotificacionfrasco1( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionfrasco1 ;
   }

   public void setUsuarionotificacionfrasco1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionfrasco1 = value ;
   }

   public String getUsuarionotificacionfrasco2( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionfrasco2 ;
   }

   public void setUsuarionotificacionfrasco2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionfrasco2 = value ;
   }

   public String getUsuarionotificacionsolicitud1( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud1 ;
   }

   public void setUsuarionotificacionsolicitud1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud1 = value ;
   }

   public String getUsuarionotificacionsolicitud2( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud2 ;
   }

   public void setUsuarionotificacionsolicitud2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud2 = value ;
   }

   public String getUsuarionotificacionresultado1( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionresultado1 ;
   }

   public void setUsuarionotificacionresultado1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionresultado1 = value ;
   }

   public String getUsuarionotificacionresultado2( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionresultado2 ;
   }

   public void setUsuarionotificacionresultado2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionresultado2 = value ;
   }

   public String getUsuarionotificacionavisos1( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionavisos1 ;
   }

   public void setUsuarionotificacionavisos1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionavisos1 = value ;
   }

   public String getUsuarionotificacionavisos2( )
   {
      return gxTv_SdtSDTUsuario_Usuarionotificacionavisos2 ;
   }

   public void setUsuarionotificacionavisos2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarionotificacionavisos2 = value ;
   }

   public String getUsuariotecnicocelular1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicocelular1 ;
   }

   public void setUsuariotecnicocelular1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelular1 = value ;
   }

   public String getUsuariotecnicocelular2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicocelular2 ;
   }

   public void setUsuariotecnicocelular2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelular2 = value ;
   }

   public String getUsuariotecnicocelularnombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre1 ;
   }

   public void setUsuariotecnicocelularnombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre1 = value ;
   }

   public String getUsuariotecnicocelularnombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre2 ;
   }

   public void setUsuariotecnicocelularnombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre2 = value ;
   }

   public String getUsuariotecnicotelefono1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicotelefono1 ;
   }

   public void setUsuariotecnicotelefono1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefono1 = value ;
   }

   public String getUsuariotecnicotelefono2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicotelefono2 ;
   }

   public void setUsuariotecnicotelefono2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefono2 = value ;
   }

   public String getUsuariotecnicotelefononombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre1 ;
   }

   public void setUsuariotecnicotelefononombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre1 = value ;
   }

   public String getUsuariotecnicotelefononombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre2 ;
   }

   public void setUsuariotecnicotelefononombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre2 = value ;
   }

   public String getUsuariotecnicoemail1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicoemail1 ;
   }

   public void setUsuariotecnicoemail1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemail1 = value ;
   }

   public String getUsuariotecnicoemail2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicoemail2 ;
   }

   public void setUsuariotecnicoemail2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemail2 = value ;
   }

   public String getUsuariotecnicoemailnombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre1 ;
   }

   public void setUsuariotecnicoemailnombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre1 = value ;
   }

   public String getUsuariotecnicoemailnombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre2 ;
   }

   public void setUsuariotecnicoemailnombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre2 = value ;
   }

   public String getUsuarioruttipo( )
   {
      return gxTv_SdtSDTUsuario_Usuarioruttipo ;
   }

   public void setUsuarioruttipo( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuarioruttipo = value ;
   }

   public String getUsuariofacdireccion( )
   {
      return gxTv_SdtSDTUsuario_Usuariofacdireccion ;
   }

   public void setUsuariofacdireccion( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariofacdireccion = value ;
   }

   public String getUsuariofaclocalidad( )
   {
      return gxTv_SdtSDTUsuario_Usuariofaclocalidad ;
   }

   public void setUsuariofaclocalidad( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariofaclocalidad = value ;
   }

   public String getUsuariofacdepartamento( )
   {
      return gxTv_SdtSDTUsuario_Usuariofacdepartamento ;
   }

   public void setUsuariofacdepartamento( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariofacdepartamento = value ;
   }

   public String getUsuariofacemailenvio( )
   {
      return gxTv_SdtSDTUsuario_Usuariofacemailenvio ;
   }

   public void setUsuariofacemailenvio( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariofacemailenvio = value ;
   }

   public String getUsuariocobranzacelular1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzacelular1 ;
   }

   public void setUsuariocobranzacelular1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelular1 = value ;
   }

   public String getUsuariocobranzacelular2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzacelular2 ;
   }

   public void setUsuariocobranzacelular2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelular2 = value ;
   }

   public String getUsuariocobranzacelularnombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre1 ;
   }

   public void setUsuariocobranzacelularnombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre1 = value ;
   }

   public String getUsuariocobranzacelularnombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre2 ;
   }

   public void setUsuariocobranzacelularnombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre2 = value ;
   }

   public String getUsuariocobranzatelefono1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzatelefono1 ;
   }

   public void setUsuariocobranzatelefono1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefono1 = value ;
   }

   public String getUsuariocobranzatelefono2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzatelefono2 ;
   }

   public void setUsuariocobranzatelefono2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefono2 = value ;
   }

   public String getUsuariocobranzatelefononombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre1 ;
   }

   public void setUsuariocobranzatelefononombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre1 = value ;
   }

   public String getUsuariocobranzatelefononombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre2 ;
   }

   public void setUsuariocobranzatelefononombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre2 = value ;
   }

   public String getUsuariocobranzaemail1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzaemail1 ;
   }

   public void setUsuariocobranzaemail1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemail1 = value ;
   }

   public String getUsuariocobranzaemail2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzaemail2 ;
   }

   public void setUsuariocobranzaemail2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemail2 = value ;
   }

   public String getUsuariocobranzaemailnombre1( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre1 ;
   }

   public void setUsuariocobranzaemailnombre1( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre1 = value ;
   }

   public String getUsuariocobranzaemailnombre2( )
   {
      return gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre2 ;
   }

   public void setUsuariocobranzaemailnombre2( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre2 = value ;
   }

   public String getUsuariocedula( )
   {
      return gxTv_SdtSDTUsuario_Usuariocedula ;
   }

   public void setUsuariocedula( String value )
   {
      gxTv_SdtSDTUsuario_N = (byte)(0) ;
      gxTv_SdtSDTUsuario_Usuariocedula = value ;
   }

   protected byte gxTv_SdtSDTUsuario_N ;
   protected short gxTv_SdtSDTUsuario_Usuariotipousuario ;
   protected short gxTv_SdtSDTUsuario_Usuarioagenciafrasco ;
   protected long gxTv_SdtSDTUsuario_Usuarioid ;
   protected long gxTv_SdtSDTUsuario_Usuarioidnet ;
   protected long gxTv_SdtSDTUsuario_Usuarioidtecnico1 ;
   protected long gxTv_SdtSDTUsuario_Usuarioidtecnico2 ;
   protected long gxTv_SdtSDTUsuario_Usuarioidtecnico3 ;
   protected String gxTv_SdtSDTUsuario_Usuarioemail ;
   protected String gxTv_SdtSDTUsuario_Usuariousuarioweb ;
   protected String gxTv_SdtSDTUsuario_Usuarionombre ;
   protected String gxTv_SdtSDTUsuario_Usuariodicose ;
   protected String gxTv_SdtSDTUsuario_Usuariorazonsocial ;
   protected String gxTv_SdtSDTUsuario_Usuariorut ;
   protected String gxTv_SdtSDTUsuario_Usuariodireccion ;
   protected String gxTv_SdtSDTUsuario_Usuariodireccionfrasco ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionfrasco1 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionfrasco2 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud1 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionsolicitud2 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionresultado1 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionresultado2 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionavisos1 ;
   protected String gxTv_SdtSDTUsuario_Usuarionotificacionavisos2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicocelular1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicocelular2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicocelularnombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicotelefono1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicotelefono2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicotelefononombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicoemail1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicoemail2 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariotecnicoemailnombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuarioruttipo ;
   protected String gxTv_SdtSDTUsuario_Usuariofacdireccion ;
   protected String gxTv_SdtSDTUsuario_Usuariofaclocalidad ;
   protected String gxTv_SdtSDTUsuario_Usuariofacdepartamento ;
   protected String gxTv_SdtSDTUsuario_Usuariofacemailenvio ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzacelular1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzacelular2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzacelularnombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzatelefono1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzatelefono2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzatelefononombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzaemail1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzaemail2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre1 ;
   protected String gxTv_SdtSDTUsuario_Usuariocobranzaemailnombre2 ;
   protected String gxTv_SdtSDTUsuario_Usuariocedula ;
}

