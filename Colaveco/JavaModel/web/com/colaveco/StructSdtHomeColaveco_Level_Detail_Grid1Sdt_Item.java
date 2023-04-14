package com.colaveco ;
import com.genexus.*;

public final  class StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item implements Cloneable, java.io.Serializable
{
   public StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item( )
   {
      this( -1, new ModelContext( StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item.class ));
   }

   public StructSdtHomeColaveco_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                            ModelContext context )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen = "" ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi = "" ;
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

   public long getAnuncioid( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid ;
   }

   public void setAnuncioid( long value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid = value ;
   }

   public String getAnunciotitulo( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo ;
   }

   public void setAnunciotitulo( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo = value ;
   }

   public String getAnunciodescripcion( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion ;
   }

   public void setAnunciodescripcion( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion = value ;
   }

   public String getAnuncioimagen( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen ;
   }

   public void setAnuncioimagen( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen = value ;
   }

   public String getAnuncioimagen_gxi( )
   {
      return gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi ;
   }

   public void setAnuncioimagen_gxi( String value )
   {
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi = value ;
   }

   protected byte gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_N ;
   protected long gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi ;
   protected String gxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen ;
}

