package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0090_impl extends GXDataArea
{
   public gx0090_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0090_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0090_impl.class ));
   }

   public gx0090_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavCanunciopublico = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "pAnuncioId") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "pAnuncioId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pAnuncioId") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
            nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
            sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
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
            AV6cAnuncioId = GXutil.lval( httpContext.GetPar( "cAnuncioId")) ;
            AV7cAnuncioTitulo = httpContext.GetPar( "cAnuncioTitulo") ;
            AV8cAnuncioSubTitulo = httpContext.GetPar( "cAnuncioSubTitulo") ;
            AV9cAnuncioPublico = GXutil.strtobool( httpContext.GetPar( "cAnuncioPublico")) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOIDFILTERCONTAINER_Class", GXutil.rtrim( divAnuncioidfiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOTITULOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciotitulofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOSUBTITULOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciosubtitulofiltercontainer_Class));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOPUBLICOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciopublicofiltercontainer_Class));
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
            AV10pAnuncioId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10pAnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10pAnuncioId), 18, 0));
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
      pa112( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start112( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20231261545423", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gx0090", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV10pAnuncioId,18,0))}, new String[] {"pAnuncioId"}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCANUNCIOID", GXutil.ltrim( localUtil.ntoc( AV6cAnuncioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCANUNCIOTITULO", AV7cAnuncioTitulo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCANUNCIOSUBTITULO", AV8cAnuncioSubTitulo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vCANUNCIOPUBLICO", GXutil.booltostr( AV9cAnuncioPublico));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPANUNCIOID", GXutil.ltrim( localUtil.ntoc( AV10pAnuncioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOIDFILTERCONTAINER_Class", GXutil.rtrim( divAnuncioidfiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOTITULOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciotitulofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOSUBTITULOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciosubtitulofiltercontainer_Class));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOPUBLICOFILTERCONTAINER_Class", GXutil.rtrim( divAnunciopublicofiltercontainer_Class));
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
         we112( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt112( ) ;
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
      return formatLink("com.colaveco.gx0090", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV10pAnuncioId,18,0))}, new String[] {"pAnuncioId"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0090" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Anuncio" ;
   }

   public void wb110( )
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAnuncioidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divAnuncioidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblanuncioidfilter_Internalname, "Anuncio Id", "", "", lblLblanuncioidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11111_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0090.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCanuncioid_Internalname, "Anuncio Id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCanuncioid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cAnuncioId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCanuncioid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cAnuncioId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cAnuncioId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanuncioid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCanuncioid_Visible, edtavCanuncioid_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Gx0090.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAnunciotitulofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAnunciotitulofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblanunciotitulofilter_Internalname, "Anuncio Titulo", "", "", lblLblanunciotitulofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12111_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0090.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCanunciotitulo_Internalname, "Anuncio Titulo", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCanunciotitulo_Internalname, AV7cAnuncioTitulo, GXutil.rtrim( localUtil.format( AV7cAnuncioTitulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanunciotitulo_Jsonclick, 0, "Attribute", "", "", "", "", edtavCanunciotitulo_Visible, edtavCanunciotitulo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0090.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAnunciosubtitulofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAnunciosubtitulofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblanunciosubtitulofilter_Internalname, "Anuncio Sub Titulo", "", "", lblLblanunciosubtitulofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13111_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0090.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavCanunciosubtitulo_Internalname, "Anuncio Sub Titulo", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavCanunciosubtitulo_Internalname, AV8cAnuncioSubTitulo, GXutil.rtrim( localUtil.format( AV8cAnuncioSubTitulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanunciosubtitulo_Jsonclick, 0, "Attribute", "", "", "", "", edtavCanunciosubtitulo_Visible, edtavCanunciosubtitulo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Gx0090.htm");
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divAnunciopublicofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAnunciopublicofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblLblanunciopublicofilter_Internalname, "Anuncio Publico", "", "", lblLblanunciopublicofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14111_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0090.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, chkavCanunciopublico.getInternalname(), "Anuncio Publico", "col-sm-3 AttributeLabel", 0, true, "");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCanunciopublico.getInternalname(), GXutil.booltostr( AV9cAnuncioPublico), "", "Anuncio Publico", chkavCanunciopublico.getVisible(), chkavCanunciopublico.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(46, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,46);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15111_client"+"'", TempTags, "", 2, "HLP_Gx0090.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"54\">") ;
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
            httpContext.writeValue( "Titulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Sub Titulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ImageAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Imagen") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A193AnuncioTitulo);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtAnuncioTitulo_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A194AnuncioSubTitulo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( A195AnuncioImagen));
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
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0090.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 54 )
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

   public void start112( )
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
         Form.getMeta().addItem("description", "Selection List Anuncio", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup110( ) ;
   }

   public void ws112( )
   {
      start112( ) ;
      evt112( ) ;
   }

   public void evt112( )
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
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_54_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A192AnuncioId = localUtil.ctol( httpContext.cgiGet( edtAnuncioId_Internalname), ".", ",") ;
                           A193AnuncioTitulo = httpContext.cgiGet( edtAnuncioTitulo_Internalname) ;
                           A194AnuncioSubTitulo = httpContext.cgiGet( edtAnuncioSubTitulo_Internalname) ;
                           n194AnuncioSubTitulo = false ;
                           A195AnuncioImagen = httpContext.cgiGet( edtAnuncioImagen_Internalname) ;
                           n195AnuncioImagen = false ;
                           httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), !bGXsfl_54_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16112 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e17112 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Canuncioid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCANUNCIOID"), ".", ",") != AV6cAnuncioId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Canunciotitulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCANUNCIOTITULO"), AV7cAnuncioTitulo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Canunciosubtitulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCANUNCIOSUBTITULO"), AV8cAnuncioSubTitulo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Canunciopublico Changed */
                                    if ( GXutil.strtobool( httpContext.cgiGet( "GXH_vCANUNCIOPUBLICO")) != AV9cAnuncioPublico )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e18112 ();
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

   public void we112( )
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

   public void pa112( )
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cAnuncioId ,
                                  String AV7cAnuncioTitulo ,
                                  String AV8cAnuncioSubTitulo ,
                                  boolean AV9cAnuncioPublico )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf112( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_ANUNCIOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOID", GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")));
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
      AV9cAnuncioPublico = GXutil.strtobool( GXutil.booltostr( AV9cAnuncioPublico)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cAnuncioPublico", AV9cAnuncioPublico);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf112( ) ;
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

   public void rf112( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(54) ;
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cAnuncioTitulo ,
                                              AV8cAnuncioSubTitulo ,
                                              Boolean.valueOf(AV9cAnuncioPublico) ,
                                              A193AnuncioTitulo ,
                                              A194AnuncioSubTitulo ,
                                              Boolean.valueOf(A196AnuncioPublico) ,
                                              Long.valueOf(AV6cAnuncioId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         lV7cAnuncioTitulo = GXutil.concat( GXutil.rtrim( AV7cAnuncioTitulo), "%", "") ;
         lV8cAnuncioSubTitulo = GXutil.concat( GXutil.rtrim( AV8cAnuncioSubTitulo), "%", "") ;
         /* Using cursor H00112 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6cAnuncioId), lV7cAnuncioTitulo, lV8cAnuncioSubTitulo, Boolean.valueOf(AV9cAnuncioPublico), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_54_idx = 1 ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A196AnuncioPublico = H00112_A196AnuncioPublico[0] ;
            n196AnuncioPublico = H00112_n196AnuncioPublico[0] ;
            A195AnuncioImagen = H00112_A195AnuncioImagen[0] ;
            n195AnuncioImagen = H00112_n195AnuncioImagen[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), !bGXsfl_54_Refreshing);
            httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
            A40000AnuncioImagen_GXI = H00112_A40000AnuncioImagen_GXI[0] ;
            n40000AnuncioImagen_GXI = H00112_n40000AnuncioImagen_GXI[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), !bGXsfl_54_Refreshing);
            httpContext.ajax_rsp_assign_prop("", false, edtAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
            A194AnuncioSubTitulo = H00112_A194AnuncioSubTitulo[0] ;
            n194AnuncioSubTitulo = H00112_n194AnuncioSubTitulo[0] ;
            A193AnuncioTitulo = H00112_A193AnuncioTitulo[0] ;
            A192AnuncioId = H00112_A192AnuncioId[0] ;
            /* Execute user event: Load */
            e17112 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb110( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes112( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_ANUNCIOID"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9")));
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
                                           AV7cAnuncioTitulo ,
                                           AV8cAnuncioSubTitulo ,
                                           Boolean.valueOf(AV9cAnuncioPublico) ,
                                           A193AnuncioTitulo ,
                                           A194AnuncioSubTitulo ,
                                           Boolean.valueOf(A196AnuncioPublico) ,
                                           Long.valueOf(AV6cAnuncioId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV7cAnuncioTitulo = GXutil.concat( GXutil.rtrim( AV7cAnuncioTitulo), "%", "") ;
      lV8cAnuncioSubTitulo = GXutil.concat( GXutil.rtrim( AV8cAnuncioSubTitulo), "%", "") ;
      /* Using cursor H00113 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV6cAnuncioId), lV7cAnuncioTitulo, lV8cAnuncioSubTitulo, Boolean.valueOf(AV9cAnuncioPublico)});
      GRID1_nRecordCount = H00113_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cAnuncioId, AV7cAnuncioTitulo, AV8cAnuncioSubTitulo, AV9cAnuncioPublico) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup110( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16112 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCanuncioid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCanuncioid_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANUNCIOID");
            GX_FocusControl = edtavCanuncioid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cAnuncioId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cAnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cAnuncioId), 18, 0));
         }
         else
         {
            AV6cAnuncioId = localUtil.ctol( httpContext.cgiGet( edtavCanuncioid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cAnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cAnuncioId), 18, 0));
         }
         AV7cAnuncioTitulo = httpContext.cgiGet( edtavCanunciotitulo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cAnuncioTitulo", AV7cAnuncioTitulo);
         AV8cAnuncioSubTitulo = httpContext.cgiGet( edtavCanunciosubtitulo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAnuncioSubTitulo", AV8cAnuncioSubTitulo);
         AV9cAnuncioPublico = GXutil.strtobool( httpContext.cgiGet( chkavCanunciopublico.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cAnuncioPublico", AV9cAnuncioPublico);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCANUNCIOID"), ".", ",") != AV6cAnuncioId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCANUNCIOTITULO"), AV7cAnuncioTitulo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCANUNCIOSUBTITULO"), AV8cAnuncioSubTitulo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strtobool( httpContext.cgiGet( "GXH_vCANUNCIOPUBLICO")) != AV9cAnuncioPublico )
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
      e16112 ();
      if (returnInSub) return;
   }

   public void e16112( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "Anuncio", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV11ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e17112( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV14Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_542( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e18112 ();
      if (returnInSub) return;
   }

   public void e18112( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV10pAnuncioId = A192AnuncioId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pAnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10pAnuncioId), 18, 0));
      httpContext.setWebReturnParms(new Object[] {Long.valueOf(AV10pAnuncioId)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV10pAnuncioId"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10pAnuncioId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pAnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10pAnuncioId), 18, 0));
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
      pa112( ) ;
      ws112( ) ;
      we112( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20231261545524", true, true);
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
      httpContext.AddJavascriptSource("gx0090.js", "?20231261545528", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_idx ;
      edtAnuncioId_Internalname = "ANUNCIOID_"+sGXsfl_54_idx ;
      edtAnuncioTitulo_Internalname = "ANUNCIOTITULO_"+sGXsfl_54_idx ;
      edtAnuncioSubTitulo_Internalname = "ANUNCIOSUBTITULO_"+sGXsfl_54_idx ;
      edtAnuncioImagen_Internalname = "ANUNCIOIMAGEN_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_fel_idx ;
      edtAnuncioId_Internalname = "ANUNCIOID_"+sGXsfl_54_fel_idx ;
      edtAnuncioTitulo_Internalname = "ANUNCIOTITULO_"+sGXsfl_54_fel_idx ;
      edtAnuncioSubTitulo_Internalname = "ANUNCIOSUBTITULO_"+sGXsfl_54_fel_idx ;
      edtAnuncioImagen_Internalname = "ANUNCIOIMAGEN_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb110( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_54_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV14Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAnuncioId_Internalname,GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAnuncioId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtAnuncioTitulo_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtAnuncioTitulo_Internalname, "Link", edtAnuncioTitulo_Link, !bGXsfl_54_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAnuncioTitulo_Internalname,A193AnuncioTitulo,"","","'"+""+"'"+",false,"+"'"+""+"'",edtAnuncioTitulo_Link,"","","",edtAnuncioTitulo_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAnuncioSubTitulo_Internalname,A194AnuncioSubTitulo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAnuncioSubTitulo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "ImageAttribute" ;
         StyleString = "" ;
         A195AnuncioImagen_IsBlob = (boolean)(((GXutil.strcmp("", A195AnuncioImagen)==0)&&(GXutil.strcmp("", A40000AnuncioImagen_GXI)==0))||!(GXutil.strcmp("", A195AnuncioImagen)==0)) ;
         sImgUrl = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.getResourceRelative(A195AnuncioImagen)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtAnuncioImagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWColumn OptionalColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(A195AnuncioImagen_IsBlob),Boolean.valueOf(true),context.getHttpContext().getImageSrcSet( sImgUrl)});
         send_integrity_lvl_hashes112( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void init_default_properties( )
   {
      lblLblanuncioidfilter_Internalname = "LBLANUNCIOIDFILTER" ;
      edtavCanuncioid_Internalname = "vCANUNCIOID" ;
      divAnuncioidfiltercontainer_Internalname = "ANUNCIOIDFILTERCONTAINER" ;
      lblLblanunciotitulofilter_Internalname = "LBLANUNCIOTITULOFILTER" ;
      edtavCanunciotitulo_Internalname = "vCANUNCIOTITULO" ;
      divAnunciotitulofiltercontainer_Internalname = "ANUNCIOTITULOFILTERCONTAINER" ;
      lblLblanunciosubtitulofilter_Internalname = "LBLANUNCIOSUBTITULOFILTER" ;
      edtavCanunciosubtitulo_Internalname = "vCANUNCIOSUBTITULO" ;
      divAnunciosubtitulofiltercontainer_Internalname = "ANUNCIOSUBTITULOFILTERCONTAINER" ;
      lblLblanunciopublicofilter_Internalname = "LBLANUNCIOPUBLICOFILTER" ;
      chkavCanunciopublico.setInternalname( "vCANUNCIOPUBLICO" );
      divAnunciopublicofiltercontainer_Internalname = "ANUNCIOPUBLICOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtAnuncioId_Internalname = "ANUNCIOID" ;
      edtAnuncioTitulo_Internalname = "ANUNCIOTITULO" ;
      edtAnuncioSubTitulo_Internalname = "ANUNCIOSUBTITULO" ;
      edtAnuncioImagen_Internalname = "ANUNCIOIMAGEN" ;
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
      edtAnuncioSubTitulo_Jsonclick = "" ;
      edtAnuncioTitulo_Jsonclick = "" ;
      edtAnuncioId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtAnuncioTitulo_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Header = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavCanunciopublico.setEnabled( 1 );
      chkavCanunciopublico.setVisible( 1 );
      edtavCanunciosubtitulo_Jsonclick = "" ;
      edtavCanunciosubtitulo_Enabled = 1 ;
      edtavCanunciosubtitulo_Visible = 1 ;
      edtavCanunciotitulo_Jsonclick = "" ;
      edtavCanunciotitulo_Enabled = 1 ;
      edtavCanunciotitulo_Visible = 1 ;
      edtavCanuncioid_Jsonclick = "" ;
      edtavCanuncioid_Enabled = 1 ;
      edtavCanuncioid_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Anuncio" );
      divAnunciopublicofiltercontainer_Class = "AdvancedContainerItem" ;
      divAnunciosubtitulofiltercontainer_Class = "AdvancedContainerItem" ;
      divAnunciotitulofiltercontainer_Class = "AdvancedContainerItem" ;
      divAnuncioidfiltercontainer_Class = "AdvancedContainerItem" ;
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
      chkavCanunciopublico.setName( "vCANUNCIOPUBLICO" );
      chkavCanunciopublico.setWebtags( "" );
      chkavCanunciopublico.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCanunciopublico.getInternalname(), "TitleCaption", chkavCanunciopublico.getCaption(), true);
      chkavCanunciopublico.setCheckedValue( "false" );
      AV9cAnuncioPublico = GXutil.strtobool( GXutil.booltostr( AV9cAnuncioPublico)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cAnuncioPublico", AV9cAnuncioPublico);
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cAnuncioId',fld:'vCANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cAnuncioTitulo',fld:'vCANUNCIOTITULO',pic:''},{av:'AV8cAnuncioSubTitulo',fld:'vCANUNCIOSUBTITULO',pic:''},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("'TOGGLE'","{handler:'e15111',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("LBLANUNCIOIDFILTER.CLICK","{handler:'e11111',iparms:[{av:'divAnuncioidfiltercontainer_Class',ctrl:'ANUNCIOIDFILTERCONTAINER',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("LBLANUNCIOIDFILTER.CLICK",",oparms:[{av:'divAnuncioidfiltercontainer_Class',ctrl:'ANUNCIOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCanuncioid_Visible',ctrl:'vCANUNCIOID',prop:'Visible'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("LBLANUNCIOTITULOFILTER.CLICK","{handler:'e12111',iparms:[{av:'divAnunciotitulofiltercontainer_Class',ctrl:'ANUNCIOTITULOFILTERCONTAINER',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("LBLANUNCIOTITULOFILTER.CLICK",",oparms:[{av:'divAnunciotitulofiltercontainer_Class',ctrl:'ANUNCIOTITULOFILTERCONTAINER',prop:'Class'},{av:'edtavCanunciotitulo_Visible',ctrl:'vCANUNCIOTITULO',prop:'Visible'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("LBLANUNCIOSUBTITULOFILTER.CLICK","{handler:'e13111',iparms:[{av:'divAnunciosubtitulofiltercontainer_Class',ctrl:'ANUNCIOSUBTITULOFILTERCONTAINER',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("LBLANUNCIOSUBTITULOFILTER.CLICK",",oparms:[{av:'divAnunciosubtitulofiltercontainer_Class',ctrl:'ANUNCIOSUBTITULOFILTERCONTAINER',prop:'Class'},{av:'edtavCanunciosubtitulo_Visible',ctrl:'vCANUNCIOSUBTITULO',prop:'Visible'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("LBLANUNCIOPUBLICOFILTER.CLICK","{handler:'e14111',iparms:[{av:'divAnunciopublicofiltercontainer_Class',ctrl:'ANUNCIOPUBLICOFILTERCONTAINER',prop:'Class'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("LBLANUNCIOPUBLICOFILTER.CLICK",",oparms:[{av:'divAnunciopublicofiltercontainer_Class',ctrl:'ANUNCIOPUBLICOFILTERCONTAINER',prop:'Class'},{av:'chkavCanunciopublico.getVisible()',ctrl:'vCANUNCIOPUBLICO',prop:'Visible'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e18112',iparms:[{av:'A192AnuncioId',fld:'ANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV10pAnuncioId',fld:'vPANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cAnuncioId',fld:'vCANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cAnuncioTitulo',fld:'vCANUNCIOTITULO',pic:''},{av:'AV8cAnuncioSubTitulo',fld:'vCANUNCIOSUBTITULO',pic:''},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cAnuncioId',fld:'vCANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cAnuncioTitulo',fld:'vCANUNCIOTITULO',pic:''},{av:'AV8cAnuncioSubTitulo',fld:'vCANUNCIOSUBTITULO',pic:''},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cAnuncioId',fld:'vCANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cAnuncioTitulo',fld:'vCANUNCIOTITULO',pic:''},{av:'AV8cAnuncioSubTitulo',fld:'vCANUNCIOSUBTITULO',pic:''},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cAnuncioId',fld:'vCANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV7cAnuncioTitulo',fld:'vCANUNCIOTITULO',pic:''},{av:'AV8cAnuncioSubTitulo',fld:'vCANUNCIOSUBTITULO',pic:''},{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Anuncioimagen',iparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'AV9cAnuncioPublico',fld:'vCANUNCIOPUBLICO',pic:''}]}");
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
      AV6cAnuncioId = 1 ;
      AV7cAnuncioTitulo = "" ;
      AV8cAnuncioSubTitulo = "" ;
      AV10pAnuncioId = 1 ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblanuncioidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblanunciotitulofilter_Jsonclick = "" ;
      lblLblanunciosubtitulofilter_Jsonclick = "" ;
      lblLblanunciopublicofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A193AnuncioTitulo = "" ;
      A194AnuncioSubTitulo = "" ;
      A195AnuncioImagen = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Linkselection_GXI = "" ;
      A40000AnuncioImagen_GXI = "" ;
      scmdbuf = "" ;
      lV7cAnuncioTitulo = "" ;
      lV8cAnuncioSubTitulo = "" ;
      H00112_A196AnuncioPublico = new boolean[] {false} ;
      H00112_n196AnuncioPublico = new boolean[] {false} ;
      H00112_A195AnuncioImagen = new String[] {""} ;
      H00112_n195AnuncioImagen = new boolean[] {false} ;
      H00112_A40000AnuncioImagen_GXI = new String[] {""} ;
      H00112_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      H00112_A194AnuncioSubTitulo = new String[] {""} ;
      H00112_n194AnuncioSubTitulo = new boolean[] {false} ;
      H00112_A193AnuncioTitulo = new String[] {""} ;
      H00112_A192AnuncioId = new long[1] ;
      H00113_AGRID1_nRecordCount = new long[1] ;
      AV11ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gx0090__default(),
         new Object[] {
             new Object[] {
            H00112_A196AnuncioPublico, H00112_n196AnuncioPublico, H00112_A195AnuncioImagen, H00112_n195AnuncioImagen, H00112_A40000AnuncioImagen_GXI, H00112_n40000AnuncioImagen_GXI, H00112_A194AnuncioSubTitulo, H00112_n194AnuncioSubTitulo, H00112_A193AnuncioTitulo, H00112_A192AnuncioId
            }
            , new Object[] {
            H00113_AGRID1_nRecordCount
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
   private int nRC_GXsfl_54 ;
   private int nGXsfl_54_idx=1 ;
   private int subGrid1_Rows ;
   private int edtavCanuncioid_Enabled ;
   private int edtavCanuncioid_Visible ;
   private int edtavCanunciotitulo_Visible ;
   private int edtavCanunciotitulo_Enabled ;
   private int edtavCanunciosubtitulo_Visible ;
   private int edtavCanunciosubtitulo_Enabled ;
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
   private long AV6cAnuncioId ;
   private long AV10pAnuncioId ;
   private long A192AnuncioId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divAnuncioidfiltercontainer_Class ;
   private String divAnunciotitulofiltercontainer_Class ;
   private String divAnunciosubtitulofiltercontainer_Class ;
   private String divAnunciopublicofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divAnuncioidfiltercontainer_Internalname ;
   private String lblLblanuncioidfilter_Internalname ;
   private String lblLblanuncioidfilter_Jsonclick ;
   private String edtavCanuncioid_Internalname ;
   private String TempTags ;
   private String edtavCanuncioid_Jsonclick ;
   private String divAnunciotitulofiltercontainer_Internalname ;
   private String lblLblanunciotitulofilter_Internalname ;
   private String lblLblanunciotitulofilter_Jsonclick ;
   private String edtavCanunciotitulo_Internalname ;
   private String edtavCanunciotitulo_Jsonclick ;
   private String divAnunciosubtitulofiltercontainer_Internalname ;
   private String lblLblanunciosubtitulofilter_Internalname ;
   private String lblLblanunciosubtitulofilter_Jsonclick ;
   private String edtavCanunciosubtitulo_Internalname ;
   private String edtavCanunciosubtitulo_Jsonclick ;
   private String divAnunciopublicofiltercontainer_Internalname ;
   private String lblLblanunciopublicofilter_Internalname ;
   private String lblLblanunciopublicofilter_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtable_Internalname ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String edtavLinkselection_Link ;
   private String edtAnuncioTitulo_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtAnuncioId_Internalname ;
   private String edtAnuncioTitulo_Internalname ;
   private String edtAnuncioSubTitulo_Internalname ;
   private String edtAnuncioImagen_Internalname ;
   private String scmdbuf ;
   private String AV11ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtAnuncioId_Jsonclick ;
   private String edtAnuncioTitulo_Jsonclick ;
   private String edtAnuncioSubTitulo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV9cAnuncioPublico ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean n194AnuncioSubTitulo ;
   private boolean n195AnuncioImagen ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean A196AnuncioPublico ;
   private boolean n196AnuncioPublico ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private boolean A195AnuncioImagen_IsBlob ;
   private String AV7cAnuncioTitulo ;
   private String AV8cAnuncioSubTitulo ;
   private String A193AnuncioTitulo ;
   private String A194AnuncioSubTitulo ;
   private String AV14Linkselection_GXI ;
   private String A40000AnuncioImagen_GXI ;
   private String lV7cAnuncioTitulo ;
   private String lV8cAnuncioSubTitulo ;
   private String AV5LinkSelection ;
   private String A195AnuncioImagen ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavCanunciopublico ;
   private IDataStoreProvider pr_default ;
   private boolean[] H00112_A196AnuncioPublico ;
   private boolean[] H00112_n196AnuncioPublico ;
   private String[] H00112_A195AnuncioImagen ;
   private boolean[] H00112_n195AnuncioImagen ;
   private String[] H00112_A40000AnuncioImagen_GXI ;
   private boolean[] H00112_n40000AnuncioImagen_GXI ;
   private String[] H00112_A194AnuncioSubTitulo ;
   private boolean[] H00112_n194AnuncioSubTitulo ;
   private String[] H00112_A193AnuncioTitulo ;
   private long[] H00112_A192AnuncioId ;
   private long[] H00113_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0090__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00112( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cAnuncioTitulo ,
                                          String AV8cAnuncioSubTitulo ,
                                          boolean AV9cAnuncioPublico ,
                                          String A193AnuncioTitulo ,
                                          String A194AnuncioSubTitulo ,
                                          boolean A196AnuncioPublico ,
                                          long AV6cAnuncioId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `AnuncioPublico`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioSubTitulo`, `AnuncioTitulo`, `AnuncioId`" ;
      sFromString = " FROM `Anuncio`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`AnuncioId` >= ?)");
      if ( ! (GXutil.strcmp("", AV7cAnuncioTitulo)==0) )
      {
         addWhere(sWhereString, "(`AnuncioTitulo` like ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cAnuncioSubTitulo)==0) )
      {
         addWhere(sWhereString, "(`AnuncioSubTitulo` like ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (false==AV9cAnuncioPublico) )
      {
         addWhere(sWhereString, "(`AnuncioPublico` >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `AnuncioId`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00113( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cAnuncioTitulo ,
                                          String AV8cAnuncioSubTitulo ,
                                          boolean AV9cAnuncioPublico ,
                                          String A193AnuncioTitulo ,
                                          String A194AnuncioSubTitulo ,
                                          boolean A196AnuncioPublico ,
                                          long AV6cAnuncioId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[4];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Anuncio`" ;
      addWhere(sWhereString, "(`AnuncioId` >= ?)");
      if ( ! (GXutil.strcmp("", AV7cAnuncioTitulo)==0) )
      {
         addWhere(sWhereString, "(`AnuncioTitulo` like ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cAnuncioSubTitulo)==0) )
      {
         addWhere(sWhereString, "(`AnuncioSubTitulo` like ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (false==AV9cAnuncioPublico) )
      {
         addWhere(sWhereString, "(`AnuncioPublico` >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
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
                  return conditional_H00112(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Boolean) dynConstraints[2]).booleanValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , ((Number) dynConstraints[6]).longValue() );
            case 1 :
                  return conditional_H00113(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Boolean) dynConstraints[2]).booleanValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , ((Number) dynConstraints[6]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00112", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00113", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((boolean[]) buf[0])[0] = rslt.getBoolean(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getMultimediaFile(2, rslt.getVarchar(3));
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getMultimediaUri(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((long[]) buf[9])[0] = rslt.getLong(6);
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
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 40);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBoolean(sIdx, ((Boolean) parms[9]).booleanValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 40);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBoolean(sIdx, ((Boolean) parms[7]).booleanValue());
               }
               return;
      }
   }

}

