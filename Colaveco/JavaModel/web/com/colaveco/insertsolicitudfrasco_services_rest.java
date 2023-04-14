package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/InsertSolicitudFrasco")
public final  class insertsolicitudfrasco_services_rest extends GxRestService
{
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( com.colaveco.insertsolicitudfrasco_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      long AV8SDTAgenciaId;
      AV8SDTAgenciaId = GXutil.lval( entity.getSDTAgenciaId()) ;
      short AV11SFFrascosAgua;
      AV11SFFrascosAgua = entity.getSFFrascosAgua() ;
      short AV9SFFrascosConC;
      AV9SFFrascosConC = entity.getSFFrascosConC() ;
      short AV14SFFrascosIsopo;
      AV14SFFrascosIsopo = entity.getSFFrascosIsopo() ;
      short AV12SFFrascosSangre;
      AV12SFFrascosSangre = entity.getSFFrascosSangre() ;
      short AV10SFFrascosSinC;
      AV10SFFrascosSinC = entity.getSFFrascosSinC() ;
      String AV13SFObservaciones;
      AV13SFObservaciones = entity.getSFObservaciones() ;
      String AV19UsuarioDireccion;
      AV19UsuarioDireccion = entity.getUsuarioDireccion() ;
      String AV18UsuarioEmail;
      AV18UsuarioEmail = entity.getUsuarioEmail() ;
      long AV15UsuarioIdNet;
      AV15UsuarioIdNet = GXutil.lval( entity.getUsuarioIdNet()) ;
      String AV16UsuarioNombre;
      AV16UsuarioNombre = entity.getUsuarioNombre() ;
      String AV17UsuarioTecnicoTelefono1;
      AV17UsuarioTecnicoTelefono1 = entity.getUsuarioTecnicoTelefono1() ;
      boolean [] AV22result = new boolean[] { false };
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
      if ( ! processHeaders("insertsolicitudfrasco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         com.colaveco.insertsolicitudfrasco worker = new com.colaveco.insertsolicitudfrasco(remoteHandle, context);
         worker.execute(AV8SDTAgenciaId,AV11SFFrascosAgua,AV9SFFrascosConC,AV14SFFrascosIsopo,AV12SFFrascosSangre,AV10SFFrascosSinC,AV13SFObservaciones,AV19UsuarioDireccion,AV18UsuarioEmail,AV15UsuarioIdNet,AV16UsuarioNombre,AV17UsuarioTecnicoTelefono1,AV22result );
         com.colaveco.insertsolicitudfrasco_RESTInterfaceOUT data = new com.colaveco.insertsolicitudfrasco_RESTInterfaceOUT();
         data.setresult(AV22result[0]);
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_LOW;
   }

}

