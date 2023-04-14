package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/DirectionsServiceRequest")
public final  class directionsservicerequest_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.directionsservicerequest_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV9DirectionsServiceProvider;
      AV9DirectionsServiceProvider = entity.getDirectionsServiceProvider() ;
      com.genexuscore.genexus.common.SdtDirectionsRequestParameters AV8DirectionsRequestParameters ;
      AV8DirectionsRequestParameters= (com.genexuscore.genexus.common.SdtDirectionsRequestParameters)entity.getDirectionsRequestParameters().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexuscore.genexus.common.SdtRoute> [] AV12Routes = new GXBaseCollection[] { new GXBaseCollection<com.genexuscore.genexus.common.SdtRoute>() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV11errorMessages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
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
      if ( ! processHeaders("directionsservicerequest",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.directionsservicerequest worker = new com.colaveco.directionsservicerequest(remoteHandle, context);
         worker.execute(AV9DirectionsServiceProvider,AV8DirectionsRequestParameters,AV12Routes,AV11errorMessages );
         com.colaveco.directionsservicerequest_RESTInterfaceOUT data = new com.colaveco.directionsservicerequest_RESTInterfaceOUT();
         data.setRoutes(SdtRoute_RESTInterfacefromGXObjectCollection(AV12Routes[0]));
         data.seterrorMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV11errorMessages[0]));
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

   private Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface> SdtRoute_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexuscore.genexus.common.SdtRoute> collection )
   {
      Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface> result = new Vector<com.genexuscore.genexus.common.SdtRoute_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.genexuscore.genexus.common.SdtRoute_RESTInterface((com.genexuscore.genexus.common.SdtRoute)collection.elementAt(i)));
      }
      return result ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.genexus.SdtMessages_Message_RESTInterface((com.genexus.SdtMessages_Message)collection.elementAt(i)));
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

