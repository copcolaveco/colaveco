package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt.class ));
   }

   public StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( int remoteHandle ,
                                                                                  ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt> item = new java.util.Vector<>();
}

