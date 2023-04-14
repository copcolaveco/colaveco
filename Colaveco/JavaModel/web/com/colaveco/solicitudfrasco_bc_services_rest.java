package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/SolicitudFrasco")
public final  class solicitudfrasco_bc_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetBy( @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sstartRow ,
                                           @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String smaxRows ,
                                           @javax.ws.rs.QueryParam("SFIdNet") String sA32SFIdNet )
   {
      Response.ResponseBuilder builder = null;
      builder = Response.notFound();
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.GET
   @javax.ws.rs.Path("{sA3SFId}")
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Load( @javax.ws.rs.PathParam("sA3SFId") String sA3SFId )
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
      long A3SFId;
      A3SFId = GXutil.lval( sA3SFId) ;
      com.colaveco.SdtSolicitudFrasco worker = new com.colaveco.SdtSolicitudFrasco(remoteHandle, context);
      if ( GXutil.strcmp(sA3SFId, "_default") == 0 )
      {
         IGxSilentTrn workertrn = worker.getTransaction();
         workertrn.getInsDefault();
      }
      else
      {
         worker.Load(A3SFId);
      }
      if ( worker.Success() )
      {
         builder = Response.okWrapped(new com.colaveco.SdtSolicitudFrasco_RESTInterface(worker));
      }
      else
      {
         ErrorCheck(worker.getTransaction());
         if ( error )
         {
            builder = Response.notFound();
         }
         if ( errorJson != null )
         {
            builder.type("application/json");
            builder.entity(errorJson.toString());
         }
      }
      cleanup();
      addWarningHeaders(builder, worker.getTransaction().GetMessages(), myUriInfoWrapper.getAbsolutePath().getHost());
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.DELETE
   @javax.ws.rs.Path("{sA3SFId}")
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Delete( @javax.ws.rs.PathParam("sA3SFId") String sA3SFId )
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
      long A3SFId;
      A3SFId = GXutil.lval( sA3SFId) ;
      com.colaveco.SdtSolicitudFrasco worker = new com.colaveco.SdtSolicitudFrasco(remoteHandle, context);
      worker.Load(A3SFId);
      worker.Delete();
      if ( worker.Success() )
      {
         Application.commitDataStores(context, remoteHandle, null, "solicitudfrasco_bc");
         builder = Response.noContentWrapped();
      }
      else
      {
         ErrorCheck(worker.getTransaction());
         if ( error )
         {
            builder = Response.notFound();
         }
         if ( errorJson != null )
         {
            builder.type("application/json");
            builder.entity(errorJson.toString());
         }
      }
      cleanup();
      addWarningHeaders(builder, worker.getTransaction().GetMessages(), myUriInfoWrapper.getAbsolutePath().getHost());
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.POST
   @javax.ws.rs.Path("{sA3SFId}")
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Insert( @javax.ws.rs.PathParam("sA3SFId") String sA3SFId ,
                                            @javax.ws.rs.QueryParam("check") @javax.ws.rs.DefaultValue("false") boolean gxcheck ,
                                            @javax.ws.rs.QueryParam("insertorupdate") @javax.ws.rs.DefaultValue("false") boolean gxinsertorupdate ,
                                            com.colaveco.SdtSolicitudFrasco_RESTInterface entity ) throws Exception
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
         long A3SFId;
         A3SFId = GXutil.lval( sA3SFId) ;
         com.colaveco.SdtSolicitudFrasco worker = new com.colaveco.SdtSolicitudFrasco(remoteHandle, context);
         com.colaveco.SdtSolicitudFrasco_RESTInterface worker_interface = new com.colaveco.SdtSolicitudFrasco_RESTInterface (worker);
         worker_interface.copyFrom(entity);
         worker.setgxTv_SdtSolicitudFrasco_Sfid( A3SFId );
         if ( gxcheck )
         {
            worker.Check();
         }
         else
         {
            if ( gxinsertorupdate )
            {
               worker.InsertOrUpdate();
            }
            else
            {
               worker.Save();
            }
         }
         if ( worker.Success() )
         {
            if ( ! gxcheck )
            {
               Application.commitDataStores(context, remoteHandle, null, "solicitudfrasco_bc");
            }
            if ( ! gxcheck )
            {
               builder = Response.createdWrapped(new java.net.URI(myUriInfoWrapper.getRequestUri().toString()));
               builder.entity(worker_interface);
            }
            else
            {
               builder = Response.okWrapped(worker_interface);
            }
         }
         else
         {
            ErrorCheck(worker.getTransaction());
            if ( error )
            {
               builder = Response.notFound();
            }
            if ( errorJson != null )
            {
               builder.type("application/json");
               builder.entity(errorJson.toString());
            }
         }
         cleanup();
         addWarningHeaders(builder, worker.getTransaction().GetMessages(), myUriInfoWrapper.getAbsolutePath().getHost());
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.PUT
   @javax.ws.rs.Path("{sA3SFId}")
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Update( @javax.ws.rs.PathParam("sA3SFId") String sA3SFId ,
                                            @javax.ws.rs.QueryParam("check") @javax.ws.rs.DefaultValue("false") boolean gxcheck ,
                                            com.colaveco.SdtSolicitudFrasco_RESTInterface entity )
   {
      super.init( "PUT" );
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
      long A3SFId;
      A3SFId = GXutil.lval( sA3SFId) ;
      com.colaveco.SdtSolicitudFrasco worker = new com.colaveco.SdtSolicitudFrasco(remoteHandle, context);
      com.colaveco.SdtSolicitudFrasco_RESTInterface worker_interface = new com.colaveco.SdtSolicitudFrasco_RESTInterface (worker);
      worker.setgxTv_SdtSolicitudFrasco_Sfid( A3SFId );
      worker.Load(A3SFId);
      if (entity.getHash().equals(worker_interface.getHash())) {
         worker_interface.copyFrom(entity);
         if ( gxcheck )
         {
            worker.Check();
         }
         else
         {
            worker.Save();
         }
         if ( worker.Success() )
         {
            if ( ! gxcheck )
            {
               Application.commitDataStores(context, remoteHandle, null, "solicitudfrasco_bc");
            }
            worker_interface.setHash(null);
            builder = Response.okWrapped(worker_interface);
         }
         else
         {
            ErrorCheck(worker.getTransaction());
            if ( error )
            {
               builder = Response.notFound();
            }
            if ( errorJson != null )
            {
               builder.type("application/json");
               builder.entity(errorJson.toString());
            }
         }
      }
      else
      {
         SetError("409",  localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SolicitudFrasco"}) );
         builder = Response.conflict();
         builder.type("application/json");
         builder.entity(errorJson.toString());
      }
      cleanup();
      addWarningHeaders(builder, worker.getTransaction().GetMessages(), myUriInfoWrapper.getAbsolutePath().getHost());
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.colaveco.SdtSolicitudFrasco_RESTLInterface> SdtSolicitudFrasco_RESTLInterfacefromGXObjectCollection( GXBCCollection<com.colaveco.SdtSolicitudFrasco> collection )
   {
      Vector<com.colaveco.SdtSolicitudFrasco_RESTLInterface> result = new Vector<com.colaveco.SdtSolicitudFrasco_RESTLInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtSolicitudFrasco_RESTLInterface((com.colaveco.SdtSolicitudFrasco)collection.elementAt(i)));
      }
      return result ;
   }

   private void addWarningHeaders( com.genexus.ws.rs.core.IResponseBuilder builder ,
                                   com.genexus.internet.MsgList collection ,
                                   String host )
   {
      for (int i = 1; i < collection.size() +1; i++)
      {
         String message = collection.getItemText(i);
         short messagetype = collection.getItemType(i);
         if (messagetype == 0)
         {
            String encodedFlag = "";
            if (PrivateUtilities.containsNoAsciiCharacter(message))
            {
               message = PrivateUtilities.encodeURL(message);
               encodedFlag = "Encoded:";
            }
            if (collection.getItemGXMessage(i))
            {
               message = "System:" + message;
            }
            else
            {
               message = "User:" + message;
            }
            builder.header("Warning" , "299 " + host + " \"" + encodedFlag + message + "\"");
         }
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

