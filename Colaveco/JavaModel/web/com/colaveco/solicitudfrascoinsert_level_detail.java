package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class solicitudfrascoinsert_level_detail extends GXProcedure
{
   public solicitudfrascoinsert_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( solicitudfrascoinsert_level_detail.class ), "" );
   }

   public solicitudfrascoinsert_level_detail( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt executeUdp( int aP0 )
   {
      solicitudfrascoinsert_level_detail.this.aP1 = new com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt[] {new com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt[] aP1 )
   {
      solicitudfrascoinsert_level_detail.this.AV33gxid = aP0;
      solicitudfrascoinsert_level_detail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV33gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Usuarioidnet", GXutil.str( AV17UsuarioIdNet, 18, 0));
         Gxwebsession.setValue(Gxids+"gxvar_Usuarionombre", AV18UsuarioNombre);
         Gxwebsession.setValue(Gxids+"gxvar_Usuariodireccion", AV19UsuarioDireccion);
         Gxwebsession.setValue(Gxids+"gxvar_Agencianombre", AV13AgenciaNombre);
         Gxwebsession.setValue(Gxids+"gxvar_Usuariotecnicotelefono1", AV21UsuarioTecnicoTelefono1);
         Gxwebsession.setValue(Gxids+"gxvar_Usuarioemail", AV20UsuarioEmail);
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV17UsuarioIdNet = GXutil.lval( Gxwebsession.getValue(Gxids+"gxvar_Usuarioidnet")) ;
         AV20UsuarioEmail = Gxwebsession.getValue(Gxids+"gxvar_Usuarioemail") ;
         AV19UsuarioDireccion = Gxwebsession.getValue(Gxids+"gxvar_Usuariodireccion") ;
         AV18UsuarioNombre = Gxwebsession.getValue(Gxids+"gxvar_Usuarionombre") ;
         AV21UsuarioTecnicoTelefono1 = Gxwebsession.getValue(Gxids+"gxvar_Usuariotecnicotelefono1") ;
         AV13AgenciaNombre = Gxwebsession.getValue(Gxids+"gxvar_Agencianombre") ;
      }
      AV11ExternalId = (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( new genexus.security.api.genexussecurity.SdtGAMUser(remoteHandle, context).getexternalid(), "."))) ;
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = AV14SDTAgencia ;
      GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
      new com.colaveco.dpagencia(remoteHandle, context).execute( GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2) ;
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[0] ;
      AV14SDTAgencia = GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
      GXt_SdtSDTUsuario3 = AV22SDTUsuario;
      GXv_SdtSDTUsuario4[0] = GXt_SdtSDTUsuario3;
      new com.colaveco.dpusuario(remoteHandle, context).execute( AV11ExternalId, GXv_SdtSDTUsuario4) ;
      GXt_SdtSDTUsuario3 = GXv_SdtSDTUsuario4[0] ;
      AV22SDTUsuario = GXt_SdtSDTUsuario3;
      AV17UsuarioIdNet = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioidnet() ;
      AV20UsuarioEmail = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioemail() ;
      AV19UsuarioDireccion = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuariodireccion() ;
      AV18UsuarioNombre = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuarionombre() ;
      AV21UsuarioTecnicoTelefono1 = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuariotecnicotelefono1() ;
      AV12SDTAgenciaId = AV22SDTUsuario.getgxTv_SdtSDTUsuario_Usuarioagenciafrasco() ;
      GXt_char5 = AV13AgenciaNombre ;
      GXv_char6[0] = GXt_char5 ;
      new com.colaveco.agenciasnombres(remoteHandle, context).execute( AV12SDTAgenciaId, GXv_char6) ;
      solicitudfrascoinsert_level_detail.this.GXt_char5 = GXv_char6[0] ;
      AV13AgenciaNombre = GXt_char5 ;
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet( AV17UsuarioIdNet );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre( AV18UsuarioNombre );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion( AV19UsuarioDireccion );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre( AV13AgenciaNombre );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1( AV21UsuarioTecnicoTelefono1 );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail( AV20UsuarioEmail );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc( AV6SFFrascosConC );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc( AV7SFFrascosSinC );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua( AV9SFFrascosAgua );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre( AV8SFFrascosSangre );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo( AV10SFFrascosIsopo );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones( AV15SFObservaciones );
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid( AV12SDTAgenciaId );
      Gxwebsession.setValue(Gxids+"gxvar_Usuarioidnet", GXutil.str( AV17UsuarioIdNet, 18, 0));
      Gxwebsession.setValue(Gxids+"gxvar_Usuarioemail", AV20UsuarioEmail);
      Gxwebsession.setValue(Gxids+"gxvar_Usuariodireccion", AV19UsuarioDireccion);
      Gxwebsession.setValue(Gxids+"gxvar_Usuarionombre", AV18UsuarioNombre);
      Gxwebsession.setValue(Gxids+"gxvar_Usuariotecnicotelefono1", AV21UsuarioTecnicoTelefono1);
      Gxwebsession.setValue(Gxids+"gxvar_Agencianombre", AV13AgenciaNombre);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = solicitudfrascoinsert_level_detail.this.AV36GXM1SolicitudfrascoInsert_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36GXM1SolicitudfrascoInsert_Level_DetailSdt = new com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV18UsuarioNombre = "" ;
      AV19UsuarioDireccion = "" ;
      AV13AgenciaNombre = "" ;
      AV21UsuarioTecnicoTelefono1 = "" ;
      AV20UsuarioEmail = "" ;
      AV14SDTAgencia = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2 = new GXBaseCollection[1] ;
      AV22SDTUsuario = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
      GXt_SdtSDTUsuario3 = new com.colaveco.SdtSDTUsuario(remoteHandle, context);
      GXv_SdtSDTUsuario4 = new com.colaveco.SdtSDTUsuario[1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV15SFObservaciones = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV6SFFrascosConC ;
   private short AV7SFFrascosSinC ;
   private short AV9SFFrascosAgua ;
   private short AV8SFFrascosSangre ;
   private short AV10SFFrascosIsopo ;
   private short Gx_err ;
   private int AV33gxid ;
   private long AV17UsuarioIdNet ;
   private long AV11ExternalId ;
   private long AV12SDTAgenciaId ;
   private String Gxids ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String AV18UsuarioNombre ;
   private String AV19UsuarioDireccion ;
   private String AV13AgenciaNombre ;
   private String AV21UsuarioTecnicoTelefono1 ;
   private String AV20UsuarioEmail ;
   private String AV15SFObservaciones ;
   private com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt[] aP1 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> AV14SDTAgencia ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXt_objcol_SdtSDTAgencia_SDTAgenciaItem1 ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> GXv_objcol_SdtSDTAgencia_SDTAgenciaItem2[] ;
   private com.colaveco.SdtSDTUsuario AV22SDTUsuario ;
   private com.colaveco.SdtSDTUsuario GXt_SdtSDTUsuario3 ;
   private com.colaveco.SdtSDTUsuario GXv_SdtSDTUsuario4[] ;
   private com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt AV36GXM1SolicitudfrascoInsert_Level_DetailSdt ;
}

