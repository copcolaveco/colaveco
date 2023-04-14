package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item.class));
   }

   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item( int remoteHandle ,
                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item( StructSdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item struct )
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
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Imagen") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Imagen_GXI") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Estado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipoinformenombre") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre = oReader.getValue() ;
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
         sName = "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaCreado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Imagen", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Imagen_GXI", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Estado", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Tipoinformenombre", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre));
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid, 18, 0)), false, false);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha, 18, 0)), false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, false);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf, false, false);
      AddObjectProperty("Imagen", gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen, false, false);
      AddObjectProperty("Imagen_GXI", gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi, false, false);
      AddObjectProperty("Estado", gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado, false, false);
      AddObjectProperty("Tipoinformenombre", gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf = value ;
   }

   @GxUpload
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = value ;
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item struct )
   {
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid(struct.getResultadoid());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha(struct.getResultadoficha());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado(struct.getResultadofechacreado());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf(struct.getResultadopathpdf());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen(struct.getImagen());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi(struct.getImagen_gxi());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado(struct.getEstado());
      setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre(struct.getTipoinformenombre());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item struct = new com.colaveco.StructSdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item ();
      struct.setResultadoid(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid());
      struct.setResultadoficha(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha());
      struct.setResultadofechacreado(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado());
      struct.setResultadopathpdf(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf());
      struct.setImagen(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen());
      struct.setImagen_gxi(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi());
      struct.setEstado(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado());
      struct.setTipoinformenombre(getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen ;
}

