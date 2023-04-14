package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt.class ));
   }

   public StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt( int remoteHandle ,
                                                                                ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt( java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt> item = new java.util.Vector<>();
}

