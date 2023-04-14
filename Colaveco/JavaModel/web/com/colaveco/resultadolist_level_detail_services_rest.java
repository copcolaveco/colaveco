package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/ResultadoList_Level_Detail")
public final  class resultadolist_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV6ExternalId ,
                                             @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV8TipoinformeId ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV16gxid ) throws Exception
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
      if ( ! processHeaders("resultadolist_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV6ExternalId;
      AV6ExternalId = GXutil.lval( sAV6ExternalId) ;
      long AV8TipoinformeId;
      AV8TipoinformeId = GXutil.lval( sAV8TipoinformeId) ;
      int AV16gxid;
      AV16gxid = (int)(GXutil.lval( sAV16gxid)) ;
      com.colaveco.SdtResultadoList_Level_DetailSdt data;
      try
      {
         com.colaveco.resultadolist_level_detail worker = new com.colaveco.resultadolist_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV6ExternalId,AV8TipoinformeId,AV16gxid );
         builder = Response.okWrapped(new com.colaveco.SdtResultadoList_Level_DetailSdt_RESTInterface(data));
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

