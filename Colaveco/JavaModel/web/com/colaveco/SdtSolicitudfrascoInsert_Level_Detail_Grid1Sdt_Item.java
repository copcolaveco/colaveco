package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( )
   {
      this(  new ModelContext(SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item.class));
   }

   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( ModelContext context )
   {
      super( context, "SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item");
   }

   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item");
   }

   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item( StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item struct )
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
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioIdNet") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioNombre") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioAgenciaFrasco") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioDireccion") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioEmail") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuarioTecnicoTelefono1") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 = oReader.getValue() ;
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
         sName = "SolicitudfrascoInsert_Level_Detail_Grid1Sdt.Item" ;
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
      oWriter.writeElement("UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioIdNet", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioNombre", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioAgenciaFrasco", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioDireccion", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioEmail", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("UsuarioTecnicoTelefono1", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1));
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
      AddObjectProperty("UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid, 18, 0)), false, false);
      AddObjectProperty("UsuarioIdNet", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet, 18, 0)), false, false);
      AddObjectProperty("UsuarioNombre", gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre, false, false);
      AddObjectProperty("UsuarioAgenciaFrasco", gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco, false, false);
      AddObjectProperty("UsuarioDireccion", gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion, false, false);
      AddObjectProperty("UsuarioEmail", gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail, false, false);
      AddObjectProperty("UsuarioTecnicoTelefono1", gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1, false, false);
   }

   public long getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid = value ;
   }

   public long getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N = (byte)(1) ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N ;
   }

   public com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item Clone( )
   {
      return (com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item struct )
   {
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid(struct.getUsuarioid());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet(struct.getUsuarioidnet());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre(struct.getUsuarionombre());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco(struct.getUsuarioagenciafrasco());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion(struct.getUsuariodireccion());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail(struct.getUsuarioemail());
      setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1(struct.getUsuariotecnicotelefono1());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item getStruct( )
   {
      com.colaveco.StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item struct = new com.colaveco.StructSdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item ();
      struct.setUsuarioid(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid());
      struct.setUsuarioidnet(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet());
      struct.setUsuarionombre(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre());
      struct.setUsuarioagenciafrasco(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco());
      struct.setUsuariodireccion(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion());
      struct.setUsuarioemail(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail());
      struct.setUsuariotecnicotelefono1(getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1());
      return struct ;
   }

   protected byte gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_N ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1 ;
}

