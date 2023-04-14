package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesNotificaciones_Notificaciones_Detail")
public final  class workwithdevicesnotificaciones_notificaciones_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("NotificacionesId") @javax.ws.rs.DefaultValue("") String sA6NotificacionesId ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV6gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesnotificaciones_notificaciones_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long A6NotificacionesId;
      A6NotificacionesId = GXutil.lval( sA6NotificacionesId) ;
      int AV6gxid;
      AV6gxid = (int)(GXutil.lval( sAV6gxid)) ;
      com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt data;
      try
      {
         com.colaveco.workwithdevicesnotificaciones_notificaciones_detail worker = new com.colaveco.workwithdevicesnotificaciones_notificaciones_detail(remoteHandle, context);
         data = worker.executeUdp(A6NotificacionesId,AV6gxid );
         builder = Response.okWrapped(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_DetailSdt_RESTInterface(data));
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

