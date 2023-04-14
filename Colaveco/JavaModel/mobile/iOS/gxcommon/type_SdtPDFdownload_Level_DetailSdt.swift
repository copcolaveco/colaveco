/*
               File: type_SdtPDFdownload_Level_DetailSdt
        Description: PDFdownload_Level_DetailSdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:52:17.10
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtPDFdownload_Level_DetailSdt )
public final  class SdtPDFdownload_Level_DetailSdt: GXUserType
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
            if ( GXutil.strcmp2( oReader.localName, "Destfile") )
            {
               gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = oReader.value
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
         sName = "PDFdownload_Level_DetailSdt"
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
      oWriter.writeElement("Destfile", value:gxTv_SdtPDFdownload_Level_DetailSdt_Destfile.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeEndElement()
   }

   @objc public var gxTv_SdtPDFdownload_Level_DetailSdt_Destfile: String
   {
      get {
         return _gxTv_SdtPDFdownload_Level_DetailSdt_Destfile ?? ""
      }

      set {
         if ( _gxTv_SdtPDFdownload_Level_DetailSdt_Destfile != newValue )
         {
            _gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = newValue
            setDirty("Destfile")
         }
      }

   }

   public func initialize( )
   {
      sTagName = ""
   }

   public func clone( ) -> SdtPDFdownload_Level_DetailSdt
   {
      return self.copy() as! SdtPDFdownload_Level_DetailSdt
   }

    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var sTagName : String = ""
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtPDFdownload_Level_DetailSdt_Destfile : String?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["PDFdownload_Level_DetailSdt"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["Destfile"] = "gxTv_SdtPDFdownload_Level_DetailSdt_Destfile"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtPDFdownload_Level_DetailSdt_Destfile" {
         return self.gxTv_SdtPDFdownload_Level_DetailSdt_Destfile
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtPDFdownload_Level_DetailSdt_Destfile" {
         if let value = value as? String {
            self.gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = value
         }
      }
   }

}

