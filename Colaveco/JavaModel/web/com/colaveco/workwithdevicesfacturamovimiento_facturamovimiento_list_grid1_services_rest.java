package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1")
public final  class workwithdevicesfacturamovimiento_facturamovimiento_list_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV5ExternalId ,
                                             @javax.ws.rs.QueryParam("Searchtext") @javax.ws.rs.DefaultValue("") String sAV12SearchText ,
                                             @javax.ws.rs.QueryParam("Cfmfechaemision") @javax.ws.rs.DefaultValue("") String sAV7cFMFechaEmision ,
                                             @javax.ws.rs.QueryParam("Cfmfechavencimiento") @javax.ws.rs.DefaultValue("") String sAV8cFMFechaVencimiento ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV10start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV11count ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV9gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesfacturamovimiento_facturamovimiento_list_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5ExternalId;
      AV5ExternalId = GXutil.lval( sAV5ExternalId) ;
      String AV12SearchText;
      AV12SearchText = sAV12SearchText ;
      java.util.Date AV7cFMFechaEmision;
      AV7cFMFechaEmision = GXutil.charToTimeREST( sAV7cFMFechaEmision) ;
      java.util.Date AV8cFMFechaVencimiento;
      AV8cFMFechaVencimiento = GXutil.charToTimeREST( sAV8cFMFechaVencimiento) ;
      long AV10start;
      AV10start = GXutil.lval( sAV10start) ;
      long AV11count;
      AV11count = GXutil.lval( sAV11count) ;
      int AV9gxid;
      AV9gxid = (int)(GXutil.lval( sAV9gxid)) ;
      GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list_grid1 worker = new com.colaveco.workwithdevicesfacturamovimiento_facturamovimiento_list_grid1(remoteHandle, context);
         data = worker.executeUdp(AV5ExternalId,AV12SearchText,AV7cFMFechaEmision,AV8cFMFechaVencimiento,AV10start,AV11count,AV9gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface >>( SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface> SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtWorkWithDevicesFacturaMovimiento_FacturaMovimiento_List_Grid1Sdt_Item)collection.elementAt(i)));
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

