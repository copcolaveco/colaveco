package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class resultado_bc extends GXWebPanel implements IGxSilentTrn
{
   public resultado_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public resultado_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resultado_bc.class ));
   }

   public resultado_bc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtResultado> GetAll( int Start ,
                                                            int Count )
   {
      GXPagingFrom1 = Start ;
      GXPagingTo1 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00014 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom1), Integer.valueOf(GXPagingTo1)});
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1resultadoId = BC00014_A1resultadoId[0] ;
         A7resultadoFicha = BC00014_A7resultadoFicha[0] ;
         n7resultadoFicha = BC00014_n7resultadoFicha[0] ;
         A8resultadoComentarios = BC00014_A8resultadoComentarios[0] ;
         n8resultadoComentarios = BC00014_n8resultadoComentarios[0] ;
         A9resultadoUserId = BC00014_A9resultadoUserId[0] ;
         n9resultadoUserId = BC00014_n9resultadoUserId[0] ;
         A10resultadoTypeId = BC00014_A10resultadoTypeId[0] ;
         n10resultadoTypeId = BC00014_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = BC00014_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = BC00014_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = BC00014_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = BC00014_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = BC00014_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = BC00014_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = BC00014_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = BC00014_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = BC00014_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = BC00014_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = BC00014_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = BC00014_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = BC00014_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = BC00014_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = BC00014_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = BC00014_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = BC00014_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = BC00014_A19resultadoEliminado[0] ;
         n19resultadoEliminado = BC00014_n19resultadoEliminado[0] ;
         A20resultadoAbonado = BC00014_A20resultadoAbonado[0] ;
         n20resultadoAbonado = BC00014_n20resultadoAbonado[0] ;
      }
      bcResultado = new com.colaveco.SdtResultado(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound1 != 0 )
      {
         onLoadActions011( ) ;
         addRow011( ) ;
         gx_sdt_item = bcResultado.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound1 = (short)(0) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound1 = (short)(1) ;
            A1resultadoId = BC00014_A1resultadoId[0] ;
            A7resultadoFicha = BC00014_A7resultadoFicha[0] ;
            n7resultadoFicha = BC00014_n7resultadoFicha[0] ;
            A8resultadoComentarios = BC00014_A8resultadoComentarios[0] ;
            n8resultadoComentarios = BC00014_n8resultadoComentarios[0] ;
            A9resultadoUserId = BC00014_A9resultadoUserId[0] ;
            n9resultadoUserId = BC00014_n9resultadoUserId[0] ;
            A10resultadoTypeId = BC00014_A10resultadoTypeId[0] ;
            n10resultadoTypeId = BC00014_n10resultadoTypeId[0] ;
            A11resultadoIdNetUsuario = BC00014_A11resultadoIdNetUsuario[0] ;
            n11resultadoIdNetUsuario = BC00014_n11resultadoIdNetUsuario[0] ;
            A12resultadoFechaCreado = BC00014_A12resultadoFechaCreado[0] ;
            n12resultadoFechaCreado = BC00014_n12resultadoFechaCreado[0] ;
            A13resultadoFechaEmision = BC00014_A13resultadoFechaEmision[0] ;
            n13resultadoFechaEmision = BC00014_n13resultadoFechaEmision[0] ;
            A14resultadoPathExcel = BC00014_A14resultadoPathExcel[0] ;
            n14resultadoPathExcel = BC00014_n14resultadoPathExcel[0] ;
            A15resultadoPathPdf = BC00014_A15resultadoPathPdf[0] ;
            n15resultadoPathPdf = BC00014_n15resultadoPathPdf[0] ;
            A16resultadoPathCsv = BC00014_A16resultadoPathCsv[0] ;
            n16resultadoPathCsv = BC00014_n16resultadoPathCsv[0] ;
            A17resultadoIdEstado = BC00014_A17resultadoIdEstado[0] ;
            n17resultadoIdEstado = BC00014_n17resultadoIdEstado[0] ;
            A18resultadoIdLibro = BC00014_A18resultadoIdLibro[0] ;
            n18resultadoIdLibro = BC00014_n18resultadoIdLibro[0] ;
            A166resultadoIdNetTipoinforme = BC00014_A166resultadoIdNetTipoinforme[0] ;
            A19resultadoEliminado = BC00014_A19resultadoEliminado[0] ;
            n19resultadoEliminado = BC00014_n19resultadoEliminado[0] ;
            A20resultadoAbonado = BC00014_A20resultadoAbonado[0] ;
            n20resultadoAbonado = BC00014_n20resultadoAbonado[0] ;
         }
         Gx_mode = sMode1 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm011( 0) ;
   }

   public void getInsDefault( )
   {
      readRow011( ) ;
      standaloneNotModal( ) ;
      initializeNonKey011( ) ;
      standaloneModal( ) ;
      addRow011( ) ;
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
         e11012 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z1resultadoId = A1resultadoId ;
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
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e12012( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e11012( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
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
      if ( GX_JID == -3 )
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
   }

   public void standaloneModal( )
   {
   }

   public void load011( )
   {
      /* Using cursor BC00015 */
      pr_default.execute(3, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A7resultadoFicha = BC00015_A7resultadoFicha[0] ;
         n7resultadoFicha = BC00015_n7resultadoFicha[0] ;
         A8resultadoComentarios = BC00015_A8resultadoComentarios[0] ;
         n8resultadoComentarios = BC00015_n8resultadoComentarios[0] ;
         A9resultadoUserId = BC00015_A9resultadoUserId[0] ;
         n9resultadoUserId = BC00015_n9resultadoUserId[0] ;
         A10resultadoTypeId = BC00015_A10resultadoTypeId[0] ;
         n10resultadoTypeId = BC00015_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = BC00015_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = BC00015_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = BC00015_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = BC00015_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = BC00015_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = BC00015_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = BC00015_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = BC00015_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = BC00015_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = BC00015_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = BC00015_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = BC00015_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = BC00015_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = BC00015_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = BC00015_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = BC00015_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = BC00015_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = BC00015_A19resultadoEliminado[0] ;
         n19resultadoEliminado = BC00015_n19resultadoEliminado[0] ;
         A20resultadoAbonado = BC00015_A20resultadoAbonado[0] ;
         n20resultadoAbonado = BC00015_n20resultadoAbonado[0] ;
         zm011( -3) ;
      }
      pr_default.close(3);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
   }

   public void checkExtendedTable011( )
   {
      nIsDirty_1 = (short)(0) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12resultadoFechaCreado)) || (( GXutil.resetTime(A12resultadoFechaCreado).after( GXutil.resetTime( localUtil.ymdtod( 1000, 1, 1) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A12resultadoFechaCreado), GXutil.resetTime(localUtil.ymdtod( 1000, 1, 1))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field resultado Fecha Creado is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13resultadoFechaEmision)) || (( GXutil.resetTime(A13resultadoFechaEmision).after( GXutil.resetTime( localUtil.ymdtod( 1000, 1, 1) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13resultadoFechaEmision), GXutil.resetTime(localUtil.ymdtod( 1000, 1, 1))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field resultado Fecha Emision is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      /* Using cursor BC00016 */
      pr_default.execute(4, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00017 */
      pr_default.execute(5, new Object[] {Long.valueOf(A1resultadoId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm011( 3) ;
         RcdFound1 = (short)(1) ;
         A1resultadoId = BC00017_A1resultadoId[0] ;
         A7resultadoFicha = BC00017_A7resultadoFicha[0] ;
         n7resultadoFicha = BC00017_n7resultadoFicha[0] ;
         A8resultadoComentarios = BC00017_A8resultadoComentarios[0] ;
         n8resultadoComentarios = BC00017_n8resultadoComentarios[0] ;
         A9resultadoUserId = BC00017_A9resultadoUserId[0] ;
         n9resultadoUserId = BC00017_n9resultadoUserId[0] ;
         A10resultadoTypeId = BC00017_A10resultadoTypeId[0] ;
         n10resultadoTypeId = BC00017_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = BC00017_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = BC00017_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = BC00017_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = BC00017_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = BC00017_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = BC00017_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = BC00017_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = BC00017_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = BC00017_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = BC00017_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = BC00017_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = BC00017_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = BC00017_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = BC00017_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = BC00017_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = BC00017_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = BC00017_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = BC00017_A19resultadoEliminado[0] ;
         n19resultadoEliminado = BC00017_n19resultadoEliminado[0] ;
         A20resultadoAbonado = BC00017_A20resultadoAbonado[0] ;
         n20resultadoAbonado = BC00017_n20resultadoAbonado[0] ;
         Z1resultadoId = A1resultadoId ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
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
      confirm_010( ) ;
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

   public void checkOptimisticConcurrency011( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00018 */
         pr_default.execute(6, new Object[] {Long.valueOf(A1resultadoId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Resultado"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( Z7resultadoFicha != BC00018_A7resultadoFicha[0] ) || ( GXutil.strcmp(Z8resultadoComentarios, BC00018_A8resultadoComentarios[0]) != 0 ) || ( Z9resultadoUserId != BC00018_A9resultadoUserId[0] ) || ( Z10resultadoTypeId != BC00018_A10resultadoTypeId[0] ) || ( Z11resultadoIdNetUsuario != BC00018_A11resultadoIdNetUsuario[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z12resultadoFechaCreado), GXutil.resetTime(BC00018_A12resultadoFechaCreado[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z13resultadoFechaEmision), GXutil.resetTime(BC00018_A13resultadoFechaEmision[0])) ) || ( GXutil.strcmp(Z14resultadoPathExcel, BC00018_A14resultadoPathExcel[0]) != 0 ) || ( GXutil.strcmp(Z15resultadoPathPdf, BC00018_A15resultadoPathPdf[0]) != 0 ) || ( GXutil.strcmp(Z16resultadoPathCsv, BC00018_A16resultadoPathCsv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z17resultadoIdEstado != BC00018_A17resultadoIdEstado[0] ) || ( Z18resultadoIdLibro != BC00018_A18resultadoIdLibro[0] ) || ( Z166resultadoIdNetTipoinforme != BC00018_A166resultadoIdNetTipoinforme[0] ) || ( Z19resultadoEliminado != BC00018_A19resultadoEliminado[0] ) || ( Z20resultadoAbonado != BC00018_A20resultadoAbonado[0] ) )
         {
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
                  /* Using cursor BC00019 */
                  pr_default.execute(7, new Object[] {Long.valueOf(A1resultadoId), Boolean.valueOf(n7resultadoFicha), Long.valueOf(A7resultadoFicha), Boolean.valueOf(n8resultadoComentarios), A8resultadoComentarios, Boolean.valueOf(n9resultadoUserId), Long.valueOf(A9resultadoUserId), Boolean.valueOf(n10resultadoTypeId), Long.valueOf(A10resultadoTypeId), Boolean.valueOf(n11resultadoIdNetUsuario), Long.valueOf(A11resultadoIdNetUsuario), Boolean.valueOf(n12resultadoFechaCreado), A12resultadoFechaCreado, Boolean.valueOf(n13resultadoFechaEmision), A13resultadoFechaEmision, Boolean.valueOf(n14resultadoPathExcel), A14resultadoPathExcel, Boolean.valueOf(n15resultadoPathPdf), A15resultadoPathPdf, Boolean.valueOf(n16resultadoPathCsv), A16resultadoPathCsv, Boolean.valueOf(n17resultadoIdEstado), Long.valueOf(A17resultadoIdEstado), Boolean.valueOf(n18resultadoIdLibro), Long.valueOf(A18resultadoIdLibro), Long.valueOf(A166resultadoIdNetTipoinforme), Boolean.valueOf(n19resultadoEliminado), Byte.valueOf(A19resultadoEliminado), Boolean.valueOf(n20resultadoAbonado), Long.valueOf(A20resultadoAbonado)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
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
                  /* Using cursor BC000110 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n7resultadoFicha), Long.valueOf(A7resultadoFicha), Boolean.valueOf(n8resultadoComentarios), A8resultadoComentarios, Boolean.valueOf(n9resultadoUserId), Long.valueOf(A9resultadoUserId), Boolean.valueOf(n10resultadoTypeId), Long.valueOf(A10resultadoTypeId), Boolean.valueOf(n11resultadoIdNetUsuario), Long.valueOf(A11resultadoIdNetUsuario), Boolean.valueOf(n12resultadoFechaCreado), A12resultadoFechaCreado, Boolean.valueOf(n13resultadoFechaEmision), A13resultadoFechaEmision, Boolean.valueOf(n14resultadoPathExcel), A14resultadoPathExcel, Boolean.valueOf(n15resultadoPathPdf), A15resultadoPathPdf, Boolean.valueOf(n16resultadoPathCsv), A16resultadoPathCsv, Boolean.valueOf(n17resultadoIdEstado), Long.valueOf(A17resultadoIdEstado), Boolean.valueOf(n18resultadoIdLibro), Long.valueOf(A18resultadoIdLibro), Long.valueOf(A166resultadoIdNetTipoinforme), Boolean.valueOf(n19resultadoEliminado), Byte.valueOf(A19resultadoEliminado), Boolean.valueOf(n20resultadoAbonado), Long.valueOf(A20resultadoAbonado), Long.valueOf(A1resultadoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
                  if ( (pr_default.getStatus(8) == 103) )
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
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
               /* Using cursor BC000111 */
               pr_default.execute(9, new Object[] {Long.valueOf(A1resultadoId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Resultado");
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel011( ) ;
      Gx_mode = sMode1 ;
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel011( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
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

   public void scanKeyStart011( )
   {
      /* Scan By routine */
      /* Using cursor BC000112 */
      pr_default.execute(10, new Object[] {Long.valueOf(A1resultadoId)});
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1resultadoId = BC000112_A1resultadoId[0] ;
         A7resultadoFicha = BC000112_A7resultadoFicha[0] ;
         n7resultadoFicha = BC000112_n7resultadoFicha[0] ;
         A8resultadoComentarios = BC000112_A8resultadoComentarios[0] ;
         n8resultadoComentarios = BC000112_n8resultadoComentarios[0] ;
         A9resultadoUserId = BC000112_A9resultadoUserId[0] ;
         n9resultadoUserId = BC000112_n9resultadoUserId[0] ;
         A10resultadoTypeId = BC000112_A10resultadoTypeId[0] ;
         n10resultadoTypeId = BC000112_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = BC000112_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = BC000112_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = BC000112_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = BC000112_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = BC000112_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = BC000112_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = BC000112_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = BC000112_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = BC000112_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = BC000112_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = BC000112_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = BC000112_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = BC000112_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = BC000112_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = BC000112_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = BC000112_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = BC000112_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = BC000112_A19resultadoEliminado[0] ;
         n19resultadoEliminado = BC000112_n19resultadoEliminado[0] ;
         A20resultadoAbonado = BC000112_A20resultadoAbonado[0] ;
         n20resultadoAbonado = BC000112_n20resultadoAbonado[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1 = (short)(0) ;
      scanKeyLoad011( ) ;
   }

   public void scanKeyLoad011( )
   {
      sMode1 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1resultadoId = BC000112_A1resultadoId[0] ;
         A7resultadoFicha = BC000112_A7resultadoFicha[0] ;
         n7resultadoFicha = BC000112_n7resultadoFicha[0] ;
         A8resultadoComentarios = BC000112_A8resultadoComentarios[0] ;
         n8resultadoComentarios = BC000112_n8resultadoComentarios[0] ;
         A9resultadoUserId = BC000112_A9resultadoUserId[0] ;
         n9resultadoUserId = BC000112_n9resultadoUserId[0] ;
         A10resultadoTypeId = BC000112_A10resultadoTypeId[0] ;
         n10resultadoTypeId = BC000112_n10resultadoTypeId[0] ;
         A11resultadoIdNetUsuario = BC000112_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = BC000112_n11resultadoIdNetUsuario[0] ;
         A12resultadoFechaCreado = BC000112_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = BC000112_n12resultadoFechaCreado[0] ;
         A13resultadoFechaEmision = BC000112_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = BC000112_n13resultadoFechaEmision[0] ;
         A14resultadoPathExcel = BC000112_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = BC000112_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = BC000112_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = BC000112_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = BC000112_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = BC000112_n16resultadoPathCsv[0] ;
         A17resultadoIdEstado = BC000112_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = BC000112_n17resultadoIdEstado[0] ;
         A18resultadoIdLibro = BC000112_A18resultadoIdLibro[0] ;
         n18resultadoIdLibro = BC000112_n18resultadoIdLibro[0] ;
         A166resultadoIdNetTipoinforme = BC000112_A166resultadoIdNetTipoinforme[0] ;
         A19resultadoEliminado = BC000112_A19resultadoEliminado[0] ;
         n19resultadoEliminado = BC000112_n19resultadoEliminado[0] ;
         A20resultadoAbonado = BC000112_A20resultadoAbonado[0] ;
         n20resultadoAbonado = BC000112_n20resultadoAbonado[0] ;
      }
      Gx_mode = sMode1 ;
   }

   public void scanKeyEnd011( )
   {
      pr_default.close(10);
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
   }

   public void send_integrity_lvl_hashes011( )
   {
   }

   public void addRow011( )
   {
      VarsToRow1( bcResultado) ;
   }

   public void readRow011( )
   {
      RowToVars1( bcResultado, 1) ;
   }

   public void initializeNonKey011( )
   {
      A7resultadoFicha = 0 ;
      n7resultadoFicha = false ;
      A8resultadoComentarios = "" ;
      n8resultadoComentarios = false ;
      A9resultadoUserId = 0 ;
      n9resultadoUserId = false ;
      A10resultadoTypeId = 0 ;
      n10resultadoTypeId = false ;
      A11resultadoIdNetUsuario = 0 ;
      n11resultadoIdNetUsuario = false ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      n12resultadoFechaCreado = false ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      n13resultadoFechaEmision = false ;
      A14resultadoPathExcel = "" ;
      n14resultadoPathExcel = false ;
      A15resultadoPathPdf = "" ;
      n15resultadoPathPdf = false ;
      A16resultadoPathCsv = "" ;
      n16resultadoPathCsv = false ;
      A17resultadoIdEstado = 0 ;
      n17resultadoIdEstado = false ;
      A18resultadoIdLibro = 0 ;
      n18resultadoIdLibro = false ;
      A166resultadoIdNetTipoinforme = 0 ;
      A19resultadoEliminado = (byte)(0) ;
      n19resultadoEliminado = false ;
      A20resultadoAbonado = 0 ;
      n20resultadoAbonado = false ;
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
      initializeNonKey011( ) ;
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

   public void VarsToRow1( com.colaveco.SdtResultado obj1 )
   {
      obj1.setgxTv_SdtResultado_Mode( Gx_mode );
      obj1.setgxTv_SdtResultado_Resultadoficha( A7resultadoFicha );
      obj1.setgxTv_SdtResultado_Resultadocomentarios( A8resultadoComentarios );
      obj1.setgxTv_SdtResultado_Resultadouserid( A9resultadoUserId );
      obj1.setgxTv_SdtResultado_Resultadotypeid( A10resultadoTypeId );
      obj1.setgxTv_SdtResultado_Resultadoidnetusuario( A11resultadoIdNetUsuario );
      obj1.setgxTv_SdtResultado_Resultadofechacreado( A12resultadoFechaCreado );
      obj1.setgxTv_SdtResultado_Resultadofechaemision( A13resultadoFechaEmision );
      obj1.setgxTv_SdtResultado_Resultadopathexcel( A14resultadoPathExcel );
      obj1.setgxTv_SdtResultado_Resultadopathpdf( A15resultadoPathPdf );
      obj1.setgxTv_SdtResultado_Resultadopathcsv( A16resultadoPathCsv );
      obj1.setgxTv_SdtResultado_Resultadoidestado( A17resultadoIdEstado );
      obj1.setgxTv_SdtResultado_Resultadoidlibro( A18resultadoIdLibro );
      obj1.setgxTv_SdtResultado_Resultadoidnettipoinforme( A166resultadoIdNetTipoinforme );
      obj1.setgxTv_SdtResultado_Resultadoeliminado( A19resultadoEliminado );
      obj1.setgxTv_SdtResultado_Resultadoabonado( A20resultadoAbonado );
      obj1.setgxTv_SdtResultado_Resultadoid( A1resultadoId );
      obj1.setgxTv_SdtResultado_Resultadoid_Z( Z1resultadoId );
      obj1.setgxTv_SdtResultado_Resultadoficha_Z( Z7resultadoFicha );
      obj1.setgxTv_SdtResultado_Resultadocomentarios_Z( Z8resultadoComentarios );
      obj1.setgxTv_SdtResultado_Resultadouserid_Z( Z9resultadoUserId );
      obj1.setgxTv_SdtResultado_Resultadotypeid_Z( Z10resultadoTypeId );
      obj1.setgxTv_SdtResultado_Resultadoidnetusuario_Z( Z11resultadoIdNetUsuario );
      obj1.setgxTv_SdtResultado_Resultadofechacreado_Z( Z12resultadoFechaCreado );
      obj1.setgxTv_SdtResultado_Resultadofechaemision_Z( Z13resultadoFechaEmision );
      obj1.setgxTv_SdtResultado_Resultadopathexcel_Z( Z14resultadoPathExcel );
      obj1.setgxTv_SdtResultado_Resultadopathpdf_Z( Z15resultadoPathPdf );
      obj1.setgxTv_SdtResultado_Resultadopathcsv_Z( Z16resultadoPathCsv );
      obj1.setgxTv_SdtResultado_Resultadoidestado_Z( Z17resultadoIdEstado );
      obj1.setgxTv_SdtResultado_Resultadoidlibro_Z( Z18resultadoIdLibro );
      obj1.setgxTv_SdtResultado_Resultadoidnettipoinforme_Z( Z166resultadoIdNetTipoinforme );
      obj1.setgxTv_SdtResultado_Resultadoeliminado_Z( Z19resultadoEliminado );
      obj1.setgxTv_SdtResultado_Resultadoabonado_Z( Z20resultadoAbonado );
      obj1.setgxTv_SdtResultado_Resultadoficha_N( (byte)((byte)((n7resultadoFicha)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadocomentarios_N( (byte)((byte)((n8resultadoComentarios)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadouserid_N( (byte)((byte)((n9resultadoUserId)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadotypeid_N( (byte)((byte)((n10resultadoTypeId)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadoidnetusuario_N( (byte)((byte)((n11resultadoIdNetUsuario)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadofechacreado_N( (byte)((byte)((n12resultadoFechaCreado)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadofechaemision_N( (byte)((byte)((n13resultadoFechaEmision)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadopathexcel_N( (byte)((byte)((n14resultadoPathExcel)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadopathpdf_N( (byte)((byte)((n15resultadoPathPdf)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadopathcsv_N( (byte)((byte)((n16resultadoPathCsv)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadoidestado_N( (byte)((byte)((n17resultadoIdEstado)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadoidlibro_N( (byte)((byte)((n18resultadoIdLibro)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadoeliminado_N( (byte)((byte)((n19resultadoEliminado)?1:0)) );
      obj1.setgxTv_SdtResultado_Resultadoabonado_N( (byte)((byte)((n20resultadoAbonado)?1:0)) );
      obj1.setgxTv_SdtResultado_Mode( Gx_mode );
   }

   public void KeyVarsToRow1( com.colaveco.SdtResultado obj1 )
   {
      obj1.setgxTv_SdtResultado_Resultadoid( A1resultadoId );
   }

   public void RowToVars1( com.colaveco.SdtResultado obj1 ,
                           int forceLoad )
   {
      Gx_mode = obj1.getgxTv_SdtResultado_Mode() ;
      A7resultadoFicha = obj1.getgxTv_SdtResultado_Resultadoficha() ;
      n7resultadoFicha = false ;
      A8resultadoComentarios = obj1.getgxTv_SdtResultado_Resultadocomentarios() ;
      n8resultadoComentarios = false ;
      A9resultadoUserId = obj1.getgxTv_SdtResultado_Resultadouserid() ;
      n9resultadoUserId = false ;
      A10resultadoTypeId = obj1.getgxTv_SdtResultado_Resultadotypeid() ;
      n10resultadoTypeId = false ;
      A11resultadoIdNetUsuario = obj1.getgxTv_SdtResultado_Resultadoidnetusuario() ;
      n11resultadoIdNetUsuario = false ;
      A12resultadoFechaCreado = obj1.getgxTv_SdtResultado_Resultadofechacreado() ;
      n12resultadoFechaCreado = false ;
      A13resultadoFechaEmision = obj1.getgxTv_SdtResultado_Resultadofechaemision() ;
      n13resultadoFechaEmision = false ;
      A14resultadoPathExcel = obj1.getgxTv_SdtResultado_Resultadopathexcel() ;
      n14resultadoPathExcel = false ;
      A15resultadoPathPdf = obj1.getgxTv_SdtResultado_Resultadopathpdf() ;
      n15resultadoPathPdf = false ;
      A16resultadoPathCsv = obj1.getgxTv_SdtResultado_Resultadopathcsv() ;
      n16resultadoPathCsv = false ;
      A17resultadoIdEstado = obj1.getgxTv_SdtResultado_Resultadoidestado() ;
      n17resultadoIdEstado = false ;
      A18resultadoIdLibro = obj1.getgxTv_SdtResultado_Resultadoidlibro() ;
      n18resultadoIdLibro = false ;
      A166resultadoIdNetTipoinforme = obj1.getgxTv_SdtResultado_Resultadoidnettipoinforme() ;
      A19resultadoEliminado = obj1.getgxTv_SdtResultado_Resultadoeliminado() ;
      n19resultadoEliminado = false ;
      A20resultadoAbonado = obj1.getgxTv_SdtResultado_Resultadoabonado() ;
      n20resultadoAbonado = false ;
      A1resultadoId = obj1.getgxTv_SdtResultado_Resultadoid() ;
      Z1resultadoId = obj1.getgxTv_SdtResultado_Resultadoid_Z() ;
      Z7resultadoFicha = obj1.getgxTv_SdtResultado_Resultadoficha_Z() ;
      Z8resultadoComentarios = obj1.getgxTv_SdtResultado_Resultadocomentarios_Z() ;
      Z9resultadoUserId = obj1.getgxTv_SdtResultado_Resultadouserid_Z() ;
      Z10resultadoTypeId = obj1.getgxTv_SdtResultado_Resultadotypeid_Z() ;
      Z11resultadoIdNetUsuario = obj1.getgxTv_SdtResultado_Resultadoidnetusuario_Z() ;
      Z12resultadoFechaCreado = obj1.getgxTv_SdtResultado_Resultadofechacreado_Z() ;
      Z13resultadoFechaEmision = obj1.getgxTv_SdtResultado_Resultadofechaemision_Z() ;
      Z14resultadoPathExcel = obj1.getgxTv_SdtResultado_Resultadopathexcel_Z() ;
      Z15resultadoPathPdf = obj1.getgxTv_SdtResultado_Resultadopathpdf_Z() ;
      Z16resultadoPathCsv = obj1.getgxTv_SdtResultado_Resultadopathcsv_Z() ;
      Z17resultadoIdEstado = obj1.getgxTv_SdtResultado_Resultadoidestado_Z() ;
      Z18resultadoIdLibro = obj1.getgxTv_SdtResultado_Resultadoidlibro_Z() ;
      Z166resultadoIdNetTipoinforme = obj1.getgxTv_SdtResultado_Resultadoidnettipoinforme_Z() ;
      Z19resultadoEliminado = obj1.getgxTv_SdtResultado_Resultadoeliminado_Z() ;
      Z20resultadoAbonado = obj1.getgxTv_SdtResultado_Resultadoabonado_Z() ;
      n7resultadoFicha = (boolean)((obj1.getgxTv_SdtResultado_Resultadoficha_N()==0)?false:true) ;
      n8resultadoComentarios = (boolean)((obj1.getgxTv_SdtResultado_Resultadocomentarios_N()==0)?false:true) ;
      n9resultadoUserId = (boolean)((obj1.getgxTv_SdtResultado_Resultadouserid_N()==0)?false:true) ;
      n10resultadoTypeId = (boolean)((obj1.getgxTv_SdtResultado_Resultadotypeid_N()==0)?false:true) ;
      n11resultadoIdNetUsuario = (boolean)((obj1.getgxTv_SdtResultado_Resultadoidnetusuario_N()==0)?false:true) ;
      n12resultadoFechaCreado = (boolean)((obj1.getgxTv_SdtResultado_Resultadofechacreado_N()==0)?false:true) ;
      n13resultadoFechaEmision = (boolean)((obj1.getgxTv_SdtResultado_Resultadofechaemision_N()==0)?false:true) ;
      n14resultadoPathExcel = (boolean)((obj1.getgxTv_SdtResultado_Resultadopathexcel_N()==0)?false:true) ;
      n15resultadoPathPdf = (boolean)((obj1.getgxTv_SdtResultado_Resultadopathpdf_N()==0)?false:true) ;
      n16resultadoPathCsv = (boolean)((obj1.getgxTv_SdtResultado_Resultadopathcsv_N()==0)?false:true) ;
      n17resultadoIdEstado = (boolean)((obj1.getgxTv_SdtResultado_Resultadoidestado_N()==0)?false:true) ;
      n18resultadoIdLibro = (boolean)((obj1.getgxTv_SdtResultado_Resultadoidlibro_N()==0)?false:true) ;
      n19resultadoEliminado = (boolean)((obj1.getgxTv_SdtResultado_Resultadoeliminado_N()==0)?false:true) ;
      n20resultadoAbonado = (boolean)((obj1.getgxTv_SdtResultado_Resultadoabonado_N()==0)?false:true) ;
      Gx_mode = obj1.getgxTv_SdtResultado_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1resultadoId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey011( ) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1resultadoId = A1resultadoId ;
      }
      zm011( -3) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
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
      RowToVars1( bcResultado, 0) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1resultadoId = A1resultadoId ;
      }
      zm011( -3) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert011( ) ;
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1resultadoId != Z1resultadoId )
            {
               A1resultadoId = Z1resultadoId ;
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
               update011( ) ;
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
               if ( A1resultadoId != Z1resultadoId )
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
                     insert011( ) ;
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
                     insert011( ) ;
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
      RowToVars1( bcResultado, 1) ;
      saveImpl( ) ;
      VarsToRow1( bcResultado) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1( bcResultado, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
      afterTrn( ) ;
      VarsToRow1( bcResultado) ;
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
         com.colaveco.SdtResultado auxBC = new com.colaveco.SdtResultado( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1resultadoId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcResultado);
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
      RowToVars1( bcResultado, 1) ;
      updateImpl( ) ;
      VarsToRow1( bcResultado) ;
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
      RowToVars1( bcResultado, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
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
      VarsToRow1( bcResultado) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcResultado, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A1resultadoId != Z1resultadoId )
         {
            A1resultadoId = Z1resultadoId ;
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
         if ( A1resultadoId != Z1resultadoId )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "resultado_bc");
      VarsToRow1( bcResultado) ;
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
      Gx_mode = bcResultado.getgxTv_SdtResultado_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcResultado.setgxTv_SdtResultado_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtResultado sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcResultado )
      {
         bcResultado = sdt ;
         if ( GXutil.strcmp(bcResultado.getgxTv_SdtResultado_Mode(), "") == 0 )
         {
            bcResultado.setgxTv_SdtResultado_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1( bcResultado) ;
         }
         else
         {
            RowToVars1( bcResultado, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcResultado.getgxTv_SdtResultado_Mode(), "") == 0 )
         {
            bcResultado.setgxTv_SdtResultado_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1( bcResultado, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtResultado getResultado_BC( )
   {
      return bcResultado ;
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
      BC00014_A1resultadoId = new long[1] ;
      BC00014_A7resultadoFicha = new long[1] ;
      BC00014_n7resultadoFicha = new boolean[] {false} ;
      BC00014_A8resultadoComentarios = new String[] {""} ;
      BC00014_n8resultadoComentarios = new boolean[] {false} ;
      BC00014_A9resultadoUserId = new long[1] ;
      BC00014_n9resultadoUserId = new boolean[] {false} ;
      BC00014_A10resultadoTypeId = new long[1] ;
      BC00014_n10resultadoTypeId = new boolean[] {false} ;
      BC00014_A11resultadoIdNetUsuario = new long[1] ;
      BC00014_n11resultadoIdNetUsuario = new boolean[] {false} ;
      BC00014_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00014_n12resultadoFechaCreado = new boolean[] {false} ;
      BC00014_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00014_n13resultadoFechaEmision = new boolean[] {false} ;
      BC00014_A14resultadoPathExcel = new String[] {""} ;
      BC00014_n14resultadoPathExcel = new boolean[] {false} ;
      BC00014_A15resultadoPathPdf = new String[] {""} ;
      BC00014_n15resultadoPathPdf = new boolean[] {false} ;
      BC00014_A16resultadoPathCsv = new String[] {""} ;
      BC00014_n16resultadoPathCsv = new boolean[] {false} ;
      BC00014_A17resultadoIdEstado = new long[1] ;
      BC00014_n17resultadoIdEstado = new boolean[] {false} ;
      BC00014_A18resultadoIdLibro = new long[1] ;
      BC00014_n18resultadoIdLibro = new boolean[] {false} ;
      BC00014_A166resultadoIdNetTipoinforme = new long[1] ;
      BC00014_A19resultadoEliminado = new byte[1] ;
      BC00014_n19resultadoEliminado = new boolean[] {false} ;
      BC00014_A20resultadoAbonado = new long[1] ;
      BC00014_n20resultadoAbonado = new boolean[] {false} ;
      A8resultadoComentarios = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      gx_restcollection = new GXBCCollection<com.colaveco.SdtResultado>(com.colaveco.SdtResultado.class, "Resultado", "Colaveco", remoteHandle);
      sMode1 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z8resultadoComentarios = "" ;
      Z12resultadoFechaCreado = GXutil.nullDate() ;
      Z13resultadoFechaEmision = GXutil.nullDate() ;
      Z14resultadoPathExcel = "" ;
      Z15resultadoPathPdf = "" ;
      Z16resultadoPathCsv = "" ;
      BC00015_A1resultadoId = new long[1] ;
      BC00015_A7resultadoFicha = new long[1] ;
      BC00015_n7resultadoFicha = new boolean[] {false} ;
      BC00015_A8resultadoComentarios = new String[] {""} ;
      BC00015_n8resultadoComentarios = new boolean[] {false} ;
      BC00015_A9resultadoUserId = new long[1] ;
      BC00015_n9resultadoUserId = new boolean[] {false} ;
      BC00015_A10resultadoTypeId = new long[1] ;
      BC00015_n10resultadoTypeId = new boolean[] {false} ;
      BC00015_A11resultadoIdNetUsuario = new long[1] ;
      BC00015_n11resultadoIdNetUsuario = new boolean[] {false} ;
      BC00015_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00015_n12resultadoFechaCreado = new boolean[] {false} ;
      BC00015_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00015_n13resultadoFechaEmision = new boolean[] {false} ;
      BC00015_A14resultadoPathExcel = new String[] {""} ;
      BC00015_n14resultadoPathExcel = new boolean[] {false} ;
      BC00015_A15resultadoPathPdf = new String[] {""} ;
      BC00015_n15resultadoPathPdf = new boolean[] {false} ;
      BC00015_A16resultadoPathCsv = new String[] {""} ;
      BC00015_n16resultadoPathCsv = new boolean[] {false} ;
      BC00015_A17resultadoIdEstado = new long[1] ;
      BC00015_n17resultadoIdEstado = new boolean[] {false} ;
      BC00015_A18resultadoIdLibro = new long[1] ;
      BC00015_n18resultadoIdLibro = new boolean[] {false} ;
      BC00015_A166resultadoIdNetTipoinforme = new long[1] ;
      BC00015_A19resultadoEliminado = new byte[1] ;
      BC00015_n19resultadoEliminado = new boolean[] {false} ;
      BC00015_A20resultadoAbonado = new long[1] ;
      BC00015_n20resultadoAbonado = new boolean[] {false} ;
      BC00016_A1resultadoId = new long[1] ;
      BC00017_A1resultadoId = new long[1] ;
      BC00017_A7resultadoFicha = new long[1] ;
      BC00017_n7resultadoFicha = new boolean[] {false} ;
      BC00017_A8resultadoComentarios = new String[] {""} ;
      BC00017_n8resultadoComentarios = new boolean[] {false} ;
      BC00017_A9resultadoUserId = new long[1] ;
      BC00017_n9resultadoUserId = new boolean[] {false} ;
      BC00017_A10resultadoTypeId = new long[1] ;
      BC00017_n10resultadoTypeId = new boolean[] {false} ;
      BC00017_A11resultadoIdNetUsuario = new long[1] ;
      BC00017_n11resultadoIdNetUsuario = new boolean[] {false} ;
      BC00017_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00017_n12resultadoFechaCreado = new boolean[] {false} ;
      BC00017_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00017_n13resultadoFechaEmision = new boolean[] {false} ;
      BC00017_A14resultadoPathExcel = new String[] {""} ;
      BC00017_n14resultadoPathExcel = new boolean[] {false} ;
      BC00017_A15resultadoPathPdf = new String[] {""} ;
      BC00017_n15resultadoPathPdf = new boolean[] {false} ;
      BC00017_A16resultadoPathCsv = new String[] {""} ;
      BC00017_n16resultadoPathCsv = new boolean[] {false} ;
      BC00017_A17resultadoIdEstado = new long[1] ;
      BC00017_n17resultadoIdEstado = new boolean[] {false} ;
      BC00017_A18resultadoIdLibro = new long[1] ;
      BC00017_n18resultadoIdLibro = new boolean[] {false} ;
      BC00017_A166resultadoIdNetTipoinforme = new long[1] ;
      BC00017_A19resultadoEliminado = new byte[1] ;
      BC00017_n19resultadoEliminado = new boolean[] {false} ;
      BC00017_A20resultadoAbonado = new long[1] ;
      BC00017_n20resultadoAbonado = new boolean[] {false} ;
      BC00018_A1resultadoId = new long[1] ;
      BC00018_A7resultadoFicha = new long[1] ;
      BC00018_n7resultadoFicha = new boolean[] {false} ;
      BC00018_A8resultadoComentarios = new String[] {""} ;
      BC00018_n8resultadoComentarios = new boolean[] {false} ;
      BC00018_A9resultadoUserId = new long[1] ;
      BC00018_n9resultadoUserId = new boolean[] {false} ;
      BC00018_A10resultadoTypeId = new long[1] ;
      BC00018_n10resultadoTypeId = new boolean[] {false} ;
      BC00018_A11resultadoIdNetUsuario = new long[1] ;
      BC00018_n11resultadoIdNetUsuario = new boolean[] {false} ;
      BC00018_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00018_n12resultadoFechaCreado = new boolean[] {false} ;
      BC00018_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC00018_n13resultadoFechaEmision = new boolean[] {false} ;
      BC00018_A14resultadoPathExcel = new String[] {""} ;
      BC00018_n14resultadoPathExcel = new boolean[] {false} ;
      BC00018_A15resultadoPathPdf = new String[] {""} ;
      BC00018_n15resultadoPathPdf = new boolean[] {false} ;
      BC00018_A16resultadoPathCsv = new String[] {""} ;
      BC00018_n16resultadoPathCsv = new boolean[] {false} ;
      BC00018_A17resultadoIdEstado = new long[1] ;
      BC00018_n17resultadoIdEstado = new boolean[] {false} ;
      BC00018_A18resultadoIdLibro = new long[1] ;
      BC00018_n18resultadoIdLibro = new boolean[] {false} ;
      BC00018_A166resultadoIdNetTipoinforme = new long[1] ;
      BC00018_A19resultadoEliminado = new byte[1] ;
      BC00018_n19resultadoEliminado = new boolean[] {false} ;
      BC00018_A20resultadoAbonado = new long[1] ;
      BC00018_n20resultadoAbonado = new boolean[] {false} ;
      BC000112_A1resultadoId = new long[1] ;
      BC000112_A7resultadoFicha = new long[1] ;
      BC000112_n7resultadoFicha = new boolean[] {false} ;
      BC000112_A8resultadoComentarios = new String[] {""} ;
      BC000112_n8resultadoComentarios = new boolean[] {false} ;
      BC000112_A9resultadoUserId = new long[1] ;
      BC000112_n9resultadoUserId = new boolean[] {false} ;
      BC000112_A10resultadoTypeId = new long[1] ;
      BC000112_n10resultadoTypeId = new boolean[] {false} ;
      BC000112_A11resultadoIdNetUsuario = new long[1] ;
      BC000112_n11resultadoIdNetUsuario = new boolean[] {false} ;
      BC000112_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      BC000112_n12resultadoFechaCreado = new boolean[] {false} ;
      BC000112_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      BC000112_n13resultadoFechaEmision = new boolean[] {false} ;
      BC000112_A14resultadoPathExcel = new String[] {""} ;
      BC000112_n14resultadoPathExcel = new boolean[] {false} ;
      BC000112_A15resultadoPathPdf = new String[] {""} ;
      BC000112_n15resultadoPathPdf = new boolean[] {false} ;
      BC000112_A16resultadoPathCsv = new String[] {""} ;
      BC000112_n16resultadoPathCsv = new boolean[] {false} ;
      BC000112_A17resultadoIdEstado = new long[1] ;
      BC000112_n17resultadoIdEstado = new boolean[] {false} ;
      BC000112_A18resultadoIdLibro = new long[1] ;
      BC000112_n18resultadoIdLibro = new boolean[] {false} ;
      BC000112_A166resultadoIdNetTipoinforme = new long[1] ;
      BC000112_A19resultadoEliminado = new byte[1] ;
      BC000112_n19resultadoEliminado = new boolean[] {false} ;
      BC000112_A20resultadoAbonado = new long[1] ;
      BC000112_n20resultadoAbonado = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultado_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.resultado_bc__default(),
         new Object[] {
             new Object[] {
            BC00012_A1resultadoId, BC00012_A7resultadoFicha, BC00012_n7resultadoFicha, BC00012_A8resultadoComentarios, BC00012_n8resultadoComentarios, BC00012_A9resultadoUserId, BC00012_n9resultadoUserId, BC00012_A10resultadoTypeId, BC00012_n10resultadoTypeId, BC00012_A11resultadoIdNetUsuario,
            BC00012_n11resultadoIdNetUsuario, BC00012_A12resultadoFechaCreado, BC00012_n12resultadoFechaCreado, BC00012_A13resultadoFechaEmision, BC00012_n13resultadoFechaEmision, BC00012_A14resultadoPathExcel, BC00012_n14resultadoPathExcel, BC00012_A15resultadoPathPdf, BC00012_n15resultadoPathPdf, BC00012_A16resultadoPathCsv,
            BC00012_n16resultadoPathCsv, BC00012_A17resultadoIdEstado, BC00012_n17resultadoIdEstado, BC00012_A18resultadoIdLibro, BC00012_n18resultadoIdLibro, BC00012_A166resultadoIdNetTipoinforme, BC00012_A19resultadoEliminado, BC00012_n19resultadoEliminado, BC00012_A20resultadoAbonado, BC00012_n20resultadoAbonado
            }
            , new Object[] {
            BC00013_A1resultadoId, BC00013_A7resultadoFicha, BC00013_n7resultadoFicha, BC00013_A8resultadoComentarios, BC00013_n8resultadoComentarios, BC00013_A9resultadoUserId, BC00013_n9resultadoUserId, BC00013_A10resultadoTypeId, BC00013_n10resultadoTypeId, BC00013_A11resultadoIdNetUsuario,
            BC00013_n11resultadoIdNetUsuario, BC00013_A12resultadoFechaCreado, BC00013_n12resultadoFechaCreado, BC00013_A13resultadoFechaEmision, BC00013_n13resultadoFechaEmision, BC00013_A14resultadoPathExcel, BC00013_n14resultadoPathExcel, BC00013_A15resultadoPathPdf, BC00013_n15resultadoPathPdf, BC00013_A16resultadoPathCsv,
            BC00013_n16resultadoPathCsv, BC00013_A17resultadoIdEstado, BC00013_n17resultadoIdEstado, BC00013_A18resultadoIdLibro, BC00013_n18resultadoIdLibro, BC00013_A166resultadoIdNetTipoinforme, BC00013_A19resultadoEliminado, BC00013_n19resultadoEliminado, BC00013_A20resultadoAbonado, BC00013_n20resultadoAbonado
            }
            , new Object[] {
            BC00014_A1resultadoId, BC00014_A7resultadoFicha, BC00014_n7resultadoFicha, BC00014_A8resultadoComentarios, BC00014_n8resultadoComentarios, BC00014_A9resultadoUserId, BC00014_n9resultadoUserId, BC00014_A10resultadoTypeId, BC00014_n10resultadoTypeId, BC00014_A11resultadoIdNetUsuario,
            BC00014_n11resultadoIdNetUsuario, BC00014_A12resultadoFechaCreado, BC00014_n12resultadoFechaCreado, BC00014_A13resultadoFechaEmision, BC00014_n13resultadoFechaEmision, BC00014_A14resultadoPathExcel, BC00014_n14resultadoPathExcel, BC00014_A15resultadoPathPdf, BC00014_n15resultadoPathPdf, BC00014_A16resultadoPathCsv,
            BC00014_n16resultadoPathCsv, BC00014_A17resultadoIdEstado, BC00014_n17resultadoIdEstado, BC00014_A18resultadoIdLibro, BC00014_n18resultadoIdLibro, BC00014_A166resultadoIdNetTipoinforme, BC00014_A19resultadoEliminado, BC00014_n19resultadoEliminado, BC00014_A20resultadoAbonado, BC00014_n20resultadoAbonado
            }
            , new Object[] {
            BC00015_A1resultadoId, BC00015_A7resultadoFicha, BC00015_n7resultadoFicha, BC00015_A8resultadoComentarios, BC00015_n8resultadoComentarios, BC00015_A9resultadoUserId, BC00015_n9resultadoUserId, BC00015_A10resultadoTypeId, BC00015_n10resultadoTypeId, BC00015_A11resultadoIdNetUsuario,
            BC00015_n11resultadoIdNetUsuario, BC00015_A12resultadoFechaCreado, BC00015_n12resultadoFechaCreado, BC00015_A13resultadoFechaEmision, BC00015_n13resultadoFechaEmision, BC00015_A14resultadoPathExcel, BC00015_n14resultadoPathExcel, BC00015_A15resultadoPathPdf, BC00015_n15resultadoPathPdf, BC00015_A16resultadoPathCsv,
            BC00015_n16resultadoPathCsv, BC00015_A17resultadoIdEstado, BC00015_n17resultadoIdEstado, BC00015_A18resultadoIdLibro, BC00015_n18resultadoIdLibro, BC00015_A166resultadoIdNetTipoinforme, BC00015_A19resultadoEliminado, BC00015_n19resultadoEliminado, BC00015_A20resultadoAbonado, BC00015_n20resultadoAbonado
            }
            , new Object[] {
            BC00016_A1resultadoId
            }
            , new Object[] {
            BC00017_A1resultadoId, BC00017_A7resultadoFicha, BC00017_n7resultadoFicha, BC00017_A8resultadoComentarios, BC00017_n8resultadoComentarios, BC00017_A9resultadoUserId, BC00017_n9resultadoUserId, BC00017_A10resultadoTypeId, BC00017_n10resultadoTypeId, BC00017_A11resultadoIdNetUsuario,
            BC00017_n11resultadoIdNetUsuario, BC00017_A12resultadoFechaCreado, BC00017_n12resultadoFechaCreado, BC00017_A13resultadoFechaEmision, BC00017_n13resultadoFechaEmision, BC00017_A14resultadoPathExcel, BC00017_n14resultadoPathExcel, BC00017_A15resultadoPathPdf, BC00017_n15resultadoPathPdf, BC00017_A16resultadoPathCsv,
            BC00017_n16resultadoPathCsv, BC00017_A17resultadoIdEstado, BC00017_n17resultadoIdEstado, BC00017_A18resultadoIdLibro, BC00017_n18resultadoIdLibro, BC00017_A166resultadoIdNetTipoinforme, BC00017_A19resultadoEliminado, BC00017_n19resultadoEliminado, BC00017_A20resultadoAbonado, BC00017_n20resultadoAbonado
            }
            , new Object[] {
            BC00018_A1resultadoId, BC00018_A7resultadoFicha, BC00018_n7resultadoFicha, BC00018_A8resultadoComentarios, BC00018_n8resultadoComentarios, BC00018_A9resultadoUserId, BC00018_n9resultadoUserId, BC00018_A10resultadoTypeId, BC00018_n10resultadoTypeId, BC00018_A11resultadoIdNetUsuario,
            BC00018_n11resultadoIdNetUsuario, BC00018_A12resultadoFechaCreado, BC00018_n12resultadoFechaCreado, BC00018_A13resultadoFechaEmision, BC00018_n13resultadoFechaEmision, BC00018_A14resultadoPathExcel, BC00018_n14resultadoPathExcel, BC00018_A15resultadoPathPdf, BC00018_n15resultadoPathPdf, BC00018_A16resultadoPathCsv,
            BC00018_n16resultadoPathCsv, BC00018_A17resultadoIdEstado, BC00018_n17resultadoIdEstado, BC00018_A18resultadoIdLibro, BC00018_n18resultadoIdLibro, BC00018_A166resultadoIdNetTipoinforme, BC00018_A19resultadoEliminado, BC00018_n19resultadoEliminado, BC00018_A20resultadoAbonado, BC00018_n20resultadoAbonado
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000112_A1resultadoId, BC000112_A7resultadoFicha, BC000112_n7resultadoFicha, BC000112_A8resultadoComentarios, BC000112_n8resultadoComentarios, BC000112_A9resultadoUserId, BC000112_n9resultadoUserId, BC000112_A10resultadoTypeId, BC000112_n10resultadoTypeId, BC000112_A11resultadoIdNetUsuario,
            BC000112_n11resultadoIdNetUsuario, BC000112_A12resultadoFechaCreado, BC000112_n12resultadoFechaCreado, BC000112_A13resultadoFechaEmision, BC000112_n13resultadoFechaEmision, BC000112_A14resultadoPathExcel, BC000112_n14resultadoPathExcel, BC000112_A15resultadoPathPdf, BC000112_n15resultadoPathPdf, BC000112_A16resultadoPathCsv,
            BC000112_n16resultadoPathCsv, BC000112_A17resultadoIdEstado, BC000112_n17resultadoIdEstado, BC000112_A18resultadoIdLibro, BC000112_n18resultadoIdLibro, BC000112_A166resultadoIdNetTipoinforme, BC000112_A19resultadoEliminado, BC000112_n19resultadoEliminado, BC000112_A20resultadoAbonado, BC000112_n20resultadoAbonado
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e12012 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A19resultadoEliminado ;
   private byte Z19resultadoEliminado ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1 ;
   private short nIsDirty_1 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom1 ;
   private int GXPagingTo1 ;
   private int GX_JID ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private long A9resultadoUserId ;
   private long A10resultadoTypeId ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A18resultadoIdLibro ;
   private long A166resultadoIdNetTipoinforme ;
   private long A20resultadoAbonado ;
   private long Z1resultadoId ;
   private long Z7resultadoFicha ;
   private long Z9resultadoUserId ;
   private long Z10resultadoTypeId ;
   private long Z11resultadoIdNetUsuario ;
   private long Z17resultadoIdEstado ;
   private long Z18resultadoIdLibro ;
   private long Z166resultadoIdNetTipoinforme ;
   private long Z20resultadoAbonado ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode1 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private java.util.Date Z12resultadoFechaCreado ;
   private java.util.Date Z13resultadoFechaEmision ;
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
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private String Z8resultadoComentarios ;
   private String Z14resultadoPathExcel ;
   private String Z15resultadoPathPdf ;
   private String Z16resultadoPathCsv ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtResultado> gx_restcollection ;
   private com.colaveco.SdtResultado bcResultado ;
   private com.colaveco.SdtResultado gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00014_A1resultadoId ;
   private long[] BC00014_A7resultadoFicha ;
   private boolean[] BC00014_n7resultadoFicha ;
   private String[] BC00014_A8resultadoComentarios ;
   private boolean[] BC00014_n8resultadoComentarios ;
   private long[] BC00014_A9resultadoUserId ;
   private boolean[] BC00014_n9resultadoUserId ;
   private long[] BC00014_A10resultadoTypeId ;
   private boolean[] BC00014_n10resultadoTypeId ;
   private long[] BC00014_A11resultadoIdNetUsuario ;
   private boolean[] BC00014_n11resultadoIdNetUsuario ;
   private java.util.Date[] BC00014_A12resultadoFechaCreado ;
   private boolean[] BC00014_n12resultadoFechaCreado ;
   private java.util.Date[] BC00014_A13resultadoFechaEmision ;
   private boolean[] BC00014_n13resultadoFechaEmision ;
   private String[] BC00014_A14resultadoPathExcel ;
   private boolean[] BC00014_n14resultadoPathExcel ;
   private String[] BC00014_A15resultadoPathPdf ;
   private boolean[] BC00014_n15resultadoPathPdf ;
   private String[] BC00014_A16resultadoPathCsv ;
   private boolean[] BC00014_n16resultadoPathCsv ;
   private long[] BC00014_A17resultadoIdEstado ;
   private boolean[] BC00014_n17resultadoIdEstado ;
   private long[] BC00014_A18resultadoIdLibro ;
   private boolean[] BC00014_n18resultadoIdLibro ;
   private long[] BC00014_A166resultadoIdNetTipoinforme ;
   private byte[] BC00014_A19resultadoEliminado ;
   private boolean[] BC00014_n19resultadoEliminado ;
   private long[] BC00014_A20resultadoAbonado ;
   private boolean[] BC00014_n20resultadoAbonado ;
   private long[] BC00015_A1resultadoId ;
   private long[] BC00015_A7resultadoFicha ;
   private boolean[] BC00015_n7resultadoFicha ;
   private String[] BC00015_A8resultadoComentarios ;
   private boolean[] BC00015_n8resultadoComentarios ;
   private long[] BC00015_A9resultadoUserId ;
   private boolean[] BC00015_n9resultadoUserId ;
   private long[] BC00015_A10resultadoTypeId ;
   private boolean[] BC00015_n10resultadoTypeId ;
   private long[] BC00015_A11resultadoIdNetUsuario ;
   private boolean[] BC00015_n11resultadoIdNetUsuario ;
   private java.util.Date[] BC00015_A12resultadoFechaCreado ;
   private boolean[] BC00015_n12resultadoFechaCreado ;
   private java.util.Date[] BC00015_A13resultadoFechaEmision ;
   private boolean[] BC00015_n13resultadoFechaEmision ;
   private String[] BC00015_A14resultadoPathExcel ;
   private boolean[] BC00015_n14resultadoPathExcel ;
   private String[] BC00015_A15resultadoPathPdf ;
   private boolean[] BC00015_n15resultadoPathPdf ;
   private String[] BC00015_A16resultadoPathCsv ;
   private boolean[] BC00015_n16resultadoPathCsv ;
   private long[] BC00015_A17resultadoIdEstado ;
   private boolean[] BC00015_n17resultadoIdEstado ;
   private long[] BC00015_A18resultadoIdLibro ;
   private boolean[] BC00015_n18resultadoIdLibro ;
   private long[] BC00015_A166resultadoIdNetTipoinforme ;
   private byte[] BC00015_A19resultadoEliminado ;
   private boolean[] BC00015_n19resultadoEliminado ;
   private long[] BC00015_A20resultadoAbonado ;
   private boolean[] BC00015_n20resultadoAbonado ;
   private long[] BC00016_A1resultadoId ;
   private long[] BC00017_A1resultadoId ;
   private long[] BC00017_A7resultadoFicha ;
   private boolean[] BC00017_n7resultadoFicha ;
   private String[] BC00017_A8resultadoComentarios ;
   private boolean[] BC00017_n8resultadoComentarios ;
   private long[] BC00017_A9resultadoUserId ;
   private boolean[] BC00017_n9resultadoUserId ;
   private long[] BC00017_A10resultadoTypeId ;
   private boolean[] BC00017_n10resultadoTypeId ;
   private long[] BC00017_A11resultadoIdNetUsuario ;
   private boolean[] BC00017_n11resultadoIdNetUsuario ;
   private java.util.Date[] BC00017_A12resultadoFechaCreado ;
   private boolean[] BC00017_n12resultadoFechaCreado ;
   private java.util.Date[] BC00017_A13resultadoFechaEmision ;
   private boolean[] BC00017_n13resultadoFechaEmision ;
   private String[] BC00017_A14resultadoPathExcel ;
   private boolean[] BC00017_n14resultadoPathExcel ;
   private String[] BC00017_A15resultadoPathPdf ;
   private boolean[] BC00017_n15resultadoPathPdf ;
   private String[] BC00017_A16resultadoPathCsv ;
   private boolean[] BC00017_n16resultadoPathCsv ;
   private long[] BC00017_A17resultadoIdEstado ;
   private boolean[] BC00017_n17resultadoIdEstado ;
   private long[] BC00017_A18resultadoIdLibro ;
   private boolean[] BC00017_n18resultadoIdLibro ;
   private long[] BC00017_A166resultadoIdNetTipoinforme ;
   private byte[] BC00017_A19resultadoEliminado ;
   private boolean[] BC00017_n19resultadoEliminado ;
   private long[] BC00017_A20resultadoAbonado ;
   private boolean[] BC00017_n20resultadoAbonado ;
   private long[] BC00018_A1resultadoId ;
   private long[] BC00018_A7resultadoFicha ;
   private boolean[] BC00018_n7resultadoFicha ;
   private String[] BC00018_A8resultadoComentarios ;
   private boolean[] BC00018_n8resultadoComentarios ;
   private long[] BC00018_A9resultadoUserId ;
   private boolean[] BC00018_n9resultadoUserId ;
   private long[] BC00018_A10resultadoTypeId ;
   private boolean[] BC00018_n10resultadoTypeId ;
   private long[] BC00018_A11resultadoIdNetUsuario ;
   private boolean[] BC00018_n11resultadoIdNetUsuario ;
   private java.util.Date[] BC00018_A12resultadoFechaCreado ;
   private boolean[] BC00018_n12resultadoFechaCreado ;
   private java.util.Date[] BC00018_A13resultadoFechaEmision ;
   private boolean[] BC00018_n13resultadoFechaEmision ;
   private String[] BC00018_A14resultadoPathExcel ;
   private boolean[] BC00018_n14resultadoPathExcel ;
   private String[] BC00018_A15resultadoPathPdf ;
   private boolean[] BC00018_n15resultadoPathPdf ;
   private String[] BC00018_A16resultadoPathCsv ;
   private boolean[] BC00018_n16resultadoPathCsv ;
   private long[] BC00018_A17resultadoIdEstado ;
   private boolean[] BC00018_n17resultadoIdEstado ;
   private long[] BC00018_A18resultadoIdLibro ;
   private boolean[] BC00018_n18resultadoIdLibro ;
   private long[] BC00018_A166resultadoIdNetTipoinforme ;
   private byte[] BC00018_A19resultadoEliminado ;
   private boolean[] BC00018_n19resultadoEliminado ;
   private long[] BC00018_A20resultadoAbonado ;
   private boolean[] BC00018_n20resultadoAbonado ;
   private long[] BC000112_A1resultadoId ;
   private long[] BC000112_A7resultadoFicha ;
   private boolean[] BC000112_n7resultadoFicha ;
   private String[] BC000112_A8resultadoComentarios ;
   private boolean[] BC000112_n8resultadoComentarios ;
   private long[] BC000112_A9resultadoUserId ;
   private boolean[] BC000112_n9resultadoUserId ;
   private long[] BC000112_A10resultadoTypeId ;
   private boolean[] BC000112_n10resultadoTypeId ;
   private long[] BC000112_A11resultadoIdNetUsuario ;
   private boolean[] BC000112_n11resultadoIdNetUsuario ;
   private java.util.Date[] BC000112_A12resultadoFechaCreado ;
   private boolean[] BC000112_n12resultadoFechaCreado ;
   private java.util.Date[] BC000112_A13resultadoFechaEmision ;
   private boolean[] BC000112_n13resultadoFechaEmision ;
   private String[] BC000112_A14resultadoPathExcel ;
   private boolean[] BC000112_n14resultadoPathExcel ;
   private String[] BC000112_A15resultadoPathPdf ;
   private boolean[] BC000112_n15resultadoPathPdf ;
   private String[] BC000112_A16resultadoPathCsv ;
   private boolean[] BC000112_n16resultadoPathCsv ;
   private long[] BC000112_A17resultadoIdEstado ;
   private boolean[] BC000112_n17resultadoIdEstado ;
   private long[] BC000112_A18resultadoIdLibro ;
   private boolean[] BC000112_n18resultadoIdLibro ;
   private long[] BC000112_A166resultadoIdNetTipoinforme ;
   private byte[] BC000112_A19resultadoEliminado ;
   private boolean[] BC000112_n19resultadoEliminado ;
   private long[] BC000112_A20resultadoAbonado ;
   private boolean[] BC000112_n20resultadoAbonado ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00012_A1resultadoId ;
   private long[] BC00012_A7resultadoFicha ;
   private String[] BC00012_A8resultadoComentarios ;
   private long[] BC00012_A9resultadoUserId ;
   private long[] BC00012_A10resultadoTypeId ;
   private long[] BC00012_A11resultadoIdNetUsuario ;
   private java.util.Date[] BC00012_A12resultadoFechaCreado ;
   private java.util.Date[] BC00012_A13resultadoFechaEmision ;
   private String[] BC00012_A14resultadoPathExcel ;
   private String[] BC00012_A15resultadoPathPdf ;
   private String[] BC00012_A16resultadoPathCsv ;
   private long[] BC00012_A17resultadoIdEstado ;
   private long[] BC00012_A18resultadoIdLibro ;
   private long[] BC00012_A166resultadoIdNetTipoinforme ;
   private byte[] BC00012_A19resultadoEliminado ;
   private long[] BC00012_A20resultadoAbonado ;
   private long[] BC00013_A1resultadoId ;
   private long[] BC00013_A7resultadoFicha ;
   private String[] BC00013_A8resultadoComentarios ;
   private long[] BC00013_A9resultadoUserId ;
   private long[] BC00013_A10resultadoTypeId ;
   private long[] BC00013_A11resultadoIdNetUsuario ;
   private java.util.Date[] BC00013_A12resultadoFechaCreado ;
   private java.util.Date[] BC00013_A13resultadoFechaEmision ;
   private String[] BC00013_A14resultadoPathExcel ;
   private String[] BC00013_A15resultadoPathPdf ;
   private String[] BC00013_A16resultadoPathCsv ;
   private long[] BC00013_A17resultadoIdEstado ;
   private long[] BC00013_A18resultadoIdLibro ;
   private long[] BC00013_A166resultadoIdNetTipoinforme ;
   private byte[] BC00013_A19resultadoEliminado ;
   private long[] BC00013_A20resultadoAbonado ;
   private boolean[] BC00012_n7resultadoFicha ;
   private boolean[] BC00012_n8resultadoComentarios ;
   private boolean[] BC00012_n9resultadoUserId ;
   private boolean[] BC00012_n10resultadoTypeId ;
   private boolean[] BC00012_n11resultadoIdNetUsuario ;
   private boolean[] BC00012_n12resultadoFechaCreado ;
   private boolean[] BC00012_n13resultadoFechaEmision ;
   private boolean[] BC00012_n14resultadoPathExcel ;
   private boolean[] BC00012_n15resultadoPathPdf ;
   private boolean[] BC00012_n16resultadoPathCsv ;
   private boolean[] BC00012_n17resultadoIdEstado ;
   private boolean[] BC00012_n18resultadoIdLibro ;
   private boolean[] BC00012_n19resultadoEliminado ;
   private boolean[] BC00012_n20resultadoAbonado ;
   private boolean[] BC00013_n7resultadoFicha ;
   private boolean[] BC00013_n8resultadoComentarios ;
   private boolean[] BC00013_n9resultadoUserId ;
   private boolean[] BC00013_n10resultadoTypeId ;
   private boolean[] BC00013_n11resultadoIdNetUsuario ;
   private boolean[] BC00013_n12resultadoFechaCreado ;
   private boolean[] BC00013_n13resultadoFechaEmision ;
   private boolean[] BC00013_n14resultadoPathExcel ;
   private boolean[] BC00013_n15resultadoPathPdf ;
   private boolean[] BC00013_n16resultadoPathCsv ;
   private boolean[] BC00013_n17resultadoIdEstado ;
   private boolean[] BC00013_n18resultadoIdLibro ;
   private boolean[] BC00013_n19resultadoEliminado ;
   private boolean[] BC00013_n20resultadoAbonado ;
}

final  class resultado_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class resultado_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00012", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00013", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00014", "SELECT TM1.`resultadoId`, TM1.`resultadoFicha`, TM1.`resultadoComentarios`, TM1.`resultadoUserId`, TM1.`resultadoTypeId`, TM1.`resultadoIdNetUsuario`, TM1.`resultadoFechaCreado`, TM1.`resultadoFechaEmision`, TM1.`resultadoPathExcel`, TM1.`resultadoPathPdf`, TM1.`resultadoPathCsv`, TM1.`resultadoIdEstado`, TM1.`resultadoIdLibro`, TM1.`resultadoIdNetTipoinforme`, TM1.`resultadoEliminado`, TM1.`resultadoAbonado` FROM `Resultado` TM1 ORDER BY TM1.`resultadoId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00015", "SELECT TM1.`resultadoId`, TM1.`resultadoFicha`, TM1.`resultadoComentarios`, TM1.`resultadoUserId`, TM1.`resultadoTypeId`, TM1.`resultadoIdNetUsuario`, TM1.`resultadoFechaCreado`, TM1.`resultadoFechaEmision`, TM1.`resultadoPathExcel`, TM1.`resultadoPathPdf`, TM1.`resultadoPathCsv`, TM1.`resultadoIdEstado`, TM1.`resultadoIdLibro`, TM1.`resultadoIdNetTipoinforme`, TM1.`resultadoEliminado`, TM1.`resultadoAbonado` FROM `Resultado` TM1 WHERE TM1.`resultadoId` = ? ORDER BY TM1.`resultadoId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00016", "SELECT `resultadoId` FROM `Resultado` WHERE `resultadoId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00017", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00018", "SELECT `resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado` FROM `Resultado` WHERE `resultadoId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00019", "INSERT INTO `Resultado`(`resultadoId`, `resultadoFicha`, `resultadoComentarios`, `resultadoUserId`, `resultadoTypeId`, `resultadoIdNetUsuario`, `resultadoFechaCreado`, `resultadoFechaEmision`, `resultadoPathExcel`, `resultadoPathPdf`, `resultadoPathCsv`, `resultadoIdEstado`, `resultadoIdLibro`, `resultadoIdNetTipoinforme`, `resultadoEliminado`, `resultadoAbonado`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000110", "UPDATE `Resultado` SET `resultadoFicha`=?, `resultadoComentarios`=?, `resultadoUserId`=?, `resultadoTypeId`=?, `resultadoIdNetUsuario`=?, `resultadoFechaCreado`=?, `resultadoFechaEmision`=?, `resultadoPathExcel`=?, `resultadoPathPdf`=?, `resultadoPathCsv`=?, `resultadoIdEstado`=?, `resultadoIdLibro`=?, `resultadoIdNetTipoinforme`=?, `resultadoEliminado`=?, `resultadoAbonado`=?  WHERE `resultadoId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000111", "DELETE FROM `Resultado`  WHERE `resultadoId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000112", "SELECT TM1.`resultadoId`, TM1.`resultadoFicha`, TM1.`resultadoComentarios`, TM1.`resultadoUserId`, TM1.`resultadoTypeId`, TM1.`resultadoIdNetUsuario`, TM1.`resultadoFechaCreado`, TM1.`resultadoFechaEmision`, TM1.`resultadoPathExcel`, TM1.`resultadoPathPdf`, TM1.`resultadoPathCsv`, TM1.`resultadoIdEstado`, TM1.`resultadoIdLibro`, TM1.`resultadoIdNetTipoinforme`, TM1.`resultadoEliminado`, TM1.`resultadoAbonado` FROM `Resultado` TM1 WHERE TM1.`resultadoId` = ? ORDER BY TM1.`resultadoId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
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
            case 6 :
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
            case 10 :
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
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

