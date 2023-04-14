package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesusuario_usuario_list_grid1 extends GXProcedure
{
   public workwithdevicesusuario_usuario_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesusuario_usuario_list_grid1.class ), "" );
   }

   public workwithdevicesusuario_usuario_list_grid1( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item> executeUdp( String aP0 ,
                                                                                                          long aP1 ,
                                                                                                          long aP2 ,
                                                                                                          int aP3 )
   {
      workwithdevicesusuario_usuario_list_grid1.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        long aP2 ,
                        int aP3 ,
                        GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             long aP2 ,
                             int aP3 ,
                             GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>[] aP4 )
   {
      workwithdevicesusuario_usuario_list_grid1.this.AV8SearchText = aP0;
      workwithdevicesusuario_usuario_list_grid1.this.AV6start = aP1;
      workwithdevicesusuario_usuario_list_grid1.this.AV7count = aP2;
      workwithdevicesusuario_usuario_list_grid1.this.AV5gxid = aP3;
      workwithdevicesusuario_usuario_list_grid1.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)(AV6start) ;
      GXPagingTo2 = (int)(((AV7count>0) ? AV7count : 100000000)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8SearchText ,
                                           A114UsuarioEmail ,
                                           A115UsuarioUsuarioWeb ,
                                           A116UsuarioNombre ,
                                           A117UsuarioDicose ,
                                           A118UsuarioRazonSocial ,
                                           A119UsuarioRut ,
                                           A121UsuarioDireccion ,
                                           A126UsuarioDireccionFrasco ,
                                           A128UsuarioNotificacionFrasco1 ,
                                           A129UsuarioNotificacionFrasco2 ,
                                           A130UsuarioNotificacionSolicitud1 ,
                                           A131UsuarioNotificacionSolicitud2 ,
                                           A132UsuarioNotificacionResultado1 ,
                                           A133UsuarioNotificacionResultado2 ,
                                           A134UsuarioNotificacionAvisos1 ,
                                           A135UsuarioNotificacionAvisos2 ,
                                           A136UsuarioTecnicoCelular1 ,
                                           A137UsuarioTecnicoCelular2 ,
                                           A138UsuarioTecnicoCelularNombre1 ,
                                           A139UsuarioTecnicoCelularNombre2 ,
                                           A140UsuarioTecnicoTelefono1 ,
                                           A141UsuarioTecnicoTelefono2 ,
                                           A142UsuarioTecnicoTelefonoNombre1 ,
                                           A143UsuarioTecnicoTelefonoNombre2 ,
                                           A144UsuarioTecnicoEmail1 ,
                                           A145UsuarioTecnicoEmail2 ,
                                           A146UsuarioTecnicoEmailNombre1 ,
                                           A147UsuarioTecnicoEmailNombre2 ,
                                           A148UsuarioRutTipo ,
                                           A149UsuarioFacDireccion ,
                                           A150UsuarioFacLocalidad ,
                                           A151UsuarioFacDepartamento ,
                                           A152UsuarioFacEmailEnvio ,
                                           A153UsuarioCobranzaCelular1 ,
                                           A154UsuarioCobranzaCelular2 ,
                                           A155UsuarioCobranzaCelularNombre1 ,
                                           A156UsuarioCobranzaCelularNombre2 ,
                                           A157UsuarioCobranzaTelefono1 ,
                                           A158UsuarioCobranzaTelefono2 ,
                                           A159UsuarioCobranzaTelefonoNombre1 ,
                                           A160UsuarioCobranzaTelefonoNombre2 ,
                                           A161UsuarioCobranzaEmail1 ,
                                           A162UsuarioCobranzaEmail2 ,
                                           A163UsuarioCobranzaEmailNombre1 ,
                                           A164UsuarioCobranzaEmailNombre2 ,
                                           A165UsuarioCedula } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
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
         A121UsuarioDireccion = P00002_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = P00002_n121UsuarioDireccion[0] ;
         A126UsuarioDireccionFrasco = P00002_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = P00002_n126UsuarioDireccionFrasco[0] ;
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
         A5UsuarioId = P00002_A5UsuarioId[0] ;
         AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item(remoteHandle, context);
         AV9GXM2RootCol.add(AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt, 0);
         AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid( A5UsuarioId );
         AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail( A114UsuarioEmail );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = workwithdevicesusuario_usuario_list_grid1.this.AV9GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item.class, "WorkWithDevicesUsuario_Usuario_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      scmdbuf = "" ;
      lV8SearchText = "" ;
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
      P00002_A121UsuarioDireccion = new String[] {""} ;
      P00002_n121UsuarioDireccion = new boolean[] {false} ;
      P00002_A126UsuarioDireccionFrasco = new String[] {""} ;
      P00002_n126UsuarioDireccionFrasco = new boolean[] {false} ;
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
      P00002_A5UsuarioId = new long[1] ;
      AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesusuario_usuario_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A114UsuarioEmail, P00002_n114UsuarioEmail, P00002_A115UsuarioUsuarioWeb, P00002_n115UsuarioUsuarioWeb, P00002_A116UsuarioNombre, P00002_n116UsuarioNombre, P00002_A117UsuarioDicose, P00002_n117UsuarioDicose, P00002_A118UsuarioRazonSocial, P00002_n118UsuarioRazonSocial,
            P00002_A119UsuarioRut, P00002_n119UsuarioRut, P00002_A121UsuarioDireccion, P00002_n121UsuarioDireccion, P00002_A126UsuarioDireccionFrasco, P00002_n126UsuarioDireccionFrasco, P00002_A128UsuarioNotificacionFrasco1, P00002_n128UsuarioNotificacionFrasco1, P00002_A129UsuarioNotificacionFrasco2, P00002_n129UsuarioNotificacionFrasco2,
            P00002_A130UsuarioNotificacionSolicitud1, P00002_n130UsuarioNotificacionSolicitud1, P00002_A131UsuarioNotificacionSolicitud2, P00002_n131UsuarioNotificacionSolicitud2, P00002_A132UsuarioNotificacionResultado1, P00002_n132UsuarioNotificacionResultado1, P00002_A133UsuarioNotificacionResultado2, P00002_n133UsuarioNotificacionResultado2, P00002_A134UsuarioNotificacionAvisos1, P00002_n134UsuarioNotificacionAvisos1,
            P00002_A135UsuarioNotificacionAvisos2, P00002_n135UsuarioNotificacionAvisos2, P00002_A136UsuarioTecnicoCelular1, P00002_n136UsuarioTecnicoCelular1, P00002_A137UsuarioTecnicoCelular2, P00002_n137UsuarioTecnicoCelular2, P00002_A138UsuarioTecnicoCelularNombre1, P00002_n138UsuarioTecnicoCelularNombre1, P00002_A139UsuarioTecnicoCelularNombre2, P00002_n139UsuarioTecnicoCelularNombre2,
            P00002_A140UsuarioTecnicoTelefono1, P00002_n140UsuarioTecnicoTelefono1, P00002_A141UsuarioTecnicoTelefono2, P00002_n141UsuarioTecnicoTelefono2, P00002_A142UsuarioTecnicoTelefonoNombre1, P00002_n142UsuarioTecnicoTelefonoNombre1, P00002_A143UsuarioTecnicoTelefonoNombre2, P00002_n143UsuarioTecnicoTelefonoNombre2, P00002_A144UsuarioTecnicoEmail1, P00002_n144UsuarioTecnicoEmail1,
            P00002_A145UsuarioTecnicoEmail2, P00002_n145UsuarioTecnicoEmail2, P00002_A146UsuarioTecnicoEmailNombre1, P00002_n146UsuarioTecnicoEmailNombre1, P00002_A147UsuarioTecnicoEmailNombre2, P00002_n147UsuarioTecnicoEmailNombre2, P00002_A148UsuarioRutTipo, P00002_n148UsuarioRutTipo, P00002_A149UsuarioFacDireccion, P00002_n149UsuarioFacDireccion,
            P00002_A150UsuarioFacLocalidad, P00002_n150UsuarioFacLocalidad, P00002_A151UsuarioFacDepartamento, P00002_n151UsuarioFacDepartamento, P00002_A152UsuarioFacEmailEnvio, P00002_n152UsuarioFacEmailEnvio, P00002_A153UsuarioCobranzaCelular1, P00002_n153UsuarioCobranzaCelular1, P00002_A154UsuarioCobranzaCelular2, P00002_n154UsuarioCobranzaCelular2,
            P00002_A155UsuarioCobranzaCelularNombre1, P00002_n155UsuarioCobranzaCelularNombre1, P00002_A156UsuarioCobranzaCelularNombre2, P00002_n156UsuarioCobranzaCelularNombre2, P00002_A157UsuarioCobranzaTelefono1, P00002_n157UsuarioCobranzaTelefono1, P00002_A158UsuarioCobranzaTelefono2, P00002_n158UsuarioCobranzaTelefono2, P00002_A159UsuarioCobranzaTelefonoNombre1, P00002_n159UsuarioCobranzaTelefonoNombre1,
            P00002_A160UsuarioCobranzaTelefonoNombre2, P00002_n160UsuarioCobranzaTelefonoNombre2, P00002_A161UsuarioCobranzaEmail1, P00002_n161UsuarioCobranzaEmail1, P00002_A162UsuarioCobranzaEmail2, P00002_n162UsuarioCobranzaEmail2, P00002_A163UsuarioCobranzaEmailNombre1, P00002_n163UsuarioCobranzaEmailNombre1, P00002_A164UsuarioCobranzaEmailNombre2, P00002_n164UsuarioCobranzaEmailNombre2,
            P00002_A165UsuarioCedula, P00002_n165UsuarioCedula, P00002_A5UsuarioId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV5gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV6start ;
   private long AV7count ;
   private long A5UsuarioId ;
   private String scmdbuf ;
   private boolean n114UsuarioEmail ;
   private boolean n115UsuarioUsuarioWeb ;
   private boolean n116UsuarioNombre ;
   private boolean n117UsuarioDicose ;
   private boolean n118UsuarioRazonSocial ;
   private boolean n119UsuarioRut ;
   private boolean n121UsuarioDireccion ;
   private boolean n126UsuarioDireccionFrasco ;
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
   private String AV8SearchText ;
   private String lV8SearchText ;
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
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>[] aP4 ;
   private IDataStoreProvider pr_default ;
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
   private String[] P00002_A121UsuarioDireccion ;
   private boolean[] P00002_n121UsuarioDireccion ;
   private String[] P00002_A126UsuarioDireccionFrasco ;
   private boolean[] P00002_n126UsuarioDireccionFrasco ;
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
   private long[] P00002_A5UsuarioId ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item> AV9GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item AV10GXM1WorkWithDevicesUsuario_Usuario_List_Grid1Sdt ;
}

