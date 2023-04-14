package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "gpxMenuItems", namespace ="Colaveco")
public final  class StructSdtgpxMenuItems implements Cloneable, java.io.Serializable
{
   public StructSdtgpxMenuItems( )
   {
      this( -1, new ModelContext( StructSdtgpxMenuItems.class ));
   }

   public StructSdtgpxMenuItems( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtgpxMenuItems( java.util.Vector<StructSdtgpxMenuItems_gpxMenuItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="gpxMenuItem",namespace="Colaveco")
   public java.util.Vector<StructSdtgpxMenuItems_gpxMenuItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtgpxMenuItems_gpxMenuItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtgpxMenuItems_gpxMenuItem> item = new java.util.Vector<>();
}

