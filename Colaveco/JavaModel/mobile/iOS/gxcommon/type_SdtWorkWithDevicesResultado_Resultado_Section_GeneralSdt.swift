/*
               File: type_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt
        Description: WorkWithDevicesResultado_Resultado_Section_GeneralSdt
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:55.78
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt )
public final  class SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt: GXUserType
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
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFicha") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoComentarios") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoUserId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoTypeId") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetUsuario") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = Int64(getnumericvalue(oReader.value))
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
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = Date.gxDateFromSOAPValue(oReader.value)
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaEmision") )
            {
               if ( ( GXutil.strcmp(oReader.value, "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = Date.gxDateFromSOAPValue(oReader.value)
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathExcel") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathPdf") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathCsv") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdEstado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdLibro") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoEliminado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoAbonado") )
            {
               gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = Int64(getnumericvalue(oReader.value))
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
         sName = "WorkWithDevicesResultado_Resultado_Section_GeneralSdt"
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
      oWriter.writeElement("resultadoId", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoFicha", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoComentarios", value:gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoUserId", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoTypeId", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoIdNetUsuario", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      sDateCnv = ""
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      oWriter.writeElement("resultadoFechaCreado", value:sDateCnv)
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      sDateCnv = ""
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      oWriter.writeElement("resultadoFechaEmision", value:sDateCnv)
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoPathExcel", value:gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoPathPdf", value:gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoPathCsv", value:gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoIdEstado", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoIdLibro", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoEliminado", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado), totalLength:1, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"http://tempuri.org/")
      }
      oWriter.writeElement("resultadoAbonado", value:String.gxStringFromNumber(Decimal(gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado), totalLength:18, decimals:0).gxStringByTrimming())
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

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = newValue
            setDirty("Resultadoid")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = newValue
            setDirty("Resultadoficha")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = newValue
            setDirty("Resultadocomentarios")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = newValue
            setDirty("Resultadouserid")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = newValue
            setDirty("Resultadotypeid")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = newValue
            setDirty("Resultadoidnetusuario")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado: Date
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado ?? Date.gxEmpty()
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = newValue
            setDirty("Resultadofechacreado")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision: Date
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision ?? Date.gxEmpty()
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = newValue
            setDirty("Resultadofechaemision")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = newValue
            setDirty("Resultadopathexcel")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = newValue
            setDirty("Resultadopathpdf")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv: String
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv ?? ""
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = newValue
            setDirty("Resultadopathcsv")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = newValue
            setDirty("Resultadoidestado")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = newValue
            setDirty("Resultadoidlibro")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = newValue
            setDirty("Resultadoidnettipoinforme")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado: Int
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = newValue
            setDirty("Resultadoeliminado")
         }
      }

   }

   @objc public var gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado: Int64
   {
      get {
         return _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado ?? 0
      }

      set {
         if ( _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado != newValue )
         {
            _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = newValue
            setDirty("Resultadoabonado")
         }
      }

   }

   public func initialize( )
   {
      sTagName = ""
      sDateCnv = ""
      sNumToPad = ""
   }

   public func clone( ) -> SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt
   {
      return self.copy() as! SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt
   }

    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado : Int?
    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme : Int64?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado : Int64?
    var sTagName : String = ""
    var sDateCnv : String = ""
    var sNumToPad : String = ""
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado : Date?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision : Date?
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios : String?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel : String?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf : String?
    var _gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv : String?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["WorkWithDevicesResultado_Resultado_Section_GeneralSdt"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["resultadoId"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid"
      dict["resultadoFicha"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha"
      dict["resultadoComentarios"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios"
      dict["resultadoUserId"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid"
      dict["resultadoTypeId"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid"
      dict["resultadoIdNetUsuario"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario"
      dict["resultadoFechaCreado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado"
      dict["resultadoFechaEmision"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision"
      dict["resultadoPathExcel"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel"
      dict["resultadoPathPdf"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf"
      dict["resultadoPathCsv"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv"
      dict["resultadoIdEstado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado"
      dict["resultadoIdLibro"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro"
      dict["resultadoIdNetTipoinforme"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme"
      dict["resultadoEliminado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado"
      dict["resultadoAbonado"] = "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv" {
         return self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado)
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado" {
         return NSNumber(value: self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado)
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoid = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoficha = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadocomentarios = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadouserid = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadotypeid = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnetusuario = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado" {
         if let value = value as? Date {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechacreado = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision" {
         if let value = value as? Date {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadofechaemision = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathexcel = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathpdf = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv" {
         if let value = value as? String {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadopathcsv = value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidestado = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidlibro = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoidnettipoinforme = value.int64Value
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoeliminado = value.intValue
         }
      }
      if propName == "gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtWorkWithDevicesResultado_Resultado_Section_GeneralSdt_Resultadoabonado = value.int64Value
         }
      }
   }

}

