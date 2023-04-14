package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesfacturamovimiento_facturamovimiento_list_grid1 extends GXProcedure
{
   public workwithdevicesfacturamovimiento_facturamovimiento_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.class ), "" );
   }

   public workwithdevicesfacturamovimiento_facturamovimiento_list_grid1( int remoteHandle ,
                                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                                              String aP1 ,
                                                                                                                              java.util.Date aP2 ,
                                                                                                                              java.util.Date aP3 ,
                                                                                                                              long aP4 ,
                                                                                                                              long aP5 ,
                                                                                                                              int aP6 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        long aP4 ,
                        long aP5 ,
                        int aP6 ,
                        GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             long aP4 ,
                             long aP5 ,
                             int aP6 ,
                             GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>[] aP7 )
   {
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV5ExternalId = aP0;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV12SearchText = aP1;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV7cFMFechaEmision = aP2;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV8cFMFechaVencimiento = aP3;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV10start = aP4;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV11count = aP5;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV9gxid = aP6;
      workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV10start == 0 )
      {
      }
      GXPagingFrom2 = (int)(AV10start) ;
      GXPagingTo2 = (int)(((AV11count>0) ? AV11count : 100000000)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV12SearchText ,
                                           AV7cFMFechaEmision ,
                                           AV8cFMFechaVencimiento ,
                                           A24FMTipo ,
                                           A26FMDetalle ,
                                           A22FMFechaEmision ,
                                           A23FMFechaVencimiento ,
                                           Long.valueOf(A28FMIdUsuarioNet) ,
                                           Long.valueOf(AV5ExternalId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV12SearchText = GXutil.concat( GXutil.rtrim( AV12SearchText), "%", "") ;
      lV12SearchText = GXutil.concat( GXutil.rtrim( AV12SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV5ExternalId), lV12SearchText, lV12SearchText, AV7cFMFechaEmision, AV8cFMFechaVencimiento, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A28FMIdUsuarioNet = P00002_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = P00002_n28FMIdUsuarioNet[0] ;
         A23FMFechaVencimiento = P00002_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = P00002_n23FMFechaVencimiento[0] ;
         A22FMFechaEmision = P00002_A22FMFechaEmision[0] ;
         n22FMFechaEmision = P00002_n22FMFechaEmision[0] ;
         A24FMTipo = P00002_A24FMTipo[0] ;
         n24FMTipo = P00002_n24FMTipo[0] ;
         A26FMDetalle = P00002_A26FMDetalle[0] ;
         n26FMDetalle = P00002_n26FMDetalle[0] ;
         A2FMId = P00002_A2FMId[0] ;
         A27FMImporte = P00002_A27FMImporte[0] ;
         n27FMImporte = P00002_n27FMImporte[0] ;
         A25FMNumero = P00002_A25FMNumero[0] ;
         n25FMNumero = P00002_n25FMNumero[0] ;
         A31FMPathPdf = P00002_A31FMPathPdf[0] ;
         n31FMPathPdf = P00002_n31FMPathPdf[0] ;
         A21FMIdNetMovimiento = P00002_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = P00002_n21FMIdNetMovimiento[0] ;
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item(remoteHandle, context);
         AV13GXM2RootCol.add(AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt, 0);
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmid( A2FMId );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechaemision( A22FMFechaEmision );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmfechavencimiento( A23FMFechaVencimiento );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmtipo( A24FMTipo );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmimporte( A27FMImporte );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmdetalle( A26FMDetalle );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmnumero( A25FMNumero );
         AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_Fmpathpdf( A31FMPathPdf );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = workwithdevicesfacturamovimiento_facturamovimiento_list_grid1.this.AV13GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item.class, "WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      scmdbuf = "" ;
      lV12SearchText = "" ;
      A24FMTipo = "" ;
      A26FMDetalle = "" ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      P00002_A28FMIdUsuarioNet = new long[1] ;
      P00002_n28FMIdUsuarioNet = new boolean[] {false} ;
      P00002_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n23FMFechaVencimiento = new boolean[] {false} ;
      P00002_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n22FMFechaEmision = new boolean[] {false} ;
      P00002_A24FMTipo = new String[] {""} ;
      P00002_n24FMTipo = new boolean[] {false} ;
      P00002_A26FMDetalle = new String[] {""} ;
      P00002_n26FMDetalle = new boolean[] {false} ;
      P00002_A2FMId = new long[1] ;
      P00002_A27FMImporte = new long[1] ;
      P00002_n27FMImporte = new boolean[] {false} ;
      P00002_A25FMNumero = new long[1] ;
      P00002_n25FMNumero = new boolean[] {false} ;
      P00002_A31FMPathPdf = new String[] {""} ;
      P00002_n31FMPathPdf = new boolean[] {false} ;
      P00002_A21FMIdNetMovimiento = new long[1] ;
      P00002_n21FMIdNetMovimiento = new boolean[] {false} ;
      A31FMPathPdf = "" ;
      AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A28FMIdUsuarioNet, P00002_n28FMIdUsuarioNet, P00002_A23FMFechaVencimiento, P00002_n23FMFechaVencimiento, P00002_A22FMFechaEmision, P00002_n22FMFechaEmision, P00002_A24FMTipo, P00002_n24FMTipo, P00002_A26FMDetalle, P00002_n26FMDetalle,
            P00002_A2FMId, P00002_A27FMImporte, P00002_n27FMImporte, P00002_A25FMNumero, P00002_n25FMNumero, P00002_A31FMPathPdf, P00002_n31FMPathPdf, P00002_A21FMIdNetMovimiento, P00002_n21FMIdNetMovimiento
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5ExternalId ;
   private long AV10start ;
   private long AV11count ;
   private long A28FMIdUsuarioNet ;
   private long A2FMId ;
   private long A27FMImporte ;
   private long A25FMNumero ;
   private long A21FMIdNetMovimiento ;
   private String scmdbuf ;
   private java.util.Date AV7cFMFechaEmision ;
   private java.util.Date AV8cFMFechaVencimiento ;
   private java.util.Date A22FMFechaEmision ;
   private java.util.Date A23FMFechaVencimiento ;
   private boolean n28FMIdUsuarioNet ;
   private boolean n23FMFechaVencimiento ;
   private boolean n22FMFechaEmision ;
   private boolean n24FMTipo ;
   private boolean n26FMDetalle ;
   private boolean n27FMImporte ;
   private boolean n25FMNumero ;
   private boolean n31FMPathPdf ;
   private boolean n21FMIdNetMovimiento ;
   private String AV12SearchText ;
   private String lV12SearchText ;
   private String A24FMTipo ;
   private String A26FMDetalle ;
   private String A31FMPathPdf ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A28FMIdUsuarioNet ;
   private boolean[] P00002_n28FMIdUsuarioNet ;
   private java.util.Date[] P00002_A23FMFechaVencimiento ;
   private boolean[] P00002_n23FMFechaVencimiento ;
   private java.util.Date[] P00002_A22FMFechaEmision ;
   private boolean[] P00002_n22FMFechaEmision ;
   private String[] P00002_A24FMTipo ;
   private boolean[] P00002_n24FMTipo ;
   private String[] P00002_A26FMDetalle ;
   private boolean[] P00002_n26FMDetalle ;
   private long[] P00002_A2FMId ;
   private long[] P00002_A27FMImporte ;
   private boolean[] P00002_n27FMImporte ;
   private long[] P00002_A25FMNumero ;
   private boolean[] P00002_n25FMNumero ;
   private String[] P00002_A31FMPathPdf ;
   private boolean[] P00002_n31FMPathPdf ;
   private long[] P00002_A21FMIdNetMovimiento ;
   private boolean[] P00002_n21FMIdNetMovimiento ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item> AV13GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item AV14GXM1WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt ;
}

final  class workwithdevicesfacturamovimiento_facturamovimiento_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV12SearchText ,
                                          java.util.Date AV7cFMFechaEmision ,
                                          java.util.Date AV8cFMFechaVencimiento ,
                                          String A24FMTipo ,
                                          String A26FMDetalle ,
                                          java.util.Date A22FMFechaEmision ,
                                          java.util.Date A23FMFechaVencimiento ,
                                          long A28FMIdUsuarioNet ,
                                          long AV5ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `FMIdUsuarioNet`, `FMFechaVencimiento`, `FMFechaEmision`, `FMTipo`, `FMDetalle`, `FMId`, `FMImporte`, `FMNumero`, `FMPathPdf`, `FMIdNetMovimiento`" ;
      sFromString = " FROM `FacturaMovimiento`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`FMIdUsuarioNet` = ?)");
      if ( ! (GXutil.strcmp("", AV12SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER(`FMTipo`) like CONCAT('%', UPPER(?)) or UPPER(`FMDetalle`) like CONCAT('%', UPPER(?)))");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cFMFechaEmision) )
      {
         addWhere(sWhereString, "(`FMFechaEmision` >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV8cFMFechaVencimiento) )
      {
         addWhere(sWhereString, "(`FMFechaVencimiento` >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `FMIdNetMovimiento` DESC" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00002(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1000);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1000);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

