package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesResultado_Resultado_List")
public final  class workwithdevicesresultado_resultado_list_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV7ExternalId ,
                                             @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV8TipoinformeId ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV20gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesresultado_resultado_list",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV7ExternalId;
      AV7ExternalId = GXutil.lval( sAV7ExternalId) ;
      long AV8TipoinformeId;
      AV8TipoinformeId = GXutil.lval( sAV8TipoinformeId) ;
      int AV20gxid;
      AV20gxid = (int)(GXutil.lval( sAV20gxid)) ;
      com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt data;
      try
      {
         com.colaveco.workwithdevicesresultado_resultado_list worker = new com.colaveco.workwithdevicesresultado_resultado_list(remoteHandle, context);
         data = worker.executeUdp(AV7ExternalId,AV8TipoinformeId,AV20gxid );
         builder = Response.okWrapped(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt_RESTInterface(data));
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

