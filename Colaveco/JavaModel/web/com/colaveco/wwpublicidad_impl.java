package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwpublicidad_impl extends GXDataArea
{
   public wwpublicidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwpublicidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwpublicidad_impl.class ));
   }

   public wwpublicidad_impl( int remoteHandle ,
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
            nRC_GXsfl_25 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_25"))) ;
            nGXsfl_25_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_25_idx"))) ;
            sGXsfl_25_idx = httpContext.GetPar( "sGXsfl_25_idx") ;
            AV12Update = httpContext.GetPar( "Update") ;
            AV13Delete = httpContext.GetPar( "Delete") ;
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
            AV11PublicidadTitulo = httpContext.GetPar( "PublicidadTitulo") ;
            AV12Update = httpContext.GetPar( "Update") ;
            AV13Delete = httpContext.GetPar( "Delete") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
            com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      pa0Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0Z2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202311214575198", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.colaveco.wwpublicidad", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GXH_vPUBLICIDADTITULO", GXutil.rtrim( AV11PublicidadTitulo));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_25, (byte)(8), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we0Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0Z2( ) ;
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
      return formatLink("com.colaveco.wwpublicidad", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WWPublicidad" ;
   }

   public String getPgmdesc( )
   {
      return "Publicidads" ;
   }

   public void wb0Z0( )
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
         com.colaveco.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Publicidads", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, 0, (short)(0), "HLP_WWPublicidad.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 25, 2, 0)+","+"null"+");", "Insert", bttBtninsert_Jsonclick, 5, "Insert", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPublicidad.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.colaveco.GxWebStd.gx_label_element( httpContext, edtavPublicidadtitulo_Internalname, "Publicidad Titulo", "col-sm-3 FilterSearchAttributeLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_25_idx + "',0)\"" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         com.colaveco.GxWebStd.gx_html_textarea( httpContext, edtavPublicidadtitulo_Internalname, GXutil.rtrim( AV11PublicidadTitulo), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", (short)(0), 1, edtavPublicidadtitulo_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "", "256", -1, 0, "", "Titulo", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWPublicidad.htm");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.colaveco.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.colaveco.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 ViewGridCellAdvanced", "left", "top", "", "", "div");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"25\">") ;
            sStyleString = "" ;
            com.colaveco.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Titulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Sub Titulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ImageAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Imagen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Menu App") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Menu Web") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Mostrar App") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Mostrar Web") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TextActionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TextActionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            GridContainer.AddObjectProperty("Class", "WorkWith");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A184PublicidadTitulo));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPublicidadTitulo_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A185PublicidadSubTitulo));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A186PublicidadDescripcion));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( A187PublicidadImagen));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.booltostr( A188PublicidadMenuApp));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.booltostr( A189PublicidadMenuWeb));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.booltostr( A190PublicidadMostrarApp));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.booltostr( A191PublicidadMostrarWeb));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV12Update));
            GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13Delete));
            GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDelete_Link));
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
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_25 = (int)(nGXsfl_25_idx-1) ;
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
      if ( wbEnd == 25 )
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

   public void start0Z2( )
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
         Form.getMeta().addItem("description", "Publicidads", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0Z0( ) ;
   }

   public void ws0Z2( )
   {
      start0Z2( ) ;
      evt0Z2( ) ;
   }

   public void evt0Z2( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e110Z2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_25_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_252( ) ;
                           A183PublicidadId = localUtil.ctol( httpContext.cgiGet( edtPublicidadId_Internalname), ".", ",") ;
                           A184PublicidadTitulo = httpContext.cgiGet( edtPublicidadTitulo_Internalname) ;
                           A185PublicidadSubTitulo = httpContext.cgiGet( edtPublicidadSubTitulo_Internalname) ;
                           n185PublicidadSubTitulo = false ;
                           A186PublicidadDescripcion = httpContext.cgiGet( edtPublicidadDescripcion_Internalname) ;
                           n186PublicidadDescripcion = false ;
                           A187PublicidadImagen = httpContext.cgiGet( edtPublicidadImagen_Internalname) ;
                           n187PublicidadImagen = false ;
                           httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), !bGXsfl_25_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
                           A188PublicidadMenuApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuApp.getInternalname())) ;
                           n188PublicidadMenuApp = false ;
                           A189PublicidadMenuWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMenuWeb.getInternalname())) ;
                           n189PublicidadMenuWeb = false ;
                           A190PublicidadMostrarApp = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarApp.getInternalname())) ;
                           n190PublicidadMostrarApp = false ;
                           A191PublicidadMostrarWeb = GXutil.strtobool( httpContext.cgiGet( chkPublicidadMostrarWeb.getInternalname())) ;
                           AV12Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV12Update);
                           AV13Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDelete_Internalname, AV13Delete);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e120Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e130Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e140Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Publicidadtitulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPUBLICIDADTITULO"), AV11PublicidadTitulo) != 0 )
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

   public void we0Z2( )
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

   public void pa0Z2( )
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
            GX_FocusControl = edtavPublicidadtitulo_Internalname ;
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
      subsflControlProps_252( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         sendrow_252( ) ;
         nGXsfl_25_idx = ((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV11PublicidadTitulo ,
                                 String AV12Update ,
                                 String AV13Delete )
   {
      initialize_formulas( ) ;
      com.colaveco.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e130Z2 ();
      GRID_nCurrentRecord = 0 ;
      rf0Z2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_PUBLICIDADID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9")));
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "PUBLICIDADID", GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")));
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
      rf0Z2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "WWPublicidad" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_25_Refreshing);
   }

   public void rf0Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e130Z2 ();
      nGXsfl_25_idx = 1 ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      bGXsfl_25_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_252( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV11PublicidadTitulo ,
                                              A184PublicidadTitulo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV11PublicidadTitulo = GXutil.padr( GXutil.rtrim( AV11PublicidadTitulo), 256, "%") ;
         /* Using cursor H000Z2 */
         pr_default.execute(0, new Object[] {lV11PublicidadTitulo, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_25_idx = 1 ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_252( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A191PublicidadMostrarWeb = H000Z2_A191PublicidadMostrarWeb[0] ;
            A190PublicidadMostrarApp = H000Z2_A190PublicidadMostrarApp[0] ;
            n190PublicidadMostrarApp = H000Z2_n190PublicidadMostrarApp[0] ;
            A189PublicidadMenuWeb = H000Z2_A189PublicidadMenuWeb[0] ;
            n189PublicidadMenuWeb = H000Z2_n189PublicidadMenuWeb[0] ;
            A188PublicidadMenuApp = H000Z2_A188PublicidadMenuApp[0] ;
            n188PublicidadMenuApp = H000Z2_n188PublicidadMenuApp[0] ;
            A187PublicidadImagen = H000Z2_A187PublicidadImagen[0] ;
            n187PublicidadImagen = H000Z2_n187PublicidadImagen[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), !bGXsfl_25_Refreshing);
            httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
            A40000PublicidadImagen_GXI = H000Z2_A40000PublicidadImagen_GXI[0] ;
            n40000PublicidadImagen_GXI = H000Z2_n40000PublicidadImagen_GXI[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.convertURL( httpContext.getResourceRelative(A187PublicidadImagen))), !bGXsfl_25_Refreshing);
            httpContext.ajax_rsp_assign_prop("", false, edtPublicidadImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A187PublicidadImagen), true);
            A186PublicidadDescripcion = H000Z2_A186PublicidadDescripcion[0] ;
            n186PublicidadDescripcion = H000Z2_n186PublicidadDescripcion[0] ;
            A185PublicidadSubTitulo = H000Z2_A185PublicidadSubTitulo[0] ;
            n185PublicidadSubTitulo = H000Z2_n185PublicidadSubTitulo[0] ;
            A184PublicidadTitulo = H000Z2_A184PublicidadTitulo[0] ;
            A183PublicidadId = H000Z2_A183PublicidadId[0] ;
            e140Z2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(25) ;
         wb0Z0( ) ;
      }
      bGXsfl_25_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0Z2( )
   {
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "gxhash_PUBLICIDADID"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9")));
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
                                           AV11PublicidadTitulo ,
                                           A184PublicidadTitulo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV11PublicidadTitulo = GXutil.padr( GXutil.rtrim( AV11PublicidadTitulo), 256, "%") ;
      /* Using cursor H000Z3 */
      pr_default.execute(1, new Object[] {lV11PublicidadTitulo});
      GRID_nRecordCount = H000Z3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
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
         gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11PublicidadTitulo, AV12Update, AV13Delete) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void subgrid_varsfromstate( )
   {
      if ( GridState.getFiltercount() >= 1 )
      {
         AV11PublicidadTitulo = GridState.filterValues("Publicidadtitulo") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PublicidadTitulo", AV11PublicidadTitulo);
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
      GridState.addFilterValue("PublicidadTitulo", AV11PublicidadTitulo);
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "WWPublicidad" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup0Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e120Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_25 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ".", ",")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ".", ",") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ".", ",")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ".", ",")) ;
         com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV11PublicidadTitulo = httpContext.cgiGet( edtavPublicidadtitulo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PublicidadTitulo", AV11PublicidadTitulo);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPUBLICIDADTITULO"), AV11PublicidadTitulo) != 0 )
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
      e120Z2 ();
      if (returnInSub) return;
   }

   public void e120Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( ! new com.colaveco.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("com.colaveco.notauthorized", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Pgmname))}, new String[] {"GxObject"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.colaveco.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV12Update = "Update" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV12Update);
      AV13Delete = "Delete" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDelete_Internalname, AV13Delete);
      Form.setCaption( "Publicidads" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      GridState.loadGridState();
   }

   public void e130Z2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GridState.saveGridState();
   }

   private void e140Z2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtavUpdate_Link = formatLink("com.colaveco.publicidad", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.ltrimstr(A183PublicidadId,18,0))}, new String[] {"Mode","PublicidadId"})  ;
      edtavDelete_Link = formatLink("com.colaveco.publicidad", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.ltrimstr(A183PublicidadId,18,0))}, new String[] {"Mode","PublicidadId"})  ;
      edtPublicidadTitulo_Link = formatLink("com.colaveco.viewpublicidad", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A183PublicidadId,18,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"PublicidadId","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(25) ;
      }
      sendrow_252( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_25_Refreshing )
      {
         httpContext.doAjaxLoad(25, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e110Z2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("com.colaveco.publicidad", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","PublicidadId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV9TrnContext = (com.colaveco.SdtTransactionContext)new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV17Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "Publicidad" );
      AV6Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "Colaveco"));
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
      pa0Z2( ) ;
      ws0Z2( ) ;
      we0Z2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202311214575319", true, true);
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
         httpContext.AddJavascriptSource("wwpublicidad.js", "?202311214575319", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtPublicidadId_Internalname = "PUBLICIDADID_"+sGXsfl_25_idx ;
      edtPublicidadTitulo_Internalname = "PUBLICIDADTITULO_"+sGXsfl_25_idx ;
      edtPublicidadSubTitulo_Internalname = "PUBLICIDADSUBTITULO_"+sGXsfl_25_idx ;
      edtPublicidadDescripcion_Internalname = "PUBLICIDADDESCRIPCION_"+sGXsfl_25_idx ;
      edtPublicidadImagen_Internalname = "PUBLICIDADIMAGEN_"+sGXsfl_25_idx ;
      chkPublicidadMenuApp.setInternalname( "PUBLICIDADMENUAPP_"+sGXsfl_25_idx );
      chkPublicidadMenuWeb.setInternalname( "PUBLICIDADMENUWEB_"+sGXsfl_25_idx );
      chkPublicidadMostrarApp.setInternalname( "PUBLICIDADMOSTRARAPP_"+sGXsfl_25_idx );
      chkPublicidadMostrarWeb.setInternalname( "PUBLICIDADMOSTRARWEB_"+sGXsfl_25_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtPublicidadId_Internalname = "PUBLICIDADID_"+sGXsfl_25_fel_idx ;
      edtPublicidadTitulo_Internalname = "PUBLICIDADTITULO_"+sGXsfl_25_fel_idx ;
      edtPublicidadSubTitulo_Internalname = "PUBLICIDADSUBTITULO_"+sGXsfl_25_fel_idx ;
      edtPublicidadDescripcion_Internalname = "PUBLICIDADDESCRIPCION_"+sGXsfl_25_fel_idx ;
      edtPublicidadImagen_Internalname = "PUBLICIDADIMAGEN_"+sGXsfl_25_fel_idx ;
      chkPublicidadMenuApp.setInternalname( "PUBLICIDADMENUAPP_"+sGXsfl_25_fel_idx );
      chkPublicidadMenuWeb.setInternalname( "PUBLICIDADMENUWEB_"+sGXsfl_25_fel_idx );
      chkPublicidadMostrarApp.setInternalname( "PUBLICIDADMOSTRARAPP_"+sGXsfl_25_fel_idx );
      chkPublicidadMostrarWeb.setInternalname( "PUBLICIDADMOSTRARWEB_"+sGXsfl_25_fel_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb0Z0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_25_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_25_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_25_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPublicidadId_Internalname,GXutil.ltrim( localUtil.ntoc( A183PublicidadId, (byte)(18), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A183PublicidadId), "ZZZZZZZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPublicidadId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPublicidadTitulo_Internalname,GXutil.rtrim( A184PublicidadTitulo),"","","'"+""+"'"+",false,"+"'"+""+"'",edtPublicidadTitulo_Link,"","","",edtPublicidadTitulo_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPublicidadSubTitulo_Internalname,GXutil.rtrim( A185PublicidadSubTitulo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPublicidadSubTitulo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPublicidadDescripcion_Internalname,GXutil.rtrim( A186PublicidadDescripcion),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPublicidadDescripcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "ImageAttribute" ;
         StyleString = "" ;
         A187PublicidadImagen_IsBlob = (boolean)(((GXutil.strcmp("", A187PublicidadImagen)==0)&&(GXutil.strcmp("", A40000PublicidadImagen_GXI)==0))||!(GXutil.strcmp("", A187PublicidadImagen)==0)) ;
         sImgUrl = ((GXutil.strcmp("", A187PublicidadImagen)==0) ? A40000PublicidadImagen_GXI : httpContext.getResourceRelative(A187PublicidadImagen)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtPublicidadImagen_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWColumn WWOptionalColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(A187PublicidadImagen_IsBlob),Boolean.valueOf(true),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PUBLICIDADMENUAPP_" + sGXsfl_25_idx ;
         chkPublicidadMenuApp.setName( GXCCtl );
         chkPublicidadMenuApp.setWebtags( "" );
         chkPublicidadMenuApp.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuApp.getInternalname(), "TitleCaption", chkPublicidadMenuApp.getCaption(), !bGXsfl_25_Refreshing);
         chkPublicidadMenuApp.setCheckedValue( "false" );
         A188PublicidadMenuApp = GXutil.strtobool( GXutil.booltostr( A188PublicidadMenuApp)) ;
         n188PublicidadMenuApp = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPublicidadMenuApp.getInternalname(),GXutil.booltostr( A188PublicidadMenuApp),"","",Integer.valueOf(-1),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn WWOptionalColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PUBLICIDADMENUWEB_" + sGXsfl_25_idx ;
         chkPublicidadMenuWeb.setName( GXCCtl );
         chkPublicidadMenuWeb.setWebtags( "" );
         chkPublicidadMenuWeb.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuWeb.getInternalname(), "TitleCaption", chkPublicidadMenuWeb.getCaption(), !bGXsfl_25_Refreshing);
         chkPublicidadMenuWeb.setCheckedValue( "false" );
         A189PublicidadMenuWeb = GXutil.strtobool( GXutil.booltostr( A189PublicidadMenuWeb)) ;
         n189PublicidadMenuWeb = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPublicidadMenuWeb.getInternalname(),GXutil.booltostr( A189PublicidadMenuWeb),"","",Integer.valueOf(-1),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn WWOptionalColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PUBLICIDADMOSTRARAPP_" + sGXsfl_25_idx ;
         chkPublicidadMostrarApp.setName( GXCCtl );
         chkPublicidadMostrarApp.setWebtags( "" );
         chkPublicidadMostrarApp.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarApp.getInternalname(), "TitleCaption", chkPublicidadMostrarApp.getCaption(), !bGXsfl_25_Refreshing);
         chkPublicidadMostrarApp.setCheckedValue( "false" );
         A190PublicidadMostrarApp = GXutil.strtobool( GXutil.booltostr( A190PublicidadMostrarApp)) ;
         n190PublicidadMostrarApp = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPublicidadMostrarApp.getInternalname(),GXutil.booltostr( A190PublicidadMostrarApp),"","",Integer.valueOf(-1),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn WWOptionalColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PUBLICIDADMOSTRARWEB_" + sGXsfl_25_idx ;
         chkPublicidadMostrarWeb.setName( GXCCtl );
         chkPublicidadMostrarWeb.setWebtags( "" );
         chkPublicidadMostrarWeb.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarWeb.getInternalname(), "TitleCaption", chkPublicidadMostrarWeb.getCaption(), !bGXsfl_25_Refreshing);
         chkPublicidadMostrarWeb.setCheckedValue( "false" );
         A191PublicidadMostrarWeb = GXutil.strtobool( GXutil.booltostr( A191PublicidadMostrarWeb)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPublicidadMostrarWeb.getInternalname(),GXutil.booltostr( A191PublicidadMostrarWeb),"","",Integer.valueOf(-1),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn WWOptionalColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TextActionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV12Update),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavUpdate_Link,"","","",edtavUpdate_Jsonclick,Integer.valueOf(0),"TextActionAttribute","",ROClassString,"WWTextActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUpdate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TextActionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.rtrim( AV13Delete),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavDelete_Link,"","","",edtavDelete_Jsonclick,Integer.valueOf(0),"TextActionAttribute","",ROClassString,"WWTextActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDelete_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes0Z2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_25_idx = ((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      /* End function sendrow_252 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavPublicidadtitulo_Internalname = "vPUBLICIDADTITULO" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtPublicidadId_Internalname = "PUBLICIDADID" ;
      edtPublicidadTitulo_Internalname = "PUBLICIDADTITULO" ;
      edtPublicidadSubTitulo_Internalname = "PUBLICIDADSUBTITULO" ;
      edtPublicidadDescripcion_Internalname = "PUBLICIDADDESCRIPCION" ;
      edtPublicidadImagen_Internalname = "PUBLICIDADIMAGEN" ;
      chkPublicidadMenuApp.setInternalname( "PUBLICIDADMENUAPP" );
      chkPublicidadMenuWeb.setInternalname( "PUBLICIDADMENUWEB" );
      chkPublicidadMostrarApp.setInternalname( "PUBLICIDADMOSTRARAPP" );
      chkPublicidadMostrarWeb.setInternalname( "PUBLICIDADMOSTRARWEB" );
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavDelete_Internalname = "vDELETE" ;
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
      edtavDelete_Jsonclick = "" ;
      edtavUpdate_Jsonclick = "" ;
      chkPublicidadMostrarWeb.setCaption( "" );
      chkPublicidadMostrarApp.setCaption( "" );
      chkPublicidadMenuWeb.setCaption( "" );
      chkPublicidadMenuApp.setCaption( "" );
      edtPublicidadDescripcion_Jsonclick = "" ;
      edtPublicidadSubTitulo_Jsonclick = "" ;
      edtPublicidadTitulo_Jsonclick = "" ;
      edtPublicidadId_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavDelete_Enabled = 0 ;
      edtavUpdate_Link = "" ;
      edtavUpdate_Enabled = 0 ;
      edtPublicidadTitulo_Link = "" ;
      subGrid_Header = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPublicidadtitulo_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Publicidads" );
      subGrid_Rows = 10 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "PUBLICIDADMENUAPP_" + sGXsfl_25_idx ;
      chkPublicidadMenuApp.setName( GXCCtl );
      chkPublicidadMenuApp.setWebtags( "" );
      chkPublicidadMenuApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuApp.getInternalname(), "TitleCaption", chkPublicidadMenuApp.getCaption(), !bGXsfl_25_Refreshing);
      chkPublicidadMenuApp.setCheckedValue( "false" );
      A188PublicidadMenuApp = GXutil.strtobool( GXutil.booltostr( A188PublicidadMenuApp)) ;
      n188PublicidadMenuApp = false ;
      GXCCtl = "PUBLICIDADMENUWEB_" + sGXsfl_25_idx ;
      chkPublicidadMenuWeb.setName( GXCCtl );
      chkPublicidadMenuWeb.setWebtags( "" );
      chkPublicidadMenuWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMenuWeb.getInternalname(), "TitleCaption", chkPublicidadMenuWeb.getCaption(), !bGXsfl_25_Refreshing);
      chkPublicidadMenuWeb.setCheckedValue( "false" );
      A189PublicidadMenuWeb = GXutil.strtobool( GXutil.booltostr( A189PublicidadMenuWeb)) ;
      n189PublicidadMenuWeb = false ;
      GXCCtl = "PUBLICIDADMOSTRARAPP_" + sGXsfl_25_idx ;
      chkPublicidadMostrarApp.setName( GXCCtl );
      chkPublicidadMostrarApp.setWebtags( "" );
      chkPublicidadMostrarApp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarApp.getInternalname(), "TitleCaption", chkPublicidadMostrarApp.getCaption(), !bGXsfl_25_Refreshing);
      chkPublicidadMostrarApp.setCheckedValue( "false" );
      A190PublicidadMostrarApp = GXutil.strtobool( GXutil.booltostr( A190PublicidadMostrarApp)) ;
      n190PublicidadMostrarApp = false ;
      GXCCtl = "PUBLICIDADMOSTRARWEB_" + sGXsfl_25_idx ;
      chkPublicidadMostrarWeb.setName( GXCCtl );
      chkPublicidadMostrarWeb.setWebtags( "" );
      chkPublicidadMostrarWeb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPublicidadMostrarWeb.getInternalname(), "TitleCaption", chkPublicidadMostrarWeb.getCaption(), !bGXsfl_25_Refreshing);
      chkPublicidadMostrarWeb.setCheckedValue( "false" );
      A191PublicidadMostrarWeb = GXutil.strtobool( GXutil.booltostr( A191PublicidadMostrarWeb)) ;
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11PublicidadTitulo',fld:'vPUBLICIDADTITULO',pic:''},{av:'AV12Update',fld:'vUPDATE',pic:''},{av:'AV13Delete',fld:'vDELETE',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e140Z2',iparms:[{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtPublicidadTitulo_Link',ctrl:'PUBLICIDADTITULO',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e110Z2',iparms:[{av:'A183PublicidadId',fld:'PUBLICIDADID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11PublicidadTitulo',fld:'vPUBLICIDADTITULO',pic:''},{av:'AV12Update',fld:'vUPDATE',pic:''},{av:'AV13Delete',fld:'vDELETE',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11PublicidadTitulo',fld:'vPUBLICIDADTITULO',pic:''},{av:'AV12Update',fld:'vUPDATE',pic:''},{av:'AV13Delete',fld:'vDELETE',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11PublicidadTitulo',fld:'vPUBLICIDADTITULO',pic:''},{av:'AV12Update',fld:'vUPDATE',pic:''},{av:'AV13Delete',fld:'vDELETE',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11PublicidadTitulo',fld:'vPUBLICIDADTITULO',pic:''},{av:'AV12Update',fld:'vUPDATE',pic:''},{av:'AV13Delete',fld:'vDELETE',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Delete',iparms:[]");
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
      AV12Update = "" ;
      AV13Delete = "" ;
      AV11PublicidadTitulo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitletext_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A184PublicidadTitulo = "" ;
      A185PublicidadSubTitulo = "" ;
      A186PublicidadDescripcion = "" ;
      A187PublicidadImagen = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A40000PublicidadImagen_GXI = "" ;
      GridState = new com.genexus.webpanels.gridstate.GXGridStateHandler(context,"Grid",getPgmname(),this,"subgrid_varsfromstate","subgrid_varstostate") ;
      AV17Pgmname = "" ;
      scmdbuf = "" ;
      lV11PublicidadTitulo = "" ;
      H000Z2_A191PublicidadMostrarWeb = new boolean[] {false} ;
      H000Z2_A190PublicidadMostrarApp = new boolean[] {false} ;
      H000Z2_n190PublicidadMostrarApp = new boolean[] {false} ;
      H000Z2_A189PublicidadMenuWeb = new boolean[] {false} ;
      H000Z2_n189PublicidadMenuWeb = new boolean[] {false} ;
      H000Z2_A188PublicidadMenuApp = new boolean[] {false} ;
      H000Z2_n188PublicidadMenuApp = new boolean[] {false} ;
      H000Z2_A187PublicidadImagen = new String[] {""} ;
      H000Z2_n187PublicidadImagen = new boolean[] {false} ;
      H000Z2_A40000PublicidadImagen_GXI = new String[] {""} ;
      H000Z2_n40000PublicidadImagen_GXI = new boolean[] {false} ;
      H000Z2_A186PublicidadDescripcion = new String[] {""} ;
      H000Z2_n186PublicidadDescripcion = new boolean[] {false} ;
      H000Z2_A185PublicidadSubTitulo = new String[] {""} ;
      H000Z2_n185PublicidadSubTitulo = new boolean[] {false} ;
      H000Z2_A184PublicidadTitulo = new String[] {""} ;
      H000Z2_A183PublicidadId = new long[1] ;
      H000Z3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV9TrnContext = new com.colaveco.SdtTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV6Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      GXCCtl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.wwpublicidad__default(),
         new Object[] {
             new Object[] {
            H000Z2_A191PublicidadMostrarWeb, H000Z2_A190PublicidadMostrarApp, H000Z2_n190PublicidadMostrarApp, H000Z2_A189PublicidadMenuWeb, H000Z2_n189PublicidadMenuWeb, H000Z2_A188PublicidadMenuApp, H000Z2_n188PublicidadMenuApp, H000Z2_A187PublicidadImagen, H000Z2_n187PublicidadImagen, H000Z2_A40000PublicidadImagen_GXI,
            H000Z2_n40000PublicidadImagen_GXI, H000Z2_A186PublicidadDescripcion, H000Z2_n186PublicidadDescripcion, H000Z2_A185PublicidadSubTitulo, H000Z2_n185PublicidadSubTitulo, H000Z2_A184PublicidadTitulo, H000Z2_A183PublicidadId
            }
            , new Object[] {
            H000Z3_AGRID_nRecordCount
            }
         }
      );
      AV17Pgmname = "WWPublicidad" ;
      /* GeneXus formulas. */
      AV17Pgmname = "WWPublicidad" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      edtavDelete_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
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
   private int nRC_GXsfl_25 ;
   private int nGXsfl_25_idx=1 ;
   private int subGrid_Rows ;
   private int edtavPublicidadtitulo_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavUpdate_Enabled ;
   private int edtavDelete_Enabled ;
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
   private long A183PublicidadId ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_25_idx="0001" ;
   private String AV12Update ;
   private String AV13Delete ;
   private String AV11PublicidadTitulo ;
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
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavPublicidadtitulo_Internalname ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String subGrid_Header ;
   private String A184PublicidadTitulo ;
   private String edtPublicidadTitulo_Link ;
   private String A185PublicidadSubTitulo ;
   private String A186PublicidadDescripcion ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtPublicidadId_Internalname ;
   private String edtPublicidadTitulo_Internalname ;
   private String edtPublicidadSubTitulo_Internalname ;
   private String edtPublicidadDescripcion_Internalname ;
   private String edtPublicidadImagen_Internalname ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String lV11PublicidadTitulo ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String ROClassString ;
   private String edtPublicidadId_Jsonclick ;
   private String edtPublicidadTitulo_Jsonclick ;
   private String edtPublicidadSubTitulo_Jsonclick ;
   private String edtPublicidadDescripcion_Jsonclick ;
   private String sImgUrl ;
   private String GXCCtl ;
   private String edtavUpdate_Jsonclick ;
   private String edtavDelete_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean A188PublicidadMenuApp ;
   private boolean A189PublicidadMenuWeb ;
   private boolean A190PublicidadMostrarApp ;
   private boolean A191PublicidadMostrarWeb ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n185PublicidadSubTitulo ;
   private boolean n186PublicidadDescripcion ;
   private boolean n187PublicidadImagen ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean n188PublicidadMenuApp ;
   private boolean n189PublicidadMenuWeb ;
   private boolean n190PublicidadMostrarApp ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n40000PublicidadImagen_GXI ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean gx_refresh_fired ;
   private boolean A187PublicidadImagen_IsBlob ;
   private String A40000PublicidadImagen_GXI ;
   private String A187PublicidadImagen ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.gridstate.GXGridStateHandler GridState ;
   private ICheckbox chkPublicidadMenuApp ;
   private ICheckbox chkPublicidadMenuWeb ;
   private ICheckbox chkPublicidadMostrarApp ;
   private ICheckbox chkPublicidadMostrarWeb ;
   private IDataStoreProvider pr_default ;
   private boolean[] H000Z2_A191PublicidadMostrarWeb ;
   private boolean[] H000Z2_A190PublicidadMostrarApp ;
   private boolean[] H000Z2_n190PublicidadMostrarApp ;
   private boolean[] H000Z2_A189PublicidadMenuWeb ;
   private boolean[] H000Z2_n189PublicidadMenuWeb ;
   private boolean[] H000Z2_A188PublicidadMenuApp ;
   private boolean[] H000Z2_n188PublicidadMenuApp ;
   private String[] H000Z2_A187PublicidadImagen ;
   private boolean[] H000Z2_n187PublicidadImagen ;
   private String[] H000Z2_A40000PublicidadImagen_GXI ;
   private boolean[] H000Z2_n40000PublicidadImagen_GXI ;
   private String[] H000Z2_A186PublicidadDescripcion ;
   private boolean[] H000Z2_n186PublicidadDescripcion ;
   private String[] H000Z2_A185PublicidadSubTitulo ;
   private boolean[] H000Z2_n185PublicidadSubTitulo ;
   private String[] H000Z2_A184PublicidadTitulo ;
   private long[] H000Z2_A183PublicidadId ;
   private long[] H000Z3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV6Session ;
   private com.colaveco.SdtTransactionContext AV9TrnContext ;
}

final  class wwpublicidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11PublicidadTitulo ,
                                          String A184PublicidadTitulo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `PublicidadMostrarWeb`, `PublicidadMostrarApp`, `PublicidadMenuWeb`, `PublicidadMenuApp`, `PublicidadImagen`, `PublicidadImagen_GXI`, `PublicidadDescripcion`, `PublicidadSubTitulo`," ;
      sSelectString += " `PublicidadTitulo`, `PublicidadId`" ;
      sFromString = " FROM `Publicidad`" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV11PublicidadTitulo)==0) )
      {
         addWhere(sWhereString, "(`PublicidadTitulo` like ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `PublicidadTitulo`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11PublicidadTitulo ,
                                          String A184PublicidadTitulo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[1];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM `Publicidad`" ;
      if ( ! (GXutil.strcmp("", AV11PublicidadTitulo)==0) )
      {
         addWhere(sWhereString, "(`PublicidadTitulo` like ?)");
      }
      else
      {
         GXv_int3[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_H000Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 1 :
                  return conditional_H000Z3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((boolean[]) buf[0])[0] = rslt.getBoolean(1);
               ((boolean[]) buf[1])[0] = rslt.getBoolean(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((boolean[]) buf[3])[0] = rslt.getBoolean(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((boolean[]) buf[5])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 256);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 256);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 256);
               ((long[]) buf[16])[0] = rslt.getLong(10);
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
                  stmt.setString(sIdx, (String)parms[3], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[1], 256);
               }
               return;
      }
   }

}

