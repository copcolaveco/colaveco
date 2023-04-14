package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtUsuario extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtUsuario( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtUsuario.class));
   }

   public SdtUsuario( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtUsuario");
      initialize( remoteHandle) ;
   }

   public SdtUsuario( int remoteHandle ,
                      StructSdtUsuario struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( long AV5UsuarioId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV5UsuarioId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"UsuarioId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Usuario");
      metadata.set("BT", "Usuario");
      metadata.set("PK", "[ \"UsuarioId\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioId") )
            {
               gxTv_SdtUsuario_Usuarioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail") )
            {
               gxTv_SdtUsuario_Usuarioemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioUsuarioWeb") )
            {
               gxTv_SdtUsuario_Usuariousuarioweb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNombre") )
            {
               gxTv_SdtUsuario_Usuarionombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDicose") )
            {
               gxTv_SdtUsuario_Usuariodicose = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRazonSocial") )
            {
               gxTv_SdtUsuario_Usuariorazonsocial = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRut") )
            {
               gxTv_SdtUsuario_Usuariorut = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdNet") )
            {
               gxTv_SdtUsuario_Usuarioidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccion") )
            {
               gxTv_SdtUsuario_Usuariodireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTipousuario") )
            {
               gxTv_SdtUsuario_Usuariotipousuario = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico1") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico1 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico2") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico2 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico3") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico3 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccionFrasco") )
            {
               gxTv_SdtUsuario_Usuariodireccionfrasco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioAgenciaFrasco") )
            {
               gxTv_SdtUsuario_Usuarioagenciafrasco = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco1") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco2") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud1") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud2") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado1") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado2") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos1") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos2") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular1") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular2") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre1") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre2") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono1") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono2") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre1") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre2") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail1") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail2") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre1") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre2") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRutTipo") )
            {
               gxTv_SdtUsuario_Usuarioruttipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDireccion") )
            {
               gxTv_SdtUsuario_Usuariofacdireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacLocalidad") )
            {
               gxTv_SdtUsuario_Usuariofaclocalidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDepartamento") )
            {
               gxTv_SdtUsuario_Usuariofacdepartamento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacEmailEnvio") )
            {
               gxTv_SdtUsuario_Usuariofacemailenvio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular1") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular2") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre1") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre2") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono1") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono2") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre1") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre2") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail1") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail2") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre1") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre2") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCedula") )
            {
               gxTv_SdtUsuario_Usuariocedula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtUsuario_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtUsuario_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioId_Z") )
            {
               gxTv_SdtUsuario_Usuarioid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail_Z") )
            {
               gxTv_SdtUsuario_Usuarioemail_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioUsuarioWeb_Z") )
            {
               gxTv_SdtUsuario_Usuariousuarioweb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNombre_Z") )
            {
               gxTv_SdtUsuario_Usuarionombre_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDicose_Z") )
            {
               gxTv_SdtUsuario_Usuariodicose_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRazonSocial_Z") )
            {
               gxTv_SdtUsuario_Usuariorazonsocial_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRut_Z") )
            {
               gxTv_SdtUsuario_Usuariorut_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdNet_Z") )
            {
               gxTv_SdtUsuario_Usuarioidnet_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccion_Z") )
            {
               gxTv_SdtUsuario_Usuariodireccion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTipousuario_Z") )
            {
               gxTv_SdtUsuario_Usuariotipousuario_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico1_Z") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico1_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico2_Z") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico2_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico3_Z") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico3_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccionFrasco_Z") )
            {
               gxTv_SdtUsuario_Usuariodireccionfrasco_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioAgenciaFrasco_Z") )
            {
               gxTv_SdtUsuario_Usuarioagenciafrasco_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco1_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco2_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud1_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud2_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado1_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado2_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos1_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos2_Z") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRutTipo_Z") )
            {
               gxTv_SdtUsuario_Usuarioruttipo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDireccion_Z") )
            {
               gxTv_SdtUsuario_Usuariofacdireccion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacLocalidad_Z") )
            {
               gxTv_SdtUsuario_Usuariofaclocalidad_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDepartamento_Z") )
            {
               gxTv_SdtUsuario_Usuariofacdepartamento_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacEmailEnvio_Z") )
            {
               gxTv_SdtUsuario_Usuariofacemailenvio_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre1_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre2_Z") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCedula_Z") )
            {
               gxTv_SdtUsuario_Usuariocedula_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail_N") )
            {
               gxTv_SdtUsuario_Usuarioemail_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioUsuarioWeb_N") )
            {
               gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNombre_N") )
            {
               gxTv_SdtUsuario_Usuarionombre_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDicose_N") )
            {
               gxTv_SdtUsuario_Usuariodicose_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRazonSocial_N") )
            {
               gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRut_N") )
            {
               gxTv_SdtUsuario_Usuariorut_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdNet_N") )
            {
               gxTv_SdtUsuario_Usuarioidnet_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccion_N") )
            {
               gxTv_SdtUsuario_Usuariodireccion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTipousuario_N") )
            {
               gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico1_N") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico2_N") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico3_N") )
            {
               gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccionFrasco_N") )
            {
               gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioAgenciaFrasco_N") )
            {
               gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco1_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco2_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud1_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud2_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado1_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado2_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos1_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos2_N") )
            {
               gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRutTipo_N") )
            {
               gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDireccion_N") )
            {
               gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacLocalidad_N") )
            {
               gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDepartamento_N") )
            {
               gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacEmailEnvio_N") )
            {
               gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre1_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre2_N") )
            {
               gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCedula_N") )
            {
               gxTv_SdtUsuario_Usuariocedula_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "Usuario" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Colaveco" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioEmail", GXutil.rtrim( gxTv_SdtUsuario_Usuarioemail));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioUsuarioWeb", GXutil.rtrim( gxTv_SdtUsuario_Usuariousuarioweb));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNombre", GXutil.rtrim( gxTv_SdtUsuario_Usuarionombre));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioDicose", GXutil.rtrim( gxTv_SdtUsuario_Usuariodicose));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioRazonSocial", GXutil.rtrim( gxTv_SdtUsuario_Usuariorazonsocial));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioRut", GXutil.rtrim( gxTv_SdtUsuario_Usuariorut));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioIdNet", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioDireccion", GXutil.rtrim( gxTv_SdtUsuario_Usuariodireccion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTipousuario", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotipousuario, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioIdTecnico1", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico1, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioIdTecnico2", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico2, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioIdTecnico3", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico3, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioDireccionFrasco", GXutil.rtrim( gxTv_SdtUsuario_Usuariodireccionfrasco));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioAgenciaFrasco", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioagenciafrasco, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionFrasco1", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionfrasco1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionFrasco2", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionfrasco2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionSolicitud1", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionsolicitud1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionSolicitud2", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionsolicitud2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionResultado1", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionresultado1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionResultado2", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionresultado2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionAvisos1", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionavisos1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioNotificacionAvisos2", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionavisos2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoCelular1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoCelular2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoCelularNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelularnombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoCelularNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelularnombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoTelefono1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefono1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoTelefono2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoTelefonoNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefononombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoTelefonoNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefononombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoEmail1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoEmail2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoEmailNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemailnombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioTecnicoEmailNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemailnombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioRutTipo", GXutil.rtrim( gxTv_SdtUsuario_Usuarioruttipo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioFacDireccion", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacdireccion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioFacLocalidad", GXutil.rtrim( gxTv_SdtUsuario_Usuariofaclocalidad));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioFacDepartamento", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacdepartamento));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioFacEmailEnvio", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacemailenvio));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaCelular1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaCelular2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaCelularNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelularnombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaCelularNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelularnombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaTelefono1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefono1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaTelefono2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaTelefonoNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefononombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaTelefonoNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefononombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaEmail1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaEmail2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaEmailNombre1", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemailnombre1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCobranzaEmailNombre2", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemailnombre2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("UsuarioCedula", GXutil.rtrim( gxTv_SdtUsuario_Usuariocedula));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtUsuario_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioId_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioEmail_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarioemail_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioUsuarioWeb_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariousuarioweb_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNombre_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionombre_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDicose_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariodicose_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRazonSocial_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariorazonsocial_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRut_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariorut_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdNet_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidnet_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDireccion_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariodireccion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTipousuario_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotipousuario_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico1_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico1_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico2_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico2_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico3_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico3_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDireccionFrasco_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariodireccionfrasco_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioAgenciaFrasco_Z", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioagenciafrasco_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionFrasco1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionFrasco2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionSolicitud1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionSolicitud2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionResultado1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionresultado1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionResultado2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionresultado2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionAvisos1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionavisos1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionAvisos2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarionotificacionavisos2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelular1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelular2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelularNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelularNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefono1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefono1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefono2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefonoNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefonoNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmail1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmail2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmailNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmailNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRutTipo_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuarioruttipo_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacDireccion_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacdireccion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacLocalidad_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariofaclocalidad_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacDepartamento_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacdepartamento_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacEmailEnvio_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariofacemailenvio_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelular1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelular2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelularNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelularNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefono1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefono1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefono2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefonoNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefonoNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmail1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmail2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmailNombre1_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmailNombre2_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCedula_Z", GXutil.rtrim( gxTv_SdtUsuario_Usuariocedula_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioEmail_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioemail_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioUsuarioWeb_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariousuarioweb_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNombre_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionombre_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDicose_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariodicose_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRazonSocial_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariorazonsocial_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRut_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariorut_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdNet_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidnet_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDireccion_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariodireccion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTipousuario_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotipousuario_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioIdTecnico3_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioDireccionFrasco_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariodireccionfrasco_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioAgenciaFrasco_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioagenciafrasco_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionFrasco1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionfrasco1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionFrasco2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionfrasco2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionSolicitud1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionSolicitud2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionResultado1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionresultado1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionResultado2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionresultado2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionAvisos1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionavisos1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioNotificacionAvisos2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarionotificacionavisos2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicocelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicocelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelularNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoCelularNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefono1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicotelefono1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicotelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefonoNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoTelefonoNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicoemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicoemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmailNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioTecnicoEmailNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioRutTipo_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuarioruttipo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacDireccion_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariofacdireccion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacLocalidad_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariofaclocalidad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacDepartamento_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariofacdepartamento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioFacEmailEnvio_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariofacemailenvio_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzacelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzacelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelularNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaCelularNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefono1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzatelefono1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzatelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefonoNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaTelefonoNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzaemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzaemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmailNombre1_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCobranzaEmailNombre2_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("UsuarioCedula_N", GXutil.trim( GXutil.str( gxTv_SdtUsuario_Usuariocedula_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("UsuarioEmail", gxTv_SdtUsuario_Usuarioemail, false, includeNonInitialized);
      AddObjectProperty("UsuarioEmail_N", gxTv_SdtUsuario_Usuarioemail_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioUsuarioWeb", gxTv_SdtUsuario_Usuariousuarioweb, false, includeNonInitialized);
      AddObjectProperty("UsuarioUsuarioWeb_N", gxTv_SdtUsuario_Usuariousuarioweb_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNombre", gxTv_SdtUsuario_Usuarionombre, false, includeNonInitialized);
      AddObjectProperty("UsuarioNombre_N", gxTv_SdtUsuario_Usuarionombre_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioDicose", gxTv_SdtUsuario_Usuariodicose, false, includeNonInitialized);
      AddObjectProperty("UsuarioDicose_N", gxTv_SdtUsuario_Usuariodicose_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioRazonSocial", gxTv_SdtUsuario_Usuariorazonsocial, false, includeNonInitialized);
      AddObjectProperty("UsuarioRazonSocial_N", gxTv_SdtUsuario_Usuariorazonsocial_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioRut", gxTv_SdtUsuario_Usuariorut, false, includeNonInitialized);
      AddObjectProperty("UsuarioRut_N", gxTv_SdtUsuario_Usuariorut_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidnet, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("UsuarioIdNet_N", gxTv_SdtUsuario_Usuarioidnet_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioDireccion", gxTv_SdtUsuario_Usuariodireccion, false, includeNonInitialized);
      AddObjectProperty("UsuarioDireccion_N", gxTv_SdtUsuario_Usuariodireccion_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTipousuario", gxTv_SdtUsuario_Usuariotipousuario, false, includeNonInitialized);
      AddObjectProperty("UsuarioTipousuario_N", gxTv_SdtUsuario_Usuariotipousuario_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico1", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico1, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico1_N", gxTv_SdtUsuario_Usuarioidtecnico1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico2", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico2, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico2_N", gxTv_SdtUsuario_Usuarioidtecnico2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico3", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico3, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("UsuarioIdTecnico3_N", gxTv_SdtUsuario_Usuarioidtecnico3_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioDireccionFrasco", gxTv_SdtUsuario_Usuariodireccionfrasco, false, includeNonInitialized);
      AddObjectProperty("UsuarioDireccionFrasco_N", gxTv_SdtUsuario_Usuariodireccionfrasco_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioAgenciaFrasco", gxTv_SdtUsuario_Usuarioagenciafrasco, false, includeNonInitialized);
      AddObjectProperty("UsuarioAgenciaFrasco_N", gxTv_SdtUsuario_Usuarioagenciafrasco_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionFrasco1", gxTv_SdtUsuario_Usuarionotificacionfrasco1, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionFrasco1_N", gxTv_SdtUsuario_Usuarionotificacionfrasco1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionFrasco2", gxTv_SdtUsuario_Usuarionotificacionfrasco2, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionFrasco2_N", gxTv_SdtUsuario_Usuarionotificacionfrasco2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionSolicitud1", gxTv_SdtUsuario_Usuarionotificacionsolicitud1, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionSolicitud1_N", gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionSolicitud2", gxTv_SdtUsuario_Usuarionotificacionsolicitud2, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionSolicitud2_N", gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionResultado1", gxTv_SdtUsuario_Usuarionotificacionresultado1, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionResultado1_N", gxTv_SdtUsuario_Usuarionotificacionresultado1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionResultado2", gxTv_SdtUsuario_Usuarionotificacionresultado2, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionResultado2_N", gxTv_SdtUsuario_Usuarionotificacionresultado2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionAvisos1", gxTv_SdtUsuario_Usuarionotificacionavisos1, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionAvisos1_N", gxTv_SdtUsuario_Usuarionotificacionavisos1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionAvisos2", gxTv_SdtUsuario_Usuarionotificacionavisos2, false, includeNonInitialized);
      AddObjectProperty("UsuarioNotificacionAvisos2_N", gxTv_SdtUsuario_Usuarionotificacionavisos2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelular1", gxTv_SdtUsuario_Usuariotecnicocelular1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelular1_N", gxTv_SdtUsuario_Usuariotecnicocelular1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelular2", gxTv_SdtUsuario_Usuariotecnicocelular2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelular2_N", gxTv_SdtUsuario_Usuariotecnicocelular2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelularNombre1", gxTv_SdtUsuario_Usuariotecnicocelularnombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelularNombre1_N", gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelularNombre2", gxTv_SdtUsuario_Usuariotecnicocelularnombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoCelularNombre2_N", gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefono1", gxTv_SdtUsuario_Usuariotecnicotelefono1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefono1_N", gxTv_SdtUsuario_Usuariotecnicotelefono1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefono2", gxTv_SdtUsuario_Usuariotecnicotelefono2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefono2_N", gxTv_SdtUsuario_Usuariotecnicotelefono2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre1", gxTv_SdtUsuario_Usuariotecnicotelefononombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre1_N", gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre2", gxTv_SdtUsuario_Usuariotecnicotelefononombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre2_N", gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmail1", gxTv_SdtUsuario_Usuariotecnicoemail1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmail1_N", gxTv_SdtUsuario_Usuariotecnicoemail1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmail2", gxTv_SdtUsuario_Usuariotecnicoemail2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmail2_N", gxTv_SdtUsuario_Usuariotecnicoemail2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmailNombre1", gxTv_SdtUsuario_Usuariotecnicoemailnombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmailNombre1_N", gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmailNombre2", gxTv_SdtUsuario_Usuariotecnicoemailnombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioTecnicoEmailNombre2_N", gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioRutTipo", gxTv_SdtUsuario_Usuarioruttipo, false, includeNonInitialized);
      AddObjectProperty("UsuarioRutTipo_N", gxTv_SdtUsuario_Usuarioruttipo_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacDireccion", gxTv_SdtUsuario_Usuariofacdireccion, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacDireccion_N", gxTv_SdtUsuario_Usuariofacdireccion_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacLocalidad", gxTv_SdtUsuario_Usuariofaclocalidad, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacLocalidad_N", gxTv_SdtUsuario_Usuariofaclocalidad_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacDepartamento", gxTv_SdtUsuario_Usuariofacdepartamento, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacDepartamento_N", gxTv_SdtUsuario_Usuariofacdepartamento_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacEmailEnvio", gxTv_SdtUsuario_Usuariofacemailenvio, false, includeNonInitialized);
      AddObjectProperty("UsuarioFacEmailEnvio_N", gxTv_SdtUsuario_Usuariofacemailenvio_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelular1", gxTv_SdtUsuario_Usuariocobranzacelular1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelular1_N", gxTv_SdtUsuario_Usuariocobranzacelular1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelular2", gxTv_SdtUsuario_Usuariocobranzacelular2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelular2_N", gxTv_SdtUsuario_Usuariocobranzacelular2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelularNombre1", gxTv_SdtUsuario_Usuariocobranzacelularnombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelularNombre1_N", gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelularNombre2", gxTv_SdtUsuario_Usuariocobranzacelularnombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaCelularNombre2_N", gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefono1", gxTv_SdtUsuario_Usuariocobranzatelefono1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefono1_N", gxTv_SdtUsuario_Usuariocobranzatelefono1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefono2", gxTv_SdtUsuario_Usuariocobranzatelefono2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefono2_N", gxTv_SdtUsuario_Usuariocobranzatelefono2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre1", gxTv_SdtUsuario_Usuariocobranzatelefononombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre1_N", gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre2", gxTv_SdtUsuario_Usuariocobranzatelefononombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre2_N", gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmail1", gxTv_SdtUsuario_Usuariocobranzaemail1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmail1_N", gxTv_SdtUsuario_Usuariocobranzaemail1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmail2", gxTv_SdtUsuario_Usuariocobranzaemail2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmail2_N", gxTv_SdtUsuario_Usuariocobranzaemail2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmailNombre1", gxTv_SdtUsuario_Usuariocobranzaemailnombre1, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmailNombre1_N", gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmailNombre2", gxTv_SdtUsuario_Usuariocobranzaemailnombre2, false, includeNonInitialized);
      AddObjectProperty("UsuarioCobranzaEmailNombre2_N", gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N, false, includeNonInitialized);
      AddObjectProperty("UsuarioCedula", gxTv_SdtUsuario_Usuariocedula, false, includeNonInitialized);
      AddObjectProperty("UsuarioCedula_N", gxTv_SdtUsuario_Usuariocedula_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtUsuario_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtUsuario_Initialized, false, includeNonInitialized);
         AddObjectProperty("UsuarioId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("UsuarioEmail_Z", gxTv_SdtUsuario_Usuarioemail_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioUsuarioWeb_Z", gxTv_SdtUsuario_Usuariousuarioweb_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNombre_Z", gxTv_SdtUsuario_Usuarionombre_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioDicose_Z", gxTv_SdtUsuario_Usuariodicose_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioRazonSocial_Z", gxTv_SdtUsuario_Usuariorazonsocial_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioRut_Z", gxTv_SdtUsuario_Usuariorut_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdNet_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidnet_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("UsuarioDireccion_Z", gxTv_SdtUsuario_Usuariodireccion_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTipousuario_Z", gxTv_SdtUsuario_Usuariotipousuario_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico1_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico1_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico2_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico2_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico3_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUsuario_Usuarioidtecnico3_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("UsuarioDireccionFrasco_Z", gxTv_SdtUsuario_Usuariodireccionfrasco_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioAgenciaFrasco_Z", gxTv_SdtUsuario_Usuarioagenciafrasco_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionFrasco1_Z", gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionFrasco2_Z", gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionSolicitud1_Z", gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionSolicitud2_Z", gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionResultado1_Z", gxTv_SdtUsuario_Usuarionotificacionresultado1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionResultado2_Z", gxTv_SdtUsuario_Usuarionotificacionresultado2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionAvisos1_Z", gxTv_SdtUsuario_Usuarionotificacionavisos1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionAvisos2_Z", gxTv_SdtUsuario_Usuarionotificacionavisos2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelular1_Z", gxTv_SdtUsuario_Usuariotecnicocelular1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelular2_Z", gxTv_SdtUsuario_Usuariotecnicocelular2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelularNombre1_Z", gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelularNombre2_Z", gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefono1_Z", gxTv_SdtUsuario_Usuariotecnicotelefono1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefono2_Z", gxTv_SdtUsuario_Usuariotecnicotelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefonoNombre1_Z", gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefonoNombre2_Z", gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmail1_Z", gxTv_SdtUsuario_Usuariotecnicoemail1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmail2_Z", gxTv_SdtUsuario_Usuariotecnicoemail2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmailNombre1_Z", gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmailNombre2_Z", gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioRutTipo_Z", gxTv_SdtUsuario_Usuarioruttipo_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacDireccion_Z", gxTv_SdtUsuario_Usuariofacdireccion_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacLocalidad_Z", gxTv_SdtUsuario_Usuariofaclocalidad_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacDepartamento_Z", gxTv_SdtUsuario_Usuariofacdepartamento_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacEmailEnvio_Z", gxTv_SdtUsuario_Usuariofacemailenvio_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelular1_Z", gxTv_SdtUsuario_Usuariocobranzacelular1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelular2_Z", gxTv_SdtUsuario_Usuariocobranzacelular2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelularNombre1_Z", gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelularNombre2_Z", gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefono1_Z", gxTv_SdtUsuario_Usuariocobranzatelefono1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefono2_Z", gxTv_SdtUsuario_Usuariocobranzatelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefonoNombre1_Z", gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefonoNombre2_Z", gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmail1_Z", gxTv_SdtUsuario_Usuariocobranzaemail1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmail2_Z", gxTv_SdtUsuario_Usuariocobranzaemail2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmailNombre1_Z", gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmailNombre2_Z", gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioCedula_Z", gxTv_SdtUsuario_Usuariocedula_Z, false, includeNonInitialized);
         AddObjectProperty("UsuarioEmail_N", gxTv_SdtUsuario_Usuarioemail_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioUsuarioWeb_N", gxTv_SdtUsuario_Usuariousuarioweb_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNombre_N", gxTv_SdtUsuario_Usuarionombre_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioDicose_N", gxTv_SdtUsuario_Usuariodicose_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioRazonSocial_N", gxTv_SdtUsuario_Usuariorazonsocial_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioRut_N", gxTv_SdtUsuario_Usuariorut_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdNet_N", gxTv_SdtUsuario_Usuarioidnet_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioDireccion_N", gxTv_SdtUsuario_Usuariodireccion_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTipousuario_N", gxTv_SdtUsuario_Usuariotipousuario_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico1_N", gxTv_SdtUsuario_Usuarioidtecnico1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico2_N", gxTv_SdtUsuario_Usuarioidtecnico2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioIdTecnico3_N", gxTv_SdtUsuario_Usuarioidtecnico3_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioDireccionFrasco_N", gxTv_SdtUsuario_Usuariodireccionfrasco_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioAgenciaFrasco_N", gxTv_SdtUsuario_Usuarioagenciafrasco_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionFrasco1_N", gxTv_SdtUsuario_Usuarionotificacionfrasco1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionFrasco2_N", gxTv_SdtUsuario_Usuarionotificacionfrasco2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionSolicitud1_N", gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionSolicitud2_N", gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionResultado1_N", gxTv_SdtUsuario_Usuarionotificacionresultado1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionResultado2_N", gxTv_SdtUsuario_Usuarionotificacionresultado2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionAvisos1_N", gxTv_SdtUsuario_Usuarionotificacionavisos1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioNotificacionAvisos2_N", gxTv_SdtUsuario_Usuarionotificacionavisos2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelular1_N", gxTv_SdtUsuario_Usuariotecnicocelular1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelular2_N", gxTv_SdtUsuario_Usuariotecnicocelular2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelularNombre1_N", gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoCelularNombre2_N", gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefono1_N", gxTv_SdtUsuario_Usuariotecnicotelefono1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefono2_N", gxTv_SdtUsuario_Usuariotecnicotelefono2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefonoNombre1_N", gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoTelefonoNombre2_N", gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmail1_N", gxTv_SdtUsuario_Usuariotecnicoemail1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmail2_N", gxTv_SdtUsuario_Usuariotecnicoemail2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmailNombre1_N", gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioTecnicoEmailNombre2_N", gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioRutTipo_N", gxTv_SdtUsuario_Usuarioruttipo_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacDireccion_N", gxTv_SdtUsuario_Usuariofacdireccion_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacLocalidad_N", gxTv_SdtUsuario_Usuariofaclocalidad_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacDepartamento_N", gxTv_SdtUsuario_Usuariofacdepartamento_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioFacEmailEnvio_N", gxTv_SdtUsuario_Usuariofacemailenvio_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelular1_N", gxTv_SdtUsuario_Usuariocobranzacelular1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelular2_N", gxTv_SdtUsuario_Usuariocobranzacelular2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelularNombre1_N", gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaCelularNombre2_N", gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefono1_N", gxTv_SdtUsuario_Usuariocobranzatelefono1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefono2_N", gxTv_SdtUsuario_Usuariocobranzatelefono2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefonoNombre1_N", gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaTelefonoNombre2_N", gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmail1_N", gxTv_SdtUsuario_Usuariocobranzaemail1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmail2_N", gxTv_SdtUsuario_Usuariocobranzaemail2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmailNombre1_N", gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCobranzaEmailNombre2_N", gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N, false, includeNonInitialized);
         AddObjectProperty("UsuarioCedula_N", gxTv_SdtUsuario_Usuariocedula_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtUsuario sdt )
   {
      if ( sdt.IsDirty("UsuarioId") )
      {
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioid = sdt.getgxTv_SdtUsuario_Usuarioid() ;
      }
      if ( sdt.IsDirty("UsuarioEmail") )
      {
         gxTv_SdtUsuario_Usuarioemail_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioemail = sdt.getgxTv_SdtUsuario_Usuarioemail() ;
      }
      if ( sdt.IsDirty("UsuarioUsuarioWeb") )
      {
         gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariousuarioweb = sdt.getgxTv_SdtUsuario_Usuariousuarioweb() ;
      }
      if ( sdt.IsDirty("UsuarioNombre") )
      {
         gxTv_SdtUsuario_Usuarionombre_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionombre = sdt.getgxTv_SdtUsuario_Usuarionombre() ;
      }
      if ( sdt.IsDirty("UsuarioDicose") )
      {
         gxTv_SdtUsuario_Usuariodicose_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariodicose = sdt.getgxTv_SdtUsuario_Usuariodicose() ;
      }
      if ( sdt.IsDirty("UsuarioRazonSocial") )
      {
         gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariorazonsocial = sdt.getgxTv_SdtUsuario_Usuariorazonsocial() ;
      }
      if ( sdt.IsDirty("UsuarioRut") )
      {
         gxTv_SdtUsuario_Usuariorut_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariorut = sdt.getgxTv_SdtUsuario_Usuariorut() ;
      }
      if ( sdt.IsDirty("UsuarioIdNet") )
      {
         gxTv_SdtUsuario_Usuarioidnet_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioidnet = sdt.getgxTv_SdtUsuario_Usuarioidnet() ;
      }
      if ( sdt.IsDirty("UsuarioDireccion") )
      {
         gxTv_SdtUsuario_Usuariodireccion_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariodireccion = sdt.getgxTv_SdtUsuario_Usuariodireccion() ;
      }
      if ( sdt.IsDirty("UsuarioTipousuario") )
      {
         gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotipousuario = sdt.getgxTv_SdtUsuario_Usuariotipousuario() ;
      }
      if ( sdt.IsDirty("UsuarioIdTecnico1") )
      {
         gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioidtecnico1 = sdt.getgxTv_SdtUsuario_Usuarioidtecnico1() ;
      }
      if ( sdt.IsDirty("UsuarioIdTecnico2") )
      {
         gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioidtecnico2 = sdt.getgxTv_SdtUsuario_Usuarioidtecnico2() ;
      }
      if ( sdt.IsDirty("UsuarioIdTecnico3") )
      {
         gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioidtecnico3 = sdt.getgxTv_SdtUsuario_Usuarioidtecnico3() ;
      }
      if ( sdt.IsDirty("UsuarioDireccionFrasco") )
      {
         gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariodireccionfrasco = sdt.getgxTv_SdtUsuario_Usuariodireccionfrasco() ;
      }
      if ( sdt.IsDirty("UsuarioAgenciaFrasco") )
      {
         gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioagenciafrasco = sdt.getgxTv_SdtUsuario_Usuarioagenciafrasco() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionFrasco1") )
      {
         gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionfrasco1 = sdt.getgxTv_SdtUsuario_Usuarionotificacionfrasco1() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionFrasco2") )
      {
         gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionfrasco2 = sdt.getgxTv_SdtUsuario_Usuarionotificacionfrasco2() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionSolicitud1") )
      {
         gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = sdt.getgxTv_SdtUsuario_Usuarionotificacionsolicitud1() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionSolicitud2") )
      {
         gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = sdt.getgxTv_SdtUsuario_Usuarionotificacionsolicitud2() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionResultado1") )
      {
         gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionresultado1 = sdt.getgxTv_SdtUsuario_Usuarionotificacionresultado1() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionResultado2") )
      {
         gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionresultado2 = sdt.getgxTv_SdtUsuario_Usuarionotificacionresultado2() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionAvisos1") )
      {
         gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionavisos1 = sdt.getgxTv_SdtUsuario_Usuarionotificacionavisos1() ;
      }
      if ( sdt.IsDirty("UsuarioNotificacionAvisos2") )
      {
         gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarionotificacionavisos2 = sdt.getgxTv_SdtUsuario_Usuarionotificacionavisos2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoCelular1") )
      {
         gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicocelular1 = sdt.getgxTv_SdtUsuario_Usuariotecnicocelular1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoCelular2") )
      {
         gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicocelular2 = sdt.getgxTv_SdtUsuario_Usuariotecnicocelular2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoCelularNombre1") )
      {
         gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = sdt.getgxTv_SdtUsuario_Usuariotecnicocelularnombre1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoCelularNombre2") )
      {
         gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = sdt.getgxTv_SdtUsuario_Usuariotecnicocelularnombre2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoTelefono1") )
      {
         gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicotelefono1 = sdt.getgxTv_SdtUsuario_Usuariotecnicotelefono1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoTelefono2") )
      {
         gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicotelefono2 = sdt.getgxTv_SdtUsuario_Usuariotecnicotelefono2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoTelefonoNombre1") )
      {
         gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = sdt.getgxTv_SdtUsuario_Usuariotecnicotelefononombre1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoTelefonoNombre2") )
      {
         gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = sdt.getgxTv_SdtUsuario_Usuariotecnicotelefononombre2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoEmail1") )
      {
         gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicoemail1 = sdt.getgxTv_SdtUsuario_Usuariotecnicoemail1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoEmail2") )
      {
         gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicoemail2 = sdt.getgxTv_SdtUsuario_Usuariotecnicoemail2() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoEmailNombre1") )
      {
         gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = sdt.getgxTv_SdtUsuario_Usuariotecnicoemailnombre1() ;
      }
      if ( sdt.IsDirty("UsuarioTecnicoEmailNombre2") )
      {
         gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = sdt.getgxTv_SdtUsuario_Usuariotecnicoemailnombre2() ;
      }
      if ( sdt.IsDirty("UsuarioRutTipo") )
      {
         gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuarioruttipo = sdt.getgxTv_SdtUsuario_Usuarioruttipo() ;
      }
      if ( sdt.IsDirty("UsuarioFacDireccion") )
      {
         gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariofacdireccion = sdt.getgxTv_SdtUsuario_Usuariofacdireccion() ;
      }
      if ( sdt.IsDirty("UsuarioFacLocalidad") )
      {
         gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariofaclocalidad = sdt.getgxTv_SdtUsuario_Usuariofaclocalidad() ;
      }
      if ( sdt.IsDirty("UsuarioFacDepartamento") )
      {
         gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariofacdepartamento = sdt.getgxTv_SdtUsuario_Usuariofacdepartamento() ;
      }
      if ( sdt.IsDirty("UsuarioFacEmailEnvio") )
      {
         gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariofacemailenvio = sdt.getgxTv_SdtUsuario_Usuariofacemailenvio() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaCelular1") )
      {
         gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzacelular1 = sdt.getgxTv_SdtUsuario_Usuariocobranzacelular1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaCelular2") )
      {
         gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzacelular2 = sdt.getgxTv_SdtUsuario_Usuariocobranzacelular2() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaCelularNombre1") )
      {
         gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = sdt.getgxTv_SdtUsuario_Usuariocobranzacelularnombre1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaCelularNombre2") )
      {
         gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = sdt.getgxTv_SdtUsuario_Usuariocobranzacelularnombre2() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaTelefono1") )
      {
         gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzatelefono1 = sdt.getgxTv_SdtUsuario_Usuariocobranzatelefono1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaTelefono2") )
      {
         gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzatelefono2 = sdt.getgxTv_SdtUsuario_Usuariocobranzatelefono2() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaTelefonoNombre1") )
      {
         gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = sdt.getgxTv_SdtUsuario_Usuariocobranzatelefononombre1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaTelefonoNombre2") )
      {
         gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = sdt.getgxTv_SdtUsuario_Usuariocobranzatelefononombre2() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaEmail1") )
      {
         gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzaemail1 = sdt.getgxTv_SdtUsuario_Usuariocobranzaemail1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaEmail2") )
      {
         gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzaemail2 = sdt.getgxTv_SdtUsuario_Usuariocobranzaemail2() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaEmailNombre1") )
      {
         gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = sdt.getgxTv_SdtUsuario_Usuariocobranzaemailnombre1() ;
      }
      if ( sdt.IsDirty("UsuarioCobranzaEmailNombre2") )
      {
         gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = sdt.getgxTv_SdtUsuario_Usuariocobranzaemailnombre2() ;
      }
      if ( sdt.IsDirty("UsuarioCedula") )
      {
         gxTv_SdtUsuario_Usuariocedula_N = (byte)(0) ;
         gxTv_SdtUsuario_N = (byte)(0) ;
         gxTv_SdtUsuario_Usuariocedula = sdt.getgxTv_SdtUsuario_Usuariocedula() ;
      }
   }

   public long getgxTv_SdtUsuario_Usuarioid( )
   {
      return gxTv_SdtUsuario_Usuarioid ;
   }

   public void setgxTv_SdtUsuario_Usuarioid( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      if ( gxTv_SdtUsuario_Usuarioid != value )
      {
         gxTv_SdtUsuario_Mode = "INS" ;
         this.setgxTv_SdtUsuario_Usuarioid_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioemail_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariousuarioweb_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionombre_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariodicose_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariorazonsocial_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariorut_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioidnet_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariodireccion_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotipousuario_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioidtecnico1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioidtecnico2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioidtecnico3_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariodireccionfrasco_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioagenciafrasco_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionresultado1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionresultado2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionavisos1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarionotificacionavisos2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicocelular1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicocelular2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicotelefono1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicotelefono2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicoemail1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicoemail2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuarioruttipo_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariofacdireccion_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariofaclocalidad_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariofacdepartamento_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariofacemailenvio_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzacelular1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzacelular2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzatelefono1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzatelefono2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzaemail1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzaemail2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z_SetNull( );
         this.setgxTv_SdtUsuario_Usuariocedula_Z_SetNull( );
      }
      SetDirty("Usuarioid");
      gxTv_SdtUsuario_Usuarioid = value ;
   }

   public String getgxTv_SdtUsuario_Usuarioemail( )
   {
      return gxTv_SdtUsuario_Usuarioemail ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail( String value )
   {
      gxTv_SdtUsuario_Usuarioemail_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioemail");
      gxTv_SdtUsuario_Usuarioemail = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioemail_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioemail = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioemail_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioemail_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariousuarioweb( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb( String value )
   {
      gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariousuarioweb");
      gxTv_SdtUsuario_Usuariousuarioweb = value ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb_SetNull( )
   {
      gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariousuarioweb = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariousuarioweb_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariousuarioweb_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionombre( )
   {
      return gxTv_SdtUsuario_Usuarionombre ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre( String value )
   {
      gxTv_SdtUsuario_Usuarionombre_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionombre");
      gxTv_SdtUsuario_Usuarionombre = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionombre_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionombre = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionombre_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionombre_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariodicose( )
   {
      return gxTv_SdtUsuario_Usuariodicose ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose( String value )
   {
      gxTv_SdtUsuario_Usuariodicose_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodicose");
      gxTv_SdtUsuario_Usuariodicose = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodicose_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodicose = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodicose_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariodicose_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariorazonsocial( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial( String value )
   {
      gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorazonsocial");
      gxTv_SdtUsuario_Usuariorazonsocial = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariorazonsocial = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorazonsocial_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariorazonsocial_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariorut( )
   {
      return gxTv_SdtUsuario_Usuariorut ;
   }

   public void setgxTv_SdtUsuario_Usuariorut( String value )
   {
      gxTv_SdtUsuario_Usuariorut_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorut");
      gxTv_SdtUsuario_Usuariorut = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorut_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorut_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariorut = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorut_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariorut_N==1) ;
   }

   public long getgxTv_SdtUsuario_Usuarioidnet( )
   {
      return gxTv_SdtUsuario_Usuarioidnet ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet( long value )
   {
      gxTv_SdtUsuario_Usuarioidnet_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidnet");
      gxTv_SdtUsuario_Usuarioidnet = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidnet_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidnet = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidnet_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioidnet_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariodireccion( )
   {
      return gxTv_SdtUsuario_Usuariodireccion ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion( String value )
   {
      gxTv_SdtUsuario_Usuariodireccion_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccion");
      gxTv_SdtUsuario_Usuariodireccion = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccion_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodireccion = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccion_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariodireccion_N==1) ;
   }

   public short getgxTv_SdtUsuario_Usuariotipousuario( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario( short value )
   {
      gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotipousuario");
      gxTv_SdtUsuario_Usuariotipousuario = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotipousuario = (short)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotipousuario_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotipousuario_N==1) ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico1( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1 ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico1");
      gxTv_SdtUsuario_Usuarioidtecnico1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico1 = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioidtecnico1_N==1) ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico2( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2 ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico2");
      gxTv_SdtUsuario_Usuarioidtecnico2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico2 = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioidtecnico2_N==1) ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico3( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3 ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3( long value )
   {
      gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico3");
      gxTv_SdtUsuario_Usuarioidtecnico3 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioidtecnico3 = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico3_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioidtecnico3_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariodireccionfrasco( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco( String value )
   {
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccionfrasco");
      gxTv_SdtUsuario_Usuariodireccionfrasco = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariodireccionfrasco = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccionfrasco_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariodireccionfrasco_N==1) ;
   }

   public short getgxTv_SdtUsuario_Usuarioagenciafrasco( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco( short value )
   {
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioagenciafrasco");
      gxTv_SdtUsuario_Usuarioagenciafrasco = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioagenciafrasco = (short)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioagenciafrasco_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioagenciafrasco_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco1");
      gxTv_SdtUsuario_Usuarionotificacionfrasco1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionfrasco1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco2");
      gxTv_SdtUsuario_Usuarionotificacionfrasco2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionfrasco2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionfrasco2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud1");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud2");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionresultado1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado1");
      gxTv_SdtUsuario_Usuarionotificacionresultado1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionresultado1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionresultado2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado2");
      gxTv_SdtUsuario_Usuarionotificacionresultado2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionresultado2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionresultado2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionavisos1( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos1");
      gxTv_SdtUsuario_Usuarionotificacionavisos1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionavisos1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionavisos2( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2 ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2( String value )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos2");
      gxTv_SdtUsuario_Usuarionotificacionavisos2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarionotificacionavisos2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarionotificacionavisos2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelular1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular1");
      gxTv_SdtUsuario_Usuariotecnicocelular1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelular1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicocelular1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelular2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular2");
      gxTv_SdtUsuario_Usuariotecnicocelular2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelular2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicocelular2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre1");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre2");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefono1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono1");
      gxTv_SdtUsuario_Usuariotecnicotelefono1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicotelefono1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefono2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono2");
      gxTv_SdtUsuario_Usuariotecnicotelefono2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefono2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicotelefono2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre1");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre2");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemail1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail1");
      gxTv_SdtUsuario_Usuariotecnicoemail1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemail1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicoemail1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemail2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail2");
      gxTv_SdtUsuario_Usuariotecnicoemail2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemail2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicoemail2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre1( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre1");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre2( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre2");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuarioruttipo( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo( String value )
   {
      gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioruttipo");
      gxTv_SdtUsuario_Usuarioruttipo = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuarioruttipo = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioruttipo_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuarioruttipo_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariofacdireccion( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion( String value )
   {
      gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdireccion");
      gxTv_SdtUsuario_Usuariofacdireccion = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacdireccion = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdireccion_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariofacdireccion_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariofaclocalidad( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad( String value )
   {
      gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofaclocalidad");
      gxTv_SdtUsuario_Usuariofaclocalidad = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofaclocalidad = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofaclocalidad_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariofaclocalidad_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariofacdepartamento( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento( String value )
   {
      gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdepartamento");
      gxTv_SdtUsuario_Usuariofacdepartamento = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacdepartamento = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdepartamento_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariofacdepartamento_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariofacemailenvio( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio( String value )
   {
      gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacemailenvio");
      gxTv_SdtUsuario_Usuariofacemailenvio = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariofacemailenvio = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacemailenvio_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariofacemailenvio_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelular1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular1");
      gxTv_SdtUsuario_Usuariocobranzacelular1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelular1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzacelular1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelular2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular2");
      gxTv_SdtUsuario_Usuariocobranzacelular2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelular2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzacelular2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre1");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre2");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefono1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono1");
      gxTv_SdtUsuario_Usuariocobranzatelefono1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzatelefono1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefono2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono2");
      gxTv_SdtUsuario_Usuariocobranzatelefono2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefono2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzatelefono2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre1");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre2");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemail1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail1");
      gxTv_SdtUsuario_Usuariocobranzaemail1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemail1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzaemail1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemail2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail2");
      gxTv_SdtUsuario_Usuariocobranzaemail2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemail2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzaemail2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre1( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre1");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre2( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2 ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2( String value )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre2");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2 = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N==1) ;
   }

   public String getgxTv_SdtUsuario_Usuariocedula( )
   {
      return gxTv_SdtUsuario_Usuariocedula ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula( String value )
   {
      gxTv_SdtUsuario_Usuariocedula_N = (byte)(0) ;
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocedula");
      gxTv_SdtUsuario_Usuariocedula = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocedula_N = (byte)(1) ;
      gxTv_SdtUsuario_Usuariocedula = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocedula_IsNull( )
   {
      return (gxTv_SdtUsuario_Usuariocedula_N==1) ;
   }

   public String getgxTv_SdtUsuario_Mode( )
   {
      return gxTv_SdtUsuario_Mode ;
   }

   public void setgxTv_SdtUsuario_Mode( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtUsuario_Mode = value ;
   }

   public void setgxTv_SdtUsuario_Mode_SetNull( )
   {
      gxTv_SdtUsuario_Mode = "" ;
   }

   public boolean getgxTv_SdtUsuario_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUsuario_Initialized( )
   {
      return gxTv_SdtUsuario_Initialized ;
   }

   public void setgxTv_SdtUsuario_Initialized( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtUsuario_Initialized = value ;
   }

   public void setgxTv_SdtUsuario_Initialized_SetNull( )
   {
      gxTv_SdtUsuario_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUsuario_Usuarioid_Z( )
   {
      return gxTv_SdtUsuario_Usuarioid_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioid_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioid_Z");
      gxTv_SdtUsuario_Usuarioid_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioid_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioid_Z = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarioemail_Z( )
   {
      return gxTv_SdtUsuario_Usuarioemail_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioemail_Z");
      gxTv_SdtUsuario_Usuarioemail_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioemail_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioemail_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariousuarioweb_Z( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariousuarioweb_Z");
      gxTv_SdtUsuario_Usuariousuarioweb_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariousuarioweb_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariousuarioweb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionombre_Z( )
   {
      return gxTv_SdtUsuario_Usuarionombre_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionombre_Z");
      gxTv_SdtUsuario_Usuarionombre_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionombre_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionombre_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariodicose_Z( )
   {
      return gxTv_SdtUsuario_Usuariodicose_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodicose_Z");
      gxTv_SdtUsuario_Usuariodicose_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodicose_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodicose_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariorazonsocial_Z( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorazonsocial_Z");
      gxTv_SdtUsuario_Usuariorazonsocial_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorazonsocial_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorazonsocial_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariorut_Z( )
   {
      return gxTv_SdtUsuario_Usuariorut_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariorut_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorut_Z");
      gxTv_SdtUsuario_Usuariorut_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorut_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorut_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorut_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUsuario_Usuarioidnet_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidnet_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidnet_Z");
      gxTv_SdtUsuario_Usuarioidnet_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidnet_Z = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidnet_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariodireccion_Z( )
   {
      return gxTv_SdtUsuario_Usuariodireccion_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccion_Z");
      gxTv_SdtUsuario_Usuariodireccion_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccion_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccion_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUsuario_Usuariotipousuario_Z( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario_Z( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotipousuario_Z");
      gxTv_SdtUsuario_Usuariotipousuario_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotipousuario_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotipousuario_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico1_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico1_Z");
      gxTv_SdtUsuario_Usuarioidtecnico1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico1_Z = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico1_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico2_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico2_Z");
      gxTv_SdtUsuario_Usuarioidtecnico2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico2_Z = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico2_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUsuario_Usuarioidtecnico3_Z( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3_Z( long value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico3_Z");
      gxTv_SdtUsuario_Usuarioidtecnico3_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico3_Z = 0 ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariodireccionfrasco_Z( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccionfrasco_Z");
      gxTv_SdtUsuario_Usuariodireccionfrasco_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccionfrasco_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccionfrasco_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUsuario_Usuarioagenciafrasco_Z( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco_Z( short value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioagenciafrasco_Z");
      gxTv_SdtUsuario_Usuarioagenciafrasco_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioagenciafrasco_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioagenciafrasco_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco1_Z");
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco2_Z");
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud1_Z");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud2_Z");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionresultado1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado1_Z");
      gxTv_SdtUsuario_Usuarionotificacionresultado1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionresultado2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado2_Z");
      gxTv_SdtUsuario_Usuarionotificacionresultado2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionavisos1_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos1_Z");
      gxTv_SdtUsuario_Usuarionotificacionavisos1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarionotificacionavisos2_Z( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos2_Z");
      gxTv_SdtUsuario_Usuarionotificacionavisos2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelular1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular1_Z");
      gxTv_SdtUsuario_Usuariotecnicocelular1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelular2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular2_Z");
      gxTv_SdtUsuario_Usuariotecnicocelular2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre1_Z");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre2_Z");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefono1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono1_Z");
      gxTv_SdtUsuario_Usuariotecnicotelefono1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefono2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono2_Z");
      gxTv_SdtUsuario_Usuariotecnicotelefono2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre1_Z");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre2_Z");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemail1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail1_Z");
      gxTv_SdtUsuario_Usuariotecnicoemail1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemail2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail2_Z");
      gxTv_SdtUsuario_Usuariotecnicoemail2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre1_Z");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre2_Z");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuarioruttipo_Z( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo_Z ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioruttipo_Z");
      gxTv_SdtUsuario_Usuarioruttipo_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioruttipo_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioruttipo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariofacdireccion_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdireccion_Z");
      gxTv_SdtUsuario_Usuariofacdireccion_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdireccion_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdireccion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariofaclocalidad_Z( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofaclocalidad_Z");
      gxTv_SdtUsuario_Usuariofaclocalidad_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofaclocalidad_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofaclocalidad_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariofacdepartamento_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdepartamento_Z");
      gxTv_SdtUsuario_Usuariofacdepartamento_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdepartamento_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdepartamento_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariofacemailenvio_Z( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacemailenvio_Z");
      gxTv_SdtUsuario_Usuariofacemailenvio_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacemailenvio_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacemailenvio_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelular1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular1_Z");
      gxTv_SdtUsuario_Usuariocobranzacelular1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelular2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular2_Z");
      gxTv_SdtUsuario_Usuariocobranzacelular2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre1_Z");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre2_Z");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefono1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono1_Z");
      gxTv_SdtUsuario_Usuariocobranzatelefono1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefono2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono2_Z");
      gxTv_SdtUsuario_Usuariocobranzatelefono2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre1_Z");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre2_Z");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemail1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail1_Z");
      gxTv_SdtUsuario_Usuariocobranzaemail1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemail2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail2_Z");
      gxTv_SdtUsuario_Usuariocobranzaemail2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre1_Z");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre2_Z");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUsuario_Usuariocedula_Z( )
   {
      return gxTv_SdtUsuario_Usuariocedula_Z ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula_Z( String value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocedula_Z");
      gxTv_SdtUsuario_Usuariocedula_Z = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula_Z_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocedula_Z = "" ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocedula_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioemail_N( )
   {
      return gxTv_SdtUsuario_Usuarioemail_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioemail_N");
      gxTv_SdtUsuario_Usuarioemail_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioemail_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioemail_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioemail_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariousuarioweb_N( )
   {
      return gxTv_SdtUsuario_Usuariousuarioweb_N ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariousuarioweb_N");
      gxTv_SdtUsuario_Usuariousuarioweb_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariousuarioweb_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariousuarioweb_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariousuarioweb_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionombre_N( )
   {
      return gxTv_SdtUsuario_Usuarionombre_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionombre_N");
      gxTv_SdtUsuario_Usuarionombre_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionombre_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionombre_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionombre_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariodicose_N( )
   {
      return gxTv_SdtUsuario_Usuariodicose_N ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodicose_N");
      gxTv_SdtUsuario_Usuariodicose_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodicose_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodicose_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodicose_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariorazonsocial_N( )
   {
      return gxTv_SdtUsuario_Usuariorazonsocial_N ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorazonsocial_N");
      gxTv_SdtUsuario_Usuariorazonsocial_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorazonsocial_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorazonsocial_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorazonsocial_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariorut_N( )
   {
      return gxTv_SdtUsuario_Usuariorut_N ;
   }

   public void setgxTv_SdtUsuario_Usuariorut_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariorut_N");
      gxTv_SdtUsuario_Usuariorut_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariorut_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariorut_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariorut_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioidnet_N( )
   {
      return gxTv_SdtUsuario_Usuarioidnet_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidnet_N");
      gxTv_SdtUsuario_Usuarioidnet_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidnet_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidnet_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidnet_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariodireccion_N( )
   {
      return gxTv_SdtUsuario_Usuariodireccion_N ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccion_N");
      gxTv_SdtUsuario_Usuariodireccion_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccion_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotipousuario_N( )
   {
      return gxTv_SdtUsuario_Usuariotipousuario_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotipousuario_N");
      gxTv_SdtUsuario_Usuariotipousuario_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotipousuario_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotipousuario_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotipousuario_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioidtecnico1_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico1_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico1_N");
      gxTv_SdtUsuario_Usuarioidtecnico1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioidtecnico2_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico2_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico2_N");
      gxTv_SdtUsuario_Usuarioidtecnico2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioidtecnico3_N( )
   {
      return gxTv_SdtUsuario_Usuarioidtecnico3_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioidtecnico3_N");
      gxTv_SdtUsuario_Usuarioidtecnico3_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioidtecnico3_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioidtecnico3_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioidtecnico3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariodireccionfrasco_N( )
   {
      return gxTv_SdtUsuario_Usuariodireccionfrasco_N ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariodireccionfrasco_N");
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariodireccionfrasco_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariodireccionfrasco_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariodireccionfrasco_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioagenciafrasco_N( )
   {
      return gxTv_SdtUsuario_Usuarioagenciafrasco_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioagenciafrasco_N");
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioagenciafrasco_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioagenciafrasco_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioagenciafrasco_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionfrasco1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco1_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco1_N");
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionfrasco2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionfrasco2_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionfrasco2_N");
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionfrasco2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionfrasco2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionfrasco2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud1_N");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionsolicitud2_N");
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionresultado1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado1_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado1_N");
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionresultado2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionresultado2_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionresultado2_N");
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionresultado2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionresultado2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionresultado2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionavisos1_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos1_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos1_N");
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarionotificacionavisos2_N( )
   {
      return gxTv_SdtUsuario_Usuarionotificacionavisos2_N ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarionotificacionavisos2_N");
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarionotificacionavisos2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarionotificacionavisos2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarionotificacionavisos2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicocelular1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular1_N");
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicocelular2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelular2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelular2_N");
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelular2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre1_N");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicocelularnombre2_N");
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicotelefono1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono1_N");
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicotelefono2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefono2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefono2_N");
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefono2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre1_N");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicotelefononombre2_N");
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicoemail1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail1_N");
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicoemail2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemail2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemail2_N");
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemail2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre1_N");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariotecnicoemailnombre2_N");
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuarioruttipo_N( )
   {
      return gxTv_SdtUsuario_Usuarioruttipo_N ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuarioruttipo_N");
      gxTv_SdtUsuario_Usuarioruttipo_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuarioruttipo_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuarioruttipo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuarioruttipo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariofacdireccion_N( )
   {
      return gxTv_SdtUsuario_Usuariofacdireccion_N ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdireccion_N");
      gxTv_SdtUsuario_Usuariofacdireccion_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdireccion_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdireccion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdireccion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariofaclocalidad_N( )
   {
      return gxTv_SdtUsuario_Usuariofaclocalidad_N ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofaclocalidad_N");
      gxTv_SdtUsuario_Usuariofaclocalidad_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofaclocalidad_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofaclocalidad_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofaclocalidad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariofacdepartamento_N( )
   {
      return gxTv_SdtUsuario_Usuariofacdepartamento_N ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacdepartamento_N");
      gxTv_SdtUsuario_Usuariofacdepartamento_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacdepartamento_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacdepartamento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacdepartamento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariofacemailenvio_N( )
   {
      return gxTv_SdtUsuario_Usuariofacemailenvio_N ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariofacemailenvio_N");
      gxTv_SdtUsuario_Usuariofacemailenvio_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariofacemailenvio_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariofacemailenvio_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariofacemailenvio_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzacelular1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular1_N");
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzacelular2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelular2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelular2_N");
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelular2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre1_N");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzacelularnombre2_N");
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzatelefono1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono1_N");
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzatelefono2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefono2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefono2_N");
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefono2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre1_N");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzatelefononombre2_N");
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzaemail1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail1_N");
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzaemail2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemail2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemail2_N");
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemail2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre1_N");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N( )
   {
      return gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocobranzaemailnombre2_N");
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUsuario_Usuariocedula_N( )
   {
      return gxTv_SdtUsuario_Usuariocedula_N ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula_N( byte value )
   {
      gxTv_SdtUsuario_N = (byte)(0) ;
      SetDirty("Usuariocedula_N");
      gxTv_SdtUsuario_Usuariocedula_N = value ;
   }

   public void setgxTv_SdtUsuario_Usuariocedula_N_SetNull( )
   {
      gxTv_SdtUsuario_Usuariocedula_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtUsuario_Usuariocedula_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.usuario_bc obj;
      obj = new com.colaveco.usuario_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtUsuario_N = (byte)(1) ;
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
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtUsuario_N ;
   }

   public com.colaveco.SdtUsuario Clone( )
   {
      com.colaveco.SdtUsuario sdt;
      com.colaveco.usuario_bc obj;
      sdt = (com.colaveco.SdtUsuario)(clone()) ;
      obj = (com.colaveco.usuario_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtUsuario struct )
   {
      setgxTv_SdtUsuario_Usuarioid(struct.getUsuarioid());
      setgxTv_SdtUsuario_Usuarioemail(struct.getUsuarioemail());
      setgxTv_SdtUsuario_Usuariousuarioweb(struct.getUsuariousuarioweb());
      setgxTv_SdtUsuario_Usuarionombre(struct.getUsuarionombre());
      setgxTv_SdtUsuario_Usuariodicose(struct.getUsuariodicose());
      setgxTv_SdtUsuario_Usuariorazonsocial(struct.getUsuariorazonsocial());
      setgxTv_SdtUsuario_Usuariorut(struct.getUsuariorut());
      setgxTv_SdtUsuario_Usuarioidnet(struct.getUsuarioidnet());
      setgxTv_SdtUsuario_Usuariodireccion(struct.getUsuariodireccion());
      setgxTv_SdtUsuario_Usuariotipousuario(struct.getUsuariotipousuario());
      setgxTv_SdtUsuario_Usuarioidtecnico1(struct.getUsuarioidtecnico1());
      setgxTv_SdtUsuario_Usuarioidtecnico2(struct.getUsuarioidtecnico2());
      setgxTv_SdtUsuario_Usuarioidtecnico3(struct.getUsuarioidtecnico3());
      setgxTv_SdtUsuario_Usuariodireccionfrasco(struct.getUsuariodireccionfrasco());
      setgxTv_SdtUsuario_Usuarioagenciafrasco(struct.getUsuarioagenciafrasco());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco1(struct.getUsuarionotificacionfrasco1());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco2(struct.getUsuarionotificacionfrasco2());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud1(struct.getUsuarionotificacionsolicitud1());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud2(struct.getUsuarionotificacionsolicitud2());
      setgxTv_SdtUsuario_Usuarionotificacionresultado1(struct.getUsuarionotificacionresultado1());
      setgxTv_SdtUsuario_Usuarionotificacionresultado2(struct.getUsuarionotificacionresultado2());
      setgxTv_SdtUsuario_Usuarionotificacionavisos1(struct.getUsuarionotificacionavisos1());
      setgxTv_SdtUsuario_Usuarionotificacionavisos2(struct.getUsuarionotificacionavisos2());
      setgxTv_SdtUsuario_Usuariotecnicocelular1(struct.getUsuariotecnicocelular1());
      setgxTv_SdtUsuario_Usuariotecnicocelular2(struct.getUsuariotecnicocelular2());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre1(struct.getUsuariotecnicocelularnombre1());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre2(struct.getUsuariotecnicocelularnombre2());
      setgxTv_SdtUsuario_Usuariotecnicotelefono1(struct.getUsuariotecnicotelefono1());
      setgxTv_SdtUsuario_Usuariotecnicotelefono2(struct.getUsuariotecnicotelefono2());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre1(struct.getUsuariotecnicotelefononombre1());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre2(struct.getUsuariotecnicotelefononombre2());
      setgxTv_SdtUsuario_Usuariotecnicoemail1(struct.getUsuariotecnicoemail1());
      setgxTv_SdtUsuario_Usuariotecnicoemail2(struct.getUsuariotecnicoemail2());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre1(struct.getUsuariotecnicoemailnombre1());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre2(struct.getUsuariotecnicoemailnombre2());
      setgxTv_SdtUsuario_Usuarioruttipo(struct.getUsuarioruttipo());
      setgxTv_SdtUsuario_Usuariofacdireccion(struct.getUsuariofacdireccion());
      setgxTv_SdtUsuario_Usuariofaclocalidad(struct.getUsuariofaclocalidad());
      setgxTv_SdtUsuario_Usuariofacdepartamento(struct.getUsuariofacdepartamento());
      setgxTv_SdtUsuario_Usuariofacemailenvio(struct.getUsuariofacemailenvio());
      setgxTv_SdtUsuario_Usuariocobranzacelular1(struct.getUsuariocobranzacelular1());
      setgxTv_SdtUsuario_Usuariocobranzacelular2(struct.getUsuariocobranzacelular2());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre1(struct.getUsuariocobranzacelularnombre1());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre2(struct.getUsuariocobranzacelularnombre2());
      setgxTv_SdtUsuario_Usuariocobranzatelefono1(struct.getUsuariocobranzatelefono1());
      setgxTv_SdtUsuario_Usuariocobranzatelefono2(struct.getUsuariocobranzatelefono2());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre1(struct.getUsuariocobranzatelefononombre1());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre2(struct.getUsuariocobranzatelefononombre2());
      setgxTv_SdtUsuario_Usuariocobranzaemail1(struct.getUsuariocobranzaemail1());
      setgxTv_SdtUsuario_Usuariocobranzaemail2(struct.getUsuariocobranzaemail2());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre1(struct.getUsuariocobranzaemailnombre1());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre2(struct.getUsuariocobranzaemailnombre2());
      setgxTv_SdtUsuario_Usuariocedula(struct.getUsuariocedula());
      setgxTv_SdtUsuario_Mode(struct.getMode());
      setgxTv_SdtUsuario_Initialized(struct.getInitialized());
      setgxTv_SdtUsuario_Usuarioid_Z(struct.getUsuarioid_Z());
      setgxTv_SdtUsuario_Usuarioemail_Z(struct.getUsuarioemail_Z());
      setgxTv_SdtUsuario_Usuariousuarioweb_Z(struct.getUsuariousuarioweb_Z());
      setgxTv_SdtUsuario_Usuarionombre_Z(struct.getUsuarionombre_Z());
      setgxTv_SdtUsuario_Usuariodicose_Z(struct.getUsuariodicose_Z());
      setgxTv_SdtUsuario_Usuariorazonsocial_Z(struct.getUsuariorazonsocial_Z());
      setgxTv_SdtUsuario_Usuariorut_Z(struct.getUsuariorut_Z());
      setgxTv_SdtUsuario_Usuarioidnet_Z(struct.getUsuarioidnet_Z());
      setgxTv_SdtUsuario_Usuariodireccion_Z(struct.getUsuariodireccion_Z());
      setgxTv_SdtUsuario_Usuariotipousuario_Z(struct.getUsuariotipousuario_Z());
      setgxTv_SdtUsuario_Usuarioidtecnico1_Z(struct.getUsuarioidtecnico1_Z());
      setgxTv_SdtUsuario_Usuarioidtecnico2_Z(struct.getUsuarioidtecnico2_Z());
      setgxTv_SdtUsuario_Usuarioidtecnico3_Z(struct.getUsuarioidtecnico3_Z());
      setgxTv_SdtUsuario_Usuariodireccionfrasco_Z(struct.getUsuariodireccionfrasco_Z());
      setgxTv_SdtUsuario_Usuarioagenciafrasco_Z(struct.getUsuarioagenciafrasco_Z());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z(struct.getUsuarionotificacionfrasco1_Z());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z(struct.getUsuarionotificacionfrasco2_Z());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z(struct.getUsuarionotificacionsolicitud1_Z());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z(struct.getUsuarionotificacionsolicitud2_Z());
      setgxTv_SdtUsuario_Usuarionotificacionresultado1_Z(struct.getUsuarionotificacionresultado1_Z());
      setgxTv_SdtUsuario_Usuarionotificacionresultado2_Z(struct.getUsuarionotificacionresultado2_Z());
      setgxTv_SdtUsuario_Usuarionotificacionavisos1_Z(struct.getUsuarionotificacionavisos1_Z());
      setgxTv_SdtUsuario_Usuarionotificacionavisos2_Z(struct.getUsuarionotificacionavisos2_Z());
      setgxTv_SdtUsuario_Usuariotecnicocelular1_Z(struct.getUsuariotecnicocelular1_Z());
      setgxTv_SdtUsuario_Usuariotecnicocelular2_Z(struct.getUsuariotecnicocelular2_Z());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z(struct.getUsuariotecnicocelularnombre1_Z());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z(struct.getUsuariotecnicocelularnombre2_Z());
      setgxTv_SdtUsuario_Usuariotecnicotelefono1_Z(struct.getUsuariotecnicotelefono1_Z());
      setgxTv_SdtUsuario_Usuariotecnicotelefono2_Z(struct.getUsuariotecnicotelefono2_Z());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z(struct.getUsuariotecnicotelefononombre1_Z());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z(struct.getUsuariotecnicotelefononombre2_Z());
      setgxTv_SdtUsuario_Usuariotecnicoemail1_Z(struct.getUsuariotecnicoemail1_Z());
      setgxTv_SdtUsuario_Usuariotecnicoemail2_Z(struct.getUsuariotecnicoemail2_Z());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z(struct.getUsuariotecnicoemailnombre1_Z());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z(struct.getUsuariotecnicoemailnombre2_Z());
      setgxTv_SdtUsuario_Usuarioruttipo_Z(struct.getUsuarioruttipo_Z());
      setgxTv_SdtUsuario_Usuariofacdireccion_Z(struct.getUsuariofacdireccion_Z());
      setgxTv_SdtUsuario_Usuariofaclocalidad_Z(struct.getUsuariofaclocalidad_Z());
      setgxTv_SdtUsuario_Usuariofacdepartamento_Z(struct.getUsuariofacdepartamento_Z());
      setgxTv_SdtUsuario_Usuariofacemailenvio_Z(struct.getUsuariofacemailenvio_Z());
      setgxTv_SdtUsuario_Usuariocobranzacelular1_Z(struct.getUsuariocobranzacelular1_Z());
      setgxTv_SdtUsuario_Usuariocobranzacelular2_Z(struct.getUsuariocobranzacelular2_Z());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z(struct.getUsuariocobranzacelularnombre1_Z());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z(struct.getUsuariocobranzacelularnombre2_Z());
      setgxTv_SdtUsuario_Usuariocobranzatelefono1_Z(struct.getUsuariocobranzatelefono1_Z());
      setgxTv_SdtUsuario_Usuariocobranzatelefono2_Z(struct.getUsuariocobranzatelefono2_Z());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z(struct.getUsuariocobranzatelefononombre1_Z());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z(struct.getUsuariocobranzatelefononombre2_Z());
      setgxTv_SdtUsuario_Usuariocobranzaemail1_Z(struct.getUsuariocobranzaemail1_Z());
      setgxTv_SdtUsuario_Usuariocobranzaemail2_Z(struct.getUsuariocobranzaemail2_Z());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z(struct.getUsuariocobranzaemailnombre1_Z());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z(struct.getUsuariocobranzaemailnombre2_Z());
      setgxTv_SdtUsuario_Usuariocedula_Z(struct.getUsuariocedula_Z());
      setgxTv_SdtUsuario_Usuarioemail_N(struct.getUsuarioemail_N());
      setgxTv_SdtUsuario_Usuariousuarioweb_N(struct.getUsuariousuarioweb_N());
      setgxTv_SdtUsuario_Usuarionombre_N(struct.getUsuarionombre_N());
      setgxTv_SdtUsuario_Usuariodicose_N(struct.getUsuariodicose_N());
      setgxTv_SdtUsuario_Usuariorazonsocial_N(struct.getUsuariorazonsocial_N());
      setgxTv_SdtUsuario_Usuariorut_N(struct.getUsuariorut_N());
      setgxTv_SdtUsuario_Usuarioidnet_N(struct.getUsuarioidnet_N());
      setgxTv_SdtUsuario_Usuariodireccion_N(struct.getUsuariodireccion_N());
      setgxTv_SdtUsuario_Usuariotipousuario_N(struct.getUsuariotipousuario_N());
      setgxTv_SdtUsuario_Usuarioidtecnico1_N(struct.getUsuarioidtecnico1_N());
      setgxTv_SdtUsuario_Usuarioidtecnico2_N(struct.getUsuarioidtecnico2_N());
      setgxTv_SdtUsuario_Usuarioidtecnico3_N(struct.getUsuarioidtecnico3_N());
      setgxTv_SdtUsuario_Usuariodireccionfrasco_N(struct.getUsuariodireccionfrasco_N());
      setgxTv_SdtUsuario_Usuarioagenciafrasco_N(struct.getUsuarioagenciafrasco_N());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco1_N(struct.getUsuarionotificacionfrasco1_N());
      setgxTv_SdtUsuario_Usuarionotificacionfrasco2_N(struct.getUsuarionotificacionfrasco2_N());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N(struct.getUsuarionotificacionsolicitud1_N());
      setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N(struct.getUsuarionotificacionsolicitud2_N());
      setgxTv_SdtUsuario_Usuarionotificacionresultado1_N(struct.getUsuarionotificacionresultado1_N());
      setgxTv_SdtUsuario_Usuarionotificacionresultado2_N(struct.getUsuarionotificacionresultado2_N());
      setgxTv_SdtUsuario_Usuarionotificacionavisos1_N(struct.getUsuarionotificacionavisos1_N());
      setgxTv_SdtUsuario_Usuarionotificacionavisos2_N(struct.getUsuarionotificacionavisos2_N());
      setgxTv_SdtUsuario_Usuariotecnicocelular1_N(struct.getUsuariotecnicocelular1_N());
      setgxTv_SdtUsuario_Usuariotecnicocelular2_N(struct.getUsuariotecnicocelular2_N());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N(struct.getUsuariotecnicocelularnombre1_N());
      setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N(struct.getUsuariotecnicocelularnombre2_N());
      setgxTv_SdtUsuario_Usuariotecnicotelefono1_N(struct.getUsuariotecnicotelefono1_N());
      setgxTv_SdtUsuario_Usuariotecnicotelefono2_N(struct.getUsuariotecnicotelefono2_N());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N(struct.getUsuariotecnicotelefononombre1_N());
      setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N(struct.getUsuariotecnicotelefononombre2_N());
      setgxTv_SdtUsuario_Usuariotecnicoemail1_N(struct.getUsuariotecnicoemail1_N());
      setgxTv_SdtUsuario_Usuariotecnicoemail2_N(struct.getUsuariotecnicoemail2_N());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N(struct.getUsuariotecnicoemailnombre1_N());
      setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N(struct.getUsuariotecnicoemailnombre2_N());
      setgxTv_SdtUsuario_Usuarioruttipo_N(struct.getUsuarioruttipo_N());
      setgxTv_SdtUsuario_Usuariofacdireccion_N(struct.getUsuariofacdireccion_N());
      setgxTv_SdtUsuario_Usuariofaclocalidad_N(struct.getUsuariofaclocalidad_N());
      setgxTv_SdtUsuario_Usuariofacdepartamento_N(struct.getUsuariofacdepartamento_N());
      setgxTv_SdtUsuario_Usuariofacemailenvio_N(struct.getUsuariofacemailenvio_N());
      setgxTv_SdtUsuario_Usuariocobranzacelular1_N(struct.getUsuariocobranzacelular1_N());
      setgxTv_SdtUsuario_Usuariocobranzacelular2_N(struct.getUsuariocobranzacelular2_N());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N(struct.getUsuariocobranzacelularnombre1_N());
      setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N(struct.getUsuariocobranzacelularnombre2_N());
      setgxTv_SdtUsuario_Usuariocobranzatelefono1_N(struct.getUsuariocobranzatelefono1_N());
      setgxTv_SdtUsuario_Usuariocobranzatelefono2_N(struct.getUsuariocobranzatelefono2_N());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N(struct.getUsuariocobranzatelefononombre1_N());
      setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N(struct.getUsuariocobranzatelefononombre2_N());
      setgxTv_SdtUsuario_Usuariocobranzaemail1_N(struct.getUsuariocobranzaemail1_N());
      setgxTv_SdtUsuario_Usuariocobranzaemail2_N(struct.getUsuariocobranzaemail2_N());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N(struct.getUsuariocobranzaemailnombre1_N());
      setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N(struct.getUsuariocobranzaemailnombre2_N());
      setgxTv_SdtUsuario_Usuariocedula_N(struct.getUsuariocedula_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtUsuario getStruct( )
   {
      com.colaveco.StructSdtUsuario struct = new com.colaveco.StructSdtUsuario ();
      struct.setUsuarioid(getgxTv_SdtUsuario_Usuarioid());
      struct.setUsuarioemail(getgxTv_SdtUsuario_Usuarioemail());
      struct.setUsuariousuarioweb(getgxTv_SdtUsuario_Usuariousuarioweb());
      struct.setUsuarionombre(getgxTv_SdtUsuario_Usuarionombre());
      struct.setUsuariodicose(getgxTv_SdtUsuario_Usuariodicose());
      struct.setUsuariorazonsocial(getgxTv_SdtUsuario_Usuariorazonsocial());
      struct.setUsuariorut(getgxTv_SdtUsuario_Usuariorut());
      struct.setUsuarioidnet(getgxTv_SdtUsuario_Usuarioidnet());
      struct.setUsuariodireccion(getgxTv_SdtUsuario_Usuariodireccion());
      struct.setUsuariotipousuario(getgxTv_SdtUsuario_Usuariotipousuario());
      struct.setUsuarioidtecnico1(getgxTv_SdtUsuario_Usuarioidtecnico1());
      struct.setUsuarioidtecnico2(getgxTv_SdtUsuario_Usuarioidtecnico2());
      struct.setUsuarioidtecnico3(getgxTv_SdtUsuario_Usuarioidtecnico3());
      struct.setUsuariodireccionfrasco(getgxTv_SdtUsuario_Usuariodireccionfrasco());
      struct.setUsuarioagenciafrasco(getgxTv_SdtUsuario_Usuarioagenciafrasco());
      struct.setUsuarionotificacionfrasco1(getgxTv_SdtUsuario_Usuarionotificacionfrasco1());
      struct.setUsuarionotificacionfrasco2(getgxTv_SdtUsuario_Usuarionotificacionfrasco2());
      struct.setUsuarionotificacionsolicitud1(getgxTv_SdtUsuario_Usuarionotificacionsolicitud1());
      struct.setUsuarionotificacionsolicitud2(getgxTv_SdtUsuario_Usuarionotificacionsolicitud2());
      struct.setUsuarionotificacionresultado1(getgxTv_SdtUsuario_Usuarionotificacionresultado1());
      struct.setUsuarionotificacionresultado2(getgxTv_SdtUsuario_Usuarionotificacionresultado2());
      struct.setUsuarionotificacionavisos1(getgxTv_SdtUsuario_Usuarionotificacionavisos1());
      struct.setUsuarionotificacionavisos2(getgxTv_SdtUsuario_Usuarionotificacionavisos2());
      struct.setUsuariotecnicocelular1(getgxTv_SdtUsuario_Usuariotecnicocelular1());
      struct.setUsuariotecnicocelular2(getgxTv_SdtUsuario_Usuariotecnicocelular2());
      struct.setUsuariotecnicocelularnombre1(getgxTv_SdtUsuario_Usuariotecnicocelularnombre1());
      struct.setUsuariotecnicocelularnombre2(getgxTv_SdtUsuario_Usuariotecnicocelularnombre2());
      struct.setUsuariotecnicotelefono1(getgxTv_SdtUsuario_Usuariotecnicotelefono1());
      struct.setUsuariotecnicotelefono2(getgxTv_SdtUsuario_Usuariotecnicotelefono2());
      struct.setUsuariotecnicotelefononombre1(getgxTv_SdtUsuario_Usuariotecnicotelefononombre1());
      struct.setUsuariotecnicotelefononombre2(getgxTv_SdtUsuario_Usuariotecnicotelefononombre2());
      struct.setUsuariotecnicoemail1(getgxTv_SdtUsuario_Usuariotecnicoemail1());
      struct.setUsuariotecnicoemail2(getgxTv_SdtUsuario_Usuariotecnicoemail2());
      struct.setUsuariotecnicoemailnombre1(getgxTv_SdtUsuario_Usuariotecnicoemailnombre1());
      struct.setUsuariotecnicoemailnombre2(getgxTv_SdtUsuario_Usuariotecnicoemailnombre2());
      struct.setUsuarioruttipo(getgxTv_SdtUsuario_Usuarioruttipo());
      struct.setUsuariofacdireccion(getgxTv_SdtUsuario_Usuariofacdireccion());
      struct.setUsuariofaclocalidad(getgxTv_SdtUsuario_Usuariofaclocalidad());
      struct.setUsuariofacdepartamento(getgxTv_SdtUsuario_Usuariofacdepartamento());
      struct.setUsuariofacemailenvio(getgxTv_SdtUsuario_Usuariofacemailenvio());
      struct.setUsuariocobranzacelular1(getgxTv_SdtUsuario_Usuariocobranzacelular1());
      struct.setUsuariocobranzacelular2(getgxTv_SdtUsuario_Usuariocobranzacelular2());
      struct.setUsuariocobranzacelularnombre1(getgxTv_SdtUsuario_Usuariocobranzacelularnombre1());
      struct.setUsuariocobranzacelularnombre2(getgxTv_SdtUsuario_Usuariocobranzacelularnombre2());
      struct.setUsuariocobranzatelefono1(getgxTv_SdtUsuario_Usuariocobranzatelefono1());
      struct.setUsuariocobranzatelefono2(getgxTv_SdtUsuario_Usuariocobranzatelefono2());
      struct.setUsuariocobranzatelefononombre1(getgxTv_SdtUsuario_Usuariocobranzatelefononombre1());
      struct.setUsuariocobranzatelefononombre2(getgxTv_SdtUsuario_Usuariocobranzatelefononombre2());
      struct.setUsuariocobranzaemail1(getgxTv_SdtUsuario_Usuariocobranzaemail1());
      struct.setUsuariocobranzaemail2(getgxTv_SdtUsuario_Usuariocobranzaemail2());
      struct.setUsuariocobranzaemailnombre1(getgxTv_SdtUsuario_Usuariocobranzaemailnombre1());
      struct.setUsuariocobranzaemailnombre2(getgxTv_SdtUsuario_Usuariocobranzaemailnombre2());
      struct.setUsuariocedula(getgxTv_SdtUsuario_Usuariocedula());
      struct.setMode(getgxTv_SdtUsuario_Mode());
      struct.setInitialized(getgxTv_SdtUsuario_Initialized());
      struct.setUsuarioid_Z(getgxTv_SdtUsuario_Usuarioid_Z());
      struct.setUsuarioemail_Z(getgxTv_SdtUsuario_Usuarioemail_Z());
      struct.setUsuariousuarioweb_Z(getgxTv_SdtUsuario_Usuariousuarioweb_Z());
      struct.setUsuarionombre_Z(getgxTv_SdtUsuario_Usuarionombre_Z());
      struct.setUsuariodicose_Z(getgxTv_SdtUsuario_Usuariodicose_Z());
      struct.setUsuariorazonsocial_Z(getgxTv_SdtUsuario_Usuariorazonsocial_Z());
      struct.setUsuariorut_Z(getgxTv_SdtUsuario_Usuariorut_Z());
      struct.setUsuarioidnet_Z(getgxTv_SdtUsuario_Usuarioidnet_Z());
      struct.setUsuariodireccion_Z(getgxTv_SdtUsuario_Usuariodireccion_Z());
      struct.setUsuariotipousuario_Z(getgxTv_SdtUsuario_Usuariotipousuario_Z());
      struct.setUsuarioidtecnico1_Z(getgxTv_SdtUsuario_Usuarioidtecnico1_Z());
      struct.setUsuarioidtecnico2_Z(getgxTv_SdtUsuario_Usuarioidtecnico2_Z());
      struct.setUsuarioidtecnico3_Z(getgxTv_SdtUsuario_Usuarioidtecnico3_Z());
      struct.setUsuariodireccionfrasco_Z(getgxTv_SdtUsuario_Usuariodireccionfrasco_Z());
      struct.setUsuarioagenciafrasco_Z(getgxTv_SdtUsuario_Usuarioagenciafrasco_Z());
      struct.setUsuarionotificacionfrasco1_Z(getgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z());
      struct.setUsuarionotificacionfrasco2_Z(getgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z());
      struct.setUsuarionotificacionsolicitud1_Z(getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z());
      struct.setUsuarionotificacionsolicitud2_Z(getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z());
      struct.setUsuarionotificacionresultado1_Z(getgxTv_SdtUsuario_Usuarionotificacionresultado1_Z());
      struct.setUsuarionotificacionresultado2_Z(getgxTv_SdtUsuario_Usuarionotificacionresultado2_Z());
      struct.setUsuarionotificacionavisos1_Z(getgxTv_SdtUsuario_Usuarionotificacionavisos1_Z());
      struct.setUsuarionotificacionavisos2_Z(getgxTv_SdtUsuario_Usuarionotificacionavisos2_Z());
      struct.setUsuariotecnicocelular1_Z(getgxTv_SdtUsuario_Usuariotecnicocelular1_Z());
      struct.setUsuariotecnicocelular2_Z(getgxTv_SdtUsuario_Usuariotecnicocelular2_Z());
      struct.setUsuariotecnicocelularnombre1_Z(getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z());
      struct.setUsuariotecnicocelularnombre2_Z(getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z());
      struct.setUsuariotecnicotelefono1_Z(getgxTv_SdtUsuario_Usuariotecnicotelefono1_Z());
      struct.setUsuariotecnicotelefono2_Z(getgxTv_SdtUsuario_Usuariotecnicotelefono2_Z());
      struct.setUsuariotecnicotelefononombre1_Z(getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z());
      struct.setUsuariotecnicotelefononombre2_Z(getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z());
      struct.setUsuariotecnicoemail1_Z(getgxTv_SdtUsuario_Usuariotecnicoemail1_Z());
      struct.setUsuariotecnicoemail2_Z(getgxTv_SdtUsuario_Usuariotecnicoemail2_Z());
      struct.setUsuariotecnicoemailnombre1_Z(getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z());
      struct.setUsuariotecnicoemailnombre2_Z(getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z());
      struct.setUsuarioruttipo_Z(getgxTv_SdtUsuario_Usuarioruttipo_Z());
      struct.setUsuariofacdireccion_Z(getgxTv_SdtUsuario_Usuariofacdireccion_Z());
      struct.setUsuariofaclocalidad_Z(getgxTv_SdtUsuario_Usuariofaclocalidad_Z());
      struct.setUsuariofacdepartamento_Z(getgxTv_SdtUsuario_Usuariofacdepartamento_Z());
      struct.setUsuariofacemailenvio_Z(getgxTv_SdtUsuario_Usuariofacemailenvio_Z());
      struct.setUsuariocobranzacelular1_Z(getgxTv_SdtUsuario_Usuariocobranzacelular1_Z());
      struct.setUsuariocobranzacelular2_Z(getgxTv_SdtUsuario_Usuariocobranzacelular2_Z());
      struct.setUsuariocobranzacelularnombre1_Z(getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z());
      struct.setUsuariocobranzacelularnombre2_Z(getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z());
      struct.setUsuariocobranzatelefono1_Z(getgxTv_SdtUsuario_Usuariocobranzatelefono1_Z());
      struct.setUsuariocobranzatelefono2_Z(getgxTv_SdtUsuario_Usuariocobranzatelefono2_Z());
      struct.setUsuariocobranzatelefononombre1_Z(getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z());
      struct.setUsuariocobranzatelefononombre2_Z(getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z());
      struct.setUsuariocobranzaemail1_Z(getgxTv_SdtUsuario_Usuariocobranzaemail1_Z());
      struct.setUsuariocobranzaemail2_Z(getgxTv_SdtUsuario_Usuariocobranzaemail2_Z());
      struct.setUsuariocobranzaemailnombre1_Z(getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z());
      struct.setUsuariocobranzaemailnombre2_Z(getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z());
      struct.setUsuariocedula_Z(getgxTv_SdtUsuario_Usuariocedula_Z());
      struct.setUsuarioemail_N(getgxTv_SdtUsuario_Usuarioemail_N());
      struct.setUsuariousuarioweb_N(getgxTv_SdtUsuario_Usuariousuarioweb_N());
      struct.setUsuarionombre_N(getgxTv_SdtUsuario_Usuarionombre_N());
      struct.setUsuariodicose_N(getgxTv_SdtUsuario_Usuariodicose_N());
      struct.setUsuariorazonsocial_N(getgxTv_SdtUsuario_Usuariorazonsocial_N());
      struct.setUsuariorut_N(getgxTv_SdtUsuario_Usuariorut_N());
      struct.setUsuarioidnet_N(getgxTv_SdtUsuario_Usuarioidnet_N());
      struct.setUsuariodireccion_N(getgxTv_SdtUsuario_Usuariodireccion_N());
      struct.setUsuariotipousuario_N(getgxTv_SdtUsuario_Usuariotipousuario_N());
      struct.setUsuarioidtecnico1_N(getgxTv_SdtUsuario_Usuarioidtecnico1_N());
      struct.setUsuarioidtecnico2_N(getgxTv_SdtUsuario_Usuarioidtecnico2_N());
      struct.setUsuarioidtecnico3_N(getgxTv_SdtUsuario_Usuarioidtecnico3_N());
      struct.setUsuariodireccionfrasco_N(getgxTv_SdtUsuario_Usuariodireccionfrasco_N());
      struct.setUsuarioagenciafrasco_N(getgxTv_SdtUsuario_Usuarioagenciafrasco_N());
      struct.setUsuarionotificacionfrasco1_N(getgxTv_SdtUsuario_Usuarionotificacionfrasco1_N());
      struct.setUsuarionotificacionfrasco2_N(getgxTv_SdtUsuario_Usuarionotificacionfrasco2_N());
      struct.setUsuarionotificacionsolicitud1_N(getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N());
      struct.setUsuarionotificacionsolicitud2_N(getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N());
      struct.setUsuarionotificacionresultado1_N(getgxTv_SdtUsuario_Usuarionotificacionresultado1_N());
      struct.setUsuarionotificacionresultado2_N(getgxTv_SdtUsuario_Usuarionotificacionresultado2_N());
      struct.setUsuarionotificacionavisos1_N(getgxTv_SdtUsuario_Usuarionotificacionavisos1_N());
      struct.setUsuarionotificacionavisos2_N(getgxTv_SdtUsuario_Usuarionotificacionavisos2_N());
      struct.setUsuariotecnicocelular1_N(getgxTv_SdtUsuario_Usuariotecnicocelular1_N());
      struct.setUsuariotecnicocelular2_N(getgxTv_SdtUsuario_Usuariotecnicocelular2_N());
      struct.setUsuariotecnicocelularnombre1_N(getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N());
      struct.setUsuariotecnicocelularnombre2_N(getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N());
      struct.setUsuariotecnicotelefono1_N(getgxTv_SdtUsuario_Usuariotecnicotelefono1_N());
      struct.setUsuariotecnicotelefono2_N(getgxTv_SdtUsuario_Usuariotecnicotelefono2_N());
      struct.setUsuariotecnicotelefononombre1_N(getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N());
      struct.setUsuariotecnicotelefononombre2_N(getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N());
      struct.setUsuariotecnicoemail1_N(getgxTv_SdtUsuario_Usuariotecnicoemail1_N());
      struct.setUsuariotecnicoemail2_N(getgxTv_SdtUsuario_Usuariotecnicoemail2_N());
      struct.setUsuariotecnicoemailnombre1_N(getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N());
      struct.setUsuariotecnicoemailnombre2_N(getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N());
      struct.setUsuarioruttipo_N(getgxTv_SdtUsuario_Usuarioruttipo_N());
      struct.setUsuariofacdireccion_N(getgxTv_SdtUsuario_Usuariofacdireccion_N());
      struct.setUsuariofaclocalidad_N(getgxTv_SdtUsuario_Usuariofaclocalidad_N());
      struct.setUsuariofacdepartamento_N(getgxTv_SdtUsuario_Usuariofacdepartamento_N());
      struct.setUsuariofacemailenvio_N(getgxTv_SdtUsuario_Usuariofacemailenvio_N());
      struct.setUsuariocobranzacelular1_N(getgxTv_SdtUsuario_Usuariocobranzacelular1_N());
      struct.setUsuariocobranzacelular2_N(getgxTv_SdtUsuario_Usuariocobranzacelular2_N());
      struct.setUsuariocobranzacelularnombre1_N(getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N());
      struct.setUsuariocobranzacelularnombre2_N(getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N());
      struct.setUsuariocobranzatelefono1_N(getgxTv_SdtUsuario_Usuariocobranzatelefono1_N());
      struct.setUsuariocobranzatelefono2_N(getgxTv_SdtUsuario_Usuariocobranzatelefono2_N());
      struct.setUsuariocobranzatelefononombre1_N(getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N());
      struct.setUsuariocobranzatelefononombre2_N(getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N());
      struct.setUsuariocobranzaemail1_N(getgxTv_SdtUsuario_Usuariocobranzaemail1_N());
      struct.setUsuariocobranzaemail2_N(getgxTv_SdtUsuario_Usuariocobranzaemail2_N());
      struct.setUsuariocobranzaemailnombre1_N(getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N());
      struct.setUsuariocobranzaemailnombre2_N(getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N());
      struct.setUsuariocedula_N(getgxTv_SdtUsuario_Usuariocedula_N());
      return struct ;
   }

   private byte gxTv_SdtUsuario_N ;
   private byte gxTv_SdtUsuario_Usuarioemail_N ;
   private byte gxTv_SdtUsuario_Usuariousuarioweb_N ;
   private byte gxTv_SdtUsuario_Usuarionombre_N ;
   private byte gxTv_SdtUsuario_Usuariodicose_N ;
   private byte gxTv_SdtUsuario_Usuariorazonsocial_N ;
   private byte gxTv_SdtUsuario_Usuariorut_N ;
   private byte gxTv_SdtUsuario_Usuarioidnet_N ;
   private byte gxTv_SdtUsuario_Usuariodireccion_N ;
   private byte gxTv_SdtUsuario_Usuariotipousuario_N ;
   private byte gxTv_SdtUsuario_Usuarioidtecnico1_N ;
   private byte gxTv_SdtUsuario_Usuarioidtecnico2_N ;
   private byte gxTv_SdtUsuario_Usuarioidtecnico3_N ;
   private byte gxTv_SdtUsuario_Usuariodireccionfrasco_N ;
   private byte gxTv_SdtUsuario_Usuarioagenciafrasco_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionfrasco1_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionfrasco2_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionsolicitud1_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionsolicitud2_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionresultado1_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionresultado2_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionavisos1_N ;
   private byte gxTv_SdtUsuario_Usuarionotificacionavisos2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicocelular1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicocelular2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicocelularnombre1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicocelularnombre2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicotelefono1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicotelefono2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicotelefononombre1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicotelefononombre2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicoemail1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicoemail2_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicoemailnombre1_N ;
   private byte gxTv_SdtUsuario_Usuariotecnicoemailnombre2_N ;
   private byte gxTv_SdtUsuario_Usuarioruttipo_N ;
   private byte gxTv_SdtUsuario_Usuariofacdireccion_N ;
   private byte gxTv_SdtUsuario_Usuariofaclocalidad_N ;
   private byte gxTv_SdtUsuario_Usuariofacdepartamento_N ;
   private byte gxTv_SdtUsuario_Usuariofacemailenvio_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzacelular1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzacelular2_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzacelularnombre1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzacelularnombre2_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzatelefono1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzatelefono2_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzatelefononombre1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzatelefononombre2_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzaemail1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzaemail2_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzaemailnombre1_N ;
   private byte gxTv_SdtUsuario_Usuariocobranzaemailnombre2_N ;
   private byte gxTv_SdtUsuario_Usuariocedula_N ;
   private short gxTv_SdtUsuario_Usuariotipousuario ;
   private short gxTv_SdtUsuario_Usuarioagenciafrasco ;
   private short gxTv_SdtUsuario_Initialized ;
   private short gxTv_SdtUsuario_Usuariotipousuario_Z ;
   private short gxTv_SdtUsuario_Usuarioagenciafrasco_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtUsuario_Usuarioid ;
   private long gxTv_SdtUsuario_Usuarioidnet ;
   private long gxTv_SdtUsuario_Usuarioidtecnico1 ;
   private long gxTv_SdtUsuario_Usuarioidtecnico2 ;
   private long gxTv_SdtUsuario_Usuarioidtecnico3 ;
   private long gxTv_SdtUsuario_Usuarioid_Z ;
   private long gxTv_SdtUsuario_Usuarioidnet_Z ;
   private long gxTv_SdtUsuario_Usuarioidtecnico1_Z ;
   private long gxTv_SdtUsuario_Usuarioidtecnico2_Z ;
   private long gxTv_SdtUsuario_Usuarioidtecnico3_Z ;
   private String gxTv_SdtUsuario_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtUsuario_Usuarioemail ;
   private String gxTv_SdtUsuario_Usuariousuarioweb ;
   private String gxTv_SdtUsuario_Usuarionombre ;
   private String gxTv_SdtUsuario_Usuariodicose ;
   private String gxTv_SdtUsuario_Usuariorazonsocial ;
   private String gxTv_SdtUsuario_Usuariorut ;
   private String gxTv_SdtUsuario_Usuariodireccion ;
   private String gxTv_SdtUsuario_Usuariodireccionfrasco ;
   private String gxTv_SdtUsuario_Usuarionotificacionfrasco1 ;
   private String gxTv_SdtUsuario_Usuarionotificacionfrasco2 ;
   private String gxTv_SdtUsuario_Usuarionotificacionsolicitud1 ;
   private String gxTv_SdtUsuario_Usuarionotificacionsolicitud2 ;
   private String gxTv_SdtUsuario_Usuarionotificacionresultado1 ;
   private String gxTv_SdtUsuario_Usuarionotificacionresultado2 ;
   private String gxTv_SdtUsuario_Usuarionotificacionavisos1 ;
   private String gxTv_SdtUsuario_Usuarionotificacionavisos2 ;
   private String gxTv_SdtUsuario_Usuariotecnicocelular1 ;
   private String gxTv_SdtUsuario_Usuariotecnicocelular2 ;
   private String gxTv_SdtUsuario_Usuariotecnicocelularnombre1 ;
   private String gxTv_SdtUsuario_Usuariotecnicocelularnombre2 ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefono1 ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefono2 ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefononombre1 ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefononombre2 ;
   private String gxTv_SdtUsuario_Usuariotecnicoemail1 ;
   private String gxTv_SdtUsuario_Usuariotecnicoemail2 ;
   private String gxTv_SdtUsuario_Usuariotecnicoemailnombre1 ;
   private String gxTv_SdtUsuario_Usuariotecnicoemailnombre2 ;
   private String gxTv_SdtUsuario_Usuarioruttipo ;
   private String gxTv_SdtUsuario_Usuariofacdireccion ;
   private String gxTv_SdtUsuario_Usuariofaclocalidad ;
   private String gxTv_SdtUsuario_Usuariofacdepartamento ;
   private String gxTv_SdtUsuario_Usuariofacemailenvio ;
   private String gxTv_SdtUsuario_Usuariocobranzacelular1 ;
   private String gxTv_SdtUsuario_Usuariocobranzacelular2 ;
   private String gxTv_SdtUsuario_Usuariocobranzacelularnombre1 ;
   private String gxTv_SdtUsuario_Usuariocobranzacelularnombre2 ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefono1 ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefono2 ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefononombre1 ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefononombre2 ;
   private String gxTv_SdtUsuario_Usuariocobranzaemail1 ;
   private String gxTv_SdtUsuario_Usuariocobranzaemail2 ;
   private String gxTv_SdtUsuario_Usuariocobranzaemailnombre1 ;
   private String gxTv_SdtUsuario_Usuariocobranzaemailnombre2 ;
   private String gxTv_SdtUsuario_Usuariocedula ;
   private String gxTv_SdtUsuario_Usuarioemail_Z ;
   private String gxTv_SdtUsuario_Usuariousuarioweb_Z ;
   private String gxTv_SdtUsuario_Usuarionombre_Z ;
   private String gxTv_SdtUsuario_Usuariodicose_Z ;
   private String gxTv_SdtUsuario_Usuariorazonsocial_Z ;
   private String gxTv_SdtUsuario_Usuariorut_Z ;
   private String gxTv_SdtUsuario_Usuariodireccion_Z ;
   private String gxTv_SdtUsuario_Usuariodireccionfrasco_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionfrasco1_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionfrasco2_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionresultado1_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionresultado2_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionavisos1_Z ;
   private String gxTv_SdtUsuario_Usuarionotificacionavisos2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicocelular1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicocelular2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefono1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefono2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicoemail1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicoemail2_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z ;
   private String gxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z ;
   private String gxTv_SdtUsuario_Usuarioruttipo_Z ;
   private String gxTv_SdtUsuario_Usuariofacdireccion_Z ;
   private String gxTv_SdtUsuario_Usuariofaclocalidad_Z ;
   private String gxTv_SdtUsuario_Usuariofacdepartamento_Z ;
   private String gxTv_SdtUsuario_Usuariofacemailenvio_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzacelular1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzacelular2_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefono1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefono2_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzaemail1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzaemail2_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z ;
   private String gxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z ;
   private String gxTv_SdtUsuario_Usuariocedula_Z ;
}

