package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item.class));
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesId") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesFecha") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesMensaje") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Notificacionesimagen") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Notificacionesimagen_GXI") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi = oReader.getValue() ;
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
         sName = "WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.Item" ;
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
      oWriter.writeElement("NotificacionesId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("NotificacionesFecha", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("NotificacionesMensaje", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Notificacionesimagen", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Notificacionesimagen_GXI", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi));
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
      AddObjectProperty("NotificacionesId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid, 18, 0)), false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("NotificacionesFecha", sDateCnv, false, false);
      AddObjectProperty("NotificacionesMensaje", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje, false, false);
      AddObjectProperty("Notificacionesimagen", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen, false, false);
      AddObjectProperty("Notificacionesimagen_GXI", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = value ;
   }

   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje = value ;
   }

   @GxUpload
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen = value ;
   }

   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item struct )
   {
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid(struct.getNotificacionesid());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha(struct.getNotificacionesfecha());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje(struct.getNotificacionesmensaje());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen(struct.getNotificacionesimagen());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi(struct.getNotificacionesimagen_gxi());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item struct = new com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item ();
      struct.setNotificacionesid(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid());
      struct.setNotificacionesfecha(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha());
      struct.setNotificacionesmensaje(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje());
      struct.setNotificacionesimagen(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen());
      struct.setNotificacionesimagen_gxi(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen ;
}

