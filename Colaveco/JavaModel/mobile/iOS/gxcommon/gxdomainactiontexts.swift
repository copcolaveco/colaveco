/*
               File: ActionTexts
        Description: ActionTexts
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 10:7:19.67
       Program type: Callable routine
          Main DBMS: SQLite
*/
public struct gxdomainactiontexts
{
   private static var domain: [ String : String] =
   [
      "Edit": "Update",
      "Delete": "Delete",
      "Add": "Add",
      "Back": "Back",
      "Show filters": "Show Filters",
      "Hide filters": "Hide Filters",
      "Children": "Children",
      "Permission": "Permission",
      "Roles": "Roles",
      "Login": "Login",
      "Register": "Register",
      "Logout": "Logout",
   ]

   public static func getDescription( _ key: String ) -> String
   {
      if let value = domain[ (key as NSString).gxStringByTrimming() ]
      {
         return value
      }
      else
      {
         return ""
      }
   }

   public static func getValues( ) -> GXObjectCollection
   {
      return GXObjectCollection(array: Array(domain.values))
   }

}

