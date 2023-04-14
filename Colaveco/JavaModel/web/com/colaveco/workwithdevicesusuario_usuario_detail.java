package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesusuario_usuario_detail extends GXProcedure
{
   public workwithdevicesusuario_usuario_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesusuario_usuario_detail.class ), "" );
   }

   public workwithdevicesusuario_usuario_detail( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt executeUdp( long aP0 ,
                                                                               int aP1 )
   {
      workwithdevicesusuario_usuario_detail.this.aP2 = new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt[] {new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt[] aP2 )
   {
      workwithdevicesusuario_usuario_detail.this.A5UsuarioId = aP0;
      workwithdevicesusuario_usuario_detail.this.AV6gxid = aP1;
      workwithdevicesusuario_usuario_detail.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV6gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         /* Using cursor P00002 */
         pr_default.execute(0, new Object[] {Long.valueOf(A5UsuarioId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A114UsuarioEmail = P00002_A114UsuarioEmail[0] ;
            n114UsuarioEmail = P00002_n114UsuarioEmail[0] ;
            Gxdynprop1 = A114UsuarioEmail ;
            Gxdynprop += ((GXutil.strcmp(Gxdynprop, "")==0) ? "" : ", ") + "[\"Form\",\"Caption\",\"" + GXutil.encodeJSON( Gxdynprop1) + "\"]" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         Gxwebsession.setValue(Gxids, "true");
      }
      AV11GXM2WorkWithDevicesUsuario_Usuario_DetailSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_DetailSdt_Gxdynprop( "[ "+Gxdynprop+" ]" );
      Gxdynprop = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesusuario_usuario_detail.this.AV11GXM2WorkWithDevicesUsuario_Usuario_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11GXM2WorkWithDevicesUsuario_Usuario_DetailSdt = new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      scmdbuf = "" ;
      P00002_A5UsuarioId = new long[1] ;
      P00002_A114UsuarioEmail = new String[] {""} ;
      P00002_n114UsuarioEmail = new boolean[] {false} ;
      A114UsuarioEmail = "" ;
      Gxdynprop1 = "" ;
      Gxdynprop = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesusuario_usuario_detail__default(),
         new Object[] {
             new Object[] {
            P00002_A5UsuarioId, P00002_A114UsuarioEmail, P00002_n114UsuarioEmail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV6gxid ;
   private long A5UsuarioId ;
   private String Gxids ;
   private String scmdbuf ;
   private boolean n114UsuarioEmail ;
   private String A114UsuarioEmail ;
   private String Gxdynprop1 ;
   private String Gxdynprop ;
   private com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A5UsuarioId ;
   private String[] P00002_A114UsuarioEmail ;
   private boolean[] P00002_n114UsuarioEmail ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtWorkWithDevicesUsuario_Usuario_DetailSdt AV11GXM2WorkWithDevicesUsuario_Usuario_DetailSdt ;
}

final  class workwithdevicesusuario_usuario_detail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `UsuarioId`, `UsuarioEmail` FROM `Usuario` WHERE `UsuarioId` = ? ORDER BY `UsuarioId` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

