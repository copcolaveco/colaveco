package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTTipoinforme_SDTTipoinformeItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTipoinforme_SDTTipoinformeItem( )
   {
      this( -1, new ModelContext( StructSdtSDTTipoinforme_SDTTipoinformeItem.class ));
   }

   public StructSdtSDTTipoinforme_SDTTipoinformeItem( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "" ;
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

   public long getSdttipoinformeid( )
   {
      return gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid ;
   }

   public void setSdttipoinformeid( long value )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N = (byte)(0) ;
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = value ;
   }

   public String getSdttipoinformenombre( )
   {
      return gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre ;
   }

   public void setSdttipoinformenombre( String value )
   {
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N = (byte)(0) ;
      gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = value ;
   }

   protected byte gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_N ;
   protected long gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid ;
   protected String gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre ;
}

