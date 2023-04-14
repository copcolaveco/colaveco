/*
               File: SdtPDFdownload_Level_DetailSdt
        Description: PDFdownload_Level_DetailSdt
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:52:6.83
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

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
      androidEntity.setProperty("Destfile", GXutil.trim( gxTv_SdtPDFdownload_Level_DetailSdt_Destfile));
   }

   public void entitytosdt( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
      setgxTv_SdtPDFdownload_Level_DetailSdt_Destfile( (String) androidEntity.optStringProperty("Destfile"));
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Destfile") )
            {
               gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = oReader.getValue() ;
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
      oWriter.writeElement("Destfile", GXutil.rtrim( gxTv_SdtPDFdownload_Level_DetailSdt_Destfile));
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
      AddObjectProperty("Destfile", gxTv_SdtPDFdownload_Level_DetailSdt_Destfile, false, false);
   }

   public String getgxTv_SdtPDFdownload_Level_DetailSdt_Destfile( )
   {
      return gxTv_SdtPDFdownload_Level_DetailSdt_Destfile ;
   }

   public void setgxTv_SdtPDFdownload_Level_DetailSdt_Destfile( String value )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = "" ;
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

   protected byte gxTv_SdtPDFdownload_Level_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtPDFdownload_Level_DetailSdt_Destfile ;
}

