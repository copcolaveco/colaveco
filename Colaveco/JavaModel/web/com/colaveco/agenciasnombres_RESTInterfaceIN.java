package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "agenciasnombres_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class agenciasnombres_RESTInterfaceIN
{
   String AV8Agencia;
   @JsonProperty("Agencia")
   public String getAgencia( )
   {
      return AV8Agencia ;
   }

   @JsonProperty("Agencia")
   public void setAgencia(  String Value )
   {
      AV8Agencia= Value;
   }


}

