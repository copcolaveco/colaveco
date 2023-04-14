package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item.class));
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item( int remoteHandle ,
                                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item struct )
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
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImporte") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMDetalle") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMNumero") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMPathPdf") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf = oReader.getValue() ;
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
         sName = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.Item" ;
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
      oWriter.writeElement("FMId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaVencimiento", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMTipo", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMImporte", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMDetalle", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMNumero", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMPathPdf", GXutil.rtrim( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf));
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
      AddObjectProperty("FMId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid, 18, 0)), false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision ;
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
      datetime_STZ = gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento ;
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
      AddObjectProperty("FMTipo", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo, false, false);
      AddObjectProperty("FMImporte", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte, 18, 0)), false, false);
      AddObjectProperty("FMDetalle", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle, false, false);
      AddObjectProperty("FMNumero", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero, 18, 0)), false, false);
      AddObjectProperty("FMPathPdf", gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero = value ;
   }

   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item struct )
   {
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid(struct.getFmid());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision(struct.getFmfechaemision());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento(struct.getFmfechavencimiento());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo(struct.getFmtipo());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte(struct.getFmimporte());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle(struct.getFmdetalle());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero(struct.getFmnumero());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf(struct.getFmpathpdf());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item struct = new com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item ();
      struct.setFmid(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid());
      struct.setFmfechaemision(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision());
      struct.setFmfechavencimiento(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento());
      struct.setFmtipo(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo());
      struct.setFmimporte(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte());
      struct.setFmdetalle(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle());
      struct.setFmnumero(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero());
      struct.setFmpathpdf(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf ;
}

