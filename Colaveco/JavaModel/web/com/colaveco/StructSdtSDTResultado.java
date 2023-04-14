package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTResultado implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResultado( )
   {
      this( -1, new ModelContext( StructSdtSDTResultado.class ));
   }

   public StructSdtSDTResultado( int remoteHandle ,
                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTResultado_Resultadocomentarios = "" ;
      gxTv_SdtSDTResultado_Resultadofechacreado = cal.getTime() ;
      gxTv_SdtSDTResultado_Resultadofechaemision = cal.getTime() ;
      gxTv_SdtSDTResultado_Resultadopathexcel = "" ;
      gxTv_SdtSDTResultado_Resultadopathpdf = "" ;
      gxTv_SdtSDTResultado_Resultadopathcsv = "" ;
      gxTv_SdtSDTResultado_Resultadoestado = "" ;
      gxTv_SdtSDTResultado_Resultadoimagen = "" ;
      gxTv_SdtSDTResultado_Resultadoimagen_gxi = "" ;
      gxTv_SdtSDTResultado_Resultadotipoinformenombre = "" ;
      gxTv_SdtSDTResultado_Resultadopdfimagen = "" ;
      gxTv_SdtSDTResultado_Resultadopdfimagen_gxi = "" ;
      gxTv_SdtSDTResultado_Resultadoexcelimagen = "" ;
      gxTv_SdtSDTResultado_Resultadoexcelimagen_gxi = "" ;
      gxTv_SdtSDTResultado_Resultadocsvimagen = "" ;
      gxTv_SdtSDTResultado_Resultadocsvimagen_gxi = "" ;
      gxTv_SdtSDTResultado_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtSDTResultado_Resultadofechaemision_N = (byte)(1) ;
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

   public long getResultadoid( )
   {
      return gxTv_SdtSDTResultado_Resultadoid ;
   }

   public void setResultadoid( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoid = value ;
   }

   public long getResultadoficha( )
   {
      return gxTv_SdtSDTResultado_Resultadoficha ;
   }

   public void setResultadoficha( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoficha = value ;
   }

   public String getResultadocomentarios( )
   {
      return gxTv_SdtSDTResultado_Resultadocomentarios ;
   }

   public void setResultadocomentarios( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadocomentarios = value ;
   }

   public long getResultadouserid( )
   {
      return gxTv_SdtSDTResultado_Resultadouserid ;
   }

   public void setResultadouserid( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadouserid = value ;
   }

   public long getResultadotypeid( )
   {
      return gxTv_SdtSDTResultado_Resultadotypeid ;
   }

   public void setResultadotypeid( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadotypeid = value ;
   }

   public long getResultadoidnetusuario( )
   {
      return gxTv_SdtSDTResultado_Resultadoidnetusuario ;
   }

   public void setResultadoidnetusuario( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoidnetusuario = value ;
   }

   public java.util.Date getResultadofechacreado( )
   {
      return gxTv_SdtSDTResultado_Resultadofechacreado ;
   }

   public void setResultadofechacreado( java.util.Date value )
   {
      gxTv_SdtSDTResultado_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadofechacreado = value ;
   }

   public java.util.Date getResultadofechaemision( )
   {
      return gxTv_SdtSDTResultado_Resultadofechaemision ;
   }

   public void setResultadofechaemision( java.util.Date value )
   {
      gxTv_SdtSDTResultado_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadofechaemision = value ;
   }

   public String getResultadopathexcel( )
   {
      return gxTv_SdtSDTResultado_Resultadopathexcel ;
   }

   public void setResultadopathexcel( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadopathexcel = value ;
   }

   public String getResultadopathpdf( )
   {
      return gxTv_SdtSDTResultado_Resultadopathpdf ;
   }

   public void setResultadopathpdf( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadopathpdf = value ;
   }

   public String getResultadopathcsv( )
   {
      return gxTv_SdtSDTResultado_Resultadopathcsv ;
   }

   public void setResultadopathcsv( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadopathcsv = value ;
   }

   public long getResultadoidestado( )
   {
      return gxTv_SdtSDTResultado_Resultadoidestado ;
   }

   public void setResultadoidestado( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoidestado = value ;
   }

   public long getResultadoidlibro( )
   {
      return gxTv_SdtSDTResultado_Resultadoidlibro ;
   }

   public void setResultadoidlibro( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoidlibro = value ;
   }

   public long getResultadoidnettipoinforme( )
   {
      return gxTv_SdtSDTResultado_Resultadoidnettipoinforme ;
   }

   public void setResultadoidnettipoinforme( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoidnettipoinforme = value ;
   }

   public byte getResultadoeliminado( )
   {
      return gxTv_SdtSDTResultado_Resultadoeliminado ;
   }

   public void setResultadoeliminado( byte value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoeliminado = value ;
   }

   public long getResultadoabonado( )
   {
      return gxTv_SdtSDTResultado_Resultadoabonado ;
   }

   public void setResultadoabonado( long value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoabonado = value ;
   }

   public String getResultadoestado( )
   {
      return gxTv_SdtSDTResultado_Resultadoestado ;
   }

   public void setResultadoestado( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoestado = value ;
   }

   public String getResultadoimagen( )
   {
      return gxTv_SdtSDTResultado_Resultadoimagen ;
   }

   public void setResultadoimagen( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoimagen = value ;
   }

   public String getResultadoimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_Resultadoimagen_gxi ;
   }

   public void setResultadoimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoimagen_gxi = value ;
   }

   public String getResultadotipoinformenombre( )
   {
      return gxTv_SdtSDTResultado_Resultadotipoinformenombre ;
   }

   public void setResultadotipoinformenombre( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadotipoinformenombre = value ;
   }

   public String getResultadopdfimagen( )
   {
      return gxTv_SdtSDTResultado_Resultadopdfimagen ;
   }

   public void setResultadopdfimagen( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadopdfimagen = value ;
   }

   public String getResultadopdfimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_Resultadopdfimagen_gxi ;
   }

   public void setResultadopdfimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadopdfimagen_gxi = value ;
   }

   public String getResultadoexcelimagen( )
   {
      return gxTv_SdtSDTResultado_Resultadoexcelimagen ;
   }

   public void setResultadoexcelimagen( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoexcelimagen = value ;
   }

   public String getResultadoexcelimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_Resultadoexcelimagen_gxi ;
   }

   public void setResultadoexcelimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadoexcelimagen_gxi = value ;
   }

   public String getResultadocsvimagen( )
   {
      return gxTv_SdtSDTResultado_Resultadocsvimagen ;
   }

   public void setResultadocsvimagen( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadocsvimagen = value ;
   }

   public String getResultadocsvimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_Resultadocsvimagen_gxi ;
   }

   public void setResultadocsvimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_Resultadocsvimagen_gxi = value ;
   }

   protected byte gxTv_SdtSDTResultado_Resultadoeliminado ;
   protected byte gxTv_SdtSDTResultado_Resultadofechacreado_N ;
   protected byte gxTv_SdtSDTResultado_Resultadofechaemision_N ;
   protected byte gxTv_SdtSDTResultado_N ;
   protected long gxTv_SdtSDTResultado_Resultadoid ;
   protected long gxTv_SdtSDTResultado_Resultadoficha ;
   protected long gxTv_SdtSDTResultado_Resultadouserid ;
   protected long gxTv_SdtSDTResultado_Resultadotypeid ;
   protected long gxTv_SdtSDTResultado_Resultadoidnetusuario ;
   protected long gxTv_SdtSDTResultado_Resultadoidestado ;
   protected long gxTv_SdtSDTResultado_Resultadoidlibro ;
   protected long gxTv_SdtSDTResultado_Resultadoidnettipoinforme ;
   protected long gxTv_SdtSDTResultado_Resultadoabonado ;
   protected String gxTv_SdtSDTResultado_Resultadocomentarios ;
   protected String gxTv_SdtSDTResultado_Resultadopathexcel ;
   protected String gxTv_SdtSDTResultado_Resultadopathpdf ;
   protected String gxTv_SdtSDTResultado_Resultadopathcsv ;
   protected String gxTv_SdtSDTResultado_Resultadoestado ;
   protected String gxTv_SdtSDTResultado_Resultadoimagen_gxi ;
   protected String gxTv_SdtSDTResultado_Resultadotipoinformenombre ;
   protected String gxTv_SdtSDTResultado_Resultadopdfimagen_gxi ;
   protected String gxTv_SdtSDTResultado_Resultadoexcelimagen_gxi ;
   protected String gxTv_SdtSDTResultado_Resultadocsvimagen_gxi ;
   protected String gxTv_SdtSDTResultado_Resultadoimagen ;
   protected String gxTv_SdtSDTResultado_Resultadopdfimagen ;
   protected String gxTv_SdtSDTResultado_Resultadoexcelimagen ;
   protected String gxTv_SdtSDTResultado_Resultadocsvimagen ;
   protected java.util.Date gxTv_SdtSDTResultado_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtSDTResultado_Resultadofechaemision ;
}

