/*
               File: PDFdownload_Level_Detail
        Description: PDFdownload_Level_Detail
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:52:17.20
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( pdfdownload_level_detail )
public final  class pdfdownload_level_detail: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSString? ,
                                            _ aP1: NSNumber? ,
                                            _ aP2: NSNumber? ,
                                            _ inout_aP3: AutoreleasingUnsafeMutablePointer<SdtPDFdownload_Level_DetailSdt?> )
   {
      let aP3: SdtPDFdownload_Level_DetailSdt? = inout_aP3.pointee
      let iP0: String = (aP0 == nil) ? "" : aP0! as String
      let iP1: Int64 = (aP1 == nil) ? 0 : aP1!.int64Value as Int64
      let iP2: Int = (aP2 == nil) ? 0 : aP2!.intValue as Int
      var iP3: SdtPDFdownload_Level_DetailSdt = (aP3 == nil) ? SdtPDFdownload_Level_DetailSdt() : aP3! as SdtPDFdownload_Level_DetailSdt
      execute(iP0, iP1, iP2, &iP3)
      inout_aP3.pointee  = iP3 as SdtPDFdownload_Level_DetailSdt?
   }

   public func executeUdp( _ aP0: String ,
                           _ aP1: Int64 ,
                           _ aP2: Int ) -> SdtPDFdownload_Level_DetailSdt
   {
      self.AV5resultadoPathPdf = aP0
      self.AV6resultadoFicha = aP1
      self.AV13gxid = aP2
      initialize()
      autoreleasepool
      {
         privateExecute()
      }
      return self.AV16GXM1PDFdownload_Level_DetailSdt
   }

   public func execute( _ aP0: String ,
                        _ aP1: Int64 ,
                        _ aP2: Int ,
                        _ aP3: inout SdtPDFdownload_Level_DetailSdt )
   {
      execute_int(aP0, aP1, aP2, &aP3)
   }

   private func execute_int( _ aP0: String ,
                             _ aP1: Int64 ,
                             _ aP2: Int ,
                             _ aP3: inout SdtPDFdownload_Level_DetailSdt )
   {
      self.AV5resultadoPathPdf = aP0
      self.AV6resultadoFicha = aP1
      self.AV13gxid = aP2
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
      aP3 = self.AV16GXM1PDFdownload_Level_DetailSdt
   }

   private func privateExecute( )
   {
      Gxids = "gxid_"  +  String.gxStringFromNumber(Decimal(AV13gxid), totalLength:8, decimals:0)
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         AV7url = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo="  +  AV5resultadoPathPdf
         loger().execute( AV7url)
         AV8path = GXDirectory.applicationdatapath()  +  AV9file.separator  +  String.gxStringFromNumber(Decimal(AV6resultadoFicha), totalLength:18, decimals:0).gxStringByTrimming()  +  ".pdf"
         loger().execute( AV8path)
         AV9file.source = AV8path
         AV12httpClient.execute("GET", url:AV7url)
         AV12httpClient.toFile(AV8path)
         AV10uri = "file://"  +  AV8path
         loger().execute( AV10uri)
         AV11destfile = AV10uri
         Gxwebsession.setValue(Gxids+"gxvar_Destfile", AV11destfile)
         Gxwebsession.setValue(Gxids, "true")
      }
      else
      {
         AV11destfile = Gxwebsession.getValue(Gxids+"gxvar_Destfile")
      }
      AV16GXM1PDFdownload_Level_DetailSdt.gxTv_SdtPDFdownload_Level_DetailSdt_Destfile = AV11destfile
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
      AV16GXM1PDFdownload_Level_DetailSdt = SdtPDFdownload_Level_DetailSdt()
      Gxids = ""
      Gxwebsession = GXOfflineSession.sharedInstance()
      AV7url = ""
      AV8path = ""
      AV9file = GXFile()
      AV12httpClient = GXHttpClient()
      AV10uri = ""
      AV11destfile = ""
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var AV13gxid : Int = 0
   private var Gx_err : Int = 0
   private var AV6resultadoFicha : Int64 = 0
   private var Gxids : String = ""
   private var AV5resultadoPathPdf : String = ""
   private var AV7url : String = ""
   private var AV8path : String = ""
   private var AV10uri : String = ""
   private var AV11destfile : String = ""
   private var AV9file : GXFile = GXFile()
   private var AV12httpClient : GXHttpClient = GXHttpClient()
   private var Gxwebsession : GXOfflineSession = GXOfflineSession()
   private var AV16GXM1PDFdownload_Level_DetailSdt : SdtPDFdownload_Level_DetailSdt = SdtPDFdownload_Level_DetailSdt()
}

