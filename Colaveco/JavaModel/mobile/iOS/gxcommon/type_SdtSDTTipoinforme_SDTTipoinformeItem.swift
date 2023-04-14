/*
               File: type_SdtSDTTipoinforme_SDTTipoinformeItem
        Description: SDTTipoinforme
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:50.16
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtSDTTipoinforme_SDTTipoinformeItem )
public final  class SdtSDTTipoinforme_SDTTipoinformeItem: GXUserType
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
            if ( GXutil.strcmp2( oReader.localName, "SDTTipoinformeId") )
            {
               gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "SDTTipoinformeNombre") )
            {
               gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
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
         sName = "SDTTipoinforme.SDTTipoinformeItem"
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
      oWriter.writeElement("SDTTipoinformeId", value:String.gxStringFromNumber(Decimal(gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("SDTTipoinformeNombre", value:gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeEndElement()
   }

   public func getnumericvalue( _ value: String ) -> Decimal
   {
      return value.gxDecimalValueWithSeparator(".")
   }

   @objc public var gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid: Int64
   {
      get {
         return _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid ?? 0
      }

      set {
         if ( _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid != newValue )
         {
            _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = newValue
            setDirty("Sdttipoinformeid")
         }
      }

   }

   @objc public var gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre: String
   {
      get {
         return _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre ?? ""
      }

      set {
         if ( _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre != newValue )
         {
            _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = newValue
            setDirty("Sdttipoinformenombre")
         }
      }

   }

   public func initialize( )
   {
      sTagName = ""
   }

   public func clone( ) -> SdtSDTTipoinforme_SDTTipoinformeItem
   {
      return self.copy() as! SdtSDTTipoinforme_SDTTipoinformeItem
   }

    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid : Int64?
    var sTagName : String = ""
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre : String?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["SDTTipoinforme", "SDTTipoinformeItem"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["SDTTipoinformeId"] = "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid"
      dict["SDTTipoinformeNombre"] = "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid" {
         return NSNumber(value: self.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid)
      }
      if propName == "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre" {
         return self.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid = value.int64Value
         }
      }
      if propName == "gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre" {
         if let value = value as? String {
            self.gxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre = value
         }
      }
   }

}

