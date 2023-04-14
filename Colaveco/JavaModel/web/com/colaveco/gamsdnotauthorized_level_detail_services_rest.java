package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/GAMSDNotAuthorized_Level_Detail")
public final  class gamsdnotauthorized_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV11gxid ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("gamsdnotauthorized_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      int AV11gxid;
      AV11gxid = (int)(GXutil.lval( sAV11gxid)) ;
      com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt data;
      try
      {
         com.colaveco.gamsdnotauthorized_level_detail worker = new com.colaveco.gamsdnotauthorized_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV11gxid );
         builder = Response.okWrapped(new com.colaveco.SdtGAMSDNotAuthorized_Level_DetailSdt_RESTInterface(data));
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
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

