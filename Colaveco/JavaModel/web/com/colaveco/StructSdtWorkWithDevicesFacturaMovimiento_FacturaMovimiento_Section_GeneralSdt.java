package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.class ));
   }

   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt( int remoteHandle ,
                                                                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = cal.getTime() ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = cal.getTime() ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle = "" ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf = "" ;
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
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid ;
   }

   public void setFmid( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid = value ;
   }

   public long getFmidnetmovimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento ;
   }

   public void setFmidnetmovimiento( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento = value ;
   }

   public java.util.Date getFmfechaemision( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision ;
   }

   public void setFmfechaemision( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision = value ;
   }

   public java.util.Date getFmfechavencimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento ;
   }

   public void setFmfechavencimiento( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento = value ;
   }

   public String getFmtipo( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo ;
   }

   public void setFmtipo( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo = value ;
   }

   public long getFmnumero( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero ;
   }

   public void setFmnumero( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero = value ;
   }

   public String getFmdetalle( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle ;
   }

   public void setFmdetalle( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle = value ;
   }

   public long getFmimporte( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte ;
   }

   public void setFmimporte( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte = value ;
   }

   public long getFmidusuarionet( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet ;
   }

   public void setFmidusuarionet( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet = value ;
   }

   public long getFmtipomovimiento( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento ;
   }

   public void setFmtipomovimiento( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento = value ;
   }

   public long getFmimportepago( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago ;
   }

   public void setFmimportepago( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago = value ;
   }

   public long getFmsaldoactual( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual ;
   }

   public void setFmsaldoactual( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual = value ;
   }

   public String getFmpathpdf( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf ;
   }

   public void setFmpathpdf( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_N ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision ;
   protected java.util.Date gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento ;
}

