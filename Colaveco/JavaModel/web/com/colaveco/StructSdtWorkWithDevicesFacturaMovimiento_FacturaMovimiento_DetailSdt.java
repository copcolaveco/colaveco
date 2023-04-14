package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt.class ));
   }

   public StructSdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt( int remoteHandle ,
                                                                                 ModelContext context )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop = "" ;
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

   public String getGxdynprop( )
   {
      return gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_N ;
   protected String gxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop ;
}

