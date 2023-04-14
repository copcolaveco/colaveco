package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class misdatos_level_detail extends GXProcedure
{
   public misdatos_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( misdatos_level_detail.class ), "" );
   }

   public misdatos_level_detail( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtMisDatos_Level_DetailSdt executeUdp( int aP0 )
   {
      misdatos_level_detail.this.aP1 = new com.colaveco.SdtMisDatos_Level_DetailSdt[] {new com.colaveco.SdtMisDatos_Level_DetailSdt()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        com.colaveco.SdtMisDatos_Level_DetailSdt[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             com.colaveco.SdtMisDatos_Level_DetailSdt[] aP1 )
   {
      misdatos_level_detail.this.AV13gxid = aP0;
      misdatos_level_detail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV13gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Sdtusuario", AV9SDTUsuario.toJSonString(false, true));
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV9SDTUsuario.fromJSonString(Gxwebsession.getValue(Gxids+"gxvar_Sdtusuario"), null);
      }
      AV7IdExternal = (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( new genexus.security.api.genexussecurity.SdtGAMUser(remoteHandle, context).getexternalid(), "."))) ;
      GXt_SdtSDTUsuario1 = AV9SDTUsuario;
      GXv_SdtSDTUsuario2[0] = GXt_SdtSDTUsuario1;
      new com.colaveco.dpusuario(remoteHandle, context).execute( AV7IdExternal, GXv_SdtSDTUsuario2) ;
      GXt_SdtSDTUsuario1 = GXv_SdtSDTUsuario2[0] ;
      AV9SDTUsuario = GXt_SdtSDTUsuario1;
      AV16GXM1MisDatos_Level_DetailSdt.setgxTv_SdtMisDatos_Level_DetailSdt_Sdtusuario(AV9SDTUsuario);
      Gxwebsession.setValue(Gxids+"gxvar_Sdtusuario", AV9SDTUsuario.toJSonString(false, true));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = misdatos_level_detail.this.AV16GXM1MisDatos_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16GXM1MisDatos_Level_DetailSdt = new com.colaveco.SdtMisDatos_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV9SDTUsuario = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
      GXt_SdtSDTUsuario1 = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
      GXv_SdtSDTUsuario2 = new com.colaveco.SdtSDTUsuario[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13gxid ;
   private long AV7IdExternal ;
   private String Gxids ;
   private com.colaveco.SdtSDTUsuario AV9SDTUsuario ;
   private com.colaveco.SdtMisDatos_Level_DetailSdt[] aP1 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtSDTUsuario GXt_SdtSDTUsuario1 ;
   private com.colaveco.SdtSDTUsuario GXv_SdtSDTUsuario2[] ;
   private com.colaveco.SdtMisDatos_Level_DetailSdt AV16GXM1MisDatos_Level_DetailSdt ;
}

