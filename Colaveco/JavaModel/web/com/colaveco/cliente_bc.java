package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cliente_bc extends GXWebPanel implements IGxSilentTrn
{
   public cliente_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cliente_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cliente_bc.class ));
   }

   public cliente_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow044( ) ;
      standaloneNotModal( ) ;
      initializeNonKey044( ) ;
      standaloneModal( ) ;
      addRow044( ) ;
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
            Z4ClienteId = A4ClienteId ;
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

   public void confirm_040( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls044( ) ;
         }
         else
         {
            checkExtendedTable044( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors044( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z45ClienteNombre = A45ClienteNombre ;
         Z46ClienteEmail = A46ClienteEmail ;
         Z47ClienteNombreEmail1 = A47ClienteNombreEmail1 ;
         Z48ClienteEmail1 = A48ClienteEmail1 ;
         Z49ClienteNombreEmail2 = A49ClienteNombreEmail2 ;
         Z50ClienteEmail2 = A50ClienteEmail2 ;
         Z51ClienteEnvio = A51ClienteEnvio ;
         Z52ClienteUsuarioWeb = A52ClienteUsuarioWeb ;
         Z53ClienteNombreCelular1 = A53ClienteNombreCelular1 ;
         Z54ClienteCelular1 = A54ClienteCelular1 ;
         Z55ClienteNombreCelular2 = A55ClienteNombreCelular2 ;
         Z56ClienteCelular2 = A56ClienteCelular2 ;
         Z57ClienteCodigoFigaro = A57ClienteCodigoFigaro ;
         Z58ClienteTipoUsuario = A58ClienteTipoUsuario ;
         Z59ClienteDireccion = A59ClienteDireccion ;
         Z60ClienteNombreTelefono1 = A60ClienteNombreTelefono1 ;
         Z61ClienteTelefono1 = A61ClienteTelefono1 ;
         Z62ClienteNombreTelefono2 = A62ClienteNombreTelefono2 ;
         Z63ClienteTelefono2 = A63ClienteTelefono2 ;
         Z64ClienteFax = A64ClienteFax ;
         Z65ClienteDicose = A65ClienteDicose ;
         Z66ClienteIdDepartamento = A66ClienteIdDepartamento ;
         Z67ClienteIdLocalidad = A67ClienteIdLocalidad ;
         Z68ClienteTecnico1 = A68ClienteTecnico1 ;
         Z69ClienteTecnico2 = A69ClienteTecnico2 ;
         Z70ClienteIdAgencia = A70ClienteIdAgencia ;
         Z71ClienteContrato = A71ClienteContrato ;
         Z72ClienteSocio = A72ClienteSocio ;
         Z73ClienteNoUsar = A73ClienteNoUsar ;
         Z74ClienteCodbar = A74ClienteCodbar ;
         Z75ClienteCaravanas = A75ClienteCaravanas ;
         Z76ClienteProlesa = A76ClienteProlesa ;
         Z77ClienteProlesaSuc = A77ClienteProlesaSuc ;
         Z168ClienteProlesaMat = A168ClienteProlesaMat ;
         Z78ClienteObservaciones = A78ClienteObservaciones ;
         Z79ClienteFacRsocial = A79ClienteFacRsocial ;
         Z80ClienteFacCedula = A80ClienteFacCedula ;
         Z81ClienteFacRut = A81ClienteFacRut ;
         Z82ClienteFacDireccion = A82ClienteFacDireccion ;
         Z83ClienteFacLocalidad = A83ClienteFacLocalidad ;
         Z84ClienteFacDepartamento = A84ClienteFacDepartamento ;
         Z85ClienteFacCpostal = A85ClienteFacCpostal ;
         Z86ClienteFacGiro = A86ClienteFacGiro ;
         Z87ClienteCobNombreTelefono1 = A87ClienteCobNombreTelefono1 ;
         Z88ClienteFacTelefonos = A88ClienteFacTelefonos ;
         Z89ClienteCobNombreTelefono2 = A89ClienteCobNombreTelefono2 ;
         Z90ClienteCobTelefono2 = A90ClienteCobTelefono2 ;
         Z91ClienteCobNombreCelular1 = A91ClienteCobNombreCelular1 ;
         Z92ClienteCobCelular1 = A92ClienteCobCelular1 ;
         Z93ClienteCobNombreCelular2 = A93ClienteCobNombreCelular2 ;
         Z94ClienteCobCelular2 = A94ClienteCobCelular2 ;
         Z95ClienteCobNombreEmail1 = A95ClienteCobNombreEmail1 ;
         Z96ClienteCobEmail1 = A96ClienteCobEmail1 ;
         Z97ClienteCobNombreEmail2 = A97ClienteCobNombreEmail2 ;
         Z98ClienteCobEmail2 = A98ClienteCobEmail2 ;
         Z99ClienteFacFax = A99ClienteFacFax ;
         Z100ClienteFacEmail = A100ClienteFacEmail ;
         Z101ClienteFacContrato = A101ClienteFacContrato ;
         Z102ClienteFacObservaciones = A102ClienteFacObservaciones ;
         Z103ClienteFacLista = A103ClienteFacLista ;
         Z104ClienteFacContado = A104ClienteFacContado ;
         Z105ClienteNotEmailFrascos1 = A105ClienteNotEmailFrascos1 ;
         Z106ClienteNotEmailFrascos2 = A106ClienteNotEmailFrascos2 ;
         Z107ClienteNotEmailMuestra1 = A107ClienteNotEmailMuestra1 ;
         Z108ClienteNotEmailMuestra2 = A108ClienteNotEmailMuestra2 ;
         Z109ClienteNotEmailAnalisis1 = A109ClienteNotEmailAnalisis1 ;
         Z110ClienteNotEmailAnalisis2 = A110ClienteNotEmailAnalisis2 ;
         Z111ClienteNotEmailGeneral1 = A111ClienteNotEmailGeneral1 ;
         Z112ClienteNotEmailGeneral2 = A112ClienteNotEmailGeneral2 ;
         Z113ClienteIncobrable = A113ClienteIncobrable ;
      }
      if ( GX_JID == -1 )
      {
         Z4ClienteId = A4ClienteId ;
         Z45ClienteNombre = A45ClienteNombre ;
         Z46ClienteEmail = A46ClienteEmail ;
         Z47ClienteNombreEmail1 = A47ClienteNombreEmail1 ;
         Z48ClienteEmail1 = A48ClienteEmail1 ;
         Z49ClienteNombreEmail2 = A49ClienteNombreEmail2 ;
         Z50ClienteEmail2 = A50ClienteEmail2 ;
         Z51ClienteEnvio = A51ClienteEnvio ;
         Z52ClienteUsuarioWeb = A52ClienteUsuarioWeb ;
         Z53ClienteNombreCelular1 = A53ClienteNombreCelular1 ;
         Z54ClienteCelular1 = A54ClienteCelular1 ;
         Z55ClienteNombreCelular2 = A55ClienteNombreCelular2 ;
         Z56ClienteCelular2 = A56ClienteCelular2 ;
         Z57ClienteCodigoFigaro = A57ClienteCodigoFigaro ;
         Z58ClienteTipoUsuario = A58ClienteTipoUsuario ;
         Z59ClienteDireccion = A59ClienteDireccion ;
         Z60ClienteNombreTelefono1 = A60ClienteNombreTelefono1 ;
         Z61ClienteTelefono1 = A61ClienteTelefono1 ;
         Z62ClienteNombreTelefono2 = A62ClienteNombreTelefono2 ;
         Z63ClienteTelefono2 = A63ClienteTelefono2 ;
         Z64ClienteFax = A64ClienteFax ;
         Z65ClienteDicose = A65ClienteDicose ;
         Z66ClienteIdDepartamento = A66ClienteIdDepartamento ;
         Z67ClienteIdLocalidad = A67ClienteIdLocalidad ;
         Z68ClienteTecnico1 = A68ClienteTecnico1 ;
         Z69ClienteTecnico2 = A69ClienteTecnico2 ;
         Z70ClienteIdAgencia = A70ClienteIdAgencia ;
         Z71ClienteContrato = A71ClienteContrato ;
         Z72ClienteSocio = A72ClienteSocio ;
         Z73ClienteNoUsar = A73ClienteNoUsar ;
         Z74ClienteCodbar = A74ClienteCodbar ;
         Z75ClienteCaravanas = A75ClienteCaravanas ;
         Z76ClienteProlesa = A76ClienteProlesa ;
         Z77ClienteProlesaSuc = A77ClienteProlesaSuc ;
         Z168ClienteProlesaMat = A168ClienteProlesaMat ;
         Z78ClienteObservaciones = A78ClienteObservaciones ;
         Z79ClienteFacRsocial = A79ClienteFacRsocial ;
         Z80ClienteFacCedula = A80ClienteFacCedula ;
         Z81ClienteFacRut = A81ClienteFacRut ;
         Z82ClienteFacDireccion = A82ClienteFacDireccion ;
         Z83ClienteFacLocalidad = A83ClienteFacLocalidad ;
         Z84ClienteFacDepartamento = A84ClienteFacDepartamento ;
         Z85ClienteFacCpostal = A85ClienteFacCpostal ;
         Z86ClienteFacGiro = A86ClienteFacGiro ;
         Z87ClienteCobNombreTelefono1 = A87ClienteCobNombreTelefono1 ;
         Z88ClienteFacTelefonos = A88ClienteFacTelefonos ;
         Z89ClienteCobNombreTelefono2 = A89ClienteCobNombreTelefono2 ;
         Z90ClienteCobTelefono2 = A90ClienteCobTelefono2 ;
         Z91ClienteCobNombreCelular1 = A91ClienteCobNombreCelular1 ;
         Z92ClienteCobCelular1 = A92ClienteCobCelular1 ;
         Z93ClienteCobNombreCelular2 = A93ClienteCobNombreCelular2 ;
         Z94ClienteCobCelular2 = A94ClienteCobCelular2 ;
         Z95ClienteCobNombreEmail1 = A95ClienteCobNombreEmail1 ;
         Z96ClienteCobEmail1 = A96ClienteCobEmail1 ;
         Z97ClienteCobNombreEmail2 = A97ClienteCobNombreEmail2 ;
         Z98ClienteCobEmail2 = A98ClienteCobEmail2 ;
         Z99ClienteFacFax = A99ClienteFacFax ;
         Z100ClienteFacEmail = A100ClienteFacEmail ;
         Z101ClienteFacContrato = A101ClienteFacContrato ;
         Z102ClienteFacObservaciones = A102ClienteFacObservaciones ;
         Z103ClienteFacLista = A103ClienteFacLista ;
         Z104ClienteFacContado = A104ClienteFacContado ;
         Z105ClienteNotEmailFrascos1 = A105ClienteNotEmailFrascos1 ;
         Z106ClienteNotEmailFrascos2 = A106ClienteNotEmailFrascos2 ;
         Z107ClienteNotEmailMuestra1 = A107ClienteNotEmailMuestra1 ;
         Z108ClienteNotEmailMuestra2 = A108ClienteNotEmailMuestra2 ;
         Z109ClienteNotEmailAnalisis1 = A109ClienteNotEmailAnalisis1 ;
         Z110ClienteNotEmailAnalisis2 = A110ClienteNotEmailAnalisis2 ;
         Z111ClienteNotEmailGeneral1 = A111ClienteNotEmailGeneral1 ;
         Z112ClienteNotEmailGeneral2 = A112ClienteNotEmailGeneral2 ;
         Z113ClienteIncobrable = A113ClienteIncobrable ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load044( )
   {
      /* Using cursor BC00044 */
      pr_default.execute(2, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A45ClienteNombre = BC00044_A45ClienteNombre[0] ;
         n45ClienteNombre = BC00044_n45ClienteNombre[0] ;
         A46ClienteEmail = BC00044_A46ClienteEmail[0] ;
         n46ClienteEmail = BC00044_n46ClienteEmail[0] ;
         A47ClienteNombreEmail1 = BC00044_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = BC00044_n47ClienteNombreEmail1[0] ;
         A48ClienteEmail1 = BC00044_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = BC00044_n48ClienteEmail1[0] ;
         A49ClienteNombreEmail2 = BC00044_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = BC00044_n49ClienteNombreEmail2[0] ;
         A50ClienteEmail2 = BC00044_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = BC00044_n50ClienteEmail2[0] ;
         A51ClienteEnvio = BC00044_A51ClienteEnvio[0] ;
         n51ClienteEnvio = BC00044_n51ClienteEnvio[0] ;
         A52ClienteUsuarioWeb = BC00044_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = BC00044_n52ClienteUsuarioWeb[0] ;
         A53ClienteNombreCelular1 = BC00044_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = BC00044_n53ClienteNombreCelular1[0] ;
         A54ClienteCelular1 = BC00044_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = BC00044_n54ClienteCelular1[0] ;
         A55ClienteNombreCelular2 = BC00044_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = BC00044_n55ClienteNombreCelular2[0] ;
         A56ClienteCelular2 = BC00044_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = BC00044_n56ClienteCelular2[0] ;
         A57ClienteCodigoFigaro = BC00044_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = BC00044_n57ClienteCodigoFigaro[0] ;
         A58ClienteTipoUsuario = BC00044_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = BC00044_n58ClienteTipoUsuario[0] ;
         A59ClienteDireccion = BC00044_A59ClienteDireccion[0] ;
         n59ClienteDireccion = BC00044_n59ClienteDireccion[0] ;
         A60ClienteNombreTelefono1 = BC00044_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = BC00044_n60ClienteNombreTelefono1[0] ;
         A61ClienteTelefono1 = BC00044_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = BC00044_n61ClienteTelefono1[0] ;
         A62ClienteNombreTelefono2 = BC00044_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = BC00044_n62ClienteNombreTelefono2[0] ;
         A63ClienteTelefono2 = BC00044_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = BC00044_n63ClienteTelefono2[0] ;
         A64ClienteFax = BC00044_A64ClienteFax[0] ;
         n64ClienteFax = BC00044_n64ClienteFax[0] ;
         A65ClienteDicose = BC00044_A65ClienteDicose[0] ;
         n65ClienteDicose = BC00044_n65ClienteDicose[0] ;
         A66ClienteIdDepartamento = BC00044_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = BC00044_n66ClienteIdDepartamento[0] ;
         A67ClienteIdLocalidad = BC00044_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = BC00044_n67ClienteIdLocalidad[0] ;
         A68ClienteTecnico1 = BC00044_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = BC00044_n68ClienteTecnico1[0] ;
         A69ClienteTecnico2 = BC00044_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = BC00044_n69ClienteTecnico2[0] ;
         A70ClienteIdAgencia = BC00044_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = BC00044_n70ClienteIdAgencia[0] ;
         A71ClienteContrato = BC00044_A71ClienteContrato[0] ;
         n71ClienteContrato = BC00044_n71ClienteContrato[0] ;
         A72ClienteSocio = BC00044_A72ClienteSocio[0] ;
         n72ClienteSocio = BC00044_n72ClienteSocio[0] ;
         A73ClienteNoUsar = BC00044_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = BC00044_n73ClienteNoUsar[0] ;
         A74ClienteCodbar = BC00044_A74ClienteCodbar[0] ;
         n74ClienteCodbar = BC00044_n74ClienteCodbar[0] ;
         A75ClienteCaravanas = BC00044_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = BC00044_n75ClienteCaravanas[0] ;
         A76ClienteProlesa = BC00044_A76ClienteProlesa[0] ;
         n76ClienteProlesa = BC00044_n76ClienteProlesa[0] ;
         A77ClienteProlesaSuc = BC00044_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = BC00044_n77ClienteProlesaSuc[0] ;
         A168ClienteProlesaMat = BC00044_A168ClienteProlesaMat[0] ;
         A78ClienteObservaciones = BC00044_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = BC00044_n78ClienteObservaciones[0] ;
         A79ClienteFacRsocial = BC00044_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = BC00044_n79ClienteFacRsocial[0] ;
         A80ClienteFacCedula = BC00044_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = BC00044_n80ClienteFacCedula[0] ;
         A81ClienteFacRut = BC00044_A81ClienteFacRut[0] ;
         n81ClienteFacRut = BC00044_n81ClienteFacRut[0] ;
         A82ClienteFacDireccion = BC00044_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = BC00044_n82ClienteFacDireccion[0] ;
         A83ClienteFacLocalidad = BC00044_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = BC00044_n83ClienteFacLocalidad[0] ;
         A84ClienteFacDepartamento = BC00044_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = BC00044_n84ClienteFacDepartamento[0] ;
         A85ClienteFacCpostal = BC00044_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = BC00044_n85ClienteFacCpostal[0] ;
         A86ClienteFacGiro = BC00044_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = BC00044_n86ClienteFacGiro[0] ;
         A87ClienteCobNombreTelefono1 = BC00044_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = BC00044_n87ClienteCobNombreTelefono1[0] ;
         A88ClienteFacTelefonos = BC00044_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = BC00044_n88ClienteFacTelefonos[0] ;
         A89ClienteCobNombreTelefono2 = BC00044_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = BC00044_n89ClienteCobNombreTelefono2[0] ;
         A90ClienteCobTelefono2 = BC00044_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = BC00044_n90ClienteCobTelefono2[0] ;
         A91ClienteCobNombreCelular1 = BC00044_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = BC00044_n91ClienteCobNombreCelular1[0] ;
         A92ClienteCobCelular1 = BC00044_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = BC00044_n92ClienteCobCelular1[0] ;
         A93ClienteCobNombreCelular2 = BC00044_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = BC00044_n93ClienteCobNombreCelular2[0] ;
         A94ClienteCobCelular2 = BC00044_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = BC00044_n94ClienteCobCelular2[0] ;
         A95ClienteCobNombreEmail1 = BC00044_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = BC00044_n95ClienteCobNombreEmail1[0] ;
         A96ClienteCobEmail1 = BC00044_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = BC00044_n96ClienteCobEmail1[0] ;
         A97ClienteCobNombreEmail2 = BC00044_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = BC00044_n97ClienteCobNombreEmail2[0] ;
         A98ClienteCobEmail2 = BC00044_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = BC00044_n98ClienteCobEmail2[0] ;
         A99ClienteFacFax = BC00044_A99ClienteFacFax[0] ;
         n99ClienteFacFax = BC00044_n99ClienteFacFax[0] ;
         A100ClienteFacEmail = BC00044_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = BC00044_n100ClienteFacEmail[0] ;
         A101ClienteFacContrato = BC00044_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = BC00044_n101ClienteFacContrato[0] ;
         A102ClienteFacObservaciones = BC00044_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = BC00044_n102ClienteFacObservaciones[0] ;
         A103ClienteFacLista = BC00044_A103ClienteFacLista[0] ;
         n103ClienteFacLista = BC00044_n103ClienteFacLista[0] ;
         A104ClienteFacContado = BC00044_A104ClienteFacContado[0] ;
         n104ClienteFacContado = BC00044_n104ClienteFacContado[0] ;
         A105ClienteNotEmailFrascos1 = BC00044_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = BC00044_n105ClienteNotEmailFrascos1[0] ;
         A106ClienteNotEmailFrascos2 = BC00044_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = BC00044_n106ClienteNotEmailFrascos2[0] ;
         A107ClienteNotEmailMuestra1 = BC00044_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = BC00044_n107ClienteNotEmailMuestra1[0] ;
         A108ClienteNotEmailMuestra2 = BC00044_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = BC00044_n108ClienteNotEmailMuestra2[0] ;
         A109ClienteNotEmailAnalisis1 = BC00044_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = BC00044_n109ClienteNotEmailAnalisis1[0] ;
         A110ClienteNotEmailAnalisis2 = BC00044_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = BC00044_n110ClienteNotEmailAnalisis2[0] ;
         A111ClienteNotEmailGeneral1 = BC00044_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = BC00044_n111ClienteNotEmailGeneral1[0] ;
         A112ClienteNotEmailGeneral2 = BC00044_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = BC00044_n112ClienteNotEmailGeneral2[0] ;
         A113ClienteIncobrable = BC00044_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = BC00044_n113ClienteIncobrable[0] ;
         zm044( -1) ;
      }
      pr_default.close(2);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      nIsDirty_4 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors044( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor BC00045 */
      pr_default.execute(3, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00046 */
      pr_default.execute(4, new Object[] {Long.valueOf(A4ClienteId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A4ClienteId = BC00046_A4ClienteId[0] ;
         A45ClienteNombre = BC00046_A45ClienteNombre[0] ;
         n45ClienteNombre = BC00046_n45ClienteNombre[0] ;
         A46ClienteEmail = BC00046_A46ClienteEmail[0] ;
         n46ClienteEmail = BC00046_n46ClienteEmail[0] ;
         A47ClienteNombreEmail1 = BC00046_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = BC00046_n47ClienteNombreEmail1[0] ;
         A48ClienteEmail1 = BC00046_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = BC00046_n48ClienteEmail1[0] ;
         A49ClienteNombreEmail2 = BC00046_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = BC00046_n49ClienteNombreEmail2[0] ;
         A50ClienteEmail2 = BC00046_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = BC00046_n50ClienteEmail2[0] ;
         A51ClienteEnvio = BC00046_A51ClienteEnvio[0] ;
         n51ClienteEnvio = BC00046_n51ClienteEnvio[0] ;
         A52ClienteUsuarioWeb = BC00046_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = BC00046_n52ClienteUsuarioWeb[0] ;
         A53ClienteNombreCelular1 = BC00046_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = BC00046_n53ClienteNombreCelular1[0] ;
         A54ClienteCelular1 = BC00046_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = BC00046_n54ClienteCelular1[0] ;
         A55ClienteNombreCelular2 = BC00046_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = BC00046_n55ClienteNombreCelular2[0] ;
         A56ClienteCelular2 = BC00046_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = BC00046_n56ClienteCelular2[0] ;
         A57ClienteCodigoFigaro = BC00046_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = BC00046_n57ClienteCodigoFigaro[0] ;
         A58ClienteTipoUsuario = BC00046_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = BC00046_n58ClienteTipoUsuario[0] ;
         A59ClienteDireccion = BC00046_A59ClienteDireccion[0] ;
         n59ClienteDireccion = BC00046_n59ClienteDireccion[0] ;
         A60ClienteNombreTelefono1 = BC00046_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = BC00046_n60ClienteNombreTelefono1[0] ;
         A61ClienteTelefono1 = BC00046_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = BC00046_n61ClienteTelefono1[0] ;
         A62ClienteNombreTelefono2 = BC00046_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = BC00046_n62ClienteNombreTelefono2[0] ;
         A63ClienteTelefono2 = BC00046_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = BC00046_n63ClienteTelefono2[0] ;
         A64ClienteFax = BC00046_A64ClienteFax[0] ;
         n64ClienteFax = BC00046_n64ClienteFax[0] ;
         A65ClienteDicose = BC00046_A65ClienteDicose[0] ;
         n65ClienteDicose = BC00046_n65ClienteDicose[0] ;
         A66ClienteIdDepartamento = BC00046_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = BC00046_n66ClienteIdDepartamento[0] ;
         A67ClienteIdLocalidad = BC00046_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = BC00046_n67ClienteIdLocalidad[0] ;
         A68ClienteTecnico1 = BC00046_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = BC00046_n68ClienteTecnico1[0] ;
         A69ClienteTecnico2 = BC00046_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = BC00046_n69ClienteTecnico2[0] ;
         A70ClienteIdAgencia = BC00046_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = BC00046_n70ClienteIdAgencia[0] ;
         A71ClienteContrato = BC00046_A71ClienteContrato[0] ;
         n71ClienteContrato = BC00046_n71ClienteContrato[0] ;
         A72ClienteSocio = BC00046_A72ClienteSocio[0] ;
         n72ClienteSocio = BC00046_n72ClienteSocio[0] ;
         A73ClienteNoUsar = BC00046_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = BC00046_n73ClienteNoUsar[0] ;
         A74ClienteCodbar = BC00046_A74ClienteCodbar[0] ;
         n74ClienteCodbar = BC00046_n74ClienteCodbar[0] ;
         A75ClienteCaravanas = BC00046_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = BC00046_n75ClienteCaravanas[0] ;
         A76ClienteProlesa = BC00046_A76ClienteProlesa[0] ;
         n76ClienteProlesa = BC00046_n76ClienteProlesa[0] ;
         A77ClienteProlesaSuc = BC00046_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = BC00046_n77ClienteProlesaSuc[0] ;
         A168ClienteProlesaMat = BC00046_A168ClienteProlesaMat[0] ;
         A78ClienteObservaciones = BC00046_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = BC00046_n78ClienteObservaciones[0] ;
         A79ClienteFacRsocial = BC00046_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = BC00046_n79ClienteFacRsocial[0] ;
         A80ClienteFacCedula = BC00046_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = BC00046_n80ClienteFacCedula[0] ;
         A81ClienteFacRut = BC00046_A81ClienteFacRut[0] ;
         n81ClienteFacRut = BC00046_n81ClienteFacRut[0] ;
         A82ClienteFacDireccion = BC00046_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = BC00046_n82ClienteFacDireccion[0] ;
         A83ClienteFacLocalidad = BC00046_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = BC00046_n83ClienteFacLocalidad[0] ;
         A84ClienteFacDepartamento = BC00046_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = BC00046_n84ClienteFacDepartamento[0] ;
         A85ClienteFacCpostal = BC00046_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = BC00046_n85ClienteFacCpostal[0] ;
         A86ClienteFacGiro = BC00046_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = BC00046_n86ClienteFacGiro[0] ;
         A87ClienteCobNombreTelefono1 = BC00046_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = BC00046_n87ClienteCobNombreTelefono1[0] ;
         A88ClienteFacTelefonos = BC00046_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = BC00046_n88ClienteFacTelefonos[0] ;
         A89ClienteCobNombreTelefono2 = BC00046_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = BC00046_n89ClienteCobNombreTelefono2[0] ;
         A90ClienteCobTelefono2 = BC00046_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = BC00046_n90ClienteCobTelefono2[0] ;
         A91ClienteCobNombreCelular1 = BC00046_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = BC00046_n91ClienteCobNombreCelular1[0] ;
         A92ClienteCobCelular1 = BC00046_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = BC00046_n92ClienteCobCelular1[0] ;
         A93ClienteCobNombreCelular2 = BC00046_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = BC00046_n93ClienteCobNombreCelular2[0] ;
         A94ClienteCobCelular2 = BC00046_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = BC00046_n94ClienteCobCelular2[0] ;
         A95ClienteCobNombreEmail1 = BC00046_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = BC00046_n95ClienteCobNombreEmail1[0] ;
         A96ClienteCobEmail1 = BC00046_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = BC00046_n96ClienteCobEmail1[0] ;
         A97ClienteCobNombreEmail2 = BC00046_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = BC00046_n97ClienteCobNombreEmail2[0] ;
         A98ClienteCobEmail2 = BC00046_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = BC00046_n98ClienteCobEmail2[0] ;
         A99ClienteFacFax = BC00046_A99ClienteFacFax[0] ;
         n99ClienteFacFax = BC00046_n99ClienteFacFax[0] ;
         A100ClienteFacEmail = BC00046_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = BC00046_n100ClienteFacEmail[0] ;
         A101ClienteFacContrato = BC00046_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = BC00046_n101ClienteFacContrato[0] ;
         A102ClienteFacObservaciones = BC00046_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = BC00046_n102ClienteFacObservaciones[0] ;
         A103ClienteFacLista = BC00046_A103ClienteFacLista[0] ;
         n103ClienteFacLista = BC00046_n103ClienteFacLista[0] ;
         A104ClienteFacContado = BC00046_A104ClienteFacContado[0] ;
         n104ClienteFacContado = BC00046_n104ClienteFacContado[0] ;
         A105ClienteNotEmailFrascos1 = BC00046_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = BC00046_n105ClienteNotEmailFrascos1[0] ;
         A106ClienteNotEmailFrascos2 = BC00046_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = BC00046_n106ClienteNotEmailFrascos2[0] ;
         A107ClienteNotEmailMuestra1 = BC00046_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = BC00046_n107ClienteNotEmailMuestra1[0] ;
         A108ClienteNotEmailMuestra2 = BC00046_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = BC00046_n108ClienteNotEmailMuestra2[0] ;
         A109ClienteNotEmailAnalisis1 = BC00046_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = BC00046_n109ClienteNotEmailAnalisis1[0] ;
         A110ClienteNotEmailAnalisis2 = BC00046_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = BC00046_n110ClienteNotEmailAnalisis2[0] ;
         A111ClienteNotEmailGeneral1 = BC00046_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = BC00046_n111ClienteNotEmailGeneral1[0] ;
         A112ClienteNotEmailGeneral2 = BC00046_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = BC00046_n112ClienteNotEmailGeneral2[0] ;
         A113ClienteIncobrable = BC00046_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = BC00046_n113ClienteIncobrable[0] ;
         Z4ClienteId = A4ClienteId ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
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
      confirm_040( ) ;
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

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00047 */
         pr_default.execute(5, new Object[] {Long.valueOf(A4ClienteId)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Cliente"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z45ClienteNombre, BC00047_A45ClienteNombre[0]) != 0 ) || ( GXutil.strcmp(Z46ClienteEmail, BC00047_A46ClienteEmail[0]) != 0 ) || ( GXutil.strcmp(Z47ClienteNombreEmail1, BC00047_A47ClienteNombreEmail1[0]) != 0 ) || ( GXutil.strcmp(Z48ClienteEmail1, BC00047_A48ClienteEmail1[0]) != 0 ) || ( GXutil.strcmp(Z49ClienteNombreEmail2, BC00047_A49ClienteNombreEmail2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z50ClienteEmail2, BC00047_A50ClienteEmail2[0]) != 0 ) || ( GXutil.strcmp(Z51ClienteEnvio, BC00047_A51ClienteEnvio[0]) != 0 ) || ( GXutil.strcmp(Z52ClienteUsuarioWeb, BC00047_A52ClienteUsuarioWeb[0]) != 0 ) || ( GXutil.strcmp(Z53ClienteNombreCelular1, BC00047_A53ClienteNombreCelular1[0]) != 0 ) || ( GXutil.strcmp(Z54ClienteCelular1, BC00047_A54ClienteCelular1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z55ClienteNombreCelular2, BC00047_A55ClienteNombreCelular2[0]) != 0 ) || ( GXutil.strcmp(Z56ClienteCelular2, BC00047_A56ClienteCelular2[0]) != 0 ) || ( GXutil.strcmp(Z57ClienteCodigoFigaro, BC00047_A57ClienteCodigoFigaro[0]) != 0 ) || ( Z58ClienteTipoUsuario != BC00047_A58ClienteTipoUsuario[0] ) || ( GXutil.strcmp(Z59ClienteDireccion, BC00047_A59ClienteDireccion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z60ClienteNombreTelefono1, BC00047_A60ClienteNombreTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z61ClienteTelefono1, BC00047_A61ClienteTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z62ClienteNombreTelefono2, BC00047_A62ClienteNombreTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z63ClienteTelefono2, BC00047_A63ClienteTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z64ClienteFax, BC00047_A64ClienteFax[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z65ClienteDicose, BC00047_A65ClienteDicose[0]) != 0 ) || ( Z66ClienteIdDepartamento != BC00047_A66ClienteIdDepartamento[0] ) || ( Z67ClienteIdLocalidad != BC00047_A67ClienteIdLocalidad[0] ) || ( Z68ClienteTecnico1 != BC00047_A68ClienteTecnico1[0] ) || ( Z69ClienteTecnico2 != BC00047_A69ClienteTecnico2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z70ClienteIdAgencia != BC00047_A70ClienteIdAgencia[0] ) || ( Z71ClienteContrato != BC00047_A71ClienteContrato[0] ) || ( Z72ClienteSocio != BC00047_A72ClienteSocio[0] ) || ( Z73ClienteNoUsar != BC00047_A73ClienteNoUsar[0] ) || ( Z74ClienteCodbar != BC00047_A74ClienteCodbar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z75ClienteCaravanas != BC00047_A75ClienteCaravanas[0] ) || ( Z76ClienteProlesa != BC00047_A76ClienteProlesa[0] ) || ( Z77ClienteProlesaSuc != BC00047_A77ClienteProlesaSuc[0] ) || ( Z168ClienteProlesaMat != BC00047_A168ClienteProlesaMat[0] ) || ( GXutil.strcmp(Z78ClienteObservaciones, BC00047_A78ClienteObservaciones[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z79ClienteFacRsocial, BC00047_A79ClienteFacRsocial[0]) != 0 ) || ( GXutil.strcmp(Z80ClienteFacCedula, BC00047_A80ClienteFacCedula[0]) != 0 ) || ( GXutil.strcmp(Z81ClienteFacRut, BC00047_A81ClienteFacRut[0]) != 0 ) || ( GXutil.strcmp(Z82ClienteFacDireccion, BC00047_A82ClienteFacDireccion[0]) != 0 ) || ( GXutil.strcmp(Z83ClienteFacLocalidad, BC00047_A83ClienteFacLocalidad[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z84ClienteFacDepartamento != BC00047_A84ClienteFacDepartamento[0] ) || ( GXutil.strcmp(Z85ClienteFacCpostal, BC00047_A85ClienteFacCpostal[0]) != 0 ) || ( Z86ClienteFacGiro != BC00047_A86ClienteFacGiro[0] ) || ( GXutil.strcmp(Z87ClienteCobNombreTelefono1, BC00047_A87ClienteCobNombreTelefono1[0]) != 0 ) || ( GXutil.strcmp(Z88ClienteFacTelefonos, BC00047_A88ClienteFacTelefonos[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z89ClienteCobNombreTelefono2, BC00047_A89ClienteCobNombreTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z90ClienteCobTelefono2, BC00047_A90ClienteCobTelefono2[0]) != 0 ) || ( GXutil.strcmp(Z91ClienteCobNombreCelular1, BC00047_A91ClienteCobNombreCelular1[0]) != 0 ) || ( GXutil.strcmp(Z92ClienteCobCelular1, BC00047_A92ClienteCobCelular1[0]) != 0 ) || ( GXutil.strcmp(Z93ClienteCobNombreCelular2, BC00047_A93ClienteCobNombreCelular2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z94ClienteCobCelular2, BC00047_A94ClienteCobCelular2[0]) != 0 ) || ( GXutil.strcmp(Z95ClienteCobNombreEmail1, BC00047_A95ClienteCobNombreEmail1[0]) != 0 ) || ( GXutil.strcmp(Z96ClienteCobEmail1, BC00047_A96ClienteCobEmail1[0]) != 0 ) || ( GXutil.strcmp(Z97ClienteCobNombreEmail2, BC00047_A97ClienteCobNombreEmail2[0]) != 0 ) || ( GXutil.strcmp(Z98ClienteCobEmail2, BC00047_A98ClienteCobEmail2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z99ClienteFacFax, BC00047_A99ClienteFacFax[0]) != 0 ) || ( GXutil.strcmp(Z100ClienteFacEmail, BC00047_A100ClienteFacEmail[0]) != 0 ) || ( GXutil.strcmp(Z101ClienteFacContrato, BC00047_A101ClienteFacContrato[0]) != 0 ) || ( GXutil.strcmp(Z102ClienteFacObservaciones, BC00047_A102ClienteFacObservaciones[0]) != 0 ) || ( Z103ClienteFacLista != BC00047_A103ClienteFacLista[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z104ClienteFacContado != BC00047_A104ClienteFacContado[0] ) || ( GXutil.strcmp(Z105ClienteNotEmailFrascos1, BC00047_A105ClienteNotEmailFrascos1[0]) != 0 ) || ( GXutil.strcmp(Z106ClienteNotEmailFrascos2, BC00047_A106ClienteNotEmailFrascos2[0]) != 0 ) || ( GXutil.strcmp(Z107ClienteNotEmailMuestra1, BC00047_A107ClienteNotEmailMuestra1[0]) != 0 ) || ( GXutil.strcmp(Z108ClienteNotEmailMuestra2, BC00047_A108ClienteNotEmailMuestra2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z109ClienteNotEmailAnalisis1, BC00047_A109ClienteNotEmailAnalisis1[0]) != 0 ) || ( GXutil.strcmp(Z110ClienteNotEmailAnalisis2, BC00047_A110ClienteNotEmailAnalisis2[0]) != 0 ) || ( GXutil.strcmp(Z111ClienteNotEmailGeneral1, BC00047_A111ClienteNotEmailGeneral1[0]) != 0 ) || ( GXutil.strcmp(Z112ClienteNotEmailGeneral2, BC00047_A112ClienteNotEmailGeneral2[0]) != 0 ) || ( Z113ClienteIncobrable != BC00047_A113ClienteIncobrable[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Cliente"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00048 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A4ClienteId), Boolean.valueOf(n45ClienteNombre), A45ClienteNombre, Boolean.valueOf(n46ClienteEmail), A46ClienteEmail, Boolean.valueOf(n47ClienteNombreEmail1), A47ClienteNombreEmail1, Boolean.valueOf(n48ClienteEmail1), A48ClienteEmail1, Boolean.valueOf(n49ClienteNombreEmail2), A49ClienteNombreEmail2, Boolean.valueOf(n50ClienteEmail2), A50ClienteEmail2, Boolean.valueOf(n51ClienteEnvio), A51ClienteEnvio, Boolean.valueOf(n52ClienteUsuarioWeb), A52ClienteUsuarioWeb, Boolean.valueOf(n53ClienteNombreCelular1), A53ClienteNombreCelular1, Boolean.valueOf(n54ClienteCelular1), A54ClienteCelular1, Boolean.valueOf(n55ClienteNombreCelular2), A55ClienteNombreCelular2, Boolean.valueOf(n56ClienteCelular2), A56ClienteCelular2, Boolean.valueOf(n57ClienteCodigoFigaro), A57ClienteCodigoFigaro, Boolean.valueOf(n58ClienteTipoUsuario), Short.valueOf(A58ClienteTipoUsuario), Boolean.valueOf(n59ClienteDireccion), A59ClienteDireccion, Boolean.valueOf(n60ClienteNombreTelefono1), A60ClienteNombreTelefono1, Boolean.valueOf(n61ClienteTelefono1), A61ClienteTelefono1, Boolean.valueOf(n62ClienteNombreTelefono2), A62ClienteNombreTelefono2, Boolean.valueOf(n63ClienteTelefono2), A63ClienteTelefono2, Boolean.valueOf(n64ClienteFax), A64ClienteFax, Boolean.valueOf(n65ClienteDicose), A65ClienteDicose, Boolean.valueOf(n66ClienteIdDepartamento), Long.valueOf(A66ClienteIdDepartamento), Boolean.valueOf(n67ClienteIdLocalidad), Long.valueOf(A67ClienteIdLocalidad), Boolean.valueOf(n68ClienteTecnico1), Long.valueOf(A68ClienteTecnico1), Boolean.valueOf(n69ClienteTecnico2), Long.valueOf(A69ClienteTecnico2), Boolean.valueOf(n70ClienteIdAgencia), Long.valueOf(A70ClienteIdAgencia), Boolean.valueOf(n71ClienteContrato), Short.valueOf(A71ClienteContrato), Boolean.valueOf(n72ClienteSocio), Short.valueOf(A72ClienteSocio), Boolean.valueOf(n73ClienteNoUsar), Short.valueOf(A73ClienteNoUsar), Boolean.valueOf(n74ClienteCodbar), Short.valueOf(A74ClienteCodbar), Boolean.valueOf(n75ClienteCaravanas), Short.valueOf(A75ClienteCaravanas), Boolean.valueOf(n76ClienteProlesa), Short.valueOf(A76ClienteProlesa), Boolean.valueOf(n77ClienteProlesaSuc), Long.valueOf(A77ClienteProlesaSuc), Long.valueOf(A168ClienteProlesaMat), Boolean.valueOf(n78ClienteObservaciones), A78ClienteObservaciones, Boolean.valueOf(n79ClienteFacRsocial), A79ClienteFacRsocial, Boolean.valueOf(n80ClienteFacCedula), A80ClienteFacCedula, Boolean.valueOf(n81ClienteFacRut), A81ClienteFacRut, Boolean.valueOf(n82ClienteFacDireccion), A82ClienteFacDireccion, Boolean.valueOf(n83ClienteFacLocalidad), A83ClienteFacLocalidad, Boolean.valueOf(n84ClienteFacDepartamento), Long.valueOf(A84ClienteFacDepartamento), Boolean.valueOf(n85ClienteFacCpostal), A85ClienteFacCpostal, Boolean.valueOf(n86ClienteFacGiro), Long.valueOf(A86ClienteFacGiro), Boolean.valueOf(n87ClienteCobNombreTelefono1), A87ClienteCobNombreTelefono1, Boolean.valueOf(n88ClienteFacTelefonos), A88ClienteFacTelefonos, Boolean.valueOf(n89ClienteCobNombreTelefono2), A89ClienteCobNombreTelefono2, Boolean.valueOf(n90ClienteCobTelefono2), A90ClienteCobTelefono2, Boolean.valueOf(n91ClienteCobNombreCelular1), A91ClienteCobNombreCelular1, Boolean.valueOf(n92ClienteCobCelular1), A92ClienteCobCelular1, Boolean.valueOf(n93ClienteCobNombreCelular2), A93ClienteCobNombreCelular2, Boolean.valueOf(n94ClienteCobCelular2), A94ClienteCobCelular2, Boolean.valueOf(n95ClienteCobNombreEmail1), A95ClienteCobNombreEmail1, Boolean.valueOf(n96ClienteCobEmail1), A96ClienteCobEmail1, Boolean.valueOf(n97ClienteCobNombreEmail2), A97ClienteCobNombreEmail2, Boolean.valueOf(n98ClienteCobEmail2), A98ClienteCobEmail2, Boolean.valueOf(n99ClienteFacFax), A99ClienteFacFax, Boolean.valueOf(n100ClienteFacEmail), A100ClienteFacEmail, Boolean.valueOf(n101ClienteFacContrato), A101ClienteFacContrato, Boolean.valueOf(n102ClienteFacObservaciones), A102ClienteFacObservaciones, Boolean.valueOf(n103ClienteFacLista), Long.valueOf(A103ClienteFacLista), Boolean.valueOf(n104ClienteFacContado), Short.valueOf(A104ClienteFacContado),
                  Boolean.valueOf(n105ClienteNotEmailFrascos1), A105ClienteNotEmailFrascos1, Boolean.valueOf(n106ClienteNotEmailFrascos2), A106ClienteNotEmailFrascos2, Boolean.valueOf(n107ClienteNotEmailMuestra1), A107ClienteNotEmailMuestra1, Boolean.valueOf(n108ClienteNotEmailMuestra2), A108ClienteNotEmailMuestra2, Boolean.valueOf(n109ClienteNotEmailAnalisis1), A109ClienteNotEmailAnalisis1, Boolean.valueOf(n110ClienteNotEmailAnalisis2), A110ClienteNotEmailAnalisis2, Boolean.valueOf(n111ClienteNotEmailGeneral1), A111ClienteNotEmailGeneral1, Boolean.valueOf(n112ClienteNotEmailGeneral2), A112ClienteNotEmailGeneral2, Boolean.valueOf(n113ClienteIncobrable), Short.valueOf(A113ClienteIncobrable)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
                  if ( (pr_default.getStatus(6) == 1) )
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00049 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n45ClienteNombre), A45ClienteNombre, Boolean.valueOf(n46ClienteEmail), A46ClienteEmail, Boolean.valueOf(n47ClienteNombreEmail1), A47ClienteNombreEmail1, Boolean.valueOf(n48ClienteEmail1), A48ClienteEmail1, Boolean.valueOf(n49ClienteNombreEmail2), A49ClienteNombreEmail2, Boolean.valueOf(n50ClienteEmail2), A50ClienteEmail2, Boolean.valueOf(n51ClienteEnvio), A51ClienteEnvio, Boolean.valueOf(n52ClienteUsuarioWeb), A52ClienteUsuarioWeb, Boolean.valueOf(n53ClienteNombreCelular1), A53ClienteNombreCelular1, Boolean.valueOf(n54ClienteCelular1), A54ClienteCelular1, Boolean.valueOf(n55ClienteNombreCelular2), A55ClienteNombreCelular2, Boolean.valueOf(n56ClienteCelular2), A56ClienteCelular2, Boolean.valueOf(n57ClienteCodigoFigaro), A57ClienteCodigoFigaro, Boolean.valueOf(n58ClienteTipoUsuario), Short.valueOf(A58ClienteTipoUsuario), Boolean.valueOf(n59ClienteDireccion), A59ClienteDireccion, Boolean.valueOf(n60ClienteNombreTelefono1), A60ClienteNombreTelefono1, Boolean.valueOf(n61ClienteTelefono1), A61ClienteTelefono1, Boolean.valueOf(n62ClienteNombreTelefono2), A62ClienteNombreTelefono2, Boolean.valueOf(n63ClienteTelefono2), A63ClienteTelefono2, Boolean.valueOf(n64ClienteFax), A64ClienteFax, Boolean.valueOf(n65ClienteDicose), A65ClienteDicose, Boolean.valueOf(n66ClienteIdDepartamento), Long.valueOf(A66ClienteIdDepartamento), Boolean.valueOf(n67ClienteIdLocalidad), Long.valueOf(A67ClienteIdLocalidad), Boolean.valueOf(n68ClienteTecnico1), Long.valueOf(A68ClienteTecnico1), Boolean.valueOf(n69ClienteTecnico2), Long.valueOf(A69ClienteTecnico2), Boolean.valueOf(n70ClienteIdAgencia), Long.valueOf(A70ClienteIdAgencia), Boolean.valueOf(n71ClienteContrato), Short.valueOf(A71ClienteContrato), Boolean.valueOf(n72ClienteSocio), Short.valueOf(A72ClienteSocio), Boolean.valueOf(n73ClienteNoUsar), Short.valueOf(A73ClienteNoUsar), Boolean.valueOf(n74ClienteCodbar), Short.valueOf(A74ClienteCodbar), Boolean.valueOf(n75ClienteCaravanas), Short.valueOf(A75ClienteCaravanas), Boolean.valueOf(n76ClienteProlesa), Short.valueOf(A76ClienteProlesa), Boolean.valueOf(n77ClienteProlesaSuc), Long.valueOf(A77ClienteProlesaSuc), Long.valueOf(A168ClienteProlesaMat), Boolean.valueOf(n78ClienteObservaciones), A78ClienteObservaciones, Boolean.valueOf(n79ClienteFacRsocial), A79ClienteFacRsocial, Boolean.valueOf(n80ClienteFacCedula), A80ClienteFacCedula, Boolean.valueOf(n81ClienteFacRut), A81ClienteFacRut, Boolean.valueOf(n82ClienteFacDireccion), A82ClienteFacDireccion, Boolean.valueOf(n83ClienteFacLocalidad), A83ClienteFacLocalidad, Boolean.valueOf(n84ClienteFacDepartamento), Long.valueOf(A84ClienteFacDepartamento), Boolean.valueOf(n85ClienteFacCpostal), A85ClienteFacCpostal, Boolean.valueOf(n86ClienteFacGiro), Long.valueOf(A86ClienteFacGiro), Boolean.valueOf(n87ClienteCobNombreTelefono1), A87ClienteCobNombreTelefono1, Boolean.valueOf(n88ClienteFacTelefonos), A88ClienteFacTelefonos, Boolean.valueOf(n89ClienteCobNombreTelefono2), A89ClienteCobNombreTelefono2, Boolean.valueOf(n90ClienteCobTelefono2), A90ClienteCobTelefono2, Boolean.valueOf(n91ClienteCobNombreCelular1), A91ClienteCobNombreCelular1, Boolean.valueOf(n92ClienteCobCelular1), A92ClienteCobCelular1, Boolean.valueOf(n93ClienteCobNombreCelular2), A93ClienteCobNombreCelular2, Boolean.valueOf(n94ClienteCobCelular2), A94ClienteCobCelular2, Boolean.valueOf(n95ClienteCobNombreEmail1), A95ClienteCobNombreEmail1, Boolean.valueOf(n96ClienteCobEmail1), A96ClienteCobEmail1, Boolean.valueOf(n97ClienteCobNombreEmail2), A97ClienteCobNombreEmail2, Boolean.valueOf(n98ClienteCobEmail2), A98ClienteCobEmail2, Boolean.valueOf(n99ClienteFacFax), A99ClienteFacFax, Boolean.valueOf(n100ClienteFacEmail), A100ClienteFacEmail, Boolean.valueOf(n101ClienteFacContrato), A101ClienteFacContrato, Boolean.valueOf(n102ClienteFacObservaciones), A102ClienteFacObservaciones, Boolean.valueOf(n103ClienteFacLista), Long.valueOf(A103ClienteFacLista), Boolean.valueOf(n104ClienteFacContado), Short.valueOf(A104ClienteFacContado), Boolean.valueOf(n105ClienteNotEmailFrascos1),
                  A105ClienteNotEmailFrascos1, Boolean.valueOf(n106ClienteNotEmailFrascos2), A106ClienteNotEmailFrascos2, Boolean.valueOf(n107ClienteNotEmailMuestra1), A107ClienteNotEmailMuestra1, Boolean.valueOf(n108ClienteNotEmailMuestra2), A108ClienteNotEmailMuestra2, Boolean.valueOf(n109ClienteNotEmailAnalisis1), A109ClienteNotEmailAnalisis1, Boolean.valueOf(n110ClienteNotEmailAnalisis2), A110ClienteNotEmailAnalisis2, Boolean.valueOf(n111ClienteNotEmailGeneral1), A111ClienteNotEmailGeneral1, Boolean.valueOf(n112ClienteNotEmailGeneral2), A112ClienteNotEmailGeneral2, Boolean.valueOf(n113ClienteIncobrable), Short.valueOf(A113ClienteIncobrable), Long.valueOf(A4ClienteId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Cliente"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000410 */
               pr_default.execute(8, new Object[] {Long.valueOf(A4ClienteId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Cliente");
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel044( ) ;
      Gx_mode = sMode4 ;
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
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

   public void scanKeyStart044( )
   {
      /* Using cursor BC000411 */
      pr_default.execute(9, new Object[] {Long.valueOf(A4ClienteId)});
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A4ClienteId = BC000411_A4ClienteId[0] ;
         A45ClienteNombre = BC000411_A45ClienteNombre[0] ;
         n45ClienteNombre = BC000411_n45ClienteNombre[0] ;
         A46ClienteEmail = BC000411_A46ClienteEmail[0] ;
         n46ClienteEmail = BC000411_n46ClienteEmail[0] ;
         A47ClienteNombreEmail1 = BC000411_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = BC000411_n47ClienteNombreEmail1[0] ;
         A48ClienteEmail1 = BC000411_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = BC000411_n48ClienteEmail1[0] ;
         A49ClienteNombreEmail2 = BC000411_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = BC000411_n49ClienteNombreEmail2[0] ;
         A50ClienteEmail2 = BC000411_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = BC000411_n50ClienteEmail2[0] ;
         A51ClienteEnvio = BC000411_A51ClienteEnvio[0] ;
         n51ClienteEnvio = BC000411_n51ClienteEnvio[0] ;
         A52ClienteUsuarioWeb = BC000411_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = BC000411_n52ClienteUsuarioWeb[0] ;
         A53ClienteNombreCelular1 = BC000411_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = BC000411_n53ClienteNombreCelular1[0] ;
         A54ClienteCelular1 = BC000411_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = BC000411_n54ClienteCelular1[0] ;
         A55ClienteNombreCelular2 = BC000411_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = BC000411_n55ClienteNombreCelular2[0] ;
         A56ClienteCelular2 = BC000411_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = BC000411_n56ClienteCelular2[0] ;
         A57ClienteCodigoFigaro = BC000411_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = BC000411_n57ClienteCodigoFigaro[0] ;
         A58ClienteTipoUsuario = BC000411_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = BC000411_n58ClienteTipoUsuario[0] ;
         A59ClienteDireccion = BC000411_A59ClienteDireccion[0] ;
         n59ClienteDireccion = BC000411_n59ClienteDireccion[0] ;
         A60ClienteNombreTelefono1 = BC000411_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = BC000411_n60ClienteNombreTelefono1[0] ;
         A61ClienteTelefono1 = BC000411_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = BC000411_n61ClienteTelefono1[0] ;
         A62ClienteNombreTelefono2 = BC000411_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = BC000411_n62ClienteNombreTelefono2[0] ;
         A63ClienteTelefono2 = BC000411_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = BC000411_n63ClienteTelefono2[0] ;
         A64ClienteFax = BC000411_A64ClienteFax[0] ;
         n64ClienteFax = BC000411_n64ClienteFax[0] ;
         A65ClienteDicose = BC000411_A65ClienteDicose[0] ;
         n65ClienteDicose = BC000411_n65ClienteDicose[0] ;
         A66ClienteIdDepartamento = BC000411_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = BC000411_n66ClienteIdDepartamento[0] ;
         A67ClienteIdLocalidad = BC000411_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = BC000411_n67ClienteIdLocalidad[0] ;
         A68ClienteTecnico1 = BC000411_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = BC000411_n68ClienteTecnico1[0] ;
         A69ClienteTecnico2 = BC000411_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = BC000411_n69ClienteTecnico2[0] ;
         A70ClienteIdAgencia = BC000411_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = BC000411_n70ClienteIdAgencia[0] ;
         A71ClienteContrato = BC000411_A71ClienteContrato[0] ;
         n71ClienteContrato = BC000411_n71ClienteContrato[0] ;
         A72ClienteSocio = BC000411_A72ClienteSocio[0] ;
         n72ClienteSocio = BC000411_n72ClienteSocio[0] ;
         A73ClienteNoUsar = BC000411_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = BC000411_n73ClienteNoUsar[0] ;
         A74ClienteCodbar = BC000411_A74ClienteCodbar[0] ;
         n74ClienteCodbar = BC000411_n74ClienteCodbar[0] ;
         A75ClienteCaravanas = BC000411_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = BC000411_n75ClienteCaravanas[0] ;
         A76ClienteProlesa = BC000411_A76ClienteProlesa[0] ;
         n76ClienteProlesa = BC000411_n76ClienteProlesa[0] ;
         A77ClienteProlesaSuc = BC000411_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = BC000411_n77ClienteProlesaSuc[0] ;
         A168ClienteProlesaMat = BC000411_A168ClienteProlesaMat[0] ;
         A78ClienteObservaciones = BC000411_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = BC000411_n78ClienteObservaciones[0] ;
         A79ClienteFacRsocial = BC000411_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = BC000411_n79ClienteFacRsocial[0] ;
         A80ClienteFacCedula = BC000411_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = BC000411_n80ClienteFacCedula[0] ;
         A81ClienteFacRut = BC000411_A81ClienteFacRut[0] ;
         n81ClienteFacRut = BC000411_n81ClienteFacRut[0] ;
         A82ClienteFacDireccion = BC000411_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = BC000411_n82ClienteFacDireccion[0] ;
         A83ClienteFacLocalidad = BC000411_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = BC000411_n83ClienteFacLocalidad[0] ;
         A84ClienteFacDepartamento = BC000411_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = BC000411_n84ClienteFacDepartamento[0] ;
         A85ClienteFacCpostal = BC000411_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = BC000411_n85ClienteFacCpostal[0] ;
         A86ClienteFacGiro = BC000411_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = BC000411_n86ClienteFacGiro[0] ;
         A87ClienteCobNombreTelefono1 = BC000411_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = BC000411_n87ClienteCobNombreTelefono1[0] ;
         A88ClienteFacTelefonos = BC000411_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = BC000411_n88ClienteFacTelefonos[0] ;
         A89ClienteCobNombreTelefono2 = BC000411_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = BC000411_n89ClienteCobNombreTelefono2[0] ;
         A90ClienteCobTelefono2 = BC000411_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = BC000411_n90ClienteCobTelefono2[0] ;
         A91ClienteCobNombreCelular1 = BC000411_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = BC000411_n91ClienteCobNombreCelular1[0] ;
         A92ClienteCobCelular1 = BC000411_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = BC000411_n92ClienteCobCelular1[0] ;
         A93ClienteCobNombreCelular2 = BC000411_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = BC000411_n93ClienteCobNombreCelular2[0] ;
         A94ClienteCobCelular2 = BC000411_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = BC000411_n94ClienteCobCelular2[0] ;
         A95ClienteCobNombreEmail1 = BC000411_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = BC000411_n95ClienteCobNombreEmail1[0] ;
         A96ClienteCobEmail1 = BC000411_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = BC000411_n96ClienteCobEmail1[0] ;
         A97ClienteCobNombreEmail2 = BC000411_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = BC000411_n97ClienteCobNombreEmail2[0] ;
         A98ClienteCobEmail2 = BC000411_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = BC000411_n98ClienteCobEmail2[0] ;
         A99ClienteFacFax = BC000411_A99ClienteFacFax[0] ;
         n99ClienteFacFax = BC000411_n99ClienteFacFax[0] ;
         A100ClienteFacEmail = BC000411_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = BC000411_n100ClienteFacEmail[0] ;
         A101ClienteFacContrato = BC000411_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = BC000411_n101ClienteFacContrato[0] ;
         A102ClienteFacObservaciones = BC000411_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = BC000411_n102ClienteFacObservaciones[0] ;
         A103ClienteFacLista = BC000411_A103ClienteFacLista[0] ;
         n103ClienteFacLista = BC000411_n103ClienteFacLista[0] ;
         A104ClienteFacContado = BC000411_A104ClienteFacContado[0] ;
         n104ClienteFacContado = BC000411_n104ClienteFacContado[0] ;
         A105ClienteNotEmailFrascos1 = BC000411_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = BC000411_n105ClienteNotEmailFrascos1[0] ;
         A106ClienteNotEmailFrascos2 = BC000411_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = BC000411_n106ClienteNotEmailFrascos2[0] ;
         A107ClienteNotEmailMuestra1 = BC000411_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = BC000411_n107ClienteNotEmailMuestra1[0] ;
         A108ClienteNotEmailMuestra2 = BC000411_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = BC000411_n108ClienteNotEmailMuestra2[0] ;
         A109ClienteNotEmailAnalisis1 = BC000411_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = BC000411_n109ClienteNotEmailAnalisis1[0] ;
         A110ClienteNotEmailAnalisis2 = BC000411_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = BC000411_n110ClienteNotEmailAnalisis2[0] ;
         A111ClienteNotEmailGeneral1 = BC000411_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = BC000411_n111ClienteNotEmailGeneral1[0] ;
         A112ClienteNotEmailGeneral2 = BC000411_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = BC000411_n112ClienteNotEmailGeneral2[0] ;
         A113ClienteIncobrable = BC000411_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = BC000411_n113ClienteIncobrable[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound4 = (short)(0) ;
      scanKeyLoad044( ) ;
   }

   public void scanKeyLoad044( )
   {
      sMode4 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A4ClienteId = BC000411_A4ClienteId[0] ;
         A45ClienteNombre = BC000411_A45ClienteNombre[0] ;
         n45ClienteNombre = BC000411_n45ClienteNombre[0] ;
         A46ClienteEmail = BC000411_A46ClienteEmail[0] ;
         n46ClienteEmail = BC000411_n46ClienteEmail[0] ;
         A47ClienteNombreEmail1 = BC000411_A47ClienteNombreEmail1[0] ;
         n47ClienteNombreEmail1 = BC000411_n47ClienteNombreEmail1[0] ;
         A48ClienteEmail1 = BC000411_A48ClienteEmail1[0] ;
         n48ClienteEmail1 = BC000411_n48ClienteEmail1[0] ;
         A49ClienteNombreEmail2 = BC000411_A49ClienteNombreEmail2[0] ;
         n49ClienteNombreEmail2 = BC000411_n49ClienteNombreEmail2[0] ;
         A50ClienteEmail2 = BC000411_A50ClienteEmail2[0] ;
         n50ClienteEmail2 = BC000411_n50ClienteEmail2[0] ;
         A51ClienteEnvio = BC000411_A51ClienteEnvio[0] ;
         n51ClienteEnvio = BC000411_n51ClienteEnvio[0] ;
         A52ClienteUsuarioWeb = BC000411_A52ClienteUsuarioWeb[0] ;
         n52ClienteUsuarioWeb = BC000411_n52ClienteUsuarioWeb[0] ;
         A53ClienteNombreCelular1 = BC000411_A53ClienteNombreCelular1[0] ;
         n53ClienteNombreCelular1 = BC000411_n53ClienteNombreCelular1[0] ;
         A54ClienteCelular1 = BC000411_A54ClienteCelular1[0] ;
         n54ClienteCelular1 = BC000411_n54ClienteCelular1[0] ;
         A55ClienteNombreCelular2 = BC000411_A55ClienteNombreCelular2[0] ;
         n55ClienteNombreCelular2 = BC000411_n55ClienteNombreCelular2[0] ;
         A56ClienteCelular2 = BC000411_A56ClienteCelular2[0] ;
         n56ClienteCelular2 = BC000411_n56ClienteCelular2[0] ;
         A57ClienteCodigoFigaro = BC000411_A57ClienteCodigoFigaro[0] ;
         n57ClienteCodigoFigaro = BC000411_n57ClienteCodigoFigaro[0] ;
         A58ClienteTipoUsuario = BC000411_A58ClienteTipoUsuario[0] ;
         n58ClienteTipoUsuario = BC000411_n58ClienteTipoUsuario[0] ;
         A59ClienteDireccion = BC000411_A59ClienteDireccion[0] ;
         n59ClienteDireccion = BC000411_n59ClienteDireccion[0] ;
         A60ClienteNombreTelefono1 = BC000411_A60ClienteNombreTelefono1[0] ;
         n60ClienteNombreTelefono1 = BC000411_n60ClienteNombreTelefono1[0] ;
         A61ClienteTelefono1 = BC000411_A61ClienteTelefono1[0] ;
         n61ClienteTelefono1 = BC000411_n61ClienteTelefono1[0] ;
         A62ClienteNombreTelefono2 = BC000411_A62ClienteNombreTelefono2[0] ;
         n62ClienteNombreTelefono2 = BC000411_n62ClienteNombreTelefono2[0] ;
         A63ClienteTelefono2 = BC000411_A63ClienteTelefono2[0] ;
         n63ClienteTelefono2 = BC000411_n63ClienteTelefono2[0] ;
         A64ClienteFax = BC000411_A64ClienteFax[0] ;
         n64ClienteFax = BC000411_n64ClienteFax[0] ;
         A65ClienteDicose = BC000411_A65ClienteDicose[0] ;
         n65ClienteDicose = BC000411_n65ClienteDicose[0] ;
         A66ClienteIdDepartamento = BC000411_A66ClienteIdDepartamento[0] ;
         n66ClienteIdDepartamento = BC000411_n66ClienteIdDepartamento[0] ;
         A67ClienteIdLocalidad = BC000411_A67ClienteIdLocalidad[0] ;
         n67ClienteIdLocalidad = BC000411_n67ClienteIdLocalidad[0] ;
         A68ClienteTecnico1 = BC000411_A68ClienteTecnico1[0] ;
         n68ClienteTecnico1 = BC000411_n68ClienteTecnico1[0] ;
         A69ClienteTecnico2 = BC000411_A69ClienteTecnico2[0] ;
         n69ClienteTecnico2 = BC000411_n69ClienteTecnico2[0] ;
         A70ClienteIdAgencia = BC000411_A70ClienteIdAgencia[0] ;
         n70ClienteIdAgencia = BC000411_n70ClienteIdAgencia[0] ;
         A71ClienteContrato = BC000411_A71ClienteContrato[0] ;
         n71ClienteContrato = BC000411_n71ClienteContrato[0] ;
         A72ClienteSocio = BC000411_A72ClienteSocio[0] ;
         n72ClienteSocio = BC000411_n72ClienteSocio[0] ;
         A73ClienteNoUsar = BC000411_A73ClienteNoUsar[0] ;
         n73ClienteNoUsar = BC000411_n73ClienteNoUsar[0] ;
         A74ClienteCodbar = BC000411_A74ClienteCodbar[0] ;
         n74ClienteCodbar = BC000411_n74ClienteCodbar[0] ;
         A75ClienteCaravanas = BC000411_A75ClienteCaravanas[0] ;
         n75ClienteCaravanas = BC000411_n75ClienteCaravanas[0] ;
         A76ClienteProlesa = BC000411_A76ClienteProlesa[0] ;
         n76ClienteProlesa = BC000411_n76ClienteProlesa[0] ;
         A77ClienteProlesaSuc = BC000411_A77ClienteProlesaSuc[0] ;
         n77ClienteProlesaSuc = BC000411_n77ClienteProlesaSuc[0] ;
         A168ClienteProlesaMat = BC000411_A168ClienteProlesaMat[0] ;
         A78ClienteObservaciones = BC000411_A78ClienteObservaciones[0] ;
         n78ClienteObservaciones = BC000411_n78ClienteObservaciones[0] ;
         A79ClienteFacRsocial = BC000411_A79ClienteFacRsocial[0] ;
         n79ClienteFacRsocial = BC000411_n79ClienteFacRsocial[0] ;
         A80ClienteFacCedula = BC000411_A80ClienteFacCedula[0] ;
         n80ClienteFacCedula = BC000411_n80ClienteFacCedula[0] ;
         A81ClienteFacRut = BC000411_A81ClienteFacRut[0] ;
         n81ClienteFacRut = BC000411_n81ClienteFacRut[0] ;
         A82ClienteFacDireccion = BC000411_A82ClienteFacDireccion[0] ;
         n82ClienteFacDireccion = BC000411_n82ClienteFacDireccion[0] ;
         A83ClienteFacLocalidad = BC000411_A83ClienteFacLocalidad[0] ;
         n83ClienteFacLocalidad = BC000411_n83ClienteFacLocalidad[0] ;
         A84ClienteFacDepartamento = BC000411_A84ClienteFacDepartamento[0] ;
         n84ClienteFacDepartamento = BC000411_n84ClienteFacDepartamento[0] ;
         A85ClienteFacCpostal = BC000411_A85ClienteFacCpostal[0] ;
         n85ClienteFacCpostal = BC000411_n85ClienteFacCpostal[0] ;
         A86ClienteFacGiro = BC000411_A86ClienteFacGiro[0] ;
         n86ClienteFacGiro = BC000411_n86ClienteFacGiro[0] ;
         A87ClienteCobNombreTelefono1 = BC000411_A87ClienteCobNombreTelefono1[0] ;
         n87ClienteCobNombreTelefono1 = BC000411_n87ClienteCobNombreTelefono1[0] ;
         A88ClienteFacTelefonos = BC000411_A88ClienteFacTelefonos[0] ;
         n88ClienteFacTelefonos = BC000411_n88ClienteFacTelefonos[0] ;
         A89ClienteCobNombreTelefono2 = BC000411_A89ClienteCobNombreTelefono2[0] ;
         n89ClienteCobNombreTelefono2 = BC000411_n89ClienteCobNombreTelefono2[0] ;
         A90ClienteCobTelefono2 = BC000411_A90ClienteCobTelefono2[0] ;
         n90ClienteCobTelefono2 = BC000411_n90ClienteCobTelefono2[0] ;
         A91ClienteCobNombreCelular1 = BC000411_A91ClienteCobNombreCelular1[0] ;
         n91ClienteCobNombreCelular1 = BC000411_n91ClienteCobNombreCelular1[0] ;
         A92ClienteCobCelular1 = BC000411_A92ClienteCobCelular1[0] ;
         n92ClienteCobCelular1 = BC000411_n92ClienteCobCelular1[0] ;
         A93ClienteCobNombreCelular2 = BC000411_A93ClienteCobNombreCelular2[0] ;
         n93ClienteCobNombreCelular2 = BC000411_n93ClienteCobNombreCelular2[0] ;
         A94ClienteCobCelular2 = BC000411_A94ClienteCobCelular2[0] ;
         n94ClienteCobCelular2 = BC000411_n94ClienteCobCelular2[0] ;
         A95ClienteCobNombreEmail1 = BC000411_A95ClienteCobNombreEmail1[0] ;
         n95ClienteCobNombreEmail1 = BC000411_n95ClienteCobNombreEmail1[0] ;
         A96ClienteCobEmail1 = BC000411_A96ClienteCobEmail1[0] ;
         n96ClienteCobEmail1 = BC000411_n96ClienteCobEmail1[0] ;
         A97ClienteCobNombreEmail2 = BC000411_A97ClienteCobNombreEmail2[0] ;
         n97ClienteCobNombreEmail2 = BC000411_n97ClienteCobNombreEmail2[0] ;
         A98ClienteCobEmail2 = BC000411_A98ClienteCobEmail2[0] ;
         n98ClienteCobEmail2 = BC000411_n98ClienteCobEmail2[0] ;
         A99ClienteFacFax = BC000411_A99ClienteFacFax[0] ;
         n99ClienteFacFax = BC000411_n99ClienteFacFax[0] ;
         A100ClienteFacEmail = BC000411_A100ClienteFacEmail[0] ;
         n100ClienteFacEmail = BC000411_n100ClienteFacEmail[0] ;
         A101ClienteFacContrato = BC000411_A101ClienteFacContrato[0] ;
         n101ClienteFacContrato = BC000411_n101ClienteFacContrato[0] ;
         A102ClienteFacObservaciones = BC000411_A102ClienteFacObservaciones[0] ;
         n102ClienteFacObservaciones = BC000411_n102ClienteFacObservaciones[0] ;
         A103ClienteFacLista = BC000411_A103ClienteFacLista[0] ;
         n103ClienteFacLista = BC000411_n103ClienteFacLista[0] ;
         A104ClienteFacContado = BC000411_A104ClienteFacContado[0] ;
         n104ClienteFacContado = BC000411_n104ClienteFacContado[0] ;
         A105ClienteNotEmailFrascos1 = BC000411_A105ClienteNotEmailFrascos1[0] ;
         n105ClienteNotEmailFrascos1 = BC000411_n105ClienteNotEmailFrascos1[0] ;
         A106ClienteNotEmailFrascos2 = BC000411_A106ClienteNotEmailFrascos2[0] ;
         n106ClienteNotEmailFrascos2 = BC000411_n106ClienteNotEmailFrascos2[0] ;
         A107ClienteNotEmailMuestra1 = BC000411_A107ClienteNotEmailMuestra1[0] ;
         n107ClienteNotEmailMuestra1 = BC000411_n107ClienteNotEmailMuestra1[0] ;
         A108ClienteNotEmailMuestra2 = BC000411_A108ClienteNotEmailMuestra2[0] ;
         n108ClienteNotEmailMuestra2 = BC000411_n108ClienteNotEmailMuestra2[0] ;
         A109ClienteNotEmailAnalisis1 = BC000411_A109ClienteNotEmailAnalisis1[0] ;
         n109ClienteNotEmailAnalisis1 = BC000411_n109ClienteNotEmailAnalisis1[0] ;
         A110ClienteNotEmailAnalisis2 = BC000411_A110ClienteNotEmailAnalisis2[0] ;
         n110ClienteNotEmailAnalisis2 = BC000411_n110ClienteNotEmailAnalisis2[0] ;
         A111ClienteNotEmailGeneral1 = BC000411_A111ClienteNotEmailGeneral1[0] ;
         n111ClienteNotEmailGeneral1 = BC000411_n111ClienteNotEmailGeneral1[0] ;
         A112ClienteNotEmailGeneral2 = BC000411_A112ClienteNotEmailGeneral2[0] ;
         n112ClienteNotEmailGeneral2 = BC000411_n112ClienteNotEmailGeneral2[0] ;
         A113ClienteIncobrable = BC000411_A113ClienteIncobrable[0] ;
         n113ClienteIncobrable = BC000411_n113ClienteIncobrable[0] ;
      }
      Gx_mode = sMode4 ;
   }

   public void scanKeyEnd044( )
   {
      pr_default.close(9);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void addRow044( )
   {
      VarsToRow4( bcCliente) ;
   }

   public void readRow044( )
   {
      RowToVars4( bcCliente, 1) ;
   }

   public void initializeNonKey044( )
   {
      A45ClienteNombre = "" ;
      n45ClienteNombre = false ;
      A46ClienteEmail = "" ;
      n46ClienteEmail = false ;
      A47ClienteNombreEmail1 = "" ;
      n47ClienteNombreEmail1 = false ;
      A48ClienteEmail1 = "" ;
      n48ClienteEmail1 = false ;
      A49ClienteNombreEmail2 = "" ;
      n49ClienteNombreEmail2 = false ;
      A50ClienteEmail2 = "" ;
      n50ClienteEmail2 = false ;
      A51ClienteEnvio = "" ;
      n51ClienteEnvio = false ;
      A52ClienteUsuarioWeb = "" ;
      n52ClienteUsuarioWeb = false ;
      A53ClienteNombreCelular1 = "" ;
      n53ClienteNombreCelular1 = false ;
      A54ClienteCelular1 = "" ;
      n54ClienteCelular1 = false ;
      A55ClienteNombreCelular2 = "" ;
      n55ClienteNombreCelular2 = false ;
      A56ClienteCelular2 = "" ;
      n56ClienteCelular2 = false ;
      A57ClienteCodigoFigaro = "" ;
      n57ClienteCodigoFigaro = false ;
      A58ClienteTipoUsuario = (short)(0) ;
      n58ClienteTipoUsuario = false ;
      A59ClienteDireccion = "" ;
      n59ClienteDireccion = false ;
      A60ClienteNombreTelefono1 = "" ;
      n60ClienteNombreTelefono1 = false ;
      A61ClienteTelefono1 = "" ;
      n61ClienteTelefono1 = false ;
      A62ClienteNombreTelefono2 = "" ;
      n62ClienteNombreTelefono2 = false ;
      A63ClienteTelefono2 = "" ;
      n63ClienteTelefono2 = false ;
      A64ClienteFax = "" ;
      n64ClienteFax = false ;
      A65ClienteDicose = "" ;
      n65ClienteDicose = false ;
      A66ClienteIdDepartamento = 0 ;
      n66ClienteIdDepartamento = false ;
      A67ClienteIdLocalidad = 0 ;
      n67ClienteIdLocalidad = false ;
      A68ClienteTecnico1 = 0 ;
      n68ClienteTecnico1 = false ;
      A69ClienteTecnico2 = 0 ;
      n69ClienteTecnico2 = false ;
      A70ClienteIdAgencia = 0 ;
      n70ClienteIdAgencia = false ;
      A71ClienteContrato = (short)(0) ;
      n71ClienteContrato = false ;
      A72ClienteSocio = (short)(0) ;
      n72ClienteSocio = false ;
      A73ClienteNoUsar = (short)(0) ;
      n73ClienteNoUsar = false ;
      A74ClienteCodbar = (short)(0) ;
      n74ClienteCodbar = false ;
      A75ClienteCaravanas = (short)(0) ;
      n75ClienteCaravanas = false ;
      A76ClienteProlesa = (short)(0) ;
      n76ClienteProlesa = false ;
      A77ClienteProlesaSuc = 0 ;
      n77ClienteProlesaSuc = false ;
      A168ClienteProlesaMat = 0 ;
      A78ClienteObservaciones = "" ;
      n78ClienteObservaciones = false ;
      A79ClienteFacRsocial = "" ;
      n79ClienteFacRsocial = false ;
      A80ClienteFacCedula = "" ;
      n80ClienteFacCedula = false ;
      A81ClienteFacRut = "" ;
      n81ClienteFacRut = false ;
      A82ClienteFacDireccion = "" ;
      n82ClienteFacDireccion = false ;
      A83ClienteFacLocalidad = "" ;
      n83ClienteFacLocalidad = false ;
      A84ClienteFacDepartamento = 0 ;
      n84ClienteFacDepartamento = false ;
      A85ClienteFacCpostal = "" ;
      n85ClienteFacCpostal = false ;
      A86ClienteFacGiro = 0 ;
      n86ClienteFacGiro = false ;
      A87ClienteCobNombreTelefono1 = "" ;
      n87ClienteCobNombreTelefono1 = false ;
      A88ClienteFacTelefonos = "" ;
      n88ClienteFacTelefonos = false ;
      A89ClienteCobNombreTelefono2 = "" ;
      n89ClienteCobNombreTelefono2 = false ;
      A90ClienteCobTelefono2 = "" ;
      n90ClienteCobTelefono2 = false ;
      A91ClienteCobNombreCelular1 = "" ;
      n91ClienteCobNombreCelular1 = false ;
      A92ClienteCobCelular1 = "" ;
      n92ClienteCobCelular1 = false ;
      A93ClienteCobNombreCelular2 = "" ;
      n93ClienteCobNombreCelular2 = false ;
      A94ClienteCobCelular2 = "" ;
      n94ClienteCobCelular2 = false ;
      A95ClienteCobNombreEmail1 = "" ;
      n95ClienteCobNombreEmail1 = false ;
      A96ClienteCobEmail1 = "" ;
      n96ClienteCobEmail1 = false ;
      A97ClienteCobNombreEmail2 = "" ;
      n97ClienteCobNombreEmail2 = false ;
      A98ClienteCobEmail2 = "" ;
      n98ClienteCobEmail2 = false ;
      A99ClienteFacFax = "" ;
      n99ClienteFacFax = false ;
      A100ClienteFacEmail = "" ;
      n100ClienteFacEmail = false ;
      A101ClienteFacContrato = "" ;
      n101ClienteFacContrato = false ;
      A102ClienteFacObservaciones = "" ;
      n102ClienteFacObservaciones = false ;
      A103ClienteFacLista = 0 ;
      n103ClienteFacLista = false ;
      A104ClienteFacContado = (short)(0) ;
      n104ClienteFacContado = false ;
      A105ClienteNotEmailFrascos1 = "" ;
      n105ClienteNotEmailFrascos1 = false ;
      A106ClienteNotEmailFrascos2 = "" ;
      n106ClienteNotEmailFrascos2 = false ;
      A107ClienteNotEmailMuestra1 = "" ;
      n107ClienteNotEmailMuestra1 = false ;
      A108ClienteNotEmailMuestra2 = "" ;
      n108ClienteNotEmailMuestra2 = false ;
      A109ClienteNotEmailAnalisis1 = "" ;
      n109ClienteNotEmailAnalisis1 = false ;
      A110ClienteNotEmailAnalisis2 = "" ;
      n110ClienteNotEmailAnalisis2 = false ;
      A111ClienteNotEmailGeneral1 = "" ;
      n111ClienteNotEmailGeneral1 = false ;
      A112ClienteNotEmailGeneral2 = "" ;
      n112ClienteNotEmailGeneral2 = false ;
      A113ClienteIncobrable = (short)(0) ;
      n113ClienteIncobrable = false ;
      Z45ClienteNombre = "" ;
      Z46ClienteEmail = "" ;
      Z47ClienteNombreEmail1 = "" ;
      Z48ClienteEmail1 = "" ;
      Z49ClienteNombreEmail2 = "" ;
      Z50ClienteEmail2 = "" ;
      Z51ClienteEnvio = "" ;
      Z52ClienteUsuarioWeb = "" ;
      Z53ClienteNombreCelular1 = "" ;
      Z54ClienteCelular1 = "" ;
      Z55ClienteNombreCelular2 = "" ;
      Z56ClienteCelular2 = "" ;
      Z57ClienteCodigoFigaro = "" ;
      Z58ClienteTipoUsuario = (short)(0) ;
      Z59ClienteDireccion = "" ;
      Z60ClienteNombreTelefono1 = "" ;
      Z61ClienteTelefono1 = "" ;
      Z62ClienteNombreTelefono2 = "" ;
      Z63ClienteTelefono2 = "" ;
      Z64ClienteFax = "" ;
      Z65ClienteDicose = "" ;
      Z66ClienteIdDepartamento = 0 ;
      Z67ClienteIdLocalidad = 0 ;
      Z68ClienteTecnico1 = 0 ;
      Z69ClienteTecnico2 = 0 ;
      Z70ClienteIdAgencia = 0 ;
      Z71ClienteContrato = (short)(0) ;
      Z72ClienteSocio = (short)(0) ;
      Z73ClienteNoUsar = (short)(0) ;
      Z74ClienteCodbar = (short)(0) ;
      Z75ClienteCaravanas = (short)(0) ;
      Z76ClienteProlesa = (short)(0) ;
      Z77ClienteProlesaSuc = 0 ;
      Z168ClienteProlesaMat = 0 ;
      Z78ClienteObservaciones = "" ;
      Z79ClienteFacRsocial = "" ;
      Z80ClienteFacCedula = "" ;
      Z81ClienteFacRut = "" ;
      Z82ClienteFacDireccion = "" ;
      Z83ClienteFacLocalidad = "" ;
      Z84ClienteFacDepartamento = 0 ;
      Z85ClienteFacCpostal = "" ;
      Z86ClienteFacGiro = 0 ;
      Z87ClienteCobNombreTelefono1 = "" ;
      Z88ClienteFacTelefonos = "" ;
      Z89ClienteCobNombreTelefono2 = "" ;
      Z90ClienteCobTelefono2 = "" ;
      Z91ClienteCobNombreCelular1 = "" ;
      Z92ClienteCobCelular1 = "" ;
      Z93ClienteCobNombreCelular2 = "" ;
      Z94ClienteCobCelular2 = "" ;
      Z95ClienteCobNombreEmail1 = "" ;
      Z96ClienteCobEmail1 = "" ;
      Z97ClienteCobNombreEmail2 = "" ;
      Z98ClienteCobEmail2 = "" ;
      Z99ClienteFacFax = "" ;
      Z100ClienteFacEmail = "" ;
      Z101ClienteFacContrato = "" ;
      Z102ClienteFacObservaciones = "" ;
      Z103ClienteFacLista = 0 ;
      Z104ClienteFacContado = (short)(0) ;
      Z105ClienteNotEmailFrascos1 = "" ;
      Z106ClienteNotEmailFrascos2 = "" ;
      Z107ClienteNotEmailMuestra1 = "" ;
      Z108ClienteNotEmailMuestra2 = "" ;
      Z109ClienteNotEmailAnalisis1 = "" ;
      Z110ClienteNotEmailAnalisis2 = "" ;
      Z111ClienteNotEmailGeneral1 = "" ;
      Z112ClienteNotEmailGeneral2 = "" ;
      Z113ClienteIncobrable = (short)(0) ;
   }

   public void initAll044( )
   {
      A4ClienteId = 0 ;
      initializeNonKey044( ) ;
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

   public void VarsToRow4( com.colaveco.SdtCliente obj4 )
   {
      obj4.setgxTv_SdtCliente_Mode( Gx_mode );
      obj4.setgxTv_SdtCliente_Clientenombre( A45ClienteNombre );
      obj4.setgxTv_SdtCliente_Clienteemail( A46ClienteEmail );
      obj4.setgxTv_SdtCliente_Clientenombreemail1( A47ClienteNombreEmail1 );
      obj4.setgxTv_SdtCliente_Clienteemail1( A48ClienteEmail1 );
      obj4.setgxTv_SdtCliente_Clientenombreemail2( A49ClienteNombreEmail2 );
      obj4.setgxTv_SdtCliente_Clienteemail2( A50ClienteEmail2 );
      obj4.setgxTv_SdtCliente_Clienteenvio( A51ClienteEnvio );
      obj4.setgxTv_SdtCliente_Clienteusuarioweb( A52ClienteUsuarioWeb );
      obj4.setgxTv_SdtCliente_Clientenombrecelular1( A53ClienteNombreCelular1 );
      obj4.setgxTv_SdtCliente_Clientecelular1( A54ClienteCelular1 );
      obj4.setgxTv_SdtCliente_Clientenombrecelular2( A55ClienteNombreCelular2 );
      obj4.setgxTv_SdtCliente_Clientecelular2( A56ClienteCelular2 );
      obj4.setgxTv_SdtCliente_Clientecodigofigaro( A57ClienteCodigoFigaro );
      obj4.setgxTv_SdtCliente_Clientetipousuario( A58ClienteTipoUsuario );
      obj4.setgxTv_SdtCliente_Clientedireccion( A59ClienteDireccion );
      obj4.setgxTv_SdtCliente_Clientenombretelefono1( A60ClienteNombreTelefono1 );
      obj4.setgxTv_SdtCliente_Clientetelefono1( A61ClienteTelefono1 );
      obj4.setgxTv_SdtCliente_Clientenombretelefono2( A62ClienteNombreTelefono2 );
      obj4.setgxTv_SdtCliente_Clientetelefono2( A63ClienteTelefono2 );
      obj4.setgxTv_SdtCliente_Clientefax( A64ClienteFax );
      obj4.setgxTv_SdtCliente_Clientedicose( A65ClienteDicose );
      obj4.setgxTv_SdtCliente_Clienteiddepartamento( A66ClienteIdDepartamento );
      obj4.setgxTv_SdtCliente_Clienteidlocalidad( A67ClienteIdLocalidad );
      obj4.setgxTv_SdtCliente_Clientetecnico1( A68ClienteTecnico1 );
      obj4.setgxTv_SdtCliente_Clientetecnico2( A69ClienteTecnico2 );
      obj4.setgxTv_SdtCliente_Clienteidagencia( A70ClienteIdAgencia );
      obj4.setgxTv_SdtCliente_Clientecontrato( A71ClienteContrato );
      obj4.setgxTv_SdtCliente_Clientesocio( A72ClienteSocio );
      obj4.setgxTv_SdtCliente_Clientenousar( A73ClienteNoUsar );
      obj4.setgxTv_SdtCliente_Clientecodbar( A74ClienteCodbar );
      obj4.setgxTv_SdtCliente_Clientecaravanas( A75ClienteCaravanas );
      obj4.setgxTv_SdtCliente_Clienteprolesa( A76ClienteProlesa );
      obj4.setgxTv_SdtCliente_Clienteprolesasuc( A77ClienteProlesaSuc );
      obj4.setgxTv_SdtCliente_Clienteprolesamat( A168ClienteProlesaMat );
      obj4.setgxTv_SdtCliente_Clienteobservaciones( A78ClienteObservaciones );
      obj4.setgxTv_SdtCliente_Clientefacrsocial( A79ClienteFacRsocial );
      obj4.setgxTv_SdtCliente_Clientefaccedula( A80ClienteFacCedula );
      obj4.setgxTv_SdtCliente_Clientefacrut( A81ClienteFacRut );
      obj4.setgxTv_SdtCliente_Clientefacdireccion( A82ClienteFacDireccion );
      obj4.setgxTv_SdtCliente_Clientefaclocalidad( A83ClienteFacLocalidad );
      obj4.setgxTv_SdtCliente_Clientefacdepartamento( A84ClienteFacDepartamento );
      obj4.setgxTv_SdtCliente_Clientefaccpostal( A85ClienteFacCpostal );
      obj4.setgxTv_SdtCliente_Clientefacgiro( A86ClienteFacGiro );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono1( A87ClienteCobNombreTelefono1 );
      obj4.setgxTv_SdtCliente_Clientefactelefonos( A88ClienteFacTelefonos );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono2( A89ClienteCobNombreTelefono2 );
      obj4.setgxTv_SdtCliente_Clientecobtelefono2( A90ClienteCobTelefono2 );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular1( A91ClienteCobNombreCelular1 );
      obj4.setgxTv_SdtCliente_Clientecobcelular1( A92ClienteCobCelular1 );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular2( A93ClienteCobNombreCelular2 );
      obj4.setgxTv_SdtCliente_Clientecobcelular2( A94ClienteCobCelular2 );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail1( A95ClienteCobNombreEmail1 );
      obj4.setgxTv_SdtCliente_Clientecobemail1( A96ClienteCobEmail1 );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail2( A97ClienteCobNombreEmail2 );
      obj4.setgxTv_SdtCliente_Clientecobemail2( A98ClienteCobEmail2 );
      obj4.setgxTv_SdtCliente_Clientefacfax( A99ClienteFacFax );
      obj4.setgxTv_SdtCliente_Clientefacemail( A100ClienteFacEmail );
      obj4.setgxTv_SdtCliente_Clientefaccontrato( A101ClienteFacContrato );
      obj4.setgxTv_SdtCliente_Clientefacobservaciones( A102ClienteFacObservaciones );
      obj4.setgxTv_SdtCliente_Clientefaclista( A103ClienteFacLista );
      obj4.setgxTv_SdtCliente_Clientefaccontado( A104ClienteFacContado );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos1( A105ClienteNotEmailFrascos1 );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos2( A106ClienteNotEmailFrascos2 );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra1( A107ClienteNotEmailMuestra1 );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra2( A108ClienteNotEmailMuestra2 );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis1( A109ClienteNotEmailAnalisis1 );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis2( A110ClienteNotEmailAnalisis2 );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral1( A111ClienteNotEmailGeneral1 );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral2( A112ClienteNotEmailGeneral2 );
      obj4.setgxTv_SdtCliente_Clienteincobrable( A113ClienteIncobrable );
      obj4.setgxTv_SdtCliente_Clienteid( A4ClienteId );
      obj4.setgxTv_SdtCliente_Clienteid_Z( Z4ClienteId );
      obj4.setgxTv_SdtCliente_Clientenombre_Z( Z45ClienteNombre );
      obj4.setgxTv_SdtCliente_Clienteemail_Z( Z46ClienteEmail );
      obj4.setgxTv_SdtCliente_Clientenombreemail1_Z( Z47ClienteNombreEmail1 );
      obj4.setgxTv_SdtCliente_Clienteemail1_Z( Z48ClienteEmail1 );
      obj4.setgxTv_SdtCliente_Clientenombreemail2_Z( Z49ClienteNombreEmail2 );
      obj4.setgxTv_SdtCliente_Clienteemail2_Z( Z50ClienteEmail2 );
      obj4.setgxTv_SdtCliente_Clienteenvio_Z( Z51ClienteEnvio );
      obj4.setgxTv_SdtCliente_Clienteusuarioweb_Z( Z52ClienteUsuarioWeb );
      obj4.setgxTv_SdtCliente_Clientenombrecelular1_Z( Z53ClienteNombreCelular1 );
      obj4.setgxTv_SdtCliente_Clientecelular1_Z( Z54ClienteCelular1 );
      obj4.setgxTv_SdtCliente_Clientenombrecelular2_Z( Z55ClienteNombreCelular2 );
      obj4.setgxTv_SdtCliente_Clientecelular2_Z( Z56ClienteCelular2 );
      obj4.setgxTv_SdtCliente_Clientecodigofigaro_Z( Z57ClienteCodigoFigaro );
      obj4.setgxTv_SdtCliente_Clientetipousuario_Z( Z58ClienteTipoUsuario );
      obj4.setgxTv_SdtCliente_Clientedireccion_Z( Z59ClienteDireccion );
      obj4.setgxTv_SdtCliente_Clientenombretelefono1_Z( Z60ClienteNombreTelefono1 );
      obj4.setgxTv_SdtCliente_Clientetelefono1_Z( Z61ClienteTelefono1 );
      obj4.setgxTv_SdtCliente_Clientenombretelefono2_Z( Z62ClienteNombreTelefono2 );
      obj4.setgxTv_SdtCliente_Clientetelefono2_Z( Z63ClienteTelefono2 );
      obj4.setgxTv_SdtCliente_Clientefax_Z( Z64ClienteFax );
      obj4.setgxTv_SdtCliente_Clientedicose_Z( Z65ClienteDicose );
      obj4.setgxTv_SdtCliente_Clienteiddepartamento_Z( Z66ClienteIdDepartamento );
      obj4.setgxTv_SdtCliente_Clienteidlocalidad_Z( Z67ClienteIdLocalidad );
      obj4.setgxTv_SdtCliente_Clientetecnico1_Z( Z68ClienteTecnico1 );
      obj4.setgxTv_SdtCliente_Clientetecnico2_Z( Z69ClienteTecnico2 );
      obj4.setgxTv_SdtCliente_Clienteidagencia_Z( Z70ClienteIdAgencia );
      obj4.setgxTv_SdtCliente_Clientecontrato_Z( Z71ClienteContrato );
      obj4.setgxTv_SdtCliente_Clientesocio_Z( Z72ClienteSocio );
      obj4.setgxTv_SdtCliente_Clientenousar_Z( Z73ClienteNoUsar );
      obj4.setgxTv_SdtCliente_Clientecodbar_Z( Z74ClienteCodbar );
      obj4.setgxTv_SdtCliente_Clientecaravanas_Z( Z75ClienteCaravanas );
      obj4.setgxTv_SdtCliente_Clienteprolesa_Z( Z76ClienteProlesa );
      obj4.setgxTv_SdtCliente_Clienteprolesasuc_Z( Z77ClienteProlesaSuc );
      obj4.setgxTv_SdtCliente_Clienteprolesamat_Z( Z168ClienteProlesaMat );
      obj4.setgxTv_SdtCliente_Clienteobservaciones_Z( Z78ClienteObservaciones );
      obj4.setgxTv_SdtCliente_Clientefacrsocial_Z( Z79ClienteFacRsocial );
      obj4.setgxTv_SdtCliente_Clientefaccedula_Z( Z80ClienteFacCedula );
      obj4.setgxTv_SdtCliente_Clientefacrut_Z( Z81ClienteFacRut );
      obj4.setgxTv_SdtCliente_Clientefacdireccion_Z( Z82ClienteFacDireccion );
      obj4.setgxTv_SdtCliente_Clientefaclocalidad_Z( Z83ClienteFacLocalidad );
      obj4.setgxTv_SdtCliente_Clientefacdepartamento_Z( Z84ClienteFacDepartamento );
      obj4.setgxTv_SdtCliente_Clientefaccpostal_Z( Z85ClienteFacCpostal );
      obj4.setgxTv_SdtCliente_Clientefacgiro_Z( Z86ClienteFacGiro );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono1_Z( Z87ClienteCobNombreTelefono1 );
      obj4.setgxTv_SdtCliente_Clientefactelefonos_Z( Z88ClienteFacTelefonos );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono2_Z( Z89ClienteCobNombreTelefono2 );
      obj4.setgxTv_SdtCliente_Clientecobtelefono2_Z( Z90ClienteCobTelefono2 );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular1_Z( Z91ClienteCobNombreCelular1 );
      obj4.setgxTv_SdtCliente_Clientecobcelular1_Z( Z92ClienteCobCelular1 );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular2_Z( Z93ClienteCobNombreCelular2 );
      obj4.setgxTv_SdtCliente_Clientecobcelular2_Z( Z94ClienteCobCelular2 );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail1_Z( Z95ClienteCobNombreEmail1 );
      obj4.setgxTv_SdtCliente_Clientecobemail1_Z( Z96ClienteCobEmail1 );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail2_Z( Z97ClienteCobNombreEmail2 );
      obj4.setgxTv_SdtCliente_Clientecobemail2_Z( Z98ClienteCobEmail2 );
      obj4.setgxTv_SdtCliente_Clientefacfax_Z( Z99ClienteFacFax );
      obj4.setgxTv_SdtCliente_Clientefacemail_Z( Z100ClienteFacEmail );
      obj4.setgxTv_SdtCliente_Clientefaccontrato_Z( Z101ClienteFacContrato );
      obj4.setgxTv_SdtCliente_Clientefacobservaciones_Z( Z102ClienteFacObservaciones );
      obj4.setgxTv_SdtCliente_Clientefaclista_Z( Z103ClienteFacLista );
      obj4.setgxTv_SdtCliente_Clientefaccontado_Z( Z104ClienteFacContado );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos1_Z( Z105ClienteNotEmailFrascos1 );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos2_Z( Z106ClienteNotEmailFrascos2 );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra1_Z( Z107ClienteNotEmailMuestra1 );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra2_Z( Z108ClienteNotEmailMuestra2 );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis1_Z( Z109ClienteNotEmailAnalisis1 );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis2_Z( Z110ClienteNotEmailAnalisis2 );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral1_Z( Z111ClienteNotEmailGeneral1 );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral2_Z( Z112ClienteNotEmailGeneral2 );
      obj4.setgxTv_SdtCliente_Clienteincobrable_Z( Z113ClienteIncobrable );
      obj4.setgxTv_SdtCliente_Clientenombre_N( (byte)((byte)((n45ClienteNombre)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteemail_N( (byte)((byte)((n46ClienteEmail)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombreemail1_N( (byte)((byte)((n47ClienteNombreEmail1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteemail1_N( (byte)((byte)((n48ClienteEmail1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombreemail2_N( (byte)((byte)((n49ClienteNombreEmail2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteemail2_N( (byte)((byte)((n50ClienteEmail2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteenvio_N( (byte)((byte)((n51ClienteEnvio)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteusuarioweb_N( (byte)((byte)((n52ClienteUsuarioWeb)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombrecelular1_N( (byte)((byte)((n53ClienteNombreCelular1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecelular1_N( (byte)((byte)((n54ClienteCelular1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombrecelular2_N( (byte)((byte)((n55ClienteNombreCelular2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecelular2_N( (byte)((byte)((n56ClienteCelular2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecodigofigaro_N( (byte)((byte)((n57ClienteCodigoFigaro)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientetipousuario_N( (byte)((byte)((n58ClienteTipoUsuario)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientedireccion_N( (byte)((byte)((n59ClienteDireccion)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombretelefono1_N( (byte)((byte)((n60ClienteNombreTelefono1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientetelefono1_N( (byte)((byte)((n61ClienteTelefono1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenombretelefono2_N( (byte)((byte)((n62ClienteNombreTelefono2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientetelefono2_N( (byte)((byte)((n63ClienteTelefono2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefax_N( (byte)((byte)((n64ClienteFax)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientedicose_N( (byte)((byte)((n65ClienteDicose)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteiddepartamento_N( (byte)((byte)((n66ClienteIdDepartamento)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteidlocalidad_N( (byte)((byte)((n67ClienteIdLocalidad)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientetecnico1_N( (byte)((byte)((n68ClienteTecnico1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientetecnico2_N( (byte)((byte)((n69ClienteTecnico2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteidagencia_N( (byte)((byte)((n70ClienteIdAgencia)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecontrato_N( (byte)((byte)((n71ClienteContrato)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientesocio_N( (byte)((byte)((n72ClienteSocio)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenousar_N( (byte)((byte)((n73ClienteNoUsar)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecodbar_N( (byte)((byte)((n74ClienteCodbar)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecaravanas_N( (byte)((byte)((n75ClienteCaravanas)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteprolesa_N( (byte)((byte)((n76ClienteProlesa)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteprolesasuc_N( (byte)((byte)((n77ClienteProlesaSuc)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteobservaciones_N( (byte)((byte)((n78ClienteObservaciones)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacrsocial_N( (byte)((byte)((n79ClienteFacRsocial)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaccedula_N( (byte)((byte)((n80ClienteFacCedula)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacrut_N( (byte)((byte)((n81ClienteFacRut)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacdireccion_N( (byte)((byte)((n82ClienteFacDireccion)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaclocalidad_N( (byte)((byte)((n83ClienteFacLocalidad)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacdepartamento_N( (byte)((byte)((n84ClienteFacDepartamento)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaccpostal_N( (byte)((byte)((n85ClienteFacCpostal)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacgiro_N( (byte)((byte)((n86ClienteFacGiro)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono1_N( (byte)((byte)((n87ClienteCobNombreTelefono1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefactelefonos_N( (byte)((byte)((n88ClienteFacTelefonos)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombretelefono2_N( (byte)((byte)((n89ClienteCobNombreTelefono2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobtelefono2_N( (byte)((byte)((n90ClienteCobTelefono2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular1_N( (byte)((byte)((n91ClienteCobNombreCelular1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobcelular1_N( (byte)((byte)((n92ClienteCobCelular1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombrecelular2_N( (byte)((byte)((n93ClienteCobNombreCelular2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobcelular2_N( (byte)((byte)((n94ClienteCobCelular2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail1_N( (byte)((byte)((n95ClienteCobNombreEmail1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobemail1_N( (byte)((byte)((n96ClienteCobEmail1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobnombreemail2_N( (byte)((byte)((n97ClienteCobNombreEmail2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientecobemail2_N( (byte)((byte)((n98ClienteCobEmail2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacfax_N( (byte)((byte)((n99ClienteFacFax)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacemail_N( (byte)((byte)((n100ClienteFacEmail)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaccontrato_N( (byte)((byte)((n101ClienteFacContrato)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefacobservaciones_N( (byte)((byte)((n102ClienteFacObservaciones)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaclista_N( (byte)((byte)((n103ClienteFacLista)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientefaccontado_N( (byte)((byte)((n104ClienteFacContado)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos1_N( (byte)((byte)((n105ClienteNotEmailFrascos1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailfrascos2_N( (byte)((byte)((n106ClienteNotEmailFrascos2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra1_N( (byte)((byte)((n107ClienteNotEmailMuestra1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailmuestra2_N( (byte)((byte)((n108ClienteNotEmailMuestra2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis1_N( (byte)((byte)((n109ClienteNotEmailAnalisis1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailanalisis2_N( (byte)((byte)((n110ClienteNotEmailAnalisis2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral1_N( (byte)((byte)((n111ClienteNotEmailGeneral1)?1:0)) );
      obj4.setgxTv_SdtCliente_Clientenotemailgeneral2_N( (byte)((byte)((n112ClienteNotEmailGeneral2)?1:0)) );
      obj4.setgxTv_SdtCliente_Clienteincobrable_N( (byte)((byte)((n113ClienteIncobrable)?1:0)) );
      obj4.setgxTv_SdtCliente_Mode( Gx_mode );
   }

   public void KeyVarsToRow4( com.colaveco.SdtCliente obj4 )
   {
      obj4.setgxTv_SdtCliente_Clienteid( A4ClienteId );
   }

   public void RowToVars4( com.colaveco.SdtCliente obj4 ,
                           int forceLoad )
   {
      Gx_mode = obj4.getgxTv_SdtCliente_Mode() ;
      A45ClienteNombre = obj4.getgxTv_SdtCliente_Clientenombre() ;
      n45ClienteNombre = false ;
      A46ClienteEmail = obj4.getgxTv_SdtCliente_Clienteemail() ;
      n46ClienteEmail = false ;
      A47ClienteNombreEmail1 = obj4.getgxTv_SdtCliente_Clientenombreemail1() ;
      n47ClienteNombreEmail1 = false ;
      A48ClienteEmail1 = obj4.getgxTv_SdtCliente_Clienteemail1() ;
      n48ClienteEmail1 = false ;
      A49ClienteNombreEmail2 = obj4.getgxTv_SdtCliente_Clientenombreemail2() ;
      n49ClienteNombreEmail2 = false ;
      A50ClienteEmail2 = obj4.getgxTv_SdtCliente_Clienteemail2() ;
      n50ClienteEmail2 = false ;
      A51ClienteEnvio = obj4.getgxTv_SdtCliente_Clienteenvio() ;
      n51ClienteEnvio = false ;
      A52ClienteUsuarioWeb = obj4.getgxTv_SdtCliente_Clienteusuarioweb() ;
      n52ClienteUsuarioWeb = false ;
      A53ClienteNombreCelular1 = obj4.getgxTv_SdtCliente_Clientenombrecelular1() ;
      n53ClienteNombreCelular1 = false ;
      A54ClienteCelular1 = obj4.getgxTv_SdtCliente_Clientecelular1() ;
      n54ClienteCelular1 = false ;
      A55ClienteNombreCelular2 = obj4.getgxTv_SdtCliente_Clientenombrecelular2() ;
      n55ClienteNombreCelular2 = false ;
      A56ClienteCelular2 = obj4.getgxTv_SdtCliente_Clientecelular2() ;
      n56ClienteCelular2 = false ;
      A57ClienteCodigoFigaro = obj4.getgxTv_SdtCliente_Clientecodigofigaro() ;
      n57ClienteCodigoFigaro = false ;
      A58ClienteTipoUsuario = obj4.getgxTv_SdtCliente_Clientetipousuario() ;
      n58ClienteTipoUsuario = false ;
      A59ClienteDireccion = obj4.getgxTv_SdtCliente_Clientedireccion() ;
      n59ClienteDireccion = false ;
      A60ClienteNombreTelefono1 = obj4.getgxTv_SdtCliente_Clientenombretelefono1() ;
      n60ClienteNombreTelefono1 = false ;
      A61ClienteTelefono1 = obj4.getgxTv_SdtCliente_Clientetelefono1() ;
      n61ClienteTelefono1 = false ;
      A62ClienteNombreTelefono2 = obj4.getgxTv_SdtCliente_Clientenombretelefono2() ;
      n62ClienteNombreTelefono2 = false ;
      A63ClienteTelefono2 = obj4.getgxTv_SdtCliente_Clientetelefono2() ;
      n63ClienteTelefono2 = false ;
      A64ClienteFax = obj4.getgxTv_SdtCliente_Clientefax() ;
      n64ClienteFax = false ;
      A65ClienteDicose = obj4.getgxTv_SdtCliente_Clientedicose() ;
      n65ClienteDicose = false ;
      A66ClienteIdDepartamento = obj4.getgxTv_SdtCliente_Clienteiddepartamento() ;
      n66ClienteIdDepartamento = false ;
      A67ClienteIdLocalidad = obj4.getgxTv_SdtCliente_Clienteidlocalidad() ;
      n67ClienteIdLocalidad = false ;
      A68ClienteTecnico1 = obj4.getgxTv_SdtCliente_Clientetecnico1() ;
      n68ClienteTecnico1 = false ;
      A69ClienteTecnico2 = obj4.getgxTv_SdtCliente_Clientetecnico2() ;
      n69ClienteTecnico2 = false ;
      A70ClienteIdAgencia = obj4.getgxTv_SdtCliente_Clienteidagencia() ;
      n70ClienteIdAgencia = false ;
      A71ClienteContrato = obj4.getgxTv_SdtCliente_Clientecontrato() ;
      n71ClienteContrato = false ;
      A72ClienteSocio = obj4.getgxTv_SdtCliente_Clientesocio() ;
      n72ClienteSocio = false ;
      A73ClienteNoUsar = obj4.getgxTv_SdtCliente_Clientenousar() ;
      n73ClienteNoUsar = false ;
      A74ClienteCodbar = obj4.getgxTv_SdtCliente_Clientecodbar() ;
      n74ClienteCodbar = false ;
      A75ClienteCaravanas = obj4.getgxTv_SdtCliente_Clientecaravanas() ;
      n75ClienteCaravanas = false ;
      A76ClienteProlesa = obj4.getgxTv_SdtCliente_Clienteprolesa() ;
      n76ClienteProlesa = false ;
      A77ClienteProlesaSuc = obj4.getgxTv_SdtCliente_Clienteprolesasuc() ;
      n77ClienteProlesaSuc = false ;
      A168ClienteProlesaMat = obj4.getgxTv_SdtCliente_Clienteprolesamat() ;
      A78ClienteObservaciones = obj4.getgxTv_SdtCliente_Clienteobservaciones() ;
      n78ClienteObservaciones = false ;
      A79ClienteFacRsocial = obj4.getgxTv_SdtCliente_Clientefacrsocial() ;
      n79ClienteFacRsocial = false ;
      A80ClienteFacCedula = obj4.getgxTv_SdtCliente_Clientefaccedula() ;
      n80ClienteFacCedula = false ;
      A81ClienteFacRut = obj4.getgxTv_SdtCliente_Clientefacrut() ;
      n81ClienteFacRut = false ;
      A82ClienteFacDireccion = obj4.getgxTv_SdtCliente_Clientefacdireccion() ;
      n82ClienteFacDireccion = false ;
      A83ClienteFacLocalidad = obj4.getgxTv_SdtCliente_Clientefaclocalidad() ;
      n83ClienteFacLocalidad = false ;
      A84ClienteFacDepartamento = obj4.getgxTv_SdtCliente_Clientefacdepartamento() ;
      n84ClienteFacDepartamento = false ;
      A85ClienteFacCpostal = obj4.getgxTv_SdtCliente_Clientefaccpostal() ;
      n85ClienteFacCpostal = false ;
      A86ClienteFacGiro = obj4.getgxTv_SdtCliente_Clientefacgiro() ;
      n86ClienteFacGiro = false ;
      A87ClienteCobNombreTelefono1 = obj4.getgxTv_SdtCliente_Clientecobnombretelefono1() ;
      n87ClienteCobNombreTelefono1 = false ;
      A88ClienteFacTelefonos = obj4.getgxTv_SdtCliente_Clientefactelefonos() ;
      n88ClienteFacTelefonos = false ;
      A89ClienteCobNombreTelefono2 = obj4.getgxTv_SdtCliente_Clientecobnombretelefono2() ;
      n89ClienteCobNombreTelefono2 = false ;
      A90ClienteCobTelefono2 = obj4.getgxTv_SdtCliente_Clientecobtelefono2() ;
      n90ClienteCobTelefono2 = false ;
      A91ClienteCobNombreCelular1 = obj4.getgxTv_SdtCliente_Clientecobnombrecelular1() ;
      n91ClienteCobNombreCelular1 = false ;
      A92ClienteCobCelular1 = obj4.getgxTv_SdtCliente_Clientecobcelular1() ;
      n92ClienteCobCelular1 = false ;
      A93ClienteCobNombreCelular2 = obj4.getgxTv_SdtCliente_Clientecobnombrecelular2() ;
      n93ClienteCobNombreCelular2 = false ;
      A94ClienteCobCelular2 = obj4.getgxTv_SdtCliente_Clientecobcelular2() ;
      n94ClienteCobCelular2 = false ;
      A95ClienteCobNombreEmail1 = obj4.getgxTv_SdtCliente_Clientecobnombreemail1() ;
      n95ClienteCobNombreEmail1 = false ;
      A96ClienteCobEmail1 = obj4.getgxTv_SdtCliente_Clientecobemail1() ;
      n96ClienteCobEmail1 = false ;
      A97ClienteCobNombreEmail2 = obj4.getgxTv_SdtCliente_Clientecobnombreemail2() ;
      n97ClienteCobNombreEmail2 = false ;
      A98ClienteCobEmail2 = obj4.getgxTv_SdtCliente_Clientecobemail2() ;
      n98ClienteCobEmail2 = false ;
      A99ClienteFacFax = obj4.getgxTv_SdtCliente_Clientefacfax() ;
      n99ClienteFacFax = false ;
      A100ClienteFacEmail = obj4.getgxTv_SdtCliente_Clientefacemail() ;
      n100ClienteFacEmail = false ;
      A101ClienteFacContrato = obj4.getgxTv_SdtCliente_Clientefaccontrato() ;
      n101ClienteFacContrato = false ;
      A102ClienteFacObservaciones = obj4.getgxTv_SdtCliente_Clientefacobservaciones() ;
      n102ClienteFacObservaciones = false ;
      A103ClienteFacLista = obj4.getgxTv_SdtCliente_Clientefaclista() ;
      n103ClienteFacLista = false ;
      A104ClienteFacContado = obj4.getgxTv_SdtCliente_Clientefaccontado() ;
      n104ClienteFacContado = false ;
      A105ClienteNotEmailFrascos1 = obj4.getgxTv_SdtCliente_Clientenotemailfrascos1() ;
      n105ClienteNotEmailFrascos1 = false ;
      A106ClienteNotEmailFrascos2 = obj4.getgxTv_SdtCliente_Clientenotemailfrascos2() ;
      n106ClienteNotEmailFrascos2 = false ;
      A107ClienteNotEmailMuestra1 = obj4.getgxTv_SdtCliente_Clientenotemailmuestra1() ;
      n107ClienteNotEmailMuestra1 = false ;
      A108ClienteNotEmailMuestra2 = obj4.getgxTv_SdtCliente_Clientenotemailmuestra2() ;
      n108ClienteNotEmailMuestra2 = false ;
      A109ClienteNotEmailAnalisis1 = obj4.getgxTv_SdtCliente_Clientenotemailanalisis1() ;
      n109ClienteNotEmailAnalisis1 = false ;
      A110ClienteNotEmailAnalisis2 = obj4.getgxTv_SdtCliente_Clientenotemailanalisis2() ;
      n110ClienteNotEmailAnalisis2 = false ;
      A111ClienteNotEmailGeneral1 = obj4.getgxTv_SdtCliente_Clientenotemailgeneral1() ;
      n111ClienteNotEmailGeneral1 = false ;
      A112ClienteNotEmailGeneral2 = obj4.getgxTv_SdtCliente_Clientenotemailgeneral2() ;
      n112ClienteNotEmailGeneral2 = false ;
      A113ClienteIncobrable = obj4.getgxTv_SdtCliente_Clienteincobrable() ;
      n113ClienteIncobrable = false ;
      A4ClienteId = obj4.getgxTv_SdtCliente_Clienteid() ;
      Z4ClienteId = obj4.getgxTv_SdtCliente_Clienteid_Z() ;
      Z45ClienteNombre = obj4.getgxTv_SdtCliente_Clientenombre_Z() ;
      Z46ClienteEmail = obj4.getgxTv_SdtCliente_Clienteemail_Z() ;
      Z47ClienteNombreEmail1 = obj4.getgxTv_SdtCliente_Clientenombreemail1_Z() ;
      Z48ClienteEmail1 = obj4.getgxTv_SdtCliente_Clienteemail1_Z() ;
      Z49ClienteNombreEmail2 = obj4.getgxTv_SdtCliente_Clientenombreemail2_Z() ;
      Z50ClienteEmail2 = obj4.getgxTv_SdtCliente_Clienteemail2_Z() ;
      Z51ClienteEnvio = obj4.getgxTv_SdtCliente_Clienteenvio_Z() ;
      Z52ClienteUsuarioWeb = obj4.getgxTv_SdtCliente_Clienteusuarioweb_Z() ;
      Z53ClienteNombreCelular1 = obj4.getgxTv_SdtCliente_Clientenombrecelular1_Z() ;
      Z54ClienteCelular1 = obj4.getgxTv_SdtCliente_Clientecelular1_Z() ;
      Z55ClienteNombreCelular2 = obj4.getgxTv_SdtCliente_Clientenombrecelular2_Z() ;
      Z56ClienteCelular2 = obj4.getgxTv_SdtCliente_Clientecelular2_Z() ;
      Z57ClienteCodigoFigaro = obj4.getgxTv_SdtCliente_Clientecodigofigaro_Z() ;
      Z58ClienteTipoUsuario = obj4.getgxTv_SdtCliente_Clientetipousuario_Z() ;
      Z59ClienteDireccion = obj4.getgxTv_SdtCliente_Clientedireccion_Z() ;
      Z60ClienteNombreTelefono1 = obj4.getgxTv_SdtCliente_Clientenombretelefono1_Z() ;
      Z61ClienteTelefono1 = obj4.getgxTv_SdtCliente_Clientetelefono1_Z() ;
      Z62ClienteNombreTelefono2 = obj4.getgxTv_SdtCliente_Clientenombretelefono2_Z() ;
      Z63ClienteTelefono2 = obj4.getgxTv_SdtCliente_Clientetelefono2_Z() ;
      Z64ClienteFax = obj4.getgxTv_SdtCliente_Clientefax_Z() ;
      Z65ClienteDicose = obj4.getgxTv_SdtCliente_Clientedicose_Z() ;
      Z66ClienteIdDepartamento = obj4.getgxTv_SdtCliente_Clienteiddepartamento_Z() ;
      Z67ClienteIdLocalidad = obj4.getgxTv_SdtCliente_Clienteidlocalidad_Z() ;
      Z68ClienteTecnico1 = obj4.getgxTv_SdtCliente_Clientetecnico1_Z() ;
      Z69ClienteTecnico2 = obj4.getgxTv_SdtCliente_Clientetecnico2_Z() ;
      Z70ClienteIdAgencia = obj4.getgxTv_SdtCliente_Clienteidagencia_Z() ;
      Z71ClienteContrato = obj4.getgxTv_SdtCliente_Clientecontrato_Z() ;
      Z72ClienteSocio = obj4.getgxTv_SdtCliente_Clientesocio_Z() ;
      Z73ClienteNoUsar = obj4.getgxTv_SdtCliente_Clientenousar_Z() ;
      Z74ClienteCodbar = obj4.getgxTv_SdtCliente_Clientecodbar_Z() ;
      Z75ClienteCaravanas = obj4.getgxTv_SdtCliente_Clientecaravanas_Z() ;
      Z76ClienteProlesa = obj4.getgxTv_SdtCliente_Clienteprolesa_Z() ;
      Z77ClienteProlesaSuc = obj4.getgxTv_SdtCliente_Clienteprolesasuc_Z() ;
      Z168ClienteProlesaMat = obj4.getgxTv_SdtCliente_Clienteprolesamat_Z() ;
      Z78ClienteObservaciones = obj4.getgxTv_SdtCliente_Clienteobservaciones_Z() ;
      Z79ClienteFacRsocial = obj4.getgxTv_SdtCliente_Clientefacrsocial_Z() ;
      Z80ClienteFacCedula = obj4.getgxTv_SdtCliente_Clientefaccedula_Z() ;
      Z81ClienteFacRut = obj4.getgxTv_SdtCliente_Clientefacrut_Z() ;
      Z82ClienteFacDireccion = obj4.getgxTv_SdtCliente_Clientefacdireccion_Z() ;
      Z83ClienteFacLocalidad = obj4.getgxTv_SdtCliente_Clientefaclocalidad_Z() ;
      Z84ClienteFacDepartamento = obj4.getgxTv_SdtCliente_Clientefacdepartamento_Z() ;
      Z85ClienteFacCpostal = obj4.getgxTv_SdtCliente_Clientefaccpostal_Z() ;
      Z86ClienteFacGiro = obj4.getgxTv_SdtCliente_Clientefacgiro_Z() ;
      Z87ClienteCobNombreTelefono1 = obj4.getgxTv_SdtCliente_Clientecobnombretelefono1_Z() ;
      Z88ClienteFacTelefonos = obj4.getgxTv_SdtCliente_Clientefactelefonos_Z() ;
      Z89ClienteCobNombreTelefono2 = obj4.getgxTv_SdtCliente_Clientecobnombretelefono2_Z() ;
      Z90ClienteCobTelefono2 = obj4.getgxTv_SdtCliente_Clientecobtelefono2_Z() ;
      Z91ClienteCobNombreCelular1 = obj4.getgxTv_SdtCliente_Clientecobnombrecelular1_Z() ;
      Z92ClienteCobCelular1 = obj4.getgxTv_SdtCliente_Clientecobcelular1_Z() ;
      Z93ClienteCobNombreCelular2 = obj4.getgxTv_SdtCliente_Clientecobnombrecelular2_Z() ;
      Z94ClienteCobCelular2 = obj4.getgxTv_SdtCliente_Clientecobcelular2_Z() ;
      Z95ClienteCobNombreEmail1 = obj4.getgxTv_SdtCliente_Clientecobnombreemail1_Z() ;
      Z96ClienteCobEmail1 = obj4.getgxTv_SdtCliente_Clientecobemail1_Z() ;
      Z97ClienteCobNombreEmail2 = obj4.getgxTv_SdtCliente_Clientecobnombreemail2_Z() ;
      Z98ClienteCobEmail2 = obj4.getgxTv_SdtCliente_Clientecobemail2_Z() ;
      Z99ClienteFacFax = obj4.getgxTv_SdtCliente_Clientefacfax_Z() ;
      Z100ClienteFacEmail = obj4.getgxTv_SdtCliente_Clientefacemail_Z() ;
      Z101ClienteFacContrato = obj4.getgxTv_SdtCliente_Clientefaccontrato_Z() ;
      Z102ClienteFacObservaciones = obj4.getgxTv_SdtCliente_Clientefacobservaciones_Z() ;
      Z103ClienteFacLista = obj4.getgxTv_SdtCliente_Clientefaclista_Z() ;
      Z104ClienteFacContado = obj4.getgxTv_SdtCliente_Clientefaccontado_Z() ;
      Z105ClienteNotEmailFrascos1 = obj4.getgxTv_SdtCliente_Clientenotemailfrascos1_Z() ;
      Z106ClienteNotEmailFrascos2 = obj4.getgxTv_SdtCliente_Clientenotemailfrascos2_Z() ;
      Z107ClienteNotEmailMuestra1 = obj4.getgxTv_SdtCliente_Clientenotemailmuestra1_Z() ;
      Z108ClienteNotEmailMuestra2 = obj4.getgxTv_SdtCliente_Clientenotemailmuestra2_Z() ;
      Z109ClienteNotEmailAnalisis1 = obj4.getgxTv_SdtCliente_Clientenotemailanalisis1_Z() ;
      Z110ClienteNotEmailAnalisis2 = obj4.getgxTv_SdtCliente_Clientenotemailanalisis2_Z() ;
      Z111ClienteNotEmailGeneral1 = obj4.getgxTv_SdtCliente_Clientenotemailgeneral1_Z() ;
      Z112ClienteNotEmailGeneral2 = obj4.getgxTv_SdtCliente_Clientenotemailgeneral2_Z() ;
      Z113ClienteIncobrable = obj4.getgxTv_SdtCliente_Clienteincobrable_Z() ;
      n45ClienteNombre = (boolean)((obj4.getgxTv_SdtCliente_Clientenombre_N()==0)?false:true) ;
      n46ClienteEmail = (boolean)((obj4.getgxTv_SdtCliente_Clienteemail_N()==0)?false:true) ;
      n47ClienteNombreEmail1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombreemail1_N()==0)?false:true) ;
      n48ClienteEmail1 = (boolean)((obj4.getgxTv_SdtCliente_Clienteemail1_N()==0)?false:true) ;
      n49ClienteNombreEmail2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombreemail2_N()==0)?false:true) ;
      n50ClienteEmail2 = (boolean)((obj4.getgxTv_SdtCliente_Clienteemail2_N()==0)?false:true) ;
      n51ClienteEnvio = (boolean)((obj4.getgxTv_SdtCliente_Clienteenvio_N()==0)?false:true) ;
      n52ClienteUsuarioWeb = (boolean)((obj4.getgxTv_SdtCliente_Clienteusuarioweb_N()==0)?false:true) ;
      n53ClienteNombreCelular1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombrecelular1_N()==0)?false:true) ;
      n54ClienteCelular1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecelular1_N()==0)?false:true) ;
      n55ClienteNombreCelular2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombrecelular2_N()==0)?false:true) ;
      n56ClienteCelular2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecelular2_N()==0)?false:true) ;
      n57ClienteCodigoFigaro = (boolean)((obj4.getgxTv_SdtCliente_Clientecodigofigaro_N()==0)?false:true) ;
      n58ClienteTipoUsuario = (boolean)((obj4.getgxTv_SdtCliente_Clientetipousuario_N()==0)?false:true) ;
      n59ClienteDireccion = (boolean)((obj4.getgxTv_SdtCliente_Clientedireccion_N()==0)?false:true) ;
      n60ClienteNombreTelefono1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombretelefono1_N()==0)?false:true) ;
      n61ClienteTelefono1 = (boolean)((obj4.getgxTv_SdtCliente_Clientetelefono1_N()==0)?false:true) ;
      n62ClienteNombreTelefono2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenombretelefono2_N()==0)?false:true) ;
      n63ClienteTelefono2 = (boolean)((obj4.getgxTv_SdtCliente_Clientetelefono2_N()==0)?false:true) ;
      n64ClienteFax = (boolean)((obj4.getgxTv_SdtCliente_Clientefax_N()==0)?false:true) ;
      n65ClienteDicose = (boolean)((obj4.getgxTv_SdtCliente_Clientedicose_N()==0)?false:true) ;
      n66ClienteIdDepartamento = (boolean)((obj4.getgxTv_SdtCliente_Clienteiddepartamento_N()==0)?false:true) ;
      n67ClienteIdLocalidad = (boolean)((obj4.getgxTv_SdtCliente_Clienteidlocalidad_N()==0)?false:true) ;
      n68ClienteTecnico1 = (boolean)((obj4.getgxTv_SdtCliente_Clientetecnico1_N()==0)?false:true) ;
      n69ClienteTecnico2 = (boolean)((obj4.getgxTv_SdtCliente_Clientetecnico2_N()==0)?false:true) ;
      n70ClienteIdAgencia = (boolean)((obj4.getgxTv_SdtCliente_Clienteidagencia_N()==0)?false:true) ;
      n71ClienteContrato = (boolean)((obj4.getgxTv_SdtCliente_Clientecontrato_N()==0)?false:true) ;
      n72ClienteSocio = (boolean)((obj4.getgxTv_SdtCliente_Clientesocio_N()==0)?false:true) ;
      n73ClienteNoUsar = (boolean)((obj4.getgxTv_SdtCliente_Clientenousar_N()==0)?false:true) ;
      n74ClienteCodbar = (boolean)((obj4.getgxTv_SdtCliente_Clientecodbar_N()==0)?false:true) ;
      n75ClienteCaravanas = (boolean)((obj4.getgxTv_SdtCliente_Clientecaravanas_N()==0)?false:true) ;
      n76ClienteProlesa = (boolean)((obj4.getgxTv_SdtCliente_Clienteprolesa_N()==0)?false:true) ;
      n77ClienteProlesaSuc = (boolean)((obj4.getgxTv_SdtCliente_Clienteprolesasuc_N()==0)?false:true) ;
      n78ClienteObservaciones = (boolean)((obj4.getgxTv_SdtCliente_Clienteobservaciones_N()==0)?false:true) ;
      n79ClienteFacRsocial = (boolean)((obj4.getgxTv_SdtCliente_Clientefacrsocial_N()==0)?false:true) ;
      n80ClienteFacCedula = (boolean)((obj4.getgxTv_SdtCliente_Clientefaccedula_N()==0)?false:true) ;
      n81ClienteFacRut = (boolean)((obj4.getgxTv_SdtCliente_Clientefacrut_N()==0)?false:true) ;
      n82ClienteFacDireccion = (boolean)((obj4.getgxTv_SdtCliente_Clientefacdireccion_N()==0)?false:true) ;
      n83ClienteFacLocalidad = (boolean)((obj4.getgxTv_SdtCliente_Clientefaclocalidad_N()==0)?false:true) ;
      n84ClienteFacDepartamento = (boolean)((obj4.getgxTv_SdtCliente_Clientefacdepartamento_N()==0)?false:true) ;
      n85ClienteFacCpostal = (boolean)((obj4.getgxTv_SdtCliente_Clientefaccpostal_N()==0)?false:true) ;
      n86ClienteFacGiro = (boolean)((obj4.getgxTv_SdtCliente_Clientefacgiro_N()==0)?false:true) ;
      n87ClienteCobNombreTelefono1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombretelefono1_N()==0)?false:true) ;
      n88ClienteFacTelefonos = (boolean)((obj4.getgxTv_SdtCliente_Clientefactelefonos_N()==0)?false:true) ;
      n89ClienteCobNombreTelefono2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombretelefono2_N()==0)?false:true) ;
      n90ClienteCobTelefono2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobtelefono2_N()==0)?false:true) ;
      n91ClienteCobNombreCelular1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombrecelular1_N()==0)?false:true) ;
      n92ClienteCobCelular1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobcelular1_N()==0)?false:true) ;
      n93ClienteCobNombreCelular2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombrecelular2_N()==0)?false:true) ;
      n94ClienteCobCelular2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobcelular2_N()==0)?false:true) ;
      n95ClienteCobNombreEmail1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombreemail1_N()==0)?false:true) ;
      n96ClienteCobEmail1 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobemail1_N()==0)?false:true) ;
      n97ClienteCobNombreEmail2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobnombreemail2_N()==0)?false:true) ;
      n98ClienteCobEmail2 = (boolean)((obj4.getgxTv_SdtCliente_Clientecobemail2_N()==0)?false:true) ;
      n99ClienteFacFax = (boolean)((obj4.getgxTv_SdtCliente_Clientefacfax_N()==0)?false:true) ;
      n100ClienteFacEmail = (boolean)((obj4.getgxTv_SdtCliente_Clientefacemail_N()==0)?false:true) ;
      n101ClienteFacContrato = (boolean)((obj4.getgxTv_SdtCliente_Clientefaccontrato_N()==0)?false:true) ;
      n102ClienteFacObservaciones = (boolean)((obj4.getgxTv_SdtCliente_Clientefacobservaciones_N()==0)?false:true) ;
      n103ClienteFacLista = (boolean)((obj4.getgxTv_SdtCliente_Clientefaclista_N()==0)?false:true) ;
      n104ClienteFacContado = (boolean)((obj4.getgxTv_SdtCliente_Clientefaccontado_N()==0)?false:true) ;
      n105ClienteNotEmailFrascos1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailfrascos1_N()==0)?false:true) ;
      n106ClienteNotEmailFrascos2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailfrascos2_N()==0)?false:true) ;
      n107ClienteNotEmailMuestra1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailmuestra1_N()==0)?false:true) ;
      n108ClienteNotEmailMuestra2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailmuestra2_N()==0)?false:true) ;
      n109ClienteNotEmailAnalisis1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailanalisis1_N()==0)?false:true) ;
      n110ClienteNotEmailAnalisis2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailanalisis2_N()==0)?false:true) ;
      n111ClienteNotEmailGeneral1 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailgeneral1_N()==0)?false:true) ;
      n112ClienteNotEmailGeneral2 = (boolean)((obj4.getgxTv_SdtCliente_Clientenotemailgeneral2_N()==0)?false:true) ;
      n113ClienteIncobrable = (boolean)((obj4.getgxTv_SdtCliente_Clienteincobrable_N()==0)?false:true) ;
      Gx_mode = obj4.getgxTv_SdtCliente_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A4ClienteId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey044( ) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z4ClienteId = A4ClienteId ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
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
      RowToVars4( bcCliente, 0) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z4ClienteId = A4ClienteId ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert044( ) ;
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A4ClienteId != Z4ClienteId )
            {
               A4ClienteId = Z4ClienteId ;
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
               update044( ) ;
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
               if ( A4ClienteId != Z4ClienteId )
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
                     insert044( ) ;
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
                     insert044( ) ;
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
      RowToVars4( bcCliente, 1) ;
      saveImpl( ) ;
      VarsToRow4( bcCliente) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars4( bcCliente, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      afterTrn( ) ;
      VarsToRow4( bcCliente) ;
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
         com.colaveco.SdtCliente auxBC = new com.colaveco.SdtCliente( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A4ClienteId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcCliente);
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
      RowToVars4( bcCliente, 1) ;
      updateImpl( ) ;
      VarsToRow4( bcCliente) ;
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
      RowToVars4( bcCliente, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
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
      VarsToRow4( bcCliente) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bcCliente, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A4ClienteId != Z4ClienteId )
         {
            A4ClienteId = Z4ClienteId ;
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
         if ( A4ClienteId != Z4ClienteId )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "cliente_bc");
      VarsToRow4( bcCliente) ;
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
      Gx_mode = bcCliente.getgxTv_SdtCliente_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcCliente.setgxTv_SdtCliente_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtCliente sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcCliente )
      {
         bcCliente = sdt ;
         if ( GXutil.strcmp(bcCliente.getgxTv_SdtCliente_Mode(), "") == 0 )
         {
            bcCliente.setgxTv_SdtCliente_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow4( bcCliente) ;
         }
         else
         {
            RowToVars4( bcCliente, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcCliente.getgxTv_SdtCliente_Mode(), "") == 0 )
         {
            bcCliente.setgxTv_SdtCliente_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars4( bcCliente, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtCliente getCliente_BC( )
   {
      return bcCliente ;
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
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z45ClienteNombre = "" ;
      A45ClienteNombre = "" ;
      Z46ClienteEmail = "" ;
      A46ClienteEmail = "" ;
      Z47ClienteNombreEmail1 = "" ;
      A47ClienteNombreEmail1 = "" ;
      Z48ClienteEmail1 = "" ;
      A48ClienteEmail1 = "" ;
      Z49ClienteNombreEmail2 = "" ;
      A49ClienteNombreEmail2 = "" ;
      Z50ClienteEmail2 = "" ;
      A50ClienteEmail2 = "" ;
      Z51ClienteEnvio = "" ;
      A51ClienteEnvio = "" ;
      Z52ClienteUsuarioWeb = "" ;
      A52ClienteUsuarioWeb = "" ;
      Z53ClienteNombreCelular1 = "" ;
      A53ClienteNombreCelular1 = "" ;
      Z54ClienteCelular1 = "" ;
      A54ClienteCelular1 = "" ;
      Z55ClienteNombreCelular2 = "" ;
      A55ClienteNombreCelular2 = "" ;
      Z56ClienteCelular2 = "" ;
      A56ClienteCelular2 = "" ;
      Z57ClienteCodigoFigaro = "" ;
      A57ClienteCodigoFigaro = "" ;
      Z59ClienteDireccion = "" ;
      A59ClienteDireccion = "" ;
      Z60ClienteNombreTelefono1 = "" ;
      A60ClienteNombreTelefono1 = "" ;
      Z61ClienteTelefono1 = "" ;
      A61ClienteTelefono1 = "" ;
      Z62ClienteNombreTelefono2 = "" ;
      A62ClienteNombreTelefono2 = "" ;
      Z63ClienteTelefono2 = "" ;
      A63ClienteTelefono2 = "" ;
      Z64ClienteFax = "" ;
      A64ClienteFax = "" ;
      Z65ClienteDicose = "" ;
      A65ClienteDicose = "" ;
      Z78ClienteObservaciones = "" ;
      A78ClienteObservaciones = "" ;
      Z79ClienteFacRsocial = "" ;
      A79ClienteFacRsocial = "" ;
      Z80ClienteFacCedula = "" ;
      A80ClienteFacCedula = "" ;
      Z81ClienteFacRut = "" ;
      A81ClienteFacRut = "" ;
      Z82ClienteFacDireccion = "" ;
      A82ClienteFacDireccion = "" ;
      Z83ClienteFacLocalidad = "" ;
      A83ClienteFacLocalidad = "" ;
      Z85ClienteFacCpostal = "" ;
      A85ClienteFacCpostal = "" ;
      Z87ClienteCobNombreTelefono1 = "" ;
      A87ClienteCobNombreTelefono1 = "" ;
      Z88ClienteFacTelefonos = "" ;
      A88ClienteFacTelefonos = "" ;
      Z89ClienteCobNombreTelefono2 = "" ;
      A89ClienteCobNombreTelefono2 = "" ;
      Z90ClienteCobTelefono2 = "" ;
      A90ClienteCobTelefono2 = "" ;
      Z91ClienteCobNombreCelular1 = "" ;
      A91ClienteCobNombreCelular1 = "" ;
      Z92ClienteCobCelular1 = "" ;
      A92ClienteCobCelular1 = "" ;
      Z93ClienteCobNombreCelular2 = "" ;
      A93ClienteCobNombreCelular2 = "" ;
      Z94ClienteCobCelular2 = "" ;
      A94ClienteCobCelular2 = "" ;
      Z95ClienteCobNombreEmail1 = "" ;
      A95ClienteCobNombreEmail1 = "" ;
      Z96ClienteCobEmail1 = "" ;
      A96ClienteCobEmail1 = "" ;
      Z97ClienteCobNombreEmail2 = "" ;
      A97ClienteCobNombreEmail2 = "" ;
      Z98ClienteCobEmail2 = "" ;
      A98ClienteCobEmail2 = "" ;
      Z99ClienteFacFax = "" ;
      A99ClienteFacFax = "" ;
      Z100ClienteFacEmail = "" ;
      A100ClienteFacEmail = "" ;
      Z101ClienteFacContrato = "" ;
      A101ClienteFacContrato = "" ;
      Z102ClienteFacObservaciones = "" ;
      A102ClienteFacObservaciones = "" ;
      Z105ClienteNotEmailFrascos1 = "" ;
      A105ClienteNotEmailFrascos1 = "" ;
      Z106ClienteNotEmailFrascos2 = "" ;
      A106ClienteNotEmailFrascos2 = "" ;
      Z107ClienteNotEmailMuestra1 = "" ;
      A107ClienteNotEmailMuestra1 = "" ;
      Z108ClienteNotEmailMuestra2 = "" ;
      A108ClienteNotEmailMuestra2 = "" ;
      Z109ClienteNotEmailAnalisis1 = "" ;
      A109ClienteNotEmailAnalisis1 = "" ;
      Z110ClienteNotEmailAnalisis2 = "" ;
      A110ClienteNotEmailAnalisis2 = "" ;
      Z111ClienteNotEmailGeneral1 = "" ;
      A111ClienteNotEmailGeneral1 = "" ;
      Z112ClienteNotEmailGeneral2 = "" ;
      A112ClienteNotEmailGeneral2 = "" ;
      BC00044_A4ClienteId = new long[1] ;
      BC00044_A45ClienteNombre = new String[] {""} ;
      BC00044_n45ClienteNombre = new boolean[] {false} ;
      BC00044_A46ClienteEmail = new String[] {""} ;
      BC00044_n46ClienteEmail = new boolean[] {false} ;
      BC00044_A47ClienteNombreEmail1 = new String[] {""} ;
      BC00044_n47ClienteNombreEmail1 = new boolean[] {false} ;
      BC00044_A48ClienteEmail1 = new String[] {""} ;
      BC00044_n48ClienteEmail1 = new boolean[] {false} ;
      BC00044_A49ClienteNombreEmail2 = new String[] {""} ;
      BC00044_n49ClienteNombreEmail2 = new boolean[] {false} ;
      BC00044_A50ClienteEmail2 = new String[] {""} ;
      BC00044_n50ClienteEmail2 = new boolean[] {false} ;
      BC00044_A51ClienteEnvio = new String[] {""} ;
      BC00044_n51ClienteEnvio = new boolean[] {false} ;
      BC00044_A52ClienteUsuarioWeb = new String[] {""} ;
      BC00044_n52ClienteUsuarioWeb = new boolean[] {false} ;
      BC00044_A53ClienteNombreCelular1 = new String[] {""} ;
      BC00044_n53ClienteNombreCelular1 = new boolean[] {false} ;
      BC00044_A54ClienteCelular1 = new String[] {""} ;
      BC00044_n54ClienteCelular1 = new boolean[] {false} ;
      BC00044_A55ClienteNombreCelular2 = new String[] {""} ;
      BC00044_n55ClienteNombreCelular2 = new boolean[] {false} ;
      BC00044_A56ClienteCelular2 = new String[] {""} ;
      BC00044_n56ClienteCelular2 = new boolean[] {false} ;
      BC00044_A57ClienteCodigoFigaro = new String[] {""} ;
      BC00044_n57ClienteCodigoFigaro = new boolean[] {false} ;
      BC00044_A58ClienteTipoUsuario = new short[1] ;
      BC00044_n58ClienteTipoUsuario = new boolean[] {false} ;
      BC00044_A59ClienteDireccion = new String[] {""} ;
      BC00044_n59ClienteDireccion = new boolean[] {false} ;
      BC00044_A60ClienteNombreTelefono1 = new String[] {""} ;
      BC00044_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      BC00044_A61ClienteTelefono1 = new String[] {""} ;
      BC00044_n61ClienteTelefono1 = new boolean[] {false} ;
      BC00044_A62ClienteNombreTelefono2 = new String[] {""} ;
      BC00044_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      BC00044_A63ClienteTelefono2 = new String[] {""} ;
      BC00044_n63ClienteTelefono2 = new boolean[] {false} ;
      BC00044_A64ClienteFax = new String[] {""} ;
      BC00044_n64ClienteFax = new boolean[] {false} ;
      BC00044_A65ClienteDicose = new String[] {""} ;
      BC00044_n65ClienteDicose = new boolean[] {false} ;
      BC00044_A66ClienteIdDepartamento = new long[1] ;
      BC00044_n66ClienteIdDepartamento = new boolean[] {false} ;
      BC00044_A67ClienteIdLocalidad = new long[1] ;
      BC00044_n67ClienteIdLocalidad = new boolean[] {false} ;
      BC00044_A68ClienteTecnico1 = new long[1] ;
      BC00044_n68ClienteTecnico1 = new boolean[] {false} ;
      BC00044_A69ClienteTecnico2 = new long[1] ;
      BC00044_n69ClienteTecnico2 = new boolean[] {false} ;
      BC00044_A70ClienteIdAgencia = new long[1] ;
      BC00044_n70ClienteIdAgencia = new boolean[] {false} ;
      BC00044_A71ClienteContrato = new short[1] ;
      BC00044_n71ClienteContrato = new boolean[] {false} ;
      BC00044_A72ClienteSocio = new short[1] ;
      BC00044_n72ClienteSocio = new boolean[] {false} ;
      BC00044_A73ClienteNoUsar = new short[1] ;
      BC00044_n73ClienteNoUsar = new boolean[] {false} ;
      BC00044_A74ClienteCodbar = new short[1] ;
      BC00044_n74ClienteCodbar = new boolean[] {false} ;
      BC00044_A75ClienteCaravanas = new short[1] ;
      BC00044_n75ClienteCaravanas = new boolean[] {false} ;
      BC00044_A76ClienteProlesa = new short[1] ;
      BC00044_n76ClienteProlesa = new boolean[] {false} ;
      BC00044_A77ClienteProlesaSuc = new long[1] ;
      BC00044_n77ClienteProlesaSuc = new boolean[] {false} ;
      BC00044_A168ClienteProlesaMat = new long[1] ;
      BC00044_A78ClienteObservaciones = new String[] {""} ;
      BC00044_n78ClienteObservaciones = new boolean[] {false} ;
      BC00044_A79ClienteFacRsocial = new String[] {""} ;
      BC00044_n79ClienteFacRsocial = new boolean[] {false} ;
      BC00044_A80ClienteFacCedula = new String[] {""} ;
      BC00044_n80ClienteFacCedula = new boolean[] {false} ;
      BC00044_A81ClienteFacRut = new String[] {""} ;
      BC00044_n81ClienteFacRut = new boolean[] {false} ;
      BC00044_A82ClienteFacDireccion = new String[] {""} ;
      BC00044_n82ClienteFacDireccion = new boolean[] {false} ;
      BC00044_A83ClienteFacLocalidad = new String[] {""} ;
      BC00044_n83ClienteFacLocalidad = new boolean[] {false} ;
      BC00044_A84ClienteFacDepartamento = new long[1] ;
      BC00044_n84ClienteFacDepartamento = new boolean[] {false} ;
      BC00044_A85ClienteFacCpostal = new String[] {""} ;
      BC00044_n85ClienteFacCpostal = new boolean[] {false} ;
      BC00044_A86ClienteFacGiro = new long[1] ;
      BC00044_n86ClienteFacGiro = new boolean[] {false} ;
      BC00044_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      BC00044_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      BC00044_A88ClienteFacTelefonos = new String[] {""} ;
      BC00044_n88ClienteFacTelefonos = new boolean[] {false} ;
      BC00044_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      BC00044_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      BC00044_A90ClienteCobTelefono2 = new String[] {""} ;
      BC00044_n90ClienteCobTelefono2 = new boolean[] {false} ;
      BC00044_A91ClienteCobNombreCelular1 = new String[] {""} ;
      BC00044_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      BC00044_A92ClienteCobCelular1 = new String[] {""} ;
      BC00044_n92ClienteCobCelular1 = new boolean[] {false} ;
      BC00044_A93ClienteCobNombreCelular2 = new String[] {""} ;
      BC00044_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      BC00044_A94ClienteCobCelular2 = new String[] {""} ;
      BC00044_n94ClienteCobCelular2 = new boolean[] {false} ;
      BC00044_A95ClienteCobNombreEmail1 = new String[] {""} ;
      BC00044_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      BC00044_A96ClienteCobEmail1 = new String[] {""} ;
      BC00044_n96ClienteCobEmail1 = new boolean[] {false} ;
      BC00044_A97ClienteCobNombreEmail2 = new String[] {""} ;
      BC00044_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      BC00044_A98ClienteCobEmail2 = new String[] {""} ;
      BC00044_n98ClienteCobEmail2 = new boolean[] {false} ;
      BC00044_A99ClienteFacFax = new String[] {""} ;
      BC00044_n99ClienteFacFax = new boolean[] {false} ;
      BC00044_A100ClienteFacEmail = new String[] {""} ;
      BC00044_n100ClienteFacEmail = new boolean[] {false} ;
      BC00044_A101ClienteFacContrato = new String[] {""} ;
      BC00044_n101ClienteFacContrato = new boolean[] {false} ;
      BC00044_A102ClienteFacObservaciones = new String[] {""} ;
      BC00044_n102ClienteFacObservaciones = new boolean[] {false} ;
      BC00044_A103ClienteFacLista = new long[1] ;
      BC00044_n103ClienteFacLista = new boolean[] {false} ;
      BC00044_A104ClienteFacContado = new short[1] ;
      BC00044_n104ClienteFacContado = new boolean[] {false} ;
      BC00044_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      BC00044_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      BC00044_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      BC00044_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      BC00044_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      BC00044_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      BC00044_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      BC00044_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      BC00044_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      BC00044_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      BC00044_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      BC00044_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      BC00044_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      BC00044_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      BC00044_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      BC00044_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      BC00044_A113ClienteIncobrable = new short[1] ;
      BC00044_n113ClienteIncobrable = new boolean[] {false} ;
      BC00045_A4ClienteId = new long[1] ;
      BC00046_A4ClienteId = new long[1] ;
      BC00046_A45ClienteNombre = new String[] {""} ;
      BC00046_n45ClienteNombre = new boolean[] {false} ;
      BC00046_A46ClienteEmail = new String[] {""} ;
      BC00046_n46ClienteEmail = new boolean[] {false} ;
      BC00046_A47ClienteNombreEmail1 = new String[] {""} ;
      BC00046_n47ClienteNombreEmail1 = new boolean[] {false} ;
      BC00046_A48ClienteEmail1 = new String[] {""} ;
      BC00046_n48ClienteEmail1 = new boolean[] {false} ;
      BC00046_A49ClienteNombreEmail2 = new String[] {""} ;
      BC00046_n49ClienteNombreEmail2 = new boolean[] {false} ;
      BC00046_A50ClienteEmail2 = new String[] {""} ;
      BC00046_n50ClienteEmail2 = new boolean[] {false} ;
      BC00046_A51ClienteEnvio = new String[] {""} ;
      BC00046_n51ClienteEnvio = new boolean[] {false} ;
      BC00046_A52ClienteUsuarioWeb = new String[] {""} ;
      BC00046_n52ClienteUsuarioWeb = new boolean[] {false} ;
      BC00046_A53ClienteNombreCelular1 = new String[] {""} ;
      BC00046_n53ClienteNombreCelular1 = new boolean[] {false} ;
      BC00046_A54ClienteCelular1 = new String[] {""} ;
      BC00046_n54ClienteCelular1 = new boolean[] {false} ;
      BC00046_A55ClienteNombreCelular2 = new String[] {""} ;
      BC00046_n55ClienteNombreCelular2 = new boolean[] {false} ;
      BC00046_A56ClienteCelular2 = new String[] {""} ;
      BC00046_n56ClienteCelular2 = new boolean[] {false} ;
      BC00046_A57ClienteCodigoFigaro = new String[] {""} ;
      BC00046_n57ClienteCodigoFigaro = new boolean[] {false} ;
      BC00046_A58ClienteTipoUsuario = new short[1] ;
      BC00046_n58ClienteTipoUsuario = new boolean[] {false} ;
      BC00046_A59ClienteDireccion = new String[] {""} ;
      BC00046_n59ClienteDireccion = new boolean[] {false} ;
      BC00046_A60ClienteNombreTelefono1 = new String[] {""} ;
      BC00046_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      BC00046_A61ClienteTelefono1 = new String[] {""} ;
      BC00046_n61ClienteTelefono1 = new boolean[] {false} ;
      BC00046_A62ClienteNombreTelefono2 = new String[] {""} ;
      BC00046_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      BC00046_A63ClienteTelefono2 = new String[] {""} ;
      BC00046_n63ClienteTelefono2 = new boolean[] {false} ;
      BC00046_A64ClienteFax = new String[] {""} ;
      BC00046_n64ClienteFax = new boolean[] {false} ;
      BC00046_A65ClienteDicose = new String[] {""} ;
      BC00046_n65ClienteDicose = new boolean[] {false} ;
      BC00046_A66ClienteIdDepartamento = new long[1] ;
      BC00046_n66ClienteIdDepartamento = new boolean[] {false} ;
      BC00046_A67ClienteIdLocalidad = new long[1] ;
      BC00046_n67ClienteIdLocalidad = new boolean[] {false} ;
      BC00046_A68ClienteTecnico1 = new long[1] ;
      BC00046_n68ClienteTecnico1 = new boolean[] {false} ;
      BC00046_A69ClienteTecnico2 = new long[1] ;
      BC00046_n69ClienteTecnico2 = new boolean[] {false} ;
      BC00046_A70ClienteIdAgencia = new long[1] ;
      BC00046_n70ClienteIdAgencia = new boolean[] {false} ;
      BC00046_A71ClienteContrato = new short[1] ;
      BC00046_n71ClienteContrato = new boolean[] {false} ;
      BC00046_A72ClienteSocio = new short[1] ;
      BC00046_n72ClienteSocio = new boolean[] {false} ;
      BC00046_A73ClienteNoUsar = new short[1] ;
      BC00046_n73ClienteNoUsar = new boolean[] {false} ;
      BC00046_A74ClienteCodbar = new short[1] ;
      BC00046_n74ClienteCodbar = new boolean[] {false} ;
      BC00046_A75ClienteCaravanas = new short[1] ;
      BC00046_n75ClienteCaravanas = new boolean[] {false} ;
      BC00046_A76ClienteProlesa = new short[1] ;
      BC00046_n76ClienteProlesa = new boolean[] {false} ;
      BC00046_A77ClienteProlesaSuc = new long[1] ;
      BC00046_n77ClienteProlesaSuc = new boolean[] {false} ;
      BC00046_A168ClienteProlesaMat = new long[1] ;
      BC00046_A78ClienteObservaciones = new String[] {""} ;
      BC00046_n78ClienteObservaciones = new boolean[] {false} ;
      BC00046_A79ClienteFacRsocial = new String[] {""} ;
      BC00046_n79ClienteFacRsocial = new boolean[] {false} ;
      BC00046_A80ClienteFacCedula = new String[] {""} ;
      BC00046_n80ClienteFacCedula = new boolean[] {false} ;
      BC00046_A81ClienteFacRut = new String[] {""} ;
      BC00046_n81ClienteFacRut = new boolean[] {false} ;
      BC00046_A82ClienteFacDireccion = new String[] {""} ;
      BC00046_n82ClienteFacDireccion = new boolean[] {false} ;
      BC00046_A83ClienteFacLocalidad = new String[] {""} ;
      BC00046_n83ClienteFacLocalidad = new boolean[] {false} ;
      BC00046_A84ClienteFacDepartamento = new long[1] ;
      BC00046_n84ClienteFacDepartamento = new boolean[] {false} ;
      BC00046_A85ClienteFacCpostal = new String[] {""} ;
      BC00046_n85ClienteFacCpostal = new boolean[] {false} ;
      BC00046_A86ClienteFacGiro = new long[1] ;
      BC00046_n86ClienteFacGiro = new boolean[] {false} ;
      BC00046_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      BC00046_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      BC00046_A88ClienteFacTelefonos = new String[] {""} ;
      BC00046_n88ClienteFacTelefonos = new boolean[] {false} ;
      BC00046_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      BC00046_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      BC00046_A90ClienteCobTelefono2 = new String[] {""} ;
      BC00046_n90ClienteCobTelefono2 = new boolean[] {false} ;
      BC00046_A91ClienteCobNombreCelular1 = new String[] {""} ;
      BC00046_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      BC00046_A92ClienteCobCelular1 = new String[] {""} ;
      BC00046_n92ClienteCobCelular1 = new boolean[] {false} ;
      BC00046_A93ClienteCobNombreCelular2 = new String[] {""} ;
      BC00046_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      BC00046_A94ClienteCobCelular2 = new String[] {""} ;
      BC00046_n94ClienteCobCelular2 = new boolean[] {false} ;
      BC00046_A95ClienteCobNombreEmail1 = new String[] {""} ;
      BC00046_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      BC00046_A96ClienteCobEmail1 = new String[] {""} ;
      BC00046_n96ClienteCobEmail1 = new boolean[] {false} ;
      BC00046_A97ClienteCobNombreEmail2 = new String[] {""} ;
      BC00046_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      BC00046_A98ClienteCobEmail2 = new String[] {""} ;
      BC00046_n98ClienteCobEmail2 = new boolean[] {false} ;
      BC00046_A99ClienteFacFax = new String[] {""} ;
      BC00046_n99ClienteFacFax = new boolean[] {false} ;
      BC00046_A100ClienteFacEmail = new String[] {""} ;
      BC00046_n100ClienteFacEmail = new boolean[] {false} ;
      BC00046_A101ClienteFacContrato = new String[] {""} ;
      BC00046_n101ClienteFacContrato = new boolean[] {false} ;
      BC00046_A102ClienteFacObservaciones = new String[] {""} ;
      BC00046_n102ClienteFacObservaciones = new boolean[] {false} ;
      BC00046_A103ClienteFacLista = new long[1] ;
      BC00046_n103ClienteFacLista = new boolean[] {false} ;
      BC00046_A104ClienteFacContado = new short[1] ;
      BC00046_n104ClienteFacContado = new boolean[] {false} ;
      BC00046_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      BC00046_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      BC00046_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      BC00046_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      BC00046_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      BC00046_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      BC00046_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      BC00046_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      BC00046_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      BC00046_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      BC00046_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      BC00046_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      BC00046_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      BC00046_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      BC00046_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      BC00046_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      BC00046_A113ClienteIncobrable = new short[1] ;
      BC00046_n113ClienteIncobrable = new boolean[] {false} ;
      sMode4 = "" ;
      BC00047_A4ClienteId = new long[1] ;
      BC00047_A45ClienteNombre = new String[] {""} ;
      BC00047_n45ClienteNombre = new boolean[] {false} ;
      BC00047_A46ClienteEmail = new String[] {""} ;
      BC00047_n46ClienteEmail = new boolean[] {false} ;
      BC00047_A47ClienteNombreEmail1 = new String[] {""} ;
      BC00047_n47ClienteNombreEmail1 = new boolean[] {false} ;
      BC00047_A48ClienteEmail1 = new String[] {""} ;
      BC00047_n48ClienteEmail1 = new boolean[] {false} ;
      BC00047_A49ClienteNombreEmail2 = new String[] {""} ;
      BC00047_n49ClienteNombreEmail2 = new boolean[] {false} ;
      BC00047_A50ClienteEmail2 = new String[] {""} ;
      BC00047_n50ClienteEmail2 = new boolean[] {false} ;
      BC00047_A51ClienteEnvio = new String[] {""} ;
      BC00047_n51ClienteEnvio = new boolean[] {false} ;
      BC00047_A52ClienteUsuarioWeb = new String[] {""} ;
      BC00047_n52ClienteUsuarioWeb = new boolean[] {false} ;
      BC00047_A53ClienteNombreCelular1 = new String[] {""} ;
      BC00047_n53ClienteNombreCelular1 = new boolean[] {false} ;
      BC00047_A54ClienteCelular1 = new String[] {""} ;
      BC00047_n54ClienteCelular1 = new boolean[] {false} ;
      BC00047_A55ClienteNombreCelular2 = new String[] {""} ;
      BC00047_n55ClienteNombreCelular2 = new boolean[] {false} ;
      BC00047_A56ClienteCelular2 = new String[] {""} ;
      BC00047_n56ClienteCelular2 = new boolean[] {false} ;
      BC00047_A57ClienteCodigoFigaro = new String[] {""} ;
      BC00047_n57ClienteCodigoFigaro = new boolean[] {false} ;
      BC00047_A58ClienteTipoUsuario = new short[1] ;
      BC00047_n58ClienteTipoUsuario = new boolean[] {false} ;
      BC00047_A59ClienteDireccion = new String[] {""} ;
      BC00047_n59ClienteDireccion = new boolean[] {false} ;
      BC00047_A60ClienteNombreTelefono1 = new String[] {""} ;
      BC00047_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      BC00047_A61ClienteTelefono1 = new String[] {""} ;
      BC00047_n61ClienteTelefono1 = new boolean[] {false} ;
      BC00047_A62ClienteNombreTelefono2 = new String[] {""} ;
      BC00047_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      BC00047_A63ClienteTelefono2 = new String[] {""} ;
      BC00047_n63ClienteTelefono2 = new boolean[] {false} ;
      BC00047_A64ClienteFax = new String[] {""} ;
      BC00047_n64ClienteFax = new boolean[] {false} ;
      BC00047_A65ClienteDicose = new String[] {""} ;
      BC00047_n65ClienteDicose = new boolean[] {false} ;
      BC00047_A66ClienteIdDepartamento = new long[1] ;
      BC00047_n66ClienteIdDepartamento = new boolean[] {false} ;
      BC00047_A67ClienteIdLocalidad = new long[1] ;
      BC00047_n67ClienteIdLocalidad = new boolean[] {false} ;
      BC00047_A68ClienteTecnico1 = new long[1] ;
      BC00047_n68ClienteTecnico1 = new boolean[] {false} ;
      BC00047_A69ClienteTecnico2 = new long[1] ;
      BC00047_n69ClienteTecnico2 = new boolean[] {false} ;
      BC00047_A70ClienteIdAgencia = new long[1] ;
      BC00047_n70ClienteIdAgencia = new boolean[] {false} ;
      BC00047_A71ClienteContrato = new short[1] ;
      BC00047_n71ClienteContrato = new boolean[] {false} ;
      BC00047_A72ClienteSocio = new short[1] ;
      BC00047_n72ClienteSocio = new boolean[] {false} ;
      BC00047_A73ClienteNoUsar = new short[1] ;
      BC00047_n73ClienteNoUsar = new boolean[] {false} ;
      BC00047_A74ClienteCodbar = new short[1] ;
      BC00047_n74ClienteCodbar = new boolean[] {false} ;
      BC00047_A75ClienteCaravanas = new short[1] ;
      BC00047_n75ClienteCaravanas = new boolean[] {false} ;
      BC00047_A76ClienteProlesa = new short[1] ;
      BC00047_n76ClienteProlesa = new boolean[] {false} ;
      BC00047_A77ClienteProlesaSuc = new long[1] ;
      BC00047_n77ClienteProlesaSuc = new boolean[] {false} ;
      BC00047_A168ClienteProlesaMat = new long[1] ;
      BC00047_A78ClienteObservaciones = new String[] {""} ;
      BC00047_n78ClienteObservaciones = new boolean[] {false} ;
      BC00047_A79ClienteFacRsocial = new String[] {""} ;
      BC00047_n79ClienteFacRsocial = new boolean[] {false} ;
      BC00047_A80ClienteFacCedula = new String[] {""} ;
      BC00047_n80ClienteFacCedula = new boolean[] {false} ;
      BC00047_A81ClienteFacRut = new String[] {""} ;
      BC00047_n81ClienteFacRut = new boolean[] {false} ;
      BC00047_A82ClienteFacDireccion = new String[] {""} ;
      BC00047_n82ClienteFacDireccion = new boolean[] {false} ;
      BC00047_A83ClienteFacLocalidad = new String[] {""} ;
      BC00047_n83ClienteFacLocalidad = new boolean[] {false} ;
      BC00047_A84ClienteFacDepartamento = new long[1] ;
      BC00047_n84ClienteFacDepartamento = new boolean[] {false} ;
      BC00047_A85ClienteFacCpostal = new String[] {""} ;
      BC00047_n85ClienteFacCpostal = new boolean[] {false} ;
      BC00047_A86ClienteFacGiro = new long[1] ;
      BC00047_n86ClienteFacGiro = new boolean[] {false} ;
      BC00047_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      BC00047_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      BC00047_A88ClienteFacTelefonos = new String[] {""} ;
      BC00047_n88ClienteFacTelefonos = new boolean[] {false} ;
      BC00047_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      BC00047_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      BC00047_A90ClienteCobTelefono2 = new String[] {""} ;
      BC00047_n90ClienteCobTelefono2 = new boolean[] {false} ;
      BC00047_A91ClienteCobNombreCelular1 = new String[] {""} ;
      BC00047_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      BC00047_A92ClienteCobCelular1 = new String[] {""} ;
      BC00047_n92ClienteCobCelular1 = new boolean[] {false} ;
      BC00047_A93ClienteCobNombreCelular2 = new String[] {""} ;
      BC00047_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      BC00047_A94ClienteCobCelular2 = new String[] {""} ;
      BC00047_n94ClienteCobCelular2 = new boolean[] {false} ;
      BC00047_A95ClienteCobNombreEmail1 = new String[] {""} ;
      BC00047_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      BC00047_A96ClienteCobEmail1 = new String[] {""} ;
      BC00047_n96ClienteCobEmail1 = new boolean[] {false} ;
      BC00047_A97ClienteCobNombreEmail2 = new String[] {""} ;
      BC00047_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      BC00047_A98ClienteCobEmail2 = new String[] {""} ;
      BC00047_n98ClienteCobEmail2 = new boolean[] {false} ;
      BC00047_A99ClienteFacFax = new String[] {""} ;
      BC00047_n99ClienteFacFax = new boolean[] {false} ;
      BC00047_A100ClienteFacEmail = new String[] {""} ;
      BC00047_n100ClienteFacEmail = new boolean[] {false} ;
      BC00047_A101ClienteFacContrato = new String[] {""} ;
      BC00047_n101ClienteFacContrato = new boolean[] {false} ;
      BC00047_A102ClienteFacObservaciones = new String[] {""} ;
      BC00047_n102ClienteFacObservaciones = new boolean[] {false} ;
      BC00047_A103ClienteFacLista = new long[1] ;
      BC00047_n103ClienteFacLista = new boolean[] {false} ;
      BC00047_A104ClienteFacContado = new short[1] ;
      BC00047_n104ClienteFacContado = new boolean[] {false} ;
      BC00047_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      BC00047_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      BC00047_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      BC00047_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      BC00047_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      BC00047_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      BC00047_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      BC00047_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      BC00047_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      BC00047_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      BC00047_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      BC00047_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      BC00047_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      BC00047_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      BC00047_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      BC00047_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      BC00047_A113ClienteIncobrable = new short[1] ;
      BC00047_n113ClienteIncobrable = new boolean[] {false} ;
      BC000411_A4ClienteId = new long[1] ;
      BC000411_A45ClienteNombre = new String[] {""} ;
      BC000411_n45ClienteNombre = new boolean[] {false} ;
      BC000411_A46ClienteEmail = new String[] {""} ;
      BC000411_n46ClienteEmail = new boolean[] {false} ;
      BC000411_A47ClienteNombreEmail1 = new String[] {""} ;
      BC000411_n47ClienteNombreEmail1 = new boolean[] {false} ;
      BC000411_A48ClienteEmail1 = new String[] {""} ;
      BC000411_n48ClienteEmail1 = new boolean[] {false} ;
      BC000411_A49ClienteNombreEmail2 = new String[] {""} ;
      BC000411_n49ClienteNombreEmail2 = new boolean[] {false} ;
      BC000411_A50ClienteEmail2 = new String[] {""} ;
      BC000411_n50ClienteEmail2 = new boolean[] {false} ;
      BC000411_A51ClienteEnvio = new String[] {""} ;
      BC000411_n51ClienteEnvio = new boolean[] {false} ;
      BC000411_A52ClienteUsuarioWeb = new String[] {""} ;
      BC000411_n52ClienteUsuarioWeb = new boolean[] {false} ;
      BC000411_A53ClienteNombreCelular1 = new String[] {""} ;
      BC000411_n53ClienteNombreCelular1 = new boolean[] {false} ;
      BC000411_A54ClienteCelular1 = new String[] {""} ;
      BC000411_n54ClienteCelular1 = new boolean[] {false} ;
      BC000411_A55ClienteNombreCelular2 = new String[] {""} ;
      BC000411_n55ClienteNombreCelular2 = new boolean[] {false} ;
      BC000411_A56ClienteCelular2 = new String[] {""} ;
      BC000411_n56ClienteCelular2 = new boolean[] {false} ;
      BC000411_A57ClienteCodigoFigaro = new String[] {""} ;
      BC000411_n57ClienteCodigoFigaro = new boolean[] {false} ;
      BC000411_A58ClienteTipoUsuario = new short[1] ;
      BC000411_n58ClienteTipoUsuario = new boolean[] {false} ;
      BC000411_A59ClienteDireccion = new String[] {""} ;
      BC000411_n59ClienteDireccion = new boolean[] {false} ;
      BC000411_A60ClienteNombreTelefono1 = new String[] {""} ;
      BC000411_n60ClienteNombreTelefono1 = new boolean[] {false} ;
      BC000411_A61ClienteTelefono1 = new String[] {""} ;
      BC000411_n61ClienteTelefono1 = new boolean[] {false} ;
      BC000411_A62ClienteNombreTelefono2 = new String[] {""} ;
      BC000411_n62ClienteNombreTelefono2 = new boolean[] {false} ;
      BC000411_A63ClienteTelefono2 = new String[] {""} ;
      BC000411_n63ClienteTelefono2 = new boolean[] {false} ;
      BC000411_A64ClienteFax = new String[] {""} ;
      BC000411_n64ClienteFax = new boolean[] {false} ;
      BC000411_A65ClienteDicose = new String[] {""} ;
      BC000411_n65ClienteDicose = new boolean[] {false} ;
      BC000411_A66ClienteIdDepartamento = new long[1] ;
      BC000411_n66ClienteIdDepartamento = new boolean[] {false} ;
      BC000411_A67ClienteIdLocalidad = new long[1] ;
      BC000411_n67ClienteIdLocalidad = new boolean[] {false} ;
      BC000411_A68ClienteTecnico1 = new long[1] ;
      BC000411_n68ClienteTecnico1 = new boolean[] {false} ;
      BC000411_A69ClienteTecnico2 = new long[1] ;
      BC000411_n69ClienteTecnico2 = new boolean[] {false} ;
      BC000411_A70ClienteIdAgencia = new long[1] ;
      BC000411_n70ClienteIdAgencia = new boolean[] {false} ;
      BC000411_A71ClienteContrato = new short[1] ;
      BC000411_n71ClienteContrato = new boolean[] {false} ;
      BC000411_A72ClienteSocio = new short[1] ;
      BC000411_n72ClienteSocio = new boolean[] {false} ;
      BC000411_A73ClienteNoUsar = new short[1] ;
      BC000411_n73ClienteNoUsar = new boolean[] {false} ;
      BC000411_A74ClienteCodbar = new short[1] ;
      BC000411_n74ClienteCodbar = new boolean[] {false} ;
      BC000411_A75ClienteCaravanas = new short[1] ;
      BC000411_n75ClienteCaravanas = new boolean[] {false} ;
      BC000411_A76ClienteProlesa = new short[1] ;
      BC000411_n76ClienteProlesa = new boolean[] {false} ;
      BC000411_A77ClienteProlesaSuc = new long[1] ;
      BC000411_n77ClienteProlesaSuc = new boolean[] {false} ;
      BC000411_A168ClienteProlesaMat = new long[1] ;
      BC000411_A78ClienteObservaciones = new String[] {""} ;
      BC000411_n78ClienteObservaciones = new boolean[] {false} ;
      BC000411_A79ClienteFacRsocial = new String[] {""} ;
      BC000411_n79ClienteFacRsocial = new boolean[] {false} ;
      BC000411_A80ClienteFacCedula = new String[] {""} ;
      BC000411_n80ClienteFacCedula = new boolean[] {false} ;
      BC000411_A81ClienteFacRut = new String[] {""} ;
      BC000411_n81ClienteFacRut = new boolean[] {false} ;
      BC000411_A82ClienteFacDireccion = new String[] {""} ;
      BC000411_n82ClienteFacDireccion = new boolean[] {false} ;
      BC000411_A83ClienteFacLocalidad = new String[] {""} ;
      BC000411_n83ClienteFacLocalidad = new boolean[] {false} ;
      BC000411_A84ClienteFacDepartamento = new long[1] ;
      BC000411_n84ClienteFacDepartamento = new boolean[] {false} ;
      BC000411_A85ClienteFacCpostal = new String[] {""} ;
      BC000411_n85ClienteFacCpostal = new boolean[] {false} ;
      BC000411_A86ClienteFacGiro = new long[1] ;
      BC000411_n86ClienteFacGiro = new boolean[] {false} ;
      BC000411_A87ClienteCobNombreTelefono1 = new String[] {""} ;
      BC000411_n87ClienteCobNombreTelefono1 = new boolean[] {false} ;
      BC000411_A88ClienteFacTelefonos = new String[] {""} ;
      BC000411_n88ClienteFacTelefonos = new boolean[] {false} ;
      BC000411_A89ClienteCobNombreTelefono2 = new String[] {""} ;
      BC000411_n89ClienteCobNombreTelefono2 = new boolean[] {false} ;
      BC000411_A90ClienteCobTelefono2 = new String[] {""} ;
      BC000411_n90ClienteCobTelefono2 = new boolean[] {false} ;
      BC000411_A91ClienteCobNombreCelular1 = new String[] {""} ;
      BC000411_n91ClienteCobNombreCelular1 = new boolean[] {false} ;
      BC000411_A92ClienteCobCelular1 = new String[] {""} ;
      BC000411_n92ClienteCobCelular1 = new boolean[] {false} ;
      BC000411_A93ClienteCobNombreCelular2 = new String[] {""} ;
      BC000411_n93ClienteCobNombreCelular2 = new boolean[] {false} ;
      BC000411_A94ClienteCobCelular2 = new String[] {""} ;
      BC000411_n94ClienteCobCelular2 = new boolean[] {false} ;
      BC000411_A95ClienteCobNombreEmail1 = new String[] {""} ;
      BC000411_n95ClienteCobNombreEmail1 = new boolean[] {false} ;
      BC000411_A96ClienteCobEmail1 = new String[] {""} ;
      BC000411_n96ClienteCobEmail1 = new boolean[] {false} ;
      BC000411_A97ClienteCobNombreEmail2 = new String[] {""} ;
      BC000411_n97ClienteCobNombreEmail2 = new boolean[] {false} ;
      BC000411_A98ClienteCobEmail2 = new String[] {""} ;
      BC000411_n98ClienteCobEmail2 = new boolean[] {false} ;
      BC000411_A99ClienteFacFax = new String[] {""} ;
      BC000411_n99ClienteFacFax = new boolean[] {false} ;
      BC000411_A100ClienteFacEmail = new String[] {""} ;
      BC000411_n100ClienteFacEmail = new boolean[] {false} ;
      BC000411_A101ClienteFacContrato = new String[] {""} ;
      BC000411_n101ClienteFacContrato = new boolean[] {false} ;
      BC000411_A102ClienteFacObservaciones = new String[] {""} ;
      BC000411_n102ClienteFacObservaciones = new boolean[] {false} ;
      BC000411_A103ClienteFacLista = new long[1] ;
      BC000411_n103ClienteFacLista = new boolean[] {false} ;
      BC000411_A104ClienteFacContado = new short[1] ;
      BC000411_n104ClienteFacContado = new boolean[] {false} ;
      BC000411_A105ClienteNotEmailFrascos1 = new String[] {""} ;
      BC000411_n105ClienteNotEmailFrascos1 = new boolean[] {false} ;
      BC000411_A106ClienteNotEmailFrascos2 = new String[] {""} ;
      BC000411_n106ClienteNotEmailFrascos2 = new boolean[] {false} ;
      BC000411_A107ClienteNotEmailMuestra1 = new String[] {""} ;
      BC000411_n107ClienteNotEmailMuestra1 = new boolean[] {false} ;
      BC000411_A108ClienteNotEmailMuestra2 = new String[] {""} ;
      BC000411_n108ClienteNotEmailMuestra2 = new boolean[] {false} ;
      BC000411_A109ClienteNotEmailAnalisis1 = new String[] {""} ;
      BC000411_n109ClienteNotEmailAnalisis1 = new boolean[] {false} ;
      BC000411_A110ClienteNotEmailAnalisis2 = new String[] {""} ;
      BC000411_n110ClienteNotEmailAnalisis2 = new boolean[] {false} ;
      BC000411_A111ClienteNotEmailGeneral1 = new String[] {""} ;
      BC000411_n111ClienteNotEmailGeneral1 = new boolean[] {false} ;
      BC000411_A112ClienteNotEmailGeneral2 = new String[] {""} ;
      BC000411_n112ClienteNotEmailGeneral2 = new boolean[] {false} ;
      BC000411_A113ClienteIncobrable = new short[1] ;
      BC000411_n113ClienteIncobrable = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.cliente_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.cliente_bc__default(),
         new Object[] {
             new Object[] {
            BC00042_A4ClienteId, BC00042_A45ClienteNombre, BC00042_n45ClienteNombre, BC00042_A46ClienteEmail, BC00042_n46ClienteEmail, BC00042_A47ClienteNombreEmail1, BC00042_n47ClienteNombreEmail1, BC00042_A48ClienteEmail1, BC00042_n48ClienteEmail1, BC00042_A49ClienteNombreEmail2,
            BC00042_n49ClienteNombreEmail2, BC00042_A50ClienteEmail2, BC00042_n50ClienteEmail2, BC00042_A51ClienteEnvio, BC00042_n51ClienteEnvio, BC00042_A52ClienteUsuarioWeb, BC00042_n52ClienteUsuarioWeb, BC00042_A53ClienteNombreCelular1, BC00042_n53ClienteNombreCelular1, BC00042_A54ClienteCelular1,
            BC00042_n54ClienteCelular1, BC00042_A55ClienteNombreCelular2, BC00042_n55ClienteNombreCelular2, BC00042_A56ClienteCelular2, BC00042_n56ClienteCelular2, BC00042_A57ClienteCodigoFigaro, BC00042_n57ClienteCodigoFigaro, BC00042_A58ClienteTipoUsuario, BC00042_n58ClienteTipoUsuario, BC00042_A59ClienteDireccion,
            BC00042_n59ClienteDireccion, BC00042_A60ClienteNombreTelefono1, BC00042_n60ClienteNombreTelefono1, BC00042_A61ClienteTelefono1, BC00042_n61ClienteTelefono1, BC00042_A62ClienteNombreTelefono2, BC00042_n62ClienteNombreTelefono2, BC00042_A63ClienteTelefono2, BC00042_n63ClienteTelefono2, BC00042_A64ClienteFax,
            BC00042_n64ClienteFax, BC00042_A65ClienteDicose, BC00042_n65ClienteDicose, BC00042_A66ClienteIdDepartamento, BC00042_n66ClienteIdDepartamento, BC00042_A67ClienteIdLocalidad, BC00042_n67ClienteIdLocalidad, BC00042_A68ClienteTecnico1, BC00042_n68ClienteTecnico1, BC00042_A69ClienteTecnico2,
            BC00042_n69ClienteTecnico2, BC00042_A70ClienteIdAgencia, BC00042_n70ClienteIdAgencia, BC00042_A71ClienteContrato, BC00042_n71ClienteContrato, BC00042_A72ClienteSocio, BC00042_n72ClienteSocio, BC00042_A73ClienteNoUsar, BC00042_n73ClienteNoUsar, BC00042_A74ClienteCodbar,
            BC00042_n74ClienteCodbar, BC00042_A75ClienteCaravanas, BC00042_n75ClienteCaravanas, BC00042_A76ClienteProlesa, BC00042_n76ClienteProlesa, BC00042_A77ClienteProlesaSuc, BC00042_n77ClienteProlesaSuc, BC00042_A168ClienteProlesaMat, BC00042_A78ClienteObservaciones, BC00042_n78ClienteObservaciones,
            BC00042_A79ClienteFacRsocial, BC00042_n79ClienteFacRsocial, BC00042_A80ClienteFacCedula, BC00042_n80ClienteFacCedula, BC00042_A81ClienteFacRut, BC00042_n81ClienteFacRut, BC00042_A82ClienteFacDireccion, BC00042_n82ClienteFacDireccion, BC00042_A83ClienteFacLocalidad, BC00042_n83ClienteFacLocalidad,
            BC00042_A84ClienteFacDepartamento, BC00042_n84ClienteFacDepartamento, BC00042_A85ClienteFacCpostal, BC00042_n85ClienteFacCpostal, BC00042_A86ClienteFacGiro, BC00042_n86ClienteFacGiro, BC00042_A87ClienteCobNombreTelefono1, BC00042_n87ClienteCobNombreTelefono1, BC00042_A88ClienteFacTelefonos, BC00042_n88ClienteFacTelefonos,
            BC00042_A89ClienteCobNombreTelefono2, BC00042_n89ClienteCobNombreTelefono2, BC00042_A90ClienteCobTelefono2, BC00042_n90ClienteCobTelefono2, BC00042_A91ClienteCobNombreCelular1, BC00042_n91ClienteCobNombreCelular1, BC00042_A92ClienteCobCelular1, BC00042_n92ClienteCobCelular1, BC00042_A93ClienteCobNombreCelular2, BC00042_n93ClienteCobNombreCelular2,
            BC00042_A94ClienteCobCelular2, BC00042_n94ClienteCobCelular2, BC00042_A95ClienteCobNombreEmail1, BC00042_n95ClienteCobNombreEmail1, BC00042_A96ClienteCobEmail1, BC00042_n96ClienteCobEmail1, BC00042_A97ClienteCobNombreEmail2, BC00042_n97ClienteCobNombreEmail2, BC00042_A98ClienteCobEmail2, BC00042_n98ClienteCobEmail2,
            BC00042_A99ClienteFacFax, BC00042_n99ClienteFacFax, BC00042_A100ClienteFacEmail, BC00042_n100ClienteFacEmail, BC00042_A101ClienteFacContrato, BC00042_n101ClienteFacContrato, BC00042_A102ClienteFacObservaciones, BC00042_n102ClienteFacObservaciones, BC00042_A103ClienteFacLista, BC00042_n103ClienteFacLista,
            BC00042_A104ClienteFacContado, BC00042_n104ClienteFacContado, BC00042_A105ClienteNotEmailFrascos1, BC00042_n105ClienteNotEmailFrascos1, BC00042_A106ClienteNotEmailFrascos2, BC00042_n106ClienteNotEmailFrascos2, BC00042_A107ClienteNotEmailMuestra1, BC00042_n107ClienteNotEmailMuestra1, BC00042_A108ClienteNotEmailMuestra2, BC00042_n108ClienteNotEmailMuestra2,
            BC00042_A109ClienteNotEmailAnalisis1, BC00042_n109ClienteNotEmailAnalisis1, BC00042_A110ClienteNotEmailAnalisis2, BC00042_n110ClienteNotEmailAnalisis2, BC00042_A111ClienteNotEmailGeneral1, BC00042_n111ClienteNotEmailGeneral1, BC00042_A112ClienteNotEmailGeneral2, BC00042_n112ClienteNotEmailGeneral2, BC00042_A113ClienteIncobrable, BC00042_n113ClienteIncobrable
            }
            , new Object[] {
            BC00043_A4ClienteId, BC00043_A45ClienteNombre, BC00043_n45ClienteNombre, BC00043_A46ClienteEmail, BC00043_n46ClienteEmail, BC00043_A47ClienteNombreEmail1, BC00043_n47ClienteNombreEmail1, BC00043_A48ClienteEmail1, BC00043_n48ClienteEmail1, BC00043_A49ClienteNombreEmail2,
            BC00043_n49ClienteNombreEmail2, BC00043_A50ClienteEmail2, BC00043_n50ClienteEmail2, BC00043_A51ClienteEnvio, BC00043_n51ClienteEnvio, BC00043_A52ClienteUsuarioWeb, BC00043_n52ClienteUsuarioWeb, BC00043_A53ClienteNombreCelular1, BC00043_n53ClienteNombreCelular1, BC00043_A54ClienteCelular1,
            BC00043_n54ClienteCelular1, BC00043_A55ClienteNombreCelular2, BC00043_n55ClienteNombreCelular2, BC00043_A56ClienteCelular2, BC00043_n56ClienteCelular2, BC00043_A57ClienteCodigoFigaro, BC00043_n57ClienteCodigoFigaro, BC00043_A58ClienteTipoUsuario, BC00043_n58ClienteTipoUsuario, BC00043_A59ClienteDireccion,
            BC00043_n59ClienteDireccion, BC00043_A60ClienteNombreTelefono1, BC00043_n60ClienteNombreTelefono1, BC00043_A61ClienteTelefono1, BC00043_n61ClienteTelefono1, BC00043_A62ClienteNombreTelefono2, BC00043_n62ClienteNombreTelefono2, BC00043_A63ClienteTelefono2, BC00043_n63ClienteTelefono2, BC00043_A64ClienteFax,
            BC00043_n64ClienteFax, BC00043_A65ClienteDicose, BC00043_n65ClienteDicose, BC00043_A66ClienteIdDepartamento, BC00043_n66ClienteIdDepartamento, BC00043_A67ClienteIdLocalidad, BC00043_n67ClienteIdLocalidad, BC00043_A68ClienteTecnico1, BC00043_n68ClienteTecnico1, BC00043_A69ClienteTecnico2,
            BC00043_n69ClienteTecnico2, BC00043_A70ClienteIdAgencia, BC00043_n70ClienteIdAgencia, BC00043_A71ClienteContrato, BC00043_n71ClienteContrato, BC00043_A72ClienteSocio, BC00043_n72ClienteSocio, BC00043_A73ClienteNoUsar, BC00043_n73ClienteNoUsar, BC00043_A74ClienteCodbar,
            BC00043_n74ClienteCodbar, BC00043_A75ClienteCaravanas, BC00043_n75ClienteCaravanas, BC00043_A76ClienteProlesa, BC00043_n76ClienteProlesa, BC00043_A77ClienteProlesaSuc, BC00043_n77ClienteProlesaSuc, BC00043_A168ClienteProlesaMat, BC00043_A78ClienteObservaciones, BC00043_n78ClienteObservaciones,
            BC00043_A79ClienteFacRsocial, BC00043_n79ClienteFacRsocial, BC00043_A80ClienteFacCedula, BC00043_n80ClienteFacCedula, BC00043_A81ClienteFacRut, BC00043_n81ClienteFacRut, BC00043_A82ClienteFacDireccion, BC00043_n82ClienteFacDireccion, BC00043_A83ClienteFacLocalidad, BC00043_n83ClienteFacLocalidad,
            BC00043_A84ClienteFacDepartamento, BC00043_n84ClienteFacDepartamento, BC00043_A85ClienteFacCpostal, BC00043_n85ClienteFacCpostal, BC00043_A86ClienteFacGiro, BC00043_n86ClienteFacGiro, BC00043_A87ClienteCobNombreTelefono1, BC00043_n87ClienteCobNombreTelefono1, BC00043_A88ClienteFacTelefonos, BC00043_n88ClienteFacTelefonos,
            BC00043_A89ClienteCobNombreTelefono2, BC00043_n89ClienteCobNombreTelefono2, BC00043_A90ClienteCobTelefono2, BC00043_n90ClienteCobTelefono2, BC00043_A91ClienteCobNombreCelular1, BC00043_n91ClienteCobNombreCelular1, BC00043_A92ClienteCobCelular1, BC00043_n92ClienteCobCelular1, BC00043_A93ClienteCobNombreCelular2, BC00043_n93ClienteCobNombreCelular2,
            BC00043_A94ClienteCobCelular2, BC00043_n94ClienteCobCelular2, BC00043_A95ClienteCobNombreEmail1, BC00043_n95ClienteCobNombreEmail1, BC00043_A96ClienteCobEmail1, BC00043_n96ClienteCobEmail1, BC00043_A97ClienteCobNombreEmail2, BC00043_n97ClienteCobNombreEmail2, BC00043_A98ClienteCobEmail2, BC00043_n98ClienteCobEmail2,
            BC00043_A99ClienteFacFax, BC00043_n99ClienteFacFax, BC00043_A100ClienteFacEmail, BC00043_n100ClienteFacEmail, BC00043_A101ClienteFacContrato, BC00043_n101ClienteFacContrato, BC00043_A102ClienteFacObservaciones, BC00043_n102ClienteFacObservaciones, BC00043_A103ClienteFacLista, BC00043_n103ClienteFacLista,
            BC00043_A104ClienteFacContado, BC00043_n104ClienteFacContado, BC00043_A105ClienteNotEmailFrascos1, BC00043_n105ClienteNotEmailFrascos1, BC00043_A106ClienteNotEmailFrascos2, BC00043_n106ClienteNotEmailFrascos2, BC00043_A107ClienteNotEmailMuestra1, BC00043_n107ClienteNotEmailMuestra1, BC00043_A108ClienteNotEmailMuestra2, BC00043_n108ClienteNotEmailMuestra2,
            BC00043_A109ClienteNotEmailAnalisis1, BC00043_n109ClienteNotEmailAnalisis1, BC00043_A110ClienteNotEmailAnalisis2, BC00043_n110ClienteNotEmailAnalisis2, BC00043_A111ClienteNotEmailGeneral1, BC00043_n111ClienteNotEmailGeneral1, BC00043_A112ClienteNotEmailGeneral2, BC00043_n112ClienteNotEmailGeneral2, BC00043_A113ClienteIncobrable, BC00043_n113ClienteIncobrable
            }
            , new Object[] {
            BC00044_A4ClienteId, BC00044_A45ClienteNombre, BC00044_n45ClienteNombre, BC00044_A46ClienteEmail, BC00044_n46ClienteEmail, BC00044_A47ClienteNombreEmail1, BC00044_n47ClienteNombreEmail1, BC00044_A48ClienteEmail1, BC00044_n48ClienteEmail1, BC00044_A49ClienteNombreEmail2,
            BC00044_n49ClienteNombreEmail2, BC00044_A50ClienteEmail2, BC00044_n50ClienteEmail2, BC00044_A51ClienteEnvio, BC00044_n51ClienteEnvio, BC00044_A52ClienteUsuarioWeb, BC00044_n52ClienteUsuarioWeb, BC00044_A53ClienteNombreCelular1, BC00044_n53ClienteNombreCelular1, BC00044_A54ClienteCelular1,
            BC00044_n54ClienteCelular1, BC00044_A55ClienteNombreCelular2, BC00044_n55ClienteNombreCelular2, BC00044_A56ClienteCelular2, BC00044_n56ClienteCelular2, BC00044_A57ClienteCodigoFigaro, BC00044_n57ClienteCodigoFigaro, BC00044_A58ClienteTipoUsuario, BC00044_n58ClienteTipoUsuario, BC00044_A59ClienteDireccion,
            BC00044_n59ClienteDireccion, BC00044_A60ClienteNombreTelefono1, BC00044_n60ClienteNombreTelefono1, BC00044_A61ClienteTelefono1, BC00044_n61ClienteTelefono1, BC00044_A62ClienteNombreTelefono2, BC00044_n62ClienteNombreTelefono2, BC00044_A63ClienteTelefono2, BC00044_n63ClienteTelefono2, BC00044_A64ClienteFax,
            BC00044_n64ClienteFax, BC00044_A65ClienteDicose, BC00044_n65ClienteDicose, BC00044_A66ClienteIdDepartamento, BC00044_n66ClienteIdDepartamento, BC00044_A67ClienteIdLocalidad, BC00044_n67ClienteIdLocalidad, BC00044_A68ClienteTecnico1, BC00044_n68ClienteTecnico1, BC00044_A69ClienteTecnico2,
            BC00044_n69ClienteTecnico2, BC00044_A70ClienteIdAgencia, BC00044_n70ClienteIdAgencia, BC00044_A71ClienteContrato, BC00044_n71ClienteContrato, BC00044_A72ClienteSocio, BC00044_n72ClienteSocio, BC00044_A73ClienteNoUsar, BC00044_n73ClienteNoUsar, BC00044_A74ClienteCodbar,
            BC00044_n74ClienteCodbar, BC00044_A75ClienteCaravanas, BC00044_n75ClienteCaravanas, BC00044_A76ClienteProlesa, BC00044_n76ClienteProlesa, BC00044_A77ClienteProlesaSuc, BC00044_n77ClienteProlesaSuc, BC00044_A168ClienteProlesaMat, BC00044_A78ClienteObservaciones, BC00044_n78ClienteObservaciones,
            BC00044_A79ClienteFacRsocial, BC00044_n79ClienteFacRsocial, BC00044_A80ClienteFacCedula, BC00044_n80ClienteFacCedula, BC00044_A81ClienteFacRut, BC00044_n81ClienteFacRut, BC00044_A82ClienteFacDireccion, BC00044_n82ClienteFacDireccion, BC00044_A83ClienteFacLocalidad, BC00044_n83ClienteFacLocalidad,
            BC00044_A84ClienteFacDepartamento, BC00044_n84ClienteFacDepartamento, BC00044_A85ClienteFacCpostal, BC00044_n85ClienteFacCpostal, BC00044_A86ClienteFacGiro, BC00044_n86ClienteFacGiro, BC00044_A87ClienteCobNombreTelefono1, BC00044_n87ClienteCobNombreTelefono1, BC00044_A88ClienteFacTelefonos, BC00044_n88ClienteFacTelefonos,
            BC00044_A89ClienteCobNombreTelefono2, BC00044_n89ClienteCobNombreTelefono2, BC00044_A90ClienteCobTelefono2, BC00044_n90ClienteCobTelefono2, BC00044_A91ClienteCobNombreCelular1, BC00044_n91ClienteCobNombreCelular1, BC00044_A92ClienteCobCelular1, BC00044_n92ClienteCobCelular1, BC00044_A93ClienteCobNombreCelular2, BC00044_n93ClienteCobNombreCelular2,
            BC00044_A94ClienteCobCelular2, BC00044_n94ClienteCobCelular2, BC00044_A95ClienteCobNombreEmail1, BC00044_n95ClienteCobNombreEmail1, BC00044_A96ClienteCobEmail1, BC00044_n96ClienteCobEmail1, BC00044_A97ClienteCobNombreEmail2, BC00044_n97ClienteCobNombreEmail2, BC00044_A98ClienteCobEmail2, BC00044_n98ClienteCobEmail2,
            BC00044_A99ClienteFacFax, BC00044_n99ClienteFacFax, BC00044_A100ClienteFacEmail, BC00044_n100ClienteFacEmail, BC00044_A101ClienteFacContrato, BC00044_n101ClienteFacContrato, BC00044_A102ClienteFacObservaciones, BC00044_n102ClienteFacObservaciones, BC00044_A103ClienteFacLista, BC00044_n103ClienteFacLista,
            BC00044_A104ClienteFacContado, BC00044_n104ClienteFacContado, BC00044_A105ClienteNotEmailFrascos1, BC00044_n105ClienteNotEmailFrascos1, BC00044_A106ClienteNotEmailFrascos2, BC00044_n106ClienteNotEmailFrascos2, BC00044_A107ClienteNotEmailMuestra1, BC00044_n107ClienteNotEmailMuestra1, BC00044_A108ClienteNotEmailMuestra2, BC00044_n108ClienteNotEmailMuestra2,
            BC00044_A109ClienteNotEmailAnalisis1, BC00044_n109ClienteNotEmailAnalisis1, BC00044_A110ClienteNotEmailAnalisis2, BC00044_n110ClienteNotEmailAnalisis2, BC00044_A111ClienteNotEmailGeneral1, BC00044_n111ClienteNotEmailGeneral1, BC00044_A112ClienteNotEmailGeneral2, BC00044_n112ClienteNotEmailGeneral2, BC00044_A113ClienteIncobrable, BC00044_n113ClienteIncobrable
            }
            , new Object[] {
            BC00045_A4ClienteId
            }
            , new Object[] {
            BC00046_A4ClienteId, BC00046_A45ClienteNombre, BC00046_n45ClienteNombre, BC00046_A46ClienteEmail, BC00046_n46ClienteEmail, BC00046_A47ClienteNombreEmail1, BC00046_n47ClienteNombreEmail1, BC00046_A48ClienteEmail1, BC00046_n48ClienteEmail1, BC00046_A49ClienteNombreEmail2,
            BC00046_n49ClienteNombreEmail2, BC00046_A50ClienteEmail2, BC00046_n50ClienteEmail2, BC00046_A51ClienteEnvio, BC00046_n51ClienteEnvio, BC00046_A52ClienteUsuarioWeb, BC00046_n52ClienteUsuarioWeb, BC00046_A53ClienteNombreCelular1, BC00046_n53ClienteNombreCelular1, BC00046_A54ClienteCelular1,
            BC00046_n54ClienteCelular1, BC00046_A55ClienteNombreCelular2, BC00046_n55ClienteNombreCelular2, BC00046_A56ClienteCelular2, BC00046_n56ClienteCelular2, BC00046_A57ClienteCodigoFigaro, BC00046_n57ClienteCodigoFigaro, BC00046_A58ClienteTipoUsuario, BC00046_n58ClienteTipoUsuario, BC00046_A59ClienteDireccion,
            BC00046_n59ClienteDireccion, BC00046_A60ClienteNombreTelefono1, BC00046_n60ClienteNombreTelefono1, BC00046_A61ClienteTelefono1, BC00046_n61ClienteTelefono1, BC00046_A62ClienteNombreTelefono2, BC00046_n62ClienteNombreTelefono2, BC00046_A63ClienteTelefono2, BC00046_n63ClienteTelefono2, BC00046_A64ClienteFax,
            BC00046_n64ClienteFax, BC00046_A65ClienteDicose, BC00046_n65ClienteDicose, BC00046_A66ClienteIdDepartamento, BC00046_n66ClienteIdDepartamento, BC00046_A67ClienteIdLocalidad, BC00046_n67ClienteIdLocalidad, BC00046_A68ClienteTecnico1, BC00046_n68ClienteTecnico1, BC00046_A69ClienteTecnico2,
            BC00046_n69ClienteTecnico2, BC00046_A70ClienteIdAgencia, BC00046_n70ClienteIdAgencia, BC00046_A71ClienteContrato, BC00046_n71ClienteContrato, BC00046_A72ClienteSocio, BC00046_n72ClienteSocio, BC00046_A73ClienteNoUsar, BC00046_n73ClienteNoUsar, BC00046_A74ClienteCodbar,
            BC00046_n74ClienteCodbar, BC00046_A75ClienteCaravanas, BC00046_n75ClienteCaravanas, BC00046_A76ClienteProlesa, BC00046_n76ClienteProlesa, BC00046_A77ClienteProlesaSuc, BC00046_n77ClienteProlesaSuc, BC00046_A168ClienteProlesaMat, BC00046_A78ClienteObservaciones, BC00046_n78ClienteObservaciones,
            BC00046_A79ClienteFacRsocial, BC00046_n79ClienteFacRsocial, BC00046_A80ClienteFacCedula, BC00046_n80ClienteFacCedula, BC00046_A81ClienteFacRut, BC00046_n81ClienteFacRut, BC00046_A82ClienteFacDireccion, BC00046_n82ClienteFacDireccion, BC00046_A83ClienteFacLocalidad, BC00046_n83ClienteFacLocalidad,
            BC00046_A84ClienteFacDepartamento, BC00046_n84ClienteFacDepartamento, BC00046_A85ClienteFacCpostal, BC00046_n85ClienteFacCpostal, BC00046_A86ClienteFacGiro, BC00046_n86ClienteFacGiro, BC00046_A87ClienteCobNombreTelefono1, BC00046_n87ClienteCobNombreTelefono1, BC00046_A88ClienteFacTelefonos, BC00046_n88ClienteFacTelefonos,
            BC00046_A89ClienteCobNombreTelefono2, BC00046_n89ClienteCobNombreTelefono2, BC00046_A90ClienteCobTelefono2, BC00046_n90ClienteCobTelefono2, BC00046_A91ClienteCobNombreCelular1, BC00046_n91ClienteCobNombreCelular1, BC00046_A92ClienteCobCelular1, BC00046_n92ClienteCobCelular1, BC00046_A93ClienteCobNombreCelular2, BC00046_n93ClienteCobNombreCelular2,
            BC00046_A94ClienteCobCelular2, BC00046_n94ClienteCobCelular2, BC00046_A95ClienteCobNombreEmail1, BC00046_n95ClienteCobNombreEmail1, BC00046_A96ClienteCobEmail1, BC00046_n96ClienteCobEmail1, BC00046_A97ClienteCobNombreEmail2, BC00046_n97ClienteCobNombreEmail2, BC00046_A98ClienteCobEmail2, BC00046_n98ClienteCobEmail2,
            BC00046_A99ClienteFacFax, BC00046_n99ClienteFacFax, BC00046_A100ClienteFacEmail, BC00046_n100ClienteFacEmail, BC00046_A101ClienteFacContrato, BC00046_n101ClienteFacContrato, BC00046_A102ClienteFacObservaciones, BC00046_n102ClienteFacObservaciones, BC00046_A103ClienteFacLista, BC00046_n103ClienteFacLista,
            BC00046_A104ClienteFacContado, BC00046_n104ClienteFacContado, BC00046_A105ClienteNotEmailFrascos1, BC00046_n105ClienteNotEmailFrascos1, BC00046_A106ClienteNotEmailFrascos2, BC00046_n106ClienteNotEmailFrascos2, BC00046_A107ClienteNotEmailMuestra1, BC00046_n107ClienteNotEmailMuestra1, BC00046_A108ClienteNotEmailMuestra2, BC00046_n108ClienteNotEmailMuestra2,
            BC00046_A109ClienteNotEmailAnalisis1, BC00046_n109ClienteNotEmailAnalisis1, BC00046_A110ClienteNotEmailAnalisis2, BC00046_n110ClienteNotEmailAnalisis2, BC00046_A111ClienteNotEmailGeneral1, BC00046_n111ClienteNotEmailGeneral1, BC00046_A112ClienteNotEmailGeneral2, BC00046_n112ClienteNotEmailGeneral2, BC00046_A113ClienteIncobrable, BC00046_n113ClienteIncobrable
            }
            , new Object[] {
            BC00047_A4ClienteId, BC00047_A45ClienteNombre, BC00047_n45ClienteNombre, BC00047_A46ClienteEmail, BC00047_n46ClienteEmail, BC00047_A47ClienteNombreEmail1, BC00047_n47ClienteNombreEmail1, BC00047_A48ClienteEmail1, BC00047_n48ClienteEmail1, BC00047_A49ClienteNombreEmail2,
            BC00047_n49ClienteNombreEmail2, BC00047_A50ClienteEmail2, BC00047_n50ClienteEmail2, BC00047_A51ClienteEnvio, BC00047_n51ClienteEnvio, BC00047_A52ClienteUsuarioWeb, BC00047_n52ClienteUsuarioWeb, BC00047_A53ClienteNombreCelular1, BC00047_n53ClienteNombreCelular1, BC00047_A54ClienteCelular1,
            BC00047_n54ClienteCelular1, BC00047_A55ClienteNombreCelular2, BC00047_n55ClienteNombreCelular2, BC00047_A56ClienteCelular2, BC00047_n56ClienteCelular2, BC00047_A57ClienteCodigoFigaro, BC00047_n57ClienteCodigoFigaro, BC00047_A58ClienteTipoUsuario, BC00047_n58ClienteTipoUsuario, BC00047_A59ClienteDireccion,
            BC00047_n59ClienteDireccion, BC00047_A60ClienteNombreTelefono1, BC00047_n60ClienteNombreTelefono1, BC00047_A61ClienteTelefono1, BC00047_n61ClienteTelefono1, BC00047_A62ClienteNombreTelefono2, BC00047_n62ClienteNombreTelefono2, BC00047_A63ClienteTelefono2, BC00047_n63ClienteTelefono2, BC00047_A64ClienteFax,
            BC00047_n64ClienteFax, BC00047_A65ClienteDicose, BC00047_n65ClienteDicose, BC00047_A66ClienteIdDepartamento, BC00047_n66ClienteIdDepartamento, BC00047_A67ClienteIdLocalidad, BC00047_n67ClienteIdLocalidad, BC00047_A68ClienteTecnico1, BC00047_n68ClienteTecnico1, BC00047_A69ClienteTecnico2,
            BC00047_n69ClienteTecnico2, BC00047_A70ClienteIdAgencia, BC00047_n70ClienteIdAgencia, BC00047_A71ClienteContrato, BC00047_n71ClienteContrato, BC00047_A72ClienteSocio, BC00047_n72ClienteSocio, BC00047_A73ClienteNoUsar, BC00047_n73ClienteNoUsar, BC00047_A74ClienteCodbar,
            BC00047_n74ClienteCodbar, BC00047_A75ClienteCaravanas, BC00047_n75ClienteCaravanas, BC00047_A76ClienteProlesa, BC00047_n76ClienteProlesa, BC00047_A77ClienteProlesaSuc, BC00047_n77ClienteProlesaSuc, BC00047_A168ClienteProlesaMat, BC00047_A78ClienteObservaciones, BC00047_n78ClienteObservaciones,
            BC00047_A79ClienteFacRsocial, BC00047_n79ClienteFacRsocial, BC00047_A80ClienteFacCedula, BC00047_n80ClienteFacCedula, BC00047_A81ClienteFacRut, BC00047_n81ClienteFacRut, BC00047_A82ClienteFacDireccion, BC00047_n82ClienteFacDireccion, BC00047_A83ClienteFacLocalidad, BC00047_n83ClienteFacLocalidad,
            BC00047_A84ClienteFacDepartamento, BC00047_n84ClienteFacDepartamento, BC00047_A85ClienteFacCpostal, BC00047_n85ClienteFacCpostal, BC00047_A86ClienteFacGiro, BC00047_n86ClienteFacGiro, BC00047_A87ClienteCobNombreTelefono1, BC00047_n87ClienteCobNombreTelefono1, BC00047_A88ClienteFacTelefonos, BC00047_n88ClienteFacTelefonos,
            BC00047_A89ClienteCobNombreTelefono2, BC00047_n89ClienteCobNombreTelefono2, BC00047_A90ClienteCobTelefono2, BC00047_n90ClienteCobTelefono2, BC00047_A91ClienteCobNombreCelular1, BC00047_n91ClienteCobNombreCelular1, BC00047_A92ClienteCobCelular1, BC00047_n92ClienteCobCelular1, BC00047_A93ClienteCobNombreCelular2, BC00047_n93ClienteCobNombreCelular2,
            BC00047_A94ClienteCobCelular2, BC00047_n94ClienteCobCelular2, BC00047_A95ClienteCobNombreEmail1, BC00047_n95ClienteCobNombreEmail1, BC00047_A96ClienteCobEmail1, BC00047_n96ClienteCobEmail1, BC00047_A97ClienteCobNombreEmail2, BC00047_n97ClienteCobNombreEmail2, BC00047_A98ClienteCobEmail2, BC00047_n98ClienteCobEmail2,
            BC00047_A99ClienteFacFax, BC00047_n99ClienteFacFax, BC00047_A100ClienteFacEmail, BC00047_n100ClienteFacEmail, BC00047_A101ClienteFacContrato, BC00047_n101ClienteFacContrato, BC00047_A102ClienteFacObservaciones, BC00047_n102ClienteFacObservaciones, BC00047_A103ClienteFacLista, BC00047_n103ClienteFacLista,
            BC00047_A104ClienteFacContado, BC00047_n104ClienteFacContado, BC00047_A105ClienteNotEmailFrascos1, BC00047_n105ClienteNotEmailFrascos1, BC00047_A106ClienteNotEmailFrascos2, BC00047_n106ClienteNotEmailFrascos2, BC00047_A107ClienteNotEmailMuestra1, BC00047_n107ClienteNotEmailMuestra1, BC00047_A108ClienteNotEmailMuestra2, BC00047_n108ClienteNotEmailMuestra2,
            BC00047_A109ClienteNotEmailAnalisis1, BC00047_n109ClienteNotEmailAnalisis1, BC00047_A110ClienteNotEmailAnalisis2, BC00047_n110ClienteNotEmailAnalisis2, BC00047_A111ClienteNotEmailGeneral1, BC00047_n111ClienteNotEmailGeneral1, BC00047_A112ClienteNotEmailGeneral2, BC00047_n112ClienteNotEmailGeneral2, BC00047_A113ClienteIncobrable, BC00047_n113ClienteIncobrable
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000411_A4ClienteId, BC000411_A45ClienteNombre, BC000411_n45ClienteNombre, BC000411_A46ClienteEmail, BC000411_n46ClienteEmail, BC000411_A47ClienteNombreEmail1, BC000411_n47ClienteNombreEmail1, BC000411_A48ClienteEmail1, BC000411_n48ClienteEmail1, BC000411_A49ClienteNombreEmail2,
            BC000411_n49ClienteNombreEmail2, BC000411_A50ClienteEmail2, BC000411_n50ClienteEmail2, BC000411_A51ClienteEnvio, BC000411_n51ClienteEnvio, BC000411_A52ClienteUsuarioWeb, BC000411_n52ClienteUsuarioWeb, BC000411_A53ClienteNombreCelular1, BC000411_n53ClienteNombreCelular1, BC000411_A54ClienteCelular1,
            BC000411_n54ClienteCelular1, BC000411_A55ClienteNombreCelular2, BC000411_n55ClienteNombreCelular2, BC000411_A56ClienteCelular2, BC000411_n56ClienteCelular2, BC000411_A57ClienteCodigoFigaro, BC000411_n57ClienteCodigoFigaro, BC000411_A58ClienteTipoUsuario, BC000411_n58ClienteTipoUsuario, BC000411_A59ClienteDireccion,
            BC000411_n59ClienteDireccion, BC000411_A60ClienteNombreTelefono1, BC000411_n60ClienteNombreTelefono1, BC000411_A61ClienteTelefono1, BC000411_n61ClienteTelefono1, BC000411_A62ClienteNombreTelefono2, BC000411_n62ClienteNombreTelefono2, BC000411_A63ClienteTelefono2, BC000411_n63ClienteTelefono2, BC000411_A64ClienteFax,
            BC000411_n64ClienteFax, BC000411_A65ClienteDicose, BC000411_n65ClienteDicose, BC000411_A66ClienteIdDepartamento, BC000411_n66ClienteIdDepartamento, BC000411_A67ClienteIdLocalidad, BC000411_n67ClienteIdLocalidad, BC000411_A68ClienteTecnico1, BC000411_n68ClienteTecnico1, BC000411_A69ClienteTecnico2,
            BC000411_n69ClienteTecnico2, BC000411_A70ClienteIdAgencia, BC000411_n70ClienteIdAgencia, BC000411_A71ClienteContrato, BC000411_n71ClienteContrato, BC000411_A72ClienteSocio, BC000411_n72ClienteSocio, BC000411_A73ClienteNoUsar, BC000411_n73ClienteNoUsar, BC000411_A74ClienteCodbar,
            BC000411_n74ClienteCodbar, BC000411_A75ClienteCaravanas, BC000411_n75ClienteCaravanas, BC000411_A76ClienteProlesa, BC000411_n76ClienteProlesa, BC000411_A77ClienteProlesaSuc, BC000411_n77ClienteProlesaSuc, BC000411_A168ClienteProlesaMat, BC000411_A78ClienteObservaciones, BC000411_n78ClienteObservaciones,
            BC000411_A79ClienteFacRsocial, BC000411_n79ClienteFacRsocial, BC000411_A80ClienteFacCedula, BC000411_n80ClienteFacCedula, BC000411_A81ClienteFacRut, BC000411_n81ClienteFacRut, BC000411_A82ClienteFacDireccion, BC000411_n82ClienteFacDireccion, BC000411_A83ClienteFacLocalidad, BC000411_n83ClienteFacLocalidad,
            BC000411_A84ClienteFacDepartamento, BC000411_n84ClienteFacDepartamento, BC000411_A85ClienteFacCpostal, BC000411_n85ClienteFacCpostal, BC000411_A86ClienteFacGiro, BC000411_n86ClienteFacGiro, BC000411_A87ClienteCobNombreTelefono1, BC000411_n87ClienteCobNombreTelefono1, BC000411_A88ClienteFacTelefonos, BC000411_n88ClienteFacTelefonos,
            BC000411_A89ClienteCobNombreTelefono2, BC000411_n89ClienteCobNombreTelefono2, BC000411_A90ClienteCobTelefono2, BC000411_n90ClienteCobTelefono2, BC000411_A91ClienteCobNombreCelular1, BC000411_n91ClienteCobNombreCelular1, BC000411_A92ClienteCobCelular1, BC000411_n92ClienteCobCelular1, BC000411_A93ClienteCobNombreCelular2, BC000411_n93ClienteCobNombreCelular2,
            BC000411_A94ClienteCobCelular2, BC000411_n94ClienteCobCelular2, BC000411_A95ClienteCobNombreEmail1, BC000411_n95ClienteCobNombreEmail1, BC000411_A96ClienteCobEmail1, BC000411_n96ClienteCobEmail1, BC000411_A97ClienteCobNombreEmail2, BC000411_n97ClienteCobNombreEmail2, BC000411_A98ClienteCobEmail2, BC000411_n98ClienteCobEmail2,
            BC000411_A99ClienteFacFax, BC000411_n99ClienteFacFax, BC000411_A100ClienteFacEmail, BC000411_n100ClienteFacEmail, BC000411_A101ClienteFacContrato, BC000411_n101ClienteFacContrato, BC000411_A102ClienteFacObservaciones, BC000411_n102ClienteFacObservaciones, BC000411_A103ClienteFacLista, BC000411_n103ClienteFacLista,
            BC000411_A104ClienteFacContado, BC000411_n104ClienteFacContado, BC000411_A105ClienteNotEmailFrascos1, BC000411_n105ClienteNotEmailFrascos1, BC000411_A106ClienteNotEmailFrascos2, BC000411_n106ClienteNotEmailFrascos2, BC000411_A107ClienteNotEmailMuestra1, BC000411_n107ClienteNotEmailMuestra1, BC000411_A108ClienteNotEmailMuestra2, BC000411_n108ClienteNotEmailMuestra2,
            BC000411_A109ClienteNotEmailAnalisis1, BC000411_n109ClienteNotEmailAnalisis1, BC000411_A110ClienteNotEmailAnalisis2, BC000411_n110ClienteNotEmailAnalisis2, BC000411_A111ClienteNotEmailGeneral1, BC000411_n111ClienteNotEmailGeneral1, BC000411_A112ClienteNotEmailGeneral2, BC000411_n112ClienteNotEmailGeneral2, BC000411_A113ClienteIncobrable, BC000411_n113ClienteIncobrable
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
   private short Z58ClienteTipoUsuario ;
   private short A58ClienteTipoUsuario ;
   private short Z71ClienteContrato ;
   private short A71ClienteContrato ;
   private short Z72ClienteSocio ;
   private short A72ClienteSocio ;
   private short Z73ClienteNoUsar ;
   private short A73ClienteNoUsar ;
   private short Z74ClienteCodbar ;
   private short A74ClienteCodbar ;
   private short Z75ClienteCaravanas ;
   private short A75ClienteCaravanas ;
   private short Z76ClienteProlesa ;
   private short A76ClienteProlesa ;
   private short Z104ClienteFacContado ;
   private short A104ClienteFacContado ;
   private short Z113ClienteIncobrable ;
   private short A113ClienteIncobrable ;
   private short RcdFound4 ;
   private short nIsDirty_4 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z4ClienteId ;
   private long A4ClienteId ;
   private long Z66ClienteIdDepartamento ;
   private long A66ClienteIdDepartamento ;
   private long Z67ClienteIdLocalidad ;
   private long A67ClienteIdLocalidad ;
   private long Z68ClienteTecnico1 ;
   private long A68ClienteTecnico1 ;
   private long Z69ClienteTecnico2 ;
   private long A69ClienteTecnico2 ;
   private long Z70ClienteIdAgencia ;
   private long A70ClienteIdAgencia ;
   private long Z77ClienteProlesaSuc ;
   private long A77ClienteProlesaSuc ;
   private long Z168ClienteProlesaMat ;
   private long A168ClienteProlesaMat ;
   private long Z84ClienteFacDepartamento ;
   private long A84ClienteFacDepartamento ;
   private long Z86ClienteFacGiro ;
   private long A86ClienteFacGiro ;
   private long Z103ClienteFacLista ;
   private long A103ClienteFacLista ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode4 ;
   private boolean n45ClienteNombre ;
   private boolean n46ClienteEmail ;
   private boolean n47ClienteNombreEmail1 ;
   private boolean n48ClienteEmail1 ;
   private boolean n49ClienteNombreEmail2 ;
   private boolean n50ClienteEmail2 ;
   private boolean n51ClienteEnvio ;
   private boolean n52ClienteUsuarioWeb ;
   private boolean n53ClienteNombreCelular1 ;
   private boolean n54ClienteCelular1 ;
   private boolean n55ClienteNombreCelular2 ;
   private boolean n56ClienteCelular2 ;
   private boolean n57ClienteCodigoFigaro ;
   private boolean n58ClienteTipoUsuario ;
   private boolean n59ClienteDireccion ;
   private boolean n60ClienteNombreTelefono1 ;
   private boolean n61ClienteTelefono1 ;
   private boolean n62ClienteNombreTelefono2 ;
   private boolean n63ClienteTelefono2 ;
   private boolean n64ClienteFax ;
   private boolean n65ClienteDicose ;
   private boolean n66ClienteIdDepartamento ;
   private boolean n67ClienteIdLocalidad ;
   private boolean n68ClienteTecnico1 ;
   private boolean n69ClienteTecnico2 ;
   private boolean n70ClienteIdAgencia ;
   private boolean n71ClienteContrato ;
   private boolean n72ClienteSocio ;
   private boolean n73ClienteNoUsar ;
   private boolean n74ClienteCodbar ;
   private boolean n75ClienteCaravanas ;
   private boolean n76ClienteProlesa ;
   private boolean n77ClienteProlesaSuc ;
   private boolean n78ClienteObservaciones ;
   private boolean n79ClienteFacRsocial ;
   private boolean n80ClienteFacCedula ;
   private boolean n81ClienteFacRut ;
   private boolean n82ClienteFacDireccion ;
   private boolean n83ClienteFacLocalidad ;
   private boolean n84ClienteFacDepartamento ;
   private boolean n85ClienteFacCpostal ;
   private boolean n86ClienteFacGiro ;
   private boolean n87ClienteCobNombreTelefono1 ;
   private boolean n88ClienteFacTelefonos ;
   private boolean n89ClienteCobNombreTelefono2 ;
   private boolean n90ClienteCobTelefono2 ;
   private boolean n91ClienteCobNombreCelular1 ;
   private boolean n92ClienteCobCelular1 ;
   private boolean n93ClienteCobNombreCelular2 ;
   private boolean n94ClienteCobCelular2 ;
   private boolean n95ClienteCobNombreEmail1 ;
   private boolean n96ClienteCobEmail1 ;
   private boolean n97ClienteCobNombreEmail2 ;
   private boolean n98ClienteCobEmail2 ;
   private boolean n99ClienteFacFax ;
   private boolean n100ClienteFacEmail ;
   private boolean n101ClienteFacContrato ;
   private boolean n102ClienteFacObservaciones ;
   private boolean n103ClienteFacLista ;
   private boolean n104ClienteFacContado ;
   private boolean n105ClienteNotEmailFrascos1 ;
   private boolean n106ClienteNotEmailFrascos2 ;
   private boolean n107ClienteNotEmailMuestra1 ;
   private boolean n108ClienteNotEmailMuestra2 ;
   private boolean n109ClienteNotEmailAnalisis1 ;
   private boolean n110ClienteNotEmailAnalisis2 ;
   private boolean n111ClienteNotEmailGeneral1 ;
   private boolean n112ClienteNotEmailGeneral2 ;
   private boolean n113ClienteIncobrable ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z45ClienteNombre ;
   private String A45ClienteNombre ;
   private String Z46ClienteEmail ;
   private String A46ClienteEmail ;
   private String Z47ClienteNombreEmail1 ;
   private String A47ClienteNombreEmail1 ;
   private String Z48ClienteEmail1 ;
   private String A48ClienteEmail1 ;
   private String Z49ClienteNombreEmail2 ;
   private String A49ClienteNombreEmail2 ;
   private String Z50ClienteEmail2 ;
   private String A50ClienteEmail2 ;
   private String Z51ClienteEnvio ;
   private String A51ClienteEnvio ;
   private String Z52ClienteUsuarioWeb ;
   private String A52ClienteUsuarioWeb ;
   private String Z53ClienteNombreCelular1 ;
   private String A53ClienteNombreCelular1 ;
   private String Z54ClienteCelular1 ;
   private String A54ClienteCelular1 ;
   private String Z55ClienteNombreCelular2 ;
   private String A55ClienteNombreCelular2 ;
   private String Z56ClienteCelular2 ;
   private String A56ClienteCelular2 ;
   private String Z57ClienteCodigoFigaro ;
   private String A57ClienteCodigoFigaro ;
   private String Z59ClienteDireccion ;
   private String A59ClienteDireccion ;
   private String Z60ClienteNombreTelefono1 ;
   private String A60ClienteNombreTelefono1 ;
   private String Z61ClienteTelefono1 ;
   private String A61ClienteTelefono1 ;
   private String Z62ClienteNombreTelefono2 ;
   private String A62ClienteNombreTelefono2 ;
   private String Z63ClienteTelefono2 ;
   private String A63ClienteTelefono2 ;
   private String Z64ClienteFax ;
   private String A64ClienteFax ;
   private String Z65ClienteDicose ;
   private String A65ClienteDicose ;
   private String Z78ClienteObservaciones ;
   private String A78ClienteObservaciones ;
   private String Z79ClienteFacRsocial ;
   private String A79ClienteFacRsocial ;
   private String Z80ClienteFacCedula ;
   private String A80ClienteFacCedula ;
   private String Z81ClienteFacRut ;
   private String A81ClienteFacRut ;
   private String Z82ClienteFacDireccion ;
   private String A82ClienteFacDireccion ;
   private String Z83ClienteFacLocalidad ;
   private String A83ClienteFacLocalidad ;
   private String Z85ClienteFacCpostal ;
   private String A85ClienteFacCpostal ;
   private String Z87ClienteCobNombreTelefono1 ;
   private String A87ClienteCobNombreTelefono1 ;
   private String Z88ClienteFacTelefonos ;
   private String A88ClienteFacTelefonos ;
   private String Z89ClienteCobNombreTelefono2 ;
   private String A89ClienteCobNombreTelefono2 ;
   private String Z90ClienteCobTelefono2 ;
   private String A90ClienteCobTelefono2 ;
   private String Z91ClienteCobNombreCelular1 ;
   private String A91ClienteCobNombreCelular1 ;
   private String Z92ClienteCobCelular1 ;
   private String A92ClienteCobCelular1 ;
   private String Z93ClienteCobNombreCelular2 ;
   private String A93ClienteCobNombreCelular2 ;
   private String Z94ClienteCobCelular2 ;
   private String A94ClienteCobCelular2 ;
   private String Z95ClienteCobNombreEmail1 ;
   private String A95ClienteCobNombreEmail1 ;
   private String Z96ClienteCobEmail1 ;
   private String A96ClienteCobEmail1 ;
   private String Z97ClienteCobNombreEmail2 ;
   private String A97ClienteCobNombreEmail2 ;
   private String Z98ClienteCobEmail2 ;
   private String A98ClienteCobEmail2 ;
   private String Z99ClienteFacFax ;
   private String A99ClienteFacFax ;
   private String Z100ClienteFacEmail ;
   private String A100ClienteFacEmail ;
   private String Z101ClienteFacContrato ;
   private String A101ClienteFacContrato ;
   private String Z102ClienteFacObservaciones ;
   private String A102ClienteFacObservaciones ;
   private String Z105ClienteNotEmailFrascos1 ;
   private String A105ClienteNotEmailFrascos1 ;
   private String Z106ClienteNotEmailFrascos2 ;
   private String A106ClienteNotEmailFrascos2 ;
   private String Z107ClienteNotEmailMuestra1 ;
   private String A107ClienteNotEmailMuestra1 ;
   private String Z108ClienteNotEmailMuestra2 ;
   private String A108ClienteNotEmailMuestra2 ;
   private String Z109ClienteNotEmailAnalisis1 ;
   private String A109ClienteNotEmailAnalisis1 ;
   private String Z110ClienteNotEmailAnalisis2 ;
   private String A110ClienteNotEmailAnalisis2 ;
   private String Z111ClienteNotEmailGeneral1 ;
   private String A111ClienteNotEmailGeneral1 ;
   private String Z112ClienteNotEmailGeneral2 ;
   private String A112ClienteNotEmailGeneral2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.colaveco.SdtCliente bcCliente ;
   private IDataStoreProvider pr_default ;
   private long[] BC00044_A4ClienteId ;
   private String[] BC00044_A45ClienteNombre ;
   private boolean[] BC00044_n45ClienteNombre ;
   private String[] BC00044_A46ClienteEmail ;
   private boolean[] BC00044_n46ClienteEmail ;
   private String[] BC00044_A47ClienteNombreEmail1 ;
   private boolean[] BC00044_n47ClienteNombreEmail1 ;
   private String[] BC00044_A48ClienteEmail1 ;
   private boolean[] BC00044_n48ClienteEmail1 ;
   private String[] BC00044_A49ClienteNombreEmail2 ;
   private boolean[] BC00044_n49ClienteNombreEmail2 ;
   private String[] BC00044_A50ClienteEmail2 ;
   private boolean[] BC00044_n50ClienteEmail2 ;
   private String[] BC00044_A51ClienteEnvio ;
   private boolean[] BC00044_n51ClienteEnvio ;
   private String[] BC00044_A52ClienteUsuarioWeb ;
   private boolean[] BC00044_n52ClienteUsuarioWeb ;
   private String[] BC00044_A53ClienteNombreCelular1 ;
   private boolean[] BC00044_n53ClienteNombreCelular1 ;
   private String[] BC00044_A54ClienteCelular1 ;
   private boolean[] BC00044_n54ClienteCelular1 ;
   private String[] BC00044_A55ClienteNombreCelular2 ;
   private boolean[] BC00044_n55ClienteNombreCelular2 ;
   private String[] BC00044_A56ClienteCelular2 ;
   private boolean[] BC00044_n56ClienteCelular2 ;
   private String[] BC00044_A57ClienteCodigoFigaro ;
   private boolean[] BC00044_n57ClienteCodigoFigaro ;
   private short[] BC00044_A58ClienteTipoUsuario ;
   private boolean[] BC00044_n58ClienteTipoUsuario ;
   private String[] BC00044_A59ClienteDireccion ;
   private boolean[] BC00044_n59ClienteDireccion ;
   private String[] BC00044_A60ClienteNombreTelefono1 ;
   private boolean[] BC00044_n60ClienteNombreTelefono1 ;
   private String[] BC00044_A61ClienteTelefono1 ;
   private boolean[] BC00044_n61ClienteTelefono1 ;
   private String[] BC00044_A62ClienteNombreTelefono2 ;
   private boolean[] BC00044_n62ClienteNombreTelefono2 ;
   private String[] BC00044_A63ClienteTelefono2 ;
   private boolean[] BC00044_n63ClienteTelefono2 ;
   private String[] BC00044_A64ClienteFax ;
   private boolean[] BC00044_n64ClienteFax ;
   private String[] BC00044_A65ClienteDicose ;
   private boolean[] BC00044_n65ClienteDicose ;
   private long[] BC00044_A66ClienteIdDepartamento ;
   private boolean[] BC00044_n66ClienteIdDepartamento ;
   private long[] BC00044_A67ClienteIdLocalidad ;
   private boolean[] BC00044_n67ClienteIdLocalidad ;
   private long[] BC00044_A68ClienteTecnico1 ;
   private boolean[] BC00044_n68ClienteTecnico1 ;
   private long[] BC00044_A69ClienteTecnico2 ;
   private boolean[] BC00044_n69ClienteTecnico2 ;
   private long[] BC00044_A70ClienteIdAgencia ;
   private boolean[] BC00044_n70ClienteIdAgencia ;
   private short[] BC00044_A71ClienteContrato ;
   private boolean[] BC00044_n71ClienteContrato ;
   private short[] BC00044_A72ClienteSocio ;
   private boolean[] BC00044_n72ClienteSocio ;
   private short[] BC00044_A73ClienteNoUsar ;
   private boolean[] BC00044_n73ClienteNoUsar ;
   private short[] BC00044_A74ClienteCodbar ;
   private boolean[] BC00044_n74ClienteCodbar ;
   private short[] BC00044_A75ClienteCaravanas ;
   private boolean[] BC00044_n75ClienteCaravanas ;
   private short[] BC00044_A76ClienteProlesa ;
   private boolean[] BC00044_n76ClienteProlesa ;
   private long[] BC00044_A77ClienteProlesaSuc ;
   private boolean[] BC00044_n77ClienteProlesaSuc ;
   private long[] BC00044_A168ClienteProlesaMat ;
   private String[] BC00044_A78ClienteObservaciones ;
   private boolean[] BC00044_n78ClienteObservaciones ;
   private String[] BC00044_A79ClienteFacRsocial ;
   private boolean[] BC00044_n79ClienteFacRsocial ;
   private String[] BC00044_A80ClienteFacCedula ;
   private boolean[] BC00044_n80ClienteFacCedula ;
   private String[] BC00044_A81ClienteFacRut ;
   private boolean[] BC00044_n81ClienteFacRut ;
   private String[] BC00044_A82ClienteFacDireccion ;
   private boolean[] BC00044_n82ClienteFacDireccion ;
   private String[] BC00044_A83ClienteFacLocalidad ;
   private boolean[] BC00044_n83ClienteFacLocalidad ;
   private long[] BC00044_A84ClienteFacDepartamento ;
   private boolean[] BC00044_n84ClienteFacDepartamento ;
   private String[] BC00044_A85ClienteFacCpostal ;
   private boolean[] BC00044_n85ClienteFacCpostal ;
   private long[] BC00044_A86ClienteFacGiro ;
   private boolean[] BC00044_n86ClienteFacGiro ;
   private String[] BC00044_A87ClienteCobNombreTelefono1 ;
   private boolean[] BC00044_n87ClienteCobNombreTelefono1 ;
   private String[] BC00044_A88ClienteFacTelefonos ;
   private boolean[] BC00044_n88ClienteFacTelefonos ;
   private String[] BC00044_A89ClienteCobNombreTelefono2 ;
   private boolean[] BC00044_n89ClienteCobNombreTelefono2 ;
   private String[] BC00044_A90ClienteCobTelefono2 ;
   private boolean[] BC00044_n90ClienteCobTelefono2 ;
   private String[] BC00044_A91ClienteCobNombreCelular1 ;
   private boolean[] BC00044_n91ClienteCobNombreCelular1 ;
   private String[] BC00044_A92ClienteCobCelular1 ;
   private boolean[] BC00044_n92ClienteCobCelular1 ;
   private String[] BC00044_A93ClienteCobNombreCelular2 ;
   private boolean[] BC00044_n93ClienteCobNombreCelular2 ;
   private String[] BC00044_A94ClienteCobCelular2 ;
   private boolean[] BC00044_n94ClienteCobCelular2 ;
   private String[] BC00044_A95ClienteCobNombreEmail1 ;
   private boolean[] BC00044_n95ClienteCobNombreEmail1 ;
   private String[] BC00044_A96ClienteCobEmail1 ;
   private boolean[] BC00044_n96ClienteCobEmail1 ;
   private String[] BC00044_A97ClienteCobNombreEmail2 ;
   private boolean[] BC00044_n97ClienteCobNombreEmail2 ;
   private String[] BC00044_A98ClienteCobEmail2 ;
   private boolean[] BC00044_n98ClienteCobEmail2 ;
   private String[] BC00044_A99ClienteFacFax ;
   private boolean[] BC00044_n99ClienteFacFax ;
   private String[] BC00044_A100ClienteFacEmail ;
   private boolean[] BC00044_n100ClienteFacEmail ;
   private String[] BC00044_A101ClienteFacContrato ;
   private boolean[] BC00044_n101ClienteFacContrato ;
   private String[] BC00044_A102ClienteFacObservaciones ;
   private boolean[] BC00044_n102ClienteFacObservaciones ;
   private long[] BC00044_A103ClienteFacLista ;
   private boolean[] BC00044_n103ClienteFacLista ;
   private short[] BC00044_A104ClienteFacContado ;
   private boolean[] BC00044_n104ClienteFacContado ;
   private String[] BC00044_A105ClienteNotEmailFrascos1 ;
   private boolean[] BC00044_n105ClienteNotEmailFrascos1 ;
   private String[] BC00044_A106ClienteNotEmailFrascos2 ;
   private boolean[] BC00044_n106ClienteNotEmailFrascos2 ;
   private String[] BC00044_A107ClienteNotEmailMuestra1 ;
   private boolean[] BC00044_n107ClienteNotEmailMuestra1 ;
   private String[] BC00044_A108ClienteNotEmailMuestra2 ;
   private boolean[] BC00044_n108ClienteNotEmailMuestra2 ;
   private String[] BC00044_A109ClienteNotEmailAnalisis1 ;
   private boolean[] BC00044_n109ClienteNotEmailAnalisis1 ;
   private String[] BC00044_A110ClienteNotEmailAnalisis2 ;
   private boolean[] BC00044_n110ClienteNotEmailAnalisis2 ;
   private String[] BC00044_A111ClienteNotEmailGeneral1 ;
   private boolean[] BC00044_n111ClienteNotEmailGeneral1 ;
   private String[] BC00044_A112ClienteNotEmailGeneral2 ;
   private boolean[] BC00044_n112ClienteNotEmailGeneral2 ;
   private short[] BC00044_A113ClienteIncobrable ;
   private boolean[] BC00044_n113ClienteIncobrable ;
   private long[] BC00045_A4ClienteId ;
   private long[] BC00046_A4ClienteId ;
   private String[] BC00046_A45ClienteNombre ;
   private boolean[] BC00046_n45ClienteNombre ;
   private String[] BC00046_A46ClienteEmail ;
   private boolean[] BC00046_n46ClienteEmail ;
   private String[] BC00046_A47ClienteNombreEmail1 ;
   private boolean[] BC00046_n47ClienteNombreEmail1 ;
   private String[] BC00046_A48ClienteEmail1 ;
   private boolean[] BC00046_n48ClienteEmail1 ;
   private String[] BC00046_A49ClienteNombreEmail2 ;
   private boolean[] BC00046_n49ClienteNombreEmail2 ;
   private String[] BC00046_A50ClienteEmail2 ;
   private boolean[] BC00046_n50ClienteEmail2 ;
   private String[] BC00046_A51ClienteEnvio ;
   private boolean[] BC00046_n51ClienteEnvio ;
   private String[] BC00046_A52ClienteUsuarioWeb ;
   private boolean[] BC00046_n52ClienteUsuarioWeb ;
   private String[] BC00046_A53ClienteNombreCelular1 ;
   private boolean[] BC00046_n53ClienteNombreCelular1 ;
   private String[] BC00046_A54ClienteCelular1 ;
   private boolean[] BC00046_n54ClienteCelular1 ;
   private String[] BC00046_A55ClienteNombreCelular2 ;
   private boolean[] BC00046_n55ClienteNombreCelular2 ;
   private String[] BC00046_A56ClienteCelular2 ;
   private boolean[] BC00046_n56ClienteCelular2 ;
   private String[] BC00046_A57ClienteCodigoFigaro ;
   private boolean[] BC00046_n57ClienteCodigoFigaro ;
   private short[] BC00046_A58ClienteTipoUsuario ;
   private boolean[] BC00046_n58ClienteTipoUsuario ;
   private String[] BC00046_A59ClienteDireccion ;
   private boolean[] BC00046_n59ClienteDireccion ;
   private String[] BC00046_A60ClienteNombreTelefono1 ;
   private boolean[] BC00046_n60ClienteNombreTelefono1 ;
   private String[] BC00046_A61ClienteTelefono1 ;
   private boolean[] BC00046_n61ClienteTelefono1 ;
   private String[] BC00046_A62ClienteNombreTelefono2 ;
   private boolean[] BC00046_n62ClienteNombreTelefono2 ;
   private String[] BC00046_A63ClienteTelefono2 ;
   private boolean[] BC00046_n63ClienteTelefono2 ;
   private String[] BC00046_A64ClienteFax ;
   private boolean[] BC00046_n64ClienteFax ;
   private String[] BC00046_A65ClienteDicose ;
   private boolean[] BC00046_n65ClienteDicose ;
   private long[] BC00046_A66ClienteIdDepartamento ;
   private boolean[] BC00046_n66ClienteIdDepartamento ;
   private long[] BC00046_A67ClienteIdLocalidad ;
   private boolean[] BC00046_n67ClienteIdLocalidad ;
   private long[] BC00046_A68ClienteTecnico1 ;
   private boolean[] BC00046_n68ClienteTecnico1 ;
   private long[] BC00046_A69ClienteTecnico2 ;
   private boolean[] BC00046_n69ClienteTecnico2 ;
   private long[] BC00046_A70ClienteIdAgencia ;
   private boolean[] BC00046_n70ClienteIdAgencia ;
   private short[] BC00046_A71ClienteContrato ;
   private boolean[] BC00046_n71ClienteContrato ;
   private short[] BC00046_A72ClienteSocio ;
   private boolean[] BC00046_n72ClienteSocio ;
   private short[] BC00046_A73ClienteNoUsar ;
   private boolean[] BC00046_n73ClienteNoUsar ;
   private short[] BC00046_A74ClienteCodbar ;
   private boolean[] BC00046_n74ClienteCodbar ;
   private short[] BC00046_A75ClienteCaravanas ;
   private boolean[] BC00046_n75ClienteCaravanas ;
   private short[] BC00046_A76ClienteProlesa ;
   private boolean[] BC00046_n76ClienteProlesa ;
   private long[] BC00046_A77ClienteProlesaSuc ;
   private boolean[] BC00046_n77ClienteProlesaSuc ;
   private long[] BC00046_A168ClienteProlesaMat ;
   private String[] BC00046_A78ClienteObservaciones ;
   private boolean[] BC00046_n78ClienteObservaciones ;
   private String[] BC00046_A79ClienteFacRsocial ;
   private boolean[] BC00046_n79ClienteFacRsocial ;
   private String[] BC00046_A80ClienteFacCedula ;
   private boolean[] BC00046_n80ClienteFacCedula ;
   private String[] BC00046_A81ClienteFacRut ;
   private boolean[] BC00046_n81ClienteFacRut ;
   private String[] BC00046_A82ClienteFacDireccion ;
   private boolean[] BC00046_n82ClienteFacDireccion ;
   private String[] BC00046_A83ClienteFacLocalidad ;
   private boolean[] BC00046_n83ClienteFacLocalidad ;
   private long[] BC00046_A84ClienteFacDepartamento ;
   private boolean[] BC00046_n84ClienteFacDepartamento ;
   private String[] BC00046_A85ClienteFacCpostal ;
   private boolean[] BC00046_n85ClienteFacCpostal ;
   private long[] BC00046_A86ClienteFacGiro ;
   private boolean[] BC00046_n86ClienteFacGiro ;
   private String[] BC00046_A87ClienteCobNombreTelefono1 ;
   private boolean[] BC00046_n87ClienteCobNombreTelefono1 ;
   private String[] BC00046_A88ClienteFacTelefonos ;
   private boolean[] BC00046_n88ClienteFacTelefonos ;
   private String[] BC00046_A89ClienteCobNombreTelefono2 ;
   private boolean[] BC00046_n89ClienteCobNombreTelefono2 ;
   private String[] BC00046_A90ClienteCobTelefono2 ;
   private boolean[] BC00046_n90ClienteCobTelefono2 ;
   private String[] BC00046_A91ClienteCobNombreCelular1 ;
   private boolean[] BC00046_n91ClienteCobNombreCelular1 ;
   private String[] BC00046_A92ClienteCobCelular1 ;
   private boolean[] BC00046_n92ClienteCobCelular1 ;
   private String[] BC00046_A93ClienteCobNombreCelular2 ;
   private boolean[] BC00046_n93ClienteCobNombreCelular2 ;
   private String[] BC00046_A94ClienteCobCelular2 ;
   private boolean[] BC00046_n94ClienteCobCelular2 ;
   private String[] BC00046_A95ClienteCobNombreEmail1 ;
   private boolean[] BC00046_n95ClienteCobNombreEmail1 ;
   private String[] BC00046_A96ClienteCobEmail1 ;
   private boolean[] BC00046_n96ClienteCobEmail1 ;
   private String[] BC00046_A97ClienteCobNombreEmail2 ;
   private boolean[] BC00046_n97ClienteCobNombreEmail2 ;
   private String[] BC00046_A98ClienteCobEmail2 ;
   private boolean[] BC00046_n98ClienteCobEmail2 ;
   private String[] BC00046_A99ClienteFacFax ;
   private boolean[] BC00046_n99ClienteFacFax ;
   private String[] BC00046_A100ClienteFacEmail ;
   private boolean[] BC00046_n100ClienteFacEmail ;
   private String[] BC00046_A101ClienteFacContrato ;
   private boolean[] BC00046_n101ClienteFacContrato ;
   private String[] BC00046_A102ClienteFacObservaciones ;
   private boolean[] BC00046_n102ClienteFacObservaciones ;
   private long[] BC00046_A103ClienteFacLista ;
   private boolean[] BC00046_n103ClienteFacLista ;
   private short[] BC00046_A104ClienteFacContado ;
   private boolean[] BC00046_n104ClienteFacContado ;
   private String[] BC00046_A105ClienteNotEmailFrascos1 ;
   private boolean[] BC00046_n105ClienteNotEmailFrascos1 ;
   private String[] BC00046_A106ClienteNotEmailFrascos2 ;
   private boolean[] BC00046_n106ClienteNotEmailFrascos2 ;
   private String[] BC00046_A107ClienteNotEmailMuestra1 ;
   private boolean[] BC00046_n107ClienteNotEmailMuestra1 ;
   private String[] BC00046_A108ClienteNotEmailMuestra2 ;
   private boolean[] BC00046_n108ClienteNotEmailMuestra2 ;
   private String[] BC00046_A109ClienteNotEmailAnalisis1 ;
   private boolean[] BC00046_n109ClienteNotEmailAnalisis1 ;
   private String[] BC00046_A110ClienteNotEmailAnalisis2 ;
   private boolean[] BC00046_n110ClienteNotEmailAnalisis2 ;
   private String[] BC00046_A111ClienteNotEmailGeneral1 ;
   private boolean[] BC00046_n111ClienteNotEmailGeneral1 ;
   private String[] BC00046_A112ClienteNotEmailGeneral2 ;
   private boolean[] BC00046_n112ClienteNotEmailGeneral2 ;
   private short[] BC00046_A113ClienteIncobrable ;
   private boolean[] BC00046_n113ClienteIncobrable ;
   private long[] BC00047_A4ClienteId ;
   private String[] BC00047_A45ClienteNombre ;
   private boolean[] BC00047_n45ClienteNombre ;
   private String[] BC00047_A46ClienteEmail ;
   private boolean[] BC00047_n46ClienteEmail ;
   private String[] BC00047_A47ClienteNombreEmail1 ;
   private boolean[] BC00047_n47ClienteNombreEmail1 ;
   private String[] BC00047_A48ClienteEmail1 ;
   private boolean[] BC00047_n48ClienteEmail1 ;
   private String[] BC00047_A49ClienteNombreEmail2 ;
   private boolean[] BC00047_n49ClienteNombreEmail2 ;
   private String[] BC00047_A50ClienteEmail2 ;
   private boolean[] BC00047_n50ClienteEmail2 ;
   private String[] BC00047_A51ClienteEnvio ;
   private boolean[] BC00047_n51ClienteEnvio ;
   private String[] BC00047_A52ClienteUsuarioWeb ;
   private boolean[] BC00047_n52ClienteUsuarioWeb ;
   private String[] BC00047_A53ClienteNombreCelular1 ;
   private boolean[] BC00047_n53ClienteNombreCelular1 ;
   private String[] BC00047_A54ClienteCelular1 ;
   private boolean[] BC00047_n54ClienteCelular1 ;
   private String[] BC00047_A55ClienteNombreCelular2 ;
   private boolean[] BC00047_n55ClienteNombreCelular2 ;
   private String[] BC00047_A56ClienteCelular2 ;
   private boolean[] BC00047_n56ClienteCelular2 ;
   private String[] BC00047_A57ClienteCodigoFigaro ;
   private boolean[] BC00047_n57ClienteCodigoFigaro ;
   private short[] BC00047_A58ClienteTipoUsuario ;
   private boolean[] BC00047_n58ClienteTipoUsuario ;
   private String[] BC00047_A59ClienteDireccion ;
   private boolean[] BC00047_n59ClienteDireccion ;
   private String[] BC00047_A60ClienteNombreTelefono1 ;
   private boolean[] BC00047_n60ClienteNombreTelefono1 ;
   private String[] BC00047_A61ClienteTelefono1 ;
   private boolean[] BC00047_n61ClienteTelefono1 ;
   private String[] BC00047_A62ClienteNombreTelefono2 ;
   private boolean[] BC00047_n62ClienteNombreTelefono2 ;
   private String[] BC00047_A63ClienteTelefono2 ;
   private boolean[] BC00047_n63ClienteTelefono2 ;
   private String[] BC00047_A64ClienteFax ;
   private boolean[] BC00047_n64ClienteFax ;
   private String[] BC00047_A65ClienteDicose ;
   private boolean[] BC00047_n65ClienteDicose ;
   private long[] BC00047_A66ClienteIdDepartamento ;
   private boolean[] BC00047_n66ClienteIdDepartamento ;
   private long[] BC00047_A67ClienteIdLocalidad ;
   private boolean[] BC00047_n67ClienteIdLocalidad ;
   private long[] BC00047_A68ClienteTecnico1 ;
   private boolean[] BC00047_n68ClienteTecnico1 ;
   private long[] BC00047_A69ClienteTecnico2 ;
   private boolean[] BC00047_n69ClienteTecnico2 ;
   private long[] BC00047_A70ClienteIdAgencia ;
   private boolean[] BC00047_n70ClienteIdAgencia ;
   private short[] BC00047_A71ClienteContrato ;
   private boolean[] BC00047_n71ClienteContrato ;
   private short[] BC00047_A72ClienteSocio ;
   private boolean[] BC00047_n72ClienteSocio ;
   private short[] BC00047_A73ClienteNoUsar ;
   private boolean[] BC00047_n73ClienteNoUsar ;
   private short[] BC00047_A74ClienteCodbar ;
   private boolean[] BC00047_n74ClienteCodbar ;
   private short[] BC00047_A75ClienteCaravanas ;
   private boolean[] BC00047_n75ClienteCaravanas ;
   private short[] BC00047_A76ClienteProlesa ;
   private boolean[] BC00047_n76ClienteProlesa ;
   private long[] BC00047_A77ClienteProlesaSuc ;
   private boolean[] BC00047_n77ClienteProlesaSuc ;
   private long[] BC00047_A168ClienteProlesaMat ;
   private String[] BC00047_A78ClienteObservaciones ;
   private boolean[] BC00047_n78ClienteObservaciones ;
   private String[] BC00047_A79ClienteFacRsocial ;
   private boolean[] BC00047_n79ClienteFacRsocial ;
   private String[] BC00047_A80ClienteFacCedula ;
   private boolean[] BC00047_n80ClienteFacCedula ;
   private String[] BC00047_A81ClienteFacRut ;
   private boolean[] BC00047_n81ClienteFacRut ;
   private String[] BC00047_A82ClienteFacDireccion ;
   private boolean[] BC00047_n82ClienteFacDireccion ;
   private String[] BC00047_A83ClienteFacLocalidad ;
   private boolean[] BC00047_n83ClienteFacLocalidad ;
   private long[] BC00047_A84ClienteFacDepartamento ;
   private boolean[] BC00047_n84ClienteFacDepartamento ;
   private String[] BC00047_A85ClienteFacCpostal ;
   private boolean[] BC00047_n85ClienteFacCpostal ;
   private long[] BC00047_A86ClienteFacGiro ;
   private boolean[] BC00047_n86ClienteFacGiro ;
   private String[] BC00047_A87ClienteCobNombreTelefono1 ;
   private boolean[] BC00047_n87ClienteCobNombreTelefono1 ;
   private String[] BC00047_A88ClienteFacTelefonos ;
   private boolean[] BC00047_n88ClienteFacTelefonos ;
   private String[] BC00047_A89ClienteCobNombreTelefono2 ;
   private boolean[] BC00047_n89ClienteCobNombreTelefono2 ;
   private String[] BC00047_A90ClienteCobTelefono2 ;
   private boolean[] BC00047_n90ClienteCobTelefono2 ;
   private String[] BC00047_A91ClienteCobNombreCelular1 ;
   private boolean[] BC00047_n91ClienteCobNombreCelular1 ;
   private String[] BC00047_A92ClienteCobCelular1 ;
   private boolean[] BC00047_n92ClienteCobCelular1 ;
   private String[] BC00047_A93ClienteCobNombreCelular2 ;
   private boolean[] BC00047_n93ClienteCobNombreCelular2 ;
   private String[] BC00047_A94ClienteCobCelular2 ;
   private boolean[] BC00047_n94ClienteCobCelular2 ;
   private String[] BC00047_A95ClienteCobNombreEmail1 ;
   private boolean[] BC00047_n95ClienteCobNombreEmail1 ;
   private String[] BC00047_A96ClienteCobEmail1 ;
   private boolean[] BC00047_n96ClienteCobEmail1 ;
   private String[] BC00047_A97ClienteCobNombreEmail2 ;
   private boolean[] BC00047_n97ClienteCobNombreEmail2 ;
   private String[] BC00047_A98ClienteCobEmail2 ;
   private boolean[] BC00047_n98ClienteCobEmail2 ;
   private String[] BC00047_A99ClienteFacFax ;
   private boolean[] BC00047_n99ClienteFacFax ;
   private String[] BC00047_A100ClienteFacEmail ;
   private boolean[] BC00047_n100ClienteFacEmail ;
   private String[] BC00047_A101ClienteFacContrato ;
   private boolean[] BC00047_n101ClienteFacContrato ;
   private String[] BC00047_A102ClienteFacObservaciones ;
   private boolean[] BC00047_n102ClienteFacObservaciones ;
   private long[] BC00047_A103ClienteFacLista ;
   private boolean[] BC00047_n103ClienteFacLista ;
   private short[] BC00047_A104ClienteFacContado ;
   private boolean[] BC00047_n104ClienteFacContado ;
   private String[] BC00047_A105ClienteNotEmailFrascos1 ;
   private boolean[] BC00047_n105ClienteNotEmailFrascos1 ;
   private String[] BC00047_A106ClienteNotEmailFrascos2 ;
   private boolean[] BC00047_n106ClienteNotEmailFrascos2 ;
   private String[] BC00047_A107ClienteNotEmailMuestra1 ;
   private boolean[] BC00047_n107ClienteNotEmailMuestra1 ;
   private String[] BC00047_A108ClienteNotEmailMuestra2 ;
   private boolean[] BC00047_n108ClienteNotEmailMuestra2 ;
   private String[] BC00047_A109ClienteNotEmailAnalisis1 ;
   private boolean[] BC00047_n109ClienteNotEmailAnalisis1 ;
   private String[] BC00047_A110ClienteNotEmailAnalisis2 ;
   private boolean[] BC00047_n110ClienteNotEmailAnalisis2 ;
   private String[] BC00047_A111ClienteNotEmailGeneral1 ;
   private boolean[] BC00047_n111ClienteNotEmailGeneral1 ;
   private String[] BC00047_A112ClienteNotEmailGeneral2 ;
   private boolean[] BC00047_n112ClienteNotEmailGeneral2 ;
   private short[] BC00047_A113ClienteIncobrable ;
   private boolean[] BC00047_n113ClienteIncobrable ;
   private long[] BC000411_A4ClienteId ;
   private String[] BC000411_A45ClienteNombre ;
   private boolean[] BC000411_n45ClienteNombre ;
   private String[] BC000411_A46ClienteEmail ;
   private boolean[] BC000411_n46ClienteEmail ;
   private String[] BC000411_A47ClienteNombreEmail1 ;
   private boolean[] BC000411_n47ClienteNombreEmail1 ;
   private String[] BC000411_A48ClienteEmail1 ;
   private boolean[] BC000411_n48ClienteEmail1 ;
   private String[] BC000411_A49ClienteNombreEmail2 ;
   private boolean[] BC000411_n49ClienteNombreEmail2 ;
   private String[] BC000411_A50ClienteEmail2 ;
   private boolean[] BC000411_n50ClienteEmail2 ;
   private String[] BC000411_A51ClienteEnvio ;
   private boolean[] BC000411_n51ClienteEnvio ;
   private String[] BC000411_A52ClienteUsuarioWeb ;
   private boolean[] BC000411_n52ClienteUsuarioWeb ;
   private String[] BC000411_A53ClienteNombreCelular1 ;
   private boolean[] BC000411_n53ClienteNombreCelular1 ;
   private String[] BC000411_A54ClienteCelular1 ;
   private boolean[] BC000411_n54ClienteCelular1 ;
   private String[] BC000411_A55ClienteNombreCelular2 ;
   private boolean[] BC000411_n55ClienteNombreCelular2 ;
   private String[] BC000411_A56ClienteCelular2 ;
   private boolean[] BC000411_n56ClienteCelular2 ;
   private String[] BC000411_A57ClienteCodigoFigaro ;
   private boolean[] BC000411_n57ClienteCodigoFigaro ;
   private short[] BC000411_A58ClienteTipoUsuario ;
   private boolean[] BC000411_n58ClienteTipoUsuario ;
   private String[] BC000411_A59ClienteDireccion ;
   private boolean[] BC000411_n59ClienteDireccion ;
   private String[] BC000411_A60ClienteNombreTelefono1 ;
   private boolean[] BC000411_n60ClienteNombreTelefono1 ;
   private String[] BC000411_A61ClienteTelefono1 ;
   private boolean[] BC000411_n61ClienteTelefono1 ;
   private String[] BC000411_A62ClienteNombreTelefono2 ;
   private boolean[] BC000411_n62ClienteNombreTelefono2 ;
   private String[] BC000411_A63ClienteTelefono2 ;
   private boolean[] BC000411_n63ClienteTelefono2 ;
   private String[] BC000411_A64ClienteFax ;
   private boolean[] BC000411_n64ClienteFax ;
   private String[] BC000411_A65ClienteDicose ;
   private boolean[] BC000411_n65ClienteDicose ;
   private long[] BC000411_A66ClienteIdDepartamento ;
   private boolean[] BC000411_n66ClienteIdDepartamento ;
   private long[] BC000411_A67ClienteIdLocalidad ;
   private boolean[] BC000411_n67ClienteIdLocalidad ;
   private long[] BC000411_A68ClienteTecnico1 ;
   private boolean[] BC000411_n68ClienteTecnico1 ;
   private long[] BC000411_A69ClienteTecnico2 ;
   private boolean[] BC000411_n69ClienteTecnico2 ;
   private long[] BC000411_A70ClienteIdAgencia ;
   private boolean[] BC000411_n70ClienteIdAgencia ;
   private short[] BC000411_A71ClienteContrato ;
   private boolean[] BC000411_n71ClienteContrato ;
   private short[] BC000411_A72ClienteSocio ;
   private boolean[] BC000411_n72ClienteSocio ;
   private short[] BC000411_A73ClienteNoUsar ;
   private boolean[] BC000411_n73ClienteNoUsar ;
   private short[] BC000411_A74ClienteCodbar ;
   private boolean[] BC000411_n74ClienteCodbar ;
   private short[] BC000411_A75ClienteCaravanas ;
   private boolean[] BC000411_n75ClienteCaravanas ;
   private short[] BC000411_A76ClienteProlesa ;
   private boolean[] BC000411_n76ClienteProlesa ;
   private long[] BC000411_A77ClienteProlesaSuc ;
   private boolean[] BC000411_n77ClienteProlesaSuc ;
   private long[] BC000411_A168ClienteProlesaMat ;
   private String[] BC000411_A78ClienteObservaciones ;
   private boolean[] BC000411_n78ClienteObservaciones ;
   private String[] BC000411_A79ClienteFacRsocial ;
   private boolean[] BC000411_n79ClienteFacRsocial ;
   private String[] BC000411_A80ClienteFacCedula ;
   private boolean[] BC000411_n80ClienteFacCedula ;
   private String[] BC000411_A81ClienteFacRut ;
   private boolean[] BC000411_n81ClienteFacRut ;
   private String[] BC000411_A82ClienteFacDireccion ;
   private boolean[] BC000411_n82ClienteFacDireccion ;
   private String[] BC000411_A83ClienteFacLocalidad ;
   private boolean[] BC000411_n83ClienteFacLocalidad ;
   private long[] BC000411_A84ClienteFacDepartamento ;
   private boolean[] BC000411_n84ClienteFacDepartamento ;
   private String[] BC000411_A85ClienteFacCpostal ;
   private boolean[] BC000411_n85ClienteFacCpostal ;
   private long[] BC000411_A86ClienteFacGiro ;
   private boolean[] BC000411_n86ClienteFacGiro ;
   private String[] BC000411_A87ClienteCobNombreTelefono1 ;
   private boolean[] BC000411_n87ClienteCobNombreTelefono1 ;
   private String[] BC000411_A88ClienteFacTelefonos ;
   private boolean[] BC000411_n88ClienteFacTelefonos ;
   private String[] BC000411_A89ClienteCobNombreTelefono2 ;
   private boolean[] BC000411_n89ClienteCobNombreTelefono2 ;
   private String[] BC000411_A90ClienteCobTelefono2 ;
   private boolean[] BC000411_n90ClienteCobTelefono2 ;
   private String[] BC000411_A91ClienteCobNombreCelular1 ;
   private boolean[] BC000411_n91ClienteCobNombreCelular1 ;
   private String[] BC000411_A92ClienteCobCelular1 ;
   private boolean[] BC000411_n92ClienteCobCelular1 ;
   private String[] BC000411_A93ClienteCobNombreCelular2 ;
   private boolean[] BC000411_n93ClienteCobNombreCelular2 ;
   private String[] BC000411_A94ClienteCobCelular2 ;
   private boolean[] BC000411_n94ClienteCobCelular2 ;
   private String[] BC000411_A95ClienteCobNombreEmail1 ;
   private boolean[] BC000411_n95ClienteCobNombreEmail1 ;
   private String[] BC000411_A96ClienteCobEmail1 ;
   private boolean[] BC000411_n96ClienteCobEmail1 ;
   private String[] BC000411_A97ClienteCobNombreEmail2 ;
   private boolean[] BC000411_n97ClienteCobNombreEmail2 ;
   private String[] BC000411_A98ClienteCobEmail2 ;
   private boolean[] BC000411_n98ClienteCobEmail2 ;
   private String[] BC000411_A99ClienteFacFax ;
   private boolean[] BC000411_n99ClienteFacFax ;
   private String[] BC000411_A100ClienteFacEmail ;
   private boolean[] BC000411_n100ClienteFacEmail ;
   private String[] BC000411_A101ClienteFacContrato ;
   private boolean[] BC000411_n101ClienteFacContrato ;
   private String[] BC000411_A102ClienteFacObservaciones ;
   private boolean[] BC000411_n102ClienteFacObservaciones ;
   private long[] BC000411_A103ClienteFacLista ;
   private boolean[] BC000411_n103ClienteFacLista ;
   private short[] BC000411_A104ClienteFacContado ;
   private boolean[] BC000411_n104ClienteFacContado ;
   private String[] BC000411_A105ClienteNotEmailFrascos1 ;
   private boolean[] BC000411_n105ClienteNotEmailFrascos1 ;
   private String[] BC000411_A106ClienteNotEmailFrascos2 ;
   private boolean[] BC000411_n106ClienteNotEmailFrascos2 ;
   private String[] BC000411_A107ClienteNotEmailMuestra1 ;
   private boolean[] BC000411_n107ClienteNotEmailMuestra1 ;
   private String[] BC000411_A108ClienteNotEmailMuestra2 ;
   private boolean[] BC000411_n108ClienteNotEmailMuestra2 ;
   private String[] BC000411_A109ClienteNotEmailAnalisis1 ;
   private boolean[] BC000411_n109ClienteNotEmailAnalisis1 ;
   private String[] BC000411_A110ClienteNotEmailAnalisis2 ;
   private boolean[] BC000411_n110ClienteNotEmailAnalisis2 ;
   private String[] BC000411_A111ClienteNotEmailGeneral1 ;
   private boolean[] BC000411_n111ClienteNotEmailGeneral1 ;
   private String[] BC000411_A112ClienteNotEmailGeneral2 ;
   private boolean[] BC000411_n112ClienteNotEmailGeneral2 ;
   private short[] BC000411_A113ClienteIncobrable ;
   private boolean[] BC000411_n113ClienteIncobrable ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00042_A4ClienteId ;
   private String[] BC00042_A45ClienteNombre ;
   private String[] BC00042_A46ClienteEmail ;
   private String[] BC00042_A47ClienteNombreEmail1 ;
   private String[] BC00042_A48ClienteEmail1 ;
   private String[] BC00042_A49ClienteNombreEmail2 ;
   private String[] BC00042_A50ClienteEmail2 ;
   private String[] BC00042_A51ClienteEnvio ;
   private String[] BC00042_A52ClienteUsuarioWeb ;
   private String[] BC00042_A53ClienteNombreCelular1 ;
   private String[] BC00042_A54ClienteCelular1 ;
   private String[] BC00042_A55ClienteNombreCelular2 ;
   private String[] BC00042_A56ClienteCelular2 ;
   private String[] BC00042_A57ClienteCodigoFigaro ;
   private short[] BC00042_A58ClienteTipoUsuario ;
   private String[] BC00042_A59ClienteDireccion ;
   private String[] BC00042_A60ClienteNombreTelefono1 ;
   private String[] BC00042_A61ClienteTelefono1 ;
   private String[] BC00042_A62ClienteNombreTelefono2 ;
   private String[] BC00042_A63ClienteTelefono2 ;
   private String[] BC00042_A64ClienteFax ;
   private String[] BC00042_A65ClienteDicose ;
   private long[] BC00042_A66ClienteIdDepartamento ;
   private long[] BC00042_A67ClienteIdLocalidad ;
   private long[] BC00042_A68ClienteTecnico1 ;
   private long[] BC00042_A69ClienteTecnico2 ;
   private long[] BC00042_A70ClienteIdAgencia ;
   private short[] BC00042_A71ClienteContrato ;
   private short[] BC00042_A72ClienteSocio ;
   private short[] BC00042_A73ClienteNoUsar ;
   private short[] BC00042_A74ClienteCodbar ;
   private short[] BC00042_A75ClienteCaravanas ;
   private short[] BC00042_A76ClienteProlesa ;
   private long[] BC00042_A77ClienteProlesaSuc ;
   private long[] BC00042_A168ClienteProlesaMat ;
   private String[] BC00042_A78ClienteObservaciones ;
   private String[] BC00042_A79ClienteFacRsocial ;
   private String[] BC00042_A80ClienteFacCedula ;
   private String[] BC00042_A81ClienteFacRut ;
   private String[] BC00042_A82ClienteFacDireccion ;
   private String[] BC00042_A83ClienteFacLocalidad ;
   private long[] BC00042_A84ClienteFacDepartamento ;
   private String[] BC00042_A85ClienteFacCpostal ;
   private long[] BC00042_A86ClienteFacGiro ;
   private String[] BC00042_A87ClienteCobNombreTelefono1 ;
   private String[] BC00042_A88ClienteFacTelefonos ;
   private String[] BC00042_A89ClienteCobNombreTelefono2 ;
   private String[] BC00042_A90ClienteCobTelefono2 ;
   private String[] BC00042_A91ClienteCobNombreCelular1 ;
   private String[] BC00042_A92ClienteCobCelular1 ;
   private String[] BC00042_A93ClienteCobNombreCelular2 ;
   private String[] BC00042_A94ClienteCobCelular2 ;
   private String[] BC00042_A95ClienteCobNombreEmail1 ;
   private String[] BC00042_A96ClienteCobEmail1 ;
   private String[] BC00042_A97ClienteCobNombreEmail2 ;
   private String[] BC00042_A98ClienteCobEmail2 ;
   private String[] BC00042_A99ClienteFacFax ;
   private String[] BC00042_A100ClienteFacEmail ;
   private String[] BC00042_A101ClienteFacContrato ;
   private String[] BC00042_A102ClienteFacObservaciones ;
   private long[] BC00042_A103ClienteFacLista ;
   private short[] BC00042_A104ClienteFacContado ;
   private String[] BC00042_A105ClienteNotEmailFrascos1 ;
   private String[] BC00042_A106ClienteNotEmailFrascos2 ;
   private String[] BC00042_A107ClienteNotEmailMuestra1 ;
   private String[] BC00042_A108ClienteNotEmailMuestra2 ;
   private String[] BC00042_A109ClienteNotEmailAnalisis1 ;
   private String[] BC00042_A110ClienteNotEmailAnalisis2 ;
   private String[] BC00042_A111ClienteNotEmailGeneral1 ;
   private String[] BC00042_A112ClienteNotEmailGeneral2 ;
   private short[] BC00042_A113ClienteIncobrable ;
   private long[] BC00043_A4ClienteId ;
   private String[] BC00043_A45ClienteNombre ;
   private String[] BC00043_A46ClienteEmail ;
   private String[] BC00043_A47ClienteNombreEmail1 ;
   private String[] BC00043_A48ClienteEmail1 ;
   private String[] BC00043_A49ClienteNombreEmail2 ;
   private String[] BC00043_A50ClienteEmail2 ;
   private String[] BC00043_A51ClienteEnvio ;
   private String[] BC00043_A52ClienteUsuarioWeb ;
   private String[] BC00043_A53ClienteNombreCelular1 ;
   private String[] BC00043_A54ClienteCelular1 ;
   private String[] BC00043_A55ClienteNombreCelular2 ;
   private String[] BC00043_A56ClienteCelular2 ;
   private String[] BC00043_A57ClienteCodigoFigaro ;
   private short[] BC00043_A58ClienteTipoUsuario ;
   private String[] BC00043_A59ClienteDireccion ;
   private String[] BC00043_A60ClienteNombreTelefono1 ;
   private String[] BC00043_A61ClienteTelefono1 ;
   private String[] BC00043_A62ClienteNombreTelefono2 ;
   private String[] BC00043_A63ClienteTelefono2 ;
   private String[] BC00043_A64ClienteFax ;
   private String[] BC00043_A65ClienteDicose ;
   private long[] BC00043_A66ClienteIdDepartamento ;
   private long[] BC00043_A67ClienteIdLocalidad ;
   private long[] BC00043_A68ClienteTecnico1 ;
   private long[] BC00043_A69ClienteTecnico2 ;
   private long[] BC00043_A70ClienteIdAgencia ;
   private short[] BC00043_A71ClienteContrato ;
   private short[] BC00043_A72ClienteSocio ;
   private short[] BC00043_A73ClienteNoUsar ;
   private short[] BC00043_A74ClienteCodbar ;
   private short[] BC00043_A75ClienteCaravanas ;
   private short[] BC00043_A76ClienteProlesa ;
   private long[] BC00043_A77ClienteProlesaSuc ;
   private long[] BC00043_A168ClienteProlesaMat ;
   private String[] BC00043_A78ClienteObservaciones ;
   private String[] BC00043_A79ClienteFacRsocial ;
   private String[] BC00043_A80ClienteFacCedula ;
   private String[] BC00043_A81ClienteFacRut ;
   private String[] BC00043_A82ClienteFacDireccion ;
   private String[] BC00043_A83ClienteFacLocalidad ;
   private long[] BC00043_A84ClienteFacDepartamento ;
   private String[] BC00043_A85ClienteFacCpostal ;
   private long[] BC00043_A86ClienteFacGiro ;
   private String[] BC00043_A87ClienteCobNombreTelefono1 ;
   private String[] BC00043_A88ClienteFacTelefonos ;
   private String[] BC00043_A89ClienteCobNombreTelefono2 ;
   private String[] BC00043_A90ClienteCobTelefono2 ;
   private String[] BC00043_A91ClienteCobNombreCelular1 ;
   private String[] BC00043_A92ClienteCobCelular1 ;
   private String[] BC00043_A93ClienteCobNombreCelular2 ;
   private String[] BC00043_A94ClienteCobCelular2 ;
   private String[] BC00043_A95ClienteCobNombreEmail1 ;
   private String[] BC00043_A96ClienteCobEmail1 ;
   private String[] BC00043_A97ClienteCobNombreEmail2 ;
   private String[] BC00043_A98ClienteCobEmail2 ;
   private String[] BC00043_A99ClienteFacFax ;
   private String[] BC00043_A100ClienteFacEmail ;
   private String[] BC00043_A101ClienteFacContrato ;
   private String[] BC00043_A102ClienteFacObservaciones ;
   private long[] BC00043_A103ClienteFacLista ;
   private short[] BC00043_A104ClienteFacContado ;
   private String[] BC00043_A105ClienteNotEmailFrascos1 ;
   private String[] BC00043_A106ClienteNotEmailFrascos2 ;
   private String[] BC00043_A107ClienteNotEmailMuestra1 ;
   private String[] BC00043_A108ClienteNotEmailMuestra2 ;
   private String[] BC00043_A109ClienteNotEmailAnalisis1 ;
   private String[] BC00043_A110ClienteNotEmailAnalisis2 ;
   private String[] BC00043_A111ClienteNotEmailGeneral1 ;
   private String[] BC00043_A112ClienteNotEmailGeneral2 ;
   private short[] BC00043_A113ClienteIncobrable ;
   private boolean[] BC00042_n45ClienteNombre ;
   private boolean[] BC00042_n46ClienteEmail ;
   private boolean[] BC00042_n47ClienteNombreEmail1 ;
   private boolean[] BC00042_n48ClienteEmail1 ;
   private boolean[] BC00042_n49ClienteNombreEmail2 ;
   private boolean[] BC00042_n50ClienteEmail2 ;
   private boolean[] BC00042_n51ClienteEnvio ;
   private boolean[] BC00042_n52ClienteUsuarioWeb ;
   private boolean[] BC00042_n53ClienteNombreCelular1 ;
   private boolean[] BC00042_n54ClienteCelular1 ;
   private boolean[] BC00042_n55ClienteNombreCelular2 ;
   private boolean[] BC00042_n56ClienteCelular2 ;
   private boolean[] BC00042_n57ClienteCodigoFigaro ;
   private boolean[] BC00042_n58ClienteTipoUsuario ;
   private boolean[] BC00042_n59ClienteDireccion ;
   private boolean[] BC00042_n60ClienteNombreTelefono1 ;
   private boolean[] BC00042_n61ClienteTelefono1 ;
   private boolean[] BC00042_n62ClienteNombreTelefono2 ;
   private boolean[] BC00042_n63ClienteTelefono2 ;
   private boolean[] BC00042_n64ClienteFax ;
   private boolean[] BC00042_n65ClienteDicose ;
   private boolean[] BC00042_n66ClienteIdDepartamento ;
   private boolean[] BC00042_n67ClienteIdLocalidad ;
   private boolean[] BC00042_n68ClienteTecnico1 ;
   private boolean[] BC00042_n69ClienteTecnico2 ;
   private boolean[] BC00042_n70ClienteIdAgencia ;
   private boolean[] BC00042_n71ClienteContrato ;
   private boolean[] BC00042_n72ClienteSocio ;
   private boolean[] BC00042_n73ClienteNoUsar ;
   private boolean[] BC00042_n74ClienteCodbar ;
   private boolean[] BC00042_n75ClienteCaravanas ;
   private boolean[] BC00042_n76ClienteProlesa ;
   private boolean[] BC00042_n77ClienteProlesaSuc ;
   private boolean[] BC00042_n78ClienteObservaciones ;
   private boolean[] BC00042_n79ClienteFacRsocial ;
   private boolean[] BC00042_n80ClienteFacCedula ;
   private boolean[] BC00042_n81ClienteFacRut ;
   private boolean[] BC00042_n82ClienteFacDireccion ;
   private boolean[] BC00042_n83ClienteFacLocalidad ;
   private boolean[] BC00042_n84ClienteFacDepartamento ;
   private boolean[] BC00042_n85ClienteFacCpostal ;
   private boolean[] BC00042_n86ClienteFacGiro ;
   private boolean[] BC00042_n87ClienteCobNombreTelefono1 ;
   private boolean[] BC00042_n88ClienteFacTelefonos ;
   private boolean[] BC00042_n89ClienteCobNombreTelefono2 ;
   private boolean[] BC00042_n90ClienteCobTelefono2 ;
   private boolean[] BC00042_n91ClienteCobNombreCelular1 ;
   private boolean[] BC00042_n92ClienteCobCelular1 ;
   private boolean[] BC00042_n93ClienteCobNombreCelular2 ;
   private boolean[] BC00042_n94ClienteCobCelular2 ;
   private boolean[] BC00042_n95ClienteCobNombreEmail1 ;
   private boolean[] BC00042_n96ClienteCobEmail1 ;
   private boolean[] BC00042_n97ClienteCobNombreEmail2 ;
   private boolean[] BC00042_n98ClienteCobEmail2 ;
   private boolean[] BC00042_n99ClienteFacFax ;
   private boolean[] BC00042_n100ClienteFacEmail ;
   private boolean[] BC00042_n101ClienteFacContrato ;
   private boolean[] BC00042_n102ClienteFacObservaciones ;
   private boolean[] BC00042_n103ClienteFacLista ;
   private boolean[] BC00042_n104ClienteFacContado ;
   private boolean[] BC00042_n105ClienteNotEmailFrascos1 ;
   private boolean[] BC00042_n106ClienteNotEmailFrascos2 ;
   private boolean[] BC00042_n107ClienteNotEmailMuestra1 ;
   private boolean[] BC00042_n108ClienteNotEmailMuestra2 ;
   private boolean[] BC00042_n109ClienteNotEmailAnalisis1 ;
   private boolean[] BC00042_n110ClienteNotEmailAnalisis2 ;
   private boolean[] BC00042_n111ClienteNotEmailGeneral1 ;
   private boolean[] BC00042_n112ClienteNotEmailGeneral2 ;
   private boolean[] BC00042_n113ClienteIncobrable ;
   private boolean[] BC00043_n45ClienteNombre ;
   private boolean[] BC00043_n46ClienteEmail ;
   private boolean[] BC00043_n47ClienteNombreEmail1 ;
   private boolean[] BC00043_n48ClienteEmail1 ;
   private boolean[] BC00043_n49ClienteNombreEmail2 ;
   private boolean[] BC00043_n50ClienteEmail2 ;
   private boolean[] BC00043_n51ClienteEnvio ;
   private boolean[] BC00043_n52ClienteUsuarioWeb ;
   private boolean[] BC00043_n53ClienteNombreCelular1 ;
   private boolean[] BC00043_n54ClienteCelular1 ;
   private boolean[] BC00043_n55ClienteNombreCelular2 ;
   private boolean[] BC00043_n56ClienteCelular2 ;
   private boolean[] BC00043_n57ClienteCodigoFigaro ;
   private boolean[] BC00043_n58ClienteTipoUsuario ;
   private boolean[] BC00043_n59ClienteDireccion ;
   private boolean[] BC00043_n60ClienteNombreTelefono1 ;
   private boolean[] BC00043_n61ClienteTelefono1 ;
   private boolean[] BC00043_n62ClienteNombreTelefono2 ;
   private boolean[] BC00043_n63ClienteTelefono2 ;
   private boolean[] BC00043_n64ClienteFax ;
   private boolean[] BC00043_n65ClienteDicose ;
   private boolean[] BC00043_n66ClienteIdDepartamento ;
   private boolean[] BC00043_n67ClienteIdLocalidad ;
   private boolean[] BC00043_n68ClienteTecnico1 ;
   private boolean[] BC00043_n69ClienteTecnico2 ;
   private boolean[] BC00043_n70ClienteIdAgencia ;
   private boolean[] BC00043_n71ClienteContrato ;
   private boolean[] BC00043_n72ClienteSocio ;
   private boolean[] BC00043_n73ClienteNoUsar ;
   private boolean[] BC00043_n74ClienteCodbar ;
   private boolean[] BC00043_n75ClienteCaravanas ;
   private boolean[] BC00043_n76ClienteProlesa ;
   private boolean[] BC00043_n77ClienteProlesaSuc ;
   private boolean[] BC00043_n78ClienteObservaciones ;
   private boolean[] BC00043_n79ClienteFacRsocial ;
   private boolean[] BC00043_n80ClienteFacCedula ;
   private boolean[] BC00043_n81ClienteFacRut ;
   private boolean[] BC00043_n82ClienteFacDireccion ;
   private boolean[] BC00043_n83ClienteFacLocalidad ;
   private boolean[] BC00043_n84ClienteFacDepartamento ;
   private boolean[] BC00043_n85ClienteFacCpostal ;
   private boolean[] BC00043_n86ClienteFacGiro ;
   private boolean[] BC00043_n87ClienteCobNombreTelefono1 ;
   private boolean[] BC00043_n88ClienteFacTelefonos ;
   private boolean[] BC00043_n89ClienteCobNombreTelefono2 ;
   private boolean[] BC00043_n90ClienteCobTelefono2 ;
   private boolean[] BC00043_n91ClienteCobNombreCelular1 ;
   private boolean[] BC00043_n92ClienteCobCelular1 ;
   private boolean[] BC00043_n93ClienteCobNombreCelular2 ;
   private boolean[] BC00043_n94ClienteCobCelular2 ;
   private boolean[] BC00043_n95ClienteCobNombreEmail1 ;
   private boolean[] BC00043_n96ClienteCobEmail1 ;
   private boolean[] BC00043_n97ClienteCobNombreEmail2 ;
   private boolean[] BC00043_n98ClienteCobEmail2 ;
   private boolean[] BC00043_n99ClienteFacFax ;
   private boolean[] BC00043_n100ClienteFacEmail ;
   private boolean[] BC00043_n101ClienteFacContrato ;
   private boolean[] BC00043_n102ClienteFacObservaciones ;
   private boolean[] BC00043_n103ClienteFacLista ;
   private boolean[] BC00043_n104ClienteFacContado ;
   private boolean[] BC00043_n105ClienteNotEmailFrascos1 ;
   private boolean[] BC00043_n106ClienteNotEmailFrascos2 ;
   private boolean[] BC00043_n107ClienteNotEmailMuestra1 ;
   private boolean[] BC00043_n108ClienteNotEmailMuestra2 ;
   private boolean[] BC00043_n109ClienteNotEmailAnalisis1 ;
   private boolean[] BC00043_n110ClienteNotEmailAnalisis2 ;
   private boolean[] BC00043_n111ClienteNotEmailGeneral1 ;
   private boolean[] BC00043_n112ClienteNotEmailGeneral2 ;
   private boolean[] BC00043_n113ClienteIncobrable ;
}

final  class cliente_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class cliente_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00042", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00043", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00044", "SELECT TM1.`ClienteId`, TM1.`ClienteNombre`, TM1.`ClienteEmail`, TM1.`ClienteNombreEmail1`, TM1.`ClienteEmail1`, TM1.`ClienteNombreEmail2`, TM1.`ClienteEmail2`, TM1.`ClienteEnvio`, TM1.`ClienteUsuarioWeb`, TM1.`ClienteNombreCelular1`, TM1.`ClienteCelular1`, TM1.`ClienteNombreCelular2`, TM1.`ClienteCelular2`, TM1.`ClienteCodigoFigaro`, TM1.`ClienteTipoUsuario`, TM1.`ClienteDireccion`, TM1.`ClienteNombreTelefono1`, TM1.`ClienteTelefono1`, TM1.`ClienteNombreTelefono2`, TM1.`ClienteTelefono2`, TM1.`ClienteFax`, TM1.`ClienteDicose`, TM1.`ClienteIdDepartamento`, TM1.`ClienteIdLocalidad`, TM1.`ClienteTecnico1`, TM1.`ClienteTecnico2`, TM1.`ClienteIdAgencia`, TM1.`ClienteContrato`, TM1.`ClienteSocio`, TM1.`ClienteNoUsar`, TM1.`ClienteCodbar`, TM1.`ClienteCaravanas`, TM1.`ClienteProlesa`, TM1.`ClienteProlesaSuc`, TM1.`ClienteProlesaMat`, TM1.`ClienteObservaciones`, TM1.`ClienteFacRsocial`, TM1.`ClienteFacCedula`, TM1.`ClienteFacRut`, TM1.`ClienteFacDireccion`, TM1.`ClienteFacLocalidad`, TM1.`ClienteFacDepartamento`, TM1.`ClienteFacCpostal`, TM1.`ClienteFacGiro`, TM1.`ClienteCobNombreTelefono1`, TM1.`ClienteFacTelefonos`, TM1.`ClienteCobNombreTelefono2`, TM1.`ClienteCobTelefono2`, TM1.`ClienteCobNombreCelular1`, TM1.`ClienteCobCelular1`, TM1.`ClienteCobNombreCelular2`, TM1.`ClienteCobCelular2`, TM1.`ClienteCobNombreEmail1`, TM1.`ClienteCobEmail1`, TM1.`ClienteCobNombreEmail2`, TM1.`ClienteCobEmail2`, TM1.`ClienteFacFax`, TM1.`ClienteFacEmail`, TM1.`ClienteFacContrato`, TM1.`ClienteFacObservaciones`, TM1.`ClienteFacLista`, TM1.`ClienteFacContado`, TM1.`ClienteNotEmailFrascos1`, TM1.`ClienteNotEmailFrascos2`, TM1.`ClienteNotEmailMuestra1`, TM1.`ClienteNotEmailMuestra2`, TM1.`ClienteNotEmailAnalisis1`, TM1.`ClienteNotEmailAnalisis2`, TM1.`ClienteNotEmailGeneral1`, TM1.`ClienteNotEmailGeneral2`, TM1.`ClienteIncobrable` FROM `Cliente` TM1 WHERE TM1.`ClienteId` = ? ORDER BY TM1.`ClienteId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00045", "SELECT `ClienteId` FROM `Cliente` WHERE `ClienteId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00046", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00047", "SELECT `ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable` FROM `Cliente` WHERE `ClienteId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00048", "INSERT INTO `Cliente`(`ClienteId`, `ClienteNombre`, `ClienteEmail`, `ClienteNombreEmail1`, `ClienteEmail1`, `ClienteNombreEmail2`, `ClienteEmail2`, `ClienteEnvio`, `ClienteUsuarioWeb`, `ClienteNombreCelular1`, `ClienteCelular1`, `ClienteNombreCelular2`, `ClienteCelular2`, `ClienteCodigoFigaro`, `ClienteTipoUsuario`, `ClienteDireccion`, `ClienteNombreTelefono1`, `ClienteTelefono1`, `ClienteNombreTelefono2`, `ClienteTelefono2`, `ClienteFax`, `ClienteDicose`, `ClienteIdDepartamento`, `ClienteIdLocalidad`, `ClienteTecnico1`, `ClienteTecnico2`, `ClienteIdAgencia`, `ClienteContrato`, `ClienteSocio`, `ClienteNoUsar`, `ClienteCodbar`, `ClienteCaravanas`, `ClienteProlesa`, `ClienteProlesaSuc`, `ClienteProlesaMat`, `ClienteObservaciones`, `ClienteFacRsocial`, `ClienteFacCedula`, `ClienteFacRut`, `ClienteFacDireccion`, `ClienteFacLocalidad`, `ClienteFacDepartamento`, `ClienteFacCpostal`, `ClienteFacGiro`, `ClienteCobNombreTelefono1`, `ClienteFacTelefonos`, `ClienteCobNombreTelefono2`, `ClienteCobTelefono2`, `ClienteCobNombreCelular1`, `ClienteCobCelular1`, `ClienteCobNombreCelular2`, `ClienteCobCelular2`, `ClienteCobNombreEmail1`, `ClienteCobEmail1`, `ClienteCobNombreEmail2`, `ClienteCobEmail2`, `ClienteFacFax`, `ClienteFacEmail`, `ClienteFacContrato`, `ClienteFacObservaciones`, `ClienteFacLista`, `ClienteFacContado`, `ClienteNotEmailFrascos1`, `ClienteNotEmailFrascos2`, `ClienteNotEmailMuestra1`, `ClienteNotEmailMuestra2`, `ClienteNotEmailAnalisis1`, `ClienteNotEmailAnalisis2`, `ClienteNotEmailGeneral1`, `ClienteNotEmailGeneral2`, `ClienteIncobrable`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00049", "UPDATE `Cliente` SET `ClienteNombre`=?, `ClienteEmail`=?, `ClienteNombreEmail1`=?, `ClienteEmail1`=?, `ClienteNombreEmail2`=?, `ClienteEmail2`=?, `ClienteEnvio`=?, `ClienteUsuarioWeb`=?, `ClienteNombreCelular1`=?, `ClienteCelular1`=?, `ClienteNombreCelular2`=?, `ClienteCelular2`=?, `ClienteCodigoFigaro`=?, `ClienteTipoUsuario`=?, `ClienteDireccion`=?, `ClienteNombreTelefono1`=?, `ClienteTelefono1`=?, `ClienteNombreTelefono2`=?, `ClienteTelefono2`=?, `ClienteFax`=?, `ClienteDicose`=?, `ClienteIdDepartamento`=?, `ClienteIdLocalidad`=?, `ClienteTecnico1`=?, `ClienteTecnico2`=?, `ClienteIdAgencia`=?, `ClienteContrato`=?, `ClienteSocio`=?, `ClienteNoUsar`=?, `ClienteCodbar`=?, `ClienteCaravanas`=?, `ClienteProlesa`=?, `ClienteProlesaSuc`=?, `ClienteProlesaMat`=?, `ClienteObservaciones`=?, `ClienteFacRsocial`=?, `ClienteFacCedula`=?, `ClienteFacRut`=?, `ClienteFacDireccion`=?, `ClienteFacLocalidad`=?, `ClienteFacDepartamento`=?, `ClienteFacCpostal`=?, `ClienteFacGiro`=?, `ClienteCobNombreTelefono1`=?, `ClienteFacTelefonos`=?, `ClienteCobNombreTelefono2`=?, `ClienteCobTelefono2`=?, `ClienteCobNombreCelular1`=?, `ClienteCobCelular1`=?, `ClienteCobNombreCelular2`=?, `ClienteCobCelular2`=?, `ClienteCobNombreEmail1`=?, `ClienteCobEmail1`=?, `ClienteCobNombreEmail2`=?, `ClienteCobEmail2`=?, `ClienteFacFax`=?, `ClienteFacEmail`=?, `ClienteFacContrato`=?, `ClienteFacObservaciones`=?, `ClienteFacLista`=?, `ClienteFacContado`=?, `ClienteNotEmailFrascos1`=?, `ClienteNotEmailFrascos2`=?, `ClienteNotEmailMuestra1`=?, `ClienteNotEmailMuestra2`=?, `ClienteNotEmailAnalisis1`=?, `ClienteNotEmailAnalisis2`=?, `ClienteNotEmailGeneral1`=?, `ClienteNotEmailGeneral2`=?, `ClienteIncobrable`=?  WHERE `ClienteId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000410", "DELETE FROM `Cliente`  WHERE `ClienteId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000411", "SELECT TM1.`ClienteId`, TM1.`ClienteNombre`, TM1.`ClienteEmail`, TM1.`ClienteNombreEmail1`, TM1.`ClienteEmail1`, TM1.`ClienteNombreEmail2`, TM1.`ClienteEmail2`, TM1.`ClienteEnvio`, TM1.`ClienteUsuarioWeb`, TM1.`ClienteNombreCelular1`, TM1.`ClienteCelular1`, TM1.`ClienteNombreCelular2`, TM1.`ClienteCelular2`, TM1.`ClienteCodigoFigaro`, TM1.`ClienteTipoUsuario`, TM1.`ClienteDireccion`, TM1.`ClienteNombreTelefono1`, TM1.`ClienteTelefono1`, TM1.`ClienteNombreTelefono2`, TM1.`ClienteTelefono2`, TM1.`ClienteFax`, TM1.`ClienteDicose`, TM1.`ClienteIdDepartamento`, TM1.`ClienteIdLocalidad`, TM1.`ClienteTecnico1`, TM1.`ClienteTecnico2`, TM1.`ClienteIdAgencia`, TM1.`ClienteContrato`, TM1.`ClienteSocio`, TM1.`ClienteNoUsar`, TM1.`ClienteCodbar`, TM1.`ClienteCaravanas`, TM1.`ClienteProlesa`, TM1.`ClienteProlesaSuc`, TM1.`ClienteProlesaMat`, TM1.`ClienteObservaciones`, TM1.`ClienteFacRsocial`, TM1.`ClienteFacCedula`, TM1.`ClienteFacRut`, TM1.`ClienteFacDireccion`, TM1.`ClienteFacLocalidad`, TM1.`ClienteFacDepartamento`, TM1.`ClienteFacCpostal`, TM1.`ClienteFacGiro`, TM1.`ClienteCobNombreTelefono1`, TM1.`ClienteFacTelefonos`, TM1.`ClienteCobNombreTelefono2`, TM1.`ClienteCobTelefono2`, TM1.`ClienteCobNombreCelular1`, TM1.`ClienteCobCelular1`, TM1.`ClienteCobNombreCelular2`, TM1.`ClienteCobCelular2`, TM1.`ClienteCobNombreEmail1`, TM1.`ClienteCobEmail1`, TM1.`ClienteCobNombreEmail2`, TM1.`ClienteCobEmail2`, TM1.`ClienteFacFax`, TM1.`ClienteFacEmail`, TM1.`ClienteFacContrato`, TM1.`ClienteFacObservaciones`, TM1.`ClienteFacLista`, TM1.`ClienteFacContado`, TM1.`ClienteNotEmailFrascos1`, TM1.`ClienteNotEmailFrascos2`, TM1.`ClienteNotEmailMuestra1`, TM1.`ClienteNotEmailMuestra2`, TM1.`ClienteNotEmailAnalisis1`, TM1.`ClienteNotEmailAnalisis2`, TM1.`ClienteNotEmailGeneral1`, TM1.`ClienteNotEmailGeneral2`, TM1.`ClienteIncobrable` FROM `Cliente` TM1 WHERE TM1.`ClienteId` = ? ORDER BY TM1.`ClienteId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               return;
            case 9 :
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
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
               ((long[]) buf[43])[0] = rslt.getLong(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35);
               ((String[]) buf[68])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((long[]) buf[84])[0] = rslt.getLong(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(56);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((long[]) buf[118])[0] = rslt.getLong(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getVarchar(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getVarchar(66);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(67);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(71);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setVarchar(5, (String)parms[8], 100);
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 200);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 100);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 100);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 100);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 100);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
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
                  stmt.setVarchar(16, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 100);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 100);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 100);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 100);
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
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[44]).longValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[46]).longValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[48]).longValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[50]).longValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(27, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(34, ((Number) parms[66]).longValue());
               }
               stmt.setLong(35, ((Number) parms[67]).longValue());
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[69], 200);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[71], 100);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[73], 40);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[75], 40);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[77], 200);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[79], 40);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(42, ((Number) parms[81]).longValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[83], 40);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(44, ((Number) parms[85]).longValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[87], 100);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[89], 100);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[91], 100);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[93], 100);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[95], 100);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[97], 100);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[99], 100);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[101], 100);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(53, (String)parms[103], 100);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[105], 100);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[107], 100);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[109], 100);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[111], 100);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[113], 100);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[115], 80);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[117], 200);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(61, ((Number) parms[119]).longValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(63, (String)parms[123], 100);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[125], 100);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[127], 100);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[129], 100);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(67, (String)parms[131], 100);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(68, (String)parms[133], 100);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[135], 100);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(70, (String)parms[137], 100);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[139]).shortValue());
               }
               return;
            case 7 :
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
                  stmt.setVarchar(4, (String)parms[7], 100);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 100);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 100);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 100);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 100);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
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
                  stmt.setVarchar(15, (String)parms[29], 200);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 100);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 100);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 100);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
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
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[43]).longValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[45]).longValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[47]).longValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[49]).longValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[51]).longValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(33, ((Number) parms[65]).longValue());
               }
               stmt.setLong(34, ((Number) parms[66]).longValue());
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[68], 200);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 100);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[72], 40);
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
                  stmt.setVarchar(39, (String)parms[76], 200);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[78], 40);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(41, ((Number) parms[80]).longValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[82], 40);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(43, ((Number) parms[84]).longValue());
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
                  stmt.setVarchar(53, (String)parms[104], 100);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[106], 100);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[108], 100);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[110], 100);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[112], 100);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[114], 80);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[116], 200);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(60, ((Number) parms[118]).longValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[120]).shortValue());
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(62, (String)parms[122], 100);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(63, (String)parms[124], 100);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[126], 100);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[128], 100);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[130], 100);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(67, (String)parms[132], 100);
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(68, (String)parms[134], 100);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[136], 100);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[138]).shortValue());
               }
               stmt.setLong(71, ((Number) parms[139]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

