package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt>
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt ());
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("FMId")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid(), 18, 0)) ;
   }

   @JsonProperty("FMId")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid( GXutil.lval( Value) );
   }


   @JsonProperty("FMSaldoActual")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual(), 18, 0)) ;
   }

   @JsonProperty("FMSaldoActual")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual( GXutil.lval( Value) );
   }


   int remoteHandle = -1;
}

