package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item ());
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("NotificacionesId")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid(), 18, 0)) ;
   }

   @JsonProperty("NotificacionesId")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid( GXutil.lval( Value) );
   }


   @JsonProperty("NotificacionesFecha")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha()) ;
   }

   @JsonProperty("NotificacionesFecha")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("NotificacionesMensaje")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje()) ;
   }

   @JsonProperty("NotificacionesMensaje")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje(Value);
   }


   @JsonProperty("Notificacionesimagen")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen( )
   {
      if ( GXutil.strcmp(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen(), "") != 0 )
      {
         return GXutil.getRelativeURL(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen()) ;
      }
      else
      {
         return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi()) ;
      }
   }

   @JsonProperty("Notificacionesimagen")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen(Value);
   }


   int remoteHandle = -1;
}

