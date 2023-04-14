/*
               File: DownloadPDF
        Description: Download PDF
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 10:7:19.25
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class downloadpdf extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      String aP1 = "";

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("resultadoFicha"));
      aP1 = (String) androidPropertiesObject.optStringProperty("resultadoPathPdf");

      execute(aP0, aP1);



      return true ;
   }

   public downloadpdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( downloadpdf.class ), "" );
   }

   public downloadpdf( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             String aP1 )
   {
      downloadpdf.this.AV10resultadoFicha = aP0;
      downloadpdf.this.AV9resultadoPathPdf = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8url = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo=" + AV9resultadoPathPdf ;
      new com.colaveco.loger(remoteHandle, context).execute( AV8url) ;
      AV12path = com.genexus.util.GXDirectory.applicationdatapath() + AV11file.getSeparator() + GXutil.trim( GXutil.str( AV10resultadoFicha, 18, 0)) + ".pdf" ;
      new com.colaveco.loger(remoteHandle, context).execute( AV12path) ;
      AV11file.setSource( AV12path );
      AV15Uri = "file://" + AV12path ;
      new com.colaveco.loger(remoteHandle, context).execute( AV15Uri) ;
      AV16Destfile = AV15Uri ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8url = "" ;
      AV12path = "" ;
      AV11file = new com.genexus.util.GXFile();
      AV15Uri = "" ;
      AV16Destfile = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10resultadoFicha ;
   private String AV15Uri ;
   private String AV16Destfile ;
   private String AV9resultadoPathPdf ;
   private String AV8url ;
   private String AV12path ;
   private com.genexus.util.GXFile AV11file ;
}

