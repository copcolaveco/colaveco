package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Anuncio", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtAnuncio_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtAnuncio>
{
   public SdtAnuncio_RESTLInterface( )
   {
      super(new com.colaveco.SdtAnuncio (-1));
   }

   public SdtAnuncio_RESTLInterface( com.colaveco.SdtAnuncio psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("AnuncioTitulo")
   public String getgxTv_SdtAnuncio_Anunciotitulo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anunciotitulo()) ;
   }

   @JsonProperty("AnuncioTitulo")
   public void setgxTv_SdtAnuncio_Anunciotitulo(  String Value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciotitulo(Value);
   }


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
   private boolean n194AnuncioSubTitulo ;
   private boolean n195AnuncioImagen ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean n196AnuncioPublico ;
}

