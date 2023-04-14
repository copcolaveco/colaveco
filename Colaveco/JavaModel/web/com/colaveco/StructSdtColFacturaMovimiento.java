package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColFacturaMovimiento", namespace ="Colaveco")
public final  class StructSdtColFacturaMovimiento implements Cloneable, java.io.Serializable
{
   public StructSdtColFacturaMovimiento( )
   {
      this( -1, new ModelContext( StructSdtColFacturaMovimiento.class ));
   }

   public StructSdtColFacturaMovimiento( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColFacturaMovimiento( java.util.Vector<StructSdtFacturaMovimiento> value )
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

   @javax.xml.bind.annotation.XmlElement(name="FacturaMovimiento",namespace="Colaveco")
   public java.util.Vector<StructSdtFacturaMovimiento> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFacturaMovimiento> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFacturaMovimiento> item = new java.util.Vector<>();
}

