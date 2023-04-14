package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesResultado_Resultado_ListSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesResultado_Resultado_ListSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt>
{
   public SdtWorkWithDevicesResultado_Resultado_ListSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt ());
   }

   public SdtWorkWithDevicesResultado_Resultado_ListSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

