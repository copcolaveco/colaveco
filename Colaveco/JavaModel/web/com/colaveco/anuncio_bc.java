package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class anuncio_bc extends GXWebPanel implements IGxSilentTrn
{
   public anuncio_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public anuncio_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( anuncio_bc.class ));
   }

   public anuncio_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtAnuncio> GetAll( int Start ,
                                                          int Count )
   {
      GXPagingFrom9 = Start ;
      GXPagingTo9 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00094 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom9), Integer.valueOf(GXPagingTo9)});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A192AnuncioId = BC00094_A192AnuncioId[0] ;
         A193AnuncioTitulo = BC00094_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = BC00094_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = BC00094_n194AnuncioSubTitulo[0] ;
         A197AnuncioDescripcion = BC00094_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = BC00094_A195AnuncioImagen[0] ;
         n195AnuncioImagen = BC00094_n195AnuncioImagen[0] ;
         A40000AnuncioImagen_GXI = BC00094_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = BC00094_n40000AnuncioImagen_GXI[0] ;
         A196AnuncioPublico = BC00094_A196AnuncioPublico[0] ;
         n196AnuncioPublico = BC00094_n196AnuncioPublico[0] ;
      }
      bcAnuncio = new com.colaveco.SdtAnuncio(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound9 != 0 )
      {
         onLoadActions099( ) ;
         addRow099( ) ;
         gx_sdt_item = bcAnuncio.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound9 = (short)(0) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound9 = (short)(1) ;
            A192AnuncioId = BC00094_A192AnuncioId[0] ;
            A193AnuncioTitulo = BC00094_A193AnuncioTitulo[0] ;
            A194AnuncioSubTitulo = BC00094_A194AnuncioSubTitulo[0] ;
            n194AnuncioSubTitulo = BC00094_n194AnuncioSubTitulo[0] ;
            A197AnuncioDescripcion = BC00094_A197AnuncioDescripcion[0] ;
            A195AnuncioImagen = BC00094_A195AnuncioImagen[0] ;
            n195AnuncioImagen = BC00094_n195AnuncioImagen[0] ;
            A40000AnuncioImagen_GXI = BC00094_A40000AnuncioImagen_GXI[0] ;
            n40000AnuncioImagen_GXI = BC00094_n40000AnuncioImagen_GXI[0] ;
            A196AnuncioPublico = BC00094_A196AnuncioPublico[0] ;
            n196AnuncioPublico = BC00094_n196AnuncioPublico[0] ;
         }
         Gx_mode = sMode9 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm099( 0) ;
   }

   public void getInsDefault( )
   {
      readRow099( ) ;
      standaloneNotModal( ) ;
      initializeNonKey099( ) ;
      standaloneModal( ) ;
      addRow099( ) ;
      Gx_mode = "INS" ;
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
         e11092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z192AnuncioId = A192AnuncioId ;
            SetMode( "UPD") ;
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

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_090( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls099( ) ;
         }
         else
         {
            checkExtendedTable099( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors099( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e12092( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e11092( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm099( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z193AnuncioTitulo = A193AnuncioTitulo ;
         Z194AnuncioSubTitulo = A194AnuncioSubTitulo ;
         Z197AnuncioDescripcion = A197AnuncioDescripcion ;
         Z196AnuncioPublico = A196AnuncioPublico ;
      }
      if ( GX_JID == -2 )
      {
         Z192AnuncioId = A192AnuncioId ;
         Z193AnuncioTitulo = A193AnuncioTitulo ;
         Z194AnuncioSubTitulo = A194AnuncioSubTitulo ;
         Z197AnuncioDescripcion = A197AnuncioDescripcion ;
         Z195AnuncioImagen = A195AnuncioImagen ;
         Z40000AnuncioImagen_GXI = A40000AnuncioImagen_GXI ;
         Z196AnuncioPublico = A196AnuncioPublico ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (0==A192AnuncioId) && ( Gx_BScreen == 0 ) )
      {
         A192AnuncioId = 1 ;
      }
   }

   public void load099( )
   {
      /* Using cursor BC00095 */
      pr_default.execute(3, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A193AnuncioTitulo = BC00095_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = BC00095_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = BC00095_n194AnuncioSubTitulo[0] ;
         A197AnuncioDescripcion = BC00095_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = BC00095_A195AnuncioImagen[0] ;
         n195AnuncioImagen = BC00095_n195AnuncioImagen[0] ;
         A40000AnuncioImagen_GXI = BC00095_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = BC00095_n40000AnuncioImagen_GXI[0] ;
         A196AnuncioPublico = BC00095_A196AnuncioPublico[0] ;
         n196AnuncioPublico = BC00095_n196AnuncioPublico[0] ;
         zm099( -2) ;
      }
      pr_default.close(3);
      onLoadActions099( ) ;
   }

   public void onLoadActions099( )
   {
   }

   public void checkExtendedTable099( )
   {
      nIsDirty_9 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors099( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey099( )
   {
      /* Using cursor BC00096 */
      pr_default.execute(4, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00097 */
      pr_default.execute(5, new Object[] {Long.valueOf(A192AnuncioId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm099( 2) ;
         RcdFound9 = (short)(1) ;
         A192AnuncioId = BC00097_A192AnuncioId[0] ;
         A193AnuncioTitulo = BC00097_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = BC00097_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = BC00097_n194AnuncioSubTitulo[0] ;
         A197AnuncioDescripcion = BC00097_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = BC00097_A195AnuncioImagen[0] ;
         n195AnuncioImagen = BC00097_n195AnuncioImagen[0] ;
         A40000AnuncioImagen_GXI = BC00097_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = BC00097_n40000AnuncioImagen_GXI[0] ;
         A196AnuncioPublico = BC00097_A196AnuncioPublico[0] ;
         n196AnuncioPublico = BC00097_n196AnuncioPublico[0] ;
         Z192AnuncioId = A192AnuncioId ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load099( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey099( ) ;
         }
         Gx_mode = sMode9 ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey099( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_090( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency099( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00098 */
         pr_default.execute(6, new Object[] {Long.valueOf(A192AnuncioId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Anuncio"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z193AnuncioTitulo, BC00098_A193AnuncioTitulo[0]) != 0 ) || ( GXutil.strcmp(Z194AnuncioSubTitulo, BC00098_A194AnuncioSubTitulo[0]) != 0 ) || ( GXutil.strcmp(Z197AnuncioDescripcion, BC00098_A197AnuncioDescripcion[0]) != 0 ) || ( Z196AnuncioPublico != BC00098_A196AnuncioPublico[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Anuncio"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         zm099( 0) ;
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00099 */
                  pr_default.execute(7, new Object[] {A193AnuncioTitulo, Boolean.valueOf(n194AnuncioSubTitulo), A194AnuncioSubTitulo, A197AnuncioDescripcion, Boolean.valueOf(n195AnuncioImagen), A195AnuncioImagen, Boolean.valueOf(n40000AnuncioImagen_GXI), A40000AnuncioImagen_GXI, Boolean.valueOf(n196AnuncioPublico), Boolean.valueOf(A196AnuncioPublico)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000910 */
                  pr_default.execute(8);
                  A192AnuncioId = BC000910_A192AnuncioId[0] ;
                  pr_default.close(8);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
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
            load099( ) ;
         }
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void update099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000911 */
                  pr_default.execute(9, new Object[] {A193AnuncioTitulo, Boolean.valueOf(n194AnuncioSubTitulo), A194AnuncioSubTitulo, A197AnuncioDescripcion, Boolean.valueOf(n196AnuncioPublico), Boolean.valueOf(A196AnuncioPublico), Long.valueOf(A192AnuncioId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Anuncio"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate099( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
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
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void deferredUpdate099( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor BC000912 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n195AnuncioImagen), A195AnuncioImagen, Boolean.valueOf(n40000AnuncioImagen_GXI), A40000AnuncioImagen_GXI, Long.valueOf(A192AnuncioId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls099( ) ;
         afterConfirm099( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete099( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000913 */
               pr_default.execute(11, new Object[] {Long.valueOf(A192AnuncioId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Anuncio");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel099( ) ;
      Gx_mode = sMode9 ;
   }

   public void onDeleteControls099( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel099( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete099( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart099( )
   {
      /* Scan By routine */
      /* Using cursor BC000914 */
      pr_default.execute(12, new Object[] {Long.valueOf(A192AnuncioId)});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A192AnuncioId = BC000914_A192AnuncioId[0] ;
         A193AnuncioTitulo = BC000914_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = BC000914_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = BC000914_n194AnuncioSubTitulo[0] ;
         A197AnuncioDescripcion = BC000914_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = BC000914_A195AnuncioImagen[0] ;
         n195AnuncioImagen = BC000914_n195AnuncioImagen[0] ;
         A40000AnuncioImagen_GXI = BC000914_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = BC000914_n40000AnuncioImagen_GXI[0] ;
         A196AnuncioPublico = BC000914_A196AnuncioPublico[0] ;
         n196AnuncioPublico = BC000914_n196AnuncioPublico[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext099( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound9 = (short)(0) ;
      scanKeyLoad099( ) ;
   }

   public void scanKeyLoad099( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A192AnuncioId = BC000914_A192AnuncioId[0] ;
         A193AnuncioTitulo = BC000914_A193AnuncioTitulo[0] ;
         A194AnuncioSubTitulo = BC000914_A194AnuncioSubTitulo[0] ;
         n194AnuncioSubTitulo = BC000914_n194AnuncioSubTitulo[0] ;
         A197AnuncioDescripcion = BC000914_A197AnuncioDescripcion[0] ;
         A195AnuncioImagen = BC000914_A195AnuncioImagen[0] ;
         n195AnuncioImagen = BC000914_n195AnuncioImagen[0] ;
         A40000AnuncioImagen_GXI = BC000914_A40000AnuncioImagen_GXI[0] ;
         n40000AnuncioImagen_GXI = BC000914_n40000AnuncioImagen_GXI[0] ;
         A196AnuncioPublico = BC000914_A196AnuncioPublico[0] ;
         n196AnuncioPublico = BC000914_n196AnuncioPublico[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd099( )
   {
      pr_default.close(12);
   }

   public void afterConfirm099( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert099( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate099( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete099( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete099( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate099( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes099( )
   {
   }

   public void send_integrity_lvl_hashes099( )
   {
   }

   public void addRow099( )
   {
      VarsToRow9( bcAnuncio) ;
   }

   public void readRow099( )
   {
      RowToVars9( bcAnuncio, 1) ;
   }

   public void initializeNonKey099( )
   {
      A193AnuncioTitulo = "" ;
      A194AnuncioSubTitulo = "" ;
      n194AnuncioSubTitulo = false ;
      A197AnuncioDescripcion = "" ;
      A195AnuncioImagen = "" ;
      n195AnuncioImagen = false ;
      A40000AnuncioImagen_GXI = "" ;
      n40000AnuncioImagen_GXI = false ;
      A196AnuncioPublico = false ;
      n196AnuncioPublico = false ;
      Z193AnuncioTitulo = "" ;
      Z194AnuncioSubTitulo = "" ;
      Z197AnuncioDescripcion = "" ;
      Z196AnuncioPublico = false ;
   }

   public void initAll099( )
   {
      A192AnuncioId = 1 ;
      initializeNonKey099( ) ;
   }

   public void standaloneModalInsert( )
   {
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

   public void VarsToRow9( com.colaveco.SdtAnuncio obj9 )
   {
      obj9.setgxTv_SdtAnuncio_Mode( Gx_mode );
      obj9.setgxTv_SdtAnuncio_Anunciotitulo( A193AnuncioTitulo );
      obj9.setgxTv_SdtAnuncio_Anunciosubtitulo( A194AnuncioSubTitulo );
      obj9.setgxTv_SdtAnuncio_Anunciodescripcion( A197AnuncioDescripcion );
      obj9.setgxTv_SdtAnuncio_Anuncioimagen( A195AnuncioImagen );
      obj9.setgxTv_SdtAnuncio_Anuncioimagen_gxi( A40000AnuncioImagen_GXI );
      obj9.setgxTv_SdtAnuncio_Anunciopublico( A196AnuncioPublico );
      obj9.setgxTv_SdtAnuncio_Anuncioid( A192AnuncioId );
      obj9.setgxTv_SdtAnuncio_Anuncioid_Z( Z192AnuncioId );
      obj9.setgxTv_SdtAnuncio_Anunciotitulo_Z( Z193AnuncioTitulo );
      obj9.setgxTv_SdtAnuncio_Anunciosubtitulo_Z( Z194AnuncioSubTitulo );
      obj9.setgxTv_SdtAnuncio_Anunciodescripcion_Z( Z197AnuncioDescripcion );
      obj9.setgxTv_SdtAnuncio_Anunciopublico_Z( Z196AnuncioPublico );
      obj9.setgxTv_SdtAnuncio_Anuncioimagen_gxi_Z( Z40000AnuncioImagen_GXI );
      obj9.setgxTv_SdtAnuncio_Anunciosubtitulo_N( (byte)((byte)((n194AnuncioSubTitulo)?1:0)) );
      obj9.setgxTv_SdtAnuncio_Anuncioimagen_N( (byte)((byte)((n195AnuncioImagen)?1:0)) );
      obj9.setgxTv_SdtAnuncio_Anunciopublico_N( (byte)((byte)((n196AnuncioPublico)?1:0)) );
      obj9.setgxTv_SdtAnuncio_Anuncioimagen_gxi_N( (byte)((byte)((n40000AnuncioImagen_GXI)?1:0)) );
      obj9.setgxTv_SdtAnuncio_Mode( Gx_mode );
   }

   public void KeyVarsToRow9( com.colaveco.SdtAnuncio obj9 )
   {
      obj9.setgxTv_SdtAnuncio_Anuncioid( A192AnuncioId );
   }

   public void RowToVars9( com.colaveco.SdtAnuncio obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_SdtAnuncio_Mode() ;
      A193AnuncioTitulo = obj9.getgxTv_SdtAnuncio_Anunciotitulo() ;
      A194AnuncioSubTitulo = obj9.getgxTv_SdtAnuncio_Anunciosubtitulo() ;
      n194AnuncioSubTitulo = false ;
      A197AnuncioDescripcion = obj9.getgxTv_SdtAnuncio_Anunciodescripcion() ;
      A195AnuncioImagen = obj9.getgxTv_SdtAnuncio_Anuncioimagen() ;
      n195AnuncioImagen = false ;
      A40000AnuncioImagen_GXI = obj9.getgxTv_SdtAnuncio_Anuncioimagen_gxi() ;
      n40000AnuncioImagen_GXI = false ;
      A196AnuncioPublico = obj9.getgxTv_SdtAnuncio_Anunciopublico() ;
      n196AnuncioPublico = false ;
      A192AnuncioId = obj9.getgxTv_SdtAnuncio_Anuncioid() ;
      Z192AnuncioId = obj9.getgxTv_SdtAnuncio_Anuncioid_Z() ;
      Z193AnuncioTitulo = obj9.getgxTv_SdtAnuncio_Anunciotitulo_Z() ;
      Z194AnuncioSubTitulo = obj9.getgxTv_SdtAnuncio_Anunciosubtitulo_Z() ;
      Z197AnuncioDescripcion = obj9.getgxTv_SdtAnuncio_Anunciodescripcion_Z() ;
      Z196AnuncioPublico = obj9.getgxTv_SdtAnuncio_Anunciopublico_Z() ;
      Z40000AnuncioImagen_GXI = obj9.getgxTv_SdtAnuncio_Anuncioimagen_gxi_Z() ;
      n194AnuncioSubTitulo = (boolean)((obj9.getgxTv_SdtAnuncio_Anunciosubtitulo_N()==0)?false:true) ;
      n195AnuncioImagen = (boolean)((obj9.getgxTv_SdtAnuncio_Anuncioimagen_N()==0)?false:true) ;
      n196AnuncioPublico = (boolean)((obj9.getgxTv_SdtAnuncio_Anunciopublico_N()==0)?false:true) ;
      n40000AnuncioImagen_GXI = (boolean)((obj9.getgxTv_SdtAnuncio_Anuncioimagen_gxi_N()==0)?false:true) ;
      Gx_mode = obj9.getgxTv_SdtAnuncio_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A192AnuncioId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey099( ) ;
      scanKeyStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z192AnuncioId = A192AnuncioId ;
      }
      zm099( -2) ;
      onLoadActions099( ) ;
      addRow099( ) ;
      scanKeyEnd099( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars9( bcAnuncio, 0) ;
      scanKeyStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z192AnuncioId = A192AnuncioId ;
      }
      zm099( -2) ;
      onLoadActions099( ) ;
      addRow099( ) ;
      scanKeyEnd099( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey099( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert099( ) ;
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( A192AnuncioId != Z192AnuncioId )
            {
               A192AnuncioId = Z192AnuncioId ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update099( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( A192AnuncioId != Z192AnuncioId )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert099( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert099( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars9( bcAnuncio, 1) ;
      saveImpl( ) ;
      VarsToRow9( bcAnuncio) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars9( bcAnuncio, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert099( ) ;
      afterTrn( ) ;
      VarsToRow9( bcAnuncio) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         com.colaveco.SdtAnuncio auxBC = new com.colaveco.SdtAnuncio( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A192AnuncioId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcAnuncio);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars9( bcAnuncio, 1) ;
      updateImpl( ) ;
      VarsToRow9( bcAnuncio) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars9( bcAnuncio, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert099( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow9( bcAnuncio) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars9( bcAnuncio, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey099( ) ;
      if ( RcdFound9 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A192AnuncioId != Z192AnuncioId )
         {
            A192AnuncioId = Z192AnuncioId ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( A192AnuncioId != Z192AnuncioId )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "anuncio_bc");
      VarsToRow9( bcAnuncio) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcAnuncio.getgxTv_SdtAnuncio_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcAnuncio.setgxTv_SdtAnuncio_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtAnuncio sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcAnuncio )
      {
         bcAnuncio = sdt ;
         if ( GXutil.strcmp(bcAnuncio.getgxTv_SdtAnuncio_Mode(), "") == 0 )
         {
            bcAnuncio.setgxTv_SdtAnuncio_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow9( bcAnuncio) ;
         }
         else
         {
            RowToVars9( bcAnuncio, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcAnuncio.getgxTv_SdtAnuncio_Mode(), "") == 0 )
         {
            bcAnuncio.setgxTv_SdtAnuncio_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars9( bcAnuncio, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtAnuncio getAnuncio_BC( )
   {
      return bcAnuncio ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
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
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      BC00094_A192AnuncioId = new long[1] ;
      BC00094_A193AnuncioTitulo = new String[] {""} ;
      BC00094_A194AnuncioSubTitulo = new String[] {""} ;
      BC00094_n194AnuncioSubTitulo = new boolean[] {false} ;
      BC00094_A197AnuncioDescripcion = new String[] {""} ;
      BC00094_A195AnuncioImagen = new String[] {""} ;
      BC00094_n195AnuncioImagen = new boolean[] {false} ;
      BC00094_A40000AnuncioImagen_GXI = new String[] {""} ;
      BC00094_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      BC00094_A196AnuncioPublico = new boolean[] {false} ;
      BC00094_n196AnuncioPublico = new boolean[] {false} ;
      A193AnuncioTitulo = "" ;
      A194AnuncioSubTitulo = "" ;
      A197AnuncioDescripcion = "" ;
      A195AnuncioImagen = "" ;
      A40000AnuncioImagen_GXI = "" ;
      gx_restcollection = new GXBCCollection<com.colaveco.SdtAnuncio>(com.colaveco.SdtAnuncio.class, "Anuncio", "Colaveco", remoteHandle);
      sMode9 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z193AnuncioTitulo = "" ;
      Z194AnuncioSubTitulo = "" ;
      Z197AnuncioDescripcion = "" ;
      Z195AnuncioImagen = "" ;
      Z40000AnuncioImagen_GXI = "" ;
      BC00095_A192AnuncioId = new long[1] ;
      BC00095_A193AnuncioTitulo = new String[] {""} ;
      BC00095_A194AnuncioSubTitulo = new String[] {""} ;
      BC00095_n194AnuncioSubTitulo = new boolean[] {false} ;
      BC00095_A197AnuncioDescripcion = new String[] {""} ;
      BC00095_A195AnuncioImagen = new String[] {""} ;
      BC00095_n195AnuncioImagen = new boolean[] {false} ;
      BC00095_A40000AnuncioImagen_GXI = new String[] {""} ;
      BC00095_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      BC00095_A196AnuncioPublico = new boolean[] {false} ;
      BC00095_n196AnuncioPublico = new boolean[] {false} ;
      BC00096_A192AnuncioId = new long[1] ;
      BC00097_A192AnuncioId = new long[1] ;
      BC00097_A193AnuncioTitulo = new String[] {""} ;
      BC00097_A194AnuncioSubTitulo = new String[] {""} ;
      BC00097_n194AnuncioSubTitulo = new boolean[] {false} ;
      BC00097_A197AnuncioDescripcion = new String[] {""} ;
      BC00097_A195AnuncioImagen = new String[] {""} ;
      BC00097_n195AnuncioImagen = new boolean[] {false} ;
      BC00097_A40000AnuncioImagen_GXI = new String[] {""} ;
      BC00097_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      BC00097_A196AnuncioPublico = new boolean[] {false} ;
      BC00097_n196AnuncioPublico = new boolean[] {false} ;
      BC00098_A192AnuncioId = new long[1] ;
      BC00098_A193AnuncioTitulo = new String[] {""} ;
      BC00098_A194AnuncioSubTitulo = new String[] {""} ;
      BC00098_n194AnuncioSubTitulo = new boolean[] {false} ;
      BC00098_A197AnuncioDescripcion = new String[] {""} ;
      BC00098_A195AnuncioImagen = new String[] {""} ;
      BC00098_n195AnuncioImagen = new boolean[] {false} ;
      BC00098_A40000AnuncioImagen_GXI = new String[] {""} ;
      BC00098_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      BC00098_A196AnuncioPublico = new boolean[] {false} ;
      BC00098_n196AnuncioPublico = new boolean[] {false} ;
      BC000910_A192AnuncioId = new long[1] ;
      BC000914_A192AnuncioId = new long[1] ;
      BC000914_A193AnuncioTitulo = new String[] {""} ;
      BC000914_A194AnuncioSubTitulo = new String[] {""} ;
      BC000914_n194AnuncioSubTitulo = new boolean[] {false} ;
      BC000914_A197AnuncioDescripcion = new String[] {""} ;
      BC000914_A195AnuncioImagen = new String[] {""} ;
      BC000914_n195AnuncioImagen = new boolean[] {false} ;
      BC000914_A40000AnuncioImagen_GXI = new String[] {""} ;
      BC000914_n40000AnuncioImagen_GXI = new boolean[] {false} ;
      BC000914_A196AnuncioPublico = new boolean[] {false} ;
      BC000914_n196AnuncioPublico = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.anuncio_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.anuncio_bc__default(),
         new Object[] {
             new Object[] {
            BC00092_A192AnuncioId, BC00092_A193AnuncioTitulo, BC00092_A194AnuncioSubTitulo, BC00092_n194AnuncioSubTitulo, BC00092_A197AnuncioDescripcion, BC00092_A195AnuncioImagen, BC00092_n195AnuncioImagen, BC00092_A40000AnuncioImagen_GXI, BC00092_n40000AnuncioImagen_GXI, BC00092_A196AnuncioPublico,
            BC00092_n196AnuncioPublico
            }
            , new Object[] {
            BC00093_A192AnuncioId, BC00093_A193AnuncioTitulo, BC00093_A194AnuncioSubTitulo, BC00093_n194AnuncioSubTitulo, BC00093_A197AnuncioDescripcion, BC00093_A195AnuncioImagen, BC00093_n195AnuncioImagen, BC00093_A40000AnuncioImagen_GXI, BC00093_n40000AnuncioImagen_GXI, BC00093_A196AnuncioPublico,
            BC00093_n196AnuncioPublico
            }
            , new Object[] {
            BC00094_A192AnuncioId, BC00094_A193AnuncioTitulo, BC00094_A194AnuncioSubTitulo, BC00094_n194AnuncioSubTitulo, BC00094_A197AnuncioDescripcion, BC00094_A195AnuncioImagen, BC00094_n195AnuncioImagen, BC00094_A40000AnuncioImagen_GXI, BC00094_n40000AnuncioImagen_GXI, BC00094_A196AnuncioPublico,
            BC00094_n196AnuncioPublico
            }
            , new Object[] {
            BC00095_A192AnuncioId, BC00095_A193AnuncioTitulo, BC00095_A194AnuncioSubTitulo, BC00095_n194AnuncioSubTitulo, BC00095_A197AnuncioDescripcion, BC00095_A195AnuncioImagen, BC00095_n195AnuncioImagen, BC00095_A40000AnuncioImagen_GXI, BC00095_n40000AnuncioImagen_GXI, BC00095_A196AnuncioPublico,
            BC00095_n196AnuncioPublico
            }
            , new Object[] {
            BC00096_A192AnuncioId
            }
            , new Object[] {
            BC00097_A192AnuncioId, BC00097_A193AnuncioTitulo, BC00097_A194AnuncioSubTitulo, BC00097_n194AnuncioSubTitulo, BC00097_A197AnuncioDescripcion, BC00097_A195AnuncioImagen, BC00097_n195AnuncioImagen, BC00097_A40000AnuncioImagen_GXI, BC00097_n40000AnuncioImagen_GXI, BC00097_A196AnuncioPublico,
            BC00097_n196AnuncioPublico
            }
            , new Object[] {
            BC00098_A192AnuncioId, BC00098_A193AnuncioTitulo, BC00098_A194AnuncioSubTitulo, BC00098_n194AnuncioSubTitulo, BC00098_A197AnuncioDescripcion, BC00098_A195AnuncioImagen, BC00098_n195AnuncioImagen, BC00098_A40000AnuncioImagen_GXI, BC00098_n40000AnuncioImagen_GXI, BC00098_A196AnuncioPublico,
            BC00098_n196AnuncioPublico
            }
            , new Object[] {
            }
            , new Object[] {
            BC000910_A192AnuncioId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000914_A192AnuncioId, BC000914_A193AnuncioTitulo, BC000914_A194AnuncioSubTitulo, BC000914_n194AnuncioSubTitulo, BC000914_A197AnuncioDescripcion, BC000914_A195AnuncioImagen, BC000914_n195AnuncioImagen, BC000914_A40000AnuncioImagen_GXI, BC000914_n40000AnuncioImagen_GXI, BC000914_A196AnuncioPublico,
            BC000914_n196AnuncioPublico
            }
         }
      );
      A192AnuncioId = 1 ;
      Z192AnuncioId = 1 ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e12092 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private short nIsDirty_9 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom9 ;
   private int GXPagingTo9 ;
   private int GX_JID ;
   private long A192AnuncioId ;
   private long Z192AnuncioId ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode9 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private boolean n194AnuncioSubTitulo ;
   private boolean n195AnuncioImagen ;
   private boolean n40000AnuncioImagen_GXI ;
   private boolean A196AnuncioPublico ;
   private boolean n196AnuncioPublico ;
   private boolean returnInSub ;
   private boolean Z196AnuncioPublico ;
   private boolean mustCommit ;
   private String A193AnuncioTitulo ;
   private String A194AnuncioSubTitulo ;
   private String A197AnuncioDescripcion ;
   private String A40000AnuncioImagen_GXI ;
   private String Z193AnuncioTitulo ;
   private String Z194AnuncioSubTitulo ;
   private String Z197AnuncioDescripcion ;
   private String Z40000AnuncioImagen_GXI ;
   private String A195AnuncioImagen ;
   private String Z195AnuncioImagen ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtAnuncio> gx_restcollection ;
   private com.colaveco.SdtAnuncio bcAnuncio ;
   private com.colaveco.SdtAnuncio gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00094_A192AnuncioId ;
   private String[] BC00094_A193AnuncioTitulo ;
   private String[] BC00094_A194AnuncioSubTitulo ;
   private boolean[] BC00094_n194AnuncioSubTitulo ;
   private String[] BC00094_A197AnuncioDescripcion ;
   private String[] BC00094_A195AnuncioImagen ;
   private boolean[] BC00094_n195AnuncioImagen ;
   private String[] BC00094_A40000AnuncioImagen_GXI ;
   private boolean[] BC00094_n40000AnuncioImagen_GXI ;
   private boolean[] BC00094_A196AnuncioPublico ;
   private boolean[] BC00094_n196AnuncioPublico ;
   private long[] BC00095_A192AnuncioId ;
   private String[] BC00095_A193AnuncioTitulo ;
   private String[] BC00095_A194AnuncioSubTitulo ;
   private boolean[] BC00095_n194AnuncioSubTitulo ;
   private String[] BC00095_A197AnuncioDescripcion ;
   private String[] BC00095_A195AnuncioImagen ;
   private boolean[] BC00095_n195AnuncioImagen ;
   private String[] BC00095_A40000AnuncioImagen_GXI ;
   private boolean[] BC00095_n40000AnuncioImagen_GXI ;
   private boolean[] BC00095_A196AnuncioPublico ;
   private boolean[] BC00095_n196AnuncioPublico ;
   private long[] BC00096_A192AnuncioId ;
   private long[] BC00097_A192AnuncioId ;
   private String[] BC00097_A193AnuncioTitulo ;
   private String[] BC00097_A194AnuncioSubTitulo ;
   private boolean[] BC00097_n194AnuncioSubTitulo ;
   private String[] BC00097_A197AnuncioDescripcion ;
   private String[] BC00097_A195AnuncioImagen ;
   private boolean[] BC00097_n195AnuncioImagen ;
   private String[] BC00097_A40000AnuncioImagen_GXI ;
   private boolean[] BC00097_n40000AnuncioImagen_GXI ;
   private boolean[] BC00097_A196AnuncioPublico ;
   private boolean[] BC00097_n196AnuncioPublico ;
   private long[] BC00098_A192AnuncioId ;
   private String[] BC00098_A193AnuncioTitulo ;
   private String[] BC00098_A194AnuncioSubTitulo ;
   private boolean[] BC00098_n194AnuncioSubTitulo ;
   private String[] BC00098_A197AnuncioDescripcion ;
   private String[] BC00098_A195AnuncioImagen ;
   private boolean[] BC00098_n195AnuncioImagen ;
   private String[] BC00098_A40000AnuncioImagen_GXI ;
   private boolean[] BC00098_n40000AnuncioImagen_GXI ;
   private boolean[] BC00098_A196AnuncioPublico ;
   private boolean[] BC00098_n196AnuncioPublico ;
   private long[] BC000910_A192AnuncioId ;
   private long[] BC000914_A192AnuncioId ;
   private String[] BC000914_A193AnuncioTitulo ;
   private String[] BC000914_A194AnuncioSubTitulo ;
   private boolean[] BC000914_n194AnuncioSubTitulo ;
   private String[] BC000914_A197AnuncioDescripcion ;
   private String[] BC000914_A195AnuncioImagen ;
   private boolean[] BC000914_n195AnuncioImagen ;
   private String[] BC000914_A40000AnuncioImagen_GXI ;
   private boolean[] BC000914_n40000AnuncioImagen_GXI ;
   private boolean[] BC000914_A196AnuncioPublico ;
   private boolean[] BC000914_n196AnuncioPublico ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00092_A192AnuncioId ;
   private String[] BC00092_A193AnuncioTitulo ;
   private String[] BC00092_A194AnuncioSubTitulo ;
   private String[] BC00092_A197AnuncioDescripcion ;
   private String[] BC00092_A195AnuncioImagen ;
   private String[] BC00092_A40000AnuncioImagen_GXI ;
   private boolean[] BC00092_A196AnuncioPublico ;
   private long[] BC00093_A192AnuncioId ;
   private String[] BC00093_A193AnuncioTitulo ;
   private String[] BC00093_A194AnuncioSubTitulo ;
   private String[] BC00093_A197AnuncioDescripcion ;
   private String[] BC00093_A195AnuncioImagen ;
   private String[] BC00093_A40000AnuncioImagen_GXI ;
   private boolean[] BC00093_A196AnuncioPublico ;
   private boolean[] BC00092_n194AnuncioSubTitulo ;
   private boolean[] BC00092_n195AnuncioImagen ;
   private boolean[] BC00092_n40000AnuncioImagen_GXI ;
   private boolean[] BC00092_n196AnuncioPublico ;
   private boolean[] BC00093_n194AnuncioSubTitulo ;
   private boolean[] BC00093_n195AnuncioImagen ;
   private boolean[] BC00093_n40000AnuncioImagen_GXI ;
   private boolean[] BC00093_n196AnuncioPublico ;
}

final  class anuncio_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class anuncio_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00092", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00093", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00094", "SELECT TM1.`AnuncioId`, TM1.`AnuncioTitulo`, TM1.`AnuncioSubTitulo`, TM1.`AnuncioDescripcion`, TM1.`AnuncioImagen`, TM1.`AnuncioImagen_GXI`, TM1.`AnuncioPublico` FROM `Anuncio` TM1 ORDER BY TM1.`AnuncioId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00095", "SELECT TM1.`AnuncioId`, TM1.`AnuncioTitulo`, TM1.`AnuncioSubTitulo`, TM1.`AnuncioDescripcion`, TM1.`AnuncioImagen`, TM1.`AnuncioImagen_GXI`, TM1.`AnuncioPublico` FROM `Anuncio` TM1 WHERE TM1.`AnuncioId` = ? ORDER BY TM1.`AnuncioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00096", "SELECT `AnuncioId` FROM `Anuncio` WHERE `AnuncioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00097", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00098", "SELECT `AnuncioId`, `AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico` FROM `Anuncio` WHERE `AnuncioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00099", "INSERT INTO `Anuncio`(`AnuncioTitulo`, `AnuncioSubTitulo`, `AnuncioDescripcion`, `AnuncioImagen`, `AnuncioImagen_GXI`, `AnuncioPublico`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("BC000910", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000911", "UPDATE `Anuncio` SET `AnuncioTitulo`=?, `AnuncioSubTitulo`=?, `AnuncioDescripcion`=?, `AnuncioPublico`=?  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000912", "UPDATE `Anuncio` SET `AnuncioImagen`=?, `AnuncioImagen_GXI`=?  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000913", "DELETE FROM `Anuncio`  WHERE `AnuncioId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000914", "SELECT TM1.`AnuncioId`, TM1.`AnuncioTitulo`, TM1.`AnuncioSubTitulo`, TM1.`AnuncioDescripcion`, TM1.`AnuncioImagen`, TM1.`AnuncioImagen_GXI`, TM1.`AnuncioPublico` FROM `Anuncio` TM1 WHERE TM1.`AnuncioId` = ? ORDER BY TM1.`AnuncioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 40);
               }
               stmt.setVarchar(3, (String)parms[3], 256, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(4, (String)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(5, (String)parms[7], (String)parms[5], 2048,"Anuncio","AnuncioImagen");
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(6, ((Boolean) parms[9]).booleanValue());
               }
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 40);
               }
               stmt.setVarchar(3, (String)parms[3], 256, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(4, ((Boolean) parms[5]).booleanValue());
               }
               stmt.setLong(5, ((Number) parms[6]).longValue());
               return;
            case 10 :
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
                  stmt.setGXDbFileURI(2, (String)parms[3], (String)parms[1], 2048,"Anuncio","AnuncioImagen");
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

