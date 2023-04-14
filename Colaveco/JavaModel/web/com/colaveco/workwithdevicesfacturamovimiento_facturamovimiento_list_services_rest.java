package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List")
public final  class workwithdevicesfacturamovimiento_facturamovimiento_list_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV5ExternalId ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV9gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesfacturamovimiento_facturamovimiento_list",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5ExternalId;
      AV5ExternalId = GXutil.lval( sAV5ExternalId) ;
      int AV9gxid;
      AV9gxid = (int)(GXutil.lval( sAV9gxid)) ;
      com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt data;
      try
      {
         com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list worker = new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list(remoteHandle, context);
         data = worker.executeUdp(AV5ExternalId,AV9gxid );
         builder = Response.okWrapped(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_ListSdt_RESTInterface(data));
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

