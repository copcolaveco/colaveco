package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Notificaciones", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtNotificaciones_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtNotificaciones>
{
   public SdtNotificaciones_RESTLInterface( )
   {
      super(new com.colaveco.SdtNotificaciones (-1));
   }

   public SdtNotificaciones_RESTLInterface( com.colaveco.SdtNotificaciones psdt )
   {
      super(psdt);
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


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
   private boolean n169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n171NotificacionesMensaje ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean n173NotificacionesDetalle ;
}

