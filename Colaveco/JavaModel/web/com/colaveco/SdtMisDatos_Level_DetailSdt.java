package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMisDatos_Level_DetailSdt extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtMisDatos_Level_DetailSdt( )
   {
      this(  new ModelContext(SdtMisDatos_Level_DetailSdt.class));
   }

   public SdtMisDatos_Level_DetailSdt( ModelContext context )
   {
      super( context, "SdtMisDatos_Level_DetailSdt");
   }

   public SdtMisDatos_Level_DetailSdt( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtMisDatos_Level_DetailSdt");
   }

   public SdtMisDatos_Level_DetailSdt( StructSdtMisDatos_Level_DetailSdt struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Sdtusuario") )
            {
               if ( gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario == null )
               {
                  gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario.readxml(oReader, "Sdtusuario") ;
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
         sName = "MisDatos_Level_DetailSdt" ;
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
      if ( gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario != null )
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
         gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario.writexml(oWriter, "Sdtusuario", sNameSpace1);
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
      if ( gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario != null )
      {
         AddObjectProperty("Sdtusuario", gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario, false, false);
      }
   }

   public com.colaveco.SdtSDTUsuario getgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario( )
   {
      if ( gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario == null )
      {
         gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
      }
      gxTv_SdtMisDatos_Level_DetailSdt_N = (byte)(0) ;
      return gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario ;
   }

   public void setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario( com.colaveco.SdtSDTUsuario value )
   {
      gxTv_SdtMisDatos_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario = value;
   }

   public void setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario_SetNull( )
   {
      gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario = (com.colaveco.SdtSDTUsuario)null;
   }

   public boolean getgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario_IsNull( )
   {
      if ( gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario == null )
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
      gxTv_SdtMisDatos_Level_DetailSdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMisDatos_Level_DetailSdt_N ;
   }

   public com.colaveco.SdtMisDatos_Level_DetailSdt Clone( )
   {
      return (com.colaveco.SdtMisDatos_Level_DetailSdt)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtMisDatos_Level_DetailSdt struct )
   {
      setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario(new com.colaveco.SdtSDTUsuario(struct.getSdtusuario()));
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtMisDatos_Level_DetailSdt getStruct( )
   {
      com.colaveco.StructSdtMisDatos_Level_DetailSdt struct = new com.colaveco.StructSdtMisDatos_Level_DetailSdt ();
      struct.setSdtusuario(getgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtMisDatos_Level_DetailSdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected com.colaveco.SdtSDTUsuario gxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario=null ;
}

