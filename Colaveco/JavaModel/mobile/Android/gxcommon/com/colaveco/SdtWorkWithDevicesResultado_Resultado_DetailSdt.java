/*
               File: SdtWorkWithDevicesResultado_Resultado_DetailSdt
        Description: WorkWithDevicesResultado_Resultado_DetailSdt
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:53.98
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

public final  class SdtWorkWithDevicesResultado_Resultado_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesResultado_Resultado_DetailSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesResultado_Resultado_DetailSdt.class));
   }

   public SdtWorkWithDevicesResultado_Resultado_DetailSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesResultado_Resultado_DetailSdt");
   }

   public SdtWorkWithDevicesResultado_Resultado_DetailSdt( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesResultado_Resultado_DetailSdt");
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
      androidEntity.setProperty("Gxdynprop", GXutil.trim( gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop));
   }

   public void entitytosdt( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
      setgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop( (String) androidEntity.optStringProperty("Gxdynprop"));
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
               gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = oReader.getValue() ;
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
         sName = "WorkWithDevicesResultado_Resultado_DetailSdt" ;
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
      oWriter.writeElement("Gxdynprop", GXutil.rtrim( gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop));
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
      AddObjectProperty("Gxdynprop", gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop, false, false);
   }

   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop ;
   }

   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt)(clone()) ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

