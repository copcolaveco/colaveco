package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesNotificaciones_Notificaciones_List")
public final  class workwithdevicesnotificaciones_notificaciones_list_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV5ExternalId ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV7gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesnotificaciones_notificaciones_list",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5ExternalId;
      AV5ExternalId = GXutil.lval( sAV5ExternalId) ;
      int AV7gxid;
      AV7gxid = (int)(GXutil.lval( sAV7gxid)) ;
      com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt data;
      try
      {
         com.colaveco.workwithdevicesnotificaciones_notificaciones_list worker = new com.colaveco.workwithdevicesnotificaciones_notificaciones_list(remoteHandle, context);
         data = worker.executeUdp(AV5ExternalId,AV7gxid );
         builder = Response.okWrapped(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt_RESTInterface(data));
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

