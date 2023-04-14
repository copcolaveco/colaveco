package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0010_impl extends GXDataArea
{
   public gx0010_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0010_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0010_impl.class ));
   }

   public gx0010_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "presultadoId") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "presultadoId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "presultadoId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_84 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_84"))) ;
            nGXsfl_84_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_84_idx"))) ;
            sGXsfl_84_idx = httpContext.GetPar( "sGXsfl_84_idx") ;
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
            AV6cresultadoId = GXutil.lval( httpContext.GetPar( "cresultadoId")) ;
            AV7cresultadoFicha = GXutil.lval( httpContext.GetPar( "cresultadoFicha")) ;
            AV8cresultadoComentarios = httpContext.GetPar( "cresultadoComentarios") ;
            AV9cresultadoUserId = GXutil.lval( httpContext.GetPar( "cresultadoUserId")) ;
            AV10cresultadoTypeId = GXutil.lval( httpContext.GetPar( "cresultadoTypeId")) ;
            AV11cresultadoIdNetUsuario = GXutil.lval( httpContext.GetPar( "cresultadoIdNetUsuario")) ;
            AV12cresultadoFechaCreado = localUtil.parseDateParm( httpContext.GetPar( "cresultadoFechaCreado")) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadoidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOFICHAFILTERCONTAINER_Class", GXutil.rtrim( divResultadofichafiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOCOMENTARIOSFILTERCONTAINER_Class", GXutil.rtrim( divResultadocomentariosfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOUSERIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadouseridfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOTYPEIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadotypeidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDNETUSUARIOFILTERCONTAINER_Class", GXutil.rtrim( divResultadoidnetusuariofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOFECHACREADOFILTERCONTAINER_Class", GXutil.rtrim( divResultadofechacreadofiltercontainer_Class));
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
            AV13presultadoId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13presultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13presultadoId), 18, 0));
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
      pa092( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start092( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614573792", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gx0010", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13presultadoId,18,0))}, new String[] {"presultadoId"}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOID", GXutil.ltrim( localUtil.ntoc( AV6cresultadoId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOFICHA", GXutil.ltrim( localUtil.ntoc( AV7cresultadoFicha, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOCOMENTARIOS", AV8cresultadoComentarios);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOUSERID", GXutil.ltrim( localUtil.ntoc( AV9cresultadoUserId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOTYPEID", GXutil.ltrim( localUtil.ntoc( AV10cresultadoTypeId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOIDNETUSUARIO", GXutil.ltrim( localUtil.ntoc( AV11cresultadoIdNetUsuario, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRESULTADOFECHACREADO", localUtil.format(AV12cresultadoFechaCreado, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPRESULTADOID", GXutil.ltrim( localUtil.ntoc( AV13presultadoId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadoidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOFICHAFILTERCONTAINER_Class", GXutil.rtrim( divResultadofichafiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOCOMENTARIOSFILTERCONTAINER_Class", GXutil.rtrim( divResultadocomentariosfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOUSERIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadouseridfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOTYPEIDFILTERCONTAINER_Class", GXutil.rtrim( divResultadotypeidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDNETUSUARIOFILTERCONTAINER_Class", GXutil.rtrim( divResultadoidnetusuariofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOFECHACREADOFILTERCONTAINER_Class", GXutil.rtrim( divResultadofechacreadofiltercontainer_Class));
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
         we092( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt092( ) ;
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
      return formatLink("com.colaveco.gx0010", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13presultadoId,18,0))}, new String[] {"presultadoId"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0010" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Resultado" ;
   }

   public void wb090( )
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadoidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadoidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadoidfilter_Internalname, "resultado Id", "", "", lblLblresultadoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadoid_Internalname, "resultado Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cresultadoId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCresultadoid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cresultadoId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cresultadoId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadoid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadoid_Visible, edtavCresultadoid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadofichafiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadofichafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadofichafilter_Internalname, "resultado Ficha", "", "", lblLblresultadofichafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadoficha_Internalname, "resultado Ficha", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadoficha_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cresultadoFicha, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCresultadoficha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7cresultadoFicha), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7cresultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadoficha_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadoficha_Visible, edtavCresultadoficha_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadocomentariosfiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadocomentariosfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadocomentariosfilter_Internalname, "resultado Comentarios", "", "", lblLblresultadocomentariosfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadocomentarios_Internalname, "resultado Comentarios", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadocomentarios_Internalname, AV8cresultadoComentarios, GXutil.rtrim( localUtil.format( AV8cresultadoComentarios, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadocomentarios_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadocomentarios_Visible, edtavCresultadocomentarios_Enabled, 0, "text", "", 45, "chr", 1, "row", 45, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadouseridfiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadouseridfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadouseridfilter_Internalname, "resultado User Id", "", "", lblLblresultadouseridfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadouserid_Internalname, "resultado User Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadouserid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cresultadoUserId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCresultadouserid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9cresultadoUserId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9cresultadoUserId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadouserid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadouserid_Visible, edtavCresultadouserid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadotypeidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadotypeidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadotypeidfilter_Internalname, "resultado Type Id", "", "", lblLblresultadotypeidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadotypeid_Internalname, "resultado Type Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadotypeid_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cresultadoTypeId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCresultadotypeid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10cresultadoTypeId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10cresultadoTypeId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadotypeid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadotypeid_Visible, edtavCresultadotypeid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadoidnetusuariofiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadoidnetusuariofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadoidnetusuariofilter_Internalname, "resultado Id Net Usuario", "", "", lblLblresultadoidnetusuariofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16091_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadoidnetusuario_Internalname, "resultado Id Net Usuario", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadoidnetusuario_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cresultadoIdNetUsuario, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCresultadoidnetusuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11cresultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11cresultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadoidnetusuario_Jsonclick, 0, "Attribute", "", "", "", "", edtavCresultadoidnetusuario_Visible, edtavCresultadoidnetusuario_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divResultadofechacreadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divResultadofechacreadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblresultadofechacreadofilter_Internalname, "resultado Fecha Creado", "", "", lblLblresultadofechacreadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17091_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCresultadofechacreado_Internalname, "resultado Fecha Creado", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCresultadofechacreado_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCresultadofechacreado_Internalname, localUtil.format(AV12cresultadoFechaCreado, "99/99/99"), localUtil.format( AV12cresultadoFechaCreado, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCresultadofechacreado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCresultadofechacreado_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0010.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18091_client"+"'", TempTags, "", 2, "HLP_Gx0010.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
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
            httpContext.writeValue( "Ficha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Comentarios") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "User Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Type Id") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtresultadoFicha_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A8resultadoComentarios);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9resultadoUserId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10resultadoTypeId, (byte)(18), (byte)(0), ".", "")));
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
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (int)(nGXsfl_84_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0010.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 84 )
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

   public void start092( )
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
         Form.getMeta().addItem("description", "Selection List Resultado", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup090( ) ;
   }

   public void ws092( )
   {
      start092( ) ;
      evt092( ) ;
   }

   public void evt092( )
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
                           nGXsfl_84_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A1resultadoId = localUtil.ctol( httpContext.cgiGet( edtresultadoId_Internalname), ".", ",") ;
                           A7resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") ;
                           n7resultadoFicha = false ;
                           A8resultadoComentarios = httpContext.cgiGet( edtresultadoComentarios_Internalname) ;
                           n8resultadoComentarios = false ;
                           A9resultadoUserId = localUtil.ctol( httpContext.cgiGet( edtresultadoUserId_Internalname), ".", ",") ;
                           n9resultadoUserId = false ;
                           A10resultadoTypeId = localUtil.ctol( httpContext.cgiGet( edtresultadoTypeId_Internalname), ".", ",") ;
                           n10resultadoTypeId = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19092 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20092 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cresultadoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOID"), ".", ",") != AV6cresultadoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadoficha Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOFICHA"), ".", ",") != AV7cresultadoFicha )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadocomentarios Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRESULTADOCOMENTARIOS"), AV8cresultadoComentarios) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadouserid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOUSERID"), ".", ",") != AV9cresultadoUserId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadotypeid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOTYPEID"), ".", ",") != AV10cresultadoTypeId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadoidnetusuario Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOIDNETUSUARIO"), ".", ",") != AV11cresultadoIdNetUsuario )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cresultadofechacreado Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRESULTADOFECHACREADO"), 0), AV12cresultadoFechaCreado) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21092 ();
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

   public void we092( )
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

   public void pa092( )
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cresultadoId ,
                                  long AV7cresultadoFicha ,
                                  String AV8cresultadoComentarios ,
                                  long AV9cresultadoUserId ,
                                  long AV10cresultadoTypeId ,
                                  long AV11cresultadoIdNetUsuario ,
                                  java.util.Date AV12cresultadoFechaCreado )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf092( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOID", GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")));
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
      rf092( ) ;
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

   public void rf092( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = 1 ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Long.valueOf(AV7cresultadoFicha) ,
                                              AV8cresultadoComentarios ,
                                              Long.valueOf(AV9cresultadoUserId) ,
                                              Long.valueOf(AV10cresultadoTypeId) ,
                                              Long.valueOf(AV11cresultadoIdNetUsuario) ,
                                              AV12cresultadoFechaCreado ,
                                              Long.valueOf(A7resultadoFicha) ,
                                              A8resultadoComentarios ,
                                              Long.valueOf(A9resultadoUserId) ,
                                              Long.valueOf(A10resultadoTypeId) ,
                                              Long.valueOf(A11resultadoIdNetUsuario) ,
                                              A12resultadoFechaCreado ,
                                              Long.valueOf(AV6cresultadoId) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         lV8cresultadoComentarios = GXutil.concat( GXutil.rtrim( AV8cresultadoComentarios), "%", "") ;
         /* Using cursor H00092 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6cresultadoId), Long.valueOf(AV7cresultadoFicha), lV8cresultadoComentarios, Long.valueOf(AV9cresultadoUserId), Long.valueOf(AV10cresultadoTypeId), Long.valueOf(AV11cresultadoIdNetUsuario), AV12cresultadoFechaCreado, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_84_idx = 1 ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A12resultadoFechaCreado = H00092_A12resultadoFechaCreado[0] ;
            n12resultadoFechaCreado = H00092_n12resultadoFechaCreado[0] ;
            A11resultadoIdNetUsuario = H00092_A11resultadoIdNetUsuario[0] ;
            n11resultadoIdNetUsuario = H00092_n11resultadoIdNetUsuario[0] ;
            A10resultadoTypeId = H00092_A10resultadoTypeId[0] ;
            n10resultadoTypeId = H00092_n10resultadoTypeId[0] ;
            A9resultadoUserId = H00092_A9resultadoUserId[0] ;
            n9resultadoUserId = H00092_n9resultadoUserId[0] ;
            A8resultadoComentarios = H00092_A8resultadoComentarios[0] ;
            n8resultadoComentarios = H00092_n8resultadoComentarios[0] ;
            A7resultadoFicha = H00092_A7resultadoFicha[0] ;
            n7resultadoFicha = H00092_n7resultadoFicha[0] ;
            A1resultadoId = H00092_A1resultadoId[0] ;
            /* Execute user event: Load */
            e20092 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb090( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes092( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9")));
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
                                           Long.valueOf(AV7cresultadoFicha) ,
                                           AV8cresultadoComentarios ,
                                           Long.valueOf(AV9cresultadoUserId) ,
                                           Long.valueOf(AV10cresultadoTypeId) ,
                                           Long.valueOf(AV11cresultadoIdNetUsuario) ,
                                           AV12cresultadoFechaCreado ,
                                           Long.valueOf(A7resultadoFicha) ,
                                           A8resultadoComentarios ,
                                           Long.valueOf(A9resultadoUserId) ,
                                           Long.valueOf(A10resultadoTypeId) ,
                                           Long.valueOf(A11resultadoIdNetUsuario) ,
                                           A12resultadoFechaCreado ,
                                           Long.valueOf(AV6cresultadoId) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV8cresultadoComentarios = GXutil.concat( GXutil.rtrim( AV8cresultadoComentarios), "%", "") ;
      /* Using cursor H00093 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV6cresultadoId), Long.valueOf(AV7cresultadoFicha), lV8cresultadoComentarios, Long.valueOf(AV9cresultadoUserId), Long.valueOf(AV10cresultadoTypeId), Long.valueOf(AV11cresultadoIdNetUsuario), AV12cresultadoFechaCreado});
      GRID1_nRecordCount = H00093_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cresultadoId, AV7cresultadoFicha, AV8cresultadoComentarios, AV9cresultadoUserId, AV10cresultadoTypeId, AV11cresultadoIdNetUsuario, AV12cresultadoFechaCreado) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup090( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19092 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_84 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRESULTADOID");
            GX_FocusControl = edtavCresultadoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cresultadoId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cresultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cresultadoId), 18, 0));
         }
         else
         {
            AV6cresultadoId = localUtil.ctol( httpContext.cgiGet( edtavCresultadoid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cresultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cresultadoId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoficha_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoficha_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRESULTADOFICHA");
            GX_FocusControl = edtavCresultadoficha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cresultadoFicha = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cresultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cresultadoFicha), 18, 0));
         }
         else
         {
            AV7cresultadoFicha = localUtil.ctol( httpContext.cgiGet( edtavCresultadoficha_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cresultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cresultadoFicha), 18, 0));
         }
         AV8cresultadoComentarios = httpContext.cgiGet( edtavCresultadocomentarios_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cresultadoComentarios", AV8cresultadoComentarios);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadouserid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadouserid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRESULTADOUSERID");
            GX_FocusControl = edtavCresultadouserid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cresultadoUserId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cresultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9cresultadoUserId), 18, 0));
         }
         else
         {
            AV9cresultadoUserId = localUtil.ctol( httpContext.cgiGet( edtavCresultadouserid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cresultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9cresultadoUserId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadotypeid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadotypeid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRESULTADOTYPEID");
            GX_FocusControl = edtavCresultadotypeid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cresultadoTypeId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cresultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10cresultadoTypeId), 18, 0));
         }
         else
         {
            AV10cresultadoTypeId = localUtil.ctol( httpContext.cgiGet( edtavCresultadotypeid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cresultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10cresultadoTypeId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoidnetusuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCresultadoidnetusuario_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRESULTADOIDNETUSUARIO");
            GX_FocusControl = edtavCresultadoidnetusuario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cresultadoIdNetUsuario = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cresultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11cresultadoIdNetUsuario), 18, 0));
         }
         else
         {
            AV11cresultadoIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtavCresultadoidnetusuario_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cresultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11cresultadoIdNetUsuario), 18, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCresultadofechacreado_Internalname), (byte)(2)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCRESULTADOFECHACREADO");
            GX_FocusControl = edtavCresultadofechacreado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cresultadoFechaCreado = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cresultadoFechaCreado", localUtil.format(AV12cresultadoFechaCreado, "99/99/99"));
         }
         else
         {
            AV12cresultadoFechaCreado = localUtil.ctod( httpContext.cgiGet( edtavCresultadofechacreado_Internalname), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cresultadoFechaCreado", localUtil.format(AV12cresultadoFechaCreado, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOID"), ".", ",") != AV6cresultadoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOFICHA"), ".", ",") != AV7cresultadoFicha )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRESULTADOCOMENTARIOS"), AV8cresultadoComentarios) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOUSERID"), ".", ",") != AV9cresultadoUserId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOTYPEID"), ".", ",") != AV10cresultadoTypeId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRESULTADOIDNETUSUARIO"), ".", ",") != AV11cresultadoIdNetUsuario )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vCRESULTADOFECHACREADO"), 2)), GXutil.resetTime(AV12cresultadoFechaCreado)) ) )
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
      e19092 ();
      if (returnInSub) return;
   }

   public void e19092( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "Resultado", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20092( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e21092 ();
      if (returnInSub) return;
   }

   public void e21092( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV13presultadoId = A1resultadoId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13presultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13presultadoId), 18, 0));
      httpContext.setWebReturnParms(new Object[] {Long.valueOf(AV13presultadoId)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV13presultadoId"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13presultadoId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13presultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13presultadoId), 18, 0));
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
      pa092( ) ;
      ws092( ) ;
      we092( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614574017", true, true);
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
      httpContext.AddJavascriptSource("gx0010.js", "?202312614574017", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtresultadoId_Internalname = "RESULTADOID_"+sGXsfl_84_idx ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_84_idx ;
      edtresultadoComentarios_Internalname = "RESULTADOCOMENTARIOS_"+sGXsfl_84_idx ;
      edtresultadoUserId_Internalname = "RESULTADOUSERID_"+sGXsfl_84_idx ;
      edtresultadoTypeId_Internalname = "RESULTADOTYPEID_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtresultadoId_Internalname = "RESULTADOID_"+sGXsfl_84_fel_idx ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_84_fel_idx ;
      edtresultadoComentarios_Internalname = "RESULTADOCOMENTARIOS_"+sGXsfl_84_fel_idx ;
      edtresultadoUserId_Internalname = "RESULTADOUSERID_"+sGXsfl_84_fel_idx ;
      edtresultadoTypeId_Internalname = "RESULTADOTYPEID_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb090( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoId_Internalname,GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtresultadoFicha_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtresultadoFicha_Internalname, "Link", edtresultadoFicha_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoFicha_Internalname,GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'",edtresultadoFicha_Link,"","","",edtresultadoFicha_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoComentarios_Internalname,A8resultadoComentarios,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoComentarios_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoUserId_Internalname,GXutil.ltrim( localUtil.ntoc( A9resultadoUserId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9resultadoUserId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoUserId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoTypeId_Internalname,GXutil.ltrim( localUtil.ntoc( A10resultadoTypeId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10resultadoTypeId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoTypeId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes092( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblresultadoidfilter_Internalname = "LBLRESULTADOIDFILTER" ;
      edtavCresultadoid_Internalname = "vCRESULTADOID" ;
      divResultadoidfiltercontainer_Internalname = "RESULTADOIDFILTERCONTAINER" ;
      lblLblresultadofichafilter_Internalname = "LBLRESULTADOFICHAFILTER" ;
      edtavCresultadoficha_Internalname = "vCRESULTADOFICHA" ;
      divResultadofichafiltercontainer_Internalname = "RESULTADOFICHAFILTERCONTAINER" ;
      lblLblresultadocomentariosfilter_Internalname = "LBLRESULTADOCOMENTARIOSFILTER" ;
      edtavCresultadocomentarios_Internalname = "vCRESULTADOCOMENTARIOS" ;
      divResultadocomentariosfiltercontainer_Internalname = "RESULTADOCOMENTARIOSFILTERCONTAINER" ;
      lblLblresultadouseridfilter_Internalname = "LBLRESULTADOUSERIDFILTER" ;
      edtavCresultadouserid_Internalname = "vCRESULTADOUSERID" ;
      divResultadouseridfiltercontainer_Internalname = "RESULTADOUSERIDFILTERCONTAINER" ;
      lblLblresultadotypeidfilter_Internalname = "LBLRESULTADOTYPEIDFILTER" ;
      edtavCresultadotypeid_Internalname = "vCRESULTADOTYPEID" ;
      divResultadotypeidfiltercontainer_Internalname = "RESULTADOTYPEIDFILTERCONTAINER" ;
      lblLblresultadoidnetusuariofilter_Internalname = "LBLRESULTADOIDNETUSUARIOFILTER" ;
      edtavCresultadoidnetusuario_Internalname = "vCRESULTADOIDNETUSUARIO" ;
      divResultadoidnetusuariofiltercontainer_Internalname = "RESULTADOIDNETUSUARIOFILTERCONTAINER" ;
      lblLblresultadofechacreadofilter_Internalname = "LBLRESULTADOFECHACREADOFILTER" ;
      edtavCresultadofechacreado_Internalname = "vCRESULTADOFECHACREADO" ;
      divResultadofechacreadofiltercontainer_Internalname = "RESULTADOFECHACREADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtresultadoId_Internalname = "RESULTADOID" ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA" ;
      edtresultadoComentarios_Internalname = "RESULTADOCOMENTARIOS" ;
      edtresultadoUserId_Internalname = "RESULTADOUSERID" ;
      edtresultadoTypeId_Internalname = "RESULTADOTYPEID" ;
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
      edtresultadoTypeId_Jsonclick = "" ;
      edtresultadoUserId_Jsonclick = "" ;
      edtresultadoComentarios_Jsonclick = "" ;
      edtresultadoFicha_Jsonclick = "" ;
      edtresultadoId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtresultadoFicha_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Header = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCresultadofechacreado_Jsonclick = "" ;
      edtavCresultadofechacreado_Enabled = 1 ;
      edtavCresultadoidnetusuario_Jsonclick = "" ;
      edtavCresultadoidnetusuario_Enabled = 1 ;
      edtavCresultadoidnetusuario_Visible = 1 ;
      edtavCresultadotypeid_Jsonclick = "" ;
      edtavCresultadotypeid_Enabled = 1 ;
      edtavCresultadotypeid_Visible = 1 ;
      edtavCresultadouserid_Jsonclick = "" ;
      edtavCresultadouserid_Enabled = 1 ;
      edtavCresultadouserid_Visible = 1 ;
      edtavCresultadocomentarios_Jsonclick = "" ;
      edtavCresultadocomentarios_Enabled = 1 ;
      edtavCresultadocomentarios_Visible = 1 ;
      edtavCresultadoficha_Jsonclick = "" ;
      edtavCresultadoficha_Enabled = 1 ;
      edtavCresultadoficha_Visible = 1 ;
      edtavCresultadoid_Jsonclick = "" ;
      edtavCresultadoid_Enabled = 1 ;
      edtavCresultadoid_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Resultado" );
      divResultadofechacreadofiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadoidnetusuariofiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadotypeidfiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadouseridfiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadocomentariosfiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadofichafiltercontainer_Class = "AdvancedContainerItem" ;
      divResultadoidfiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cresultadoId',fld:'vCRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cresultadoFicha',fld:'vCRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cresultadoComentarios',fld:'vCRESULTADOCOMENTARIOS',pic:''},{av:'AV9cresultadoUserId',fld:'vCRESULTADOUSERID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cresultadoTypeId',fld:'vCRESULTADOTYPEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11cresultadoIdNetUsuario',fld:'vCRESULTADOIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cresultadoFechaCreado',fld:'vCRESULTADOFECHACREADO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18091',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLRESULTADOIDFILTER.CLICK","{handler:'e11091',iparms:[{av:'divResultadoidfiltercontainer_Class',ctrl:'RESULTADOIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOIDFILTER.CLICK",",oparms:[{av:'divResultadoidfiltercontainer_Class',ctrl:'RESULTADOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadoid_Visible',ctrl:'vCRESULTADOID',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOFICHAFILTER.CLICK","{handler:'e12091',iparms:[{av:'divResultadofichafiltercontainer_Class',ctrl:'RESULTADOFICHAFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOFICHAFILTER.CLICK",",oparms:[{av:'divResultadofichafiltercontainer_Class',ctrl:'RESULTADOFICHAFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadoficha_Visible',ctrl:'vCRESULTADOFICHA',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOCOMENTARIOSFILTER.CLICK","{handler:'e13091',iparms:[{av:'divResultadocomentariosfiltercontainer_Class',ctrl:'RESULTADOCOMENTARIOSFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOCOMENTARIOSFILTER.CLICK",",oparms:[{av:'divResultadocomentariosfiltercontainer_Class',ctrl:'RESULTADOCOMENTARIOSFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadocomentarios_Visible',ctrl:'vCRESULTADOCOMENTARIOS',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOUSERIDFILTER.CLICK","{handler:'e14091',iparms:[{av:'divResultadouseridfiltercontainer_Class',ctrl:'RESULTADOUSERIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOUSERIDFILTER.CLICK",",oparms:[{av:'divResultadouseridfiltercontainer_Class',ctrl:'RESULTADOUSERIDFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadouserid_Visible',ctrl:'vCRESULTADOUSERID',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOTYPEIDFILTER.CLICK","{handler:'e15091',iparms:[{av:'divResultadotypeidfiltercontainer_Class',ctrl:'RESULTADOTYPEIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOTYPEIDFILTER.CLICK",",oparms:[{av:'divResultadotypeidfiltercontainer_Class',ctrl:'RESULTADOTYPEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadotypeid_Visible',ctrl:'vCRESULTADOTYPEID',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOIDNETUSUARIOFILTER.CLICK","{handler:'e16091',iparms:[{av:'divResultadoidnetusuariofiltercontainer_Class',ctrl:'RESULTADOIDNETUSUARIOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOIDNETUSUARIOFILTER.CLICK",",oparms:[{av:'divResultadoidnetusuariofiltercontainer_Class',ctrl:'RESULTADOIDNETUSUARIOFILTERCONTAINER',prop:'Class'},{av:'edtavCresultadoidnetusuario_Visible',ctrl:'vCRESULTADOIDNETUSUARIO',prop:'Visible'}]}");
      setEventMetadata("LBLRESULTADOFECHACREADOFILTER.CLICK","{handler:'e17091',iparms:[{av:'divResultadofechacreadofiltercontainer_Class',ctrl:'RESULTADOFECHACREADOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLRESULTADOFECHACREADOFILTER.CLICK",",oparms:[{av:'divResultadofechacreadofiltercontainer_Class',ctrl:'RESULTADOFECHACREADOFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e21092',iparms:[{av:'A1resultadoId',fld:'RESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV13presultadoId',fld:'vPRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cresultadoId',fld:'vCRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cresultadoFicha',fld:'vCRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cresultadoComentarios',fld:'vCRESULTADOCOMENTARIOS',pic:''},{av:'AV9cresultadoUserId',fld:'vCRESULTADOUSERID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cresultadoTypeId',fld:'vCRESULTADOTYPEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11cresultadoIdNetUsuario',fld:'vCRESULTADOIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cresultadoFechaCreado',fld:'vCRESULTADOFECHACREADO',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cresultadoId',fld:'vCRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cresultadoFicha',fld:'vCRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cresultadoComentarios',fld:'vCRESULTADOCOMENTARIOS',pic:''},{av:'AV9cresultadoUserId',fld:'vCRESULTADOUSERID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cresultadoTypeId',fld:'vCRESULTADOTYPEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11cresultadoIdNetUsuario',fld:'vCRESULTADOIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cresultadoFechaCreado',fld:'vCRESULTADOFECHACREADO',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cresultadoId',fld:'vCRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cresultadoFicha',fld:'vCRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cresultadoComentarios',fld:'vCRESULTADOCOMENTARIOS',pic:''},{av:'AV9cresultadoUserId',fld:'vCRESULTADOUSERID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cresultadoTypeId',fld:'vCRESULTADOTYPEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11cresultadoIdNetUsuario',fld:'vCRESULTADOIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cresultadoFechaCreado',fld:'vCRESULTADOFECHACREADO',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cresultadoId',fld:'vCRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cresultadoFicha',fld:'vCRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cresultadoComentarios',fld:'vCRESULTADOCOMENTARIOS',pic:''},{av:'AV9cresultadoUserId',fld:'vCRESULTADOUSERID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV10cresultadoTypeId',fld:'vCRESULTADOTYPEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11cresultadoIdNetUsuario',fld:'vCRESULTADOIDNETUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cresultadoFechaCreado',fld:'vCRESULTADOFECHACREADO',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_CRESULTADOFECHACREADO","{handler:'validv_Cresultadofechacreado',iparms:[]");
      setEventMetadata("VALIDV_CRESULTADOFECHACREADO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Resultadotypeid',iparms:[]");
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
      AV8cresultadoComentarios = "" ;
      AV12cresultadoFechaCreado = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblresultadoidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblresultadofichafilter_Jsonclick = "" ;
      lblLblresultadocomentariosfilter_Jsonclick = "" ;
      lblLblresultadouseridfilter_Jsonclick = "" ;
      lblLblresultadotypeidfilter_Jsonclick = "" ;
      lblLblresultadoidnetusuariofilter_Jsonclick = "" ;
      lblLblresultadofechacreadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A8resultadoComentarios = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cresultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      H00092_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      H00092_n12resultadoFechaCreado = new boolean[] {false} ;
      H00092_A11resultadoIdNetUsuario = new long[1] ;
      H00092_n11resultadoIdNetUsuario = new boolean[] {false} ;
      H00092_A10resultadoTypeId = new long[1] ;
      H00092_n10resultadoTypeId = new boolean[] {false} ;
      H00092_A9resultadoUserId = new long[1] ;
      H00092_n9resultadoUserId = new boolean[] {false} ;
      H00092_A8resultadoComentarios = new String[] {""} ;
      H00092_n8resultadoComentarios = new boolean[] {false} ;
      H00092_A7resultadoFicha = new long[1] ;
      H00092_n7resultadoFicha = new boolean[] {false} ;
      H00092_A1resultadoId = new long[1] ;
      H00093_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gx0010__default(),
         new Object[] {
             new Object[] {
            H00092_A12resultadoFechaCreado, H00092_n12resultadoFechaCreado, H00092_A11resultadoIdNetUsuario, H00092_n11resultadoIdNetUsuario, H00092_A10resultadoTypeId, H00092_n10resultadoTypeId, H00092_A9resultadoUserId, H00092_n9resultadoUserId, H00092_A8resultadoComentarios, H00092_n8resultadoComentarios,
            H00092_A7resultadoFicha, H00092_n7resultadoFicha, H00092_A1resultadoId
            }
            , new Object[] {
            H00093_AGRID1_nRecordCount
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
   private int nRC_GXsfl_84 ;
   private int nGXsfl_84_idx=1 ;
   private int subGrid1_Rows ;
   private int edtavCresultadoid_Enabled ;
   private int edtavCresultadoid_Visible ;
   private int edtavCresultadoficha_Enabled ;
   private int edtavCresultadoficha_Visible ;
   private int edtavCresultadocomentarios_Visible ;
   private int edtavCresultadocomentarios_Enabled ;
   private int edtavCresultadouserid_Enabled ;
   private int edtavCresultadouserid_Visible ;
   private int edtavCresultadotypeid_Enabled ;
   private int edtavCresultadotypeid_Visible ;
   private int edtavCresultadoidnetusuario_Enabled ;
   private int edtavCresultadoidnetusuario_Visible ;
   private int edtavCresultadofechacreado_Enabled ;
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
   private long AV6cresultadoId ;
   private long AV7cresultadoFicha ;
   private long AV9cresultadoUserId ;
   private long AV10cresultadoTypeId ;
   private long AV11cresultadoIdNetUsuario ;
   private long AV13presultadoId ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long GRID1_nCurrentRecord ;
   private long A11resultadoIdNetUsuario ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divResultadoidfiltercontainer_Class ;
   private String divResultadofichafiltercontainer_Class ;
   private String divResultadocomentariosfiltercontainer_Class ;
   private String divResultadouseridfiltercontainer_Class ;
   private String divResultadotypeidfiltercontainer_Class ;
   private String divResultadoidnetusuariofiltercontainer_Class ;
   private String divResultadofechacreadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divResultadoidfiltercontainer_Internalname ;
   private String lblLblresultadoidfilter_Internalname ;
   private String lblLblresultadoidfilter_Jsonclick ;
   private String edtavCresultadoid_Internalname ;
   private String TempTags ;
   private String edtavCresultadoid_Jsonclick ;
   private String divResultadofichafiltercontainer_Internalname ;
   private String lblLblresultadofichafilter_Internalname ;
   private String lblLblresultadofichafilter_Jsonclick ;
   private String edtavCresultadoficha_Internalname ;
   private String edtavCresultadoficha_Jsonclick ;
   private String divResultadocomentariosfiltercontainer_Internalname ;
   private String lblLblresultadocomentariosfilter_Internalname ;
   private String lblLblresultadocomentariosfilter_Jsonclick ;
   private String edtavCresultadocomentarios_Internalname ;
   private String edtavCresultadocomentarios_Jsonclick ;
   private String divResultadouseridfiltercontainer_Internalname ;
   private String lblLblresultadouseridfilter_Internalname ;
   private String lblLblresultadouseridfilter_Jsonclick ;
   private String edtavCresultadouserid_Internalname ;
   private String edtavCresultadouserid_Jsonclick ;
   private String divResultadotypeidfiltercontainer_Internalname ;
   private String lblLblresultadotypeidfilter_Internalname ;
   private String lblLblresultadotypeidfilter_Jsonclick ;
   private String edtavCresultadotypeid_Internalname ;
   private String edtavCresultadotypeid_Jsonclick ;
   private String divResultadoidnetusuariofiltercontainer_Internalname ;
   private String lblLblresultadoidnetusuariofilter_Internalname ;
   private String lblLblresultadoidnetusuariofilter_Jsonclick ;
   private String edtavCresultadoidnetusuario_Internalname ;
   private String edtavCresultadoidnetusuario_Jsonclick ;
   private String divResultadofechacreadofiltercontainer_Internalname ;
   private String lblLblresultadofechacreadofilter_Internalname ;
   private String lblLblresultadofechacreadofilter_Jsonclick ;
   private String edtavCresultadofechacreado_Internalname ;
   private String edtavCresultadofechacreado_Jsonclick ;
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
   private String edtresultadoFicha_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtresultadoId_Internalname ;
   private String edtresultadoFicha_Internalname ;
   private String edtresultadoComentarios_Internalname ;
   private String edtresultadoUserId_Internalname ;
   private String edtresultadoTypeId_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtresultadoId_Jsonclick ;
   private String edtresultadoFicha_Jsonclick ;
   private String edtresultadoComentarios_Jsonclick ;
   private String edtresultadoUserId_Jsonclick ;
   private String edtresultadoTypeId_Jsonclick ;
   private java.util.Date AV12cresultadoFechaCreado ;
   private java.util.Date A12resultadoFechaCreado ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n7resultadoFicha ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n12resultadoFechaCreado ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cresultadoComentarios ;
   private String A8resultadoComentarios ;
   private String AV17Linkselection_GXI ;
   private String lV8cresultadoComentarios ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00092_A12resultadoFechaCreado ;
   private boolean[] H00092_n12resultadoFechaCreado ;
   private long[] H00092_A11resultadoIdNetUsuario ;
   private boolean[] H00092_n11resultadoIdNetUsuario ;
   private long[] H00092_A10resultadoTypeId ;
   private boolean[] H00092_n10resultadoTypeId ;
   private long[] H00092_A9resultadoUserId ;
   private boolean[] H00092_n9resultadoUserId ;
   private String[] H00092_A8resultadoComentarios ;
   private boolean[] H00092_n8resultadoComentarios ;
   private long[] H00092_A7resultadoFicha ;
   private boolean[] H00092_n7resultadoFicha ;
   private long[] H00092_A1resultadoId ;
   private long[] H00093_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00092( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV7cresultadoFicha ,
                                          String AV8cresultadoComentarios ,
                                          long AV9cresultadoUserId ,
                                          long AV10cresultadoTypeId ,
                                          long AV11cresultadoIdNetUsuario ,
                                          java.util.Date AV12cresultadoFechaCreado ,
                                          long A7resultadoFicha ,
                                          String A8resultadoComentarios ,
                                          long A9resultadoUserId ,
                                          long A10resultadoTypeId ,
                                          long A11resultadoIdNetUsuario ,
                                          java.util.Date A12resultadoFechaCreado ,
                                          long AV6cresultadoId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `resultadoFechaCreado`, `resultadoIdNetUsuario`, `resultadoTypeId`, `resultadoUserId`, `resultadoComentarios`, `resultadoFicha`, `resultadoId`" ;
      sFromString = " FROM `Resultado`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`resultadoId` >= ?)");
      if ( ! (0==AV7cresultadoFicha) )
      {
         addWhere(sWhereString, "(`resultadoFicha` >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cresultadoComentarios)==0) )
      {
         addWhere(sWhereString, "(`resultadoComentarios` like ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cresultadoUserId) )
      {
         addWhere(sWhereString, "(`resultadoUserId` >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cresultadoTypeId) )
      {
         addWhere(sWhereString, "(`resultadoTypeId` >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cresultadoIdNetUsuario) )
      {
         addWhere(sWhereString, "(`resultadoIdNetUsuario` >= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12cresultadoFechaCreado)) )
      {
         addWhere(sWhereString, "(`resultadoFechaCreado` >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `resultadoId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00093( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV7cresultadoFicha ,
                                          String AV8cresultadoComentarios ,
                                          long AV9cresultadoUserId ,
                                          long AV10cresultadoTypeId ,
                                          long AV11cresultadoIdNetUsuario ,
                                          java.util.Date AV12cresultadoFechaCreado ,
                                          long A7resultadoFicha ,
                                          String A8resultadoComentarios ,
                                          long A9resultadoUserId ,
                                          long A10resultadoTypeId ,
                                          long A11resultadoIdNetUsuario ,
                                          java.util.Date A12resultadoFechaCreado ,
                                          long AV6cresultadoId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Resultado`" ;
      addWhere(sWhereString, "(`resultadoId` >= ?)");
      if ( ! (0==AV7cresultadoFicha) )
      {
         addWhere(sWhereString, "(`resultadoFicha` >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cresultadoComentarios)==0) )
      {
         addWhere(sWhereString, "(`resultadoComentarios` like ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cresultadoUserId) )
      {
         addWhere(sWhereString, "(`resultadoUserId` >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cresultadoTypeId) )
      {
         addWhere(sWhereString, "(`resultadoTypeId` >= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cresultadoIdNetUsuario) )
      {
         addWhere(sWhereString, "(`resultadoIdNetUsuario` >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12cresultadoFechaCreado)) )
      {
         addWhere(sWhereString, "(`resultadoFechaCreado` >= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
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
                  return conditional_H00092(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H00093(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00092", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00093", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
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
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 45);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 45);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
      }
   }

}

