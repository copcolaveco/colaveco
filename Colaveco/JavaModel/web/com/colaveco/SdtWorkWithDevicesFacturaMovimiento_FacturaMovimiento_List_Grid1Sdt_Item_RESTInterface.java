package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item ());
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("FMId")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid(), 18, 0)) ;
   }

   @JsonProperty("FMId")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid( GXutil.lval( Value) );
   }


   @JsonProperty("FMFechaEmision")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision()) ;
   }

   @JsonProperty("FMFechaEmision")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("FMFechaVencimiento")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento()) ;
   }

   @JsonProperty("FMFechaVencimiento")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("FMTipo")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo()) ;
   }

   @JsonProperty("FMTipo")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo(Value);
   }


   @JsonProperty("FMImporte")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte(), 18, 0)) ;
   }

   @JsonProperty("FMImporte")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte( GXutil.lval( Value) );
   }


   @JsonProperty("FMDetalle")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle()) ;
   }

   @JsonProperty("FMDetalle")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle(Value);
   }


   @JsonProperty("FMNumero")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero(), 18, 0)) ;
   }

   @JsonProperty("FMNumero")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero( GXutil.lval( Value) );
   }


   @JsonProperty("FMPathPdf")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf()) ;
   }

   @JsonProperty("FMPathPdf")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf(Value);
   }


   int remoteHandle = -1;
}

