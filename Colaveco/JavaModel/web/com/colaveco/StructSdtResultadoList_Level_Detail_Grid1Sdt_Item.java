package com.colaveco ;
import com.genexus.*;

public final  class StructSdtResultadoList_Level_Detail_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtResultadoList_Level_Detail_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtResultadoList_Level_Detail_Grid1Sdt_Item.class ));
   }

   public StructSdtResultadoList_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
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

   public java.util.Vector<com.colaveco.StructSdtSDTResultado> getSdtresultadolist( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist ;
   }

   public void setSdtresultadolist( java.util.Vector<com.colaveco.StructSdtSDTResultado> value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist = value ;
   }

   public long getTipoinformeid( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid ;
   }

   public void setTipoinformeid( long value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid = value ;
   }

   public long getExternalid( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid ;
   }

   public void setExternalid( long value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid = value ;
   }

   protected byte gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N ;
   protected long gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid ;
   protected long gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid ;
   protected java.util.Vector<com.colaveco.StructSdtSDTResultado> gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist=null ;
}

