package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "gxbeforeeventreplicator_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class gxbeforeeventreplicator_RESTInterfaceOUT
{
   Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventList_SynchronizationEventListItem_RESTInterface> GxPendingEvents ;
   @JsonProperty("GxPendingEvents")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventList_SynchronizationEventListItem_RESTInterface> getGxPendingEvents( )
   {
      return GxPendingEvents ;
   }

   @JsonProperty("GxPendingEvents")
   public void setGxPendingEvents(  Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventList_SynchronizationEventListItem_RESTInterface> Value )
   {
      GxPendingEvents= Value;
   }


   Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventResultList_SynchronizationEventResultListItem_RESTInterface> AV8EventResults ;
   @JsonProperty("EventResults")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventResultList_SynchronizationEventResultListItem_RESTInterface> getEventResults( )
   {
      return AV8EventResults ;
   }

   @JsonProperty("EventResults")
   public void setEventResults(  Vector<com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventResultList_SynchronizationEventResultListItem_RESTInterface> Value )
   {
      AV8EventResults= Value;
   }


}

