/*
               File: resultado_bc
        Description: Resultado
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:50.65
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( resultado_bc )
public final  class resultado_bc: GXBusinessComponent
{
   public override func getInsDefault( )
   {
      readRow011( ) ;
      standaloneNotModal( ) ;
      initializeNonKey011( ) ;
      standaloneModal( ) ;
      addRow011( ) ;
      Gx_mode = "INS"
   }

   public func afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( !(GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            gx_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "")
         }
         trnEnded = 0
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z1resultadoId = A1resultadoId
            Gx_mode = "UPD"
         }
      }
      endTrnMsgTxt = ""
   }

   public func toString( ) -> String
   {
      return ""
   }

   public func reindex( ) -> Bool
   {
      return true
   }

   public func confirm_010( )
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
         IsConfirmed = 1
      }
   }

   public func zm011( _ GX_JID: Int )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z7resultadoFicha = A7resultadoFicha
         Z8resultadoComentarios = A8resultadoComentarios
         Z9resultadoUserId = A9resultadoUserId
         Z10resultadoTypeId = A10resultadoTypeId
         Z11resultadoIdNetUsuario = A11resultadoIdNetUsuario
         Z12resultadoFechaCreado = A12resultadoFechaCreado
         Z13resultadoFechaEmision = A13resultadoFechaEmision
         Z14resultadoPathExcel = A14resultadoPathExcel
         Z15resultadoPathPdf = A15resultadoPathPdf
         Z16resultadoPathCsv = A16resultadoPathCsv
         Z17resultadoIdEstado = A17resultadoIdEstado
         Z18resultadoIdLibro = A18resultadoIdLibro
         Z166resultadoIdNetTipoinforme = A166resultadoIdNetTipoinforme
         Z19resultadoEliminado = A19resultadoEliminado
         Z20resultadoAbonado = A20resultadoAbonado
      }
      if ( GX_JID == -1 )
      {
         Z1resultadoId = A1resultadoId
         Z7resultadoFicha = A7resultadoFicha
         Z8resultadoComentarios = A8resultadoComentarios
         Z9resultadoUserId = A9resultadoUserId
         Z10resultadoTypeId = A10resultadoTypeId
         Z11resultadoIdNetUsuario = A11resultadoIdNetUsuario
         Z12resultadoFechaCreado = A12resultadoFechaCreado
         Z13resultadoFechaEmision = A13resultadoFechaEmision
         Z14resultadoPathExcel = A14resultadoPathExcel
         Z15resultadoPathPdf = A15resultadoPathPdf
         Z16resultadoPathCsv = A16resultadoPathCsv
         Z17resultadoIdEstado = A17resultadoIdEstado
         Z18resultadoIdLibro = A18resultadoIdLibro
         Z166resultadoIdNetTipoinforme = A166resultadoIdNetTipoinforme
         Z19resultadoEliminado = A19resultadoEliminado
         Z20resultadoAbonado = A20resultadoAbonado
      }
   }

   public func standaloneNotModal( )
   {
   }

   public func standaloneModal( )
   {
   }

   public func load011( )
   {
      /* Using cursor BC00012 */
      var params0 = Array<Any>()
      params0.append(A1resultadoId)
      var nullParams0 = Array<Bool>()
      nullParams0.append(false)
      pr_default.execute(0, params: params0, nullParams: nullParams0)
      if ( pr_default.getStatus(0) != 101 )
      {
         RcdFound1 = 1
         self.A7resultadoFicha = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoFicha")
         n7resultadoFicha = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFicha")
         self.A8resultadoComentarios = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoComentarios")
         n8resultadoComentarios = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoComentarios")
         self.A9resultadoUserId = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoUserId")
         n9resultadoUserId = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoUserId")
         self.A10resultadoTypeId = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoTypeId")
         n10resultadoTypeId = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoTypeId")
         self.A11resultadoIdNetUsuario = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdNetUsuario")
         n11resultadoIdNetUsuario = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoIdNetUsuario")
         self.A12resultadoFechaCreado = pr_default.getDBCommand(0).dateValue(forColumn: "resultadoFechaCreado")
         n12resultadoFechaCreado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFechaCreado")
         self.A13resultadoFechaEmision = pr_default.getDBCommand(0).dateValue(forColumn: "resultadoFechaEmision")
         n13resultadoFechaEmision = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFechaEmision")
         self.A14resultadoPathExcel = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathExcel")
         n14resultadoPathExcel = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathExcel")
         self.A15resultadoPathPdf = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathPdf")
         n15resultadoPathPdf = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathPdf")
         self.A16resultadoPathCsv = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathCsv")
         n16resultadoPathCsv = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathCsv")
         self.A17resultadoIdEstado = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdEstado")
         n17resultadoIdEstado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoIdEstado")
         self.A18resultadoIdLibro = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdLibro")
         n18resultadoIdLibro = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoIdLibro")
         self.A166resultadoIdNetTipoinforme = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdNetTipoinforme")
         self.A19resultadoEliminado = pr_default.getDBCommand(0).intValue(forColumn: "resultadoEliminado")
         n19resultadoEliminado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoEliminado")
         self.A20resultadoAbonado = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoAbonado")
         n20resultadoAbonado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoAbonado")
         zm011( -1) ;
      }
      pr_default.close(0);
      onLoadActions011( ) ;
   }

   public func onLoadActions011( )
   {
   }

   public func checkExtendedTable011( )
   {
      nIsDirty_1 = 0
      standaloneModal( ) ;
   }

   public func closeExtendedTableCursors011( )
   {
   }

   public func enableDisable( )
   {
   }

   public func getKey011( )
   {
      /* Using cursor BC00013 */
      var params1 = Array<Any>()
      params1.append(A1resultadoId)
      var nullParams1 = Array<Bool>()
      nullParams1.append(false)
      pr_default.execute(1, params: params1, nullParams: nullParams1)
      if ( pr_default.getStatus(1) != 101 )
      {
         RcdFound1 = 1
      }
      else
      {
         RcdFound1 = 0
      }
      pr_default.close(1);
   }

   public func getByPrimaryKey( )
   {
      /* Using cursor BC00014 */
      var params2 = Array<Any>()
      params2.append(A1resultadoId)
      var nullParams2 = Array<Bool>()
      nullParams2.append(false)
      pr_default.execute(2, params: params2, nullParams: nullParams2)
      if ( pr_default.getStatus(2) == 103 )
      {
         gx_msglist.addItem(GXMessages.getMessage("GXM_lock", arguments:[""]), "RecordIsLocked", 1, "")
         AnyError = 1
         return
      }
      if ( pr_default.getStatus(2) != 101 )
      {
         zm011( 1) ;
         RcdFound1 = 1
         self.A1resultadoId = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoId")
         self.A7resultadoFicha = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoFicha")
         n7resultadoFicha = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoFicha")
         self.A8resultadoComentarios = pr_default.getDBCommand(2).stringValue(forColumn: "resultadoComentarios")
         n8resultadoComentarios = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoComentarios")
         self.A9resultadoUserId = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoUserId")
         n9resultadoUserId = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoUserId")
         self.A10resultadoTypeId = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoTypeId")
         n10resultadoTypeId = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoTypeId")
         self.A11resultadoIdNetUsuario = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoIdNetUsuario")
         n11resultadoIdNetUsuario = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoIdNetUsuario")
         self.A12resultadoFechaCreado = pr_default.getDBCommand(2).dateValue(forColumn: "resultadoFechaCreado")
         n12resultadoFechaCreado = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoFechaCreado")
         self.A13resultadoFechaEmision = pr_default.getDBCommand(2).dateValue(forColumn: "resultadoFechaEmision")
         n13resultadoFechaEmision = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoFechaEmision")
         self.A14resultadoPathExcel = pr_default.getDBCommand(2).stringValue(forColumn: "resultadoPathExcel")
         n14resultadoPathExcel = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoPathExcel")
         self.A15resultadoPathPdf = pr_default.getDBCommand(2).stringValue(forColumn: "resultadoPathPdf")
         n15resultadoPathPdf = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoPathPdf")
         self.A16resultadoPathCsv = pr_default.getDBCommand(2).stringValue(forColumn: "resultadoPathCsv")
         n16resultadoPathCsv = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoPathCsv")
         self.A17resultadoIdEstado = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoIdEstado")
         n17resultadoIdEstado = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoIdEstado")
         self.A18resultadoIdLibro = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoIdLibro")
         n18resultadoIdLibro = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoIdLibro")
         self.A166resultadoIdNetTipoinforme = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoIdNetTipoinforme")
         self.A19resultadoEliminado = pr_default.getDBCommand(2).intValue(forColumn: "resultadoEliminado")
         n19resultadoEliminado = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoEliminado")
         self.A20resultadoAbonado = pr_default.getDBCommand(2).int64Value(forColumn: "resultadoAbonado")
         n20resultadoAbonado = pr_default.getDBCommand(2).valueIsNull(forColumn: "resultadoAbonado")
         Z1resultadoId = A1resultadoId
         sMode1 = Gx_mode
         Gx_mode = "DSP"
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = 0
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1
      }
      else
      {
         RcdFound1 = 0
         initializeNonKey011( ) ;
         sMode1 = Gx_mode
         Gx_mode = "DSP"
         standaloneModal( ) ;
         Gx_mode = sMode1
      }
      pr_default.close(2);
   }

   public func getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS"
      }
      else
      {
         Gx_mode = "UPD"
      }
      getByPrimaryKey( ) ;
   }

   public func insert_check( )
   {
      confirm_010( ) ;
      IsConfirmed = 0
   }

   public func update_check( )
   {
      insert_check( ) ;
   }

   public func delete_check( )
   {
      insert_check( ) ;
   }

   public func checkOptimisticConcurrency011( )
   {
      if ( !isIns( ) )
      {
         /* Using cursor BC00015 */
         var params3 = Array<Any>()
         params3.append(A1resultadoId)
         var nullParams3 = Array<Bool>()
         nullParams3.append(false)
         pr_default.execute(3, params: params3, nullParams: nullParams3)
         if ( pr_default.getStatus(3) == 103 )
         {
            gx_msglist.addItem(GXMessages.getMessage("GXM_lock", arguments:["Resultado"]), "RecordIsLocked", 1, "")
            AnyError = 1
            return
         }
         Gx_longc = false
         if ( pr_default.getStatus(3) == 101 || ( Z7resultadoFicha != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoFicha") ) || ( GXutil.strcmp(Z8resultadoComentarios, pr_default.getDBCommand(3).stringValue(forColumn: "resultadoComentarios")) != 0 ) || ( Z9resultadoUserId != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoUserId") ) || ( Z10resultadoTypeId != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoTypeId") ) || ( Z11resultadoIdNetUsuario != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoIdNetUsuario") ) )
         {
            Gx_longc = true
         }
         if ( Gx_longc || ( Z12resultadoFechaCreado != pr_default.getDBCommand(3).dateValue(forColumn: "resultadoFechaCreado") ) || ( Z13resultadoFechaEmision != pr_default.getDBCommand(3).dateValue(forColumn: "resultadoFechaEmision") ) || ( GXutil.strcmp(Z14resultadoPathExcel, pr_default.getDBCommand(3).stringValue(forColumn: "resultadoPathExcel")) != 0 ) || ( GXutil.strcmp(Z15resultadoPathPdf, pr_default.getDBCommand(3).stringValue(forColumn: "resultadoPathPdf")) != 0 ) || ( GXutil.strcmp(Z16resultadoPathCsv, pr_default.getDBCommand(3).stringValue(forColumn: "resultadoPathCsv")) != 0 ) )
         {
            Gx_longc = true
         }
         if ( Gx_longc || ( Z17resultadoIdEstado != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoIdEstado") ) || ( Z18resultadoIdLibro != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoIdLibro") ) || ( Z166resultadoIdNetTipoinforme != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoIdNetTipoinforme") ) || ( Z19resultadoEliminado != pr_default.getDBCommand(3).intValue(forColumn: "resultadoEliminado") ) || ( Z20resultadoAbonado != pr_default.getDBCommand(3).int64Value(forColumn: "resultadoAbonado") ) )
         {
            gx_msglist.addItem(GXMessages.getMessage("GXM_waschg", arguments:["Resultado"]), "RecordWasChanged", 1, "")
            AnyError = 1
            return
         }
      }
   }

   public func insert011( )
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
                  /* Using cursor BC00016 */
                  var params4 = Array<Any>()
                  params4.append(A1resultadoId)
                  params4.append(A7resultadoFicha)
                  params4.append(A8resultadoComentarios.gxSubstring(1, length:45))
                  params4.append(A9resultadoUserId)
                  params4.append(A10resultadoTypeId)
                  params4.append(A11resultadoIdNetUsuario)
                  params4.append(A12resultadoFechaCreado)
                  params4.append(A13resultadoFechaEmision)
                  params4.append(A14resultadoPathExcel.gxSubstring(1, length:500))
                  params4.append(A15resultadoPathPdf.gxSubstring(1, length:500))
                  params4.append(A16resultadoPathCsv.gxSubstring(1, length:500))
                  params4.append(A17resultadoIdEstado)
                  params4.append(A18resultadoIdLibro)
                  params4.append(A166resultadoIdNetTipoinforme)
                  params4.append(A19resultadoEliminado)
                  params4.append(A20resultadoAbonado)
                  var nullParams4 = Array<Bool>()
                  nullParams4.append(false)
                  nullParams4.append(n7resultadoFicha)
                  nullParams4.append(n8resultadoComentarios)
                  nullParams4.append(n9resultadoUserId)
                  nullParams4.append(n10resultadoTypeId)
                  nullParams4.append(n11resultadoIdNetUsuario)
                  nullParams4.append(n12resultadoFechaCreado)
                  nullParams4.append(n13resultadoFechaEmision)
                  nullParams4.append(n14resultadoPathExcel)
                  nullParams4.append(n15resultadoPathPdf)
                  nullParams4.append(n16resultadoPathCsv)
                  nullParams4.append(n17resultadoIdEstado)
                  nullParams4.append(n18resultadoIdLibro)
                  nullParams4.append(false)
                  nullParams4.append(n19resultadoEliminado)
                  nullParams4.append(n20resultadoAbonado)
                  pr_default.execute(4, params: params4, nullParams: nullParams4)
                  if ( pr_default.getStatus(4) == 1 )
                  {
                     gx_msglist.addItem(GXMessages.getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "")
                     AnyError = 1
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     self.saveTimestamp = Date()
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = GXMessages.getMessage("GXM_sucadded")
                        endTrnMsgCod = "SuccessfullyAdded"
                     }
                  }
               }
               else
               {
                  gx_msglist.addItem(GXMessages.getMessage("GXM_unexp"), 1, "")
                  AnyError = 1
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

   public func update011( )
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
                  /* Using cursor BC00017 */
                  var params5 = Array<Any>()
                  params5.append(A7resultadoFicha)
                  params5.append(A8resultadoComentarios.gxSubstring(1, length:45))
                  params5.append(A9resultadoUserId)
                  params5.append(A10resultadoTypeId)
                  params5.append(A11resultadoIdNetUsuario)
                  params5.append(A12resultadoFechaCreado)
                  params5.append(A13resultadoFechaEmision)
                  params5.append(A14resultadoPathExcel.gxSubstring(1, length:500))
                  params5.append(A15resultadoPathPdf.gxSubstring(1, length:500))
                  params5.append(A16resultadoPathCsv.gxSubstring(1, length:500))
                  params5.append(A17resultadoIdEstado)
                  params5.append(A18resultadoIdLibro)
                  params5.append(A166resultadoIdNetTipoinforme)
                  params5.append(A19resultadoEliminado)
                  params5.append(A20resultadoAbonado)
                  params5.append(A1resultadoId)
                  var nullParams5 = Array<Bool>()
                  nullParams5.append(n7resultadoFicha)
                  nullParams5.append(n8resultadoComentarios)
                  nullParams5.append(n9resultadoUserId)
                  nullParams5.append(n10resultadoTypeId)
                  nullParams5.append(n11resultadoIdNetUsuario)
                  nullParams5.append(n12resultadoFechaCreado)
                  nullParams5.append(n13resultadoFechaEmision)
                  nullParams5.append(n14resultadoPathExcel)
                  nullParams5.append(n15resultadoPathPdf)
                  nullParams5.append(n16resultadoPathCsv)
                  nullParams5.append(n17resultadoIdEstado)
                  nullParams5.append(n18resultadoIdLibro)
                  nullParams5.append(false)
                  nullParams5.append(n19resultadoEliminado)
                  nullParams5.append(n20resultadoAbonado)
                  nullParams5.append(false)
                  pr_default.execute(5, params: params5, nullParams: nullParams5)
                  if ( pr_default.getStatus(5) == 103 )
                  {
                     gx_msglist.addItem(GXMessages.getMessage("GXM_lock", arguments:["Resultado"]), "RecordIsLocked", 1, "")
                     AnyError = 1
                  }
                  deferredUpdate011( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     self.saveTimestamp = Date()
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = GXMessages.getMessage("GXM_sucupdated")
                        endTrnMsgCod = "SuccessfullyUpdated"
                     }
                  }
                  else
                  {
                     gx_msglist.addItem(GXMessages.getMessage("GXM_unexp"), 1, "")
                     AnyError = 1
                  }
               }
            }
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public func deferredUpdate011( )
   {
   }

   public override func delete( )
   {
      Gx_mode = "DLT"
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
               /* Using cursor BC00018 */
               var params6 = Array<Any>()
               params6.append(A1resultadoId)
               var nullParams6 = Array<Bool>()
               nullParams6.append(false)
               pr_default.execute(6, params: params6, nullParams: nullParams6)
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  self.saveTimestamp = Date()
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = GXMessages.getMessage("GXM_sucdeleted")
                     endTrnMsgCod = "SuccessfullyDeleted"
                  }
               }
               else
               {
                  gx_msglist.addItem(GXMessages.getMessage("GXM_unexp"), 1, "")
                  AnyError = 1
               }
            }
         }
      }
      sMode1 = Gx_mode
      Gx_mode = "DLT"
      endLevel011( ) ;
      Gx_mode = sMode1
   }

   public func onDeleteControls011( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public func endLevel011( )
   {
      if ( !isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1
      }
      else
      {
      }
      IsModified = 0
   }

   public func scanKeyStart011( )
   {
      /* Using cursor BC00019 */
      var params7 = Array<Any>()
      params7.append(A1resultadoId)
      var nullParams7 = Array<Bool>()
      nullParams7.append(false)
      pr_default.execute(7, params: params7, nullParams: nullParams7)
      RcdFound1 = 0
      if ( pr_default.getStatus(7) != 101 )
      {
         RcdFound1 = 1
         self.A1resultadoId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoId")
         self.A7resultadoFicha = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoFicha")
         n7resultadoFicha = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFicha")
         self.A8resultadoComentarios = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoComentarios")
         n8resultadoComentarios = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoComentarios")
         self.A9resultadoUserId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoUserId")
         n9resultadoUserId = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoUserId")
         self.A10resultadoTypeId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoTypeId")
         n10resultadoTypeId = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoTypeId")
         self.A11resultadoIdNetUsuario = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdNetUsuario")
         n11resultadoIdNetUsuario = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdNetUsuario")
         self.A12resultadoFechaCreado = pr_default.getDBCommand(7).dateValue(forColumn: "resultadoFechaCreado")
         n12resultadoFechaCreado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFechaCreado")
         self.A13resultadoFechaEmision = pr_default.getDBCommand(7).dateValue(forColumn: "resultadoFechaEmision")
         n13resultadoFechaEmision = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFechaEmision")
         self.A14resultadoPathExcel = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathExcel")
         n14resultadoPathExcel = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathExcel")
         self.A15resultadoPathPdf = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathPdf")
         n15resultadoPathPdf = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathPdf")
         self.A16resultadoPathCsv = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathCsv")
         n16resultadoPathCsv = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathCsv")
         self.A17resultadoIdEstado = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdEstado")
         n17resultadoIdEstado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdEstado")
         self.A18resultadoIdLibro = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdLibro")
         n18resultadoIdLibro = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdLibro")
         self.A166resultadoIdNetTipoinforme = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdNetTipoinforme")
         self.A19resultadoEliminado = pr_default.getDBCommand(7).intValue(forColumn: "resultadoEliminado")
         n19resultadoEliminado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoEliminado")
         self.A20resultadoAbonado = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoAbonado")
         n20resultadoAbonado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoAbonado")
      }
      /* Load Subordinate Levels */
   }

   public func scanKeyNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound1 = 0
      scanKeyLoad011( ) ;
   }

   public func scanKeyLoad011( )
   {
      sMode1 = Gx_mode
      Gx_mode = "DSP"
      if ( pr_default.getStatus(7) != 101 )
      {
         RcdFound1 = 1
         self.A1resultadoId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoId")
         self.A7resultadoFicha = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoFicha")
         n7resultadoFicha = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFicha")
         self.A8resultadoComentarios = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoComentarios")
         n8resultadoComentarios = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoComentarios")
         self.A9resultadoUserId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoUserId")
         n9resultadoUserId = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoUserId")
         self.A10resultadoTypeId = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoTypeId")
         n10resultadoTypeId = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoTypeId")
         self.A11resultadoIdNetUsuario = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdNetUsuario")
         n11resultadoIdNetUsuario = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdNetUsuario")
         self.A12resultadoFechaCreado = pr_default.getDBCommand(7).dateValue(forColumn: "resultadoFechaCreado")
         n12resultadoFechaCreado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFechaCreado")
         self.A13resultadoFechaEmision = pr_default.getDBCommand(7).dateValue(forColumn: "resultadoFechaEmision")
         n13resultadoFechaEmision = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoFechaEmision")
         self.A14resultadoPathExcel = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathExcel")
         n14resultadoPathExcel = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathExcel")
         self.A15resultadoPathPdf = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathPdf")
         n15resultadoPathPdf = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathPdf")
         self.A16resultadoPathCsv = pr_default.getDBCommand(7).stringValue(forColumn: "resultadoPathCsv")
         n16resultadoPathCsv = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoPathCsv")
         self.A17resultadoIdEstado = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdEstado")
         n17resultadoIdEstado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdEstado")
         self.A18resultadoIdLibro = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdLibro")
         n18resultadoIdLibro = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoIdLibro")
         self.A166resultadoIdNetTipoinforme = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoIdNetTipoinforme")
         self.A19resultadoEliminado = pr_default.getDBCommand(7).intValue(forColumn: "resultadoEliminado")
         n19resultadoEliminado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoEliminado")
         self.A20resultadoAbonado = pr_default.getDBCommand(7).int64Value(forColumn: "resultadoAbonado")
         n20resultadoAbonado = pr_default.getDBCommand(7).valueIsNull(forColumn: "resultadoAbonado")
      }
      Gx_mode = sMode1
   }

   public func scanKeyEnd011( )
   {
      pr_default.close(7);
   }

   public func afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public func beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public func beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public func beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public func beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public func beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public func disableAttributes011( )
   {
   }

   public func addRow011( )
   {
      varsToRow1( bcResultado)
   }

   public func readRow011( )
   {
      rowToVars1( bcResultado, 1)
   }

   public func initializeNonKey011( )
   {
      A7resultadoFicha = Int64(0 )
      n7resultadoFicha = false
      A8resultadoComentarios = ""
      n8resultadoComentarios = false
      A9resultadoUserId = Int64(0 )
      n9resultadoUserId = false
      A10resultadoTypeId = Int64(0 )
      n10resultadoTypeId = false
      A11resultadoIdNetUsuario = Int64(0 )
      n11resultadoIdNetUsuario = false
      A12resultadoFechaCreado = Date.gxEmpty()
      n12resultadoFechaCreado = false
      A13resultadoFechaEmision = Date.gxEmpty()
      n13resultadoFechaEmision = false
      A14resultadoPathExcel = ""
      n14resultadoPathExcel = false
      A15resultadoPathPdf = ""
      n15resultadoPathPdf = false
      A16resultadoPathCsv = ""
      n16resultadoPathCsv = false
      A17resultadoIdEstado = Int64(0 )
      n17resultadoIdEstado = false
      A18resultadoIdLibro = Int64(0 )
      n18resultadoIdLibro = false
      A166resultadoIdNetTipoinforme = Int64(0 )
      A19resultadoEliminado = 0
      n19resultadoEliminado = false
      A20resultadoAbonado = Int64(0 )
      n20resultadoAbonado = false
      Z7resultadoFicha = Int64(0 )
      Z8resultadoComentarios = ""
      Z9resultadoUserId = Int64(0 )
      Z10resultadoTypeId = Int64(0 )
      Z11resultadoIdNetUsuario = Int64(0 )
      Z12resultadoFechaCreado = Date.gxEmpty()
      Z13resultadoFechaEmision = Date.gxEmpty()
      Z14resultadoPathExcel = ""
      Z15resultadoPathPdf = ""
      Z16resultadoPathCsv = ""
      Z17resultadoIdEstado = Int64(0 )
      Z18resultadoIdLibro = Int64(0 )
      Z166resultadoIdNetTipoinforme = Int64(0 )
      Z19resultadoEliminado = 0
      Z20resultadoAbonado = Int64(0 )
   }

   public func initAll011( )
   {
      A1resultadoId = Int64(0 )
      initializeNonKey011( ) ;
   }

   public func standaloneModalInsert( )
   {
   }

   public func isIns( ) -> Bool
   {
      return (( GXutil.strcmp(Gx_mode, "INS") == 0 )  ? true : false)
   }

   public func isDlt( ) -> Bool
   {
      return (( GXutil.strcmp(Gx_mode, "DLT") == 0 )  ? true : false)
   }

   public func isUpd( ) -> Bool
   {
      return (( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ? true : false)
   }

   public func isDsp( ) -> Bool
   {
      return (( GXutil.strcmp(Gx_mode, "DSP") == 0 )  ? true : false)
   }

   public func varsToRow1( _ obj1: SdtResultado )
   {
      obj1.gxTv_SdtResultado_Mode = Gx_mode
      obj1.gxTv_SdtResultado_Resultadoficha = A7resultadoFicha
      obj1.gxTv_SdtResultado_Resultadocomentarios = A8resultadoComentarios
      obj1.gxTv_SdtResultado_Resultadouserid = A9resultadoUserId
      obj1.gxTv_SdtResultado_Resultadotypeid = A10resultadoTypeId
      obj1.gxTv_SdtResultado_Resultadoidnetusuario = A11resultadoIdNetUsuario
      obj1.gxTv_SdtResultado_Resultadofechacreado = A12resultadoFechaCreado
      obj1.gxTv_SdtResultado_Resultadofechaemision = A13resultadoFechaEmision
      obj1.gxTv_SdtResultado_Resultadopathexcel = A14resultadoPathExcel
      obj1.gxTv_SdtResultado_Resultadopathpdf = A15resultadoPathPdf
      obj1.gxTv_SdtResultado_Resultadopathcsv = A16resultadoPathCsv
      obj1.gxTv_SdtResultado_Resultadoidestado = A17resultadoIdEstado
      obj1.gxTv_SdtResultado_Resultadoidlibro = A18resultadoIdLibro
      obj1.gxTv_SdtResultado_Resultadoidnettipoinforme = A166resultadoIdNetTipoinforme
      obj1.gxTv_SdtResultado_Resultadoeliminado = A19resultadoEliminado
      obj1.gxTv_SdtResultado_Resultadoabonado = A20resultadoAbonado
      obj1.gxTv_SdtResultado_Resultadoid = A1resultadoId
      obj1.gxTv_SdtResultado_Resultadoid_Z = Z1resultadoId
      obj1.gxTv_SdtResultado_Resultadoficha_Z = Z7resultadoFicha
      obj1.gxTv_SdtResultado_Resultadocomentarios_Z = Z8resultadoComentarios
      obj1.gxTv_SdtResultado_Resultadouserid_Z = Z9resultadoUserId
      obj1.gxTv_SdtResultado_Resultadotypeid_Z = Z10resultadoTypeId
      obj1.gxTv_SdtResultado_Resultadoidnetusuario_Z = Z11resultadoIdNetUsuario
      obj1.gxTv_SdtResultado_Resultadofechacreado_Z = Z12resultadoFechaCreado
      obj1.gxTv_SdtResultado_Resultadofechaemision_Z = Z13resultadoFechaEmision
      obj1.gxTv_SdtResultado_Resultadopathexcel_Z = Z14resultadoPathExcel
      obj1.gxTv_SdtResultado_Resultadopathpdf_Z = Z15resultadoPathPdf
      obj1.gxTv_SdtResultado_Resultadopathcsv_Z = Z16resultadoPathCsv
      obj1.gxTv_SdtResultado_Resultadoidestado_Z = Z17resultadoIdEstado
      obj1.gxTv_SdtResultado_Resultadoidlibro_Z = Z18resultadoIdLibro
      obj1.gxTv_SdtResultado_Resultadoidnettipoinforme_Z = Z166resultadoIdNetTipoinforme
      obj1.gxTv_SdtResultado_Resultadoeliminado_Z = Z19resultadoEliminado
      obj1.gxTv_SdtResultado_Resultadoabonado_Z = Z20resultadoAbonado
      obj1.gxTv_SdtResultado_Resultadoficha_N = Int(n7resultadoFicha)
      obj1.gxTv_SdtResultado_Resultadocomentarios_N = Int(n8resultadoComentarios)
      obj1.gxTv_SdtResultado_Resultadouserid_N = Int(n9resultadoUserId)
      obj1.gxTv_SdtResultado_Resultadotypeid_N = Int(n10resultadoTypeId)
      obj1.gxTv_SdtResultado_Resultadoidnetusuario_N = Int(n11resultadoIdNetUsuario)
      obj1.gxTv_SdtResultado_Resultadofechacreado_N = Int(n12resultadoFechaCreado)
      obj1.gxTv_SdtResultado_Resultadofechaemision_N = Int(n13resultadoFechaEmision)
      obj1.gxTv_SdtResultado_Resultadopathexcel_N = Int(n14resultadoPathExcel)
      obj1.gxTv_SdtResultado_Resultadopathpdf_N = Int(n15resultadoPathPdf)
      obj1.gxTv_SdtResultado_Resultadopathcsv_N = Int(n16resultadoPathCsv)
      obj1.gxTv_SdtResultado_Resultadoidestado_N = Int(n17resultadoIdEstado)
      obj1.gxTv_SdtResultado_Resultadoidlibro_N = Int(n18resultadoIdLibro)
      obj1.gxTv_SdtResultado_Resultadoeliminado_N = Int(n19resultadoEliminado)
      obj1.gxTv_SdtResultado_Resultadoabonado_N = Int(n20resultadoAbonado)
      obj1.gxTv_SdtResultado_Mode = Gx_mode
   }

   public func keyVarsToRow1( _ obj1: SdtResultado )
   {
      obj1.gxTv_SdtResultado_Resultadoid = A1resultadoId
   }

   public func rowToVars1( _ obj1: SdtResultado ,
                           _ forceLoad: Int )
   {
      Gx_mode = obj1.gxTv_SdtResultado_Mode
      A7resultadoFicha = obj1.gxTv_SdtResultado_Resultadoficha
      n7resultadoFicha = false
      A8resultadoComentarios = obj1.gxTv_SdtResultado_Resultadocomentarios
      n8resultadoComentarios = false
      A9resultadoUserId = obj1.gxTv_SdtResultado_Resultadouserid
      n9resultadoUserId = false
      A10resultadoTypeId = obj1.gxTv_SdtResultado_Resultadotypeid
      n10resultadoTypeId = false
      A11resultadoIdNetUsuario = obj1.gxTv_SdtResultado_Resultadoidnetusuario
      n11resultadoIdNetUsuario = false
      A12resultadoFechaCreado = obj1.gxTv_SdtResultado_Resultadofechacreado
      n12resultadoFechaCreado = false
      A13resultadoFechaEmision = obj1.gxTv_SdtResultado_Resultadofechaemision
      n13resultadoFechaEmision = false
      A14resultadoPathExcel = obj1.gxTv_SdtResultado_Resultadopathexcel
      n14resultadoPathExcel = false
      A15resultadoPathPdf = obj1.gxTv_SdtResultado_Resultadopathpdf
      n15resultadoPathPdf = false
      A16resultadoPathCsv = obj1.gxTv_SdtResultado_Resultadopathcsv
      n16resultadoPathCsv = false
      A17resultadoIdEstado = obj1.gxTv_SdtResultado_Resultadoidestado
      n17resultadoIdEstado = false
      A18resultadoIdLibro = obj1.gxTv_SdtResultado_Resultadoidlibro
      n18resultadoIdLibro = false
      A166resultadoIdNetTipoinforme = obj1.gxTv_SdtResultado_Resultadoidnettipoinforme
      A19resultadoEliminado = obj1.gxTv_SdtResultado_Resultadoeliminado
      n19resultadoEliminado = false
      A20resultadoAbonado = obj1.gxTv_SdtResultado_Resultadoabonado
      n20resultadoAbonado = false
      A1resultadoId = obj1.gxTv_SdtResultado_Resultadoid
      Z1resultadoId = obj1.gxTv_SdtResultado_Resultadoid_Z
      Z7resultadoFicha = obj1.gxTv_SdtResultado_Resultadoficha_Z
      Z8resultadoComentarios = obj1.gxTv_SdtResultado_Resultadocomentarios_Z
      Z9resultadoUserId = obj1.gxTv_SdtResultado_Resultadouserid_Z
      Z10resultadoTypeId = obj1.gxTv_SdtResultado_Resultadotypeid_Z
      Z11resultadoIdNetUsuario = obj1.gxTv_SdtResultado_Resultadoidnetusuario_Z
      Z12resultadoFechaCreado = obj1.gxTv_SdtResultado_Resultadofechacreado_Z
      Z13resultadoFechaEmision = obj1.gxTv_SdtResultado_Resultadofechaemision_Z
      Z14resultadoPathExcel = obj1.gxTv_SdtResultado_Resultadopathexcel_Z
      Z15resultadoPathPdf = obj1.gxTv_SdtResultado_Resultadopathpdf_Z
      Z16resultadoPathCsv = obj1.gxTv_SdtResultado_Resultadopathcsv_Z
      Z17resultadoIdEstado = obj1.gxTv_SdtResultado_Resultadoidestado_Z
      Z18resultadoIdLibro = obj1.gxTv_SdtResultado_Resultadoidlibro_Z
      Z166resultadoIdNetTipoinforme = obj1.gxTv_SdtResultado_Resultadoidnettipoinforme_Z
      Z19resultadoEliminado = obj1.gxTv_SdtResultado_Resultadoeliminado_Z
      Z20resultadoAbonado = obj1.gxTv_SdtResultado_Resultadoabonado_Z
      n7resultadoFicha = Bool( obj1.gxTv_SdtResultado_Resultadoficha_N )
      n8resultadoComentarios = Bool( obj1.gxTv_SdtResultado_Resultadocomentarios_N )
      n9resultadoUserId = Bool( obj1.gxTv_SdtResultado_Resultadouserid_N )
      n10resultadoTypeId = Bool( obj1.gxTv_SdtResultado_Resultadotypeid_N )
      n11resultadoIdNetUsuario = Bool( obj1.gxTv_SdtResultado_Resultadoidnetusuario_N )
      n12resultadoFechaCreado = Bool( obj1.gxTv_SdtResultado_Resultadofechacreado_N )
      n13resultadoFechaEmision = Bool( obj1.gxTv_SdtResultado_Resultadofechaemision_N )
      n14resultadoPathExcel = Bool( obj1.gxTv_SdtResultado_Resultadopathexcel_N )
      n15resultadoPathPdf = Bool( obj1.gxTv_SdtResultado_Resultadopathpdf_N )
      n16resultadoPathCsv = Bool( obj1.gxTv_SdtResultado_Resultadopathcsv_N )
      n17resultadoIdEstado = Bool( obj1.gxTv_SdtResultado_Resultadoidestado_N )
      n18resultadoIdLibro = Bool( obj1.gxTv_SdtResultado_Resultadoidlibro_N )
      n19resultadoEliminado = Bool( obj1.gxTv_SdtResultado_Resultadoeliminado_N )
      n20resultadoAbonado = Bool( obj1.gxTv_SdtResultado_Resultadoabonado_N )
      Gx_mode = obj1.gxTv_SdtResultado_Mode
   }

   public override func loadKey( _ obj: [Any] )
   {
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      A1resultadoId = (obj[0] as! NSNumber).int64Value
      AnyError = 0
      gx_msglist.removeAllItems()
      initializeNonKey011( ) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS"
      }
      else
      {
         Gx_mode = "UPD"
         Z1resultadoId = A1resultadoId
      }
      zm011( -1) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         gx_msglist.addItem(GXMessages.getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "")
         AnyError = 1
      }
   }

   public func load( )
   {
      AnyError = 0
      gx_msglist.removeAllItems()
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      rowToVars1( bcResultado, 0)
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS"
      }
      else
      {
         Gx_mode = "UPD"
         Z1resultadoId = A1resultadoId
      }
      zm011( -1) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         gx_msglist.addItem(GXMessages.getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "")
         AnyError = 1
      }
   }

   public func saveImpl( )
   {
      nKeyPressed = 1
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( isIns( ) )
         {
            gx_msglist.addItem(GXMessages.getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "")
            AnyError = 1
         }
         else if ( A1resultadoId != Z1resultadoId )
         {
            A1resultadoId = Z1resultadoId
            gx_msglist.addItem(GXMessages.getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "")
            AnyError = 1
         }
         else if ( isDlt( ) )
         {
            delete( ) ;
            afterTrn( ) ;
         }
         else
         {
            Gx_mode = "UPD"
            /* Update record */
            update011( ) ;
         }
      }
      else
      {
         if ( isDlt( ) )
         {
            gx_msglist.addItem(GXMessages.getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "")
            AnyError = 1
         }
         else
         {
            if ( A1resultadoId != Z1resultadoId )
            {
               if ( isUpd( ) )
               {
                  gx_msglist.addItem(GXMessages.getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "")
                  AnyError = 1
               }
               else
               {
                  Gx_mode = "INS"
                  /* Insert record */
                  insert011( ) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  gx_msglist.addItem(GXMessages.getMessage("GXM_recdeleted"), 1, "")
                  AnyError = 1
               }
               else
               {
                  Gx_mode = "INS"
                  /* Insert record */
                  insert011( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public override func save( )
   {
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      AnyError = 0
      gx_msglist.removeAllItems()
      IsConfirmed = 1
      rowToVars1( bcResultado, 1)
      saveImpl( )
      varsToRow1( bcResultado)
   }

   public override func insert( ) -> Bool
   {
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      AnyError = 0
      gx_msglist.removeAllItems()
      IsConfirmed = 1
      rowToVars1( bcResultado, 1)
      Gx_mode = "INS"
      /* Insert record */
      insert011( ) ;
      afterTrn( ) ;
      varsToRow1( bcResultado)
      return (AnyError==0)
   }

   public func updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( )
      }
      else
      {
         let auxBC : SdtResultado = SdtResultado()
         let auxTrn : GXBusinessComponent = auxBC.getTransaction()
         auxBC.load([A1resultadoId])
         if ( auxTrn.errors() == 0 )
         {
            auxBC.updateDirties(bcResultado)
            auxBC.save()
         }
         LclMsgLst = auxTrn.getMessages()
         AnyError = auxTrn.errors()
         gx_msglist = LclMsgLst
         if ( auxTrn.errors() == 0 )
         {
            Gx_mode = auxTrn.getMode()
            afterTrn( ) ;
         }
      }
   }

   public override func update( ) -> Bool
   {
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      AnyError = 0
      gx_msglist.removeAllItems()
      IsConfirmed = 1
      rowToVars1( bcResultado, 1)
      updateImpl( )
      varsToRow1( bcResultado)
      return (AnyError==0)
   }

   public override func check( )
   {
      BackMsgLst = gx_msglist
      gx_msglist = LclMsgLst
      AnyError = 0
      gx_msglist.removeAllItems()
      rowToVars1( bcResultado, 0)
      nKeyPressed = 3
      IsConfirmed = 0
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( isIns( ) )
         {
            gx_msglist.addItem(GXMessages.getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "")
            AnyError = 1
         }
         else if ( A1resultadoId != Z1resultadoId )
         {
            A1resultadoId = Z1resultadoId
            gx_msglist.addItem(GXMessages.getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "")
            AnyError = 1
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD"
            update_check( ) ;
         }
      }
      else
      {
         if ( A1resultadoId != Z1resultadoId )
         {
            Gx_mode = "INS"
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               gx_msglist.addItem(GXMessages.getMessage("GXM_recdeleted"), 1, "")
               AnyError = 1
            }
            else
            {
               Gx_mode = "INS"
               insert_check( ) ;
            }
         }
      }
      GXDBManager.sharedInstance().rollbackDatastore("GAM")
      GXDBManager.sharedInstance().rollbackDatastore("DEFAULT")
      varsToRow1( bcResultado)
   }

   public func setSdt( _ sdt: SdtResultado ,
                       _ sdtToBc: Int )
   {
      if ( sdt != bcResultado )
      {
         bcResultado = sdt
         if ( GXutil.strcmp(bcResultado.gxTv_SdtResultado_Mode, "") == 0 )
         {
            bcResultado.gxTv_SdtResultado_Mode = "INS"
         }
         if ( sdtToBc == 1 )
         {
            varsToRow1( bcResultado)
         }
         else
         {
            rowToVars1( bcResultado, 1)
         }
      }
      else
      {
         if ( GXutil.strcmp(bcResultado.gxTv_SdtResultado_Mode, "") == 0 )
         {
            bcResultado.gxTv_SdtResultado_Mode = "INS"
         }
      }
   }

   public func reloadFromSDT( )
   {
      rowToVars1( bcResultado, 1)
   }

   public func forceCommitOnExit( )
   {
      mustCommit = true
   }

   public override func gxBCName( ) -> String
   {
      return "Resultado"
   }

   public override func cleanup( )
   {
      super.cleanup();
      closeOpenCursors()
   }

   private func closeOpenCursors( )
   {
   }

   /* Dynamic ivars */
   public override var anyerror: NSNumber {
      get {
         return NSNumber(value: AnyError)
      }
   }

   /* Aggregate/select formulas */
   public override func initialize( )
   {
      PreviousTooltip = ""
      PreviousCaption = ""
      Gx_mode = ""
      endTrnMsgTxt = ""
      endTrnMsgCod = ""
      Z8resultadoComentarios = ""
      A8resultadoComentarios = ""
      Z12resultadoFechaCreado = Date.gxEmpty()
      A12resultadoFechaCreado = Date.gxEmpty()
      Z13resultadoFechaEmision = Date.gxEmpty()
      A13resultadoFechaEmision = Date.gxEmpty()
      Z14resultadoPathExcel = ""
      A14resultadoPathExcel = ""
      Z15resultadoPathPdf = ""
      A15resultadoPathPdf = ""
      Z16resultadoPathCsv = ""
      A16resultadoPathCsv = ""
      scmdbuf = ""
      sMode1 = ""
      pr_gam = GXDataStoreProvider(resultado_bc__gam(),
         [
         ]
      );
      pr_default = GXDataStoreProvider(resultado_bc__default(),
         [
         ]
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private var IsConfirmed : Int = 0
   private var IsModified : Int = 0
   private var AnyError : Int = 0
   private var trnEnded : Int = 0
   private var nKeyPressed : Int = 0
   private var GX_JID : Int = 0
   private var Z19resultadoEliminado : Int = 0
   private var A19resultadoEliminado : Int = 0
   private var RcdFound1 : Int = 0
   private var nIsDirty_1 : Int = 0
   private var Z1resultadoId : Int64 = 0
   private var A1resultadoId : Int64 = 0
   private var Z7resultadoFicha : Int64 = 0
   private var A7resultadoFicha : Int64 = 0
   private var Z9resultadoUserId : Int64 = 0
   private var A9resultadoUserId : Int64 = 0
   private var Z10resultadoTypeId : Int64 = 0
   private var A10resultadoTypeId : Int64 = 0
   private var Z11resultadoIdNetUsuario : Int64 = 0
   private var A11resultadoIdNetUsuario : Int64 = 0
   private var Z17resultadoIdEstado : Int64 = 0
   private var A17resultadoIdEstado : Int64 = 0
   private var Z18resultadoIdLibro : Int64 = 0
   private var A18resultadoIdLibro : Int64 = 0
   private var Z166resultadoIdNetTipoinforme : Int64 = 0
   private var A166resultadoIdNetTipoinforme : Int64 = 0
   private var Z20resultadoAbonado : Int64 = 0
   private var A20resultadoAbonado : Int64 = 0
   private var PreviousTooltip : String = ""
   private var PreviousCaption : String = ""
   private var endTrnMsgTxt : String = ""
   private var endTrnMsgCod : String = ""
   private var scmdbuf : String = ""
   private var sMode1 : String = ""
   private var Z12resultadoFechaCreado : Date = Date.gxEmpty()
   private var A12resultadoFechaCreado : Date = Date.gxEmpty()
   private var Z13resultadoFechaEmision : Date = Date.gxEmpty()
   private var A13resultadoFechaEmision : Date = Date.gxEmpty()
   private var n7resultadoFicha : Bool = false
   private var n8resultadoComentarios : Bool = false
   private var n9resultadoUserId : Bool = false
   private var n10resultadoTypeId : Bool = false
   private var n11resultadoIdNetUsuario : Bool = false
   private var n12resultadoFechaCreado : Bool = false
   private var n13resultadoFechaEmision : Bool = false
   private var n14resultadoPathExcel : Bool = false
   private var n15resultadoPathPdf : Bool = false
   private var n16resultadoPathCsv : Bool = false
   private var n17resultadoIdEstado : Bool = false
   private var n18resultadoIdLibro : Bool = false
   private var n19resultadoEliminado : Bool = false
   private var n20resultadoAbonado : Bool = false
   private var Gx_longc : Bool = false
   private var mustCommit : Bool = false
   private var Z8resultadoComentarios : String = ""
   private var A8resultadoComentarios : String = ""
   private var Z14resultadoPathExcel : String = ""
   private var A14resultadoPathExcel : String = ""
   private var Z15resultadoPathPdf : String = ""
   private var A15resultadoPathPdf : String = ""
   private var Z16resultadoPathCsv : String = ""
   private var A16resultadoPathCsv : String = ""
   private var BackMsgLst : GXMessageList = GXMessageList()
   private var LclMsgLst : GXMessageList = GXMessageList()
   private weak var bcResultado : SdtResultado!
   private var pr_default : GXDataStoreProvider = GXDataStoreProvider()
   private var pr_gam : GXDataStoreProvider = GXDataStoreProvider()
}

@objc( resultado_bc__gam )
final  class resultado_bc__gam: GXDataStoreHelperBase
{
   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         default: return nil
      }
   }

    func getDataStoreName( ) -> String
   {
      return "GAM";
   }

}

