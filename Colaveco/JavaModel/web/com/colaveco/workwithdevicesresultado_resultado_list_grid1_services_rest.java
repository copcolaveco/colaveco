package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/WorkWithDevicesResultado_Resultado_List_Grid1")
public final  class workwithdevicesresultado_resultado_list_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV7ExternalId ,
                                             @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV8TipoinformeId ,
                                             @javax.ws.rs.QueryParam("Searchtext") @javax.ws.rs.DefaultValue("") String sAV25SearchText ,
                                             @javax.ws.rs.QueryParam("Cresultadofechacreadofrom") @javax.ws.rs.DefaultValue("") String sAV16cresultadoFechaCreadoFrom ,
                                             @javax.ws.rs.QueryParam("Cresultadofechacreadoto") @javax.ws.rs.DefaultValue("") String sAV17cresultadoFechaCreadoTo ,
                                             @javax.ws.rs.QueryParam("Cresultadofechaemisionfrom") @javax.ws.rs.DefaultValue("") String sAV18cresultadoFechaEmisionFrom ,
                                             @javax.ws.rs.QueryParam("Cresultadofechaemisionto") @javax.ws.rs.DefaultValue("") String sAV19cresultadoFechaEmisionTo ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV23start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV24count ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV20gxid ) throws Exception
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
      if ( ! processHeaders("workwithdevicesresultado_resultado_list_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV7ExternalId;
      AV7ExternalId = GXutil.lval( sAV7ExternalId) ;
      long AV8TipoinformeId;
      AV8TipoinformeId = GXutil.lval( sAV8TipoinformeId) ;
      String AV25SearchText;
      AV25SearchText = sAV25SearchText ;
      java.util.Date AV16cresultadoFechaCreadoFrom;
      AV16cresultadoFechaCreadoFrom = GXutil.charToDateREST( sAV16cresultadoFechaCreadoFrom) ;
      java.util.Date AV17cresultadoFechaCreadoTo;
      AV17cresultadoFechaCreadoTo = GXutil.charToDateREST( sAV17cresultadoFechaCreadoTo) ;
      java.util.Date AV18cresultadoFechaEmisionFrom;
      AV18cresultadoFechaEmisionFrom = GXutil.charToDateREST( sAV18cresultadoFechaEmisionFrom) ;
      java.util.Date AV19cresultadoFechaEmisionTo;
      AV19cresultadoFechaEmisionTo = GXutil.charToDateREST( sAV19cresultadoFechaEmisionTo) ;
      long AV23start;
      AV23start = GXutil.lval( sAV23start) ;
      long AV24count;
      AV24count = GXutil.lval( sAV24count) ;
      int AV20gxid;
      AV20gxid = (int)(GXutil.lval( sAV20gxid)) ;
      GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.workwithdevicesresultado_resultado_list_grid1 worker = new com.colaveco.workwithdevicesresultado_resultado_list_grid1(remoteHandle, context);
         data = worker.executeUdp(AV7ExternalId,AV8TipoinformeId,AV25SearchText,AV16cresultadoFechaCreadoFrom,AV17cresultadoFechaCreadoTo,AV18cresultadoFechaEmisionFrom,AV19cresultadoFechaEmisionTo,AV23start,AV24count,AV20gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface >>( SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface> SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)collection.elementAt(i)));
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

