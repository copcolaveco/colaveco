package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt>
{
   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt ());
   }

   public SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("FMId")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid(), 18, 0)) ;
   }

   @JsonProperty("FMId")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid( GXutil.lval( Value) );
   }


   @JsonProperty("FMIdNetMovimiento")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento(), 18, 0)) ;
   }

   @JsonProperty("FMIdNetMovimiento")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento( GXutil.lval( Value) );
   }


   @JsonProperty("FMFechaEmision")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision()) ;
   }

   @JsonProperty("FMFechaEmision")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("FMFechaVencimiento")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento()) ;
   }

   @JsonProperty("FMFechaVencimiento")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("FMTipo")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo()) ;
   }

   @JsonProperty("FMTipo")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo(Value);
   }


   @JsonProperty("FMNumero")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero(), 18, 0)) ;
   }

   @JsonProperty("FMNumero")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero( GXutil.lval( Value) );
   }


   @JsonProperty("FMDetalle")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle()) ;
   }

   @JsonProperty("FMDetalle")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle(Value);
   }


   @JsonProperty("FMImporte")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte(), 18, 0)) ;
   }

   @JsonProperty("FMImporte")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte( GXutil.lval( Value) );
   }


   @JsonProperty("FMIdUsuarioNet")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet(), 18, 0)) ;
   }

   @JsonProperty("FMIdUsuarioNet")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet( GXutil.lval( Value) );
   }


   @JsonProperty("FMTipoMovimiento")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento(), 18, 0)) ;
   }

   @JsonProperty("FMTipoMovimiento")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento( GXutil.lval( Value) );
   }


   @JsonProperty("FMImportePago")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago(), 18, 0)) ;
   }

   @JsonProperty("FMImportePago")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago( GXutil.lval( Value) );
   }


   @JsonProperty("FMSaldoActual")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual(), 18, 0)) ;
   }

   @JsonProperty("FMSaldoActual")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual( GXutil.lval( Value) );
   }


   @JsonProperty("FMPathPdf")
   public String getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf()) ;
   }

   @JsonProperty("FMPathPdf")
   public void setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf(Value);
   }


   int remoteHandle = -1;
}

