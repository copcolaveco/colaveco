package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDTTipoinforme", namespace ="Colaveco")
public final  class StructSdtSDTTipoinforme implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTipoinforme( )
   {
      this( -1, new ModelContext( StructSdtSDTTipoinforme.class ));
   }

   public StructSdtSDTTipoinforme( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtSDTTipoinforme( java.util.Vector<StructSdtSDTTipoinforme_SDTTipoinformeItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTTipoinformeItem",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTTipoinforme_SDTTipoinformeItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTTipoinforme_SDTTipoinformeItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTTipoinforme_SDTTipoinformeItem> item = new java.util.Vector<>();
}

