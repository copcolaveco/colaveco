package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "GAMSDLogin_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtGAMSDLogin_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtGAMSDLogin_Level_DetailSdt>
{
   public SdtGAMSDLogin_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtGAMSDLogin_Level_DetailSdt ());
   }

   public SdtGAMSDLogin_Level_DetailSdt_RESTInterface( com.colaveco.SdtGAMSDLogin_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Bienvenidalogin")
   public String getgxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin( )
   {
      return GXutil.rtrim(((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).getgxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin()) ;
   }

   @JsonProperty("Bienvenidalogin")
   public void setgxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin(  String Value )
   {
      ((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).setgxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin(Value);
   }


   @JsonProperty("User")
   public String getgxTv_SdtGAMSDLogin_Level_DetailSdt_User( )
   {
      return GXutil.rtrim(((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).getgxTv_SdtGAMSDLogin_Level_DetailSdt_User()) ;
   }

   @JsonProperty("User")
   public void setgxTv_SdtGAMSDLogin_Level_DetailSdt_User(  String Value )
   {
      ((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).setgxTv_SdtGAMSDLogin_Level_DetailSdt_User(Value);
   }


   @JsonProperty("Password")
   public String getgxTv_SdtGAMSDLogin_Level_DetailSdt_Password( )
   {
      return GXutil.rtrim(((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).getgxTv_SdtGAMSDLogin_Level_DetailSdt_Password()) ;
   }

   @JsonProperty("Password")
   public void setgxTv_SdtGAMSDLogin_Level_DetailSdt_Password(  String Value )
   {
      ((com.colaveco.SdtGAMSDLogin_Level_DetailSdt)getSdt()).setgxTv_SdtGAMSDLogin_Level_DetailSdt_Password(Value);
   }


   int remoteHandle = -1;
}

