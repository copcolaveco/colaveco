package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTResultado", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class Sdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.Sdt>
{
   public Sdt_RESTInterface( )
   {
      super(new com.colaveco.Sdt ());
   }

   public Sdt_RESTInterface( com.colaveco.Sdt psdt )
   {
      super(psdt);
   }

   int remoteHandle = -1;
}

