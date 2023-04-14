package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt.class));
   }

   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt( StructSdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt struct )
   {
      this();
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
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioUsuarioWeb") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNombre") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDicose") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRazonSocial") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRut") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdNet") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccion") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTipousuario") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdTecnico3") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccionFrasco") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioAgenciaFrasco") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionFrasco2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionSolicitud2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionResultado2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNotificacionAvisos2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelular2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoCelularNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefonoNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmail2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoEmailNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioRutTipo") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDireccion") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacLocalidad") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacDepartamento") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioFacEmailEnvio") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelular2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaCelularNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefono2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaTelefonoNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmail2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre1") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCobranzaEmailNombre2") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioCedula") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula = oReader.getValue() ;
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
         sName = "WorkWithDevicesUsuario_Usuario_Section_GeneralSdt" ;
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
      oWriter.writeElement("UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioEmail", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioUsuarioWeb", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNombre", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioDicose", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioRazonSocial", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioRut", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioIdNet", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioDireccion", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTipousuario", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioIdTecnico1", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioIdTecnico2", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioIdTecnico3", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioDireccionFrasco", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioAgenciaFrasco", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionFrasco1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionFrasco2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionSolicitud1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionSolicitud2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionResultado1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionResultado2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionAvisos1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNotificacionAvisos2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoCelular1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoCelular2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoCelularNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoCelularNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoTelefono1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoTelefono2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoTelefonoNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoTelefonoNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoEmail1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoEmail2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoEmailNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoEmailNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioRutTipo", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioFacDireccion", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioFacLocalidad", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioFacDepartamento", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioFacEmailEnvio", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaCelular1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaCelular2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaCelularNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaCelularNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaTelefono1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaTelefono2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaTelefonoNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaTelefonoNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaEmail1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaEmail2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaEmailNombre1", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCobranzaEmailNombre2", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioCedula", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
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
      AddObjectProperty("UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid, 18, 0)), false, false);
      AddObjectProperty("UsuarioEmail", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail, false, false);
      AddObjectProperty("UsuarioUsuarioWeb", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb, false, false);
      AddObjectProperty("UsuarioNombre", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre, false, false);
      AddObjectProperty("UsuarioDicose", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose, false, false);
      AddObjectProperty("UsuarioRazonSocial", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial, false, false);
      AddObjectProperty("UsuarioRut", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut, false, false);
      AddObjectProperty("UsuarioIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet, 18, 0)), false, false);
      AddObjectProperty("UsuarioDireccion", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion, false, false);
      AddObjectProperty("UsuarioTipousuario", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario, false, false);
      AddObjectProperty("UsuarioIdTecnico1", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1, 18, 0)), false, false);
      AddObjectProperty("UsuarioIdTecnico2", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2, 18, 0)), false, false);
      AddObjectProperty("UsuarioIdTecnico3", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3, 18, 0)), false, false);
      AddObjectProperty("UsuarioDireccionFrasco", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco, false, false);
      AddObjectProperty("UsuarioAgenciaFrasco", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco, false, false);
      AddObjectProperty("UsuarioNotificacionFrasco1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1, false, false);
      AddObjectProperty("UsuarioNotificacionFrasco2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2, false, false);
      AddObjectProperty("UsuarioNotificacionSolicitud1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1, false, false);
      AddObjectProperty("UsuarioNotificacionSolicitud2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2, false, false);
      AddObjectProperty("UsuarioNotificacionResultado1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1, false, false);
      AddObjectProperty("UsuarioNotificacionResultado2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2, false, false);
      AddObjectProperty("UsuarioNotificacionAvisos1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1, false, false);
      AddObjectProperty("UsuarioNotificacionAvisos2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2, false, false);
      AddObjectProperty("UsuarioTecnicoCelular1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1, false, false);
      AddObjectProperty("UsuarioTecnicoCelular2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2, false, false);
      AddObjectProperty("UsuarioTecnicoCelularNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1, false, false);
      AddObjectProperty("UsuarioTecnicoCelularNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2, false, false);
      AddObjectProperty("UsuarioTecnicoTelefono1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1, false, false);
      AddObjectProperty("UsuarioTecnicoTelefono2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2, false, false);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1, false, false);
      AddObjectProperty("UsuarioTecnicoTelefonoNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2, false, false);
      AddObjectProperty("UsuarioTecnicoEmail1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1, false, false);
      AddObjectProperty("UsuarioTecnicoEmail2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2, false, false);
      AddObjectProperty("UsuarioTecnicoEmailNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1, false, false);
      AddObjectProperty("UsuarioTecnicoEmailNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2, false, false);
      AddObjectProperty("UsuarioRutTipo", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo, false, false);
      AddObjectProperty("UsuarioFacDireccion", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion, false, false);
      AddObjectProperty("UsuarioFacLocalidad", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad, false, false);
      AddObjectProperty("UsuarioFacDepartamento", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento, false, false);
      AddObjectProperty("UsuarioFacEmailEnvio", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio, false, false);
      AddObjectProperty("UsuarioCobranzaCelular1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1, false, false);
      AddObjectProperty("UsuarioCobranzaCelular2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2, false, false);
      AddObjectProperty("UsuarioCobranzaCelularNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1, false, false);
      AddObjectProperty("UsuarioCobranzaCelularNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2, false, false);
      AddObjectProperty("UsuarioCobranzaTelefono1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1, false, false);
      AddObjectProperty("UsuarioCobranzaTelefono2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2, false, false);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1, false, false);
      AddObjectProperty("UsuarioCobranzaTelefonoNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2, false, false);
      AddObjectProperty("UsuarioCobranzaEmail1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1, false, false);
      AddObjectProperty("UsuarioCobranzaEmail2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2, false, false);
      AddObjectProperty("UsuarioCobranzaEmailNombre1", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1, false, false);
      AddObjectProperty("UsuarioCobranzaEmailNombre2", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2, false, false);
      AddObjectProperty("UsuarioCedula", gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut = value ;
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion = value ;
   }

   public short getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario( short value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario = value ;
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1 = value ;
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2 = value ;
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco = value ;
   }

   public short getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco( short value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2 ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2 = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2 = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt struct )
   {
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid(struct.getUsuarioid());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail(struct.getUsuarioemail());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb(struct.getUsuariousuarioweb());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre(struct.getUsuarionombre());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose(struct.getUsuariodicose());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial(struct.getUsuariorazonsocial());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut(struct.getUsuariorut());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet(struct.getUsuarioidnet());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion(struct.getUsuariodireccion());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario(struct.getUsuariotipousuario());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1(struct.getUsuarioidtecnico1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2(struct.getUsuarioidtecnico2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3(struct.getUsuarioidtecnico3());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco(struct.getUsuariodireccionfrasco());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco(struct.getUsuarioagenciafrasco());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1(struct.getUsuarionotificacionfrasco1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2(struct.getUsuarionotificacionfrasco2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1(struct.getUsuarionotificacionsolicitud1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2(struct.getUsuarionotificacionsolicitud2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1(struct.getUsuarionotificacionresultado1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2(struct.getUsuarionotificacionresultado2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1(struct.getUsuarionotificacionavisos1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2(struct.getUsuarionotificacionavisos2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1(struct.getUsuariotecnicocelular1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2(struct.getUsuariotecnicocelular2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1(struct.getUsuariotecnicocelularnombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2(struct.getUsuariotecnicocelularnombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1(struct.getUsuariotecnicotelefono1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2(struct.getUsuariotecnicotelefono2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1(struct.getUsuariotecnicotelefononombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2(struct.getUsuariotecnicotelefononombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1(struct.getUsuariotecnicoemail1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2(struct.getUsuariotecnicoemail2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1(struct.getUsuariotecnicoemailnombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2(struct.getUsuariotecnicoemailnombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo(struct.getUsuarioruttipo());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion(struct.getUsuariofacdireccion());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad(struct.getUsuariofaclocalidad());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento(struct.getUsuariofacdepartamento());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio(struct.getUsuariofacemailenvio());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1(struct.getUsuariocobranzacelular1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2(struct.getUsuariocobranzacelular2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1(struct.getUsuariocobranzacelularnombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2(struct.getUsuariocobranzacelularnombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1(struct.getUsuariocobranzatelefono1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2(struct.getUsuariocobranzatelefono2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1(struct.getUsuariocobranzatelefononombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2(struct.getUsuariocobranzatelefononombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1(struct.getUsuariocobranzaemail1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2(struct.getUsuariocobranzaemail2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1(struct.getUsuariocobranzaemailnombre1());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2(struct.getUsuariocobranzaemailnombre2());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula(struct.getUsuariocedula());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt struct = new com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt ();
      struct.setUsuarioid(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid());
      struct.setUsuarioemail(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail());
      struct.setUsuariousuarioweb(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb());
      struct.setUsuarionombre(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre());
      struct.setUsuariodicose(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose());
      struct.setUsuariorazonsocial(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial());
      struct.setUsuariorut(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut());
      struct.setUsuarioidnet(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet());
      struct.setUsuariodireccion(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion());
      struct.setUsuariotipousuario(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario());
      struct.setUsuarioidtecnico1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1());
      struct.setUsuarioidtecnico2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2());
      struct.setUsuarioidtecnico3(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3());
      struct.setUsuariodireccionfrasco(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco());
      struct.setUsuarioagenciafrasco(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco());
      struct.setUsuarionotificacionfrasco1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1());
      struct.setUsuarionotificacionfrasco2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2());
      struct.setUsuarionotificacionsolicitud1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1());
      struct.setUsuarionotificacionsolicitud2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2());
      struct.setUsuarionotificacionresultado1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1());
      struct.setUsuarionotificacionresultado2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2());
      struct.setUsuarionotificacionavisos1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1());
      struct.setUsuarionotificacionavisos2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2());
      struct.setUsuariotecnicocelular1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1());
      struct.setUsuariotecnicocelular2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2());
      struct.setUsuariotecnicocelularnombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1());
      struct.setUsuariotecnicocelularnombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2());
      struct.setUsuariotecnicotelefono1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1());
      struct.setUsuariotecnicotelefono2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2());
      struct.setUsuariotecnicotelefononombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1());
      struct.setUsuariotecnicotelefononombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2());
      struct.setUsuariotecnicoemail1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1());
      struct.setUsuariotecnicoemail2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2());
      struct.setUsuariotecnicoemailnombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1());
      struct.setUsuariotecnicoemailnombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2());
      struct.setUsuarioruttipo(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo());
      struct.setUsuariofacdireccion(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion());
      struct.setUsuariofaclocalidad(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad());
      struct.setUsuariofacdepartamento(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento());
      struct.setUsuariofacemailenvio(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio());
      struct.setUsuariocobranzacelular1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1());
      struct.setUsuariocobranzacelular2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2());
      struct.setUsuariocobranzacelularnombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1());
      struct.setUsuariocobranzacelularnombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2());
      struct.setUsuariocobranzatelefono1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1());
      struct.setUsuariocobranzatelefono2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2());
      struct.setUsuariocobranzatelefononombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1());
      struct.setUsuariocobranzatelefononombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2());
      struct.setUsuariocobranzaemail1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1());
      struct.setUsuariocobranzaemail2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2());
      struct.setUsuariocobranzaemailnombre1(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1());
      struct.setUsuariocobranzaemailnombre2(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2());
      struct.setUsuariocedula(getgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_N ;
   protected short gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario ;
   protected short gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1 ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2 ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3 ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2 ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula ;
}

