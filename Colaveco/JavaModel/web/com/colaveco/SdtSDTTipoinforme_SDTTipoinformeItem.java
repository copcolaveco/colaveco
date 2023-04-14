package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTTipoinforme_SDTTipoinformeItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTipoinforme_SDTTipoinformeItem( )
   {
      this(  new ModelContext(SdtSDTTipoinforme_SDTTipoinformeItem.class));
   }

   public SdtSDTTipoinforme_SDTTipoinformeItem( ModelContext context )
   {
      super( context, "SdtSDTTipoinforme_SDTTipoinformeItem");
   }

   public SdtSDTTipoinforme_SDTTipoinformeItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTipoinforme_SDTTipoinformeItem");
   }

   public SdtSDTTipoinforme_SDTTipoinformeItem( StructSdtSDTTipoinforme_SDTTipoinformeItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SDTTipoinformeId") )
            {
               gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SDTTipoinformeNombre") )
            {
               gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = oReader.getValue() ;
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
         sName = "SDTTipoinforme.SDTTipoinformeItem" ;
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
      oWriter.writeElement("SDTTipoinformeId", GXutil.trim( GXutil.str( gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SDTTipoinformeNombre", GXutil.rtrim( gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
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
      AddObjectProperty("SDTTipoinformeId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid, 18, 0)), false, false);
      AddObjectProperty("SDTTipoinformeNombre", gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre, false, false);
   }

   public long getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( )
   {
      return gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid ;
   }

   public void setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( long value )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N = (byte)(0) ;
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = value ;
   }

   public String getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( )
   {
      return gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre ;
   }

   public void setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( String value )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N = (byte)(0) ;
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N = (byte)(1) ;
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N ;
   }

   public com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem Clone( )
   {
      return (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem struct )
   {
      setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid(struct.getSdttipoinformeid());
      setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre(struct.getSdttipoinformenombre());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem getStruct( )
   {
      com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem struct = new com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem ();
      struct.setSdttipoinformeid(getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid());
      struct.setSdttipoinformenombre(getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre());
      return struct ;
   }

   protected byte gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre ;
}

