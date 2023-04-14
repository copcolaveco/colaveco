package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDTResultados", namespace ="Colaveco")
public final  class StructSdtSDTResultados implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResultados( )
   {
      this( -1, new ModelContext( StructSdtSDTResultados.class ));
   }

   public StructSdtSDTResultados( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtSDTResultados( java.util.Vector<StructSdtSDTResultados_SDTResultadosItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTResultadosItem",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTResultados_SDTResultadosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTResultados_SDTResultadosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTResultados_SDTResultadosItem> item = new java.util.Vector<>();
}

