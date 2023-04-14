package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColSolicitudFrasco", namespace ="Colaveco")
public final  class StructSdtColSolicitudFrasco implements Cloneable, java.io.Serializable
{
   public StructSdtColSolicitudFrasco( )
   {
      this( -1, new ModelContext( StructSdtColSolicitudFrasco.class ));
   }

   public StructSdtColSolicitudFrasco( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSolicitudFrasco( java.util.Vector<StructSdtSolicitudFrasco> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SolicitudFrasco",namespace="Colaveco")
   public java.util.Vector<StructSdtSolicitudFrasco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSolicitudFrasco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSolicitudFrasco> item = new java.util.Vector<>();
}

