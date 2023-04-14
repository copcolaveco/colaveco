package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColSDTUsuario", namespace ="Colaveco")
public final  class StructSdtColSDTUsuario implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTUsuario( )
   {
      this( -1, new ModelContext( StructSdtColSDTUsuario.class ));
   }

   public StructSdtColSDTUsuario( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTUsuario( java.util.Vector<StructSdtSDTUsuario> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTUsuario",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTUsuario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTUsuario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTUsuario> item = new java.util.Vector<>();
}

