package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/GAMSDUpdateRegisterUser")
public final  class gamsdupdateregisteruser_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.gamsdupdateregisteruser_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV19UserGUID;
      AV19UserGUID = entity.getUserGUID() ;
      String AV18UserName;
      AV18UserName = entity.getUserName() ;
      String AV10Email;
      AV10Email = entity.getEmail() ;
      String AV12FirstName;
      AV12FirstName = entity.getFirstName() ;
      String AV14LastName;
      AV14LastName = entity.getLastName() ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      if ( ! processHeaders("gamsdupdateregisteruser",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.gamsdupdateregisteruser worker = new com.colaveco.gamsdupdateregisteruser(remoteHandle, context);
         worker.execute(AV19UserGUID,AV18UserName,AV10Email,AV12FirstName,AV14LastName,AV8Messages );
         com.colaveco.gamsdupdateregisteruser_RESTInterfaceOUT data = new com.colaveco.gamsdupdateregisteruser_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV8Messages[0]));
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
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

