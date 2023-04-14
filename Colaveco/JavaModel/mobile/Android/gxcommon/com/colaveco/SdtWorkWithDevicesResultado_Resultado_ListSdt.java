/*
               File: SdtWorkWithDevicesResultado_Resultado_ListSdt
        Description: WorkWithDevicesResultado_Resultado_ListSdt
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:54.2
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

public final  class SdtWorkWithDevicesResultado_Resultado_ListSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesResultado_Resultado_ListSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesResultado_Resultado_ListSdt.class));
   }

   public SdtWorkWithDevicesResultado_Resultado_ListSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesResultado_Resultado_ListSdt");
   }

   public SdtWorkWithDevicesResultado_Resultado_ListSdt( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesResultado_Resultado_ListSdt");
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void sdttoentity( IEntity androidEntity )
   {
      /*  Save BC members to entity  */
   }

   public void entitytosdt( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
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
         sName = "WorkWithDevicesResultado_Resultado_ListSdt" ;
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

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt)(clone()) ;
   }

}

