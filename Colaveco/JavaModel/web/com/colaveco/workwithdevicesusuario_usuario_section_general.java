package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesusuario_usuario_section_general extends GXProcedure
{
   public workwithdevicesusuario_usuario_section_general( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesusuario_usuario_section_general.class ), "" );
   }

   public workwithdevicesusuario_usuario_section_general( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt executeUdp( long aP0 ,
                                                                                        int aP1 )
   {
      workwithdevicesusuario_usuario_section_general.this.aP2 = new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt[] {new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt[] aP2 )
   {
      workwithdevicesusuario_usuario_section_general.this.A5UsuarioId = aP0;
      workwithdevicesusuario_usuario_section_general.this.AV6gxid = aP1;
      workwithdevicesusuario_usuario_section_general.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(A5UsuarioId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A114UsuarioEmail = P00002_A114UsuarioEmail[0] ;
         n114UsuarioEmail = P00002_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = P00002_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = P00002_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = P00002_A116UsuarioNombre[0] ;
         n116UsuarioNombre = P00002_n116UsuarioNombre[0] ;
         A117UsuarioDicose = P00002_A117UsuarioDicose[0] ;
         n117UsuarioDicose = P00002_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = P00002_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = P00002_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = P00002_A119UsuarioRut[0] ;
         n119UsuarioRut = P00002_n119UsuarioRut[0] ;
         A120UsuarioIdNet = P00002_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = P00002_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = P00002_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = P00002_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = P00002_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = P00002_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = P00002_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = P00002_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = P00002_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = P00002_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = P00002_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = P00002_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = P00002_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = P00002_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = P00002_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = P00002_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = P00002_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = P00002_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = P00002_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = P00002_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = P00002_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = P00002_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = P00002_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = P00002_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = P00002_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = P00002_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = P00002_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = P00002_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = P00002_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = P00002_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = P00002_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = P00002_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = P00002_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = P00002_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = P00002_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = P00002_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = P00002_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = P00002_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = P00002_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = P00002_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = P00002_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = P00002_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = P00002_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = P00002_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = P00002_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = P00002_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = P00002_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = P00002_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = P00002_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = P00002_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = P00002_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = P00002_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = P00002_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = P00002_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = P00002_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = P00002_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = P00002_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = P00002_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = P00002_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = P00002_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = P00002_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = P00002_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = P00002_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = P00002_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = P00002_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = P00002_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = P00002_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = P00002_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = P00002_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = P00002_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = P00002_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = P00002_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = P00002_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = P00002_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = P00002_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = P00002_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = P00002_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = P00002_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = P00002_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = P00002_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = P00002_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = P00002_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = P00002_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = P00002_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = P00002_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = P00002_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = P00002_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = P00002_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = P00002_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = P00002_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = P00002_A165UsuarioCedula[0] ;
         n165UsuarioCedula = P00002_n165UsuarioCedula[0] ;
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioid( A5UsuarioId );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioemail( A114UsuarioEmail );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariousuarioweb( A115UsuarioUsuarioWeb );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionombre( A116UsuarioNombre );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodicose( A117UsuarioDicose );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorazonsocial( A118UsuarioRazonSocial );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariorut( A119UsuarioRut );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidnet( A120UsuarioIdNet );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccion( A121UsuarioDireccion );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotipousuario( A122UsuarioTipousuario );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico1( A123UsuarioIdTecnico1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico2( A124UsuarioIdTecnico2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioidtecnico3( A125UsuarioIdTecnico3 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariodireccionfrasco( A126UsuarioDireccionFrasco );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioagenciafrasco( A127UsuarioAgenciaFrasco );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco1( A128UsuarioNotificacionFrasco1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionfrasco2( A129UsuarioNotificacionFrasco2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud1( A130UsuarioNotificacionSolicitud1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionsolicitud2( A131UsuarioNotificacionSolicitud2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado1( A132UsuarioNotificacionResultado1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionresultado2( A133UsuarioNotificacionResultado2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos1( A134UsuarioNotificacionAvisos1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarionotificacionavisos2( A135UsuarioNotificacionAvisos2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular1( A136UsuarioTecnicoCelular1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelular2( A137UsuarioTecnicoCelular2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre1( A138UsuarioTecnicoCelularNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicocelularnombre2( A139UsuarioTecnicoCelularNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono1( A140UsuarioTecnicoTelefono1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefono2( A141UsuarioTecnicoTelefono2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre1( A142UsuarioTecnicoTelefonoNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicotelefononombre2( A143UsuarioTecnicoTelefonoNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail1( A144UsuarioTecnicoEmail1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemail2( A145UsuarioTecnicoEmail2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre1( A146UsuarioTecnicoEmailNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariotecnicoemailnombre2( A147UsuarioTecnicoEmailNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuarioruttipo( A148UsuarioRutTipo );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdireccion( A149UsuarioFacDireccion );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofaclocalidad( A150UsuarioFacLocalidad );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacdepartamento( A151UsuarioFacDepartamento );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariofacemailenvio( A152UsuarioFacEmailEnvio );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular1( A153UsuarioCobranzaCelular1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelular2( A154UsuarioCobranzaCelular2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre1( A155UsuarioCobranzaCelularNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzacelularnombre2( A156UsuarioCobranzaCelularNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono1( A157UsuarioCobranzaTelefono1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefono2( A158UsuarioCobranzaTelefono2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre1( A159UsuarioCobranzaTelefonoNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzatelefononombre2( A160UsuarioCobranzaTelefonoNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail1( A161UsuarioCobranzaEmail1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemail2( A162UsuarioCobranzaEmail2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre1( A163UsuarioCobranzaEmailNombre1 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocobranzaemailnombre2( A164UsuarioCobranzaEmailNombre2 );
         AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt_Usuariocedula( A165UsuarioCedula );
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = workwithdevicesusuario_usuario_section_general.this.AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt = new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A5UsuarioId = new long[1] ;
      P00002_A114UsuarioEmail = new String[] {""} ;
      P00002_n114UsuarioEmail = new boolean[] {false} ;
      P00002_A115UsuarioUsuarioWeb = new String[] {""} ;
      P00002_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      P00002_A116UsuarioNombre = new String[] {""} ;
      P00002_n116UsuarioNombre = new boolean[] {false} ;
      P00002_A117UsuarioDicose = new String[] {""} ;
      P00002_n117UsuarioDicose = new boolean[] {false} ;
      P00002_A118UsuarioRazonSocial = new String[] {""} ;
      P00002_n118UsuarioRazonSocial = new boolean[] {false} ;
      P00002_A119UsuarioRut = new String[] {""} ;
      P00002_n119UsuarioRut = new boolean[] {false} ;
      P00002_A120UsuarioIdNet = new long[1] ;
      P00002_n120UsuarioIdNet = new boolean[] {false} ;
      P00002_A121UsuarioDireccion = new String[] {""} ;
      P00002_n121UsuarioDireccion = new boolean[] {false} ;
      P00002_A122UsuarioTipousuario = new short[1] ;
      P00002_n122UsuarioTipousuario = new boolean[] {false} ;
      P00002_A123UsuarioIdTecnico1 = new long[1] ;
      P00002_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      P00002_A124UsuarioIdTecnico2 = new long[1] ;
      P00002_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      P00002_A125UsuarioIdTecnico3 = new long[1] ;
      P00002_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      P00002_A126UsuarioDireccionFrasco = new String[] {""} ;
      P00002_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      P00002_A127UsuarioAgenciaFrasco = new short[1] ;
      P00002_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      P00002_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      P00002_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      P00002_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      P00002_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      P00002_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      P00002_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      P00002_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      P00002_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      P00002_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      P00002_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      P00002_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      P00002_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      P00002_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      P00002_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      P00002_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      P00002_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      P00002_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      P00002_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      P00002_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      P00002_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      P00002_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      P00002_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      P00002_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      P00002_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      P00002_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      P00002_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      P00002_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      P00002_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      P00002_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      P00002_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      P00002_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      P00002_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      P00002_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      P00002_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      P00002_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      P00002_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      P00002_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      P00002_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      P00002_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      P00002_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      P00002_A148UsuarioRutTipo = new String[] {""} ;
      P00002_n148UsuarioRutTipo = new boolean[] {false} ;
      P00002_A149UsuarioFacDireccion = new String[] {""} ;
      P00002_n149UsuarioFacDireccion = new boolean[] {false} ;
      P00002_A150UsuarioFacLocalidad = new String[] {""} ;
      P00002_n150UsuarioFacLocalidad = new boolean[] {false} ;
      P00002_A151UsuarioFacDepartamento = new String[] {""} ;
      P00002_n151UsuarioFacDepartamento = new boolean[] {false} ;
      P00002_A152UsuarioFacEmailEnvio = new String[] {""} ;
      P00002_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      P00002_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      P00002_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      P00002_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      P00002_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      P00002_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      P00002_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      P00002_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      P00002_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      P00002_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      P00002_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      P00002_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      P00002_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      P00002_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      P00002_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      P00002_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      P00002_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      P00002_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      P00002_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      P00002_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      P00002_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      P00002_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      P00002_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      P00002_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      P00002_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      P00002_A165UsuarioCedula = new String[] {""} ;
      P00002_n165UsuarioCedula = new boolean[] {false} ;
      A114UsuarioEmail = "" ;
      A115UsuarioUsuarioWeb = "" ;
      A116UsuarioNombre = "" ;
      A117UsuarioDicose = "" ;
      A118UsuarioRazonSocial = "" ;
      A119UsuarioRut = "" ;
      A121UsuarioDireccion = "" ;
      A126UsuarioDireccionFrasco = "" ;
      A128UsuarioNotificacionFrasco1 = "" ;
      A129UsuarioNotificacionFrasco2 = "" ;
      A130UsuarioNotificacionSolicitud1 = "" ;
      A131UsuarioNotificacionSolicitud2 = "" ;
      A132UsuarioNotificacionResultado1 = "" ;
      A133UsuarioNotificacionResultado2 = "" ;
      A134UsuarioNotificacionAvisos1 = "" ;
      A135UsuarioNotificacionAvisos2 = "" ;
      A136UsuarioTecnicoCelular1 = "" ;
      A137UsuarioTecnicoCelular2 = "" ;
      A138UsuarioTecnicoCelularNombre1 = "" ;
      A139UsuarioTecnicoCelularNombre2 = "" ;
      A140UsuarioTecnicoTelefono1 = "" ;
      A141UsuarioTecnicoTelefono2 = "" ;
      A142UsuarioTecnicoTelefonoNombre1 = "" ;
      A143UsuarioTecnicoTelefonoNombre2 = "" ;
      A144UsuarioTecnicoEmail1 = "" ;
      A145UsuarioTecnicoEmail2 = "" ;
      A146UsuarioTecnicoEmailNombre1 = "" ;
      A147UsuarioTecnicoEmailNombre2 = "" ;
      A148UsuarioRutTipo = "" ;
      A149UsuarioFacDireccion = "" ;
      A150UsuarioFacLocalidad = "" ;
      A151UsuarioFacDepartamento = "" ;
      A152UsuarioFacEmailEnvio = "" ;
      A153UsuarioCobranzaCelular1 = "" ;
      A154UsuarioCobranzaCelular2 = "" ;
      A155UsuarioCobranzaCelularNombre1 = "" ;
      A156UsuarioCobranzaCelularNombre2 = "" ;
      A157UsuarioCobranzaTelefono1 = "" ;
      A158UsuarioCobranzaTelefono2 = "" ;
      A159UsuarioCobranzaTelefonoNombre1 = "" ;
      A160UsuarioCobranzaTelefonoNombre2 = "" ;
      A161UsuarioCobranzaEmail1 = "" ;
      A162UsuarioCobranzaEmail2 = "" ;
      A163UsuarioCobranzaEmailNombre1 = "" ;
      A164UsuarioCobranzaEmailNombre2 = "" ;
      A165UsuarioCedula = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesusuario_usuario_section_general__default(),
         new Object[] {
             new Object[] {
            P00002_A5UsuarioId, P00002_A114UsuarioEmail, P00002_n114UsuarioEmail, P00002_A115UsuarioUsuarioWeb, P00002_n115UsuarioUsuarioWeb, P00002_A116UsuarioNombre, P00002_n116UsuarioNombre, P00002_A117UsuarioDicose, P00002_n117UsuarioDicose, P00002_A118UsuarioRazonSocial,
            P00002_n118UsuarioRazonSocial, P00002_A119UsuarioRut, P00002_n119UsuarioRut, P00002_A120UsuarioIdNet, P00002_n120UsuarioIdNet, P00002_A121UsuarioDireccion, P00002_n121UsuarioDireccion, P00002_A122UsuarioTipousuario, P00002_n122UsuarioTipousuario, P00002_A123UsuarioIdTecnico1,
            P00002_n123UsuarioIdTecnico1, P00002_A124UsuarioIdTecnico2, P00002_n124UsuarioIdTecnico2, P00002_A125UsuarioIdTecnico3, P00002_n125UsuarioIdTecnico3, P00002_A126UsuarioDireccionFrasco, P00002_n126UsuarioDireccionFrasco, P00002_A127UsuarioAgenciaFrasco, P00002_n127UsuarioAgenciaFrasco, P00002_A128UsuarioNotificacionFrasco1,
            P00002_n128UsuarioNotificacionFrasco1, P00002_A129UsuarioNotificacionFrasco2, P00002_n129UsuarioNotificacionFrasco2, P00002_A130UsuarioNotificacionSolicitud1, P00002_n130UsuarioNotificacionSolicitud1, P00002_A131UsuarioNotificacionSolicitud2, P00002_n131UsuarioNotificacionSolicitud2, P00002_A132UsuarioNotificacionResultado1, P00002_n132UsuarioNotificacionResultado1, P00002_A133UsuarioNotificacionResultado2,
            P00002_n133UsuarioNotificacionResultado2, P00002_A134UsuarioNotificacionAvisos1, P00002_n134UsuarioNotificacionAvisos1, P00002_A135UsuarioNotificacionAvisos2, P00002_n135UsuarioNotificacionAvisos2, P00002_A136UsuarioTecnicoCelular1, P00002_n136UsuarioTecnicoCelular1, P00002_A137UsuarioTecnicoCelular2, P00002_n137UsuarioTecnicoCelular2, P00002_A138UsuarioTecnicoCelularNombre1,
            P00002_n138UsuarioTecnicoCelularNombre1, P00002_A139UsuarioTecnicoCelularNombre2, P00002_n139UsuarioTecnicoCelularNombre2, P00002_A140UsuarioTecnicoTelefono1, P00002_n140UsuarioTecnicoTelefono1, P00002_A141UsuarioTecnicoTelefono2, P00002_n141UsuarioTecnicoTelefono2, P00002_A142UsuarioTecnicoTelefonoNombre1, P00002_n142UsuarioTecnicoTelefonoNombre1, P00002_A143UsuarioTecnicoTelefonoNombre2,
            P00002_n143UsuarioTecnicoTelefonoNombre2, P00002_A144UsuarioTecnicoEmail1, P00002_n144UsuarioTecnicoEmail1, P00002_A145UsuarioTecnicoEmail2, P00002_n145UsuarioTecnicoEmail2, P00002_A146UsuarioTecnicoEmailNombre1, P00002_n146UsuarioTecnicoEmailNombre1, P00002_A147UsuarioTecnicoEmailNombre2, P00002_n147UsuarioTecnicoEmailNombre2, P00002_A148UsuarioRutTipo,
            P00002_n148UsuarioRutTipo, P00002_A149UsuarioFacDireccion, P00002_n149UsuarioFacDireccion, P00002_A150UsuarioFacLocalidad, P00002_n150UsuarioFacLocalidad, P00002_A151UsuarioFacDepartamento, P00002_n151UsuarioFacDepartamento, P00002_A152UsuarioFacEmailEnvio, P00002_n152UsuarioFacEmailEnvio, P00002_A153UsuarioCobranzaCelular1,
            P00002_n153UsuarioCobranzaCelular1, P00002_A154UsuarioCobranzaCelular2, P00002_n154UsuarioCobranzaCelular2, P00002_A155UsuarioCobranzaCelularNombre1, P00002_n155UsuarioCobranzaCelularNombre1, P00002_A156UsuarioCobranzaCelularNombre2, P00002_n156UsuarioCobranzaCelularNombre2, P00002_A157UsuarioCobranzaTelefono1, P00002_n157UsuarioCobranzaTelefono1, P00002_A158UsuarioCobranzaTelefono2,
            P00002_n158UsuarioCobranzaTelefono2, P00002_A159UsuarioCobranzaTelefonoNombre1, P00002_n159UsuarioCobranzaTelefonoNombre1, P00002_A160UsuarioCobranzaTelefonoNombre2, P00002_n160UsuarioCobranzaTelefonoNombre2, P00002_A161UsuarioCobranzaEmail1, P00002_n161UsuarioCobranzaEmail1, P00002_A162UsuarioCobranzaEmail2, P00002_n162UsuarioCobranzaEmail2, P00002_A163UsuarioCobranzaEmailNombre1,
            P00002_n163UsuarioCobranzaEmailNombre1, P00002_A164UsuarioCobranzaEmailNombre2, P00002_n164UsuarioCobranzaEmailNombre2, P00002_A165UsuarioCedula, P00002_n165UsuarioCedula
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A122UsuarioTipousuario ;
   private short A127UsuarioAgenciaFrasco ;
   private short Gx_err ;
   private int AV6gxid ;
   private long A5UsuarioId ;
   private long A120UsuarioIdNet ;
   private long A123UsuarioIdTecnico1 ;
   private long A124UsuarioIdTecnico2 ;
   private long A125UsuarioIdTecnico3 ;
   private String scmdbuf ;
   private boolean n114UsuarioEmail ;
   private boolean n115UsuarioUsuarioWeb ;
   private boolean n116UsuarioNombre ;
   private boolean n117UsuarioDicose ;
   private boolean n118UsuarioRazonSocial ;
   private boolean n119UsuarioRut ;
   private boolean n120UsuarioIdNet ;
   private boolean n121UsuarioDireccion ;
   private boolean n122UsuarioTipousuario ;
   private boolean n123UsuarioIdTecnico1 ;
   private boolean n124UsuarioIdTecnico2 ;
   private boolean n125UsuarioIdTecnico3 ;
   private boolean n126UsuarioDireccionFrasco ;
   private boolean n127UsuarioAgenciaFrasco ;
   private boolean n128UsuarioNotificacionFrasco1 ;
   private boolean n129UsuarioNotificacionFrasco2 ;
   private boolean n130UsuarioNotificacionSolicitud1 ;
   private boolean n131UsuarioNotificacionSolicitud2 ;
   private boolean n132UsuarioNotificacionResultado1 ;
   private boolean n133UsuarioNotificacionResultado2 ;
   private boolean n134UsuarioNotificacionAvisos1 ;
   private boolean n135UsuarioNotificacionAvisos2 ;
   private boolean n136UsuarioTecnicoCelular1 ;
   private boolean n137UsuarioTecnicoCelular2 ;
   private boolean n138UsuarioTecnicoCelularNombre1 ;
   private boolean n139UsuarioTecnicoCelularNombre2 ;
   private boolean n140UsuarioTecnicoTelefono1 ;
   private boolean n141UsuarioTecnicoTelefono2 ;
   private boolean n142UsuarioTecnicoTelefonoNombre1 ;
   private boolean n143UsuarioTecnicoTelefonoNombre2 ;
   private boolean n144UsuarioTecnicoEmail1 ;
   private boolean n145UsuarioTecnicoEmail2 ;
   private boolean n146UsuarioTecnicoEmailNombre1 ;
   private boolean n147UsuarioTecnicoEmailNombre2 ;
   private boolean n148UsuarioRutTipo ;
   private boolean n149UsuarioFacDireccion ;
   private boolean n150UsuarioFacLocalidad ;
   private boolean n151UsuarioFacDepartamento ;
   private boolean n152UsuarioFacEmailEnvio ;
   private boolean n153UsuarioCobranzaCelular1 ;
   private boolean n154UsuarioCobranzaCelular2 ;
   private boolean n155UsuarioCobranzaCelularNombre1 ;
   private boolean n156UsuarioCobranzaCelularNombre2 ;
   private boolean n157UsuarioCobranzaTelefono1 ;
   private boolean n158UsuarioCobranzaTelefono2 ;
   private boolean n159UsuarioCobranzaTelefonoNombre1 ;
   private boolean n160UsuarioCobranzaTelefonoNombre2 ;
   private boolean n161UsuarioCobranzaEmail1 ;
   private boolean n162UsuarioCobranzaEmail2 ;
   private boolean n163UsuarioCobranzaEmailNombre1 ;
   private boolean n164UsuarioCobranzaEmailNombre2 ;
   private boolean n165UsuarioCedula ;
   private String A114UsuarioEmail ;
   private String A115UsuarioUsuarioWeb ;
   private String A116UsuarioNombre ;
   private String A117UsuarioDicose ;
   private String A118UsuarioRazonSocial ;
   private String A119UsuarioRut ;
   private String A121UsuarioDireccion ;
   private String A126UsuarioDireccionFrasco ;
   private String A128UsuarioNotificacionFrasco1 ;
   private String A129UsuarioNotificacionFrasco2 ;
   private String A130UsuarioNotificacionSolicitud1 ;
   private String A131UsuarioNotificacionSolicitud2 ;
   private String A132UsuarioNotificacionResultado1 ;
   private String A133UsuarioNotificacionResultado2 ;
   private String A134UsuarioNotificacionAvisos1 ;
   private String A135UsuarioNotificacionAvisos2 ;
   private String A136UsuarioTecnicoCelular1 ;
   private String A137UsuarioTecnicoCelular2 ;
   private String A138UsuarioTecnicoCelularNombre1 ;
   private String A139UsuarioTecnicoCelularNombre2 ;
   private String A140UsuarioTecnicoTelefono1 ;
   private String A141UsuarioTecnicoTelefono2 ;
   private String A142UsuarioTecnicoTelefonoNombre1 ;
   private String A143UsuarioTecnicoTelefonoNombre2 ;
   private String A144UsuarioTecnicoEmail1 ;
   private String A145UsuarioTecnicoEmail2 ;
   private String A146UsuarioTecnicoEmailNombre1 ;
   private String A147UsuarioTecnicoEmailNombre2 ;
   private String A148UsuarioRutTipo ;
   private String A149UsuarioFacDireccion ;
   private String A150UsuarioFacLocalidad ;
   private String A151UsuarioFacDepartamento ;
   private String A152UsuarioFacEmailEnvio ;
   private String A153UsuarioCobranzaCelular1 ;
   private String A154UsuarioCobranzaCelular2 ;
   private String A155UsuarioCobranzaCelularNombre1 ;
   private String A156UsuarioCobranzaCelularNombre2 ;
   private String A157UsuarioCobranzaTelefono1 ;
   private String A158UsuarioCobranzaTelefono2 ;
   private String A159UsuarioCobranzaTelefonoNombre1 ;
   private String A160UsuarioCobranzaTelefonoNombre2 ;
   private String A161UsuarioCobranzaEmail1 ;
   private String A162UsuarioCobranzaEmail2 ;
   private String A163UsuarioCobranzaEmailNombre1 ;
   private String A164UsuarioCobranzaEmailNombre2 ;
   private String A165UsuarioCedula ;
   private com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A5UsuarioId ;
   private String[] P00002_A114UsuarioEmail ;
   private boolean[] P00002_n114UsuarioEmail ;
   private String[] P00002_A115UsuarioUsuarioWeb ;
   private boolean[] P00002_n115UsuarioUsuarioWeb ;
   private String[] P00002_A116UsuarioNombre ;
   private boolean[] P00002_n116UsuarioNombre ;
   private String[] P00002_A117UsuarioDicose ;
   private boolean[] P00002_n117UsuarioDicose ;
   private String[] P00002_A118UsuarioRazonSocial ;
   private boolean[] P00002_n118UsuarioRazonSocial ;
   private String[] P00002_A119UsuarioRut ;
   private boolean[] P00002_n119UsuarioRut ;
   private long[] P00002_A120UsuarioIdNet ;
   private boolean[] P00002_n120UsuarioIdNet ;
   private String[] P00002_A121UsuarioDireccion ;
   private boolean[] P00002_n121UsuarioDireccion ;
   private short[] P00002_A122UsuarioTipousuario ;
   private boolean[] P00002_n122UsuarioTipousuario ;
   private long[] P00002_A123UsuarioIdTecnico1 ;
   private boolean[] P00002_n123UsuarioIdTecnico1 ;
   private long[] P00002_A124UsuarioIdTecnico2 ;
   private boolean[] P00002_n124UsuarioIdTecnico2 ;
   private long[] P00002_A125UsuarioIdTecnico3 ;
   private boolean[] P00002_n125UsuarioIdTecnico3 ;
   private String[] P00002_A126UsuarioDireccionFrasco ;
   private boolean[] P00002_n126UsuarioDireccionFrasco ;
   private short[] P00002_A127UsuarioAgenciaFrasco ;
   private boolean[] P00002_n127UsuarioAgenciaFrasco ;
   private String[] P00002_A128UsuarioNotificacionFrasco1 ;
   private boolean[] P00002_n128UsuarioNotificacionFrasco1 ;
   private String[] P00002_A129UsuarioNotificacionFrasco2 ;
   private boolean[] P00002_n129UsuarioNotificacionFrasco2 ;
   private String[] P00002_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] P00002_n130UsuarioNotificacionSolicitud1 ;
   private String[] P00002_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] P00002_n131UsuarioNotificacionSolicitud2 ;
   private String[] P00002_A132UsuarioNotificacionResultado1 ;
   private boolean[] P00002_n132UsuarioNotificacionResultado1 ;
   private String[] P00002_A133UsuarioNotificacionResultado2 ;
   private boolean[] P00002_n133UsuarioNotificacionResultado2 ;
   private String[] P00002_A134UsuarioNotificacionAvisos1 ;
   private boolean[] P00002_n134UsuarioNotificacionAvisos1 ;
   private String[] P00002_A135UsuarioNotificacionAvisos2 ;
   private boolean[] P00002_n135UsuarioNotificacionAvisos2 ;
   private String[] P00002_A136UsuarioTecnicoCelular1 ;
   private boolean[] P00002_n136UsuarioTecnicoCelular1 ;
   private String[] P00002_A137UsuarioTecnicoCelular2 ;
   private boolean[] P00002_n137UsuarioTecnicoCelular2 ;
   private String[] P00002_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] P00002_n138UsuarioTecnicoCelularNombre1 ;
   private String[] P00002_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] P00002_n139UsuarioTecnicoCelularNombre2 ;
   private String[] P00002_A140UsuarioTecnicoTelefono1 ;
   private boolean[] P00002_n140UsuarioTecnicoTelefono1 ;
   private String[] P00002_A141UsuarioTecnicoTelefono2 ;
   private boolean[] P00002_n141UsuarioTecnicoTelefono2 ;
   private String[] P00002_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] P00002_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] P00002_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] P00002_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] P00002_A144UsuarioTecnicoEmail1 ;
   private boolean[] P00002_n144UsuarioTecnicoEmail1 ;
   private String[] P00002_A145UsuarioTecnicoEmail2 ;
   private boolean[] P00002_n145UsuarioTecnicoEmail2 ;
   private String[] P00002_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] P00002_n146UsuarioTecnicoEmailNombre1 ;
   private String[] P00002_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] P00002_n147UsuarioTecnicoEmailNombre2 ;
   private String[] P00002_A148UsuarioRutTipo ;
   private boolean[] P00002_n148UsuarioRutTipo ;
   private String[] P00002_A149UsuarioFacDireccion ;
   private boolean[] P00002_n149UsuarioFacDireccion ;
   private String[] P00002_A150UsuarioFacLocalidad ;
   private boolean[] P00002_n150UsuarioFacLocalidad ;
   private String[] P00002_A151UsuarioFacDepartamento ;
   private boolean[] P00002_n151UsuarioFacDepartamento ;
   private String[] P00002_A152UsuarioFacEmailEnvio ;
   private boolean[] P00002_n152UsuarioFacEmailEnvio ;
   private String[] P00002_A153UsuarioCobranzaCelular1 ;
   private boolean[] P00002_n153UsuarioCobranzaCelular1 ;
   private String[] P00002_A154UsuarioCobranzaCelular2 ;
   private boolean[] P00002_n154UsuarioCobranzaCelular2 ;
   private String[] P00002_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] P00002_n155UsuarioCobranzaCelularNombre1 ;
   private String[] P00002_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] P00002_n156UsuarioCobranzaCelularNombre2 ;
   private String[] P00002_A157UsuarioCobranzaTelefono1 ;
   private boolean[] P00002_n157UsuarioCobranzaTelefono1 ;
   private String[] P00002_A158UsuarioCobranzaTelefono2 ;
   private boolean[] P00002_n158UsuarioCobranzaTelefono2 ;
   private String[] P00002_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] P00002_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] P00002_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] P00002_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] P00002_A161UsuarioCobranzaEmail1 ;
   private boolean[] P00002_n161UsuarioCobranzaEmail1 ;
   private String[] P00002_A162UsuarioCobranzaEmail2 ;
   private boolean[] P00002_n162UsuarioCobranzaEmail2 ;
   private String[] P00002_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] P00002_n163UsuarioCobranzaEmailNombre1 ;
   private String[] P00002_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] P00002_n164UsuarioCobranzaEmailNombre2 ;
   private String[] P00002_A165UsuarioCedula ;
   private boolean[] P00002_n165UsuarioCedula ;
   private com.colaveco.SdtWorkWithDevicesUsuario_Usuario_Section_GeneralSdt AV7GXM1WorkWithDevicesUsuario_Usuario_Section_GeneralSdt ;
}

final  class workwithdevicesusuario_usuario_section_general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ? ORDER BY `UsuarioId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
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

