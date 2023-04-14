/*
               File: TipoinformeFiltro_Level_Detail_Grid1
        Description: TipoinformeFiltro_Level_Detail_Grid1
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:37.17
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class tipoinformefiltro_level_detail_grid1 extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      long aP1 = 0;
      long aP2 = 0;
      int aP3 = 0;
      GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP4 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item.class, "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle)};

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("TipoInformeId"));
      aP1 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("start"));
      aP2 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("count"));
      aP3 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2, aP3, aP4);

      IEntityList outObjGXM3RootCol = AndroidContext.ApplicationContext.createEntityList();
      if (aP4[0] != null)
      {
         for (int i = 0; i < aP4[0].size(); i++)
         {
            com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item sdttyped = (com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item) aP4[0].elementAt(i);
            IEntity objOutElement = AndroidContext.ApplicationContext.createEntity("", "TipoinformeFiltro_Level_Detail_Grid1", null, outObjGXM3RootCol);
            sdttyped.sdttoentity(objOutElement);
            outObjGXM3RootCol.add(objOutElement);
         }
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM3RootCol);


      return true ;
   }

   public tipoinformefiltro_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipoinformefiltro_level_detail_grid1.class ), "" );
   }

   public tipoinformefiltro_level_detail_grid1( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                     long aP1 ,
                                                                                                     long aP2 ,
                                                                                                     int aP3 )
   {
      tipoinformefiltro_level_detail_grid1.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail_grid1.this.AV10start = aP1;
      tipoinformefiltro_level_detail_grid1.this.AV11count = aP2;
      tipoinformefiltro_level_detail_grid1.this.AV7gxid = aP3;
      tipoinformefiltro_level_detail_grid1.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        long aP2 ,
                        int aP3 ,
                        GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             long aP2 ,
                             int aP3 ,
                             GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP4 )
   {
      tipoinformefiltro_level_detail_grid1.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail_grid1.this.AV10start = aP1;
      tipoinformefiltro_level_detail_grid1.this.AV11count = aP2;
      tipoinformefiltro_level_detail_grid1.this.AV7gxid = aP3;
      tipoinformefiltro_level_detail_grid1.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV7gxid, 8, 0) ;
      AV6TipoinformeList = (GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>)Gxwebsession.getObject(Gxids+"gxvar_Tipoinformelist") ;
      AV12GXV1SkipCount = (int)(-(AV10start)) ;
      AV12GXV1SkipCount = (int)(AV12GXV1SkipCount+1) ;
      if ( AV12GXV1SkipCount > 0 )
      {
         AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = (com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV13GXM3RootCol.add(AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt, 0);
         if ( AV10start == 0 )
         {
            GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList ;
            GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
            new com.colaveco.dptipoinforme(remoteHandle, context).execute( GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2) ;
            GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] ;
            AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         }
         AV17GXV1 = 1 ;
         while ( AV17GXV1 <= AV6TipoinformeList.size() )
         {
            AV6TipoinformeList.currentItem( ((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)AV6TipoinformeList.elementAt(-1+AV17GXV1)) );
            AV17GXV1 = (int)(AV17GXV1+1) ;
         }
         AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt.setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist( AV6TipoinformeList );
      }
      Gxwebsession.setObject(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = tipoinformefiltro_level_detail_grid1.this.AV13GXM3RootCol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13GXM3RootCol = new GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item.class, "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV6TipoinformeList = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private int AV12GXV1SkipCount ;
   private int AV17GXV1 ;
   private long AV5TipoInformeId ;
   private long AV10start ;
   private long AV11count ;
   private String Gxids ;
   private GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>[] aP4 ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> AV6TipoinformeList ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[] ;
   private GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> AV13GXM3RootCol ;
   private com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt ;
}

