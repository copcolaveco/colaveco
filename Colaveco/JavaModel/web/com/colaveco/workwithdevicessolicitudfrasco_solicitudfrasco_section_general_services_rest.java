package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_General")
public final  class workwithdevicessolicitudfrasco_solicitudfrasco_section_general_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("SFId") @javax.ws.rs.DefaultValue("") String sA3SFId ,
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
      if ( ! processHeaders("workwithdevicessolicitudfrasco_solicitudfrasco_section_general",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long A3SFId;
      A3SFId = GXutil.lval( sA3SFId) ;
      int AV6gxid;
      AV6gxid = (int)(GXutil.lval( sAV6gxid)) ;
      com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt data;
      try
      {
         com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_section_general worker = new com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_section_general(remoteHandle, context);
         data = worker.executeUdp(A3SFId,AV6gxid );
         builder = Response.okWrapped(new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_RESTInterface(data));
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

