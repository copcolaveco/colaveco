package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesNotificaciones_Notificaciones_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt>
{
   public SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt ());
   }

   public SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt)getSdt()).getgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt)getSdt()).setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

