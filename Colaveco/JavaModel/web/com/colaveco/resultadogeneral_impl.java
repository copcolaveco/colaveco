package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class resultadogeneral_impl extends GXWebComponent
{
   public resultadogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public resultadogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resultadogeneral_impl.class ));
   }

   public resultadogeneral_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "resultadoId") ;
            gxfirstwebparm_bkp = gxfirstwebparm ;
            gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
            toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
            {
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               dyncall( httpContext.GetNextPar( )) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               A1resultadoId = GXutil.lval( httpContext.GetPar( "resultadoId")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,Long.valueOf(A1resultadoId)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "resultadoId") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "resultadoId") ;
            }
            else
            {
               if ( ! httpContext.IsValidAjaxCall( false) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = gxfirstwebparm_bkp ;
            }
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1C2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.colaveco.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "Resultado General") ;
         httpContext.writeTextNL( "</title>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614562855", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.resultadogeneral", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A1resultadoId,18,0))}, new String[] {"resultadoId"}) +"\">") ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         com.colaveco.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA1resultadoId", GXutil.ltrim( localUtil.ntoc( wcpOA1resultadoId, (byte)(18), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1C2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         httpContext.writeTextNL( "</form>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "ResultadoGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "Resultado General" ;
   }

   public void wb1C0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.colaveco.resultadogeneral");
         }
         com.colaveco.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewActionsCell", "Center", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group WWViewActions", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Update", bttBtnupdate_Jsonclick, 7, "Update", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111c1_client"+"'", TempTags, "", 2, "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Delete", bttBtndelete_Jsonclick, 7, "Delete", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121c1_client"+"'", TempTags, "", 2, "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAttributestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoId_Internalname, GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFicha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFicha_Internalname, "Ficha", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFicha_Internalname, GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoFicha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFicha_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoFicha_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoComentarios_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoComentarios_Internalname, "Comentarios", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoComentarios_Internalname, A8resultadoComentarios, GXutil.rtrim( localUtil.format( A8resultadoComentarios, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoComentarios_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoComentarios_Enabled, 0, "text", "", 45, "chr", 1, "row", 45, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoUserId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoUserId_Internalname, "User Id", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoUserId_Internalname, GXutil.ltrim( localUtil.ntoc( A9resultadoUserId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoUserId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9resultadoUserId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9resultadoUserId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoUserId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoUserId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoTypeId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoTypeId_Internalname, "Type Id", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoTypeId_Internalname, GXutil.ltrim( localUtil.ntoc( A10resultadoTypeId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoTypeId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10resultadoTypeId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10resultadoTypeId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoTypeId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoTypeId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdNetUsuario_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdNetUsuario_Internalname, "Net Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdNetUsuario_Internalname, GXutil.ltrim( localUtil.ntoc( A11resultadoIdNetUsuario, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdNetUsuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdNetUsuario_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoIdNetUsuario_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFechaCreado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFechaCreado_Internalname, "Fecha Creado", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtresultadoFechaCreado_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFechaCreado_Internalname, localUtil.format(A12resultadoFechaCreado, "99/99/99"), localUtil.format( A12resultadoFechaCreado, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFechaCreado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoFechaCreado_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_bitmap( httpContext, edtresultadoFechaCreado_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtresultadoFechaCreado_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ResultadoGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFechaEmision_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFechaEmision_Internalname, "Fecha Emision", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtresultadoFechaEmision_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFechaEmision_Internalname, localUtil.format(A13resultadoFechaEmision, "99/99/99"), localUtil.format( A13resultadoFechaEmision, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFechaEmision_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoFechaEmision_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_bitmap( httpContext, edtresultadoFechaEmision_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtresultadoFechaEmision_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ResultadoGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathExcel_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathExcel_Internalname, "Path Excel", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathExcel_Internalname, A14resultadoPathExcel, "", "", (short)(0), 1, edtresultadoPathExcel_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathPdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathPdf_Internalname, "Path Pdf", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathPdf_Internalname, A15resultadoPathPdf, "", "", (short)(0), 1, edtresultadoPathPdf_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathCsv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathCsv_Internalname, "Path Csv", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathCsv_Internalname, A16resultadoPathCsv, "", "", (short)(0), 1, edtresultadoPathCsv_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdEstado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdEstado_Internalname, "Id Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A17resultadoIdEstado, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A17resultadoIdEstado), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A17resultadoIdEstado), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdEstado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoIdEstado_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdLibro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdLibro_Internalname, "Id Libro", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdLibro_Internalname, GXutil.ltrim( localUtil.ntoc( A18resultadoIdLibro, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdLibro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A18resultadoIdLibro), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A18resultadoIdLibro), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdLibro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoIdLibro_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdNetTipoinforme_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdNetTipoinforme_Internalname, "Net Tipoinforme", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdNetTipoinforme_Internalname, GXutil.ltrim( localUtil.ntoc( A166resultadoIdNetTipoinforme, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdNetTipoinforme_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdNetTipoinforme_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoIdNetTipoinforme_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoEliminado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoEliminado_Internalname, "Eliminado", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoEliminado_Internalname, GXutil.ltrim( localUtil.ntoc( A19resultadoEliminado, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoEliminado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A19resultadoEliminado), "9") : localUtil.format( DecimalUtil.doubleToDec(A19resultadoEliminado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoEliminado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoEliminado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoAbonado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoAbonado_Internalname, "Abonado", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoAbonado_Internalname, GXutil.ltrim( localUtil.ntoc( A20resultadoAbonado, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoAbonado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A20resultadoAbonado), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A20resultadoAbonado), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoAbonado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtresultadoAbonado_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ResultadoGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_7-156546", (short)(0)) ;
            }
            Form.getMeta().addItem("description", "Resultado General", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup1C0( ) ;
         }
      }
   }

   public void ws1C2( )
   {
      start1C2( ) ;
      evt1C2( ) ;
   }

   public void evt1C2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1C2( )
   {
      if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1C2( ) ;
         }
      }
   }

   public void pa1C2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "ResultadoGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf1C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H001C2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A1resultadoId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A20resultadoAbonado = H001C2_A20resultadoAbonado[0] ;
            n20resultadoAbonado = H001C2_n20resultadoAbonado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
            A19resultadoEliminado = H001C2_A19resultadoEliminado[0] ;
            n19resultadoEliminado = H001C2_n19resultadoEliminado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
            A166resultadoIdNetTipoinforme = H001C2_A166resultadoIdNetTipoinforme[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
            A18resultadoIdLibro = H001C2_A18resultadoIdLibro[0] ;
            n18resultadoIdLibro = H001C2_n18resultadoIdLibro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
            A17resultadoIdEstado = H001C2_A17resultadoIdEstado[0] ;
            n17resultadoIdEstado = H001C2_n17resultadoIdEstado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
            A16resultadoPathCsv = H001C2_A16resultadoPathCsv[0] ;
            n16resultadoPathCsv = H001C2_n16resultadoPathCsv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16resultadoPathCsv", A16resultadoPathCsv);
            A15resultadoPathPdf = H001C2_A15resultadoPathPdf[0] ;
            n15resultadoPathPdf = H001C2_n15resultadoPathPdf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A15resultadoPathPdf", A15resultadoPathPdf);
            A14resultadoPathExcel = H001C2_A14resultadoPathExcel[0] ;
            n14resultadoPathExcel = H001C2_n14resultadoPathExcel[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14resultadoPathExcel", A14resultadoPathExcel);
            A13resultadoFechaEmision = H001C2_A13resultadoFechaEmision[0] ;
            n13resultadoFechaEmision = H001C2_n13resultadoFechaEmision[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
            A12resultadoFechaCreado = H001C2_A12resultadoFechaCreado[0] ;
            n12resultadoFechaCreado = H001C2_n12resultadoFechaCreado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
            A11resultadoIdNetUsuario = H001C2_A11resultadoIdNetUsuario[0] ;
            n11resultadoIdNetUsuario = H001C2_n11resultadoIdNetUsuario[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
            A10resultadoTypeId = H001C2_A10resultadoTypeId[0] ;
            n10resultadoTypeId = H001C2_n10resultadoTypeId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
            A9resultadoUserId = H001C2_A9resultadoUserId[0] ;
            n9resultadoUserId = H001C2_n9resultadoUserId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
            A8resultadoComentarios = H001C2_A8resultadoComentarios[0] ;
            n8resultadoComentarios = H001C2_n8resultadoComentarios[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8resultadoComentarios", A8resultadoComentarios);
            A7resultadoFicha = H001C2_A7resultadoFicha[0] ;
            n7resultadoFicha = H001C2_n7resultadoFicha[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
            /* Execute user event: Load */
            e141C2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1C0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1C2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "ResultadoGeneral" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA1resultadoId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1resultadoId"), ".", ",") ;
         /* Read variables values. */
         A7resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") ;
         n7resultadoFicha = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
         A8resultadoComentarios = httpContext.cgiGet( edtresultadoComentarios_Internalname) ;
         n8resultadoComentarios = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8resultadoComentarios", A8resultadoComentarios);
         A9resultadoUserId = localUtil.ctol( httpContext.cgiGet( edtresultadoUserId_Internalname), ".", ",") ;
         n9resultadoUserId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
         A10resultadoTypeId = localUtil.ctol( httpContext.cgiGet( edtresultadoTypeId_Internalname), ".", ",") ;
         n10resultadoTypeId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
         A11resultadoIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetUsuario_Internalname), ".", ",") ;
         n11resultadoIdNetUsuario = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
         A12resultadoFechaCreado = localUtil.ctod( httpContext.cgiGet( edtresultadoFechaCreado_Internalname), 2) ;
         n12resultadoFechaCreado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
         A13resultadoFechaEmision = localUtil.ctod( httpContext.cgiGet( edtresultadoFechaEmision_Internalname), 2) ;
         n13resultadoFechaEmision = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
         A14resultadoPathExcel = httpContext.cgiGet( edtresultadoPathExcel_Internalname) ;
         n14resultadoPathExcel = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14resultadoPathExcel", A14resultadoPathExcel);
         A15resultadoPathPdf = httpContext.cgiGet( edtresultadoPathPdf_Internalname) ;
         n15resultadoPathPdf = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A15resultadoPathPdf", A15resultadoPathPdf);
         A16resultadoPathCsv = httpContext.cgiGet( edtresultadoPathCsv_Internalname) ;
         n16resultadoPathCsv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16resultadoPathCsv", A16resultadoPathCsv);
         A17resultadoIdEstado = localUtil.ctol( httpContext.cgiGet( edtresultadoIdEstado_Internalname), ".", ",") ;
         n17resultadoIdEstado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
         A18resultadoIdLibro = localUtil.ctol( httpContext.cgiGet( edtresultadoIdLibro_Internalname), ".", ",") ;
         n18resultadoIdLibro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
         A166resultadoIdNetTipoinforme = localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetTipoinforme_Internalname), ".", ",") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
         A19resultadoEliminado = (byte)(localUtil.ctol( httpContext.cgiGet( edtresultadoEliminado_Internalname), ".", ",")) ;
         n19resultadoEliminado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
         A20resultadoAbonado = localUtil.ctol( httpContext.cgiGet( edtresultadoAbonado_Internalname), ".", ",") ;
         n20resultadoAbonado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e131C2 ();
      if (returnInSub) return;
   }

   public void e131C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( ! new com.colaveco.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("com.colaveco.notauthorized", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Pgmname))}, new String[] {"GxObject"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141C2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (com.colaveco.SdtTransactionContext)new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtTransactionContext_Transactionname( "Resultado" );
      AV8TrnContextAtt = (com.colaveco.SdtTransactionContext_Attribute)new com.colaveco.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "resultadoId" );
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV6resultadoId, 18, 0) );
      AV7TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV8TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "TransactionContext", "Colaveco"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A1resultadoId = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1C2( ) ;
      ws1C2( ) ;
      we1C2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA1resultadoId = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1C2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "resultadogeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1C2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A1resultadoId = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      }
      wcpOA1resultadoId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1resultadoId"), ".", ",") ;
      if ( ! GetJustCreated( ) && ( ( A1resultadoId != wcpOA1resultadoId ) ) )
      {
         setjustcreated();
      }
      wcpOA1resultadoId = A1resultadoId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA1resultadoId = httpContext.cgiGet( sPrefix+"A1resultadoId_CTRL") ;
      if ( GXutil.len( sCtrlA1resultadoId) > 0 )
      {
         A1resultadoId = localUtil.ctol( httpContext.cgiGet( sCtrlA1resultadoId), ".", ",") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      }
      else
      {
         A1resultadoId = localUtil.ctol( httpContext.cgiGet( sPrefix+"A1resultadoId_PARM"), ".", ",") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa1C2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws1C2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A1resultadoId_PARM", GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA1resultadoId)) > 0 )
      {
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A1resultadoId_CTRL", GXutil.rtrim( sCtrlA1resultadoId));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we1C2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614563023", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("resultadogeneral.js", "?202312614563023", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtresultadoId_Internalname = sPrefix+"RESULTADOID" ;
      edtresultadoFicha_Internalname = sPrefix+"RESULTADOFICHA" ;
      edtresultadoComentarios_Internalname = sPrefix+"RESULTADOCOMENTARIOS" ;
      edtresultadoUserId_Internalname = sPrefix+"RESULTADOUSERID" ;
      edtresultadoTypeId_Internalname = sPrefix+"RESULTADOTYPEID" ;
      edtresultadoIdNetUsuario_Internalname = sPrefix+"RESULTADOIDNETUSUARIO" ;
      edtresultadoFechaCreado_Internalname = sPrefix+"RESULTADOFECHACREADO" ;
      edtresultadoFechaEmision_Internalname = sPrefix+"RESULTADOFECHAEMISION" ;
      edtresultadoPathExcel_Internalname = sPrefix+"RESULTADOPATHEXCEL" ;
      edtresultadoPathPdf_Internalname = sPrefix+"RESULTADOPATHPDF" ;
      edtresultadoPathCsv_Internalname = sPrefix+"RESULTADOPATHCSV" ;
      edtresultadoIdEstado_Internalname = sPrefix+"RESULTADOIDESTADO" ;
      edtresultadoIdLibro_Internalname = sPrefix+"RESULTADOIDLIBRO" ;
      edtresultadoIdNetTipoinforme_Internalname = sPrefix+"RESULTADOIDNETTIPOINFORME" ;
      edtresultadoEliminado_Internalname = sPrefix+"RESULTADOELIMINADO" ;
      edtresultadoAbonado_Internalname = sPrefix+"RESULTADOABONADO" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      edtresultadoAbonado_Jsonclick = "" ;
      edtresultadoAbonado_Enabled = 0 ;
      edtresultadoEliminado_Jsonclick = "" ;
      edtresultadoEliminado_Enabled = 0 ;
      edtresultadoIdNetTipoinforme_Jsonclick = "" ;
      edtresultadoIdNetTipoinforme_Enabled = 0 ;
      edtresultadoIdLibro_Jsonclick = "" ;
      edtresultadoIdLibro_Enabled = 0 ;
      edtresultadoIdEstado_Jsonclick = "" ;
      edtresultadoIdEstado_Enabled = 0 ;
      edtresultadoPathCsv_Enabled = 0 ;
      edtresultadoPathPdf_Enabled = 0 ;
      edtresultadoPathExcel_Enabled = 0 ;
      edtresultadoFechaEmision_Jsonclick = "" ;
      edtresultadoFechaEmision_Enabled = 0 ;
      edtresultadoFechaCreado_Jsonclick = "" ;
      edtresultadoFechaCreado_Enabled = 0 ;
      edtresultadoIdNetUsuario_Jsonclick = "" ;
      edtresultadoIdNetUsuario_Enabled = 0 ;
      edtresultadoTypeId_Jsonclick = "" ;
      edtresultadoTypeId_Enabled = 0 ;
      edtresultadoUserId_Jsonclick = "" ;
      edtresultadoUserId_Enabled = 0 ;
      edtresultadoComentarios_Jsonclick = "" ;
      edtresultadoComentarios_Enabled = 0 ;
      edtresultadoFicha_Jsonclick = "" ;
      edtresultadoFicha_Enabled = 0 ;
      edtresultadoId_Jsonclick = "" ;
      edtresultadoId_Enabled = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A1resultadoId',fld:'RESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111C1',iparms:[{av:'A1resultadoId',fld:'RESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121C1',iparms:[{av:'A1resultadoId',fld:'RESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_RESULTADOID","{handler:'valid_Resultadoid',iparms:[]");
      setEventMetadata("VALID_RESULTADOID",",oparms:[]}");
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

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A8resultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13Pgmname = "" ;
      scmdbuf = "" ;
      H001C2_A1resultadoId = new long[1] ;
      H001C2_A20resultadoAbonado = new long[1] ;
      H001C2_n20resultadoAbonado = new boolean[] {false} ;
      H001C2_A19resultadoEliminado = new byte[1] ;
      H001C2_n19resultadoEliminado = new boolean[] {false} ;
      H001C2_A166resultadoIdNetTipoinforme = new long[1] ;
      H001C2_A18resultadoIdLibro = new long[1] ;
      H001C2_n18resultadoIdLibro = new boolean[] {false} ;
      H001C2_A17resultadoIdEstado = new long[1] ;
      H001C2_n17resultadoIdEstado = new boolean[] {false} ;
      H001C2_A16resultadoPathCsv = new String[] {""} ;
      H001C2_n16resultadoPathCsv = new boolean[] {false} ;
      H001C2_A15resultadoPathPdf = new String[] {""} ;
      H001C2_n15resultadoPathPdf = new boolean[] {false} ;
      H001C2_A14resultadoPathExcel = new String[] {""} ;
      H001C2_n14resultadoPathExcel = new boolean[] {false} ;
      H001C2_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      H001C2_n13resultadoFechaEmision = new boolean[] {false} ;
      H001C2_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      H001C2_n12resultadoFechaCreado = new boolean[] {false} ;
      H001C2_A11resultadoIdNetUsuario = new long[1] ;
      H001C2_n11resultadoIdNetUsuario = new boolean[] {false} ;
      H001C2_A10resultadoTypeId = new long[1] ;
      H001C2_n10resultadoTypeId = new boolean[] {false} ;
      H001C2_A9resultadoUserId = new long[1] ;
      H001C2_n9resultadoUserId = new boolean[] {false} ;
      H001C2_A8resultadoComentarios = new String[] {""} ;
      H001C2_n8resultadoComentarios = new boolean[] {false} ;
      H001C2_A7resultadoFicha = new long[1] ;
      H001C2_n7resultadoFicha = new boolean[] {false} ;
      AV7TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV8TrnContextAtt = new com.colaveco.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA1resultadoId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultadogeneral__default(),
         new Object[] {
             new Object[] {
            H001C2_A1resultadoId, H001C2_A20resultadoAbonado, H001C2_n20resultadoAbonado, H001C2_A19resultadoEliminado, H001C2_n19resultadoEliminado, H001C2_A166resultadoIdNetTipoinforme, H001C2_A18resultadoIdLibro, H001C2_n18resultadoIdLibro, H001C2_A17resultadoIdEstado, H001C2_n17resultadoIdEstado,
            H001C2_A16resultadoPathCsv, H001C2_n16resultadoPathCsv, H001C2_A15resultadoPathPdf, H001C2_n15resultadoPathPdf, H001C2_A14resultadoPathExcel, H001C2_n14resultadoPathExcel, H001C2_A13resultadoFechaEmision, H001C2_n13resultadoFechaEmision, H001C2_A12resultadoFechaCreado, H001C2_n12resultadoFechaCreado,
            H001C2_A11resultadoIdNetUsuario, H001C2_n11resultadoIdNetUsuario, H001C2_A10resultadoTypeId, H001C2_n10resultadoTypeId, H001C2_A9resultadoUserId, H001C2_n9resultadoUserId, H001C2_A8resultadoComentarios, H001C2_n8resultadoComentarios, H001C2_A7resultadoFicha, H001C2_n7resultadoFicha
            }
         }
      );
      AV13Pgmname = "ResultadoGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "ResultadoGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A19resultadoEliminado ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtresultadoId_Enabled ;
   private int edtresultadoFicha_Enabled ;
   private int edtresultadoComentarios_Enabled ;
   private int edtresultadoUserId_Enabled ;
   private int edtresultadoTypeId_Enabled ;
   private int edtresultadoIdNetUsuario_Enabled ;
   private int edtresultadoFechaCreado_Enabled ;
   private int edtresultadoFechaEmision_Enabled ;
   private int edtresultadoPathExcel_Enabled ;
   private int edtresultadoPathPdf_Enabled ;
   private int edtresultadoPathCsv_Enabled ;
   private int edtresultadoIdEstado_Enabled ;
   private int edtresultadoIdLibro_Enabled ;
   private int edtresultadoIdNetTipoinforme_Enabled ;
   private int edtresultadoEliminado_Enabled ;
   private int edtresultadoAbonado_Enabled ;
   private int idxLst ;
   private long wcpOA1resultadoId ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A166resultadoIdNetTipoinforme ;
   private long A20resultadoAbonado ;
   private long AV6resultadoId ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divAttributestable_Internalname ;
   private String edtresultadoId_Internalname ;
   private String edtresultadoId_Jsonclick ;
   private String edtresultadoFicha_Internalname ;
   private String edtresultadoFicha_Jsonclick ;
   private String edtresultadoComentarios_Internalname ;
   private String edtresultadoComentarios_Jsonclick ;
   private String edtresultadoUserId_Internalname ;
   private String edtresultadoUserId_Jsonclick ;
   private String edtresultadoTypeId_Internalname ;
   private String edtresultadoTypeId_Jsonclick ;
   private String edtresultadoIdNetUsuario_Internalname ;
   private String edtresultadoIdNetUsuario_Jsonclick ;
   private String edtresultadoFechaCreado_Internalname ;
   private String edtresultadoFechaCreado_Jsonclick ;
   private String edtresultadoFechaEmision_Internalname ;
   private String edtresultadoFechaEmision_Jsonclick ;
   private String edtresultadoPathExcel_Internalname ;
   private String edtresultadoPathPdf_Internalname ;
   private String edtresultadoPathCsv_Internalname ;
   private String edtresultadoIdEstado_Internalname ;
   private String edtresultadoIdEstado_Jsonclick ;
   private String edtresultadoIdLibro_Internalname ;
   private String edtresultadoIdLibro_Jsonclick ;
   private String edtresultadoIdNetTipoinforme_Internalname ;
   private String edtresultadoIdNetTipoinforme_Jsonclick ;
   private String edtresultadoEliminado_Internalname ;
   private String edtresultadoEliminado_Jsonclick ;
   private String edtresultadoAbonado_Internalname ;
   private String edtresultadoAbonado_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13Pgmname ;
   private String scmdbuf ;
   private String sCtrlA1resultadoId ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n20resultadoAbonado ;
   private boolean n19resultadoEliminado ;
   private boolean n18resultadoIdLibro ;
   private boolean n17resultadoIdEstado ;
   private boolean n16resultadoPathCsv ;
   private boolean n15resultadoPathPdf ;
   private boolean n14resultadoPathExcel ;
   private boolean n13resultadoFechaEmision ;
   private boolean n12resultadoFechaCreado ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n10resultadoTypeId ;
   private boolean n9resultadoUserId ;
   private boolean n8resultadoComentarios ;
   private boolean n7resultadoFicha ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private long[] H001C2_A1resultadoId ;
   private long[] H001C2_A20resultadoAbonado ;
   private boolean[] H001C2_n20resultadoAbonado ;
   private byte[] H001C2_A19resultadoEliminado ;
   private boolean[] H001C2_n19resultadoEliminado ;
   private long[] H001C2_A166resultadoIdNetTipoinforme ;
   private long[] H001C2_A18resultadoIdLibro ;
   private boolean[] H001C2_n18resultadoIdLibro ;
   private long[] H001C2_A17resultadoIdEstado ;
   private boolean[] H001C2_n17resultadoIdEstado ;
   private String[] H001C2_A16resultadoPathCsv ;
   private boolean[] H001C2_n16resultadoPathCsv ;
   private String[] H001C2_A15resultadoPathPdf ;
   private boolean[] H001C2_n15resultadoPathPdf ;
   private String[] H001C2_A14resultadoPathExcel ;
   private boolean[] H001C2_n14resultadoPathExcel ;
   private java.util.Date[] H001C2_A13resultadoFechaEmision ;
   private boolean[] H001C2_n13resultadoFechaEmision ;
   private java.util.Date[] H001C2_A12resultadoFechaCreado ;
   private boolean[] H001C2_n12resultadoFechaCreado ;
   private long[] H001C2_A11resultadoIdNetUsuario ;
   private boolean[] H001C2_n11resultadoIdNetUsuario ;
   private long[] H001C2_A10resultadoTypeId ;
   private boolean[] H001C2_n10resultadoTypeId ;
   private long[] H001C2_A9resultadoUserId ;
   private boolean[] H001C2_n9resultadoUserId ;
   private String[] H001C2_A8resultadoComentarios ;
   private boolean[] H001C2_n8resultadoComentarios ;
   private long[] H001C2_A7resultadoFicha ;
   private boolean[] H001C2_n7resultadoFicha ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.colaveco.SdtTransactionContext AV7TrnContext ;
   private com.colaveco.SdtTransactionContext_Attribute AV8TrnContextAtt ;
}

final  class resultadogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001C2", "SELECT `resultadoId`, `resultadoAbonado`, `resultadoEliminado`, `resultadoIdNetTipoinforme`, `resultadoIdLibro`, `resultadoIdEstado`, `resultadoPathCsv`, `resultadoPathPdf`, `resultadoPathExcel`, `resultadoFechaEmision`, `resultadoFechaCreado`, `resultadoIdNetUsuario`, `resultadoTypeId`, `resultadoUserId`, `resultadoComentarios`, `resultadoFicha` FROM `Resultado` WHERE `resultadoId` = ? ORDER BY `resultadoId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((long[]) buf[6])[0] = rslt.getLong(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

