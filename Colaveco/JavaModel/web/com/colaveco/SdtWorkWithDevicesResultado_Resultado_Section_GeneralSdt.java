package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt.class));
   }

   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( int remoteHandle ,
                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "WorkWithDevicesResultado_Resultado_Section_GeneralSdt" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaCreado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoComentarios", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoPathExcel", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoPathCsv", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado, 18, 0)));
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid, 18, 0)), false, false);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario, 18, 0)), false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaEmision", sDateCnv, false, false);
      AddObjectProperty("resultadoComentarios", gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios, false, false);
      AddObjectProperty("resultadoUserId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid, 18, 0)), false, false);
      AddObjectProperty("resultadoTypeId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid, 18, 0)), false, false);
      AddObjectProperty("resultadoPathExcel", gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel, false, false);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf, false, false);
      AddObjectProperty("resultadoPathCsv", gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv, false, false);
      AddObjectProperty("resultadoIdEstado", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado, 18, 0)), false, false);
      AddObjectProperty("resultadoIdLibro", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetTipoinforme", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme, 18, 0)), false, false);
      AddObjectProperty("resultadoEliminado", gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado, false, false);
      AddObjectProperty("resultadoAbonado", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado, 18, 0)), false, false);
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = value ;
   }

   public byte getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado( byte value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = GXutil.nullDate() ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt struct )
   {
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid(struct.getResultadoid());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha(struct.getResultadoficha());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario(struct.getResultadoidnetusuario());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado(struct.getResultadofechacreado());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision(struct.getResultadofechaemision());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios(struct.getResultadocomentarios());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid(struct.getResultadouserid());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid(struct.getResultadotypeid());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel(struct.getResultadopathexcel());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf(struct.getResultadopathpdf());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv(struct.getResultadopathcsv());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado(struct.getResultadoidestado());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro(struct.getResultadoidlibro());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme(struct.getResultadoidnettipoinforme());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado(struct.getResultadoeliminado());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado(struct.getResultadoabonado());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt struct = new com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt ();
      struct.setResultadoid(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid());
      struct.setResultadoficha(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha());
      struct.setResultadoidnetusuario(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario());
      struct.setResultadofechacreado(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado());
      struct.setResultadofechaemision(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision());
      struct.setResultadocomentarios(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios());
      struct.setResultadouserid(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid());
      struct.setResultadotypeid(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid());
      struct.setResultadopathexcel(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel());
      struct.setResultadopathpdf(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf());
      struct.setResultadopathcsv(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv());
      struct.setResultadoidestado(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado());
      struct.setResultadoidlibro(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro());
      struct.setResultadoidnettipoinforme(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme());
      struct.setResultadoeliminado(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado());
      struct.setResultadoabonado(getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N ;
   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv ;
}

