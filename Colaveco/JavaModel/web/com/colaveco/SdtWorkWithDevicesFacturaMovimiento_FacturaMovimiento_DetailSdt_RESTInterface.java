package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt>
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt ());
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

