package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColAgencias_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColAgencias_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColAgencias_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColAgencias_Level_DetailSdt.class ));
   }

   public StructSdtColAgencias_Level_DetailSdt( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtColAgencias_Level_DetailSdt( java.util.Vector<StructSdtAgencias_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Agencias_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtAgencias_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAgencias_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAgencias_Level_DetailSdt> item = new java.util.Vector<>();
}

