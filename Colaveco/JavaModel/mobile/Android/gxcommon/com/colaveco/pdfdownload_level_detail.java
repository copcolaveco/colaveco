/*
               File: PDFdownload_Level_Detail
        Description: PDFdownload_Level_Detail
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:52:6.94
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class pdfdownload_level_detail extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      String aP0 = "";
      long aP1 = 0;
      int aP2 = 0;
      com.colaveco.SdtPDFdownload_Level_DetailSdt[] aP3 = new com.colaveco.SdtPDFdownload_Level_DetailSdt[] {new com.colaveco.SdtPDFdownload_Level_DetailSdt()};

      aP0 = (String) androidPropertiesObject.optStringProperty("resultadoPathPdf");
      aP1 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("resultadoFicha"));
      aP2 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2, aP3);

      IEntity outObjGXM1PDFdownload_Level_DetailSdt =  AndroidContext.ApplicationContext.createEntity("", "PDFdownload_Level_Detail", null);
      if (aP3[0] != null)
      {
         aP3[0].sdttoentity(outObjGXM1PDFdownload_Level_DetailSdt );
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM1PDFdownload_Level_DetailSdt);


      return true ;
   }

   public pdfdownload_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdfdownload_level_detail.class ), "" );
   }

   public pdfdownload_level_detail( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.colaveco.SdtPDFdownload_Level_DetailSdt executeUdp( String aP0 ,
                                                                  long aP1 ,
                                                                  int aP2 )
   {
      pdfdownload_level_detail.this.AV5resultadoPathPdf = aP0;
      pdfdownload_level_detail.this.AV6resultadoFicha = aP1;
      pdfdownload_level_detail.this.AV13gxid = aP2;
      pdfdownload_level_detail.this.aP3 = new com.colaveco.SdtPDFdownload_Level_DetailSdt[] {new com.colaveco.SdtPDFdownload_Level_DetailSdt()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        com.colaveco.SdtPDFdownload_Level_DetailSdt[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             com.colaveco.SdtPDFdownload_Level_DetailSdt[] aP3 )
   {
      pdfdownload_level_detail.this.AV5resultadoPathPdf = aP0;
      pdfdownload_level_detail.this.AV6resultadoFicha = aP1;
      pdfdownload_level_detail.this.AV13gxid = aP2;
      pdfdownload_level_detail.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV13gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         AV7url = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo=" + AV5resultadoPathPdf ;
         new com.colaveco.loger(remoteHandle, context).execute( AV7url) ;
         AV8path = com.genexus.util.GXDirectory.applicationdatapath() + AV9file.getSeparator() + GXutil.trim( GXutil.str( AV6resultadoFicha, 18, 0)) + ".pdf" ;
         new com.colaveco.loger(remoteHandle, context).execute( AV8path) ;
         AV9file.setSource( AV8path );
         AV12httpClient.execute("GET", AV7url);
         AV12httpClient.toFile(AV8path);
         AV10uri = "file://" + AV8path ;
         new com.colaveco.loger(remoteHandle, context).execute( AV10uri) ;
         AV11destfile = AV10uri ;
         Gxwebsession.setValue(Gxids+"gxvar_Destfile", AV11destfile);
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV11destfile = Gxwebsession.getValue(Gxids+"gxvar_Destfile") ;
      }
      AV16GXM1PDFdownload_Level_DetailSdt.setgxTv_SdtPDFdownload_Level_DetailSdt_Destfile( AV11destfile );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pdfdownload_level_detail.this.AV16GXM1PDFdownload_Level_DetailSdt;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16GXM1PDFdownload_Level_DetailSdt = new com.colaveco.SdtPDFdownload_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      AV7url = "" ;
      AV8path = "" ;
      AV9file = new com.genexus.util.GXFile();
      AV12httpClient = new com.genexus.internet.HttpClient();
      AV10uri = "" ;
      AV11destfile = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13gxid ;
   private long AV6resultadoFicha ;
   private String Gxids ;
   private String AV5resultadoPathPdf ;
   private String AV7url ;
   private String AV8path ;
   private String AV10uri ;
   private String AV11destfile ;
   private com.genexus.util.GXFile AV9file ;
   private com.colaveco.SdtPDFdownload_Level_DetailSdt[] aP3 ;
   private com.genexus.internet.HttpClient AV12httpClient ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private com.colaveco.SdtPDFdownload_Level_DetailSdt AV16GXM1PDFdownload_Level_DetailSdt ;
}

