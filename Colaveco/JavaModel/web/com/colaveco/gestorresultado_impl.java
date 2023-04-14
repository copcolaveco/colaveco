package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gestorresultado_impl extends GXDataArea
{
   public gestorresultado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gestorresultado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gestorresultado_impl.class ));
   }

   public gestorresultado_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipoinforme = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_27 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_27"))) ;
            nGXsfl_27_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_27_idx"))) ;
            sGXsfl_27_idx = httpContext.GetPar( "sGXsfl_27_idx") ;
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
            cmbavTipoinforme.fromJSonString( httpContext.GetNextPar( ));
            AV15TipoInforme = (short)(GXutil.lval( httpContext.GetPar( "TipoInforme"))) ;
            AV22resultadoFicha = GXutil.lval( httpContext.GetPar( "resultadoFicha")) ;
            AV29resultadoPathPdf = httpContext.GetPar( "resultadoPathPdf") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV15TipoInforme, AV22resultadoFicha, AV29resultadoPathPdf) ;
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

   public byte executeStartEvent( )
   {
      pa192( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start192( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20233517584146", false, true);
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.gestorresultado", new String[] {}, new String[] {}) +"\">") ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29resultadoPathPdf, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPOINFORME", GXutil.ltrim( localUtil.ntoc( AV15TipoInforme, (byte)(4), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vRESULTADOFICHA", GXutil.ltrim( localUtil.ntoc( AV22resultadoFicha, (byte)(18), (byte)(0), ".", "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_27", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_27, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDNETTIPOINFORME", GXutil.ltrim( localUtil.ntoc( A166resultadoIdNetTipoinforme, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDESTADO", GXutil.ltrim( localUtil.ntoc( A17resultadoIdEstado, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vRESULTADOPATHPDF", AV29resultadoPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29resultadoPathPdf, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vBLOBFILE_GXI", AV37Blobfile_GXI);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we192( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt192( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.colaveco.gestorresultado", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "GestorResultado" ;
   }

   public String getPgmdesc( )
   {
      return "Gestor Resultado" ;
   }

   public void wb190( )
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
         com.colaveco.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipoinforme.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, cmbavTipoinforme.getInternalname(), "Tipo Informe", "col-sm-3 ActionAttributeLabel", 1, true, "");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'" + sGXsfl_27_idx + "',0)\"" ;
         /* ComboBox */
         com.colaveco.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoinforme, cmbavTipoinforme.getInternalname(), GXutil.trim( GXutil.str( AV15TipoInforme, 4, 0)), 1, cmbavTipoinforme.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTipoinforme.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ActionAttribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,8);\"", "", true, (byte)(1), "HLP_GestorResultado.htm");
         cmbavTipoinforme.setValue( GXutil.trim( GXutil.str( AV15TipoInforme, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoinforme.getInternalname(), "Values", cmbavTipoinforme.ToJavascriptSource(), true);
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_11_192( true) ;
      }
      else
      {
         wb_table1_11_192( false) ;
      }
      return  ;
   }

   public void wb_table1_11_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_24_192( true) ;
      }
      else
      {
         wb_table2_24_192( false) ;
      }
      return  ;
   }

   public void wb_table2_24_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 27 )
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

   public void start192( )
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
         Form.getMeta().addItem("description", "Gestor Resultado", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup190( ) ;
   }

   public void ws192( )
   {
      start192( ) ;
      evt192( ) ;
   }

   public void evt192( )
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
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VEXCELIMAGEN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VEXCELIMAGEN.CLICK") == 0 ) )
                        {
                           nGXsfl_27_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_272( ) ;
                           AV7imagen = httpContext.cgiGet( edtavImagen_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavImagen_Internalname, "Bitmap", ((GXutil.strcmp("", AV7imagen)==0) ? AV33Imagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV7imagen))), !bGXsfl_27_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV7imagen), true);
                           A7resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") ;
                           n7resultadoFicha = false ;
                           A13resultadoFechaEmision = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtresultadoFechaEmision_Internalname), 0)) ;
                           n13resultadoFechaEmision = false ;
                           AV18resultadoTypeName = httpContext.cgiGet( edtavResultadotypename_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
                           AV9estado = httpContext.cgiGet( edtavEstado_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
                           AV20EXCELimagen = httpContext.cgiGet( edtavExcelimagen_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavExcelimagen_Internalname, "Bitmap", ((GXutil.strcmp("", AV20EXCELimagen)==0) ? AV35Excelimagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20EXCELimagen))), !bGXsfl_27_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavExcelimagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20EXCELimagen), true);
                           AV19PDFimagen = httpContext.cgiGet( edtavPdfimagen_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavPdfimagen_Internalname, "Bitmap", ((GXutil.strcmp("", AV19PDFimagen)==0) ? AV34Pdfimagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19PDFimagen))), !bGXsfl_27_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavPdfimagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19PDFimagen), true);
                           AV21CSVimagen = httpContext.cgiGet( edtavCsvimagen_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavCsvimagen_Internalname, "Bitmap", ((GXutil.strcmp("", AV21CSVimagen)==0) ? AV36Csvimagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV21CSVimagen))), !bGXsfl_27_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavCsvimagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV21CSVimagen), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e11192 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e12192 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXCELIMAGEN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e13192 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Tipoinforme Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTIPOINFORME"), ".", ",") != AV15TipoInforme )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Resultadoficha Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vRESULTADOFICHA"), ".", ",") != AV22resultadoFicha )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void we192( )
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

   public void pa192( )
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = cmbavTipoinforme.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_272( ) ;
      while ( nGXsfl_27_idx <= nRC_GXsfl_27 )
      {
         sendrow_272( ) ;
         nGXsfl_27_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( short AV15TipoInforme ,
                                  long AV22resultadoFicha ,
                                  String AV29resultadoPathPdf )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e11192 ();
      GRID1_nCurrentRecord = 0 ;
      rf192( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      if ( cmbavTipoinforme.getItemCount() > 0 )
      {
         AV15TipoInforme = (short)(GXutil.lval( cmbavTipoinforme.getValidValue(GXutil.trim( GXutil.str( AV15TipoInforme, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TipoInforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipoInforme), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipoinforme.setValue( GXutil.trim( GXutil.str( AV15TipoInforme, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoinforme.getInternalname(), "Values", cmbavTipoinforme.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf192( ) ;
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

   public void rf192( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(27) ;
      /* Execute user event: Refresh */
      e11192 ();
      nGXsfl_27_idx = 1 ;
      sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_272( ) ;
      bGXsfl_27_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "ViewGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_272( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV15TipoInforme) ,
                                              Long.valueOf(AV22resultadoFicha) ,
                                              Long.valueOf(A166resultadoIdNetTipoinforme) ,
                                              Long.valueOf(A7resultadoFicha) ,
                                              Long.valueOf(A11resultadoIdNetUsuario) ,
                                              Short.valueOf(AV6ExternalId) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                              }
         });
         /* Using cursor H00192 */
         pr_default.execute(0, new Object[] {Short.valueOf(AV6ExternalId), Short.valueOf(AV15TipoInforme), Long.valueOf(AV22resultadoFicha)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A11resultadoIdNetUsuario = H00192_A11resultadoIdNetUsuario[0] ;
            n11resultadoIdNetUsuario = H00192_n11resultadoIdNetUsuario[0] ;
            A17resultadoIdEstado = H00192_A17resultadoIdEstado[0] ;
            n17resultadoIdEstado = H00192_n17resultadoIdEstado[0] ;
            A166resultadoIdNetTipoinforme = H00192_A166resultadoIdNetTipoinforme[0] ;
            A13resultadoFechaEmision = H00192_A13resultadoFechaEmision[0] ;
            n13resultadoFechaEmision = H00192_n13resultadoFechaEmision[0] ;
            A7resultadoFicha = H00192_A7resultadoFicha[0] ;
            n7resultadoFicha = H00192_n7resultadoFicha[0] ;
            e12192 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbEnd = (short)(27) ;
         wb190( ) ;
      }
      bGXsfl_27_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes192( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vRESULTADOPATHPDF", AV29resultadoPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29resultadoPathPdf, ""))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup190( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_27 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_27"), ".", ",")) ;
         /* Read variables values. */
         cmbavTipoinforme.setName( cmbavTipoinforme.getInternalname() );
         cmbavTipoinforme.setValue( httpContext.cgiGet( cmbavTipoinforme.getInternalname()) );
         AV15TipoInforme = (short)(GXutil.lval( httpContext.cgiGet( cmbavTipoinforme.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TipoInforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipoInforme), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRESULTADOFICHA");
            GX_FocusControl = edtavResultadoficha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22resultadoFicha = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22resultadoFicha), 18, 0));
         }
         else
         {
            AV22resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22resultadoFicha), 18, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   public void e11192( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV6ExternalId = (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( new genexus.security.api.genexussecurity.SdtGAMUser(remoteHandle, context).getexternalid(), "."))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ExternalId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ExternalId), 4, 0));
      /*  Sending Event outputs  */
   }

   private void e12192( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      if ( A166resultadoIdNetTipoinforme == 1 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Control Lechero" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 3 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Agua" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 4 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Aislamiento y Antibiograma" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 5 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "PAL" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 6 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Parasitología" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 7 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Alimento" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 8 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Serología" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 9 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Patología" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 10 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Calidad de Leche" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 11 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Ambiental" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 12 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Lactómetro - Chequeos" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 13 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Nutrición" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 14 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Suelos" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 15 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Bruselosis en leche" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 16 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Efluentes" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 17 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Bacteriología de tanque" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 18 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Bacteriología clínica aeróbica" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 19 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Foliares" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A166resultadoIdNetTipoinforme == 99 )
      {
         AV7imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImagen_Internalname, AV7imagen);
         AV33Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV18resultadoTypeName = "Control Lechero" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavResultadotypename_Internalname, AV18resultadoTypeName);
      }
      if ( A17resultadoIdEstado == 1 )
      {
         AV9estado = "En proceso" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
      }
      if ( A17resultadoIdEstado == 2 )
      {
         AV9estado = "Pendiente de aceptación" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
      }
      if ( A17resultadoIdEstado == 3 )
      {
         AV9estado = "Finalizado" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
         AV19PDFimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPdfimagen_Internalname, AV19PDFimagen);
         AV34Pdfimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV20EXCELimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExcelimagen_Internalname, AV20EXCELimagen);
         AV35Excelimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV21CSVimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCsvimagen_Internalname, AV21CSVimagen);
         AV36Csvimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      if ( A17resultadoIdEstado == 4 )
      {
         AV9estado = "No aceptado" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
      }
      if ( A17resultadoIdEstado == 5 )
      {
         AV9estado = "Finalizado" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
         AV19PDFimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPdfimagen_Internalname, AV19PDFimagen);
         AV34Pdfimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV20EXCELimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExcelimagen_Internalname, AV20EXCELimagen);
         AV35Excelimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV21CSVimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCsvimagen_Internalname, AV21CSVimagen);
         AV36Csvimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      if ( A17resultadoIdEstado == 6 )
      {
         AV9estado = "Finalizado" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEstado_Internalname, AV9estado);
         AV19PDFimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPdfimagen_Internalname, AV19PDFimagen);
         AV34Pdfimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV20EXCELimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExcelimagen_Internalname, AV20EXCELimagen);
         AV35Excelimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV21CSVimagen = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCsvimagen_Internalname, AV21CSVimagen);
         AV36Csvimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(27) ;
      }
      sendrow_272( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_27_Refreshing )
      {
         httpContext.doAjaxLoad(27, Grid1Row);
      }
      /*  Sending Event outputs  */
   }

   public void e13192( )
   {
      /* Excelimagen_Click Routine */
      returnInSub = false ;
      AV27path = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo=" + AV29resultadoPathPdf ;
      AV30Blobfile = AV27path ;
      AV37Blobfile_GXI = GXDbFile.pathToUrl( AV27path, context.getHttpContext()) ;
      new com.colaveco.loger(remoteHandle, context).execute( GXDbFile.getFileType( AV37Blobfile_GXI)) ;
   }

   public void wb_table2_24_192( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.colaveco.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"27\">") ;
            sStyleString = "" ;
            com.colaveco.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "ViewGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ficha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            Grid1Container.AddObjectProperty("Class", "ViewGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV7imagen));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV18resultadoTypeName);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV9estado);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV20EXCELimagen));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV19PDFimagen));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV21CSVimagen));
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
      if ( wbEnd == 27 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_27 = (int)(nGXsfl_27_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_192e( true) ;
      }
      else
      {
         wb_table2_24_192e( false) ;
      }
   }

   public void wb_table1_11_192( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.colaveco.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-7 col-sm-2 col-sm-offset-1", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Resultados", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, 0, (short)(0), "HLP_GestorResultado.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavResultadoficha_Internalname, "resultado Ficha", "col-sm-3 FilterSearchAttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_27_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavResultadoficha_Internalname, GXutil.ltrim( localUtil.ntoc( AV22resultadoFicha, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavResultadoficha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22resultadoFicha), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Ficha", edtavResultadoficha_Jsonclick, 0, "FilterSearchAttribute", "", "", "", "", 1, edtavResultadoficha_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestorResultado.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_192e( true) ;
      }
      else
      {
         wb_table1_11_192e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa192( ) ;
      ws192( ) ;
      we192( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20233517584328", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 1546400), false, true);
         httpContext.AddJavascriptSource("gestorresultado.js", "?20233517584329", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_272( )
   {
      edtavImagen_Internalname = "vIMAGEN_"+sGXsfl_27_idx ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_27_idx ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION_"+sGXsfl_27_idx ;
      edtavResultadotypename_Internalname = "vRESULTADOTYPENAME_"+sGXsfl_27_idx ;
      edtavEstado_Internalname = "vESTADO_"+sGXsfl_27_idx ;
      edtavExcelimagen_Internalname = "vEXCELIMAGEN_"+sGXsfl_27_idx ;
      edtavPdfimagen_Internalname = "vPDFIMAGEN_"+sGXsfl_27_idx ;
      edtavCsvimagen_Internalname = "vCSVIMAGEN_"+sGXsfl_27_idx ;
   }

   public void subsflControlProps_fel_272( )
   {
      edtavImagen_Internalname = "vIMAGEN_"+sGXsfl_27_fel_idx ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_27_fel_idx ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION_"+sGXsfl_27_fel_idx ;
      edtavResultadotypename_Internalname = "vRESULTADOTYPENAME_"+sGXsfl_27_fel_idx ;
      edtavEstado_Internalname = "vESTADO_"+sGXsfl_27_fel_idx ;
      edtavExcelimagen_Internalname = "vEXCELIMAGEN_"+sGXsfl_27_fel_idx ;
      edtavPdfimagen_Internalname = "vPDFIMAGEN_"+sGXsfl_27_fel_idx ;
      edtavCsvimagen_Internalname = "vCSVIMAGEN_"+sGXsfl_27_fel_idx ;
   }

   public void sendrow_272( )
   {
      subsflControlProps_272( ) ;
      wb190( ) ;
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
         if ( ((int)((nGXsfl_27_idx) % (2))) == 0 )
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
         httpContext.writeText( " class=\""+"ViewGrid"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_27_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Static Bitmap Variable */
      ClassString = "Image" ;
      StyleString = "" ;
      AV7imagen_IsBlob = (boolean)(((GXutil.strcmp("", AV7imagen)==0)&&(GXutil.strcmp("", AV33Imagen_GXI)==0))||!(GXutil.strcmp("", AV7imagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV7imagen)==0) ? AV33Imagen_GXI : httpContext.getResourceRelative(AV7imagen)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavImagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV7imagen_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoFicha_Internalname,GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoFicha_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoFechaEmision_Internalname,localUtil.format(A13resultadoFechaEmision, "99/99/99"),localUtil.format( A13resultadoFechaEmision, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoFechaEmision_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavResultadotypename_Enabled!=0)&&(edtavResultadotypename_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 31,'',false,'"+sGXsfl_27_idx+"',27)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavResultadotypename_Internalname,AV18resultadoTypeName,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavResultadotypename_Enabled!=0)&&(edtavResultadotypename_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,31);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavResultadotypename_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavEstado_Enabled!=0)&&(edtavEstado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 32,'',false,'"+sGXsfl_27_idx+"',27)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEstado_Internalname,AV9estado,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEstado_Enabled!=0)&&(edtavEstado_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,32);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavEstado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavExcelimagen_Enabled!=0)&&(edtavExcelimagen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 33,'',false,'',27)\"" : " ") ;
      ClassString = "Image" ;
      StyleString = "" ;
      AV20EXCELimagen_IsBlob = (boolean)(((GXutil.strcmp("", AV20EXCELimagen)==0)&&(GXutil.strcmp("", AV35Excelimagen_GXI)==0))||!(GXutil.strcmp("", AV20EXCELimagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV20EXCELimagen)==0) ? AV35Excelimagen_GXI : httpContext.getResourceRelative(AV20EXCELimagen)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavExcelimagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavExcelimagen_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVEXCELIMAGEN.CLICK."+sGXsfl_27_idx+"'",StyleString,ClassString,"","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV20EXCELimagen_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Static Bitmap Variable */
      ClassString = "Image" ;
      StyleString = "" ;
      AV19PDFimagen_IsBlob = (boolean)(((GXutil.strcmp("", AV19PDFimagen)==0)&&(GXutil.strcmp("", AV34Pdfimagen_GXI)==0))||!(GXutil.strcmp("", AV19PDFimagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV19PDFimagen)==0) ? AV34Pdfimagen_GXI : httpContext.getResourceRelative(AV19PDFimagen)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavPdfimagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV19PDFimagen_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Static Bitmap Variable */
      ClassString = "Image" ;
      StyleString = "" ;
      AV21CSVimagen_IsBlob = (boolean)(((GXutil.strcmp("", AV21CSVimagen)==0)&&(GXutil.strcmp("", AV36Csvimagen_GXI)==0))||!(GXutil.strcmp("", AV21CSVimagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV21CSVimagen)==0) ? AV36Csvimagen_GXI : httpContext.getResourceRelative(AV21CSVimagen)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavCsvimagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV21CSVimagen_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      send_integrity_lvl_hashes192( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_27_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
      sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_272( ) ;
      /* End function sendrow_272 */
   }

   public void init_default_properties( )
   {
      cmbavTipoinforme.setInternalname( "vTIPOINFORME" );
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavResultadoficha_Internalname = "vRESULTADOFICHA" ;
      divTabletop_Internalname = "TABLETOP" ;
      tblTable2_Internalname = "TABLE2" ;
      edtavImagen_Internalname = "vIMAGEN" ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA" ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION" ;
      edtavResultadotypename_Internalname = "vRESULTADOTYPENAME" ;
      edtavEstado_Internalname = "vESTADO" ;
      edtavExcelimagen_Internalname = "vEXCELIMAGEN" ;
      edtavPdfimagen_Internalname = "vPDFIMAGEN" ;
      edtavCsvimagen_Internalname = "vCSVIMAGEN" ;
      tblTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      edtavExcelimagen_Jsonclick = "" ;
      edtavExcelimagen_Visible = -1 ;
      edtavExcelimagen_Enabled = 1 ;
      edtavEstado_Jsonclick = "" ;
      edtavEstado_Visible = -1 ;
      edtavEstado_Enabled = 1 ;
      edtavResultadotypename_Jsonclick = "" ;
      edtavResultadotypename_Visible = -1 ;
      edtavResultadotypename_Enabled = 1 ;
      edtresultadoFechaEmision_Jsonclick = "" ;
      edtresultadoFicha_Jsonclick = "" ;
      edtavResultadoficha_Jsonclick = "" ;
      edtavResultadoficha_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      subGrid1_Class = "ViewGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavTipoinforme.setJsonclick( "" );
      cmbavTipoinforme.setEnabled( 1 );
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Gestor Resultado" );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipoinforme.setName( "vTIPOINFORME" );
      cmbavTipoinforme.setWebtags( "" );
      cmbavTipoinforme.addItem("0", "Todos", (short)(0));
      cmbavTipoinforme.addItem("1", "Control Lechero", (short)(0));
      cmbavTipoinforme.addItem("3", "Agua", (short)(0));
      cmbavTipoinforme.addItem("4", "Aislamiento y Antibiograma", (short)(0));
      cmbavTipoinforme.addItem("5", "PAL", (short)(0));
      cmbavTipoinforme.addItem("6", "Parasitología", (short)(0));
      cmbavTipoinforme.addItem("7", "Alimentos", (short)(0));
      cmbavTipoinforme.addItem("8", "Serología", (short)(0));
      cmbavTipoinforme.addItem("9", "Patología", (short)(0));
      cmbavTipoinforme.addItem("10", "Calidad de Leche", (short)(0));
      cmbavTipoinforme.addItem("11", "Ambiental", (short)(0));
      cmbavTipoinforme.addItem("12", "Lactómetros y Chequeos", (short)(0));
      cmbavTipoinforme.addItem("13", "Nutrición", (short)(0));
      cmbavTipoinforme.addItem("14", "Suelos", (short)(0));
      cmbavTipoinforme.addItem("15", "Bruselosis en leche", (short)(0));
      cmbavTipoinforme.addItem("16", "Efluentes", (short)(0));
      cmbavTipoinforme.addItem("17", "Bacteriología en tanque", (short)(0));
      cmbavTipoinforme.addItem("18", "Bacteriología clínica aeróbica", (short)(0));
      cmbavTipoinforme.addItem("19", "Foliares", (short)(0));
      if ( cmbavTipoinforme.getItemCount() > 0 )
      {
         AV15TipoInforme = (short)(GXutil.lval( cmbavTipoinforme.getValidValue(GXutil.trim( GXutil.str( AV15TipoInforme, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TipoInforme", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipoInforme), 4, 0));
      }
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavTipoinforme'},{av:'AV15TipoInforme',fld:'vTIPOINFORME',pic:'ZZZ9'},{av:'AV22resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV29resultadoPathPdf',fld:'vRESULTADOPATHPDF',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV6ExternalId',fld:'vEXTERNALID',pic:'ZZZ9'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e12192',iparms:[{av:'A166resultadoIdNetTipoinforme',fld:'RESULTADOIDNETTIPOINFORME',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A17resultadoIdEstado',fld:'RESULTADOIDESTADO',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV7imagen',fld:'vIMAGEN',pic:''},{av:'AV18resultadoTypeName',fld:'vRESULTADOTYPENAME',pic:''},{av:'AV9estado',fld:'vESTADO',pic:''},{av:'AV19PDFimagen',fld:'vPDFIMAGEN',pic:''},{av:'AV20EXCELimagen',fld:'vEXCELIMAGEN',pic:''},{av:'AV21CSVimagen',fld:'vCSVIMAGEN',pic:''}]}");
      setEventMetadata("VEXCELIMAGEN.CLICK","{handler:'e13192',iparms:[{av:'AV29resultadoPathPdf',fld:'vRESULTADOPATHPDF',pic:'',hsh:true},{av:'AV37Blobfile_GXI',fld:'vBLOBFILE_GXI',pic:''}]");
      setEventMetadata("VEXCELIMAGEN.CLICK",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Csvimagen',iparms:[]");
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
      AV29resultadoPathPdf = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV37Blobfile_GXI = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7imagen = "" ;
      AV33Imagen_GXI = "" ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      AV18resultadoTypeName = "" ;
      AV9estado = "" ;
      AV20EXCELimagen = "" ;
      AV35Excelimagen_GXI = "" ;
      AV19PDFimagen = "" ;
      AV34Pdfimagen_GXI = "" ;
      AV21CSVimagen = "" ;
      AV36Csvimagen_GXI = "" ;
      scmdbuf = "" ;
      H00192_A1resultadoId = new long[1] ;
      H00192_A11resultadoIdNetUsuario = new long[1] ;
      H00192_n11resultadoIdNetUsuario = new boolean[] {false} ;
      H00192_A17resultadoIdEstado = new long[1] ;
      H00192_n17resultadoIdEstado = new boolean[] {false} ;
      H00192_A166resultadoIdNetTipoinforme = new long[1] ;
      H00192_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      H00192_n13resultadoFechaEmision = new boolean[] {false} ;
      H00192_A7resultadoFicha = new long[1] ;
      H00192_n7resultadoFicha = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV27path = "" ;
      AV30Blobfile = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTitletext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.gestorresultado__default(),
         new Object[] {
             new Object[] {
            H00192_A1resultadoId, H00192_A11resultadoIdNetUsuario, H00192_n11resultadoIdNetUsuario, H00192_A17resultadoIdEstado, H00192_n17resultadoIdEstado, H00192_A166resultadoIdNetTipoinforme, H00192_A13resultadoFechaEmision, H00192_n13resultadoFechaEmision, H00192_A7resultadoFicha, H00192_n7resultadoFicha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid1_Backstyle ;
   private short AV15TipoInforme ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV6ExternalId ;
   private int nRC_GXsfl_27 ;
   private int nGXsfl_27_idx=1 ;
   private int subGrid1_Islastpage ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtavResultadoficha_Enabled ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavResultadotypename_Enabled ;
   private int edtavResultadotypename_Visible ;
   private int edtavEstado_Enabled ;
   private int edtavEstado_Visible ;
   private int edtavExcelimagen_Enabled ;
   private int edtavExcelimagen_Visible ;
   private long AV22resultadoFicha ;
   private long A166resultadoIdNetTipoinforme ;
   private long A17resultadoIdEstado ;
   private long A7resultadoFicha ;
   private long GRID1_nCurrentRecord ;
   private long A11resultadoIdNetUsuario ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_27_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String TempTags ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavImagen_Internalname ;
   private String edtresultadoFicha_Internalname ;
   private String edtresultadoFechaEmision_Internalname ;
   private String edtavResultadotypename_Internalname ;
   private String edtavEstado_Internalname ;
   private String edtavExcelimagen_Internalname ;
   private String edtavPdfimagen_Internalname ;
   private String edtavCsvimagen_Internalname ;
   private String scmdbuf ;
   private String edtavResultadoficha_Internalname ;
   private String tblTable1_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String tblTable2_Internalname ;
   private String divTabletop_Internalname ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String edtavResultadoficha_Jsonclick ;
   private String sGXsfl_27_fel_idx="0001" ;
   private String ClassString ;
   private String StyleString ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtresultadoFicha_Jsonclick ;
   private String edtresultadoFechaEmision_Jsonclick ;
   private String edtavResultadotypename_Jsonclick ;
   private String edtavEstado_Jsonclick ;
   private String edtavExcelimagen_Jsonclick ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_27_Refreshing=false ;
   private boolean n7resultadoFicha ;
   private boolean n13resultadoFechaEmision ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n17resultadoIdEstado ;
   private boolean gx_refresh_fired ;
   private boolean returnInSub ;
   private boolean AV7imagen_IsBlob ;
   private boolean AV20EXCELimagen_IsBlob ;
   private boolean AV19PDFimagen_IsBlob ;
   private boolean AV21CSVimagen_IsBlob ;
   private String AV29resultadoPathPdf ;
   private String AV37Blobfile_GXI ;
   private String AV33Imagen_GXI ;
   private String AV18resultadoTypeName ;
   private String AV9estado ;
   private String AV35Excelimagen_GXI ;
   private String AV34Pdfimagen_GXI ;
   private String AV36Csvimagen_GXI ;
   private String AV27path ;
   private String AV7imagen ;
   private String AV20EXCELimagen ;
   private String AV19PDFimagen ;
   private String AV21CSVimagen ;
   private String AV30Blobfile ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavTipoinforme ;
   private IDataStoreProvider pr_default ;
   private long[] H00192_A1resultadoId ;
   private long[] H00192_A11resultadoIdNetUsuario ;
   private boolean[] H00192_n11resultadoIdNetUsuario ;
   private long[] H00192_A17resultadoIdEstado ;
   private boolean[] H00192_n17resultadoIdEstado ;
   private long[] H00192_A166resultadoIdNetTipoinforme ;
   private java.util.Date[] H00192_A13resultadoFechaEmision ;
   private boolean[] H00192_n13resultadoFechaEmision ;
   private long[] H00192_A7resultadoFicha ;
   private boolean[] H00192_n7resultadoFicha ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gestorresultado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00192( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV15TipoInforme ,
                                          long AV22resultadoFicha ,
                                          long A166resultadoIdNetTipoinforme ,
                                          long A7resultadoFicha ,
                                          long A11resultadoIdNetUsuario ,
                                          short AV6ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT `resultadoId`, `resultadoIdNetUsuario`, `resultadoIdEstado`, `resultadoIdNetTipoinforme`, `resultadoFechaEmision`, `resultadoFicha` FROM `Resultado`" ;
      addWhere(sWhereString, "(`resultadoIdNetUsuario` = ?)");
      if ( AV15TipoInforme != 0 )
      {
         addWhere(sWhereString, "(`resultadoIdNetTipoinforme` = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV22resultadoFicha) )
      {
         addWhere(sWhereString, "(`resultadoFicha` >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY `resultadoFicha` DESC" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_H00192(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00192", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setShort(sIdx, ((Number) parms[3]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               return;
      }
   }

}

