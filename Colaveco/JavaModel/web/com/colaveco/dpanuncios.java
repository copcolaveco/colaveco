package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpanuncios extends GXProcedure
{
   public dpanuncios( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpanuncios.class ), "" );
   }

   public dpanuncios( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTAnuncio> executeUdp( )
   {
      dpanuncios.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTAnuncio>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtSDTAnuncio>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtSDTAnuncio>[] aP0 )
   {
      dpanuncios.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A40000AnuncioImagen_GXI = P000A2_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = P000A2_n40000AnuncioImagen_GXI[0] ;
         A192AnuncioId = P000A2_A192AnuncioId[0] ;
         A193AnuncioTitulo = P000A2_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = P000A2_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = P000A2_n194AnuncioSubTitulo[0] ;
         A195AnuncioImagen = P000A2_A195AnuncioImagen[0] ;
         n195AnuncioImagen = P000A2_n195AnuncioImagen[0] ;
         A196AnuncioPublico = P000A2_A196AnuncioPublico[0] ;
         n196AnuncioPublico = P000A2_n196AnuncioPublico[0] ;
         A197AnuncioDescripcion = P000A2_A197AnuncioDescripcion[0] ;
         Gxm1sdtanuncio = (com.colaveco.SdtSDTAnuncio)new com.colaveco.SdtSDTAnuncio(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtanuncio, 0);
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anuncioid( A192AnuncioId );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anunciotitulo( A193AnuncioTitulo );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anunciosubtitulo( A194AnuncioSubTitulo );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anuncioimagen( A195AnuncioImagen );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anuncioimagen_gxi( A40000AnuncioImagen_GXI );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anunciopublico( A196AnuncioPublico );
         Gxm1sdtanuncio.setgxTv_SdtSDTAnuncio_Anunciodescripcion( A197AnuncioDescripcion );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpanuncios.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtSDTAnuncio>(com.colaveco.SdtSDTAnuncio.class, "SDTAnuncio", "Colaveco", remoteHandle);
      scmdbuf = "" ;
      P000A2_A40000AnuncioImagen_GXI = new String[] {""} ;
      P000A2_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      P000A2_A192AnuncioId = new long[1] ;
      P000A2_A193AnuncioTitulo = new String[] {""} ;
      P000A2_A194AnuncioSubTitulo = new String[] {""} ;
      P000A2_n194AnuncioSubTitulo = new boolean[] {false} ;
      P000A2_A195AnuncioImagen = new String[] {""} ;
      P000A2_n195AnuncioImagen = new boolean[] {false} ;
      P000A2_A196AnuncioPublico = new boolean[] {false} ;
      P000A2_n196AnuncioPublico = new boolean[] {false} ;
      P000A2_A197AnuncioDescripcion = new String[] {""} ;
      A40000AnuncioImagen_GXI = "" ;
      A193AnuncioTitulo = "" ;
      A194AnuncioSubTitulo = "" ;
      A195AnuncioImagen = "" ;
      A197AnuncioDescripcion = "" ;
      Gxm1sdtanuncio = new com.colaveco.SdtSDTAnuncio(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.dpanuncios__default(),
         new Object[] {
             new Object[] {
            P000A2_A40000AnuncioImagen_GXI, P000A2_n40000AnuncioImagen_GXI, P000A2_A192AnuncioId, P000A2_A193AnuncioTitulo, P000A2_A194AnuncioSubTitulo, P000A2_n194AnuncioSubTitulo, P000A2_A195AnuncioImagen, P000A2_n195AnuncioImagen, P000A2_A196AnuncioPublico, P000A2_n196AnuncioPublico,
            P000A2_A197AnuncioDescripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A192AnuncioId ;
   private String scmdbuf ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean n194AnuncioSubTitulo ;
   private boolean n195AnuncioImagen ;
   private boolean A196AnuncioPublico ;
   private boolean n196AnuncioPublico ;
   private String A40000AnuncioImagen_GXI ;
   private String A193AnuncioTitulo ;
   private String A194AnuncioSubTitulo ;
   private String A197AnuncioDescripcion ;
   private String A195AnuncioImagen ;
   private GXBaseCollection<com.colaveco.SdtSDTAnuncio>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P000A2_A40000AnuncioImagen_GXI ;
   private boolean[] P000A2_n40000AnuncioImagen_GXI ;
   private long[] P000A2_A192AnuncioId ;
   private String[] P000A2_A193AnuncioTitulo ;
   private String[] P000A2_A194AnuncioSubTitulo ;
   private boolean[] P000A2_n194AnuncioSubTitulo ;
   private String[] P000A2_A195AnuncioImagen ;
   private boolean[] P000A2_n195AnuncioImagen ;
   private boolean[] P000A2_A196AnuncioPublico ;
   private boolean[] P000A2_n196AnuncioPublico ;
   private String[] P000A2_A197AnuncioDescripcion ;
   private GXBaseCollection<com.colaveco.SdtSDTAnuncio> Gxm2rootcol ;
   private com.colaveco.SdtSDTAnuncio Gxm1sdtanuncio ;
}

final  class dpanuncios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000A2", "SELECT `AnuncioImagen_GXI`, `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioImagen`, `AnuncioPublico`, `AnuncioDescripcion` FROM `Anuncio` ORDER BY `AnuncioId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getMultimediaUri(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(1));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((boolean[]) buf[8])[0] = rslt.getBoolean(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
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

