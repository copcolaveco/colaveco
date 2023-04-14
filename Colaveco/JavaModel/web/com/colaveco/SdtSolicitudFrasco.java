package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSolicitudFrasco extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtSolicitudFrasco( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtSolicitudFrasco.class));
   }

   public SdtSolicitudFrasco( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSolicitudFrasco");
      initialize( remoteHandle) ;
   }

   public SdtSolicitudFrasco( int remoteHandle ,
                              StructSdtSolicitudFrasco struct )
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

   public void Load( long AV3SFId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV3SFId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"SFId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "SolicitudFrasco");
      metadata.set("BT", "SolicitudFrasco");
      metadata.set("PK", "[ \"SFId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFId") )
            {
               gxTv_SdtSolicitudFrasco_Sfid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFIdNet") )
            {
               gxTv_SdtSolicitudFrasco_Sfidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFNombre") )
            {
               gxTv_SdtSolicitudFrasco_Sfnombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFDireccion") )
            {
               gxTv_SdtSolicitudFrasco_Sfdireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFAgencia") )
            {
               gxTv_SdtSolicitudFrasco_Sfagencia = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFTelefono") )
            {
               gxTv_SdtSolicitudFrasco_Sftelefono = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFEmail") )
            {
               gxTv_SdtSolicitudFrasco_Sfemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosConC") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosconc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSinC") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossinc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosAgua") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosagua = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSangre") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossangre = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFObservaciones") )
            {
               gxTv_SdtSolicitudFrasco_Sfobservaciones = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaCreacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSolicitudFrasco_Sffechacreacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSolicitudFrasco_Sffechacreacion = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaModificado") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSolicitudFrasco_Sffechamodificado = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSolicitudFrasco_Sffechamodificado = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosIsopo") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosisopo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtSolicitudFrasco_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtSolicitudFrasco_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFId_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFIdNet_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfidnet_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFNombre_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfnombre_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFDireccion_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfdireccion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFAgencia_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfagencia_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFTelefono_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sftelefono_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFEmail_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfemail_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosConC_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosconc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSinC_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossinc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosAgua_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosagua_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSangre_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossangre_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFObservaciones_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaCreacion_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaModificado_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosIsopo_Z") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFIdNet_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFNombre_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFDireccion_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFAgencia_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFTelefono_N") )
            {
               gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFEmail_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosConC_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSinC_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosAgua_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSangre_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFObservaciones_N") )
            {
               gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaCreacion_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFechaModificado_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosIsopo_N") )
            {
               gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SolicitudFrasco" ;
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
      oWriter.writeElement("SFId", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFIdNet", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFNombre", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfnombre));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFDireccion", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfdireccion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFAgencia", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfagencia, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFTelefono", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sftelefono));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFEmail", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfemail));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFFrascosConC", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosconc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFFrascosSinC", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossinc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFFrascosAgua", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosagua, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFFrascosSangre", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossangre, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFObservaciones", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfobservaciones));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSolicitudFrasco_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("SFFechaCreacion", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSolicitudFrasco_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("SFFechaModificado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SFFrascosIsopo", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosisopo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFId_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFIdNet_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfidnet_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFNombre_Z", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfnombre_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFDireccion_Z", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfdireccion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFAgencia_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfagencia_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFTelefono_Z", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sftelefono_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFEmail_Z", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfemail_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosConC_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosconc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosSinC_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossinc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosAgua_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosagua_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosSangre_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossangre_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFObservaciones_Z", GXutil.rtrim( gxTv_SdtSolicitudFrasco_Sfobservaciones_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSolicitudFrasco_Sffechacreacion_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SFFechaCreacion_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSolicitudFrasco_Sffechamodificado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SFFechaModificado_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosIsopo_Z", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFIdNet_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfidnet_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFNombre_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfnombre_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFDireccion_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfdireccion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFAgencia_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfagencia_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFTelefono_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sftelefono_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFEmail_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfemail_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosConC_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosconc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosSinC_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossinc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosAgua_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosagua_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosSangre_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascossangre_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFObservaciones_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfobservaciones_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFechaCreacion_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffechacreacion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFechaModificado_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffechamodificado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("SFFrascosIsopo_N", GXutil.trim( GXutil.str( gxTv_SdtSolicitudFrasco_Sffrascosisopo_N, 1, 0)));
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
      AddObjectProperty("SFId", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("SFIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfidnet, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("SFIdNet_N", gxTv_SdtSolicitudFrasco_Sfidnet_N, false, includeNonInitialized);
      AddObjectProperty("SFNombre", gxTv_SdtSolicitudFrasco_Sfnombre, false, includeNonInitialized);
      AddObjectProperty("SFNombre_N", gxTv_SdtSolicitudFrasco_Sfnombre_N, false, includeNonInitialized);
      AddObjectProperty("SFDireccion", gxTv_SdtSolicitudFrasco_Sfdireccion, false, includeNonInitialized);
      AddObjectProperty("SFDireccion_N", gxTv_SdtSolicitudFrasco_Sfdireccion_N, false, includeNonInitialized);
      AddObjectProperty("SFAgencia", gxTv_SdtSolicitudFrasco_Sfagencia, false, includeNonInitialized);
      AddObjectProperty("SFAgencia_N", gxTv_SdtSolicitudFrasco_Sfagencia_N, false, includeNonInitialized);
      AddObjectProperty("SFTelefono", gxTv_SdtSolicitudFrasco_Sftelefono, false, includeNonInitialized);
      AddObjectProperty("SFTelefono_N", gxTv_SdtSolicitudFrasco_Sftelefono_N, false, includeNonInitialized);
      AddObjectProperty("SFEmail", gxTv_SdtSolicitudFrasco_Sfemail, false, includeNonInitialized);
      AddObjectProperty("SFEmail_N", gxTv_SdtSolicitudFrasco_Sfemail_N, false, includeNonInitialized);
      AddObjectProperty("SFFrascosConC", gxTv_SdtSolicitudFrasco_Sffrascosconc, false, includeNonInitialized);
      AddObjectProperty("SFFrascosConC_N", gxTv_SdtSolicitudFrasco_Sffrascosconc_N, false, includeNonInitialized);
      AddObjectProperty("SFFrascosSinC", gxTv_SdtSolicitudFrasco_Sffrascossinc, false, includeNonInitialized);
      AddObjectProperty("SFFrascosSinC_N", gxTv_SdtSolicitudFrasco_Sffrascossinc_N, false, includeNonInitialized);
      AddObjectProperty("SFFrascosAgua", gxTv_SdtSolicitudFrasco_Sffrascosagua, false, includeNonInitialized);
      AddObjectProperty("SFFrascosAgua_N", gxTv_SdtSolicitudFrasco_Sffrascosagua_N, false, includeNonInitialized);
      AddObjectProperty("SFFrascosSangre", gxTv_SdtSolicitudFrasco_Sffrascossangre, false, includeNonInitialized);
      AddObjectProperty("SFFrascosSangre_N", gxTv_SdtSolicitudFrasco_Sffrascossangre_N, false, includeNonInitialized);
      AddObjectProperty("SFObservaciones", gxTv_SdtSolicitudFrasco_Sfobservaciones, false, includeNonInitialized);
      AddObjectProperty("SFObservaciones_N", gxTv_SdtSolicitudFrasco_Sfobservaciones_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtSolicitudFrasco_Sffechacreacion ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SFFechaCreacion", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("SFFechaCreacion_N", gxTv_SdtSolicitudFrasco_Sffechacreacion_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtSolicitudFrasco_Sffechamodificado ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SFFechaModificado", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("SFFechaModificado_N", gxTv_SdtSolicitudFrasco_Sffechamodificado_N, false, includeNonInitialized);
      AddObjectProperty("SFFrascosIsopo", gxTv_SdtSolicitudFrasco_Sffrascosisopo, false, includeNonInitialized);
      AddObjectProperty("SFFrascosIsopo_N", gxTv_SdtSolicitudFrasco_Sffrascosisopo_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtSolicitudFrasco_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtSolicitudFrasco_Initialized, false, includeNonInitialized);
         AddObjectProperty("SFId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("SFIdNet_Z", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudFrasco_Sfidnet_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("SFNombre_Z", gxTv_SdtSolicitudFrasco_Sfnombre_Z, false, includeNonInitialized);
         AddObjectProperty("SFDireccion_Z", gxTv_SdtSolicitudFrasco_Sfdireccion_Z, false, includeNonInitialized);
         AddObjectProperty("SFAgencia_Z", gxTv_SdtSolicitudFrasco_Sfagencia_Z, false, includeNonInitialized);
         AddObjectProperty("SFTelefono_Z", gxTv_SdtSolicitudFrasco_Sftelefono_Z, false, includeNonInitialized);
         AddObjectProperty("SFEmail_Z", gxTv_SdtSolicitudFrasco_Sfemail_Z, false, includeNonInitialized);
         AddObjectProperty("SFFrascosConC_Z", gxTv_SdtSolicitudFrasco_Sffrascosconc_Z, false, includeNonInitialized);
         AddObjectProperty("SFFrascosSinC_Z", gxTv_SdtSolicitudFrasco_Sffrascossinc_Z, false, includeNonInitialized);
         AddObjectProperty("SFFrascosAgua_Z", gxTv_SdtSolicitudFrasco_Sffrascosagua_Z, false, includeNonInitialized);
         AddObjectProperty("SFFrascosSangre_Z", gxTv_SdtSolicitudFrasco_Sffrascossangre_Z, false, includeNonInitialized);
         AddObjectProperty("SFObservaciones_Z", gxTv_SdtSolicitudFrasco_Sfobservaciones_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtSolicitudFrasco_Sffechacreacion_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("SFFechaCreacion_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtSolicitudFrasco_Sffechamodificado_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("SFFechaModificado_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("SFFrascosIsopo_Z", gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z, false, includeNonInitialized);
         AddObjectProperty("SFIdNet_N", gxTv_SdtSolicitudFrasco_Sfidnet_N, false, includeNonInitialized);
         AddObjectProperty("SFNombre_N", gxTv_SdtSolicitudFrasco_Sfnombre_N, false, includeNonInitialized);
         AddObjectProperty("SFDireccion_N", gxTv_SdtSolicitudFrasco_Sfdireccion_N, false, includeNonInitialized);
         AddObjectProperty("SFAgencia_N", gxTv_SdtSolicitudFrasco_Sfagencia_N, false, includeNonInitialized);
         AddObjectProperty("SFTelefono_N", gxTv_SdtSolicitudFrasco_Sftelefono_N, false, includeNonInitialized);
         AddObjectProperty("SFEmail_N", gxTv_SdtSolicitudFrasco_Sfemail_N, false, includeNonInitialized);
         AddObjectProperty("SFFrascosConC_N", gxTv_SdtSolicitudFrasco_Sffrascosconc_N, false, includeNonInitialized);
         AddObjectProperty("SFFrascosSinC_N", gxTv_SdtSolicitudFrasco_Sffrascossinc_N, false, includeNonInitialized);
         AddObjectProperty("SFFrascosAgua_N", gxTv_SdtSolicitudFrasco_Sffrascosagua_N, false, includeNonInitialized);
         AddObjectProperty("SFFrascosSangre_N", gxTv_SdtSolicitudFrasco_Sffrascossangre_N, false, includeNonInitialized);
         AddObjectProperty("SFObservaciones_N", gxTv_SdtSolicitudFrasco_Sfobservaciones_N, false, includeNonInitialized);
         AddObjectProperty("SFFechaCreacion_N", gxTv_SdtSolicitudFrasco_Sffechacreacion_N, false, includeNonInitialized);
         AddObjectProperty("SFFechaModificado_N", gxTv_SdtSolicitudFrasco_Sffechamodificado_N, false, includeNonInitialized);
         AddObjectProperty("SFFrascosIsopo_N", gxTv_SdtSolicitudFrasco_Sffrascosisopo_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtSolicitudFrasco sdt )
   {
      if ( sdt.IsDirty("SFId") )
      {
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfid = sdt.getgxTv_SdtSolicitudFrasco_Sfid() ;
      }
      if ( sdt.IsDirty("SFIdNet") )
      {
         gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfidnet = sdt.getgxTv_SdtSolicitudFrasco_Sfidnet() ;
      }
      if ( sdt.IsDirty("SFNombre") )
      {
         gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfnombre = sdt.getgxTv_SdtSolicitudFrasco_Sfnombre() ;
      }
      if ( sdt.IsDirty("SFDireccion") )
      {
         gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfdireccion = sdt.getgxTv_SdtSolicitudFrasco_Sfdireccion() ;
      }
      if ( sdt.IsDirty("SFAgencia") )
      {
         gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfagencia = sdt.getgxTv_SdtSolicitudFrasco_Sfagencia() ;
      }
      if ( sdt.IsDirty("SFTelefono") )
      {
         gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sftelefono = sdt.getgxTv_SdtSolicitudFrasco_Sftelefono() ;
      }
      if ( sdt.IsDirty("SFEmail") )
      {
         gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfemail = sdt.getgxTv_SdtSolicitudFrasco_Sfemail() ;
      }
      if ( sdt.IsDirty("SFFrascosConC") )
      {
         gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffrascosconc = sdt.getgxTv_SdtSolicitudFrasco_Sffrascosconc() ;
      }
      if ( sdt.IsDirty("SFFrascosSinC") )
      {
         gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffrascossinc = sdt.getgxTv_SdtSolicitudFrasco_Sffrascossinc() ;
      }
      if ( sdt.IsDirty("SFFrascosAgua") )
      {
         gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffrascosagua = sdt.getgxTv_SdtSolicitudFrasco_Sffrascosagua() ;
      }
      if ( sdt.IsDirty("SFFrascosSangre") )
      {
         gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffrascossangre = sdt.getgxTv_SdtSolicitudFrasco_Sffrascossangre() ;
      }
      if ( sdt.IsDirty("SFObservaciones") )
      {
         gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sfobservaciones = sdt.getgxTv_SdtSolicitudFrasco_Sfobservaciones() ;
      }
      if ( sdt.IsDirty("SFFechaCreacion") )
      {
         gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffechacreacion = sdt.getgxTv_SdtSolicitudFrasco_Sffechacreacion() ;
      }
      if ( sdt.IsDirty("SFFechaModificado") )
      {
         gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffechamodificado = sdt.getgxTv_SdtSolicitudFrasco_Sffechamodificado() ;
      }
      if ( sdt.IsDirty("SFFrascosIsopo") )
      {
         gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
         gxTv_SdtSolicitudFrasco_Sffrascosisopo = sdt.getgxTv_SdtSolicitudFrasco_Sffrascosisopo() ;
      }
   }

   public long getgxTv_SdtSolicitudFrasco_Sfid( )
   {
      return gxTv_SdtSolicitudFrasco_Sfid ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfid( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      if ( gxTv_SdtSolicitudFrasco_Sfid != value )
      {
         gxTv_SdtSolicitudFrasco_Mode = "INS" ;
         this.setgxTv_SdtSolicitudFrasco_Sfid_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfidnet_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfnombre_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfdireccion_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfagencia_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sftelefono_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfemail_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffrascosconc_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffrascossinc_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffrascosagua_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffrascossangre_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sfobservaciones_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffechacreacion_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffechamodificado_Z_SetNull( );
         this.setgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z_SetNull( );
      }
      SetDirty("Sfid");
      gxTv_SdtSolicitudFrasco_Sfid = value ;
   }

   public long getgxTv_SdtSolicitudFrasco_Sfidnet( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet( long value )
   {
      gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfidnet");
      gxTv_SdtSolicitudFrasco_Sfidnet = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfidnet = 0 ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfidnet_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfidnet_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfnombre( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfnombre");
      gxTv_SdtSolicitudFrasco_Sfnombre = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfnombre = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfnombre_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfnombre_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfdireccion( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfdireccion");
      gxTv_SdtSolicitudFrasco_Sfdireccion = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfdireccion = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfdireccion_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfdireccion_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sfagencia( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia( short value )
   {
      gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfagencia");
      gxTv_SdtSolicitudFrasco_Sfagencia = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfagencia = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfagencia_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfagencia_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sftelefono( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono( String value )
   {
      gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sftelefono");
      gxTv_SdtSolicitudFrasco_Sftelefono = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sftelefono = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sftelefono_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sftelefono_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfemail( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfemail");
      gxTv_SdtSolicitudFrasco_Sfemail = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfemail = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfemail_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfemail_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosconc( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosconc");
      gxTv_SdtSolicitudFrasco_Sffrascosconc = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosconc = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosconc_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffrascosconc_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascossinc( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossinc");
      gxTv_SdtSolicitudFrasco_Sffrascossinc = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascossinc = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossinc_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffrascossinc_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosagua( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosagua");
      gxTv_SdtSolicitudFrasco_Sffrascosagua = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosagua = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosagua_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffrascosagua_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascossangre( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossangre");
      gxTv_SdtSolicitudFrasco_Sffrascossangre = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascossangre = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossangre_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffrascossangre_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfobservaciones( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfobservaciones");
      gxTv_SdtSolicitudFrasco_Sfobservaciones = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfobservaciones_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sfobservaciones_N==1) ;
   }

   public java.util.Date getgxTv_SdtSolicitudFrasco_Sffechacreacion( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechacreacion");
      gxTv_SdtSolicitudFrasco_Sffechacreacion = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechacreacion_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffechacreacion_N==1) ;
   }

   public java.util.Date getgxTv_SdtSolicitudFrasco_Sffechamodificado( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechamodificado");
      gxTv_SdtSolicitudFrasco_Sffechamodificado = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechamodificado_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffechamodificado_N==1) ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosisopo( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosisopo");
      gxTv_SdtSolicitudFrasco_Sffrascosisopo = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosisopo = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosisopo_IsNull( )
   {
      return (gxTv_SdtSolicitudFrasco_Sffrascosisopo_N==1) ;
   }

   public String getgxTv_SdtSolicitudFrasco_Mode( )
   {
      return gxTv_SdtSolicitudFrasco_Mode ;
   }

   public void setgxTv_SdtSolicitudFrasco_Mode( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtSolicitudFrasco_Mode = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Mode_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Mode = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Initialized( )
   {
      return gxTv_SdtSolicitudFrasco_Initialized ;
   }

   public void setgxTv_SdtSolicitudFrasco_Initialized( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtSolicitudFrasco_Initialized = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Initialized_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtSolicitudFrasco_Sfid_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfid_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfid_Z( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfid_Z");
      gxTv_SdtSolicitudFrasco_Sfid_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfid_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfid_Z = 0 ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtSolicitudFrasco_Sfidnet_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet_Z( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfidnet_Z");
      gxTv_SdtSolicitudFrasco_Sfidnet_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfidnet_Z = 0 ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfidnet_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfnombre_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfnombre_Z");
      gxTv_SdtSolicitudFrasco_Sfnombre_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfnombre_Z = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfnombre_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfdireccion_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfdireccion_Z");
      gxTv_SdtSolicitudFrasco_Sfdireccion_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfdireccion_Z = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfdireccion_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sfagencia_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfagencia_Z");
      gxTv_SdtSolicitudFrasco_Sfagencia_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfagencia_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfagencia_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sftelefono_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sftelefono_Z");
      gxTv_SdtSolicitudFrasco_Sftelefono_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sftelefono_Z = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sftelefono_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfemail_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfemail_Z");
      gxTv_SdtSolicitudFrasco_Sfemail_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfemail_Z = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfemail_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosconc_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosconc_Z");
      gxTv_SdtSolicitudFrasco_Sffrascosconc_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosconc_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosconc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascossinc_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossinc_Z");
      gxTv_SdtSolicitudFrasco_Sffrascossinc_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossinc_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossinc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosagua_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosagua_Z");
      gxTv_SdtSolicitudFrasco_Sffrascosagua_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosagua_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosagua_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascossangre_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossangre_Z");
      gxTv_SdtSolicitudFrasco_Sffrascossangre_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossangre_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossangre_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSolicitudFrasco_Sfobservaciones_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfobservaciones_Z");
      gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = "" ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfobservaciones_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtSolicitudFrasco_Sffechacreacion_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion_Z( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechacreacion_Z");
      gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechacreacion_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtSolicitudFrasco_Sffechamodificado_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado_Z( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechamodificado_Z");
      gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechamodificado_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosisopo_Z");
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfidnet_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfidnet_N");
      gxTv_SdtSolicitudFrasco_Sfidnet_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfidnet_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfidnet_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfnombre_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfnombre_N");
      gxTv_SdtSolicitudFrasco_Sfnombre_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfnombre_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfnombre_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfdireccion_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfdireccion_N");
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfdireccion_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfdireccion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfagencia_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfagencia_N");
      gxTv_SdtSolicitudFrasco_Sfagencia_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfagencia_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfagencia_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sftelefono_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sftelefono_N");
      gxTv_SdtSolicitudFrasco_Sftelefono_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sftelefono_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sftelefono_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfemail_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfemail_N");
      gxTv_SdtSolicitudFrasco_Sfemail_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfemail_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfemail_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffrascosconc_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosconc_N");
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosconc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffrascossinc_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossinc_N");
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossinc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffrascosagua_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosagua_N");
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosagua_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffrascossangre_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascossangre_N");
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascossangre_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sfobservaciones_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sfobservaciones_N");
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sfobservaciones_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffechacreacion_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechacreacion_N");
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechacreacion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffechamodificado_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffechamodificado_N");
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffechamodificado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSolicitudFrasco_Sffrascosisopo_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo_N ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      SetDirty("Sffrascosisopo_N");
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = value ;
   }

   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo_N_SetNull( )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtSolicitudFrasco_Sffrascosisopo_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.solicitudfrasco_bc obj;
      obj = new com.colaveco.solicitudfrasco_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfnombre = "" ;
      gxTv_SdtSolicitudFrasco_Sfdireccion = "" ;
      gxTv_SdtSolicitudFrasco_Sftelefono = "" ;
      gxTv_SdtSolicitudFrasco_Sfemail = "" ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones = "" ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSolicitudFrasco_Sffechamodificado = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSolicitudFrasco_Mode = "" ;
      gxTv_SdtSolicitudFrasco_Sfnombre_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfdireccion_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sftelefono_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfemail_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSolicitudFrasco_N ;
   }

   public com.colaveco.SdtSolicitudFrasco Clone( )
   {
      com.colaveco.SdtSolicitudFrasco sdt;
      com.colaveco.solicitudfrasco_bc obj;
      sdt = (com.colaveco.SdtSolicitudFrasco)(clone()) ;
      obj = (com.colaveco.solicitudfrasco_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtSolicitudFrasco struct )
   {
      setgxTv_SdtSolicitudFrasco_Sfid(struct.getSfid());
      setgxTv_SdtSolicitudFrasco_Sfidnet(struct.getSfidnet());
      setgxTv_SdtSolicitudFrasco_Sfnombre(struct.getSfnombre());
      setgxTv_SdtSolicitudFrasco_Sfdireccion(struct.getSfdireccion());
      setgxTv_SdtSolicitudFrasco_Sfagencia(struct.getSfagencia());
      setgxTv_SdtSolicitudFrasco_Sftelefono(struct.getSftelefono());
      setgxTv_SdtSolicitudFrasco_Sfemail(struct.getSfemail());
      setgxTv_SdtSolicitudFrasco_Sffrascosconc(struct.getSffrascosconc());
      setgxTv_SdtSolicitudFrasco_Sffrascossinc(struct.getSffrascossinc());
      setgxTv_SdtSolicitudFrasco_Sffrascosagua(struct.getSffrascosagua());
      setgxTv_SdtSolicitudFrasco_Sffrascossangre(struct.getSffrascossangre());
      setgxTv_SdtSolicitudFrasco_Sfobservaciones(struct.getSfobservaciones());
      setgxTv_SdtSolicitudFrasco_Sffechacreacion(struct.getSffechacreacion());
      setgxTv_SdtSolicitudFrasco_Sffechamodificado(struct.getSffechamodificado());
      setgxTv_SdtSolicitudFrasco_Sffrascosisopo(struct.getSffrascosisopo());
      setgxTv_SdtSolicitudFrasco_Mode(struct.getMode());
      setgxTv_SdtSolicitudFrasco_Initialized(struct.getInitialized());
      setgxTv_SdtSolicitudFrasco_Sfid_Z(struct.getSfid_Z());
      setgxTv_SdtSolicitudFrasco_Sfidnet_Z(struct.getSfidnet_Z());
      setgxTv_SdtSolicitudFrasco_Sfnombre_Z(struct.getSfnombre_Z());
      setgxTv_SdtSolicitudFrasco_Sfdireccion_Z(struct.getSfdireccion_Z());
      setgxTv_SdtSolicitudFrasco_Sfagencia_Z(struct.getSfagencia_Z());
      setgxTv_SdtSolicitudFrasco_Sftelefono_Z(struct.getSftelefono_Z());
      setgxTv_SdtSolicitudFrasco_Sfemail_Z(struct.getSfemail_Z());
      setgxTv_SdtSolicitudFrasco_Sffrascosconc_Z(struct.getSffrascosconc_Z());
      setgxTv_SdtSolicitudFrasco_Sffrascossinc_Z(struct.getSffrascossinc_Z());
      setgxTv_SdtSolicitudFrasco_Sffrascosagua_Z(struct.getSffrascosagua_Z());
      setgxTv_SdtSolicitudFrasco_Sffrascossangre_Z(struct.getSffrascossangre_Z());
      setgxTv_SdtSolicitudFrasco_Sfobservaciones_Z(struct.getSfobservaciones_Z());
      setgxTv_SdtSolicitudFrasco_Sffechacreacion_Z(struct.getSffechacreacion_Z());
      setgxTv_SdtSolicitudFrasco_Sffechamodificado_Z(struct.getSffechamodificado_Z());
      setgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z(struct.getSffrascosisopo_Z());
      setgxTv_SdtSolicitudFrasco_Sfidnet_N(struct.getSfidnet_N());
      setgxTv_SdtSolicitudFrasco_Sfnombre_N(struct.getSfnombre_N());
      setgxTv_SdtSolicitudFrasco_Sfdireccion_N(struct.getSfdireccion_N());
      setgxTv_SdtSolicitudFrasco_Sfagencia_N(struct.getSfagencia_N());
      setgxTv_SdtSolicitudFrasco_Sftelefono_N(struct.getSftelefono_N());
      setgxTv_SdtSolicitudFrasco_Sfemail_N(struct.getSfemail_N());
      setgxTv_SdtSolicitudFrasco_Sffrascosconc_N(struct.getSffrascosconc_N());
      setgxTv_SdtSolicitudFrasco_Sffrascossinc_N(struct.getSffrascossinc_N());
      setgxTv_SdtSolicitudFrasco_Sffrascosagua_N(struct.getSffrascosagua_N());
      setgxTv_SdtSolicitudFrasco_Sffrascossangre_N(struct.getSffrascossangre_N());
      setgxTv_SdtSolicitudFrasco_Sfobservaciones_N(struct.getSfobservaciones_N());
      setgxTv_SdtSolicitudFrasco_Sffechacreacion_N(struct.getSffechacreacion_N());
      setgxTv_SdtSolicitudFrasco_Sffechamodificado_N(struct.getSffechamodificado_N());
      setgxTv_SdtSolicitudFrasco_Sffrascosisopo_N(struct.getSffrascosisopo_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSolicitudFrasco getStruct( )
   {
      com.colaveco.StructSdtSolicitudFrasco struct = new com.colaveco.StructSdtSolicitudFrasco ();
      struct.setSfid(getgxTv_SdtSolicitudFrasco_Sfid());
      struct.setSfidnet(getgxTv_SdtSolicitudFrasco_Sfidnet());
      struct.setSfnombre(getgxTv_SdtSolicitudFrasco_Sfnombre());
      struct.setSfdireccion(getgxTv_SdtSolicitudFrasco_Sfdireccion());
      struct.setSfagencia(getgxTv_SdtSolicitudFrasco_Sfagencia());
      struct.setSftelefono(getgxTv_SdtSolicitudFrasco_Sftelefono());
      struct.setSfemail(getgxTv_SdtSolicitudFrasco_Sfemail());
      struct.setSffrascosconc(getgxTv_SdtSolicitudFrasco_Sffrascosconc());
      struct.setSffrascossinc(getgxTv_SdtSolicitudFrasco_Sffrascossinc());
      struct.setSffrascosagua(getgxTv_SdtSolicitudFrasco_Sffrascosagua());
      struct.setSffrascossangre(getgxTv_SdtSolicitudFrasco_Sffrascossangre());
      struct.setSfobservaciones(getgxTv_SdtSolicitudFrasco_Sfobservaciones());
      struct.setSffechacreacion(getgxTv_SdtSolicitudFrasco_Sffechacreacion());
      struct.setSffechamodificado(getgxTv_SdtSolicitudFrasco_Sffechamodificado());
      struct.setSffrascosisopo(getgxTv_SdtSolicitudFrasco_Sffrascosisopo());
      struct.setMode(getgxTv_SdtSolicitudFrasco_Mode());
      struct.setInitialized(getgxTv_SdtSolicitudFrasco_Initialized());
      struct.setSfid_Z(getgxTv_SdtSolicitudFrasco_Sfid_Z());
      struct.setSfidnet_Z(getgxTv_SdtSolicitudFrasco_Sfidnet_Z());
      struct.setSfnombre_Z(getgxTv_SdtSolicitudFrasco_Sfnombre_Z());
      struct.setSfdireccion_Z(getgxTv_SdtSolicitudFrasco_Sfdireccion_Z());
      struct.setSfagencia_Z(getgxTv_SdtSolicitudFrasco_Sfagencia_Z());
      struct.setSftelefono_Z(getgxTv_SdtSolicitudFrasco_Sftelefono_Z());
      struct.setSfemail_Z(getgxTv_SdtSolicitudFrasco_Sfemail_Z());
      struct.setSffrascosconc_Z(getgxTv_SdtSolicitudFrasco_Sffrascosconc_Z());
      struct.setSffrascossinc_Z(getgxTv_SdtSolicitudFrasco_Sffrascossinc_Z());
      struct.setSffrascosagua_Z(getgxTv_SdtSolicitudFrasco_Sffrascosagua_Z());
      struct.setSffrascossangre_Z(getgxTv_SdtSolicitudFrasco_Sffrascossangre_Z());
      struct.setSfobservaciones_Z(getgxTv_SdtSolicitudFrasco_Sfobservaciones_Z());
      struct.setSffechacreacion_Z(getgxTv_SdtSolicitudFrasco_Sffechacreacion_Z());
      struct.setSffechamodificado_Z(getgxTv_SdtSolicitudFrasco_Sffechamodificado_Z());
      struct.setSffrascosisopo_Z(getgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z());
      struct.setSfidnet_N(getgxTv_SdtSolicitudFrasco_Sfidnet_N());
      struct.setSfnombre_N(getgxTv_SdtSolicitudFrasco_Sfnombre_N());
      struct.setSfdireccion_N(getgxTv_SdtSolicitudFrasco_Sfdireccion_N());
      struct.setSfagencia_N(getgxTv_SdtSolicitudFrasco_Sfagencia_N());
      struct.setSftelefono_N(getgxTv_SdtSolicitudFrasco_Sftelefono_N());
      struct.setSfemail_N(getgxTv_SdtSolicitudFrasco_Sfemail_N());
      struct.setSffrascosconc_N(getgxTv_SdtSolicitudFrasco_Sffrascosconc_N());
      struct.setSffrascossinc_N(getgxTv_SdtSolicitudFrasco_Sffrascossinc_N());
      struct.setSffrascosagua_N(getgxTv_SdtSolicitudFrasco_Sffrascosagua_N());
      struct.setSffrascossangre_N(getgxTv_SdtSolicitudFrasco_Sffrascossangre_N());
      struct.setSfobservaciones_N(getgxTv_SdtSolicitudFrasco_Sfobservaciones_N());
      struct.setSffechacreacion_N(getgxTv_SdtSolicitudFrasco_Sffechacreacion_N());
      struct.setSffechamodificado_N(getgxTv_SdtSolicitudFrasco_Sffechamodificado_N());
      struct.setSffrascosisopo_N(getgxTv_SdtSolicitudFrasco_Sffrascosisopo_N());
      return struct ;
   }

   private byte gxTv_SdtSolicitudFrasco_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfidnet_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfnombre_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfdireccion_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfagencia_N ;
   private byte gxTv_SdtSolicitudFrasco_Sftelefono_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfemail_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffrascosconc_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffrascossinc_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffrascosagua_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffrascossangre_N ;
   private byte gxTv_SdtSolicitudFrasco_Sfobservaciones_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffechacreacion_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffechamodificado_N ;
   private byte gxTv_SdtSolicitudFrasco_Sffrascosisopo_N ;
   private short gxTv_SdtSolicitudFrasco_Sfagencia ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosconc ;
   private short gxTv_SdtSolicitudFrasco_Sffrascossinc ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosagua ;
   private short gxTv_SdtSolicitudFrasco_Sffrascossangre ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosisopo ;
   private short gxTv_SdtSolicitudFrasco_Initialized ;
   private short gxTv_SdtSolicitudFrasco_Sfagencia_Z ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosconc_Z ;
   private short gxTv_SdtSolicitudFrasco_Sffrascossinc_Z ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosagua_Z ;
   private short gxTv_SdtSolicitudFrasco_Sffrascossangre_Z ;
   private short gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtSolicitudFrasco_Sfid ;
   private long gxTv_SdtSolicitudFrasco_Sfidnet ;
   private long gxTv_SdtSolicitudFrasco_Sfid_Z ;
   private long gxTv_SdtSolicitudFrasco_Sfidnet_Z ;
   private String gxTv_SdtSolicitudFrasco_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtSolicitudFrasco_Sffechacreacion ;
   private java.util.Date gxTv_SdtSolicitudFrasco_Sffechamodificado ;
   private java.util.Date gxTv_SdtSolicitudFrasco_Sffechacreacion_Z ;
   private java.util.Date gxTv_SdtSolicitudFrasco_Sffechamodificado_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtSolicitudFrasco_Sfnombre ;
   private String gxTv_SdtSolicitudFrasco_Sfdireccion ;
   private String gxTv_SdtSolicitudFrasco_Sftelefono ;
   private String gxTv_SdtSolicitudFrasco_Sfemail ;
   private String gxTv_SdtSolicitudFrasco_Sfobservaciones ;
   private String gxTv_SdtSolicitudFrasco_Sfnombre_Z ;
   private String gxTv_SdtSolicitudFrasco_Sfdireccion_Z ;
   private String gxTv_SdtSolicitudFrasco_Sftelefono_Z ;
   private String gxTv_SdtSolicitudFrasco_Sfemail_Z ;
   private String gxTv_SdtSolicitudFrasco_Sfobservaciones_Z ;
}

