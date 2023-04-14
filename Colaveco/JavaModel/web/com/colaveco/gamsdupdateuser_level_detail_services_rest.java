package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/GAMSDUpdateUser_Level_Detail")
public final  class gamsdupdateuser_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV16gxid ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("gamsdupdateuser_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      int AV16gxid;
      AV16gxid = (int)(GXutil.lval( sAV16gxid)) ;
      com.colaveco.SdtGAMSDUpdateUser_Level_DetailSdt data;
      try
      {
         com.colaveco.gamsdupdateuser_level_detail worker = new com.colaveco.gamsdupdateuser_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV16gxid );
         builder = Response.okWrapped(new com.colaveco.SdtGAMSDUpdateUser_Level_DetailSdt_RESTInterface(data));
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

