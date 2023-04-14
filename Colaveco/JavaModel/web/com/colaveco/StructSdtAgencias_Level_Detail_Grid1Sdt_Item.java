package com.colaveco ;
import com.genexus.*;

public final  class StructSdtAgencias_Level_Detail_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtAgencias_Level_Detail_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtAgencias_Level_Detail_Grid1Sdt_Item.class ));
   }

   public StructSdtAgencias_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
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

   public java.util.Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> getSdtagencia( )
   {
      return gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia ;
   }

   public void setSdtagencia( java.util.Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> value )
   {
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia = value ;
   }

   protected byte gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N ;
   protected java.util.Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia=null ;
}

