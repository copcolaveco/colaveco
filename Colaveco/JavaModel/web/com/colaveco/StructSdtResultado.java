package com.colaveco ;
import com.genexus.*;

public final  class StructSdtResultado implements Cloneable, java.io.Serializable
{
   public StructSdtResultado( )
   {
      this( -1, new ModelContext( StructSdtResultado.class ));
   }

   public StructSdtResultado( int remoteHandle ,
                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtResultado_Resultadocomentarios = "" ;
      gxTv_SdtResultado_Resultadofechacreado = cal.getTime() ;
      gxTv_SdtResultado_Resultadofechaemision = cal.getTime() ;
      gxTv_SdtResultado_Resultadopathexcel = "" ;
      gxTv_SdtResultado_Resultadopathpdf = "" ;
      gxTv_SdtResultado_Resultadopathcsv = "" ;
      gxTv_SdtResultado_Mode = "" ;
      gxTv_SdtResultado_Resultadocomentarios_Z = "" ;
      gxTv_SdtResultado_Resultadofechacreado_Z = cal.getTime() ;
      gxTv_SdtResultado_Resultadofechaemision_Z = cal.getTime() ;
      gxTv_SdtResultado_Resultadopathexcel_Z = "" ;
      gxTv_SdtResultado_Resultadopathpdf_Z = "" ;
      gxTv_SdtResultado_Resultadopathcsv_Z = "" ;
      gxTv_SdtResultado_Resultadoficha_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadouserid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(1) ;
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
      return gxTv_SdtResultado_Resultadoid ;
   }

   public void setResultadoid( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoid = value ;
   }

   public long getResultadoficha( )
   {
      return gxTv_SdtResultado_Resultadoficha ;
   }

