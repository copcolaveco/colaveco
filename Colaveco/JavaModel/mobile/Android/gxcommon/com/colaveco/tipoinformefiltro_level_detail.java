/*
               File: TipoinformeFiltro_Level_Detail
        Description: TipoinformeFiltro_Level_Detail
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:37.11
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class tipoinformefiltro_level_detail extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      int aP1 = 0;
      com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP2 = new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] {new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt()};

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("TipoInformeId"));
      aP1 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2);

      IEntity outObjGXM1TipoinformeFiltro_Level_DetailSdt =  AndroidContext.ApplicationContext.createEntity("", "TipoinformeFiltro_Level_Detail", null);
      if (aP2[0] != null)
      {
         aP2[0].sdttoentity(outObjGXM1TipoinformeFiltro_Level_DetailSdt );
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM1TipoinformeFiltro_Level_DetailSdt);


      return true ;
   }

   public tipoinformefiltro_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipoinformefiltro_level_detail.class ), "" );
   }

   public tipoinformefiltro_level_detail( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt executeUdp( long aP0 ,
                                                                        int aP1 )
   {
      tipoinformefiltro_level_detail.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail.this.AV7gxid = aP1;
      tipoinformefiltro_level_detail.this.aP2 = new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] {new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP2 )
   {
      tipoinformefiltro_level_detail.this.AV5TipoInformeId = aP0;
      tipoinformefiltro_level_detail.this.AV7gxid = aP1;
      tipoinformefiltro_level_detail.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV7gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList ;
         GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         new com.colaveco.dptipoinforme(remoteHandle, context).execute( GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2) ;
         GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] ;
         AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
         Gxwebsession.setObject(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList);
         Gxwebsession.setValue(Gxids, "true");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tipoinformefiltro_level_detail.this.AV10GXM1TipoinformeFiltro_Level_DetailSdt;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10GXM1TipoinformeFiltro_Level_DetailSdt = new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      AV6TipoinformeList = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private long AV5TipoInformeId ;
   private String Gxids ;
   private com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt[] aP2 ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> AV6TipoinformeList ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[] ;
   private com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt AV10GXM1TipoinformeFiltro_Level_DetailSdt ;
}

