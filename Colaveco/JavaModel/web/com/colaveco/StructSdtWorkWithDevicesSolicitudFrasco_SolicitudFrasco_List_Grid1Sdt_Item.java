package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item.class ));
   }

   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item( int remoteHandle ,
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

   public long getSfid( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid ;
   }

   public void setSfid( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid = value ;
   }

   public long getSfidnet( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet ;
   }

   public void setSfidnet( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_N ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet ;
}

