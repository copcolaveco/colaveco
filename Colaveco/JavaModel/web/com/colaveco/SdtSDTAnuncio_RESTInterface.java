package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDTAnuncio", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTAnuncio_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSDTAnuncio>
{
   public SdtSDTAnuncio_RESTInterface( )
   {
      super(new com.colaveco.SdtSDTAnuncio ());
   }

   public SdtSDTAnuncio_RESTInterface( com.colaveco.SdtSDTAnuncio psdt )
   {
      super(psdt);
   }

   @JsonProperty("AnuncioId")
   public String getgxTv_SdtSDTAnuncio_Anuncioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTAnuncio_Anuncioid(), 18, 0)) ;
   }

   @JsonProperty("AnuncioId")
   public void setgxTv_SdtSDTAnuncio_Anuncioid(  String Value )
   {
      sdt.setgxTv_SdtSDTAnuncio_Anuncioid( GXutil.lval( Value) );
   }


   @JsonProperty("AnuncioTitulo")
   public String getgxTv_SdtSDTAnuncio_Anunciotitulo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTAnuncio)getSdt()).getgxTv_SdtSDTAnuncio_Anunciotitulo()) ;
   }

   @JsonProperty("AnuncioTitulo")
   public void setgxTv_SdtSDTAnuncio_Anunciotitulo(  String Value )
   {
      ((com.colaveco.SdtSDTAnuncio)getSdt()).setgxTv_SdtSDTAnuncio_Anunciotitulo(Value);
   }


   @JsonProperty("AnuncioSubTitulo")
   public String getgxTv_SdtSDTAnuncio_Anunciosubtitulo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSDTAnuncio)getSdt()).getgxTv_SdtSDTAnuncio_Anunciosubtitulo()) ;
   }

   @JsonProperty("AnuncioSubTitulo")
   public void setgxTv_SdtSDTAnuncio_Anunciosubtitulo(  String Value )
   {
      ((com.colaveco.SdtSDTAnuncio)getSdt()).setgxTv_SdtSDTAnuncio_Anunciosubtitulo(Value);
   }


   @JsonProperty("AnuncioImagen")
   public String getgxTv_SdtSDTAnuncio_Anuncioimagen( )
   {
      return GXutil.getRelativeURL(((com.colaveco.SdtSDTAnuncio)getSdt()).getgxTv_SdtSDTAnuncio_Anuncioimagen()) ;
   }

   @JsonProperty("AnuncioImagen")
   public void setgxTv_SdtSDTAnuncio_Anuncioimagen(  String Value )
   {
      ((com.colaveco.SdtSDTAnuncio)getSdt()).setgxTv_SdtSDTAnuncio_Anuncioimagen(Value);
   }


   @JsonProperty("AnuncioPublico")
   public Boolean getgxTv_SdtSDTAnuncio_Anunciopublico( )
   {
      return ((com.colaveco.SdtSDTAnuncio)getSdt()).getgxTv_SdtSDTAnuncio_Anunciopublico() ;
   }

   @JsonProperty("AnuncioPublico")
   public void setgxTv_SdtSDTAnuncio_Anunciopublico(  Boolean Value )
   {
      ((com.colaveco.SdtSDTAnuncio)getSdt()).setgxTv_SdtSDTAnuncio_Anunciopublico(Value);
   }


   int remoteHandle = -1;
}

