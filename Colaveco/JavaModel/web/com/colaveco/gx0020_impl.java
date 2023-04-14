package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0020_impl extends GXDataArea
{
   public gx0020_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0020_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0020_impl.class ));
   }

   public gx0020_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "pFMId") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "pFMId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pFMId") ;
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
            AV6cFMId = GXutil.lval( httpContext.GetPar( "cFMId")) ;
            AV7cFMIdNetMovimiento = GXutil.lval( httpContext.GetPar( "cFMIdNetMovimiento")) ;
            AV8cFMFechaEmision = localUtil.parseDTimeParm( httpContext.GetPar( "cFMFechaEmision")) ;
            AV9cFMFechaVencimiento = localUtil.parseDTimeParm( httpContext.GetPar( "cFMFechaVencimiento")) ;
            AV10cFMTipo = httpContext.GetPar( "cFMTipo") ;
            AV11cFMNumero = GXutil.lval( httpContext.GetPar( "cFMNumero")) ;
            AV12cFMImporte = GXutil.lval( httpContext.GetPar( "cFMImporte")) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIDFILTERCONTAINER_Class", GXutil.rtrim( divFmidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIDNETMOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divFmidnetmovimientofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMFECHAEMISIONFILTERCONTAINER_Class", GXutil.rtrim( divFmfechaemisionfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMFECHAVENCIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divFmfechavencimientofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMTIPOFILTERCONTAINER_Class", GXutil.rtrim( divFmtipofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMNUMEROFILTERCONTAINER_Class", GXutil.rtrim( divFmnumerofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIMPORTEFILTERCONTAINER_Class", GXutil.rtrim( divFmimportefiltercontainer_Class));
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
            AV13pFMId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pFMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pFMId), 18, 0));
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
      pa0A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0A2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614574868", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gx0020", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13pFMId,18,0))}, new String[] {"pFMId"}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMID", GXutil.ltrim( localUtil.ntoc( AV6cFMId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMIDNETMOVIMIENTO", GXutil.ltrim( localUtil.ntoc( AV7cFMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMFECHAEMISION", localUtil.ttoc( AV8cFMFechaEmision, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMFECHAVENCIMIENTO", localUtil.ttoc( AV9cFMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMTIPO", AV10cFMTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMNUMERO", GXutil.ltrim( localUtil.ntoc( AV11cFMNumero, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCFMIMPORTE", GXutil.ltrim( localUtil.ntoc( AV12cFMImporte, (byte)(18), (byte)(0), ".", "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPFMID", GXutil.ltrim( localUtil.ntoc( AV13pFMId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIDFILTERCONTAINER_Class", GXutil.rtrim( divFmidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIDNETMOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divFmidnetmovimientofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMFECHAEMISIONFILTERCONTAINER_Class", GXutil.rtrim( divFmfechaemisionfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMFECHAVENCIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divFmfechavencimientofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMTIPOFILTERCONTAINER_Class", GXutil.rtrim( divFmtipofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMNUMEROFILTERCONTAINER_Class", GXutil.rtrim( divFmnumerofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMIMPORTEFILTERCONTAINER_Class", GXutil.rtrim( divFmimportefiltercontainer_Class));
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
         we0A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0A2( ) ;
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
      return formatLink("com.colaveco.gx0020", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13pFMId,18,0))}, new String[] {"pFMId"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0020" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Factura Movimiento" ;
   }

   public void wb0A0( )
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmidfilter_Internalname, "FMId", "", "", lblLblfmidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmid_Internalname, "FMId", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cFMId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCfmid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cFMId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cFMId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCfmid_Visible, edtavCfmid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmidnetmovimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmidnetmovimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmidnetmovimientofilter_Internalname, "FMId Net Movimiento", "", "", lblLblfmidnetmovimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmidnetmovimiento_Internalname, "FMId Net Movimiento", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmidnetmovimiento_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cFMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCfmidnetmovimiento_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7cFMIdNetMovimiento), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7cFMIdNetMovimiento), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmidnetmovimiento_Jsonclick, 0, "Attribute", "", "", "", "", edtavCfmidnetmovimiento_Visible, edtavCfmidnetmovimiento_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmfechaemisionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmfechaemisionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmfechaemisionfilter_Internalname, "FMFecha Emision", "", "", lblLblfmfechaemisionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130a1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmfechaemision_Internalname, "FMFecha Emision", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCfmfechaemision_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmfechaemision_Internalname, localUtil.ttoc( AV8cFMFechaEmision, 10, 8, 1, 2, "/", ":", " "), localUtil.format( AV8cFMFechaEmision, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmfechaemision_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCfmfechaemision_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmfechavencimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmfechavencimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmfechavencimientofilter_Internalname, "FMFecha Vencimiento", "", "", lblLblfmfechavencimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140a1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmfechavencimiento_Internalname, "FMFecha Vencimiento", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCfmfechavencimiento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmfechavencimiento_Internalname, localUtil.ttoc( AV9cFMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "), localUtil.format( AV9cFMFechaVencimiento, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmfechavencimiento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCfmfechavencimiento_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmtipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmtipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmtipofilter_Internalname, "FMTipo", "", "", lblLblfmtipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmtipo_Internalname, "FMTipo", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmtipo_Internalname, AV10cFMTipo, GXutil.rtrim( localUtil.format( AV10cFMTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmtipo_Jsonclick, 0, "Attribute", "", "", "", "", edtavCfmtipo_Visible, edtavCfmtipo_Enabled, 0, "text", "", 45, "chr", 1, "row", 45, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmnumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmnumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmnumerofilter_Internalname, "FMNumero", "", "", lblLblfmnumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmnumero_Internalname, "FMNumero", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmnumero_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cFMNumero, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCfmnumero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11cFMNumero), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11cFMNumero), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmnumero_Jsonclick, 0, "Attribute", "", "", "", "", edtavCfmnumero_Visible, edtavCfmnumero_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divFmimportefiltercontainer_Internalname, 1, 0, "px", 0, "px", divFmimportefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblfmimportefilter_Internalname, "FMImporte", "", "", lblLblfmimportefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCfmimporte_Internalname, "FMImporte", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCfmimporte_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cFMImporte, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCfmimporte_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12cFMImporte), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12cFMImporte), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCfmimporte_Jsonclick, 0, "Attribute", "", "", "", "", edtavCfmimporte_Visible, edtavCfmimporte_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0020.htm");
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
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180a1_client"+"'", TempTags, "", 2, "HLP_Gx0020.htm");
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
            httpContext.writeValue( "FMId") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Net Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Emision") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Vencimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "FMTipo") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtFMIdNetMovimiento_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A22FMFechaEmision, 10, 8, 1, 2, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A23FMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A24FMTipo);
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
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0020.htm");
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

   public void start0A2( )
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
         Form.getMeta().addItem("description", "Selection List Factura Movimiento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0A0( ) ;
   }

   public void ws0A2( )
   {
      start0A2( ) ;
      evt0A2( ) ;
   }

   public void evt0A2( )
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
                           A2FMId = localUtil.ctol( httpContext.cgiGet( edtFMId_Internalname), ".", ",") ;
                           A21FMIdNetMovimiento = localUtil.ctol( httpContext.cgiGet( edtFMIdNetMovimiento_Internalname), ".", ",") ;
                           n21FMIdNetMovimiento = false ;
                           A22FMFechaEmision = localUtil.ctot( httpContext.cgiGet( edtFMFechaEmision_Internalname), 0) ;
                           n22FMFechaEmision = false ;
                           A23FMFechaVencimiento = localUtil.ctot( httpContext.cgiGet( edtFMFechaVencimiento_Internalname), 0) ;
                           n23FMFechaVencimiento = false ;
                           A24FMTipo = httpContext.cgiGet( edtFMTipo_Internalname) ;
                           n24FMTipo = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cfmid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMID"), ".", ",") != AV6cFMId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmidnetmovimiento Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMIDNETMOVIMIENTO"), ".", ",") != AV7cFMIdNetMovimiento )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmfechaemision Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCFMFECHAEMISION"), 0), AV8cFMFechaEmision) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmfechavencimiento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCFMFECHAVENCIMIENTO"), 0), AV9cFMFechaVencimiento) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmtipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCFMTIPO"), AV10cFMTipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmnumero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMNUMERO"), ".", ",") != AV11cFMNumero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cfmimporte Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMIMPORTE"), ".", ",") != AV12cFMImporte )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210A2 ();
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

   public void we0A2( )
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

   public void pa0A2( )
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
                                  long AV6cFMId ,
                                  long AV7cFMIdNetMovimiento ,
                                  java.util.Date AV8cFMFechaEmision ,
                                  java.util.Date AV9cFMFechaVencimiento ,
                                  String AV10cFMTipo ,
                                  long AV11cFMNumero ,
                                  long AV12cFMImporte )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf0A2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_FMID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2FMId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "FMID", GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")));
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
      rf0A2( ) ;
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

   public void rf0A2( )
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
                                              Long.valueOf(AV7cFMIdNetMovimiento) ,
                                              AV8cFMFechaEmision ,
                                              AV9cFMFechaVencimiento ,
                                              AV10cFMTipo ,
                                              Long.valueOf(AV11cFMNumero) ,
                                              Long.valueOf(AV12cFMImporte) ,
                                              Long.valueOf(A21FMIdNetMovimiento) ,
                                              A22FMFechaEmision ,
                                              A23FMFechaVencimiento ,
                                              A24FMTipo ,
                                              Long.valueOf(A25FMNumero) ,
                                              Long.valueOf(A27FMImporte) ,
                                              Long.valueOf(AV6cFMId) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         lV10cFMTipo = GXutil.concat( GXutil.rtrim( AV10cFMTipo), "%", "") ;
         /* Using cursor H000A2 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6cFMId), Long.valueOf(AV7cFMIdNetMovimiento), AV8cFMFechaEmision, AV9cFMFechaVencimiento, lV10cFMTipo, Long.valueOf(AV11cFMNumero), Long.valueOf(AV12cFMImporte), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_84_idx = 1 ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A27FMImporte = H000A2_A27FMImporte[0] ;
            n27FMImporte = H000A2_n27FMImporte[0] ;
            A25FMNumero = H000A2_A25FMNumero[0] ;
            n25FMNumero = H000A2_n25FMNumero[0] ;
            A24FMTipo = H000A2_A24FMTipo[0] ;
            n24FMTipo = H000A2_n24FMTipo[0] ;
            A23FMFechaVencimiento = H000A2_A23FMFechaVencimiento[0] ;
            n23FMFechaVencimiento = H000A2_n23FMFechaVencimiento[0] ;
            A22FMFechaEmision = H000A2_A22FMFechaEmision[0] ;
            n22FMFechaEmision = H000A2_n22FMFechaEmision[0] ;
            A21FMIdNetMovimiento = H000A2_A21FMIdNetMovimiento[0] ;
            n21FMIdNetMovimiento = H000A2_n21FMIdNetMovimiento[0] ;
            A2FMId = H000A2_A2FMId[0] ;
            /* Execute user event: Load */
            e200A2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0A0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0A2( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_FMID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A2FMId), "ZZZZZZZZZZZZZZZZZ9")));
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
                                           Long.valueOf(AV7cFMIdNetMovimiento) ,
                                           AV8cFMFechaEmision ,
                                           AV9cFMFechaVencimiento ,
                                           AV10cFMTipo ,
                                           Long.valueOf(AV11cFMNumero) ,
                                           Long.valueOf(AV12cFMImporte) ,
                                           Long.valueOf(A21FMIdNetMovimiento) ,
                                           A22FMFechaEmision ,
                                           A23FMFechaVencimiento ,
                                           A24FMTipo ,
                                           Long.valueOf(A25FMNumero) ,
                                           Long.valueOf(A27FMImporte) ,
                                           Long.valueOf(AV6cFMId) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV10cFMTipo = GXutil.concat( GXutil.rtrim( AV10cFMTipo), "%", "") ;
      /* Using cursor H000A3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV6cFMId), Long.valueOf(AV7cFMIdNetMovimiento), AV8cFMFechaEmision, AV9cFMFechaVencimiento, lV10cFMTipo, Long.valueOf(AV11cFMNumero), Long.valueOf(AV12cFMImporte)});
      GRID1_nRecordCount = H000A3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cFMId, AV7cFMIdNetMovimiento, AV8cFMFechaEmision, AV9cFMFechaVencimiento, AV10cFMTipo, AV11cFMNumero, AV12cFMImporte) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup0A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190A2 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCFMID");
            GX_FocusControl = edtavCfmid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cFMId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cFMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cFMId), 18, 0));
         }
         else
         {
            AV6cFMId = localUtil.ctol( httpContext.cgiGet( edtavCfmid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cFMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cFMId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmidnetmovimiento_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmidnetmovimiento_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCFMIDNETMOVIMIENTO");
            GX_FocusControl = edtavCfmidnetmovimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cFMIdNetMovimiento = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cFMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cFMIdNetMovimiento), 18, 0));
         }
         else
         {
            AV7cFMIdNetMovimiento = localUtil.ctol( httpContext.cgiGet( edtavCfmidnetmovimiento_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cFMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cFMIdNetMovimiento), 18, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCfmfechaemision_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCFMFECHAEMISION");
            GX_FocusControl = edtavCfmfechaemision_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cFMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8cFMFechaEmision", localUtil.ttoc( AV8cFMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            AV8cFMFechaEmision = localUtil.ctot( httpContext.cgiGet( edtavCfmfechaemision_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cFMFechaEmision", localUtil.ttoc( AV8cFMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCfmfechavencimiento_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCFMFECHAVENCIMIENTO");
            GX_FocusControl = edtavCfmfechavencimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cFMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9cFMFechaVencimiento", localUtil.ttoc( AV9cFMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            AV9cFMFechaVencimiento = localUtil.ctot( httpContext.cgiGet( edtavCfmfechavencimiento_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cFMFechaVencimiento", localUtil.ttoc( AV9cFMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         }
         AV10cFMTipo = httpContext.cgiGet( edtavCfmtipo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cFMTipo", AV10cFMTipo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmnumero_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmnumero_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCFMNUMERO");
            GX_FocusControl = edtavCfmnumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cFMNumero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cFMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11cFMNumero), 18, 0));
         }
         else
         {
            AV11cFMNumero = localUtil.ctol( httpContext.cgiGet( edtavCfmnumero_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cFMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11cFMNumero), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmimporte_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCfmimporte_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCFMIMPORTE");
            GX_FocusControl = edtavCfmimporte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cFMImporte = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cFMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12cFMImporte), 18, 0));
         }
         else
         {
            AV12cFMImporte = localUtil.ctol( httpContext.cgiGet( edtavCfmimporte_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cFMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12cFMImporte), 18, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMID"), ".", ",") != AV6cFMId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMIDNETMOVIMIENTO"), ".", ",") != AV7cFMIdNetMovimiento )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCFMFECHAEMISION")), AV8cFMFechaEmision) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCFMFECHAVENCIMIENTO")), AV9cFMFechaVencimiento) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCFMTIPO"), AV10cFMTipo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMNUMERO"), ".", ",") != AV11cFMNumero )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCFMIMPORTE"), ".", ",") != AV12cFMImporte )
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
      e190A2 ();
      if (returnInSub) return;
   }

   public void e190A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "Factura Movimiento", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200A2( )
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
      e210A2 ();
      if (returnInSub) return;
   }

   public void e210A2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV13pFMId = A2FMId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pFMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pFMId), 18, 0));
      httpContext.setWebReturnParms(new Object[] {Long.valueOf(AV13pFMId)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV13pFMId"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13pFMId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pFMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pFMId), 18, 0));
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
      pa0A2( ) ;
      ws0A2( ) ;
      we0A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614575084", true, true);
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
      httpContext.AddJavascriptSource("gx0020.js", "?202312614575085", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtFMId_Internalname = "FMID_"+sGXsfl_84_idx ;
      edtFMIdNetMovimiento_Internalname = "FMIDNETMOVIMIENTO_"+sGXsfl_84_idx ;
      edtFMFechaEmision_Internalname = "FMFECHAEMISION_"+sGXsfl_84_idx ;
      edtFMFechaVencimiento_Internalname = "FMFECHAVENCIMIENTO_"+sGXsfl_84_idx ;
      edtFMTipo_Internalname = "FMTIPO_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtFMId_Internalname = "FMID_"+sGXsfl_84_fel_idx ;
      edtFMIdNetMovimiento_Internalname = "FMIDNETMOVIMIENTO_"+sGXsfl_84_fel_idx ;
      edtFMFechaEmision_Internalname = "FMFECHAEMISION_"+sGXsfl_84_fel_idx ;
      edtFMFechaVencimiento_Internalname = "FMFECHAVENCIMIENTO_"+sGXsfl_84_fel_idx ;
      edtFMTipo_Internalname = "FMTIPO_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0A0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFMId_Internalname,GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2FMId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFMId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtFMIdNetMovimiento_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtFMIdNetMovimiento_Internalname, "Link", edtFMIdNetMovimiento_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFMIdNetMovimiento_Internalname,GXutil.ltrim( localUtil.ntoc( A21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'",edtFMIdNetMovimiento_Link,"","","",edtFMIdNetMovimiento_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFMFechaEmision_Internalname,localUtil.ttoc( A22FMFechaEmision, 10, 8, 1, 2, "/", ":", " "),localUtil.format( A22FMFechaEmision, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFMFechaEmision_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFMFechaVencimiento_Internalname,localUtil.ttoc( A23FMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "),localUtil.format( A23FMFechaVencimiento, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFMFechaVencimiento_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFMTipo_Internalname,A24FMTipo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFMTipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes0A2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblfmidfilter_Internalname = "LBLFMIDFILTER" ;
      edtavCfmid_Internalname = "vCFMID" ;
      divFmidfiltercontainer_Internalname = "FMIDFILTERCONTAINER" ;
      lblLblfmidnetmovimientofilter_Internalname = "LBLFMIDNETMOVIMIENTOFILTER" ;
      edtavCfmidnetmovimiento_Internalname = "vCFMIDNETMOVIMIENTO" ;
      divFmidnetmovimientofiltercontainer_Internalname = "FMIDNETMOVIMIENTOFILTERCONTAINER" ;
      lblLblfmfechaemisionfilter_Internalname = "LBLFMFECHAEMISIONFILTER" ;
      edtavCfmfechaemision_Internalname = "vCFMFECHAEMISION" ;
      divFmfechaemisionfiltercontainer_Internalname = "FMFECHAEMISIONFILTERCONTAINER" ;
      lblLblfmfechavencimientofilter_Internalname = "LBLFMFECHAVENCIMIENTOFILTER" ;
      edtavCfmfechavencimiento_Internalname = "vCFMFECHAVENCIMIENTO" ;
      divFmfechavencimientofiltercontainer_Internalname = "FMFECHAVENCIMIENTOFILTERCONTAINER" ;
      lblLblfmtipofilter_Internalname = "LBLFMTIPOFILTER" ;
      edtavCfmtipo_Internalname = "vCFMTIPO" ;
      divFmtipofiltercontainer_Internalname = "FMTIPOFILTERCONTAINER" ;
      lblLblfmnumerofilter_Internalname = "LBLFMNUMEROFILTER" ;
      edtavCfmnumero_Internalname = "vCFMNUMERO" ;
      divFmnumerofiltercontainer_Internalname = "FMNUMEROFILTERCONTAINER" ;
      lblLblfmimportefilter_Internalname = "LBLFMIMPORTEFILTER" ;
      edtavCfmimporte_Internalname = "vCFMIMPORTE" ;
      divFmimportefiltercontainer_Internalname = "FMIMPORTEFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtFMId_Internalname = "FMID" ;
      edtFMIdNetMovimiento_Internalname = "FMIDNETMOVIMIENTO" ;
      edtFMFechaEmision_Internalname = "FMFECHAEMISION" ;
      edtFMFechaVencimiento_Internalname = "FMFECHAVENCIMIENTO" ;
      edtFMTipo_Internalname = "FMTIPO" ;
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
      edtFMTipo_Jsonclick = "" ;
      edtFMFechaVencimiento_Jsonclick = "" ;
      edtFMFechaEmision_Jsonclick = "" ;
      edtFMIdNetMovimiento_Jsonclick = "" ;
      edtFMId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtFMIdNetMovimiento_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Header = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCfmimporte_Jsonclick = "" ;
      edtavCfmimporte_Enabled = 1 ;
      edtavCfmimporte_Visible = 1 ;
      edtavCfmnumero_Jsonclick = "" ;
      edtavCfmnumero_Enabled = 1 ;
      edtavCfmnumero_Visible = 1 ;
      edtavCfmtipo_Jsonclick = "" ;
      edtavCfmtipo_Enabled = 1 ;
      edtavCfmtipo_Visible = 1 ;
      edtavCfmfechavencimiento_Jsonclick = "" ;
      edtavCfmfechavencimiento_Enabled = 1 ;
      edtavCfmfechaemision_Jsonclick = "" ;
      edtavCfmfechaemision_Enabled = 1 ;
      edtavCfmidnetmovimiento_Jsonclick = "" ;
      edtavCfmidnetmovimiento_Enabled = 1 ;
      edtavCfmidnetmovimiento_Visible = 1 ;
      edtavCfmid_Jsonclick = "" ;
      edtavCfmid_Enabled = 1 ;
      edtavCfmid_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Factura Movimiento" );
      divFmimportefiltercontainer_Class = "AdvancedContainerItem" ;
      divFmnumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divFmtipofiltercontainer_Class = "AdvancedContainerItem" ;
      divFmfechavencimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divFmfechaemisionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFmidnetmovimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divFmidfiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cFMId',fld:'vCFMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cFMIdNetMovimiento',fld:'vCFMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cFMFechaEmision',fld:'vCFMFECHAEMISION',pic:'99/99/99 99:99'},{av:'AV9cFMFechaVencimiento',fld:'vCFMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'AV10cFMTipo',fld:'vCFMTIPO',pic:''},{av:'AV11cFMNumero',fld:'vCFMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cFMImporte',fld:'vCFMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180A1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLFMIDFILTER.CLICK","{handler:'e110A1',iparms:[{av:'divFmidfiltercontainer_Class',ctrl:'FMIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMIDFILTER.CLICK",",oparms:[{av:'divFmidfiltercontainer_Class',ctrl:'FMIDFILTERCONTAINER',prop:'Class'},{av:'edtavCfmid_Visible',ctrl:'vCFMID',prop:'Visible'}]}");
      setEventMetadata("LBLFMIDNETMOVIMIENTOFILTER.CLICK","{handler:'e120A1',iparms:[{av:'divFmidnetmovimientofiltercontainer_Class',ctrl:'FMIDNETMOVIMIENTOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMIDNETMOVIMIENTOFILTER.CLICK",",oparms:[{av:'divFmidnetmovimientofiltercontainer_Class',ctrl:'FMIDNETMOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCfmidnetmovimiento_Visible',ctrl:'vCFMIDNETMOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLFMFECHAEMISIONFILTER.CLICK","{handler:'e130A1',iparms:[{av:'divFmfechaemisionfiltercontainer_Class',ctrl:'FMFECHAEMISIONFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMFECHAEMISIONFILTER.CLICK",",oparms:[{av:'divFmfechaemisionfiltercontainer_Class',ctrl:'FMFECHAEMISIONFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLFMFECHAVENCIMIENTOFILTER.CLICK","{handler:'e140A1',iparms:[{av:'divFmfechavencimientofiltercontainer_Class',ctrl:'FMFECHAVENCIMIENTOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMFECHAVENCIMIENTOFILTER.CLICK",",oparms:[{av:'divFmfechavencimientofiltercontainer_Class',ctrl:'FMFECHAVENCIMIENTOFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLFMTIPOFILTER.CLICK","{handler:'e150A1',iparms:[{av:'divFmtipofiltercontainer_Class',ctrl:'FMTIPOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMTIPOFILTER.CLICK",",oparms:[{av:'divFmtipofiltercontainer_Class',ctrl:'FMTIPOFILTERCONTAINER',prop:'Class'},{av:'edtavCfmtipo_Visible',ctrl:'vCFMTIPO',prop:'Visible'}]}");
      setEventMetadata("LBLFMNUMEROFILTER.CLICK","{handler:'e160A1',iparms:[{av:'divFmnumerofiltercontainer_Class',ctrl:'FMNUMEROFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMNUMEROFILTER.CLICK",",oparms:[{av:'divFmnumerofiltercontainer_Class',ctrl:'FMNUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCfmnumero_Visible',ctrl:'vCFMNUMERO',prop:'Visible'}]}");
      setEventMetadata("LBLFMIMPORTEFILTER.CLICK","{handler:'e170A1',iparms:[{av:'divFmimportefiltercontainer_Class',ctrl:'FMIMPORTEFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLFMIMPORTEFILTER.CLICK",",oparms:[{av:'divFmimportefiltercontainer_Class',ctrl:'FMIMPORTEFILTERCONTAINER',prop:'Class'},{av:'edtavCfmimporte_Visible',ctrl:'vCFMIMPORTE',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210A2',iparms:[{av:'A2FMId',fld:'FMID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV13pFMId',fld:'vPFMID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cFMId',fld:'vCFMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cFMIdNetMovimiento',fld:'vCFMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cFMFechaEmision',fld:'vCFMFECHAEMISION',pic:'99/99/99 99:99'},{av:'AV9cFMFechaVencimiento',fld:'vCFMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'AV10cFMTipo',fld:'vCFMTIPO',pic:''},{av:'AV11cFMNumero',fld:'vCFMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cFMImporte',fld:'vCFMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cFMId',fld:'vCFMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cFMIdNetMovimiento',fld:'vCFMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cFMFechaEmision',fld:'vCFMFECHAEMISION',pic:'99/99/99 99:99'},{av:'AV9cFMFechaVencimiento',fld:'vCFMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'AV10cFMTipo',fld:'vCFMTIPO',pic:''},{av:'AV11cFMNumero',fld:'vCFMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cFMImporte',fld:'vCFMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cFMId',fld:'vCFMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cFMIdNetMovimiento',fld:'vCFMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cFMFechaEmision',fld:'vCFMFECHAEMISION',pic:'99/99/99 99:99'},{av:'AV9cFMFechaVencimiento',fld:'vCFMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'AV10cFMTipo',fld:'vCFMTIPO',pic:''},{av:'AV11cFMNumero',fld:'vCFMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cFMImporte',fld:'vCFMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cFMId',fld:'vCFMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cFMIdNetMovimiento',fld:'vCFMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV8cFMFechaEmision',fld:'vCFMFECHAEMISION',pic:'99/99/99 99:99'},{av:'AV9cFMFechaVencimiento',fld:'vCFMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'AV10cFMTipo',fld:'vCFMTIPO',pic:''},{av:'AV11cFMNumero',fld:'vCFMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV12cFMImporte',fld:'vCFMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_CFMFECHAEMISION","{handler:'validv_Cfmfechaemision',iparms:[]");
      setEventMetadata("VALIDV_CFMFECHAEMISION",",oparms:[]}");
      setEventMetadata("VALIDV_CFMFECHAVENCIMIENTO","{handler:'validv_Cfmfechavencimiento',iparms:[]");
      setEventMetadata("VALIDV_CFMFECHAVENCIMIENTO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fmtipo',iparms:[]");
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
      AV8cFMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      AV9cFMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      AV10cFMTipo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblfmidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblfmidnetmovimientofilter_Jsonclick = "" ;
      lblLblfmfechaemisionfilter_Jsonclick = "" ;
      lblLblfmfechavencimientofilter_Jsonclick = "" ;
      lblLblfmtipofilter_Jsonclick = "" ;
      lblLblfmnumerofilter_Jsonclick = "" ;
      lblLblfmimportefilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      A24FMTipo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV10cFMTipo = "" ;
      H000A2_A27FMImporte = new long[1] ;
      H000A2_n27FMImporte = new boolean[] {false} ;
      H000A2_A25FMNumero = new long[1] ;
      H000A2_n25FMNumero = new boolean[] {false} ;
      H000A2_A24FMTipo = new String[] {""} ;
      H000A2_n24FMTipo = new boolean[] {false} ;
      H000A2_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      H000A2_n23FMFechaVencimiento = new boolean[] {false} ;
      H000A2_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      H000A2_n22FMFechaEmision = new boolean[] {false} ;
      H000A2_A21FMIdNetMovimiento = new long[1] ;
      H000A2_n21FMIdNetMovimiento = new boolean[] {false} ;
      H000A2_A2FMId = new long[1] ;
      H000A3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gx0020__default(),
         new Object[] {
             new Object[] {
            H000A2_A27FMImporte, H000A2_n27FMImporte, H000A2_A25FMNumero, H000A2_n25FMNumero, H000A2_A24FMTipo, H000A2_n24FMTipo, H000A2_A23FMFechaVencimiento, H000A2_n23FMFechaVencimiento, H000A2_A22FMFechaEmision, H000A2_n22FMFechaEmision,
            H000A2_A21FMIdNetMovimiento, H000A2_n21FMIdNetMovimiento, H000A2_A2FMId
            }
            , new Object[] {
            H000A3_AGRID1_nRecordCount
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
   private int edtavCfmid_Enabled ;
   private int edtavCfmid_Visible ;
   private int edtavCfmidnetmovimiento_Enabled ;
   private int edtavCfmidnetmovimiento_Visible ;
   private int edtavCfmfechaemision_Enabled ;
   private int edtavCfmfechavencimiento_Enabled ;
   private int edtavCfmtipo_Visible ;
   private int edtavCfmtipo_Enabled ;
   private int edtavCfmnumero_Enabled ;
   private int edtavCfmnumero_Visible ;
   private int edtavCfmimporte_Enabled ;
   private int edtavCfmimporte_Visible ;
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
   private long AV6cFMId ;
   private long AV7cFMIdNetMovimiento ;
   private long AV11cFMNumero ;
   private long AV12cFMImporte ;
   private long AV13pFMId ;
   private long A2FMId ;
   private long A21FMIdNetMovimiento ;
   private long GRID1_nCurrentRecord ;
   private long A25FMNumero ;
   private long A27FMImporte ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divFmidfiltercontainer_Class ;
   private String divFmidnetmovimientofiltercontainer_Class ;
   private String divFmfechaemisionfiltercontainer_Class ;
   private String divFmfechavencimientofiltercontainer_Class ;
   private String divFmtipofiltercontainer_Class ;
   private String divFmnumerofiltercontainer_Class ;
   private String divFmimportefiltercontainer_Class ;
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
   private String divFmidfiltercontainer_Internalname ;
   private String lblLblfmidfilter_Internalname ;
   private String lblLblfmidfilter_Jsonclick ;
   private String edtavCfmid_Internalname ;
   private String TempTags ;
   private String edtavCfmid_Jsonclick ;
   private String divFmidnetmovimientofiltercontainer_Internalname ;
   private String lblLblfmidnetmovimientofilter_Internalname ;
   private String lblLblfmidnetmovimientofilter_Jsonclick ;
   private String edtavCfmidnetmovimiento_Internalname ;
   private String edtavCfmidnetmovimiento_Jsonclick ;
   private String divFmfechaemisionfiltercontainer_Internalname ;
   private String lblLblfmfechaemisionfilter_Internalname ;
   private String lblLblfmfechaemisionfilter_Jsonclick ;
   private String edtavCfmfechaemision_Internalname ;
   private String edtavCfmfechaemision_Jsonclick ;
   private String divFmfechavencimientofiltercontainer_Internalname ;
   private String lblLblfmfechavencimientofilter_Internalname ;
   private String lblLblfmfechavencimientofilter_Jsonclick ;
   private String edtavCfmfechavencimiento_Internalname ;
   private String edtavCfmfechavencimiento_Jsonclick ;
   private String divFmtipofiltercontainer_Internalname ;
   private String lblLblfmtipofilter_Internalname ;
   private String lblLblfmtipofilter_Jsonclick ;
   private String edtavCfmtipo_Internalname ;
   private String edtavCfmtipo_Jsonclick ;
   private String divFmnumerofiltercontainer_Internalname ;
   private String lblLblfmnumerofilter_Internalname ;
   private String lblLblfmnumerofilter_Jsonclick ;
   private String edtavCfmnumero_Internalname ;
   private String edtavCfmnumero_Jsonclick ;
   private String divFmimportefiltercontainer_Internalname ;
   private String lblLblfmimportefilter_Internalname ;
   private String lblLblfmimportefilter_Jsonclick ;
   private String edtavCfmimporte_Internalname ;
   private String edtavCfmimporte_Jsonclick ;
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
   private String edtFMIdNetMovimiento_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtFMId_Internalname ;
   private String edtFMIdNetMovimiento_Internalname ;
   private String edtFMFechaEmision_Internalname ;
   private String edtFMFechaVencimiento_Internalname ;
   private String edtFMTipo_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtFMId_Jsonclick ;
   private String edtFMIdNetMovimiento_Jsonclick ;
   private String edtFMFechaEmision_Jsonclick ;
   private String edtFMFechaVencimiento_Jsonclick ;
   private String edtFMTipo_Jsonclick ;
   private java.util.Date AV8cFMFechaEmision ;
   private java.util.Date AV9cFMFechaVencimiento ;
   private java.util.Date A22FMFechaEmision ;
   private java.util.Date A23FMFechaVencimiento ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n21FMIdNetMovimiento ;
   private boolean n22FMFechaEmision ;
   private boolean n23FMFechaVencimiento ;
   private boolean n24FMTipo ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n27FMImporte ;
   private boolean n25FMNumero ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV10cFMTipo ;
   private String A24FMTipo ;
   private String AV17Linkselection_GXI ;
   private String lV10cFMTipo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private long[] H000A2_A27FMImporte ;
   private boolean[] H000A2_n27FMImporte ;
   private long[] H000A2_A25FMNumero ;
   private boolean[] H000A2_n25FMNumero ;
   private String[] H000A2_A24FMTipo ;
   private boolean[] H000A2_n24FMTipo ;
   private java.util.Date[] H000A2_A23FMFechaVencimiento ;
   private boolean[] H000A2_n23FMFechaVencimiento ;
   private java.util.Date[] H000A2_A22FMFechaEmision ;
   private boolean[] H000A2_n22FMFechaEmision ;
   private long[] H000A2_A21FMIdNetMovimiento ;
   private boolean[] H000A2_n21FMIdNetMovimiento ;
   private long[] H000A2_A2FMId ;
   private long[] H000A3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV7cFMIdNetMovimiento ,
                                          java.util.Date AV8cFMFechaEmision ,
                                          java.util.Date AV9cFMFechaVencimiento ,
                                          String AV10cFMTipo ,
                                          long AV11cFMNumero ,
                                          long AV12cFMImporte ,
                                          long A21FMIdNetMovimiento ,
                                          java.util.Date A22FMFechaEmision ,
                                          java.util.Date A23FMFechaVencimiento ,
                                          String A24FMTipo ,
                                          long A25FMNumero ,
                                          long A27FMImporte ,
                                          long AV6cFMId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `FMImporte`, `FMNumero`, `FMTipo`, `FMFechaVencimiento`, `FMFechaEmision`, `FMIdNetMovimiento`, `FMId`" ;
      sFromString = " FROM `FacturaMovimiento`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`FMId` >= ?)");
      if ( ! (0==AV7cFMIdNetMovimiento) )
      {
         addWhere(sWhereString, "(`FMIdNetMovimiento` >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV8cFMFechaEmision) )
      {
         addWhere(sWhereString, "(`FMFechaEmision` >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cFMFechaVencimiento) )
      {
         addWhere(sWhereString, "(`FMFechaVencimiento` >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cFMTipo)==0) )
      {
         addWhere(sWhereString, "(`FMTipo` like ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cFMNumero) )
      {
         addWhere(sWhereString, "(`FMNumero` >= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cFMImporte) )
      {
         addWhere(sWhereString, "(`FMImporte` >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `FMId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV7cFMIdNetMovimiento ,
                                          java.util.Date AV8cFMFechaEmision ,
                                          java.util.Date AV9cFMFechaVencimiento ,
                                          String AV10cFMTipo ,
                                          long AV11cFMNumero ,
                                          long AV12cFMImporte ,
                                          long A21FMIdNetMovimiento ,
                                          java.util.Date A22FMFechaEmision ,
                                          java.util.Date A23FMFechaVencimiento ,
                                          String A24FMTipo ,
                                          long A25FMNumero ,
                                          long A27FMImporte ,
                                          long AV6cFMId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `FacturaMovimiento`" ;
      addWhere(sWhereString, "(`FMId` >= ?)");
      if ( ! (0==AV7cFMIdNetMovimiento) )
      {
         addWhere(sWhereString, "(`FMIdNetMovimiento` >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV8cFMFechaEmision) )
      {
         addWhere(sWhereString, "(`FMFechaEmision` >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cFMFechaVencimiento) )
      {
         addWhere(sWhereString, "(`FMFechaVencimiento` >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cFMTipo)==0) )
      {
         addWhere(sWhereString, "(`FMTipo` like ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cFMNumero) )
      {
         addWhere(sWhereString, "(`FMNumero` >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cFMImporte) )
      {
         addWhere(sWhereString, "(`FMImporte` >= ?)");
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
                  return conditional_H000A2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H000A3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(5);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 45);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[15]).longValue());
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 45);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               return;
      }
   }

}

