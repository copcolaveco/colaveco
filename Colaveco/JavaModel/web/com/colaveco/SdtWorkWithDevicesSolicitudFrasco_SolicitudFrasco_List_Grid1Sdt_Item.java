package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item.class));
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( int remoteHandle ,
                                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFId") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SFIdNet") )
            {
               gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt.Item" ;
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
      oWriter.writeElement("SFId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("SFIdNet", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet, 18, 0)));
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
      AddObjectProperty("SFId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid, 18, 0)), false, false);
      AddObjectProperty("SFIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet, 18, 0)), false, false);
   }

   public long getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid = value ;
   }

   public long getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet ;
   }

   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item struct )
   {
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid(struct.getSfid());
      setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet(struct.getSfidnet());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item struct = new com.colaveco.StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item ();
      struct.setSfid(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid());
      struct.setSfidnet(getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

