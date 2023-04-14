package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item.class));
   }

   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item");
   }

   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item( StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioId") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail") )
            {
               gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail = oReader.getValue() ;
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
         sName = "WorkWithDevicesUsuario_Usuario_List_Grid1Sdt.Item" ;
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
      oWriter.writeElement("UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioEmail", GXutil.rtrim( gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail));
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
      AddObjectProperty("UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid, 18, 0)), false, false);
      AddObjectProperty("UsuarioEmail", gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail, false, false);
   }

   public long getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid( long value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid = value ;
   }

   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail ;
   }

   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail( String value )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item struct )
   {
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid(struct.getUsuarioid());
      setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail(struct.getUsuarioemail());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item struct = new com.colaveco.StructSdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item ();
      struct.setUsuarioid(getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid());
      struct.setUsuarioemail(getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail());
      return struct ;
   }

   protected byte gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail ;
}