@objc( resultado_bc__default )
final  class resultado_bc__default: GXDataStoreHelperBase
{
   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         case 0: return ForEachCursor("BC00012", "SELECT TM1.[resultadoId] AS resultadoId, TM1.[resultadoFicha] AS resultadoFicha, TM1.[resultadoComentarios] AS resultadoComentarios, TM1.[resultadoUserId] AS resultadoUserId, TM1.[resultadoTypeId] AS resultadoTypeId, TM1.[resultadoIdNetUsuario] AS resultadoIdNetUsuario, TM1.[resultadoFechaCreado] AS resultadoFechaCreado, TM1.[resultadoFechaEmision] AS resultadoFechaEmision, TM1.[resultadoPathExcel] AS resultadoPathExcel, TM1.[resultadoPathPdf] AS resultadoPathPdf, TM1.[resultadoPathCsv] AS resultadoPathCsv, TM1.[resultadoIdEstado] AS resultadoIdEstado, TM1.[resultadoIdLibro] AS resultadoIdLibro, TM1.[resultadoIdNetTipoinforme] AS resultadoIdNetTipoinforme, TM1.[resultadoEliminado] AS resultadoEliminado, TM1.[resultadoAbonado] AS resultadoAbonado FROM [Resultado] TM1 WHERE TM1.[resultadoId] = ? ORDER BY TM1.[resultadoId] ")
         case 1: return ForEachCursor("BC00013", "SELECT [resultadoId] AS resultadoId FROM [Resultado] WHERE [resultadoId] = ? ")
         case 2: return ForEachCursor("BC00014", "SELECT [resultadoId] AS resultadoId, [resultadoFicha] AS resultadoFicha, [resultadoComentarios] AS resultadoComentarios, [resultadoUserId] AS resultadoUserId, [resultadoTypeId] AS resultadoTypeId, [resultadoIdNetUsuario] AS resultadoIdNetUsuario, [resultadoFechaCreado] AS resultadoFechaCreado, [resultadoFechaEmision] AS resultadoFechaEmision, [resultadoPathExcel] AS resultadoPathExcel, [resultadoPathPdf] AS resultadoPathPdf, [resultadoPathCsv] AS resultadoPathCsv, [resultadoIdEstado] AS resultadoIdEstado, [resultadoIdLibro] AS resultadoIdLibro, [resultadoIdNetTipoinforme] AS resultadoIdNetTipoinforme, [resultadoEliminado] AS resultadoEliminado, [resultadoAbonado] AS resultadoAbonado FROM [Resultado] WHERE [resultadoId] = ? ")
         case 3: return ForEachCursor("BC00015", "SELECT [resultadoId] AS resultadoId, [resultadoFicha] AS resultadoFicha, [resultadoComentarios] AS resultadoComentarios, [resultadoUserId] AS resultadoUserId, [resultadoTypeId] AS resultadoTypeId, [resultadoIdNetUsuario] AS resultadoIdNetUsuario, [resultadoFechaCreado] AS resultadoFechaCreado, [resultadoFechaEmision] AS resultadoFechaEmision, [resultadoPathExcel] AS resultadoPathExcel, [resultadoPathPdf] AS resultadoPathPdf, [resultadoPathCsv] AS resultadoPathCsv, [resultadoIdEstado] AS resultadoIdEstado, [resultadoIdLibro] AS resultadoIdLibro, [resultadoIdNetTipoinforme] AS resultadoIdNetTipoinforme, [resultadoEliminado] AS resultadoEliminado, [resultadoAbonado] AS resultadoAbonado FROM [Resultado] WHERE [resultadoId] = ? ")
         case 4: return UpdateCursor("BC00016", "INSERT INTO [Resultado]([resultadoId], [resultadoFicha], [resultadoComentarios], [resultadoUserId], [resultadoTypeId], [resultadoIdNetUsuario], [resultadoFechaCreado], [resultadoFechaEmision], [resultadoPathExcel], [resultadoPathPdf], [resultadoPathCsv], [resultadoIdEstado], [resultadoIdLibro], [resultadoIdNetTipoinforme], [resultadoEliminado], [resultadoAbonado]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
         case 5: return UpdateCursor("BC00017", "UPDATE [Resultado] SET [resultadoFicha]=?, [resultadoComentarios]=?, [resultadoUserId]=?, [resultadoTypeId]=?, [resultadoIdNetUsuario]=?, [resultadoFechaCreado]=?, [resultadoFechaEmision]=?, [resultadoPathExcel]=?, [resultadoPathPdf]=?, [resultadoPathCsv]=?, [resultadoIdEstado]=?, [resultadoIdLibro]=?, [resultadoIdNetTipoinforme]=?, [resultadoEliminado]=?, [resultadoAbonado]=?  WHERE [resultadoId] = ?")
         case 6: return UpdateCursor("BC00018", "DELETE FROM [Resultado]  WHERE [resultadoId] = ?")
         case 7: return ForEachCursor("BC00019", "SELECT TM1.[resultadoId] AS resultadoId, TM1.[resultadoFicha] AS resultadoFicha, TM1.[resultadoComentarios] AS resultadoComentarios, TM1.[resultadoUserId] AS resultadoUserId, TM1.[resultadoTypeId] AS resultadoTypeId, TM1.[resultadoIdNetUsuario] AS resultadoIdNetUsuario, TM1.[resultadoFechaCreado] AS resultadoFechaCreado, TM1.[resultadoFechaEmision] AS resultadoFechaEmision, TM1.[resultadoPathExcel] AS resultadoPathExcel, TM1.[resultadoPathPdf] AS resultadoPathPdf, TM1.[resultadoPathCsv] AS resultadoPathCsv, TM1.[resultadoIdEstado] AS resultadoIdEstado, TM1.[resultadoIdLibro] AS resultadoIdLibro, TM1.[resultadoIdNetTipoinforme] AS resultadoIdNetTipoinforme, TM1.[resultadoEliminado] AS resultadoEliminado, TM1.[resultadoAbonado] AS resultadoAbonado FROM [Resultado] TM1 WHERE TM1.[resultadoId] = ? ORDER BY TM1.[resultadoId] ")
         default: return nil
      }
   }

}

