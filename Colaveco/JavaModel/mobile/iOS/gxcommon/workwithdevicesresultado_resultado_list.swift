/*
               File: WorkWithDevicesResultado_Resultado_List
        Description: WorkWithDevicesResultado_Resultado_List
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:56.4
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( workwithdevicesresultado_resultado_list )
public final  class workwithdevicesresultado_resultado_list: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ aP2: NSNumber? ,
                                            _ inout_aP3: AutoreleasingUnsafeMutablePointer<SdtWorkWithDevicesResultado_Resultado_ListSdt?> )
   {
      let aP3: SdtWorkWithDevicesResultado_Resultado_ListSdt? = inout_aP3.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int64 = (aP1 == nil) ? 0 : aP1!.int64Value as Int64
      let iP2: Int = (aP2 == nil) ? 0 : aP2!.intValue as Int
      var iP3: SdtWorkWithDevicesResultado_Resultado_ListSdt = (aP3 == nil) ? SdtWorkWithDevicesResultado_Resultado_ListSdt() : aP3! as SdtWorkWithDevicesResultado_Resultado_ListSdt
      execute(iP0, iP1, iP2, &iP3)
      inout_aP3.pointee  = iP3 as SdtWorkWithDevicesResultado_Resultado_ListSdt?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int64 ,
                           _ aP2: Int ) -> SdtWorkWithDevicesResultado_Resultado_ListSdt
   {
      self.AV7ExternalId = aP0
      self.AV8TipoinformeId = aP1
      self.AV17gxid = aP2
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int64 ,
                        _ aP2: Int ,
                        _ aP3: inout SdtWorkWithDevicesResultado_Resultado_ListSdt )
   {
      execute_int(aP0, aP1, aP2, &aP3)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int64 ,
                             _ aP2: Int ,
                             _ aP3: inout SdtWorkWithDevicesResultado_Resultado_ListSdt )
   {
      self.AV7ExternalId = aP0
      self.AV8TipoinformeId = aP1
      self.AV17gxid = aP2
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP3 = self.AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV17gxid), totalLength:8, decimals:0)
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV23Imagen_GXI)
         Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado)
         Gxwebsession.setValue(Gxids, "true")
      }
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
      AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt = SdtWorkWithDevicesResultado_Resultado_ListSdt()
      Gxids = ""
      Gxwebsession = GXOfflineSession.sharedInstance()
      AV23Imagen_GXI = ""
      AV5estado = ""
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV17gxid : Int = 0
   private var Gx_err : Int = 0
   private var AV7ExternalId : Int64 = 0
   private var AV8TipoinformeId : Int64 = 0
   private var Gxids : String = ""
   private var AV23Imagen_GXI : String = ""
   private var AV5estado : String = ""
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt : SdtWorkWithDevicesResultado_Resultado_ListSdt = SdtWorkWithDevicesResultado_Resultado_ListSdt()
}

