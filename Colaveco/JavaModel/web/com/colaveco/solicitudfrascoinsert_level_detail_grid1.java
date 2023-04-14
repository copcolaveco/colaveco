package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class solicitudfrascoinsert_level_detail_grid1 extends GXProcedure
{
   public solicitudfrascoinsert_level_detail_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( solicitudfrascoinsert_level_detail_grid1.class ), "" );
   }

   public solicitudfrascoinsert_level_detail_grid1( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                         long aP1 ,
                                                                                                         int aP2 )
   {
      solicitudfrascoinsert_level_detail_grid1.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        int aP2 ,
                        GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             int aP2 ,
                             GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>[] aP3 )
   {
      solicitudfrascoinsert_level_detail_grid1.this.AV20start = aP0;
      solicitudfrascoinsert_level_detail_grid1.this.AV21count = aP1;
      solicitudfrascoinsert_level_detail_grid1.this.AV17gxid = aP2;
      solicitudfrascoinsert_level_detail_grid1.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV17gxid, 8, 0) ;
      AV11ExternalId = GXutil.lval( Gxwebsession.getValue(Gxids+"gxvar_Externalid")) ;
      GXPagingFrom2 = (int)(AV20start) ;
      GXPagingTo2 = (int)(((AV21count>0) ? AV21count : 100000000)) ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV11ExternalId), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120UsuarioIdNet = P00002_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = P00002_n120UsuarioIdNet[0] ;
         A5UsuarioId = P00002_A5UsuarioId[0] ;
         A116UsuarioNombre = P00002_A116UsuarioNombre[0] ;
         n116UsuarioNombre = P00002_n116UsuarioNombre[0] ;
         A127UsuarioAgenciaFrasco = P00002_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = P00002_n127UsuarioAgenciaFrasco[0] ;
         A121UsuarioDireccion = P00002_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = P00002_n121UsuarioDireccion[0] ;
         A114UsuarioEmail = P00002_A114UsuarioEmail[0] ;
         n114UsuarioEmail = P00002_n114UsuarioEmail[0] ;
         A140UsuarioTecnicoTelefono1 = P00002_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = P00002_n140UsuarioTecnicoTelefono1[0] ;
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt = (com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)new com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
         AV22GXM2RootCol.add(AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt, 0);
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid( A5UsuarioId );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet( A120UsuarioIdNet );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre( A116UsuarioNombre );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco( A127UsuarioAgenciaFrasco );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion( A121UsuarioDireccion );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail( A114UsuarioEmail );
         AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1( A140UsuarioTecnicoTelefono1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Externalid", GXutil.str( AV11ExternalId, 18, 0));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = solicitudfrascoinsert_level_detail_grid1.this.AV22GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22GXM2RootCol = new GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>(com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item.class, "SolicitudfrascoInsert_Level_Detail_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      scmdbuf = "" ;
      P00002_A120UsuarioIdNet = new long[1] ;
      P00002_n120UsuarioIdNet = new boolean[] {false} ;
      P00002_A5UsuarioId = new long[1] ;
      P00002_A116UsuarioNombre = new String[] {""} ;
      P00002_n116UsuarioNombre = new boolean[] {false} ;
      P00002_A127UsuarioAgenciaFrasco = new short[1] ;
      P00002_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      P00002_A121UsuarioDireccion = new String[] {""} ;
      P00002_n121UsuarioDireccion = new boolean[] {false} ;
      P00002_A114UsuarioEmail = new String[] {""} ;
      P00002_n114UsuarioEmail = new boolean[] {false} ;
      P00002_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      P00002_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      A116UsuarioNombre = "" ;
      A121UsuarioDireccion = "" ;
      A114UsuarioEmail = "" ;
      A140UsuarioTecnicoTelefono1 = "" ;
      AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt = new com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.solicitudfrascoinsert_level_detail_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A120UsuarioIdNet, P00002_n120UsuarioIdNet, P00002_A5UsuarioId, P00002_A116UsuarioNombre, P00002_n116UsuarioNombre, P00002_A127UsuarioAgenciaFrasco, P00002_n127UsuarioAgenciaFrasco, P00002_A121UsuarioDireccion, P00002_n121UsuarioDireccion, P00002_A114UsuarioEmail,
            P00002_n114UsuarioEmail, P00002_A140UsuarioTecnicoTelefono1, P00002_n140UsuarioTecnicoTelefono1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A127UsuarioAgenciaFrasco ;
   private short Gx_err ;
   private int AV17gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV20start ;
   private long AV21count ;
   private long AV11ExternalId ;
   private long A120UsuarioIdNet ;
   private long A5UsuarioId ;
   private String Gxids ;
   private String scmdbuf ;
   private boolean n120UsuarioIdNet ;
   private boolean n116UsuarioNombre ;
   private boolean n127UsuarioAgenciaFrasco ;
   private boolean n121UsuarioDireccion ;
   private boolean n114UsuarioEmail ;
   private boolean n140UsuarioTecnicoTelefono1 ;
   private String A116UsuarioNombre ;
   private String A121UsuarioDireccion ;
   private String A114UsuarioEmail ;
   private String A140UsuarioTecnicoTelefono1 ;
   private GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A120UsuarioIdNet ;
   private boolean[] P00002_n120UsuarioIdNet ;
   private long[] P00002_A5UsuarioId ;
   private String[] P00002_A116UsuarioNombre ;
   private boolean[] P00002_n116UsuarioNombre ;
   private short[] P00002_A127UsuarioAgenciaFrasco ;
   private boolean[] P00002_n127UsuarioAgenciaFrasco ;
   private String[] P00002_A121UsuarioDireccion ;
   private boolean[] P00002_n121UsuarioDireccion ;
   private String[] P00002_A114UsuarioEmail ;
   private boolean[] P00002_n114UsuarioEmail ;
   private String[] P00002_A140UsuarioTecnicoTelefono1 ;
   private boolean[] P00002_n140UsuarioTecnicoTelefono1 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item> AV22GXM2RootCol ;
   private com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item AV23GXM1SolicitudfrascoInsert_Level_Detail_Grid1Sdt ;
}

final  class solicitudfrascoinsert_level_detail_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `UsuarioIdNet`, `UsuarioId`, `UsuarioNombre`, `UsuarioAgenciaFrasco`, `UsuarioDireccion`, `UsuarioEmail`, `UsuarioTecnicoTelefono1` FROM `Usuario` WHERE `UsuarioIdNet` = ? ORDER BY `UsuarioId`  LIMIT ?, ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

