package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "FacturaMovimiento", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtFacturaMovimiento_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtFacturaMovimiento>
{
   public SdtFacturaMovimiento_RESTInterface( )
   {
      super(new com.colaveco.SdtFacturaMovimiento (-1));
   }

   public SdtFacturaMovimiento_RESTInterface( com.colaveco.SdtFacturaMovimiento psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("FMId")
   public String getgxTv_SdtFacturaMovimiento_Fmid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmid(), 18, 0)) ;
   }

   @JsonProperty("FMId")
   public void setgxTv_SdtFacturaMovimiento_Fmid(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmid( GXutil.lval( Value) );
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


   @GxSeudo
   @JsonProperty("FMFechaEmision")
   public String getgxTv_SdtFacturaMovimiento_Fmfechaemision( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtFacturaMovimiento_Fmfechaemision()) ;
   }

   @JsonProperty("FMFechaEmision")
   public void setgxTv_SdtFacturaMovimiento_Fmfechaemision(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmfechaemision( GXutil.charToTimeREST( Value) );
   }


   @GxSeudo
   @JsonProperty("FMFechaVencimiento")
   public String getgxTv_SdtFacturaMovimiento_Fmfechavencimiento( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtFacturaMovimiento_Fmfechavencimiento()) ;
   }

   @JsonProperty("FMFechaVencimiento")
   public void setgxTv_SdtFacturaMovimiento_Fmfechavencimiento(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmfechavencimiento( GXutil.charToTimeREST( Value) );
   }


   @GxSeudo
   @JsonProperty("FMTipo")
   public String getgxTv_SdtFacturaMovimiento_Fmtipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtFacturaMovimiento)getSdt()).getgxTv_SdtFacturaMovimiento_Fmtipo()) ;
   }

   @JsonProperty("FMTipo")
   public void setgxTv_SdtFacturaMovimiento_Fmtipo(  String Value )
   {
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmtipo(Value);
   }


   @GxSeudo
   @JsonProperty("FMNumero")
   public String getgxTv_SdtFacturaMovimiento_Fmnumero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmnumero(), 18, 0)) ;
   }

   @JsonProperty("FMNumero")
   public void setgxTv_SdtFacturaMovimiento_Fmnumero(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmnumero( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("FMDetalle")
   public String getgxTv_SdtFacturaMovimiento_Fmdetalle( )
   {
      return GXutil.rtrim(((com.colaveco.SdtFacturaMovimiento)getSdt()).getgxTv_SdtFacturaMovimiento_Fmdetalle()) ;
   }

   @JsonProperty("FMDetalle")
   public void setgxTv_SdtFacturaMovimiento_Fmdetalle(  String Value )
   {
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmdetalle(Value);
   }


   @GxSeudo
   @JsonProperty("FMImporte")
   public String getgxTv_SdtFacturaMovimiento_Fmimporte( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmimporte(), 18, 0)) ;
   }

   @JsonProperty("FMImporte")
   public void setgxTv_SdtFacturaMovimiento_Fmimporte(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmimporte( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("FMIdUsuarioNet")
   public String getgxTv_SdtFacturaMovimiento_Fmidusuarionet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmidusuarionet(), 18, 0)) ;
   }

   @JsonProperty("FMIdUsuarioNet")
   public void setgxTv_SdtFacturaMovimiento_Fmidusuarionet(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmidusuarionet( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("FMTipoMovimiento")
   public String getgxTv_SdtFacturaMovimiento_Fmtipomovimiento( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmtipomovimiento(), 18, 0)) ;
   }

   @JsonProperty("FMTipoMovimiento")
   public void setgxTv_SdtFacturaMovimiento_Fmtipomovimiento(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmtipomovimiento( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("FMImportePago")
   public String getgxTv_SdtFacturaMovimiento_Fmimportepago( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmimportepago(), 18, 0)) ;
   }

   @JsonProperty("FMImportePago")
   public void setgxTv_SdtFacturaMovimiento_Fmimportepago(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmimportepago( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("FMPathPdf")
   public String getgxTv_SdtFacturaMovimiento_Fmpathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtFacturaMovimiento)getSdt()).getgxTv_SdtFacturaMovimiento_Fmpathpdf()) ;
   }

   @JsonProperty("FMPathPdf")
   public void setgxTv_SdtFacturaMovimiento_Fmpathpdf(  String Value )
   {
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmpathpdf(Value);
   }


   @GxSeudo
   @JsonProperty("FMSaldoActual")
   public String getgxTv_SdtFacturaMovimiento_Fmsaldoactual( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtFacturaMovimiento_Fmsaldoactual(), 18, 0)) ;
   }

   @JsonProperty("FMSaldoActual")
   public void setgxTv_SdtFacturaMovimiento_Fmsaldoactual(  String Value )
   {
      sdt.setgxTv_SdtFacturaMovimiento_Fmsaldoactual( GXutil.lval( Value) );
   }


   public void copyFrom( com.colaveco.SdtFacturaMovimiento_RESTInterface value )
   {
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmid(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmid());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmfechaemision(GXutil.DateTimefromTimeZone(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmfechaemision(), "Etc/UTC"));
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmfechavencimiento(GXutil.DateTimefromTimeZone(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmfechavencimiento(), "Etc/UTC"));
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmtipo(value.getgxTv_SdtFacturaMovimiento_Fmtipo());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmnumero(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmnumero());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmdetalle(value.getgxTv_SdtFacturaMovimiento_Fmdetalle());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmimporte(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmimporte());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmidusuarionet(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmidusuarionet());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmtipomovimiento(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmtipomovimiento());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmimportepago(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmimportepago());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmpathpdf(value.getgxTv_SdtFacturaMovimiento_Fmpathpdf());
      ((com.colaveco.SdtFacturaMovimiento)getSdt()).setgxTv_SdtFacturaMovimiento_Fmsaldoactual(((com.colaveco.SdtFacturaMovimiento)value.getSdt()).getgxTv_SdtFacturaMovimiento_Fmsaldoactual());
   }

   @JsonProperty("gx_md5_hash")
   public String getHash( )
   {
      if ( GXutil.strcmp(md5Hash, null) == 0 )
      {
         md5Hash = super.getHash() ;
      }
      return md5Hash ;
   }

   @JsonProperty("gx_md5_hash")
   public void setHash(  String Value )
   {
      md5Hash = Value ;
   }


   private String md5Hash ;
}

