package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesfacturamovimiento_facturamovimiento_detail extends GXProcedure
{
   public workwithdevicesfacturamovimiento_facturamovimiento_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesfacturamovimiento_facturamovimiento_detail.class ), "" );
   }

   public workwithdevicesfacturamovimiento_facturamovimiento_detail( int remoteHandle ,
                                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt executeUdp( long aP0 ,
                                                                                                   int aP1 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_detail.this.aP2 = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt[] aP2 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_detail.this.A2FMId = aP0;
      workwithdevicesfacturamovimiento_facturamovimiento_detail.this.AV6gxid = aP1;
      workwithdevicesfacturamovimiento_facturamovimiento_detail.this.aP2 = aP2;
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
         pr_default.execute(0, new Object[] {Long.valueOf(A2FMId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A21FMIdNetMovimiento = P00002_A21FMIdNetMovimiento[0] ;
            n21FMIdNetMovimiento = P00002_n21FMIdNetMovimiento[0] ;
            Gxdynprop1 = GXutil.str( A21FMIdNetMovimiento, 18, 0) ;
            Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Form\",\"Caption\",\"" + GXutil.encodeJSON( Gxdynprop1) + "\"]" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true");
      }
      AV11GXM2WorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesfacturamovimiento_facturamovimiento_detail.this.AV11GXM2WorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM2WorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      scmdbuf = "" ;
      P00002_A2FMId = new long[1] ;
      P00002_A21FMIdNetMovimiento = new long[1] ;
      P00002_n21FMIdNetMovimiento = new boolean[] {false} ;
      Gxdynprop1 = "" ;
      Gxdynprop = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_detail__default(),
         new Object[] {
             new Object[] {
            P00002_A2FMId, P00002_A21FMIdNetMovimiento, P00002_n21FMIdNetMovimiento
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6gxid ;
   private long A2FMId ;
   private long A21FMIdNetMovimiento ;
   private String Gxids ;
   private String scmdbuf ;
   private String Gxdynprop1 ;
   private boolean n21FMIdNetMovimiento ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A2FMId ;
   private long[] P00002_A21FMIdNetMovimiento ;
   private boolean[] P00002_n21FMIdNetMovimiento ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt AV11GXM2WorkWithDevicesFacturaMovimiento_FacturaMovimiento_DetailSdt ;
}

final  class workwithdevicesfacturamovimiento_facturamovimiento_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `FMId`, `FMIdNetMovimiento` FROM `FacturaMovimiento` WHERE `FMId` = ? ORDER BY `FMId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

