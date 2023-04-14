package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesnotificaciones_notificaciones_section_general extends GXProcedure
{
   public workwithdevicesnotificaciones_notificaciones_section_general( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesnotificaciones_notificaciones_section_general.class ), "" );
   }

   public workwithdevicesnotificaciones_notificaciones_section_general( int remoteHandle ,
                                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt executeUdp( long aP0 ,
                                                                                                      int aP1 )
   {
      workwithdevicesnotificaciones_notificaciones_section_general.this.aP2 = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt[] {new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt[] aP2 )
   {
      workwithdevicesnotificaciones_notificaciones_section_general.this.A6NotificacionesId = aP0;
      workwithdevicesnotificaciones_notificaciones_section_general.this.AV6gxid = aP1;
      workwithdevicesnotificaciones_notificaciones_section_general.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(A6NotificacionesId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A169NotificacionesFecha = P00002_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = P00002_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = P00002_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = P00002_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = P00002_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = P00002_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = P00002_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = P00002_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = P00002_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = P00002_n173NotificacionesDetalle[0] ;
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesid( A6NotificacionesId );
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesfecha( A169NotificacionesFecha );
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionestipo( A170NotificacionesTipo );
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesmensaje( A171NotificacionesMensaje );
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesidnetusuario( A172NotificacionesIdNetUsuario );
         AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt_Notificacionesdetalle( A173NotificacionesDetalle );
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesnotificaciones_notificaciones_section_general.this.AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A6NotificacionesId = new long[1] ;
      P00002_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n169NotificacionesFecha = new boolean[] {false} ;
      P00002_A170NotificacionesTipo = new String[] {""} ;
      P00002_n170NotificacionesTipo = new boolean[] {false} ;
      P00002_A171NotificacionesMensaje = new String[] {""} ;
      P00002_n171NotificacionesMensaje = new boolean[] {false} ;
      P00002_A172NotificacionesIdNetUsuario = new long[1] ;
      P00002_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      P00002_A173NotificacionesDetalle = new String[] {""} ;
      P00002_n173NotificacionesDetalle = new boolean[] {false} ;
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      A170NotificacionesTipo = "" ;
      A171NotificacionesMensaje = "" ;
      A173NotificacionesDetalle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesnotificaciones_notificaciones_section_general__default(),
         new Object[] {
             new Object[] {
            P00002_A6NotificacionesId, P00002_A169NotificacionesFecha, P00002_n169NotificacionesFecha, P00002_A170NotificacionesTipo, P00002_n170NotificacionesTipo, P00002_A171NotificacionesMensaje, P00002_n171NotificacionesMensaje, P00002_A172NotificacionesIdNetUsuario, P00002_n172NotificacionesIdNetUsuario, P00002_A173NotificacionesDetalle,
            P00002_n173NotificacionesDetalle
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6gxid ;
   private long A6NotificacionesId ;
   private long A172NotificacionesIdNetUsuario ;
   private String scmdbuf ;
   private java.util.Date A169NotificacionesFecha ;
   private boolean n169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n171NotificacionesMensaje ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean n173NotificacionesDetalle ;
   private String A170NotificacionesTipo ;
   private String A171NotificacionesMensaje ;
   private String A173NotificacionesDetalle ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A6NotificacionesId ;
   private java.util.Date[] P00002_A169NotificacionesFecha ;
   private boolean[] P00002_n169NotificacionesFecha ;
   private String[] P00002_A170NotificacionesTipo ;
   private boolean[] P00002_n170NotificacionesTipo ;
   private String[] P00002_A171NotificacionesMensaje ;
   private boolean[] P00002_n171NotificacionesMensaje ;
   private long[] P00002_A172NotificacionesIdNetUsuario ;
   private boolean[] P00002_n172NotificacionesIdNetUsuario ;
   private String[] P00002_A173NotificacionesDetalle ;
   private boolean[] P00002_n173NotificacionesDetalle ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt AV7GXM1WorkWithDevicesNotificaciones_Notificaciones_Section_GeneralSdt ;
}

final  class workwithdevicesnotificaciones_notificaciones_section_general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ? ORDER BY `NotificacionesId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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

