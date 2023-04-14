package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTResultados_SDTResultadosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTResultados_SDTResultadosItem( )
   {
      this(  new ModelContext(SdtSDTResultados_SDTResultadosItem.class));
   }

   public SdtSDTResultados_SDTResultadosItem( ModelContext context )
   {
      super( context, "SdtSDTResultados_SDTResultadosItem");
   }

   public SdtSDTResultados_SDTResultadosItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTResultados_SDTResultadosItem");
   }

   public SdtSDTResultados_SDTResultadosItem( StructSdtSDTResultados_SDTResultadosItem struct )
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
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = GXutil.nullDate() ;
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(0) ;
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = GXutil.nullDate() ;
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(0) ;
                  gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado") )
            {
               gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTResultados.SDTResultadosItem" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoComentarios", GXutil.rtrim( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado)) && ( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N == 1 ) )
      {
         oWriter.writeElement("resultadoFechaCreado", "");
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaCreado", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision)) && ( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N == 1 ) )
      {
         oWriter.writeElement("resultadoFechaEmision", "");
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaEmision", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      oWriter.writeElement("resultadoPathExcel", GXutil.rtrim( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathCsv", GXutil.rtrim( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid, 18, 0)), false, false);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha, 18, 0)), false, false);
      AddObjectProperty("resultadoComentarios", gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios, false, false);
      AddObjectProperty("resultadoUserId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid, 18, 0)), false, false);
      AddObjectProperty("resultadoTypeId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario, 18, 0)), false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaEmision", sDateCnv, false, false);
      AddObjectProperty("resultadoPathExcel", gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel, false, false);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf, false, false);
      AddObjectProperty("resultadoPathCsv", gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv, false, false);
      AddObjectProperty("resultadoIdEstado", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado, 18, 0)), false, false);
      AddObjectProperty("resultadoIdLibro", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetTipoinforme", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme, 18, 0)), false, false);
      AddObjectProperty("resultadoEliminado", gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado, false, false);
      AddObjectProperty("resultadoAbonado", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado, 18, 0)), false, false);
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha = value ;
   }

   public String getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario = value ;
   }

   public java.util.Date getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = value ;
   }

   public java.util.Date getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision( java.util.Date value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = value ;
   }

   public String getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel = value ;
   }

   public String getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf = value ;
   }

   public String getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme = value ;
   }

   public byte getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado( byte value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado = value ;
   }

   public long getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado ;
   }

   public void setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(1) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = GXutil.nullDate() ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(1) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_N ;
   }

   public com.colaveco.SdtSDTResultados_SDTResultadosItem Clone( )
   {
      return (com.colaveco.SdtSDTResultados_SDTResultadosItem)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSDTResultados_SDTResultadosItem struct )
   {
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid(struct.getResultadoid());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha(struct.getResultadoficha());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios(struct.getResultadocomentarios());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid(struct.getResultadouserid());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid(struct.getResultadotypeid());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario(struct.getResultadoidnetusuario());
      if ( struct.gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N == 0 )
      {
         setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado(struct.getResultadofechacreado());
      }
      if ( struct.gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N == 0 )
      {
         setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision(struct.getResultadofechaemision());
      }
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel(struct.getResultadopathexcel());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf(struct.getResultadopathpdf());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv(struct.getResultadopathcsv());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado(struct.getResultadoidestado());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro(struct.getResultadoidlibro());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme(struct.getResultadoidnettipoinforme());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado(struct.getResultadoeliminado());
      setgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado(struct.getResultadoabonado());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSDTResultados_SDTResultadosItem getStruct( )
   {
      com.colaveco.StructSdtSDTResultados_SDTResultadosItem struct = new com.colaveco.StructSdtSDTResultados_SDTResultadosItem ();
      struct.setResultadoid(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid());
      struct.setResultadoficha(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha());
      struct.setResultadocomentarios(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios());
      struct.setResultadouserid(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid());
      struct.setResultadotypeid(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid());
      struct.setResultadoidnetusuario(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario());
      if ( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N == 0 )
      {
         struct.setResultadofechacreado(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado());
      }
      if ( gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N == 0 )
      {
         struct.setResultadofechaemision(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision());
      }
      struct.setResultadopathexcel(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel());
      struct.setResultadopathpdf(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf());
      struct.setResultadopathcsv(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv());
      struct.setResultadoidestado(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado());
      struct.setResultadoidlibro(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro());
      struct.setResultadoidnettipoinforme(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme());
      struct.setResultadoeliminado(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado());
      struct.setResultadoabonado(getgxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado());
      return struct ;
   }

   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_N ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv ;
}

