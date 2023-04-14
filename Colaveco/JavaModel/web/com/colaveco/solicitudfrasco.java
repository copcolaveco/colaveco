package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.colaveco.solicitudfrasco", "/com.colaveco.solicitudfrasco"})
public final  class solicitudfrasco extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new solicitudfrasco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new solicitudfrasco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Solicitud Frasco";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return true;
   }

   protected int IntegratedSecurityLevel( )
   {
      return SECURITY_LOW;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

