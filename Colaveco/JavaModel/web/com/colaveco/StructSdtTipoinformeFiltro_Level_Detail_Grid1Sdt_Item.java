package com.colaveco ;
import com.genexus.*;

public final  class StructSdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item.class ));
   }

   public StructSdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
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

   public java.util.Vector<com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem> getTipoinformelist( )
   {
      return gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist ;
   }

   public void setTipoinformelist( java.util.Vector<com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem> value )
   {
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = value ;
   }

   protected byte gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N ;
   protected java.util.Vector<com.colaveco.StructSdtSDTTipoinforme_SDTTipoinformeItem> gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist=null ;
}

