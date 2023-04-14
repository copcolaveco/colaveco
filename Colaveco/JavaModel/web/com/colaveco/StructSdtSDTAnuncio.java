package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTAnuncio implements Cloneable, java.io.Serializable
{
   public StructSdtSDTAnuncio( )
   {
      this( -1, new ModelContext( StructSdtSDTAnuncio.class ));
   }

   public StructSdtSDTAnuncio( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSDTAnuncio_Anuncioid = 1 ;
      gxTv_SdtSDTAnuncio_Anunciotitulo = "" ;
      gxTv_SdtSDTAnuncio_Anunciosubtitulo = "" ;
      gxTv_SdtSDTAnuncio_Anuncioimagen = "" ;
      gxTv_SdtSDTAnuncio_Anuncioimagen_gxi = "" ;
      gxTv_SdtSDTAnuncio_Anunciodescripcion = "" ;
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

   public long getAnuncioid( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioid ;
   }

   public void setAnuncioid( long value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioid = value ;
   }

   public String getAnunciotitulo( )
   {
      return gxTv_SdtSDTAnuncio_Anunciotitulo ;
   }

   public void setAnunciotitulo( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciotitulo = value ;
   }

   public String getAnunciosubtitulo( )
   {
      return gxTv_SdtSDTAnuncio_Anunciosubtitulo ;
   }

   public void setAnunciosubtitulo( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciosubtitulo = value ;
   }

   public String getAnuncioimagen( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioimagen ;
   }

   public void setAnuncioimagen( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioimagen = value ;
   }

   public String getAnuncioimagen_gxi( )
   {
      return gxTv_SdtSDTAnuncio_Anuncioimagen_gxi ;
   }

   public void setAnuncioimagen_gxi( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anuncioimagen_gxi = value ;
   }

   public boolean getAnunciopublico( )
   {
      return gxTv_SdtSDTAnuncio_Anunciopublico ;
   }

   public void setAnunciopublico( boolean value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciopublico = value ;
   }

   public String getAnunciodescripcion( )
   {
      return gxTv_SdtSDTAnuncio_Anunciodescripcion ;
   }

   public void setAnunciodescripcion( String value )
   {
      gxTv_SdtSDTAnuncio_N = (byte)(0) ;
      gxTv_SdtSDTAnuncio_Anunciodescripcion = value ;
   }

   protected byte gxTv_SdtSDTAnuncio_N ;
   protected long gxTv_SdtSDTAnuncio_Anuncioid ;
   protected boolean gxTv_SdtSDTAnuncio_Anunciopublico ;
   protected String gxTv_SdtSDTAnuncio_Anunciotitulo ;
   protected String gxTv_SdtSDTAnuncio_Anunciosubtitulo ;
   protected String gxTv_SdtSDTAnuncio_Anuncioimagen_gxi ;
   protected String gxTv_SdtSDTAnuncio_Anunciodescripcion ;
   protected String gxTv_SdtSDTAnuncio_Anuncioimagen ;
}

