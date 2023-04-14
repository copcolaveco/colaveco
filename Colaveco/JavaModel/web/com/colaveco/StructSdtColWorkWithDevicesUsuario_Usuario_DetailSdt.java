package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesUsuario_Usuario_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesUsuario_Usuario_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesUsuario_Usuario_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesUsuario_Usuario_DetailSdt.class ));
   }

   public StructSdtColWorkWithDevicesUsuario_Usuario_DetailSdt( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesUsuario_Usuario_DetailSdt( java.util.Vector<StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesUsuario_Usuario_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt> item = new java.util.Vector<>();
}

