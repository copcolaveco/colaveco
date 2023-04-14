package com.colaveco ;
import com.genexus.*;

public final  class StructSdtFacturaMovimiento implements Cloneable, java.io.Serializable
{
   public StructSdtFacturaMovimiento( )
   {
      this( -1, new ModelContext( StructSdtFacturaMovimiento.class ));
   }

   public StructSdtFacturaMovimiento( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFacturaMovimiento_Fmfechaemision = cal.getTime() ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento = cal.getTime() ;
      gxTv_SdtFacturaMovimiento_Fmtipo = "" ;
      gxTv_SdtFacturaMovimiento_Fmdetalle = "" ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf = "" ;
      gxTv_SdtFacturaMovimiento_Mode = "" ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = cal.getTime() ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = cal.getTime() ;
      gxTv_SdtFacturaMovimiento_Fmtipo_Z = "" ;
      gxTv_SdtFacturaMovimiento_Fmdetalle_Z = "" ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = "" ;
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(1) ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(1) ;
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

   public long getFmid( )
   {
      return gxTv_SdtFacturaMovimiento_Fmid ;
   }

   public void setFmid( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmid = value ;
   }

   public long getFmidnetmovimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento ;
   }

   public void setFmidnetmovimiento( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento = value ;
   }

   public java.util.Date getFmfechaemision( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision ;
   }

   public void setFmfechaemision( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision = value ;
   }

