package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColPDFdownload_Level_DetailSdt", namespace ="http://tempuri.org/")
public final  class StructSdtColPDFdownload_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtColPDFdownload_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtColPDFdownload_Level_DetailSdt.class ));
   }

   public StructSdtColPDFdownload_Level_DetailSdt( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColPDFdownload_Level_DetailSdt( java.util.Vector<StructSdtPDFdownload_Level_DetailSdt> value )
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

   @javax.xml.bind.annotation.XmlElement(name="PDFdownload_Level_DetailSdt",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtPDFdownload_Level_DetailSdt> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPDFdownload_Level_DetailSdt> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPDFdownload_Level_DetailSdt> item = new java.util.Vector<>();
}

