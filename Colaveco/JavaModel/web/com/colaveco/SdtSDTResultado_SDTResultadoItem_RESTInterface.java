package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTResultado.SDTResultadoItem", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTResultado_SDTResultadoItem_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSDTResultado_SDTResultadoItem>
{
   public SdtSDTResultado_SDTResultadoItem_RESTInterface( )
   {
      super(new com.colaveco.SdtSDTResultado_SDTResultadoItem ());
   }

   public SdtSDTResultado_SDTResultadoItem_RESTInterface( com.colaveco.SdtSDTResultado_SDTResultadoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("resultadoId")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid(), 18, 0)) ;
   }

   @JsonProperty("resultadoId")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoComentarios")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios()) ;
   }

   @JsonProperty("resultadoComentarios")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios(Value);
   }


   @JsonProperty("resultadoUserId")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid(), 18, 0)) ;
   }

   @JsonProperty("resultadoUserId")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoTypeId")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid(), 18, 0)) ;
   }

   @JsonProperty("resultadoTypeId")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetUsuario")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetUsuario")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFechaCreado")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado()) ;
   }

   @JsonProperty("resultadoFechaCreado")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoFechaEmision")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision()) ;
   }

   @JsonProperty("resultadoFechaEmision")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoPathExcel")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel()) ;
   }

   @JsonProperty("resultadoPathExcel")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel(Value);
   }


   @JsonProperty("resultadoPathPdf")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf()) ;
   }

   @JsonProperty("resultadoPathPdf")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf(Value);
   }


   @JsonProperty("resultadoPathCsv")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv()) ;
   }

   @JsonProperty("resultadoPathCsv")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv(Value);
   }


   @JsonProperty("resultadoIdEstado")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdEstado")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdLibro")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdLibro")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetTipoinforme")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetTipoinforme")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoEliminado")
   public Byte getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado( )
   {
      return ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado() ;
   }

   @JsonProperty("resultadoEliminado")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado(  Byte Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado(Value);
   }


   @JsonProperty("resultadoAbonado")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado(), 18, 0)) ;
   }

   @JsonProperty("resultadoAbonado")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoEstado")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado()) ;
   }

   @JsonProperty("resultadoEstado")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado(Value);
   }


   @JsonProperty("resultadoImagen")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen()) ;
   }

   @JsonProperty("resultadoImagen")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen(Value);
   }


   @JsonProperty("resultadoTipoinformeNombre")
   public String getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).getgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre()) ;
   }

   @JsonProperty("resultadoTipoinformeNombre")
   public void setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre(  String Value )
   {
      ((com.colaveco.SdtSDTResultado_SDTResultadoItem)getSdt()).setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre(Value);
   }


   int remoteHandle = -1;
}

