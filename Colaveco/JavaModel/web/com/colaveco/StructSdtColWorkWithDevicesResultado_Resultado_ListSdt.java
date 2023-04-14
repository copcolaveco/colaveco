package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesResultado_Resultado_ListSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesResultado_Resultado_ListSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesResultado_Resultado_ListSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesResultado_Resultado_ListSdt.class ));
   }

   public StructSdtColWorkWithDevicesResultado_Resultado_ListSdt( int remoteHandle ,
                                                                  ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesResultado_Resultado_ListSdt( java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_ListSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesResultado_Resultado_ListSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_ListSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_ListSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_ListSdt> item = new java.util.Vector<>();
}

