package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tipoinformefiltro_level_detail_grid1 extends GXProcedure
{
   public tipoinformefiltro_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipoinformefiltro_level_detail_grid1.class ), "" );
   }

   public tipoinformefiltro_level_detail_grid1( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                     String aP1 ,
                                                                                                     long aP2 ,
                                                                                                     long aP3 ,
                                                                                                     int aP4 )
   {
      tipoinformefiltro_level_detail_grid1.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        long aP2 ,
                        long aP3 ,
                        int aP4 ,
                        GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             long aP2 ,
                             long aP3 ,
                             int aP4 ,
                             GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP5 )
   {
      tipoinformefiltro_level_detail_grid1.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail_grid1.this.AV7TipoinformeButton = aP1;
      tipoinformefiltro_level_detail_grid1.this.AV11start = aP2;
      tipoinformefiltro_level_detail_grid1.this.AV12count = aP3;
      tipoinformefiltro_level_detail_grid1.this.AV8gxid = aP4;
      tipoinformefiltro_level_detail_grid1.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV8gxid, 8, 0) ;
      AV6TipoinformeList.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Tipoinformelist"), null);
      AV13GXV1SkipCount = (int)(-(AV11start)) ;
      AV13GXV1SkipCount = (int)(AV13GXV1SkipCount+1) ;
      if ( AV13GXV1SkipCount > 0 )
      {
         AV15GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = (com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV14GXM3RootCol.add(AV15GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt, 0);
         if ( AV11start == 0 )
         {
            GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList ;
            GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
            new com.colaveco.dptipoinforme(remoteHandle, context).execute( GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2) ;
            GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] ;
            AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         }
         AV18GXV1 = 1 ;
         while ( AV18GXV1 <= AV6TipoinformeList.size() )
         {
            AV6TipoinformeList.currentItem( ((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)AV6TipoinformeList.elementAt(-1+AV18GXV1)) );
            AV18GXV1 = (int)(AV18GXV1+1) ;
         }
         AV15GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt.setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist( AV6TipoinformeList );
      }
      Gxwebsession.setValue(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList.toJSonString(false));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = tipoinformefiltro_level_detail_grid1.this.AV14GXM3RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14GXM3RootCol = new GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item.class, "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV6TipoinformeList = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      Gxwebsession = httpContext.getWebSession();
      AV15GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8gxid ;
   private int AV13GXV1SkipCount ;
   private int AV18GXV1 ;
   private long AV5TipoInformeId ;
   private long AV11start ;
   private long AV12count ;
   private String Gxids ;
   private String AV7TipoinformeButton ;
   private GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP5 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> AV6TipoinformeList ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[] ;
   private GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> AV14GXM3RootCol ;
   private com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item AV15GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt ;
}

