/*
               File: WorkWithDevicesResultado_Resultado_Detail
        Description: WorkWithDevicesResultado_Resultado_Detail
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:54.45
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class workwithdevicesresultado_resultado_detail extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      int aP1 = 0;
      com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] aP2 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt()};

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("resultadoId"));
      aP1 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2);

      IEntity outObjGXM2WorkWithDevicesResultado_Resultado_DetailSdt =  AndroidContext.ApplicationContext.createEntity("", "WorkWithDevicesResultado_Resultado_Detail", null);
      if (aP2[0] != null)
      {
         aP2[0].sdttoentity(outObjGXM2WorkWithDevicesResultado_Resultado_DetailSdt );
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM2WorkWithDevicesResultado_Resultado_DetailSdt);


      return true ;
   }

   public workwithdevicesresultado_resultado_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_detail.class ), "" );
   }

   public workwithdevicesresultado_resultado_detail( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt executeUdp( long aP0 ,
                                                                                   int aP1 )
   {
      workwithdevicesresultado_resultado_detail.this.A1resultadoId = aP0;
      workwithdevicesresultado_resultado_detail.this.AV6gxid = aP1;
      workwithdevicesresultado_resultado_detail.this.aP2 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] aP2 )
   {
      workwithdevicesresultado_resultado_detail.this.A1resultadoId = aP0;
      workwithdevicesresultado_resultado_detail.this.AV6gxid = aP1;
      workwithdevicesresultado_resultado_detail.this.aP2 = aP2;
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
         pr_default.execute(0, new Object[] {new Long(A1resultadoId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7resultadoFicha = P00002_A7resultadoFicha[0] ;
            n7resultadoFicha = P00002_n7resultadoFicha[0] ;
            Gxdynprop1 = GXutil.str( A7resultadoFicha, 18, 0) ;
            Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Form\",\"Caption\",\"" + GXutil.encodeJSON( Gxdynprop1) + "\"]" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true");
      }
      AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesresultado_resultado_detail.this.AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      scmdbuf = "" ;
      P00002_A1resultadoId = new long[1] ;
      P00002_A7resultadoFicha = new long[1] ;
      P00002_n7resultadoFicha = new boolean[] {false} ;
      Gxdynprop1 = "" ;
      Gxdynprop = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesresultado_resultado_detail__default(),
         new Object[] {
             new Object[] {
            P00002_A1resultadoId, P00002_A7resultadoFicha, P00002_n7resultadoFicha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6gxid ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private String Gxids ;
   private String scmdbuf ;
   private String Gxdynprop1 ;
   private boolean n7resultadoFicha ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A1resultadoId ;
   private long[] P00002_A7resultadoFicha ;
   private boolean[] P00002_n7resultadoFicha ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_DetailSdt AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt ;
}

final  class workwithdevicesresultado_resultado_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT [resultadoId], [resultadoFicha] FROM [Resultado] WHERE [resultadoId] = ? ORDER BY [resultadoId] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, 0,true )
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

