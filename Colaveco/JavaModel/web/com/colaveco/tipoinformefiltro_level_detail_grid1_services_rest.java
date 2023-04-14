package com.colaveco ;
import com.colaveco.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/TipoinformeFiltro_Level_Detail_Grid1")
public final  class tipoinformefiltro_level_detail_grid1_services_rest extends GxRestService
{
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response execute( @javax.ws.rs.QueryParam("Tipoinformeid") @javax.ws.rs.DefaultValue("") String sAV5TipoInformeId ,
                                             @javax.ws.rs.QueryParam("Tipoinformebutton") @javax.ws.rs.DefaultValue("") String sAV7TipoinformeButton ,
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
      if ( ! processHeaders("tipoinformefiltro_level_detail_grid1",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      long AV5TipoInformeId;
      AV5TipoInformeId = GXutil.lval( sAV5TipoInformeId) ;
      String AV7TipoinformeButton;
      AV7TipoinformeButton = sAV7TipoinformeButton ;
      long AV11start;
      AV11start = GXutil.lval( sAV11start) ;
      long AV12count;
      AV12count = GXutil.lval( sAV12count) ;
      int AV8gxid;
      AV8gxid = (int)(GXutil.lval( sAV8gxid)) ;
      GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> data;
      try
      {
         com.colaveco.tipoinformefiltro_level_detail_grid1 worker = new com.colaveco.tipoinformefiltro_level_detail_grid1(remoteHandle, context);
         data = worker.executeUdp(AV5TipoInformeId,AV7TipoinformeButton,AV11start,AV12count,AV8gxid );
         if ( data.size() == 0 )
         {
            builder = Response.okWrapped("[]");
         }
         else
         {
            GenericEntity<Vector< com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface >> ge = new GenericEntity<Vector< com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface >>( SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection (data)) {};
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

   private Vector<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface> SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item> collection )
   {
      Vector<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface> result = new Vector<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface((com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)collection.elementAt(i)));
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

