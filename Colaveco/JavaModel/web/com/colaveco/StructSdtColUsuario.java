package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColUsuario", namespace ="Colaveco")
public final  class StructSdtColUsuario implements Cloneable, java.io.Serializable
{
   public StructSdtColUsuario( )
   {
      this( -1, new ModelContext( StructSdtColUsuario.class ));
   }

   public StructSdtColUsuario( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColUsuario( java.util.Vector<StructSdtUsuario> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Usuario",namespace="Colaveco")
   public java.util.Vector<StructSdtUsuario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtUsuario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtUsuario> item = new java.util.Vector<>();
}

