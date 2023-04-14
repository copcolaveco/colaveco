package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTResultado", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTResultado_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSDTResultado>
{
   public SdtSDTResultado_RESTInterface( )
   {
      super(new com.colaveco.SdtSDTResultado ());
   }

   public SdtSDTResultado_RESTInterface( com.colaveco.SdtSDTResultado psdt )
   {
      super(psdt);
   }

   @JsonProperty("resultadoId")
   public String getgxTv_SdtSDTResultado_Resultadoid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoid(), 18, 0)) ;
   }

   @JsonProperty("resultadoId")
   public void setgxTv_SdtSDTResultado_Resultadoid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtSDTResultado_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtSDTResultado_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoficha( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoComentarios")
   public String getgxTv_SdtSDTResultado_Resultadocomentarios( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadocomentarios()) ;
   }

   @JsonProperty("resultadoComentarios")
   public void setgxTv_SdtSDTResultado_Resultadocomentarios(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadocomentarios(Value);
   }


   @JsonProperty("resultadoUserId")
   public String getgxTv_SdtSDTResultado_Resultadouserid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadouserid(), 18, 0)) ;
   }

   @JsonProperty("resultadoUserId")
   public void setgxTv_SdtSDTResultado_Resultadouserid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadouserid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoTypeId")
   public String getgxTv_SdtSDTResultado_Resultadotypeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadotypeid(), 18, 0)) ;
   }

   @JsonProperty("resultadoTypeId")
   public void setgxTv_SdtSDTResultado_Resultadotypeid(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadotypeid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetUsuario")
   public String getgxTv_SdtSDTResultado_Resultadoidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetUsuario")
   public void setgxTv_SdtSDTResultado_Resultadoidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoidnetusuario( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFechaCreado")
   public String getgxTv_SdtSDTResultado_Resultadofechacreado( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTResultado_Resultadofechacreado()) ;
   }

   @JsonProperty("resultadoFechaCreado")
   public void setgxTv_SdtSDTResultado_Resultadofechacreado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadofechacreado( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoFechaEmision")
   public String getgxTv_SdtSDTResultado_Resultadofechaemision( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTResultado_Resultadofechaemision()) ;
   }

   @JsonProperty("resultadoFechaEmision")
   public void setgxTv_SdtSDTResultado_Resultadofechaemision(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadofechaemision( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoPathExcel")
   public String getgxTv_SdtSDTResultado_Resultadopathexcel( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadopathexcel()) ;
   }

   @JsonProperty("resultadoPathExcel")
   public void setgxTv_SdtSDTResultado_Resultadopathexcel(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadopathexcel(Value);
   }


   @JsonProperty("resultadoPathPdf")
   public String getgxTv_SdtSDTResultado_Resultadopathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadopathpdf()) ;
   }

   @JsonProperty("resultadoPathPdf")
   public void setgxTv_SdtSDTResultado_Resultadopathpdf(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadopathpdf(Value);
   }


   @JsonProperty("resultadoPathCsv")
   public String getgxTv_SdtSDTResultado_Resultadopathcsv( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadopathcsv()) ;
   }

   @JsonProperty("resultadoPathCsv")
   public void setgxTv_SdtSDTResultado_Resultadopathcsv(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadopathcsv(Value);
   }


   @JsonProperty("resultadoIdEstado")
   public String getgxTv_SdtSDTResultado_Resultadoidestado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoidestado(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdEstado")
   public void setgxTv_SdtSDTResultado_Resultadoidestado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoidestado( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdLibro")
   public String getgxTv_SdtSDTResultado_Resultadoidlibro( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoidlibro(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdLibro")
   public void setgxTv_SdtSDTResultado_Resultadoidlibro(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoidlibro( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetTipoinforme")
   public String getgxTv_SdtSDTResultado_Resultadoidnettipoinforme( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetTipoinforme")
   public void setgxTv_SdtSDTResultado_Resultadoidnettipoinforme(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoEliminado")
   public Byte getgxTv_SdtSDTResultado_Resultadoeliminado( )
   {
      return ((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadoeliminado() ;
   }

   @JsonProperty("resultadoEliminado")
   public void setgxTv_SdtSDTResultado_Resultadoeliminado(  Byte Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadoeliminado(Value);
   }


   @JsonProperty("resultadoAbonado")
   public String getgxTv_SdtSDTResultado_Resultadoabonado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTResultado_Resultadoabonado(), 18, 0)) ;
   }

   @JsonProperty("resultadoAbonado")
   public void setgxTv_SdtSDTResultado_Resultadoabonado(  String Value )
   {
      sdt.setgxTv_SdtSDTResultado_Resultadoabonado( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoEstado")
   public String getgxTv_SdtSDTResultado_Resultadoestado( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadoestado()) ;
   }

   @JsonProperty("resultadoEstado")
   public void setgxTv_SdtSDTResultado_Resultadoestado(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadoestado(Value);
   }


   @JsonProperty("resultadoImagen")
   public String getgxTv_SdtSDTResultado_Resultadoimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadoimagen()) ;
   }

   @JsonProperty("resultadoImagen")
   public void setgxTv_SdtSDTResultado_Resultadoimagen(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadoimagen(Value);
   }


   @JsonProperty("resultadoTipoinformeNombre")
   public String getgxTv_SdtSDTResultado_Resultadotipoinformenombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadotipoinformenombre()) ;
   }

   @JsonProperty("resultadoTipoinformeNombre")
   public void setgxTv_SdtSDTResultado_Resultadotipoinformenombre(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadotipoinformenombre(Value);
   }


   @JsonProperty("resultadoPdfImagen")
   public String getgxTv_SdtSDTResultado_Resultadopdfimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadopdfimagen()) ;
   }

   @JsonProperty("resultadoPdfImagen")
   public void setgxTv_SdtSDTResultado_Resultadopdfimagen(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadopdfimagen(Value);
   }


   @JsonProperty("resultadoExcelImagen")
   public String getgxTv_SdtSDTResultado_Resultadoexcelimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadoexcelimagen()) ;
   }

   @JsonProperty("resultadoExcelImagen")
   public void setgxTv_SdtSDTResultado_Resultadoexcelimagen(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadoexcelimagen(Value);
   }


   @JsonProperty("resultadoCsvImagen")
   public String getgxTv_SdtSDTResultado_Resultadocsvimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTResultado)getSdt()).getgxTv_SdtSDTResultado_Resultadocsvimagen()) ;
   }

   @JsonProperty("resultadoCsvImagen")
   public void setgxTv_SdtSDTResultado_Resultadocsvimagen(  String Value )
   {
      ((com.colaveco.SdtSDTResultado)getSdt()).setgxTv_SdtSDTResultado_Resultadocsvimagen(Value);
   }


   int remoteHandle = -1;
}

