package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt>
{
   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt ());
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

