/*
               File: SdtTipoinformeFiltro_Level_DetailSdt
        Description: TipoinformeFiltro_Level_DetailSdt
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:32.20
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

public final  class SdtTipoinformeFiltro_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtTipoinformeFiltro_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtTipoinformeFiltro_Level_DetailSdt.class));
   }

   public SdtTipoinformeFiltro_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtTipoinformeFiltro_Level_DetailSdt");
   }

   public SdtTipoinformeFiltro_Level_DetailSdt( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtTipoinformeFiltro_Level_DetailSdt");
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
         sName = "TipoinformeFiltro_Level_DetailSdt" ;
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

   public com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt)(clone()) ;
   }

}

