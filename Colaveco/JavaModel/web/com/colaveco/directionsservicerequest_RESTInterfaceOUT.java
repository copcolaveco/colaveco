package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "directionsservicerequest_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class directionsservicerequest_RESTInterfaceOUT
{
   Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface> AV12Routes ;
   @JsonProperty("Routes")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface> getRoutes( )
   {
      return AV12Routes ;
   }

   @JsonProperty("Routes")
   public void setRoutes(  Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface> Value )
   {
      AV12Routes= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV11errorMessages ;
   @JsonProperty("errorMessages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> geterrorMessages( )
   {
      return AV11errorMessages ;
   }

   @JsonProperty("errorMessages")
   public void seterrorMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV11errorMessages= Value;
   }


}