   public java.util.Date getFmfechavencimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento ;
   }

   public void setFmfechavencimiento( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento = value ;
   }

   public String getFmtipo( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo ;
   }

   public void setFmtipo( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmtipo_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipo = value ;
   }

   public long getFmnumero( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero ;
   }

   public void setFmnumero( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmnumero_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmnumero = value ;
   }

   public String getFmdetalle( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle ;
   }

   public void setFmdetalle( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmdetalle = value ;
   }

   public long getFmimporte( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte ;
   }

   public void setFmimporte( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmimporte_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimporte = value ;
   }

   public long getFmidusuarionet( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet ;
   }

   public void setFmidusuarionet( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidusuarionet = value ;
   }

   public long getFmtipomovimiento( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento ;
   }

   public void setFmtipomovimiento( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento = value ;
   }

   public long getFmimportepago( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago ;
   }

   public void setFmimportepago( long value )
   {
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimportepago = value ;
   }

   public String getFmpathpdf( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf ;
   }

   public void setFmpathpdf( String value )
   {
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf = value ;
   }

   public long getFmsaldoactual( )
   {
      return gxTv_SdtFacturaMovimiento_Fmsaldoactual ;
   }

   public void setFmsaldoactual( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmsaldoactual = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtFacturaMovimiento_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtFacturaMovimiento_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Initialized = value ;
   }

   public long getFmid_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmid_Z ;
   }

   public void setFmid_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmid_Z = value ;
   }

   public long getFmidnetmovimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z ;
   }

   public void setFmidnetmovimiento_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z = value ;
   }

   public java.util.Date getFmfechaemision_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision_Z ;
   }

   public void setFmfechaemision_Z( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision_Z = value ;
   }

   public java.util.Date getFmfechavencimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z ;
   }

   public void setFmfechavencimiento_Z( java.util.Date value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z = value ;
   }

   public String getFmtipo_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo_Z ;
   }

   public void setFmtipo_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipo_Z = value ;
   }

   public long getFmnumero_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero_Z ;
   }

   public void setFmnumero_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmnumero_Z = value ;
   }

   public String getFmdetalle_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle_Z ;
   }

   public void setFmdetalle_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmdetalle_Z = value ;
   }

   public long getFmimporte_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte_Z ;
   }

   public void setFmimporte_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimporte_Z = value ;
   }

   public long getFmidusuarionet_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z ;
   }

   public void setFmidusuarionet_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z = value ;
   }

   public long getFmtipomovimiento_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z ;
   }

   public void setFmtipomovimiento_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z = value ;
   }

   public long getFmimportepago_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago_Z ;
   }

   public void setFmimportepago_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimportepago_Z = value ;
   }

   public String getFmpathpdf_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf_Z ;
   }

   public void setFmpathpdf_Z( String value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf_Z = value ;
   }

   public long getFmsaldoactual_Z( )
   {
      return gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z ;
   }

   public void setFmsaldoactual_Z( long value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z = value ;
   }

   public byte getFmidnetmovimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N ;
   }

   public void setFmidnetmovimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N = value ;
   }

   public byte getFmfechaemision_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechaemision_N ;
   }

   public void setFmfechaemision_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechaemision_N = value ;
   }

   public byte getFmfechavencimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N ;
   }

   public void setFmfechavencimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N = value ;
   }

   public byte getFmtipo_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipo_N ;
   }

   public void setFmtipo_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipo_N = value ;
   }

   public byte getFmnumero_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmnumero_N ;
   }

   public void setFmnumero_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmnumero_N = value ;
   }

   public byte getFmdetalle_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmdetalle_N ;
   }

   public void setFmdetalle_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmdetalle_N = value ;
   }

   public byte getFmimporte_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimporte_N ;
   }

   public void setFmimporte_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimporte_N = value ;
   }

   public byte getFmidusuarionet_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmidusuarionet_N ;
   }

   public void setFmidusuarionet_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmidusuarionet_N = value ;
   }

   public byte getFmtipomovimiento_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N ;
   }

   public void setFmtipomovimiento_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N = value ;
   }

   public byte getFmimportepago_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmimportepago_N ;
   }

   public void setFmimportepago_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmimportepago_N = value ;
   }

   public byte getFmpathpdf_N( )
   {
      return gxTv_SdtFacturaMovimiento_Fmpathpdf_N ;
   }

   public void setFmpathpdf_N( byte value )
   {
      gxTv_SdtFacturaMovimiento_N = (byte)(0) ;
      gxTv_SdtFacturaMovimiento_Fmpathpdf_N = value ;
   }

   protected byte gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmfechaemision_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmfechavencimiento_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmtipo_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmnumero_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmdetalle_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmimporte_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmidusuarionet_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmtipomovimiento_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmimportepago_N ;
   protected byte gxTv_SdtFacturaMovimiento_Fmpathpdf_N ;
   private byte gxTv_SdtFacturaMovimiento_N ;
   protected short gxTv_SdtFacturaMovimiento_Initialized ;
   protected long gxTv_SdtFacturaMovimiento_Fmid ;
   protected long gxTv_SdtFacturaMovimiento_Fmidnetmovimiento ;
   protected long gxTv_SdtFacturaMovimiento_Fmnumero ;
   protected long gxTv_SdtFacturaMovimiento_Fmimporte ;
   protected long gxTv_SdtFacturaMovimiento_Fmidusuarionet ;
   protected long gxTv_SdtFacturaMovimiento_Fmtipomovimiento ;
   protected long gxTv_SdtFacturaMovimiento_Fmimportepago ;
   protected long gxTv_SdtFacturaMovimiento_Fmsaldoactual ;
   protected long gxTv_SdtFacturaMovimiento_Fmid_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmnumero_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmimporte_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmidusuarionet_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmimportepago_Z ;
   protected long gxTv_SdtFacturaMovimiento_Fmsaldoactual_Z ;
   protected String gxTv_SdtFacturaMovimiento_Mode ;
   protected String gxTv_SdtFacturaMovimiento_Fmtipo ;
   protected String gxTv_SdtFacturaMovimiento_Fmdetalle ;
   protected String gxTv_SdtFacturaMovimiento_Fmpathpdf ;
   protected String gxTv_SdtFacturaMovimiento_Fmtipo_Z ;
   protected String gxTv_SdtFacturaMovimiento_Fmdetalle_Z ;
   protected String gxTv_SdtFacturaMovimiento_Fmpathpdf_Z ;
   protected java.util.Date gxTv_SdtFacturaMovimiento_Fmfechaemision ;
   protected java.util.Date gxTv_SdtFacturaMovimiento_Fmfechavencimiento ;
   protected java.util.Date gxTv_SdtFacturaMovimiento_Fmfechaemision_Z ;
   protected java.util.Date gxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z ;
}

