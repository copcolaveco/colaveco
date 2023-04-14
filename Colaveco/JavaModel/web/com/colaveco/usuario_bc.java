package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class usuario_bc extends GXWebPanel implements IGxSilentTrn
{
   public usuario_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public usuario_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( usuario_bc.class ));
   }

   public usuario_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtUsuario> GetAll( int Start ,
                                                          int Count )
   {
      GXPagingFrom5 = Start ;
      GXPagingTo5 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00054 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom5), Integer.valueOf(GXPagingTo5)});
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A5UsuarioId = BC00054_A5UsuarioId[0] ;
         A114UsuarioEmail = BC00054_A114UsuarioEmail[0] ;
         n114UsuarioEmail = BC00054_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = BC00054_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = BC00054_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = BC00054_A116UsuarioNombre[0] ;
         n116UsuarioNombre = BC00054_n116UsuarioNombre[0] ;
         A117UsuarioDicose = BC00054_A117UsuarioDicose[0] ;
         n117UsuarioDicose = BC00054_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = BC00054_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = BC00054_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = BC00054_A119UsuarioRut[0] ;
         n119UsuarioRut = BC00054_n119UsuarioRut[0] ;
         A120UsuarioIdNet = BC00054_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = BC00054_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = BC00054_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = BC00054_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = BC00054_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = BC00054_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = BC00054_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = BC00054_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = BC00054_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = BC00054_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = BC00054_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = BC00054_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = BC00054_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = BC00054_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = BC00054_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = BC00054_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = BC00054_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = BC00054_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = BC00054_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = BC00054_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = BC00054_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = BC00054_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = BC00054_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = BC00054_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = BC00054_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = BC00054_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = BC00054_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = BC00054_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = BC00054_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = BC00054_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = BC00054_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = BC00054_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = BC00054_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = BC00054_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = BC00054_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = BC00054_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = BC00054_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = BC00054_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = BC00054_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = BC00054_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = BC00054_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = BC00054_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = BC00054_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = BC00054_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = BC00054_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = BC00054_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = BC00054_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = BC00054_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = BC00054_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = BC00054_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = BC00054_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = BC00054_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = BC00054_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = BC00054_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = BC00054_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = BC00054_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = BC00054_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = BC00054_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = BC00054_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = BC00054_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = BC00054_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = BC00054_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = BC00054_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = BC00054_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = BC00054_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = BC00054_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = BC00054_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = BC00054_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = BC00054_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = BC00054_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = BC00054_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = BC00054_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = BC00054_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = BC00054_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = BC00054_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = BC00054_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = BC00054_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = BC00054_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = BC00054_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = BC00054_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = BC00054_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = BC00054_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = BC00054_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = BC00054_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = BC00054_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = BC00054_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = BC00054_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = BC00054_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = BC00054_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = BC00054_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = BC00054_A165UsuarioCedula[0] ;
         n165UsuarioCedula = BC00054_n165UsuarioCedula[0] ;
      }
      bcUsuario = new com.colaveco.SdtUsuario(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound5 != 0 )
      {
         onLoadActions055( ) ;
         addRow055( ) ;
         gx_sdt_item = bcUsuario.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound5 = (short)(0) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound5 = (short)(1) ;
            A5UsuarioId = BC00054_A5UsuarioId[0] ;
            A114UsuarioEmail = BC00054_A114UsuarioEmail[0] ;
            n114UsuarioEmail = BC00054_n114UsuarioEmail[0] ;
            A115UsuarioUsuarioWeb = BC00054_A115UsuarioUsuarioWeb[0] ;
            n115UsuarioUsuarioWeb = BC00054_n115UsuarioUsuarioWeb[0] ;
            A116UsuarioNombre = BC00054_A116UsuarioNombre[0] ;
            n116UsuarioNombre = BC00054_n116UsuarioNombre[0] ;
            A117UsuarioDicose = BC00054_A117UsuarioDicose[0] ;
            n117UsuarioDicose = BC00054_n117UsuarioDicose[0] ;
            A118UsuarioRazonSocial = BC00054_A118UsuarioRazonSocial[0] ;
            n118UsuarioRazonSocial = BC00054_n118UsuarioRazonSocial[0] ;
            A119UsuarioRut = BC00054_A119UsuarioRut[0] ;
            n119UsuarioRut = BC00054_n119UsuarioRut[0] ;
            A120UsuarioIdNet = BC00054_A120UsuarioIdNet[0] ;
            n120UsuarioIdNet = BC00054_n120UsuarioIdNet[0] ;
            A121UsuarioDireccion = BC00054_A121UsuarioDireccion[0] ;
            n121UsuarioDireccion = BC00054_n121UsuarioDireccion[0] ;
            A122UsuarioTipousuario = BC00054_A122UsuarioTipousuario[0] ;
            n122UsuarioTipousuario = BC00054_n122UsuarioTipousuario[0] ;
            A123UsuarioIdTecnico1 = BC00054_A123UsuarioIdTecnico1[0] ;
            n123UsuarioIdTecnico1 = BC00054_n123UsuarioIdTecnico1[0] ;
            A124UsuarioIdTecnico2 = BC00054_A124UsuarioIdTecnico2[0] ;
            n124UsuarioIdTecnico2 = BC00054_n124UsuarioIdTecnico2[0] ;
            A125UsuarioIdTecnico3 = BC00054_A125UsuarioIdTecnico3[0] ;
            n125UsuarioIdTecnico3 = BC00054_n125UsuarioIdTecnico3[0] ;
            A126UsuarioDireccionFrasco = BC00054_A126UsuarioDireccionFrasco[0] ;
            n126UsuarioDireccionFrasco = BC00054_n126UsuarioDireccionFrasco[0] ;
            A127UsuarioAgenciaFrasco = BC00054_A127UsuarioAgenciaFrasco[0] ;
            n127UsuarioAgenciaFrasco = BC00054_n127UsuarioAgenciaFrasco[0] ;
            A128UsuarioNotificacionFrasco1 = BC00054_A128UsuarioNotificacionFrasco1[0] ;
            n128UsuarioNotificacionFrasco1 = BC00054_n128UsuarioNotificacionFrasco1[0] ;
            A129UsuarioNotificacionFrasco2 = BC00054_A129UsuarioNotificacionFrasco2[0] ;
            n129UsuarioNotificacionFrasco2 = BC00054_n129UsuarioNotificacionFrasco2[0] ;
            A130UsuarioNotificacionSolicitud1 = BC00054_A130UsuarioNotificacionSolicitud1[0] ;
            n130UsuarioNotificacionSolicitud1 = BC00054_n130UsuarioNotificacionSolicitud1[0] ;
            A131UsuarioNotificacionSolicitud2 = BC00054_A131UsuarioNotificacionSolicitud2[0] ;
            n131UsuarioNotificacionSolicitud2 = BC00054_n131UsuarioNotificacionSolicitud2[0] ;
            A132UsuarioNotificacionResultado1 = BC00054_A132UsuarioNotificacionResultado1[0] ;
            n132UsuarioNotificacionResultado1 = BC00054_n132UsuarioNotificacionResultado1[0] ;
            A133UsuarioNotificacionResultado2 = BC00054_A133UsuarioNotificacionResultado2[0] ;
            n133UsuarioNotificacionResultado2 = BC00054_n133UsuarioNotificacionResultado2[0] ;
            A134UsuarioNotificacionAvisos1 = BC00054_A134UsuarioNotificacionAvisos1[0] ;
            n134UsuarioNotificacionAvisos1 = BC00054_n134UsuarioNotificacionAvisos1[0] ;
            A135UsuarioNotificacionAvisos2 = BC00054_A135UsuarioNotificacionAvisos2[0] ;
            n135UsuarioNotificacionAvisos2 = BC00054_n135UsuarioNotificacionAvisos2[0] ;
            A136UsuarioTecnicoCelular1 = BC00054_A136UsuarioTecnicoCelular1[0] ;
            n136UsuarioTecnicoCelular1 = BC00054_n136UsuarioTecnicoCelular1[0] ;
            A137UsuarioTecnicoCelular2 = BC00054_A137UsuarioTecnicoCelular2[0] ;
            n137UsuarioTecnicoCelular2 = BC00054_n137UsuarioTecnicoCelular2[0] ;
            A138UsuarioTecnicoCelularNombre1 = BC00054_A138UsuarioTecnicoCelularNombre1[0] ;
            n138UsuarioTecnicoCelularNombre1 = BC00054_n138UsuarioTecnicoCelularNombre1[0] ;
            A139UsuarioTecnicoCelularNombre2 = BC00054_A139UsuarioTecnicoCelularNombre2[0] ;
            n139UsuarioTecnicoCelularNombre2 = BC00054_n139UsuarioTecnicoCelularNombre2[0] ;
            A140UsuarioTecnicoTelefono1 = BC00054_A140UsuarioTecnicoTelefono1[0] ;
            n140UsuarioTecnicoTelefono1 = BC00054_n140UsuarioTecnicoTelefono1[0] ;
            A141UsuarioTecnicoTelefono2 = BC00054_A141UsuarioTecnicoTelefono2[0] ;
            n141UsuarioTecnicoTelefono2 = BC00054_n141UsuarioTecnicoTelefono2[0] ;
            A142UsuarioTecnicoTelefonoNombre1 = BC00054_A142UsuarioTecnicoTelefonoNombre1[0] ;
            n142UsuarioTecnicoTelefonoNombre1 = BC00054_n142UsuarioTecnicoTelefonoNombre1[0] ;
            A143UsuarioTecnicoTelefonoNombre2 = BC00054_A143UsuarioTecnicoTelefonoNombre2[0] ;
            n143UsuarioTecnicoTelefonoNombre2 = BC00054_n143UsuarioTecnicoTelefonoNombre2[0] ;
            A144UsuarioTecnicoEmail1 = BC00054_A144UsuarioTecnicoEmail1[0] ;
            n144UsuarioTecnicoEmail1 = BC00054_n144UsuarioTecnicoEmail1[0] ;
            A145UsuarioTecnicoEmail2 = BC00054_A145UsuarioTecnicoEmail2[0] ;
            n145UsuarioTecnicoEmail2 = BC00054_n145UsuarioTecnicoEmail2[0] ;
            A146UsuarioTecnicoEmailNombre1 = BC00054_A146UsuarioTecnicoEmailNombre1[0] ;
            n146UsuarioTecnicoEmailNombre1 = BC00054_n146UsuarioTecnicoEmailNombre1[0] ;
            A147UsuarioTecnicoEmailNombre2 = BC00054_A147UsuarioTecnicoEmailNombre2[0] ;
            n147UsuarioTecnicoEmailNombre2 = BC00054_n147UsuarioTecnicoEmailNombre2[0] ;
            A148UsuarioRutTipo = BC00054_A148UsuarioRutTipo[0] ;
            n148UsuarioRutTipo = BC00054_n148UsuarioRutTipo[0] ;
            A149UsuarioFacDireccion = BC00054_A149UsuarioFacDireccion[0] ;
            n149UsuarioFacDireccion = BC00054_n149UsuarioFacDireccion[0] ;
            A150UsuarioFacLocalidad = BC00054_A150UsuarioFacLocalidad[0] ;
            n150UsuarioFacLocalidad = BC00054_n150UsuarioFacLocalidad[0] ;
            A151UsuarioFacDepartamento = BC00054_A151UsuarioFacDepartamento[0] ;
            n151UsuarioFacDepartamento = BC00054_n151UsuarioFacDepartamento[0] ;
            A152UsuarioFacEmailEnvio = BC00054_A152UsuarioFacEmailEnvio[0] ;
            n152UsuarioFacEmailEnvio = BC00054_n152UsuarioFacEmailEnvio[0] ;
            A153UsuarioCobranzaCelular1 = BC00054_A153UsuarioCobranzaCelular1[0] ;
            n153UsuarioCobranzaCelular1 = BC00054_n153UsuarioCobranzaCelular1[0] ;
            A154UsuarioCobranzaCelular2 = BC00054_A154UsuarioCobranzaCelular2[0] ;
            n154UsuarioCobranzaCelular2 = BC00054_n154UsuarioCobranzaCelular2[0] ;
            A155UsuarioCobranzaCelularNombre1 = BC00054_A155UsuarioCobranzaCelularNombre1[0] ;
            n155UsuarioCobranzaCelularNombre1 = BC00054_n155UsuarioCobranzaCelularNombre1[0] ;
            A156UsuarioCobranzaCelularNombre2 = BC00054_A156UsuarioCobranzaCelularNombre2[0] ;
            n156UsuarioCobranzaCelularNombre2 = BC00054_n156UsuarioCobranzaCelularNombre2[0] ;
            A157UsuarioCobranzaTelefono1 = BC00054_A157UsuarioCobranzaTelefono1[0] ;
            n157UsuarioCobranzaTelefono1 = BC00054_n157UsuarioCobranzaTelefono1[0] ;
            A158UsuarioCobranzaTelefono2 = BC00054_A158UsuarioCobranzaTelefono2[0] ;
            n158UsuarioCobranzaTelefono2 = BC00054_n158UsuarioCobranzaTelefono2[0] ;
            A159UsuarioCobranzaTelefonoNombre1 = BC00054_A159UsuarioCobranzaTelefonoNombre1[0] ;
            n159UsuarioCobranzaTelefonoNombre1 = BC00054_n159UsuarioCobranzaTelefonoNombre1[0] ;
            A160UsuarioCobranzaTelefonoNombre2 = BC00054_A160UsuarioCobranzaTelefonoNombre2[0] ;
            n160UsuarioCobranzaTelefonoNombre2 = BC00054_n160UsuarioCobranzaTelefonoNombre2[0] ;
            A161UsuarioCobranzaEmail1 = BC00054_A161UsuarioCobranzaEmail1[0] ;
            n161UsuarioCobranzaEmail1 = BC00054_n161UsuarioCobranzaEmail1[0] ;
            A162UsuarioCobranzaEmail2 = BC00054_A162UsuarioCobranzaEmail2[0] ;
            n162UsuarioCobranzaEmail2 = BC00054_n162UsuarioCobranzaEmail2[0] ;
            A163UsuarioCobranzaEmailNombre1 = BC00054_A163UsuarioCobranzaEmailNombre1[0] ;
            n163UsuarioCobranzaEmailNombre1 = BC00054_n163UsuarioCobranzaEmailNombre1[0] ;
            A164UsuarioCobranzaEmailNombre2 = BC00054_A164UsuarioCobranzaEmailNombre2[0] ;
            n164UsuarioCobranzaEmailNombre2 = BC00054_n164UsuarioCobranzaEmailNombre2[0] ;
            A165UsuarioCedula = BC00054_A165UsuarioCedula[0] ;
            n165UsuarioCedula = BC00054_n165UsuarioCedula[0] ;
         }
         Gx_mode = sMode5 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm055( 0) ;
   }

   public void getInsDefault( )
   {
      readRow055( ) ;
      standaloneNotModal( ) ;
      initializeNonKey055( ) ;
      standaloneModal( ) ;
      addRow055( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z5UsuarioId = A5UsuarioId ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_050( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls055( ) ;
         }
         else
         {
            checkExtendedTable055( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors055( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z114UsuarioEmail = A114UsuarioEmail ;
         Z115UsuarioUsuarioWeb = A115UsuarioUsuarioWeb ;
         Z116UsuarioNombre = A116UsuarioNombre ;
         Z117UsuarioDicose = A117UsuarioDicose ;
         Z118UsuarioRazonSocial = A118UsuarioRazonSocial ;
         Z119UsuarioRut = A119UsuarioRut ;
         Z120UsuarioIdNet = A120UsuarioIdNet ;
         Z121UsuarioDireccion = A121UsuarioDireccion ;
         Z122UsuarioTipousuario = A122UsuarioTipousuario ;
         Z123UsuarioIdTecnico1 = A123UsuarioIdTecnico1 ;
         Z124UsuarioIdTecnico2 = A124UsuarioIdTecnico2 ;
         Z125UsuarioIdTecnico3 = A125UsuarioIdTecnico3 ;
         Z126UsuarioDireccionFrasco = A126UsuarioDireccionFrasco ;
         Z127UsuarioAgenciaFrasco = A127UsuarioAgenciaFrasco ;
         Z128UsuarioNotificacionFrasco1 = A128UsuarioNotificacionFrasco1 ;
         Z129UsuarioNotificacionFrasco2 = A129UsuarioNotificacionFrasco2 ;
         Z130UsuarioNotificacionSolicitud1 = A130UsuarioNotificacionSolicitud1 ;
         Z131UsuarioNotificacionSolicitud2 = A131UsuarioNotificacionSolicitud2 ;
         Z132UsuarioNotificacionResultado1 = A132UsuarioNotificacionResultado1 ;
         Z133UsuarioNotificacionResultado2 = A133UsuarioNotificacionResultado2 ;
         Z134UsuarioNotificacionAvisos1 = A134UsuarioNotificacionAvisos1 ;
         Z135UsuarioNotificacionAvisos2 = A135UsuarioNotificacionAvisos2 ;
         Z136UsuarioTecnicoCelular1 = A136UsuarioTecnicoCelular1 ;
         Z137UsuarioTecnicoCelular2 = A137UsuarioTecnicoCelular2 ;
         Z138UsuarioTecnicoCelularNombre1 = A138UsuarioTecnicoCelularNombre1 ;
         Z139UsuarioTecnicoCelularNombre2 = A139UsuarioTecnicoCelularNombre2 ;
         Z140UsuarioTecnicoTelefono1 = A140UsuarioTecnicoTelefono1 ;
         Z141UsuarioTecnicoTelefono2 = A141UsuarioTecnicoTelefono2 ;
         Z142UsuarioTecnicoTelefonoNombre1 = A142UsuarioTecnicoTelefonoNombre1 ;
         Z143UsuarioTecnicoTelefonoNombre2 = A143UsuarioTecnicoTelefonoNombre2 ;
         Z144UsuarioTecnicoEmail1 = A144UsuarioTecnicoEmail1 ;
         Z145UsuarioTecnicoEmail2 = A145UsuarioTecnicoEmail2 ;
         Z146UsuarioTecnicoEmailNombre1 = A146UsuarioTecnicoEmailNombre1 ;
         Z147UsuarioTecnicoEmailNombre2 = A147UsuarioTecnicoEmailNombre2 ;
         Z148UsuarioRutTipo = A148UsuarioRutTipo ;
         Z149UsuarioFacDireccion = A149UsuarioFacDireccion ;
         Z150UsuarioFacLocalidad = A150UsuarioFacLocalidad ;
         Z151UsuarioFacDepartamento = A151UsuarioFacDepartamento ;
         Z152UsuarioFacEmailEnvio = A152UsuarioFacEmailEnvio ;
         Z153UsuarioCobranzaCelular1 = A153UsuarioCobranzaCelular1 ;
         Z154UsuarioCobranzaCelular2 = A154UsuarioCobranzaCelular2 ;
         Z155UsuarioCobranzaCelularNombre1 = A155UsuarioCobranzaCelularNombre1 ;
         Z156UsuarioCobranzaCelularNombre2 = A156UsuarioCobranzaCelularNombre2 ;
         Z157UsuarioCobranzaTelefono1 = A157UsuarioCobranzaTelefono1 ;
         Z158UsuarioCobranzaTelefono2 = A158UsuarioCobranzaTelefono2 ;
         Z159UsuarioCobranzaTelefonoNombre1 = A159UsuarioCobranzaTelefonoNombre1 ;
         Z160UsuarioCobranzaTelefonoNombre2 = A160UsuarioCobranzaTelefonoNombre2 ;
         Z161UsuarioCobranzaEmail1 = A161UsuarioCobranzaEmail1 ;
         Z162UsuarioCobranzaEmail2 = A162UsuarioCobranzaEmail2 ;
         Z163UsuarioCobranzaEmailNombre1 = A163UsuarioCobranzaEmailNombre1 ;
         Z164UsuarioCobranzaEmailNombre2 = A164UsuarioCobranzaEmailNombre2 ;
         Z165UsuarioCedula = A165UsuarioCedula ;
      }
      if ( GX_JID == -1 )
      {
         Z5UsuarioId = A5UsuarioId ;
         Z114UsuarioEmail = A114UsuarioEmail ;
         Z115UsuarioUsuarioWeb = A115UsuarioUsuarioWeb ;
         Z116UsuarioNombre = A116UsuarioNombre ;
         Z117UsuarioDicose = A117UsuarioDicose ;
         Z118UsuarioRazonSocial = A118UsuarioRazonSocial ;
         Z119UsuarioRut = A119UsuarioRut ;
         Z120UsuarioIdNet = A120UsuarioIdNet ;
         Z121UsuarioDireccion = A121UsuarioDireccion ;
         Z122UsuarioTipousuario = A122UsuarioTipousuario ;
         Z123UsuarioIdTecnico1 = A123UsuarioIdTecnico1 ;
         Z124UsuarioIdTecnico2 = A124UsuarioIdTecnico2 ;
         Z125UsuarioIdTecnico3 = A125UsuarioIdTecnico3 ;
         Z126UsuarioDireccionFrasco = A126UsuarioDireccionFrasco ;
         Z127UsuarioAgenciaFrasco = A127UsuarioAgenciaFrasco ;
         Z128UsuarioNotificacionFrasco1 = A128UsuarioNotificacionFrasco1 ;
         Z129UsuarioNotificacionFrasco2 = A129UsuarioNotificacionFrasco2 ;
         Z130UsuarioNotificacionSolicitud1 = A130UsuarioNotificacionSolicitud1 ;
         Z131UsuarioNotificacionSolicitud2 = A131UsuarioNotificacionSolicitud2 ;
         Z132UsuarioNotificacionResultado1 = A132UsuarioNotificacionResultado1 ;
         Z133UsuarioNotificacionResultado2 = A133UsuarioNotificacionResultado2 ;
         Z134UsuarioNotificacionAvisos1 = A134UsuarioNotificacionAvisos1 ;
         Z135UsuarioNotificacionAvisos2 = A135UsuarioNotificacionAvisos2 ;
         Z136UsuarioTecnicoCelular1 = A136UsuarioTecnicoCelular1 ;
         Z137UsuarioTecnicoCelular2 = A137UsuarioTecnicoCelular2 ;
         Z138UsuarioTecnicoCelularNombre1 = A138UsuarioTecnicoCelularNombre1 ;
         Z139UsuarioTecnicoCelularNombre2 = A139UsuarioTecnicoCelularNombre2 ;
         Z140UsuarioTecnicoTelefono1 = A140UsuarioTecnicoTelefono1 ;
         Z141UsuarioTecnicoTelefono2 = A141UsuarioTecnicoTelefono2 ;
         Z142UsuarioTecnicoTelefonoNombre1 = A142UsuarioTecnicoTelefonoNombre1 ;
         Z143UsuarioTecnicoTelefonoNombre2 = A143UsuarioTecnicoTelefonoNombre2 ;
         Z144UsuarioTecnicoEmail1 = A144UsuarioTecnicoEmail1 ;
         Z145UsuarioTecnicoEmail2 = A145UsuarioTecnicoEmail2 ;
         Z146UsuarioTecnicoEmailNombre1 = A146UsuarioTecnicoEmailNombre1 ;
         Z147UsuarioTecnicoEmailNombre2 = A147UsuarioTecnicoEmailNombre2 ;
         Z148UsuarioRutTipo = A148UsuarioRutTipo ;
         Z149UsuarioFacDireccion = A149UsuarioFacDireccion ;
         Z150UsuarioFacLocalidad = A150UsuarioFacLocalidad ;
         Z151UsuarioFacDepartamento = A151UsuarioFacDepartamento ;
         Z152UsuarioFacEmailEnvio = A152UsuarioFacEmailEnvio ;
         Z153UsuarioCobranzaCelular1 = A153UsuarioCobranzaCelular1 ;
         Z154UsuarioCobranzaCelular2 = A154UsuarioCobranzaCelular2 ;
         Z155UsuarioCobranzaCelularNombre1 = A155UsuarioCobranzaCelularNombre1 ;
         Z156UsuarioCobranzaCelularNombre2 = A156UsuarioCobranzaCelularNombre2 ;
         Z157UsuarioCobranzaTelefono1 = A157UsuarioCobranzaTelefono1 ;
         Z158UsuarioCobranzaTelefono2 = A158UsuarioCobranzaTelefono2 ;
         Z159UsuarioCobranzaTelefonoNombre1 = A159UsuarioCobranzaTelefonoNombre1 ;
         Z160UsuarioCobranzaTelefonoNombre2 = A160UsuarioCobranzaTelefonoNombre2 ;
         Z161UsuarioCobranzaEmail1 = A161UsuarioCobranzaEmail1 ;
         Z162UsuarioCobranzaEmail2 = A162UsuarioCobranzaEmail2 ;
         Z163UsuarioCobranzaEmailNombre1 = A163UsuarioCobranzaEmailNombre1 ;
         Z164UsuarioCobranzaEmailNombre2 = A164UsuarioCobranzaEmailNombre2 ;
         Z165UsuarioCedula = A165UsuarioCedula ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load055( )
   {
      /* Using cursor BC00055 */
      pr_default.execute(3, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A114UsuarioEmail = BC00055_A114UsuarioEmail[0] ;
         n114UsuarioEmail = BC00055_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = BC00055_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = BC00055_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = BC00055_A116UsuarioNombre[0] ;
         n116UsuarioNombre = BC00055_n116UsuarioNombre[0] ;
         A117UsuarioDicose = BC00055_A117UsuarioDicose[0] ;
         n117UsuarioDicose = BC00055_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = BC00055_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = BC00055_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = BC00055_A119UsuarioRut[0] ;
         n119UsuarioRut = BC00055_n119UsuarioRut[0] ;
         A120UsuarioIdNet = BC00055_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = BC00055_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = BC00055_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = BC00055_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = BC00055_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = BC00055_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = BC00055_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = BC00055_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = BC00055_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = BC00055_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = BC00055_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = BC00055_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = BC00055_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = BC00055_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = BC00055_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = BC00055_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = BC00055_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = BC00055_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = BC00055_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = BC00055_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = BC00055_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = BC00055_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = BC00055_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = BC00055_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = BC00055_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = BC00055_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = BC00055_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = BC00055_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = BC00055_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = BC00055_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = BC00055_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = BC00055_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = BC00055_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = BC00055_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = BC00055_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = BC00055_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = BC00055_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = BC00055_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = BC00055_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = BC00055_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = BC00055_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = BC00055_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = BC00055_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = BC00055_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = BC00055_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = BC00055_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = BC00055_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = BC00055_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = BC00055_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = BC00055_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = BC00055_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = BC00055_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = BC00055_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = BC00055_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = BC00055_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = BC00055_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = BC00055_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = BC00055_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = BC00055_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = BC00055_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = BC00055_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = BC00055_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = BC00055_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = BC00055_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = BC00055_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = BC00055_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = BC00055_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = BC00055_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = BC00055_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = BC00055_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = BC00055_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = BC00055_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = BC00055_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = BC00055_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = BC00055_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = BC00055_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = BC00055_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = BC00055_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = BC00055_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = BC00055_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = BC00055_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = BC00055_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = BC00055_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = BC00055_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = BC00055_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = BC00055_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = BC00055_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = BC00055_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = BC00055_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = BC00055_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = BC00055_A165UsuarioCedula[0] ;
         n165UsuarioCedula = BC00055_n165UsuarioCedula[0] ;
         zm055( -1) ;
      }
      pr_default.close(3);
      onLoadActions055( ) ;
   }

   public void onLoadActions055( )
   {
   }

   public void checkExtendedTable055( )
   {
      nIsDirty_5 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors055( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey055( )
   {
      /* Using cursor BC00056 */
      pr_default.execute(4, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00057 */
      pr_default.execute(5, new Object[] {Long.valueOf(A5UsuarioId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm055( 1) ;
         RcdFound5 = (short)(1) ;
         A5UsuarioId = BC00057_A5UsuarioId[0] ;
         A114UsuarioEmail = BC00057_A114UsuarioEmail[0] ;
         n114UsuarioEmail = BC00057_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = BC00057_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = BC00057_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = BC00057_A116UsuarioNombre[0] ;
         n116UsuarioNombre = BC00057_n116UsuarioNombre[0] ;
         A117UsuarioDicose = BC00057_A117UsuarioDicose[0] ;
         n117UsuarioDicose = BC00057_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = BC00057_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = BC00057_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = BC00057_A119UsuarioRut[0] ;
         n119UsuarioRut = BC00057_n119UsuarioRut[0] ;
         A120UsuarioIdNet = BC00057_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = BC00057_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = BC00057_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = BC00057_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = BC00057_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = BC00057_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = BC00057_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = BC00057_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = BC00057_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = BC00057_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = BC00057_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = BC00057_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = BC00057_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = BC00057_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = BC00057_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = BC00057_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = BC00057_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = BC00057_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = BC00057_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = BC00057_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = BC00057_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = BC00057_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = BC00057_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = BC00057_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = BC00057_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = BC00057_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = BC00057_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = BC00057_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = BC00057_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = BC00057_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = BC00057_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = BC00057_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = BC00057_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = BC00057_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = BC00057_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = BC00057_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = BC00057_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = BC00057_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = BC00057_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = BC00057_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = BC00057_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = BC00057_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = BC00057_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = BC00057_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = BC00057_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = BC00057_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = BC00057_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = BC00057_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = BC00057_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = BC00057_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = BC00057_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = BC00057_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = BC00057_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = BC00057_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = BC00057_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = BC00057_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = BC00057_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = BC00057_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = BC00057_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = BC00057_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = BC00057_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = BC00057_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = BC00057_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = BC00057_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = BC00057_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = BC00057_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = BC00057_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = BC00057_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = BC00057_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = BC00057_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = BC00057_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = BC00057_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = BC00057_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = BC00057_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = BC00057_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = BC00057_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = BC00057_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = BC00057_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = BC00057_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = BC00057_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = BC00057_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = BC00057_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = BC00057_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = BC00057_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = BC00057_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = BC00057_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = BC00057_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = BC00057_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = BC00057_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = BC00057_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = BC00057_A165UsuarioCedula[0] ;
         n165UsuarioCedula = BC00057_n165UsuarioCedula[0] ;
         Z5UsuarioId = A5UsuarioId ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_050( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00058 */
         pr_default.execute(6, new Object[] {Long.valueOf(A5UsuarioId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Usuario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z114UsuarioEmail, BC00058_A114UsuarioEmail[0]) != 0 ) || ( GXutil.strcmp(Z115UsuarioUsuarioWeb, BC00058_A115UsuarioUsuarioWeb[0]) != 0 ) || ( GXutil.strcmp(Z116UsuarioNombre, BC00058_A116UsuarioNombre[0]) != 0 ) || ( GXutil.strcmp(Z117UsuarioDicose, BC00058_A117UsuarioDicose[0]) != 0 ) || ( GXutil.strcmp(Z118UsuarioRazonSocial, BC00058_A118UsuarioRazonSocial[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z119UsuarioRut, BC00058_A119UsuarioRut[0]) != 0 ) || ( Z120UsuarioIdNet != BC00058_A120UsuarioIdNet[0] ) || ( GXutil.strcmp(Z121UsuarioDireccion, BC00058_A121UsuarioDireccion[0]) != 0 ) || ( Z122UsuarioTipousuario != BC00058_A122UsuarioTipousuario[0] ) || ( Z123UsuarioIdTecnico1 != BC00058_A123UsuarioIdTecnico1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z124UsuarioIdTecnico2 != BC00058_A124UsuarioIdTecnico2[0] ) || ( Z125UsuarioIdTecnico3 != BC00058_A125UsuarioIdTecnico3[0] ) || ( GXutil.strcmp(Z126UsuarioDireccionFrasco, BC00058_A126UsuarioDireccionFrasco[0]) != 0 ) || ( Z127UsuarioAgenciaFrasco != BC00058_A127UsuarioAgenciaFrasco[0] ) || ( GXutil.strcmp(Z128UsuarioNotificacionFrasco1, BC00058_A128UsuarioNotificacionFrasco1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z129UsuarioNotificacionFrasco2, BC00058_A129UsuarioNotificacionFrasco2[0]) != 0 ) || ( GXutil.strcmp(Z130UsuarioNotificacionSolicitud1, BC00058_A130UsuarioNotificacionSolicitud1[0]) != 0 ) || ( GXutil.strcmp(Z131UsuarioNotificacionSolicitud2, BC00058_A131UsuarioNotificacionSolicitud2[0]) != 0 ) || ( GXutil.strcmp(Z132UsuarioNotificacionResultado1, BC00058_A132UsuarioNotificacionResultado1[0]) != 0 ) || ( GXutil.strcmp(Z133UsuarioNotificacionResultado2, BC00058_A133UsuarioNotificacionResultado2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z134UsuarioNotificacionAvisos1, BC00058_A134UsuarioNotificacionAvisos1[0]) != 0 ) || ( GXutil.strcmp(Z135UsuarioNotificacionAvisos2, BC00058_A135UsuarioNotificacionAvisos2[0]) != 0 ) || ( GXutil.strcmp(Z136UsuarioTecnicoCelular1, BC00058_A136UsuarioTecnicoCelular1[0]) != 0 ) || ( GXutil.strcmp(Z137UsuarioTecnicoCelular2, BC00058_A137UsuarioTecnicoCelular2[0]) != 0 ) || ( GXutil.strcmp(Z138UsuarioTecnicoCelularNombre1, BC00058_A138UsuarioTecnicoCelularNombre1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z139UsuarioTecnicoCelularNombre2, BC00058_A139UsuarioTecnicoCelularNombre2[0]) != 0 ) || ( GXutil.strcmp(Z140UsuarioTecnicoTelefono1, BC00058_A140UsuarioTecnicoTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z141UsuarioTecnicoTelefono2, BC00058_A141UsuarioTecnicoTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z142UsuarioTecnicoTelefonoNombre1, BC00058_A142UsuarioTecnicoTelefonoNombre1[0]) != 0 ) || ( GXutil.strcmp(Z143UsuarioTecnicoTelefonoNombre2, BC00058_A143UsuarioTecnicoTelefonoNombre2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z144UsuarioTecnicoEmail1, BC00058_A144UsuarioTecnicoEmail1[0]) != 0 ) || ( GXutil.strcmp(Z145UsuarioTecnicoEmail2, BC00058_A145UsuarioTecnicoEmail2[0]) != 0 ) || ( GXutil.strcmp(Z146UsuarioTecnicoEmailNombre1, BC00058_A146UsuarioTecnicoEmailNombre1[0]) != 0 ) || ( GXutil.strcmp(Z147UsuarioTecnicoEmailNombre2, BC00058_A147UsuarioTecnicoEmailNombre2[0]) != 0 ) || ( GXutil.strcmp(Z148UsuarioRutTipo, BC00058_A148UsuarioRutTipo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z149UsuarioFacDireccion, BC00058_A149UsuarioFacDireccion[0]) != 0 ) || ( GXutil.strcmp(Z150UsuarioFacLocalidad, BC00058_A150UsuarioFacLocalidad[0]) != 0 ) || ( GXutil.strcmp(Z151UsuarioFacDepartamento, BC00058_A151UsuarioFacDepartamento[0]) != 0 ) || ( GXutil.strcmp(Z152UsuarioFacEmailEnvio, BC00058_A152UsuarioFacEmailEnvio[0]) != 0 ) || ( GXutil.strcmp(Z153UsuarioCobranzaCelular1, BC00058_A153UsuarioCobranzaCelular1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z154UsuarioCobranzaCelular2, BC00058_A154UsuarioCobranzaCelular2[0]) != 0 ) || ( GXutil.strcmp(Z155UsuarioCobranzaCelularNombre1, BC00058_A155UsuarioCobranzaCelularNombre1[0]) != 0 ) || ( GXutil.strcmp(Z156UsuarioCobranzaCelularNombre2, BC00058_A156UsuarioCobranzaCelularNombre2[0]) != 0 ) || ( GXutil.strcmp(Z157UsuarioCobranzaTelefono1, BC00058_A157UsuarioCobranzaTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z158UsuarioCobranzaTelefono2, BC00058_A158UsuarioCobranzaTelefono2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z159UsuarioCobranzaTelefonoNombre1, BC00058_A159UsuarioCobranzaTelefonoNombre1[0]) != 0 ) || ( GXutil.strcmp(Z160UsuarioCobranzaTelefonoNombre2, BC00058_A160UsuarioCobranzaTelefonoNombre2[0]) != 0 ) || ( GXutil.strcmp(Z161UsuarioCobranzaEmail1, BC00058_A161UsuarioCobranzaEmail1[0]) != 0 ) || ( GXutil.strcmp(Z162UsuarioCobranzaEmail2, BC00058_A162UsuarioCobranzaEmail2[0]) != 0 ) || ( GXutil.strcmp(Z163UsuarioCobranzaEmailNombre1, BC00058_A163UsuarioCobranzaEmailNombre1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z164UsuarioCobranzaEmailNombre2, BC00058_A164UsuarioCobranzaEmailNombre2[0]) != 0 ) || ( GXutil.strcmp(Z165UsuarioCedula, BC00058_A165UsuarioCedula[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Usuario"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm055( 0) ;
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00059 */
                  pr_default.execute(7, new Object[] {Long.valueOf(A5UsuarioId), Boolean.valueOf(n114UsuarioEmail), A114UsuarioEmail, Boolean.valueOf(n115UsuarioUsuarioWeb), A115UsuarioUsuarioWeb, Boolean.valueOf(n116UsuarioNombre), A116UsuarioNombre, Boolean.valueOf(n117UsuarioDicose), A117UsuarioDicose, Boolean.valueOf(n118UsuarioRazonSocial), A118UsuarioRazonSocial, Boolean.valueOf(n119UsuarioRut), A119UsuarioRut, Boolean.valueOf(n120UsuarioIdNet), Long.valueOf(A120UsuarioIdNet), Boolean.valueOf(n121UsuarioDireccion), A121UsuarioDireccion, Boolean.valueOf(n122UsuarioTipousuario), Short.valueOf(A122UsuarioTipousuario), Boolean.valueOf(n123UsuarioIdTecnico1), Long.valueOf(A123UsuarioIdTecnico1), Boolean.valueOf(n124UsuarioIdTecnico2), Long.valueOf(A124UsuarioIdTecnico2), Boolean.valueOf(n125UsuarioIdTecnico3), Long.valueOf(A125UsuarioIdTecnico3), Boolean.valueOf(n126UsuarioDireccionFrasco), A126UsuarioDireccionFrasco, Boolean.valueOf(n127UsuarioAgenciaFrasco), Short.valueOf(A127UsuarioAgenciaFrasco), Boolean.valueOf(n128UsuarioNotificacionFrasco1), A128UsuarioNotificacionFrasco1, Boolean.valueOf(n129UsuarioNotificacionFrasco2), A129UsuarioNotificacionFrasco2, Boolean.valueOf(n130UsuarioNotificacionSolicitud1), A130UsuarioNotificacionSolicitud1, Boolean.valueOf(n131UsuarioNotificacionSolicitud2), A131UsuarioNotificacionSolicitud2, Boolean.valueOf(n132UsuarioNotificacionResultado1), A132UsuarioNotificacionResultado1, Boolean.valueOf(n133UsuarioNotificacionResultado2), A133UsuarioNotificacionResultado2, Boolean.valueOf(n134UsuarioNotificacionAvisos1), A134UsuarioNotificacionAvisos1, Boolean.valueOf(n135UsuarioNotificacionAvisos2), A135UsuarioNotificacionAvisos2, Boolean.valueOf(n136UsuarioTecnicoCelular1), A136UsuarioTecnicoCelular1, Boolean.valueOf(n137UsuarioTecnicoCelular2), A137UsuarioTecnicoCelular2, Boolean.valueOf(n138UsuarioTecnicoCelularNombre1), A138UsuarioTecnicoCelularNombre1, Boolean.valueOf(n139UsuarioTecnicoCelularNombre2), A139UsuarioTecnicoCelularNombre2, Boolean.valueOf(n140UsuarioTecnicoTelefono1), A140UsuarioTecnicoTelefono1, Boolean.valueOf(n141UsuarioTecnicoTelefono2), A141UsuarioTecnicoTelefono2, Boolean.valueOf(n142UsuarioTecnicoTelefonoNombre1), A142UsuarioTecnicoTelefonoNombre1, Boolean.valueOf(n143UsuarioTecnicoTelefonoNombre2), A143UsuarioTecnicoTelefonoNombre2, Boolean.valueOf(n144UsuarioTecnicoEmail1), A144UsuarioTecnicoEmail1, Boolean.valueOf(n145UsuarioTecnicoEmail2), A145UsuarioTecnicoEmail2, Boolean.valueOf(n146UsuarioTecnicoEmailNombre1), A146UsuarioTecnicoEmailNombre1, Boolean.valueOf(n147UsuarioTecnicoEmailNombre2), A147UsuarioTecnicoEmailNombre2, Boolean.valueOf(n148UsuarioRutTipo), A148UsuarioRutTipo, Boolean.valueOf(n149UsuarioFacDireccion), A149UsuarioFacDireccion, Boolean.valueOf(n150UsuarioFacLocalidad), A150UsuarioFacLocalidad, Boolean.valueOf(n151UsuarioFacDepartamento), A151UsuarioFacDepartamento, Boolean.valueOf(n152UsuarioFacEmailEnvio), A152UsuarioFacEmailEnvio, Boolean.valueOf(n153UsuarioCobranzaCelular1), A153UsuarioCobranzaCelular1, Boolean.valueOf(n154UsuarioCobranzaCelular2), A154UsuarioCobranzaCelular2, Boolean.valueOf(n155UsuarioCobranzaCelularNombre1), A155UsuarioCobranzaCelularNombre1, Boolean.valueOf(n156UsuarioCobranzaCelularNombre2), A156UsuarioCobranzaCelularNombre2, Boolean.valueOf(n157UsuarioCobranzaTelefono1), A157UsuarioCobranzaTelefono1, Boolean.valueOf(n158UsuarioCobranzaTelefono2), A158UsuarioCobranzaTelefono2, Boolean.valueOf(n159UsuarioCobranzaTelefonoNombre1), A159UsuarioCobranzaTelefonoNombre1, Boolean.valueOf(n160UsuarioCobranzaTelefonoNombre2), A160UsuarioCobranzaTelefonoNombre2, Boolean.valueOf(n161UsuarioCobranzaEmail1), A161UsuarioCobranzaEmail1, Boolean.valueOf(n162UsuarioCobranzaEmail2), A162UsuarioCobranzaEmail2, Boolean.valueOf(n163UsuarioCobranzaEmailNombre1), A163UsuarioCobranzaEmailNombre1, Boolean.valueOf(n164UsuarioCobranzaEmailNombre2), A164UsuarioCobranzaEmailNombre2, Boolean.valueOf(n165UsuarioCedula), A165UsuarioCedula});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load055( ) ;
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void update055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000510 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n114UsuarioEmail), A114UsuarioEmail, Boolean.valueOf(n115UsuarioUsuarioWeb), A115UsuarioUsuarioWeb, Boolean.valueOf(n116UsuarioNombre), A116UsuarioNombre, Boolean.valueOf(n117UsuarioDicose), A117UsuarioDicose, Boolean.valueOf(n118UsuarioRazonSocial), A118UsuarioRazonSocial, Boolean.valueOf(n119UsuarioRut), A119UsuarioRut, Boolean.valueOf(n120UsuarioIdNet), Long.valueOf(A120UsuarioIdNet), Boolean.valueOf(n121UsuarioDireccion), A121UsuarioDireccion, Boolean.valueOf(n122UsuarioTipousuario), Short.valueOf(A122UsuarioTipousuario), Boolean.valueOf(n123UsuarioIdTecnico1), Long.valueOf(A123UsuarioIdTecnico1), Boolean.valueOf(n124UsuarioIdTecnico2), Long.valueOf(A124UsuarioIdTecnico2), Boolean.valueOf(n125UsuarioIdTecnico3), Long.valueOf(A125UsuarioIdTecnico3), Boolean.valueOf(n126UsuarioDireccionFrasco), A126UsuarioDireccionFrasco, Boolean.valueOf(n127UsuarioAgenciaFrasco), Short.valueOf(A127UsuarioAgenciaFrasco), Boolean.valueOf(n128UsuarioNotificacionFrasco1), A128UsuarioNotificacionFrasco1, Boolean.valueOf(n129UsuarioNotificacionFrasco2), A129UsuarioNotificacionFrasco2, Boolean.valueOf(n130UsuarioNotificacionSolicitud1), A130UsuarioNotificacionSolicitud1, Boolean.valueOf(n131UsuarioNotificacionSolicitud2), A131UsuarioNotificacionSolicitud2, Boolean.valueOf(n132UsuarioNotificacionResultado1), A132UsuarioNotificacionResultado1, Boolean.valueOf(n133UsuarioNotificacionResultado2), A133UsuarioNotificacionResultado2, Boolean.valueOf(n134UsuarioNotificacionAvisos1), A134UsuarioNotificacionAvisos1, Boolean.valueOf(n135UsuarioNotificacionAvisos2), A135UsuarioNotificacionAvisos2, Boolean.valueOf(n136UsuarioTecnicoCelular1), A136UsuarioTecnicoCelular1, Boolean.valueOf(n137UsuarioTecnicoCelular2), A137UsuarioTecnicoCelular2, Boolean.valueOf(n138UsuarioTecnicoCelularNombre1), A138UsuarioTecnicoCelularNombre1, Boolean.valueOf(n139UsuarioTecnicoCelularNombre2), A139UsuarioTecnicoCelularNombre2, Boolean.valueOf(n140UsuarioTecnicoTelefono1), A140UsuarioTecnicoTelefono1, Boolean.valueOf(n141UsuarioTecnicoTelefono2), A141UsuarioTecnicoTelefono2, Boolean.valueOf(n142UsuarioTecnicoTelefonoNombre1), A142UsuarioTecnicoTelefonoNombre1, Boolean.valueOf(n143UsuarioTecnicoTelefonoNombre2), A143UsuarioTecnicoTelefonoNombre2, Boolean.valueOf(n144UsuarioTecnicoEmail1), A144UsuarioTecnicoEmail1, Boolean.valueOf(n145UsuarioTecnicoEmail2), A145UsuarioTecnicoEmail2, Boolean.valueOf(n146UsuarioTecnicoEmailNombre1), A146UsuarioTecnicoEmailNombre1, Boolean.valueOf(n147UsuarioTecnicoEmailNombre2), A147UsuarioTecnicoEmailNombre2, Boolean.valueOf(n148UsuarioRutTipo), A148UsuarioRutTipo, Boolean.valueOf(n149UsuarioFacDireccion), A149UsuarioFacDireccion, Boolean.valueOf(n150UsuarioFacLocalidad), A150UsuarioFacLocalidad, Boolean.valueOf(n151UsuarioFacDepartamento), A151UsuarioFacDepartamento, Boolean.valueOf(n152UsuarioFacEmailEnvio), A152UsuarioFacEmailEnvio, Boolean.valueOf(n153UsuarioCobranzaCelular1), A153UsuarioCobranzaCelular1, Boolean.valueOf(n154UsuarioCobranzaCelular2), A154UsuarioCobranzaCelular2, Boolean.valueOf(n155UsuarioCobranzaCelularNombre1), A155UsuarioCobranzaCelularNombre1, Boolean.valueOf(n156UsuarioCobranzaCelularNombre2), A156UsuarioCobranzaCelularNombre2, Boolean.valueOf(n157UsuarioCobranzaTelefono1), A157UsuarioCobranzaTelefono1, Boolean.valueOf(n158UsuarioCobranzaTelefono2), A158UsuarioCobranzaTelefono2, Boolean.valueOf(n159UsuarioCobranzaTelefonoNombre1), A159UsuarioCobranzaTelefonoNombre1, Boolean.valueOf(n160UsuarioCobranzaTelefonoNombre2), A160UsuarioCobranzaTelefonoNombre2, Boolean.valueOf(n161UsuarioCobranzaEmail1), A161UsuarioCobranzaEmail1, Boolean.valueOf(n162UsuarioCobranzaEmail2), A162UsuarioCobranzaEmail2, Boolean.valueOf(n163UsuarioCobranzaEmailNombre1), A163UsuarioCobranzaEmailNombre1, Boolean.valueOf(n164UsuarioCobranzaEmailNombre2), A164UsuarioCobranzaEmailNombre2, Boolean.valueOf(n165UsuarioCedula), A165UsuarioCedula, Long.valueOf(A5UsuarioId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Usuario"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void deferredUpdate055( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls055( ) ;
         afterConfirm055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000511 */
               pr_default.execute(9, new Object[] {Long.valueOf(A5UsuarioId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Usuario");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel055( ) ;
      Gx_mode = sMode5 ;
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel055( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart055( )
   {
      /* Using cursor BC000512 */
      pr_default.execute(10, new Object[] {Long.valueOf(A5UsuarioId)});
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A5UsuarioId = BC000512_A5UsuarioId[0] ;
         A114UsuarioEmail = BC000512_A114UsuarioEmail[0] ;
         n114UsuarioEmail = BC000512_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = BC000512_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = BC000512_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = BC000512_A116UsuarioNombre[0] ;
         n116UsuarioNombre = BC000512_n116UsuarioNombre[0] ;
         A117UsuarioDicose = BC000512_A117UsuarioDicose[0] ;
         n117UsuarioDicose = BC000512_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = BC000512_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = BC000512_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = BC000512_A119UsuarioRut[0] ;
         n119UsuarioRut = BC000512_n119UsuarioRut[0] ;
         A120UsuarioIdNet = BC000512_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = BC000512_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = BC000512_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = BC000512_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = BC000512_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = BC000512_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = BC000512_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = BC000512_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = BC000512_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = BC000512_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = BC000512_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = BC000512_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = BC000512_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = BC000512_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = BC000512_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = BC000512_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = BC000512_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = BC000512_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = BC000512_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = BC000512_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = BC000512_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = BC000512_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = BC000512_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = BC000512_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = BC000512_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = BC000512_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = BC000512_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = BC000512_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = BC000512_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = BC000512_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = BC000512_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = BC000512_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = BC000512_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = BC000512_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = BC000512_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = BC000512_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = BC000512_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = BC000512_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = BC000512_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = BC000512_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = BC000512_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = BC000512_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = BC000512_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = BC000512_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = BC000512_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = BC000512_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = BC000512_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = BC000512_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = BC000512_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = BC000512_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = BC000512_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = BC000512_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = BC000512_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = BC000512_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = BC000512_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = BC000512_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = BC000512_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = BC000512_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = BC000512_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = BC000512_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = BC000512_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = BC000512_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = BC000512_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = BC000512_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = BC000512_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = BC000512_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = BC000512_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = BC000512_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = BC000512_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = BC000512_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = BC000512_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = BC000512_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = BC000512_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = BC000512_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = BC000512_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = BC000512_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = BC000512_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = BC000512_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = BC000512_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = BC000512_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = BC000512_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = BC000512_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = BC000512_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = BC000512_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = BC000512_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = BC000512_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = BC000512_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = BC000512_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = BC000512_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = BC000512_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = BC000512_A165UsuarioCedula[0] ;
         n165UsuarioCedula = BC000512_n165UsuarioCedula[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound5 = (short)(0) ;
      scanKeyLoad055( ) ;
   }

   public void scanKeyLoad055( )
   {
      sMode5 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A5UsuarioId = BC000512_A5UsuarioId[0] ;
         A114UsuarioEmail = BC000512_A114UsuarioEmail[0] ;
         n114UsuarioEmail = BC000512_n114UsuarioEmail[0] ;
         A115UsuarioUsuarioWeb = BC000512_A115UsuarioUsuarioWeb[0] ;
         n115UsuarioUsuarioWeb = BC000512_n115UsuarioUsuarioWeb[0] ;
         A116UsuarioNombre = BC000512_A116UsuarioNombre[0] ;
         n116UsuarioNombre = BC000512_n116UsuarioNombre[0] ;
         A117UsuarioDicose = BC000512_A117UsuarioDicose[0] ;
         n117UsuarioDicose = BC000512_n117UsuarioDicose[0] ;
         A118UsuarioRazonSocial = BC000512_A118UsuarioRazonSocial[0] ;
         n118UsuarioRazonSocial = BC000512_n118UsuarioRazonSocial[0] ;
         A119UsuarioRut = BC000512_A119UsuarioRut[0] ;
         n119UsuarioRut = BC000512_n119UsuarioRut[0] ;
         A120UsuarioIdNet = BC000512_A120UsuarioIdNet[0] ;
         n120UsuarioIdNet = BC000512_n120UsuarioIdNet[0] ;
         A121UsuarioDireccion = BC000512_A121UsuarioDireccion[0] ;
         n121UsuarioDireccion = BC000512_n121UsuarioDireccion[0] ;
         A122UsuarioTipousuario = BC000512_A122UsuarioTipousuario[0] ;
         n122UsuarioTipousuario = BC000512_n122UsuarioTipousuario[0] ;
         A123UsuarioIdTecnico1 = BC000512_A123UsuarioIdTecnico1[0] ;
         n123UsuarioIdTecnico1 = BC000512_n123UsuarioIdTecnico1[0] ;
         A124UsuarioIdTecnico2 = BC000512_A124UsuarioIdTecnico2[0] ;
         n124UsuarioIdTecnico2 = BC000512_n124UsuarioIdTecnico2[0] ;
         A125UsuarioIdTecnico3 = BC000512_A125UsuarioIdTecnico3[0] ;
         n125UsuarioIdTecnico3 = BC000512_n125UsuarioIdTecnico3[0] ;
         A126UsuarioDireccionFrasco = BC000512_A126UsuarioDireccionFrasco[0] ;
         n126UsuarioDireccionFrasco = BC000512_n126UsuarioDireccionFrasco[0] ;
         A127UsuarioAgenciaFrasco = BC000512_A127UsuarioAgenciaFrasco[0] ;
         n127UsuarioAgenciaFrasco = BC000512_n127UsuarioAgenciaFrasco[0] ;
         A128UsuarioNotificacionFrasco1 = BC000512_A128UsuarioNotificacionFrasco1[0] ;
         n128UsuarioNotificacionFrasco1 = BC000512_n128UsuarioNotificacionFrasco1[0] ;
         A129UsuarioNotificacionFrasco2 = BC000512_A129UsuarioNotificacionFrasco2[0] ;
         n129UsuarioNotificacionFrasco2 = BC000512_n129UsuarioNotificacionFrasco2[0] ;
         A130UsuarioNotificacionSolicitud1 = BC000512_A130UsuarioNotificacionSolicitud1[0] ;
         n130UsuarioNotificacionSolicitud1 = BC000512_n130UsuarioNotificacionSolicitud1[0] ;
         A131UsuarioNotificacionSolicitud2 = BC000512_A131UsuarioNotificacionSolicitud2[0] ;
         n131UsuarioNotificacionSolicitud2 = BC000512_n131UsuarioNotificacionSolicitud2[0] ;
         A132UsuarioNotificacionResultado1 = BC000512_A132UsuarioNotificacionResultado1[0] ;
         n132UsuarioNotificacionResultado1 = BC000512_n132UsuarioNotificacionResultado1[0] ;
         A133UsuarioNotificacionResultado2 = BC000512_A133UsuarioNotificacionResultado2[0] ;
         n133UsuarioNotificacionResultado2 = BC000512_n133UsuarioNotificacionResultado2[0] ;
         A134UsuarioNotificacionAvisos1 = BC000512_A134UsuarioNotificacionAvisos1[0] ;
         n134UsuarioNotificacionAvisos1 = BC000512_n134UsuarioNotificacionAvisos1[0] ;
         A135UsuarioNotificacionAvisos2 = BC000512_A135UsuarioNotificacionAvisos2[0] ;
         n135UsuarioNotificacionAvisos2 = BC000512_n135UsuarioNotificacionAvisos2[0] ;
         A136UsuarioTecnicoCelular1 = BC000512_A136UsuarioTecnicoCelular1[0] ;
         n136UsuarioTecnicoCelular1 = BC000512_n136UsuarioTecnicoCelular1[0] ;
         A137UsuarioTecnicoCelular2 = BC000512_A137UsuarioTecnicoCelular2[0] ;
         n137UsuarioTecnicoCelular2 = BC000512_n137UsuarioTecnicoCelular2[0] ;
         A138UsuarioTecnicoCelularNombre1 = BC000512_A138UsuarioTecnicoCelularNombre1[0] ;
         n138UsuarioTecnicoCelularNombre1 = BC000512_n138UsuarioTecnicoCelularNombre1[0] ;
         A139UsuarioTecnicoCelularNombre2 = BC000512_A139UsuarioTecnicoCelularNombre2[0] ;
         n139UsuarioTecnicoCelularNombre2 = BC000512_n139UsuarioTecnicoCelularNombre2[0] ;
         A140UsuarioTecnicoTelefono1 = BC000512_A140UsuarioTecnicoTelefono1[0] ;
         n140UsuarioTecnicoTelefono1 = BC000512_n140UsuarioTecnicoTelefono1[0] ;
         A141UsuarioTecnicoTelefono2 = BC000512_A141UsuarioTecnicoTelefono2[0] ;
         n141UsuarioTecnicoTelefono2 = BC000512_n141UsuarioTecnicoTelefono2[0] ;
         A142UsuarioTecnicoTelefonoNombre1 = BC000512_A142UsuarioTecnicoTelefonoNombre1[0] ;
         n142UsuarioTecnicoTelefonoNombre1 = BC000512_n142UsuarioTecnicoTelefonoNombre1[0] ;
         A143UsuarioTecnicoTelefonoNombre2 = BC000512_A143UsuarioTecnicoTelefonoNombre2[0] ;
         n143UsuarioTecnicoTelefonoNombre2 = BC000512_n143UsuarioTecnicoTelefonoNombre2[0] ;
         A144UsuarioTecnicoEmail1 = BC000512_A144UsuarioTecnicoEmail1[0] ;
         n144UsuarioTecnicoEmail1 = BC000512_n144UsuarioTecnicoEmail1[0] ;
         A145UsuarioTecnicoEmail2 = BC000512_A145UsuarioTecnicoEmail2[0] ;
         n145UsuarioTecnicoEmail2 = BC000512_n145UsuarioTecnicoEmail2[0] ;
         A146UsuarioTecnicoEmailNombre1 = BC000512_A146UsuarioTecnicoEmailNombre1[0] ;
         n146UsuarioTecnicoEmailNombre1 = BC000512_n146UsuarioTecnicoEmailNombre1[0] ;
         A147UsuarioTecnicoEmailNombre2 = BC000512_A147UsuarioTecnicoEmailNombre2[0] ;
         n147UsuarioTecnicoEmailNombre2 = BC000512_n147UsuarioTecnicoEmailNombre2[0] ;
         A148UsuarioRutTipo = BC000512_A148UsuarioRutTipo[0] ;
         n148UsuarioRutTipo = BC000512_n148UsuarioRutTipo[0] ;
         A149UsuarioFacDireccion = BC000512_A149UsuarioFacDireccion[0] ;
         n149UsuarioFacDireccion = BC000512_n149UsuarioFacDireccion[0] ;
         A150UsuarioFacLocalidad = BC000512_A150UsuarioFacLocalidad[0] ;
         n150UsuarioFacLocalidad = BC000512_n150UsuarioFacLocalidad[0] ;
         A151UsuarioFacDepartamento = BC000512_A151UsuarioFacDepartamento[0] ;
         n151UsuarioFacDepartamento = BC000512_n151UsuarioFacDepartamento[0] ;
         A152UsuarioFacEmailEnvio = BC000512_A152UsuarioFacEmailEnvio[0] ;
         n152UsuarioFacEmailEnvio = BC000512_n152UsuarioFacEmailEnvio[0] ;
         A153UsuarioCobranzaCelular1 = BC000512_A153UsuarioCobranzaCelular1[0] ;
         n153UsuarioCobranzaCelular1 = BC000512_n153UsuarioCobranzaCelular1[0] ;
         A154UsuarioCobranzaCelular2 = BC000512_A154UsuarioCobranzaCelular2[0] ;
         n154UsuarioCobranzaCelular2 = BC000512_n154UsuarioCobranzaCelular2[0] ;
         A155UsuarioCobranzaCelularNombre1 = BC000512_A155UsuarioCobranzaCelularNombre1[0] ;
         n155UsuarioCobranzaCelularNombre1 = BC000512_n155UsuarioCobranzaCelularNombre1[0] ;
         A156UsuarioCobranzaCelularNombre2 = BC000512_A156UsuarioCobranzaCelularNombre2[0] ;
         n156UsuarioCobranzaCelularNombre2 = BC000512_n156UsuarioCobranzaCelularNombre2[0] ;
         A157UsuarioCobranzaTelefono1 = BC000512_A157UsuarioCobranzaTelefono1[0] ;
         n157UsuarioCobranzaTelefono1 = BC000512_n157UsuarioCobranzaTelefono1[0] ;
         A158UsuarioCobranzaTelefono2 = BC000512_A158UsuarioCobranzaTelefono2[0] ;
         n158UsuarioCobranzaTelefono2 = BC000512_n158UsuarioCobranzaTelefono2[0] ;
         A159UsuarioCobranzaTelefonoNombre1 = BC000512_A159UsuarioCobranzaTelefonoNombre1[0] ;
         n159UsuarioCobranzaTelefonoNombre1 = BC000512_n159UsuarioCobranzaTelefonoNombre1[0] ;
         A160UsuarioCobranzaTelefonoNombre2 = BC000512_A160UsuarioCobranzaTelefonoNombre2[0] ;
         n160UsuarioCobranzaTelefonoNombre2 = BC000512_n160UsuarioCobranzaTelefonoNombre2[0] ;
         A161UsuarioCobranzaEmail1 = BC000512_A161UsuarioCobranzaEmail1[0] ;
         n161UsuarioCobranzaEmail1 = BC000512_n161UsuarioCobranzaEmail1[0] ;
         A162UsuarioCobranzaEmail2 = BC000512_A162UsuarioCobranzaEmail2[0] ;
         n162UsuarioCobranzaEmail2 = BC000512_n162UsuarioCobranzaEmail2[0] ;
         A163UsuarioCobranzaEmailNombre1 = BC000512_A163UsuarioCobranzaEmailNombre1[0] ;
         n163UsuarioCobranzaEmailNombre1 = BC000512_n163UsuarioCobranzaEmailNombre1[0] ;
         A164UsuarioCobranzaEmailNombre2 = BC000512_A164UsuarioCobranzaEmailNombre2[0] ;
         n164UsuarioCobranzaEmailNombre2 = BC000512_n164UsuarioCobranzaEmailNombre2[0] ;
         A165UsuarioCedula = BC000512_A165UsuarioCedula[0] ;
         n165UsuarioCedula = BC000512_n165UsuarioCedula[0] ;
      }
      Gx_mode = sMode5 ;
   }

   public void scanKeyEnd055( )
   {
      pr_default.close(10);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes055( )
   {
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void addRow055( )
   {
      VarsToRow5( bcUsuario) ;
   }

   public void readRow055( )
   {
      RowToVars5( bcUsuario, 1) ;
   }

   public void initializeNonKey055( )
   {
      A114UsuarioEmail = "" ;
      n114UsuarioEmail = false ;
      A115UsuarioUsuarioWeb = "" ;
      n115UsuarioUsuarioWeb = false ;
      A116UsuarioNombre = "" ;
      n116UsuarioNombre = false ;
      A117UsuarioDicose = "" ;
      n117UsuarioDicose = false ;
      A118UsuarioRazonSocial = "" ;
      n118UsuarioRazonSocial = false ;
      A119UsuarioRut = "" ;
      n119UsuarioRut = false ;
      A120UsuarioIdNet = 0 ;
      n120UsuarioIdNet = false ;
      A121UsuarioDireccion = "" ;
      n121UsuarioDireccion = false ;
      A122UsuarioTipousuario = (short)(0) ;
      n122UsuarioTipousuario = false ;
      A123UsuarioIdTecnico1 = 0 ;
      n123UsuarioIdTecnico1 = false ;
      A124UsuarioIdTecnico2 = 0 ;
      n124UsuarioIdTecnico2 = false ;
      A125UsuarioIdTecnico3 = 0 ;
      n125UsuarioIdTecnico3 = false ;
      A126UsuarioDireccionFrasco = "" ;
      n126UsuarioDireccionFrasco = false ;
      A127UsuarioAgenciaFrasco = (short)(0) ;
      n127UsuarioAgenciaFrasco = false ;
      A128UsuarioNotificacionFrasco1 = "" ;
      n128UsuarioNotificacionFrasco1 = false ;
      A129UsuarioNotificacionFrasco2 = "" ;
      n129UsuarioNotificacionFrasco2 = false ;
      A130UsuarioNotificacionSolicitud1 = "" ;
      n130UsuarioNotificacionSolicitud1 = false ;
      A131UsuarioNotificacionSolicitud2 = "" ;
      n131UsuarioNotificacionSolicitud2 = false ;
      A132UsuarioNotificacionResultado1 = "" ;
      n132UsuarioNotificacionResultado1 = false ;
      A133UsuarioNotificacionResultado2 = "" ;
      n133UsuarioNotificacionResultado2 = false ;
      A134UsuarioNotificacionAvisos1 = "" ;
      n134UsuarioNotificacionAvisos1 = false ;
      A135UsuarioNotificacionAvisos2 = "" ;
      n135UsuarioNotificacionAvisos2 = false ;
      A136UsuarioTecnicoCelular1 = "" ;
      n136UsuarioTecnicoCelular1 = false ;
      A137UsuarioTecnicoCelular2 = "" ;
      n137UsuarioTecnicoCelular2 = false ;
      A138UsuarioTecnicoCelularNombre1 = "" ;
      n138UsuarioTecnicoCelularNombre1 = false ;
      A139UsuarioTecnicoCelularNombre2 = "" ;
      n139UsuarioTecnicoCelularNombre2 = false ;
      A140UsuarioTecnicoTelefono1 = "" ;
      n140UsuarioTecnicoTelefono1 = false ;
      A141UsuarioTecnicoTelefono2 = "" ;
      n141UsuarioTecnicoTelefono2 = false ;
      A142UsuarioTecnicoTelefonoNombre1 = "" ;
      n142UsuarioTecnicoTelefonoNombre1 = false ;
      A143UsuarioTecnicoTelefonoNombre2 = "" ;
      n143UsuarioTecnicoTelefonoNombre2 = false ;
      A144UsuarioTecnicoEmail1 = "" ;
      n144UsuarioTecnicoEmail1 = false ;
      A145UsuarioTecnicoEmail2 = "" ;
      n145UsuarioTecnicoEmail2 = false ;
      A146UsuarioTecnicoEmailNombre1 = "" ;
      n146UsuarioTecnicoEmailNombre1 = false ;
      A147UsuarioTecnicoEmailNombre2 = "" ;
      n147UsuarioTecnicoEmailNombre2 = false ;
      A148UsuarioRutTipo = "" ;
      n148UsuarioRutTipo = false ;
      A149UsuarioFacDireccion = "" ;
      n149UsuarioFacDireccion = false ;
      A150UsuarioFacLocalidad = "" ;
      n150UsuarioFacLocalidad = false ;
      A151UsuarioFacDepartamento = "" ;
      n151UsuarioFacDepartamento = false ;
      A152UsuarioFacEmailEnvio = "" ;
      n152UsuarioFacEmailEnvio = false ;
      A153UsuarioCobranzaCelular1 = "" ;
      n153UsuarioCobranzaCelular1 = false ;
      A154UsuarioCobranzaCelular2 = "" ;
      n154UsuarioCobranzaCelular2 = false ;
      A155UsuarioCobranzaCelularNombre1 = "" ;
      n155UsuarioCobranzaCelularNombre1 = false ;
      A156UsuarioCobranzaCelularNombre2 = "" ;
      n156UsuarioCobranzaCelularNombre2 = false ;
      A157UsuarioCobranzaTelefono1 = "" ;
      n157UsuarioCobranzaTelefono1 = false ;
      A158UsuarioCobranzaTelefono2 = "" ;
      n158UsuarioCobranzaTelefono2 = false ;
      A159UsuarioCobranzaTelefonoNombre1 = "" ;
      n159UsuarioCobranzaTelefonoNombre1 = false ;
      A160UsuarioCobranzaTelefonoNombre2 = "" ;
      n160UsuarioCobranzaTelefonoNombre2 = false ;
      A161UsuarioCobranzaEmail1 = "" ;
      n161UsuarioCobranzaEmail1 = false ;
      A162UsuarioCobranzaEmail2 = "" ;
      n162UsuarioCobranzaEmail2 = false ;
      A163UsuarioCobranzaEmailNombre1 = "" ;
      n163UsuarioCobranzaEmailNombre1 = false ;
      A164UsuarioCobranzaEmailNombre2 = "" ;
      n164UsuarioCobranzaEmailNombre2 = false ;
      A165UsuarioCedula = "" ;
      n165UsuarioCedula = false ;
      Z114UsuarioEmail = "" ;
      Z115UsuarioUsuarioWeb = "" ;
      Z116UsuarioNombre = "" ;
      Z117UsuarioDicose = "" ;
      Z118UsuarioRazonSocial = "" ;
      Z119UsuarioRut = "" ;
      Z120UsuarioIdNet = 0 ;
      Z121UsuarioDireccion = "" ;
      Z122UsuarioTipousuario = (short)(0) ;
      Z123UsuarioIdTecnico1 = 0 ;
      Z124UsuarioIdTecnico2 = 0 ;
      Z125UsuarioIdTecnico3 = 0 ;
      Z126UsuarioDireccionFrasco = "" ;
      Z127UsuarioAgenciaFrasco = (short)(0) ;
      Z128UsuarioNotificacionFrasco1 = "" ;
      Z129UsuarioNotificacionFrasco2 = "" ;
      Z130UsuarioNotificacionSolicitud1 = "" ;
      Z131UsuarioNotificacionSolicitud2 = "" ;
      Z132UsuarioNotificacionResultado1 = "" ;
      Z133UsuarioNotificacionResultado2 = "" ;
      Z134UsuarioNotificacionAvisos1 = "" ;
      Z135UsuarioNotificacionAvisos2 = "" ;
      Z136UsuarioTecnicoCelular1 = "" ;
      Z137UsuarioTecnicoCelular2 = "" ;
      Z138UsuarioTecnicoCelularNombre1 = "" ;
      Z139UsuarioTecnicoCelularNombre2 = "" ;
      Z140UsuarioTecnicoTelefono1 = "" ;
      Z141UsuarioTecnicoTelefono2 = "" ;
      Z142UsuarioTecnicoTelefonoNombre1 = "" ;
      Z143UsuarioTecnicoTelefonoNombre2 = "" ;
      Z144UsuarioTecnicoEmail1 = "" ;
      Z145UsuarioTecnicoEmail2 = "" ;
      Z146UsuarioTecnicoEmailNombre1 = "" ;
      Z147UsuarioTecnicoEmailNombre2 = "" ;
      Z148UsuarioRutTipo = "" ;
      Z149UsuarioFacDireccion = "" ;
      Z150UsuarioFacLocalidad = "" ;
      Z151UsuarioFacDepartamento = "" ;
      Z152UsuarioFacEmailEnvio = "" ;
      Z153UsuarioCobranzaCelular1 = "" ;
      Z154UsuarioCobranzaCelular2 = "" ;
      Z155UsuarioCobranzaCelularNombre1 = "" ;
      Z156UsuarioCobranzaCelularNombre2 = "" ;
      Z157UsuarioCobranzaTelefono1 = "" ;
      Z158UsuarioCobranzaTelefono2 = "" ;
      Z159UsuarioCobranzaTelefonoNombre1 = "" ;
      Z160UsuarioCobranzaTelefonoNombre2 = "" ;
      Z161UsuarioCobranzaEmail1 = "" ;
      Z162UsuarioCobranzaEmail2 = "" ;
      Z163UsuarioCobranzaEmailNombre1 = "" ;
      Z164UsuarioCobranzaEmailNombre2 = "" ;
      Z165UsuarioCedula = "" ;
   }

   public void initAll055( )
   {
      A5UsuarioId = 0 ;
      initializeNonKey055( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow5( com.colaveco.SdtUsuario obj5 )
   {
      obj5.setgxTv_SdtUsuario_Mode( Gx_mode );
      obj5.setgxTv_SdtUsuario_Usuarioemail( A114UsuarioEmail );
      obj5.setgxTv_SdtUsuario_Usuariousuarioweb( A115UsuarioUsuarioWeb );
      obj5.setgxTv_SdtUsuario_Usuarionombre( A116UsuarioNombre );
      obj5.setgxTv_SdtUsuario_Usuariodicose( A117UsuarioDicose );
      obj5.setgxTv_SdtUsuario_Usuariorazonsocial( A118UsuarioRazonSocial );
      obj5.setgxTv_SdtUsuario_Usuariorut( A119UsuarioRut );
      obj5.setgxTv_SdtUsuario_Usuarioidnet( A120UsuarioIdNet );
      obj5.setgxTv_SdtUsuario_Usuariodireccion( A121UsuarioDireccion );
      obj5.setgxTv_SdtUsuario_Usuariotipousuario( A122UsuarioTipousuario );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico1( A123UsuarioIdTecnico1 );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico2( A124UsuarioIdTecnico2 );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico3( A125UsuarioIdTecnico3 );
      obj5.setgxTv_SdtUsuario_Usuariodireccionfrasco( A126UsuarioDireccionFrasco );
      obj5.setgxTv_SdtUsuario_Usuarioagenciafrasco( A127UsuarioAgenciaFrasco );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco1( A128UsuarioNotificacionFrasco1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco2( A129UsuarioNotificacionFrasco2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud1( A130UsuarioNotificacionSolicitud1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud2( A131UsuarioNotificacionSolicitud2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado1( A132UsuarioNotificacionResultado1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado2( A133UsuarioNotificacionResultado2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos1( A134UsuarioNotificacionAvisos1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos2( A135UsuarioNotificacionAvisos2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular1( A136UsuarioTecnicoCelular1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular2( A137UsuarioTecnicoCelular2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre1( A138UsuarioTecnicoCelularNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre2( A139UsuarioTecnicoCelularNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono1( A140UsuarioTecnicoTelefono1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono2( A141UsuarioTecnicoTelefono2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre1( A142UsuarioTecnicoTelefonoNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre2( A143UsuarioTecnicoTelefonoNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail1( A144UsuarioTecnicoEmail1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail2( A145UsuarioTecnicoEmail2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre1( A146UsuarioTecnicoEmailNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre2( A147UsuarioTecnicoEmailNombre2 );
      obj5.setgxTv_SdtUsuario_Usuarioruttipo( A148UsuarioRutTipo );
      obj5.setgxTv_SdtUsuario_Usuariofacdireccion( A149UsuarioFacDireccion );
      obj5.setgxTv_SdtUsuario_Usuariofaclocalidad( A150UsuarioFacLocalidad );
      obj5.setgxTv_SdtUsuario_Usuariofacdepartamento( A151UsuarioFacDepartamento );
      obj5.setgxTv_SdtUsuario_Usuariofacemailenvio( A152UsuarioFacEmailEnvio );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular1( A153UsuarioCobranzaCelular1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular2( A154UsuarioCobranzaCelular2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre1( A155UsuarioCobranzaCelularNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre2( A156UsuarioCobranzaCelularNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono1( A157UsuarioCobranzaTelefono1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono2( A158UsuarioCobranzaTelefono2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre1( A159UsuarioCobranzaTelefonoNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre2( A160UsuarioCobranzaTelefonoNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail1( A161UsuarioCobranzaEmail1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail2( A162UsuarioCobranzaEmail2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre1( A163UsuarioCobranzaEmailNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre2( A164UsuarioCobranzaEmailNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocedula( A165UsuarioCedula );
      obj5.setgxTv_SdtUsuario_Usuarioid( A5UsuarioId );
      obj5.setgxTv_SdtUsuario_Usuarioid_Z( Z5UsuarioId );
      obj5.setgxTv_SdtUsuario_Usuarioemail_Z( Z114UsuarioEmail );
      obj5.setgxTv_SdtUsuario_Usuariousuarioweb_Z( Z115UsuarioUsuarioWeb );
      obj5.setgxTv_SdtUsuario_Usuarionombre_Z( Z116UsuarioNombre );
      obj5.setgxTv_SdtUsuario_Usuariodicose_Z( Z117UsuarioDicose );
      obj5.setgxTv_SdtUsuario_Usuariorazonsocial_Z( Z118UsuarioRazonSocial );
      obj5.setgxTv_SdtUsuario_Usuariorut_Z( Z119UsuarioRut );
      obj5.setgxTv_SdtUsuario_Usuarioidnet_Z( Z120UsuarioIdNet );
      obj5.setgxTv_SdtUsuario_Usuariodireccion_Z( Z121UsuarioDireccion );
      obj5.setgxTv_SdtUsuario_Usuariotipousuario_Z( Z122UsuarioTipousuario );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico1_Z( Z123UsuarioIdTecnico1 );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico2_Z( Z124UsuarioIdTecnico2 );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico3_Z( Z125UsuarioIdTecnico3 );
      obj5.setgxTv_SdtUsuario_Usuariodireccionfrasco_Z( Z126UsuarioDireccionFrasco );
      obj5.setgxTv_SdtUsuario_Usuarioagenciafrasco_Z( Z127UsuarioAgenciaFrasco );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z( Z128UsuarioNotificacionFrasco1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z( Z129UsuarioNotificacionFrasco2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z( Z130UsuarioNotificacionSolicitud1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z( Z131UsuarioNotificacionSolicitud2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado1_Z( Z132UsuarioNotificacionResultado1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado2_Z( Z133UsuarioNotificacionResultado2 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos1_Z( Z134UsuarioNotificacionAvisos1 );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos2_Z( Z135UsuarioNotificacionAvisos2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular1_Z( Z136UsuarioTecnicoCelular1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular2_Z( Z137UsuarioTecnicoCelular2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z( Z138UsuarioTecnicoCelularNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z( Z139UsuarioTecnicoCelularNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono1_Z( Z140UsuarioTecnicoTelefono1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono2_Z( Z141UsuarioTecnicoTelefono2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z( Z142UsuarioTecnicoTelefonoNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z( Z143UsuarioTecnicoTelefonoNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail1_Z( Z144UsuarioTecnicoEmail1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail2_Z( Z145UsuarioTecnicoEmail2 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z( Z146UsuarioTecnicoEmailNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z( Z147UsuarioTecnicoEmailNombre2 );
      obj5.setgxTv_SdtUsuario_Usuarioruttipo_Z( Z148UsuarioRutTipo );
      obj5.setgxTv_SdtUsuario_Usuariofacdireccion_Z( Z149UsuarioFacDireccion );
      obj5.setgxTv_SdtUsuario_Usuariofaclocalidad_Z( Z150UsuarioFacLocalidad );
      obj5.setgxTv_SdtUsuario_Usuariofacdepartamento_Z( Z151UsuarioFacDepartamento );
      obj5.setgxTv_SdtUsuario_Usuariofacemailenvio_Z( Z152UsuarioFacEmailEnvio );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular1_Z( Z153UsuarioCobranzaCelular1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular2_Z( Z154UsuarioCobranzaCelular2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z( Z155UsuarioCobranzaCelularNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z( Z156UsuarioCobranzaCelularNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono1_Z( Z157UsuarioCobranzaTelefono1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono2_Z( Z158UsuarioCobranzaTelefono2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z( Z159UsuarioCobranzaTelefonoNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z( Z160UsuarioCobranzaTelefonoNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail1_Z( Z161UsuarioCobranzaEmail1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail2_Z( Z162UsuarioCobranzaEmail2 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z( Z163UsuarioCobranzaEmailNombre1 );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z( Z164UsuarioCobranzaEmailNombre2 );
      obj5.setgxTv_SdtUsuario_Usuariocedula_Z( Z165UsuarioCedula );
      obj5.setgxTv_SdtUsuario_Usuarioemail_N( (byte)((byte)((n114UsuarioEmail)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariousuarioweb_N( (byte)((byte)((n115UsuarioUsuarioWeb)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionombre_N( (byte)((byte)((n116UsuarioNombre)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariodicose_N( (byte)((byte)((n117UsuarioDicose)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariorazonsocial_N( (byte)((byte)((n118UsuarioRazonSocial)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariorut_N( (byte)((byte)((n119UsuarioRut)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioidnet_N( (byte)((byte)((n120UsuarioIdNet)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariodireccion_N( (byte)((byte)((n121UsuarioDireccion)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotipousuario_N( (byte)((byte)((n122UsuarioTipousuario)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico1_N( (byte)((byte)((n123UsuarioIdTecnico1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico2_N( (byte)((byte)((n124UsuarioIdTecnico2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioidtecnico3_N( (byte)((byte)((n125UsuarioIdTecnico3)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariodireccionfrasco_N( (byte)((byte)((n126UsuarioDireccionFrasco)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioagenciafrasco_N( (byte)((byte)((n127UsuarioAgenciaFrasco)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco1_N( (byte)((byte)((n128UsuarioNotificacionFrasco1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionfrasco2_N( (byte)((byte)((n129UsuarioNotificacionFrasco2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N( (byte)((byte)((n130UsuarioNotificacionSolicitud1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N( (byte)((byte)((n131UsuarioNotificacionSolicitud2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado1_N( (byte)((byte)((n132UsuarioNotificacionResultado1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionresultado2_N( (byte)((byte)((n133UsuarioNotificacionResultado2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos1_N( (byte)((byte)((n134UsuarioNotificacionAvisos1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarionotificacionavisos2_N( (byte)((byte)((n135UsuarioNotificacionAvisos2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular1_N( (byte)((byte)((n136UsuarioTecnicoCelular1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelular2_N( (byte)((byte)((n137UsuarioTecnicoCelular2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N( (byte)((byte)((n138UsuarioTecnicoCelularNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N( (byte)((byte)((n139UsuarioTecnicoCelularNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono1_N( (byte)((byte)((n140UsuarioTecnicoTelefono1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefono2_N( (byte)((byte)((n141UsuarioTecnicoTelefono2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N( (byte)((byte)((n142UsuarioTecnicoTelefonoNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N( (byte)((byte)((n143UsuarioTecnicoTelefonoNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail1_N( (byte)((byte)((n144UsuarioTecnicoEmail1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemail2_N( (byte)((byte)((n145UsuarioTecnicoEmail2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N( (byte)((byte)((n146UsuarioTecnicoEmailNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N( (byte)((byte)((n147UsuarioTecnicoEmailNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuarioruttipo_N( (byte)((byte)((n148UsuarioRutTipo)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariofacdireccion_N( (byte)((byte)((n149UsuarioFacDireccion)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariofaclocalidad_N( (byte)((byte)((n150UsuarioFacLocalidad)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariofacdepartamento_N( (byte)((byte)((n151UsuarioFacDepartamento)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariofacemailenvio_N( (byte)((byte)((n152UsuarioFacEmailEnvio)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular1_N( (byte)((byte)((n153UsuarioCobranzaCelular1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelular2_N( (byte)((byte)((n154UsuarioCobranzaCelular2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N( (byte)((byte)((n155UsuarioCobranzaCelularNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N( (byte)((byte)((n156UsuarioCobranzaCelularNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono1_N( (byte)((byte)((n157UsuarioCobranzaTelefono1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefono2_N( (byte)((byte)((n158UsuarioCobranzaTelefono2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N( (byte)((byte)((n159UsuarioCobranzaTelefonoNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N( (byte)((byte)((n160UsuarioCobranzaTelefonoNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail1_N( (byte)((byte)((n161UsuarioCobranzaEmail1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemail2_N( (byte)((byte)((n162UsuarioCobranzaEmail2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N( (byte)((byte)((n163UsuarioCobranzaEmailNombre1)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N( (byte)((byte)((n164UsuarioCobranzaEmailNombre2)?1:0)) );
      obj5.setgxTv_SdtUsuario_Usuariocedula_N( (byte)((byte)((n165UsuarioCedula)?1:0)) );
      obj5.setgxTv_SdtUsuario_Mode( Gx_mode );
   }

   public void KeyVarsToRow5( com.colaveco.SdtUsuario obj5 )
   {
      obj5.setgxTv_SdtUsuario_Usuarioid( A5UsuarioId );
   }

   public void RowToVars5( com.colaveco.SdtUsuario obj5 ,
                           int forceLoad )
   {
      Gx_mode = obj5.getgxTv_SdtUsuario_Mode() ;
      A114UsuarioEmail = obj5.getgxTv_SdtUsuario_Usuarioemail() ;
      n114UsuarioEmail = false ;
      A115UsuarioUsuarioWeb = obj5.getgxTv_SdtUsuario_Usuariousuarioweb() ;
      n115UsuarioUsuarioWeb = false ;
      A116UsuarioNombre = obj5.getgxTv_SdtUsuario_Usuarionombre() ;
      n116UsuarioNombre = false ;
      A117UsuarioDicose = obj5.getgxTv_SdtUsuario_Usuariodicose() ;
      n117UsuarioDicose = false ;
      A118UsuarioRazonSocial = obj5.getgxTv_SdtUsuario_Usuariorazonsocial() ;
      n118UsuarioRazonSocial = false ;
      A119UsuarioRut = obj5.getgxTv_SdtUsuario_Usuariorut() ;
      n119UsuarioRut = false ;
      A120UsuarioIdNet = obj5.getgxTv_SdtUsuario_Usuarioidnet() ;
      n120UsuarioIdNet = false ;
      A121UsuarioDireccion = obj5.getgxTv_SdtUsuario_Usuariodireccion() ;
      n121UsuarioDireccion = false ;
      A122UsuarioTipousuario = obj5.getgxTv_SdtUsuario_Usuariotipousuario() ;
      n122UsuarioTipousuario = false ;
      A123UsuarioIdTecnico1 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico1() ;
      n123UsuarioIdTecnico1 = false ;
      A124UsuarioIdTecnico2 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico2() ;
      n124UsuarioIdTecnico2 = false ;
      A125UsuarioIdTecnico3 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico3() ;
      n125UsuarioIdTecnico3 = false ;
      A126UsuarioDireccionFrasco = obj5.getgxTv_SdtUsuario_Usuariodireccionfrasco() ;
      n126UsuarioDireccionFrasco = false ;
      A127UsuarioAgenciaFrasco = obj5.getgxTv_SdtUsuario_Usuarioagenciafrasco() ;
      n127UsuarioAgenciaFrasco = false ;
      A128UsuarioNotificacionFrasco1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco1() ;
      n128UsuarioNotificacionFrasco1 = false ;
      A129UsuarioNotificacionFrasco2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco2() ;
      n129UsuarioNotificacionFrasco2 = false ;
      A130UsuarioNotificacionSolicitud1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud1() ;
      n130UsuarioNotificacionSolicitud1 = false ;
      A131UsuarioNotificacionSolicitud2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud2() ;
      n131UsuarioNotificacionSolicitud2 = false ;
      A132UsuarioNotificacionResultado1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado1() ;
      n132UsuarioNotificacionResultado1 = false ;
      A133UsuarioNotificacionResultado2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado2() ;
      n133UsuarioNotificacionResultado2 = false ;
      A134UsuarioNotificacionAvisos1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos1() ;
      n134UsuarioNotificacionAvisos1 = false ;
      A135UsuarioNotificacionAvisos2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos2() ;
      n135UsuarioNotificacionAvisos2 = false ;
      A136UsuarioTecnicoCelular1 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelular1() ;
      n136UsuarioTecnicoCelular1 = false ;
      A137UsuarioTecnicoCelular2 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelular2() ;
      n137UsuarioTecnicoCelular2 = false ;
      A138UsuarioTecnicoCelularNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre1() ;
      n138UsuarioTecnicoCelularNombre1 = false ;
      A139UsuarioTecnicoCelularNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre2() ;
      n139UsuarioTecnicoCelularNombre2 = false ;
      A140UsuarioTecnicoTelefono1 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono1() ;
      n140UsuarioTecnicoTelefono1 = false ;
      A141UsuarioTecnicoTelefono2 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono2() ;
      n141UsuarioTecnicoTelefono2 = false ;
      A142UsuarioTecnicoTelefonoNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre1() ;
      n142UsuarioTecnicoTelefonoNombre1 = false ;
      A143UsuarioTecnicoTelefonoNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre2() ;
      n143UsuarioTecnicoTelefonoNombre2 = false ;
      A144UsuarioTecnicoEmail1 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemail1() ;
      n144UsuarioTecnicoEmail1 = false ;
      A145UsuarioTecnicoEmail2 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemail2() ;
      n145UsuarioTecnicoEmail2 = false ;
      A146UsuarioTecnicoEmailNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre1() ;
      n146UsuarioTecnicoEmailNombre1 = false ;
      A147UsuarioTecnicoEmailNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre2() ;
      n147UsuarioTecnicoEmailNombre2 = false ;
      A148UsuarioRutTipo = obj5.getgxTv_SdtUsuario_Usuarioruttipo() ;
      n148UsuarioRutTipo = false ;
      A149UsuarioFacDireccion = obj5.getgxTv_SdtUsuario_Usuariofacdireccion() ;
      n149UsuarioFacDireccion = false ;
      A150UsuarioFacLocalidad = obj5.getgxTv_SdtUsuario_Usuariofaclocalidad() ;
      n150UsuarioFacLocalidad = false ;
      A151UsuarioFacDepartamento = obj5.getgxTv_SdtUsuario_Usuariofacdepartamento() ;
      n151UsuarioFacDepartamento = false ;
      A152UsuarioFacEmailEnvio = obj5.getgxTv_SdtUsuario_Usuariofacemailenvio() ;
      n152UsuarioFacEmailEnvio = false ;
      A153UsuarioCobranzaCelular1 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelular1() ;
      n153UsuarioCobranzaCelular1 = false ;
      A154UsuarioCobranzaCelular2 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelular2() ;
      n154UsuarioCobranzaCelular2 = false ;
      A155UsuarioCobranzaCelularNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre1() ;
      n155UsuarioCobranzaCelularNombre1 = false ;
      A156UsuarioCobranzaCelularNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre2() ;
      n156UsuarioCobranzaCelularNombre2 = false ;
      A157UsuarioCobranzaTelefono1 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono1() ;
      n157UsuarioCobranzaTelefono1 = false ;
      A158UsuarioCobranzaTelefono2 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono2() ;
      n158UsuarioCobranzaTelefono2 = false ;
      A159UsuarioCobranzaTelefonoNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre1() ;
      n159UsuarioCobranzaTelefonoNombre1 = false ;
      A160UsuarioCobranzaTelefonoNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre2() ;
      n160UsuarioCobranzaTelefonoNombre2 = false ;
      A161UsuarioCobranzaEmail1 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemail1() ;
      n161UsuarioCobranzaEmail1 = false ;
      A162UsuarioCobranzaEmail2 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemail2() ;
      n162UsuarioCobranzaEmail2 = false ;
      A163UsuarioCobranzaEmailNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre1() ;
      n163UsuarioCobranzaEmailNombre1 = false ;
      A164UsuarioCobranzaEmailNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre2() ;
      n164UsuarioCobranzaEmailNombre2 = false ;
      A165UsuarioCedula = obj5.getgxTv_SdtUsuario_Usuariocedula() ;
      n165UsuarioCedula = false ;
      A5UsuarioId = obj5.getgxTv_SdtUsuario_Usuarioid() ;
      Z5UsuarioId = obj5.getgxTv_SdtUsuario_Usuarioid_Z() ;
      Z114UsuarioEmail = obj5.getgxTv_SdtUsuario_Usuarioemail_Z() ;
      Z115UsuarioUsuarioWeb = obj5.getgxTv_SdtUsuario_Usuariousuarioweb_Z() ;
      Z116UsuarioNombre = obj5.getgxTv_SdtUsuario_Usuarionombre_Z() ;
      Z117UsuarioDicose = obj5.getgxTv_SdtUsuario_Usuariodicose_Z() ;
      Z118UsuarioRazonSocial = obj5.getgxTv_SdtUsuario_Usuariorazonsocial_Z() ;
      Z119UsuarioRut = obj5.getgxTv_SdtUsuario_Usuariorut_Z() ;
      Z120UsuarioIdNet = obj5.getgxTv_SdtUsuario_Usuarioidnet_Z() ;
      Z121UsuarioDireccion = obj5.getgxTv_SdtUsuario_Usuariodireccion_Z() ;
      Z122UsuarioTipousuario = obj5.getgxTv_SdtUsuario_Usuariotipousuario_Z() ;
      Z123UsuarioIdTecnico1 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico1_Z() ;
      Z124UsuarioIdTecnico2 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico2_Z() ;
      Z125UsuarioIdTecnico3 = obj5.getgxTv_SdtUsuario_Usuarioidtecnico3_Z() ;
      Z126UsuarioDireccionFrasco = obj5.getgxTv_SdtUsuario_Usuariodireccionfrasco_Z() ;
      Z127UsuarioAgenciaFrasco = obj5.getgxTv_SdtUsuario_Usuarioagenciafrasco_Z() ;
      Z128UsuarioNotificacionFrasco1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco1_Z() ;
      Z129UsuarioNotificacionFrasco2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco2_Z() ;
      Z130UsuarioNotificacionSolicitud1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_Z() ;
      Z131UsuarioNotificacionSolicitud2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_Z() ;
      Z132UsuarioNotificacionResultado1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado1_Z() ;
      Z133UsuarioNotificacionResultado2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado2_Z() ;
      Z134UsuarioNotificacionAvisos1 = obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos1_Z() ;
      Z135UsuarioNotificacionAvisos2 = obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos2_Z() ;
      Z136UsuarioTecnicoCelular1 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelular1_Z() ;
      Z137UsuarioTecnicoCelular2 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelular2_Z() ;
      Z138UsuarioTecnicoCelularNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_Z() ;
      Z139UsuarioTecnicoCelularNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_Z() ;
      Z140UsuarioTecnicoTelefono1 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono1_Z() ;
      Z141UsuarioTecnicoTelefono2 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono2_Z() ;
      Z142UsuarioTecnicoTelefonoNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_Z() ;
      Z143UsuarioTecnicoTelefonoNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_Z() ;
      Z144UsuarioTecnicoEmail1 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemail1_Z() ;
      Z145UsuarioTecnicoEmail2 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemail2_Z() ;
      Z146UsuarioTecnicoEmailNombre1 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_Z() ;
      Z147UsuarioTecnicoEmailNombre2 = obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_Z() ;
      Z148UsuarioRutTipo = obj5.getgxTv_SdtUsuario_Usuarioruttipo_Z() ;
      Z149UsuarioFacDireccion = obj5.getgxTv_SdtUsuario_Usuariofacdireccion_Z() ;
      Z150UsuarioFacLocalidad = obj5.getgxTv_SdtUsuario_Usuariofaclocalidad_Z() ;
      Z151UsuarioFacDepartamento = obj5.getgxTv_SdtUsuario_Usuariofacdepartamento_Z() ;
      Z152UsuarioFacEmailEnvio = obj5.getgxTv_SdtUsuario_Usuariofacemailenvio_Z() ;
      Z153UsuarioCobranzaCelular1 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelular1_Z() ;
      Z154UsuarioCobranzaCelular2 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelular2_Z() ;
      Z155UsuarioCobranzaCelularNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_Z() ;
      Z156UsuarioCobranzaCelularNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_Z() ;
      Z157UsuarioCobranzaTelefono1 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono1_Z() ;
      Z158UsuarioCobranzaTelefono2 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono2_Z() ;
      Z159UsuarioCobranzaTelefonoNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_Z() ;
      Z160UsuarioCobranzaTelefonoNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_Z() ;
      Z161UsuarioCobranzaEmail1 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemail1_Z() ;
      Z162UsuarioCobranzaEmail2 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemail2_Z() ;
      Z163UsuarioCobranzaEmailNombre1 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_Z() ;
      Z164UsuarioCobranzaEmailNombre2 = obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_Z() ;
      Z165UsuarioCedula = obj5.getgxTv_SdtUsuario_Usuariocedula_Z() ;
      n114UsuarioEmail = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioemail_N()==0)?false:true) ;
      n115UsuarioUsuarioWeb = (boolean)((obj5.getgxTv_SdtUsuario_Usuariousuarioweb_N()==0)?false:true) ;
      n116UsuarioNombre = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionombre_N()==0)?false:true) ;
      n117UsuarioDicose = (boolean)((obj5.getgxTv_SdtUsuario_Usuariodicose_N()==0)?false:true) ;
      n118UsuarioRazonSocial = (boolean)((obj5.getgxTv_SdtUsuario_Usuariorazonsocial_N()==0)?false:true) ;
      n119UsuarioRut = (boolean)((obj5.getgxTv_SdtUsuario_Usuariorut_N()==0)?false:true) ;
      n120UsuarioIdNet = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioidnet_N()==0)?false:true) ;
      n121UsuarioDireccion = (boolean)((obj5.getgxTv_SdtUsuario_Usuariodireccion_N()==0)?false:true) ;
      n122UsuarioTipousuario = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotipousuario_N()==0)?false:true) ;
      n123UsuarioIdTecnico1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioidtecnico1_N()==0)?false:true) ;
      n124UsuarioIdTecnico2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioidtecnico2_N()==0)?false:true) ;
      n125UsuarioIdTecnico3 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioidtecnico3_N()==0)?false:true) ;
      n126UsuarioDireccionFrasco = (boolean)((obj5.getgxTv_SdtUsuario_Usuariodireccionfrasco_N()==0)?false:true) ;
      n127UsuarioAgenciaFrasco = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioagenciafrasco_N()==0)?false:true) ;
      n128UsuarioNotificacionFrasco1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco1_N()==0)?false:true) ;
      n129UsuarioNotificacionFrasco2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionfrasco2_N()==0)?false:true) ;
      n130UsuarioNotificacionSolicitud1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud1_N()==0)?false:true) ;
      n131UsuarioNotificacionSolicitud2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionsolicitud2_N()==0)?false:true) ;
      n132UsuarioNotificacionResultado1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado1_N()==0)?false:true) ;
      n133UsuarioNotificacionResultado2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionresultado2_N()==0)?false:true) ;
      n134UsuarioNotificacionAvisos1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos1_N()==0)?false:true) ;
      n135UsuarioNotificacionAvisos2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuarionotificacionavisos2_N()==0)?false:true) ;
      n136UsuarioTecnicoCelular1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicocelular1_N()==0)?false:true) ;
      n137UsuarioTecnicoCelular2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicocelular2_N()==0)?false:true) ;
      n138UsuarioTecnicoCelularNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre1_N()==0)?false:true) ;
      n139UsuarioTecnicoCelularNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicocelularnombre2_N()==0)?false:true) ;
      n140UsuarioTecnicoTelefono1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono1_N()==0)?false:true) ;
      n141UsuarioTecnicoTelefono2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicotelefono2_N()==0)?false:true) ;
      n142UsuarioTecnicoTelefonoNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre1_N()==0)?false:true) ;
      n143UsuarioTecnicoTelefonoNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicotelefononombre2_N()==0)?false:true) ;
      n144UsuarioTecnicoEmail1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicoemail1_N()==0)?false:true) ;
      n145UsuarioTecnicoEmail2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicoemail2_N()==0)?false:true) ;
      n146UsuarioTecnicoEmailNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre1_N()==0)?false:true) ;
      n147UsuarioTecnicoEmailNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariotecnicoemailnombre2_N()==0)?false:true) ;
      n148UsuarioRutTipo = (boolean)((obj5.getgxTv_SdtUsuario_Usuarioruttipo_N()==0)?false:true) ;
      n149UsuarioFacDireccion = (boolean)((obj5.getgxTv_SdtUsuario_Usuariofacdireccion_N()==0)?false:true) ;
      n150UsuarioFacLocalidad = (boolean)((obj5.getgxTv_SdtUsuario_Usuariofaclocalidad_N()==0)?false:true) ;
      n151UsuarioFacDepartamento = (boolean)((obj5.getgxTv_SdtUsuario_Usuariofacdepartamento_N()==0)?false:true) ;
      n152UsuarioFacEmailEnvio = (boolean)((obj5.getgxTv_SdtUsuario_Usuariofacemailenvio_N()==0)?false:true) ;
      n153UsuarioCobranzaCelular1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzacelular1_N()==0)?false:true) ;
      n154UsuarioCobranzaCelular2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzacelular2_N()==0)?false:true) ;
      n155UsuarioCobranzaCelularNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre1_N()==0)?false:true) ;
      n156UsuarioCobranzaCelularNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzacelularnombre2_N()==0)?false:true) ;
      n157UsuarioCobranzaTelefono1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono1_N()==0)?false:true) ;
      n158UsuarioCobranzaTelefono2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzatelefono2_N()==0)?false:true) ;
      n159UsuarioCobranzaTelefonoNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre1_N()==0)?false:true) ;
      n160UsuarioCobranzaTelefonoNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzatelefononombre2_N()==0)?false:true) ;
      n161UsuarioCobranzaEmail1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzaemail1_N()==0)?false:true) ;
      n162UsuarioCobranzaEmail2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzaemail2_N()==0)?false:true) ;
      n163UsuarioCobranzaEmailNombre1 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre1_N()==0)?false:true) ;
      n164UsuarioCobranzaEmailNombre2 = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocobranzaemailnombre2_N()==0)?false:true) ;
      n165UsuarioCedula = (boolean)((obj5.getgxTv_SdtUsuario_Usuariocedula_N()==0)?false:true) ;
      Gx_mode = obj5.getgxTv_SdtUsuario_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A5UsuarioId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey055( ) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z5UsuarioId = A5UsuarioId ;
      }
      zm055( -1) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars5( bcUsuario, 0) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z5UsuarioId = A5UsuarioId ;
      }
      zm055( -1) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert055( ) ;
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A5UsuarioId != Z5UsuarioId )
            {
               A5UsuarioId = Z5UsuarioId ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update055( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( A5UsuarioId != Z5UsuarioId )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert055( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert055( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars5( bcUsuario, 1) ;
      saveImpl( ) ;
      VarsToRow5( bcUsuario) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars5( bcUsuario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
      afterTrn( ) ;
      VarsToRow5( bcUsuario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         com.colaveco.SdtUsuario auxBC = new com.colaveco.SdtUsuario( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A5UsuarioId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcUsuario);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars5( bcUsuario, 1) ;
      updateImpl( ) ;
      VarsToRow5( bcUsuario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars5( bcUsuario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow5( bcUsuario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars5( bcUsuario, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey055( ) ;
      if ( RcdFound5 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A5UsuarioId != Z5UsuarioId )
         {
            A5UsuarioId = Z5UsuarioId ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( A5UsuarioId != Z5UsuarioId )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "usuario_bc");
      VarsToRow5( bcUsuario) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcUsuario.getgxTv_SdtUsuario_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcUsuario.setgxTv_SdtUsuario_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtUsuario sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcUsuario )
      {
         bcUsuario = sdt ;
         if ( GXutil.strcmp(bcUsuario.getgxTv_SdtUsuario_Mode(), "") == 0 )
         {
            bcUsuario.setgxTv_SdtUsuario_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow5( bcUsuario) ;
         }
         else
         {
            RowToVars5( bcUsuario, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcUsuario.getgxTv_SdtUsuario_Mode(), "") == 0 )
         {
            bcUsuario.setgxTv_SdtUsuario_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars5( bcUsuario, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtUsuario getUsuario_BC( )
   {
      return bcUsuario ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      BC00054_A5UsuarioId = new long[1] ;
      BC00054_A114UsuarioEmail = new String[] {""} ;
      BC00054_n114UsuarioEmail = new boolean[] {false} ;
      BC00054_A115UsuarioUsuarioWeb = new String[] {""} ;
      BC00054_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      BC00054_A116UsuarioNombre = new String[] {""} ;
      BC00054_n116UsuarioNombre = new boolean[] {false} ;
      BC00054_A117UsuarioDicose = new String[] {""} ;
      BC00054_n117UsuarioDicose = new boolean[] {false} ;
      BC00054_A118UsuarioRazonSocial = new String[] {""} ;
      BC00054_n118UsuarioRazonSocial = new boolean[] {false} ;
      BC00054_A119UsuarioRut = new String[] {""} ;
      BC00054_n119UsuarioRut = new boolean[] {false} ;
      BC00054_A120UsuarioIdNet = new long[1] ;
      BC00054_n120UsuarioIdNet = new boolean[] {false} ;
      BC00054_A121UsuarioDireccion = new String[] {""} ;
      BC00054_n121UsuarioDireccion = new boolean[] {false} ;
      BC00054_A122UsuarioTipousuario = new short[1] ;
      BC00054_n122UsuarioTipousuario = new boolean[] {false} ;
      BC00054_A123UsuarioIdTecnico1 = new long[1] ;
      BC00054_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      BC00054_A124UsuarioIdTecnico2 = new long[1] ;
      BC00054_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      BC00054_A125UsuarioIdTecnico3 = new long[1] ;
      BC00054_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      BC00054_A126UsuarioDireccionFrasco = new String[] {""} ;
      BC00054_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      BC00054_A127UsuarioAgenciaFrasco = new short[1] ;
      BC00054_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      BC00054_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      BC00054_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      BC00054_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      BC00054_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      BC00054_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      BC00054_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      BC00054_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      BC00054_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      BC00054_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      BC00054_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      BC00054_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      BC00054_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      BC00054_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      BC00054_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      BC00054_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      BC00054_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      BC00054_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      BC00054_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      BC00054_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      BC00054_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      BC00054_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      BC00054_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      BC00054_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      BC00054_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      BC00054_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      BC00054_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      BC00054_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      BC00054_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      BC00054_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      BC00054_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      BC00054_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      BC00054_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      BC00054_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      BC00054_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      BC00054_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      BC00054_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      BC00054_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      BC00054_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      BC00054_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      BC00054_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      BC00054_A148UsuarioRutTipo = new String[] {""} ;
      BC00054_n148UsuarioRutTipo = new boolean[] {false} ;
      BC00054_A149UsuarioFacDireccion = new String[] {""} ;
      BC00054_n149UsuarioFacDireccion = new boolean[] {false} ;
      BC00054_A150UsuarioFacLocalidad = new String[] {""} ;
      BC00054_n150UsuarioFacLocalidad = new boolean[] {false} ;
      BC00054_A151UsuarioFacDepartamento = new String[] {""} ;
      BC00054_n151UsuarioFacDepartamento = new boolean[] {false} ;
      BC00054_A152UsuarioFacEmailEnvio = new String[] {""} ;
      BC00054_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      BC00054_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      BC00054_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      BC00054_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      BC00054_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      BC00054_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      BC00054_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      BC00054_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      BC00054_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      BC00054_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      BC00054_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      BC00054_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      BC00054_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      BC00054_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      BC00054_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      BC00054_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      BC00054_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      BC00054_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      BC00054_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      BC00054_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      BC00054_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      BC00054_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      BC00054_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      BC00054_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      BC00054_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      BC00054_A165UsuarioCedula = new String[] {""} ;
      BC00054_n165UsuarioCedula = new boolean[] {false} ;
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
      gx_restcollection = new GXBCCollection<com.colaveco.SdtUsuario>(com.colaveco.SdtUsuario.class, "Usuario", "Colaveco", remoteHandle);
      sMode5 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z114UsuarioEmail = "" ;
      Z115UsuarioUsuarioWeb = "" ;
      Z116UsuarioNombre = "" ;
      Z117UsuarioDicose = "" ;
      Z118UsuarioRazonSocial = "" ;
      Z119UsuarioRut = "" ;
      Z121UsuarioDireccion = "" ;
      Z126UsuarioDireccionFrasco = "" ;
      Z128UsuarioNotificacionFrasco1 = "" ;
      Z129UsuarioNotificacionFrasco2 = "" ;
      Z130UsuarioNotificacionSolicitud1 = "" ;
      Z131UsuarioNotificacionSolicitud2 = "" ;
      Z132UsuarioNotificacionResultado1 = "" ;
      Z133UsuarioNotificacionResultado2 = "" ;
      Z134UsuarioNotificacionAvisos1 = "" ;
      Z135UsuarioNotificacionAvisos2 = "" ;
      Z136UsuarioTecnicoCelular1 = "" ;
      Z137UsuarioTecnicoCelular2 = "" ;
      Z138UsuarioTecnicoCelularNombre1 = "" ;
      Z139UsuarioTecnicoCelularNombre2 = "" ;
      Z140UsuarioTecnicoTelefono1 = "" ;
      Z141UsuarioTecnicoTelefono2 = "" ;
      Z142UsuarioTecnicoTelefonoNombre1 = "" ;
      Z143UsuarioTecnicoTelefonoNombre2 = "" ;
      Z144UsuarioTecnicoEmail1 = "" ;
      Z145UsuarioTecnicoEmail2 = "" ;
      Z146UsuarioTecnicoEmailNombre1 = "" ;
      Z147UsuarioTecnicoEmailNombre2 = "" ;
      Z148UsuarioRutTipo = "" ;
      Z149UsuarioFacDireccion = "" ;
      Z150UsuarioFacLocalidad = "" ;
      Z151UsuarioFacDepartamento = "" ;
      Z152UsuarioFacEmailEnvio = "" ;
      Z153UsuarioCobranzaCelular1 = "" ;
      Z154UsuarioCobranzaCelular2 = "" ;
      Z155UsuarioCobranzaCelularNombre1 = "" ;
      Z156UsuarioCobranzaCelularNombre2 = "" ;
      Z157UsuarioCobranzaTelefono1 = "" ;
      Z158UsuarioCobranzaTelefono2 = "" ;
      Z159UsuarioCobranzaTelefonoNombre1 = "" ;
      Z160UsuarioCobranzaTelefonoNombre2 = "" ;
      Z161UsuarioCobranzaEmail1 = "" ;
      Z162UsuarioCobranzaEmail2 = "" ;
      Z163UsuarioCobranzaEmailNombre1 = "" ;
      Z164UsuarioCobranzaEmailNombre2 = "" ;
      Z165UsuarioCedula = "" ;
      BC00055_A5UsuarioId = new long[1] ;
      BC00055_A114UsuarioEmail = new String[] {""} ;
      BC00055_n114UsuarioEmail = new boolean[] {false} ;
      BC00055_A115UsuarioUsuarioWeb = new String[] {""} ;
      BC00055_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      BC00055_A116UsuarioNombre = new String[] {""} ;
      BC00055_n116UsuarioNombre = new boolean[] {false} ;
      BC00055_A117UsuarioDicose = new String[] {""} ;
      BC00055_n117UsuarioDicose = new boolean[] {false} ;
      BC00055_A118UsuarioRazonSocial = new String[] {""} ;
      BC00055_n118UsuarioRazonSocial = new boolean[] {false} ;
      BC00055_A119UsuarioRut = new String[] {""} ;
      BC00055_n119UsuarioRut = new boolean[] {false} ;
      BC00055_A120UsuarioIdNet = new long[1] ;
      BC00055_n120UsuarioIdNet = new boolean[] {false} ;
      BC00055_A121UsuarioDireccion = new String[] {""} ;
      BC00055_n121UsuarioDireccion = new boolean[] {false} ;
      BC00055_A122UsuarioTipousuario = new short[1] ;
      BC00055_n122UsuarioTipousuario = new boolean[] {false} ;
      BC00055_A123UsuarioIdTecnico1 = new long[1] ;
      BC00055_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      BC00055_A124UsuarioIdTecnico2 = new long[1] ;
      BC00055_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      BC00055_A125UsuarioIdTecnico3 = new long[1] ;
      BC00055_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      BC00055_A126UsuarioDireccionFrasco = new String[] {""} ;
      BC00055_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      BC00055_A127UsuarioAgenciaFrasco = new short[1] ;
      BC00055_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      BC00055_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      BC00055_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      BC00055_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      BC00055_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      BC00055_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      BC00055_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      BC00055_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      BC00055_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      BC00055_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      BC00055_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      BC00055_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      BC00055_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      BC00055_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      BC00055_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      BC00055_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      BC00055_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      BC00055_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      BC00055_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      BC00055_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      BC00055_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      BC00055_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      BC00055_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      BC00055_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      BC00055_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      BC00055_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      BC00055_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      BC00055_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      BC00055_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      BC00055_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      BC00055_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      BC00055_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      BC00055_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      BC00055_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      BC00055_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      BC00055_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      BC00055_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      BC00055_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      BC00055_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      BC00055_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      BC00055_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      BC00055_A148UsuarioRutTipo = new String[] {""} ;
      BC00055_n148UsuarioRutTipo = new boolean[] {false} ;
      BC00055_A149UsuarioFacDireccion = new String[] {""} ;
      BC00055_n149UsuarioFacDireccion = new boolean[] {false} ;
      BC00055_A150UsuarioFacLocalidad = new String[] {""} ;
      BC00055_n150UsuarioFacLocalidad = new boolean[] {false} ;
      BC00055_A151UsuarioFacDepartamento = new String[] {""} ;
      BC00055_n151UsuarioFacDepartamento = new boolean[] {false} ;
      BC00055_A152UsuarioFacEmailEnvio = new String[] {""} ;
      BC00055_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      BC00055_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      BC00055_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      BC00055_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      BC00055_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      BC00055_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      BC00055_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      BC00055_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      BC00055_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      BC00055_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      BC00055_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      BC00055_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      BC00055_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      BC00055_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      BC00055_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      BC00055_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      BC00055_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      BC00055_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      BC00055_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      BC00055_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      BC00055_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      BC00055_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      BC00055_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      BC00055_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      BC00055_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      BC00055_A165UsuarioCedula = new String[] {""} ;
      BC00055_n165UsuarioCedula = new boolean[] {false} ;
      BC00056_A5UsuarioId = new long[1] ;
      BC00057_A5UsuarioId = new long[1] ;
      BC00057_A114UsuarioEmail = new String[] {""} ;
      BC00057_n114UsuarioEmail = new boolean[] {false} ;
      BC00057_A115UsuarioUsuarioWeb = new String[] {""} ;
      BC00057_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      BC00057_A116UsuarioNombre = new String[] {""} ;
      BC00057_n116UsuarioNombre = new boolean[] {false} ;
      BC00057_A117UsuarioDicose = new String[] {""} ;
      BC00057_n117UsuarioDicose = new boolean[] {false} ;
      BC00057_A118UsuarioRazonSocial = new String[] {""} ;
      BC00057_n118UsuarioRazonSocial = new boolean[] {false} ;
      BC00057_A119UsuarioRut = new String[] {""} ;
      BC00057_n119UsuarioRut = new boolean[] {false} ;
      BC00057_A120UsuarioIdNet = new long[1] ;
      BC00057_n120UsuarioIdNet = new boolean[] {false} ;
      BC00057_A121UsuarioDireccion = new String[] {""} ;
      BC00057_n121UsuarioDireccion = new boolean[] {false} ;
      BC00057_A122UsuarioTipousuario = new short[1] ;
      BC00057_n122UsuarioTipousuario = new boolean[] {false} ;
      BC00057_A123UsuarioIdTecnico1 = new long[1] ;
      BC00057_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      BC00057_A124UsuarioIdTecnico2 = new long[1] ;
      BC00057_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      BC00057_A125UsuarioIdTecnico3 = new long[1] ;
      BC00057_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      BC00057_A126UsuarioDireccionFrasco = new String[] {""} ;
      BC00057_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      BC00057_A127UsuarioAgenciaFrasco = new short[1] ;
      BC00057_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      BC00057_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      BC00057_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      BC00057_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      BC00057_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      BC00057_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      BC00057_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      BC00057_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      BC00057_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      BC00057_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      BC00057_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      BC00057_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      BC00057_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      BC00057_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      BC00057_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      BC00057_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      BC00057_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      BC00057_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      BC00057_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      BC00057_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      BC00057_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      BC00057_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      BC00057_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      BC00057_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      BC00057_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      BC00057_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      BC00057_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      BC00057_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      BC00057_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      BC00057_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      BC00057_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      BC00057_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      BC00057_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      BC00057_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      BC00057_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      BC00057_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      BC00057_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      BC00057_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      BC00057_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      BC00057_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      BC00057_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      BC00057_A148UsuarioRutTipo = new String[] {""} ;
      BC00057_n148UsuarioRutTipo = new boolean[] {false} ;
      BC00057_A149UsuarioFacDireccion = new String[] {""} ;
      BC00057_n149UsuarioFacDireccion = new boolean[] {false} ;
      BC00057_A150UsuarioFacLocalidad = new String[] {""} ;
      BC00057_n150UsuarioFacLocalidad = new boolean[] {false} ;
      BC00057_A151UsuarioFacDepartamento = new String[] {""} ;
      BC00057_n151UsuarioFacDepartamento = new boolean[] {false} ;
      BC00057_A152UsuarioFacEmailEnvio = new String[] {""} ;
      BC00057_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      BC00057_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      BC00057_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      BC00057_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      BC00057_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      BC00057_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      BC00057_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      BC00057_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      BC00057_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      BC00057_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      BC00057_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      BC00057_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      BC00057_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      BC00057_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      BC00057_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      BC00057_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      BC00057_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      BC00057_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      BC00057_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      BC00057_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      BC00057_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      BC00057_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      BC00057_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      BC00057_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      BC00057_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      BC00057_A165UsuarioCedula = new String[] {""} ;
      BC00057_n165UsuarioCedula = new boolean[] {false} ;
      BC00058_A5UsuarioId = new long[1] ;
      BC00058_A114UsuarioEmail = new String[] {""} ;
      BC00058_n114UsuarioEmail = new boolean[] {false} ;
      BC00058_A115UsuarioUsuarioWeb = new String[] {""} ;
      BC00058_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      BC00058_A116UsuarioNombre = new String[] {""} ;
      BC00058_n116UsuarioNombre = new boolean[] {false} ;
      BC00058_A117UsuarioDicose = new String[] {""} ;
      BC00058_n117UsuarioDicose = new boolean[] {false} ;
      BC00058_A118UsuarioRazonSocial = new String[] {""} ;
      BC00058_n118UsuarioRazonSocial = new boolean[] {false} ;
      BC00058_A119UsuarioRut = new String[] {""} ;
      BC00058_n119UsuarioRut = new boolean[] {false} ;
      BC00058_A120UsuarioIdNet = new long[1] ;
      BC00058_n120UsuarioIdNet = new boolean[] {false} ;
      BC00058_A121UsuarioDireccion = new String[] {""} ;
      BC00058_n121UsuarioDireccion = new boolean[] {false} ;
      BC00058_A122UsuarioTipousuario = new short[1] ;
      BC00058_n122UsuarioTipousuario = new boolean[] {false} ;
      BC00058_A123UsuarioIdTecnico1 = new long[1] ;
      BC00058_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      BC00058_A124UsuarioIdTecnico2 = new long[1] ;
      BC00058_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      BC00058_A125UsuarioIdTecnico3 = new long[1] ;
      BC00058_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      BC00058_A126UsuarioDireccionFrasco = new String[] {""} ;
      BC00058_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      BC00058_A127UsuarioAgenciaFrasco = new short[1] ;
      BC00058_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      BC00058_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      BC00058_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      BC00058_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      BC00058_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      BC00058_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      BC00058_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      BC00058_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      BC00058_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      BC00058_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      BC00058_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      BC00058_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      BC00058_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      BC00058_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      BC00058_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      BC00058_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      BC00058_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      BC00058_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      BC00058_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      BC00058_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      BC00058_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      BC00058_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      BC00058_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      BC00058_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      BC00058_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      BC00058_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      BC00058_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      BC00058_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      BC00058_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      BC00058_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      BC00058_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      BC00058_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      BC00058_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      BC00058_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      BC00058_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      BC00058_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      BC00058_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      BC00058_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      BC00058_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      BC00058_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      BC00058_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      BC00058_A148UsuarioRutTipo = new String[] {""} ;
      BC00058_n148UsuarioRutTipo = new boolean[] {false} ;
      BC00058_A149UsuarioFacDireccion = new String[] {""} ;
      BC00058_n149UsuarioFacDireccion = new boolean[] {false} ;
      BC00058_A150UsuarioFacLocalidad = new String[] {""} ;
      BC00058_n150UsuarioFacLocalidad = new boolean[] {false} ;
      BC00058_A151UsuarioFacDepartamento = new String[] {""} ;
      BC00058_n151UsuarioFacDepartamento = new boolean[] {false} ;
      BC00058_A152UsuarioFacEmailEnvio = new String[] {""} ;
      BC00058_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      BC00058_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      BC00058_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      BC00058_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      BC00058_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      BC00058_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      BC00058_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      BC00058_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      BC00058_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      BC00058_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      BC00058_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      BC00058_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      BC00058_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      BC00058_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      BC00058_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      BC00058_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      BC00058_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      BC00058_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      BC00058_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      BC00058_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      BC00058_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      BC00058_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      BC00058_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      BC00058_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      BC00058_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      BC00058_A165UsuarioCedula = new String[] {""} ;
      BC00058_n165UsuarioCedula = new boolean[] {false} ;
      BC000512_A5UsuarioId = new long[1] ;
      BC000512_A114UsuarioEmail = new String[] {""} ;
      BC000512_n114UsuarioEmail = new boolean[] {false} ;
      BC000512_A115UsuarioUsuarioWeb = new String[] {""} ;
      BC000512_n115UsuarioUsuarioWeb = new boolean[] {false} ;
      BC000512_A116UsuarioNombre = new String[] {""} ;
      BC000512_n116UsuarioNombre = new boolean[] {false} ;
      BC000512_A117UsuarioDicose = new String[] {""} ;
      BC000512_n117UsuarioDicose = new boolean[] {false} ;
      BC000512_A118UsuarioRazonSocial = new String[] {""} ;
      BC000512_n118UsuarioRazonSocial = new boolean[] {false} ;
      BC000512_A119UsuarioRut = new String[] {""} ;
      BC000512_n119UsuarioRut = new boolean[] {false} ;
      BC000512_A120UsuarioIdNet = new long[1] ;
      BC000512_n120UsuarioIdNet = new boolean[] {false} ;
      BC000512_A121UsuarioDireccion = new String[] {""} ;
      BC000512_n121UsuarioDireccion = new boolean[] {false} ;
      BC000512_A122UsuarioTipousuario = new short[1] ;
      BC000512_n122UsuarioTipousuario = new boolean[] {false} ;
      BC000512_A123UsuarioIdTecnico1 = new long[1] ;
      BC000512_n123UsuarioIdTecnico1 = new boolean[] {false} ;
      BC000512_A124UsuarioIdTecnico2 = new long[1] ;
      BC000512_n124UsuarioIdTecnico2 = new boolean[] {false} ;
      BC000512_A125UsuarioIdTecnico3 = new long[1] ;
      BC000512_n125UsuarioIdTecnico3 = new boolean[] {false} ;
      BC000512_A126UsuarioDireccionFrasco = new String[] {""} ;
      BC000512_n126UsuarioDireccionFrasco = new boolean[] {false} ;
      BC000512_A127UsuarioAgenciaFrasco = new short[1] ;
      BC000512_n127UsuarioAgenciaFrasco = new boolean[] {false} ;
      BC000512_A128UsuarioNotificacionFrasco1 = new String[] {""} ;
      BC000512_n128UsuarioNotificacionFrasco1 = new boolean[] {false} ;
      BC000512_A129UsuarioNotificacionFrasco2 = new String[] {""} ;
      BC000512_n129UsuarioNotificacionFrasco2 = new boolean[] {false} ;
      BC000512_A130UsuarioNotificacionSolicitud1 = new String[] {""} ;
      BC000512_n130UsuarioNotificacionSolicitud1 = new boolean[] {false} ;
      BC000512_A131UsuarioNotificacionSolicitud2 = new String[] {""} ;
      BC000512_n131UsuarioNotificacionSolicitud2 = new boolean[] {false} ;
      BC000512_A132UsuarioNotificacionResultado1 = new String[] {""} ;
      BC000512_n132UsuarioNotificacionResultado1 = new boolean[] {false} ;
      BC000512_A133UsuarioNotificacionResultado2 = new String[] {""} ;
      BC000512_n133UsuarioNotificacionResultado2 = new boolean[] {false} ;
      BC000512_A134UsuarioNotificacionAvisos1 = new String[] {""} ;
      BC000512_n134UsuarioNotificacionAvisos1 = new boolean[] {false} ;
      BC000512_A135UsuarioNotificacionAvisos2 = new String[] {""} ;
      BC000512_n135UsuarioNotificacionAvisos2 = new boolean[] {false} ;
      BC000512_A136UsuarioTecnicoCelular1 = new String[] {""} ;
      BC000512_n136UsuarioTecnicoCelular1 = new boolean[] {false} ;
      BC000512_A137UsuarioTecnicoCelular2 = new String[] {""} ;
      BC000512_n137UsuarioTecnicoCelular2 = new boolean[] {false} ;
      BC000512_A138UsuarioTecnicoCelularNombre1 = new String[] {""} ;
      BC000512_n138UsuarioTecnicoCelularNombre1 = new boolean[] {false} ;
      BC000512_A139UsuarioTecnicoCelularNombre2 = new String[] {""} ;
      BC000512_n139UsuarioTecnicoCelularNombre2 = new boolean[] {false} ;
      BC000512_A140UsuarioTecnicoTelefono1 = new String[] {""} ;
      BC000512_n140UsuarioTecnicoTelefono1 = new boolean[] {false} ;
      BC000512_A141UsuarioTecnicoTelefono2 = new String[] {""} ;
      BC000512_n141UsuarioTecnicoTelefono2 = new boolean[] {false} ;
      BC000512_A142UsuarioTecnicoTelefonoNombre1 = new String[] {""} ;
      BC000512_n142UsuarioTecnicoTelefonoNombre1 = new boolean[] {false} ;
      BC000512_A143UsuarioTecnicoTelefonoNombre2 = new String[] {""} ;
      BC000512_n143UsuarioTecnicoTelefonoNombre2 = new boolean[] {false} ;
      BC000512_A144UsuarioTecnicoEmail1 = new String[] {""} ;
      BC000512_n144UsuarioTecnicoEmail1 = new boolean[] {false} ;
      BC000512_A145UsuarioTecnicoEmail2 = new String[] {""} ;
      BC000512_n145UsuarioTecnicoEmail2 = new boolean[] {false} ;
      BC000512_A146UsuarioTecnicoEmailNombre1 = new String[] {""} ;
      BC000512_n146UsuarioTecnicoEmailNombre1 = new boolean[] {false} ;
      BC000512_A147UsuarioTecnicoEmailNombre2 = new String[] {""} ;
      BC000512_n147UsuarioTecnicoEmailNombre2 = new boolean[] {false} ;
      BC000512_A148UsuarioRutTipo = new String[] {""} ;
      BC000512_n148UsuarioRutTipo = new boolean[] {false} ;
      BC000512_A149UsuarioFacDireccion = new String[] {""} ;
      BC000512_n149UsuarioFacDireccion = new boolean[] {false} ;
      BC000512_A150UsuarioFacLocalidad = new String[] {""} ;
      BC000512_n150UsuarioFacLocalidad = new boolean[] {false} ;
      BC000512_A151UsuarioFacDepartamento = new String[] {""} ;
      BC000512_n151UsuarioFacDepartamento = new boolean[] {false} ;
      BC000512_A152UsuarioFacEmailEnvio = new String[] {""} ;
      BC000512_n152UsuarioFacEmailEnvio = new boolean[] {false} ;
      BC000512_A153UsuarioCobranzaCelular1 = new String[] {""} ;
      BC000512_n153UsuarioCobranzaCelular1 = new boolean[] {false} ;
      BC000512_A154UsuarioCobranzaCelular2 = new String[] {""} ;
      BC000512_n154UsuarioCobranzaCelular2 = new boolean[] {false} ;
      BC000512_A155UsuarioCobranzaCelularNombre1 = new String[] {""} ;
      BC000512_n155UsuarioCobranzaCelularNombre1 = new boolean[] {false} ;
      BC000512_A156UsuarioCobranzaCelularNombre2 = new String[] {""} ;
      BC000512_n156UsuarioCobranzaCelularNombre2 = new boolean[] {false} ;
      BC000512_A157UsuarioCobranzaTelefono1 = new String[] {""} ;
      BC000512_n157UsuarioCobranzaTelefono1 = new boolean[] {false} ;
      BC000512_A158UsuarioCobranzaTelefono2 = new String[] {""} ;
      BC000512_n158UsuarioCobranzaTelefono2 = new boolean[] {false} ;
      BC000512_A159UsuarioCobranzaTelefonoNombre1 = new String[] {""} ;
      BC000512_n159UsuarioCobranzaTelefonoNombre1 = new boolean[] {false} ;
      BC000512_A160UsuarioCobranzaTelefonoNombre2 = new String[] {""} ;
      BC000512_n160UsuarioCobranzaTelefonoNombre2 = new boolean[] {false} ;
      BC000512_A161UsuarioCobranzaEmail1 = new String[] {""} ;
      BC000512_n161UsuarioCobranzaEmail1 = new boolean[] {false} ;
      BC000512_A162UsuarioCobranzaEmail2 = new String[] {""} ;
      BC000512_n162UsuarioCobranzaEmail2 = new boolean[] {false} ;
      BC000512_A163UsuarioCobranzaEmailNombre1 = new String[] {""} ;
      BC000512_n163UsuarioCobranzaEmailNombre1 = new boolean[] {false} ;
      BC000512_A164UsuarioCobranzaEmailNombre2 = new String[] {""} ;
      BC000512_n164UsuarioCobranzaEmailNombre2 = new boolean[] {false} ;
      BC000512_A165UsuarioCedula = new String[] {""} ;
      BC000512_n165UsuarioCedula = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuario_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.usuario_bc__default(),
         new Object[] {
             new Object[] {
            BC00052_A5UsuarioId, BC00052_A114UsuarioEmail, BC00052_n114UsuarioEmail, BC00052_A115UsuarioUsuarioWeb, BC00052_n115UsuarioUsuarioWeb, BC00052_A116UsuarioNombre, BC00052_n116UsuarioNombre, BC00052_A117UsuarioDicose, BC00052_n117UsuarioDicose, BC00052_A118UsuarioRazonSocial,
            BC00052_n118UsuarioRazonSocial, BC00052_A119UsuarioRut, BC00052_n119UsuarioRut, BC00052_A120UsuarioIdNet, BC00052_n120UsuarioIdNet, BC00052_A121UsuarioDireccion, BC00052_n121UsuarioDireccion, BC00052_A122UsuarioTipousuario, BC00052_n122UsuarioTipousuario, BC00052_A123UsuarioIdTecnico1,
            BC00052_n123UsuarioIdTecnico1, BC00052_A124UsuarioIdTecnico2, BC00052_n124UsuarioIdTecnico2, BC00052_A125UsuarioIdTecnico3, BC00052_n125UsuarioIdTecnico3, BC00052_A126UsuarioDireccionFrasco, BC00052_n126UsuarioDireccionFrasco, BC00052_A127UsuarioAgenciaFrasco, BC00052_n127UsuarioAgenciaFrasco, BC00052_A128UsuarioNotificacionFrasco1,
            BC00052_n128UsuarioNotificacionFrasco1, BC00052_A129UsuarioNotificacionFrasco2, BC00052_n129UsuarioNotificacionFrasco2, BC00052_A130UsuarioNotificacionSolicitud1, BC00052_n130UsuarioNotificacionSolicitud1, BC00052_A131UsuarioNotificacionSolicitud2, BC00052_n131UsuarioNotificacionSolicitud2, BC00052_A132UsuarioNotificacionResultado1, BC00052_n132UsuarioNotificacionResultado1, BC00052_A133UsuarioNotificacionResultado2,
            BC00052_n133UsuarioNotificacionResultado2, BC00052_A134UsuarioNotificacionAvisos1, BC00052_n134UsuarioNotificacionAvisos1, BC00052_A135UsuarioNotificacionAvisos2, BC00052_n135UsuarioNotificacionAvisos2, BC00052_A136UsuarioTecnicoCelular1, BC00052_n136UsuarioTecnicoCelular1, BC00052_A137UsuarioTecnicoCelular2, BC00052_n137UsuarioTecnicoCelular2, BC00052_A138UsuarioTecnicoCelularNombre1,
            BC00052_n138UsuarioTecnicoCelularNombre1, BC00052_A139UsuarioTecnicoCelularNombre2, BC00052_n139UsuarioTecnicoCelularNombre2, BC00052_A140UsuarioTecnicoTelefono1, BC00052_n140UsuarioTecnicoTelefono1, BC00052_A141UsuarioTecnicoTelefono2, BC00052_n141UsuarioTecnicoTelefono2, BC00052_A142UsuarioTecnicoTelefonoNombre1, BC00052_n142UsuarioTecnicoTelefonoNombre1, BC00052_A143UsuarioTecnicoTelefonoNombre2,
            BC00052_n143UsuarioTecnicoTelefonoNombre2, BC00052_A144UsuarioTecnicoEmail1, BC00052_n144UsuarioTecnicoEmail1, BC00052_A145UsuarioTecnicoEmail2, BC00052_n145UsuarioTecnicoEmail2, BC00052_A146UsuarioTecnicoEmailNombre1, BC00052_n146UsuarioTecnicoEmailNombre1, BC00052_A147UsuarioTecnicoEmailNombre2, BC00052_n147UsuarioTecnicoEmailNombre2, BC00052_A148UsuarioRutTipo,
            BC00052_n148UsuarioRutTipo, BC00052_A149UsuarioFacDireccion, BC00052_n149UsuarioFacDireccion, BC00052_A150UsuarioFacLocalidad, BC00052_n150UsuarioFacLocalidad, BC00052_A151UsuarioFacDepartamento, BC00052_n151UsuarioFacDepartamento, BC00052_A152UsuarioFacEmailEnvio, BC00052_n152UsuarioFacEmailEnvio, BC00052_A153UsuarioCobranzaCelular1,
            BC00052_n153UsuarioCobranzaCelular1, BC00052_A154UsuarioCobranzaCelular2, BC00052_n154UsuarioCobranzaCelular2, BC00052_A155UsuarioCobranzaCelularNombre1, BC00052_n155UsuarioCobranzaCelularNombre1, BC00052_A156UsuarioCobranzaCelularNombre2, BC00052_n156UsuarioCobranzaCelularNombre2, BC00052_A157UsuarioCobranzaTelefono1, BC00052_n157UsuarioCobranzaTelefono1, BC00052_A158UsuarioCobranzaTelefono2,
            BC00052_n158UsuarioCobranzaTelefono2, BC00052_A159UsuarioCobranzaTelefonoNombre1, BC00052_n159UsuarioCobranzaTelefonoNombre1, BC00052_A160UsuarioCobranzaTelefonoNombre2, BC00052_n160UsuarioCobranzaTelefonoNombre2, BC00052_A161UsuarioCobranzaEmail1, BC00052_n161UsuarioCobranzaEmail1, BC00052_A162UsuarioCobranzaEmail2, BC00052_n162UsuarioCobranzaEmail2, BC00052_A163UsuarioCobranzaEmailNombre1,
            BC00052_n163UsuarioCobranzaEmailNombre1, BC00052_A164UsuarioCobranzaEmailNombre2, BC00052_n164UsuarioCobranzaEmailNombre2, BC00052_A165UsuarioCedula, BC00052_n165UsuarioCedula
            }
            , new Object[] {
            BC00053_A5UsuarioId, BC00053_A114UsuarioEmail, BC00053_n114UsuarioEmail, BC00053_A115UsuarioUsuarioWeb, BC00053_n115UsuarioUsuarioWeb, BC00053_A116UsuarioNombre, BC00053_n116UsuarioNombre, BC00053_A117UsuarioDicose, BC00053_n117UsuarioDicose, BC00053_A118UsuarioRazonSocial,
            BC00053_n118UsuarioRazonSocial, BC00053_A119UsuarioRut, BC00053_n119UsuarioRut, BC00053_A120UsuarioIdNet, BC00053_n120UsuarioIdNet, BC00053_A121UsuarioDireccion, BC00053_n121UsuarioDireccion, BC00053_A122UsuarioTipousuario, BC00053_n122UsuarioTipousuario, BC00053_A123UsuarioIdTecnico1,
            BC00053_n123UsuarioIdTecnico1, BC00053_A124UsuarioIdTecnico2, BC00053_n124UsuarioIdTecnico2, BC00053_A125UsuarioIdTecnico3, BC00053_n125UsuarioIdTecnico3, BC00053_A126UsuarioDireccionFrasco, BC00053_n126UsuarioDireccionFrasco, BC00053_A127UsuarioAgenciaFrasco, BC00053_n127UsuarioAgenciaFrasco, BC00053_A128UsuarioNotificacionFrasco1,
            BC00053_n128UsuarioNotificacionFrasco1, BC00053_A129UsuarioNotificacionFrasco2, BC00053_n129UsuarioNotificacionFrasco2, BC00053_A130UsuarioNotificacionSolicitud1, BC00053_n130UsuarioNotificacionSolicitud1, BC00053_A131UsuarioNotificacionSolicitud2, BC00053_n131UsuarioNotificacionSolicitud2, BC00053_A132UsuarioNotificacionResultado1, BC00053_n132UsuarioNotificacionResultado1, BC00053_A133UsuarioNotificacionResultado2,
            BC00053_n133UsuarioNotificacionResultado2, BC00053_A134UsuarioNotificacionAvisos1, BC00053_n134UsuarioNotificacionAvisos1, BC00053_A135UsuarioNotificacionAvisos2, BC00053_n135UsuarioNotificacionAvisos2, BC00053_A136UsuarioTecnicoCelular1, BC00053_n136UsuarioTecnicoCelular1, BC00053_A137UsuarioTecnicoCelular2, BC00053_n137UsuarioTecnicoCelular2, BC00053_A138UsuarioTecnicoCelularNombre1,
            BC00053_n138UsuarioTecnicoCelularNombre1, BC00053_A139UsuarioTecnicoCelularNombre2, BC00053_n139UsuarioTecnicoCelularNombre2, BC00053_A140UsuarioTecnicoTelefono1, BC00053_n140UsuarioTecnicoTelefono1, BC00053_A141UsuarioTecnicoTelefono2, BC00053_n141UsuarioTecnicoTelefono2, BC00053_A142UsuarioTecnicoTelefonoNombre1, BC00053_n142UsuarioTecnicoTelefonoNombre1, BC00053_A143UsuarioTecnicoTelefonoNombre2,
            BC00053_n143UsuarioTecnicoTelefonoNombre2, BC00053_A144UsuarioTecnicoEmail1, BC00053_n144UsuarioTecnicoEmail1, BC00053_A145UsuarioTecnicoEmail2, BC00053_n145UsuarioTecnicoEmail2, BC00053_A146UsuarioTecnicoEmailNombre1, BC00053_n146UsuarioTecnicoEmailNombre1, BC00053_A147UsuarioTecnicoEmailNombre2, BC00053_n147UsuarioTecnicoEmailNombre2, BC00053_A148UsuarioRutTipo,
            BC00053_n148UsuarioRutTipo, BC00053_A149UsuarioFacDireccion, BC00053_n149UsuarioFacDireccion, BC00053_A150UsuarioFacLocalidad, BC00053_n150UsuarioFacLocalidad, BC00053_A151UsuarioFacDepartamento, BC00053_n151UsuarioFacDepartamento, BC00053_A152UsuarioFacEmailEnvio, BC00053_n152UsuarioFacEmailEnvio, BC00053_A153UsuarioCobranzaCelular1,
            BC00053_n153UsuarioCobranzaCelular1, BC00053_A154UsuarioCobranzaCelular2, BC00053_n154UsuarioCobranzaCelular2, BC00053_A155UsuarioCobranzaCelularNombre1, BC00053_n155UsuarioCobranzaCelularNombre1, BC00053_A156UsuarioCobranzaCelularNombre2, BC00053_n156UsuarioCobranzaCelularNombre2, BC00053_A157UsuarioCobranzaTelefono1, BC00053_n157UsuarioCobranzaTelefono1, BC00053_A158UsuarioCobranzaTelefono2,
            BC00053_n158UsuarioCobranzaTelefono2, BC00053_A159UsuarioCobranzaTelefonoNombre1, BC00053_n159UsuarioCobranzaTelefonoNombre1, BC00053_A160UsuarioCobranzaTelefonoNombre2, BC00053_n160UsuarioCobranzaTelefonoNombre2, BC00053_A161UsuarioCobranzaEmail1, BC00053_n161UsuarioCobranzaEmail1, BC00053_A162UsuarioCobranzaEmail2, BC00053_n162UsuarioCobranzaEmail2, BC00053_A163UsuarioCobranzaEmailNombre1,
            BC00053_n163UsuarioCobranzaEmailNombre1, BC00053_A164UsuarioCobranzaEmailNombre2, BC00053_n164UsuarioCobranzaEmailNombre2, BC00053_A165UsuarioCedula, BC00053_n165UsuarioCedula
            }
            , new Object[] {
            BC00054_A5UsuarioId, BC00054_A114UsuarioEmail, BC00054_n114UsuarioEmail, BC00054_A115UsuarioUsuarioWeb, BC00054_n115UsuarioUsuarioWeb, BC00054_A116UsuarioNombre, BC00054_n116UsuarioNombre, BC00054_A117UsuarioDicose, BC00054_n117UsuarioDicose, BC00054_A118UsuarioRazonSocial,
            BC00054_n118UsuarioRazonSocial, BC00054_A119UsuarioRut, BC00054_n119UsuarioRut, BC00054_A120UsuarioIdNet, BC00054_n120UsuarioIdNet, BC00054_A121UsuarioDireccion, BC00054_n121UsuarioDireccion, BC00054_A122UsuarioTipousuario, BC00054_n122UsuarioTipousuario, BC00054_A123UsuarioIdTecnico1,
            BC00054_n123UsuarioIdTecnico1, BC00054_A124UsuarioIdTecnico2, BC00054_n124UsuarioIdTecnico2, BC00054_A125UsuarioIdTecnico3, BC00054_n125UsuarioIdTecnico3, BC00054_A126UsuarioDireccionFrasco, BC00054_n126UsuarioDireccionFrasco, BC00054_A127UsuarioAgenciaFrasco, BC00054_n127UsuarioAgenciaFrasco, BC00054_A128UsuarioNotificacionFrasco1,
            BC00054_n128UsuarioNotificacionFrasco1, BC00054_A129UsuarioNotificacionFrasco2, BC00054_n129UsuarioNotificacionFrasco2, BC00054_A130UsuarioNotificacionSolicitud1, BC00054_n130UsuarioNotificacionSolicitud1, BC00054_A131UsuarioNotificacionSolicitud2, BC00054_n131UsuarioNotificacionSolicitud2, BC00054_A132UsuarioNotificacionResultado1, BC00054_n132UsuarioNotificacionResultado1, BC00054_A133UsuarioNotificacionResultado2,
            BC00054_n133UsuarioNotificacionResultado2, BC00054_A134UsuarioNotificacionAvisos1, BC00054_n134UsuarioNotificacionAvisos1, BC00054_A135UsuarioNotificacionAvisos2, BC00054_n135UsuarioNotificacionAvisos2, BC00054_A136UsuarioTecnicoCelular1, BC00054_n136UsuarioTecnicoCelular1, BC00054_A137UsuarioTecnicoCelular2, BC00054_n137UsuarioTecnicoCelular2, BC00054_A138UsuarioTecnicoCelularNombre1,
            BC00054_n138UsuarioTecnicoCelularNombre1, BC00054_A139UsuarioTecnicoCelularNombre2, BC00054_n139UsuarioTecnicoCelularNombre2, BC00054_A140UsuarioTecnicoTelefono1, BC00054_n140UsuarioTecnicoTelefono1, BC00054_A141UsuarioTecnicoTelefono2, BC00054_n141UsuarioTecnicoTelefono2, BC00054_A142UsuarioTecnicoTelefonoNombre1, BC00054_n142UsuarioTecnicoTelefonoNombre1, BC00054_A143UsuarioTecnicoTelefonoNombre2,
            BC00054_n143UsuarioTecnicoTelefonoNombre2, BC00054_A144UsuarioTecnicoEmail1, BC00054_n144UsuarioTecnicoEmail1, BC00054_A145UsuarioTecnicoEmail2, BC00054_n145UsuarioTecnicoEmail2, BC00054_A146UsuarioTecnicoEmailNombre1, BC00054_n146UsuarioTecnicoEmailNombre1, BC00054_A147UsuarioTecnicoEmailNombre2, BC00054_n147UsuarioTecnicoEmailNombre2, BC00054_A148UsuarioRutTipo,
            BC00054_n148UsuarioRutTipo, BC00054_A149UsuarioFacDireccion, BC00054_n149UsuarioFacDireccion, BC00054_A150UsuarioFacLocalidad, BC00054_n150UsuarioFacLocalidad, BC00054_A151UsuarioFacDepartamento, BC00054_n151UsuarioFacDepartamento, BC00054_A152UsuarioFacEmailEnvio, BC00054_n152UsuarioFacEmailEnvio, BC00054_A153UsuarioCobranzaCelular1,
            BC00054_n153UsuarioCobranzaCelular1, BC00054_A154UsuarioCobranzaCelular2, BC00054_n154UsuarioCobranzaCelular2, BC00054_A155UsuarioCobranzaCelularNombre1, BC00054_n155UsuarioCobranzaCelularNombre1, BC00054_A156UsuarioCobranzaCelularNombre2, BC00054_n156UsuarioCobranzaCelularNombre2, BC00054_A157UsuarioCobranzaTelefono1, BC00054_n157UsuarioCobranzaTelefono1, BC00054_A158UsuarioCobranzaTelefono2,
            BC00054_n158UsuarioCobranzaTelefono2, BC00054_A159UsuarioCobranzaTelefonoNombre1, BC00054_n159UsuarioCobranzaTelefonoNombre1, BC00054_A160UsuarioCobranzaTelefonoNombre2, BC00054_n160UsuarioCobranzaTelefonoNombre2, BC00054_A161UsuarioCobranzaEmail1, BC00054_n161UsuarioCobranzaEmail1, BC00054_A162UsuarioCobranzaEmail2, BC00054_n162UsuarioCobranzaEmail2, BC00054_A163UsuarioCobranzaEmailNombre1,
            BC00054_n163UsuarioCobranzaEmailNombre1, BC00054_A164UsuarioCobranzaEmailNombre2, BC00054_n164UsuarioCobranzaEmailNombre2, BC00054_A165UsuarioCedula, BC00054_n165UsuarioCedula
            }
            , new Object[] {
            BC00055_A5UsuarioId, BC00055_A114UsuarioEmail, BC00055_n114UsuarioEmail, BC00055_A115UsuarioUsuarioWeb, BC00055_n115UsuarioUsuarioWeb, BC00055_A116UsuarioNombre, BC00055_n116UsuarioNombre, BC00055_A117UsuarioDicose, BC00055_n117UsuarioDicose, BC00055_A118UsuarioRazonSocial,
            BC00055_n118UsuarioRazonSocial, BC00055_A119UsuarioRut, BC00055_n119UsuarioRut, BC00055_A120UsuarioIdNet, BC00055_n120UsuarioIdNet, BC00055_A121UsuarioDireccion, BC00055_n121UsuarioDireccion, BC00055_A122UsuarioTipousuario, BC00055_n122UsuarioTipousuario, BC00055_A123UsuarioIdTecnico1,
            BC00055_n123UsuarioIdTecnico1, BC00055_A124UsuarioIdTecnico2, BC00055_n124UsuarioIdTecnico2, BC00055_A125UsuarioIdTecnico3, BC00055_n125UsuarioIdTecnico3, BC00055_A126UsuarioDireccionFrasco, BC00055_n126UsuarioDireccionFrasco, BC00055_A127UsuarioAgenciaFrasco, BC00055_n127UsuarioAgenciaFrasco, BC00055_A128UsuarioNotificacionFrasco1,
            BC00055_n128UsuarioNotificacionFrasco1, BC00055_A129UsuarioNotificacionFrasco2, BC00055_n129UsuarioNotificacionFrasco2, BC00055_A130UsuarioNotificacionSolicitud1, BC00055_n130UsuarioNotificacionSolicitud1, BC00055_A131UsuarioNotificacionSolicitud2, BC00055_n131UsuarioNotificacionSolicitud2, BC00055_A132UsuarioNotificacionResultado1, BC00055_n132UsuarioNotificacionResultado1, BC00055_A133UsuarioNotificacionResultado2,
            BC00055_n133UsuarioNotificacionResultado2, BC00055_A134UsuarioNotificacionAvisos1, BC00055_n134UsuarioNotificacionAvisos1, BC00055_A135UsuarioNotificacionAvisos2, BC00055_n135UsuarioNotificacionAvisos2, BC00055_A136UsuarioTecnicoCelular1, BC00055_n136UsuarioTecnicoCelular1, BC00055_A137UsuarioTecnicoCelular2, BC00055_n137UsuarioTecnicoCelular2, BC00055_A138UsuarioTecnicoCelularNombre1,
            BC00055_n138UsuarioTecnicoCelularNombre1, BC00055_A139UsuarioTecnicoCelularNombre2, BC00055_n139UsuarioTecnicoCelularNombre2, BC00055_A140UsuarioTecnicoTelefono1, BC00055_n140UsuarioTecnicoTelefono1, BC00055_A141UsuarioTecnicoTelefono2, BC00055_n141UsuarioTecnicoTelefono2, BC00055_A142UsuarioTecnicoTelefonoNombre1, BC00055_n142UsuarioTecnicoTelefonoNombre1, BC00055_A143UsuarioTecnicoTelefonoNombre2,
            BC00055_n143UsuarioTecnicoTelefonoNombre2, BC00055_A144UsuarioTecnicoEmail1, BC00055_n144UsuarioTecnicoEmail1, BC00055_A145UsuarioTecnicoEmail2, BC00055_n145UsuarioTecnicoEmail2, BC00055_A146UsuarioTecnicoEmailNombre1, BC00055_n146UsuarioTecnicoEmailNombre1, BC00055_A147UsuarioTecnicoEmailNombre2, BC00055_n147UsuarioTecnicoEmailNombre2, BC00055_A148UsuarioRutTipo,
            BC00055_n148UsuarioRutTipo, BC00055_A149UsuarioFacDireccion, BC00055_n149UsuarioFacDireccion, BC00055_A150UsuarioFacLocalidad, BC00055_n150UsuarioFacLocalidad, BC00055_A151UsuarioFacDepartamento, BC00055_n151UsuarioFacDepartamento, BC00055_A152UsuarioFacEmailEnvio, BC00055_n152UsuarioFacEmailEnvio, BC00055_A153UsuarioCobranzaCelular1,
            BC00055_n153UsuarioCobranzaCelular1, BC00055_A154UsuarioCobranzaCelular2, BC00055_n154UsuarioCobranzaCelular2, BC00055_A155UsuarioCobranzaCelularNombre1, BC00055_n155UsuarioCobranzaCelularNombre1, BC00055_A156UsuarioCobranzaCelularNombre2, BC00055_n156UsuarioCobranzaCelularNombre2, BC00055_A157UsuarioCobranzaTelefono1, BC00055_n157UsuarioCobranzaTelefono1, BC00055_A158UsuarioCobranzaTelefono2,
            BC00055_n158UsuarioCobranzaTelefono2, BC00055_A159UsuarioCobranzaTelefonoNombre1, BC00055_n159UsuarioCobranzaTelefonoNombre1, BC00055_A160UsuarioCobranzaTelefonoNombre2, BC00055_n160UsuarioCobranzaTelefonoNombre2, BC00055_A161UsuarioCobranzaEmail1, BC00055_n161UsuarioCobranzaEmail1, BC00055_A162UsuarioCobranzaEmail2, BC00055_n162UsuarioCobranzaEmail2, BC00055_A163UsuarioCobranzaEmailNombre1,
            BC00055_n163UsuarioCobranzaEmailNombre1, BC00055_A164UsuarioCobranzaEmailNombre2, BC00055_n164UsuarioCobranzaEmailNombre2, BC00055_A165UsuarioCedula, BC00055_n165UsuarioCedula
            }
            , new Object[] {
            BC00056_A5UsuarioId
            }
            , new Object[] {
            BC00057_A5UsuarioId, BC00057_A114UsuarioEmail, BC00057_n114UsuarioEmail, BC00057_A115UsuarioUsuarioWeb, BC00057_n115UsuarioUsuarioWeb, BC00057_A116UsuarioNombre, BC00057_n116UsuarioNombre, BC00057_A117UsuarioDicose, BC00057_n117UsuarioDicose, BC00057_A118UsuarioRazonSocial,
            BC00057_n118UsuarioRazonSocial, BC00057_A119UsuarioRut, BC00057_n119UsuarioRut, BC00057_A120UsuarioIdNet, BC00057_n120UsuarioIdNet, BC00057_A121UsuarioDireccion, BC00057_n121UsuarioDireccion, BC00057_A122UsuarioTipousuario, BC00057_n122UsuarioTipousuario, BC00057_A123UsuarioIdTecnico1,
            BC00057_n123UsuarioIdTecnico1, BC00057_A124UsuarioIdTecnico2, BC00057_n124UsuarioIdTecnico2, BC00057_A125UsuarioIdTecnico3, BC00057_n125UsuarioIdTecnico3, BC00057_A126UsuarioDireccionFrasco, BC00057_n126UsuarioDireccionFrasco, BC00057_A127UsuarioAgenciaFrasco, BC00057_n127UsuarioAgenciaFrasco, BC00057_A128UsuarioNotificacionFrasco1,
            BC00057_n128UsuarioNotificacionFrasco1, BC00057_A129UsuarioNotificacionFrasco2, BC00057_n129UsuarioNotificacionFrasco2, BC00057_A130UsuarioNotificacionSolicitud1, BC00057_n130UsuarioNotificacionSolicitud1, BC00057_A131UsuarioNotificacionSolicitud2, BC00057_n131UsuarioNotificacionSolicitud2, BC00057_A132UsuarioNotificacionResultado1, BC00057_n132UsuarioNotificacionResultado1, BC00057_A133UsuarioNotificacionResultado2,
            BC00057_n133UsuarioNotificacionResultado2, BC00057_A134UsuarioNotificacionAvisos1, BC00057_n134UsuarioNotificacionAvisos1, BC00057_A135UsuarioNotificacionAvisos2, BC00057_n135UsuarioNotificacionAvisos2, BC00057_A136UsuarioTecnicoCelular1, BC00057_n136UsuarioTecnicoCelular1, BC00057_A137UsuarioTecnicoCelular2, BC00057_n137UsuarioTecnicoCelular2, BC00057_A138UsuarioTecnicoCelularNombre1,
            BC00057_n138UsuarioTecnicoCelularNombre1, BC00057_A139UsuarioTecnicoCelularNombre2, BC00057_n139UsuarioTecnicoCelularNombre2, BC00057_A140UsuarioTecnicoTelefono1, BC00057_n140UsuarioTecnicoTelefono1, BC00057_A141UsuarioTecnicoTelefono2, BC00057_n141UsuarioTecnicoTelefono2, BC00057_A142UsuarioTecnicoTelefonoNombre1, BC00057_n142UsuarioTecnicoTelefonoNombre1, BC00057_A143UsuarioTecnicoTelefonoNombre2,
            BC00057_n143UsuarioTecnicoTelefonoNombre2, BC00057_A144UsuarioTecnicoEmail1, BC00057_n144UsuarioTecnicoEmail1, BC00057_A145UsuarioTecnicoEmail2, BC00057_n145UsuarioTecnicoEmail2, BC00057_A146UsuarioTecnicoEmailNombre1, BC00057_n146UsuarioTecnicoEmailNombre1, BC00057_A147UsuarioTecnicoEmailNombre2, BC00057_n147UsuarioTecnicoEmailNombre2, BC00057_A148UsuarioRutTipo,
            BC00057_n148UsuarioRutTipo, BC00057_A149UsuarioFacDireccion, BC00057_n149UsuarioFacDireccion, BC00057_A150UsuarioFacLocalidad, BC00057_n150UsuarioFacLocalidad, BC00057_A151UsuarioFacDepartamento, BC00057_n151UsuarioFacDepartamento, BC00057_A152UsuarioFacEmailEnvio, BC00057_n152UsuarioFacEmailEnvio, BC00057_A153UsuarioCobranzaCelular1,
            BC00057_n153UsuarioCobranzaCelular1, BC00057_A154UsuarioCobranzaCelular2, BC00057_n154UsuarioCobranzaCelular2, BC00057_A155UsuarioCobranzaCelularNombre1, BC00057_n155UsuarioCobranzaCelularNombre1, BC00057_A156UsuarioCobranzaCelularNombre2, BC00057_n156UsuarioCobranzaCelularNombre2, BC00057_A157UsuarioCobranzaTelefono1, BC00057_n157UsuarioCobranzaTelefono1, BC00057_A158UsuarioCobranzaTelefono2,
            BC00057_n158UsuarioCobranzaTelefono2, BC00057_A159UsuarioCobranzaTelefonoNombre1, BC00057_n159UsuarioCobranzaTelefonoNombre1, BC00057_A160UsuarioCobranzaTelefonoNombre2, BC00057_n160UsuarioCobranzaTelefonoNombre2, BC00057_A161UsuarioCobranzaEmail1, BC00057_n161UsuarioCobranzaEmail1, BC00057_A162UsuarioCobranzaEmail2, BC00057_n162UsuarioCobranzaEmail2, BC00057_A163UsuarioCobranzaEmailNombre1,
            BC00057_n163UsuarioCobranzaEmailNombre1, BC00057_A164UsuarioCobranzaEmailNombre2, BC00057_n164UsuarioCobranzaEmailNombre2, BC00057_A165UsuarioCedula, BC00057_n165UsuarioCedula
            }
            , new Object[] {
            BC00058_A5UsuarioId, BC00058_A114UsuarioEmail, BC00058_n114UsuarioEmail, BC00058_A115UsuarioUsuarioWeb, BC00058_n115UsuarioUsuarioWeb, BC00058_A116UsuarioNombre, BC00058_n116UsuarioNombre, BC00058_A117UsuarioDicose, BC00058_n117UsuarioDicose, BC00058_A118UsuarioRazonSocial,
            BC00058_n118UsuarioRazonSocial, BC00058_A119UsuarioRut, BC00058_n119UsuarioRut, BC00058_A120UsuarioIdNet, BC00058_n120UsuarioIdNet, BC00058_A121UsuarioDireccion, BC00058_n121UsuarioDireccion, BC00058_A122UsuarioTipousuario, BC00058_n122UsuarioTipousuario, BC00058_A123UsuarioIdTecnico1,
            BC00058_n123UsuarioIdTecnico1, BC00058_A124UsuarioIdTecnico2, BC00058_n124UsuarioIdTecnico2, BC00058_A125UsuarioIdTecnico3, BC00058_n125UsuarioIdTecnico3, BC00058_A126UsuarioDireccionFrasco, BC00058_n126UsuarioDireccionFrasco, BC00058_A127UsuarioAgenciaFrasco, BC00058_n127UsuarioAgenciaFrasco, BC00058_A128UsuarioNotificacionFrasco1,
            BC00058_n128UsuarioNotificacionFrasco1, BC00058_A129UsuarioNotificacionFrasco2, BC00058_n129UsuarioNotificacionFrasco2, BC00058_A130UsuarioNotificacionSolicitud1, BC00058_n130UsuarioNotificacionSolicitud1, BC00058_A131UsuarioNotificacionSolicitud2, BC00058_n131UsuarioNotificacionSolicitud2, BC00058_A132UsuarioNotificacionResultado1, BC00058_n132UsuarioNotificacionResultado1, BC00058_A133UsuarioNotificacionResultado2,
            BC00058_n133UsuarioNotificacionResultado2, BC00058_A134UsuarioNotificacionAvisos1, BC00058_n134UsuarioNotificacionAvisos1, BC00058_A135UsuarioNotificacionAvisos2, BC00058_n135UsuarioNotificacionAvisos2, BC00058_A136UsuarioTecnicoCelular1, BC00058_n136UsuarioTecnicoCelular1, BC00058_A137UsuarioTecnicoCelular2, BC00058_n137UsuarioTecnicoCelular2, BC00058_A138UsuarioTecnicoCelularNombre1,
            BC00058_n138UsuarioTecnicoCelularNombre1, BC00058_A139UsuarioTecnicoCelularNombre2, BC00058_n139UsuarioTecnicoCelularNombre2, BC00058_A140UsuarioTecnicoTelefono1, BC00058_n140UsuarioTecnicoTelefono1, BC00058_A141UsuarioTecnicoTelefono2, BC00058_n141UsuarioTecnicoTelefono2, BC00058_A142UsuarioTecnicoTelefonoNombre1, BC00058_n142UsuarioTecnicoTelefonoNombre1, BC00058_A143UsuarioTecnicoTelefonoNombre2,
            BC00058_n143UsuarioTecnicoTelefonoNombre2, BC00058_A144UsuarioTecnicoEmail1, BC00058_n144UsuarioTecnicoEmail1, BC00058_A145UsuarioTecnicoEmail2, BC00058_n145UsuarioTecnicoEmail2, BC00058_A146UsuarioTecnicoEmailNombre1, BC00058_n146UsuarioTecnicoEmailNombre1, BC00058_A147UsuarioTecnicoEmailNombre2, BC00058_n147UsuarioTecnicoEmailNombre2, BC00058_A148UsuarioRutTipo,
            BC00058_n148UsuarioRutTipo, BC00058_A149UsuarioFacDireccion, BC00058_n149UsuarioFacDireccion, BC00058_A150UsuarioFacLocalidad, BC00058_n150UsuarioFacLocalidad, BC00058_A151UsuarioFacDepartamento, BC00058_n151UsuarioFacDepartamento, BC00058_A152UsuarioFacEmailEnvio, BC00058_n152UsuarioFacEmailEnvio, BC00058_A153UsuarioCobranzaCelular1,
            BC00058_n153UsuarioCobranzaCelular1, BC00058_A154UsuarioCobranzaCelular2, BC00058_n154UsuarioCobranzaCelular2, BC00058_A155UsuarioCobranzaCelularNombre1, BC00058_n155UsuarioCobranzaCelularNombre1, BC00058_A156UsuarioCobranzaCelularNombre2, BC00058_n156UsuarioCobranzaCelularNombre2, BC00058_A157UsuarioCobranzaTelefono1, BC00058_n157UsuarioCobranzaTelefono1, BC00058_A158UsuarioCobranzaTelefono2,
            BC00058_n158UsuarioCobranzaTelefono2, BC00058_A159UsuarioCobranzaTelefonoNombre1, BC00058_n159UsuarioCobranzaTelefonoNombre1, BC00058_A160UsuarioCobranzaTelefonoNombre2, BC00058_n160UsuarioCobranzaTelefonoNombre2, BC00058_A161UsuarioCobranzaEmail1, BC00058_n161UsuarioCobranzaEmail1, BC00058_A162UsuarioCobranzaEmail2, BC00058_n162UsuarioCobranzaEmail2, BC00058_A163UsuarioCobranzaEmailNombre1,
            BC00058_n163UsuarioCobranzaEmailNombre1, BC00058_A164UsuarioCobranzaEmailNombre2, BC00058_n164UsuarioCobranzaEmailNombre2, BC00058_A165UsuarioCedula, BC00058_n165UsuarioCedula
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000512_A5UsuarioId, BC000512_A114UsuarioEmail, BC000512_n114UsuarioEmail, BC000512_A115UsuarioUsuarioWeb, BC000512_n115UsuarioUsuarioWeb, BC000512_A116UsuarioNombre, BC000512_n116UsuarioNombre, BC000512_A117UsuarioDicose, BC000512_n117UsuarioDicose, BC000512_A118UsuarioRazonSocial,
            BC000512_n118UsuarioRazonSocial, BC000512_A119UsuarioRut, BC000512_n119UsuarioRut, BC000512_A120UsuarioIdNet, BC000512_n120UsuarioIdNet, BC000512_A121UsuarioDireccion, BC000512_n121UsuarioDireccion, BC000512_A122UsuarioTipousuario, BC000512_n122UsuarioTipousuario, BC000512_A123UsuarioIdTecnico1,
            BC000512_n123UsuarioIdTecnico1, BC000512_A124UsuarioIdTecnico2, BC000512_n124UsuarioIdTecnico2, BC000512_A125UsuarioIdTecnico3, BC000512_n125UsuarioIdTecnico3, BC000512_A126UsuarioDireccionFrasco, BC000512_n126UsuarioDireccionFrasco, BC000512_A127UsuarioAgenciaFrasco, BC000512_n127UsuarioAgenciaFrasco, BC000512_A128UsuarioNotificacionFrasco1,
            BC000512_n128UsuarioNotificacionFrasco1, BC000512_A129UsuarioNotificacionFrasco2, BC000512_n129UsuarioNotificacionFrasco2, BC000512_A130UsuarioNotificacionSolicitud1, BC000512_n130UsuarioNotificacionSolicitud1, BC000512_A131UsuarioNotificacionSolicitud2, BC000512_n131UsuarioNotificacionSolicitud2, BC000512_A132UsuarioNotificacionResultado1, BC000512_n132UsuarioNotificacionResultado1, BC000512_A133UsuarioNotificacionResultado2,
            BC000512_n133UsuarioNotificacionResultado2, BC000512_A134UsuarioNotificacionAvisos1, BC000512_n134UsuarioNotificacionAvisos1, BC000512_A135UsuarioNotificacionAvisos2, BC000512_n135UsuarioNotificacionAvisos2, BC000512_A136UsuarioTecnicoCelular1, BC000512_n136UsuarioTecnicoCelular1, BC000512_A137UsuarioTecnicoCelular2, BC000512_n137UsuarioTecnicoCelular2, BC000512_A138UsuarioTecnicoCelularNombre1,
            BC000512_n138UsuarioTecnicoCelularNombre1, BC000512_A139UsuarioTecnicoCelularNombre2, BC000512_n139UsuarioTecnicoCelularNombre2, BC000512_A140UsuarioTecnicoTelefono1, BC000512_n140UsuarioTecnicoTelefono1, BC000512_A141UsuarioTecnicoTelefono2, BC000512_n141UsuarioTecnicoTelefono2, BC000512_A142UsuarioTecnicoTelefonoNombre1, BC000512_n142UsuarioTecnicoTelefonoNombre1, BC000512_A143UsuarioTecnicoTelefonoNombre2,
            BC000512_n143UsuarioTecnicoTelefonoNombre2, BC000512_A144UsuarioTecnicoEmail1, BC000512_n144UsuarioTecnicoEmail1, BC000512_A145UsuarioTecnicoEmail2, BC000512_n145UsuarioTecnicoEmail2, BC000512_A146UsuarioTecnicoEmailNombre1, BC000512_n146UsuarioTecnicoEmailNombre1, BC000512_A147UsuarioTecnicoEmailNombre2, BC000512_n147UsuarioTecnicoEmailNombre2, BC000512_A148UsuarioRutTipo,
            BC000512_n148UsuarioRutTipo, BC000512_A149UsuarioFacDireccion, BC000512_n149UsuarioFacDireccion, BC000512_A150UsuarioFacLocalidad, BC000512_n150UsuarioFacLocalidad, BC000512_A151UsuarioFacDepartamento, BC000512_n151UsuarioFacDepartamento, BC000512_A152UsuarioFacEmailEnvio, BC000512_n152UsuarioFacEmailEnvio, BC000512_A153UsuarioCobranzaCelular1,
            BC000512_n153UsuarioCobranzaCelular1, BC000512_A154UsuarioCobranzaCelular2, BC000512_n154UsuarioCobranzaCelular2, BC000512_A155UsuarioCobranzaCelularNombre1, BC000512_n155UsuarioCobranzaCelularNombre1, BC000512_A156UsuarioCobranzaCelularNombre2, BC000512_n156UsuarioCobranzaCelularNombre2, BC000512_A157UsuarioCobranzaTelefono1, BC000512_n157UsuarioCobranzaTelefono1, BC000512_A158UsuarioCobranzaTelefono2,
            BC000512_n158UsuarioCobranzaTelefono2, BC000512_A159UsuarioCobranzaTelefonoNombre1, BC000512_n159UsuarioCobranzaTelefonoNombre1, BC000512_A160UsuarioCobranzaTelefonoNombre2, BC000512_n160UsuarioCobranzaTelefonoNombre2, BC000512_A161UsuarioCobranzaEmail1, BC000512_n161UsuarioCobranzaEmail1, BC000512_A162UsuarioCobranzaEmail2, BC000512_n162UsuarioCobranzaEmail2, BC000512_A163UsuarioCobranzaEmailNombre1,
            BC000512_n163UsuarioCobranzaEmailNombre1, BC000512_A164UsuarioCobranzaEmailNombre2, BC000512_n164UsuarioCobranzaEmailNombre2, BC000512_A165UsuarioCedula, BC000512_n165UsuarioCedula
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound5 ;
   private short A122UsuarioTipousuario ;
   private short A127UsuarioAgenciaFrasco ;
   private short Z122UsuarioTipousuario ;
   private short Z127UsuarioAgenciaFrasco ;
   private short nIsDirty_5 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom5 ;
   private int GXPagingTo5 ;
   private int GX_JID ;
   private long A5UsuarioId ;
   private long A120UsuarioIdNet ;
   private long A123UsuarioIdTecnico1 ;
   private long A124UsuarioIdTecnico2 ;
   private long A125UsuarioIdTecnico3 ;
   private long Z5UsuarioId ;
   private long Z120UsuarioIdNet ;
   private long Z123UsuarioIdTecnico1 ;
   private long Z124UsuarioIdTecnico2 ;
   private long Z125UsuarioIdTecnico3 ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode5 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private boolean Gx_longc ;
   private boolean mustCommit ;
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
   private String Z114UsuarioEmail ;
   private String Z115UsuarioUsuarioWeb ;
   private String Z116UsuarioNombre ;
   private String Z117UsuarioDicose ;
   private String Z118UsuarioRazonSocial ;
   private String Z119UsuarioRut ;
   private String Z121UsuarioDireccion ;
   private String Z126UsuarioDireccionFrasco ;
   private String Z128UsuarioNotificacionFrasco1 ;
   private String Z129UsuarioNotificacionFrasco2 ;
   private String Z130UsuarioNotificacionSolicitud1 ;
   private String Z131UsuarioNotificacionSolicitud2 ;
   private String Z132UsuarioNotificacionResultado1 ;
   private String Z133UsuarioNotificacionResultado2 ;
   private String Z134UsuarioNotificacionAvisos1 ;
   private String Z135UsuarioNotificacionAvisos2 ;
   private String Z136UsuarioTecnicoCelular1 ;
   private String Z137UsuarioTecnicoCelular2 ;
   private String Z138UsuarioTecnicoCelularNombre1 ;
   private String Z139UsuarioTecnicoCelularNombre2 ;
   private String Z140UsuarioTecnicoTelefono1 ;
   private String Z141UsuarioTecnicoTelefono2 ;
   private String Z142UsuarioTecnicoTelefonoNombre1 ;
   private String Z143UsuarioTecnicoTelefonoNombre2 ;
   private String Z144UsuarioTecnicoEmail1 ;
   private String Z145UsuarioTecnicoEmail2 ;
   private String Z146UsuarioTecnicoEmailNombre1 ;
   private String Z147UsuarioTecnicoEmailNombre2 ;
   private String Z148UsuarioRutTipo ;
   private String Z149UsuarioFacDireccion ;
   private String Z150UsuarioFacLocalidad ;
   private String Z151UsuarioFacDepartamento ;
   private String Z152UsuarioFacEmailEnvio ;
   private String Z153UsuarioCobranzaCelular1 ;
   private String Z154UsuarioCobranzaCelular2 ;
   private String Z155UsuarioCobranzaCelularNombre1 ;
   private String Z156UsuarioCobranzaCelularNombre2 ;
   private String Z157UsuarioCobranzaTelefono1 ;
   private String Z158UsuarioCobranzaTelefono2 ;
   private String Z159UsuarioCobranzaTelefonoNombre1 ;
   private String Z160UsuarioCobranzaTelefonoNombre2 ;
   private String Z161UsuarioCobranzaEmail1 ;
   private String Z162UsuarioCobranzaEmail2 ;
   private String Z163UsuarioCobranzaEmailNombre1 ;
   private String Z164UsuarioCobranzaEmailNombre2 ;
   private String Z165UsuarioCedula ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtUsuario> gx_restcollection ;
   private com.colaveco.SdtUsuario bcUsuario ;
   private com.colaveco.SdtUsuario gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00054_A5UsuarioId ;
   private String[] BC00054_A114UsuarioEmail ;
   private boolean[] BC00054_n114UsuarioEmail ;
   private String[] BC00054_A115UsuarioUsuarioWeb ;
   private boolean[] BC00054_n115UsuarioUsuarioWeb ;
   private String[] BC00054_A116UsuarioNombre ;
   private boolean[] BC00054_n116UsuarioNombre ;
   private String[] BC00054_A117UsuarioDicose ;
   private boolean[] BC00054_n117UsuarioDicose ;
   private String[] BC00054_A118UsuarioRazonSocial ;
   private boolean[] BC00054_n118UsuarioRazonSocial ;
   private String[] BC00054_A119UsuarioRut ;
   private boolean[] BC00054_n119UsuarioRut ;
   private long[] BC00054_A120UsuarioIdNet ;
   private boolean[] BC00054_n120UsuarioIdNet ;
   private String[] BC00054_A121UsuarioDireccion ;
   private boolean[] BC00054_n121UsuarioDireccion ;
   private short[] BC00054_A122UsuarioTipousuario ;
   private boolean[] BC00054_n122UsuarioTipousuario ;
   private long[] BC00054_A123UsuarioIdTecnico1 ;
   private boolean[] BC00054_n123UsuarioIdTecnico1 ;
   private long[] BC00054_A124UsuarioIdTecnico2 ;
   private boolean[] BC00054_n124UsuarioIdTecnico2 ;
   private long[] BC00054_A125UsuarioIdTecnico3 ;
   private boolean[] BC00054_n125UsuarioIdTecnico3 ;
   private String[] BC00054_A126UsuarioDireccionFrasco ;
   private boolean[] BC00054_n126UsuarioDireccionFrasco ;
   private short[] BC00054_A127UsuarioAgenciaFrasco ;
   private boolean[] BC00054_n127UsuarioAgenciaFrasco ;
   private String[] BC00054_A128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00054_n128UsuarioNotificacionFrasco1 ;
   private String[] BC00054_A129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00054_n129UsuarioNotificacionFrasco2 ;
   private String[] BC00054_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00054_n130UsuarioNotificacionSolicitud1 ;
   private String[] BC00054_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00054_n131UsuarioNotificacionSolicitud2 ;
   private String[] BC00054_A132UsuarioNotificacionResultado1 ;
   private boolean[] BC00054_n132UsuarioNotificacionResultado1 ;
   private String[] BC00054_A133UsuarioNotificacionResultado2 ;
   private boolean[] BC00054_n133UsuarioNotificacionResultado2 ;
   private String[] BC00054_A134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00054_n134UsuarioNotificacionAvisos1 ;
   private String[] BC00054_A135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00054_n135UsuarioNotificacionAvisos2 ;
   private String[] BC00054_A136UsuarioTecnicoCelular1 ;
   private boolean[] BC00054_n136UsuarioTecnicoCelular1 ;
   private String[] BC00054_A137UsuarioTecnicoCelular2 ;
   private boolean[] BC00054_n137UsuarioTecnicoCelular2 ;
   private String[] BC00054_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00054_n138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00054_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00054_n139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00054_A140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00054_n140UsuarioTecnicoTelefono1 ;
   private String[] BC00054_A141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00054_n141UsuarioTecnicoTelefono2 ;
   private String[] BC00054_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00054_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00054_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00054_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00054_A144UsuarioTecnicoEmail1 ;
   private boolean[] BC00054_n144UsuarioTecnicoEmail1 ;
   private String[] BC00054_A145UsuarioTecnicoEmail2 ;
   private boolean[] BC00054_n145UsuarioTecnicoEmail2 ;
   private String[] BC00054_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00054_n146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00054_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00054_n147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00054_A148UsuarioRutTipo ;
   private boolean[] BC00054_n148UsuarioRutTipo ;
   private String[] BC00054_A149UsuarioFacDireccion ;
   private boolean[] BC00054_n149UsuarioFacDireccion ;
   private String[] BC00054_A150UsuarioFacLocalidad ;
   private boolean[] BC00054_n150UsuarioFacLocalidad ;
   private String[] BC00054_A151UsuarioFacDepartamento ;
   private boolean[] BC00054_n151UsuarioFacDepartamento ;
   private String[] BC00054_A152UsuarioFacEmailEnvio ;
   private boolean[] BC00054_n152UsuarioFacEmailEnvio ;
   private String[] BC00054_A153UsuarioCobranzaCelular1 ;
   private boolean[] BC00054_n153UsuarioCobranzaCelular1 ;
   private String[] BC00054_A154UsuarioCobranzaCelular2 ;
   private boolean[] BC00054_n154UsuarioCobranzaCelular2 ;
   private String[] BC00054_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00054_n155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00054_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00054_n156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00054_A157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00054_n157UsuarioCobranzaTelefono1 ;
   private String[] BC00054_A158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00054_n158UsuarioCobranzaTelefono2 ;
   private String[] BC00054_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00054_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00054_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00054_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00054_A161UsuarioCobranzaEmail1 ;
   private boolean[] BC00054_n161UsuarioCobranzaEmail1 ;
   private String[] BC00054_A162UsuarioCobranzaEmail2 ;
   private boolean[] BC00054_n162UsuarioCobranzaEmail2 ;
   private String[] BC00054_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00054_n163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00054_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00054_n164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00054_A165UsuarioCedula ;
   private boolean[] BC00054_n165UsuarioCedula ;
   private long[] BC00055_A5UsuarioId ;
   private String[] BC00055_A114UsuarioEmail ;
   private boolean[] BC00055_n114UsuarioEmail ;
   private String[] BC00055_A115UsuarioUsuarioWeb ;
   private boolean[] BC00055_n115UsuarioUsuarioWeb ;
   private String[] BC00055_A116UsuarioNombre ;
   private boolean[] BC00055_n116UsuarioNombre ;
   private String[] BC00055_A117UsuarioDicose ;
   private boolean[] BC00055_n117UsuarioDicose ;
   private String[] BC00055_A118UsuarioRazonSocial ;
   private boolean[] BC00055_n118UsuarioRazonSocial ;
   private String[] BC00055_A119UsuarioRut ;
   private boolean[] BC00055_n119UsuarioRut ;
   private long[] BC00055_A120UsuarioIdNet ;
   private boolean[] BC00055_n120UsuarioIdNet ;
   private String[] BC00055_A121UsuarioDireccion ;
   private boolean[] BC00055_n121UsuarioDireccion ;
   private short[] BC00055_A122UsuarioTipousuario ;
   private boolean[] BC00055_n122UsuarioTipousuario ;
   private long[] BC00055_A123UsuarioIdTecnico1 ;
   private boolean[] BC00055_n123UsuarioIdTecnico1 ;
   private long[] BC00055_A124UsuarioIdTecnico2 ;
   private boolean[] BC00055_n124UsuarioIdTecnico2 ;
   private long[] BC00055_A125UsuarioIdTecnico3 ;
   private boolean[] BC00055_n125UsuarioIdTecnico3 ;
   private String[] BC00055_A126UsuarioDireccionFrasco ;
   private boolean[] BC00055_n126UsuarioDireccionFrasco ;
   private short[] BC00055_A127UsuarioAgenciaFrasco ;
   private boolean[] BC00055_n127UsuarioAgenciaFrasco ;
   private String[] BC00055_A128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00055_n128UsuarioNotificacionFrasco1 ;
   private String[] BC00055_A129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00055_n129UsuarioNotificacionFrasco2 ;
   private String[] BC00055_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00055_n130UsuarioNotificacionSolicitud1 ;
   private String[] BC00055_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00055_n131UsuarioNotificacionSolicitud2 ;
   private String[] BC00055_A132UsuarioNotificacionResultado1 ;
   private boolean[] BC00055_n132UsuarioNotificacionResultado1 ;
   private String[] BC00055_A133UsuarioNotificacionResultado2 ;
   private boolean[] BC00055_n133UsuarioNotificacionResultado2 ;
   private String[] BC00055_A134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00055_n134UsuarioNotificacionAvisos1 ;
   private String[] BC00055_A135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00055_n135UsuarioNotificacionAvisos2 ;
   private String[] BC00055_A136UsuarioTecnicoCelular1 ;
   private boolean[] BC00055_n136UsuarioTecnicoCelular1 ;
   private String[] BC00055_A137UsuarioTecnicoCelular2 ;
   private boolean[] BC00055_n137UsuarioTecnicoCelular2 ;
   private String[] BC00055_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00055_n138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00055_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00055_n139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00055_A140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00055_n140UsuarioTecnicoTelefono1 ;
   private String[] BC00055_A141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00055_n141UsuarioTecnicoTelefono2 ;
   private String[] BC00055_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00055_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00055_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00055_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00055_A144UsuarioTecnicoEmail1 ;
   private boolean[] BC00055_n144UsuarioTecnicoEmail1 ;
   private String[] BC00055_A145UsuarioTecnicoEmail2 ;
   private boolean[] BC00055_n145UsuarioTecnicoEmail2 ;
   private String[] BC00055_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00055_n146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00055_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00055_n147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00055_A148UsuarioRutTipo ;
   private boolean[] BC00055_n148UsuarioRutTipo ;
   private String[] BC00055_A149UsuarioFacDireccion ;
   private boolean[] BC00055_n149UsuarioFacDireccion ;
   private String[] BC00055_A150UsuarioFacLocalidad ;
   private boolean[] BC00055_n150UsuarioFacLocalidad ;
   private String[] BC00055_A151UsuarioFacDepartamento ;
   private boolean[] BC00055_n151UsuarioFacDepartamento ;
   private String[] BC00055_A152UsuarioFacEmailEnvio ;
   private boolean[] BC00055_n152UsuarioFacEmailEnvio ;
   private String[] BC00055_A153UsuarioCobranzaCelular1 ;
   private boolean[] BC00055_n153UsuarioCobranzaCelular1 ;
   private String[] BC00055_A154UsuarioCobranzaCelular2 ;
   private boolean[] BC00055_n154UsuarioCobranzaCelular2 ;
   private String[] BC00055_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00055_n155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00055_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00055_n156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00055_A157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00055_n157UsuarioCobranzaTelefono1 ;
   private String[] BC00055_A158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00055_n158UsuarioCobranzaTelefono2 ;
   private String[] BC00055_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00055_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00055_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00055_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00055_A161UsuarioCobranzaEmail1 ;
   private boolean[] BC00055_n161UsuarioCobranzaEmail1 ;
   private String[] BC00055_A162UsuarioCobranzaEmail2 ;
   private boolean[] BC00055_n162UsuarioCobranzaEmail2 ;
   private String[] BC00055_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00055_n163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00055_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00055_n164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00055_A165UsuarioCedula ;
   private boolean[] BC00055_n165UsuarioCedula ;
   private long[] BC00056_A5UsuarioId ;
   private long[] BC00057_A5UsuarioId ;
   private String[] BC00057_A114UsuarioEmail ;
   private boolean[] BC00057_n114UsuarioEmail ;
   private String[] BC00057_A115UsuarioUsuarioWeb ;
   private boolean[] BC00057_n115UsuarioUsuarioWeb ;
   private String[] BC00057_A116UsuarioNombre ;
   private boolean[] BC00057_n116UsuarioNombre ;
   private String[] BC00057_A117UsuarioDicose ;
   private boolean[] BC00057_n117UsuarioDicose ;
   private String[] BC00057_A118UsuarioRazonSocial ;
   private boolean[] BC00057_n118UsuarioRazonSocial ;
   private String[] BC00057_A119UsuarioRut ;
   private boolean[] BC00057_n119UsuarioRut ;
   private long[] BC00057_A120UsuarioIdNet ;
   private boolean[] BC00057_n120UsuarioIdNet ;
   private String[] BC00057_A121UsuarioDireccion ;
   private boolean[] BC00057_n121UsuarioDireccion ;
   private short[] BC00057_A122UsuarioTipousuario ;
   private boolean[] BC00057_n122UsuarioTipousuario ;
   private long[] BC00057_A123UsuarioIdTecnico1 ;
   private boolean[] BC00057_n123UsuarioIdTecnico1 ;
   private long[] BC00057_A124UsuarioIdTecnico2 ;
   private boolean[] BC00057_n124UsuarioIdTecnico2 ;
   private long[] BC00057_A125UsuarioIdTecnico3 ;
   private boolean[] BC00057_n125UsuarioIdTecnico3 ;
   private String[] BC00057_A126UsuarioDireccionFrasco ;
   private boolean[] BC00057_n126UsuarioDireccionFrasco ;
   private short[] BC00057_A127UsuarioAgenciaFrasco ;
   private boolean[] BC00057_n127UsuarioAgenciaFrasco ;
   private String[] BC00057_A128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00057_n128UsuarioNotificacionFrasco1 ;
   private String[] BC00057_A129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00057_n129UsuarioNotificacionFrasco2 ;
   private String[] BC00057_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00057_n130UsuarioNotificacionSolicitud1 ;
   private String[] BC00057_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00057_n131UsuarioNotificacionSolicitud2 ;
   private String[] BC00057_A132UsuarioNotificacionResultado1 ;
   private boolean[] BC00057_n132UsuarioNotificacionResultado1 ;
   private String[] BC00057_A133UsuarioNotificacionResultado2 ;
   private boolean[] BC00057_n133UsuarioNotificacionResultado2 ;
   private String[] BC00057_A134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00057_n134UsuarioNotificacionAvisos1 ;
   private String[] BC00057_A135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00057_n135UsuarioNotificacionAvisos2 ;
   private String[] BC00057_A136UsuarioTecnicoCelular1 ;
   private boolean[] BC00057_n136UsuarioTecnicoCelular1 ;
   private String[] BC00057_A137UsuarioTecnicoCelular2 ;
   private boolean[] BC00057_n137UsuarioTecnicoCelular2 ;
   private String[] BC00057_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00057_n138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00057_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00057_n139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00057_A140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00057_n140UsuarioTecnicoTelefono1 ;
   private String[] BC00057_A141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00057_n141UsuarioTecnicoTelefono2 ;
   private String[] BC00057_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00057_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00057_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00057_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00057_A144UsuarioTecnicoEmail1 ;
   private boolean[] BC00057_n144UsuarioTecnicoEmail1 ;
   private String[] BC00057_A145UsuarioTecnicoEmail2 ;
   private boolean[] BC00057_n145UsuarioTecnicoEmail2 ;
   private String[] BC00057_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00057_n146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00057_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00057_n147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00057_A148UsuarioRutTipo ;
   private boolean[] BC00057_n148UsuarioRutTipo ;
   private String[] BC00057_A149UsuarioFacDireccion ;
   private boolean[] BC00057_n149UsuarioFacDireccion ;
   private String[] BC00057_A150UsuarioFacLocalidad ;
   private boolean[] BC00057_n150UsuarioFacLocalidad ;
   private String[] BC00057_A151UsuarioFacDepartamento ;
   private boolean[] BC00057_n151UsuarioFacDepartamento ;
   private String[] BC00057_A152UsuarioFacEmailEnvio ;
   private boolean[] BC00057_n152UsuarioFacEmailEnvio ;
   private String[] BC00057_A153UsuarioCobranzaCelular1 ;
   private boolean[] BC00057_n153UsuarioCobranzaCelular1 ;
   private String[] BC00057_A154UsuarioCobranzaCelular2 ;
   private boolean[] BC00057_n154UsuarioCobranzaCelular2 ;
   private String[] BC00057_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00057_n155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00057_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00057_n156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00057_A157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00057_n157UsuarioCobranzaTelefono1 ;
   private String[] BC00057_A158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00057_n158UsuarioCobranzaTelefono2 ;
   private String[] BC00057_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00057_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00057_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00057_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00057_A161UsuarioCobranzaEmail1 ;
   private boolean[] BC00057_n161UsuarioCobranzaEmail1 ;
   private String[] BC00057_A162UsuarioCobranzaEmail2 ;
   private boolean[] BC00057_n162UsuarioCobranzaEmail2 ;
   private String[] BC00057_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00057_n163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00057_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00057_n164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00057_A165UsuarioCedula ;
   private boolean[] BC00057_n165UsuarioCedula ;
   private long[] BC00058_A5UsuarioId ;
   private String[] BC00058_A114UsuarioEmail ;
   private boolean[] BC00058_n114UsuarioEmail ;
   private String[] BC00058_A115UsuarioUsuarioWeb ;
   private boolean[] BC00058_n115UsuarioUsuarioWeb ;
   private String[] BC00058_A116UsuarioNombre ;
   private boolean[] BC00058_n116UsuarioNombre ;
   private String[] BC00058_A117UsuarioDicose ;
   private boolean[] BC00058_n117UsuarioDicose ;
   private String[] BC00058_A118UsuarioRazonSocial ;
   private boolean[] BC00058_n118UsuarioRazonSocial ;
   private String[] BC00058_A119UsuarioRut ;
   private boolean[] BC00058_n119UsuarioRut ;
   private long[] BC00058_A120UsuarioIdNet ;
   private boolean[] BC00058_n120UsuarioIdNet ;
   private String[] BC00058_A121UsuarioDireccion ;
   private boolean[] BC00058_n121UsuarioDireccion ;
   private short[] BC00058_A122UsuarioTipousuario ;
   private boolean[] BC00058_n122UsuarioTipousuario ;
   private long[] BC00058_A123UsuarioIdTecnico1 ;
   private boolean[] BC00058_n123UsuarioIdTecnico1 ;
   private long[] BC00058_A124UsuarioIdTecnico2 ;
   private boolean[] BC00058_n124UsuarioIdTecnico2 ;
   private long[] BC00058_A125UsuarioIdTecnico3 ;
   private boolean[] BC00058_n125UsuarioIdTecnico3 ;
   private String[] BC00058_A126UsuarioDireccionFrasco ;
   private boolean[] BC00058_n126UsuarioDireccionFrasco ;
   private short[] BC00058_A127UsuarioAgenciaFrasco ;
   private boolean[] BC00058_n127UsuarioAgenciaFrasco ;
   private String[] BC00058_A128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00058_n128UsuarioNotificacionFrasco1 ;
   private String[] BC00058_A129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00058_n129UsuarioNotificacionFrasco2 ;
   private String[] BC00058_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00058_n130UsuarioNotificacionSolicitud1 ;
   private String[] BC00058_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00058_n131UsuarioNotificacionSolicitud2 ;
   private String[] BC00058_A132UsuarioNotificacionResultado1 ;
   private boolean[] BC00058_n132UsuarioNotificacionResultado1 ;
   private String[] BC00058_A133UsuarioNotificacionResultado2 ;
   private boolean[] BC00058_n133UsuarioNotificacionResultado2 ;
   private String[] BC00058_A134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00058_n134UsuarioNotificacionAvisos1 ;
   private String[] BC00058_A135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00058_n135UsuarioNotificacionAvisos2 ;
   private String[] BC00058_A136UsuarioTecnicoCelular1 ;
   private boolean[] BC00058_n136UsuarioTecnicoCelular1 ;
   private String[] BC00058_A137UsuarioTecnicoCelular2 ;
   private boolean[] BC00058_n137UsuarioTecnicoCelular2 ;
   private String[] BC00058_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00058_n138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00058_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00058_n139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00058_A140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00058_n140UsuarioTecnicoTelefono1 ;
   private String[] BC00058_A141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00058_n141UsuarioTecnicoTelefono2 ;
   private String[] BC00058_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00058_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00058_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00058_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00058_A144UsuarioTecnicoEmail1 ;
   private boolean[] BC00058_n144UsuarioTecnicoEmail1 ;
   private String[] BC00058_A145UsuarioTecnicoEmail2 ;
   private boolean[] BC00058_n145UsuarioTecnicoEmail2 ;
   private String[] BC00058_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00058_n146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00058_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00058_n147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00058_A148UsuarioRutTipo ;
   private boolean[] BC00058_n148UsuarioRutTipo ;
   private String[] BC00058_A149UsuarioFacDireccion ;
   private boolean[] BC00058_n149UsuarioFacDireccion ;
   private String[] BC00058_A150UsuarioFacLocalidad ;
   private boolean[] BC00058_n150UsuarioFacLocalidad ;
   private String[] BC00058_A151UsuarioFacDepartamento ;
   private boolean[] BC00058_n151UsuarioFacDepartamento ;
   private String[] BC00058_A152UsuarioFacEmailEnvio ;
   private boolean[] BC00058_n152UsuarioFacEmailEnvio ;
   private String[] BC00058_A153UsuarioCobranzaCelular1 ;
   private boolean[] BC00058_n153UsuarioCobranzaCelular1 ;
   private String[] BC00058_A154UsuarioCobranzaCelular2 ;
   private boolean[] BC00058_n154UsuarioCobranzaCelular2 ;
   private String[] BC00058_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00058_n155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00058_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00058_n156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00058_A157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00058_n157UsuarioCobranzaTelefono1 ;
   private String[] BC00058_A158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00058_n158UsuarioCobranzaTelefono2 ;
   private String[] BC00058_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00058_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00058_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00058_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00058_A161UsuarioCobranzaEmail1 ;
   private boolean[] BC00058_n161UsuarioCobranzaEmail1 ;
   private String[] BC00058_A162UsuarioCobranzaEmail2 ;
   private boolean[] BC00058_n162UsuarioCobranzaEmail2 ;
   private String[] BC00058_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00058_n163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00058_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00058_n164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00058_A165UsuarioCedula ;
   private boolean[] BC00058_n165UsuarioCedula ;
   private long[] BC000512_A5UsuarioId ;
   private String[] BC000512_A114UsuarioEmail ;
   private boolean[] BC000512_n114UsuarioEmail ;
   private String[] BC000512_A115UsuarioUsuarioWeb ;
   private boolean[] BC000512_n115UsuarioUsuarioWeb ;
   private String[] BC000512_A116UsuarioNombre ;
   private boolean[] BC000512_n116UsuarioNombre ;
   private String[] BC000512_A117UsuarioDicose ;
   private boolean[] BC000512_n117UsuarioDicose ;
   private String[] BC000512_A118UsuarioRazonSocial ;
   private boolean[] BC000512_n118UsuarioRazonSocial ;
   private String[] BC000512_A119UsuarioRut ;
   private boolean[] BC000512_n119UsuarioRut ;
   private long[] BC000512_A120UsuarioIdNet ;
   private boolean[] BC000512_n120UsuarioIdNet ;
   private String[] BC000512_A121UsuarioDireccion ;
   private boolean[] BC000512_n121UsuarioDireccion ;
   private short[] BC000512_A122UsuarioTipousuario ;
   private boolean[] BC000512_n122UsuarioTipousuario ;
   private long[] BC000512_A123UsuarioIdTecnico1 ;
   private boolean[] BC000512_n123UsuarioIdTecnico1 ;
   private long[] BC000512_A124UsuarioIdTecnico2 ;
   private boolean[] BC000512_n124UsuarioIdTecnico2 ;
   private long[] BC000512_A125UsuarioIdTecnico3 ;
   private boolean[] BC000512_n125UsuarioIdTecnico3 ;
   private String[] BC000512_A126UsuarioDireccionFrasco ;
   private boolean[] BC000512_n126UsuarioDireccionFrasco ;
   private short[] BC000512_A127UsuarioAgenciaFrasco ;
   private boolean[] BC000512_n127UsuarioAgenciaFrasco ;
   private String[] BC000512_A128UsuarioNotificacionFrasco1 ;
   private boolean[] BC000512_n128UsuarioNotificacionFrasco1 ;
   private String[] BC000512_A129UsuarioNotificacionFrasco2 ;
   private boolean[] BC000512_n129UsuarioNotificacionFrasco2 ;
   private String[] BC000512_A130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC000512_n130UsuarioNotificacionSolicitud1 ;
   private String[] BC000512_A131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC000512_n131UsuarioNotificacionSolicitud2 ;
   private String[] BC000512_A132UsuarioNotificacionResultado1 ;
   private boolean[] BC000512_n132UsuarioNotificacionResultado1 ;
   private String[] BC000512_A133UsuarioNotificacionResultado2 ;
   private boolean[] BC000512_n133UsuarioNotificacionResultado2 ;
   private String[] BC000512_A134UsuarioNotificacionAvisos1 ;
   private boolean[] BC000512_n134UsuarioNotificacionAvisos1 ;
   private String[] BC000512_A135UsuarioNotificacionAvisos2 ;
   private boolean[] BC000512_n135UsuarioNotificacionAvisos2 ;
   private String[] BC000512_A136UsuarioTecnicoCelular1 ;
   private boolean[] BC000512_n136UsuarioTecnicoCelular1 ;
   private String[] BC000512_A137UsuarioTecnicoCelular2 ;
   private boolean[] BC000512_n137UsuarioTecnicoCelular2 ;
   private String[] BC000512_A138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC000512_n138UsuarioTecnicoCelularNombre1 ;
   private String[] BC000512_A139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC000512_n139UsuarioTecnicoCelularNombre2 ;
   private String[] BC000512_A140UsuarioTecnicoTelefono1 ;
   private boolean[] BC000512_n140UsuarioTecnicoTelefono1 ;
   private String[] BC000512_A141UsuarioTecnicoTelefono2 ;
   private boolean[] BC000512_n141UsuarioTecnicoTelefono2 ;
   private String[] BC000512_A142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC000512_n142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC000512_A143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC000512_n143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC000512_A144UsuarioTecnicoEmail1 ;
   private boolean[] BC000512_n144UsuarioTecnicoEmail1 ;
   private String[] BC000512_A145UsuarioTecnicoEmail2 ;
   private boolean[] BC000512_n145UsuarioTecnicoEmail2 ;
   private String[] BC000512_A146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC000512_n146UsuarioTecnicoEmailNombre1 ;
   private String[] BC000512_A147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC000512_n147UsuarioTecnicoEmailNombre2 ;
   private String[] BC000512_A148UsuarioRutTipo ;
   private boolean[] BC000512_n148UsuarioRutTipo ;
   private String[] BC000512_A149UsuarioFacDireccion ;
   private boolean[] BC000512_n149UsuarioFacDireccion ;
   private String[] BC000512_A150UsuarioFacLocalidad ;
   private boolean[] BC000512_n150UsuarioFacLocalidad ;
   private String[] BC000512_A151UsuarioFacDepartamento ;
   private boolean[] BC000512_n151UsuarioFacDepartamento ;
   private String[] BC000512_A152UsuarioFacEmailEnvio ;
   private boolean[] BC000512_n152UsuarioFacEmailEnvio ;
   private String[] BC000512_A153UsuarioCobranzaCelular1 ;
   private boolean[] BC000512_n153UsuarioCobranzaCelular1 ;
   private String[] BC000512_A154UsuarioCobranzaCelular2 ;
   private boolean[] BC000512_n154UsuarioCobranzaCelular2 ;
   private String[] BC000512_A155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC000512_n155UsuarioCobranzaCelularNombre1 ;
   private String[] BC000512_A156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC000512_n156UsuarioCobranzaCelularNombre2 ;
   private String[] BC000512_A157UsuarioCobranzaTelefono1 ;
   private boolean[] BC000512_n157UsuarioCobranzaTelefono1 ;
   private String[] BC000512_A158UsuarioCobranzaTelefono2 ;
   private boolean[] BC000512_n158UsuarioCobranzaTelefono2 ;
   private String[] BC000512_A159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC000512_n159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC000512_A160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC000512_n160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC000512_A161UsuarioCobranzaEmail1 ;
   private boolean[] BC000512_n161UsuarioCobranzaEmail1 ;
   private String[] BC000512_A162UsuarioCobranzaEmail2 ;
   private boolean[] BC000512_n162UsuarioCobranzaEmail2 ;
   private String[] BC000512_A163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC000512_n163UsuarioCobranzaEmailNombre1 ;
   private String[] BC000512_A164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC000512_n164UsuarioCobranzaEmailNombre2 ;
   private String[] BC000512_A165UsuarioCedula ;
   private boolean[] BC000512_n165UsuarioCedula ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00052_A5UsuarioId ;
   private String[] BC00052_A114UsuarioEmail ;
   private String[] BC00052_A115UsuarioUsuarioWeb ;
   private String[] BC00052_A116UsuarioNombre ;
   private String[] BC00052_A117UsuarioDicose ;
   private String[] BC00052_A118UsuarioRazonSocial ;
   private String[] BC00052_A119UsuarioRut ;
   private long[] BC00052_A120UsuarioIdNet ;
   private String[] BC00052_A121UsuarioDireccion ;
   private short[] BC00052_A122UsuarioTipousuario ;
   private long[] BC00052_A123UsuarioIdTecnico1 ;
   private long[] BC00052_A124UsuarioIdTecnico2 ;
   private long[] BC00052_A125UsuarioIdTecnico3 ;
   private String[] BC00052_A126UsuarioDireccionFrasco ;
   private short[] BC00052_A127UsuarioAgenciaFrasco ;
   private String[] BC00052_A128UsuarioNotificacionFrasco1 ;
   private String[] BC00052_A129UsuarioNotificacionFrasco2 ;
   private String[] BC00052_A130UsuarioNotificacionSolicitud1 ;
   private String[] BC00052_A131UsuarioNotificacionSolicitud2 ;
   private String[] BC00052_A132UsuarioNotificacionResultado1 ;
   private String[] BC00052_A133UsuarioNotificacionResultado2 ;
   private String[] BC00052_A134UsuarioNotificacionAvisos1 ;
   private String[] BC00052_A135UsuarioNotificacionAvisos2 ;
   private String[] BC00052_A136UsuarioTecnicoCelular1 ;
   private String[] BC00052_A137UsuarioTecnicoCelular2 ;
   private String[] BC00052_A138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00052_A139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00052_A140UsuarioTecnicoTelefono1 ;
   private String[] BC00052_A141UsuarioTecnicoTelefono2 ;
   private String[] BC00052_A142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00052_A143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00052_A144UsuarioTecnicoEmail1 ;
   private String[] BC00052_A145UsuarioTecnicoEmail2 ;
   private String[] BC00052_A146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00052_A147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00052_A148UsuarioRutTipo ;
   private String[] BC00052_A149UsuarioFacDireccion ;
   private String[] BC00052_A150UsuarioFacLocalidad ;
   private String[] BC00052_A151UsuarioFacDepartamento ;
   private String[] BC00052_A152UsuarioFacEmailEnvio ;
   private String[] BC00052_A153UsuarioCobranzaCelular1 ;
   private String[] BC00052_A154UsuarioCobranzaCelular2 ;
   private String[] BC00052_A155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00052_A156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00052_A157UsuarioCobranzaTelefono1 ;
   private String[] BC00052_A158UsuarioCobranzaTelefono2 ;
   private String[] BC00052_A159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00052_A160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00052_A161UsuarioCobranzaEmail1 ;
   private String[] BC00052_A162UsuarioCobranzaEmail2 ;
   private String[] BC00052_A163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00052_A164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00052_A165UsuarioCedula ;
   private long[] BC00053_A5UsuarioId ;
   private String[] BC00053_A114UsuarioEmail ;
   private String[] BC00053_A115UsuarioUsuarioWeb ;
   private String[] BC00053_A116UsuarioNombre ;
   private String[] BC00053_A117UsuarioDicose ;
   private String[] BC00053_A118UsuarioRazonSocial ;
   private String[] BC00053_A119UsuarioRut ;
   private long[] BC00053_A120UsuarioIdNet ;
   private String[] BC00053_A121UsuarioDireccion ;
   private short[] BC00053_A122UsuarioTipousuario ;
   private long[] BC00053_A123UsuarioIdTecnico1 ;
   private long[] BC00053_A124UsuarioIdTecnico2 ;
   private long[] BC00053_A125UsuarioIdTecnico3 ;
   private String[] BC00053_A126UsuarioDireccionFrasco ;
   private short[] BC00053_A127UsuarioAgenciaFrasco ;
   private String[] BC00053_A128UsuarioNotificacionFrasco1 ;
   private String[] BC00053_A129UsuarioNotificacionFrasco2 ;
   private String[] BC00053_A130UsuarioNotificacionSolicitud1 ;
   private String[] BC00053_A131UsuarioNotificacionSolicitud2 ;
   private String[] BC00053_A132UsuarioNotificacionResultado1 ;
   private String[] BC00053_A133UsuarioNotificacionResultado2 ;
   private String[] BC00053_A134UsuarioNotificacionAvisos1 ;
   private String[] BC00053_A135UsuarioNotificacionAvisos2 ;
   private String[] BC00053_A136UsuarioTecnicoCelular1 ;
   private String[] BC00053_A137UsuarioTecnicoCelular2 ;
   private String[] BC00053_A138UsuarioTecnicoCelularNombre1 ;
   private String[] BC00053_A139UsuarioTecnicoCelularNombre2 ;
   private String[] BC00053_A140UsuarioTecnicoTelefono1 ;
   private String[] BC00053_A141UsuarioTecnicoTelefono2 ;
   private String[] BC00053_A142UsuarioTecnicoTelefonoNombre1 ;
   private String[] BC00053_A143UsuarioTecnicoTelefonoNombre2 ;
   private String[] BC00053_A144UsuarioTecnicoEmail1 ;
   private String[] BC00053_A145UsuarioTecnicoEmail2 ;
   private String[] BC00053_A146UsuarioTecnicoEmailNombre1 ;
   private String[] BC00053_A147UsuarioTecnicoEmailNombre2 ;
   private String[] BC00053_A148UsuarioRutTipo ;
   private String[] BC00053_A149UsuarioFacDireccion ;
   private String[] BC00053_A150UsuarioFacLocalidad ;
   private String[] BC00053_A151UsuarioFacDepartamento ;
   private String[] BC00053_A152UsuarioFacEmailEnvio ;
   private String[] BC00053_A153UsuarioCobranzaCelular1 ;
   private String[] BC00053_A154UsuarioCobranzaCelular2 ;
   private String[] BC00053_A155UsuarioCobranzaCelularNombre1 ;
   private String[] BC00053_A156UsuarioCobranzaCelularNombre2 ;
   private String[] BC00053_A157UsuarioCobranzaTelefono1 ;
   private String[] BC00053_A158UsuarioCobranzaTelefono2 ;
   private String[] BC00053_A159UsuarioCobranzaTelefonoNombre1 ;
   private String[] BC00053_A160UsuarioCobranzaTelefonoNombre2 ;
   private String[] BC00053_A161UsuarioCobranzaEmail1 ;
   private String[] BC00053_A162UsuarioCobranzaEmail2 ;
   private String[] BC00053_A163UsuarioCobranzaEmailNombre1 ;
   private String[] BC00053_A164UsuarioCobranzaEmailNombre2 ;
   private String[] BC00053_A165UsuarioCedula ;
   private boolean[] BC00052_n114UsuarioEmail ;
   private boolean[] BC00052_n115UsuarioUsuarioWeb ;
   private boolean[] BC00052_n116UsuarioNombre ;
   private boolean[] BC00052_n117UsuarioDicose ;
   private boolean[] BC00052_n118UsuarioRazonSocial ;
   private boolean[] BC00052_n119UsuarioRut ;
   private boolean[] BC00052_n120UsuarioIdNet ;
   private boolean[] BC00052_n121UsuarioDireccion ;
   private boolean[] BC00052_n122UsuarioTipousuario ;
   private boolean[] BC00052_n123UsuarioIdTecnico1 ;
   private boolean[] BC00052_n124UsuarioIdTecnico2 ;
   private boolean[] BC00052_n125UsuarioIdTecnico3 ;
   private boolean[] BC00052_n126UsuarioDireccionFrasco ;
   private boolean[] BC00052_n127UsuarioAgenciaFrasco ;
   private boolean[] BC00052_n128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00052_n129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00052_n130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00052_n131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00052_n132UsuarioNotificacionResultado1 ;
   private boolean[] BC00052_n133UsuarioNotificacionResultado2 ;
   private boolean[] BC00052_n134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00052_n135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00052_n136UsuarioTecnicoCelular1 ;
   private boolean[] BC00052_n137UsuarioTecnicoCelular2 ;
   private boolean[] BC00052_n138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00052_n139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00052_n140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00052_n141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00052_n142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00052_n143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00052_n144UsuarioTecnicoEmail1 ;
   private boolean[] BC00052_n145UsuarioTecnicoEmail2 ;
   private boolean[] BC00052_n146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00052_n147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00052_n148UsuarioRutTipo ;
   private boolean[] BC00052_n149UsuarioFacDireccion ;
   private boolean[] BC00052_n150UsuarioFacLocalidad ;
   private boolean[] BC00052_n151UsuarioFacDepartamento ;
   private boolean[] BC00052_n152UsuarioFacEmailEnvio ;
   private boolean[] BC00052_n153UsuarioCobranzaCelular1 ;
   private boolean[] BC00052_n154UsuarioCobranzaCelular2 ;
   private boolean[] BC00052_n155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00052_n156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00052_n157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00052_n158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00052_n159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00052_n160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00052_n161UsuarioCobranzaEmail1 ;
   private boolean[] BC00052_n162UsuarioCobranzaEmail2 ;
   private boolean[] BC00052_n163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00052_n164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00052_n165UsuarioCedula ;
   private boolean[] BC00053_n114UsuarioEmail ;
   private boolean[] BC00053_n115UsuarioUsuarioWeb ;
   private boolean[] BC00053_n116UsuarioNombre ;
   private boolean[] BC00053_n117UsuarioDicose ;
   private boolean[] BC00053_n118UsuarioRazonSocial ;
   private boolean[] BC00053_n119UsuarioRut ;
   private boolean[] BC00053_n120UsuarioIdNet ;
   private boolean[] BC00053_n121UsuarioDireccion ;
   private boolean[] BC00053_n122UsuarioTipousuario ;
   private boolean[] BC00053_n123UsuarioIdTecnico1 ;
   private boolean[] BC00053_n124UsuarioIdTecnico2 ;
   private boolean[] BC00053_n125UsuarioIdTecnico3 ;
   private boolean[] BC00053_n126UsuarioDireccionFrasco ;
   private boolean[] BC00053_n127UsuarioAgenciaFrasco ;
   private boolean[] BC00053_n128UsuarioNotificacionFrasco1 ;
   private boolean[] BC00053_n129UsuarioNotificacionFrasco2 ;
   private boolean[] BC00053_n130UsuarioNotificacionSolicitud1 ;
   private boolean[] BC00053_n131UsuarioNotificacionSolicitud2 ;
   private boolean[] BC00053_n132UsuarioNotificacionResultado1 ;
   private boolean[] BC00053_n133UsuarioNotificacionResultado2 ;
   private boolean[] BC00053_n134UsuarioNotificacionAvisos1 ;
   private boolean[] BC00053_n135UsuarioNotificacionAvisos2 ;
   private boolean[] BC00053_n136UsuarioTecnicoCelular1 ;
   private boolean[] BC00053_n137UsuarioTecnicoCelular2 ;
   private boolean[] BC00053_n138UsuarioTecnicoCelularNombre1 ;
   private boolean[] BC00053_n139UsuarioTecnicoCelularNombre2 ;
   private boolean[] BC00053_n140UsuarioTecnicoTelefono1 ;
   private boolean[] BC00053_n141UsuarioTecnicoTelefono2 ;
   private boolean[] BC00053_n142UsuarioTecnicoTelefonoNombre1 ;
   private boolean[] BC00053_n143UsuarioTecnicoTelefonoNombre2 ;
   private boolean[] BC00053_n144UsuarioTecnicoEmail1 ;
   private boolean[] BC00053_n145UsuarioTecnicoEmail2 ;
   private boolean[] BC00053_n146UsuarioTecnicoEmailNombre1 ;
   private boolean[] BC00053_n147UsuarioTecnicoEmailNombre2 ;
   private boolean[] BC00053_n148UsuarioRutTipo ;
   private boolean[] BC00053_n149UsuarioFacDireccion ;
   private boolean[] BC00053_n150UsuarioFacLocalidad ;
   private boolean[] BC00053_n151UsuarioFacDepartamento ;
   private boolean[] BC00053_n152UsuarioFacEmailEnvio ;
   private boolean[] BC00053_n153UsuarioCobranzaCelular1 ;
   private boolean[] BC00053_n154UsuarioCobranzaCelular2 ;
   private boolean[] BC00053_n155UsuarioCobranzaCelularNombre1 ;
   private boolean[] BC00053_n156UsuarioCobranzaCelularNombre2 ;
   private boolean[] BC00053_n157UsuarioCobranzaTelefono1 ;
   private boolean[] BC00053_n158UsuarioCobranzaTelefono2 ;
   private boolean[] BC00053_n159UsuarioCobranzaTelefonoNombre1 ;
   private boolean[] BC00053_n160UsuarioCobranzaTelefonoNombre2 ;
   private boolean[] BC00053_n161UsuarioCobranzaEmail1 ;
   private boolean[] BC00053_n162UsuarioCobranzaEmail2 ;
   private boolean[] BC00053_n163UsuarioCobranzaEmailNombre1 ;
   private boolean[] BC00053_n164UsuarioCobranzaEmailNombre2 ;
   private boolean[] BC00053_n165UsuarioCedula ;
}

final  class usuario_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class usuario_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00052", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00053", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00054", "SELECT TM1.`UsuarioId`, TM1.`UsuarioEmail`, TM1.`UsuarioUsuarioWeb`, TM1.`UsuarioNombre`, TM1.`UsuarioDicose`, TM1.`UsuarioRazonSocial`, TM1.`UsuarioRut`, TM1.`UsuarioIdNet`, TM1.`UsuarioDireccion`, TM1.`UsuarioTipousuario`, TM1.`UsuarioIdTecnico1`, TM1.`UsuarioIdTecnico2`, TM1.`UsuarioIdTecnico3`, TM1.`UsuarioDireccionFrasco`, TM1.`UsuarioAgenciaFrasco`, TM1.`UsuarioNotificacionFrasco1`, TM1.`UsuarioNotificacionFrasco2`, TM1.`UsuarioNotificacionSolicitud1`, TM1.`UsuarioNotificacionSolicitud2`, TM1.`UsuarioNotificacionResultado1`, TM1.`UsuarioNotificacionResultado2`, TM1.`UsuarioNotificacionAvisos1`, TM1.`UsuarioNotificacionAvisos2`, TM1.`UsuarioTecnicoCelular1`, TM1.`UsuarioTecnicoCelular2`, TM1.`UsuarioTecnicoCelularNombre1`, TM1.`UsuarioTecnicoCelularNombre2`, TM1.`UsuarioTecnicoTelefono1`, TM1.`UsuarioTecnicoTelefono2`, TM1.`UsuarioTecnicoTelefonoNombre1`, TM1.`UsuarioTecnicoTelefonoNombre2`, TM1.`UsuarioTecnicoEmail1`, TM1.`UsuarioTecnicoEmail2`, TM1.`UsuarioTecnicoEmailNombre1`, TM1.`UsuarioTecnicoEmailNombre2`, TM1.`UsuarioRutTipo`, TM1.`UsuarioFacDireccion`, TM1.`UsuarioFacLocalidad`, TM1.`UsuarioFacDepartamento`, TM1.`UsuarioFacEmailEnvio`, TM1.`UsuarioCobranzaCelular1`, TM1.`UsuarioCobranzaCelular2`, TM1.`UsuarioCobranzaCelularNombre1`, TM1.`UsuarioCobranzaCelularNombre2`, TM1.`UsuarioCobranzaTelefono1`, TM1.`UsuarioCobranzaTelefono2`, TM1.`UsuarioCobranzaTelefonoNombre1`, TM1.`UsuarioCobranzaTelefonoNombre2`, TM1.`UsuarioCobranzaEmail1`, TM1.`UsuarioCobranzaEmail2`, TM1.`UsuarioCobranzaEmailNombre1`, TM1.`UsuarioCobranzaEmailNombre2`, TM1.`UsuarioCedula` FROM `Usuario` TM1 ORDER BY TM1.`UsuarioId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00055", "SELECT TM1.`UsuarioId`, TM1.`UsuarioEmail`, TM1.`UsuarioUsuarioWeb`, TM1.`UsuarioNombre`, TM1.`UsuarioDicose`, TM1.`UsuarioRazonSocial`, TM1.`UsuarioRut`, TM1.`UsuarioIdNet`, TM1.`UsuarioDireccion`, TM1.`UsuarioTipousuario`, TM1.`UsuarioIdTecnico1`, TM1.`UsuarioIdTecnico2`, TM1.`UsuarioIdTecnico3`, TM1.`UsuarioDireccionFrasco`, TM1.`UsuarioAgenciaFrasco`, TM1.`UsuarioNotificacionFrasco1`, TM1.`UsuarioNotificacionFrasco2`, TM1.`UsuarioNotificacionSolicitud1`, TM1.`UsuarioNotificacionSolicitud2`, TM1.`UsuarioNotificacionResultado1`, TM1.`UsuarioNotificacionResultado2`, TM1.`UsuarioNotificacionAvisos1`, TM1.`UsuarioNotificacionAvisos2`, TM1.`UsuarioTecnicoCelular1`, TM1.`UsuarioTecnicoCelular2`, TM1.`UsuarioTecnicoCelularNombre1`, TM1.`UsuarioTecnicoCelularNombre2`, TM1.`UsuarioTecnicoTelefono1`, TM1.`UsuarioTecnicoTelefono2`, TM1.`UsuarioTecnicoTelefonoNombre1`, TM1.`UsuarioTecnicoTelefonoNombre2`, TM1.`UsuarioTecnicoEmail1`, TM1.`UsuarioTecnicoEmail2`, TM1.`UsuarioTecnicoEmailNombre1`, TM1.`UsuarioTecnicoEmailNombre2`, TM1.`UsuarioRutTipo`, TM1.`UsuarioFacDireccion`, TM1.`UsuarioFacLocalidad`, TM1.`UsuarioFacDepartamento`, TM1.`UsuarioFacEmailEnvio`, TM1.`UsuarioCobranzaCelular1`, TM1.`UsuarioCobranzaCelular2`, TM1.`UsuarioCobranzaCelularNombre1`, TM1.`UsuarioCobranzaCelularNombre2`, TM1.`UsuarioCobranzaTelefono1`, TM1.`UsuarioCobranzaTelefono2`, TM1.`UsuarioCobranzaTelefonoNombre1`, TM1.`UsuarioCobranzaTelefonoNombre2`, TM1.`UsuarioCobranzaEmail1`, TM1.`UsuarioCobranzaEmail2`, TM1.`UsuarioCobranzaEmailNombre1`, TM1.`UsuarioCobranzaEmailNombre2`, TM1.`UsuarioCedula` FROM `Usuario` TM1 WHERE TM1.`UsuarioId` = ? ORDER BY TM1.`UsuarioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00056", "SELECT `UsuarioId` FROM `Usuario` WHERE `UsuarioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00057", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00058", "SELECT `UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula` FROM `Usuario` WHERE `UsuarioId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00059", "INSERT INTO `Usuario`(`UsuarioId`, `UsuarioEmail`, `UsuarioUsuarioWeb`, `UsuarioNombre`, `UsuarioDicose`, `UsuarioRazonSocial`, `UsuarioRut`, `UsuarioIdNet`, `UsuarioDireccion`, `UsuarioTipousuario`, `UsuarioIdTecnico1`, `UsuarioIdTecnico2`, `UsuarioIdTecnico3`, `UsuarioDireccionFrasco`, `UsuarioAgenciaFrasco`, `UsuarioNotificacionFrasco1`, `UsuarioNotificacionFrasco2`, `UsuarioNotificacionSolicitud1`, `UsuarioNotificacionSolicitud2`, `UsuarioNotificacionResultado1`, `UsuarioNotificacionResultado2`, `UsuarioNotificacionAvisos1`, `UsuarioNotificacionAvisos2`, `UsuarioTecnicoCelular1`, `UsuarioTecnicoCelular2`, `UsuarioTecnicoCelularNombre1`, `UsuarioTecnicoCelularNombre2`, `UsuarioTecnicoTelefono1`, `UsuarioTecnicoTelefono2`, `UsuarioTecnicoTelefonoNombre1`, `UsuarioTecnicoTelefonoNombre2`, `UsuarioTecnicoEmail1`, `UsuarioTecnicoEmail2`, `UsuarioTecnicoEmailNombre1`, `UsuarioTecnicoEmailNombre2`, `UsuarioRutTipo`, `UsuarioFacDireccion`, `UsuarioFacLocalidad`, `UsuarioFacDepartamento`, `UsuarioFacEmailEnvio`, `UsuarioCobranzaCelular1`, `UsuarioCobranzaCelular2`, `UsuarioCobranzaCelularNombre1`, `UsuarioCobranzaCelularNombre2`, `UsuarioCobranzaTelefono1`, `UsuarioCobranzaTelefono2`, `UsuarioCobranzaTelefonoNombre1`, `UsuarioCobranzaTelefonoNombre2`, `UsuarioCobranzaEmail1`, `UsuarioCobranzaEmail2`, `UsuarioCobranzaEmailNombre1`, `UsuarioCobranzaEmailNombre2`, `UsuarioCedula`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000510", "UPDATE `Usuario` SET `UsuarioEmail`=?, `UsuarioUsuarioWeb`=?, `UsuarioNombre`=?, `UsuarioDicose`=?, `UsuarioRazonSocial`=?, `UsuarioRut`=?, `UsuarioIdNet`=?, `UsuarioDireccion`=?, `UsuarioTipousuario`=?, `UsuarioIdTecnico1`=?, `UsuarioIdTecnico2`=?, `UsuarioIdTecnico3`=?, `UsuarioDireccionFrasco`=?, `UsuarioAgenciaFrasco`=?, `UsuarioNotificacionFrasco1`=?, `UsuarioNotificacionFrasco2`=?, `UsuarioNotificacionSolicitud1`=?, `UsuarioNotificacionSolicitud2`=?, `UsuarioNotificacionResultado1`=?, `UsuarioNotificacionResultado2`=?, `UsuarioNotificacionAvisos1`=?, `UsuarioNotificacionAvisos2`=?, `UsuarioTecnicoCelular1`=?, `UsuarioTecnicoCelular2`=?, `UsuarioTecnicoCelularNombre1`=?, `UsuarioTecnicoCelularNombre2`=?, `UsuarioTecnicoTelefono1`=?, `UsuarioTecnicoTelefono2`=?, `UsuarioTecnicoTelefonoNombre1`=?, `UsuarioTecnicoTelefonoNombre2`=?, `UsuarioTecnicoEmail1`=?, `UsuarioTecnicoEmail2`=?, `UsuarioTecnicoEmailNombre1`=?, `UsuarioTecnicoEmailNombre2`=?, `UsuarioRutTipo`=?, `UsuarioFacDireccion`=?, `UsuarioFacLocalidad`=?, `UsuarioFacDepartamento`=?, `UsuarioFacEmailEnvio`=?, `UsuarioCobranzaCelular1`=?, `UsuarioCobranzaCelular2`=?, `UsuarioCobranzaCelularNombre1`=?, `UsuarioCobranzaCelularNombre2`=?, `UsuarioCobranzaTelefono1`=?, `UsuarioCobranzaTelefono2`=?, `UsuarioCobranzaTelefonoNombre1`=?, `UsuarioCobranzaTelefonoNombre2`=?, `UsuarioCobranzaEmail1`=?, `UsuarioCobranzaEmail2`=?, `UsuarioCobranzaEmailNombre1`=?, `UsuarioCobranzaEmailNombre2`=?, `UsuarioCedula`=?  WHERE `UsuarioId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000511", "DELETE FROM `Usuario`  WHERE `UsuarioId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000512", "SELECT TM1.`UsuarioId`, TM1.`UsuarioEmail`, TM1.`UsuarioUsuarioWeb`, TM1.`UsuarioNombre`, TM1.`UsuarioDicose`, TM1.`UsuarioRazonSocial`, TM1.`UsuarioRut`, TM1.`UsuarioIdNet`, TM1.`UsuarioDireccion`, TM1.`UsuarioTipousuario`, TM1.`UsuarioIdTecnico1`, TM1.`UsuarioIdTecnico2`, TM1.`UsuarioIdTecnico3`, TM1.`UsuarioDireccionFrasco`, TM1.`UsuarioAgenciaFrasco`, TM1.`UsuarioNotificacionFrasco1`, TM1.`UsuarioNotificacionFrasco2`, TM1.`UsuarioNotificacionSolicitud1`, TM1.`UsuarioNotificacionSolicitud2`, TM1.`UsuarioNotificacionResultado1`, TM1.`UsuarioNotificacionResultado2`, TM1.`UsuarioNotificacionAvisos1`, TM1.`UsuarioNotificacionAvisos2`, TM1.`UsuarioTecnicoCelular1`, TM1.`UsuarioTecnicoCelular2`, TM1.`UsuarioTecnicoCelularNombre1`, TM1.`UsuarioTecnicoCelularNombre2`, TM1.`UsuarioTecnicoTelefono1`, TM1.`UsuarioTecnicoTelefono2`, TM1.`UsuarioTecnicoTelefonoNombre1`, TM1.`UsuarioTecnicoTelefonoNombre2`, TM1.`UsuarioTecnicoEmail1`, TM1.`UsuarioTecnicoEmail2`, TM1.`UsuarioTecnicoEmailNombre1`, TM1.`UsuarioTecnicoEmailNombre2`, TM1.`UsuarioRutTipo`, TM1.`UsuarioFacDireccion`, TM1.`UsuarioFacLocalidad`, TM1.`UsuarioFacDepartamento`, TM1.`UsuarioFacEmailEnvio`, TM1.`UsuarioCobranzaCelular1`, TM1.`UsuarioCobranzaCelular2`, TM1.`UsuarioCobranzaCelularNombre1`, TM1.`UsuarioCobranzaCelularNombre2`, TM1.`UsuarioCobranzaTelefono1`, TM1.`UsuarioCobranzaTelefono2`, TM1.`UsuarioCobranzaTelefonoNombre1`, TM1.`UsuarioCobranzaTelefonoNombre2`, TM1.`UsuarioCobranzaEmail1`, TM1.`UsuarioCobranzaEmail2`, TM1.`UsuarioCobranzaEmailNombre1`, TM1.`UsuarioCobranzaEmailNombre2`, TM1.`UsuarioCedula` FROM `Usuario` TM1 WHERE TM1.`UsuarioId` = ? ORDER BY TM1.`UsuarioId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
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
            case 6 :
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
            case 10 :
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 100);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[14]).longValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[20]).longValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[22]).longValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[24]).longValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 300);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 40);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 40);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 40);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 100);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 100);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 100);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 100);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 100);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[56], 100);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[58], 100);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[60], 100);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[62], 100);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[64], 100);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[66], 100);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[68], 100);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 40);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[72], 200);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[74], 40);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[76], 40);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[78], 100);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[80], 100);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[82], 100);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[84], 100);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[86], 100);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[88], 100);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[90], 100);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[92], 100);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[94], 100);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[96], 100);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[98], 100);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[100], 100);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[102], 100);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(53, (String)parms[104], 40);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 300);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 40);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 100);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 100);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 100);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 100);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 100);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 100);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 100);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 100);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[61], 100);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 100);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[65], 100);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 100);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 40);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 200);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[73], 40);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 40);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[77], 100);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[79], 100);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[81], 100);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[83], 100);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 100);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[87], 100);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[89], 100);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[91], 100);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[93], 100);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[95], 100);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[97], 100);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[99], 100);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[101], 100);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[103], 40);
               }
               stmt.setLong(53, ((Number) parms[104]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

