package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class homecolaveco_level_detail_grid1 extends GXProcedure
{
   public homecolaveco_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( homecolaveco_level_detail_grid1.class ), "" );
   }

   public homecolaveco_level_detail_grid1( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                long aP1 ,
                                                                                                int aP2 )
   {
      homecolaveco_level_detail_grid1.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        int aP2 ,
                        GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             int aP2 ,
                             GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>[] aP3 )
   {
      homecolaveco_level_detail_grid1.this.AV8start = aP0;
      homecolaveco_level_detail_grid1.this.AV9count = aP1;
      homecolaveco_level_detail_grid1.this.AV7gxid = aP2;
      homecolaveco_level_detail_grid1.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)(AV8start) ;
      GXPagingTo2 = (int)(((AV9count>0) ? AV9count : 100000000)) ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A196AnuncioPublico = P00002_A196AnuncioPublico[0] ;
         n196AnuncioPublico = P00002_n196AnuncioPublico[0] ;
         A40000AnuncioImagen_GXI = P00002_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = P00002_n40000AnuncioImagen_GXI[0] ;
         A192AnuncioId = P00002_A192AnuncioId[0] ;
         A193AnuncioTitulo = P00002_A193AnuncioTitulo[0] ;
         A197AnuncioDescripcion = P00002_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = P00002_A195AnuncioImagen[0] ;
         n195AnuncioImagen = P00002_n195AnuncioImagen[0] ;
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt = (com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV10GXM2RootCol.add(AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt, 0);
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioid( A192AnuncioId );
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciotitulo( A193AnuncioTitulo );
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anunciodescripcion( A197AnuncioDescripcion );
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen( A195AnuncioImagen );
         AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt.setgxTv_SdtHomeColaveco_Level_Detail_Grid1Sdt_Item_Anuncioimagen_gxi( A40000AnuncioImagen_GXI );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = homecolaveco_level_detail_grid1.this.AV10GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10GXM2RootCol = new GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item.class, "HomeColaveco_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      scmdbuf = "" ;
      P00002_A196AnuncioPublico = new boolean[] {false} ;
      P00002_n196AnuncioPublico = new boolean[] {false} ;
      P00002_A40000AnuncioImagen_GXI = new String[] {""} ;
      P00002_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      P00002_A192AnuncioId = new long[1] ;
      P00002_A193AnuncioTitulo = new String[] {""} ;
      P00002_A197AnuncioDescripcion = new String[] {""} ;
      P00002_A195AnuncioImagen = new String[] {""} ;
      P00002_n195AnuncioImagen = new boolean[] {false} ;
      A40000AnuncioImagen_GXI = "" ;
      A193AnuncioTitulo = "" ;
      A197AnuncioDescripcion = "" ;
      A195AnuncioImagen = "" ;
      AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt = new com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.homecolaveco_level_detail_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A196AnuncioPublico, P00002_n196AnuncioPublico, P00002_A40000AnuncioImagen_GXI, P00002_n40000AnuncioImagen_GXI, P00002_A192AnuncioId, P00002_A193AnuncioTitulo, P00002_A197AnuncioDescripcion, P00002_A195AnuncioImagen, P00002_n195AnuncioImagen
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV8start ;
   private long AV9count ;
   private long A192AnuncioId ;
   private String scmdbuf ;
   private boolean A196AnuncioPublico ;
   private boolean n196AnuncioPublico ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean n195AnuncioImagen ;
   private String A40000AnuncioImagen_GXI ;
   private String A193AnuncioTitulo ;
   private String A197AnuncioDescripcion ;
   private String A195AnuncioImagen ;
   private GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private boolean[] P00002_A196AnuncioPublico ;
   private boolean[] P00002_n196AnuncioPublico ;
   private String[] P00002_A40000AnuncioImagen_GXI ;
   private boolean[] P00002_n40000AnuncioImagen_GXI ;
   private long[] P00002_A192AnuncioId ;
   private String[] P00002_A193AnuncioTitulo ;
   private String[] P00002_A197AnuncioDescripcion ;
   private String[] P00002_A195AnuncioImagen ;
   private boolean[] P00002_n195AnuncioImagen ;
   private GXBaseCollection<com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item> AV10GXM2RootCol ;
   private com.colaveco.SdtHomeColaveco_Level_Detail_Grid1Sdt_Item AV11GXM1HomeColaveco_Level_Detail_Grid1Sdt ;
}

final  class homecolaveco_level_detail_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `AnuncioPublico`, `AnuncioImagen_GXI`, `AnuncioId`, `AnuncioTitulo`, `AnuncioDescripcion`, `AnuncioImagen` FROM `Anuncio` WHERE `AnuncioPublico` = 1 ORDER BY `AnuncioId`  LIMIT ?, ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((boolean[]) buf[0])[0] = rslt.getBoolean(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getMultimediaUri(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((String[]) buf[7])[0] = rslt.getMultimediaFile(6, rslt.getVarchar(2));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

