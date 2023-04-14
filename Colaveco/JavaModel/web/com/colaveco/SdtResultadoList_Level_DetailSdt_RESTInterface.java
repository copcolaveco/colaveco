package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "ResultadoList_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtResultadoList_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtResultadoList_Level_DetailSdt>
{
   public SdtResultadoList_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtResultadoList_Level_DetailSdt ());
   }

   public SdtResultadoList_Level_DetailSdt_RESTInterface( com.colaveco.SdtResultadoList_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Tipoinformeid")
   public String getgxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid(), 18, 0)) ;
   }

   @JsonProperty("Tipoinformeid")
   public void setgxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid(  String Value )
   {
      sdt.setgxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid( GXutil.lval( Value) );
   }


   @JsonProperty("Externalid")
   public String getgxTv_SdtResultadoList_Level_DetailSdt_Externalid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultadoList_Level_DetailSdt_Externalid(), 18, 0)) ;
   }

   @JsonProperty("Externalid")
   public void setgxTv_SdtResultadoList_Level_DetailSdt_Externalid(  String Value )
   {
      sdt.setgxTv_SdtResultadoList_Level_DetailSdt_Externalid( GXutil.lval( Value) );
   }


   @JsonProperty("Gxdynprop")
   public String getgxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop( )
   {
      return GXutil.rtrim(((com.colaveco.SdtResultadoList_Level_DetailSdt)getSdt()).getgxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop()) ;
   }

   @JsonProperty("Gxdynprop")
   public void setgxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop(  String Value )
   {
      ((com.colaveco.SdtResultadoList_Level_DetailSdt)getSdt()).setgxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop(Value);
   }


   int remoteHandle = -1;
}

