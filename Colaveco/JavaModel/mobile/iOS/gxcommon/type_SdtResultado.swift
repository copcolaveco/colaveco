/*
               File: type_SdtResultado
        Description: Resultado
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:51.31
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( SdtResultado )
public final  class SdtResultado: GXSdtBusinessComponent
{
   public override init( )
   {
      super.init()
      initialize( )
   }

   public override func getMetadata( ) -> GXProperties
   {
      let metadata : GXProperties = GXProperties()
      metadata.set("Name", "Resultado")
      metadata.set("BT", "Resultado")
      metadata.set("PK", "[ \"resultadoId\" ]")
      metadata.set("AllowInsert", "True")
      metadata.set("AllowUpdate", "True")
      metadata.set("AllowDelete", "True")
      return metadata
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
               gxTv_SdtResultado_Resultadoid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFicha") )
            {
               gxTv_SdtResultado_Resultadoficha = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoComentarios") )
            {
               gxTv_SdtResultado_Resultadocomentarios = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoUserId") )
            {
               gxTv_SdtResultado_Resultadouserid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoTypeId") )
            {
               gxTv_SdtResultado_Resultadotypeid = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetUsuario") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario = Int64(getnumericvalue(oReader.value))
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
                  gxTv_SdtResultado_Resultadofechacreado = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado = Date.gxDateFromSOAPValue(oReader.value)
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
                  gxTv_SdtResultado_Resultadofechaemision = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision = Date.gxDateFromSOAPValue(oReader.value)
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
               gxTv_SdtResultado_Resultadopathexcel = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathPdf") )
            {
               gxTv_SdtResultado_Resultadopathpdf = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathCsv") )
            {
               gxTv_SdtResultado_Resultadopathcsv = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdEstado") )
            {
               gxTv_SdtResultado_Resultadoidestado = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdLibro") )
            {
               gxTv_SdtResultado_Resultadoidlibro = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoEliminado") )
            {
               gxTv_SdtResultado_Resultadoeliminado = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoAbonado") )
            {
               gxTv_SdtResultado_Resultadoabonado = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "Mode") )
            {
               gxTv_SdtResultado_Mode = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "Initialized") )
            {
               gxTv_SdtResultado_Initialized = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoId_Z") )
            {
               gxTv_SdtResultado_Resultadoid_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFicha_Z") )
            {
               gxTv_SdtResultado_Resultadoficha_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoComentarios_Z") )
            {
               gxTv_SdtResultado_Resultadocomentarios_Z = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoUserId_Z") )
            {
               gxTv_SdtResultado_Resultadouserid_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoTypeId_Z") )
            {
               gxTv_SdtResultado_Resultadotypeid_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetUsuario_Z") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaCreado_Z") )
            {
               if ( ( GXutil.strcmp(oReader.value, "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = Date.gxDateFromSOAPValue(oReader.value)
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaEmision_Z") )
            {
               if ( ( GXutil.strcmp(oReader.value, "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = Date.gxEmpty()
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = Date.gxDateFromSOAPValue(oReader.value)
               }
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathExcel_Z") )
            {
               gxTv_SdtResultado_Resultadopathexcel_Z = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathPdf_Z") )
            {
               gxTv_SdtResultado_Resultadopathpdf_Z = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathCsv_Z") )
            {
               gxTv_SdtResultado_Resultadopathcsv_Z = oReader.value
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdEstado_Z") )
            {
               gxTv_SdtResultado_Resultadoidestado_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdLibro_Z") )
            {
               gxTv_SdtResultado_Resultadoidlibro_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetTipoinforme_Z") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoEliminado_Z") )
            {
               gxTv_SdtResultado_Resultadoeliminado_Z = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoAbonado_Z") )
            {
               gxTv_SdtResultado_Resultadoabonado_Z = Int64(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFicha_N") )
            {
               gxTv_SdtResultado_Resultadoficha_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoComentarios_N") )
            {
               gxTv_SdtResultado_Resultadocomentarios_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoUserId_N") )
            {
               gxTv_SdtResultado_Resultadouserid_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoTypeId_N") )
            {
               gxTv_SdtResultado_Resultadotypeid_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdNetUsuario_N") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaCreado_N") )
            {
               gxTv_SdtResultado_Resultadofechacreado_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoFechaEmision_N") )
            {
               gxTv_SdtResultado_Resultadofechaemision_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathExcel_N") )
            {
               gxTv_SdtResultado_Resultadopathexcel_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathPdf_N") )
            {
               gxTv_SdtResultado_Resultadopathpdf_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoPathCsv_N") )
            {
               gxTv_SdtResultado_Resultadopathcsv_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdEstado_N") )
            {
               gxTv_SdtResultado_Resultadoidestado_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoIdLibro_N") )
            {
               gxTv_SdtResultado_Resultadoidlibro_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoEliminado_N") )
            {
               gxTv_SdtResultado_Resultadoeliminado_N = Int(getnumericvalue(oReader.value))
               readElement = true
               if ( GXSoapError > 0 )
               {
                  readOk = 1
               }
               GXSoapError = oReader.read()
            }
            if ( GXutil.strcmp2( oReader.localName, "resultadoAbonado_N") )
            {
               gxTv_SdtResultado_Resultadoabonado_N = Int(getnumericvalue(oReader.value))
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
         sName = "Resultado"
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Colaveco"
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
      oWriter.writeElement("resultadoId", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoFicha", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoficha), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoComentarios", value:gxTv_SdtResultado_Resultadocomentarios.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoUserId", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadouserid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoTypeId", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadotypeid), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoIdNetUsuario", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidnetusuario), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      sDateCnv = ""
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      oWriter.writeElement("resultadoFechaCreado", value:sDateCnv)
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      sDateCnv = ""
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      sDateCnv = sDateCnv  +  "-"
      sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
      sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
      oWriter.writeElement("resultadoFechaEmision", value:sDateCnv)
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoPathExcel", value:gxTv_SdtResultado_Resultadopathexcel.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoPathPdf", value:gxTv_SdtResultado_Resultadopathpdf.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoPathCsv", value:gxTv_SdtResultado_Resultadopathcsv.gxStringByTrimmingRight())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoIdEstado", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidestado), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoIdLibro", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidlibro), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidnettipoinforme), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoEliminado", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoeliminado), totalLength:1, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      oWriter.writeElement("resultadoAbonado", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoabonado), totalLength:18, decimals:0).gxStringByTrimming())
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", value:"Colaveco")
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", value:gxTv_SdtResultado_Mode.gxStringByTrimmingRight())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("Initialized", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Initialized), totalLength:4, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoId_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoid_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoFicha_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoficha_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoComentarios_Z", value:gxTv_SdtResultado_Resultadocomentarios_Z.gxStringByTrimmingRight())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoUserId_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadouserid_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoTypeId_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadotypeid_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdNetUsuario_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidnetusuario_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         sDateCnv = ""
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado_Z.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
         sDateCnv = sDateCnv  +  "-"
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado_Z.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
         sDateCnv = sDateCnv  +  "-"
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado_Z.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
         oWriter.writeElement("resultadoFechaCreado_Z", value:sDateCnv)
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         sDateCnv = ""
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision_Z.gxDateYear()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "0000".gxSubstring(1, length:4-sNumToPad.gxLength())  +  sNumToPad
         sDateCnv = sDateCnv  +  "-"
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision_Z.gxDateMonth()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
         sDateCnv = sDateCnv  +  "-"
         sNumToPad = String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision_Z.gxDateDay()), totalLength:10, decimals:0).gxStringByTrimming()
         sDateCnv = sDateCnv  +  "00".gxSubstring(1, length:2-sNumToPad.gxLength())  +  sNumToPad
         oWriter.writeElement("resultadoFechaEmision_Z", value:sDateCnv)
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathExcel_Z", value:gxTv_SdtResultado_Resultadopathexcel_Z.gxStringByTrimmingRight())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathPdf_Z", value:gxTv_SdtResultado_Resultadopathpdf_Z.gxStringByTrimmingRight())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathCsv_Z", value:gxTv_SdtResultado_Resultadopathcsv_Z.gxStringByTrimmingRight())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdEstado_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidestado_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdLibro_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidlibro_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdNetTipoinforme_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidnettipoinforme_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoEliminado_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoeliminado_Z), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoAbonado_Z", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoabonado_Z), totalLength:18, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoFicha_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoficha_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoComentarios_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadocomentarios_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoUserId_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadouserid_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoTypeId_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadotypeid_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdNetUsuario_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidnetusuario_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoFechaCreado_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechacreado_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoFechaEmision_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadofechaemision_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathExcel_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadopathexcel_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathPdf_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadopathpdf_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoPathCsv_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadopathcsv_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdEstado_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidestado_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoIdLibro_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoidlibro_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoEliminado_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoeliminado_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
         oWriter.writeElement("resultadoAbonado_N", value:String.gxStringFromNumber(Decimal(gxTv_SdtResultado_Resultadoabonado_N), totalLength:1, decimals:0).gxStringByTrimming())
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", value:"Colaveco")
         }
      }
      oWriter.writeEndElement()
   }

   public func getnumericvalue( _ value: String ) -> Decimal
   {
      return value.gxDecimalValueWithSeparator(".")
   }

   public func updateDirties( _ sdt: SdtResultado )
   {
      if ( sdt.isDirty("resultadoId") )
      {
         gxTv_SdtResultado_Resultadoid = sdt.gxTv_SdtResultado_Resultadoid
      }
      if ( sdt.isDirty("resultadoFicha") )
      {
         gxTv_SdtResultado_Resultadoficha_N = 0
         gxTv_SdtResultado_Resultadoficha = sdt.gxTv_SdtResultado_Resultadoficha
      }
      if ( sdt.isDirty("resultadoComentarios") )
      {
         gxTv_SdtResultado_Resultadocomentarios_N = 0
         gxTv_SdtResultado_Resultadocomentarios = sdt.gxTv_SdtResultado_Resultadocomentarios
      }
      if ( sdt.isDirty("resultadoUserId") )
      {
         gxTv_SdtResultado_Resultadouserid_N = 0
         gxTv_SdtResultado_Resultadouserid = sdt.gxTv_SdtResultado_Resultadouserid
      }
      if ( sdt.isDirty("resultadoTypeId") )
      {
         gxTv_SdtResultado_Resultadotypeid_N = 0
         gxTv_SdtResultado_Resultadotypeid = sdt.gxTv_SdtResultado_Resultadotypeid
      }
      if ( sdt.isDirty("resultadoIdNetUsuario") )
      {
         gxTv_SdtResultado_Resultadoidnetusuario_N = 0
         gxTv_SdtResultado_Resultadoidnetusuario = sdt.gxTv_SdtResultado_Resultadoidnetusuario
      }
      if ( sdt.isDirty("resultadoFechaCreado") )
      {
         gxTv_SdtResultado_Resultadofechacreado_N = 0
         gxTv_SdtResultado_Resultadofechacreado = sdt.gxTv_SdtResultado_Resultadofechacreado
      }
      if ( sdt.isDirty("resultadoFechaEmision") )
      {
         gxTv_SdtResultado_Resultadofechaemision_N = 0
         gxTv_SdtResultado_Resultadofechaemision = sdt.gxTv_SdtResultado_Resultadofechaemision
      }
      if ( sdt.isDirty("resultadoPathExcel") )
      {
         gxTv_SdtResultado_Resultadopathexcel_N = 0
         gxTv_SdtResultado_Resultadopathexcel = sdt.gxTv_SdtResultado_Resultadopathexcel
      }
      if ( sdt.isDirty("resultadoPathPdf") )
      {
         gxTv_SdtResultado_Resultadopathpdf_N = 0
         gxTv_SdtResultado_Resultadopathpdf = sdt.gxTv_SdtResultado_Resultadopathpdf
      }
      if ( sdt.isDirty("resultadoPathCsv") )
      {
         gxTv_SdtResultado_Resultadopathcsv_N = 0
         gxTv_SdtResultado_Resultadopathcsv = sdt.gxTv_SdtResultado_Resultadopathcsv
      }
      if ( sdt.isDirty("resultadoIdEstado") )
      {
         gxTv_SdtResultado_Resultadoidestado_N = 0
         gxTv_SdtResultado_Resultadoidestado = sdt.gxTv_SdtResultado_Resultadoidestado
      }
      if ( sdt.isDirty("resultadoIdLibro") )
      {
         gxTv_SdtResultado_Resultadoidlibro_N = 0
         gxTv_SdtResultado_Resultadoidlibro = sdt.gxTv_SdtResultado_Resultadoidlibro
      }
      if ( sdt.isDirty("resultadoIdNetTipoinforme") )
      {
         gxTv_SdtResultado_Resultadoidnettipoinforme = sdt.gxTv_SdtResultado_Resultadoidnettipoinforme
      }
      if ( sdt.isDirty("resultadoEliminado") )
      {
         gxTv_SdtResultado_Resultadoeliminado_N = 0
         gxTv_SdtResultado_Resultadoeliminado = sdt.gxTv_SdtResultado_Resultadoeliminado
      }
      if ( sdt.isDirty("resultadoAbonado") )
      {
         gxTv_SdtResultado_Resultadoabonado_N = 0
         gxTv_SdtResultado_Resultadoabonado = sdt.gxTv_SdtResultado_Resultadoabonado
      }
   }

   @objc public var gxTv_SdtResultado_Resultadoid: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoid ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoid != newValue )
         {
            _gxTv_SdtResultado_Resultadoid = newValue
            setDirty("Resultadoid")
         }
      }

   }

   @objc public var gxTv_SdtResultado_Resultadoficha: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoficha ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoficha_N = 0
         if ( _gxTv_SdtResultado_Resultadoficha != newValue )
         {
            _gxTv_SdtResultado_Resultadoficha = newValue
            setDirty("Resultadoficha")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoficha_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_N = 1
      _gxTv_SdtResultado_Resultadoficha = nil
   }

   public func getgxTv_SdtResultado_Resultadoficha_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoficha==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadocomentarios: String
   {
      get {
         return _gxTv_SdtResultado_Resultadocomentarios ?? ""
      }

      set {
         gxTv_SdtResultado_Resultadocomentarios_N = 0
         if ( _gxTv_SdtResultado_Resultadocomentarios != newValue )
         {
            _gxTv_SdtResultado_Resultadocomentarios = newValue
            setDirty("Resultadocomentarios")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadocomentarios_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = 1
      _gxTv_SdtResultado_Resultadocomentarios = nil
   }

   public func getgxTv_SdtResultado_Resultadocomentarios_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadocomentarios==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadouserid: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadouserid ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadouserid_N = 0
         if ( _gxTv_SdtResultado_Resultadouserid != newValue )
         {
            _gxTv_SdtResultado_Resultadouserid = newValue
            setDirty("Resultadouserid")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadouserid_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_N = 1
      _gxTv_SdtResultado_Resultadouserid = nil
   }

   public func getgxTv_SdtResultado_Resultadouserid_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadouserid==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadotypeid: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadotypeid ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadotypeid_N = 0
         if ( _gxTv_SdtResultado_Resultadotypeid != newValue )
         {
            _gxTv_SdtResultado_Resultadotypeid = newValue
            setDirty("Resultadotypeid")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadotypeid_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_N = 1
      _gxTv_SdtResultado_Resultadotypeid = nil
   }

   public func getgxTv_SdtResultado_Resultadotypeid_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadotypeid==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidnetusuario: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidnetusuario ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoidnetusuario_N = 0
         if ( _gxTv_SdtResultado_Resultadoidnetusuario != newValue )
         {
            _gxTv_SdtResultado_Resultadoidnetusuario = newValue
            setDirty("Resultadoidnetusuario")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidnetusuario_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = 1
      _gxTv_SdtResultado_Resultadoidnetusuario = nil
   }

   public func getgxTv_SdtResultado_Resultadoidnetusuario_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidnetusuario==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechacreado: Date
   {
      get {
         return _gxTv_SdtResultado_Resultadofechacreado ?? Date.gxEmpty()
      }

      set {
         gxTv_SdtResultado_Resultadofechacreado_N = 0
         if ( _gxTv_SdtResultado_Resultadofechacreado != newValue )
         {
            _gxTv_SdtResultado_Resultadofechacreado = newValue
            setDirty("Resultadofechacreado")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechacreado_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = 1
      _gxTv_SdtResultado_Resultadofechacreado = nil
   }

   public func getgxTv_SdtResultado_Resultadofechacreado_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechacreado==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechaemision: Date
   {
      get {
         return _gxTv_SdtResultado_Resultadofechaemision ?? Date.gxEmpty()
      }

      set {
         gxTv_SdtResultado_Resultadofechaemision_N = 0
         if ( _gxTv_SdtResultado_Resultadofechaemision != newValue )
         {
            _gxTv_SdtResultado_Resultadofechaemision = newValue
            setDirty("Resultadofechaemision")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechaemision_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = 1
      _gxTv_SdtResultado_Resultadofechaemision = nil
   }

   public func getgxTv_SdtResultado_Resultadofechaemision_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechaemision==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathexcel: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathexcel ?? ""
      }

      set {
         gxTv_SdtResultado_Resultadopathexcel_N = 0
         if ( _gxTv_SdtResultado_Resultadopathexcel != newValue )
         {
            _gxTv_SdtResultado_Resultadopathexcel = newValue
            setDirty("Resultadopathexcel")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathexcel_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = 1
      _gxTv_SdtResultado_Resultadopathexcel = nil
   }

   public func getgxTv_SdtResultado_Resultadopathexcel_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathexcel==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathpdf: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathpdf ?? ""
      }

      set {
         gxTv_SdtResultado_Resultadopathpdf_N = 0
         if ( _gxTv_SdtResultado_Resultadopathpdf != newValue )
         {
            _gxTv_SdtResultado_Resultadopathpdf = newValue
            setDirty("Resultadopathpdf")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathpdf_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = 1
      _gxTv_SdtResultado_Resultadopathpdf = nil
   }

   public func getgxTv_SdtResultado_Resultadopathpdf_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathpdf==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathcsv: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathcsv ?? ""
      }

      set {
         gxTv_SdtResultado_Resultadopathcsv_N = 0
         if ( _gxTv_SdtResultado_Resultadopathcsv != newValue )
         {
            _gxTv_SdtResultado_Resultadopathcsv = newValue
            setDirty("Resultadopathcsv")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathcsv_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = 1
      _gxTv_SdtResultado_Resultadopathcsv = nil
   }

   public func getgxTv_SdtResultado_Resultadopathcsv_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathcsv==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidestado: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidestado ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoidestado_N = 0
         if ( _gxTv_SdtResultado_Resultadoidestado != newValue )
         {
            _gxTv_SdtResultado_Resultadoidestado = newValue
            setDirty("Resultadoidestado")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidestado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_N = 1
      _gxTv_SdtResultado_Resultadoidestado = nil
   }

   public func getgxTv_SdtResultado_Resultadoidestado_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidestado==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidlibro: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidlibro ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoidlibro_N = 0
         if ( _gxTv_SdtResultado_Resultadoidlibro != newValue )
         {
            _gxTv_SdtResultado_Resultadoidlibro = newValue
            setDirty("Resultadoidlibro")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidlibro_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = 1
      _gxTv_SdtResultado_Resultadoidlibro = nil
   }

   public func getgxTv_SdtResultado_Resultadoidlibro_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidlibro==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidnettipoinforme: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidnettipoinforme ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidnettipoinforme != newValue )
         {
            _gxTv_SdtResultado_Resultadoidnettipoinforme = newValue
            setDirty("Resultadoidnettipoinforme")
         }
      }

   }

   @objc public var gxTv_SdtResultado_Resultadoeliminado: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoeliminado ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoeliminado_N = 0
         if ( _gxTv_SdtResultado_Resultadoeliminado != newValue )
         {
            _gxTv_SdtResultado_Resultadoeliminado = newValue
            setDirty("Resultadoeliminado")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoeliminado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = 1
      _gxTv_SdtResultado_Resultadoeliminado = nil
   }

   public func getgxTv_SdtResultado_Resultadoeliminado_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoeliminado==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoabonado: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoabonado ?? 0
      }

      set {
         gxTv_SdtResultado_Resultadoabonado_N = 0
         if ( _gxTv_SdtResultado_Resultadoabonado != newValue )
         {
            _gxTv_SdtResultado_Resultadoabonado = newValue
            setDirty("Resultadoabonado")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoabonado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_N = 1
      _gxTv_SdtResultado_Resultadoabonado = nil
   }

   public func getgxTv_SdtResultado_Resultadoabonado_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoabonado==nil)
   }

   @objc public var gxTv_SdtResultado_Mode: String
   {
      get {
         return _gxTv_SdtResultado_Mode ?? ""
      }

      set {
         if ( _gxTv_SdtResultado_Mode != newValue )
         {
            _gxTv_SdtResultado_Mode = newValue
            setDirty("Mode")
         }
      }

   }

   public func setgxTv_SdtResultado_Mode_SetNull( )
   {
      _gxTv_SdtResultado_Mode = nil
   }

   public func getgxTv_SdtResultado_Mode_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Mode==nil)
   }

   @objc public var gxTv_SdtResultado_Initialized: Int
   {
      get {
         return _gxTv_SdtResultado_Initialized ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Initialized != newValue )
         {
            _gxTv_SdtResultado_Initialized = newValue
            setDirty("Initialized")
         }
      }

   }

   public func setgxTv_SdtResultado_Initialized_SetNull( )
   {
      _gxTv_SdtResultado_Initialized = nil
   }

   public func getgxTv_SdtResultado_Initialized_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Initialized==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoid_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoid_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoid_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoid_Z = newValue
            setDirty("Resultadoid_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoid_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoid_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoid_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoid_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoficha_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoficha_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoficha_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoficha_Z = newValue
            setDirty("Resultadoficha_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoficha_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoficha_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoficha_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoficha_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadocomentarios_Z: String
   {
      get {
         return _gxTv_SdtResultado_Resultadocomentarios_Z ?? ""
      }

      set {
         if ( _gxTv_SdtResultado_Resultadocomentarios_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadocomentarios_Z = newValue
            setDirty("Resultadocomentarios_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadocomentarios_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadocomentarios_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadocomentarios_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadocomentarios_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadouserid_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadouserid_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadouserid_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadouserid_Z = newValue
            setDirty("Resultadouserid_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadouserid_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadouserid_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadouserid_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadouserid_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadotypeid_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadotypeid_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadotypeid_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadotypeid_Z = newValue
            setDirty("Resultadotypeid_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadotypeid_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadotypeid_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadotypeid_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadotypeid_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidnetusuario_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidnetusuario_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidnetusuario_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoidnetusuario_Z = newValue
            setDirty("Resultadoidnetusuario_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidnetusuario_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidnetusuario_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoidnetusuario_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidnetusuario_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechacreado_Z: Date
   {
      get {
         return _gxTv_SdtResultado_Resultadofechacreado_Z ?? Date.gxEmpty()
      }

      set {
         if ( _gxTv_SdtResultado_Resultadofechacreado_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadofechacreado_Z = newValue
            setDirty("Resultadofechacreado_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechacreado_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadofechacreado_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadofechacreado_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechacreado_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechaemision_Z: Date
   {
      get {
         return _gxTv_SdtResultado_Resultadofechaemision_Z ?? Date.gxEmpty()
      }

      set {
         if ( _gxTv_SdtResultado_Resultadofechaemision_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadofechaemision_Z = newValue
            setDirty("Resultadofechaemision_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechaemision_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadofechaemision_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadofechaemision_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechaemision_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathexcel_Z: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathexcel_Z ?? ""
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathexcel_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadopathexcel_Z = newValue
            setDirty("Resultadopathexcel_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathexcel_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathexcel_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadopathexcel_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathexcel_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathpdf_Z: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathpdf_Z ?? ""
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathpdf_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadopathpdf_Z = newValue
            setDirty("Resultadopathpdf_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathpdf_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathpdf_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadopathpdf_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathpdf_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathcsv_Z: String
   {
      get {
         return _gxTv_SdtResultado_Resultadopathcsv_Z ?? ""
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathcsv_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadopathcsv_Z = newValue
            setDirty("Resultadopathcsv_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathcsv_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathcsv_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadopathcsv_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathcsv_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidestado_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidestado_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidestado_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoidestado_Z = newValue
            setDirty("Resultadoidestado_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidestado_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidestado_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoidestado_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidestado_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidlibro_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidlibro_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidlibro_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoidlibro_Z = newValue
            setDirty("Resultadoidlibro_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidlibro_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidlibro_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoidlibro_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidlibro_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidnettipoinforme_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoidnettipoinforme_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidnettipoinforme_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoidnettipoinforme_Z = newValue
            setDirty("Resultadoidnettipoinforme_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidnettipoinforme_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidnettipoinforme_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoidnettipoinforme_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidnettipoinforme_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoeliminado_Z: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoeliminado_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoeliminado_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoeliminado_Z = newValue
            setDirty("Resultadoeliminado_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoeliminado_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoeliminado_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoeliminado_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoeliminado_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoabonado_Z: Int64
   {
      get {
         return _gxTv_SdtResultado_Resultadoabonado_Z ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoabonado_Z != newValue )
         {
            _gxTv_SdtResultado_Resultadoabonado_Z = newValue
            setDirty("Resultadoabonado_Z")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoabonado_Z_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoabonado_Z = nil
   }

   public func getgxTv_SdtResultado_Resultadoabonado_Z_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoabonado_Z==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoficha_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoficha_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoficha_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoficha_N = newValue
            setDirty("Resultadoficha_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoficha_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoficha_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoficha_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoficha_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadocomentarios_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadocomentarios_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadocomentarios_N != newValue )
         {
            _gxTv_SdtResultado_Resultadocomentarios_N = newValue
            setDirty("Resultadocomentarios_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadocomentarios_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadocomentarios_N = nil
   }

   public func getgxTv_SdtResultado_Resultadocomentarios_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadocomentarios_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadouserid_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadouserid_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadouserid_N != newValue )
         {
            _gxTv_SdtResultado_Resultadouserid_N = newValue
            setDirty("Resultadouserid_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadouserid_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadouserid_N = nil
   }

   public func getgxTv_SdtResultado_Resultadouserid_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadouserid_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadotypeid_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadotypeid_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadotypeid_N != newValue )
         {
            _gxTv_SdtResultado_Resultadotypeid_N = newValue
            setDirty("Resultadotypeid_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadotypeid_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadotypeid_N = nil
   }

   public func getgxTv_SdtResultado_Resultadotypeid_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadotypeid_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidnetusuario_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoidnetusuario_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidnetusuario_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoidnetusuario_N = newValue
            setDirty("Resultadoidnetusuario_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidnetusuario_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidnetusuario_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoidnetusuario_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidnetusuario_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechacreado_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadofechacreado_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadofechacreado_N != newValue )
         {
            _gxTv_SdtResultado_Resultadofechacreado_N = newValue
            setDirty("Resultadofechacreado_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechacreado_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadofechacreado_N = nil
   }

   public func getgxTv_SdtResultado_Resultadofechacreado_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechacreado_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadofechaemision_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadofechaemision_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadofechaemision_N != newValue )
         {
            _gxTv_SdtResultado_Resultadofechaemision_N = newValue
            setDirty("Resultadofechaemision_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadofechaemision_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadofechaemision_N = nil
   }

   public func getgxTv_SdtResultado_Resultadofechaemision_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadofechaemision_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathexcel_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadopathexcel_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathexcel_N != newValue )
         {
            _gxTv_SdtResultado_Resultadopathexcel_N = newValue
            setDirty("Resultadopathexcel_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathexcel_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathexcel_N = nil
   }

   public func getgxTv_SdtResultado_Resultadopathexcel_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathexcel_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathpdf_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadopathpdf_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathpdf_N != newValue )
         {
            _gxTv_SdtResultado_Resultadopathpdf_N = newValue
            setDirty("Resultadopathpdf_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathpdf_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathpdf_N = nil
   }

   public func getgxTv_SdtResultado_Resultadopathpdf_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathpdf_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadopathcsv_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadopathcsv_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadopathcsv_N != newValue )
         {
            _gxTv_SdtResultado_Resultadopathcsv_N = newValue
            setDirty("Resultadopathcsv_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadopathcsv_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadopathcsv_N = nil
   }

   public func getgxTv_SdtResultado_Resultadopathcsv_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadopathcsv_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidestado_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoidestado_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidestado_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoidestado_N = newValue
            setDirty("Resultadoidestado_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidestado_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidestado_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoidestado_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidestado_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoidlibro_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoidlibro_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoidlibro_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoidlibro_N = newValue
            setDirty("Resultadoidlibro_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoidlibro_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoidlibro_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoidlibro_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoidlibro_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoeliminado_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoeliminado_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoeliminado_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoeliminado_N = newValue
            setDirty("Resultadoeliminado_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoeliminado_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoeliminado_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoeliminado_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoeliminado_N==nil)
   }

   @objc public var gxTv_SdtResultado_Resultadoabonado_N: Int
   {
      get {
         return _gxTv_SdtResultado_Resultadoabonado_N ?? 0
      }

      set {
         if ( _gxTv_SdtResultado_Resultadoabonado_N != newValue )
         {
            _gxTv_SdtResultado_Resultadoabonado_N = newValue
            setDirty("Resultadoabonado_N")
         }
      }

   }

   public func setgxTv_SdtResultado_Resultadoabonado_N_SetNull( )
   {
      _gxTv_SdtResultado_Resultadoabonado_N = nil
   }

   public func getgxTv_SdtResultado_Resultadoabonado_N_IsNull( ) -> Bool
   {
      return (_gxTv_SdtResultado_Resultadoabonado_N==nil)
   }

   public func initialize( )
   {
      sTagName = ""
      sDateCnv = ""
      sNumToPad = ""
      var obj : resultado_bc
      obj = resultado_bc()
      obj.initialize()
      obj.setSdt(self, 0)
      self.transaction = obj
      obj.mode = "INS"
   }

   public func clone( ) -> SdtResultado
   {
      var sdt : SdtResultado
      var obj : resultado_bc
      sdt = SdtResultado()
      sdt.gxTv_SdtResultado_Resultadoid = self.gxTv_SdtResultado_Resultadoid
      sdt.gxTv_SdtResultado_Resultadoficha = self.gxTv_SdtResultado_Resultadoficha
      sdt.gxTv_SdtResultado_Resultadocomentarios = self.gxTv_SdtResultado_Resultadocomentarios
      sdt.gxTv_SdtResultado_Resultadouserid = self.gxTv_SdtResultado_Resultadouserid
      sdt.gxTv_SdtResultado_Resultadotypeid = self.gxTv_SdtResultado_Resultadotypeid
      sdt.gxTv_SdtResultado_Resultadoidnetusuario = self.gxTv_SdtResultado_Resultadoidnetusuario
      sdt.gxTv_SdtResultado_Resultadofechacreado = self.gxTv_SdtResultado_Resultadofechacreado
      sdt.gxTv_SdtResultado_Resultadofechaemision = self.gxTv_SdtResultado_Resultadofechaemision
      sdt.gxTv_SdtResultado_Resultadopathexcel = self.gxTv_SdtResultado_Resultadopathexcel
      sdt.gxTv_SdtResultado_Resultadopathpdf = self.gxTv_SdtResultado_Resultadopathpdf
      sdt.gxTv_SdtResultado_Resultadopathcsv = self.gxTv_SdtResultado_Resultadopathcsv
      sdt.gxTv_SdtResultado_Resultadoidestado = self.gxTv_SdtResultado_Resultadoidestado
      sdt.gxTv_SdtResultado_Resultadoidlibro = self.gxTv_SdtResultado_Resultadoidlibro
      sdt.gxTv_SdtResultado_Resultadoidnettipoinforme = self.gxTv_SdtResultado_Resultadoidnettipoinforme
      sdt.gxTv_SdtResultado_Resultadoeliminado = self.gxTv_SdtResultado_Resultadoeliminado
      sdt.gxTv_SdtResultado_Resultadoabonado = self.gxTv_SdtResultado_Resultadoabonado
      sdt.gxTv_SdtResultado_Mode = self.gxTv_SdtResultado_Mode
      sdt.gxTv_SdtResultado_Initialized = self.gxTv_SdtResultado_Initialized
      sdt.gxTv_SdtResultado_Resultadoid_Z = self.gxTv_SdtResultado_Resultadoid_Z
      sdt.gxTv_SdtResultado_Resultadoficha_Z = self.gxTv_SdtResultado_Resultadoficha_Z
      sdt.gxTv_SdtResultado_Resultadocomentarios_Z = self.gxTv_SdtResultado_Resultadocomentarios_Z
      sdt.gxTv_SdtResultado_Resultadouserid_Z = self.gxTv_SdtResultado_Resultadouserid_Z
      sdt.gxTv_SdtResultado_Resultadotypeid_Z = self.gxTv_SdtResultado_Resultadotypeid_Z
      sdt.gxTv_SdtResultado_Resultadoidnetusuario_Z = self.gxTv_SdtResultado_Resultadoidnetusuario_Z
      sdt.gxTv_SdtResultado_Resultadofechacreado_Z = self.gxTv_SdtResultado_Resultadofechacreado_Z
      sdt.gxTv_SdtResultado_Resultadofechaemision_Z = self.gxTv_SdtResultado_Resultadofechaemision_Z
      sdt.gxTv_SdtResultado_Resultadopathexcel_Z = self.gxTv_SdtResultado_Resultadopathexcel_Z
      sdt.gxTv_SdtResultado_Resultadopathpdf_Z = self.gxTv_SdtResultado_Resultadopathpdf_Z
      sdt.gxTv_SdtResultado_Resultadopathcsv_Z = self.gxTv_SdtResultado_Resultadopathcsv_Z
      sdt.gxTv_SdtResultado_Resultadoidestado_Z = self.gxTv_SdtResultado_Resultadoidestado_Z
      sdt.gxTv_SdtResultado_Resultadoidlibro_Z = self.gxTv_SdtResultado_Resultadoidlibro_Z
      sdt.gxTv_SdtResultado_Resultadoidnettipoinforme_Z = self.gxTv_SdtResultado_Resultadoidnettipoinforme_Z
      sdt.gxTv_SdtResultado_Resultadoeliminado_Z = self.gxTv_SdtResultado_Resultadoeliminado_Z
      sdt.gxTv_SdtResultado_Resultadoabonado_Z = self.gxTv_SdtResultado_Resultadoabonado_Z
      sdt.gxTv_SdtResultado_Resultadoficha_N = self.gxTv_SdtResultado_Resultadoficha_N
      sdt.gxTv_SdtResultado_Resultadocomentarios_N = self.gxTv_SdtResultado_Resultadocomentarios_N
      sdt.gxTv_SdtResultado_Resultadouserid_N = self.gxTv_SdtResultado_Resultadouserid_N
      sdt.gxTv_SdtResultado_Resultadotypeid_N = self.gxTv_SdtResultado_Resultadotypeid_N
      sdt.gxTv_SdtResultado_Resultadoidnetusuario_N = self.gxTv_SdtResultado_Resultadoidnetusuario_N
      sdt.gxTv_SdtResultado_Resultadofechacreado_N = self.gxTv_SdtResultado_Resultadofechacreado_N
      sdt.gxTv_SdtResultado_Resultadofechaemision_N = self.gxTv_SdtResultado_Resultadofechaemision_N
      sdt.gxTv_SdtResultado_Resultadopathexcel_N = self.gxTv_SdtResultado_Resultadopathexcel_N
      sdt.gxTv_SdtResultado_Resultadopathpdf_N = self.gxTv_SdtResultado_Resultadopathpdf_N
      sdt.gxTv_SdtResultado_Resultadopathcsv_N = self.gxTv_SdtResultado_Resultadopathcsv_N
      sdt.gxTv_SdtResultado_Resultadoidestado_N = self.gxTv_SdtResultado_Resultadoidestado_N
      sdt.gxTv_SdtResultado_Resultadoidlibro_N = self.gxTv_SdtResultado_Resultadoidlibro_N
      sdt.gxTv_SdtResultado_Resultadoeliminado_N = self.gxTv_SdtResultado_Resultadoeliminado_N
      sdt.gxTv_SdtResultado_Resultadoabonado_N = self.gxTv_SdtResultado_Resultadoabonado_N
      obj = resultado_bc()
      obj.initialize()
      obj.setSdt(sdt, 1)
      sdt.transaction = obj
      return sdt
   }

    var _gxTv_SdtResultado_Resultadoeliminado : Int?
    var _gxTv_SdtResultado_Initialized : Int?
    var _gxTv_SdtResultado_Resultadoeliminado_Z : Int?
    var _gxTv_SdtResultado_Resultadoficha_N : Int?
    var _gxTv_SdtResultado_Resultadocomentarios_N : Int?
    var _gxTv_SdtResultado_Resultadouserid_N : Int?
    var _gxTv_SdtResultado_Resultadotypeid_N : Int?
    var _gxTv_SdtResultado_Resultadoidnetusuario_N : Int?
    var _gxTv_SdtResultado_Resultadofechacreado_N : Int?
    var _gxTv_SdtResultado_Resultadofechaemision_N : Int?
    var _gxTv_SdtResultado_Resultadopathexcel_N : Int?
    var _gxTv_SdtResultado_Resultadopathpdf_N : Int?
    var _gxTv_SdtResultado_Resultadopathcsv_N : Int?
    var _gxTv_SdtResultado_Resultadoidestado_N : Int?
    var _gxTv_SdtResultado_Resultadoidlibro_N : Int?
    var _gxTv_SdtResultado_Resultadoeliminado_N : Int?
    var _gxTv_SdtResultado_Resultadoabonado_N : Int?
    var readOk : Int = 0
    var nOutParmCount : Int = 0
    var _gxTv_SdtResultado_Resultadoid : Int64?
    var _gxTv_SdtResultado_Resultadoficha : Int64?
    var _gxTv_SdtResultado_Resultadouserid : Int64?
    var _gxTv_SdtResultado_Resultadotypeid : Int64?
    var _gxTv_SdtResultado_Resultadoidnetusuario : Int64?
    var _gxTv_SdtResultado_Resultadoidestado : Int64?
    var _gxTv_SdtResultado_Resultadoidlibro : Int64?
    var _gxTv_SdtResultado_Resultadoidnettipoinforme : Int64?
    var _gxTv_SdtResultado_Resultadoabonado : Int64?
    var _gxTv_SdtResultado_Resultadoid_Z : Int64?
    var _gxTv_SdtResultado_Resultadoficha_Z : Int64?
    var _gxTv_SdtResultado_Resultadouserid_Z : Int64?
    var _gxTv_SdtResultado_Resultadotypeid_Z : Int64?
    var _gxTv_SdtResultado_Resultadoidnetusuario_Z : Int64?
    var _gxTv_SdtResultado_Resultadoidestado_Z : Int64?
    var _gxTv_SdtResultado_Resultadoidlibro_Z : Int64?
    var _gxTv_SdtResultado_Resultadoidnettipoinforme_Z : Int64?
    var _gxTv_SdtResultado_Resultadoabonado_Z : Int64?
    var _gxTv_SdtResultado_Mode : String?
    var sTagName : String = ""
    var sDateCnv : String = ""
    var sNumToPad : String = ""
    var _gxTv_SdtResultado_Resultadofechacreado : Date?
    var _gxTv_SdtResultado_Resultadofechaemision : Date?
    var _gxTv_SdtResultado_Resultadofechacreado_Z : Date?
    var _gxTv_SdtResultado_Resultadofechaemision_Z : Date?
    var readElement : Bool = false
    var formatError : Bool = false
    var _gxTv_SdtResultado_Resultadocomentarios : String?
    var _gxTv_SdtResultado_Resultadopathexcel : String?
    var _gxTv_SdtResultado_Resultadopathpdf : String?
    var _gxTv_SdtResultado_Resultadopathcsv : String?
    var _gxTv_SdtResultado_Resultadocomentarios_Z : String?
    var _gxTv_SdtResultado_Resultadopathexcel_Z : String?
    var _gxTv_SdtResultado_Resultadopathpdf_Z : String?
    var _gxTv_SdtResultado_Resultadopathcsv_Z : String?

   @objc public override var sdtLevelPathNames: [String]
   {
      return ["Resultado"]
   }


   @objc public override var sdtPropertiesNameMapping: [String: String]
   {
      var dict: [String: String] = [:]
      dict["resultadoId"] = "gxTv_SdtResultado_Resultadoid"
      dict["resultadoFicha"] = "gxTv_SdtResultado_Resultadoficha"
      dict["resultadoComentarios"] = "gxTv_SdtResultado_Resultadocomentarios"
      dict["resultadoUserId"] = "gxTv_SdtResultado_Resultadouserid"
      dict["resultadoTypeId"] = "gxTv_SdtResultado_Resultadotypeid"
      dict["resultadoIdNetUsuario"] = "gxTv_SdtResultado_Resultadoidnetusuario"
      dict["resultadoFechaCreado"] = "gxTv_SdtResultado_Resultadofechacreado"
      dict["resultadoFechaEmision"] = "gxTv_SdtResultado_Resultadofechaemision"
      dict["resultadoPathExcel"] = "gxTv_SdtResultado_Resultadopathexcel"
      dict["resultadoPathPdf"] = "gxTv_SdtResultado_Resultadopathpdf"
      dict["resultadoPathCsv"] = "gxTv_SdtResultado_Resultadopathcsv"
      dict["resultadoIdEstado"] = "gxTv_SdtResultado_Resultadoidestado"
      dict["resultadoIdLibro"] = "gxTv_SdtResultado_Resultadoidlibro"
      dict["resultadoIdNetTipoinforme"] = "gxTv_SdtResultado_Resultadoidnettipoinforme"
      dict["resultadoEliminado"] = "gxTv_SdtResultado_Resultadoeliminado"
      dict["resultadoAbonado"] = "gxTv_SdtResultado_Resultadoabonado"
      dict["Mode"] = "gxTv_SdtResultado_Mode"
      dict["Initialized"] = "gxTv_SdtResultado_Initialized"
      dict["resultadoId_Z"] = "gxTv_SdtResultado_Resultadoid_Z"
      dict["resultadoFicha_Z"] = "gxTv_SdtResultado_Resultadoficha_Z"
      dict["resultadoComentarios_Z"] = "gxTv_SdtResultado_Resultadocomentarios_Z"
      dict["resultadoUserId_Z"] = "gxTv_SdtResultado_Resultadouserid_Z"
      dict["resultadoTypeId_Z"] = "gxTv_SdtResultado_Resultadotypeid_Z"
      dict["resultadoIdNetUsuario_Z"] = "gxTv_SdtResultado_Resultadoidnetusuario_Z"
      dict["resultadoFechaCreado_Z"] = "gxTv_SdtResultado_Resultadofechacreado_Z"
      dict["resultadoFechaEmision_Z"] = "gxTv_SdtResultado_Resultadofechaemision_Z"
      dict["resultadoPathExcel_Z"] = "gxTv_SdtResultado_Resultadopathexcel_Z"
      dict["resultadoPathPdf_Z"] = "gxTv_SdtResultado_Resultadopathpdf_Z"
      dict["resultadoPathCsv_Z"] = "gxTv_SdtResultado_Resultadopathcsv_Z"
      dict["resultadoIdEstado_Z"] = "gxTv_SdtResultado_Resultadoidestado_Z"
      dict["resultadoIdLibro_Z"] = "gxTv_SdtResultado_Resultadoidlibro_Z"
      dict["resultadoIdNetTipoinforme_Z"] = "gxTv_SdtResultado_Resultadoidnettipoinforme_Z"
      dict["resultadoEliminado_Z"] = "gxTv_SdtResultado_Resultadoeliminado_Z"
      dict["resultadoAbonado_Z"] = "gxTv_SdtResultado_Resultadoabonado_Z"
      dict["resultadoFicha_N"] = "gxTv_SdtResultado_Resultadoficha_N"
      dict["resultadoComentarios_N"] = "gxTv_SdtResultado_Resultadocomentarios_N"
      dict["resultadoUserId_N"] = "gxTv_SdtResultado_Resultadouserid_N"
      dict["resultadoTypeId_N"] = "gxTv_SdtResultado_Resultadotypeid_N"
      dict["resultadoIdNetUsuario_N"] = "gxTv_SdtResultado_Resultadoidnetusuario_N"
      dict["resultadoFechaCreado_N"] = "gxTv_SdtResultado_Resultadofechacreado_N"
      dict["resultadoFechaEmision_N"] = "gxTv_SdtResultado_Resultadofechaemision_N"
      dict["resultadoPathExcel_N"] = "gxTv_SdtResultado_Resultadopathexcel_N"
      dict["resultadoPathPdf_N"] = "gxTv_SdtResultado_Resultadopathpdf_N"
      dict["resultadoPathCsv_N"] = "gxTv_SdtResultado_Resultadopathcsv_N"
      dict["resultadoIdEstado_N"] = "gxTv_SdtResultado_Resultadoidestado_N"
      dict["resultadoIdLibro_N"] = "gxTv_SdtResultado_Resultadoidlibro_N"
      dict["resultadoEliminado_N"] = "gxTv_SdtResultado_Resultadoeliminado_N"
      dict["resultadoAbonado_N"] = "gxTv_SdtResultado_Resultadoabonado_N"
      return dict
   }


   @objc public override func objectValue(forPropertyName propName: String) -> Any?
   {
      if propName == "gxTv_SdtResultado_Resultadoid" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoid)
      }
      if propName == "gxTv_SdtResultado_Resultadoficha" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoficha)
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios" {
         return self.gxTv_SdtResultado_Resultadocomentarios
      }
      if propName == "gxTv_SdtResultado_Resultadouserid" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadouserid)
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadotypeid)
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidnetusuario)
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado" {
         return self.gxTv_SdtResultado_Resultadofechacreado
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision" {
         return self.gxTv_SdtResultado_Resultadofechaemision
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel" {
         return self.gxTv_SdtResultado_Resultadopathexcel
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf" {
         return self.gxTv_SdtResultado_Resultadopathpdf
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv" {
         return self.gxTv_SdtResultado_Resultadopathcsv
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidestado)
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidlibro)
      }
      if propName == "gxTv_SdtResultado_Resultadoidnettipoinforme" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidnettipoinforme)
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoeliminado)
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoabonado)
      }
      if propName == "gxTv_SdtResultado_Mode" {
         return self.gxTv_SdtResultado_Mode
      }
      if propName == "gxTv_SdtResultado_Initialized" {
         return NSNumber(value: self.gxTv_SdtResultado_Initialized)
      }
      if propName == "gxTv_SdtResultado_Resultadoid_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoid_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoficha_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoficha_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios_Z" {
         return self.gxTv_SdtResultado_Resultadocomentarios_Z
      }
      if propName == "gxTv_SdtResultado_Resultadouserid_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadouserid_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadotypeid_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidnetusuario_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado_Z" {
         return self.gxTv_SdtResultado_Resultadofechacreado_Z
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision_Z" {
         return self.gxTv_SdtResultado_Resultadofechaemision_Z
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel_Z" {
         return self.gxTv_SdtResultado_Resultadopathexcel_Z
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf_Z" {
         return self.gxTv_SdtResultado_Resultadopathpdf_Z
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv_Z" {
         return self.gxTv_SdtResultado_Resultadopathcsv_Z
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidestado_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidlibro_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoidnettipoinforme_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidnettipoinforme_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoeliminado_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado_Z" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoabonado_Z)
      }
      if propName == "gxTv_SdtResultado_Resultadoficha_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoficha_N)
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadocomentarios_N)
      }
      if propName == "gxTv_SdtResultado_Resultadouserid_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadouserid_N)
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadotypeid_N)
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidnetusuario_N)
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadofechacreado_N)
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadofechaemision_N)
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadopathexcel_N)
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadopathpdf_N)
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadopathcsv_N)
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidestado_N)
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoidlibro_N)
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoeliminado_N)
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado_N" {
         return NSNumber(value: self.gxTv_SdtResultado_Resultadoabonado_N)
      }
      return nil
   }


   @objc public override func setObjectValue(_ value: Any, forPropertyName propName: String)
   {
      if propName == "gxTv_SdtResultado_Resultadoid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoid = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoficha" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoficha = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadocomentarios = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadouserid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadouserid = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadotypeid = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidnetusuario = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado" {
         if let value = value as? Date {
            self.gxTv_SdtResultado_Resultadofechacreado = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision" {
         if let value = value as? Date {
            self.gxTv_SdtResultado_Resultadofechaemision = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathexcel = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathpdf = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathcsv = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidestado = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidlibro = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidnettipoinforme" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidnettipoinforme = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoeliminado = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoabonado = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Mode" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Mode = value
         }
      }
      if propName == "gxTv_SdtResultado_Initialized" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Initialized = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoid_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoid_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoficha_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoficha_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios_Z" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadocomentarios_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadouserid_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadouserid_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadotypeid_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidnetusuario_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado_Z" {
         if let value = value as? Date {
            self.gxTv_SdtResultado_Resultadofechacreado_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision_Z" {
         if let value = value as? Date {
            self.gxTv_SdtResultado_Resultadofechaemision_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel_Z" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathexcel_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf_Z" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathpdf_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv_Z" {
         if let value = value as? String {
            self.gxTv_SdtResultado_Resultadopathcsv_Z = value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidestado_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidlibro_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidnettipoinforme_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidnettipoinforme_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoeliminado_Z = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado_Z" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoabonado_Z = value.int64Value
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoficha_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoficha_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadocomentarios_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadocomentarios_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadouserid_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadouserid_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadotypeid_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadotypeid_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidnetusuario_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidnetusuario_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechacreado_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadofechacreado_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadofechaemision_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadofechaemision_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathexcel_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadopathexcel_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathpdf_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadopathpdf_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadopathcsv_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadopathcsv_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidestado_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidestado_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoidlibro_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoidlibro_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoeliminado_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoeliminado_N = value.intValue
         }
      }
      if propName == "gxTv_SdtResultado_Resultadoabonado_N" {
         if let value = value as? NSNumber {
            self.gxTv_SdtResultado_Resultadoabonado_N = value.intValue
         }
      }
   }

}

