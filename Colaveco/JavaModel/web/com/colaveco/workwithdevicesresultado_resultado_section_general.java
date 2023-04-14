package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesresultado_resultado_section_general extends GXProcedure
{
   public workwithdevicesresultado_resultado_section_general( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_section_general.class ), "" );
   }

   public workwithdevicesresultado_resultado_section_general( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt executeUdp( long aP0 ,
                                                                                            int aP1 )
   {
      workwithdevicesresultado_resultado_section_general.this.aP2 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt[] aP2 )
   {
      workwithdevicesresultado_resultado_section_general.this.A1resultadoId = aP0;
      workwithdevicesresultado_resultado_section_general.this.AV6gxid = aP1;
      workwithdevicesresultado_resultado_section_general.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(A1resultadoId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7resultadoFicha = P00002_A7resultadoFicha[0] ;
         n7resultadoFicha = P00002_n7resultadoFicha[0] ;
         A11resultadoIdNetUsuario = P00002_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = P00002_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = P00002_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = P00002_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = P00002_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = P00002_n13resultadoFechaEmision[0] ;
         A8resultadoComentarios = P00002_A8resultadoComentarios[0] ;
         n8resultadoComentarios = P00002_n8resultadoComentarios[0] ;
         A9resultadoUserId = P00002_A9resultadoUserId[0] ;
         n9resultadoUserId = P00002_n9resultadoUserId[0] ;
         A10resultadoTypeId = P00002_A10resultadoTypeId[0] ;
         n10resultadoTypeId = P00002_n10resultadoTypeId[0] ;
         A14resultadoPathExcel = P00002_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = P00002_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = P00002_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = P00002_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = P00002_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = P00002_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = P00002_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = P00002_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = P00002_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = P00002_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = P00002_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = P00002_A19resultadoEliminado[0] ;
         n19resultadoEliminado = P00002_n19resultadoEliminado[0] ;
         A20resultadoAbonado = P00002_A20resultadoAbonado[0] ;
         n20resultadoAbonado = P00002_n20resultadoAbonado[0] ;
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid( A1resultadoId );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha( A7resultadoFicha );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario( A11resultadoIdNetUsuario );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado( A12resultadoFechaCreado );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision( A13resultadoFechaEmision );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios( A8resultadoComentarios );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid( A9resultadoUserId );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid( A10resultadoTypeId );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel( A14resultadoPathExcel );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf( A15resultadoPathPdf );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv( A16resultadoPathCsv );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado( A17resultadoIdEstado );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro( A18resultadoIdLibro );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme( A166resultadoIdNetTipoinforme );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado( A19resultadoEliminado );
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado( A20resultadoAbonado );
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
      this.aP2[0] = workwithdevicesresultado_resultado_section_general.this.AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A1resultadoId = new long[1] ;
      P00002_A7resultadoFicha = new long[1] ;
      P00002_n7resultadoFicha = new boolean[] {false} ;
      P00002_A11resultadoIdNetUsuario = new long[1] ;
      P00002_n11resultadoIdNetUsuario = new boolean[] {false} ;
      P00002_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n12resultadoFechaCreado = new boolean[] {false} ;
      P00002_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n13resultadoFechaEmision = new boolean[] {false} ;
      P00002_A8resultadoComentarios = new String[] {""} ;
      P00002_n8resultadoComentarios = new boolean[] {false} ;
      P00002_A9resultadoUserId = new long[1] ;
      P00002_n9resultadoUserId = new boolean[] {false} ;
      P00002_A10resultadoTypeId = new long[1] ;
      P00002_n10resultadoTypeId = new boolean[] {false} ;
      P00002_A14resultadoPathExcel = new String[] {""} ;
      P00002_n14resultadoPathExcel = new boolean[] {false} ;
      P00002_A15resultadoPathPdf = new String[] {""} ;
      P00002_n15resultadoPathPdf = new boolean[] {false} ;
      P00002_A16resultadoPathCsv = new String[] {""} ;
      P00002_n16resultadoPathCsv = new boolean[] {false} ;
      P00002_A17resultadoIdEstado = new long[1] ;
      P00002_n17resultadoIdEstado = new boolean[] {false} ;
      P00002_A18resultadoIdLibro = new long[1] ;
      P00002_n18resultadoIdLibro = new boolean[] {false} ;
      P00002_A166resultadoIdNetTipoinforme = new long[1] ;
      P00002_A19resultadoEliminado = new byte[1] ;
      P00002_n19resultadoEliminado = new boolean[] {false} ;
      P00002_A20resultadoAbonado = new long[1] ;
      P00002_n20resultadoAbonado = new boolean[] {false} ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A8resultadoComentarios = "" ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesresultado_resultado_section_general__default(),
         new Object[] {
             new Object[] {
            P00002_A1resultadoId, P00002_A7resultadoFicha, P00002_n7resultadoFicha, P00002_A11resultadoIdNetUsuario, P00002_n11resultadoIdNetUsuario, P00002_A12resultadoFechaCreado, P00002_n12resultadoFechaCreado, P00002_A13resultadoFechaEmision, P00002_n13resultadoFechaEmision, P00002_A8resultadoComentarios,
            P00002_n8resultadoComentarios, P00002_A9resultadoUserId, P00002_n9resultadoUserId, P00002_A10resultadoTypeId, P00002_n10resultadoTypeId, P00002_A14resultadoPathExcel, P00002_n14resultadoPathExcel, P00002_A15resultadoPathPdf, P00002_n15resultadoPathPdf, P00002_A16resultadoPathCsv,
            P00002_n16resultadoPathCsv, P00002_A17resultadoIdEstado, P00002_n17resultadoIdEstado, P00002_A18resultadoIdLibro, P00002_n18resultadoIdLibro, P00002_A166resultadoIdNetTipoinforme, P00002_A19resultadoEliminado, P00002_n19resultadoEliminado, P00002_A20resultadoAbonado, P00002_n20resultadoAbonado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A19resultadoEliminado ;
   private short Gx_err ;
   private int AV6gxid ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A11resultadoIdNetUsuario ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A166resultadoIdNetTipoinforme ;
   private long A20resultadoAbonado ;
   private String scmdbuf ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean n7resultadoFicha ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n12resultadoFechaCreado ;
   private boolean n13resultadoFechaEmision ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean n17resultadoIdEstado ;
   private boolean n18resultadoIdLibro ;
   private boolean n19resultadoEliminado ;
   private boolean n20resultadoAbonado ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A1resultadoId ;
   private long[] P00002_A7resultadoFicha ;
   private boolean[] P00002_n7resultadoFicha ;
   private long[] P00002_A11resultadoIdNetUsuario ;
   private boolean[] P00002_n11resultadoIdNetUsuario ;
   private java.util.Date[] P00002_A12resultadoFechaCreado ;
   private boolean[] P00002_n12resultadoFechaCreado ;
   private java.util.Date[] P00002_A13resultadoFechaEmision ;
   private boolean[] P00002_n13resultadoFechaEmision ;
   private String[] P00002_A8resultadoComentarios ;
   private boolean[] P00002_n8resultadoComentarios ;
   private long[] P00002_A9resultadoUserId ;
   private boolean[] P00002_n9resultadoUserId ;
   private long[] P00002_A10resultadoTypeId ;
   private boolean[] P00002_n10resultadoTypeId ;
   private String[] P00002_A14resultadoPathExcel ;
   private boolean[] P00002_n14resultadoPathExcel ;
   private String[] P00002_A15resultadoPathPdf ;
   private boolean[] P00002_n15resultadoPathPdf ;
   private String[] P00002_A16resultadoPathCsv ;
   private boolean[] P00002_n16resultadoPathCsv ;
   private long[] P00002_A17resultadoIdEstado ;
   private boolean[] P00002_n17resultadoIdEstado ;
   private long[] P00002_A18resultadoIdLibro ;
   private boolean[] P00002_n18resultadoIdLibro ;
   private long[] P00002_A166resultadoIdNetTipoinforme ;
   private byte[] P00002_A19resultadoEliminado ;
   private boolean[] P00002_n19resultadoEliminado ;
   private long[] P00002_A20resultadoAbonado ;
   private boolean[] P00002_n20resultadoAbonado ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt ;
}

final  class workwithdevicesresultado_resultado_section_general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `resultadoId`, `resultadoFicha`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ? ORDER BY `resultadoId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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

