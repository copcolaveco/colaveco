package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTTipoinforme.SDTTipoinformeItem", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>
{
   public SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface( )
   {
      super(new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem ());
   }

   public SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface( com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("SDTTipoinformeId")
   public String getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid(), 18, 0)) ;
   }

   @JsonProperty("SDTTipoinformeId")
   public void setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid(  String Value )
   {
      sdt.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( GXutil.lval( Value) );
   }


   @JsonProperty("SDTTipoinformeNombre")
   public String getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)getSdt()).getgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre()) ;
   }

   @JsonProperty("SDTTipoinformeNombre")
   public void setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre(  String Value )
   {
      ((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)getSdt()).setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre(Value);
   }


   int remoteHandle = -1;
}

