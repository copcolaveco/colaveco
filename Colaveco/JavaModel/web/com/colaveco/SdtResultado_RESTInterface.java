package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Resultado", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtResultado_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtResultado>
{
   public SdtResultado_RESTInterface( )
   {
      super(new com.colaveco.SdtResultado (-1));
   }

   public SdtResultado_RESTInterface( com.colaveco.SdtResultado psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("resultadoId")
   public String getgxTv_SdtResultado_Resultadoid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoid(), 18, 0)) ;
   }

   @JsonProperty("resultadoId")
   public void setgxTv_SdtResultado_Resultadoid(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoid( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtResultado_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtResultado_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoficha( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoComentarios")
   public String getgxTv_SdtResultado_Resultadocomentarios( )
   {
      return GXutil.rtrim(((com.colaveco.SdtResultado)getSdt()).getgxTv_SdtResultado_Resultadocomentarios()) ;
   }

   @JsonProperty("resultadoComentarios")
   public void setgxTv_SdtResultado_Resultadocomentarios(  String Value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadocomentarios(Value);
   }


   @GxSeudo
   @JsonProperty("resultadoUserId")
   public String getgxTv_SdtResultado_Resultadouserid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadouserid(), 18, 0)) ;
   }

   @JsonProperty("resultadoUserId")
   public void setgxTv_SdtResultado_Resultadouserid(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadouserid( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoTypeId")
   public String getgxTv_SdtResultado_Resultadotypeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadotypeid(), 18, 0)) ;
   }

   @JsonProperty("resultadoTypeId")
   public void setgxTv_SdtResultado_Resultadotypeid(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadotypeid( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoIdNetUsuario")
   public String getgxTv_SdtResultado_Resultadoidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetUsuario")
   public void setgxTv_SdtResultado_Resultadoidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoidnetusuario( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoFechaCreado")
   public String getgxTv_SdtResultado_Resultadofechacreado( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtResultado_Resultadofechacreado()) ;
   }

   @JsonProperty("resultadoFechaCreado")
   public void setgxTv_SdtResultado_Resultadofechacreado(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadofechacreado( GXutil.charToDateREST( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoFechaEmision")
   public String getgxTv_SdtResultado_Resultadofechaemision( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtResultado_Resultadofechaemision()) ;
   }

   @JsonProperty("resultadoFechaEmision")
   public void setgxTv_SdtResultado_Resultadofechaemision(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadofechaemision( GXutil.charToDateREST( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoPathExcel")
   public String getgxTv_SdtResultado_Resultadopathexcel( )
   {
      return GXutil.rtrim(((com.colaveco.SdtResultado)getSdt()).getgxTv_SdtResultado_Resultadopathexcel()) ;
   }

   @JsonProperty("resultadoPathExcel")
   public void setgxTv_SdtResultado_Resultadopathexcel(  String Value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathexcel(Value);
   }


   @GxSeudo
   @JsonProperty("resultadoPathPdf")
   public String getgxTv_SdtResultado_Resultadopathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtResultado)getSdt()).getgxTv_SdtResultado_Resultadopathpdf()) ;
   }

   @JsonProperty("resultadoPathPdf")
   public void setgxTv_SdtResultado_Resultadopathpdf(  String Value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathpdf(Value);
   }


   @GxSeudo
   @JsonProperty("resultadoPathCsv")
   public String getgxTv_SdtResultado_Resultadopathcsv( )
   {
      return GXutil.rtrim(((com.colaveco.SdtResultado)getSdt()).getgxTv_SdtResultado_Resultadopathcsv()) ;
   }

   @JsonProperty("resultadoPathCsv")
   public void setgxTv_SdtResultado_Resultadopathcsv(  String Value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathcsv(Value);
   }


   @GxSeudo
   @JsonProperty("resultadoIdEstado")
   public String getgxTv_SdtResultado_Resultadoidestado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoidestado(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdEstado")
   public void setgxTv_SdtResultado_Resultadoidestado(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoidestado( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoIdLibro")
   public String getgxTv_SdtResultado_Resultadoidlibro( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoidlibro(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdLibro")
   public void setgxTv_SdtResultado_Resultadoidlibro(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoidlibro( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoIdNetTipoinforme")
   public String getgxTv_SdtResultado_Resultadoidnettipoinforme( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoidnettipoinforme(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetTipoinforme")
   public void setgxTv_SdtResultado_Resultadoidnettipoinforme(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoidnettipoinforme( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("resultadoEliminado")
   public Byte getgxTv_SdtResultado_Resultadoeliminado( )
   {
      return ((com.colaveco.SdtResultado)getSdt()).getgxTv_SdtResultado_Resultadoeliminado() ;
   }

   @JsonProperty("resultadoEliminado")
   public void setgxTv_SdtResultado_Resultadoeliminado(  Byte Value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoeliminado(Value);
   }


   @GxSeudo
   @JsonProperty("resultadoAbonado")
   public String getgxTv_SdtResultado_Resultadoabonado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoabonado(), 18, 0)) ;
   }

   @JsonProperty("resultadoAbonado")
   public void setgxTv_SdtResultado_Resultadoabonado(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoabonado( GXutil.lval( Value) );
   }


   public void copyFrom( com.colaveco.SdtResultado_RESTInterface value )
   {
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoid(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoid());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoficha(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoficha());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadocomentarios(value.getgxTv_SdtResultado_Resultadocomentarios());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadouserid(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadouserid());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadotypeid(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadotypeid());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoidnetusuario(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoidnetusuario());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadofechacreado(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadofechacreado());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadofechaemision(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadofechaemision());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathexcel(value.getgxTv_SdtResultado_Resultadopathexcel());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathpdf(value.getgxTv_SdtResultado_Resultadopathpdf());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadopathcsv(value.getgxTv_SdtResultado_Resultadopathcsv());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoidestado(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoidestado());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoidlibro(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoidlibro());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoidnettipoinforme(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoidnettipoinforme());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoeliminado(value.getgxTv_SdtResultado_Resultadoeliminado());
      ((com.colaveco.SdtResultado)getSdt()).setgxTv_SdtResultado_Resultadoabonado(((com.colaveco.SdtResultado)value.getSdt()).getgxTv_SdtResultado_Resultadoabonado());
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

