/*
               File: type_SdtWorkWithDevicesResultado_Resultado_ListSdt
        Description: WorkWithDevicesResultado_Resultado_ListSdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:55.69
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtWorkWithDevicesResultado_Resultado_ListSdt )
public final  class SdtWorkWithDevicesResultado_Resultado_ListSdt: GXUserType
{
   public override init( )
   {
      super.init()
   }

   public func initialize( )
   {
   }

   public func clone( ) -> SdtWorkWithDevicesResultado_Resultado_ListSdt
   {
      return self.copy() as! SdtWorkWithDevicesResultado_Resultado_ListSdt
   }


   @objc public override var sdtLevelPathNames: [String]
   {
      return ["WorkWithDevicesResultado_Resultado_ListSdt"]
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

