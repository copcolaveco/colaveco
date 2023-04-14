package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColWorkWithDevicesResultado_Resultado_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColWorkWithDevicesResultado_Resultado_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColWorkWithDevicesResultado_Resultado_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColWorkWithDevicesResultado_Resultado_DetailSdt.class ));
   }

   public StructSdtColWorkWithDevicesResultado_Resultado_DetailSdt( int remoteHandle ,
                                                                    ModelContext context )
   {
   }

   public  StructSdtColWorkWithDevicesResultado_Resultado_DetailSdt( java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="WorkWithDevicesResultado_Resultado_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWorkWithDevicesResultado_Resultado_DetailSdt> item = new java.util.Vector<>();
}

