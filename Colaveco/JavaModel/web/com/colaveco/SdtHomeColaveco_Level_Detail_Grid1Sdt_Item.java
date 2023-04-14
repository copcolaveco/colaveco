package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtHomeColaveco_Level_Detail_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtHomeColaveco_Level_Detail_Grid1Sdt_Item.class));
   }

   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtHomeColaveco_Level_Detail_Grid1Sdt_Item");
   }

   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtHomeColaveco_Level_Detail_Grid1Sdt_Item");
   }

   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item( StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item struct )
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
               gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioTitulo") )
            {
               gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioDescripcion") )
            {
               gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen") )
            {
               gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_GXI") )
            {
               gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi = oReader.getValue() ;
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
         sName = "HomeColaveco_Level_Detail_Grid1Sdt.Item" ;
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
      oWriter.writeElement("AnuncioId", GXutil.trim( GXutil.str( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("AnuncioTitulo", GXutil.rtrim( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("AnuncioDescripcion", GXutil.rtrim( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("AnuncioImagen", GXutil.rtrim( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("AnuncioImagen_GXI", GXutil.rtrim( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi));
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
      AddObjectProperty("AnuncioId", GXutil.ltrim( GXutil.str( gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid, 18, 0)), false, false);
      AddObjectProperty("AnuncioTitulo", gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo, false, false);
      AddObjectProperty("AnuncioDescripcion", gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion, false, false);
      AddObjectProperty("AnuncioImagen", gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen, false, false);
      AddObjectProperty("AnuncioImagen_GXI", gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi, false, false);
   }

   public long getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid ;
   }

   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid( long value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid = value ;
   }

   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo ;
   }

   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo = value ;
   }

   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion ;
   }

   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion = value ;
   }

   @GxUpload
   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen ;
   }

   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen = value ;
   }

   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi ;
   }

   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item struct )
   {
      setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid(struct.getAnuncioid());
      setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo(struct.getAnunciotitulo());
      setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion(struct.getAnunciodescripcion());
      setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen(struct.getAnuncioimagen());
      setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi(struct.getAnuncioimagen_gxi());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item struct = new com.colaveco.StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item ();
      struct.setAnuncioid(getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid());
      struct.setAnunciotitulo(getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo());
      struct.setAnunciodescripcion(getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion());
      struct.setAnuncioimagen(getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen());
      struct.setAnuncioimagen_gxi(getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi());
      return struct ;
   }

   protected byte gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen ;
}

