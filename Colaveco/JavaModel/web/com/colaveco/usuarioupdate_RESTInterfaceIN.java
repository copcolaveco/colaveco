package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "usuarioupdate_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class usuarioupdate_RESTInterfaceIN
{
   com.colaveco.SdtSDTUsuario_RESTInterface AV8SDTUsuario;
   @JsonProperty("SDTUsuario")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.colaveco.SdtSDTUsuario_RESTInterface getSDTUsuario( )
   {
      return AV8SDTUsuario ;
   }

   @JsonProperty("SDTUsuario")
   public void setSDTUsuario(  com.colaveco.SdtSDTUsuario_RESTInterface Value )
   {
      AV8SDTUsuario= Value;
   }


}

