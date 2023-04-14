/*
               File: WorkWithDevicesResultado_Resultado_Detail
        Description: WorkWithDevicesResultado_Resultado_Detail
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:55.96
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( workwithdevicesresultado_resultado_detail )
public final  class workwithdevicesresultado_resultado_detail: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ inout_aP2: AutoreleasingUnsafeMutablePointer<SdtWorkWithDevicesResultado_Resultado_DetailSdt?> )
   {
      let aP2: SdtWorkWithDevicesResultado_Resultado_DetailSdt? = inout_aP2.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int = (aP1 == nil) ? 0 : aP1!.intValue as Int
      var iP2: SdtWorkWithDevicesResultado_Resultado_DetailSdt = (aP2 == nil) ? SdtWorkWithDevicesResultado_Resultado_DetailSdt() : aP2! as SdtWorkWithDevicesResultado_Resultado_DetailSdt
      execute(iP0, iP1, &iP2)
      inout_aP2.pointee  = iP2 as SdtWorkWithDevicesResultado_Resultado_DetailSdt?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int ) -> SdtWorkWithDevicesResultado_Resultado_DetailSdt
   {
      self.A1resultadoId = aP0
      self.AV6gxid = aP1
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int ,
                        _ aP2: inout SdtWorkWithDevicesResultado_Resultado_DetailSdt )
   {
      execute_int(aP0, aP1, &aP2)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int ,
                             _ aP2: inout SdtWorkWithDevicesResultado_Resultado_DetailSdt )
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
      aP2 = self.AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV6gxid), totalLength:8, decimals:0)
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
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
            Gxdynprop1 = String.gxStringFromNumber(Decimal(A7resultadoFicha), totalLength:18, decimals:0)
            Gxdynprop = Gxdynprop  +  (( GXutil.strcmp(Gxdynprop, "") == 0 )  ? "" : ", ")  +  "[\"Form\",\"Caption\",\""  +  Gxdynprop1.gxJSONEncode()  +  "\"]"
            /* Exiting from a For First loop. */
            break
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true")
      }
      AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt.gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = "[ "+Gxdynprop+" ]"
      Gxdynprop = ""
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
      AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt = SdtWorkWithDevicesResultado_Resultado_DetailSdt()
      Gxids = ""
      Gxwebsession = GXOfflineSession.sharedInstance()
      scmdbuf = ""
      Gxdynprop1 = ""
      Gxdynprop = ""
      pr_default = GXDataStoreProvider(workwithdevicesresultado_resultado_detail__default(),
         [
         ]
      );
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV6gxid : Int = 0
   private var Gx_err : Int = 0
   private var A1resultadoId : Int64 = 0
   private var A7resultadoFicha : Int64 = 0
   private var Gxids : String = ""
   private var scmdbuf : String = ""
   private var Gxdynprop1 : String = ""
   private var n7resultadoFicha : Bool = false
   private var Gxdynprop : String = ""
   private var pr_default : GXDataStoreProvider = GXDataStoreProvider()
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV11GXM2WorkWithDevicesResultado_Resultado_DetailSdt : SdtWorkWithDevicesResultado_Resultado_DetailSdt = SdtWorkWithDevicesResultado_Resultado_DetailSdt()
}

@objc( workwithdevicesresultado_resultado_detail__default )
final  class workwithdevicesresultado_resultado_detail__default: GXDataStoreHelperBase
{
   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         case 0: return ForEachCursor("P00002", "SELECT [resultadoId] AS resultadoId, [resultadoFicha] AS resultadoFicha FROM [Resultado] WHERE [resultadoId] = ? ORDER BY [resultadoId] ")
         default: return nil
      }
   }

}

