/*
               File: SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item
        Description: TipoinformeFiltro_Level_Detail_Grid1Sdt
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:32.23
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

public final  class SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item.class));
   }

   public SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item");
   }

   public SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item");
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void sdttoentity( IEntity androidEntity )
   {
      /*  Save BC members to entity  */
      IEntityList outObjTipoinformelist = AndroidContext.ApplicationContext.createEntityList();
      if (gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist != null)
      {
         for (int i = 0; i < gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.size(); i++)
         {
            com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem sdttyped = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem) gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.elementAt(i);
            IEntity objOutElement = AndroidContext.ApplicationContext.createEntity("", "SDTTipoinforme.SDTTipoinformeItem", androidEntity, outObjTipoinformelist);
            sdttyped.sdttoentity(objOutElement);
            outObjTipoinformelist.add(objOutElement);
         }
      }
      androidEntity.setProperty("Tipoinformelist",outObjTipoinformelist);
   }

   public void entitytosdt( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
      java.util.List<IEntity> inObjTipoinformelist = (java.util.List) androidEntity.getProperty("Tipoinformelist");
      if (inObjTipoinformelist != null)
      {
         gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist();
         for (IEntity propObj : inObjTipoinformelist)
         {
            com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem sdttyped = new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem();
            sdttyped.entitytosdt(propObj);
            gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.add(sdttyped);
         }
      }
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipoinformelist") )
            {
               if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist == null )
               {
                  gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.readxml(oReader, "Tipoinformelist") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Tipoinformelist") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "http://tempuri.org/" ;
         }
         else
         {
            sNameSpace1 = "http://tempuri.org/" ;
         }
         gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist.writexml(oWriter, "Tipoinformelist", sNameSpace1, sIncludeState);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist != null )
      {
         AddObjectProperty("Tipoinformelist", gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist, false, false);
      }
   }

   public GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist( )
   {
      if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist == null )
      {
         gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      }
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      return gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist ;
   }

   public void setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist( GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> value )
   {
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = value ;
   }

   public void setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist_SetNull( )
   {
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist = null ;
   }

   public boolean getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist_IsNull( )
   {
      if ( gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)(clone()) ;
   }

   protected byte gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> gxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist=null ;
}

