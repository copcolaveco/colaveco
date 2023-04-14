package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesResultado_Resultado_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesResultado_Resultado_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesResultado_Resultado_DetailSdt.class ));
   }

   public StructSdtWorkWithDevicesResultado_Resultado_DetailSdt( int remoteHandle ,
                                                                 ModelContext context )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = "" ;
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
      return gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_N ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop ;
}

