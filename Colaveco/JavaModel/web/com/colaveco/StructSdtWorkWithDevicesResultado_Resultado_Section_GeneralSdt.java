package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt.class ));
   }

   public StructSdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt( int remoteHandle ,
                                                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = cal.getTime() ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = cal.getTime() ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = "" ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = "" ;
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
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid ;
   }

   public void setResultadoid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = value ;
   }

   public long getResultadoficha( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha ;
   }

   public void setResultadoficha( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = value ;
   }

   public long getResultadoidnetusuario( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario ;
   }

   public void setResultadoidnetusuario( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = value ;
   }

   public java.util.Date getResultadofechacreado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado ;
   }

   public void setResultadofechacreado( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = value ;
   }

   public java.util.Date getResultadofechaemision( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision ;
   }

   public void setResultadofechaemision( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = value ;
   }

   public String getResultadocomentarios( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios ;
   }

   public void setResultadocomentarios( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = value ;
   }

   public long getResultadouserid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid ;
   }

   public void setResultadouserid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = value ;
   }

   public long getResultadotypeid( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid ;
   }

   public void setResultadotypeid( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = value ;
   }

   public String getResultadopathexcel( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel ;
   }

   public void setResultadopathexcel( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = value ;
   }

   public String getResultadopathpdf( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf ;
   }

   public void setResultadopathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = value ;
   }

   public String getResultadopathcsv( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv ;
   }

   public void setResultadopathcsv( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = value ;
   }

   public long getResultadoidestado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado ;
   }

   public void setResultadoidestado( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = value ;
   }

   public long getResultadoidlibro( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro ;
   }

   public void setResultadoidlibro( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = value ;
   }

   public long getResultadoidnettipoinforme( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme ;
   }

   public void setResultadoidnettipoinforme( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = value ;
   }

   public byte getResultadoeliminado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado ;
   }

   public void setResultadoeliminado( byte value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = value ;
   }

   public long getResultadoabonado( )
   {
      return gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado ;
   }

   public void setResultadoabonado( long value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado ;
   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_N ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme ;
   protected long gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv ;
   protected java.util.Date gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision ;
}

