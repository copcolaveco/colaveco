package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0060_impl extends GXDataArea
{
   public gx0060_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0060_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0060_impl.class ));
   }

   public gx0060_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "pNotificacionesId") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pNotificacionesId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pNotificacionesId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_64 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_64"))) ;
            nGXsfl_64_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_64_idx"))) ;
            sGXsfl_64_idx = httpContext.GetPar( "sGXsfl_64_idx") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
            AV6cNotificacionesId = GXutil.lval( httpContext.GetPar( "cNotificacionesId")) ;
            AV7cNotificacionesFecha = localUtil.parseDTimeParm( httpContext.GetPar( "cNotificacionesFecha")) ;
            AV8cNotificacionesTipo = httpContext.GetPar( "cNotificacionesTipo") ;
            AV9cNotificacionesIdNetUsuario = GXutil.lval( httpContext.GetPar( "cNotificacionesIdNetUsuario")) ;
            AV10cNotificacionesDetalle = httpContext.GetPar( "cNotificacionesDetalle") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESIDFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESFECHAFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesfechafiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESTIPOFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionestipofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesidnetusuariofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESDETALLEFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesdetallefiltercontainer_Class));
            addString( httpContext.getJSONResponse( )) ;
            return  ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV11pNotificacionesId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pNotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pNotificacionesId), 18, 0));
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.colaveco.rwdpromptmasterpage");
         MasterPageObj.setDataArea(this,true);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa0E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0E2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.colaveco.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?20231261531862", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gx0060", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pNotificacionesId,18,0))}, new String[] {"pNotificacionesId"}) +"\">") ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNOTIFICACIONESID", GXutil.ltrim( localUtil.ntoc( AV6cNotificacionesId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNOTIFICACIONESFECHA", localUtil.ttoc( AV7cNotificacionesFecha, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNOTIFICACIONESTIPO", AV8cNotificacionesTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNOTIFICACIONESIDNETUSUARIO", GXutil.ltrim( localUtil.ntoc( AV9cNotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNOTIFICACIONESDETALLE", AV10cNotificacionesDetalle);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPNOTIFICACIONESID", GXutil.ltrim( localUtil.ntoc( AV11pNotificacionesId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESIDFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESFECHAFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesfechafiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESTIPOFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionestipofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesidnetusuariofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESDETALLEFILTERCONTAINER_Class", GXutil.rtrim( divNotificacionesdetallefiltercontainer_Class));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.colaveco.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we0E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0E2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.colaveco.gx0060", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pNotificacionesId,18,0))}, new String[] {"pNotificacionesId"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0060" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Notificaciones" ;
   }

   public void wb0E0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.colaveco.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divNotificacionesidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNotificacionesidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblnotificacionesidfilter_Internalname, "Notificaciones Id", "", "", lblLblnotificacionesidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCnotificacionesid_Internalname, "Notificaciones Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCnotificacionesid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cNotificacionesId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCnotificacionesid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cNotificacionesId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cNotificacionesId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnotificacionesid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnotificacionesid_Visible, edtavCnotificacionesid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divNotificacionesfechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divNotificacionesfechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblnotificacionesfechafilter_Internalname, "Notificaciones Fecha", "", "", lblLblnotificacionesfechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120e1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCnotificacionesfecha_Internalname, "Notificaciones Fecha", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCnotificacionesfecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCnotificacionesfecha_Internalname, localUtil.ttoc( AV7cNotificacionesFecha, 10, 8, 1, 2, "/", ":", " "), localUtil.format( AV7cNotificacionesFecha, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnotificacionesfecha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCnotificacionesfecha_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0060.htm");
         httpContext.writeTextNL( "</div>") ;
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divNotificacionestipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divNotificacionestipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblnotificacionestipofilter_Internalname, "Notificaciones Tipo", "", "", lblLblnotificacionestipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCnotificacionestipo_Internalname, "Notificaciones Tipo", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCnotificacionestipo_Internalname, AV8cNotificacionesTipo, GXutil.rtrim( localUtil.format( AV8cNotificacionesTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnotificacionestipo_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnotificacionestipo_Visible, edtavCnotificacionestipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divNotificacionesidnetusuariofiltercontainer_Internalname, 1, 0, "px", 0, "px", divNotificacionesidnetusuariofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblnotificacionesidnetusuariofilter_Internalname, "Notificaciones Id Net Usuario", "", "", lblLblnotificacionesidnetusuariofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCnotificacionesidnetusuario_Internalname, "Notificaciones Id Net Usuario", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCnotificacionesidnetusuario_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cNotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCnotificacionesidnetusuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9cNotificacionesIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9cNotificacionesIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnotificacionesidnetusuario_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnotificacionesidnetusuario_Visible, edtavCnotificacionesidnetusuario_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divNotificacionesdetallefiltercontainer_Internalname, 1, 0, "px", 0, "px", divNotificacionesdetallefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblnotificacionesdetallefilter_Internalname, "Notificaciones Detalle", "", "", lblLblnotificacionesdetallefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCnotificacionesdetalle_Internalname, "Notificaciones Detalle", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCnotificacionesdetalle_Internalname, AV10cNotificacionesDetalle, GXutil.rtrim( localUtil.format( AV10cNotificacionesDetalle, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnotificacionesdetalle_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnotificacionesdetalle_Visible, edtavCnotificacionesdetalle_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e160e1_client"+"'", TempTags, "", 2, "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"64\">") ;
            sStyleString = "" ;
            com.colaveco.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Net Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Header", subGrid1_Header);
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A169NotificacionesFecha, 10, 8, 1, 2, "/", ":", " "));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtNotificacionesFecha_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A170NotificacionesTipo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A172NotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (int)(nGXsfl_64_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0060.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start0E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_7-156546", (short)(0)) ;
         }
         Form.getMeta().addItem("description", "Selection List Notificaciones", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0E0( ) ;
   }

   public void ws0E2( )
   {
      start0E2( ) ;
      evt0E2( ) ;
   }

   public void evt0E2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_64_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_64_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A6NotificacionesId = localUtil.ctol( httpContext.cgiGet( edtNotificacionesId_Internalname), ".", ",") ;
                           A169NotificacionesFecha = localUtil.ctot( httpContext.cgiGet( edtNotificacionesFecha_Internalname), 0) ;
                           n169NotificacionesFecha = false ;
                           A170NotificacionesTipo = httpContext.cgiGet( edtNotificacionesTipo_Internalname) ;
                           n170NotificacionesTipo = false ;
                           A172NotificacionesIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtNotificacionesIdNetUsuario_Internalname), ".", ",") ;
                           n172NotificacionesIdNetUsuario = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e170E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e180E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cnotificacionesid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNOTIFICACIONESID"), ".", ",") != AV6cNotificacionesId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cnotificacionesfecha Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCNOTIFICACIONESFECHA"), 0), AV7cNotificacionesFecha) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cnotificacionestipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCNOTIFICACIONESTIPO"), AV8cNotificacionesTipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cnotificacionesidnetusuario Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNOTIFICACIONESIDNETUSUARIO"), ".", ",") != AV9cNotificacionesIdNetUsuario )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cnotificacionesdetalle Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCNOTIFICACIONESDETALLE"), AV10cNotificacionesDetalle) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e190E2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0E2( )
   {
      if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa0E2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cNotificacionesId ,
                                  java.util.Date AV7cNotificacionesFecha ,
                                  String AV8cNotificacionesTipo ,
                                  long AV9cNotificacionesIdNetUsuario ,
                                  String AV10cNotificacionesDetalle )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf0E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOTIFICACIONESID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A6NotificacionesId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "NOTIFICACIONESID", GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")));
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
      rf0E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(64) ;
      nGXsfl_64_idx = 1 ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      bGXsfl_64_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_642( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cNotificacionesFecha ,
                                              AV8cNotificacionesTipo ,
                                              Long.valueOf(AV9cNotificacionesIdNetUsuario) ,
                                              AV10cNotificacionesDetalle ,
                                              A169NotificacionesFecha ,
                                              A170NotificacionesTipo ,
                                              Long.valueOf(A172NotificacionesIdNetUsuario) ,
                                              A173NotificacionesDetalle ,
                                              Long.valueOf(AV6cNotificacionesId) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         lV8cNotificacionesTipo = GXutil.concat( GXutil.rtrim( AV8cNotificacionesTipo), "%", "") ;
         lV10cNotificacionesDetalle = GXutil.concat( GXutil.rtrim( AV10cNotificacionesDetalle), "%", "") ;
         /* Using cursor H000E2 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6cNotificacionesId), AV7cNotificacionesFecha, lV8cNotificacionesTipo, Long.valueOf(AV9cNotificacionesIdNetUsuario), lV10cNotificacionesDetalle, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_64_idx = 1 ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A173NotificacionesDetalle = H000E2_A173NotificacionesDetalle[0] ;
            n173NotificacionesDetalle = H000E2_n173NotificacionesDetalle[0] ;
            A172NotificacionesIdNetUsuario = H000E2_A172NotificacionesIdNetUsuario[0] ;
            n172NotificacionesIdNetUsuario = H000E2_n172NotificacionesIdNetUsuario[0] ;
            A170NotificacionesTipo = H000E2_A170NotificacionesTipo[0] ;
            n170NotificacionesTipo = H000E2_n170NotificacionesTipo[0] ;
            A169NotificacionesFecha = H000E2_A169NotificacionesFecha[0] ;
            n169NotificacionesFecha = H000E2_n169NotificacionesFecha[0] ;
            A6NotificacionesId = H000E2_A6NotificacionesId[0] ;
            /* Execute user event: Load */
            e180E2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb0E0( ) ;
      }
      bGXsfl_64_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0E2( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOTIFICACIONESID"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A6NotificacionesId), "ZZZZZZZZZZZZZZZZZ9")));
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7cNotificacionesFecha ,
                                           AV8cNotificacionesTipo ,
                                           Long.valueOf(AV9cNotificacionesIdNetUsuario) ,
                                           AV10cNotificacionesDetalle ,
                                           A169NotificacionesFecha ,
                                           A170NotificacionesTipo ,
                                           Long.valueOf(A172NotificacionesIdNetUsuario) ,
                                           A173NotificacionesDetalle ,
                                           Long.valueOf(AV6cNotificacionesId) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV8cNotificacionesTipo = GXutil.concat( GXutil.rtrim( AV8cNotificacionesTipo), "%", "") ;
      lV10cNotificacionesDetalle = GXutil.concat( GXutil.rtrim( AV10cNotificacionesDetalle), "%", "") ;
      /* Using cursor H000E3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV6cNotificacionesId), AV7cNotificacionesFecha, lV8cNotificacionesTipo, Long.valueOf(AV9cNotificacionesIdNetUsuario), lV10cNotificacionesDetalle});
      GRID1_nRecordCount = H000E3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNotificacionesId, AV7cNotificacionesFecha, AV8cNotificacionesTipo, AV9cNotificacionesIdNetUsuario, AV10cNotificacionesDetalle) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup0E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e170E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_64 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNOTIFICACIONESID");
            GX_FocusControl = edtavCnotificacionesid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cNotificacionesId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cNotificacionesId), 18, 0));
         }
         else
         {
            AV6cNotificacionesId = localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cNotificacionesId), 18, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCnotificacionesfecha_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCNOTIFICACIONESFECHA");
            GX_FocusControl = edtavCnotificacionesfecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cNotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7cNotificacionesFecha", localUtil.ttoc( AV7cNotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            AV7cNotificacionesFecha = localUtil.ctot( httpContext.cgiGet( edtavCnotificacionesfecha_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cNotificacionesFecha", localUtil.ttoc( AV7cNotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
         }
         AV8cNotificacionesTipo = httpContext.cgiGet( edtavCnotificacionestipo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cNotificacionesTipo", AV8cNotificacionesTipo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesidnetusuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesidnetusuario_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNOTIFICACIONESIDNETUSUARIO");
            GX_FocusControl = edtavCnotificacionesidnetusuario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cNotificacionesIdNetUsuario = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cNotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9cNotificacionesIdNetUsuario), 18, 0));
         }
         else
         {
            AV9cNotificacionesIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtavCnotificacionesidnetusuario_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cNotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9cNotificacionesIdNetUsuario), 18, 0));
         }
         AV10cNotificacionesDetalle = httpContext.cgiGet( edtavCnotificacionesdetalle_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cNotificacionesDetalle", AV10cNotificacionesDetalle);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNOTIFICACIONESID"), ".", ",") != AV6cNotificacionesId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCNOTIFICACIONESFECHA")), AV7cNotificacionesFecha) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCNOTIFICACIONESTIPO"), AV8cNotificacionesTipo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNOTIFICACIONESIDNETUSUARIO"), ".", ",") != AV9cNotificacionesIdNetUsuario )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCNOTIFICACIONESDETALLE"), AV10cNotificacionesDetalle) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e170E2 ();
      if (returnInSub) return;
   }

   public void e170E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "Notificaciones", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e180E2( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV15Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_642( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_64_Refreshing )
      {
         httpContext.doAjaxLoad(64, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e190E2 ();
      if (returnInSub) return;
   }

   public void e190E2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV11pNotificacionesId = A6NotificacionesId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pNotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pNotificacionesId), 18, 0));
      httpContext.setWebReturnParms(new Object[] {Long.valueOf(AV11pNotificacionesId)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11pNotificacionesId"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11pNotificacionesId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pNotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pNotificacionesId), 18, 0));
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
      pa0E2( ) ;
      ws0E2( ) ;
      we0E2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2023126153203", true, true);
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
      httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gx0060.js", "?2023126153204", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtNotificacionesId_Internalname = "NOTIFICACIONESID_"+sGXsfl_64_idx ;
      edtNotificacionesFecha_Internalname = "NOTIFICACIONESFECHA_"+sGXsfl_64_idx ;
      edtNotificacionesTipo_Internalname = "NOTIFICACIONESTIPO_"+sGXsfl_64_idx ;
      edtNotificacionesIdNetUsuario_Internalname = "NOTIFICACIONESIDNETUSUARIO_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtNotificacionesId_Internalname = "NOTIFICACIONESID_"+sGXsfl_64_fel_idx ;
      edtNotificacionesFecha_Internalname = "NOTIFICACIONESFECHA_"+sGXsfl_64_fel_idx ;
      edtNotificacionesTipo_Internalname = "NOTIFICACIONESTIPO_"+sGXsfl_64_fel_idx ;
      edtNotificacionesIdNetUsuario_Internalname = "NOTIFICACIONESIDNETUSUARIO_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb0E0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_64_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_64_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV15Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNotificacionesId_Internalname,GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6NotificacionesId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNotificacionesId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtNotificacionesFecha_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesFecha_Internalname, "Link", edtNotificacionesFecha_Link, !bGXsfl_64_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNotificacionesFecha_Internalname,localUtil.ttoc( A169NotificacionesFecha, 10, 8, 1, 2, "/", ":", " "),localUtil.format( A169NotificacionesFecha, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'",edtNotificacionesFecha_Link,"","","",edtNotificacionesFecha_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNotificacionesTipo_Internalname,A170NotificacionesTipo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNotificacionesTipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNotificacionesIdNetUsuario_Internalname,GXutil.ltrim( localUtil.ntoc( A172NotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNotificacionesIdNetUsuario_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes0E2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_64_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void init_default_properties( )
   {
      lblLblnotificacionesidfilter_Internalname = "LBLNOTIFICACIONESIDFILTER" ;
      edtavCnotificacionesid_Internalname = "vCNOTIFICACIONESID" ;
      divNotificacionesidfiltercontainer_Internalname = "NOTIFICACIONESIDFILTERCONTAINER" ;
      lblLblnotificacionesfechafilter_Internalname = "LBLNOTIFICACIONESFECHAFILTER" ;
      edtavCnotificacionesfecha_Internalname = "vCNOTIFICACIONESFECHA" ;
      divNotificacionesfechafiltercontainer_Internalname = "NOTIFICACIONESFECHAFILTERCONTAINER" ;
      lblLblnotificacionestipofilter_Internalname = "LBLNOTIFICACIONESTIPOFILTER" ;
      edtavCnotificacionestipo_Internalname = "vCNOTIFICACIONESTIPO" ;
      divNotificacionestipofiltercontainer_Internalname = "NOTIFICACIONESTIPOFILTERCONTAINER" ;
      lblLblnotificacionesidnetusuariofilter_Internalname = "LBLNOTIFICACIONESIDNETUSUARIOFILTER" ;
      edtavCnotificacionesidnetusuario_Internalname = "vCNOTIFICACIONESIDNETUSUARIO" ;
      divNotificacionesidnetusuariofiltercontainer_Internalname = "NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER" ;
      lblLblnotificacionesdetallefilter_Internalname = "LBLNOTIFICACIONESDETALLEFILTER" ;
      edtavCnotificacionesdetalle_Internalname = "vCNOTIFICACIONESDETALLE" ;
      divNotificacionesdetallefiltercontainer_Internalname = "NOTIFICACIONESDETALLEFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtNotificacionesId_Internalname = "NOTIFICACIONESID" ;
      edtNotificacionesFecha_Internalname = "NOTIFICACIONESFECHA" ;
      edtNotificacionesTipo_Internalname = "NOTIFICACIONESTIPO" ;
      edtNotificacionesIdNetUsuario_Internalname = "NOTIFICACIONESIDNETUSUARIO" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("Carmine");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtNotificacionesIdNetUsuario_Jsonclick = "" ;
      edtNotificacionesTipo_Jsonclick = "" ;
      edtNotificacionesFecha_Jsonclick = "" ;
      edtNotificacionesId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtNotificacionesFecha_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Header = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCnotificacionesdetalle_Jsonclick = "" ;
      edtavCnotificacionesdetalle_Enabled = 1 ;
      edtavCnotificacionesdetalle_Visible = 1 ;
      edtavCnotificacionesidnetusuario_Jsonclick = "" ;
      edtavCnotificacionesidnetusuario_Enabled = 1 ;
      edtavCnotificacionesidnetusuario_Visible = 1 ;
      edtavCnotificacionestipo_Jsonclick = "" ;
      edtavCnotificacionestipo_Enabled = 1 ;
      edtavCnotificacionestipo_Visible = 1 ;
      edtavCnotificacionesfecha_Jsonclick = "" ;
      edtavCnotificacionesfecha_Enabled = 1 ;
      edtavCnotificacionesid_Jsonclick = "" ;
      edtavCnotificacionesid_Enabled = 1 ;
      edtavCnotificacionesid_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Notificaciones" );
      divNotificacionesdetallefiltercontainer_Class = "AdvancedContainerItem" ;
      divNotificacionesidnetusuariofiltercontainer_Class = "AdvancedContainerItem" ;
      divNotificacionestipofiltercontainer_Class = "AdvancedContainerItem" ;
      divNotificacionesfechafiltercontainer_Class = "AdvancedContainerItem" ;
      divNotificacionesidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cNotificacionesId',fld:'vCNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cNotificacionesFecha',fld:'vCNOTIFICACIONESFECHA',pic:'99/99/99 99:99'},{av:'AV8cNotificacionesTipo',fld:'vCNOTIFICACIONESTIPO',pic:''},{av:'AV9cNotificacionesIdNetUsuario',fld:'vCNOTIFICACIONESIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cNotificacionesDetalle',fld:'vCNOTIFICACIONESDETALLE',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e160E1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLNOTIFICACIONESIDFILTER.CLICK","{handler:'e110E1',iparms:[{av:'divNotificacionesidfiltercontainer_Class',ctrl:'NOTIFICACIONESIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLNOTIFICACIONESIDFILTER.CLICK",",oparms:[{av:'divNotificacionesidfiltercontainer_Class',ctrl:'NOTIFICACIONESIDFILTERCONTAINER',prop:'Class'},{av:'edtavCnotificacionesid_Visible',ctrl:'vCNOTIFICACIONESID',prop:'Visible'}]}");
      setEventMetadata("LBLNOTIFICACIONESFECHAFILTER.CLICK","{handler:'e120E1',iparms:[{av:'divNotificacionesfechafiltercontainer_Class',ctrl:'NOTIFICACIONESFECHAFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLNOTIFICACIONESFECHAFILTER.CLICK",",oparms:[{av:'divNotificacionesfechafiltercontainer_Class',ctrl:'NOTIFICACIONESFECHAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLNOTIFICACIONESTIPOFILTER.CLICK","{handler:'e130E1',iparms:[{av:'divNotificacionestipofiltercontainer_Class',ctrl:'NOTIFICACIONESTIPOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLNOTIFICACIONESTIPOFILTER.CLICK",",oparms:[{av:'divNotificacionestipofiltercontainer_Class',ctrl:'NOTIFICACIONESTIPOFILTERCONTAINER',prop:'Class'},{av:'edtavCnotificacionestipo_Visible',ctrl:'vCNOTIFICACIONESTIPO',prop:'Visible'}]}");
      setEventMetadata("LBLNOTIFICACIONESIDNETUSUARIOFILTER.CLICK","{handler:'e140E1',iparms:[{av:'divNotificacionesidnetusuariofiltercontainer_Class',ctrl:'NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLNOTIFICACIONESIDNETUSUARIOFILTER.CLICK",",oparms:[{av:'divNotificacionesidnetusuariofiltercontainer_Class',ctrl:'NOTIFICACIONESIDNETUSUARIOFILTERCONTAINER',prop:'Class'},{av:'edtavCnotificacionesidnetusuario_Visible',ctrl:'vCNOTIFICACIONESIDNETUSUARIO',prop:'Visible'}]}");
      setEventMetadata("LBLNOTIFICACIONESDETALLEFILTER.CLICK","{handler:'e150E1',iparms:[{av:'divNotificacionesdetallefiltercontainer_Class',ctrl:'NOTIFICACIONESDETALLEFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLNOTIFICACIONESDETALLEFILTER.CLICK",",oparms:[{av:'divNotificacionesdetallefiltercontainer_Class',ctrl:'NOTIFICACIONESDETALLEFILTERCONTAINER',prop:'Class'},{av:'edtavCnotificacionesdetalle_Visible',ctrl:'vCNOTIFICACIONESDETALLE',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e190E2',iparms:[{av:'A6NotificacionesId',fld:'NOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV11pNotificacionesId',fld:'vPNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cNotificacionesId',fld:'vCNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cNotificacionesFecha',fld:'vCNOTIFICACIONESFECHA',pic:'99/99/99 99:99'},{av:'AV8cNotificacionesTipo',fld:'vCNOTIFICACIONESTIPO',pic:''},{av:'AV9cNotificacionesIdNetUsuario',fld:'vCNOTIFICACIONESIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cNotificacionesDetalle',fld:'vCNOTIFICACIONESDETALLE',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cNotificacionesId',fld:'vCNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cNotificacionesFecha',fld:'vCNOTIFICACIONESFECHA',pic:'99/99/99 99:99'},{av:'AV8cNotificacionesTipo',fld:'vCNOTIFICACIONESTIPO',pic:''},{av:'AV9cNotificacionesIdNetUsuario',fld:'vCNOTIFICACIONESIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cNotificacionesDetalle',fld:'vCNOTIFICACIONESDETALLE',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cNotificacionesId',fld:'vCNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cNotificacionesFecha',fld:'vCNOTIFICACIONESFECHA',pic:'99/99/99 99:99'},{av:'AV8cNotificacionesTipo',fld:'vCNOTIFICACIONESTIPO',pic:''},{av:'AV9cNotificacionesIdNetUsuario',fld:'vCNOTIFICACIONESIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cNotificacionesDetalle',fld:'vCNOTIFICACIONESDETALLE',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cNotificacionesId',fld:'vCNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cNotificacionesFecha',fld:'vCNOTIFICACIONESFECHA',pic:'99/99/99 99:99'},{av:'AV8cNotificacionesTipo',fld:'vCNOTIFICACIONESTIPO',pic:''},{av:'AV9cNotificacionesIdNetUsuario',fld:'vCNOTIFICACIONESIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cNotificacionesDetalle',fld:'vCNOTIFICACIONESDETALLE',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_CNOTIFICACIONESFECHA","{handler:'validv_Cnotificacionesfecha',iparms:[]");
      setEventMetadata("VALIDV_CNOTIFICACIONESFECHA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Notificacionesidnetusuario',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      AV7cNotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      AV8cNotificacionesTipo = "" ;
      AV10cNotificacionesDetalle = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblnotificacionesidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblnotificacionesfechafilter_Jsonclick = "" ;
      lblLblnotificacionestipofilter_Jsonclick = "" ;
      lblLblnotificacionesidnetusuariofilter_Jsonclick = "" ;
      lblLblnotificacionesdetallefilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      A170NotificacionesTipo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cNotificacionesTipo = "" ;
      lV10cNotificacionesDetalle = "" ;
      A173NotificacionesDetalle = "" ;
      H000E2_A173NotificacionesDetalle = new String[] {""} ;
      H000E2_n173NotificacionesDetalle = new boolean[] {false} ;
      H000E2_A172NotificacionesIdNetUsuario = new long[1] ;
      H000E2_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      H000E2_A170NotificacionesTipo = new String[] {""} ;
      H000E2_n170NotificacionesTipo = new boolean[] {false} ;
      H000E2_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      H000E2_n169NotificacionesFecha = new boolean[] {false} ;
      H000E2_A6NotificacionesId = new long[1] ;
      H000E3_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gx0060__default(),
         new Object[] {
             new Object[] {
            H000E2_A173NotificacionesDetalle, H000E2_n173NotificacionesDetalle, H000E2_A172NotificacionesIdNetUsuario, H000E2_n172NotificacionesIdNetUsuario, H000E2_A170NotificacionesTipo, H000E2_n170NotificacionesTipo, H000E2_A169NotificacionesFecha, H000E2_n169NotificacionesFecha, H000E2_A6NotificacionesId
            }
            , new Object[] {
            H000E3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_64 ;
   private int nGXsfl_64_idx=1 ;
   private int subGrid1_Rows ;
   private int edtavCnotificacionesid_Enabled ;
   private int edtavCnotificacionesid_Visible ;
   private int edtavCnotificacionesfecha_Enabled ;
   private int edtavCnotificacionestipo_Visible ;
   private int edtavCnotificacionestipo_Enabled ;
   private int edtavCnotificacionesidnetusuario_Enabled ;
   private int edtavCnotificacionesidnetusuario_Visible ;
   private int edtavCnotificacionesdetalle_Visible ;
   private int edtavCnotificacionesdetalle_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV6cNotificacionesId ;
   private long AV9cNotificacionesIdNetUsuario ;
   private long AV11pNotificacionesId ;
   private long A6NotificacionesId ;
   private long A172NotificacionesIdNetUsuario ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divNotificacionesidfiltercontainer_Class ;
   private String divNotificacionesfechafiltercontainer_Class ;
   private String divNotificacionestipofiltercontainer_Class ;
   private String divNotificacionesidnetusuariofiltercontainer_Class ;
   private String divNotificacionesdetallefiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_64_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divNotificacionesidfiltercontainer_Internalname ;
   private String lblLblnotificacionesidfilter_Internalname ;
   private String lblLblnotificacionesidfilter_Jsonclick ;
   private String edtavCnotificacionesid_Internalname ;
   private String TempTags ;
   private String edtavCnotificacionesid_Jsonclick ;
   private String divNotificacionesfechafiltercontainer_Internalname ;
   private String lblLblnotificacionesfechafilter_Internalname ;
   private String lblLblnotificacionesfechafilter_Jsonclick ;
   private String edtavCnotificacionesfecha_Internalname ;
   private String edtavCnotificacionesfecha_Jsonclick ;
   private String divNotificacionestipofiltercontainer_Internalname ;
   private String lblLblnotificacionestipofilter_Internalname ;
   private String lblLblnotificacionestipofilter_Jsonclick ;
   private String edtavCnotificacionestipo_Internalname ;
   private String edtavCnotificacionestipo_Jsonclick ;
   private String divNotificacionesidnetusuariofiltercontainer_Internalname ;
   private String lblLblnotificacionesidnetusuariofilter_Internalname ;
   private String lblLblnotificacionesidnetusuariofilter_Jsonclick ;
   private String edtavCnotificacionesidnetusuario_Internalname ;
   private String edtavCnotificacionesidnetusuario_Jsonclick ;
   private String divNotificacionesdetallefiltercontainer_Internalname ;
   private String lblLblnotificacionesdetallefilter_Internalname ;
   private String lblLblnotificacionesdetallefilter_Jsonclick ;
   private String edtavCnotificacionesdetalle_Internalname ;
   private String edtavCnotificacionesdetalle_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String edtavLinkselection_Link ;
   private String edtNotificacionesFecha_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtNotificacionesId_Internalname ;
   private String edtNotificacionesFecha_Internalname ;
   private String edtNotificacionesTipo_Internalname ;
   private String edtNotificacionesIdNetUsuario_Internalname ;
   private String scmdbuf ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtNotificacionesId_Jsonclick ;
   private String edtNotificacionesFecha_Jsonclick ;
   private String edtNotificacionesTipo_Jsonclick ;
   private String edtNotificacionesIdNetUsuario_Jsonclick ;
   private java.util.Date AV7cNotificacionesFecha ;
   private java.util.Date A169NotificacionesFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean n169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n173NotificacionesDetalle ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cNotificacionesTipo ;
   private String AV10cNotificacionesDetalle ;
   private String A170NotificacionesTipo ;
   private String AV15Linkselection_GXI ;
   private String lV8cNotificacionesTipo ;
   private String lV10cNotificacionesDetalle ;
   private String A173NotificacionesDetalle ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H000E2_A173NotificacionesDetalle ;
   private boolean[] H000E2_n173NotificacionesDetalle ;
   private long[] H000E2_A172NotificacionesIdNetUsuario ;
   private boolean[] H000E2_n172NotificacionesIdNetUsuario ;
   private String[] H000E2_A170NotificacionesTipo ;
   private boolean[] H000E2_n170NotificacionesTipo ;
   private java.util.Date[] H000E2_A169NotificacionesFecha ;
   private boolean[] H000E2_n169NotificacionesFecha ;
   private long[] H000E2_A6NotificacionesId ;
   private long[] H000E3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0060__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7cNotificacionesFecha ,
                                          String AV8cNotificacionesTipo ,
                                          long AV9cNotificacionesIdNetUsuario ,
                                          String AV10cNotificacionesDetalle ,
                                          java.util.Date A169NotificacionesFecha ,
                                          String A170NotificacionesTipo ,
                                          long A172NotificacionesIdNetUsuario ,
                                          String A173NotificacionesDetalle ,
                                          long AV6cNotificacionesId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `NotificacionesDetalle`, `NotificacionesIdNetUsuario`, `NotificacionesTipo`, `NotificacionesFecha`, `NotificacionesId`" ;
      sFromString = " FROM `Notificaciones`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`NotificacionesId` >= ?)");
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cNotificacionesFecha) )
      {
         addWhere(sWhereString, "(`NotificacionesFecha` >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cNotificacionesTipo)==0) )
      {
         addWhere(sWhereString, "(`NotificacionesTipo` like ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cNotificacionesIdNetUsuario) )
      {
         addWhere(sWhereString, "(`NotificacionesIdNetUsuario` >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cNotificacionesDetalle)==0) )
      {
         addWhere(sWhereString, "(`NotificacionesDetalle` like ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `NotificacionesId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000E3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7cNotificacionesFecha ,
                                          String AV8cNotificacionesTipo ,
                                          long AV9cNotificacionesIdNetUsuario ,
                                          String AV10cNotificacionesDetalle ,
                                          java.util.Date A169NotificacionesFecha ,
                                          String A170NotificacionesTipo ,
                                          long A172NotificacionesIdNetUsuario ,
                                          String A173NotificacionesDetalle ,
                                          long AV6cNotificacionesId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[5];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Notificaciones`" ;
      addWhere(sWhereString, "(`NotificacionesId` >= ?)");
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cNotificacionesFecha) )
      {
         addWhere(sWhereString, "(`NotificacionesFecha` >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cNotificacionesTipo)==0) )
      {
         addWhere(sWhereString, "(`NotificacionesTipo` like ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cNotificacionesIdNetUsuario) )
      {
         addWhere(sWhereString, "(`NotificacionesIdNetUsuario` >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cNotificacionesDetalle)==0) )
      {
         addWhere(sWhereString, "(`NotificacionesDetalle` like ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H000E2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() );
            case 1 :
                  return conditional_H000E3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000E3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[6], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 40);
               }
               return;
      }
   }

}

