package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Notificaciones", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtNotificaciones_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtNotificaciones>
{
   public SdtNotificaciones_RESTInterface( )
   {
      super(new com.colaveco.SdtNotificaciones (-1));
   }

   public SdtNotificaciones_RESTInterface( com.colaveco.SdtNotificaciones psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("NotificacionesId")
   public String getgxTv_SdtNotificaciones_Notificacionesid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtNotificaciones_Notificacionesid(), 18, 0)) ;
   }

   @JsonProperty("NotificacionesId")
   public void setgxTv_SdtNotificaciones_Notificacionesid(  String Value )
   {
      sdt.setgxTv_SdtNotificaciones_Notificacionesid( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("NotificacionesFecha")
   public String getgxTv_SdtNotificaciones_Notificacionesfecha( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtNotificaciones_Notificacionesfecha()) ;
   }

   @JsonProperty("NotificacionesFecha")
   public void setgxTv_SdtNotificaciones_Notificacionesfecha(  String Value )
   {
      sdt.setgxTv_SdtNotificaciones_Notificacionesfecha( GXutil.charToTimeREST( Value) );
   }


   @GxSeudo
   @JsonProperty("NotificacionesTipo")
   public String getgxTv_SdtNotificaciones_Notificacionestipo( )
   {
      return GXutil.rtrim(((com.colaveco.SdtNotificaciones)getSdt()).getgxTv_SdtNotificaciones_Notificacionestipo()) ;
   }

   @JsonProperty("NotificacionesTipo")
   public void setgxTv_SdtNotificaciones_Notificacionestipo(  String Value )
   {
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionestipo(Value);
   }


   @GxSeudo
   @JsonProperty("NotificacionesMensaje")
   public String getgxTv_SdtNotificaciones_Notificacionesmensaje( )
   {
      return GXutil.rtrim(((com.colaveco.SdtNotificaciones)getSdt()).getgxTv_SdtNotificaciones_Notificacionesmensaje()) ;
   }

   @JsonProperty("NotificacionesMensaje")
   public void setgxTv_SdtNotificaciones_Notificacionesmensaje(  String Value )
   {
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesmensaje(Value);
   }


   @GxSeudo
   @JsonProperty("NotificacionesIdNetUsuario")
   public String getgxTv_SdtNotificaciones_Notificacionesidnetusuario( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtNotificaciones_Notificacionesidnetusuario(), 18, 0)) ;
   }

   @JsonProperty("NotificacionesIdNetUsuario")
   public void setgxTv_SdtNotificaciones_Notificacionesidnetusuario(  String Value )
   {
      sdt.setgxTv_SdtNotificaciones_Notificacionesidnetusuario( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("NotificacionesDetalle")
   public String getgxTv_SdtNotificaciones_Notificacionesdetalle( )
   {
      return GXutil.rtrim(((com.colaveco.SdtNotificaciones)getSdt()).getgxTv_SdtNotificaciones_Notificacionesdetalle()) ;
   }

   @JsonProperty("NotificacionesDetalle")
   public void setgxTv_SdtNotificaciones_Notificacionesdetalle(  String Value )
   {
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesdetalle(Value);
   }


   public void copyFrom( com.colaveco.SdtNotificaciones_RESTInterface value )
   {
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesid(((com.colaveco.SdtNotificaciones)value.getSdt()).getgxTv_SdtNotificaciones_Notificacionesid());
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesfecha(GXutil.DateTimefromTimeZone(((com.colaveco.SdtNotificaciones)value.getSdt()).getgxTv_SdtNotificaciones_Notificacionesfecha(), "Etc/UTC"));
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionestipo(value.getgxTv_SdtNotificaciones_Notificacionestipo());
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesmensaje(value.getgxTv_SdtNotificaciones_Notificacionesmensaje());
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesidnetusuario(((com.colaveco.SdtNotificaciones)value.getSdt()).getgxTv_SdtNotificaciones_Notificacionesidnetusuario());
      ((com.colaveco.SdtNotificaciones)getSdt()).setgxTv_SdtNotificaciones_Notificacionesdetalle(value.getgxTv_SdtNotificaciones_Notificacionesdetalle());
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

