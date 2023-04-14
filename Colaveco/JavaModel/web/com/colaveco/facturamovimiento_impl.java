package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturamovimiento_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"FMSALDOACTUAL") == 0 )
      {
         A2FMId = GXutil.lval( httpContext.GetPar( "FMId")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asafmsaldoactual022( A2FMId) ;
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
         Form.getMeta().addItem("description", "Factura Movimiento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFMId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public facturamovimiento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public facturamovimiento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturamovimiento_impl.class ));
   }

   public facturamovimiento_impl( int remoteHandle ,
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Factura Movimiento", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FacturaMovimiento.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 4, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.colaveco.gx0020"+"',["+"{Ctrl:gx.dom.el('"+"FMID"+"'), id:'"+"FMID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_FacturaMovimiento.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMId_Internalname, "FMId", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMId_Internalname, GXutil.ltrim( localUtil.ntoc( A2FMId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2FMId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2FMId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMIdNetMovimiento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMIdNetMovimiento_Internalname, "Net Movimiento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMIdNetMovimiento_Internalname, GXutil.ltrim( localUtil.ntoc( A21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMIdNetMovimiento_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMIdNetMovimiento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMIdNetMovimiento_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMFechaEmision_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMFechaEmision_Internalname, "Emision", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFMFechaEmision_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMFechaEmision_Internalname, localUtil.ttoc( A22FMFechaEmision, 10, 8, 1, 2, "/", ":", " "), localUtil.format( A22FMFechaEmision, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMFechaEmision_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMFechaEmision_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtFMFechaEmision_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFMFechaEmision_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FacturaMovimiento.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMFechaVencimiento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMFechaVencimiento_Internalname, "Vencimiento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFMFechaVencimiento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMFechaVencimiento_Internalname, localUtil.ttoc( A23FMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "), localUtil.format( A23FMFechaVencimiento, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',5,12,'eng',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMFechaVencimiento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMFechaVencimiento_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtFMFechaVencimiento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFMFechaVencimiento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FacturaMovimiento.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMTipo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMTipo_Internalname, "FMTipo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMTipo_Internalname, A24FMTipo, GXutil.rtrim( localUtil.format( A24FMTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMTipo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMTipo_Enabled, 0, "text", "", 45, "chr", 1, "row", 45, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMNumero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMNumero_Internalname, "FMNumero", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A25FMNumero, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMNumero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A25FMNumero), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A25FMNumero), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMNumero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMNumero_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMDetalle_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMDetalle_Internalname, "FMDetalle", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtFMDetalle_Internalname, A26FMDetalle, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", (short)(0), 1, edtFMDetalle_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMImporte_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMImporte_Internalname, "FMImporte", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMImporte_Internalname, GXutil.ltrim( localUtil.ntoc( A27FMImporte, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMImporte_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A27FMImporte), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A27FMImporte), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMImporte_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMImporte_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMIdUsuarioNet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMIdUsuarioNet_Internalname, "Usuario Net", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMIdUsuarioNet_Internalname, GXutil.ltrim( localUtil.ntoc( A28FMIdUsuarioNet, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMIdUsuarioNet_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMIdUsuarioNet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMIdUsuarioNet_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMTipoMovimiento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMTipoMovimiento_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMTipoMovimiento_Internalname, GXutil.ltrim( localUtil.ntoc( A29FMTipoMovimiento, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMTipoMovimiento_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A29FMTipoMovimiento), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A29FMTipoMovimiento), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMTipoMovimiento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMTipoMovimiento_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMImportePago_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMImportePago_Internalname, "Pago", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMImportePago_Internalname, GXutil.ltrim( localUtil.ntoc( A30FMImportePago, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMImportePago_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30FMImportePago), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30FMImportePago), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMImportePago_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMImportePago_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMPathPdf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMPathPdf_Internalname, "Pdf", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtFMPathPdf_Internalname, A31FMPathPdf, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtFMPathPdf_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFMSaldoActual_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtFMSaldoActual_Internalname, "Actual", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtFMSaldoActual_Internalname, GXutil.ltrim( localUtil.ntoc( A176FMSaldoActual, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtFMSaldoActual_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A176FMSaldoActual), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A176FMSaldoActual), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFMSaldoActual_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFMSaldoActual_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FacturaMovimiento.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FacturaMovimiento.htm");
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
         Z2FMId = localUtil.ctol( httpContext.cgiGet( "Z2FMId"), ".", ",") ;
         Z21FMIdNetMovimiento = localUtil.ctol( httpContext.cgiGet( "Z21FMIdNetMovimiento"), ".", ",") ;
         n21FMIdNetMovimiento = ((0==A21FMIdNetMovimiento) ? true : false) ;
         Z22FMFechaEmision = localUtil.ctot( httpContext.cgiGet( "Z22FMFechaEmision"), 0) ;
         n22FMFechaEmision = (GXutil.dateCompare(GXutil.nullDate(), A22FMFechaEmision) ? true : false) ;
         Z23FMFechaVencimiento = localUtil.ctot( httpContext.cgiGet( "Z23FMFechaVencimiento"), 0) ;
         n23FMFechaVencimiento = (GXutil.dateCompare(GXutil.nullDate(), A23FMFechaVencimiento) ? true : false) ;
         Z24FMTipo = httpContext.cgiGet( "Z24FMTipo") ;
         n24FMTipo = ((GXutil.strcmp("", A24FMTipo)==0) ? true : false) ;
         Z25FMNumero = localUtil.ctol( httpContext.cgiGet( "Z25FMNumero"), ".", ",") ;
         n25FMNumero = ((0==A25FMNumero) ? true : false) ;
         Z26FMDetalle = httpContext.cgiGet( "Z26FMDetalle") ;
         n26FMDetalle = ((GXutil.strcmp("", A26FMDetalle)==0) ? true : false) ;
         Z27FMImporte = localUtil.ctol( httpContext.cgiGet( "Z27FMImporte"), ".", ",") ;
         n27FMImporte = ((0==A27FMImporte) ? true : false) ;
         Z28FMIdUsuarioNet = localUtil.ctol( httpContext.cgiGet( "Z28FMIdUsuarioNet"), ".", ",") ;
         n28FMIdUsuarioNet = ((0==A28FMIdUsuarioNet) ? true : false) ;
         Z29FMTipoMovimiento = localUtil.ctol( httpContext.cgiGet( "Z29FMTipoMovimiento"), ".", ",") ;
         n29FMTipoMovimiento = ((0==A29FMTipoMovimiento) ? true : false) ;
         Z30FMImportePago = localUtil.ctol( httpContext.cgiGet( "Z30FMImportePago"), ".", ",") ;
         n30FMImportePago = ((0==A30FMImportePago) ? true : false) ;
         Z31FMPathPdf = httpContext.cgiGet( "Z31FMPathPdf") ;
         n31FMPathPdf = ((GXutil.strcmp("", A31FMPathPdf)==0) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMId_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2FMId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
         }
         else
         {
            A2FMId = localUtil.ctol( httpContext.cgiGet( edtFMId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMIdNetMovimiento_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMIdNetMovimiento_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMIDNETMOVIMIENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A21FMIdNetMovimiento = 0 ;
            n21FMIdNetMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), 18, 0));
         }
         else
         {
            A21FMIdNetMovimiento = localUtil.ctol( httpContext.cgiGet( edtFMIdNetMovimiento_Internalname), ".", ",") ;
            n21FMIdNetMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), 18, 0));
         }
         n21FMIdNetMovimiento = ((0==A21FMIdNetMovimiento) ? true : false) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtFMFechaEmision_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FMFECHAEMISION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMFechaEmision_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
            n22FMFechaEmision = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            A22FMFechaEmision = localUtil.ctot( httpContext.cgiGet( edtFMFechaEmision_Internalname)) ;
            n22FMFechaEmision = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         }
         n22FMFechaEmision = (GXutil.dateCompare(GXutil.nullDate(), A22FMFechaEmision) ? true : false) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtFMFechaVencimiento_Internalname), (byte)(2), (byte)(1)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FMFECHAVENCIMIENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMFechaVencimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
            n23FMFechaVencimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         }
         else
         {
            A23FMFechaVencimiento = localUtil.ctot( httpContext.cgiGet( edtFMFechaVencimiento_Internalname)) ;
            n23FMFechaVencimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         }
         n23FMFechaVencimiento = (GXutil.dateCompare(GXutil.nullDate(), A23FMFechaVencimiento) ? true : false) ;
         A24FMTipo = httpContext.cgiGet( edtFMTipo_Internalname) ;
         n24FMTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A24FMTipo", A24FMTipo);
         n24FMTipo = ((GXutil.strcmp("", A24FMTipo)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMNumero_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMNumero_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMNUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMNumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A25FMNumero = 0 ;
            n25FMNumero = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A25FMNumero), 18, 0));
         }
         else
         {
            A25FMNumero = localUtil.ctol( httpContext.cgiGet( edtFMNumero_Internalname), ".", ",") ;
            n25FMNumero = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A25FMNumero), 18, 0));
         }
         n25FMNumero = ((0==A25FMNumero) ? true : false) ;
         A26FMDetalle = httpContext.cgiGet( edtFMDetalle_Internalname) ;
         n26FMDetalle = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A26FMDetalle", A26FMDetalle);
         n26FMDetalle = ((GXutil.strcmp("", A26FMDetalle)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMImporte_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMImporte_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMIMPORTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMImporte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A27FMImporte = 0 ;
            n27FMImporte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A27FMImporte), 18, 0));
         }
         else
         {
            A27FMImporte = localUtil.ctol( httpContext.cgiGet( edtFMImporte_Internalname), ".", ",") ;
            n27FMImporte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A27FMImporte), 18, 0));
         }
         n27FMImporte = ((0==A27FMImporte) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMIdUsuarioNet_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMIdUsuarioNet_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMIDUSUARIONET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMIdUsuarioNet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A28FMIdUsuarioNet = 0 ;
            n28FMIdUsuarioNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), 18, 0));
         }
         else
         {
            A28FMIdUsuarioNet = localUtil.ctol( httpContext.cgiGet( edtFMIdUsuarioNet_Internalname), ".", ",") ;
            n28FMIdUsuarioNet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), 18, 0));
         }
         n28FMIdUsuarioNet = ((0==A28FMIdUsuarioNet) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMTipoMovimiento_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMTipoMovimiento_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMTIPOMOVIMIENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMTipoMovimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A29FMTipoMovimiento = 0 ;
            n29FMTipoMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A29FMTipoMovimiento), 18, 0));
         }
         else
         {
            A29FMTipoMovimiento = localUtil.ctol( httpContext.cgiGet( edtFMTipoMovimiento_Internalname), ".", ",") ;
            n29FMTipoMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A29FMTipoMovimiento), 18, 0));
         }
         n29FMTipoMovimiento = ((0==A29FMTipoMovimiento) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFMImportePago_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFMImportePago_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FMIMPORTEPAGO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFMImportePago_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A30FMImportePago = 0 ;
            n30FMImportePago = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30FMImportePago), 18, 0));
         }
         else
         {
            A30FMImportePago = localUtil.ctol( httpContext.cgiGet( edtFMImportePago_Internalname), ".", ",") ;
            n30FMImportePago = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30FMImportePago), 18, 0));
         }
         n30FMImportePago = ((0==A30FMImportePago) ? true : false) ;
         A31FMPathPdf = httpContext.cgiGet( edtFMPathPdf_Internalname) ;
         n31FMPathPdf = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A31FMPathPdf", A31FMPathPdf);
         n31FMPathPdf = ((GXutil.strcmp("", A31FMPathPdf)==0) ? true : false) ;
         A176FMSaldoActual = localUtil.ctol( httpContext.cgiGet( edtFMSaldoActual_Internalname), ".", ",") ;
         httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
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
            A2FMId = GXutil.lval( httpContext.GetPar( "FMId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
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
            initAll022( ) ;
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
      disableAttributes022( ) ;
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

   public void resetCaption020( )
   {
   }

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z21FMIdNetMovimiento = T00023_A21FMIdNetMovimiento[0] ;
            Z22FMFechaEmision = T00023_A22FMFechaEmision[0] ;
            Z23FMFechaVencimiento = T00023_A23FMFechaVencimiento[0] ;
            Z24FMTipo = T00023_A24FMTipo[0] ;
            Z25FMNumero = T00023_A25FMNumero[0] ;
            Z26FMDetalle = T00023_A26FMDetalle[0] ;
            Z27FMImporte = T00023_A27FMImporte[0] ;
            Z28FMIdUsuarioNet = T00023_A28FMIdUsuarioNet[0] ;
            Z29FMTipoMovimiento = T00023_A29FMTipoMovimiento[0] ;
            Z30FMImportePago = T00023_A30FMImportePago[0] ;
            Z31FMPathPdf = T00023_A31FMPathPdf[0] ;
         }
         else
         {
            Z21FMIdNetMovimiento = A21FMIdNetMovimiento ;
            Z22FMFechaEmision = A22FMFechaEmision ;
            Z23FMFechaVencimiento = A23FMFechaVencimiento ;
            Z24FMTipo = A24FMTipo ;
            Z25FMNumero = A25FMNumero ;
            Z26FMDetalle = A26FMDetalle ;
            Z27FMImporte = A27FMImporte ;
            Z28FMIdUsuarioNet = A28FMIdUsuarioNet ;
            Z29FMTipoMovimiento = A29FMTipoMovimiento ;
            Z30FMImportePago = A30FMImportePago ;
            Z31FMPathPdf = A31FMPathPdf ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z2FMId = A2FMId ;
         Z21FMIdNetMovimiento = A21FMIdNetMovimiento ;
         Z22FMFechaEmision = A22FMFechaEmision ;
         Z23FMFechaVencimiento = A23FMFechaVencimiento ;
         Z24FMTipo = A24FMTipo ;
         Z25FMNumero = A25FMNumero ;
         Z26FMDetalle = A26FMDetalle ;
         Z27FMImporte = A27FMImporte ;
         Z28FMIdUsuarioNet = A28FMIdUsuarioNet ;
         Z29FMTipoMovimiento = A29FMTipoMovimiento ;
         Z30FMImportePago = A30FMImportePago ;
         Z31FMPathPdf = A31FMPathPdf ;
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

   public void load022( )
   {
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A21FMIdNetMovimiento = T00024_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = T00024_n21FMIdNetMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), 18, 0));
         A22FMFechaEmision = T00024_A22FMFechaEmision[0] ;
         n22FMFechaEmision = T00024_n22FMFechaEmision[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         A23FMFechaVencimiento = T00024_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = T00024_n23FMFechaVencimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         A24FMTipo = T00024_A24FMTipo[0] ;
         n24FMTipo = T00024_n24FMTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24FMTipo", A24FMTipo);
         A25FMNumero = T00024_A25FMNumero[0] ;
         n25FMNumero = T00024_n25FMNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A25FMNumero), 18, 0));
         A26FMDetalle = T00024_A26FMDetalle[0] ;
         n26FMDetalle = T00024_n26FMDetalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26FMDetalle", A26FMDetalle);
         A27FMImporte = T00024_A27FMImporte[0] ;
         n27FMImporte = T00024_n27FMImporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A27FMImporte), 18, 0));
         A28FMIdUsuarioNet = T00024_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = T00024_n28FMIdUsuarioNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), 18, 0));
         A29FMTipoMovimiento = T00024_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = T00024_n29FMTipoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A29FMTipoMovimiento), 18, 0));
         A30FMImportePago = T00024_A30FMImportePago[0] ;
         n30FMImportePago = T00024_n30FMImportePago[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30FMImportePago), 18, 0));
         A31FMPathPdf = T00024_A31FMPathPdf[0] ;
         n31FMPathPdf = T00024_n31FMPathPdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31FMPathPdf", A31FMPathPdf);
         zm022( -4) ;
      }
      pr_default.close(2);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_impl.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
   }

   public void checkExtendedTable022( )
   {
      nIsDirty_2 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_2 = (short)(1) ;
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_impl.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A22FMFechaEmision) || (( A22FMFechaEmision.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A22FMFechaEmision, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field FMFecha Emision is out of range", "OutOfRange", 1, "FMFECHAEMISION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFMFechaEmision_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A23FMFechaVencimiento) || (( A23FMFechaVencimiento.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A23FMFechaVencimiento, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field FMFecha Vencimiento is out of range", "OutOfRange", 1, "FMFECHAVENCIMIENTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFMFechaVencimiento_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors022( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey022( )
   {
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00023 */
      pr_default.execute(1, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm022( 4) ;
         RcdFound2 = (short)(1) ;
         A2FMId = T00023_A2FMId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
         A21FMIdNetMovimiento = T00023_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = T00023_n21FMIdNetMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), 18, 0));
         A22FMFechaEmision = T00023_A22FMFechaEmision[0] ;
         n22FMFechaEmision = T00023_n22FMFechaEmision[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
         A23FMFechaVencimiento = T00023_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = T00023_n23FMFechaVencimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
         A24FMTipo = T00023_A24FMTipo[0] ;
         n24FMTipo = T00023_n24FMTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24FMTipo", A24FMTipo);
         A25FMNumero = T00023_A25FMNumero[0] ;
         n25FMNumero = T00023_n25FMNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A25FMNumero), 18, 0));
         A26FMDetalle = T00023_A26FMDetalle[0] ;
         n26FMDetalle = T00023_n26FMDetalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26FMDetalle", A26FMDetalle);
         A27FMImporte = T00023_A27FMImporte[0] ;
         n27FMImporte = T00023_n27FMImporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A27FMImporte), 18, 0));
         A28FMIdUsuarioNet = T00023_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = T00023_n28FMIdUsuarioNet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), 18, 0));
         A29FMTipoMovimiento = T00023_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = T00023_n29FMTipoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A29FMTipoMovimiento), 18, 0));
         A30FMImportePago = T00023_A30FMImportePago[0] ;
         n30FMImportePago = T00023_n30FMImportePago[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30FMImportePago), 18, 0));
         A31FMPathPdf = T00023_A31FMPathPdf[0] ;
         n31FMPathPdf = T00023_n31FMPathPdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31FMPathPdf", A31FMPathPdf);
         Z2FMId = A2FMId ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
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
      RcdFound2 = (short)(0) ;
      /* Using cursor T00026 */
      pr_default.execute(4, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00026_A2FMId[0] < A2FMId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00026_A2FMId[0] > A2FMId ) ) )
         {
            A2FMId = T00026_A2FMId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T00027 */
      pr_default.execute(5, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00027_A2FMId[0] > A2FMId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00027_A2FMId[0] < A2FMId ) ) )
         {
            A2FMId = T00027_A2FMId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFMId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert022( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( A2FMId != Z2FMId )
            {
               A2FMId = Z2FMId ;
               httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FMID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFMId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFMId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update022( ) ;
               GX_FocusControl = edtFMId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A2FMId != Z2FMId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFMId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert022( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FMID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFMId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtFMId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert022( ) ;
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
      if ( A2FMId != Z2FMId )
      {
         A2FMId = Z2FMId ;
         httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFMId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFMId_Internalname ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "FMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFMId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
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
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound2 != 0 )
         {
            scanNext022( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency022( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00022 */
         pr_default.execute(0, new Object[] {Long.valueOf(A2FMId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"FacturaMovimiento"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z21FMIdNetMovimiento != T00022_A21FMIdNetMovimiento[0] ) || !( GXutil.dateCompare(Z22FMFechaEmision, T00022_A22FMFechaEmision[0]) ) || !( GXutil.dateCompare(Z23FMFechaVencimiento, T00022_A23FMFechaVencimiento[0]) ) || ( GXutil.strcmp(Z24FMTipo, T00022_A24FMTipo[0]) != 0 ) || ( Z25FMNumero != T00022_A25FMNumero[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z26FMDetalle, T00022_A26FMDetalle[0]) != 0 ) || ( Z27FMImporte != T00022_A27FMImporte[0] ) || ( Z28FMIdUsuarioNet != T00022_A28FMIdUsuarioNet[0] ) || ( Z29FMTipoMovimiento != T00022_A29FMTipoMovimiento[0] ) || ( Z30FMImportePago != T00022_A30FMImportePago[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z31FMPathPdf, T00022_A31FMPathPdf[0]) != 0 ) )
         {
            if ( Z21FMIdNetMovimiento != T00022_A21FMIdNetMovimiento[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMIdNetMovimiento");
               GXutil.writeLogRaw("Old: ",Z21FMIdNetMovimiento);
               GXutil.writeLogRaw("Current: ",T00022_A21FMIdNetMovimiento[0]);
            }
            if ( !( GXutil.dateCompare(Z22FMFechaEmision, T00022_A22FMFechaEmision[0]) ) )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMFechaEmision");
               GXutil.writeLogRaw("Old: ",Z22FMFechaEmision);
               GXutil.writeLogRaw("Current: ",T00022_A22FMFechaEmision[0]);
            }
            if ( !( GXutil.dateCompare(Z23FMFechaVencimiento, T00022_A23FMFechaVencimiento[0]) ) )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMFechaVencimiento");
               GXutil.writeLogRaw("Old: ",Z23FMFechaVencimiento);
               GXutil.writeLogRaw("Current: ",T00022_A23FMFechaVencimiento[0]);
            }
            if ( GXutil.strcmp(Z24FMTipo, T00022_A24FMTipo[0]) != 0 )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMTipo");
               GXutil.writeLogRaw("Old: ",Z24FMTipo);
               GXutil.writeLogRaw("Current: ",T00022_A24FMTipo[0]);
            }
            if ( Z25FMNumero != T00022_A25FMNumero[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMNumero");
               GXutil.writeLogRaw("Old: ",Z25FMNumero);
               GXutil.writeLogRaw("Current: ",T00022_A25FMNumero[0]);
            }
            if ( GXutil.strcmp(Z26FMDetalle, T00022_A26FMDetalle[0]) != 0 )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMDetalle");
               GXutil.writeLogRaw("Old: ",Z26FMDetalle);
               GXutil.writeLogRaw("Current: ",T00022_A26FMDetalle[0]);
            }
            if ( Z27FMImporte != T00022_A27FMImporte[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMImporte");
               GXutil.writeLogRaw("Old: ",Z27FMImporte);
               GXutil.writeLogRaw("Current: ",T00022_A27FMImporte[0]);
            }
            if ( Z28FMIdUsuarioNet != T00022_A28FMIdUsuarioNet[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMIdUsuarioNet");
               GXutil.writeLogRaw("Old: ",Z28FMIdUsuarioNet);
               GXutil.writeLogRaw("Current: ",T00022_A28FMIdUsuarioNet[0]);
            }
            if ( Z29FMTipoMovimiento != T00022_A29FMTipoMovimiento[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMTipoMovimiento");
               GXutil.writeLogRaw("Old: ",Z29FMTipoMovimiento);
               GXutil.writeLogRaw("Current: ",T00022_A29FMTipoMovimiento[0]);
            }
            if ( Z30FMImportePago != T00022_A30FMImportePago[0] )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMImportePago");
               GXutil.writeLogRaw("Old: ",Z30FMImportePago);
               GXutil.writeLogRaw("Current: ",T00022_A30FMImportePago[0]);
            }
            if ( GXutil.strcmp(Z31FMPathPdf, T00022_A31FMPathPdf[0]) != 0 )
            {
               GXutil.writeLogln("facturamovimiento:[seudo value changed for attri]"+"FMPathPdf");
               GXutil.writeLogRaw("Old: ",Z31FMPathPdf);
               GXutil.writeLogRaw("Current: ",T00022_A31FMPathPdf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"FacturaMovimiento"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         zm022( 0) ;
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00028 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A2FMId), Boolean.valueOf(n21FMIdNetMovimiento), Long.valueOf(A21FMIdNetMovimiento), Boolean.valueOf(n22FMFechaEmision), A22FMFechaEmision, Boolean.valueOf(n23FMFechaVencimiento), A23FMFechaVencimiento, Boolean.valueOf(n24FMTipo), A24FMTipo, Boolean.valueOf(n25FMNumero), Long.valueOf(A25FMNumero), Boolean.valueOf(n26FMDetalle), A26FMDetalle, Boolean.valueOf(n27FMImporte), Long.valueOf(A27FMImporte), Boolean.valueOf(n28FMIdUsuarioNet), Long.valueOf(A28FMIdUsuarioNet), Boolean.valueOf(n29FMTipoMovimiento), Long.valueOf(A29FMTipoMovimiento), Boolean.valueOf(n30FMImportePago), Long.valueOf(A30FMImportePago), Boolean.valueOf(n31FMPathPdf), A31FMPathPdf});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
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
                        resetCaption020( ) ;
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
            load022( ) ;
         }
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void update022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00029 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n21FMIdNetMovimiento), Long.valueOf(A21FMIdNetMovimiento), Boolean.valueOf(n22FMFechaEmision), A22FMFechaEmision, Boolean.valueOf(n23FMFechaVencimiento), A23FMFechaVencimiento, Boolean.valueOf(n24FMTipo), A24FMTipo, Boolean.valueOf(n25FMNumero), Long.valueOf(A25FMNumero), Boolean.valueOf(n26FMDetalle), A26FMDetalle, Boolean.valueOf(n27FMImporte), Long.valueOf(A27FMImporte), Boolean.valueOf(n28FMIdUsuarioNet), Long.valueOf(A28FMIdUsuarioNet), Boolean.valueOf(n29FMTipoMovimiento), Long.valueOf(A29FMTipoMovimiento), Boolean.valueOf(n30FMImportePago), Long.valueOf(A30FMImportePago), Boolean.valueOf(n31FMPathPdf), A31FMPathPdf, Long.valueOf(A2FMId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"FacturaMovimiento"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate022( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption020( ) ;
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
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void deferredUpdate022( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls022( ) ;
         afterConfirm022( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete022( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000210 */
               pr_default.execute(8, new Object[] {Long.valueOf(A2FMId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound2 == 0 )
                     {
                        initAll022( ) ;
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
                     resetCaption020( ) ;
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel022( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls022( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_int1 = A176FMSaldoActual ;
         GXv_int2[0] = GXt_int1 ;
         new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
         facturamovimiento_impl.this.GXt_int1 = GXv_int2[0] ;
         A176FMSaldoActual = GXt_int1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
      }
   }

   public void endLevel022( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturamovimiento");
         if ( AnyError == 0 )
         {
            confirmValues020( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturamovimiento");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart022( )
   {
      /* Using cursor T000211 */
      pr_default.execute(9);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2FMId = T000211_A2FMId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2FMId = T000211_A2FMId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
      }
   }

   public void scanEnd022( )
   {
      pr_default.close(9);
   }

   public void afterConfirm022( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert022( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate022( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete022( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete022( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate022( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes022( )
   {
      edtFMId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMId_Enabled), 5, 0), true);
      edtFMIdNetMovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMIdNetMovimiento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMIdNetMovimiento_Enabled), 5, 0), true);
      edtFMFechaEmision_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMFechaEmision_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMFechaEmision_Enabled), 5, 0), true);
      edtFMFechaVencimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMFechaVencimiento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMFechaVencimiento_Enabled), 5, 0), true);
      edtFMTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMTipo_Enabled), 5, 0), true);
      edtFMNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMNumero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMNumero_Enabled), 5, 0), true);
      edtFMDetalle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMDetalle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMDetalle_Enabled), 5, 0), true);
      edtFMImporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMImporte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMImporte_Enabled), 5, 0), true);
      edtFMIdUsuarioNet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMIdUsuarioNet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMIdUsuarioNet_Enabled), 5, 0), true);
      edtFMTipoMovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMTipoMovimiento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMTipoMovimiento_Enabled), 5, 0), true);
      edtFMImportePago_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMImportePago_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMImportePago_Enabled), 5, 0), true);
      edtFMPathPdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMPathPdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMPathPdf_Enabled), 5, 0), true);
      edtFMSaldoActual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFMSaldoActual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFMSaldoActual_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes022( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues020( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614564161", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.facturamovimiento", new String[] {}, new String[] {}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z2FMId", GXutil.ltrim( localUtil.ntoc( Z2FMId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z21FMIdNetMovimiento", GXutil.ltrim( localUtil.ntoc( Z21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z22FMFechaEmision", localUtil.ttoc( Z22FMFechaEmision, 10, 8, 0, 0, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z23FMFechaVencimiento", localUtil.ttoc( Z23FMFechaVencimiento, 10, 8, 0, 0, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z24FMTipo", Z24FMTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z25FMNumero", GXutil.ltrim( localUtil.ntoc( Z25FMNumero, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z26FMDetalle", Z26FMDetalle);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z27FMImporte", GXutil.ltrim( localUtil.ntoc( Z27FMImporte, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z28FMIdUsuarioNet", GXutil.ltrim( localUtil.ntoc( Z28FMIdUsuarioNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z29FMTipoMovimiento", GXutil.ltrim( localUtil.ntoc( Z29FMTipoMovimiento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z30FMImportePago", GXutil.ltrim( localUtil.ntoc( Z30FMImportePago, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z31FMPathPdf", Z31FMPathPdf);
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
      return formatLink("com.colaveco.facturamovimiento", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FacturaMovimiento" ;
   }

   public String getPgmdesc( )
   {
      return "Factura Movimiento" ;
   }

   public void initializeNonKey022( )
   {
      A176FMSaldoActual = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
      A21FMIdNetMovimiento = 0 ;
      n21FMIdNetMovimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A21FMIdNetMovimiento), 18, 0));
      n21FMIdNetMovimiento = ((0==A21FMIdNetMovimiento) ? true : false) ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      n22FMFechaEmision = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 8, 5, 1, 2, "/", ":", " "));
      n22FMFechaEmision = (GXutil.dateCompare(GXutil.nullDate(), A22FMFechaEmision) ? true : false) ;
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      n23FMFechaVencimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 8, 5, 1, 2, "/", ":", " "));
      n23FMFechaVencimiento = (GXutil.dateCompare(GXutil.nullDate(), A23FMFechaVencimiento) ? true : false) ;
      A24FMTipo = "" ;
      n24FMTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A24FMTipo", A24FMTipo);
      n24FMTipo = ((GXutil.strcmp("", A24FMTipo)==0) ? true : false) ;
      A25FMNumero = 0 ;
      n25FMNumero = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A25FMNumero), 18, 0));
      n25FMNumero = ((0==A25FMNumero) ? true : false) ;
      A26FMDetalle = "" ;
      n26FMDetalle = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A26FMDetalle", A26FMDetalle);
      n26FMDetalle = ((GXutil.strcmp("", A26FMDetalle)==0) ? true : false) ;
      A27FMImporte = 0 ;
      n27FMImporte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A27FMImporte), 18, 0));
      n27FMImporte = ((0==A27FMImporte) ? true : false) ;
      A28FMIdUsuarioNet = 0 ;
      n28FMIdUsuarioNet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28FMIdUsuarioNet), 18, 0));
      n28FMIdUsuarioNet = ((0==A28FMIdUsuarioNet) ? true : false) ;
      A29FMTipoMovimiento = 0 ;
      n29FMTipoMovimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A29FMTipoMovimiento), 18, 0));
      n29FMTipoMovimiento = ((0==A29FMTipoMovimiento) ? true : false) ;
      A30FMImportePago = 0 ;
      n30FMImportePago = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30FMImportePago), 18, 0));
      n30FMImportePago = ((0==A30FMImportePago) ? true : false) ;
      A31FMPathPdf = "" ;
      n31FMPathPdf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A31FMPathPdf", A31FMPathPdf);
      n31FMPathPdf = ((GXutil.strcmp("", A31FMPathPdf)==0) ? true : false) ;
      Z21FMIdNetMovimiento = 0 ;
      Z22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      Z23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      Z24FMTipo = "" ;
      Z25FMNumero = 0 ;
      Z26FMDetalle = "" ;
      Z27FMImporte = 0 ;
      Z28FMIdUsuarioNet = 0 ;
      Z29FMTipoMovimiento = 0 ;
      Z30FMImportePago = 0 ;
      Z31FMPathPdf = "" ;
   }

   public void initAll022( )
   {
      A2FMId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2FMId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2FMId), 18, 0));
      initializeNonKey022( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614564181", true, true);
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
      httpContext.AddJavascriptSource("facturamovimiento.js", "?202312614564182", false, true);
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
      edtFMId_Internalname = "FMID" ;
      edtFMIdNetMovimiento_Internalname = "FMIDNETMOVIMIENTO" ;
      edtFMFechaEmision_Internalname = "FMFECHAEMISION" ;
      edtFMFechaVencimiento_Internalname = "FMFECHAVENCIMIENTO" ;
      edtFMTipo_Internalname = "FMTIPO" ;
      edtFMNumero_Internalname = "FMNUMERO" ;
      edtFMDetalle_Internalname = "FMDETALLE" ;
      edtFMImporte_Internalname = "FMIMPORTE" ;
      edtFMIdUsuarioNet_Internalname = "FMIDUSUARIONET" ;
      edtFMTipoMovimiento_Internalname = "FMTIPOMOVIMIENTO" ;
      edtFMImportePago_Internalname = "FMIMPORTEPAGO" ;
      edtFMPathPdf_Internalname = "FMPATHPDF" ;
      edtFMSaldoActual_Internalname = "FMSALDOACTUAL" ;
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
      Form.setCaption( "Factura Movimiento" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFMSaldoActual_Jsonclick = "" ;
      edtFMSaldoActual_Enabled = 0 ;
      edtFMPathPdf_Enabled = 1 ;
      edtFMImportePago_Jsonclick = "" ;
      edtFMImportePago_Enabled = 1 ;
      edtFMTipoMovimiento_Jsonclick = "" ;
      edtFMTipoMovimiento_Enabled = 1 ;
      edtFMIdUsuarioNet_Jsonclick = "" ;
      edtFMIdUsuarioNet_Enabled = 1 ;
      edtFMImporte_Jsonclick = "" ;
      edtFMImporte_Enabled = 1 ;
      edtFMDetalle_Enabled = 1 ;
      edtFMNumero_Jsonclick = "" ;
      edtFMNumero_Enabled = 1 ;
      edtFMTipo_Jsonclick = "" ;
      edtFMTipo_Enabled = 1 ;
      edtFMFechaVencimiento_Jsonclick = "" ;
      edtFMFechaVencimiento_Enabled = 1 ;
      edtFMFechaEmision_Jsonclick = "" ;
      edtFMFechaEmision_Enabled = 1 ;
      edtFMIdNetMovimiento_Jsonclick = "" ;
      edtFMIdNetMovimiento_Enabled = 1 ;
      edtFMId_Jsonclick = "" ;
      edtFMId_Enabled = 1 ;
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

   public void gx3asafmsaldoactual022( long A2FMId )
   {
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_impl.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrimstr( DecimalUtil.doubleToDec(A176FMSaldoActual), 18, 0));
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A176FMSaldoActual, (byte)(18), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      GX_FocusControl = edtFMIdNetMovimiento_Internalname ;
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

   public void valid_Fmid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_impl.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A21FMIdNetMovimiento", GXutil.ltrim( localUtil.ntoc( A21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A22FMFechaEmision", localUtil.ttoc( A22FMFechaEmision, 10, 8, 1, 2, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A23FMFechaVencimiento", localUtil.ttoc( A23FMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A24FMTipo", A24FMTipo);
      httpContext.ajax_rsp_assign_attri("", false, "A25FMNumero", GXutil.ltrim( localUtil.ntoc( A25FMNumero, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A26FMDetalle", A26FMDetalle);
      httpContext.ajax_rsp_assign_attri("", false, "A27FMImporte", GXutil.ltrim( localUtil.ntoc( A27FMImporte, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A28FMIdUsuarioNet", GXutil.ltrim( localUtil.ntoc( A28FMIdUsuarioNet, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A29FMTipoMovimiento", GXutil.ltrim( localUtil.ntoc( A29FMTipoMovimiento, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A30FMImportePago", GXutil.ltrim( localUtil.ntoc( A30FMImportePago, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A31FMPathPdf", A31FMPathPdf);
      httpContext.ajax_rsp_assign_attri("", false, "A176FMSaldoActual", GXutil.ltrim( localUtil.ntoc( A176FMSaldoActual, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z2FMId", GXutil.ltrim( localUtil.ntoc( Z2FMId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z21FMIdNetMovimiento", GXutil.ltrim( localUtil.ntoc( Z21FMIdNetMovimiento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z22FMFechaEmision", localUtil.ttoc( Z22FMFechaEmision, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z23FMFechaVencimiento", localUtil.ttoc( Z23FMFechaVencimiento, 10, 8, 1, 2, "/", ":", " "));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z24FMTipo", Z24FMTipo);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z25FMNumero", GXutil.ltrim( localUtil.ntoc( Z25FMNumero, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z26FMDetalle", Z26FMDetalle);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z27FMImporte", GXutil.ltrim( localUtil.ntoc( Z27FMImporte, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z28FMIdUsuarioNet", GXutil.ltrim( localUtil.ntoc( Z28FMIdUsuarioNet, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z29FMTipoMovimiento", GXutil.ltrim( localUtil.ntoc( Z29FMTipoMovimiento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z30FMImportePago", GXutil.ltrim( localUtil.ntoc( Z30FMImportePago, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z31FMPathPdf", Z31FMPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z176FMSaldoActual", GXutil.ltrim( localUtil.ntoc( Z176FMSaldoActual, (byte)(18), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_FMID","{handler:'valid_Fmid',iparms:[{av:'A2FMId',fld:'FMID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FMID",",oparms:[{av:'A21FMIdNetMovimiento',fld:'FMIDNETMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A22FMFechaEmision',fld:'FMFECHAEMISION',pic:'99/99/99 99:99'},{av:'A23FMFechaVencimiento',fld:'FMFECHAVENCIMIENTO',pic:'99/99/99 99:99'},{av:'A24FMTipo',fld:'FMTIPO',pic:''},{av:'A25FMNumero',fld:'FMNUMERO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A26FMDetalle',fld:'FMDETALLE',pic:''},{av:'A27FMImporte',fld:'FMIMPORTE',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A28FMIdUsuarioNet',fld:'FMIDUSUARIONET',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A29FMTipoMovimiento',fld:'FMTIPOMOVIMIENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A30FMImportePago',fld:'FMIMPORTEPAGO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A31FMPathPdf',fld:'FMPATHPDF',pic:''},{av:'A176FMSaldoActual',fld:'FMSALDOACTUAL',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z2FMId'},{av:'Z21FMIdNetMovimiento'},{av:'Z22FMFechaEmision'},{av:'Z23FMFechaVencimiento'},{av:'Z24FMTipo'},{av:'Z25FMNumero'},{av:'Z26FMDetalle'},{av:'Z27FMImporte'},{av:'Z28FMIdUsuarioNet'},{av:'Z29FMTipoMovimiento'},{av:'Z30FMImportePago'},{av:'Z31FMPathPdf'},{av:'Z176FMSaldoActual'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FMFECHAEMISION","{handler:'valid_Fmfechaemision',iparms:[]");
      setEventMetadata("VALID_FMFECHAEMISION",",oparms:[]}");
      setEventMetadata("VALID_FMFECHAVENCIMIENTO","{handler:'valid_Fmfechavencimiento',iparms:[]");
      setEventMetadata("VALID_FMFECHAVENCIMIENTO",",oparms:[]}");
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
      Z22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      Z23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      Z24FMTipo = "" ;
      Z26FMDetalle = "" ;
      Z31FMPathPdf = "" ;
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
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      A24FMTipo = "" ;
      A26FMDetalle = "" ;
      A31FMPathPdf = "" ;
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
      T00024_A2FMId = new long[1] ;
      T00024_A21FMIdNetMovimiento = new long[1] ;
      T00024_n21FMIdNetMovimiento = new boolean[] {false} ;
      T00024_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00024_n22FMFechaEmision = new boolean[] {false} ;
      T00024_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      T00024_n23FMFechaVencimiento = new boolean[] {false} ;
      T00024_A24FMTipo = new String[] {""} ;
      T00024_n24FMTipo = new boolean[] {false} ;
      T00024_A25FMNumero = new long[1] ;
      T00024_n25FMNumero = new boolean[] {false} ;
      T00024_A26FMDetalle = new String[] {""} ;
      T00024_n26FMDetalle = new boolean[] {false} ;
      T00024_A27FMImporte = new long[1] ;
      T00024_n27FMImporte = new boolean[] {false} ;
      T00024_A28FMIdUsuarioNet = new long[1] ;
      T00024_n28FMIdUsuarioNet = new boolean[] {false} ;
      T00024_A29FMTipoMovimiento = new long[1] ;
      T00024_n29FMTipoMovimiento = new boolean[] {false} ;
      T00024_A30FMImportePago = new long[1] ;
      T00024_n30FMImportePago = new boolean[] {false} ;
      T00024_A31FMPathPdf = new String[] {""} ;
      T00024_n31FMPathPdf = new boolean[] {false} ;
      T00025_A2FMId = new long[1] ;
      T00023_A2FMId = new long[1] ;
      T00023_A21FMIdNetMovimiento = new long[1] ;
      T00023_n21FMIdNetMovimiento = new boolean[] {false} ;
      T00023_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00023_n22FMFechaEmision = new boolean[] {false} ;
      T00023_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      T00023_n23FMFechaVencimiento = new boolean[] {false} ;
      T00023_A24FMTipo = new String[] {""} ;
      T00023_n24FMTipo = new boolean[] {false} ;
      T00023_A25FMNumero = new long[1] ;
      T00023_n25FMNumero = new boolean[] {false} ;
      T00023_A26FMDetalle = new String[] {""} ;
      T00023_n26FMDetalle = new boolean[] {false} ;
      T00023_A27FMImporte = new long[1] ;
      T00023_n27FMImporte = new boolean[] {false} ;
      T00023_A28FMIdUsuarioNet = new long[1] ;
      T00023_n28FMIdUsuarioNet = new boolean[] {false} ;
      T00023_A29FMTipoMovimiento = new long[1] ;
      T00023_n29FMTipoMovimiento = new boolean[] {false} ;
      T00023_A30FMImportePago = new long[1] ;
      T00023_n30FMImportePago = new boolean[] {false} ;
      T00023_A31FMPathPdf = new String[] {""} ;
      T00023_n31FMPathPdf = new boolean[] {false} ;
      sMode2 = "" ;
      T00026_A2FMId = new long[1] ;
      T00027_A2FMId = new long[1] ;
      T00022_A2FMId = new long[1] ;
      T00022_A21FMIdNetMovimiento = new long[1] ;
      T00022_n21FMIdNetMovimiento = new boolean[] {false} ;
      T00022_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00022_n22FMFechaEmision = new boolean[] {false} ;
      T00022_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      T00022_n23FMFechaVencimiento = new boolean[] {false} ;
      T00022_A24FMTipo = new String[] {""} ;
      T00022_n24FMTipo = new boolean[] {false} ;
      T00022_A25FMNumero = new long[1] ;
      T00022_n25FMNumero = new boolean[] {false} ;
      T00022_A26FMDetalle = new String[] {""} ;
      T00022_n26FMDetalle = new boolean[] {false} ;
      T00022_A27FMImporte = new long[1] ;
      T00022_n27FMImporte = new boolean[] {false} ;
      T00022_A28FMIdUsuarioNet = new long[1] ;
      T00022_n28FMIdUsuarioNet = new boolean[] {false} ;
      T00022_A29FMTipoMovimiento = new long[1] ;
      T00022_n29FMTipoMovimiento = new boolean[] {false} ;
      T00022_A30FMImportePago = new long[1] ;
      T00022_n30FMImportePago = new boolean[] {false} ;
      T00022_A31FMPathPdf = new String[] {""} ;
      T00022_n31FMPathPdf = new boolean[] {false} ;
      T000211_A2FMId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int2 = new long[1] ;
      ZZ22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      ZZ23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      ZZ24FMTipo = "" ;
      ZZ26FMDetalle = "" ;
      ZZ31FMPathPdf = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.facturamovimiento__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.facturamovimiento__default(),
         new Object[] {
             new Object[] {
            T00022_A2FMId, T00022_A21FMIdNetMovimiento, T00022_n21FMIdNetMovimiento, T00022_A22FMFechaEmision, T00022_n22FMFechaEmision, T00022_A23FMFechaVencimiento, T00022_n23FMFechaVencimiento, T00022_A24FMTipo, T00022_n24FMTipo, T00022_A25FMNumero,
            T00022_n25FMNumero, T00022_A26FMDetalle, T00022_n26FMDetalle, T00022_A27FMImporte, T00022_n27FMImporte, T00022_A28FMIdUsuarioNet, T00022_n28FMIdUsuarioNet, T00022_A29FMTipoMovimiento, T00022_n29FMTipoMovimiento, T00022_A30FMImportePago,
            T00022_n30FMImportePago, T00022_A31FMPathPdf, T00022_n31FMPathPdf
            }
            , new Object[] {
            T00023_A2FMId, T00023_A21FMIdNetMovimiento, T00023_n21FMIdNetMovimiento, T00023_A22FMFechaEmision, T00023_n22FMFechaEmision, T00023_A23FMFechaVencimiento, T00023_n23FMFechaVencimiento, T00023_A24FMTipo, T00023_n24FMTipo, T00023_A25FMNumero,
            T00023_n25FMNumero, T00023_A26FMDetalle, T00023_n26FMDetalle, T00023_A27FMImporte, T00023_n27FMImporte, T00023_A28FMIdUsuarioNet, T00023_n28FMIdUsuarioNet, T00023_A29FMTipoMovimiento, T00023_n29FMTipoMovimiento, T00023_A30FMImportePago,
            T00023_n30FMImportePago, T00023_A31FMPathPdf, T00023_n31FMPathPdf
            }
            , new Object[] {
            T00024_A2FMId, T00024_A21FMIdNetMovimiento, T00024_n21FMIdNetMovimiento, T00024_A22FMFechaEmision, T00024_n22FMFechaEmision, T00024_A23FMFechaVencimiento, T00024_n23FMFechaVencimiento, T00024_A24FMTipo, T00024_n24FMTipo, T00024_A25FMNumero,
            T00024_n25FMNumero, T00024_A26FMDetalle, T00024_n26FMDetalle, T00024_A27FMImporte, T00024_n27FMImporte, T00024_A28FMIdUsuarioNet, T00024_n28FMIdUsuarioNet, T00024_A29FMTipoMovimiento, T00024_n29FMTipoMovimiento, T00024_A30FMImportePago,
            T00024_n30FMImportePago, T00024_A31FMPathPdf, T00024_n31FMPathPdf
            }
            , new Object[] {
            T00025_A2FMId
            }
            , new Object[] {
            T00026_A2FMId
            }
            , new Object[] {
            T00027_A2FMId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000211_A2FMId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound2 ;
   private short nIsDirty_2 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtFMId_Enabled ;
   private int edtFMIdNetMovimiento_Enabled ;
   private int edtFMFechaEmision_Enabled ;
   private int edtFMFechaVencimiento_Enabled ;
   private int edtFMTipo_Enabled ;
   private int edtFMNumero_Enabled ;
   private int edtFMDetalle_Enabled ;
   private int edtFMImporte_Enabled ;
   private int edtFMIdUsuarioNet_Enabled ;
   private int edtFMTipoMovimiento_Enabled ;
   private int edtFMImportePago_Enabled ;
   private int edtFMPathPdf_Enabled ;
   private int edtFMSaldoActual_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z2FMId ;
   private long Z21FMIdNetMovimiento ;
   private long Z25FMNumero ;
   private long Z27FMImporte ;
   private long Z28FMIdUsuarioNet ;
   private long Z29FMTipoMovimiento ;
   private long Z30FMImportePago ;
   private long A2FMId ;
   private long A21FMIdNetMovimiento ;
   private long A25FMNumero ;
   private long A27FMImporte ;
   private long A28FMIdUsuarioNet ;
   private long A29FMTipoMovimiento ;
   private long A30FMImportePago ;
   private long A176FMSaldoActual ;
   private long Z176FMSaldoActual ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long ZZ2FMId ;
   private long ZZ21FMIdNetMovimiento ;
   private long ZZ25FMNumero ;
   private long ZZ27FMImporte ;
   private long ZZ28FMIdUsuarioNet ;
   private long ZZ29FMTipoMovimiento ;
   private long ZZ30FMImportePago ;
   private long ZZ176FMSaldoActual ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFMId_Internalname ;
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
   private String edtFMId_Jsonclick ;
   private String edtFMIdNetMovimiento_Internalname ;
   private String edtFMIdNetMovimiento_Jsonclick ;
   private String edtFMFechaEmision_Internalname ;
   private String edtFMFechaEmision_Jsonclick ;
   private String edtFMFechaVencimiento_Internalname ;
   private String edtFMFechaVencimiento_Jsonclick ;
   private String edtFMTipo_Internalname ;
   private String edtFMTipo_Jsonclick ;
   private String edtFMNumero_Internalname ;
   private String edtFMNumero_Jsonclick ;
   private String edtFMDetalle_Internalname ;
   private String edtFMImporte_Internalname ;
   private String edtFMImporte_Jsonclick ;
   private String edtFMIdUsuarioNet_Internalname ;
   private String edtFMIdUsuarioNet_Jsonclick ;
   private String edtFMTipoMovimiento_Internalname ;
   private String edtFMTipoMovimiento_Jsonclick ;
   private String edtFMImportePago_Internalname ;
   private String edtFMImportePago_Jsonclick ;
   private String edtFMPathPdf_Internalname ;
   private String edtFMSaldoActual_Internalname ;
   private String edtFMSaldoActual_Jsonclick ;
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
   private String sMode2 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z22FMFechaEmision ;
   private java.util.Date Z23FMFechaVencimiento ;
   private java.util.Date A22FMFechaEmision ;
   private java.util.Date A23FMFechaVencimiento ;
   private java.util.Date ZZ22FMFechaEmision ;
   private java.util.Date ZZ23FMFechaVencimiento ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n21FMIdNetMovimiento ;
   private boolean n22FMFechaEmision ;
   private boolean n23FMFechaVencimiento ;
   private boolean n24FMTipo ;
   private boolean n25FMNumero ;
   private boolean n26FMDetalle ;
   private boolean n27FMImporte ;
   private boolean n28FMIdUsuarioNet ;
   private boolean n29FMTipoMovimiento ;
   private boolean n30FMImportePago ;
   private boolean n31FMPathPdf ;
   private boolean Gx_longc ;
   private String Z24FMTipo ;
   private String Z26FMDetalle ;
   private String Z31FMPathPdf ;
   private String A24FMTipo ;
   private String A26FMDetalle ;
   private String A31FMPathPdf ;
   private String ZZ24FMTipo ;
   private String ZZ26FMDetalle ;
   private String ZZ31FMPathPdf ;
   private IDataStoreProvider pr_default ;
   private long[] T00024_A2FMId ;
   private long[] T00024_A21FMIdNetMovimiento ;
   private boolean[] T00024_n21FMIdNetMovimiento ;
   private java.util.Date[] T00024_A22FMFechaEmision ;
   private boolean[] T00024_n22FMFechaEmision ;
   private java.util.Date[] T00024_A23FMFechaVencimiento ;
   private boolean[] T00024_n23FMFechaVencimiento ;
   private String[] T00024_A24FMTipo ;
   private boolean[] T00024_n24FMTipo ;
   private long[] T00024_A25FMNumero ;
   private boolean[] T00024_n25FMNumero ;
   private String[] T00024_A26FMDetalle ;
   private boolean[] T00024_n26FMDetalle ;
   private long[] T00024_A27FMImporte ;
   private boolean[] T00024_n27FMImporte ;
   private long[] T00024_A28FMIdUsuarioNet ;
   private boolean[] T00024_n28FMIdUsuarioNet ;
   private long[] T00024_A29FMTipoMovimiento ;
   private boolean[] T00024_n29FMTipoMovimiento ;
   private long[] T00024_A30FMImportePago ;
   private boolean[] T00024_n30FMImportePago ;
   private String[] T00024_A31FMPathPdf ;
   private boolean[] T00024_n31FMPathPdf ;
   private long[] T00025_A2FMId ;
   private long[] T00023_A2FMId ;
   private long[] T00023_A21FMIdNetMovimiento ;
   private boolean[] T00023_n21FMIdNetMovimiento ;
   private java.util.Date[] T00023_A22FMFechaEmision ;
   private boolean[] T00023_n22FMFechaEmision ;
   private java.util.Date[] T00023_A23FMFechaVencimiento ;
   private boolean[] T00023_n23FMFechaVencimiento ;
   private String[] T00023_A24FMTipo ;
   private boolean[] T00023_n24FMTipo ;
   private long[] T00023_A25FMNumero ;
   private boolean[] T00023_n25FMNumero ;
   private String[] T00023_A26FMDetalle ;
   private boolean[] T00023_n26FMDetalle ;
   private long[] T00023_A27FMImporte ;
   private boolean[] T00023_n27FMImporte ;
   private long[] T00023_A28FMIdUsuarioNet ;
   private boolean[] T00023_n28FMIdUsuarioNet ;
   private long[] T00023_A29FMTipoMovimiento ;
   private boolean[] T00023_n29FMTipoMovimiento ;
   private long[] T00023_A30FMImportePago ;
   private boolean[] T00023_n30FMImportePago ;
   private String[] T00023_A31FMPathPdf ;
   private boolean[] T00023_n31FMPathPdf ;
   private long[] T00026_A2FMId ;
   private long[] T00027_A2FMId ;
   private long[] T00022_A2FMId ;
   private long[] T00022_A21FMIdNetMovimiento ;
   private boolean[] T00022_n21FMIdNetMovimiento ;
   private java.util.Date[] T00022_A22FMFechaEmision ;
   private boolean[] T00022_n22FMFechaEmision ;
   private java.util.Date[] T00022_A23FMFechaVencimiento ;
   private boolean[] T00022_n23FMFechaVencimiento ;
   private String[] T00022_A24FMTipo ;
   private boolean[] T00022_n24FMTipo ;
   private long[] T00022_A25FMNumero ;
   private boolean[] T00022_n25FMNumero ;
   private String[] T00022_A26FMDetalle ;
   private boolean[] T00022_n26FMDetalle ;
   private long[] T00022_A27FMImporte ;
   private boolean[] T00022_n27FMImporte ;
   private long[] T00022_A28FMIdUsuarioNet ;
   private boolean[] T00022_n28FMIdUsuarioNet ;
   private long[] T00022_A29FMTipoMovimiento ;
   private boolean[] T00022_n29FMTipoMovimiento ;
   private long[] T00022_A30FMImportePago ;
   private boolean[] T00022_n30FMImportePago ;
   private String[] T00022_A31FMPathPdf ;
   private boolean[] T00022_n31FMPathPdf ;
   private long[] T000211_A2FMId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class facturamovimiento__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class facturamovimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00022", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00023", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00024", "SELECT TM1.`FMId`, TM1.`FMIdNetMovimiento`, TM1.`FMFechaEmision`, TM1.`FMFechaVencimiento`, TM1.`FMTipo`, TM1.`FMNumero`, TM1.`FMDetalle`, TM1.`FMImporte`, TM1.`FMIdUsuarioNet`, TM1.`FMTipoMovimiento`, TM1.`FMImportePago`, TM1.`FMPathPdf` FROM `FacturaMovimiento` TM1 WHERE TM1.`FMId` = ? ORDER BY TM1.`FMId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00025", "SELECT `FMId` FROM `FacturaMovimiento` WHERE `FMId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00026", "SELECT `FMId` FROM `FacturaMovimiento` WHERE ( `FMId` > ?) ORDER BY `FMId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00027", "SELECT `FMId` FROM `FacturaMovimiento` WHERE ( `FMId` < ?) ORDER BY `FMId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00028", "INSERT INTO `FacturaMovimiento`(`FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00029", "UPDATE `FacturaMovimiento` SET `FMIdNetMovimiento`=?, `FMFechaEmision`=?, `FMFechaVencimiento`=?, `FMTipo`=?, `FMNumero`=?, `FMDetalle`=?, `FMImporte`=?, `FMIdUsuarioNet`=?, `FMTipoMovimiento`=?, `FMImportePago`=?, `FMPathPdf`=?  WHERE `FMId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000210", "DELETE FROM `FacturaMovimiento`  WHERE `FMId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000211", "SELECT `FMId` FROM `FacturaMovimiento` ORDER BY `FMId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 45);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 200);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[16]).longValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[18]).longValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 500);
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 45);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[17]).longValue());
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 500);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

