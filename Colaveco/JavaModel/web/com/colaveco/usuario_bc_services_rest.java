package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/Usuario")
public final  class usuario_bc_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetBy( @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sstartRow ,
                                           @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String smaxRows ,
                                           @javax.ws.rs.QueryParam("UsuarioEmail") String sA114UsuarioEmail )
   {
      Response.ResponseBuilder builder = null;
      builder = Response.notFound();
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.GET
   @javax.ws.rs.Path("{sA5UsuarioId}")
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Load( @javax.ws.rs.PathParam("sA5UsuarioId") String sA5UsuarioId )
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
      long A5UsuarioId;
      A5UsuarioId = GXutil.lval( sA5UsuarioId) ;
      com.colaveco.SdtUsuario worker = new com.colaveco.SdtUsuario(remoteHandle, context);
      if ( GXutil.strcmp(sA5UsuarioId, "_default") == 0 )
      {
         IGxSilentTrn workertrn = worker.getTransaction();
         workertrn.getInsDefault();
      }
      else
      {
         worker.Load(A5UsuarioId);
      }
      if ( worker.Success() )
      {
         builder = Response.okWrapped(new com.colaveco.SdtUsuario_RESTInterface(worker));
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
   @javax.ws.rs.Path("{sA5UsuarioId}")
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Delete( @javax.ws.rs.PathParam("sA5UsuarioId") String sA5UsuarioId )
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
      long A5UsuarioId;
      A5UsuarioId = GXutil.lval( sA5UsuarioId) ;
      com.colaveco.SdtUsuario worker = new com.colaveco.SdtUsuario(remoteHandle, context);
      worker.Load(A5UsuarioId);
      worker.Delete();
      if ( worker.Success() )
      {
         Application.commitDataStores(context, remoteHandle, null, "usuario_bc");
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
   @javax.ws.rs.Path("{sA5UsuarioId}")
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Insert( @javax.ws.rs.PathParam("sA5UsuarioId") String sA5UsuarioId ,
                                            @javax.ws.rs.QueryParam("check") @javax.ws.rs.DefaultValue("false") boolean gxcheck ,
                                            @javax.ws.rs.QueryParam("insertorupdate") @javax.ws.rs.DefaultValue("false") boolean gxinsertorupdate ,
                                            com.colaveco.SdtUsuario_RESTInterface entity ) throws Exception
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
         long A5UsuarioId;
         A5UsuarioId = GXutil.lval( sA5UsuarioId) ;
         com.colaveco.SdtUsuario worker = new com.colaveco.SdtUsuario(remoteHandle, context);
         com.colaveco.SdtUsuario_RESTInterface worker_interface = new com.colaveco.SdtUsuario_RESTInterface (worker);
         worker_interface.copyFrom(entity);
         worker.setgxTv_SdtUsuario_Usuarioid( A5UsuarioId );
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
               Application.commitDataStores(context, remoteHandle, null, "usuario_bc");
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
   @javax.ws.rs.Path("{sA5UsuarioId}")
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response Update( @javax.ws.rs.PathParam("sA5UsuarioId") String sA5UsuarioId ,
                                            @javax.ws.rs.QueryParam("check") @javax.ws.rs.DefaultValue("false") boolean gxcheck ,
                                            com.colaveco.SdtUsuario_RESTInterface entity )
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
      long A5UsuarioId;
      A5UsuarioId = GXutil.lval( sA5UsuarioId) ;
      com.colaveco.SdtUsuario worker = new com.colaveco.SdtUsuario(remoteHandle, context);
      com.colaveco.SdtUsuario_RESTInterface worker_interface = new com.colaveco.SdtUsuario_RESTInterface (worker);
      worker.setgxTv_SdtUsuario_Usuarioid( A5UsuarioId );
      worker.Load(A5UsuarioId);
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
               Application.commitDataStores(context, remoteHandle, null, "usuario_bc");
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
         SetError("409",  localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Usuario"}) );
         builder = Response.conflict();
         builder.type("application/json");
         builder.entity(errorJson.toString());
      }
      cleanup();
      addWarningHeaders(builder, worker.getTransaction().GetMessages(), myUriInfoWrapper.getAbsolutePath().getHost());
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.colaveco.SdtUsuario_RESTLInterface> SdtUsuario_RESTLInterfacefromGXObjectCollection( GXBCCollection<com.colaveco.SdtUsuario> collection )
   {
      Vector<com.colaveco.SdtUsuario_RESTLInterface> result = new Vector<com.colaveco.SdtUsuario_RESTLInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtUsuario_RESTLInterface((com.colaveco.SdtUsuario)collection.elementAt(i)));
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

