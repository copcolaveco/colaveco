package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "HomeColaveco_Level_Detail_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>
{
   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item ());
   }

   public SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("AnuncioId")
   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid(), 18, 0)) ;
   }

   @JsonProperty("AnuncioId")
   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid(  String Value )
   {
      sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid( GXutil.lval( Value) );
   }


   @JsonProperty("AnuncioTitulo")
   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo()) ;
   }

   @JsonProperty("AnuncioTitulo")
   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo(  String Value )
   {
      ((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo(Value);
   }


   @JsonProperty("AnuncioDescripcion")
   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion()) ;
   }

   @JsonProperty("AnuncioDescripcion")
   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion(  String Value )
   {
      ((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion(Value);
   }


   @JsonProperty("AnuncioImagen")
   public String getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen( )
   {
      if ( GXutil.strcmp(((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen(), "") != 0 )
      {
         return GXutil.getRelativeURL(((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen()) ;
      }
      else
      {
         return GXutil.rtrim(((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi()) ;
      }
   }

   @JsonProperty("AnuncioImagen")
   public void setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen(  String Value )
   {
      ((com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen(Value);
   }


   int remoteHandle = -1;
}

