/*
               File: type_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item
        Description: WorkWithDevicesResultado_Resultado_List_Grid1Sdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:55.71
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item )
public final  class SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item: GXUserType
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
            if ( GXutil.strcmp2( oReader.localName, "resultadoId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaCreado") )
            {
               if ( ( GXutil.strcmp(oReader.value, "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = Date.gxDateFromSOAPValue(oReader.value)
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFicha") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "Imagen") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "Imagen_GXI") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "Estado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = oReader.value
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
         sName = "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item"
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
      oWriter.writeElement("resultadoId", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      sDateCnv = ""
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      oWriter.writeElement("resultadoFechaCreado", value:sDateCnv)
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoFicha", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("Imagen", value:gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("Imagen_GXI", value:gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("Estado", value:gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeEndElement()
   }

   public func getnumericvalue( _ value: String ) -> Decimal
   {
      return value.gxDecimalValueWithSeparator(".")
   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = newValue
            setDirty("Resultadoid")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado: Date
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado ?? Date.gxEmpty()
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = newValue
            setDirty("Resultadofechacreado")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = newValue
            setDirty("Resultadoficha")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = newValue
            setDirty("Imagen")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = newValue
            setDirty("Imagen_gxi")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = newValue
            setDirty("Estado")
         }
      }

   }

   public func initialize( )
   {
      sTagName = ""
      sDateCnv = ""
      sNumToPad = ""
   }

   public func clone( ) -> SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item
   {
      return self.copy() as! SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item
   }

    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha : Int64?
    var sTagName : String = ""
    var sDateCnv : String = ""
    var sNumToPad : String = ""
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado : Date?
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi : String?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado : String?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen : String?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["WorkWithDevicesResultado_Resultado_List_Grid1Sdt", "Item"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["resultadoId"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid"
      dict["resultadoFechaCreado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado"
      dict["resultadoFicha"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha"
      dict["Imagen"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen"
      dict["Imagen_GXI"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi"
      dict["Estado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado" {
         if let value = value as? Date {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado = value
         }
      }
   }

}

