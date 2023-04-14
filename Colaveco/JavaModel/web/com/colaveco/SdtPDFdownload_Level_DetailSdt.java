package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPDFdownload_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtPDFdownload_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtPDFdownload_Level_DetailSdt.class));
   }

   public SdtPDFdownload_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtPDFdownload_Level_DetailSdt");
   }

   public SdtPDFdownload_Level_DetailSdt( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtPDFdownload_Level_DetailSdt");
   }

   public SdtPDFdownload_Level_DetailSdt( StructSdtPDFdownload_Level_DetailSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Url") )
            {
               gxTv_SdtPDFdownload_Level_DetailSdt_Url = oReader.getValue() ;
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
         sName = "PDFdownload_Level_DetailSdt" ;
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
      oWriter.writeElement("Url", GXutil.rtrim( gxTv_SdtPDFdownload_Level_DetailSdt_Url));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("Url", gxTv_SdtPDFdownload_Level_DetailSdt_Url, false, false);
   }

   public String getgxTv_SdtPDFdownload_Level_DetailSdt_Url( )
   {
      return gxTv_SdtPDFdownload_Level_DetailSdt_Url ;
   }

   public void setgxTv_SdtPDFdownload_Level_DetailSdt_Url( String value )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPDFdownload_Level_DetailSdt_Url = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_Url = "" ;
      gxTv_SdtPDFdownload_Level_DetailSdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPDFdownload_Level_DetailSdt_N ;
   }

   public com.colaveco.SdtPDFdownload_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtPDFdownload_Level_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtPDFdownload_Level_DetailSdt struct )
   {
      setgxTv_SdtPDFdownload_Level_DetailSdt_Url(struct.getUrl());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtPDFdownload_Level_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtPDFdownload_Level_DetailSdt struct = new com.colaveco.StructSdtPDFdownload_Level_DetailSdt ();
      struct.setUrl(getgxTv_SdtPDFdownload_Level_DetailSdt_Url());
      return struct ;
   }

   protected byte gxTv_SdtPDFdownload_Level_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtPDFdownload_Level_DetailSdt_Url ;
}

