/*
               File: type_SdtWorkWithDevicesResultado_Resultado_DetailSdt
        Description: WorkWithDevicesResultado_Resultado_DetailSdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:55.65
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtWorkWithDevicesResultado_Resultado_DetailSdt )
public final  class SdtWorkWithDevicesResultado_Resultado_DetailSdt: GXUserType
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
            if ( GXutil.strcmp2( oReader.localName, "Gxdynprop") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = oReader.value
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
         sName = "WorkWithDevicesResultado_Resultado_DetailSdt"
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
      oWriter.writeElement("Gxdynprop", value:gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeEndElement()
   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = newValue
            setDirty("Gxdynprop")
         }
      }

   }

   public func initialize( )
   {
      sTagName = ""
   }

   public func clone( ) -> SdtWorkWithDevicesResultado_Resultado_DetailSdt
   {
      return self.copy() as! SdtWorkWithDevicesResultado_Resultado_DetailSdt
   }

    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop : String?
    var sTagName : String = ""
    var readElement : Bool = false
    var formatError : Bool = false

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["WorkWithDevicesResultado_Resultado_DetailSdt"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["Gxdynprop"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_DetailSdt_Gxdynprop = value
         }
      }
   }

}

