package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class notificaciones_bc extends GXWebPanel implements IGxSilentTrn
{
   public notificaciones_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public notificaciones_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( notificaciones_bc.class ));
   }

   public notificaciones_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtNotificaciones> GetAll( int Start ,
                                                                 int Count )
   {
      GXPagingFrom6 = Start ;
      GXPagingTo6 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00064 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom6), Integer.valueOf(GXPagingTo6)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = BC00064_A6NotificacionesId[0] ;
         A169NotificacionesFecha = BC00064_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = BC00064_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = BC00064_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = BC00064_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = BC00064_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = BC00064_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = BC00064_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = BC00064_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = BC00064_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = BC00064_n173NotificacionesDetalle[0] ;
      }
      bcNotificaciones = new com.colaveco.SdtNotificaciones(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound6 != 0 )
      {
         onLoadActions066( ) ;
         addRow066( ) ;
         gx_sdt_item = bcNotificaciones.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound6 = (short)(0) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound6 = (short)(1) ;
            A6NotificacionesId = BC00064_A6NotificacionesId[0] ;
            A169NotificacionesFecha = BC00064_A169NotificacionesFecha[0] ;
            n169NotificacionesFecha = BC00064_n169NotificacionesFecha[0] ;
            A170NotificacionesTipo = BC00064_A170NotificacionesTipo[0] ;
            n170NotificacionesTipo = BC00064_n170NotificacionesTipo[0] ;
            A171NotificacionesMensaje = BC00064_A171NotificacionesMensaje[0] ;
            n171NotificacionesMensaje = BC00064_n171NotificacionesMensaje[0] ;
            A172NotificacionesIdNetUsuario = BC00064_A172NotificacionesIdNetUsuario[0] ;
            n172NotificacionesIdNetUsuario = BC00064_n172NotificacionesIdNetUsuario[0] ;
            A173NotificacionesDetalle = BC00064_A173NotificacionesDetalle[0] ;
            n173NotificacionesDetalle = BC00064_n173NotificacionesDetalle[0] ;
         }
         Gx_mode = sMode6 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm066( 0) ;
   }

   public void getInsDefault( )
   {
      readRow066( ) ;
      standaloneNotModal( ) ;
      initializeNonKey066( ) ;
      standaloneModal( ) ;
      addRow066( ) ;
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
         e11062 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z6NotificacionesId = A6NotificacionesId ;
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
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors066( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e12062( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e11062( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z169NotificacionesFecha = A169NotificacionesFecha ;
         Z170NotificacionesTipo = A170NotificacionesTipo ;
         Z171NotificacionesMensaje = A171NotificacionesMensaje ;
         Z172NotificacionesIdNetUsuario = A172NotificacionesIdNetUsuario ;
         Z173NotificacionesDetalle = A173NotificacionesDetalle ;
      }
      if ( GX_JID == -2 )
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
   }

   public void standaloneModal( )
   {
   }

   public void load066( )
   {
      /* Using cursor BC00065 */
      pr_default.execute(3, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A169NotificacionesFecha = BC00065_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = BC00065_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = BC00065_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = BC00065_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = BC00065_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = BC00065_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = BC00065_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = BC00065_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = BC00065_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = BC00065_n173NotificacionesDetalle[0] ;
         zm066( -2) ;
      }
      pr_default.close(3);
      onLoadActions066( ) ;
   }

   public void onLoadActions066( )
   {
   }

   public void checkExtendedTable066( )
   {
      nIsDirty_6 = (short)(0) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A169NotificacionesFecha) || (( A169NotificacionesFecha.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A169NotificacionesFecha, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field Notificaciones Fecha is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      /* Using cursor BC00066 */
      pr_default.execute(4, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00067 */
      pr_default.execute(5, new Object[] {Long.valueOf(A6NotificacionesId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm066( 2) ;
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = BC00067_A6NotificacionesId[0] ;
         A169NotificacionesFecha = BC00067_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = BC00067_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = BC00067_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = BC00067_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = BC00067_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = BC00067_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = BC00067_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = BC00067_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = BC00067_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = BC00067_n173NotificacionesDetalle[0] ;
         Z6NotificacionesId = A6NotificacionesId ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load066( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey066( ) ;
         }
         Gx_mode = sMode6 ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
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
      confirm_060( ) ;
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

   public void checkOptimisticConcurrency066( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00068 */
         pr_default.execute(6, new Object[] {Long.valueOf(A6NotificacionesId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Notificaciones"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || !( GXutil.dateCompare(Z169NotificacionesFecha, BC00068_A169NotificacionesFecha[0]) ) || ( GXutil.strcmp(Z170NotificacionesTipo, BC00068_A170NotificacionesTipo[0]) != 0 ) || ( GXutil.strcmp(Z171NotificacionesMensaje, BC00068_A171NotificacionesMensaje[0]) != 0 ) || ( Z172NotificacionesIdNetUsuario != BC00068_A172NotificacionesIdNetUsuario[0] ) || ( GXutil.strcmp(Z173NotificacionesDetalle, BC00068_A173NotificacionesDetalle[0]) != 0 ) )
         {
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
                  /* Using cursor BC00069 */
                  pr_default.execute(7, new Object[] {Long.valueOf(A6NotificacionesId), Boolean.valueOf(n169NotificacionesFecha), A169NotificacionesFecha, Boolean.valueOf(n170NotificacionesTipo), A170NotificacionesTipo, Boolean.valueOf(n171NotificacionesMensaje), A171NotificacionesMensaje, Boolean.valueOf(n172NotificacionesIdNetUsuario), Long.valueOf(A172NotificacionesIdNetUsuario), Boolean.valueOf(n173NotificacionesDetalle), A173NotificacionesDetalle});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
                  if ( (pr_default.getStatus(7) == 1) )
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
                  /* Using cursor BC000610 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n169NotificacionesFecha), A169NotificacionesFecha, Boolean.valueOf(n170NotificacionesTipo), A170NotificacionesTipo, Boolean.valueOf(n171NotificacionesMensaje), A171NotificacionesMensaje, Boolean.valueOf(n172NotificacionesIdNetUsuario), Long.valueOf(A172NotificacionesIdNetUsuario), Boolean.valueOf(n173NotificacionesDetalle), A173NotificacionesDetalle, Long.valueOf(A6NotificacionesId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
                  if ( (pr_default.getStatus(8) == 103) )
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
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void deferredUpdate066( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
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
               /* Using cursor BC000611 */
               pr_default.execute(9, new Object[] {Long.valueOf(A6NotificacionesId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Notificaciones");
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel066( ) ;
      Gx_mode = sMode6 ;
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel066( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
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

   public void scanKeyStart066( )
   {
      /* Scan By routine */
      /* Using cursor BC000612 */
      pr_default.execute(10, new Object[] {Long.valueOf(A6NotificacionesId)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = BC000612_A6NotificacionesId[0] ;
         A169NotificacionesFecha = BC000612_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = BC000612_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = BC000612_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = BC000612_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = BC000612_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = BC000612_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = BC000612_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = BC000612_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = BC000612_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = BC000612_n173NotificacionesDetalle[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext066( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound6 = (short)(0) ;
      scanKeyLoad066( ) ;
   }

   public void scanKeyLoad066( )
   {
      sMode6 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6NotificacionesId = BC000612_A6NotificacionesId[0] ;
         A169NotificacionesFecha = BC000612_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = BC000612_n169NotificacionesFecha[0] ;
         A170NotificacionesTipo = BC000612_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = BC000612_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = BC000612_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = BC000612_n171NotificacionesMensaje[0] ;
         A172NotificacionesIdNetUsuario = BC000612_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = BC000612_n172NotificacionesIdNetUsuario[0] ;
         A173NotificacionesDetalle = BC000612_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = BC000612_n173NotificacionesDetalle[0] ;
      }
      Gx_mode = sMode6 ;
   }

   public void scanKeyEnd066( )
   {
      pr_default.close(10);
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
   }

   public void send_integrity_lvl_hashes066( )
   {
   }

   public void addRow066( )
   {
      VarsToRow6( bcNotificaciones) ;
   }

   public void readRow066( )
   {
      RowToVars6( bcNotificaciones, 1) ;
   }

   public void initializeNonKey066( )
   {
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      n169NotificacionesFecha = false ;
      A170NotificacionesTipo = "" ;
      n170NotificacionesTipo = false ;
      A171NotificacionesMensaje = "" ;
      n171NotificacionesMensaje = false ;
      A172NotificacionesIdNetUsuario = 0 ;
      n172NotificacionesIdNetUsuario = false ;
      A173NotificacionesDetalle = "" ;
      n173NotificacionesDetalle = false ;
      Z169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      Z170NotificacionesTipo = "" ;
      Z171NotificacionesMensaje = "" ;
      Z172NotificacionesIdNetUsuario = 0 ;
      Z173NotificacionesDetalle = "" ;
   }

   public void initAll066( )
   {
      A6NotificacionesId = 0 ;
      initializeNonKey066( ) ;
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

   public void VarsToRow6( com.colaveco.SdtNotificaciones obj6 )
   {
      obj6.setgxTv_SdtNotificaciones_Mode( Gx_mode );
      obj6.setgxTv_SdtNotificaciones_Notificacionesfecha( A169NotificacionesFecha );
      obj6.setgxTv_SdtNotificaciones_Notificacionestipo( A170NotificacionesTipo );
      obj6.setgxTv_SdtNotificaciones_Notificacionesmensaje( A171NotificacionesMensaje );
      obj6.setgxTv_SdtNotificaciones_Notificacionesidnetusuario( A172NotificacionesIdNetUsuario );
      obj6.setgxTv_SdtNotificaciones_Notificacionesdetalle( A173NotificacionesDetalle );
      obj6.setgxTv_SdtNotificaciones_Notificacionesid( A6NotificacionesId );
      obj6.setgxTv_SdtNotificaciones_Notificacionesid_Z( Z6NotificacionesId );
      obj6.setgxTv_SdtNotificaciones_Notificacionesfecha_Z( Z169NotificacionesFecha );
      obj6.setgxTv_SdtNotificaciones_Notificacionestipo_Z( Z170NotificacionesTipo );
      obj6.setgxTv_SdtNotificaciones_Notificacionesmensaje_Z( Z171NotificacionesMensaje );
      obj6.setgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z( Z172NotificacionesIdNetUsuario );
      obj6.setgxTv_SdtNotificaciones_Notificacionesdetalle_Z( Z173NotificacionesDetalle );
      obj6.setgxTv_SdtNotificaciones_Notificacionesfecha_N( (byte)((byte)((n169NotificacionesFecha)?1:0)) );
      obj6.setgxTv_SdtNotificaciones_Notificacionestipo_N( (byte)((byte)((n170NotificacionesTipo)?1:0)) );
      obj6.setgxTv_SdtNotificaciones_Notificacionesmensaje_N( (byte)((byte)((n171NotificacionesMensaje)?1:0)) );
      obj6.setgxTv_SdtNotificaciones_Notificacionesidnetusuario_N( (byte)((byte)((n172NotificacionesIdNetUsuario)?1:0)) );
      obj6.setgxTv_SdtNotificaciones_Notificacionesdetalle_N( (byte)((byte)((n173NotificacionesDetalle)?1:0)) );
      obj6.setgxTv_SdtNotificaciones_Mode( Gx_mode );
   }

   public void KeyVarsToRow6( com.colaveco.SdtNotificaciones obj6 )
   {
      obj6.setgxTv_SdtNotificaciones_Notificacionesid( A6NotificacionesId );
   }

   public void RowToVars6( com.colaveco.SdtNotificaciones obj6 ,
                           int forceLoad )
   {
      Gx_mode = obj6.getgxTv_SdtNotificaciones_Mode() ;
      A169NotificacionesFecha = obj6.getgxTv_SdtNotificaciones_Notificacionesfecha() ;
      n169NotificacionesFecha = false ;
      A170NotificacionesTipo = obj6.getgxTv_SdtNotificaciones_Notificacionestipo() ;
      n170NotificacionesTipo = false ;
      A171NotificacionesMensaje = obj6.getgxTv_SdtNotificaciones_Notificacionesmensaje() ;
      n171NotificacionesMensaje = false ;
      A172NotificacionesIdNetUsuario = obj6.getgxTv_SdtNotificaciones_Notificacionesidnetusuario() ;
      n172NotificacionesIdNetUsuario = false ;
      A173NotificacionesDetalle = obj6.getgxTv_SdtNotificaciones_Notificacionesdetalle() ;
      n173NotificacionesDetalle = false ;
      A6NotificacionesId = obj6.getgxTv_SdtNotificaciones_Notificacionesid() ;
      Z6NotificacionesId = obj6.getgxTv_SdtNotificaciones_Notificacionesid_Z() ;
      Z169NotificacionesFecha = obj6.getgxTv_SdtNotificaciones_Notificacionesfecha_Z() ;
      Z170NotificacionesTipo = obj6.getgxTv_SdtNotificaciones_Notificacionestipo_Z() ;
      Z171NotificacionesMensaje = obj6.getgxTv_SdtNotificaciones_Notificacionesmensaje_Z() ;
      Z172NotificacionesIdNetUsuario = obj6.getgxTv_SdtNotificaciones_Notificacionesidnetusuario_Z() ;
      Z173NotificacionesDetalle = obj6.getgxTv_SdtNotificaciones_Notificacionesdetalle_Z() ;
      n169NotificacionesFecha = (boolean)((obj6.getgxTv_SdtNotificaciones_Notificacionesfecha_N()==0)?false:true) ;
      n170NotificacionesTipo = (boolean)((obj6.getgxTv_SdtNotificaciones_Notificacionestipo_N()==0)?false:true) ;
      n171NotificacionesMensaje = (boolean)((obj6.getgxTv_SdtNotificaciones_Notificacionesmensaje_N()==0)?false:true) ;
      n172NotificacionesIdNetUsuario = (boolean)((obj6.getgxTv_SdtNotificaciones_Notificacionesidnetusuario_N()==0)?false:true) ;
      n173NotificacionesDetalle = (boolean)((obj6.getgxTv_SdtNotificaciones_Notificacionesdetalle_N()==0)?false:true) ;
      Gx_mode = obj6.getgxTv_SdtNotificaciones_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A6NotificacionesId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey066( ) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z6NotificacionesId = A6NotificacionesId ;
      }
      zm066( -2) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
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
      RowToVars6( bcNotificaciones, 0) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z6NotificacionesId = A6NotificacionesId ;
      }
      zm066( -2) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey066( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert066( ) ;
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( A6NotificacionesId != Z6NotificacionesId )
            {
               A6NotificacionesId = Z6NotificacionesId ;
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
               update066( ) ;
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
               if ( A6NotificacionesId != Z6NotificacionesId )
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
                     insert066( ) ;
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
                     insert066( ) ;
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
      RowToVars6( bcNotificaciones, 1) ;
      saveImpl( ) ;
      VarsToRow6( bcNotificaciones) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars6( bcNotificaciones, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
      afterTrn( ) ;
      VarsToRow6( bcNotificaciones) ;
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
         com.colaveco.SdtNotificaciones auxBC = new com.colaveco.SdtNotificaciones( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A6NotificacionesId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcNotificaciones);
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
      RowToVars6( bcNotificaciones, 1) ;
      updateImpl( ) ;
      VarsToRow6( bcNotificaciones) ;
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
      RowToVars6( bcNotificaciones, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
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
      VarsToRow6( bcNotificaciones) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars6( bcNotificaciones, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey066( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A6NotificacionesId != Z6NotificacionesId )
         {
            A6NotificacionesId = Z6NotificacionesId ;
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
         if ( A6NotificacionesId != Z6NotificacionesId )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "notificaciones_bc");
      VarsToRow6( bcNotificaciones) ;
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
      Gx_mode = bcNotificaciones.getgxTv_SdtNotificaciones_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcNotificaciones.setgxTv_SdtNotificaciones_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtNotificaciones sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcNotificaciones )
      {
         bcNotificaciones = sdt ;
         if ( GXutil.strcmp(bcNotificaciones.getgxTv_SdtNotificaciones_Mode(), "") == 0 )
         {
            bcNotificaciones.setgxTv_SdtNotificaciones_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow6( bcNotificaciones) ;
         }
         else
         {
            RowToVars6( bcNotificaciones, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcNotificaciones.getgxTv_SdtNotificaciones_Mode(), "") == 0 )
         {
            bcNotificaciones.setgxTv_SdtNotificaciones_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars6( bcNotificaciones, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtNotificaciones getNotificaciones_BC( )
   {
      return bcNotificaciones ;
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
      BC00064_A6NotificacionesId = new long[1] ;
      BC00064_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC00064_n169NotificacionesFecha = new boolean[] {false} ;
      BC00064_A170NotificacionesTipo = new String[] {""} ;
      BC00064_n170NotificacionesTipo = new boolean[] {false} ;
      BC00064_A171NotificacionesMensaje = new String[] {""} ;
      BC00064_n171NotificacionesMensaje = new boolean[] {false} ;
      BC00064_A172NotificacionesIdNetUsuario = new long[1] ;
      BC00064_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      BC00064_A173NotificacionesDetalle = new String[] {""} ;
      BC00064_n173NotificacionesDetalle = new boolean[] {false} ;
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      A170NotificacionesTipo = "" ;
      A171NotificacionesMensaje = "" ;
      A173NotificacionesDetalle = "" ;
      gx_restcollection = new GXBCCollection<com.colaveco.SdtNotificaciones>(com.colaveco.SdtNotificaciones.class, "Notificaciones", "Colaveco", remoteHandle);
      sMode6 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      Z170NotificacionesTipo = "" ;
      Z171NotificacionesMensaje = "" ;
      Z173NotificacionesDetalle = "" ;
      BC00065_A6NotificacionesId = new long[1] ;
      BC00065_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC00065_n169NotificacionesFecha = new boolean[] {false} ;
      BC00065_A170NotificacionesTipo = new String[] {""} ;
      BC00065_n170NotificacionesTipo = new boolean[] {false} ;
      BC00065_A171NotificacionesMensaje = new String[] {""} ;
      BC00065_n171NotificacionesMensaje = new boolean[] {false} ;
      BC00065_A172NotificacionesIdNetUsuario = new long[1] ;
      BC00065_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      BC00065_A173NotificacionesDetalle = new String[] {""} ;
      BC00065_n173NotificacionesDetalle = new boolean[] {false} ;
      BC00066_A6NotificacionesId = new long[1] ;
      BC00067_A6NotificacionesId = new long[1] ;
      BC00067_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC00067_n169NotificacionesFecha = new boolean[] {false} ;
      BC00067_A170NotificacionesTipo = new String[] {""} ;
      BC00067_n170NotificacionesTipo = new boolean[] {false} ;
      BC00067_A171NotificacionesMensaje = new String[] {""} ;
      BC00067_n171NotificacionesMensaje = new boolean[] {false} ;
      BC00067_A172NotificacionesIdNetUsuario = new long[1] ;
      BC00067_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      BC00067_A173NotificacionesDetalle = new String[] {""} ;
      BC00067_n173NotificacionesDetalle = new boolean[] {false} ;
      BC00068_A6NotificacionesId = new long[1] ;
      BC00068_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC00068_n169NotificacionesFecha = new boolean[] {false} ;
      BC00068_A170NotificacionesTipo = new String[] {""} ;
      BC00068_n170NotificacionesTipo = new boolean[] {false} ;
      BC00068_A171NotificacionesMensaje = new String[] {""} ;
      BC00068_n171NotificacionesMensaje = new boolean[] {false} ;
      BC00068_A172NotificacionesIdNetUsuario = new long[1] ;
      BC00068_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      BC00068_A173NotificacionesDetalle = new String[] {""} ;
      BC00068_n173NotificacionesDetalle = new boolean[] {false} ;
      BC000612_A6NotificacionesId = new long[1] ;
      BC000612_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC000612_n169NotificacionesFecha = new boolean[] {false} ;
      BC000612_A170NotificacionesTipo = new String[] {""} ;
      BC000612_n170NotificacionesTipo = new boolean[] {false} ;
      BC000612_A171NotificacionesMensaje = new String[] {""} ;
      BC000612_n171NotificacionesMensaje = new boolean[] {false} ;
      BC000612_A172NotificacionesIdNetUsuario = new long[1] ;
      BC000612_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      BC000612_A173NotificacionesDetalle = new String[] {""} ;
      BC000612_n173NotificacionesDetalle = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.notificaciones_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.notificaciones_bc__default(),
         new Object[] {
             new Object[] {
            BC00062_A6NotificacionesId, BC00062_A169NotificacionesFecha, BC00062_n169NotificacionesFecha, BC00062_A170NotificacionesTipo, BC00062_n170NotificacionesTipo, BC00062_A171NotificacionesMensaje, BC00062_n171NotificacionesMensaje, BC00062_A172NotificacionesIdNetUsuario, BC00062_n172NotificacionesIdNetUsuario, BC00062_A173NotificacionesDetalle,
            BC00062_n173NotificacionesDetalle
            }
            , new Object[] {
            BC00063_A6NotificacionesId, BC00063_A169NotificacionesFecha, BC00063_n169NotificacionesFecha, BC00063_A170NotificacionesTipo, BC00063_n170NotificacionesTipo, BC00063_A171NotificacionesMensaje, BC00063_n171NotificacionesMensaje, BC00063_A172NotificacionesIdNetUsuario, BC00063_n172NotificacionesIdNetUsuario, BC00063_A173NotificacionesDetalle,
            BC00063_n173NotificacionesDetalle
            }
            , new Object[] {
            BC00064_A6NotificacionesId, BC00064_A169NotificacionesFecha, BC00064_n169NotificacionesFecha, BC00064_A170NotificacionesTipo, BC00064_n170NotificacionesTipo, BC00064_A171NotificacionesMensaje, BC00064_n171NotificacionesMensaje, BC00064_A172NotificacionesIdNetUsuario, BC00064_n172NotificacionesIdNetUsuario, BC00064_A173NotificacionesDetalle,
            BC00064_n173NotificacionesDetalle
            }
            , new Object[] {
            BC00065_A6NotificacionesId, BC00065_A169NotificacionesFecha, BC00065_n169NotificacionesFecha, BC00065_A170NotificacionesTipo, BC00065_n170NotificacionesTipo, BC00065_A171NotificacionesMensaje, BC00065_n171NotificacionesMensaje, BC00065_A172NotificacionesIdNetUsuario, BC00065_n172NotificacionesIdNetUsuario, BC00065_A173NotificacionesDetalle,
            BC00065_n173NotificacionesDetalle
            }
            , new Object[] {
            BC00066_A6NotificacionesId
            }
            , new Object[] {
            BC00067_A6NotificacionesId, BC00067_A169NotificacionesFecha, BC00067_n169NotificacionesFecha, BC00067_A170NotificacionesTipo, BC00067_n170NotificacionesTipo, BC00067_A171NotificacionesMensaje, BC00067_n171NotificacionesMensaje, BC00067_A172NotificacionesIdNetUsuario, BC00067_n172NotificacionesIdNetUsuario, BC00067_A173NotificacionesDetalle,
            BC00067_n173NotificacionesDetalle
            }
            , new Object[] {
            BC00068_A6NotificacionesId, BC00068_A169NotificacionesFecha, BC00068_n169NotificacionesFecha, BC00068_A170NotificacionesTipo, BC00068_n170NotificacionesTipo, BC00068_A171NotificacionesMensaje, BC00068_n171NotificacionesMensaje, BC00068_A172NotificacionesIdNetUsuario, BC00068_n172NotificacionesIdNetUsuario, BC00068_A173NotificacionesDetalle,
            BC00068_n173NotificacionesDetalle
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000612_A6NotificacionesId, BC000612_A169NotificacionesFecha, BC000612_n169NotificacionesFecha, BC000612_A170NotificacionesTipo, BC000612_n170NotificacionesTipo, BC000612_A171NotificacionesMensaje, BC000612_n171NotificacionesMensaje, BC000612_A172NotificacionesIdNetUsuario, BC000612_n172NotificacionesIdNetUsuario, BC000612_A173NotificacionesDetalle,
            BC000612_n173NotificacionesDetalle
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e12062 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound6 ;
   private short nIsDirty_6 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom6 ;
   private int GXPagingTo6 ;
   private int GX_JID ;
   private long A6NotificacionesId ;
   private long A172NotificacionesIdNetUsuario ;
   private long Z6NotificacionesId ;
   private long Z172NotificacionesIdNetUsuario ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode6 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private java.util.Date A169NotificacionesFecha ;
   private java.util.Date Z169NotificacionesFecha ;
   private boolean n169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n171NotificacionesMensaje ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean n173NotificacionesDetalle ;
   private boolean returnInSub ;
   private boolean mustCommit ;
   private String A170NotificacionesTipo ;
   private String A171NotificacionesMensaje ;
   private String A173NotificacionesDetalle ;
   private String Z170NotificacionesTipo ;
   private String Z171NotificacionesMensaje ;
   private String Z173NotificacionesDetalle ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtNotificaciones> gx_restcollection ;
   private com.colaveco.SdtNotificaciones bcNotificaciones ;
   private com.colaveco.SdtNotificaciones gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00064_A6NotificacionesId ;
   private java.util.Date[] BC00064_A169NotificacionesFecha ;
   private boolean[] BC00064_n169NotificacionesFecha ;
   private String[] BC00064_A170NotificacionesTipo ;
   private boolean[] BC00064_n170NotificacionesTipo ;
   private String[] BC00064_A171NotificacionesMensaje ;
   private boolean[] BC00064_n171NotificacionesMensaje ;
   private long[] BC00064_A172NotificacionesIdNetUsuario ;
   private boolean[] BC00064_n172NotificacionesIdNetUsuario ;
   private String[] BC00064_A173NotificacionesDetalle ;
   private boolean[] BC00064_n173NotificacionesDetalle ;
   private long[] BC00065_A6NotificacionesId ;
   private java.util.Date[] BC00065_A169NotificacionesFecha ;
   private boolean[] BC00065_n169NotificacionesFecha ;
   private String[] BC00065_A170NotificacionesTipo ;
   private boolean[] BC00065_n170NotificacionesTipo ;
   private String[] BC00065_A171NotificacionesMensaje ;
   private boolean[] BC00065_n171NotificacionesMensaje ;
   private long[] BC00065_A172NotificacionesIdNetUsuario ;
   private boolean[] BC00065_n172NotificacionesIdNetUsuario ;
   private String[] BC00065_A173NotificacionesDetalle ;
   private boolean[] BC00065_n173NotificacionesDetalle ;
   private long[] BC00066_A6NotificacionesId ;
   private long[] BC00067_A6NotificacionesId ;
   private java.util.Date[] BC00067_A169NotificacionesFecha ;
   private boolean[] BC00067_n169NotificacionesFecha ;
   private String[] BC00067_A170NotificacionesTipo ;
   private boolean[] BC00067_n170NotificacionesTipo ;
   private String[] BC00067_A171NotificacionesMensaje ;
   private boolean[] BC00067_n171NotificacionesMensaje ;
   private long[] BC00067_A172NotificacionesIdNetUsuario ;
   private boolean[] BC00067_n172NotificacionesIdNetUsuario ;
   private String[] BC00067_A173NotificacionesDetalle ;
   private boolean[] BC00067_n173NotificacionesDetalle ;
   private long[] BC00068_A6NotificacionesId ;
   private java.util.Date[] BC00068_A169NotificacionesFecha ;
   private boolean[] BC00068_n169NotificacionesFecha ;
   private String[] BC00068_A170NotificacionesTipo ;
   private boolean[] BC00068_n170NotificacionesTipo ;
   private String[] BC00068_A171NotificacionesMensaje ;
   private boolean[] BC00068_n171NotificacionesMensaje ;
   private long[] BC00068_A172NotificacionesIdNetUsuario ;
   private boolean[] BC00068_n172NotificacionesIdNetUsuario ;
   private String[] BC00068_A173NotificacionesDetalle ;
   private boolean[] BC00068_n173NotificacionesDetalle ;
   private long[] BC000612_A6NotificacionesId ;
   private java.util.Date[] BC000612_A169NotificacionesFecha ;
   private boolean[] BC000612_n169NotificacionesFecha ;
   private String[] BC000612_A170NotificacionesTipo ;
   private boolean[] BC000612_n170NotificacionesTipo ;
   private String[] BC000612_A171NotificacionesMensaje ;
   private boolean[] BC000612_n171NotificacionesMensaje ;
   private long[] BC000612_A172NotificacionesIdNetUsuario ;
   private boolean[] BC000612_n172NotificacionesIdNetUsuario ;
   private String[] BC000612_A173NotificacionesDetalle ;
   private boolean[] BC000612_n173NotificacionesDetalle ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00062_A6NotificacionesId ;
   private java.util.Date[] BC00062_A169NotificacionesFecha ;
   private String[] BC00062_A170NotificacionesTipo ;
   private String[] BC00062_A171NotificacionesMensaje ;
   private long[] BC00062_A172NotificacionesIdNetUsuario ;
   private String[] BC00062_A173NotificacionesDetalle ;
   private long[] BC00063_A6NotificacionesId ;
   private java.util.Date[] BC00063_A169NotificacionesFecha ;
   private String[] BC00063_A170NotificacionesTipo ;
   private String[] BC00063_A171NotificacionesMensaje ;
   private long[] BC00063_A172NotificacionesIdNetUsuario ;
   private String[] BC00063_A173NotificacionesDetalle ;
   private boolean[] BC00062_n169NotificacionesFecha ;
   private boolean[] BC00062_n170NotificacionesTipo ;
   private boolean[] BC00062_n171NotificacionesMensaje ;
   private boolean[] BC00062_n172NotificacionesIdNetUsuario ;
   private boolean[] BC00062_n173NotificacionesDetalle ;
   private boolean[] BC00063_n169NotificacionesFecha ;
   private boolean[] BC00063_n170NotificacionesTipo ;
   private boolean[] BC00063_n171NotificacionesMensaje ;
   private boolean[] BC00063_n172NotificacionesIdNetUsuario ;
   private boolean[] BC00063_n173NotificacionesDetalle ;
}

final  class notificaciones_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class notificaciones_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00062", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00063", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00064", "SELECT TM1.`NotificacionesId`, TM1.`NotificacionesFecha`, TM1.`NotificacionesTipo`, TM1.`NotificacionesMensaje`, TM1.`NotificacionesIdNetUsuario`, TM1.`NotificacionesDetalle` FROM `Notificaciones` TM1 ORDER BY TM1.`NotificacionesId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00065", "SELECT TM1.`NotificacionesId`, TM1.`NotificacionesFecha`, TM1.`NotificacionesTipo`, TM1.`NotificacionesMensaje`, TM1.`NotificacionesIdNetUsuario`, TM1.`NotificacionesDetalle` FROM `Notificaciones` TM1 WHERE TM1.`NotificacionesId` = ? ORDER BY TM1.`NotificacionesId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00066", "SELECT `NotificacionesId` FROM `Notificaciones` WHERE `NotificacionesId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00067", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00068", "SELECT `NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle` FROM `Notificaciones` WHERE `NotificacionesId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00069", "INSERT INTO `Notificaciones`(`NotificacionesId`, `NotificacionesFecha`, `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesIdNetUsuario`, `NotificacionesDetalle`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000610", "UPDATE `Notificaciones` SET `NotificacionesFecha`=?, `NotificacionesTipo`=?, `NotificacionesMensaje`=?, `NotificacionesIdNetUsuario`=?, `NotificacionesDetalle`=?  WHERE `NotificacionesId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000611", "DELETE FROM `Notificaciones`  WHERE `NotificacionesId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000612", "SELECT TM1.`NotificacionesId`, TM1.`NotificacionesFecha`, TM1.`NotificacionesTipo`, TM1.`NotificacionesMensaje`, TM1.`NotificacionesIdNetUsuario`, TM1.`NotificacionesDetalle` FROM `Notificaciones` TM1 WHERE TM1.`NotificacionesId` = ? ORDER BY TM1.`NotificacionesId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
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
            case 6 :
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
            case 10 :
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
            case 8 :
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
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

