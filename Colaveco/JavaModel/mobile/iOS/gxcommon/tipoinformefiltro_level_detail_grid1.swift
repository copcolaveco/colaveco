/*
               File: TipoinformeFiltro_Level_Detail_Grid1
        Description: TipoinformeFiltro_Level_Detail_Grid1
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:52.37
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( tipoinformefiltro_level_detail_grid1 )
public final  class tipoinformefiltro_level_detail_grid1: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSNumber? ,
                                            _ aP2: NSNumber? ,
                                            _ aP3: NSNumber? ,
                                            _ inout_aP4: AutoreleasingUnsafeMutablePointer<GXObjectCollection?> )
   {
      let aP4: GXObjectCollection? = inout_aP4.pointee
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: Int64 = (aP1 == nil) ? 0 : aP1!.int64Value as Int64
      let iP2: Int64 = (aP2 == nil) ? 0 : aP2!.int64Value as Int64
      let iP3: Int = (aP3 == nil) ? 0 : aP3!.intValue as Int
      var iP4: GXObjectCollection = (aP4 == nil) ? GXObjectCollection() : aP4! as GXObjectCollection
      execute(iP0, iP1, iP2, iP3, &iP4)
      inout_aP4.pointee  = iP4 as GXObjectCollection?
   }

   public func executeUdp( _ aP0: Int64 ,
                           _ aP1: Int64 ,
                           _ aP2: Int64 ,
                           _ aP3: Int ) -> GXObjectCollection
   {
      self.AV5TipoInformeId = aP0
      self.AV10start = aP1
      self.AV11count = aP2
      self.AV7gxid = aP3
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV13GXM3RootCol
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: Int64 ,
                        _ aP2: Int64 ,
                        _ aP3: Int ,
                        _ aP4: inout GXObjectCollection )
   {
      execute_int(aP0, aP1, aP2, aP3, &aP4)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: Int64 ,
                             _ aP2: Int64 ,
                             _ aP3: Int ,
                             _ aP4: inout GXObjectCollection )
   {
      self.AV5TipoInformeId = aP0
      self.AV10start = aP1
      self.AV11count = aP2
      self.AV7gxid = aP3
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP4 = self.AV13GXM3RootCol
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV7gxid), totalLength:8, decimals:0)
      AV6TipoinformeList = (Gxwebsession.getObject(Gxids+"gxvar_Tipoinformelist")  as! GXObjectCollection)
      AV12GXV1SkipCount = Int((-1) *  ( AV10start ) )
      AV12GXV1SkipCount = AV12GXV1SkipCount + 1
      if ( AV12GXV1SkipCount > 0 )
      {
         AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item()
         AV13GXM3RootCol.add(AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt, 0)
         if ( AV10start == Int64(0) )
         {
            GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = AV6TipoinformeList
            dptipoinforme().execute( &GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1)
            AV6TipoinformeList = GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1
         }
         AV17GXV1 = 1
         while ( AV17GXV1 <= AV6TipoinformeList.itemCount )
         {
            AV6TipoinformeList.currentItem = (AV6TipoinformeList.elementAt(AV17GXV1) as! SdtSDTTipoinforme_SDTTipoinformeItem)
            AV17GXV1 = AV17GXV1 + 1
         }
         AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt.gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = AV6TipoinformeList
      }
      Gxwebsession.setObject(Gxids+"gxvar_Tipoinformelist", AV6TipoinformeList)
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
      AV13GXM3RootCol = GXObjectCollection(typeName: "SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item")
      Gxids = ""
      AV6TipoinformeList = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
      Gxwebsession = GXOfflineSession.sharedInstance()
      AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt = SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item()
      GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV7gxid : Int = 0
   private var AV12GXV1SkipCount : Int = 0
   private var AV17GXV1 : Int = 0
   private var Gx_err : Int = 0
   private var AV5TipoInformeId : Int64 = 0
   private var AV10start : Int64 = 0
   private var AV11count : Int64 = 0
   private var Gxids : String = ""
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV13GXM3RootCol : GXObjectCollection = GXObjectCollection()
   private var AV6TipoinformeList : GXObjectCollection = GXObjectCollection()
   private var GXt_objcol_SdtSDTTipoinforme_SDTTipoinformeItem1 : GXObjectCollection = GXObjectCollection()
   private var AV14GXM2TipoinformeFiltro_Level_Detail_Grid1Sdt : SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item = SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item()
}

