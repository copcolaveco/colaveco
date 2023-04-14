package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class publicidadconversion extends GXProcedure
{
   public publicidadconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( publicidadconversion.class ), "" );
   }

   public publicidadconversion( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cmdBuffer = " SET @@SESSION.sql_mode= CONCAT_WS(',',@@session.sql_mode,'NO_AUTO_VALUE_ON_ZERO') ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor PUBLICIDAD2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A191PublicidadMostrarWeb = PUBLICIDAD2_A191PublicidadMostrarWeb[0] ;
         A190PublicidadMostrarApp = PUBLICIDAD2_A190PublicidadMostrarApp[0] ;
         n190PublicidadMostrarApp = PUBLICIDAD2_n190PublicidadMostrarApp[0] ;
         A189PublicidadMenuWeb = PUBLICIDAD2_A189PublicidadMenuWeb[0] ;
         n189PublicidadMenuWeb = PUBLICIDAD2_n189PublicidadMenuWeb[0] ;
         A188PublicidadMenuApp = PUBLICIDAD2_A188PublicidadMenuApp[0] ;
         n188PublicidadMenuApp = PUBLICIDAD2_n188PublicidadMenuApp[0] ;
         A187PublicidadImagen = PUBLICIDAD2_A187PublicidadImagen[0] ;
         n187PublicidadImagen = PUBLICIDAD2_n187PublicidadImagen[0] ;
         A186PublicidadDescripcion = PUBLICIDAD2_A186PublicidadDescripcion[0] ;
         n186PublicidadDescripcion = PUBLICIDAD2_n186PublicidadDescripcion[0] ;
         A185PublicidadSubTitulo = PUBLICIDAD2_A185PublicidadSubTitulo[0] ;
         n185PublicidadSubTitulo = PUBLICIDAD2_n185PublicidadSubTitulo[0] ;
         A184PublicidadTitulo = PUBLICIDAD2_A184PublicidadTitulo[0] ;
         A183PublicidadId = PUBLICIDAD2_A183PublicidadId[0] ;
         A40000PublicidadImagen_GXI = PUBLICIDAD2_A40000PublicidadImagen_GXI[0] ;
         n40000PublicidadImagen_GXI = PUBLICIDAD2_n40000PublicidadImagen_GXI[0] ;
         /*
            INSERT RECORD ON TABLE GXA0008

         */
         AV2PublicidadId = A183PublicidadId ;
         AV3PublicidadTitulo = A184PublicidadTitulo ;
         if ( PUBLICIDAD2_n185PublicidadSubTitulo[0] )
         {
            AV4PublicidadSubTitulo = "" ;
            nV4PublicidadSubTitulo = false ;
            nV4PublicidadSubTitulo = true ;
         }
         else
         {
            AV4PublicidadSubTitulo = A185PublicidadSubTitulo ;
            nV4PublicidadSubTitulo = false ;
         }
         if ( PUBLICIDAD2_n186PublicidadDescripcion[0] )
         {
            AV5PublicidadDescripcion = "" ;
            nV5PublicidadDescripcion = false ;
            nV5PublicidadDescripcion = true ;
         }
         else
         {
            AV5PublicidadDescripcion = A186PublicidadDescripcion ;
            nV5PublicidadDescripcion = false ;
         }
         if ( PUBLICIDAD2_n187PublicidadImagen[0] )
         {
            AV6PublicidadImagen = "" ;
            nV6PublicidadImagen = false ;
            nV6PublicidadImagen = true ;
         }
         else
         {
            AV6PublicidadImagen = A187PublicidadImagen ;
            nV6PublicidadImagen = false ;
            AV7PublicidadImagen_GXI = A40000PublicidadImagen_GXI ;
            nV7PublicidadImagen_GXI = false ;
         }
         if ( PUBLICIDAD2_n40000PublicidadImagen_GXI[0] )
         {
            AV7PublicidadImagen_GXI = "" ;
            nV7PublicidadImagen_GXI = false ;
            nV7PublicidadImagen_GXI = true ;
         }
         else
         {
            AV7PublicidadImagen_GXI = A40000PublicidadImagen_GXI ;
            nV7PublicidadImagen_GXI = false ;
         }
         if ( PUBLICIDAD2_n188PublicidadMenuApp[0] )
         {
            AV8PublicidadMenuApp = false ;
            nV8PublicidadMenuApp = false ;
            nV8PublicidadMenuApp = true ;
         }
         else
         {
            AV8PublicidadMenuApp = A188PublicidadMenuApp ;
            nV8PublicidadMenuApp = false ;
         }
         if ( PUBLICIDAD2_n189PublicidadMenuWeb[0] )
         {
            AV9PublicidadMenuWeb = false ;
            nV9PublicidadMenuWeb = false ;
            nV9PublicidadMenuWeb = true ;
         }
         else
         {
            AV9PublicidadMenuWeb = A189PublicidadMenuWeb ;
            nV9PublicidadMenuWeb = false ;
         }
         if ( PUBLICIDAD2_n190PublicidadMostrarApp[0] )
         {
            AV10PublicidadMostrarApp = false ;
            nV10PublicidadMostrarApp = false ;
            nV10PublicidadMostrarApp = true ;
         }
         else
         {
            AV10PublicidadMostrarApp = A190PublicidadMostrarApp ;
            nV10PublicidadMostrarApp = false ;
         }
         AV11PublicidadMostrarWeb = A191PublicidadMostrarWeb ;
         /* Using cursor PUBLICIDAD3 */
         pr_default.execute(1, new Object[] {Long.valueOf(AV2PublicidadId), AV3PublicidadTitulo, Boolean.valueOf(nV4PublicidadSubTitulo), AV4PublicidadSubTitulo, Boolean.valueOf(nV5PublicidadDescripcion), AV5PublicidadDescripcion, Boolean.valueOf(nV6PublicidadImagen), AV6PublicidadImagen, Boolean.valueOf(nV7PublicidadImagen_GXI), AV7PublicidadImagen_GXI, Boolean.valueOf(nV8PublicidadMenuApp), Boolean.valueOf(AV8PublicidadMenuApp), Boolean.valueOf(nV9PublicidadMenuWeb), Boolean.valueOf(AV9PublicidadMenuWeb), Boolean.valueOf(nV10PublicidadMostrarApp), Boolean.valueOf(AV10PublicidadMostrarApp), Boolean.valueOf(AV11PublicidadMostrarWeb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0008");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      cmdBuffer = "" ;
      scmdbuf = "" ;
      PUBLICIDAD2_A191PublicidadMostrarWeb = new boolean[] {false} ;
      PUBLICIDAD2_A190PublicidadMostrarApp = new boolean[] {false} ;
      PUBLICIDAD2_n190PublicidadMostrarApp = new boolean[] {false} ;
      PUBLICIDAD2_A189PublicidadMenuWeb = new boolean[] {false} ;
      PUBLICIDAD2_n189PublicidadMenuWeb = new boolean[] {false} ;
      PUBLICIDAD2_A188PublicidadMenuApp = new boolean[] {false} ;
      PUBLICIDAD2_n188PublicidadMenuApp = new boolean[] {false} ;
      PUBLICIDAD2_A187PublicidadImagen = new String[] {""} ;
      PUBLICIDAD2_n187PublicidadImagen = new boolean[] {false} ;
      PUBLICIDAD2_A186PublicidadDescripcion = new String[] {""} ;
      PUBLICIDAD2_n186PublicidadDescripcion = new boolean[] {false} ;
      PUBLICIDAD2_A185PublicidadSubTitulo = new String[] {""} ;
      PUBLICIDAD2_n185PublicidadSubTitulo = new boolean[] {false} ;
      PUBLICIDAD2_A184PublicidadTitulo = new String[] {""} ;
      PUBLICIDAD2_A183PublicidadId = new long[1] ;
      PUBLICIDAD2_A40000PublicidadImagen_GXI = new String[] {""} ;
      PUBLICIDAD2_n40000PublicidadImagen_GXI = new boolean[] {false} ;
      A187PublicidadImagen = "" ;
      A186PublicidadDescripcion = "" ;
      A185PublicidadSubTitulo = "" ;
      A184PublicidadTitulo = "" ;
      A40000PublicidadImagen_GXI = "" ;
      AV3PublicidadTitulo = "" ;
      AV4PublicidadSubTitulo = "" ;
      AV5PublicidadDescripcion = "" ;
      AV6PublicidadImagen = "" ;
      AV7PublicidadImagen_GXI = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.publicidadconversion__default(),
         new Object[] {
             new Object[] {
            PUBLICIDAD2_A191PublicidadMostrarWeb, PUBLICIDAD2_A190PublicidadMostrarApp, PUBLICIDAD2_n190PublicidadMostrarApp, PUBLICIDAD2_A189PublicidadMenuWeb, PUBLICIDAD2_n189PublicidadMenuWeb, PUBLICIDAD2_A188PublicidadMenuApp, PUBLICIDAD2_n188PublicidadMenuApp, PUBLICIDAD2_A187PublicidadImagen, PUBLICIDAD2_n187PublicidadImagen, PUBLICIDAD2_A186PublicidadDescripcion,
            PUBLICIDAD2_n186PublicidadDescripcion, PUBLICIDAD2_A185PublicidadSubTitulo, PUBLICIDAD2_n185PublicidadSubTitulo, PUBLICIDAD2_A184PublicidadTitulo, PUBLICIDAD2_A183PublicidadId, PUBLICIDAD2_A40000PublicidadImagen_GXI, PUBLICIDAD2_n40000PublicidadImagen_GXI
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GIGXA0008 ;
   private long A183PublicidadId ;
   private long AV2PublicidadId ;
   private String cmdBuffer ;
   private String scmdbuf ;
   private String A186PublicidadDescripcion ;
   private String A185PublicidadSubTitulo ;
   private String A184PublicidadTitulo ;
   private String AV3PublicidadTitulo ;
   private String AV4PublicidadSubTitulo ;
   private String AV5PublicidadDescripcion ;
   private String Gx_emsg ;
   private boolean A191PublicidadMostrarWeb ;
   private boolean A190PublicidadMostrarApp ;
   private boolean n190PublicidadMostrarApp ;
   private boolean A189PublicidadMenuWeb ;
   private boolean n189PublicidadMenuWeb ;
   private boolean A188PublicidadMenuApp ;
   private boolean n188PublicidadMenuApp ;
   private boolean n187PublicidadImagen ;
   private boolean n186PublicidadDescripcion ;
   private boolean n185PublicidadSubTitulo ;
   private boolean n40000PublicidadImagen_GXI ;
   private boolean nV4PublicidadSubTitulo ;
   private boolean nV5PublicidadDescripcion ;
   private boolean nV6PublicidadImagen ;
   private boolean nV7PublicidadImagen_GXI ;
   private boolean AV8PublicidadMenuApp ;
   private boolean nV8PublicidadMenuApp ;
   private boolean AV9PublicidadMenuWeb ;
   private boolean nV9PublicidadMenuWeb ;
   private boolean AV10PublicidadMostrarApp ;
   private boolean nV10PublicidadMostrarApp ;
   private boolean AV11PublicidadMostrarWeb ;
   private String A40000PublicidadImagen_GXI ;
   private String AV7PublicidadImagen_GXI ;
   private String A187PublicidadImagen ;
   private String AV6PublicidadImagen ;
   private IDataStoreProvider pr_default ;
   private boolean[] PUBLICIDAD2_A191PublicidadMostrarWeb ;
   private boolean[] PUBLICIDAD2_A190PublicidadMostrarApp ;
   private boolean[] PUBLICIDAD2_n190PublicidadMostrarApp ;
   private boolean[] PUBLICIDAD2_A189PublicidadMenuWeb ;
   private boolean[] PUBLICIDAD2_n189PublicidadMenuWeb ;
   private boolean[] PUBLICIDAD2_A188PublicidadMenuApp ;
   private boolean[] PUBLICIDAD2_n188PublicidadMenuApp ;
   private String[] PUBLICIDAD2_A187PublicidadImagen ;
   private boolean[] PUBLICIDAD2_n187PublicidadImagen ;
   private String[] PUBLICIDAD2_A186PublicidadDescripcion ;
   private boolean[] PUBLICIDAD2_n186PublicidadDescripcion ;
   private String[] PUBLICIDAD2_A185PublicidadSubTitulo ;
   private boolean[] PUBLICIDAD2_n185PublicidadSubTitulo ;
   private String[] PUBLICIDAD2_A184PublicidadTitulo ;
   private long[] PUBLICIDAD2_A183PublicidadId ;
   private String[] PUBLICIDAD2_A40000PublicidadImagen_GXI ;
   private boolean[] PUBLICIDAD2_n40000PublicidadImagen_GXI ;
}

final  class publicidadconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("PUBLICIDAD2", "SELECT `PublicidadMostrarWeb`, `PublicidadMostrarApp`, `PublicidadMenuWeb`, `PublicidadMenuApp`, `PublicidadImagen`, `PublicidadDescripcion`, `PublicidadSubTitulo`, `PublicidadTitulo`, `PublicidadId`, `PublicidadImagen_GXI` FROM `Publicidad` ORDER BY `PublicidadId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("PUBLICIDAD3", "INSERT INTO `GXA0008`(`PublicidadId`, `PublicidadTitulo`, `PublicidadSubTitulo`, `PublicidadDescripcion`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadMenuApp`, `PublicidadMenuWeb`, `PublicidadMostrarApp`, `PublicidadMostrarWeb`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((boolean[]) buf[1])[0] = rslt.getBoolean(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((boolean[]) buf[3])[0] = rslt.getBoolean(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((boolean[]) buf[5])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(10));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 256);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 256);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 256);
               ((long[]) buf[14])[0] = rslt.getLong(9);
               ((String[]) buf[15])[0] = rslt.getMultimediaUri(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 256);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 256);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 256);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(5, (String)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(6, (String)parms[9], (String)parms[7], 2048,"GXA0008","PublicidadImagen");
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(7, ((Boolean) parms[11]).booleanValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(8, ((Boolean) parms[13]).booleanValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(9, ((Boolean) parms[15]).booleanValue());
               }
               stmt.setBoolean(10, ((Boolean) parms[16]).booleanValue());
               return;
      }
   }

}

