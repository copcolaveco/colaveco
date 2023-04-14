package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtgpxMenuItems_gpxMenuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtgpxMenuItems_gpxMenuItem( )
   {
      this(  new ModelContext(SdtgpxMenuItems_gpxMenuItem.class));
   }

   public SdtgpxMenuItems_gpxMenuItem( ModelContext context )
   {
      super( context, "SdtgpxMenuItems_gpxMenuItem");
   }

   public SdtgpxMenuItems_gpxMenuItem( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtgpxMenuItems_gpxMenuItem");
   }

   public SdtgpxMenuItems_gpxMenuItem( StructSdtgpxMenuItems_gpxMenuItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Code") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Code = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Title") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Title = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URL") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Url = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinkTarget") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Image") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Image = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Description") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Description = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Index") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Index = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubItems") )
            {
               if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
               {
                  gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>(com.colaveco.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItem", "Colaveco", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.readxml(oReader, "SubItems") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "SubItems") )
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
         sName = "gpxMenuItems.gpxMenuItem" ;
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
      oWriter.writeElement("Code", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Code));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("Title", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Title));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("URL", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Url));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("LinkTarget", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("Image", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Image));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("Description", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Description));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("Index", GXutil.trim( GXutil.str( gxTv_SdtgpxMenuItems_gpxMenuItem_Index, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "Colaveco") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "Colaveco" ;
         }
         else
         {
            sNameSpace1 = "Colaveco" ;
         }
         gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.writexml(oWriter, "SubItems", sNameSpace1, sIncludeState);
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
      AddObjectProperty("Code", gxTv_SdtgpxMenuItems_gpxMenuItem_Code, false, false);
      AddObjectProperty("Title", gxTv_SdtgpxMenuItems_gpxMenuItem_Title, false, false);
      AddObjectProperty("URL", gxTv_SdtgpxMenuItems_gpxMenuItem_Url, false, false);
      AddObjectProperty("LinkTarget", gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget, false, false);
      AddObjectProperty("Image", gxTv_SdtgpxMenuItems_gpxMenuItem_Image, false, false);
      AddObjectProperty("Description", gxTv_SdtgpxMenuItems_gpxMenuItem_Description, false, false);
      AddObjectProperty("Index", gxTv_SdtgpxMenuItems_gpxMenuItem_Index, false, false);
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems != null )
      {
         AddObjectProperty("SubItems", gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems, false, false);
      }
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Code( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Code( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Title( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Url( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Image( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Image( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Description( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = value ;
   }

   public short getgxTv_SdtgpxMenuItems_gpxMenuItem_Index( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Index( short value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Index = value ;
   }

   public GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems( )
   {
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
      {
         gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>(com.colaveco.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItem", "Colaveco", remoteHandle);
      }
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(0) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = value ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_SetNull( )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N = (byte)(1) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = null ;
   }

   public boolean getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_IsNull( )
   {
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_N = (byte)(1) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_N ;
   }

   public com.colaveco.SdtgpxMenuItems_gpxMenuItem Clone( )
   {
      return (com.colaveco.SdtgpxMenuItems_gpxMenuItem)(clone()) ;
   }

   public void setStruct( com.colaveco.StructSdtgpxMenuItems_gpxMenuItem struct )
   {
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Code(struct.getCode());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Title(struct.getTitle());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Url(struct.getUrl());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget(struct.getLinktarget());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Image(struct.getImage());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Description(struct.getDescription());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Index(struct.getIndex());
      GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux = new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>(com.colaveco.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItem", "Colaveco", remoteHandle);
      Vector<com.colaveco.StructSdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1 = struct.getSubitems();
      if (gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1.size(); i++)
         {
            gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux.add(new com.colaveco.SdtgpxMenuItems_gpxMenuItem(gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems(gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux);
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.StructSdtgpxMenuItems_gpxMenuItem getStruct( )
   {
      com.colaveco.StructSdtgpxMenuItems_gpxMenuItem struct = new com.colaveco.StructSdtgpxMenuItems_gpxMenuItem ();
      struct.setCode(getgxTv_SdtgpxMenuItems_gpxMenuItem_Code());
      struct.setTitle(getgxTv_SdtgpxMenuItems_gpxMenuItem_Title());
      struct.setUrl(getgxTv_SdtgpxMenuItems_gpxMenuItem_Url());
      struct.setLinktarget(getgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget());
      struct.setImage(getgxTv_SdtgpxMenuItems_gpxMenuItem_Image());
      struct.setDescription(getgxTv_SdtgpxMenuItems_gpxMenuItem_Description());
      struct.setIndex(getgxTv_SdtgpxMenuItems_gpxMenuItem_Index());
      struct.setSubitems(getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtgpxMenuItems_gpxMenuItem_N ;
   protected byte gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_N ;
   protected short gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux ;
   protected GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems=null ;
}

