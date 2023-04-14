package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/DPResultadoByFilter")
public final  class dpresultadobyfilter_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV5ExternalId ,
                                             @javax.ws.rs.QueryParam("Resultadoidnettipoinforme") @javax.ws.rs.DefaultValue("") String sAV6resultadoIdNetTipoinforme ) throws Exception
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
      if ( ! processHeaders("dpresultadobyfilter",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5ExternalId;
      AV5ExternalId = GXutil.lval( sAV5ExternalId) ;
      long AV6resultadoIdNetTipoinforme;
      AV6resultadoIdNetTipoinforme = GXutil.lval( sAV6resultadoIdNetTipoinforme) ;
      GXBaseCollection<com.colaveco.SdtSDTResultado> data;
      try
      {
         com.colaveco.dpresultadobyfilter worker = new com.colaveco.dpresultadobyfilter(remoteHandle, context);
         data = worker.executeUdp(AV5ExternalId,AV6resultadoIdNetTipoinforme );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtSDTResultado_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtSDTResultado_RESTInterface >>( SdtSDTResultado_RESTInterfacefromGXObjectCollection (data)) {};
            builder = Response.okWrapped(ge);
         }
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.POST
   @javax.ws.rs.Path("gxobject")
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Upload( ) throws Exception
   {
      super.init( "POST" );
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
      try
      {
         builder = new com.genexus.webpanels.GXObjectUploadServices().doInternalRestExecute(restHttpContext);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   private Vector<com.colaveco.SdtSDTResultado_RESTInterface> SdtSDTResultado_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtSDTResultado> collection )
   {
      Vector<com.colaveco.SdtSDTResultado_RESTInterface> result = new Vector<com.colaveco.SdtSDTResultado_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtSDTResultado_RESTInterface((com.colaveco.SdtSDTResultado)collection.elementAt(i)));
      }
      return result ;
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

