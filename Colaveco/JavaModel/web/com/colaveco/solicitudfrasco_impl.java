package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class solicitudfrasco_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Solicitud Frasco", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSFId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public solicitudfrasco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public solicitudfrasco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( solicitudfrasco_impl.class ));
   }

   public solicitudfrasco_impl( int remoteHandle ,
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Solicitud Frasco", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_SolicitudFrasco.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 4, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.colaveco.gx0030"+"',["+"{Ctrl:gx.dom.el('"+"SFID"+"'), id:'"+"SFID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_SolicitudFrasco.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFId_Internalname, "SFId", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFId_Internalname, GXutil.ltrim( localUtil.ntoc( A3SFId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3SFId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3SFId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFIdNet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFIdNet_Internalname, "Net", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFIdNet_Internalname, GXutil.ltrim( localUtil.ntoc( A32SFIdNet, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFIdNet_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A32SFIdNet), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A32SFIdNet), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFIdNet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFIdNet_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFNombre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFNombre_Internalname, "SFNombre", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFNombre_Internalname, A33SFNombre, GXutil.rtrim( localUtil.format( A33SFNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFNombre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFNombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFDireccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFDireccion_Internalname, "SFDireccion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFDireccion_Internalname, A34SFDireccion, GXutil.rtrim( localUtil.format( A34SFDireccion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFDireccion_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFDireccion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFAgencia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFAgencia_Internalname, "SFAgencia", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFAgencia_Internalname, GXutil.ltrim( localUtil.ntoc( A35SFAgencia, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFAgencia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A35SFAgencia), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A35SFAgencia), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFAgencia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFAgencia_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFTelefono_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFTelefono_Internalname, "SFTelefono", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFTelefono_Internalname, A36SFTelefono, GXutil.rtrim( localUtil.format( A36SFTelefono, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFTelefono_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFTelefono_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFEmail_Internalname, "SFEmail", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFEmail_Internalname, A37SFEmail, GXutil.rtrim( localUtil.format( A37SFEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFEmail_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFEmail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFrascosConC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFrascosConC_Internalname, "Con C", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFrascosConC_Internalname, GXutil.ltrim( localUtil.ntoc( A38SFFrascosConC, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFFrascosConC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A38SFFrascosConC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A38SFFrascosConC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFrascosConC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFrascosConC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFrascosSinC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFrascosSinC_Internalname, "Sin C", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFrascosSinC_Internalname, GXutil.ltrim( localUtil.ntoc( A39SFFrascosSinC, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFFrascosSinC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A39SFFrascosSinC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A39SFFrascosSinC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFrascosSinC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFrascosSinC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFrascosAgua_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFrascosAgua_Internalname, "Agua", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFrascosAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A167SFFrascosAgua, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFFrascosAgua_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A167SFFrascosAgua), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A167SFFrascosAgua), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFrascosAgua_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFrascosAgua_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFrascosSangre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFrascosSangre_Internalname, "Sangre", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFrascosSangre_Internalname, GXutil.ltrim( localUtil.ntoc( A40SFFrascosSangre, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFFrascosSangre_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A40SFFrascosSangre), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A40SFFrascosSangre), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFrascosSangre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFrascosSangre_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFObservaciones_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFObservaciones_Internalname, "SFObservaciones", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtSFObservaciones_Internalname, A41SFObservaciones, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtSFObservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFechaCreacion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFechaCreacion_Internalname, "Creacion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSFFechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFechaCreacion_Internalname, localUtil.ttoc( A42SFFechaCreacion, 10, 8, 1, 2, "/", ":", " "), localUtil.format( A42SFFechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFechaCreacion_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFechaCreacion_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtSFFechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSFFechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SolicitudFrasco.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFechaModificado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFechaModificado_Internalname, "Modificado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSFFechaModificado_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFechaModificado_Internalname, localUtil.ttoc( A43SFFechaModificado, 10, 8, 1, 2, "/", ":", " "), localUtil.format( A43SFFechaModificado, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFechaModificado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFechaModificado_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtSFFechaModificado_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSFFechaModificado_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SolicitudFrasco.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSFFrascosIsopo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtSFFrascosIsopo_Internalname, "Isopo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtSFFrascosIsopo_Internalname, GXutil.ltrim( localUtil.ntoc( A44SFFrascosIsopo, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtSFFrascosIsopo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44SFFrascosIsopo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44SFFrascosIsopo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSFFrascosIsopo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSFFrascosIsopo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SolicitudFrasco.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SolicitudFrasco.htm");
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
         Z3SFId = localUtil.ctol( httpContext.cgiGet( "Z3SFId"), ".", ",") ;
         Z32SFIdNet = localUtil.ctol( httpContext.cgiGet( "Z32SFIdNet"), ".", ",") ;
         n32SFIdNet = ((0==A32SFIdNet) ? true : false) ;
         Z33SFNombre = httpContext.cgiGet( "Z33SFNombre") ;
         n33SFNombre = ((GXutil.strcmp("", A33SFNombre)==0) ? true : false) ;
         Z34SFDireccion = httpContext.cgiGet( "Z34SFDireccion") ;
         n34SFDireccion = ((GXutil.strcmp("", A34SFDireccion)==0) ? true : false) ;
         Z35SFAgencia = (short)(localUtil.ctol( httpContext.cgiGet( "Z35SFAgencia"), ".", ",")) ;
         n35SFAgencia = ((0==A35SFAgencia) ? true : false) ;
         Z36SFTelefono = httpContext.cgiGet( "Z36SFTelefono") ;
         n36SFTelefono = ((GXutil.strcmp("", A36SFTelefono)==0) ? true : false) ;
         Z37SFEmail = httpContext.cgiGet( "Z37SFEmail") ;
         n37SFEmail = ((GXutil.strcmp("", A37SFEmail)==0) ? true : false) ;
         Z38SFFrascosConC = (short)(localUtil.ctol( httpContext.cgiGet( "Z38SFFrascosConC"), ".", ",")) ;
         n38SFFrascosConC = ((0==A38SFFrascosConC) ? true : false) ;
         Z39SFFrascosSinC = (short)(localUtil.ctol( httpContext.cgiGet( "Z39SFFrascosSinC"), ".", ",")) ;
         n39SFFrascosSinC = ((0==A39SFFrascosSinC) ? true : false) ;
         Z167SFFrascosAgua = (short)(localUtil.ctol( httpContext.cgiGet( "Z167SFFrascosAgua"), ".", ",")) ;
         n167SFFrascosAgua = ((0==A167SFFrascosAgua) ? true : false) ;
         Z40SFFrascosSangre = (short)(localUtil.ctol( httpContext.cgiGet( "Z40SFFrascosSangre"), ".", ",")) ;
         n40SFFrascosSangre = ((0==A40SFFrascosSangre) ? true : false) ;
         Z41SFObservaciones = httpContext.cgiGet( "Z41SFObservaciones") ;
         n41SFObservaciones = ((GXutil.strcmp("", A41SFObservaciones)==0) ? true : false) ;
         Z42SFFechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z42SFFechaCreacion"), 0) ;
         n42SFFechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A42SFFechaCreacion) ? true : false) ;
         Z43SFFechaModificado = localUtil.ctot( httpContext.cgiGet( "Z43SFFechaModificado"), 0) ;
         n43SFFechaModificado = (GXutil.dateCompare(GXutil.nullDate(), A43SFFechaModificado) ? true : false) ;
         Z44SFFrascosIsopo = (short)(localUtil.ctol( httpContext.cgiGet( "Z44SFFrascosIsopo"), ".", ",")) ;
         n44SFFrascosIsopo = ((0==A44SFFrascosIsopo) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFId_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3SFId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
         }
         else
         {
            A3SFId = localUtil.ctol( httpContext.cgiGet( edtSFId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFIdNet_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFIdNet_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFIDNET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFIdNet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A32SFIdNet = 0 ;
            n32SFIdNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32SFIdNet), 18, 0));
         }
         else
         {
            A32SFIdNet = localUtil.ctol( httpContext.cgiGet( edtSFIdNet_Internalname), ".", ",") ;
            n32SFIdNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32SFIdNet), 18, 0));
         }
         n32SFIdNet = ((0==A32SFIdNet) ? true : false) ;
         A33SFNombre = httpContext.cgiGet( edtSFNombre_Internalname) ;
         n33SFNombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A33SFNombre", A33SFNombre);
         n33SFNombre = ((GXutil.strcmp("", A33SFNombre)==0) ? true : false) ;
         A34SFDireccion = httpContext.cgiGet( edtSFDireccion_Internalname) ;
         n34SFDireccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A34SFDireccion", A34SFDireccion);
         n34SFDireccion = ((GXutil.strcmp("", A34SFDireccion)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFAgencia_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFAgencia_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFAGENCIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFAgencia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A35SFAgencia = (short)(0) ;
            n35SFAgencia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A35SFAgencia), 4, 0));
         }
         else
         {
            A35SFAgencia = (short)(localUtil.ctol( httpContext.cgiGet( edtSFAgencia_Internalname), ".", ",")) ;
            n35SFAgencia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A35SFAgencia), 4, 0));
         }
         n35SFAgencia = ((0==A35SFAgencia) ? true : false) ;
         A36SFTelefono = httpContext.cgiGet( edtSFTelefono_Internalname) ;
         n36SFTelefono = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A36SFTelefono", A36SFTelefono);
         n36SFTelefono = ((GXutil.strcmp("", A36SFTelefono)==0) ? true : false) ;
         A37SFEmail = httpContext.cgiGet( edtSFEmail_Internalname) ;
         n37SFEmail = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A37SFEmail", A37SFEmail);
         n37SFEmail = ((GXutil.strcmp("", A37SFEmail)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosConC_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosConC_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFFRASCOSCONC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFrascosConC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A38SFFrascosConC = (short)(0) ;
            n38SFFrascosConC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A38SFFrascosConC), 4, 0));
         }
         else
         {
            A38SFFrascosConC = (short)(localUtil.ctol( httpContext.cgiGet( edtSFFrascosConC_Internalname), ".", ",")) ;
            n38SFFrascosConC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A38SFFrascosConC), 4, 0));
         }
         n38SFFrascosConC = ((0==A38SFFrascosConC) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosSinC_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosSinC_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFFRASCOSSINC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFrascosSinC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A39SFFrascosSinC = (short)(0) ;
            n39SFFrascosSinC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39SFFrascosSinC), 4, 0));
         }
         else
         {
            A39SFFrascosSinC = (short)(localUtil.ctol( httpContext.cgiGet( edtSFFrascosSinC_Internalname), ".", ",")) ;
            n39SFFrascosSinC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39SFFrascosSinC), 4, 0));
         }
         n39SFFrascosSinC = ((0==A39SFFrascosSinC) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosAgua_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosAgua_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFFRASCOSAGUA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFrascosAgua_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A167SFFrascosAgua = (short)(0) ;
            n167SFFrascosAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrimstr( DecimalUtil.doubleToDec(A167SFFrascosAgua), 4, 0));
         }
         else
         {
            A167SFFrascosAgua = (short)(localUtil.ctol( httpContext.cgiGet( edtSFFrascosAgua_Internalname), ".", ",")) ;
            n167SFFrascosAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrimstr( DecimalUtil.doubleToDec(A167SFFrascosAgua), 4, 0));
         }
         n167SFFrascosAgua = ((0==A167SFFrascosAgua) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosSangre_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosSangre_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFFRASCOSSANGRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFrascosSangre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A40SFFrascosSangre = (short)(0) ;
            n40SFFrascosSangre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A40SFFrascosSangre), 4, 0));
         }
         else
         {
            A40SFFrascosSangre = (short)(localUtil.ctol( httpContext.cgiGet( edtSFFrascosSangre_Internalname), ".", ",")) ;
            n40SFFrascosSangre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A40SFFrascosSangre), 4, 0));
         }
         n40SFFrascosSangre = ((0==A40SFFrascosSangre) ? true : false) ;
         A41SFObservaciones = httpContext.cgiGet( edtSFObservaciones_Internalname) ;
         n41SFObservaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A41SFObservaciones", A41SFObservaciones);
         n41SFObservaciones = ((GXutil.strcmp("", A41SFObservaciones)==0) ? true : false) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtSFFechaCreacion_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "SFFECHACREACION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFechaCreacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
            n42SFFechaCreacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            A42SFFechaCreacion = localUtil.ctot( httpContext.cgiGet( edtSFFechaCreacion_Internalname)) ;
            n42SFFechaCreacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 8, 5, 1, 2, "/", ":", " "));
         }
         n42SFFechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A42SFFechaCreacion) ? true : false) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtSFFechaModificado_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "SFFECHAMODIFICADO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFechaModificado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
            n43SFFechaModificado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            A43SFFechaModificado = localUtil.ctot( httpContext.cgiGet( edtSFFechaModificado_Internalname)) ;
            n43SFFechaModificado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 8, 5, 1, 2, "/", ":", " "));
         }
         n43SFFechaModificado = (GXutil.dateCompare(GXutil.nullDate(), A43SFFechaModificado) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosIsopo_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSFFrascosIsopo_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SFFRASCOSISOPO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSFFrascosIsopo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44SFFrascosIsopo = (short)(0) ;
            n44SFFrascosIsopo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44SFFrascosIsopo), 4, 0));
         }
         else
         {
            A44SFFrascosIsopo = (short)(localUtil.ctol( httpContext.cgiGet( edtSFFrascosIsopo_Internalname), ".", ",")) ;
            n44SFFrascosIsopo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44SFFrascosIsopo), 4, 0));
         }
         n44SFFrascosIsopo = ((0==A44SFFrascosIsopo) ? true : false) ;
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
            A3SFId = GXutil.lval( httpContext.GetPar( "SFId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
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
            initAll033( ) ;
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
      disableAttributes033( ) ;
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

   public void resetCaption030( )
   {
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z32SFIdNet = T00033_A32SFIdNet[0] ;
            Z33SFNombre = T00033_A33SFNombre[0] ;
            Z34SFDireccion = T00033_A34SFDireccion[0] ;
            Z35SFAgencia = T00033_A35SFAgencia[0] ;
            Z36SFTelefono = T00033_A36SFTelefono[0] ;
            Z37SFEmail = T00033_A37SFEmail[0] ;
            Z38SFFrascosConC = T00033_A38SFFrascosConC[0] ;
            Z39SFFrascosSinC = T00033_A39SFFrascosSinC[0] ;
            Z167SFFrascosAgua = T00033_A167SFFrascosAgua[0] ;
            Z40SFFrascosSangre = T00033_A40SFFrascosSangre[0] ;
            Z41SFObservaciones = T00033_A41SFObservaciones[0] ;
            Z42SFFechaCreacion = T00033_A42SFFechaCreacion[0] ;
            Z43SFFechaModificado = T00033_A43SFFechaModificado[0] ;
            Z44SFFrascosIsopo = T00033_A44SFFrascosIsopo[0] ;
         }
         else
         {
            Z32SFIdNet = A32SFIdNet ;
            Z33SFNombre = A33SFNombre ;
            Z34SFDireccion = A34SFDireccion ;
            Z35SFAgencia = A35SFAgencia ;
            Z36SFTelefono = A36SFTelefono ;
            Z37SFEmail = A37SFEmail ;
            Z38SFFrascosConC = A38SFFrascosConC ;
            Z39SFFrascosSinC = A39SFFrascosSinC ;
            Z167SFFrascosAgua = A167SFFrascosAgua ;
            Z40SFFrascosSangre = A40SFFrascosSangre ;
            Z41SFObservaciones = A41SFObservaciones ;
            Z42SFFechaCreacion = A42SFFechaCreacion ;
            Z43SFFechaModificado = A43SFFechaModificado ;
            Z44SFFrascosIsopo = A44SFFrascosIsopo ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z3SFId = A3SFId ;
         Z32SFIdNet = A32SFIdNet ;
         Z33SFNombre = A33SFNombre ;
         Z34SFDireccion = A34SFDireccion ;
         Z35SFAgencia = A35SFAgencia ;
         Z36SFTelefono = A36SFTelefono ;
         Z37SFEmail = A37SFEmail ;
         Z38SFFrascosConC = A38SFFrascosConC ;
         Z39SFFrascosSinC = A39SFFrascosSinC ;
         Z167SFFrascosAgua = A167SFFrascosAgua ;
         Z40SFFrascosSangre = A40SFFrascosSangre ;
         Z41SFObservaciones = A41SFObservaciones ;
         Z42SFFechaCreacion = A42SFFechaCreacion ;
         Z43SFFechaModificado = A43SFFechaModificado ;
         Z44SFFrascosIsopo = A44SFFrascosIsopo ;
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

   public void load033( )
   {
      /* Using cursor T00034 */
      pr_default.execute(2, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A32SFIdNet = T00034_A32SFIdNet[0] ;
         n32SFIdNet = T00034_n32SFIdNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32SFIdNet), 18, 0));
         A33SFNombre = T00034_A33SFNombre[0] ;
         n33SFNombre = T00034_n33SFNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33SFNombre", A33SFNombre);
         A34SFDireccion = T00034_A34SFDireccion[0] ;
         n34SFDireccion = T00034_n34SFDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34SFDireccion", A34SFDireccion);
         A35SFAgencia = T00034_A35SFAgencia[0] ;
         n35SFAgencia = T00034_n35SFAgencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A35SFAgencia), 4, 0));
         A36SFTelefono = T00034_A36SFTelefono[0] ;
         n36SFTelefono = T00034_n36SFTelefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36SFTelefono", A36SFTelefono);
         A37SFEmail = T00034_A37SFEmail[0] ;
         n37SFEmail = T00034_n37SFEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37SFEmail", A37SFEmail);
         A38SFFrascosConC = T00034_A38SFFrascosConC[0] ;
         n38SFFrascosConC = T00034_n38SFFrascosConC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A38SFFrascosConC), 4, 0));
         A39SFFrascosSinC = T00034_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = T00034_n39SFFrascosSinC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39SFFrascosSinC), 4, 0));
         A167SFFrascosAgua = T00034_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = T00034_n167SFFrascosAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrimstr( DecimalUtil.doubleToDec(A167SFFrascosAgua), 4, 0));
         A40SFFrascosSangre = T00034_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = T00034_n40SFFrascosSangre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A40SFFrascosSangre), 4, 0));
         A41SFObservaciones = T00034_A41SFObservaciones[0] ;
         n41SFObservaciones = T00034_n41SFObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41SFObservaciones", A41SFObservaciones);
         A42SFFechaCreacion = T00034_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = T00034_n42SFFechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 8, 5, 1, 2, "/", ":", " "));
         A43SFFechaModificado = T00034_A43SFFechaModificado[0] ;
         n43SFFechaModificado = T00034_n43SFFechaModificado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 8, 5, 1, 2, "/", ":", " "));
         A44SFFrascosIsopo = T00034_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = T00034_n44SFFrascosIsopo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44SFFrascosIsopo), 4, 0));
         zm033( -3) ;
      }
      pr_default.close(2);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
   }

   public void checkExtendedTable033( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A42SFFechaCreacion) || (( A42SFFechaCreacion.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A42SFFechaCreacion, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field SFFecha Creacion is out of range", "OutOfRange", 1, "SFFECHACREACION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSFFechaCreacion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A43SFFechaModificado) || (( A43SFFechaModificado.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A43SFFechaModificado, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field SFFecha Modificado is out of range", "OutOfRange", 1, "SFFECHAMODIFICADO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSFFechaModificado_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor T00035 */
      pr_default.execute(3, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00033 */
      pr_default.execute(1, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm033( 3) ;
         RcdFound3 = (short)(1) ;
         A3SFId = T00033_A3SFId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
         A32SFIdNet = T00033_A32SFIdNet[0] ;
         n32SFIdNet = T00033_n32SFIdNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32SFIdNet), 18, 0));
         A33SFNombre = T00033_A33SFNombre[0] ;
         n33SFNombre = T00033_n33SFNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33SFNombre", A33SFNombre);
         A34SFDireccion = T00033_A34SFDireccion[0] ;
         n34SFDireccion = T00033_n34SFDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34SFDireccion", A34SFDireccion);
         A35SFAgencia = T00033_A35SFAgencia[0] ;
         n35SFAgencia = T00033_n35SFAgencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A35SFAgencia), 4, 0));
         A36SFTelefono = T00033_A36SFTelefono[0] ;
         n36SFTelefono = T00033_n36SFTelefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36SFTelefono", A36SFTelefono);
         A37SFEmail = T00033_A37SFEmail[0] ;
         n37SFEmail = T00033_n37SFEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37SFEmail", A37SFEmail);
         A38SFFrascosConC = T00033_A38SFFrascosConC[0] ;
         n38SFFrascosConC = T00033_n38SFFrascosConC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A38SFFrascosConC), 4, 0));
         A39SFFrascosSinC = T00033_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = T00033_n39SFFrascosSinC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39SFFrascosSinC), 4, 0));
         A167SFFrascosAgua = T00033_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = T00033_n167SFFrascosAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrimstr( DecimalUtil.doubleToDec(A167SFFrascosAgua), 4, 0));
         A40SFFrascosSangre = T00033_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = T00033_n40SFFrascosSangre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A40SFFrascosSangre), 4, 0));
         A41SFObservaciones = T00033_A41SFObservaciones[0] ;
         n41SFObservaciones = T00033_n41SFObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41SFObservaciones", A41SFObservaciones);
         A42SFFechaCreacion = T00033_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = T00033_n42SFFechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 8, 5, 1, 2, "/", ":", " "));
         A43SFFechaModificado = T00033_A43SFFechaModificado[0] ;
         n43SFFechaModificado = T00033_n43SFFechaModificado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 8, 5, 1, 2, "/", ":", " "));
         A44SFFrascosIsopo = T00033_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = T00033_n44SFFrascosIsopo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44SFFrascosIsopo), 4, 0));
         Z3SFId = A3SFId ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T00036 */
      pr_default.execute(4, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00036_A3SFId[0] < A3SFId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00036_A3SFId[0] > A3SFId ) ) )
         {
            A3SFId = T00036_A3SFId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T00037 */
      pr_default.execute(5, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00037_A3SFId[0] > A3SFId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00037_A3SFId[0] < A3SFId ) ) )
         {
            A3SFId = T00037_A3SFId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSFId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert033( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A3SFId != Z3SFId )
            {
               A3SFId = Z3SFId ;
               httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SFID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSFId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSFId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update033( ) ;
               GX_FocusControl = edtSFId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A3SFId != Z3SFId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtSFId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert033( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SFID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSFId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtSFId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert033( ) ;
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
      if ( A3SFId != Z3SFId )
      {
         A3SFId = Z3SFId ;
         httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSFId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSFId_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "SFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSFId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtSFIdNet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSFIdNet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSFIdNet_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSFIdNet_Internalname ;
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
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext033( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSFIdNet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00032 */
         pr_default.execute(0, new Object[] {Long.valueOf(A3SFId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SolicitudFrasco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z32SFIdNet != T00032_A32SFIdNet[0] ) || ( GXutil.strcmp(Z33SFNombre, T00032_A33SFNombre[0]) != 0 ) || ( GXutil.strcmp(Z34SFDireccion, T00032_A34SFDireccion[0]) != 0 ) || ( Z35SFAgencia != T00032_A35SFAgencia[0] ) || ( GXutil.strcmp(Z36SFTelefono, T00032_A36SFTelefono[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z37SFEmail, T00032_A37SFEmail[0]) != 0 ) || ( Z38SFFrascosConC != T00032_A38SFFrascosConC[0] ) || ( Z39SFFrascosSinC != T00032_A39SFFrascosSinC[0] ) || ( Z167SFFrascosAgua != T00032_A167SFFrascosAgua[0] ) || ( Z40SFFrascosSangre != T00032_A40SFFrascosSangre[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z41SFObservaciones, T00032_A41SFObservaciones[0]) != 0 ) || !( GXutil.dateCompare(Z42SFFechaCreacion, T00032_A42SFFechaCreacion[0]) ) || !( GXutil.dateCompare(Z43SFFechaModificado, T00032_A43SFFechaModificado[0]) ) || ( Z44SFFrascosIsopo != T00032_A44SFFrascosIsopo[0] ) )
         {
            if ( Z32SFIdNet != T00032_A32SFIdNet[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFIdNet");
               GXutil.writeLogRaw("Old: ",Z32SFIdNet);
               GXutil.writeLogRaw("Current: ",T00032_A32SFIdNet[0]);
            }
            if ( GXutil.strcmp(Z33SFNombre, T00032_A33SFNombre[0]) != 0 )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFNombre");
               GXutil.writeLogRaw("Old: ",Z33SFNombre);
               GXutil.writeLogRaw("Current: ",T00032_A33SFNombre[0]);
            }
            if ( GXutil.strcmp(Z34SFDireccion, T00032_A34SFDireccion[0]) != 0 )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFDireccion");
               GXutil.writeLogRaw("Old: ",Z34SFDireccion);
               GXutil.writeLogRaw("Current: ",T00032_A34SFDireccion[0]);
            }
            if ( Z35SFAgencia != T00032_A35SFAgencia[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFAgencia");
               GXutil.writeLogRaw("Old: ",Z35SFAgencia);
               GXutil.writeLogRaw("Current: ",T00032_A35SFAgencia[0]);
            }
            if ( GXutil.strcmp(Z36SFTelefono, T00032_A36SFTelefono[0]) != 0 )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFTelefono");
               GXutil.writeLogRaw("Old: ",Z36SFTelefono);
               GXutil.writeLogRaw("Current: ",T00032_A36SFTelefono[0]);
            }
            if ( GXutil.strcmp(Z37SFEmail, T00032_A37SFEmail[0]) != 0 )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFEmail");
               GXutil.writeLogRaw("Old: ",Z37SFEmail);
               GXutil.writeLogRaw("Current: ",T00032_A37SFEmail[0]);
            }
            if ( Z38SFFrascosConC != T00032_A38SFFrascosConC[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFrascosConC");
               GXutil.writeLogRaw("Old: ",Z38SFFrascosConC);
               GXutil.writeLogRaw("Current: ",T00032_A38SFFrascosConC[0]);
            }
            if ( Z39SFFrascosSinC != T00032_A39SFFrascosSinC[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFrascosSinC");
               GXutil.writeLogRaw("Old: ",Z39SFFrascosSinC);
               GXutil.writeLogRaw("Current: ",T00032_A39SFFrascosSinC[0]);
            }
            if ( Z167SFFrascosAgua != T00032_A167SFFrascosAgua[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFrascosAgua");
               GXutil.writeLogRaw("Old: ",Z167SFFrascosAgua);
               GXutil.writeLogRaw("Current: ",T00032_A167SFFrascosAgua[0]);
            }
            if ( Z40SFFrascosSangre != T00032_A40SFFrascosSangre[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFrascosSangre");
               GXutil.writeLogRaw("Old: ",Z40SFFrascosSangre);
               GXutil.writeLogRaw("Current: ",T00032_A40SFFrascosSangre[0]);
            }
            if ( GXutil.strcmp(Z41SFObservaciones, T00032_A41SFObservaciones[0]) != 0 )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFObservaciones");
               GXutil.writeLogRaw("Old: ",Z41SFObservaciones);
               GXutil.writeLogRaw("Current: ",T00032_A41SFObservaciones[0]);
            }
            if ( !( GXutil.dateCompare(Z42SFFechaCreacion, T00032_A42SFFechaCreacion[0]) ) )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFechaCreacion");
               GXutil.writeLogRaw("Old: ",Z42SFFechaCreacion);
               GXutil.writeLogRaw("Current: ",T00032_A42SFFechaCreacion[0]);
            }
            if ( !( GXutil.dateCompare(Z43SFFechaModificado, T00032_A43SFFechaModificado[0]) ) )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFechaModificado");
               GXutil.writeLogRaw("Old: ",Z43SFFechaModificado);
               GXutil.writeLogRaw("Current: ",T00032_A43SFFechaModificado[0]);
            }
            if ( Z44SFFrascosIsopo != T00032_A44SFFrascosIsopo[0] )
            {
               GXutil.writeLogln("solicitudfrasco:[seudo value changed for attri]"+"SFFrascosIsopo");
               GXutil.writeLogRaw("Old: ",Z44SFFrascosIsopo);
               GXutil.writeLogRaw("Current: ",T00032_A44SFFrascosIsopo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SolicitudFrasco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00038 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A3SFId), Boolean.valueOf(n32SFIdNet), Long.valueOf(A32SFIdNet), Boolean.valueOf(n33SFNombre), A33SFNombre, Boolean.valueOf(n34SFDireccion), A34SFDireccion, Boolean.valueOf(n35SFAgencia), Short.valueOf(A35SFAgencia), Boolean.valueOf(n36SFTelefono), A36SFTelefono, Boolean.valueOf(n37SFEmail), A37SFEmail, Boolean.valueOf(n38SFFrascosConC), Short.valueOf(A38SFFrascosConC), Boolean.valueOf(n39SFFrascosSinC), Short.valueOf(A39SFFrascosSinC), Boolean.valueOf(n167SFFrascosAgua), Short.valueOf(A167SFFrascosAgua), Boolean.valueOf(n40SFFrascosSangre), Short.valueOf(A40SFFrascosSangre), Boolean.valueOf(n41SFObservaciones), A41SFObservaciones, Boolean.valueOf(n42SFFechaCreacion), A42SFFechaCreacion, Boolean.valueOf(n43SFFechaModificado), A43SFFechaModificado, Boolean.valueOf(n44SFFrascosIsopo), Short.valueOf(A44SFFrascosIsopo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
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
                        resetCaption030( ) ;
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00039 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n32SFIdNet), Long.valueOf(A32SFIdNet), Boolean.valueOf(n33SFNombre), A33SFNombre, Boolean.valueOf(n34SFDireccion), A34SFDireccion, Boolean.valueOf(n35SFAgencia), Short.valueOf(A35SFAgencia), Boolean.valueOf(n36SFTelefono), A36SFTelefono, Boolean.valueOf(n37SFEmail), A37SFEmail, Boolean.valueOf(n38SFFrascosConC), Short.valueOf(A38SFFrascosConC), Boolean.valueOf(n39SFFrascosSinC), Short.valueOf(A39SFFrascosSinC), Boolean.valueOf(n167SFFrascosAgua), Short.valueOf(A167SFFrascosAgua), Boolean.valueOf(n40SFFrascosSangre), Short.valueOf(A40SFFrascosSangre), Boolean.valueOf(n41SFObservaciones), A41SFObservaciones, Boolean.valueOf(n42SFFechaCreacion), A42SFFechaCreacion, Boolean.valueOf(n43SFFechaModificado), A43SFFechaModificado, Boolean.valueOf(n44SFFrascosIsopo), Short.valueOf(A44SFFrascosIsopo), Long.valueOf(A3SFId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SolicitudFrasco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption030( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000310 */
               pr_default.execute(8, new Object[] {Long.valueOf(A3SFId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound3 == 0 )
                     {
                        initAll033( ) ;
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
                     resetCaption030( ) ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel033( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel033( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "solicitudfrasco");
         if ( AnyError == 0 )
         {
            confirmValues030( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "solicitudfrasco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart033( )
   {
      /* Using cursor T000311 */
      pr_default.execute(9);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3SFId = T000311_A3SFId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3SFId = T000311_A3SFId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
      }
   }

   public void scanEnd033( )
   {
      pr_default.close(9);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
      edtSFId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFId_Enabled), 5, 0), true);
      edtSFIdNet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFIdNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFIdNet_Enabled), 5, 0), true);
      edtSFNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFNombre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFNombre_Enabled), 5, 0), true);
      edtSFDireccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFDireccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFDireccion_Enabled), 5, 0), true);
      edtSFAgencia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFAgencia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFAgencia_Enabled), 5, 0), true);
      edtSFTelefono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFTelefono_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFTelefono_Enabled), 5, 0), true);
      edtSFEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFEmail_Enabled), 5, 0), true);
      edtSFFrascosConC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFrascosConC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFrascosConC_Enabled), 5, 0), true);
      edtSFFrascosSinC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFrascosSinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFrascosSinC_Enabled), 5, 0), true);
      edtSFFrascosAgua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFrascosAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFrascosAgua_Enabled), 5, 0), true);
      edtSFFrascosSangre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFrascosSangre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFrascosSangre_Enabled), 5, 0), true);
      edtSFObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFObservaciones_Enabled), 5, 0), true);
      edtSFFechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFechaCreacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFechaCreacion_Enabled), 5, 0), true);
      edtSFFechaModificado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFechaModificado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFechaModificado_Enabled), 5, 0), true);
      edtSFFrascosIsopo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSFFrascosIsopo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSFFrascosIsopo_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues030( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614564115", false, true);
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
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.solicitudfrasco", new String[] {}, new String[] {}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z3SFId", GXutil.ltrim( localUtil.ntoc( Z3SFId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z32SFIdNet", GXutil.ltrim( localUtil.ntoc( Z32SFIdNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z33SFNombre", Z33SFNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z34SFDireccion", Z34SFDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z35SFAgencia", GXutil.ltrim( localUtil.ntoc( Z35SFAgencia, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z36SFTelefono", Z36SFTelefono);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z37SFEmail", Z37SFEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z38SFFrascosConC", GXutil.ltrim( localUtil.ntoc( Z38SFFrascosConC, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z39SFFrascosSinC", GXutil.ltrim( localUtil.ntoc( Z39SFFrascosSinC, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z167SFFrascosAgua", GXutil.ltrim( localUtil.ntoc( Z167SFFrascosAgua, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z40SFFrascosSangre", GXutil.ltrim( localUtil.ntoc( Z40SFFrascosSangre, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z41SFObservaciones", Z41SFObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z42SFFechaCreacion", localUtil.ttoc( Z42SFFechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z43SFFechaModificado", localUtil.ttoc( Z43SFFechaModificado, 10, 8, 0, 0, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z44SFFrascosIsopo", GXutil.ltrim( localUtil.ntoc( Z44SFFrascosIsopo, (byte)(4), (byte)(0), ".", "")));
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
      return formatLink("com.colaveco.solicitudfrasco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "SolicitudFrasco" ;
   }

   public String getPgmdesc( )
   {
      return "Solicitud Frasco" ;
   }

   public void initializeNonKey033( )
   {
      A32SFIdNet = 0 ;
      n32SFIdNet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32SFIdNet), 18, 0));
      n32SFIdNet = ((0==A32SFIdNet) ? true : false) ;
      A33SFNombre = "" ;
      n33SFNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A33SFNombre", A33SFNombre);
      n33SFNombre = ((GXutil.strcmp("", A33SFNombre)==0) ? true : false) ;
      A34SFDireccion = "" ;
      n34SFDireccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A34SFDireccion", A34SFDireccion);
      n34SFDireccion = ((GXutil.strcmp("", A34SFDireccion)==0) ? true : false) ;
      A35SFAgencia = (short)(0) ;
      n35SFAgencia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A35SFAgencia), 4, 0));
      n35SFAgencia = ((0==A35SFAgencia) ? true : false) ;
      A36SFTelefono = "" ;
      n36SFTelefono = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A36SFTelefono", A36SFTelefono);
      n36SFTelefono = ((GXutil.strcmp("", A36SFTelefono)==0) ? true : false) ;
      A37SFEmail = "" ;
      n37SFEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A37SFEmail", A37SFEmail);
      n37SFEmail = ((GXutil.strcmp("", A37SFEmail)==0) ? true : false) ;
      A38SFFrascosConC = (short)(0) ;
      n38SFFrascosConC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A38SFFrascosConC), 4, 0));
      n38SFFrascosConC = ((0==A38SFFrascosConC) ? true : false) ;
      A39SFFrascosSinC = (short)(0) ;
      n39SFFrascosSinC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39SFFrascosSinC), 4, 0));
      n39SFFrascosSinC = ((0==A39SFFrascosSinC) ? true : false) ;
      A167SFFrascosAgua = (short)(0) ;
      n167SFFrascosAgua = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrimstr( DecimalUtil.doubleToDec(A167SFFrascosAgua), 4, 0));
      n167SFFrascosAgua = ((0==A167SFFrascosAgua) ? true : false) ;
      A40SFFrascosSangre = (short)(0) ;
      n40SFFrascosSangre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A40SFFrascosSangre), 4, 0));
      n40SFFrascosSangre = ((0==A40SFFrascosSangre) ? true : false) ;
      A41SFObservaciones = "" ;
      n41SFObservaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A41SFObservaciones", A41SFObservaciones);
      n41SFObservaciones = ((GXutil.strcmp("", A41SFObservaciones)==0) ? true : false) ;
      A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      n42SFFechaCreacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 8, 5, 1, 2, "/", ":", " "));
      n42SFFechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A42SFFechaCreacion) ? true : false) ;
      A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      n43SFFechaModificado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 8, 5, 1, 2, "/", ":", " "));
      n43SFFechaModificado = (GXutil.dateCompare(GXutil.nullDate(), A43SFFechaModificado) ? true : false) ;
      A44SFFrascosIsopo = (short)(0) ;
      n44SFFrascosIsopo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44SFFrascosIsopo), 4, 0));
      n44SFFrascosIsopo = ((0==A44SFFrascosIsopo) ? true : false) ;
      Z32SFIdNet = 0 ;
      Z33SFNombre = "" ;
      Z34SFDireccion = "" ;
      Z35SFAgencia = (short)(0) ;
      Z36SFTelefono = "" ;
      Z37SFEmail = "" ;
      Z38SFFrascosConC = (short)(0) ;
      Z39SFFrascosSinC = (short)(0) ;
      Z167SFFrascosAgua = (short)(0) ;
      Z40SFFrascosSangre = (short)(0) ;
      Z41SFObservaciones = "" ;
      Z42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      Z44SFFrascosIsopo = (short)(0) ;
   }

   public void initAll033( )
   {
      A3SFId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3SFId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3SFId), 18, 0));
      initializeNonKey033( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614564142", true, true);
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
      httpContext.AddJavascriptSource("solicitudfrasco.js", "?202312614564142", false, true);
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
      edtSFId_Internalname = "SFID" ;
      edtSFIdNet_Internalname = "SFIDNET" ;
      edtSFNombre_Internalname = "SFNOMBRE" ;
      edtSFDireccion_Internalname = "SFDIRECCION" ;
      edtSFAgencia_Internalname = "SFAGENCIA" ;
      edtSFTelefono_Internalname = "SFTELEFONO" ;
      edtSFEmail_Internalname = "SFEMAIL" ;
      edtSFFrascosConC_Internalname = "SFFRASCOSCONC" ;
      edtSFFrascosSinC_Internalname = "SFFRASCOSSINC" ;
      edtSFFrascosAgua_Internalname = "SFFRASCOSAGUA" ;
      edtSFFrascosSangre_Internalname = "SFFRASCOSSANGRE" ;
      edtSFObservaciones_Internalname = "SFOBSERVACIONES" ;
      edtSFFechaCreacion_Internalname = "SFFECHACREACION" ;
      edtSFFechaModificado_Internalname = "SFFECHAMODIFICADO" ;
      edtSFFrascosIsopo_Internalname = "SFFRASCOSISOPO" ;
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
      Form.setCaption( "Solicitud Frasco" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtSFFrascosIsopo_Jsonclick = "" ;
      edtSFFrascosIsopo_Enabled = 1 ;
      edtSFFechaModificado_Jsonclick = "" ;
      edtSFFechaModificado_Enabled = 1 ;
      edtSFFechaCreacion_Jsonclick = "" ;
      edtSFFechaCreacion_Enabled = 1 ;
      edtSFObservaciones_Enabled = 1 ;
      edtSFFrascosSangre_Jsonclick = "" ;
      edtSFFrascosSangre_Enabled = 1 ;
      edtSFFrascosAgua_Jsonclick = "" ;
      edtSFFrascosAgua_Enabled = 1 ;
      edtSFFrascosSinC_Jsonclick = "" ;
      edtSFFrascosSinC_Enabled = 1 ;
      edtSFFrascosConC_Jsonclick = "" ;
      edtSFFrascosConC_Enabled = 1 ;
      edtSFEmail_Jsonclick = "" ;
      edtSFEmail_Enabled = 1 ;
      edtSFTelefono_Jsonclick = "" ;
      edtSFTelefono_Enabled = 1 ;
      edtSFAgencia_Jsonclick = "" ;
      edtSFAgencia_Enabled = 1 ;
      edtSFDireccion_Jsonclick = "" ;
      edtSFDireccion_Enabled = 1 ;
      edtSFNombre_Jsonclick = "" ;
      edtSFNombre_Enabled = 1 ;
      edtSFIdNet_Jsonclick = "" ;
      edtSFIdNet_Enabled = 1 ;
      edtSFId_Jsonclick = "" ;
      edtSFId_Enabled = 1 ;
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
      GX_FocusControl = edtSFIdNet_Internalname ;
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

   public void valid_Sfid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A32SFIdNet", GXutil.ltrim( localUtil.ntoc( A32SFIdNet, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A33SFNombre", A33SFNombre);
      httpContext.ajax_rsp_assign_attri("", false, "A34SFDireccion", A34SFDireccion);
      httpContext.ajax_rsp_assign_attri("", false, "A35SFAgencia", GXutil.ltrim( localUtil.ntoc( A35SFAgencia, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A36SFTelefono", A36SFTelefono);
      httpContext.ajax_rsp_assign_attri("", false, "A37SFEmail", A37SFEmail);
      httpContext.ajax_rsp_assign_attri("", false, "A38SFFrascosConC", GXutil.ltrim( localUtil.ntoc( A38SFFrascosConC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A39SFFrascosSinC", GXutil.ltrim( localUtil.ntoc( A39SFFrascosSinC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A167SFFrascosAgua", GXutil.ltrim( localUtil.ntoc( A167SFFrascosAgua, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A40SFFrascosSangre", GXutil.ltrim( localUtil.ntoc( A40SFFrascosSangre, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A41SFObservaciones", A41SFObservaciones);
      httpContext.ajax_rsp_assign_attri("", false, "A42SFFechaCreacion", localUtil.ttoc( A42SFFechaCreacion, 10, 8, 1, 2, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A43SFFechaModificado", localUtil.ttoc( A43SFFechaModificado, 10, 8, 1, 2, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A44SFFrascosIsopo", GXutil.ltrim( localUtil.ntoc( A44SFFrascosIsopo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z3SFId", GXutil.ltrim( localUtil.ntoc( Z3SFId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z32SFIdNet", GXutil.ltrim( localUtil.ntoc( Z32SFIdNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z33SFNombre", Z33SFNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z34SFDireccion", Z34SFDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z35SFAgencia", GXutil.ltrim( localUtil.ntoc( Z35SFAgencia, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z36SFTelefono", Z36SFTelefono);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z37SFEmail", Z37SFEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z38SFFrascosConC", GXutil.ltrim( localUtil.ntoc( Z38SFFrascosConC, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z39SFFrascosSinC", GXutil.ltrim( localUtil.ntoc( Z39SFFrascosSinC, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z167SFFrascosAgua", GXutil.ltrim( localUtil.ntoc( Z167SFFrascosAgua, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z40SFFrascosSangre", GXutil.ltrim( localUtil.ntoc( Z40SFFrascosSangre, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z41SFObservaciones", Z41SFObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z42SFFechaCreacion", localUtil.ttoc( Z42SFFechaCreacion, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z43SFFechaModificado", localUtil.ttoc( Z43SFFechaModificado, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z44SFFrascosIsopo", GXutil.ltrim( localUtil.ntoc( Z44SFFrascosIsopo, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_SFID","{handler:'valid_Sfid',iparms:[{av:'A3SFId',fld:'SFID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SFID",",oparms:[{av:'A32SFIdNet',fld:'SFIDNET',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A33SFNombre',fld:'SFNOMBRE',pic:''},{av:'A34SFDireccion',fld:'SFDIRECCION',pic:''},{av:'A35SFAgencia',fld:'SFAGENCIA',pic:'ZZZ9'},{av:'A36SFTelefono',fld:'SFTELEFONO',pic:''},{av:'A37SFEmail',fld:'SFEMAIL',pic:''},{av:'A38SFFrascosConC',fld:'SFFRASCOSCONC',pic:'ZZZ9'},{av:'A39SFFrascosSinC',fld:'SFFRASCOSSINC',pic:'ZZZ9'},{av:'A167SFFrascosAgua',fld:'SFFRASCOSAGUA',pic:'ZZZ9'},{av:'A40SFFrascosSangre',fld:'SFFRASCOSSANGRE',pic:'ZZZ9'},{av:'A41SFObservaciones',fld:'SFOBSERVACIONES',pic:''},{av:'A42SFFechaCreacion',fld:'SFFECHACREACION',pic:'99/99/99 99:99'},{av:'A43SFFechaModificado',fld:'SFFECHAMODIFICADO',pic:'99/99/99 99:99'},{av:'A44SFFrascosIsopo',fld:'SFFRASCOSISOPO',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z3SFId'},{av:'Z32SFIdNet'},{av:'Z33SFNombre'},{av:'Z34SFDireccion'},{av:'Z35SFAgencia'},{av:'Z36SFTelefono'},{av:'Z37SFEmail'},{av:'Z38SFFrascosConC'},{av:'Z39SFFrascosSinC'},{av:'Z167SFFrascosAgua'},{av:'Z40SFFrascosSangre'},{av:'Z41SFObservaciones'},{av:'Z42SFFechaCreacion'},{av:'Z43SFFechaModificado'},{av:'Z44SFFrascosIsopo'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_SFFECHACREACION","{handler:'valid_Sffechacreacion',iparms:[]");
      setEventMetadata("VALID_SFFECHACREACION",",oparms:[]}");
      setEventMetadata("VALID_SFFECHAMODIFICADO","{handler:'valid_Sffechamodificado',iparms:[]");
      setEventMetadata("VALID_SFFECHAMODIFICADO",",oparms:[]}");
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
      Z33SFNombre = "" ;
      Z34SFDireccion = "" ;
      Z36SFTelefono = "" ;
      Z37SFEmail = "" ;
      Z41SFObservaciones = "" ;
      Z42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
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
      A33SFNombre = "" ;
      A34SFDireccion = "" ;
      A36SFTelefono = "" ;
      A37SFEmail = "" ;
      A41SFObservaciones = "" ;
      A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
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
      T00034_A3SFId = new long[1] ;
      T00034_A32SFIdNet = new long[1] ;
      T00034_n32SFIdNet = new boolean[] {false} ;
      T00034_A33SFNombre = new String[] {""} ;
      T00034_n33SFNombre = new boolean[] {false} ;
      T00034_A34SFDireccion = new String[] {""} ;
      T00034_n34SFDireccion = new boolean[] {false} ;
      T00034_A35SFAgencia = new short[1] ;
      T00034_n35SFAgencia = new boolean[] {false} ;
      T00034_A36SFTelefono = new String[] {""} ;
      T00034_n36SFTelefono = new boolean[] {false} ;
      T00034_A37SFEmail = new String[] {""} ;
      T00034_n37SFEmail = new boolean[] {false} ;
      T00034_A38SFFrascosConC = new short[1] ;
      T00034_n38SFFrascosConC = new boolean[] {false} ;
      T00034_A39SFFrascosSinC = new short[1] ;
      T00034_n39SFFrascosSinC = new boolean[] {false} ;
      T00034_A167SFFrascosAgua = new short[1] ;
      T00034_n167SFFrascosAgua = new boolean[] {false} ;
      T00034_A40SFFrascosSangre = new short[1] ;
      T00034_n40SFFrascosSangre = new boolean[] {false} ;
      T00034_A41SFObservaciones = new String[] {""} ;
      T00034_n41SFObservaciones = new boolean[] {false} ;
      T00034_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00034_n42SFFechaCreacion = new boolean[] {false} ;
      T00034_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      T00034_n43SFFechaModificado = new boolean[] {false} ;
      T00034_A44SFFrascosIsopo = new short[1] ;
      T00034_n44SFFrascosIsopo = new boolean[] {false} ;
      T00035_A3SFId = new long[1] ;
      T00033_A3SFId = new long[1] ;
      T00033_A32SFIdNet = new long[1] ;
      T00033_n32SFIdNet = new boolean[] {false} ;
      T00033_A33SFNombre = new String[] {""} ;
      T00033_n33SFNombre = new boolean[] {false} ;
      T00033_A34SFDireccion = new String[] {""} ;
      T00033_n34SFDireccion = new boolean[] {false} ;
      T00033_A35SFAgencia = new short[1] ;
      T00033_n35SFAgencia = new boolean[] {false} ;
      T00033_A36SFTelefono = new String[] {""} ;
      T00033_n36SFTelefono = new boolean[] {false} ;
      T00033_A37SFEmail = new String[] {""} ;
      T00033_n37SFEmail = new boolean[] {false} ;
      T00033_A38SFFrascosConC = new short[1] ;
      T00033_n38SFFrascosConC = new boolean[] {false} ;
      T00033_A39SFFrascosSinC = new short[1] ;
      T00033_n39SFFrascosSinC = new boolean[] {false} ;
      T00033_A167SFFrascosAgua = new short[1] ;
      T00033_n167SFFrascosAgua = new boolean[] {false} ;
      T00033_A40SFFrascosSangre = new short[1] ;
      T00033_n40SFFrascosSangre = new boolean[] {false} ;
      T00033_A41SFObservaciones = new String[] {""} ;
      T00033_n41SFObservaciones = new boolean[] {false} ;
      T00033_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_n42SFFechaCreacion = new boolean[] {false} ;
      T00033_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_n43SFFechaModificado = new boolean[] {false} ;
      T00033_A44SFFrascosIsopo = new short[1] ;
      T00033_n44SFFrascosIsopo = new boolean[] {false} ;
      sMode3 = "" ;
      T00036_A3SFId = new long[1] ;
      T00037_A3SFId = new long[1] ;
      T00032_A3SFId = new long[1] ;
      T00032_A32SFIdNet = new long[1] ;
      T00032_n32SFIdNet = new boolean[] {false} ;
      T00032_A33SFNombre = new String[] {""} ;
      T00032_n33SFNombre = new boolean[] {false} ;
      T00032_A34SFDireccion = new String[] {""} ;
      T00032_n34SFDireccion = new boolean[] {false} ;
      T00032_A35SFAgencia = new short[1] ;
      T00032_n35SFAgencia = new boolean[] {false} ;
      T00032_A36SFTelefono = new String[] {""} ;
      T00032_n36SFTelefono = new boolean[] {false} ;
      T00032_A37SFEmail = new String[] {""} ;
      T00032_n37SFEmail = new boolean[] {false} ;
      T00032_A38SFFrascosConC = new short[1] ;
      T00032_n38SFFrascosConC = new boolean[] {false} ;
      T00032_A39SFFrascosSinC = new short[1] ;
      T00032_n39SFFrascosSinC = new boolean[] {false} ;
      T00032_A167SFFrascosAgua = new short[1] ;
      T00032_n167SFFrascosAgua = new boolean[] {false} ;
      T00032_A40SFFrascosSangre = new short[1] ;
      T00032_n40SFFrascosSangre = new boolean[] {false} ;
      T00032_A41SFObservaciones = new String[] {""} ;
      T00032_n41SFObservaciones = new boolean[] {false} ;
      T00032_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_n42SFFechaCreacion = new boolean[] {false} ;
      T00032_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_n43SFFechaModificado = new boolean[] {false} ;
      T00032_A44SFFrascosIsopo = new short[1] ;
      T00032_n44SFFrascosIsopo = new boolean[] {false} ;
      T000311_A3SFId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ33SFNombre = "" ;
      ZZ34SFDireccion = "" ;
      ZZ36SFTelefono = "" ;
      ZZ37SFEmail = "" ;
      ZZ41SFObservaciones = "" ;
      ZZ42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      ZZ43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.solicitudfrasco__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.solicitudfrasco__default(),
         new Object[] {
             new Object[] {
            T00032_A3SFId, T00032_A32SFIdNet, T00032_n32SFIdNet, T00032_A33SFNombre, T00032_n33SFNombre, T00032_A34SFDireccion, T00032_n34SFDireccion, T00032_A35SFAgencia, T00032_n35SFAgencia, T00032_A36SFTelefono,
            T00032_n36SFTelefono, T00032_A37SFEmail, T00032_n37SFEmail, T00032_A38SFFrascosConC, T00032_n38SFFrascosConC, T00032_A39SFFrascosSinC, T00032_n39SFFrascosSinC, T00032_A167SFFrascosAgua, T00032_n167SFFrascosAgua, T00032_A40SFFrascosSangre,
            T00032_n40SFFrascosSangre, T00032_A41SFObservaciones, T00032_n41SFObservaciones, T00032_A42SFFechaCreacion, T00032_n42SFFechaCreacion, T00032_A43SFFechaModificado, T00032_n43SFFechaModificado, T00032_A44SFFrascosIsopo, T00032_n44SFFrascosIsopo
            }
            , new Object[] {
            T00033_A3SFId, T00033_A32SFIdNet, T00033_n32SFIdNet, T00033_A33SFNombre, T00033_n33SFNombre, T00033_A34SFDireccion, T00033_n34SFDireccion, T00033_A35SFAgencia, T00033_n35SFAgencia, T00033_A36SFTelefono,
            T00033_n36SFTelefono, T00033_A37SFEmail, T00033_n37SFEmail, T00033_A38SFFrascosConC, T00033_n38SFFrascosConC, T00033_A39SFFrascosSinC, T00033_n39SFFrascosSinC, T00033_A167SFFrascosAgua, T00033_n167SFFrascosAgua, T00033_A40SFFrascosSangre,
            T00033_n40SFFrascosSangre, T00033_A41SFObservaciones, T00033_n41SFObservaciones, T00033_A42SFFechaCreacion, T00033_n42SFFechaCreacion, T00033_A43SFFechaModificado, T00033_n43SFFechaModificado, T00033_A44SFFrascosIsopo, T00033_n44SFFrascosIsopo
            }
            , new Object[] {
            T00034_A3SFId, T00034_A32SFIdNet, T00034_n32SFIdNet, T00034_A33SFNombre, T00034_n33SFNombre, T00034_A34SFDireccion, T00034_n34SFDireccion, T00034_A35SFAgencia, T00034_n35SFAgencia, T00034_A36SFTelefono,
            T00034_n36SFTelefono, T00034_A37SFEmail, T00034_n37SFEmail, T00034_A38SFFrascosConC, T00034_n38SFFrascosConC, T00034_A39SFFrascosSinC, T00034_n39SFFrascosSinC, T00034_A167SFFrascosAgua, T00034_n167SFFrascosAgua, T00034_A40SFFrascosSangre,
            T00034_n40SFFrascosSangre, T00034_A41SFObservaciones, T00034_n41SFObservaciones, T00034_A42SFFechaCreacion, T00034_n42SFFechaCreacion, T00034_A43SFFechaModificado, T00034_n43SFFechaModificado, T00034_A44SFFrascosIsopo, T00034_n44SFFrascosIsopo
            }
            , new Object[] {
            T00035_A3SFId
            }
            , new Object[] {
            T00036_A3SFId
            }
            , new Object[] {
            T00037_A3SFId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000311_A3SFId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z35SFAgencia ;
   private short Z38SFFrascosConC ;
   private short Z39SFFrascosSinC ;
   private short Z167SFFrascosAgua ;
   private short Z40SFFrascosSangre ;
   private short Z44SFFrascosIsopo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A35SFAgencia ;
   private short A38SFFrascosConC ;
   private short A39SFFrascosSinC ;
   private short A167SFFrascosAgua ;
   private short A40SFFrascosSangre ;
   private short A44SFFrascosIsopo ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short ZZ35SFAgencia ;
   private short ZZ38SFFrascosConC ;
   private short ZZ39SFFrascosSinC ;
   private short ZZ167SFFrascosAgua ;
   private short ZZ40SFFrascosSangre ;
   private short ZZ44SFFrascosIsopo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtSFId_Enabled ;
   private int edtSFIdNet_Enabled ;
   private int edtSFNombre_Enabled ;
   private int edtSFDireccion_Enabled ;
   private int edtSFAgencia_Enabled ;
   private int edtSFTelefono_Enabled ;
   private int edtSFEmail_Enabled ;
   private int edtSFFrascosConC_Enabled ;
   private int edtSFFrascosSinC_Enabled ;
   private int edtSFFrascosAgua_Enabled ;
   private int edtSFFrascosSangre_Enabled ;
   private int edtSFObservaciones_Enabled ;
   private int edtSFFechaCreacion_Enabled ;
   private int edtSFFechaModificado_Enabled ;
   private int edtSFFrascosIsopo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z3SFId ;
   private long Z32SFIdNet ;
   private long A3SFId ;
   private long A32SFIdNet ;
   private long ZZ3SFId ;
   private long ZZ32SFIdNet ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSFId_Internalname ;
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
   private String edtSFId_Jsonclick ;
   private String edtSFIdNet_Internalname ;
   private String edtSFIdNet_Jsonclick ;
   private String edtSFNombre_Internalname ;
   private String edtSFNombre_Jsonclick ;
   private String edtSFDireccion_Internalname ;
   private String edtSFDireccion_Jsonclick ;
   private String edtSFAgencia_Internalname ;
   private String edtSFAgencia_Jsonclick ;
   private String edtSFTelefono_Internalname ;
   private String edtSFTelefono_Jsonclick ;
   private String edtSFEmail_Internalname ;
   private String edtSFEmail_Jsonclick ;
   private String edtSFFrascosConC_Internalname ;
   private String edtSFFrascosConC_Jsonclick ;
   private String edtSFFrascosSinC_Internalname ;
   private String edtSFFrascosSinC_Jsonclick ;
   private String edtSFFrascosAgua_Internalname ;
   private String edtSFFrascosAgua_Jsonclick ;
   private String edtSFFrascosSangre_Internalname ;
   private String edtSFFrascosSangre_Jsonclick ;
   private String edtSFObservaciones_Internalname ;
   private String edtSFFechaCreacion_Internalname ;
   private String edtSFFechaCreacion_Jsonclick ;
   private String edtSFFechaModificado_Internalname ;
   private String edtSFFechaModificado_Jsonclick ;
   private String edtSFFrascosIsopo_Internalname ;
   private String edtSFFrascosIsopo_Jsonclick ;
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
   private String sMode3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z42SFFechaCreacion ;
   private java.util.Date Z43SFFechaModificado ;
   private java.util.Date A42SFFechaCreacion ;
   private java.util.Date A43SFFechaModificado ;
   private java.util.Date ZZ42SFFechaCreacion ;
   private java.util.Date ZZ43SFFechaModificado ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n32SFIdNet ;
   private boolean n33SFNombre ;
   private boolean n34SFDireccion ;
   private boolean n35SFAgencia ;
   private boolean n36SFTelefono ;
   private boolean n37SFEmail ;
   private boolean n38SFFrascosConC ;
   private boolean n39SFFrascosSinC ;
   private boolean n167SFFrascosAgua ;
   private boolean n40SFFrascosSangre ;
   private boolean n41SFObservaciones ;
   private boolean n42SFFechaCreacion ;
   private boolean n43SFFechaModificado ;
   private boolean n44SFFrascosIsopo ;
   private boolean Gx_longc ;
   private String Z33SFNombre ;
   private String Z34SFDireccion ;
   private String Z36SFTelefono ;
   private String Z37SFEmail ;
   private String Z41SFObservaciones ;
   private String A33SFNombre ;
   private String A34SFDireccion ;
   private String A36SFTelefono ;
   private String A37SFEmail ;
   private String A41SFObservaciones ;
   private String ZZ33SFNombre ;
   private String ZZ34SFDireccion ;
   private String ZZ36SFTelefono ;
   private String ZZ37SFEmail ;
   private String ZZ41SFObservaciones ;
   private IDataStoreProvider pr_default ;
   private long[] T00034_A3SFId ;
   private long[] T00034_A32SFIdNet ;
   private boolean[] T00034_n32SFIdNet ;
   private String[] T00034_A33SFNombre ;
   private boolean[] T00034_n33SFNombre ;
   private String[] T00034_A34SFDireccion ;
   private boolean[] T00034_n34SFDireccion ;
   private short[] T00034_A35SFAgencia ;
   private boolean[] T00034_n35SFAgencia ;
   private String[] T00034_A36SFTelefono ;
   private boolean[] T00034_n36SFTelefono ;
   private String[] T00034_A37SFEmail ;
   private boolean[] T00034_n37SFEmail ;
   private short[] T00034_A38SFFrascosConC ;
   private boolean[] T00034_n38SFFrascosConC ;
   private short[] T00034_A39SFFrascosSinC ;
   private boolean[] T00034_n39SFFrascosSinC ;
   private short[] T00034_A167SFFrascosAgua ;
   private boolean[] T00034_n167SFFrascosAgua ;
   private short[] T00034_A40SFFrascosSangre ;
   private boolean[] T00034_n40SFFrascosSangre ;
   private String[] T00034_A41SFObservaciones ;
   private boolean[] T00034_n41SFObservaciones ;
   private java.util.Date[] T00034_A42SFFechaCreacion ;
   private boolean[] T00034_n42SFFechaCreacion ;
   private java.util.Date[] T00034_A43SFFechaModificado ;
   private boolean[] T00034_n43SFFechaModificado ;
   private short[] T00034_A44SFFrascosIsopo ;
   private boolean[] T00034_n44SFFrascosIsopo ;
   private long[] T00035_A3SFId ;
   private long[] T00033_A3SFId ;
   private long[] T00033_A32SFIdNet ;
   private boolean[] T00033_n32SFIdNet ;
   private String[] T00033_A33SFNombre ;
   private boolean[] T00033_n33SFNombre ;
   private String[] T00033_A34SFDireccion ;
   private boolean[] T00033_n34SFDireccion ;
   private short[] T00033_A35SFAgencia ;
   private boolean[] T00033_n35SFAgencia ;
   private String[] T00033_A36SFTelefono ;
   private boolean[] T00033_n36SFTelefono ;
   private String[] T00033_A37SFEmail ;
   private boolean[] T00033_n37SFEmail ;
   private short[] T00033_A38SFFrascosConC ;
   private boolean[] T00033_n38SFFrascosConC ;
   private short[] T00033_A39SFFrascosSinC ;
   private boolean[] T00033_n39SFFrascosSinC ;
   private short[] T00033_A167SFFrascosAgua ;
   private boolean[] T00033_n167SFFrascosAgua ;
   private short[] T00033_A40SFFrascosSangre ;
   private boolean[] T00033_n40SFFrascosSangre ;
   private String[] T00033_A41SFObservaciones ;
   private boolean[] T00033_n41SFObservaciones ;
   private java.util.Date[] T00033_A42SFFechaCreacion ;
   private boolean[] T00033_n42SFFechaCreacion ;
   private java.util.Date[] T00033_A43SFFechaModificado ;
   private boolean[] T00033_n43SFFechaModificado ;
   private short[] T00033_A44SFFrascosIsopo ;
   private boolean[] T00033_n44SFFrascosIsopo ;
   private long[] T00036_A3SFId ;
   private long[] T00037_A3SFId ;
   private long[] T00032_A3SFId ;
   private long[] T00032_A32SFIdNet ;
   private boolean[] T00032_n32SFIdNet ;
   private String[] T00032_A33SFNombre ;
   private boolean[] T00032_n33SFNombre ;
   private String[] T00032_A34SFDireccion ;
   private boolean[] T00032_n34SFDireccion ;
   private short[] T00032_A35SFAgencia ;
   private boolean[] T00032_n35SFAgencia ;
   private String[] T00032_A36SFTelefono ;
   private boolean[] T00032_n36SFTelefono ;
   private String[] T00032_A37SFEmail ;
   private boolean[] T00032_n37SFEmail ;
   private short[] T00032_A38SFFrascosConC ;
   private boolean[] T00032_n38SFFrascosConC ;
   private short[] T00032_A39SFFrascosSinC ;
   private boolean[] T00032_n39SFFrascosSinC ;
   private short[] T00032_A167SFFrascosAgua ;
   private boolean[] T00032_n167SFFrascosAgua ;
   private short[] T00032_A40SFFrascosSangre ;
   private boolean[] T00032_n40SFFrascosSangre ;
   private String[] T00032_A41SFObservaciones ;
   private boolean[] T00032_n41SFObservaciones ;
   private java.util.Date[] T00032_A42SFFechaCreacion ;
   private boolean[] T00032_n42SFFechaCreacion ;
   private java.util.Date[] T00032_A43SFFechaModificado ;
   private boolean[] T00032_n43SFFechaModificado ;
   private short[] T00032_A44SFFrascosIsopo ;
   private boolean[] T00032_n44SFFrascosIsopo ;
   private long[] T000311_A3SFId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class solicitudfrasco__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class solicitudfrasco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00032", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00033", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00034", "SELECT TM1.`SFId`, TM1.`SFIdNet`, TM1.`SFNombre`, TM1.`SFDireccion`, TM1.`SFAgencia`, TM1.`SFTelefono`, TM1.`SFEmail`, TM1.`SFFrascosConC`, TM1.`SFFrascosSinC`, TM1.`SFFrascosAgua`, TM1.`SFFrascosSangre`, TM1.`SFObservaciones`, TM1.`SFFechaCreacion`, TM1.`SFFechaModificado`, TM1.`SFFrascosIsopo` FROM `SolicitudFrasco` TM1 WHERE TM1.`SFId` = ? ORDER BY TM1.`SFId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00035", "SELECT `SFId` FROM `SolicitudFrasco` WHERE `SFId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00036", "SELECT `SFId` FROM `SolicitudFrasco` WHERE ( `SFId` > ?) ORDER BY `SFId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00037", "SELECT `SFId` FROM `SolicitudFrasco` WHERE ( `SFId` < ?) ORDER BY `SFId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00038", "INSERT INTO `SolicitudFrasco`(`SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00039", "UPDATE `SolicitudFrasco` SET `SFIdNet`=?, `SFNombre`=?, `SFDireccion`=?, `SFAgencia`=?, `SFTelefono`=?, `SFEmail`=?, `SFFrascosConC`=?, `SFFrascosSinC`=?, `SFFrascosAgua`=?, `SFFrascosSangre`=?, `SFObservaciones`=?, `SFFechaCreacion`=?, `SFFechaModificado`=?, `SFFrascosIsopo`=?  WHERE `SFId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000310", "DELETE FROM `SolicitudFrasco`  WHERE `SFId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000311", "SELECT `SFId` FROM `SolicitudFrasco` ORDER BY `SFId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 50);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
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
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 200);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setLong(15, ((Number) parms[28]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

