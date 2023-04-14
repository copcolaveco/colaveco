package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt.class ));
   }

   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt( int remoteHandle ,
                                                                               ModelContext context )
   {
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
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid ;
   }

   public void setFmid( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid = value ;
   }

   public long getFmsaldoactual( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual ;
   }

   public void setFmsaldoactual( long value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_N ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid ;
   protected long gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual ;
}

