package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCliente extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtCliente( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtCliente.class));
   }

   public SdtCliente( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtCliente");
      initialize( remoteHandle) ;
   }

   public SdtCliente( int remoteHandle ,
                      StructSdtCliente struct )
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

   public void Load( long AV4ClienteId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV4ClienteId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"ClienteId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Cliente");
      metadata.set("BT", "Cliente");
      metadata.set("PK", "[ \"ClienteId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteId") )
            {
               gxTv_SdtCliente_Clienteid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombre") )
            {
               gxTv_SdtCliente_Clientenombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail") )
            {
               gxTv_SdtCliente_Clienteemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail1") )
            {
               gxTv_SdtCliente_Clientenombreemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail1") )
            {
               gxTv_SdtCliente_Clienteemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail2") )
            {
               gxTv_SdtCliente_Clientenombreemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail2") )
            {
               gxTv_SdtCliente_Clienteemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEnvio") )
            {
               gxTv_SdtCliente_Clienteenvio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteUsuarioWeb") )
            {
               gxTv_SdtCliente_Clienteusuarioweb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular1") )
            {
               gxTv_SdtCliente_Clientenombrecelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular1") )
            {
               gxTv_SdtCliente_Clientecelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular2") )
            {
               gxTv_SdtCliente_Clientenombrecelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular2") )
            {
               gxTv_SdtCliente_Clientecelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodigoFigaro") )
            {
               gxTv_SdtCliente_Clientecodigofigaro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTipoUsuario") )
            {
               gxTv_SdtCliente_Clientetipousuario = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDireccion") )
            {
               gxTv_SdtCliente_Clientedireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono1") )
            {
               gxTv_SdtCliente_Clientenombretelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono1") )
            {
               gxTv_SdtCliente_Clientetelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono2") )
            {
               gxTv_SdtCliente_Clientenombretelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono2") )
            {
               gxTv_SdtCliente_Clientetelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFax") )
            {
               gxTv_SdtCliente_Clientefax = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDicose") )
            {
               gxTv_SdtCliente_Clientedicose = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdDepartamento") )
            {
               gxTv_SdtCliente_Clienteiddepartamento = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdLocalidad") )
            {
               gxTv_SdtCliente_Clienteidlocalidad = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico1") )
            {
               gxTv_SdtCliente_Clientetecnico1 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico2") )
            {
               gxTv_SdtCliente_Clientetecnico2 = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdAgencia") )
            {
               gxTv_SdtCliente_Clienteidagencia = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteContrato") )
            {
               gxTv_SdtCliente_Clientecontrato = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteSocio") )
            {
               gxTv_SdtCliente_Clientesocio = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNoUsar") )
            {
               gxTv_SdtCliente_Clientenousar = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodbar") )
            {
               gxTv_SdtCliente_Clientecodbar = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCaravanas") )
            {
               gxTv_SdtCliente_Clientecaravanas = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesa") )
            {
               gxTv_SdtCliente_Clienteprolesa = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesaSuc") )
            {
               gxTv_SdtCliente_Clienteprolesasuc = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesaMat") )
            {
               gxTv_SdtCliente_Clienteprolesamat = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteObservaciones") )
            {
               gxTv_SdtCliente_Clienteobservaciones = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRsocial") )
            {
               gxTv_SdtCliente_Clientefacrsocial = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCedula") )
            {
               gxTv_SdtCliente_Clientefaccedula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRut") )
            {
               gxTv_SdtCliente_Clientefacrut = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDireccion") )
            {
               gxTv_SdtCliente_Clientefacdireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLocalidad") )
            {
               gxTv_SdtCliente_Clientefaclocalidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDepartamento") )
            {
               gxTv_SdtCliente_Clientefacdepartamento = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCpostal") )
            {
               gxTv_SdtCliente_Clientefaccpostal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacGiro") )
            {
               gxTv_SdtCliente_Clientefacgiro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono1") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacTelefonos") )
            {
               gxTv_SdtCliente_Clientefactelefonos = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono2") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobTelefono2") )
            {
               gxTv_SdtCliente_Clientecobtelefono2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular1") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular1") )
            {
               gxTv_SdtCliente_Clientecobcelular1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular2") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular2") )
            {
               gxTv_SdtCliente_Clientecobcelular2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail1") )
            {
               gxTv_SdtCliente_Clientecobnombreemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail1") )
            {
               gxTv_SdtCliente_Clientecobemail1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail2") )
            {
               gxTv_SdtCliente_Clientecobnombreemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail2") )
            {
               gxTv_SdtCliente_Clientecobemail2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacFax") )
            {
               gxTv_SdtCliente_Clientefacfax = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacEmail") )
            {
               gxTv_SdtCliente_Clientefacemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContrato") )
            {
               gxTv_SdtCliente_Clientefaccontrato = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacObservaciones") )
            {
               gxTv_SdtCliente_Clientefacobservaciones = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLista") )
            {
               gxTv_SdtCliente_Clientefaclista = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContado") )
            {
               gxTv_SdtCliente_Clientefaccontado = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos1") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos2") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra1") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra2") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis1") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis2") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral1") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral2") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIncobrable") )
            {
               gxTv_SdtCliente_Clienteincobrable = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtCliente_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtCliente_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteId_Z") )
            {
               gxTv_SdtCliente_Clienteid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombre_Z") )
            {
               gxTv_SdtCliente_Clientenombre_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail_Z") )
            {
               gxTv_SdtCliente_Clienteemail_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail1_Z") )
            {
               gxTv_SdtCliente_Clientenombreemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail1_Z") )
            {
               gxTv_SdtCliente_Clienteemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail2_Z") )
            {
               gxTv_SdtCliente_Clientenombreemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail2_Z") )
            {
               gxTv_SdtCliente_Clienteemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEnvio_Z") )
            {
               gxTv_SdtCliente_Clienteenvio_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteUsuarioWeb_Z") )
            {
               gxTv_SdtCliente_Clienteusuarioweb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular1_Z") )
            {
               gxTv_SdtCliente_Clientenombrecelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular1_Z") )
            {
               gxTv_SdtCliente_Clientecelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular2_Z") )
            {
               gxTv_SdtCliente_Clientenombrecelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular2_Z") )
            {
               gxTv_SdtCliente_Clientecelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodigoFigaro_Z") )
            {
               gxTv_SdtCliente_Clientecodigofigaro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTipoUsuario_Z") )
            {
               gxTv_SdtCliente_Clientetipousuario_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDireccion_Z") )
            {
               gxTv_SdtCliente_Clientedireccion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono1_Z") )
            {
               gxTv_SdtCliente_Clientenombretelefono1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono1_Z") )
            {
               gxTv_SdtCliente_Clientetelefono1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono2_Z") )
            {
               gxTv_SdtCliente_Clientenombretelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono2_Z") )
            {
               gxTv_SdtCliente_Clientetelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFax_Z") )
            {
               gxTv_SdtCliente_Clientefax_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDicose_Z") )
            {
               gxTv_SdtCliente_Clientedicose_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdDepartamento_Z") )
            {
               gxTv_SdtCliente_Clienteiddepartamento_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdLocalidad_Z") )
            {
               gxTv_SdtCliente_Clienteidlocalidad_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico1_Z") )
            {
               gxTv_SdtCliente_Clientetecnico1_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico2_Z") )
            {
               gxTv_SdtCliente_Clientetecnico2_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdAgencia_Z") )
            {
               gxTv_SdtCliente_Clienteidagencia_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteContrato_Z") )
            {
               gxTv_SdtCliente_Clientecontrato_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteSocio_Z") )
            {
               gxTv_SdtCliente_Clientesocio_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNoUsar_Z") )
            {
               gxTv_SdtCliente_Clientenousar_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodbar_Z") )
            {
               gxTv_SdtCliente_Clientecodbar_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCaravanas_Z") )
            {
               gxTv_SdtCliente_Clientecaravanas_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesa_Z") )
            {
               gxTv_SdtCliente_Clienteprolesa_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesaSuc_Z") )
            {
               gxTv_SdtCliente_Clienteprolesasuc_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesaMat_Z") )
            {
               gxTv_SdtCliente_Clienteprolesamat_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteObservaciones_Z") )
            {
               gxTv_SdtCliente_Clienteobservaciones_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRsocial_Z") )
            {
               gxTv_SdtCliente_Clientefacrsocial_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCedula_Z") )
            {
               gxTv_SdtCliente_Clientefaccedula_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRut_Z") )
            {
               gxTv_SdtCliente_Clientefacrut_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDireccion_Z") )
            {
               gxTv_SdtCliente_Clientefacdireccion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLocalidad_Z") )
            {
               gxTv_SdtCliente_Clientefaclocalidad_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDepartamento_Z") )
            {
               gxTv_SdtCliente_Clientefacdepartamento_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCpostal_Z") )
            {
               gxTv_SdtCliente_Clientefaccpostal_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacGiro_Z") )
            {
               gxTv_SdtCliente_Clientefacgiro_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono1_Z") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacTelefonos_Z") )
            {
               gxTv_SdtCliente_Clientefactelefonos_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono2_Z") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobTelefono2_Z") )
            {
               gxTv_SdtCliente_Clientecobtelefono2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular1_Z") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular1_Z") )
            {
               gxTv_SdtCliente_Clientecobcelular1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular2_Z") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular2_Z") )
            {
               gxTv_SdtCliente_Clientecobcelular2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail1_Z") )
            {
               gxTv_SdtCliente_Clientecobnombreemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail1_Z") )
            {
               gxTv_SdtCliente_Clientecobemail1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail2_Z") )
            {
               gxTv_SdtCliente_Clientecobnombreemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail2_Z") )
            {
               gxTv_SdtCliente_Clientecobemail2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacFax_Z") )
            {
               gxTv_SdtCliente_Clientefacfax_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacEmail_Z") )
            {
               gxTv_SdtCliente_Clientefacemail_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContrato_Z") )
            {
               gxTv_SdtCliente_Clientefaccontrato_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacObservaciones_Z") )
            {
               gxTv_SdtCliente_Clientefacobservaciones_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLista_Z") )
            {
               gxTv_SdtCliente_Clientefaclista_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContado_Z") )
            {
               gxTv_SdtCliente_Clientefaccontado_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos1_Z") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos2_Z") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra1_Z") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra2_Z") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis1_Z") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis2_Z") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral1_Z") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral2_Z") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIncobrable_Z") )
            {
               gxTv_SdtCliente_Clienteincobrable_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombre_N") )
            {
               gxTv_SdtCliente_Clientenombre_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail_N") )
            {
               gxTv_SdtCliente_Clienteemail_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail1_N") )
            {
               gxTv_SdtCliente_Clientenombreemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail1_N") )
            {
               gxTv_SdtCliente_Clienteemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreEmail2_N") )
            {
               gxTv_SdtCliente_Clientenombreemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEmail2_N") )
            {
               gxTv_SdtCliente_Clienteemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteEnvio_N") )
            {
               gxTv_SdtCliente_Clienteenvio_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteUsuarioWeb_N") )
            {
               gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular1_N") )
            {
               gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular1_N") )
            {
               gxTv_SdtCliente_Clientecelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreCelular2_N") )
            {
               gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCelular2_N") )
            {
               gxTv_SdtCliente_Clientecelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodigoFigaro_N") )
            {
               gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTipoUsuario_N") )
            {
               gxTv_SdtCliente_Clientetipousuario_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDireccion_N") )
            {
               gxTv_SdtCliente_Clientedireccion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono1_N") )
            {
               gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono1_N") )
            {
               gxTv_SdtCliente_Clientetelefono1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombreTelefono2_N") )
            {
               gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTelefono2_N") )
            {
               gxTv_SdtCliente_Clientetelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFax_N") )
            {
               gxTv_SdtCliente_Clientefax_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteDicose_N") )
            {
               gxTv_SdtCliente_Clientedicose_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdDepartamento_N") )
            {
               gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdLocalidad_N") )
            {
               gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico1_N") )
            {
               gxTv_SdtCliente_Clientetecnico1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteTecnico2_N") )
            {
               gxTv_SdtCliente_Clientetecnico2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIdAgencia_N") )
            {
               gxTv_SdtCliente_Clienteidagencia_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteContrato_N") )
            {
               gxTv_SdtCliente_Clientecontrato_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteSocio_N") )
            {
               gxTv_SdtCliente_Clientesocio_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNoUsar_N") )
            {
               gxTv_SdtCliente_Clientenousar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCodbar_N") )
            {
               gxTv_SdtCliente_Clientecodbar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCaravanas_N") )
            {
               gxTv_SdtCliente_Clientecaravanas_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesa_N") )
            {
               gxTv_SdtCliente_Clienteprolesa_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteProlesaSuc_N") )
            {
               gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteObservaciones_N") )
            {
               gxTv_SdtCliente_Clienteobservaciones_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRsocial_N") )
            {
               gxTv_SdtCliente_Clientefacrsocial_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCedula_N") )
            {
               gxTv_SdtCliente_Clientefaccedula_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacRut_N") )
            {
               gxTv_SdtCliente_Clientefacrut_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDireccion_N") )
            {
               gxTv_SdtCliente_Clientefacdireccion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLocalidad_N") )
            {
               gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacDepartamento_N") )
            {
               gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacCpostal_N") )
            {
               gxTv_SdtCliente_Clientefaccpostal_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacGiro_N") )
            {
               gxTv_SdtCliente_Clientefacgiro_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono1_N") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacTelefonos_N") )
            {
               gxTv_SdtCliente_Clientefactelefonos_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreTelefono2_N") )
            {
               gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobTelefono2_N") )
            {
               gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular1_N") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular1_N") )
            {
               gxTv_SdtCliente_Clientecobcelular1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreCelular2_N") )
            {
               gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobCelular2_N") )
            {
               gxTv_SdtCliente_Clientecobcelular2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail1_N") )
            {
               gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail1_N") )
            {
               gxTv_SdtCliente_Clientecobemail1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobNombreEmail2_N") )
            {
               gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteCobEmail2_N") )
            {
               gxTv_SdtCliente_Clientecobemail2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacFax_N") )
            {
               gxTv_SdtCliente_Clientefacfax_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacEmail_N") )
            {
               gxTv_SdtCliente_Clientefacemail_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContrato_N") )
            {
               gxTv_SdtCliente_Clientefaccontrato_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacObservaciones_N") )
            {
               gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacLista_N") )
            {
               gxTv_SdtCliente_Clientefaclista_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteFacContado_N") )
            {
               gxTv_SdtCliente_Clientefaccontado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos1_N") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailFrascos2_N") )
            {
               gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra1_N") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailMuestra2_N") )
            {
               gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis1_N") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailAnalisis2_N") )
            {
               gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral1_N") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNotEmailGeneral2_N") )
            {
               gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteIncobrable_N") )
            {
               gxTv_SdtCliente_Clienteincobrable_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Cliente" ;
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
      oWriter.writeElement("ClienteId", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombre", GXutil.rtrim( gxTv_SdtCliente_Clientenombre));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteEmail", GXutil.rtrim( gxTv_SdtCliente_Clienteemail));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreEmail1", GXutil.rtrim( gxTv_SdtCliente_Clientenombreemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteEmail1", GXutil.rtrim( gxTv_SdtCliente_Clienteemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreEmail2", GXutil.rtrim( gxTv_SdtCliente_Clientenombreemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteEmail2", GXutil.rtrim( gxTv_SdtCliente_Clienteemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteEnvio", GXutil.rtrim( gxTv_SdtCliente_Clienteenvio));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteUsuarioWeb", GXutil.rtrim( gxTv_SdtCliente_Clienteusuarioweb));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreCelular1", GXutil.rtrim( gxTv_SdtCliente_Clientenombrecelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCelular1", GXutil.rtrim( gxTv_SdtCliente_Clientecelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreCelular2", GXutil.rtrim( gxTv_SdtCliente_Clientenombrecelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCelular2", GXutil.rtrim( gxTv_SdtCliente_Clientecelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCodigoFigaro", GXutil.rtrim( gxTv_SdtCliente_Clientecodigofigaro));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteTipoUsuario", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetipousuario, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteDireccion", GXutil.rtrim( gxTv_SdtCliente_Clientedireccion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreTelefono1", GXutil.rtrim( gxTv_SdtCliente_Clientenombretelefono1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteTelefono1", GXutil.rtrim( gxTv_SdtCliente_Clientetelefono1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNombreTelefono2", GXutil.rtrim( gxTv_SdtCliente_Clientenombretelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteTelefono2", GXutil.rtrim( gxTv_SdtCliente_Clientetelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFax", GXutil.rtrim( gxTv_SdtCliente_Clientefax));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteDicose", GXutil.rtrim( gxTv_SdtCliente_Clientedicose));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteIdDepartamento", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteiddepartamento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteIdLocalidad", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidlocalidad, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteTecnico1", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico1, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteTecnico2", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico2, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteIdAgencia", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidagencia, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteContrato", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecontrato, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteSocio", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientesocio, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNoUsar", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenousar, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCodbar", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecodbar, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCaravanas", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecaravanas, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteProlesa", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesa, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteProlesaSuc", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesasuc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteProlesaMat", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesamat, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteObservaciones", GXutil.rtrim( gxTv_SdtCliente_Clienteobservaciones));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacRsocial", GXutil.rtrim( gxTv_SdtCliente_Clientefacrsocial));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacCedula", GXutil.rtrim( gxTv_SdtCliente_Clientefaccedula));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacRut", GXutil.rtrim( gxTv_SdtCliente_Clientefacrut));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacDireccion", GXutil.rtrim( gxTv_SdtCliente_Clientefacdireccion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacLocalidad", GXutil.rtrim( gxTv_SdtCliente_Clientefaclocalidad));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacDepartamento", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacdepartamento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacCpostal", GXutil.rtrim( gxTv_SdtCliente_Clientefaccpostal));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacGiro", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacgiro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreTelefono1", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombretelefono1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacTelefonos", GXutil.rtrim( gxTv_SdtCliente_Clientefactelefonos));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreTelefono2", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombretelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobTelefono2", GXutil.rtrim( gxTv_SdtCliente_Clientecobtelefono2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreCelular1", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombrecelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobCelular1", GXutil.rtrim( gxTv_SdtCliente_Clientecobcelular1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreCelular2", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombrecelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobCelular2", GXutil.rtrim( gxTv_SdtCliente_Clientecobcelular2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreEmail1", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombreemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobEmail1", GXutil.rtrim( gxTv_SdtCliente_Clientecobemail1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobNombreEmail2", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombreemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteCobEmail2", GXutil.rtrim( gxTv_SdtCliente_Clientecobemail2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacFax", GXutil.rtrim( gxTv_SdtCliente_Clientefacfax));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacEmail", GXutil.rtrim( gxTv_SdtCliente_Clientefacemail));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacContrato", GXutil.rtrim( gxTv_SdtCliente_Clientefaccontrato));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacObservaciones", GXutil.rtrim( gxTv_SdtCliente_Clientefacobservaciones));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacLista", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaclista, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteFacContado", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccontado, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailFrascos1", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailfrascos1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailFrascos2", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailfrascos2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailMuestra1", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailmuestra1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailMuestra2", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailmuestra2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailAnalisis1", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailanalisis1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailAnalisis2", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailanalisis2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailGeneral1", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailgeneral1));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteNotEmailGeneral2", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailgeneral2));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("ClienteIncobrable", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteincobrable, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtCliente_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtCliente_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteId_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombre_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombre_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteemail_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreEmail1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombreemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail1_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreEmail2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombreemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail2_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEnvio_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteenvio_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteUsuarioWeb_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteusuarioweb_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreCelular1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombrecelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCelular1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreCelular2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombrecelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCelular2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCodigoFigaro_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecodigofigaro_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTipoUsuario_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetipousuario_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteDireccion_Z", GXutil.rtrim( gxTv_SdtCliente_Clientedireccion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreTelefono1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombretelefono1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTelefono1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientetelefono1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreTelefono2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenombretelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTelefono2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientetelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFax_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefax_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteDicose_Z", GXutil.rtrim( gxTv_SdtCliente_Clientedicose_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdDepartamento_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteiddepartamento_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdLocalidad_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidlocalidad_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTecnico1_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico1_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTecnico2_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico2_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdAgencia_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidagencia_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteContrato_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecontrato_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteSocio_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientesocio_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNoUsar_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenousar_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCodbar_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecodbar_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCaravanas_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecaravanas_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteProlesa_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesa_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteProlesaSuc_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesasuc_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteProlesaMat_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesamat_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteObservaciones_Z", GXutil.rtrim( gxTv_SdtCliente_Clienteobservaciones_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacRsocial_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacrsocial_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacCedula_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefaccedula_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacRut_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacrut_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacDireccion_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacdireccion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacLocalidad_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefaclocalidad_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacDepartamento_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacdepartamento_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacCpostal_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefaccpostal_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacGiro_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacgiro_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreTelefono1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombretelefono1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacTelefonos_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefactelefonos_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreTelefono2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombretelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobTelefono2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobtelefono2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreCelular1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombrecelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobCelular1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobcelular1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreCelular2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombrecelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobCelular2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobcelular2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreEmail1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombreemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobEmail1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobemail1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreEmail2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobnombreemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobEmail2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientecobemail2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacFax_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacfax_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacEmail_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacemail_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacContrato_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefaccontrato_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacObservaciones_Z", GXutil.rtrim( gxTv_SdtCliente_Clientefacobservaciones_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacLista_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaclista_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacContado_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccontado_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailFrascos1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailfrascos1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailFrascos2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailfrascos2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailMuestra1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailmuestra1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailMuestra2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailmuestra2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailAnalisis1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailanalisis1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailAnalisis2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailanalisis2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailGeneral1_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailgeneral1_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailGeneral2_Z", GXutil.rtrim( gxTv_SdtCliente_Clientenotemailgeneral2_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIncobrable_Z", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteincobrable_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombre_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombre_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteemail_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombreemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombreemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteEnvio_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteenvio_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteUsuarioWeb_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteusuarioweb_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombrecelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombrecelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCodigoFigaro_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecodigofigaro_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTipoUsuario_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetipousuario_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteDireccion_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientedireccion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreTelefono1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombretelefono1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTelefono1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetelefono1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNombreTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenombretelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFax_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefax_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteDicose_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientedicose_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdDepartamento_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteiddepartamento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdLocalidad_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidlocalidad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTecnico1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteTecnico2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientetecnico2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIdAgencia_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteidagencia_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteContrato_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecontrato_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteSocio_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientesocio_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNoUsar_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenousar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCodbar_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecodbar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCaravanas_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecaravanas_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteProlesa_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesa_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteProlesaSuc_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteprolesasuc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteObservaciones_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteobservaciones_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacRsocial_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacrsocial_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacCedula_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccedula_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacRut_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacrut_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacDireccion_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacdireccion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacLocalidad_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaclocalidad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacDepartamento_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacdepartamento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacCpostal_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccpostal_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacGiro_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacgiro_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreTelefono1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombretelefono1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacTelefonos_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefactelefonos_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombretelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobTelefono2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobtelefono2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombrecelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobCelular1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobcelular1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombrecelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobCelular2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobcelular2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombreemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobEmail1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobemail1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobNombreEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobnombreemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteCobEmail2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientecobemail2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacFax_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacfax_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacEmail_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacemail_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacContrato_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccontrato_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacObservaciones_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefacobservaciones_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacLista_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaclista_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteFacContado_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientefaccontado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailFrascos1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailfrascos1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailFrascos2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailfrascos2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailMuestra1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailmuestra1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailMuestra2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailmuestra2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailAnalisis1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailanalisis1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailAnalisis2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailanalisis2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailGeneral1_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailgeneral1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteNotEmailGeneral2_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clientenotemailgeneral2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("ClienteIncobrable_N", GXutil.trim( GXutil.str( gxTv_SdtCliente_Clienteincobrable_N, 1, 0)));
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
      AddObjectProperty("ClienteId", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteNombre", gxTv_SdtCliente_Clientenombre, false, includeNonInitialized);
      AddObjectProperty("ClienteNombre_N", gxTv_SdtCliente_Clientenombre_N, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail", gxTv_SdtCliente_Clienteemail, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail_N", gxTv_SdtCliente_Clienteemail_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreEmail1", gxTv_SdtCliente_Clientenombreemail1, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreEmail1_N", gxTv_SdtCliente_Clientenombreemail1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail1", gxTv_SdtCliente_Clienteemail1, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail1_N", gxTv_SdtCliente_Clienteemail1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreEmail2", gxTv_SdtCliente_Clientenombreemail2, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreEmail2_N", gxTv_SdtCliente_Clientenombreemail2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail2", gxTv_SdtCliente_Clienteemail2, false, includeNonInitialized);
      AddObjectProperty("ClienteEmail2_N", gxTv_SdtCliente_Clienteemail2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteEnvio", gxTv_SdtCliente_Clienteenvio, false, includeNonInitialized);
      AddObjectProperty("ClienteEnvio_N", gxTv_SdtCliente_Clienteenvio_N, false, includeNonInitialized);
      AddObjectProperty("ClienteUsuarioWeb", gxTv_SdtCliente_Clienteusuarioweb, false, includeNonInitialized);
      AddObjectProperty("ClienteUsuarioWeb_N", gxTv_SdtCliente_Clienteusuarioweb_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreCelular1", gxTv_SdtCliente_Clientenombrecelular1, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreCelular1_N", gxTv_SdtCliente_Clientenombrecelular1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCelular1", gxTv_SdtCliente_Clientecelular1, false, includeNonInitialized);
      AddObjectProperty("ClienteCelular1_N", gxTv_SdtCliente_Clientecelular1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreCelular2", gxTv_SdtCliente_Clientenombrecelular2, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreCelular2_N", gxTv_SdtCliente_Clientenombrecelular2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCelular2", gxTv_SdtCliente_Clientecelular2, false, includeNonInitialized);
      AddObjectProperty("ClienteCelular2_N", gxTv_SdtCliente_Clientecelular2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCodigoFigaro", gxTv_SdtCliente_Clientecodigofigaro, false, includeNonInitialized);
      AddObjectProperty("ClienteCodigoFigaro_N", gxTv_SdtCliente_Clientecodigofigaro_N, false, includeNonInitialized);
      AddObjectProperty("ClienteTipoUsuario", gxTv_SdtCliente_Clientetipousuario, false, includeNonInitialized);
      AddObjectProperty("ClienteTipoUsuario_N", gxTv_SdtCliente_Clientetipousuario_N, false, includeNonInitialized);
      AddObjectProperty("ClienteDireccion", gxTv_SdtCliente_Clientedireccion, false, includeNonInitialized);
      AddObjectProperty("ClienteDireccion_N", gxTv_SdtCliente_Clientedireccion_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreTelefono1", gxTv_SdtCliente_Clientenombretelefono1, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreTelefono1_N", gxTv_SdtCliente_Clientenombretelefono1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteTelefono1", gxTv_SdtCliente_Clientetelefono1, false, includeNonInitialized);
      AddObjectProperty("ClienteTelefono1_N", gxTv_SdtCliente_Clientetelefono1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreTelefono2", gxTv_SdtCliente_Clientenombretelefono2, false, includeNonInitialized);
      AddObjectProperty("ClienteNombreTelefono2_N", gxTv_SdtCliente_Clientenombretelefono2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteTelefono2", gxTv_SdtCliente_Clientetelefono2, false, includeNonInitialized);
      AddObjectProperty("ClienteTelefono2_N", gxTv_SdtCliente_Clientetelefono2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFax", gxTv_SdtCliente_Clientefax, false, includeNonInitialized);
      AddObjectProperty("ClienteFax_N", gxTv_SdtCliente_Clientefax_N, false, includeNonInitialized);
      AddObjectProperty("ClienteDicose", gxTv_SdtCliente_Clientedicose, false, includeNonInitialized);
      AddObjectProperty("ClienteDicose_N", gxTv_SdtCliente_Clientedicose_N, false, includeNonInitialized);
      AddObjectProperty("ClienteIdDepartamento", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteiddepartamento, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteIdDepartamento_N", gxTv_SdtCliente_Clienteiddepartamento_N, false, includeNonInitialized);
      AddObjectProperty("ClienteIdLocalidad", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteidlocalidad, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteIdLocalidad_N", gxTv_SdtCliente_Clienteidlocalidad_N, false, includeNonInitialized);
      AddObjectProperty("ClienteTecnico1", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientetecnico1, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteTecnico1_N", gxTv_SdtCliente_Clientetecnico1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteTecnico2", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientetecnico2, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteTecnico2_N", gxTv_SdtCliente_Clientetecnico2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteIdAgencia", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteidagencia, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteIdAgencia_N", gxTv_SdtCliente_Clienteidagencia_N, false, includeNonInitialized);
      AddObjectProperty("ClienteContrato", gxTv_SdtCliente_Clientecontrato, false, includeNonInitialized);
      AddObjectProperty("ClienteContrato_N", gxTv_SdtCliente_Clientecontrato_N, false, includeNonInitialized);
      AddObjectProperty("ClienteSocio", gxTv_SdtCliente_Clientesocio, false, includeNonInitialized);
      AddObjectProperty("ClienteSocio_N", gxTv_SdtCliente_Clientesocio_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNoUsar", gxTv_SdtCliente_Clientenousar, false, includeNonInitialized);
      AddObjectProperty("ClienteNoUsar_N", gxTv_SdtCliente_Clientenousar_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCodbar", gxTv_SdtCliente_Clientecodbar, false, includeNonInitialized);
      AddObjectProperty("ClienteCodbar_N", gxTv_SdtCliente_Clientecodbar_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCaravanas", gxTv_SdtCliente_Clientecaravanas, false, includeNonInitialized);
      AddObjectProperty("ClienteCaravanas_N", gxTv_SdtCliente_Clientecaravanas_N, false, includeNonInitialized);
      AddObjectProperty("ClienteProlesa", gxTv_SdtCliente_Clienteprolesa, false, includeNonInitialized);
      AddObjectProperty("ClienteProlesa_N", gxTv_SdtCliente_Clienteprolesa_N, false, includeNonInitialized);
      AddObjectProperty("ClienteProlesaSuc", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteprolesasuc, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteProlesaSuc_N", gxTv_SdtCliente_Clienteprolesasuc_N, false, includeNonInitialized);
      AddObjectProperty("ClienteProlesaMat", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteprolesamat, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteObservaciones", gxTv_SdtCliente_Clienteobservaciones, false, includeNonInitialized);
      AddObjectProperty("ClienteObservaciones_N", gxTv_SdtCliente_Clienteobservaciones_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacRsocial", gxTv_SdtCliente_Clientefacrsocial, false, includeNonInitialized);
      AddObjectProperty("ClienteFacRsocial_N", gxTv_SdtCliente_Clientefacrsocial_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacCedula", gxTv_SdtCliente_Clientefaccedula, false, includeNonInitialized);
      AddObjectProperty("ClienteFacCedula_N", gxTv_SdtCliente_Clientefaccedula_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacRut", gxTv_SdtCliente_Clientefacrut, false, includeNonInitialized);
      AddObjectProperty("ClienteFacRut_N", gxTv_SdtCliente_Clientefacrut_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacDireccion", gxTv_SdtCliente_Clientefacdireccion, false, includeNonInitialized);
      AddObjectProperty("ClienteFacDireccion_N", gxTv_SdtCliente_Clientefacdireccion_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacLocalidad", gxTv_SdtCliente_Clientefaclocalidad, false, includeNonInitialized);
      AddObjectProperty("ClienteFacLocalidad_N", gxTv_SdtCliente_Clientefaclocalidad_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacDepartamento", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefacdepartamento, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteFacDepartamento_N", gxTv_SdtCliente_Clientefacdepartamento_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacCpostal", gxTv_SdtCliente_Clientefaccpostal, false, includeNonInitialized);
      AddObjectProperty("ClienteFacCpostal_N", gxTv_SdtCliente_Clientefaccpostal_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacGiro", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefacgiro, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteFacGiro_N", gxTv_SdtCliente_Clientefacgiro_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreTelefono1", gxTv_SdtCliente_Clientecobnombretelefono1, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreTelefono1_N", gxTv_SdtCliente_Clientecobnombretelefono1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacTelefonos", gxTv_SdtCliente_Clientefactelefonos, false, includeNonInitialized);
      AddObjectProperty("ClienteFacTelefonos_N", gxTv_SdtCliente_Clientefactelefonos_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreTelefono2", gxTv_SdtCliente_Clientecobnombretelefono2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreTelefono2_N", gxTv_SdtCliente_Clientecobnombretelefono2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobTelefono2", gxTv_SdtCliente_Clientecobtelefono2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobTelefono2_N", gxTv_SdtCliente_Clientecobtelefono2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreCelular1", gxTv_SdtCliente_Clientecobnombrecelular1, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreCelular1_N", gxTv_SdtCliente_Clientecobnombrecelular1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobCelular1", gxTv_SdtCliente_Clientecobcelular1, false, includeNonInitialized);
      AddObjectProperty("ClienteCobCelular1_N", gxTv_SdtCliente_Clientecobcelular1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreCelular2", gxTv_SdtCliente_Clientecobnombrecelular2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreCelular2_N", gxTv_SdtCliente_Clientecobnombrecelular2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobCelular2", gxTv_SdtCliente_Clientecobcelular2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobCelular2_N", gxTv_SdtCliente_Clientecobcelular2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreEmail1", gxTv_SdtCliente_Clientecobnombreemail1, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreEmail1_N", gxTv_SdtCliente_Clientecobnombreemail1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobEmail1", gxTv_SdtCliente_Clientecobemail1, false, includeNonInitialized);
      AddObjectProperty("ClienteCobEmail1_N", gxTv_SdtCliente_Clientecobemail1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreEmail2", gxTv_SdtCliente_Clientecobnombreemail2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobNombreEmail2_N", gxTv_SdtCliente_Clientecobnombreemail2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteCobEmail2", gxTv_SdtCliente_Clientecobemail2, false, includeNonInitialized);
      AddObjectProperty("ClienteCobEmail2_N", gxTv_SdtCliente_Clientecobemail2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacFax", gxTv_SdtCliente_Clientefacfax, false, includeNonInitialized);
      AddObjectProperty("ClienteFacFax_N", gxTv_SdtCliente_Clientefacfax_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacEmail", gxTv_SdtCliente_Clientefacemail, false, includeNonInitialized);
      AddObjectProperty("ClienteFacEmail_N", gxTv_SdtCliente_Clientefacemail_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacContrato", gxTv_SdtCliente_Clientefaccontrato, false, includeNonInitialized);
      AddObjectProperty("ClienteFacContrato_N", gxTv_SdtCliente_Clientefaccontrato_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacObservaciones", gxTv_SdtCliente_Clientefacobservaciones, false, includeNonInitialized);
      AddObjectProperty("ClienteFacObservaciones_N", gxTv_SdtCliente_Clientefacobservaciones_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacLista", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefaclista, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("ClienteFacLista_N", gxTv_SdtCliente_Clientefaclista_N, false, includeNonInitialized);
      AddObjectProperty("ClienteFacContado", gxTv_SdtCliente_Clientefaccontado, false, includeNonInitialized);
      AddObjectProperty("ClienteFacContado_N", gxTv_SdtCliente_Clientefaccontado_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailFrascos1", gxTv_SdtCliente_Clientenotemailfrascos1, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailFrascos1_N", gxTv_SdtCliente_Clientenotemailfrascos1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailFrascos2", gxTv_SdtCliente_Clientenotemailfrascos2, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailFrascos2_N", gxTv_SdtCliente_Clientenotemailfrascos2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailMuestra1", gxTv_SdtCliente_Clientenotemailmuestra1, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailMuestra1_N", gxTv_SdtCliente_Clientenotemailmuestra1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailMuestra2", gxTv_SdtCliente_Clientenotemailmuestra2, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailMuestra2_N", gxTv_SdtCliente_Clientenotemailmuestra2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailAnalisis1", gxTv_SdtCliente_Clientenotemailanalisis1, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailAnalisis1_N", gxTv_SdtCliente_Clientenotemailanalisis1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailAnalisis2", gxTv_SdtCliente_Clientenotemailanalisis2, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailAnalisis2_N", gxTv_SdtCliente_Clientenotemailanalisis2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailGeneral1", gxTv_SdtCliente_Clientenotemailgeneral1, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailGeneral1_N", gxTv_SdtCliente_Clientenotemailgeneral1_N, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailGeneral2", gxTv_SdtCliente_Clientenotemailgeneral2, false, includeNonInitialized);
      AddObjectProperty("ClienteNotEmailGeneral2_N", gxTv_SdtCliente_Clientenotemailgeneral2_N, false, includeNonInitialized);
      AddObjectProperty("ClienteIncobrable", gxTv_SdtCliente_Clienteincobrable, false, includeNonInitialized);
      AddObjectProperty("ClienteIncobrable_N", gxTv_SdtCliente_Clienteincobrable_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtCliente_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtCliente_Initialized, false, includeNonInitialized);
         AddObjectProperty("ClienteId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteNombre_Z", gxTv_SdtCliente_Clientenombre_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail_Z", gxTv_SdtCliente_Clienteemail_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreEmail1_Z", gxTv_SdtCliente_Clientenombreemail1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail1_Z", gxTv_SdtCliente_Clienteemail1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreEmail2_Z", gxTv_SdtCliente_Clientenombreemail2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail2_Z", gxTv_SdtCliente_Clienteemail2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteEnvio_Z", gxTv_SdtCliente_Clienteenvio_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteUsuarioWeb_Z", gxTv_SdtCliente_Clienteusuarioweb_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreCelular1_Z", gxTv_SdtCliente_Clientenombrecelular1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCelular1_Z", gxTv_SdtCliente_Clientecelular1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreCelular2_Z", gxTv_SdtCliente_Clientenombrecelular2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCelular2_Z", gxTv_SdtCliente_Clientecelular2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCodigoFigaro_Z", gxTv_SdtCliente_Clientecodigofigaro_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteTipoUsuario_Z", gxTv_SdtCliente_Clientetipousuario_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteDireccion_Z", gxTv_SdtCliente_Clientedireccion_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreTelefono1_Z", gxTv_SdtCliente_Clientenombretelefono1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteTelefono1_Z", gxTv_SdtCliente_Clientetelefono1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreTelefono2_Z", gxTv_SdtCliente_Clientenombretelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteTelefono2_Z", gxTv_SdtCliente_Clientetelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFax_Z", gxTv_SdtCliente_Clientefax_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteDicose_Z", gxTv_SdtCliente_Clientedicose_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteIdDepartamento_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteiddepartamento_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteIdLocalidad_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteidlocalidad_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteTecnico1_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientetecnico1_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteTecnico2_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientetecnico2_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteIdAgencia_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteidagencia_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteContrato_Z", gxTv_SdtCliente_Clientecontrato_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteSocio_Z", gxTv_SdtCliente_Clientesocio_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNoUsar_Z", gxTv_SdtCliente_Clientenousar_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCodbar_Z", gxTv_SdtCliente_Clientecodbar_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCaravanas_Z", gxTv_SdtCliente_Clientecaravanas_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteProlesa_Z", gxTv_SdtCliente_Clienteprolesa_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteProlesaSuc_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteprolesasuc_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteProlesaMat_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clienteprolesamat_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteObservaciones_Z", gxTv_SdtCliente_Clienteobservaciones_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacRsocial_Z", gxTv_SdtCliente_Clientefacrsocial_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacCedula_Z", gxTv_SdtCliente_Clientefaccedula_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacRut_Z", gxTv_SdtCliente_Clientefacrut_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacDireccion_Z", gxTv_SdtCliente_Clientefacdireccion_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacLocalidad_Z", gxTv_SdtCliente_Clientefaclocalidad_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacDepartamento_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefacdepartamento_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteFacCpostal_Z", gxTv_SdtCliente_Clientefaccpostal_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacGiro_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefacgiro_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreTelefono1_Z", gxTv_SdtCliente_Clientecobnombretelefono1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacTelefonos_Z", gxTv_SdtCliente_Clientefactelefonos_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreTelefono2_Z", gxTv_SdtCliente_Clientecobnombretelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobTelefono2_Z", gxTv_SdtCliente_Clientecobtelefono2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreCelular1_Z", gxTv_SdtCliente_Clientecobnombrecelular1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobCelular1_Z", gxTv_SdtCliente_Clientecobcelular1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreCelular2_Z", gxTv_SdtCliente_Clientecobnombrecelular2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobCelular2_Z", gxTv_SdtCliente_Clientecobcelular2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreEmail1_Z", gxTv_SdtCliente_Clientecobnombreemail1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobEmail1_Z", gxTv_SdtCliente_Clientecobemail1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreEmail2_Z", gxTv_SdtCliente_Clientecobnombreemail2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteCobEmail2_Z", gxTv_SdtCliente_Clientecobemail2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacFax_Z", gxTv_SdtCliente_Clientefacfax_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacEmail_Z", gxTv_SdtCliente_Clientefacemail_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacContrato_Z", gxTv_SdtCliente_Clientefaccontrato_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacObservaciones_Z", gxTv_SdtCliente_Clientefacobservaciones_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteFacLista_Z", GXutil.ltrim( GXutil.str( gxTv_SdtCliente_Clientefaclista_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("ClienteFacContado_Z", gxTv_SdtCliente_Clientefaccontado_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailFrascos1_Z", gxTv_SdtCliente_Clientenotemailfrascos1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailFrascos2_Z", gxTv_SdtCliente_Clientenotemailfrascos2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailMuestra1_Z", gxTv_SdtCliente_Clientenotemailmuestra1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailMuestra2_Z", gxTv_SdtCliente_Clientenotemailmuestra2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailAnalisis1_Z", gxTv_SdtCliente_Clientenotemailanalisis1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailAnalisis2_Z", gxTv_SdtCliente_Clientenotemailanalisis2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailGeneral1_Z", gxTv_SdtCliente_Clientenotemailgeneral1_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailGeneral2_Z", gxTv_SdtCliente_Clientenotemailgeneral2_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteIncobrable_Z", gxTv_SdtCliente_Clienteincobrable_Z, false, includeNonInitialized);
         AddObjectProperty("ClienteNombre_N", gxTv_SdtCliente_Clientenombre_N, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail_N", gxTv_SdtCliente_Clienteemail_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreEmail1_N", gxTv_SdtCliente_Clientenombreemail1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail1_N", gxTv_SdtCliente_Clienteemail1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreEmail2_N", gxTv_SdtCliente_Clientenombreemail2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteEmail2_N", gxTv_SdtCliente_Clienteemail2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteEnvio_N", gxTv_SdtCliente_Clienteenvio_N, false, includeNonInitialized);
         AddObjectProperty("ClienteUsuarioWeb_N", gxTv_SdtCliente_Clienteusuarioweb_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreCelular1_N", gxTv_SdtCliente_Clientenombrecelular1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCelular1_N", gxTv_SdtCliente_Clientecelular1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreCelular2_N", gxTv_SdtCliente_Clientenombrecelular2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCelular2_N", gxTv_SdtCliente_Clientecelular2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCodigoFigaro_N", gxTv_SdtCliente_Clientecodigofigaro_N, false, includeNonInitialized);
         AddObjectProperty("ClienteTipoUsuario_N", gxTv_SdtCliente_Clientetipousuario_N, false, includeNonInitialized);
         AddObjectProperty("ClienteDireccion_N", gxTv_SdtCliente_Clientedireccion_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreTelefono1_N", gxTv_SdtCliente_Clientenombretelefono1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteTelefono1_N", gxTv_SdtCliente_Clientetelefono1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNombreTelefono2_N", gxTv_SdtCliente_Clientenombretelefono2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteTelefono2_N", gxTv_SdtCliente_Clientetelefono2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFax_N", gxTv_SdtCliente_Clientefax_N, false, includeNonInitialized);
         AddObjectProperty("ClienteDicose_N", gxTv_SdtCliente_Clientedicose_N, false, includeNonInitialized);
         AddObjectProperty("ClienteIdDepartamento_N", gxTv_SdtCliente_Clienteiddepartamento_N, false, includeNonInitialized);
         AddObjectProperty("ClienteIdLocalidad_N", gxTv_SdtCliente_Clienteidlocalidad_N, false, includeNonInitialized);
         AddObjectProperty("ClienteTecnico1_N", gxTv_SdtCliente_Clientetecnico1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteTecnico2_N", gxTv_SdtCliente_Clientetecnico2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteIdAgencia_N", gxTv_SdtCliente_Clienteidagencia_N, false, includeNonInitialized);
         AddObjectProperty("ClienteContrato_N", gxTv_SdtCliente_Clientecontrato_N, false, includeNonInitialized);
         AddObjectProperty("ClienteSocio_N", gxTv_SdtCliente_Clientesocio_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNoUsar_N", gxTv_SdtCliente_Clientenousar_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCodbar_N", gxTv_SdtCliente_Clientecodbar_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCaravanas_N", gxTv_SdtCliente_Clientecaravanas_N, false, includeNonInitialized);
         AddObjectProperty("ClienteProlesa_N", gxTv_SdtCliente_Clienteprolesa_N, false, includeNonInitialized);
         AddObjectProperty("ClienteProlesaSuc_N", gxTv_SdtCliente_Clienteprolesasuc_N, false, includeNonInitialized);
         AddObjectProperty("ClienteObservaciones_N", gxTv_SdtCliente_Clienteobservaciones_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacRsocial_N", gxTv_SdtCliente_Clientefacrsocial_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacCedula_N", gxTv_SdtCliente_Clientefaccedula_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacRut_N", gxTv_SdtCliente_Clientefacrut_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacDireccion_N", gxTv_SdtCliente_Clientefacdireccion_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacLocalidad_N", gxTv_SdtCliente_Clientefaclocalidad_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacDepartamento_N", gxTv_SdtCliente_Clientefacdepartamento_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacCpostal_N", gxTv_SdtCliente_Clientefaccpostal_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacGiro_N", gxTv_SdtCliente_Clientefacgiro_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreTelefono1_N", gxTv_SdtCliente_Clientecobnombretelefono1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacTelefonos_N", gxTv_SdtCliente_Clientefactelefonos_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreTelefono2_N", gxTv_SdtCliente_Clientecobnombretelefono2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobTelefono2_N", gxTv_SdtCliente_Clientecobtelefono2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreCelular1_N", gxTv_SdtCliente_Clientecobnombrecelular1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobCelular1_N", gxTv_SdtCliente_Clientecobcelular1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreCelular2_N", gxTv_SdtCliente_Clientecobnombrecelular2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobCelular2_N", gxTv_SdtCliente_Clientecobcelular2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreEmail1_N", gxTv_SdtCliente_Clientecobnombreemail1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobEmail1_N", gxTv_SdtCliente_Clientecobemail1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobNombreEmail2_N", gxTv_SdtCliente_Clientecobnombreemail2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteCobEmail2_N", gxTv_SdtCliente_Clientecobemail2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacFax_N", gxTv_SdtCliente_Clientefacfax_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacEmail_N", gxTv_SdtCliente_Clientefacemail_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacContrato_N", gxTv_SdtCliente_Clientefaccontrato_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacObservaciones_N", gxTv_SdtCliente_Clientefacobservaciones_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacLista_N", gxTv_SdtCliente_Clientefaclista_N, false, includeNonInitialized);
         AddObjectProperty("ClienteFacContado_N", gxTv_SdtCliente_Clientefaccontado_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailFrascos1_N", gxTv_SdtCliente_Clientenotemailfrascos1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailFrascos2_N", gxTv_SdtCliente_Clientenotemailfrascos2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailMuestra1_N", gxTv_SdtCliente_Clientenotemailmuestra1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailMuestra2_N", gxTv_SdtCliente_Clientenotemailmuestra2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailAnalisis1_N", gxTv_SdtCliente_Clientenotemailanalisis1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailAnalisis2_N", gxTv_SdtCliente_Clientenotemailanalisis2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailGeneral1_N", gxTv_SdtCliente_Clientenotemailgeneral1_N, false, includeNonInitialized);
         AddObjectProperty("ClienteNotEmailGeneral2_N", gxTv_SdtCliente_Clientenotemailgeneral2_N, false, includeNonInitialized);
         AddObjectProperty("ClienteIncobrable_N", gxTv_SdtCliente_Clienteincobrable_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtCliente sdt )
   {
      if ( sdt.IsDirty("ClienteId") )
      {
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteid = sdt.getgxTv_SdtCliente_Clienteid() ;
      }
      if ( sdt.IsDirty("ClienteNombre") )
      {
         gxTv_SdtCliente_Clientenombre_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombre = sdt.getgxTv_SdtCliente_Clientenombre() ;
      }
      if ( sdt.IsDirty("ClienteEmail") )
      {
         gxTv_SdtCliente_Clienteemail_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteemail = sdt.getgxTv_SdtCliente_Clienteemail() ;
      }
      if ( sdt.IsDirty("ClienteNombreEmail1") )
      {
         gxTv_SdtCliente_Clientenombreemail1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombreemail1 = sdt.getgxTv_SdtCliente_Clientenombreemail1() ;
      }
      if ( sdt.IsDirty("ClienteEmail1") )
      {
         gxTv_SdtCliente_Clienteemail1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteemail1 = sdt.getgxTv_SdtCliente_Clienteemail1() ;
      }
      if ( sdt.IsDirty("ClienteNombreEmail2") )
      {
         gxTv_SdtCliente_Clientenombreemail2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombreemail2 = sdt.getgxTv_SdtCliente_Clientenombreemail2() ;
      }
      if ( sdt.IsDirty("ClienteEmail2") )
      {
         gxTv_SdtCliente_Clienteemail2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteemail2 = sdt.getgxTv_SdtCliente_Clienteemail2() ;
      }
      if ( sdt.IsDirty("ClienteEnvio") )
      {
         gxTv_SdtCliente_Clienteenvio_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteenvio = sdt.getgxTv_SdtCliente_Clienteenvio() ;
      }
      if ( sdt.IsDirty("ClienteUsuarioWeb") )
      {
         gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteusuarioweb = sdt.getgxTv_SdtCliente_Clienteusuarioweb() ;
      }
      if ( sdt.IsDirty("ClienteNombreCelular1") )
      {
         gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombrecelular1 = sdt.getgxTv_SdtCliente_Clientenombrecelular1() ;
      }
      if ( sdt.IsDirty("ClienteCelular1") )
      {
         gxTv_SdtCliente_Clientecelular1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecelular1 = sdt.getgxTv_SdtCliente_Clientecelular1() ;
      }
      if ( sdt.IsDirty("ClienteNombreCelular2") )
      {
         gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombrecelular2 = sdt.getgxTv_SdtCliente_Clientenombrecelular2() ;
      }
      if ( sdt.IsDirty("ClienteCelular2") )
      {
         gxTv_SdtCliente_Clientecelular2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecelular2 = sdt.getgxTv_SdtCliente_Clientecelular2() ;
      }
      if ( sdt.IsDirty("ClienteCodigoFigaro") )
      {
         gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecodigofigaro = sdt.getgxTv_SdtCliente_Clientecodigofigaro() ;
      }
      if ( sdt.IsDirty("ClienteTipoUsuario") )
      {
         gxTv_SdtCliente_Clientetipousuario_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientetipousuario = sdt.getgxTv_SdtCliente_Clientetipousuario() ;
      }
      if ( sdt.IsDirty("ClienteDireccion") )
      {
         gxTv_SdtCliente_Clientedireccion_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientedireccion = sdt.getgxTv_SdtCliente_Clientedireccion() ;
      }
      if ( sdt.IsDirty("ClienteNombreTelefono1") )
      {
         gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombretelefono1 = sdt.getgxTv_SdtCliente_Clientenombretelefono1() ;
      }
      if ( sdt.IsDirty("ClienteTelefono1") )
      {
         gxTv_SdtCliente_Clientetelefono1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientetelefono1 = sdt.getgxTv_SdtCliente_Clientetelefono1() ;
      }
      if ( sdt.IsDirty("ClienteNombreTelefono2") )
      {
         gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenombretelefono2 = sdt.getgxTv_SdtCliente_Clientenombretelefono2() ;
      }
      if ( sdt.IsDirty("ClienteTelefono2") )
      {
         gxTv_SdtCliente_Clientetelefono2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientetelefono2 = sdt.getgxTv_SdtCliente_Clientetelefono2() ;
      }
      if ( sdt.IsDirty("ClienteFax") )
      {
         gxTv_SdtCliente_Clientefax_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefax = sdt.getgxTv_SdtCliente_Clientefax() ;
      }
      if ( sdt.IsDirty("ClienteDicose") )
      {
         gxTv_SdtCliente_Clientedicose_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientedicose = sdt.getgxTv_SdtCliente_Clientedicose() ;
      }
      if ( sdt.IsDirty("ClienteIdDepartamento") )
      {
         gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteiddepartamento = sdt.getgxTv_SdtCliente_Clienteiddepartamento() ;
      }
      if ( sdt.IsDirty("ClienteIdLocalidad") )
      {
         gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteidlocalidad = sdt.getgxTv_SdtCliente_Clienteidlocalidad() ;
      }
      if ( sdt.IsDirty("ClienteTecnico1") )
      {
         gxTv_SdtCliente_Clientetecnico1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientetecnico1 = sdt.getgxTv_SdtCliente_Clientetecnico1() ;
      }
      if ( sdt.IsDirty("ClienteTecnico2") )
      {
         gxTv_SdtCliente_Clientetecnico2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientetecnico2 = sdt.getgxTv_SdtCliente_Clientetecnico2() ;
      }
      if ( sdt.IsDirty("ClienteIdAgencia") )
      {
         gxTv_SdtCliente_Clienteidagencia_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteidagencia = sdt.getgxTv_SdtCliente_Clienteidagencia() ;
      }
      if ( sdt.IsDirty("ClienteContrato") )
      {
         gxTv_SdtCliente_Clientecontrato_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecontrato = sdt.getgxTv_SdtCliente_Clientecontrato() ;
      }
      if ( sdt.IsDirty("ClienteSocio") )
      {
         gxTv_SdtCliente_Clientesocio_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientesocio = sdt.getgxTv_SdtCliente_Clientesocio() ;
      }
      if ( sdt.IsDirty("ClienteNoUsar") )
      {
         gxTv_SdtCliente_Clientenousar_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenousar = sdt.getgxTv_SdtCliente_Clientenousar() ;
      }
      if ( sdt.IsDirty("ClienteCodbar") )
      {
         gxTv_SdtCliente_Clientecodbar_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecodbar = sdt.getgxTv_SdtCliente_Clientecodbar() ;
      }
      if ( sdt.IsDirty("ClienteCaravanas") )
      {
         gxTv_SdtCliente_Clientecaravanas_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecaravanas = sdt.getgxTv_SdtCliente_Clientecaravanas() ;
      }
      if ( sdt.IsDirty("ClienteProlesa") )
      {
         gxTv_SdtCliente_Clienteprolesa_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteprolesa = sdt.getgxTv_SdtCliente_Clienteprolesa() ;
      }
      if ( sdt.IsDirty("ClienteProlesaSuc") )
      {
         gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteprolesasuc = sdt.getgxTv_SdtCliente_Clienteprolesasuc() ;
      }
      if ( sdt.IsDirty("ClienteProlesaMat") )
      {
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteprolesamat = sdt.getgxTv_SdtCliente_Clienteprolesamat() ;
      }
      if ( sdt.IsDirty("ClienteObservaciones") )
      {
         gxTv_SdtCliente_Clienteobservaciones_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteobservaciones = sdt.getgxTv_SdtCliente_Clienteobservaciones() ;
      }
      if ( sdt.IsDirty("ClienteFacRsocial") )
      {
         gxTv_SdtCliente_Clientefacrsocial_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacrsocial = sdt.getgxTv_SdtCliente_Clientefacrsocial() ;
      }
      if ( sdt.IsDirty("ClienteFacCedula") )
      {
         gxTv_SdtCliente_Clientefaccedula_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaccedula = sdt.getgxTv_SdtCliente_Clientefaccedula() ;
      }
      if ( sdt.IsDirty("ClienteFacRut") )
      {
         gxTv_SdtCliente_Clientefacrut_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacrut = sdt.getgxTv_SdtCliente_Clientefacrut() ;
      }
      if ( sdt.IsDirty("ClienteFacDireccion") )
      {
         gxTv_SdtCliente_Clientefacdireccion_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacdireccion = sdt.getgxTv_SdtCliente_Clientefacdireccion() ;
      }
      if ( sdt.IsDirty("ClienteFacLocalidad") )
      {
         gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaclocalidad = sdt.getgxTv_SdtCliente_Clientefaclocalidad() ;
      }
      if ( sdt.IsDirty("ClienteFacDepartamento") )
      {
         gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacdepartamento = sdt.getgxTv_SdtCliente_Clientefacdepartamento() ;
      }
      if ( sdt.IsDirty("ClienteFacCpostal") )
      {
         gxTv_SdtCliente_Clientefaccpostal_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaccpostal = sdt.getgxTv_SdtCliente_Clientefaccpostal() ;
      }
      if ( sdt.IsDirty("ClienteFacGiro") )
      {
         gxTv_SdtCliente_Clientefacgiro_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacgiro = sdt.getgxTv_SdtCliente_Clientefacgiro() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreTelefono1") )
      {
         gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombretelefono1 = sdt.getgxTv_SdtCliente_Clientecobnombretelefono1() ;
      }
      if ( sdt.IsDirty("ClienteFacTelefonos") )
      {
         gxTv_SdtCliente_Clientefactelefonos_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefactelefonos = sdt.getgxTv_SdtCliente_Clientefactelefonos() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreTelefono2") )
      {
         gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombretelefono2 = sdt.getgxTv_SdtCliente_Clientecobnombretelefono2() ;
      }
      if ( sdt.IsDirty("ClienteCobTelefono2") )
      {
         gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobtelefono2 = sdt.getgxTv_SdtCliente_Clientecobtelefono2() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreCelular1") )
      {
         gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombrecelular1 = sdt.getgxTv_SdtCliente_Clientecobnombrecelular1() ;
      }
      if ( sdt.IsDirty("ClienteCobCelular1") )
      {
         gxTv_SdtCliente_Clientecobcelular1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobcelular1 = sdt.getgxTv_SdtCliente_Clientecobcelular1() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreCelular2") )
      {
         gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombrecelular2 = sdt.getgxTv_SdtCliente_Clientecobnombrecelular2() ;
      }
      if ( sdt.IsDirty("ClienteCobCelular2") )
      {
         gxTv_SdtCliente_Clientecobcelular2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobcelular2 = sdt.getgxTv_SdtCliente_Clientecobcelular2() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreEmail1") )
      {
         gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombreemail1 = sdt.getgxTv_SdtCliente_Clientecobnombreemail1() ;
      }
      if ( sdt.IsDirty("ClienteCobEmail1") )
      {
         gxTv_SdtCliente_Clientecobemail1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobemail1 = sdt.getgxTv_SdtCliente_Clientecobemail1() ;
      }
      if ( sdt.IsDirty("ClienteCobNombreEmail2") )
      {
         gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobnombreemail2 = sdt.getgxTv_SdtCliente_Clientecobnombreemail2() ;
      }
      if ( sdt.IsDirty("ClienteCobEmail2") )
      {
         gxTv_SdtCliente_Clientecobemail2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientecobemail2 = sdt.getgxTv_SdtCliente_Clientecobemail2() ;
      }
      if ( sdt.IsDirty("ClienteFacFax") )
      {
         gxTv_SdtCliente_Clientefacfax_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacfax = sdt.getgxTv_SdtCliente_Clientefacfax() ;
      }
      if ( sdt.IsDirty("ClienteFacEmail") )
      {
         gxTv_SdtCliente_Clientefacemail_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacemail = sdt.getgxTv_SdtCliente_Clientefacemail() ;
      }
      if ( sdt.IsDirty("ClienteFacContrato") )
      {
         gxTv_SdtCliente_Clientefaccontrato_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaccontrato = sdt.getgxTv_SdtCliente_Clientefaccontrato() ;
      }
      if ( sdt.IsDirty("ClienteFacObservaciones") )
      {
         gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefacobservaciones = sdt.getgxTv_SdtCliente_Clientefacobservaciones() ;
      }
      if ( sdt.IsDirty("ClienteFacLista") )
      {
         gxTv_SdtCliente_Clientefaclista_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaclista = sdt.getgxTv_SdtCliente_Clientefaclista() ;
      }
      if ( sdt.IsDirty("ClienteFacContado") )
      {
         gxTv_SdtCliente_Clientefaccontado_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientefaccontado = sdt.getgxTv_SdtCliente_Clientefaccontado() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailFrascos1") )
      {
         gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailfrascos1 = sdt.getgxTv_SdtCliente_Clientenotemailfrascos1() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailFrascos2") )
      {
         gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailfrascos2 = sdt.getgxTv_SdtCliente_Clientenotemailfrascos2() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailMuestra1") )
      {
         gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailmuestra1 = sdt.getgxTv_SdtCliente_Clientenotemailmuestra1() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailMuestra2") )
      {
         gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailmuestra2 = sdt.getgxTv_SdtCliente_Clientenotemailmuestra2() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailAnalisis1") )
      {
         gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailanalisis1 = sdt.getgxTv_SdtCliente_Clientenotemailanalisis1() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailAnalisis2") )
      {
         gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailanalisis2 = sdt.getgxTv_SdtCliente_Clientenotemailanalisis2() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailGeneral1") )
      {
         gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailgeneral1 = sdt.getgxTv_SdtCliente_Clientenotemailgeneral1() ;
      }
      if ( sdt.IsDirty("ClienteNotEmailGeneral2") )
      {
         gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clientenotemailgeneral2 = sdt.getgxTv_SdtCliente_Clientenotemailgeneral2() ;
      }
      if ( sdt.IsDirty("ClienteIncobrable") )
      {
         gxTv_SdtCliente_Clienteincobrable_N = (byte)(0) ;
         gxTv_SdtCliente_N = (byte)(0) ;
         gxTv_SdtCliente_Clienteincobrable = sdt.getgxTv_SdtCliente_Clienteincobrable() ;
      }
   }

   public long getgxTv_SdtCliente_Clienteid( )
   {
      return gxTv_SdtCliente_Clienteid ;
   }

   public void setgxTv_SdtCliente_Clienteid( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      if ( gxTv_SdtCliente_Clienteid != value )
      {
         gxTv_SdtCliente_Mode = "INS" ;
         this.setgxTv_SdtCliente_Clienteid_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombre_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteemail_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombreemail1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteemail1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombreemail2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteemail2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteenvio_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteusuarioweb_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombrecelular1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecelular1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombrecelular2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecelular2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecodigofigaro_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientetipousuario_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientedireccion_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombretelefono1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientetelefono1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenombretelefono2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientetelefono2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefax_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientedicose_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteiddepartamento_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteidlocalidad_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientetecnico1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientetecnico2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteidagencia_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecontrato_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientesocio_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenousar_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecodbar_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecaravanas_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteprolesa_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteprolesasuc_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteprolesamat_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteobservaciones_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacrsocial_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaccedula_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacrut_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacdireccion_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaclocalidad_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacdepartamento_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaccpostal_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacgiro_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombretelefono1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefactelefonos_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombretelefono2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobtelefono2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombrecelular1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobcelular1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombrecelular2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobcelular2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombreemail1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobemail1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobnombreemail2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientecobemail2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacfax_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacemail_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaccontrato_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefacobservaciones_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaclista_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientefaccontado_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailfrascos1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailfrascos2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailmuestra1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailmuestra2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailanalisis1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailanalisis2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailgeneral1_Z_SetNull( );
         this.setgxTv_SdtCliente_Clientenotemailgeneral2_Z_SetNull( );
         this.setgxTv_SdtCliente_Clienteincobrable_Z_SetNull( );
      }
      SetDirty("Clienteid");
      gxTv_SdtCliente_Clienteid = value ;
   }

   public String getgxTv_SdtCliente_Clientenombre( )
   {
      return gxTv_SdtCliente_Clientenombre ;
   }

   public void setgxTv_SdtCliente_Clientenombre( String value )
   {
      gxTv_SdtCliente_Clientenombre_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombre");
      gxTv_SdtCliente_Clientenombre = value ;
   }

   public void setgxTv_SdtCliente_Clientenombre_SetNull( )
   {
      gxTv_SdtCliente_Clientenombre_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombre = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombre_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombre_N==1) ;
   }

   public String getgxTv_SdtCliente_Clienteemail( )
   {
      return gxTv_SdtCliente_Clienteemail ;
   }

   public void setgxTv_SdtCliente_Clienteemail( String value )
   {
      gxTv_SdtCliente_Clienteemail_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail");
      gxTv_SdtCliente_Clienteemail = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteemail_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombreemail1( )
   {
      return gxTv_SdtCliente_Clientenombreemail1 ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1( String value )
   {
      gxTv_SdtCliente_Clientenombreemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail1");
      gxTv_SdtCliente_Clientenombreemail1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombreemail1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombreemail1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clienteemail1( )
   {
      return gxTv_SdtCliente_Clienteemail1 ;
   }

   public void setgxTv_SdtCliente_Clienteemail1( String value )
   {
      gxTv_SdtCliente_Clienteemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail1");
      gxTv_SdtCliente_Clienteemail1 = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail1_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail1_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteemail1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombreemail2( )
   {
      return gxTv_SdtCliente_Clientenombreemail2 ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2( String value )
   {
      gxTv_SdtCliente_Clientenombreemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail2");
      gxTv_SdtCliente_Clientenombreemail2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombreemail2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombreemail2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clienteemail2( )
   {
      return gxTv_SdtCliente_Clienteemail2 ;
   }

   public void setgxTv_SdtCliente_Clienteemail2( String value )
   {
      gxTv_SdtCliente_Clienteemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail2");
      gxTv_SdtCliente_Clienteemail2 = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail2_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail2_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteemail2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clienteenvio( )
   {
      return gxTv_SdtCliente_Clienteenvio ;
   }

   public void setgxTv_SdtCliente_Clienteenvio( String value )
   {
      gxTv_SdtCliente_Clienteenvio_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteenvio");
      gxTv_SdtCliente_Clienteenvio = value ;
   }

   public void setgxTv_SdtCliente_Clienteenvio_SetNull( )
   {
      gxTv_SdtCliente_Clienteenvio_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteenvio = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteenvio_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteenvio_N==1) ;
   }

   public String getgxTv_SdtCliente_Clienteusuarioweb( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb( String value )
   {
      gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteusuarioweb");
      gxTv_SdtCliente_Clienteusuarioweb = value ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb_SetNull( )
   {
      gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteusuarioweb = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteusuarioweb_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteusuarioweb_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombrecelular1( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1 ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1( String value )
   {
      gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular1");
      gxTv_SdtCliente_Clientenombrecelular1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombrecelular1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombrecelular1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecelular1( )
   {
      return gxTv_SdtCliente_Clientecelular1 ;
   }

   public void setgxTv_SdtCliente_Clientecelular1( String value )
   {
      gxTv_SdtCliente_Clientecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular1");
      gxTv_SdtCliente_Clientecelular1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular1_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecelular1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecelular1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombrecelular2( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2 ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2( String value )
   {
      gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular2");
      gxTv_SdtCliente_Clientenombrecelular2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombrecelular2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombrecelular2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecelular2( )
   {
      return gxTv_SdtCliente_Clientecelular2 ;
   }

   public void setgxTv_SdtCliente_Clientecelular2( String value )
   {
      gxTv_SdtCliente_Clientecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular2");
      gxTv_SdtCliente_Clientecelular2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular2_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecelular2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecelular2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecodigofigaro( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro( String value )
   {
      gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodigofigaro");
      gxTv_SdtCliente_Clientecodigofigaro = value ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro_SetNull( )
   {
      gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecodigofigaro = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecodigofigaro_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecodigofigaro_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientetipousuario( )
   {
      return gxTv_SdtCliente_Clientetipousuario ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario( short value )
   {
      gxTv_SdtCliente_Clientetipousuario_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetipousuario");
      gxTv_SdtCliente_Clientetipousuario = value ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario_SetNull( )
   {
      gxTv_SdtCliente_Clientetipousuario_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetipousuario = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetipousuario_IsNull( )
   {
      return (gxTv_SdtCliente_Clientetipousuario_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientedireccion( )
   {
      return gxTv_SdtCliente_Clientedireccion ;
   }

   public void setgxTv_SdtCliente_Clientedireccion( String value )
   {
      gxTv_SdtCliente_Clientedireccion_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedireccion");
      gxTv_SdtCliente_Clientedireccion = value ;
   }

   public void setgxTv_SdtCliente_Clientedireccion_SetNull( )
   {
      gxTv_SdtCliente_Clientedireccion_N = (byte)(1) ;
      gxTv_SdtCliente_Clientedireccion = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientedireccion_IsNull( )
   {
      return (gxTv_SdtCliente_Clientedireccion_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombretelefono1( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1 ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1( String value )
   {
      gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono1");
      gxTv_SdtCliente_Clientenombretelefono1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombretelefono1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombretelefono1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientetelefono1( )
   {
      return gxTv_SdtCliente_Clientetelefono1 ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1( String value )
   {
      gxTv_SdtCliente_Clientetelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono1");
      gxTv_SdtCliente_Clientetelefono1 = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetelefono1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientetelefono1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenombretelefono2( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2 ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2( String value )
   {
      gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono2");
      gxTv_SdtCliente_Clientenombretelefono2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombretelefono2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenombretelefono2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientetelefono2( )
   {
      return gxTv_SdtCliente_Clientetelefono2 ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2( String value )
   {
      gxTv_SdtCliente_Clientetelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono2");
      gxTv_SdtCliente_Clientetelefono2 = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetelefono2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientetelefono2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefax( )
   {
      return gxTv_SdtCliente_Clientefax ;
   }

   public void setgxTv_SdtCliente_Clientefax( String value )
   {
      gxTv_SdtCliente_Clientefax_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefax");
      gxTv_SdtCliente_Clientefax = value ;
   }

   public void setgxTv_SdtCliente_Clientefax_SetNull( )
   {
      gxTv_SdtCliente_Clientefax_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefax = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefax_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefax_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientedicose( )
   {
      return gxTv_SdtCliente_Clientedicose ;
   }

   public void setgxTv_SdtCliente_Clientedicose( String value )
   {
      gxTv_SdtCliente_Clientedicose_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedicose");
      gxTv_SdtCliente_Clientedicose = value ;
   }

   public void setgxTv_SdtCliente_Clientedicose_SetNull( )
   {
      gxTv_SdtCliente_Clientedicose_N = (byte)(1) ;
      gxTv_SdtCliente_Clientedicose = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientedicose_IsNull( )
   {
      return (gxTv_SdtCliente_Clientedicose_N==1) ;
   }

   public long getgxTv_SdtCliente_Clienteiddepartamento( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento( long value )
   {
      gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteiddepartamento");
      gxTv_SdtCliente_Clienteiddepartamento = value ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento_SetNull( )
   {
      gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteiddepartamento = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteiddepartamento_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteiddepartamento_N==1) ;
   }

   public long getgxTv_SdtCliente_Clienteidlocalidad( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad( long value )
   {
      gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidlocalidad");
      gxTv_SdtCliente_Clienteidlocalidad = value ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad_SetNull( )
   {
      gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteidlocalidad = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteidlocalidad_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteidlocalidad_N==1) ;
   }

   public long getgxTv_SdtCliente_Clientetecnico1( )
   {
      return gxTv_SdtCliente_Clientetecnico1 ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1( long value )
   {
      gxTv_SdtCliente_Clientetecnico1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico1");
      gxTv_SdtCliente_Clientetecnico1 = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetecnico1 = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientetecnico1_N==1) ;
   }

   public long getgxTv_SdtCliente_Clientetecnico2( )
   {
      return gxTv_SdtCliente_Clientetecnico2 ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2( long value )
   {
      gxTv_SdtCliente_Clientetecnico2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico2");
      gxTv_SdtCliente_Clientetecnico2 = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetecnico2 = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientetecnico2_N==1) ;
   }

   public long getgxTv_SdtCliente_Clienteidagencia( )
   {
      return gxTv_SdtCliente_Clienteidagencia ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia( long value )
   {
      gxTv_SdtCliente_Clienteidagencia_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidagencia");
      gxTv_SdtCliente_Clienteidagencia = value ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia_SetNull( )
   {
      gxTv_SdtCliente_Clienteidagencia_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteidagencia = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteidagencia_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteidagencia_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientecontrato( )
   {
      return gxTv_SdtCliente_Clientecontrato ;
   }

   public void setgxTv_SdtCliente_Clientecontrato( short value )
   {
      gxTv_SdtCliente_Clientecontrato_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecontrato");
      gxTv_SdtCliente_Clientecontrato = value ;
   }

   public void setgxTv_SdtCliente_Clientecontrato_SetNull( )
   {
      gxTv_SdtCliente_Clientecontrato_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecontrato = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecontrato_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecontrato_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientesocio( )
   {
      return gxTv_SdtCliente_Clientesocio ;
   }

   public void setgxTv_SdtCliente_Clientesocio( short value )
   {
      gxTv_SdtCliente_Clientesocio_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientesocio");
      gxTv_SdtCliente_Clientesocio = value ;
   }

   public void setgxTv_SdtCliente_Clientesocio_SetNull( )
   {
      gxTv_SdtCliente_Clientesocio_N = (byte)(1) ;
      gxTv_SdtCliente_Clientesocio = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientesocio_IsNull( )
   {
      return (gxTv_SdtCliente_Clientesocio_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientenousar( )
   {
      return gxTv_SdtCliente_Clientenousar ;
   }

   public void setgxTv_SdtCliente_Clientenousar( short value )
   {
      gxTv_SdtCliente_Clientenousar_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenousar");
      gxTv_SdtCliente_Clientenousar = value ;
   }

   public void setgxTv_SdtCliente_Clientenousar_SetNull( )
   {
      gxTv_SdtCliente_Clientenousar_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenousar = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenousar_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenousar_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientecodbar( )
   {
      return gxTv_SdtCliente_Clientecodbar ;
   }

   public void setgxTv_SdtCliente_Clientecodbar( short value )
   {
      gxTv_SdtCliente_Clientecodbar_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodbar");
      gxTv_SdtCliente_Clientecodbar = value ;
   }

   public void setgxTv_SdtCliente_Clientecodbar_SetNull( )
   {
      gxTv_SdtCliente_Clientecodbar_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecodbar = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecodbar_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecodbar_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientecaravanas( )
   {
      return gxTv_SdtCliente_Clientecaravanas ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas( short value )
   {
      gxTv_SdtCliente_Clientecaravanas_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecaravanas");
      gxTv_SdtCliente_Clientecaravanas = value ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas_SetNull( )
   {
      gxTv_SdtCliente_Clientecaravanas_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecaravanas = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecaravanas_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecaravanas_N==1) ;
   }

   public short getgxTv_SdtCliente_Clienteprolesa( )
   {
      return gxTv_SdtCliente_Clienteprolesa ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa( short value )
   {
      gxTv_SdtCliente_Clienteprolesa_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesa");
      gxTv_SdtCliente_Clienteprolesa = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesa_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteprolesa = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesa_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteprolesa_N==1) ;
   }

   public long getgxTv_SdtCliente_Clienteprolesasuc( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc( long value )
   {
      gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesasuc");
      gxTv_SdtCliente_Clienteprolesasuc = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteprolesasuc = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesasuc_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteprolesasuc_N==1) ;
   }

   public long getgxTv_SdtCliente_Clienteprolesamat( )
   {
      return gxTv_SdtCliente_Clienteprolesamat ;
   }

   public void setgxTv_SdtCliente_Clienteprolesamat( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesamat");
      gxTv_SdtCliente_Clienteprolesamat = value ;
   }

   public String getgxTv_SdtCliente_Clienteobservaciones( )
   {
      return gxTv_SdtCliente_Clienteobservaciones ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones( String value )
   {
      gxTv_SdtCliente_Clienteobservaciones_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteobservaciones");
      gxTv_SdtCliente_Clienteobservaciones = value ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones_SetNull( )
   {
      gxTv_SdtCliente_Clienteobservaciones_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteobservaciones = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteobservaciones_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteobservaciones_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacrsocial( )
   {
      return gxTv_SdtCliente_Clientefacrsocial ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial( String value )
   {
      gxTv_SdtCliente_Clientefacrsocial_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrsocial");
      gxTv_SdtCliente_Clientefacrsocial = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrsocial_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacrsocial = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrsocial_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacrsocial_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefaccedula( )
   {
      return gxTv_SdtCliente_Clientefaccedula ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula( String value )
   {
      gxTv_SdtCliente_Clientefaccedula_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccedula");
      gxTv_SdtCliente_Clientefaccedula = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccedula_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccedula = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccedula_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaccedula_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacrut( )
   {
      return gxTv_SdtCliente_Clientefacrut ;
   }

   public void setgxTv_SdtCliente_Clientefacrut( String value )
   {
      gxTv_SdtCliente_Clientefacrut_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrut");
      gxTv_SdtCliente_Clientefacrut = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrut_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrut_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacrut = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrut_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacrut_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacdireccion( )
   {
      return gxTv_SdtCliente_Clientefacdireccion ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion( String value )
   {
      gxTv_SdtCliente_Clientefacdireccion_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdireccion");
      gxTv_SdtCliente_Clientefacdireccion = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdireccion_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacdireccion = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdireccion_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacdireccion_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefaclocalidad( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad( String value )
   {
      gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclocalidad");
      gxTv_SdtCliente_Clientefaclocalidad = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaclocalidad = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclocalidad_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaclocalidad_N==1) ;
   }

   public long getgxTv_SdtCliente_Clientefacdepartamento( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento( long value )
   {
      gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdepartamento");
      gxTv_SdtCliente_Clientefacdepartamento = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacdepartamento = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdepartamento_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacdepartamento_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefaccpostal( )
   {
      return gxTv_SdtCliente_Clientefaccpostal ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal( String value )
   {
      gxTv_SdtCliente_Clientefaccpostal_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccpostal");
      gxTv_SdtCliente_Clientefaccpostal = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccpostal_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccpostal = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccpostal_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaccpostal_N==1) ;
   }

   public long getgxTv_SdtCliente_Clientefacgiro( )
   {
      return gxTv_SdtCliente_Clientefacgiro ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro( long value )
   {
      gxTv_SdtCliente_Clientefacgiro_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacgiro");
      gxTv_SdtCliente_Clientefacgiro = value ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro_SetNull( )
   {
      gxTv_SdtCliente_Clientefacgiro_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacgiro = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefacgiro_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacgiro_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombretelefono1( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1( String value )
   {
      gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono1");
      gxTv_SdtCliente_Clientecobnombretelefono1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombretelefono1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombretelefono1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefactelefonos( )
   {
      return gxTv_SdtCliente_Clientefactelefonos ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos( String value )
   {
      gxTv_SdtCliente_Clientefactelefonos_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefactelefonos");
      gxTv_SdtCliente_Clientefactelefonos = value ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos_SetNull( )
   {
      gxTv_SdtCliente_Clientefactelefonos_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefactelefonos = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefactelefonos_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefactelefonos_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombretelefono2( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2( String value )
   {
      gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono2");
      gxTv_SdtCliente_Clientecobnombretelefono2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombretelefono2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombretelefono2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobtelefono2( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2 ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2( String value )
   {
      gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobtelefono2");
      gxTv_SdtCliente_Clientecobtelefono2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobtelefono2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobtelefono2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobtelefono2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombrecelular1( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1( String value )
   {
      gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular1");
      gxTv_SdtCliente_Clientecobnombrecelular1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombrecelular1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombrecelular1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobcelular1( )
   {
      return gxTv_SdtCliente_Clientecobcelular1 ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1( String value )
   {
      gxTv_SdtCliente_Clientecobcelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular1");
      gxTv_SdtCliente_Clientecobcelular1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobcelular1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobcelular1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombrecelular2( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2( String value )
   {
      gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular2");
      gxTv_SdtCliente_Clientecobnombrecelular2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombrecelular2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombrecelular2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobcelular2( )
   {
      return gxTv_SdtCliente_Clientecobcelular2 ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2( String value )
   {
      gxTv_SdtCliente_Clientecobcelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular2");
      gxTv_SdtCliente_Clientecobcelular2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobcelular2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobcelular2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombreemail1( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1( String value )
   {
      gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail1");
      gxTv_SdtCliente_Clientecobnombreemail1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombreemail1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombreemail1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobemail1( )
   {
      return gxTv_SdtCliente_Clientecobemail1 ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1( String value )
   {
      gxTv_SdtCliente_Clientecobemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail1");
      gxTv_SdtCliente_Clientecobemail1 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobemail1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobemail1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobnombreemail2( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2 ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2( String value )
   {
      gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail2");
      gxTv_SdtCliente_Clientecobnombreemail2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombreemail2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobnombreemail2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientecobemail2( )
   {
      return gxTv_SdtCliente_Clientecobemail2 ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2( String value )
   {
      gxTv_SdtCliente_Clientecobemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail2");
      gxTv_SdtCliente_Clientecobemail2 = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobemail2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientecobemail2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacfax( )
   {
      return gxTv_SdtCliente_Clientefacfax ;
   }

   public void setgxTv_SdtCliente_Clientefacfax( String value )
   {
      gxTv_SdtCliente_Clientefacfax_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacfax");
      gxTv_SdtCliente_Clientefacfax = value ;
   }

   public void setgxTv_SdtCliente_Clientefacfax_SetNull( )
   {
      gxTv_SdtCliente_Clientefacfax_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacfax = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacfax_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacfax_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacemail( )
   {
      return gxTv_SdtCliente_Clientefacemail ;
   }

   public void setgxTv_SdtCliente_Clientefacemail( String value )
   {
      gxTv_SdtCliente_Clientefacemail_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacemail");
      gxTv_SdtCliente_Clientefacemail = value ;
   }

   public void setgxTv_SdtCliente_Clientefacemail_SetNull( )
   {
      gxTv_SdtCliente_Clientefacemail_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacemail = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacemail_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacemail_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefaccontrato( )
   {
      return gxTv_SdtCliente_Clientefaccontrato ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato( String value )
   {
      gxTv_SdtCliente_Clientefaccontrato_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontrato");
      gxTv_SdtCliente_Clientefaccontrato = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontrato_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccontrato = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontrato_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaccontrato_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientefacobservaciones( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones( String value )
   {
      gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacobservaciones");
      gxTv_SdtCliente_Clientefacobservaciones = value ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones_SetNull( )
   {
      gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacobservaciones = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacobservaciones_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefacobservaciones_N==1) ;
   }

   public long getgxTv_SdtCliente_Clientefaclista( )
   {
      return gxTv_SdtCliente_Clientefaclista ;
   }

   public void setgxTv_SdtCliente_Clientefaclista( long value )
   {
      gxTv_SdtCliente_Clientefaclista_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclista");
      gxTv_SdtCliente_Clientefaclista = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclista_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclista_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaclista = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclista_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaclista_N==1) ;
   }

   public short getgxTv_SdtCliente_Clientefaccontado( )
   {
      return gxTv_SdtCliente_Clientefaccontado ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado( short value )
   {
      gxTv_SdtCliente_Clientefaccontado_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontado");
      gxTv_SdtCliente_Clientefaccontado = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontado_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccontado = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontado_IsNull( )
   {
      return (gxTv_SdtCliente_Clientefaccontado_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailfrascos1( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1( String value )
   {
      gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos1");
      gxTv_SdtCliente_Clientenotemailfrascos1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailfrascos1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailfrascos1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailfrascos2( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2( String value )
   {
      gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos2");
      gxTv_SdtCliente_Clientenotemailfrascos2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailfrascos2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailfrascos2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailmuestra1( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1( String value )
   {
      gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra1");
      gxTv_SdtCliente_Clientenotemailmuestra1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailmuestra1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailmuestra1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailmuestra2( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2( String value )
   {
      gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra2");
      gxTv_SdtCliente_Clientenotemailmuestra2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailmuestra2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailmuestra2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailanalisis1( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1( String value )
   {
      gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis1");
      gxTv_SdtCliente_Clientenotemailanalisis1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailanalisis1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailanalisis1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailanalisis2( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2( String value )
   {
      gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis2");
      gxTv_SdtCliente_Clientenotemailanalisis2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailanalisis2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailanalisis2_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailgeneral1( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1( String value )
   {
      gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral1");
      gxTv_SdtCliente_Clientenotemailgeneral1 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailgeneral1 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral1_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailgeneral1_N==1) ;
   }

   public String getgxTv_SdtCliente_Clientenotemailgeneral2( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2 ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2( String value )
   {
      gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral2");
      gxTv_SdtCliente_Clientenotemailgeneral2 = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailgeneral2 = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral2_IsNull( )
   {
      return (gxTv_SdtCliente_Clientenotemailgeneral2_N==1) ;
   }

   public short getgxTv_SdtCliente_Clienteincobrable( )
   {
      return gxTv_SdtCliente_Clienteincobrable ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable( short value )
   {
      gxTv_SdtCliente_Clienteincobrable_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteincobrable");
      gxTv_SdtCliente_Clienteincobrable = value ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable_SetNull( )
   {
      gxTv_SdtCliente_Clienteincobrable_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteincobrable = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteincobrable_IsNull( )
   {
      return (gxTv_SdtCliente_Clienteincobrable_N==1) ;
   }

   public String getgxTv_SdtCliente_Mode( )
   {
      return gxTv_SdtCliente_Mode ;
   }

   public void setgxTv_SdtCliente_Mode( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtCliente_Mode = value ;
   }

   public void setgxTv_SdtCliente_Mode_SetNull( )
   {
      gxTv_SdtCliente_Mode = "" ;
   }

   public boolean getgxTv_SdtCliente_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Initialized( )
   {
      return gxTv_SdtCliente_Initialized ;
   }

   public void setgxTv_SdtCliente_Initialized( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtCliente_Initialized = value ;
   }

   public void setgxTv_SdtCliente_Initialized_SetNull( )
   {
      gxTv_SdtCliente_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteid_Z( )
   {
      return gxTv_SdtCliente_Clienteid_Z ;
   }

   public void setgxTv_SdtCliente_Clienteid_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteid_Z");
      gxTv_SdtCliente_Clienteid_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteid_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteid_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombre_Z( )
   {
      return gxTv_SdtCliente_Clientenombre_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombre_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombre_Z");
      gxTv_SdtCliente_Clientenombre_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombre_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombre_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombre_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteemail_Z( )
   {
      return gxTv_SdtCliente_Clienteemail_Z ;
   }

   public void setgxTv_SdtCliente_Clienteemail_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail_Z");
      gxTv_SdtCliente_Clienteemail_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombreemail1_Z( )
   {
      return gxTv_SdtCliente_Clientenombreemail1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail1_Z");
      gxTv_SdtCliente_Clientenombreemail1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteemail1_Z( )
   {
      return gxTv_SdtCliente_Clienteemail1_Z ;
   }

   public void setgxTv_SdtCliente_Clienteemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail1_Z");
      gxTv_SdtCliente_Clienteemail1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombreemail2_Z( )
   {
      return gxTv_SdtCliente_Clientenombreemail2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail2_Z");
      gxTv_SdtCliente_Clientenombreemail2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteemail2_Z( )
   {
      return gxTv_SdtCliente_Clienteemail2_Z ;
   }

   public void setgxTv_SdtCliente_Clienteemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail2_Z");
      gxTv_SdtCliente_Clienteemail2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteenvio_Z( )
   {
      return gxTv_SdtCliente_Clienteenvio_Z ;
   }

   public void setgxTv_SdtCliente_Clienteenvio_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteenvio_Z");
      gxTv_SdtCliente_Clienteenvio_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteenvio_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteenvio_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteenvio_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteusuarioweb_Z( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb_Z ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteusuarioweb_Z");
      gxTv_SdtCliente_Clienteusuarioweb_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteusuarioweb_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteusuarioweb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombrecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular1_Z");
      gxTv_SdtCliente_Clientenombrecelular1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecelular1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular1_Z");
      gxTv_SdtCliente_Clientecelular1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombrecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular2_Z");
      gxTv_SdtCliente_Clientenombrecelular2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecelular2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular2_Z");
      gxTv_SdtCliente_Clientecelular2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecodigofigaro_Z( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro_Z ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodigofigaro_Z");
      gxTv_SdtCliente_Clientecodigofigaro_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecodigofigaro_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecodigofigaro_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientetipousuario_Z( )
   {
      return gxTv_SdtCliente_Clientetipousuario_Z ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetipousuario_Z");
      gxTv_SdtCliente_Clientetipousuario_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientetipousuario_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetipousuario_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientedireccion_Z( )
   {
      return gxTv_SdtCliente_Clientedireccion_Z ;
   }

   public void setgxTv_SdtCliente_Clientedireccion_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedireccion_Z");
      gxTv_SdtCliente_Clientedireccion_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientedireccion_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientedireccion_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientedireccion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombretelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono1_Z");
      gxTv_SdtCliente_Clientenombretelefono1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientetelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientetelefono1_Z ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono1_Z");
      gxTv_SdtCliente_Clientetelefono1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenombretelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono2_Z");
      gxTv_SdtCliente_Clientenombretelefono2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientetelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientetelefono2_Z ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono2_Z");
      gxTv_SdtCliente_Clientetelefono2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefax_Z( )
   {
      return gxTv_SdtCliente_Clientefax_Z ;
   }

   public void setgxTv_SdtCliente_Clientefax_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefax_Z");
      gxTv_SdtCliente_Clientefax_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefax_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefax_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefax_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientedicose_Z( )
   {
      return gxTv_SdtCliente_Clientedicose_Z ;
   }

   public void setgxTv_SdtCliente_Clientedicose_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedicose_Z");
      gxTv_SdtCliente_Clientedicose_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientedicose_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientedicose_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientedicose_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteiddepartamento_Z( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento_Z ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteiddepartamento_Z");
      gxTv_SdtCliente_Clienteiddepartamento_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteiddepartamento_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteiddepartamento_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteidlocalidad_Z( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad_Z ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidlocalidad_Z");
      gxTv_SdtCliente_Clienteidlocalidad_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteidlocalidad_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteidlocalidad_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clientetecnico1_Z( )
   {
      return gxTv_SdtCliente_Clientetecnico1_Z ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico1_Z");
      gxTv_SdtCliente_Clientetecnico1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico1_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico1_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clientetecnico2_Z( )
   {
      return gxTv_SdtCliente_Clientetecnico2_Z ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico2_Z");
      gxTv_SdtCliente_Clientetecnico2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico2_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico2_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteidagencia_Z( )
   {
      return gxTv_SdtCliente_Clienteidagencia_Z ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidagencia_Z");
      gxTv_SdtCliente_Clienteidagencia_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteidagencia_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteidagencia_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientecontrato_Z( )
   {
      return gxTv_SdtCliente_Clientecontrato_Z ;
   }

   public void setgxTv_SdtCliente_Clientecontrato_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecontrato_Z");
      gxTv_SdtCliente_Clientecontrato_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecontrato_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecontrato_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecontrato_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientesocio_Z( )
   {
      return gxTv_SdtCliente_Clientesocio_Z ;
   }

   public void setgxTv_SdtCliente_Clientesocio_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientesocio_Z");
      gxTv_SdtCliente_Clientesocio_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientesocio_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientesocio_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientesocio_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientenousar_Z( )
   {
      return gxTv_SdtCliente_Clientenousar_Z ;
   }

   public void setgxTv_SdtCliente_Clientenousar_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenousar_Z");
      gxTv_SdtCliente_Clientenousar_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenousar_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenousar_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenousar_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientecodbar_Z( )
   {
      return gxTv_SdtCliente_Clientecodbar_Z ;
   }

   public void setgxTv_SdtCliente_Clientecodbar_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodbar_Z");
      gxTv_SdtCliente_Clientecodbar_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecodbar_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecodbar_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecodbar_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientecaravanas_Z( )
   {
      return gxTv_SdtCliente_Clientecaravanas_Z ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecaravanas_Z");
      gxTv_SdtCliente_Clientecaravanas_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecaravanas_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecaravanas_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clienteprolesa_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesa_Z ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesa_Z");
      gxTv_SdtCliente_Clienteprolesa_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesa_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesa_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteprolesasuc_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc_Z ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesasuc_Z");
      gxTv_SdtCliente_Clienteprolesasuc_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesasuc_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesasuc_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clienteprolesamat_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesamat_Z ;
   }

   public void setgxTv_SdtCliente_Clienteprolesamat_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesamat_Z");
      gxTv_SdtCliente_Clienteprolesamat_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesamat_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesamat_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesamat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clienteobservaciones_Z( )
   {
      return gxTv_SdtCliente_Clienteobservaciones_Z ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteobservaciones_Z");
      gxTv_SdtCliente_Clienteobservaciones_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteobservaciones_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clienteobservaciones_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacrsocial_Z( )
   {
      return gxTv_SdtCliente_Clientefacrsocial_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrsocial_Z");
      gxTv_SdtCliente_Clientefacrsocial_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrsocial_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrsocial_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefaccedula_Z( )
   {
      return gxTv_SdtCliente_Clientefaccedula_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccedula_Z");
      gxTv_SdtCliente_Clientefaccedula_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccedula_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccedula_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacrut_Z( )
   {
      return gxTv_SdtCliente_Clientefacrut_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacrut_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrut_Z");
      gxTv_SdtCliente_Clientefacrut_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrut_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrut_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrut_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacdireccion_Z( )
   {
      return gxTv_SdtCliente_Clientefacdireccion_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdireccion_Z");
      gxTv_SdtCliente_Clientefacdireccion_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdireccion_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdireccion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefaclocalidad_Z( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclocalidad_Z");
      gxTv_SdtCliente_Clientefaclocalidad_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclocalidad_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclocalidad_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clientefacdepartamento_Z( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdepartamento_Z");
      gxTv_SdtCliente_Clientefacdepartamento_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdepartamento_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdepartamento_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefaccpostal_Z( )
   {
      return gxTv_SdtCliente_Clientefaccpostal_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccpostal_Z");
      gxTv_SdtCliente_Clientefaccpostal_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccpostal_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccpostal_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clientefacgiro_Z( )
   {
      return gxTv_SdtCliente_Clientefacgiro_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacgiro_Z");
      gxTv_SdtCliente_Clientefacgiro_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacgiro_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefacgiro_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombretelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono1_Z");
      gxTv_SdtCliente_Clientecobnombretelefono1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefactelefonos_Z( )
   {
      return gxTv_SdtCliente_Clientefactelefonos_Z ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefactelefonos_Z");
      gxTv_SdtCliente_Clientefactelefonos_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefactelefonos_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefactelefonos_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombretelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono2_Z");
      gxTv_SdtCliente_Clientecobnombretelefono2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobtelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobtelefono2_Z");
      gxTv_SdtCliente_Clientecobtelefono2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobtelefono2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobtelefono2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombrecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular1_Z");
      gxTv_SdtCliente_Clientecobnombrecelular1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobcelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecobcelular1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular1_Z");
      gxTv_SdtCliente_Clientecobcelular1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombrecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular2_Z");
      gxTv_SdtCliente_Clientecobnombrecelular2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobcelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecobcelular2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular2_Z");
      gxTv_SdtCliente_Clientecobcelular2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombreemail1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail1_Z");
      gxTv_SdtCliente_Clientecobnombreemail1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobemail1_Z( )
   {
      return gxTv_SdtCliente_Clientecobemail1_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail1_Z");
      gxTv_SdtCliente_Clientecobemail1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobnombreemail2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail2_Z");
      gxTv_SdtCliente_Clientecobnombreemail2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientecobemail2_Z( )
   {
      return gxTv_SdtCliente_Clientecobemail2_Z ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail2_Z");
      gxTv_SdtCliente_Clientecobemail2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacfax_Z( )
   {
      return gxTv_SdtCliente_Clientefacfax_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacfax_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacfax_Z");
      gxTv_SdtCliente_Clientefacfax_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacfax_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacfax_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacfax_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacemail_Z( )
   {
      return gxTv_SdtCliente_Clientefacemail_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacemail_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacemail_Z");
      gxTv_SdtCliente_Clientefacemail_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacemail_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacemail_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacemail_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefaccontrato_Z( )
   {
      return gxTv_SdtCliente_Clientefaccontrato_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontrato_Z");
      gxTv_SdtCliente_Clientefaccontrato_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontrato_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontrato_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientefacobservaciones_Z( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones_Z ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacobservaciones_Z");
      gxTv_SdtCliente_Clientefacobservaciones_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefacobservaciones_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientefacobservaciones_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCliente_Clientefaclista_Z( )
   {
      return gxTv_SdtCliente_Clientefaclista_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaclista_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclista_Z");
      gxTv_SdtCliente_Clientefaclista_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclista_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclista_Z = 0 ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclista_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clientefaccontado_Z( )
   {
      return gxTv_SdtCliente_Clientefaccontado_Z ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontado_Z");
      gxTv_SdtCliente_Clientefaccontado_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontado_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontado_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailfrascos1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos1_Z");
      gxTv_SdtCliente_Clientenotemailfrascos1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailfrascos2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos2_Z");
      gxTv_SdtCliente_Clientenotemailfrascos2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailmuestra1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra1_Z");
      gxTv_SdtCliente_Clientenotemailmuestra1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailmuestra2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra2_Z");
      gxTv_SdtCliente_Clientenotemailmuestra2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailanalisis1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis1_Z");
      gxTv_SdtCliente_Clientenotemailanalisis1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailanalisis2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis2_Z");
      gxTv_SdtCliente_Clientenotemailanalisis2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailgeneral1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral1_Z");
      gxTv_SdtCliente_Clientenotemailgeneral1_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral1_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCliente_Clientenotemailgeneral2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2_Z ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral2_Z");
      gxTv_SdtCliente_Clientenotemailgeneral2_Z = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2_Z_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral2_Z = "" ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCliente_Clienteincobrable_Z( )
   {
      return gxTv_SdtCliente_Clienteincobrable_Z ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteincobrable_Z");
      gxTv_SdtCliente_Clienteincobrable_Z = value ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable_Z_SetNull( )
   {
      gxTv_SdtCliente_Clienteincobrable_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteincobrable_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombre_N( )
   {
      return gxTv_SdtCliente_Clientenombre_N ;
   }

   public void setgxTv_SdtCliente_Clientenombre_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombre_N");
      gxTv_SdtCliente_Clientenombre_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombre_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombre_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombre_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteemail_N( )
   {
      return gxTv_SdtCliente_Clienteemail_N ;
   }

   public void setgxTv_SdtCliente_Clienteemail_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail_N");
      gxTv_SdtCliente_Clienteemail_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombreemail1_N( )
   {
      return gxTv_SdtCliente_Clientenombreemail1_N ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail1_N");
      gxTv_SdtCliente_Clientenombreemail1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteemail1_N( )
   {
      return gxTv_SdtCliente_Clienteemail1_N ;
   }

   public void setgxTv_SdtCliente_Clienteemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail1_N");
      gxTv_SdtCliente_Clienteemail1_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail1_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombreemail2_N( )
   {
      return gxTv_SdtCliente_Clientenombreemail2_N ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombreemail2_N");
      gxTv_SdtCliente_Clientenombreemail2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombreemail2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombreemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombreemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteemail2_N( )
   {
      return gxTv_SdtCliente_Clienteemail2_N ;
   }

   public void setgxTv_SdtCliente_Clienteemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteemail2_N");
      gxTv_SdtCliente_Clienteemail2_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteemail2_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteenvio_N( )
   {
      return gxTv_SdtCliente_Clienteenvio_N ;
   }

   public void setgxTv_SdtCliente_Clienteenvio_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteenvio_N");
      gxTv_SdtCliente_Clienteenvio_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteenvio_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteenvio_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteenvio_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteusuarioweb_N( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb_N ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteusuarioweb_N");
      gxTv_SdtCliente_Clienteusuarioweb_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteusuarioweb_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteusuarioweb_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombrecelular1_N( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1_N ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular1_N");
      gxTv_SdtCliente_Clientenombrecelular1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecelular1_N( )
   {
      return gxTv_SdtCliente_Clientecelular1_N ;
   }

   public void setgxTv_SdtCliente_Clientecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular1_N");
      gxTv_SdtCliente_Clientecelular1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombrecelular2_N( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2_N ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombrecelular2_N");
      gxTv_SdtCliente_Clientenombrecelular2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombrecelular2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombrecelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecelular2_N( )
   {
      return gxTv_SdtCliente_Clientecelular2_N ;
   }

   public void setgxTv_SdtCliente_Clientecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecelular2_N");
      gxTv_SdtCliente_Clientecelular2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecelular2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecodigofigaro_N( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro_N ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodigofigaro_N");
      gxTv_SdtCliente_Clientecodigofigaro_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecodigofigaro_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecodigofigaro_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientetipousuario_N( )
   {
      return gxTv_SdtCliente_Clientetipousuario_N ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetipousuario_N");
      gxTv_SdtCliente_Clientetipousuario_N = value ;
   }

   public void setgxTv_SdtCliente_Clientetipousuario_N_SetNull( )
   {
      gxTv_SdtCliente_Clientetipousuario_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetipousuario_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientedireccion_N( )
   {
      return gxTv_SdtCliente_Clientedireccion_N ;
   }

   public void setgxTv_SdtCliente_Clientedireccion_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedireccion_N");
      gxTv_SdtCliente_Clientedireccion_N = value ;
   }

   public void setgxTv_SdtCliente_Clientedireccion_N_SetNull( )
   {
      gxTv_SdtCliente_Clientedireccion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientedireccion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombretelefono1_N( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1_N ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono1_N");
      gxTv_SdtCliente_Clientenombretelefono1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientetelefono1_N( )
   {
      return gxTv_SdtCliente_Clientetelefono1_N ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono1_N");
      gxTv_SdtCliente_Clientetelefono1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenombretelefono2_N( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2_N ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenombretelefono2_N");
      gxTv_SdtCliente_Clientenombretelefono2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenombretelefono2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenombretelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientetelefono2_N( )
   {
      return gxTv_SdtCliente_Clientetelefono2_N ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetelefono2_N");
      gxTv_SdtCliente_Clientetelefono2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientetelefono2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientetelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefax_N( )
   {
      return gxTv_SdtCliente_Clientefax_N ;
   }

   public void setgxTv_SdtCliente_Clientefax_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefax_N");
      gxTv_SdtCliente_Clientefax_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefax_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefax_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefax_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientedicose_N( )
   {
      return gxTv_SdtCliente_Clientedicose_N ;
   }

   public void setgxTv_SdtCliente_Clientedicose_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientedicose_N");
      gxTv_SdtCliente_Clientedicose_N = value ;
   }

   public void setgxTv_SdtCliente_Clientedicose_N_SetNull( )
   {
      gxTv_SdtCliente_Clientedicose_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientedicose_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteiddepartamento_N( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento_N ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteiddepartamento_N");
      gxTv_SdtCliente_Clienteiddepartamento_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteiddepartamento_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteiddepartamento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteidlocalidad_N( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad_N ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidlocalidad_N");
      gxTv_SdtCliente_Clienteidlocalidad_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteidlocalidad_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteidlocalidad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientetecnico1_N( )
   {
      return gxTv_SdtCliente_Clientetecnico1_N ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico1_N");
      gxTv_SdtCliente_Clientetecnico1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientetecnico2_N( )
   {
      return gxTv_SdtCliente_Clientetecnico2_N ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientetecnico2_N");
      gxTv_SdtCliente_Clientetecnico2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientetecnico2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientetecnico2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientetecnico2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteidagencia_N( )
   {
      return gxTv_SdtCliente_Clienteidagencia_N ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteidagencia_N");
      gxTv_SdtCliente_Clienteidagencia_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteidagencia_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteidagencia_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteidagencia_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecontrato_N( )
   {
      return gxTv_SdtCliente_Clientecontrato_N ;
   }

   public void setgxTv_SdtCliente_Clientecontrato_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecontrato_N");
      gxTv_SdtCliente_Clientecontrato_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecontrato_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecontrato_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecontrato_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientesocio_N( )
   {
      return gxTv_SdtCliente_Clientesocio_N ;
   }

   public void setgxTv_SdtCliente_Clientesocio_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientesocio_N");
      gxTv_SdtCliente_Clientesocio_N = value ;
   }

   public void setgxTv_SdtCliente_Clientesocio_N_SetNull( )
   {
      gxTv_SdtCliente_Clientesocio_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientesocio_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenousar_N( )
   {
      return gxTv_SdtCliente_Clientenousar_N ;
   }

   public void setgxTv_SdtCliente_Clientenousar_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenousar_N");
      gxTv_SdtCliente_Clientenousar_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenousar_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenousar_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenousar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecodbar_N( )
   {
      return gxTv_SdtCliente_Clientecodbar_N ;
   }

   public void setgxTv_SdtCliente_Clientecodbar_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecodbar_N");
      gxTv_SdtCliente_Clientecodbar_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecodbar_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecodbar_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecodbar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecaravanas_N( )
   {
      return gxTv_SdtCliente_Clientecaravanas_N ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecaravanas_N");
      gxTv_SdtCliente_Clientecaravanas_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecaravanas_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecaravanas_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecaravanas_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteprolesa_N( )
   {
      return gxTv_SdtCliente_Clienteprolesa_N ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesa_N");
      gxTv_SdtCliente_Clienteprolesa_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesa_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesa_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesa_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteprolesasuc_N( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc_N ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteprolesasuc_N");
      gxTv_SdtCliente_Clienteprolesasuc_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteprolesasuc_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteprolesasuc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteobservaciones_N( )
   {
      return gxTv_SdtCliente_Clienteobservaciones_N ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteobservaciones_N");
      gxTv_SdtCliente_Clienteobservaciones_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteobservaciones_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteobservaciones_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteobservaciones_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacrsocial_N( )
   {
      return gxTv_SdtCliente_Clientefacrsocial_N ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrsocial_N");
      gxTv_SdtCliente_Clientefacrsocial_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrsocial_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrsocial_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrsocial_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaccedula_N( )
   {
      return gxTv_SdtCliente_Clientefaccedula_N ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccedula_N");
      gxTv_SdtCliente_Clientefaccedula_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccedula_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccedula_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccedula_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacrut_N( )
   {
      return gxTv_SdtCliente_Clientefacrut_N ;
   }

   public void setgxTv_SdtCliente_Clientefacrut_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacrut_N");
      gxTv_SdtCliente_Clientefacrut_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacrut_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacrut_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacrut_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacdireccion_N( )
   {
      return gxTv_SdtCliente_Clientefacdireccion_N ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdireccion_N");
      gxTv_SdtCliente_Clientefacdireccion_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdireccion_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdireccion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdireccion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaclocalidad_N( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad_N ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclocalidad_N");
      gxTv_SdtCliente_Clientefaclocalidad_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclocalidad_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclocalidad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacdepartamento_N( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento_N ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacdepartamento_N");
      gxTv_SdtCliente_Clientefacdepartamento_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacdepartamento_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacdepartamento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaccpostal_N( )
   {
      return gxTv_SdtCliente_Clientefaccpostal_N ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccpostal_N");
      gxTv_SdtCliente_Clientefaccpostal_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccpostal_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccpostal_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccpostal_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacgiro_N( )
   {
      return gxTv_SdtCliente_Clientefacgiro_N ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacgiro_N");
      gxTv_SdtCliente_Clientefacgiro_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacgiro_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacgiro_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacgiro_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombretelefono1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono1_N");
      gxTv_SdtCliente_Clientecobnombretelefono1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefactelefonos_N( )
   {
      return gxTv_SdtCliente_Clientefactelefonos_N ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefactelefonos_N");
      gxTv_SdtCliente_Clientefactelefonos_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefactelefonos_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefactelefonos_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefactelefonos_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombretelefono2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombretelefono2_N");
      gxTv_SdtCliente_Clientecobnombretelefono2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombretelefono2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombretelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobtelefono2_N( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobtelefono2_N");
      gxTv_SdtCliente_Clientecobtelefono2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobtelefono2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobtelefono2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombrecelular1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular1_N");
      gxTv_SdtCliente_Clientecobnombrecelular1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobcelular1_N( )
   {
      return gxTv_SdtCliente_Clientecobcelular1_N ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular1_N");
      gxTv_SdtCliente_Clientecobcelular1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombrecelular2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombrecelular2_N");
      gxTv_SdtCliente_Clientecobnombrecelular2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombrecelular2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombrecelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobcelular2_N( )
   {
      return gxTv_SdtCliente_Clientecobcelular2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobcelular2_N");
      gxTv_SdtCliente_Clientecobcelular2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobcelular2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobcelular2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobcelular2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombreemail1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail1_N");
      gxTv_SdtCliente_Clientecobnombreemail1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobemail1_N( )
   {
      return gxTv_SdtCliente_Clientecobemail1_N ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail1_N");
      gxTv_SdtCliente_Clientecobemail1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobnombreemail2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobnombreemail2_N");
      gxTv_SdtCliente_Clientecobnombreemail2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobnombreemail2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobnombreemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientecobemail2_N( )
   {
      return gxTv_SdtCliente_Clientecobemail2_N ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientecobemail2_N");
      gxTv_SdtCliente_Clientecobemail2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientecobemail2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientecobemail2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientecobemail2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacfax_N( )
   {
      return gxTv_SdtCliente_Clientefacfax_N ;
   }

   public void setgxTv_SdtCliente_Clientefacfax_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacfax_N");
      gxTv_SdtCliente_Clientefacfax_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacfax_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacfax_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacfax_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacemail_N( )
   {
      return gxTv_SdtCliente_Clientefacemail_N ;
   }

   public void setgxTv_SdtCliente_Clientefacemail_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacemail_N");
      gxTv_SdtCliente_Clientefacemail_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacemail_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacemail_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacemail_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaccontrato_N( )
   {
      return gxTv_SdtCliente_Clientefaccontrato_N ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontrato_N");
      gxTv_SdtCliente_Clientefaccontrato_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontrato_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontrato_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontrato_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefacobservaciones_N( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones_N ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefacobservaciones_N");
      gxTv_SdtCliente_Clientefacobservaciones_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefacobservaciones_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefacobservaciones_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaclista_N( )
   {
      return gxTv_SdtCliente_Clientefaclista_N ;
   }

   public void setgxTv_SdtCliente_Clientefaclista_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaclista_N");
      gxTv_SdtCliente_Clientefaclista_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaclista_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaclista_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaclista_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientefaccontado_N( )
   {
      return gxTv_SdtCliente_Clientefaccontado_N ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientefaccontado_N");
      gxTv_SdtCliente_Clientefaccontado_N = value ;
   }

   public void setgxTv_SdtCliente_Clientefaccontado_N_SetNull( )
   {
      gxTv_SdtCliente_Clientefaccontado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientefaccontado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailfrascos1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos1_N");
      gxTv_SdtCliente_Clientenotemailfrascos1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailfrascos2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailfrascos2_N");
      gxTv_SdtCliente_Clientenotemailfrascos2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailfrascos2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailfrascos2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailmuestra1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra1_N");
      gxTv_SdtCliente_Clientenotemailmuestra1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailmuestra2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailmuestra2_N");
      gxTv_SdtCliente_Clientenotemailmuestra2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailmuestra2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailmuestra2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailanalisis1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis1_N");
      gxTv_SdtCliente_Clientenotemailanalisis1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailanalisis2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailanalisis2_N");
      gxTv_SdtCliente_Clientenotemailanalisis2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailanalisis2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailanalisis2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailgeneral1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral1_N");
      gxTv_SdtCliente_Clientenotemailgeneral1_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral1_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clientenotemailgeneral2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2_N ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clientenotemailgeneral2_N");
      gxTv_SdtCliente_Clientenotemailgeneral2_N = value ;
   }

   public void setgxTv_SdtCliente_Clientenotemailgeneral2_N_SetNull( )
   {
      gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clientenotemailgeneral2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCliente_Clienteincobrable_N( )
   {
      return gxTv_SdtCliente_Clienteincobrable_N ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      SetDirty("Clienteincobrable_N");
      gxTv_SdtCliente_Clienteincobrable_N = value ;
   }

   public void setgxTv_SdtCliente_Clienteincobrable_N_SetNull( )
   {
      gxTv_SdtCliente_Clienteincobrable_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtCliente_Clienteincobrable_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.cliente_bc obj;
      obj = new com.colaveco.cliente_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtCliente_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombre = "" ;
      gxTv_SdtCliente_Clienteemail = "" ;
      gxTv_SdtCliente_Clientenombreemail1 = "" ;
      gxTv_SdtCliente_Clienteemail1 = "" ;
      gxTv_SdtCliente_Clientenombreemail2 = "" ;
      gxTv_SdtCliente_Clienteemail2 = "" ;
      gxTv_SdtCliente_Clienteenvio = "" ;
      gxTv_SdtCliente_Clienteusuarioweb = "" ;
      gxTv_SdtCliente_Clientenombrecelular1 = "" ;
      gxTv_SdtCliente_Clientecelular1 = "" ;
      gxTv_SdtCliente_Clientenombrecelular2 = "" ;
      gxTv_SdtCliente_Clientecelular2 = "" ;
      gxTv_SdtCliente_Clientecodigofigaro = "" ;
      gxTv_SdtCliente_Clientedireccion = "" ;
      gxTv_SdtCliente_Clientenombretelefono1 = "" ;
      gxTv_SdtCliente_Clientetelefono1 = "" ;
      gxTv_SdtCliente_Clientenombretelefono2 = "" ;
      gxTv_SdtCliente_Clientetelefono2 = "" ;
      gxTv_SdtCliente_Clientefax = "" ;
      gxTv_SdtCliente_Clientedicose = "" ;
      gxTv_SdtCliente_Clienteobservaciones = "" ;
      gxTv_SdtCliente_Clientefacrsocial = "" ;
      gxTv_SdtCliente_Clientefaccedula = "" ;
      gxTv_SdtCliente_Clientefacrut = "" ;
      gxTv_SdtCliente_Clientefacdireccion = "" ;
      gxTv_SdtCliente_Clientefaclocalidad = "" ;
      gxTv_SdtCliente_Clientefaccpostal = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono1 = "" ;
      gxTv_SdtCliente_Clientefactelefonos = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono2 = "" ;
      gxTv_SdtCliente_Clientecobtelefono2 = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular1 = "" ;
      gxTv_SdtCliente_Clientecobcelular1 = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular2 = "" ;
      gxTv_SdtCliente_Clientecobcelular2 = "" ;
      gxTv_SdtCliente_Clientecobnombreemail1 = "" ;
      gxTv_SdtCliente_Clientecobemail1 = "" ;
      gxTv_SdtCliente_Clientecobnombreemail2 = "" ;
      gxTv_SdtCliente_Clientecobemail2 = "" ;
      gxTv_SdtCliente_Clientefacfax = "" ;
      gxTv_SdtCliente_Clientefacemail = "" ;
      gxTv_SdtCliente_Clientefaccontrato = "" ;
      gxTv_SdtCliente_Clientefacobservaciones = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos1 = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos2 = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra1 = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra2 = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis1 = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis2 = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral1 = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral2 = "" ;
      gxTv_SdtCliente_Mode = "" ;
      gxTv_SdtCliente_Clientenombre_Z = "" ;
      gxTv_SdtCliente_Clienteemail_Z = "" ;
      gxTv_SdtCliente_Clientenombreemail1_Z = "" ;
      gxTv_SdtCliente_Clienteemail1_Z = "" ;
      gxTv_SdtCliente_Clientenombreemail2_Z = "" ;
      gxTv_SdtCliente_Clienteemail2_Z = "" ;
      gxTv_SdtCliente_Clienteenvio_Z = "" ;
      gxTv_SdtCliente_Clienteusuarioweb_Z = "" ;
      gxTv_SdtCliente_Clientenombrecelular1_Z = "" ;
      gxTv_SdtCliente_Clientecelular1_Z = "" ;
      gxTv_SdtCliente_Clientenombrecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecodigofigaro_Z = "" ;
      gxTv_SdtCliente_Clientedireccion_Z = "" ;
      gxTv_SdtCliente_Clientenombretelefono1_Z = "" ;
      gxTv_SdtCliente_Clientetelefono1_Z = "" ;
      gxTv_SdtCliente_Clientenombretelefono2_Z = "" ;
      gxTv_SdtCliente_Clientetelefono2_Z = "" ;
      gxTv_SdtCliente_Clientefax_Z = "" ;
      gxTv_SdtCliente_Clientedicose_Z = "" ;
      gxTv_SdtCliente_Clienteobservaciones_Z = "" ;
      gxTv_SdtCliente_Clientefacrsocial_Z = "" ;
      gxTv_SdtCliente_Clientefaccedula_Z = "" ;
      gxTv_SdtCliente_Clientefacrut_Z = "" ;
      gxTv_SdtCliente_Clientefacdireccion_Z = "" ;
      gxTv_SdtCliente_Clientefaclocalidad_Z = "" ;
      gxTv_SdtCliente_Clientefaccpostal_Z = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono1_Z = "" ;
      gxTv_SdtCliente_Clientefactelefonos_Z = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono2_Z = "" ;
      gxTv_SdtCliente_Clientecobtelefono2_Z = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular1_Z = "" ;
      gxTv_SdtCliente_Clientecobcelular1_Z = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecobcelular2_Z = "" ;
      gxTv_SdtCliente_Clientecobnombreemail1_Z = "" ;
      gxTv_SdtCliente_Clientecobemail1_Z = "" ;
      gxTv_SdtCliente_Clientecobnombreemail2_Z = "" ;
      gxTv_SdtCliente_Clientecobemail2_Z = "" ;
      gxTv_SdtCliente_Clientefacfax_Z = "" ;
      gxTv_SdtCliente_Clientefacemail_Z = "" ;
      gxTv_SdtCliente_Clientefaccontrato_Z = "" ;
      gxTv_SdtCliente_Clientefacobservaciones_Z = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral2_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCliente_N ;
   }

   public com.colaveco.SdtCliente Clone( )
   {
      com.colaveco.SdtCliente sdt;
      com.colaveco.cliente_bc obj;
      sdt = (com.colaveco.SdtCliente)(clone()) ;
      obj = (com.colaveco.cliente_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtCliente struct )
   {
      setgxTv_SdtCliente_Clienteid(struct.getClienteid());
      setgxTv_SdtCliente_Clientenombre(struct.getClientenombre());
      setgxTv_SdtCliente_Clienteemail(struct.getClienteemail());
      setgxTv_SdtCliente_Clientenombreemail1(struct.getClientenombreemail1());
      setgxTv_SdtCliente_Clienteemail1(struct.getClienteemail1());
      setgxTv_SdtCliente_Clientenombreemail2(struct.getClientenombreemail2());
      setgxTv_SdtCliente_Clienteemail2(struct.getClienteemail2());
      setgxTv_SdtCliente_Clienteenvio(struct.getClienteenvio());
      setgxTv_SdtCliente_Clienteusuarioweb(struct.getClienteusuarioweb());
      setgxTv_SdtCliente_Clientenombrecelular1(struct.getClientenombrecelular1());
      setgxTv_SdtCliente_Clientecelular1(struct.getClientecelular1());
      setgxTv_SdtCliente_Clientenombrecelular2(struct.getClientenombrecelular2());
      setgxTv_SdtCliente_Clientecelular2(struct.getClientecelular2());
      setgxTv_SdtCliente_Clientecodigofigaro(struct.getClientecodigofigaro());
      setgxTv_SdtCliente_Clientetipousuario(struct.getClientetipousuario());
      setgxTv_SdtCliente_Clientedireccion(struct.getClientedireccion());
      setgxTv_SdtCliente_Clientenombretelefono1(struct.getClientenombretelefono1());
      setgxTv_SdtCliente_Clientetelefono1(struct.getClientetelefono1());
      setgxTv_SdtCliente_Clientenombretelefono2(struct.getClientenombretelefono2());
      setgxTv_SdtCliente_Clientetelefono2(struct.getClientetelefono2());
      setgxTv_SdtCliente_Clientefax(struct.getClientefax());
      setgxTv_SdtCliente_Clientedicose(struct.getClientedicose());
      setgxTv_SdtCliente_Clienteiddepartamento(struct.getClienteiddepartamento());
      setgxTv_SdtCliente_Clienteidlocalidad(struct.getClienteidlocalidad());
      setgxTv_SdtCliente_Clientetecnico1(struct.getClientetecnico1());
      setgxTv_SdtCliente_Clientetecnico2(struct.getClientetecnico2());
      setgxTv_SdtCliente_Clienteidagencia(struct.getClienteidagencia());
      setgxTv_SdtCliente_Clientecontrato(struct.getClientecontrato());
      setgxTv_SdtCliente_Clientesocio(struct.getClientesocio());
      setgxTv_SdtCliente_Clientenousar(struct.getClientenousar());
      setgxTv_SdtCliente_Clientecodbar(struct.getClientecodbar());
      setgxTv_SdtCliente_Clientecaravanas(struct.getClientecaravanas());
      setgxTv_SdtCliente_Clienteprolesa(struct.getClienteprolesa());
      setgxTv_SdtCliente_Clienteprolesasuc(struct.getClienteprolesasuc());
      setgxTv_SdtCliente_Clienteprolesamat(struct.getClienteprolesamat());
      setgxTv_SdtCliente_Clienteobservaciones(struct.getClienteobservaciones());
      setgxTv_SdtCliente_Clientefacrsocial(struct.getClientefacrsocial());
      setgxTv_SdtCliente_Clientefaccedula(struct.getClientefaccedula());
      setgxTv_SdtCliente_Clientefacrut(struct.getClientefacrut());
      setgxTv_SdtCliente_Clientefacdireccion(struct.getClientefacdireccion());
      setgxTv_SdtCliente_Clientefaclocalidad(struct.getClientefaclocalidad());
      setgxTv_SdtCliente_Clientefacdepartamento(struct.getClientefacdepartamento());
      setgxTv_SdtCliente_Clientefaccpostal(struct.getClientefaccpostal());
      setgxTv_SdtCliente_Clientefacgiro(struct.getClientefacgiro());
      setgxTv_SdtCliente_Clientecobnombretelefono1(struct.getClientecobnombretelefono1());
      setgxTv_SdtCliente_Clientefactelefonos(struct.getClientefactelefonos());
      setgxTv_SdtCliente_Clientecobnombretelefono2(struct.getClientecobnombretelefono2());
      setgxTv_SdtCliente_Clientecobtelefono2(struct.getClientecobtelefono2());
      setgxTv_SdtCliente_Clientecobnombrecelular1(struct.getClientecobnombrecelular1());
      setgxTv_SdtCliente_Clientecobcelular1(struct.getClientecobcelular1());
      setgxTv_SdtCliente_Clientecobnombrecelular2(struct.getClientecobnombrecelular2());
      setgxTv_SdtCliente_Clientecobcelular2(struct.getClientecobcelular2());
      setgxTv_SdtCliente_Clientecobnombreemail1(struct.getClientecobnombreemail1());
      setgxTv_SdtCliente_Clientecobemail1(struct.getClientecobemail1());
      setgxTv_SdtCliente_Clientecobnombreemail2(struct.getClientecobnombreemail2());
      setgxTv_SdtCliente_Clientecobemail2(struct.getClientecobemail2());
      setgxTv_SdtCliente_Clientefacfax(struct.getClientefacfax());
      setgxTv_SdtCliente_Clientefacemail(struct.getClientefacemail());
      setgxTv_SdtCliente_Clientefaccontrato(struct.getClientefaccontrato());
      setgxTv_SdtCliente_Clientefacobservaciones(struct.getClientefacobservaciones());
      setgxTv_SdtCliente_Clientefaclista(struct.getClientefaclista());
      setgxTv_SdtCliente_Clientefaccontado(struct.getClientefaccontado());
      setgxTv_SdtCliente_Clientenotemailfrascos1(struct.getClientenotemailfrascos1());
      setgxTv_SdtCliente_Clientenotemailfrascos2(struct.getClientenotemailfrascos2());
      setgxTv_SdtCliente_Clientenotemailmuestra1(struct.getClientenotemailmuestra1());
      setgxTv_SdtCliente_Clientenotemailmuestra2(struct.getClientenotemailmuestra2());
      setgxTv_SdtCliente_Clientenotemailanalisis1(struct.getClientenotemailanalisis1());
      setgxTv_SdtCliente_Clientenotemailanalisis2(struct.getClientenotemailanalisis2());
      setgxTv_SdtCliente_Clientenotemailgeneral1(struct.getClientenotemailgeneral1());
      setgxTv_SdtCliente_Clientenotemailgeneral2(struct.getClientenotemailgeneral2());
      setgxTv_SdtCliente_Clienteincobrable(struct.getClienteincobrable());
      setgxTv_SdtCliente_Mode(struct.getMode());
      setgxTv_SdtCliente_Initialized(struct.getInitialized());
      setgxTv_SdtCliente_Clienteid_Z(struct.getClienteid_Z());
      setgxTv_SdtCliente_Clientenombre_Z(struct.getClientenombre_Z());
      setgxTv_SdtCliente_Clienteemail_Z(struct.getClienteemail_Z());
      setgxTv_SdtCliente_Clientenombreemail1_Z(struct.getClientenombreemail1_Z());
      setgxTv_SdtCliente_Clienteemail1_Z(struct.getClienteemail1_Z());
      setgxTv_SdtCliente_Clientenombreemail2_Z(struct.getClientenombreemail2_Z());
      setgxTv_SdtCliente_Clienteemail2_Z(struct.getClienteemail2_Z());
      setgxTv_SdtCliente_Clienteenvio_Z(struct.getClienteenvio_Z());
      setgxTv_SdtCliente_Clienteusuarioweb_Z(struct.getClienteusuarioweb_Z());
      setgxTv_SdtCliente_Clientenombrecelular1_Z(struct.getClientenombrecelular1_Z());
      setgxTv_SdtCliente_Clientecelular1_Z(struct.getClientecelular1_Z());
      setgxTv_SdtCliente_Clientenombrecelular2_Z(struct.getClientenombrecelular2_Z());
      setgxTv_SdtCliente_Clientecelular2_Z(struct.getClientecelular2_Z());
      setgxTv_SdtCliente_Clientecodigofigaro_Z(struct.getClientecodigofigaro_Z());
      setgxTv_SdtCliente_Clientetipousuario_Z(struct.getClientetipousuario_Z());
      setgxTv_SdtCliente_Clientedireccion_Z(struct.getClientedireccion_Z());
      setgxTv_SdtCliente_Clientenombretelefono1_Z(struct.getClientenombretelefono1_Z());
      setgxTv_SdtCliente_Clientetelefono1_Z(struct.getClientetelefono1_Z());
      setgxTv_SdtCliente_Clientenombretelefono2_Z(struct.getClientenombretelefono2_Z());
      setgxTv_SdtCliente_Clientetelefono2_Z(struct.getClientetelefono2_Z());
      setgxTv_SdtCliente_Clientefax_Z(struct.getClientefax_Z());
      setgxTv_SdtCliente_Clientedicose_Z(struct.getClientedicose_Z());
      setgxTv_SdtCliente_Clienteiddepartamento_Z(struct.getClienteiddepartamento_Z());
      setgxTv_SdtCliente_Clienteidlocalidad_Z(struct.getClienteidlocalidad_Z());
      setgxTv_SdtCliente_Clientetecnico1_Z(struct.getClientetecnico1_Z());
      setgxTv_SdtCliente_Clientetecnico2_Z(struct.getClientetecnico2_Z());
      setgxTv_SdtCliente_Clienteidagencia_Z(struct.getClienteidagencia_Z());
      setgxTv_SdtCliente_Clientecontrato_Z(struct.getClientecontrato_Z());
      setgxTv_SdtCliente_Clientesocio_Z(struct.getClientesocio_Z());
      setgxTv_SdtCliente_Clientenousar_Z(struct.getClientenousar_Z());
      setgxTv_SdtCliente_Clientecodbar_Z(struct.getClientecodbar_Z());
      setgxTv_SdtCliente_Clientecaravanas_Z(struct.getClientecaravanas_Z());
      setgxTv_SdtCliente_Clienteprolesa_Z(struct.getClienteprolesa_Z());
      setgxTv_SdtCliente_Clienteprolesasuc_Z(struct.getClienteprolesasuc_Z());
      setgxTv_SdtCliente_Clienteprolesamat_Z(struct.getClienteprolesamat_Z());
      setgxTv_SdtCliente_Clienteobservaciones_Z(struct.getClienteobservaciones_Z());
      setgxTv_SdtCliente_Clientefacrsocial_Z(struct.getClientefacrsocial_Z());
      setgxTv_SdtCliente_Clientefaccedula_Z(struct.getClientefaccedula_Z());
      setgxTv_SdtCliente_Clientefacrut_Z(struct.getClientefacrut_Z());
      setgxTv_SdtCliente_Clientefacdireccion_Z(struct.getClientefacdireccion_Z());
      setgxTv_SdtCliente_Clientefaclocalidad_Z(struct.getClientefaclocalidad_Z());
      setgxTv_SdtCliente_Clientefacdepartamento_Z(struct.getClientefacdepartamento_Z());
      setgxTv_SdtCliente_Clientefaccpostal_Z(struct.getClientefaccpostal_Z());
      setgxTv_SdtCliente_Clientefacgiro_Z(struct.getClientefacgiro_Z());
      setgxTv_SdtCliente_Clientecobnombretelefono1_Z(struct.getClientecobnombretelefono1_Z());
      setgxTv_SdtCliente_Clientefactelefonos_Z(struct.getClientefactelefonos_Z());
      setgxTv_SdtCliente_Clientecobnombretelefono2_Z(struct.getClientecobnombretelefono2_Z());
      setgxTv_SdtCliente_Clientecobtelefono2_Z(struct.getClientecobtelefono2_Z());
      setgxTv_SdtCliente_Clientecobnombrecelular1_Z(struct.getClientecobnombrecelular1_Z());
      setgxTv_SdtCliente_Clientecobcelular1_Z(struct.getClientecobcelular1_Z());
      setgxTv_SdtCliente_Clientecobnombrecelular2_Z(struct.getClientecobnombrecelular2_Z());
      setgxTv_SdtCliente_Clientecobcelular2_Z(struct.getClientecobcelular2_Z());
      setgxTv_SdtCliente_Clientecobnombreemail1_Z(struct.getClientecobnombreemail1_Z());
      setgxTv_SdtCliente_Clientecobemail1_Z(struct.getClientecobemail1_Z());
      setgxTv_SdtCliente_Clientecobnombreemail2_Z(struct.getClientecobnombreemail2_Z());
      setgxTv_SdtCliente_Clientecobemail2_Z(struct.getClientecobemail2_Z());
      setgxTv_SdtCliente_Clientefacfax_Z(struct.getClientefacfax_Z());
      setgxTv_SdtCliente_Clientefacemail_Z(struct.getClientefacemail_Z());
      setgxTv_SdtCliente_Clientefaccontrato_Z(struct.getClientefaccontrato_Z());
      setgxTv_SdtCliente_Clientefacobservaciones_Z(struct.getClientefacobservaciones_Z());
      setgxTv_SdtCliente_Clientefaclista_Z(struct.getClientefaclista_Z());
      setgxTv_SdtCliente_Clientefaccontado_Z(struct.getClientefaccontado_Z());
      setgxTv_SdtCliente_Clientenotemailfrascos1_Z(struct.getClientenotemailfrascos1_Z());
      setgxTv_SdtCliente_Clientenotemailfrascos2_Z(struct.getClientenotemailfrascos2_Z());
      setgxTv_SdtCliente_Clientenotemailmuestra1_Z(struct.getClientenotemailmuestra1_Z());
      setgxTv_SdtCliente_Clientenotemailmuestra2_Z(struct.getClientenotemailmuestra2_Z());
      setgxTv_SdtCliente_Clientenotemailanalisis1_Z(struct.getClientenotemailanalisis1_Z());
      setgxTv_SdtCliente_Clientenotemailanalisis2_Z(struct.getClientenotemailanalisis2_Z());
      setgxTv_SdtCliente_Clientenotemailgeneral1_Z(struct.getClientenotemailgeneral1_Z());
      setgxTv_SdtCliente_Clientenotemailgeneral2_Z(struct.getClientenotemailgeneral2_Z());
      setgxTv_SdtCliente_Clienteincobrable_Z(struct.getClienteincobrable_Z());
      setgxTv_SdtCliente_Clientenombre_N(struct.getClientenombre_N());
      setgxTv_SdtCliente_Clienteemail_N(struct.getClienteemail_N());
      setgxTv_SdtCliente_Clientenombreemail1_N(struct.getClientenombreemail1_N());
      setgxTv_SdtCliente_Clienteemail1_N(struct.getClienteemail1_N());
      setgxTv_SdtCliente_Clientenombreemail2_N(struct.getClientenombreemail2_N());
      setgxTv_SdtCliente_Clienteemail2_N(struct.getClienteemail2_N());
      setgxTv_SdtCliente_Clienteenvio_N(struct.getClienteenvio_N());
      setgxTv_SdtCliente_Clienteusuarioweb_N(struct.getClienteusuarioweb_N());
      setgxTv_SdtCliente_Clientenombrecelular1_N(struct.getClientenombrecelular1_N());
      setgxTv_SdtCliente_Clientecelular1_N(struct.getClientecelular1_N());
      setgxTv_SdtCliente_Clientenombrecelular2_N(struct.getClientenombrecelular2_N());
      setgxTv_SdtCliente_Clientecelular2_N(struct.getClientecelular2_N());
      setgxTv_SdtCliente_Clientecodigofigaro_N(struct.getClientecodigofigaro_N());
      setgxTv_SdtCliente_Clientetipousuario_N(struct.getClientetipousuario_N());
      setgxTv_SdtCliente_Clientedireccion_N(struct.getClientedireccion_N());
      setgxTv_SdtCliente_Clientenombretelefono1_N(struct.getClientenombretelefono1_N());
      setgxTv_SdtCliente_Clientetelefono1_N(struct.getClientetelefono1_N());
      setgxTv_SdtCliente_Clientenombretelefono2_N(struct.getClientenombretelefono2_N());
      setgxTv_SdtCliente_Clientetelefono2_N(struct.getClientetelefono2_N());
      setgxTv_SdtCliente_Clientefax_N(struct.getClientefax_N());
      setgxTv_SdtCliente_Clientedicose_N(struct.getClientedicose_N());
      setgxTv_SdtCliente_Clienteiddepartamento_N(struct.getClienteiddepartamento_N());
      setgxTv_SdtCliente_Clienteidlocalidad_N(struct.getClienteidlocalidad_N());
      setgxTv_SdtCliente_Clientetecnico1_N(struct.getClientetecnico1_N());
      setgxTv_SdtCliente_Clientetecnico2_N(struct.getClientetecnico2_N());
      setgxTv_SdtCliente_Clienteidagencia_N(struct.getClienteidagencia_N());
      setgxTv_SdtCliente_Clientecontrato_N(struct.getClientecontrato_N());
      setgxTv_SdtCliente_Clientesocio_N(struct.getClientesocio_N());
      setgxTv_SdtCliente_Clientenousar_N(struct.getClientenousar_N());
      setgxTv_SdtCliente_Clientecodbar_N(struct.getClientecodbar_N());
      setgxTv_SdtCliente_Clientecaravanas_N(struct.getClientecaravanas_N());
      setgxTv_SdtCliente_Clienteprolesa_N(struct.getClienteprolesa_N());
      setgxTv_SdtCliente_Clienteprolesasuc_N(struct.getClienteprolesasuc_N());
      setgxTv_SdtCliente_Clienteobservaciones_N(struct.getClienteobservaciones_N());
      setgxTv_SdtCliente_Clientefacrsocial_N(struct.getClientefacrsocial_N());
      setgxTv_SdtCliente_Clientefaccedula_N(struct.getClientefaccedula_N());
      setgxTv_SdtCliente_Clientefacrut_N(struct.getClientefacrut_N());
      setgxTv_SdtCliente_Clientefacdireccion_N(struct.getClientefacdireccion_N());
      setgxTv_SdtCliente_Clientefaclocalidad_N(struct.getClientefaclocalidad_N());
      setgxTv_SdtCliente_Clientefacdepartamento_N(struct.getClientefacdepartamento_N());
      setgxTv_SdtCliente_Clientefaccpostal_N(struct.getClientefaccpostal_N());
      setgxTv_SdtCliente_Clientefacgiro_N(struct.getClientefacgiro_N());
      setgxTv_SdtCliente_Clientecobnombretelefono1_N(struct.getClientecobnombretelefono1_N());
      setgxTv_SdtCliente_Clientefactelefonos_N(struct.getClientefactelefonos_N());
      setgxTv_SdtCliente_Clientecobnombretelefono2_N(struct.getClientecobnombretelefono2_N());
      setgxTv_SdtCliente_Clientecobtelefono2_N(struct.getClientecobtelefono2_N());
      setgxTv_SdtCliente_Clientecobnombrecelular1_N(struct.getClientecobnombrecelular1_N());
      setgxTv_SdtCliente_Clientecobcelular1_N(struct.getClientecobcelular1_N());
      setgxTv_SdtCliente_Clientecobnombrecelular2_N(struct.getClientecobnombrecelular2_N());
      setgxTv_SdtCliente_Clientecobcelular2_N(struct.getClientecobcelular2_N());
      setgxTv_SdtCliente_Clientecobnombreemail1_N(struct.getClientecobnombreemail1_N());
      setgxTv_SdtCliente_Clientecobemail1_N(struct.getClientecobemail1_N());
      setgxTv_SdtCliente_Clientecobnombreemail2_N(struct.getClientecobnombreemail2_N());
      setgxTv_SdtCliente_Clientecobemail2_N(struct.getClientecobemail2_N());
      setgxTv_SdtCliente_Clientefacfax_N(struct.getClientefacfax_N());
      setgxTv_SdtCliente_Clientefacemail_N(struct.getClientefacemail_N());
      setgxTv_SdtCliente_Clientefaccontrato_N(struct.getClientefaccontrato_N());
      setgxTv_SdtCliente_Clientefacobservaciones_N(struct.getClientefacobservaciones_N());
      setgxTv_SdtCliente_Clientefaclista_N(struct.getClientefaclista_N());
      setgxTv_SdtCliente_Clientefaccontado_N(struct.getClientefaccontado_N());
      setgxTv_SdtCliente_Clientenotemailfrascos1_N(struct.getClientenotemailfrascos1_N());
      setgxTv_SdtCliente_Clientenotemailfrascos2_N(struct.getClientenotemailfrascos2_N());
      setgxTv_SdtCliente_Clientenotemailmuestra1_N(struct.getClientenotemailmuestra1_N());
      setgxTv_SdtCliente_Clientenotemailmuestra2_N(struct.getClientenotemailmuestra2_N());
      setgxTv_SdtCliente_Clientenotemailanalisis1_N(struct.getClientenotemailanalisis1_N());
      setgxTv_SdtCliente_Clientenotemailanalisis2_N(struct.getClientenotemailanalisis2_N());
      setgxTv_SdtCliente_Clientenotemailgeneral1_N(struct.getClientenotemailgeneral1_N());
      setgxTv_SdtCliente_Clientenotemailgeneral2_N(struct.getClientenotemailgeneral2_N());
      setgxTv_SdtCliente_Clienteincobrable_N(struct.getClienteincobrable_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtCliente getStruct( )
   {
      com.colaveco.StructSdtCliente struct = new com.colaveco.StructSdtCliente ();
      struct.setClienteid(getgxTv_SdtCliente_Clienteid());
      struct.setClientenombre(getgxTv_SdtCliente_Clientenombre());
      struct.setClienteemail(getgxTv_SdtCliente_Clienteemail());
      struct.setClientenombreemail1(getgxTv_SdtCliente_Clientenombreemail1());
      struct.setClienteemail1(getgxTv_SdtCliente_Clienteemail1());
      struct.setClientenombreemail2(getgxTv_SdtCliente_Clientenombreemail2());
      struct.setClienteemail2(getgxTv_SdtCliente_Clienteemail2());
      struct.setClienteenvio(getgxTv_SdtCliente_Clienteenvio());
      struct.setClienteusuarioweb(getgxTv_SdtCliente_Clienteusuarioweb());
      struct.setClientenombrecelular1(getgxTv_SdtCliente_Clientenombrecelular1());
      struct.setClientecelular1(getgxTv_SdtCliente_Clientecelular1());
      struct.setClientenombrecelular2(getgxTv_SdtCliente_Clientenombrecelular2());
      struct.setClientecelular2(getgxTv_SdtCliente_Clientecelular2());
      struct.setClientecodigofigaro(getgxTv_SdtCliente_Clientecodigofigaro());
      struct.setClientetipousuario(getgxTv_SdtCliente_Clientetipousuario());
      struct.setClientedireccion(getgxTv_SdtCliente_Clientedireccion());
      struct.setClientenombretelefono1(getgxTv_SdtCliente_Clientenombretelefono1());
      struct.setClientetelefono1(getgxTv_SdtCliente_Clientetelefono1());
      struct.setClientenombretelefono2(getgxTv_SdtCliente_Clientenombretelefono2());
      struct.setClientetelefono2(getgxTv_SdtCliente_Clientetelefono2());
      struct.setClientefax(getgxTv_SdtCliente_Clientefax());
      struct.setClientedicose(getgxTv_SdtCliente_Clientedicose());
      struct.setClienteiddepartamento(getgxTv_SdtCliente_Clienteiddepartamento());
      struct.setClienteidlocalidad(getgxTv_SdtCliente_Clienteidlocalidad());
      struct.setClientetecnico1(getgxTv_SdtCliente_Clientetecnico1());
      struct.setClientetecnico2(getgxTv_SdtCliente_Clientetecnico2());
      struct.setClienteidagencia(getgxTv_SdtCliente_Clienteidagencia());
      struct.setClientecontrato(getgxTv_SdtCliente_Clientecontrato());
      struct.setClientesocio(getgxTv_SdtCliente_Clientesocio());
      struct.setClientenousar(getgxTv_SdtCliente_Clientenousar());
      struct.setClientecodbar(getgxTv_SdtCliente_Clientecodbar());
      struct.setClientecaravanas(getgxTv_SdtCliente_Clientecaravanas());
      struct.setClienteprolesa(getgxTv_SdtCliente_Clienteprolesa());
      struct.setClienteprolesasuc(getgxTv_SdtCliente_Clienteprolesasuc());
      struct.setClienteprolesamat(getgxTv_SdtCliente_Clienteprolesamat());
      struct.setClienteobservaciones(getgxTv_SdtCliente_Clienteobservaciones());
      struct.setClientefacrsocial(getgxTv_SdtCliente_Clientefacrsocial());
      struct.setClientefaccedula(getgxTv_SdtCliente_Clientefaccedula());
      struct.setClientefacrut(getgxTv_SdtCliente_Clientefacrut());
      struct.setClientefacdireccion(getgxTv_SdtCliente_Clientefacdireccion());
      struct.setClientefaclocalidad(getgxTv_SdtCliente_Clientefaclocalidad());
      struct.setClientefacdepartamento(getgxTv_SdtCliente_Clientefacdepartamento());
      struct.setClientefaccpostal(getgxTv_SdtCliente_Clientefaccpostal());
      struct.setClientefacgiro(getgxTv_SdtCliente_Clientefacgiro());
      struct.setClientecobnombretelefono1(getgxTv_SdtCliente_Clientecobnombretelefono1());
      struct.setClientefactelefonos(getgxTv_SdtCliente_Clientefactelefonos());
      struct.setClientecobnombretelefono2(getgxTv_SdtCliente_Clientecobnombretelefono2());
      struct.setClientecobtelefono2(getgxTv_SdtCliente_Clientecobtelefono2());
      struct.setClientecobnombrecelular1(getgxTv_SdtCliente_Clientecobnombrecelular1());
      struct.setClientecobcelular1(getgxTv_SdtCliente_Clientecobcelular1());
      struct.setClientecobnombrecelular2(getgxTv_SdtCliente_Clientecobnombrecelular2());
      struct.setClientecobcelular2(getgxTv_SdtCliente_Clientecobcelular2());
      struct.setClientecobnombreemail1(getgxTv_SdtCliente_Clientecobnombreemail1());
      struct.setClientecobemail1(getgxTv_SdtCliente_Clientecobemail1());
      struct.setClientecobnombreemail2(getgxTv_SdtCliente_Clientecobnombreemail2());
      struct.setClientecobemail2(getgxTv_SdtCliente_Clientecobemail2());
      struct.setClientefacfax(getgxTv_SdtCliente_Clientefacfax());
      struct.setClientefacemail(getgxTv_SdtCliente_Clientefacemail());
      struct.setClientefaccontrato(getgxTv_SdtCliente_Clientefaccontrato());
      struct.setClientefacobservaciones(getgxTv_SdtCliente_Clientefacobservaciones());
      struct.setClientefaclista(getgxTv_SdtCliente_Clientefaclista());
      struct.setClientefaccontado(getgxTv_SdtCliente_Clientefaccontado());
      struct.setClientenotemailfrascos1(getgxTv_SdtCliente_Clientenotemailfrascos1());
      struct.setClientenotemailfrascos2(getgxTv_SdtCliente_Clientenotemailfrascos2());
      struct.setClientenotemailmuestra1(getgxTv_SdtCliente_Clientenotemailmuestra1());
      struct.setClientenotemailmuestra2(getgxTv_SdtCliente_Clientenotemailmuestra2());
      struct.setClientenotemailanalisis1(getgxTv_SdtCliente_Clientenotemailanalisis1());
      struct.setClientenotemailanalisis2(getgxTv_SdtCliente_Clientenotemailanalisis2());
      struct.setClientenotemailgeneral1(getgxTv_SdtCliente_Clientenotemailgeneral1());
      struct.setClientenotemailgeneral2(getgxTv_SdtCliente_Clientenotemailgeneral2());
      struct.setClienteincobrable(getgxTv_SdtCliente_Clienteincobrable());
      struct.setMode(getgxTv_SdtCliente_Mode());
      struct.setInitialized(getgxTv_SdtCliente_Initialized());
      struct.setClienteid_Z(getgxTv_SdtCliente_Clienteid_Z());
      struct.setClientenombre_Z(getgxTv_SdtCliente_Clientenombre_Z());
      struct.setClienteemail_Z(getgxTv_SdtCliente_Clienteemail_Z());
      struct.setClientenombreemail1_Z(getgxTv_SdtCliente_Clientenombreemail1_Z());
      struct.setClienteemail1_Z(getgxTv_SdtCliente_Clienteemail1_Z());
      struct.setClientenombreemail2_Z(getgxTv_SdtCliente_Clientenombreemail2_Z());
      struct.setClienteemail2_Z(getgxTv_SdtCliente_Clienteemail2_Z());
      struct.setClienteenvio_Z(getgxTv_SdtCliente_Clienteenvio_Z());
      struct.setClienteusuarioweb_Z(getgxTv_SdtCliente_Clienteusuarioweb_Z());
      struct.setClientenombrecelular1_Z(getgxTv_SdtCliente_Clientenombrecelular1_Z());
      struct.setClientecelular1_Z(getgxTv_SdtCliente_Clientecelular1_Z());
      struct.setClientenombrecelular2_Z(getgxTv_SdtCliente_Clientenombrecelular2_Z());
      struct.setClientecelular2_Z(getgxTv_SdtCliente_Clientecelular2_Z());
      struct.setClientecodigofigaro_Z(getgxTv_SdtCliente_Clientecodigofigaro_Z());
      struct.setClientetipousuario_Z(getgxTv_SdtCliente_Clientetipousuario_Z());
      struct.setClientedireccion_Z(getgxTv_SdtCliente_Clientedireccion_Z());
      struct.setClientenombretelefono1_Z(getgxTv_SdtCliente_Clientenombretelefono1_Z());
      struct.setClientetelefono1_Z(getgxTv_SdtCliente_Clientetelefono1_Z());
      struct.setClientenombretelefono2_Z(getgxTv_SdtCliente_Clientenombretelefono2_Z());
      struct.setClientetelefono2_Z(getgxTv_SdtCliente_Clientetelefono2_Z());
      struct.setClientefax_Z(getgxTv_SdtCliente_Clientefax_Z());
      struct.setClientedicose_Z(getgxTv_SdtCliente_Clientedicose_Z());
      struct.setClienteiddepartamento_Z(getgxTv_SdtCliente_Clienteiddepartamento_Z());
      struct.setClienteidlocalidad_Z(getgxTv_SdtCliente_Clienteidlocalidad_Z());
      struct.setClientetecnico1_Z(getgxTv_SdtCliente_Clientetecnico1_Z());
      struct.setClientetecnico2_Z(getgxTv_SdtCliente_Clientetecnico2_Z());
      struct.setClienteidagencia_Z(getgxTv_SdtCliente_Clienteidagencia_Z());
      struct.setClientecontrato_Z(getgxTv_SdtCliente_Clientecontrato_Z());
      struct.setClientesocio_Z(getgxTv_SdtCliente_Clientesocio_Z());
      struct.setClientenousar_Z(getgxTv_SdtCliente_Clientenousar_Z());
      struct.setClientecodbar_Z(getgxTv_SdtCliente_Clientecodbar_Z());
      struct.setClientecaravanas_Z(getgxTv_SdtCliente_Clientecaravanas_Z());
      struct.setClienteprolesa_Z(getgxTv_SdtCliente_Clienteprolesa_Z());
      struct.setClienteprolesasuc_Z(getgxTv_SdtCliente_Clienteprolesasuc_Z());
      struct.setClienteprolesamat_Z(getgxTv_SdtCliente_Clienteprolesamat_Z());
      struct.setClienteobservaciones_Z(getgxTv_SdtCliente_Clienteobservaciones_Z());
      struct.setClientefacrsocial_Z(getgxTv_SdtCliente_Clientefacrsocial_Z());
      struct.setClientefaccedula_Z(getgxTv_SdtCliente_Clientefaccedula_Z());
      struct.setClientefacrut_Z(getgxTv_SdtCliente_Clientefacrut_Z());
      struct.setClientefacdireccion_Z(getgxTv_SdtCliente_Clientefacdireccion_Z());
      struct.setClientefaclocalidad_Z(getgxTv_SdtCliente_Clientefaclocalidad_Z());
      struct.setClientefacdepartamento_Z(getgxTv_SdtCliente_Clientefacdepartamento_Z());
      struct.setClientefaccpostal_Z(getgxTv_SdtCliente_Clientefaccpostal_Z());
      struct.setClientefacgiro_Z(getgxTv_SdtCliente_Clientefacgiro_Z());
      struct.setClientecobnombretelefono1_Z(getgxTv_SdtCliente_Clientecobnombretelefono1_Z());
      struct.setClientefactelefonos_Z(getgxTv_SdtCliente_Clientefactelefonos_Z());
      struct.setClientecobnombretelefono2_Z(getgxTv_SdtCliente_Clientecobnombretelefono2_Z());
      struct.setClientecobtelefono2_Z(getgxTv_SdtCliente_Clientecobtelefono2_Z());
      struct.setClientecobnombrecelular1_Z(getgxTv_SdtCliente_Clientecobnombrecelular1_Z());
      struct.setClientecobcelular1_Z(getgxTv_SdtCliente_Clientecobcelular1_Z());
      struct.setClientecobnombrecelular2_Z(getgxTv_SdtCliente_Clientecobnombrecelular2_Z());
      struct.setClientecobcelular2_Z(getgxTv_SdtCliente_Clientecobcelular2_Z());
      struct.setClientecobnombreemail1_Z(getgxTv_SdtCliente_Clientecobnombreemail1_Z());
      struct.setClientecobemail1_Z(getgxTv_SdtCliente_Clientecobemail1_Z());
      struct.setClientecobnombreemail2_Z(getgxTv_SdtCliente_Clientecobnombreemail2_Z());
      struct.setClientecobemail2_Z(getgxTv_SdtCliente_Clientecobemail2_Z());
      struct.setClientefacfax_Z(getgxTv_SdtCliente_Clientefacfax_Z());
      struct.setClientefacemail_Z(getgxTv_SdtCliente_Clientefacemail_Z());
      struct.setClientefaccontrato_Z(getgxTv_SdtCliente_Clientefaccontrato_Z());
      struct.setClientefacobservaciones_Z(getgxTv_SdtCliente_Clientefacobservaciones_Z());
      struct.setClientefaclista_Z(getgxTv_SdtCliente_Clientefaclista_Z());
      struct.setClientefaccontado_Z(getgxTv_SdtCliente_Clientefaccontado_Z());
      struct.setClientenotemailfrascos1_Z(getgxTv_SdtCliente_Clientenotemailfrascos1_Z());
      struct.setClientenotemailfrascos2_Z(getgxTv_SdtCliente_Clientenotemailfrascos2_Z());
      struct.setClientenotemailmuestra1_Z(getgxTv_SdtCliente_Clientenotemailmuestra1_Z());
      struct.setClientenotemailmuestra2_Z(getgxTv_SdtCliente_Clientenotemailmuestra2_Z());
      struct.setClientenotemailanalisis1_Z(getgxTv_SdtCliente_Clientenotemailanalisis1_Z());
      struct.setClientenotemailanalisis2_Z(getgxTv_SdtCliente_Clientenotemailanalisis2_Z());
      struct.setClientenotemailgeneral1_Z(getgxTv_SdtCliente_Clientenotemailgeneral1_Z());
      struct.setClientenotemailgeneral2_Z(getgxTv_SdtCliente_Clientenotemailgeneral2_Z());
      struct.setClienteincobrable_Z(getgxTv_SdtCliente_Clienteincobrable_Z());
      struct.setClientenombre_N(getgxTv_SdtCliente_Clientenombre_N());
      struct.setClienteemail_N(getgxTv_SdtCliente_Clienteemail_N());
      struct.setClientenombreemail1_N(getgxTv_SdtCliente_Clientenombreemail1_N());
      struct.setClienteemail1_N(getgxTv_SdtCliente_Clienteemail1_N());
      struct.setClientenombreemail2_N(getgxTv_SdtCliente_Clientenombreemail2_N());
      struct.setClienteemail2_N(getgxTv_SdtCliente_Clienteemail2_N());
      struct.setClienteenvio_N(getgxTv_SdtCliente_Clienteenvio_N());
      struct.setClienteusuarioweb_N(getgxTv_SdtCliente_Clienteusuarioweb_N());
      struct.setClientenombrecelular1_N(getgxTv_SdtCliente_Clientenombrecelular1_N());
      struct.setClientecelular1_N(getgxTv_SdtCliente_Clientecelular1_N());
      struct.setClientenombrecelular2_N(getgxTv_SdtCliente_Clientenombrecelular2_N());
      struct.setClientecelular2_N(getgxTv_SdtCliente_Clientecelular2_N());
      struct.setClientecodigofigaro_N(getgxTv_SdtCliente_Clientecodigofigaro_N());
      struct.setClientetipousuario_N(getgxTv_SdtCliente_Clientetipousuario_N());
      struct.setClientedireccion_N(getgxTv_SdtCliente_Clientedireccion_N());
      struct.setClientenombretelefono1_N(getgxTv_SdtCliente_Clientenombretelefono1_N());
      struct.setClientetelefono1_N(getgxTv_SdtCliente_Clientetelefono1_N());
      struct.setClientenombretelefono2_N(getgxTv_SdtCliente_Clientenombretelefono2_N());
      struct.setClientetelefono2_N(getgxTv_SdtCliente_Clientetelefono2_N());
      struct.setClientefax_N(getgxTv_SdtCliente_Clientefax_N());
      struct.setClientedicose_N(getgxTv_SdtCliente_Clientedicose_N());
      struct.setClienteiddepartamento_N(getgxTv_SdtCliente_Clienteiddepartamento_N());
      struct.setClienteidlocalidad_N(getgxTv_SdtCliente_Clienteidlocalidad_N());
      struct.setClientetecnico1_N(getgxTv_SdtCliente_Clientetecnico1_N());
      struct.setClientetecnico2_N(getgxTv_SdtCliente_Clientetecnico2_N());
      struct.setClienteidagencia_N(getgxTv_SdtCliente_Clienteidagencia_N());
      struct.setClientecontrato_N(getgxTv_SdtCliente_Clientecontrato_N());
      struct.setClientesocio_N(getgxTv_SdtCliente_Clientesocio_N());
      struct.setClientenousar_N(getgxTv_SdtCliente_Clientenousar_N());
      struct.setClientecodbar_N(getgxTv_SdtCliente_Clientecodbar_N());
      struct.setClientecaravanas_N(getgxTv_SdtCliente_Clientecaravanas_N());
      struct.setClienteprolesa_N(getgxTv_SdtCliente_Clienteprolesa_N());
      struct.setClienteprolesasuc_N(getgxTv_SdtCliente_Clienteprolesasuc_N());
      struct.setClienteobservaciones_N(getgxTv_SdtCliente_Clienteobservaciones_N());
      struct.setClientefacrsocial_N(getgxTv_SdtCliente_Clientefacrsocial_N());
      struct.setClientefaccedula_N(getgxTv_SdtCliente_Clientefaccedula_N());
      struct.setClientefacrut_N(getgxTv_SdtCliente_Clientefacrut_N());
      struct.setClientefacdireccion_N(getgxTv_SdtCliente_Clientefacdireccion_N());
      struct.setClientefaclocalidad_N(getgxTv_SdtCliente_Clientefaclocalidad_N());
      struct.setClientefacdepartamento_N(getgxTv_SdtCliente_Clientefacdepartamento_N());
      struct.setClientefaccpostal_N(getgxTv_SdtCliente_Clientefaccpostal_N());
      struct.setClientefacgiro_N(getgxTv_SdtCliente_Clientefacgiro_N());
      struct.setClientecobnombretelefono1_N(getgxTv_SdtCliente_Clientecobnombretelefono1_N());
      struct.setClientefactelefonos_N(getgxTv_SdtCliente_Clientefactelefonos_N());
      struct.setClientecobnombretelefono2_N(getgxTv_SdtCliente_Clientecobnombretelefono2_N());
      struct.setClientecobtelefono2_N(getgxTv_SdtCliente_Clientecobtelefono2_N());
      struct.setClientecobnombrecelular1_N(getgxTv_SdtCliente_Clientecobnombrecelular1_N());
      struct.setClientecobcelular1_N(getgxTv_SdtCliente_Clientecobcelular1_N());
      struct.setClientecobnombrecelular2_N(getgxTv_SdtCliente_Clientecobnombrecelular2_N());
      struct.setClientecobcelular2_N(getgxTv_SdtCliente_Clientecobcelular2_N());
      struct.setClientecobnombreemail1_N(getgxTv_SdtCliente_Clientecobnombreemail1_N());
      struct.setClientecobemail1_N(getgxTv_SdtCliente_Clientecobemail1_N());
      struct.setClientecobnombreemail2_N(getgxTv_SdtCliente_Clientecobnombreemail2_N());
      struct.setClientecobemail2_N(getgxTv_SdtCliente_Clientecobemail2_N());
      struct.setClientefacfax_N(getgxTv_SdtCliente_Clientefacfax_N());
      struct.setClientefacemail_N(getgxTv_SdtCliente_Clientefacemail_N());
      struct.setClientefaccontrato_N(getgxTv_SdtCliente_Clientefaccontrato_N());
      struct.setClientefacobservaciones_N(getgxTv_SdtCliente_Clientefacobservaciones_N());
      struct.setClientefaclista_N(getgxTv_SdtCliente_Clientefaclista_N());
      struct.setClientefaccontado_N(getgxTv_SdtCliente_Clientefaccontado_N());
      struct.setClientenotemailfrascos1_N(getgxTv_SdtCliente_Clientenotemailfrascos1_N());
      struct.setClientenotemailfrascos2_N(getgxTv_SdtCliente_Clientenotemailfrascos2_N());
      struct.setClientenotemailmuestra1_N(getgxTv_SdtCliente_Clientenotemailmuestra1_N());
      struct.setClientenotemailmuestra2_N(getgxTv_SdtCliente_Clientenotemailmuestra2_N());
      struct.setClientenotemailanalisis1_N(getgxTv_SdtCliente_Clientenotemailanalisis1_N());
      struct.setClientenotemailanalisis2_N(getgxTv_SdtCliente_Clientenotemailanalisis2_N());
      struct.setClientenotemailgeneral1_N(getgxTv_SdtCliente_Clientenotemailgeneral1_N());
      struct.setClientenotemailgeneral2_N(getgxTv_SdtCliente_Clientenotemailgeneral2_N());
      struct.setClienteincobrable_N(getgxTv_SdtCliente_Clienteincobrable_N());
      return struct ;
   }

   private byte gxTv_SdtCliente_N ;
   private byte gxTv_SdtCliente_Clientenombre_N ;
   private byte gxTv_SdtCliente_Clienteemail_N ;
   private byte gxTv_SdtCliente_Clientenombreemail1_N ;
   private byte gxTv_SdtCliente_Clienteemail1_N ;
   private byte gxTv_SdtCliente_Clientenombreemail2_N ;
   private byte gxTv_SdtCliente_Clienteemail2_N ;
   private byte gxTv_SdtCliente_Clienteenvio_N ;
   private byte gxTv_SdtCliente_Clienteusuarioweb_N ;
   private byte gxTv_SdtCliente_Clientenombrecelular1_N ;
   private byte gxTv_SdtCliente_Clientecelular1_N ;
   private byte gxTv_SdtCliente_Clientenombrecelular2_N ;
   private byte gxTv_SdtCliente_Clientecelular2_N ;
   private byte gxTv_SdtCliente_Clientecodigofigaro_N ;
   private byte gxTv_SdtCliente_Clientetipousuario_N ;
   private byte gxTv_SdtCliente_Clientedireccion_N ;
   private byte gxTv_SdtCliente_Clientenombretelefono1_N ;
   private byte gxTv_SdtCliente_Clientetelefono1_N ;
   private byte gxTv_SdtCliente_Clientenombretelefono2_N ;
   private byte gxTv_SdtCliente_Clientetelefono2_N ;
   private byte gxTv_SdtCliente_Clientefax_N ;
   private byte gxTv_SdtCliente_Clientedicose_N ;
   private byte gxTv_SdtCliente_Clienteiddepartamento_N ;
   private byte gxTv_SdtCliente_Clienteidlocalidad_N ;
   private byte gxTv_SdtCliente_Clientetecnico1_N ;
   private byte gxTv_SdtCliente_Clientetecnico2_N ;
   private byte gxTv_SdtCliente_Clienteidagencia_N ;
   private byte gxTv_SdtCliente_Clientecontrato_N ;
   private byte gxTv_SdtCliente_Clientesocio_N ;
   private byte gxTv_SdtCliente_Clientenousar_N ;
   private byte gxTv_SdtCliente_Clientecodbar_N ;
   private byte gxTv_SdtCliente_Clientecaravanas_N ;
   private byte gxTv_SdtCliente_Clienteprolesa_N ;
   private byte gxTv_SdtCliente_Clienteprolesasuc_N ;
   private byte gxTv_SdtCliente_Clienteobservaciones_N ;
   private byte gxTv_SdtCliente_Clientefacrsocial_N ;
   private byte gxTv_SdtCliente_Clientefaccedula_N ;
   private byte gxTv_SdtCliente_Clientefacrut_N ;
   private byte gxTv_SdtCliente_Clientefacdireccion_N ;
   private byte gxTv_SdtCliente_Clientefaclocalidad_N ;
   private byte gxTv_SdtCliente_Clientefacdepartamento_N ;
   private byte gxTv_SdtCliente_Clientefaccpostal_N ;
   private byte gxTv_SdtCliente_Clientefacgiro_N ;
   private byte gxTv_SdtCliente_Clientecobnombretelefono1_N ;
   private byte gxTv_SdtCliente_Clientefactelefonos_N ;
   private byte gxTv_SdtCliente_Clientecobnombretelefono2_N ;
   private byte gxTv_SdtCliente_Clientecobtelefono2_N ;
   private byte gxTv_SdtCliente_Clientecobnombrecelular1_N ;
   private byte gxTv_SdtCliente_Clientecobcelular1_N ;
   private byte gxTv_SdtCliente_Clientecobnombrecelular2_N ;
   private byte gxTv_SdtCliente_Clientecobcelular2_N ;
   private byte gxTv_SdtCliente_Clientecobnombreemail1_N ;
   private byte gxTv_SdtCliente_Clientecobemail1_N ;
   private byte gxTv_SdtCliente_Clientecobnombreemail2_N ;
   private byte gxTv_SdtCliente_Clientecobemail2_N ;
   private byte gxTv_SdtCliente_Clientefacfax_N ;
   private byte gxTv_SdtCliente_Clientefacemail_N ;
   private byte gxTv_SdtCliente_Clientefaccontrato_N ;
   private byte gxTv_SdtCliente_Clientefacobservaciones_N ;
   private byte gxTv_SdtCliente_Clientefaclista_N ;
   private byte gxTv_SdtCliente_Clientefaccontado_N ;
   private byte gxTv_SdtCliente_Clientenotemailfrascos1_N ;
   private byte gxTv_SdtCliente_Clientenotemailfrascos2_N ;
   private byte gxTv_SdtCliente_Clientenotemailmuestra1_N ;
   private byte gxTv_SdtCliente_Clientenotemailmuestra2_N ;
   private byte gxTv_SdtCliente_Clientenotemailanalisis1_N ;
   private byte gxTv_SdtCliente_Clientenotemailanalisis2_N ;
   private byte gxTv_SdtCliente_Clientenotemailgeneral1_N ;
   private byte gxTv_SdtCliente_Clientenotemailgeneral2_N ;
   private byte gxTv_SdtCliente_Clienteincobrable_N ;
   private short gxTv_SdtCliente_Clientetipousuario ;
   private short gxTv_SdtCliente_Clientecontrato ;
   private short gxTv_SdtCliente_Clientesocio ;
   private short gxTv_SdtCliente_Clientenousar ;
   private short gxTv_SdtCliente_Clientecodbar ;
   private short gxTv_SdtCliente_Clientecaravanas ;
   private short gxTv_SdtCliente_Clienteprolesa ;
   private short gxTv_SdtCliente_Clientefaccontado ;
   private short gxTv_SdtCliente_Clienteincobrable ;
   private short gxTv_SdtCliente_Initialized ;
   private short gxTv_SdtCliente_Clientetipousuario_Z ;
   private short gxTv_SdtCliente_Clientecontrato_Z ;
   private short gxTv_SdtCliente_Clientesocio_Z ;
   private short gxTv_SdtCliente_Clientenousar_Z ;
   private short gxTv_SdtCliente_Clientecodbar_Z ;
   private short gxTv_SdtCliente_Clientecaravanas_Z ;
   private short gxTv_SdtCliente_Clienteprolesa_Z ;
   private short gxTv_SdtCliente_Clientefaccontado_Z ;
   private short gxTv_SdtCliente_Clienteincobrable_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtCliente_Clienteid ;
   private long gxTv_SdtCliente_Clienteiddepartamento ;
   private long gxTv_SdtCliente_Clienteidlocalidad ;
   private long gxTv_SdtCliente_Clientetecnico1 ;
   private long gxTv_SdtCliente_Clientetecnico2 ;
   private long gxTv_SdtCliente_Clienteidagencia ;
   private long gxTv_SdtCliente_Clienteprolesasuc ;
   private long gxTv_SdtCliente_Clienteprolesamat ;
   private long gxTv_SdtCliente_Clientefacdepartamento ;
   private long gxTv_SdtCliente_Clientefacgiro ;
   private long gxTv_SdtCliente_Clientefaclista ;
   private long gxTv_SdtCliente_Clienteid_Z ;
   private long gxTv_SdtCliente_Clienteiddepartamento_Z ;
   private long gxTv_SdtCliente_Clienteidlocalidad_Z ;
   private long gxTv_SdtCliente_Clientetecnico1_Z ;
   private long gxTv_SdtCliente_Clientetecnico2_Z ;
   private long gxTv_SdtCliente_Clienteidagencia_Z ;
   private long gxTv_SdtCliente_Clienteprolesasuc_Z ;
   private long gxTv_SdtCliente_Clienteprolesamat_Z ;
   private long gxTv_SdtCliente_Clientefacdepartamento_Z ;
   private long gxTv_SdtCliente_Clientefacgiro_Z ;
   private long gxTv_SdtCliente_Clientefaclista_Z ;
   private String gxTv_SdtCliente_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtCliente_Clientenombre ;
   private String gxTv_SdtCliente_Clienteemail ;
   private String gxTv_SdtCliente_Clientenombreemail1 ;
   private String gxTv_SdtCliente_Clienteemail1 ;
   private String gxTv_SdtCliente_Clientenombreemail2 ;
   private String gxTv_SdtCliente_Clienteemail2 ;
   private String gxTv_SdtCliente_Clienteenvio ;
   private String gxTv_SdtCliente_Clienteusuarioweb ;
   private String gxTv_SdtCliente_Clientenombrecelular1 ;
   private String gxTv_SdtCliente_Clientecelular1 ;
   private String gxTv_SdtCliente_Clientenombrecelular2 ;
   private String gxTv_SdtCliente_Clientecelular2 ;
   private String gxTv_SdtCliente_Clientecodigofigaro ;
   private String gxTv_SdtCliente_Clientedireccion ;
   private String gxTv_SdtCliente_Clientenombretelefono1 ;
   private String gxTv_SdtCliente_Clientetelefono1 ;
   private String gxTv_SdtCliente_Clientenombretelefono2 ;
   private String gxTv_SdtCliente_Clientetelefono2 ;
   private String gxTv_SdtCliente_Clientefax ;
   private String gxTv_SdtCliente_Clientedicose ;
   private String gxTv_SdtCliente_Clienteobservaciones ;
   private String gxTv_SdtCliente_Clientefacrsocial ;
   private String gxTv_SdtCliente_Clientefaccedula ;
   private String gxTv_SdtCliente_Clientefacrut ;
   private String gxTv_SdtCliente_Clientefacdireccion ;
   private String gxTv_SdtCliente_Clientefaclocalidad ;
   private String gxTv_SdtCliente_Clientefaccpostal ;
   private String gxTv_SdtCliente_Clientecobnombretelefono1 ;
   private String gxTv_SdtCliente_Clientefactelefonos ;
   private String gxTv_SdtCliente_Clientecobnombretelefono2 ;
   private String gxTv_SdtCliente_Clientecobtelefono2 ;
   private String gxTv_SdtCliente_Clientecobnombrecelular1 ;
   private String gxTv_SdtCliente_Clientecobcelular1 ;
   private String gxTv_SdtCliente_Clientecobnombrecelular2 ;
   private String gxTv_SdtCliente_Clientecobcelular2 ;
   private String gxTv_SdtCliente_Clientecobnombreemail1 ;
   private String gxTv_SdtCliente_Clientecobemail1 ;
   private String gxTv_SdtCliente_Clientecobnombreemail2 ;
   private String gxTv_SdtCliente_Clientecobemail2 ;
   private String gxTv_SdtCliente_Clientefacfax ;
   private String gxTv_SdtCliente_Clientefacemail ;
   private String gxTv_SdtCliente_Clientefaccontrato ;
   private String gxTv_SdtCliente_Clientefacobservaciones ;
   private String gxTv_SdtCliente_Clientenotemailfrascos1 ;
   private String gxTv_SdtCliente_Clientenotemailfrascos2 ;
   private String gxTv_SdtCliente_Clientenotemailmuestra1 ;
   private String gxTv_SdtCliente_Clientenotemailmuestra2 ;
   private String gxTv_SdtCliente_Clientenotemailanalisis1 ;
   private String gxTv_SdtCliente_Clientenotemailanalisis2 ;
   private String gxTv_SdtCliente_Clientenotemailgeneral1 ;
   private String gxTv_SdtCliente_Clientenotemailgeneral2 ;
   private String gxTv_SdtCliente_Clientenombre_Z ;
   private String gxTv_SdtCliente_Clienteemail_Z ;
   private String gxTv_SdtCliente_Clientenombreemail1_Z ;
   private String gxTv_SdtCliente_Clienteemail1_Z ;
   private String gxTv_SdtCliente_Clientenombreemail2_Z ;
   private String gxTv_SdtCliente_Clienteemail2_Z ;
   private String gxTv_SdtCliente_Clienteenvio_Z ;
   private String gxTv_SdtCliente_Clienteusuarioweb_Z ;
   private String gxTv_SdtCliente_Clientenombrecelular1_Z ;
   private String gxTv_SdtCliente_Clientecelular1_Z ;
   private String gxTv_SdtCliente_Clientenombrecelular2_Z ;
   private String gxTv_SdtCliente_Clientecelular2_Z ;
   private String gxTv_SdtCliente_Clientecodigofigaro_Z ;
   private String gxTv_SdtCliente_Clientedireccion_Z ;
   private String gxTv_SdtCliente_Clientenombretelefono1_Z ;
   private String gxTv_SdtCliente_Clientetelefono1_Z ;
   private String gxTv_SdtCliente_Clientenombretelefono2_Z ;
   private String gxTv_SdtCliente_Clientetelefono2_Z ;
   private String gxTv_SdtCliente_Clientefax_Z ;
   private String gxTv_SdtCliente_Clientedicose_Z ;
   private String gxTv_SdtCliente_Clienteobservaciones_Z ;
   private String gxTv_SdtCliente_Clientefacrsocial_Z ;
   private String gxTv_SdtCliente_Clientefaccedula_Z ;
   private String gxTv_SdtCliente_Clientefacrut_Z ;
   private String gxTv_SdtCliente_Clientefacdireccion_Z ;
   private String gxTv_SdtCliente_Clientefaclocalidad_Z ;
   private String gxTv_SdtCliente_Clientefaccpostal_Z ;
   private String gxTv_SdtCliente_Clientecobnombretelefono1_Z ;
   private String gxTv_SdtCliente_Clientefactelefonos_Z ;
   private String gxTv_SdtCliente_Clientecobnombretelefono2_Z ;
   private String gxTv_SdtCliente_Clientecobtelefono2_Z ;
   private String gxTv_SdtCliente_Clientecobnombrecelular1_Z ;
   private String gxTv_SdtCliente_Clientecobcelular1_Z ;
   private String gxTv_SdtCliente_Clientecobnombrecelular2_Z ;
   private String gxTv_SdtCliente_Clientecobcelular2_Z ;
   private String gxTv_SdtCliente_Clientecobnombreemail1_Z ;
   private String gxTv_SdtCliente_Clientecobemail1_Z ;
   private String gxTv_SdtCliente_Clientecobnombreemail2_Z ;
   private String gxTv_SdtCliente_Clientecobemail2_Z ;
   private String gxTv_SdtCliente_Clientefacfax_Z ;
   private String gxTv_SdtCliente_Clientefacemail_Z ;
   private String gxTv_SdtCliente_Clientefaccontrato_Z ;
   private String gxTv_SdtCliente_Clientefacobservaciones_Z ;
   private String gxTv_SdtCliente_Clientenotemailfrascos1_Z ;
   private String gxTv_SdtCliente_Clientenotemailfrascos2_Z ;
   private String gxTv_SdtCliente_Clientenotemailmuestra1_Z ;
   private String gxTv_SdtCliente_Clientenotemailmuestra2_Z ;
   private String gxTv_SdtCliente_Clientenotemailanalisis1_Z ;
   private String gxTv_SdtCliente_Clientenotemailanalisis2_Z ;
   private String gxTv_SdtCliente_Clientenotemailgeneral1_Z ;
   private String gxTv_SdtCliente_Clientenotemailgeneral2_Z ;
}

