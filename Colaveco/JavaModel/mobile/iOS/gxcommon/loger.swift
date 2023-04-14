/*
               File: Loger
        Description: Loger
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 10:7:19.69
       Program type: Callable routine
          Main DBMS: SQLite
*/

@objc( loger )
public final  class loger: GXProcedure
{
   @objc public func executeFlexibleClient( _ aP0: NSString? )
   {
      let iP0: String = (aP0 == nil) ? "" : aP0! as String
      execute(iP0)
   }

   public func execute( _ aP0: String )
   {
      execute_int(aP0)
   }

   private func execute_int( _ aP0: String )
   {
      self.AV8LogDetalle = aP0
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
      /*
         INSERT RECORD ON TABLE Log

      */
      A174LogDetalle = AV8LogDetalle
      n174LogDetalle = false
      /* Using cursor P00102 */
      var params0 = Array<Any>()
      params0.append(A174LogDetalle)
      var nullParams0 = Array<Bool>()
      nullParams0.append(n174LogDetalle)
      pr_default.execute(0, params: params0, nullParams: nullParams0)
      /* Retrieving last key number assigned */
      /* Using cursor P00103 */
      pr_default.execute(1)
      self.A175LogId = pr_default.getDBCommand(1).int64Value(forColumn: "LogId")
      pr_default.close(1);
      if ( pr_default.getStatus(0) == 1 )
      {
         Gx_err = 1
         Gx_emsg = GXMessages.getMessage("GXM_noupdate")
      }
      else
      {
         Gx_err = 0
         Gx_emsg = ""
      }
      /* End Insert */
      cleanup()
   }

   public override func cleanup( )
   {
      GXDBManager.sharedInstance().commitDatastore("GAM")
      GXDBManager.sharedInstance().commitDatastore("DEFAULT")
      closeOpenCursors()
   }

   private func closeOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public override func initialize( )
   {
      A174LogDetalle = ""
      scmdbuf = ""
      Gx_emsg = ""
      pr_default = GXDataStoreProvider(loger__default(),
         [
         ]
      );
      /* GeneXus formulas. */
      Gx_err = 0
   }

   private var GX_INS7 : Int = 0
   private var Gx_err : Int = 0
   private var A175LogId : Int64 = 0
   private var scmdbuf : String = ""
   private var Gx_emsg : String = ""
   private var n174LogDetalle : Bool = false
   private var AV8LogDetalle : String = ""
   private var A174LogDetalle : String = ""
   private var pr_default : GXDataStoreProvider = GXDataStoreProvider()
}

@objc( loger__default )
final  class loger__default: GXDataStoreHelperBase
{
   override func getCursor( _ cursor: Int ) -> GXCursor?
   {
      switch cursor {
         case 0: return UpdateCursor("P00102", "INSERT INTO [Log]([LogDetalle]) VALUES(?)")
         case 1: return ForEachCursor("P00103", "SELECT last_insert_rowid() AS [LogId] FROM [Log] ")
         default: return nil
      }
   }

}

