package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTAgencia_SDTAgenciaItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTAgencia_SDTAgenciaItem( )
   {
      this(  new ModelContext(SdtSDTAgencia_SDTAgenciaItem.class));
   }

   public SdtSDTAgencia_SDTAgenciaItem( ModelContext context )
   {
      super( context, "SdtSDTAgencia_SDTAgenciaItem");
   }

   public SdtSDTAgencia_SDTAgenciaItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTAgencia_SDTAgenciaItem");
   }

   public SdtSDTAgencia_SDTAgenciaItem( StructSdtSDTAgencia_SDTAgenciaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SDTAgenciaId") )
            {
               gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SDTAgenciaNombre") )
            {
               gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre = oReader.getValue() ;
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
         sName = "SDTAgencia.SDTAgenciaItem" ;
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
      oWriter.writeElement("SDTAgenciaId", GXutil.trim( GXutil.str( gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("SDTAgenciaNombre", GXutil.rtrim( gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre));
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
      AddObjectProperty("SDTAgenciaId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid, 18, 0)), false, false);
      AddObjectProperty("SDTAgenciaNombre", gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre, false, false);
   }

   public long getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( )
   {
      return gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid ;
   }

   public void setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( long value )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_N = (byte)(0) ;
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid = value ;
   }

   public String getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( )
   {
      return gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre ;
   }

   public void setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( String value )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_N = (byte)(0) ;
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_N = (byte)(1) ;
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTAgencia_SDTAgenciaItem_N ;
   }

   public com.colaveco.SdtSDTAgencia_SDTAgenciaItem Clone( )
   {
      return (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem struct )
   {
      setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid(struct.getSdtagenciaid());
      setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre(struct.getSdtagencianombre());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem getStruct( )
   {
      com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem struct = new com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem ();
      struct.setSdtagenciaid(getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid());
      struct.setSdtagencianombre(getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre());
      return struct ;
   }

   protected byte gxTv_SdtSDTAgencia_SDTAgenciaItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre ;
}

