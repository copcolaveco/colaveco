package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAnuncio extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtAnuncio( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtAnuncio.class));
   }

   public SdtAnuncio( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtAnuncio");
      initialize( remoteHandle) ;
   }

   public SdtAnuncio( int remoteHandle ,
                      StructSdtAnuncio struct )
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

   public void Load( long AV192AnuncioId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV192AnuncioId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"AnuncioId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Anuncio");
      metadata.set("BT", "Anuncio");
      metadata.set("PK", "[ \"AnuncioId\" ]");
      metadata.set("PKAssigned", "[ \"AnuncioId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioId") )
            {
               gxTv_SdtAnuncio_Anuncioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioTitulo") )
            {
               gxTv_SdtAnuncio_Anunciotitulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioSubTitulo") )
            {
               gxTv_SdtAnuncio_Anunciosubtitulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioDescripcion") )
            {
               gxTv_SdtAnuncio_Anunciodescripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen") )
            {
               gxTv_SdtAnuncio_Anuncioimagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_GXI") )
            {
               gxTv_SdtAnuncio_Anuncioimagen_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioPublico") )
            {
               gxTv_SdtAnuncio_Anunciopublico = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtAnuncio_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtAnuncio_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioId_Z") )
            {
               gxTv_SdtAnuncio_Anuncioid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioTitulo_Z") )
            {
               gxTv_SdtAnuncio_Anunciotitulo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioSubTitulo_Z") )
            {
               gxTv_SdtAnuncio_Anunciosubtitulo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioDescripcion_Z") )
            {
               gxTv_SdtAnuncio_Anunciodescripcion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioPublico_Z") )
            {
               gxTv_SdtAnuncio_Anunciopublico_Z = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_GXI_Z") )
            {
               gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioSubTitulo_N") )
            {
               gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_N") )
            {
               gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioPublico_N") )
            {
               gxTv_SdtAnuncio_Anunciopublico_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AnuncioImagen_GXI_N") )
            {
               gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Anuncio" ;
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
      oWriter.writeElement("AnuncioId", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anuncioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioTitulo", GXutil.rtrim( gxTv_SdtAnuncio_Anunciotitulo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioSubTitulo", GXutil.rtrim( gxTv_SdtAnuncio_Anunciosubtitulo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioDescripcion", GXutil.rtrim( gxTv_SdtAnuncio_Anunciodescripcion));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioImagen", GXutil.rtrim( gxTv_SdtAnuncio_Anuncioimagen));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("AnuncioPublico", GXutil.rtrim( GXutil.booltostr( gxTv_SdtAnuncio_Anunciopublico)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("AnuncioImagen_GXI", GXutil.rtrim( gxTv_SdtAnuncio_Anuncioimagen_gxi));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtAnuncio_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioId_Z", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anuncioid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioTitulo_Z", GXutil.rtrim( gxTv_SdtAnuncio_Anunciotitulo_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioSubTitulo_Z", GXutil.rtrim( gxTv_SdtAnuncio_Anunciosubtitulo_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioDescripcion_Z", GXutil.rtrim( gxTv_SdtAnuncio_Anunciodescripcion_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioPublico_Z", GXutil.rtrim( GXutil.booltostr( gxTv_SdtAnuncio_Anunciopublico_Z)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioImagen_GXI_Z", GXutil.rtrim( gxTv_SdtAnuncio_Anuncioimagen_gxi_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioSubTitulo_N", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anunciosubtitulo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioImagen_N", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anuncioimagen_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioPublico_N", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anunciopublico_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("AnuncioImagen_GXI_N", GXutil.trim( GXutil.str( gxTv_SdtAnuncio_Anuncioimagen_gxi_N, 1, 0)));
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
      AddObjectProperty("AnuncioId", GXutil.ltrim( GXutil.str( gxTv_SdtAnuncio_Anuncioid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("AnuncioTitulo", gxTv_SdtAnuncio_Anunciotitulo, false, includeNonInitialized);
      AddObjectProperty("AnuncioSubTitulo", gxTv_SdtAnuncio_Anunciosubtitulo, false, includeNonInitialized);
      AddObjectProperty("AnuncioSubTitulo_N", gxTv_SdtAnuncio_Anunciosubtitulo_N, false, includeNonInitialized);
      AddObjectProperty("AnuncioDescripcion", gxTv_SdtAnuncio_Anunciodescripcion, false, includeNonInitialized);
      AddObjectProperty("AnuncioImagen", gxTv_SdtAnuncio_Anuncioimagen, false, includeNonInitialized);
      AddObjectProperty("AnuncioImagen_N", gxTv_SdtAnuncio_Anuncioimagen_N, false, includeNonInitialized);
      AddObjectProperty("AnuncioPublico", gxTv_SdtAnuncio_Anunciopublico, false, includeNonInitialized);
      AddObjectProperty("AnuncioPublico_N", gxTv_SdtAnuncio_Anunciopublico_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("AnuncioImagen_GXI", gxTv_SdtAnuncio_Anuncioimagen_gxi, false, includeNonInitialized);
         AddObjectProperty("Mode", gxTv_SdtAnuncio_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtAnuncio_Initialized, false, includeNonInitialized);
         AddObjectProperty("AnuncioId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtAnuncio_Anuncioid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("AnuncioTitulo_Z", gxTv_SdtAnuncio_Anunciotitulo_Z, false, includeNonInitialized);
         AddObjectProperty("AnuncioSubTitulo_Z", gxTv_SdtAnuncio_Anunciosubtitulo_Z, false, includeNonInitialized);
         AddObjectProperty("AnuncioDescripcion_Z", gxTv_SdtAnuncio_Anunciodescripcion_Z, false, includeNonInitialized);
         AddObjectProperty("AnuncioPublico_Z", gxTv_SdtAnuncio_Anunciopublico_Z, false, includeNonInitialized);
         AddObjectProperty("AnuncioImagen_GXI_Z", gxTv_SdtAnuncio_Anuncioimagen_gxi_Z, false, includeNonInitialized);
         AddObjectProperty("AnuncioSubTitulo_N", gxTv_SdtAnuncio_Anunciosubtitulo_N, false, includeNonInitialized);
         AddObjectProperty("AnuncioImagen_N", gxTv_SdtAnuncio_Anuncioimagen_N, false, includeNonInitialized);
         AddObjectProperty("AnuncioPublico_N", gxTv_SdtAnuncio_Anunciopublico_N, false, includeNonInitialized);
         AddObjectProperty("AnuncioImagen_GXI_N", gxTv_SdtAnuncio_Anuncioimagen_gxi_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtAnuncio sdt )
   {
      if ( sdt.IsDirty("AnuncioId") )
      {
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anuncioid = sdt.getgxTv_SdtAnuncio_Anuncioid() ;
      }
      if ( sdt.IsDirty("AnuncioTitulo") )
      {
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anunciotitulo = sdt.getgxTv_SdtAnuncio_Anunciotitulo() ;
      }
      if ( sdt.IsDirty("AnuncioSubTitulo") )
      {
         gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(0) ;
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anunciosubtitulo = sdt.getgxTv_SdtAnuncio_Anunciosubtitulo() ;
      }
      if ( sdt.IsDirty("AnuncioDescripcion") )
      {
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anunciodescripcion = sdt.getgxTv_SdtAnuncio_Anunciodescripcion() ;
      }
      if ( sdt.IsDirty("AnuncioImagen") )
      {
         gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(0) ;
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anuncioimagen = sdt.getgxTv_SdtAnuncio_Anuncioimagen() ;
      }
      if ( sdt.IsDirty("AnuncioImagen") )
      {
         gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(0) ;
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anuncioimagen_gxi = sdt.getgxTv_SdtAnuncio_Anuncioimagen_gxi() ;
      }
      if ( sdt.IsDirty("AnuncioPublico") )
      {
         gxTv_SdtAnuncio_Anunciopublico_N = (byte)(0) ;
         gxTv_SdtAnuncio_N = (byte)(0) ;
         gxTv_SdtAnuncio_Anunciopublico = sdt.getgxTv_SdtAnuncio_Anunciopublico() ;
      }
   }

   public long getgxTv_SdtAnuncio_Anuncioid( )
   {
      return gxTv_SdtAnuncio_Anuncioid ;
   }

   public void setgxTv_SdtAnuncio_Anuncioid( long value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      if ( gxTv_SdtAnuncio_Anuncioid != value )
      {
         gxTv_SdtAnuncio_Mode = "INS" ;
         this.setgxTv_SdtAnuncio_Anuncioid_Z_SetNull( );
         this.setgxTv_SdtAnuncio_Anunciotitulo_Z_SetNull( );
         this.setgxTv_SdtAnuncio_Anunciosubtitulo_Z_SetNull( );
         this.setgxTv_SdtAnuncio_Anunciodescripcion_Z_SetNull( );
         this.setgxTv_SdtAnuncio_Anunciopublico_Z_SetNull( );
         this.setgxTv_SdtAnuncio_Anuncioimagen_gxi_Z_SetNull( );
      }
      SetDirty("Anuncioid");
      gxTv_SdtAnuncio_Anuncioid = value ;
   }

   public String getgxTv_SdtAnuncio_Anunciotitulo( )
   {
      return gxTv_SdtAnuncio_Anunciotitulo ;
   }

   public void setgxTv_SdtAnuncio_Anunciotitulo( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciotitulo");
      gxTv_SdtAnuncio_Anunciotitulo = value ;
   }

   public String getgxTv_SdtAnuncio_Anunciosubtitulo( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo( String value )
   {
      gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciosubtitulo");
      gxTv_SdtAnuncio_Anunciosubtitulo = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anunciosubtitulo = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciosubtitulo_IsNull( )
   {
      return (gxTv_SdtAnuncio_Anunciosubtitulo_N==1) ;
   }

   public String getgxTv_SdtAnuncio_Anunciodescripcion( )
   {
      return gxTv_SdtAnuncio_Anunciodescripcion ;
   }

   public void setgxTv_SdtAnuncio_Anunciodescripcion( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciodescripcion");
      gxTv_SdtAnuncio_Anunciodescripcion = value ;
   }

   @GxUpload
   public String getgxTv_SdtAnuncio_Anuncioimagen( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen( String value )
   {
      gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioimagen");
      gxTv_SdtAnuncio_Anuncioimagen = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anuncioimagen = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioimagen_IsNull( )
   {
      return (gxTv_SdtAnuncio_Anuncioimagen_N==1) ;
   }

   public String getgxTv_SdtAnuncio_Anuncioimagen_gxi( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi( String value )
   {
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioimagen_gxi");
      gxTv_SdtAnuncio_Anuncioimagen_gxi = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioimagen_gxi_IsNull( )
   {
      return (gxTv_SdtAnuncio_Anuncioimagen_gxi_N==1) ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciopublico( )
   {
      return gxTv_SdtAnuncio_Anunciopublico ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico( boolean value )
   {
      gxTv_SdtAnuncio_Anunciopublico_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciopublico");
      gxTv_SdtAnuncio_Anunciopublico = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciopublico_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anunciopublico = false ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciopublico_IsNull( )
   {
      return (gxTv_SdtAnuncio_Anunciopublico_N==1) ;
   }

   public String getgxTv_SdtAnuncio_Mode( )
   {
      return gxTv_SdtAnuncio_Mode ;
   }

   public void setgxTv_SdtAnuncio_Mode( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtAnuncio_Mode = value ;
   }

   public void setgxTv_SdtAnuncio_Mode_SetNull( )
   {
      gxTv_SdtAnuncio_Mode = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtAnuncio_Initialized( )
   {
      return gxTv_SdtAnuncio_Initialized ;
   }

   public void setgxTv_SdtAnuncio_Initialized( short value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtAnuncio_Initialized = value ;
   }

   public void setgxTv_SdtAnuncio_Initialized_SetNull( )
   {
      gxTv_SdtAnuncio_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtAnuncio_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtAnuncio_Anuncioid_Z( )
   {
      return gxTv_SdtAnuncio_Anuncioid_Z ;
   }

   public void setgxTv_SdtAnuncio_Anuncioid_Z( long value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioid_Z");
      gxTv_SdtAnuncio_Anuncioid_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioid_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioid_Z = 0 ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtAnuncio_Anunciotitulo_Z( )
   {
      return gxTv_SdtAnuncio_Anunciotitulo_Z ;
   }

   public void setgxTv_SdtAnuncio_Anunciotitulo_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciotitulo_Z");
      gxTv_SdtAnuncio_Anunciotitulo_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciotitulo_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciotitulo_Z = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciotitulo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtAnuncio_Anunciosubtitulo_Z( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo_Z ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciosubtitulo_Z");
      gxTv_SdtAnuncio_Anunciosubtitulo_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciosubtitulo_Z = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciosubtitulo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtAnuncio_Anunciodescripcion_Z( )
   {
      return gxTv_SdtAnuncio_Anunciodescripcion_Z ;
   }

   public void setgxTv_SdtAnuncio_Anunciodescripcion_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciodescripcion_Z");
      gxTv_SdtAnuncio_Anunciodescripcion_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciodescripcion_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciodescripcion_Z = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciodescripcion_Z_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciopublico_Z( )
   {
      return gxTv_SdtAnuncio_Anunciopublico_Z ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico_Z( boolean value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciopublico_Z");
      gxTv_SdtAnuncio_Anunciopublico_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciopublico_Z = false ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciopublico_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtAnuncio_Anuncioimagen_gxi_Z( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi_Z ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioimagen_gxi_Z");
      gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi_Z_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = "" ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioimagen_gxi_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtAnuncio_Anunciosubtitulo_N( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo_N ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciosubtitulo_N");
      gxTv_SdtAnuncio_Anunciosubtitulo_N = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciosubtitulo_N_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciosubtitulo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtAnuncio_Anuncioimagen_N( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_N ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioimagen_N");
      gxTv_SdtAnuncio_Anuncioimagen_N = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_N_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioimagen_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtAnuncio_Anunciopublico_N( )
   {
      return gxTv_SdtAnuncio_Anunciopublico_N ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anunciopublico_N");
      gxTv_SdtAnuncio_Anunciopublico_N = value ;
   }

   public void setgxTv_SdtAnuncio_Anunciopublico_N_SetNull( )
   {
      gxTv_SdtAnuncio_Anunciopublico_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtAnuncio_Anunciopublico_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtAnuncio_Anuncioimagen_gxi_N( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi_N ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      SetDirty("Anuncioimagen_gxi_N");
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = value ;
   }

   public void setgxTv_SdtAnuncio_Anuncioimagen_gxi_N_SetNull( )
   {
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtAnuncio_Anuncioimagen_gxi_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.anuncio_bc obj;
      obj = new com.colaveco.anuncio_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtAnuncio_Anuncioid = 1 ;
      gxTv_SdtAnuncio_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anunciotitulo = "" ;
      gxTv_SdtAnuncio_Anunciosubtitulo = "" ;
      gxTv_SdtAnuncio_Anunciodescripcion = "" ;
      gxTv_SdtAnuncio_Anuncioimagen = "" ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi = "" ;
      gxTv_SdtAnuncio_Mode = "" ;
      gxTv_SdtAnuncio_Anunciotitulo_Z = "" ;
      gxTv_SdtAnuncio_Anunciosubtitulo_Z = "" ;
      gxTv_SdtAnuncio_Anunciodescripcion_Z = "" ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAnuncio_N ;
   }

   public com.colaveco.SdtAnuncio Clone( )
   {
      com.colaveco.SdtAnuncio sdt;
      com.colaveco.anuncio_bc obj;
      sdt = (com.colaveco.SdtAnuncio)(clone()) ;
      obj = (com.colaveco.anuncio_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtAnuncio struct )
   {
      setgxTv_SdtAnuncio_Anuncioid(struct.getAnuncioid());
      setgxTv_SdtAnuncio_Anunciotitulo(struct.getAnunciotitulo());
      setgxTv_SdtAnuncio_Anunciosubtitulo(struct.getAnunciosubtitulo());
      setgxTv_SdtAnuncio_Anunciodescripcion(struct.getAnunciodescripcion());
      setgxTv_SdtAnuncio_Anuncioimagen(struct.getAnuncioimagen());
      setgxTv_SdtAnuncio_Anuncioimagen_gxi(struct.getAnuncioimagen_gxi());
      setgxTv_SdtAnuncio_Anunciopublico(struct.getAnunciopublico());
      setgxTv_SdtAnuncio_Mode(struct.getMode());
      setgxTv_SdtAnuncio_Initialized(struct.getInitialized());
      setgxTv_SdtAnuncio_Anuncioid_Z(struct.getAnuncioid_Z());
      setgxTv_SdtAnuncio_Anunciotitulo_Z(struct.getAnunciotitulo_Z());
      setgxTv_SdtAnuncio_Anunciosubtitulo_Z(struct.getAnunciosubtitulo_Z());
      setgxTv_SdtAnuncio_Anunciodescripcion_Z(struct.getAnunciodescripcion_Z());
      setgxTv_SdtAnuncio_Anunciopublico_Z(struct.getAnunciopublico_Z());
      setgxTv_SdtAnuncio_Anuncioimagen_gxi_Z(struct.getAnuncioimagen_gxi_Z());
      setgxTv_SdtAnuncio_Anunciosubtitulo_N(struct.getAnunciosubtitulo_N());
      setgxTv_SdtAnuncio_Anuncioimagen_N(struct.getAnuncioimagen_N());
      setgxTv_SdtAnuncio_Anunciopublico_N(struct.getAnunciopublico_N());
      setgxTv_SdtAnuncio_Anuncioimagen_gxi_N(struct.getAnuncioimagen_gxi_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtAnuncio getStruct( )
   {
      com.colaveco.StructSdtAnuncio struct = new com.colaveco.StructSdtAnuncio ();
      struct.setAnuncioid(getgxTv_SdtAnuncio_Anuncioid());
      struct.setAnunciotitulo(getgxTv_SdtAnuncio_Anunciotitulo());
      struct.setAnunciosubtitulo(getgxTv_SdtAnuncio_Anunciosubtitulo());
      struct.setAnunciodescripcion(getgxTv_SdtAnuncio_Anunciodescripcion());
      struct.setAnuncioimagen(getgxTv_SdtAnuncio_Anuncioimagen());
      struct.setAnuncioimagen_gxi(getgxTv_SdtAnuncio_Anuncioimagen_gxi());
      struct.setAnunciopublico(getgxTv_SdtAnuncio_Anunciopublico());
      struct.setMode(getgxTv_SdtAnuncio_Mode());
      struct.setInitialized(getgxTv_SdtAnuncio_Initialized());
      struct.setAnuncioid_Z(getgxTv_SdtAnuncio_Anuncioid_Z());
      struct.setAnunciotitulo_Z(getgxTv_SdtAnuncio_Anunciotitulo_Z());
      struct.setAnunciosubtitulo_Z(getgxTv_SdtAnuncio_Anunciosubtitulo_Z());
      struct.setAnunciodescripcion_Z(getgxTv_SdtAnuncio_Anunciodescripcion_Z());
      struct.setAnunciopublico_Z(getgxTv_SdtAnuncio_Anunciopublico_Z());
      struct.setAnuncioimagen_gxi_Z(getgxTv_SdtAnuncio_Anuncioimagen_gxi_Z());
      struct.setAnunciosubtitulo_N(getgxTv_SdtAnuncio_Anunciosubtitulo_N());
      struct.setAnuncioimagen_N(getgxTv_SdtAnuncio_Anuncioimagen_N());
      struct.setAnunciopublico_N(getgxTv_SdtAnuncio_Anunciopublico_N());
      struct.setAnuncioimagen_gxi_N(getgxTv_SdtAnuncio_Anuncioimagen_gxi_N());
      return struct ;
   }

   private byte gxTv_SdtAnuncio_N ;
   private byte gxTv_SdtAnuncio_Anunciosubtitulo_N ;
   private byte gxTv_SdtAnuncio_Anuncioimagen_N ;
   private byte gxTv_SdtAnuncio_Anunciopublico_N ;
   private byte gxTv_SdtAnuncio_Anuncioimagen_gxi_N ;
   private short gxTv_SdtAnuncio_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtAnuncio_Anuncioid ;
   private long gxTv_SdtAnuncio_Anuncioid_Z ;
   private String gxTv_SdtAnuncio_Mode ;
   private String sTagName ;
   private boolean gxTv_SdtAnuncio_Anunciopublico ;
   private boolean gxTv_SdtAnuncio_Anunciopublico_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtAnuncio_Anunciotitulo ;
   private String gxTv_SdtAnuncio_Anunciosubtitulo ;
   private String gxTv_SdtAnuncio_Anunciodescripcion ;
   private String gxTv_SdtAnuncio_Anuncioimagen_gxi ;
   private String gxTv_SdtAnuncio_Anunciotitulo_Z ;
   private String gxTv_SdtAnuncio_Anunciosubtitulo_Z ;
   private String gxTv_SdtAnuncio_Anunciodescripcion_Z ;
   private String gxTv_SdtAnuncio_Anuncioimagen_gxi_Z ;
   private String gxTv_SdtAnuncio_Anuncioimagen ;
}

