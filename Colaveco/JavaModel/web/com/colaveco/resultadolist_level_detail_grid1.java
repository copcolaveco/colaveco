package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class resultadolist_level_detail_grid1 extends GXProcedure
{
   public resultadolist_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resultadolist_level_detail_grid1.class ), "" );
   }

   public resultadolist_level_detail_grid1( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                 long aP1 ,
                                                                                                 long aP2 ,
                                                                                                 long aP3 ,
                                                                                                 int aP4 )
   {
      resultadolist_level_detail_grid1.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        long aP2 ,
                        long aP3 ,
                        int aP4 ,
                        GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             long aP2 ,
                             long aP3 ,
                             int aP4 ,
                             GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>[] aP5 )
   {
      resultadolist_level_detail_grid1.this.AV6ExternalId = aP0;
      resultadolist_level_detail_grid1.this.AV8TipoinformeId = aP1;
      resultadolist_level_detail_grid1.this.AV19start = aP2;
      resultadolist_level_detail_grid1.this.AV20count = aP3;
      resultadolist_level_detail_grid1.this.AV16gxid = aP4;
      resultadolist_level_detail_grid1.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV16gxid, 8, 0) ;
      if ( AV19start == 0 )
      {
         AV6ExternalId = GXutil.lval( Gxwebsession.getValue(Gxids+"gxvar_Externalid")) ;
         AV5SDTResultado.clear();
         AV14SDTResultadoList.clear();
         if ( AV8TipoinformeId == 0 )
         {
            GXt_objcol_SdtSDTResultado1 = AV5SDTResultado ;
            GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
            new com.colaveco.dpresultados(remoteHandle, context).execute( AV6ExternalId, GXv_objcol_SdtSDTResultado2) ;
            GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
            AV5SDTResultado = GXt_objcol_SdtSDTResultado1 ;
         }
         else
         {
            GXt_objcol_SdtSDTResultado1 = AV5SDTResultado ;
            GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
            new com.colaveco.dpresultadobyfilter(remoteHandle, context).execute( AV6ExternalId, AV8TipoinformeId, GXv_objcol_SdtSDTResultado2) ;
            GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
            AV5SDTResultado = GXt_objcol_SdtSDTResultado1 ;
         }
         GXt_objcol_SdtSDTResultado1 = AV14SDTResultadoList ;
         GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
         new com.colaveco.refreshresultado(remoteHandle, context).execute( AV5SDTResultado, GXv_objcol_SdtSDTResultado2) ;
         GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
         AV14SDTResultadoList = GXt_objcol_SdtSDTResultado1 ;
         Gxwebsession.setValue(Gxids+"gxvar_Sdtresultadolist", AV14SDTResultadoList.toJSonString(false));
      }
      else
      {
         AV14SDTResultadoList.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtresultadolist"), null);
      }
      AV14SDTResultadoList.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtresultadolist"), null);
      GXPagingFrom2 = (int)(AV19start) ;
      GXPagingTo2 = (int)(((AV20count>0) ? AV20count : 100000000)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV8TipoinformeId) ,
                                           Long.valueOf(A166resultadoIdNetTipoinforme) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV8TipoinformeId), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166resultadoIdNetTipoinforme = P00002_A166resultadoIdNetTipoinforme[0] ;
         A1resultadoId = P00002_A1resultadoId[0] ;
         AV22GXM1ResultadoList_Level_Detail_Grid1Sdt = (com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV21GXM2RootCol.add(AV22GXM1ResultadoList_Level_Detail_Grid1Sdt, 0);
         AV22GXM1ResultadoList_Level_Detail_Grid1Sdt.setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist( AV14SDTResultadoList );
         AV22GXM1ResultadoList_Level_Detail_Grid1Sdt.setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid( AV8TipoinformeId );
         AV22GXM1ResultadoList_Level_Detail_Grid1Sdt.setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid( AV6ExternalId );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Sdtresultadolist", AV14SDTResultadoList.toJSonString(false));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = resultadolist_level_detail_grid1.this.AV21GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21GXM2RootCol = new GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item.class, "ResultadoList_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV5SDTResultado = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      AV14SDTResultadoList = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTResultado1 = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTResultado2 = new GXBaseCollection[1] ;
      scmdbuf = "" ;
      P00002_A166resultadoIdNetTipoinforme = new long[1] ;
      P00002_A1resultadoId = new long[1] ;
      AV22GXM1ResultadoList_Level_Detail_Grid1Sdt = new com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultadolist_level_detail_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A166resultadoIdNetTipoinforme, P00002_A1resultadoId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV6ExternalId ;
   private long AV8TipoinformeId ;
   private long AV19start ;
   private long AV20count ;
   private long A166resultadoIdNetTipoinforme ;
   private long A1resultadoId ;
   private String Gxids ;
   private String scmdbuf ;
   private GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A166resultadoIdNetTipoinforme ;
   private long[] P00002_A1resultadoId ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV5SDTResultado ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV14SDTResultadoList ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> GXt_objcol_SdtSDTResultado1 ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> GXv_objcol_SdtSDTResultado2[] ;
   private GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item> AV21GXM2RootCol ;
   private com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item AV22GXM1ResultadoList_Level_Detail_Grid1Sdt ;
}

final  class resultadolist_level_detail_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV8TipoinformeId ,
                                          long A166resultadoIdNetTipoinforme )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `resultadoIdNetTipoinforme`, `resultadoId`" ;
      sFromString = " FROM `Resultado`" ;
      sOrderString = "" ;
      if ( AV8TipoinformeId != 0 )
      {
         addWhere(sWhereString, "(`resultadoIdNetTipoinforme` = ?)");
      }
      else
      {
         GXv_int3[0] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `resultadoId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P00002(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() );
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
      }
   }

}

