package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class publicidadappgeneral_impl extends GXWebComponent
{
   public publicidadappgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public publicidadappgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( publicidadappgeneral_impl.class ));
   }

   public publicidadappgeneral_impl( int remoteHandle ,
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
      chkPublicidadMenuApp = UIFactory.getCheckbox(this);
      chkPublicidadMenuWeb = UIFactory.getCheckbox(this);
      chkPublicidadMostrarApp = UIFactory.getCheckbox(this);
      chkPublicidadMostrarWeb = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "PublicidadId") ;
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
               A183PublicidadId = GXutil.lval( httpContext.GetPar( "PublicidadId")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,Long.valueOf(A183PublicidadId)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "PublicidadId") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "PublicidadId") ;
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
         pa102( ) ;
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
         httpContext.writeValue( "Publicidad App General") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20221231166993", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.publicidadappgeneral", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A183PublicidadId,18,0))}, new String[] {"PublicidadId"}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA183PublicidadId", GXutil.ltrim( localUtil.ntoc( wcpOA183PublicidadId, (byte)(18), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm102( )
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
      return "PublicidadAppGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "Publicidad App General" ;
   }

   public void wb100( )
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
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.colaveco.publicidadappgeneral");
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
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Update", bttBtnupdate_Jsonclick, 7, "Update", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11101_client"+"'", TempTags, "", 2, "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Delete", bttBtndelete_Jsonclick, 7, "Delete", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12101_client"+"'", TempTags, "", 2, "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAttributestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPublicidadId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtPublicidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtPublicidadId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPublicidadId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtPublicidadId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPublicidadTitulo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadTitulo_Internalname, "Titulo", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadTitulo_Internalname, GXutil.rtrim( A184PublicidadTitulo), "", "", (short)(0), 1, edtPublicidadTitulo_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPublicidadSubTitulo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadSubTitulo_Internalname, "Sub Titulo", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadSubTitulo_Internalname, GXutil.rtrim( A185PublicidadSubTitulo), "", "", (short)(0), 1, edtPublicidadSubTitulo_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPublicidadDescripcion_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadDescripcion_Internalname, "Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadDescripcion_Internalname, GXutil.rtrim( A186PublicidadDescripcion), "", "", (short)(0), 1, edtPublicidadDescripcion_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_PublicidadAppGeneral.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPublicidadMenuApp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMenuApp.getInternalname(), "Menu App", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMenuApp.getInternalname(), GXutil.booltostr( A188PublicidadMenuApp), "", "Menu App", 1, chkPublicidadMenuApp.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPublicidadMenuWeb.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMenuWeb.getInternalname(), "Menu Web", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMenuWeb.getInternalname(), GXutil.booltostr( A189PublicidadMenuWeb), "", "Menu Web", 1, chkPublicidadMenuWeb.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPublicidadMostrarApp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMostrarApp.getInternalname(), "Mostrar App", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMostrarApp.getInternalname(), GXutil.booltostr( A190PublicidadMostrarApp), "", "Mostrar App", 1, chkPublicidadMostrarApp.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPublicidadMostrarWeb.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMostrarWeb.getInternalname(), "Mostrar Web", "col-sm-3 ReadonlyAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMostrarWeb.getInternalname(), GXutil.booltostr( A191PublicidadMostrarWeb), "", "Mostrar Web", 1, chkPublicidadMostrarWeb.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divImagestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, "", "Imagen", "col-sm-3 ReadonlyAttributeLabel ReadonlyResponsiveImageAttributeLabel", 0, true, "");
         /* Static Bitmap Variable */
         ClassString = "ReadonlyAttribute ReadonlyResponsiveImageAttribute" ;
         StyleString = "" ;
         A187PublicidadImagen_IsBlob = (boolean)(((GXutil.strcmp("", A187PublicidadImagen)==0)&&(GXutil.strcmp("", A40000PublicidadImagen_GXI)==0))||!(GXutil.strcmp("", A187PublicidadImagen)==0)) ;
         sImgUrl = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.getResourceRelative(A187PublicidadImagen)) ;
         com.colaveco.GxWebStd.gx_bitmap( httpContext, imgPublicidadImagen_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 0, "", "", 1, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, A187PublicidadImagen_IsBlob, true, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PublicidadAppGeneral.htm");
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

   public void start102( )
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
            Form.getMeta().addItem("description", "Publicidad App General", (short)(0)) ;
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
            strup100( ) ;
         }
      }
   }

   public void ws102( )
   {
      start102( ) ;
      evt102( ) ;
   }

   public void evt102( )
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
                              strup100( ) ;
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
                              strup100( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13102 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup100( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14102 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup100( ) ;
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
                              strup100( ) ;
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

   public void we102( )
   {
      if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm102( ) ;
         }
      }
   }

   public void pa102( )
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
      A188PublicidadMenuApp = GXutil.strtobool( GXutil.booltostr( A188PublicidadMenuApp)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
      A189PublicidadMenuWeb = GXutil.strtobool( GXutil.booltostr( A189PublicidadMenuWeb)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
      A190PublicidadMostrarApp = GXutil.strtobool( GXutil.booltostr( A190PublicidadMostrarApp)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
      A191PublicidadMostrarWeb = GXutil.strtobool( GXutil.booltostr( A191PublicidadMostrarWeb)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf102( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "PublicidadAppGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf102( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00102 */
         pr_default.execute(0, new Object[] {Long.valueOf(A183PublicidadId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A187PublicidadImagen = H00102_A187PublicidadImagen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A187PublicidadImagen", A187PublicidadImagen);
            httpContext.ajax_rsp_assign_prop(sPrefix, false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
            httpContext.ajax_rsp_assign_prop(sPrefix, false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
            A40000PublicidadImagen_GXI = H00102_A40000PublicidadImagen_GXI[0] ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
            httpContext.ajax_rsp_assign_prop(sPrefix, false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
            A191PublicidadMostrarWeb = H00102_A191PublicidadMostrarWeb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
            A190PublicidadMostrarApp = H00102_A190PublicidadMostrarApp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
            A189PublicidadMenuWeb = H00102_A189PublicidadMenuWeb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
            A188PublicidadMenuApp = H00102_A188PublicidadMenuApp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
            A186PublicidadDescripcion = H00102_A186PublicidadDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
            A185PublicidadSubTitulo = H00102_A185PublicidadSubTitulo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
            A184PublicidadTitulo = H00102_A184PublicidadTitulo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184PublicidadTitulo", A184PublicidadTitulo);
            /* Execute user event: Load */
            e14102 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb100( ) ;
      }
   }

   public void send_integrity_lvl_hashes102( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "PublicidadAppGeneral" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup100( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13102 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA183PublicidadId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA183PublicidadId"), ".", ",") ;
         /* Read variables values. */
         A184PublicidadTitulo = httpContext.cgiGet( edtPublicidadTitulo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184PublicidadTitulo", A184PublicidadTitulo);
         A185PublicidadSubTitulo = httpContext.cgiGet( edtPublicidadSubTitulo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
         A186PublicidadDescripcion = httpContext.cgiGet( edtPublicidadDescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
         A188PublicidadMenuApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuApp.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
         A189PublicidadMenuWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuWeb.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
         A190PublicidadMostrarApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarApp.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
         A191PublicidadMostrarWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarWeb.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
         A187PublicidadImagen = httpContext.cgiGet( imgPublicidadImagen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A187PublicidadImagen", A187PublicidadImagen);
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
      e13102 ();
      if (returnInSub) return;
   }

   public void e13102( )
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

   protected void e14102( )
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
      AV7TrnContext.setgxTv_SdtTransactionContext_Transactionname( "PublicidadApp" );
      AV8TrnContextAtt = (com.colaveco.SdtTransactionContext_Attribute)new com.colaveco.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "PublicidadId" );
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV6PublicidadId, 18, 0) );
      AV7TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV8TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "TransactionContext", "Colaveco"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A183PublicidadId = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
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
      pa102( ) ;
      ws102( ) ;
      we102( ) ;
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
      sCtrlA183PublicidadId = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa102( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "publicidadappgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa102( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A183PublicidadId = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      }
      wcpOA183PublicidadId = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA183PublicidadId"), ".", ",") ;
      if ( ! GetJustCreated( ) && ( ( A183PublicidadId != wcpOA183PublicidadId ) ) )
      {
         setjustcreated();
      }
      wcpOA183PublicidadId = A183PublicidadId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA183PublicidadId = httpContext.cgiGet( sPrefix+"A183PublicidadId_CTRL") ;
      if ( GXutil.len( sCtrlA183PublicidadId) > 0 )
      {
         A183PublicidadId = localUtil.ctol( httpContext.cgiGet( sCtrlA183PublicidadId), ".", ",") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      }
      else
      {
         A183PublicidadId = localUtil.ctol( httpContext.cgiGet( sPrefix+"A183PublicidadId_PARM"), ".", ",") ;
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
      pa102( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws102( ) ;
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
      ws102( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A183PublicidadId_PARM", GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA183PublicidadId)) > 0 )
      {
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A183PublicidadId_CTRL", GXutil.rtrim( sCtrlA183PublicidadId));
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
      we102( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202212311661074", true, true);
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
      httpContext.AddJavascriptSource("publicidadappgeneral.js", "?202212311661075", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtPublicidadId_Internalname = sPrefix+"PUBLICIDADID" ;
      edtPublicidadTitulo_Internalname = sPrefix+"PUBLICIDADTITULO" ;
      edtPublicidadSubTitulo_Internalname = sPrefix+"PUBLICIDADSUBTITULO" ;
      edtPublicidadDescripcion_Internalname = sPrefix+"PUBLICIDADDESCRIPCION" ;
      chkPublicidadMenuApp.setInternalname( sPrefix+"PUBLICIDADMENUAPP" );
      chkPublicidadMenuWeb.setInternalname( sPrefix+"PUBLICIDADMENUWEB" );
      chkPublicidadMostrarApp.setInternalname( sPrefix+"PUBLICIDADMOSTRARAPP" );
      chkPublicidadMostrarWeb.setInternalname( sPrefix+"PUBLICIDADMOSTRARWEB" );
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      imgPublicidadImagen_Internalname = sPrefix+"PUBLICIDADIMAGEN" ;
      divImagestable_Internalname = sPrefix+"IMAGESTABLE" ;
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
      chkPublicidadMostrarWeb.setEnabled( 0 );
      chkPublicidadMostrarApp.setEnabled( 0 );
      chkPublicidadMenuWeb.setEnabled( 0 );
      chkPublicidadMenuApp.setEnabled( 0 );
      edtPublicidadDescripcion_Enabled = 0 ;
      edtPublicidadSubTitulo_Enabled = 0 ;
      edtPublicidadTitulo_Enabled = 0 ;
      edtPublicidadId_Jsonclick = "" ;
      edtPublicidadId_Enabled = 0 ;
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
      chkPublicidadMenuApp.setName( "PUBLICIDADMENUAPP" );
      chkPublicidadMenuApp.setWebtags( "" );
      chkPublicidadMenuApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPublicidadMenuApp.getInternalname(), "TitleCaption", chkPublicidadMenuApp.getCaption(), true);
      chkPublicidadMenuApp.setCheckedValue( "false" );
      chkPublicidadMenuWeb.setName( "PUBLICIDADMENUWEB" );
      chkPublicidadMenuWeb.setWebtags( "" );
      chkPublicidadMenuWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPublicidadMenuWeb.getInternalname(), "TitleCaption", chkPublicidadMenuWeb.getCaption(), true);
      chkPublicidadMenuWeb.setCheckedValue( "false" );
      chkPublicidadMostrarApp.setName( "PUBLICIDADMOSTRARAPP" );
      chkPublicidadMostrarApp.setWebtags( "" );
      chkPublicidadMostrarApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPublicidadMostrarApp.getInternalname(), "TitleCaption", chkPublicidadMostrarApp.getCaption(), true);
      chkPublicidadMostrarApp.setCheckedValue( "false" );
      chkPublicidadMostrarWeb.setName( "PUBLICIDADMOSTRARWEB" );
      chkPublicidadMostrarWeb.setWebtags( "" );
      chkPublicidadMostrarWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPublicidadMostrarWeb.getInternalname(), "TitleCaption", chkPublicidadMostrarWeb.getCaption(), true);
      chkPublicidadMostrarWeb.setCheckedValue( "false" );
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11101',iparms:[{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("'DODELETE'","{handler:'e12101',iparms:[{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("VALID_PUBLICIDADID","{handler:'valid_Publicidadid',iparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("VALID_PUBLICIDADID",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
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
      A184PublicidadTitulo = "" ;
      A185PublicidadSubTitulo = "" ;
      A186PublicidadDescripcion = "" ;
      A187PublicidadImagen = "" ;
      A40000PublicidadImagen_GXI = "" ;
      sImgUrl = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13Pgmname = "" ;
      scmdbuf = "" ;
      H00102_A183PublicidadId = new long[1] ;
      H00102_A187PublicidadImagen = new String[] {""} ;
      H00102_A40000PublicidadImagen_GXI = new String[] {""} ;
      H00102_A191PublicidadMostrarWeb = new boolean[] {false} ;
      H00102_A190PublicidadMostrarApp = new boolean[] {false} ;
      H00102_A189PublicidadMenuWeb = new boolean[] {false} ;
      H00102_A188PublicidadMenuApp = new boolean[] {false} ;
      H00102_A186PublicidadDescripcion = new String[] {""} ;
      H00102_A185PublicidadSubTitulo = new String[] {""} ;
      H00102_A184PublicidadTitulo = new String[] {""} ;
      AV7TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV8TrnContextAtt = new com.colaveco.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA183PublicidadId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.publicidadappgeneral__default(),
         new Object[] {
             new Object[] {
            H00102_A183PublicidadId, H00102_A187PublicidadImagen, H00102_A40000PublicidadImagen_GXI, H00102_A191PublicidadMostrarWeb, H00102_A190PublicidadMostrarApp, H00102_A189PublicidadMenuWeb, H00102_A188PublicidadMenuApp, H00102_A186PublicidadDescripcion, H00102_A185PublicidadSubTitulo, H00102_A184PublicidadTitulo
            }
         }
      );
      AV13Pgmname = "PublicidadAppGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "PublicidadAppGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtPublicidadId_Enabled ;
   private int edtPublicidadTitulo_Enabled ;
   private int edtPublicidadSubTitulo_Enabled ;
   private int edtPublicidadDescripcion_Enabled ;
   private int idxLst ;
   private long wcpOA183PublicidadId ;
   private long A183PublicidadId ;
   private long AV6PublicidadId ;
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
   private String edtPublicidadId_Internalname ;
   private String edtPublicidadId_Jsonclick ;
   private String edtPublicidadTitulo_Internalname ;
   private String A184PublicidadTitulo ;
   private String edtPublicidadSubTitulo_Internalname ;
   private String A185PublicidadSubTitulo ;
   private String edtPublicidadDescripcion_Internalname ;
   private String A186PublicidadDescripcion ;
   private String divImagestable_Internalname ;
   private String sImgUrl ;
   private String imgPublicidadImagen_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13Pgmname ;
   private String scmdbuf ;
   private String sCtrlA183PublicidadId ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean A188PublicidadMenuApp ;
   private boolean A189PublicidadMenuWeb ;
   private boolean A190PublicidadMostrarApp ;
   private boolean A191PublicidadMostrarWeb ;
   private boolean A187PublicidadImagen_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A40000PublicidadImagen_GXI ;
   private String A187PublicidadImagen ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private ICheckbox chkPublicidadMenuApp ;
   private ICheckbox chkPublicidadMenuWeb ;
   private ICheckbox chkPublicidadMostrarApp ;
   private ICheckbox chkPublicidadMostrarWeb ;
   private IDataStoreProvider pr_default ;
   private long[] H00102_A183PublicidadId ;
   private String[] H00102_A187PublicidadImagen ;
   private String[] H00102_A40000PublicidadImagen_GXI ;
   private boolean[] H00102_A191PublicidadMostrarWeb ;
   private boolean[] H00102_A190PublicidadMostrarApp ;
   private boolean[] H00102_A189PublicidadMenuWeb ;
   private boolean[] H00102_A188PublicidadMenuApp ;
   private String[] H00102_A186PublicidadDescripcion ;
   private String[] H00102_A185PublicidadSubTitulo ;
   private String[] H00102_A184PublicidadTitulo ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.colaveco.SdtTransactionContext AV7TrnContext ;
   private com.colaveco.SdtTransactionContext_Attribute AV8TrnContextAtt ;
}

final  class publicidadappgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00102", "SELECT `PublicidadId`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadMostrarWeb`, `PublicidadMostrarApp`, `PublicidadMenuWeb`, `PublicidadMenuApp`, `PublicidadDescripcion`, `PublicidadSubTitulo`, `PublicidadTitulo` FROM `PublicidadApp` WHERE `PublicidadId` = ? ORDER BY `PublicidadId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getMultimediaFile(2, rslt.getVarchar(3));
               ((String[]) buf[2])[0] = rslt.getMultimediaUri(3);
               ((boolean[]) buf[3])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 256);
               ((String[]) buf[8])[0] = rslt.getString(9, 256);
               ((String[]) buf[9])[0] = rslt.getString(10, 256);
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

