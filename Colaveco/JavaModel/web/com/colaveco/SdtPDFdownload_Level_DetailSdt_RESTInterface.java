package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "PDFdownload_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtPDFdownload_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtPDFdownload_Level_DetailSdt>
{
   public SdtPDFdownload_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtPDFdownload_Level_DetailSdt ());
   }

   public SdtPDFdownload_Level_DetailSdt_RESTInterface( com.colaveco.SdtPDFdownload_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Url")
   public String getgxTv_SdtPDFdownload_Level_DetailSdt_Url( )
   {
      return GXutil.rtrim(((com.colaveco.SdtPDFdownload_Level_DetailSdt)getSdt()).getgxTv_SdtPDFdownload_Level_DetailSdt_Url()) ;
   }

   @JsonProperty("Url")
   public void setgxTv_SdtPDFdownload_Level_DetailSdt_Url(  String Value )
   {
      ((com.colaveco.SdtPDFdownload_Level_DetailSdt)getSdt()).setgxTv_SdtPDFdownload_Level_DetailSdt_Url(Value);
   }


   int remoteHandle = -1;
}

