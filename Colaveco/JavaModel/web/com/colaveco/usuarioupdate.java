package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class usuarioupdate extends GXProcedure
{
   public usuarioupdate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( usuarioupdate.class ), "" );
   }

   public usuarioupdate( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( com.colaveco.SdtSDTUsuario aP0 )
   {
      usuarioupdate.this.aP1 = new boolean[] {false};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.colaveco.SdtSDTUsuario aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.colaveco.SdtSDTUsuario aP0 ,
                             boolean[] aP1 )
   {
      usuarioupdate.this.AV8SDTUsuario = aP0;
      usuarioupdate.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Usuario.setgxTv_SdtUsuario_Usuarioagenciafrasco( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioagenciafrasco() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocedula( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocedula() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzacelular1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzacelular1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzacelular2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzacelular2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzacelularnombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzacelularnombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzacelularnombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzacelularnombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzaemail1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzaemail1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzaemail2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzaemail2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzaemailnombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzaemailnombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzaemailnombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzaemailnombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzatelefono1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzatelefono1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzatelefono2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzatelefono2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzatelefononombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzatelefononombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariocobranzatelefononombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariocobranzatelefononombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariodicose( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariodicose() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariodireccion( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariodireccion() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariodireccionfrasco( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariodireccionfrasco() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioemail( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioemail() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariofacdepartamento( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariofacdepartamento() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariofacdireccion( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariofacdireccion() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariofacemailenvio( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariofacemailenvio() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariofaclocalidad( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariofaclocalidad() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioid( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioid() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioidnet( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidnet() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioidtecnico1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidtecnico1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioidtecnico2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidtecnico2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioidtecnico3( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidtecnico3() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioidtecnico1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidtecnico1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionombre( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionombre() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionavisos1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionavisos1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionavisos2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionavisos2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionfrasco1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionfrasco2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionresultado1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionresultado1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionresultado2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionresultado2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionsolicitud1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionsolicitud1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarionotificacionsolicitud2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionotificacionsolicitud2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariorazonsocial( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariorazonsocial() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariorut( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariorut() );
      AV9Usuario.setgxTv_SdtUsuario_Usuarioruttipo( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioruttipo() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicocelular1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicocelular1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicocelular2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicocelular2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicocelularnombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicocelularnombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicocelularnombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicocelularnombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicoemail1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicoemail1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicoemail2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicoemail2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicoemailnombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicoemailnombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicoemailnombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicoemailnombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicotelefono1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicotelefono1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicotelefono2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicotelefono2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicotelefononombre1( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicotelefononombre1() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotecnicotelefononombre2( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicotelefononombre2() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariotipousuario( AV8SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotipousuario() );
      AV9Usuario.setgxTv_SdtUsuario_Usuariousuarioweb( AV9Usuario.getgxTv_SdtUsuario_Usuariousuarioweb() );
      new com.colaveco.loger(remoteHandle, context).execute( AV13Pgmname) ;
      new com.colaveco.loger(remoteHandle, context).execute( AV9Usuario.toJSonString(true, true)) ;
      new com.colaveco.loger(remoteHandle, context).execute( AV8SDTUsuario.toJSonString(false, true)) ;
      AV9Usuario.Update();
      if ( AV9Usuario.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "usuarioupdate");
         AV10result = true ;
      }
      else
      {
         AV10result = false ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = usuarioupdate.this.AV10result;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Usuario = new com.colaveco.SdtUsuario(remoteHandle);
      AV13Pgmname = "" ;
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuarioupdate__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuarioupdate__default(),
         new Object[] {
         }
      );
      AV13Pgmname = "UsuarioUpdate" ;
      /* GeneXus formulas. */
      AV13Pgmname = "UsuarioUpdate" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13Pgmname ;
   private boolean AV10result ;
   private com.colaveco.SdtUsuario AV9Usuario ;
   private boolean[] aP1 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_gam ;
   private com.colaveco.SdtSDTUsuario AV8SDTUsuario ;
}

final  class usuarioupdate__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "GAM";
   }

}

final  class usuarioupdate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

