package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item.class ));
   }

   public StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                                     ModelContext context )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 = "" ;
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
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid ;
   }

   public void setUsuarioid( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid = value ;
   }

   public long getUsuarioidnet( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet ;
   }

   public void setUsuarioidnet( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet = value ;
   }

   public String getUsuarionombre( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre ;
   }

   public void setUsuarionombre( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre = value ;
   }

   public short getUsuarioagenciafrasco( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco ;
   }

   public void setUsuarioagenciafrasco( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco = value ;
   }

   public String getUsuariodireccion( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion ;
   }

   public void setUsuariodireccion( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion = value ;
   }

   public String getUsuarioemail( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail ;
   }

   public void setUsuarioemail( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail = value ;
   }

   public String getUsuariotecnicotelefono1( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 ;
   }

   public void setUsuariotecnicotelefono1( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 = value ;
   }

   protected byte gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 ;
}

