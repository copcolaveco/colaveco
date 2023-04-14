package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColSDTAnuncio", namespace ="Colaveco")
public final  class StructSdtColSDTAnuncio implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTAnuncio( )
   {
      this( -1, new ModelContext( StructSdtColSDTAnuncio.class ));
   }

   public StructSdtColSDTAnuncio( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTAnuncio( java.util.Vector<StructSdtSDTAnuncio> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDTAnuncio",namespace="Colaveco")
   public java.util.Vector<StructSdtSDTAnuncio> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTAnuncio> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTAnuncio> item = new java.util.Vector<>();
}

