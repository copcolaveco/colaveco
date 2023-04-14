package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class agencias_level_detail_grid1 extends GXProcedure
{
   public agencias_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agencias_level_detail_grid1.class ), "" );
   }

   public agencias_level_detail_grid1( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                            long aP1 ,
                                                                                            long aP2 ,
                                                                                            int aP3 )
   {
      agencias_level_detail_grid1.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        long aP2 ,
                        int aP3 ,
                        GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             long aP2 ,
                             int aP3 ,
                             GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>[] aP4 )
   {
      agencias_level_detail_grid1.this.AV7SDTAgenciaId = aP0;
      agencias_level_detail_grid1.this.AV11start = aP1;
      agencias_level_detail_grid1.this.AV12count = aP2;
      agencias_level_detail_grid1.this.AV8gxid = aP3;
      agencias_level_detail_grid1.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV8gxid, 8, 0) ;
      AV5SDTAgencia.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtagencia"), null);
      AV13GXV1SkipCount = (int)(-(AV11start)) ;
      AV13GXV1SkipCount = (int)(AV13GXV1SkipCount+1) ;
      if ( AV13GXV1SkipCount > 0 )
      {
         AV15GXM2Agencias_Level_Detail_Grid1Sdt = (com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV14GXM3RootCol.add(AV15GXM2Agencias_Level_Detail_Grid1Sdt, 0);
         if ( AV11start == 0 )
         {
            GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = AV5SDTAgencia ;
            GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
            new com.colaveco.dpagencia(remoteHandle, context).execute( GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2) ;
            GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] ;
            AV5SDTAgencia = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
         }
         AV18GXV1 = 1 ;
         while ( AV18GXV1 <= AV5SDTAgencia.size() )
         {
            AV5SDTAgencia.currentItem( ((com.colaveco.SdtSDTAgencia_SDTAgenciaItem)AV5SDTAgencia.elementAt(-1+AV18GXV1)) );
            AV18GXV1 = (int)(AV18GXV1+1) ;
         }
         AV15GXM2Agencias_Level_Detail_Grid1Sdt.setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia( AV5SDTAgencia );
      }
      Gxwebsession.setValue(Gxids+"gxvar_Sdtagencia", AV5SDTAgencia.toJSonString(false));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = agencias_level_detail_grid1.this.AV14GXM3RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14GXM3RootCol = new GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item.class, "Agencias_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV5SDTAgencia = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      Gxwebsession = httpContext.getWebSession();
      AV15GXM2Agencias_Level_Detail_Grid1Sdt = new com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8gxid ;
   private int AV13GXV1SkipCount ;
   private int AV18GXV1 ;
   private long AV7SDTAgenciaId ;
   private long AV11start ;
   private long AV12count ;
   private String Gxids ;
   private GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>[] aP4 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> AV5SDTAgencia ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[] ;
   private GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item> AV14GXM3RootCol ;
   private com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item AV15GXM2Agencias_Level_Detail_Grid1Sdt ;
}

