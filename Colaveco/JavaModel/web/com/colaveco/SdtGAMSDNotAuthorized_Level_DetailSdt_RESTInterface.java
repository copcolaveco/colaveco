package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "GAMSDNotAuthorized_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtGAMSDNotAuthorized_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt>
{
   public SdtGAMSDNotAuthorized_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt ());
   }

   public SdtGAMSDNotAuthorized_Level_DetailSdt_RESTInterface( com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("User")
   public String getgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_User( )
   {
      return GXutil.rtrim(((com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt)getSdt()).getgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_User()) ;
   }

   @JsonProperty("User")
   public void setgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_User(  String Value )
   {
      ((com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt)getSdt()).setgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_User(Value);
   }


   @JsonProperty("Password")
   public String getgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_Password( )
   {
      return GXutil.rtrim(((com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt)getSdt()).getgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_Password()) ;
   }

   @JsonProperty("Password")
   public void setgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_Password(  String Value )
   {
      ((com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt)getSdt()).setgxTv_SdtGAMSDNotAuthorized_Level_DetailSdt_Password(Value);
   }


   int remoteHandle = -1;
}

