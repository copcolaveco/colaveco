package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColGAMSDLogin_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColGAMSDLogin_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColGAMSDLogin_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColGAMSDLogin_Level_DetailSdt.class ));
   }

   public StructSdtColGAMSDLogin_Level_DetailSdt( int remoteHandle ,
                                                  ModelContext context )
   {
   }

   public  StructSdtColGAMSDLogin_Level_DetailSdt( java.util.Vector<StructSdtGAMSDLogin_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="GAMSDLogin_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtGAMSDLogin_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGAMSDLogin_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGAMSDLogin_Level_DetailSdt> item = new java.util.Vector<>();
}

