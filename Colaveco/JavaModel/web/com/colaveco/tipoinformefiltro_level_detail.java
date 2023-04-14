package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tipoinformefiltro_level_detail extends GXProcedure
{
   public tipoinformefiltro_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipoinformefiltro_level_detail.class ), "" );
   }

   public tipoinformefiltro_level_detail( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt executeUdp( long aP0 ,
                                                                        String aP1 ,
                                                                        int aP2 )
   {
      tipoinformefiltro_level_detail.this.aP3 = new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] {new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        int aP2 ,
                        com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             int aP2 ,
                             com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP3 )
   {
      tipoinformefiltro_level_detail.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail.this.AV7TipoinformeButton = aP1;
      tipoinformefiltro_level_detail.this.AV8gxid = aP2;
      tipoinformefiltro_level_detail.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV8gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList ;
         GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         new com.colaveco.dptipoinforme(remoteHandle, context).execute( GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2) ;
         GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] ;
         AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         Gxwebsession.setValue(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList.toJSonString(false));
         Gxwebsession.setValue(Gxids, "true");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = tipoinformefiltro_level_detail.this.AV11GXM1TipoinformeFiltro_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM1TipoinformeFiltro_Level_DetailSdt = new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV6TipoinformeList = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8gxid ;
   private long AV5TipoInformeId ;
   private String Gxids ;
   private String AV7TipoinformeButton ;
   private com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP3 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> AV6TipoinformeList ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[] ;
   private com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt AV11GXM1TipoinformeFiltro_Level_DetailSdt ;
}

