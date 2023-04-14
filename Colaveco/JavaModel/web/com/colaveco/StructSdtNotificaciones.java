package com.colaveco ;
import com.genexus.*;

public final  class StructSdtNotificaciones implements Cloneable, java.io.Serializable
{
   public StructSdtNotificaciones( )
   {
      this( -1, new ModelContext( StructSdtNotificaciones.class ));
   }

   public StructSdtNotificaciones( int remoteHandle ,
                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtNotificaciones_Notificacionesfecha = cal.getTime() ;
      gxTv_SdtNotificaciones_Notificacionestipo = "" ;
      gxTv_SdtNotificaciones_Notificacionesmensaje = "" ;
      gxTv_SdtNotificaciones_Notificacionesdetalle = "" ;
      gxTv_SdtNotificaciones_Mode = "" ;
      gxTv_SdtNotificaciones_Notificacionesfecha_Z = cal.getTime() ;
      gxTv_SdtNotificaciones_Notificacionestipo_Z = "" ;
      gxTv_SdtNotificaciones_Notificacionesmensaje_Z = "" ;
      gxTv_SdtNotificaciones_Notificacionesdetalle_Z = "" ;
      gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(1) ;
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(1) ;
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
      return gxTv_SdtNotificaciones_Notificacionesid ;
   }

   public void setNotificacionesid( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesid = value ;
   }

   public java.util.Date getNotificacionesfecha( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha ;
   }

   public void setNotificacionesfecha( java.util.Date value )
   {
      gxTv_SdtNotificaciones_Notificacionesfecha_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesfecha = value ;
   }

   public String getNotificacionestipo( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo ;
   }

   public void setNotificacionestipo( String value )
   {
      gxTv_SdtNotificaciones_Notificacionestipo_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionestipo = value ;
   }

   public String getNotificacionesmensaje( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje ;
   }

   public void setNotificacionesmensaje( String value )
   {
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesmensaje = value ;
   }

   public long getNotificacionesidnetusuario( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario ;
   }

   public void setNotificacionesidnetusuario( long value )
   {
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesidnetusuario = value ;
   }

   public String getNotificacionesdetalle( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle ;
   }

   public void setNotificacionesdetalle( String value )
   {
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = (byte)(0) ;
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesdetalle = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtNotificaciones_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtNotificaciones_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Initialized = value ;
   }

   public long getNotificacionesid_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesid_Z ;
   }

   public void setNotificacionesid_Z( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesid_Z = value ;
   }

   public java.util.Date getNotificacionesfecha_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha_Z ;
   }

   public void setNotificacionesfecha_Z( java.util.Date value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesfecha_Z = value ;
   }

   public String getNotificacionestipo_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo_Z ;
   }

   public void setNotificacionestipo_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionestipo_Z = value ;
   }

   public String getNotificacionesmensaje_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje_Z ;
   }

   public void setNotificacionesmensaje_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesmensaje_Z = value ;
   }

   public long getNotificacionesidnetusuario_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z ;
   }

   public void setNotificacionesidnetusuario_Z( long value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z = value ;
   }

   public String getNotificacionesdetalle_Z( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle_Z ;
   }

   public void setNotificacionesdetalle_Z( String value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesdetalle_Z = value ;
   }

   public byte getNotificacionesfecha_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesfecha_N ;
   }

   public void setNotificacionesfecha_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesfecha_N = value ;
   }

   public byte getNotificacionestipo_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionestipo_N ;
   }

   public void setNotificacionestipo_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionestipo_N = value ;
   }

   public byte getNotificacionesmensaje_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesmensaje_N ;
   }

   public void setNotificacionesmensaje_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesmensaje_N = value ;
   }

   public byte getNotificacionesidnetusuario_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesidnetusuario_N ;
   }

   public void setNotificacionesidnetusuario_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesidnetusuario_N = value ;
   }

   public byte getNotificacionesdetalle_N( )
   {
      return gxTv_SdtNotificaciones_Notificacionesdetalle_N ;
   }

   public void setNotificacionesdetalle_N( byte value )
   {
      gxTv_SdtNotificaciones_N = (byte)(0) ;
      gxTv_SdtNotificaciones_Notificacionesdetalle_N = value ;
   }

   protected byte gxTv_SdtNotificaciones_Notificacionesfecha_N ;
   protected byte gxTv_SdtNotificaciones_Notificacionestipo_N ;
   protected byte gxTv_SdtNotificaciones_Notificacionesmensaje_N ;
   protected byte gxTv_SdtNotificaciones_Notificacionesidnetusuario_N ;
   protected byte gxTv_SdtNotificaciones_Notificacionesdetalle_N ;
   private byte gxTv_SdtNotificaciones_N ;
   protected short gxTv_SdtNotificaciones_Initialized ;
   protected long gxTv_SdtNotificaciones_Notificacionesid ;
   protected long gxTv_SdtNotificaciones_Notificacionesidnetusuario ;
   protected long gxTv_SdtNotificaciones_Notificacionesid_Z ;
   protected long gxTv_SdtNotificaciones_Notificacionesidnetusuario_Z ;
   protected String gxTv_SdtNotificaciones_Mode ;
   protected String gxTv_SdtNotificaciones_Notificacionestipo ;
   protected String gxTv_SdtNotificaciones_Notificacionesmensaje ;
   protected String gxTv_SdtNotificaciones_Notificacionesdetalle ;
   protected String gxTv_SdtNotificaciones_Notificacionestipo_Z ;
   protected String gxTv_SdtNotificaciones_Notificacionesmensaje_Z ;
   protected String gxTv_SdtNotificaciones_Notificacionesdetalle_Z ;
   protected java.util.Date gxTv_SdtNotificaciones_Notificacionesfecha ;
   protected java.util.Date gxTv_SdtNotificaciones_Notificacionesfecha_Z ;
}

