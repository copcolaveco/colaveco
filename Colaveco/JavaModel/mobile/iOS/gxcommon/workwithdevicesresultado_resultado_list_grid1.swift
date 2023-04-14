/*
               File: WorkWithDevicesResultado_Resultado_List_Grid1
        Description: WorkWithDevicesResultado_Resultado_List_Grid1
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:56.9
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( workwithdevicesresultado_resultado_list_grid1 )
public final  class workwithdevicesresultado_resultado_list_grid1: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ aP2: NSString? ,
                                            _ aP3: NSDate? ,
                                            _ aP4: NSDate? ,
                                            _ aP5: NSDate? ,
                                            _ aP6: NSDate? ,
                                            _ aP7: NSNumber? ,
                                            _ aP8: NSNumber? ,
                                            _ aP9: NSNumber? ,
                                            _ inout_aP10: AutoreleasingUnsafeMutablePointer<GXObjectCollection?> )
   {
      let aP10: GXObjectCollection? = inout_aP10.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int64 = (aP1 == nil) ? 0 : aP1!.int64Value as Int64
      let iP2: String = (aP2 == nil) ? "" : aP2! as String
      let iP3: Date = (aP3 == nil) ? Date.gxEmpty() : aP3! as Date
      let iP4: Date = (aP4 == nil) ? Date.gxEmpty() : aP4! as Date
      let iP5: Date = (aP5 == nil) ? Date.gxEmpty() : aP5! as Date
      let iP6: Date = (aP6 == nil) ? Date.gxEmpty() : aP6! as Date
      let iP7: Int64 = (aP7 == nil) ? 0 : aP7!.int64Value as Int64
      let iP8: Int64 = (aP8 == nil) ? 0 : aP8!.int64Value as Int64
      let iP9: Int = (aP9 == nil) ? 0 : aP9!.intValue as Int
      var iP10: GXObjectCollection = (aP10 == nil) ? GXObjectCollection() : aP10! as GXObjectCollection
      execute(iP0, iP1, iP2, iP3, iP4, iP5, iP6, iP7, iP8, iP9, &iP10)
      inout_aP10.pointee  = iP10 as GXObjectCollection?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int64 ,
                           _ aP2: String ,
                           _ aP3: Date ,
                           _ aP4: Date ,
                           _ aP5: Date ,
                           _ aP6: Date ,
                           _ aP7: Int64 ,
                           _ aP8: Int64 ,
                           _ aP9: Int ) -> GXObjectCollection
   {
      self.AV7ExternalId = aP0
      self.AV8TipoinformeId = aP1
      self.AV22SearchText = aP2
      self.AV13cresultadoFechaCreadoFrom = aP3
      self.AV14cresultadoFechaCreadoTo = aP4
      self.AV15cresultadoFechaEmisionFrom = aP5
      self.AV16cresultadoFechaEmisionTo = aP6
      self.AV20start = aP7
      self.AV21count = aP8
      self.AV17gxid = aP9
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV23GXM2RootCol
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int64 ,
                        _ aP2: String ,
                        _ aP3: Date ,
                        _ aP4: Date ,
                        _ aP5: Date ,
                        _ aP6: Date ,
                        _ aP7: Int64 ,
                        _ aP8: Int64 ,
                        _ aP9: Int ,
                        _ aP10: inout GXObjectCollection )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, &aP10)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int64 ,
                             _ aP2: String ,
                             _ aP3: Date ,
                             _ aP4: Date ,
                             _ aP5: Date ,
                             _ aP6: Date ,
                             _ aP7: Int64 ,
                             _ aP8: Int64 ,
                             _ aP9: Int ,
                             _ aP10: inout GXObjectCollection )
   {
      self.AV7ExternalId = aP0
      self.AV8TipoinformeId = aP1
      self.AV22SearchText = aP2
      self.AV13cresultadoFechaCreadoFrom = aP3
      self.AV14cresultadoFechaCreadoTo = aP4
      self.AV15cresultadoFechaEmisionFrom = aP5
      self.AV16cresultadoFechaEmisionTo = aP6
      self.AV20start = aP7
      self.AV21count = aP8
      self.AV17gxid = aP9
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP10 = self.AV23GXM2RootCol
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV17gxid), totalLength:8, decimals:0)
      AV27Imagen_GXI = ( Gxwebsession.getValue(Gxids+"gxvar_Imagen") )
      AV6imagen = ""
      AV5estado = Gxwebsession.getValue(Gxids+"gxvar_Estado")
      GXPagingIdx2 = 0
      GXPagingFrom2 = Int(AV20start )
      GXPagingTo2 = Int(AV20start + AV21count )
      var dynParams0 = Array<Any>()
      dynParams0.append(AV8TipoinformeId)
      dynParams0.append(AV22SearchText)
      dynParams0.append(AV13cresultadoFechaCreadoFrom)
      dynParams0.append(AV14cresultadoFechaCreadoTo)
      dynParams0.append(AV15cresultadoFechaEmisionFrom)
      dynParams0.append(AV16cresultadoFechaEmisionTo)
      dynParams0.append(A166resultadoIdNetTipoinforme)
      dynParams0.append(A8resultadoComentarios)
      dynParams0.append(A14resultadoPathExcel)
      dynParams0.append(A15resultadoPathPdf)
      dynParams0.append(A16resultadoPathCsv)
      dynParams0.append(A12resultadoFechaCreado)
      dynParams0.append(A13resultadoFechaEmision)
      dynParams0.append(A11resultadoIdNetUsuario)
      dynParams0.append(AV7ExternalId)
      pr_default.dynParam(0, [ dynParams0 ])
      lV22SearchText = AV22SearchText.gxStringByTrimmingRight().gxStringByConcatenating(with:"%", separator:"")
      lV22SearchText = AV22SearchText.gxStringByTrimmingRight().gxStringByConcatenating(with:"%", separator:"")
      lV22SearchText = AV22SearchText.gxStringByTrimmingRight().gxStringByConcatenating(with:"%", separator:"")
      lV22SearchText = AV22SearchText.gxStringByTrimmingRight().gxStringByConcatenating(with:"%", separator:"")
      /* Using cursor P00002 */
      var params0 = Array<Any>()
      params0.append(AV7ExternalId)
      params0.append(AV8TipoinformeId)
      params0.append(lV22SearchText.gxSubstring(1, length:1000))
      params0.append(lV22SearchText.gxSubstring(1, length:1000))
      params0.append(lV22SearchText.gxSubstring(1, length:1000))
      params0.append(lV22SearchText.gxSubstring(1, length:1000))
      params0.append(AV13cresultadoFechaCreadoFrom)
      params0.append(AV14cresultadoFechaCreadoTo)
      params0.append(AV15cresultadoFechaEmisionFrom)
      params0.append(AV16cresultadoFechaEmisionTo)
      var nullParams0 = Array<Bool>()
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      nullParams0.append(false)
      pr_default.execute(0, params: params0, nullParams: nullParams0)
      while ( ( pr_default.getStatus(0) != 101 ) && ( ( GXPagingTo2 == GXPagingFrom2 ) || ( GXPagingIdx2 < GXPagingTo2 ) ) )
      {
         self.A11resultadoIdNetUsuario = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdNetUsuario")
         n11resultadoIdNetUsuario = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoIdNetUsuario")
         self.A13resultadoFechaEmision = pr_default.getDBCommand(0).dateValue(forColumn: "resultadoFechaEmision")
         n13resultadoFechaEmision = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFechaEmision")
         self.A12resultadoFechaCreado = pr_default.getDBCommand(0).dateValue(forColumn: "resultadoFechaCreado")
         n12resultadoFechaCreado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFechaCreado")
         self.A8resultadoComentarios = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoComentarios")
         n8resultadoComentarios = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoComentarios")
         self.A14resultadoPathExcel = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathExcel")
         n14resultadoPathExcel = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathExcel")
         self.A15resultadoPathPdf = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathPdf")
         n15resultadoPathPdf = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathPdf")
         self.A16resultadoPathCsv = pr_default.getDBCommand(0).stringValue(forColumn: "resultadoPathCsv")
         n16resultadoPathCsv = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoPathCsv")
         self.A166resultadoIdNetTipoinforme = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdNetTipoinforme")
         self.A17resultadoIdEstado = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoIdEstado")
         n17resultadoIdEstado = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoIdEstado")
         self.A1resultadoId = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoId")
         self.A7resultadoFicha = pr_default.getDBCommand(0).int64Value(forColumn: "resultadoFicha")
         n7resultadoFicha = pr_default.getDBCommand(0).valueIsNull(forColumn: "resultadoFicha")
         GXPagingIdx2 = GXPagingIdx2 + 1
         if ( GXPagingIdx2 > GXPagingFrom2 )
         {
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item()
            AV23GXM2RootCol.add(AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt, 0)
            if ( A166resultadoIdNetTipoinforme == Int64(1) )
            {
               AV6imagen = GXutil.getImagePath("6fe83b86-f2ef-4cdc-96e4-212159b8b00b", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("6fe83b86-f2ef-4cdc-96e4-212159b8b00b", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(3) )
            {
               AV6imagen = GXutil.getImagePath("ea977fc6-d211-448e-ade1-f59eca454eea", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("ea977fc6-d211-448e-ade1-f59eca454eea", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(4) )
            {
               AV6imagen = GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(6) )
            {
               AV6imagen = GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(7) )
            {
               AV6imagen = GXutil.getImagePath("dba83ce5-7c58-49d2-8edd-5e35a18402ab", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("dba83ce5-7c58-49d2-8edd-5e35a18402ab", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(8) )
            {
               AV6imagen = GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(9) )
            {
               AV6imagen = GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("c8f9857a-043c-4e00-a15c-00a86e2fdb7d", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(10) )
            {
               AV6imagen = GXutil.getImagePath("b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(11) )
            {
               AV6imagen = GXutil.getImagePath("de1c8545-466f-4d9e-8922-f6d71d595cd2", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("de1c8545-466f-4d9e-8922-f6d71d595cd2", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(13) )
            {
               AV6imagen = GXutil.getImagePath("1a941648-f7d8-4a95-9058-b0cf810d51fa", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("1a941648-f7d8-4a95-9058-b0cf810d51fa", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(14) )
            {
               AV6imagen = GXutil.getImagePath("e8887987-78e0-4008-941a-4f62bbe87c4d", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("e8887987-78e0-4008-941a-4f62bbe87c4d", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(15) )
            {
               AV6imagen = GXutil.getImagePath("b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(16) )
            {
               AV6imagen = GXutil.getImagePath("72161498-ee12-470e-8aab-d8b2d9761b43", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("72161498-ee12-470e-8aab-d8b2d9761b43", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A166resultadoIdNetTipoinforme == Int64(99) )
            {
               AV6imagen = GXutil.getImagePath("de1c8545-466f-4d9e-8922-f6d71d595cd2", language:"", themeName:GXThemeHelper.currentThemeName())
               AV27Imagen_GXI = GXDbFile.uri(fromURL:GXutil.getImagePath("de1c8545-466f-4d9e-8922-f6d71d595cd2", language:"", themeName:GXThemeHelper.currentThemeName()))
            }
            if ( A17resultadoIdEstado == Int64(1) )
            {
               AV5estado = "En proceso"
            }
            if ( A17resultadoIdEstado == Int64(2) )
            {
               AV5estado = "Pendiente de aceptación"
            }
            if ( A17resultadoIdEstado == Int64(3) )
            {
               AV5estado = "Finalizado"
            }
            if ( A17resultadoIdEstado == Int64(4) )
            {
               AV5estado = "No aceptado"
            }
            if ( A17resultadoIdEstado == Int64(5) )
            {
               AV5estado = "Finalizado"
            }
            if ( A17resultadoIdEstado == Int64(6) )
            {
               AV5estado = "Finalizado"
            }
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = A1resultadoId
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = A12resultadoFechaCreado
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = A7resultadoFicha
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = AV6imagen
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = AV27Imagen_GXI
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = AV5estado
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV27Imagen_GXI)
      Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado)
      cleanup()
   }

   public override func cleanup( )
   {
      closeOpenCursors()
   }

   private func closeOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public override func initialize( )
   {
      AV23GXM2RootCol = GXObjectCollection(typeName: "SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item")
      Gxids = ""
      AV27Imagen_GXI = ""
      Gxwebsession = GXOfflineSession.sharedInstance()
      AV6imagen = ""
      AV5estado = ""
      scmdbuf = ""
      lV22SearchText = ""
      A8resultadoComentarios = ""
      A14resultadoPathExcel = ""
      A15resultadoPathPdf = ""
      A16resultadoPathCsv = ""
      A12resultadoFechaCreado = Date.gxEmpty()
      A13resultadoFechaEmision = Date.gxEmpty()
      AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item()
      pr_default = GXDataStoreProvider(workwithdevicesresultado_resultado_list_grid1__default(),
         [
         ]
      );
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV17gxid : Int = 0
   private var GXPagingFrom2 : Int = 0
   private var GXPagingTo2 : Int = 0
   private var GXPagingIdx2 : Int = 0
   private var Gx_err : Int = 0
   private var AV7ExternalId : Int64 = 0
   private var AV8TipoinformeId : Int64 = 0
   private var AV20start : Int64 = 0
   private var AV21count : Int64 = 0
   private var A166resultadoIdNetTipoinforme : Int64 = 0
   private var A11resultadoIdNetUsuario : Int64 = 0
   private var A17resultadoIdEstado : Int64 = 0
   private var A1resultadoId : Int64 = 0
   private var A7resultadoFicha : Int64 = 0
   private var Gxids : String = ""
   private var scmdbuf : String = ""
   private var AV13cresultadoFechaCreadoFrom : Date = Date.gxEmpty()
   private var AV14cresultadoFechaCreadoTo : Date = Date.gxEmpty()
   private var AV15cresultadoFechaEmisionFrom : Date = Date.gxEmpty()
   private var AV16cresultadoFechaEmisionTo : Date = Date.gxEmpty()
   private var A12resultadoFechaCreado : Date = Date.gxEmpty()
   private var A13resultadoFechaEmision : Date = Date.gxEmpty()
   private var n11resultadoIdNetUsuario : Bool = false
   private var n13resultadoFechaEmision : Bool = false
   private var n12resultadoFechaCreado : Bool = false
   private var n8resultadoComentarios : Bool = false
   private var n14resultadoPathExcel : Bool = false
   private var n15resultadoPathPdf : Bool = false
   private var n16resultadoPathCsv : Bool = false
   private var n17resultadoIdEstado : Bool = false
   private var n7resultadoFicha : Bool = false
   private var AV22SearchText : String = ""
   private var AV27Imagen_GXI : String = ""
   private var AV5estado : String = ""
   private var lV22SearchText : String = ""
   private var A8resultadoComentarios : String = ""
   private var A14resultadoPathExcel : String = ""
   private var A15resultadoPathPdf : String = ""
   private var A16resultadoPathCsv : String = ""
   private var AV6imagen : String = ""
   private var pr_default : GXDataStoreProvider = GXDataStoreProvider()
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV23GXM2RootCol : GXObjectCollection = GXObjectCollection()
   private var AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt : SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item = SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item()
}

@objc( workwithdevicesresultado_resultado_list_grid1__default )
final  class workwithdevicesresultado_resultado_list_grid1__default: GXDataStoreHelperBase
{
   func conditional_P00002( _ AV8TipoinformeId: Int64 ,
                            _ AV22SearchText: String ,
                            _ AV13cresultadoFechaCreadoFrom: Date ,
                            _ AV14cresultadoFechaCreadoTo: Date ,
                            _ AV15cresultadoFechaEmisionFrom: Date ,
                            _ AV16cresultadoFechaEmisionTo: Date ,
                            _ A166resultadoIdNetTipoinforme: Int64 ,
                            _ A8resultadoComentarios: String ,
                            _ A14resultadoPathExcel: String ,
                            _ A15resultadoPathPdf: String ,
                            _ A16resultadoPathCsv: String ,
                            _ A12resultadoFechaCreado: Date ,
                            _ A13resultadoFechaEmision: Date ,
                            _ A11resultadoIdNetUsuario: Int64 ,
                            _ AV7ExternalId: Int64 ) -> [Any]
   {
      var sWhereString : String = ""
      var scmdbuf : String
      var GXv_int1 : [Int]
      GXv_int1 = [Int](repeating: 0, count:10)
      var GXv_Object2 : [Any]
      GXv_Object2 = [Any](repeating: "", count:2)
      scmdbuf = "SELECT [resultadoIdNetUsuario] AS resultadoIdNetUsuario, [resultadoFechaEmision]"
      scmdbuf = scmdbuf  +  " AS resultadoFechaEmision, [resultadoFechaCreado] AS resultadoFechaCreado, [resultadoComentarios]"
      scmdbuf = scmdbuf  +  " AS resultadoComentarios, [resultadoPathExcel] AS resultadoPathExcel, [resultadoPathPdf]"
      scmdbuf = scmdbuf  +  " AS resultadoPathPdf, [resultadoPathCsv] AS resultadoPathCsv, [resultadoIdNetTipoinforme]"
      scmdbuf = scmdbuf  +  " AS resultadoIdNetTipoinforme, [resultadoIdEstado] AS resultadoIdEstado, [resultadoId]"
      scmdbuf = scmdbuf  +  " AS resultadoId, [resultadoFicha] AS resultadoFicha FROM [Resultado]"
      sWhereString = addWhere( sWhereString, "([resultadoIdNetUsuario] = ?)")
      if ( AV8TipoinformeId != Int64(0) )
      {
         sWhereString = addWhere( sWhereString, "([resultadoIdNetTipoinforme] = ?)")
      }
      else
      {
         GXv_int1[1] = 1
      }
      if ( !(GXutil.strcmp("", AV22SearchText)==0) )
      {
         sWhereString = addWhere( sWhereString, "(UPPER([resultadoComentarios]) like '%' || UPPER(?) or UPPER([resultadoPathExcel]) like '%' || UPPER(?) or UPPER([resultadoPathPdf]) like '%' || UPPER(?) or UPPER([resultadoPathCsv]) like '%' || UPPER(?))")
      }
      else
      {
         GXv_int1[2] = 1
         GXv_int1[3] = 1
         GXv_int1[4] = 1
         GXv_int1[5] = 1
      }
      if ( !(Date.gxEmpty()==AV13cresultadoFechaCreadoFrom) )
      {
         sWhereString = addWhere( sWhereString, "([resultadoFechaCreado] >= ?)")
      }
      else
      {
         GXv_int1[6] = 1
      }
      if ( !(Date.gxEmpty()==AV14cresultadoFechaCreadoTo) )
      {
         sWhereString = addWhere( sWhereString, "([resultadoFechaCreado] <= ?)")
      }
      else
      {
         GXv_int1[7] = 1
      }
      if ( !(Date.gxEmpty()==AV15cresultadoFechaEmisionFrom) )
      {
         sWhereString = addWhere( sWhereString, "([resultadoFechaEmision] >= ?)")
      }
      else
      {
         GXv_int1[8] = 1
      }
      if ( !(Date.gxEmpty()==AV16cresultadoFechaEmisionTo) )
      {
         sWhereString = addWhere( sWhereString, "([resultadoFechaEmision] <= ?)")
      }
      else
      {
         GXv_int1[9] = 1
      }
      scmdbuf = scmdbuf  +  sWhereString
      scmdbuf = scmdbuf  +  " ORDER BY [resultadoFicha] DESC"
      GXv_Object2[0] = scmdbuf
      GXv_Object2[1] = GXv_int1
      return GXv_Object2
   }

   override func getDynamicStatement( _ cursor: Int ,
                                      _ dynConstraints: [Any] ) -> [Any]
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00002( (dynConstraints[0] as! Int64) , (dynConstraints[1] as! String) , (dynConstraints[2] as! Date) , (dynConstraints[3] as! Date) , (dynConstraints[4] as! Date) , (dynConstraints[5] as! Date) , (dynConstraints[6] as! Int64) , (dynConstraints[7] as! String) , (dynConstraints[8] as! String) , (dynConstraints[9] as! String) , (dynConstraints[10] as! String) , (dynConstraints[11] as! Date) , (dynConstraints[12] as! Date) , (dynConstraints[13] as! Int64) , (dynConstraints[14] as! Int64) );
            default:
               return []
      }
   }

   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         case 0: return ForEachCursor("P00002", "scmdbuf")
         default: return nil
      }
   }

}

