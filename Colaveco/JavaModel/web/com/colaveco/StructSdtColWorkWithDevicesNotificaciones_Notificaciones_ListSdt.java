package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesNotificaciones_Notificaciones_ListSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesNotificaciones_Notificaciones_ListSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesNotificaciones_Notificaciones_ListSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesNotificaciones_Notificaciones_ListSdt.class ));
   }

   public StructSdtColWorkWithDevicesNotificaciones_Notificaciones_ListSdt( int remoteHandle ,
                                                                            ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesNotificaciones_Notificaciones_ListSdt( java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt> value )
   {
      item = value;
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesNotificaciones_Notificaciones_ListSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt> item = new java.util.Vector<>();
}

