package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class agencias_level_detail extends GXProcedure
{
   public agencias_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agencias_level_detail.class ), "" );
   }

   public agencias_level_detail( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtAgencias_Level_DetailSdt executeUdp( long aP0 ,
                                                               int aP1 )
   {
      agencias_level_detail.this.aP2 = new com.colaveco.SdtAgencias_Level_DetailSdt[] {new com.colaveco.SdtAgencias_Level_DetailSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtAgencias_Level_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtAgencias_Level_DetailSdt[] aP2 )
   {
      agencias_level_detail.this.AV7SDTAgenciaId = aP0;
      agencias_level_detail.this.AV8gxid = aP1;
      agencias_level_detail.this.aP2 = aP2;
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
         Gxwebsession.setValue(Gxids+"gxvar_Sdtagencia", AV5SDTAgencia.toJSonString(false));
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV5SDTAgencia.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtagencia"), null);
      }
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = AV5SDTAgencia ;
      GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
      new com.colaveco.dpagencia(remoteHandle, context).execute( GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2) ;
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] ;
      AV5SDTAgencia = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
      Gxwebsession.setValue(Gxids+"gxvar_Sdtagencia", AV5SDTAgencia.toJSonString(false));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = agencias_level_detail.this.AV11GXM1Agencias_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM1Agencias_Level_DetailSdt = new com.colaveco.SdtAgencias_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV5SDTAgencia = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8gxid ;
   private long AV7SDTAgenciaId ;
   private String Gxids ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> AV5SDTAgencia ;
   private com.colaveco.SdtAgencias_Level_DetailSdt[] aP2 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[] ;
   private com.colaveco.SdtAgencias_Level_DetailSdt AV11GXM1Agencias_Level_DetailSdt ;
}

