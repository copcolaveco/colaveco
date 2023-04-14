package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturamovimiento_bc extends GXWebPanel implements IGxSilentTrn
{
   public facturamovimiento_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public facturamovimiento_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturamovimiento_bc.class ));
   }

   public facturamovimiento_bc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtFacturaMovimiento> GetAll( int Start ,
                                                                    int Count )
   {
      GXPagingFrom2 = Start ;
      GXPagingTo2 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00024 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2FMId = BC00024_A2FMId[0] ;
         A21FMIdNetMovimiento = BC00024_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = BC00024_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = BC00024_A22FMFechaEmision[0] ;
         n22FMFechaEmision = BC00024_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = BC00024_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = BC00024_n23FMFechaVencimiento[0] ;
         A24FMTipo = BC00024_A24FMTipo[0] ;
         n24FMTipo = BC00024_n24FMTipo[0] ;
         A25FMNumero = BC00024_A25FMNumero[0] ;
         n25FMNumero = BC00024_n25FMNumero[0] ;
         A26FMDetalle = BC00024_A26FMDetalle[0] ;
         n26FMDetalle = BC00024_n26FMDetalle[0] ;
         A27FMImporte = BC00024_A27FMImporte[0] ;
         n27FMImporte = BC00024_n27FMImporte[0] ;
         A28FMIdUsuarioNet = BC00024_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = BC00024_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = BC00024_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = BC00024_n29FMTipoMovimiento[0] ;
         A30FMImportePago = BC00024_A30FMImportePago[0] ;
         n30FMImportePago = BC00024_n30FMImportePago[0] ;
         A31FMPathPdf = BC00024_A31FMPathPdf[0] ;
         n31FMPathPdf = BC00024_n31FMPathPdf[0] ;
      }
      bcFacturaMovimiento = new com.colaveco.SdtFacturaMovimiento(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound2 != 0 )
      {
         onLoadActions022( ) ;
         addRow022( ) ;
         gx_sdt_item = bcFacturaMovimiento.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound2 = (short)(0) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound2 = (short)(1) ;
            A2FMId = BC00024_A2FMId[0] ;
            A21FMIdNetMovimiento = BC00024_A21FMIdNetMovimiento[0] ;
            n21FMIdNetMovimiento = BC00024_n21FMIdNetMovimiento[0] ;
            A22FMFechaEmision = BC00024_A22FMFechaEmision[0] ;
            n22FMFechaEmision = BC00024_n22FMFechaEmision[0] ;
            A23FMFechaVencimiento = BC00024_A23FMFechaVencimiento[0] ;
            n23FMFechaVencimiento = BC00024_n23FMFechaVencimiento[0] ;
            A24FMTipo = BC00024_A24FMTipo[0] ;
            n24FMTipo = BC00024_n24FMTipo[0] ;
            A25FMNumero = BC00024_A25FMNumero[0] ;
            n25FMNumero = BC00024_n25FMNumero[0] ;
            A26FMDetalle = BC00024_A26FMDetalle[0] ;
            n26FMDetalle = BC00024_n26FMDetalle[0] ;
            A27FMImporte = BC00024_A27FMImporte[0] ;
            n27FMImporte = BC00024_n27FMImporte[0] ;
            A28FMIdUsuarioNet = BC00024_A28FMIdUsuarioNet[0] ;
            n28FMIdUsuarioNet = BC00024_n28FMIdUsuarioNet[0] ;
            A29FMTipoMovimiento = BC00024_A29FMTipoMovimiento[0] ;
            n29FMTipoMovimiento = BC00024_n29FMTipoMovimiento[0] ;
            A30FMImportePago = BC00024_A30FMImportePago[0] ;
            n30FMImportePago = BC00024_n30FMImportePago[0] ;
            A31FMPathPdf = BC00024_A31FMPathPdf[0] ;
            n31FMPathPdf = BC00024_n31FMPathPdf[0] ;
         }
         Gx_mode = sMode2 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm022( 0) ;
   }

   public void getInsDefault( )
   {
      readRow022( ) ;
      standaloneNotModal( ) ;
      initializeNonKey022( ) ;
      standaloneModal( ) ;
      addRow022( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z2FMId = A2FMId ;
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

   public void confirm_020( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls022( ) ;
         }
         else
         {
            checkExtendedTable022( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors022( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
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
         Z176FMSaldoActual = A176FMSaldoActual ;
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
   }

   public void load022( )
   {
      /* Using cursor BC00025 */
      pr_default.execute(3, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A21FMIdNetMovimiento = BC00025_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = BC00025_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = BC00025_A22FMFechaEmision[0] ;
         n22FMFechaEmision = BC00025_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = BC00025_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = BC00025_n23FMFechaVencimiento[0] ;
         A24FMTipo = BC00025_A24FMTipo[0] ;
         n24FMTipo = BC00025_n24FMTipo[0] ;
         A25FMNumero = BC00025_A25FMNumero[0] ;
         n25FMNumero = BC00025_n25FMNumero[0] ;
         A26FMDetalle = BC00025_A26FMDetalle[0] ;
         n26FMDetalle = BC00025_n26FMDetalle[0] ;
         A27FMImporte = BC00025_A27FMImporte[0] ;
         n27FMImporte = BC00025_n27FMImporte[0] ;
         A28FMIdUsuarioNet = BC00025_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = BC00025_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = BC00025_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = BC00025_n29FMTipoMovimiento[0] ;
         A30FMImportePago = BC00025_A30FMImportePago[0] ;
         n30FMImportePago = BC00025_n30FMImportePago[0] ;
         A31FMPathPdf = BC00025_A31FMPathPdf[0] ;
         n31FMPathPdf = BC00025_n31FMPathPdf[0] ;
         zm022( -4) ;
      }
      pr_default.close(3);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_bc.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
   }

   public void checkExtendedTable022( )
   {
      nIsDirty_2 = (short)(0) ;
      standaloneModal( ) ;
      nIsDirty_2 = (short)(1) ;
      GXt_int1 = A176FMSaldoActual ;
      GXv_int2[0] = GXt_int1 ;
      new com.colaveco.calcularsaldoactual(remoteHandle, context).execute( A2FMId, GXv_int2) ;
      facturamovimiento_bc.this.GXt_int1 = GXv_int2[0] ;
      A176FMSaldoActual = GXt_int1 ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A22FMFechaEmision) || (( A22FMFechaEmision.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A22FMFechaEmision, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field FMFecha Emision is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A23FMFechaVencimiento) || (( A23FMFechaVencimiento.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A23FMFechaVencimiento, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field FMFecha Vencimiento is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      /* Using cursor BC00026 */
      pr_default.execute(4, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00027 */
      pr_default.execute(5, new Object[] {Long.valueOf(A2FMId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm022( 4) ;
         RcdFound2 = (short)(1) ;
         A2FMId = BC00027_A2FMId[0] ;
         A21FMIdNetMovimiento = BC00027_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = BC00027_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = BC00027_A22FMFechaEmision[0] ;
         n22FMFechaEmision = BC00027_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = BC00027_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = BC00027_n23FMFechaVencimiento[0] ;
         A24FMTipo = BC00027_A24FMTipo[0] ;
         n24FMTipo = BC00027_n24FMTipo[0] ;
         A25FMNumero = BC00027_A25FMNumero[0] ;
         n25FMNumero = BC00027_n25FMNumero[0] ;
         A26FMDetalle = BC00027_A26FMDetalle[0] ;
         n26FMDetalle = BC00027_n26FMDetalle[0] ;
         A27FMImporte = BC00027_A27FMImporte[0] ;
         n27FMImporte = BC00027_n27FMImporte[0] ;
         A28FMIdUsuarioNet = BC00027_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = BC00027_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = BC00027_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = BC00027_n29FMTipoMovimiento[0] ;
         A30FMImportePago = BC00027_A30FMImportePago[0] ;
         n30FMImportePago = BC00027_n30FMImportePago[0] ;
         A31FMPathPdf = BC00027_A31FMPathPdf[0] ;
         n31FMPathPdf = BC00027_n31FMPathPdf[0] ;
         Z2FMId = A2FMId ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
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
      confirm_020( ) ;
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

   public void checkOptimisticConcurrency022( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00028 */
         pr_default.execute(6, new Object[] {Long.valueOf(A2FMId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"FacturaMovimiento"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( Z21FMIdNetMovimiento != BC00028_A21FMIdNetMovimiento[0] ) || !( GXutil.dateCompare(Z22FMFechaEmision, BC00028_A22FMFechaEmision[0]) ) || !( GXutil.dateCompare(Z23FMFechaVencimiento, BC00028_A23FMFechaVencimiento[0]) ) || ( GXutil.strcmp(Z24FMTipo, BC00028_A24FMTipo[0]) != 0 ) || ( Z25FMNumero != BC00028_A25FMNumero[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z26FMDetalle, BC00028_A26FMDetalle[0]) != 0 ) || ( Z27FMImporte != BC00028_A27FMImporte[0] ) || ( Z28FMIdUsuarioNet != BC00028_A28FMIdUsuarioNet[0] ) || ( Z29FMTipoMovimiento != BC00028_A29FMTipoMovimiento[0] ) || ( Z30FMImportePago != BC00028_A30FMImportePago[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z31FMPathPdf, BC00028_A31FMPathPdf[0]) != 0 ) )
         {
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
                  /* Using cursor BC00029 */
                  pr_default.execute(7, new Object[] {Long.valueOf(A2FMId), Boolean.valueOf(n21FMIdNetMovimiento), Long.valueOf(A21FMIdNetMovimiento), Boolean.valueOf(n22FMFechaEmision), A22FMFechaEmision, Boolean.valueOf(n23FMFechaVencimiento), A23FMFechaVencimiento, Boolean.valueOf(n24FMTipo), A24FMTipo, Boolean.valueOf(n25FMNumero), Long.valueOf(A25FMNumero), Boolean.valueOf(n26FMDetalle), A26FMDetalle, Boolean.valueOf(n27FMImporte), Long.valueOf(A27FMImporte), Boolean.valueOf(n28FMIdUsuarioNet), Long.valueOf(A28FMIdUsuarioNet), Boolean.valueOf(n29FMTipoMovimiento), Long.valueOf(A29FMTipoMovimiento), Boolean.valueOf(n30FMImportePago), Long.valueOf(A30FMImportePago), Boolean.valueOf(n31FMPathPdf), A31FMPathPdf});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
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
                  /* Using cursor BC000210 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n21FMIdNetMovimiento), Long.valueOf(A21FMIdNetMovimiento), Boolean.valueOf(n22FMFechaEmision), A22FMFechaEmision, Boolean.valueOf(n23FMFechaVencimiento), A23FMFechaVencimiento, Boolean.valueOf(n24FMTipo), A24FMTipo, Boolean.valueOf(n25FMNumero), Long.valueOf(A25FMNumero), Boolean.valueOf(n26FMDetalle), A26FMDetalle, Boolean.valueOf(n27FMImporte), Long.valueOf(A27FMImporte), Boolean.valueOf(n28FMIdUsuarioNet), Long.valueOf(A28FMIdUsuarioNet), Boolean.valueOf(n29FMTipoMovimiento), Long.valueOf(A29FMTipoMovimiento), Boolean.valueOf(n30FMImportePago), Long.valueOf(A30FMImportePago), Boolean.valueOf(n31FMPathPdf), A31FMPathPdf, Long.valueOf(A2FMId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
                  if ( (pr_default.getStatus(8) == 103) )
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
               /* Using cursor BC000211 */
               pr_default.execute(9, new Object[] {Long.valueOf(A2FMId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("FacturaMovimiento");
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel022( ) ;
      Gx_mode = sMode2 ;
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
         facturamovimiento_bc.this.GXt_int1 = GXv_int2[0] ;
         A176FMSaldoActual = GXt_int1 ;
      }
   }

   public void endLevel022( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
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

   public void scanKeyStart022( )
   {
      /* Using cursor BC000212 */
      pr_default.execute(10, new Object[] {Long.valueOf(A2FMId)});
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2FMId = BC000212_A2FMId[0] ;
         A21FMIdNetMovimiento = BC000212_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = BC000212_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = BC000212_A22FMFechaEmision[0] ;
         n22FMFechaEmision = BC000212_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = BC000212_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = BC000212_n23FMFechaVencimiento[0] ;
         A24FMTipo = BC000212_A24FMTipo[0] ;
         n24FMTipo = BC000212_n24FMTipo[0] ;
         A25FMNumero = BC000212_A25FMNumero[0] ;
         n25FMNumero = BC000212_n25FMNumero[0] ;
         A26FMDetalle = BC000212_A26FMDetalle[0] ;
         n26FMDetalle = BC000212_n26FMDetalle[0] ;
         A27FMImporte = BC000212_A27FMImporte[0] ;
         n27FMImporte = BC000212_n27FMImporte[0] ;
         A28FMIdUsuarioNet = BC000212_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = BC000212_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = BC000212_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = BC000212_n29FMTipoMovimiento[0] ;
         A30FMImportePago = BC000212_A30FMImportePago[0] ;
         n30FMImportePago = BC000212_n30FMImportePago[0] ;
         A31FMPathPdf = BC000212_A31FMPathPdf[0] ;
         n31FMPathPdf = BC000212_n31FMPathPdf[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound2 = (short)(0) ;
      scanKeyLoad022( ) ;
   }

   public void scanKeyLoad022( )
   {
      sMode2 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2FMId = BC000212_A2FMId[0] ;
         A21FMIdNetMovimiento = BC000212_A21FMIdNetMovimiento[0] ;
         n21FMIdNetMovimiento = BC000212_n21FMIdNetMovimiento[0] ;
         A22FMFechaEmision = BC000212_A22FMFechaEmision[0] ;
         n22FMFechaEmision = BC000212_n22FMFechaEmision[0] ;
         A23FMFechaVencimiento = BC000212_A23FMFechaVencimiento[0] ;
         n23FMFechaVencimiento = BC000212_n23FMFechaVencimiento[0] ;
         A24FMTipo = BC000212_A24FMTipo[0] ;
         n24FMTipo = BC000212_n24FMTipo[0] ;
         A25FMNumero = BC000212_A25FMNumero[0] ;
         n25FMNumero = BC000212_n25FMNumero[0] ;
         A26FMDetalle = BC000212_A26FMDetalle[0] ;
         n26FMDetalle = BC000212_n26FMDetalle[0] ;
         A27FMImporte = BC000212_A27FMImporte[0] ;
         n27FMImporte = BC000212_n27FMImporte[0] ;
         A28FMIdUsuarioNet = BC000212_A28FMIdUsuarioNet[0] ;
         n28FMIdUsuarioNet = BC000212_n28FMIdUsuarioNet[0] ;
         A29FMTipoMovimiento = BC000212_A29FMTipoMovimiento[0] ;
         n29FMTipoMovimiento = BC000212_n29FMTipoMovimiento[0] ;
         A30FMImportePago = BC000212_A30FMImportePago[0] ;
         n30FMImportePago = BC000212_n30FMImportePago[0] ;
         A31FMPathPdf = BC000212_A31FMPathPdf[0] ;
         n31FMPathPdf = BC000212_n31FMPathPdf[0] ;
      }
      Gx_mode = sMode2 ;
   }

   public void scanKeyEnd022( )
   {
      pr_default.close(10);
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
   }

   public void send_integrity_lvl_hashes022( )
   {
   }

   public void addRow022( )
   {
      VarsToRow2( bcFacturaMovimiento) ;
   }

   public void readRow022( )
   {
      RowToVars2( bcFacturaMovimiento, 1) ;
   }

   public void initializeNonKey022( )
   {
      A176FMSaldoActual = 0 ;
      A21FMIdNetMovimiento = 0 ;
      n21FMIdNetMovimiento = false ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      n22FMFechaEmision = false ;
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      n23FMFechaVencimiento = false ;
      A24FMTipo = "" ;
      n24FMTipo = false ;
      A25FMNumero = 0 ;
      n25FMNumero = false ;
      A26FMDetalle = "" ;
      n26FMDetalle = false ;
      A27FMImporte = 0 ;
      n27FMImporte = false ;
      A28FMIdUsuarioNet = 0 ;
      n28FMIdUsuarioNet = false ;
      A29FMTipoMovimiento = 0 ;
      n29FMTipoMovimiento = false ;
      A30FMImportePago = 0 ;
      n30FMImportePago = false ;
      A31FMPathPdf = "" ;
      n31FMPathPdf = false ;
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
      initializeNonKey022( ) ;
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

   public void VarsToRow2( com.colaveco.SdtFacturaMovimiento obj2 )
   {
      obj2.setgxTv_SdtFacturaMovimiento_Mode( Gx_mode );
      obj2.setgxTv_SdtFacturaMovimiento_Fmsaldoactual( A176FMSaldoActual );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento( A21FMIdNetMovimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechaemision( A22FMFechaEmision );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechavencimiento( A23FMFechaVencimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipo( A24FMTipo );
      obj2.setgxTv_SdtFacturaMovimiento_Fmnumero( A25FMNumero );
      obj2.setgxTv_SdtFacturaMovimiento_Fmdetalle( A26FMDetalle );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimporte( A27FMImporte );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidusuarionet( A28FMIdUsuarioNet );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipomovimiento( A29FMTipoMovimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimportepago( A30FMImportePago );
      obj2.setgxTv_SdtFacturaMovimiento_Fmpathpdf( A31FMPathPdf );
      obj2.setgxTv_SdtFacturaMovimiento_Fmid( A2FMId );
      obj2.setgxTv_SdtFacturaMovimiento_Fmid_Z( Z2FMId );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z( Z21FMIdNetMovimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechaemision_Z( Z22FMFechaEmision );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z( Z23FMFechaVencimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipo_Z( Z24FMTipo );
      obj2.setgxTv_SdtFacturaMovimiento_Fmnumero_Z( Z25FMNumero );
      obj2.setgxTv_SdtFacturaMovimiento_Fmdetalle_Z( Z26FMDetalle );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimporte_Z( Z27FMImporte );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z( Z28FMIdUsuarioNet );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z( Z29FMTipoMovimiento );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimportepago_Z( Z30FMImportePago );
      obj2.setgxTv_SdtFacturaMovimiento_Fmpathpdf_Z( Z31FMPathPdf );
      obj2.setgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z( Z176FMSaldoActual );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N( (byte)((byte)((n21FMIdNetMovimiento)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechaemision_N( (byte)((byte)((n22FMFechaEmision)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N( (byte)((byte)((n23FMFechaVencimiento)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipo_N( (byte)((byte)((n24FMTipo)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmnumero_N( (byte)((byte)((n25FMNumero)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmdetalle_N( (byte)((byte)((n26FMDetalle)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimporte_N( (byte)((byte)((n27FMImporte)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmidusuarionet_N( (byte)((byte)((n28FMIdUsuarioNet)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N( (byte)((byte)((n29FMTipoMovimiento)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmimportepago_N( (byte)((byte)((n30FMImportePago)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Fmpathpdf_N( (byte)((byte)((n31FMPathPdf)?1:0)) );
      obj2.setgxTv_SdtFacturaMovimiento_Mode( Gx_mode );
   }

   public void KeyVarsToRow2( com.colaveco.SdtFacturaMovimiento obj2 )
   {
      obj2.setgxTv_SdtFacturaMovimiento_Fmid( A2FMId );
   }

   public void RowToVars2( com.colaveco.SdtFacturaMovimiento obj2 ,
                           int forceLoad )
   {
      Gx_mode = obj2.getgxTv_SdtFacturaMovimiento_Mode() ;
      A176FMSaldoActual = obj2.getgxTv_SdtFacturaMovimiento_Fmsaldoactual() ;
      A21FMIdNetMovimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento() ;
      n21FMIdNetMovimiento = false ;
      A22FMFechaEmision = obj2.getgxTv_SdtFacturaMovimiento_Fmfechaemision() ;
      n22FMFechaEmision = false ;
      A23FMFechaVencimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmfechavencimiento() ;
      n23FMFechaVencimiento = false ;
      A24FMTipo = obj2.getgxTv_SdtFacturaMovimiento_Fmtipo() ;
      n24FMTipo = false ;
      A25FMNumero = obj2.getgxTv_SdtFacturaMovimiento_Fmnumero() ;
      n25FMNumero = false ;
      A26FMDetalle = obj2.getgxTv_SdtFacturaMovimiento_Fmdetalle() ;
      n26FMDetalle = false ;
      A27FMImporte = obj2.getgxTv_SdtFacturaMovimiento_Fmimporte() ;
      n27FMImporte = false ;
      A28FMIdUsuarioNet = obj2.getgxTv_SdtFacturaMovimiento_Fmidusuarionet() ;
      n28FMIdUsuarioNet = false ;
      A29FMTipoMovimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmtipomovimiento() ;
      n29FMTipoMovimiento = false ;
      A30FMImportePago = obj2.getgxTv_SdtFacturaMovimiento_Fmimportepago() ;
      n30FMImportePago = false ;
      A31FMPathPdf = obj2.getgxTv_SdtFacturaMovimiento_Fmpathpdf() ;
      n31FMPathPdf = false ;
      A2FMId = obj2.getgxTv_SdtFacturaMovimiento_Fmid() ;
      Z2FMId = obj2.getgxTv_SdtFacturaMovimiento_Fmid_Z() ;
      Z21FMIdNetMovimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_Z() ;
      Z22FMFechaEmision = obj2.getgxTv_SdtFacturaMovimiento_Fmfechaemision_Z() ;
      Z23FMFechaVencimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_Z() ;
      Z24FMTipo = obj2.getgxTv_SdtFacturaMovimiento_Fmtipo_Z() ;
      Z25FMNumero = obj2.getgxTv_SdtFacturaMovimiento_Fmnumero_Z() ;
      Z26FMDetalle = obj2.getgxTv_SdtFacturaMovimiento_Fmdetalle_Z() ;
      Z27FMImporte = obj2.getgxTv_SdtFacturaMovimiento_Fmimporte_Z() ;
      Z28FMIdUsuarioNet = obj2.getgxTv_SdtFacturaMovimiento_Fmidusuarionet_Z() ;
      Z29FMTipoMovimiento = obj2.getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_Z() ;
      Z30FMImportePago = obj2.getgxTv_SdtFacturaMovimiento_Fmimportepago_Z() ;
      Z31FMPathPdf = obj2.getgxTv_SdtFacturaMovimiento_Fmpathpdf_Z() ;
      Z176FMSaldoActual = obj2.getgxTv_SdtFacturaMovimiento_Fmsaldoactual_Z() ;
      n21FMIdNetMovimiento = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmidnetmovimiento_N()==0)?false:true) ;
      n22FMFechaEmision = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmfechaemision_N()==0)?false:true) ;
      n23FMFechaVencimiento = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmfechavencimiento_N()==0)?false:true) ;
      n24FMTipo = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmtipo_N()==0)?false:true) ;
      n25FMNumero = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmnumero_N()==0)?false:true) ;
      n26FMDetalle = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmdetalle_N()==0)?false:true) ;
      n27FMImporte = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmimporte_N()==0)?false:true) ;
      n28FMIdUsuarioNet = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmidusuarionet_N()==0)?false:true) ;
      n29FMTipoMovimiento = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmtipomovimiento_N()==0)?false:true) ;
      n30FMImportePago = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmimportepago_N()==0)?false:true) ;
      n31FMPathPdf = (boolean)((obj2.getgxTv_SdtFacturaMovimiento_Fmpathpdf_N()==0)?false:true) ;
      Gx_mode = obj2.getgxTv_SdtFacturaMovimiento_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A2FMId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey022( ) ;
      scanKeyStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z2FMId = A2FMId ;
      }
      zm022( -4) ;
      onLoadActions022( ) ;
      addRow022( ) ;
      scanKeyEnd022( ) ;
      if ( RcdFound2 == 0 )
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
      RowToVars2( bcFacturaMovimiento, 0) ;
      scanKeyStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z2FMId = A2FMId ;
      }
      zm022( -4) ;
      onLoadActions022( ) ;
      addRow022( ) ;
      scanKeyEnd022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert022( ) ;
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( A2FMId != Z2FMId )
            {
               A2FMId = Z2FMId ;
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
               update022( ) ;
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
               if ( A2FMId != Z2FMId )
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
                     insert022( ) ;
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
                     insert022( ) ;
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
      RowToVars2( bcFacturaMovimiento, 1) ;
      saveImpl( ) ;
      VarsToRow2( bcFacturaMovimiento) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars2( bcFacturaMovimiento, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert022( ) ;
      afterTrn( ) ;
      VarsToRow2( bcFacturaMovimiento) ;
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
         com.colaveco.SdtFacturaMovimiento auxBC = new com.colaveco.SdtFacturaMovimiento( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A2FMId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcFacturaMovimiento);
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
      RowToVars2( bcFacturaMovimiento, 1) ;
      updateImpl( ) ;
      VarsToRow2( bcFacturaMovimiento) ;
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
      RowToVars2( bcFacturaMovimiento, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert022( ) ;
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
      VarsToRow2( bcFacturaMovimiento) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars2( bcFacturaMovimiento, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey022( ) ;
      if ( RcdFound2 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A2FMId != Z2FMId )
         {
            A2FMId = Z2FMId ;
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
         if ( A2FMId != Z2FMId )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "facturamovimiento_bc");
      VarsToRow2( bcFacturaMovimiento) ;
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
      Gx_mode = bcFacturaMovimiento.getgxTv_SdtFacturaMovimiento_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcFacturaMovimiento.setgxTv_SdtFacturaMovimiento_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtFacturaMovimiento sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcFacturaMovimiento )
      {
         bcFacturaMovimiento = sdt ;
         if ( GXutil.strcmp(bcFacturaMovimiento.getgxTv_SdtFacturaMovimiento_Mode(), "") == 0 )
         {
            bcFacturaMovimiento.setgxTv_SdtFacturaMovimiento_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow2( bcFacturaMovimiento) ;
         }
         else
         {
            RowToVars2( bcFacturaMovimiento, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcFacturaMovimiento.getgxTv_SdtFacturaMovimiento_Mode(), "") == 0 )
         {
            bcFacturaMovimiento.setgxTv_SdtFacturaMovimiento_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars2( bcFacturaMovimiento, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtFacturaMovimiento getFacturaMovimiento_BC( )
   {
      return bcFacturaMovimiento ;
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
      BC00024_A2FMId = new long[1] ;
      BC00024_A21FMIdNetMovimiento = new long[1] ;
      BC00024_n21FMIdNetMovimiento = new boolean[] {false} ;
      BC00024_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00024_n22FMFechaEmision = new boolean[] {false} ;
      BC00024_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00024_n23FMFechaVencimiento = new boolean[] {false} ;
      BC00024_A24FMTipo = new String[] {""} ;
      BC00024_n24FMTipo = new boolean[] {false} ;
      BC00024_A25FMNumero = new long[1] ;
      BC00024_n25FMNumero = new boolean[] {false} ;
      BC00024_A26FMDetalle = new String[] {""} ;
      BC00024_n26FMDetalle = new boolean[] {false} ;
      BC00024_A27FMImporte = new long[1] ;
      BC00024_n27FMImporte = new boolean[] {false} ;
      BC00024_A28FMIdUsuarioNet = new long[1] ;
      BC00024_n28FMIdUsuarioNet = new boolean[] {false} ;
      BC00024_A29FMTipoMovimiento = new long[1] ;
      BC00024_n29FMTipoMovimiento = new boolean[] {false} ;
      BC00024_A30FMImportePago = new long[1] ;
      BC00024_n30FMImportePago = new boolean[] {false} ;
      BC00024_A31FMPathPdf = new String[] {""} ;
      BC00024_n31FMPathPdf = new boolean[] {false} ;
      A22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      A23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      A24FMTipo = "" ;
      A26FMDetalle = "" ;
      A31FMPathPdf = "" ;
      gx_restcollection = new GXBCCollection<com.colaveco.SdtFacturaMovimiento>(com.colaveco.SdtFacturaMovimiento.class, "FacturaMovimiento", "Colaveco", remoteHandle);
      sMode2 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z22FMFechaEmision = GXutil.resetTime( GXutil.nullDate() );
      Z23FMFechaVencimiento = GXutil.resetTime( GXutil.nullDate() );
      Z24FMTipo = "" ;
      Z26FMDetalle = "" ;
      Z31FMPathPdf = "" ;
      BC00025_A2FMId = new long[1] ;
      BC00025_A21FMIdNetMovimiento = new long[1] ;
      BC00025_n21FMIdNetMovimiento = new boolean[] {false} ;
      BC00025_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00025_n22FMFechaEmision = new boolean[] {false} ;
      BC00025_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00025_n23FMFechaVencimiento = new boolean[] {false} ;
      BC00025_A24FMTipo = new String[] {""} ;
      BC00025_n24FMTipo = new boolean[] {false} ;
      BC00025_A25FMNumero = new long[1] ;
      BC00025_n25FMNumero = new boolean[] {false} ;
      BC00025_A26FMDetalle = new String[] {""} ;
      BC00025_n26FMDetalle = new boolean[] {false} ;
      BC00025_A27FMImporte = new long[1] ;
      BC00025_n27FMImporte = new boolean[] {false} ;
      BC00025_A28FMIdUsuarioNet = new long[1] ;
      BC00025_n28FMIdUsuarioNet = new boolean[] {false} ;
      BC00025_A29FMTipoMovimiento = new long[1] ;
      BC00025_n29FMTipoMovimiento = new boolean[] {false} ;
      BC00025_A30FMImportePago = new long[1] ;
      BC00025_n30FMImportePago = new boolean[] {false} ;
      BC00025_A31FMPathPdf = new String[] {""} ;
      BC00025_n31FMPathPdf = new boolean[] {false} ;
      BC00026_A2FMId = new long[1] ;
      BC00027_A2FMId = new long[1] ;
      BC00027_A21FMIdNetMovimiento = new long[1] ;
      BC00027_n21FMIdNetMovimiento = new boolean[] {false} ;
      BC00027_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00027_n22FMFechaEmision = new boolean[] {false} ;
      BC00027_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00027_n23FMFechaVencimiento = new boolean[] {false} ;
      BC00027_A24FMTipo = new String[] {""} ;
      BC00027_n24FMTipo = new boolean[] {false} ;
      BC00027_A25FMNumero = new long[1] ;
      BC00027_n25FMNumero = new boolean[] {false} ;
      BC00027_A26FMDetalle = new String[] {""} ;
      BC00027_n26FMDetalle = new boolean[] {false} ;
      BC00027_A27FMImporte = new long[1] ;
      BC00027_n27FMImporte = new boolean[] {false} ;
      BC00027_A28FMIdUsuarioNet = new long[1] ;
      BC00027_n28FMIdUsuarioNet = new boolean[] {false} ;
      BC00027_A29FMTipoMovimiento = new long[1] ;
      BC00027_n29FMTipoMovimiento = new boolean[] {false} ;
      BC00027_A30FMImportePago = new long[1] ;
      BC00027_n30FMImportePago = new boolean[] {false} ;
      BC00027_A31FMPathPdf = new String[] {""} ;
      BC00027_n31FMPathPdf = new boolean[] {false} ;
      BC00028_A2FMId = new long[1] ;
      BC00028_A21FMIdNetMovimiento = new long[1] ;
      BC00028_n21FMIdNetMovimiento = new boolean[] {false} ;
      BC00028_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00028_n22FMFechaEmision = new boolean[] {false} ;
      BC00028_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00028_n23FMFechaVencimiento = new boolean[] {false} ;
      BC00028_A24FMTipo = new String[] {""} ;
      BC00028_n24FMTipo = new boolean[] {false} ;
      BC00028_A25FMNumero = new long[1] ;
      BC00028_n25FMNumero = new boolean[] {false} ;
      BC00028_A26FMDetalle = new String[] {""} ;
      BC00028_n26FMDetalle = new boolean[] {false} ;
      BC00028_A27FMImporte = new long[1] ;
      BC00028_n27FMImporte = new boolean[] {false} ;
      BC00028_A28FMIdUsuarioNet = new long[1] ;
      BC00028_n28FMIdUsuarioNet = new boolean[] {false} ;
      BC00028_A29FMTipoMovimiento = new long[1] ;
      BC00028_n29FMTipoMovimiento = new boolean[] {false} ;
      BC00028_A30FMImportePago = new long[1] ;
      BC00028_n30FMImportePago = new boolean[] {false} ;
      BC00028_A31FMPathPdf = new String[] {""} ;
      BC00028_n31FMPathPdf = new boolean[] {false} ;
      GXv_int2 = new long[1] ;
      BC000212_A2FMId = new long[1] ;
      BC000212_A21FMIdNetMovimiento = new long[1] ;
      BC000212_n21FMIdNetMovimiento = new boolean[] {false} ;
      BC000212_A22FMFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC000212_n22FMFechaEmision = new boolean[] {false} ;
      BC000212_A23FMFechaVencimiento = new java.util.Date[] {GXutil.nullDate()} ;
      BC000212_n23FMFechaVencimiento = new boolean[] {false} ;
      BC000212_A24FMTipo = new String[] {""} ;
      BC000212_n24FMTipo = new boolean[] {false} ;
      BC000212_A25FMNumero = new long[1] ;
      BC000212_n25FMNumero = new boolean[] {false} ;
      BC000212_A26FMDetalle = new String[] {""} ;
      BC000212_n26FMDetalle = new boolean[] {false} ;
      BC000212_A27FMImporte = new long[1] ;
      BC000212_n27FMImporte = new boolean[] {false} ;
      BC000212_A28FMIdUsuarioNet = new long[1] ;
      BC000212_n28FMIdUsuarioNet = new boolean[] {false} ;
      BC000212_A29FMTipoMovimiento = new long[1] ;
      BC000212_n29FMTipoMovimiento = new boolean[] {false} ;
      BC000212_A30FMImportePago = new long[1] ;
      BC000212_n30FMImportePago = new boolean[] {false} ;
      BC000212_A31FMPathPdf = new String[] {""} ;
      BC000212_n31FMPathPdf = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.facturamovimiento_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.facturamovimiento_bc__default(),
         new Object[] {
             new Object[] {
            BC00022_A2FMId, BC00022_A21FMIdNetMovimiento, BC00022_n21FMIdNetMovimiento, BC00022_A22FMFechaEmision, BC00022_n22FMFechaEmision, BC00022_A23FMFechaVencimiento, BC00022_n23FMFechaVencimiento, BC00022_A24FMTipo, BC00022_n24FMTipo, BC00022_A25FMNumero,
            BC00022_n25FMNumero, BC00022_A26FMDetalle, BC00022_n26FMDetalle, BC00022_A27FMImporte, BC00022_n27FMImporte, BC00022_A28FMIdUsuarioNet, BC00022_n28FMIdUsuarioNet, BC00022_A29FMTipoMovimiento, BC00022_n29FMTipoMovimiento, BC00022_A30FMImportePago,
            BC00022_n30FMImportePago, BC00022_A31FMPathPdf, BC00022_n31FMPathPdf
            }
            , new Object[] {
            BC00023_A2FMId, BC00023_A21FMIdNetMovimiento, BC00023_n21FMIdNetMovimiento, BC00023_A22FMFechaEmision, BC00023_n22FMFechaEmision, BC00023_A23FMFechaVencimiento, BC00023_n23FMFechaVencimiento, BC00023_A24FMTipo, BC00023_n24FMTipo, BC00023_A25FMNumero,
            BC00023_n25FMNumero, BC00023_A26FMDetalle, BC00023_n26FMDetalle, BC00023_A27FMImporte, BC00023_n27FMImporte, BC00023_A28FMIdUsuarioNet, BC00023_n28FMIdUsuarioNet, BC00023_A29FMTipoMovimiento, BC00023_n29FMTipoMovimiento, BC00023_A30FMImportePago,
            BC00023_n30FMImportePago, BC00023_A31FMPathPdf, BC00023_n31FMPathPdf
            }
            , new Object[] {
            BC00024_A2FMId, BC00024_A21FMIdNetMovimiento, BC00024_n21FMIdNetMovimiento, BC00024_A22FMFechaEmision, BC00024_n22FMFechaEmision, BC00024_A23FMFechaVencimiento, BC00024_n23FMFechaVencimiento, BC00024_A24FMTipo, BC00024_n24FMTipo, BC00024_A25FMNumero,
            BC00024_n25FMNumero, BC00024_A26FMDetalle, BC00024_n26FMDetalle, BC00024_A27FMImporte, BC00024_n27FMImporte, BC00024_A28FMIdUsuarioNet, BC00024_n28FMIdUsuarioNet, BC00024_A29FMTipoMovimiento, BC00024_n29FMTipoMovimiento, BC00024_A30FMImportePago,
            BC00024_n30FMImportePago, BC00024_A31FMPathPdf, BC00024_n31FMPathPdf
            }
            , new Object[] {
            BC00025_A2FMId, BC00025_A21FMIdNetMovimiento, BC00025_n21FMIdNetMovimiento, BC00025_A22FMFechaEmision, BC00025_n22FMFechaEmision, BC00025_A23FMFechaVencimiento, BC00025_n23FMFechaVencimiento, BC00025_A24FMTipo, BC00025_n24FMTipo, BC00025_A25FMNumero,
            BC00025_n25FMNumero, BC00025_A26FMDetalle, BC00025_n26FMDetalle, BC00025_A27FMImporte, BC00025_n27FMImporte, BC00025_A28FMIdUsuarioNet, BC00025_n28FMIdUsuarioNet, BC00025_A29FMTipoMovimiento, BC00025_n29FMTipoMovimiento, BC00025_A30FMImportePago,
            BC00025_n30FMImportePago, BC00025_A31FMPathPdf, BC00025_n31FMPathPdf
            }
            , new Object[] {
            BC00026_A2FMId
            }
            , new Object[] {
            BC00027_A2FMId, BC00027_A21FMIdNetMovimiento, BC00027_n21FMIdNetMovimiento, BC00027_A22FMFechaEmision, BC00027_n22FMFechaEmision, BC00027_A23FMFechaVencimiento, BC00027_n23FMFechaVencimiento, BC00027_A24FMTipo, BC00027_n24FMTipo, BC00027_A25FMNumero,
            BC00027_n25FMNumero, BC00027_A26FMDetalle, BC00027_n26FMDetalle, BC00027_A27FMImporte, BC00027_n27FMImporte, BC00027_A28FMIdUsuarioNet, BC00027_n28FMIdUsuarioNet, BC00027_A29FMTipoMovimiento, BC00027_n29FMTipoMovimiento, BC00027_A30FMImportePago,
            BC00027_n30FMImportePago, BC00027_A31FMPathPdf, BC00027_n31FMPathPdf
            }
            , new Object[] {
            BC00028_A2FMId, BC00028_A21FMIdNetMovimiento, BC00028_n21FMIdNetMovimiento, BC00028_A22FMFechaEmision, BC00028_n22FMFechaEmision, BC00028_A23FMFechaVencimiento, BC00028_n23FMFechaVencimiento, BC00028_A24FMTipo, BC00028_n24FMTipo, BC00028_A25FMNumero,
            BC00028_n25FMNumero, BC00028_A26FMDetalle, BC00028_n26FMDetalle, BC00028_A27FMImporte, BC00028_n27FMImporte, BC00028_A28FMIdUsuarioNet, BC00028_n28FMIdUsuarioNet, BC00028_A29FMTipoMovimiento, BC00028_n29FMTipoMovimiento, BC00028_A30FMImportePago,
            BC00028_n30FMImportePago, BC00028_A31FMPathPdf, BC00028_n31FMPathPdf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000212_A2FMId, BC000212_A21FMIdNetMovimiento, BC000212_n21FMIdNetMovimiento, BC000212_A22FMFechaEmision, BC000212_n22FMFechaEmision, BC000212_A23FMFechaVencimiento, BC000212_n23FMFechaVencimiento, BC000212_A24FMTipo, BC000212_n24FMTipo, BC000212_A25FMNumero,
            BC000212_n25FMNumero, BC000212_A26FMDetalle, BC000212_n26FMDetalle, BC000212_A27FMImporte, BC000212_n27FMImporte, BC000212_A28FMIdUsuarioNet, BC000212_n28FMIdUsuarioNet, BC000212_A29FMTipoMovimiento, BC000212_n29FMTipoMovimiento, BC000212_A30FMImportePago,
            BC000212_n30FMImportePago, BC000212_A31FMPathPdf, BC000212_n31FMPathPdf
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound2 ;
   private short nIsDirty_2 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GX_JID ;
   private long A2FMId ;
   private long A21FMIdNetMovimiento ;
   private long A25FMNumero ;
   private long A27FMImporte ;
   private long A28FMIdUsuarioNet ;
   private long A29FMTipoMovimiento ;
   private long A30FMImportePago ;
   private long Z2FMId ;
   private long Z21FMIdNetMovimiento ;
   private long Z25FMNumero ;
   private long Z27FMImporte ;
   private long Z28FMIdUsuarioNet ;
   private long Z29FMTipoMovimiento ;
   private long Z30FMImportePago ;
   private long Z176FMSaldoActual ;
   private long A176FMSaldoActual ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode2 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private java.util.Date A22FMFechaEmision ;
   private java.util.Date A23FMFechaVencimiento ;
   private java.util.Date Z22FMFechaEmision ;
   private java.util.Date Z23FMFechaVencimiento ;
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
   private boolean mustCommit ;
   private String A24FMTipo ;
   private String A26FMDetalle ;
   private String A31FMPathPdf ;
   private String Z24FMTipo ;
   private String Z26FMDetalle ;
   private String Z31FMPathPdf ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtFacturaMovimiento> gx_restcollection ;
   private com.colaveco.SdtFacturaMovimiento bcFacturaMovimiento ;
   private com.colaveco.SdtFacturaMovimiento gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00024_A2FMId ;
   private long[] BC00024_A21FMIdNetMovimiento ;
   private boolean[] BC00024_n21FMIdNetMovimiento ;
   private java.util.Date[] BC00024_A22FMFechaEmision ;
   private boolean[] BC00024_n22FMFechaEmision ;
   private java.util.Date[] BC00024_A23FMFechaVencimiento ;
   private boolean[] BC00024_n23FMFechaVencimiento ;
   private String[] BC00024_A24FMTipo ;
   private boolean[] BC00024_n24FMTipo ;
   private long[] BC00024_A25FMNumero ;
   private boolean[] BC00024_n25FMNumero ;
   private String[] BC00024_A26FMDetalle ;
   private boolean[] BC00024_n26FMDetalle ;
   private long[] BC00024_A27FMImporte ;
   private boolean[] BC00024_n27FMImporte ;
   private long[] BC00024_A28FMIdUsuarioNet ;
   private boolean[] BC00024_n28FMIdUsuarioNet ;
   private long[] BC00024_A29FMTipoMovimiento ;
   private boolean[] BC00024_n29FMTipoMovimiento ;
   private long[] BC00024_A30FMImportePago ;
   private boolean[] BC00024_n30FMImportePago ;
   private String[] BC00024_A31FMPathPdf ;
   private boolean[] BC00024_n31FMPathPdf ;
   private long[] BC00025_A2FMId ;
   private long[] BC00025_A21FMIdNetMovimiento ;
   private boolean[] BC00025_n21FMIdNetMovimiento ;
   private java.util.Date[] BC00025_A22FMFechaEmision ;
   private boolean[] BC00025_n22FMFechaEmision ;
   private java.util.Date[] BC00025_A23FMFechaVencimiento ;
   private boolean[] BC00025_n23FMFechaVencimiento ;
   private String[] BC00025_A24FMTipo ;
   private boolean[] BC00025_n24FMTipo ;
   private long[] BC00025_A25FMNumero ;
   private boolean[] BC00025_n25FMNumero ;
   private String[] BC00025_A26FMDetalle ;
   private boolean[] BC00025_n26FMDetalle ;
   private long[] BC00025_A27FMImporte ;
   private boolean[] BC00025_n27FMImporte ;
   private long[] BC00025_A28FMIdUsuarioNet ;
   private boolean[] BC00025_n28FMIdUsuarioNet ;
   private long[] BC00025_A29FMTipoMovimiento ;
   private boolean[] BC00025_n29FMTipoMovimiento ;
   private long[] BC00025_A30FMImportePago ;
   private boolean[] BC00025_n30FMImportePago ;
   private String[] BC00025_A31FMPathPdf ;
   private boolean[] BC00025_n31FMPathPdf ;
   private long[] BC00026_A2FMId ;
   private long[] BC00027_A2FMId ;
   private long[] BC00027_A21FMIdNetMovimiento ;
   private boolean[] BC00027_n21FMIdNetMovimiento ;
   private java.util.Date[] BC00027_A22FMFechaEmision ;
   private boolean[] BC00027_n22FMFechaEmision ;
   private java.util.Date[] BC00027_A23FMFechaVencimiento ;
   private boolean[] BC00027_n23FMFechaVencimiento ;
   private String[] BC00027_A24FMTipo ;
   private boolean[] BC00027_n24FMTipo ;
   private long[] BC00027_A25FMNumero ;
   private boolean[] BC00027_n25FMNumero ;
   private String[] BC00027_A26FMDetalle ;
   private boolean[] BC00027_n26FMDetalle ;
   private long[] BC00027_A27FMImporte ;
   private boolean[] BC00027_n27FMImporte ;
   private long[] BC00027_A28FMIdUsuarioNet ;
   private boolean[] BC00027_n28FMIdUsuarioNet ;
   private long[] BC00027_A29FMTipoMovimiento ;
   private boolean[] BC00027_n29FMTipoMovimiento ;
   private long[] BC00027_A30FMImportePago ;
   private boolean[] BC00027_n30FMImportePago ;
   private String[] BC00027_A31FMPathPdf ;
   private boolean[] BC00027_n31FMPathPdf ;
   private long[] BC00028_A2FMId ;
   private long[] BC00028_A21FMIdNetMovimiento ;
   private boolean[] BC00028_n21FMIdNetMovimiento ;
   private java.util.Date[] BC00028_A22FMFechaEmision ;
   private boolean[] BC00028_n22FMFechaEmision ;
   private java.util.Date[] BC00028_A23FMFechaVencimiento ;
   private boolean[] BC00028_n23FMFechaVencimiento ;
   private String[] BC00028_A24FMTipo ;
   private boolean[] BC00028_n24FMTipo ;
   private long[] BC00028_A25FMNumero ;
   private boolean[] BC00028_n25FMNumero ;
   private String[] BC00028_A26FMDetalle ;
   private boolean[] BC00028_n26FMDetalle ;
   private long[] BC00028_A27FMImporte ;
   private boolean[] BC00028_n27FMImporte ;
   private long[] BC00028_A28FMIdUsuarioNet ;
   private boolean[] BC00028_n28FMIdUsuarioNet ;
   private long[] BC00028_A29FMTipoMovimiento ;
   private boolean[] BC00028_n29FMTipoMovimiento ;
   private long[] BC00028_A30FMImportePago ;
   private boolean[] BC00028_n30FMImportePago ;
   private String[] BC00028_A31FMPathPdf ;
   private boolean[] BC00028_n31FMPathPdf ;
   private long[] BC000212_A2FMId ;
   private long[] BC000212_A21FMIdNetMovimiento ;
   private boolean[] BC000212_n21FMIdNetMovimiento ;
   private java.util.Date[] BC000212_A22FMFechaEmision ;
   private boolean[] BC000212_n22FMFechaEmision ;
   private java.util.Date[] BC000212_A23FMFechaVencimiento ;
   private boolean[] BC000212_n23FMFechaVencimiento ;
   private String[] BC000212_A24FMTipo ;
   private boolean[] BC000212_n24FMTipo ;
   private long[] BC000212_A25FMNumero ;
   private boolean[] BC000212_n25FMNumero ;
   private String[] BC000212_A26FMDetalle ;
   private boolean[] BC000212_n26FMDetalle ;
   private long[] BC000212_A27FMImporte ;
   private boolean[] BC000212_n27FMImporte ;
   private long[] BC000212_A28FMIdUsuarioNet ;
   private boolean[] BC000212_n28FMIdUsuarioNet ;
   private long[] BC000212_A29FMTipoMovimiento ;
   private boolean[] BC000212_n29FMTipoMovimiento ;
   private long[] BC000212_A30FMImportePago ;
   private boolean[] BC000212_n30FMImportePago ;
   private String[] BC000212_A31FMPathPdf ;
   private boolean[] BC000212_n31FMPathPdf ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00022_A2FMId ;
   private long[] BC00022_A21FMIdNetMovimiento ;
   private java.util.Date[] BC00022_A22FMFechaEmision ;
   private java.util.Date[] BC00022_A23FMFechaVencimiento ;
   private String[] BC00022_A24FMTipo ;
   private long[] BC00022_A25FMNumero ;
   private String[] BC00022_A26FMDetalle ;
   private long[] BC00022_A27FMImporte ;
   private long[] BC00022_A28FMIdUsuarioNet ;
   private long[] BC00022_A29FMTipoMovimiento ;
   private long[] BC00022_A30FMImportePago ;
   private String[] BC00022_A31FMPathPdf ;
   private long[] BC00023_A2FMId ;
   private long[] BC00023_A21FMIdNetMovimiento ;
   private java.util.Date[] BC00023_A22FMFechaEmision ;
   private java.util.Date[] BC00023_A23FMFechaVencimiento ;
   private String[] BC00023_A24FMTipo ;
   private long[] BC00023_A25FMNumero ;
   private String[] BC00023_A26FMDetalle ;
   private long[] BC00023_A27FMImporte ;
   private long[] BC00023_A28FMIdUsuarioNet ;
   private long[] BC00023_A29FMTipoMovimiento ;
   private long[] BC00023_A30FMImportePago ;
   private String[] BC00023_A31FMPathPdf ;
   private boolean[] BC00022_n21FMIdNetMovimiento ;
   private boolean[] BC00022_n22FMFechaEmision ;
   private boolean[] BC00022_n23FMFechaVencimiento ;
   private boolean[] BC00022_n24FMTipo ;
   private boolean[] BC00022_n25FMNumero ;
   private boolean[] BC00022_n26FMDetalle ;
   private boolean[] BC00022_n27FMImporte ;
   private boolean[] BC00022_n28FMIdUsuarioNet ;
   private boolean[] BC00022_n29FMTipoMovimiento ;
   private boolean[] BC00022_n30FMImportePago ;
   private boolean[] BC00022_n31FMPathPdf ;
   private boolean[] BC00023_n21FMIdNetMovimiento ;
   private boolean[] BC00023_n22FMFechaEmision ;
   private boolean[] BC00023_n23FMFechaVencimiento ;
   private boolean[] BC00023_n24FMTipo ;
   private boolean[] BC00023_n25FMNumero ;
   private boolean[] BC00023_n26FMDetalle ;
   private boolean[] BC00023_n27FMImporte ;
   private boolean[] BC00023_n28FMIdUsuarioNet ;
   private boolean[] BC00023_n29FMTipoMovimiento ;
   private boolean[] BC00023_n30FMImportePago ;
   private boolean[] BC00023_n31FMPathPdf ;
}

final  class facturamovimiento_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class facturamovimiento_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00022", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00023", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00024", "SELECT TM1.`FMId`, TM1.`FMIdNetMovimiento`, TM1.`FMFechaEmision`, TM1.`FMFechaVencimiento`, TM1.`FMTipo`, TM1.`FMNumero`, TM1.`FMDetalle`, TM1.`FMImporte`, TM1.`FMIdUsuarioNet`, TM1.`FMTipoMovimiento`, TM1.`FMImportePago`, TM1.`FMPathPdf` FROM `FacturaMovimiento` TM1 ORDER BY TM1.`FMId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00025", "SELECT TM1.`FMId`, TM1.`FMIdNetMovimiento`, TM1.`FMFechaEmision`, TM1.`FMFechaVencimiento`, TM1.`FMTipo`, TM1.`FMNumero`, TM1.`FMDetalle`, TM1.`FMImporte`, TM1.`FMIdUsuarioNet`, TM1.`FMTipoMovimiento`, TM1.`FMImportePago`, TM1.`FMPathPdf` FROM `FacturaMovimiento` TM1 WHERE TM1.`FMId` = ? ORDER BY TM1.`FMId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00026", "SELECT `FMId` FROM `FacturaMovimiento` WHERE `FMId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00027", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00028", "SELECT `FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf` FROM `FacturaMovimiento` WHERE `FMId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00029", "INSERT INTO `FacturaMovimiento`(`FMId`, `FMIdNetMovimiento`, `FMFechaEmision`, `FMFechaVencimiento`, `FMTipo`, `FMNumero`, `FMDetalle`, `FMImporte`, `FMIdUsuarioNet`, `FMTipoMovimiento`, `FMImportePago`, `FMPathPdf`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000210", "UPDATE `FacturaMovimiento` SET `FMIdNetMovimiento`=?, `FMFechaEmision`=?, `FMFechaVencimiento`=?, `FMTipo`=?, `FMNumero`=?, `FMDetalle`=?, `FMImporte`=?, `FMIdUsuarioNet`=?, `FMTipoMovimiento`=?, `FMImportePago`=?, `FMPathPdf`=?  WHERE `FMId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000211", "DELETE FROM `FacturaMovimiento`  WHERE `FMId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000212", "SELECT TM1.`FMId`, TM1.`FMIdNetMovimiento`, TM1.`FMFechaEmision`, TM1.`FMFechaVencimiento`, TM1.`FMTipo`, TM1.`FMNumero`, TM1.`FMDetalle`, TM1.`FMImporte`, TM1.`FMIdUsuarioNet`, TM1.`FMTipoMovimiento`, TM1.`FMImportePago`, TM1.`FMPathPdf` FROM `FacturaMovimiento` TM1 WHERE TM1.`FMId` = ? ORDER BY TM1.`FMId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
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
            case 6 :
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
            case 10 :
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
            case 8 :
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
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

