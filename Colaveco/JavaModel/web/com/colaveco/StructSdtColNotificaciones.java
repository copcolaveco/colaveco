package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColNotificaciones", namespace ="Colaveco")
public final  class StructSdtColNotificaciones implements Cloneable, java.io.Serializable
{
   public StructSdtColNotificaciones( )
   {
      this( -1, new ModelContext( StructSdtColNotificaciones.class ));
   }

   public StructSdtColNotificaciones( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColNotificaciones( java.util.Vector<StructSdtNotificaciones> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Notificaciones",namespace="Colaveco")
   public java.util.Vector<StructSdtNotificaciones> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtNotificaciones> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtNotificaciones> item = new java.util.Vector<>();
}

