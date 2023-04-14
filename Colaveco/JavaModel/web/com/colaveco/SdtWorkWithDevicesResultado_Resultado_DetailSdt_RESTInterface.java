package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesResultado_Resultado_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesResultado_Resultado_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt>
{
   public SdtWorkWithDevicesResultado_Resultado_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt ());
   }

   public SdtWorkWithDevicesResultado_Resultado_DetailSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

