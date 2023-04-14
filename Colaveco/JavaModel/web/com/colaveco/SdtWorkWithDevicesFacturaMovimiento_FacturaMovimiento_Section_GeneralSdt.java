package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.class));
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( int remoteHandle ,
                                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMId") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdNetMovimiento") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaEmision") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaVencimiento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipo") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMNumero") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMDetalle") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImporte") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdUsuarioNet") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipoMovimiento") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImportePago") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMSaldoActual") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMPathPdf") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf = oReader.getValue() ;
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
         sName = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt" ;
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
      oWriter.writeElement("FMId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMIdNetMovimiento", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaVencimiento", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMTipo", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMNumero", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMDetalle", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMImporte", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMIdUsuarioNet", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMTipoMovimiento", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMImportePago", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMSaldoActual", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMPathPdf", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf));
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
      AddObjectProperty("FMId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid, 18, 0)), false, false);
      AddObjectProperty("FMIdNetMovimiento", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento, 18, 0)), false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision ;
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
      AddObjectProperty("FMFechaEmision", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento ;
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
      AddObjectProperty("FMFechaVencimiento", sDateCnv, false, false);
      AddObjectProperty("FMTipo", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo, false, false);
      AddObjectProperty("FMNumero", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero, 18, 0)), false, false);
      AddObjectProperty("FMDetalle", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle, false, false);
      AddObjectProperty("FMImporte", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte, 18, 0)), false, false);
      AddObjectProperty("FMIdUsuarioNet", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet, 18, 0)), false, false);
      AddObjectProperty("FMTipoMovimiento", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento, 18, 0)), false, false);
      AddObjectProperty("FMImportePago", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago, 18, 0)), false, false);
      AddObjectProperty("FMSaldoActual", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual, 18, 0)), false, false);
      AddObjectProperty("FMPathPdf", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt struct )
   {
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid(struct.getFmid());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento(struct.getFmidnetmovimiento());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision(struct.getFmfechaemision());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento(struct.getFmfechavencimiento());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo(struct.getFmtipo());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero(struct.getFmnumero());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle(struct.getFmdetalle());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte(struct.getFmimporte());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet(struct.getFmidusuarionet());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento(struct.getFmtipomovimiento());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago(struct.getFmimportepago());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual(struct.getFmsaldoactual());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf(struct.getFmpathpdf());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt struct = new com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt ();
      struct.setFmid(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid());
      struct.setFmidnetmovimiento(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento());
      struct.setFmfechaemision(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision());
      struct.setFmfechavencimiento(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento());
      struct.setFmtipo(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo());
      struct.setFmnumero(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero());
      struct.setFmdetalle(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle());
      struct.setFmimporte(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte());
      struct.setFmidusuarionet(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet());
      struct.setFmtipomovimiento(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento());
      struct.setFmimportepago(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago());
      struct.setFmsaldoactual(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual());
      struct.setFmpathpdf(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf ;
}

