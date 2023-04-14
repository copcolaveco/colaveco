package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "loger_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class loger_RESTInterfaceIN
{
   String AV8LogDetalle;
   @JsonProperty("LogDetalle")
   public String getLogDetalle( )
   {
      if ( GXutil.strcmp(AV8LogDetalle, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV8LogDetalle ;
      }
   }

   @JsonProperty("LogDetalle")
   public void setLogDetalle(  String Value )
   {
      if ( Value == null )
      {
         AV8LogDetalle = "" ;
      }
      else
      {
         AV8LogDetalle= Value;
      }
   }


}

