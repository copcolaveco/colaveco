package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesfacturamovimiento_facturamovimiento_section_general extends GXProcedure
{
   public workwithdevicesfacturamovimiento_facturamovimiento_section_general( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesfacturamovimiento_facturamovimiento_section_general.class ), "" );
   }

   public workwithdevicesfacturamovimiento_facturamovimiento_section_general( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt executeUdp( long aP0 ,
                                                                                                            int aP1 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.aP2 = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt[] {new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt[] aP2 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.A2FMId = aP0;
      workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.AV6gxid = aP1;
      workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(A2FMId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A21FMIdNetMovimiento = P00002_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = P00002_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = P00002_A22FMFechaEmision[0] ;
         n22FMFechaEmision = P00002_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = P00002_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = P00002_n23FMFechaVencimiento[0] ;
         A24FMTipo = P00002_A24FMTipo[0] ;
         n24FMTipo = P00002_n24FMTipo[0] ;
         A25FMNumero = P00002_A25FMNumero[0] ;
         n25FMNumero = P00002_n25FMNumero[0] ;
         A26FMDetalle = P00002_A26FMDetalle[0] ;
         n26FMDetalle = P00002_n26FMDetalle[0] ;
         A27FMImporte = P00002_A27FMImporte[0] ;
         n27FMImporte = P00002_n27FMImporte[0] ;
         A28FMIdUsuarioNet = P00002_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = P00002_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = P00002_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = P00002_n29FMTipoMovimiento[0] ;
         A30FMImportePago = P00002_A30FMImportePago[0] ;
         n30FMImportePago = P00002_n30FMImportePago[0] ;
         A31FMPathPdf = P00002_A31FMPathPdf[0] ;
         n31FMPathPdf = P00002_n31FMPathPdf[0] ;
         GXt_int1 = A176FMSaldoActual ;
         GXv_int2[0] = GXt_int1 ;
         new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
         workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.GXt_int1 = GXv_int2[0] ;
         A176FMSaldoActual = GXt_int1 ;
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmid( A2FMId );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidnetmovimiento( A21FMIdNetMovimiento );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechaemision( A22FMFechaEmision );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmfechavencimiento( A23FMFechaVencimiento );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipo( A24FMTipo );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmnumero( A25FMNumero );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmdetalle( A26FMDetalle );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimporte( A27FMImporte );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmidusuarionet( A28FMIdUsuarioNet );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmtipomovimiento( A29FMTipoMovimiento );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmimportepago( A30FMImportePago );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmsaldoactual( A176FMSaldoActual );
         AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt_Fmpathpdf( A31FMPathPdf );
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
      this.aP2[0] = workwithdevicesfacturamovimiento_facturamovimiento_section_general.this.AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A21FMIdNetMovimiento = new long[1] ;
      P00002_n21FMIdNetMovimiento = new boolean[] {false} ;
      P00002_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n22FMFechaEmision = new boolean[] {false} ;
      P00002_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n23FMFechaVencimiento = new boolean[] {false} ;
      P00002_A24FMTipo = new String[] {""} ;
      P00002_n24FMTipo = new boolean[] {false} ;
      P00002_A25FMNumero = new long[1] ;
      P00002_n25FMNumero = new boolean[] {false} ;
      P00002_A26FMDetalle = new String[] {""} ;
      P00002_n26FMDetalle = new boolean[] {false} ;
      P00002_A27FMImporte = new long[1] ;
      P00002_n27FMImporte = new boolean[] {false} ;
      P00002_A28FMIdUsuarioNet = new long[1] ;
      P00002_n28FMIdUsuarioNet = new boolean[] {false} ;
      P00002_A29FMTipoMovimiento = new long[1] ;
      P00002_n29FMTipoMovimiento = new boolean[] {false} ;
      P00002_A30FMImportePago = new long[1] ;
      P00002_n30FMImportePago = new boolean[] {false} ;
      P00002_A31FMPathPdf = new String[] {""} ;
      P00002_n31FMPathPdf = new boolean[] {false} ;
      P00002_A2FMId = new long[1] ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      A24FMTipo = "" ;
      A26FMDetalle = "" ;
      A31FMPathPdf = "" ;
      GXv_int2 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_section_general__default(),
         new Object[] {
             new Object[] {
            P00002_A21FMIdNetMovimiento, P00002_n21FMIdNetMovimiento, P00002_A22FMFechaEmision, P00002_n22FMFechaEmision, P00002_A23FMFechaVencimiento, P00002_n23FMFechaVencimiento, P00002_A24FMTipo, P00002_n24FMTipo, P00002_A25FMNumero, P00002_n25FMNumero,
            P00002_A26FMDetalle, P00002_n26FMDetalle, P00002_A27FMImporte, P00002_n27FMImporte, P00002_A28FMIdUsuarioNet, P00002_n28FMIdUsuarioNet, P00002_A29FMTipoMovimiento, P00002_n29FMTipoMovimiento, P00002_A30FMImportePago, P00002_n30FMImportePago,
            P00002_A31FMPathPdf, P00002_n31FMPathPdf, P00002_A2FMId
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
   private long A25FMNumero ;
   private long A27FMImporte ;
   private long A28FMIdUsuarioNet ;
   private long A29FMTipoMovimiento ;
   private long A30FMImportePago ;
   private long A176FMSaldoActual ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private String scmdbuf ;
   private java.util.Date A22FMFechaEmision ;
   private java.util.Date A23FMFechaVencimiento ;
   private boolean n21FMIdNetMovimiento ;
   private boolean n22FMFechaEmision ;
   private boolean n23FMFechaVencimiento ;
   private boolean n24FMTipo ;
   private boolean n25FMNumero ;
   private boolean n26FMDetalle ;
   private boolean n27FMImporte ;
   private boolean n28FMIdUsuarioNet ;
   private boolean n29FMTipoMovimiento ;
   private boolean n30FMImportePago ;
   private boolean n31FMPathPdf ;
   private String A24FMTipo ;
   private String A26FMDetalle ;
   private String A31FMPathPdf ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A21FMIdNetMovimiento ;
   private boolean[] P00002_n21FMIdNetMovimiento ;
   private java.util.Date[] P00002_A22FMFechaEmision ;
   private boolean[] P00002_n22FMFechaEmision ;
   private java.util.Date[] P00002_A23FMFechaVencimiento ;
   private boolean[] P00002_n23FMFechaVencimiento ;
   private String[] P00002_A24FMTipo ;
   private boolean[] P00002_n24FMTipo ;
   private long[] P00002_A25FMNumero ;
   private boolean[] P00002_n25FMNumero ;
   private String[] P00002_A26FMDetalle ;
   private boolean[] P00002_n26FMDetalle ;
   private long[] P00002_A27FMImporte ;
   private boolean[] P00002_n27FMImporte ;
   private long[] P00002_A28FMIdUsuarioNet ;
   private boolean[] P00002_n28FMIdUsuarioNet ;
   private long[] P00002_A29FMTipoMovimiento ;
   private boolean[] P00002_n29FMTipoMovimiento ;
   private long[] P00002_A30FMImportePago ;
   private boolean[] P00002_n30FMImportePago ;
   private String[] P00002_A31FMPathPdf ;
   private boolean[] P00002_n31FMPathPdf ;
   private long[] P00002_A2FMId ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt AV7GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_Section_GeneralSdt ;
}

final  class workwithdevicesfacturamovimiento_facturamovimiento_section_general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf`, `FMId` FROM `FacturaMovimiento` WHERE `FMId` = ? ORDER BY `FMId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12);
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

