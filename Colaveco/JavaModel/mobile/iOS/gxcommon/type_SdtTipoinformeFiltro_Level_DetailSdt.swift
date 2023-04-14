/*
               File: type_SdtTipoinformeFiltro_Level_DetailSdt
        Description: TipoinformeFiltro_Level_DetailSdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:50.20
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtTipoinformeFiltro_Level_DetailSdt )
public final  class SdtTipoinformeFiltro_Level_DetailSdt: GXUserType
{
   public override init( )
   {
      super.init()
   }

   public func initialize( )
   {
   }

   public func clone( ) -> SdtTipoinformeFiltro_Level_DetailSdt
   {
      return self.copy() as! SdtTipoinformeFiltro_Level_DetailSdt
   }


   @objc public override var sdtLevelPathNames: [String]
   {
      return ["TipoinformeFiltro_Level_DetailSdt"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      return [:]
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
   }

}

