package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesresultado_resultado_list extends GXProcedure
{
   public workwithdevicesresultado_resultado_list( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_list.class ), "" );
   }

   public workwithdevicesresultado_resultado_list( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt executeUdp( long aP0 ,
                                                                                 long aP1 ,
                                                                                 int aP2 )
   {
      workwithdevicesresultado_resultado_list.this.aP3 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        int aP2 ,
                        com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             int aP2 ,
                             com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] aP3 )
   {
      workwithdevicesresultado_resultado_list.this.AV7ExternalId = aP0;
      workwithdevicesresultado_resultado_list.this.AV8TipoinformeId = aP1;
      workwithdevicesresultado_resultado_list.this.AV20gxid = aP2;
      workwithdevicesresultado_resultado_list.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV20gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV27Imagen_GXI);
         Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado);
         Gxwebsession.setValue(Gxids+"gxvar_Tipoinformenombre", AV14TipoinformeNombre);
         Gxwebsession.setValue(Gxids, "true");
      }
      if ( AV8TipoinformeId == 0 )
      {
         Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Tipodeinforme\",\"Caption\",\"" + GXutil.encodeJSON( "Todos los Resultados") + "\"]" ;
      }
      AV24GXM1WorkWithDevicesResultado_Resultado_ListSdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_ListSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = workwithdevicesresultado_resultado_list.this.AV24GXM1WorkWithDevicesResultado_Resultado_ListSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24GXM1WorkWithDevicesResultado_Resultado_ListSdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV27Imagen_GXI = "" ;
      AV5estado = "" ;
      AV14TipoinformeNombre = "" ;
      Gxdynprop = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV20gxid ;
   private long AV7ExternalId ;
   private long AV8TipoinformeId ;
   private String Gxids ;
   private String AV27Imagen_GXI ;
   private String AV5estado ;
   private String AV14TipoinformeNombre ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] aP3 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt AV24GXM1WorkWithDevicesResultado_Resultado_ListSdt ;
}

