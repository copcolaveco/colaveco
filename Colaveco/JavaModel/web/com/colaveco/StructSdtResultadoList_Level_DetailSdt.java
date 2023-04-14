package com.colaveco ;
import com.genexus.*;

public final  class StructSdtResultadoList_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtResultadoList_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtResultadoList_Level_DetailSdt.class ));
   }

   public StructSdtResultadoList_Level_DetailSdt( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop = "" ;
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

   public long getTipoinformeid( )
   {
      return gxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid ;
   }

   public void setTipoinformeid( long value )
   {
      gxTv_SdtResultadoList_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid = value ;
   }

   public long getExternalid( )
   {
      return gxTv_SdtResultadoList_Level_DetailSdt_Externalid ;
   }

   public void setExternalid( long value )
   {
      gxTv_SdtResultadoList_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_DetailSdt_Externalid = value ;
   }

   public String getGxdynprop( )
   {
      return gxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop ;
   }

   public void setGxdynprop( String value )
   {
      gxTv_SdtResultadoList_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop = value ;
   }

   protected byte gxTv_SdtResultadoList_Level_DetailSdt_N ;
   protected long gxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid ;
   protected long gxTv_SdtResultadoList_Level_DetailSdt_Externalid ;
   protected String gxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop ;
}

