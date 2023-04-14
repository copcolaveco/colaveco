package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "refreshresultado_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class refreshresultado_RESTInterfaceIN
{
   com.colaveco.SdtSDTResultado_RESTInterface AV15item;
   @JsonProperty("item")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.colaveco.SdtSDTResultado_RESTInterface getitem( )
   {
      return AV15item ;
   }

   @JsonProperty("item")
   public void setitem(  com.colaveco.SdtSDTResultado_RESTInterface Value )
   {
      AV15item= Value;
   }


   short AV17TipoInforme;
   @JsonProperty("TipoInforme")
   public short getTipoInforme( )
   {
      return AV17TipoInforme ;
   }

   @JsonProperty("TipoInforme")
   public void setTipoInforme(  short Value )
   {
      AV17TipoInforme= Value;
   }


}

