package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class publicidad_impl extends GXDataArea
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
            AV7PublicidadId = GXutil.lval( httpContext.GetPar( "PublicidadId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PublicidadId), 18, 0));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPUBLICIDADID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7PublicidadId), "ZZZZZZZZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Publicidad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPublicidadTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public publicidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public publicidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( publicidad_impl.class ));
   }

   public publicidad_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPublicidadMenuApp = UIFactory.getCheckbox(this);
      chkPublicidadMenuWeb = UIFactory.getCheckbox(this);
      chkPublicidadMostrarApp = UIFactory.getCheckbox(this);
      chkPublicidadMostrarWeb = UIFactory.getCheckbox(this);
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
      A188PublicidadMenuApp = GXutil.strtobool( GXutil.booltostr( A188PublicidadMenuApp)) ;
      n188PublicidadMenuApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
      A189PublicidadMenuWeb = GXutil.strtobool( GXutil.booltostr( A189PublicidadMenuWeb)) ;
      n189PublicidadMenuWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
      A190PublicidadMostrarApp = GXutil.strtobool( GXutil.booltostr( A190PublicidadMostrarApp)) ;
      n190PublicidadMostrarApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
      A191PublicidadMostrarWeb = GXutil.strtobool( GXutil.booltostr( A191PublicidadMostrarWeb)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Publicidad", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Publicidad.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Publicidad.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPublicidadId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtPublicidadId_Internalname, GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtPublicidadId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPublicidadId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPublicidadId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Publicidad.htm");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadTitulo_Internalname, "Titulo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadTitulo_Internalname, GXutil.rtrim( A184PublicidadTitulo), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", (short)(0), 1, edtPublicidadTitulo_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Publicidad.htm");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadSubTitulo_Internalname, "Sub Titulo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadSubTitulo_Internalname, GXutil.rtrim( A185PublicidadSubTitulo), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", (short)(0), 1, edtPublicidadSubTitulo_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Publicidad.htm");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtPublicidadDescripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtPublicidadDescripcion_Internalname, GXutil.rtrim( A186PublicidadDescripcion), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtPublicidadDescripcion_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgPublicidadImagen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, "", "Imagen", "col-sm-3 ImageAttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ImageAttribute" ;
      StyleString = "" ;
      A187PublicidadImagen_IsBlob = (boolean)(((GXutil.strcmp("", A187PublicidadImagen)==0)&&(GXutil.strcmp("", A40000PublicidadImagen_GXI)==0))||!(GXutil.strcmp("", A187PublicidadImagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.getResourceRelative(A187PublicidadImagen)) ;
      com.colaveco.GxWebStd.gx_bitmap( httpContext, imgPublicidadImagen_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgPublicidadImagen_Enabled, "", "", 1, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "", "", "", 0, A187PublicidadImagen_IsBlob, true, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Publicidad.htm");
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "URL", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.getResourceRelative(A187PublicidadImagen)), true);
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "IsBlob", GXutil.booltostr( A187PublicidadImagen_IsBlob), true);
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMenuApp.getInternalname(), "Menu App", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMenuApp.getInternalname(), GXutil.booltostr( A188PublicidadMenuApp), "", "Menu App", 1, chkPublicidadMenuApp.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(59, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,59);\"");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMenuWeb.getInternalname(), "Menu Web", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMenuWeb.getInternalname(), GXutil.booltostr( A189PublicidadMenuWeb), "", "Menu Web", 1, chkPublicidadMenuWeb.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(64, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,64);\"");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMostrarApp.getInternalname(), "Mostrar App", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMostrarApp.getInternalname(), GXutil.booltostr( A190PublicidadMostrarApp), "", "Mostrar App", 1, chkPublicidadMostrarApp.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(69, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,69);\"");
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
      com.colaveco.GxWebStd.gx_label_element( httpContext, chkPublicidadMostrarWeb.getInternalname(), "Mostrar Web", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_checkbox_ctrl( httpContext, chkPublicidadMostrarWeb.getInternalname(), GXutil.booltostr( A191PublicidadMostrarWeb), "", "Mostrar Web", 1, chkPublicidadMostrarWeb.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(74, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,74);\"");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Publicidad.htm");
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
      e11082 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z183PublicidadId = localUtil.ctol( httpContext.cgiGet( "Z183PublicidadId"), ".", ",") ;
            Z184PublicidadTitulo = httpContext.cgiGet( "Z184PublicidadTitulo") ;
            Z185PublicidadSubTitulo = httpContext.cgiGet( "Z185PublicidadSubTitulo") ;
            n185PublicidadSubTitulo = ((GXutil.strcmp("", A185PublicidadSubTitulo)==0) ? true : false) ;
            Z186PublicidadDescripcion = httpContext.cgiGet( "Z186PublicidadDescripcion") ;
            n186PublicidadDescripcion = ((GXutil.strcmp("", A186PublicidadDescripcion)==0) ? true : false) ;
            Z188PublicidadMenuApp = GXutil.strtobool( httpContext.cgiGet( "Z188PublicidadMenuApp")) ;
            n188PublicidadMenuApp = ((false==A188PublicidadMenuApp) ? true : false) ;
            Z189PublicidadMenuWeb = GXutil.strtobool( httpContext.cgiGet( "Z189PublicidadMenuWeb")) ;
            n189PublicidadMenuWeb = ((false==A189PublicidadMenuWeb) ? true : false) ;
            Z190PublicidadMostrarApp = GXutil.strtobool( httpContext.cgiGet( "Z190PublicidadMostrarApp")) ;
            n190PublicidadMostrarApp = ((false==A190PublicidadMostrarApp) ? true : false) ;
            Z191PublicidadMostrarWeb = GXutil.strtobool( httpContext.cgiGet( "Z191PublicidadMostrarWeb")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7PublicidadId = localUtil.ctol( httpContext.cgiGet( "vPUBLICIDADID"), ".", ",") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            A40000PublicidadImagen_GXI = httpContext.cgiGet( "PUBLICIDADIMAGEN_GXI") ;
            n40000PublicidadImagen_GXI = ((GXutil.strcmp("", A40000PublicidadImagen_GXI)==0)&&(GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            AV11Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A183PublicidadId = localUtil.ctol( httpContext.cgiGet( edtPublicidadId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
            A184PublicidadTitulo = httpContext.cgiGet( edtPublicidadTitulo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184PublicidadTitulo", A184PublicidadTitulo);
            A185PublicidadSubTitulo = httpContext.cgiGet( edtPublicidadSubTitulo_Internalname) ;
            n185PublicidadSubTitulo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
            n185PublicidadSubTitulo = ((GXutil.strcmp("", A185PublicidadSubTitulo)==0) ? true : false) ;
            A186PublicidadDescripcion = httpContext.cgiGet( edtPublicidadDescripcion_Internalname) ;
            n186PublicidadDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
            n186PublicidadDescripcion = ((GXutil.strcmp("", A186PublicidadDescripcion)==0) ? true : false) ;
            A187PublicidadImagen = httpContext.cgiGet( imgPublicidadImagen_Internalname) ;
            n187PublicidadImagen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A187PublicidadImagen", A187PublicidadImagen);
            n187PublicidadImagen = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            A188PublicidadMenuApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuApp.getInternalname())) ;
            n188PublicidadMenuApp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
            n188PublicidadMenuApp = ((false==A188PublicidadMenuApp) ? true : false) ;
            A189PublicidadMenuWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuWeb.getInternalname())) ;
            n189PublicidadMenuWeb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
            n189PublicidadMenuWeb = ((false==A189PublicidadMenuWeb) ? true : false) ;
            A190PublicidadMostrarApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarApp.getInternalname())) ;
            n190PublicidadMostrarApp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
            n190PublicidadMostrarApp = ((false==A190PublicidadMostrarApp) ? true : false) ;
            A191PublicidadMostrarWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarWeb.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXv_char1[0] = A187PublicidadImagen ;
            GXv_char2[0] = A40000PublicidadImagen_GXI ;
            httpContext.getMultimediaValue(imgPublicidadImagen_Internalname, GXv_char1, GXv_char2);
            publicidad_impl.this.A187PublicidadImagen = GXv_char1[0] ;
            n187PublicidadImagen = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            publicidad_impl.this.A40000PublicidadImagen_GXI = GXv_char2[0] ;
            n40000PublicidadImagen_GXI = ((GXutil.strcmp("", A40000PublicidadImagen_GXI)==0)&&(GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            n40000PublicidadImagen_GXI = ((GXutil.strcmp("", A40000PublicidadImagen_GXI)==0)&&(GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            n187PublicidadImagen = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Publicidad");
            A183PublicidadId = localUtil.ctol( httpContext.cgiGet( edtPublicidadId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
            forbiddenHiddens.add("PublicidadId", localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A183PublicidadId != Z183PublicidadId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("publicidad:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A183PublicidadId = GXutil.lval( httpContext.GetPar( "PublicidadId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV7PublicidadId) )
               {
                  A183PublicidadId = AV7PublicidadId ;
                  httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
               }
               else
               {
                  if ( isIns( )  && (0==A183PublicidadId) && ( Gx_BScreen == 0 ) )
                  {
                     A183PublicidadId = 1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
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
                  sMode8 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV7PublicidadId) )
                  {
                     A183PublicidadId = AV7PublicidadId ;
                     httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
                  }
                  else
                  {
                     if ( isIns( )  && (0==A183PublicidadId) && ( Gx_BScreen == 0 ) )
                     {
                        A183PublicidadId = 1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
                     }
                  }
                  Gx_mode = sMode8 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound8 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_080( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PUBLICIDADID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPublicidadId_Internalname ;
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
                        e11082 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12082 ();
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
         e12082 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll088( ) ;
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
         disableAttributes088( ) ;
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

   public void confirm_080( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls088( ) ;
         }
         else
         {
            checkExtendedTable088( ) ;
            closeExtendedTableCursors088( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption080( )
   {
   }

   public void e11082( )
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

   public void e12082( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.colaveco.wwpublicidad", new String[] {}, new String[] {}) );
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

   public void zm088( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z184PublicidadTitulo = T00083_A184PublicidadTitulo[0] ;
            Z185PublicidadSubTitulo = T00083_A185PublicidadSubTitulo[0] ;
            Z186PublicidadDescripcion = T00083_A186PublicidadDescripcion[0] ;
            Z188PublicidadMenuApp = T00083_A188PublicidadMenuApp[0] ;
            Z189PublicidadMenuWeb = T00083_A189PublicidadMenuWeb[0] ;
            Z190PublicidadMostrarApp = T00083_A190PublicidadMostrarApp[0] ;
            Z191PublicidadMostrarWeb = T00083_A191PublicidadMostrarWeb[0] ;
         }
         else
         {
            Z184PublicidadTitulo = A184PublicidadTitulo ;
            Z185PublicidadSubTitulo = A185PublicidadSubTitulo ;
            Z186PublicidadDescripcion = A186PublicidadDescripcion ;
            Z188PublicidadMenuApp = A188PublicidadMenuApp ;
            Z189PublicidadMenuWeb = A189PublicidadMenuWeb ;
            Z190PublicidadMostrarApp = A190PublicidadMostrarApp ;
            Z191PublicidadMostrarWeb = A191PublicidadMostrarWeb ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z183PublicidadId = A183PublicidadId ;
         Z184PublicidadTitulo = A184PublicidadTitulo ;
         Z185PublicidadSubTitulo = A185PublicidadSubTitulo ;
         Z186PublicidadDescripcion = A186PublicidadDescripcion ;
         Z187PublicidadImagen = A187PublicidadImagen ;
         Z40000PublicidadImagen_GXI = A40000PublicidadImagen_GXI ;
         Z188PublicidadMenuApp = A188PublicidadMenuApp ;
         Z189PublicidadMenuWeb = A189PublicidadMenuWeb ;
         Z190PublicidadMostrarApp = A190PublicidadMostrarApp ;
         Z191PublicidadMostrarWeb = A191PublicidadMostrarWeb ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPublicidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadId_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPublicidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadId_Enabled), 5, 0), true);
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
      if ( ! (0==AV7PublicidadId) )
      {
         A183PublicidadId = AV7PublicidadId ;
         httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      }
      else
      {
         if ( isIns( )  && (0==A183PublicidadId) && ( Gx_BScreen == 0 ) )
         {
            A183PublicidadId = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
         }
      }
   }

   public void load088( )
   {
      /* Using cursor T00084 */
      pr_default.execute(2, new Object[] {Long.valueOf(A183PublicidadId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A184PublicidadTitulo = T00084_A184PublicidadTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184PublicidadTitulo", A184PublicidadTitulo);
         A185PublicidadSubTitulo = T00084_A185PublicidadSubTitulo[0] ;
         n185PublicidadSubTitulo = T00084_n185PublicidadSubTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
         A186PublicidadDescripcion = T00084_A186PublicidadDescripcion[0] ;
         n186PublicidadDescripcion = T00084_n186PublicidadDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
         A187PublicidadImagen = T00084_A187PublicidadImagen[0] ;
         n187PublicidadImagen = T00084_n187PublicidadImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187PublicidadImagen", A187PublicidadImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
         A40000PublicidadImagen_GXI = T00084_A40000PublicidadImagen_GXI[0] ;
         n40000PublicidadImagen_GXI = T00084_n40000PublicidadImagen_GXI[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
         A188PublicidadMenuApp = T00084_A188PublicidadMenuApp[0] ;
         n188PublicidadMenuApp = T00084_n188PublicidadMenuApp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
         A189PublicidadMenuWeb = T00084_A189PublicidadMenuWeb[0] ;
         n189PublicidadMenuWeb = T00084_n189PublicidadMenuWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
         A190PublicidadMostrarApp = T00084_A190PublicidadMostrarApp[0] ;
         n190PublicidadMostrarApp = T00084_n190PublicidadMostrarApp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
         A191PublicidadMostrarWeb = T00084_A191PublicidadMostrarWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
         zm088( -3) ;
      }
      pr_default.close(2);
      onLoadActions088( ) ;
   }

   public void onLoadActions088( )
   {
      AV11Pgmname = "Publicidad" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void checkExtendedTable088( )
   {
      nIsDirty_8 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV11Pgmname = "Publicidad" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void closeExtendedTableCursors088( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey088( )
   {
      /* Using cursor T00085 */
      pr_default.execute(3, new Object[] {Long.valueOf(A183PublicidadId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00083 */
      pr_default.execute(1, new Object[] {Long.valueOf(A183PublicidadId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm088( 3) ;
         RcdFound8 = (short)(1) ;
         A183PublicidadId = T00083_A183PublicidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
         A184PublicidadTitulo = T00083_A184PublicidadTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184PublicidadTitulo", A184PublicidadTitulo);
         A185PublicidadSubTitulo = T00083_A185PublicidadSubTitulo[0] ;
         n185PublicidadSubTitulo = T00083_n185PublicidadSubTitulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
         A186PublicidadDescripcion = T00083_A186PublicidadDescripcion[0] ;
         n186PublicidadDescripcion = T00083_n186PublicidadDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
         A187PublicidadImagen = T00083_A187PublicidadImagen[0] ;
         n187PublicidadImagen = T00083_n187PublicidadImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187PublicidadImagen", A187PublicidadImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
         A40000PublicidadImagen_GXI = T00083_A40000PublicidadImagen_GXI[0] ;
         n40000PublicidadImagen_GXI = T00083_n40000PublicidadImagen_GXI[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
         A188PublicidadMenuApp = T00083_A188PublicidadMenuApp[0] ;
         n188PublicidadMenuApp = T00083_n188PublicidadMenuApp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
         A189PublicidadMenuWeb = T00083_A189PublicidadMenuWeb[0] ;
         n189PublicidadMenuWeb = T00083_n189PublicidadMenuWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
         A190PublicidadMostrarApp = T00083_A190PublicidadMostrarApp[0] ;
         n190PublicidadMostrarApp = T00083_n190PublicidadMostrarApp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
         A191PublicidadMostrarWeb = T00083_A191PublicidadMostrarWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
         Z183PublicidadId = A183PublicidadId ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load088( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey088( ) ;
         }
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey088( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey088( ) ;
      if ( RcdFound8 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00086 */
      pr_default.execute(4, new Object[] {Long.valueOf(A183PublicidadId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00086_A183PublicidadId[0] < A183PublicidadId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00086_A183PublicidadId[0] > A183PublicidadId ) ) )
         {
            A183PublicidadId = T00086_A183PublicidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00087 */
      pr_default.execute(5, new Object[] {Long.valueOf(A183PublicidadId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00087_A183PublicidadId[0] > A183PublicidadId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00087_A183PublicidadId[0] < A183PublicidadId ) ) )
         {
            A183PublicidadId = T00087_A183PublicidadId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey088( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPublicidadTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert088( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( A183PublicidadId != Z183PublicidadId )
            {
               A183PublicidadId = Z183PublicidadId ;
               httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PUBLICIDADID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPublicidadId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPublicidadTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update088( ) ;
               GX_FocusControl = edtPublicidadTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A183PublicidadId != Z183PublicidadId )
            {
               /* Insert record */
               GX_FocusControl = edtPublicidadTitulo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert088( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PUBLICIDADID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPublicidadId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPublicidadTitulo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert088( ) ;
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
      if ( A183PublicidadId != Z183PublicidadId )
      {
         A183PublicidadId = Z183PublicidadId ;
         httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PUBLICIDADID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPublicidadId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPublicidadTitulo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency088( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00082 */
         pr_default.execute(0, new Object[] {Long.valueOf(A183PublicidadId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Publicidad"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z184PublicidadTitulo, T00082_A184PublicidadTitulo[0]) != 0 ) || ( GXutil.strcmp(Z185PublicidadSubTitulo, T00082_A185PublicidadSubTitulo[0]) != 0 ) || ( GXutil.strcmp(Z186PublicidadDescripcion, T00082_A186PublicidadDescripcion[0]) != 0 ) || ( Z188PublicidadMenuApp != T00082_A188PublicidadMenuApp[0] ) || ( Z189PublicidadMenuWeb != T00082_A189PublicidadMenuWeb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z190PublicidadMostrarApp != T00082_A190PublicidadMostrarApp[0] ) || ( Z191PublicidadMostrarWeb != T00082_A191PublicidadMostrarWeb[0] ) )
         {
            if ( GXutil.strcmp(Z184PublicidadTitulo, T00082_A184PublicidadTitulo[0]) != 0 )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadTitulo");
               GXutil.writeLogRaw("Old: ",Z184PublicidadTitulo);
               GXutil.writeLogRaw("Current: ",T00082_A184PublicidadTitulo[0]);
            }
            if ( GXutil.strcmp(Z185PublicidadSubTitulo, T00082_A185PublicidadSubTitulo[0]) != 0 )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadSubTitulo");
               GXutil.writeLogRaw("Old: ",Z185PublicidadSubTitulo);
               GXutil.writeLogRaw("Current: ",T00082_A185PublicidadSubTitulo[0]);
            }
            if ( GXutil.strcmp(Z186PublicidadDescripcion, T00082_A186PublicidadDescripcion[0]) != 0 )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadDescripcion");
               GXutil.writeLogRaw("Old: ",Z186PublicidadDescripcion);
               GXutil.writeLogRaw("Current: ",T00082_A186PublicidadDescripcion[0]);
            }
            if ( Z188PublicidadMenuApp != T00082_A188PublicidadMenuApp[0] )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadMenuApp");
               GXutil.writeLogRaw("Old: ",Z188PublicidadMenuApp);
               GXutil.writeLogRaw("Current: ",T00082_A188PublicidadMenuApp[0]);
            }
            if ( Z189PublicidadMenuWeb != T00082_A189PublicidadMenuWeb[0] )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadMenuWeb");
               GXutil.writeLogRaw("Old: ",Z189PublicidadMenuWeb);
               GXutil.writeLogRaw("Current: ",T00082_A189PublicidadMenuWeb[0]);
            }
            if ( Z190PublicidadMostrarApp != T00082_A190PublicidadMostrarApp[0] )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadMostrarApp");
               GXutil.writeLogRaw("Old: ",Z190PublicidadMostrarApp);
               GXutil.writeLogRaw("Current: ",T00082_A190PublicidadMostrarApp[0]);
            }
            if ( Z191PublicidadMostrarWeb != T00082_A191PublicidadMostrarWeb[0] )
            {
               GXutil.writeLogln("publicidad:[seudo value changed for attri]"+"PublicidadMostrarWeb");
               GXutil.writeLogRaw("Old: ",Z191PublicidadMostrarWeb);
               GXutil.writeLogRaw("Current: ",T00082_A191PublicidadMostrarWeb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Publicidad"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert088( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable088( ) ;
      }
      if ( AnyError == 0 )
      {
         zm088( 0) ;
         checkOptimisticConcurrency088( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm088( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert088( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00088 */
                  pr_default.execute(6, new Object[] {A184PublicidadTitulo, Boolean.valueOf(n185PublicidadSubTitulo), A185PublicidadSubTitulo, Boolean.valueOf(n186PublicidadDescripcion), A186PublicidadDescripcion, Boolean.valueOf(n187PublicidadImagen), A187PublicidadImagen, Boolean.valueOf(n40000PublicidadImagen_GXI), A40000PublicidadImagen_GXI, Boolean.valueOf(n188PublicidadMenuApp), Boolean.valueOf(A188PublicidadMenuApp), Boolean.valueOf(n189PublicidadMenuWeb), Boolean.valueOf(A189PublicidadMenuWeb), Boolean.valueOf(n190PublicidadMostrarApp), Boolean.valueOf(A190PublicidadMostrarApp), Boolean.valueOf(A191PublicidadMostrarWeb)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00089 */
                  pr_default.execute(7);
                  A183PublicidadId = T00089_A183PublicidadId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Publicidad");
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
            load088( ) ;
         }
         endLevel088( ) ;
      }
      closeExtendedTableCursors088( ) ;
   }

   public void update088( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable088( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency088( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm088( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate088( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000810 */
                  pr_default.execute(8, new Object[] {A184PublicidadTitulo, Boolean.valueOf(n185PublicidadSubTitulo), A185PublicidadSubTitulo, Boolean.valueOf(n186PublicidadDescripcion), A186PublicidadDescripcion, Boolean.valueOf(n188PublicidadMenuApp), Boolean.valueOf(A188PublicidadMenuApp), Boolean.valueOf(n189PublicidadMenuWeb), Boolean.valueOf(A189PublicidadMenuWeb), Boolean.valueOf(n190PublicidadMostrarApp), Boolean.valueOf(A190PublicidadMostrarApp), Boolean.valueOf(A191PublicidadMostrarWeb), Long.valueOf(A183PublicidadId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Publicidad");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Publicidad"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate088( ) ;
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
         endLevel088( ) ;
      }
      closeExtendedTableCursors088( ) ;
   }

   public void deferredUpdate088( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000811 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n187PublicidadImagen), A187PublicidadImagen, Boolean.valueOf(n40000PublicidadImagen_GXI), A40000PublicidadImagen_GXI, Long.valueOf(A183PublicidadId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("Publicidad");
      }
   }

   public void delete( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency088( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls088( ) ;
         afterConfirm088( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete088( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000812 */
               pr_default.execute(10, new Object[] {Long.valueOf(A183PublicidadId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Publicidad");
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel088( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls088( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV11Pgmname = "Publicidad" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      }
   }

   public void endLevel088( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete088( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "publicidad");
         if ( AnyError == 0 )
         {
            confirmValues080( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "publicidad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart088( )
   {
      /* Scan By routine */
      /* Using cursor T000813 */
      pr_default.execute(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A183PublicidadId = T000813_A183PublicidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext088( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A183PublicidadId = T000813_A183PublicidadId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      }
   }

   public void scanEnd088( )
   {
      pr_default.close(11);
   }

   public void afterConfirm088( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert088( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate088( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete088( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete088( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate088( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes088( )
   {
      edtPublicidadId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadId_Enabled), 5, 0), true);
      edtPublicidadTitulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadTitulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadTitulo_Enabled), 5, 0), true);
      edtPublicidadSubTitulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadSubTitulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadSubTitulo_Enabled), 5, 0), true);
      edtPublicidadDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPublicidadDescripcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPublicidadDescripcion_Enabled), 5, 0), true);
      imgPublicidadImagen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgPublicidadImagen_Enabled), 5, 0), true);
      chkPublicidadMenuApp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuApp.getInternalname(), "Enabled", GXutil.ltrimstr( chkPublicidadMenuApp.getEnabled(), 5, 0), true);
      chkPublicidadMenuWeb.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuWeb.getInternalname(), "Enabled", GXutil.ltrimstr( chkPublicidadMenuWeb.getEnabled(), 5, 0), true);
      chkPublicidadMostrarApp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarApp.getInternalname(), "Enabled", GXutil.ltrimstr( chkPublicidadMostrarApp.getEnabled(), 5, 0), true);
      chkPublicidadMostrarWeb.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarWeb.getInternalname(), "Enabled", GXutil.ltrimstr( chkPublicidadMostrarWeb.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes088( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues080( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20231121462953", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.publicidad", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7PublicidadId,18,0))}, new String[] {"Gx_mode","PublicidadId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Publicidad");
      forbiddenHiddens.add("PublicidadId", localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("publicidad:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z183PublicidadId", GXutil.ltrim( localUtil.ntoc( Z183PublicidadId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z184PublicidadTitulo", GXutil.rtrim( Z184PublicidadTitulo));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z185PublicidadSubTitulo", GXutil.rtrim( Z185PublicidadSubTitulo));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z186PublicidadDescripcion", GXutil.rtrim( Z186PublicidadDescripcion));
      com.colaveco.GxWebStd.gx_boolean_hidden_field( httpContext, "Z188PublicidadMenuApp", Z188PublicidadMenuApp);
      com.colaveco.GxWebStd.gx_boolean_hidden_field( httpContext, "Z189PublicidadMenuWeb", Z189PublicidadMenuWeb);
      com.colaveco.GxWebStd.gx_boolean_hidden_field( httpContext, "Z190PublicidadMostrarApp", Z190PublicidadMostrarApp);
      com.colaveco.GxWebStd.gx_boolean_hidden_field( httpContext, "Z191PublicidadMostrarWeb", Z191PublicidadMostrarWeb);
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPUBLICIDADID", GXutil.ltrim( localUtil.ntoc( AV7PublicidadId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPUBLICIDADID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7PublicidadId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "PUBLICIDADIMAGEN_GXI", A40000PublicidadImagen_GXI);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV11Pgmname));
      GXCCtlgxBlob = "PUBLICIDADIMAGEN" + "_gxBlob" ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A187PublicidadImagen);
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
      return formatLink("com.colaveco.publicidad", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7PublicidadId,18,0))}, new String[] {"Gx_mode","PublicidadId"})  ;
   }

   public String getPgmname( )
   {
      return "Publicidad" ;
   }

   public String getPgmdesc( )
   {
      return "Publicidad" ;
   }

   public void initializeNonKey088( )
   {
      A184PublicidadTitulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A184PublicidadTitulo", A184PublicidadTitulo);
      A185PublicidadSubTitulo = "" ;
      n185PublicidadSubTitulo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185PublicidadSubTitulo", A185PublicidadSubTitulo);
      n185PublicidadSubTitulo = ((GXutil.strcmp("", A185PublicidadSubTitulo)==0) ? true : false) ;
      A186PublicidadDescripcion = "" ;
      n186PublicidadDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A186PublicidadDescripcion", A186PublicidadDescripcion);
      n186PublicidadDescripcion = ((GXutil.strcmp("", A186PublicidadDescripcion)==0) ? true : false) ;
      A187PublicidadImagen = "" ;
      n187PublicidadImagen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A187PublicidadImagen", A187PublicidadImagen);
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
      n187PublicidadImagen = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? true : false) ;
      A40000PublicidadImagen_GXI = "" ;
      n40000PublicidadImagen_GXI = false ;
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
      A188PublicidadMenuApp = false ;
      n188PublicidadMenuApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
      n188PublicidadMenuApp = ((false==A188PublicidadMenuApp) ? true : false) ;
      A189PublicidadMenuWeb = false ;
      n189PublicidadMenuWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
      n189PublicidadMenuWeb = ((false==A189PublicidadMenuWeb) ? true : false) ;
      A190PublicidadMostrarApp = false ;
      n190PublicidadMostrarApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
      n190PublicidadMostrarApp = ((false==A190PublicidadMostrarApp) ? true : false) ;
      A191PublicidadMostrarWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
      Z184PublicidadTitulo = "" ;
      Z185PublicidadSubTitulo = "" ;
      Z186PublicidadDescripcion = "" ;
      Z188PublicidadMenuApp = false ;
      Z189PublicidadMenuWeb = false ;
      Z190PublicidadMostrarApp = false ;
      Z191PublicidadMostrarWeb = false ;
   }

   public void initAll088( )
   {
      A183PublicidadId = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A183PublicidadId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A183PublicidadId), 18, 0));
      initializeNonKey088( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20231121462967", true, true);
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
      httpContext.AddJavascriptSource("publicidad.js", "?20231121462968", false, true);
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
      edtPublicidadId_Internalname = "PUBLICIDADID" ;
      edtPublicidadTitulo_Internalname = "PUBLICIDADTITULO" ;
      edtPublicidadSubTitulo_Internalname = "PUBLICIDADSUBTITULO" ;
      edtPublicidadDescripcion_Internalname = "PUBLICIDADDESCRIPCION" ;
      imgPublicidadImagen_Internalname = "PUBLICIDADIMAGEN" ;
      chkPublicidadMenuApp.setInternalname( "PUBLICIDADMENUAPP" );
      chkPublicidadMenuWeb.setInternalname( "PUBLICIDADMENUWEB" );
      chkPublicidadMostrarApp.setInternalname( "PUBLICIDADMOSTRARAPP" );
      chkPublicidadMostrarWeb.setInternalname( "PUBLICIDADMOSTRARWEB" );
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
      Form.setCaption( "Publicidad" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      chkPublicidadMostrarWeb.setEnabled( 1 );
      chkPublicidadMostrarApp.setEnabled( 1 );
      chkPublicidadMenuWeb.setEnabled( 1 );
      chkPublicidadMenuApp.setEnabled( 1 );
      imgPublicidadImagen_Enabled = 1 ;
      edtPublicidadDescripcion_Enabled = 1 ;
      edtPublicidadSubTitulo_Enabled = 1 ;
      edtPublicidadTitulo_Enabled = 1 ;
      edtPublicidadId_Jsonclick = "" ;
      edtPublicidadId_Enabled = 0 ;
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
      chkPublicidadMenuApp.setName( "PUBLICIDADMENUAPP" );
      chkPublicidadMenuApp.setWebtags( "" );
      chkPublicidadMenuApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuApp.getInternalname(), "TitleCaption", chkPublicidadMenuApp.getCaption(), true);
      chkPublicidadMenuApp.setCheckedValue( "false" );
      A188PublicidadMenuApp = GXutil.strtobool( GXutil.booltostr( A188PublicidadMenuApp)) ;
      n188PublicidadMenuApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A188PublicidadMenuApp", A188PublicidadMenuApp);
      chkPublicidadMenuWeb.setName( "PUBLICIDADMENUWEB" );
      chkPublicidadMenuWeb.setWebtags( "" );
      chkPublicidadMenuWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuWeb.getInternalname(), "TitleCaption", chkPublicidadMenuWeb.getCaption(), true);
      chkPublicidadMenuWeb.setCheckedValue( "false" );
      A189PublicidadMenuWeb = GXutil.strtobool( GXutil.booltostr( A189PublicidadMenuWeb)) ;
      n189PublicidadMenuWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A189PublicidadMenuWeb", A189PublicidadMenuWeb);
      chkPublicidadMostrarApp.setName( "PUBLICIDADMOSTRARAPP" );
      chkPublicidadMostrarApp.setWebtags( "" );
      chkPublicidadMostrarApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarApp.getInternalname(), "TitleCaption", chkPublicidadMostrarApp.getCaption(), true);
      chkPublicidadMostrarApp.setCheckedValue( "false" );
      A190PublicidadMostrarApp = GXutil.strtobool( GXutil.booltostr( A190PublicidadMostrarApp)) ;
      n190PublicidadMostrarApp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A190PublicidadMostrarApp", A190PublicidadMostrarApp);
      chkPublicidadMostrarWeb.setName( "PUBLICIDADMOSTRARWEB" );
      chkPublicidadMostrarWeb.setWebtags( "" );
      chkPublicidadMostrarWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarWeb.getInternalname(), "TitleCaption", chkPublicidadMostrarWeb.getCaption(), true);
      chkPublicidadMostrarWeb.setCheckedValue( "false" );
      A191PublicidadMostrarWeb = GXutil.strtobool( GXutil.booltostr( A191PublicidadMostrarWeb)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A191PublicidadMostrarWeb", A191PublicidadMostrarWeb);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7PublicidadId',fld:'vPUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7PublicidadId',fld:'vPUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true},{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e12082',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
      setEventMetadata("VALID_PUBLICIDADID","{handler:'valid_Publicidadid',iparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]");
      setEventMetadata("VALID_PUBLICIDADID",",oparms:[{av:'A188PublicidadMenuApp',fld:'PUBLICIDADMENUAPP',pic:''},{av:'A189PublicidadMenuWeb',fld:'PUBLICIDADMENUWEB',pic:''},{av:'A190PublicidadMostrarApp',fld:'PUBLICIDADMOSTRARAPP',pic:''},{av:'A191PublicidadMostrarWeb',fld:'PUBLICIDADMOSTRARWEB',pic:''}]}");
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
      Z184PublicidadTitulo = "" ;
      Z185PublicidadSubTitulo = "" ;
      Z186PublicidadDescripcion = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7PublicidadId = 1 ;
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
      A184PublicidadTitulo = "" ;
      A185PublicidadSubTitulo = "" ;
      A186PublicidadDescripcion = "" ;
      A187PublicidadImagen = "" ;
      A40000PublicidadImagen_GXI = "" ;
      sImgUrl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV11Pgmname = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode8 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      Z187PublicidadImagen = "" ;
      Z40000PublicidadImagen_GXI = "" ;
      T00084_A183PublicidadId = new long[1] ;
      T00084_A184PublicidadTitulo = new String[] {""} ;
      T00084_A185PublicidadSubTitulo = new String[] {""} ;
      T00084_n185PublicidadSubTitulo = new boolean[] {false} ;
      T00084_A186PublicidadDescripcion = new String[] {""} ;
      T00084_n186PublicidadDescripcion = new boolean[] {false} ;
      T00084_A187PublicidadImagen = new String[] {""} ;
      T00084_n187PublicidadImagen = new boolean[] {false} ;
      T00084_A40000PublicidadImagen_GXI = new String[] {""} ;
      T00084_n40000PublicidadImagen_GXI = new boolean[] {false} ;
      T00084_A188PublicidadMenuApp = new boolean[] {false} ;
      T00084_n188PublicidadMenuApp = new boolean[] {false} ;
      T00084_A189PublicidadMenuWeb = new boolean[] {false} ;
      T00084_n189PublicidadMenuWeb = new boolean[] {false} ;
      T00084_A190PublicidadMostrarApp = new boolean[] {false} ;
      T00084_n190PublicidadMostrarApp = new boolean[] {false} ;
      T00084_A191PublicidadMostrarWeb = new boolean[] {false} ;
      T00085_A183PublicidadId = new long[1] ;
      T00083_A183PublicidadId = new long[1] ;
      T00083_A184PublicidadTitulo = new String[] {""} ;
      T00083_A185PublicidadSubTitulo = new String[] {""} ;
      T00083_n185PublicidadSubTitulo = new boolean[] {false} ;
      T00083_A186PublicidadDescripcion = new String[] {""} ;
      T00083_n186PublicidadDescripcion = new boolean[] {false} ;
      T00083_A187PublicidadImagen = new String[] {""} ;
      T00083_n187PublicidadImagen = new boolean[] {false} ;
      T00083_A40000PublicidadImagen_GXI = new String[] {""} ;
      T00083_n40000PublicidadImagen_GXI = new boolean[] {false} ;
      T00083_A188PublicidadMenuApp = new boolean[] {false} ;
      T00083_n188PublicidadMenuApp = new boolean[] {false} ;
      T00083_A189PublicidadMenuWeb = new boolean[] {false} ;
      T00083_n189PublicidadMenuWeb = new boolean[] {false} ;
      T00083_A190PublicidadMostrarApp = new boolean[] {false} ;
      T00083_n190PublicidadMostrarApp = new boolean[] {false} ;
      T00083_A191PublicidadMostrarWeb = new boolean[] {false} ;
      T00086_A183PublicidadId = new long[1] ;
      T00087_A183PublicidadId = new long[1] ;
      T00082_A183PublicidadId = new long[1] ;
      T00082_A184PublicidadTitulo = new String[] {""} ;
      T00082_A185PublicidadSubTitulo = new String[] {""} ;
      T00082_n185PublicidadSubTitulo = new boolean[] {false} ;
      T00082_A186PublicidadDescripcion = new String[] {""} ;
      T00082_n186PublicidadDescripcion = new boolean[] {false} ;
      T00082_A187PublicidadImagen = new String[] {""} ;
      T00082_n187PublicidadImagen = new boolean[] {false} ;
      T00082_A40000PublicidadImagen_GXI = new String[] {""} ;
      T00082_n40000PublicidadImagen_GXI = new boolean[] {false} ;
      T00082_A188PublicidadMenuApp = new boolean[] {false} ;
      T00082_n188PublicidadMenuApp = new boolean[] {false} ;
      T00082_A189PublicidadMenuWeb = new boolean[] {false} ;
      T00082_n189PublicidadMenuWeb = new boolean[] {false} ;
      T00082_A190PublicidadMostrarApp = new boolean[] {false} ;
      T00082_n190PublicidadMostrarApp = new boolean[] {false} ;
      T00082_A191PublicidadMostrarWeb = new boolean[] {false} ;
      T00089_A183PublicidadId = new long[1] ;
      T000813_A183PublicidadId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXCCtlgxBlob = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.publicidad__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.publicidad__default(),
         new Object[] {
             new Object[] {
            T00082_A183PublicidadId, T00082_A184PublicidadTitulo, T00082_A185PublicidadSubTitulo, T00082_n185PublicidadSubTitulo, T00082_A186PublicidadDescripcion, T00082_n186PublicidadDescripcion, T00082_A187PublicidadImagen, T00082_n187PublicidadImagen, T00082_A40000PublicidadImagen_GXI, T00082_n40000PublicidadImagen_GXI,
            T00082_A188PublicidadMenuApp, T00082_n188PublicidadMenuApp, T00082_A189PublicidadMenuWeb, T00082_n189PublicidadMenuWeb, T00082_A190PublicidadMostrarApp, T00082_n190PublicidadMostrarApp, T00082_A191PublicidadMostrarWeb
            }
            , new Object[] {
            T00083_A183PublicidadId, T00083_A184PublicidadTitulo, T00083_A185PublicidadSubTitulo, T00083_n185PublicidadSubTitulo, T00083_A186PublicidadDescripcion, T00083_n186PublicidadDescripcion, T00083_A187PublicidadImagen, T00083_n187PublicidadImagen, T00083_A40000PublicidadImagen_GXI, T00083_n40000PublicidadImagen_GXI,
            T00083_A188PublicidadMenuApp, T00083_n188PublicidadMenuApp, T00083_A189PublicidadMenuWeb, T00083_n189PublicidadMenuWeb, T00083_A190PublicidadMostrarApp, T00083_n190PublicidadMostrarApp, T00083_A191PublicidadMostrarWeb
            }
            , new Object[] {
            T00084_A183PublicidadId, T00084_A184PublicidadTitulo, T00084_A185PublicidadSubTitulo, T00084_n185PublicidadSubTitulo, T00084_A186PublicidadDescripcion, T00084_n186PublicidadDescripcion, T00084_A187PublicidadImagen, T00084_n187PublicidadImagen, T00084_A40000PublicidadImagen_GXI, T00084_n40000PublicidadImagen_GXI,
            T00084_A188PublicidadMenuApp, T00084_n188PublicidadMenuApp, T00084_A189PublicidadMenuWeb, T00084_n189PublicidadMenuWeb, T00084_A190PublicidadMostrarApp, T00084_n190PublicidadMostrarApp, T00084_A191PublicidadMostrarWeb
            }
            , new Object[] {
            T00085_A183PublicidadId
            }
            , new Object[] {
            T00086_A183PublicidadId
            }
            , new Object[] {
            T00087_A183PublicidadId
            }
            , new Object[] {
            }
            , new Object[] {
            T00089_A183PublicidadId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000813_A183PublicidadId
            }
         }
      );
      Z183PublicidadId = 1 ;
      A183PublicidadId = 1 ;
      AV11Pgmname = "Publicidad" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound8 ;
   private short nIsDirty_8 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtPublicidadId_Enabled ;
   private int edtPublicidadTitulo_Enabled ;
   private int edtPublicidadSubTitulo_Enabled ;
   private int edtPublicidadDescripcion_Enabled ;
   private int imgPublicidadImagen_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7PublicidadId ;
   private long Z183PublicidadId ;
   private long AV7PublicidadId ;
   private long A183PublicidadId ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z184PublicidadTitulo ;
   private String Z185PublicidadSubTitulo ;
   private String Z186PublicidadDescripcion ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPublicidadTitulo_Internalname ;
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
   private String edtPublicidadId_Internalname ;
   private String edtPublicidadId_Jsonclick ;
   private String A184PublicidadTitulo ;
   private String edtPublicidadSubTitulo_Internalname ;
   private String A185PublicidadSubTitulo ;
   private String edtPublicidadDescripcion_Internalname ;
   private String A186PublicidadDescripcion ;
   private String imgPublicidadImagen_Internalname ;
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
   private String sMode8 ;
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
   private boolean Z188PublicidadMenuApp ;
   private boolean Z189PublicidadMenuWeb ;
   private boolean Z190PublicidadMostrarApp ;
   private boolean Z191PublicidadMostrarWeb ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A188PublicidadMenuApp ;
   private boolean n188PublicidadMenuApp ;
   private boolean A189PublicidadMenuWeb ;
   private boolean n189PublicidadMenuWeb ;
   private boolean A190PublicidadMostrarApp ;
   private boolean n190PublicidadMostrarApp ;
   private boolean A191PublicidadMostrarWeb ;
   private boolean A187PublicidadImagen_IsBlob ;
   private boolean n185PublicidadSubTitulo ;
   private boolean n186PublicidadDescripcion ;
   private boolean n40000PublicidadImagen_GXI ;
   private boolean n187PublicidadImagen ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean Gx_longc ;
   private String A40000PublicidadImagen_GXI ;
   private String Z40000PublicidadImagen_GXI ;
   private String A187PublicidadImagen ;
   private String Z187PublicidadImagen ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPublicidadMenuApp ;
   private ICheckbox chkPublicidadMenuWeb ;
   private ICheckbox chkPublicidadMostrarApp ;
   private ICheckbox chkPublicidadMostrarWeb ;
   private IDataStoreProvider pr_default ;
   private long[] T00084_A183PublicidadId ;
   private String[] T00084_A184PublicidadTitulo ;
   private String[] T00084_A185PublicidadSubTitulo ;
   private boolean[] T00084_n185PublicidadSubTitulo ;
   private String[] T00084_A186PublicidadDescripcion ;
   private boolean[] T00084_n186PublicidadDescripcion ;
   private String[] T00084_A187PublicidadImagen ;
   private boolean[] T00084_n187PublicidadImagen ;
   private String[] T00084_A40000PublicidadImagen_GXI ;
   private boolean[] T00084_n40000PublicidadImagen_GXI ;
   private boolean[] T00084_A188PublicidadMenuApp ;
   private boolean[] T00084_n188PublicidadMenuApp ;
   private boolean[] T00084_A189PublicidadMenuWeb ;
   private boolean[] T00084_n189PublicidadMenuWeb ;
   private boolean[] T00084_A190PublicidadMostrarApp ;
   private boolean[] T00084_n190PublicidadMostrarApp ;
   private boolean[] T00084_A191PublicidadMostrarWeb ;
   private long[] T00085_A183PublicidadId ;
   private long[] T00083_A183PublicidadId ;
   private String[] T00083_A184PublicidadTitulo ;
   private String[] T00083_A185PublicidadSubTitulo ;
   private boolean[] T00083_n185PublicidadSubTitulo ;
   private String[] T00083_A186PublicidadDescripcion ;
   private boolean[] T00083_n186PublicidadDescripcion ;
   private String[] T00083_A187PublicidadImagen ;
   private boolean[] T00083_n187PublicidadImagen ;
   private String[] T00083_A40000PublicidadImagen_GXI ;
   private boolean[] T00083_n40000PublicidadImagen_GXI ;
   private boolean[] T00083_A188PublicidadMenuApp ;
   private boolean[] T00083_n188PublicidadMenuApp ;
   private boolean[] T00083_A189PublicidadMenuWeb ;
   private boolean[] T00083_n189PublicidadMenuWeb ;
   private boolean[] T00083_A190PublicidadMostrarApp ;
   private boolean[] T00083_n190PublicidadMostrarApp ;
   private boolean[] T00083_A191PublicidadMostrarWeb ;
   private long[] T00086_A183PublicidadId ;
   private long[] T00087_A183PublicidadId ;
   private long[] T00082_A183PublicidadId ;
   private String[] T00082_A184PublicidadTitulo ;
   private String[] T00082_A185PublicidadSubTitulo ;
   private boolean[] T00082_n185PublicidadSubTitulo ;
   private String[] T00082_A186PublicidadDescripcion ;
   private boolean[] T00082_n186PublicidadDescripcion ;
   private String[] T00082_A187PublicidadImagen ;
   private boolean[] T00082_n187PublicidadImagen ;
   private String[] T00082_A40000PublicidadImagen_GXI ;
   private boolean[] T00082_n40000PublicidadImagen_GXI ;
   private boolean[] T00082_A188PublicidadMenuApp ;
   private boolean[] T00082_n188PublicidadMenuApp ;
   private boolean[] T00082_A189PublicidadMenuWeb ;
   private boolean[] T00082_n189PublicidadMenuWeb ;
   private boolean[] T00082_A190PublicidadMostrarApp ;
   private boolean[] T00082_n190PublicidadMostrarApp ;
   private boolean[] T00082_A191PublicidadMostrarWeb ;
   private long[] T00089_A183PublicidadId ;
   private long[] T000813_A183PublicidadId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class publicidad__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class publicidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00082", "SELECT `PublicidadId`, `PublicidadTitulo`, `PublicidadSubTitulo`, `PublicidadDescripcion`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadMenuApp`, `PublicidadMenuWeb`, `PublicidadMostrarApp`, `PublicidadMostrarWeb` FROM `Publicidad` WHERE `PublicidadId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00083", "SELECT `PublicidadId`, `PublicidadTitulo`, `PublicidadSubTitulo`, `PublicidadDescripcion`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadMenuApp`, `PublicidadMenuWeb`, `PublicidadMostrarApp`, `PublicidadMostrarWeb` FROM `Publicidad` WHERE `PublicidadId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00084", "SELECT TM1.`PublicidadId`, TM1.`PublicidadTitulo`, TM1.`PublicidadSubTitulo`, TM1.`PublicidadDescripcion`, TM1.`PublicidadImagen`, TM1.`PublicidadImagen_GXI`, TM1.`PublicidadMenuApp`, TM1.`PublicidadMenuWeb`, TM1.`PublicidadMostrarApp`, TM1.`PublicidadMostrarWeb` FROM `Publicidad` TM1 WHERE TM1.`PublicidadId` = ? ORDER BY TM1.`PublicidadId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00085", "SELECT `PublicidadId` FROM `Publicidad` WHERE `PublicidadId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00086", "SELECT `PublicidadId` FROM `Publicidad` WHERE ( `PublicidadId` > ?) ORDER BY `PublicidadId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00087", "SELECT `PublicidadId` FROM `Publicidad` WHERE ( `PublicidadId` < ?) ORDER BY `PublicidadId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00088", "INSERT INTO `Publicidad`(`PublicidadTitulo`, `PublicidadSubTitulo`, `PublicidadDescripcion`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadMenuApp`, `PublicidadMenuWeb`, `PublicidadMostrarApp`, `PublicidadMostrarWeb`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("T00089", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000810", "UPDATE `Publicidad` SET `PublicidadTitulo`=?, `PublicidadSubTitulo`=?, `PublicidadDescripcion`=?, `PublicidadMenuApp`=?, `PublicidadMenuWeb`=?, `PublicidadMostrarApp`=?, `PublicidadMostrarWeb`=?  WHERE `PublicidadId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000811", "UPDATE `Publicidad` SET `PublicidadImagen`=?, `PublicidadImagen_GXI`=?  WHERE `PublicidadId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000812", "DELETE FROM `Publicidad`  WHERE `PublicidadId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000813", "SELECT `PublicidadId` FROM `Publicidad` ORDER BY `PublicidadId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 256);
               ((String[]) buf[2])[0] = rslt.getString(3, 256);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 256);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((boolean[]) buf[10])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((boolean[]) buf[12])[0] = rslt.getBoolean(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((boolean[]) buf[16])[0] = rslt.getBoolean(10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 256);
               ((String[]) buf[2])[0] = rslt.getString(3, 256);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 256);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((boolean[]) buf[10])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((boolean[]) buf[12])[0] = rslt.getBoolean(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((boolean[]) buf[16])[0] = rslt.getBoolean(10);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 256);
               ((String[]) buf[2])[0] = rslt.getString(3, 256);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 256);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((boolean[]) buf[10])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((boolean[]) buf[12])[0] = rslt.getBoolean(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((boolean[]) buf[16])[0] = rslt.getBoolean(10);
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
               stmt.setString(1, (String)parms[0], 256);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 256);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 256);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(4, (String)parms[6], true);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(5, (String)parms[8], (String)parms[6], 2048,"Publicidad","PublicidadImagen");
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(6, ((Boolean) parms[10]).booleanValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(7, ((Boolean) parms[12]).booleanValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(8, ((Boolean) parms[14]).booleanValue());
               }
               stmt.setBoolean(9, ((Boolean) parms[15]).booleanValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 256);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 256);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 256);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(4, ((Boolean) parms[6]).booleanValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(5, ((Boolean) parms[8]).booleanValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(6, ((Boolean) parms[10]).booleanValue());
               }
               stmt.setBoolean(7, ((Boolean) parms[11]).booleanValue());
               stmt.setLong(8, ((Number) parms[12]).longValue());
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
                  stmt.setGXDbFileURI(2, (String)parms[3], (String)parms[1], 2048,"Publicidad","PublicidadImagen");
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

