package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt.class ));
   }

   public StructSdtWorkWithDevicesUsuario_Usuario_DetailSdt( int remoteHandle ,
                                                             ModelContext context )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop = "" ;
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
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_N ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop ;
}

