package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.class));
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( int remoteHandle ,
                                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFId") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFIdNet") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFNombre") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFDireccion") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFAgencia") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFTelefono") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFEmail") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosConC") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSinC") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosAgua") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFFrascosSangre") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFObservaciones") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones = oReader.getValue() ;
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
                  gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
                  gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt" ;
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
      oWriter.writeElement("SFId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFIdNet", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFNombre", GXutil.rtrim( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFDireccion", GXutil.rtrim( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFAgencia", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFTelefono", GXutil.rtrim( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFEmail", GXutil.rtrim( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFFrascosConC", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFFrascosSinC", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFFrascosAgua", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFFrascosSangre", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFObservaciones", GXutil.rtrim( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("SFFechaCreacion", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("SFFechaModificado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFFrascosIsopo", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo, 4, 0)));
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
      AddObjectProperty("SFId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid, 18, 0)), false, false);
      AddObjectProperty("SFIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet, 18, 0)), false, false);
      AddObjectProperty("SFNombre", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre, false, false);
      AddObjectProperty("SFDireccion", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion, false, false);
      AddObjectProperty("SFAgencia", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia, false, false);
      AddObjectProperty("SFTelefono", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono, false, false);
      AddObjectProperty("SFEmail", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail, false, false);
      AddObjectProperty("SFFrascosConC", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc, false, false);
      AddObjectProperty("SFFrascosSinC", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc, false, false);
      AddObjectProperty("SFFrascosAgua", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua, false, false);
      AddObjectProperty("SFFrascosSangre", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre, false, false);
      AddObjectProperty("SFObservaciones", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones, false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion ;
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
      AddObjectProperty("SFFechaCreacion", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado ;
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
      AddObjectProperty("SFFechaModificado", sDateCnv, false, false);
      AddObjectProperty("SFFrascosIsopo", gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet = value ;
   }

   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre = value ;
   }

   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia = value ;
   }

   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono = value ;
   }

   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre = value ;
   }

   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = value ;
   }

   public short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt struct )
   {
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid(struct.getSfid());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet(struct.getSfidnet());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre(struct.getSfnombre());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion(struct.getSfdireccion());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia(struct.getSfagencia());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono(struct.getSftelefono());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail(struct.getSfemail());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc(struct.getSffrascosconc());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc(struct.getSffrascossinc());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua(struct.getSffrascosagua());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre(struct.getSffrascossangre());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones(struct.getSfobservaciones());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion(struct.getSffechacreacion());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado(struct.getSffechamodificado());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo(struct.getSffrascosisopo());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt struct = new com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt ();
      struct.setSfid(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid());
      struct.setSfidnet(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet());
      struct.setSfnombre(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre());
      struct.setSfdireccion(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion());
      struct.setSfagencia(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia());
      struct.setSftelefono(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono());
      struct.setSfemail(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail());
      struct.setSffrascosconc(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc());
      struct.setSffrascossinc(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc());
      struct.setSffrascosagua(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua());
      struct.setSffrascossangre(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre());
      struct.setSfobservaciones(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones());
      struct.setSffechacreacion(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion());
      struct.setSffechamodificado(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado());
      struct.setSffrascosisopo(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion ;
   protected java.util.Date gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones ;
}

