package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/SolicitudfrascoInsert_Level_Detail")
public final  class solicitudfrascoinsert_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV33gxid ) throws Exception
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
      if ( ! processHeaders("solicitudfrascoinsert_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      int AV33gxid;
      AV33gxid = (int)(GXutil.lval( sAV33gxid)) ;
      com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt data;
      try
      {
         com.colaveco.solicitudfrascoinsert_level_detail worker = new com.colaveco.solicitudfrascoinsert_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV33gxid );
         builder = Response.okWrapped(new com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt_RESTInterface(data));
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

