/*
               File: DPTipoinforme
        Description: DPTipoinforme
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:49.90
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( dptipoinforme )
public final  class dptipoinforme: GXProcedure
{
   @objc public func executeFlexibleClient( _ inout_aP0: AutoreleasingUnsafeMutablePointer<GXObjectCollection?> )
   {
      let aP0: GXObjectCollection? = inout_aP0.pointee
      var iP0: GXObjectCollection = (aP0 == nil) ? GXObjectCollection() : aP0! as GXObjectCollection
      execute(&iP0)
      inout_aP0.pointee  = iP0 as GXObjectCollection?
   }

   public func executeUdp( ) -> GXObjectCollection
   {
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.Gxm2rootcol
   }

   public func execute( _ aP0: inout GXObjectCollection )
   {
      execute_int(&aP0)
   }

   private func execute_int( _ aP0: inout GXObjectCollection )
   {
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP0 = self.Gxm2rootcol
   }

   private func privateExecute( )
   {
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Todos"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(1)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Control Lechero"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(3)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Agua"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(4)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Aislamiento y Antibiograma"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(5)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "PAL"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(6)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Parasitología"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(7)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Alimentos"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(8)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Serología"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(9)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Patología"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(10)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Calidad de leche"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(11)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Ambiental"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(12)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Lactómetro - Chequeos"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(13)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Nutrición"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(14)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Suelos"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(15)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Bruselosis en leche"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(16)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Efluentes"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(17)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Bacteriología de tanque"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(18)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Bacteriología clínica aeróbica"
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(19)
      Gxm1sdttipoinforme.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = "Foliares"
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
      Gxm2rootcol = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
      Gxm1sdttipoinforme = SdtSDTTipoinforme_SDTTipoinformeItem()
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var Gx_err : Int = 0
   private var Gxm2rootcol : GXObjectCollection = GXObjectCollection()
   private var Gxm1sdttipoinforme : SdtSDTTipoinforme_SDTTipoinformeItem = SdtSDTTipoinforme_SDTTipoinformeItem()
}

