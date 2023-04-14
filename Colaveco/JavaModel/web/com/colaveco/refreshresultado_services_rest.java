package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/RefreshResultado")
public final  class refreshresultado_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.refreshresultado_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      com.colaveco.SdtSDTResultado AV15item ;
      AV15item= (com.colaveco.SdtSDTResultado)entity.getitem().getSdt();
      short AV17TipoInforme;
      AV17TipoInforme = entity.getTipoInforme() ;
      com.colaveco.SdtSDTResultado [] AV16item2 = new com.colaveco.SdtSDTResultado[] { new com.colaveco.SdtSDTResultado() };
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
      if ( ! processHeaders("refreshresultado",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.refreshresultado worker = new com.colaveco.refreshresultado(remoteHandle, context);
         worker.execute(AV15item,AV17TipoInforme,AV16item2 );
         com.colaveco.refreshresultado_RESTInterfaceOUT data = new com.colaveco.refreshresultado_RESTInterfaceOUT();
         if ( AV16item2[0].isNull() == 0 )
         {
            data.setitem2(new com.colaveco.SdtSDTResultado_RESTInterface(AV16item2[0]));
         }
         builder = Response.okWrapped(data);
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_LOW;
   }

}

