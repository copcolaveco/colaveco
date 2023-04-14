package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "MisDatos_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtMisDatos_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtMisDatos_Level_DetailSdt>
{
   public SdtMisDatos_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtMisDatos_Level_DetailSdt ());
   }

   public SdtMisDatos_Level_DetailSdt_RESTInterface( com.colaveco.SdtMisDatos_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Sdtusuario")
   public com.colaveco.SdtSDTUsuario_RESTInterface getgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario( )
   {
      return new com.colaveco.SdtSDTUsuario_RESTInterface(((com.colaveco.SdtMisDatos_Level_DetailSdt)getSdt()).getgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario()) ;
   }

   @JsonProperty("Sdtusuario")
   public void setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario(  com.colaveco.SdtSDTUsuario_RESTInterface Value )
   {
      ((com.colaveco.SdtMisDatos_Level_DetailSdt)getSdt()).setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario((com.colaveco.SdtSDTUsuario)Value.getSdt());
   }


   int remoteHandle = -1;
}

