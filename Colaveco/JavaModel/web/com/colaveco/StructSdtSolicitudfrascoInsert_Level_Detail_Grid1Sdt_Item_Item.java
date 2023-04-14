package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item( )
   {
      this( -1, new ModelContext( StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item.class ));
   }

   public StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item( int remoteHandle ,
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
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item_Sdtagencia ;
   }

   public void setSdtagencia( java.util.Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item_Sdtagencia = value ;
   }

   protected byte gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item_N ;
   protected java.util.Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Item_Sdtagencia=null ;
}

