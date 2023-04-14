package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesNotificaciones_Notificaciones_List_Grid1")
public final  class workwithdevicesnotificaciones_notificaciones_list_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV5ExternalId ,
                                             @javax.ws.rs.QueryParam("Searchtext") @javax.ws.rs.DefaultValue("") String sAV12SearchText ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV10start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV11count ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV7gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesnotificaciones_notificaciones_list_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5ExternalId;
      AV5ExternalId = GXutil.lval( sAV5ExternalId) ;
      String AV12SearchText;
      AV12SearchText = sAV12SearchText ;
      long AV10start;
      AV10start = GXutil.lval( sAV10start) ;
      long AV11count;
      AV11count = GXutil.lval( sAV11count) ;
      int AV7gxid;
      AV7gxid = (int)(GXutil.lval( sAV7gxid)) ;
      GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.workwithdevicesnotificaciones_notificaciones_list_grid1 worker = new com.colaveco.workwithdevicesnotificaciones_notificaciones_list_grid1(remoteHandle, context);
         data = worker.executeUdp(AV5ExternalId,AV12SearchText,AV10start,AV11count,AV7gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface >>( SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface> SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)collection.elementAt(i)));
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

