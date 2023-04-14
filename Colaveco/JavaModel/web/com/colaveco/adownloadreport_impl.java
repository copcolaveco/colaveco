package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class adownloadreport_impl extends GXWebProcedure
{
   public adownloadreport_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "resultadoPathPdf") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV11resultadoPathPdf = gxfirstwebparm ;
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8path = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo=" + AV11resultadoPathPdf ;
      new com.colaveco.loger(remoteHandle, context).execute( "DownloadReport") ;
      new com.colaveco.loger(remoteHandle, context).execute( AV8path) ;
      new com.colaveco.loger(remoteHandle, context).execute( AV13HttpResponse.getErrDescription()) ;
      new com.colaveco.loger(remoteHandle, context).execute( GXutil.str( AV13HttpResponse.getErrCode(), 10, 2)) ;
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_LOW;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV11resultadoPathPdf = "" ;
      AV8path = "" ;
      AV13HttpResponse = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV11resultadoPathPdf ;
   private String AV8path ;
   private com.genexus.internet.HttpResponse AV13HttpResponse ;
}

