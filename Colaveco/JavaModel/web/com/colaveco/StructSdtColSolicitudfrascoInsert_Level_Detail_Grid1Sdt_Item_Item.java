package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColSolicitudfrascoInsert_Level_Detail_Grid1Sdt.Item.Item", namespace ="http://tempuri.org/")
public final  class StructSdtColSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item implements Cloneable, java.io.Serializable
{
   public StructSdtColSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item( )
   {
      this( -1, new ModelContext( StructSdtColSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item.class ));
   }

   public StructSdtColSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item( int remoteHandle ,
                                                                             ModelContext context )
   {
   }

   public  StructSdtColSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item( java.util.Vector<StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SolicitudfrascoInsert_Level_Detail_Grid1Sdt.Item.Item",namespace="http://tempuri.org/")
   public java.util.Vector<StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item> item = new java.util.Vector<>();
}

