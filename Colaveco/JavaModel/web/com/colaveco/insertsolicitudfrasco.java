package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insertsolicitudfrasco extends GXProcedure
{
   public insertsolicitudfrasco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insertsolicitudfrasco.class ), "" );
   }

   public insertsolicitudfrasco( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( long aP0 ,
                              short aP1 ,
                              short aP2 ,
                              short aP3 ,
                              short aP4 ,
                              short aP5 ,
                              String aP6 ,
                              String aP7 ,
                              String aP8 ,
                              long aP9 ,
                              String aP10 ,
                              String aP11 )
   {
      insertsolicitudfrasco.this.aP12 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        short aP2 ,
                        short aP3 ,
                        short aP4 ,
                        short aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        long aP9 ,
                        String aP10 ,
                        String aP11 ,
                        boolean[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             short aP2 ,
                             short aP3 ,
                             short aP4 ,
                             short aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             long aP9 ,
                             String aP10 ,
                             String aP11 ,
                             boolean[] aP12 )
   {
      insertsolicitudfrasco.this.AV8SDTAgenciaId = aP0;
      insertsolicitudfrasco.this.AV11SFFrascosAgua = aP1;
      insertsolicitudfrasco.this.AV9SFFrascosConC = aP2;
      insertsolicitudfrasco.this.AV14SFFrascosIsopo = aP3;
      insertsolicitudfrasco.this.AV12SFFrascosSangre = aP4;
      insertsolicitudfrasco.this.AV10SFFrascosSinC = aP5;
      insertsolicitudfrasco.this.AV13SFObservaciones = aP6;
      insertsolicitudfrasco.this.AV19UsuarioDireccion = aP7;
      insertsolicitudfrasco.this.AV18UsuarioEmail = aP8;
      insertsolicitudfrasco.this.AV15UsuarioIdNet = aP9;
      insertsolicitudfrasco.this.AV16UsuarioNombre = aP10;
      insertsolicitudfrasco.this.AV17UsuarioTecnicoTelefono1 = aP11;
      insertsolicitudfrasco.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfidnet( AV15UsuarioIdNet );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfnombre( AV16UsuarioNombre );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfdireccion( AV19UsuarioDireccion );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfagencia( (short)(AV8SDTAgenciaId) );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sftelefono( AV17UsuarioTecnicoTelefono1 );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfemail( AV18UsuarioEmail );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffrascosconc( AV9SFFrascosConC );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffrascossinc( AV10SFFrascosSinC );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffrascosagua( AV11SFFrascosAgua );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffrascossangre( AV12SFFrascosSangre );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sfobservaciones( AV13SFObservaciones );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffechacreacion( GXutil.now( ) );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffechamodificado( GXutil.now( ) );
      AV20SolicitudFrasco.setgxTv_SdtSolicitudFrasco_Sffrascosisopo( AV14SFFrascosIsopo );
      AV20SolicitudFrasco.Save();
      if ( AV20SolicitudFrasco.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "insertsolicitudfrasco");
         AV22result = true ;
      }
      else
      {
         AV22result = false ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = insertsolicitudfrasco.this.AV22result;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20SolicitudFrasco = new com.colaveco.SdtSolicitudFrasco(remoteHandle);
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.insertsolicitudfrasco__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.insertsolicitudfrasco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11SFFrascosAgua ;
   private short AV9SFFrascosConC ;
   private short AV14SFFrascosIsopo ;
   private short AV12SFFrascosSangre ;
   private short AV10SFFrascosSinC ;
   private short Gx_err ;
   private long AV8SDTAgenciaId ;
   private long AV15UsuarioIdNet ;
   private boolean AV22result ;
   private String AV13SFObservaciones ;
   private String AV19UsuarioDireccion ;
   private String AV18UsuarioEmail ;
   private String AV16UsuarioNombre ;
   private String AV17UsuarioTecnicoTelefono1 ;
   private com.colaveco.SdtSolicitudFrasco AV20SolicitudFrasco ;
   private boolean[] aP12 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_gam ;
}

final  class insertsolicitudfrasco__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class insertsolicitudfrasco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

