package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesfacturamovimiento_facturamovimiento_list extends GXProcedure
{
   public workwithdevicesfacturamovimiento_facturamovimiento_list( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesfacturamovimiento_facturamovimiento_list.class ), "" );
   }

   public workwithdevicesfacturamovimiento_facturamovimiento_list( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt executeUdp( long aP0 ,
                                                                                                 int aP1 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_list.this.aP2 = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt[] {new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt[] aP2 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_list.this.AV5ExternalId = aP0;
      workwithdevicesfacturamovimiento_facturamovimiento_list.this.AV9gxid = aP1;
      workwithdevicesfacturamovimiento_facturamovimiento_list.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2FMId = P00002_A2FMId[0] ;
         GXt_int1 = A176FMSaldoActual ;
         GXv_int2[0] = GXt_int1 ;
         new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
         workwithdevicesfacturamovimiento_facturamovimiento_list.this.GXt_int1 = GXv_int2[0] ;
         A176FMSaldoActual = GXt_int1 ;
         AV10GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmid( A2FMId );
         AV10GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_Fmsaldoactual( A176FMSaldoActual );
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesfacturamovimiento_facturamovimiento_list.this.AV10GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A2FMId = new long[1] ;
      GXv_int2 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list__default(),
         new Object[] {
             new Object[] {
            P00002_A2FMId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9gxid ;
   private long AV5ExternalId ;
   private long A2FMId ;
   private long A176FMSaldoActual ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private String scmdbuf ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A2FMId ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt AV10GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt ;
}

final  class workwithdevicesfacturamovimiento_facturamovimiento_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `FMId` FROM `FacturaMovimiento` ORDER BY `FMId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

