package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesUsuario_Usuario_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesUsuario_Usuario_DetailSdt.class));
   }

   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesUsuario_Usuario_DetailSdt");
   }

   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesUsuario_Usuario_DetailSdt");
   }

   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt( StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Gxdynprop") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop = oReader.getValue() ;
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
         sName = "WorkWithDevicesUsuario_Usuario_DetailSdt" ;
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
      oWriter.writeElement("Gxdynprop", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop));
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
      AddObjectProperty("Gxdynprop", gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop, false, false);
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop = "" ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt struct )
   {
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop(struct.getGxdynprop());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt struct = new com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt ();
      struct.setGxdynprop(getgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

