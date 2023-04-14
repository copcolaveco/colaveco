package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesResultado_Resultado_Section_GeneralSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt>
{
   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt ());
   }

   public SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("resultadoId")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid(), 18, 0)) ;
   }

   @JsonProperty("resultadoId")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetUsuario")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetUsuario")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFechaCreado")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado()) ;
   }

   @JsonProperty("resultadoFechaCreado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoFechaEmision")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision()) ;
   }

   @JsonProperty("resultadoFechaEmision")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoComentarios")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios()) ;
   }

   @JsonProperty("resultadoComentarios")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios(Value);
   }


   @JsonProperty("resultadoUserId")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid(), 18, 0)) ;
   }

   @JsonProperty("resultadoUserId")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoTypeId")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid(), 18, 0)) ;
   }

   @JsonProperty("resultadoTypeId")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoPathExcel")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel()) ;
   }

   @JsonProperty("resultadoPathExcel")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel(Value);
   }


   @JsonProperty("resultadoPathPdf")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf()) ;
   }

   @JsonProperty("resultadoPathPdf")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf(Value);
   }


   @JsonProperty("resultadoPathCsv")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv()) ;
   }

   @JsonProperty("resultadoPathCsv")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv(Value);
   }


   @JsonProperty("resultadoIdEstado")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdEstado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdLibro")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdLibro")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoIdNetTipoinforme")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme(), 18, 0)) ;
   }

   @JsonProperty("resultadoIdNetTipoinforme")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoEliminado")
   public Byte getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado( )
   {
      return ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado() ;
   }

   @JsonProperty("resultadoEliminado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado(  Byte Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado(Value);
   }


   @JsonProperty("resultadoAbonado")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado(), 18, 0)) ;
   }

   @JsonProperty("resultadoAbonado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado( GXutil.lval( Value) );
   }


   int remoteHandle = -1;
}

