package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/TipoinformeFiltro_Level_Detail")
public final  class tipoinformefiltro_level_detail_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV5TipoInformeId ,
                                             @javax.ws.rs.QueryParam("Tipoinformebutton") @javax.ws.rs.DefaultValue("") String sAV7TipoinformeButton ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV8gxid ) throws Exception
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
      if ( ! processHeaders("tipoinformefiltro_level_detail",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5TipoInformeId;
      AV5TipoInformeId = GXutil.lval( sAV5TipoInformeId) ;
      String AV7TipoinformeButton;
      AV7TipoinformeButton = sAV7TipoinformeButton ;
      int AV8gxid;
      AV8gxid = (int)(GXutil.lval( sAV8gxid)) ;
      com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt data;
      try
      {
         com.colaveco.tipoinformefiltro_level_detail worker = new com.colaveco.tipoinformefiltro_level_detail(remoteHandle, context);
         data = worker.executeUdp(AV5TipoInformeId,AV7TipoinformeButton,AV8gxid );
         builder = Response.okWrapped(new com.colaveco.SdtTipoinformeFiltro_Level_DetailSdt_RESTInterface(data));
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

