package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpresultado extends GXProcedure
{
   public dpresultado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpresultado.class ), "" );
   }

   public dpresultado( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem> executeUdp( )
   {
      dpresultado.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem>[] aP0 )
   {
      dpresultado.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00052 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1resultadoId = P00052_A1resultadoId[0] ;
         A7resultadoFicha = P00052_A7resultadoFicha[0] ;
         n7resultadoFicha = P00052_n7resultadoFicha[0] ;
         A8resultadoComentarios = P00052_A8resultadoComentarios[0] ;
         n8resultadoComentarios = P00052_n8resultadoComentarios[0] ;
         A9resultadoUserId = P00052_A9resultadoUserId[0] ;
         n9resultadoUserId = P00052_n9resultadoUserId[0] ;
         A10resultadoTypeId = P00052_A10resultadoTypeId[0] ;
         n10resultadoTypeId = P00052_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = P00052_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = P00052_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = P00052_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = P00052_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = P00052_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = P00052_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = P00052_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = P00052_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = P00052_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = P00052_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = P00052_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = P00052_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = P00052_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = P00052_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = P00052_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = P00052_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = P00052_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = P00052_A19resultadoEliminado[0] ;
         n19resultadoEliminado = P00052_n19resultadoEliminado[0] ;
         A20resultadoAbonado = P00052_A20resultadoAbonado[0] ;
         n20resultadoAbonado = P00052_n20resultadoAbonado[0] ;
         Gxm1sdtresultado = (com.colaveco.SdtSDTResultado_SDTResultadoItem)new com.colaveco.SdtSDTResultado_SDTResultadoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtresultado, 0);
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoid( A1resultadoId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoficha( A7resultadoFicha );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadocomentarios( A8resultadoComentarios );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadouserid( A9resultadoUserId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadotypeid( A10resultadoTypeId );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnetusuario( A11resultadoIdNetUsuario );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechacreado( A12resultadoFechaCreado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadofechaemision( A13resultadoFechaEmision );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathexcel( A14resultadoPathExcel );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathpdf( A15resultadoPathPdf );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadopathcsv( A16resultadoPathCsv );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidestado( A17resultadoIdEstado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidlibro( A18resultadoIdLibro );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoidnettipoinforme( A166resultadoIdNetTipoinforme );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoeliminado( A19resultadoEliminado );
         Gxm1sdtresultado.setgxTv_SdtSDTResultado_SDTResultadoItem_Resultadoabonado( A20resultadoAbonado );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpresultado.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem>(com.colaveco.SdtSDTResultado_SDTResultadoItem.class, "SDTResultadoItem", "Colaveco", remoteHandle);
      scmdbuf = "" ;
      P00052_A1resultadoId = new long[1] ;
      P00052_A7resultadoFicha = new long[1] ;
      P00052_n7resultadoFicha = new boolean[] {false} ;
      P00052_A8resultadoComentarios = new String[] {""} ;
      P00052_n8resultadoComentarios = new boolean[] {false} ;
      P00052_A9resultadoUserId = new long[1] ;
      P00052_n9resultadoUserId = new boolean[] {false} ;
      P00052_A10resultadoTypeId = new long[1] ;
      P00052_n10resultadoTypeId = new boolean[] {false} ;
      P00052_A11resultadoIdNetUsuario = new long[1] ;
      P00052_n11resultadoIdNetUsuario = new boolean[] {false} ;
      P00052_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      P00052_n12resultadoFechaCreado = new boolean[] {false} ;
      P00052_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00052_n13resultadoFechaEmision = new boolean[] {false} ;
      P00052_A14resultadoPathExcel = new String[] {""} ;
      P00052_n14resultadoPathExcel = new boolean[] {false} ;
      P00052_A15resultadoPathPdf = new String[] {""} ;
      P00052_n15resultadoPathPdf = new boolean[] {false} ;
      P00052_A16resultadoPathCsv = new String[] {""} ;
      P00052_n16resultadoPathCsv = new boolean[] {false} ;
      P00052_A17resultadoIdEstado = new long[1] ;
      P00052_n17resultadoIdEstado = new boolean[] {false} ;
      P00052_A18resultadoIdLibro = new long[1] ;
      P00052_n18resultadoIdLibro = new boolean[] {false} ;
      P00052_A166resultadoIdNetTipoinforme = new long[1] ;
      P00052_A19resultadoEliminado = new byte[1] ;
      P00052_n19resultadoEliminado = new boolean[] {false} ;
      P00052_A20resultadoAbonado = new long[1] ;
      P00052_n20resultadoAbonado = new boolean[] {false} ;
      A8resultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      Gxm1sdtresultado = new com.colaveco.SdtSDTResultado_SDTResultadoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.dpresultado__default(),
         new Object[] {
             new Object[] {
            P00052_A1resultadoId, P00052_A7resultadoFicha, P00052_n7resultadoFicha, P00052_A8resultadoComentarios, P00052_n8resultadoComentarios, P00052_A9resultadoUserId, P00052_n9resultadoUserId, P00052_A10resultadoTypeId, P00052_n10resultadoTypeId, P00052_A11resultadoIdNetUsuario,
            P00052_n11resultadoIdNetUsuario, P00052_A12resultadoFechaCreado, P00052_n12resultadoFechaCreado, P00052_A13resultadoFechaEmision, P00052_n13resultadoFechaEmision, P00052_A14resultadoPathExcel, P00052_n14resultadoPathExcel, P00052_A15resultadoPathPdf, P00052_n15resultadoPathPdf, P00052_A16resultadoPathCsv,
            P00052_n16resultadoPathCsv, P00052_A17resultadoIdEstado, P00052_n17resultadoIdEstado, P00052_A18resultadoIdLibro, P00052_n18resultadoIdLibro, P00052_A166resultadoIdNetTipoinforme, P00052_A19resultadoEliminado, P00052_n19resultadoEliminado, P00052_A20resultadoAbonado, P00052_n20resultadoAbonado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A19resultadoEliminado ;
   private short Gx_err ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A166resultadoIdNetTipoinforme ;
   private long A20resultadoAbonado ;
   private String scmdbuf ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean n7resultadoFicha ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n12resultadoFechaCreado ;
   private boolean n13resultadoFechaEmision ;
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
   private GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P00052_A1resultadoId ;
   private long[] P00052_A7resultadoFicha ;
   private boolean[] P00052_n7resultadoFicha ;
   private String[] P00052_A8resultadoComentarios ;
   private boolean[] P00052_n8resultadoComentarios ;
   private long[] P00052_A9resultadoUserId ;
   private boolean[] P00052_n9resultadoUserId ;
   private long[] P00052_A10resultadoTypeId ;
   private boolean[] P00052_n10resultadoTypeId ;
   private long[] P00052_A11resultadoIdNetUsuario ;
   private boolean[] P00052_n11resultadoIdNetUsuario ;
   private java.util.Date[] P00052_A12resultadoFechaCreado ;
   private boolean[] P00052_n12resultadoFechaCreado ;
   private java.util.Date[] P00052_A13resultadoFechaEmision ;
   private boolean[] P00052_n13resultadoFechaEmision ;
   private String[] P00052_A14resultadoPathExcel ;
   private boolean[] P00052_n14resultadoPathExcel ;
   private String[] P00052_A15resultadoPathPdf ;
   private boolean[] P00052_n15resultadoPathPdf ;
   private String[] P00052_A16resultadoPathCsv ;
   private boolean[] P00052_n16resultadoPathCsv ;
   private long[] P00052_A17resultadoIdEstado ;
   private boolean[] P00052_n17resultadoIdEstado ;
   private long[] P00052_A18resultadoIdLibro ;
   private boolean[] P00052_n18resultadoIdLibro ;
   private long[] P00052_A166resultadoIdNetTipoinforme ;
   private byte[] P00052_A19resultadoEliminado ;
   private boolean[] P00052_n19resultadoEliminado ;
   private long[] P00052_A20resultadoAbonado ;
   private boolean[] P00052_n20resultadoAbonado ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado_SDTResultadoItem> Gxm2rootcol ;
   private com.colaveco.SdtSDTResultado_SDTResultadoItem Gxm1sdtresultado ;
}

final  class dpresultado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00052", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` ORDER BY `resultadoId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
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
      }
   }

}

