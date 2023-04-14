package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "refreshresultado_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class refreshresultado_RESTInterfaceOUT
{
   com.colaveco.SdtSDTResultado_RESTInterface AV16item2;
   @JsonProperty("item2")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.colaveco.SdtSDTResultado_RESTInterface getitem2( )
   {
      return AV16item2 ;
   }

   @JsonProperty("item2")
   public void setitem2(  com.colaveco.SdtSDTResultado_RESTInterface Value )
   {
      AV16item2= Value;
   }


}

