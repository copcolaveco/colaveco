package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class loger extends GXProcedure
{
   public loger( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( loger.class ), "" );
   }

   public loger( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      loger.this.AV8LogDetalle = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE Log

      */
      A174LogDetalle = AV8LogDetalle ;
      n174LogDetalle = false ;
      /* Using cursor P00102 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n174LogDetalle), A174LogDetalle});
      /* Retrieving last key number assigned */
      /* Using cursor P00103 */
      pr_default.execute(1);
      A175LogId = P00103_A175LogId[0] ;
      pr_default.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("Log");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "loger");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A174LogDetalle = "" ;
      scmdbuf = "" ;
      P00103_A175LogId = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.loger__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00103_A175LogId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS7 ;
   private long A175LogId ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean n174LogDetalle ;
   private String AV8LogDetalle ;
   private String A174LogDetalle ;
   private IDataStoreProvider pr_default ;
   private long[] P00103_A175LogId ;
}

final  class loger__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00102", "INSERT INTO `Log`(`LogDetalle`) VALUES(?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00103", "SELECT LAST_INSERT_ID() ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(1, (String)parms[1]);
               }
               return;
      }
   }

}

