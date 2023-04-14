package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColCliente", namespace ="Colaveco")
public final  class StructSdtColCliente implements Cloneable, java.io.Serializable
{
   public StructSdtColCliente( )
   {
      this( -1, new ModelContext( StructSdtColCliente.class ));
   }

   public StructSdtColCliente( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColCliente( java.util.Vector<StructSdtCliente> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Cliente",namespace="Colaveco")
   public java.util.Vector<StructSdtCliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCliente> item = new java.util.Vector<>();
}

