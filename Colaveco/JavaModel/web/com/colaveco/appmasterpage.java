package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.colaveco.appmasterpage", "/com.colaveco.appmasterpage"})
public final  class appmasterpage extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new appmasterpage_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new appmasterpage_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Application Master Page ";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
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

