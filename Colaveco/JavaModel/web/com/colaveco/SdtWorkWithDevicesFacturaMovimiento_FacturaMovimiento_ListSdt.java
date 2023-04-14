package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt.class));
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( int remoteHandle ,
                                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt");
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMId") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FMSaldoActual") )
            {
               gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt" ;
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
      oWriter.writeElement("FMId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("FMSaldoActual", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
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
      AddObjectProperty("FMId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid, 18, 0)), false, false);
      AddObjectProperty("FMSaldoActual", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual, 18, 0)), false, false);
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual ;
   }

   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt struct )
   {
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid(struct.getFmid());
      setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual(struct.getFmsaldoactual());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt struct = new com.colaveco.StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt ();
      struct.setFmid(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid());
      struct.setFmsaldoactual(getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

