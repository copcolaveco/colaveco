package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFacturaMovimiento extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtFacturaMovimiento( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtFacturaMovimiento.class));
   }

   public SdtFacturaMovimiento( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtFacturaMovimiento");
      initialize( remoteHandle) ;
   }

   public SdtFacturaMovimiento( int remoteHandle ,
                                StructSdtFacturaMovimiento struct )
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

   public void Load( long AV2FMId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV2FMId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"FMId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "FacturaMovimiento");
      metadata.set("BT", "FacturaMovimiento");
      metadata.set("PK", "[ \"FMId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMId") )
            {
               gxTv_SdtFacturaMovimiento_Fmid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdNetMovimiento") )
            {
               gxTv_SdtFacturaMovimiento_Fmidnetmovimiento = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtFacturaMovimiento_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtFacturaMovimiento_Fmfechaemision = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
                  gxTv_SdtFacturaMovimiento_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtFacturaMovimiento_Fmfechavencimiento = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtFacturaMovimiento_Fmtipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMNumero") )
            {
               gxTv_SdtFacturaMovimiento_Fmnumero = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMDetalle") )
            {
               gxTv_SdtFacturaMovimiento_Fmdetalle = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImporte") )
            {
               gxTv_SdtFacturaMovimiento_Fmimporte = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdUsuarioNet") )
            {
               gxTv_SdtFacturaMovimiento_Fmidusuarionet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipoMovimiento") )
            {
               gxTv_SdtFacturaMovimiento_Fmtipomovimiento = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImportePago") )
            {
               gxTv_SdtFacturaMovimiento_Fmimportepago = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMPathPdf") )
            {
               gxTv_SdtFacturaMovimiento_Fmpathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMSaldoActual") )
            {
               gxTv_SdtFacturaMovimiento_Fmsaldoactual = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtFacturaMovimiento_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtFacturaMovimiento_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMId_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdNetMovimiento_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaEmision_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaVencimiento_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipo_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmtipo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMNumero_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmnumero_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMDetalle_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmdetalle_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImporte_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmimporte_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdUsuarioNet_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipoMovimiento_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImportePago_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmimportepago_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMPathPdf_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMSaldoActual_Z") )
            {
               gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdNetMovimiento_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaEmision_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMFechaVencimiento_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipo_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMNumero_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMDetalle_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImporte_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMIdUsuarioNet_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMTipoMovimiento_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMImportePago_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMPathPdf_N") )
            {
               gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "FacturaMovimiento" ;
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
      oWriter.writeElement("FMId", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMIdNetMovimiento", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidnetmovimiento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtFacturaMovimiento_Fmfechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtFacturaMovimiento_Fmfechavencimiento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("FMFechaVencimiento", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMTipo", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmtipo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMNumero", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmnumero, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMDetalle", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmdetalle));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMImporte", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimporte, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMIdUsuarioNet", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidusuarionet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMTipoMovimiento", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipomovimiento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMImportePago", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimportepago, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMPathPdf", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmpathpdf));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("FMSaldoActual", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmsaldoactual, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMId_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMIdNetMovimiento_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtFacturaMovimiento_Fmfechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FMFechaEmision_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FMFechaVencimiento_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMTipo_Z", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmtipo_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMNumero_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmnumero_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMDetalle_Z", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmdetalle_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMImporte_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimporte_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMIdUsuarioNet_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMTipoMovimiento_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMImportePago_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimportepago_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMPathPdf_Z", GXutil.rtrim( gxTv_SdtFacturaMovimiento_Fmpathpdf_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMSaldoActual_Z", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMIdNetMovimiento_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMFechaEmision_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmfechaemision_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMFechaVencimiento_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMTipo_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMNumero_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmnumero_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMDetalle_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmdetalle_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMImporte_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimporte_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMIdUsuarioNet_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidusuarionet_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMTipoMovimiento_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMImportePago_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimportepago_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("FMPathPdf_N", GXutil.trim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmpathpdf_N, 1, 0)));
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
      AddObjectProperty("FMId", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMIdNetMovimiento", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidnetmovimiento, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMIdNetMovimiento_N", gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtFacturaMovimiento_Fmfechaemision ;
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
      AddObjectProperty("FMFechaEmision", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("FMFechaEmision_N", gxTv_SdtFacturaMovimiento_Fmfechaemision_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtFacturaMovimiento_Fmfechavencimiento ;
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
      AddObjectProperty("FMFechaVencimiento", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("FMFechaVencimiento_N", gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N, false, includeNonInitialized);
      AddObjectProperty("FMTipo", gxTv_SdtFacturaMovimiento_Fmtipo, false, includeNonInitialized);
      AddObjectProperty("FMTipo_N", gxTv_SdtFacturaMovimiento_Fmtipo_N, false, includeNonInitialized);
      AddObjectProperty("FMNumero", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmnumero, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMNumero_N", gxTv_SdtFacturaMovimiento_Fmnumero_N, false, includeNonInitialized);
      AddObjectProperty("FMDetalle", gxTv_SdtFacturaMovimiento_Fmdetalle, false, includeNonInitialized);
      AddObjectProperty("FMDetalle_N", gxTv_SdtFacturaMovimiento_Fmdetalle_N, false, includeNonInitialized);
      AddObjectProperty("FMImporte", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimporte, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMImporte_N", gxTv_SdtFacturaMovimiento_Fmimporte_N, false, includeNonInitialized);
      AddObjectProperty("FMIdUsuarioNet", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidusuarionet, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMIdUsuarioNet_N", gxTv_SdtFacturaMovimiento_Fmidusuarionet_N, false, includeNonInitialized);
      AddObjectProperty("FMTipoMovimiento", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipomovimiento, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMTipoMovimiento_N", gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N, false, includeNonInitialized);
      AddObjectProperty("FMImportePago", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimportepago, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("FMImportePago_N", gxTv_SdtFacturaMovimiento_Fmimportepago_N, false, includeNonInitialized);
      AddObjectProperty("FMPathPdf", gxTv_SdtFacturaMovimiento_Fmpathpdf, false, includeNonInitialized);
      AddObjectProperty("FMPathPdf_N", gxTv_SdtFacturaMovimiento_Fmpathpdf_N, false, includeNonInitialized);
      AddObjectProperty("FMSaldoActual", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmsaldoactual, 18, 0)), false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtFacturaMovimiento_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtFacturaMovimiento_Initialized, false, includeNonInitialized);
         AddObjectProperty("FMId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMIdNetMovimiento_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z, 18, 0)), false, includeNonInitialized);
         datetime_STZ = gxTv_SdtFacturaMovimiento_Fmfechaemision_Z ;
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
         AddObjectProperty("FMFechaEmision_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z ;
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
         AddObjectProperty("FMFechaVencimiento_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("FMTipo_Z", gxTv_SdtFacturaMovimiento_Fmtipo_Z, false, includeNonInitialized);
         AddObjectProperty("FMNumero_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmnumero_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMDetalle_Z", gxTv_SdtFacturaMovimiento_Fmdetalle_Z, false, includeNonInitialized);
         AddObjectProperty("FMImporte_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimporte_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMIdUsuarioNet_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMTipoMovimiento_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMImportePago_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmimportepago_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMPathPdf_Z", gxTv_SdtFacturaMovimiento_Fmpathpdf_Z, false, includeNonInitialized);
         AddObjectProperty("FMSaldoActual_Z", GXutil.ltrim( GXutil.str( gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("FMIdNetMovimiento_N", gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N, false, includeNonInitialized);
         AddObjectProperty("FMFechaEmision_N", gxTv_SdtFacturaMovimiento_Fmfechaemision_N, false, includeNonInitialized);
         AddObjectProperty("FMFechaVencimiento_N", gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N, false, includeNonInitialized);
         AddObjectProperty("FMTipo_N", gxTv_SdtFacturaMovimiento_Fmtipo_N, false, includeNonInitialized);
         AddObjectProperty("FMNumero_N", gxTv_SdtFacturaMovimiento_Fmnumero_N, false, includeNonInitialized);
         AddObjectProperty("FMDetalle_N", gxTv_SdtFacturaMovimiento_Fmdetalle_N, false, includeNonInitialized);
         AddObjectProperty("FMImporte_N", gxTv_SdtFacturaMovimiento_Fmimporte_N, false, includeNonInitialized);
         AddObjectProperty("FMIdUsuarioNet_N", gxTv_SdtFacturaMovimiento_Fmidusuarionet_N, false, includeNonInitialized);
         AddObjectProperty("FMTipoMovimiento_N", gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N, false, includeNonInitialized);
         AddObjectProperty("FMImportePago_N", gxTv_SdtFacturaMovimiento_Fmimportepago_N, false, includeNonInitialized);
         AddObjectProperty("FMPathPdf_N", gxTv_SdtFacturaMovimiento_Fmpathpdf_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtFacturaMovimiento sdt )
   {
      if ( sdt.IsDirty("FMId") )
      {
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmid = sdt.getgxTv_SdtFacturaMovimiento_Fmid() ;
      }
      if ( sdt.IsDirty("FMIdNetMovimiento") )
      {
         gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmidnetmovimiento = sdt.getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento() ;
      }
      if ( sdt.IsDirty("FMFechaEmision") )
      {
         gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmfechaemision = sdt.getgxTv_SdtFacturaMovimiento_Fmfechaemision() ;
      }
      if ( sdt.IsDirty("FMFechaVencimiento") )
      {
         gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmfechavencimiento = sdt.getgxTv_SdtFacturaMovimiento_Fmfechavencimiento() ;
      }
      if ( sdt.IsDirty("FMTipo") )
      {
         gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmtipo = sdt.getgxTv_SdtFacturaMovimiento_Fmtipo() ;
      }
      if ( sdt.IsDirty("FMNumero") )
      {
         gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmnumero = sdt.getgxTv_SdtFacturaMovimiento_Fmnumero() ;
      }
      if ( sdt.IsDirty("FMDetalle") )
      {
         gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmdetalle = sdt.getgxTv_SdtFacturaMovimiento_Fmdetalle() ;
      }
      if ( sdt.IsDirty("FMImporte") )
      {
         gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmimporte = sdt.getgxTv_SdtFacturaMovimiento_Fmimporte() ;
      }
      if ( sdt.IsDirty("FMIdUsuarioNet") )
      {
         gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmidusuarionet = sdt.getgxTv_SdtFacturaMovimiento_Fmidusuarionet() ;
      }
      if ( sdt.IsDirty("FMTipoMovimiento") )
      {
         gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmtipomovimiento = sdt.getgxTv_SdtFacturaMovimiento_Fmtipomovimiento() ;
      }
      if ( sdt.IsDirty("FMImportePago") )
      {
         gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmimportepago = sdt.getgxTv_SdtFacturaMovimiento_Fmimportepago() ;
      }
      if ( sdt.IsDirty("FMPathPdf") )
      {
         gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmpathpdf = sdt.getgxTv_SdtFacturaMovimiento_Fmpathpdf() ;
      }
      if ( sdt.IsDirty("FMSaldoActual") )
      {
         gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
         gxTv_SdtFacturaMovimiento_Fmsaldoactual = sdt.getgxTv_SdtFacturaMovimiento_Fmsaldoactual() ;
      }
   }

   public long getgxTv_SdtFacturaMovimiento_Fmid( )
   {
      return gxTv_SdtFacturaMovimiento_Fmid ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmid( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      if ( gxTv_SdtFacturaMovimiento_Fmid != value )
      {
         gxTv_SdtFacturaMovimiento_Mode = "INS" ;
         this.setgxTv_SdtFacturaMovimiento_Fmid_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmfechaemision_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmtipo_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmnumero_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmdetalle_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmimporte_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmimportepago_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmpathpdf_Z_SetNull( );
         this.setgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z_SetNull( );
      }
      SetDirty("Fmid");
      gxTv_SdtFacturaMovimiento_Fmid = value ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidnetmovimiento");
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N==1) ;
   }

   public java.util.Date getgxTv_SdtFacturaMovimiento_Fmfechaemision( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechaemision");
      gxTv_SdtFacturaMovimiento_Fmfechaemision = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechaemision_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmfechaemision_N==1) ;
   }

   public java.util.Date getgxTv_SdtFacturaMovimiento_Fmfechavencimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechavencimiento");
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N==1) ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmtipo( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipo");
      gxTv_SdtFacturaMovimiento_Fmtipo = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmtipo = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipo_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmtipo_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmnumero( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmnumero");
      gxTv_SdtFacturaMovimiento_Fmnumero = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmnumero = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmnumero_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmnumero_N==1) ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmdetalle( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmdetalle");
      gxTv_SdtFacturaMovimiento_Fmdetalle = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmdetalle = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmdetalle_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmdetalle_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmimporte( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimporte");
      gxTv_SdtFacturaMovimiento_Fmimporte = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmimporte = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimporte_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmimporte_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmidusuarionet( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidusuarionet");
      gxTv_SdtFacturaMovimiento_Fmidusuarionet = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmidusuarionet = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidusuarionet_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmidusuarionet_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmtipomovimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipomovimiento");
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmimportepago( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimportepago");
      gxTv_SdtFacturaMovimiento_Fmimportepago = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmimportepago = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimportepago_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmimportepago_N==1) ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmpathpdf( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmpathpdf");
      gxTv_SdtFacturaMovimiento_Fmpathpdf = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmpathpdf_IsNull( )
   {
      return (gxTv_SdtFacturaMovimiento_Fmpathpdf_N==1) ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmsaldoactual( )
   {
      return gxTv_SdtFacturaMovimiento_Fmsaldoactual ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmsaldoactual( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmsaldoactual");
      gxTv_SdtFacturaMovimiento_Fmsaldoactual = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmsaldoactual_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmsaldoactual = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmsaldoactual_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtFacturaMovimiento_Mode( )
   {
      return gxTv_SdtFacturaMovimiento_Mode ;
   }

   public void setgxTv_SdtFacturaMovimiento_Mode( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtFacturaMovimiento_Mode = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Mode_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Mode = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtFacturaMovimiento_Initialized( )
   {
      return gxTv_SdtFacturaMovimiento_Initialized ;
   }

   public void setgxTv_SdtFacturaMovimiento_Initialized( short value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtFacturaMovimiento_Initialized = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Initialized_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmid_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmid_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmid_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmid_Z");
      gxTv_SdtFacturaMovimiento_Fmid_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmid_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmid_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidnetmovimiento_Z");
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtFacturaMovimiento_Fmfechaemision_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision_Z( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechaemision_Z");
      gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechaemision_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechavencimiento_Z");
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmtipo_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipo_Z");
      gxTv_SdtFacturaMovimiento_Fmtipo_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipo_Z = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipo_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmnumero_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmnumero_Z");
      gxTv_SdtFacturaMovimiento_Fmnumero_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmnumero_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmnumero_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmdetalle_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmdetalle_Z");
      gxTv_SdtFacturaMovimiento_Fmdetalle_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmdetalle_Z = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmdetalle_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmimporte_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimporte_Z");
      gxTv_SdtFacturaMovimiento_Fmimporte_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimporte_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimporte_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidusuarionet_Z");
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipomovimiento_Z");
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmimportepago_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimportepago_Z");
      gxTv_SdtFacturaMovimiento_Fmimportepago_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimportepago_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimportepago_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtFacturaMovimiento_Fmpathpdf_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmpathpdf_Z");
      gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = "" ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmpathpdf_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmsaldoactual_Z");
      gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z = 0 ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidnetmovimiento_N");
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmfechaemision_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechaemision_N");
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechaemision_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmfechavencimiento_N");
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmtipo_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipo_N");
      gxTv_SdtFacturaMovimiento_Fmtipo_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipo_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmnumero_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmnumero_N");
      gxTv_SdtFacturaMovimiento_Fmnumero_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmnumero_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmnumero_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmdetalle_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmdetalle_N");
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmdetalle_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmdetalle_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmimporte_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimporte_N");
      gxTv_SdtFacturaMovimiento_Fmimporte_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimporte_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimporte_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmidusuarionet_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmidusuarionet_N");
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmidusuarionet_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmtipomovimiento_N");
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmimportepago_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmimportepago_N");
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmimportepago_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmimportepago_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtFacturaMovimiento_Fmpathpdf_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf_N ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      SetDirty("Fmpathpdf_N");
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = value ;
   }

   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf_N_SetNull( )
   {
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtFacturaMovimiento_Fmpathpdf_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.facturamovimiento_bc obj;
      obj = new com.colaveco.facturamovimiento_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtFacturaMovimiento_Fmtipo = "" ;
      gxTv_SdtFacturaMovimiento_Fmdetalle = "" ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf = "" ;
      gxTv_SdtFacturaMovimiento_Mode = "" ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtFacturaMovimiento_Fmtipo_Z = "" ;
      gxTv_SdtFacturaMovimiento_Fmdetalle_Z = "" ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtFacturaMovimiento_N ;
   }

   public com.colaveco.SdtFacturaMovimiento Clone( )
   {
      com.colaveco.SdtFacturaMovimiento sdt;
      com.colaveco.facturamovimiento_bc obj;
      sdt = (com.colaveco.SdtFacturaMovimiento)(clone()) ;
      obj = (com.colaveco.facturamovimiento_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtFacturaMovimiento struct )
   {
      setgxTv_SdtFacturaMovimiento_Fmid(struct.getFmid());
      setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento(struct.getFmidnetmovimiento());
      setgxTv_SdtFacturaMovimiento_Fmfechaemision(struct.getFmfechaemision());
      setgxTv_SdtFacturaMovimiento_Fmfechavencimiento(struct.getFmfechavencimiento());
      setgxTv_SdtFacturaMovimiento_Fmtipo(struct.getFmtipo());
      setgxTv_SdtFacturaMovimiento_Fmnumero(struct.getFmnumero());
      setgxTv_SdtFacturaMovimiento_Fmdetalle(struct.getFmdetalle());
      setgxTv_SdtFacturaMovimiento_Fmimporte(struct.getFmimporte());
      setgxTv_SdtFacturaMovimiento_Fmidusuarionet(struct.getFmidusuarionet());
      setgxTv_SdtFacturaMovimiento_Fmtipomovimiento(struct.getFmtipomovimiento());
      setgxTv_SdtFacturaMovimiento_Fmimportepago(struct.getFmimportepago());
      setgxTv_SdtFacturaMovimiento_Fmpathpdf(struct.getFmpathpdf());
      setgxTv_SdtFacturaMovimiento_Fmsaldoactual(struct.getFmsaldoactual());
      setgxTv_SdtFacturaMovimiento_Mode(struct.getMode());
      setgxTv_SdtFacturaMovimiento_Initialized(struct.getInitialized());
      setgxTv_SdtFacturaMovimiento_Fmid_Z(struct.getFmid_Z());
      setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z(struct.getFmidnetmovimiento_Z());
      setgxTv_SdtFacturaMovimiento_Fmfechaemision_Z(struct.getFmfechaemision_Z());
      setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z(struct.getFmfechavencimiento_Z());
      setgxTv_SdtFacturaMovimiento_Fmtipo_Z(struct.getFmtipo_Z());
      setgxTv_SdtFacturaMovimiento_Fmnumero_Z(struct.getFmnumero_Z());
      setgxTv_SdtFacturaMovimiento_Fmdetalle_Z(struct.getFmdetalle_Z());
      setgxTv_SdtFacturaMovimiento_Fmimporte_Z(struct.getFmimporte_Z());
      setgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z(struct.getFmidusuarionet_Z());
      setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z(struct.getFmtipomovimiento_Z());
      setgxTv_SdtFacturaMovimiento_Fmimportepago_Z(struct.getFmimportepago_Z());
      setgxTv_SdtFacturaMovimiento_Fmpathpdf_Z(struct.getFmpathpdf_Z());
      setgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z(struct.getFmsaldoactual_Z());
      setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N(struct.getFmidnetmovimiento_N());
      setgxTv_SdtFacturaMovimiento_Fmfechaemision_N(struct.getFmfechaemision_N());
      setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N(struct.getFmfechavencimiento_N());
      setgxTv_SdtFacturaMovimiento_Fmtipo_N(struct.getFmtipo_N());
      setgxTv_SdtFacturaMovimiento_Fmnumero_N(struct.getFmnumero_N());
      setgxTv_SdtFacturaMovimiento_Fmdetalle_N(struct.getFmdetalle_N());
      setgxTv_SdtFacturaMovimiento_Fmimporte_N(struct.getFmimporte_N());
      setgxTv_SdtFacturaMovimiento_Fmidusuarionet_N(struct.getFmidusuarionet_N());
      setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N(struct.getFmtipomovimiento_N());
      setgxTv_SdtFacturaMovimiento_Fmimportepago_N(struct.getFmimportepago_N());
      setgxTv_SdtFacturaMovimiento_Fmpathpdf_N(struct.getFmpathpdf_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtFacturaMovimiento getStruct( )
   {
      com.colaveco.StructSdtFacturaMovimiento struct = new com.colaveco.StructSdtFacturaMovimiento ();
      struct.setFmid(getgxTv_SdtFacturaMovimiento_Fmid());
      struct.setFmidnetmovimiento(getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento());
      struct.setFmfechaemision(getgxTv_SdtFacturaMovimiento_Fmfechaemision());
      struct.setFmfechavencimiento(getgxTv_SdtFacturaMovimiento_Fmfechavencimiento());
      struct.setFmtipo(getgxTv_SdtFacturaMovimiento_Fmtipo());
      struct.setFmnumero(getgxTv_SdtFacturaMovimiento_Fmnumero());
      struct.setFmdetalle(getgxTv_SdtFacturaMovimiento_Fmdetalle());
      struct.setFmimporte(getgxTv_SdtFacturaMovimiento_Fmimporte());
      struct.setFmidusuarionet(getgxTv_SdtFacturaMovimiento_Fmidusuarionet());
      struct.setFmtipomovimiento(getgxTv_SdtFacturaMovimiento_Fmtipomovimiento());
      struct.setFmimportepago(getgxTv_SdtFacturaMovimiento_Fmimportepago());
      struct.setFmpathpdf(getgxTv_SdtFacturaMovimiento_Fmpathpdf());
      struct.setFmsaldoactual(getgxTv_SdtFacturaMovimiento_Fmsaldoactual());
      struct.setMode(getgxTv_SdtFacturaMovimiento_Mode());
      struct.setInitialized(getgxTv_SdtFacturaMovimiento_Initialized());
      struct.setFmid_Z(getgxTv_SdtFacturaMovimiento_Fmid_Z());
      struct.setFmidnetmovimiento_Z(getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z());
      struct.setFmfechaemision_Z(getgxTv_SdtFacturaMovimiento_Fmfechaemision_Z());
      struct.setFmfechavencimiento_Z(getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z());
      struct.setFmtipo_Z(getgxTv_SdtFacturaMovimiento_Fmtipo_Z());
      struct.setFmnumero_Z(getgxTv_SdtFacturaMovimiento_Fmnumero_Z());
      struct.setFmdetalle_Z(getgxTv_SdtFacturaMovimiento_Fmdetalle_Z());
      struct.setFmimporte_Z(getgxTv_SdtFacturaMovimiento_Fmimporte_Z());
      struct.setFmidusuarionet_Z(getgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z());
      struct.setFmtipomovimiento_Z(getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z());
      struct.setFmimportepago_Z(getgxTv_SdtFacturaMovimiento_Fmimportepago_Z());
      struct.setFmpathpdf_Z(getgxTv_SdtFacturaMovimiento_Fmpathpdf_Z());
      struct.setFmsaldoactual_Z(getgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z());
      struct.setFmidnetmovimiento_N(getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N());
      struct.setFmfechaemision_N(getgxTv_SdtFacturaMovimiento_Fmfechaemision_N());
      struct.setFmfechavencimiento_N(getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N());
      struct.setFmtipo_N(getgxTv_SdtFacturaMovimiento_Fmtipo_N());
      struct.setFmnumero_N(getgxTv_SdtFacturaMovimiento_Fmnumero_N());
      struct.setFmdetalle_N(getgxTv_SdtFacturaMovimiento_Fmdetalle_N());
      struct.setFmimporte_N(getgxTv_SdtFacturaMovimiento_Fmimporte_N());
      struct.setFmidusuarionet_N(getgxTv_SdtFacturaMovimiento_Fmidusuarionet_N());
      struct.setFmtipomovimiento_N(getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N());
      struct.setFmimportepago_N(getgxTv_SdtFacturaMovimiento_Fmimportepago_N());
      struct.setFmpathpdf_N(getgxTv_SdtFacturaMovimiento_Fmpathpdf_N());
      return struct ;
   }

   private byte gxTv_SdtFacturaMovimiento_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmfechaemision_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmtipo_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmnumero_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmdetalle_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmimporte_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmidusuarionet_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmimportepago_N ;
   private byte gxTv_SdtFacturaMovimiento_Fmpathpdf_N ;
   private short gxTv_SdtFacturaMovimiento_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtFacturaMovimiento_Fmid ;
   private long gxTv_SdtFacturaMovimiento_Fmidnetmovimiento ;
   private long gxTv_SdtFacturaMovimiento_Fmnumero ;
   private long gxTv_SdtFacturaMovimiento_Fmimporte ;
   private long gxTv_SdtFacturaMovimiento_Fmidusuarionet ;
   private long gxTv_SdtFacturaMovimiento_Fmtipomovimiento ;
   private long gxTv_SdtFacturaMovimiento_Fmimportepago ;
   private long gxTv_SdtFacturaMovimiento_Fmsaldoactual ;
   private long gxTv_SdtFacturaMovimiento_Fmid_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmnumero_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmimporte_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmimportepago_Z ;
   private long gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z ;
   private String gxTv_SdtFacturaMovimiento_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtFacturaMovimiento_Fmfechaemision ;
   private java.util.Date gxTv_SdtFacturaMovimiento_Fmfechavencimiento ;
   private java.util.Date gxTv_SdtFacturaMovimiento_Fmfechaemision_Z ;
   private java.util.Date gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtFacturaMovimiento_Fmtipo ;
   private String gxTv_SdtFacturaMovimiento_Fmdetalle ;
   private String gxTv_SdtFacturaMovimiento_Fmpathpdf ;
   private String gxTv_SdtFacturaMovimiento_Fmtipo_Z ;
   private String gxTv_SdtFacturaMovimiento_Fmdetalle_Z ;
   private String gxTv_SdtFacturaMovimiento_Fmpathpdf_Z ;
}

