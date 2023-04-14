package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt.class));
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt( StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt struct )
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
         sName = "WorkWithDevicesNotificaciones_Notificaciones_ListSdt" ;
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

   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt struct )
   {
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt struct = new com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt ();
      return struct ;
   }

}

