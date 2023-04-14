package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "usuarioupdate_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class usuarioupdate_RESTInterfaceOUT
{
   boolean AV10result;
   @JsonProperty("result")
   public boolean getresult( )
   {
      return AV10result ;
   }

   @JsonProperty("result")
   public void setresult(  boolean Value )
   {
      AV10result= Value;
   }


}

