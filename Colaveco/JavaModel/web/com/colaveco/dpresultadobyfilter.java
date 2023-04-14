package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpresultadobyfilter extends GXProcedure
{
   public dpresultadobyfilter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpresultadobyfilter.class ), "" );
   }

   public dpresultadobyfilter( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTResultado> executeUdp( long aP0 ,
                                                                     long aP1 )
   {
      dpresultadobyfilter.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTResultado>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP2 )
   {
      dpresultadobyfilter.this.AV5ExternalId = aP0;
      dpresultadobyfilter.this.AV6resultadoIdNetTipoinforme = aP1;
      dpresultadobyfilter.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00072 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV5ExternalId), Long.valueOf(AV6resultadoIdNetTipoinforme)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11resultadoIdNetUsuario = P00072_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = P00072_n11resultadoIdNetUsuario[0] ;
         A166resultadoIdNetTipoinforme = P00072_A166resultadoIdNetTipoinforme[0] ;
         A1resultadoId = P00072_A1resultadoId[0] ;
         A8resultadoComentarios = P00072_A8resultadoComentarios[0] ;
         n8resultadoComentarios = P00072_n8resultadoComentarios[0] ;
         A9resultadoUserId = P00072_A9resultadoUserId[0] ;
         n9resultadoUserId = P00072_n9resultadoUserId[0] ;
         A10resultadoTypeId = P00072_A10resultadoTypeId[0] ;
         n10resultadoTypeId = P00072_n10resultadoTypeId[0] ;
         A12resultadoFechaCreado = P00072_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = P00072_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = P00072_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = P00072_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = P00072_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = P00072_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = P00072_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = P00072_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = P00072_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = P00072_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = P00072_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = P00072_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = P00072_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = P00072_n18resultadoIdLibro[0] ;
         A19resultadoEliminado = P00072_A19resultadoEliminado[0] ;
         n19resultadoEliminado = P00072_n19resultadoEliminado[0] ;
         A20resultadoAbonado = P00072_A20resultadoAbonado[0] ;
         n20resultadoAbonado = P00072_n20resultadoAbonado[0] ;
         A7resultadoFicha = P00072_A7resultadoFicha[0] ;
         n7resultadoFicha = P00072_n7resultadoFicha[0] ;
         Gxm1sdtresultado = (com.colaveco.SdtSDTResultado)new com.colaveco.SdtSDTResultado(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtresultado, 0);
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoid( A1resultadoId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoficha( A7resultadoFicha );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadocomentarios( A8resultadoComentarios );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadouserid( A9resultadoUserId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadotypeid( A10resultadoTypeId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoidnetusuario( A11resultadoIdNetUsuario );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadofechacreado( A12resultadoFechaCreado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadofechaemision( A13resultadoFechaEmision );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadopathexcel( A14resultadoPathExcel );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadopathpdf( A15resultadoPathPdf );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadopathcsv( A16resultadoPathCsv );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoidestado( A17resultadoIdEstado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoidlibro( A18resultadoIdLibro );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( A166resultadoIdNetTipoinforme );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoeliminado( A19resultadoEliminado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_Resultadoabonado( A20resultadoAbonado );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dpresultadobyfilter.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      scmdbuf = "" ;
      P00072_A11resultadoIdNetUsuario = new long[1] ;
      P00072_n11resultadoIdNetUsuario = new boolean[] {false} ;
      P00072_A166resultadoIdNetTipoinforme = new long[1] ;
      P00072_A1resultadoId = new long[1] ;
      P00072_A8resultadoComentarios = new String[] {""} ;
      P00072_n8resultadoComentarios = new boolean[] {false} ;
      P00072_A9resultadoUserId = new long[1] ;
      P00072_n9resultadoUserId = new boolean[] {false} ;
      P00072_A10resultadoTypeId = new long[1] ;
      P00072_n10resultadoTypeId = new boolean[] {false} ;
      P00072_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      P00072_n12resultadoFechaCreado = new boolean[] {false} ;
      P00072_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00072_n13resultadoFechaEmision = new boolean[] {false} ;
      P00072_A14resultadoPathExcel = new String[] {""} ;
      P00072_n14resultadoPathExcel = new boolean[] {false} ;
      P00072_A15resultadoPathPdf = new String[] {""} ;
      P00072_n15resultadoPathPdf = new boolean[] {false} ;
      P00072_A16resultadoPathCsv = new String[] {""} ;
      P00072_n16resultadoPathCsv = new boolean[] {false} ;
      P00072_A17resultadoIdEstado = new long[1] ;
      P00072_n17resultadoIdEstado = new boolean[] {false} ;
      P00072_A18resultadoIdLibro = new long[1] ;
      P00072_n18resultadoIdLibro = new boolean[] {false} ;
      P00072_A19resultadoEliminado = new byte[1] ;
      P00072_n19resultadoEliminado = new boolean[] {false} ;
      P00072_A20resultadoAbonado = new long[1] ;
      P00072_n20resultadoAbonado = new boolean[] {false} ;
      P00072_A7resultadoFicha = new long[1] ;
      P00072_n7resultadoFicha = new boolean[] {false} ;
      A8resultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      Gxm1sdtresultado = new com.colaveco.SdtSDTResultado(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.dpresultadobyfilter__default(),
         new Object[] {
             new Object[] {
            P00072_A11resultadoIdNetUsuario, P00072_n11resultadoIdNetUsuario, P00072_A166resultadoIdNetTipoinforme, P00072_A1resultadoId, P00072_A8resultadoComentarios, P00072_n8resultadoComentarios, P00072_A9resultadoUserId, P00072_n9resultadoUserId, P00072_A10resultadoTypeId, P00072_n10resultadoTypeId,
            P00072_A12resultadoFechaCreado, P00072_n12resultadoFechaCreado, P00072_A13resultadoFechaEmision, P00072_n13resultadoFechaEmision, P00072_A14resultadoPathExcel, P00072_n14resultadoPathExcel, P00072_A15resultadoPathPdf, P00072_n15resultadoPathPdf, P00072_A16resultadoPathCsv, P00072_n16resultadoPathCsv,
            P00072_A17resultadoIdEstado, P00072_n17resultadoIdEstado, P00072_A18resultadoIdLibro, P00072_n18resultadoIdLibro, P00072_A19resultadoEliminado, P00072_n19resultadoEliminado, P00072_A20resultadoAbonado, P00072_n20resultadoAbonado, P00072_A7resultadoFicha, P00072_n7resultadoFicha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A19resultadoEliminado ;
   private short Gx_err ;
   private long AV5ExternalId ;
   private long AV6resultadoIdNetTipoinforme ;
   private long A11resultadoIdNetUsuario ;
   private long A166resultadoIdNetTipoinforme ;
   private long A1resultadoId ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A20resultadoAbonado ;
   private long A7resultadoFicha ;
   private String scmdbuf ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean n12resultadoFechaCreado ;
   private boolean n13resultadoFechaEmision ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean n17resultadoIdEstado ;
   private boolean n18resultadoIdLibro ;
   private boolean n19resultadoEliminado ;
   private boolean n20resultadoAbonado ;
   private boolean n7resultadoFicha ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00072_A11resultadoIdNetUsuario ;
   private boolean[] P00072_n11resultadoIdNetUsuario ;
   private long[] P00072_A166resultadoIdNetTipoinforme ;
   private long[] P00072_A1resultadoId ;
   private String[] P00072_A8resultadoComentarios ;
   private boolean[] P00072_n8resultadoComentarios ;
   private long[] P00072_A9resultadoUserId ;
   private boolean[] P00072_n9resultadoUserId ;
   private long[] P00072_A10resultadoTypeId ;
   private boolean[] P00072_n10resultadoTypeId ;
   private java.util.Date[] P00072_A12resultadoFechaCreado ;
   private boolean[] P00072_n12resultadoFechaCreado ;
   private java.util.Date[] P00072_A13resultadoFechaEmision ;
   private boolean[] P00072_n13resultadoFechaEmision ;
   private String[] P00072_A14resultadoPathExcel ;
   private boolean[] P00072_n14resultadoPathExcel ;
   private String[] P00072_A15resultadoPathPdf ;
   private boolean[] P00072_n15resultadoPathPdf ;
   private String[] P00072_A16resultadoPathCsv ;
   private boolean[] P00072_n16resultadoPathCsv ;
   private long[] P00072_A17resultadoIdEstado ;
   private boolean[] P00072_n17resultadoIdEstado ;
   private long[] P00072_A18resultadoIdLibro ;
   private boolean[] P00072_n18resultadoIdLibro ;
   private byte[] P00072_A19resultadoEliminado ;
   private boolean[] P00072_n19resultadoEliminado ;
   private long[] P00072_A20resultadoAbonado ;
   private boolean[] P00072_n20resultadoAbonado ;
   private long[] P00072_A7resultadoFicha ;
   private boolean[] P00072_n7resultadoFicha ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> Gxm2rootcol ;
   private com.colaveco.SdtSDTResultado Gxm1sdtresultado ;
}

final  class dpresultadobyfilter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00072", "SELECT `resultadoIdNetUsuario`, `resultadoIdNetTipoinforme`, `resultadoId`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoEliminado`, `resultadoAbonado`, `resultadoFicha` FROM `Resultado` WHERE (`resultadoIdNetUsuario` = ?) AND (`resultadoIdNetTipoinforme` = ?) ORDER BY `resultadoFicha` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(15);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

