package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAgencias_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtAgencias_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtAgencias_Level_DetailSdt.class));
   }

   public SdtAgencias_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtAgencias_Level_DetailSdt");
   }

   public SdtAgencias_Level_DetailSdt( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtAgencias_Level_DetailSdt");
   }

   public SdtAgencias_Level_DetailSdt( StructSdtAgencias_Level_DetailSdt struct )
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
         sName = "Agencias_Level_DetailSdt" ;
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
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public com.colaveco.SdtAgencias_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtAgencias_Level_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtAgencias_Level_DetailSdt struct )
   {
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtAgencias_Level_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtAgencias_Level_DetailSdt struct = new com.colaveco.StructSdtAgencias_Level_DetailSdt ();
      return struct ;
   }

}

