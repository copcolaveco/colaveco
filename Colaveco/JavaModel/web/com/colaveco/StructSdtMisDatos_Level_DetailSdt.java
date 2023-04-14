package com.colaveco ;
import com.genexus.*;

public final  class StructSdtMisDatos_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtMisDatos_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtMisDatos_Level_DetailSdt.class ));
   }

   public StructSdtMisDatos_Level_DetailSdt( int remoteHandle ,
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

   public com.colaveco.StructSdtSDTUsuario getSdtusuario( )
   {
      return gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario ;
   }

   public void setSdtusuario( com.colaveco.StructSdtSDTUsuario value )
   {
      gxTv_SdtMisDatos_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario = value;
   }

   protected byte gxTv_SdtMisDatos_Level_DetailSdt_N ;
   protected com.colaveco.StructSdtSDTUsuario gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario=null ;
}

