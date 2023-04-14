package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwresultado_impl extends GXDataArea
{
   public wwresultado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwresultado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwresultado_impl.class ));
   }

   public wwresultado_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            nRC_GXsfl_23 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_23"))) ;
            nGXsfl_23_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_23_idx"))) ;
            sGXsfl_23_idx = httpContext.GetPar( "sGXsfl_23_idx") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
            AV11resultadoFicha = GXutil.lval( httpContext.GetPar( "resultadoFicha")) ;
            A14resultadoPathExcel = httpContext.GetPar( "resultadoPathExcel") ;
            n14resultadoPathExcel = false ;
            A15resultadoPathPdf = httpContext.GetPar( "resultadoPathPdf") ;
            n15resultadoPathPdf = false ;
            A16resultadoPathCsv = httpContext.GetPar( "resultadoPathCsv") ;
            n16resultadoPathCsv = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
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
      pa172( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start172( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2023126153790", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.wwresultado", new String[] {}, new String[] {}) +"\">") ;
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
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHEXCEL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14resultadoPathExcel, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A15resultadoPathPdf, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHCSV", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A16resultadoPathCsv, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vRESULTADOFICHA", GXutil.ltrim( localUtil.ntoc( AV11resultadoFicha, (byte)(18), (byte)(0), ".", "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_23", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_23, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDNETTIPOINFORME", GXutil.ltrim( localUtil.ntoc( A166resultadoIdNetTipoinforme, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOIDESTADO", GXutil.ltrim( localUtil.ntoc( A17resultadoIdEstado, (byte)(18), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHEXCEL", A14resultadoPathExcel);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHEXCEL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14resultadoPathExcel, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHPDF", A15resultadoPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A15resultadoPathPdf, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHCSV", A16resultadoPathCsv);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHCSV", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A16resultadoPathCsv, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "vURL", AV28url);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
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
         we172( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt172( ) ;
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
      return formatLink("com.colaveco.wwresultado", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WWResultado" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Resultado" ;
   }

   public void wb170( )
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
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-7 col-sm-2 col-sm-offset-1", "left", "top", "", "", "div");
         /* Text block */
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Resultados", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, 0, (short)(0), "HLP_WWResultado.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavResultadoficha_Internalname, "resultado Ficha", "col-sm-3 FilterSearchAttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_23_idx + "',0)\"" ;
         com.colaveco.GxWebStd.gx_single_line_edit( httpContext, edtavResultadoficha_Internalname, GXutil.ltrim( localUtil.ntoc( AV11resultadoFicha, (byte)(18), (byte)(0), ".", "")), GXutil.ltrim( ((edtavResultadoficha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11resultadoFicha), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Ficha", edtavResultadoficha_Jsonclick, 0, "FilterSearchAttribute", "", "", "", "", 1, edtavResultadoficha_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WWResultado.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 TableCell", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "ContainerFluid WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"23\">") ;
            sStyleString = "" ;
            com.colaveco.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "ViewGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid_Backcolorstyle == 0 )
            {
               subGrid_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
            else
            {
               subGrid_Titlebackstyle = (byte)(1) ;
               if ( subGrid_Backcolorstyle == 1 )
               {
                  subGrid_Titlebackcolor = subGrid_Allbackcolor ;
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(154), 4, 0)+"px"+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ficha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(66), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridContainer.AddObjectProperty("GridName", "Grid");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               GridContainer = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               GridContainer.Clear();
            }
            GridContainer.SetWrapped(nGXWrapped);
            GridContainer.AddObjectProperty("GridName", "Grid");
            GridContainer.AddObjectProperty("Header", subGrid_Header);
            GridContainer.AddObjectProperty("Class", "ViewGrid");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A13resultadoFechaEmision, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_23 = (int)(nGXsfl_23_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start172( )
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
         Form.getMeta().addItem("description", "Work With Resultado", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup170( ) ;
   }

   public void ws172( )
   {
      start172( ) ;
      evt172( ) ;
   }

   public void evt172( )
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
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'DOWNLOADEXCEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_23_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_232( ) ;
                           A7resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtresultadoFicha_Internalname), ".", ",") ;
                           n7resultadoFicha = false ;
                           A13resultadoFechaEmision = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtresultadoFechaEmision_Internalname), 0)) ;
                           n13resultadoFechaEmision = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11172 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12172 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e13172 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOWNLOADEXCEL'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DownloadExcel' */
                                 e14172 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Resultadoficha Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vRESULTADOFICHA"), ".", ",") != AV11resultadoFicha )
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

   public void we172( )
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

   public void pa172( )
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
            GX_FocusControl = edtavResultadoficha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_232( ) ;
      while ( nGXsfl_23_idx <= nRC_GXsfl_23 )
      {
         sendrow_232( ) ;
         nGXsfl_23_idx = ((subGrid_Islastpage==1)&&(nGXsfl_23_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 long AV11resultadoFicha ,
                                 String A14resultadoPathExcel ,
                                 String A15resultadoPathPdf ,
                                 String A16resultadoPathCsv )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GridState.saveGridState();
      /* Execute user event: Refresh */
      e12172 ();
      GRID_nCurrentRecord = 0 ;
      rf172( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOFICHA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOFICHA", GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")));
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf172( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV35Pgmname = "WWResultado" ;
      Gx_err = (short)(0) ;
   }

   public void rf172( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(23) ;
      /* Execute user event: Refresh */
      e12172 ();
      nGXsfl_23_idx = 1 ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
      bGXsfl_23_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "ViewGrid");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_232( ) ;
         GXPagingFrom2 = (int)(GRID_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV22TipoInforme) ,
                                              Long.valueOf(AV11resultadoFicha) ,
                                              Long.valueOf(A166resultadoIdNetTipoinforme) ,
                                              Long.valueOf(A7resultadoFicha) ,
                                              Long.valueOf(A11resultadoIdNetUsuario) ,
                                              Long.valueOf(AV15ExternalId) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         });
         /* Using cursor H00172 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV15ExternalId), Short.valueOf(AV22TipoInforme), Long.valueOf(AV11resultadoFicha), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_23_idx = 1 ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) )
         {
            A11resultadoIdNetUsuario = H00172_A11resultadoIdNetUsuario[0] ;
            n11resultadoIdNetUsuario = H00172_n11resultadoIdNetUsuario[0] ;
            A17resultadoIdEstado = H00172_A17resultadoIdEstado[0] ;
            n17resultadoIdEstado = H00172_n17resultadoIdEstado[0] ;
            A14resultadoPathExcel = H00172_A14resultadoPathExcel[0] ;
            n14resultadoPathExcel = H00172_n14resultadoPathExcel[0] ;
            A15resultadoPathPdf = H00172_A15resultadoPathPdf[0] ;
            n15resultadoPathPdf = H00172_n15resultadoPathPdf[0] ;
            A16resultadoPathCsv = H00172_A16resultadoPathCsv[0] ;
            n16resultadoPathCsv = H00172_n16resultadoPathCsv[0] ;
            A166resultadoIdNetTipoinforme = H00172_A166resultadoIdNetTipoinforme[0] ;
            A13resultadoFechaEmision = H00172_A13resultadoFechaEmision[0] ;
            n13resultadoFechaEmision = H00172_n13resultadoFechaEmision[0] ;
            A7resultadoFicha = H00172_A7resultadoFicha[0] ;
            n7resultadoFicha = H00172_n7resultadoFicha[0] ;
            e13172 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(23) ;
         wb170( ) ;
      }
      bGXsfl_23_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes172( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHEXCEL", A14resultadoPathExcel);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHEXCEL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14resultadoPathExcel, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOFICHA"+"_"+sGXsfl_23_idx, getSecureSignedToken( sGXsfl_23_idx, localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHPDF", A15resultadoPathPdf);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A15resultadoPathPdf, ""))));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "RESULTADOPATHCSV", A16resultadoPathCsv);
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_RESULTADOPATHCSV", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A16resultadoPathCsv, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV22TipoInforme) ,
                                           Long.valueOf(AV11resultadoFicha) ,
                                           Long.valueOf(A166resultadoIdNetTipoinforme) ,
                                           Long.valueOf(A7resultadoFicha) ,
                                           Long.valueOf(A11resultadoIdNetUsuario) ,
                                           Long.valueOf(AV15ExternalId) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      /* Using cursor H00173 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV15ExternalId), Short.valueOf(AV22TipoInforme), Long.valueOf(AV11resultadoFicha)});
      GRID_nRecordCount = H00173_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11resultadoFicha, A14resultadoPathExcel, A15resultadoPathPdf, A16resultadoPathCsv) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void subgrid_varsfromstate( )
   {
      if ( GridState.getFiltercount() >= 1 )
      {
         AV11resultadoFicha = GXutil.lval( GridState.filterValues("Resultadoficha")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11resultadoFicha), 18, 0));
      }
      if ( GridState.getCurrentpage() > 0 )
      {
         GridPageCount = subgrid_fnc_pagecount( ) ;
         if ( ( GridPageCount > 0 ) && ( GridPageCount < GridState.getCurrentpage() ) )
         {
            subgrid_gotopage( GridPageCount) ;
         }
         else
         {
            subgrid_gotopage( ((GridPageCount<0) ? 0 : GridState.getCurrentpage())) ;
         }
      }
   }

   public void subgrid_varstostate( )
   {
      GridState.setCurrentpage( subgrid_fnc_currentpage( ) );
      GridState.clearFilterValues();
      GridState.addFilterValue("resultadoFicha", GXutil.str( AV11resultadoFicha, 18, 0));
   }

   public void before_start_formulas( )
   {
      AV35Pgmname = "WWResultado" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup170( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11172 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      GridState.loadGridState();
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_23"), ".", ",")) ;
         A16resultadoPathCsv = httpContext.cgiGet( "RESULTADOPATHCSV") ;
         AV28url = httpContext.cgiGet( "vURL") ;
         A15resultadoPathPdf = httpContext.cgiGet( "RESULTADOPATHPDF") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ".", ",") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ".", ",")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRESULTADOFICHA");
            GX_FocusControl = edtavResultadoficha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11resultadoFicha = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11resultadoFicha), 18, 0));
         }
         else
         {
            AV11resultadoFicha = localUtil.ctol( httpContext.cgiGet( edtavResultadoficha_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11resultadoFicha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11resultadoFicha), 18, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vRESULTADOFICHA"), ".", ",") != AV11resultadoFicha )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e11172 ();
      if (returnInSub) return;
   }

   public void e11172( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( ! new com.colaveco.isauthorized(remoteHandle, context).executeUdp( AV35Pgmname) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("com.colaveco.notauthorized", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35Pgmname))}, new String[] {"GxObject"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV18TiposInforme ;
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
      new com.colaveco.dptipoinforme(remoteHandle, context).execute( GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2) ;
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[0] ;
      AV18TiposInforme = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
      AV12Update = "Update" ;
      AV13Delete = "Delete" ;
      Form.setCaption( "Resultadoes" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      GridState.loadGridState();
   }

   public void e12172( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GridState.saveGridState();
      AV15ExternalId = (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( new genexus.security.api.genexussecurity.SdtGAMUser(remoteHandle, context).getexternalid(), "."))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ExternalId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ExternalId), 18, 0));
      /*  Sending Event outputs  */
   }

   private void e13172( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( A166resultadoIdNetTipoinforme == 1 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Control Lechero" ;
      }
      if ( A166resultadoIdNetTipoinforme == 3 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Agua" ;
      }
      if ( A166resultadoIdNetTipoinforme == 4 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Aislamiento y Antibiograma" ;
      }
      if ( A166resultadoIdNetTipoinforme == 5 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "PAL" ;
      }
      if ( A166resultadoIdNetTipoinforme == 6 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Parasitología" ;
      }
      if ( A166resultadoIdNetTipoinforme == 7 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Alimento" ;
      }
      if ( A166resultadoIdNetTipoinforme == 8 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Serología" ;
      }
      if ( A166resultadoIdNetTipoinforme == 9 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Patología" ;
      }
      if ( A166resultadoIdNetTipoinforme == 10 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Calidad de Leche" ;
      }
      if ( A166resultadoIdNetTipoinforme == 11 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Ambiental" ;
      }
      if ( A166resultadoIdNetTipoinforme == 12 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Lactómetro - Chequeos" ;
      }
      if ( A166resultadoIdNetTipoinforme == 13 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Nutrición" ;
      }
      if ( A166resultadoIdNetTipoinforme == 14 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Suelos" ;
      }
      if ( A166resultadoIdNetTipoinforme == 15 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Bruselosis en leche" ;
      }
      if ( A166resultadoIdNetTipoinforme == 16 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Efluentes" ;
      }
      if ( A166resultadoIdNetTipoinforme == 17 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Bacteriología de tanque" ;
      }
      if ( A166resultadoIdNetTipoinforme == 18 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Bacteriología clínica aeróbica" ;
      }
      if ( A166resultadoIdNetTipoinforme == 19 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Foliares" ;
      }
      if ( A166resultadoIdNetTipoinforme == 99 )
      {
         AV23imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
         AV36Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV17resultadoTypeName = "Control Lechero" ;
      }
      if ( A17resultadoIdEstado == 1 )
      {
         AV24estado = "En proceso" ;
      }
      if ( A17resultadoIdEstado == 2 )
      {
         AV24estado = "Pendiente de aceptación" ;
      }
      if ( A17resultadoIdEstado == 3 )
      {
         AV24estado = "Finalizado" ;
         AV25Excel = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV37Excel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV26Pdf = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV38Pdf_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV27Txt = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV39Txt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      if ( A17resultadoIdEstado == 4 )
      {
         AV24estado = "No aceptado" ;
      }
      if ( A17resultadoIdEstado == 5 )
      {
         AV24estado = "Finalizado" ;
         AV25Excel = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV37Excel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV26Pdf = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV38Pdf_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV27Txt = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV39Txt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      if ( A17resultadoIdEstado == 6 )
      {
         AV24estado = "Finalizado" ;
         AV25Excel = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV37Excel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV26Pdf = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV38Pdf_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         AV27Txt = context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) ;
         AV39Txt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(23) ;
      }
      sendrow_232( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_23_Refreshing )
      {
         httpContext.doAjaxLoad(23, GridRow);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV9TrnContext = (com.colaveco.SdtTransactionContext)new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV35Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "Resultado" );
      AV6Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "Colaveco"));
   }

   public void e14172( )
   {
      /* 'DownloadExcel' Routine */
      returnInSub = false ;
      AV28url = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo=" + A14resultadoPathExcel ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV31HttpResponse.addHeader("Content-Type", "application");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV31HttpResponse.addHeader("Content-Disposition", "attachment;filename="+GXutil.str( A7resultadoFicha, 18, 0));
      }
      AV31HttpResponse.addFile(AV28url);
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV31HttpResponse.addHeader("Pragma", "public");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV31HttpResponse.addHeader("Cache-Control", "max-age=0");
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
      pa172( ) ;
      ws172( ) ;
      we172( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20231261531316", true, true);
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
         httpContext.AddJavascriptSource("wwresultado.js", "?20231261531324", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_232( )
   {
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_23_idx ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION_"+sGXsfl_23_idx ;
   }

   public void subsflControlProps_fel_232( )
   {
      edtresultadoFicha_Internalname = "RESULTADOFICHA_"+sGXsfl_23_fel_idx ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION_"+sGXsfl_23_fel_idx ;
   }

   public void sendrow_232( )
   {
      subsflControlProps_232( ) ;
      wb170( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_23_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_23_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"ViewGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_23_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoFicha_Internalname,GXutil.ltrim( localUtil.ntoc( A7resultadoFicha, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7resultadoFicha), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoFicha_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(154),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtresultadoFechaEmision_Internalname,localUtil.format(A13resultadoFechaEmision, "99/99/99"),localUtil.format( A13resultadoFechaEmision, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtresultadoFechaEmision_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(66),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes172( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_23_idx = ((subGrid_Islastpage==1)&&(nGXsfl_23_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      /* End function sendrow_232 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavResultadoficha_Internalname = "vRESULTADOFICHA" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtresultadoFicha_Internalname = "RESULTADOFICHA" ;
      edtresultadoFechaEmision_Internalname = "RESULTADOFECHAEMISION" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divGridcell_Internalname = "GRIDCELL" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      edtresultadoFechaEmision_Jsonclick = "" ;
      edtresultadoFicha_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      subGrid_Class = "ViewGrid" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavResultadoficha_Jsonclick = "" ;
      edtavResultadoficha_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Resultado" );
      subGrid_Rows = 10 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A15resultadoPathPdf',fld:'RESULTADOPATHPDF',pic:'',hsh:true},{av:'A16resultadoPathCsv',fld:'RESULTADOPATHCSV',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15ExternalId',fld:'vEXTERNALID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e13172',iparms:[{av:'A166resultadoIdNetTipoinforme',fld:'RESULTADOIDNETTIPOINFORME',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A17resultadoIdEstado',fld:'RESULTADOIDESTADO',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOWNLOADEXCEL'","{handler:'e14172',iparms:[{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A7resultadoFicha',fld:'RESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOWNLOADEXCEL'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A15resultadoPathPdf',fld:'RESULTADOPATHPDF',pic:'',hsh:true},{av:'A16resultadoPathCsv',fld:'RESULTADOPATHCSV',pic:'',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV15ExternalId',fld:'vEXTERNALID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A15resultadoPathPdf',fld:'RESULTADOPATHPDF',pic:'',hsh:true},{av:'A16resultadoPathCsv',fld:'RESULTADOPATHCSV',pic:'',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV15ExternalId',fld:'vEXTERNALID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A15resultadoPathPdf',fld:'RESULTADOPATHPDF',pic:'',hsh:true},{av:'A16resultadoPathCsv',fld:'RESULTADOPATHCSV',pic:'',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV15ExternalId',fld:'vEXTERNALID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11resultadoFicha',fld:'vRESULTADOFICHA',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'A14resultadoPathExcel',fld:'RESULTADOPATHEXCEL',pic:'',hsh:true},{av:'A15resultadoPathPdf',fld:'RESULTADOPATHPDF',pic:'',hsh:true},{av:'A16resultadoPathCsv',fld:'RESULTADOPATHCSV',pic:'',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV15ExternalId',fld:'vEXTERNALID',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Resultadofechaemision',iparms:[]");
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
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV28url = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitletext_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A13resultadoFechaEmision = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GridState = new com.genexus.webpanels.gridstate.GXGridStateHandler(context,"Grid",getPgmname(),this,"subgrid_varsfromstate","subgrid_varstostate") ;
      AV35Pgmname = "" ;
      scmdbuf = "" ;
      H00172_A1resultadoId = new long[1] ;
      H00172_A11resultadoIdNetUsuario = new long[1] ;
      H00172_n11resultadoIdNetUsuario = new boolean[] {false} ;
      H00172_A17resultadoIdEstado = new long[1] ;
      H00172_n17resultadoIdEstado = new boolean[] {false} ;
      H00172_A14resultadoPathExcel = new String[] {""} ;
      H00172_n14resultadoPathExcel = new boolean[] {false} ;
      H00172_A15resultadoPathPdf = new String[] {""} ;
      H00172_n15resultadoPathPdf = new boolean[] {false} ;
      H00172_A16resultadoPathCsv = new String[] {""} ;
      H00172_n16resultadoPathCsv = new boolean[] {false} ;
      H00172_A166resultadoIdNetTipoinforme = new long[1] ;
      H00172_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      H00172_n13resultadoFechaEmision = new boolean[] {false} ;
      H00172_A7resultadoFicha = new long[1] ;
      H00172_n7resultadoFicha = new boolean[] {false} ;
      H00173_AGRID_nRecordCount = new long[1] ;
      AV18TiposInforme = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2 = new GXBaseCollection[1] ;
      AV12Update = "" ;
      AV13Delete = "" ;
      AV23imagen = "" ;
      AV36Imagen_GXI = "" ;
      AV17resultadoTypeName = "" ;
      AV24estado = "" ;
      AV25Excel = "" ;
      AV37Excel_GXI = "" ;
      AV26Pdf = "" ;
      AV38Pdf_GXI = "" ;
      AV27Txt = "" ;
      AV39Txt_GXI = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV6Session = httpContext.getWebSession();
      AV31HttpResponse = httpContext.getHttpResponse();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.wwresultado__default(),
         new Object[] {
             new Object[] {
            H00172_A1resultadoId, H00172_A11resultadoIdNetUsuario, H00172_n11resultadoIdNetUsuario, H00172_A17resultadoIdEstado, H00172_n17resultadoIdEstado, H00172_A14resultadoPathExcel, H00172_n14resultadoPathExcel, H00172_A15resultadoPathPdf, H00172_n15resultadoPathPdf, H00172_A16resultadoPathCsv,
            H00172_n16resultadoPathCsv, H00172_A166resultadoIdNetTipoinforme, H00172_A13resultadoFechaEmision, H00172_n13resultadoFechaEmision, H00172_A7resultadoFicha, H00172_n7resultadoFicha
            }
            , new Object[] {
            H00173_AGRID_nRecordCount
            }
         }
      );
      AV35Pgmname = "WWResultado" ;
      /* GeneXus formulas. */
      AV35Pgmname = "WWResultado" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDonePA ;
   private byte subGrid_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV22TipoInforme ;
   private int nRC_GXsfl_23 ;
   private int nGXsfl_23_idx=1 ;
   private int subGrid_Rows ;
   private int edtavResultadoficha_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV11resultadoFicha ;
   private long A166resultadoIdNetTipoinforme ;
   private long A17resultadoIdEstado ;
   private long A7resultadoFicha ;
   private long GRID_nCurrentRecord ;
   private long A11resultadoIdNetUsuario ;
   private long AV15ExternalId ;
   private long GRID_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_23_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String edtavResultadoficha_Internalname ;
   private String TempTags ;
   private String edtavResultadoficha_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String subGrid_Header ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtresultadoFicha_Internalname ;
   private String edtresultadoFechaEmision_Internalname ;
   private String AV35Pgmname ;
   private String scmdbuf ;
   private String AV12Update ;
   private String AV13Delete ;
   private String AV17resultadoTypeName ;
   private String sGXsfl_23_fel_idx="0001" ;
   private String ROClassString ;
   private String edtresultadoFicha_Jsonclick ;
   private String edtresultadoFechaEmision_Jsonclick ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n7resultadoFicha ;
   private boolean n13resultadoFechaEmision ;
   private boolean bGXsfl_23_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n17resultadoIdEstado ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean gx_refresh_fired ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private String AV28url ;
   private String AV36Imagen_GXI ;
   private String AV24estado ;
   private String AV37Excel_GXI ;
   private String AV38Pdf_GXI ;
   private String AV39Txt_GXI ;
   private String AV23imagen ;
   private String AV25Excel ;
   private String AV26Pdf ;
   private String AV27Txt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.gridstate.GXGridStateHandler GridState ;
   private IDataStoreProvider pr_default ;
   private long[] H00172_A1resultadoId ;
   private long[] H00172_A11resultadoIdNetUsuario ;
   private boolean[] H00172_n11resultadoIdNetUsuario ;
   private long[] H00172_A17resultadoIdEstado ;
   private boolean[] H00172_n17resultadoIdEstado ;
   private String[] H00172_A14resultadoPathExcel ;
   private boolean[] H00172_n14resultadoPathExcel ;
   private String[] H00172_A15resultadoPathPdf ;
   private boolean[] H00172_n15resultadoPathPdf ;
   private String[] H00172_A16resultadoPathCsv ;
   private boolean[] H00172_n16resultadoPathCsv ;
   private long[] H00172_A166resultadoIdNetTipoinforme ;
   private java.util.Date[] H00172_A13resultadoFechaEmision ;
   private boolean[] H00172_n13resultadoFechaEmision ;
   private long[] H00172_A7resultadoFicha ;
   private boolean[] H00172_n7resultadoFicha ;
   private long[] H00173_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.HttpResponse AV31HttpResponse ;
   private com.genexus.webpanels.WebSession AV6Session ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> AV18TiposInforme ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> GXv_objcol_SdtSDTTipoinforme_SDTTipoinformeItem2[] ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class wwresultado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00172( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV22TipoInforme ,
                                          long AV11resultadoFicha ,
                                          long A166resultadoIdNetTipoinforme ,
                                          long A7resultadoFicha ,
                                          long A11resultadoIdNetUsuario ,
                                          long AV15ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[5];
      Object[] GXv_Object4 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `resultadoId`, `resultadoIdNetUsuario`, `resultadoIdEstado`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdNetTipoinforme`, `resultadoFechaEmision`," ;
      sSelectString += " `resultadoFicha`" ;
      sFromString = " FROM `Resultado`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`resultadoIdNetUsuario` = ?)");
      if ( AV22TipoInforme != 0 )
      {
         addWhere(sWhereString, "(`resultadoIdNetTipoinforme` = ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV11resultadoFicha) )
      {
         addWhere(sWhereString, "(`resultadoFicha` >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `resultadoFicha` DESC" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_H00173( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV22TipoInforme ,
                                          long AV11resultadoFicha ,
                                          long A166resultadoIdNetTipoinforme ,
                                          long A7resultadoFicha ,
                                          long A11resultadoIdNetUsuario ,
                                          long AV15ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[3];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Resultado`" ;
      addWhere(sWhereString, "(`resultadoIdNetUsuario` = ?)");
      if ( AV22TipoInforme != 0 )
      {
         addWhere(sWhereString, "(`resultadoIdNetTipoinforme` = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV11resultadoFicha) )
      {
         addWhere(sWhereString, "(`resultadoFicha` >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_H00172(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
            case 1 :
                  return conditional_H00173(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00172", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00173", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
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

