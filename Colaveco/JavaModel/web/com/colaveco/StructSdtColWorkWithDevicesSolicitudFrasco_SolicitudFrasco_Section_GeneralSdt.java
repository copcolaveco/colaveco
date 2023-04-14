package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.class ));
   }

   public StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( int remoteHandle ,
                                                                                         ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt> item = new java.util.Vector<>();
}

