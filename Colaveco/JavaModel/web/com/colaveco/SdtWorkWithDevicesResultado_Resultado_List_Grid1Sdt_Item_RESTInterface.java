package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>
{
   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item ());
   }

   public SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("resultadoId")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid(), 18, 0)) ;
   }

   @JsonProperty("resultadoId")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( GXutil.lval( Value) );
   }


   @JsonProperty("resultadoFechaCreado")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado()) ;
   }

   @JsonProperty("resultadoFechaCreado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("resultadoPathPdf")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf()) ;
   }

   @JsonProperty("resultadoPathPdf")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf(Value);
   }


   @JsonProperty("Imagen")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen( )
   {
      if ( GXutil.strcmp(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen(), "") != 0 )
      {
         return GXutil.getRelativeURL(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen()) ;
      }
      else
      {
         return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi()) ;
      }
   }

   @JsonProperty("Imagen")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen(Value);
   }


   @JsonProperty("Estado")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado()) ;
   }

   @JsonProperty("Estado")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado(Value);
   }


   @JsonProperty("Tipoinformenombre")
   public String getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre()) ;
   }

   @JsonProperty("Tipoinformenombre")
   public void setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre(Value);
   }


   int remoteHandle = -1;
}

