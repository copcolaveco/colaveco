package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Agencias_Level_Detail_Grid1Sdt", namespace ="http://tempuri.org/")
public final  class StructSdtAgencias_Level_Detail_Grid1Sdt implements Cloneable, java.io.Serializable
{
   public StructSdtAgencias_Level_Detail_Grid1Sdt( )
   {
      this( -1, new ModelContext( StructSdtAgencias_Level_Detail_Grid1Sdt.class ));
   }

   public StructSdtAgencias_Level_Detail_Grid1Sdt( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtAgencias_Level_Detail_Grid1Sdt( java.util.Vector<StructSdtAgencias_Level_Detail_Grid1Sdt_Item> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Agencias_Level_Detail_Grid1Sdt.Item",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtAgencias_Level_Detail_Grid1Sdt_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAgencias_Level_Detail_Grid1Sdt_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAgencias_Level_Detail_Grid1Sdt_Item> item = new java.util.Vector<>();
}

