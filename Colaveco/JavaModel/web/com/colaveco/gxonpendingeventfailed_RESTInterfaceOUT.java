package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "gxonpendingeventfailed_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class gxonpendingeventfailed_RESTInterfaceOUT
{
   boolean AV11Continue;
   @JsonProperty("Continue")
   public boolean getContinue( )
   {
      return AV11Continue ;
   }

   @JsonProperty("Continue")
   public void setContinue(  boolean Value )
   {
      AV11Continue= Value;
   }


}

