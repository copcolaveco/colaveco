/*
               File: SdtResultado
        Description: Resultado
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 7:39:34.55
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.artech.base.services.*;

public final  class SdtResultado extends GxSilentTrnSdt implements Cloneable, java.io.Serializable, IGxBusinessComponent
{
   public SdtResultado( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtResultado.class));
   }

   public SdtResultado( int remoteHandle ,
                        ModelContext context )
   {
      super( context, "SdtResultado");
      initialize( remoteHandle) ;
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( long AV1resultadoId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV1resultadoId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"resultadoId", long.class}}) ;
   }

   public void sdttoentity( IEntity androidEntity )
   {
      /*  Save BC members to entity  */
      androidEntity.setProperty("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoid, 18, 0)));
      androidEntity.setProperty("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha, 18, 0)));
      androidEntity.setProperty("resultadoComentarios", GXutil.trim( gxTv_SdtResultado_Resultadocomentarios));
      androidEntity.setProperty("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid, 18, 0)));
      androidEntity.setProperty("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid, 18, 0)));
      androidEntity.setProperty("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario, 18, 0)));
      androidEntity.setProperty("resultadoFechaCreado", GXutil.dateToCharREST( gxTv_SdtResultado_Resultadofechacreado));
      androidEntity.setProperty("resultadoFechaEmision", GXutil.dateToCharREST( gxTv_SdtResultado_Resultadofechaemision));
      androidEntity.setProperty("resultadoPathExcel", GXutil.trim( gxTv_SdtResultado_Resultadopathexcel));
      androidEntity.setProperty("resultadoPathPdf", GXutil.trim( gxTv_SdtResultado_Resultadopathpdf));
      androidEntity.setProperty("resultadoPathCsv", GXutil.trim( gxTv_SdtResultado_Resultadopathcsv));
      androidEntity.setProperty("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado, 18, 0)));
      androidEntity.setProperty("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro, 18, 0)));
      androidEntity.setProperty("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme, 18, 0)));
      androidEntity.setProperty("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado, 1, 0)));
      androidEntity.setProperty("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado, 18, 0)));
   }

   public void entitytosdt( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
      setgxTv_SdtResultado_Resultadoid( (long) GXutil.lval( androidEntity.optStringProperty("resultadoId")));
      setgxTv_SdtResultado_Resultadoficha( (long) GXutil.lval( androidEntity.optStringProperty("resultadoFicha")));
      setgxTv_SdtResultado_Resultadocomentarios( (String) androidEntity.optStringProperty("resultadoComentarios"));
      setgxTv_SdtResultado_Resultadouserid( (long) GXutil.lval( androidEntity.optStringProperty("resultadoUserId")));
      setgxTv_SdtResultado_Resultadotypeid( (long) GXutil.lval( androidEntity.optStringProperty("resultadoTypeId")));
      setgxTv_SdtResultado_Resultadoidnetusuario( (long) GXutil.lval( androidEntity.optStringProperty("resultadoIdNetUsuario")));
      setgxTv_SdtResultado_Resultadofechacreado( (java.util.Date) GXutil.charToDateREST( androidEntity.optStringProperty("resultadoFechaCreado")));
      setgxTv_SdtResultado_Resultadofechaemision( (java.util.Date) GXutil.charToDateREST( androidEntity.optStringProperty("resultadoFechaEmision")));
      setgxTv_SdtResultado_Resultadopathexcel( (String) androidEntity.optStringProperty("resultadoPathExcel"));
      setgxTv_SdtResultado_Resultadopathpdf( (String) androidEntity.optStringProperty("resultadoPathPdf"));
      setgxTv_SdtResultado_Resultadopathcsv( (String) androidEntity.optStringProperty("resultadoPathCsv"));
      setgxTv_SdtResultado_Resultadoidestado( (long) GXutil.lval( androidEntity.optStringProperty("resultadoIdEstado")));
      setgxTv_SdtResultado_Resultadoidlibro( (long) GXutil.lval( androidEntity.optStringProperty("resultadoIdLibro")));
      setgxTv_SdtResultado_Resultadoidnettipoinforme( (long) GXutil.lval( androidEntity.optStringProperty("resultadoIdNetTipoinforme")));
      setgxTv_SdtResultado_Resultadoeliminado( (byte) GXutil.lval( androidEntity.optStringProperty("resultadoEliminado")));
      setgxTv_SdtResultado_Resultadoabonado( (long) GXutil.lval( androidEntity.optStringProperty("resultadoAbonado")));
   }

   public void initentity( IEntity androidEntity )
   {
      /*  Load BC Defaults  */
      IGxSilentTrn trn = getTransaction();
      trn.getInsDefault();
      this.sdttoentity(androidEntity);
   }

   public boolean loadbcfromkey( IEntity androidEntity )
   {
      /*  Read BC keys from entity  */
      long AV1resultadoId;
      AV1resultadoId = GXutil.lval( androidEntity.optStringProperty("resultadoId")) ;
      /*  Load BC from keys  */
      this.Load(AV1resultadoId);
      /*  Save BC members to entity  */
      this.sdttoentity(androidEntity);
      return (boolean)(this.Success()) ;
   }

   public boolean savebcfromentity( IEntity androidEntity )
   {
      /*  Copy entity values to BC  */
      this.entitytosdt(androidEntity);
      /*  Save BC with entity changes  */
      this.Save();
      /*  Save BC members to entity  */
      this.sdttoentity(androidEntity);
      return (boolean)(this.Success()) ;
   }

   public boolean delete( )
   {
      this.Delete();
      return (boolean)(this.Success()) ;
   }

   public boolean success( )
   {
      return (boolean)(this.Success()) ;
   }

   public com.genexus.internet.MsgList getmessages( )
   {
      IGxSilentTrn trn = getTransaction();
      return (com.genexus.internet.MsgList)(trn.GetMessages()) ;
   }

   public String getbcname( )
   {
      return "Resultado" ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Resultado");
      metadata.set("BT", "Resultado");
      metadata.set("PK", "[ \"resultadoId\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoId") )
            {
               gxTv_SdtResultado_Resultadoid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha") )
            {
               gxTv_SdtResultado_Resultadoficha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios") )
            {
               gxTv_SdtResultado_Resultadocomentarios = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId") )
            {
               gxTv_SdtResultado_Resultadouserid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId") )
            {
               gxTv_SdtResultado_Resultadotypeid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel") )
            {
               gxTv_SdtResultado_Resultadopathexcel = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf") )
            {
               gxTv_SdtResultado_Resultadopathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv") )
            {
               gxTv_SdtResultado_Resultadopathcsv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado") )
            {
               gxTv_SdtResultado_Resultadoidestado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro") )
            {
               gxTv_SdtResultado_Resultadoidlibro = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado") )
            {
               gxTv_SdtResultado_Resultadoeliminado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado") )
            {
               gxTv_SdtResultado_Resultadoabonado = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtResultado_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtResultado_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoId_Z") )
            {
               gxTv_SdtResultado_Resultadoid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha_Z") )
            {
               gxTv_SdtResultado_Resultadoficha_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios_Z") )
            {
               gxTv_SdtResultado_Resultadocomentarios_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId_Z") )
            {
               gxTv_SdtResultado_Resultadouserid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId_Z") )
            {
               gxTv_SdtResultado_Resultadotypeid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario_Z") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechacreado_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtResultado_Resultadofechaemision_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel_Z") )
            {
               gxTv_SdtResultado_Resultadopathexcel_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf_Z") )
            {
               gxTv_SdtResultado_Resultadopathpdf_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv_Z") )
            {
               gxTv_SdtResultado_Resultadopathcsv_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado_Z") )
            {
               gxTv_SdtResultado_Resultadoidestado_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro_Z") )
            {
               gxTv_SdtResultado_Resultadoidlibro_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetTipoinforme_Z") )
            {
               gxTv_SdtResultado_Resultadoidnettipoinforme_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado_Z") )
            {
               gxTv_SdtResultado_Resultadoeliminado_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado_Z") )
            {
               gxTv_SdtResultado_Resultadoabonado_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFicha_N") )
            {
               gxTv_SdtResultado_Resultadoficha_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoComentarios_N") )
            {
               gxTv_SdtResultado_Resultadocomentarios_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoUserId_N") )
            {
               gxTv_SdtResultado_Resultadouserid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoTypeId_N") )
            {
               gxTv_SdtResultado_Resultadotypeid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdNetUsuario_N") )
            {
               gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaCreado_N") )
            {
               gxTv_SdtResultado_Resultadofechacreado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoFechaEmision_N") )
            {
               gxTv_SdtResultado_Resultadofechaemision_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathExcel_N") )
            {
               gxTv_SdtResultado_Resultadopathexcel_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathPdf_N") )
            {
               gxTv_SdtResultado_Resultadopathpdf_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoPathCsv_N") )
            {
               gxTv_SdtResultado_Resultadopathcsv_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdEstado_N") )
            {
               gxTv_SdtResultado_Resultadoidestado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoIdLibro_N") )
            {
               gxTv_SdtResultado_Resultadoidlibro_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoEliminado_N") )
            {
               gxTv_SdtResultado_Resultadoeliminado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "resultadoAbonado_N") )
            {
               gxTv_SdtResultado_Resultadoabonado_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Resultado" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Colaveco" ;
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
      oWriter.writeElement("resultadoId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoFicha", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoComentarios", GXutil.rtrim( gxTv_SdtResultado_Resultadocomentarios));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoUserId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoTypeId", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetUsuario", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaCreado", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("resultadoFechaEmision", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathExcel", GXutil.rtrim( gxTv_SdtResultado_Resultadopathexcel));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathPdf", GXutil.rtrim( gxTv_SdtResultado_Resultadopathpdf));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoPathCsv", GXutil.rtrim( gxTv_SdtResultado_Resultadopathcsv));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdEstado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdLibro", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoIdNetTipoinforme", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoEliminado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      oWriter.writeElement("resultadoAbonado", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Colaveco");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtResultado_Mode));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtResultado_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFicha_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoComentarios_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadocomentarios_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoUserId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoTypeId_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetUsuario_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaCreado_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("resultadoFechaEmision_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathExcel_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathexcel_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathPdf_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathpdf_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathCsv_Z", GXutil.rtrim( gxTv_SdtResultado_Resultadopathcsv_Z));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdEstado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdLibro_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetTipoinforme_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoEliminado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoAbonado_Z", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFicha_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoficha_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoComentarios_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadocomentarios_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoUserId_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadouserid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoTypeId_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdNetUsuario_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFechaCreado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadofechacreado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoFechaEmision_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadofechaemision_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathExcel_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathexcel_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathPdf_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathpdf_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoPathCsv_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadopathcsv_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdEstado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoIdLibro_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoEliminado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoeliminado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
         oWriter.writeElement("resultadoAbonado_N", GXutil.trim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Colaveco") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Colaveco");
         }
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
      AddObjectProperty("resultadoId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoFicha", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoficha, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoFicha_N", gxTv_SdtResultado_Resultadoficha_N, false, includeNonInitialized);
      AddObjectProperty("resultadoComentarios", gxTv_SdtResultado_Resultadocomentarios, false, includeNonInitialized);
      AddObjectProperty("resultadoComentarios_N", gxTv_SdtResultado_Resultadocomentarios_N, false, includeNonInitialized);
      AddObjectProperty("resultadoUserId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadouserid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoUserId_N", gxTv_SdtResultado_Resultadouserid_N, false, includeNonInitialized);
      AddObjectProperty("resultadoTypeId", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadotypeid, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoTypeId_N", gxTv_SdtResultado_Resultadotypeid_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetUsuario", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetUsuario_N", gxTv_SdtResultado_Resultadoidnetusuario_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaCreado", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("resultadoFechaCreado_N", gxTv_SdtResultado_Resultadofechacreado_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("resultadoFechaEmision", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("resultadoFechaEmision_N", gxTv_SdtResultado_Resultadofechaemision_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathExcel", gxTv_SdtResultado_Resultadopathexcel, false, includeNonInitialized);
      AddObjectProperty("resultadoPathExcel_N", gxTv_SdtResultado_Resultadopathexcel_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathPdf", gxTv_SdtResultado_Resultadopathpdf, false, includeNonInitialized);
      AddObjectProperty("resultadoPathPdf_N", gxTv_SdtResultado_Resultadopathpdf_N, false, includeNonInitialized);
      AddObjectProperty("resultadoPathCsv", gxTv_SdtResultado_Resultadopathcsv, false, includeNonInitialized);
      AddObjectProperty("resultadoPathCsv_N", gxTv_SdtResultado_Resultadopathcsv_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdEstado", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidestado, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdEstado_N", gxTv_SdtResultado_Resultadoidestado_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdLibro", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoIdLibro_N", gxTv_SdtResultado_Resultadoidlibro_N, false, includeNonInitialized);
      AddObjectProperty("resultadoIdNetTipoinforme", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoEliminado", gxTv_SdtResultado_Resultadoeliminado, false, includeNonInitialized);
      AddObjectProperty("resultadoEliminado_N", gxTv_SdtResultado_Resultadoeliminado_N, false, includeNonInitialized);
      AddObjectProperty("resultadoAbonado", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoabonado, 18, 0)), false, includeNonInitialized);
      AddObjectProperty("resultadoAbonado_N", gxTv_SdtResultado_Resultadoabonado_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtResultado_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtResultado_Initialized, false, includeNonInitialized);
         AddObjectProperty("resultadoId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoFicha_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoficha_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoComentarios_Z", gxTv_SdtResultado_Resultadocomentarios_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoUserId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadouserid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoTypeId_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadotypeid_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetUsuario_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnetusuario_Z, 18, 0)), false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechacreado_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("resultadoFechaCreado_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResultado_Resultadofechaemision_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("resultadoFechaEmision_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("resultadoPathExcel_Z", gxTv_SdtResultado_Resultadopathexcel_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoPathPdf_Z", gxTv_SdtResultado_Resultadopathpdf_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoPathCsv_Z", gxTv_SdtResultado_Resultadopathcsv_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoIdEstado_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidestado_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdLibro_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidlibro_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetTipoinforme_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoidnettipoinforme_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoEliminado_Z", gxTv_SdtResultado_Resultadoeliminado_Z, false, includeNonInitialized);
         AddObjectProperty("resultadoAbonado_Z", GXutil.ltrim( GXutil.str( gxTv_SdtResultado_Resultadoabonado_Z, 18, 0)), false, includeNonInitialized);
         AddObjectProperty("resultadoFicha_N", gxTv_SdtResultado_Resultadoficha_N, false, includeNonInitialized);
         AddObjectProperty("resultadoComentarios_N", gxTv_SdtResultado_Resultadocomentarios_N, false, includeNonInitialized);
         AddObjectProperty("resultadoUserId_N", gxTv_SdtResultado_Resultadouserid_N, false, includeNonInitialized);
         AddObjectProperty("resultadoTypeId_N", gxTv_SdtResultado_Resultadotypeid_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdNetUsuario_N", gxTv_SdtResultado_Resultadoidnetusuario_N, false, includeNonInitialized);
         AddObjectProperty("resultadoFechaCreado_N", gxTv_SdtResultado_Resultadofechacreado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoFechaEmision_N", gxTv_SdtResultado_Resultadofechaemision_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathExcel_N", gxTv_SdtResultado_Resultadopathexcel_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathPdf_N", gxTv_SdtResultado_Resultadopathpdf_N, false, includeNonInitialized);
         AddObjectProperty("resultadoPathCsv_N", gxTv_SdtResultado_Resultadopathcsv_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdEstado_N", gxTv_SdtResultado_Resultadoidestado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoIdLibro_N", gxTv_SdtResultado_Resultadoidlibro_N, false, includeNonInitialized);
         AddObjectProperty("resultadoEliminado_N", gxTv_SdtResultado_Resultadoeliminado_N, false, includeNonInitialized);
         AddObjectProperty("resultadoAbonado_N", gxTv_SdtResultado_Resultadoabonado_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.colaveco.SdtResultado sdt )
   {
      if ( sdt.IsDirty("resultadoId") )
      {
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoid = sdt.getgxTv_SdtResultado_Resultadoid() ;
      }
      if ( sdt.IsDirty("resultadoFicha") )
      {
         gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoficha = sdt.getgxTv_SdtResultado_Resultadoficha() ;
      }
      if ( sdt.IsDirty("resultadoComentarios") )
      {
         gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadocomentarios = sdt.getgxTv_SdtResultado_Resultadocomentarios() ;
      }
      if ( sdt.IsDirty("resultadoUserId") )
      {
         gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadouserid = sdt.getgxTv_SdtResultado_Resultadouserid() ;
      }
      if ( sdt.IsDirty("resultadoTypeId") )
      {
         gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadotypeid = sdt.getgxTv_SdtResultado_Resultadotypeid() ;
      }
      if ( sdt.IsDirty("resultadoIdNetUsuario") )
      {
         gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidnetusuario = sdt.getgxTv_SdtResultado_Resultadoidnetusuario() ;
      }
      if ( sdt.IsDirty("resultadoFechaCreado") )
      {
         gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadofechacreado = sdt.getgxTv_SdtResultado_Resultadofechacreado() ;
      }
      if ( sdt.IsDirty("resultadoFechaEmision") )
      {
         gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadofechaemision = sdt.getgxTv_SdtResultado_Resultadofechaemision() ;
      }
      if ( sdt.IsDirty("resultadoPathExcel") )
      {
         gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathexcel = sdt.getgxTv_SdtResultado_Resultadopathexcel() ;
      }
      if ( sdt.IsDirty("resultadoPathPdf") )
      {
         gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathpdf = sdt.getgxTv_SdtResultado_Resultadopathpdf() ;
      }
      if ( sdt.IsDirty("resultadoPathCsv") )
      {
         gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadopathcsv = sdt.getgxTv_SdtResultado_Resultadopathcsv() ;
      }
      if ( sdt.IsDirty("resultadoIdEstado") )
      {
         gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidestado = sdt.getgxTv_SdtResultado_Resultadoidestado() ;
      }
      if ( sdt.IsDirty("resultadoIdLibro") )
      {
         gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidlibro = sdt.getgxTv_SdtResultado_Resultadoidlibro() ;
      }
      if ( sdt.IsDirty("resultadoIdNetTipoinforme") )
      {
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoidnettipoinforme = sdt.getgxTv_SdtResultado_Resultadoidnettipoinforme() ;
      }
      if ( sdt.IsDirty("resultadoEliminado") )
      {
         gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoeliminado = sdt.getgxTv_SdtResultado_Resultadoeliminado() ;
      }
      if ( sdt.IsDirty("resultadoAbonado") )
      {
         gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
         gxTv_SdtResultado_N = (byte)(0) ;
         gxTv_SdtResultado_Resultadoabonado = sdt.getgxTv_SdtResultado_Resultadoabonado() ;
      }
   }

   public long getgxTv_SdtResultado_Resultadoid( )
   {
      return gxTv_SdtResultado_Resultadoid ;
   }

   public void setgxTv_SdtResultado_Resultadoid( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      if ( gxTv_SdtResultado_Resultadoid != value )
      {
         gxTv_SdtResultado_Mode = "INS" ;
         this.setgxTv_SdtResultado_Resultadoid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoficha_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadocomentarios_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadouserid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadotypeid_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidnetusuario_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadofechacreado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadofechaemision_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathexcel_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathpdf_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadopathcsv_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidestado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidlibro_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoidnettipoinforme_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoeliminado_Z_SetNull( );
         this.setgxTv_SdtResultado_Resultadoabonado_Z_SetNull( );
      }
      SetDirty("Resultadoid");
      gxTv_SdtResultado_Resultadoid = value ;
   }

   public long getgxTv_SdtResultado_Resultadoficha( )
   {
      return gxTv_SdtResultado_Resultadoficha ;
   }

   public void setgxTv_SdtResultado_Resultadoficha( long value )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha");
      gxTv_SdtResultado_Resultadoficha = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoficha = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoficha_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadocomentarios( )
   {
      return gxTv_SdtResultado_Resultadocomentarios ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios( String value )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios");
      gxTv_SdtResultado_Resultadocomentarios = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadocomentarios = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadocomentarios_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadouserid( )
   {
      return gxTv_SdtResultado_Resultadouserid ;
   }

   public void setgxTv_SdtResultado_Resultadouserid( long value )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid");
      gxTv_SdtResultado_Resultadouserid = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadouserid = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadouserid_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadotypeid( )
   {
      return gxTv_SdtResultado_Resultadotypeid ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid( long value )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid");
      gxTv_SdtResultado_Resultadotypeid = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadotypeid = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadotypeid_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidnetusuario( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario( long value )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario");
      gxTv_SdtResultado_Resultadoidnetusuario = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidnetusuario = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidnetusuario_N==1) ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechacreado( )
   {
      return gxTv_SdtResultado_Resultadofechacreado ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado");
      gxTv_SdtResultado_Resultadofechacreado = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadofechacreado_N==1) ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechaemision( )
   {
      return gxTv_SdtResultado_Resultadofechaemision ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision( java.util.Date value )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision");
      gxTv_SdtResultado_Resultadofechaemision = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadofechaemision_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathexcel( )
   {
      return gxTv_SdtResultado_Resultadopathexcel ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel( String value )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel");
      gxTv_SdtResultado_Resultadopathexcel = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathexcel = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathexcel_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathpdf( )
   {
      return gxTv_SdtResultado_Resultadopathpdf ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf( String value )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf");
      gxTv_SdtResultado_Resultadopathpdf = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathpdf = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathpdf_N==1) ;
   }

   public String getgxTv_SdtResultado_Resultadopathcsv( )
   {
      return gxTv_SdtResultado_Resultadopathcsv ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv( String value )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv");
      gxTv_SdtResultado_Resultadopathcsv = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadopathcsv = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadopathcsv_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidestado( )
   {
      return gxTv_SdtResultado_Resultadoidestado ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado( long value )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado");
      gxTv_SdtResultado_Resultadoidestado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidestado = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidestado_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidlibro( )
   {
      return gxTv_SdtResultado_Resultadoidlibro ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro( long value )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro");
      gxTv_SdtResultado_Resultadoidlibro = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoidlibro = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoidlibro_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoidnettipoinforme( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnettipoinforme");
      gxTv_SdtResultado_Resultadoidnettipoinforme = value ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado( )
   {
      return gxTv_SdtResultado_Resultadoeliminado ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado( byte value )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado");
      gxTv_SdtResultado_Resultadoeliminado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoeliminado = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoeliminado_N==1) ;
   }

   public long getgxTv_SdtResultado_Resultadoabonado( )
   {
      return gxTv_SdtResultado_Resultadoabonado ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado( long value )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado");
      gxTv_SdtResultado_Resultadoabonado = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadoabonado = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_IsNull( )
   {
      return (gxTv_SdtResultado_Resultadoabonado_N==1) ;
   }

   public String getgxTv_SdtResultado_Mode( )
   {
      return gxTv_SdtResultado_Mode ;
   }

   public void setgxTv_SdtResultado_Mode( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtResultado_Mode = value ;
   }

   public void setgxTv_SdtResultado_Mode_SetNull( )
   {
      gxTv_SdtResultado_Mode = "" ;
   }

   public boolean getgxTv_SdtResultado_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtResultado_Initialized( )
   {
      return gxTv_SdtResultado_Initialized ;
   }

   public void setgxTv_SdtResultado_Initialized( short value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtResultado_Initialized = value ;
   }

   public void setgxTv_SdtResultado_Initialized_SetNull( )
   {
      gxTv_SdtResultado_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtResultado_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoid_Z( )
   {
      return gxTv_SdtResultado_Resultadoid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoid_Z");
      gxTv_SdtResultado_Resultadoid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoficha_Z( )
   {
      return gxTv_SdtResultado_Resultadoficha_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha_Z");
      gxTv_SdtResultado_Resultadoficha_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadocomentarios_Z( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_Z ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios_Z");
      gxTv_SdtResultado_Resultadocomentarios_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadouserid_Z( )
   {
      return gxTv_SdtResultado_Resultadouserid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid_Z");
      gxTv_SdtResultado_Resultadouserid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadotypeid_Z( )
   {
      return gxTv_SdtResultado_Resultadotypeid_Z ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid_Z");
      gxTv_SdtResultado_Resultadotypeid_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidnetusuario_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario_Z");
      gxTv_SdtResultado_Resultadoidnetusuario_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechacreado_Z( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado_Z");
      gxTv_SdtResultado_Resultadofechacreado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtResultado_Resultadofechaemision_Z( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_Z ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_Z( java.util.Date value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision_Z");
      gxTv_SdtResultado_Resultadofechaemision_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathexcel_Z( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel_Z");
      gxTv_SdtResultado_Resultadopathexcel_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathpdf_Z( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf_Z");
      gxTv_SdtResultado_Resultadopathpdf_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtResultado_Resultadopathcsv_Z( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_Z ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_Z( String value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv_Z");
      gxTv_SdtResultado_Resultadopathcsv_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_Z = "" ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidestado_Z( )
   {
      return gxTv_SdtResultado_Resultadoidestado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado_Z");
      gxTv_SdtResultado_Resultadoidestado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidlibro_Z( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro_Z");
      gxTv_SdtResultado_Resultadoidlibro_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoidnettipoinforme_Z( )
   {
      return gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnettipoinforme_Z");
      gxTv_SdtResultado_Resultadoidnettipoinforme_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnettipoinforme_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnettipoinforme_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnettipoinforme_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado_Z( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_Z( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado_Z");
      gxTv_SdtResultado_Resultadoeliminado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtResultado_Resultadoabonado_Z( )
   {
      return gxTv_SdtResultado_Resultadoabonado_Z ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_Z( long value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado_Z");
      gxTv_SdtResultado_Resultadoabonado_Z = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_Z_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_Z = 0 ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoficha_N( )
   {
      return gxTv_SdtResultado_Resultadoficha_N ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoficha_N");
      gxTv_SdtResultado_Resultadoficha_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoficha_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoficha_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoficha_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadocomentarios_N( )
   {
      return gxTv_SdtResultado_Resultadocomentarios_N ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadocomentarios_N");
      gxTv_SdtResultado_Resultadocomentarios_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadocomentarios_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadocomentarios_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadocomentarios_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadouserid_N( )
   {
      return gxTv_SdtResultado_Resultadouserid_N ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadouserid_N");
      gxTv_SdtResultado_Resultadouserid_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadouserid_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadouserid_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadouserid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadotypeid_N( )
   {
      return gxTv_SdtResultado_Resultadotypeid_N ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadotypeid_N");
      gxTv_SdtResultado_Resultadotypeid_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadotypeid_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadotypeid_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadotypeid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidnetusuario_N( )
   {
      return gxTv_SdtResultado_Resultadoidnetusuario_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidnetusuario_N");
      gxTv_SdtResultado_Resultadoidnetusuario_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidnetusuario_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidnetusuario_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidnetusuario_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadofechacreado_N( )
   {
      return gxTv_SdtResultado_Resultadofechacreado_N ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechacreado_N");
      gxTv_SdtResultado_Resultadofechacreado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechacreado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechacreado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechacreado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadofechaemision_N( )
   {
      return gxTv_SdtResultado_Resultadofechaemision_N ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadofechaemision_N");
      gxTv_SdtResultado_Resultadofechaemision_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadofechaemision_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadofechaemision_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadofechaemision_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathexcel_N( )
   {
      return gxTv_SdtResultado_Resultadopathexcel_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathexcel_N");
      gxTv_SdtResultado_Resultadopathexcel_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathexcel_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathexcel_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathexcel_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathpdf_N( )
   {
      return gxTv_SdtResultado_Resultadopathpdf_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathpdf_N");
      gxTv_SdtResultado_Resultadopathpdf_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathpdf_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathpdf_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathpdf_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadopathcsv_N( )
   {
      return gxTv_SdtResultado_Resultadopathcsv_N ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadopathcsv_N");
      gxTv_SdtResultado_Resultadopathcsv_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadopathcsv_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadopathcsv_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadopathcsv_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidestado_N( )
   {
      return gxTv_SdtResultado_Resultadoidestado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidestado_N");
      gxTv_SdtResultado_Resultadoidestado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidestado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidestado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidestado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoidlibro_N( )
   {
      return gxTv_SdtResultado_Resultadoidlibro_N ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoidlibro_N");
      gxTv_SdtResultado_Resultadoidlibro_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoidlibro_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoidlibro_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoidlibro_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoeliminado_N( )
   {
      return gxTv_SdtResultado_Resultadoeliminado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoeliminado_N");
      gxTv_SdtResultado_Resultadoeliminado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoeliminado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoeliminado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoeliminado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtResultado_Resultadoabonado_N( )
   {
      return gxTv_SdtResultado_Resultadoabonado_N ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_N( byte value )
   {
      gxTv_SdtResultado_N = (byte)(0) ;
      SetDirty("Resultadoabonado_N");
      gxTv_SdtResultado_Resultadoabonado_N = value ;
   }

   public void setgxTv_SdtResultado_Resultadoabonado_N_SetNull( )
   {
      gxTv_SdtResultado_Resultadoabonado_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtResultado_Resultadoabonado_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.colaveco.resultado_bc obj;
      obj = new com.colaveco.resultado_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtResultado_N = (byte)(1) ;
      gxTv_SdtResultado_Resultadocomentarios = "" ;
      gxTv_SdtResultado_Resultadofechacreado = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadofechaemision = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadopathexcel = "" ;
      gxTv_SdtResultado_Resultadopathpdf = "" ;
      gxTv_SdtResultado_Resultadopathcsv = "" ;
      gxTv_SdtResultado_Mode = "" ;
      gxTv_SdtResultado_Resultadocomentarios_Z = "" ;
      gxTv_SdtResultado_Resultadofechacreado_Z = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadofechaemision_Z = GXutil.nullDate() ;
      gxTv_SdtResultado_Resultadopathexcel_Z = "" ;
      gxTv_SdtResultado_Resultadopathpdf_Z = "" ;
      gxTv_SdtResultado_Resultadopathcsv_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtResultado_N ;
   }

   public com.colaveco.SdtResultado Clone( )
   {
      com.colaveco.SdtResultado sdt;
      com.colaveco.resultado_bc obj;
      sdt = (com.colaveco.SdtResultado)(clone()) ;
      obj = (com.colaveco.resultado_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   protected byte gxTv_SdtResultado_N ;
   protected byte gxTv_SdtResultado_Resultadoeliminado ;
   protected byte gxTv_SdtResultado_Resultadoeliminado_Z ;
   protected byte gxTv_SdtResultado_Resultadoficha_N ;
   protected byte gxTv_SdtResultado_Resultadocomentarios_N ;
   protected byte gxTv_SdtResultado_Resultadouserid_N ;
   protected byte gxTv_SdtResultado_Resultadotypeid_N ;
   protected byte gxTv_SdtResultado_Resultadoidnetusuario_N ;
   protected byte gxTv_SdtResultado_Resultadofechacreado_N ;
   protected byte gxTv_SdtResultado_Resultadofechaemision_N ;
   protected byte gxTv_SdtResultado_Resultadopathexcel_N ;
   protected byte gxTv_SdtResultado_Resultadopathpdf_N ;
   protected byte gxTv_SdtResultado_Resultadopathcsv_N ;
   protected byte gxTv_SdtResultado_Resultadoidestado_N ;
   protected byte gxTv_SdtResultado_Resultadoidlibro_N ;
   protected byte gxTv_SdtResultado_Resultadoeliminado_N ;
   protected byte gxTv_SdtResultado_Resultadoabonado_N ;
   protected short gxTv_SdtResultado_Initialized ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtResultado_Resultadoid ;
   protected long gxTv_SdtResultado_Resultadoficha ;
   protected long gxTv_SdtResultado_Resultadouserid ;
   protected long gxTv_SdtResultado_Resultadotypeid ;
   protected long gxTv_SdtResultado_Resultadoidnetusuario ;
   protected long gxTv_SdtResultado_Resultadoidestado ;
   protected long gxTv_SdtResultado_Resultadoidlibro ;
   protected long gxTv_SdtResultado_Resultadoidnettipoinforme ;
   protected long gxTv_SdtResultado_Resultadoabonado ;
   protected long gxTv_SdtResultado_Resultadoid_Z ;
   protected long gxTv_SdtResultado_Resultadoficha_Z ;
   protected long gxTv_SdtResultado_Resultadouserid_Z ;
   protected long gxTv_SdtResultado_Resultadotypeid_Z ;
   protected long gxTv_SdtResultado_Resultadoidnetusuario_Z ;
   protected long gxTv_SdtResultado_Resultadoidestado_Z ;
   protected long gxTv_SdtResultado_Resultadoidlibro_Z ;
   protected long gxTv_SdtResultado_Resultadoidnettipoinforme_Z ;
   protected long gxTv_SdtResultado_Resultadoabonado_Z ;
   protected String gxTv_SdtResultado_Mode ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechacreado ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechaemision ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechacreado_Z ;
   protected java.util.Date gxTv_SdtResultado_Resultadofechaemision_Z ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtResultado_Resultadocomentarios ;
   protected String gxTv_SdtResultado_Resultadopathexcel ;
   protected String gxTv_SdtResultado_Resultadopathpdf ;
   protected String gxTv_SdtResultado_Resultadopathcsv ;
   protected String gxTv_SdtResultado_Resultadocomentarios_Z ;
   protected String gxTv_SdtResultado_Resultadopathexcel_Z ;
   protected String gxTv_SdtResultado_Resultadopathpdf_Z ;
   protected String gxTv_SdtResultado_Resultadopathcsv_Z ;
}

