package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.class ));
   }

   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt( int remoteHandle ,
                                                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = cal.getTime() ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle = "" ;
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

   public long getNotificacionesid( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid ;
   }

   public void setNotificacionesid( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid = value ;
   }

   public java.util.Date getNotificacionesfecha( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha ;
   }

   public void setNotificacionesfecha( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha = value ;
   }

   public String getNotificacionestipo( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo ;
   }

   public void setNotificacionestipo( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo = value ;
   }

   public String getNotificacionesmensaje( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje ;
   }

   public void setNotificacionesmensaje( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje = value ;
   }

   public long getNotificacionesidnetusuario( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario ;
   }

   public void setNotificacionesidnetusuario( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario = value ;
   }

   public String getNotificacionesdetalle( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle ;
   }

   public void setNotificacionesdetalle( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_N ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle ;
   protected java.util.Date gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha ;
}

