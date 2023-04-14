package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "agenciasnombres_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class agenciasnombres_RESTInterfaceOUT
{
   String AV9AgenciaNombre;
   @JsonProperty("AgenciaNombre")
   public String getAgenciaNombre( )
   {
      return AV9AgenciaNombre ;
   }

   @JsonProperty("AgenciaNombre")
   public void setAgenciaNombre(  String Value )
   {
      AV9AgenciaNombre= Value;
   }


}

