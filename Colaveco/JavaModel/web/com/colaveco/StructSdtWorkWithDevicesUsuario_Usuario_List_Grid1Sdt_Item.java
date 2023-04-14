package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item.class ));
   }

   public StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( int remoteHandle ,
                                                                      ModelContext context )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail = "" ;
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

   public long getUsuarioid( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid ;
   }

   public void setUsuarioid( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid = value ;
   }

   public String getUsuarioemail( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail ;
   }

   public void setUsuarioemail( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail ;
}

