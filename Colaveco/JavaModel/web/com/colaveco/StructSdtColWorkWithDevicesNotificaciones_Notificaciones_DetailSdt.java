package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt.class ));
   }

   public StructSdtColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt( int remoteHandle ,
                                                                              ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesNotificaciones_Notificaciones_DetailSdt( java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesNotificaciones_Notificaciones_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt> item = new java.util.Vector<>();
}

