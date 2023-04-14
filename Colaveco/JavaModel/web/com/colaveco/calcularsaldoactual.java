package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calcularsaldoactual extends GXProcedure
{
   public calcularsaldoactual( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calcularsaldoactual.class ), "" );
   }

   public calcularsaldoactual( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( long aP0 )
   {
      calcularsaldoactual.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( long aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             long[] aP1 )
   {
      calcularsaldoactual.this.A2FMId = aP0;
      calcularsaldoactual.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00152 */
      pr_default.execute(0, new Object[] {Long.valueOf(A2FMId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A29FMTipoMovimiento = P00152_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = P00152_n29FMTipoMovimiento[0] ;
         A27FMImporte = P00152_A27FMImporte[0] ;
         n27FMImporte = P00152_n27FMImporte[0] ;
         if ( A29FMTipoMovimiento == 2 )
         {
            AV8SaldoActual = (long)(AV8SaldoActual+A27FMImporte) ;
         }
         else if ( A29FMTipoMovimiento == 1 )
         {
            AV8SaldoActual = (long)(AV8SaldoActual-A27FMImporte) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = calcularsaldoactual.this.AV8SaldoActual;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00152_A2FMId = new long[1] ;
      P00152_A29FMTipoMovimiento = new long[1] ;
      P00152_n29FMTipoMovimiento = new boolean[] {false} ;
      P00152_A27FMImporte = new long[1] ;
      P00152_n27FMImporte = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.calcularsaldoactual__default(),
         new Object[] {
             new Object[] {
            P00152_A2FMId, P00152_A29FMTipoMovimiento, P00152_n29FMTipoMovimiento, P00152_A27FMImporte, P00152_n27FMImporte
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A2FMId ;
   private long AV8SaldoActual ;
   private long A29FMTipoMovimiento ;
   private long A27FMImporte ;
   private String scmdbuf ;
   private boolean n29FMTipoMovimiento ;
   private boolean n27FMImporte ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P00152_A2FMId ;
   private long[] P00152_A29FMTipoMovimiento ;
   private boolean[] P00152_n29FMTipoMovimiento ;
   private long[] P00152_A27FMImporte ;
   private boolean[] P00152_n27FMImporte ;
}

final  class calcularsaldoactual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00152", "SELECT `FMId`, `FMTipoMovimiento`, `FMImporte` FROM `FacturaMovimiento` WHERE `FMId` = ? ORDER BY `FMId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

