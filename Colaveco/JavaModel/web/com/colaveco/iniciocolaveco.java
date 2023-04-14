package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.colaveco.iniciocolaveco", "/com.colaveco.iniciocolaveco"})
public final  class iniciocolaveco extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new iniciocolaveco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new iniciocolaveco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inicio Colaveco";
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

