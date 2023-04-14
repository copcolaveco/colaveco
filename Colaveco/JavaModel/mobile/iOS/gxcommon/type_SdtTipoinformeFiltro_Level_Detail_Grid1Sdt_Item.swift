/*
               File: type_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item
        Description: TipoinformeFiltro_Level_Detail_Grid1Sdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:50.21
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item )
public final  class SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item: GXUserType
{
   public override init( )
   {
      super.init()
   }

   public override func readxml( _ oReader: GXXMLReader ,
                                 _ sName: String ) -> Int
   {
      var GXSoapError : Int = 1
      formatError = false
      sTagName = oReader.name
      if ( oReader.isSimple == 0 )
      {
         GXSoapError = oReader.read()
         nOutParmCount = 0
         while ( ( ( GXutil.strcmp(oReader.name, sTagName) != 0 ) || ( oReader.nodeType == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = 0
            readElement = false
            if ( GXutil.strcmp2( oReader.localName, "Tipoinformelist") )
            {
               if ( ( oReader.isSimple == 0 ) || ( oReader.attributeCount > 0 ) )
               {
                  GXSoapError = gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.readxml(oReader, "Tipoinformelist")
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               if ( GXutil.strcmp2( oReader.localName, "Tipoinformelist") )
               {
                  GXSoapError = oReader.read()
               }
            }
            if ( !readElement )
            {
               readOk = 1
               GXSoapError = oReader.read()
            }
            nOutParmCount = nOutParmCount + 1
            if ( ( readOk == 0 ) || formatError )
            {
               sSOAPErrMsg = sSOAPErrMsg  +  "Error reading "  +  sTagName  +  String.gxNewLine()
               sSOAPErrMsg = sSOAPErrMsg  +  "Message: "  +  oReader.readRawXML()
               GXSoapError = nOutParmCount * -1
            }
         }
      }
      return GXSoapError
   }

   public override func writexml( _ oWriter: GXXMLWriter ,
                                  _ pSName: String ,
                                  _ pSNameSpace: String )
   {
      let sName = pSName
      let sNameSpace = pSNameSpace
      writexml(oWriter, sName, sNameSpace, true)
   }

   public override func writexml( _ oWriter: GXXMLWriter ,
                                  _ pSName: String ,
                                  _ pSNameSpace: String ,
                                  _ sIncludeState: Bool )
   {
      var sName = pSName
      var sNameSpace = pSNameSpace
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item"
      }
      oWriter.writeStartElement(sName)
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:sNameSpace)
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, sNameSpace.gxLength()-10)
      }
      if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist != GXObjectCollection() )
      {
         var sNameSpace1 : String
         if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") == 0 )
         {
            sNameSpace1 = "[*:nosend]"  +  "http://tempuri.org/"
         }
         else
         {
            sNameSpace1 = "http://tempuri.org/"
         }
         gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.writexml(oWriter, "Tipoinformelist", sNameSpace1, sIncludeState)
      }
      oWriter.writeEndElement()
   }

   @objc public var gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist: GXObjectCollection
   {
      get {
         if ( _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist == nil )
         {
            _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = GXObjectCollection(typeName: "SdtSDTTipoinforme_SDTTipoinformeItem")
         }
         return _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist ?? GXObjectCollection()
      }

      set {
         if ( _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist != newValue )
         {
            _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = newValue
            setDirty("Tipoinformelist")
         }
      }

   }

   public func setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist_SetNull( )
   {
      _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = nil
   }

   public func getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist_IsNull( ) -> Bool
   {
      return (_gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist==nil)
   }

   public func initialize( )
   {
      sTagName = ""
   }

   public func clone( ) -> SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item
   {
      return self.copy() as! SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item
   }

    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var sTagName : String = ""
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist : GXObjectCollection?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["TipoinformeFiltro_Level_Detail_Grid1Sdt", "Item"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["Tipoinformelist"] = "gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist" {
         return self.gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist" {
         if let value = value as? GXObjectCollection {
            self.gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = value
         }
      }
   }

}

