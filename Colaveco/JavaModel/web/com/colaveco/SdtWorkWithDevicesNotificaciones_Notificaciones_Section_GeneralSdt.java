package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( )
   {
      this(  new ModelContext(SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.class));
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt");
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt struct )
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
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesTipo") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesMensaje") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesIdNetUsuario") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesDetalle") )
            {
               gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle = oReader.getValue() ;
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
         sName = "WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt" ;
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
      oWriter.writeElement("NotificacionesId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("NotificacionesFecha", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("NotificacionesTipo", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("NotificacionesMensaje", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("NotificacionesIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("NotificacionesDetalle", GXutil.rtrim( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle));
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
      AddObjectProperty("NotificacionesId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid, 18, 0)), false, false);
      datetime_STZ = gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha ;
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
      AddObjectProperty("NotificacionesTipo", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo, false, false);
      AddObjectProperty("NotificacionesMensaje", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje, false, false);
      AddObjectProperty("NotificacionesIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario, 18, 0)), false, false);
      AddObjectProperty("NotificacionesDetalle", gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid = value ;
   }

   public java.util.Date getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = value ;
   }

   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo = value ;
   }

   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje = value ;
   }

   public long getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario = value ;
   }

   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle ;
   }

   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N ;
   }

   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt struct )
   {
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid(struct.getNotificacionesid());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha(struct.getNotificacionesfecha());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo(struct.getNotificacionestipo());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje(struct.getNotificacionesmensaje());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario(struct.getNotificacionesidnetusuario());
      setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle(struct.getNotificacionesdetalle());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt struct = new com.colaveco.StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt ();
      struct.setNotificacionesid(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid());
      struct.setNotificacionesfecha(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha());
      struct.setNotificacionestipo(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo());
      struct.setNotificacionesmensaje(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje());
      struct.setNotificacionesidnetusuario(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario());
      struct.setNotificacionesdetalle(getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle ;
}

