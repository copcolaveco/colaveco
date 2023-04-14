package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gamsdlogin_level_detail extends GXProcedure
{
   public gamsdlogin_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gamsdlogin_level_detail.class ), "" );
   }

   public gamsdlogin_level_detail( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtGAMSDLogin_Level_DetailSdt executeUdp( int aP0 )
   {
      gamsdlogin_level_detail.this.aP1 = new com.colaveco.SdtGAMSDLogin_Level_DetailSdt[] {new com.colaveco.SdtGAMSDLogin_Level_DetailSdt()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        com.colaveco.SdtGAMSDLogin_Level_DetailSdt[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             com.colaveco.SdtGAMSDLogin_Level_DetailSdt[] aP1 )
   {
      gamsdlogin_level_detail.this.AV15gxid = aP0;
      gamsdlogin_level_detail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV15gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Bienvenidalogin", AV13BienvenidaLogin);
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV13BienvenidaLogin = Gxwebsession.getValue(Gxids+"gxvar_Bienvenidalogin") ;
      }
      AV13BienvenidaLogin = "Bienvenido a la Nueva Herramienta de Autogestión de COLAVECO" ;
      AV18GXM1GAMSDLogin_Level_DetailSdt.setgxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin( AV13BienvenidaLogin );
      AV18GXM1GAMSDLogin_Level_DetailSdt.setgxTv_SdtGAMSDLogin_Level_DetailSdt_User( AV10User );
      AV18GXM1GAMSDLogin_Level_DetailSdt.setgxTv_SdtGAMSDLogin_Level_DetailSdt_Password( AV12Password );
      Gxwebsession.setValue(Gxids+"gxvar_Bienvenidalogin", AV13BienvenidaLogin);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = gamsdlogin_level_detail.this.AV18GXM1GAMSDLogin_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18GXM1GAMSDLogin_Level_DetailSdt = new com.colaveco.SdtGAMSDLogin_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV13BienvenidaLogin = "" ;
      AV10User = "" ;
      AV12Password = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15gxid ;
   private String Gxids ;
   private String AV12Password ;
   private String AV13BienvenidaLogin ;
   private String AV10User ;
   private com.colaveco.SdtGAMSDLogin_Level_DetailSdt[] aP1 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtGAMSDLogin_Level_DetailSdt AV18GXM1GAMSDLogin_Level_DetailSdt ;
}

