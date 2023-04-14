package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Anuncio", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtAnuncio_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtAnuncio>
{
   public SdtAnuncio_RESTInterface( )
   {
      super(new com.colaveco.SdtAnuncio (-1));
   }

   public SdtAnuncio_RESTInterface( com.colaveco.SdtAnuncio psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("AnuncioId")
   public String getgxTv_SdtAnuncio_Anuncioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtAnuncio_Anuncioid(), 18, 0)) ;
   }

   @JsonProperty("AnuncioId")
   public void setgxTv_SdtAnuncio_Anuncioid(  String Value )
   {
      sdt.setgxTv_SdtAnuncio_Anuncioid( GXutil.lval( Value) );
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


   @GxSeudo
   @JsonProperty("AnuncioSubTitulo")
   public String getgxTv_SdtAnuncio_Anunciosubtitulo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anunciosubtitulo()) ;
   }

   @JsonProperty("AnuncioSubTitulo")
   public void setgxTv_SdtAnuncio_Anunciosubtitulo(  String Value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciosubtitulo(Value);
   }


   @GxSeudo
   @JsonProperty("AnuncioDescripcion")
   public String getgxTv_SdtAnuncio_Anunciodescripcion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anunciodescripcion()) ;
   }

   @JsonProperty("AnuncioDescripcion")
   public void setgxTv_SdtAnuncio_Anunciodescripcion(  String Value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciodescripcion(Value);
   }


   @GxUpload
   @JsonProperty("AnuncioImagen")
   public String getgxTv_SdtAnuncio_Anuncioimagen( )
   {
      if ( GXutil.strcmp(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anuncioimagen(), "") != 0 )
      {
         return GXutil.getRelativeURL(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anuncioimagen()) ;
      }
      else
      {
         return GXutil.rtrim(((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anuncioimagen_gxi()) ;
      }
   }

   @JsonProperty("AnuncioImagen")
   public void setgxTv_SdtAnuncio_Anuncioimagen(  String Value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen(Value);
   }


   @GxSeudo
   @JsonProperty("AnuncioPublico")
   public Boolean getgxTv_SdtAnuncio_Anunciopublico( )
   {
      return ((com.colaveco.SdtAnuncio)getSdt()).getgxTv_SdtAnuncio_Anunciopublico() ;
   }

   @JsonProperty("AnuncioPublico")
   public void setgxTv_SdtAnuncio_Anunciopublico(  Boolean Value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciopublico(Value);
   }


   public void copyFrom( com.colaveco.SdtAnuncio_RESTInterface value )
   {
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioid(((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioid());
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciotitulo(value.getgxTv_SdtAnuncio_Anunciotitulo());
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciosubtitulo(value.getgxTv_SdtAnuncio_Anunciosubtitulo());
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciodescripcion(value.getgxTv_SdtAnuncio_Anunciodescripcion());
      if ( ((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen() != null && GXutil.isUploadPrefix(((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen()) )
      {
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen(((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen());
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen_gxi("");
      }
      if ( ((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen() != null && GXutil.isAbsoluteURL(((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen()) )
      {
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen("");
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen_gxi(((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen());
      }
      if ( ((com.colaveco.SdtAnuncio)value.getSdt()).getgxTv_SdtAnuncio_Anuncioimagen() == null )
      {
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen("");
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen_gxi("");
         ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anuncioimagen_SetNull();
      }
      ((com.colaveco.SdtAnuncio)getSdt()).setgxTv_SdtAnuncio_Anunciopublico(value.getgxTv_SdtAnuncio_Anunciopublico());
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

