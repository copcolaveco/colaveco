package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAgencias_Level_Detail_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtAgencias_Level_Detail_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtAgencias_Level_Detail_Grid1Sdt_Item.class));
   }

   public SdtAgencias_Level_Detail_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtAgencias_Level_Detail_Grid1Sdt_Item");
   }

   public SdtAgencias_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtAgencias_Level_Detail_Grid1Sdt_Item");
   }

   public SdtAgencias_Level_Detail_Grid1Sdt_Item( StructSdtAgencias_Level_Detail_Grid1Sdt_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtagencia") )
            {
               if ( gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia == null )
               {
                  gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia.readxml(oReader, "Sdtagencia") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtagencia") )
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
         sName = "Agencias_Level_Detail_Grid1Sdt.Item" ;
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
      if ( gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia != null )
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
         gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia.writexml(oWriter, "Sdtagencia", sNameSpace1, sIncludeState);
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
      if ( gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia != null )
      {
         AddObjectProperty("Sdtagencia", gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia, false, false);
      }
   }

   public GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> getgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia( )
   {
      if ( gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia == null )
      {
         gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      }
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      return gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia ;
   }

   public void setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia( GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> value )
   {
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia = value ;
   }

   public void setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_SetNull( )
   {
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia = null ;
   }

   public boolean getgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_IsNull( )
   {
      if ( gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia == null )
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
      gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtAgencias_Level_Detail_Grid1Sdt_Item struct )
   {
      GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      Vector<com.colaveco.StructSdtSDTAgencia_SDTAgenciaItem> gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux1 = struct.getSdtagencia();
      if (gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux1.size(); i++)
         {
            gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux.add(new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia(gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux);
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtAgencias_Level_Detail_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtAgencias_Level_Detail_Grid1Sdt_Item struct = new com.colaveco.StructSdtAgencias_Level_Detail_Grid1Sdt_Item ();
      struct.setSdtagencia(getgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia_aux ;
   protected GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> gxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia=null ;
}

