package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class downloadreport extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.colaveco.GXcfg.class);
      downloadreport pgm = new downloadreport (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";

      try
      {
         aP0 = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public downloadreport( )
   {
      super( -1 , new ModelContext( downloadreport.class ), "" );
      Application.init(com.colaveco.GXcfg.class);
   }

   public downloadreport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( downloadreport.class ), "" );
   }

   public downloadreport( int remoteHandle ,
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
      downloadreport.this.AV2resultadoPathPdf = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV2resultadoPathPdf ;
}

