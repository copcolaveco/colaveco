package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColTipoinformeFiltro_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColTipoinformeFiltro_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColTipoinformeFiltro_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColTipoinformeFiltro_Level_DetailSdt.class ));
   }

   public StructSdtColTipoinformeFiltro_Level_DetailSdt( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColTipoinformeFiltro_Level_DetailSdt( java.util.Vector<StructSdtTipoinformeFiltro_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="TipoinformeFiltro_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtTipoinformeFiltro_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTipoinformeFiltro_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTipoinformeFiltro_Level_DetailSdt> item = new java.util.Vector<>();
}

