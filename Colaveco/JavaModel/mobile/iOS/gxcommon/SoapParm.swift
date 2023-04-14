/*
               File: SoapParm
        Description: No description for object
             Author: GeneXus Swift Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:9:45.32
       Program type: Callable routine
          Main DBMS: SQLite
*/

public final  class SoapParm: GXSoapParamBase
{
   public static func read_section( _ oReader: GXXMLReader ,
                                    _ oLocation: GXSoapLocation ) -> String
   {
      var sSection : String
      sSection = ""
      if ( oReader.nodeType == 1 )
      {
         sSection = oReader.name
         oReader.read()
         while ( !( ( GXutil.strcmp(oReader.name, sSection) == 0 ) && ( oReader.nodeType == 2 ) ) )
         {
            if ( GXutil.strcmp(oReader.name.lowercased(), "host") == 0 )
            {
               oLocation.host = oReader.value
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "port") == 0 )
            {
               oLocation.port = Int(oReader.value.gxDecimalValueWithSeparator("."))
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "baseurl") == 0 )
            {
               oLocation.baseURL = oReader.value
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "resourcename") == 0 )
            {
               oLocation.resourceName = oReader.value
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "secure") == 0 )
            {
               oLocation.secure = Int(oReader.value.gxDecimalValueWithSeparator("."))
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "proxyserverhost") == 0 )
            {
               oLocation.proxyServerHost = oReader.value
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "proxyserverport") == 0 )
            {
               oLocation.proxyServerPort = Int(oReader.value.gxDecimalValueWithSeparator("."))
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "timeout") == 0 )
            {
               oLocation.timeout = Int(oReader.value.gxDecimalValueWithSeparator("."))
            }
            else if ( GXutil.strcmp(oReader.name.lowercased(), "cancelonerror") == 0 )
            {
               oLocation.cancelOnError = Int(oReader.value.gxDecimalValueWithSeparator("."))
            }
            else if ( GXutil.strcmp(oReader.name, "Authentication") == 0 )
            {
               oLocation.authentication = 1
               oLocation.authenticationMethod = Int(String.gxStringFromNumber(Decimal(0), totalLength:1, decimals:0).gxDecimalValueWithSeparator("."))
               oReader.read()
               while ( !( ( GXutil.strcmp(oReader.name, "Authentication") == 0 ) && ( oReader.nodeType == 2 ) ) )
               {
                  if ( GXutil.strcmp(oReader.name.lowercased(), "authenticationmethod") == 0 )
                  {
                     oLocation.authenticationMethod = Int(oReader.value.gxDecimalValueWithSeparator("."))
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "authenticationuser") == 0 )
                  {
                     oLocation.authenticationUser = oReader.value
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "authenticationrealm") == 0 )
                  {
                     oLocation.authenticationRealm = oReader.value
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "authenticationpassword") == 0 )
                  {
                     oLocation.authenticationPassword = oReader.value
                  }
                  oReader.read()
               }
            }
            else if ( GXutil.strcmp(oReader.name, "Proxyauthentication") == 0 )
            {
               oLocation.proxyAuthenticationMethod = Int(String.gxStringFromNumber(Decimal(0), totalLength:1, decimals:0).gxDecimalValueWithSeparator("."))
               oReader.read()
               while ( !( ( GXutil.strcmp(oReader.name, "Proxyauthentication") == 0 ) && ( oReader.nodeType == 2 ) ) )
               {
                  if ( GXutil.strcmp(oReader.name.lowercased(), "proxyauthenticationmethod") == 0 )
                  {
                     oLocation.proxyAuthenticationMethod = Int(oReader.value.gxDecimalValueWithSeparator("."))
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "proxyauthenticationuser") == 0 )
                  {
                     oLocation.proxyAuthenticationUser = oReader.value
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "proxyauthenticationrealm") == 0 )
                  {
                     oLocation.proxyAuthenticationRealm = oReader.value
                  }
                  else if ( GXutil.strcmp(oReader.name.lowercased(), "proxyauthenticationpassword") == 0 )
                  {
                     oLocation.proxyAuthenticationPassword = oReader.value
                  }
                  oReader.read()
               }
            }
            oReader.read()
         }
      }
      return sSection
   }

   public static func initlocations( _ oReader: GXXMLReader )
   {
      var sSection : String
      var sName : String
      var nFirstRead : Int
      var oLocation : GXSoapLocation
      nLocRead = 1
      colLocations = GXSoapLocationCollection()
      if ( oReader.errCode == 0 )
      {
         if ( oReader.readType(1, name:"GXLocations") > 0 )
         {
            oReader.read()
            while ( !( ( GXutil.strcmp(oReader.name, "GXLocations") == 0 ) && ( oReader.nodeType == 2 ) ) )
            {
               if ( ( GXutil.strcmp(oReader.name, "GXLocation") == 0 ) && ( oReader.nodeType == 1 ) )
               {
                  sName = oReader.getAttributeByName("name")
                  oLocation = colLocations.item(sName)
                  nSOAPErr = 0
                  if ( GXutil.strcmp(oLocation.name, sName) != 0 )
                  {
                     nSOAPErr = 1
                  }
                  if ( nSOAPErr != 0 )
                  {
                     /* Error while reading XML. Code:  4 . Message:  Input error . */
                     oLocation = GXSoapLocation()
                     oLocation.name = sName
                     oLocation.host = "localhost"
                     oLocation.port = 80
                     oLocation.baseURL = "/"
                     oLocation.secure = 0
                     oLocation.proxyServerHost = ""
                     oLocation.proxyServerPort = 0
                     oLocation.timeout = 0
                     oLocation.cancelOnError = 0
                     oLocation.authentication = 0
                     oLocation.authenticationMethod = 0
                     oLocation.authenticationRealm = ""
                     oLocation.authenticationUser = ""
                     oLocation.authenticationPassword = ""
                     oLocation.groupLocation = ""
                     colLocations.add(oLocation, sName)
                  }
                  oLocation.groupLocation = ""
                  nFirstRead = 1
                  oReader.read()
                  while ( !( ( GXutil.strcmp(oReader.name, "GXLocation") == 0 ) && ( oReader.nodeType == 2 ) ) )
                  {
                     sSection = read_section(oReader,oLocation)
                     if ( ( ( GXutil.strcmp(sSection, "Common") == 0 ) && ( nFirstRead == 1 ) ) || ( GXutil.strcmp(sSection, "HTTP") == 0 ) )
                     {
                        nFirstRead = 0
                     }
                     oReader.read()
                  }
               }
               oReader.read()
            }
         }
      }
   }

   public static func assigngroupproperties( _ oLocation: GXSoapLocation )
   {
      var sLocation : String
      var oGroupLocation : GXSoapLocation
      var nOldSOAPErr : Int
      if ( GXutil.strcmp(oLocation.name, "") != 0 )
      {
         sLocation = oLocation.groupLocation
         if ( GXutil.strcmp(sLocation, "") != 0 )
         {
            nOldSOAPErr = nSOAPErr
            oGroupLocation = colLocations.item(sLocation)
            nSOAPErr = 0
            if ( GXutil.strcmp(oGroupLocation.name, sLocation) != 0 )
            {
               nSOAPErr = 1
            }
            if ( nSOAPErr == 0 )
            {
               oLocation.host = oGroupLocation.host
               oLocation.port = oGroupLocation.port
               oLocation.wsdlurl = oGroupLocation.wsdlurl
               oLocation.baseURL = oGroupLocation.baseURL
               oLocation.secure = oGroupLocation.secure
               oLocation.proxyServerHost = oGroupLocation.proxyServerHost
               oLocation.proxyServerPort = oGroupLocation.proxyServerPort
               oLocation.timeout = oGroupLocation.timeout
               oLocation.cancelOnError = oGroupLocation.cancelOnError
               oLocation.authentication = oGroupLocation.authentication
               oLocation.authenticationMethod = oGroupLocation.authenticationMethod
               oLocation.authenticationRealm = oGroupLocation.authenticationRealm
               oLocation.authenticationUser = oGroupLocation.authenticationUser
               oLocation.authenticationPassword = oGroupLocation.authenticationPassword
               oLocation.proxyAuthentication = oGroupLocation.proxyAuthentication
               oLocation.proxyAuthenticationMethod = oGroupLocation.proxyAuthenticationMethod
               oLocation.proxyAuthenticationRealm = oGroupLocation.proxyAuthenticationRealm
               oLocation.proxyAuthenticationUser = oGroupLocation.proxyAuthenticationUser
               oLocation.proxyAuthenticationPassword = oGroupLocation.proxyAuthenticationPassword
            }
            nSOAPErr = nOldSOAPErr
         }
      }
   }

   public static func getlocation( _ sLocation: String ) -> GXSoapLocation
   {
      var oReader : GXXMLReader
      var oLocation : GXSoapLocation
      if ( nLocRead == 0 )
      {
         oReader = GXXMLReader()
         oReader.openResource("location.xml")
         initlocations( oReader) ;
         if ( oReader.errCode == 0 )
         {
            oReader.close()
         }
      }
      nSOAPErr = 0
      oLocation = colLocations.item(sLocation)
      nSOAPErr = 0
      if ( GXutil.strcmp(oLocation.name, sLocation) != 0 )
      {
         nSOAPErr = 1
      }
      assigngroupproperties( oLocation) ;
      if ( nSOAPErr != 0 )
      {
         nSOAPErr = -20007
         sSOAPErrMsg = "Invalid location name."
         oLocation = GXSoapLocation()
         oLocation.name = sLocation
         oLocation.host = ""
         oLocation.port = -1
         oLocation.baseURL = ""
         oLocation.secure = -1
         oLocation.proxyServerHost = ""
         oLocation.proxyServerPort = -1
         oLocation.timeout = -1
         oLocation.cancelOnError = 0
         oLocation.authentication = 0
         oLocation.authenticationMethod = 0
         oLocation.authenticationRealm = ""
         oLocation.authenticationUser = ""
         oLocation.authenticationPassword = ""
         oLocation.groupLocation = ""
         colLocations.add(oLocation, sLocation)
      }
      else
      {
         nSOAPErr = 0
         sSOAPErrMsg = ""
      }
      return oLocation
   }

   public static func assignlocationproperties( _ sLocation: String ,
                                                _ oClient: GXHttpClient )
   {
      var oLocation : GXSoapLocation
      var oGroupLocation : GXSoapLocation
      var sGroupLocation : String
      var nGroupErr : Int
      oLocation = SoapParm.getlocation(sLocation)
      if ( nSOAPErr != 0 )
      {
         sGroupLocation = "LOC:"  +  oClient.host  +  oClient.baseURL
         oGroupLocation = colLocations.item(sGroupLocation)
         nGroupErr = 0
         if ( GXutil.strcmp(oGroupLocation.name, sGroupLocation) != 0 )
         {
            nGroupErr = 1
         }
         if ( nGroupErr == 0 )
         {
            nSOAPErr = 0
            oLocation.groupLocation = sGroupLocation
            assigngroupproperties( oLocation) ;
         }
      }
      if ( nSOAPErr == 0 )
      {
         if ( GXutil.strcmp(oLocation.host, "") != 0 )
         {
            oClient.host = oLocation.host
         }
         if ( oLocation.port != -1 )
         {
            oClient.port = oLocation.port
         }
         if ( GXutil.strcmp(oLocation.proxyServerHost, "") != 0 )
         {
            oClient.proxyServerHost = oLocation.proxyServerHost
         }
         if ( oLocation.proxyServerPort != -1 )
         {
            oClient.proxyServerPort = oLocation.proxyServerPort
         }
         if ( GXutil.strcmp(oLocation.wsdlurl, "") != 0 )
         {
            oClient.wsdlurl = oLocation.wsdlurl
         }
         if ( GXutil.strcmp(oLocation.baseURL, "") != 0 )
         {
            oClient.baseURL = oLocation.baseURL
         }
         if ( oLocation.secure != -1 )
         {
            oClient.secure = oLocation.secure.boolValue()
         }
         if ( oLocation.timeout != -1 )
         {
            oClient.timeout = oLocation.timeout
         }
         if ( GXutil.strcmp(oLocation.proxyAuthenticationUser, "") != 0 )
         {
            oClient.addProxyAuthentication(oLocation.proxyAuthenticationMethod, oLocation.proxyAuthenticationRealm, oLocation.proxyAuthenticationUser, oLocation.proxyAuthenticationPassword)
         }
         if ( GXutil.strcmp(oLocation.certificate, "") != 0 )
         {
            oClient.addCertificate(oLocation.certificate)
         }
         if ( oLocation.authentication == 1 )
         {
            oClient.addAuthentication(oLocation.authenticationMethod, oLocation.authenticationRealm, oLocation.authenticationUser, oLocation.authenticationPassword)
         }
      }
   }

   public static func getresourcename( _ sLocation: String ) -> String
   {
      var oLocation : GXSoapLocation
      oLocation = SoapParm.getlocation(sLocation)
      if ( nSOAPErr == 0 )
      {
         return oLocation.resourceName
      }
      else
      {
         return ""
      }
   }

}

