package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class notificaciones_impl extends GXDataArea
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
            AV7NotificacionesId = GXutil.lval( httpContext.GetPar( "NotificacionesId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7NotificacionesId), 18, 0));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOTIFICACIONESID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7NotificacionesId), "ZZZZZZZZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Notificaciones", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtNotificacionesId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public notificaciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public notificaciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( notificaciones_impl.class ));
   }

   public notificaciones_impl( int remoteHandle ,
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Notificaciones", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Notificaciones.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Notificaciones.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtNotificacionesId_Internalname, GXutil.ltrim( localUtil.ntoc( A6NotificacionesId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6NotificacionesId), "ZZZZZZZZZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNotificacionesId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNotificacionesId_Enabled, 1, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesFecha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesFecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtNotificacionesFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtNotificacionesFecha_Internalname, localUtil.ttoc( A169NotificacionesFecha, 10, 8, 1, 2, "/", ":", " "), localUtil.format( A169NotificacionesFecha, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNotificacionesFecha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNotificacionesFecha_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtNotificacionesFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNotificacionesFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Notificaciones.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesTipo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesTipo_Internalname, "Tipo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtNotificacionesTipo_Internalname, A170NotificacionesTipo, GXutil.rtrim( localUtil.format( A170NotificacionesTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNotificacionesTipo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNotificacionesTipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesMensaje_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesMensaje_Internalname, "Mensaje", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtNotificacionesMensaje_Internalname, A171NotificacionesMensaje, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtNotificacionesMensaje_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesIdNetUsuario_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesIdNetUsuario_Internalname, "Net Usuario", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtNotificacionesIdNetUsuario_Internalname, GXutil.ltrim( localUtil.ntoc( A172NotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtNotificacionesIdNetUsuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNotificacionesIdNetUsuario_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNotificacionesIdNetUsuario_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNotificacionesDetalle_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtNotificacionesDetalle_Internalname, "Detalle", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtNotificacionesDetalle_Internalname, A173NotificacionesDetalle, GXutil.rtrim( localUtil.format( A173NotificacionesDetalle, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNotificacionesDetalle_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNotificacionesDetalle_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Notificaciones.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Notificaciones.htm");
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
      e11062 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z6NotificacionesId = localUtil.ctol( httpContext.cgiGet( "Z6NotificacionesId"), ".", ",") ;
            Z169NotificacionesFecha = localUtil.ctot( httpContext.cgiGet( "Z169NotificacionesFecha"), 0) ;
            n169NotificacionesFecha = (GXutil.dateCompare(GXutil.nullDate(), A169NotificacionesFecha) ? true : false) ;
            Z170NotificacionesTipo = httpContext.cgiGet( "Z170NotificacionesTipo") ;
            n170NotificacionesTipo = ((GXutil.strcmp("", A170NotificacionesTipo)==0) ? true : false) ;
            Z171NotificacionesMensaje = httpContext.cgiGet( "Z171NotificacionesMensaje") ;
            n171NotificacionesMensaje = ((GXutil.strcmp("", A171NotificacionesMensaje)==0) ? true : false) ;
            Z172NotificacionesIdNetUsuario = localUtil.ctol( httpContext.cgiGet( "Z172NotificacionesIdNetUsuario"), ".", ",") ;
            n172NotificacionesIdNetUsuario = ((0==A172NotificacionesIdNetUsuario) ? true : false) ;
            Z173NotificacionesDetalle = httpContext.cgiGet( "Z173NotificacionesDetalle") ;
            n173NotificacionesDetalle = ((GXutil.strcmp("", A173NotificacionesDetalle)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7NotificacionesId = localUtil.ctol( httpContext.cgiGet( "vNOTIFICACIONESID"), ".", ",") ;
            AV11Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNotificacionesId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNotificacionesId_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOTIFICACIONESID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNotificacionesId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6NotificacionesId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
            }
            else
            {
               A6NotificacionesId = localUtil.ctol( httpContext.cgiGet( edtNotificacionesId_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtNotificacionesFecha_Internalname), (byte)(2), (byte)(1)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "NOTIFICACIONESFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNotificacionesFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
               n169NotificacionesFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A169NotificacionesFecha", localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
            }
            else
            {
               A169NotificacionesFecha = localUtil.ctot( httpContext.cgiGet( edtNotificacionesFecha_Internalname)) ;
               n169NotificacionesFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A169NotificacionesFecha", localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
            }
            n169NotificacionesFecha = (GXutil.dateCompare(GXutil.nullDate(), A169NotificacionesFecha) ? true : false) ;
            A170NotificacionesTipo = httpContext.cgiGet( edtNotificacionesTipo_Internalname) ;
            n170NotificacionesTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A170NotificacionesTipo", A170NotificacionesTipo);
            n170NotificacionesTipo = ((GXutil.strcmp("", A170NotificacionesTipo)==0) ? true : false) ;
            A171NotificacionesMensaje = httpContext.cgiGet( edtNotificacionesMensaje_Internalname) ;
            n171NotificacionesMensaje = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A171NotificacionesMensaje", A171NotificacionesMensaje);
            n171NotificacionesMensaje = ((GXutil.strcmp("", A171NotificacionesMensaje)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNotificacionesIdNetUsuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNotificacionesIdNetUsuario_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOTIFICACIONESIDNETUSUARIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNotificacionesIdNetUsuario_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A172NotificacionesIdNetUsuario = 0 ;
               n172NotificacionesIdNetUsuario = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A172NotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), 18, 0));
            }
            else
            {
               A172NotificacionesIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtNotificacionesIdNetUsuario_Internalname), ".", ",") ;
               n172NotificacionesIdNetUsuario = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A172NotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), 18, 0));
            }
            n172NotificacionesIdNetUsuario = ((0==A172NotificacionesIdNetUsuario) ? true : false) ;
            A173NotificacionesDetalle = httpContext.cgiGet( edtNotificacionesDetalle_Internalname) ;
            n173NotificacionesDetalle = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A173NotificacionesDetalle", A173NotificacionesDetalle);
            n173NotificacionesDetalle = ((GXutil.strcmp("", A173NotificacionesDetalle)==0) ? true : false) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Notificaciones");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A6NotificacionesId != Z6NotificacionesId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("notificaciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A6NotificacionesId = GXutil.lval( httpContext.GetPar( "NotificacionesId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode6 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode6 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound6 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_060( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "NOTIFICACIONESID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtNotificacionesId_Internalname ;
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
                        e11062 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12062 ();
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
         e12062 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll066( ) ;
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
         disableAttributes066( ) ;
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

   public void confirm_060( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls066( ) ;
         }
         else
         {
            checkExtendedTable066( ) ;
            closeExtendedTableCursors066( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption060( )
   {
   }

   public void e11062( )
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

   public void e12062( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.colaveco.wwnotificaciones", new String[] {}, new String[] {}) );
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

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z169NotificacionesFecha = T00063_A169NotificacionesFecha[0] ;
            Z170NotificacionesTipo = T00063_A170NotificacionesTipo[0] ;
            Z171NotificacionesMensaje = T00063_A171NotificacionesMensaje[0] ;
            Z172NotificacionesIdNetUsuario = T00063_A172NotificacionesIdNetUsuario[0] ;
            Z173NotificacionesDetalle = T00063_A173NotificacionesDetalle[0] ;
         }
         else
         {
            Z169NotificacionesFecha = A169NotificacionesFecha ;
            Z170NotificacionesTipo = A170NotificacionesTipo ;
            Z171NotificacionesMensaje = A171NotificacionesMensaje ;
            Z172NotificacionesIdNetUsuario = A172NotificacionesIdNetUsuario ;
            Z173NotificacionesDetalle = A173NotificacionesDetalle ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z6NotificacionesId = A6NotificacionesId ;
         Z169NotificacionesFecha = A169NotificacionesFecha ;
         Z170NotificacionesTipo = A170NotificacionesTipo ;
         Z171NotificacionesMensaje = A171NotificacionesMensaje ;
         Z172NotificacionesIdNetUsuario = A172NotificacionesIdNetUsuario ;
         Z173NotificacionesDetalle = A173NotificacionesDetalle ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV7NotificacionesId) )
      {
         A6NotificacionesId = AV7NotificacionesId ;
         httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
      }
      if ( ! (0==AV7NotificacionesId) )
      {
         edtNotificacionesId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesId_Enabled), 5, 0), true);
      }
      else
      {
         edtNotificacionesId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7NotificacionesId) )
      {
         edtNotificacionesId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesId_Enabled), 5, 0), true);
      }
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV11Pgmname = "Notificaciones" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      }
   }

   public void load066( )
   {
      /* Using cursor T00064 */
      pr_default.execute(2, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A169NotificacionesFecha = T00064_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = T00064_n169NotificacionesFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169NotificacionesFecha", localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
         A170NotificacionesTipo = T00064_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = T00064_n170NotificacionesTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170NotificacionesTipo", A170NotificacionesTipo);
         A171NotificacionesMensaje = T00064_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = T00064_n171NotificacionesMensaje[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171NotificacionesMensaje", A171NotificacionesMensaje);
         A172NotificacionesIdNetUsuario = T00064_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = T00064_n172NotificacionesIdNetUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172NotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), 18, 0));
         A173NotificacionesDetalle = T00064_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = T00064_n173NotificacionesDetalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173NotificacionesDetalle", A173NotificacionesDetalle);
         zm066( -5) ;
      }
      pr_default.close(2);
      onLoadActions066( ) ;
   }

   public void onLoadActions066( )
   {
      AV11Pgmname = "Notificaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void checkExtendedTable066( )
   {
      nIsDirty_6 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV11Pgmname = "Notificaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A169NotificacionesFecha) || (( A169NotificacionesFecha.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A169NotificacionesFecha, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field Notificaciones Fecha is out of range", "OutOfRange", 1, "NOTIFICACIONESFECHA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNotificacionesFecha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors066( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey066( )
   {
      /* Using cursor T00065 */
      pr_default.execute(3, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00063 */
      pr_default.execute(1, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm066( 5) ;
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = T00063_A6NotificacionesId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
         A169NotificacionesFecha = T00063_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = T00063_n169NotificacionesFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169NotificacionesFecha", localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
         A170NotificacionesTipo = T00063_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = T00063_n170NotificacionesTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170NotificacionesTipo", A170NotificacionesTipo);
         A171NotificacionesMensaje = T00063_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = T00063_n171NotificacionesMensaje[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171NotificacionesMensaje", A171NotificacionesMensaje);
         A172NotificacionesIdNetUsuario = T00063_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = T00063_n172NotificacionesIdNetUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172NotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), 18, 0));
         A173NotificacionesDetalle = T00063_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = T00063_n173NotificacionesDetalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173NotificacionesDetalle", A173NotificacionesDetalle);
         Z6NotificacionesId = A6NotificacionesId ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load066( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey066( ) ;
         }
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound6 = (short)(0) ;
      /* Using cursor T00066 */
      pr_default.execute(4, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00066_A6NotificacionesId[0] < A6NotificacionesId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00066_A6NotificacionesId[0] > A6NotificacionesId ) ) )
         {
            A6NotificacionesId = T00066_A6NotificacionesId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound6 = (short)(0) ;
      /* Using cursor T00067 */
      pr_default.execute(5, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00067_A6NotificacionesId[0] > A6NotificacionesId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00067_A6NotificacionesId[0] < A6NotificacionesId ) ) )
         {
            A6NotificacionesId = T00067_A6NotificacionesId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey066( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtNotificacionesId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert066( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( A6NotificacionesId != Z6NotificacionesId )
            {
               A6NotificacionesId = Z6NotificacionesId ;
               httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NOTIFICACIONESID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNotificacionesId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNotificacionesId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update066( ) ;
               GX_FocusControl = edtNotificacionesId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A6NotificacionesId != Z6NotificacionesId )
            {
               /* Insert record */
               GX_FocusControl = edtNotificacionesId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert066( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NOTIFICACIONESID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNotificacionesId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtNotificacionesId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert066( ) ;
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
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( A6NotificacionesId != Z6NotificacionesId )
      {
         A6NotificacionesId = Z6NotificacionesId ;
         httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NOTIFICACIONESID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNotificacionesId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNotificacionesId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency066( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00062 */
         pr_default.execute(0, new Object[] {Long.valueOf(A6NotificacionesId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Notificaciones"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z169NotificacionesFecha, T00062_A169NotificacionesFecha[0]) ) || ( GXutil.strcmp(Z170NotificacionesTipo, T00062_A170NotificacionesTipo[0]) != 0 ) || ( GXutil.strcmp(Z171NotificacionesMensaje, T00062_A171NotificacionesMensaje[0]) != 0 ) || ( Z172NotificacionesIdNetUsuario != T00062_A172NotificacionesIdNetUsuario[0] ) || ( GXutil.strcmp(Z173NotificacionesDetalle, T00062_A173NotificacionesDetalle[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z169NotificacionesFecha, T00062_A169NotificacionesFecha[0]) ) )
            {
               GXutil.writeLogln("notificaciones:[seudo value changed for attri]"+"NotificacionesFecha");
               GXutil.writeLogRaw("Old: ",Z169NotificacionesFecha);
               GXutil.writeLogRaw("Current: ",T00062_A169NotificacionesFecha[0]);
            }
            if ( GXutil.strcmp(Z170NotificacionesTipo, T00062_A170NotificacionesTipo[0]) != 0 )
            {
               GXutil.writeLogln("notificaciones:[seudo value changed for attri]"+"NotificacionesTipo");
               GXutil.writeLogRaw("Old: ",Z170NotificacionesTipo);
               GXutil.writeLogRaw("Current: ",T00062_A170NotificacionesTipo[0]);
            }
            if ( GXutil.strcmp(Z171NotificacionesMensaje, T00062_A171NotificacionesMensaje[0]) != 0 )
            {
               GXutil.writeLogln("notificaciones:[seudo value changed for attri]"+"NotificacionesMensaje");
               GXutil.writeLogRaw("Old: ",Z171NotificacionesMensaje);
               GXutil.writeLogRaw("Current: ",T00062_A171NotificacionesMensaje[0]);
            }
            if ( Z172NotificacionesIdNetUsuario != T00062_A172NotificacionesIdNetUsuario[0] )
            {
               GXutil.writeLogln("notificaciones:[seudo value changed for attri]"+"NotificacionesIdNetUsuario");
               GXutil.writeLogRaw("Old: ",Z172NotificacionesIdNetUsuario);
               GXutil.writeLogRaw("Current: ",T00062_A172NotificacionesIdNetUsuario[0]);
            }
            if ( GXutil.strcmp(Z173NotificacionesDetalle, T00062_A173NotificacionesDetalle[0]) != 0 )
            {
               GXutil.writeLogln("notificaciones:[seudo value changed for attri]"+"NotificacionesDetalle");
               GXutil.writeLogRaw("Old: ",Z173NotificacionesDetalle);
               GXutil.writeLogRaw("Current: ",T00062_A173NotificacionesDetalle[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Notificaciones"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         zm066( 0) ;
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00068 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A6NotificacionesId), Boolean.valueOf(n169NotificacionesFecha), A169NotificacionesFecha, Boolean.valueOf(n170NotificacionesTipo), A170NotificacionesTipo, Boolean.valueOf(n171NotificacionesMensaje), A171NotificacionesMensaje, Boolean.valueOf(n172NotificacionesIdNetUsuario), Long.valueOf(A172NotificacionesIdNetUsuario), Boolean.valueOf(n173NotificacionesDetalle), A173NotificacionesDetalle});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
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
                        resetCaption060( ) ;
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
            load066( ) ;
         }
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void update066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00069 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n169NotificacionesFecha), A169NotificacionesFecha, Boolean.valueOf(n170NotificacionesTipo), A170NotificacionesTipo, Boolean.valueOf(n171NotificacionesMensaje), A171NotificacionesMensaje, Boolean.valueOf(n172NotificacionesIdNetUsuario), Long.valueOf(A172NotificacionesIdNetUsuario), Boolean.valueOf(n173NotificacionesDetalle), A173NotificacionesDetalle, Long.valueOf(A6NotificacionesId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Notificaciones"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate066( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
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
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void deferredUpdate066( )
   {
   }

   public void delete( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls066( ) ;
         afterConfirm066( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete066( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000610 */
               pr_default.execute(8, new Object[] {Long.valueOf(A6NotificacionesId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel066( ) ;
      Gx_mode = sMode6 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV11Pgmname = "Notificaciones" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      }
   }

   public void endLevel066( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "notificaciones");
         if ( AnyError == 0 )
         {
            confirmValues060( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "notificaciones");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart066( )
   {
      /* Scan By routine */
      /* Using cursor T000611 */
      pr_default.execute(9);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = T000611_A6NotificacionesId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext066( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = T000611_A6NotificacionesId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
      }
   }

   public void scanEnd066( )
   {
      pr_default.close(9);
   }

   public void afterConfirm066( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert066( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate066( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete066( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete066( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate066( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes066( )
   {
      edtNotificacionesId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesId_Enabled), 5, 0), true);
      edtNotificacionesFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesFecha_Enabled), 5, 0), true);
      edtNotificacionesTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesTipo_Enabled), 5, 0), true);
      edtNotificacionesMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesMensaje_Enabled), 5, 0), true);
      edtNotificacionesIdNetUsuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesIdNetUsuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesIdNetUsuario_Enabled), 5, 0), true);
      edtNotificacionesDetalle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNotificacionesDetalle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNotificacionesDetalle_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes066( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues060( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614565512", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.notificaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7NotificacionesId,18,0))}, new String[] {"Gx_mode","NotificacionesId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Notificaciones");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("notificaciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z6NotificacionesId", GXutil.ltrim( localUtil.ntoc( Z6NotificacionesId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z169NotificacionesFecha", localUtil.ttoc( Z169NotificacionesFecha, 10, 8, 0, 0, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z170NotificacionesTipo", Z170NotificacionesTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z171NotificacionesMensaje", Z171NotificacionesMensaje);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z172NotificacionesIdNetUsuario", GXutil.ltrim( localUtil.ntoc( Z172NotificacionesIdNetUsuario, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z173NotificacionesDetalle", Z173NotificacionesDetalle);
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vNOTIFICACIONESID", GXutil.ltrim( localUtil.ntoc( AV7NotificacionesId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOTIFICACIONESID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7NotificacionesId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV11Pgmname));
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
      return formatLink("com.colaveco.notificaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7NotificacionesId,18,0))}, new String[] {"Gx_mode","NotificacionesId"})  ;
   }

   public String getPgmname( )
   {
      return "Notificaciones" ;
   }

   public String getPgmdesc( )
   {
      return "Notificaciones" ;
   }

   public void initializeNonKey066( )
   {
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      n169NotificacionesFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A169NotificacionesFecha", localUtil.ttoc( A169NotificacionesFecha, 8, 5, 1, 2, "/", ":", " "));
      n169NotificacionesFecha = (GXutil.dateCompare(GXutil.nullDate(), A169NotificacionesFecha) ? true : false) ;
      A170NotificacionesTipo = "" ;
      n170NotificacionesTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A170NotificacionesTipo", A170NotificacionesTipo);
      n170NotificacionesTipo = ((GXutil.strcmp("", A170NotificacionesTipo)==0) ? true : false) ;
      A171NotificacionesMensaje = "" ;
      n171NotificacionesMensaje = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A171NotificacionesMensaje", A171NotificacionesMensaje);
      n171NotificacionesMensaje = ((GXutil.strcmp("", A171NotificacionesMensaje)==0) ? true : false) ;
      A172NotificacionesIdNetUsuario = 0 ;
      n172NotificacionesIdNetUsuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A172NotificacionesIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A172NotificacionesIdNetUsuario), 18, 0));
      n172NotificacionesIdNetUsuario = ((0==A172NotificacionesIdNetUsuario) ? true : false) ;
      A173NotificacionesDetalle = "" ;
      n173NotificacionesDetalle = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A173NotificacionesDetalle", A173NotificacionesDetalle);
      n173NotificacionesDetalle = ((GXutil.strcmp("", A173NotificacionesDetalle)==0) ? true : false) ;
      Z169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      Z170NotificacionesTipo = "" ;
      Z171NotificacionesMensaje = "" ;
      Z172NotificacionesIdNetUsuario = 0 ;
      Z173NotificacionesDetalle = "" ;
   }

   public void initAll066( )
   {
      A6NotificacionesId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6NotificacionesId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6NotificacionesId), 18, 0));
      initializeNonKey066( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614565538", true, true);
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
      httpContext.AddJavascriptSource("notificaciones.js", "?202312614565539", false, true);
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
      edtNotificacionesId_Internalname = "NOTIFICACIONESID" ;
      edtNotificacionesFecha_Internalname = "NOTIFICACIONESFECHA" ;
      edtNotificacionesTipo_Internalname = "NOTIFICACIONESTIPO" ;
      edtNotificacionesMensaje_Internalname = "NOTIFICACIONESMENSAJE" ;
      edtNotificacionesIdNetUsuario_Internalname = "NOTIFICACIONESIDNETUSUARIO" ;
      edtNotificacionesDetalle_Internalname = "NOTIFICACIONESDETALLE" ;
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
      Form.setCaption( "Notificaciones" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtNotificacionesDetalle_Jsonclick = "" ;
      edtNotificacionesDetalle_Enabled = 1 ;
      edtNotificacionesIdNetUsuario_Jsonclick = "" ;
      edtNotificacionesIdNetUsuario_Enabled = 1 ;
      edtNotificacionesMensaje_Enabled = 1 ;
      edtNotificacionesTipo_Jsonclick = "" ;
      edtNotificacionesTipo_Enabled = 1 ;
      edtNotificacionesFecha_Jsonclick = "" ;
      edtNotificacionesFecha_Enabled = 1 ;
      edtNotificacionesId_Jsonclick = "" ;
      edtNotificacionesId_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7NotificacionesId',fld:'vNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7NotificacionesId',fld:'vNOTIFICACIONESID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12062',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_NOTIFICACIONESID","{handler:'valid_Notificacionesid',iparms:[]");
      setEventMetadata("VALID_NOTIFICACIONESID",",oparms:[]}");
      setEventMetadata("VALID_NOTIFICACIONESFECHA","{handler:'valid_Notificacionesfecha',iparms:[]");
      setEventMetadata("VALID_NOTIFICACIONESFECHA",",oparms:[]}");
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
      Z169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      Z170NotificacionesTipo = "" ;
      Z171NotificacionesMensaje = "" ;
      Z173NotificacionesDetalle = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
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
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      A170NotificacionesTipo = "" ;
      A171NotificacionesMensaje = "" ;
      A173NotificacionesDetalle = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV11Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode6 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T00064_A6NotificacionesId = new long[1] ;
      T00064_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n169NotificacionesFecha = new boolean[] {false} ;
      T00064_A170NotificacionesTipo = new String[] {""} ;
      T00064_n170NotificacionesTipo = new boolean[] {false} ;
      T00064_A171NotificacionesMensaje = new String[] {""} ;
      T00064_n171NotificacionesMensaje = new boolean[] {false} ;
      T00064_A172NotificacionesIdNetUsuario = new long[1] ;
      T00064_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      T00064_A173NotificacionesDetalle = new String[] {""} ;
      T00064_n173NotificacionesDetalle = new boolean[] {false} ;
      T00065_A6NotificacionesId = new long[1] ;
      T00063_A6NotificacionesId = new long[1] ;
      T00063_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n169NotificacionesFecha = new boolean[] {false} ;
      T00063_A170NotificacionesTipo = new String[] {""} ;
      T00063_n170NotificacionesTipo = new boolean[] {false} ;
      T00063_A171NotificacionesMensaje = new String[] {""} ;
      T00063_n171NotificacionesMensaje = new boolean[] {false} ;
      T00063_A172NotificacionesIdNetUsuario = new long[1] ;
      T00063_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      T00063_A173NotificacionesDetalle = new String[] {""} ;
      T00063_n173NotificacionesDetalle = new boolean[] {false} ;
      T00066_A6NotificacionesId = new long[1] ;
      T00067_A6NotificacionesId = new long[1] ;
      T00062_A6NotificacionesId = new long[1] ;
      T00062_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n169NotificacionesFecha = new boolean[] {false} ;
      T00062_A170NotificacionesTipo = new String[] {""} ;
      T00062_n170NotificacionesTipo = new boolean[] {false} ;
      T00062_A171NotificacionesMensaje = new String[] {""} ;
      T00062_n171NotificacionesMensaje = new boolean[] {false} ;
      T00062_A172NotificacionesIdNetUsuario = new long[1] ;
      T00062_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      T00062_A173NotificacionesDetalle = new String[] {""} ;
      T00062_n173NotificacionesDetalle = new boolean[] {false} ;
      T000611_A6NotificacionesId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.notificaciones__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.notificaciones__default(),
         new Object[] {
             new Object[] {
            T00062_A6NotificacionesId, T00062_A169NotificacionesFecha, T00062_n169NotificacionesFecha, T00062_A170NotificacionesTipo, T00062_n170NotificacionesTipo, T00062_A171NotificacionesMensaje, T00062_n171NotificacionesMensaje, T00062_A172NotificacionesIdNetUsuario, T00062_n172NotificacionesIdNetUsuario, T00062_A173NotificacionesDetalle,
            T00062_n173NotificacionesDetalle
            }
            , new Object[] {
            T00063_A6NotificacionesId, T00063_A169NotificacionesFecha, T00063_n169NotificacionesFecha, T00063_A170NotificacionesTipo, T00063_n170NotificacionesTipo, T00063_A171NotificacionesMensaje, T00063_n171NotificacionesMensaje, T00063_A172NotificacionesIdNetUsuario, T00063_n172NotificacionesIdNetUsuario, T00063_A173NotificacionesDetalle,
            T00063_n173NotificacionesDetalle
            }
            , new Object[] {
            T00064_A6NotificacionesId, T00064_A169NotificacionesFecha, T00064_n169NotificacionesFecha, T00064_A170NotificacionesTipo, T00064_n170NotificacionesTipo, T00064_A171NotificacionesMensaje, T00064_n171NotificacionesMensaje, T00064_A172NotificacionesIdNetUsuario, T00064_n172NotificacionesIdNetUsuario, T00064_A173NotificacionesDetalle,
            T00064_n173NotificacionesDetalle
            }
            , new Object[] {
            T00065_A6NotificacionesId
            }
            , new Object[] {
            T00066_A6NotificacionesId
            }
            , new Object[] {
            T00067_A6NotificacionesId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000611_A6NotificacionesId
            }
         }
      );
      AV11Pgmname = "Notificaciones" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound6 ;
   private short nIsDirty_6 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtNotificacionesId_Enabled ;
   private int edtNotificacionesFecha_Enabled ;
   private int edtNotificacionesTipo_Enabled ;
   private int edtNotificacionesMensaje_Enabled ;
   private int edtNotificacionesIdNetUsuario_Enabled ;
   private int edtNotificacionesDetalle_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7NotificacionesId ;
   private long Z6NotificacionesId ;
   private long Z172NotificacionesIdNetUsuario ;
   private long AV7NotificacionesId ;
   private long A6NotificacionesId ;
   private long A172NotificacionesIdNetUsuario ;
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
   private String edtNotificacionesId_Internalname ;
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
   private String edtNotificacionesId_Jsonclick ;
   private String edtNotificacionesFecha_Internalname ;
   private String edtNotificacionesFecha_Jsonclick ;
   private String edtNotificacionesTipo_Internalname ;
   private String edtNotificacionesTipo_Jsonclick ;
   private String edtNotificacionesMensaje_Internalname ;
   private String edtNotificacionesIdNetUsuario_Internalname ;
   private String edtNotificacionesIdNetUsuario_Jsonclick ;
   private String edtNotificacionesDetalle_Internalname ;
   private String edtNotificacionesDetalle_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV11Pgmname ;
   private String hsh ;
   private String sMode6 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z169NotificacionesFecha ;
   private java.util.Date A169NotificacionesFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n171NotificacionesMensaje ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean n173NotificacionesDetalle ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String Z170NotificacionesTipo ;
   private String Z171NotificacionesMensaje ;
   private String Z173NotificacionesDetalle ;
   private String A170NotificacionesTipo ;
   private String A171NotificacionesMensaje ;
   private String A173NotificacionesDetalle ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T00064_A6NotificacionesId ;
   private java.util.Date[] T00064_A169NotificacionesFecha ;
   private boolean[] T00064_n169NotificacionesFecha ;
   private String[] T00064_A170NotificacionesTipo ;
   private boolean[] T00064_n170NotificacionesTipo ;
   private String[] T00064_A171NotificacionesMensaje ;
   private boolean[] T00064_n171NotificacionesMensaje ;
   private long[] T00064_A172NotificacionesIdNetUsuario ;
   private boolean[] T00064_n172NotificacionesIdNetUsuario ;
   private String[] T00064_A173NotificacionesDetalle ;
   private boolean[] T00064_n173NotificacionesDetalle ;
   private long[] T00065_A6NotificacionesId ;
   private long[] T00063_A6NotificacionesId ;
   private java.util.Date[] T00063_A169NotificacionesFecha ;
   private boolean[] T00063_n169NotificacionesFecha ;
   private String[] T00063_A170NotificacionesTipo ;
   private boolean[] T00063_n170NotificacionesTipo ;
   private String[] T00063_A171NotificacionesMensaje ;
   private boolean[] T00063_n171NotificacionesMensaje ;
   private long[] T00063_A172NotificacionesIdNetUsuario ;
   private boolean[] T00063_n172NotificacionesIdNetUsuario ;
   private String[] T00063_A173NotificacionesDetalle ;
   private boolean[] T00063_n173NotificacionesDetalle ;
   private long[] T00066_A6NotificacionesId ;
   private long[] T00067_A6NotificacionesId ;
   private long[] T00062_A6NotificacionesId ;
   private java.util.Date[] T00062_A169NotificacionesFecha ;
   private boolean[] T00062_n169NotificacionesFecha ;
   private String[] T00062_A170NotificacionesTipo ;
   private boolean[] T00062_n170NotificacionesTipo ;
   private String[] T00062_A171NotificacionesMensaje ;
   private boolean[] T00062_n171NotificacionesMensaje ;
   private long[] T00062_A172NotificacionesIdNetUsuario ;
   private boolean[] T00062_n172NotificacionesIdNetUsuario ;
   private String[] T00062_A173NotificacionesDetalle ;
   private boolean[] T00062_n173NotificacionesDetalle ;
   private long[] T000611_A6NotificacionesId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class notificaciones__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class notificaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00062", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00063", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00064", "SELECT TM1.`NotificacionesId`, TM1.`NotificacionesFecha`, TM1.`NotificacionesTipo`, TM1.`NotificacionesMensaje`, TM1.`NotificacionesIdNetUsuario`, TM1.`NotificacionesDetalle` FROM `Notificaciones` TM1 WHERE TM1.`NotificacionesId` = ? ORDER BY TM1.`NotificacionesId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00065", "SELECT `NotificacionesId` FROM `Notificaciones` WHERE `NotificacionesId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00066", "SELECT `NotificacionesId` FROM `Notificaciones` WHERE ( `NotificacionesId` > ?) ORDER BY `NotificacionesId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00067", "SELECT `NotificacionesId` FROM `Notificaciones` WHERE ( `NotificacionesId` < ?) ORDER BY `NotificacionesId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00068", "INSERT INTO `Notificaciones`(`NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00069", "UPDATE `Notificaciones` SET `NotificacionesFecha`=?, `NotificacionesTipo`=?, `NotificacionesMensaje`=?, `NotificacionesIdNetUsuario`=?, `NotificacionesDetalle`=?  WHERE `NotificacionesId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000610", "DELETE FROM `Notificaciones`  WHERE `NotificacionesId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000611", "SELECT `NotificacionesId` FROM `Notificaciones` ORDER BY `NotificacionesId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 40);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 256);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[8]).longValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 40);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 256);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 40);
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

