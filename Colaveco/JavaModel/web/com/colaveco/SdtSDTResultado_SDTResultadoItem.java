package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTResultado_SDTResultadoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTResultado_SDTResultadoItem( )
   {
      this(  new ModelContext(SdtSDTResultado_SDTResultadoItem.class));
   }

   public SdtSDTResultado_SDTResultadoItem( ModelContext context )
   {
      super( context, "SdtSDTResultado_SDTResultadoItem");
   }

   public SdtSDTResultado_SDTResultadoItem( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTResultado_SDTResultadoItem");
   }

   public SdtSDTResultado_SDTResultadoItem( StructSdtSDTResultado_SDTResultadoItem struct )
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
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = GXutil.nullDate() ;
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(0) ;
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = GXutil.nullDate() ;
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(0) ;
                  gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEstado") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoImagen") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoImagen_GXI") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTipoinformeNombre") )
            {
               gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre = oReader.getValue() ;
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
         sName = "SDTResultado.SDTResultadoItem" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoComentarios", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado)) && ( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaCreado", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision)) && ( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaEmision", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
      }
      oWriter.writeElement("resultadoPathExcel", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathCsv", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoEstado", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoImagen", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoImagen_GXI", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoTipoinformeNombre", GXutil.rtrim( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre));
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid, 18, 0)), false, false);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha, 18, 0)), false, false);
      AddObjectProperty("resultadoComentarios", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios, false, false);
      AddObjectProperty("resultadoUserId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid, 18, 0)), false, false);
      AddObjectProperty("resultadoTypeId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario, 18, 0)), false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaEmision", sDateCnv, false, false);
      AddObjectProperty("resultadoPathExcel", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel, false, false);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf, false, false);
      AddObjectProperty("resultadoPathCsv", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv, false, false);
      AddObjectProperty("resultadoIdEstado", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado, 18, 0)), false, false);
      AddObjectProperty("resultadoIdLibro", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro, 18, 0)), false, false);
      AddObjectProperty("resultadoIdNetTipoinforme", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme, 18, 0)), false, false);
      AddObjectProperty("resultadoEliminado", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado, false, false);
      AddObjectProperty("resultadoAbonado", GXutil.ltrim( GXutil.str( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado, 18, 0)), false, false);
      AddObjectProperty("resultadoEstado", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado, false, false);
      AddObjectProperty("resultadoImagen", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen, false, false);
      AddObjectProperty("resultadoImagen_GXI", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi, false, false);
      AddObjectProperty("resultadoTipoinformeNombre", gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre, false, false);
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario = value ;
   }

   public java.util.Date getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = value ;
   }

   public java.util.Date getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision( java.util.Date value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme = value ;
   }

   public byte getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado( byte value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado = value ;
   }

   public long getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado = value ;
   }

   @GxUpload
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi = value ;
   }

   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre ;
   }

   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(1) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = GXutil.nullDate() ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(1) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_N ;
   }

   public com.colaveco.SdtSDTResultado_SDTResultadoItem Clone( )
   {
      return (com.colaveco.SdtSDTResultado_SDTResultadoItem)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSDTResultado_SDTResultadoItem struct )
   {
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid(struct.getResultadoid());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha(struct.getResultadoficha());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios(struct.getResultadocomentarios());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid(struct.getResultadouserid());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid(struct.getResultadotypeid());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario(struct.getResultadoidnetusuario());
      if ( struct.gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N == 0 )
      {
         setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado(struct.getResultadofechacreado());
      }
      if ( struct.gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N == 0 )
      {
         setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision(struct.getResultadofechaemision());
      }
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel(struct.getResultadopathexcel());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf(struct.getResultadopathpdf());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv(struct.getResultadopathcsv());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado(struct.getResultadoidestado());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro(struct.getResultadoidlibro());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme(struct.getResultadoidnettipoinforme());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado(struct.getResultadoeliminado());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado(struct.getResultadoabonado());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado(struct.getResultadoestado());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen(struct.getResultadoimagen());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi(struct.getResultadoimagen_gxi());
      setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre(struct.getResultadotipoinformenombre());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSDTResultado_SDTResultadoItem getStruct( )
   {
      com.colaveco.StructSdtSDTResultado_SDTResultadoItem struct = new com.colaveco.StructSdtSDTResultado_SDTResultadoItem ();
      struct.setResultadoid(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid());
      struct.setResultadoficha(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha());
      struct.setResultadocomentarios(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios());
      struct.setResultadouserid(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid());
      struct.setResultadotypeid(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid());
      struct.setResultadoidnetusuario(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario());
      if ( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N == 0 )
      {
         struct.setResultadofechacreado(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado());
      }
      if ( gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N == 0 )
      {
         struct.setResultadofechaemision(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision());
      }
      struct.setResultadopathexcel(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel());
      struct.setResultadopathpdf(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf());
      struct.setResultadopathcsv(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv());
      struct.setResultadoidestado(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado());
      struct.setResultadoidlibro(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro());
      struct.setResultadoidnettipoinforme(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme());
      struct.setResultadoeliminado(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado());
      struct.setResultadoabonado(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado());
      struct.setResultadoestado(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado());
      struct.setResultadoimagen(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen());
      struct.setResultadoimagen_gxi(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi());
      struct.setResultadotipoinformenombre(getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre());
      return struct ;
   }

   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_N ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen ;
}

