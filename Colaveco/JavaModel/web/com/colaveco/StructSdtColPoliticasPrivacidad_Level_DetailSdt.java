package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColPoliticasPrivacidad_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColPoliticasPrivacidad_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColPoliticasPrivacidad_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColPoliticasPrivacidad_Level_DetailSdt.class ));
   }

   public StructSdtColPoliticasPrivacidad_Level_DetailSdt( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColPoliticasPrivacidad_Level_DetailSdt( java.util.Vector<StructSdtPoliticasPrivacidad_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="PoliticasPrivacidad_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtPoliticasPrivacidad_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPoliticasPrivacidad_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPoliticasPrivacidad_Level_DetailSdt> item = new java.util.Vector<>();
}

