package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1")
public final  class workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Searchtext") @javax.ws.rs.DefaultValue("") String sAV8SearchText ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV6start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV7count ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV5gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      String AV8SearchText;
      AV8SearchText = sAV8SearchText ;
      long AV6start;
      AV6start = GXutil.lval( sAV6start) ;
      long AV7count;
      AV7count = GXutil.lval( sAV7count) ;
      int AV5gxid;
      AV5gxid = (int)(GXutil.lval( sAV5gxid)) ;
      GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1 worker = new com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1(remoteHandle, context);
         data = worker.executeUdp(AV8SearchText,AV6start,AV7count,AV5gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface >>( SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface> SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item)collection.elementAt(i)));
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

