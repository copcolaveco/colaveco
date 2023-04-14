package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtNotificaciones extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtNotificaciones( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtNotificaciones.class));
   }

   public SdtNotificaciones( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtNotificaciones");
      initialize( remoteHandle) ;
   }

   public SdtNotificaciones( int remoteHandle ,
                             StructSdtNotificaciones struct )
   {
      this(remoteHandle);
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

   public void Load( long AV6NotificacionesId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV6NotificacionesId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"NotificacionesId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Notificaciones");
      metadata.set("BT", "Notificaciones");
      metadata.set("PK", "[ \"NotificacionesId\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
               gxTv_SdtNotificaciones_Notificacionesid = (long)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtNotificaciones_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtNotificaciones_Notificacionesfecha = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtNotificaciones_Notificacionestipo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesMensaje") )
            {
               gxTv_SdtNotificaciones_Notificacionesmensaje = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesIdNetUsuario") )
            {
               gxTv_SdtNotificaciones_Notificacionesidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesDetalle") )
            {
               gxTv_SdtNotificaciones_Notificacionesdetalle = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtNotificaciones_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtNotificaciones_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesId_Z") )
            {
               gxTv_SdtNotificaciones_Notificacionesid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesFecha_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtNotificaciones_Notificacionesfecha_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtNotificaciones_Notificacionesfecha_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesTipo_Z") )
            {
               gxTv_SdtNotificaciones_Notificacionestipo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesMensaje_Z") )
            {
               gxTv_SdtNotificaciones_Notificacionesmensaje_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesIdNetUsuario_Z") )
            {
               gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesDetalle_Z") )
            {
               gxTv_SdtNotificaciones_Notificacionesdetalle_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesFecha_N") )
            {
               gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesTipo_N") )
            {
               gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesMensaje_N") )
            {
               gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesIdNetUsuario_N") )
            {
               gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NotificacionesDetalle_N") )
            {
               gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Notificaciones" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Colaveco" ;
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
      oWriter.writeElement("NotificacionesId", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtNotificaciones_Notificacionesfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("NotificacionesFecha", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("NotificacionesTipo", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionestipo));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("NotificacionesMensaje", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionesmensaje));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("NotificacionesIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("NotificacionesDetalle", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionesdetalle));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtNotificaciones_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesId_Z", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtNotificaciones_Notificacionesfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("NotificacionesFecha_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesTipo_Z", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionestipo_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesMensaje_Z", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionesmensaje_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesIdNetUsuario_Z", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesDetalle_Z", GXutil.rtrim( gxTv_SdtNotificaciones_Notificacionesdetalle_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesFecha_N", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesfecha_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesTipo_N", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionestipo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesMensaje_N", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesmensaje_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesIdNetUsuario_N", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesidnetusuario_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("NotificacionesDetalle_N", GXutil.trim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesdetalle_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
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
      AddObjectProperty("NotificacionesId", GXutil.ltrim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesid, 18, 0)), false, includeNonInitialized);
      datetime_STZ = gxTv_SdtNotificaciones_Notificacionesfecha ;
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
      AddObjectProperty("NotificacionesFecha", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("NotificacionesFecha_N", gxTv_SdtNotificaciones_Notificacionesfecha_N, false, includeNonInitialized);
      AddObjectProperty("NotificacionesTipo", gxTv_SdtNotificaciones_Notificacionestipo, false, includeNonInitialized);
      AddObjectProperty("NotificacionesTipo_N", gxTv_SdtNotificaciones_Notificacionestipo_N, false, includeNonInitialized);
      AddObjectProperty("NotificacionesMensaje", gxTv_SdtNotificaciones_Notificacionesmensaje, false, includeNonInitialized);
      AddObjectProperty("NotificacionesMensaje_N", gxTv_SdtNotificaciones_Notificacionesmensaje_N, false, includeNonInitialized);
      AddObjectProperty("NotificacionesIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesidnetusuario, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("NotificacionesIdNetUsuario_N", gxTv_SdtNotificaciones_Notificacionesidnetusuario_N, false, includeNonInitialized);
      AddObjectProperty("NotificacionesDetalle", gxTv_SdtNotificaciones_Notificacionesdetalle, false, includeNonInitialized);
      AddObjectProperty("NotificacionesDetalle_N", gxTv_SdtNotificaciones_Notificacionesdetalle_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtNotificaciones_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtNotificaciones_Initialized, false, includeNonInitialized);
         AddObjectProperty("NotificacionesId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesid_Z, 18, 0)), false, includeNonInitialized);
         datetime_STZ = gxTv_SdtNotificaciones_Notificacionesfecha_Z ;
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
         AddObjectProperty("NotificacionesFecha_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("NotificacionesTipo_Z", gxTv_SdtNotificaciones_Notificacionestipo_Z, false, includeNonInitialized);
         AddObjectProperty("NotificacionesMensaje_Z", gxTv_SdtNotificaciones_Notificacionesmensaje_Z, false, includeNonInitialized);
         AddObjectProperty("NotificacionesIdNetUsuario_Z", GXutil.ltrim( GXutil.str( gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("NotificacionesDetalle_Z", gxTv_SdtNotificaciones_Notificacionesdetalle_Z, false, includeNonInitialized);
         AddObjectProperty("NotificacionesFecha_N", gxTv_SdtNotificaciones_Notificacionesfecha_N, false, includeNonInitialized);
         AddObjectProperty("NotificacionesTipo_N", gxTv_SdtNotificaciones_Notificacionestipo_N, false, includeNonInitialized);
         AddObjectProperty("NotificacionesMensaje_N", gxTv_SdtNotificaciones_Notificacionesmensaje_N, false, includeNonInitialized);
         AddObjectProperty("NotificacionesIdNetUsuario_N", gxTv_SdtNotificaciones_Notificacionesidnetusuario_N, false, includeNonInitialized);
         AddObjectProperty("NotificacionesDetalle_N", gxTv_SdtNotificaciones_Notificacionesdetalle_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtNotificaciones sdt )
   {
      if ( sdt.IsDirty("NotificacionesId") )
      {
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionesid = sdt.getgxTv_SdtNotificaciones_Notificacionesid() ;
      }
      if ( sdt.IsDirty("NotificacionesFecha") )
      {
         gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(0) ;
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionesfecha = sdt.getgxTv_SdtNotificaciones_Notificacionesfecha() ;
      }
      if ( sdt.IsDirty("NotificacionesTipo") )
      {
         gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(0) ;
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionestipo = sdt.getgxTv_SdtNotificaciones_Notificacionestipo() ;
      }
      if ( sdt.IsDirty("NotificacionesMensaje") )
      {
         gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(0) ;
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionesmensaje = sdt.getgxTv_SdtNotificaciones_Notificacionesmensaje() ;
      }
      if ( sdt.IsDirty("NotificacionesIdNetUsuario") )
      {
         gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(0) ;
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionesidnetusuario = sdt.getgxTv_SdtNotificaciones_Notificacionesidnetusuario() ;
      }
      if ( sdt.IsDirty("NotificacionesDetalle") )
      {
         gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(0) ;
         gxTv_SdtNotificaciones_N = (byte)(0) ;
         gxTv_SdtNotificaciones_Notificacionesdetalle = sdt.getgxTv_SdtNotificaciones_Notificacionesdetalle() ;
      }
   }

   public long getgxTv_SdtNotificaciones_Notificacionesid( )
   {
      return gxTv_SdtNotificaciones_Notificacionesid ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesid( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      if ( gxTv_SdtNotificaciones_Notificacionesid != value )
      {
         gxTv_SdtNotificaciones_Mode = "INS" ;
         this.setgxTv_SdtNotificaciones_Notificacionesid_Z_SetNull( );
         this.setgxTv_SdtNotificaciones_Notificacionesfecha_Z_SetNull( );
         this.setgxTv_SdtNotificaciones_Notificacionestipo_Z_SetNull( );
         this.setgxTv_SdtNotificaciones_Notificacionesmensaje_Z_SetNull( );
         this.setgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z_SetNull( );
         this.setgxTv_SdtNotificaciones_Notificacionesdetalle_Z_SetNull( );
      }
      SetDirty("Notificacionesid");
      gxTv_SdtNotificaciones_Notificacionesid = value ;
   }

   public java.util.Date getgxTv_SdtNotificaciones_Notificacionesfecha( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha( java.util.Date value )
   {
      gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesfecha");
      gxTv_SdtNotificaciones_Notificacionesfecha = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesfecha_IsNull( )
   {
      return (gxTv_SdtNotificaciones_Notificacionesfecha_N==1) ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionestipo( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo( String value )
   {
      gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionestipo");
      gxTv_SdtNotificaciones_Notificacionestipo = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionestipo = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionestipo_IsNull( )
   {
      return (gxTv_SdtNotificaciones_Notificacionestipo_N==1) ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionesmensaje( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje( String value )
   {
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesmensaje");
      gxTv_SdtNotificaciones_Notificacionesmensaje = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesmensaje = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesmensaje_IsNull( )
   {
      return (gxTv_SdtNotificaciones_Notificacionesmensaje_N==1) ;
   }

   public long getgxTv_SdtNotificaciones_Notificacionesidnetusuario( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario( long value )
   {
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesidnetusuario");
      gxTv_SdtNotificaciones_Notificacionesidnetusuario = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesidnetusuario = 0 ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesidnetusuario_IsNull( )
   {
      return (gxTv_SdtNotificaciones_Notificacionesidnetusuario_N==1) ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionesdetalle( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle( String value )
   {
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesdetalle");
      gxTv_SdtNotificaciones_Notificacionesdetalle = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesdetalle = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesdetalle_IsNull( )
   {
      return (gxTv_SdtNotificaciones_Notificacionesdetalle_N==1) ;
   }

   public String getgxTv_SdtNotificaciones_Mode( )
   {
      return gxTv_SdtNotificaciones_Mode ;
   }

   public void setgxTv_SdtNotificaciones_Mode( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtNotificaciones_Mode = value ;
   }

   public void setgxTv_SdtNotificaciones_Mode_SetNull( )
   {
      gxTv_SdtNotificaciones_Mode = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtNotificaciones_Initialized( )
   {
      return gxTv_SdtNotificaciones_Initialized ;
   }

   public void setgxTv_SdtNotificaciones_Initialized( short value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtNotificaciones_Initialized = value ;
   }

   public void setgxTv_SdtNotificaciones_Initialized_SetNull( )
   {
      gxTv_SdtNotificaciones_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtNotificaciones_Notificacionesid_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesid_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesid_Z( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesid_Z");
      gxTv_SdtNotificaciones_Notificacionesid_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesid_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesid_Z = 0 ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesid_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtNotificaciones_Notificacionesfecha_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha_Z( java.util.Date value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesfecha_Z");
      gxTv_SdtNotificaciones_Notificacionesfecha_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesfecha_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesfecha_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionestipo_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionestipo_Z");
      gxTv_SdtNotificaciones_Notificacionestipo_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionestipo_Z = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionestipo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionesmensaje_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesmensaje_Z");
      gxTv_SdtNotificaciones_Notificacionesmensaje_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesmensaje_Z = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesmensaje_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesidnetusuario_Z");
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z = 0 ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtNotificaciones_Notificacionesdetalle_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle_Z ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesdetalle_Z");
      gxTv_SdtNotificaciones_Notificacionesdetalle_Z = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle_Z_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesdetalle_Z = "" ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesdetalle_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtNotificaciones_Notificacionesfecha_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha_N ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesfecha_N");
      gxTv_SdtNotificaciones_Notificacionesfecha_N = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesfecha_N_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesfecha_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtNotificaciones_Notificacionestipo_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo_N ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionestipo_N");
      gxTv_SdtNotificaciones_Notificacionestipo_N = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionestipo_N_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionestipo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtNotificaciones_Notificacionesmensaje_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje_N ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesmensaje_N");
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesmensaje_N_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesmensaje_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtNotificaciones_Notificacionesidnetusuario_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario_N ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesidnetusuario_N");
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario_N_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesidnetusuario_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtNotificaciones_Notificacionesdetalle_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle_N ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      SetDirty("Notificacionesdetalle_N");
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = value ;
   }

   public void setgxTv_SdtNotificaciones_Notificacionesdetalle_N_SetNull( )
   {
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtNotificaciones_Notificacionesdetalle_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.notificaciones_bc obj;
      obj = new com.colaveco.notificaciones_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtNotificaciones_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesfecha = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtNotificaciones_Notificacionestipo = "" ;
      gxTv_SdtNotificaciones_Notificacionesmensaje = "" ;
      gxTv_SdtNotificaciones_Notificacionesdetalle = "" ;
      gxTv_SdtNotificaciones_Mode = "" ;
      gxTv_SdtNotificaciones_Notificacionesfecha_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtNotificaciones_Notificacionestipo_Z = "" ;
      gxTv_SdtNotificaciones_Notificacionesmensaje_Z = "" ;
      gxTv_SdtNotificaciones_Notificacionesdetalle_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtNotificaciones_N ;
   }

   public com.colaveco.SdtNotificaciones Clone( )
   {
      com.colaveco.SdtNotificaciones sdt;
      com.colaveco.notificaciones_bc obj;
      sdt = (com.colaveco.SdtNotificaciones)(clone()) ;
      obj = (com.colaveco.notificaciones_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.colaveco.StructSdtNotificaciones struct )
   {
      setgxTv_SdtNotificaciones_Notificacionesid(struct.getNotificacionesid());
      setgxTv_SdtNotificaciones_Notificacionesfecha(struct.getNotificacionesfecha());
      setgxTv_SdtNotificaciones_Notificacionestipo(struct.getNotificacionestipo());
      setgxTv_SdtNotificaciones_Notificacionesmensaje(struct.getNotificacionesmensaje());
      setgxTv_SdtNotificaciones_Notificacionesidnetusuario(struct.getNotificacionesidnetusuario());
      setgxTv_SdtNotificaciones_Notificacionesdetalle(struct.getNotificacionesdetalle());
      setgxTv_SdtNotificaciones_Mode(struct.getMode());
      setgxTv_SdtNotificaciones_Initialized(struct.getInitialized());
      setgxTv_SdtNotificaciones_Notificacionesid_Z(struct.getNotificacionesid_Z());
      setgxTv_SdtNotificaciones_Notificacionesfecha_Z(struct.getNotificacionesfecha_Z());
      setgxTv_SdtNotificaciones_Notificacionestipo_Z(struct.getNotificacionestipo_Z());
      setgxTv_SdtNotificaciones_Notificacionesmensaje_Z(struct.getNotificacionesmensaje_Z());
      setgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z(struct.getNotificacionesidnetusuario_Z());
      setgxTv_SdtNotificaciones_Notificacionesdetalle_Z(struct.getNotificacionesdetalle_Z());
      setgxTv_SdtNotificaciones_Notificacionesfecha_N(struct.getNotificacionesfecha_N());
      setgxTv_SdtNotificaciones_Notificacionestipo_N(struct.getNotificacionestipo_N());
      setgxTv_SdtNotificaciones_Notificacionesmensaje_N(struct.getNotificacionesmensaje_N());
      setgxTv_SdtNotificaciones_Notificacionesidnetusuario_N(struct.getNotificacionesidnetusuario_N());
      setgxTv_SdtNotificaciones_Notificacionesdetalle_N(struct.getNotificacionesdetalle_N());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtNotificaciones getStruct( )
   {
      com.colaveco.StructSdtNotificaciones struct = new com.colaveco.StructSdtNotificaciones ();
      struct.setNotificacionesid(getgxTv_SdtNotificaciones_Notificacionesid());
      struct.setNotificacionesfecha(getgxTv_SdtNotificaciones_Notificacionesfecha());
      struct.setNotificacionestipo(getgxTv_SdtNotificaciones_Notificacionestipo());
      struct.setNotificacionesmensaje(getgxTv_SdtNotificaciones_Notificacionesmensaje());
      struct.setNotificacionesidnetusuario(getgxTv_SdtNotificaciones_Notificacionesidnetusuario());
      struct.setNotificacionesdetalle(getgxTv_SdtNotificaciones_Notificacionesdetalle());
      struct.setMode(getgxTv_SdtNotificaciones_Mode());
      struct.setInitialized(getgxTv_SdtNotificaciones_Initialized());
      struct.setNotificacionesid_Z(getgxTv_SdtNotificaciones_Notificacionesid_Z());
      struct.setNotificacionesfecha_Z(getgxTv_SdtNotificaciones_Notificacionesfecha_Z());
      struct.setNotificacionestipo_Z(getgxTv_SdtNotificaciones_Notificacionestipo_Z());
      struct.setNotificacionesmensaje_Z(getgxTv_SdtNotificaciones_Notificacionesmensaje_Z());
      struct.setNotificacionesidnetusuario_Z(getgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z());
      struct.setNotificacionesdetalle_Z(getgxTv_SdtNotificaciones_Notificacionesdetalle_Z());
      struct.setNotificacionesfecha_N(getgxTv_SdtNotificaciones_Notificacionesfecha_N());
      struct.setNotificacionestipo_N(getgxTv_SdtNotificaciones_Notificacionestipo_N());
      struct.setNotificacionesmensaje_N(getgxTv_SdtNotificaciones_Notificacionesmensaje_N());
      struct.setNotificacionesidnetusuario_N(getgxTv_SdtNotificaciones_Notificacionesidnetusuario_N());
      struct.setNotificacionesdetalle_N(getgxTv_SdtNotificaciones_Notificacionesdetalle_N());
      return struct ;
   }

   private byte gxTv_SdtNotificaciones_N ;
   private byte gxTv_SdtNotificaciones_Notificacionesfecha_N ;
   private byte gxTv_SdtNotificaciones_Notificacionestipo_N ;
   private byte gxTv_SdtNotificaciones_Notificacionesmensaje_N ;
   private byte gxTv_SdtNotificaciones_Notificacionesidnetusuario_N ;
   private byte gxTv_SdtNotificaciones_Notificacionesdetalle_N ;
   private short gxTv_SdtNotificaciones_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtNotificaciones_Notificacionesid ;
   private long gxTv_SdtNotificaciones_Notificacionesidnetusuario ;
   private long gxTv_SdtNotificaciones_Notificacionesid_Z ;
   private long gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z ;
   private String gxTv_SdtNotificaciones_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtNotificaciones_Notificacionesfecha ;
   private java.util.Date gxTv_SdtNotificaciones_Notificacionesfecha_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtNotificaciones_Notificacionestipo ;
   private String gxTv_SdtNotificaciones_Notificacionesmensaje ;
   private String gxTv_SdtNotificaciones_Notificacionesdetalle ;
   private String gxTv_SdtNotificaciones_Notificacionestipo_Z ;
   private String gxTv_SdtNotificaciones_Notificacionesmensaje_Z ;
   private String gxTv_SdtNotificaciones_Notificacionesdetalle_Z ;
}

