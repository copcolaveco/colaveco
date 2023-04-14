package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTAgencia.SDTAgenciaItem", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTAgencia_SDTAgenciaItem_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>
{
   public SdtSDTAgencia_SDTAgenciaItem_RESTInterface( )
   {
      super(new com.colaveco.SdtSDTAgencia_SDTAgenciaItem ());
   }

   public SdtSDTAgencia_SDTAgenciaItem_RESTInterface( com.colaveco.SdtSDTAgencia_SDTAgenciaItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("SDTAgenciaId")
   public String getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid(), 18, 0)) ;
   }

   @JsonProperty("SDTAgenciaId")
   public void setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid(  String Value )
   {
      sdt.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( GXutil.lval( Value) );
   }


   @JsonProperty("SDTAgenciaNombre")
   public String getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTAgencia_SDTAgenciaItem)getSdt()).getgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre()) ;
   }

   @JsonProperty("SDTAgenciaNombre")
   public void setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre(  String Value )
   {
      ((com.colaveco.SdtSDTAgencia_SDTAgenciaItem)getSdt()).setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre(Value);
   }


   int remoteHandle = -1;
}

