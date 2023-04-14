package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/Agencias_Level_Detail_Grid1")
public final  class agencias_level_detail_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Sdtagenciaid") @javax.ws.rs.DefaultValue("") String sAV7SDTAgenciaId ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV11start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV12count ,
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
      if ( ! processHeaders("agencias_level_detail_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV7SDTAgenciaId;
      AV7SDTAgenciaId = GXutil.lval( sAV7SDTAgenciaId) ;
      long AV11start;
      AV11start = GXutil.lval( sAV11start) ;
      long AV12count;
      AV12count = GXutil.lval( sAV12count) ;
      int AV8gxid;
      AV8gxid = (int)(GXutil.lval( sAV8gxid)) ;
      GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.agencias_level_detail_grid1 worker = new com.colaveco.agencias_level_detail_grid1(remoteHandle, context);
         data = worker.executeUdp(AV7SDTAgenciaId,AV11start,AV12count,AV8gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface >>( SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface> SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item)collection.elementAt(i)));
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

