package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesUsuario_Usuario_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesUsuario_Usuario_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt>
{
   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt ());
   }

   public SdtWorkWithDevicesUsuario_Usuario_DetailSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

