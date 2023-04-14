package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTAnuncio extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTAnuncio( )
   {
      this(  new ModelContext(SdtSDTAnuncio.class));
   }

   public SdtSDTAnuncio( ModelContext context )
   {
      super( context, "SdtSDTAnuncio");
   }

   public SdtSDTAnuncio( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTAnuncio");
   }

   public SdtSDTAnuncio( StructSdtSDTAnuncio struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioId") )
            {
               gxTv_SdtSDTAnuncio_Anuncioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioTitulo") )
            {
               gxTv_SdtSDTAnuncio_Anunciotitulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioSubTitulo") )
            {
               gxTv_SdtSDTAnuncio_Anunciosubtitulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen") )
            {
               gxTv_SdtSDTAnuncio_Anuncioimagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_GXI") )
            {
               gxTv_SdtSDTAnuncio_Anuncioimagen_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioPublico") )
            {
               gxTv_SdtSDTAnuncio_Anunciopublico = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioDescripcion") )
            {
               gxTv_SdtSDTAnuncio_Anunciodescripcion = oReader.getValue() ;
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
         sName = "SDTAnuncio" ;
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
      oWriter.writeElement("AnuncioId", GXutil.trim( GXutil.str( gxTv_SdtSDTAnuncio_Anuncioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioTitulo", GXutil.rtrim( gxTv_SdtSDTAnuncio_Anunciotitulo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioSubTitulo", GXutil.rtrim( gxTv_SdtSDTAnuncio_Anunciosubtitulo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioImagen", GXutil.rtrim( gxTv_SdtSDTAnuncio_Anuncioimagen));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioImagen_GXI", GXutil.rtrim( gxTv_SdtSDTAnuncio_Anuncioimagen_gxi));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioPublico", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDTAnuncio_Anunciopublico)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioDescripcion", GXutil.rtrim( gxTv_SdtSDTAnuncio_Anunciodescripcion));
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
      AddObjectProperty("AnuncioId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTAnuncio_Anuncioid, 18, 0)), false, false);
      AddObjectProperty("AnuncioTitulo", gxTv_SdtSDTAnuncio_Anunciotitulo, false, false);
      AddObjectProperty("AnuncioSubTitulo", gxTv_SdtSDTAnuncio_Anunciosubtitulo, false, false);
      AddObjectProperty("AnuncioImagen", gxTv_SdtSDTAnuncio_Anuncioimagen, false, false);
      AddObjectProperty("AnuncioImagen_GXI", gxTv_SdtSDTAnuncio_Anuncioimagen_gxi, false, false);
      AddObjectProperty("AnuncioPublico", gxTv_SdtSDTAnuncio_Anunciopublico, false, false);
      AddObjectProperty("AnuncioDescripcion", gxTv_SdtSDTAnuncio_Anunciodescripcion, false, false);
   }

   public long getgxTv_SdtSDTAnuncio_Anuncioid( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioid ;
   }

   public void setgxTv_SdtSDTAnuncio_Anuncioid( long value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioid = value ;
   }

   public String getgxTv_SdtSDTAnuncio_Anunciotitulo( )
   {
      return gxTv_SdtSDTAnuncio_Anunciotitulo ;
   }

   public void setgxTv_SdtSDTAnuncio_Anunciotitulo( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciotitulo = value ;
   }

   public String getgxTv_SdtSDTAnuncio_Anunciosubtitulo( )
   {
      return gxTv_SdtSDTAnuncio_Anunciosubtitulo ;
   }

   public void setgxTv_SdtSDTAnuncio_Anunciosubtitulo( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciosubtitulo = value ;
   }

   @GxUpload
   public String getgxTv_SdtSDTAnuncio_Anuncioimagen( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioimagen ;
   }

   public void setgxTv_SdtSDTAnuncio_Anuncioimagen( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioimagen = value ;
   }

   public String getgxTv_SdtSDTAnuncio_Anuncioimagen_gxi( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioimagen_gxi ;
   }

   public void setgxTv_SdtSDTAnuncio_Anuncioimagen_gxi( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioimagen_gxi = value ;
   }

   public boolean getgxTv_SdtSDTAnuncio_Anunciopublico( )
   {
      return gxTv_SdtSDTAnuncio_Anunciopublico ;
   }

   public void setgxTv_SdtSDTAnuncio_Anunciopublico( boolean value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciopublico = value ;
   }

   public String getgxTv_SdtSDTAnuncio_Anunciodescripcion( )
   {
      return gxTv_SdtSDTAnuncio_Anunciodescripcion ;
   }

   public void setgxTv_SdtSDTAnuncio_Anunciodescripcion( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciodescripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTAnuncio_Anuncioid = 1 ;
      gxTv_SdtSDTAnuncio_N = (byte)(1) ;
      gxTv_SdtSDTAnuncio_Anunciotitulo = "" ;
      gxTv_SdtSDTAnuncio_Anunciosubtitulo = "" ;
      gxTv_SdtSDTAnuncio_Anuncioimagen = "" ;
      gxTv_SdtSDTAnuncio_Anuncioimagen_gxi = "" ;
      gxTv_SdtSDTAnuncio_Anunciodescripcion = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTAnuncio_N ;
   }

   public com.colaveco.SdtSDTAnuncio Clone( )
   {
      return (com.colaveco.SdtSDTAnuncio)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSDTAnuncio struct )
   {
      setgxTv_SdtSDTAnuncio_Anuncioid(struct.getAnuncioid());
      setgxTv_SdtSDTAnuncio_Anunciotitulo(struct.getAnunciotitulo());
      setgxTv_SdtSDTAnuncio_Anunciosubtitulo(struct.getAnunciosubtitulo());
      setgxTv_SdtSDTAnuncio_Anuncioimagen(struct.getAnuncioimagen());
      setgxTv_SdtSDTAnuncio_Anuncioimagen_gxi(struct.getAnuncioimagen_gxi());
      setgxTv_SdtSDTAnuncio_Anunciopublico(struct.getAnunciopublico());
      setgxTv_SdtSDTAnuncio_Anunciodescripcion(struct.getAnunciodescripcion());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSDTAnuncio getStruct( )
   {
      com.colaveco.StructSdtSDTAnuncio struct = new com.colaveco.StructSdtSDTAnuncio ();
      struct.setAnuncioid(getgxTv_SdtSDTAnuncio_Anuncioid());
      struct.setAnunciotitulo(getgxTv_SdtSDTAnuncio_Anunciotitulo());
      struct.setAnunciosubtitulo(getgxTv_SdtSDTAnuncio_Anunciosubtitulo());
      struct.setAnuncioimagen(getgxTv_SdtSDTAnuncio_Anuncioimagen());
      struct.setAnuncioimagen_gxi(getgxTv_SdtSDTAnuncio_Anuncioimagen_gxi());
      struct.setAnunciopublico(getgxTv_SdtSDTAnuncio_Anunciopublico());
      struct.setAnunciodescripcion(getgxTv_SdtSDTAnuncio_Anunciodescripcion());
      return struct ;
   }

   protected byte gxTv_SdtSDTAnuncio_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTAnuncio_Anuncioid ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTAnuncio_Anunciopublico ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTAnuncio_Anunciotitulo ;
   protected String gxTv_SdtSDTAnuncio_Anunciosubtitulo ;
   protected String gxTv_SdtSDTAnuncio_Anuncioimagen_gxi ;
   protected String gxTv_SdtSDTAnuncio_Anunciodescripcion ;
   protected String gxTv_SdtSDTAnuncio_Anuncioimagen ;
}

