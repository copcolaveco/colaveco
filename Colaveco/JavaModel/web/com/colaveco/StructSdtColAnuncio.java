package com.colaveco ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColAnuncio", namespace ="Colaveco")
public final  class StructSdtColAnuncio implements Cloneable, java.io.Serializable
{
   public StructSdtColAnuncio( )
   {
      this( -1, new ModelContext( StructSdtColAnuncio.class ));
   }

   public StructSdtColAnuncio( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColAnuncio( java.util.Vector<StructSdtAnuncio> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Anuncio",namespace="Colaveco")
   public java.util.Vector<StructSdtAnuncio> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAnuncio> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAnuncio> item = new java.util.Vector<>();
}

