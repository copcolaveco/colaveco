package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/GAMSDRegisterUser")
public final  class gamsdregisteruser_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.gamsdregisteruser_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV18UserName;
      AV18UserName = entity.getUserName() ;
      String AV9Email;
      AV9Email = entity.getEmail() ;
      String AV11FirstName;
      AV11FirstName = entity.getFirstName() ;
      String AV12LastName;
      AV12LastName = entity.getLastName() ;
      String AV16Password;
      AV16Password = entity.getPassword() ;
      String AV8ConfirmPassword;
      AV8ConfirmPassword = entity.getConfirmPassword() ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV15Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      if ( ! processHeaders("gamsdregisteruser",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.gamsdregisteruser worker = new com.colaveco.gamsdregisteruser(remoteHandle, context);
         worker.execute(AV18UserName,AV9Email,AV11FirstName,AV12LastName,AV16Password,AV8ConfirmPassword,AV15Messages );
         com.colaveco.gamsdregisteruser_RESTInterfaceOUT data = new com.colaveco.gamsdregisteruser_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV15Messages[0]));
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

