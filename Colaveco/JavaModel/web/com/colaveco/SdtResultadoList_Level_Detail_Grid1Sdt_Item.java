package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtResultadoList_Level_Detail_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtResultadoList_Level_Detail_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtResultadoList_Level_Detail_Grid1Sdt_Item.class));
   }

   public SdtResultadoList_Level_Detail_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtResultadoList_Level_Detail_Grid1Sdt_Item");
   }

   public SdtResultadoList_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtResultadoList_Level_Detail_Grid1Sdt_Item");
   }

   public SdtResultadoList_Level_Detail_Grid1Sdt_Item( StructSdtResultadoList_Level_Detail_Grid1Sdt_Item struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtresultadolist") )
            {
               if ( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist == null )
               {
                  gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist.readxml(oReader, "Sdtresultadolist") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtresultadolist") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipoinformeid") )
            {
               gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Externalid") )
            {
               gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
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
         sName = "ResultadoList_Level_Detail_Grid1Sdt.Item" ;
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
      if ( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist != null )
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
         gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist.writexml(oWriter, "Sdtresultadolist", sNameSpace1, sIncludeState);
      }
      oWriter.writeElement("Tipoinformeid", GXutil.trim( GXutil.str( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Externalid", GXutil.trim( GXutil.str( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      if ( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist != null )
      {
         AddObjectProperty("Sdtresultadolist", gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist, false, false);
      }
      AddObjectProperty("Tipoinformeid", GXutil.ltrim( GXutil.str( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid, 18, 0)), false, false);
      AddObjectProperty("Externalid", GXutil.ltrim( GXutil.str( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid, 18, 0)), false, false);
   }

   public GXBaseCollection<com.colaveco.SdtSDTResultado> getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist( )
   {
      if ( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist == null )
      {
         gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      }
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist ;
   }

   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist( GXBaseCollection<com.colaveco.SdtSDTResultado> value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist = value ;
   }

   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_SetNull( )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist = null ;
   }

   public boolean getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_IsNull( )
   {
      if ( gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist == null )
      {
         return true ;
      }
      return false ;
   }

   public long getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid ;
   }

   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid( long value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid = value ;
   }

   public long getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid ;
   }

   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid( long value )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtResultadoList_Level_Detail_Grid1Sdt_Item struct )
   {
      GXBaseCollection<com.colaveco.SdtSDTResultado> gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      Vector<com.colaveco.StructSdtSDTResultado> gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux1 = struct.getSdtresultadolist();
      if (gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux1.size(); i++)
         {
            gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux.add(new com.colaveco.SdtSDTResultado(gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist(gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux);
      setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid(struct.getTipoinformeid());
      setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid(struct.getExternalid());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtResultadoList_Level_Detail_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtResultadoList_Level_Detail_Grid1Sdt_Item struct = new com.colaveco.StructSdtResultadoList_Level_Detail_Grid1Sdt_Item ();
      struct.setSdtresultadolist(getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist().getStruct());
      struct.setTipoinformeid(getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid());
      struct.setExternalid(getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid());
      return struct ;
   }

   protected byte gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid ;
   protected long gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.colaveco.SdtSDTResultado> gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist_aux ;
   protected GXBaseCollection<com.colaveco.SdtSDTResultado> gxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist=null ;
}

