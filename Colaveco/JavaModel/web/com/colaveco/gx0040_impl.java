package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0040_impl extends GXDataArea
{
   public gx0040_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0040_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0040_impl.class ));
   }

   public gx0040_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "pClienteId") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "pClienteId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pClienteId") ;
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
            AV6cClienteId = GXutil.lval( httpContext.GetPar( "cClienteId")) ;
            AV7cClienteNombre = httpContext.GetPar( "cClienteNombre") ;
            AV8cClienteEmail = httpContext.GetPar( "cClienteEmail") ;
            AV9cClienteNombreEmail1 = httpContext.GetPar( "cClienteNombreEmail1") ;
            AV10cClienteEmail1 = httpContext.GetPar( "cClienteEmail1") ;
            AV11cClienteNombreEmail2 = httpContext.GetPar( "cClienteNombreEmail2") ;
            AV12cClienteEmail2 = httpContext.GetPar( "cClienteEmail2") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEIDFILTERCONTAINER_Class", GXutil.rtrim( divClienteidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREFILTERCONTAINER_Class", GXutil.rtrim( divClientenombrefiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAILFILTERCONTAINER_Class", GXutil.rtrim( divClienteemailfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREEMAIL1FILTERCONTAINER_Class", GXutil.rtrim( divClientenombreemail1filtercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAIL1FILTERCONTAINER_Class", GXutil.rtrim( divClienteemail1filtercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREEMAIL2FILTERCONTAINER_Class", GXutil.rtrim( divClientenombreemail2filtercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAIL2FILTERCONTAINER_Class", GXutil.rtrim( divClienteemail2filtercontainer_Class));
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
            AV13pClienteId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pClienteId), 18, 0));
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
      pa0B2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0B2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614575378", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gx0040", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13pClienteId,18,0))}, new String[] {"pClienteId"}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTEID", GXutil.ltrim( localUtil.ntoc( AV6cClienteId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTENOMBRE", AV7cClienteNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTEEMAIL", AV8cClienteEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTENOMBREEMAIL1", AV9cClienteNombreEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTEEMAIL1", AV10cClienteEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTENOMBREEMAIL2", AV11cClienteNombreEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLIENTEEMAIL2", AV12cClienteEmail2);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPCLIENTEID", GXutil.ltrim( localUtil.ntoc( AV13pClienteId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEIDFILTERCONTAINER_Class", GXutil.rtrim( divClienteidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREFILTERCONTAINER_Class", GXutil.rtrim( divClientenombrefiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAILFILTERCONTAINER_Class", GXutil.rtrim( divClienteemailfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREEMAIL1FILTERCONTAINER_Class", GXutil.rtrim( divClientenombreemail1filtercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAIL1FILTERCONTAINER_Class", GXutil.rtrim( divClienteemail1filtercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTENOMBREEMAIL2FILTERCONTAINER_Class", GXutil.rtrim( divClientenombreemail2filtercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEEMAIL2FILTERCONTAINER_Class", GXutil.rtrim( divClienteemail2filtercontainer_Class));
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
         we0B2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0B2( ) ;
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
      return formatLink("com.colaveco.gx0040", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV13pClienteId,18,0))}, new String[] {"pClienteId"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0040" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Cliente" ;
   }

   public void wb0B0( )
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClienteidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divClienteidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclienteidfilter_Internalname, "Cliente Id", "", "", lblLblclienteidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclienteid_Internalname, "Cliente Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclienteid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cClienteId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCclienteid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cClienteId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cClienteId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclienteid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclienteid_Visible, edtavCclienteid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClientenombrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divClientenombrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclientenombrefilter_Internalname, "Cliente Nombre", "", "", lblLblclientenombrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclientenombre_Internalname, "Cliente Nombre", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclientenombre_Internalname, AV7cClienteNombre, GXutil.rtrim( localUtil.format( AV7cClienteNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclientenombre_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclientenombre_Visible, edtavCclientenombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClienteemailfiltercontainer_Internalname, 1, 0, "px", 0, "px", divClienteemailfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclienteemailfilter_Internalname, "Cliente Email", "", "", lblLblclienteemailfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclienteemail_Internalname, "Cliente Email", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclienteemail_Internalname, AV8cClienteEmail, GXutil.rtrim( localUtil.format( AV8cClienteEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclienteemail_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclienteemail_Visible, edtavCclienteemail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClientenombreemail1filtercontainer_Internalname, 1, 0, "px", 0, "px", divClientenombreemail1filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclientenombreemail1filter_Internalname, "Cliente Nombre Email1", "", "", lblLblclientenombreemail1filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclientenombreemail1_Internalname, "Cliente Nombre Email1", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclientenombreemail1_Internalname, AV9cClienteNombreEmail1, GXutil.rtrim( localUtil.format( AV9cClienteNombreEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclientenombreemail1_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclientenombreemail1_Visible, edtavCclientenombreemail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClienteemail1filtercontainer_Internalname, 1, 0, "px", 0, "px", divClienteemail1filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclienteemail1filter_Internalname, "Cliente Email1", "", "", lblLblclienteemail1filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclienteemail1_Internalname, "Cliente Email1", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclienteemail1_Internalname, AV10cClienteEmail1, GXutil.rtrim( localUtil.format( AV10cClienteEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclienteemail1_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclienteemail1_Visible, edtavCclienteemail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClientenombreemail2filtercontainer_Internalname, 1, 0, "px", 0, "px", divClientenombreemail2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclientenombreemail2filter_Internalname, "Cliente Nombre Email2", "", "", lblLblclientenombreemail2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclientenombreemail2_Internalname, "Cliente Nombre Email2", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclientenombreemail2_Internalname, AV11cClienteNombreEmail2, GXutil.rtrim( localUtil.format( AV11cClienteNombreEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclientenombreemail2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclientenombreemail2_Visible, edtavCclientenombreemail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divClienteemail2filtercontainer_Internalname, 1, 0, "px", 0, "px", divClienteemail2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblclienteemail2filter_Internalname, "Cliente Email2", "", "", lblLblclienteemail2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCclienteemail2_Internalname, "Cliente Email2", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCclienteemail2_Internalname, AV12cClienteEmail2, GXutil.rtrim( localUtil.format( AV12cClienteEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclienteemail2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCclienteemail2_Visible, edtavCclienteemail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0040.htm");
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
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180b1_client"+"'", TempTags, "", 2, "HLP_Gx0040.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A45ClienteNombre);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtClienteNombre_Link));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0040.htm");
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

   public void start0B2( )
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
         Form.getMeta().addItem("description", "Selection List Cliente", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0B0( ) ;
   }

   public void ws0B2( )
   {
      start0B2( ) ;
      evt0B2( ) ;
   }

   public void evt0B2( )
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
                           A4ClienteId = localUtil.ctol( httpContext.cgiGet( edtClienteId_Internalname), ".", ",") ;
                           A45ClienteNombre = httpContext.cgiGet( edtClienteNombre_Internalname) ;
                           n45ClienteNombre = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cclienteid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCLIENTEID"), ".", ",") != AV6cClienteId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclientenombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBRE"), AV7cClienteNombre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclienteemail Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL"), AV8cClienteEmail) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclientenombreemail1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBREEMAIL1"), AV9cClienteNombreEmail1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclienteemail1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL1"), AV10cClienteEmail1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclientenombreemail2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBREEMAIL2"), AV11cClienteNombreEmail2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cclienteemail2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL2"), AV12cClienteEmail2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210B2 ();
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

   public void we0B2( )
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

   public void pa0B2( )
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
                                  long AV6cClienteId ,
                                  String AV7cClienteNombre ,
                                  String AV8cClienteEmail ,
                                  String AV9cClienteNombreEmail1 ,
                                  String AV10cClienteEmail1 ,
                                  String AV11cClienteNombreEmail2 ,
                                  String AV12cClienteEmail2 )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf0B2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLIENTEID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4ClienteId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "CLIENTEID", GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")));
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
      rf0B2( ) ;
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

   public void rf0B2( )
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
                                              AV7cClienteNombre ,
                                              AV8cClienteEmail ,
                                              AV9cClienteNombreEmail1 ,
                                              AV10cClienteEmail1 ,
                                              AV11cClienteNombreEmail2 ,
                                              AV12cClienteEmail2 ,
                                              A45ClienteNombre ,
                                              A46ClienteEmail ,
                                              A47ClienteNombreEmail1 ,
                                              A48ClienteEmail1 ,
                                              A49ClienteNombreEmail2 ,
                                              A50ClienteEmail2 ,
                                              Long.valueOf(AV6cClienteId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         lV7cClienteNombre = GXutil.concat( GXutil.rtrim( AV7cClienteNombre), "%", "") ;
         lV8cClienteEmail = GXutil.concat( GXutil.rtrim( AV8cClienteEmail), "%", "") ;
         lV9cClienteNombreEmail1 = GXutil.concat( GXutil.rtrim( AV9cClienteNombreEmail1), "%", "") ;
         lV10cClienteEmail1 = GXutil.concat( GXutil.rtrim( AV10cClienteEmail1), "%", "") ;
         lV11cClienteNombreEmail2 = GXutil.concat( GXutil.rtrim( AV11cClienteNombreEmail2), "%", "") ;
         lV12cClienteEmail2 = GXutil.concat( GXutil.rtrim( AV12cClienteEmail2), "%", "") ;
         /* Using cursor H000B2 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6cClienteId), lV7cClienteNombre, lV8cClienteEmail, lV9cClienteNombreEmail1, lV10cClienteEmail1, lV11cClienteNombreEmail2, lV12cClienteEmail2, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_84_idx = 1 ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A50ClienteEmail2 = H000B2_A50ClienteEmail2[0] ;
            n50ClienteEmail2 = H000B2_n50ClienteEmail2[0] ;
            A49ClienteNombreEmail2 = H000B2_A49ClienteNombreEmail2[0] ;
            n49ClienteNombreEmail2 = H000B2_n49ClienteNombreEmail2[0] ;
            A48ClienteEmail1 = H000B2_A48ClienteEmail1[0] ;
            n48ClienteEmail1 = H000B2_n48ClienteEmail1[0] ;
            A47ClienteNombreEmail1 = H000B2_A47ClienteNombreEmail1[0] ;
            n47ClienteNombreEmail1 = H000B2_n47ClienteNombreEmail1[0] ;
            A46ClienteEmail = H000B2_A46ClienteEmail[0] ;
            n46ClienteEmail = H000B2_n46ClienteEmail[0] ;
            A45ClienteNombre = H000B2_A45ClienteNombre[0] ;
            n45ClienteNombre = H000B2_n45ClienteNombre[0] ;
            A4ClienteId = H000B2_A4ClienteId[0] ;
            /* Execute user event: Load */
            e200B2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0B0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0B2( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLIENTEID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A4ClienteId), "ZZZZZZZZZZZZZZZZZ9")));
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
                                           AV7cClienteNombre ,
                                           AV8cClienteEmail ,
                                           AV9cClienteNombreEmail1 ,
                                           AV10cClienteEmail1 ,
                                           AV11cClienteNombreEmail2 ,
                                           AV12cClienteEmail2 ,
                                           A45ClienteNombre ,
                                           A46ClienteEmail ,
                                           A47ClienteNombreEmail1 ,
                                           A48ClienteEmail1 ,
                                           A49ClienteNombreEmail2 ,
                                           A50ClienteEmail2 ,
                                           Long.valueOf(AV6cClienteId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV7cClienteNombre = GXutil.concat( GXutil.rtrim( AV7cClienteNombre), "%", "") ;
      lV8cClienteEmail = GXutil.concat( GXutil.rtrim( AV8cClienteEmail), "%", "") ;
      lV9cClienteNombreEmail1 = GXutil.concat( GXutil.rtrim( AV9cClienteNombreEmail1), "%", "") ;
      lV10cClienteEmail1 = GXutil.concat( GXutil.rtrim( AV10cClienteEmail1), "%", "") ;
      lV11cClienteNombreEmail2 = GXutil.concat( GXutil.rtrim( AV11cClienteNombreEmail2), "%", "") ;
      lV12cClienteEmail2 = GXutil.concat( GXutil.rtrim( AV12cClienteEmail2), "%", "") ;
      /* Using cursor H000B3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV6cClienteId), lV7cClienteNombre, lV8cClienteEmail, lV9cClienteNombreEmail1, lV10cClienteEmail1, lV11cClienteNombreEmail2, lV12cClienteEmail2});
      GRID1_nRecordCount = H000B3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cClienteId, AV7cClienteNombre, AV8cClienteEmail, AV9cClienteNombreEmail1, AV10cClienteEmail1, AV11cClienteNombreEmail2, AV12cClienteEmail2) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup0B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190B2 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCclienteid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCclienteid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCLIENTEID");
            GX_FocusControl = edtavCclienteid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cClienteId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cClienteId), 18, 0));
         }
         else
         {
            AV6cClienteId = localUtil.ctol( httpContext.cgiGet( edtavCclienteid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cClienteId), 18, 0));
         }
         AV7cClienteNombre = httpContext.cgiGet( edtavCclientenombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cClienteNombre", AV7cClienteNombre);
         AV8cClienteEmail = httpContext.cgiGet( edtavCclienteemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cClienteEmail", AV8cClienteEmail);
         AV9cClienteNombreEmail1 = httpContext.cgiGet( edtavCclientenombreemail1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cClienteNombreEmail1", AV9cClienteNombreEmail1);
         AV10cClienteEmail1 = httpContext.cgiGet( edtavCclienteemail1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cClienteEmail1", AV10cClienteEmail1);
         AV11cClienteNombreEmail2 = httpContext.cgiGet( edtavCclientenombreemail2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cClienteNombreEmail2", AV11cClienteNombreEmail2);
         AV12cClienteEmail2 = httpContext.cgiGet( edtavCclienteemail2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cClienteEmail2", AV12cClienteEmail2);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCLIENTEID"), ".", ",") != AV6cClienteId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBRE"), AV7cClienteNombre) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL"), AV8cClienteEmail) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBREEMAIL1"), AV9cClienteNombreEmail1) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL1"), AV10cClienteEmail1) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTENOMBREEMAIL2"), AV11cClienteNombreEmail2) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLIENTEEMAIL2"), AV12cClienteEmail2) != 0 )
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
      e190B2 ();
      if (returnInSub) return;
   }

   public void e190B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "Cliente", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200B2( )
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
      e210B2 ();
      if (returnInSub) return;
   }

   public void e210B2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV13pClienteId = A4ClienteId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pClienteId), 18, 0));
      httpContext.setWebReturnParms(new Object[] {Long.valueOf(AV13pClienteId)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV13pClienteId"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13pClienteId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13pClienteId), 18, 0));
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
      pa0B2( ) ;
      ws0B2( ) ;
      we0B2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614575578", true, true);
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
      httpContext.AddJavascriptSource("gx0040.js", "?202312614575579", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtClienteId_Internalname = "CLIENTEID_"+sGXsfl_84_idx ;
      edtClienteNombre_Internalname = "CLIENTENOMBRE_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtClienteId_Internalname = "CLIENTEID_"+sGXsfl_84_fel_idx ;
      edtClienteNombre_Internalname = "CLIENTENOMBRE_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0B0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClienteId_Internalname,GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4ClienteId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClienteId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtClienteNombre_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtClienteNombre_Internalname, "Link", edtClienteNombre_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClienteNombre_Internalname,A45ClienteNombre,"","","'"+""+"'"+",false,"+"'"+""+"'",edtClienteNombre_Link,"","","",edtClienteNombre_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"nombres","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes0B2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblclienteidfilter_Internalname = "LBLCLIENTEIDFILTER" ;
      edtavCclienteid_Internalname = "vCCLIENTEID" ;
      divClienteidfiltercontainer_Internalname = "CLIENTEIDFILTERCONTAINER" ;
      lblLblclientenombrefilter_Internalname = "LBLCLIENTENOMBREFILTER" ;
      edtavCclientenombre_Internalname = "vCCLIENTENOMBRE" ;
      divClientenombrefiltercontainer_Internalname = "CLIENTENOMBREFILTERCONTAINER" ;
      lblLblclienteemailfilter_Internalname = "LBLCLIENTEEMAILFILTER" ;
      edtavCclienteemail_Internalname = "vCCLIENTEEMAIL" ;
      divClienteemailfiltercontainer_Internalname = "CLIENTEEMAILFILTERCONTAINER" ;
      lblLblclientenombreemail1filter_Internalname = "LBLCLIENTENOMBREEMAIL1FILTER" ;
      edtavCclientenombreemail1_Internalname = "vCCLIENTENOMBREEMAIL1" ;
      divClientenombreemail1filtercontainer_Internalname = "CLIENTENOMBREEMAIL1FILTERCONTAINER" ;
      lblLblclienteemail1filter_Internalname = "LBLCLIENTEEMAIL1FILTER" ;
      edtavCclienteemail1_Internalname = "vCCLIENTEEMAIL1" ;
      divClienteemail1filtercontainer_Internalname = "CLIENTEEMAIL1FILTERCONTAINER" ;
      lblLblclientenombreemail2filter_Internalname = "LBLCLIENTENOMBREEMAIL2FILTER" ;
      edtavCclientenombreemail2_Internalname = "vCCLIENTENOMBREEMAIL2" ;
      divClientenombreemail2filtercontainer_Internalname = "CLIENTENOMBREEMAIL2FILTERCONTAINER" ;
      lblLblclienteemail2filter_Internalname = "LBLCLIENTEEMAIL2FILTER" ;
      edtavCclienteemail2_Internalname = "vCCLIENTEEMAIL2" ;
      divClienteemail2filtercontainer_Internalname = "CLIENTEEMAIL2FILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtClienteId_Internalname = "CLIENTEID" ;
      edtClienteNombre_Internalname = "CLIENTENOMBRE" ;
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
      edtClienteNombre_Jsonclick = "" ;
      edtClienteId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtClienteNombre_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Header = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCclienteemail2_Jsonclick = "" ;
      edtavCclienteemail2_Enabled = 1 ;
      edtavCclienteemail2_Visible = 1 ;
      edtavCclientenombreemail2_Jsonclick = "" ;
      edtavCclientenombreemail2_Enabled = 1 ;
      edtavCclientenombreemail2_Visible = 1 ;
      edtavCclienteemail1_Jsonclick = "" ;
      edtavCclienteemail1_Enabled = 1 ;
      edtavCclienteemail1_Visible = 1 ;
      edtavCclientenombreemail1_Jsonclick = "" ;
      edtavCclientenombreemail1_Enabled = 1 ;
      edtavCclientenombreemail1_Visible = 1 ;
      edtavCclienteemail_Jsonclick = "" ;
      edtavCclienteemail_Enabled = 1 ;
      edtavCclienteemail_Visible = 1 ;
      edtavCclientenombre_Jsonclick = "" ;
      edtavCclientenombre_Enabled = 1 ;
      edtavCclientenombre_Visible = 1 ;
      edtavCclienteid_Jsonclick = "" ;
      edtavCclienteid_Enabled = 1 ;
      edtavCclienteid_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Cliente" );
      divClienteemail2filtercontainer_Class = "AdvancedContainerItem" ;
      divClientenombreemail2filtercontainer_Class = "AdvancedContainerItem" ;
      divClienteemail1filtercontainer_Class = "AdvancedContainerItem" ;
      divClientenombreemail1filtercontainer_Class = "AdvancedContainerItem" ;
      divClienteemailfiltercontainer_Class = "AdvancedContainerItem" ;
      divClientenombrefiltercontainer_Class = "AdvancedContainerItem" ;
      divClienteidfiltercontainer_Class = "AdvancedContainerItem" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cClienteId',fld:'vCCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cClienteNombre',fld:'vCCLIENTENOMBRE',pic:''},{av:'AV8cClienteEmail',fld:'vCCLIENTEEMAIL',pic:''},{av:'AV9cClienteNombreEmail1',fld:'vCCLIENTENOMBREEMAIL1',pic:''},{av:'AV10cClienteEmail1',fld:'vCCLIENTEEMAIL1',pic:''},{av:'AV11cClienteNombreEmail2',fld:'vCCLIENTENOMBREEMAIL2',pic:''},{av:'AV12cClienteEmail2',fld:'vCCLIENTEEMAIL2',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180B1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCLIENTEIDFILTER.CLICK","{handler:'e110B1',iparms:[{av:'divClienteidfiltercontainer_Class',ctrl:'CLIENTEIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTEIDFILTER.CLICK",",oparms:[{av:'divClienteidfiltercontainer_Class',ctrl:'CLIENTEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCclienteid_Visible',ctrl:'vCCLIENTEID',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTENOMBREFILTER.CLICK","{handler:'e120B1',iparms:[{av:'divClientenombrefiltercontainer_Class',ctrl:'CLIENTENOMBREFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTENOMBREFILTER.CLICK",",oparms:[{av:'divClientenombrefiltercontainer_Class',ctrl:'CLIENTENOMBREFILTERCONTAINER',prop:'Class'},{av:'edtavCclientenombre_Visible',ctrl:'vCCLIENTENOMBRE',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTEEMAILFILTER.CLICK","{handler:'e130B1',iparms:[{av:'divClienteemailfiltercontainer_Class',ctrl:'CLIENTEEMAILFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTEEMAILFILTER.CLICK",",oparms:[{av:'divClienteemailfiltercontainer_Class',ctrl:'CLIENTEEMAILFILTERCONTAINER',prop:'Class'},{av:'edtavCclienteemail_Visible',ctrl:'vCCLIENTEEMAIL',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTENOMBREEMAIL1FILTER.CLICK","{handler:'e140B1',iparms:[{av:'divClientenombreemail1filtercontainer_Class',ctrl:'CLIENTENOMBREEMAIL1FILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTENOMBREEMAIL1FILTER.CLICK",",oparms:[{av:'divClientenombreemail1filtercontainer_Class',ctrl:'CLIENTENOMBREEMAIL1FILTERCONTAINER',prop:'Class'},{av:'edtavCclientenombreemail1_Visible',ctrl:'vCCLIENTENOMBREEMAIL1',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTEEMAIL1FILTER.CLICK","{handler:'e150B1',iparms:[{av:'divClienteemail1filtercontainer_Class',ctrl:'CLIENTEEMAIL1FILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTEEMAIL1FILTER.CLICK",",oparms:[{av:'divClienteemail1filtercontainer_Class',ctrl:'CLIENTEEMAIL1FILTERCONTAINER',prop:'Class'},{av:'edtavCclienteemail1_Visible',ctrl:'vCCLIENTEEMAIL1',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTENOMBREEMAIL2FILTER.CLICK","{handler:'e160B1',iparms:[{av:'divClientenombreemail2filtercontainer_Class',ctrl:'CLIENTENOMBREEMAIL2FILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTENOMBREEMAIL2FILTER.CLICK",",oparms:[{av:'divClientenombreemail2filtercontainer_Class',ctrl:'CLIENTENOMBREEMAIL2FILTERCONTAINER',prop:'Class'},{av:'edtavCclientenombreemail2_Visible',ctrl:'vCCLIENTENOMBREEMAIL2',prop:'Visible'}]}");
      setEventMetadata("LBLCLIENTEEMAIL2FILTER.CLICK","{handler:'e170B1',iparms:[{av:'divClienteemail2filtercontainer_Class',ctrl:'CLIENTEEMAIL2FILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCLIENTEEMAIL2FILTER.CLICK",",oparms:[{av:'divClienteemail2filtercontainer_Class',ctrl:'CLIENTEEMAIL2FILTERCONTAINER',prop:'Class'},{av:'edtavCclienteemail2_Visible',ctrl:'vCCLIENTEEMAIL2',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210B2',iparms:[{av:'A4ClienteId',fld:'CLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV13pClienteId',fld:'vPCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cClienteId',fld:'vCCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cClienteNombre',fld:'vCCLIENTENOMBRE',pic:''},{av:'AV8cClienteEmail',fld:'vCCLIENTEEMAIL',pic:''},{av:'AV9cClienteNombreEmail1',fld:'vCCLIENTENOMBREEMAIL1',pic:''},{av:'AV10cClienteEmail1',fld:'vCCLIENTEEMAIL1',pic:''},{av:'AV11cClienteNombreEmail2',fld:'vCCLIENTENOMBREEMAIL2',pic:''},{av:'AV12cClienteEmail2',fld:'vCCLIENTEEMAIL2',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cClienteId',fld:'vCCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cClienteNombre',fld:'vCCLIENTENOMBRE',pic:''},{av:'AV8cClienteEmail',fld:'vCCLIENTEEMAIL',pic:''},{av:'AV9cClienteNombreEmail1',fld:'vCCLIENTENOMBREEMAIL1',pic:''},{av:'AV10cClienteEmail1',fld:'vCCLIENTEEMAIL1',pic:''},{av:'AV11cClienteNombreEmail2',fld:'vCCLIENTENOMBREEMAIL2',pic:''},{av:'AV12cClienteEmail2',fld:'vCCLIENTEEMAIL2',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cClienteId',fld:'vCCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cClienteNombre',fld:'vCCLIENTENOMBRE',pic:''},{av:'AV8cClienteEmail',fld:'vCCLIENTEEMAIL',pic:''},{av:'AV9cClienteNombreEmail1',fld:'vCCLIENTENOMBREEMAIL1',pic:''},{av:'AV10cClienteEmail1',fld:'vCCLIENTEEMAIL1',pic:''},{av:'AV11cClienteNombreEmail2',fld:'vCCLIENTENOMBREEMAIL2',pic:''},{av:'AV12cClienteEmail2',fld:'vCCLIENTEEMAIL2',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cClienteId',fld:'vCCLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cClienteNombre',fld:'vCCLIENTENOMBRE',pic:''},{av:'AV8cClienteEmail',fld:'vCCLIENTEEMAIL',pic:''},{av:'AV9cClienteNombreEmail1',fld:'vCCLIENTENOMBREEMAIL1',pic:''},{av:'AV10cClienteEmail1',fld:'vCCLIENTEEMAIL1',pic:''},{av:'AV11cClienteNombreEmail2',fld:'vCCLIENTENOMBREEMAIL2',pic:''},{av:'AV12cClienteEmail2',fld:'vCCLIENTEEMAIL2',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Clientenombre',iparms:[]");
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
      AV7cClienteNombre = "" ;
      AV8cClienteEmail = "" ;
      AV9cClienteNombreEmail1 = "" ;
      AV10cClienteEmail1 = "" ;
      AV11cClienteNombreEmail2 = "" ;
      AV12cClienteEmail2 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblclienteidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblclientenombrefilter_Jsonclick = "" ;
      lblLblclienteemailfilter_Jsonclick = "" ;
      lblLblclientenombreemail1filter_Jsonclick = "" ;
      lblLblclienteemail1filter_Jsonclick = "" ;
      lblLblclientenombreemail2filter_Jsonclick = "" ;
      lblLblclienteemail2filter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A45ClienteNombre = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV7cClienteNombre = "" ;
      lV8cClienteEmail = "" ;
      lV9cClienteNombreEmail1 = "" ;
      lV10cClienteEmail1 = "" ;
      lV11cClienteNombreEmail2 = "" ;
      lV12cClienteEmail2 = "" ;
      A46ClienteEmail = "" ;
      A47ClienteNombreEmail1 = "" ;
      A48ClienteEmail1 = "" ;
      A49ClienteNombreEmail2 = "" ;
      A50ClienteEmail2 = "" ;
      H000B2_A50ClienteEmail2 = new String[] {""} ;
      H000B2_n50ClienteEmail2 = new boolean[] {false} ;
      H000B2_A49ClienteNombreEmail2 = new String[] {""} ;
      H000B2_n49ClienteNombreEmail2 = new boolean[] {false} ;
      H000B2_A48ClienteEmail1 = new String[] {""} ;
      H000B2_n48ClienteEmail1 = new boolean[] {false} ;
      H000B2_A47ClienteNombreEmail1 = new String[] {""} ;
      H000B2_n47ClienteNombreEmail1 = new boolean[] {false} ;
      H000B2_A46ClienteEmail = new String[] {""} ;
      H000B2_n46ClienteEmail = new boolean[] {false} ;
      H000B2_A45ClienteNombre = new String[] {""} ;
      H000B2_n45ClienteNombre = new boolean[] {false} ;
      H000B2_A4ClienteId = new long[1] ;
      H000B3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gx0040__default(),
         new Object[] {
             new Object[] {
            H000B2_A50ClienteEmail2, H000B2_n50ClienteEmail2, H000B2_A49ClienteNombreEmail2, H000B2_n49ClienteNombreEmail2, H000B2_A48ClienteEmail1, H000B2_n48ClienteEmail1, H000B2_A47ClienteNombreEmail1, H000B2_n47ClienteNombreEmail1, H000B2_A46ClienteEmail, H000B2_n46ClienteEmail,
            H000B2_A45ClienteNombre, H000B2_n45ClienteNombre, H000B2_A4ClienteId
            }
            , new Object[] {
            H000B3_AGRID1_nRecordCount
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
   private int edtavCclienteid_Enabled ;
   private int edtavCclienteid_Visible ;
   private int edtavCclientenombre_Visible ;
   private int edtavCclientenombre_Enabled ;
   private int edtavCclienteemail_Visible ;
   private int edtavCclienteemail_Enabled ;
   private int edtavCclientenombreemail1_Visible ;
   private int edtavCclientenombreemail1_Enabled ;
   private int edtavCclienteemail1_Visible ;
   private int edtavCclienteemail1_Enabled ;
   private int edtavCclientenombreemail2_Visible ;
   private int edtavCclientenombreemail2_Enabled ;
   private int edtavCclienteemail2_Visible ;
   private int edtavCclienteemail2_Enabled ;
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
   private long AV6cClienteId ;
   private long AV13pClienteId ;
   private long A4ClienteId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divClienteidfiltercontainer_Class ;
   private String divClientenombrefiltercontainer_Class ;
   private String divClienteemailfiltercontainer_Class ;
   private String divClientenombreemail1filtercontainer_Class ;
   private String divClienteemail1filtercontainer_Class ;
   private String divClientenombreemail2filtercontainer_Class ;
   private String divClienteemail2filtercontainer_Class ;
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
   private String divClienteidfiltercontainer_Internalname ;
   private String lblLblclienteidfilter_Internalname ;
   private String lblLblclienteidfilter_Jsonclick ;
   private String edtavCclienteid_Internalname ;
   private String TempTags ;
   private String edtavCclienteid_Jsonclick ;
   private String divClientenombrefiltercontainer_Internalname ;
   private String lblLblclientenombrefilter_Internalname ;
   private String lblLblclientenombrefilter_Jsonclick ;
   private String edtavCclientenombre_Internalname ;
   private String edtavCclientenombre_Jsonclick ;
   private String divClienteemailfiltercontainer_Internalname ;
   private String lblLblclienteemailfilter_Internalname ;
   private String lblLblclienteemailfilter_Jsonclick ;
   private String edtavCclienteemail_Internalname ;
   private String edtavCclienteemail_Jsonclick ;
   private String divClientenombreemail1filtercontainer_Internalname ;
   private String lblLblclientenombreemail1filter_Internalname ;
   private String lblLblclientenombreemail1filter_Jsonclick ;
   private String edtavCclientenombreemail1_Internalname ;
   private String edtavCclientenombreemail1_Jsonclick ;
   private String divClienteemail1filtercontainer_Internalname ;
   private String lblLblclienteemail1filter_Internalname ;
   private String lblLblclienteemail1filter_Jsonclick ;
   private String edtavCclienteemail1_Internalname ;
   private String edtavCclienteemail1_Jsonclick ;
   private String divClientenombreemail2filtercontainer_Internalname ;
   private String lblLblclientenombreemail2filter_Internalname ;
   private String lblLblclientenombreemail2filter_Jsonclick ;
   private String edtavCclientenombreemail2_Internalname ;
   private String edtavCclientenombreemail2_Jsonclick ;
   private String divClienteemail2filtercontainer_Internalname ;
   private String lblLblclienteemail2filter_Internalname ;
   private String lblLblclienteemail2filter_Jsonclick ;
   private String edtavCclienteemail2_Internalname ;
   private String edtavCclienteemail2_Jsonclick ;
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
   private String edtClienteNombre_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtClienteId_Internalname ;
   private String edtClienteNombre_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtClienteId_Jsonclick ;
   private String edtClienteNombre_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n45ClienteNombre ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n50ClienteEmail2 ;
   private boolean n49ClienteNombreEmail2 ;
   private boolean n48ClienteEmail1 ;
   private boolean n47ClienteNombreEmail1 ;
   private boolean n46ClienteEmail ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cClienteNombre ;
   private String AV8cClienteEmail ;
   private String AV9cClienteNombreEmail1 ;
   private String AV10cClienteEmail1 ;
   private String AV11cClienteNombreEmail2 ;
   private String AV12cClienteEmail2 ;
   private String A45ClienteNombre ;
   private String AV17Linkselection_GXI ;
   private String lV7cClienteNombre ;
   private String lV8cClienteEmail ;
   private String lV9cClienteNombreEmail1 ;
   private String lV10cClienteEmail1 ;
   private String lV11cClienteNombreEmail2 ;
   private String lV12cClienteEmail2 ;
   private String A46ClienteEmail ;
   private String A47ClienteNombreEmail1 ;
   private String A48ClienteEmail1 ;
   private String A49ClienteNombreEmail2 ;
   private String A50ClienteEmail2 ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H000B2_A50ClienteEmail2 ;
   private boolean[] H000B2_n50ClienteEmail2 ;
   private String[] H000B2_A49ClienteNombreEmail2 ;
   private boolean[] H000B2_n49ClienteNombreEmail2 ;
   private String[] H000B2_A48ClienteEmail1 ;
   private boolean[] H000B2_n48ClienteEmail1 ;
   private String[] H000B2_A47ClienteNombreEmail1 ;
   private boolean[] H000B2_n47ClienteNombreEmail1 ;
   private String[] H000B2_A46ClienteEmail ;
   private boolean[] H000B2_n46ClienteEmail ;
   private String[] H000B2_A45ClienteNombre ;
   private boolean[] H000B2_n45ClienteNombre ;
   private long[] H000B2_A4ClienteId ;
   private long[] H000B3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0040__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cClienteNombre ,
                                          String AV8cClienteEmail ,
                                          String AV9cClienteNombreEmail1 ,
                                          String AV10cClienteEmail1 ,
                                          String AV11cClienteNombreEmail2 ,
                                          String AV12cClienteEmail2 ,
                                          String A45ClienteNombre ,
                                          String A46ClienteEmail ,
                                          String A47ClienteNombreEmail1 ,
                                          String A48ClienteEmail1 ,
                                          String A49ClienteNombreEmail2 ,
                                          String A50ClienteEmail2 ,
                                          long AV6cClienteId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `ClienteEmail2`, `ClienteNombreEmail2`, `ClienteEmail1`, `ClienteNombreEmail1`, `ClienteEmail`, `ClienteNombre`, `ClienteId`" ;
      sFromString = " FROM `Cliente`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`ClienteId` >= ?)");
      if ( ! (GXutil.strcmp("", AV7cClienteNombre)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombre` like ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cClienteEmail)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail` like ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cClienteNombreEmail1)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombreEmail1` like ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cClienteEmail1)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail1` like ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cClienteNombreEmail2)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombreEmail2` like ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cClienteEmail2)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail2` like ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `ClienteId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cClienteNombre ,
                                          String AV8cClienteEmail ,
                                          String AV9cClienteNombreEmail1 ,
                                          String AV10cClienteEmail1 ,
                                          String AV11cClienteNombreEmail2 ,
                                          String AV12cClienteEmail2 ,
                                          String A45ClienteNombre ,
                                          String A46ClienteEmail ,
                                          String A47ClienteNombreEmail1 ,
                                          String A48ClienteEmail1 ,
                                          String A49ClienteNombreEmail2 ,
                                          String A50ClienteEmail2 ,
                                          long AV6cClienteId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Cliente`" ;
      addWhere(sWhereString, "(`ClienteId` >= ?)");
      if ( ! (GXutil.strcmp("", AV7cClienteNombre)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombre` like ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cClienteEmail)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail` like ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cClienteNombreEmail1)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombreEmail1` like ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cClienteEmail1)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail1` like ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cClienteNombreEmail2)==0) )
      {
         addWhere(sWhereString, "(`ClienteNombreEmail2` like ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cClienteEmail2)==0) )
      {
         addWhere(sWhereString, "(`ClienteEmail2` like ?)");
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
                  return conditional_H000B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H000B3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
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
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               return;
      }
   }

}

