package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesnotificaciones_notificaciones_detail extends GXProcedure
{
   public workwithdevicesnotificaciones_notificaciones_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesnotificaciones_notificaciones_detail.class ), "" );
   }

   public workwithdevicesnotificaciones_notificaciones_detail( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt executeUdp( long aP0 ,
                                                                                             int aP1 )
   {
      workwithdevicesnotificaciones_notificaciones_detail.this.aP2 = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt[] aP2 )
   {
      workwithdevicesnotificaciones_notificaciones_detail.this.A6NotificacionesId = aP0;
      workwithdevicesnotificaciones_notificaciones_detail.this.AV6gxid = aP1;
      workwithdevicesnotificaciones_notificaciones_detail.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV6gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         /* Using cursor P00002 */
         pr_default.execute(0, new Object[] {Long.valueOf(A6NotificacionesId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A169NotificacionesFecha = P00002_A169NotificacionesFecha[0] ;
            n169NotificacionesFecha = P00002_n169NotificacionesFecha[0] ;
            Gxdynprop1 = localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " ") ;
            Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Form\",\"Caption\",\"" + GXutil.encodeJSON( Gxdynprop1) + "\"]" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true");
      }
      AV11GXM2WorkWithDevicesNotificaciones_Notificaciones_DetailSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesnotificaciones_notificaciones_detail.this.AV11GXM2WorkWithDevicesNotificaciones_Notificaciones_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM2WorkWithDevicesNotificaciones_Notificaciones_DetailSdt = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      scmdbuf = "" ;
      P00002_A6NotificacionesId = new long[1] ;
      P00002_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n169NotificacionesFecha = new boolean[] {false} ;
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      Gxdynprop1 = "" ;
      Gxdynprop = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesnotificaciones_notificaciones_detail__default(),
         new Object[] {
             new Object[] {
            P00002_A6NotificacionesId, P00002_A169NotificacionesFecha, P00002_n169NotificacionesFecha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6gxid ;
   private long A6NotificacionesId ;
   private String Gxids ;
   private String scmdbuf ;
   private String Gxdynprop1 ;
   private java.util.Date A169NotificacionesFecha ;
   private boolean n169NotificacionesFecha ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A6NotificacionesId ;
   private java.util.Date[] P00002_A169NotificacionesFecha ;
   private boolean[] P00002_n169NotificacionesFecha ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt AV11GXM2WorkWithDevicesNotificaciones_Notificaciones_DetailSdt ;
}

final  class workwithdevicesnotificaciones_notificaciones_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `NotificacionesId`, `NotificacionesFecha` FROM `Notificaciones` WHERE `NotificacionesId` = ? ORDER BY `NotificacionesId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

