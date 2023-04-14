package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicessolicitudfrasco_solicitudfrasco_detail extends GXProcedure
{
   public workwithdevicessolicitudfrasco_solicitudfrasco_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicessolicitudfrasco_solicitudfrasco_detail.class ), "" );
   }

   public workwithdevicessolicitudfrasco_solicitudfrasco_detail( int remoteHandle ,
                                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt executeUdp( long aP0 ,
                                                                                               int aP1 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_detail.this.aP2 = new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt[] aP2 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_detail.this.A3SFId = aP0;
      workwithdevicessolicitudfrasco_solicitudfrasco_detail.this.AV7gxid = aP1;
      workwithdevicessolicitudfrasco_solicitudfrasco_detail.this.aP2 = aP2;
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
         /* Using cursor P00002 */
         pr_default.execute(0, new Object[] {Long.valueOf(A3SFId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A32SFIdNet = P00002_A32SFIdNet[0] ;
            n32SFIdNet = P00002_n32SFIdNet[0] ;
            Gxdynprop1 = GXutil.str( A32SFIdNet, 18, 0) ;
            Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Form\",\"Caption\",\"" + GXutil.encodeJSON( Gxdynprop1) + "\"]" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true");
      }
      AV12GXM2WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicessolicitudfrasco_solicitudfrasco_detail.this.AV12GXM2WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12GXM2WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt = new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      scmdbuf = "" ;
      P00002_A3SFId = new long[1] ;
      P00002_A32SFIdNet = new long[1] ;
      P00002_n32SFIdNet = new boolean[] {false} ;
      Gxdynprop1 = "" ;
      Gxdynprop = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_detail__default(),
         new Object[] {
             new Object[] {
            P00002_A3SFId, P00002_A32SFIdNet, P00002_n32SFIdNet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private long A3SFId ;
   private long A32SFIdNet ;
   private String Gxids ;
   private String scmdbuf ;
   private String Gxdynprop1 ;
   private boolean n32SFIdNet ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A3SFId ;
   private long[] P00002_A32SFIdNet ;
   private boolean[] P00002_n32SFIdNet ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt AV12GXM2WorkWithDevicesSolicitudFrasco_SolicitudFrasco_DetailSdt ;
}

final  class workwithdevicessolicitudfrasco_solicitudfrasco_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `SFId`, `SFIdNet` FROM `SolicitudFrasco` WHERE `SFId` = ? ORDER BY `SFId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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

