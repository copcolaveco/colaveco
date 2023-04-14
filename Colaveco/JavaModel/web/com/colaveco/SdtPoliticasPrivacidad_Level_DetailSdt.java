package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPoliticasPrivacidad_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtPoliticasPrivacidad_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtPoliticasPrivacidad_Level_DetailSdt.class));
   }

   public SdtPoliticasPrivacidad_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtPoliticasPrivacidad_Level_DetailSdt");
   }

   public SdtPoliticasPrivacidad_Level_DetailSdt( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtPoliticasPrivacidad_Level_DetailSdt");
   }

   public SdtPoliticasPrivacidad_Level_DetailSdt( StructSdtPoliticasPrivacidad_Level_DetailSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Politicasprivacidad") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body1") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body2") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body3") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body4") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body5") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body6") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body7link") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body8") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body9") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body10") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body11") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Body12") )
            {
               gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12 = oReader.getValue() ;
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
         sName = "PoliticasPrivacidad_Level_DetailSdt" ;
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
      oWriter.writeElement("Politicasprivacidad", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body1", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body2", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body3", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body4", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body5", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body6", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body7link", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body8", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body9", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body10", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body11", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Body12", GXutil.rtrim( gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12));
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
      AddObjectProperty("Politicasprivacidad", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad, false, false);
      AddObjectProperty("Body1", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1, false, false);
      AddObjectProperty("Body2", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2, false, false);
      AddObjectProperty("Body3", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3, false, false);
      AddObjectProperty("Body4", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4, false, false);
      AddObjectProperty("Body5", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5, false, false);
      AddObjectProperty("Body6", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6, false, false);
      AddObjectProperty("Body7link", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link, false, false);
      AddObjectProperty("Body8", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8, false, false);
      AddObjectProperty("Body9", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9, false, false);
      AddObjectProperty("Body10", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10, false, false);
      AddObjectProperty("Body11", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11, false, false);
      AddObjectProperty("Body12", gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12, false, false);
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11 = value ;
   }

   public String getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12 ;
   }

   public void setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12( String value )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N = (byte)(1) ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11 = "" ;
      gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12 = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N ;
   }

   public com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtPoliticasPrivacidad_Level_DetailSdt struct )
   {
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad(struct.getPoliticasprivacidad());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1(struct.getBody1());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2(struct.getBody2());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3(struct.getBody3());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4(struct.getBody4());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5(struct.getBody5());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6(struct.getBody6());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link(struct.getBody7link());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8(struct.getBody8());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9(struct.getBody9());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10(struct.getBody10());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11(struct.getBody11());
      setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12(struct.getBody12());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtPoliticasPrivacidad_Level_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtPoliticasPrivacidad_Level_DetailSdt struct = new com.colaveco.StructSdtPoliticasPrivacidad_Level_DetailSdt ();
      struct.setPoliticasprivacidad(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad());
      struct.setBody1(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1());
      struct.setBody2(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2());
      struct.setBody3(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3());
      struct.setBody4(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4());
      struct.setBody5(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5());
      struct.setBody6(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6());
      struct.setBody7link(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link());
      struct.setBody8(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8());
      struct.setBody9(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9());
      struct.setBody10(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10());
      struct.setBody11(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11());
      struct.setBody12(getgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12());
      return struct ;
   }

   protected byte gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11 ;
   protected String gxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12 ;
}