final  class workwithdevicesusuario_usuario_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV8SearchText ,
                                          String A114UsuarioEmail ,
                                          String A115UsuarioUsuarioWeb ,
                                          String A116UsuarioNombre ,
                                          String A117UsuarioDicose ,
                                          String A118UsuarioRazonSocial ,
                                          String A119UsuarioRut ,
                                          String A121UsuarioDireccion ,
                                          String A126UsuarioDireccionFrasco ,
                                          String A128UsuarioNotificacionFrasco1 ,
                                          String A129UsuarioNotificacionFrasco2 ,
                                          String A130UsuarioNotificacionSolicitud1 ,
                                          String A131UsuarioNotificacionSolicitud2 ,
                                          String A132UsuarioNotificacionResultado1 ,
                                          String A133UsuarioNotificacionResultado2 ,
                                          String A134UsuarioNotificacionAvisos1 ,
                                          String A135UsuarioNotificacionAvisos2 ,
                                          String A136UsuarioTecnicoCelular1 ,
                                          String A137UsuarioTecnicoCelular2 ,
                                          String A138UsuarioTecnicoCelularNombre1 ,
                                          String A139UsuarioTecnicoCelularNombre2 ,
                                          String A140UsuarioTecnicoTelefono1 ,
                                          String A141UsuarioTecnicoTelefono2 ,
                                          String A142UsuarioTecnicoTelefonoNombre1 ,
                                          String A143UsuarioTecnicoTelefonoNombre2 ,
                                          String A144UsuarioTecnicoEmail1 ,
                                          String A145UsuarioTecnicoEmail2 ,
                                          String A146UsuarioTecnicoEmailNombre1 ,
                                          String A147UsuarioTecnicoEmailNombre2 ,
                                          String A148UsuarioRutTipo ,
                                          String A149UsuarioFacDireccion ,
                                          String A150UsuarioFacLocalidad ,
                                          String A151UsuarioFacDepartamento ,
                                          String A152UsuarioFacEmailEnvio ,
                                          String A153UsuarioCobranzaCelular1 ,
                                          String A154UsuarioCobranzaCelular2 ,
                                          String A155UsuarioCobranzaCelularNombre1 ,
                                          String A156UsuarioCobranzaCelularNombre2 ,
                                          String A157UsuarioCobranzaTelefono1 ,
                                          String A158UsuarioCobranzaTelefono2 ,
                                          String A159UsuarioCobranzaTelefonoNombre1 ,
                                          String A160UsuarioCobranzaTelefonoNombre2 ,
                                          String A161UsuarioCobranzaEmail1 ,
                                          String A162UsuarioCobranzaEmail2 ,
                                          String A163UsuarioCobranzaEmailNombre1 ,
                                          String A164UsuarioCobranzaEmailNombre2 ,
                                          String A165UsuarioCedula )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[48];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioDireccion`, `UsuarioDireccionFrasco`, `UsuarioNotificacionFrasco1`," ;
      sSelectString += " `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`," ;
      sSelectString += " `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`," ;
      sSelectString += " `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`," ;
      sSelectString += " `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`," ;
      sSelectString += " `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`," ;
      sSelectString += " `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`," ;
      sSelectString += " `UsuarioCedula`, `UsuarioId`" ;
      sFromString = " FROM `Usuario`" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV8SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER(`UsuarioEmail`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioUsuarioWeb`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNombre`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioDicose`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioRazonSocial`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioRut`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioDireccion`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioDireccionFrasco`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionFrasco1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionFrasco2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionSolicitud1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionSolicitud2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionResultado1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionResultado2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionAvisos1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioNotificacionAvisos2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoCelular1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoCelular2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoCelularNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoCelularNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoTelefono1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoTelefono2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoTelefonoNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoTelefonoNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoEmail1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoEmail2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoEmailNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioTecnicoEmailNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioRutTipo`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioFacDireccion`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioFacLocalidad`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioFacDepartamento`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioFacEmailEnvio`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaCelular1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaCelular2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaCelularNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaCelularNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaTelefono1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaTelefono2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaTelefonoNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaTelefonoNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaEmail1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaEmail2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaEmailNombre1`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCobranzaEmailNombre2`) like CONCAT('%', UPPER(?)) or UPPER(`UsuarioCedula`) like CONCAT('%', UPPER(?)))");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
         GXv_int1[1] = (byte)(1) ;
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
         GXv_int1[4] = (byte)(1) ;
         GXv_int1[5] = (byte)(1) ;
         GXv_int1[6] = (byte)(1) ;
         GXv_int1[7] = (byte)(1) ;
         GXv_int1[8] = (byte)(1) ;
         GXv_int1[9] = (byte)(1) ;
         GXv_int1[10] = (byte)(1) ;
         GXv_int1[11] = (byte)(1) ;
         GXv_int1[12] = (byte)(1) ;
         GXv_int1[13] = (byte)(1) ;
         GXv_int1[14] = (byte)(1) ;
         GXv_int1[15] = (byte)(1) ;
         GXv_int1[16] = (byte)(1) ;
         GXv_int1[17] = (byte)(1) ;
         GXv_int1[18] = (byte)(1) ;
         GXv_int1[19] = (byte)(1) ;
         GXv_int1[20] = (byte)(1) ;
         GXv_int1[21] = (byte)(1) ;
         GXv_int1[22] = (byte)(1) ;
         GXv_int1[23] = (byte)(1) ;
         GXv_int1[24] = (byte)(1) ;
         GXv_int1[25] = (byte)(1) ;
         GXv_int1[26] = (byte)(1) ;
         GXv_int1[27] = (byte)(1) ;
         GXv_int1[28] = (byte)(1) ;
         GXv_int1[29] = (byte)(1) ;
         GXv_int1[30] = (byte)(1) ;
         GXv_int1[31] = (byte)(1) ;
         GXv_int1[32] = (byte)(1) ;
         GXv_int1[33] = (byte)(1) ;
         GXv_int1[34] = (byte)(1) ;
         GXv_int1[35] = (byte)(1) ;
         GXv_int1[36] = (byte)(1) ;
         GXv_int1[37] = (byte)(1) ;
         GXv_int1[38] = (byte)(1) ;
         GXv_int1[39] = (byte)(1) ;
         GXv_int1[40] = (byte)(1) ;
         GXv_int1[41] = (byte)(1) ;
         GXv_int1[42] = (byte)(1) ;
         GXv_int1[43] = (byte)(1) ;
         GXv_int1[44] = (byte)(1) ;
         GXv_int1[45] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `UsuarioEmail`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00002(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((long[]) buf[92])[0] = rslt.getLong(47);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 1000);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 1000);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 1000);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 1000);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 1000);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 1000);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 1000);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 1000);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 1000);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 1000);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 1000);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 1000);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 1000);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 1000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 1000);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 1000);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 1000);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 1000);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 1000);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 1000);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 1000);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 1000);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1000);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1000);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 1000);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 1000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 1000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 1000);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 1000);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 1000);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 1000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 1000);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 1000);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 1000);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 1000);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 1000);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 1000);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 1000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 1000);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 1000);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 1000);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 1000);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 1000);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 1000);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 1000);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 1000);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
      }
   }

}

