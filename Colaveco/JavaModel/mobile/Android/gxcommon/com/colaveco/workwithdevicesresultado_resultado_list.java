/*
               File: WorkWithDevicesResultado_Resultado_List
        Description: WorkWithDevicesResultado_Resultado_List
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:54.58
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class workwithdevicesresultado_resultado_list extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      long aP1 = 0;
      int aP2 = 0;
      com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] aP3 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt()};

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("ExternalId"));
      aP1 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("TipoinformeId"));
      aP2 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2, aP3);

      IEntity outObjGXM1WorkWithDevicesResultado_Resultado_ListSdt =  AndroidContext.ApplicationContext.createEntity("", "WorkWithDevicesResultado_Resultado_List", null);
      if (aP3[0] != null)
      {
         aP3[0].sdttoentity(outObjGXM1WorkWithDevicesResultado_Resultado_ListSdt );
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM1WorkWithDevicesResultado_Resultado_ListSdt);


      return true ;
   }

   public workwithdevicesresultado_resultado_list( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_list.class ), "" );
   }

   public workwithdevicesresultado_resultado_list( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt executeUdp( long aP0 ,
                                                                                 long aP1 ,
                                                                                 int aP2 )
   {
      workwithdevicesresultado_resultado_list.this.AV7ExternalId = aP0;
      workwithdevicesresultado_resultado_list.this.AV8TipoinformeId = aP1;
      workwithdevicesresultado_resultado_list.this.AV17gxid = aP2;
      workwithdevicesresultado_resultado_list.this.aP3 = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] {new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt()};
      initialize();
      privateExecute();
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
      workwithdevicesresultado_resultado_list.this.AV17gxid = aP2;
      workwithdevicesresultado_resultado_list.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV17gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV23Imagen_GXI);
         Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado);
         Gxwebsession.setValue(Gxids, "true");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = workwithdevicesresultado_resultado_list.this.AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      AV23Imagen_GXI = "" ;
      AV5estado = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV17gxid ;
   private long AV7ExternalId ;
   private long AV8TipoinformeId ;
   private String Gxids ;
   private String AV23Imagen_GXI ;
   private String AV5estado ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt[] aP3 ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_ListSdt AV20GXM1WorkWithDevicesResultado_Resultado_ListSdt ;
}

