package com.colaveco ;
import com.genexus.*;

public final  class StructSdtAnuncio implements Cloneable, java.io.Serializable
{
   public StructSdtAnuncio( )
   {
      this( -1, new ModelContext( StructSdtAnuncio.class ));
   }

   public StructSdtAnuncio( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtAnuncio_Anuncioid = 1 ;
      gxTv_SdtAnuncio_Anunciotitulo = "" ;
      gxTv_SdtAnuncio_Anunciosubtitulo = "" ;
      gxTv_SdtAnuncio_Anunciodescripcion = "" ;
      gxTv_SdtAnuncio_Anuncioimagen = "" ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi = "" ;
      gxTv_SdtAnuncio_Mode = "" ;
      gxTv_SdtAnuncio_Anunciotitulo_Z = "" ;
      gxTv_SdtAnuncio_Anunciosubtitulo_Z = "" ;
      gxTv_SdtAnuncio_Anunciodescripcion_Z = "" ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = "" ;
      gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(1) ;
      gxTv_SdtAnuncio_Anunciopublico_N = (byte)(1) ;
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
      return gxTv_SdtAnuncio_Anuncioid ;
   }

   public void setAnuncioid( long value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioid = value ;
   }

   public String getAnunciotitulo( )
   {
      return gxTv_SdtAnuncio_Anunciotitulo ;
   }

   public void setAnunciotitulo( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciotitulo = value ;
   }

   public String getAnunciosubtitulo( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo ;
   }

   public void setAnunciosubtitulo( String value )
   {
      gxTv_SdtAnuncio_Anunciosubtitulo_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciosubtitulo = value ;
   }

   public String getAnunciodescripcion( )
   {
      return gxTv_SdtAnuncio_Anunciodescripcion ;
   }

   public void setAnunciodescripcion( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciodescripcion = value ;
   }

   public String getAnuncioimagen( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen ;
   }

   public void setAnuncioimagen( String value )
   {
      gxTv_SdtAnuncio_Anuncioimagen_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioimagen = value ;
   }

   public String getAnuncioimagen_gxi( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi ;
   }

   public void setAnuncioimagen_gxi( String value )
   {
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi = value ;
   }

   public boolean getAnunciopublico( )
   {
      return gxTv_SdtAnuncio_Anunciopublico ;
   }

   public void setAnunciopublico( boolean value )
   {
      gxTv_SdtAnuncio_Anunciopublico_N = (byte)(0) ;
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciopublico = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtAnuncio_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtAnuncio_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Initialized = value ;
   }

   public long getAnuncioid_Z( )
   {
      return gxTv_SdtAnuncio_Anuncioid_Z ;
   }

   public void setAnuncioid_Z( long value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioid_Z = value ;
   }

   public String getAnunciotitulo_Z( )
   {
      return gxTv_SdtAnuncio_Anunciotitulo_Z ;
   }

   public void setAnunciotitulo_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciotitulo_Z = value ;
   }

   public String getAnunciosubtitulo_Z( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo_Z ;
   }

   public void setAnunciosubtitulo_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciosubtitulo_Z = value ;
   }

   public String getAnunciodescripcion_Z( )
   {
      return gxTv_SdtAnuncio_Anunciodescripcion_Z ;
   }

   public void setAnunciodescripcion_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciodescripcion_Z = value ;
   }

   public boolean getAnunciopublico_Z( )
   {
      return gxTv_SdtAnuncio_Anunciopublico_Z ;
   }

   public void setAnunciopublico_Z( boolean value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciopublico_Z = value ;
   }

   public String getAnuncioimagen_gxi_Z( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi_Z ;
   }

   public void setAnuncioimagen_gxi_Z( String value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi_Z = value ;
   }

   public byte getAnunciosubtitulo_N( )
   {
      return gxTv_SdtAnuncio_Anunciosubtitulo_N ;
   }

   public void setAnunciosubtitulo_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciosubtitulo_N = value ;
   }

   public byte getAnuncioimagen_N( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_N ;
   }

   public void setAnuncioimagen_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioimagen_N = value ;
   }

   public byte getAnunciopublico_N( )
   {
      return gxTv_SdtAnuncio_Anunciopublico_N ;
   }

   public void setAnunciopublico_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anunciopublico_N = value ;
   }

   public byte getAnuncioimagen_gxi_N( )
   {
      return gxTv_SdtAnuncio_Anuncioimagen_gxi_N ;
   }

   public void setAnuncioimagen_gxi_N( byte value )
   {
      gxTv_SdtAnuncio_N = (byte)(0) ;
      gxTv_SdtAnuncio_Anuncioimagen_gxi_N = value ;
   }

   protected byte gxTv_SdtAnuncio_Anunciosubtitulo_N ;
   protected byte gxTv_SdtAnuncio_Anuncioimagen_N ;
   protected byte gxTv_SdtAnuncio_Anunciopublico_N ;
   protected byte gxTv_SdtAnuncio_Anuncioimagen_gxi_N ;
   private byte gxTv_SdtAnuncio_N ;
   protected short gxTv_SdtAnuncio_Initialized ;
   protected long gxTv_SdtAnuncio_Anuncioid ;
   protected long gxTv_SdtAnuncio_Anuncioid_Z ;
   protected String gxTv_SdtAnuncio_Mode ;
   protected boolean gxTv_SdtAnuncio_Anunciopublico ;
   protected boolean gxTv_SdtAnuncio_Anunciopublico_Z ;
   protected String gxTv_SdtAnuncio_Anunciotitulo ;
   protected String gxTv_SdtAnuncio_Anunciosubtitulo ;
   protected String gxTv_SdtAnuncio_Anunciodescripcion ;
   protected String gxTv_SdtAnuncio_Anuncioimagen_gxi ;
   protected String gxTv_SdtAnuncio_Anunciotitulo_Z ;
   protected String gxTv_SdtAnuncio_Anunciosubtitulo_Z ;
   protected String gxTv_SdtAnuncio_Anunciodescripcion_Z ;
   protected String gxTv_SdtAnuncio_Anuncioimagen_gxi_Z ;
   protected String gxTv_SdtAnuncio_Anuncioimagen ;
}

