package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
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
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void ReorganizeAnuncio( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table Anuncio */
      cmdBuffer = " ALTER TABLE `Anuncio` ADD (`AnuncioDescripcion` national varchar(256) NOT NULL DEFAULT '') ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE `Anuncio` ALTER COLUMN `AnuncioDescripcion` DROP DEFAULT ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
   }

   private void tablesCount( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         /* Using cursor P00012 */
         pr_default.execute(0);
         AnuncioCount = P00012_AAnuncioCount[0] ;
         pr_default.close(0);
         GXReorganization.printRecordCount ( "Anuncio" ,  AnuncioCount );
      }
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         if ( GXutil.dbmsVersion( context, remoteHandle, "DEFAULT") < 5 )
         {
            GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_bad_DBMS_version", new Object[] {"5"}) ) ;
            return false ;
         }
      }
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      sSchemaVar = GXutil.databaseName( context, remoteHandle, "DEFAULT") ;
      if ( ColumnExist("Anuncio",sSchemaVar,"AnuncioDescripcion") )
      {
         GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_column_exist", new Object[] {"AnuncioDescripcion","Anuncio"}) ) ;
         return false ;
      }
      return true ;
   }

   private boolean ColumnExist( String sTableName ,
                                String sMySchemaName ,
                                String sMyColumnName )
   {
      boolean result;
      result = false ;
      /* Using cursor P00023 */
      pr_default.execute(1, new Object[] {sTableName, sMySchemaName, sMyColumnName});
      while ( (pr_default.getStatus(1) != 101) )
      {
         tablename = P00023_Atablename[0] ;
         ntablename = P00023_ntablename[0] ;
         schemaname = P00023_Aschemaname[0] ;
         nschemaname = P00023_nschemaname[0] ;
         columnname = P00023_Acolumnname[0] ;
         ncolumnname = P00023_ncolumnname[0] ;
         result = true ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return result ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "ReorganizeAnuncio" ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Anuncio",""}) ,  1 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Anuncio",""}) );
      ReorgSubmitThreadPool.addBlock( "ReorganizeAnuncio" );
   }

   private void setPrecedenceris( )
   {
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Anuncio",""})+" STARTED" );
               ReorganizeAnuncio( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"Anuncio",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P00012_AAnuncioCount = new int[1] ;
      sSchemaVar = "" ;
      sTableName = "" ;
      sMySchemaName = "" ;
      sMyColumnName = "" ;
      tablename = "" ;
      ntablename = false ;
      schemaname = "" ;
      nschemaname = false ;
      columnname = "" ;
      ncolumnname = false ;
      P00023_Atablename = new String[] {""} ;
      P00023_ntablename = new boolean[] {false} ;
      P00023_Aschemaname = new String[] {""} ;
      P00023_nschemaname = new boolean[] {false} ;
      P00023_Acolumnname = new String[] {""} ;
      P00023_ncolumnname = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.reorg__default(),
         new Object[] {
             new Object[] {
            P00012_AAnuncioCount
            }
            , new Object[] {
            P00023_Atablename, P00023_Aschemaname, P00023_Acolumnname
            }
         }
      );
      /* GeneXus formulas. */
   }

   protected short ErrCode ;
   protected int AnuncioCount ;
   protected String scmdbuf ;
   protected String sSchemaVar ;
   protected String sTableName ;
   protected String sMySchemaName ;
   protected String sMyColumnName ;
   protected boolean ntablename ;
   protected boolean nschemaname ;
   protected boolean ncolumnname ;
   protected String tablename ;
   protected String schemaname ;
   protected String columnname ;
   protected IDataStoreProvider pr_default ;
   protected int[] P00012_AAnuncioCount ;
   protected String[] P00023_Atablename ;
   protected boolean[] P00023_ntablename ;
   protected String[] P00023_Aschemaname ;
   protected boolean[] P00023_nschemaname ;
   protected String[] P00023_Acolumnname ;
   protected boolean[] P00023_ncolumnname ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT COUNT(*) FROM `Anuncio` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00023", "SELECT table_name, table_schema, column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE (table_name = ?) AND (table_schema = ?) AND (column_name = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               stmt.setString(3, (String)parms[2], 255);
               return;
      }
   }

}

