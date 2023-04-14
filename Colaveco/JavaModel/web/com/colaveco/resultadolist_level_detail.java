package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class resultadolist_level_detail extends GXProcedure
{
   public resultadolist_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resultadolist_level_detail.class ), "" );
   }

   public resultadolist_level_detail( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtResultadoList_Level_DetailSdt executeUdp( long aP0 ,
                                                                    long aP1 ,
                                                                    int aP2 )
   {
      resultadolist_level_detail.this.aP3 = new com.colaveco.SdtResultadoList_Level_DetailSdt[] {new com.colaveco.SdtResultadoList_Level_DetailSdt()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        int aP2 ,
                        com.colaveco.SdtResultadoList_Level_DetailSdt[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             int aP2 ,
                             com.colaveco.SdtResultadoList_Level_DetailSdt[] aP3 )
   {
      resultadolist_level_detail.this.AV6ExternalId = aP0;
      resultadolist_level_detail.this.AV8TipoinformeId = aP1;
      resultadolist_level_detail.this.AV16gxid = aP2;
      resultadolist_level_detail.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV16gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Sdtresultadolist", AV14SDTResultadoList.toJSonString(false));
         Gxwebsession.setValue(Gxids+"gxvar_Externalid", GXutil.str( AV6ExternalId, 18, 0));
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV6ExternalId = GXutil.lval( Gxwebsession.getValue(Gxids+"gxvar_Externalid")) ;
         AV14SDTResultadoList.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtresultadolist"), null);
      }
      AV6ExternalId = (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( new genexus.security.api.genexussecurity.SdtGAMUser(remoteHandle, context).getexternalid(), "."))) ;
      AV5SDTResultado.clear();
      AV14SDTResultadoList.clear();
      if ( AV8TipoinformeId == 0 )
      {
         GXt_objcol_SdtSDTResultado1 = AV5SDTResultado ;
         GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
         new com.colaveco.dpresultados(remoteHandle, context).execute( AV6ExternalId, GXv_objcol_SdtSDTResultado2) ;
         GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
         AV5SDTResultado = GXt_objcol_SdtSDTResultado1 ;
      }
      else
      {
         GXt_objcol_SdtSDTResultado1 = AV5SDTResultado ;
         GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
         new com.colaveco.dpresultadobyfilter(remoteHandle, context).execute( AV6ExternalId, AV8TipoinformeId, GXv_objcol_SdtSDTResultado2) ;
         GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
         AV5SDTResultado = GXt_objcol_SdtSDTResultado1 ;
      }
      GXt_objcol_SdtSDTResultado1 = AV14SDTResultadoList ;
      GXv_objcol_SdtSDTResultado2[0] = GXt_objcol_SdtSDTResultado1 ;
      new com.colaveco.refreshresultado(remoteHandle, context).execute( AV5SDTResultado, GXv_objcol_SdtSDTResultado2) ;
      GXt_objcol_SdtSDTResultado1 = GXv_objcol_SdtSDTResultado2[0] ;
      AV14SDTResultadoList = GXt_objcol_SdtSDTResultado1 ;
      if ( AV8TipoinformeId == 0 )
      {
         Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Tipoinforme\",\"Caption\",\"" + GXutil.encodeJSON( "Todos los Resultados") + "\"]" ;
      }
      AV20GXM1ResultadoList_Level_DetailSdt.setgxTv_SdtResultadoList_Level_DetailSdt_Tipoinformeid( AV8TipoinformeId );
      AV20GXM1ResultadoList_Level_DetailSdt.setgxTv_SdtResultadoList_Level_DetailSdt_Externalid( AV6ExternalId );
      AV20GXM1ResultadoList_Level_DetailSdt.setgxTv_SdtResultadoList_Level_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      Gxwebsession.setValue(Gxids+"gxvar_Sdtresultadolist", AV14SDTResultadoList.toJSonString(false));
      Gxwebsession.setValue(Gxids+"gxvar_Externalid", GXutil.str( AV6ExternalId, 18, 0));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = resultadolist_level_detail.this.AV20GXM1ResultadoList_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20GXM1ResultadoList_Level_DetailSdt = new com.colaveco.SdtResultadoList_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV14SDTResultadoList = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      AV5SDTResultado = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTResultado1 = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTResultado2 = new GXBaseCollection[1] ;
      Gxdynprop = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16gxid ;
   private long AV6ExternalId ;
   private long AV8TipoinformeId ;
   private String Gxids ;
   private String Gxdynprop ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV14SDTResultadoList ;
   private com.colaveco.SdtResultadoList_Level_DetailSdt[] aP3 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV5SDTResultado ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> GXt_objcol_SdtSDTResultado1 ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> GXv_objcol_SdtSDTResultado2[] ;
   private com.colaveco.SdtResultadoList_Level_DetailSdt AV20GXM1ResultadoList_Level_DetailSdt ;
}

