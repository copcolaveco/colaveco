/*
               File: TipoinformeFiltro_Level_Detail
        Description: TipoinformeFiltro_Level_Detail
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:52.33
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( tipoinformefiltro_level_detail )
public final  class tipoinformefiltro_level_detail: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ inout_aP2: AutoreleasingUnsafeMutablePointer<SdtTipoinformeFiltro_Level_DetailSdt?> )
   {
      let aP2: SdtTipoinformeFiltro_Level_DetailSdt? = inout_aP2.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int = (aP1 == nil) ? 0 : aP1!.intValue as Int
      var iP2: SdtTipoinformeFiltro_Level_DetailSdt = (aP2 == nil) ? SdtTipoinformeFiltro_Level_DetailSdt() : aP2! as SdtTipoinformeFiltro_Level_DetailSdt
      execute(iP0, iP1, &iP2)
      inout_aP2.pointee  = iP2 as SdtTipoinformeFiltro_Level_DetailSdt?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int ) -> SdtTipoinformeFiltro_Level_DetailSdt
   {
      self.AV5TipoInformeId = aP0
      self.AV7gxid = aP1
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV10GXM1TipoinformeFiltro_Level_DetailSdt
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int ,
                        _ aP2: inout SdtTipoinformeFiltro_Level_DetailSdt )
   {
      execute_int(aP0, aP1, &aP2)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int ,
                             _ aP2: inout SdtTipoinformeFiltro_Level_DetailSdt )
   {
      self.AV5TipoInformeId = aP0
      self.AV7gxid = aP1
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP2 = self.AV10GXM1TipoinformeFiltro_Level_DetailSdt
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV7gxid), totalLength:8, decimals:0)
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList
         dptipoinforme().execute( &GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1)
         AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1
         Gxwebsession.setObject(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList)
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
      AV10GXM1TipoinformeFiltro_Level_DetailSdt = SdtTipoinformeFiltro_Level_DetailSdt()
      Gxids = ""
      Gxwebsession = GXOfflineSession.sharedInstance()
      AV6TipoinformeList = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV7gxid : Int = 0
   private var Gx_err : Int = 0
   private var AV5TipoInformeId : Int64 = 0
   private var Gxids : String = ""
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV6TipoinformeList : GXObjectCollection = GXObjectCollection()
   private var GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 : GXObjectCollection = GXObjectCollection()
   private var AV10GXM1TipoinformeFiltro_Level_DetailSdt : SdtTipoinformeFiltro_Level_DetailSdt = SdtTipoinformeFiltro_Level_DetailSdt()
}

