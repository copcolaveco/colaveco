package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColMisDatos_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColMisDatos_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColMisDatos_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColMisDatos_Level_DetailSdt.class ));
   }

   public StructSdtColMisDatos_Level_DetailSdt( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtColMisDatos_Level_DetailSdt( java.util.Vector<StructSdtMisDatos_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="MisDatos_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtMisDatos_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMisDatos_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMisDatos_Level_DetailSdt> item = new java.util.Vector<>();
}

