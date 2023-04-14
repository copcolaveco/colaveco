package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSolicitudfrascoInsert_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSolicitudfrascoInsert_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtSolicitudfrascoInsert_Level_DetailSdt.class));
   }

   public SdtSolicitudfrascoInsert_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtSolicitudfrascoInsert_Level_DetailSdt");
   }

   public SdtSolicitudfrascoInsert_Level_DetailSdt( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSolicitudfrascoInsert_Level_DetailSdt");
   }

   public SdtSolicitudfrascoInsert_Level_DetailSdt( StructSdtSolicitudfrascoInsert_Level_DetailSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Usuarioidnet") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Usuarionombre") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Usuariodireccion") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Agencianombre") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Usuariotecnicotelefono1") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Usuarioemail") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sffrascosconc") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sffrascossinc") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sffrascosagua") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sffrascossangre") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sffrascosisopo") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sfobservaciones") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtagenciaid") )
            {
               gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SolicitudfrascoInsert_Level_DetailSdt" ;
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
      oWriter.writeElement("Usuarioidnet", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Usuarionombre", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Usuariodireccion", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Agencianombre", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Usuariotecnicotelefono1", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Usuarioemail", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sffrascosconc", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sffrascossinc", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sffrascosagua", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sffrascossangre", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sffrascosisopo", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sfobservaciones", GXutil.rtrim( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones));
      if ( GXutil.strcmp(sNameSpace, "http://tempuri.org/") != 0 )
      {
         oWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      oWriter.writeElement("Sdtagenciaid", GXutil.trim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid, 18, 0)));
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
      AddObjectProperty("Usuarioidnet", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet, 18, 0)), false, false);
      AddObjectProperty("Usuarionombre", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre, false, false);
      AddObjectProperty("Usuariodireccion", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion, false, false);
      AddObjectProperty("Agencianombre", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre, false, false);
      AddObjectProperty("Usuariotecnicotelefono1", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1, false, false);
      AddObjectProperty("Usuarioemail", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail, false, false);
      AddObjectProperty("Sffrascosconc", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc, false, false);
      AddObjectProperty("Sffrascossinc", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc, false, false);
      AddObjectProperty("Sffrascosagua", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua, false, false);
      AddObjectProperty("Sffrascossangre", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre, false, false);
      AddObjectProperty("Sffrascosisopo", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo, false, false);
      AddObjectProperty("Sfobservaciones", gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones, false, false);
      AddObjectProperty("Sdtagenciaid", GXutil.ltrim( GXutil.str( gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid, 18, 0)), false, false);
   }

   public long getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1 ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1 = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre = value ;
   }

   public short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo( short value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo = value ;
   }

   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones( String value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones = value ;
   }

   public long getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid ;
   }

   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid( long value )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N = (byte)(1) ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1 = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail = "" ;
      gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N ;
   }

   public com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtSolicitudfrascoInsert_Level_DetailSdt struct )
   {
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet(struct.getUsuarioidnet());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre(struct.getUsuarionombre());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion(struct.getUsuariodireccion());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre(struct.getAgencianombre());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1(struct.getUsuariotecnicotelefono1());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail(struct.getUsuarioemail());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc(struct.getSffrascosconc());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc(struct.getSffrascossinc());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua(struct.getSffrascosagua());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre(struct.getSffrascossangre());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo(struct.getSffrascosisopo());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones(struct.getSfobservaciones());
      setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid(struct.getSdtagenciaid());
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtSolicitudfrascoInsert_Level_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtSolicitudfrascoInsert_Level_DetailSdt struct = new com.colaveco.StructSdtSolicitudfrascoInsert_Level_DetailSdt ();
      struct.setUsuarioidnet(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet());
      struct.setUsuarionombre(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre());
      struct.setUsuariodireccion(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion());
      struct.setAgencianombre(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre());
      struct.setUsuariotecnicotelefono1(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1());
      struct.setUsuarioemail(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail());
      struct.setSffrascosconc(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc());
      struct.setSffrascossinc(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc());
      struct.setSffrascosagua(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua());
      struct.setSffrascossangre(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre());
      struct.setSffrascosisopo(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo());
      struct.setSfobservaciones(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones());
      struct.setSdtagenciaid(getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid());
      return struct ;
   }

   protected byte gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_N ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre ;
   protected short gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet ;
   protected long gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1 ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail ;
   protected String gxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones ;
}

