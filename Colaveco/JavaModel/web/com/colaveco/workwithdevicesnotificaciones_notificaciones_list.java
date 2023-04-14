package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesnotificaciones_notificaciones_list extends GXProcedure
{
   public workwithdevicesnotificaciones_notificaciones_list( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesnotificaciones_notificaciones_list.class ), "" );
   }

   public workwithdevicesnotificaciones_notificaciones_list( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt executeUdp( long aP0 ,
                                                                                           int aP1 )
   {
      workwithdevicesnotificaciones_notificaciones_list.this.aP2 = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt[] {new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt[] aP2 )
   {
      workwithdevicesnotificaciones_notificaciones_list.this.AV5ExternalId = aP0;
      workwithdevicesnotificaciones_notificaciones_list.this.AV7gxid = aP1;
      workwithdevicesnotificaciones_notificaciones_list.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV7gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Notificacionesimagen", AV13Notificacionesimagen_GXI);
         Gxwebsession.setValue(Gxids, "true");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesnotificaciones_notificaciones_list.this.AV10GXM1WorkWithDevicesNotificaciones_Notificaciones_ListSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10GXM1WorkWithDevicesNotificaciones_Notificaciones_ListSdt = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV13Notificacionesimagen_GXI = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private long AV5ExternalId ;
   private String Gxids ;
   private String AV13Notificacionesimagen_GXI ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt[] aP2 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_ListSdt AV10GXM1WorkWithDevicesNotificaciones_Notificaciones_ListSdt ;
}

