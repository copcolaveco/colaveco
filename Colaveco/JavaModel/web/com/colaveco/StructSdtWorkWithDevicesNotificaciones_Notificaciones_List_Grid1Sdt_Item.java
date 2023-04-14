package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item.class ));
   }

   public StructSdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item( int remoteHandle ,
                                                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = cal.getTime() ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen = "" ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi = "" ;
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
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid ;
   }

   public void setNotificacionesid( long value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid = value ;
   }

   public java.util.Date getNotificacionesfecha( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha ;
   }

   public void setNotificacionesfecha( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha = value ;
   }

   public String getNotificacionesmensaje( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje ;
   }

   public void setNotificacionesmensaje( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje = value ;
   }

   public String getNotificacionesimagen( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen ;
   }

   public void setNotificacionesimagen( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen = value ;
   }

   public String getNotificacionesimagen_gxi( )
   {
      return gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi ;
   }

   public void setNotificacionesimagen_gxi( String value )
   {
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_N ;
   protected long gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi ;
   protected String gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen ;
   protected java.util.Date gxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha ;
}

