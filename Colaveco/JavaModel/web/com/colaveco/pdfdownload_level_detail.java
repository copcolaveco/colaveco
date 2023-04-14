package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdfdownload_level_detail extends GXProcedure
{
   public pdfdownload_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdfdownload_level_detail.class ), "" );
   }

   public pdfdownload_level_detail( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtPDFdownload_Level_DetailSdt executeUdp( String aP0 ,
                                                                  long aP1 ,
                                                                  int aP2 )
   {
      pdfdownload_level_detail.this.aP3 = new com.colaveco.SdtPDFdownload_Level_DetailSdt[] {new com.colaveco.SdtPDFdownload_Level_DetailSdt()};
      execute_int(aP0, aP1, aP2, aP3);
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
         AV8path = "/data/com.artech.colaveco.menu/files/" + GXutil.trim( GXutil.str( AV6resultadoFicha, 18, 0)) + ".pdf" ;
         new com.colaveco.loger(remoteHandle, context).execute( AV8path) ;
         AV9file.setSource( AV8path );
         AV12httpClient.execute("GET", AV7url);
         AV12httpClient.toFile(AV8path);
         AV10uri = AV8path ;
         new com.colaveco.loger(remoteHandle, context).execute( AV10uri) ;
         AV11destfile = AV10uri ;
         Gxwebsession.setValue(Gxids+"gxvar_Url", AV7url);
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV7url = Gxwebsession.getValue(Gxids+"gxvar_Url") ;
      }
      AV16GXM1PDFdownload_Level_DetailSdt.setgxTv_SdtPDFdownload_Level_DetailSdt_Url( AV7url );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pdfdownload_level_detail.this.AV16GXM1PDFdownload_Level_DetailSdt;
      CloseOpenCursors();
      AV12httpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16GXM1PDFdownload_Level_DetailSdt = new com.colaveco.SdtPDFdownload_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
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
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtPDFdownload_Level_DetailSdt AV16GXM1PDFdownload_Level_DetailSdt ;
}

