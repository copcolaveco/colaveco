/*
               File: WorkWithDevicesResultado_Resultado_Section_General
        Description: WorkWithDevicesResultado_Resultado_Section_General
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:56.36
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( workwithdevicesresultado_resultado_section_general )
public final  class workwithdevicesresultado_resultado_section_general: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ inout_aP2: AutoreleasingUnsafeMutablePointer<SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt?> )
   {
      let aP2: SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt? = inout_aP2.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int = (aP1 == nil) ? 0 : aP1!.intValue as Int
      var iP2: SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt = (aP2 == nil) ? SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt() : aP2! as SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt
      execute(iP0, iP1, &iP2)
      inout_aP2.pointee  = iP2 as SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int ) -> SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt
   {
      self.A1resultadoId = aP0
      self.AV6gxid = aP1
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int ,
                        _ aP2: inout SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt )
   {
      execute_int(aP0, aP1, &aP2)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int ,
                             _ aP2: inout SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt )
   {
      self.A1resultadoId = aP0
      self.AV6gxid = aP1
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP2 = self.AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt
   }

   private func privateExecute( )
   {
      /* Using cursor P00002 */
      var params0 = Array<Any>()
      params0.append(A1resultadoId)
      var nullParams0 = Array<Bool>()
      nullParams0.append(false)
      pr_default.execute(0, params: params0, nullParams: nullParams0)
      while ( pr_default.getStatus(0) != 101 )
      {
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
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = A1resultadoId
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = A7resultadoFicha
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = A8resultadoComentarios
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = A9resultadoUserId
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = A10resultadoTypeId
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = A11resultadoIdNetUsuario
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = A12resultadoFechaCreado
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = A13resultadoFechaEmision
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = A14resultadoPathExcel
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = A15resultadoPathPdf
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = A16resultadoPathCsv
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = A17resultadoIdEstado
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = A18resultadoIdLibro
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = A166resultadoIdNetTipoinforme
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = A19resultadoEliminado
         AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = A20resultadoAbonado
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         break
         /* Exiting from a For First loop. */
         break
      }
      pr_default.close(0);
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
      AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt = SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt()
      scmdbuf = ""
      A8resultadoComentarios = ""
      A12resultadoFechaCreado = Date.gxEmpty()
      A13resultadoFechaEmision = Date.gxEmpty()
      A14resultadoPathExcel = ""
      A15resultadoPathPdf = ""
      A16resultadoPathCsv = ""
      pr_default = GXDataStoreProvider(workwithdevicesresultado_resultado_section_general__default(),
         [
         ]
      );
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV6gxid : Int = 0
   private var A19resultadoEliminado : Int = 0
   private var Gx_err : Int = 0
   private var A1resultadoId : Int64 = 0
   private var A7resultadoFicha : Int64 = 0
   private var A9resultadoUserId : Int64 = 0
   private var A10resultadoTypeId : Int64 = 0
   private var A11resultadoIdNetUsuario : Int64 = 0
   private var A17resultadoIdEstado : Int64 = 0
   private var A18resultadoIdLibro : Int64 = 0
   private var A166resultadoIdNetTipoinforme : Int64 = 0
   private var A20resultadoAbonado : Int64 = 0
   private var scmdbuf : String = ""
   private var A12resultadoFechaCreado : Date = Date.gxEmpty()
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
   private var A8resultadoComentarios : String = ""
   private var A14resultadoPathExcel : String = ""
   private var A15resultadoPathPdf : String = ""
   private var A16resultadoPathCsv : String = ""
   private var pr_default : GXDataStoreProvider = GXDataStoreProvider()
   private var AV7GXM1WorkWithDevicesResultado_Resultado_Section_GeneralSdt : SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt = SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt()
}

@objc( workwithdevicesresultado_resultado_section_general__default )
final  class workwithdevicesresultado_resultado_section_general__default: GXDataStoreHelperBase
{
   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         case 0: return ForEachCursor("P00002", "SELECT [resultadoId] AS resultadoId, [resultadoFicha] AS resultadoFicha, [resultadoComentarios] AS resultadoComentarios, [resultadoUserId] AS resultadoUserId, [resultadoTypeId] AS resultadoTypeId, [resultadoIdNetUsuario] AS resultadoIdNetUsuario, [resultadoFechaCreado] AS resultadoFechaCreado, [resultadoFechaEmision] AS resultadoFechaEmision, [resultadoPathExcel] AS resultadoPathExcel, [resultadoPathPdf] AS resultadoPathPdf, [resultadoPathCsv] AS resultadoPathCsv, [resultadoIdEstado] AS resultadoIdEstado, [resultadoIdLibro] AS resultadoIdLibro, [resultadoIdNetTipoinforme] AS resultadoIdNetTipoinforme, [resultadoEliminado] AS resultadoEliminado, [resultadoAbonado] AS resultadoAbonado FROM [Resultado] WHERE [resultadoId] = ? ORDER BY [resultadoId]  LIMIT 1")
         default: return nil
      }
   }

}

