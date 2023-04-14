package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt>
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt ());
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("NotificacionesId")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid(), 18, 0)) ;
   }

   @JsonProperty("NotificacionesId")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid( GXutil.lval( Value) );
   }


   @JsonProperty("NotificacionesFecha")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha()) ;
   }

   @JsonProperty("NotificacionesFecha")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("NotificacionesTipo")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo()) ;
   }

   @JsonProperty("NotificacionesTipo")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo(Value);
   }


   @JsonProperty("NotificacionesMensaje")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje()) ;
   }

   @JsonProperty("NotificacionesMensaje")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje(Value);
   }


   @JsonProperty("NotificacionesIdNetUsuario")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("NotificacionesIdNetUsuario")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario( GXutil.lval( Value) );
   }


   @JsonProperty("NotificacionesDetalle")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle()) ;
   }

   @JsonProperty("NotificacionesDetalle")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle(Value);
   }


   int remoteHandle = -1;
}

