package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtResultado extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtResultado( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtResultado.class));
   }

   public SdtResultado( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtResultado");
      initialize( remoteHandle) ;
   }

   public SdtResultado( int remoteHandle ,
                        StructSdtResultado struct )
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

   public void Load( long AV1resultadoId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV1resultadoId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"resultadoId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Resultado");
      metadata.set("BT", "Resultado");
      metadata.set("PK", "[ \"resultadoId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoId") )
            {
               gxTv_SdtResultado_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtResultado_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios") )
            {
               gxTv_SdtResultado_Resultadocomentarios = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId") )
            {
               gxTv_SdtResultado_Resultadouserid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId") )
            {
               gxTv_SdtResultado_Resultadotypeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtResultado_Resultadopathexcel = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtResultado_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv") )
            {
               gxTv_SdtResultado_Resultadopathcsv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado") )
            {
               gxTv_SdtResultado_Resultadoidestado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro") )
            {
               gxTv_SdtResultado_Resultadoidlibro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado") )
            {
               gxTv_SdtResultado_Resultadoeliminado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado") )
            {
               gxTv_SdtResultado_Resultadoabonado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtResultado_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtResultado_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoId_Z") )
            {
               gxTv_SdtResultado_Resultadoid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha_Z") )
            {
               gxTv_SdtResultado_Resultadoficha_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios_Z") )
            {
               gxTv_SdtResultado_Resultadocomentarios_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId_Z") )
            {
               gxTv_SdtResultado_Resultadouserid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId_Z") )
            {
               gxTv_SdtResultado_Resultadotypeid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario_Z") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel_Z") )
            {
               gxTv_SdtResultado_Resultadopathexcel_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf_Z") )
            {
               gxTv_SdtResultado_Resultadopathpdf_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv_Z") )
            {
               gxTv_SdtResultado_Resultadopathcsv_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado_Z") )
            {
               gxTv_SdtResultado_Resultadoidestado_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro_Z") )
            {
               gxTv_SdtResultado_Resultadoidlibro_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme_Z") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado_Z") )
            {
               gxTv_SdtResultado_Resultadoeliminado_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado_Z") )
            {
               gxTv_SdtResultado_Resultadoabonado_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha_N") )
            {
               gxTv_SdtResultado_Resultadoficha_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios_N") )
            {
               gxTv_SdtResultado_Resultadocomentarios_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId_N") )
            {
               gxTv_SdtResultado_Resultadouserid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId_N") )
            {
               gxTv_SdtResultado_Resultadotypeid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario_N") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado_N") )
            {
               gxTv_SdtResultado_Resultadofechacreado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision_N") )
            {
               gxTv_SdtResultado_Resultadofechaemision_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel_N") )
            {
               gxTv_SdtResultado_Resultadopathexcel_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf_N") )
            {
               gxTv_SdtResultado_Resultadopathpdf_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv_N") )
            {
               gxTv_SdtResultado_Resultadopathcsv_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado_N") )
            {
               gxTv_SdtResultado_Resultadoidestado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro_N") )
            {
               gxTv_SdtResultado_Resultadoidlibro_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado_N") )
            {
               gxTv_SdtResultado_Resultadoeliminado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado_N") )
            {
               gxTv_SdtResultado_Resultadoabonado_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Resultado" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoComentarios", GXutil.rtrim( gxTv_SdtResultado_Resultadocomentarios));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaCreado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathExcel", GXutil.rtrim( gxTv_SdtResultado_Resultadopathexcel));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtResultado_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathCsv", GXutil.rtrim( gxTv_SdtResultado_Resultadopathcsv));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtResultado_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtResultado_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFicha_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoComentarios_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadocomentarios_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoUserId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoTypeId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetUsuario_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaCreado_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaEmision_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathExcel_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathexcel_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathPdf_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathpdf_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathCsv_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathcsv_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdEstado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdLibro_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetTipoinforme_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoEliminado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoAbonado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFicha_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoComentarios_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadocomentarios_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoUserId_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoTypeId_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetUsuario_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFechaCreado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadofechacreado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFechaEmision_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadofechaemision_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathExcel_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathexcel_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathPdf_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathpdf_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathCsv_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathcsv_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdEstado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdLibro_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoEliminado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoAbonado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_N, 1, 0)));
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoficha, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoFicha_N", gxTv_SdtResultado_Resultadoficha_N, false, includeNonInitialized);
      AddObjectProperty("resultadoComentarios", gxTv_SdtResultado_Resultadocomentarios, false, includeNonInitialized);
      AddObjectProperty("resultadoComentarios_N", gxTv_SdtResultado_Resultadocomentarios_N, false, includeNonInitialized);
      AddObjectProperty("resultadoUserId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadouserid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoUserId_N", gxTv_SdtResultado_Resultadouserid_N, false, includeNonInitialized);
      AddObjectProperty("resultadoTypeId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadotypeid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoTypeId_N", gxTv_SdtResultado_Resultadotypeid_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetUsuario_N", gxTv_SdtResultado_Resultadoidnetusuario_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("resultadoFechaCreado_N", gxTv_SdtResultado_Resultadofechacreado_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaEmision", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("resultadoFechaEmision_N", gxTv_SdtResultado_Resultadofechaemision_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathExcel", gxTv_SdtResultado_Resultadopathexcel, false, includeNonInitialized);
      AddObjectProperty("resultadoPathExcel_N", gxTv_SdtResultado_Resultadopathexcel_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtResultado_Resultadopathpdf, false, includeNonInitialized);
      AddObjectProperty("resultadoPathPdf_N", gxTv_SdtResultado_Resultadopathpdf_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathCsv", gxTv_SdtResultado_Resultadopathcsv, false, includeNonInitialized);
      AddObjectProperty("resultadoPathCsv_N", gxTv_SdtResultado_Resultadopathcsv_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdEstado", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidestado, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdEstado_N", gxTv_SdtResultado_Resultadoidestado_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdLibro", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdLibro_N", gxTv_SdtResultado_Resultadoidlibro_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetTipoinforme", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoEliminado", gxTv_SdtResultado_Resultadoeliminado, false, includeNonInitialized);
      AddObjectProperty("resultadoEliminado_N", gxTv_SdtResultado_Resultadoeliminado_N, false, includeNonInitialized);
      AddObjectProperty("resultadoAbonado", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoabonado, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoAbonado_N", gxTv_SdtResultado_Resultadoabonado_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtResultado_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtResultado_Initialized, false, includeNonInitialized);
         AddObjectProperty("resultadoId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoFicha_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoficha_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoComentarios_Z", gxTv_SdtResultado_Resultadocomentarios_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoUserId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadouserid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoTypeId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetUsuario_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_Z, 18, 0)), false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("resultadoFechaCreado_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("resultadoFechaEmision_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("resultadoPathExcel_Z", gxTv_SdtResultado_Resultadopathexcel_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoPathPdf_Z", gxTv_SdtResultado_Resultadopathpdf_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoPathCsv_Z", gxTv_SdtResultado_Resultadopathcsv_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoIdEstado_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdLibro_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetTipoinforme_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoEliminado_Z", gxTv_SdtResultado_Resultadoeliminado_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoAbonado_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoFicha_N", gxTv_SdtResultado_Resultadoficha_N, false, includeNonInitialized);
         AddObjectProperty("resultadoComentarios_N", gxTv_SdtResultado_Resultadocomentarios_N, false, includeNonInitialized);
         AddObjectProperty("resultadoUserId_N", gxTv_SdtResultado_Resultadouserid_N, false, includeNonInitialized);
         AddObjectProperty("resultadoTypeId_N", gxTv_SdtResultado_Resultadotypeid_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetUsuario_N", gxTv_SdtResultado_Resultadoidnetusuario_N, false, includeNonInitialized);
         AddObjectProperty("resultadoFechaCreado_N", gxTv_SdtResultado_Resultadofechacreado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoFechaEmision_N", gxTv_SdtResultado_Resultadofechaemision_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathExcel_N", gxTv_SdtResultado_Resultadopathexcel_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathPdf_N", gxTv_SdtResultado_Resultadopathpdf_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathCsv_N", gxTv_SdtResultado_Resultadopathcsv_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdEstado_N", gxTv_SdtResultado_Resultadoidestado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdLibro_N", gxTv_SdtResultado_Resultadoidlibro_N, false, includeNonInitialized);
         AddObjectProperty("resultadoEliminado_N", gxTv_SdtResultado_Resultadoeliminado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoAbonado_N", gxTv_SdtResultado_Resultadoabonado_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtResultado sdt )
   {
      if ( sdt.IsDirty("resultadoId") )
      {
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoid = sdt.getgxTv_SdtResultado_Resultadoid() ;
      }
      if ( sdt.IsDirty("resultadoFicha") )
      {
         gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoficha = sdt.getgxTv_SdtResultado_Resultadoficha() ;
      }
      if ( sdt.IsDirty("resultadoComentarios") )
      {
         gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadocomentarios = sdt.getgxTv_SdtResultado_Resultadocomentarios() ;
      }
      if ( sdt.IsDirty("resultadoUserId") )
      {
         gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadouserid = sdt.getgxTv_SdtResultado_Resultadouserid() ;
      }
      if ( sdt.IsDirty("resultadoTypeId") )
      {
         gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadotypeid = sdt.getgxTv_SdtResultado_Resultadotypeid() ;
      }
      if ( sdt.IsDirty("resultadoIdNetUsuario") )
      {
         gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidnetusuario = sdt.getgxTv_SdtResultado_Resultadoidnetusuario() ;
      }
      if ( sdt.IsDirty("resultadoFechaCreado") )
      {
         gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadofechacreado = sdt.getgxTv_SdtResultado_Resultadofechacreado() ;
      }
      if ( sdt.IsDirty("resultadoFechaEmision") )
      {
         gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadofechaemision = sdt.getgxTv_SdtResultado_Resultadofechaemision() ;
      }
      if ( sdt.IsDirty("resultadoPathExcel") )
      {
         gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathexcel = sdt.getgxTv_SdtResultado_Resultadopathexcel() ;
      }
      if ( sdt.IsDirty("resultadoPathPdf") )
      {
         gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathpdf = sdt.getgxTv_SdtResultado_Resultadopathpdf() ;
      }
      if ( sdt.IsDirty("resultadoPathCsv") )
      {
         gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathcsv = sdt.getgxTv_SdtResultado_Resultadopathcsv() ;
      }
      if ( sdt.IsDirty("resultadoIdEstado") )
      {
         gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidestado = sdt.getgxTv_SdtResultado_Resultadoidestado() ;
      }
      if ( sdt.IsDirty("resultadoIdLibro") )
      {
         gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidlibro = sdt.getgxTv_SdtResultado_Resultadoidlibro() ;
      }
      if ( sdt.IsDirty("resultadoIdNetTipoinforme") )
      {
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidnettipoinforme = sdt.getgxTv_SdtResultado_Resultadoidnettipoinforme() ;
      }
      if ( sdt.IsDirty("resultadoEliminado") )
      {
         gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoeliminado = sdt.getgxTv_SdtResultado_Resultadoeliminado() ;
      }
      if ( sdt.IsDirty("resultadoAbonado") )
      {
         gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoabonado = sdt.getgxTv_SdtResultado_Resultadoabonado() ;
      }
   }

   public long getgxTv_SdtResultado_Resultadoid( )
   {
      return gxTv_SdtResultado_Resultadoid ;
   }

   public void setgxTv_SdtResultado_Resultadoid( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      if ( gxTv_SdtResultado_Resultadoid != value )
      {
         gxTv_SdtResultado_Mode = "INS" ;
         this.setgxTv_SdtResultado_Resultadoid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoficha_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadocomentarios_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadouserid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadotypeid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidnetusuario_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadofechacreado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadofechaemision_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathexcel_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathpdf_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathcsv_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidestado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidlibro_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidnettipoinforme_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoeliminado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoabonado_Z_SetNull( );
      }
      SetDirty("Resultadoid");
      gxTv_SdtResultado_Resultadoid = value ;
   }

   public long getgxTv_SdtResultado_Resultadoficha( )
   {
      return gxTv_SdtResultado_Resultadoficha ;
   }

   public void setgxTv_SdtResultado_Resultadoficha( long value )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha");
      gxTv_SdtResultado_Resultadoficha = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoficha = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoficha_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadocomentarios( )
   {
      return gxTv_SdtResultado_Resultadocomentarios ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios( String value )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios");
      gxTv_SdtResultado_Resultadocomentarios = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadocomentarios = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadocomentarios_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadouserid( )
   {
      return gxTv_SdtResultado_Resultadouserid ;
   }

   public void setgxTv_SdtResultado_Resultadouserid( long value )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid");
      gxTv_SdtResultado_Resultadouserid = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadouserid = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadouserid_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadotypeid( )
   {
      return gxTv_SdtResultado_Resultadotypeid ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid( long value )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid");
      gxTv_SdtResultado_Resultadotypeid = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadotypeid = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadotypeid_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidnetusuario( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario( long value )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario");
      gxTv_SdtResultado_Resultadoidnetusuario = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidnetusuario = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidnetusuario_N==1) ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechacreado( )
   {
      return gxTv_SdtResultado_Resultadofechacreado ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado");
      gxTv_SdtResultado_Resultadofechacreado = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadofechacreado_N==1) ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechaemision( )
   {
      return gxTv_SdtResultado_Resultadofechaemision ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision");
      gxTv_SdtResultado_Resultadofechaemision = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadofechaemision_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathexcel( )
   {
      return gxTv_SdtResultado_Resultadopathexcel ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel( String value )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel");
      gxTv_SdtResultado_Resultadopathexcel = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathexcel = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathexcel_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathpdf( )
   {
      return gxTv_SdtResultado_Resultadopathpdf ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf( String value )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf");
      gxTv_SdtResultado_Resultadopathpdf = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathpdf = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathpdf_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathcsv( )
   {
      return gxTv_SdtResultado_Resultadopathcsv ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv( String value )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv");
      gxTv_SdtResultado_Resultadopathcsv = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathcsv = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathcsv_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidestado( )
   {
      return gxTv_SdtResultado_Resultadoidestado ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado( long value )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado");
      gxTv_SdtResultado_Resultadoidestado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidestado = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidestado_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidlibro( )
   {
      return gxTv_SdtResultado_Resultadoidlibro ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro( long value )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro");
      gxTv_SdtResultado_Resultadoidlibro = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidlibro = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidlibro_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidnettipoinforme( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnettipoinforme");
      gxTv_SdtResultado_Resultadoidnettipoinforme = value ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado( )
   {
      return gxTv_SdtResultado_Resultadoeliminado ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado( byte value )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado");
      gxTv_SdtResultado_Resultadoeliminado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoeliminado = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoeliminado_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoabonado( )
   {
      return gxTv_SdtResultado_Resultadoabonado ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado( long value )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado");
      gxTv_SdtResultado_Resultadoabonado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoabonado = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoabonado_N==1) ;
   }

   public String getgxTv_SdtResultado_Mode( )
   {
      return gxTv_SdtResultado_Mode ;
   }

   public void setgxTv_SdtResultado_Mode( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtResultado_Mode = value ;
   }

   public void setgxTv_SdtResultado_Mode_SetNull( )
   {
      gxTv_SdtResultado_Mode = "" ;
   }

   public boolean getgxTv_SdtResultado_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtResultado_Initialized( )
   {
      return gxTv_SdtResultado_Initialized ;
   }

   public void setgxTv_SdtResultado_Initialized( short value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtResultado_Initialized = value ;
   }

   public void setgxTv_SdtResultado_Initialized_SetNull( )
   {
      gxTv_SdtResultado_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtResultado_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoid_Z( )
   {
      return gxTv_SdtResultado_Resultadoid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoid_Z");
      gxTv_SdtResultado_Resultadoid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoficha_Z( )
   {
      return gxTv_SdtResultado_Resultadoficha_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha_Z");
      gxTv_SdtResultado_Resultadoficha_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadocomentarios_Z( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_Z ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios_Z");
      gxTv_SdtResultado_Resultadocomentarios_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadouserid_Z( )
   {
      return gxTv_SdtResultado_Resultadouserid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid_Z");
      gxTv_SdtResultado_Resultadouserid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadotypeid_Z( )
   {
      return gxTv_SdtResultado_Resultadotypeid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid_Z");
      gxTv_SdtResultado_Resultadotypeid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidnetusuario_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario_Z");
      gxTv_SdtResultado_Resultadoidnetusuario_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechacreado_Z( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado_Z");
      gxTv_SdtResultado_Resultadofechacreado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechaemision_Z( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_Z ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision_Z");
      gxTv_SdtResultado_Resultadofechaemision_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathexcel_Z( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel_Z");
      gxTv_SdtResultado_Resultadopathexcel_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathpdf_Z( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf_Z");
      gxTv_SdtResultado_Resultadopathpdf_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathcsv_Z( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv_Z");
      gxTv_SdtResultado_Resultadopathcsv_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidestado_Z( )
   {
      return gxTv_SdtResultado_Resultadoidestado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado_Z");
      gxTv_SdtResultado_Resultadoidestado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidlibro_Z( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro_Z");
      gxTv_SdtResultado_Resultadoidlibro_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidnettipoinforme_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnettipoinforme_Z");
      gxTv_SdtResultado_Resultadoidnettipoinforme_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnettipoinforme_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnettipoinforme_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado_Z( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_Z( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado_Z");
      gxTv_SdtResultado_Resultadoeliminado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoabonado_Z( )
   {
      return gxTv_SdtResultado_Resultadoabonado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado_Z");
      gxTv_SdtResultado_Resultadoabonado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoficha_N( )
   {
      return gxTv_SdtResultado_Resultadoficha_N ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha_N");
      gxTv_SdtResultado_Resultadoficha_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadocomentarios_N( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_N ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios_N");
      gxTv_SdtResultado_Resultadocomentarios_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadouserid_N( )
   {
      return gxTv_SdtResultado_Resultadouserid_N ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid_N");
      gxTv_SdtResultado_Resultadouserid_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadotypeid_N( )
   {
      return gxTv_SdtResultado_Resultadotypeid_N ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid_N");
      gxTv_SdtResultado_Resultadotypeid_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidnetusuario_N( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario_N");
      gxTv_SdtResultado_Resultadoidnetusuario_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadofechacreado_N( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_N ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado_N");
      gxTv_SdtResultado_Resultadofechacreado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadofechaemision_N( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_N ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision_N");
      gxTv_SdtResultado_Resultadofechaemision_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathexcel_N( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel_N");
      gxTv_SdtResultado_Resultadopathexcel_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathpdf_N( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf_N");
      gxTv_SdtResultado_Resultadopathpdf_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathcsv_N( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv_N");
      gxTv_SdtResultado_Resultadopathcsv_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidestado_N( )
   {
      return gxTv_SdtResultado_Resultadoidestado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado_N");
      gxTv_SdtResultado_Resultadoidestado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidlibro_N( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro_N");
      gxTv_SdtResultado_Resultadoidlibro_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado_N( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado_N");
      gxTv_SdtResultado_Resultadoeliminado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoabonado_N( )
   {
      return gxTv_SdtResultado_Resultadoabonado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado_N");
      gxTv_SdtResultado_Resultadoabonado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.resultado_bc obj;
      obj = new com.colaveco.resultado_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtResultado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadocomentarios = "" ;
      gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadopathexcel = "" ;
      gxTv_SdtResultado_Resultadopathpdf = "" ;
      gxTv_SdtResultado_Resultadopathcsv = "" ;
      gxTv_SdtResultado_Mode = "" ;
      gxTv_SdtResultado_Resultadocomentarios_Z = "" ;
      gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadopathexcel_Z = "" ;
      gxTv_SdtResultado_Resultadopathpdf_Z = "" ;
      gxTv_SdtResultado_Resultadopathcsv_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtResultado_N ;
   }

   public com.colaveco.SdtResultado Clone( )
   {
      com.colaveco.SdtResultado sdt;
      com.colaveco.resultado_bc obj;
      sdt = (com.colaveco.SdtResultado)(clone()) ;
      obj = (com.colaveco.resultado_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtResultado struct )
   {
      setgxTv_SdtResultado_Resultadoid(struct.getResultadoid());
      setgxTv_SdtResultado_Resultadoficha(struct.getResultadoficha());
      setgxTv_SdtResultado_Resultadocomentarios(struct.getResultadocomentarios());
      setgxTv_SdtResultado_Resultadouserid(struct.getResultadouserid());
      setgxTv_SdtResultado_Resultadotypeid(struct.getResultadotypeid());
      setgxTv_SdtResultado_Resultadoidnetusuario(struct.getResultadoidnetusuario());
      setgxTv_SdtResultado_Resultadofechacreado(struct.getResultadofechacreado());
      setgxTv_SdtResultado_Resultadofechaemision(struct.getResultadofechaemision());
      setgxTv_SdtResultado_Resultadopathexcel(struct.getResultadopathexcel());
      setgxTv_SdtResultado_Resultadopathpdf(struct.getResultadopathpdf());
      setgxTv_SdtResultado_Resultadopathcsv(struct.getResultadopathcsv());
      setgxTv_SdtResultado_Resultadoidestado(struct.getResultadoidestado());
      setgxTv_SdtResultado_Resultadoidlibro(struct.getResultadoidlibro());
      setgxTv_SdtResultado_Resultadoidnettipoinforme(struct.getResultadoidnettipoinforme());
      setgxTv_SdtResultado_Resultadoeliminado(struct.getResultadoeliminado());
      setgxTv_SdtResultado_Resultadoabonado(struct.getResultadoabonado());
      setgxTv_SdtResultado_Mode(struct.getMode());
      setgxTv_SdtResultado_Initialized(struct.getInitialized());
      setgxTv_SdtResultado_Resultadoid_Z(struct.getResultadoid_Z());
      setgxTv_SdtResultado_Resultadoficha_Z(struct.getResultadoficha_Z());
      setgxTv_SdtResultado_Resultadocomentarios_Z(struct.getResultadocomentarios_Z());
      setgxTv_SdtResultado_Resultadouserid_Z(struct.getResultadouserid_Z());
      setgxTv_SdtResultado_Resultadotypeid_Z(struct.getResultadotypeid_Z());
      setgxTv_SdtResultado_Resultadoidnetusuario_Z(struct.getResultadoidnetusuario_Z());
      setgxTv_SdtResultado_Resultadofechacreado_Z(struct.getResultadofechacreado_Z());
      setgxTv_SdtResultado_Resultadofechaemision_Z(struct.getResultadofechaemision_Z());
      setgxTv_SdtResultado_Resultadopathexcel_Z(struct.getResultadopathexcel_Z());
      setgxTv_SdtResultado_Resultadopathpdf_Z(struct.getResultadopathpdf_Z());
      setgxTv_SdtResultado_Resultadopathcsv_Z(struct.getResultadopathcsv_Z());
      setgxTv_SdtResultado_Resultadoidestado_Z(struct.getResultadoidestado_Z());
      setgxTv_SdtResultado_Resultadoidlibro_Z(struct.getResultadoidlibro_Z());
      setgxTv_SdtResultado_Resultadoidnettipoinforme_Z(struct.getResultadoidnettipoinforme_Z());
      setgxTv_SdtResultado_Resultadoeliminado_Z(struct.getResultadoeliminado_Z());
      setgxTv_SdtResultado_Resultadoabonado_Z(struct.getResultadoabonado_Z());
      setgxTv_SdtResultado_Resultadoficha_N(struct.getResultadoficha_N());
      setgxTv_SdtResultado_Resultadocomentarios_N(struct.getResultadocomentarios_N());
      setgxTv_SdtResultado_Resultadouserid_N(struct.getResultadouserid_N());
      setgxTv_SdtResultado_Resultadotypeid_N(struct.getResultadotypeid_N());
      setgxTv_SdtResultado_Resultadoidnetusuario_N(struct.getResultadoidnetusuario_N());
      setgxTv_SdtResultado_Resultadofechacreado_N(struct.getResultadofechacreado_N());
      setgxTv_SdtResultado_Resultadofechaemision_N(struct.getResultadofechaemision_N());
      setgxTv_SdtResultado_Resultadopathexcel_N(struct.getResultadopathexcel_N());
      setgxTv_SdtResultado_Resultadopathpdf_N(struct.getResultadopathpdf_N());
      setgxTv_SdtResultado_Resultadopathcsv_N(struct.getResultadopathcsv_N());
      setgxTv_SdtResultado_Resultadoidestado_N(struct.getResultadoidestado_N());
      setgxTv_SdtResultado_Resultadoidlibro_N(struct.getResultadoidlibro_N());
      setgxTv_SdtResultado_Resultadoeliminado_N(struct.getResultadoeliminado_N());
      setgxTv_SdtResultado_Resultadoabonado_N(struct.getResultadoabonado_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtResultado getStruct( )
   {
      com.colaveco.StructSdtResultado struct = new com.colaveco.StructSdtResultado ();
      struct.setResultadoid(getgxTv_SdtResultado_Resultadoid());
      struct.setResultadoficha(getgxTv_SdtResultado_Resultadoficha());
      struct.setResultadocomentarios(getgxTv_SdtResultado_Resultadocomentarios());
      struct.setResultadouserid(getgxTv_SdtResultado_Resultadouserid());
      struct.setResultadotypeid(getgxTv_SdtResultado_Resultadotypeid());
      struct.setResultadoidnetusuario(getgxTv_SdtResultado_Resultadoidnetusuario());
      struct.setResultadofechacreado(getgxTv_SdtResultado_Resultadofechacreado());
      struct.setResultadofechaemision(getgxTv_SdtResultado_Resultadofechaemision());
      struct.setResultadopathexcel(getgxTv_SdtResultado_Resultadopathexcel());
      struct.setResultadopathpdf(getgxTv_SdtResultado_Resultadopathpdf());
      struct.setResultadopathcsv(getgxTv_SdtResultado_Resultadopathcsv());
      struct.setResultadoidestado(getgxTv_SdtResultado_Resultadoidestado());
      struct.setResultadoidlibro(getgxTv_SdtResultado_Resultadoidlibro());
      struct.setResultadoidnettipoinforme(getgxTv_SdtResultado_Resultadoidnettipoinforme());
      struct.setResultadoeliminado(getgxTv_SdtResultado_Resultadoeliminado());
      struct.setResultadoabonado(getgxTv_SdtResultado_Resultadoabonado());
      struct.setMode(getgxTv_SdtResultado_Mode());
      struct.setInitialized(getgxTv_SdtResultado_Initialized());
      struct.setResultadoid_Z(getgxTv_SdtResultado_Resultadoid_Z());
      struct.setResultadoficha_Z(getgxTv_SdtResultado_Resultadoficha_Z());
      struct.setResultadocomentarios_Z(getgxTv_SdtResultado_Resultadocomentarios_Z());
      struct.setResultadouserid_Z(getgxTv_SdtResultado_Resultadouserid_Z());
      struct.setResultadotypeid_Z(getgxTv_SdtResultado_Resultadotypeid_Z());
      struct.setResultadoidnetusuario_Z(getgxTv_SdtResultado_Resultadoidnetusuario_Z());
      struct.setResultadofechacreado_Z(getgxTv_SdtResultado_Resultadofechacreado_Z());
      struct.setResultadofechaemision_Z(getgxTv_SdtResultado_Resultadofechaemision_Z());
      struct.setResultadopathexcel_Z(getgxTv_SdtResultado_Resultadopathexcel_Z());
      struct.setResultadopathpdf_Z(getgxTv_SdtResultado_Resultadopathpdf_Z());
      struct.setResultadopathcsv_Z(getgxTv_SdtResultado_Resultadopathcsv_Z());
      struct.setResultadoidestado_Z(getgxTv_SdtResultado_Resultadoidestado_Z());
      struct.setResultadoidlibro_Z(getgxTv_SdtResultado_Resultadoidlibro_Z());
      struct.setResultadoidnettipoinforme_Z(getgxTv_SdtResultado_Resultadoidnettipoinforme_Z());
      struct.setResultadoeliminado_Z(getgxTv_SdtResultado_Resultadoeliminado_Z());
      struct.setResultadoabonado_Z(getgxTv_SdtResultado_Resultadoabonado_Z());
      struct.setResultadoficha_N(getgxTv_SdtResultado_Resultadoficha_N());
      struct.setResultadocomentarios_N(getgxTv_SdtResultado_Resultadocomentarios_N());
      struct.setResultadouserid_N(getgxTv_SdtResultado_Resultadouserid_N());
      struct.setResultadotypeid_N(getgxTv_SdtResultado_Resultadotypeid_N());
      struct.setResultadoidnetusuario_N(getgxTv_SdtResultado_Resultadoidnetusuario_N());
      struct.setResultadofechacreado_N(getgxTv_SdtResultado_Resultadofechacreado_N());
      struct.setResultadofechaemision_N(getgxTv_SdtResultado_Resultadofechaemision_N());
      struct.setResultadopathexcel_N(getgxTv_SdtResultado_Resultadopathexcel_N());
      struct.setResultadopathpdf_N(getgxTv_SdtResultado_Resultadopathpdf_N());
      struct.setResultadopathcsv_N(getgxTv_SdtResultado_Resultadopathcsv_N());
      struct.setResultadoidestado_N(getgxTv_SdtResultado_Resultadoidestado_N());
      struct.setResultadoidlibro_N(getgxTv_SdtResultado_Resultadoidlibro_N());
      struct.setResultadoeliminado_N(getgxTv_SdtResultado_Resultadoeliminado_N());
      struct.setResultadoabonado_N(getgxTv_SdtResultado_Resultadoabonado_N());
      return struct ;
   }

   private byte gxTv_SdtResultado_N ;
   private byte gxTv_SdtResultado_Resultadoeliminado ;
   private byte gxTv_SdtResultado_Resultadoeliminado_Z ;
   private byte gxTv_SdtResultado_Resultadoficha_N ;
   private byte gxTv_SdtResultado_Resultadocomentarios_N ;
   private byte gxTv_SdtResultado_Resultadouserid_N ;
   private byte gxTv_SdtResultado_Resultadotypeid_N ;
   private byte gxTv_SdtResultado_Resultadoidnetusuario_N ;
   private byte gxTv_SdtResultado_Resultadofechacreado_N ;
   private byte gxTv_SdtResultado_Resultadofechaemision_N ;
   private byte gxTv_SdtResultado_Resultadopathexcel_N ;
   private byte gxTv_SdtResultado_Resultadopathpdf_N ;
   private byte gxTv_SdtResultado_Resultadopathcsv_N ;
   private byte gxTv_SdtResultado_Resultadoidestado_N ;
   private byte gxTv_SdtResultado_Resultadoidlibro_N ;
   private byte gxTv_SdtResultado_Resultadoeliminado_N ;
   private byte gxTv_SdtResultado_Resultadoabonado_N ;
   private short gxTv_SdtResultado_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtResultado_Resultadoid ;
   private long gxTv_SdtResultado_Resultadoficha ;
   private long gxTv_SdtResultado_Resultadouserid ;
   private long gxTv_SdtResultado_Resultadotypeid ;
   private long gxTv_SdtResultado_Resultadoidnetusuario ;
   private long gxTv_SdtResultado_Resultadoidestado ;
   private long gxTv_SdtResultado_Resultadoidlibro ;
   private long gxTv_SdtResultado_Resultadoidnettipoinforme ;
   private long gxTv_SdtResultado_Resultadoabonado ;
   private long gxTv_SdtResultado_Resultadoid_Z ;
   private long gxTv_SdtResultado_Resultadoficha_Z ;
   private long gxTv_SdtResultado_Resultadouserid_Z ;
   private long gxTv_SdtResultado_Resultadotypeid_Z ;
   private long gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   private long gxTv_SdtResultado_Resultadoidestado_Z ;
   private long gxTv_SdtResultado_Resultadoidlibro_Z ;
   private long gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   private long gxTv_SdtResultado_Resultadoabonado_Z ;
   private String gxTv_SdtResultado_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtResultado_Resultadofechacreado ;
   private java.util.Date gxTv_SdtResultado_Resultadofechaemision ;
   private java.util.Date gxTv_SdtResultado_Resultadofechacreado_Z ;
   private java.util.Date gxTv_SdtResultado_Resultadofechaemision_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtResultado_Resultadocomentarios ;
   private String gxTv_SdtResultado_Resultadopathexcel ;
   private String gxTv_SdtResultado_Resultadopathpdf ;
   private String gxTv_SdtResultado_Resultadopathcsv ;
   private String gxTv_SdtResultado_Resultadocomentarios_Z ;
   private String gxTv_SdtResultado_Resultadopathexcel_Z ;
   private String gxTv_SdtResultado_Resultadopathpdf_Z ;
   private String gxTv_SdtResultado_Resultadopathcsv_Z ;
}

