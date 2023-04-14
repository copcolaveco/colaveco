package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesResultado_Resultado_ListSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesResultado_Resultado_ListSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesResultado_Resultado_ListSdt.class ));
   }

   public StructSdtWorkWithDevicesResultado_Resultado_ListSdt( int remoteHandle ,
                                                               ModelContext context )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop = "" ;
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
      return gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_N ;
   protected String gxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop ;
}

