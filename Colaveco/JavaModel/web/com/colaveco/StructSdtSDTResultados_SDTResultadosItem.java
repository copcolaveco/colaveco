package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTResultados_SDTResultadosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResultados_SDTResultadosItem( )
   {
      this( -1, new ModelContext( StructSdtSDTResultados_SDTResultadosItem.class ));
   }

   public StructSdtSDTResultados_SDTResultadosItem( int remoteHandle ,
                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = cal.getTime() ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = cal.getTime() ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv = "" ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(1) ;
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
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid ;
   }

   public void setResultadoid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid = value ;
   }

   public long getResultadoficha( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha ;
   }

   public void setResultadoficha( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha = value ;
   }

   public String getResultadocomentarios( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios ;
   }

   public void setResultadocomentarios( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios = value ;
   }

   public long getResultadouserid( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid ;
   }

   public void setResultadouserid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid = value ;
   }

   public long getResultadotypeid( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid ;
   }

   public void setResultadotypeid( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid = value ;
   }

   public long getResultadoidnetusuario( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario ;
   }

   public void setResultadoidnetusuario( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario = value ;
   }

   public java.util.Date getResultadofechacreado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado ;
   }

   public void setResultadofechacreado( java.util.Date value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado = value ;
   }

   public java.util.Date getResultadofechaemision( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision ;
   }

   public void setResultadofechaemision( java.util.Date value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision = value ;
   }

   public String getResultadopathexcel( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel ;
   }

   public void setResultadopathexcel( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel = value ;
   }

   public String getResultadopathpdf( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf ;
   }

   public void setResultadopathpdf( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf = value ;
   }

   public String getResultadopathcsv( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv ;
   }

   public void setResultadopathcsv( String value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv = value ;
   }

   public long getResultadoidestado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado ;
   }

   public void setResultadoidestado( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado = value ;
   }

   public long getResultadoidlibro( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro ;
   }

   public void setResultadoidlibro( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro = value ;
   }

   public long getResultadoidnettipoinforme( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme ;
   }

   public void setResultadoidnettipoinforme( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme = value ;
   }

   public byte getResultadoeliminado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado ;
   }

   public void setResultadoeliminado( byte value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado = value ;
   }

   public long getResultadoabonado( )
   {
      return gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado ;
   }

   public void setResultadoabonado( long value )
   {
      gxTv_SdtSDTResultados_SDTResultadosItem_N = (byte)(0) ;
      gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado = value ;
   }

   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoeliminado ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado_N ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision_N ;
   protected byte gxTv_SdtSDTResultados_SDTResultadosItem_N ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoficha ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadouserid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadotypeid ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnetusuario ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidestado ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidlibro ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoidnettipoinforme ;
   protected long gxTv_SdtSDTResultados_SDTResultadosItem_Resultadoabonado ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadocomentarios ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathexcel ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathpdf ;
   protected String gxTv_SdtSDTResultados_SDTResultadosItem_Resultadopathcsv ;
   protected java.util.Date gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtSDTResultados_SDTResultadosItem_Resultadofechaemision ;
}

