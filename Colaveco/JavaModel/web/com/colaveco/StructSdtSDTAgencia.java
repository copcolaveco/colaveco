package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDTAgencia", namespace ="Colaveco")
public final  class StructSdtSDTAgencia implements Cloneable, java.io.Serializable
{
   public StructSdtSDTAgencia( )
   {
      this( -1, new ModelContext( StructSdtSDTAgencia.class ));
   }

   public StructSdtSDTAgencia( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtSDTAgencia( java.util.Vector<StructSdtSDTAgencia_SDTAgenciaItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTAgenciaItem",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTAgencia_SDTAgenciaItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTAgencia_SDTAgenciaItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTAgencia_SDTAgenciaItem> item = new java.util.Vector<>();
}

