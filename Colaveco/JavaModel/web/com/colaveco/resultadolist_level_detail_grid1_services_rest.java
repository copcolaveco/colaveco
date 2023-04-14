package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/ResultadoList_Level_Detail_Grid1")
public final  class resultadolist_level_detail_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Externalid") @javax.ws.rs.DefaultValue("") String sAV6ExternalId ,
                                             @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV8TipoinformeId ,
                                             @javax.ws.rs.QueryParam("start") @javax.ws.rs.DefaultValue("0") String sAV19start ,
                                             @javax.ws.rs.QueryParam("count") @javax.ws.rs.DefaultValue("0") String sAV20count ,
                                             @javax.ws.rs.QueryParam("gxid") @javax.ws.rs.DefaultValue("") String sAV16gxid ) throws Exception
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
      if ( ! processHeaders("resultadolist_level_detail_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV6ExternalId;
      AV6ExternalId = GXutil.lval( sAV6ExternalId) ;
      long AV8TipoinformeId;
      AV8TipoinformeId = GXutil.lval( sAV8TipoinformeId) ;
      long AV19start;
      AV19start = GXutil.lval( sAV19start) ;
      long AV20count;
      AV20count = GXutil.lval( sAV20count) ;
      int AV16gxid;
      AV16gxid = (int)(GXutil.lval( sAV16gxid)) ;
      GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.resultadolist_level_detail_grid1 worker = new com.colaveco.resultadolist_level_detail_grid1(remoteHandle, context);
         data = worker.executeUdp(AV6ExternalId,AV8TipoinformeId,AV19start,AV20count,AV16gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface >>( SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface> SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item)collection.elementAt(i)));
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

