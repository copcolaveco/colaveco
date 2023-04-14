package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class resultado_impl extends GXDataArea
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
            AV11resultadoId = GXutil.lval( httpContext.GetPar( "resultadoId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11resultadoId), 18, 0));
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRESULTADOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11resultadoId), "ZZZZZZZZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Resultado", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtresultadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public resultado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public resultado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resultado_impl.class ));
   }

   public resultado_impl( int remoteHandle ,
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
      com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Resultado", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Resultado.htm");
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
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Resultado.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoId_Internalname, GXutil.ltrim( localUtil.ntoc( A1resultadoId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1resultadoId), "ZZZZZZZZZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoId_Enabled, 1, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFicha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFicha_Internalname, "Ficha", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFicha_Internalname, GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoFicha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFicha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoFicha_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoComentarios_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoComentarios_Internalname, "Comentarios", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoComentarios_Internalname, A8resultadoComentarios, GXutil.rtrim( localUtil.format( A8resultadoComentarios, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoComentarios_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoComentarios_Enabled, 0, "text", "", 45, "chr", 1, "row", 45, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoUserId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoUserId_Internalname, "User Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoUserId_Internalname, GXutil.ltrim( localUtil.ntoc( A9resultadoUserId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoUserId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9resultadoUserId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9resultadoUserId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoUserId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoUserId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoTypeId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoTypeId_Internalname, "Type Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoTypeId_Internalname, GXutil.ltrim( localUtil.ntoc( A10resultadoTypeId, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoTypeId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10resultadoTypeId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10resultadoTypeId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoTypeId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoTypeId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdNetUsuario_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdNetUsuario_Internalname, "Net Usuario", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdNetUsuario_Internalname, GXutil.ltrim( localUtil.ntoc( A11resultadoIdNetUsuario, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdNetUsuario_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdNetUsuario_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoIdNetUsuario_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFechaCreado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFechaCreado_Internalname, "Fecha Creado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtresultadoFechaCreado_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFechaCreado_Internalname, localUtil.format(A12resultadoFechaCreado, "99/99/99"), localUtil.format( A12resultadoFechaCreado, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFechaCreado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoFechaCreado_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtresultadoFechaCreado_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtresultadoFechaCreado_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Resultado.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoFechaEmision_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoFechaEmision_Internalname, "Fecha Emision", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtresultadoFechaEmision_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoFechaEmision_Internalname, localUtil.format(A13resultadoFechaEmision, "99/99/99"), localUtil.format( A13resultadoFechaEmision, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'MDY',0,12,'eng',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoFechaEmision_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoFechaEmision_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_bitmap( httpContext, edtresultadoFechaEmision_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtresultadoFechaEmision_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Resultado.htm");
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
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathExcel_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathExcel_Internalname, "Path Excel", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathExcel_Internalname, A14resultadoPathExcel, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", (short)(0), 1, edtresultadoPathExcel_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathPdf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathPdf_Internalname, "Path Pdf", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathPdf_Internalname, A15resultadoPathPdf, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", (short)(0), 1, edtresultadoPathPdf_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoPathCsv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoPathCsv_Internalname, "Path Csv", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtresultadoPathCsv_Internalname, A16resultadoPathCsv, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", (short)(0), 1, edtresultadoPathCsv_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "", "500", -1, 0, "", "", (byte)(-1), true, "Path", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdEstado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdEstado_Internalname, "Id Estado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A17resultadoIdEstado, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A17resultadoIdEstado), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A17resultadoIdEstado), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdEstado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoIdEstado_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdLibro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdLibro_Internalname, "Id Libro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdLibro_Internalname, GXutil.ltrim( localUtil.ntoc( A18resultadoIdLibro, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdLibro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A18resultadoIdLibro), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A18resultadoIdLibro), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdLibro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoIdLibro_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoIdNetTipoinforme_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoIdNetTipoinforme_Internalname, "Net Tipoinforme", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoIdNetTipoinforme_Internalname, GXutil.ltrim( localUtil.ntoc( A166resultadoIdNetTipoinforme, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoIdNetTipoinforme_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoIdNetTipoinforme_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoIdNetTipoinforme_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "id", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoEliminado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoEliminado_Internalname, "Eliminado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoEliminado_Internalname, GXutil.ltrim( localUtil.ntoc( A19resultadoEliminado, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoEliminado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A19resultadoEliminado), "9") : localUtil.format( DecimalUtil.doubleToDec(A19resultadoEliminado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoEliminado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoEliminado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtresultadoAbonado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.colaveco.GxWebStd.gx_label_element( httpContext, edtresultadoAbonado_Internalname, "Abonado", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtresultadoAbonado_Internalname, GXutil.ltrim( localUtil.ntoc( A20resultadoAbonado, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtresultadoAbonado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A20resultadoAbonado), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A20resultadoAbonado), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtresultadoAbonado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtresultadoAbonado_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Resultado.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
      com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Resultado.htm");
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
      e11012 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z1resultadoId = localUtil.ctol( httpContext.cgiGet( "Z1resultadoId"), ".", ",") ;
            Z7resultadoFicha = localUtil.ctol( httpContext.cgiGet( "Z7resultadoFicha"), ".", ",") ;
            n7resultadoFicha = ((0==A7resultadoFicha) ? true : false) ;
            Z8resultadoComentarios = httpContext.cgiGet( "Z8resultadoComentarios") ;
            n8resultadoComentarios = ((GXutil.strcmp("", A8resultadoComentarios)==0) ? true : false) ;
            Z9resultadoUserId = localUtil.ctol( httpContext.cgiGet( "Z9resultadoUserId"), ".", ",") ;
            n9resultadoUserId = ((0==A9resultadoUserId) ? true : false) ;
            Z10resultadoTypeId = localUtil.ctol( httpContext.cgiGet( "Z10resultadoTypeId"), ".", ",") ;
            n10resultadoTypeId = ((0==A10resultadoTypeId) ? true : false) ;
            Z11resultadoIdNetUsuario = localUtil.ctol( httpContext.cgiGet( "Z11resultadoIdNetUsuario"), ".", ",") ;
            n11resultadoIdNetUsuario = ((0==A11resultadoIdNetUsuario) ? true : false) ;
            Z12resultadoFechaCreado = localUtil.ctod( httpContext.cgiGet( "Z12resultadoFechaCreado"), 0) ;
            n12resultadoFechaCreado = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12resultadoFechaCreado)) ? true : false) ;
            Z13resultadoFechaEmision = localUtil.ctod( httpContext.cgiGet( "Z13resultadoFechaEmision"), 0) ;
            n13resultadoFechaEmision = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13resultadoFechaEmision)) ? true : false) ;
            Z14resultadoPathExcel = httpContext.cgiGet( "Z14resultadoPathExcel") ;
            n14resultadoPathExcel = ((GXutil.strcmp("", A14resultadoPathExcel)==0) ? true : false) ;
            Z15resultadoPathPdf = httpContext.cgiGet( "Z15resultadoPathPdf") ;
            n15resultadoPathPdf = ((GXutil.strcmp("", A15resultadoPathPdf)==0) ? true : false) ;
            Z16resultadoPathCsv = httpContext.cgiGet( "Z16resultadoPathCsv") ;
            n16resultadoPathCsv = ((GXutil.strcmp("", A16resultadoPathCsv)==0) ? true : false) ;
            Z17resultadoIdEstado = localUtil.ctol( httpContext.cgiGet( "Z17resultadoIdEstado"), ".", ",") ;
            n17resultadoIdEstado = ((0==A17resultadoIdEstado) ? true : false) ;
            Z18resultadoIdLibro = localUtil.ctol( httpContext.cgiGet( "Z18resultadoIdLibro"), ".", ",") ;
            n18resultadoIdLibro = ((0==A18resultadoIdLibro) ? true : false) ;
            Z166resultadoIdNetTipoinforme = localUtil.ctol( httpContext.cgiGet( "Z166resultadoIdNetTipoinforme"), ".", ",") ;
            Z19resultadoEliminado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z19resultadoEliminado"), ".", ",")) ;
            n19resultadoEliminado = ((0==A19resultadoEliminado) ? true : false) ;
            Z20resultadoAbonado = localUtil.ctol( httpContext.cgiGet( "Z20resultadoAbonado"), ".", ",") ;
            n20resultadoAbonado = ((0==A20resultadoAbonado) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11resultadoId = localUtil.ctol( httpContext.cgiGet( "vRESULTADOID"), ".", ",") ;
            AV12Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoId_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1resultadoId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
            }
            else
            {
               A1resultadoId = localUtil.ctol( httpContext.cgiGet( edtresultadoId_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOFICHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoFicha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7resultadoFicha = 0 ;
               n7resultadoFicha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
            }
            else
            {
               A7resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") ;
               n7resultadoFicha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
            }
            n7resultadoFicha = ((0==A7resultadoFicha) ? true : false) ;
            A8resultadoComentarios = httpContext.cgiGet( edtresultadoComentarios_Internalname) ;
            n8resultadoComentarios = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8resultadoComentarios", A8resultadoComentarios);
            n8resultadoComentarios = ((GXutil.strcmp("", A8resultadoComentarios)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoUserId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoUserId_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOUSERID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoUserId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9resultadoUserId = 0 ;
               n9resultadoUserId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
            }
            else
            {
               A9resultadoUserId = localUtil.ctol( httpContext.cgiGet( edtresultadoUserId_Internalname), ".", ",") ;
               n9resultadoUserId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
            }
            n9resultadoUserId = ((0==A9resultadoUserId) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoTypeId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoTypeId_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOTYPEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoTypeId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10resultadoTypeId = 0 ;
               n10resultadoTypeId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
            }
            else
            {
               A10resultadoTypeId = localUtil.ctol( httpContext.cgiGet( edtresultadoTypeId_Internalname), ".", ",") ;
               n10resultadoTypeId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
            }
            n10resultadoTypeId = ((0==A10resultadoTypeId) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetUsuario_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetUsuario_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOIDNETUSUARIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoIdNetUsuario_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11resultadoIdNetUsuario = 0 ;
               n11resultadoIdNetUsuario = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
            }
            else
            {
               A11resultadoIdNetUsuario = localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetUsuario_Internalname), ".", ",") ;
               n11resultadoIdNetUsuario = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
            }
            n11resultadoIdNetUsuario = ((0==A11resultadoIdNetUsuario) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtresultadoFechaCreado_Internalname), (byte)(2)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RESULTADOFECHACREADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoFechaCreado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12resultadoFechaCreado = GXutil.nullDate() ;
               n12resultadoFechaCreado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
            }
            else
            {
               A12resultadoFechaCreado = localUtil.ctod( httpContext.cgiGet( edtresultadoFechaCreado_Internalname), 2) ;
               n12resultadoFechaCreado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
            }
            n12resultadoFechaCreado = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12resultadoFechaCreado)) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtresultadoFechaEmision_Internalname), (byte)(2)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RESULTADOFECHAEMISION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoFechaEmision_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13resultadoFechaEmision = GXutil.nullDate() ;
               n13resultadoFechaEmision = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
            }
            else
            {
               A13resultadoFechaEmision = localUtil.ctod( httpContext.cgiGet( edtresultadoFechaEmision_Internalname), 2) ;
               n13resultadoFechaEmision = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
            }
            n13resultadoFechaEmision = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13resultadoFechaEmision)) ? true : false) ;
            A14resultadoPathExcel = httpContext.cgiGet( edtresultadoPathExcel_Internalname) ;
            n14resultadoPathExcel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14resultadoPathExcel", A14resultadoPathExcel);
            n14resultadoPathExcel = ((GXutil.strcmp("", A14resultadoPathExcel)==0) ? true : false) ;
            A15resultadoPathPdf = httpContext.cgiGet( edtresultadoPathPdf_Internalname) ;
            n15resultadoPathPdf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A15resultadoPathPdf", A15resultadoPathPdf);
            n15resultadoPathPdf = ((GXutil.strcmp("", A15resultadoPathPdf)==0) ? true : false) ;
            A16resultadoPathCsv = httpContext.cgiGet( edtresultadoPathCsv_Internalname) ;
            n16resultadoPathCsv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A16resultadoPathCsv", A16resultadoPathCsv);
            n16resultadoPathCsv = ((GXutil.strcmp("", A16resultadoPathCsv)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdEstado_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdEstado_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOIDESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoIdEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A17resultadoIdEstado = 0 ;
               n17resultadoIdEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
            }
            else
            {
               A17resultadoIdEstado = localUtil.ctol( httpContext.cgiGet( edtresultadoIdEstado_Internalname), ".", ",") ;
               n17resultadoIdEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
            }
            n17resultadoIdEstado = ((0==A17resultadoIdEstado) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdLibro_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdLibro_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOIDLIBRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoIdLibro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A18resultadoIdLibro = 0 ;
               n18resultadoIdLibro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
            }
            else
            {
               A18resultadoIdLibro = localUtil.ctol( httpContext.cgiGet( edtresultadoIdLibro_Internalname), ".", ",") ;
               n18resultadoIdLibro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
            }
            n18resultadoIdLibro = ((0==A18resultadoIdLibro) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetTipoinforme_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetTipoinforme_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOIDNETTIPOINFORME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoIdNetTipoinforme_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A166resultadoIdNetTipoinforme = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
            }
            else
            {
               A166resultadoIdNetTipoinforme = localUtil.ctol( httpContext.cgiGet( edtresultadoIdNetTipoinforme_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoEliminado_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoEliminado_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOELIMINADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoEliminado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A19resultadoEliminado = (byte)(0) ;
               n19resultadoEliminado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
            }
            else
            {
               A19resultadoEliminado = (byte)(localUtil.ctol( httpContext.cgiGet( edtresultadoEliminado_Internalname), ".", ",")) ;
               n19resultadoEliminado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
            }
            n19resultadoEliminado = ((0==A19resultadoEliminado) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoAbonado_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtresultadoAbonado_Internalname), ".", ",") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESULTADOABONADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoAbonado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A20resultadoAbonado = 0 ;
               n20resultadoAbonado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
            }
            else
            {
               A20resultadoAbonado = localUtil.ctol( httpContext.cgiGet( edtresultadoAbonado_Internalname), ".", ",") ;
               n20resultadoAbonado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
            }
            n20resultadoAbonado = ((0==A20resultadoAbonado) ? true : false) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Resultado");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1resultadoId != Z1resultadoId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("resultado:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1resultadoId = GXutil.lval( httpContext.GetPar( "resultadoId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
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
                  sMode1 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_010( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "RESULTADOID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtresultadoId_Internalname ;
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
                        e11012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12012 ();
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
         e12012 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll011( ) ;
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
         disableAttributes011( ) ;
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

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption010( )
   {
   }

   public void e11012( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( ! new com.colaveco.isauthorized(remoteHandle, context).executeUdp( AV12Pgmname) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("com.colaveco.notauthorized", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12Pgmname))}, new String[] {"GxObject"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e12012( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.colaveco.wwresultado", new String[] {}, new String[] {}) );
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

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7resultadoFicha = T00013_A7resultadoFicha[0] ;
            Z8resultadoComentarios = T00013_A8resultadoComentarios[0] ;
            Z9resultadoUserId = T00013_A9resultadoUserId[0] ;
            Z10resultadoTypeId = T00013_A10resultadoTypeId[0] ;
            Z11resultadoIdNetUsuario = T00013_A11resultadoIdNetUsuario[0] ;
            Z12resultadoFechaCreado = T00013_A12resultadoFechaCreado[0] ;
            Z13resultadoFechaEmision = T00013_A13resultadoFechaEmision[0] ;
            Z14resultadoPathExcel = T00013_A14resultadoPathExcel[0] ;
            Z15resultadoPathPdf = T00013_A15resultadoPathPdf[0] ;
            Z16resultadoPathCsv = T00013_A16resultadoPathCsv[0] ;
            Z17resultadoIdEstado = T00013_A17resultadoIdEstado[0] ;
            Z18resultadoIdLibro = T00013_A18resultadoIdLibro[0] ;
            Z166resultadoIdNetTipoinforme = T00013_A166resultadoIdNetTipoinforme[0] ;
            Z19resultadoEliminado = T00013_A19resultadoEliminado[0] ;
            Z20resultadoAbonado = T00013_A20resultadoAbonado[0] ;
         }
         else
         {
            Z7resultadoFicha = A7resultadoFicha ;
            Z8resultadoComentarios = A8resultadoComentarios ;
            Z9resultadoUserId = A9resultadoUserId ;
            Z10resultadoTypeId = A10resultadoTypeId ;
            Z11resultadoIdNetUsuario = A11resultadoIdNetUsuario ;
            Z12resultadoFechaCreado = A12resultadoFechaCreado ;
            Z13resultadoFechaEmision = A13resultadoFechaEmision ;
            Z14resultadoPathExcel = A14resultadoPathExcel ;
            Z15resultadoPathPdf = A15resultadoPathPdf ;
            Z16resultadoPathCsv = A16resultadoPathCsv ;
            Z17resultadoIdEstado = A17resultadoIdEstado ;
            Z18resultadoIdLibro = A18resultadoIdLibro ;
            Z166resultadoIdNetTipoinforme = A166resultadoIdNetTipoinforme ;
            Z19resultadoEliminado = A19resultadoEliminado ;
            Z20resultadoAbonado = A20resultadoAbonado ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z1resultadoId = A1resultadoId ;
         Z7resultadoFicha = A7resultadoFicha ;
         Z8resultadoComentarios = A8resultadoComentarios ;
         Z9resultadoUserId = A9resultadoUserId ;
         Z10resultadoTypeId = A10resultadoTypeId ;
         Z11resultadoIdNetUsuario = A11resultadoIdNetUsuario ;
         Z12resultadoFechaCreado = A12resultadoFechaCreado ;
         Z13resultadoFechaEmision = A13resultadoFechaEmision ;
         Z14resultadoPathExcel = A14resultadoPathExcel ;
         Z15resultadoPathPdf = A15resultadoPathPdf ;
         Z16resultadoPathCsv = A16resultadoPathCsv ;
         Z17resultadoIdEstado = A17resultadoIdEstado ;
         Z18resultadoIdLibro = A18resultadoIdLibro ;
         Z166resultadoIdNetTipoinforme = A166resultadoIdNetTipoinforme ;
         Z19resultadoEliminado = A19resultadoEliminado ;
         Z20resultadoAbonado = A20resultadoAbonado ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV11resultadoId) )
      {
         A1resultadoId = AV11resultadoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      }
      if ( ! (0==AV11resultadoId) )
      {
         edtresultadoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtresultadoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoId_Enabled), 5, 0), true);
      }
      else
      {
         edtresultadoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtresultadoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11resultadoId) )
      {
         edtresultadoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtresultadoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoId_Enabled), 5, 0), true);
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
         AV12Pgmname = "Resultado" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
   }

   public void load011( )
   {
      /* Using cursor T00014 */
      pr_default.execute(2, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A7resultadoFicha = T00014_A7resultadoFicha[0] ;
         n7resultadoFicha = T00014_n7resultadoFicha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
         A8resultadoComentarios = T00014_A8resultadoComentarios[0] ;
         n8resultadoComentarios = T00014_n8resultadoComentarios[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8resultadoComentarios", A8resultadoComentarios);
         A9resultadoUserId = T00014_A9resultadoUserId[0] ;
         n9resultadoUserId = T00014_n9resultadoUserId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
         A10resultadoTypeId = T00014_A10resultadoTypeId[0] ;
         n10resultadoTypeId = T00014_n10resultadoTypeId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
         A11resultadoIdNetUsuario = T00014_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = T00014_n11resultadoIdNetUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
         A12resultadoFechaCreado = T00014_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = T00014_n12resultadoFechaCreado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
         A13resultadoFechaEmision = T00014_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = T00014_n13resultadoFechaEmision[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
         A14resultadoPathExcel = T00014_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = T00014_n14resultadoPathExcel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14resultadoPathExcel", A14resultadoPathExcel);
         A15resultadoPathPdf = T00014_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = T00014_n15resultadoPathPdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15resultadoPathPdf", A15resultadoPathPdf);
         A16resultadoPathCsv = T00014_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = T00014_n16resultadoPathCsv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16resultadoPathCsv", A16resultadoPathCsv);
         A17resultadoIdEstado = T00014_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = T00014_n17resultadoIdEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
         A18resultadoIdLibro = T00014_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = T00014_n18resultadoIdLibro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
         A166resultadoIdNetTipoinforme = T00014_A166resultadoIdNetTipoinforme[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
         A19resultadoEliminado = T00014_A19resultadoEliminado[0] ;
         n19resultadoEliminado = T00014_n19resultadoEliminado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
         A20resultadoAbonado = T00014_A20resultadoAbonado[0] ;
         n20resultadoAbonado = T00014_n20resultadoAbonado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
         zm011( -6) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
      AV12Pgmname = "Resultado" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
   }

   public void checkExtendedTable011( )
   {
      nIsDirty_1 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV12Pgmname = "Resultado" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12resultadoFechaCreado)) || (( GXutil.resetTime(A12resultadoFechaCreado).after( GXutil.resetTime( localUtil.ymdtod( 1000, 1, 1) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A12resultadoFechaCreado), GXutil.resetTime(localUtil.ymdtod( 1000, 1, 1))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field resultado Fecha Creado is out of range", "OutOfRange", 1, "RESULTADOFECHACREADO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtresultadoFechaCreado_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13resultadoFechaEmision)) || (( GXutil.resetTime(A13resultadoFechaEmision).after( GXutil.resetTime( localUtil.ymdtod( 1000, 1, 1) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13resultadoFechaEmision), GXutil.resetTime(localUtil.ymdtod( 1000, 1, 1))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field resultado Fecha Emision is out of range", "OutOfRange", 1, "RESULTADOFECHAEMISION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtresultadoFechaEmision_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor T00015 */
      pr_default.execute(3, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00013 */
      pr_default.execute(1, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm011( 6) ;
         RcdFound1 = (short)(1) ;
         A1resultadoId = T00013_A1resultadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
         A7resultadoFicha = T00013_A7resultadoFicha[0] ;
         n7resultadoFicha = T00013_n7resultadoFicha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
         A8resultadoComentarios = T00013_A8resultadoComentarios[0] ;
         n8resultadoComentarios = T00013_n8resultadoComentarios[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8resultadoComentarios", A8resultadoComentarios);
         A9resultadoUserId = T00013_A9resultadoUserId[0] ;
         n9resultadoUserId = T00013_n9resultadoUserId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
         A10resultadoTypeId = T00013_A10resultadoTypeId[0] ;
         n10resultadoTypeId = T00013_n10resultadoTypeId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
         A11resultadoIdNetUsuario = T00013_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = T00013_n11resultadoIdNetUsuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
         A12resultadoFechaCreado = T00013_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = T00013_n12resultadoFechaCreado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
         A13resultadoFechaEmision = T00013_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = T00013_n13resultadoFechaEmision[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
         A14resultadoPathExcel = T00013_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = T00013_n14resultadoPathExcel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14resultadoPathExcel", A14resultadoPathExcel);
         A15resultadoPathPdf = T00013_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = T00013_n15resultadoPathPdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15resultadoPathPdf", A15resultadoPathPdf);
         A16resultadoPathCsv = T00013_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = T00013_n16resultadoPathCsv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16resultadoPathCsv", A16resultadoPathCsv);
         A17resultadoIdEstado = T00013_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = T00013_n17resultadoIdEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
         A18resultadoIdLibro = T00013_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = T00013_n18resultadoIdLibro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
         A166resultadoIdNetTipoinforme = T00013_A166resultadoIdNetTipoinforme[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
         A19resultadoEliminado = T00013_A19resultadoEliminado[0] ;
         n19resultadoEliminado = T00013_n19resultadoEliminado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
         A20resultadoAbonado = T00013_A20resultadoAbonado[0] ;
         n20resultadoAbonado = T00013_n20resultadoAbonado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
         Z1resultadoId = A1resultadoId ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00016 */
      pr_default.execute(4, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00016_A1resultadoId[0] < A1resultadoId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00016_A1resultadoId[0] > A1resultadoId ) ) )
         {
            A1resultadoId = T00016_A1resultadoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00017 */
      pr_default.execute(5, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00017_A1resultadoId[0] > A1resultadoId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00017_A1resultadoId[0] < A1resultadoId ) ) )
         {
            A1resultadoId = T00017_A1resultadoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtresultadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert011( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1resultadoId != Z1resultadoId )
            {
               A1resultadoId = Z1resultadoId ;
               httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RESULTADOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtresultadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtresultadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update011( ) ;
               GX_FocusControl = edtresultadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A1resultadoId != Z1resultadoId )
            {
               /* Insert record */
               GX_FocusControl = edtresultadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert011( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RESULTADOID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtresultadoId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtresultadoId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert011( ) ;
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
      if ( A1resultadoId != Z1resultadoId )
      {
         A1resultadoId = Z1resultadoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RESULTADOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtresultadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtresultadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00012 */
         pr_default.execute(0, new Object[] {Long.valueOf(A1resultadoId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Resultado"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z7resultadoFicha != T00012_A7resultadoFicha[0] ) || ( GXutil.strcmp(Z8resultadoComentarios, T00012_A8resultadoComentarios[0]) != 0 ) || ( Z9resultadoUserId != T00012_A9resultadoUserId[0] ) || ( Z10resultadoTypeId != T00012_A10resultadoTypeId[0] ) || ( Z11resultadoIdNetUsuario != T00012_A11resultadoIdNetUsuario[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z12resultadoFechaCreado), GXutil.resetTime(T00012_A12resultadoFechaCreado[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z13resultadoFechaEmision), GXutil.resetTime(T00012_A13resultadoFechaEmision[0])) ) || ( GXutil.strcmp(Z14resultadoPathExcel, T00012_A14resultadoPathExcel[0]) != 0 ) || ( GXutil.strcmp(Z15resultadoPathPdf, T00012_A15resultadoPathPdf[0]) != 0 ) || ( GXutil.strcmp(Z16resultadoPathCsv, T00012_A16resultadoPathCsv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z17resultadoIdEstado != T00012_A17resultadoIdEstado[0] ) || ( Z18resultadoIdLibro != T00012_A18resultadoIdLibro[0] ) || ( Z166resultadoIdNetTipoinforme != T00012_A166resultadoIdNetTipoinforme[0] ) || ( Z19resultadoEliminado != T00012_A19resultadoEliminado[0] ) || ( Z20resultadoAbonado != T00012_A20resultadoAbonado[0] ) )
         {
            if ( Z7resultadoFicha != T00012_A7resultadoFicha[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoFicha");
               GXutil.writeLogRaw("Old: ",Z7resultadoFicha);
               GXutil.writeLogRaw("Current: ",T00012_A7resultadoFicha[0]);
            }
            if ( GXutil.strcmp(Z8resultadoComentarios, T00012_A8resultadoComentarios[0]) != 0 )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoComentarios");
               GXutil.writeLogRaw("Old: ",Z8resultadoComentarios);
               GXutil.writeLogRaw("Current: ",T00012_A8resultadoComentarios[0]);
            }
            if ( Z9resultadoUserId != T00012_A9resultadoUserId[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoUserId");
               GXutil.writeLogRaw("Old: ",Z9resultadoUserId);
               GXutil.writeLogRaw("Current: ",T00012_A9resultadoUserId[0]);
            }
            if ( Z10resultadoTypeId != T00012_A10resultadoTypeId[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoTypeId");
               GXutil.writeLogRaw("Old: ",Z10resultadoTypeId);
               GXutil.writeLogRaw("Current: ",T00012_A10resultadoTypeId[0]);
            }
            if ( Z11resultadoIdNetUsuario != T00012_A11resultadoIdNetUsuario[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoIdNetUsuario");
               GXutil.writeLogRaw("Old: ",Z11resultadoIdNetUsuario);
               GXutil.writeLogRaw("Current: ",T00012_A11resultadoIdNetUsuario[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12resultadoFechaCreado), GXutil.resetTime(T00012_A12resultadoFechaCreado[0])) ) )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoFechaCreado");
               GXutil.writeLogRaw("Old: ",Z12resultadoFechaCreado);
               GXutil.writeLogRaw("Current: ",T00012_A12resultadoFechaCreado[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13resultadoFechaEmision), GXutil.resetTime(T00012_A13resultadoFechaEmision[0])) ) )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoFechaEmision");
               GXutil.writeLogRaw("Old: ",Z13resultadoFechaEmision);
               GXutil.writeLogRaw("Current: ",T00012_A13resultadoFechaEmision[0]);
            }
            if ( GXutil.strcmp(Z14resultadoPathExcel, T00012_A14resultadoPathExcel[0]) != 0 )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoPathExcel");
               GXutil.writeLogRaw("Old: ",Z14resultadoPathExcel);
               GXutil.writeLogRaw("Current: ",T00012_A14resultadoPathExcel[0]);
            }
            if ( GXutil.strcmp(Z15resultadoPathPdf, T00012_A15resultadoPathPdf[0]) != 0 )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoPathPdf");
               GXutil.writeLogRaw("Old: ",Z15resultadoPathPdf);
               GXutil.writeLogRaw("Current: ",T00012_A15resultadoPathPdf[0]);
            }
            if ( GXutil.strcmp(Z16resultadoPathCsv, T00012_A16resultadoPathCsv[0]) != 0 )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoPathCsv");
               GXutil.writeLogRaw("Old: ",Z16resultadoPathCsv);
               GXutil.writeLogRaw("Current: ",T00012_A16resultadoPathCsv[0]);
            }
            if ( Z17resultadoIdEstado != T00012_A17resultadoIdEstado[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoIdEstado");
               GXutil.writeLogRaw("Old: ",Z17resultadoIdEstado);
               GXutil.writeLogRaw("Current: ",T00012_A17resultadoIdEstado[0]);
            }
            if ( Z18resultadoIdLibro != T00012_A18resultadoIdLibro[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoIdLibro");
               GXutil.writeLogRaw("Old: ",Z18resultadoIdLibro);
               GXutil.writeLogRaw("Current: ",T00012_A18resultadoIdLibro[0]);
            }
            if ( Z166resultadoIdNetTipoinforme != T00012_A166resultadoIdNetTipoinforme[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoIdNetTipoinforme");
               GXutil.writeLogRaw("Old: ",Z166resultadoIdNetTipoinforme);
               GXutil.writeLogRaw("Current: ",T00012_A166resultadoIdNetTipoinforme[0]);
            }
            if ( Z19resultadoEliminado != T00012_A19resultadoEliminado[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoEliminado");
               GXutil.writeLogRaw("Old: ",Z19resultadoEliminado);
               GXutil.writeLogRaw("Current: ",T00012_A19resultadoEliminado[0]);
            }
            if ( Z20resultadoAbonado != T00012_A20resultadoAbonado[0] )
            {
               GXutil.writeLogln("resultado:[seudo value changed for attri]"+"resultadoAbonado");
               GXutil.writeLogRaw("Old: ",Z20resultadoAbonado);
               GXutil.writeLogRaw("Current: ",T00012_A20resultadoAbonado[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Resultado"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00018 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A1resultadoId), Boolean.valueOf(n7resultadoFicha), Long.valueOf(A7resultadoFicha), Boolean.valueOf(n8resultadoComentarios), A8resultadoComentarios, Boolean.valueOf(n9resultadoUserId), Long.valueOf(A9resultadoUserId), Boolean.valueOf(n10resultadoTypeId), Long.valueOf(A10resultadoTypeId), Boolean.valueOf(n11resultadoIdNetUsuario), Long.valueOf(A11resultadoIdNetUsuario), Boolean.valueOf(n12resultadoFechaCreado), A12resultadoFechaCreado, Boolean.valueOf(n13resultadoFechaEmision), A13resultadoFechaEmision, Boolean.valueOf(n14resultadoPathExcel), A14resultadoPathExcel, Boolean.valueOf(n15resultadoPathPdf), A15resultadoPathPdf, Boolean.valueOf(n16resultadoPathCsv), A16resultadoPathCsv, Boolean.valueOf(n17resultadoIdEstado), Long.valueOf(A17resultadoIdEstado), Boolean.valueOf(n18resultadoIdLibro), Long.valueOf(A18resultadoIdLibro), Long.valueOf(A166resultadoIdNetTipoinforme), Boolean.valueOf(n19resultadoEliminado), Byte.valueOf(A19resultadoEliminado), Boolean.valueOf(n20resultadoAbonado), Long.valueOf(A20resultadoAbonado)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
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
                        resetCaption010( ) ;
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
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00019 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n7resultadoFicha), Long.valueOf(A7resultadoFicha), Boolean.valueOf(n8resultadoComentarios), A8resultadoComentarios, Boolean.valueOf(n9resultadoUserId), Long.valueOf(A9resultadoUserId), Boolean.valueOf(n10resultadoTypeId), Long.valueOf(A10resultadoTypeId), Boolean.valueOf(n11resultadoIdNetUsuario), Long.valueOf(A11resultadoIdNetUsuario), Boolean.valueOf(n12resultadoFechaCreado), A12resultadoFechaCreado, Boolean.valueOf(n13resultadoFechaEmision), A13resultadoFechaEmision, Boolean.valueOf(n14resultadoPathExcel), A14resultadoPathExcel, Boolean.valueOf(n15resultadoPathPdf), A15resultadoPathPdf, Boolean.valueOf(n16resultadoPathCsv), A16resultadoPathCsv, Boolean.valueOf(n17resultadoIdEstado), Long.valueOf(A17resultadoIdEstado), Boolean.valueOf(n18resultadoIdLibro), Long.valueOf(A18resultadoIdLibro), Long.valueOf(A166resultadoIdNetTipoinforme), Boolean.valueOf(n19resultadoEliminado), Byte.valueOf(A19resultadoEliminado), Boolean.valueOf(n20resultadoAbonado), Long.valueOf(A20resultadoAbonado), Long.valueOf(A1resultadoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Resultado"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000110 */
               pr_default.execute(8, new Object[] {Long.valueOf(A1resultadoId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel011( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "Resultado" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
   }

   public void endLevel011( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "resultado");
         if ( AnyError == 0 )
         {
            confirmValues010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "resultado");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart011( )
   {
      /* Scan By routine */
      /* Using cursor T000111 */
      pr_default.execute(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1resultadoId = T000111_A1resultadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1resultadoId = T000111_A1resultadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      }
   }

   public void scanEnd011( )
   {
      pr_default.close(9);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
      edtresultadoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoId_Enabled), 5, 0), true);
      edtresultadoFicha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoFicha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoFicha_Enabled), 5, 0), true);
      edtresultadoComentarios_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoComentarios_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoComentarios_Enabled), 5, 0), true);
      edtresultadoUserId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoUserId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoUserId_Enabled), 5, 0), true);
      edtresultadoTypeId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoTypeId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoTypeId_Enabled), 5, 0), true);
      edtresultadoIdNetUsuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoIdNetUsuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoIdNetUsuario_Enabled), 5, 0), true);
      edtresultadoFechaCreado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoFechaCreado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoFechaCreado_Enabled), 5, 0), true);
      edtresultadoFechaEmision_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoFechaEmision_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoFechaEmision_Enabled), 5, 0), true);
      edtresultadoPathExcel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoPathExcel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoPathExcel_Enabled), 5, 0), true);
      edtresultadoPathPdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoPathPdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoPathPdf_Enabled), 5, 0), true);
      edtresultadoPathCsv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoPathCsv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoPathCsv_Enabled), 5, 0), true);
      edtresultadoIdEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoIdEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoIdEstado_Enabled), 5, 0), true);
      edtresultadoIdLibro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoIdLibro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoIdLibro_Enabled), 5, 0), true);
      edtresultadoIdNetTipoinforme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoIdNetTipoinforme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoIdNetTipoinforme_Enabled), 5, 0), true);
      edtresultadoEliminado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoEliminado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoEliminado_Enabled), 5, 0), true);
      edtresultadoAbonado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtresultadoAbonado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtresultadoAbonado_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes011( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues010( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202312614563730", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.resultado", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11resultadoId,18,0))}, new String[] {"Gx_mode","resultadoId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Resultado");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("resultado:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z1resultadoId", GXutil.ltrim( localUtil.ntoc( Z1resultadoId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z7resultadoFicha", GXutil.ltrim( localUtil.ntoc( Z7resultadoFicha, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z8resultadoComentarios", Z8resultadoComentarios);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z9resultadoUserId", GXutil.ltrim( localUtil.ntoc( Z9resultadoUserId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z10resultadoTypeId", GXutil.ltrim( localUtil.ntoc( Z10resultadoTypeId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z11resultadoIdNetUsuario", GXutil.ltrim( localUtil.ntoc( Z11resultadoIdNetUsuario, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z12resultadoFechaCreado", localUtil.dtoc( Z12resultadoFechaCreado, 0, "/"));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z13resultadoFechaEmision", localUtil.dtoc( Z13resultadoFechaEmision, 0, "/"));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z14resultadoPathExcel", Z14resultadoPathExcel);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z15resultadoPathPdf", Z15resultadoPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z16resultadoPathCsv", Z16resultadoPathCsv);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z17resultadoIdEstado", GXutil.ltrim( localUtil.ntoc( Z17resultadoIdEstado, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z18resultadoIdLibro", GXutil.ltrim( localUtil.ntoc( Z18resultadoIdLibro, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z166resultadoIdNetTipoinforme", GXutil.ltrim( localUtil.ntoc( Z166resultadoIdNetTipoinforme, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z19resultadoEliminado", GXutil.ltrim( localUtil.ntoc( Z19resultadoEliminado, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "Z20resultadoAbonado", GXutil.ltrim( localUtil.ntoc( Z20resultadoAbonado, (byte)(18), (byte)(0), ".", "")));
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vRESULTADOID", GXutil.ltrim( localUtil.ntoc( AV11resultadoId, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRESULTADOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11resultadoId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV12Pgmname));
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
      return formatLink("com.colaveco.resultado", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11resultadoId,18,0))}, new String[] {"Gx_mode","resultadoId"})  ;
   }

   public String getPgmname( )
   {
      return "Resultado" ;
   }

   public String getPgmdesc( )
   {
      return "Resultado" ;
   }

   public void initializeNonKey011( )
   {
      A7resultadoFicha = 0 ;
      n7resultadoFicha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7resultadoFicha), 18, 0));
      n7resultadoFicha = ((0==A7resultadoFicha) ? true : false) ;
      A8resultadoComentarios = "" ;
      n8resultadoComentarios = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8resultadoComentarios", A8resultadoComentarios);
      n8resultadoComentarios = ((GXutil.strcmp("", A8resultadoComentarios)==0) ? true : false) ;
      A9resultadoUserId = 0 ;
      n9resultadoUserId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9resultadoUserId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9resultadoUserId), 18, 0));
      n9resultadoUserId = ((0==A9resultadoUserId) ? true : false) ;
      A10resultadoTypeId = 0 ;
      n10resultadoTypeId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10resultadoTypeId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10resultadoTypeId), 18, 0));
      n10resultadoTypeId = ((0==A10resultadoTypeId) ? true : false) ;
      A11resultadoIdNetUsuario = 0 ;
      n11resultadoIdNetUsuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11resultadoIdNetUsuario", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11resultadoIdNetUsuario), 18, 0));
      n11resultadoIdNetUsuario = ((0==A11resultadoIdNetUsuario) ? true : false) ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      n12resultadoFechaCreado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12resultadoFechaCreado", localUtil.format(A12resultadoFechaCreado, "99/99/99"));
      n12resultadoFechaCreado = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12resultadoFechaCreado)) ? true : false) ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      n13resultadoFechaEmision = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13resultadoFechaEmision", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
      n13resultadoFechaEmision = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13resultadoFechaEmision)) ? true : false) ;
      A14resultadoPathExcel = "" ;
      n14resultadoPathExcel = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14resultadoPathExcel", A14resultadoPathExcel);
      n14resultadoPathExcel = ((GXutil.strcmp("", A14resultadoPathExcel)==0) ? true : false) ;
      A15resultadoPathPdf = "" ;
      n15resultadoPathPdf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A15resultadoPathPdf", A15resultadoPathPdf);
      n15resultadoPathPdf = ((GXutil.strcmp("", A15resultadoPathPdf)==0) ? true : false) ;
      A16resultadoPathCsv = "" ;
      n16resultadoPathCsv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A16resultadoPathCsv", A16resultadoPathCsv);
      n16resultadoPathCsv = ((GXutil.strcmp("", A16resultadoPathCsv)==0) ? true : false) ;
      A17resultadoIdEstado = 0 ;
      n17resultadoIdEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A17resultadoIdEstado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17resultadoIdEstado), 18, 0));
      n17resultadoIdEstado = ((0==A17resultadoIdEstado) ? true : false) ;
      A18resultadoIdLibro = 0 ;
      n18resultadoIdLibro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18resultadoIdLibro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18resultadoIdLibro), 18, 0));
      n18resultadoIdLibro = ((0==A18resultadoIdLibro) ? true : false) ;
      A166resultadoIdNetTipoinforme = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A166resultadoIdNetTipoinforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(A166resultadoIdNetTipoinforme), 18, 0));
      A19resultadoEliminado = (byte)(0) ;
      n19resultadoEliminado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A19resultadoEliminado", GXutil.str( A19resultadoEliminado, 1, 0));
      n19resultadoEliminado = ((0==A19resultadoEliminado) ? true : false) ;
      A20resultadoAbonado = 0 ;
      n20resultadoAbonado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A20resultadoAbonado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20resultadoAbonado), 18, 0));
      n20resultadoAbonado = ((0==A20resultadoAbonado) ? true : false) ;
      Z7resultadoFicha = 0 ;
      Z8resultadoComentarios = "" ;
      Z9resultadoUserId = 0 ;
      Z10resultadoTypeId = 0 ;
      Z11resultadoIdNetUsuario = 0 ;
      Z12resultadoFechaCreado = GXutil.nullDate() ;
      Z13resultadoFechaEmision = GXutil.nullDate() ;
      Z14resultadoPathExcel = "" ;
      Z15resultadoPathPdf = "" ;
      Z16resultadoPathCsv = "" ;
      Z17resultadoIdEstado = 0 ;
      Z18resultadoIdLibro = 0 ;
      Z166resultadoIdNetTipoinforme = 0 ;
      Z19resultadoEliminado = (byte)(0) ;
      Z20resultadoAbonado = 0 ;
   }

   public void initAll011( )
   {
      A1resultadoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1resultadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1resultadoId), 18, 0));
      initializeNonKey011( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202312614563763", true, true);
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
      httpContext.AddJavascriptSource("resultado.js", "?202312614563764", false, true);
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
      edtresultadoId_Internalname = "RESULTADOID" ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA" ;
      edtresultadoComentarios_Internalname = "RESULTADOCOMENTARIOS" ;
      edtresultadoUserId_Internalname = "RESULTADOUSERID" ;
      edtresultadoTypeId_Internalname = "RESULTADOTYPEID" ;
      edtresultadoIdNetUsuario_Internalname = "RESULTADOIDNETUSUARIO" ;
      edtresultadoFechaCreado_Internalname = "RESULTADOFECHACREADO" ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION" ;
      edtresultadoPathExcel_Internalname = "RESULTADOPATHEXCEL" ;
      edtresultadoPathPdf_Internalname = "RESULTADOPATHPDF" ;
      edtresultadoPathCsv_Internalname = "RESULTADOPATHCSV" ;
      edtresultadoIdEstado_Internalname = "RESULTADOIDESTADO" ;
      edtresultadoIdLibro_Internalname = "RESULTADOIDLIBRO" ;
      edtresultadoIdNetTipoinforme_Internalname = "RESULTADOIDNETTIPOINFORME" ;
      edtresultadoEliminado_Internalname = "RESULTADOELIMINADO" ;
      edtresultadoAbonado_Internalname = "RESULTADOABONADO" ;
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
      Form.setCaption( "Resultado" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtresultadoAbonado_Jsonclick = "" ;
      edtresultadoAbonado_Enabled = 1 ;
      edtresultadoEliminado_Jsonclick = "" ;
      edtresultadoEliminado_Enabled = 1 ;
      edtresultadoIdNetTipoinforme_Jsonclick = "" ;
      edtresultadoIdNetTipoinforme_Enabled = 1 ;
      edtresultadoIdLibro_Jsonclick = "" ;
      edtresultadoIdLibro_Enabled = 1 ;
      edtresultadoIdEstado_Jsonclick = "" ;
      edtresultadoIdEstado_Enabled = 1 ;
      edtresultadoPathCsv_Enabled = 1 ;
      edtresultadoPathPdf_Enabled = 1 ;
      edtresultadoPathExcel_Enabled = 1 ;
      edtresultadoFechaEmision_Jsonclick = "" ;
      edtresultadoFechaEmision_Enabled = 1 ;
      edtresultadoFechaCreado_Jsonclick = "" ;
      edtresultadoFechaCreado_Enabled = 1 ;
      edtresultadoIdNetUsuario_Jsonclick = "" ;
      edtresultadoIdNetUsuario_Enabled = 1 ;
      edtresultadoTypeId_Jsonclick = "" ;
      edtresultadoTypeId_Enabled = 1 ;
      edtresultadoUserId_Jsonclick = "" ;
      edtresultadoUserId_Enabled = 1 ;
      edtresultadoComentarios_Jsonclick = "" ;
      edtresultadoComentarios_Enabled = 1 ;
      edtresultadoFicha_Jsonclick = "" ;
      edtresultadoFicha_Enabled = 1 ;
      edtresultadoId_Jsonclick = "" ;
      edtresultadoId_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11resultadoId',fld:'vRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV11resultadoId',fld:'vRESULTADOID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12012',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_RESULTADOID","{handler:'valid_Resultadoid',iparms:[]");
      setEventMetadata("VALID_RESULTADOID",",oparms:[]}");
      setEventMetadata("VALID_RESULTADOFECHACREADO","{handler:'valid_Resultadofechacreado',iparms:[]");
      setEventMetadata("VALID_RESULTADOFECHACREADO",",oparms:[]}");
      setEventMetadata("VALID_RESULTADOFECHAEMISION","{handler:'valid_Resultadofechaemision',iparms:[]");
      setEventMetadata("VALID_RESULTADOFECHAEMISION",",oparms:[]}");
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
      Z8resultadoComentarios = "" ;
      Z12resultadoFechaCreado = GXutil.nullDate() ;
      Z13resultadoFechaEmision = GXutil.nullDate() ;
      Z14resultadoPathExcel = "" ;
      Z15resultadoPathPdf = "" ;
      Z16resultadoPathCsv = "" ;
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
      A8resultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV12Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T00014_A1resultadoId = new long[1] ;
      T00014_A7resultadoFicha = new long[1] ;
      T00014_n7resultadoFicha = new boolean[] {false} ;
      T00014_A8resultadoComentarios = new String[] {""} ;
      T00014_n8resultadoComentarios = new boolean[] {false} ;
      T00014_A9resultadoUserId = new long[1] ;
      T00014_n9resultadoUserId = new boolean[] {false} ;
      T00014_A10resultadoTypeId = new long[1] ;
      T00014_n10resultadoTypeId = new boolean[] {false} ;
      T00014_A11resultadoIdNetUsuario = new long[1] ;
      T00014_n11resultadoIdNetUsuario = new boolean[] {false} ;
      T00014_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_n12resultadoFechaCreado = new boolean[] {false} ;
      T00014_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_n13resultadoFechaEmision = new boolean[] {false} ;
      T00014_A14resultadoPathExcel = new String[] {""} ;
      T00014_n14resultadoPathExcel = new boolean[] {false} ;
      T00014_A15resultadoPathPdf = new String[] {""} ;
      T00014_n15resultadoPathPdf = new boolean[] {false} ;
      T00014_A16resultadoPathCsv = new String[] {""} ;
      T00014_n16resultadoPathCsv = new boolean[] {false} ;
      T00014_A17resultadoIdEstado = new long[1] ;
      T00014_n17resultadoIdEstado = new boolean[] {false} ;
      T00014_A18resultadoIdLibro = new long[1] ;
      T00014_n18resultadoIdLibro = new boolean[] {false} ;
      T00014_A166resultadoIdNetTipoinforme = new long[1] ;
      T00014_A19resultadoEliminado = new byte[1] ;
      T00014_n19resultadoEliminado = new boolean[] {false} ;
      T00014_A20resultadoAbonado = new long[1] ;
      T00014_n20resultadoAbonado = new boolean[] {false} ;
      T00015_A1resultadoId = new long[1] ;
      T00013_A1resultadoId = new long[1] ;
      T00013_A7resultadoFicha = new long[1] ;
      T00013_n7resultadoFicha = new boolean[] {false} ;
      T00013_A8resultadoComentarios = new String[] {""} ;
      T00013_n8resultadoComentarios = new boolean[] {false} ;
      T00013_A9resultadoUserId = new long[1] ;
      T00013_n9resultadoUserId = new boolean[] {false} ;
      T00013_A10resultadoTypeId = new long[1] ;
      T00013_n10resultadoTypeId = new boolean[] {false} ;
      T00013_A11resultadoIdNetUsuario = new long[1] ;
      T00013_n11resultadoIdNetUsuario = new boolean[] {false} ;
      T00013_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_n12resultadoFechaCreado = new boolean[] {false} ;
      T00013_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_n13resultadoFechaEmision = new boolean[] {false} ;
      T00013_A14resultadoPathExcel = new String[] {""} ;
      T00013_n14resultadoPathExcel = new boolean[] {false} ;
      T00013_A15resultadoPathPdf = new String[] {""} ;
      T00013_n15resultadoPathPdf = new boolean[] {false} ;
      T00013_A16resultadoPathCsv = new String[] {""} ;
      T00013_n16resultadoPathCsv = new boolean[] {false} ;
      T00013_A17resultadoIdEstado = new long[1] ;
      T00013_n17resultadoIdEstado = new boolean[] {false} ;
      T00013_A18resultadoIdLibro = new long[1] ;
      T00013_n18resultadoIdLibro = new boolean[] {false} ;
      T00013_A166resultadoIdNetTipoinforme = new long[1] ;
      T00013_A19resultadoEliminado = new byte[1] ;
      T00013_n19resultadoEliminado = new boolean[] {false} ;
      T00013_A20resultadoAbonado = new long[1] ;
      T00013_n20resultadoAbonado = new boolean[] {false} ;
      T00016_A1resultadoId = new long[1] ;
      T00017_A1resultadoId = new long[1] ;
      T00012_A1resultadoId = new long[1] ;
      T00012_A7resultadoFicha = new long[1] ;
      T00012_n7resultadoFicha = new boolean[] {false} ;
      T00012_A8resultadoComentarios = new String[] {""} ;
      T00012_n8resultadoComentarios = new boolean[] {false} ;
      T00012_A9resultadoUserId = new long[1] ;
      T00012_n9resultadoUserId = new boolean[] {false} ;
      T00012_A10resultadoTypeId = new long[1] ;
      T00012_n10resultadoTypeId = new boolean[] {false} ;
      T00012_A11resultadoIdNetUsuario = new long[1] ;
      T00012_n11resultadoIdNetUsuario = new boolean[] {false} ;
      T00012_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_n12resultadoFechaCreado = new boolean[] {false} ;
      T00012_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_n13resultadoFechaEmision = new boolean[] {false} ;
      T00012_A14resultadoPathExcel = new String[] {""} ;
      T00012_n14resultadoPathExcel = new boolean[] {false} ;
      T00012_A15resultadoPathPdf = new String[] {""} ;
      T00012_n15resultadoPathPdf = new boolean[] {false} ;
      T00012_A16resultadoPathCsv = new String[] {""} ;
      T00012_n16resultadoPathCsv = new boolean[] {false} ;
      T00012_A17resultadoIdEstado = new long[1] ;
      T00012_n17resultadoIdEstado = new boolean[] {false} ;
      T00012_A18resultadoIdLibro = new long[1] ;
      T00012_n18resultadoIdLibro = new boolean[] {false} ;
      T00012_A166resultadoIdNetTipoinforme = new long[1] ;
      T00012_A19resultadoEliminado = new byte[1] ;
      T00012_n19resultadoEliminado = new boolean[] {false} ;
      T00012_A20resultadoAbonado = new long[1] ;
      T00012_n20resultadoAbonado = new boolean[] {false} ;
      T000111_A1resultadoId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultado__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultado__default(),
         new Object[] {
             new Object[] {
            T00012_A1resultadoId, T00012_A7resultadoFicha, T00012_n7resultadoFicha, T00012_A8resultadoComentarios, T00012_n8resultadoComentarios, T00012_A9resultadoUserId, T00012_n9resultadoUserId, T00012_A10resultadoTypeId, T00012_n10resultadoTypeId, T00012_A11resultadoIdNetUsuario,
            T00012_n11resultadoIdNetUsuario, T00012_A12resultadoFechaCreado, T00012_n12resultadoFechaCreado, T00012_A13resultadoFechaEmision, T00012_n13resultadoFechaEmision, T00012_A14resultadoPathExcel, T00012_n14resultadoPathExcel, T00012_A15resultadoPathPdf, T00012_n15resultadoPathPdf, T00012_A16resultadoPathCsv,
            T00012_n16resultadoPathCsv, T00012_A17resultadoIdEstado, T00012_n17resultadoIdEstado, T00012_A18resultadoIdLibro, T00012_n18resultadoIdLibro, T00012_A166resultadoIdNetTipoinforme, T00012_A19resultadoEliminado, T00012_n19resultadoEliminado, T00012_A20resultadoAbonado, T00012_n20resultadoAbonado
            }
            , new Object[] {
            T00013_A1resultadoId, T00013_A7resultadoFicha, T00013_n7resultadoFicha, T00013_A8resultadoComentarios, T00013_n8resultadoComentarios, T00013_A9resultadoUserId, T00013_n9resultadoUserId, T00013_A10resultadoTypeId, T00013_n10resultadoTypeId, T00013_A11resultadoIdNetUsuario,
            T00013_n11resultadoIdNetUsuario, T00013_A12resultadoFechaCreado, T00013_n12resultadoFechaCreado, T00013_A13resultadoFechaEmision, T00013_n13resultadoFechaEmision, T00013_A14resultadoPathExcel, T00013_n14resultadoPathExcel, T00013_A15resultadoPathPdf, T00013_n15resultadoPathPdf, T00013_A16resultadoPathCsv,
            T00013_n16resultadoPathCsv, T00013_A17resultadoIdEstado, T00013_n17resultadoIdEstado, T00013_A18resultadoIdLibro, T00013_n18resultadoIdLibro, T00013_A166resultadoIdNetTipoinforme, T00013_A19resultadoEliminado, T00013_n19resultadoEliminado, T00013_A20resultadoAbonado, T00013_n20resultadoAbonado
            }
            , new Object[] {
            T00014_A1resultadoId, T00014_A7resultadoFicha, T00014_n7resultadoFicha, T00014_A8resultadoComentarios, T00014_n8resultadoComentarios, T00014_A9resultadoUserId, T00014_n9resultadoUserId, T00014_A10resultadoTypeId, T00014_n10resultadoTypeId, T00014_A11resultadoIdNetUsuario,
            T00014_n11resultadoIdNetUsuario, T00014_A12resultadoFechaCreado, T00014_n12resultadoFechaCreado, T00014_A13resultadoFechaEmision, T00014_n13resultadoFechaEmision, T00014_A14resultadoPathExcel, T00014_n14resultadoPathExcel, T00014_A15resultadoPathPdf, T00014_n15resultadoPathPdf, T00014_A16resultadoPathCsv,
            T00014_n16resultadoPathCsv, T00014_A17resultadoIdEstado, T00014_n17resultadoIdEstado, T00014_A18resultadoIdLibro, T00014_n18resultadoIdLibro, T00014_A166resultadoIdNetTipoinforme, T00014_A19resultadoEliminado, T00014_n19resultadoEliminado, T00014_A20resultadoAbonado, T00014_n20resultadoAbonado
            }
            , new Object[] {
            T00015_A1resultadoId
            }
            , new Object[] {
            T00016_A1resultadoId
            }
            , new Object[] {
            T00017_A1resultadoId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000111_A1resultadoId
            }
         }
      );
      AV12Pgmname = "Resultado" ;
   }

   private byte Z19resultadoEliminado ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A19resultadoEliminado ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1 ;
   private short nIsDirty_1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtresultadoId_Enabled ;
   private int edtresultadoFicha_Enabled ;
   private int edtresultadoComentarios_Enabled ;
   private int edtresultadoUserId_Enabled ;
   private int edtresultadoTypeId_Enabled ;
   private int edtresultadoIdNetUsuario_Enabled ;
   private int edtresultadoFechaCreado_Enabled ;
   private int edtresultadoFechaEmision_Enabled ;
   private int edtresultadoPathExcel_Enabled ;
   private int edtresultadoPathPdf_Enabled ;
   private int edtresultadoPathCsv_Enabled ;
   private int edtresultadoIdEstado_Enabled ;
   private int edtresultadoIdLibro_Enabled ;
   private int edtresultadoIdNetTipoinforme_Enabled ;
   private int edtresultadoEliminado_Enabled ;
   private int edtresultadoAbonado_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV11resultadoId ;
   private long Z1resultadoId ;
   private long Z7resultadoFicha ;
   private long Z9resultadoUserId ;
   private long Z10resultadoTypeId ;
   private long Z11resultadoIdNetUsuario ;
   private long Z17resultadoIdEstado ;
   private long Z18resultadoIdLibro ;
   private long Z166resultadoIdNetTipoinforme ;
   private long Z20resultadoAbonado ;
   private long AV11resultadoId ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A166resultadoIdNetTipoinforme ;
   private long A20resultadoAbonado ;
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
   private String edtresultadoId_Internalname ;
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
   private String edtresultadoId_Jsonclick ;
   private String edtresultadoFicha_Internalname ;
   private String edtresultadoFicha_Jsonclick ;
   private String edtresultadoComentarios_Internalname ;
   private String edtresultadoComentarios_Jsonclick ;
   private String edtresultadoUserId_Internalname ;
   private String edtresultadoUserId_Jsonclick ;
   private String edtresultadoTypeId_Internalname ;
   private String edtresultadoTypeId_Jsonclick ;
   private String edtresultadoIdNetUsuario_Internalname ;
   private String edtresultadoIdNetUsuario_Jsonclick ;
   private String edtresultadoFechaCreado_Internalname ;
   private String edtresultadoFechaCreado_Jsonclick ;
   private String edtresultadoFechaEmision_Internalname ;
   private String edtresultadoFechaEmision_Jsonclick ;
   private String edtresultadoPathExcel_Internalname ;
   private String edtresultadoPathPdf_Internalname ;
   private String edtresultadoPathCsv_Internalname ;
   private String edtresultadoIdEstado_Internalname ;
   private String edtresultadoIdEstado_Jsonclick ;
   private String edtresultadoIdLibro_Internalname ;
   private String edtresultadoIdLibro_Jsonclick ;
   private String edtresultadoIdNetTipoinforme_Internalname ;
   private String edtresultadoIdNetTipoinforme_Jsonclick ;
   private String edtresultadoEliminado_Internalname ;
   private String edtresultadoEliminado_Jsonclick ;
   private String edtresultadoAbonado_Internalname ;
   private String edtresultadoAbonado_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV12Pgmname ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z12resultadoFechaCreado ;
   private java.util.Date Z13resultadoFechaEmision ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n7resultadoFicha ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n12resultadoFechaCreado ;
   private boolean n13resultadoFechaEmision ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean n17resultadoIdEstado ;
   private boolean n18resultadoIdLibro ;
   private boolean n19resultadoEliminado ;
   private boolean n20resultadoAbonado ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean Gx_longc ;
   private String Z8resultadoComentarios ;
   private String Z14resultadoPathExcel ;
   private String Z15resultadoPathPdf ;
   private String Z16resultadoPathCsv ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T00014_A1resultadoId ;
   private long[] T00014_A7resultadoFicha ;
   private boolean[] T00014_n7resultadoFicha ;
   private String[] T00014_A8resultadoComentarios ;
   private boolean[] T00014_n8resultadoComentarios ;
   private long[] T00014_A9resultadoUserId ;
   private boolean[] T00014_n9resultadoUserId ;
   private long[] T00014_A10resultadoTypeId ;
   private boolean[] T00014_n10resultadoTypeId ;
   private long[] T00014_A11resultadoIdNetUsuario ;
   private boolean[] T00014_n11resultadoIdNetUsuario ;
   private java.util.Date[] T00014_A12resultadoFechaCreado ;
   private boolean[] T00014_n12resultadoFechaCreado ;
   private java.util.Date[] T00014_A13resultadoFechaEmision ;
   private boolean[] T00014_n13resultadoFechaEmision ;
   private String[] T00014_A14resultadoPathExcel ;
   private boolean[] T00014_n14resultadoPathExcel ;
   private String[] T00014_A15resultadoPathPdf ;
   private boolean[] T00014_n15resultadoPathPdf ;
   private String[] T00014_A16resultadoPathCsv ;
   private boolean[] T00014_n16resultadoPathCsv ;
   private long[] T00014_A17resultadoIdEstado ;
   private boolean[] T00014_n17resultadoIdEstado ;
   private long[] T00014_A18resultadoIdLibro ;
   private boolean[] T00014_n18resultadoIdLibro ;
   private long[] T00014_A166resultadoIdNetTipoinforme ;
   private byte[] T00014_A19resultadoEliminado ;
   private boolean[] T00014_n19resultadoEliminado ;
   private long[] T00014_A20resultadoAbonado ;
   private boolean[] T00014_n20resultadoAbonado ;
   private long[] T00015_A1resultadoId ;
   private long[] T00013_A1resultadoId ;
   private long[] T00013_A7resultadoFicha ;
   private boolean[] T00013_n7resultadoFicha ;
   private String[] T00013_A8resultadoComentarios ;
   private boolean[] T00013_n8resultadoComentarios ;
   private long[] T00013_A9resultadoUserId ;
   private boolean[] T00013_n9resultadoUserId ;
   private long[] T00013_A10resultadoTypeId ;
   private boolean[] T00013_n10resultadoTypeId ;
   private long[] T00013_A11resultadoIdNetUsuario ;
   private boolean[] T00013_n11resultadoIdNetUsuario ;
   private java.util.Date[] T00013_A12resultadoFechaCreado ;
   private boolean[] T00013_n12resultadoFechaCreado ;
   private java.util.Date[] T00013_A13resultadoFechaEmision ;
   private boolean[] T00013_n13resultadoFechaEmision ;
   private String[] T00013_A14resultadoPathExcel ;
   private boolean[] T00013_n14resultadoPathExcel ;
   private String[] T00013_A15resultadoPathPdf ;
   private boolean[] T00013_n15resultadoPathPdf ;
   private String[] T00013_A16resultadoPathCsv ;
   private boolean[] T00013_n16resultadoPathCsv ;
   private long[] T00013_A17resultadoIdEstado ;
   private boolean[] T00013_n17resultadoIdEstado ;
   private long[] T00013_A18resultadoIdLibro ;
   private boolean[] T00013_n18resultadoIdLibro ;
   private long[] T00013_A166resultadoIdNetTipoinforme ;
   private byte[] T00013_A19resultadoEliminado ;
   private boolean[] T00013_n19resultadoEliminado ;
   private long[] T00013_A20resultadoAbonado ;
   private boolean[] T00013_n20resultadoAbonado ;
   private long[] T00016_A1resultadoId ;
   private long[] T00017_A1resultadoId ;
   private long[] T00012_A1resultadoId ;
   private long[] T00012_A7resultadoFicha ;
   private boolean[] T00012_n7resultadoFicha ;
   private String[] T00012_A8resultadoComentarios ;
   private boolean[] T00012_n8resultadoComentarios ;
   private long[] T00012_A9resultadoUserId ;
   private boolean[] T00012_n9resultadoUserId ;
   private long[] T00012_A10resultadoTypeId ;
   private boolean[] T00012_n10resultadoTypeId ;
   private long[] T00012_A11resultadoIdNetUsuario ;
   private boolean[] T00012_n11resultadoIdNetUsuario ;
   private java.util.Date[] T00012_A12resultadoFechaCreado ;
   private boolean[] T00012_n12resultadoFechaCreado ;
   private java.util.Date[] T00012_A13resultadoFechaEmision ;
   private boolean[] T00012_n13resultadoFechaEmision ;
   private String[] T00012_A14resultadoPathExcel ;
   private boolean[] T00012_n14resultadoPathExcel ;
   private String[] T00012_A15resultadoPathPdf ;
   private boolean[] T00012_n15resultadoPathPdf ;
   private String[] T00012_A16resultadoPathCsv ;
   private boolean[] T00012_n16resultadoPathCsv ;
   private long[] T00012_A17resultadoIdEstado ;
   private boolean[] T00012_n17resultadoIdEstado ;
   private long[] T00012_A18resultadoIdLibro ;
   private boolean[] T00012_n18resultadoIdLibro ;
   private long[] T00012_A166resultadoIdNetTipoinforme ;
   private byte[] T00012_A19resultadoEliminado ;
   private boolean[] T00012_n19resultadoEliminado ;
   private long[] T00012_A20resultadoAbonado ;
   private boolean[] T00012_n20resultadoAbonado ;
   private long[] T000111_A1resultadoId ;
   private IDataStoreProvider pr_gam ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class resultado__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class resultado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00012", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00013", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00014", "SELECT TM1.`resultadoId`, TM1.`resultadoFicha`, TM1.`resultadoComentarios`, TM1.`resultadoUserId`, TM1.`resultadoTypeId`, TM1.`resultadoIdNetUsuario`, TM1.`resultadoFechaCreado`, TM1.`resultadoFechaEmision`, TM1.`resultadoPathExcel`, TM1.`resultadoPathPdf`, TM1.`resultadoPathCsv`, TM1.`resultadoIdEstado`, TM1.`resultadoIdLibro`, TM1.`resultadoIdNetTipoinforme`, TM1.`resultadoEliminado`, TM1.`resultadoAbonado` FROM `Resultado` TM1 WHERE TM1.`resultadoId` = ? ORDER BY TM1.`resultadoId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00015", "SELECT `resultadoId` FROM `Resultado` WHERE `resultadoId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00016", "SELECT `resultadoId` FROM `Resultado` WHERE ( `resultadoId` > ?) ORDER BY `resultadoId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00017", "SELECT `resultadoId` FROM `Resultado` WHERE ( `resultadoId` < ?) ORDER BY `resultadoId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00018", "INSERT INTO `Resultado`(`resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00019", "UPDATE `Resultado` SET `resultadoFicha`=?, `resultadoComentarios`=?, `resultadoUserId`=?, `resultadoTypeId`=?, `resultadoIdNetUsuario`=?, `resultadoFechaCreado`=?, `resultadoFechaEmision`=?, `resultadoPathExcel`=?, `resultadoPathPdf`=?, `resultadoPathCsv`=?, `resultadoIdEstado`=?, `resultadoIdLibro`=?, `resultadoIdNetTipoinforme`=?, `resultadoEliminado`=?, `resultadoAbonado`=?  WHERE `resultadoId` = ?", GX_NOMASK)
         ,new UpdateCursor("T000110", "DELETE FROM `Resultado`  WHERE `resultadoId` = ?", GX_NOMASK)
         ,new ForEachCursor("T000111", "SELECT `resultadoId` FROM `Resultado` ORDER BY `resultadoId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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
                  stmt.setVarchar(3, (String)parms[4], 45);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[6]).longValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 500);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 500);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 500);
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
               stmt.setLong(14, ((Number) parms[25]).longValue());
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(16, ((Number) parms[29]).longValue());
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
                  stmt.setVarchar(2, (String)parms[3], 45);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[5]).longValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 500);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 500);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 500);
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
               stmt.setLong(13, ((Number) parms[24]).longValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[28]).longValue());
               }
               stmt.setLong(16, ((Number) parms[29]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

