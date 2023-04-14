package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/PDFdownload_Level_Detail")
public final  class pdfdownload_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Resultadopathpdf") @javax.ws.rs.DefaultValue("") String sAV5resultadoPathPdf ,
                                             @javax.ws.rs.QueryParam("Resultadoficha") @javax.ws.rs.DefaultValue("") String sAV6resultadoFicha ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV13gxid ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("pdfdownload_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      String AV5resultadoPathPdf;
      AV5resultadoPathPdf = sAV5resultadoPathPdf ;
      long AV6resultadoFicha;
      AV6resultadoFicha = GXutil.lval( sAV6resultadoFicha) ;
      int AV13gxid;
      AV13gxid = (int)(GXutil.lval( sAV13gxid)) ;
      com.colaveco.SdtPDFdownload_Level_DetailSdt data;
      try
      {
         com.colaveco.pdfdownload_level_detail worker = new com.colaveco.pdfdownload_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV5resultadoPathPdf,AV6resultadoFicha,AV13gxid );
         builder = Response.okWrapped(new com.colaveco.SdtPDFdownload_Level_DetailSdt_RESTInterface(data));
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_LOW;
   }

}

