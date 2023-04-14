package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cliente_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Cliente", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtClienteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public cliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cliente_impl.class ));
   }

   public cliente_impl( int remoteHandle ,
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Cliente", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Cliente.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 4, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.colaveco.gx0040"+"',["+"{Ctrl:gx.dom.el('"+"CLIENTEID"+"'), id:'"+"CLIENTEID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Cliente.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteId_Internalname, GXutil.ltrim( localUtil.ntoc( A4ClienteId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4ClienteId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4ClienteId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombre_Internalname, A45ClienteNombre, GXutil.rtrim( localUtil.format( A45ClienteNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteEmail_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteEmail_Internalname, A46ClienteEmail, GXutil.rtrim( localUtil.format( A46ClienteEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteEmail_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteEmail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreEmail1_Internalname, "Nombre Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreEmail1_Internalname, A47ClienteNombreEmail1, GXutil.rtrim( localUtil.format( A47ClienteNombreEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteEmail1_Internalname, "Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteEmail1_Internalname, A48ClienteEmail1, GXutil.rtrim( localUtil.format( A48ClienteEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreEmail2_Internalname, "Nombre Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreEmail2_Internalname, A49ClienteNombreEmail2, GXutil.rtrim( localUtil.format( A49ClienteNombreEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteEmail2_Internalname, "Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteEmail2_Internalname, A50ClienteEmail2, GXutil.rtrim( localUtil.format( A50ClienteEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteEnvio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteEnvio_Internalname, "Envio", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtClienteEnvio_Internalname, A51ClienteEnvio, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtClienteEnvio_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteUsuarioWeb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteUsuarioWeb_Internalname, "Usuario Web", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteUsuarioWeb_Internalname, A52ClienteUsuarioWeb, GXutil.rtrim( localUtil.format( A52ClienteUsuarioWeb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteUsuarioWeb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteUsuarioWeb_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreCelular1_Internalname, "Nombre Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreCelular1_Internalname, A53ClienteNombreCelular1, GXutil.rtrim( localUtil.format( A53ClienteNombreCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCelular1_Internalname, "Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCelular1_Internalname, A54ClienteCelular1, GXutil.rtrim( localUtil.format( A54ClienteCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreCelular2_Internalname, "Nombre Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreCelular2_Internalname, A55ClienteNombreCelular2, GXutil.rtrim( localUtil.format( A55ClienteNombreCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCelular2_Internalname, "Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCelular2_Internalname, A56ClienteCelular2, GXutil.rtrim( localUtil.format( A56ClienteCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCodigoFigaro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCodigoFigaro_Internalname, "Codigo Figaro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCodigoFigaro_Internalname, A57ClienteCodigoFigaro, GXutil.rtrim( localUtil.format( A57ClienteCodigoFigaro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCodigoFigaro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCodigoFigaro_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteTipoUsuario_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteTipoUsuario_Internalname, "Tipo Usuario", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteTipoUsuario_Internalname, GXutil.ltrim( localUtil.ntoc( A58ClienteTipoUsuario, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteTipoUsuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteTipoUsuario_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteTipoUsuario_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteDireccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteDireccion_Internalname, "Direccion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtClienteDireccion_Internalname, A59ClienteDireccion, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), 1, edtClienteDireccion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreTelefono1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreTelefono1_Internalname, "Nombre Telefono1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreTelefono1_Internalname, A60ClienteNombreTelefono1, GXutil.rtrim( localUtil.format( A60ClienteNombreTelefono1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreTelefono1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreTelefono1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteTelefono1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteTelefono1_Internalname, "Telefono1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteTelefono1_Internalname, A61ClienteTelefono1, GXutil.rtrim( localUtil.format( A61ClienteTelefono1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteTelefono1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteTelefono1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNombreTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNombreTelefono2_Internalname, "Nombre Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNombreTelefono2_Internalname, A62ClienteNombreTelefono2, GXutil.rtrim( localUtil.format( A62ClienteNombreTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNombreTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNombreTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteTelefono2_Internalname, "Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteTelefono2_Internalname, A63ClienteTelefono2, GXutil.rtrim( localUtil.format( A63ClienteTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFax_Internalname, "Fax", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFax_Internalname, A64ClienteFax, GXutil.rtrim( localUtil.format( A64ClienteFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFax_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteDicose_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteDicose_Internalname, "Dicose", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteDicose_Internalname, A65ClienteDicose, GXutil.rtrim( localUtil.format( A65ClienteDicose, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteDicose_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteDicose_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "dicose", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteIdDepartamento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteIdDepartamento_Internalname, "Id Departamento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteIdDepartamento_Internalname, GXutil.ltrim( localUtil.ntoc( A66ClienteIdDepartamento, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteIdDepartamento_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteIdDepartamento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteIdDepartamento_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteIdLocalidad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteIdLocalidad_Internalname, "Id Localidad", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteIdLocalidad_Internalname, GXutil.ltrim( localUtil.ntoc( A67ClienteIdLocalidad, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteIdLocalidad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteIdLocalidad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteIdLocalidad_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteTecnico1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteTecnico1_Internalname, "Tecnico1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteTecnico1_Internalname, GXutil.ltrim( localUtil.ntoc( A68ClienteTecnico1, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteTecnico1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A68ClienteTecnico1), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A68ClienteTecnico1), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteTecnico1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteTecnico1_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteTecnico2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteTecnico2_Internalname, "Tecnico2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteTecnico2_Internalname, GXutil.ltrim( localUtil.ntoc( A69ClienteTecnico2, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteTecnico2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A69ClienteTecnico2), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A69ClienteTecnico2), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteTecnico2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteTecnico2_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteIdAgencia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteIdAgencia_Internalname, "Id Agencia", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteIdAgencia_Internalname, GXutil.ltrim( localUtil.ntoc( A70ClienteIdAgencia, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteIdAgencia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A70ClienteIdAgencia), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A70ClienteIdAgencia), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteIdAgencia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteIdAgencia_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteContrato_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteContrato_Internalname, "Contrato", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteContrato_Internalname, GXutil.ltrim( localUtil.ntoc( A71ClienteContrato, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteContrato_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A71ClienteContrato), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A71ClienteContrato), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteContrato_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteContrato_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteSocio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteSocio_Internalname, "Socio", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteSocio_Internalname, GXutil.ltrim( localUtil.ntoc( A72ClienteSocio, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteSocio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A72ClienteSocio), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A72ClienteSocio), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteSocio_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteSocio_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNoUsar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNoUsar_Internalname, "No Usar", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNoUsar_Internalname, GXutil.ltrim( localUtil.ntoc( A73ClienteNoUsar, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteNoUsar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A73ClienteNoUsar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A73ClienteNoUsar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNoUsar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNoUsar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCodbar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCodbar_Internalname, "Codbar", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCodbar_Internalname, GXutil.ltrim( localUtil.ntoc( A74ClienteCodbar, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteCodbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A74ClienteCodbar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A74ClienteCodbar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCodbar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCodbar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCaravanas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCaravanas_Internalname, "Caravanas", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCaravanas_Internalname, GXutil.ltrim( localUtil.ntoc( A75ClienteCaravanas, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteCaravanas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A75ClienteCaravanas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A75ClienteCaravanas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCaravanas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCaravanas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteProlesa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteProlesa_Internalname, "Prolesa", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteProlesa_Internalname, GXutil.ltrim( localUtil.ntoc( A76ClienteProlesa, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteProlesa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A76ClienteProlesa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A76ClienteProlesa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteProlesa_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteProlesa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteProlesaSuc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteProlesaSuc_Internalname, "Prolesa Suc", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteProlesaSuc_Internalname, GXutil.ltrim( localUtil.ntoc( A77ClienteProlesaSuc, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteProlesaSuc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteProlesaSuc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteProlesaSuc_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteProlesaMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteProlesaMat_Internalname, "Prolesa Mat", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteProlesaMat_Internalname, GXutil.ltrim( localUtil.ntoc( A168ClienteProlesaMat, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteProlesaMat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A168ClienteProlesaMat), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A168ClienteProlesaMat), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteProlesaMat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteProlesaMat_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteObservaciones_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteObservaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtClienteObservaciones_Internalname, A78ClienteObservaciones, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", (short)(0), 1, edtClienteObservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacRsocial_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacRsocial_Internalname, "Fac Rsocial", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacRsocial_Internalname, A79ClienteFacRsocial, GXutil.rtrim( localUtil.format( A79ClienteFacRsocial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacRsocial_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacRsocial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacCedula_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacCedula_Internalname, "Fac Cedula", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacCedula_Internalname, A80ClienteFacCedula, GXutil.rtrim( localUtil.format( A80ClienteFacCedula, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacCedula_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacCedula_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacRut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacRut_Internalname, "Fac Rut", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacRut_Internalname, A81ClienteFacRut, GXutil.rtrim( localUtil.format( A81ClienteFacRut, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacRut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacRut_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacDireccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacDireccion_Internalname, "Fac Direccion", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtClienteFacDireccion_Internalname, A82ClienteFacDireccion, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", (short)(0), 1, edtClienteFacDireccion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacLocalidad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacLocalidad_Internalname, "Fac Localidad", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacLocalidad_Internalname, A83ClienteFacLocalidad, GXutil.rtrim( localUtil.format( A83ClienteFacLocalidad, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacLocalidad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacLocalidad_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacDepartamento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacDepartamento_Internalname, "Fac Departamento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacDepartamento_Internalname, GXutil.ltrim( localUtil.ntoc( A84ClienteFacDepartamento, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteFacDepartamento_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacDepartamento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacDepartamento_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacCpostal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacCpostal_Internalname, "Fac Cpostal", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacCpostal_Internalname, A85ClienteFacCpostal, GXutil.rtrim( localUtil.format( A85ClienteFacCpostal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacCpostal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacCpostal_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacGiro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacGiro_Internalname, "Fac Giro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacGiro_Internalname, GXutil.ltrim( localUtil.ntoc( A86ClienteFacGiro, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteFacGiro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A86ClienteFacGiro), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A86ClienteFacGiro), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacGiro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacGiro_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreTelefono1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreTelefono1_Internalname, "Nombre Telefono1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreTelefono1_Internalname, A87ClienteCobNombreTelefono1, GXutil.rtrim( localUtil.format( A87ClienteCobNombreTelefono1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreTelefono1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreTelefono1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacTelefonos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacTelefonos_Internalname, "Fac Telefonos", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacTelefonos_Internalname, A88ClienteFacTelefonos, GXutil.rtrim( localUtil.format( A88ClienteFacTelefonos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacTelefonos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacTelefonos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreTelefono2_Internalname, "Nombre Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreTelefono2_Internalname, A89ClienteCobNombreTelefono2, GXutil.rtrim( localUtil.format( A89ClienteCobNombreTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobTelefono2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobTelefono2_Internalname, "Cob Telefono2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobTelefono2_Internalname, A90ClienteCobTelefono2, GXutil.rtrim( localUtil.format( A90ClienteCobTelefono2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobTelefono2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobTelefono2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreCelular1_Internalname, "Nombre Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreCelular1_Internalname, A91ClienteCobNombreCelular1, GXutil.rtrim( localUtil.format( A91ClienteCobNombreCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobCelular1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobCelular1_Internalname, "Cob Celular1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobCelular1_Internalname, A92ClienteCobCelular1, GXutil.rtrim( localUtil.format( A92ClienteCobCelular1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobCelular1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobCelular1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreCelular2_Internalname, "Nombre Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreCelular2_Internalname, A93ClienteCobNombreCelular2, GXutil.rtrim( localUtil.format( A93ClienteCobNombreCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobCelular2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobCelular2_Internalname, "Cob Celular2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobCelular2_Internalname, A94ClienteCobCelular2, GXutil.rtrim( localUtil.format( A94ClienteCobCelular2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobCelular2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobCelular2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreEmail1_Internalname, "Nombre Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreEmail1_Internalname, A95ClienteCobNombreEmail1, GXutil.rtrim( localUtil.format( A95ClienteCobNombreEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobEmail1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobEmail1_Internalname, "Cob Email1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobEmail1_Internalname, A96ClienteCobEmail1, GXutil.rtrim( localUtil.format( A96ClienteCobEmail1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobEmail1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobEmail1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobNombreEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobNombreEmail2_Internalname, "Nombre Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobNombreEmail2_Internalname, A97ClienteCobNombreEmail2, GXutil.rtrim( localUtil.format( A97ClienteCobNombreEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobNombreEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobNombreEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "nombres", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteCobEmail2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteCobEmail2_Internalname, "Cob Email2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteCobEmail2_Internalname, A98ClienteCobEmail2, GXutil.rtrim( localUtil.format( A98ClienteCobEmail2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteCobEmail2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteCobEmail2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacFax_Internalname, "Fac Fax", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacFax_Internalname, A99ClienteFacFax, GXutil.rtrim( localUtil.format( A99ClienteFacFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacFax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacFax_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "celular", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacEmail_Internalname, "Fac Email", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacEmail_Internalname, A100ClienteFacEmail, GXutil.rtrim( localUtil.format( A100ClienteFacEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,319);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacEmail_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacEmail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacContrato_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacContrato_Internalname, "Fac Contrato", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacContrato_Internalname, A101ClienteFacContrato, GXutil.rtrim( localUtil.format( A101ClienteFacContrato, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,324);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacContrato_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacContrato_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacObservaciones_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacObservaciones_Internalname, "Fac Observaciones", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtClienteFacObservaciones_Internalname, A102ClienteFacObservaciones, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,329);\"", (short)(0), 1, edtClienteFacObservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacLista_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacLista_Internalname, "Fac Lista", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacLista_Internalname, GXutil.ltrim( localUtil.ntoc( A103ClienteFacLista, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteFacLista_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A103ClienteFacLista), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A103ClienteFacLista), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,334);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacLista_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacLista_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteFacContado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteFacContado_Internalname, "Fac Contado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 339,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteFacContado_Internalname, GXutil.ltrim( localUtil.ntoc( A104ClienteFacContado, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteFacContado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A104ClienteFacContado), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A104ClienteFacContado), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,339);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteFacContado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteFacContado_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailFrascos1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailFrascos1_Internalname, "Email Frascos1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailFrascos1_Internalname, A105ClienteNotEmailFrascos1, GXutil.rtrim( localUtil.format( A105ClienteNotEmailFrascos1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,344);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailFrascos1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailFrascos1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailFrascos2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailFrascos2_Internalname, "Email Frascos2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailFrascos2_Internalname, A106ClienteNotEmailFrascos2, GXutil.rtrim( localUtil.format( A106ClienteNotEmailFrascos2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,349);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailFrascos2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailFrascos2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailMuestra1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailMuestra1_Internalname, "Email Muestra1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailMuestra1_Internalname, A107ClienteNotEmailMuestra1, GXutil.rtrim( localUtil.format( A107ClienteNotEmailMuestra1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailMuestra1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailMuestra1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailMuestra2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailMuestra2_Internalname, "Email Muestra2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailMuestra2_Internalname, A108ClienteNotEmailMuestra2, GXutil.rtrim( localUtil.format( A108ClienteNotEmailMuestra2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailMuestra2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailMuestra2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailAnalisis1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailAnalisis1_Internalname, "Email Analisis1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailAnalisis1_Internalname, A109ClienteNotEmailAnalisis1, GXutil.rtrim( localUtil.format( A109ClienteNotEmailAnalisis1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailAnalisis1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailAnalisis1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailAnalisis2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailAnalisis2_Internalname, "Email Analisis2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailAnalisis2_Internalname, A110ClienteNotEmailAnalisis2, GXutil.rtrim( localUtil.format( A110ClienteNotEmailAnalisis2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,369);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailAnalisis2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailAnalisis2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailGeneral1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailGeneral1_Internalname, "Email General1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailGeneral1_Internalname, A111ClienteNotEmailGeneral1, GXutil.rtrim( localUtil.format( A111ClienteNotEmailGeneral1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,374);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailGeneral1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailGeneral1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteNotEmailGeneral2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteNotEmailGeneral2_Internalname, "Email General2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 379,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteNotEmailGeneral2_Internalname, A112ClienteNotEmailGeneral2, GXutil.rtrim( localUtil.format( A112ClienteNotEmailGeneral2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,379);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteNotEmailGeneral2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteNotEmailGeneral2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "email", "left", true, "", "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClienteIncobrable_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtClienteIncobrable_Internalname, "Incobrable", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 384,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtClienteIncobrable_Internalname, GXutil.ltrim( localUtil.ntoc( A113ClienteIncobrable, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( ((edtClienteIncobrable_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A113ClienteIncobrable), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A113ClienteIncobrable), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,384);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClienteIncobrable_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtClienteIncobrable_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Cliente.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 389,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 393,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Cliente.htm");
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
         Z4ClienteId = localUtil.ctol( httpContext.cgiGet( "Z4ClienteId"), ".", ",") ;
         Z45ClienteNombre = httpContext.cgiGet( "Z45ClienteNombre") ;
         n45ClienteNombre = ((GXutil.strcmp("", A45ClienteNombre)==0) ? true : false) ;
         Z46ClienteEmail = httpContext.cgiGet( "Z46ClienteEmail") ;
         n46ClienteEmail = ((GXutil.strcmp("", A46ClienteEmail)==0) ? true : false) ;
         Z47ClienteNombreEmail1 = httpContext.cgiGet( "Z47ClienteNombreEmail1") ;
         n47ClienteNombreEmail1 = ((GXutil.strcmp("", A47ClienteNombreEmail1)==0) ? true : false) ;
         Z48ClienteEmail1 = httpContext.cgiGet( "Z48ClienteEmail1") ;
         n48ClienteEmail1 = ((GXutil.strcmp("", A48ClienteEmail1)==0) ? true : false) ;
         Z49ClienteNombreEmail2 = httpContext.cgiGet( "Z49ClienteNombreEmail2") ;
         n49ClienteNombreEmail2 = ((GXutil.strcmp("", A49ClienteNombreEmail2)==0) ? true : false) ;
         Z50ClienteEmail2 = httpContext.cgiGet( "Z50ClienteEmail2") ;
         n50ClienteEmail2 = ((GXutil.strcmp("", A50ClienteEmail2)==0) ? true : false) ;
         Z51ClienteEnvio = httpContext.cgiGet( "Z51ClienteEnvio") ;
         n51ClienteEnvio = ((GXutil.strcmp("", A51ClienteEnvio)==0) ? true : false) ;
         Z52ClienteUsuarioWeb = httpContext.cgiGet( "Z52ClienteUsuarioWeb") ;
         n52ClienteUsuarioWeb = ((GXutil.strcmp("", A52ClienteUsuarioWeb)==0) ? true : false) ;
         Z53ClienteNombreCelular1 = httpContext.cgiGet( "Z53ClienteNombreCelular1") ;
         n53ClienteNombreCelular1 = ((GXutil.strcmp("", A53ClienteNombreCelular1)==0) ? true : false) ;
         Z54ClienteCelular1 = httpContext.cgiGet( "Z54ClienteCelular1") ;
         n54ClienteCelular1 = ((GXutil.strcmp("", A54ClienteCelular1)==0) ? true : false) ;
         Z55ClienteNombreCelular2 = httpContext.cgiGet( "Z55ClienteNombreCelular2") ;
         n55ClienteNombreCelular2 = ((GXutil.strcmp("", A55ClienteNombreCelular2)==0) ? true : false) ;
         Z56ClienteCelular2 = httpContext.cgiGet( "Z56ClienteCelular2") ;
         n56ClienteCelular2 = ((GXutil.strcmp("", A56ClienteCelular2)==0) ? true : false) ;
         Z57ClienteCodigoFigaro = httpContext.cgiGet( "Z57ClienteCodigoFigaro") ;
         n57ClienteCodigoFigaro = ((GXutil.strcmp("", A57ClienteCodigoFigaro)==0) ? true : false) ;
         Z58ClienteTipoUsuario = (short)(localUtil.ctol( httpContext.cgiGet( "Z58ClienteTipoUsuario"), ".", ",")) ;
         n58ClienteTipoUsuario = ((0==A58ClienteTipoUsuario) ? true : false) ;
         Z59ClienteDireccion = httpContext.cgiGet( "Z59ClienteDireccion") ;
         n59ClienteDireccion = ((GXutil.strcmp("", A59ClienteDireccion)==0) ? true : false) ;
         Z60ClienteNombreTelefono1 = httpContext.cgiGet( "Z60ClienteNombreTelefono1") ;
         n60ClienteNombreTelefono1 = ((GXutil.strcmp("", A60ClienteNombreTelefono1)==0) ? true : false) ;
         Z61ClienteTelefono1 = httpContext.cgiGet( "Z61ClienteTelefono1") ;
         n61ClienteTelefono1 = ((GXutil.strcmp("", A61ClienteTelefono1)==0) ? true : false) ;
         Z62ClienteNombreTelefono2 = httpContext.cgiGet( "Z62ClienteNombreTelefono2") ;
         n62ClienteNombreTelefono2 = ((GXutil.strcmp("", A62ClienteNombreTelefono2)==0) ? true : false) ;
         Z63ClienteTelefono2 = httpContext.cgiGet( "Z63ClienteTelefono2") ;
         n63ClienteTelefono2 = ((GXutil.strcmp("", A63ClienteTelefono2)==0) ? true : false) ;
         Z64ClienteFax = httpContext.cgiGet( "Z64ClienteFax") ;
         n64ClienteFax = ((GXutil.strcmp("", A64ClienteFax)==0) ? true : false) ;
         Z65ClienteDicose = httpContext.cgiGet( "Z65ClienteDicose") ;
         n65ClienteDicose = ((GXutil.strcmp("", A65ClienteDicose)==0) ? true : false) ;
         Z66ClienteIdDepartamento = localUtil.ctol( httpContext.cgiGet( "Z66ClienteIdDepartamento"), ".", ",") ;
         n66ClienteIdDepartamento = ((0==A66ClienteIdDepartamento) ? true : false) ;
         Z67ClienteIdLocalidad = localUtil.ctol( httpContext.cgiGet( "Z67ClienteIdLocalidad"), ".", ",") ;
         n67ClienteIdLocalidad = ((0==A67ClienteIdLocalidad) ? true : false) ;
         Z68ClienteTecnico1 = localUtil.ctol( httpContext.cgiGet( "Z68ClienteTecnico1"), ".", ",") ;
         n68ClienteTecnico1 = ((0==A68ClienteTecnico1) ? true : false) ;
         Z69ClienteTecnico2 = localUtil.ctol( httpContext.cgiGet( "Z69ClienteTecnico2"), ".", ",") ;
         n69ClienteTecnico2 = ((0==A69ClienteTecnico2) ? true : false) ;
         Z70ClienteIdAgencia = localUtil.ctol( httpContext.cgiGet( "Z70ClienteIdAgencia"), ".", ",") ;
         n70ClienteIdAgencia = ((0==A70ClienteIdAgencia) ? true : false) ;
         Z71ClienteContrato = (short)(localUtil.ctol( httpContext.cgiGet( "Z71ClienteContrato"), ".", ",")) ;
         n71ClienteContrato = ((0==A71ClienteContrato) ? true : false) ;
         Z72ClienteSocio = (short)(localUtil.ctol( httpContext.cgiGet( "Z72ClienteSocio"), ".", ",")) ;
         n72ClienteSocio = ((0==A72ClienteSocio) ? true : false) ;
         Z73ClienteNoUsar = (short)(localUtil.ctol( httpContext.cgiGet( "Z73ClienteNoUsar"), ".", ",")) ;
         n73ClienteNoUsar = ((0==A73ClienteNoUsar) ? true : false) ;
         Z74ClienteCodbar = (short)(localUtil.ctol( httpContext.cgiGet( "Z74ClienteCodbar"), ".", ",")) ;
         n74ClienteCodbar = ((0==A74ClienteCodbar) ? true : false) ;
         Z75ClienteCaravanas = (short)(localUtil.ctol( httpContext.cgiGet( "Z75ClienteCaravanas"), ".", ",")) ;
         n75ClienteCaravanas = ((0==A75ClienteCaravanas) ? true : false) ;
         Z76ClienteProlesa = (short)(localUtil.ctol( httpContext.cgiGet( "Z76ClienteProlesa"), ".", ",")) ;
         n76ClienteProlesa = ((0==A76ClienteProlesa) ? true : false) ;
         Z77ClienteProlesaSuc = localUtil.ctol( httpContext.cgiGet( "Z77ClienteProlesaSuc"), ".", ",") ;
         n77ClienteProlesaSuc = ((0==A77ClienteProlesaSuc) ? true : false) ;
         Z168ClienteProlesaMat = localUtil.ctol( httpContext.cgiGet( "Z168ClienteProlesaMat"), ".", ",") ;
         Z78ClienteObservaciones = httpContext.cgiGet( "Z78ClienteObservaciones") ;
         n78ClienteObservaciones = ((GXutil.strcmp("", A78ClienteObservaciones)==0) ? true : false) ;
         Z79ClienteFacRsocial = httpContext.cgiGet( "Z79ClienteFacRsocial") ;
         n79ClienteFacRsocial = ((GXutil.strcmp("", A79ClienteFacRsocial)==0) ? true : false) ;
         Z80ClienteFacCedula = httpContext.cgiGet( "Z80ClienteFacCedula") ;
         n80ClienteFacCedula = ((GXutil.strcmp("", A80ClienteFacCedula)==0) ? true : false) ;
         Z81ClienteFacRut = httpContext.cgiGet( "Z81ClienteFacRut") ;
         n81ClienteFacRut = ((GXutil.strcmp("", A81ClienteFacRut)==0) ? true : false) ;
         Z82ClienteFacDireccion = httpContext.cgiGet( "Z82ClienteFacDireccion") ;
         n82ClienteFacDireccion = ((GXutil.strcmp("", A82ClienteFacDireccion)==0) ? true : false) ;
         Z83ClienteFacLocalidad = httpContext.cgiGet( "Z83ClienteFacLocalidad") ;
         n83ClienteFacLocalidad = ((GXutil.strcmp("", A83ClienteFacLocalidad)==0) ? true : false) ;
         Z84ClienteFacDepartamento = localUtil.ctol( httpContext.cgiGet( "Z84ClienteFacDepartamento"), ".", ",") ;
         n84ClienteFacDepartamento = ((0==A84ClienteFacDepartamento) ? true : false) ;
         Z85ClienteFacCpostal = httpContext.cgiGet( "Z85ClienteFacCpostal") ;
         n85ClienteFacCpostal = ((GXutil.strcmp("", A85ClienteFacCpostal)==0) ? true : false) ;
         Z86ClienteFacGiro = localUtil.ctol( httpContext.cgiGet( "Z86ClienteFacGiro"), ".", ",") ;
         n86ClienteFacGiro = ((0==A86ClienteFacGiro) ? true : false) ;
         Z87ClienteCobNombreTelefono1 = httpContext.cgiGet( "Z87ClienteCobNombreTelefono1") ;
         n87ClienteCobNombreTelefono1 = ((GXutil.strcmp("", A87ClienteCobNombreTelefono1)==0) ? true : false) ;
         Z88ClienteFacTelefonos = httpContext.cgiGet( "Z88ClienteFacTelefonos") ;
         n88ClienteFacTelefonos = ((GXutil.strcmp("", A88ClienteFacTelefonos)==0) ? true : false) ;
         Z89ClienteCobNombreTelefono2 = httpContext.cgiGet( "Z89ClienteCobNombreTelefono2") ;
         n89ClienteCobNombreTelefono2 = ((GXutil.strcmp("", A89ClienteCobNombreTelefono2)==0) ? true : false) ;
         Z90ClienteCobTelefono2 = httpContext.cgiGet( "Z90ClienteCobTelefono2") ;
         n90ClienteCobTelefono2 = ((GXutil.strcmp("", A90ClienteCobTelefono2)==0) ? true : false) ;
         Z91ClienteCobNombreCelular1 = httpContext.cgiGet( "Z91ClienteCobNombreCelular1") ;
         n91ClienteCobNombreCelular1 = ((GXutil.strcmp("", A91ClienteCobNombreCelular1)==0) ? true : false) ;
         Z92ClienteCobCelular1 = httpContext.cgiGet( "Z92ClienteCobCelular1") ;
         n92ClienteCobCelular1 = ((GXutil.strcmp("", A92ClienteCobCelular1)==0) ? true : false) ;
         Z93ClienteCobNombreCelular2 = httpContext.cgiGet( "Z93ClienteCobNombreCelular2") ;
         n93ClienteCobNombreCelular2 = ((GXutil.strcmp("", A93ClienteCobNombreCelular2)==0) ? true : false) ;
         Z94ClienteCobCelular2 = httpContext.cgiGet( "Z94ClienteCobCelular2") ;
         n94ClienteCobCelular2 = ((GXutil.strcmp("", A94ClienteCobCelular2)==0) ? true : false) ;
         Z95ClienteCobNombreEmail1 = httpContext.cgiGet( "Z95ClienteCobNombreEmail1") ;
         n95ClienteCobNombreEmail1 = ((GXutil.strcmp("", A95ClienteCobNombreEmail1)==0) ? true : false) ;
         Z96ClienteCobEmail1 = httpContext.cgiGet( "Z96ClienteCobEmail1") ;
         n96ClienteCobEmail1 = ((GXutil.strcmp("", A96ClienteCobEmail1)==0) ? true : false) ;
         Z97ClienteCobNombreEmail2 = httpContext.cgiGet( "Z97ClienteCobNombreEmail2") ;
         n97ClienteCobNombreEmail2 = ((GXutil.strcmp("", A97ClienteCobNombreEmail2)==0) ? true : false) ;
         Z98ClienteCobEmail2 = httpContext.cgiGet( "Z98ClienteCobEmail2") ;
         n98ClienteCobEmail2 = ((GXutil.strcmp("", A98ClienteCobEmail2)==0) ? true : false) ;
         Z99ClienteFacFax = httpContext.cgiGet( "Z99ClienteFacFax") ;
         n99ClienteFacFax = ((GXutil.strcmp("", A99ClienteFacFax)==0) ? true : false) ;
         Z100ClienteFacEmail = httpContext.cgiGet( "Z100ClienteFacEmail") ;
         n100ClienteFacEmail = ((GXutil.strcmp("", A100ClienteFacEmail)==0) ? true : false) ;
         Z101ClienteFacContrato = httpContext.cgiGet( "Z101ClienteFacContrato") ;
         n101ClienteFacContrato = ((GXutil.strcmp("", A101ClienteFacContrato)==0) ? true : false) ;
         Z102ClienteFacObservaciones = httpContext.cgiGet( "Z102ClienteFacObservaciones") ;
         n102ClienteFacObservaciones = ((GXutil.strcmp("", A102ClienteFacObservaciones)==0) ? true : false) ;
         Z103ClienteFacLista = localUtil.ctol( httpContext.cgiGet( "Z103ClienteFacLista"), ".", ",") ;
         n103ClienteFacLista = ((0==A103ClienteFacLista) ? true : false) ;
         Z104ClienteFacContado = (short)(localUtil.ctol( httpContext.cgiGet( "Z104ClienteFacContado"), ".", ",")) ;
         n104ClienteFacContado = ((0==A104ClienteFacContado) ? true : false) ;
         Z105ClienteNotEmailFrascos1 = httpContext.cgiGet( "Z105ClienteNotEmailFrascos1") ;
         n105ClienteNotEmailFrascos1 = ((GXutil.strcmp("", A105ClienteNotEmailFrascos1)==0) ? true : false) ;
         Z106ClienteNotEmailFrascos2 = httpContext.cgiGet( "Z106ClienteNotEmailFrascos2") ;
         n106ClienteNotEmailFrascos2 = ((GXutil.strcmp("", A106ClienteNotEmailFrascos2)==0) ? true : false) ;
         Z107ClienteNotEmailMuestra1 = httpContext.cgiGet( "Z107ClienteNotEmailMuestra1") ;
         n107ClienteNotEmailMuestra1 = ((GXutil.strcmp("", A107ClienteNotEmailMuestra1)==0) ? true : false) ;
         Z108ClienteNotEmailMuestra2 = httpContext.cgiGet( "Z108ClienteNotEmailMuestra2") ;
         n108ClienteNotEmailMuestra2 = ((GXutil.strcmp("", A108ClienteNotEmailMuestra2)==0) ? true : false) ;
         Z109ClienteNotEmailAnalisis1 = httpContext.cgiGet( "Z109ClienteNotEmailAnalisis1") ;
         n109ClienteNotEmailAnalisis1 = ((GXutil.strcmp("", A109ClienteNotEmailAnalisis1)==0) ? true : false) ;
         Z110ClienteNotEmailAnalisis2 = httpContext.cgiGet( "Z110ClienteNotEmailAnalisis2") ;
         n110ClienteNotEmailAnalisis2 = ((GXutil.strcmp("", A110ClienteNotEmailAnalisis2)==0) ? true : false) ;
         Z111ClienteNotEmailGeneral1 = httpContext.cgiGet( "Z111ClienteNotEmailGeneral1") ;
         n111ClienteNotEmailGeneral1 = ((GXutil.strcmp("", A111ClienteNotEmailGeneral1)==0) ? true : false) ;
         Z112ClienteNotEmailGeneral2 = httpContext.cgiGet( "Z112ClienteNotEmailGeneral2") ;
         n112ClienteNotEmailGeneral2 = ((GXutil.strcmp("", A112ClienteNotEmailGeneral2)==0) ? true : false) ;
         Z113ClienteIncobrable = (short)(localUtil.ctol( httpContext.cgiGet( "Z113ClienteIncobrable"), ".", ",")) ;
         n113ClienteIncobrable = ((0==A113ClienteIncobrable) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteId_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4ClienteId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
         }
         else
         {
            A4ClienteId = localUtil.ctol( httpContext.cgiGet( edtClienteId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
         }
         A45ClienteNombre = httpContext.cgiGet( edtClienteNombre_Internalname) ;
         n45ClienteNombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A45ClienteNombre", A45ClienteNombre);
         n45ClienteNombre = ((GXutil.strcmp("", A45ClienteNombre)==0) ? true : false) ;
         A46ClienteEmail = httpContext.cgiGet( edtClienteEmail_Internalname) ;
         n46ClienteEmail = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A46ClienteEmail", A46ClienteEmail);
         n46ClienteEmail = ((GXutil.strcmp("", A46ClienteEmail)==0) ? true : false) ;
         A47ClienteNombreEmail1 = httpContext.cgiGet( edtClienteNombreEmail1_Internalname) ;
         n47ClienteNombreEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47ClienteNombreEmail1", A47ClienteNombreEmail1);
         n47ClienteNombreEmail1 = ((GXutil.strcmp("", A47ClienteNombreEmail1)==0) ? true : false) ;
         A48ClienteEmail1 = httpContext.cgiGet( edtClienteEmail1_Internalname) ;
         n48ClienteEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A48ClienteEmail1", A48ClienteEmail1);
         n48ClienteEmail1 = ((GXutil.strcmp("", A48ClienteEmail1)==0) ? true : false) ;
         A49ClienteNombreEmail2 = httpContext.cgiGet( edtClienteNombreEmail2_Internalname) ;
         n49ClienteNombreEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A49ClienteNombreEmail2", A49ClienteNombreEmail2);
         n49ClienteNombreEmail2 = ((GXutil.strcmp("", A49ClienteNombreEmail2)==0) ? true : false) ;
         A50ClienteEmail2 = httpContext.cgiGet( edtClienteEmail2_Internalname) ;
         n50ClienteEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50ClienteEmail2", A50ClienteEmail2);
         n50ClienteEmail2 = ((GXutil.strcmp("", A50ClienteEmail2)==0) ? true : false) ;
         A51ClienteEnvio = httpContext.cgiGet( edtClienteEnvio_Internalname) ;
         n51ClienteEnvio = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A51ClienteEnvio", A51ClienteEnvio);
         n51ClienteEnvio = ((GXutil.strcmp("", A51ClienteEnvio)==0) ? true : false) ;
         A52ClienteUsuarioWeb = httpContext.cgiGet( edtClienteUsuarioWeb_Internalname) ;
         n52ClienteUsuarioWeb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52ClienteUsuarioWeb", A52ClienteUsuarioWeb);
         n52ClienteUsuarioWeb = ((GXutil.strcmp("", A52ClienteUsuarioWeb)==0) ? true : false) ;
         A53ClienteNombreCelular1 = httpContext.cgiGet( edtClienteNombreCelular1_Internalname) ;
         n53ClienteNombreCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53ClienteNombreCelular1", A53ClienteNombreCelular1);
         n53ClienteNombreCelular1 = ((GXutil.strcmp("", A53ClienteNombreCelular1)==0) ? true : false) ;
         A54ClienteCelular1 = httpContext.cgiGet( edtClienteCelular1_Internalname) ;
         n54ClienteCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A54ClienteCelular1", A54ClienteCelular1);
         n54ClienteCelular1 = ((GXutil.strcmp("", A54ClienteCelular1)==0) ? true : false) ;
         A55ClienteNombreCelular2 = httpContext.cgiGet( edtClienteNombreCelular2_Internalname) ;
         n55ClienteNombreCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ClienteNombreCelular2", A55ClienteNombreCelular2);
         n55ClienteNombreCelular2 = ((GXutil.strcmp("", A55ClienteNombreCelular2)==0) ? true : false) ;
         A56ClienteCelular2 = httpContext.cgiGet( edtClienteCelular2_Internalname) ;
         n56ClienteCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56ClienteCelular2", A56ClienteCelular2);
         n56ClienteCelular2 = ((GXutil.strcmp("", A56ClienteCelular2)==0) ? true : false) ;
         A57ClienteCodigoFigaro = httpContext.cgiGet( edtClienteCodigoFigaro_Internalname) ;
         n57ClienteCodigoFigaro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A57ClienteCodigoFigaro", A57ClienteCodigoFigaro);
         n57ClienteCodigoFigaro = ((GXutil.strcmp("", A57ClienteCodigoFigaro)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTipoUsuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTipoUsuario_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTETIPOUSUARIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteTipoUsuario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A58ClienteTipoUsuario = (short)(0) ;
            n58ClienteTipoUsuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), 4, 0));
         }
         else
         {
            A58ClienteTipoUsuario = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteTipoUsuario_Internalname), ".", ",")) ;
            n58ClienteTipoUsuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), 4, 0));
         }
         n58ClienteTipoUsuario = ((0==A58ClienteTipoUsuario) ? true : false) ;
         A59ClienteDireccion = httpContext.cgiGet( edtClienteDireccion_Internalname) ;
         n59ClienteDireccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A59ClienteDireccion", A59ClienteDireccion);
         n59ClienteDireccion = ((GXutil.strcmp("", A59ClienteDireccion)==0) ? true : false) ;
         A60ClienteNombreTelefono1 = httpContext.cgiGet( edtClienteNombreTelefono1_Internalname) ;
         n60ClienteNombreTelefono1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A60ClienteNombreTelefono1", A60ClienteNombreTelefono1);
         n60ClienteNombreTelefono1 = ((GXutil.strcmp("", A60ClienteNombreTelefono1)==0) ? true : false) ;
         A61ClienteTelefono1 = httpContext.cgiGet( edtClienteTelefono1_Internalname) ;
         n61ClienteTelefono1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A61ClienteTelefono1", A61ClienteTelefono1);
         n61ClienteTelefono1 = ((GXutil.strcmp("", A61ClienteTelefono1)==0) ? true : false) ;
         A62ClienteNombreTelefono2 = httpContext.cgiGet( edtClienteNombreTelefono2_Internalname) ;
         n62ClienteNombreTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ClienteNombreTelefono2", A62ClienteNombreTelefono2);
         n62ClienteNombreTelefono2 = ((GXutil.strcmp("", A62ClienteNombreTelefono2)==0) ? true : false) ;
         A63ClienteTelefono2 = httpContext.cgiGet( edtClienteTelefono2_Internalname) ;
         n63ClienteTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A63ClienteTelefono2", A63ClienteTelefono2);
         n63ClienteTelefono2 = ((GXutil.strcmp("", A63ClienteTelefono2)==0) ? true : false) ;
         A64ClienteFax = httpContext.cgiGet( edtClienteFax_Internalname) ;
         n64ClienteFax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ClienteFax", A64ClienteFax);
         n64ClienteFax = ((GXutil.strcmp("", A64ClienteFax)==0) ? true : false) ;
         A65ClienteDicose = httpContext.cgiGet( edtClienteDicose_Internalname) ;
         n65ClienteDicose = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ClienteDicose", A65ClienteDicose);
         n65ClienteDicose = ((GXutil.strcmp("", A65ClienteDicose)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdDepartamento_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdDepartamento_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEIDDEPARTAMENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteIdDepartamento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A66ClienteIdDepartamento = 0 ;
            n66ClienteIdDepartamento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), 18, 0));
         }
         else
         {
            A66ClienteIdDepartamento = localUtil.ctol( httpContext.cgiGet( edtClienteIdDepartamento_Internalname), ".", ",") ;
            n66ClienteIdDepartamento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), 18, 0));
         }
         n66ClienteIdDepartamento = ((0==A66ClienteIdDepartamento) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdLocalidad_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdLocalidad_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEIDLOCALIDAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteIdLocalidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A67ClienteIdLocalidad = 0 ;
            n67ClienteIdLocalidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), 18, 0));
         }
         else
         {
            A67ClienteIdLocalidad = localUtil.ctol( httpContext.cgiGet( edtClienteIdLocalidad_Internalname), ".", ",") ;
            n67ClienteIdLocalidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), 18, 0));
         }
         n67ClienteIdLocalidad = ((0==A67ClienteIdLocalidad) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTecnico1_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTecnico1_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTETECNICO1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteTecnico1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A68ClienteTecnico1 = 0 ;
            n68ClienteTecnico1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ClienteTecnico1), 18, 0));
         }
         else
         {
            A68ClienteTecnico1 = localUtil.ctol( httpContext.cgiGet( edtClienteTecnico1_Internalname), ".", ",") ;
            n68ClienteTecnico1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ClienteTecnico1), 18, 0));
         }
         n68ClienteTecnico1 = ((0==A68ClienteTecnico1) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTecnico2_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteTecnico2_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTETECNICO2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteTecnico2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A69ClienteTecnico2 = 0 ;
            n69ClienteTecnico2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A69ClienteTecnico2), 18, 0));
         }
         else
         {
            A69ClienteTecnico2 = localUtil.ctol( httpContext.cgiGet( edtClienteTecnico2_Internalname), ".", ",") ;
            n69ClienteTecnico2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A69ClienteTecnico2), 18, 0));
         }
         n69ClienteTecnico2 = ((0==A69ClienteTecnico2) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdAgencia_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIdAgencia_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEIDAGENCIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteIdAgencia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A70ClienteIdAgencia = 0 ;
            n70ClienteIdAgencia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A70ClienteIdAgencia), 18, 0));
         }
         else
         {
            A70ClienteIdAgencia = localUtil.ctol( httpContext.cgiGet( edtClienteIdAgencia_Internalname), ".", ",") ;
            n70ClienteIdAgencia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A70ClienteIdAgencia), 18, 0));
         }
         n70ClienteIdAgencia = ((0==A70ClienteIdAgencia) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteContrato_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteContrato_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTECONTRATO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteContrato_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A71ClienteContrato = (short)(0) ;
            n71ClienteContrato = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrimstr( DecimalUtil.doubleToDec(A71ClienteContrato), 4, 0));
         }
         else
         {
            A71ClienteContrato = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteContrato_Internalname), ".", ",")) ;
            n71ClienteContrato = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrimstr( DecimalUtil.doubleToDec(A71ClienteContrato), 4, 0));
         }
         n71ClienteContrato = ((0==A71ClienteContrato) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteSocio_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteSocio_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTESOCIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteSocio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A72ClienteSocio = (short)(0) ;
            n72ClienteSocio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A72ClienteSocio), 4, 0));
         }
         else
         {
            A72ClienteSocio = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteSocio_Internalname), ".", ",")) ;
            n72ClienteSocio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A72ClienteSocio), 4, 0));
         }
         n72ClienteSocio = ((0==A72ClienteSocio) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteNoUsar_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteNoUsar_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTENOUSAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteNoUsar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A73ClienteNoUsar = (short)(0) ;
            n73ClienteNoUsar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A73ClienteNoUsar), 4, 0));
         }
         else
         {
            A73ClienteNoUsar = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteNoUsar_Internalname), ".", ",")) ;
            n73ClienteNoUsar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A73ClienteNoUsar), 4, 0));
         }
         n73ClienteNoUsar = ((0==A73ClienteNoUsar) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteCodbar_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteCodbar_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTECODBAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteCodbar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A74ClienteCodbar = (short)(0) ;
            n74ClienteCodbar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A74ClienteCodbar), 4, 0));
         }
         else
         {
            A74ClienteCodbar = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteCodbar_Internalname), ".", ",")) ;
            n74ClienteCodbar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A74ClienteCodbar), 4, 0));
         }
         n74ClienteCodbar = ((0==A74ClienteCodbar) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteCaravanas_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteCaravanas_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTECARAVANAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteCaravanas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A75ClienteCaravanas = (short)(0) ;
            n75ClienteCaravanas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A75ClienteCaravanas), 4, 0));
         }
         else
         {
            A75ClienteCaravanas = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteCaravanas_Internalname), ".", ",")) ;
            n75ClienteCaravanas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A75ClienteCaravanas), 4, 0));
         }
         n75ClienteCaravanas = ((0==A75ClienteCaravanas) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesa_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesa_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEPROLESA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteProlesa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A76ClienteProlesa = (short)(0) ;
            n76ClienteProlesa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A76ClienteProlesa), 4, 0));
         }
         else
         {
            A76ClienteProlesa = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteProlesa_Internalname), ".", ",")) ;
            n76ClienteProlesa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A76ClienteProlesa), 4, 0));
         }
         n76ClienteProlesa = ((0==A76ClienteProlesa) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesaSuc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesaSuc_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEPROLESASUC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteProlesaSuc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A77ClienteProlesaSuc = 0 ;
            n77ClienteProlesaSuc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), 18, 0));
         }
         else
         {
            A77ClienteProlesaSuc = localUtil.ctol( httpContext.cgiGet( edtClienteProlesaSuc_Internalname), ".", ",") ;
            n77ClienteProlesaSuc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), 18, 0));
         }
         n77ClienteProlesaSuc = ((0==A77ClienteProlesaSuc) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesaMat_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteProlesaMat_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEPROLESAMAT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteProlesaMat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A168ClienteProlesaMat = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A168ClienteProlesaMat), 18, 0));
         }
         else
         {
            A168ClienteProlesaMat = localUtil.ctol( httpContext.cgiGet( edtClienteProlesaMat_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A168ClienteProlesaMat), 18, 0));
         }
         A78ClienteObservaciones = httpContext.cgiGet( edtClienteObservaciones_Internalname) ;
         n78ClienteObservaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A78ClienteObservaciones", A78ClienteObservaciones);
         n78ClienteObservaciones = ((GXutil.strcmp("", A78ClienteObservaciones)==0) ? true : false) ;
         A79ClienteFacRsocial = httpContext.cgiGet( edtClienteFacRsocial_Internalname) ;
         n79ClienteFacRsocial = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ClienteFacRsocial", A79ClienteFacRsocial);
         n79ClienteFacRsocial = ((GXutil.strcmp("", A79ClienteFacRsocial)==0) ? true : false) ;
         A80ClienteFacCedula = httpContext.cgiGet( edtClienteFacCedula_Internalname) ;
         n80ClienteFacCedula = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A80ClienteFacCedula", A80ClienteFacCedula);
         n80ClienteFacCedula = ((GXutil.strcmp("", A80ClienteFacCedula)==0) ? true : false) ;
         A81ClienteFacRut = httpContext.cgiGet( edtClienteFacRut_Internalname) ;
         n81ClienteFacRut = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A81ClienteFacRut", A81ClienteFacRut);
         n81ClienteFacRut = ((GXutil.strcmp("", A81ClienteFacRut)==0) ? true : false) ;
         A82ClienteFacDireccion = httpContext.cgiGet( edtClienteFacDireccion_Internalname) ;
         n82ClienteFacDireccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A82ClienteFacDireccion", A82ClienteFacDireccion);
         n82ClienteFacDireccion = ((GXutil.strcmp("", A82ClienteFacDireccion)==0) ? true : false) ;
         A83ClienteFacLocalidad = httpContext.cgiGet( edtClienteFacLocalidad_Internalname) ;
         n83ClienteFacLocalidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A83ClienteFacLocalidad", A83ClienteFacLocalidad);
         n83ClienteFacLocalidad = ((GXutil.strcmp("", A83ClienteFacLocalidad)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacDepartamento_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacDepartamento_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEFACDEPARTAMENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteFacDepartamento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A84ClienteFacDepartamento = 0 ;
            n84ClienteFacDepartamento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), 18, 0));
         }
         else
         {
            A84ClienteFacDepartamento = localUtil.ctol( httpContext.cgiGet( edtClienteFacDepartamento_Internalname), ".", ",") ;
            n84ClienteFacDepartamento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), 18, 0));
         }
         n84ClienteFacDepartamento = ((0==A84ClienteFacDepartamento) ? true : false) ;
         A85ClienteFacCpostal = httpContext.cgiGet( edtClienteFacCpostal_Internalname) ;
         n85ClienteFacCpostal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A85ClienteFacCpostal", A85ClienteFacCpostal);
         n85ClienteFacCpostal = ((GXutil.strcmp("", A85ClienteFacCpostal)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacGiro_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacGiro_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEFACGIRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteFacGiro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A86ClienteFacGiro = 0 ;
            n86ClienteFacGiro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A86ClienteFacGiro), 18, 0));
         }
         else
         {
            A86ClienteFacGiro = localUtil.ctol( httpContext.cgiGet( edtClienteFacGiro_Internalname), ".", ",") ;
            n86ClienteFacGiro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A86ClienteFacGiro), 18, 0));
         }
         n86ClienteFacGiro = ((0==A86ClienteFacGiro) ? true : false) ;
         A87ClienteCobNombreTelefono1 = httpContext.cgiGet( edtClienteCobNombreTelefono1_Internalname) ;
         n87ClienteCobNombreTelefono1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ClienteCobNombreTelefono1", A87ClienteCobNombreTelefono1);
         n87ClienteCobNombreTelefono1 = ((GXutil.strcmp("", A87ClienteCobNombreTelefono1)==0) ? true : false) ;
         A88ClienteFacTelefonos = httpContext.cgiGet( edtClienteFacTelefonos_Internalname) ;
         n88ClienteFacTelefonos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A88ClienteFacTelefonos", A88ClienteFacTelefonos);
         n88ClienteFacTelefonos = ((GXutil.strcmp("", A88ClienteFacTelefonos)==0) ? true : false) ;
         A89ClienteCobNombreTelefono2 = httpContext.cgiGet( edtClienteCobNombreTelefono2_Internalname) ;
         n89ClienteCobNombreTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ClienteCobNombreTelefono2", A89ClienteCobNombreTelefono2);
         n89ClienteCobNombreTelefono2 = ((GXutil.strcmp("", A89ClienteCobNombreTelefono2)==0) ? true : false) ;
         A90ClienteCobTelefono2 = httpContext.cgiGet( edtClienteCobTelefono2_Internalname) ;
         n90ClienteCobTelefono2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ClienteCobTelefono2", A90ClienteCobTelefono2);
         n90ClienteCobTelefono2 = ((GXutil.strcmp("", A90ClienteCobTelefono2)==0) ? true : false) ;
         A91ClienteCobNombreCelular1 = httpContext.cgiGet( edtClienteCobNombreCelular1_Internalname) ;
         n91ClienteCobNombreCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ClienteCobNombreCelular1", A91ClienteCobNombreCelular1);
         n91ClienteCobNombreCelular1 = ((GXutil.strcmp("", A91ClienteCobNombreCelular1)==0) ? true : false) ;
         A92ClienteCobCelular1 = httpContext.cgiGet( edtClienteCobCelular1_Internalname) ;
         n92ClienteCobCelular1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A92ClienteCobCelular1", A92ClienteCobCelular1);
         n92ClienteCobCelular1 = ((GXutil.strcmp("", A92ClienteCobCelular1)==0) ? true : false) ;
         A93ClienteCobNombreCelular2 = httpContext.cgiGet( edtClienteCobNombreCelular2_Internalname) ;
         n93ClienteCobNombreCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A93ClienteCobNombreCelular2", A93ClienteCobNombreCelular2);
         n93ClienteCobNombreCelular2 = ((GXutil.strcmp("", A93ClienteCobNombreCelular2)==0) ? true : false) ;
         A94ClienteCobCelular2 = httpContext.cgiGet( edtClienteCobCelular2_Internalname) ;
         n94ClienteCobCelular2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A94ClienteCobCelular2", A94ClienteCobCelular2);
         n94ClienteCobCelular2 = ((GXutil.strcmp("", A94ClienteCobCelular2)==0) ? true : false) ;
         A95ClienteCobNombreEmail1 = httpContext.cgiGet( edtClienteCobNombreEmail1_Internalname) ;
         n95ClienteCobNombreEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A95ClienteCobNombreEmail1", A95ClienteCobNombreEmail1);
         n95ClienteCobNombreEmail1 = ((GXutil.strcmp("", A95ClienteCobNombreEmail1)==0) ? true : false) ;
         A96ClienteCobEmail1 = httpContext.cgiGet( edtClienteCobEmail1_Internalname) ;
         n96ClienteCobEmail1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ClienteCobEmail1", A96ClienteCobEmail1);
         n96ClienteCobEmail1 = ((GXutil.strcmp("", A96ClienteCobEmail1)==0) ? true : false) ;
         A97ClienteCobNombreEmail2 = httpContext.cgiGet( edtClienteCobNombreEmail2_Internalname) ;
         n97ClienteCobNombreEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97ClienteCobNombreEmail2", A97ClienteCobNombreEmail2);
         n97ClienteCobNombreEmail2 = ((GXutil.strcmp("", A97ClienteCobNombreEmail2)==0) ? true : false) ;
         A98ClienteCobEmail2 = httpContext.cgiGet( edtClienteCobEmail2_Internalname) ;
         n98ClienteCobEmail2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A98ClienteCobEmail2", A98ClienteCobEmail2);
         n98ClienteCobEmail2 = ((GXutil.strcmp("", A98ClienteCobEmail2)==0) ? true : false) ;
         A99ClienteFacFax = httpContext.cgiGet( edtClienteFacFax_Internalname) ;
         n99ClienteFacFax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99ClienteFacFax", A99ClienteFacFax);
         n99ClienteFacFax = ((GXutil.strcmp("", A99ClienteFacFax)==0) ? true : false) ;
         A100ClienteFacEmail = httpContext.cgiGet( edtClienteFacEmail_Internalname) ;
         n100ClienteFacEmail = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ClienteFacEmail", A100ClienteFacEmail);
         n100ClienteFacEmail = ((GXutil.strcmp("", A100ClienteFacEmail)==0) ? true : false) ;
         A101ClienteFacContrato = httpContext.cgiGet( edtClienteFacContrato_Internalname) ;
         n101ClienteFacContrato = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ClienteFacContrato", A101ClienteFacContrato);
         n101ClienteFacContrato = ((GXutil.strcmp("", A101ClienteFacContrato)==0) ? true : false) ;
         A102ClienteFacObservaciones = httpContext.cgiGet( edtClienteFacObservaciones_Internalname) ;
         n102ClienteFacObservaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A102ClienteFacObservaciones", A102ClienteFacObservaciones);
         n102ClienteFacObservaciones = ((GXutil.strcmp("", A102ClienteFacObservaciones)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacLista_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacLista_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEFACLISTA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteFacLista_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A103ClienteFacLista = 0 ;
            n103ClienteFacLista = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ClienteFacLista), 18, 0));
         }
         else
         {
            A103ClienteFacLista = localUtil.ctol( httpContext.cgiGet( edtClienteFacLista_Internalname), ".", ",") ;
            n103ClienteFacLista = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ClienteFacLista), 18, 0));
         }
         n103ClienteFacLista = ((0==A103ClienteFacLista) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacContado_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteFacContado_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEFACCONTADO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteFacContado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A104ClienteFacContado = (short)(0) ;
            n104ClienteFacContado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ClienteFacContado), 4, 0));
         }
         else
         {
            A104ClienteFacContado = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteFacContado_Internalname), ".", ",")) ;
            n104ClienteFacContado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ClienteFacContado), 4, 0));
         }
         n104ClienteFacContado = ((0==A104ClienteFacContado) ? true : false) ;
         A105ClienteNotEmailFrascos1 = httpContext.cgiGet( edtClienteNotEmailFrascos1_Internalname) ;
         n105ClienteNotEmailFrascos1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ClienteNotEmailFrascos1", A105ClienteNotEmailFrascos1);
         n105ClienteNotEmailFrascos1 = ((GXutil.strcmp("", A105ClienteNotEmailFrascos1)==0) ? true : false) ;
         A106ClienteNotEmailFrascos2 = httpContext.cgiGet( edtClienteNotEmailFrascos2_Internalname) ;
         n106ClienteNotEmailFrascos2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ClienteNotEmailFrascos2", A106ClienteNotEmailFrascos2);
         n106ClienteNotEmailFrascos2 = ((GXutil.strcmp("", A106ClienteNotEmailFrascos2)==0) ? true : false) ;
         A107ClienteNotEmailMuestra1 = httpContext.cgiGet( edtClienteNotEmailMuestra1_Internalname) ;
         n107ClienteNotEmailMuestra1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ClienteNotEmailMuestra1", A107ClienteNotEmailMuestra1);
         n107ClienteNotEmailMuestra1 = ((GXutil.strcmp("", A107ClienteNotEmailMuestra1)==0) ? true : false) ;
         A108ClienteNotEmailMuestra2 = httpContext.cgiGet( edtClienteNotEmailMuestra2_Internalname) ;
         n108ClienteNotEmailMuestra2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ClienteNotEmailMuestra2", A108ClienteNotEmailMuestra2);
         n108ClienteNotEmailMuestra2 = ((GXutil.strcmp("", A108ClienteNotEmailMuestra2)==0) ? true : false) ;
         A109ClienteNotEmailAnalisis1 = httpContext.cgiGet( edtClienteNotEmailAnalisis1_Internalname) ;
         n109ClienteNotEmailAnalisis1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ClienteNotEmailAnalisis1", A109ClienteNotEmailAnalisis1);
         n109ClienteNotEmailAnalisis1 = ((GXutil.strcmp("", A109ClienteNotEmailAnalisis1)==0) ? true : false) ;
         A110ClienteNotEmailAnalisis2 = httpContext.cgiGet( edtClienteNotEmailAnalisis2_Internalname) ;
         n110ClienteNotEmailAnalisis2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ClienteNotEmailAnalisis2", A110ClienteNotEmailAnalisis2);
         n110ClienteNotEmailAnalisis2 = ((GXutil.strcmp("", A110ClienteNotEmailAnalisis2)==0) ? true : false) ;
         A111ClienteNotEmailGeneral1 = httpContext.cgiGet( edtClienteNotEmailGeneral1_Internalname) ;
         n111ClienteNotEmailGeneral1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ClienteNotEmailGeneral1", A111ClienteNotEmailGeneral1);
         n111ClienteNotEmailGeneral1 = ((GXutil.strcmp("", A111ClienteNotEmailGeneral1)==0) ? true : false) ;
         A112ClienteNotEmailGeneral2 = httpContext.cgiGet( edtClienteNotEmailGeneral2_Internalname) ;
         n112ClienteNotEmailGeneral2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ClienteNotEmailGeneral2", A112ClienteNotEmailGeneral2);
         n112ClienteNotEmailGeneral2 = ((GXutil.strcmp("", A112ClienteNotEmailGeneral2)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIncobrable_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClienteIncobrable_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENTEINCOBRABLE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClienteIncobrable_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A113ClienteIncobrable = (short)(0) ;
            n113ClienteIncobrable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrimstr( DecimalUtil.doubleToDec(A113ClienteIncobrable), 4, 0));
         }
         else
         {
            A113ClienteIncobrable = (short)(localUtil.ctol( httpContext.cgiGet( edtClienteIncobrable_Internalname), ".", ",")) ;
            n113ClienteIncobrable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrimstr( DecimalUtil.doubleToDec(A113ClienteIncobrable), 4, 0));
         }
         n113ClienteIncobrable = ((0==A113ClienteIncobrable) ? true : false) ;
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
            A4ClienteId = GXutil.lval( httpContext.GetPar( "ClienteId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
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
            initAll044( ) ;
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
      disableAttributes044( ) ;
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

   public void resetCaption040( )
   {
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z45ClienteNombre = T00043_A45ClienteNombre[0] ;
            Z46ClienteEmail = T00043_A46ClienteEmail[0] ;
            Z47ClienteNombreEmail1 = T00043_A47ClienteNombreEmail1[0] ;
            Z48ClienteEmail1 = T00043_A48ClienteEmail1[0] ;
            Z49ClienteNombreEmail2 = T00043_A49ClienteNombreEmail2[0] ;
            Z50ClienteEmail2 = T00043_A50ClienteEmail2[0] ;
            Z51ClienteEnvio = T00043_A51ClienteEnvio[0] ;
            Z52ClienteUsuarioWeb = T00043_A52ClienteUsuarioWeb[0] ;
            Z53ClienteNombreCelular1 = T00043_A53ClienteNombreCelular1[0] ;
            Z54ClienteCelular1 = T00043_A54ClienteCelular1[0] ;
            Z55ClienteNombreCelular2 = T00043_A55ClienteNombreCelular2[0] ;
            Z56ClienteCelular2 = T00043_A56ClienteCelular2[0] ;
            Z57ClienteCodigoFigaro = T00043_A57ClienteCodigoFigaro[0] ;
            Z58ClienteTipoUsuario = T00043_A58ClienteTipoUsuario[0] ;
            Z59ClienteDireccion = T00043_A59ClienteDireccion[0] ;
            Z60ClienteNombreTelefono1 = T00043_A60ClienteNombreTelefono1[0] ;
            Z61ClienteTelefono1 = T00043_A61ClienteTelefono1[0] ;
            Z62ClienteNombreTelefono2 = T00043_A62ClienteNombreTelefono2[0] ;
            Z63ClienteTelefono2 = T00043_A63ClienteTelefono2[0] ;
            Z64ClienteFax = T00043_A64ClienteFax[0] ;
            Z65ClienteDicose = T00043_A65ClienteDicose[0] ;
            Z66ClienteIdDepartamento = T00043_A66ClienteIdDepartamento[0] ;
            Z67ClienteIdLocalidad = T00043_A67ClienteIdLocalidad[0] ;
            Z68ClienteTecnico1 = T00043_A68ClienteTecnico1[0] ;
            Z69ClienteTecnico2 = T00043_A69ClienteTecnico2[0] ;
            Z70ClienteIdAgencia = T00043_A70ClienteIdAgencia[0] ;
            Z71ClienteContrato = T00043_A71ClienteContrato[0] ;
            Z72ClienteSocio = T00043_A72ClienteSocio[0] ;
            Z73ClienteNoUsar = T00043_A73ClienteNoUsar[0] ;
            Z74ClienteCodbar = T00043_A74ClienteCodbar[0] ;
            Z75ClienteCaravanas = T00043_A75ClienteCaravanas[0] ;
            Z76ClienteProlesa = T00043_A76ClienteProlesa[0] ;
            Z77ClienteProlesaSuc = T00043_A77ClienteProlesaSuc[0] ;
            Z168ClienteProlesaMat = T00043_A168ClienteProlesaMat[0] ;
            Z78ClienteObservaciones = T00043_A78ClienteObservaciones[0] ;
            Z79ClienteFacRsocial = T00043_A79ClienteFacRsocial[0] ;
            Z80ClienteFacCedula = T00043_A80ClienteFacCedula[0] ;
            Z81ClienteFacRut = T00043_A81ClienteFacRut[0] ;
            Z82ClienteFacDireccion = T00043_A82ClienteFacDireccion[0] ;
            Z83ClienteFacLocalidad = T00043_A83ClienteFacLocalidad[0] ;
            Z84ClienteFacDepartamento = T00043_A84ClienteFacDepartamento[0] ;
            Z85ClienteFacCpostal = T00043_A85ClienteFacCpostal[0] ;
            Z86ClienteFacGiro = T00043_A86ClienteFacGiro[0] ;
            Z87ClienteCobNombreTelefono1 = T00043_A87ClienteCobNombreTelefono1[0] ;
            Z88ClienteFacTelefonos = T00043_A88ClienteFacTelefonos[0] ;
            Z89ClienteCobNombreTelefono2 = T00043_A89ClienteCobNombreTelefono2[0] ;
            Z90ClienteCobTelefono2 = T00043_A90ClienteCobTelefono2[0] ;
            Z91ClienteCobNombreCelular1 = T00043_A91ClienteCobNombreCelular1[0] ;
            Z92ClienteCobCelular1 = T00043_A92ClienteCobCelular1[0] ;
            Z93ClienteCobNombreCelular2 = T00043_A93ClienteCobNombreCelular2[0] ;
            Z94ClienteCobCelular2 = T00043_A94ClienteCobCelular2[0] ;
            Z95ClienteCobNombreEmail1 = T00043_A95ClienteCobNombreEmail1[0] ;
            Z96ClienteCobEmail1 = T00043_A96ClienteCobEmail1[0] ;
            Z97ClienteCobNombreEmail2 = T00043_A97ClienteCobNombreEmail2[0] ;
            Z98ClienteCobEmail2 = T00043_A98ClienteCobEmail2[0] ;
            Z99ClienteFacFax = T00043_A99ClienteFacFax[0] ;
            Z100ClienteFacEmail = T00043_A100ClienteFacEmail[0] ;
            Z101ClienteFacContrato = T00043_A101ClienteFacContrato[0] ;
            Z102ClienteFacObservaciones = T00043_A102ClienteFacObservaciones[0] ;
            Z103ClienteFacLista = T00043_A103ClienteFacLista[0] ;
            Z104ClienteFacContado = T00043_A104ClienteFacContado[0] ;
            Z105ClienteNotEmailFrascos1 = T00043_A105ClienteNotEmailFrascos1[0] ;
            Z106ClienteNotEmailFrascos2 = T00043_A106ClienteNotEmailFrascos2[0] ;
            Z107ClienteNotEmailMuestra1 = T00043_A107ClienteNotEmailMuestra1[0] ;
            Z108ClienteNotEmailMuestra2 = T00043_A108ClienteNotEmailMuestra2[0] ;
            Z109ClienteNotEmailAnalisis1 = T00043_A109ClienteNotEmailAnalisis1[0] ;
            Z110ClienteNotEmailAnalisis2 = T00043_A110ClienteNotEmailAnalisis2[0] ;
            Z111ClienteNotEmailGeneral1 = T00043_A111ClienteNotEmailGeneral1[0] ;
            Z112ClienteNotEmailGeneral2 = T00043_A112ClienteNotEmailGeneral2[0] ;
            Z113ClienteIncobrable = T00043_A113ClienteIncobrable[0] ;
         }
         else
         {
            Z45ClienteNombre = A45ClienteNombre ;
            Z46ClienteEmail = A46ClienteEmail ;
            Z47ClienteNombreEmail1 = A47ClienteNombreEmail1 ;
            Z48ClienteEmail1 = A48ClienteEmail1 ;
            Z49ClienteNombreEmail2 = A49ClienteNombreEmail2 ;
            Z50ClienteEmail2 = A50ClienteEmail2 ;
            Z51ClienteEnvio = A51ClienteEnvio ;
            Z52ClienteUsuarioWeb = A52ClienteUsuarioWeb ;
            Z53ClienteNombreCelular1 = A53ClienteNombreCelular1 ;
            Z54ClienteCelular1 = A54ClienteCelular1 ;
            Z55ClienteNombreCelular2 = A55ClienteNombreCelular2 ;
            Z56ClienteCelular2 = A56ClienteCelular2 ;
            Z57ClienteCodigoFigaro = A57ClienteCodigoFigaro ;
            Z58ClienteTipoUsuario = A58ClienteTipoUsuario ;
            Z59ClienteDireccion = A59ClienteDireccion ;
            Z60ClienteNombreTelefono1 = A60ClienteNombreTelefono1 ;
            Z61ClienteTelefono1 = A61ClienteTelefono1 ;
            Z62ClienteNombreTelefono2 = A62ClienteNombreTelefono2 ;
            Z63ClienteTelefono2 = A63ClienteTelefono2 ;
            Z64ClienteFax = A64ClienteFax ;
            Z65ClienteDicose = A65ClienteDicose ;
            Z66ClienteIdDepartamento = A66ClienteIdDepartamento ;
            Z67ClienteIdLocalidad = A67ClienteIdLocalidad ;
            Z68ClienteTecnico1 = A68ClienteTecnico1 ;
            Z69ClienteTecnico2 = A69ClienteTecnico2 ;
            Z70ClienteIdAgencia = A70ClienteIdAgencia ;
            Z71ClienteContrato = A71ClienteContrato ;
            Z72ClienteSocio = A72ClienteSocio ;
            Z73ClienteNoUsar = A73ClienteNoUsar ;
            Z74ClienteCodbar = A74ClienteCodbar ;
            Z75ClienteCaravanas = A75ClienteCaravanas ;
            Z76ClienteProlesa = A76ClienteProlesa ;
            Z77ClienteProlesaSuc = A77ClienteProlesaSuc ;
            Z168ClienteProlesaMat = A168ClienteProlesaMat ;
            Z78ClienteObservaciones = A78ClienteObservaciones ;
            Z79ClienteFacRsocial = A79ClienteFacRsocial ;
            Z80ClienteFacCedula = A80ClienteFacCedula ;
            Z81ClienteFacRut = A81ClienteFacRut ;
            Z82ClienteFacDireccion = A82ClienteFacDireccion ;
            Z83ClienteFacLocalidad = A83ClienteFacLocalidad ;
            Z84ClienteFacDepartamento = A84ClienteFacDepartamento ;
            Z85ClienteFacCpostal = A85ClienteFacCpostal ;
            Z86ClienteFacGiro = A86ClienteFacGiro ;
            Z87ClienteCobNombreTelefono1 = A87ClienteCobNombreTelefono1 ;
            Z88ClienteFacTelefonos = A88ClienteFacTelefonos ;
            Z89ClienteCobNombreTelefono2 = A89ClienteCobNombreTelefono2 ;
            Z90ClienteCobTelefono2 = A90ClienteCobTelefono2 ;
            Z91ClienteCobNombreCelular1 = A91ClienteCobNombreCelular1 ;
            Z92ClienteCobCelular1 = A92ClienteCobCelular1 ;
            Z93ClienteCobNombreCelular2 = A93ClienteCobNombreCelular2 ;
            Z94ClienteCobCelular2 = A94ClienteCobCelular2 ;
            Z95ClienteCobNombreEmail1 = A95ClienteCobNombreEmail1 ;
            Z96ClienteCobEmail1 = A96ClienteCobEmail1 ;
            Z97ClienteCobNombreEmail2 = A97ClienteCobNombreEmail2 ;
            Z98ClienteCobEmail2 = A98ClienteCobEmail2 ;
            Z99ClienteFacFax = A99ClienteFacFax ;
            Z100ClienteFacEmail = A100ClienteFacEmail ;
            Z101ClienteFacContrato = A101ClienteFacContrato ;
            Z102ClienteFacObservaciones = A102ClienteFacObservaciones ;
            Z103ClienteFacLista = A103ClienteFacLista ;
            Z104ClienteFacContado = A104ClienteFacContado ;
            Z105ClienteNotEmailFrascos1 = A105ClienteNotEmailFrascos1 ;
            Z106ClienteNotEmailFrascos2 = A106ClienteNotEmailFrascos2 ;
            Z107ClienteNotEmailMuestra1 = A107ClienteNotEmailMuestra1 ;
            Z108ClienteNotEmailMuestra2 = A108ClienteNotEmailMuestra2 ;
            Z109ClienteNotEmailAnalisis1 = A109ClienteNotEmailAnalisis1 ;
            Z110ClienteNotEmailAnalisis2 = A110ClienteNotEmailAnalisis2 ;
            Z111ClienteNotEmailGeneral1 = A111ClienteNotEmailGeneral1 ;
            Z112ClienteNotEmailGeneral2 = A112ClienteNotEmailGeneral2 ;
            Z113ClienteIncobrable = A113ClienteIncobrable ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4ClienteId = A4ClienteId ;
         Z45ClienteNombre = A45ClienteNombre ;
         Z46ClienteEmail = A46ClienteEmail ;
         Z47ClienteNombreEmail1 = A47ClienteNombreEmail1 ;
         Z48ClienteEmail1 = A48ClienteEmail1 ;
         Z49ClienteNombreEmail2 = A49ClienteNombreEmail2 ;
         Z50ClienteEmail2 = A50ClienteEmail2 ;
         Z51ClienteEnvio = A51ClienteEnvio ;
         Z52ClienteUsuarioWeb = A52ClienteUsuarioWeb ;
         Z53ClienteNombreCelular1 = A53ClienteNombreCelular1 ;
         Z54ClienteCelular1 = A54ClienteCelular1 ;
         Z55ClienteNombreCelular2 = A55ClienteNombreCelular2 ;
         Z56ClienteCelular2 = A56ClienteCelular2 ;
         Z57ClienteCodigoFigaro = A57ClienteCodigoFigaro ;
         Z58ClienteTipoUsuario = A58ClienteTipoUsuario ;
         Z59ClienteDireccion = A59ClienteDireccion ;
         Z60ClienteNombreTelefono1 = A60ClienteNombreTelefono1 ;
         Z61ClienteTelefono1 = A61ClienteTelefono1 ;
         Z62ClienteNombreTelefono2 = A62ClienteNombreTelefono2 ;
         Z63ClienteTelefono2 = A63ClienteTelefono2 ;
         Z64ClienteFax = A64ClienteFax ;
         Z65ClienteDicose = A65ClienteDicose ;
         Z66ClienteIdDepartamento = A66ClienteIdDepartamento ;
         Z67ClienteIdLocalidad = A67ClienteIdLocalidad ;
         Z68ClienteTecnico1 = A68ClienteTecnico1 ;
         Z69ClienteTecnico2 = A69ClienteTecnico2 ;
         Z70ClienteIdAgencia = A70ClienteIdAgencia ;
         Z71ClienteContrato = A71ClienteContrato ;
         Z72ClienteSocio = A72ClienteSocio ;
         Z73ClienteNoUsar = A73ClienteNoUsar ;
         Z74ClienteCodbar = A74ClienteCodbar ;
         Z75ClienteCaravanas = A75ClienteCaravanas ;
         Z76ClienteProlesa = A76ClienteProlesa ;
         Z77ClienteProlesaSuc = A77ClienteProlesaSuc ;
         Z168ClienteProlesaMat = A168ClienteProlesaMat ;
         Z78ClienteObservaciones = A78ClienteObservaciones ;
         Z79ClienteFacRsocial = A79ClienteFacRsocial ;
         Z80ClienteFacCedula = A80ClienteFacCedula ;
         Z81ClienteFacRut = A81ClienteFacRut ;
         Z82ClienteFacDireccion = A82ClienteFacDireccion ;
         Z83ClienteFacLocalidad = A83ClienteFacLocalidad ;
         Z84ClienteFacDepartamento = A84ClienteFacDepartamento ;
         Z85ClienteFacCpostal = A85ClienteFacCpostal ;
         Z86ClienteFacGiro = A86ClienteFacGiro ;
         Z87ClienteCobNombreTelefono1 = A87ClienteCobNombreTelefono1 ;
         Z88ClienteFacTelefonos = A88ClienteFacTelefonos ;
         Z89ClienteCobNombreTelefono2 = A89ClienteCobNombreTelefono2 ;
         Z90ClienteCobTelefono2 = A90ClienteCobTelefono2 ;
         Z91ClienteCobNombreCelular1 = A91ClienteCobNombreCelular1 ;
         Z92ClienteCobCelular1 = A92ClienteCobCelular1 ;
         Z93ClienteCobNombreCelular2 = A93ClienteCobNombreCelular2 ;
         Z94ClienteCobCelular2 = A94ClienteCobCelular2 ;
         Z95ClienteCobNombreEmail1 = A95ClienteCobNombreEmail1 ;
         Z96ClienteCobEmail1 = A96ClienteCobEmail1 ;
         Z97ClienteCobNombreEmail2 = A97ClienteCobNombreEmail2 ;
         Z98ClienteCobEmail2 = A98ClienteCobEmail2 ;
         Z99ClienteFacFax = A99ClienteFacFax ;
         Z100ClienteFacEmail = A100ClienteFacEmail ;
         Z101ClienteFacContrato = A101ClienteFacContrato ;
         Z102ClienteFacObservaciones = A102ClienteFacObservaciones ;
         Z103ClienteFacLista = A103ClienteFacLista ;
         Z104ClienteFacContado = A104ClienteFacContado ;
         Z105ClienteNotEmailFrascos1 = A105ClienteNotEmailFrascos1 ;
         Z106ClienteNotEmailFrascos2 = A106ClienteNotEmailFrascos2 ;
         Z107ClienteNotEmailMuestra1 = A107ClienteNotEmailMuestra1 ;
         Z108ClienteNotEmailMuestra2 = A108ClienteNotEmailMuestra2 ;
         Z109ClienteNotEmailAnalisis1 = A109ClienteNotEmailAnalisis1 ;
         Z110ClienteNotEmailAnalisis2 = A110ClienteNotEmailAnalisis2 ;
         Z111ClienteNotEmailGeneral1 = A111ClienteNotEmailGeneral1 ;
         Z112ClienteNotEmailGeneral2 = A112ClienteNotEmailGeneral2 ;
         Z113ClienteIncobrable = A113ClienteIncobrable ;
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

   public void load044( )
   {
      /* Using cursor T00044 */
      pr_default.execute(2, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A45ClienteNombre = T00044_A45ClienteNombre[0] ;
         n45ClienteNombre = T00044_n45ClienteNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45ClienteNombre", A45ClienteNombre);
         A46ClienteEmail = T00044_A46ClienteEmail[0] ;
         n46ClienteEmail = T00044_n46ClienteEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46ClienteEmail", A46ClienteEmail);
         A47ClienteNombreEmail1 = T00044_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = T00044_n47ClienteNombreEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47ClienteNombreEmail1", A47ClienteNombreEmail1);
         A48ClienteEmail1 = T00044_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = T00044_n48ClienteEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48ClienteEmail1", A48ClienteEmail1);
         A49ClienteNombreEmail2 = T00044_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = T00044_n49ClienteNombreEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49ClienteNombreEmail2", A49ClienteNombreEmail2);
         A50ClienteEmail2 = T00044_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = T00044_n50ClienteEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50ClienteEmail2", A50ClienteEmail2);
         A51ClienteEnvio = T00044_A51ClienteEnvio[0] ;
         n51ClienteEnvio = T00044_n51ClienteEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51ClienteEnvio", A51ClienteEnvio);
         A52ClienteUsuarioWeb = T00044_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = T00044_n52ClienteUsuarioWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52ClienteUsuarioWeb", A52ClienteUsuarioWeb);
         A53ClienteNombreCelular1 = T00044_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = T00044_n53ClienteNombreCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53ClienteNombreCelular1", A53ClienteNombreCelular1);
         A54ClienteCelular1 = T00044_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = T00044_n54ClienteCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54ClienteCelular1", A54ClienteCelular1);
         A55ClienteNombreCelular2 = T00044_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = T00044_n55ClienteNombreCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ClienteNombreCelular2", A55ClienteNombreCelular2);
         A56ClienteCelular2 = T00044_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = T00044_n56ClienteCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56ClienteCelular2", A56ClienteCelular2);
         A57ClienteCodigoFigaro = T00044_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = T00044_n57ClienteCodigoFigaro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57ClienteCodigoFigaro", A57ClienteCodigoFigaro);
         A58ClienteTipoUsuario = T00044_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = T00044_n58ClienteTipoUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), 4, 0));
         A59ClienteDireccion = T00044_A59ClienteDireccion[0] ;
         n59ClienteDireccion = T00044_n59ClienteDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59ClienteDireccion", A59ClienteDireccion);
         A60ClienteNombreTelefono1 = T00044_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = T00044_n60ClienteNombreTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60ClienteNombreTelefono1", A60ClienteNombreTelefono1);
         A61ClienteTelefono1 = T00044_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = T00044_n61ClienteTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61ClienteTelefono1", A61ClienteTelefono1);
         A62ClienteNombreTelefono2 = T00044_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = T00044_n62ClienteNombreTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ClienteNombreTelefono2", A62ClienteNombreTelefono2);
         A63ClienteTelefono2 = T00044_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = T00044_n63ClienteTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63ClienteTelefono2", A63ClienteTelefono2);
         A64ClienteFax = T00044_A64ClienteFax[0] ;
         n64ClienteFax = T00044_n64ClienteFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ClienteFax", A64ClienteFax);
         A65ClienteDicose = T00044_A65ClienteDicose[0] ;
         n65ClienteDicose = T00044_n65ClienteDicose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ClienteDicose", A65ClienteDicose);
         A66ClienteIdDepartamento = T00044_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = T00044_n66ClienteIdDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), 18, 0));
         A67ClienteIdLocalidad = T00044_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = T00044_n67ClienteIdLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), 18, 0));
         A68ClienteTecnico1 = T00044_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = T00044_n68ClienteTecnico1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ClienteTecnico1), 18, 0));
         A69ClienteTecnico2 = T00044_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = T00044_n69ClienteTecnico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A69ClienteTecnico2), 18, 0));
         A70ClienteIdAgencia = T00044_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = T00044_n70ClienteIdAgencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A70ClienteIdAgencia), 18, 0));
         A71ClienteContrato = T00044_A71ClienteContrato[0] ;
         n71ClienteContrato = T00044_n71ClienteContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrimstr( DecimalUtil.doubleToDec(A71ClienteContrato), 4, 0));
         A72ClienteSocio = T00044_A72ClienteSocio[0] ;
         n72ClienteSocio = T00044_n72ClienteSocio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A72ClienteSocio), 4, 0));
         A73ClienteNoUsar = T00044_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = T00044_n73ClienteNoUsar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A73ClienteNoUsar), 4, 0));
         A74ClienteCodbar = T00044_A74ClienteCodbar[0] ;
         n74ClienteCodbar = T00044_n74ClienteCodbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A74ClienteCodbar), 4, 0));
         A75ClienteCaravanas = T00044_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = T00044_n75ClienteCaravanas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A75ClienteCaravanas), 4, 0));
         A76ClienteProlesa = T00044_A76ClienteProlesa[0] ;
         n76ClienteProlesa = T00044_n76ClienteProlesa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A76ClienteProlesa), 4, 0));
         A77ClienteProlesaSuc = T00044_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = T00044_n77ClienteProlesaSuc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), 18, 0));
         A168ClienteProlesaMat = T00044_A168ClienteProlesaMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A168ClienteProlesaMat), 18, 0));
         A78ClienteObservaciones = T00044_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = T00044_n78ClienteObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78ClienteObservaciones", A78ClienteObservaciones);
         A79ClienteFacRsocial = T00044_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = T00044_n79ClienteFacRsocial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ClienteFacRsocial", A79ClienteFacRsocial);
         A80ClienteFacCedula = T00044_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = T00044_n80ClienteFacCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80ClienteFacCedula", A80ClienteFacCedula);
         A81ClienteFacRut = T00044_A81ClienteFacRut[0] ;
         n81ClienteFacRut = T00044_n81ClienteFacRut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81ClienteFacRut", A81ClienteFacRut);
         A82ClienteFacDireccion = T00044_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = T00044_n82ClienteFacDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82ClienteFacDireccion", A82ClienteFacDireccion);
         A83ClienteFacLocalidad = T00044_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = T00044_n83ClienteFacLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83ClienteFacLocalidad", A83ClienteFacLocalidad);
         A84ClienteFacDepartamento = T00044_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = T00044_n84ClienteFacDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), 18, 0));
         A85ClienteFacCpostal = T00044_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = T00044_n85ClienteFacCpostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85ClienteFacCpostal", A85ClienteFacCpostal);
         A86ClienteFacGiro = T00044_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = T00044_n86ClienteFacGiro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A86ClienteFacGiro), 18, 0));
         A87ClienteCobNombreTelefono1 = T00044_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = T00044_n87ClienteCobNombreTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ClienteCobNombreTelefono1", A87ClienteCobNombreTelefono1);
         A88ClienteFacTelefonos = T00044_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = T00044_n88ClienteFacTelefonos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88ClienteFacTelefonos", A88ClienteFacTelefonos);
         A89ClienteCobNombreTelefono2 = T00044_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = T00044_n89ClienteCobNombreTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ClienteCobNombreTelefono2", A89ClienteCobNombreTelefono2);
         A90ClienteCobTelefono2 = T00044_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = T00044_n90ClienteCobTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ClienteCobTelefono2", A90ClienteCobTelefono2);
         A91ClienteCobNombreCelular1 = T00044_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = T00044_n91ClienteCobNombreCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ClienteCobNombreCelular1", A91ClienteCobNombreCelular1);
         A92ClienteCobCelular1 = T00044_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = T00044_n92ClienteCobCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92ClienteCobCelular1", A92ClienteCobCelular1);
         A93ClienteCobNombreCelular2 = T00044_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = T00044_n93ClienteCobNombreCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93ClienteCobNombreCelular2", A93ClienteCobNombreCelular2);
         A94ClienteCobCelular2 = T00044_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = T00044_n94ClienteCobCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94ClienteCobCelular2", A94ClienteCobCelular2);
         A95ClienteCobNombreEmail1 = T00044_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = T00044_n95ClienteCobNombreEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95ClienteCobNombreEmail1", A95ClienteCobNombreEmail1);
         A96ClienteCobEmail1 = T00044_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = T00044_n96ClienteCobEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ClienteCobEmail1", A96ClienteCobEmail1);
         A97ClienteCobNombreEmail2 = T00044_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = T00044_n97ClienteCobNombreEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97ClienteCobNombreEmail2", A97ClienteCobNombreEmail2);
         A98ClienteCobEmail2 = T00044_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = T00044_n98ClienteCobEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98ClienteCobEmail2", A98ClienteCobEmail2);
         A99ClienteFacFax = T00044_A99ClienteFacFax[0] ;
         n99ClienteFacFax = T00044_n99ClienteFacFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99ClienteFacFax", A99ClienteFacFax);
         A100ClienteFacEmail = T00044_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = T00044_n100ClienteFacEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ClienteFacEmail", A100ClienteFacEmail);
         A101ClienteFacContrato = T00044_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = T00044_n101ClienteFacContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ClienteFacContrato", A101ClienteFacContrato);
         A102ClienteFacObservaciones = T00044_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = T00044_n102ClienteFacObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102ClienteFacObservaciones", A102ClienteFacObservaciones);
         A103ClienteFacLista = T00044_A103ClienteFacLista[0] ;
         n103ClienteFacLista = T00044_n103ClienteFacLista[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ClienteFacLista), 18, 0));
         A104ClienteFacContado = T00044_A104ClienteFacContado[0] ;
         n104ClienteFacContado = T00044_n104ClienteFacContado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ClienteFacContado), 4, 0));
         A105ClienteNotEmailFrascos1 = T00044_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = T00044_n105ClienteNotEmailFrascos1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ClienteNotEmailFrascos1", A105ClienteNotEmailFrascos1);
         A106ClienteNotEmailFrascos2 = T00044_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = T00044_n106ClienteNotEmailFrascos2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ClienteNotEmailFrascos2", A106ClienteNotEmailFrascos2);
         A107ClienteNotEmailMuestra1 = T00044_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = T00044_n107ClienteNotEmailMuestra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ClienteNotEmailMuestra1", A107ClienteNotEmailMuestra1);
         A108ClienteNotEmailMuestra2 = T00044_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = T00044_n108ClienteNotEmailMuestra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ClienteNotEmailMuestra2", A108ClienteNotEmailMuestra2);
         A109ClienteNotEmailAnalisis1 = T00044_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = T00044_n109ClienteNotEmailAnalisis1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ClienteNotEmailAnalisis1", A109ClienteNotEmailAnalisis1);
         A110ClienteNotEmailAnalisis2 = T00044_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = T00044_n110ClienteNotEmailAnalisis2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ClienteNotEmailAnalisis2", A110ClienteNotEmailAnalisis2);
         A111ClienteNotEmailGeneral1 = T00044_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = T00044_n111ClienteNotEmailGeneral1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ClienteNotEmailGeneral1", A111ClienteNotEmailGeneral1);
         A112ClienteNotEmailGeneral2 = T00044_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = T00044_n112ClienteNotEmailGeneral2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ClienteNotEmailGeneral2", A112ClienteNotEmailGeneral2);
         A113ClienteIncobrable = T00044_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = T00044_n113ClienteIncobrable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrimstr( DecimalUtil.doubleToDec(A113ClienteIncobrable), 4, 0));
         zm044( -1) ;
      }
      pr_default.close(2);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      nIsDirty_4 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors044( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor T00045 */
      pr_default.execute(3, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00043 */
      pr_default.execute(1, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A4ClienteId = T00043_A4ClienteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
         A45ClienteNombre = T00043_A45ClienteNombre[0] ;
         n45ClienteNombre = T00043_n45ClienteNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45ClienteNombre", A45ClienteNombre);
         A46ClienteEmail = T00043_A46ClienteEmail[0] ;
         n46ClienteEmail = T00043_n46ClienteEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46ClienteEmail", A46ClienteEmail);
         A47ClienteNombreEmail1 = T00043_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = T00043_n47ClienteNombreEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47ClienteNombreEmail1", A47ClienteNombreEmail1);
         A48ClienteEmail1 = T00043_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = T00043_n48ClienteEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48ClienteEmail1", A48ClienteEmail1);
         A49ClienteNombreEmail2 = T00043_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = T00043_n49ClienteNombreEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49ClienteNombreEmail2", A49ClienteNombreEmail2);
         A50ClienteEmail2 = T00043_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = T00043_n50ClienteEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50ClienteEmail2", A50ClienteEmail2);
         A51ClienteEnvio = T00043_A51ClienteEnvio[0] ;
         n51ClienteEnvio = T00043_n51ClienteEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51ClienteEnvio", A51ClienteEnvio);
         A52ClienteUsuarioWeb = T00043_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = T00043_n52ClienteUsuarioWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52ClienteUsuarioWeb", A52ClienteUsuarioWeb);
         A53ClienteNombreCelular1 = T00043_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = T00043_n53ClienteNombreCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53ClienteNombreCelular1", A53ClienteNombreCelular1);
         A54ClienteCelular1 = T00043_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = T00043_n54ClienteCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54ClienteCelular1", A54ClienteCelular1);
         A55ClienteNombreCelular2 = T00043_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = T00043_n55ClienteNombreCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55ClienteNombreCelular2", A55ClienteNombreCelular2);
         A56ClienteCelular2 = T00043_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = T00043_n56ClienteCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56ClienteCelular2", A56ClienteCelular2);
         A57ClienteCodigoFigaro = T00043_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = T00043_n57ClienteCodigoFigaro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57ClienteCodigoFigaro", A57ClienteCodigoFigaro);
         A58ClienteTipoUsuario = T00043_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = T00043_n58ClienteTipoUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), 4, 0));
         A59ClienteDireccion = T00043_A59ClienteDireccion[0] ;
         n59ClienteDireccion = T00043_n59ClienteDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59ClienteDireccion", A59ClienteDireccion);
         A60ClienteNombreTelefono1 = T00043_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = T00043_n60ClienteNombreTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60ClienteNombreTelefono1", A60ClienteNombreTelefono1);
         A61ClienteTelefono1 = T00043_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = T00043_n61ClienteTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61ClienteTelefono1", A61ClienteTelefono1);
         A62ClienteNombreTelefono2 = T00043_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = T00043_n62ClienteNombreTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ClienteNombreTelefono2", A62ClienteNombreTelefono2);
         A63ClienteTelefono2 = T00043_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = T00043_n63ClienteTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63ClienteTelefono2", A63ClienteTelefono2);
         A64ClienteFax = T00043_A64ClienteFax[0] ;
         n64ClienteFax = T00043_n64ClienteFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ClienteFax", A64ClienteFax);
         A65ClienteDicose = T00043_A65ClienteDicose[0] ;
         n65ClienteDicose = T00043_n65ClienteDicose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ClienteDicose", A65ClienteDicose);
         A66ClienteIdDepartamento = T00043_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = T00043_n66ClienteIdDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), 18, 0));
         A67ClienteIdLocalidad = T00043_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = T00043_n67ClienteIdLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), 18, 0));
         A68ClienteTecnico1 = T00043_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = T00043_n68ClienteTecnico1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ClienteTecnico1), 18, 0));
         A69ClienteTecnico2 = T00043_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = T00043_n69ClienteTecnico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A69ClienteTecnico2), 18, 0));
         A70ClienteIdAgencia = T00043_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = T00043_n70ClienteIdAgencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A70ClienteIdAgencia), 18, 0));
         A71ClienteContrato = T00043_A71ClienteContrato[0] ;
         n71ClienteContrato = T00043_n71ClienteContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrimstr( DecimalUtil.doubleToDec(A71ClienteContrato), 4, 0));
         A72ClienteSocio = T00043_A72ClienteSocio[0] ;
         n72ClienteSocio = T00043_n72ClienteSocio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A72ClienteSocio), 4, 0));
         A73ClienteNoUsar = T00043_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = T00043_n73ClienteNoUsar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A73ClienteNoUsar), 4, 0));
         A74ClienteCodbar = T00043_A74ClienteCodbar[0] ;
         n74ClienteCodbar = T00043_n74ClienteCodbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A74ClienteCodbar), 4, 0));
         A75ClienteCaravanas = T00043_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = T00043_n75ClienteCaravanas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A75ClienteCaravanas), 4, 0));
         A76ClienteProlesa = T00043_A76ClienteProlesa[0] ;
         n76ClienteProlesa = T00043_n76ClienteProlesa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A76ClienteProlesa), 4, 0));
         A77ClienteProlesaSuc = T00043_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = T00043_n77ClienteProlesaSuc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), 18, 0));
         A168ClienteProlesaMat = T00043_A168ClienteProlesaMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A168ClienteProlesaMat), 18, 0));
         A78ClienteObservaciones = T00043_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = T00043_n78ClienteObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78ClienteObservaciones", A78ClienteObservaciones);
         A79ClienteFacRsocial = T00043_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = T00043_n79ClienteFacRsocial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ClienteFacRsocial", A79ClienteFacRsocial);
         A80ClienteFacCedula = T00043_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = T00043_n80ClienteFacCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80ClienteFacCedula", A80ClienteFacCedula);
         A81ClienteFacRut = T00043_A81ClienteFacRut[0] ;
         n81ClienteFacRut = T00043_n81ClienteFacRut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81ClienteFacRut", A81ClienteFacRut);
         A82ClienteFacDireccion = T00043_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = T00043_n82ClienteFacDireccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82ClienteFacDireccion", A82ClienteFacDireccion);
         A83ClienteFacLocalidad = T00043_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = T00043_n83ClienteFacLocalidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83ClienteFacLocalidad", A83ClienteFacLocalidad);
         A84ClienteFacDepartamento = T00043_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = T00043_n84ClienteFacDepartamento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), 18, 0));
         A85ClienteFacCpostal = T00043_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = T00043_n85ClienteFacCpostal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85ClienteFacCpostal", A85ClienteFacCpostal);
         A86ClienteFacGiro = T00043_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = T00043_n86ClienteFacGiro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A86ClienteFacGiro), 18, 0));
         A87ClienteCobNombreTelefono1 = T00043_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = T00043_n87ClienteCobNombreTelefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ClienteCobNombreTelefono1", A87ClienteCobNombreTelefono1);
         A88ClienteFacTelefonos = T00043_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = T00043_n88ClienteFacTelefonos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88ClienteFacTelefonos", A88ClienteFacTelefonos);
         A89ClienteCobNombreTelefono2 = T00043_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = T00043_n89ClienteCobNombreTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ClienteCobNombreTelefono2", A89ClienteCobNombreTelefono2);
         A90ClienteCobTelefono2 = T00043_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = T00043_n90ClienteCobTelefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ClienteCobTelefono2", A90ClienteCobTelefono2);
         A91ClienteCobNombreCelular1 = T00043_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = T00043_n91ClienteCobNombreCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ClienteCobNombreCelular1", A91ClienteCobNombreCelular1);
         A92ClienteCobCelular1 = T00043_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = T00043_n92ClienteCobCelular1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92ClienteCobCelular1", A92ClienteCobCelular1);
         A93ClienteCobNombreCelular2 = T00043_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = T00043_n93ClienteCobNombreCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93ClienteCobNombreCelular2", A93ClienteCobNombreCelular2);
         A94ClienteCobCelular2 = T00043_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = T00043_n94ClienteCobCelular2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94ClienteCobCelular2", A94ClienteCobCelular2);
         A95ClienteCobNombreEmail1 = T00043_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = T00043_n95ClienteCobNombreEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95ClienteCobNombreEmail1", A95ClienteCobNombreEmail1);
         A96ClienteCobEmail1 = T00043_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = T00043_n96ClienteCobEmail1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ClienteCobEmail1", A96ClienteCobEmail1);
         A97ClienteCobNombreEmail2 = T00043_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = T00043_n97ClienteCobNombreEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97ClienteCobNombreEmail2", A97ClienteCobNombreEmail2);
         A98ClienteCobEmail2 = T00043_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = T00043_n98ClienteCobEmail2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98ClienteCobEmail2", A98ClienteCobEmail2);
         A99ClienteFacFax = T00043_A99ClienteFacFax[0] ;
         n99ClienteFacFax = T00043_n99ClienteFacFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99ClienteFacFax", A99ClienteFacFax);
         A100ClienteFacEmail = T00043_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = T00043_n100ClienteFacEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ClienteFacEmail", A100ClienteFacEmail);
         A101ClienteFacContrato = T00043_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = T00043_n101ClienteFacContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ClienteFacContrato", A101ClienteFacContrato);
         A102ClienteFacObservaciones = T00043_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = T00043_n102ClienteFacObservaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102ClienteFacObservaciones", A102ClienteFacObservaciones);
         A103ClienteFacLista = T00043_A103ClienteFacLista[0] ;
         n103ClienteFacLista = T00043_n103ClienteFacLista[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ClienteFacLista), 18, 0));
         A104ClienteFacContado = T00043_A104ClienteFacContado[0] ;
         n104ClienteFacContado = T00043_n104ClienteFacContado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ClienteFacContado), 4, 0));
         A105ClienteNotEmailFrascos1 = T00043_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = T00043_n105ClienteNotEmailFrascos1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ClienteNotEmailFrascos1", A105ClienteNotEmailFrascos1);
         A106ClienteNotEmailFrascos2 = T00043_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = T00043_n106ClienteNotEmailFrascos2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ClienteNotEmailFrascos2", A106ClienteNotEmailFrascos2);
         A107ClienteNotEmailMuestra1 = T00043_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = T00043_n107ClienteNotEmailMuestra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ClienteNotEmailMuestra1", A107ClienteNotEmailMuestra1);
         A108ClienteNotEmailMuestra2 = T00043_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = T00043_n108ClienteNotEmailMuestra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ClienteNotEmailMuestra2", A108ClienteNotEmailMuestra2);
         A109ClienteNotEmailAnalisis1 = T00043_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = T00043_n109ClienteNotEmailAnalisis1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ClienteNotEmailAnalisis1", A109ClienteNotEmailAnalisis1);
         A110ClienteNotEmailAnalisis2 = T00043_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = T00043_n110ClienteNotEmailAnalisis2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ClienteNotEmailAnalisis2", A110ClienteNotEmailAnalisis2);
         A111ClienteNotEmailGeneral1 = T00043_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = T00043_n111ClienteNotEmailGeneral1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ClienteNotEmailGeneral1", A111ClienteNotEmailGeneral1);
         A112ClienteNotEmailGeneral2 = T00043_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = T00043_n112ClienteNotEmailGeneral2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ClienteNotEmailGeneral2", A112ClienteNotEmailGeneral2);
         A113ClienteIncobrable = T00043_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = T00043_n113ClienteIncobrable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrimstr( DecimalUtil.doubleToDec(A113ClienteIncobrable), 4, 0));
         Z4ClienteId = A4ClienteId ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
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
      RcdFound4 = (short)(0) ;
      /* Using cursor T00046 */
      pr_default.execute(4, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00046_A4ClienteId[0] < A4ClienteId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00046_A4ClienteId[0] > A4ClienteId ) ) )
         {
            A4ClienteId = T00046_A4ClienteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound4 = (short)(0) ;
      /* Using cursor T00047 */
      pr_default.execute(5, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00047_A4ClienteId[0] > A4ClienteId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00047_A4ClienteId[0] < A4ClienteId ) ) )
         {
            A4ClienteId = T00047_A4ClienteId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtClienteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert044( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A4ClienteId != Z4ClienteId )
            {
               A4ClienteId = Z4ClienteId ;
               httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLIENTEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtClienteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtClienteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update044( ) ;
               GX_FocusControl = edtClienteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A4ClienteId != Z4ClienteId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtClienteId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert044( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLIENTEID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtClienteId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtClienteId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert044( ) ;
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
      if ( A4ClienteId != Z4ClienteId )
      {
         A4ClienteId = Z4ClienteId ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLIENTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClienteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtClienteId_Internalname ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "CLIENTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClienteId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtClienteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtClienteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtClienteNombre_Internalname ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtClienteNombre_Internalname ;
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
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound4 != 0 )
         {
            scanNext044( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtClienteNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00042 */
         pr_default.execute(0, new Object[] {Long.valueOf(A4ClienteId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Cliente"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z45ClienteNombre, T00042_A45ClienteNombre[0]) != 0 ) || ( GXutil.strcmp(Z46ClienteEmail, T00042_A46ClienteEmail[0]) != 0 ) || ( GXutil.strcmp(Z47ClienteNombreEmail1, T00042_A47ClienteNombreEmail1[0]) != 0 ) || ( GXutil.strcmp(Z48ClienteEmail1, T00042_A48ClienteEmail1[0]) != 0 ) || ( GXutil.strcmp(Z49ClienteNombreEmail2, T00042_A49ClienteNombreEmail2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z50ClienteEmail2, T00042_A50ClienteEmail2[0]) != 0 ) || ( GXutil.strcmp(Z51ClienteEnvio, T00042_A51ClienteEnvio[0]) != 0 ) || ( GXutil.strcmp(Z52ClienteUsuarioWeb, T00042_A52ClienteUsuarioWeb[0]) != 0 ) || ( GXutil.strcmp(Z53ClienteNombreCelular1, T00042_A53ClienteNombreCelular1[0]) != 0 ) || ( GXutil.strcmp(Z54ClienteCelular1, T00042_A54ClienteCelular1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z55ClienteNombreCelular2, T00042_A55ClienteNombreCelular2[0]) != 0 ) || ( GXutil.strcmp(Z56ClienteCelular2, T00042_A56ClienteCelular2[0]) != 0 ) || ( GXutil.strcmp(Z57ClienteCodigoFigaro, T00042_A57ClienteCodigoFigaro[0]) != 0 ) || ( Z58ClienteTipoUsuario != T00042_A58ClienteTipoUsuario[0] ) || ( GXutil.strcmp(Z59ClienteDireccion, T00042_A59ClienteDireccion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z60ClienteNombreTelefono1, T00042_A60ClienteNombreTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z61ClienteTelefono1, T00042_A61ClienteTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z62ClienteNombreTelefono2, T00042_A62ClienteNombreTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z63ClienteTelefono2, T00042_A63ClienteTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z64ClienteFax, T00042_A64ClienteFax[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z65ClienteDicose, T00042_A65ClienteDicose[0]) != 0 ) || ( Z66ClienteIdDepartamento != T00042_A66ClienteIdDepartamento[0] ) || ( Z67ClienteIdLocalidad != T00042_A67ClienteIdLocalidad[0] ) || ( Z68ClienteTecnico1 != T00042_A68ClienteTecnico1[0] ) || ( Z69ClienteTecnico2 != T00042_A69ClienteTecnico2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z70ClienteIdAgencia != T00042_A70ClienteIdAgencia[0] ) || ( Z71ClienteContrato != T00042_A71ClienteContrato[0] ) || ( Z72ClienteSocio != T00042_A72ClienteSocio[0] ) || ( Z73ClienteNoUsar != T00042_A73ClienteNoUsar[0] ) || ( Z74ClienteCodbar != T00042_A74ClienteCodbar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z75ClienteCaravanas != T00042_A75ClienteCaravanas[0] ) || ( Z76ClienteProlesa != T00042_A76ClienteProlesa[0] ) || ( Z77ClienteProlesaSuc != T00042_A77ClienteProlesaSuc[0] ) || ( Z168ClienteProlesaMat != T00042_A168ClienteProlesaMat[0] ) || ( GXutil.strcmp(Z78ClienteObservaciones, T00042_A78ClienteObservaciones[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z79ClienteFacRsocial, T00042_A79ClienteFacRsocial[0]) != 0 ) || ( GXutil.strcmp(Z80ClienteFacCedula, T00042_A80ClienteFacCedula[0]) != 0 ) || ( GXutil.strcmp(Z81ClienteFacRut, T00042_A81ClienteFacRut[0]) != 0 ) || ( GXutil.strcmp(Z82ClienteFacDireccion, T00042_A82ClienteFacDireccion[0]) != 0 ) || ( GXutil.strcmp(Z83ClienteFacLocalidad, T00042_A83ClienteFacLocalidad[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z84ClienteFacDepartamento != T00042_A84ClienteFacDepartamento[0] ) || ( GXutil.strcmp(Z85ClienteFacCpostal, T00042_A85ClienteFacCpostal[0]) != 0 ) || ( Z86ClienteFacGiro != T00042_A86ClienteFacGiro[0] ) || ( GXutil.strcmp(Z87ClienteCobNombreTelefono1, T00042_A87ClienteCobNombreTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z88ClienteFacTelefonos, T00042_A88ClienteFacTelefonos[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z89ClienteCobNombreTelefono2, T00042_A89ClienteCobNombreTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z90ClienteCobTelefono2, T00042_A90ClienteCobTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z91ClienteCobNombreCelular1, T00042_A91ClienteCobNombreCelular1[0]) != 0 ) || ( GXutil.strcmp(Z92ClienteCobCelular1, T00042_A92ClienteCobCelular1[0]) != 0 ) || ( GXutil.strcmp(Z93ClienteCobNombreCelular2, T00042_A93ClienteCobNombreCelular2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z94ClienteCobCelular2, T00042_A94ClienteCobCelular2[0]) != 0 ) || ( GXutil.strcmp(Z95ClienteCobNombreEmail1, T00042_A95ClienteCobNombreEmail1[0]) != 0 ) || ( GXutil.strcmp(Z96ClienteCobEmail1, T00042_A96ClienteCobEmail1[0]) != 0 ) || ( GXutil.strcmp(Z97ClienteCobNombreEmail2, T00042_A97ClienteCobNombreEmail2[0]) != 0 ) || ( GXutil.strcmp(Z98ClienteCobEmail2, T00042_A98ClienteCobEmail2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z99ClienteFacFax, T00042_A99ClienteFacFax[0]) != 0 ) || ( GXutil.strcmp(Z100ClienteFacEmail, T00042_A100ClienteFacEmail[0]) != 0 ) || ( GXutil.strcmp(Z101ClienteFacContrato, T00042_A101ClienteFacContrato[0]) != 0 ) || ( GXutil.strcmp(Z102ClienteFacObservaciones, T00042_A102ClienteFacObservaciones[0]) != 0 ) || ( Z103ClienteFacLista != T00042_A103ClienteFacLista[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z104ClienteFacContado != T00042_A104ClienteFacContado[0] ) || ( GXutil.strcmp(Z105ClienteNotEmailFrascos1, T00042_A105ClienteNotEmailFrascos1[0]) != 0 ) || ( GXutil.strcmp(Z106ClienteNotEmailFrascos2, T00042_A106ClienteNotEmailFrascos2[0]) != 0 ) || ( GXutil.strcmp(Z107ClienteNotEmailMuestra1, T00042_A107ClienteNotEmailMuestra1[0]) != 0 ) || ( GXutil.strcmp(Z108ClienteNotEmailMuestra2, T00042_A108ClienteNotEmailMuestra2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z109ClienteNotEmailAnalisis1, T00042_A109ClienteNotEmailAnalisis1[0]) != 0 ) || ( GXutil.strcmp(Z110ClienteNotEmailAnalisis2, T00042_A110ClienteNotEmailAnalisis2[0]) != 0 ) || ( GXutil.strcmp(Z111ClienteNotEmailGeneral1, T00042_A111ClienteNotEmailGeneral1[0]) != 0 ) || ( GXutil.strcmp(Z112ClienteNotEmailGeneral2, T00042_A112ClienteNotEmailGeneral2[0]) != 0 ) || ( Z113ClienteIncobrable != T00042_A113ClienteIncobrable[0] ) )
         {
            if ( GXutil.strcmp(Z45ClienteNombre, T00042_A45ClienteNombre[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombre");
               GXutil.writeLogRaw("Old: ",Z45ClienteNombre);
               GXutil.writeLogRaw("Current: ",T00042_A45ClienteNombre[0]);
            }
            if ( GXutil.strcmp(Z46ClienteEmail, T00042_A46ClienteEmail[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteEmail");
               GXutil.writeLogRaw("Old: ",Z46ClienteEmail);
               GXutil.writeLogRaw("Current: ",T00042_A46ClienteEmail[0]);
            }
            if ( GXutil.strcmp(Z47ClienteNombreEmail1, T00042_A47ClienteNombreEmail1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreEmail1");
               GXutil.writeLogRaw("Old: ",Z47ClienteNombreEmail1);
               GXutil.writeLogRaw("Current: ",T00042_A47ClienteNombreEmail1[0]);
            }
            if ( GXutil.strcmp(Z48ClienteEmail1, T00042_A48ClienteEmail1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteEmail1");
               GXutil.writeLogRaw("Old: ",Z48ClienteEmail1);
               GXutil.writeLogRaw("Current: ",T00042_A48ClienteEmail1[0]);
            }
            if ( GXutil.strcmp(Z49ClienteNombreEmail2, T00042_A49ClienteNombreEmail2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreEmail2");
               GXutil.writeLogRaw("Old: ",Z49ClienteNombreEmail2);
               GXutil.writeLogRaw("Current: ",T00042_A49ClienteNombreEmail2[0]);
            }
            if ( GXutil.strcmp(Z50ClienteEmail2, T00042_A50ClienteEmail2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteEmail2");
               GXutil.writeLogRaw("Old: ",Z50ClienteEmail2);
               GXutil.writeLogRaw("Current: ",T00042_A50ClienteEmail2[0]);
            }
            if ( GXutil.strcmp(Z51ClienteEnvio, T00042_A51ClienteEnvio[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteEnvio");
               GXutil.writeLogRaw("Old: ",Z51ClienteEnvio);
               GXutil.writeLogRaw("Current: ",T00042_A51ClienteEnvio[0]);
            }
            if ( GXutil.strcmp(Z52ClienteUsuarioWeb, T00042_A52ClienteUsuarioWeb[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteUsuarioWeb");
               GXutil.writeLogRaw("Old: ",Z52ClienteUsuarioWeb);
               GXutil.writeLogRaw("Current: ",T00042_A52ClienteUsuarioWeb[0]);
            }
            if ( GXutil.strcmp(Z53ClienteNombreCelular1, T00042_A53ClienteNombreCelular1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreCelular1");
               GXutil.writeLogRaw("Old: ",Z53ClienteNombreCelular1);
               GXutil.writeLogRaw("Current: ",T00042_A53ClienteNombreCelular1[0]);
            }
            if ( GXutil.strcmp(Z54ClienteCelular1, T00042_A54ClienteCelular1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCelular1");
               GXutil.writeLogRaw("Old: ",Z54ClienteCelular1);
               GXutil.writeLogRaw("Current: ",T00042_A54ClienteCelular1[0]);
            }
            if ( GXutil.strcmp(Z55ClienteNombreCelular2, T00042_A55ClienteNombreCelular2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreCelular2");
               GXutil.writeLogRaw("Old: ",Z55ClienteNombreCelular2);
               GXutil.writeLogRaw("Current: ",T00042_A55ClienteNombreCelular2[0]);
            }
            if ( GXutil.strcmp(Z56ClienteCelular2, T00042_A56ClienteCelular2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCelular2");
               GXutil.writeLogRaw("Old: ",Z56ClienteCelular2);
               GXutil.writeLogRaw("Current: ",T00042_A56ClienteCelular2[0]);
            }
            if ( GXutil.strcmp(Z57ClienteCodigoFigaro, T00042_A57ClienteCodigoFigaro[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCodigoFigaro");
               GXutil.writeLogRaw("Old: ",Z57ClienteCodigoFigaro);
               GXutil.writeLogRaw("Current: ",T00042_A57ClienteCodigoFigaro[0]);
            }
            if ( Z58ClienteTipoUsuario != T00042_A58ClienteTipoUsuario[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteTipoUsuario");
               GXutil.writeLogRaw("Old: ",Z58ClienteTipoUsuario);
               GXutil.writeLogRaw("Current: ",T00042_A58ClienteTipoUsuario[0]);
            }
            if ( GXutil.strcmp(Z59ClienteDireccion, T00042_A59ClienteDireccion[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteDireccion");
               GXutil.writeLogRaw("Old: ",Z59ClienteDireccion);
               GXutil.writeLogRaw("Current: ",T00042_A59ClienteDireccion[0]);
            }
            if ( GXutil.strcmp(Z60ClienteNombreTelefono1, T00042_A60ClienteNombreTelefono1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreTelefono1");
               GXutil.writeLogRaw("Old: ",Z60ClienteNombreTelefono1);
               GXutil.writeLogRaw("Current: ",T00042_A60ClienteNombreTelefono1[0]);
            }
            if ( GXutil.strcmp(Z61ClienteTelefono1, T00042_A61ClienteTelefono1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteTelefono1");
               GXutil.writeLogRaw("Old: ",Z61ClienteTelefono1);
               GXutil.writeLogRaw("Current: ",T00042_A61ClienteTelefono1[0]);
            }
            if ( GXutil.strcmp(Z62ClienteNombreTelefono2, T00042_A62ClienteNombreTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNombreTelefono2");
               GXutil.writeLogRaw("Old: ",Z62ClienteNombreTelefono2);
               GXutil.writeLogRaw("Current: ",T00042_A62ClienteNombreTelefono2[0]);
            }
            if ( GXutil.strcmp(Z63ClienteTelefono2, T00042_A63ClienteTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteTelefono2");
               GXutil.writeLogRaw("Old: ",Z63ClienteTelefono2);
               GXutil.writeLogRaw("Current: ",T00042_A63ClienteTelefono2[0]);
            }
            if ( GXutil.strcmp(Z64ClienteFax, T00042_A64ClienteFax[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFax");
               GXutil.writeLogRaw("Old: ",Z64ClienteFax);
               GXutil.writeLogRaw("Current: ",T00042_A64ClienteFax[0]);
            }
            if ( GXutil.strcmp(Z65ClienteDicose, T00042_A65ClienteDicose[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteDicose");
               GXutil.writeLogRaw("Old: ",Z65ClienteDicose);
               GXutil.writeLogRaw("Current: ",T00042_A65ClienteDicose[0]);
            }
            if ( Z66ClienteIdDepartamento != T00042_A66ClienteIdDepartamento[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteIdDepartamento");
               GXutil.writeLogRaw("Old: ",Z66ClienteIdDepartamento);
               GXutil.writeLogRaw("Current: ",T00042_A66ClienteIdDepartamento[0]);
            }
            if ( Z67ClienteIdLocalidad != T00042_A67ClienteIdLocalidad[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteIdLocalidad");
               GXutil.writeLogRaw("Old: ",Z67ClienteIdLocalidad);
               GXutil.writeLogRaw("Current: ",T00042_A67ClienteIdLocalidad[0]);
            }
            if ( Z68ClienteTecnico1 != T00042_A68ClienteTecnico1[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteTecnico1");
               GXutil.writeLogRaw("Old: ",Z68ClienteTecnico1);
               GXutil.writeLogRaw("Current: ",T00042_A68ClienteTecnico1[0]);
            }
            if ( Z69ClienteTecnico2 != T00042_A69ClienteTecnico2[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteTecnico2");
               GXutil.writeLogRaw("Old: ",Z69ClienteTecnico2);
               GXutil.writeLogRaw("Current: ",T00042_A69ClienteTecnico2[0]);
            }
            if ( Z70ClienteIdAgencia != T00042_A70ClienteIdAgencia[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteIdAgencia");
               GXutil.writeLogRaw("Old: ",Z70ClienteIdAgencia);
               GXutil.writeLogRaw("Current: ",T00042_A70ClienteIdAgencia[0]);
            }
            if ( Z71ClienteContrato != T00042_A71ClienteContrato[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteContrato");
               GXutil.writeLogRaw("Old: ",Z71ClienteContrato);
               GXutil.writeLogRaw("Current: ",T00042_A71ClienteContrato[0]);
            }
            if ( Z72ClienteSocio != T00042_A72ClienteSocio[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteSocio");
               GXutil.writeLogRaw("Old: ",Z72ClienteSocio);
               GXutil.writeLogRaw("Current: ",T00042_A72ClienteSocio[0]);
            }
            if ( Z73ClienteNoUsar != T00042_A73ClienteNoUsar[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNoUsar");
               GXutil.writeLogRaw("Old: ",Z73ClienteNoUsar);
               GXutil.writeLogRaw("Current: ",T00042_A73ClienteNoUsar[0]);
            }
            if ( Z74ClienteCodbar != T00042_A74ClienteCodbar[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCodbar");
               GXutil.writeLogRaw("Old: ",Z74ClienteCodbar);
               GXutil.writeLogRaw("Current: ",T00042_A74ClienteCodbar[0]);
            }
            if ( Z75ClienteCaravanas != T00042_A75ClienteCaravanas[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCaravanas");
               GXutil.writeLogRaw("Old: ",Z75ClienteCaravanas);
               GXutil.writeLogRaw("Current: ",T00042_A75ClienteCaravanas[0]);
            }
            if ( Z76ClienteProlesa != T00042_A76ClienteProlesa[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteProlesa");
               GXutil.writeLogRaw("Old: ",Z76ClienteProlesa);
               GXutil.writeLogRaw("Current: ",T00042_A76ClienteProlesa[0]);
            }
            if ( Z77ClienteProlesaSuc != T00042_A77ClienteProlesaSuc[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteProlesaSuc");
               GXutil.writeLogRaw("Old: ",Z77ClienteProlesaSuc);
               GXutil.writeLogRaw("Current: ",T00042_A77ClienteProlesaSuc[0]);
            }
            if ( Z168ClienteProlesaMat != T00042_A168ClienteProlesaMat[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteProlesaMat");
               GXutil.writeLogRaw("Old: ",Z168ClienteProlesaMat);
               GXutil.writeLogRaw("Current: ",T00042_A168ClienteProlesaMat[0]);
            }
            if ( GXutil.strcmp(Z78ClienteObservaciones, T00042_A78ClienteObservaciones[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteObservaciones");
               GXutil.writeLogRaw("Old: ",Z78ClienteObservaciones);
               GXutil.writeLogRaw("Current: ",T00042_A78ClienteObservaciones[0]);
            }
            if ( GXutil.strcmp(Z79ClienteFacRsocial, T00042_A79ClienteFacRsocial[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacRsocial");
               GXutil.writeLogRaw("Old: ",Z79ClienteFacRsocial);
               GXutil.writeLogRaw("Current: ",T00042_A79ClienteFacRsocial[0]);
            }
            if ( GXutil.strcmp(Z80ClienteFacCedula, T00042_A80ClienteFacCedula[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacCedula");
               GXutil.writeLogRaw("Old: ",Z80ClienteFacCedula);
               GXutil.writeLogRaw("Current: ",T00042_A80ClienteFacCedula[0]);
            }
            if ( GXutil.strcmp(Z81ClienteFacRut, T00042_A81ClienteFacRut[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacRut");
               GXutil.writeLogRaw("Old: ",Z81ClienteFacRut);
               GXutil.writeLogRaw("Current: ",T00042_A81ClienteFacRut[0]);
            }
            if ( GXutil.strcmp(Z82ClienteFacDireccion, T00042_A82ClienteFacDireccion[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacDireccion");
               GXutil.writeLogRaw("Old: ",Z82ClienteFacDireccion);
               GXutil.writeLogRaw("Current: ",T00042_A82ClienteFacDireccion[0]);
            }
            if ( GXutil.strcmp(Z83ClienteFacLocalidad, T00042_A83ClienteFacLocalidad[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacLocalidad");
               GXutil.writeLogRaw("Old: ",Z83ClienteFacLocalidad);
               GXutil.writeLogRaw("Current: ",T00042_A83ClienteFacLocalidad[0]);
            }
            if ( Z84ClienteFacDepartamento != T00042_A84ClienteFacDepartamento[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacDepartamento");
               GXutil.writeLogRaw("Old: ",Z84ClienteFacDepartamento);
               GXutil.writeLogRaw("Current: ",T00042_A84ClienteFacDepartamento[0]);
            }
            if ( GXutil.strcmp(Z85ClienteFacCpostal, T00042_A85ClienteFacCpostal[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacCpostal");
               GXutil.writeLogRaw("Old: ",Z85ClienteFacCpostal);
               GXutil.writeLogRaw("Current: ",T00042_A85ClienteFacCpostal[0]);
            }
            if ( Z86ClienteFacGiro != T00042_A86ClienteFacGiro[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacGiro");
               GXutil.writeLogRaw("Old: ",Z86ClienteFacGiro);
               GXutil.writeLogRaw("Current: ",T00042_A86ClienteFacGiro[0]);
            }
            if ( GXutil.strcmp(Z87ClienteCobNombreTelefono1, T00042_A87ClienteCobNombreTelefono1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreTelefono1");
               GXutil.writeLogRaw("Old: ",Z87ClienteCobNombreTelefono1);
               GXutil.writeLogRaw("Current: ",T00042_A87ClienteCobNombreTelefono1[0]);
            }
            if ( GXutil.strcmp(Z88ClienteFacTelefonos, T00042_A88ClienteFacTelefonos[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacTelefonos");
               GXutil.writeLogRaw("Old: ",Z88ClienteFacTelefonos);
               GXutil.writeLogRaw("Current: ",T00042_A88ClienteFacTelefonos[0]);
            }
            if ( GXutil.strcmp(Z89ClienteCobNombreTelefono2, T00042_A89ClienteCobNombreTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreTelefono2");
               GXutil.writeLogRaw("Old: ",Z89ClienteCobNombreTelefono2);
               GXutil.writeLogRaw("Current: ",T00042_A89ClienteCobNombreTelefono2[0]);
            }
            if ( GXutil.strcmp(Z90ClienteCobTelefono2, T00042_A90ClienteCobTelefono2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobTelefono2");
               GXutil.writeLogRaw("Old: ",Z90ClienteCobTelefono2);
               GXutil.writeLogRaw("Current: ",T00042_A90ClienteCobTelefono2[0]);
            }
            if ( GXutil.strcmp(Z91ClienteCobNombreCelular1, T00042_A91ClienteCobNombreCelular1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreCelular1");
               GXutil.writeLogRaw("Old: ",Z91ClienteCobNombreCelular1);
               GXutil.writeLogRaw("Current: ",T00042_A91ClienteCobNombreCelular1[0]);
            }
            if ( GXutil.strcmp(Z92ClienteCobCelular1, T00042_A92ClienteCobCelular1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobCelular1");
               GXutil.writeLogRaw("Old: ",Z92ClienteCobCelular1);
               GXutil.writeLogRaw("Current: ",T00042_A92ClienteCobCelular1[0]);
            }
            if ( GXutil.strcmp(Z93ClienteCobNombreCelular2, T00042_A93ClienteCobNombreCelular2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreCelular2");
               GXutil.writeLogRaw("Old: ",Z93ClienteCobNombreCelular2);
               GXutil.writeLogRaw("Current: ",T00042_A93ClienteCobNombreCelular2[0]);
            }
            if ( GXutil.strcmp(Z94ClienteCobCelular2, T00042_A94ClienteCobCelular2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobCelular2");
               GXutil.writeLogRaw("Old: ",Z94ClienteCobCelular2);
               GXutil.writeLogRaw("Current: ",T00042_A94ClienteCobCelular2[0]);
            }
            if ( GXutil.strcmp(Z95ClienteCobNombreEmail1, T00042_A95ClienteCobNombreEmail1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreEmail1");
               GXutil.writeLogRaw("Old: ",Z95ClienteCobNombreEmail1);
               GXutil.writeLogRaw("Current: ",T00042_A95ClienteCobNombreEmail1[0]);
            }
            if ( GXutil.strcmp(Z96ClienteCobEmail1, T00042_A96ClienteCobEmail1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobEmail1");
               GXutil.writeLogRaw("Old: ",Z96ClienteCobEmail1);
               GXutil.writeLogRaw("Current: ",T00042_A96ClienteCobEmail1[0]);
            }
            if ( GXutil.strcmp(Z97ClienteCobNombreEmail2, T00042_A97ClienteCobNombreEmail2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobNombreEmail2");
               GXutil.writeLogRaw("Old: ",Z97ClienteCobNombreEmail2);
               GXutil.writeLogRaw("Current: ",T00042_A97ClienteCobNombreEmail2[0]);
            }
            if ( GXutil.strcmp(Z98ClienteCobEmail2, T00042_A98ClienteCobEmail2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteCobEmail2");
               GXutil.writeLogRaw("Old: ",Z98ClienteCobEmail2);
               GXutil.writeLogRaw("Current: ",T00042_A98ClienteCobEmail2[0]);
            }
            if ( GXutil.strcmp(Z99ClienteFacFax, T00042_A99ClienteFacFax[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacFax");
               GXutil.writeLogRaw("Old: ",Z99ClienteFacFax);
               GXutil.writeLogRaw("Current: ",T00042_A99ClienteFacFax[0]);
            }
            if ( GXutil.strcmp(Z100ClienteFacEmail, T00042_A100ClienteFacEmail[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacEmail");
               GXutil.writeLogRaw("Old: ",Z100ClienteFacEmail);
               GXutil.writeLogRaw("Current: ",T00042_A100ClienteFacEmail[0]);
            }
            if ( GXutil.strcmp(Z101ClienteFacContrato, T00042_A101ClienteFacContrato[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacContrato");
               GXutil.writeLogRaw("Old: ",Z101ClienteFacContrato);
               GXutil.writeLogRaw("Current: ",T00042_A101ClienteFacContrato[0]);
            }
            if ( GXutil.strcmp(Z102ClienteFacObservaciones, T00042_A102ClienteFacObservaciones[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacObservaciones");
               GXutil.writeLogRaw("Old: ",Z102ClienteFacObservaciones);
               GXutil.writeLogRaw("Current: ",T00042_A102ClienteFacObservaciones[0]);
            }
            if ( Z103ClienteFacLista != T00042_A103ClienteFacLista[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacLista");
               GXutil.writeLogRaw("Old: ",Z103ClienteFacLista);
               GXutil.writeLogRaw("Current: ",T00042_A103ClienteFacLista[0]);
            }
            if ( Z104ClienteFacContado != T00042_A104ClienteFacContado[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteFacContado");
               GXutil.writeLogRaw("Old: ",Z104ClienteFacContado);
               GXutil.writeLogRaw("Current: ",T00042_A104ClienteFacContado[0]);
            }
            if ( GXutil.strcmp(Z105ClienteNotEmailFrascos1, T00042_A105ClienteNotEmailFrascos1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailFrascos1");
               GXutil.writeLogRaw("Old: ",Z105ClienteNotEmailFrascos1);
               GXutil.writeLogRaw("Current: ",T00042_A105ClienteNotEmailFrascos1[0]);
            }
            if ( GXutil.strcmp(Z106ClienteNotEmailFrascos2, T00042_A106ClienteNotEmailFrascos2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailFrascos2");
               GXutil.writeLogRaw("Old: ",Z106ClienteNotEmailFrascos2);
               GXutil.writeLogRaw("Current: ",T00042_A106ClienteNotEmailFrascos2[0]);
            }
            if ( GXutil.strcmp(Z107ClienteNotEmailMuestra1, T00042_A107ClienteNotEmailMuestra1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailMuestra1");
               GXutil.writeLogRaw("Old: ",Z107ClienteNotEmailMuestra1);
               GXutil.writeLogRaw("Current: ",T00042_A107ClienteNotEmailMuestra1[0]);
            }
            if ( GXutil.strcmp(Z108ClienteNotEmailMuestra2, T00042_A108ClienteNotEmailMuestra2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailMuestra2");
               GXutil.writeLogRaw("Old: ",Z108ClienteNotEmailMuestra2);
               GXutil.writeLogRaw("Current: ",T00042_A108ClienteNotEmailMuestra2[0]);
            }
            if ( GXutil.strcmp(Z109ClienteNotEmailAnalisis1, T00042_A109ClienteNotEmailAnalisis1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailAnalisis1");
               GXutil.writeLogRaw("Old: ",Z109ClienteNotEmailAnalisis1);
               GXutil.writeLogRaw("Current: ",T00042_A109ClienteNotEmailAnalisis1[0]);
            }
            if ( GXutil.strcmp(Z110ClienteNotEmailAnalisis2, T00042_A110ClienteNotEmailAnalisis2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailAnalisis2");
               GXutil.writeLogRaw("Old: ",Z110ClienteNotEmailAnalisis2);
               GXutil.writeLogRaw("Current: ",T00042_A110ClienteNotEmailAnalisis2[0]);
            }
            if ( GXutil.strcmp(Z111ClienteNotEmailGeneral1, T00042_A111ClienteNotEmailGeneral1[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailGeneral1");
               GXutil.writeLogRaw("Old: ",Z111ClienteNotEmailGeneral1);
               GXutil.writeLogRaw("Current: ",T00042_A111ClienteNotEmailGeneral1[0]);
            }
            if ( GXutil.strcmp(Z112ClienteNotEmailGeneral2, T00042_A112ClienteNotEmailGeneral2[0]) != 0 )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteNotEmailGeneral2");
               GXutil.writeLogRaw("Old: ",Z112ClienteNotEmailGeneral2);
               GXutil.writeLogRaw("Current: ",T00042_A112ClienteNotEmailGeneral2[0]);
            }
            if ( Z113ClienteIncobrable != T00042_A113ClienteIncobrable[0] )
            {
               GXutil.writeLogln("cliente:[seudo value changed for attri]"+"ClienteIncobrable");
               GXutil.writeLogRaw("Old: ",Z113ClienteIncobrable);
               GXutil.writeLogRaw("Current: ",T00042_A113ClienteIncobrable[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Cliente"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00048 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A4ClienteId), Boolean.valueOf(n45ClienteNombre), A45ClienteNombre, Boolean.valueOf(n46ClienteEmail), A46ClienteEmail, Boolean.valueOf(n47ClienteNombreEmail1), A47ClienteNombreEmail1, Boolean.valueOf(n48ClienteEmail1), A48ClienteEmail1, Boolean.valueOf(n49ClienteNombreEmail2), A49ClienteNombreEmail2, Boolean.valueOf(n50ClienteEmail2), A50ClienteEmail2, Boolean.valueOf(n51ClienteEnvio), A51ClienteEnvio, Boolean.valueOf(n52ClienteUsuarioWeb), A52ClienteUsuarioWeb, Boolean.valueOf(n53ClienteNombreCelular1), A53ClienteNombreCelular1, Boolean.valueOf(n54ClienteCelular1), A54ClienteCelular1, Boolean.valueOf(n55ClienteNombreCelular2), A55ClienteNombreCelular2, Boolean.valueOf(n56ClienteCelular2), A56ClienteCelular2, Boolean.valueOf(n57ClienteCodigoFigaro), A57ClienteCodigoFigaro, Boolean.valueOf(n58ClienteTipoUsuario), Short.valueOf(A58ClienteTipoUsuario), Boolean.valueOf(n59ClienteDireccion), A59ClienteDireccion, Boolean.valueOf(n60ClienteNombreTelefono1), A60ClienteNombreTelefono1, Boolean.valueOf(n61ClienteTelefono1), A61ClienteTelefono1, Boolean.valueOf(n62ClienteNombreTelefono2), A62ClienteNombreTelefono2, Boolean.valueOf(n63ClienteTelefono2), A63ClienteTelefono2, Boolean.valueOf(n64ClienteFax), A64ClienteFax, Boolean.valueOf(n65ClienteDicose), A65ClienteDicose, Boolean.valueOf(n66ClienteIdDepartamento), Long.valueOf(A66ClienteIdDepartamento), Boolean.valueOf(n67ClienteIdLocalidad), Long.valueOf(A67ClienteIdLocalidad), Boolean.valueOf(n68ClienteTecnico1), Long.valueOf(A68ClienteTecnico1), Boolean.valueOf(n69ClienteTecnico2), Long.valueOf(A69ClienteTecnico2), Boolean.valueOf(n70ClienteIdAgencia), Long.valueOf(A70ClienteIdAgencia), Boolean.valueOf(n71ClienteContrato), Short.valueOf(A71ClienteContrato), Boolean.valueOf(n72ClienteSocio), Short.valueOf(A72ClienteSocio), Boolean.valueOf(n73ClienteNoUsar), Short.valueOf(A73ClienteNoUsar), Boolean.valueOf(n74ClienteCodbar), Short.valueOf(A74ClienteCodbar), Boolean.valueOf(n75ClienteCaravanas), Short.valueOf(A75ClienteCaravanas), Boolean.valueOf(n76ClienteProlesa), Short.valueOf(A76ClienteProlesa), Boolean.valueOf(n77ClienteProlesaSuc), Long.valueOf(A77ClienteProlesaSuc), Long.valueOf(A168ClienteProlesaMat), Boolean.valueOf(n78ClienteObservaciones), A78ClienteObservaciones, Boolean.valueOf(n79ClienteFacRsocial), A79ClienteFacRsocial, Boolean.valueOf(n80ClienteFacCedula), A80ClienteFacCedula, Boolean.valueOf(n81ClienteFacRut), A81ClienteFacRut, Boolean.valueOf(n82ClienteFacDireccion), A82ClienteFacDireccion, Boolean.valueOf(n83ClienteFacLocalidad), A83ClienteFacLocalidad, Boolean.valueOf(n84ClienteFacDepartamento), Long.valueOf(A84ClienteFacDepartamento), Boolean.valueOf(n85ClienteFacCpostal), A85ClienteFacCpostal, Boolean.valueOf(n86ClienteFacGiro), Long.valueOf(A86ClienteFacGiro), Boolean.valueOf(n87ClienteCobNombreTelefono1), A87ClienteCobNombreTelefono1, Boolean.valueOf(n88ClienteFacTelefonos), A88ClienteFacTelefonos, Boolean.valueOf(n89ClienteCobNombreTelefono2), A89ClienteCobNombreTelefono2, Boolean.valueOf(n90ClienteCobTelefono2), A90ClienteCobTelefono2, Boolean.valueOf(n91ClienteCobNombreCelular1), A91ClienteCobNombreCelular1, Boolean.valueOf(n92ClienteCobCelular1), A92ClienteCobCelular1, Boolean.valueOf(n93ClienteCobNombreCelular2), A93ClienteCobNombreCelular2, Boolean.valueOf(n94ClienteCobCelular2), A94ClienteCobCelular2, Boolean.valueOf(n95ClienteCobNombreEmail1), A95ClienteCobNombreEmail1, Boolean.valueOf(n96ClienteCobEmail1), A96ClienteCobEmail1, Boolean.valueOf(n97ClienteCobNombreEmail2), A97ClienteCobNombreEmail2, Boolean.valueOf(n98ClienteCobEmail2), A98ClienteCobEmail2, Boolean.valueOf(n99ClienteFacFax), A99ClienteFacFax, Boolean.valueOf(n100ClienteFacEmail), A100ClienteFacEmail, Boolean.valueOf(n101ClienteFacContrato), A101ClienteFacContrato, Boolean.valueOf(n102ClienteFacObservaciones), A102ClienteFacObservaciones, Boolean.valueOf(n103ClienteFacLista), Long.valueOf(A103ClienteFacLista), Boolean.valueOf(n104ClienteFacContado), Short.valueOf(A104ClienteFacContado),
                  Boolean.valueOf(n105ClienteNotEmailFrascos1), A105ClienteNotEmailFrascos1, Boolean.valueOf(n106ClienteNotEmailFrascos2), A106ClienteNotEmailFrascos2, Boolean.valueOf(n107ClienteNotEmailMuestra1), A107ClienteNotEmailMuestra1, Boolean.valueOf(n108ClienteNotEmailMuestra2), A108ClienteNotEmailMuestra2, Boolean.valueOf(n109ClienteNotEmailAnalisis1), A109ClienteNotEmailAnalisis1, Boolean.valueOf(n110ClienteNotEmailAnalisis2), A110ClienteNotEmailAnalisis2, Boolean.valueOf(n111ClienteNotEmailGeneral1), A111ClienteNotEmailGeneral1, Boolean.valueOf(n112ClienteNotEmailGeneral2), A112ClienteNotEmailGeneral2, Boolean.valueOf(n113ClienteIncobrable), Short.valueOf(A113ClienteIncobrable)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
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
                        resetCaption040( ) ;
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00049 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n45ClienteNombre), A45ClienteNombre, Boolean.valueOf(n46ClienteEmail), A46ClienteEmail, Boolean.valueOf(n47ClienteNombreEmail1), A47ClienteNombreEmail1, Boolean.valueOf(n48ClienteEmail1), A48ClienteEmail1, Boolean.valueOf(n49ClienteNombreEmail2), A49ClienteNombreEmail2, Boolean.valueOf(n50ClienteEmail2), A50ClienteEmail2, Boolean.valueOf(n51ClienteEnvio), A51ClienteEnvio, Boolean.valueOf(n52ClienteUsuarioWeb), A52ClienteUsuarioWeb, Boolean.valueOf(n53ClienteNombreCelular1), A53ClienteNombreCelular1, Boolean.valueOf(n54ClienteCelular1), A54ClienteCelular1, Boolean.valueOf(n55ClienteNombreCelular2), A55ClienteNombreCelular2, Boolean.valueOf(n56ClienteCelular2), A56ClienteCelular2, Boolean.valueOf(n57ClienteCodigoFigaro), A57ClienteCodigoFigaro, Boolean.valueOf(n58ClienteTipoUsuario), Short.valueOf(A58ClienteTipoUsuario), Boolean.valueOf(n59ClienteDireccion), A59ClienteDireccion, Boolean.valueOf(n60ClienteNombreTelefono1), A60ClienteNombreTelefono1, Boolean.valueOf(n61ClienteTelefono1), A61ClienteTelefono1, Boolean.valueOf(n62ClienteNombreTelefono2), A62ClienteNombreTelefono2, Boolean.valueOf(n63ClienteTelefono2), A63ClienteTelefono2, Boolean.valueOf(n64ClienteFax), A64ClienteFax, Boolean.valueOf(n65ClienteDicose), A65ClienteDicose, Boolean.valueOf(n66ClienteIdDepartamento), Long.valueOf(A66ClienteIdDepartamento), Boolean.valueOf(n67ClienteIdLocalidad), Long.valueOf(A67ClienteIdLocalidad), Boolean.valueOf(n68ClienteTecnico1), Long.valueOf(A68ClienteTecnico1), Boolean.valueOf(n69ClienteTecnico2), Long.valueOf(A69ClienteTecnico2), Boolean.valueOf(n70ClienteIdAgencia), Long.valueOf(A70ClienteIdAgencia), Boolean.valueOf(n71ClienteContrato), Short.valueOf(A71ClienteContrato), Boolean.valueOf(n72ClienteSocio), Short.valueOf(A72ClienteSocio), Boolean.valueOf(n73ClienteNoUsar), Short.valueOf(A73ClienteNoUsar), Boolean.valueOf(n74ClienteCodbar), Short.valueOf(A74ClienteCodbar), Boolean.valueOf(n75ClienteCaravanas), Short.valueOf(A75ClienteCaravanas), Boolean.valueOf(n76ClienteProlesa), Short.valueOf(A76ClienteProlesa), Boolean.valueOf(n77ClienteProlesaSuc), Long.valueOf(A77ClienteProlesaSuc), Long.valueOf(A168ClienteProlesaMat), Boolean.valueOf(n78ClienteObservaciones), A78ClienteObservaciones, Boolean.valueOf(n79ClienteFacRsocial), A79ClienteFacRsocial, Boolean.valueOf(n80ClienteFacCedula), A80ClienteFacCedula, Boolean.valueOf(n81ClienteFacRut), A81ClienteFacRut, Boolean.valueOf(n82ClienteFacDireccion), A82ClienteFacDireccion, Boolean.valueOf(n83ClienteFacLocalidad), A83ClienteFacLocalidad, Boolean.valueOf(n84ClienteFacDepartamento), Long.valueOf(A84ClienteFacDepartamento), Boolean.valueOf(n85ClienteFacCpostal), A85ClienteFacCpostal, Boolean.valueOf(n86ClienteFacGiro), Long.valueOf(A86ClienteFacGiro), Boolean.valueOf(n87ClienteCobNombreTelefono1), A87ClienteCobNombreTelefono1, Boolean.valueOf(n88ClienteFacTelefonos), A88ClienteFacTelefonos, Boolean.valueOf(n89ClienteCobNombreTelefono2), A89ClienteCobNombreTelefono2, Boolean.valueOf(n90ClienteCobTelefono2), A90ClienteCobTelefono2, Boolean.valueOf(n91ClienteCobNombreCelular1), A91ClienteCobNombreCelular1, Boolean.valueOf(n92ClienteCobCelular1), A92ClienteCobCelular1, Boolean.valueOf(n93ClienteCobNombreCelular2), A93ClienteCobNombreCelular2, Boolean.valueOf(n94ClienteCobCelular2), A94ClienteCobCelular2, Boolean.valueOf(n95ClienteCobNombreEmail1), A95ClienteCobNombreEmail1, Boolean.valueOf(n96ClienteCobEmail1), A96ClienteCobEmail1, Boolean.valueOf(n97ClienteCobNombreEmail2), A97ClienteCobNombreEmail2, Boolean.valueOf(n98ClienteCobEmail2), A98ClienteCobEmail2, Boolean.valueOf(n99ClienteFacFax), A99ClienteFacFax, Boolean.valueOf(n100ClienteFacEmail), A100ClienteFacEmail, Boolean.valueOf(n101ClienteFacContrato), A101ClienteFacContrato, Boolean.valueOf(n102ClienteFacObservaciones), A102ClienteFacObservaciones, Boolean.valueOf(n103ClienteFacLista), Long.valueOf(A103ClienteFacLista), Boolean.valueOf(n104ClienteFacContado), Short.valueOf(A104ClienteFacContado), Boolean.valueOf(n105ClienteNotEmailFrascos1),
                  A105ClienteNotEmailFrascos1, Boolean.valueOf(n106ClienteNotEmailFrascos2), A106ClienteNotEmailFrascos2, Boolean.valueOf(n107ClienteNotEmailMuestra1), A107ClienteNotEmailMuestra1, Boolean.valueOf(n108ClienteNotEmailMuestra2), A108ClienteNotEmailMuestra2, Boolean.valueOf(n109ClienteNotEmailAnalisis1), A109ClienteNotEmailAnalisis1, Boolean.valueOf(n110ClienteNotEmailAnalisis2), A110ClienteNotEmailAnalisis2, Boolean.valueOf(n111ClienteNotEmailGeneral1), A111ClienteNotEmailGeneral1, Boolean.valueOf(n112ClienteNotEmailGeneral2), A112ClienteNotEmailGeneral2, Boolean.valueOf(n113ClienteIncobrable), Short.valueOf(A113ClienteIncobrable), Long.valueOf(A4ClienteId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Cliente"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption040( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000410 */
               pr_default.execute(8, new Object[] {Long.valueOf(A4ClienteId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound4 == 0 )
                     {
                        initAll044( ) ;
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
                     resetCaption040( ) ;
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel044( ) ;
      Gx_mode = sMode4 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "cliente");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "cliente");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart044( )
   {
      /* Using cursor T000411 */
      pr_default.execute(9);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A4ClienteId = T000411_A4ClienteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A4ClienteId = T000411_A4ClienteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
      }
   }

   public void scanEnd044( )
   {
      pr_default.close(9);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
      edtClienteId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteId_Enabled), 5, 0), true);
      edtClienteNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombre_Enabled), 5, 0), true);
      edtClienteEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteEmail_Enabled), 5, 0), true);
      edtClienteNombreEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreEmail1_Enabled), 5, 0), true);
      edtClienteEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteEmail1_Enabled), 5, 0), true);
      edtClienteNombreEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreEmail2_Enabled), 5, 0), true);
      edtClienteEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteEmail2_Enabled), 5, 0), true);
      edtClienteEnvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteEnvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteEnvio_Enabled), 5, 0), true);
      edtClienteUsuarioWeb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteUsuarioWeb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteUsuarioWeb_Enabled), 5, 0), true);
      edtClienteNombreCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreCelular1_Enabled), 5, 0), true);
      edtClienteCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCelular1_Enabled), 5, 0), true);
      edtClienteNombreCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreCelular2_Enabled), 5, 0), true);
      edtClienteCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCelular2_Enabled), 5, 0), true);
      edtClienteCodigoFigaro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCodigoFigaro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCodigoFigaro_Enabled), 5, 0), true);
      edtClienteTipoUsuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteTipoUsuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteTipoUsuario_Enabled), 5, 0), true);
      edtClienteDireccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteDireccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteDireccion_Enabled), 5, 0), true);
      edtClienteNombreTelefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreTelefono1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreTelefono1_Enabled), 5, 0), true);
      edtClienteTelefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteTelefono1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteTelefono1_Enabled), 5, 0), true);
      edtClienteNombreTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNombreTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNombreTelefono2_Enabled), 5, 0), true);
      edtClienteTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteTelefono2_Enabled), 5, 0), true);
      edtClienteFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFax_Enabled), 5, 0), true);
      edtClienteDicose_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteDicose_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteDicose_Enabled), 5, 0), true);
      edtClienteIdDepartamento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteIdDepartamento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteIdDepartamento_Enabled), 5, 0), true);
      edtClienteIdLocalidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteIdLocalidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteIdLocalidad_Enabled), 5, 0), true);
      edtClienteTecnico1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteTecnico1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteTecnico1_Enabled), 5, 0), true);
      edtClienteTecnico2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteTecnico2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteTecnico2_Enabled), 5, 0), true);
      edtClienteIdAgencia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteIdAgencia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteIdAgencia_Enabled), 5, 0), true);
      edtClienteContrato_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteContrato_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteContrato_Enabled), 5, 0), true);
      edtClienteSocio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteSocio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteSocio_Enabled), 5, 0), true);
      edtClienteNoUsar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNoUsar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNoUsar_Enabled), 5, 0), true);
      edtClienteCodbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCodbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCodbar_Enabled), 5, 0), true);
      edtClienteCaravanas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCaravanas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCaravanas_Enabled), 5, 0), true);
      edtClienteProlesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteProlesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteProlesa_Enabled), 5, 0), true);
      edtClienteProlesaSuc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteProlesaSuc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteProlesaSuc_Enabled), 5, 0), true);
      edtClienteProlesaMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteProlesaMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteProlesaMat_Enabled), 5, 0), true);
      edtClienteObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteObservaciones_Enabled), 5, 0), true);
      edtClienteFacRsocial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacRsocial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacRsocial_Enabled), 5, 0), true);
      edtClienteFacCedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacCedula_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacCedula_Enabled), 5, 0), true);
      edtClienteFacRut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacRut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacRut_Enabled), 5, 0), true);
      edtClienteFacDireccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacDireccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacDireccion_Enabled), 5, 0), true);
      edtClienteFacLocalidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacLocalidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacLocalidad_Enabled), 5, 0), true);
      edtClienteFacDepartamento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacDepartamento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacDepartamento_Enabled), 5, 0), true);
      edtClienteFacCpostal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacCpostal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacCpostal_Enabled), 5, 0), true);
      edtClienteFacGiro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacGiro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacGiro_Enabled), 5, 0), true);
      edtClienteCobNombreTelefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreTelefono1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreTelefono1_Enabled), 5, 0), true);
      edtClienteFacTelefonos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacTelefonos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacTelefonos_Enabled), 5, 0), true);
      edtClienteCobNombreTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreTelefono2_Enabled), 5, 0), true);
      edtClienteCobTelefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobTelefono2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobTelefono2_Enabled), 5, 0), true);
      edtClienteCobNombreCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreCelular1_Enabled), 5, 0), true);
      edtClienteCobCelular1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobCelular1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobCelular1_Enabled), 5, 0), true);
      edtClienteCobNombreCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreCelular2_Enabled), 5, 0), true);
      edtClienteCobCelular2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobCelular2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobCelular2_Enabled), 5, 0), true);
      edtClienteCobNombreEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreEmail1_Enabled), 5, 0), true);
      edtClienteCobEmail1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobEmail1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobEmail1_Enabled), 5, 0), true);
      edtClienteCobNombreEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobNombreEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobNombreEmail2_Enabled), 5, 0), true);
      edtClienteCobEmail2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteCobEmail2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteCobEmail2_Enabled), 5, 0), true);
      edtClienteFacFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacFax_Enabled), 5, 0), true);
      edtClienteFacEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacEmail_Enabled), 5, 0), true);
      edtClienteFacContrato_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacContrato_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacContrato_Enabled), 5, 0), true);
      edtClienteFacObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacObservaciones_Enabled), 5, 0), true);
      edtClienteFacLista_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacLista_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacLista_Enabled), 5, 0), true);
      edtClienteFacContado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteFacContado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteFacContado_Enabled), 5, 0), true);
      edtClienteNotEmailFrascos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailFrascos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailFrascos1_Enabled), 5, 0), true);
      edtClienteNotEmailFrascos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailFrascos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailFrascos2_Enabled), 5, 0), true);
      edtClienteNotEmailMuestra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailMuestra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailMuestra1_Enabled), 5, 0), true);
      edtClienteNotEmailMuestra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailMuestra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailMuestra2_Enabled), 5, 0), true);
      edtClienteNotEmailAnalisis1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailAnalisis1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailAnalisis1_Enabled), 5, 0), true);
      edtClienteNotEmailAnalisis2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailAnalisis2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailAnalisis2_Enabled), 5, 0), true);
      edtClienteNotEmailGeneral1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailGeneral1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailGeneral1_Enabled), 5, 0), true);
      edtClienteNotEmailGeneral2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteNotEmailGeneral2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteNotEmailGeneral2_Enabled), 5, 0), true);
      edtClienteIncobrable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClienteIncobrable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClienteIncobrable_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues040( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614572034", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.cliente", new String[] {}, new String[] {}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z4ClienteId", GXutil.ltrim( localUtil.ntoc( Z4ClienteId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z45ClienteNombre", Z45ClienteNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z46ClienteEmail", Z46ClienteEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z47ClienteNombreEmail1", Z47ClienteNombreEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z48ClienteEmail1", Z48ClienteEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z49ClienteNombreEmail2", Z49ClienteNombreEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z50ClienteEmail2", Z50ClienteEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z51ClienteEnvio", Z51ClienteEnvio);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z52ClienteUsuarioWeb", Z52ClienteUsuarioWeb);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z53ClienteNombreCelular1", Z53ClienteNombreCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z54ClienteCelular1", Z54ClienteCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z55ClienteNombreCelular2", Z55ClienteNombreCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z56ClienteCelular2", Z56ClienteCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z57ClienteCodigoFigaro", Z57ClienteCodigoFigaro);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z58ClienteTipoUsuario", GXutil.ltrim( localUtil.ntoc( Z58ClienteTipoUsuario, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z59ClienteDireccion", Z59ClienteDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z60ClienteNombreTelefono1", Z60ClienteNombreTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z61ClienteTelefono1", Z61ClienteTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z62ClienteNombreTelefono2", Z62ClienteNombreTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z63ClienteTelefono2", Z63ClienteTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z64ClienteFax", Z64ClienteFax);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z65ClienteDicose", Z65ClienteDicose);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z66ClienteIdDepartamento", GXutil.ltrim( localUtil.ntoc( Z66ClienteIdDepartamento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z67ClienteIdLocalidad", GXutil.ltrim( localUtil.ntoc( Z67ClienteIdLocalidad, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z68ClienteTecnico1", GXutil.ltrim( localUtil.ntoc( Z68ClienteTecnico1, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z69ClienteTecnico2", GXutil.ltrim( localUtil.ntoc( Z69ClienteTecnico2, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z70ClienteIdAgencia", GXutil.ltrim( localUtil.ntoc( Z70ClienteIdAgencia, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z71ClienteContrato", GXutil.ltrim( localUtil.ntoc( Z71ClienteContrato, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z72ClienteSocio", GXutil.ltrim( localUtil.ntoc( Z72ClienteSocio, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z73ClienteNoUsar", GXutil.ltrim( localUtil.ntoc( Z73ClienteNoUsar, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z74ClienteCodbar", GXutil.ltrim( localUtil.ntoc( Z74ClienteCodbar, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z75ClienteCaravanas", GXutil.ltrim( localUtil.ntoc( Z75ClienteCaravanas, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z76ClienteProlesa", GXutil.ltrim( localUtil.ntoc( Z76ClienteProlesa, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z77ClienteProlesaSuc", GXutil.ltrim( localUtil.ntoc( Z77ClienteProlesaSuc, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z168ClienteProlesaMat", GXutil.ltrim( localUtil.ntoc( Z168ClienteProlesaMat, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z78ClienteObservaciones", Z78ClienteObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z79ClienteFacRsocial", Z79ClienteFacRsocial);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z80ClienteFacCedula", Z80ClienteFacCedula);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z81ClienteFacRut", Z81ClienteFacRut);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z82ClienteFacDireccion", Z82ClienteFacDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z83ClienteFacLocalidad", Z83ClienteFacLocalidad);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z84ClienteFacDepartamento", GXutil.ltrim( localUtil.ntoc( Z84ClienteFacDepartamento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z85ClienteFacCpostal", Z85ClienteFacCpostal);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z86ClienteFacGiro", GXutil.ltrim( localUtil.ntoc( Z86ClienteFacGiro, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z87ClienteCobNombreTelefono1", Z87ClienteCobNombreTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z88ClienteFacTelefonos", Z88ClienteFacTelefonos);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z89ClienteCobNombreTelefono2", Z89ClienteCobNombreTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z90ClienteCobTelefono2", Z90ClienteCobTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z91ClienteCobNombreCelular1", Z91ClienteCobNombreCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z92ClienteCobCelular1", Z92ClienteCobCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z93ClienteCobNombreCelular2", Z93ClienteCobNombreCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z94ClienteCobCelular2", Z94ClienteCobCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z95ClienteCobNombreEmail1", Z95ClienteCobNombreEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z96ClienteCobEmail1", Z96ClienteCobEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z97ClienteCobNombreEmail2", Z97ClienteCobNombreEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z98ClienteCobEmail2", Z98ClienteCobEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z99ClienteFacFax", Z99ClienteFacFax);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z100ClienteFacEmail", Z100ClienteFacEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z101ClienteFacContrato", Z101ClienteFacContrato);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z102ClienteFacObservaciones", Z102ClienteFacObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z103ClienteFacLista", GXutil.ltrim( localUtil.ntoc( Z103ClienteFacLista, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z104ClienteFacContado", GXutil.ltrim( localUtil.ntoc( Z104ClienteFacContado, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z105ClienteNotEmailFrascos1", Z105ClienteNotEmailFrascos1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z106ClienteNotEmailFrascos2", Z106ClienteNotEmailFrascos2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z107ClienteNotEmailMuestra1", Z107ClienteNotEmailMuestra1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z108ClienteNotEmailMuestra2", Z108ClienteNotEmailMuestra2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z109ClienteNotEmailAnalisis1", Z109ClienteNotEmailAnalisis1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z110ClienteNotEmailAnalisis2", Z110ClienteNotEmailAnalisis2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z111ClienteNotEmailGeneral1", Z111ClienteNotEmailGeneral1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z112ClienteNotEmailGeneral2", Z112ClienteNotEmailGeneral2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z113ClienteIncobrable", GXutil.ltrim( localUtil.ntoc( Z113ClienteIncobrable, (byte)(4), (byte)(0), ".", "")));
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
      return formatLink("com.colaveco.cliente", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Cliente" ;
   }

   public String getPgmdesc( )
   {
      return "Cliente" ;
   }

   public void initializeNonKey044( )
   {
      A45ClienteNombre = "" ;
      n45ClienteNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A45ClienteNombre", A45ClienteNombre);
      n45ClienteNombre = ((GXutil.strcmp("", A45ClienteNombre)==0) ? true : false) ;
      A46ClienteEmail = "" ;
      n46ClienteEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A46ClienteEmail", A46ClienteEmail);
      n46ClienteEmail = ((GXutil.strcmp("", A46ClienteEmail)==0) ? true : false) ;
      A47ClienteNombreEmail1 = "" ;
      n47ClienteNombreEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A47ClienteNombreEmail1", A47ClienteNombreEmail1);
      n47ClienteNombreEmail1 = ((GXutil.strcmp("", A47ClienteNombreEmail1)==0) ? true : false) ;
      A48ClienteEmail1 = "" ;
      n48ClienteEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A48ClienteEmail1", A48ClienteEmail1);
      n48ClienteEmail1 = ((GXutil.strcmp("", A48ClienteEmail1)==0) ? true : false) ;
      A49ClienteNombreEmail2 = "" ;
      n49ClienteNombreEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A49ClienteNombreEmail2", A49ClienteNombreEmail2);
      n49ClienteNombreEmail2 = ((GXutil.strcmp("", A49ClienteNombreEmail2)==0) ? true : false) ;
      A50ClienteEmail2 = "" ;
      n50ClienteEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50ClienteEmail2", A50ClienteEmail2);
      n50ClienteEmail2 = ((GXutil.strcmp("", A50ClienteEmail2)==0) ? true : false) ;
      A51ClienteEnvio = "" ;
      n51ClienteEnvio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A51ClienteEnvio", A51ClienteEnvio);
      n51ClienteEnvio = ((GXutil.strcmp("", A51ClienteEnvio)==0) ? true : false) ;
      A52ClienteUsuarioWeb = "" ;
      n52ClienteUsuarioWeb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A52ClienteUsuarioWeb", A52ClienteUsuarioWeb);
      n52ClienteUsuarioWeb = ((GXutil.strcmp("", A52ClienteUsuarioWeb)==0) ? true : false) ;
      A53ClienteNombreCelular1 = "" ;
      n53ClienteNombreCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A53ClienteNombreCelular1", A53ClienteNombreCelular1);
      n53ClienteNombreCelular1 = ((GXutil.strcmp("", A53ClienteNombreCelular1)==0) ? true : false) ;
      A54ClienteCelular1 = "" ;
      n54ClienteCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A54ClienteCelular1", A54ClienteCelular1);
      n54ClienteCelular1 = ((GXutil.strcmp("", A54ClienteCelular1)==0) ? true : false) ;
      A55ClienteNombreCelular2 = "" ;
      n55ClienteNombreCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A55ClienteNombreCelular2", A55ClienteNombreCelular2);
      n55ClienteNombreCelular2 = ((GXutil.strcmp("", A55ClienteNombreCelular2)==0) ? true : false) ;
      A56ClienteCelular2 = "" ;
      n56ClienteCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A56ClienteCelular2", A56ClienteCelular2);
      n56ClienteCelular2 = ((GXutil.strcmp("", A56ClienteCelular2)==0) ? true : false) ;
      A57ClienteCodigoFigaro = "" ;
      n57ClienteCodigoFigaro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A57ClienteCodigoFigaro", A57ClienteCodigoFigaro);
      n57ClienteCodigoFigaro = ((GXutil.strcmp("", A57ClienteCodigoFigaro)==0) ? true : false) ;
      A58ClienteTipoUsuario = (short)(0) ;
      n58ClienteTipoUsuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A58ClienteTipoUsuario), 4, 0));
      n58ClienteTipoUsuario = ((0==A58ClienteTipoUsuario) ? true : false) ;
      A59ClienteDireccion = "" ;
      n59ClienteDireccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A59ClienteDireccion", A59ClienteDireccion);
      n59ClienteDireccion = ((GXutil.strcmp("", A59ClienteDireccion)==0) ? true : false) ;
      A60ClienteNombreTelefono1 = "" ;
      n60ClienteNombreTelefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A60ClienteNombreTelefono1", A60ClienteNombreTelefono1);
      n60ClienteNombreTelefono1 = ((GXutil.strcmp("", A60ClienteNombreTelefono1)==0) ? true : false) ;
      A61ClienteTelefono1 = "" ;
      n61ClienteTelefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A61ClienteTelefono1", A61ClienteTelefono1);
      n61ClienteTelefono1 = ((GXutil.strcmp("", A61ClienteTelefono1)==0) ? true : false) ;
      A62ClienteNombreTelefono2 = "" ;
      n62ClienteNombreTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A62ClienteNombreTelefono2", A62ClienteNombreTelefono2);
      n62ClienteNombreTelefono2 = ((GXutil.strcmp("", A62ClienteNombreTelefono2)==0) ? true : false) ;
      A63ClienteTelefono2 = "" ;
      n63ClienteTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A63ClienteTelefono2", A63ClienteTelefono2);
      n63ClienteTelefono2 = ((GXutil.strcmp("", A63ClienteTelefono2)==0) ? true : false) ;
      A64ClienteFax = "" ;
      n64ClienteFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A64ClienteFax", A64ClienteFax);
      n64ClienteFax = ((GXutil.strcmp("", A64ClienteFax)==0) ? true : false) ;
      A65ClienteDicose = "" ;
      n65ClienteDicose = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ClienteDicose", A65ClienteDicose);
      n65ClienteDicose = ((GXutil.strcmp("", A65ClienteDicose)==0) ? true : false) ;
      A66ClienteIdDepartamento = 0 ;
      n66ClienteIdDepartamento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A66ClienteIdDepartamento), 18, 0));
      n66ClienteIdDepartamento = ((0==A66ClienteIdDepartamento) ? true : false) ;
      A67ClienteIdLocalidad = 0 ;
      n67ClienteIdLocalidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ClienteIdLocalidad), 18, 0));
      n67ClienteIdLocalidad = ((0==A67ClienteIdLocalidad) ? true : false) ;
      A68ClienteTecnico1 = 0 ;
      n68ClienteTecnico1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ClienteTecnico1), 18, 0));
      n68ClienteTecnico1 = ((0==A68ClienteTecnico1) ? true : false) ;
      A69ClienteTecnico2 = 0 ;
      n69ClienteTecnico2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A69ClienteTecnico2), 18, 0));
      n69ClienteTecnico2 = ((0==A69ClienteTecnico2) ? true : false) ;
      A70ClienteIdAgencia = 0 ;
      n70ClienteIdAgencia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A70ClienteIdAgencia), 18, 0));
      n70ClienteIdAgencia = ((0==A70ClienteIdAgencia) ? true : false) ;
      A71ClienteContrato = (short)(0) ;
      n71ClienteContrato = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrimstr( DecimalUtil.doubleToDec(A71ClienteContrato), 4, 0));
      n71ClienteContrato = ((0==A71ClienteContrato) ? true : false) ;
      A72ClienteSocio = (short)(0) ;
      n72ClienteSocio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A72ClienteSocio), 4, 0));
      n72ClienteSocio = ((0==A72ClienteSocio) ? true : false) ;
      A73ClienteNoUsar = (short)(0) ;
      n73ClienteNoUsar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A73ClienteNoUsar), 4, 0));
      n73ClienteNoUsar = ((0==A73ClienteNoUsar) ? true : false) ;
      A74ClienteCodbar = (short)(0) ;
      n74ClienteCodbar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A74ClienteCodbar), 4, 0));
      n74ClienteCodbar = ((0==A74ClienteCodbar) ? true : false) ;
      A75ClienteCaravanas = (short)(0) ;
      n75ClienteCaravanas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A75ClienteCaravanas), 4, 0));
      n75ClienteCaravanas = ((0==A75ClienteCaravanas) ? true : false) ;
      A76ClienteProlesa = (short)(0) ;
      n76ClienteProlesa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A76ClienteProlesa), 4, 0));
      n76ClienteProlesa = ((0==A76ClienteProlesa) ? true : false) ;
      A77ClienteProlesaSuc = 0 ;
      n77ClienteProlesaSuc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A77ClienteProlesaSuc), 18, 0));
      n77ClienteProlesaSuc = ((0==A77ClienteProlesaSuc) ? true : false) ;
      A168ClienteProlesaMat = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A168ClienteProlesaMat), 18, 0));
      A78ClienteObservaciones = "" ;
      n78ClienteObservaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78ClienteObservaciones", A78ClienteObservaciones);
      n78ClienteObservaciones = ((GXutil.strcmp("", A78ClienteObservaciones)==0) ? true : false) ;
      A79ClienteFacRsocial = "" ;
      n79ClienteFacRsocial = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79ClienteFacRsocial", A79ClienteFacRsocial);
      n79ClienteFacRsocial = ((GXutil.strcmp("", A79ClienteFacRsocial)==0) ? true : false) ;
      A80ClienteFacCedula = "" ;
      n80ClienteFacCedula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80ClienteFacCedula", A80ClienteFacCedula);
      n80ClienteFacCedula = ((GXutil.strcmp("", A80ClienteFacCedula)==0) ? true : false) ;
      A81ClienteFacRut = "" ;
      n81ClienteFacRut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81ClienteFacRut", A81ClienteFacRut);
      n81ClienteFacRut = ((GXutil.strcmp("", A81ClienteFacRut)==0) ? true : false) ;
      A82ClienteFacDireccion = "" ;
      n82ClienteFacDireccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82ClienteFacDireccion", A82ClienteFacDireccion);
      n82ClienteFacDireccion = ((GXutil.strcmp("", A82ClienteFacDireccion)==0) ? true : false) ;
      A83ClienteFacLocalidad = "" ;
      n83ClienteFacLocalidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83ClienteFacLocalidad", A83ClienteFacLocalidad);
      n83ClienteFacLocalidad = ((GXutil.strcmp("", A83ClienteFacLocalidad)==0) ? true : false) ;
      A84ClienteFacDepartamento = 0 ;
      n84ClienteFacDepartamento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrimstr( DecimalUtil.doubleToDec(A84ClienteFacDepartamento), 18, 0));
      n84ClienteFacDepartamento = ((0==A84ClienteFacDepartamento) ? true : false) ;
      A85ClienteFacCpostal = "" ;
      n85ClienteFacCpostal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A85ClienteFacCpostal", A85ClienteFacCpostal);
      n85ClienteFacCpostal = ((GXutil.strcmp("", A85ClienteFacCpostal)==0) ? true : false) ;
      A86ClienteFacGiro = 0 ;
      n86ClienteFacGiro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A86ClienteFacGiro), 18, 0));
      n86ClienteFacGiro = ((0==A86ClienteFacGiro) ? true : false) ;
      A87ClienteCobNombreTelefono1 = "" ;
      n87ClienteCobNombreTelefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A87ClienteCobNombreTelefono1", A87ClienteCobNombreTelefono1);
      n87ClienteCobNombreTelefono1 = ((GXutil.strcmp("", A87ClienteCobNombreTelefono1)==0) ? true : false) ;
      A88ClienteFacTelefonos = "" ;
      n88ClienteFacTelefonos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A88ClienteFacTelefonos", A88ClienteFacTelefonos);
      n88ClienteFacTelefonos = ((GXutil.strcmp("", A88ClienteFacTelefonos)==0) ? true : false) ;
      A89ClienteCobNombreTelefono2 = "" ;
      n89ClienteCobNombreTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A89ClienteCobNombreTelefono2", A89ClienteCobNombreTelefono2);
      n89ClienteCobNombreTelefono2 = ((GXutil.strcmp("", A89ClienteCobNombreTelefono2)==0) ? true : false) ;
      A90ClienteCobTelefono2 = "" ;
      n90ClienteCobTelefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A90ClienteCobTelefono2", A90ClienteCobTelefono2);
      n90ClienteCobTelefono2 = ((GXutil.strcmp("", A90ClienteCobTelefono2)==0) ? true : false) ;
      A91ClienteCobNombreCelular1 = "" ;
      n91ClienteCobNombreCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A91ClienteCobNombreCelular1", A91ClienteCobNombreCelular1);
      n91ClienteCobNombreCelular1 = ((GXutil.strcmp("", A91ClienteCobNombreCelular1)==0) ? true : false) ;
      A92ClienteCobCelular1 = "" ;
      n92ClienteCobCelular1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92ClienteCobCelular1", A92ClienteCobCelular1);
      n92ClienteCobCelular1 = ((GXutil.strcmp("", A92ClienteCobCelular1)==0) ? true : false) ;
      A93ClienteCobNombreCelular2 = "" ;
      n93ClienteCobNombreCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93ClienteCobNombreCelular2", A93ClienteCobNombreCelular2);
      n93ClienteCobNombreCelular2 = ((GXutil.strcmp("", A93ClienteCobNombreCelular2)==0) ? true : false) ;
      A94ClienteCobCelular2 = "" ;
      n94ClienteCobCelular2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94ClienteCobCelular2", A94ClienteCobCelular2);
      n94ClienteCobCelular2 = ((GXutil.strcmp("", A94ClienteCobCelular2)==0) ? true : false) ;
      A95ClienteCobNombreEmail1 = "" ;
      n95ClienteCobNombreEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95ClienteCobNombreEmail1", A95ClienteCobNombreEmail1);
      n95ClienteCobNombreEmail1 = ((GXutil.strcmp("", A95ClienteCobNombreEmail1)==0) ? true : false) ;
      A96ClienteCobEmail1 = "" ;
      n96ClienteCobEmail1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96ClienteCobEmail1", A96ClienteCobEmail1);
      n96ClienteCobEmail1 = ((GXutil.strcmp("", A96ClienteCobEmail1)==0) ? true : false) ;
      A97ClienteCobNombreEmail2 = "" ;
      n97ClienteCobNombreEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97ClienteCobNombreEmail2", A97ClienteCobNombreEmail2);
      n97ClienteCobNombreEmail2 = ((GXutil.strcmp("", A97ClienteCobNombreEmail2)==0) ? true : false) ;
      A98ClienteCobEmail2 = "" ;
      n98ClienteCobEmail2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A98ClienteCobEmail2", A98ClienteCobEmail2);
      n98ClienteCobEmail2 = ((GXutil.strcmp("", A98ClienteCobEmail2)==0) ? true : false) ;
      A99ClienteFacFax = "" ;
      n99ClienteFacFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99ClienteFacFax", A99ClienteFacFax);
      n99ClienteFacFax = ((GXutil.strcmp("", A99ClienteFacFax)==0) ? true : false) ;
      A100ClienteFacEmail = "" ;
      n100ClienteFacEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A100ClienteFacEmail", A100ClienteFacEmail);
      n100ClienteFacEmail = ((GXutil.strcmp("", A100ClienteFacEmail)==0) ? true : false) ;
      A101ClienteFacContrato = "" ;
      n101ClienteFacContrato = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A101ClienteFacContrato", A101ClienteFacContrato);
      n101ClienteFacContrato = ((GXutil.strcmp("", A101ClienteFacContrato)==0) ? true : false) ;
      A102ClienteFacObservaciones = "" ;
      n102ClienteFacObservaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A102ClienteFacObservaciones", A102ClienteFacObservaciones);
      n102ClienteFacObservaciones = ((GXutil.strcmp("", A102ClienteFacObservaciones)==0) ? true : false) ;
      A103ClienteFacLista = 0 ;
      n103ClienteFacLista = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ClienteFacLista), 18, 0));
      n103ClienteFacLista = ((0==A103ClienteFacLista) ? true : false) ;
      A104ClienteFacContado = (short)(0) ;
      n104ClienteFacContado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ClienteFacContado), 4, 0));
      n104ClienteFacContado = ((0==A104ClienteFacContado) ? true : false) ;
      A105ClienteNotEmailFrascos1 = "" ;
      n105ClienteNotEmailFrascos1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A105ClienteNotEmailFrascos1", A105ClienteNotEmailFrascos1);
      n105ClienteNotEmailFrascos1 = ((GXutil.strcmp("", A105ClienteNotEmailFrascos1)==0) ? true : false) ;
      A106ClienteNotEmailFrascos2 = "" ;
      n106ClienteNotEmailFrascos2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A106ClienteNotEmailFrascos2", A106ClienteNotEmailFrascos2);
      n106ClienteNotEmailFrascos2 = ((GXutil.strcmp("", A106ClienteNotEmailFrascos2)==0) ? true : false) ;
      A107ClienteNotEmailMuestra1 = "" ;
      n107ClienteNotEmailMuestra1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A107ClienteNotEmailMuestra1", A107ClienteNotEmailMuestra1);
      n107ClienteNotEmailMuestra1 = ((GXutil.strcmp("", A107ClienteNotEmailMuestra1)==0) ? true : false) ;
      A108ClienteNotEmailMuestra2 = "" ;
      n108ClienteNotEmailMuestra2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A108ClienteNotEmailMuestra2", A108ClienteNotEmailMuestra2);
      n108ClienteNotEmailMuestra2 = ((GXutil.strcmp("", A108ClienteNotEmailMuestra2)==0) ? true : false) ;
      A109ClienteNotEmailAnalisis1 = "" ;
      n109ClienteNotEmailAnalisis1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A109ClienteNotEmailAnalisis1", A109ClienteNotEmailAnalisis1);
      n109ClienteNotEmailAnalisis1 = ((GXutil.strcmp("", A109ClienteNotEmailAnalisis1)==0) ? true : false) ;
      A110ClienteNotEmailAnalisis2 = "" ;
      n110ClienteNotEmailAnalisis2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A110ClienteNotEmailAnalisis2", A110ClienteNotEmailAnalisis2);
      n110ClienteNotEmailAnalisis2 = ((GXutil.strcmp("", A110ClienteNotEmailAnalisis2)==0) ? true : false) ;
      A111ClienteNotEmailGeneral1 = "" ;
      n111ClienteNotEmailGeneral1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111ClienteNotEmailGeneral1", A111ClienteNotEmailGeneral1);
      n111ClienteNotEmailGeneral1 = ((GXutil.strcmp("", A111ClienteNotEmailGeneral1)==0) ? true : false) ;
      A112ClienteNotEmailGeneral2 = "" ;
      n112ClienteNotEmailGeneral2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112ClienteNotEmailGeneral2", A112ClienteNotEmailGeneral2);
      n112ClienteNotEmailGeneral2 = ((GXutil.strcmp("", A112ClienteNotEmailGeneral2)==0) ? true : false) ;
      A113ClienteIncobrable = (short)(0) ;
      n113ClienteIncobrable = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrimstr( DecimalUtil.doubleToDec(A113ClienteIncobrable), 4, 0));
      n113ClienteIncobrable = ((0==A113ClienteIncobrable) ? true : false) ;
      Z45ClienteNombre = "" ;
      Z46ClienteEmail = "" ;
      Z47ClienteNombreEmail1 = "" ;
      Z48ClienteEmail1 = "" ;
      Z49ClienteNombreEmail2 = "" ;
      Z50ClienteEmail2 = "" ;
      Z51ClienteEnvio = "" ;
      Z52ClienteUsuarioWeb = "" ;
      Z53ClienteNombreCelular1 = "" ;
      Z54ClienteCelular1 = "" ;
      Z55ClienteNombreCelular2 = "" ;
      Z56ClienteCelular2 = "" ;
      Z57ClienteCodigoFigaro = "" ;
      Z58ClienteTipoUsuario = (short)(0) ;
      Z59ClienteDireccion = "" ;
      Z60ClienteNombreTelefono1 = "" ;
      Z61ClienteTelefono1 = "" ;
      Z62ClienteNombreTelefono2 = "" ;
      Z63ClienteTelefono2 = "" ;
      Z64ClienteFax = "" ;
      Z65ClienteDicose = "" ;
      Z66ClienteIdDepartamento = 0 ;
      Z67ClienteIdLocalidad = 0 ;
      Z68ClienteTecnico1 = 0 ;
      Z69ClienteTecnico2 = 0 ;
      Z70ClienteIdAgencia = 0 ;
      Z71ClienteContrato = (short)(0) ;
      Z72ClienteSocio = (short)(0) ;
      Z73ClienteNoUsar = (short)(0) ;
      Z74ClienteCodbar = (short)(0) ;
      Z75ClienteCaravanas = (short)(0) ;
      Z76ClienteProlesa = (short)(0) ;
      Z77ClienteProlesaSuc = 0 ;
      Z168ClienteProlesaMat = 0 ;
      Z78ClienteObservaciones = "" ;
      Z79ClienteFacRsocial = "" ;
      Z80ClienteFacCedula = "" ;
      Z81ClienteFacRut = "" ;
      Z82ClienteFacDireccion = "" ;
      Z83ClienteFacLocalidad = "" ;
      Z84ClienteFacDepartamento = 0 ;
      Z85ClienteFacCpostal = "" ;
      Z86ClienteFacGiro = 0 ;
      Z87ClienteCobNombreTelefono1 = "" ;
      Z88ClienteFacTelefonos = "" ;
      Z89ClienteCobNombreTelefono2 = "" ;
      Z90ClienteCobTelefono2 = "" ;
      Z91ClienteCobNombreCelular1 = "" ;
      Z92ClienteCobCelular1 = "" ;
      Z93ClienteCobNombreCelular2 = "" ;
      Z94ClienteCobCelular2 = "" ;
      Z95ClienteCobNombreEmail1 = "" ;
      Z96ClienteCobEmail1 = "" ;
      Z97ClienteCobNombreEmail2 = "" ;
      Z98ClienteCobEmail2 = "" ;
      Z99ClienteFacFax = "" ;
      Z100ClienteFacEmail = "" ;
      Z101ClienteFacContrato = "" ;
      Z102ClienteFacObservaciones = "" ;
      Z103ClienteFacLista = 0 ;
      Z104ClienteFacContado = (short)(0) ;
      Z105ClienteNotEmailFrascos1 = "" ;
      Z106ClienteNotEmailFrascos2 = "" ;
      Z107ClienteNotEmailMuestra1 = "" ;
      Z108ClienteNotEmailMuestra2 = "" ;
      Z109ClienteNotEmailAnalisis1 = "" ;
      Z110ClienteNotEmailAnalisis2 = "" ;
      Z111ClienteNotEmailGeneral1 = "" ;
      Z112ClienteNotEmailGeneral2 = "" ;
      Z113ClienteIncobrable = (short)(0) ;
   }

   public void initAll044( )
   {
      A4ClienteId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4ClienteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4ClienteId), 18, 0));
      initializeNonKey044( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20231261457222", true, true);
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
      httpContext.AddJavascriptSource("cliente.js", "?20231261457225", false, true);
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
      edtClienteId_Internalname = "CLIENTEID" ;
      edtClienteNombre_Internalname = "CLIENTENOMBRE" ;
      edtClienteEmail_Internalname = "CLIENTEEMAIL" ;
      edtClienteNombreEmail1_Internalname = "CLIENTENOMBREEMAIL1" ;
      edtClienteEmail1_Internalname = "CLIENTEEMAIL1" ;
      edtClienteNombreEmail2_Internalname = "CLIENTENOMBREEMAIL2" ;
      edtClienteEmail2_Internalname = "CLIENTEEMAIL2" ;
      edtClienteEnvio_Internalname = "CLIENTEENVIO" ;
      edtClienteUsuarioWeb_Internalname = "CLIENTEUSUARIOWEB" ;
      edtClienteNombreCelular1_Internalname = "CLIENTENOMBRECELULAR1" ;
      edtClienteCelular1_Internalname = "CLIENTECELULAR1" ;
      edtClienteNombreCelular2_Internalname = "CLIENTENOMBRECELULAR2" ;
      edtClienteCelular2_Internalname = "CLIENTECELULAR2" ;
      edtClienteCodigoFigaro_Internalname = "CLIENTECODIGOFIGARO" ;
      edtClienteTipoUsuario_Internalname = "CLIENTETIPOUSUARIO" ;
      edtClienteDireccion_Internalname = "CLIENTEDIRECCION" ;
      edtClienteNombreTelefono1_Internalname = "CLIENTENOMBRETELEFONO1" ;
      edtClienteTelefono1_Internalname = "CLIENTETELEFONO1" ;
      edtClienteNombreTelefono2_Internalname = "CLIENTENOMBRETELEFONO2" ;
      edtClienteTelefono2_Internalname = "CLIENTETELEFONO2" ;
      edtClienteFax_Internalname = "CLIENTEFAX" ;
      edtClienteDicose_Internalname = "CLIENTEDICOSE" ;
      edtClienteIdDepartamento_Internalname = "CLIENTEIDDEPARTAMENTO" ;
      edtClienteIdLocalidad_Internalname = "CLIENTEIDLOCALIDAD" ;
      edtClienteTecnico1_Internalname = "CLIENTETECNICO1" ;
      edtClienteTecnico2_Internalname = "CLIENTETECNICO2" ;
      edtClienteIdAgencia_Internalname = "CLIENTEIDAGENCIA" ;
      edtClienteContrato_Internalname = "CLIENTECONTRATO" ;
      edtClienteSocio_Internalname = "CLIENTESOCIO" ;
      edtClienteNoUsar_Internalname = "CLIENTENOUSAR" ;
      edtClienteCodbar_Internalname = "CLIENTECODBAR" ;
      edtClienteCaravanas_Internalname = "CLIENTECARAVANAS" ;
      edtClienteProlesa_Internalname = "CLIENTEPROLESA" ;
      edtClienteProlesaSuc_Internalname = "CLIENTEPROLESASUC" ;
      edtClienteProlesaMat_Internalname = "CLIENTEPROLESAMAT" ;
      edtClienteObservaciones_Internalname = "CLIENTEOBSERVACIONES" ;
      edtClienteFacRsocial_Internalname = "CLIENTEFACRSOCIAL" ;
      edtClienteFacCedula_Internalname = "CLIENTEFACCEDULA" ;
      edtClienteFacRut_Internalname = "CLIENTEFACRUT" ;
      edtClienteFacDireccion_Internalname = "CLIENTEFACDIRECCION" ;
      edtClienteFacLocalidad_Internalname = "CLIENTEFACLOCALIDAD" ;
      edtClienteFacDepartamento_Internalname = "CLIENTEFACDEPARTAMENTO" ;
      edtClienteFacCpostal_Internalname = "CLIENTEFACCPOSTAL" ;
      edtClienteFacGiro_Internalname = "CLIENTEFACGIRO" ;
      edtClienteCobNombreTelefono1_Internalname = "CLIENTECOBNOMBRETELEFONO1" ;
      edtClienteFacTelefonos_Internalname = "CLIENTEFACTELEFONOS" ;
      edtClienteCobNombreTelefono2_Internalname = "CLIENTECOBNOMBRETELEFONO2" ;
      edtClienteCobTelefono2_Internalname = "CLIENTECOBTELEFONO2" ;
      edtClienteCobNombreCelular1_Internalname = "CLIENTECOBNOMBRECELULAR1" ;
      edtClienteCobCelular1_Internalname = "CLIENTECOBCELULAR1" ;
      edtClienteCobNombreCelular2_Internalname = "CLIENTECOBNOMBRECELULAR2" ;
      edtClienteCobCelular2_Internalname = "CLIENTECOBCELULAR2" ;
      edtClienteCobNombreEmail1_Internalname = "CLIENTECOBNOMBREEMAIL1" ;
      edtClienteCobEmail1_Internalname = "CLIENTECOBEMAIL1" ;
      edtClienteCobNombreEmail2_Internalname = "CLIENTECOBNOMBREEMAIL2" ;
      edtClienteCobEmail2_Internalname = "CLIENTECOBEMAIL2" ;
      edtClienteFacFax_Internalname = "CLIENTEFACFAX" ;
      edtClienteFacEmail_Internalname = "CLIENTEFACEMAIL" ;
      edtClienteFacContrato_Internalname = "CLIENTEFACCONTRATO" ;
      edtClienteFacObservaciones_Internalname = "CLIENTEFACOBSERVACIONES" ;
      edtClienteFacLista_Internalname = "CLIENTEFACLISTA" ;
      edtClienteFacContado_Internalname = "CLIENTEFACCONTADO" ;
      edtClienteNotEmailFrascos1_Internalname = "CLIENTENOTEMAILFRASCOS1" ;
      edtClienteNotEmailFrascos2_Internalname = "CLIENTENOTEMAILFRASCOS2" ;
      edtClienteNotEmailMuestra1_Internalname = "CLIENTENOTEMAILMUESTRA1" ;
      edtClienteNotEmailMuestra2_Internalname = "CLIENTENOTEMAILMUESTRA2" ;
      edtClienteNotEmailAnalisis1_Internalname = "CLIENTENOTEMAILANALISIS1" ;
      edtClienteNotEmailAnalisis2_Internalname = "CLIENTENOTEMAILANALISIS2" ;
      edtClienteNotEmailGeneral1_Internalname = "CLIENTENOTEMAILGENERAL1" ;
      edtClienteNotEmailGeneral2_Internalname = "CLIENTENOTEMAILGENERAL2" ;
      edtClienteIncobrable_Internalname = "CLIENTEINCOBRABLE" ;
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
      Form.setCaption( "Cliente" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtClienteIncobrable_Jsonclick = "" ;
      edtClienteIncobrable_Enabled = 1 ;
      edtClienteNotEmailGeneral2_Jsonclick = "" ;
      edtClienteNotEmailGeneral2_Enabled = 1 ;
      edtClienteNotEmailGeneral1_Jsonclick = "" ;
      edtClienteNotEmailGeneral1_Enabled = 1 ;
      edtClienteNotEmailAnalisis2_Jsonclick = "" ;
      edtClienteNotEmailAnalisis2_Enabled = 1 ;
      edtClienteNotEmailAnalisis1_Jsonclick = "" ;
      edtClienteNotEmailAnalisis1_Enabled = 1 ;
      edtClienteNotEmailMuestra2_Jsonclick = "" ;
      edtClienteNotEmailMuestra2_Enabled = 1 ;
      edtClienteNotEmailMuestra1_Jsonclick = "" ;
      edtClienteNotEmailMuestra1_Enabled = 1 ;
      edtClienteNotEmailFrascos2_Jsonclick = "" ;
      edtClienteNotEmailFrascos2_Enabled = 1 ;
      edtClienteNotEmailFrascos1_Jsonclick = "" ;
      edtClienteNotEmailFrascos1_Enabled = 1 ;
      edtClienteFacContado_Jsonclick = "" ;
      edtClienteFacContado_Enabled = 1 ;
      edtClienteFacLista_Jsonclick = "" ;
      edtClienteFacLista_Enabled = 1 ;
      edtClienteFacObservaciones_Enabled = 1 ;
      edtClienteFacContrato_Jsonclick = "" ;
      edtClienteFacContrato_Enabled = 1 ;
      edtClienteFacEmail_Jsonclick = "" ;
      edtClienteFacEmail_Enabled = 1 ;
      edtClienteFacFax_Jsonclick = "" ;
      edtClienteFacFax_Enabled = 1 ;
      edtClienteCobEmail2_Jsonclick = "" ;
      edtClienteCobEmail2_Enabled = 1 ;
      edtClienteCobNombreEmail2_Jsonclick = "" ;
      edtClienteCobNombreEmail2_Enabled = 1 ;
      edtClienteCobEmail1_Jsonclick = "" ;
      edtClienteCobEmail1_Enabled = 1 ;
      edtClienteCobNombreEmail1_Jsonclick = "" ;
      edtClienteCobNombreEmail1_Enabled = 1 ;
      edtClienteCobCelular2_Jsonclick = "" ;
      edtClienteCobCelular2_Enabled = 1 ;
      edtClienteCobNombreCelular2_Jsonclick = "" ;
      edtClienteCobNombreCelular2_Enabled = 1 ;
      edtClienteCobCelular1_Jsonclick = "" ;
      edtClienteCobCelular1_Enabled = 1 ;
      edtClienteCobNombreCelular1_Jsonclick = "" ;
      edtClienteCobNombreCelular1_Enabled = 1 ;
      edtClienteCobTelefono2_Jsonclick = "" ;
      edtClienteCobTelefono2_Enabled = 1 ;
      edtClienteCobNombreTelefono2_Jsonclick = "" ;
      edtClienteCobNombreTelefono2_Enabled = 1 ;
      edtClienteFacTelefonos_Jsonclick = "" ;
      edtClienteFacTelefonos_Enabled = 1 ;
      edtClienteCobNombreTelefono1_Jsonclick = "" ;
      edtClienteCobNombreTelefono1_Enabled = 1 ;
      edtClienteFacGiro_Jsonclick = "" ;
      edtClienteFacGiro_Enabled = 1 ;
      edtClienteFacCpostal_Jsonclick = "" ;
      edtClienteFacCpostal_Enabled = 1 ;
      edtClienteFacDepartamento_Jsonclick = "" ;
      edtClienteFacDepartamento_Enabled = 1 ;
      edtClienteFacLocalidad_Jsonclick = "" ;
      edtClienteFacLocalidad_Enabled = 1 ;
      edtClienteFacDireccion_Enabled = 1 ;
      edtClienteFacRut_Jsonclick = "" ;
      edtClienteFacRut_Enabled = 1 ;
      edtClienteFacCedula_Jsonclick = "" ;
      edtClienteFacCedula_Enabled = 1 ;
      edtClienteFacRsocial_Jsonclick = "" ;
      edtClienteFacRsocial_Enabled = 1 ;
      edtClienteObservaciones_Enabled = 1 ;
      edtClienteProlesaMat_Jsonclick = "" ;
      edtClienteProlesaMat_Enabled = 1 ;
      edtClienteProlesaSuc_Jsonclick = "" ;
      edtClienteProlesaSuc_Enabled = 1 ;
      edtClienteProlesa_Jsonclick = "" ;
      edtClienteProlesa_Enabled = 1 ;
      edtClienteCaravanas_Jsonclick = "" ;
      edtClienteCaravanas_Enabled = 1 ;
      edtClienteCodbar_Jsonclick = "" ;
      edtClienteCodbar_Enabled = 1 ;
      edtClienteNoUsar_Jsonclick = "" ;
      edtClienteNoUsar_Enabled = 1 ;
      edtClienteSocio_Jsonclick = "" ;
      edtClienteSocio_Enabled = 1 ;
      edtClienteContrato_Jsonclick = "" ;
      edtClienteContrato_Enabled = 1 ;
      edtClienteIdAgencia_Jsonclick = "" ;
      edtClienteIdAgencia_Enabled = 1 ;
      edtClienteTecnico2_Jsonclick = "" ;
      edtClienteTecnico2_Enabled = 1 ;
      edtClienteTecnico1_Jsonclick = "" ;
      edtClienteTecnico1_Enabled = 1 ;
      edtClienteIdLocalidad_Jsonclick = "" ;
      edtClienteIdLocalidad_Enabled = 1 ;
      edtClienteIdDepartamento_Jsonclick = "" ;
      edtClienteIdDepartamento_Enabled = 1 ;
      edtClienteDicose_Jsonclick = "" ;
      edtClienteDicose_Enabled = 1 ;
      edtClienteFax_Jsonclick = "" ;
      edtClienteFax_Enabled = 1 ;
      edtClienteTelefono2_Jsonclick = "" ;
      edtClienteTelefono2_Enabled = 1 ;
      edtClienteNombreTelefono2_Jsonclick = "" ;
      edtClienteNombreTelefono2_Enabled = 1 ;
      edtClienteTelefono1_Jsonclick = "" ;
      edtClienteTelefono1_Enabled = 1 ;
      edtClienteNombreTelefono1_Jsonclick = "" ;
      edtClienteNombreTelefono1_Enabled = 1 ;
      edtClienteDireccion_Enabled = 1 ;
      edtClienteTipoUsuario_Jsonclick = "" ;
      edtClienteTipoUsuario_Enabled = 1 ;
      edtClienteCodigoFigaro_Jsonclick = "" ;
      edtClienteCodigoFigaro_Enabled = 1 ;
      edtClienteCelular2_Jsonclick = "" ;
      edtClienteCelular2_Enabled = 1 ;
      edtClienteNombreCelular2_Jsonclick = "" ;
      edtClienteNombreCelular2_Enabled = 1 ;
      edtClienteCelular1_Jsonclick = "" ;
      edtClienteCelular1_Enabled = 1 ;
      edtClienteNombreCelular1_Jsonclick = "" ;
      edtClienteNombreCelular1_Enabled = 1 ;
      edtClienteUsuarioWeb_Jsonclick = "" ;
      edtClienteUsuarioWeb_Enabled = 1 ;
      edtClienteEnvio_Enabled = 1 ;
      edtClienteEmail2_Jsonclick = "" ;
      edtClienteEmail2_Enabled = 1 ;
      edtClienteNombreEmail2_Jsonclick = "" ;
      edtClienteNombreEmail2_Enabled = 1 ;
      edtClienteEmail1_Jsonclick = "" ;
      edtClienteEmail1_Enabled = 1 ;
      edtClienteNombreEmail1_Jsonclick = "" ;
      edtClienteNombreEmail1_Enabled = 1 ;
      edtClienteEmail_Jsonclick = "" ;
      edtClienteEmail_Enabled = 1 ;
      edtClienteNombre_Jsonclick = "" ;
      edtClienteNombre_Enabled = 1 ;
      edtClienteId_Jsonclick = "" ;
      edtClienteId_Enabled = 1 ;
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
      GX_FocusControl = edtClienteNombre_Internalname ;
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

   public void valid_Clienteid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A45ClienteNombre", A45ClienteNombre);
      httpContext.ajax_rsp_assign_attri("", false, "A46ClienteEmail", A46ClienteEmail);
      httpContext.ajax_rsp_assign_attri("", false, "A47ClienteNombreEmail1", A47ClienteNombreEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A48ClienteEmail1", A48ClienteEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A49ClienteNombreEmail2", A49ClienteNombreEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A50ClienteEmail2", A50ClienteEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A51ClienteEnvio", A51ClienteEnvio);
      httpContext.ajax_rsp_assign_attri("", false, "A52ClienteUsuarioWeb", A52ClienteUsuarioWeb);
      httpContext.ajax_rsp_assign_attri("", false, "A53ClienteNombreCelular1", A53ClienteNombreCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A54ClienteCelular1", A54ClienteCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A55ClienteNombreCelular2", A55ClienteNombreCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A56ClienteCelular2", A56ClienteCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A57ClienteCodigoFigaro", A57ClienteCodigoFigaro);
      httpContext.ajax_rsp_assign_attri("", false, "A58ClienteTipoUsuario", GXutil.ltrim( localUtil.ntoc( A58ClienteTipoUsuario, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59ClienteDireccion", A59ClienteDireccion);
      httpContext.ajax_rsp_assign_attri("", false, "A60ClienteNombreTelefono1", A60ClienteNombreTelefono1);
      httpContext.ajax_rsp_assign_attri("", false, "A61ClienteTelefono1", A61ClienteTelefono1);
      httpContext.ajax_rsp_assign_attri("", false, "A62ClienteNombreTelefono2", A62ClienteNombreTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A63ClienteTelefono2", A63ClienteTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A64ClienteFax", A64ClienteFax);
      httpContext.ajax_rsp_assign_attri("", false, "A65ClienteDicose", A65ClienteDicose);
      httpContext.ajax_rsp_assign_attri("", false, "A66ClienteIdDepartamento", GXutil.ltrim( localUtil.ntoc( A66ClienteIdDepartamento, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A67ClienteIdLocalidad", GXutil.ltrim( localUtil.ntoc( A67ClienteIdLocalidad, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A68ClienteTecnico1", GXutil.ltrim( localUtil.ntoc( A68ClienteTecnico1, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A69ClienteTecnico2", GXutil.ltrim( localUtil.ntoc( A69ClienteTecnico2, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A70ClienteIdAgencia", GXutil.ltrim( localUtil.ntoc( A70ClienteIdAgencia, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A71ClienteContrato", GXutil.ltrim( localUtil.ntoc( A71ClienteContrato, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A72ClienteSocio", GXutil.ltrim( localUtil.ntoc( A72ClienteSocio, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A73ClienteNoUsar", GXutil.ltrim( localUtil.ntoc( A73ClienteNoUsar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A74ClienteCodbar", GXutil.ltrim( localUtil.ntoc( A74ClienteCodbar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A75ClienteCaravanas", GXutil.ltrim( localUtil.ntoc( A75ClienteCaravanas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A76ClienteProlesa", GXutil.ltrim( localUtil.ntoc( A76ClienteProlesa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A77ClienteProlesaSuc", GXutil.ltrim( localUtil.ntoc( A77ClienteProlesaSuc, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A168ClienteProlesaMat", GXutil.ltrim( localUtil.ntoc( A168ClienteProlesaMat, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A78ClienteObservaciones", A78ClienteObservaciones);
      httpContext.ajax_rsp_assign_attri("", false, "A79ClienteFacRsocial", A79ClienteFacRsocial);
      httpContext.ajax_rsp_assign_attri("", false, "A80ClienteFacCedula", A80ClienteFacCedula);
      httpContext.ajax_rsp_assign_attri("", false, "A81ClienteFacRut", A81ClienteFacRut);
      httpContext.ajax_rsp_assign_attri("", false, "A82ClienteFacDireccion", A82ClienteFacDireccion);
      httpContext.ajax_rsp_assign_attri("", false, "A83ClienteFacLocalidad", A83ClienteFacLocalidad);
      httpContext.ajax_rsp_assign_attri("", false, "A84ClienteFacDepartamento", GXutil.ltrim( localUtil.ntoc( A84ClienteFacDepartamento, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A85ClienteFacCpostal", A85ClienteFacCpostal);
      httpContext.ajax_rsp_assign_attri("", false, "A86ClienteFacGiro", GXutil.ltrim( localUtil.ntoc( A86ClienteFacGiro, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A87ClienteCobNombreTelefono1", A87ClienteCobNombreTelefono1);
      httpContext.ajax_rsp_assign_attri("", false, "A88ClienteFacTelefonos", A88ClienteFacTelefonos);
      httpContext.ajax_rsp_assign_attri("", false, "A89ClienteCobNombreTelefono2", A89ClienteCobNombreTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A90ClienteCobTelefono2", A90ClienteCobTelefono2);
      httpContext.ajax_rsp_assign_attri("", false, "A91ClienteCobNombreCelular1", A91ClienteCobNombreCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A92ClienteCobCelular1", A92ClienteCobCelular1);
      httpContext.ajax_rsp_assign_attri("", false, "A93ClienteCobNombreCelular2", A93ClienteCobNombreCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A94ClienteCobCelular2", A94ClienteCobCelular2);
      httpContext.ajax_rsp_assign_attri("", false, "A95ClienteCobNombreEmail1", A95ClienteCobNombreEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A96ClienteCobEmail1", A96ClienteCobEmail1);
      httpContext.ajax_rsp_assign_attri("", false, "A97ClienteCobNombreEmail2", A97ClienteCobNombreEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A98ClienteCobEmail2", A98ClienteCobEmail2);
      httpContext.ajax_rsp_assign_attri("", false, "A99ClienteFacFax", A99ClienteFacFax);
      httpContext.ajax_rsp_assign_attri("", false, "A100ClienteFacEmail", A100ClienteFacEmail);
      httpContext.ajax_rsp_assign_attri("", false, "A101ClienteFacContrato", A101ClienteFacContrato);
      httpContext.ajax_rsp_assign_attri("", false, "A102ClienteFacObservaciones", A102ClienteFacObservaciones);
      httpContext.ajax_rsp_assign_attri("", false, "A103ClienteFacLista", GXutil.ltrim( localUtil.ntoc( A103ClienteFacLista, (byte)(18), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A104ClienteFacContado", GXutil.ltrim( localUtil.ntoc( A104ClienteFacContado, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A105ClienteNotEmailFrascos1", A105ClienteNotEmailFrascos1);
      httpContext.ajax_rsp_assign_attri("", false, "A106ClienteNotEmailFrascos2", A106ClienteNotEmailFrascos2);
      httpContext.ajax_rsp_assign_attri("", false, "A107ClienteNotEmailMuestra1", A107ClienteNotEmailMuestra1);
      httpContext.ajax_rsp_assign_attri("", false, "A108ClienteNotEmailMuestra2", A108ClienteNotEmailMuestra2);
      httpContext.ajax_rsp_assign_attri("", false, "A109ClienteNotEmailAnalisis1", A109ClienteNotEmailAnalisis1);
      httpContext.ajax_rsp_assign_attri("", false, "A110ClienteNotEmailAnalisis2", A110ClienteNotEmailAnalisis2);
      httpContext.ajax_rsp_assign_attri("", false, "A111ClienteNotEmailGeneral1", A111ClienteNotEmailGeneral1);
      httpContext.ajax_rsp_assign_attri("", false, "A112ClienteNotEmailGeneral2", A112ClienteNotEmailGeneral2);
      httpContext.ajax_rsp_assign_attri("", false, "A113ClienteIncobrable", GXutil.ltrim( localUtil.ntoc( A113ClienteIncobrable, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z4ClienteId", GXutil.ltrim( localUtil.ntoc( Z4ClienteId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z45ClienteNombre", Z45ClienteNombre);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z46ClienteEmail", Z46ClienteEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z47ClienteNombreEmail1", Z47ClienteNombreEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z48ClienteEmail1", Z48ClienteEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z49ClienteNombreEmail2", Z49ClienteNombreEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z50ClienteEmail2", Z50ClienteEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z51ClienteEnvio", Z51ClienteEnvio);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z52ClienteUsuarioWeb", Z52ClienteUsuarioWeb);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z53ClienteNombreCelular1", Z53ClienteNombreCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z54ClienteCelular1", Z54ClienteCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z55ClienteNombreCelular2", Z55ClienteNombreCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z56ClienteCelular2", Z56ClienteCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z57ClienteCodigoFigaro", Z57ClienteCodigoFigaro);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z58ClienteTipoUsuario", GXutil.ltrim( localUtil.ntoc( Z58ClienteTipoUsuario, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z59ClienteDireccion", Z59ClienteDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z60ClienteNombreTelefono1", Z60ClienteNombreTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z61ClienteTelefono1", Z61ClienteTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z62ClienteNombreTelefono2", Z62ClienteNombreTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z63ClienteTelefono2", Z63ClienteTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z64ClienteFax", Z64ClienteFax);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z65ClienteDicose", Z65ClienteDicose);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z66ClienteIdDepartamento", GXutil.ltrim( localUtil.ntoc( Z66ClienteIdDepartamento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z67ClienteIdLocalidad", GXutil.ltrim( localUtil.ntoc( Z67ClienteIdLocalidad, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z68ClienteTecnico1", GXutil.ltrim( localUtil.ntoc( Z68ClienteTecnico1, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z69ClienteTecnico2", GXutil.ltrim( localUtil.ntoc( Z69ClienteTecnico2, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z70ClienteIdAgencia", GXutil.ltrim( localUtil.ntoc( Z70ClienteIdAgencia, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z71ClienteContrato", GXutil.ltrim( localUtil.ntoc( Z71ClienteContrato, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z72ClienteSocio", GXutil.ltrim( localUtil.ntoc( Z72ClienteSocio, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z73ClienteNoUsar", GXutil.ltrim( localUtil.ntoc( Z73ClienteNoUsar, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z74ClienteCodbar", GXutil.ltrim( localUtil.ntoc( Z74ClienteCodbar, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z75ClienteCaravanas", GXutil.ltrim( localUtil.ntoc( Z75ClienteCaravanas, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z76ClienteProlesa", GXutil.ltrim( localUtil.ntoc( Z76ClienteProlesa, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z77ClienteProlesaSuc", GXutil.ltrim( localUtil.ntoc( Z77ClienteProlesaSuc, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z168ClienteProlesaMat", GXutil.ltrim( localUtil.ntoc( Z168ClienteProlesaMat, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z78ClienteObservaciones", Z78ClienteObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z79ClienteFacRsocial", Z79ClienteFacRsocial);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z80ClienteFacCedula", Z80ClienteFacCedula);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z81ClienteFacRut", Z81ClienteFacRut);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z82ClienteFacDireccion", Z82ClienteFacDireccion);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z83ClienteFacLocalidad", Z83ClienteFacLocalidad);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z84ClienteFacDepartamento", GXutil.ltrim( localUtil.ntoc( Z84ClienteFacDepartamento, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z85ClienteFacCpostal", Z85ClienteFacCpostal);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z86ClienteFacGiro", GXutil.ltrim( localUtil.ntoc( Z86ClienteFacGiro, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z87ClienteCobNombreTelefono1", Z87ClienteCobNombreTelefono1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z88ClienteFacTelefonos", Z88ClienteFacTelefonos);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z89ClienteCobNombreTelefono2", Z89ClienteCobNombreTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z90ClienteCobTelefono2", Z90ClienteCobTelefono2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z91ClienteCobNombreCelular1", Z91ClienteCobNombreCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z92ClienteCobCelular1", Z92ClienteCobCelular1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z93ClienteCobNombreCelular2", Z93ClienteCobNombreCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z94ClienteCobCelular2", Z94ClienteCobCelular2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z95ClienteCobNombreEmail1", Z95ClienteCobNombreEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z96ClienteCobEmail1", Z96ClienteCobEmail1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z97ClienteCobNombreEmail2", Z97ClienteCobNombreEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z98ClienteCobEmail2", Z98ClienteCobEmail2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z99ClienteFacFax", Z99ClienteFacFax);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z100ClienteFacEmail", Z100ClienteFacEmail);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z101ClienteFacContrato", Z101ClienteFacContrato);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z102ClienteFacObservaciones", Z102ClienteFacObservaciones);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z103ClienteFacLista", GXutil.ltrim( localUtil.ntoc( Z103ClienteFacLista, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z104ClienteFacContado", GXutil.ltrim( localUtil.ntoc( Z104ClienteFacContado, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z105ClienteNotEmailFrascos1", Z105ClienteNotEmailFrascos1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z106ClienteNotEmailFrascos2", Z106ClienteNotEmailFrascos2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z107ClienteNotEmailMuestra1", Z107ClienteNotEmailMuestra1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z108ClienteNotEmailMuestra2", Z108ClienteNotEmailMuestra2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z109ClienteNotEmailAnalisis1", Z109ClienteNotEmailAnalisis1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z110ClienteNotEmailAnalisis2", Z110ClienteNotEmailAnalisis2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z111ClienteNotEmailGeneral1", Z111ClienteNotEmailGeneral1);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z112ClienteNotEmailGeneral2", Z112ClienteNotEmailGeneral2);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z113ClienteIncobrable", GXutil.ltrim( localUtil.ntoc( Z113ClienteIncobrable, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_CLIENTEID","{handler:'valid_Clienteid',iparms:[{av:'A4ClienteId',fld:'CLIENTEID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLIENTEID",",oparms:[{av:'A45ClienteNombre',fld:'CLIENTENOMBRE',pic:''},{av:'A46ClienteEmail',fld:'CLIENTEEMAIL',pic:''},{av:'A47ClienteNombreEmail1',fld:'CLIENTENOMBREEMAIL1',pic:''},{av:'A48ClienteEmail1',fld:'CLIENTEEMAIL1',pic:''},{av:'A49ClienteNombreEmail2',fld:'CLIENTENOMBREEMAIL2',pic:''},{av:'A50ClienteEmail2',fld:'CLIENTEEMAIL2',pic:''},{av:'A51ClienteEnvio',fld:'CLIENTEENVIO',pic:''},{av:'A52ClienteUsuarioWeb',fld:'CLIENTEUSUARIOWEB',pic:''},{av:'A53ClienteNombreCelular1',fld:'CLIENTENOMBRECELULAR1',pic:''},{av:'A54ClienteCelular1',fld:'CLIENTECELULAR1',pic:''},{av:'A55ClienteNombreCelular2',fld:'CLIENTENOMBRECELULAR2',pic:''},{av:'A56ClienteCelular2',fld:'CLIENTECELULAR2',pic:''},{av:'A57ClienteCodigoFigaro',fld:'CLIENTECODIGOFIGARO',pic:''},{av:'A58ClienteTipoUsuario',fld:'CLIENTETIPOUSUARIO',pic:'ZZZ9'},{av:'A59ClienteDireccion',fld:'CLIENTEDIRECCION',pic:''},{av:'A60ClienteNombreTelefono1',fld:'CLIENTENOMBRETELEFONO1',pic:''},{av:'A61ClienteTelefono1',fld:'CLIENTETELEFONO1',pic:''},{av:'A62ClienteNombreTelefono2',fld:'CLIENTENOMBRETELEFONO2',pic:''},{av:'A63ClienteTelefono2',fld:'CLIENTETELEFONO2',pic:''},{av:'A64ClienteFax',fld:'CLIENTEFAX',pic:''},{av:'A65ClienteDicose',fld:'CLIENTEDICOSE',pic:''},{av:'A66ClienteIdDepartamento',fld:'CLIENTEIDDEPARTAMENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A67ClienteIdLocalidad',fld:'CLIENTEIDLOCALIDAD',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A68ClienteTecnico1',fld:'CLIENTETECNICO1',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A69ClienteTecnico2',fld:'CLIENTETECNICO2',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A70ClienteIdAgencia',fld:'CLIENTEIDAGENCIA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A71ClienteContrato',fld:'CLIENTECONTRATO',pic:'ZZZ9'},{av:'A72ClienteSocio',fld:'CLIENTESOCIO',pic:'ZZZ9'},{av:'A73ClienteNoUsar',fld:'CLIENTENOUSAR',pic:'ZZZ9'},{av:'A74ClienteCodbar',fld:'CLIENTECODBAR',pic:'ZZZ9'},{av:'A75ClienteCaravanas',fld:'CLIENTECARAVANAS',pic:'ZZZ9'},{av:'A76ClienteProlesa',fld:'CLIENTEPROLESA',pic:'ZZZ9'},{av:'A77ClienteProlesaSuc',fld:'CLIENTEPROLESASUC',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A168ClienteProlesaMat',fld:'CLIENTEPROLESAMAT',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A78ClienteObservaciones',fld:'CLIENTEOBSERVACIONES',pic:''},{av:'A79ClienteFacRsocial',fld:'CLIENTEFACRSOCIAL',pic:''},{av:'A80ClienteFacCedula',fld:'CLIENTEFACCEDULA',pic:''},{av:'A81ClienteFacRut',fld:'CLIENTEFACRUT',pic:''},{av:'A82ClienteFacDireccion',fld:'CLIENTEFACDIRECCION',pic:''},{av:'A83ClienteFacLocalidad',fld:'CLIENTEFACLOCALIDAD',pic:''},{av:'A84ClienteFacDepartamento',fld:'CLIENTEFACDEPARTAMENTO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A85ClienteFacCpostal',fld:'CLIENTEFACCPOSTAL',pic:''},{av:'A86ClienteFacGiro',fld:'CLIENTEFACGIRO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A87ClienteCobNombreTelefono1',fld:'CLIENTECOBNOMBRETELEFONO1',pic:''},{av:'A88ClienteFacTelefonos',fld:'CLIENTEFACTELEFONOS',pic:''},{av:'A89ClienteCobNombreTelefono2',fld:'CLIENTECOBNOMBRETELEFONO2',pic:''},{av:'A90ClienteCobTelefono2',fld:'CLIENTECOBTELEFONO2',pic:''},{av:'A91ClienteCobNombreCelular1',fld:'CLIENTECOBNOMBRECELULAR1',pic:''},{av:'A92ClienteCobCelular1',fld:'CLIENTECOBCELULAR1',pic:''},{av:'A93ClienteCobNombreCelular2',fld:'CLIENTECOBNOMBRECELULAR2',pic:''},{av:'A94ClienteCobCelular2',fld:'CLIENTECOBCELULAR2',pic:''},{av:'A95ClienteCobNombreEmail1',fld:'CLIENTECOBNOMBREEMAIL1',pic:''},{av:'A96ClienteCobEmail1',fld:'CLIENTECOBEMAIL1',pic:''},{av:'A97ClienteCobNombreEmail2',fld:'CLIENTECOBNOMBREEMAIL2',pic:''},{av:'A98ClienteCobEmail2',fld:'CLIENTECOBEMAIL2',pic:''},{av:'A99ClienteFacFax',fld:'CLIENTEFACFAX',pic:''},{av:'A100ClienteFacEmail',fld:'CLIENTEFACEMAIL',pic:''},{av:'A101ClienteFacContrato',fld:'CLIENTEFACCONTRATO',pic:''},{av:'A102ClienteFacObservaciones',fld:'CLIENTEFACOBSERVACIONES',pic:''},{av:'A103ClienteFacLista',fld:'CLIENTEFACLISTA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A104ClienteFacContado',fld:'CLIENTEFACCONTADO',pic:'ZZZ9'},{av:'A105ClienteNotEmailFrascos1',fld:'CLIENTENOTEMAILFRASCOS1',pic:''},{av:'A106ClienteNotEmailFrascos2',fld:'CLIENTENOTEMAILFRASCOS2',pic:''},{av:'A107ClienteNotEmailMuestra1',fld:'CLIENTENOTEMAILMUESTRA1',pic:''},{av:'A108ClienteNotEmailMuestra2',fld:'CLIENTENOTEMAILMUESTRA2',pic:''},{av:'A109ClienteNotEmailAnalisis1',fld:'CLIENTENOTEMAILANALISIS1',pic:''},{av:'A110ClienteNotEmailAnalisis2',fld:'CLIENTENOTEMAILANALISIS2',pic:''},{av:'A111ClienteNotEmailGeneral1',fld:'CLIENTENOTEMAILGENERAL1',pic:''},{av:'A112ClienteNotEmailGeneral2',fld:'CLIENTENOTEMAILGENERAL2',pic:''},{av:'A113ClienteIncobrable',fld:'CLIENTEINCOBRABLE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z4ClienteId'},{av:'Z45ClienteNombre'},{av:'Z46ClienteEmail'},{av:'Z47ClienteNombreEmail1'},{av:'Z48ClienteEmail1'},{av:'Z49ClienteNombreEmail2'},{av:'Z50ClienteEmail2'},{av:'Z51ClienteEnvio'},{av:'Z52ClienteUsuarioWeb'},{av:'Z53ClienteNombreCelular1'},{av:'Z54ClienteCelular1'},{av:'Z55ClienteNombreCelular2'},{av:'Z56ClienteCelular2'},{av:'Z57ClienteCodigoFigaro'},{av:'Z58ClienteTipoUsuario'},{av:'Z59ClienteDireccion'},{av:'Z60ClienteNombreTelefono1'},{av:'Z61ClienteTelefono1'},{av:'Z62ClienteNombreTelefono2'},{av:'Z63ClienteTelefono2'},{av:'Z64ClienteFax'},{av:'Z65ClienteDicose'},{av:'Z66ClienteIdDepartamento'},{av:'Z67ClienteIdLocalidad'},{av:'Z68ClienteTecnico1'},{av:'Z69ClienteTecnico2'},{av:'Z70ClienteIdAgencia'},{av:'Z71ClienteContrato'},{av:'Z72ClienteSocio'},{av:'Z73ClienteNoUsar'},{av:'Z74ClienteCodbar'},{av:'Z75ClienteCaravanas'},{av:'Z76ClienteProlesa'},{av:'Z77ClienteProlesaSuc'},{av:'Z168ClienteProlesaMat'},{av:'Z78ClienteObservaciones'},{av:'Z79ClienteFacRsocial'},{av:'Z80ClienteFacCedula'},{av:'Z81ClienteFacRut'},{av:'Z82ClienteFacDireccion'},{av:'Z83ClienteFacLocalidad'},{av:'Z84ClienteFacDepartamento'},{av:'Z85ClienteFacCpostal'},{av:'Z86ClienteFacGiro'},{av:'Z87ClienteCobNombreTelefono1'},{av:'Z88ClienteFacTelefonos'},{av:'Z89ClienteCobNombreTelefono2'},{av:'Z90ClienteCobTelefono2'},{av:'Z91ClienteCobNombreCelular1'},{av:'Z92ClienteCobCelular1'},{av:'Z93ClienteCobNombreCelular2'},{av:'Z94ClienteCobCelular2'},{av:'Z95ClienteCobNombreEmail1'},{av:'Z96ClienteCobEmail1'},{av:'Z97ClienteCobNombreEmail2'},{av:'Z98ClienteCobEmail2'},{av:'Z99ClienteFacFax'},{av:'Z100ClienteFacEmail'},{av:'Z101ClienteFacContrato'},{av:'Z102ClienteFacObservaciones'},{av:'Z103ClienteFacLista'},{av:'Z104ClienteFacContado'},{av:'Z105ClienteNotEmailFrascos1'},{av:'Z106ClienteNotEmailFrascos2'},{av:'Z107ClienteNotEmailMuestra1'},{av:'Z108ClienteNotEmailMuestra2'},{av:'Z109ClienteNotEmailAnalisis1'},{av:'Z110ClienteNotEmailAnalisis2'},{av:'Z111ClienteNotEmailGeneral1'},{av:'Z112ClienteNotEmailGeneral2'},{av:'Z113ClienteIncobrable'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z45ClienteNombre = "" ;
      Z46ClienteEmail = "" ;
      Z47ClienteNombreEmail1 = "" ;
      Z48ClienteEmail1 = "" ;
      Z49ClienteNombreEmail2 = "" ;
      Z50ClienteEmail2 = "" ;
      Z51ClienteEnvio = "" ;
      Z52ClienteUsuarioWeb = "" ;
      Z53ClienteNombreCelular1 = "" ;
      Z54ClienteCelular1 = "" ;
      Z55ClienteNombreCelular2 = "" ;
      Z56ClienteCelular2 = "" ;
      Z57ClienteCodigoFigaro = "" ;
      Z59ClienteDireccion = "" ;
      Z60ClienteNombreTelefono1 = "" ;
      Z61ClienteTelefono1 = "" ;
      Z62ClienteNombreTelefono2 = "" ;
      Z63ClienteTelefono2 = "" ;
      Z64ClienteFax = "" ;
      Z65ClienteDicose = "" ;
      Z78ClienteObservaciones = "" ;
      Z79ClienteFacRsocial = "" ;
      Z80ClienteFacCedula = "" ;
      Z81ClienteFacRut = "" ;
      Z82ClienteFacDireccion = "" ;
      Z83ClienteFacLocalidad = "" ;
      Z85ClienteFacCpostal = "" ;
      Z87ClienteCobNombreTelefono1 = "" ;
      Z88ClienteFacTelefonos = "" ;
      Z89ClienteCobNombreTelefono2 = "" ;
      Z90ClienteCobTelefono2 = "" ;
      Z91ClienteCobNombreCelular1 = "" ;
      Z92ClienteCobCelular1 = "" ;
      Z93ClienteCobNombreCelular2 = "" ;
      Z94ClienteCobCelular2 = "" ;
      Z95ClienteCobNombreEmail1 = "" ;
      Z96ClienteCobEmail1 = "" ;
      Z97ClienteCobNombreEmail2 = "" ;
      Z98ClienteCobEmail2 = "" ;
      Z99ClienteFacFax = "" ;
      Z100ClienteFacEmail = "" ;
      Z101ClienteFacContrato = "" ;
      Z102ClienteFacObservaciones = "" ;
      Z105ClienteNotEmailFrascos1 = "" ;
      Z106ClienteNotEmailFrascos2 = "" ;
      Z107ClienteNotEmailMuestra1 = "" ;
      Z108ClienteNotEmailMuestra2 = "" ;
      Z109ClienteNotEmailAnalisis1 = "" ;
      Z110ClienteNotEmailAnalisis2 = "" ;
      Z111ClienteNotEmailGeneral1 = "" ;
      Z112ClienteNotEmailGeneral2 = "" ;
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
      A45ClienteNombre = "" ;
      A46ClienteEmail = "" ;
      A47ClienteNombreEmail1 = "" ;
      A48ClienteEmail1 = "" ;
      A49ClienteNombreEmail2 = "" ;
      A50ClienteEmail2 = "" ;
      A51ClienteEnvio = "" ;
      A52ClienteUsuarioWeb = "" ;
      A53ClienteNombreCelular1 = "" ;
      A54ClienteCelular1 = "" ;
      A55ClienteNombreCelular2 = "" ;
      A56ClienteCelular2 = "" ;
      A57ClienteCodigoFigaro = "" ;
      A59ClienteDireccion = "" ;
      A60ClienteNombreTelefono1 = "" ;
      A61ClienteTelefono1 = "" ;
      A62ClienteNombreTelefono2 = "" ;
      A63ClienteTelefono2 = "" ;
      A64ClienteFax = "" ;
      A65ClienteDicose = "" ;
      A78ClienteObservaciones = "" ;
      A79ClienteFacRsocial = "" ;
      A80ClienteFacCedula = "" ;
      A81ClienteFacRut = "" ;
      A82ClienteFacDireccion = "" ;
      A83ClienteFacLocalidad = "" ;
      A85ClienteFacCpostal = "" ;
      A87ClienteCobNombreTelefono1 = "" ;
      A88ClienteFacTelefonos = "" ;
      A89ClienteCobNombreTelefono2 = "" ;
      A90ClienteCobTelefono2 = "" ;
      A91ClienteCobNombreCelular1 = "" ;
      A92ClienteCobCelular1 = "" ;
      A93ClienteCobNombreCelular2 = "" ;
      A94ClienteCobCelular2 = "" ;
      A95ClienteCobNombreEmail1 = "" ;
      A96ClienteCobEmail1 = "" ;
      A97ClienteCobNombreEmail2 = "" ;
      A98ClienteCobEmail2 = "" ;
      A99ClienteFacFax = "" ;
      A100ClienteFacEmail = "" ;
      A101ClienteFacContrato = "" ;
      A102ClienteFacObservaciones = "" ;
      A105ClienteNotEmailFrascos1 = "" ;
      A106ClienteNotEmailFrascos2 = "" ;
      A107ClienteNotEmailMuestra1 = "" ;
      A108ClienteNotEmailMuestra2 = "" ;
      A109ClienteNotEmailAnalisis1 = "" ;
      A110ClienteNotEmailAnalisis2 = "" ;
      A111ClienteNotEmailGeneral1 = "" ;
      A112ClienteNotEmailGeneral2 = "" ;
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
      T00044_A4ClienteId = new long[1] ;
      T00044_A45ClienteNombre = new String[] {""} ;
      T00044_n45ClienteNombre = new boolean[] {false} ;
      T00044_A46ClienteEmail = new String[] {""} ;
      T00044_n46ClienteEmail = new boolean[] {false} ;
      T00044_A47ClienteNombreEmail1 = new String[] {""} ;
      T00044_n47ClienteNombreEmail1 = new boolean[] {false} ;
      T00044_A48ClienteEmail1 = new String[] {""} ;
      T00044_n48ClienteEmail1 = new boolean[] {false} ;
      T00044_A49ClienteNombreEmail2 = new String[] {""} ;
      T00044_n49ClienteNombreEmail2 = new boolean[] {false} ;
      T00044_A50ClienteEmail2 = new String[] {""} ;
      T00044_n50ClienteEmail2 = new boolean[] {false} ;
      T00044_A51ClienteEnvio = new String[] {""} ;
      T00044_n51ClienteEnvio = new boolean[] {false} ;
      T00044_A52ClienteUsuarioWeb = new String[] {""} ;
      T00044_n52ClienteUsuarioWeb = new boolean[] {false} ;
      T00044_A53ClienteNombreCelular1 = new String[] {""} ;
      T00044_n53ClienteNombreCelular1 = new boolean[] {false} ;
      T00044_A54ClienteCelular1 = new String[] {""} ;
      T00044_n54ClienteCelular1 = new boolean[] {false} ;
      T00044_A55ClienteNombreCelular2 = new String[] {""} ;
      T00044_n55ClienteNombreCelular2 = new boolean[] {false} ;
      T00044_A56ClienteCelular2 = new String[] {""} ;
      T00044_n56ClienteCelular2 = new boolean[] {false} ;
      T00044_A57ClienteCodigoFigaro = new String[] {""} ;
      T00044_n57ClienteCodigoFigaro = new boolean[] {false} ;
      T00044_A58ClienteTipoUsuario = new short[1] ;
      T00044_n58ClienteTipoUsuario = new boolean[] {false} ;
      T00044_A59ClienteDireccion = new String[] {""} ;
      T00044_n59ClienteDireccion = new boolean[] {false} ;
      T00044_A60ClienteNombreTelefono1 = new String[] {""} ;
      T00044_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      T00044_A61ClienteTelefono1 = new String[] {""} ;
      T00044_n61ClienteTelefono1 = new boolean[] {false} ;
      T00044_A62ClienteNombreTelefono2 = new String[] {""} ;
      T00044_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      T00044_A63ClienteTelefono2 = new String[] {""} ;
      T00044_n63ClienteTelefono2 = new boolean[] {false} ;
      T00044_A64ClienteFax = new String[] {""} ;
      T00044_n64ClienteFax = new boolean[] {false} ;
      T00044_A65ClienteDicose = new String[] {""} ;
      T00044_n65ClienteDicose = new boolean[] {false} ;
      T00044_A66ClienteIdDepartamento = new long[1] ;
      T00044_n66ClienteIdDepartamento = new boolean[] {false} ;
      T00044_A67ClienteIdLocalidad = new long[1] ;
      T00044_n67ClienteIdLocalidad = new boolean[] {false} ;
      T00044_A68ClienteTecnico1 = new long[1] ;
      T00044_n68ClienteTecnico1 = new boolean[] {false} ;
      T00044_A69ClienteTecnico2 = new long[1] ;
      T00044_n69ClienteTecnico2 = new boolean[] {false} ;
      T00044_A70ClienteIdAgencia = new long[1] ;
      T00044_n70ClienteIdAgencia = new boolean[] {false} ;
      T00044_A71ClienteContrato = new short[1] ;
      T00044_n71ClienteContrato = new boolean[] {false} ;
      T00044_A72ClienteSocio = new short[1] ;
      T00044_n72ClienteSocio = new boolean[] {false} ;
      T00044_A73ClienteNoUsar = new short[1] ;
      T00044_n73ClienteNoUsar = new boolean[] {false} ;
      T00044_A74ClienteCodbar = new short[1] ;
      T00044_n74ClienteCodbar = new boolean[] {false} ;
      T00044_A75ClienteCaravanas = new short[1] ;
      T00044_n75ClienteCaravanas = new boolean[] {false} ;
      T00044_A76ClienteProlesa = new short[1] ;
      T00044_n76ClienteProlesa = new boolean[] {false} ;
      T00044_A77ClienteProlesaSuc = new long[1] ;
      T00044_n77ClienteProlesaSuc = new boolean[] {false} ;
      T00044_A168ClienteProlesaMat = new long[1] ;
      T00044_A78ClienteObservaciones = new String[] {""} ;
      T00044_n78ClienteObservaciones = new boolean[] {false} ;
      T00044_A79ClienteFacRsocial = new String[] {""} ;
      T00044_n79ClienteFacRsocial = new boolean[] {false} ;
      T00044_A80ClienteFacCedula = new String[] {""} ;
      T00044_n80ClienteFacCedula = new boolean[] {false} ;
      T00044_A81ClienteFacRut = new String[] {""} ;
      T00044_n81ClienteFacRut = new boolean[] {false} ;
      T00044_A82ClienteFacDireccion = new String[] {""} ;
      T00044_n82ClienteFacDireccion = new boolean[] {false} ;
      T00044_A83ClienteFacLocalidad = new String[] {""} ;
      T00044_n83ClienteFacLocalidad = new boolean[] {false} ;
      T00044_A84ClienteFacDepartamento = new long[1] ;
      T00044_n84ClienteFacDepartamento = new boolean[] {false} ;
      T00044_A85ClienteFacCpostal = new String[] {""} ;
      T00044_n85ClienteFacCpostal = new boolean[] {false} ;
      T00044_A86ClienteFacGiro = new long[1] ;
      T00044_n86ClienteFacGiro = new boolean[] {false} ;
      T00044_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      T00044_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      T00044_A88ClienteFacTelefonos = new String[] {""} ;
      T00044_n88ClienteFacTelefonos = new boolean[] {false} ;
      T00044_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      T00044_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      T00044_A90ClienteCobTelefono2 = new String[] {""} ;
      T00044_n90ClienteCobTelefono2 = new boolean[] {false} ;
      T00044_A91ClienteCobNombreCelular1 = new String[] {""} ;
      T00044_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      T00044_A92ClienteCobCelular1 = new String[] {""} ;
      T00044_n92ClienteCobCelular1 = new boolean[] {false} ;
      T00044_A93ClienteCobNombreCelular2 = new String[] {""} ;
      T00044_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      T00044_A94ClienteCobCelular2 = new String[] {""} ;
      T00044_n94ClienteCobCelular2 = new boolean[] {false} ;
      T00044_A95ClienteCobNombreEmail1 = new String[] {""} ;
      T00044_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      T00044_A96ClienteCobEmail1 = new String[] {""} ;
      T00044_n96ClienteCobEmail1 = new boolean[] {false} ;
      T00044_A97ClienteCobNombreEmail2 = new String[] {""} ;
      T00044_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      T00044_A98ClienteCobEmail2 = new String[] {""} ;
      T00044_n98ClienteCobEmail2 = new boolean[] {false} ;
      T00044_A99ClienteFacFax = new String[] {""} ;
      T00044_n99ClienteFacFax = new boolean[] {false} ;
      T00044_A100ClienteFacEmail = new String[] {""} ;
      T00044_n100ClienteFacEmail = new boolean[] {false} ;
      T00044_A101ClienteFacContrato = new String[] {""} ;
      T00044_n101ClienteFacContrato = new boolean[] {false} ;
      T00044_A102ClienteFacObservaciones = new String[] {""} ;
      T00044_n102ClienteFacObservaciones = new boolean[] {false} ;
      T00044_A103ClienteFacLista = new long[1] ;
      T00044_n103ClienteFacLista = new boolean[] {false} ;
      T00044_A104ClienteFacContado = new short[1] ;
      T00044_n104ClienteFacContado = new boolean[] {false} ;
      T00044_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      T00044_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      T00044_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      T00044_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      T00044_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      T00044_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      T00044_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      T00044_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      T00044_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      T00044_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      T00044_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      T00044_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      T00044_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      T00044_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      T00044_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      T00044_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      T00044_A113ClienteIncobrable = new short[1] ;
      T00044_n113ClienteIncobrable = new boolean[] {false} ;
      T00045_A4ClienteId = new long[1] ;
      T00043_A4ClienteId = new long[1] ;
      T00043_A45ClienteNombre = new String[] {""} ;
      T00043_n45ClienteNombre = new boolean[] {false} ;
      T00043_A46ClienteEmail = new String[] {""} ;
      T00043_n46ClienteEmail = new boolean[] {false} ;
      T00043_A47ClienteNombreEmail1 = new String[] {""} ;
      T00043_n47ClienteNombreEmail1 = new boolean[] {false} ;
      T00043_A48ClienteEmail1 = new String[] {""} ;
      T00043_n48ClienteEmail1 = new boolean[] {false} ;
      T00043_A49ClienteNombreEmail2 = new String[] {""} ;
      T00043_n49ClienteNombreEmail2 = new boolean[] {false} ;
      T00043_A50ClienteEmail2 = new String[] {""} ;
      T00043_n50ClienteEmail2 = new boolean[] {false} ;
      T00043_A51ClienteEnvio = new String[] {""} ;
      T00043_n51ClienteEnvio = new boolean[] {false} ;
      T00043_A52ClienteUsuarioWeb = new String[] {""} ;
      T00043_n52ClienteUsuarioWeb = new boolean[] {false} ;
      T00043_A53ClienteNombreCelular1 = new String[] {""} ;
      T00043_n53ClienteNombreCelular1 = new boolean[] {false} ;
      T00043_A54ClienteCelular1 = new String[] {""} ;
      T00043_n54ClienteCelular1 = new boolean[] {false} ;
      T00043_A55ClienteNombreCelular2 = new String[] {""} ;
      T00043_n55ClienteNombreCelular2 = new boolean[] {false} ;
      T00043_A56ClienteCelular2 = new String[] {""} ;
      T00043_n56ClienteCelular2 = new boolean[] {false} ;
      T00043_A57ClienteCodigoFigaro = new String[] {""} ;
      T00043_n57ClienteCodigoFigaro = new boolean[] {false} ;
      T00043_A58ClienteTipoUsuario = new short[1] ;
      T00043_n58ClienteTipoUsuario = new boolean[] {false} ;
      T00043_A59ClienteDireccion = new String[] {""} ;
      T00043_n59ClienteDireccion = new boolean[] {false} ;
      T00043_A60ClienteNombreTelefono1 = new String[] {""} ;
      T00043_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      T00043_A61ClienteTelefono1 = new String[] {""} ;
      T00043_n61ClienteTelefono1 = new boolean[] {false} ;
      T00043_A62ClienteNombreTelefono2 = new String[] {""} ;
      T00043_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      T00043_A63ClienteTelefono2 = new String[] {""} ;
      T00043_n63ClienteTelefono2 = new boolean[] {false} ;
      T00043_A64ClienteFax = new String[] {""} ;
      T00043_n64ClienteFax = new boolean[] {false} ;
      T00043_A65ClienteDicose = new String[] {""} ;
      T00043_n65ClienteDicose = new boolean[] {false} ;
      T00043_A66ClienteIdDepartamento = new long[1] ;
      T00043_n66ClienteIdDepartamento = new boolean[] {false} ;
      T00043_A67ClienteIdLocalidad = new long[1] ;
      T00043_n67ClienteIdLocalidad = new boolean[] {false} ;
      T00043_A68ClienteTecnico1 = new long[1] ;
      T00043_n68ClienteTecnico1 = new boolean[] {false} ;
      T00043_A69ClienteTecnico2 = new long[1] ;
      T00043_n69ClienteTecnico2 = new boolean[] {false} ;
      T00043_A70ClienteIdAgencia = new long[1] ;
      T00043_n70ClienteIdAgencia = new boolean[] {false} ;
      T00043_A71ClienteContrato = new short[1] ;
      T00043_n71ClienteContrato = new boolean[] {false} ;
      T00043_A72ClienteSocio = new short[1] ;
      T00043_n72ClienteSocio = new boolean[] {false} ;
      T00043_A73ClienteNoUsar = new short[1] ;
      T00043_n73ClienteNoUsar = new boolean[] {false} ;
      T00043_A74ClienteCodbar = new short[1] ;
      T00043_n74ClienteCodbar = new boolean[] {false} ;
      T00043_A75ClienteCaravanas = new short[1] ;
      T00043_n75ClienteCaravanas = new boolean[] {false} ;
      T00043_A76ClienteProlesa = new short[1] ;
      T00043_n76ClienteProlesa = new boolean[] {false} ;
      T00043_A77ClienteProlesaSuc = new long[1] ;
      T00043_n77ClienteProlesaSuc = new boolean[] {false} ;
      T00043_A168ClienteProlesaMat = new long[1] ;
      T00043_A78ClienteObservaciones = new String[] {""} ;
      T00043_n78ClienteObservaciones = new boolean[] {false} ;
      T00043_A79ClienteFacRsocial = new String[] {""} ;
      T00043_n79ClienteFacRsocial = new boolean[] {false} ;
      T00043_A80ClienteFacCedula = new String[] {""} ;
      T00043_n80ClienteFacCedula = new boolean[] {false} ;
      T00043_A81ClienteFacRut = new String[] {""} ;
      T00043_n81ClienteFacRut = new boolean[] {false} ;
      T00043_A82ClienteFacDireccion = new String[] {""} ;
      T00043_n82ClienteFacDireccion = new boolean[] {false} ;
      T00043_A83ClienteFacLocalidad = new String[] {""} ;
      T00043_n83ClienteFacLocalidad = new boolean[] {false} ;
      T00043_A84ClienteFacDepartamento = new long[1] ;
      T00043_n84ClienteFacDepartamento = new boolean[] {false} ;
      T00043_A85ClienteFacCpostal = new String[] {""} ;
      T00043_n85ClienteFacCpostal = new boolean[] {false} ;
      T00043_A86ClienteFacGiro = new long[1] ;
      T00043_n86ClienteFacGiro = new boolean[] {false} ;
      T00043_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      T00043_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      T00043_A88ClienteFacTelefonos = new String[] {""} ;
      T00043_n88ClienteFacTelefonos = new boolean[] {false} ;
      T00043_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      T00043_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      T00043_A90ClienteCobTelefono2 = new String[] {""} ;
      T00043_n90ClienteCobTelefono2 = new boolean[] {false} ;
      T00043_A91ClienteCobNombreCelular1 = new String[] {""} ;
      T00043_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      T00043_A92ClienteCobCelular1 = new String[] {""} ;
      T00043_n92ClienteCobCelular1 = new boolean[] {false} ;
      T00043_A93ClienteCobNombreCelular2 = new String[] {""} ;
      T00043_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      T00043_A94ClienteCobCelular2 = new String[] {""} ;
      T00043_n94ClienteCobCelular2 = new boolean[] {false} ;
      T00043_A95ClienteCobNombreEmail1 = new String[] {""} ;
      T00043_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      T00043_A96ClienteCobEmail1 = new String[] {""} ;
      T00043_n96ClienteCobEmail1 = new boolean[] {false} ;
      T00043_A97ClienteCobNombreEmail2 = new String[] {""} ;
      T00043_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      T00043_A98ClienteCobEmail2 = new String[] {""} ;
      T00043_n98ClienteCobEmail2 = new boolean[] {false} ;
      T00043_A99ClienteFacFax = new String[] {""} ;
      T00043_n99ClienteFacFax = new boolean[] {false} ;
      T00043_A100ClienteFacEmail = new String[] {""} ;
      T00043_n100ClienteFacEmail = new boolean[] {false} ;
      T00043_A101ClienteFacContrato = new String[] {""} ;
      T00043_n101ClienteFacContrato = new boolean[] {false} ;
      T00043_A102ClienteFacObservaciones = new String[] {""} ;
      T00043_n102ClienteFacObservaciones = new boolean[] {false} ;
      T00043_A103ClienteFacLista = new long[1] ;
      T00043_n103ClienteFacLista = new boolean[] {false} ;
      T00043_A104ClienteFacContado = new short[1] ;
      T00043_n104ClienteFacContado = new boolean[] {false} ;
      T00043_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      T00043_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      T00043_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      T00043_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      T00043_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      T00043_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      T00043_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      T00043_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      T00043_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      T00043_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      T00043_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      T00043_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      T00043_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      T00043_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      T00043_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      T00043_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      T00043_A113ClienteIncobrable = new short[1] ;
      T00043_n113ClienteIncobrable = new boolean[] {false} ;
      sMode4 = "" ;
      T00046_A4ClienteId = new long[1] ;
      T00047_A4ClienteId = new long[1] ;
      T00042_A4ClienteId = new long[1] ;
      T00042_A45ClienteNombre = new String[] {""} ;
      T00042_n45ClienteNombre = new boolean[] {false} ;
      T00042_A46ClienteEmail = new String[] {""} ;
      T00042_n46ClienteEmail = new boolean[] {false} ;
      T00042_A47ClienteNombreEmail1 = new String[] {""} ;
      T00042_n47ClienteNombreEmail1 = new boolean[] {false} ;
      T00042_A48ClienteEmail1 = new String[] {""} ;
      T00042_n48ClienteEmail1 = new boolean[] {false} ;
      T00042_A49ClienteNombreEmail2 = new String[] {""} ;
      T00042_n49ClienteNombreEmail2 = new boolean[] {false} ;
      T00042_A50ClienteEmail2 = new String[] {""} ;
      T00042_n50ClienteEmail2 = new boolean[] {false} ;
      T00042_A51ClienteEnvio = new String[] {""} ;
      T00042_n51ClienteEnvio = new boolean[] {false} ;
      T00042_A52ClienteUsuarioWeb = new String[] {""} ;
      T00042_n52ClienteUsuarioWeb = new boolean[] {false} ;
      T00042_A53ClienteNombreCelular1 = new String[] {""} ;
      T00042_n53ClienteNombreCelular1 = new boolean[] {false} ;
      T00042_A54ClienteCelular1 = new String[] {""} ;
      T00042_n54ClienteCelular1 = new boolean[] {false} ;
      T00042_A55ClienteNombreCelular2 = new String[] {""} ;
      T00042_n55ClienteNombreCelular2 = new boolean[] {false} ;
      T00042_A56ClienteCelular2 = new String[] {""} ;
      T00042_n56ClienteCelular2 = new boolean[] {false} ;
      T00042_A57ClienteCodigoFigaro = new String[] {""} ;
      T00042_n57ClienteCodigoFigaro = new boolean[] {false} ;
      T00042_A58ClienteTipoUsuario = new short[1] ;
      T00042_n58ClienteTipoUsuario = new boolean[] {false} ;
      T00042_A59ClienteDireccion = new String[] {""} ;
      T00042_n59ClienteDireccion = new boolean[] {false} ;
      T00042_A60ClienteNombreTelefono1 = new String[] {""} ;
      T00042_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      T00042_A61ClienteTelefono1 = new String[] {""} ;
      T00042_n61ClienteTelefono1 = new boolean[] {false} ;
      T00042_A62ClienteNombreTelefono2 = new String[] {""} ;
      T00042_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      T00042_A63ClienteTelefono2 = new String[] {""} ;
      T00042_n63ClienteTelefono2 = new boolean[] {false} ;
      T00042_A64ClienteFax = new String[] {""} ;
      T00042_n64ClienteFax = new boolean[] {false} ;
      T00042_A65ClienteDicose = new String[] {""} ;
      T00042_n65ClienteDicose = new boolean[] {false} ;
      T00042_A66ClienteIdDepartamento = new long[1] ;
      T00042_n66ClienteIdDepartamento = new boolean[] {false} ;
      T00042_A67ClienteIdLocalidad = new long[1] ;
      T00042_n67ClienteIdLocalidad = new boolean[] {false} ;
      T00042_A68ClienteTecnico1 = new long[1] ;
      T00042_n68ClienteTecnico1 = new boolean[] {false} ;
      T00042_A69ClienteTecnico2 = new long[1] ;
      T00042_n69ClienteTecnico2 = new boolean[] {false} ;
      T00042_A70ClienteIdAgencia = new long[1] ;
      T00042_n70ClienteIdAgencia = new boolean[] {false} ;
      T00042_A71ClienteContrato = new short[1] ;
      T00042_n71ClienteContrato = new boolean[] {false} ;
      T00042_A72ClienteSocio = new short[1] ;
      T00042_n72ClienteSocio = new boolean[] {false} ;
      T00042_A73ClienteNoUsar = new short[1] ;
      T00042_n73ClienteNoUsar = new boolean[] {false} ;
      T00042_A74ClienteCodbar = new short[1] ;
      T00042_n74ClienteCodbar = new boolean[] {false} ;
      T00042_A75ClienteCaravanas = new short[1] ;
      T00042_n75ClienteCaravanas = new boolean[] {false} ;
      T00042_A76ClienteProlesa = new short[1] ;
      T00042_n76ClienteProlesa = new boolean[] {false} ;
      T00042_A77ClienteProlesaSuc = new long[1] ;
      T00042_n77ClienteProlesaSuc = new boolean[] {false} ;
      T00042_A168ClienteProlesaMat = new long[1] ;
      T00042_A78ClienteObservaciones = new String[] {""} ;
      T00042_n78ClienteObservaciones = new boolean[] {false} ;
      T00042_A79ClienteFacRsocial = new String[] {""} ;
      T00042_n79ClienteFacRsocial = new boolean[] {false} ;
      T00042_A80ClienteFacCedula = new String[] {""} ;
      T00042_n80ClienteFacCedula = new boolean[] {false} ;
      T00042_A81ClienteFacRut = new String[] {""} ;
      T00042_n81ClienteFacRut = new boolean[] {false} ;
      T00042_A82ClienteFacDireccion = new String[] {""} ;
      T00042_n82ClienteFacDireccion = new boolean[] {false} ;
      T00042_A83ClienteFacLocalidad = new String[] {""} ;
      T00042_n83ClienteFacLocalidad = new boolean[] {false} ;
      T00042_A84ClienteFacDepartamento = new long[1] ;
      T00042_n84ClienteFacDepartamento = new boolean[] {false} ;
      T00042_A85ClienteFacCpostal = new String[] {""} ;
      T00042_n85ClienteFacCpostal = new boolean[] {false} ;
      T00042_A86ClienteFacGiro = new long[1] ;
      T00042_n86ClienteFacGiro = new boolean[] {false} ;
      T00042_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      T00042_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      T00042_A88ClienteFacTelefonos = new String[] {""} ;
      T00042_n88ClienteFacTelefonos = new boolean[] {false} ;
      T00042_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      T00042_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      T00042_A90ClienteCobTelefono2 = new String[] {""} ;
      T00042_n90ClienteCobTelefono2 = new boolean[] {false} ;
      T00042_A91ClienteCobNombreCelular1 = new String[] {""} ;
      T00042_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      T00042_A92ClienteCobCelular1 = new String[] {""} ;
      T00042_n92ClienteCobCelular1 = new boolean[] {false} ;
      T00042_A93ClienteCobNombreCelular2 = new String[] {""} ;
      T00042_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      T00042_A94ClienteCobCelular2 = new String[] {""} ;
      T00042_n94ClienteCobCelular2 = new boolean[] {false} ;
      T00042_A95ClienteCobNombreEmail1 = new String[] {""} ;
      T00042_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      T00042_A96ClienteCobEmail1 = new String[] {""} ;
      T00042_n96ClienteCobEmail1 = new boolean[] {false} ;
      T00042_A97ClienteCobNombreEmail2 = new String[] {""} ;
      T00042_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      T00042_A98ClienteCobEmail2 = new String[] {""} ;
      T00042_n98ClienteCobEmail2 = new boolean[] {false} ;
      T00042_A99ClienteFacFax = new String[] {""} ;
      T00042_n99ClienteFacFax = new boolean[] {false} ;
      T00042_A100ClienteFacEmail = new String[] {""} ;
      T00042_n100ClienteFacEmail = new boolean[] {false} ;
      T00042_A101ClienteFacContrato = new String[] {""} ;
      T00042_n101ClienteFacContrato = new boolean[] {false} ;
      T00042_A102ClienteFacObservaciones = new String[] {""} ;
      T00042_n102ClienteFacObservaciones = new boolean[] {false} ;
      T00042_A103ClienteFacLista = new long[1] ;
      T00042_n103ClienteFacLista = new boolean[] {false} ;
      T00042_A104ClienteFacContado = new short[1] ;
      T00042_n104ClienteFacContado = new boolean[] {false} ;
      T00042_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      T00042_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      T00042_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      T00042_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      T00042_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      T00042_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      T00042_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      T00042_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      T00042_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      T00042_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      T00042_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      T00042_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      T00042_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      T00042_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      T00042_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      T00042_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      T00042_A113ClienteIncobrable = new short[1] ;
      T00042_n113ClienteIncobrable = new boolean[] {false} ;
      T000411_A4ClienteId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ45ClienteNombre = "" ;
      ZZ46ClienteEmail = "" ;
      ZZ47ClienteNombreEmail1 = "" ;
      ZZ48ClienteEmail1 = "" ;
      ZZ49ClienteNombreEmail2 = "" ;
      ZZ50ClienteEmail2 = "" ;
      ZZ51ClienteEnvio = "" ;
      ZZ52ClienteUsuarioWeb = "" ;
      ZZ53ClienteNombreCelular1 = "" ;
      ZZ54ClienteCelular1 = "" ;
      ZZ55ClienteNombreCelular2 = "" ;
      ZZ56ClienteCelular2 = "" ;
      ZZ57ClienteCodigoFigaro = "" ;
      ZZ59ClienteDireccion = "" ;
      ZZ60ClienteNombreTelefono1 = "" ;
      ZZ61ClienteTelefono1 = "" ;
      ZZ62ClienteNombreTelefono2 = "" ;
      ZZ63ClienteTelefono2 = "" ;
      ZZ64ClienteFax = "" ;
      ZZ65ClienteDicose = "" ;
      ZZ78ClienteObservaciones = "" ;
      ZZ79ClienteFacRsocial = "" ;
      ZZ80ClienteFacCedula = "" ;
      ZZ81ClienteFacRut = "" ;
      ZZ82ClienteFacDireccion = "" ;
      ZZ83ClienteFacLocalidad = "" ;
      ZZ85ClienteFacCpostal = "" ;
      ZZ87ClienteCobNombreTelefono1 = "" ;
      ZZ88ClienteFacTelefonos = "" ;
      ZZ89ClienteCobNombreTelefono2 = "" ;
      ZZ90ClienteCobTelefono2 = "" ;
      ZZ91ClienteCobNombreCelular1 = "" ;
      ZZ92ClienteCobCelular1 = "" ;
      ZZ93ClienteCobNombreCelular2 = "" ;
      ZZ94ClienteCobCelular2 = "" ;
      ZZ95ClienteCobNombreEmail1 = "" ;
      ZZ96ClienteCobEmail1 = "" ;
      ZZ97ClienteCobNombreEmail2 = "" ;
      ZZ98ClienteCobEmail2 = "" ;
      ZZ99ClienteFacFax = "" ;
      ZZ100ClienteFacEmail = "" ;
      ZZ101ClienteFacContrato = "" ;
      ZZ102ClienteFacObservaciones = "" ;
      ZZ105ClienteNotEmailFrascos1 = "" ;
      ZZ106ClienteNotEmailFrascos2 = "" ;
      ZZ107ClienteNotEmailMuestra1 = "" ;
      ZZ108ClienteNotEmailMuestra2 = "" ;
      ZZ109ClienteNotEmailAnalisis1 = "" ;
      ZZ110ClienteNotEmailAnalisis2 = "" ;
      ZZ111ClienteNotEmailGeneral1 = "" ;
      ZZ112ClienteNotEmailGeneral2 = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.cliente__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.cliente__default(),
         new Object[] {
             new Object[] {
            T00042_A4ClienteId, T00042_A45ClienteNombre, T00042_n45ClienteNombre, T00042_A46ClienteEmail, T00042_n46ClienteEmail, T00042_A47ClienteNombreEmail1, T00042_n47ClienteNombreEmail1, T00042_A48ClienteEmail1, T00042_n48ClienteEmail1, T00042_A49ClienteNombreEmail2,
            T00042_n49ClienteNombreEmail2, T00042_A50ClienteEmail2, T00042_n50ClienteEmail2, T00042_A51ClienteEnvio, T00042_n51ClienteEnvio, T00042_A52ClienteUsuarioWeb, T00042_n52ClienteUsuarioWeb, T00042_A53ClienteNombreCelular1, T00042_n53ClienteNombreCelular1, T00042_A54ClienteCelular1,
            T00042_n54ClienteCelular1, T00042_A55ClienteNombreCelular2, T00042_n55ClienteNombreCelular2, T00042_A56ClienteCelular2, T00042_n56ClienteCelular2, T00042_A57ClienteCodigoFigaro, T00042_n57ClienteCodigoFigaro, T00042_A58ClienteTipoUsuario, T00042_n58ClienteTipoUsuario, T00042_A59ClienteDireccion,
            T00042_n59ClienteDireccion, T00042_A60ClienteNombreTelefono1, T00042_n60ClienteNombreTelefono1, T00042_A61ClienteTelefono1, T00042_n61ClienteTelefono1, T00042_A62ClienteNombreTelefono2, T00042_n62ClienteNombreTelefono2, T00042_A63ClienteTelefono2, T00042_n63ClienteTelefono2, T00042_A64ClienteFax,
            T00042_n64ClienteFax, T00042_A65ClienteDicose, T00042_n65ClienteDicose, T00042_A66ClienteIdDepartamento, T00042_n66ClienteIdDepartamento, T00042_A67ClienteIdLocalidad, T00042_n67ClienteIdLocalidad, T00042_A68ClienteTecnico1, T00042_n68ClienteTecnico1, T00042_A69ClienteTecnico2,
            T00042_n69ClienteTecnico2, T00042_A70ClienteIdAgencia, T00042_n70ClienteIdAgencia, T00042_A71ClienteContrato, T00042_n71ClienteContrato, T00042_A72ClienteSocio, T00042_n72ClienteSocio, T00042_A73ClienteNoUsar, T00042_n73ClienteNoUsar, T00042_A74ClienteCodbar,
            T00042_n74ClienteCodbar, T00042_A75ClienteCaravanas, T00042_n75ClienteCaravanas, T00042_A76ClienteProlesa, T00042_n76ClienteProlesa, T00042_A77ClienteProlesaSuc, T00042_n77ClienteProlesaSuc, T00042_A168ClienteProlesaMat, T00042_A78ClienteObservaciones, T00042_n78ClienteObservaciones,
            T00042_A79ClienteFacRsocial, T00042_n79ClienteFacRsocial, T00042_A80ClienteFacCedula, T00042_n80ClienteFacCedula, T00042_A81ClienteFacRut, T00042_n81ClienteFacRut, T00042_A82ClienteFacDireccion, T00042_n82ClienteFacDireccion, T00042_A83ClienteFacLocalidad, T00042_n83ClienteFacLocalidad,
            T00042_A84ClienteFacDepartamento, T00042_n84ClienteFacDepartamento, T00042_A85ClienteFacCpostal, T00042_n85ClienteFacCpostal, T00042_A86ClienteFacGiro, T00042_n86ClienteFacGiro, T00042_A87ClienteCobNombreTelefono1, T00042_n87ClienteCobNombreTelefono1, T00042_A88ClienteFacTelefonos, T00042_n88ClienteFacTelefonos,
            T00042_A89ClienteCobNombreTelefono2, T00042_n89ClienteCobNombreTelefono2, T00042_A90ClienteCobTelefono2, T00042_n90ClienteCobTelefono2, T00042_A91ClienteCobNombreCelular1, T00042_n91ClienteCobNombreCelular1, T00042_A92ClienteCobCelular1, T00042_n92ClienteCobCelular1, T00042_A93ClienteCobNombreCelular2, T00042_n93ClienteCobNombreCelular2,
            T00042_A94ClienteCobCelular2, T00042_n94ClienteCobCelular2, T00042_A95ClienteCobNombreEmail1, T00042_n95ClienteCobNombreEmail1, T00042_A96ClienteCobEmail1, T00042_n96ClienteCobEmail1, T00042_A97ClienteCobNombreEmail2, T00042_n97ClienteCobNombreEmail2, T00042_A98ClienteCobEmail2, T00042_n98ClienteCobEmail2,
            T00042_A99ClienteFacFax, T00042_n99ClienteFacFax, T00042_A100ClienteFacEmail, T00042_n100ClienteFacEmail, T00042_A101ClienteFacContrato, T00042_n101ClienteFacContrato, T00042_A102ClienteFacObservaciones, T00042_n102ClienteFacObservaciones, T00042_A103ClienteFacLista, T00042_n103ClienteFacLista,
            T00042_A104ClienteFacContado, T00042_n104ClienteFacContado, T00042_A105ClienteNotEmailFrascos1, T00042_n105ClienteNotEmailFrascos1, T00042_A106ClienteNotEmailFrascos2, T00042_n106ClienteNotEmailFrascos2, T00042_A107ClienteNotEmailMuestra1, T00042_n107ClienteNotEmailMuestra1, T00042_A108ClienteNotEmailMuestra2, T00042_n108ClienteNotEmailMuestra2,
            T00042_A109ClienteNotEmailAnalisis1, T00042_n109ClienteNotEmailAnalisis1, T00042_A110ClienteNotEmailAnalisis2, T00042_n110ClienteNotEmailAnalisis2, T00042_A111ClienteNotEmailGeneral1, T00042_n111ClienteNotEmailGeneral1, T00042_A112ClienteNotEmailGeneral2, T00042_n112ClienteNotEmailGeneral2, T00042_A113ClienteIncobrable, T00042_n113ClienteIncobrable
            }
            , new Object[] {
            T00043_A4ClienteId, T00043_A45ClienteNombre, T00043_n45ClienteNombre, T00043_A46ClienteEmail, T00043_n46ClienteEmail, T00043_A47ClienteNombreEmail1, T00043_n47ClienteNombreEmail1, T00043_A48ClienteEmail1, T00043_n48ClienteEmail1, T00043_A49ClienteNombreEmail2,
            T00043_n49ClienteNombreEmail2, T00043_A50ClienteEmail2, T00043_n50ClienteEmail2, T00043_A51ClienteEnvio, T00043_n51ClienteEnvio, T00043_A52ClienteUsuarioWeb, T00043_n52ClienteUsuarioWeb, T00043_A53ClienteNombreCelular1, T00043_n53ClienteNombreCelular1, T00043_A54ClienteCelular1,
            T00043_n54ClienteCelular1, T00043_A55ClienteNombreCelular2, T00043_n55ClienteNombreCelular2, T00043_A56ClienteCelular2, T00043_n56ClienteCelular2, T00043_A57ClienteCodigoFigaro, T00043_n57ClienteCodigoFigaro, T00043_A58ClienteTipoUsuario, T00043_n58ClienteTipoUsuario, T00043_A59ClienteDireccion,
            T00043_n59ClienteDireccion, T00043_A60ClienteNombreTelefono1, T00043_n60ClienteNombreTelefono1, T00043_A61ClienteTelefono1, T00043_n61ClienteTelefono1, T00043_A62ClienteNombreTelefono2, T00043_n62ClienteNombreTelefono2, T00043_A63ClienteTelefono2, T00043_n63ClienteTelefono2, T00043_A64ClienteFax,
            T00043_n64ClienteFax, T00043_A65ClienteDicose, T00043_n65ClienteDicose, T00043_A66ClienteIdDepartamento, T00043_n66ClienteIdDepartamento, T00043_A67ClienteIdLocalidad, T00043_n67ClienteIdLocalidad, T00043_A68ClienteTecnico1, T00043_n68ClienteTecnico1, T00043_A69ClienteTecnico2,
            T00043_n69ClienteTecnico2, T00043_A70ClienteIdAgencia, T00043_n70ClienteIdAgencia, T00043_A71ClienteContrato, T00043_n71ClienteContrato, T00043_A72ClienteSocio, T00043_n72ClienteSocio, T00043_A73ClienteNoUsar, T00043_n73ClienteNoUsar, T00043_A74ClienteCodbar,
            T00043_n74ClienteCodbar, T00043_A75ClienteCaravanas, T00043_n75ClienteCaravanas, T00043_A76ClienteProlesa, T00043_n76ClienteProlesa, T00043_A77ClienteProlesaSuc, T00043_n77ClienteProlesaSuc, T00043_A168ClienteProlesaMat, T00043_A78ClienteObservaciones, T00043_n78ClienteObservaciones,
            T00043_A79ClienteFacRsocial, T00043_n79ClienteFacRsocial, T00043_A80ClienteFacCedula, T00043_n80ClienteFacCedula, T00043_A81ClienteFacRut, T00043_n81ClienteFacRut, T00043_A82ClienteFacDireccion, T00043_n82ClienteFacDireccion, T00043_A83ClienteFacLocalidad, T00043_n83ClienteFacLocalidad,
            T00043_A84ClienteFacDepartamento, T00043_n84ClienteFacDepartamento, T00043_A85ClienteFacCpostal, T00043_n85ClienteFacCpostal, T00043_A86ClienteFacGiro, T00043_n86ClienteFacGiro, T00043_A87ClienteCobNombreTelefono1, T00043_n87ClienteCobNombreTelefono1, T00043_A88ClienteFacTelefonos, T00043_n88ClienteFacTelefonos,
            T00043_A89ClienteCobNombreTelefono2, T00043_n89ClienteCobNombreTelefono2, T00043_A90ClienteCobTelefono2, T00043_n90ClienteCobTelefono2, T00043_A91ClienteCobNombreCelular1, T00043_n91ClienteCobNombreCelular1, T00043_A92ClienteCobCelular1, T00043_n92ClienteCobCelular1, T00043_A93ClienteCobNombreCelular2, T00043_n93ClienteCobNombreCelular2,
            T00043_A94ClienteCobCelular2, T00043_n94ClienteCobCelular2, T00043_A95ClienteCobNombreEmail1, T00043_n95ClienteCobNombreEmail1, T00043_A96ClienteCobEmail1, T00043_n96ClienteCobEmail1, T00043_A97ClienteCobNombreEmail2, T00043_n97ClienteCobNombreEmail2, T00043_A98ClienteCobEmail2, T00043_n98ClienteCobEmail2,
            T00043_A99ClienteFacFax, T00043_n99ClienteFacFax, T00043_A100ClienteFacEmail, T00043_n100ClienteFacEmail, T00043_A101ClienteFacContrato, T00043_n101ClienteFacContrato, T00043_A102ClienteFacObservaciones, T00043_n102ClienteFacObservaciones, T00043_A103ClienteFacLista, T00043_n103ClienteFacLista,
            T00043_A104ClienteFacContado, T00043_n104ClienteFacContado, T00043_A105ClienteNotEmailFrascos1, T00043_n105ClienteNotEmailFrascos1, T00043_A106ClienteNotEmailFrascos2, T00043_n106ClienteNotEmailFrascos2, T00043_A107ClienteNotEmailMuestra1, T00043_n107ClienteNotEmailMuestra1, T00043_A108ClienteNotEmailMuestra2, T00043_n108ClienteNotEmailMuestra2,
            T00043_A109ClienteNotEmailAnalisis1, T00043_n109ClienteNotEmailAnalisis1, T00043_A110ClienteNotEmailAnalisis2, T00043_n110ClienteNotEmailAnalisis2, T00043_A111ClienteNotEmailGeneral1, T00043_n111ClienteNotEmailGeneral1, T00043_A112ClienteNotEmailGeneral2, T00043_n112ClienteNotEmailGeneral2, T00043_A113ClienteIncobrable, T00043_n113ClienteIncobrable
            }
            , new Object[] {
            T00044_A4ClienteId, T00044_A45ClienteNombre, T00044_n45ClienteNombre, T00044_A46ClienteEmail, T00044_n46ClienteEmail, T00044_A47ClienteNombreEmail1, T00044_n47ClienteNombreEmail1, T00044_A48ClienteEmail1, T00044_n48ClienteEmail1, T00044_A49ClienteNombreEmail2,
            T00044_n49ClienteNombreEmail2, T00044_A50ClienteEmail2, T00044_n50ClienteEmail2, T00044_A51ClienteEnvio, T00044_n51ClienteEnvio, T00044_A52ClienteUsuarioWeb, T00044_n52ClienteUsuarioWeb, T00044_A53ClienteNombreCelular1, T00044_n53ClienteNombreCelular1, T00044_A54ClienteCelular1,
            T00044_n54ClienteCelular1, T00044_A55ClienteNombreCelular2, T00044_n55ClienteNombreCelular2, T00044_A56ClienteCelular2, T00044_n56ClienteCelular2, T00044_A57ClienteCodigoFigaro, T00044_n57ClienteCodigoFigaro, T00044_A58ClienteTipoUsuario, T00044_n58ClienteTipoUsuario, T00044_A59ClienteDireccion,
            T00044_n59ClienteDireccion, T00044_A60ClienteNombreTelefono1, T00044_n60ClienteNombreTelefono1, T00044_A61ClienteTelefono1, T00044_n61ClienteTelefono1, T00044_A62ClienteNombreTelefono2, T00044_n62ClienteNombreTelefono2, T00044_A63ClienteTelefono2, T00044_n63ClienteTelefono2, T00044_A64ClienteFax,
            T00044_n64ClienteFax, T00044_A65ClienteDicose, T00044_n65ClienteDicose, T00044_A66ClienteIdDepartamento, T00044_n66ClienteIdDepartamento, T00044_A67ClienteIdLocalidad, T00044_n67ClienteIdLocalidad, T00044_A68ClienteTecnico1, T00044_n68ClienteTecnico1, T00044_A69ClienteTecnico2,
            T00044_n69ClienteTecnico2, T00044_A70ClienteIdAgencia, T00044_n70ClienteIdAgencia, T00044_A71ClienteContrato, T00044_n71ClienteContrato, T00044_A72ClienteSocio, T00044_n72ClienteSocio, T00044_A73ClienteNoUsar, T00044_n73ClienteNoUsar, T00044_A74ClienteCodbar,
            T00044_n74ClienteCodbar, T00044_A75ClienteCaravanas, T00044_n75ClienteCaravanas, T00044_A76ClienteProlesa, T00044_n76ClienteProlesa, T00044_A77ClienteProlesaSuc, T00044_n77ClienteProlesaSuc, T00044_A168ClienteProlesaMat, T00044_A78ClienteObservaciones, T00044_n78ClienteObservaciones,
            T00044_A79ClienteFacRsocial, T00044_n79ClienteFacRsocial, T00044_A80ClienteFacCedula, T00044_n80ClienteFacCedula, T00044_A81ClienteFacRut, T00044_n81ClienteFacRut, T00044_A82ClienteFacDireccion, T00044_n82ClienteFacDireccion, T00044_A83ClienteFacLocalidad, T00044_n83ClienteFacLocalidad,
            T00044_A84ClienteFacDepartamento, T00044_n84ClienteFacDepartamento, T00044_A85ClienteFacCpostal, T00044_n85ClienteFacCpostal, T00044_A86ClienteFacGiro, T00044_n86ClienteFacGiro, T00044_A87ClienteCobNombreTelefono1, T00044_n87ClienteCobNombreTelefono1, T00044_A88ClienteFacTelefonos, T00044_n88ClienteFacTelefonos,
            T00044_A89ClienteCobNombreTelefono2, T00044_n89ClienteCobNombreTelefono2, T00044_A90ClienteCobTelefono2, T00044_n90ClienteCobTelefono2, T00044_A91ClienteCobNombreCelular1, T00044_n91ClienteCobNombreCelular1, T00044_A92ClienteCobCelular1, T00044_n92ClienteCobCelular1, T00044_A93ClienteCobNombreCelular2, T00044_n93ClienteCobNombreCelular2,
            T00044_A94ClienteCobCelular2, T00044_n94ClienteCobCelular2, T00044_A95ClienteCobNombreEmail1, T00044_n95ClienteCobNombreEmail1, T00044_A96ClienteCobEmail1, T00044_n96ClienteCobEmail1, T00044_A97ClienteCobNombreEmail2, T00044_n97ClienteCobNombreEmail2, T00044_A98ClienteCobEmail2, T00044_n98ClienteCobEmail2,
            T00044_A99ClienteFacFax, T00044_n99ClienteFacFax, T00044_A100ClienteFacEmail, T00044_n100ClienteFacEmail, T00044_A101ClienteFacContrato, T00044_n101ClienteFacContrato, T00044_A102ClienteFacObservaciones, T00044_n102ClienteFacObservaciones, T00044_A103ClienteFacLista, T00044_n103ClienteFacLista,
            T00044_A104ClienteFacContado, T00044_n104ClienteFacContado, T00044_A105ClienteNotEmailFrascos1, T00044_n105ClienteNotEmailFrascos1, T00044_A106ClienteNotEmailFrascos2, T00044_n106ClienteNotEmailFrascos2, T00044_A107ClienteNotEmailMuestra1, T00044_n107ClienteNotEmailMuestra1, T00044_A108ClienteNotEmailMuestra2, T00044_n108ClienteNotEmailMuestra2,
            T00044_A109ClienteNotEmailAnalisis1, T00044_n109ClienteNotEmailAnalisis1, T00044_A110ClienteNotEmailAnalisis2, T00044_n110ClienteNotEmailAnalisis2, T00044_A111ClienteNotEmailGeneral1, T00044_n111ClienteNotEmailGeneral1, T00044_A112ClienteNotEmailGeneral2, T00044_n112ClienteNotEmailGeneral2, T00044_A113ClienteIncobrable, T00044_n113ClienteIncobrable
            }
            , new Object[] {
            T00045_A4ClienteId
            }
            , new Object[] {
            T00046_A4ClienteId
            }
            , new Object[] {
            T00047_A4ClienteId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000411_A4ClienteId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z58ClienteTipoUsuario ;
   private short Z71ClienteContrato ;
   private short Z72ClienteSocio ;
   private short Z73ClienteNoUsar ;
   private short Z74ClienteCodbar ;
   private short Z75ClienteCaravanas ;
   private short Z76ClienteProlesa ;
   private short Z104ClienteFacContado ;
   private short Z113ClienteIncobrable ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A58ClienteTipoUsuario ;
   private short A71ClienteContrato ;
   private short A72ClienteSocio ;
   private short A73ClienteNoUsar ;
   private short A74ClienteCodbar ;
   private short A75ClienteCaravanas ;
   private short A76ClienteProlesa ;
   private short A104ClienteFacContado ;
   private short A113ClienteIncobrable ;
   private short RcdFound4 ;
   private short nIsDirty_4 ;
   private short ZZ58ClienteTipoUsuario ;
   private short ZZ71ClienteContrato ;
   private short ZZ72ClienteSocio ;
   private short ZZ73ClienteNoUsar ;
   private short ZZ74ClienteCodbar ;
   private short ZZ75ClienteCaravanas ;
   private short ZZ76ClienteProlesa ;
   private short ZZ104ClienteFacContado ;
   private short ZZ113ClienteIncobrable ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtClienteId_Enabled ;
   private int edtClienteNombre_Enabled ;
   private int edtClienteEmail_Enabled ;
   private int edtClienteNombreEmail1_Enabled ;
   private int edtClienteEmail1_Enabled ;
   private int edtClienteNombreEmail2_Enabled ;
   private int edtClienteEmail2_Enabled ;
   private int edtClienteEnvio_Enabled ;
   private int edtClienteUsuarioWeb_Enabled ;
   private int edtClienteNombreCelular1_Enabled ;
   private int edtClienteCelular1_Enabled ;
   private int edtClienteNombreCelular2_Enabled ;
   private int edtClienteCelular2_Enabled ;
   private int edtClienteCodigoFigaro_Enabled ;
   private int edtClienteTipoUsuario_Enabled ;
   private int edtClienteDireccion_Enabled ;
   private int edtClienteNombreTelefono1_Enabled ;
   private int edtClienteTelefono1_Enabled ;
   private int edtClienteNombreTelefono2_Enabled ;
   private int edtClienteTelefono2_Enabled ;
   private int edtClienteFax_Enabled ;
   private int edtClienteDicose_Enabled ;
   private int edtClienteIdDepartamento_Enabled ;
   private int edtClienteIdLocalidad_Enabled ;
   private int edtClienteTecnico1_Enabled ;
   private int edtClienteTecnico2_Enabled ;
   private int edtClienteIdAgencia_Enabled ;
   private int edtClienteContrato_Enabled ;
   private int edtClienteSocio_Enabled ;
   private int edtClienteNoUsar_Enabled ;
   private int edtClienteCodbar_Enabled ;
   private int edtClienteCaravanas_Enabled ;
   private int edtClienteProlesa_Enabled ;
   private int edtClienteProlesaSuc_Enabled ;
   private int edtClienteProlesaMat_Enabled ;
   private int edtClienteObservaciones_Enabled ;
   private int edtClienteFacRsocial_Enabled ;
   private int edtClienteFacCedula_Enabled ;
   private int edtClienteFacRut_Enabled ;
   private int edtClienteFacDireccion_Enabled ;
   private int edtClienteFacLocalidad_Enabled ;
   private int edtClienteFacDepartamento_Enabled ;
   private int edtClienteFacCpostal_Enabled ;
   private int edtClienteFacGiro_Enabled ;
   private int edtClienteCobNombreTelefono1_Enabled ;
   private int edtClienteFacTelefonos_Enabled ;
   private int edtClienteCobNombreTelefono2_Enabled ;
   private int edtClienteCobTelefono2_Enabled ;
   private int edtClienteCobNombreCelular1_Enabled ;
   private int edtClienteCobCelular1_Enabled ;
   private int edtClienteCobNombreCelular2_Enabled ;
   private int edtClienteCobCelular2_Enabled ;
   private int edtClienteCobNombreEmail1_Enabled ;
   private int edtClienteCobEmail1_Enabled ;
   private int edtClienteCobNombreEmail2_Enabled ;
   private int edtClienteCobEmail2_Enabled ;
   private int edtClienteFacFax_Enabled ;
   private int edtClienteFacEmail_Enabled ;
   private int edtClienteFacContrato_Enabled ;
   private int edtClienteFacObservaciones_Enabled ;
   private int edtClienteFacLista_Enabled ;
   private int edtClienteFacContado_Enabled ;
   private int edtClienteNotEmailFrascos1_Enabled ;
   private int edtClienteNotEmailFrascos2_Enabled ;
   private int edtClienteNotEmailMuestra1_Enabled ;
   private int edtClienteNotEmailMuestra2_Enabled ;
   private int edtClienteNotEmailAnalisis1_Enabled ;
   private int edtClienteNotEmailAnalisis2_Enabled ;
   private int edtClienteNotEmailGeneral1_Enabled ;
   private int edtClienteNotEmailGeneral2_Enabled ;
   private int edtClienteIncobrable_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z4ClienteId ;
   private long Z66ClienteIdDepartamento ;
   private long Z67ClienteIdLocalidad ;
   private long Z68ClienteTecnico1 ;
   private long Z69ClienteTecnico2 ;
   private long Z70ClienteIdAgencia ;
   private long Z77ClienteProlesaSuc ;
   private long Z168ClienteProlesaMat ;
   private long Z84ClienteFacDepartamento ;
   private long Z86ClienteFacGiro ;
   private long Z103ClienteFacLista ;
   private long A4ClienteId ;
   private long A66ClienteIdDepartamento ;
   private long A67ClienteIdLocalidad ;
   private long A68ClienteTecnico1 ;
   private long A69ClienteTecnico2 ;
   private long A70ClienteIdAgencia ;
   private long A77ClienteProlesaSuc ;
   private long A168ClienteProlesaMat ;
   private long A84ClienteFacDepartamento ;
   private long A86ClienteFacGiro ;
   private long A103ClienteFacLista ;
   private long ZZ4ClienteId ;
   private long ZZ66ClienteIdDepartamento ;
   private long ZZ67ClienteIdLocalidad ;
   private long ZZ68ClienteTecnico1 ;
   private long ZZ69ClienteTecnico2 ;
   private long ZZ70ClienteIdAgencia ;
   private long ZZ77ClienteProlesaSuc ;
   private long ZZ168ClienteProlesaMat ;
   private long ZZ84ClienteFacDepartamento ;
   private long ZZ86ClienteFacGiro ;
   private long ZZ103ClienteFacLista ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtClienteId_Internalname ;
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
   private String edtClienteId_Jsonclick ;
   private String edtClienteNombre_Internalname ;
   private String edtClienteNombre_Jsonclick ;
   private String edtClienteEmail_Internalname ;
   private String edtClienteEmail_Jsonclick ;
   private String edtClienteNombreEmail1_Internalname ;
   private String edtClienteNombreEmail1_Jsonclick ;
   private String edtClienteEmail1_Internalname ;
   private String edtClienteEmail1_Jsonclick ;
   private String edtClienteNombreEmail2_Internalname ;
   private String edtClienteNombreEmail2_Jsonclick ;
   private String edtClienteEmail2_Internalname ;
   private String edtClienteEmail2_Jsonclick ;
   private String edtClienteEnvio_Internalname ;
   private String edtClienteUsuarioWeb_Internalname ;
   private String edtClienteUsuarioWeb_Jsonclick ;
   private String edtClienteNombreCelular1_Internalname ;
   private String edtClienteNombreCelular1_Jsonclick ;
   private String edtClienteCelular1_Internalname ;
   private String edtClienteCelular1_Jsonclick ;
   private String edtClienteNombreCelular2_Internalname ;
   private String edtClienteNombreCelular2_Jsonclick ;
   private String edtClienteCelular2_Internalname ;
   private String edtClienteCelular2_Jsonclick ;
   private String edtClienteCodigoFigaro_Internalname ;
   private String edtClienteCodigoFigaro_Jsonclick ;
   private String edtClienteTipoUsuario_Internalname ;
   private String edtClienteTipoUsuario_Jsonclick ;
   private String edtClienteDireccion_Internalname ;
   private String edtClienteNombreTelefono1_Internalname ;
   private String edtClienteNombreTelefono1_Jsonclick ;
   private String edtClienteTelefono1_Internalname ;
   private String edtClienteTelefono1_Jsonclick ;
   private String edtClienteNombreTelefono2_Internalname ;
   private String edtClienteNombreTelefono2_Jsonclick ;
   private String edtClienteTelefono2_Internalname ;
   private String edtClienteTelefono2_Jsonclick ;
   private String edtClienteFax_Internalname ;
   private String edtClienteFax_Jsonclick ;
   private String edtClienteDicose_Internalname ;
   private String edtClienteDicose_Jsonclick ;
   private String edtClienteIdDepartamento_Internalname ;
   private String edtClienteIdDepartamento_Jsonclick ;
   private String edtClienteIdLocalidad_Internalname ;
   private String edtClienteIdLocalidad_Jsonclick ;
   private String edtClienteTecnico1_Internalname ;
   private String edtClienteTecnico1_Jsonclick ;
   private String edtClienteTecnico2_Internalname ;
   private String edtClienteTecnico2_Jsonclick ;
   private String edtClienteIdAgencia_Internalname ;
   private String edtClienteIdAgencia_Jsonclick ;
   private String edtClienteContrato_Internalname ;
   private String edtClienteContrato_Jsonclick ;
   private String edtClienteSocio_Internalname ;
   private String edtClienteSocio_Jsonclick ;
   private String edtClienteNoUsar_Internalname ;
   private String edtClienteNoUsar_Jsonclick ;
   private String edtClienteCodbar_Internalname ;
   private String edtClienteCodbar_Jsonclick ;
   private String edtClienteCaravanas_Internalname ;
   private String edtClienteCaravanas_Jsonclick ;
   private String edtClienteProlesa_Internalname ;
   private String edtClienteProlesa_Jsonclick ;
   private String edtClienteProlesaSuc_Internalname ;
   private String edtClienteProlesaSuc_Jsonclick ;
   private String edtClienteProlesaMat_Internalname ;
   private String edtClienteProlesaMat_Jsonclick ;
   private String edtClienteObservaciones_Internalname ;
   private String edtClienteFacRsocial_Internalname ;
   private String edtClienteFacRsocial_Jsonclick ;
   private String edtClienteFacCedula_Internalname ;
   private String edtClienteFacCedula_Jsonclick ;
   private String edtClienteFacRut_Internalname ;
   private String edtClienteFacRut_Jsonclick ;
   private String edtClienteFacDireccion_Internalname ;
   private String edtClienteFacLocalidad_Internalname ;
   private String edtClienteFacLocalidad_Jsonclick ;
   private String edtClienteFacDepartamento_Internalname ;
   private String edtClienteFacDepartamento_Jsonclick ;
   private String edtClienteFacCpostal_Internalname ;
   private String edtClienteFacCpostal_Jsonclick ;
   private String edtClienteFacGiro_Internalname ;
   private String edtClienteFacGiro_Jsonclick ;
   private String edtClienteCobNombreTelefono1_Internalname ;
   private String edtClienteCobNombreTelefono1_Jsonclick ;
   private String edtClienteFacTelefonos_Internalname ;
   private String edtClienteFacTelefonos_Jsonclick ;
   private String edtClienteCobNombreTelefono2_Internalname ;
   private String edtClienteCobNombreTelefono2_Jsonclick ;
   private String edtClienteCobTelefono2_Internalname ;
   private String edtClienteCobTelefono2_Jsonclick ;
   private String edtClienteCobNombreCelular1_Internalname ;
   private String edtClienteCobNombreCelular1_Jsonclick ;
   private String edtClienteCobCelular1_Internalname ;
   private String edtClienteCobCelular1_Jsonclick ;
   private String edtClienteCobNombreCelular2_Internalname ;
   private String edtClienteCobNombreCelular2_Jsonclick ;
   private String edtClienteCobCelular2_Internalname ;
   private String edtClienteCobCelular2_Jsonclick ;
   private String edtClienteCobNombreEmail1_Internalname ;
   private String edtClienteCobNombreEmail1_Jsonclick ;
   private String edtClienteCobEmail1_Internalname ;
   private String edtClienteCobEmail1_Jsonclick ;
   private String edtClienteCobNombreEmail2_Internalname ;
   private String edtClienteCobNombreEmail2_Jsonclick ;
   private String edtClienteCobEmail2_Internalname ;
   private String edtClienteCobEmail2_Jsonclick ;
   private String edtClienteFacFax_Internalname ;
   private String edtClienteFacFax_Jsonclick ;
   private String edtClienteFacEmail_Internalname ;
   private String edtClienteFacEmail_Jsonclick ;
   private String edtClienteFacContrato_Internalname ;
   private String edtClienteFacContrato_Jsonclick ;
   private String edtClienteFacObservaciones_Internalname ;
   private String edtClienteFacLista_Internalname ;
   private String edtClienteFacLista_Jsonclick ;
   private String edtClienteFacContado_Internalname ;
   private String edtClienteFacContado_Jsonclick ;
   private String edtClienteNotEmailFrascos1_Internalname ;
   private String edtClienteNotEmailFrascos1_Jsonclick ;
   private String edtClienteNotEmailFrascos2_Internalname ;
   private String edtClienteNotEmailFrascos2_Jsonclick ;
   private String edtClienteNotEmailMuestra1_Internalname ;
   private String edtClienteNotEmailMuestra1_Jsonclick ;
   private String edtClienteNotEmailMuestra2_Internalname ;
   private String edtClienteNotEmailMuestra2_Jsonclick ;
   private String edtClienteNotEmailAnalisis1_Internalname ;
   private String edtClienteNotEmailAnalisis1_Jsonclick ;
   private String edtClienteNotEmailAnalisis2_Internalname ;
   private String edtClienteNotEmailAnalisis2_Jsonclick ;
   private String edtClienteNotEmailGeneral1_Internalname ;
   private String edtClienteNotEmailGeneral1_Jsonclick ;
   private String edtClienteNotEmailGeneral2_Internalname ;
   private String edtClienteNotEmailGeneral2_Jsonclick ;
   private String edtClienteIncobrable_Internalname ;
   private String edtClienteIncobrable_Jsonclick ;
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
   private String sMode4 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n45ClienteNombre ;
   private boolean n46ClienteEmail ;
   private boolean n47ClienteNombreEmail1 ;
   private boolean n48ClienteEmail1 ;
   private boolean n49ClienteNombreEmail2 ;
   private boolean n50ClienteEmail2 ;
   private boolean n51ClienteEnvio ;
   private boolean n52ClienteUsuarioWeb ;
   private boolean n53ClienteNombreCelular1 ;
   private boolean n54ClienteCelular1 ;
   private boolean n55ClienteNombreCelular2 ;
   private boolean n56ClienteCelular2 ;
   private boolean n57ClienteCodigoFigaro ;
   private boolean n58ClienteTipoUsuario ;
   private boolean n59ClienteDireccion ;
   private boolean n60ClienteNombreTelefono1 ;
   private boolean n61ClienteTelefono1 ;
   private boolean n62ClienteNombreTelefono2 ;
   private boolean n63ClienteTelefono2 ;
   private boolean n64ClienteFax ;
   private boolean n65ClienteDicose ;
   private boolean n66ClienteIdDepartamento ;
   private boolean n67ClienteIdLocalidad ;
   private boolean n68ClienteTecnico1 ;
   private boolean n69ClienteTecnico2 ;
   private boolean n70ClienteIdAgencia ;
   private boolean n71ClienteContrato ;
   private boolean n72ClienteSocio ;
   private boolean n73ClienteNoUsar ;
   private boolean n74ClienteCodbar ;
   private boolean n75ClienteCaravanas ;
   private boolean n76ClienteProlesa ;
   private boolean n77ClienteProlesaSuc ;
   private boolean n78ClienteObservaciones ;
   private boolean n79ClienteFacRsocial ;
   private boolean n80ClienteFacCedula ;
   private boolean n81ClienteFacRut ;
   private boolean n82ClienteFacDireccion ;
   private boolean n83ClienteFacLocalidad ;
   private boolean n84ClienteFacDepartamento ;
   private boolean n85ClienteFacCpostal ;
   private boolean n86ClienteFacGiro ;
   private boolean n87ClienteCobNombreTelefono1 ;
   private boolean n88ClienteFacTelefonos ;
   private boolean n89ClienteCobNombreTelefono2 ;
   private boolean n90ClienteCobTelefono2 ;
   private boolean n91ClienteCobNombreCelular1 ;
   private boolean n92ClienteCobCelular1 ;
   private boolean n93ClienteCobNombreCelular2 ;
   private boolean n94ClienteCobCelular2 ;
   private boolean n95ClienteCobNombreEmail1 ;
   private boolean n96ClienteCobEmail1 ;
   private boolean n97ClienteCobNombreEmail2 ;
   private boolean n98ClienteCobEmail2 ;
   private boolean n99ClienteFacFax ;
   private boolean n100ClienteFacEmail ;
   private boolean n101ClienteFacContrato ;
   private boolean n102ClienteFacObservaciones ;
   private boolean n103ClienteFacLista ;
   private boolean n104ClienteFacContado ;
   private boolean n105ClienteNotEmailFrascos1 ;
   private boolean n106ClienteNotEmailFrascos2 ;
   private boolean n107ClienteNotEmailMuestra1 ;
   private boolean n108ClienteNotEmailMuestra2 ;
   private boolean n109ClienteNotEmailAnalisis1 ;
   private boolean n110ClienteNotEmailAnalisis2 ;
   private boolean n111ClienteNotEmailGeneral1 ;
   private boolean n112ClienteNotEmailGeneral2 ;
   private boolean n113ClienteIncobrable ;
   private boolean Gx_longc ;
   private String Z45ClienteNombre ;
   private String Z46ClienteEmail ;
   private String Z47ClienteNombreEmail1 ;
   private String Z48ClienteEmail1 ;
   private String Z49ClienteNombreEmail2 ;
   private String Z50ClienteEmail2 ;
   private String Z51ClienteEnvio ;
   private String Z52ClienteUsuarioWeb ;
   private String Z53ClienteNombreCelular1 ;
   private String Z54ClienteCelular1 ;
   private String Z55ClienteNombreCelular2 ;
   private String Z56ClienteCelular2 ;
   private String Z57ClienteCodigoFigaro ;
   private String Z59ClienteDireccion ;
   private String Z60ClienteNombreTelefono1 ;
   private String Z61ClienteTelefono1 ;
   private String Z62ClienteNombreTelefono2 ;
   private String Z63ClienteTelefono2 ;
   private String Z64ClienteFax ;
   private String Z65ClienteDicose ;
   private String Z78ClienteObservaciones ;
   private String Z79ClienteFacRsocial ;
   private String Z80ClienteFacCedula ;
   private String Z81ClienteFacRut ;
   private String Z82ClienteFacDireccion ;
   private String Z83ClienteFacLocalidad ;
   private String Z85ClienteFacCpostal ;
   private String Z87ClienteCobNombreTelefono1 ;
   private String Z88ClienteFacTelefonos ;
   private String Z89ClienteCobNombreTelefono2 ;
   private String Z90ClienteCobTelefono2 ;
   private String Z91ClienteCobNombreCelular1 ;
   private String Z92ClienteCobCelular1 ;
   private String Z93ClienteCobNombreCelular2 ;
   private String Z94ClienteCobCelular2 ;
   private String Z95ClienteCobNombreEmail1 ;
   private String Z96ClienteCobEmail1 ;
   private String Z97ClienteCobNombreEmail2 ;
   private String Z98ClienteCobEmail2 ;
   private String Z99ClienteFacFax ;
   private String Z100ClienteFacEmail ;
   private String Z101ClienteFacContrato ;
   private String Z102ClienteFacObservaciones ;
   private String Z105ClienteNotEmailFrascos1 ;
   private String Z106ClienteNotEmailFrascos2 ;
   private String Z107ClienteNotEmailMuestra1 ;
   private String Z108ClienteNotEmailMuestra2 ;
   private String Z109ClienteNotEmailAnalisis1 ;
   private String Z110ClienteNotEmailAnalisis2 ;
   private String Z111ClienteNotEmailGeneral1 ;
   private String Z112ClienteNotEmailGeneral2 ;
   private String A45ClienteNombre ;
   private String A46ClienteEmail ;
   private String A47ClienteNombreEmail1 ;
   private String A48ClienteEmail1 ;
   private String A49ClienteNombreEmail2 ;
   private String A50ClienteEmail2 ;
   private String A51ClienteEnvio ;
   private String A52ClienteUsuarioWeb ;
   private String A53ClienteNombreCelular1 ;
   private String A54ClienteCelular1 ;
   private String A55ClienteNombreCelular2 ;
   private String A56ClienteCelular2 ;
   private String A57ClienteCodigoFigaro ;
   private String A59ClienteDireccion ;
   private String A60ClienteNombreTelefono1 ;
   private String A61ClienteTelefono1 ;
   private String A62ClienteNombreTelefono2 ;
   private String A63ClienteTelefono2 ;
   private String A64ClienteFax ;
   private String A65ClienteDicose ;
   private String A78ClienteObservaciones ;
   private String A79ClienteFacRsocial ;
   private String A80ClienteFacCedula ;
   private String A81ClienteFacRut ;
   private String A82ClienteFacDireccion ;
   private String A83ClienteFacLocalidad ;
   private String A85ClienteFacCpostal ;
   private String A87ClienteCobNombreTelefono1 ;
   private String A88ClienteFacTelefonos ;
   private String A89ClienteCobNombreTelefono2 ;
   private String A90ClienteCobTelefono2 ;
   private String A91ClienteCobNombreCelular1 ;
   private String A92ClienteCobCelular1 ;
   private String A93ClienteCobNombreCelular2 ;
   private String A94ClienteCobCelular2 ;
   private String A95ClienteCobNombreEmail1 ;
   private String A96ClienteCobEmail1 ;
   private String A97ClienteCobNombreEmail2 ;
   private String A98ClienteCobEmail2 ;
   private String A99ClienteFacFax ;
   private String A100ClienteFacEmail ;
   private String A101ClienteFacContrato ;
   private String A102ClienteFacObservaciones ;
   private String A105ClienteNotEmailFrascos1 ;
   private String A106ClienteNotEmailFrascos2 ;
   private String A107ClienteNotEmailMuestra1 ;
   private String A108ClienteNotEmailMuestra2 ;
   private String A109ClienteNotEmailAnalisis1 ;
   private String A110ClienteNotEmailAnalisis2 ;
   private String A111ClienteNotEmailGeneral1 ;
   private String A112ClienteNotEmailGeneral2 ;
   private String ZZ45ClienteNombre ;
   private String ZZ46ClienteEmail ;
   private String ZZ47ClienteNombreEmail1 ;
   private String ZZ48ClienteEmail1 ;
   private String ZZ49ClienteNombreEmail2 ;
   private String ZZ50ClienteEmail2 ;
   private String ZZ51ClienteEnvio ;
   private String ZZ52ClienteUsuarioWeb ;
   private String ZZ53ClienteNombreCelular1 ;
   private String ZZ54ClienteCelular1 ;
   private String ZZ55ClienteNombreCelular2 ;
   private String ZZ56ClienteCelular2 ;
   private String ZZ57ClienteCodigoFigaro ;
   private String ZZ59ClienteDireccion ;
   private String ZZ60ClienteNombreTelefono1 ;
   private String ZZ61ClienteTelefono1 ;
   private String ZZ62ClienteNombreTelefono2 ;
   private String ZZ63ClienteTelefono2 ;
   private String ZZ64ClienteFax ;
   private String ZZ65ClienteDicose ;
   private String ZZ78ClienteObservaciones ;
   private String ZZ79ClienteFacRsocial ;
   private String ZZ80ClienteFacCedula ;
   private String ZZ81ClienteFacRut ;
   private String ZZ82ClienteFacDireccion ;
   private String ZZ83ClienteFacLocalidad ;
   private String ZZ85ClienteFacCpostal ;
   private String ZZ87ClienteCobNombreTelefono1 ;
   private String ZZ88ClienteFacTelefonos ;
   private String ZZ89ClienteCobNombreTelefono2 ;
   private String ZZ90ClienteCobTelefono2 ;
   private String ZZ91ClienteCobNombreCelular1 ;
   private String ZZ92ClienteCobCelular1 ;
   private String ZZ93ClienteCobNombreCelular2 ;
   private String ZZ94ClienteCobCelular2 ;
   private String ZZ95ClienteCobNombreEmail1 ;
   private String ZZ96ClienteCobEmail1 ;
   private String ZZ97ClienteCobNombreEmail2 ;
   private String ZZ98ClienteCobEmail2 ;
   private String ZZ99ClienteFacFax ;
   private String ZZ100ClienteFacEmail ;
   private String ZZ101ClienteFacContrato ;
   private String ZZ102ClienteFacObservaciones ;
   private String ZZ105ClienteNotEmailFrascos1 ;
   private String ZZ106ClienteNotEmailFrascos2 ;
   private String ZZ107ClienteNotEmailMuestra1 ;
   private String ZZ108ClienteNotEmailMuestra2 ;
   private String ZZ109ClienteNotEmailAnalisis1 ;
   private String ZZ110ClienteNotEmailAnalisis2 ;
   private String ZZ111ClienteNotEmailGeneral1 ;
   private String ZZ112ClienteNotEmailGeneral2 ;
   private IDataStoreProvider pr_default ;
   private long[] T00044_A4ClienteId ;
   private String[] T00044_A45ClienteNombre ;
   private boolean[] T00044_n45ClienteNombre ;
   private String[] T00044_A46ClienteEmail ;
   private boolean[] T00044_n46ClienteEmail ;
   private String[] T00044_A47ClienteNombreEmail1 ;
   private boolean[] T00044_n47ClienteNombreEmail1 ;
   private String[] T00044_A48ClienteEmail1 ;
   private boolean[] T00044_n48ClienteEmail1 ;
   private String[] T00044_A49ClienteNombreEmail2 ;
   private boolean[] T00044_n49ClienteNombreEmail2 ;
   private String[] T00044_A50ClienteEmail2 ;
   private boolean[] T00044_n50ClienteEmail2 ;
   private String[] T00044_A51ClienteEnvio ;
   private boolean[] T00044_n51ClienteEnvio ;
   private String[] T00044_A52ClienteUsuarioWeb ;
   private boolean[] T00044_n52ClienteUsuarioWeb ;
   private String[] T00044_A53ClienteNombreCelular1 ;
   private boolean[] T00044_n53ClienteNombreCelular1 ;
   private String[] T00044_A54ClienteCelular1 ;
   private boolean[] T00044_n54ClienteCelular1 ;
   private String[] T00044_A55ClienteNombreCelular2 ;
   private boolean[] T00044_n55ClienteNombreCelular2 ;
   private String[] T00044_A56ClienteCelular2 ;
   private boolean[] T00044_n56ClienteCelular2 ;
   private String[] T00044_A57ClienteCodigoFigaro ;
   private boolean[] T00044_n57ClienteCodigoFigaro ;
   private short[] T00044_A58ClienteTipoUsuario ;
   private boolean[] T00044_n58ClienteTipoUsuario ;
   private String[] T00044_A59ClienteDireccion ;
   private boolean[] T00044_n59ClienteDireccion ;
   private String[] T00044_A60ClienteNombreTelefono1 ;
   private boolean[] T00044_n60ClienteNombreTelefono1 ;
   private String[] T00044_A61ClienteTelefono1 ;
   private boolean[] T00044_n61ClienteTelefono1 ;
   private String[] T00044_A62ClienteNombreTelefono2 ;
   private boolean[] T00044_n62ClienteNombreTelefono2 ;
   private String[] T00044_A63ClienteTelefono2 ;
   private boolean[] T00044_n63ClienteTelefono2 ;
   private String[] T00044_A64ClienteFax ;
   private boolean[] T00044_n64ClienteFax ;
   private String[] T00044_A65ClienteDicose ;
   private boolean[] T00044_n65ClienteDicose ;
   private long[] T00044_A66ClienteIdDepartamento ;
   private boolean[] T00044_n66ClienteIdDepartamento ;
   private long[] T00044_A67ClienteIdLocalidad ;
   private boolean[] T00044_n67ClienteIdLocalidad ;
   private long[] T00044_A68ClienteTecnico1 ;
   private boolean[] T00044_n68ClienteTecnico1 ;
   private long[] T00044_A69ClienteTecnico2 ;
   private boolean[] T00044_n69ClienteTecnico2 ;
   private long[] T00044_A70ClienteIdAgencia ;
   private boolean[] T00044_n70ClienteIdAgencia ;
   private short[] T00044_A71ClienteContrato ;
   private boolean[] T00044_n71ClienteContrato ;
   private short[] T00044_A72ClienteSocio ;
   private boolean[] T00044_n72ClienteSocio ;
   private short[] T00044_A73ClienteNoUsar ;
   private boolean[] T00044_n73ClienteNoUsar ;
   private short[] T00044_A74ClienteCodbar ;
   private boolean[] T00044_n74ClienteCodbar ;
   private short[] T00044_A75ClienteCaravanas ;
   private boolean[] T00044_n75ClienteCaravanas ;
   private short[] T00044_A76ClienteProlesa ;
   private boolean[] T00044_n76ClienteProlesa ;
   private long[] T00044_A77ClienteProlesaSuc ;
   private boolean[] T00044_n77ClienteProlesaSuc ;
   private long[] T00044_A168ClienteProlesaMat ;
   private String[] T00044_A78ClienteObservaciones ;
   private boolean[] T00044_n78ClienteObservaciones ;
   private String[] T00044_A79ClienteFacRsocial ;
   private boolean[] T00044_n79ClienteFacRsocial ;
   private String[] T00044_A80ClienteFacCedula ;
   private boolean[] T00044_n80ClienteFacCedula ;
   private String[] T00044_A81ClienteFacRut ;
   private boolean[] T00044_n81ClienteFacRut ;
   private String[] T00044_A82ClienteFacDireccion ;
   private boolean[] T00044_n82ClienteFacDireccion ;
   private String[] T00044_A83ClienteFacLocalidad ;
   private boolean[] T00044_n83ClienteFacLocalidad ;
   private long[] T00044_A84ClienteFacDepartamento ;
   private boolean[] T00044_n84ClienteFacDepartamento ;
   private String[] T00044_A85ClienteFacCpostal ;
   private boolean[] T00044_n85ClienteFacCpostal ;
   private long[] T00044_A86ClienteFacGiro ;
   private boolean[] T00044_n86ClienteFacGiro ;
   private String[] T00044_A87ClienteCobNombreTelefono1 ;
   private boolean[] T00044_n87ClienteCobNombreTelefono1 ;
   private String[] T00044_A88ClienteFacTelefonos ;
   private boolean[] T00044_n88ClienteFacTelefonos ;
   private String[] T00044_A89ClienteCobNombreTelefono2 ;
   private boolean[] T00044_n89ClienteCobNombreTelefono2 ;
   private String[] T00044_A90ClienteCobTelefono2 ;
   private boolean[] T00044_n90ClienteCobTelefono2 ;
   private String[] T00044_A91ClienteCobNombreCelular1 ;
   private boolean[] T00044_n91ClienteCobNombreCelular1 ;
   private String[] T00044_A92ClienteCobCelular1 ;
   private boolean[] T00044_n92ClienteCobCelular1 ;
   private String[] T00044_A93ClienteCobNombreCelular2 ;
   private boolean[] T00044_n93ClienteCobNombreCelular2 ;
   private String[] T00044_A94ClienteCobCelular2 ;
   private boolean[] T00044_n94ClienteCobCelular2 ;
   private String[] T00044_A95ClienteCobNombreEmail1 ;
   private boolean[] T00044_n95ClienteCobNombreEmail1 ;
   private String[] T00044_A96ClienteCobEmail1 ;
   private boolean[] T00044_n96ClienteCobEmail1 ;
   private String[] T00044_A97ClienteCobNombreEmail2 ;
   private boolean[] T00044_n97ClienteCobNombreEmail2 ;
   private String[] T00044_A98ClienteCobEmail2 ;
   private boolean[] T00044_n98ClienteCobEmail2 ;
   private String[] T00044_A99ClienteFacFax ;
   private boolean[] T00044_n99ClienteFacFax ;
   private String[] T00044_A100ClienteFacEmail ;
   private boolean[] T00044_n100ClienteFacEmail ;
   private String[] T00044_A101ClienteFacContrato ;
   private boolean[] T00044_n101ClienteFacContrato ;
   private String[] T00044_A102ClienteFacObservaciones ;
   private boolean[] T00044_n102ClienteFacObservaciones ;
   private long[] T00044_A103ClienteFacLista ;
   private boolean[] T00044_n103ClienteFacLista ;
   private short[] T00044_A104ClienteFacContado ;
   private boolean[] T00044_n104ClienteFacContado ;
   private String[] T00044_A105ClienteNotEmailFrascos1 ;
   private boolean[] T00044_n105ClienteNotEmailFrascos1 ;
   private String[] T00044_A106ClienteNotEmailFrascos2 ;
   private boolean[] T00044_n106ClienteNotEmailFrascos2 ;
   private String[] T00044_A107ClienteNotEmailMuestra1 ;
   private boolean[] T00044_n107ClienteNotEmailMuestra1 ;
   private String[] T00044_A108ClienteNotEmailMuestra2 ;
   private boolean[] T00044_n108ClienteNotEmailMuestra2 ;
   private String[] T00044_A109ClienteNotEmailAnalisis1 ;
   private boolean[] T00044_n109ClienteNotEmailAnalisis1 ;
   private String[] T00044_A110ClienteNotEmailAnalisis2 ;
   private boolean[] T00044_n110ClienteNotEmailAnalisis2 ;
   private String[] T00044_A111ClienteNotEmailGeneral1 ;
   private boolean[] T00044_n111ClienteNotEmailGeneral1 ;
   private String[] T00044_A112ClienteNotEmailGeneral2 ;
   private boolean[] T00044_n112ClienteNotEmailGeneral2 ;
   private short[] T00044_A113ClienteIncobrable ;
   private boolean[] T00044_n113ClienteIncobrable ;
   private long[] T00045_A4ClienteId ;
   private long[] T00043_A4ClienteId ;
   private String[] T00043_A45ClienteNombre ;
   private boolean[] T00043_n45ClienteNombre ;
   private String[] T00043_A46ClienteEmail ;
   private boolean[] T00043_n46ClienteEmail ;
   private String[] T00043_A47ClienteNombreEmail1 ;
   private boolean[] T00043_n47ClienteNombreEmail1 ;
   private String[] T00043_A48ClienteEmail1 ;
   private boolean[] T00043_n48ClienteEmail1 ;
   private String[] T00043_A49ClienteNombreEmail2 ;
   private boolean[] T00043_n49ClienteNombreEmail2 ;
   private String[] T00043_A50ClienteEmail2 ;
   private boolean[] T00043_n50ClienteEmail2 ;
   private String[] T00043_A51ClienteEnvio ;
   private boolean[] T00043_n51ClienteEnvio ;
   private String[] T00043_A52ClienteUsuarioWeb ;
   private boolean[] T00043_n52ClienteUsuarioWeb ;
   private String[] T00043_A53ClienteNombreCelular1 ;
   private boolean[] T00043_n53ClienteNombreCelular1 ;
   private String[] T00043_A54ClienteCelular1 ;
   private boolean[] T00043_n54ClienteCelular1 ;
   private String[] T00043_A55ClienteNombreCelular2 ;
   private boolean[] T00043_n55ClienteNombreCelular2 ;
   private String[] T00043_A56ClienteCelular2 ;
   private boolean[] T00043_n56ClienteCelular2 ;
   private String[] T00043_A57ClienteCodigoFigaro ;
   private boolean[] T00043_n57ClienteCodigoFigaro ;
   private short[] T00043_A58ClienteTipoUsuario ;
   private boolean[] T00043_n58ClienteTipoUsuario ;
   private String[] T00043_A59ClienteDireccion ;
   private boolean[] T00043_n59ClienteDireccion ;
   private String[] T00043_A60ClienteNombreTelefono1 ;
   private boolean[] T00043_n60ClienteNombreTelefono1 ;
   private String[] T00043_A61ClienteTelefono1 ;
   private boolean[] T00043_n61ClienteTelefono1 ;
   private String[] T00043_A62ClienteNombreTelefono2 ;
   private boolean[] T00043_n62ClienteNombreTelefono2 ;
   private String[] T00043_A63ClienteTelefono2 ;
   private boolean[] T00043_n63ClienteTelefono2 ;
   private String[] T00043_A64ClienteFax ;
   private boolean[] T00043_n64ClienteFax ;
   private String[] T00043_A65ClienteDicose ;
   private boolean[] T00043_n65ClienteDicose ;
   private long[] T00043_A66ClienteIdDepartamento ;
   private boolean[] T00043_n66ClienteIdDepartamento ;
   private long[] T00043_A67ClienteIdLocalidad ;
   private boolean[] T00043_n67ClienteIdLocalidad ;
   private long[] T00043_A68ClienteTecnico1 ;
   private boolean[] T00043_n68ClienteTecnico1 ;
   private long[] T00043_A69ClienteTecnico2 ;
   private boolean[] T00043_n69ClienteTecnico2 ;
   private long[] T00043_A70ClienteIdAgencia ;
   private boolean[] T00043_n70ClienteIdAgencia ;
   private short[] T00043_A71ClienteContrato ;
   private boolean[] T00043_n71ClienteContrato ;
   private short[] T00043_A72ClienteSocio ;
   private boolean[] T00043_n72ClienteSocio ;
   private short[] T00043_A73ClienteNoUsar ;
   private boolean[] T00043_n73ClienteNoUsar ;
   private short[] T00043_A74ClienteCodbar ;
   private boolean[] T00043_n74ClienteCodbar ;
   private short[] T00043_A75ClienteCaravanas ;
   private boolean[] T00043_n75ClienteCaravanas ;
   private short[] T00043_A76ClienteProlesa ;
   private boolean[] T00043_n76ClienteProlesa ;
   private long[] T00043_A77ClienteProlesaSuc ;
   private boolean[] T00043_n77ClienteProlesaSuc ;
   private long[] T00043_A168ClienteProlesaMat ;
   private String[] T00043_A78ClienteObservaciones ;
   private boolean[] T00043_n78ClienteObservaciones ;
   private String[] T00043_A79ClienteFacRsocial ;
   private boolean[] T00043_n79ClienteFacRsocial ;
   private String[] T00043_A80ClienteFacCedula ;
   private boolean[] T00043_n80ClienteFacCedula ;
   private String[] T00043_A81ClienteFacRut ;
   private boolean[] T00043_n81ClienteFacRut ;
   private String[] T00043_A82ClienteFacDireccion ;
   private boolean[] T00043_n82ClienteFacDireccion ;
   private String[] T00043_A83ClienteFacLocalidad ;
   private boolean[] T00043_n83ClienteFacLocalidad ;
   private long[] T00043_A84ClienteFacDepartamento ;
   private boolean[] T00043_n84ClienteFacDepartamento ;
   private String[] T00043_A85ClienteFacCpostal ;
   private boolean[] T00043_n85ClienteFacCpostal ;
   private long[] T00043_A86ClienteFacGiro ;
   private boolean[] T00043_n86ClienteFacGiro ;
   private String[] T00043_A87ClienteCobNombreTelefono1 ;
   private boolean[] T00043_n87ClienteCobNombreTelefono1 ;
   private String[] T00043_A88ClienteFacTelefonos ;
   private boolean[] T00043_n88ClienteFacTelefonos ;
   private String[] T00043_A89ClienteCobNombreTelefono2 ;
   private boolean[] T00043_n89ClienteCobNombreTelefono2 ;
   private String[] T00043_A90ClienteCobTelefono2 ;
   private boolean[] T00043_n90ClienteCobTelefono2 ;
   private String[] T00043_A91ClienteCobNombreCelular1 ;
   private boolean[] T00043_n91ClienteCobNombreCelular1 ;
   private String[] T00043_A92ClienteCobCelular1 ;
   private boolean[] T00043_n92ClienteCobCelular1 ;
   private String[] T00043_A93ClienteCobNombreCelular2 ;
   private boolean[] T00043_n93ClienteCobNombreCelular2 ;
   private String[] T00043_A94ClienteCobCelular2 ;
   private boolean[] T00043_n94ClienteCobCelular2 ;
   private String[] T00043_A95ClienteCobNombreEmail1 ;
   private boolean[] T00043_n95ClienteCobNombreEmail1 ;
   private String[] T00043_A96ClienteCobEmail1 ;
   private boolean[] T00043_n96ClienteCobEmail1 ;
   private String[] T00043_A97ClienteCobNombreEmail2 ;
   private boolean[] T00043_n97ClienteCobNombreEmail2 ;
   private String[] T00043_A98ClienteCobEmail2 ;
   private boolean[] T00043_n98ClienteCobEmail2 ;
   private String[] T00043_A99ClienteFacFax ;
   private boolean[] T00043_n99ClienteFacFax ;
   private String[] T00043_A100ClienteFacEmail ;
   private boolean[] T00043_n100ClienteFacEmail ;
   private String[] T00043_A101ClienteFacContrato ;
   private boolean[] T00043_n101ClienteFacContrato ;
   private String[] T00043_A102ClienteFacObservaciones ;
   private boolean[] T00043_n102ClienteFacObservaciones ;
   private long[] T00043_A103ClienteFacLista ;
   private boolean[] T00043_n103ClienteFacLista ;
   private short[] T00043_A104ClienteFacContado ;
   private boolean[] T00043_n104ClienteFacContado ;
   private String[] T00043_A105ClienteNotEmailFrascos1 ;
   private boolean[] T00043_n105ClienteNotEmailFrascos1 ;
   private String[] T00043_A106ClienteNotEmailFrascos2 ;
   private boolean[] T00043_n106ClienteNotEmailFrascos2 ;
   private String[] T00043_A107ClienteNotEmailMuestra1 ;
   private boolean[] T00043_n107ClienteNotEmailMuestra1 ;
   private String[] T00043_A108ClienteNotEmailMuestra2 ;
   private boolean[] T00043_n108ClienteNotEmailMuestra2 ;
   private String[] T00043_A109ClienteNotEmailAnalisis1 ;
   private boolean[] T00043_n109ClienteNotEmailAnalisis1 ;
   private String[] T00043_A110ClienteNotEmailAnalisis2 ;
   private boolean[] T00043_n110ClienteNotEmailAnalisis2 ;
   private String[] T00043_A111ClienteNotEmailGeneral1 ;
   private boolean[] T00043_n111ClienteNotEmailGeneral1 ;
   private String[] T00043_A112ClienteNotEmailGeneral2 ;
   private boolean[] T00043_n112ClienteNotEmailGeneral2 ;
   private short[] T00043_A113ClienteIncobrable ;
   private boolean[] T00043_n113ClienteIncobrable ;
   private long[] T00046_A4ClienteId ;
   private long[] T00047_A4ClienteId ;
   private long[] T00042_A4ClienteId ;
   private String[] T00042_A45ClienteNombre ;
   private boolean[] T00042_n45ClienteNombre ;
   private String[] T00042_A46ClienteEmail ;
   private boolean[] T00042_n46ClienteEmail ;
   private String[] T00042_A47ClienteNombreEmail1 ;
   private boolean[] T00042_n47ClienteNombreEmail1 ;
   private String[] T00042_A48ClienteEmail1 ;
   private boolean[] T00042_n48ClienteEmail1 ;
   private String[] T00042_A49ClienteNombreEmail2 ;
   private boolean[] T00042_n49ClienteNombreEmail2 ;
   private String[] T00042_A50ClienteEmail2 ;
   private boolean[] T00042_n50ClienteEmail2 ;
   private String[] T00042_A51ClienteEnvio ;
   private boolean[] T00042_n51ClienteEnvio ;
   private String[] T00042_A52ClienteUsuarioWeb ;
   private boolean[] T00042_n52ClienteUsuarioWeb ;
   private String[] T00042_A53ClienteNombreCelular1 ;
   private boolean[] T00042_n53ClienteNombreCelular1 ;
   private String[] T00042_A54ClienteCelular1 ;
   private boolean[] T00042_n54ClienteCelular1 ;
   private String[] T00042_A55ClienteNombreCelular2 ;
   private boolean[] T00042_n55ClienteNombreCelular2 ;
   private String[] T00042_A56ClienteCelular2 ;
   private boolean[] T00042_n56ClienteCelular2 ;
   private String[] T00042_A57ClienteCodigoFigaro ;
   private boolean[] T00042_n57ClienteCodigoFigaro ;
   private short[] T00042_A58ClienteTipoUsuario ;
   private boolean[] T00042_n58ClienteTipoUsuario ;
   private String[] T00042_A59ClienteDireccion ;
   private boolean[] T00042_n59ClienteDireccion ;
   private String[] T00042_A60ClienteNombreTelefono1 ;
   private boolean[] T00042_n60ClienteNombreTelefono1 ;
   private String[] T00042_A61ClienteTelefono1 ;
   private boolean[] T00042_n61ClienteTelefono1 ;
   private String[] T00042_A62ClienteNombreTelefono2 ;
   private boolean[] T00042_n62ClienteNombreTelefono2 ;
   private String[] T00042_A63ClienteTelefono2 ;
   private boolean[] T00042_n63ClienteTelefono2 ;
   private String[] T00042_A64ClienteFax ;
   private boolean[] T00042_n64ClienteFax ;
   private String[] T00042_A65ClienteDicose ;
   private boolean[] T00042_n65ClienteDicose ;
   private long[] T00042_A66ClienteIdDepartamento ;
   private boolean[] T00042_n66ClienteIdDepartamento ;
   private long[] T00042_A67ClienteIdLocalidad ;
   private boolean[] T00042_n67ClienteIdLocalidad ;
   private long[] T00042_A68ClienteTecnico1 ;
   private boolean[] T00042_n68ClienteTecnico1 ;
   private long[] T00042_A69ClienteTecnico2 ;
   private boolean[] T00042_n69ClienteTecnico2 ;
   private long[] T00042_A70ClienteIdAgencia ;
   private boolean[] T00042_n70ClienteIdAgencia ;
   private short[] T00042_A71ClienteContrato ;
   private boolean[] T00042_n71ClienteContrato ;
   private short[] T00042_A72ClienteSocio ;
   private boolean[] T00042_n72ClienteSocio ;
   private short[] T00042_A73ClienteNoUsar ;
   private boolean[] T00042_n73ClienteNoUsar ;
   private short[] T00042_A74ClienteCodbar ;
   private boolean[] T00042_n74ClienteCodbar ;
   private short[] T00042_A75ClienteCaravanas ;
   private boolean[] T00042_n75ClienteCaravanas ;
   private short[] T00042_A76ClienteProlesa ;
   private boolean[] T00042_n76ClienteProlesa ;
   private long[] T00042_A77ClienteProlesaSuc ;
   private boolean[] T00042_n77ClienteProlesaSuc ;
   private long[] T00042_A168ClienteProlesaMat ;
   private String[] T00042_A78ClienteObservaciones ;
   private boolean[] T00042_n78ClienteObservaciones ;
   private String[] T00042_A79ClienteFacRsocial ;
   private boolean[] T00042_n79ClienteFacRsocial ;
   private String[] T00042_A80ClienteFacCedula ;
   private boolean[] T00042_n80ClienteFacCedula ;
   private String[] T00042_A81ClienteFacRut ;
   private boolean[] T00042_n81ClienteFacRut ;
   private String[] T00042_A82ClienteFacDireccion ;
   private boolean[] T00042_n82ClienteFacDireccion ;
   private String[] T00042_A83ClienteFacLocalidad ;
   private boolean[] T00042_n83ClienteFacLocalidad ;
   private long[] T00042_A84ClienteFacDepartamento ;
   private boolean[] T00042_n84ClienteFacDepartamento ;
   private String[] T00042_A85ClienteFacCpostal ;
   private boolean[] T00042_n85ClienteFacCpostal ;
   private long[] T00042_A86ClienteFacGiro ;
   private boolean[] T00042_n86ClienteFacGiro ;
   private String[] T00042_A87ClienteCobNombreTelefono1 ;
   private boolean[] T00042_n87ClienteCobNombreTelefono1 ;
   private String[] T00042_A88ClienteFacTelefonos ;
   private boolean[] T00042_n88ClienteFacTelefonos ;
   private String[] T00042_A89ClienteCobNombreTelefono2 ;
   private boolean[] T00042_n89ClienteCobNombreTelefono2 ;
   private String[] T00042_A90ClienteCobTelefono2 ;
   private boolean[] T00042_n90ClienteCobTelefono2 ;
   private String[] T00042_A91ClienteCobNombreCelular1 ;
   private boolean[] T00042_n91ClienteCobNombreCelular1 ;
   private String[] T00042_A92ClienteCobCelular1 ;
   private boolean[] T00042_n92ClienteCobCelular1 ;
   private String[] T00042_A93ClienteCobNombreCelular2 ;
   private boolean[] T00042_n93ClienteCobNombreCelular2 ;
   private String[] T00042_A94ClienteCobCelular2 ;
   private boolean[] T00042_n94ClienteCobCelular2 ;
   private String[] T00042_A95ClienteCobNombreEmail1 ;
   private boolean[] T00042_n95ClienteCobNombreEmail1 ;
   private String[] T00042_A96ClienteCobEmail1 ;
   private boolean[] T00042_n96ClienteCobEmail1 ;
   private String[] T00042_A97ClienteCobNombreEmail2 ;
   private boolean[] T00042_n97ClienteCobNombreEmail2 ;
   private String[] T00042_A98ClienteCobEmail2 ;
   private boolean[] T00042_n98ClienteCobEmail2 ;
   private String[] T00042_A99ClienteFacFax ;
   private boolean[] T00042_n99ClienteFacFax ;
   private String[] T00042_A100ClienteFacEmail ;
   private boolean[] T00042_n100ClienteFacEmail ;
   private String[] T00042_A101ClienteFacContrato ;
   private boolean[] T00042_n101ClienteFacContrato ;
   private String[] T00042_A102ClienteFacObservaciones ;
   private boolean[] T00042_n102ClienteFacObservaciones ;
   private long[] T00042_A103ClienteFacLista ;
   private boolean[] T00042_n103ClienteFacLista ;
   private short[] T00042_A104ClienteFacContado ;
   private boolean[] T00042_n104ClienteFacContado ;
   private String[] T00042_A105ClienteNotEmailFrascos1 ;
   private boolean[] T00042_n105ClienteNotEmailFrascos1 ;
   private String[] T00042_A106ClienteNotEmailFrascos2 ;
   private boolean[] T00042_n106ClienteNotEmailFrascos2 ;
   private String[] T00042_A107ClienteNotEmailMuestra1 ;
   private boolean[] T00042_n107ClienteNotEmailMuestra1 ;
   private String[] T00042_A108ClienteNotEmailMuestra2 ;
   private boolean[] T00042_n108ClienteNotEmailMuestra2 ;
   private String[] T00042_A109ClienteNotEmailAnalisis1 ;
   private boolean[] T00042_n109ClienteNotEmailAnalisis1 ;
   private String[] T00042_A110ClienteNotEmailAnalisis2 ;
   private boolean[] T00042_n110ClienteNotEmailAnalisis2 ;
   private String[] T00042_A111ClienteNotEmailGeneral1 ;
   private boolean[] T00042_n111ClienteNotEmailGeneral1 ;
   private String[] T00042_A112ClienteNotEmailGeneral2 ;
   private boolean[] T00042_n112ClienteNotEmailGeneral2 ;
   private short[] T00042_A113ClienteIncobrable ;
   private boolean[] T00042_n113ClienteIncobrable ;
   private long[] T000411_A4ClienteId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class cliente__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class cliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00043", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00044", "SELECT TM1.`ClienteId`, TM1.`ClienteNombre`, TM1.`ClienteEmail`, TM1.`ClienteNombreEmail1`, TM1.`ClienteEmail1`, TM1.`ClienteNombreEmail2`, TM1.`ClienteEmail2`, TM1.`ClienteEnvio`, TM1.`ClienteUsuarioWeb`, TM1.`ClienteNombreCelular1`, TM1.`ClienteCelular1`, TM1.`ClienteNombreCelular2`, TM1.`ClienteCelular2`, TM1.`ClienteCodigoFigaro`, TM1.`ClienteTipoUsuario`, TM1.`ClienteDireccion`, TM1.`ClienteNombreTelefono1`, TM1.`ClienteTelefono1`, TM1.`ClienteNombreTelefono2`, TM1.`ClienteTelefono2`, TM1.`ClienteFax`, TM1.`ClienteDicose`, TM1.`ClienteIdDepartamento`, TM1.`ClienteIdLocalidad`, TM1.`ClienteTecnico1`, TM1.`ClienteTecnico2`, TM1.`ClienteIdAgencia`, TM1.`ClienteContrato`, TM1.`ClienteSocio`, TM1.`ClienteNoUsar`, TM1.`ClienteCodbar`, TM1.`ClienteCaravanas`, TM1.`ClienteProlesa`, TM1.`ClienteProlesaSuc`, TM1.`ClienteProlesaMat`, TM1.`ClienteObservaciones`, TM1.`ClienteFacRsocial`, TM1.`ClienteFacCedula`, TM1.`ClienteFacRut`, TM1.`ClienteFacDireccion`, TM1.`ClienteFacLocalidad`, TM1.`ClienteFacDepartamento`, TM1.`ClienteFacCpostal`, TM1.`ClienteFacGiro`, TM1.`ClienteCobNombreTelefono1`, TM1.`ClienteFacTelefonos`, TM1.`ClienteCobNombreTelefono2`, TM1.`ClienteCobTelefono2`, TM1.`ClienteCobNombreCelular1`, TM1.`ClienteCobCelular1`, TM1.`ClienteCobNombreCelular2`, TM1.`ClienteCobCelular2`, TM1.`ClienteCobNombreEmail1`, TM1.`ClienteCobEmail1`, TM1.`ClienteCobNombreEmail2`, TM1.`ClienteCobEmail2`, TM1.`ClienteFacFax`, TM1.`ClienteFacEmail`, TM1.`ClienteFacContrato`, TM1.`ClienteFacObservaciones`, TM1.`ClienteFacLista`, TM1.`ClienteFacContado`, TM1.`ClienteNotEmailFrascos1`, TM1.`ClienteNotEmailFrascos2`, TM1.`ClienteNotEmailMuestra1`, TM1.`ClienteNotEmailMuestra2`, TM1.`ClienteNotEmailAnalisis1`, TM1.`ClienteNotEmailAnalisis2`, TM1.`ClienteNotEmailGeneral1`, TM1.`ClienteNotEmailGeneral2`, TM1.`ClienteIncobrable` FROM `Cliente` TM1 WHERE TM1.`ClienteId` = ? ORDER BY TM1.`ClienteId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00045", "SELECT `ClienteId` FROM `Cliente` WHERE `ClienteId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00046", "SELECT `ClienteId` FROM `Cliente` WHERE ( `ClienteId` > ?) ORDER BY `ClienteId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00047", "SELECT `ClienteId` FROM `Cliente` WHERE ( `ClienteId` < ?) ORDER BY `ClienteId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00048", "INSERT INTO `Cliente`(`ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00049", "UPDATE `Cliente` SET `ClienteNombre`=?, `ClienteEmail`=?, `ClienteNombreEmail1`=?, `ClienteEmail1`=?, `ClienteNombreEmail2`=?, `ClienteEmail2`=?, `ClienteEnvio`=?, `ClienteUsuarioWeb`=?, `ClienteNombreCelular1`=?, `ClienteCelular1`=?, `ClienteNombreCelular2`=?, `ClienteCelular2`=?, `ClienteCodigoFigaro`=?, `ClienteTipoUsuario`=?, `ClienteDireccion`=?, `ClienteNombreTelefono1`=?, `ClienteTelefono1`=?, `ClienteNombreTelefono2`=?, `ClienteTelefono2`=?, `ClienteFax`=?, `ClienteDicose`=?, `ClienteIdDepartamento`=?, `ClienteIdLocalidad`=?, `ClienteTecnico1`=?, `ClienteTecnico2`=?, `ClienteIdAgencia`=?, `ClienteContrato`=?, `ClienteSocio`=?, `ClienteNoUsar`=?, `ClienteCodbar`=?, `ClienteCaravanas`=?, `ClienteProlesa`=?, `ClienteProlesaSuc`=?, `ClienteProlesaMat`=?, `ClienteObservaciones`=?, `ClienteFacRsocial`=?, `ClienteFacCedula`=?, `ClienteFacRut`=?, `ClienteFacDireccion`=?, `ClienteFacLocalidad`=?, `ClienteFacDepartamento`=?, `ClienteFacCpostal`=?, `ClienteFacGiro`=?, `ClienteCobNombreTelefono1`=?, `ClienteFacTelefonos`=?, `ClienteCobNombreTelefono2`=?, `ClienteCobTelefono2`=?, `ClienteCobNombreCelular1`=?, `ClienteCobCelular1`=?, `ClienteCobNombreCelular2`=?, `ClienteCobCelular2`=?, `ClienteCobNombreEmail1`=?, `ClienteCobEmail1`=?, `ClienteCobNombreEmail2`=?, `ClienteCobEmail2`=?, `ClienteFacFax`=?, `ClienteFacEmail`=?, `ClienteFacContrato`=?, `ClienteFacObservaciones`=?, `ClienteFacLista`=?, `ClienteFacContado`=?, `ClienteNotEmailFrascos1`=?, `ClienteNotEmailFrascos2`=?, `ClienteNotEmailMuestra1`=?, `ClienteNotEmailMuestra2`=?, `ClienteNotEmailAnalisis1`=?, `ClienteNotEmailAnalisis2`=?, `ClienteNotEmailGeneral1`=?, `ClienteNotEmailGeneral2`=?, `ClienteIncobrable`=?  WHERE `ClienteId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000410", "DELETE FROM `Cliente`  WHERE `ClienteId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000411", "SELECT `ClienteId` FROM `Cliente` ORDER BY `ClienteId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
                  stmt.setVarchar(5, (String)parms[8], 100);
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 200);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 100);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 100);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 100);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 100);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
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
                  stmt.setVarchar(16, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 100);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 100);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 100);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 100);
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
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[44]).longValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[46]).longValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[48]).longValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[50]).longValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(27, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(34, ((Number) parms[66]).longValue());
               }
               stmt.setLong(35, ((Number) parms[67]).longValue());
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[69], 200);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[71], 100);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[73], 40);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[75], 40);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[77], 200);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[79], 40);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(42, ((Number) parms[81]).longValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[83], 40);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(44, ((Number) parms[85]).longValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[87], 100);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[89], 100);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[91], 100);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[93], 100);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[95], 100);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[97], 100);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[99], 100);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[101], 100);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(53, (String)parms[103], 100);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[105], 100);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[107], 100);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[109], 100);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[111], 100);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[113], 100);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[115], 80);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[117], 200);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(61, ((Number) parms[119]).longValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(63, (String)parms[123], 100);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[125], 100);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[127], 100);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[129], 100);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(67, (String)parms[131], 100);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(68, (String)parms[133], 100);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[135], 100);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(70, (String)parms[137], 100);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[139]).shortValue());
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
                  stmt.setVarchar(4, (String)parms[7], 100);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 100);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 100);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 100);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 100);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
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
                  stmt.setVarchar(15, (String)parms[29], 200);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 100);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 100);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 100);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
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
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[43]).longValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[45]).longValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[47]).longValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[49]).longValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[51]).longValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(33, ((Number) parms[65]).longValue());
               }
               stmt.setLong(34, ((Number) parms[66]).longValue());
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[68], 200);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 100);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[72], 40);
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
                  stmt.setVarchar(39, (String)parms[76], 200);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[78], 40);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(41, ((Number) parms[80]).longValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[82], 40);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(43, ((Number) parms[84]).longValue());
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
                  stmt.setVarchar(53, (String)parms[104], 100);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[106], 100);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[108], 100);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[110], 100);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[112], 100);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[114], 80);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[116], 200);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(60, ((Number) parms[118]).longValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[120]).shortValue());
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(62, (String)parms[122], 100);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(63, (String)parms[124], 100);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[126], 100);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[128], 100);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[130], 100);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(67, (String)parms[132], 100);
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(68, (String)parms[134], 100);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[136], 100);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[138]).shortValue());
               }
               stmt.setLong(71, ((Number) parms[139]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

