package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColSDTResultado", namespace ="Colaveco")
public final  class StructSdtColSDTResultado implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTResultado( )
   {
      this( -1, new ModelContext( StructSdtColSDTResultado.class ));
   }

   public StructSdtColSDTResultado( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTResultado( java.util.Vector<StructSdtSDTResultado> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTResultado",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTResultado> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTResultado> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTResultado> item = new java.util.Vector<>();
}

