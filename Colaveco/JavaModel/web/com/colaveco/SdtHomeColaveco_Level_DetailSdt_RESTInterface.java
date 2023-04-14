package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "HomeColaveco_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtHomeColaveco_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtHomeColaveco_Level_DetailSdt>
{
   public SdtHomeColaveco_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtHomeColaveco_Level_DetailSdt ());
   }

   public SdtHomeColaveco_Level_DetailSdt_RESTInterface( com.colaveco.SdtHomeColaveco_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   int remoteHandle = -1;
}

