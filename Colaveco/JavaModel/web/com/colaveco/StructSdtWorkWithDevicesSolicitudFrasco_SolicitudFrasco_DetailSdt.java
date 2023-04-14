package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt.class ));
   }

   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt( int remoteHandle ,
                                                                             ModelContext context )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop = "" ;
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
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_N ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop ;
}

