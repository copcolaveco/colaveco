/*
               File: DownloadPDF
        Description: Download PDF
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 10:7:19.64
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( downloadpdf )
public final  class downloadpdf: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSNumber? ,
                                            _ aP1: NSString? )
   {
      let iP0: Int64 = (aP0 == nil) ? 0 : aP0!.int64Value as Int64
      let iP1: String = (aP1 == nil) ? "" : aP1! as String
      execute(iP0, iP1)
   }

   public func execute( _ aP0: Int64 ,
                        _ aP1: String )
   {
      execute_int(aP0, aP1)
   }

   private func execute_int( _ aP0: Int64 ,
                             _ aP1: String )
   {
      self.AV10resultadoFicha = aP0
      self.AV9resultadoPathPdf = aP1
      initialize()
      /* GeneXus formulas */
      /* Output device settings */
      autoreleasepool
      {
         privateExecute()
      }
   }

   private func privateExecute( )
   {
      AV8url = "https://www.colaveco.com.uy/gestor/utils/bajar_archivo.php?archivo="  +  AV9resultadoPathPdf
      loger().execute( AV8url)
      AV12path = GXDirectory.applicationdatapath()  +  AV11file.separator  +  String.gxStringFromNumber(Decimal(AV10resultadoFicha), totalLength:18, decimals:0).gxStringByTrimming()  +  ".pdf"
      loger().execute( AV12path)
      AV11file.source = AV12path
      AV15Uri = "file://"  +  AV12path
      loger().execute( AV15Uri)
      AV16Destfile = AV15Uri
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
      AV8url = ""
      AV12path = ""
      AV11file = GXFile()
      AV15Uri = ""
      AV16Destfile = ""
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var Gx_err : Int = 0
   private var AV10resultadoFicha : Int64 = 0
   private var AV15Uri : String = ""
   private var AV16Destfile : String = ""
   private var AV9resultadoPathPdf : String = ""
   private var AV8url : String = ""
   private var AV12path : String = ""
   private var AV11file : GXFile = GXFile()
}

