package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class anuncio_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV7AnuncioId = GXutil.lval( httpContext.GetPar( "AnuncioId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AnuncioId), 18, 0));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vANUNCIOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AnuncioId), "ZZZZZZZZZZZZZZZZZ9")));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_7-156546", (short)(0)) ;
         }
         Form.getMeta().addItem("description", "Anuncio", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAnuncioTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public anuncio_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public anuncio_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( anuncio_impl.class ));
   }

   public anuncio_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkAnuncioPublico = UIFactory.getCheckbox(this);
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.colaveco.rwdmasterpage");
         MasterPageObj.setDataArea(this,false);
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

   public void fix_multi_value_controls( )
   {
      A196AnuncioPublico = GXutil.strtobool( GXutil.booltostr( A196AnuncioPublico)) ;
      n196AnuncioPublico = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.colaveco.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Anuncio", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAnuncioId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtAnuncioId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtAnuncioId_Internalname, GXutil.ltrim( localUtil.ntoc( A192AnuncioId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtAnuncioId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAnuncioId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAnuncioId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAnuncioTitulo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtAnuncioTitulo_Internalname, "Titulo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtAnuncioTitulo_Internalname, A193AnuncioTitulo, GXutil.rtrim( localUtil.format( A193AnuncioTitulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAnuncioTitulo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAnuncioTitulo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAnuncioSubTitulo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtAnuncioSubTitulo_Internalname, "Sub Titulo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtAnuncioSubTitulo_Internalname, A194AnuncioSubTitulo, GXutil.rtrim( localUtil.format( A194AnuncioSubTitulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAnuncioSubTitulo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAnuncioSubTitulo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAnuncioDescripcion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtAnuncioDescripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtAnuncioDescripcion_Internalname, A197AnuncioDescripcion, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtAnuncioDescripcion_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgAnuncioImagen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, "", "Imagen", "col-sm-3 ImageAttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ImageAttribute" ;
      StyleString = "" ;
      A195AnuncioImagen_IsBlob = (boolean)(((GXutil.strcmp("", A195AnuncioImagen)==0)&&(GXutil.strcmp("", A40000AnuncioImagen_GXI)==0))||!(GXutil.strcmp("", A195AnuncioImagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.getResourceRelative(A195AnuncioImagen)) ;
      com.colaveco.GxWebStd.gx_bitmap( httpContext, imgAnuncioImagen_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgAnuncioImagen_Enabled, "", "", 1, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "", "", "", 0, A195AnuncioImagen_IsBlob, true, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Anuncio.htm");
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "URL", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.getResourceRelative(A195AnuncioImagen)), true);
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "IsBlob", GXutil.booltostr( A195AnuncioImagen_IsBlob), true);
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkAnuncioPublico.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, chkAnuncioPublico.getInternalname(), "Publico", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkAnuncioPublico.getInternalname(), GXutil.booltostr( A196AnuncioPublico), "", "Publico", 1, chkAnuncioPublico.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(59, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,59);\"");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Anuncio.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11092 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z192AnuncioId = localUtil.ctol( httpContext.cgiGet( "Z192AnuncioId"), ".", ",") ;
            Z193AnuncioTitulo = httpContext.cgiGet( "Z193AnuncioTitulo") ;
            Z194AnuncioSubTitulo = httpContext.cgiGet( "Z194AnuncioSubTitulo") ;
            n194AnuncioSubTitulo = ((GXutil.strcmp("", A194AnuncioSubTitulo)==0) ? true : false) ;
            Z197AnuncioDescripcion = httpContext.cgiGet( "Z197AnuncioDescripcion") ;
            Z196AnuncioPublico = GXutil.strtobool( httpContext.cgiGet( "Z196AnuncioPublico")) ;
            n196AnuncioPublico = ((false==A196AnuncioPublico) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7AnuncioId = localUtil.ctol( httpContext.cgiGet( "vANUNCIOID"), ".", ",") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            A40000AnuncioImagen_GXI = httpContext.cgiGet( "ANUNCIOIMAGEN_GXI") ;
            n40000AnuncioImagen_GXI = ((GXutil.strcmp("", A40000AnuncioImagen_GXI)==0)&&(GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            AV11Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A192AnuncioId = localUtil.ctol( httpContext.cgiGet( edtAnuncioId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
            A193AnuncioTitulo = httpContext.cgiGet( edtAnuncioTitulo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A193AnuncioTitulo", A193AnuncioTitulo);
            A194AnuncioSubTitulo = httpContext.cgiGet( edtAnuncioSubTitulo_Internalname) ;
            n194AnuncioSubTitulo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A194AnuncioSubTitulo", A194AnuncioSubTitulo);
            n194AnuncioSubTitulo = ((GXutil.strcmp("", A194AnuncioSubTitulo)==0) ? true : false) ;
            A197AnuncioDescripcion = httpContext.cgiGet( edtAnuncioDescripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197AnuncioDescripcion", A197AnuncioDescripcion);
            A195AnuncioImagen = httpContext.cgiGet( imgAnuncioImagen_Internalname) ;
            n195AnuncioImagen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A195AnuncioImagen", A195AnuncioImagen);
            n195AnuncioImagen = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            A196AnuncioPublico = GXutil.strtobool( httpContext.cgiGet( chkAnuncioPublico.getInternalname())) ;
            n196AnuncioPublico = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
            n196AnuncioPublico = ((false==A196AnuncioPublico) ? true : false) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXv_char1[0] = A195AnuncioImagen ;
            GXv_char2[0] = A40000AnuncioImagen_GXI ;
            httpContext.getMultimediaValue(imgAnuncioImagen_Internalname, GXv_char1, GXv_char2);
            anuncio_impl.this.A195AnuncioImagen = GXv_char1[0] ;
            n195AnuncioImagen = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            anuncio_impl.this.A40000AnuncioImagen_GXI = GXv_char2[0] ;
            n40000AnuncioImagen_GXI = ((GXutil.strcmp("", A40000AnuncioImagen_GXI)==0)&&(GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            n40000AnuncioImagen_GXI = ((GXutil.strcmp("", A40000AnuncioImagen_GXI)==0)&&(GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            n195AnuncioImagen = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Anuncio");
            A192AnuncioId = localUtil.ctol( httpContext.cgiGet( edtAnuncioId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
            forbiddenHiddens.add("AnuncioId", localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A192AnuncioId != Z192AnuncioId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("anuncio:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A192AnuncioId = GXutil.lval( httpContext.GetPar( "AnuncioId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV7AnuncioId) )
               {
                  A192AnuncioId = AV7AnuncioId ;
                  httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
               }
               else
               {
                  if ( isIns( )  && (0==A192AnuncioId) && ( Gx_BScreen == 0 ) )
                  {
                     A192AnuncioId = 1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode9 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV7AnuncioId) )
                  {
                     A192AnuncioId = AV7AnuncioId ;
                     httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
                  }
                  else
                  {
                     if ( isIns( )  && (0==A192AnuncioId) && ( Gx_BScreen == 0 ) )
                     {
                        A192AnuncioId = 1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
                     }
                  }
                  Gx_mode = sMode9 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound9 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_090( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ANUNCIOID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAnuncioId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11092 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12092 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e12092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll099( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes099( ) ;
      }
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_090( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls099( ) ;
         }
         else
         {
            checkExtendedTable099( ) ;
            closeExtendedTableCursors099( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption090( )
   {
   }

   public void e11092( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( ! new com.colaveco.isauthorized(remoteHandle, context).executeUdp( AV11Pgmname) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("com.colaveco.notauthorized", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Pgmname))}, new String[] {"GxObject"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e12092( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.colaveco.wwanuncio", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm099( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z193AnuncioTitulo = T00093_A193AnuncioTitulo[0] ;
            Z194AnuncioSubTitulo = T00093_A194AnuncioSubTitulo[0] ;
            Z197AnuncioDescripcion = T00093_A197AnuncioDescripcion[0] ;
            Z196AnuncioPublico = T00093_A196AnuncioPublico[0] ;
         }
         else
         {
            Z193AnuncioTitulo = A193AnuncioTitulo ;
            Z194AnuncioSubTitulo = A194AnuncioSubTitulo ;
            Z197AnuncioDescripcion = A197AnuncioDescripcion ;
            Z196AnuncioPublico = A196AnuncioPublico ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z192AnuncioId = A192AnuncioId ;
         Z193AnuncioTitulo = A193AnuncioTitulo ;
         Z194AnuncioSubTitulo = A194AnuncioSubTitulo ;
         Z197AnuncioDescripcion = A197AnuncioDescripcion ;
         Z195AnuncioImagen = A195AnuncioImagen ;
         Z40000AnuncioImagen_GXI = A40000AnuncioImagen_GXI ;
         Z196AnuncioPublico = A196AnuncioPublico ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAnuncioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioId_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAnuncioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioId_Enabled), 5, 0), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7AnuncioId) )
      {
         A192AnuncioId = AV7AnuncioId ;
         httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
      }
      else
      {
         if ( isIns( )  && (0==A192AnuncioId) && ( Gx_BScreen == 0 ) )
         {
            A192AnuncioId = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
         }
      }
   }

   public void load099( )
   {
      /* Using cursor T00094 */
      pr_default.execute(2, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A193AnuncioTitulo = T00094_A193AnuncioTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193AnuncioTitulo", A193AnuncioTitulo);
         A194AnuncioSubTitulo = T00094_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = T00094_n194AnuncioSubTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194AnuncioSubTitulo", A194AnuncioSubTitulo);
         A197AnuncioDescripcion = T00094_A197AnuncioDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197AnuncioDescripcion", A197AnuncioDescripcion);
         A195AnuncioImagen = T00094_A195AnuncioImagen[0] ;
         n195AnuncioImagen = T00094_n195AnuncioImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195AnuncioImagen", A195AnuncioImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
         A40000AnuncioImagen_GXI = T00094_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = T00094_n40000AnuncioImagen_GXI[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
         A196AnuncioPublico = T00094_A196AnuncioPublico[0] ;
         n196AnuncioPublico = T00094_n196AnuncioPublico[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
         zm099( -3) ;
      }
      pr_default.close(2);
      onLoadActions099( ) ;
   }

   public void onLoadActions099( )
   {
      AV11Pgmname = "Anuncio" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void checkExtendedTable099( )
   {
      nIsDirty_9 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV11Pgmname = "Anuncio" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void closeExtendedTableCursors099( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey099( )
   {
      /* Using cursor T00095 */
      pr_default.execute(3, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00093 */
      pr_default.execute(1, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm099( 3) ;
         RcdFound9 = (short)(1) ;
         A192AnuncioId = T00093_A192AnuncioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
         A193AnuncioTitulo = T00093_A193AnuncioTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193AnuncioTitulo", A193AnuncioTitulo);
         A194AnuncioSubTitulo = T00093_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = T00093_n194AnuncioSubTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194AnuncioSubTitulo", A194AnuncioSubTitulo);
         A197AnuncioDescripcion = T00093_A197AnuncioDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197AnuncioDescripcion", A197AnuncioDescripcion);
         A195AnuncioImagen = T00093_A195AnuncioImagen[0] ;
         n195AnuncioImagen = T00093_n195AnuncioImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195AnuncioImagen", A195AnuncioImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
         A40000AnuncioImagen_GXI = T00093_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = T00093_n40000AnuncioImagen_GXI[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
         A196AnuncioPublico = T00093_A196AnuncioPublico[0] ;
         n196AnuncioPublico = T00093_n196AnuncioPublico[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
         Z192AnuncioId = A192AnuncioId ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load099( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey099( ) ;
         }
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey099( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey099( ) ;
      if ( RcdFound9 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00096 */
      pr_default.execute(4, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00096_A192AnuncioId[0] < A192AnuncioId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00096_A192AnuncioId[0] > A192AnuncioId ) ) )
         {
            A192AnuncioId = T00096_A192AnuncioId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00097 */
      pr_default.execute(5, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00097_A192AnuncioId[0] > A192AnuncioId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00097_A192AnuncioId[0] < A192AnuncioId ) ) )
         {
            A192AnuncioId = T00097_A192AnuncioId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey099( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAnuncioTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert099( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( A192AnuncioId != Z192AnuncioId )
            {
               A192AnuncioId = Z192AnuncioId ;
               httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ANUNCIOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAnuncioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAnuncioTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update099( ) ;
               GX_FocusControl = edtAnuncioTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A192AnuncioId != Z192AnuncioId )
            {
               /* Insert record */
               GX_FocusControl = edtAnuncioTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert099( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ANUNCIOID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAnuncioId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAnuncioTitulo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert099( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( A192AnuncioId != Z192AnuncioId )
      {
         A192AnuncioId = Z192AnuncioId ;
         httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ANUNCIOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAnuncioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAnuncioTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency099( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00092 */
         pr_default.execute(0, new Object[] {Long.valueOf(A192AnuncioId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Anuncio"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z193AnuncioTitulo, T00092_A193AnuncioTitulo[0]) != 0 ) || ( GXutil.strcmp(Z194AnuncioSubTitulo, T00092_A194AnuncioSubTitulo[0]) != 0 ) || ( GXutil.strcmp(Z197AnuncioDescripcion, T00092_A197AnuncioDescripcion[0]) != 0 ) || ( Z196AnuncioPublico != T00092_A196AnuncioPublico[0] ) )
         {
            if ( GXutil.strcmp(Z193AnuncioTitulo, T00092_A193AnuncioTitulo[0]) != 0 )
            {
               GXutil.writeLogln("anuncio:[seudo value changed for attri]"+"AnuncioTitulo");
               GXutil.writeLogRaw("Old: ",Z193AnuncioTitulo);
               GXutil.writeLogRaw("Current: ",T00092_A193AnuncioTitulo[0]);
            }
            if ( GXutil.strcmp(Z194AnuncioSubTitulo, T00092_A194AnuncioSubTitulo[0]) != 0 )
            {
               GXutil.writeLogln("anuncio:[seudo value changed for attri]"+"AnuncioSubTitulo");
               GXutil.writeLogRaw("Old: ",Z194AnuncioSubTitulo);
               GXutil.writeLogRaw("Current: ",T00092_A194AnuncioSubTitulo[0]);
            }
            if ( GXutil.strcmp(Z197AnuncioDescripcion, T00092_A197AnuncioDescripcion[0]) != 0 )
            {
               GXutil.writeLogln("anuncio:[seudo value changed for attri]"+"AnuncioDescripcion");
               GXutil.writeLogRaw("Old: ",Z197AnuncioDescripcion);
               GXutil.writeLogRaw("Current: ",T00092_A197AnuncioDescripcion[0]);
            }
            if ( Z196AnuncioPublico != T00092_A196AnuncioPublico[0] )
            {
               GXutil.writeLogln("anuncio:[seudo value changed for attri]"+"AnuncioPublico");
               GXutil.writeLogRaw("Old: ",Z196AnuncioPublico);
               GXutil.writeLogRaw("Current: ",T00092_A196AnuncioPublico[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Anuncio"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         zm099( 0) ;
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00098 */
                  pr_default.execute(6, new Object[] {A193AnuncioTitulo, Boolean.valueOf(n194AnuncioSubTitulo), A194AnuncioSubTitulo, A197AnuncioDescripcion, Boolean.valueOf(n195AnuncioImagen), A195AnuncioImagen, Boolean.valueOf(n40000AnuncioImagen_GXI), A40000AnuncioImagen_GXI, Boolean.valueOf(n196AnuncioPublico), Boolean.valueOf(A196AnuncioPublico)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00099 */
                  pr_default.execute(7);
                  A192AnuncioId = T00099_A192AnuncioId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load099( ) ;
         }
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void update099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000910 */
                  pr_default.execute(8, new Object[] {A193AnuncioTitulo, Boolean.valueOf(n194AnuncioSubTitulo), A194AnuncioSubTitulo, A197AnuncioDescripcion, Boolean.valueOf(n196AnuncioPublico), Boolean.valueOf(A196AnuncioPublico), Long.valueOf(A192AnuncioId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Anuncio"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate099( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void deferredUpdate099( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000911 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n195AnuncioImagen), A195AnuncioImagen, Boolean.valueOf(n40000AnuncioImagen_GXI), A40000AnuncioImagen_GXI, Long.valueOf(A192AnuncioId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
      }
   }

   public void delete( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls099( ) ;
         afterConfirm099( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete099( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000912 */
               pr_default.execute(10, new Object[] {Long.valueOf(A192AnuncioId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isIns( ) || isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel099( ) ;
      Gx_mode = sMode9 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls099( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV11Pgmname = "Anuncio" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      }
   }

   public void endLevel099( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete099( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anuncio");
         if ( AnyError == 0 )
         {
            confirmValues090( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anuncio");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart099( )
   {
      /* Scan By routine */
      /* Using cursor T000913 */
      pr_default.execute(11);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A192AnuncioId = T000913_A192AnuncioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext099( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A192AnuncioId = T000913_A192AnuncioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
      }
   }

   public void scanEnd099( )
   {
      pr_default.close(11);
   }

   public void afterConfirm099( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert099( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate099( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete099( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete099( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate099( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes099( )
   {
      edtAnuncioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioId_Enabled), 5, 0), true);
      edtAnuncioTitulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioTitulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioTitulo_Enabled), 5, 0), true);
      edtAnuncioSubTitulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioSubTitulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioSubTitulo_Enabled), 5, 0), true);
      edtAnuncioDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAnuncioDescripcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAnuncioDescripcion_Enabled), 5, 0), true);
      imgAnuncioImagen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAnuncioImagen_Enabled), 5, 0), true);
      chkAnuncioPublico.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkAnuncioPublico.getInternalname(), "Enabled", GXutil.ltrimstr( chkAnuncioPublico.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes099( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues090( )
   {
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
      MasterPageObj.master_styles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?20231261457104", false, true);
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
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.anuncio", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7AnuncioId,18,0))}, new String[] {"Gx_mode","AnuncioId"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Anuncio");
      forbiddenHiddens.add("AnuncioId", localUtil.format( DecimalUtil.doubleToDec(A192AnuncioId), "ZZZZZZZZZZZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anuncio:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z192AnuncioId", GXutil.ltrim( localUtil.ntoc( Z192AnuncioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z193AnuncioTitulo", Z193AnuncioTitulo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z194AnuncioSubTitulo", Z194AnuncioSubTitulo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z197AnuncioDescripcion", Z197AnuncioDescripcion);
      com.colaveco.GxWebStd.gx_boolean_hidden_field( httpContext, "Z196AnuncioPublico", Z196AnuncioPublico);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV9TrnContext));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vANUNCIOID", GXutil.ltrim( localUtil.ntoc( AV7AnuncioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vANUNCIOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AnuncioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "ANUNCIOIMAGEN_GXI", A40000AnuncioImagen_GXI);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV11Pgmname));
      GXCCtlgxBlob = "ANUNCIOIMAGEN" + "_gxBlob" ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A195AnuncioImagen);
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.colaveco.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("com.colaveco.anuncio", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7AnuncioId,18,0))}, new String[] {"Gx_mode","AnuncioId"})  ;
   }

   public String getPgmname( )
   {
      return "Anuncio" ;
   }

   public String getPgmdesc( )
   {
      return "Anuncio" ;
   }

   public void initializeNonKey099( )
   {
      A193AnuncioTitulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A193AnuncioTitulo", A193AnuncioTitulo);
      A194AnuncioSubTitulo = "" ;
      n194AnuncioSubTitulo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A194AnuncioSubTitulo", A194AnuncioSubTitulo);
      n194AnuncioSubTitulo = ((GXutil.strcmp("", A194AnuncioSubTitulo)==0) ? true : false) ;
      A197AnuncioDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A197AnuncioDescripcion", A197AnuncioDescripcion);
      A195AnuncioImagen = "" ;
      n195AnuncioImagen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A195AnuncioImagen", A195AnuncioImagen);
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
      n195AnuncioImagen = ((GXutil.strcmp("", A195AnuncioImagen)==0) ? true : false) ;
      A40000AnuncioImagen_GXI = "" ;
      n40000AnuncioImagen_GXI = false ;
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A195AnuncioImagen)==0) ? A40000AnuncioImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A195AnuncioImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgAnuncioImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A195AnuncioImagen), true);
      A196AnuncioPublico = false ;
      n196AnuncioPublico = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
      n196AnuncioPublico = ((false==A196AnuncioPublico) ? true : false) ;
      Z193AnuncioTitulo = "" ;
      Z194AnuncioSubTitulo = "" ;
      Z197AnuncioDescripcion = "" ;
      Z196AnuncioPublico = false ;
   }

   public void initAll099( )
   {
      A192AnuncioId = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A192AnuncioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A192AnuncioId), 18, 0));
      initializeNonKey099( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614571027", true, true);
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
      httpContext.AddJavascriptSource("anuncio.js", "?202312614571028", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtAnuncioId_Internalname = "ANUNCIOID" ;
      edtAnuncioTitulo_Internalname = "ANUNCIOTITULO" ;
      edtAnuncioSubTitulo_Internalname = "ANUNCIOSUBTITULO" ;
      edtAnuncioDescripcion_Internalname = "ANUNCIODESCRIPCION" ;
      imgAnuncioImagen_Internalname = "ANUNCIOIMAGEN" ;
      chkAnuncioPublico.setInternalname( "ANUNCIOPUBLICO" );
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Anuncio" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      chkAnuncioPublico.setEnabled( 1 );
      imgAnuncioImagen_Enabled = 1 ;
      edtAnuncioDescripcion_Enabled = 1 ;
      edtAnuncioSubTitulo_Jsonclick = "" ;
      edtAnuncioSubTitulo_Enabled = 1 ;
      edtAnuncioTitulo_Jsonclick = "" ;
      edtAnuncioTitulo_Enabled = 1 ;
      edtAnuncioId_Jsonclick = "" ;
      edtAnuncioId_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      chkAnuncioPublico.setName( "ANUNCIOPUBLICO" );
      chkAnuncioPublico.setWebtags( "" );
      chkAnuncioPublico.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkAnuncioPublico.getInternalname(), "TitleCaption", chkAnuncioPublico.getCaption(), true);
      chkAnuncioPublico.setCheckedValue( "false" );
      A196AnuncioPublico = GXutil.strtobool( GXutil.booltostr( A196AnuncioPublico)) ;
      n196AnuncioPublico = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196AnuncioPublico", A196AnuncioPublico);
      /* End function init_web_controls */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7AnuncioId',fld:'vANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true},{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7AnuncioId',fld:'vANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true},{av:'A192AnuncioId',fld:'ANUNCIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e12092',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]}");
      setEventMetadata("VALID_ANUNCIOID","{handler:'valid_Anuncioid',iparms:[{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]");
      setEventMetadata("VALID_ANUNCIOID",",oparms:[{av:'A196AnuncioPublico',fld:'ANUNCIOPUBLICO',pic:''}]}");
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
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z193AnuncioTitulo = "" ;
      Z194AnuncioSubTitulo = "" ;
      Z197AnuncioDescripcion = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7AnuncioId = 1 ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A193AnuncioTitulo = "" ;
      A194AnuncioSubTitulo = "" ;
      A197AnuncioDescripcion = "" ;
      A195AnuncioImagen = "" ;
      A40000AnuncioImagen_GXI = "" ;
      sImgUrl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV11Pgmname = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode9 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      Z195AnuncioImagen = "" ;
      Z40000AnuncioImagen_GXI = "" ;
      T00094_A192AnuncioId = new long[1] ;
      T00094_A193AnuncioTitulo = new String[] {""} ;
      T00094_A194AnuncioSubTitulo = new String[] {""} ;
      T00094_n194AnuncioSubTitulo = new boolean[] {false} ;
      T00094_A197AnuncioDescripcion = new String[] {""} ;
      T00094_A195AnuncioImagen = new String[] {""} ;
      T00094_n195AnuncioImagen = new boolean[] {false} ;
      T00094_A40000AnuncioImagen_GXI = new String[] {""} ;
      T00094_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      T00094_A196AnuncioPublico = new boolean[] {false} ;
      T00094_n196AnuncioPublico = new boolean[] {false} ;
      T00095_A192AnuncioId = new long[1] ;
      T00093_A192AnuncioId = new long[1] ;
      T00093_A193AnuncioTitulo = new String[] {""} ;
      T00093_A194AnuncioSubTitulo = new String[] {""} ;
      T00093_n194AnuncioSubTitulo = new boolean[] {false} ;
      T00093_A197AnuncioDescripcion = new String[] {""} ;
      T00093_A195AnuncioImagen = new String[] {""} ;
      T00093_n195AnuncioImagen = new boolean[] {false} ;
      T00093_A40000AnuncioImagen_GXI = new String[] {""} ;
      T00093_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      T00093_A196AnuncioPublico = new boolean[] {false} ;
      T00093_n196AnuncioPublico = new boolean[] {false} ;
      T00096_A192AnuncioId = new long[1] ;
      T00097_A192AnuncioId = new long[1] ;
      T00092_A192AnuncioId = new long[1] ;
      T00092_A193AnuncioTitulo = new String[] {""} ;
      T00092_A194AnuncioSubTitulo = new String[] {""} ;
      T00092_n194AnuncioSubTitulo = new boolean[] {false} ;
      T00092_A197AnuncioDescripcion = new String[] {""} ;
      T00092_A195AnuncioImagen = new String[] {""} ;
      T00092_n195AnuncioImagen = new boolean[] {false} ;
      T00092_A40000AnuncioImagen_GXI = new String[] {""} ;
      T00092_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      T00092_A196AnuncioPublico = new boolean[] {false} ;
      T00092_n196AnuncioPublico = new boolean[] {false} ;
      T00099_A192AnuncioId = new long[1] ;
      T000913_A192AnuncioId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXCCtlgxBlob = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.anuncio__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.anuncio__default(),
         new Object[] {
             new Object[] {
            T00092_A192AnuncioId, T00092_A193AnuncioTitulo, T00092_A194AnuncioSubTitulo, T00092_n194AnuncioSubTitulo, T00092_A197AnuncioDescripcion, T00092_A195AnuncioImagen, T00092_n195AnuncioImagen, T00092_A40000AnuncioImagen_GXI, T00092_n40000AnuncioImagen_GXI, T00092_A196AnuncioPublico,
            T00092_n196AnuncioPublico
            }
            , new Object[] {
            T00093_A192AnuncioId, T00093_A193AnuncioTitulo, T00093_A194AnuncioSubTitulo, T00093_n194AnuncioSubTitulo, T00093_A197AnuncioDescripcion, T00093_A195AnuncioImagen, T00093_n195AnuncioImagen, T00093_A40000AnuncioImagen_GXI, T00093_n40000AnuncioImagen_GXI, T00093_A196AnuncioPublico,
            T00093_n196AnuncioPublico
            }
            , new Object[] {
            T00094_A192AnuncioId, T00094_A193AnuncioTitulo, T00094_A194AnuncioSubTitulo, T00094_n194AnuncioSubTitulo, T00094_A197AnuncioDescripcion, T00094_A195AnuncioImagen, T00094_n195AnuncioImagen, T00094_A40000AnuncioImagen_GXI, T00094_n40000AnuncioImagen_GXI, T00094_A196AnuncioPublico,
            T00094_n196AnuncioPublico
            }
            , new Object[] {
            T00095_A192AnuncioId
            }
            , new Object[] {
            T00096_A192AnuncioId
            }
            , new Object[] {
            T00097_A192AnuncioId
            }
            , new Object[] {
            }
            , new Object[] {
            T00099_A192AnuncioId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000913_A192AnuncioId
            }
         }
      );
      Z192AnuncioId = 1 ;
      A192AnuncioId = 1 ;
      AV11Pgmname = "Anuncio" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private short nIsDirty_9 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtAnuncioId_Enabled ;
   private int edtAnuncioTitulo_Enabled ;
   private int edtAnuncioSubTitulo_Enabled ;
   private int edtAnuncioDescripcion_Enabled ;
   private int imgAnuncioImagen_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7AnuncioId ;
   private long Z192AnuncioId ;
   private long AV7AnuncioId ;
   private long A192AnuncioId ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAnuncioTitulo_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtAnuncioId_Internalname ;
   private String edtAnuncioId_Jsonclick ;
   private String edtAnuncioTitulo_Jsonclick ;
   private String edtAnuncioSubTitulo_Internalname ;
   private String edtAnuncioSubTitulo_Jsonclick ;
   private String edtAnuncioDescripcion_Internalname ;
   private String imgAnuncioImagen_Internalname ;
   private String sImgUrl ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV11Pgmname ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String hsh ;
   private String sMode9 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXCCtlgxBlob ;
   private boolean Z196AnuncioPublico ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A196AnuncioPublico ;
   private boolean n196AnuncioPublico ;
   private boolean A195AnuncioImagen_IsBlob ;
   private boolean n194AnuncioSubTitulo ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean n195AnuncioImagen ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String Z193AnuncioTitulo ;
   private String Z194AnuncioSubTitulo ;
   private String Z197AnuncioDescripcion ;
   private String A193AnuncioTitulo ;
   private String A194AnuncioSubTitulo ;
   private String A197AnuncioDescripcion ;
   private String A40000AnuncioImagen_GXI ;
   private String Z40000AnuncioImagen_GXI ;
   private String A195AnuncioImagen ;
   private String Z195AnuncioImagen ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkAnuncioPublico ;
   private IDataStoreProvider pr_default ;
   private long[] T00094_A192AnuncioId ;
   private String[] T00094_A193AnuncioTitulo ;
   private String[] T00094_A194AnuncioSubTitulo ;
   private boolean[] T00094_n194AnuncioSubTitulo ;
   private String[] T00094_A197AnuncioDescripcion ;
   private String[] T00094_A195AnuncioImagen ;
   private boolean[] T00094_n195AnuncioImagen ;
   private String[] T00094_A40000AnuncioImagen_GXI ;
   private boolean[] T00094_n40000AnuncioImagen_GXI ;
   private boolean[] T00094_A196AnuncioPublico ;
   private boolean[] T00094_n196AnuncioPublico ;
   private long[] T00095_A192AnuncioId ;
   private long[] T00093_A192AnuncioId ;
   private String[] T00093_A193AnuncioTitulo ;
   private String[] T00093_A194AnuncioSubTitulo ;
   private boolean[] T00093_n194AnuncioSubTitulo ;
   private String[] T00093_A197AnuncioDescripcion ;
   private String[] T00093_A195AnuncioImagen ;
   private boolean[] T00093_n195AnuncioImagen ;
   private String[] T00093_A40000AnuncioImagen_GXI ;
   private boolean[] T00093_n40000AnuncioImagen_GXI ;
   private boolean[] T00093_A196AnuncioPublico ;
   private boolean[] T00093_n196AnuncioPublico ;
   private long[] T00096_A192AnuncioId ;
   private long[] T00097_A192AnuncioId ;
   private long[] T00092_A192AnuncioId ;
   private String[] T00092_A193AnuncioTitulo ;
   private String[] T00092_A194AnuncioSubTitulo ;
   private boolean[] T00092_n194AnuncioSubTitulo ;
   private String[] T00092_A197AnuncioDescripcion ;
   private String[] T00092_A195AnuncioImagen ;
   private boolean[] T00092_n195AnuncioImagen ;
   private String[] T00092_A40000AnuncioImagen_GXI ;
   private boolean[] T00092_n40000AnuncioImagen_GXI ;
   private boolean[] T00092_A196AnuncioPublico ;
   private boolean[] T00092_n196AnuncioPublico ;
   private long[] T00099_A192AnuncioId ;
   private long[] T000913_A192AnuncioId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class anuncio__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "GAM";
   }

}

final  class anuncio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00092", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00093", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00094", "SELECT TM1.`AnuncioId`, TM1.`AnuncioTitulo`, TM1.`AnuncioSubTitulo`, TM1.`AnuncioDescripcion`, TM1.`AnuncioImagen`, TM1.`AnuncioImagen_GXI`, TM1.`AnuncioPublico` FROM `Anuncio` TM1 WHERE TM1.`AnuncioId` = ? ORDER BY TM1.`AnuncioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00095", "SELECT `AnuncioId` FROM `Anuncio` WHERE `AnuncioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00096", "SELECT `AnuncioId` FROM `Anuncio` WHERE ( `AnuncioId` > ?) ORDER BY `AnuncioId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00097", "SELECT `AnuncioId` FROM `Anuncio` WHERE ( `AnuncioId` < ?) ORDER BY `AnuncioId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00098", "INSERT INTO `Anuncio`(`AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("T00099", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000910", "UPDATE `Anuncio` SET `AnuncioTitulo`=?, `AnuncioSubTitulo`=?, `AnuncioDescripcion`=?, `AnuncioPublico`=?  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000911", "UPDATE `Anuncio` SET `AnuncioImagen`=?, `AnuncioImagen_GXI`=?  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000912", "DELETE FROM `Anuncio`  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000913", "SELECT `AnuncioId` FROM `Anuncio` ORDER BY `AnuncioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 40);
               }
               stmt.setVarchar(3, (String)parms[3], 256, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(4, (String)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(5, (String)parms[7], (String)parms[5], 2048,"Anuncio","AnuncioImagen");
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(6, ((Boolean) parms[9]).booleanValue());
               }
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 40);
               }
               stmt.setVarchar(3, (String)parms[3], 256, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(4, ((Boolean) parms[5]).booleanValue());
               }
               stmt.setLong(5, ((Number) parms[6]).longValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(1, (String)parms[1], true);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(2, (String)parms[3], (String)parms[1], 2048,"Anuncio","AnuncioImagen");
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