   public void setResultadoficha( long value )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoficha = value ;
   }

   public String getResultadocomentarios( )
   {
      return gxTv_SdtResultado_Resultadocomentarios ;
   }

   public void setResultadocomentarios( String value )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadocomentarios = value ;
   }

   public long getResultadouserid( )
   {
      return gxTv_SdtResultado_Resultadouserid ;
   }

   public void setResultadouserid( long value )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadouserid = value ;
   }

   public long getResultadotypeid( )
   {
      return gxTv_SdtResultado_Resultadotypeid ;
   }

   public void setResultadotypeid( long value )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadotypeid = value ;
   }

   public long getResultadoidnetusuario( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario ;
   }

   public void setResultadoidnetusuario( long value )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidnetusuario = value ;
   }

   public java.util.Date getResultadofechacreado( )
   {
      return gxTv_SdtResultado_Resultadofechacreado ;
   }

   public void setResultadofechacreado( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechacreado = value ;
   }

   public java.util.Date getResultadofechaemision( )
   {
      return gxTv_SdtResultado_Resultadofechaemision ;
   }

   public void setResultadofechaemision( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechaemision = value ;
   }

   public String getResultadopathexcel( )
   {
      return gxTv_SdtResultado_Resultadopathexcel ;
   }

   public void setResultadopathexcel( String value )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathexcel = value ;
   }

   public String getResultadopathpdf( )
   {
      return gxTv_SdtResultado_Resultadopathpdf ;
   }

   public void setResultadopathpdf( String value )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathpdf = value ;
   }

   public String getResultadopathcsv( )
   {
      return gxTv_SdtResultado_Resultadopathcsv ;
   }

   public void setResultadopathcsv( String value )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathcsv = value ;
   }

   public long getResultadoidestado( )
   {
      return gxTv_SdtResultado_Resultadoidestado ;
   }

   public void setResultadoidestado( long value )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidestado = value ;
   }

   public long getResultadoidlibro( )
   {
      return gxTv_SdtResultado_Resultadoidlibro ;
   }

   public void setResultadoidlibro( long value )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidlibro = value ;
   }

   public long getResultadoidnettipoinforme( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme ;
   }

   public void setResultadoidnettipoinforme( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidnettipoinforme = value ;
   }

   public byte getResultadoeliminado( )
   {
      return gxTv_SdtResultado_Resultadoeliminado ;
   }

   public void setResultadoeliminado( byte value )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoeliminado = value ;
   }

   public long getResultadoabonado( )
   {
      return gxTv_SdtResultado_Resultadoabonado ;
   }

   public void setResultadoabonado( long value )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoabonado = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtResultado_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtResultado_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Initialized = value ;
   }

   public long getResultadoid_Z( )
   {
      return gxTv_SdtResultado_Resultadoid_Z ;
   }

   public void setResultadoid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoid_Z = value ;
   }

   public long getResultadoficha_Z( )
   {
      return gxTv_SdtResultado_Resultadoficha_Z ;
   }

   public void setResultadoficha_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoficha_Z = value ;
   }

   public String getResultadocomentarios_Z( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_Z ;
   }

   public void setResultadocomentarios_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadocomentarios_Z = value ;
   }

   public long getResultadouserid_Z( )
   {
      return gxTv_SdtResultado_Resultadouserid_Z ;
   }

   public void setResultadouserid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadouserid_Z = value ;
   }

   public long getResultadotypeid_Z( )
   {
      return gxTv_SdtResultado_Resultadotypeid_Z ;
   }

   public void setResultadotypeid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadotypeid_Z = value ;
   }

   public long getResultadoidnetusuario_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   }

   public void setResultadoidnetusuario_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidnetusuario_Z = value ;
   }

   public java.util.Date getResultadofechacreado_Z( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_Z ;
   }

   public void setResultadofechacreado_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechacreado_Z = value ;
   }

   public java.util.Date getResultadofechaemision_Z( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_Z ;
   }

   public void setResultadofechaemision_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechaemision_Z = value ;
   }

   public String getResultadopathexcel_Z( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_Z ;
   }

   public void setResultadopathexcel_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathexcel_Z = value ;
   }

   public String getResultadopathpdf_Z( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_Z ;
   }

   public void setResultadopathpdf_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathpdf_Z = value ;
   }

   public String getResultadopathcsv_Z( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_Z ;
   }

   public void setResultadopathcsv_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathcsv_Z = value ;
   }

   public long getResultadoidestado_Z( )
   {
      return gxTv_SdtResultado_Resultadoidestado_Z ;
   }

   public void setResultadoidestado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidestado_Z = value ;
   }

   public long getResultadoidlibro_Z( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_Z ;
   }

   public void setResultadoidlibro_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidlibro_Z = value ;
   }

   public long getResultadoidnettipoinforme_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   }

   public void setResultadoidnettipoinforme_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidnettipoinforme_Z = value ;
   }

   public byte getResultadoeliminado_Z( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_Z ;
   }

   public void setResultadoeliminado_Z( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoeliminado_Z = value ;
   }

   public long getResultadoabonado_Z( )
   {
      return gxTv_SdtResultado_Resultadoabonado_Z ;
   }

   public void setResultadoabonado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoabonado_Z = value ;
   }

   public byte getResultadoficha_N( )
   {
      return gxTv_SdtResultado_Resultadoficha_N ;
   }

   public void setResultadoficha_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoficha_N = value ;
   }

   public byte getResultadocomentarios_N( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_N ;
   }

   public void setResultadocomentarios_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadocomentarios_N = value ;
   }

   public byte getResultadouserid_N( )
   {
      return gxTv_SdtResultado_Resultadouserid_N ;
   }

   public void setResultadouserid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadouserid_N = value ;
   }

   public byte getResultadotypeid_N( )
   {
      return gxTv_SdtResultado_Resultadotypeid_N ;
   }

   public void setResultadotypeid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadotypeid_N = value ;
   }

   public byte getResultadoidnetusuario_N( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_N ;
   }

   public void setResultadoidnetusuario_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidnetusuario_N = value ;
   }

   public byte getResultadofechacreado_N( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_N ;
   }

   public void setResultadofechacreado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechacreado_N = value ;
   }

   public byte getResultadofechaemision_N( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_N ;
   }

   public void setResultadofechaemision_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadofechaemision_N = value ;
   }

   public byte getResultadopathexcel_N( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_N ;
   }

   public void setResultadopathexcel_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathexcel_N = value ;
   }

   public byte getResultadopathpdf_N( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_N ;
   }

   public void setResultadopathpdf_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathpdf_N = value ;
   }

   public byte getResultadopathcsv_N( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_N ;
   }

   public void setResultadopathcsv_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadopathcsv_N = value ;
   }

   public byte getResultadoidestado_N( )
   {
      return gxTv_SdtResultado_Resultadoidestado_N ;
   }

   public void setResultadoidestado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidestado_N = value ;
   }

   public byte getResultadoidlibro_N( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_N ;
   }

   public void setResultadoidlibro_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoidlibro_N = value ;
   }

   public byte getResultadoeliminado_N( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_N ;
   }

   public void setResultadoeliminado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoeliminado_N = value ;
   }

   public byte getResultadoabonado_N( )
   {
      return gxTv_SdtResultado_Resultadoabonado_N ;
   }

   public void setResultadoabonado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      gxTv_SdtResultado_Resultadoabonado_N = value ;
   }

   protected byte gxTv_SdtResultado_Resultadoeliminado ;
   protected byte gxTv_SdtResultado_Resultadoeliminado_Z ;
   protected byte gxTv_SdtResultado_Resultadoficha_N ;
   protected byte gxTv_SdtResultado_Resultadocomentarios_N ;
   protected byte gxTv_SdtResultado_Resultadouserid_N ;
   protected byte gxTv_SdtResultado_Resultadotypeid_N ;
   protected byte gxTv_SdtResultado_Resultadoidnetusuario_N ;
   protected byte gxTv_SdtResultado_Resultadofechacreado_N ;
   protected byte gxTv_SdtResultado_Resultadofechaemision_N ;
   protected byte gxTv_SdtResultado_Resultadopathexcel_N ;
   protected byte gxTv_SdtResultado_Resultadopathpdf_N ;
   protected byte gxTv_SdtResultado_Resultadopathcsv_N ;
   protected byte gxTv_SdtResultado_Resultadoidestado_N ;
   protected byte gxTv_SdtResultado_Resultadoidlibro_N ;
   protected byte gxTv_SdtResultado_Resultadoeliminado_N ;
   protected byte gxTv_SdtResultado_Resultadoabonado_N ;
   private byte gxTv_SdtResultado_N ;
   protected short gxTv_SdtResultado_Initialized ;
   protected long gxTv_SdtResultado_Resultadoid ;
   protected long gxTv_SdtResultado_Resultadoficha ;
   protected long gxTv_SdtResultado_Resultadouserid ;
   protected long gxTv_SdtResultado_Resultadotypeid ;
   protected long gxTv_SdtResultado_Resultadoidnetusuario ;
   protected long gxTv_SdtResultado_Resultadoidestado ;
   protected long gxTv_SdtResultado_Resultadoidlibro ;
   protected long gxTv_SdtResultado_Resultadoidnettipoinforme ;
   protected long gxTv_SdtResultado_Resultadoabonado ;
   protected long gxTv_SdtResultado_Resultadoid_Z ;
   protected long gxTv_SdtResultado_Resultadoficha_Z ;
   protected long gxTv_SdtResultado_Resultadouserid_Z ;
   protected long gxTv_SdtResultado_Resultadotypeid_Z ;
   protected long gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   protected long gxTv_SdtResultado_Resultadoidestado_Z ;
   protected long gxTv_SdtResultado_Resultadoidlibro_Z ;
   protected long gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   protected long gxTv_SdtResultado_Resultadoabonado_Z ;
   protected String gxTv_SdtResultado_Mode ;
   protected String gxTv_SdtResultado_Resultadocomentarios ;
   protected String gxTv_SdtResultado_Resultadopathexcel ;
   protected String gxTv_SdtResultado_Resultadopathpdf ;
   protected String gxTv_SdtResultado_Resultadopathcsv ;
   protected String gxTv_SdtResultado_Resultadocomentarios_Z ;
   protected String gxTv_SdtResultado_Resultadopathexcel_Z ;
   protected String gxTv_SdtResultado_Resultadopathpdf_Z ;
   protected String gxTv_SdtResultado_Resultadopathcsv_Z ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechaemision ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechacreado_Z ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechaemision_Z ;
}

