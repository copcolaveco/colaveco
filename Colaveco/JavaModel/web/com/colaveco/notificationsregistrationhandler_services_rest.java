package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/NotificationsRegistrationHandler")
public final  class notificationsregistrationhandler_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.notificationsregistrationhandler_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      byte AV11DeviceType;
      AV11DeviceType = entity.getDeviceType() ;
      String AV8DeviceId;
      AV8DeviceId = entity.getDeviceId() ;
      String AV10DeviceToken;
      AV10DeviceToken = entity.getDeviceToken() ;
      String AV9DeviceName;
      AV9DeviceName = entity.getDeviceName() ;
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
      if ( ! processHeaders("notificationsregistrationhandler",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.notificationsregistrationhandler worker = new com.colaveco.notificationsregistrationhandler(remoteHandle, context);
         worker.execute(AV11DeviceType,AV8DeviceId,AV10DeviceToken,AV9DeviceName );
         builder = Response.okWrapped();
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

