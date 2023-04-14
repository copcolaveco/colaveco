package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTResultado_SDTResultadoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResultado_SDTResultadoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTResultado_SDTResultadoItem.class ));
   }

   public StructSdtSDTResultado_SDTResultadoItem( int remoteHandle ,
                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = cal.getTime() ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = cal.getTime() ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre = "" ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(1) ;
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
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid ;
   }

   public void setResultadoid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid = value ;
   }

   public long getResultadoficha( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha ;
   }

   public void setResultadoficha( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha = value ;
   }

   public String getResultadocomentarios( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios ;
   }

   public void setResultadocomentarios( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios = value ;
   }

   public long getResultadouserid( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid ;
   }

   public void setResultadouserid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid = value ;
   }

   public long getResultadotypeid( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid ;
   }

   public void setResultadotypeid( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid = value ;
   }

   public long getResultadoidnetusuario( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario ;
   }

   public void setResultadoidnetusuario( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario = value ;
   }

   public java.util.Date getResultadofechacreado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado ;
   }

   public void setResultadofechacreado( java.util.Date value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado = value ;
   }

   public java.util.Date getResultadofechaemision( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision ;
   }

   public void setResultadofechaemision( java.util.Date value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision = value ;
   }

   public String getResultadopathexcel( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel ;
   }

   public void setResultadopathexcel( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel = value ;
   }

   public String getResultadopathpdf( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf ;
   }

   public void setResultadopathpdf( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf = value ;
   }

   public String getResultadopathcsv( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv ;
   }

   public void setResultadopathcsv( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv = value ;
   }

   public long getResultadoidestado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado ;
   }

   public void setResultadoidestado( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado = value ;
   }

   public long getResultadoidlibro( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro ;
   }

   public void setResultadoidlibro( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro = value ;
   }

   public long getResultadoidnettipoinforme( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme ;
   }

   public void setResultadoidnettipoinforme( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme = value ;
   }

   public byte getResultadoeliminado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado ;
   }

   public void setResultadoeliminado( byte value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado = value ;
   }

   public long getResultadoabonado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado ;
   }

   public void setResultadoabonado( long value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado = value ;
   }

   public String getResultadoestado( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado ;
   }

   public void setResultadoestado( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado = value ;
   }

   public String getResultadoimagen( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen ;
   }

   public void setResultadoimagen( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen = value ;
   }

   public String getResultadoimagen_gxi( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi ;
   }

   public void setResultadoimagen_gxi( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi = value ;
   }

   public String getResultadotipoinformenombre( )
   {
      return gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre ;
   }

   public void setResultadotipoinformenombre( String value )
   {
      gxTv_SdtSDTResultado_SDTResultadoItem_N = (byte)(0) ;
      gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre = value ;
   }

   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado_N ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision_N ;
   protected byte gxTv_SdtSDTResultado_SDTResultadoItem_N ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme ;
   protected long gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoestado ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen_gxi ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadotipoinformenombre ;
   protected String gxTv_SdtSDTResultado_SDTResultadoItem_Resultadoimagen ;
   protected java.util.Date gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision ;
}

