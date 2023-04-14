package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "FacturaMovimiento", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtFacturaMovimiento_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtFacturaMovimiento>
{
   public SdtFacturaMovimiento_RESTLInterface( )
   {
      super(new com.colaveco.SdtFacturaMovimiento (-1));
   }

   public SdtFacturaMovimiento_RESTLInterface( com.colaveco.SdtFacturaMovimiento psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("FMIdNetMovimiento")
   public String getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento(), 18, 0)) ;
   }

   @JsonProperty("FMIdNetMovimiento")
   public void setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento( GXutil.lval( Value) );
   }


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
   private boolean n21FMIdNetMovimiento ;
   private boolean n22FMFechaEmision ;
   private boolean n23FMFechaVencimiento ;
   private boolean n24FMTipo ;
   private boolean n25FMNumero ;
   private boolean n26FMDetalle ;
   private boolean n27FMImporte ;
   private boolean n28FMIdUsuarioNet ;
   private boolean n29FMTipoMovimiento ;
   private boolean n30FMImportePago ;
   private boolean n31FMPathPdf ;
}

