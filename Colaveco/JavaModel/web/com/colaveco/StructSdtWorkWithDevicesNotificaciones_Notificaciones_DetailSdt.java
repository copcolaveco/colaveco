package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt.class ));
   }

   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt( int remoteHandle ,
                                                                           ModelContext context )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getGxdynprop( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_N ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop ;
}

