package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.class ));
   }

   public StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( int remoteHandle ,
                                                                                             ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt> item = new java.util.Vector<>();
}

