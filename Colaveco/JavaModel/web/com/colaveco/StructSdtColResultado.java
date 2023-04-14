package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColResultado", namespace ="Colaveco")
public final  class StructSdtColResultado implements Cloneable, java.io.Serializable
{
   public StructSdtColResultado( )
   {
      this( -1, new ModelContext( StructSdtColResultado.class ));
   }

   public StructSdtColResultado( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColResultado( java.util.Vector<StructSdtResultado> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Resultado",namespace="Colaveco")
   public java.util.Vector<StructSdtResultado> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtResultado> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtResultado> item = new java.util.Vector<>();
}

