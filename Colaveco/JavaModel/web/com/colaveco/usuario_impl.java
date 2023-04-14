package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class usuario_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", "Usuario", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtUsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public usuario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public usuario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( usuario_impl.class ));
   }

   public usuario_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Usuario", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Usuario.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 4, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.colaveco.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"USUARIOID"+"'), id:'"+"USUARIOID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Usuario.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioId_Internalname, GXutil.ltrim( localUtil.ntoc( A5UsuarioId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5UsuarioId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5UsuarioId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioEmail_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioEmail_Internalname, A114UsuarioEmail, GXutil.rtrim( localUtil.format( A114UsuarioEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioEmail_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioEmail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioUsuarioWeb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioUsuarioWeb_Internalname, "Usuario Web", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioUsuarioWeb_Internalname, A115UsuarioUsuarioWeb, GXutil.rtrim( localUtil.format( A115UsuarioUsuarioWeb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioUsuarioWeb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioUsuarioWeb_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNombre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNombre_Internalname, A116UsuarioNombre, GXutil.rtrim( localUtil.format( A116UsuarioNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNombre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioDicose_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioDicose_Internalname, "Dicose", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioDicose_Internalname, A117UsuarioDicose, GXutil.rtrim( localUtil.format( A117UsuarioDicose, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioDicose_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioDicose_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "dicose", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioRazonSocial_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioRazonSocial_Internalname, "Razon Social", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioRazonSocial_Internalname, A118UsuarioRazonSocial, GXutil.rtrim( localUtil.format( A118UsuarioRazonSocial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioRazonSocial_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioRazonSocial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioRut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioRut_Internalname, "Rut", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioRut_Internalname, A119UsuarioRut, GXutil.rtrim( localUtil.format( A119UsuarioRut, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioRut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioRut_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioIdNet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioIdNet_Internalname, "Id Net", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioIdNet_Internalname, GXutil.ltrim( localUtil.ntoc( A120UsuarioIdNet, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioIdNet_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A120UsuarioIdNet), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A120UsuarioIdNet), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioIdNet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioIdNet_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioDireccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioDireccion_Internalname, "Direccion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioDireccion_Internalname, A121UsuarioDireccion, GXutil.rtrim( localUtil.format( A121UsuarioDireccion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioDireccion_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioDireccion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTipousuario_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTipousuario_Internalname, "Tipousuario", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTipousuario_Internalname, GXutil.ltrim( localUtil.ntoc( A122UsuarioTipousuario, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioTipousuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A122UsuarioTipousuario), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A122UsuarioTipousuario), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTipousuario_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTipousuario_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioIdTecnico1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioIdTecnico1_Internalname, "Id Tecnico1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioIdTecnico1_Internalname, GXutil.ltrim( localUtil.ntoc( A123UsuarioIdTecnico1, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioIdTecnico1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioIdTecnico1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioIdTecnico1_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioIdTecnico2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioIdTecnico2_Internalname, "Id Tecnico2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioIdTecnico2_Internalname, GXutil.ltrim( localUtil.ntoc( A124UsuarioIdTecnico2, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioIdTecnico2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioIdTecnico2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioIdTecnico2_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioIdTecnico3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioIdTecnico3_Internalname, "Id Tecnico3", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioIdTecnico3_Internalname, GXutil.ltrim( localUtil.ntoc( A125UsuarioIdTecnico3, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioIdTecnico3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioIdTecnico3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioIdTecnico3_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioDireccionFrasco_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioDireccionFrasco_Internalname, "Direccion Frasco", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtUsuarioDireccionFrasco_Internalname, A126UsuarioDireccionFrasco, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", (short)(0), 1, edtUsuarioDireccionFrasco_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioAgenciaFrasco_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioAgenciaFrasco_Internalname, "Agencia Frasco", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioAgenciaFrasco_Internalname, GXutil.ltrim( localUtil.ntoc( A127UsuarioAgenciaFrasco, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtUsuarioAgenciaFrasco_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioAgenciaFrasco_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioAgenciaFrasco_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionFrasco1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionFrasco1_Internalname, "Notificacion Frasco1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionFrasco1_Internalname, A128UsuarioNotificacionFrasco1, GXutil.rtrim( localUtil.format( A128UsuarioNotificacionFrasco1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionFrasco1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionFrasco1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionFrasco2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionFrasco2_Internalname, "Notificacion Frasco2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionFrasco2_Internalname, A129UsuarioNotificacionFrasco2, GXutil.rtrim( localUtil.format( A129UsuarioNotificacionFrasco2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionFrasco2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionFrasco2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionSolicitud1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionSolicitud1_Internalname, "Notificacion Solicitud1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionSolicitud1_Internalname, A130UsuarioNotificacionSolicitud1, GXutil.rtrim( localUtil.format( A130UsuarioNotificacionSolicitud1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionSolicitud1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionSolicitud1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionSolicitud2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionSolicitud2_Internalname, "Notificacion Solicitud2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionSolicitud2_Internalname, A131UsuarioNotificacionSolicitud2, GXutil.rtrim( localUtil.format( A131UsuarioNotificacionSolicitud2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionSolicitud2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionSolicitud2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionResultado1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionResultado1_Internalname, "Notificacion Resultado1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionResultado1_Internalname, A132UsuarioNotificacionResultado1, GXutil.rtrim( localUtil.format( A132UsuarioNotificacionResultado1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionResultado1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionResultado1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionResultado2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionResultado2_Internalname, "Notificacion Resultado2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionResultado2_Internalname, A133UsuarioNotificacionResultado2, GXutil.rtrim( localUtil.format( A133UsuarioNotificacionResultado2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionResultado2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionResultado2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionAvisos1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionAvisos1_Internalname, "Notificacion Avisos1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionAvisos1_Internalname, A134UsuarioNotificacionAvisos1, GXutil.rtrim( localUtil.format( A134UsuarioNotificacionAvisos1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionAvisos1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionAvisos1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioNotificacionAvisos2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioNotificacionAvisos2_Internalname, "Notificacion Avisos2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioNotificacionAvisos2_Internalname, A135UsuarioNotificacionAvisos2, GXutil.rtrim( localUtil.format( A135UsuarioNotificacionAvisos2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioNotificacionAvisos2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioNotificacionAvisos2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoCelular1_Internalname, "Tecnico Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoCelular1_Internalname, A136UsuarioTecnicoCelular1, GXutil.rtrim( localUtil.format( A136UsuarioTecnicoCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoCelular2_Internalname, "Tecnico Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoCelular2_Internalname, A137UsuarioTecnicoCelular2, GXutil.rtrim( localUtil.format( A137UsuarioTecnicoCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoCelularNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoCelularNombre1_Internalname, "Celular Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoCelularNombre1_Internalname, A138UsuarioTecnicoCelularNombre1, GXutil.rtrim( localUtil.format( A138UsuarioTecnicoCelularNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoCelularNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoCelularNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoCelularNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoCelularNombre2_Internalname, "Celular Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoCelularNombre2_Internalname, A139UsuarioTecnicoCelularNombre2, GXutil.rtrim( localUtil.format( A139UsuarioTecnicoCelularNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoCelularNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoCelularNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoTelefono1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoTelefono1_Internalname, "Tecnico Telefono1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoTelefono1_Internalname, A140UsuarioTecnicoTelefono1, GXutil.rtrim( localUtil.format( A140UsuarioTecnicoTelefono1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoTelefono1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoTelefono1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoTelefono2_Internalname, "Tecnico Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoTelefono2_Internalname, A141UsuarioTecnicoTelefono2, GXutil.rtrim( localUtil.format( A141UsuarioTecnicoTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoTelefonoNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoTelefonoNombre1_Internalname, "Telefono Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoTelefonoNombre1_Internalname, A142UsuarioTecnicoTelefonoNombre1, GXutil.rtrim( localUtil.format( A142UsuarioTecnicoTelefonoNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoTelefonoNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoTelefonoNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoTelefonoNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoTelefonoNombre2_Internalname, "Telefono Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoTelefonoNombre2_Internalname, A143UsuarioTecnicoTelefonoNombre2, GXutil.rtrim( localUtil.format( A143UsuarioTecnicoTelefonoNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoTelefonoNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoTelefonoNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoEmail1_Internalname, "Tecnico Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoEmail1_Internalname, A144UsuarioTecnicoEmail1, GXutil.rtrim( localUtil.format( A144UsuarioTecnicoEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoEmail2_Internalname, "Tecnico Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoEmail2_Internalname, A145UsuarioTecnicoEmail2, GXutil.rtrim( localUtil.format( A145UsuarioTecnicoEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoEmailNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoEmailNombre1_Internalname, "Email Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoEmailNombre1_Internalname, A146UsuarioTecnicoEmailNombre1, GXutil.rtrim( localUtil.format( A146UsuarioTecnicoEmailNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoEmailNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoEmailNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioTecnicoEmailNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioTecnicoEmailNombre2_Internalname, "Email Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioTecnicoEmailNombre2_Internalname, A147UsuarioTecnicoEmailNombre2, GXutil.rtrim( localUtil.format( A147UsuarioTecnicoEmailNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioTecnicoEmailNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioTecnicoEmailNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioRutTipo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioRutTipo_Internalname, "Rut Tipo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioRutTipo_Internalname, A148UsuarioRutTipo, GXutil.rtrim( localUtil.format( A148UsuarioRutTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioRutTipo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioRutTipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioFacDireccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioFacDireccion_Internalname, "Fac Direccion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtUsuarioFacDireccion_Internalname, A149UsuarioFacDireccion, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,214);\"", (short)(0), 1, edtUsuarioFacDireccion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioFacLocalidad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioFacLocalidad_Internalname, "Fac Localidad", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioFacLocalidad_Internalname, A150UsuarioFacLocalidad, GXutil.rtrim( localUtil.format( A150UsuarioFacLocalidad, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioFacLocalidad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioFacLocalidad_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioFacDepartamento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioFacDepartamento_Internalname, "Fac Departamento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioFacDepartamento_Internalname, A151UsuarioFacDepartamento, GXutil.rtrim( localUtil.format( A151UsuarioFacDepartamento, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioFacDepartamento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioFacDepartamento_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioFacEmailEnvio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioFacEmailEnvio_Internalname, "Email Envio", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioFacEmailEnvio_Internalname, A152UsuarioFacEmailEnvio, GXutil.rtrim( localUtil.format( A152UsuarioFacEmailEnvio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioFacEmailEnvio_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioFacEmailEnvio_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaCelular1_Internalname, "Cobranza Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaCelular1_Internalname, A153UsuarioCobranzaCelular1, GXutil.rtrim( localUtil.format( A153UsuarioCobranzaCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaCelular2_Internalname, "Cobranza Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaCelular2_Internalname, A154UsuarioCobranzaCelular2, GXutil.rtrim( localUtil.format( A154UsuarioCobranzaCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaCelularNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaCelularNombre1_Internalname, "Celular Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaCelularNombre1_Internalname, A155UsuarioCobranzaCelularNombre1, GXutil.rtrim( localUtil.format( A155UsuarioCobranzaCelularNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaCelularNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaCelularNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaCelularNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaCelularNombre2_Internalname, "Celular Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaCelularNombre2_Internalname, A156UsuarioCobranzaCelularNombre2, GXutil.rtrim( localUtil.format( A156UsuarioCobranzaCelularNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaCelularNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaCelularNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaTelefono1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaTelefono1_Internalname, "Cobranza Telefono1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaTelefono1_Internalname, A157UsuarioCobranzaTelefono1, GXutil.rtrim( localUtil.format( A157UsuarioCobranzaTelefono1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaTelefono1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaTelefono1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaTelefono2_Internalname, "Cobranza Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaTelefono2_Internalname, A158UsuarioCobranzaTelefono2, GXutil.rtrim( localUtil.format( A158UsuarioCobranzaTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaTelefonoNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaTelefonoNombre1_Internalname, "Telefono Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaTelefonoNombre1_Internalname, A159UsuarioCobranzaTelefonoNombre1, GXutil.rtrim( localUtil.format( A159UsuarioCobranzaTelefonoNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaTelefonoNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaTelefonoNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaTelefonoNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaTelefonoNombre2_Internalname, "Telefono Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaTelefonoNombre2_Internalname, A160UsuarioCobranzaTelefonoNombre2, GXutil.rtrim( localUtil.format( A160UsuarioCobranzaTelefonoNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaTelefonoNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaTelefonoNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaEmail1_Internalname, "Cobranza Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaEmail1_Internalname, A161UsuarioCobranzaEmail1, GXutil.rtrim( localUtil.format( A161UsuarioCobranzaEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaEmail2_Internalname, "Cobranza Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaEmail2_Internalname, A162UsuarioCobranzaEmail2, GXutil.rtrim( localUtil.format( A162UsuarioCobranzaEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaEmailNombre1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaEmailNombre1_Internalname, "Email Nombre1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaEmailNombre1_Internalname, A163UsuarioCobranzaEmailNombre1, GXutil.rtrim( localUtil.format( A163UsuarioCobranzaEmailNombre1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaEmailNombre1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaEmailNombre1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCobranzaEmailNombre2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCobranzaEmailNombre2_Internalname, "Email Nombre2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCobranzaEmailNombre2_Internalname, A164UsuarioCobranzaEmailNombre2, GXutil.rtrim( localUtil.format( A164UsuarioCobranzaEmailNombre2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCobranzaEmailNombre2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCobranzaEmailNombre2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsuarioCedula_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtUsuarioCedula_Internalname, "Cedula", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtUsuarioCedula_Internalname, A165UsuarioCedula, GXutil.rtrim( localUtil.format( A165UsuarioCedula, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuarioCedula_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsuarioCedula_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Usuario.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 303,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Usuario.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z5UsuarioId = localUtil.ctol( httpContext.cgiGet( "Z5UsuarioId"), ".", ",") ;
         Z114UsuarioEmail = httpContext.cgiGet( "Z114UsuarioEmail") ;
         n114UsuarioEmail = ((GXutil.strcmp("", A114UsuarioEmail)==0) ? true : false) ;
         Z115UsuarioUsuarioWeb = httpContext.cgiGet( "Z115UsuarioUsuarioWeb") ;
         n115UsuarioUsuarioWeb = ((GXutil.strcmp("", A115UsuarioUsuarioWeb)==0) ? true : false) ;
         Z116UsuarioNombre = httpContext.cgiGet( "Z116UsuarioNombre") ;
         n116UsuarioNombre = ((GXutil.strcmp("", A116UsuarioNombre)==0) ? true : false) ;
         Z117UsuarioDicose = httpContext.cgiGet( "Z117UsuarioDicose") ;
         n117UsuarioDicose = ((GXutil.strcmp("", A117UsuarioDicose)==0) ? true : false) ;
         Z118UsuarioRazonSocial = httpContext.cgiGet( "Z118UsuarioRazonSocial") ;
         n118UsuarioRazonSocial = ((GXutil.strcmp("", A118UsuarioRazonSocial)==0) ? true : false) ;
         Z119UsuarioRut = httpContext.cgiGet( "Z119UsuarioRut") ;
         n119UsuarioRut = ((GXutil.strcmp("", A119UsuarioRut)==0) ? true : false) ;
         Z120UsuarioIdNet = localUtil.ctol( httpContext.cgiGet( "Z120UsuarioIdNet"), ".", ",") ;
         n120UsuarioIdNet = ((0==A120UsuarioIdNet) ? true : false) ;
         Z121UsuarioDireccion = httpContext.cgiGet( "Z121UsuarioDireccion") ;
         n121UsuarioDireccion = ((GXutil.strcmp("", A121UsuarioDireccion)==0) ? true : false) ;
         Z122UsuarioTipousuario = (short)(localUtil.ctol( httpContext.cgiGet( "Z122UsuarioTipousuario"), ".", ",")) ;
         n122UsuarioTipousuario = ((0==A122UsuarioTipousuario) ? true : false) ;
         Z123UsuarioIdTecnico1 = localUtil.ctol( httpContext.cgiGet( "Z123UsuarioIdTecnico1"), ".", ",") ;
         n123UsuarioIdTecnico1 = ((0==A123UsuarioIdTecnico1) ? true : false) ;
         Z124UsuarioIdTecnico2 = localUtil.ctol( httpContext.cgiGet( "Z124UsuarioIdTecnico2"), ".", ",") ;
         n124UsuarioIdTecnico2 = ((0==A124UsuarioIdTecnico2) ? true : false) ;
         Z125UsuarioIdTecnico3 = localUtil.ctol( httpContext.cgiGet( "Z125UsuarioIdTecnico3"), ".", ",") ;
         n125UsuarioIdTecnico3 = ((0==A125UsuarioIdTecnico3) ? true : false) ;
         Z126UsuarioDireccionFrasco = httpContext.cgiGet( "Z126UsuarioDireccionFrasco") ;
         n126UsuarioDireccionFrasco = ((GXutil.strcmp("", A126UsuarioDireccionFrasco)==0) ? true : false) ;
         Z127UsuarioAgenciaFrasco = (short)(localUtil.ctol( httpContext.cgiGet( "Z127UsuarioAgenciaFrasco"), ".", ",")) ;
         n127UsuarioAgenciaFrasco = ((0==A127UsuarioAgenciaFrasco) ? true : false) ;
         Z128UsuarioNotificacionFrasco1 = httpContext.cgiGet( "Z128UsuarioNotificacionFrasco1") ;
         n128UsuarioNotificacionFrasco1 = ((GXutil.strcmp("", A128UsuarioNotificacionFrasco1)==0) ? true : false) ;
         Z129UsuarioNotificacionFrasco2 = httpContext.cgiGet( "Z129UsuarioNotificacionFrasco2") ;
         n129UsuarioNotificacionFrasco2 = ((GXutil.strcmp("", A129UsuarioNotificacionFrasco2)==0) ? true : false) ;
         Z130UsuarioNotificacionSolicitud1 = httpContext.cgiGet( "Z130UsuarioNotificacionSolicitud1") ;
         n130UsuarioNotificacionSolicitud1 = ((GXutil.strcmp("", A130UsuarioNotificacionSolicitud1)==0) ? true : false) ;
         Z131UsuarioNotificacionSolicitud2 = httpContext.cgiGet( "Z131UsuarioNotificacionSolicitud2") ;
         n131UsuarioNotificacionSolicitud2 = ((GXutil.strcmp("", A131UsuarioNotificacionSolicitud2)==0) ? true : false) ;
         Z132UsuarioNotificacionResultado1 = httpContext.cgiGet( "Z132UsuarioNotificacionResultado1") ;
         n132UsuarioNotificacionResultado1 = ((GXutil.strcmp("", A132UsuarioNotificacionResultado1)==0) ? true : false) ;
         Z133UsuarioNotificacionResultado2 = httpContext.cgiGet( "Z133UsuarioNotificacionResultado2") ;
         n133UsuarioNotificacionResultado2 = ((GXutil.strcmp("", A133UsuarioNotificacionResultado2)==0) ? true : false) ;
         Z134UsuarioNotificacionAvisos1 = httpContext.cgiGet( "Z134UsuarioNotificacionAvisos1") ;
         n134UsuarioNotificacionAvisos1 = ((GXutil.strcmp("", A134UsuarioNotificacionAvisos1)==0) ? true : false) ;
         Z135UsuarioNotificacionAvisos2 = httpContext.cgiGet( "Z135UsuarioNotificacionAvisos2") ;
         n135UsuarioNotificacionAvisos2 = ((GXutil.strcmp("", A135UsuarioNotificacionAvisos2)==0) ? true : false) ;
         Z136UsuarioTecnicoCelular1 = httpContext.cgiGet( "Z136UsuarioTecnicoCelular1") ;
         n136UsuarioTecnicoCelular1 = ((GXutil.strcmp("", A136UsuarioTecnicoCelular1)==0) ? true : false) ;
         Z137UsuarioTecnicoCelular2 = httpContext.cgiGet( "Z137UsuarioTecnicoCelular2") ;
         n137UsuarioTecnicoCelular2 = ((GXutil.strcmp("", A137UsuarioTecnicoCelular2)==0) ? true : false) ;
         Z138UsuarioTecnicoCelularNombre1 = httpContext.cgiGet( "Z138UsuarioTecnicoCelularNombre1") ;
         n138UsuarioTecnicoCelularNombre1 = ((GXutil.strcmp("", A138UsuarioTecnicoCelularNombre1)==0) ? true : false) ;
         Z139UsuarioTecnicoCelularNombre2 = httpContext.cgiGet( "Z139UsuarioTecnicoCelularNombre2") ;
         n139UsuarioTecnicoCelularNombre2 = ((GXutil.strcmp("", A139UsuarioTecnicoCelularNombre2)==0) ? true : false) ;
         Z140UsuarioTecnicoTelefono1 = httpContext.cgiGet( "Z140UsuarioTecnicoTelefono1") ;
         n140UsuarioTecnicoTelefono1 = ((GXutil.strcmp("", A140UsuarioTecnicoTelefono1)==0) ? true : false) ;
         Z141UsuarioTecnicoTelefono2 = httpContext.cgiGet( "Z141UsuarioTecnicoTelefono2") ;
         n141UsuarioTecnicoTelefono2 = ((GXutil.strcmp("", A141UsuarioTecnicoTelefono2)==0) ? true : false) ;
         Z142UsuarioTecnicoTelefonoNombre1 = httpContext.cgiGet( "Z142UsuarioTecnicoTelefonoNombre1") ;
         n142UsuarioTecnicoTelefonoNombre1 = ((GXutil.strcmp("", A142UsuarioTecnicoTelefonoNombre1)==0) ? true : false) ;
         Z143UsuarioTecnicoTelefonoNombre2 = httpContext.cgiGet( "Z143UsuarioTecnicoTelefonoNombre2") ;
         n143UsuarioTecnicoTelefonoNombre2 = ((GXutil.strcmp("", A143UsuarioTecnicoTelefonoNombre2)==0) ? true : false) ;
         Z144UsuarioTecnicoEmail1 = httpContext.cgiGet( "Z144UsuarioTecnicoEmail1") ;
         n144UsuarioTecnicoEmail1 = ((GXutil.strcmp("", A144UsuarioTecnicoEmail1)==0) ? true : false) ;
         Z145UsuarioTecnicoEmail2 = httpContext.cgiGet( "Z145UsuarioTecnicoEmail2") ;
         n145UsuarioTecnicoEmail2 = ((GXutil.strcmp("", A145UsuarioTecnicoEmail2)==0) ? true : false) ;
         Z146UsuarioTecnicoEmailNombre1 = httpContext.cgiGet( "Z146UsuarioTecnicoEmailNombre1") ;
         n146UsuarioTecnicoEmailNombre1 = ((GXutil.strcmp("", A146UsuarioTecnicoEmailNombre1)==0) ? true : false) ;
         Z147UsuarioTecnicoEmailNombre2 = httpContext.cgiGet( "Z147UsuarioTecnicoEmailNombre2") ;
         n147UsuarioTecnicoEmailNombre2 = ((GXutil.strcmp("", A147UsuarioTecnicoEmailNombre2)==0) ? true : false) ;
         Z148UsuarioRutTipo = httpContext.cgiGet( "Z148UsuarioRutTipo") ;
         n148UsuarioRutTipo = ((GXutil.strcmp("", A148UsuarioRutTipo)==0) ? true : false) ;
         Z149UsuarioFacDireccion = httpContext.cgiGet( "Z149UsuarioFacDireccion") ;
         n149UsuarioFacDireccion = ((GXutil.strcmp("", A149UsuarioFacDireccion)==0) ? true : false) ;
         Z150UsuarioFacLocalidad = httpContext.cgiGet( "Z150UsuarioFacLocalidad") ;
         n150UsuarioFacLocalidad = ((GXutil.strcmp("", A150UsuarioFacLocalidad)==0) ? true : false) ;
         Z151UsuarioFacDepartamento = httpContext.cgiGet( "Z151UsuarioFacDepartamento") ;
         n151UsuarioFacDepartamento = ((GXutil.strcmp("", A151UsuarioFacDepartamento)==0) ? true : false) ;
         Z152UsuarioFacEmailEnvio = httpContext.cgiGet( "Z152UsuarioFacEmailEnvio") ;
         n152UsuarioFacEmailEnvio = ((GXutil.strcmp("", A152UsuarioFacEmailEnvio)==0) ? true : false) ;
         Z153UsuarioCobranzaCelular1 = httpContext.cgiGet( "Z153UsuarioCobranzaCelular1") ;
         n153UsuarioCobranzaCelular1 = ((GXutil.strcmp("", A153UsuarioCobranzaCelular1)==0) ? true : false) ;
         Z154UsuarioCobranzaCelular2 = httpContext.cgiGet( "Z154UsuarioCobranzaCelular2") ;
         n154UsuarioCobranzaCelular2 = ((GXutil.strcmp("", A154UsuarioCobranzaCelular2)==0) ? true : false) ;
         Z155UsuarioCobranzaCelularNombre1 = httpContext.cgiGet( "Z155UsuarioCobranzaCelularNombre1") ;
         n155UsuarioCobranzaCelularNombre1 = ((GXutil.strcmp("", A155UsuarioCobranzaCelularNombre1)==0) ? true : false) ;
         Z156UsuarioCobranzaCelularNombre2 = httpContext.cgiGet( "Z156UsuarioCobranzaCelularNombre2") ;
         n156UsuarioCobranzaCelularNombre2 = ((GXutil.strcmp("", A156UsuarioCobranzaCelularNombre2)==0) ? true : false) ;
         Z157UsuarioCobranzaTelefono1 = httpContext.cgiGet( "Z157UsuarioCobranzaTelefono1") ;
         n157UsuarioCobranzaTelefono1 = ((GXutil.strcmp("", A157UsuarioCobranzaTelefono1)==0) ? true : false) ;
         Z158UsuarioCobranzaTelefono2 = httpContext.cgiGet( "Z158UsuarioCobranzaTelefono2") ;
         n158UsuarioCobranzaTelefono2 = ((GXutil.strcmp("", A158UsuarioCobranzaTelefono2)==0) ? true : false) ;
         Z159UsuarioCobranzaTelefonoNombre1 = httpContext.cgiGet( "Z159UsuarioCobranzaTelefonoNombre1") ;
         n159UsuarioCobranzaTelefonoNombre1 = ((GXutil.strcmp("", A159UsuarioCobranzaTelefonoNombre1)==0) ? true : false) ;
         Z160UsuarioCobranzaTelefonoNombre2 = httpContext.cgiGet( "Z160UsuarioCobranzaTelefonoNombre2") ;
         n160UsuarioCobranzaTelefonoNombre2 = ((GXutil.strcmp("", A160UsuarioCobranzaTelefonoNombre2)==0) ? true : false) ;
         Z161UsuarioCobranzaEmail1 = httpContext.cgiGet( "Z161UsuarioCobranzaEmail1") ;
         n161UsuarioCobranzaEmail1 = ((GXutil.strcmp("", A161UsuarioCobranzaEmail1)==0) ? true : false) ;
         Z162UsuarioCobranzaEmail2 = httpContext.cgiGet( "Z162UsuarioCobranzaEmail2") ;
         n162UsuarioCobranzaEmail2 = ((GXutil.strcmp("", A162UsuarioCobranzaEmail2)==0) ? true : false) ;
         Z163UsuarioCobranzaEmailNombre1 = httpContext.cgiGet( "Z163UsuarioCobranzaEmailNombre1") ;
         n163UsuarioCobranzaEmailNombre1 = ((GXutil.strcmp("", A163UsuarioCobranzaEmailNombre1)==0) ? true : false) ;
         Z164UsuarioCobranzaEmailNombre2 = httpContext.cgiGet( "Z164UsuarioCobranzaEmailNombre2") ;
         n164UsuarioCobranzaEmailNombre2 = ((GXutil.strcmp("", A164UsuarioCobranzaEmailNombre2)==0) ? true : false) ;
         Z165UsuarioCedula = httpContext.cgiGet( "Z165UsuarioCedula") ;
         n165UsuarioCedula = ((GXutil.strcmp("", A165UsuarioCedula)==0) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioId_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5UsuarioId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
         }
         else
         {
            A5UsuarioId = localUtil.ctol( httpContext.cgiGet( edtUsuarioId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
         }
         A114UsuarioEmail = httpContext.cgiGet( edtUsuarioEmail_Internalname) ;
         n114UsuarioEmail = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A114UsuarioEmail", A114UsuarioEmail);
         n114UsuarioEmail = ((GXutil.strcmp("", A114UsuarioEmail)==0) ? true : false) ;
         A115UsuarioUsuarioWeb = httpContext.cgiGet( edtUsuarioUsuarioWeb_Internalname) ;
         n115UsuarioUsuarioWeb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A115UsuarioUsuarioWeb", A115UsuarioUsuarioWeb);
         n115UsuarioUsuarioWeb = ((GXutil.strcmp("", A115UsuarioUsuarioWeb)==0) ? true : false) ;
         A116UsuarioNombre = httpContext.cgiGet( edtUsuarioNombre_Internalname) ;
         n116UsuarioNombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A116UsuarioNombre", A116UsuarioNombre);
         n116UsuarioNombre = ((GXutil.strcmp("", A116UsuarioNombre)==0) ? true : false) ;
         A117UsuarioDicose = httpContext.cgiGet( edtUsuarioDicose_Internalname) ;
         n117UsuarioDicose = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A117UsuarioDicose", A117UsuarioDicose);
         n117UsuarioDicose = ((GXutil.strcmp("", A117UsuarioDicose)==0) ? true : false) ;
         A118UsuarioRazonSocial = httpContext.cgiGet( edtUsuarioRazonSocial_Internalname) ;
         n118UsuarioRazonSocial = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A118UsuarioRazonSocial", A118UsuarioRazonSocial);
         n118UsuarioRazonSocial = ((GXutil.strcmp("", A118UsuarioRazonSocial)==0) ? true : false) ;
         A119UsuarioRut = httpContext.cgiGet( edtUsuarioRut_Internalname) ;
         n119UsuarioRut = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A119UsuarioRut", A119UsuarioRut);
         n119UsuarioRut = ((GXutil.strcmp("", A119UsuarioRut)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdNet_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdNet_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOIDNET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioIdNet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A120UsuarioIdNet = 0 ;
            n120UsuarioIdNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A120UsuarioIdNet), 18, 0));
         }
         else
         {
            A120UsuarioIdNet = localUtil.ctol( httpContext.cgiGet( edtUsuarioIdNet_Internalname), ".", ",") ;
            n120UsuarioIdNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A120UsuarioIdNet), 18, 0));
         }
         n120UsuarioIdNet = ((0==A120UsuarioIdNet) ? true : false) ;
         A121UsuarioDireccion = httpContext.cgiGet( edtUsuarioDireccion_Internalname) ;
         n121UsuarioDireccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A121UsuarioDireccion", A121UsuarioDireccion);
         n121UsuarioDireccion = ((GXutil.strcmp("", A121UsuarioDireccion)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioTipousuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioTipousuario_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOTIPOUSUARIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioTipousuario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A122UsuarioTipousuario = (short)(0) ;
            n122UsuarioTipousuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A122UsuarioTipousuario), 4, 0));
         }
         else
         {
            A122UsuarioTipousuario = (short)(localUtil.ctol( httpContext.cgiGet( edtUsuarioTipousuario_Internalname), ".", ",")) ;
            n122UsuarioTipousuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A122UsuarioTipousuario), 4, 0));
         }
         n122UsuarioTipousuario = ((0==A122UsuarioTipousuario) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico1_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico1_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOIDTECNICO1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioIdTecnico1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A123UsuarioIdTecnico1 = 0 ;
            n123UsuarioIdTecnico1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), 18, 0));
         }
         else
         {
            A123UsuarioIdTecnico1 = localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico1_Internalname), ".", ",") ;
            n123UsuarioIdTecnico1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), 18, 0));
         }
         n123UsuarioIdTecnico1 = ((0==A123UsuarioIdTecnico1) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico2_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico2_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOIDTECNICO2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioIdTecnico2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A124UsuarioIdTecnico2 = 0 ;
            n124UsuarioIdTecnico2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), 18, 0));
         }
         else
         {
            A124UsuarioIdTecnico2 = localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico2_Internalname), ".", ",") ;
            n124UsuarioIdTecnico2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), 18, 0));
         }
         n124UsuarioIdTecnico2 = ((0==A124UsuarioIdTecnico2) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico3_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico3_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOIDTECNICO3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioIdTecnico3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A125UsuarioIdTecnico3 = 0 ;
            n125UsuarioIdTecnico3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), 18, 0));
         }
         else
         {
            A125UsuarioIdTecnico3 = localUtil.ctol( httpContext.cgiGet( edtUsuarioIdTecnico3_Internalname), ".", ",") ;
            n125UsuarioIdTecnico3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), 18, 0));
         }
         n125UsuarioIdTecnico3 = ((0==A125UsuarioIdTecnico3) ? true : false) ;
         A126UsuarioDireccionFrasco = httpContext.cgiGet( edtUsuarioDireccionFrasco_Internalname) ;
         n126UsuarioDireccionFrasco = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A126UsuarioDireccionFrasco", A126UsuarioDireccionFrasco);
         n126UsuarioDireccionFrasco = ((GXutil.strcmp("", A126UsuarioDireccionFrasco)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioAgenciaFrasco_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsuarioAgenciaFrasco_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUARIOAGENCIAFRASCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsuarioAgenciaFrasco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A127UsuarioAgenciaFrasco = (short)(0) ;
            n127UsuarioAgenciaFrasco = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), 4, 0));
         }
         else
         {
            A127UsuarioAgenciaFrasco = (short)(localUtil.ctol( httpContext.cgiGet( edtUsuarioAgenciaFrasco_Internalname), ".", ",")) ;
            n127UsuarioAgenciaFrasco = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), 4, 0));
         }
         n127UsuarioAgenciaFrasco = ((0==A127UsuarioAgenciaFrasco) ? true : false) ;
         A128UsuarioNotificacionFrasco1 = httpContext.cgiGet( edtUsuarioNotificacionFrasco1_Internalname) ;
         n128UsuarioNotificacionFrasco1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UsuarioNotificacionFrasco1", A128UsuarioNotificacionFrasco1);
         n128UsuarioNotificacionFrasco1 = ((GXutil.strcmp("", A128UsuarioNotificacionFrasco1)==0) ? true : false) ;
         A129UsuarioNotificacionFrasco2 = httpContext.cgiGet( edtUsuarioNotificacionFrasco2_Internalname) ;
         n129UsuarioNotificacionFrasco2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129UsuarioNotificacionFrasco2", A129UsuarioNotificacionFrasco2);
         n129UsuarioNotificacionFrasco2 = ((GXutil.strcmp("", A129UsuarioNotificacionFrasco2)==0) ? true : false) ;
         A130UsuarioNotificacionSolicitud1 = httpContext.cgiGet( edtUsuarioNotificacionSolicitud1_Internalname) ;
         n130UsuarioNotificacionSolicitud1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130UsuarioNotificacionSolicitud1", A130UsuarioNotificacionSolicitud1);
         n130UsuarioNotificacionSolicitud1 = ((GXutil.strcmp("", A130UsuarioNotificacionSolicitud1)==0) ? true : false) ;
         A131UsuarioNotificacionSolicitud2 = httpContext.cgiGet( edtUsuarioNotificacionSolicitud2_Internalname) ;
         n131UsuarioNotificacionSolicitud2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A131UsuarioNotificacionSolicitud2", A131UsuarioNotificacionSolicitud2);
         n131UsuarioNotificacionSolicitud2 = ((GXutil.strcmp("", A131UsuarioNotificacionSolicitud2)==0) ? true : false) ;
         A132UsuarioNotificacionResultado1 = httpContext.cgiGet( edtUsuarioNotificacionResultado1_Internalname) ;
         n132UsuarioNotificacionResultado1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132UsuarioNotificacionResultado1", A132UsuarioNotificacionResultado1);
         n132UsuarioNotificacionResultado1 = ((GXutil.strcmp("", A132UsuarioNotificacionResultado1)==0) ? true : false) ;
         A133UsuarioNotificacionResultado2 = httpContext.cgiGet( edtUsuarioNotificacionResultado2_Internalname) ;
         n133UsuarioNotificacionResultado2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A133UsuarioNotificacionResultado2", A133UsuarioNotificacionResultado2);
         n133UsuarioNotificacionResultado2 = ((GXutil.strcmp("", A133UsuarioNotificacionResultado2)==0) ? true : false) ;
         A134UsuarioNotificacionAvisos1 = httpContext.cgiGet( edtUsuarioNotificacionAvisos1_Internalname) ;
         n134UsuarioNotificacionAvisos1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A134UsuarioNotificacionAvisos1", A134UsuarioNotificacionAvisos1);
         n134UsuarioNotificacionAvisos1 = ((GXutil.strcmp("", A134UsuarioNotificacionAvisos1)==0) ? true : false) ;
         A135UsuarioNotificacionAvisos2 = httpContext.cgiGet( edtUsuarioNotificacionAvisos2_Internalname) ;
         n135UsuarioNotificacionAvisos2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A135UsuarioNotificacionAvisos2", A135UsuarioNotificacionAvisos2);
         n135UsuarioNotificacionAvisos2 = ((GXutil.strcmp("", A135UsuarioNotificacionAvisos2)==0) ? true : false) ;
         A136UsuarioTecnicoCelular1 = httpContext.cgiGet( edtUsuarioTecnicoCelular1_Internalname) ;
         n136UsuarioTecnicoCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A136UsuarioTecnicoCelular1", A136UsuarioTecnicoCelular1);
         n136UsuarioTecnicoCelular1 = ((GXutil.strcmp("", A136UsuarioTecnicoCelular1)==0) ? true : false) ;
         A137UsuarioTecnicoCelular2 = httpContext.cgiGet( edtUsuarioTecnicoCelular2_Internalname) ;
         n137UsuarioTecnicoCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A137UsuarioTecnicoCelular2", A137UsuarioTecnicoCelular2);
         n137UsuarioTecnicoCelular2 = ((GXutil.strcmp("", A137UsuarioTecnicoCelular2)==0) ? true : false) ;
         A138UsuarioTecnicoCelularNombre1 = httpContext.cgiGet( edtUsuarioTecnicoCelularNombre1_Internalname) ;
         n138UsuarioTecnicoCelularNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A138UsuarioTecnicoCelularNombre1", A138UsuarioTecnicoCelularNombre1);
         n138UsuarioTecnicoCelularNombre1 = ((GXutil.strcmp("", A138UsuarioTecnicoCelularNombre1)==0) ? true : false) ;
         A139UsuarioTecnicoCelularNombre2 = httpContext.cgiGet( edtUsuarioTecnicoCelularNombre2_Internalname) ;
         n139UsuarioTecnicoCelularNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A139UsuarioTecnicoCelularNombre2", A139UsuarioTecnicoCelularNombre2);
         n139UsuarioTecnicoCelularNombre2 = ((GXutil.strcmp("", A139UsuarioTecnicoCelularNombre2)==0) ? true : false) ;
         A140UsuarioTecnicoTelefono1 = httpContext.cgiGet( edtUsuarioTecnicoTelefono1_Internalname) ;
         n140UsuarioTecnicoTelefono1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A140UsuarioTecnicoTelefono1", A140UsuarioTecnicoTelefono1);
         n140UsuarioTecnicoTelefono1 = ((GXutil.strcmp("", A140UsuarioTecnicoTelefono1)==0) ? true : false) ;
         A141UsuarioTecnicoTelefono2 = httpContext.cgiGet( edtUsuarioTecnicoTelefono2_Internalname) ;
         n141UsuarioTecnicoTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A141UsuarioTecnicoTelefono2", A141UsuarioTecnicoTelefono2);
         n141UsuarioTecnicoTelefono2 = ((GXutil.strcmp("", A141UsuarioTecnicoTelefono2)==0) ? true : false) ;
         A142UsuarioTecnicoTelefonoNombre1 = httpContext.cgiGet( edtUsuarioTecnicoTelefonoNombre1_Internalname) ;
         n142UsuarioTecnicoTelefonoNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A142UsuarioTecnicoTelefonoNombre1", A142UsuarioTecnicoTelefonoNombre1);
         n142UsuarioTecnicoTelefonoNombre1 = ((GXutil.strcmp("", A142UsuarioTecnicoTelefonoNombre1)==0) ? true : false) ;
         A143UsuarioTecnicoTelefonoNombre2 = httpContext.cgiGet( edtUsuarioTecnicoTelefonoNombre2_Internalname) ;
         n143UsuarioTecnicoTelefonoNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A143UsuarioTecnicoTelefonoNombre2", A143UsuarioTecnicoTelefonoNombre2);
         n143UsuarioTecnicoTelefonoNombre2 = ((GXutil.strcmp("", A143UsuarioTecnicoTelefonoNombre2)==0) ? true : false) ;
         A144UsuarioTecnicoEmail1 = httpContext.cgiGet( edtUsuarioTecnicoEmail1_Internalname) ;
         n144UsuarioTecnicoEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A144UsuarioTecnicoEmail1", A144UsuarioTecnicoEmail1);
         n144UsuarioTecnicoEmail1 = ((GXutil.strcmp("", A144UsuarioTecnicoEmail1)==0) ? true : false) ;
         A145UsuarioTecnicoEmail2 = httpContext.cgiGet( edtUsuarioTecnicoEmail2_Internalname) ;
         n145UsuarioTecnicoEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A145UsuarioTecnicoEmail2", A145UsuarioTecnicoEmail2);
         n145UsuarioTecnicoEmail2 = ((GXutil.strcmp("", A145UsuarioTecnicoEmail2)==0) ? true : false) ;
         A146UsuarioTecnicoEmailNombre1 = httpContext.cgiGet( edtUsuarioTecnicoEmailNombre1_Internalname) ;
         n146UsuarioTecnicoEmailNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A146UsuarioTecnicoEmailNombre1", A146UsuarioTecnicoEmailNombre1);
         n146UsuarioTecnicoEmailNombre1 = ((GXutil.strcmp("", A146UsuarioTecnicoEmailNombre1)==0) ? true : false) ;
         A147UsuarioTecnicoEmailNombre2 = httpContext.cgiGet( edtUsuarioTecnicoEmailNombre2_Internalname) ;
         n147UsuarioTecnicoEmailNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A147UsuarioTecnicoEmailNombre2", A147UsuarioTecnicoEmailNombre2);
         n147UsuarioTecnicoEmailNombre2 = ((GXutil.strcmp("", A147UsuarioTecnicoEmailNombre2)==0) ? true : false) ;
         A148UsuarioRutTipo = httpContext.cgiGet( edtUsuarioRutTipo_Internalname) ;
         n148UsuarioRutTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A148UsuarioRutTipo", A148UsuarioRutTipo);
         n148UsuarioRutTipo = ((GXutil.strcmp("", A148UsuarioRutTipo)==0) ? true : false) ;
         A149UsuarioFacDireccion = httpContext.cgiGet( edtUsuarioFacDireccion_Internalname) ;
         n149UsuarioFacDireccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A149UsuarioFacDireccion", A149UsuarioFacDireccion);
         n149UsuarioFacDireccion = ((GXutil.strcmp("", A149UsuarioFacDireccion)==0) ? true : false) ;
         A150UsuarioFacLocalidad = httpContext.cgiGet( edtUsuarioFacLocalidad_Internalname) ;
         n150UsuarioFacLocalidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A150UsuarioFacLocalidad", A150UsuarioFacLocalidad);
         n150UsuarioFacLocalidad = ((GXutil.strcmp("", A150UsuarioFacLocalidad)==0) ? true : false) ;
         A151UsuarioFacDepartamento = httpContext.cgiGet( edtUsuarioFacDepartamento_Internalname) ;
         n151UsuarioFacDepartamento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A151UsuarioFacDepartamento", A151UsuarioFacDepartamento);
         n151UsuarioFacDepartamento = ((GXutil.strcmp("", A151UsuarioFacDepartamento)==0) ? true : false) ;
         A152UsuarioFacEmailEnvio = httpContext.cgiGet( edtUsuarioFacEmailEnvio_Internalname) ;
         n152UsuarioFacEmailEnvio = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A152UsuarioFacEmailEnvio", A152UsuarioFacEmailEnvio);
         n152UsuarioFacEmailEnvio = ((GXutil.strcmp("", A152UsuarioFacEmailEnvio)==0) ? true : false) ;
         A153UsuarioCobranzaCelular1 = httpContext.cgiGet( edtUsuarioCobranzaCelular1_Internalname) ;
         n153UsuarioCobranzaCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A153UsuarioCobranzaCelular1", A153UsuarioCobranzaCelular1);
         n153UsuarioCobranzaCelular1 = ((GXutil.strcmp("", A153UsuarioCobranzaCelular1)==0) ? true : false) ;
         A154UsuarioCobranzaCelular2 = httpContext.cgiGet( edtUsuarioCobranzaCelular2_Internalname) ;
         n154UsuarioCobranzaCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A154UsuarioCobranzaCelular2", A154UsuarioCobranzaCelular2);
         n154UsuarioCobranzaCelular2 = ((GXutil.strcmp("", A154UsuarioCobranzaCelular2)==0) ? true : false) ;
         A155UsuarioCobranzaCelularNombre1 = httpContext.cgiGet( edtUsuarioCobranzaCelularNombre1_Internalname) ;
         n155UsuarioCobranzaCelularNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A155UsuarioCobranzaCelularNombre1", A155UsuarioCobranzaCelularNombre1);
         n155UsuarioCobranzaCelularNombre1 = ((GXutil.strcmp("", A155UsuarioCobranzaCelularNombre1)==0) ? true : false) ;
         A156UsuarioCobranzaCelularNombre2 = httpContext.cgiGet( edtUsuarioCobranzaCelularNombre2_Internalname) ;
         n156UsuarioCobranzaCelularNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A156UsuarioCobranzaCelularNombre2", A156UsuarioCobranzaCelularNombre2);
         n156UsuarioCobranzaCelularNombre2 = ((GXutil.strcmp("", A156UsuarioCobranzaCelularNombre2)==0) ? true : false) ;
         A157UsuarioCobranzaTelefono1 = httpContext.cgiGet( edtUsuarioCobranzaTelefono1_Internalname) ;
         n157UsuarioCobranzaTelefono1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A157UsuarioCobranzaTelefono1", A157UsuarioCobranzaTelefono1);
         n157UsuarioCobranzaTelefono1 = ((GXutil.strcmp("", A157UsuarioCobranzaTelefono1)==0) ? true : false) ;
         A158UsuarioCobranzaTelefono2 = httpContext.cgiGet( edtUsuarioCobranzaTelefono2_Internalname) ;
         n158UsuarioCobranzaTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A158UsuarioCobranzaTelefono2", A158UsuarioCobranzaTelefono2);
         n158UsuarioCobranzaTelefono2 = ((GXutil.strcmp("", A158UsuarioCobranzaTelefono2)==0) ? true : false) ;
         A159UsuarioCobranzaTelefonoNombre1 = httpContext.cgiGet( edtUsuarioCobranzaTelefonoNombre1_Internalname) ;
         n159UsuarioCobranzaTelefonoNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A159UsuarioCobranzaTelefonoNombre1", A159UsuarioCobranzaTelefonoNombre1);
         n159UsuarioCobranzaTelefonoNombre1 = ((GXutil.strcmp("", A159UsuarioCobranzaTelefonoNombre1)==0) ? true : false) ;
         A160UsuarioCobranzaTelefonoNombre2 = httpContext.cgiGet( edtUsuarioCobranzaTelefonoNombre2_Internalname) ;
         n160UsuarioCobranzaTelefonoNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A160UsuarioCobranzaTelefonoNombre2", A160UsuarioCobranzaTelefonoNombre2);
         n160UsuarioCobranzaTelefonoNombre2 = ((GXutil.strcmp("", A160UsuarioCobranzaTelefonoNombre2)==0) ? true : false) ;
         A161UsuarioCobranzaEmail1 = httpContext.cgiGet( edtUsuarioCobranzaEmail1_Internalname) ;
         n161UsuarioCobranzaEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A161UsuarioCobranzaEmail1", A161UsuarioCobranzaEmail1);
         n161UsuarioCobranzaEmail1 = ((GXutil.strcmp("", A161UsuarioCobranzaEmail1)==0) ? true : false) ;
         A162UsuarioCobranzaEmail2 = httpContext.cgiGet( edtUsuarioCobranzaEmail2_Internalname) ;
         n162UsuarioCobranzaEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UsuarioCobranzaEmail2", A162UsuarioCobranzaEmail2);
         n162UsuarioCobranzaEmail2 = ((GXutil.strcmp("", A162UsuarioCobranzaEmail2)==0) ? true : false) ;
         A163UsuarioCobranzaEmailNombre1 = httpContext.cgiGet( edtUsuarioCobranzaEmailNombre1_Internalname) ;
         n163UsuarioCobranzaEmailNombre1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A163UsuarioCobranzaEmailNombre1", A163UsuarioCobranzaEmailNombre1);
         n163UsuarioCobranzaEmailNombre1 = ((GXutil.strcmp("", A163UsuarioCobranzaEmailNombre1)==0) ? true : false) ;
         A164UsuarioCobranzaEmailNombre2 = httpContext.cgiGet( edtUsuarioCobranzaEmailNombre2_Internalname) ;
         n164UsuarioCobranzaEmailNombre2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A164UsuarioCobranzaEmailNombre2", A164UsuarioCobranzaEmailNombre2);
         n164UsuarioCobranzaEmailNombre2 = ((GXutil.strcmp("", A164UsuarioCobranzaEmailNombre2)==0) ? true : false) ;
         A165UsuarioCedula = httpContext.cgiGet( edtUsuarioCedula_Internalname) ;
         n165UsuarioCedula = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A165UsuarioCedula", A165UsuarioCedula);
         n165UsuarioCedula = ((GXutil.strcmp("", A165UsuarioCedula)==0) ? true : false) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A5UsuarioId = GXutil.lval( httpContext.GetPar( "UsuarioId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll055( ) ;
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
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes055( ) ;
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

   public void resetCaption050( )
   {
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z114UsuarioEmail = T00053_A114UsuarioEmail[0] ;
            Z115UsuarioUsuarioWeb = T00053_A115UsuarioUsuarioWeb[0] ;
            Z116UsuarioNombre = T00053_A116UsuarioNombre[0] ;
            Z117UsuarioDicose = T00053_A117UsuarioDicose[0] ;
            Z118UsuarioRazonSocial = T00053_A118UsuarioRazonSocial[0] ;
            Z119UsuarioRut = T00053_A119UsuarioRut[0] ;
            Z120UsuarioIdNet = T00053_A120UsuarioIdNet[0] ;
            Z121UsuarioDireccion = T00053_A121UsuarioDireccion[0] ;
            Z122UsuarioTipousuario = T00053_A122UsuarioTipousuario[0] ;
            Z123UsuarioIdTecnico1 = T00053_A123UsuarioIdTecnico1[0] ;
            Z124UsuarioIdTecnico2 = T00053_A124UsuarioIdTecnico2[0] ;
            Z125UsuarioIdTecnico3 = T00053_A125UsuarioIdTecnico3[0] ;
            Z126UsuarioDireccionFrasco = T00053_A126UsuarioDireccionFrasco[0] ;
            Z127UsuarioAgenciaFrasco = T00053_A127UsuarioAgenciaFrasco[0] ;
            Z128UsuarioNotificacionFrasco1 = T00053_A128UsuarioNotificacionFrasco1[0] ;
            Z129UsuarioNotificacionFrasco2 = T00053_A129UsuarioNotificacionFrasco2[0] ;
            Z130UsuarioNotificacionSolicitud1 = T00053_A130UsuarioNotificacionSolicitud1[0] ;
            Z131UsuarioNotificacionSolicitud2 = T00053_A131UsuarioNotificacionSolicitud2[0] ;
            Z132UsuarioNotificacionResultado1 = T00053_A132UsuarioNotificacionResultado1[0] ;
            Z133UsuarioNotificacionResultado2 = T00053_A133UsuarioNotificacionResultado2[0] ;
            Z134UsuarioNotificacionAvisos1 = T00053_A134UsuarioNotificacionAvisos1[0] ;
            Z135UsuarioNotificacionAvisos2 = T00053_A135UsuarioNotificacionAvisos2[0] ;
            Z136UsuarioTecnicoCelular1 = T00053_A136UsuarioTecnicoCelular1[0] ;
            Z137UsuarioTecnicoCelular2 = T00053_A137UsuarioTecnicoCelular2[0] ;
            Z138UsuarioTecnicoCelularNombre1 = T00053_A138UsuarioTecnicoCelularNombre1[0] ;
            Z139UsuarioTecnicoCelularNombre2 = T00053_A139UsuarioTecnicoCelularNombre2[0] ;
            Z140UsuarioTecnicoTelefono1 = T00053_A140UsuarioTecnicoTelefono1[0] ;
            Z141UsuarioTecnicoTelefono2 = T00053_A141UsuarioTecnicoTelefono2[0] ;
            Z142UsuarioTecnicoTelefonoNombre1 = T00053_A142UsuarioTecnicoTelefonoNombre1[0] ;
            Z143UsuarioTecnicoTelefonoNombre2 = T00053_A143UsuarioTecnicoTelefonoNombre2[0] ;
            Z144UsuarioTecnicoEmail1 = T00053_A144UsuarioTecnicoEmail1[0] ;
            Z145UsuarioTecnicoEmail2 = T00053_A145UsuarioTecnicoEmail2[0] ;
            Z146UsuarioTecnicoEmailNombre1 = T00053_A146UsuarioTecnicoEmailNombre1[0] ;
            Z147UsuarioTecnicoEmailNombre2 = T00053_A147UsuarioTecnicoEmailNombre2[0] ;
            Z148UsuarioRutTipo = T00053_A148UsuarioRutTipo[0] ;
            Z149UsuarioFacDireccion = T00053_A149UsuarioFacDireccion[0] ;
            Z150UsuarioFacLocalidad = T00053_A150UsuarioFacLocalidad[0] ;
            Z151UsuarioFacDepartamento = T00053_A151UsuarioFacDepartamento[0] ;
            Z152UsuarioFacEmailEnvio = T00053_A152UsuarioFacEmailEnvio[0] ;
            Z153UsuarioCobranzaCelular1 = T00053_A153UsuarioCobranzaCelular1[0] ;
            Z154UsuarioCobranzaCelular2 = T00053_A154UsuarioCobranzaCelular2[0] ;
            Z155UsuarioCobranzaCelularNombre1 = T00053_A155UsuarioCobranzaCelularNombre1[0] ;
            Z156UsuarioCobranzaCelularNombre2 = T00053_A156UsuarioCobranzaCelularNombre2[0] ;
            Z157UsuarioCobranzaTelefono1 = T00053_A157UsuarioCobranzaTelefono1[0] ;
            Z158UsuarioCobranzaTelefono2 = T00053_A158UsuarioCobranzaTelefono2[0] ;
            Z159UsuarioCobranzaTelefonoNombre1 = T00053_A159UsuarioCobranzaTelefonoNombre1[0] ;
            Z160UsuarioCobranzaTelefonoNombre2 = T00053_A160UsuarioCobranzaTelefonoNombre2[0] ;
            Z161UsuarioCobranzaEmail1 = T00053_A161UsuarioCobranzaEmail1[0] ;
            Z162UsuarioCobranzaEmail2 = T00053_A162UsuarioCobranzaEmail2[0] ;
            Z163UsuarioCobranzaEmailNombre1 = T00053_A163UsuarioCobranzaEmailNombre1[0] ;
            Z164UsuarioCobranzaEmailNombre2 = T00053_A164UsuarioCobranzaEmailNombre2[0] ;
            Z165UsuarioCedula = T00053_A165UsuarioCedula[0] ;
         }
         else
         {
            Z114UsuarioEmail = A114UsuarioEmail ;
            Z115UsuarioUsuarioWeb = A115UsuarioUsuarioWeb ;
            Z116UsuarioNombre = A116UsuarioNombre ;
            Z117UsuarioDicose = A117UsuarioDicose ;
            Z118UsuarioRazonSocial = A118UsuarioRazonSocial ;
            Z119UsuarioRut = A119UsuarioRut ;
            Z120UsuarioIdNet = A120UsuarioIdNet ;
            Z121UsuarioDireccion = A121UsuarioDireccion ;
            Z122UsuarioTipousuario = A122UsuarioTipousuario ;
            Z123UsuarioIdTecnico1 = A123UsuarioIdTecnico1 ;
            Z124UsuarioIdTecnico2 = A124UsuarioIdTecnico2 ;
            Z125UsuarioIdTecnico3 = A125UsuarioIdTecnico3 ;
            Z126UsuarioDireccionFrasco = A126UsuarioDireccionFrasco ;
            Z127UsuarioAgenciaFrasco = A127UsuarioAgenciaFrasco ;
            Z128UsuarioNotificacionFrasco1 = A128UsuarioNotificacionFrasco1 ;
            Z129UsuarioNotificacionFrasco2 = A129UsuarioNotificacionFrasco2 ;
            Z130UsuarioNotificacionSolicitud1 = A130UsuarioNotificacionSolicitud1 ;
            Z131UsuarioNotificacionSolicitud2 = A131UsuarioNotificacionSolicitud2 ;
            Z132UsuarioNotificacionResultado1 = A132UsuarioNotificacionResultado1 ;
            Z133UsuarioNotificacionResultado2 = A133UsuarioNotificacionResultado2 ;
            Z134UsuarioNotificacionAvisos1 = A134UsuarioNotificacionAvisos1 ;
            Z135UsuarioNotificacionAvisos2 = A135UsuarioNotificacionAvisos2 ;
            Z136UsuarioTecnicoCelular1 = A136UsuarioTecnicoCelular1 ;
            Z137UsuarioTecnicoCelular2 = A137UsuarioTecnicoCelular2 ;
            Z138UsuarioTecnicoCelularNombre1 = A138UsuarioTecnicoCelularNombre1 ;
            Z139UsuarioTecnicoCelularNombre2 = A139UsuarioTecnicoCelularNombre2 ;
            Z140UsuarioTecnicoTelefono1 = A140UsuarioTecnicoTelefono1 ;
            Z141UsuarioTecnicoTelefono2 = A141UsuarioTecnicoTelefono2 ;
            Z142UsuarioTecnicoTelefonoNombre1 = A142UsuarioTecnicoTelefonoNombre1 ;
            Z143UsuarioTecnicoTelefonoNombre2 = A143UsuarioTecnicoTelefonoNombre2 ;
            Z144UsuarioTecnicoEmail1 = A144UsuarioTecnicoEmail1 ;
            Z145UsuarioTecnicoEmail2 = A145UsuarioTecnicoEmail2 ;
            Z146UsuarioTecnicoEmailNombre1 = A146UsuarioTecnicoEmailNombre1 ;
            Z147UsuarioTecnicoEmailNombre2 = A147UsuarioTecnicoEmailNombre2 ;
            Z148UsuarioRutTipo = A148UsuarioRutTipo ;
            Z149UsuarioFacDireccion = A149UsuarioFacDireccion ;
            Z150UsuarioFacLocalidad = A150UsuarioFacLocalidad ;
            Z151UsuarioFacDepartamento = A151UsuarioFacDepartamento ;
            Z152UsuarioFacEmailEnvio = A152UsuarioFacEmailEnvio ;
            Z153UsuarioCobranzaCelular1 = A153UsuarioCobranzaCelular1 ;
            Z154UsuarioCobranzaCelular2 = A154UsuarioCobranzaCelular2 ;
            Z155UsuarioCobranzaCelularNombre1 = A155UsuarioCobranzaCelularNombre1 ;
            Z156UsuarioCobranzaCelularNombre2 = A156UsuarioCobranzaCelularNombre2 ;
            Z157UsuarioCobranzaTelefono1 = A157UsuarioCobranzaTelefono1 ;
            Z158UsuarioCobranzaTelefono2 = A158UsuarioCobranzaTelefono2 ;
            Z159UsuarioCobranzaTelefonoNombre1 = A159UsuarioCobranzaTelefonoNombre1 ;
            Z160UsuarioCobranzaTelefonoNombre2 = A160UsuarioCobranzaTelefonoNombre2 ;
            Z161UsuarioCobranzaEmail1 = A161UsuarioCobranzaEmail1 ;
            Z162UsuarioCobranzaEmail2 = A162UsuarioCobranzaEmail2 ;
            Z163UsuarioCobranzaEmailNombre1 = A163UsuarioCobranzaEmailNombre1 ;
            Z164UsuarioCobranzaEmailNombre2 = A164UsuarioCobranzaEmailNombre2 ;
            Z165UsuarioCedula = A165UsuarioCedula ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z5UsuarioId = A5UsuarioId ;
         Z114UsuarioEmail = A114UsuarioEmail ;
         Z115UsuarioUsuarioWeb = A115UsuarioUsuarioWeb ;
         Z116UsuarioNombre = A116UsuarioNombre ;
         Z117UsuarioDicose = A117UsuarioDicose ;
         Z118UsuarioRazonSocial = A118UsuarioRazonSocial ;
         Z119UsuarioRut = A119UsuarioRut ;
         Z120UsuarioIdNet = A120UsuarioIdNet ;
         Z121UsuarioDireccion = A121UsuarioDireccion ;
         Z122UsuarioTipousuario = A122UsuarioTipousuario ;
         Z123UsuarioIdTecnico1 = A123UsuarioIdTecnico1 ;
         Z124UsuarioIdTecnico2 = A124UsuarioIdTecnico2 ;
         Z125UsuarioIdTecnico3 = A125UsuarioIdTecnico3 ;
         Z126UsuarioDireccionFrasco = A126UsuarioDireccionFrasco ;
         Z127UsuarioAgenciaFrasco = A127UsuarioAgenciaFrasco ;
         Z128UsuarioNotificacionFrasco1 = A128UsuarioNotificacionFrasco1 ;
         Z129UsuarioNotificacionFrasco2 = A129UsuarioNotificacionFrasco2 ;
         Z130UsuarioNotificacionSolicitud1 = A130UsuarioNotificacionSolicitud1 ;
         Z131UsuarioNotificacionSolicitud2 = A131UsuarioNotificacionSolicitud2 ;
         Z132UsuarioNotificacionResultado1 = A132UsuarioNotificacionResultado1 ;
         Z133UsuarioNotificacionResultado2 = A133UsuarioNotificacionResultado2 ;
         Z134UsuarioNotificacionAvisos1 = A134UsuarioNotificacionAvisos1 ;
         Z135UsuarioNotificacionAvisos2 = A135UsuarioNotificacionAvisos2 ;
         Z136UsuarioTecnicoCelular1 = A136UsuarioTecnicoCelular1 ;
         Z137UsuarioTecnicoCelular2 = A137UsuarioTecnicoCelular2 ;
         Z138UsuarioTecnicoCelularNombre1 = A138UsuarioTecnicoCelularNombre1 ;
         Z139UsuarioTecnicoCelularNombre2 = A139UsuarioTecnicoCelularNombre2 ;
         Z140UsuarioTecnicoTelefono1 = A140UsuarioTecnicoTelefono1 ;
         Z141UsuarioTecnicoTelefono2 = A141UsuarioTecnicoTelefono2 ;
         Z142UsuarioTecnicoTelefonoNombre1 = A142UsuarioTecnicoTelefonoNombre1 ;
         Z143UsuarioTecnicoTelefonoNombre2 = A143UsuarioTecnicoTelefonoNombre2 ;
         Z144UsuarioTecnicoEmail1 = A144UsuarioTecnicoEmail1 ;
         Z145UsuarioTecnicoEmail2 = A145UsuarioTecnicoEmail2 ;
         Z146UsuarioTecnicoEmailNombre1 = A146UsuarioTecnicoEmailNombre1 ;
         Z147UsuarioTecnicoEmailNombre2 = A147UsuarioTecnicoEmailNombre2 ;
         Z148UsuarioRutTipo = A148UsuarioRutTipo ;
         Z149UsuarioFacDireccion = A149UsuarioFacDireccion ;
         Z150UsuarioFacLocalidad = A150UsuarioFacLocalidad ;
         Z151UsuarioFacDepartamento = A151UsuarioFacDepartamento ;
         Z152UsuarioFacEmailEnvio = A152UsuarioFacEmailEnvio ;
         Z153UsuarioCobranzaCelular1 = A153UsuarioCobranzaCelular1 ;
         Z154UsuarioCobranzaCelular2 = A154UsuarioCobranzaCelular2 ;
         Z155UsuarioCobranzaCelularNombre1 = A155UsuarioCobranzaCelularNombre1 ;
         Z156UsuarioCobranzaCelularNombre2 = A156UsuarioCobranzaCelularNombre2 ;
         Z157UsuarioCobranzaTelefono1 = A157UsuarioCobranzaTelefono1 ;
         Z158UsuarioCobranzaTelefono2 = A158UsuarioCobranzaTelefono2 ;
         Z159UsuarioCobranzaTelefonoNombre1 = A159UsuarioCobranzaTelefonoNombre1 ;
         Z160UsuarioCobranzaTelefonoNombre2 = A160UsuarioCobranzaTelefonoNombre2 ;
         Z161UsuarioCobranzaEmail1 = A161UsuarioCobranzaEmail1 ;
         Z162UsuarioCobranzaEmail2 = A162UsuarioCobranzaEmail2 ;
         Z163UsuarioCobranzaEmailNombre1 = A163UsuarioCobranzaEmailNombre1 ;
         Z164UsuarioCobranzaEmailNombre2 = A164UsuarioCobranzaEmailNombre2 ;
         Z165UsuarioCedula = A165UsuarioCedula ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
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
   }

   public void load055( )
   {
      /* Using cursor T00054 */
      pr_default.execute(2, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A114UsuarioEmail = T00054_A114UsuarioEmail[0] ;
         n114UsuarioEmail = T00054_n114UsuarioEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114UsuarioEmail", A114UsuarioEmail);
         A115UsuarioUsuarioWeb = T00054_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = T00054_n115UsuarioUsuarioWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115UsuarioUsuarioWeb", A115UsuarioUsuarioWeb);
         A116UsuarioNombre = T00054_A116UsuarioNombre[0] ;
         n116UsuarioNombre = T00054_n116UsuarioNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116UsuarioNombre", A116UsuarioNombre);
         A117UsuarioDicose = T00054_A117UsuarioDicose[0] ;
         n117UsuarioDicose = T00054_n117UsuarioDicose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117UsuarioDicose", A117UsuarioDicose);
         A118UsuarioRazonSocial = T00054_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = T00054_n118UsuarioRazonSocial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118UsuarioRazonSocial", A118UsuarioRazonSocial);
         A119UsuarioRut = T00054_A119UsuarioRut[0] ;
         n119UsuarioRut = T00054_n119UsuarioRut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119UsuarioRut", A119UsuarioRut);
         A120UsuarioIdNet = T00054_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = T00054_n120UsuarioIdNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A120UsuarioIdNet), 18, 0));
         A121UsuarioDireccion = T00054_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = T00054_n121UsuarioDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121UsuarioDireccion", A121UsuarioDireccion);
         A122UsuarioTipousuario = T00054_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = T00054_n122UsuarioTipousuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A122UsuarioTipousuario), 4, 0));
         A123UsuarioIdTecnico1 = T00054_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = T00054_n123UsuarioIdTecnico1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), 18, 0));
         A124UsuarioIdTecnico2 = T00054_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = T00054_n124UsuarioIdTecnico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), 18, 0));
         A125UsuarioIdTecnico3 = T00054_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = T00054_n125UsuarioIdTecnico3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), 18, 0));
         A126UsuarioDireccionFrasco = T00054_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = T00054_n126UsuarioDireccionFrasco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126UsuarioDireccionFrasco", A126UsuarioDireccionFrasco);
         A127UsuarioAgenciaFrasco = T00054_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = T00054_n127UsuarioAgenciaFrasco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), 4, 0));
         A128UsuarioNotificacionFrasco1 = T00054_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = T00054_n128UsuarioNotificacionFrasco1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UsuarioNotificacionFrasco1", A128UsuarioNotificacionFrasco1);
         A129UsuarioNotificacionFrasco2 = T00054_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = T00054_n129UsuarioNotificacionFrasco2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129UsuarioNotificacionFrasco2", A129UsuarioNotificacionFrasco2);
         A130UsuarioNotificacionSolicitud1 = T00054_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = T00054_n130UsuarioNotificacionSolicitud1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130UsuarioNotificacionSolicitud1", A130UsuarioNotificacionSolicitud1);
         A131UsuarioNotificacionSolicitud2 = T00054_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = T00054_n131UsuarioNotificacionSolicitud2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A131UsuarioNotificacionSolicitud2", A131UsuarioNotificacionSolicitud2);
         A132UsuarioNotificacionResultado1 = T00054_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = T00054_n132UsuarioNotificacionResultado1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132UsuarioNotificacionResultado1", A132UsuarioNotificacionResultado1);
         A133UsuarioNotificacionResultado2 = T00054_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = T00054_n133UsuarioNotificacionResultado2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A133UsuarioNotificacionResultado2", A133UsuarioNotificacionResultado2);
         A134UsuarioNotificacionAvisos1 = T00054_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = T00054_n134UsuarioNotificacionAvisos1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134UsuarioNotificacionAvisos1", A134UsuarioNotificacionAvisos1);
         A135UsuarioNotificacionAvisos2 = T00054_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = T00054_n135UsuarioNotificacionAvisos2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135UsuarioNotificacionAvisos2", A135UsuarioNotificacionAvisos2);
         A136UsuarioTecnicoCelular1 = T00054_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = T00054_n136UsuarioTecnicoCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136UsuarioTecnicoCelular1", A136UsuarioTecnicoCelular1);
         A137UsuarioTecnicoCelular2 = T00054_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = T00054_n137UsuarioTecnicoCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A137UsuarioTecnicoCelular2", A137UsuarioTecnicoCelular2);
         A138UsuarioTecnicoCelularNombre1 = T00054_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = T00054_n138UsuarioTecnicoCelularNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A138UsuarioTecnicoCelularNombre1", A138UsuarioTecnicoCelularNombre1);
         A139UsuarioTecnicoCelularNombre2 = T00054_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = T00054_n139UsuarioTecnicoCelularNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A139UsuarioTecnicoCelularNombre2", A139UsuarioTecnicoCelularNombre2);
         A140UsuarioTecnicoTelefono1 = T00054_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = T00054_n140UsuarioTecnicoTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140UsuarioTecnicoTelefono1", A140UsuarioTecnicoTelefono1);
         A141UsuarioTecnicoTelefono2 = T00054_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = T00054_n141UsuarioTecnicoTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141UsuarioTecnicoTelefono2", A141UsuarioTecnicoTelefono2);
         A142UsuarioTecnicoTelefonoNombre1 = T00054_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = T00054_n142UsuarioTecnicoTelefonoNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142UsuarioTecnicoTelefonoNombre1", A142UsuarioTecnicoTelefonoNombre1);
         A143UsuarioTecnicoTelefonoNombre2 = T00054_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = T00054_n143UsuarioTecnicoTelefonoNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143UsuarioTecnicoTelefonoNombre2", A143UsuarioTecnicoTelefonoNombre2);
         A144UsuarioTecnicoEmail1 = T00054_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = T00054_n144UsuarioTecnicoEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144UsuarioTecnicoEmail1", A144UsuarioTecnicoEmail1);
         A145UsuarioTecnicoEmail2 = T00054_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = T00054_n145UsuarioTecnicoEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145UsuarioTecnicoEmail2", A145UsuarioTecnicoEmail2);
         A146UsuarioTecnicoEmailNombre1 = T00054_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = T00054_n146UsuarioTecnicoEmailNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146UsuarioTecnicoEmailNombre1", A146UsuarioTecnicoEmailNombre1);
         A147UsuarioTecnicoEmailNombre2 = T00054_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = T00054_n147UsuarioTecnicoEmailNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147UsuarioTecnicoEmailNombre2", A147UsuarioTecnicoEmailNombre2);
         A148UsuarioRutTipo = T00054_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = T00054_n148UsuarioRutTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148UsuarioRutTipo", A148UsuarioRutTipo);
         A149UsuarioFacDireccion = T00054_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = T00054_n149UsuarioFacDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149UsuarioFacDireccion", A149UsuarioFacDireccion);
         A150UsuarioFacLocalidad = T00054_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = T00054_n150UsuarioFacLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150UsuarioFacLocalidad", A150UsuarioFacLocalidad);
         A151UsuarioFacDepartamento = T00054_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = T00054_n151UsuarioFacDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151UsuarioFacDepartamento", A151UsuarioFacDepartamento);
         A152UsuarioFacEmailEnvio = T00054_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = T00054_n152UsuarioFacEmailEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152UsuarioFacEmailEnvio", A152UsuarioFacEmailEnvio);
         A153UsuarioCobranzaCelular1 = T00054_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = T00054_n153UsuarioCobranzaCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153UsuarioCobranzaCelular1", A153UsuarioCobranzaCelular1);
         A154UsuarioCobranzaCelular2 = T00054_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = T00054_n154UsuarioCobranzaCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154UsuarioCobranzaCelular2", A154UsuarioCobranzaCelular2);
         A155UsuarioCobranzaCelularNombre1 = T00054_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = T00054_n155UsuarioCobranzaCelularNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155UsuarioCobranzaCelularNombre1", A155UsuarioCobranzaCelularNombre1);
         A156UsuarioCobranzaCelularNombre2 = T00054_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = T00054_n156UsuarioCobranzaCelularNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156UsuarioCobranzaCelularNombre2", A156UsuarioCobranzaCelularNombre2);
         A157UsuarioCobranzaTelefono1 = T00054_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = T00054_n157UsuarioCobranzaTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157UsuarioCobranzaTelefono1", A157UsuarioCobranzaTelefono1);
         A158UsuarioCobranzaTelefono2 = T00054_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = T00054_n158UsuarioCobranzaTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158UsuarioCobranzaTelefono2", A158UsuarioCobranzaTelefono2);
         A159UsuarioCobranzaTelefonoNombre1 = T00054_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = T00054_n159UsuarioCobranzaTelefonoNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159UsuarioCobranzaTelefonoNombre1", A159UsuarioCobranzaTelefonoNombre1);
         A160UsuarioCobranzaTelefonoNombre2 = T00054_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = T00054_n160UsuarioCobranzaTelefonoNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160UsuarioCobranzaTelefonoNombre2", A160UsuarioCobranzaTelefonoNombre2);
         A161UsuarioCobranzaEmail1 = T00054_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = T00054_n161UsuarioCobranzaEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161UsuarioCobranzaEmail1", A161UsuarioCobranzaEmail1);
         A162UsuarioCobranzaEmail2 = T00054_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = T00054_n162UsuarioCobranzaEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UsuarioCobranzaEmail2", A162UsuarioCobranzaEmail2);
         A163UsuarioCobranzaEmailNombre1 = T00054_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = T00054_n163UsuarioCobranzaEmailNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163UsuarioCobranzaEmailNombre1", A163UsuarioCobranzaEmailNombre1);
         A164UsuarioCobranzaEmailNombre2 = T00054_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = T00054_n164UsuarioCobranzaEmailNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164UsuarioCobranzaEmailNombre2", A164UsuarioCobranzaEmailNombre2);
         A165UsuarioCedula = T00054_A165UsuarioCedula[0] ;
         n165UsuarioCedula = T00054_n165UsuarioCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165UsuarioCedula", A165UsuarioCedula);
         zm055( -1) ;
      }
      pr_default.close(2);
      onLoadActions055( ) ;
   }

   public void onLoadActions055( )
   {
   }

   public void checkExtendedTable055( )
   {
      nIsDirty_5 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors055( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey055( )
   {
      /* Using cursor T00055 */
      pr_default.execute(3, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00053 */
      pr_default.execute(1, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm055( 1) ;
         RcdFound5 = (short)(1) ;
         A5UsuarioId = T00053_A5UsuarioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
         A114UsuarioEmail = T00053_A114UsuarioEmail[0] ;
         n114UsuarioEmail = T00053_n114UsuarioEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114UsuarioEmail", A114UsuarioEmail);
         A115UsuarioUsuarioWeb = T00053_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = T00053_n115UsuarioUsuarioWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115UsuarioUsuarioWeb", A115UsuarioUsuarioWeb);
         A116UsuarioNombre = T00053_A116UsuarioNombre[0] ;
         n116UsuarioNombre = T00053_n116UsuarioNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116UsuarioNombre", A116UsuarioNombre);
         A117UsuarioDicose = T00053_A117UsuarioDicose[0] ;
         n117UsuarioDicose = T00053_n117UsuarioDicose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117UsuarioDicose", A117UsuarioDicose);
         A118UsuarioRazonSocial = T00053_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = T00053_n118UsuarioRazonSocial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118UsuarioRazonSocial", A118UsuarioRazonSocial);
         A119UsuarioRut = T00053_A119UsuarioRut[0] ;
         n119UsuarioRut = T00053_n119UsuarioRut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119UsuarioRut", A119UsuarioRut);
         A120UsuarioIdNet = T00053_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = T00053_n120UsuarioIdNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A120UsuarioIdNet), 18, 0));
         A121UsuarioDireccion = T00053_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = T00053_n121UsuarioDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121UsuarioDireccion", A121UsuarioDireccion);
         A122UsuarioTipousuario = T00053_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = T00053_n122UsuarioTipousuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A122UsuarioTipousuario), 4, 0));
         A123UsuarioIdTecnico1 = T00053_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = T00053_n123UsuarioIdTecnico1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), 18, 0));
         A124UsuarioIdTecnico2 = T00053_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = T00053_n124UsuarioIdTecnico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), 18, 0));
         A125UsuarioIdTecnico3 = T00053_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = T00053_n125UsuarioIdTecnico3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), 18, 0));
         A126UsuarioDireccionFrasco = T00053_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = T00053_n126UsuarioDireccionFrasco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126UsuarioDireccionFrasco", A126UsuarioDireccionFrasco);
         A127UsuarioAgenciaFrasco = T00053_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = T00053_n127UsuarioAgenciaFrasco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), 4, 0));
         A128UsuarioNotificacionFrasco1 = T00053_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = T00053_n128UsuarioNotificacionFrasco1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UsuarioNotificacionFrasco1", A128UsuarioNotificacionFrasco1);
         A129UsuarioNotificacionFrasco2 = T00053_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = T00053_n129UsuarioNotificacionFrasco2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129UsuarioNotificacionFrasco2", A129UsuarioNotificacionFrasco2);
         A130UsuarioNotificacionSolicitud1 = T00053_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = T00053_n130UsuarioNotificacionSolicitud1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130UsuarioNotificacionSolicitud1", A130UsuarioNotificacionSolicitud1);
         A131UsuarioNotificacionSolicitud2 = T00053_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = T00053_n131UsuarioNotificacionSolicitud2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A131UsuarioNotificacionSolicitud2", A131UsuarioNotificacionSolicitud2);
         A132UsuarioNotificacionResultado1 = T00053_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = T00053_n132UsuarioNotificacionResultado1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132UsuarioNotificacionResultado1", A132UsuarioNotificacionResultado1);
         A133UsuarioNotificacionResultado2 = T00053_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = T00053_n133UsuarioNotificacionResultado2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A133UsuarioNotificacionResultado2", A133UsuarioNotificacionResultado2);
         A134UsuarioNotificacionAvisos1 = T00053_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = T00053_n134UsuarioNotificacionAvisos1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134UsuarioNotificacionAvisos1", A134UsuarioNotificacionAvisos1);
         A135UsuarioNotificacionAvisos2 = T00053_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = T00053_n135UsuarioNotificacionAvisos2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135UsuarioNotificacionAvisos2", A135UsuarioNotificacionAvisos2);
         A136UsuarioTecnicoCelular1 = T00053_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = T00053_n136UsuarioTecnicoCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136UsuarioTecnicoCelular1", A136UsuarioTecnicoCelular1);
         A137UsuarioTecnicoCelular2 = T00053_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = T00053_n137UsuarioTecnicoCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A137UsuarioTecnicoCelular2", A137UsuarioTecnicoCelular2);
         A138UsuarioTecnicoCelularNombre1 = T00053_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = T00053_n138UsuarioTecnicoCelularNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A138UsuarioTecnicoCelularNombre1", A138UsuarioTecnicoCelularNombre1);
         A139UsuarioTecnicoCelularNombre2 = T00053_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = T00053_n139UsuarioTecnicoCelularNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A139UsuarioTecnicoCelularNombre2", A139UsuarioTecnicoCelularNombre2);
         A140UsuarioTecnicoTelefono1 = T00053_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = T00053_n140UsuarioTecnicoTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140UsuarioTecnicoTelefono1", A140UsuarioTecnicoTelefono1);
         A141UsuarioTecnicoTelefono2 = T00053_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = T00053_n141UsuarioTecnicoTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141UsuarioTecnicoTelefono2", A141UsuarioTecnicoTelefono2);
         A142UsuarioTecnicoTelefonoNombre1 = T00053_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = T00053_n142UsuarioTecnicoTelefonoNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142UsuarioTecnicoTelefonoNombre1", A142UsuarioTecnicoTelefonoNombre1);
         A143UsuarioTecnicoTelefonoNombre2 = T00053_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = T00053_n143UsuarioTecnicoTelefonoNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143UsuarioTecnicoTelefonoNombre2", A143UsuarioTecnicoTelefonoNombre2);
         A144UsuarioTecnicoEmail1 = T00053_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = T00053_n144UsuarioTecnicoEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144UsuarioTecnicoEmail1", A144UsuarioTecnicoEmail1);
         A145UsuarioTecnicoEmail2 = T00053_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = T00053_n145UsuarioTecnicoEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145UsuarioTecnicoEmail2", A145UsuarioTecnicoEmail2);
         A146UsuarioTecnicoEmailNombre1 = T00053_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = T00053_n146UsuarioTecnicoEmailNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146UsuarioTecnicoEmailNombre1", A146UsuarioTecnicoEmailNombre1);
         A147UsuarioTecnicoEmailNombre2 = T00053_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = T00053_n147UsuarioTecnicoEmailNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147UsuarioTecnicoEmailNombre2", A147UsuarioTecnicoEmailNombre2);
         A148UsuarioRutTipo = T00053_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = T00053_n148UsuarioRutTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148UsuarioRutTipo", A148UsuarioRutTipo);
         A149UsuarioFacDireccion = T00053_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = T00053_n149UsuarioFacDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149UsuarioFacDireccion", A149UsuarioFacDireccion);
         A150UsuarioFacLocalidad = T00053_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = T00053_n150UsuarioFacLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150UsuarioFacLocalidad", A150UsuarioFacLocalidad);
         A151UsuarioFacDepartamento = T00053_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = T00053_n151UsuarioFacDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151UsuarioFacDepartamento", A151UsuarioFacDepartamento);
         A152UsuarioFacEmailEnvio = T00053_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = T00053_n152UsuarioFacEmailEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152UsuarioFacEmailEnvio", A152UsuarioFacEmailEnvio);
         A153UsuarioCobranzaCelular1 = T00053_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = T00053_n153UsuarioCobranzaCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153UsuarioCobranzaCelular1", A153UsuarioCobranzaCelular1);
         A154UsuarioCobranzaCelular2 = T00053_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = T00053_n154UsuarioCobranzaCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154UsuarioCobranzaCelular2", A154UsuarioCobranzaCelular2);
         A155UsuarioCobranzaCelularNombre1 = T00053_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = T00053_n155UsuarioCobranzaCelularNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155UsuarioCobranzaCelularNombre1", A155UsuarioCobranzaCelularNombre1);
         A156UsuarioCobranzaCelularNombre2 = T00053_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = T00053_n156UsuarioCobranzaCelularNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156UsuarioCobranzaCelularNombre2", A156UsuarioCobranzaCelularNombre2);
         A157UsuarioCobranzaTelefono1 = T00053_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = T00053_n157UsuarioCobranzaTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157UsuarioCobranzaTelefono1", A157UsuarioCobranzaTelefono1);
         A158UsuarioCobranzaTelefono2 = T00053_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = T00053_n158UsuarioCobranzaTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158UsuarioCobranzaTelefono2", A158UsuarioCobranzaTelefono2);
         A159UsuarioCobranzaTelefonoNombre1 = T00053_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = T00053_n159UsuarioCobranzaTelefonoNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159UsuarioCobranzaTelefonoNombre1", A159UsuarioCobranzaTelefonoNombre1);
         A160UsuarioCobranzaTelefonoNombre2 = T00053_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = T00053_n160UsuarioCobranzaTelefonoNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160UsuarioCobranzaTelefonoNombre2", A160UsuarioCobranzaTelefonoNombre2);
         A161UsuarioCobranzaEmail1 = T00053_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = T00053_n161UsuarioCobranzaEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161UsuarioCobranzaEmail1", A161UsuarioCobranzaEmail1);
         A162UsuarioCobranzaEmail2 = T00053_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = T00053_n162UsuarioCobranzaEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UsuarioCobranzaEmail2", A162UsuarioCobranzaEmail2);
         A163UsuarioCobranzaEmailNombre1 = T00053_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = T00053_n163UsuarioCobranzaEmailNombre1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163UsuarioCobranzaEmailNombre1", A163UsuarioCobranzaEmailNombre1);
         A164UsuarioCobranzaEmailNombre2 = T00053_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = T00053_n164UsuarioCobranzaEmailNombre2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164UsuarioCobranzaEmailNombre2", A164UsuarioCobranzaEmailNombre2);
         A165UsuarioCedula = T00053_A165UsuarioCedula[0] ;
         n165UsuarioCedula = T00053_n165UsuarioCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165UsuarioCedula", A165UsuarioCedula);
         Z5UsuarioId = A5UsuarioId ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00056 */
      pr_default.execute(4, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00056_A5UsuarioId[0] < A5UsuarioId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00056_A5UsuarioId[0] > A5UsuarioId ) ) )
         {
            A5UsuarioId = T00056_A5UsuarioId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00057 */
      pr_default.execute(5, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00057_A5UsuarioId[0] > A5UsuarioId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00057_A5UsuarioId[0] < A5UsuarioId ) ) )
         {
            A5UsuarioId = T00057_A5UsuarioId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtUsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert055( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A5UsuarioId != Z5UsuarioId )
            {
               A5UsuarioId = Z5UsuarioId ;
               httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "USUARIOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update055( ) ;
               GX_FocusControl = edtUsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A5UsuarioId != Z5UsuarioId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert055( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "USUARIOID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUsuarioId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUsuarioId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert055( ) ;
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
   }

   public void btn_delete( )
   {
      if ( A5UsuarioId != Z5UsuarioId )
      {
         A5UsuarioId = Z5UsuarioId ;
         httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "USUARIOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "USUARIOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext055( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00052 */
         pr_default.execute(0, new Object[] {Long.valueOf(A5UsuarioId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Usuario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z114UsuarioEmail, T00052_A114UsuarioEmail[0]) != 0 ) || ( GXutil.strcmp(Z115UsuarioUsuarioWeb, T00052_A115UsuarioUsuarioWeb[0]) != 0 ) || ( GXutil.strcmp(Z116UsuarioNombre, T00052_A116UsuarioNombre[0]) != 0 ) || ( GXutil.strcmp(Z117UsuarioDicose, T00052_A117UsuarioDicose[0]) != 0 ) || ( GXutil.strcmp(Z118UsuarioRazonSocial, T00052_A118UsuarioRazonSocial[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z119UsuarioRut, T00052_A119UsuarioRut[0]) != 0 ) || ( Z120UsuarioIdNet != T00052_A120UsuarioIdNet[0] ) || ( GXutil.strcmp(Z121UsuarioDireccion, T00052_A121UsuarioDireccion[0]) != 0 ) || ( Z122UsuarioTipousuario != T00052_A122UsuarioTipousuario[0] ) || ( Z123UsuarioIdTecnico1 != T00052_A123UsuarioIdTecnico1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z124UsuarioIdTecnico2 != T00052_A124UsuarioIdTecnico2[0] ) || ( Z125UsuarioIdTecnico3 != T00052_A125UsuarioIdTecnico3[0] ) || ( GXutil.strcmp(Z126UsuarioDireccionFrasco, T00052_A126UsuarioDireccionFrasco[0]) != 0 ) || ( Z127UsuarioAgenciaFrasco != T00052_A127UsuarioAgenciaFrasco[0] ) || ( GXutil.strcmp(Z128UsuarioNotificacionFrasco1, T00052_A128UsuarioNotificacionFrasco1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z129UsuarioNotificacionFrasco2, T00052_A129UsuarioNotificacionFrasco2[0]) != 0 ) || ( GXutil.strcmp(Z130UsuarioNotificacionSolicitud1, T00052_A130UsuarioNotificacionSolicitud1[0]) != 0 ) || ( GXutil.strcmp(Z131UsuarioNotificacionSolicitud2, T00052_A131UsuarioNotificacionSolicitud2[0]) != 0 ) || ( GXutil.strcmp(Z132UsuarioNotificacionResultado1, T00052_A132UsuarioNotificacionResultado1[0]) != 0 ) || ( GXutil.strcmp(Z133UsuarioNotificacionResultado2, T00052_A133UsuarioNotificacionResultado2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z134UsuarioNotificacionAvisos1, T00052_A134UsuarioNotificacionAvisos1[0]) != 0 ) || ( GXutil.strcmp(Z135UsuarioNotificacionAvisos2, T00052_A135UsuarioNotificacionAvisos2[0]) != 0 ) || ( GXutil.strcmp(Z136UsuarioTecnicoCelular1, T00052_A136UsuarioTecnicoCelular1[0]) != 0 ) || ( GXutil.strcmp(Z137UsuarioTecnicoCelular2, T00052_A137UsuarioTecnicoCelular2[0]) != 0 ) || ( GXutil.strcmp(Z138UsuarioTecnicoCelularNombre1, T00052_A138UsuarioTecnicoCelularNombre1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z139UsuarioTecnicoCelularNombre2, T00052_A139UsuarioTecnicoCelularNombre2[0]) != 0 ) || ( GXutil.strcmp(Z140UsuarioTecnicoTelefono1, T00052_A140UsuarioTecnicoTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z141UsuarioTecnicoTelefono2, T00052_A141UsuarioTecnicoTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z142UsuarioTecnicoTelefonoNombre1, T00052_A142UsuarioTecnicoTelefonoNombre1[0]) != 0 ) || ( GXutil.strcmp(Z143UsuarioTecnicoTelefonoNombre2, T00052_A143UsuarioTecnicoTelefonoNombre2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z144UsuarioTecnicoEmail1, T00052_A144UsuarioTecnicoEmail1[0]) != 0 ) || ( GXutil.strcmp(Z145UsuarioTecnicoEmail2, T00052_A145UsuarioTecnicoEmail2[0]) != 0 ) || ( GXutil.strcmp(Z146UsuarioTecnicoEmailNombre1, T00052_A146UsuarioTecnicoEmailNombre1[0]) != 0 ) || ( GXutil.strcmp(Z147UsuarioTecnicoEmailNombre2, T00052_A147UsuarioTecnicoEmailNombre2[0]) != 0 ) || ( GXutil.strcmp(Z148UsuarioRutTipo, T00052_A148UsuarioRutTipo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z149UsuarioFacDireccion, T00052_A149UsuarioFacDireccion[0]) != 0 ) || ( GXutil.strcmp(Z150UsuarioFacLocalidad, T00052_A150UsuarioFacLocalidad[0]) != 0 ) || ( GXutil.strcmp(Z151UsuarioFacDepartamento, T00052_A151UsuarioFacDepartamento[0]) != 0 ) || ( GXutil.strcmp(Z152UsuarioFacEmailEnvio, T00052_A152UsuarioFacEmailEnvio[0]) != 0 ) || ( GXutil.strcmp(Z153UsuarioCobranzaCelular1, T00052_A153UsuarioCobranzaCelular1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z154UsuarioCobranzaCelular2, T00052_A154UsuarioCobranzaCelular2[0]) != 0 ) || ( GXutil.strcmp(Z155UsuarioCobranzaCelularNombre1, T00052_A155UsuarioCobranzaCelularNombre1[0]) != 0 ) || ( GXutil.strcmp(Z156UsuarioCobranzaCelularNombre2, T00052_A156UsuarioCobranzaCelularNombre2[0]) != 0 ) || ( GXutil.strcmp(Z157UsuarioCobranzaTelefono1, T00052_A157UsuarioCobranzaTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z158UsuarioCobranzaTelefono2, T00052_A158UsuarioCobranzaTelefono2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z159UsuarioCobranzaTelefonoNombre1, T00052_A159UsuarioCobranzaTelefonoNombre1[0]) != 0 ) || ( GXutil.strcmp(Z160UsuarioCobranzaTelefonoNombre2, T00052_A160UsuarioCobranzaTelefonoNombre2[0]) != 0 ) || ( GXutil.strcmp(Z161UsuarioCobranzaEmail1, T00052_A161UsuarioCobranzaEmail1[0]) != 0 ) || ( GXutil.strcmp(Z162UsuarioCobranzaEmail2, T00052_A162UsuarioCobranzaEmail2[0]) != 0 ) || ( GXutil.strcmp(Z163UsuarioCobranzaEmailNombre1, T00052_A163UsuarioCobranzaEmailNombre1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z164UsuarioCobranzaEmailNombre2, T00052_A164UsuarioCobranzaEmailNombre2[0]) != 0 ) || ( GXutil.strcmp(Z165UsuarioCedula, T00052_A165UsuarioCedula[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z114UsuarioEmail, T00052_A114UsuarioEmail[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioEmail");
               GXutil.writeLogRaw("Old: ",Z114UsuarioEmail);
               GXutil.writeLogRaw("Current: ",T00052_A114UsuarioEmail[0]);
            }
            if ( GXutil.strcmp(Z115UsuarioUsuarioWeb, T00052_A115UsuarioUsuarioWeb[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioUsuarioWeb");
               GXutil.writeLogRaw("Old: ",Z115UsuarioUsuarioWeb);
               GXutil.writeLogRaw("Current: ",T00052_A115UsuarioUsuarioWeb[0]);
            }
            if ( GXutil.strcmp(Z116UsuarioNombre, T00052_A116UsuarioNombre[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNombre");
               GXutil.writeLogRaw("Old: ",Z116UsuarioNombre);
               GXutil.writeLogRaw("Current: ",T00052_A116UsuarioNombre[0]);
            }
            if ( GXutil.strcmp(Z117UsuarioDicose, T00052_A117UsuarioDicose[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioDicose");
               GXutil.writeLogRaw("Old: ",Z117UsuarioDicose);
               GXutil.writeLogRaw("Current: ",T00052_A117UsuarioDicose[0]);
            }
            if ( GXutil.strcmp(Z118UsuarioRazonSocial, T00052_A118UsuarioRazonSocial[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioRazonSocial");
               GXutil.writeLogRaw("Old: ",Z118UsuarioRazonSocial);
               GXutil.writeLogRaw("Current: ",T00052_A118UsuarioRazonSocial[0]);
            }
            if ( GXutil.strcmp(Z119UsuarioRut, T00052_A119UsuarioRut[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioRut");
               GXutil.writeLogRaw("Old: ",Z119UsuarioRut);
               GXutil.writeLogRaw("Current: ",T00052_A119UsuarioRut[0]);
            }
            if ( Z120UsuarioIdNet != T00052_A120UsuarioIdNet[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioIdNet");
               GXutil.writeLogRaw("Old: ",Z120UsuarioIdNet);
               GXutil.writeLogRaw("Current: ",T00052_A120UsuarioIdNet[0]);
            }
            if ( GXutil.strcmp(Z121UsuarioDireccion, T00052_A121UsuarioDireccion[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioDireccion");
               GXutil.writeLogRaw("Old: ",Z121UsuarioDireccion);
               GXutil.writeLogRaw("Current: ",T00052_A121UsuarioDireccion[0]);
            }
            if ( Z122UsuarioTipousuario != T00052_A122UsuarioTipousuario[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTipousuario");
               GXutil.writeLogRaw("Old: ",Z122UsuarioTipousuario);
               GXutil.writeLogRaw("Current: ",T00052_A122UsuarioTipousuario[0]);
            }
            if ( Z123UsuarioIdTecnico1 != T00052_A123UsuarioIdTecnico1[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioIdTecnico1");
               GXutil.writeLogRaw("Old: ",Z123UsuarioIdTecnico1);
               GXutil.writeLogRaw("Current: ",T00052_A123UsuarioIdTecnico1[0]);
            }
            if ( Z124UsuarioIdTecnico2 != T00052_A124UsuarioIdTecnico2[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioIdTecnico2");
               GXutil.writeLogRaw("Old: ",Z124UsuarioIdTecnico2);
               GXutil.writeLogRaw("Current: ",T00052_A124UsuarioIdTecnico2[0]);
            }
            if ( Z125UsuarioIdTecnico3 != T00052_A125UsuarioIdTecnico3[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioIdTecnico3");
               GXutil.writeLogRaw("Old: ",Z125UsuarioIdTecnico3);
               GXutil.writeLogRaw("Current: ",T00052_A125UsuarioIdTecnico3[0]);
            }
            if ( GXutil.strcmp(Z126UsuarioDireccionFrasco, T00052_A126UsuarioDireccionFrasco[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioDireccionFrasco");
               GXutil.writeLogRaw("Old: ",Z126UsuarioDireccionFrasco);
               GXutil.writeLogRaw("Current: ",T00052_A126UsuarioDireccionFrasco[0]);
            }
            if ( Z127UsuarioAgenciaFrasco != T00052_A127UsuarioAgenciaFrasco[0] )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioAgenciaFrasco");
               GXutil.writeLogRaw("Old: ",Z127UsuarioAgenciaFrasco);
               GXutil.writeLogRaw("Current: ",T00052_A127UsuarioAgenciaFrasco[0]);
            }
            if ( GXutil.strcmp(Z128UsuarioNotificacionFrasco1, T00052_A128UsuarioNotificacionFrasco1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionFrasco1");
               GXutil.writeLogRaw("Old: ",Z128UsuarioNotificacionFrasco1);
               GXutil.writeLogRaw("Current: ",T00052_A128UsuarioNotificacionFrasco1[0]);
            }
            if ( GXutil.strcmp(Z129UsuarioNotificacionFrasco2, T00052_A129UsuarioNotificacionFrasco2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionFrasco2");
               GXutil.writeLogRaw("Old: ",Z129UsuarioNotificacionFrasco2);
               GXutil.writeLogRaw("Current: ",T00052_A129UsuarioNotificacionFrasco2[0]);
            }
            if ( GXutil.strcmp(Z130UsuarioNotificacionSolicitud1, T00052_A130UsuarioNotificacionSolicitud1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionSolicitud1");
               GXutil.writeLogRaw("Old: ",Z130UsuarioNotificacionSolicitud1);
               GXutil.writeLogRaw("Current: ",T00052_A130UsuarioNotificacionSolicitud1[0]);
            }
            if ( GXutil.strcmp(Z131UsuarioNotificacionSolicitud2, T00052_A131UsuarioNotificacionSolicitud2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionSolicitud2");
               GXutil.writeLogRaw("Old: ",Z131UsuarioNotificacionSolicitud2);
               GXutil.writeLogRaw("Current: ",T00052_A131UsuarioNotificacionSolicitud2[0]);
            }
            if ( GXutil.strcmp(Z132UsuarioNotificacionResultado1, T00052_A132UsuarioNotificacionResultado1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionResultado1");
               GXutil.writeLogRaw("Old: ",Z132UsuarioNotificacionResultado1);
               GXutil.writeLogRaw("Current: ",T00052_A132UsuarioNotificacionResultado1[0]);
            }
            if ( GXutil.strcmp(Z133UsuarioNotificacionResultado2, T00052_A133UsuarioNotificacionResultado2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionResultado2");
               GXutil.writeLogRaw("Old: ",Z133UsuarioNotificacionResultado2);
               GXutil.writeLogRaw("Current: ",T00052_A133UsuarioNotificacionResultado2[0]);
            }
            if ( GXutil.strcmp(Z134UsuarioNotificacionAvisos1, T00052_A134UsuarioNotificacionAvisos1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionAvisos1");
               GXutil.writeLogRaw("Old: ",Z134UsuarioNotificacionAvisos1);
               GXutil.writeLogRaw("Current: ",T00052_A134UsuarioNotificacionAvisos1[0]);
            }
            if ( GXutil.strcmp(Z135UsuarioNotificacionAvisos2, T00052_A135UsuarioNotificacionAvisos2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioNotificacionAvisos2");
               GXutil.writeLogRaw("Old: ",Z135UsuarioNotificacionAvisos2);
               GXutil.writeLogRaw("Current: ",T00052_A135UsuarioNotificacionAvisos2[0]);
            }
            if ( GXutil.strcmp(Z136UsuarioTecnicoCelular1, T00052_A136UsuarioTecnicoCelular1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoCelular1");
               GXutil.writeLogRaw("Old: ",Z136UsuarioTecnicoCelular1);
               GXutil.writeLogRaw("Current: ",T00052_A136UsuarioTecnicoCelular1[0]);
            }
            if ( GXutil.strcmp(Z137UsuarioTecnicoCelular2, T00052_A137UsuarioTecnicoCelular2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoCelular2");
               GXutil.writeLogRaw("Old: ",Z137UsuarioTecnicoCelular2);
               GXutil.writeLogRaw("Current: ",T00052_A137UsuarioTecnicoCelular2[0]);
            }
            if ( GXutil.strcmp(Z138UsuarioTecnicoCelularNombre1, T00052_A138UsuarioTecnicoCelularNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoCelularNombre1");
               GXutil.writeLogRaw("Old: ",Z138UsuarioTecnicoCelularNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A138UsuarioTecnicoCelularNombre1[0]);
            }
            if ( GXutil.strcmp(Z139UsuarioTecnicoCelularNombre2, T00052_A139UsuarioTecnicoCelularNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoCelularNombre2");
               GXutil.writeLogRaw("Old: ",Z139UsuarioTecnicoCelularNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A139UsuarioTecnicoCelularNombre2[0]);
            }
            if ( GXutil.strcmp(Z140UsuarioTecnicoTelefono1, T00052_A140UsuarioTecnicoTelefono1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoTelefono1");
               GXutil.writeLogRaw("Old: ",Z140UsuarioTecnicoTelefono1);
               GXutil.writeLogRaw("Current: ",T00052_A140UsuarioTecnicoTelefono1[0]);
            }
            if ( GXutil.strcmp(Z141UsuarioTecnicoTelefono2, T00052_A141UsuarioTecnicoTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoTelefono2");
               GXutil.writeLogRaw("Old: ",Z141UsuarioTecnicoTelefono2);
               GXutil.writeLogRaw("Current: ",T00052_A141UsuarioTecnicoTelefono2[0]);
            }
            if ( GXutil.strcmp(Z142UsuarioTecnicoTelefonoNombre1, T00052_A142UsuarioTecnicoTelefonoNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoTelefonoNombre1");
               GXutil.writeLogRaw("Old: ",Z142UsuarioTecnicoTelefonoNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A142UsuarioTecnicoTelefonoNombre1[0]);
            }
            if ( GXutil.strcmp(Z143UsuarioTecnicoTelefonoNombre2, T00052_A143UsuarioTecnicoTelefonoNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoTelefonoNombre2");
               GXutil.writeLogRaw("Old: ",Z143UsuarioTecnicoTelefonoNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A143UsuarioTecnicoTelefonoNombre2[0]);
            }
            if ( GXutil.strcmp(Z144UsuarioTecnicoEmail1, T00052_A144UsuarioTecnicoEmail1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoEmail1");
               GXutil.writeLogRaw("Old: ",Z144UsuarioTecnicoEmail1);
               GXutil.writeLogRaw("Current: ",T00052_A144UsuarioTecnicoEmail1[0]);
            }
            if ( GXutil.strcmp(Z145UsuarioTecnicoEmail2, T00052_A145UsuarioTecnicoEmail2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoEmail2");
               GXutil.writeLogRaw("Old: ",Z145UsuarioTecnicoEmail2);
               GXutil.writeLogRaw("Current: ",T00052_A145UsuarioTecnicoEmail2[0]);
            }
            if ( GXutil.strcmp(Z146UsuarioTecnicoEmailNombre1, T00052_A146UsuarioTecnicoEmailNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoEmailNombre1");
               GXutil.writeLogRaw("Old: ",Z146UsuarioTecnicoEmailNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A146UsuarioTecnicoEmailNombre1[0]);
            }
            if ( GXutil.strcmp(Z147UsuarioTecnicoEmailNombre2, T00052_A147UsuarioTecnicoEmailNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioTecnicoEmailNombre2");
               GXutil.writeLogRaw("Old: ",Z147UsuarioTecnicoEmailNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A147UsuarioTecnicoEmailNombre2[0]);
            }
            if ( GXutil.strcmp(Z148UsuarioRutTipo, T00052_A148UsuarioRutTipo[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioRutTipo");
               GXutil.writeLogRaw("Old: ",Z148UsuarioRutTipo);
               GXutil.writeLogRaw("Current: ",T00052_A148UsuarioRutTipo[0]);
            }
            if ( GXutil.strcmp(Z149UsuarioFacDireccion, T00052_A149UsuarioFacDireccion[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioFacDireccion");
               GXutil.writeLogRaw("Old: ",Z149UsuarioFacDireccion);
               GXutil.writeLogRaw("Current: ",T00052_A149UsuarioFacDireccion[0]);
            }
            if ( GXutil.strcmp(Z150UsuarioFacLocalidad, T00052_A150UsuarioFacLocalidad[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioFacLocalidad");
               GXutil.writeLogRaw("Old: ",Z150UsuarioFacLocalidad);
               GXutil.writeLogRaw("Current: ",T00052_A150UsuarioFacLocalidad[0]);
            }
            if ( GXutil.strcmp(Z151UsuarioFacDepartamento, T00052_A151UsuarioFacDepartamento[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioFacDepartamento");
               GXutil.writeLogRaw("Old: ",Z151UsuarioFacDepartamento);
               GXutil.writeLogRaw("Current: ",T00052_A151UsuarioFacDepartamento[0]);
            }
            if ( GXutil.strcmp(Z152UsuarioFacEmailEnvio, T00052_A152UsuarioFacEmailEnvio[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioFacEmailEnvio");
               GXutil.writeLogRaw("Old: ",Z152UsuarioFacEmailEnvio);
               GXutil.writeLogRaw("Current: ",T00052_A152UsuarioFacEmailEnvio[0]);
            }
            if ( GXutil.strcmp(Z153UsuarioCobranzaCelular1, T00052_A153UsuarioCobranzaCelular1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaCelular1");
               GXutil.writeLogRaw("Old: ",Z153UsuarioCobranzaCelular1);
               GXutil.writeLogRaw("Current: ",T00052_A153UsuarioCobranzaCelular1[0]);
            }
            if ( GXutil.strcmp(Z154UsuarioCobranzaCelular2, T00052_A154UsuarioCobranzaCelular2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaCelular2");
               GXutil.writeLogRaw("Old: ",Z154UsuarioCobranzaCelular2);
               GXutil.writeLogRaw("Current: ",T00052_A154UsuarioCobranzaCelular2[0]);
            }
            if ( GXutil.strcmp(Z155UsuarioCobranzaCelularNombre1, T00052_A155UsuarioCobranzaCelularNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaCelularNombre1");
               GXutil.writeLogRaw("Old: ",Z155UsuarioCobranzaCelularNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A155UsuarioCobranzaCelularNombre1[0]);
            }
            if ( GXutil.strcmp(Z156UsuarioCobranzaCelularNombre2, T00052_A156UsuarioCobranzaCelularNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaCelularNombre2");
               GXutil.writeLogRaw("Old: ",Z156UsuarioCobranzaCelularNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A156UsuarioCobranzaCelularNombre2[0]);
            }
            if ( GXutil.strcmp(Z157UsuarioCobranzaTelefono1, T00052_A157UsuarioCobranzaTelefono1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaTelefono1");
               GXutil.writeLogRaw("Old: ",Z157UsuarioCobranzaTelefono1);
               GXutil.writeLogRaw("Current: ",T00052_A157UsuarioCobranzaTelefono1[0]);
            }
            if ( GXutil.strcmp(Z158UsuarioCobranzaTelefono2, T00052_A158UsuarioCobranzaTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaTelefono2");
               GXutil.writeLogRaw("Old: ",Z158UsuarioCobranzaTelefono2);
               GXutil.writeLogRaw("Current: ",T00052_A158UsuarioCobranzaTelefono2[0]);
            }
            if ( GXutil.strcmp(Z159UsuarioCobranzaTelefonoNombre1, T00052_A159UsuarioCobranzaTelefonoNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaTelefonoNombre1");
               GXutil.writeLogRaw("Old: ",Z159UsuarioCobranzaTelefonoNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A159UsuarioCobranzaTelefonoNombre1[0]);
            }
            if ( GXutil.strcmp(Z160UsuarioCobranzaTelefonoNombre2, T00052_A160UsuarioCobranzaTelefonoNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaTelefonoNombre2");
               GXutil.writeLogRaw("Old: ",Z160UsuarioCobranzaTelefonoNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A160UsuarioCobranzaTelefonoNombre2[0]);
            }
            if ( GXutil.strcmp(Z161UsuarioCobranzaEmail1, T00052_A161UsuarioCobranzaEmail1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaEmail1");
               GXutil.writeLogRaw("Old: ",Z161UsuarioCobranzaEmail1);
               GXutil.writeLogRaw("Current: ",T00052_A161UsuarioCobranzaEmail1[0]);
            }
            if ( GXutil.strcmp(Z162UsuarioCobranzaEmail2, T00052_A162UsuarioCobranzaEmail2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaEmail2");
               GXutil.writeLogRaw("Old: ",Z162UsuarioCobranzaEmail2);
               GXutil.writeLogRaw("Current: ",T00052_A162UsuarioCobranzaEmail2[0]);
            }
            if ( GXutil.strcmp(Z163UsuarioCobranzaEmailNombre1, T00052_A163UsuarioCobranzaEmailNombre1[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaEmailNombre1");
               GXutil.writeLogRaw("Old: ",Z163UsuarioCobranzaEmailNombre1);
               GXutil.writeLogRaw("Current: ",T00052_A163UsuarioCobranzaEmailNombre1[0]);
            }
            if ( GXutil.strcmp(Z164UsuarioCobranzaEmailNombre2, T00052_A164UsuarioCobranzaEmailNombre2[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCobranzaEmailNombre2");
               GXutil.writeLogRaw("Old: ",Z164UsuarioCobranzaEmailNombre2);
               GXutil.writeLogRaw("Current: ",T00052_A164UsuarioCobranzaEmailNombre2[0]);
            }
            if ( GXutil.strcmp(Z165UsuarioCedula, T00052_A165UsuarioCedula[0]) != 0 )
            {
               GXutil.writeLogln("usuario:[seudo value changed for attri]"+"UsuarioCedula");
               GXutil.writeLogRaw("Old: ",Z165UsuarioCedula);
               GXutil.writeLogRaw("Current: ",T00052_A165UsuarioCedula[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Usuario"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm055( 0) ;
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00058 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A5UsuarioId), Boolean.valueOf(n114UsuarioEmail), A114UsuarioEmail, Boolean.valueOf(n115UsuarioUsuarioWeb), A115UsuarioUsuarioWeb, Boolean.valueOf(n116UsuarioNombre), A116UsuarioNombre, Boolean.valueOf(n117UsuarioDicose), A117UsuarioDicose, Boolean.valueOf(n118UsuarioRazonSocial), A118UsuarioRazonSocial, Boolean.valueOf(n119UsuarioRut), A119UsuarioRut, Boolean.valueOf(n120UsuarioIdNet), Long.valueOf(A120UsuarioIdNet), Boolean.valueOf(n121UsuarioDireccion), A121UsuarioDireccion, Boolean.valueOf(n122UsuarioTipousuario), Short.valueOf(A122UsuarioTipousuario), Boolean.valueOf(n123UsuarioIdTecnico1), Long.valueOf(A123UsuarioIdTecnico1), Boolean.valueOf(n124UsuarioIdTecnico2), Long.valueOf(A124UsuarioIdTecnico2), Boolean.valueOf(n125UsuarioIdTecnico3), Long.valueOf(A125UsuarioIdTecnico3), Boolean.valueOf(n126UsuarioDireccionFrasco), A126UsuarioDireccionFrasco, Boolean.valueOf(n127UsuarioAgenciaFrasco), Short.valueOf(A127UsuarioAgenciaFrasco), Boolean.valueOf(n128UsuarioNotificacionFrasco1), A128UsuarioNotificacionFrasco1, Boolean.valueOf(n129UsuarioNotificacionFrasco2), A129UsuarioNotificacionFrasco2, Boolean.valueOf(n130UsuarioNotificacionSolicitud1), A130UsuarioNotificacionSolicitud1, Boolean.valueOf(n131UsuarioNotificacionSolicitud2), A131UsuarioNotificacionSolicitud2, Boolean.valueOf(n132UsuarioNotificacionResultado1), A132UsuarioNotificacionResultado1, Boolean.valueOf(n133UsuarioNotificacionResultado2), A133UsuarioNotificacionResultado2, Boolean.valueOf(n134UsuarioNotificacionAvisos1), A134UsuarioNotificacionAvisos1, Boolean.valueOf(n135UsuarioNotificacionAvisos2), A135UsuarioNotificacionAvisos2, Boolean.valueOf(n136UsuarioTecnicoCelular1), A136UsuarioTecnicoCelular1, Boolean.valueOf(n137UsuarioTecnicoCelular2), A137UsuarioTecnicoCelular2, Boolean.valueOf(n138UsuarioTecnicoCelularNombre1), A138UsuarioTecnicoCelularNombre1, Boolean.valueOf(n139UsuarioTecnicoCelularNombre2), A139UsuarioTecnicoCelularNombre2, Boolean.valueOf(n140UsuarioTecnicoTelefono1), A140UsuarioTecnicoTelefono1, Boolean.valueOf(n141UsuarioTecnicoTelefono2), A141UsuarioTecnicoTelefono2, Boolean.valueOf(n142UsuarioTecnicoTelefonoNombre1), A142UsuarioTecnicoTelefonoNombre1, Boolean.valueOf(n143UsuarioTecnicoTelefonoNombre2), A143UsuarioTecnicoTelefonoNombre2, Boolean.valueOf(n144UsuarioTecnicoEmail1), A144UsuarioTecnicoEmail1, Boolean.valueOf(n145UsuarioTecnicoEmail2), A145UsuarioTecnicoEmail2, Boolean.valueOf(n146UsuarioTecnicoEmailNombre1), A146UsuarioTecnicoEmailNombre1, Boolean.valueOf(n147UsuarioTecnicoEmailNombre2), A147UsuarioTecnicoEmailNombre2, Boolean.valueOf(n148UsuarioRutTipo), A148UsuarioRutTipo, Boolean.valueOf(n149UsuarioFacDireccion), A149UsuarioFacDireccion, Boolean.valueOf(n150UsuarioFacLocalidad), A150UsuarioFacLocalidad, Boolean.valueOf(n151UsuarioFacDepartamento), A151UsuarioFacDepartamento, Boolean.valueOf(n152UsuarioFacEmailEnvio), A152UsuarioFacEmailEnvio, Boolean.valueOf(n153UsuarioCobranzaCelular1), A153UsuarioCobranzaCelular1, Boolean.valueOf(n154UsuarioCobranzaCelular2), A154UsuarioCobranzaCelular2, Boolean.valueOf(n155UsuarioCobranzaCelularNombre1), A155UsuarioCobranzaCelularNombre1, Boolean.valueOf(n156UsuarioCobranzaCelularNombre2), A156UsuarioCobranzaCelularNombre2, Boolean.valueOf(n157UsuarioCobranzaTelefono1), A157UsuarioCobranzaTelefono1, Boolean.valueOf(n158UsuarioCobranzaTelefono2), A158UsuarioCobranzaTelefono2, Boolean.valueOf(n159UsuarioCobranzaTelefonoNombre1), A159UsuarioCobranzaTelefonoNombre1, Boolean.valueOf(n160UsuarioCobranzaTelefonoNombre2), A160UsuarioCobranzaTelefonoNombre2, Boolean.valueOf(n161UsuarioCobranzaEmail1), A161UsuarioCobranzaEmail1, Boolean.valueOf(n162UsuarioCobranzaEmail2), A162UsuarioCobranzaEmail2, Boolean.valueOf(n163UsuarioCobranzaEmailNombre1), A163UsuarioCobranzaEmailNombre1, Boolean.valueOf(n164UsuarioCobranzaEmailNombre2), A164UsuarioCobranzaEmailNombre2, Boolean.valueOf(n165UsuarioCedula), A165UsuarioCedula});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption050( ) ;
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
            load055( ) ;
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void update055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00059 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n114UsuarioEmail), A114UsuarioEmail, Boolean.valueOf(n115UsuarioUsuarioWeb), A115UsuarioUsuarioWeb, Boolean.valueOf(n116UsuarioNombre), A116UsuarioNombre, Boolean.valueOf(n117UsuarioDicose), A117UsuarioDicose, Boolean.valueOf(n118UsuarioRazonSocial), A118UsuarioRazonSocial, Boolean.valueOf(n119UsuarioRut), A119UsuarioRut, Boolean.valueOf(n120UsuarioIdNet), Long.valueOf(A120UsuarioIdNet), Boolean.valueOf(n121UsuarioDireccion), A121UsuarioDireccion, Boolean.valueOf(n122UsuarioTipousuario), Short.valueOf(A122UsuarioTipousuario), Boolean.valueOf(n123UsuarioIdTecnico1), Long.valueOf(A123UsuarioIdTecnico1), Boolean.valueOf(n124UsuarioIdTecnico2), Long.valueOf(A124UsuarioIdTecnico2), Boolean.valueOf(n125UsuarioIdTecnico3), Long.valueOf(A125UsuarioIdTecnico3), Boolean.valueOf(n126UsuarioDireccionFrasco), A126UsuarioDireccionFrasco, Boolean.valueOf(n127UsuarioAgenciaFrasco), Short.valueOf(A127UsuarioAgenciaFrasco), Boolean.valueOf(n128UsuarioNotificacionFrasco1), A128UsuarioNotificacionFrasco1, Boolean.valueOf(n129UsuarioNotificacionFrasco2), A129UsuarioNotificacionFrasco2, Boolean.valueOf(n130UsuarioNotificacionSolicitud1), A130UsuarioNotificacionSolicitud1, Boolean.valueOf(n131UsuarioNotificacionSolicitud2), A131UsuarioNotificacionSolicitud2, Boolean.valueOf(n132UsuarioNotificacionResultado1), A132UsuarioNotificacionResultado1, Boolean.valueOf(n133UsuarioNotificacionResultado2), A133UsuarioNotificacionResultado2, Boolean.valueOf(n134UsuarioNotificacionAvisos1), A134UsuarioNotificacionAvisos1, Boolean.valueOf(n135UsuarioNotificacionAvisos2), A135UsuarioNotificacionAvisos2, Boolean.valueOf(n136UsuarioTecnicoCelular1), A136UsuarioTecnicoCelular1, Boolean.valueOf(n137UsuarioTecnicoCelular2), A137UsuarioTecnicoCelular2, Boolean.valueOf(n138UsuarioTecnicoCelularNombre1), A138UsuarioTecnicoCelularNombre1, Boolean.valueOf(n139UsuarioTecnicoCelularNombre2), A139UsuarioTecnicoCelularNombre2, Boolean.valueOf(n140UsuarioTecnicoTelefono1), A140UsuarioTecnicoTelefono1, Boolean.valueOf(n141UsuarioTecnicoTelefono2), A141UsuarioTecnicoTelefono2, Boolean.valueOf(n142UsuarioTecnicoTelefonoNombre1), A142UsuarioTecnicoTelefonoNombre1, Boolean.valueOf(n143UsuarioTecnicoTelefonoNombre2), A143UsuarioTecnicoTelefonoNombre2, Boolean.valueOf(n144UsuarioTecnicoEmail1), A144UsuarioTecnicoEmail1, Boolean.valueOf(n145UsuarioTecnicoEmail2), A145UsuarioTecnicoEmail2, Boolean.valueOf(n146UsuarioTecnicoEmailNombre1), A146UsuarioTecnicoEmailNombre1, Boolean.valueOf(n147UsuarioTecnicoEmailNombre2), A147UsuarioTecnicoEmailNombre2, Boolean.valueOf(n148UsuarioRutTipo), A148UsuarioRutTipo, Boolean.valueOf(n149UsuarioFacDireccion), A149UsuarioFacDireccion, Boolean.valueOf(n150UsuarioFacLocalidad), A150UsuarioFacLocalidad, Boolean.valueOf(n151UsuarioFacDepartamento), A151UsuarioFacDepartamento, Boolean.valueOf(n152UsuarioFacEmailEnvio), A152UsuarioFacEmailEnvio, Boolean.valueOf(n153UsuarioCobranzaCelular1), A153UsuarioCobranzaCelular1, Boolean.valueOf(n154UsuarioCobranzaCelular2), A154UsuarioCobranzaCelular2, Boolean.valueOf(n155UsuarioCobranzaCelularNombre1), A155UsuarioCobranzaCelularNombre1, Boolean.valueOf(n156UsuarioCobranzaCelularNombre2), A156UsuarioCobranzaCelularNombre2, Boolean.valueOf(n157UsuarioCobranzaTelefono1), A157UsuarioCobranzaTelefono1, Boolean.valueOf(n158UsuarioCobranzaTelefono2), A158UsuarioCobranzaTelefono2, Boolean.valueOf(n159UsuarioCobranzaTelefonoNombre1), A159UsuarioCobranzaTelefonoNombre1, Boolean.valueOf(n160UsuarioCobranzaTelefonoNombre2), A160UsuarioCobranzaTelefonoNombre2, Boolean.valueOf(n161UsuarioCobranzaEmail1), A161UsuarioCobranzaEmail1, Boolean.valueOf(n162UsuarioCobranzaEmail2), A162UsuarioCobranzaEmail2, Boolean.valueOf(n163UsuarioCobranzaEmailNombre1), A163UsuarioCobranzaEmailNombre1, Boolean.valueOf(n164UsuarioCobranzaEmailNombre2), A164UsuarioCobranzaEmailNombre2, Boolean.valueOf(n165UsuarioCedula), A165UsuarioCedula, Long.valueOf(A5UsuarioId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Usuario"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption050( ) ;
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
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void deferredUpdate055( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls055( ) ;
         afterConfirm055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000510 */
               pr_default.execute(8, new Object[] {Long.valueOf(A5UsuarioId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound5 == 0 )
                     {
                        initAll055( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption050( ) ;
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel055( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel055( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "usuario");
         if ( AnyError == 0 )
         {
            confirmValues050( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "usuario");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart055( )
   {
      /* Using cursor T000511 */
      pr_default.execute(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A5UsuarioId = T000511_A5UsuarioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A5UsuarioId = T000511_A5UsuarioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
      }
   }

   public void scanEnd055( )
   {
      pr_default.close(9);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes055( )
   {
      edtUsuarioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioId_Enabled), 5, 0), true);
      edtUsuarioEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioEmail_Enabled), 5, 0), true);
      edtUsuarioUsuarioWeb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioUsuarioWeb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioUsuarioWeb_Enabled), 5, 0), true);
      edtUsuarioNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNombre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNombre_Enabled), 5, 0), true);
      edtUsuarioDicose_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioDicose_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioDicose_Enabled), 5, 0), true);
      edtUsuarioRazonSocial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioRazonSocial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioRazonSocial_Enabled), 5, 0), true);
      edtUsuarioRut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioRut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioRut_Enabled), 5, 0), true);
      edtUsuarioIdNet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioIdNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioIdNet_Enabled), 5, 0), true);
      edtUsuarioDireccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioDireccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioDireccion_Enabled), 5, 0), true);
      edtUsuarioTipousuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTipousuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTipousuario_Enabled), 5, 0), true);
      edtUsuarioIdTecnico1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioIdTecnico1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioIdTecnico1_Enabled), 5, 0), true);
      edtUsuarioIdTecnico2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioIdTecnico2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioIdTecnico2_Enabled), 5, 0), true);
      edtUsuarioIdTecnico3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioIdTecnico3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioIdTecnico3_Enabled), 5, 0), true);
      edtUsuarioDireccionFrasco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioDireccionFrasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioDireccionFrasco_Enabled), 5, 0), true);
      edtUsuarioAgenciaFrasco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioAgenciaFrasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioAgenciaFrasco_Enabled), 5, 0), true);
      edtUsuarioNotificacionFrasco1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionFrasco1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionFrasco1_Enabled), 5, 0), true);
      edtUsuarioNotificacionFrasco2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionFrasco2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionFrasco2_Enabled), 5, 0), true);
      edtUsuarioNotificacionSolicitud1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionSolicitud1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionSolicitud1_Enabled), 5, 0), true);
      edtUsuarioNotificacionSolicitud2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionSolicitud2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionSolicitud2_Enabled), 5, 0), true);
      edtUsuarioNotificacionResultado1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionResultado1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionResultado1_Enabled), 5, 0), true);
      edtUsuarioNotificacionResultado2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionResultado2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionResultado2_Enabled), 5, 0), true);
      edtUsuarioNotificacionAvisos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionAvisos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionAvisos1_Enabled), 5, 0), true);
      edtUsuarioNotificacionAvisos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioNotificacionAvisos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioNotificacionAvisos2_Enabled), 5, 0), true);
      edtUsuarioTecnicoCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoCelular1_Enabled), 5, 0), true);
      edtUsuarioTecnicoCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoCelular2_Enabled), 5, 0), true);
      edtUsuarioTecnicoCelularNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoCelularNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoCelularNombre1_Enabled), 5, 0), true);
      edtUsuarioTecnicoCelularNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoCelularNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoCelularNombre2_Enabled), 5, 0), true);
      edtUsuarioTecnicoTelefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoTelefono1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoTelefono1_Enabled), 5, 0), true);
      edtUsuarioTecnicoTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoTelefono2_Enabled), 5, 0), true);
      edtUsuarioTecnicoTelefonoNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoTelefonoNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoTelefonoNombre1_Enabled), 5, 0), true);
      edtUsuarioTecnicoTelefonoNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoTelefonoNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoTelefonoNombre2_Enabled), 5, 0), true);
      edtUsuarioTecnicoEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoEmail1_Enabled), 5, 0), true);
      edtUsuarioTecnicoEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoEmail2_Enabled), 5, 0), true);
      edtUsuarioTecnicoEmailNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoEmailNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoEmailNombre1_Enabled), 5, 0), true);
      edtUsuarioTecnicoEmailNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioTecnicoEmailNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioTecnicoEmailNombre2_Enabled), 5, 0), true);
      edtUsuarioRutTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioRutTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioRutTipo_Enabled), 5, 0), true);
      edtUsuarioFacDireccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioFacDireccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioFacDireccion_Enabled), 5, 0), true);
      edtUsuarioFacLocalidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioFacLocalidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioFacLocalidad_Enabled), 5, 0), true);
      edtUsuarioFacDepartamento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioFacDepartamento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioFacDepartamento_Enabled), 5, 0), true);
      edtUsuarioFacEmailEnvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioFacEmailEnvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioFacEmailEnvio_Enabled), 5, 0), true);
      edtUsuarioCobranzaCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaCelular1_Enabled), 5, 0), true);
      edtUsuarioCobranzaCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaCelular2_Enabled), 5, 0), true);
      edtUsuarioCobranzaCelularNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaCelularNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaCelularNombre1_Enabled), 5, 0), true);
      edtUsuarioCobranzaCelularNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaCelularNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaCelularNombre2_Enabled), 5, 0), true);
      edtUsuarioCobranzaTelefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaTelefono1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaTelefono1_Enabled), 5, 0), true);
      edtUsuarioCobranzaTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaTelefono2_Enabled), 5, 0), true);
      edtUsuarioCobranzaTelefonoNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaTelefonoNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaTelefonoNombre1_Enabled), 5, 0), true);
      edtUsuarioCobranzaTelefonoNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaTelefonoNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaTelefonoNombre2_Enabled), 5, 0), true);
      edtUsuarioCobranzaEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaEmail1_Enabled), 5, 0), true);
      edtUsuarioCobranzaEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaEmail2_Enabled), 5, 0), true);
      edtUsuarioCobranzaEmailNombre1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaEmailNombre1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaEmailNombre1_Enabled), 5, 0), true);
      edtUsuarioCobranzaEmailNombre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCobranzaEmailNombre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCobranzaEmailNombre2_Enabled), 5, 0), true);
      edtUsuarioCedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuarioCedula_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuarioCedula_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues050( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614574534", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.usuario", new String[] {}, new String[] {}) +"\">") ;
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
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z5UsuarioId", GXutil.ltrim( localUtil.ntoc( Z5UsuarioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z114UsuarioEmail", Z114UsuarioEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z115UsuarioUsuarioWeb", Z115UsuarioUsuarioWeb);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z116UsuarioNombre", Z116UsuarioNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z117UsuarioDicose", Z117UsuarioDicose);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z118UsuarioRazonSocial", Z118UsuarioRazonSocial);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z119UsuarioRut", Z119UsuarioRut);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z120UsuarioIdNet", GXutil.ltrim( localUtil.ntoc( Z120UsuarioIdNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z121UsuarioDireccion", Z121UsuarioDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z122UsuarioTipousuario", GXutil.ltrim( localUtil.ntoc( Z122UsuarioTipousuario, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z123UsuarioIdTecnico1", GXutil.ltrim( localUtil.ntoc( Z123UsuarioIdTecnico1, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z124UsuarioIdTecnico2", GXutil.ltrim( localUtil.ntoc( Z124UsuarioIdTecnico2, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z125UsuarioIdTecnico3", GXutil.ltrim( localUtil.ntoc( Z125UsuarioIdTecnico3, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z126UsuarioDireccionFrasco", Z126UsuarioDireccionFrasco);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z127UsuarioAgenciaFrasco", GXutil.ltrim( localUtil.ntoc( Z127UsuarioAgenciaFrasco, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z128UsuarioNotificacionFrasco1", Z128UsuarioNotificacionFrasco1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z129UsuarioNotificacionFrasco2", Z129UsuarioNotificacionFrasco2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z130UsuarioNotificacionSolicitud1", Z130UsuarioNotificacionSolicitud1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z131UsuarioNotificacionSolicitud2", Z131UsuarioNotificacionSolicitud2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z132UsuarioNotificacionResultado1", Z132UsuarioNotificacionResultado1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z133UsuarioNotificacionResultado2", Z133UsuarioNotificacionResultado2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z134UsuarioNotificacionAvisos1", Z134UsuarioNotificacionAvisos1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z135UsuarioNotificacionAvisos2", Z135UsuarioNotificacionAvisos2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z136UsuarioTecnicoCelular1", Z136UsuarioTecnicoCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z137UsuarioTecnicoCelular2", Z137UsuarioTecnicoCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z138UsuarioTecnicoCelularNombre1", Z138UsuarioTecnicoCelularNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z139UsuarioTecnicoCelularNombre2", Z139UsuarioTecnicoCelularNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z140UsuarioTecnicoTelefono1", Z140UsuarioTecnicoTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z141UsuarioTecnicoTelefono2", Z141UsuarioTecnicoTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z142UsuarioTecnicoTelefonoNombre1", Z142UsuarioTecnicoTelefonoNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z143UsuarioTecnicoTelefonoNombre2", Z143UsuarioTecnicoTelefonoNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z144UsuarioTecnicoEmail1", Z144UsuarioTecnicoEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z145UsuarioTecnicoEmail2", Z145UsuarioTecnicoEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z146UsuarioTecnicoEmailNombre1", Z146UsuarioTecnicoEmailNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z147UsuarioTecnicoEmailNombre2", Z147UsuarioTecnicoEmailNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z148UsuarioRutTipo", Z148UsuarioRutTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z149UsuarioFacDireccion", Z149UsuarioFacDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z150UsuarioFacLocalidad", Z150UsuarioFacLocalidad);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z151UsuarioFacDepartamento", Z151UsuarioFacDepartamento);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z152UsuarioFacEmailEnvio", Z152UsuarioFacEmailEnvio);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z153UsuarioCobranzaCelular1", Z153UsuarioCobranzaCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z154UsuarioCobranzaCelular2", Z154UsuarioCobranzaCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z155UsuarioCobranzaCelularNombre1", Z155UsuarioCobranzaCelularNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z156UsuarioCobranzaCelularNombre2", Z156UsuarioCobranzaCelularNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z157UsuarioCobranzaTelefono1", Z157UsuarioCobranzaTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z158UsuarioCobranzaTelefono2", Z158UsuarioCobranzaTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z159UsuarioCobranzaTelefonoNombre1", Z159UsuarioCobranzaTelefonoNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z160UsuarioCobranzaTelefonoNombre2", Z160UsuarioCobranzaTelefonoNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z161UsuarioCobranzaEmail1", Z161UsuarioCobranzaEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z162UsuarioCobranzaEmail2", Z162UsuarioCobranzaEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z163UsuarioCobranzaEmailNombre1", Z163UsuarioCobranzaEmailNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z164UsuarioCobranzaEmailNombre2", Z164UsuarioCobranzaEmailNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z165UsuarioCedula", Z165UsuarioCedula);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("com.colaveco.usuario", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Usuario" ;
   }

   public String getPgmdesc( )
   {
      return "Usuario" ;
   }

   public void initializeNonKey055( )
   {
      A114UsuarioEmail = "" ;
      n114UsuarioEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114UsuarioEmail", A114UsuarioEmail);
      n114UsuarioEmail = ((GXutil.strcmp("", A114UsuarioEmail)==0) ? true : false) ;
      A115UsuarioUsuarioWeb = "" ;
      n115UsuarioUsuarioWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A115UsuarioUsuarioWeb", A115UsuarioUsuarioWeb);
      n115UsuarioUsuarioWeb = ((GXutil.strcmp("", A115UsuarioUsuarioWeb)==0) ? true : false) ;
      A116UsuarioNombre = "" ;
      n116UsuarioNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116UsuarioNombre", A116UsuarioNombre);
      n116UsuarioNombre = ((GXutil.strcmp("", A116UsuarioNombre)==0) ? true : false) ;
      A117UsuarioDicose = "" ;
      n117UsuarioDicose = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A117UsuarioDicose", A117UsuarioDicose);
      n117UsuarioDicose = ((GXutil.strcmp("", A117UsuarioDicose)==0) ? true : false) ;
      A118UsuarioRazonSocial = "" ;
      n118UsuarioRazonSocial = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A118UsuarioRazonSocial", A118UsuarioRazonSocial);
      n118UsuarioRazonSocial = ((GXutil.strcmp("", A118UsuarioRazonSocial)==0) ? true : false) ;
      A119UsuarioRut = "" ;
      n119UsuarioRut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A119UsuarioRut", A119UsuarioRut);
      n119UsuarioRut = ((GXutil.strcmp("", A119UsuarioRut)==0) ? true : false) ;
      A120UsuarioIdNet = 0 ;
      n120UsuarioIdNet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A120UsuarioIdNet), 18, 0));
      n120UsuarioIdNet = ((0==A120UsuarioIdNet) ? true : false) ;
      A121UsuarioDireccion = "" ;
      n121UsuarioDireccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A121UsuarioDireccion", A121UsuarioDireccion);
      n121UsuarioDireccion = ((GXutil.strcmp("", A121UsuarioDireccion)==0) ? true : false) ;
      A122UsuarioTipousuario = (short)(0) ;
      n122UsuarioTipousuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A122UsuarioTipousuario), 4, 0));
      n122UsuarioTipousuario = ((0==A122UsuarioTipousuario) ? true : false) ;
      A123UsuarioIdTecnico1 = 0 ;
      n123UsuarioIdTecnico1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123UsuarioIdTecnico1), 18, 0));
      n123UsuarioIdTecnico1 = ((0==A123UsuarioIdTecnico1) ? true : false) ;
      A124UsuarioIdTecnico2 = 0 ;
      n124UsuarioIdTecnico2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A124UsuarioIdTecnico2), 18, 0));
      n124UsuarioIdTecnico2 = ((0==A124UsuarioIdTecnico2) ? true : false) ;
      A125UsuarioIdTecnico3 = 0 ;
      n125UsuarioIdTecnico3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125UsuarioIdTecnico3), 18, 0));
      n125UsuarioIdTecnico3 = ((0==A125UsuarioIdTecnico3) ? true : false) ;
      A126UsuarioDireccionFrasco = "" ;
      n126UsuarioDireccionFrasco = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A126UsuarioDireccionFrasco", A126UsuarioDireccionFrasco);
      n126UsuarioDireccionFrasco = ((GXutil.strcmp("", A126UsuarioDireccionFrasco)==0) ? true : false) ;
      A127UsuarioAgenciaFrasco = (short)(0) ;
      n127UsuarioAgenciaFrasco = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A127UsuarioAgenciaFrasco), 4, 0));
      n127UsuarioAgenciaFrasco = ((0==A127UsuarioAgenciaFrasco) ? true : false) ;
      A128UsuarioNotificacionFrasco1 = "" ;
      n128UsuarioNotificacionFrasco1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A128UsuarioNotificacionFrasco1", A128UsuarioNotificacionFrasco1);
      n128UsuarioNotificacionFrasco1 = ((GXutil.strcmp("", A128UsuarioNotificacionFrasco1)==0) ? true : false) ;
      A129UsuarioNotificacionFrasco2 = "" ;
      n129UsuarioNotificacionFrasco2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129UsuarioNotificacionFrasco2", A129UsuarioNotificacionFrasco2);
      n129UsuarioNotificacionFrasco2 = ((GXutil.strcmp("", A129UsuarioNotificacionFrasco2)==0) ? true : false) ;
      A130UsuarioNotificacionSolicitud1 = "" ;
      n130UsuarioNotificacionSolicitud1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130UsuarioNotificacionSolicitud1", A130UsuarioNotificacionSolicitud1);
      n130UsuarioNotificacionSolicitud1 = ((GXutil.strcmp("", A130UsuarioNotificacionSolicitud1)==0) ? true : false) ;
      A131UsuarioNotificacionSolicitud2 = "" ;
      n131UsuarioNotificacionSolicitud2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A131UsuarioNotificacionSolicitud2", A131UsuarioNotificacionSolicitud2);
      n131UsuarioNotificacionSolicitud2 = ((GXutil.strcmp("", A131UsuarioNotificacionSolicitud2)==0) ? true : false) ;
      A132UsuarioNotificacionResultado1 = "" ;
      n132UsuarioNotificacionResultado1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132UsuarioNotificacionResultado1", A132UsuarioNotificacionResultado1);
      n132UsuarioNotificacionResultado1 = ((GXutil.strcmp("", A132UsuarioNotificacionResultado1)==0) ? true : false) ;
      A133UsuarioNotificacionResultado2 = "" ;
      n133UsuarioNotificacionResultado2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A133UsuarioNotificacionResultado2", A133UsuarioNotificacionResultado2);
      n133UsuarioNotificacionResultado2 = ((GXutil.strcmp("", A133UsuarioNotificacionResultado2)==0) ? true : false) ;
      A134UsuarioNotificacionAvisos1 = "" ;
      n134UsuarioNotificacionAvisos1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A134UsuarioNotificacionAvisos1", A134UsuarioNotificacionAvisos1);
      n134UsuarioNotificacionAvisos1 = ((GXutil.strcmp("", A134UsuarioNotificacionAvisos1)==0) ? true : false) ;
      A135UsuarioNotificacionAvisos2 = "" ;
      n135UsuarioNotificacionAvisos2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A135UsuarioNotificacionAvisos2", A135UsuarioNotificacionAvisos2);
      n135UsuarioNotificacionAvisos2 = ((GXutil.strcmp("", A135UsuarioNotificacionAvisos2)==0) ? true : false) ;
      A136UsuarioTecnicoCelular1 = "" ;
      n136UsuarioTecnicoCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A136UsuarioTecnicoCelular1", A136UsuarioTecnicoCelular1);
      n136UsuarioTecnicoCelular1 = ((GXutil.strcmp("", A136UsuarioTecnicoCelular1)==0) ? true : false) ;
      A137UsuarioTecnicoCelular2 = "" ;
      n137UsuarioTecnicoCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A137UsuarioTecnicoCelular2", A137UsuarioTecnicoCelular2);
      n137UsuarioTecnicoCelular2 = ((GXutil.strcmp("", A137UsuarioTecnicoCelular2)==0) ? true : false) ;
      A138UsuarioTecnicoCelularNombre1 = "" ;
      n138UsuarioTecnicoCelularNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A138UsuarioTecnicoCelularNombre1", A138UsuarioTecnicoCelularNombre1);
      n138UsuarioTecnicoCelularNombre1 = ((GXutil.strcmp("", A138UsuarioTecnicoCelularNombre1)==0) ? true : false) ;
      A139UsuarioTecnicoCelularNombre2 = "" ;
      n139UsuarioTecnicoCelularNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A139UsuarioTecnicoCelularNombre2", A139UsuarioTecnicoCelularNombre2);
      n139UsuarioTecnicoCelularNombre2 = ((GXutil.strcmp("", A139UsuarioTecnicoCelularNombre2)==0) ? true : false) ;
      A140UsuarioTecnicoTelefono1 = "" ;
      n140UsuarioTecnicoTelefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A140UsuarioTecnicoTelefono1", A140UsuarioTecnicoTelefono1);
      n140UsuarioTecnicoTelefono1 = ((GXutil.strcmp("", A140UsuarioTecnicoTelefono1)==0) ? true : false) ;
      A141UsuarioTecnicoTelefono2 = "" ;
      n141UsuarioTecnicoTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A141UsuarioTecnicoTelefono2", A141UsuarioTecnicoTelefono2);
      n141UsuarioTecnicoTelefono2 = ((GXutil.strcmp("", A141UsuarioTecnicoTelefono2)==0) ? true : false) ;
      A142UsuarioTecnicoTelefonoNombre1 = "" ;
      n142UsuarioTecnicoTelefonoNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A142UsuarioTecnicoTelefonoNombre1", A142UsuarioTecnicoTelefonoNombre1);
      n142UsuarioTecnicoTelefonoNombre1 = ((GXutil.strcmp("", A142UsuarioTecnicoTelefonoNombre1)==0) ? true : false) ;
      A143UsuarioTecnicoTelefonoNombre2 = "" ;
      n143UsuarioTecnicoTelefonoNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A143UsuarioTecnicoTelefonoNombre2", A143UsuarioTecnicoTelefonoNombre2);
      n143UsuarioTecnicoTelefonoNombre2 = ((GXutil.strcmp("", A143UsuarioTecnicoTelefonoNombre2)==0) ? true : false) ;
      A144UsuarioTecnicoEmail1 = "" ;
      n144UsuarioTecnicoEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A144UsuarioTecnicoEmail1", A144UsuarioTecnicoEmail1);
      n144UsuarioTecnicoEmail1 = ((GXutil.strcmp("", A144UsuarioTecnicoEmail1)==0) ? true : false) ;
      A145UsuarioTecnicoEmail2 = "" ;
      n145UsuarioTecnicoEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A145UsuarioTecnicoEmail2", A145UsuarioTecnicoEmail2);
      n145UsuarioTecnicoEmail2 = ((GXutil.strcmp("", A145UsuarioTecnicoEmail2)==0) ? true : false) ;
      A146UsuarioTecnicoEmailNombre1 = "" ;
      n146UsuarioTecnicoEmailNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146UsuarioTecnicoEmailNombre1", A146UsuarioTecnicoEmailNombre1);
      n146UsuarioTecnicoEmailNombre1 = ((GXutil.strcmp("", A146UsuarioTecnicoEmailNombre1)==0) ? true : false) ;
      A147UsuarioTecnicoEmailNombre2 = "" ;
      n147UsuarioTecnicoEmailNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A147UsuarioTecnicoEmailNombre2", A147UsuarioTecnicoEmailNombre2);
      n147UsuarioTecnicoEmailNombre2 = ((GXutil.strcmp("", A147UsuarioTecnicoEmailNombre2)==0) ? true : false) ;
      A148UsuarioRutTipo = "" ;
      n148UsuarioRutTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A148UsuarioRutTipo", A148UsuarioRutTipo);
      n148UsuarioRutTipo = ((GXutil.strcmp("", A148UsuarioRutTipo)==0) ? true : false) ;
      A149UsuarioFacDireccion = "" ;
      n149UsuarioFacDireccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A149UsuarioFacDireccion", A149UsuarioFacDireccion);
      n149UsuarioFacDireccion = ((GXutil.strcmp("", A149UsuarioFacDireccion)==0) ? true : false) ;
      A150UsuarioFacLocalidad = "" ;
      n150UsuarioFacLocalidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A150UsuarioFacLocalidad", A150UsuarioFacLocalidad);
      n150UsuarioFacLocalidad = ((GXutil.strcmp("", A150UsuarioFacLocalidad)==0) ? true : false) ;
      A151UsuarioFacDepartamento = "" ;
      n151UsuarioFacDepartamento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A151UsuarioFacDepartamento", A151UsuarioFacDepartamento);
      n151UsuarioFacDepartamento = ((GXutil.strcmp("", A151UsuarioFacDepartamento)==0) ? true : false) ;
      A152UsuarioFacEmailEnvio = "" ;
      n152UsuarioFacEmailEnvio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A152UsuarioFacEmailEnvio", A152UsuarioFacEmailEnvio);
      n152UsuarioFacEmailEnvio = ((GXutil.strcmp("", A152UsuarioFacEmailEnvio)==0) ? true : false) ;
      A153UsuarioCobranzaCelular1 = "" ;
      n153UsuarioCobranzaCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A153UsuarioCobranzaCelular1", A153UsuarioCobranzaCelular1);
      n153UsuarioCobranzaCelular1 = ((GXutil.strcmp("", A153UsuarioCobranzaCelular1)==0) ? true : false) ;
      A154UsuarioCobranzaCelular2 = "" ;
      n154UsuarioCobranzaCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A154UsuarioCobranzaCelular2", A154UsuarioCobranzaCelular2);
      n154UsuarioCobranzaCelular2 = ((GXutil.strcmp("", A154UsuarioCobranzaCelular2)==0) ? true : false) ;
      A155UsuarioCobranzaCelularNombre1 = "" ;
      n155UsuarioCobranzaCelularNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A155UsuarioCobranzaCelularNombre1", A155UsuarioCobranzaCelularNombre1);
      n155UsuarioCobranzaCelularNombre1 = ((GXutil.strcmp("", A155UsuarioCobranzaCelularNombre1)==0) ? true : false) ;
      A156UsuarioCobranzaCelularNombre2 = "" ;
      n156UsuarioCobranzaCelularNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A156UsuarioCobranzaCelularNombre2", A156UsuarioCobranzaCelularNombre2);
      n156UsuarioCobranzaCelularNombre2 = ((GXutil.strcmp("", A156UsuarioCobranzaCelularNombre2)==0) ? true : false) ;
      A157UsuarioCobranzaTelefono1 = "" ;
      n157UsuarioCobranzaTelefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A157UsuarioCobranzaTelefono1", A157UsuarioCobranzaTelefono1);
      n157UsuarioCobranzaTelefono1 = ((GXutil.strcmp("", A157UsuarioCobranzaTelefono1)==0) ? true : false) ;
      A158UsuarioCobranzaTelefono2 = "" ;
      n158UsuarioCobranzaTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A158UsuarioCobranzaTelefono2", A158UsuarioCobranzaTelefono2);
      n158UsuarioCobranzaTelefono2 = ((GXutil.strcmp("", A158UsuarioCobranzaTelefono2)==0) ? true : false) ;
      A159UsuarioCobranzaTelefonoNombre1 = "" ;
      n159UsuarioCobranzaTelefonoNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A159UsuarioCobranzaTelefonoNombre1", A159UsuarioCobranzaTelefonoNombre1);
      n159UsuarioCobranzaTelefonoNombre1 = ((GXutil.strcmp("", A159UsuarioCobranzaTelefonoNombre1)==0) ? true : false) ;
      A160UsuarioCobranzaTelefonoNombre2 = "" ;
      n160UsuarioCobranzaTelefonoNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A160UsuarioCobranzaTelefonoNombre2", A160UsuarioCobranzaTelefonoNombre2);
      n160UsuarioCobranzaTelefonoNombre2 = ((GXutil.strcmp("", A160UsuarioCobranzaTelefonoNombre2)==0) ? true : false) ;
      A161UsuarioCobranzaEmail1 = "" ;
      n161UsuarioCobranzaEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A161UsuarioCobranzaEmail1", A161UsuarioCobranzaEmail1);
      n161UsuarioCobranzaEmail1 = ((GXutil.strcmp("", A161UsuarioCobranzaEmail1)==0) ? true : false) ;
      A162UsuarioCobranzaEmail2 = "" ;
      n162UsuarioCobranzaEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A162UsuarioCobranzaEmail2", A162UsuarioCobranzaEmail2);
      n162UsuarioCobranzaEmail2 = ((GXutil.strcmp("", A162UsuarioCobranzaEmail2)==0) ? true : false) ;
      A163UsuarioCobranzaEmailNombre1 = "" ;
      n163UsuarioCobranzaEmailNombre1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A163UsuarioCobranzaEmailNombre1", A163UsuarioCobranzaEmailNombre1);
      n163UsuarioCobranzaEmailNombre1 = ((GXutil.strcmp("", A163UsuarioCobranzaEmailNombre1)==0) ? true : false) ;
      A164UsuarioCobranzaEmailNombre2 = "" ;
      n164UsuarioCobranzaEmailNombre2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A164UsuarioCobranzaEmailNombre2", A164UsuarioCobranzaEmailNombre2);
      n164UsuarioCobranzaEmailNombre2 = ((GXutil.strcmp("", A164UsuarioCobranzaEmailNombre2)==0) ? true : false) ;
      A165UsuarioCedula = "" ;
      n165UsuarioCedula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A165UsuarioCedula", A165UsuarioCedula);
      n165UsuarioCedula = ((GXutil.strcmp("", A165UsuarioCedula)==0) ? true : false) ;
      Z114UsuarioEmail = "" ;
      Z115UsuarioUsuarioWeb = "" ;
      Z116UsuarioNombre = "" ;
      Z117UsuarioDicose = "" ;
      Z118UsuarioRazonSocial = "" ;
      Z119UsuarioRut = "" ;
      Z120UsuarioIdNet = 0 ;
      Z121UsuarioDireccion = "" ;
      Z122UsuarioTipousuario = (short)(0) ;
      Z123UsuarioIdTecnico1 = 0 ;
      Z124UsuarioIdTecnico2 = 0 ;
      Z125UsuarioIdTecnico3 = 0 ;
      Z126UsuarioDireccionFrasco = "" ;
      Z127UsuarioAgenciaFrasco = (short)(0) ;
      Z128UsuarioNotificacionFrasco1 = "" ;
      Z129UsuarioNotificacionFrasco2 = "" ;
      Z130UsuarioNotificacionSolicitud1 = "" ;
      Z131UsuarioNotificacionSolicitud2 = "" ;
      Z132UsuarioNotificacionResultado1 = "" ;
      Z133UsuarioNotificacionResultado2 = "" ;
      Z134UsuarioNotificacionAvisos1 = "" ;
      Z135UsuarioNotificacionAvisos2 = "" ;
      Z136UsuarioTecnicoCelular1 = "" ;
      Z137UsuarioTecnicoCelular2 = "" ;
      Z138UsuarioTecnicoCelularNombre1 = "" ;
      Z139UsuarioTecnicoCelularNombre2 = "" ;
      Z140UsuarioTecnicoTelefono1 = "" ;
      Z141UsuarioTecnicoTelefono2 = "" ;
      Z142UsuarioTecnicoTelefonoNombre1 = "" ;
      Z143UsuarioTecnicoTelefonoNombre2 = "" ;
      Z144UsuarioTecnicoEmail1 = "" ;
      Z145UsuarioTecnicoEmail2 = "" ;
      Z146UsuarioTecnicoEmailNombre1 = "" ;
      Z147UsuarioTecnicoEmailNombre2 = "" ;
      Z148UsuarioRutTipo = "" ;
      Z149UsuarioFacDireccion = "" ;
      Z150UsuarioFacLocalidad = "" ;
      Z151UsuarioFacDepartamento = "" ;
      Z152UsuarioFacEmailEnvio = "" ;
      Z153UsuarioCobranzaCelular1 = "" ;
      Z154UsuarioCobranzaCelular2 = "" ;
      Z155UsuarioCobranzaCelularNombre1 = "" ;
      Z156UsuarioCobranzaCelularNombre2 = "" ;
      Z157UsuarioCobranzaTelefono1 = "" ;
      Z158UsuarioCobranzaTelefono2 = "" ;
      Z159UsuarioCobranzaTelefonoNombre1 = "" ;
      Z160UsuarioCobranzaTelefonoNombre2 = "" ;
      Z161UsuarioCobranzaEmail1 = "" ;
      Z162UsuarioCobranzaEmail2 = "" ;
      Z163UsuarioCobranzaEmailNombre1 = "" ;
      Z164UsuarioCobranzaEmailNombre2 = "" ;
      Z165UsuarioCedula = "" ;
   }

   public void initAll055( )
   {
      A5UsuarioId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5UsuarioId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5UsuarioId), 18, 0));
      initializeNonKey055( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614574645", true, true);
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
      httpContext.AddJavascriptSource("usuario.js", "?202312614574646", false, true);
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
      edtUsuarioId_Internalname = "USUARIOID" ;
      edtUsuarioEmail_Internalname = "USUARIOEMAIL" ;
      edtUsuarioUsuarioWeb_Internalname = "USUARIOUSUARIOWEB" ;
      edtUsuarioNombre_Internalname = "USUARIONOMBRE" ;
      edtUsuarioDicose_Internalname = "USUARIODICOSE" ;
      edtUsuarioRazonSocial_Internalname = "USUARIORAZONSOCIAL" ;
      edtUsuarioRut_Internalname = "USUARIORUT" ;
      edtUsuarioIdNet_Internalname = "USUARIOIDNET" ;
      edtUsuarioDireccion_Internalname = "USUARIODIRECCION" ;
      edtUsuarioTipousuario_Internalname = "USUARIOTIPOUSUARIO" ;
      edtUsuarioIdTecnico1_Internalname = "USUARIOIDTECNICO1" ;
      edtUsuarioIdTecnico2_Internalname = "USUARIOIDTECNICO2" ;
      edtUsuarioIdTecnico3_Internalname = "USUARIOIDTECNICO3" ;
      edtUsuarioDireccionFrasco_Internalname = "USUARIODIRECCIONFRASCO" ;
      edtUsuarioAgenciaFrasco_Internalname = "USUARIOAGENCIAFRASCO" ;
      edtUsuarioNotificacionFrasco1_Internalname = "USUARIONOTIFICACIONFRASCO1" ;
      edtUsuarioNotificacionFrasco2_Internalname = "USUARIONOTIFICACIONFRASCO2" ;
      edtUsuarioNotificacionSolicitud1_Internalname = "USUARIONOTIFICACIONSOLICITUD1" ;
      edtUsuarioNotificacionSolicitud2_Internalname = "USUARIONOTIFICACIONSOLICITUD2" ;
      edtUsuarioNotificacionResultado1_Internalname = "USUARIONOTIFICACIONRESULTADO1" ;
      edtUsuarioNotificacionResultado2_Internalname = "USUARIONOTIFICACIONRESULTADO2" ;
      edtUsuarioNotificacionAvisos1_Internalname = "USUARIONOTIFICACIONAVISOS1" ;
      edtUsuarioNotificacionAvisos2_Internalname = "USUARIONOTIFICACIONAVISOS2" ;
      edtUsuarioTecnicoCelular1_Internalname = "USUARIOTECNICOCELULAR1" ;
      edtUsuarioTecnicoCelular2_Internalname = "USUARIOTECNICOCELULAR2" ;
      edtUsuarioTecnicoCelularNombre1_Internalname = "USUARIOTECNICOCELULARNOMBRE1" ;
      edtUsuarioTecnicoCelularNombre2_Internalname = "USUARIOTECNICOCELULARNOMBRE2" ;
      edtUsuarioTecnicoTelefono1_Internalname = "USUARIOTECNICOTELEFONO1" ;
      edtUsuarioTecnicoTelefono2_Internalname = "USUARIOTECNICOTELEFONO2" ;
      edtUsuarioTecnicoTelefonoNombre1_Internalname = "USUARIOTECNICOTELEFONONOMBRE1" ;
      edtUsuarioTecnicoTelefonoNombre2_Internalname = "USUARIOTECNICOTELEFONONOMBRE2" ;
      edtUsuarioTecnicoEmail1_Internalname = "USUARIOTECNICOEMAIL1" ;
      edtUsuarioTecnicoEmail2_Internalname = "USUARIOTECNICOEMAIL2" ;
      edtUsuarioTecnicoEmailNombre1_Internalname = "USUARIOTECNICOEMAILNOMBRE1" ;
      edtUsuarioTecnicoEmailNombre2_Internalname = "USUARIOTECNICOEMAILNOMBRE2" ;
      edtUsuarioRutTipo_Internalname = "USUARIORUTTIPO" ;
      edtUsuarioFacDireccion_Internalname = "USUARIOFACDIRECCION" ;
      edtUsuarioFacLocalidad_Internalname = "USUARIOFACLOCALIDAD" ;
      edtUsuarioFacDepartamento_Internalname = "USUARIOFACDEPARTAMENTO" ;
      edtUsuarioFacEmailEnvio_Internalname = "USUARIOFACEMAILENVIO" ;
      edtUsuarioCobranzaCelular1_Internalname = "USUARIOCOBRANZACELULAR1" ;
      edtUsuarioCobranzaCelular2_Internalname = "USUARIOCOBRANZACELULAR2" ;
      edtUsuarioCobranzaCelularNombre1_Internalname = "USUARIOCOBRANZACELULARNOMBRE1" ;
      edtUsuarioCobranzaCelularNombre2_Internalname = "USUARIOCOBRANZACELULARNOMBRE2" ;
      edtUsuarioCobranzaTelefono1_Internalname = "USUARIOCOBRANZATELEFONO1" ;
      edtUsuarioCobranzaTelefono2_Internalname = "USUARIOCOBRANZATELEFONO2" ;
      edtUsuarioCobranzaTelefonoNombre1_Internalname = "USUARIOCOBRANZATELEFONONOMBRE1" ;
      edtUsuarioCobranzaTelefonoNombre2_Internalname = "USUARIOCOBRANZATELEFONONOMBRE2" ;
      edtUsuarioCobranzaEmail1_Internalname = "USUARIOCOBRANZAEMAIL1" ;
      edtUsuarioCobranzaEmail2_Internalname = "USUARIOCOBRANZAEMAIL2" ;
      edtUsuarioCobranzaEmailNombre1_Internalname = "USUARIOCOBRANZAEMAILNOMBRE1" ;
      edtUsuarioCobranzaEmailNombre2_Internalname = "USUARIOCOBRANZAEMAILNOMBRE2" ;
      edtUsuarioCedula_Internalname = "USUARIOCEDULA" ;
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
      Form.setCaption( "Usuario" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUsuarioCedula_Jsonclick = "" ;
      edtUsuarioCedula_Enabled = 1 ;
      edtUsuarioCobranzaEmailNombre2_Jsonclick = "" ;
      edtUsuarioCobranzaEmailNombre2_Enabled = 1 ;
      edtUsuarioCobranzaEmailNombre1_Jsonclick = "" ;
      edtUsuarioCobranzaEmailNombre1_Enabled = 1 ;
      edtUsuarioCobranzaEmail2_Jsonclick = "" ;
      edtUsuarioCobranzaEmail2_Enabled = 1 ;
      edtUsuarioCobranzaEmail1_Jsonclick = "" ;
      edtUsuarioCobranzaEmail1_Enabled = 1 ;
      edtUsuarioCobranzaTelefonoNombre2_Jsonclick = "" ;
      edtUsuarioCobranzaTelefonoNombre2_Enabled = 1 ;
      edtUsuarioCobranzaTelefonoNombre1_Jsonclick = "" ;
      edtUsuarioCobranzaTelefonoNombre1_Enabled = 1 ;
      edtUsuarioCobranzaTelefono2_Jsonclick = "" ;
      edtUsuarioCobranzaTelefono2_Enabled = 1 ;
      edtUsuarioCobranzaTelefono1_Jsonclick = "" ;
      edtUsuarioCobranzaTelefono1_Enabled = 1 ;
      edtUsuarioCobranzaCelularNombre2_Jsonclick = "" ;
      edtUsuarioCobranzaCelularNombre2_Enabled = 1 ;
      edtUsuarioCobranzaCelularNombre1_Jsonclick = "" ;
      edtUsuarioCobranzaCelularNombre1_Enabled = 1 ;
      edtUsuarioCobranzaCelular2_Jsonclick = "" ;
      edtUsuarioCobranzaCelular2_Enabled = 1 ;
      edtUsuarioCobranzaCelular1_Jsonclick = "" ;
      edtUsuarioCobranzaCelular1_Enabled = 1 ;
      edtUsuarioFacEmailEnvio_Jsonclick = "" ;
      edtUsuarioFacEmailEnvio_Enabled = 1 ;
      edtUsuarioFacDepartamento_Jsonclick = "" ;
      edtUsuarioFacDepartamento_Enabled = 1 ;
      edtUsuarioFacLocalidad_Jsonclick = "" ;
      edtUsuarioFacLocalidad_Enabled = 1 ;
      edtUsuarioFacDireccion_Enabled = 1 ;
      edtUsuarioRutTipo_Jsonclick = "" ;
      edtUsuarioRutTipo_Enabled = 1 ;
      edtUsuarioTecnicoEmailNombre2_Jsonclick = "" ;
      edtUsuarioTecnicoEmailNombre2_Enabled = 1 ;
      edtUsuarioTecnicoEmailNombre1_Jsonclick = "" ;
      edtUsuarioTecnicoEmailNombre1_Enabled = 1 ;
      edtUsuarioTecnicoEmail2_Jsonclick = "" ;
      edtUsuarioTecnicoEmail2_Enabled = 1 ;
      edtUsuarioTecnicoEmail1_Jsonclick = "" ;
      edtUsuarioTecnicoEmail1_Enabled = 1 ;
      edtUsuarioTecnicoTelefonoNombre2_Jsonclick = "" ;
      edtUsuarioTecnicoTelefonoNombre2_Enabled = 1 ;
      edtUsuarioTecnicoTelefonoNombre1_Jsonclick = "" ;
      edtUsuarioTecnicoTelefonoNombre1_Enabled = 1 ;
      edtUsuarioTecnicoTelefono2_Jsonclick = "" ;
      edtUsuarioTecnicoTelefono2_Enabled = 1 ;
      edtUsuarioTecnicoTelefono1_Jsonclick = "" ;
      edtUsuarioTecnicoTelefono1_Enabled = 1 ;
      edtUsuarioTecnicoCelularNombre2_Jsonclick = "" ;
      edtUsuarioTecnicoCelularNombre2_Enabled = 1 ;
      edtUsuarioTecnicoCelularNombre1_Jsonclick = "" ;
      edtUsuarioTecnicoCelularNombre1_Enabled = 1 ;
      edtUsuarioTecnicoCelular2_Jsonclick = "" ;
      edtUsuarioTecnicoCelular2_Enabled = 1 ;
      edtUsuarioTecnicoCelular1_Jsonclick = "" ;
      edtUsuarioTecnicoCelular1_Enabled = 1 ;
      edtUsuarioNotificacionAvisos2_Jsonclick = "" ;
      edtUsuarioNotificacionAvisos2_Enabled = 1 ;
      edtUsuarioNotificacionAvisos1_Jsonclick = "" ;
      edtUsuarioNotificacionAvisos1_Enabled = 1 ;
      edtUsuarioNotificacionResultado2_Jsonclick = "" ;
      edtUsuarioNotificacionResultado2_Enabled = 1 ;
      edtUsuarioNotificacionResultado1_Jsonclick = "" ;
      edtUsuarioNotificacionResultado1_Enabled = 1 ;
      edtUsuarioNotificacionSolicitud2_Jsonclick = "" ;
      edtUsuarioNotificacionSolicitud2_Enabled = 1 ;
      edtUsuarioNotificacionSolicitud1_Jsonclick = "" ;
      edtUsuarioNotificacionSolicitud1_Enabled = 1 ;
      edtUsuarioNotificacionFrasco2_Jsonclick = "" ;
      edtUsuarioNotificacionFrasco2_Enabled = 1 ;
      edtUsuarioNotificacionFrasco1_Jsonclick = "" ;
      edtUsuarioNotificacionFrasco1_Enabled = 1 ;
      edtUsuarioAgenciaFrasco_Jsonclick = "" ;
      edtUsuarioAgenciaFrasco_Enabled = 1 ;
      edtUsuarioDireccionFrasco_Enabled = 1 ;
      edtUsuarioIdTecnico3_Jsonclick = "" ;
      edtUsuarioIdTecnico3_Enabled = 1 ;
      edtUsuarioIdTecnico2_Jsonclick = "" ;
      edtUsuarioIdTecnico2_Enabled = 1 ;
      edtUsuarioIdTecnico1_Jsonclick = "" ;
      edtUsuarioIdTecnico1_Enabled = 1 ;
      edtUsuarioTipousuario_Jsonclick = "" ;
      edtUsuarioTipousuario_Enabled = 1 ;
      edtUsuarioDireccion_Jsonclick = "" ;
      edtUsuarioDireccion_Enabled = 1 ;
      edtUsuarioIdNet_Jsonclick = "" ;
      edtUsuarioIdNet_Enabled = 1 ;
      edtUsuarioRut_Jsonclick = "" ;
      edtUsuarioRut_Enabled = 1 ;
      edtUsuarioRazonSocial_Jsonclick = "" ;
      edtUsuarioRazonSocial_Enabled = 1 ;
      edtUsuarioDicose_Jsonclick = "" ;
      edtUsuarioDicose_Enabled = 1 ;
      edtUsuarioNombre_Jsonclick = "" ;
      edtUsuarioNombre_Enabled = 1 ;
      edtUsuarioUsuarioWeb_Jsonclick = "" ;
      edtUsuarioUsuarioWeb_Enabled = 1 ;
      edtUsuarioEmail_Jsonclick = "" ;
      edtUsuarioEmail_Enabled = 1 ;
      edtUsuarioId_Jsonclick = "" ;
      edtUsuarioId_Enabled = 1 ;
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
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtUsuarioEmail_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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

   public void valid_Usuarioid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A114UsuarioEmail", A114UsuarioEmail);
      httpContext.ajax_rsp_assign_attri("", false, "A115UsuarioUsuarioWeb", A115UsuarioUsuarioWeb);
      httpContext.ajax_rsp_assign_attri("", false, "A116UsuarioNombre", A116UsuarioNombre);
      httpContext.ajax_rsp_assign_attri("", false, "A117UsuarioDicose", A117UsuarioDicose);
      httpContext.ajax_rsp_assign_attri("", false, "A118UsuarioRazonSocial", A118UsuarioRazonSocial);
      httpContext.ajax_rsp_assign_attri("", false, "A119UsuarioRut", A119UsuarioRut);
      httpContext.ajax_rsp_assign_attri("", false, "A120UsuarioIdNet", GXutil.ltrim( localUtil.ntoc( A120UsuarioIdNet, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A121UsuarioDireccion", A121UsuarioDireccion);
      httpContext.ajax_rsp_assign_attri("", false, "A122UsuarioTipousuario", GXutil.ltrim( localUtil.ntoc( A122UsuarioTipousuario, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A123UsuarioIdTecnico1", GXutil.ltrim( localUtil.ntoc( A123UsuarioIdTecnico1, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A124UsuarioIdTecnico2", GXutil.ltrim( localUtil.ntoc( A124UsuarioIdTecnico2, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A125UsuarioIdTecnico3", GXutil.ltrim( localUtil.ntoc( A125UsuarioIdTecnico3, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A126UsuarioDireccionFrasco", A126UsuarioDireccionFrasco);
      httpContext.ajax_rsp_assign_attri("", false, "A127UsuarioAgenciaFrasco", GXutil.ltrim( localUtil.ntoc( A127UsuarioAgenciaFrasco, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A128UsuarioNotificacionFrasco1", A128UsuarioNotificacionFrasco1);
      httpContext.ajax_rsp_assign_attri("", false, "A129UsuarioNotificacionFrasco2", A129UsuarioNotificacionFrasco2);
      httpContext.ajax_rsp_assign_attri("", false, "A130UsuarioNotificacionSolicitud1", A130UsuarioNotificacionSolicitud1);
      httpContext.ajax_rsp_assign_attri("", false, "A131UsuarioNotificacionSolicitud2", A131UsuarioNotificacionSolicitud2);
      httpContext.ajax_rsp_assign_attri("", false, "A132UsuarioNotificacionResultado1", A132UsuarioNotificacionResultado1);
      httpContext.ajax_rsp_assign_attri("", false, "A133UsuarioNotificacionResultado2", A133UsuarioNotificacionResultado2);
      httpContext.ajax_rsp_assign_attri("", false, "A134UsuarioNotificacionAvisos1", A134UsuarioNotificacionAvisos1);
      httpContext.ajax_rsp_assign_attri("", false, "A135UsuarioNotificacionAvisos2", A135UsuarioNotificacionAvisos2);
      httpContext.ajax_rsp_assign_attri("", false, "A136UsuarioTecnicoCelular1", A136UsuarioTecnicoCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A137UsuarioTecnicoCelular2", A137UsuarioTecnicoCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A138UsuarioTecnicoCelularNombre1", A138UsuarioTecnicoCelularNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A139UsuarioTecnicoCelularNombre2", A139UsuarioTecnicoCelularNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A140UsuarioTecnicoTelefono1", A140UsuarioTecnicoTelefono1);
      httpContext.ajax_rsp_assign_attri("", false, "A141UsuarioTecnicoTelefono2", A141UsuarioTecnicoTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A142UsuarioTecnicoTelefonoNombre1", A142UsuarioTecnicoTelefonoNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A143UsuarioTecnicoTelefonoNombre2", A143UsuarioTecnicoTelefonoNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A144UsuarioTecnicoEmail1", A144UsuarioTecnicoEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A145UsuarioTecnicoEmail2", A145UsuarioTecnicoEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A146UsuarioTecnicoEmailNombre1", A146UsuarioTecnicoEmailNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A147UsuarioTecnicoEmailNombre2", A147UsuarioTecnicoEmailNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A148UsuarioRutTipo", A148UsuarioRutTipo);
      httpContext.ajax_rsp_assign_attri("", false, "A149UsuarioFacDireccion", A149UsuarioFacDireccion);
      httpContext.ajax_rsp_assign_attri("", false, "A150UsuarioFacLocalidad", A150UsuarioFacLocalidad);
      httpContext.ajax_rsp_assign_attri("", false, "A151UsuarioFacDepartamento", A151UsuarioFacDepartamento);
      httpContext.ajax_rsp_assign_attri("", false, "A152UsuarioFacEmailEnvio", A152UsuarioFacEmailEnvio);
      httpContext.ajax_rsp_assign_attri("", false, "A153UsuarioCobranzaCelular1", A153UsuarioCobranzaCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A154UsuarioCobranzaCelular2", A154UsuarioCobranzaCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A155UsuarioCobranzaCelularNombre1", A155UsuarioCobranzaCelularNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A156UsuarioCobranzaCelularNombre2", A156UsuarioCobranzaCelularNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A157UsuarioCobranzaTelefono1", A157UsuarioCobranzaTelefono1);
      httpContext.ajax_rsp_assign_attri("", false, "A158UsuarioCobranzaTelefono2", A158UsuarioCobranzaTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A159UsuarioCobranzaTelefonoNombre1", A159UsuarioCobranzaTelefonoNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A160UsuarioCobranzaTelefonoNombre2", A160UsuarioCobranzaTelefonoNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A161UsuarioCobranzaEmail1", A161UsuarioCobranzaEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A162UsuarioCobranzaEmail2", A162UsuarioCobranzaEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A163UsuarioCobranzaEmailNombre1", A163UsuarioCobranzaEmailNombre1);
      httpContext.ajax_rsp_assign_attri("", false, "A164UsuarioCobranzaEmailNombre2", A164UsuarioCobranzaEmailNombre2);
      httpContext.ajax_rsp_assign_attri("", false, "A165UsuarioCedula", A165UsuarioCedula);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z5UsuarioId", GXutil.ltrim( localUtil.ntoc( Z5UsuarioId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z114UsuarioEmail", Z114UsuarioEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z115UsuarioUsuarioWeb", Z115UsuarioUsuarioWeb);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z116UsuarioNombre", Z116UsuarioNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z117UsuarioDicose", Z117UsuarioDicose);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z118UsuarioRazonSocial", Z118UsuarioRazonSocial);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z119UsuarioRut", Z119UsuarioRut);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z120UsuarioIdNet", GXutil.ltrim( localUtil.ntoc( Z120UsuarioIdNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z121UsuarioDireccion", Z121UsuarioDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z122UsuarioTipousuario", GXutil.ltrim( localUtil.ntoc( Z122UsuarioTipousuario, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z123UsuarioIdTecnico1", GXutil.ltrim( localUtil.ntoc( Z123UsuarioIdTecnico1, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z124UsuarioIdTecnico2", GXutil.ltrim( localUtil.ntoc( Z124UsuarioIdTecnico2, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z125UsuarioIdTecnico3", GXutil.ltrim( localUtil.ntoc( Z125UsuarioIdTecnico3, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z126UsuarioDireccionFrasco", Z126UsuarioDireccionFrasco);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z127UsuarioAgenciaFrasco", GXutil.ltrim( localUtil.ntoc( Z127UsuarioAgenciaFrasco, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z128UsuarioNotificacionFrasco1", Z128UsuarioNotificacionFrasco1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z129UsuarioNotificacionFrasco2", Z129UsuarioNotificacionFrasco2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z130UsuarioNotificacionSolicitud1", Z130UsuarioNotificacionSolicitud1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z131UsuarioNotificacionSolicitud2", Z131UsuarioNotificacionSolicitud2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z132UsuarioNotificacionResultado1", Z132UsuarioNotificacionResultado1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z133UsuarioNotificacionResultado2", Z133UsuarioNotificacionResultado2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z134UsuarioNotificacionAvisos1", Z134UsuarioNotificacionAvisos1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z135UsuarioNotificacionAvisos2", Z135UsuarioNotificacionAvisos2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z136UsuarioTecnicoCelular1", Z136UsuarioTecnicoCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z137UsuarioTecnicoCelular2", Z137UsuarioTecnicoCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z138UsuarioTecnicoCelularNombre1", Z138UsuarioTecnicoCelularNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z139UsuarioTecnicoCelularNombre2", Z139UsuarioTecnicoCelularNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z140UsuarioTecnicoTelefono1", Z140UsuarioTecnicoTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z141UsuarioTecnicoTelefono2", Z141UsuarioTecnicoTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z142UsuarioTecnicoTelefonoNombre1", Z142UsuarioTecnicoTelefonoNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z143UsuarioTecnicoTelefonoNombre2", Z143UsuarioTecnicoTelefonoNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z144UsuarioTecnicoEmail1", Z144UsuarioTecnicoEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z145UsuarioTecnicoEmail2", Z145UsuarioTecnicoEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z146UsuarioTecnicoEmailNombre1", Z146UsuarioTecnicoEmailNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z147UsuarioTecnicoEmailNombre2", Z147UsuarioTecnicoEmailNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z148UsuarioRutTipo", Z148UsuarioRutTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z149UsuarioFacDireccion", Z149UsuarioFacDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z150UsuarioFacLocalidad", Z150UsuarioFacLocalidad);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z151UsuarioFacDepartamento", Z151UsuarioFacDepartamento);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z152UsuarioFacEmailEnvio", Z152UsuarioFacEmailEnvio);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z153UsuarioCobranzaCelular1", Z153UsuarioCobranzaCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z154UsuarioCobranzaCelular2", Z154UsuarioCobranzaCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z155UsuarioCobranzaCelularNombre1", Z155UsuarioCobranzaCelularNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z156UsuarioCobranzaCelularNombre2", Z156UsuarioCobranzaCelularNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z157UsuarioCobranzaTelefono1", Z157UsuarioCobranzaTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z158UsuarioCobranzaTelefono2", Z158UsuarioCobranzaTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z159UsuarioCobranzaTelefonoNombre1", Z159UsuarioCobranzaTelefonoNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z160UsuarioCobranzaTelefonoNombre2", Z160UsuarioCobranzaTelefonoNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z161UsuarioCobranzaEmail1", Z161UsuarioCobranzaEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z162UsuarioCobranzaEmail2", Z162UsuarioCobranzaEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z163UsuarioCobranzaEmailNombre1", Z163UsuarioCobranzaEmailNombre1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z164UsuarioCobranzaEmailNombre2", Z164UsuarioCobranzaEmailNombre2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z165UsuarioCedula", Z165UsuarioCedula);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_USUARIOID","{handler:'valid_Usuarioid',iparms:[{av:'A5UsuarioId',fld:'USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_USUARIOID",",oparms:[{av:'A114UsuarioEmail',fld:'USUARIOEMAIL',pic:''},{av:'A115UsuarioUsuarioWeb',fld:'USUARIOUSUARIOWEB',pic:''},{av:'A116UsuarioNombre',fld:'USUARIONOMBRE',pic:''},{av:'A117UsuarioDicose',fld:'USUARIODICOSE',pic:''},{av:'A118UsuarioRazonSocial',fld:'USUARIORAZONSOCIAL',pic:''},{av:'A119UsuarioRut',fld:'USUARIORUT',pic:''},{av:'A120UsuarioIdNet',fld:'USUARIOIDNET',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A121UsuarioDireccion',fld:'USUARIODIRECCION',pic:''},{av:'A122UsuarioTipousuario',fld:'USUARIOTIPOUSUARIO',pic:'ZZZ9'},{av:'A123UsuarioIdTecnico1',fld:'USUARIOIDTECNICO1',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A124UsuarioIdTecnico2',fld:'USUARIOIDTECNICO2',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A125UsuarioIdTecnico3',fld:'USUARIOIDTECNICO3',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A126UsuarioDireccionFrasco',fld:'USUARIODIRECCIONFRASCO',pic:''},{av:'A127UsuarioAgenciaFrasco',fld:'USUARIOAGENCIAFRASCO',pic:'ZZZ9'},{av:'A128UsuarioNotificacionFrasco1',fld:'USUARIONOTIFICACIONFRASCO1',pic:''},{av:'A129UsuarioNotificacionFrasco2',fld:'USUARIONOTIFICACIONFRASCO2',pic:''},{av:'A130UsuarioNotificacionSolicitud1',fld:'USUARIONOTIFICACIONSOLICITUD1',pic:''},{av:'A131UsuarioNotificacionSolicitud2',fld:'USUARIONOTIFICACIONSOLICITUD2',pic:''},{av:'A132UsuarioNotificacionResultado1',fld:'USUARIONOTIFICACIONRESULTADO1',pic:''},{av:'A133UsuarioNotificacionResultado2',fld:'USUARIONOTIFICACIONRESULTADO2',pic:''},{av:'A134UsuarioNotificacionAvisos1',fld:'USUARIONOTIFICACIONAVISOS1',pic:''},{av:'A135UsuarioNotificacionAvisos2',fld:'USUARIONOTIFICACIONAVISOS2',pic:''},{av:'A136UsuarioTecnicoCelular1',fld:'USUARIOTECNICOCELULAR1',pic:''},{av:'A137UsuarioTecnicoCelular2',fld:'USUARIOTECNICOCELULAR2',pic:''},{av:'A138UsuarioTecnicoCelularNombre1',fld:'USUARIOTECNICOCELULARNOMBRE1',pic:''},{av:'A139UsuarioTecnicoCelularNombre2',fld:'USUARIOTECNICOCELULARNOMBRE2',pic:''},{av:'A140UsuarioTecnicoTelefono1',fld:'USUARIOTECNICOTELEFONO1',pic:''},{av:'A141UsuarioTecnicoTelefono2',fld:'USUARIOTECNICOTELEFONO2',pic:''},{av:'A142UsuarioTecnicoTelefonoNombre1',fld:'USUARIOTECNICOTELEFONONOMBRE1',pic:''},{av:'A143UsuarioTecnicoTelefonoNombre2',fld:'USUARIOTECNICOTELEFONONOMBRE2',pic:''},{av:'A144UsuarioTecnicoEmail1',fld:'USUARIOTECNICOEMAIL1',pic:''},{av:'A145UsuarioTecnicoEmail2',fld:'USUARIOTECNICOEMAIL2',pic:''},{av:'A146UsuarioTecnicoEmailNombre1',fld:'USUARIOTECNICOEMAILNOMBRE1',pic:''},{av:'A147UsuarioTecnicoEmailNombre2',fld:'USUARIOTECNICOEMAILNOMBRE2',pic:''},{av:'A148UsuarioRutTipo',fld:'USUARIORUTTIPO',pic:''},{av:'A149UsuarioFacDireccion',fld:'USUARIOFACDIRECCION',pic:''},{av:'A150UsuarioFacLocalidad',fld:'USUARIOFACLOCALIDAD',pic:''},{av:'A151UsuarioFacDepartamento',fld:'USUARIOFACDEPARTAMENTO',pic:''},{av:'A152UsuarioFacEmailEnvio',fld:'USUARIOFACEMAILENVIO',pic:''},{av:'A153UsuarioCobranzaCelular1',fld:'USUARIOCOBRANZACELULAR1',pic:''},{av:'A154UsuarioCobranzaCelular2',fld:'USUARIOCOBRANZACELULAR2',pic:''},{av:'A155UsuarioCobranzaCelularNombre1',fld:'USUARIOCOBRANZACELULARNOMBRE1',pic:''},{av:'A156UsuarioCobranzaCelularNombre2',fld:'USUARIOCOBRANZACELULARNOMBRE2',pic:''},{av:'A157UsuarioCobranzaTelefono1',fld:'USUARIOCOBRANZATELEFONO1',pic:''},{av:'A158UsuarioCobranzaTelefono2',fld:'USUARIOCOBRANZATELEFONO2',pic:''},{av:'A159UsuarioCobranzaTelefonoNombre1',fld:'USUARIOCOBRANZATELEFONONOMBRE1',pic:''},{av:'A160UsuarioCobranzaTelefonoNombre2',fld:'USUARIOCOBRANZATELEFONONOMBRE2',pic:''},{av:'A161UsuarioCobranzaEmail1',fld:'USUARIOCOBRANZAEMAIL1',pic:''},{av:'A162UsuarioCobranzaEmail2',fld:'USUARIOCOBRANZAEMAIL2',pic:''},{av:'A163UsuarioCobranzaEmailNombre1',fld:'USUARIOCOBRANZAEMAILNOMBRE1',pic:''},{av:'A164UsuarioCobranzaEmailNombre2',fld:'USUARIOCOBRANZAEMAILNOMBRE2',pic:''},{av:'A165UsuarioCedula',fld:'USUARIOCEDULA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z5UsuarioId'},{av:'Z114UsuarioEmail'},{av:'Z115UsuarioUsuarioWeb'},{av:'Z116UsuarioNombre'},{av:'Z117UsuarioDicose'},{av:'Z118UsuarioRazonSocial'},{av:'Z119UsuarioRut'},{av:'Z120UsuarioIdNet'},{av:'Z121UsuarioDireccion'},{av:'Z122UsuarioTipousuario'},{av:'Z123UsuarioIdTecnico1'},{av:'Z124UsuarioIdTecnico2'},{av:'Z125UsuarioIdTecnico3'},{av:'Z126UsuarioDireccionFrasco'},{av:'Z127UsuarioAgenciaFrasco'},{av:'Z128UsuarioNotificacionFrasco1'},{av:'Z129UsuarioNotificacionFrasco2'},{av:'Z130UsuarioNotificacionSolicitud1'},{av:'Z131UsuarioNotificacionSolicitud2'},{av:'Z132UsuarioNotificacionResultado1'},{av:'Z133UsuarioNotificacionResultado2'},{av:'Z134UsuarioNotificacionAvisos1'},{av:'Z135UsuarioNotificacionAvisos2'},{av:'Z136UsuarioTecnicoCelular1'},{av:'Z137UsuarioTecnicoCelular2'},{av:'Z138UsuarioTecnicoCelularNombre1'},{av:'Z139UsuarioTecnicoCelularNombre2'},{av:'Z140UsuarioTecnicoTelefono1'},{av:'Z141UsuarioTecnicoTelefono2'},{av:'Z142UsuarioTecnicoTelefonoNombre1'},{av:'Z143UsuarioTecnicoTelefonoNombre2'},{av:'Z144UsuarioTecnicoEmail1'},{av:'Z145UsuarioTecnicoEmail2'},{av:'Z146UsuarioTecnicoEmailNombre1'},{av:'Z147UsuarioTecnicoEmailNombre2'},{av:'Z148UsuarioRutTipo'},{av:'Z149UsuarioFacDireccion'},{av:'Z150UsuarioFacLocalidad'},{av:'Z151UsuarioFacDepartamento'},{av:'Z152UsuarioFacEmailEnvio'},{av:'Z153UsuarioCobranzaCelular1'},{av:'Z154UsuarioCobranzaCelular2'},{av:'Z155UsuarioCobranzaCelularNombre1'},{av:'Z156UsuarioCobranzaCelularNombre2'},{av:'Z157UsuarioCobranzaTelefono1'},{av:'Z158UsuarioCobranzaTelefono2'},{av:'Z159UsuarioCobranzaTelefonoNombre1'},{av:'Z160UsuarioCobranzaTelefonoNombre2'},{av:'Z161UsuarioCobranzaEmail1'},{av:'Z162UsuarioCobranzaEmail2'},{av:'Z163UsuarioCobranzaEmailNombre1'},{av:'Z164UsuarioCobranzaEmailNombre2'},{av:'Z165UsuarioCedula'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z114UsuarioEmail = "" ;
      Z115UsuarioUsuarioWeb = "" ;
      Z116UsuarioNombre = "" ;
      Z117UsuarioDicose = "" ;
      Z118UsuarioRazonSocial = "" ;
      Z119UsuarioRut = "" ;
      Z121UsuarioDireccion = "" ;
      Z126UsuarioDireccionFrasco = "" ;
      Z128UsuarioNotificacionFrasco1 = "" ;
      Z129UsuarioNotificacionFrasco2 = "" ;
      Z130UsuarioNotificacionSolicitud1 = "" ;
      Z131UsuarioNotificacionSolicitud2 = "" ;
      Z132UsuarioNotificacionResultado1 = "" ;
      Z133UsuarioNotificacionResultado2 = "" ;
      Z134UsuarioNotificacionAvisos1 = "" ;
      Z135UsuarioNotificacionAvisos2 = "" ;
      Z136UsuarioTecnicoCelular1 = "" ;
      Z137UsuarioTecnicoCelular2 = "" ;
      Z138UsuarioTecnicoCelularNombre1 = "" ;
      Z139UsuarioTecnicoCelularNombre2 = "" ;
      Z140UsuarioTecnicoTelefono1 = "" ;
      Z141UsuarioTecnicoTelefono2 = "" ;
      Z142UsuarioTecnicoTelefonoNombre1 = "" ;
      Z143UsuarioTecnicoTelefonoNombre2 = "" ;
      Z144UsuarioTecnicoEmail1 = "" ;
      Z145UsuarioTecnicoEmail2 = "" ;
      Z146UsuarioTecnicoEmailNombre1 = "" ;
      Z147UsuarioTecnicoEmailNombre2 = "" ;
      Z148UsuarioRutTipo = "" ;
      Z149UsuarioFacDireccion = "" ;
      Z150UsuarioFacLocalidad = "" ;
      Z151UsuarioFacDepartamento = "" ;
      Z152UsuarioFacEmailEnvio = "" ;
      Z153UsuarioCobranzaCelular1 = "" ;
      Z154UsuarioCobranzaCelular2 = "" ;
      Z155UsuarioCobranzaCelularNombre1 = "" ;
      Z156UsuarioCobranzaCelularNombre2 = "" ;
      Z157UsuarioCobranzaTelefono1 = "" ;
      Z158UsuarioCobranzaTelefono2 = "" ;
      Z159UsuarioCobranzaTelefonoNombre1 = "" ;
      Z160UsuarioCobranzaTelefonoNombre2 = "" ;
      Z161UsuarioCobranzaEmail1 = "" ;
      Z162UsuarioCobranzaEmail2 = "" ;
      Z163UsuarioCobranzaEmailNombre1 = "" ;
      Z164UsuarioCobranzaEmailNombre2 = "" ;
      Z165UsuarioCedula = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A114UsuarioEmail = "" ;
      A115UsuarioUsuarioWeb = "" ;
      A116UsuarioNombre = "" ;
      A117UsuarioDicose = "" ;
      A118UsuarioRazonSocial = "" ;
      A119UsuarioRut = "" ;
      A121UsuarioDireccion = "" ;
      A126UsuarioDireccionFrasco = "" ;
      A128UsuarioNotificacionFrasco1 = "" ;
      A129UsuarioNotificacionFrasco2 = "" ;
      A130UsuarioNotificacionSolicitud1 = "" ;
      A131UsuarioNotificacionSolicitud2 = "" ;
      A132UsuarioNotificacionResultado1 = "" ;
      A133UsuarioNotificacionResultado2 = "" ;
      A134UsuarioNotificacionAvisos1 = "" ;
      A135UsuarioNotificacionAvisos2 = "" ;
      A136UsuarioTecnicoCelular1 = "" ;
      A137UsuarioTecnicoCelular2 = "" ;
      A138UsuarioTecnicoCelularNombre1 = "" ;
      A139UsuarioTecnicoCelularNombre2 = "" ;
      A140UsuarioTecnicoTelefono1 = "" ;
      A141UsuarioTecnicoTelefono2 = "" ;
      A142UsuarioTecnicoTelefonoNombre1 = "" ;
      A143UsuarioTecnicoTelefonoNombre2 = "" ;
      A144UsuarioTecnicoEmail1 = "" ;
      A145UsuarioTecnicoEmail2 = "" ;
      A146UsuarioTecnicoEmailNombre1 = "" ;
      A147UsuarioTecnicoEmailNombre2 = "" ;
      A148UsuarioRutTipo = "" ;
      A149UsuarioFacDireccion = "" ;
      A150UsuarioFacLocalidad = "" ;
      A151UsuarioFacDepartamento = "" ;
      A152UsuarioFacEmailEnvio = "" ;
      A153UsuarioCobranzaCelular1 = "" ;
      A154UsuarioCobranzaCelular2 = "" ;
      A155UsuarioCobranzaCelularNombre1 = "" ;
      A156UsuarioCobranzaCelularNombre2 = "" ;
      A157UsuarioCobranzaTelefono1 = "" ;
      A158UsuarioCobranzaTelefono2 = "" ;
      A159UsuarioCobranzaTelefonoNombre1 = "" ;
      A160UsuarioCobranzaTelefonoNombre2 = "" ;
      A161UsuarioCobranzaEmail1 = "" ;
      A162UsuarioCobranzaEmail2 = "" ;
      A163UsuarioCobranzaEmailNombre1 = "" ;
      A164UsuarioCobranzaEmailNombre2 = "" ;
      A165UsuarioCedula = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T00054_A5UsuarioId = new long[1] ;
      T00054_A114UsuarioEmail = new String[] {""} ;
      T00054_n114UsuarioEmail = new boolean[] {false} ;
      T00054_A115UsuarioUsuarioWeb = new String[] {""} ;
      T00054_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      T00054_A116UsuarioNombre = new String[] {""} ;
      T00054_n116UsuarioNombre = new boolean[] {false} ;
      T00054_A117UsuarioDicose = new String[] {""} ;
      T00054_n117UsuarioDicose = new boolean[] {false} ;
      T00054_A118UsuarioRazonSocial = new String[] {""} ;
      T00054_n118UsuarioRazonSocial = new boolean[] {false} ;
      T00054_A119UsuarioRut = new String[] {""} ;
      T00054_n119UsuarioRut = new boolean[] {false} ;
      T00054_A120UsuarioIdNet = new long[1] ;
      T00054_n120UsuarioIdNet = new boolean[] {false} ;
      T00054_A121UsuarioDireccion = new String[] {""} ;
      T00054_n121UsuarioDireccion = new boolean[] {false} ;
      T00054_A122UsuarioTipousuario = new short[1] ;
      T00054_n122UsuarioTipousuario = new boolean[] {false} ;
      T00054_A123UsuarioIdTecnico1 = new long[1] ;
      T00054_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      T00054_A124UsuarioIdTecnico2 = new long[1] ;
      T00054_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      T00054_A125UsuarioIdTecnico3 = new long[1] ;
      T00054_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      T00054_A126UsuarioDireccionFrasco = new String[] {""} ;
      T00054_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      T00054_A127UsuarioAgenciaFrasco = new short[1] ;
      T00054_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      T00054_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      T00054_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      T00054_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      T00054_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      T00054_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      T00054_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      T00054_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      T00054_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      T00054_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      T00054_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      T00054_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      T00054_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      T00054_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      T00054_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      T00054_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      T00054_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      T00054_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      T00054_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      T00054_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      T00054_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      T00054_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      T00054_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      T00054_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      T00054_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      T00054_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      T00054_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      T00054_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      T00054_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      T00054_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      T00054_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      T00054_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      T00054_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      T00054_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      T00054_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      T00054_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      T00054_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      T00054_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      T00054_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      T00054_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      T00054_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      T00054_A148UsuarioRutTipo = new String[] {""} ;
      T00054_n148UsuarioRutTipo = new boolean[] {false} ;
      T00054_A149UsuarioFacDireccion = new String[] {""} ;
      T00054_n149UsuarioFacDireccion = new boolean[] {false} ;
      T00054_A150UsuarioFacLocalidad = new String[] {""} ;
      T00054_n150UsuarioFacLocalidad = new boolean[] {false} ;
      T00054_A151UsuarioFacDepartamento = new String[] {""} ;
      T00054_n151UsuarioFacDepartamento = new boolean[] {false} ;
      T00054_A152UsuarioFacEmailEnvio = new String[] {""} ;
      T00054_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      T00054_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      T00054_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      T00054_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      T00054_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      T00054_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      T00054_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      T00054_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      T00054_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      T00054_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      T00054_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      T00054_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      T00054_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      T00054_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      T00054_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      T00054_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      T00054_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      T00054_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      T00054_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      T00054_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      T00054_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      T00054_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      T00054_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      T00054_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      T00054_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      T00054_A165UsuarioCedula = new String[] {""} ;
      T00054_n165UsuarioCedula = new boolean[] {false} ;
      T00055_A5UsuarioId = new long[1] ;
      T00053_A5UsuarioId = new long[1] ;
      T00053_A114UsuarioEmail = new String[] {""} ;
      T00053_n114UsuarioEmail = new boolean[] {false} ;
      T00053_A115UsuarioUsuarioWeb = new String[] {""} ;
      T00053_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      T00053_A116UsuarioNombre = new String[] {""} ;
      T00053_n116UsuarioNombre = new boolean[] {false} ;
      T00053_A117UsuarioDicose = new String[] {""} ;
      T00053_n117UsuarioDicose = new boolean[] {false} ;
      T00053_A118UsuarioRazonSocial = new String[] {""} ;
      T00053_n118UsuarioRazonSocial = new boolean[] {false} ;
      T00053_A119UsuarioRut = new String[] {""} ;
      T00053_n119UsuarioRut = new boolean[] {false} ;
      T00053_A120UsuarioIdNet = new long[1] ;
      T00053_n120UsuarioIdNet = new boolean[] {false} ;
      T00053_A121UsuarioDireccion = new String[] {""} ;
      T00053_n121UsuarioDireccion = new boolean[] {false} ;
      T00053_A122UsuarioTipousuario = new short[1] ;
      T00053_n122UsuarioTipousuario = new boolean[] {false} ;
      T00053_A123UsuarioIdTecnico1 = new long[1] ;
      T00053_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      T00053_A124UsuarioIdTecnico2 = new long[1] ;
      T00053_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      T00053_A125UsuarioIdTecnico3 = new long[1] ;
      T00053_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      T00053_A126UsuarioDireccionFrasco = new String[] {""} ;
      T00053_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      T00053_A127UsuarioAgenciaFrasco = new short[1] ;
      T00053_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      T00053_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      T00053_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      T00053_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      T00053_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      T00053_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      T00053_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      T00053_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      T00053_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      T00053_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      T00053_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      T00053_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      T00053_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      T00053_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      T00053_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      T00053_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      T00053_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      T00053_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      T00053_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      T00053_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      T00053_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      T00053_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      T00053_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      T00053_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      T00053_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      T00053_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      T00053_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      T00053_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      T00053_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      T00053_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      T00053_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      T00053_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      T00053_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      T00053_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      T00053_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      T00053_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      T00053_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      T00053_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      T00053_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      T00053_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      T00053_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      T00053_A148UsuarioRutTipo = new String[] {""} ;
      T00053_n148UsuarioRutTipo = new boolean[] {false} ;
      T00053_A149UsuarioFacDireccion = new String[] {""} ;
      T00053_n149UsuarioFacDireccion = new boolean[] {false} ;
      T00053_A150UsuarioFacLocalidad = new String[] {""} ;
      T00053_n150UsuarioFacLocalidad = new boolean[] {false} ;
      T00053_A151UsuarioFacDepartamento = new String[] {""} ;
      T00053_n151UsuarioFacDepartamento = new boolean[] {false} ;
      T00053_A152UsuarioFacEmailEnvio = new String[] {""} ;
      T00053_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      T00053_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      T00053_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      T00053_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      T00053_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      T00053_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      T00053_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      T00053_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      T00053_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      T00053_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      T00053_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      T00053_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      T00053_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      T00053_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      T00053_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      T00053_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      T00053_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      T00053_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      T00053_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      T00053_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      T00053_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      T00053_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      T00053_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      T00053_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      T00053_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      T00053_A165UsuarioCedula = new String[] {""} ;
      T00053_n165UsuarioCedula = new boolean[] {false} ;
      sMode5 = "" ;
      T00056_A5UsuarioId = new long[1] ;
      T00057_A5UsuarioId = new long[1] ;
      T00052_A5UsuarioId = new long[1] ;
      T00052_A114UsuarioEmail = new String[] {""} ;
      T00052_n114UsuarioEmail = new boolean[] {false} ;
      T00052_A115UsuarioUsuarioWeb = new String[] {""} ;
      T00052_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      T00052_A116UsuarioNombre = new String[] {""} ;
      T00052_n116UsuarioNombre = new boolean[] {false} ;
      T00052_A117UsuarioDicose = new String[] {""} ;
      T00052_n117UsuarioDicose = new boolean[] {false} ;
      T00052_A118UsuarioRazonSocial = new String[] {""} ;
      T00052_n118UsuarioRazonSocial = new boolean[] {false} ;
      T00052_A119UsuarioRut = new String[] {""} ;
      T00052_n119UsuarioRut = new boolean[] {false} ;
      T00052_A120UsuarioIdNet = new long[1] ;
      T00052_n120UsuarioIdNet = new boolean[] {false} ;
      T00052_A121UsuarioDireccion = new String[] {""} ;
      T00052_n121UsuarioDireccion = new boolean[] {false} ;
      T00052_A122UsuarioTipousuario = new short[1] ;
      T00052_n122UsuarioTipousuario = new boolean[] {false} ;
      T00052_A123UsuarioIdTecnico1 = new long[1] ;
      T00052_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      T00052_A124UsuarioIdTecnico2 = new long[1] ;
      T00052_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      T00052_A125UsuarioIdTecnico3 = new long[1] ;
      T00052_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      T00052_A126UsuarioDireccionFrasco = new String[] {""} ;
      T00052_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      T00052_A127UsuarioAgenciaFrasco = new short[1] ;
      T00052_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      T00052_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      T00052_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      T00052_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      T00052_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      T00052_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      T00052_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      T00052_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      T00052_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      T00052_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      T00052_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      T00052_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      T00052_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      T00052_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      T00052_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      T00052_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      T00052_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      T00052_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      T00052_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      T00052_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      T00052_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      T00052_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      T00052_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      T00052_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      T00052_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      T00052_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      T00052_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      T00052_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      T00052_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      T00052_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      T00052_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      T00052_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      T00052_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      T00052_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      T00052_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      T00052_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      T00052_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      T00052_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      T00052_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      T00052_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      T00052_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      T00052_A148UsuarioRutTipo = new String[] {""} ;
      T00052_n148UsuarioRutTipo = new boolean[] {false} ;
      T00052_A149UsuarioFacDireccion = new String[] {""} ;
      T00052_n149UsuarioFacDireccion = new boolean[] {false} ;
      T00052_A150UsuarioFacLocalidad = new String[] {""} ;
      T00052_n150UsuarioFacLocalidad = new boolean[] {false} ;
      T00052_A151UsuarioFacDepartamento = new String[] {""} ;
      T00052_n151UsuarioFacDepartamento = new boolean[] {false} ;
      T00052_A152UsuarioFacEmailEnvio = new String[] {""} ;
      T00052_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      T00052_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      T00052_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      T00052_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      T00052_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      T00052_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      T00052_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      T00052_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      T00052_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      T00052_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      T00052_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      T00052_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      T00052_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      T00052_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      T00052_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      T00052_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      T00052_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      T00052_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      T00052_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      T00052_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      T00052_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      T00052_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      T00052_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      T00052_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      T00052_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      T00052_A165UsuarioCedula = new String[] {""} ;
      T00052_n165UsuarioCedula = new boolean[] {false} ;
      T000511_A5UsuarioId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ114UsuarioEmail = "" ;
      ZZ115UsuarioUsuarioWeb = "" ;
      ZZ116UsuarioNombre = "" ;
      ZZ117UsuarioDicose = "" ;
      ZZ118UsuarioRazonSocial = "" ;
      ZZ119UsuarioRut = "" ;
      ZZ121UsuarioDireccion = "" ;
      ZZ126UsuarioDireccionFrasco = "" ;
      ZZ128UsuarioNotificacionFrasco1 = "" ;
      ZZ129UsuarioNotificacionFrasco2 = "" ;
      ZZ130UsuarioNotificacionSolicitud1 = "" ;
      ZZ131UsuarioNotificacionSolicitud2 = "" ;
      ZZ132UsuarioNotificacionResultado1 = "" ;
      ZZ133UsuarioNotificacionResultado2 = "" ;
      ZZ134UsuarioNotificacionAvisos1 = "" ;
      ZZ135UsuarioNotificacionAvisos2 = "" ;
      ZZ136UsuarioTecnicoCelular1 = "" ;
      ZZ137UsuarioTecnicoCelular2 = "" ;
      ZZ138UsuarioTecnicoCelularNombre1 = "" ;
      ZZ139UsuarioTecnicoCelularNombre2 = "" ;
      ZZ140UsuarioTecnicoTelefono1 = "" ;
      ZZ141UsuarioTecnicoTelefono2 = "" ;
      ZZ142UsuarioTecnicoTelefonoNombre1 = "" ;
      ZZ143UsuarioTecnicoTelefonoNombre2 = "" ;
      ZZ144UsuarioTecnicoEmail1 = "" ;
      ZZ145UsuarioTecnicoEmail2 = "" ;
      ZZ146UsuarioTecnicoEmailNombre1 = "" ;
      ZZ147UsuarioTecnicoEmailNombre2 = "" ;
      ZZ148UsuarioRutTipo = "" ;
      ZZ149UsuarioFacDireccion = "" ;
      ZZ150UsuarioFacLocalidad = "" ;
      ZZ151UsuarioFacDepartamento = "" ;
      ZZ152UsuarioFacEmailEnvio = "" ;
      ZZ153UsuarioCobranzaCelular1 = "" ;
      ZZ154UsuarioCobranzaCelular2 = "" ;
      ZZ155UsuarioCobranzaCelularNombre1 = "" ;
      ZZ156UsuarioCobranzaCelularNombre2 = "" ;
      ZZ157UsuarioCobranzaTelefono1 = "" ;
      ZZ158UsuarioCobranzaTelefono2 = "" ;
      ZZ159UsuarioCobranzaTelefonoNombre1 = "" ;
      ZZ160UsuarioCobranzaTelefonoNombre2 = "" ;
      ZZ161UsuarioCobranzaEmail1 = "" ;
      ZZ162UsuarioCobranzaEmail2 = "" ;
      ZZ163UsuarioCobranzaEmailNombre1 = "" ;
      ZZ164UsuarioCobranzaEmailNombre2 = "" ;
      ZZ165UsuarioCedula = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuario__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuario__default(),
         new Object[] {
             new Object[] {
            T00052_A5UsuarioId, T00052_A114UsuarioEmail, T00052_n114UsuarioEmail, T00052_A115UsuarioUsuarioWeb, T00052_n115UsuarioUsuarioWeb, T00052_A116UsuarioNombre, T00052_n116UsuarioNombre, T00052_A117UsuarioDicose, T00052_n117UsuarioDicose, T00052_A118UsuarioRazonSocial,
            T00052_n118UsuarioRazonSocial, T00052_A119UsuarioRut, T00052_n119UsuarioRut, T00052_A120UsuarioIdNet, T00052_n120UsuarioIdNet, T00052_A121UsuarioDireccion, T00052_n121UsuarioDireccion, T00052_A122UsuarioTipousuario, T00052_n122UsuarioTipousuario, T00052_A123UsuarioIdTecnico1,
            T00052_n123UsuarioIdTecnico1, T00052_A124UsuarioIdTecnico2, T00052_n124UsuarioIdTecnico2, T00052_A125UsuarioIdTecnico3, T00052_n125UsuarioIdTecnico3, T00052_A126UsuarioDireccionFrasco, T00052_n126UsuarioDireccionFrasco, T00052_A127UsuarioAgenciaFrasco, T00052_n127UsuarioAgenciaFrasco, T00052_A128UsuarioNotificacionFrasco1,
            T00052_n128UsuarioNotificacionFrasco1, T00052_A129UsuarioNotificacionFrasco2, T00052_n129UsuarioNotificacionFrasco2, T00052_A130UsuarioNotificacionSolicitud1, T00052_n130UsuarioNotificacionSolicitud1, T00052_A131UsuarioNotificacionSolicitud2, T00052_n131UsuarioNotificacionSolicitud2, T00052_A132UsuarioNotificacionResultado1, T00052_n132UsuarioNotificacionResultado1, T00052_A133UsuarioNotificacionResultado2,
            T00052_n133UsuarioNotificacionResultado2, T00052_A134UsuarioNotificacionAvisos1, T00052_n134UsuarioNotificacionAvisos1, T00052_A135UsuarioNotificacionAvisos2, T00052_n135UsuarioNotificacionAvisos2, T00052_A136UsuarioTecnicoCelular1, T00052_n136UsuarioTecnicoCelular1, T00052_A137UsuarioTecnicoCelular2, T00052_n137UsuarioTecnicoCelular2, T00052_A138UsuarioTecnicoCelularNombre1,
            T00052_n138UsuarioTecnicoCelularNombre1, T00052_A139UsuarioTecnicoCelularNombre2, T00052_n139UsuarioTecnicoCelularNombre2, T00052_A140UsuarioTecnicoTelefono1, T00052_n140UsuarioTecnicoTelefono1, T00052_A141UsuarioTecnicoTelefono2, T00052_n141UsuarioTecnicoTelefono2, T00052_A142UsuarioTecnicoTelefonoNombre1, T00052_n142UsuarioTecnicoTelefonoNombre1, T00052_A143UsuarioTecnicoTelefonoNombre2,
            T00052_n143UsuarioTecnicoTelefonoNombre2, T00052_A144UsuarioTecnicoEmail1, T00052_n144UsuarioTecnicoEmail1, T00052_A145UsuarioTecnicoEmail2, T00052_n145UsuarioTecnicoEmail2, T00052_A146UsuarioTecnicoEmailNombre1, T00052_n146UsuarioTecnicoEmailNombre1, T00052_A147UsuarioTecnicoEmailNombre2, T00052_n147UsuarioTecnicoEmailNombre2, T00052_A148UsuarioRutTipo,
            T00052_n148UsuarioRutTipo, T00052_A149UsuarioFacDireccion, T00052_n149UsuarioFacDireccion, T00052_A150UsuarioFacLocalidad, T00052_n150UsuarioFacLocalidad, T00052_A151UsuarioFacDepartamento, T00052_n151UsuarioFacDepartamento, T00052_A152UsuarioFacEmailEnvio, T00052_n152UsuarioFacEmailEnvio, T00052_A153UsuarioCobranzaCelular1,
            T00052_n153UsuarioCobranzaCelular1, T00052_A154UsuarioCobranzaCelular2, T00052_n154UsuarioCobranzaCelular2, T00052_A155UsuarioCobranzaCelularNombre1, T00052_n155UsuarioCobranzaCelularNombre1, T00052_A156UsuarioCobranzaCelularNombre2, T00052_n156UsuarioCobranzaCelularNombre2, T00052_A157UsuarioCobranzaTelefono1, T00052_n157UsuarioCobranzaTelefono1, T00052_A158UsuarioCobranzaTelefono2,
            T00052_n158UsuarioCobranzaTelefono2, T00052_A159UsuarioCobranzaTelefonoNombre1, T00052_n159UsuarioCobranzaTelefonoNombre1, T00052_A160UsuarioCobranzaTelefonoNombre2, T00052_n160UsuarioCobranzaTelefonoNombre2, T00052_A161UsuarioCobranzaEmail1, T00052_n161UsuarioCobranzaEmail1, T00052_A162UsuarioCobranzaEmail2, T00052_n162UsuarioCobranzaEmail2, T00052_A163UsuarioCobranzaEmailNombre1,
            T00052_n163UsuarioCobranzaEmailNombre1, T00052_A164UsuarioCobranzaEmailNombre2, T00052_n164UsuarioCobranzaEmailNombre2, T00052_A165UsuarioCedula, T00052_n165UsuarioCedula
            }
            , new Object[] {
            T00053_A5UsuarioId, T00053_A114UsuarioEmail, T00053_n114UsuarioEmail, T00053_A115UsuarioUsuarioWeb, T00053_n115UsuarioUsuarioWeb, T00053_A116UsuarioNombre, T00053_n116UsuarioNombre, T00053_A117UsuarioDicose, T00053_n117UsuarioDicose, T00053_A118UsuarioRazonSocial,
            T00053_n118UsuarioRazonSocial, T00053_A119UsuarioRut, T00053_n119UsuarioRut, T00053_A120UsuarioIdNet, T00053_n120UsuarioIdNet, T00053_A121UsuarioDireccion, T00053_n121UsuarioDireccion, T00053_A122UsuarioTipousuario, T00053_n122UsuarioTipousuario, T00053_A123UsuarioIdTecnico1,
            T00053_n123UsuarioIdTecnico1, T00053_A124UsuarioIdTecnico2, T00053_n124UsuarioIdTecnico2, T00053_A125UsuarioIdTecnico3, T00053_n125UsuarioIdTecnico3, T00053_A126UsuarioDireccionFrasco, T00053_n126UsuarioDireccionFrasco, T00053_A127UsuarioAgenciaFrasco, T00053_n127UsuarioAgenciaFrasco, T00053_A128UsuarioNotificacionFrasco1,
            T00053_n128UsuarioNotificacionFrasco1, T00053_A129UsuarioNotificacionFrasco2, T00053_n129UsuarioNotificacionFrasco2, T00053_A130UsuarioNotificacionSolicitud1, T00053_n130UsuarioNotificacionSolicitud1, T00053_A131UsuarioNotificacionSolicitud2, T00053_n131UsuarioNotificacionSolicitud2, T00053_A132UsuarioNotificacionResultado1, T00053_n132UsuarioNotificacionResultado1, T00053_A133UsuarioNotificacionResultado2,
            T00053_n133UsuarioNotificacionResultado2, T00053_A134UsuarioNotificacionAvisos1, T00053_n134UsuarioNotificacionAvisos1, T00053_A135UsuarioNotificacionAvisos2, T00053_n135UsuarioNotificacionAvisos2, T00053_A136UsuarioTecnicoCelular1, T00053_n136UsuarioTecnicoCelular1, T00053_A137UsuarioTecnicoCelular2, T00053_n137UsuarioTecnicoCelular2, T00053_A138UsuarioTecnicoCelularNombre1,
            T00053_n138UsuarioTecnicoCelularNombre1, T00053_A139UsuarioTecnicoCelularNombre2, T00053_n139UsuarioTecnicoCelularNombre2, T00053_A140UsuarioTecnicoTelefono1, T00053_n140UsuarioTecnicoTelefono1, T00053_A141UsuarioTecnicoTelefono2, T00053_n141UsuarioTecnicoTelefono2, T00053_A142UsuarioTecnicoTelefonoNombre1, T00053_n142UsuarioTecnicoTelefonoNombre1, T00053_A143UsuarioTecnicoTelefonoNombre2,
            T00053_n143UsuarioTecnicoTelefonoNombre2, T00053_A144UsuarioTecnicoEmail1, T00053_n144UsuarioTecnicoEmail1, T00053_A145UsuarioTecnicoEmail2, T00053_n145UsuarioTecnicoEmail2, T00053_A146UsuarioTecnicoEmailNombre1, T00053_n146UsuarioTecnicoEmailNombre1, T00053_A147UsuarioTecnicoEmailNombre2, T00053_n147UsuarioTecnicoEmailNombre2, T00053_A148UsuarioRutTipo,
            T00053_n148UsuarioRutTipo, T00053_A149UsuarioFacDireccion, T00053_n149UsuarioFacDireccion, T00053_A150UsuarioFacLocalidad, T00053_n150UsuarioFacLocalidad, T00053_A151UsuarioFacDepartamento, T00053_n151UsuarioFacDepartamento, T00053_A152UsuarioFacEmailEnvio, T00053_n152UsuarioFacEmailEnvio, T00053_A153UsuarioCobranzaCelular1,
            T00053_n153UsuarioCobranzaCelular1, T00053_A154UsuarioCobranzaCelular2, T00053_n154UsuarioCobranzaCelular2, T00053_A155UsuarioCobranzaCelularNombre1, T00053_n155UsuarioCobranzaCelularNombre1, T00053_A156UsuarioCobranzaCelularNombre2, T00053_n156UsuarioCobranzaCelularNombre2, T00053_A157UsuarioCobranzaTelefono1, T00053_n157UsuarioCobranzaTelefono1, T00053_A158UsuarioCobranzaTelefono2,
            T00053_n158UsuarioCobranzaTelefono2, T00053_A159UsuarioCobranzaTelefonoNombre1, T00053_n159UsuarioCobranzaTelefonoNombre1, T00053_A160UsuarioCobranzaTelefonoNombre2, T00053_n160UsuarioCobranzaTelefonoNombre2, T00053_A161UsuarioCobranzaEmail1, T00053_n161UsuarioCobranzaEmail1, T00053_A162UsuarioCobranzaEmail2, T00053_n162UsuarioCobranzaEmail2, T00053_A163UsuarioCobranzaEmailNombre1,
            T00053_n163UsuarioCobranzaEmailNombre1, T00053_A164UsuarioCobranzaEmailNombre2, T00053_n164UsuarioCobranzaEmailNombre2, T00053_A165UsuarioCedula, T00053_n165UsuarioCedula
            }
            , new Object[] {
            T00054_A5UsuarioId, T00054_A114UsuarioEmail, T00054_n114UsuarioEmail, T00054_A115UsuarioUsuarioWeb, T00054_n115UsuarioUsuarioWeb, T00054_A116UsuarioNombre, T00054_n116UsuarioNombre, T00054_A117UsuarioDicose, T00054_n117UsuarioDicose, T00054_A118UsuarioRazonSocial,
            T00054_n118UsuarioRazonSocial, T00054_A119UsuarioRut, T00054_n119UsuarioRut, T00054_A120UsuarioIdNet, T00054_n120UsuarioIdNet, T00054_A121UsuarioDireccion, T00054_n121UsuarioDireccion, T00054_A122UsuarioTipousuario, T00054_n122UsuarioTipousuario, T00054_A123UsuarioIdTecnico1,
            T00054_n123UsuarioIdTecnico1, T00054_A124UsuarioIdTecnico2, T00054_n124UsuarioIdTecnico2, T00054_A125UsuarioIdTecnico3, T00054_n125UsuarioIdTecnico3, T00054_A126UsuarioDireccionFrasco, T00054_n126UsuarioDireccionFrasco, T00054_A127UsuarioAgenciaFrasco, T00054_n127UsuarioAgenciaFrasco, T00054_A128UsuarioNotificacionFrasco1,
            T00054_n128UsuarioNotificacionFrasco1, T00054_A129UsuarioNotificacionFrasco2, T00054_n129UsuarioNotificacionFrasco2, T00054_A130UsuarioNotificacionSolicitud1, T00054_n130UsuarioNotificacionSolicitud1, T00054_A131UsuarioNotificacionSolicitud2, T00054_n131UsuarioNotificacionSolicitud2, T00054_A132UsuarioNotificacionResultado1, T00054_n132UsuarioNotificacionResultado1, T00054_A133UsuarioNotificacionResultado2,
            T00054_n133UsuarioNotificacionResultado2, T00054_A134UsuarioNotificacionAvisos1, T00054_n134UsuarioNotificacionAvisos1, T00054_A135UsuarioNotificacionAvisos2, T00054_n135UsuarioNotificacionAvisos2, T00054_A136UsuarioTecnicoCelular1, T00054_n136UsuarioTecnicoCelular1, T00054_A137UsuarioTecnicoCelular2, T00054_n137UsuarioTecnicoCelular2, T00054_A138UsuarioTecnicoCelularNombre1,
            T00054_n138UsuarioTecnicoCelularNombre1, T00054_A139UsuarioTecnicoCelularNombre2, T00054_n139UsuarioTecnicoCelularNombre2, T00054_A140UsuarioTecnicoTelefono1, T00054_n140UsuarioTecnicoTelefono1, T00054_A141UsuarioTecnicoTelefono2, T00054_n141UsuarioTecnicoTelefono2, T00054_A142UsuarioTecnicoTelefonoNombre1, T00054_n142UsuarioTecnicoTelefonoNombre1, T00054_A143UsuarioTecnicoTelefonoNombre2,
            T00054_n143UsuarioTecnicoTelefonoNombre2, T00054_A144UsuarioTecnicoEmail1, T00054_n144UsuarioTecnicoEmail1, T00054_A145UsuarioTecnicoEmail2, T00054_n145UsuarioTecnicoEmail2, T00054_A146UsuarioTecnicoEmailNombre1, T00054_n146UsuarioTecnicoEmailNombre1, T00054_A147UsuarioTecnicoEmailNombre2, T00054_n147UsuarioTecnicoEmailNombre2, T00054_A148UsuarioRutTipo,
            T00054_n148UsuarioRutTipo, T00054_A149UsuarioFacDireccion, T00054_n149UsuarioFacDireccion, T00054_A150UsuarioFacLocalidad, T00054_n150UsuarioFacLocalidad, T00054_A151UsuarioFacDepartamento, T00054_n151UsuarioFacDepartamento, T00054_A152UsuarioFacEmailEnvio, T00054_n152UsuarioFacEmailEnvio, T00054_A153UsuarioCobranzaCelular1,
            T00054_n153UsuarioCobranzaCelular1, T00054_A154UsuarioCobranzaCelular2, T00054_n154UsuarioCobranzaCelular2, T00054_A155UsuarioCobranzaCelularNombre1, T00054_n155UsuarioCobranzaCelularNombre1, T00054_A156UsuarioCobranzaCelularNombre2, T00054_n156UsuarioCobranzaCelularNombre2, T00054_A157UsuarioCobranzaTelefono1, T00054_n157UsuarioCobranzaTelefono1, T00054_A158UsuarioCobranzaTelefono2,
            T00054_n158UsuarioCobranzaTelefono2, T00054_A159UsuarioCobranzaTelefonoNombre1, T00054_n159UsuarioCobranzaTelefonoNombre1, T00054_A160UsuarioCobranzaTelefonoNombre2, T00054_n160UsuarioCobranzaTelefonoNombre2, T00054_A161UsuarioCobranzaEmail1, T00054_n161UsuarioCobranzaEmail1, T00054_A162UsuarioCobranzaEmail2, T00054_n162UsuarioCobranzaEmail2, T00054_A163UsuarioCobranzaEmailNombre1,
            T00054_n163UsuarioCobranzaEmailNombre1, T00054_A164UsuarioCobranzaEmailNombre2, T00054_n164UsuarioCobranzaEmailNombre2, T00054_A165UsuarioCedula, T00054_n165UsuarioCedula
            }
            , new Object[] {
            T00055_A5UsuarioId
            }
            , new Object[] {
            T00056_A5UsuarioId
            }
            , new Object[] {
            T00057_A5UsuarioId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000511_A5UsuarioId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z122UsuarioTipousuario ;
   private short Z127UsuarioAgenciaFrasco ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A122UsuarioTipousuario ;
   private short A127UsuarioAgenciaFrasco ;
   private short RcdFound5 ;
   private short nIsDirty_5 ;
   private short ZZ122UsuarioTipousuario ;
   private short ZZ127UsuarioAgenciaFrasco ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtUsuarioId_Enabled ;
   private int edtUsuarioEmail_Enabled ;
   private int edtUsuarioUsuarioWeb_Enabled ;
   private int edtUsuarioNombre_Enabled ;
   private int edtUsuarioDicose_Enabled ;
   private int edtUsuarioRazonSocial_Enabled ;
   private int edtUsuarioRut_Enabled ;
   private int edtUsuarioIdNet_Enabled ;
   private int edtUsuarioDireccion_Enabled ;
   private int edtUsuarioTipousuario_Enabled ;
   private int edtUsuarioIdTecnico1_Enabled ;
   private int edtUsuarioIdTecnico2_Enabled ;
   private int edtUsuarioIdTecnico3_Enabled ;
   private int edtUsuarioDireccionFrasco_Enabled ;
   private int edtUsuarioAgenciaFrasco_Enabled ;
   private int edtUsuarioNotificacionFrasco1_Enabled ;
   private int edtUsuarioNotificacionFrasco2_Enabled ;
   private int edtUsuarioNotificacionSolicitud1_Enabled ;
   private int edtUsuarioNotificacionSolicitud2_Enabled ;
   private int edtUsuarioNotificacionResultado1_Enabled ;
   private int edtUsuarioNotificacionResultado2_Enabled ;
   private int edtUsuarioNotificacionAvisos1_Enabled ;
   private int edtUsuarioNotificacionAvisos2_Enabled ;
   private int edtUsuarioTecnicoCelular1_Enabled ;
   private int edtUsuarioTecnicoCelular2_Enabled ;
   private int edtUsuarioTecnicoCelularNombre1_Enabled ;
   private int edtUsuarioTecnicoCelularNombre2_Enabled ;
   private int edtUsuarioTecnicoTelefono1_Enabled ;
   private int edtUsuarioTecnicoTelefono2_Enabled ;
   private int edtUsuarioTecnicoTelefonoNombre1_Enabled ;
   private int edtUsuarioTecnicoTelefonoNombre2_Enabled ;
   private int edtUsuarioTecnicoEmail1_Enabled ;
   private int edtUsuarioTecnicoEmail2_Enabled ;
   private int edtUsuarioTecnicoEmailNombre1_Enabled ;
   private int edtUsuarioTecnicoEmailNombre2_Enabled ;
   private int edtUsuarioRutTipo_Enabled ;
   private int edtUsuarioFacDireccion_Enabled ;
   private int edtUsuarioFacLocalidad_Enabled ;
   private int edtUsuarioFacDepartamento_Enabled ;
   private int edtUsuarioFacEmailEnvio_Enabled ;
   private int edtUsuarioCobranzaCelular1_Enabled ;
   private int edtUsuarioCobranzaCelular2_Enabled ;
   private int edtUsuarioCobranzaCelularNombre1_Enabled ;
   private int edtUsuarioCobranzaCelularNombre2_Enabled ;
   private int edtUsuarioCobranzaTelefono1_Enabled ;
   private int edtUsuarioCobranzaTelefono2_Enabled ;
   private int edtUsuarioCobranzaTelefonoNombre1_Enabled ;
   private int edtUsuarioCobranzaTelefonoNombre2_Enabled ;
   private int edtUsuarioCobranzaEmail1_Enabled ;
   private int edtUsuarioCobranzaEmail2_Enabled ;
   private int edtUsuarioCobranzaEmailNombre1_Enabled ;
   private int edtUsuarioCobranzaEmailNombre2_Enabled ;
   private int edtUsuarioCedula_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z5UsuarioId ;
   private long Z120UsuarioIdNet ;
   private long Z123UsuarioIdTecnico1 ;
   private long Z124UsuarioIdTecnico2 ;
   private long Z125UsuarioIdTecnico3 ;
   private long A5UsuarioId ;
   private long A120UsuarioIdNet ;
   private long A123UsuarioIdTecnico1 ;
   private long A124UsuarioIdTecnico2 ;
   private long A125UsuarioIdTecnico3 ;
   private long ZZ5UsuarioId ;
   private long ZZ120UsuarioIdNet ;
   private long ZZ123UsuarioIdTecnico1 ;
   private long ZZ124UsuarioIdTecnico2 ;
   private long ZZ125UsuarioIdTecnico3 ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUsuarioId_Internalname ;
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
   private String edtUsuarioId_Jsonclick ;
   private String edtUsuarioEmail_Internalname ;
   private String edtUsuarioEmail_Jsonclick ;
   private String edtUsuarioUsuarioWeb_Internalname ;
   private String edtUsuarioUsuarioWeb_Jsonclick ;
   private String edtUsuarioNombre_Internalname ;
   private String edtUsuarioNombre_Jsonclick ;
   private String edtUsuarioDicose_Internalname ;
   private String edtUsuarioDicose_Jsonclick ;
   private String edtUsuarioRazonSocial_Internalname ;
   private String edtUsuarioRazonSocial_Jsonclick ;
   private String edtUsuarioRut_Internalname ;
   private String edtUsuarioRut_Jsonclick ;
   private String edtUsuarioIdNet_Internalname ;
   private String edtUsuarioIdNet_Jsonclick ;
   private String edtUsuarioDireccion_Internalname ;
   private String edtUsuarioDireccion_Jsonclick ;
   private String edtUsuarioTipousuario_Internalname ;
   private String edtUsuarioTipousuario_Jsonclick ;
   private String edtUsuarioIdTecnico1_Internalname ;
   private String edtUsuarioIdTecnico1_Jsonclick ;
   private String edtUsuarioIdTecnico2_Internalname ;
   private String edtUsuarioIdTecnico2_Jsonclick ;
   private String edtUsuarioIdTecnico3_Internalname ;
   private String edtUsuarioIdTecnico3_Jsonclick ;
   private String edtUsuarioDireccionFrasco_Internalname ;
   private String edtUsuarioAgenciaFrasco_Internalname ;
   private String edtUsuarioAgenciaFrasco_Jsonclick ;
   private String edtUsuarioNotificacionFrasco1_Internalname ;
   private String edtUsuarioNotificacionFrasco1_Jsonclick ;
   private String edtUsuarioNotificacionFrasco2_Internalname ;
   private String edtUsuarioNotificacionFrasco2_Jsonclick ;
   private String edtUsuarioNotificacionSolicitud1_Internalname ;
   private String edtUsuarioNotificacionSolicitud1_Jsonclick ;
   private String edtUsuarioNotificacionSolicitud2_Internalname ;
   private String edtUsuarioNotificacionSolicitud2_Jsonclick ;
   private String edtUsuarioNotificacionResultado1_Internalname ;
   private String edtUsuarioNotificacionResultado1_Jsonclick ;
   private String edtUsuarioNotificacionResultado2_Internalname ;
   private String edtUsuarioNotificacionResultado2_Jsonclick ;
   private String edtUsuarioNotificacionAvisos1_Internalname ;
   private String edtUsuarioNotificacionAvisos1_Jsonclick ;
   private String edtUsuarioNotificacionAvisos2_Internalname ;
   private String edtUsuarioNotificacionAvisos2_Jsonclick ;
   private String edtUsuarioTecnicoCelular1_Internalname ;
   private String edtUsuarioTecnicoCelular1_Jsonclick ;
   private String edtUsuarioTecnicoCelular2_Internalname ;
   private String edtUsuarioTecnicoCelular2_Jsonclick ;
   private String edtUsuarioTecnicoCelularNombre1_Internalname ;
   private String edtUsuarioTecnicoCelularNombre1_Jsonclick ;
   private String edtUsuarioTecnicoCelularNombre2_Internalname ;
   private String edtUsuarioTecnicoCelularNombre2_Jsonclick ;
   private String edtUsuarioTecnicoTelefono1_Internalname ;
   private String edtUsuarioTecnicoTelefono1_Jsonclick ;
   private String edtUsuarioTecnicoTelefono2_Internalname ;
   private String edtUsuarioTecnicoTelefono2_Jsonclick ;
   private String edtUsuarioTecnicoTelefonoNombre1_Internalname ;
   private String edtUsuarioTecnicoTelefonoNombre1_Jsonclick ;
   private String edtUsuarioTecnicoTelefonoNombre2_Internalname ;
   private String edtUsuarioTecnicoTelefonoNombre2_Jsonclick ;
   private String edtUsuarioTecnicoEmail1_Internalname ;
   private String edtUsuarioTecnicoEmail1_Jsonclick ;
   private String edtUsuarioTecnicoEmail2_Internalname ;
   private String edtUsuarioTecnicoEmail2_Jsonclick ;
   private String edtUsuarioTecnicoEmailNombre1_Internalname ;
   private String edtUsuarioTecnicoEmailNombre1_Jsonclick ;
   private String edtUsuarioTecnicoEmailNombre2_Internalname ;
   private String edtUsuarioTecnicoEmailNombre2_Jsonclick ;
   private String edtUsuarioRutTipo_Internalname ;
   private String edtUsuarioRutTipo_Jsonclick ;
   private String edtUsuarioFacDireccion_Internalname ;
   private String edtUsuarioFacLocalidad_Internalname ;
   private String edtUsuarioFacLocalidad_Jsonclick ;
   private String edtUsuarioFacDepartamento_Internalname ;
   private String edtUsuarioFacDepartamento_Jsonclick ;
   private String edtUsuarioFacEmailEnvio_Internalname ;
   private String edtUsuarioFacEmailEnvio_Jsonclick ;
   private String edtUsuarioCobranzaCelular1_Internalname ;
   private String edtUsuarioCobranzaCelular1_Jsonclick ;
   private String edtUsuarioCobranzaCelular2_Internalname ;
   private String edtUsuarioCobranzaCelular2_Jsonclick ;
   private String edtUsuarioCobranzaCelularNombre1_Internalname ;
   private String edtUsuarioCobranzaCelularNombre1_Jsonclick ;
   private String edtUsuarioCobranzaCelularNombre2_Internalname ;
   private String edtUsuarioCobranzaCelularNombre2_Jsonclick ;
   private String edtUsuarioCobranzaTelefono1_Internalname ;
   private String edtUsuarioCobranzaTelefono1_Jsonclick ;
   private String edtUsuarioCobranzaTelefono2_Internalname ;
   private String edtUsuarioCobranzaTelefono2_Jsonclick ;
   private String edtUsuarioCobranzaTelefonoNombre1_Internalname ;
   private String edtUsuarioCobranzaTelefonoNombre1_Jsonclick ;
   private String edtUsuarioCobranzaTelefonoNombre2_Internalname ;
   private String edtUsuarioCobranzaTelefonoNombre2_Jsonclick ;
   private String edtUsuarioCobranzaEmail1_Internalname ;
   private String edtUsuarioCobranzaEmail1_Jsonclick ;
   private String edtUsuarioCobranzaEmail2_Internalname ;
   private String edtUsuarioCobranzaEmail2_Jsonclick ;
   private String edtUsuarioCobranzaEmailNombre1_Internalname ;
   private String edtUsuarioCobranzaEmailNombre1_Jsonclick ;
   private String edtUsuarioCobranzaEmailNombre2_Internalname ;
   private String edtUsuarioCobranzaEmailNombre2_Jsonclick ;
   private String edtUsuarioCedula_Internalname ;
   private String edtUsuarioCedula_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n114UsuarioEmail ;
   private boolean n115UsuarioUsuarioWeb ;
   private boolean n116UsuarioNombre ;
   private boolean n117UsuarioDicose ;
   private boolean n118UsuarioRazonSocial ;
   private boolean n119UsuarioRut ;
   private boolean n120UsuarioIdNet ;
   private boolean n121UsuarioDireccion ;
   private boolean n122UsuarioTipousuario ;
   private boolean n123UsuarioIdTecnico1 ;
   private boolean n124UsuarioIdTecnico2 ;
   private boolean n125UsuarioIdTecnico3 ;
   private boolean n126UsuarioDireccionFrasco ;
   private boolean n127UsuarioAgenciaFrasco ;
   private boolean n128UsuarioNotificacionFrasco1 ;
   private boolean n129UsuarioNotificacionFrasco2 ;
   private boolean n130UsuarioNotificacionSolicitud1 ;
   private boolean n131UsuarioNotificacionSolicitud2 ;
   private boolean n132UsuarioNotificacionResultado1 ;
   private boolean n133UsuarioNotificacionResultado2 ;
   private boolean n134UsuarioNotificacionAvisos1 ;
   private boolean n135UsuarioNotificacionAvisos2 ;
   private boolean n136UsuarioTecnicoCelular1 ;
   private boolean n137UsuarioTecnicoCelular2 ;
   private boolean n138UsuarioTecnicoCelularNombre1 ;
   private boolean n139UsuarioTecnicoCelularNombre2 ;
   private boolean n140UsuarioTecnicoTelefono1 ;
   private boolean n141UsuarioTecnicoTelefono2 ;
   private boolean n142UsuarioTecnicoTelefonoNombre1 ;
   private boolean n143UsuarioTecnicoTelefonoNombre2 ;
   private boolean n144UsuarioTecnicoEmail1 ;
   private boolean n145UsuarioTecnicoEmail2 ;
   private boolean n146UsuarioTecnicoEmailNombre1 ;
   private boolean n147UsuarioTecnicoEmailNombre2 ;
   private boolean n148UsuarioRutTipo ;
   private boolean n149UsuarioFacDireccion ;
   private boolean n150UsuarioFacLocalidad ;
   private boolean n151UsuarioFacDepartamento ;
   private boolean n152UsuarioFacEmailEnvio ;
   private boolean n153UsuarioCobranzaCelular1 ;
   private boolean n154UsuarioCobranzaCelular2 ;
   private boolean n155UsuarioCobranzaCelularNombre1 ;
   private boolean n156UsuarioCobranzaCelularNombre2 ;
   private boolean n157UsuarioCobranzaTelefono1 ;
   private boolean n158UsuarioCobranzaTelefono2 ;
   private boolean n159UsuarioCobranzaTelefonoNombre1 ;
   private boolean n160UsuarioCobranzaTelefonoNombre2 ;
   private boolean n161UsuarioCobranzaEmail1 ;
   private boolean n162UsuarioCobranzaEmail2 ;
   private boolean n163UsuarioCobranzaEmailNombre1 ;
   private boolean n164UsuarioCobranzaEmailNombre2 ;
   private boolean n165UsuarioCedula ;
   private boolean Gx_longc ;
   private String Z114UsuarioEmail ;
   private String Z115UsuarioUsuarioWeb ;
   private String Z116UsuarioNombre ;
   private String Z117UsuarioDicose ;
   private String Z118UsuarioRazonSocial ;
   private String Z119UsuarioRut ;
   private String Z121UsuarioDireccion ;
   private String Z126UsuarioDireccionFrasco ;
   private String Z128UsuarioNotificacionFrasco1 ;
   private String Z129UsuarioNotificacionFrasco2 ;
   private String Z130UsuarioNotificacionSolicitud1 ;
   private String Z131UsuarioNotificacionSolicitud2 ;
   private String Z132UsuarioNotificacionResultado1 ;
   private String Z133UsuarioNotificacionResultado2 ;
   private String Z134UsuarioNotificacionAvisos1 ;
   private String Z135UsuarioNotificacionAvisos2 ;
   private String Z136UsuarioTecnicoCelular1 ;
   private String Z137UsuarioTecnicoCelular2 ;
   private String Z138UsuarioTecnicoCelularNombre1 ;
   private String Z139UsuarioTecnicoCelularNombre2 ;
   private String Z140UsuarioTecnicoTelefono1 ;
   private String Z141UsuarioTecnicoTelefono2 ;
   private String Z142UsuarioTecnicoTelefonoNombre1 ;
   private String Z143UsuarioTecnicoTelefonoNombre2 ;
   private String Z144UsuarioTecnicoEmail1 ;
   private String Z145UsuarioTecnicoEmail2 ;
   private String Z146UsuarioTecnicoEmailNombre1 ;
   private String Z147UsuarioTecnicoEmailNombre2 ;
   private String Z148UsuarioRutTipo ;
   private String Z149UsuarioFacDireccion ;
   private String Z150UsuarioFacLocalidad ;
   private String Z151UsuarioFacDepartamento ;
   private String Z152UsuarioFacEmailEnvio ;
   private String Z153UsuarioCobranzaCelular1 ;
   private String Z154UsuarioCobranzaCelular2 ;
   private String Z155UsuarioCobranzaCelularNombre1 ;
   private String Z156UsuarioCobranzaCelularNombre2 ;
   private String Z157UsuarioCobranzaTelefono1 ;
   private String Z158UsuarioCobranzaTelefono2 ;
   private String Z159UsuarioCobranzaTelefonoNombre1 ;
   private String Z160UsuarioCobranzaTelefonoNombre2 ;
   private String Z161UsuarioCobranzaEmail1 ;
   private String Z162UsuarioCobranzaEmail2 ;
   private String Z163UsuarioCobranzaEmailNombre1 ;
   private String Z164UsuarioCobranzaEmailNombre2 ;
   private String Z165UsuarioCedula ;
   private String A114UsuarioEmail ;
   private String A115UsuarioUsuarioWeb ;
   private String A116UsuarioNombre ;
   private String A117UsuarioDicose ;
   private String A118UsuarioRazonSocial ;
   private String A119UsuarioRut ;
   private String A121UsuarioDireccion ;
   private String A126UsuarioDireccionFrasco ;
   private String A128UsuarioNotificacionFrasco1 ;
   private String A129UsuarioNotificacionFrasco2 ;
   private String A130UsuarioNotificacionSolicitud1 ;
   private String A131UsuarioNotificacionSolicitud2 ;
   private String A132UsuarioNotificacionResultado1 ;
   private String A133UsuarioNotificacionResultado2 ;
   private String A134UsuarioNotificacionAvisos1 ;
   private String A135UsuarioNotificacionAvisos2 ;
   private String A136UsuarioTecnicoCelular1 ;
   private String A137UsuarioTecnicoCelular2 ;
   private String A138UsuarioTecnicoCelularNombre1 ;
   private String A139UsuarioTecnicoCelularNombre2 ;
   private String A140UsuarioTecnicoTelefono1 ;
   private String A141UsuarioTecnicoTelefono2 ;
   private String A142UsuarioTecnicoTelefonoNombre1 ;
   private String A143UsuarioTecnicoTelefonoNombre2 ;
   private String A144UsuarioTecnicoEmail1 ;
   private String A145UsuarioTecnicoEmail2 ;
   private String A146UsuarioTecnicoEmailNombre1 ;
   private String A147UsuarioTecnicoEmailNombre2 ;
   private String A148UsuarioRutTipo ;
   private String A149UsuarioFacDireccion ;
   private String A150UsuarioFacLocalidad ;
   private String A151UsuarioFacDepartamento ;
   private String A152UsuarioFacEmailEnvio ;
   private String A153UsuarioCobranzaCelular1 ;
   private String A154UsuarioCobranzaCelular2 ;
   private String A155UsuarioCobranzaCelularNombre1 ;
   private String A156UsuarioCobranzaCelularNombre2 ;
   private String A157UsuarioCobranzaTelefono1 ;
   private String A158UsuarioCobranzaTelefono2 ;
   private String A159UsuarioCobranzaTelefonoNombre1 ;
   private String A160UsuarioCobranzaTelefonoNombre2 ;
   private String A161UsuarioCobranzaEmail1 ;
   private String A162UsuarioCobranzaEmail2 ;
   private String A163UsuarioCobranzaEmailNombre1 ;
   private String A164UsuarioCobranzaEmailNombre2 ;
   private String A165UsuarioCedula ;
   private String ZZ114UsuarioEmail ;
   private String ZZ115UsuarioUsuarioWeb ;
   private String ZZ116UsuarioNombre ;
   private String ZZ117UsuarioDicose ;
   private String ZZ118UsuarioRazonSocial ;
   private String ZZ119UsuarioRut ;
   private String ZZ121UsuarioDireccion ;
   private String ZZ126UsuarioDireccionFrasco ;
   private String ZZ128UsuarioNotificacionFrasco1 ;
   private String ZZ129UsuarioNotificacionFrasco2 ;
   private String ZZ130UsuarioNotificacionSolicitud1 ;
   private String ZZ131UsuarioNotificacionSolicitud2 ;
   private String ZZ132UsuarioNotificacionResultado1 ;
   private String ZZ133UsuarioNotificacionResultado2 ;
   private String ZZ134UsuarioNotificacionAvisos1 ;
   private String ZZ135UsuarioNotificacionAvisos2 ;
   private String ZZ136UsuarioTecnicoCelular1 ;
   private String ZZ137UsuarioTecnicoCelular2 ;
   private String ZZ138UsuarioTecnicoCelularNombre1 ;
   private String ZZ139UsuarioTecnicoCelularNombre2 ;
   private String ZZ140UsuarioTecnicoTelefono1 ;
   private String ZZ141UsuarioTecnicoTelefono2 ;
   private String ZZ142UsuarioTecnicoTelefonoNombre1 ;
   private String ZZ143UsuarioTecnicoTelefonoNombre2 ;
   private String ZZ144UsuarioTecnicoEmail1 ;
   private String ZZ145UsuarioTecnicoEmail2 ;
   private String ZZ146UsuarioTecnicoEmailNombre1 ;
   private String ZZ147UsuarioTecnicoEmailNombre2 ;
   private String ZZ148UsuarioRutTipo ;
   private String ZZ149UsuarioFacDireccion ;
   private String ZZ150UsuarioFacLocalidad ;
   private String ZZ151UsuarioFacDepartamento ;
   private String ZZ152UsuarioFacEmailEnvio ;
   private String ZZ153UsuarioCobranzaCelular1 ;
   private String ZZ154UsuarioCobranzaCelular2 ;
   private String ZZ155UsuarioCobranzaCelularNombre1 ;
   private String ZZ156UsuarioCobranzaCelularNombre2 ;
   private String ZZ157UsuarioCobranzaTelefono1 ;
   private String ZZ158UsuarioCobranzaTelefono2 ;
   private String ZZ159UsuarioCobranzaTelefonoNombre1 ;
   private String ZZ160UsuarioCobranzaTelefonoNombre2 ;
   private String ZZ161UsuarioCobranzaEmail1 ;
   private String ZZ162UsuarioCobranzaEmail2 ;
   private String ZZ163UsuarioCobranzaEmailNombre1 ;
   private String ZZ164UsuarioCobranzaEmailNombre2 ;
   private String ZZ165UsuarioCedula ;
   private IDataStoreProvider pr_default ;
   private long[] T00054_A5UsuarioId ;
   private String[] T00054_A114UsuarioEmail ;
   private boolean[] T00054_n114UsuarioEmail ;
   private String[] T00054_A115UsuarioUsuarioWeb ;
   private boolean[] T00054_n115UsuarioUsuarioWeb ;
   private String[] T00054_A116UsuarioNombre ;
   private boolean[] T00054_n116UsuarioNombre ;
   private String[] T00054_A117UsuarioDicose ;
   private boolean[] T00054_n117UsuarioDicose ;
   private String[] T00054_A118UsuarioRazonSocial ;
   private boolean[] T00054_n118UsuarioRazonSocial ;
   private String[] T00054_A119UsuarioRut ;
   private boolean[] T00054_n119UsuarioRut ;
   private long[] T00054_A120UsuarioIdNet ;
   private boolean[] T00054_n120UsuarioIdNet ;
   private String[] T00054_A121UsuarioDireccion ;
   private boolean[] T00054_n121UsuarioDireccion ;
   private short[] T00054_A122UsuarioTipousuario ;
   private boolean[] T00054_n122UsuarioTipousuario ;
   private long[] T00054_A123UsuarioIdTecnico1 ;
   private boolean[] T00054_n123UsuarioIdTecnico1 ;
   private long[] T00054_A124UsuarioIdTecnico2 ;
   private boolean[] T00054_n124UsuarioIdTecnico2 ;
   private long[] T00054_A125UsuarioIdTecnico3 ;
   private boolean[] T00054_n125UsuarioIdTecnico3 ;
   private String[] T00054_A126UsuarioDireccionFrasco ;
   private boolean[] T00054_n126UsuarioDireccionFrasco ;
   private short[] T00054_A127UsuarioAgenciaFrasco ;
   private boolean[] T00054_n127UsuarioAgenciaFrasco ;
   private String[] T00054_A128UsuarioNotificacionFrasco1 ;
   private boolean[] T00054_n128UsuarioNotificacionFrasco1 ;
   private String[] T00054_A129UsuarioNotificacionFrasco2 ;
   private boolean[] T00054_n129UsuarioNotificacionFrasco2 ;
   private String[] T00054_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] T00054_n130UsuarioNotificacionSolicitud1 ;
   private String[] T00054_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] T00054_n131UsuarioNotificacionSolicitud2 ;
   private String[] T00054_A132UsuarioNotificacionResultado1 ;
   private boolean[] T00054_n132UsuarioNotificacionResultado1 ;
   private String[] T00054_A133UsuarioNotificacionResultado2 ;
   private boolean[] T00054_n133UsuarioNotificacionResultado2 ;
   private String[] T00054_A134UsuarioNotificacionAvisos1 ;
   private boolean[] T00054_n134UsuarioNotificacionAvisos1 ;
   private String[] T00054_A135UsuarioNotificacionAvisos2 ;
   private boolean[] T00054_n135UsuarioNotificacionAvisos2 ;
   private String[] T00054_A136UsuarioTecnicoCelular1 ;
   private boolean[] T00054_n136UsuarioTecnicoCelular1 ;
   private String[] T00054_A137UsuarioTecnicoCelular2 ;
   private boolean[] T00054_n137UsuarioTecnicoCelular2 ;
   private String[] T00054_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] T00054_n138UsuarioTecnicoCelularNombre1 ;
   private String[] T00054_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] T00054_n139UsuarioTecnicoCelularNombre2 ;
   private String[] T00054_A140UsuarioTecnicoTelefono1 ;
   private boolean[] T00054_n140UsuarioTecnicoTelefono1 ;
   private String[] T00054_A141UsuarioTecnicoTelefono2 ;
   private boolean[] T00054_n141UsuarioTecnicoTelefono2 ;
   private String[] T00054_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] T00054_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] T00054_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] T00054_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] T00054_A144UsuarioTecnicoEmail1 ;
   private boolean[] T00054_n144UsuarioTecnicoEmail1 ;
   private String[] T00054_A145UsuarioTecnicoEmail2 ;
   private boolean[] T00054_n145UsuarioTecnicoEmail2 ;
   private String[] T00054_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] T00054_n146UsuarioTecnicoEmailNombre1 ;
   private String[] T00054_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] T00054_n147UsuarioTecnicoEmailNombre2 ;
   private String[] T00054_A148UsuarioRutTipo ;
   private boolean[] T00054_n148UsuarioRutTipo ;
   private String[] T00054_A149UsuarioFacDireccion ;
   private boolean[] T00054_n149UsuarioFacDireccion ;
   private String[] T00054_A150UsuarioFacLocalidad ;
   private boolean[] T00054_n150UsuarioFacLocalidad ;
   private String[] T00054_A151UsuarioFacDepartamento ;
   private boolean[] T00054_n151UsuarioFacDepartamento ;
   private String[] T00054_A152UsuarioFacEmailEnvio ;
   private boolean[] T00054_n152UsuarioFacEmailEnvio ;
   private String[] T00054_A153UsuarioCobranzaCelular1 ;
   private boolean[] T00054_n153UsuarioCobranzaCelular1 ;
   private String[] T00054_A154UsuarioCobranzaCelular2 ;
   private boolean[] T00054_n154UsuarioCobranzaCelular2 ;
   private String[] T00054_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] T00054_n155UsuarioCobranzaCelularNombre1 ;
   private String[] T00054_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] T00054_n156UsuarioCobranzaCelularNombre2 ;
   private String[] T00054_A157UsuarioCobranzaTelefono1 ;
   private boolean[] T00054_n157UsuarioCobranzaTelefono1 ;
   private String[] T00054_A158UsuarioCobranzaTelefono2 ;
   private boolean[] T00054_n158UsuarioCobranzaTelefono2 ;
   private String[] T00054_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] T00054_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] T00054_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] T00054_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] T00054_A161UsuarioCobranzaEmail1 ;
   private boolean[] T00054_n161UsuarioCobranzaEmail1 ;
   private String[] T00054_A162UsuarioCobranzaEmail2 ;
   private boolean[] T00054_n162UsuarioCobranzaEmail2 ;
   private String[] T00054_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] T00054_n163UsuarioCobranzaEmailNombre1 ;
   private String[] T00054_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] T00054_n164UsuarioCobranzaEmailNombre2 ;
   private String[] T00054_A165UsuarioCedula ;
   private boolean[] T00054_n165UsuarioCedula ;
   private long[] T00055_A5UsuarioId ;
   private long[] T00053_A5UsuarioId ;
   private String[] T00053_A114UsuarioEmail ;
   private boolean[] T00053_n114UsuarioEmail ;
   private String[] T00053_A115UsuarioUsuarioWeb ;
   private boolean[] T00053_n115UsuarioUsuarioWeb ;
   private String[] T00053_A116UsuarioNombre ;
   private boolean[] T00053_n116UsuarioNombre ;
   private String[] T00053_A117UsuarioDicose ;
   private boolean[] T00053_n117UsuarioDicose ;
   private String[] T00053_A118UsuarioRazonSocial ;
   private boolean[] T00053_n118UsuarioRazonSocial ;
   private String[] T00053_A119UsuarioRut ;
   private boolean[] T00053_n119UsuarioRut ;
   private long[] T00053_A120UsuarioIdNet ;
   private boolean[] T00053_n120UsuarioIdNet ;
   private String[] T00053_A121UsuarioDireccion ;
   private boolean[] T00053_n121UsuarioDireccion ;
   private short[] T00053_A122UsuarioTipousuario ;
   private boolean[] T00053_n122UsuarioTipousuario ;
   private long[] T00053_A123UsuarioIdTecnico1 ;
   private boolean[] T00053_n123UsuarioIdTecnico1 ;
   private long[] T00053_A124UsuarioIdTecnico2 ;
   private boolean[] T00053_n124UsuarioIdTecnico2 ;
   private long[] T00053_A125UsuarioIdTecnico3 ;
   private boolean[] T00053_n125UsuarioIdTecnico3 ;
   private String[] T00053_A126UsuarioDireccionFrasco ;
   private boolean[] T00053_n126UsuarioDireccionFrasco ;
   private short[] T00053_A127UsuarioAgenciaFrasco ;
   private boolean[] T00053_n127UsuarioAgenciaFrasco ;
   private String[] T00053_A128UsuarioNotificacionFrasco1 ;
   private boolean[] T00053_n128UsuarioNotificacionFrasco1 ;
   private String[] T00053_A129UsuarioNotificacionFrasco2 ;
   private boolean[] T00053_n129UsuarioNotificacionFrasco2 ;
   private String[] T00053_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] T00053_n130UsuarioNotificacionSolicitud1 ;
   private String[] T00053_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] T00053_n131UsuarioNotificacionSolicitud2 ;
   private String[] T00053_A132UsuarioNotificacionResultado1 ;
   private boolean[] T00053_n132UsuarioNotificacionResultado1 ;
   private String[] T00053_A133UsuarioNotificacionResultado2 ;
   private boolean[] T00053_n133UsuarioNotificacionResultado2 ;
   private String[] T00053_A134UsuarioNotificacionAvisos1 ;
   private boolean[] T00053_n134UsuarioNotificacionAvisos1 ;
   private String[] T00053_A135UsuarioNotificacionAvisos2 ;
   private boolean[] T00053_n135UsuarioNotificacionAvisos2 ;
   private String[] T00053_A136UsuarioTecnicoCelular1 ;
   private boolean[] T00053_n136UsuarioTecnicoCelular1 ;
   private String[] T00053_A137UsuarioTecnicoCelular2 ;
   private boolean[] T00053_n137UsuarioTecnicoCelular2 ;
   private String[] T00053_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] T00053_n138UsuarioTecnicoCelularNombre1 ;
   private String[] T00053_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] T00053_n139UsuarioTecnicoCelularNombre2 ;
   private String[] T00053_A140UsuarioTecnicoTelefono1 ;
   private boolean[] T00053_n140UsuarioTecnicoTelefono1 ;
   private String[] T00053_A141UsuarioTecnicoTelefono2 ;
   private boolean[] T00053_n141UsuarioTecnicoTelefono2 ;
   private String[] T00053_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] T00053_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] T00053_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] T00053_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] T00053_A144UsuarioTecnicoEmail1 ;
   private boolean[] T00053_n144UsuarioTecnicoEmail1 ;
   private String[] T00053_A145UsuarioTecnicoEmail2 ;
   private boolean[] T00053_n145UsuarioTecnicoEmail2 ;
   private String[] T00053_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] T00053_n146UsuarioTecnicoEmailNombre1 ;
   private String[] T00053_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] T00053_n147UsuarioTecnicoEmailNombre2 ;
   private String[] T00053_A148UsuarioRutTipo ;
   private boolean[] T00053_n148UsuarioRutTipo ;
   private String[] T00053_A149UsuarioFacDireccion ;
   private boolean[] T00053_n149UsuarioFacDireccion ;
   private String[] T00053_A150UsuarioFacLocalidad ;
   private boolean[] T00053_n150UsuarioFacLocalidad ;
   private String[] T00053_A151UsuarioFacDepartamento ;
   private boolean[] T00053_n151UsuarioFacDepartamento ;
   private String[] T00053_A152UsuarioFacEmailEnvio ;
   private boolean[] T00053_n152UsuarioFacEmailEnvio ;
   private String[] T00053_A153UsuarioCobranzaCelular1 ;
   private boolean[] T00053_n153UsuarioCobranzaCelular1 ;
   private String[] T00053_A154UsuarioCobranzaCelular2 ;
   private boolean[] T00053_n154UsuarioCobranzaCelular2 ;
   private String[] T00053_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] T00053_n155UsuarioCobranzaCelularNombre1 ;
   private String[] T00053_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] T00053_n156UsuarioCobranzaCelularNombre2 ;
   private String[] T00053_A157UsuarioCobranzaTelefono1 ;
   private boolean[] T00053_n157UsuarioCobranzaTelefono1 ;
   private String[] T00053_A158UsuarioCobranzaTelefono2 ;
   private boolean[] T00053_n158UsuarioCobranzaTelefono2 ;
   private String[] T00053_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] T00053_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] T00053_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] T00053_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] T00053_A161UsuarioCobranzaEmail1 ;
   private boolean[] T00053_n161UsuarioCobranzaEmail1 ;
   private String[] T00053_A162UsuarioCobranzaEmail2 ;
   private boolean[] T00053_n162UsuarioCobranzaEmail2 ;
   private String[] T00053_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] T00053_n163UsuarioCobranzaEmailNombre1 ;
   private String[] T00053_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] T00053_n164UsuarioCobranzaEmailNombre2 ;
   private String[] T00053_A165UsuarioCedula ;
   private boolean[] T00053_n165UsuarioCedula ;
   private long[] T00056_A5UsuarioId ;
   private long[] T00057_A5UsuarioId ;
   private long[] T00052_A5UsuarioId ;
   private String[] T00052_A114UsuarioEmail ;
   private boolean[] T00052_n114UsuarioEmail ;
   private String[] T00052_A115UsuarioUsuarioWeb ;
   private boolean[] T00052_n115UsuarioUsuarioWeb ;
   private String[] T00052_A116UsuarioNombre ;
   private boolean[] T00052_n116UsuarioNombre ;
   private String[] T00052_A117UsuarioDicose ;
   private boolean[] T00052_n117UsuarioDicose ;
   private String[] T00052_A118UsuarioRazonSocial ;
   private boolean[] T00052_n118UsuarioRazonSocial ;
   private String[] T00052_A119UsuarioRut ;
   private boolean[] T00052_n119UsuarioRut ;
   private long[] T00052_A120UsuarioIdNet ;
   private boolean[] T00052_n120UsuarioIdNet ;
   private String[] T00052_A121UsuarioDireccion ;
   private boolean[] T00052_n121UsuarioDireccion ;
   private short[] T00052_A122UsuarioTipousuario ;
   private boolean[] T00052_n122UsuarioTipousuario ;
   private long[] T00052_A123UsuarioIdTecnico1 ;
   private boolean[] T00052_n123UsuarioIdTecnico1 ;
   private long[] T00052_A124UsuarioIdTecnico2 ;
   private boolean[] T00052_n124UsuarioIdTecnico2 ;
   private long[] T00052_A125UsuarioIdTecnico3 ;
   private boolean[] T00052_n125UsuarioIdTecnico3 ;
   private String[] T00052_A126UsuarioDireccionFrasco ;
   private boolean[] T00052_n126UsuarioDireccionFrasco ;
   private short[] T00052_A127UsuarioAgenciaFrasco ;
   private boolean[] T00052_n127UsuarioAgenciaFrasco ;
   private String[] T00052_A128UsuarioNotificacionFrasco1 ;
   private boolean[] T00052_n128UsuarioNotificacionFrasco1 ;
   private String[] T00052_A129UsuarioNotificacionFrasco2 ;
   private boolean[] T00052_n129UsuarioNotificacionFrasco2 ;
   private String[] T00052_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] T00052_n130UsuarioNotificacionSolicitud1 ;
   private String[] T00052_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] T00052_n131UsuarioNotificacionSolicitud2 ;
   private String[] T00052_A132UsuarioNotificacionResultado1 ;
   private boolean[] T00052_n132UsuarioNotificacionResultado1 ;
   private String[] T00052_A133UsuarioNotificacionResultado2 ;
   private boolean[] T00052_n133UsuarioNotificacionResultado2 ;
   private String[] T00052_A134UsuarioNotificacionAvisos1 ;
   private boolean[] T00052_n134UsuarioNotificacionAvisos1 ;
   private String[] T00052_A135UsuarioNotificacionAvisos2 ;
   private boolean[] T00052_n135UsuarioNotificacionAvisos2 ;
   private String[] T00052_A136UsuarioTecnicoCelular1 ;
   private boolean[] T00052_n136UsuarioTecnicoCelular1 ;
   private String[] T00052_A137UsuarioTecnicoCelular2 ;
   private boolean[] T00052_n137UsuarioTecnicoCelular2 ;
   private String[] T00052_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] T00052_n138UsuarioTecnicoCelularNombre1 ;
   private String[] T00052_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] T00052_n139UsuarioTecnicoCelularNombre2 ;
   private String[] T00052_A140UsuarioTecnicoTelefono1 ;
   private boolean[] T00052_n140UsuarioTecnicoTelefono1 ;
   private String[] T00052_A141UsuarioTecnicoTelefono2 ;
   private boolean[] T00052_n141UsuarioTecnicoTelefono2 ;
   private String[] T00052_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] T00052_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] T00052_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] T00052_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] T00052_A144UsuarioTecnicoEmail1 ;
   private boolean[] T00052_n144UsuarioTecnicoEmail1 ;
   private String[] T00052_A145UsuarioTecnicoEmail2 ;
   private boolean[] T00052_n145UsuarioTecnicoEmail2 ;
   private String[] T00052_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] T00052_n146UsuarioTecnicoEmailNombre1 ;
   private String[] T00052_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] T00052_n147UsuarioTecnicoEmailNombre2 ;
   private String[] T00052_A148UsuarioRutTipo ;
   private boolean[] T00052_n148UsuarioRutTipo ;
   private String[] T00052_A149UsuarioFacDireccion ;
   private boolean[] T00052_n149UsuarioFacDireccion ;
   private String[] T00052_A150UsuarioFacLocalidad ;
   private boolean[] T00052_n150UsuarioFacLocalidad ;
   private String[] T00052_A151UsuarioFacDepartamento ;
   private boolean[] T00052_n151UsuarioFacDepartamento ;
   private String[] T00052_A152UsuarioFacEmailEnvio ;
   private boolean[] T00052_n152UsuarioFacEmailEnvio ;
   private String[] T00052_A153UsuarioCobranzaCelular1 ;
   private boolean[] T00052_n153UsuarioCobranzaCelular1 ;
   private String[] T00052_A154UsuarioCobranzaCelular2 ;
   private boolean[] T00052_n154UsuarioCobranzaCelular2 ;
   private String[] T00052_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] T00052_n155UsuarioCobranzaCelularNombre1 ;
   private String[] T00052_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] T00052_n156UsuarioCobranzaCelularNombre2 ;
   private String[] T00052_A157UsuarioCobranzaTelefono1 ;
   private boolean[] T00052_n157UsuarioCobranzaTelefono1 ;
   private String[] T00052_A158UsuarioCobranzaTelefono2 ;
   private boolean[] T00052_n158UsuarioCobranzaTelefono2 ;
   private String[] T00052_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] T00052_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] T00052_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] T00052_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] T00052_A161UsuarioCobranzaEmail1 ;
   private boolean[] T00052_n161UsuarioCobranzaEmail1 ;
   private String[] T00052_A162UsuarioCobranzaEmail2 ;
   private boolean[] T00052_n162UsuarioCobranzaEmail2 ;
   private String[] T00052_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] T00052_n163UsuarioCobranzaEmailNombre1 ;
   private String[] T00052_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] T00052_n164UsuarioCobranzaEmailNombre2 ;
   private String[] T00052_A165UsuarioCedula ;
   private boolean[] T00052_n165UsuarioCedula ;
   private long[] T000511_A5UsuarioId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class usuario__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class usuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00053", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00054", "SELECT TM1.`UsuarioId`, TM1.`UsuarioEmail`, TM1.`UsuarioUsuarioWeb`, TM1.`UsuarioNombre`, TM1.`UsuarioDicose`, TM1.`UsuarioRazonSocial`, TM1.`UsuarioRut`, TM1.`UsuarioIdNet`, TM1.`UsuarioDireccion`, TM1.`UsuarioTipousuario`, TM1.`UsuarioIdTecnico1`, TM1.`UsuarioIdTecnico2`, TM1.`UsuarioIdTecnico3`, TM1.`UsuarioDireccionFrasco`, TM1.`UsuarioAgenciaFrasco`, TM1.`UsuarioNotificacionFrasco1`, TM1.`UsuarioNotificacionFrasco2`, TM1.`UsuarioNotificacionSolicitud1`, TM1.`UsuarioNotificacionSolicitud2`, TM1.`UsuarioNotificacionResultado1`, TM1.`UsuarioNotificacionResultado2`, TM1.`UsuarioNotificacionAvisos1`, TM1.`UsuarioNotificacionAvisos2`, TM1.`UsuarioTecnicoCelular1`, TM1.`UsuarioTecnicoCelular2`, TM1.`UsuarioTecnicoCelularNombre1`, TM1.`UsuarioTecnicoCelularNombre2`, TM1.`UsuarioTecnicoTelefono1`, TM1.`UsuarioTecnicoTelefono2`, TM1.`UsuarioTecnicoTelefonoNombre1`, TM1.`UsuarioTecnicoTelefonoNombre2`, TM1.`UsuarioTecnicoEmail1`, TM1.`UsuarioTecnicoEmail2`, TM1.`UsuarioTecnicoEmailNombre1`, TM1.`UsuarioTecnicoEmailNombre2`, TM1.`UsuarioRutTipo`, TM1.`UsuarioFacDireccion`, TM1.`UsuarioFacLocalidad`, TM1.`UsuarioFacDepartamento`, TM1.`UsuarioFacEmailEnvio`, TM1.`UsuarioCobranzaCelular1`, TM1.`UsuarioCobranzaCelular2`, TM1.`UsuarioCobranzaCelularNombre1`, TM1.`UsuarioCobranzaCelularNombre2`, TM1.`UsuarioCobranzaTelefono1`, TM1.`UsuarioCobranzaTelefono2`, TM1.`UsuarioCobranzaTelefonoNombre1`, TM1.`UsuarioCobranzaTelefonoNombre2`, TM1.`UsuarioCobranzaEmail1`, TM1.`UsuarioCobranzaEmail2`, TM1.`UsuarioCobranzaEmailNombre1`, TM1.`UsuarioCobranzaEmailNombre2`, TM1.`UsuarioCedula` FROM `Usuario` TM1 WHERE TM1.`UsuarioId` = ? ORDER BY TM1.`UsuarioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00055", "SELECT `UsuarioId` FROM `Usuario` WHERE `UsuarioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00056", "SELECT `UsuarioId` FROM `Usuario` WHERE ( `UsuarioId` > ?) ORDER BY `UsuarioId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00057", "SELECT `UsuarioId` FROM `Usuario` WHERE ( `UsuarioId` < ?) ORDER BY `UsuarioId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00058", "INSERT INTO `Usuario`(`UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00059", "UPDATE `Usuario` SET `UsuarioEmail`=?, `UsuarioUsuarioWeb`=?, `UsuarioNombre`=?, `UsuarioDicose`=?, `UsuarioRazonSocial`=?, `UsuarioRut`=?, `UsuarioIdNet`=?, `UsuarioDireccion`=?, `UsuarioTipousuario`=?, `UsuarioIdTecnico1`=?, `UsuarioIdTecnico2`=?, `UsuarioIdTecnico3`=?, `UsuarioDireccionFrasco`=?, `UsuarioAgenciaFrasco`=?, `UsuarioNotificacionFrasco1`=?, `UsuarioNotificacionFrasco2`=?, `UsuarioNotificacionSolicitud1`=?, `UsuarioNotificacionSolicitud2`=?, `UsuarioNotificacionResultado1`=?, `UsuarioNotificacionResultado2`=?, `UsuarioNotificacionAvisos1`=?, `UsuarioNotificacionAvisos2`=?, `UsuarioTecnicoCelular1`=?, `UsuarioTecnicoCelular2`=?, `UsuarioTecnicoCelularNombre1`=?, `UsuarioTecnicoCelularNombre2`=?, `UsuarioTecnicoTelefono1`=?, `UsuarioTecnicoTelefono2`=?, `UsuarioTecnicoTelefonoNombre1`=?, `UsuarioTecnicoTelefonoNombre2`=?, `UsuarioTecnicoEmail1`=?, `UsuarioTecnicoEmail2`=?, `UsuarioTecnicoEmailNombre1`=?, `UsuarioTecnicoEmailNombre2`=?, `UsuarioRutTipo`=?, `UsuarioFacDireccion`=?, `UsuarioFacLocalidad`=?, `UsuarioFacDepartamento`=?, `UsuarioFacEmailEnvio`=?, `UsuarioCobranzaCelular1`=?, `UsuarioCobranzaCelular2`=?, `UsuarioCobranzaCelularNombre1`=?, `UsuarioCobranzaCelularNombre2`=?, `UsuarioCobranzaTelefono1`=?, `UsuarioCobranzaTelefono2`=?, `UsuarioCobranzaTelefonoNombre1`=?, `UsuarioCobranzaTelefonoNombre2`=?, `UsuarioCobranzaEmail1`=?, `UsuarioCobranzaEmail2`=?, `UsuarioCobranzaEmailNombre1`=?, `UsuarioCobranzaEmailNombre2`=?, `UsuarioCedula`=?  WHERE `UsuarioId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000510", "DELETE FROM `Usuario`  WHERE `UsuarioId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000511", "SELECT `UsuarioId` FROM `Usuario` ORDER BY `UsuarioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
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
            case 9 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 100);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[14]).longValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[20]).longValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[22]).longValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[24]).longValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 300);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 40);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 40);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 40);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 100);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 100);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 100);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 100);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 100);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[56], 100);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[58], 100);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[60], 100);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[62], 100);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[64], 100);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[66], 100);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[68], 100);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 40);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[72], 200);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[74], 40);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[76], 40);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[78], 100);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[80], 100);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[82], 100);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[84], 100);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[86], 100);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[88], 100);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[90], 100);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[92], 100);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[94], 100);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[96], 100);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[98], 100);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[100], 100);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[102], 100);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(53, (String)parms[104], 40);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 300);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 40);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 100);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 100);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 100);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 100);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 100);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 100);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 100);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 100);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[61], 100);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 100);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[65], 100);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 100);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 40);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 200);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[73], 40);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 40);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[77], 100);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[79], 100);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[81], 100);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[83], 100);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 100);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[87], 100);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[89], 100);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[91], 100);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[93], 100);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[95], 100);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[97], 100);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[99], 100);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[101], 100);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[103], 40);
               }
               stmt.setLong(53, ((Number) parms[104]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

