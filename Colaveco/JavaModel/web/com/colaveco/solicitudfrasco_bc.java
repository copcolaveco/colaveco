package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class solicitudfrasco_bc extends GXWebPanel implements IGxSilentTrn
{
   public solicitudfrasco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public solicitudfrasco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( solicitudfrasco_bc.class ));
   }

   public solicitudfrasco_bc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public GXBCCollection<com.colaveco.SdtSolicitudFrasco> GetAll( int Start ,
                                                                  int Count )
   {
      GXPagingFrom3 = Start ;
      GXPagingTo3 = ((Count>0) ? Count : 100000000) ;
      /* Using cursor BC00034 */
      pr_default.execute(2, new Object[] {Integer.valueOf(GXPagingFrom3), Integer.valueOf(GXPagingTo3)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3SFId = BC00034_A3SFId[0] ;
         A32SFIdNet = BC00034_A32SFIdNet[0] ;
         n32SFIdNet = BC00034_n32SFIdNet[0] ;
         A33SFNombre = BC00034_A33SFNombre[0] ;
         n33SFNombre = BC00034_n33SFNombre[0] ;
         A34SFDireccion = BC00034_A34SFDireccion[0] ;
         n34SFDireccion = BC00034_n34SFDireccion[0] ;
         A35SFAgencia = BC00034_A35SFAgencia[0] ;
         n35SFAgencia = BC00034_n35SFAgencia[0] ;
         A36SFTelefono = BC00034_A36SFTelefono[0] ;
         n36SFTelefono = BC00034_n36SFTelefono[0] ;
         A37SFEmail = BC00034_A37SFEmail[0] ;
         n37SFEmail = BC00034_n37SFEmail[0] ;
         A38SFFrascosConC = BC00034_A38SFFrascosConC[0] ;
         n38SFFrascosConC = BC00034_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = BC00034_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = BC00034_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = BC00034_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = BC00034_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = BC00034_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = BC00034_n40SFFrascosSangre[0] ;
         A41SFObservaciones = BC00034_A41SFObservaciones[0] ;
         n41SFObservaciones = BC00034_n41SFObservaciones[0] ;
         A42SFFechaCreacion = BC00034_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = BC00034_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = BC00034_A43SFFechaModificado[0] ;
         n43SFFechaModificado = BC00034_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = BC00034_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = BC00034_n44SFFrascosIsopo[0] ;
      }
      bcSolicitudFrasco = new com.colaveco.SdtSolicitudFrasco(remoteHandle);
      gx_restcollection.clear();
      while ( RcdFound3 != 0 )
      {
         onLoadActions033( ) ;
         addRow033( ) ;
         gx_sdt_item = bcSolicitudFrasco.Clone() ;
         gx_restcollection.add(gx_sdt_item, 0);
         pr_default.readNext(2);
         RcdFound3 = (short)(0) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         if ( (pr_default.getStatus(2) != 101) )
         {
            RcdFound3 = (short)(1) ;
            A3SFId = BC00034_A3SFId[0] ;
            A32SFIdNet = BC00034_A32SFIdNet[0] ;
            n32SFIdNet = BC00034_n32SFIdNet[0] ;
            A33SFNombre = BC00034_A33SFNombre[0] ;
            n33SFNombre = BC00034_n33SFNombre[0] ;
            A34SFDireccion = BC00034_A34SFDireccion[0] ;
            n34SFDireccion = BC00034_n34SFDireccion[0] ;
            A35SFAgencia = BC00034_A35SFAgencia[0] ;
            n35SFAgencia = BC00034_n35SFAgencia[0] ;
            A36SFTelefono = BC00034_A36SFTelefono[0] ;
            n36SFTelefono = BC00034_n36SFTelefono[0] ;
            A37SFEmail = BC00034_A37SFEmail[0] ;
            n37SFEmail = BC00034_n37SFEmail[0] ;
            A38SFFrascosConC = BC00034_A38SFFrascosConC[0] ;
            n38SFFrascosConC = BC00034_n38SFFrascosConC[0] ;
            A39SFFrascosSinC = BC00034_A39SFFrascosSinC[0] ;
            n39SFFrascosSinC = BC00034_n39SFFrascosSinC[0] ;
            A167SFFrascosAgua = BC00034_A167SFFrascosAgua[0] ;
            n167SFFrascosAgua = BC00034_n167SFFrascosAgua[0] ;
            A40SFFrascosSangre = BC00034_A40SFFrascosSangre[0] ;
            n40SFFrascosSangre = BC00034_n40SFFrascosSangre[0] ;
            A41SFObservaciones = BC00034_A41SFObservaciones[0] ;
            n41SFObservaciones = BC00034_n41SFObservaciones[0] ;
            A42SFFechaCreacion = BC00034_A42SFFechaCreacion[0] ;
            n42SFFechaCreacion = BC00034_n42SFFechaCreacion[0] ;
            A43SFFechaModificado = BC00034_A43SFFechaModificado[0] ;
            n43SFFechaModificado = BC00034_n43SFFechaModificado[0] ;
            A44SFFrascosIsopo = BC00034_A44SFFrascosIsopo[0] ;
            n44SFFrascosIsopo = BC00034_n44SFFrascosIsopo[0] ;
         }
         Gx_mode = sMode3 ;
      }
      pr_default.close(2);
      /* Load Subordinate Levels */
      return gx_restcollection ;
   }

   public void setseudovars( )
   {
      zm033( 0) ;
   }

   public void getInsDefault( )
   {
      readRow033( ) ;
      standaloneNotModal( ) ;
      initializeNonKey033( ) ;
      standaloneModal( ) ;
      addRow033( ) ;
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
            Z3SFId = A3SFId ;
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

   public void confirm_030( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls033( ) ;
         }
         else
         {
            checkExtendedTable033( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors033( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z32SFIdNet = A32SFIdNet ;
         Z33SFNombre = A33SFNombre ;
         Z34SFDireccion = A34SFDireccion ;
         Z35SFAgencia = A35SFAgencia ;
         Z36SFTelefono = A36SFTelefono ;
         Z37SFEmail = A37SFEmail ;
         Z38SFFrascosConC = A38SFFrascosConC ;
         Z39SFFrascosSinC = A39SFFrascosSinC ;
         Z167SFFrascosAgua = A167SFFrascosAgua ;
         Z40SFFrascosSangre = A40SFFrascosSangre ;
         Z41SFObservaciones = A41SFObservaciones ;
         Z42SFFechaCreacion = A42SFFechaCreacion ;
         Z43SFFechaModificado = A43SFFechaModificado ;
         Z44SFFrascosIsopo = A44SFFrascosIsopo ;
      }
      if ( GX_JID == -3 )
      {
         Z3SFId = A3SFId ;
         Z32SFIdNet = A32SFIdNet ;
         Z33SFNombre = A33SFNombre ;
         Z34SFDireccion = A34SFDireccion ;
         Z35SFAgencia = A35SFAgencia ;
         Z36SFTelefono = A36SFTelefono ;
         Z37SFEmail = A37SFEmail ;
         Z38SFFrascosConC = A38SFFrascosConC ;
         Z39SFFrascosSinC = A39SFFrascosSinC ;
         Z167SFFrascosAgua = A167SFFrascosAgua ;
         Z40SFFrascosSangre = A40SFFrascosSangre ;
         Z41SFObservaciones = A41SFObservaciones ;
         Z42SFFechaCreacion = A42SFFechaCreacion ;
         Z43SFFechaModificado = A43SFFechaModificado ;
         Z44SFFrascosIsopo = A44SFFrascosIsopo ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load033( )
   {
      /* Using cursor BC00035 */
      pr_default.execute(3, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A32SFIdNet = BC00035_A32SFIdNet[0] ;
         n32SFIdNet = BC00035_n32SFIdNet[0] ;
         A33SFNombre = BC00035_A33SFNombre[0] ;
         n33SFNombre = BC00035_n33SFNombre[0] ;
         A34SFDireccion = BC00035_A34SFDireccion[0] ;
         n34SFDireccion = BC00035_n34SFDireccion[0] ;
         A35SFAgencia = BC00035_A35SFAgencia[0] ;
         n35SFAgencia = BC00035_n35SFAgencia[0] ;
         A36SFTelefono = BC00035_A36SFTelefono[0] ;
         n36SFTelefono = BC00035_n36SFTelefono[0] ;
         A37SFEmail = BC00035_A37SFEmail[0] ;
         n37SFEmail = BC00035_n37SFEmail[0] ;
         A38SFFrascosConC = BC00035_A38SFFrascosConC[0] ;
         n38SFFrascosConC = BC00035_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = BC00035_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = BC00035_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = BC00035_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = BC00035_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = BC00035_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = BC00035_n40SFFrascosSangre[0] ;
         A41SFObservaciones = BC00035_A41SFObservaciones[0] ;
         n41SFObservaciones = BC00035_n41SFObservaciones[0] ;
         A42SFFechaCreacion = BC00035_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = BC00035_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = BC00035_A43SFFechaModificado[0] ;
         n43SFFechaModificado = BC00035_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = BC00035_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = BC00035_n44SFFrascosIsopo[0] ;
         zm033( -3) ;
      }
      pr_default.close(3);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
   }

   public void checkExtendedTable033( )
   {
      nIsDirty_3 = (short)(0) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A42SFFechaCreacion) || (( A42SFFechaCreacion.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A42SFFechaCreacion, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field SFFecha Creacion is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A43SFFechaModificado) || (( A43SFFechaModificado.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A43SFFechaModificado, localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Field SFFecha Modificado is out of range", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor BC00036 */
      pr_default.execute(4, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00037 */
      pr_default.execute(5, new Object[] {Long.valueOf(A3SFId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm033( 3) ;
         RcdFound3 = (short)(1) ;
         A3SFId = BC00037_A3SFId[0] ;
         A32SFIdNet = BC00037_A32SFIdNet[0] ;
         n32SFIdNet = BC00037_n32SFIdNet[0] ;
         A33SFNombre = BC00037_A33SFNombre[0] ;
         n33SFNombre = BC00037_n33SFNombre[0] ;
         A34SFDireccion = BC00037_A34SFDireccion[0] ;
         n34SFDireccion = BC00037_n34SFDireccion[0] ;
         A35SFAgencia = BC00037_A35SFAgencia[0] ;
         n35SFAgencia = BC00037_n35SFAgencia[0] ;
         A36SFTelefono = BC00037_A36SFTelefono[0] ;
         n36SFTelefono = BC00037_n36SFTelefono[0] ;
         A37SFEmail = BC00037_A37SFEmail[0] ;
         n37SFEmail = BC00037_n37SFEmail[0] ;
         A38SFFrascosConC = BC00037_A38SFFrascosConC[0] ;
         n38SFFrascosConC = BC00037_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = BC00037_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = BC00037_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = BC00037_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = BC00037_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = BC00037_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = BC00037_n40SFFrascosSangre[0] ;
         A41SFObservaciones = BC00037_A41SFObservaciones[0] ;
         n41SFObservaciones = BC00037_n41SFObservaciones[0] ;
         A42SFFechaCreacion = BC00037_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = BC00037_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = BC00037_A43SFFechaModificado[0] ;
         n43SFFechaModificado = BC00037_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = BC00037_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = BC00037_n44SFFrascosIsopo[0] ;
         Z3SFId = A3SFId ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      confirm_030( ) ;
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

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00038 */
         pr_default.execute(6, new Object[] {Long.valueOf(A3SFId)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SolicitudFrasco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( Z32SFIdNet != BC00038_A32SFIdNet[0] ) || ( GXutil.strcmp(Z33SFNombre, BC00038_A33SFNombre[0]) != 0 ) || ( GXutil.strcmp(Z34SFDireccion, BC00038_A34SFDireccion[0]) != 0 ) || ( Z35SFAgencia != BC00038_A35SFAgencia[0] ) || ( GXutil.strcmp(Z36SFTelefono, BC00038_A36SFTelefono[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z37SFEmail, BC00038_A37SFEmail[0]) != 0 ) || ( Z38SFFrascosConC != BC00038_A38SFFrascosConC[0] ) || ( Z39SFFrascosSinC != BC00038_A39SFFrascosSinC[0] ) || ( Z167SFFrascosAgua != BC00038_A167SFFrascosAgua[0] ) || ( Z40SFFrascosSangre != BC00038_A40SFFrascosSangre[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z41SFObservaciones, BC00038_A41SFObservaciones[0]) != 0 ) || !( GXutil.dateCompare(Z42SFFechaCreacion, BC00038_A42SFFechaCreacion[0]) ) || !( GXutil.dateCompare(Z43SFFechaModificado, BC00038_A43SFFechaModificado[0]) ) || ( Z44SFFrascosIsopo != BC00038_A44SFFrascosIsopo[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SolicitudFrasco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00039 */
                  pr_default.execute(7, new Object[] {Long.valueOf(A3SFId), Boolean.valueOf(n32SFIdNet), Long.valueOf(A32SFIdNet), Boolean.valueOf(n33SFNombre), A33SFNombre, Boolean.valueOf(n34SFDireccion), A34SFDireccion, Boolean.valueOf(n35SFAgencia), Short.valueOf(A35SFAgencia), Boolean.valueOf(n36SFTelefono), A36SFTelefono, Boolean.valueOf(n37SFEmail), A37SFEmail, Boolean.valueOf(n38SFFrascosConC), Short.valueOf(A38SFFrascosConC), Boolean.valueOf(n39SFFrascosSinC), Short.valueOf(A39SFFrascosSinC), Boolean.valueOf(n167SFFrascosAgua), Short.valueOf(A167SFFrascosAgua), Boolean.valueOf(n40SFFrascosSangre), Short.valueOf(A40SFFrascosSangre), Boolean.valueOf(n41SFObservaciones), A41SFObservaciones, Boolean.valueOf(n42SFFechaCreacion), A42SFFechaCreacion, Boolean.valueOf(n43SFFechaModificado), A43SFFechaModificado, Boolean.valueOf(n44SFFrascosIsopo), Short.valueOf(A44SFFrascosIsopo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n32SFIdNet), Long.valueOf(A32SFIdNet), Boolean.valueOf(n33SFNombre), A33SFNombre, Boolean.valueOf(n34SFDireccion), A34SFDireccion, Boolean.valueOf(n35SFAgencia), Short.valueOf(A35SFAgencia), Boolean.valueOf(n36SFTelefono), A36SFTelefono, Boolean.valueOf(n37SFEmail), A37SFEmail, Boolean.valueOf(n38SFFrascosConC), Short.valueOf(A38SFFrascosConC), Boolean.valueOf(n39SFFrascosSinC), Short.valueOf(A39SFFrascosSinC), Boolean.valueOf(n167SFFrascosAgua), Short.valueOf(A167SFFrascosAgua), Boolean.valueOf(n40SFFrascosSangre), Short.valueOf(A40SFFrascosSangre), Boolean.valueOf(n41SFObservaciones), A41SFObservaciones, Boolean.valueOf(n42SFFechaCreacion), A42SFFechaCreacion, Boolean.valueOf(n43SFFechaModificado), A43SFFechaModificado, Boolean.valueOf(n44SFFrascosIsopo), Short.valueOf(A44SFFrascosIsopo), Long.valueOf(A3SFId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SolicitudFrasco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000311 */
               pr_default.execute(9, new Object[] {Long.valueOf(A3SFId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SolicitudFrasco");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel033( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel033( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
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

   public void scanKeyStart033( )
   {
      /* Using cursor BC000312 */
      pr_default.execute(10, new Object[] {Long.valueOf(A3SFId)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3SFId = BC000312_A3SFId[0] ;
         A32SFIdNet = BC000312_A32SFIdNet[0] ;
         n32SFIdNet = BC000312_n32SFIdNet[0] ;
         A33SFNombre = BC000312_A33SFNombre[0] ;
         n33SFNombre = BC000312_n33SFNombre[0] ;
         A34SFDireccion = BC000312_A34SFDireccion[0] ;
         n34SFDireccion = BC000312_n34SFDireccion[0] ;
         A35SFAgencia = BC000312_A35SFAgencia[0] ;
         n35SFAgencia = BC000312_n35SFAgencia[0] ;
         A36SFTelefono = BC000312_A36SFTelefono[0] ;
         n36SFTelefono = BC000312_n36SFTelefono[0] ;
         A37SFEmail = BC000312_A37SFEmail[0] ;
         n37SFEmail = BC000312_n37SFEmail[0] ;
         A38SFFrascosConC = BC000312_A38SFFrascosConC[0] ;
         n38SFFrascosConC = BC000312_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = BC000312_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = BC000312_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = BC000312_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = BC000312_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = BC000312_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = BC000312_n40SFFrascosSangre[0] ;
         A41SFObservaciones = BC000312_A41SFObservaciones[0] ;
         n41SFObservaciones = BC000312_n41SFObservaciones[0] ;
         A42SFFechaCreacion = BC000312_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = BC000312_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = BC000312_A43SFFechaModificado[0] ;
         n43SFFechaModificado = BC000312_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = BC000312_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = BC000312_n44SFFrascosIsopo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound3 = (short)(0) ;
      scanKeyLoad033( ) ;
   }

   public void scanKeyLoad033( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3SFId = BC000312_A3SFId[0] ;
         A32SFIdNet = BC000312_A32SFIdNet[0] ;
         n32SFIdNet = BC000312_n32SFIdNet[0] ;
         A33SFNombre = BC000312_A33SFNombre[0] ;
         n33SFNombre = BC000312_n33SFNombre[0] ;
         A34SFDireccion = BC000312_A34SFDireccion[0] ;
         n34SFDireccion = BC000312_n34SFDireccion[0] ;
         A35SFAgencia = BC000312_A35SFAgencia[0] ;
         n35SFAgencia = BC000312_n35SFAgencia[0] ;
         A36SFTelefono = BC000312_A36SFTelefono[0] ;
         n36SFTelefono = BC000312_n36SFTelefono[0] ;
         A37SFEmail = BC000312_A37SFEmail[0] ;
         n37SFEmail = BC000312_n37SFEmail[0] ;
         A38SFFrascosConC = BC000312_A38SFFrascosConC[0] ;
         n38SFFrascosConC = BC000312_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = BC000312_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = BC000312_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = BC000312_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = BC000312_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = BC000312_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = BC000312_n40SFFrascosSangre[0] ;
         A41SFObservaciones = BC000312_A41SFObservaciones[0] ;
         n41SFObservaciones = BC000312_n41SFObservaciones[0] ;
         A42SFFechaCreacion = BC000312_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = BC000312_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = BC000312_A43SFFechaModificado[0] ;
         n43SFFechaModificado = BC000312_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = BC000312_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = BC000312_n44SFFrascosIsopo[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd033( )
   {
      pr_default.close(10);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void addRow033( )
   {
      VarsToRow3( bcSolicitudFrasco) ;
   }

   public void readRow033( )
   {
      RowToVars3( bcSolicitudFrasco, 1) ;
   }

   public void initializeNonKey033( )
   {
      A32SFIdNet = 0 ;
      n32SFIdNet = false ;
      A33SFNombre = "" ;
      n33SFNombre = false ;
      A34SFDireccion = "" ;
      n34SFDireccion = false ;
      A35SFAgencia = (short)(0) ;
      n35SFAgencia = false ;
      A36SFTelefono = "" ;
      n36SFTelefono = false ;
      A37SFEmail = "" ;
      n37SFEmail = false ;
      A38SFFrascosConC = (short)(0) ;
      n38SFFrascosConC = false ;
      A39SFFrascosSinC = (short)(0) ;
      n39SFFrascosSinC = false ;
      A167SFFrascosAgua = (short)(0) ;
      n167SFFrascosAgua = false ;
      A40SFFrascosSangre = (short)(0) ;
      n40SFFrascosSangre = false ;
      A41SFObservaciones = "" ;
      n41SFObservaciones = false ;
      A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      n42SFFechaCreacion = false ;
      A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      n43SFFechaModificado = false ;
      A44SFFrascosIsopo = (short)(0) ;
      n44SFFrascosIsopo = false ;
      Z32SFIdNet = 0 ;
      Z33SFNombre = "" ;
      Z34SFDireccion = "" ;
      Z35SFAgencia = (short)(0) ;
      Z36SFTelefono = "" ;
      Z37SFEmail = "" ;
      Z38SFFrascosConC = (short)(0) ;
      Z39SFFrascosSinC = (short)(0) ;
      Z167SFFrascosAgua = (short)(0) ;
      Z40SFFrascosSangre = (short)(0) ;
      Z41SFObservaciones = "" ;
      Z42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      Z44SFFrascosIsopo = (short)(0) ;
   }

   public void initAll033( )
   {
      A3SFId = 0 ;
      initializeNonKey033( ) ;
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

   public void VarsToRow3( com.colaveco.SdtSolicitudFrasco obj3 )
   {
      obj3.setgxTv_SdtSolicitudFrasco_Mode( Gx_mode );
      obj3.setgxTv_SdtSolicitudFrasco_Sfidnet( A32SFIdNet );
      obj3.setgxTv_SdtSolicitudFrasco_Sfnombre( A33SFNombre );
      obj3.setgxTv_SdtSolicitudFrasco_Sfdireccion( A34SFDireccion );
      obj3.setgxTv_SdtSolicitudFrasco_Sfagencia( A35SFAgencia );
      obj3.setgxTv_SdtSolicitudFrasco_Sftelefono( A36SFTelefono );
      obj3.setgxTv_SdtSolicitudFrasco_Sfemail( A37SFEmail );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosconc( A38SFFrascosConC );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossinc( A39SFFrascosSinC );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosagua( A167SFFrascosAgua );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossangre( A40SFFrascosSangre );
      obj3.setgxTv_SdtSolicitudFrasco_Sfobservaciones( A41SFObservaciones );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechacreacion( A42SFFechaCreacion );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechamodificado( A43SFFechaModificado );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosisopo( A44SFFrascosIsopo );
      obj3.setgxTv_SdtSolicitudFrasco_Sfid( A3SFId );
      obj3.setgxTv_SdtSolicitudFrasco_Sfid_Z( Z3SFId );
      obj3.setgxTv_SdtSolicitudFrasco_Sfidnet_Z( Z32SFIdNet );
      obj3.setgxTv_SdtSolicitudFrasco_Sfnombre_Z( Z33SFNombre );
      obj3.setgxTv_SdtSolicitudFrasco_Sfdireccion_Z( Z34SFDireccion );
      obj3.setgxTv_SdtSolicitudFrasco_Sfagencia_Z( Z35SFAgencia );
      obj3.setgxTv_SdtSolicitudFrasco_Sftelefono_Z( Z36SFTelefono );
      obj3.setgxTv_SdtSolicitudFrasco_Sfemail_Z( Z37SFEmail );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosconc_Z( Z38SFFrascosConC );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossinc_Z( Z39SFFrascosSinC );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosagua_Z( Z167SFFrascosAgua );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossangre_Z( Z40SFFrascosSangre );
      obj3.setgxTv_SdtSolicitudFrasco_Sfobservaciones_Z( Z41SFObservaciones );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechacreacion_Z( Z42SFFechaCreacion );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechamodificado_Z( Z43SFFechaModificado );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z( Z44SFFrascosIsopo );
      obj3.setgxTv_SdtSolicitudFrasco_Sfidnet_N( (byte)((byte)((n32SFIdNet)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sfnombre_N( (byte)((byte)((n33SFNombre)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sfdireccion_N( (byte)((byte)((n34SFDireccion)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sfagencia_N( (byte)((byte)((n35SFAgencia)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sftelefono_N( (byte)((byte)((n36SFTelefono)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sfemail_N( (byte)((byte)((n37SFEmail)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosconc_N( (byte)((byte)((n38SFFrascosConC)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossinc_N( (byte)((byte)((n39SFFrascosSinC)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosagua_N( (byte)((byte)((n167SFFrascosAgua)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascossangre_N( (byte)((byte)((n40SFFrascosSangre)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sfobservaciones_N( (byte)((byte)((n41SFObservaciones)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechacreacion_N( (byte)((byte)((n42SFFechaCreacion)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffechamodificado_N( (byte)((byte)((n43SFFechaModificado)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Sffrascosisopo_N( (byte)((byte)((n44SFFrascosIsopo)?1:0)) );
      obj3.setgxTv_SdtSolicitudFrasco_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( com.colaveco.SdtSolicitudFrasco obj3 )
   {
      obj3.setgxTv_SdtSolicitudFrasco_Sfid( A3SFId );
   }

   public void RowToVars3( com.colaveco.SdtSolicitudFrasco obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_SdtSolicitudFrasco_Mode() ;
      A32SFIdNet = obj3.getgxTv_SdtSolicitudFrasco_Sfidnet() ;
      n32SFIdNet = false ;
      A33SFNombre = obj3.getgxTv_SdtSolicitudFrasco_Sfnombre() ;
      n33SFNombre = false ;
      A34SFDireccion = obj3.getgxTv_SdtSolicitudFrasco_Sfdireccion() ;
      n34SFDireccion = false ;
      A35SFAgencia = obj3.getgxTv_SdtSolicitudFrasco_Sfagencia() ;
      n35SFAgencia = false ;
      A36SFTelefono = obj3.getgxTv_SdtSolicitudFrasco_Sftelefono() ;
      n36SFTelefono = false ;
      A37SFEmail = obj3.getgxTv_SdtSolicitudFrasco_Sfemail() ;
      n37SFEmail = false ;
      A38SFFrascosConC = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosconc() ;
      n38SFFrascosConC = false ;
      A39SFFrascosSinC = obj3.getgxTv_SdtSolicitudFrasco_Sffrascossinc() ;
      n39SFFrascosSinC = false ;
      A167SFFrascosAgua = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosagua() ;
      n167SFFrascosAgua = false ;
      A40SFFrascosSangre = obj3.getgxTv_SdtSolicitudFrasco_Sffrascossangre() ;
      n40SFFrascosSangre = false ;
      A41SFObservaciones = obj3.getgxTv_SdtSolicitudFrasco_Sfobservaciones() ;
      n41SFObservaciones = false ;
      A42SFFechaCreacion = obj3.getgxTv_SdtSolicitudFrasco_Sffechacreacion() ;
      n42SFFechaCreacion = false ;
      A43SFFechaModificado = obj3.getgxTv_SdtSolicitudFrasco_Sffechamodificado() ;
      n43SFFechaModificado = false ;
      A44SFFrascosIsopo = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosisopo() ;
      n44SFFrascosIsopo = false ;
      A3SFId = obj3.getgxTv_SdtSolicitudFrasco_Sfid() ;
      Z3SFId = obj3.getgxTv_SdtSolicitudFrasco_Sfid_Z() ;
      Z32SFIdNet = obj3.getgxTv_SdtSolicitudFrasco_Sfidnet_Z() ;
      Z33SFNombre = obj3.getgxTv_SdtSolicitudFrasco_Sfnombre_Z() ;
      Z34SFDireccion = obj3.getgxTv_SdtSolicitudFrasco_Sfdireccion_Z() ;
      Z35SFAgencia = obj3.getgxTv_SdtSolicitudFrasco_Sfagencia_Z() ;
      Z36SFTelefono = obj3.getgxTv_SdtSolicitudFrasco_Sftelefono_Z() ;
      Z37SFEmail = obj3.getgxTv_SdtSolicitudFrasco_Sfemail_Z() ;
      Z38SFFrascosConC = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosconc_Z() ;
      Z39SFFrascosSinC = obj3.getgxTv_SdtSolicitudFrasco_Sffrascossinc_Z() ;
      Z167SFFrascosAgua = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosagua_Z() ;
      Z40SFFrascosSangre = obj3.getgxTv_SdtSolicitudFrasco_Sffrascossangre_Z() ;
      Z41SFObservaciones = obj3.getgxTv_SdtSolicitudFrasco_Sfobservaciones_Z() ;
      Z42SFFechaCreacion = obj3.getgxTv_SdtSolicitudFrasco_Sffechacreacion_Z() ;
      Z43SFFechaModificado = obj3.getgxTv_SdtSolicitudFrasco_Sffechamodificado_Z() ;
      Z44SFFrascosIsopo = obj3.getgxTv_SdtSolicitudFrasco_Sffrascosisopo_Z() ;
      n32SFIdNet = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfidnet_N()==0)?false:true) ;
      n33SFNombre = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfnombre_N()==0)?false:true) ;
      n34SFDireccion = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfdireccion_N()==0)?false:true) ;
      n35SFAgencia = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfagencia_N()==0)?false:true) ;
      n36SFTelefono = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sftelefono_N()==0)?false:true) ;
      n37SFEmail = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfemail_N()==0)?false:true) ;
      n38SFFrascosConC = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffrascosconc_N()==0)?false:true) ;
      n39SFFrascosSinC = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffrascossinc_N()==0)?false:true) ;
      n167SFFrascosAgua = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffrascosagua_N()==0)?false:true) ;
      n40SFFrascosSangre = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffrascossangre_N()==0)?false:true) ;
      n41SFObservaciones = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sfobservaciones_N()==0)?false:true) ;
      n42SFFechaCreacion = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffechacreacion_N()==0)?false:true) ;
      n43SFFechaModificado = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffechamodificado_N()==0)?false:true) ;
      n44SFFrascosIsopo = (boolean)((obj3.getgxTv_SdtSolicitudFrasco_Sffrascosisopo_N()==0)?false:true) ;
      Gx_mode = obj3.getgxTv_SdtSolicitudFrasco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A3SFId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey033( ) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z3SFId = A3SFId ;
      }
      zm033( -3) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcSolicitudFrasco, 0) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z3SFId = A3SFId ;
      }
      zm033( -3) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert033( ) ;
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A3SFId != Z3SFId )
            {
               A3SFId = Z3SFId ;
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
               update033( ) ;
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
               if ( A3SFId != Z3SFId )
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
                     insert033( ) ;
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
                     insert033( ) ;
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
      RowToVars3( bcSolicitudFrasco, 1) ;
      saveImpl( ) ;
      VarsToRow3( bcSolicitudFrasco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars3( bcSolicitudFrasco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
      afterTrn( ) ;
      VarsToRow3( bcSolicitudFrasco) ;
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
         com.colaveco.SdtSolicitudFrasco auxBC = new com.colaveco.SdtSolicitudFrasco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A3SFId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcSolicitudFrasco);
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
      RowToVars3( bcSolicitudFrasco, 1) ;
      updateImpl( ) ;
      VarsToRow3( bcSolicitudFrasco) ;
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
      RowToVars3( bcSolicitudFrasco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
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
      VarsToRow3( bcSolicitudFrasco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcSolicitudFrasco, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey033( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A3SFId != Z3SFId )
         {
            A3SFId = Z3SFId ;
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
         if ( A3SFId != Z3SFId )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "solicitudfrasco_bc");
      VarsToRow3( bcSolicitudFrasco) ;
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
      Gx_mode = bcSolicitudFrasco.getgxTv_SdtSolicitudFrasco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcSolicitudFrasco.setgxTv_SdtSolicitudFrasco_Mode( Gx_mode );
   }

   public void SetSDT( com.colaveco.SdtSolicitudFrasco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcSolicitudFrasco )
      {
         bcSolicitudFrasco = sdt ;
         if ( GXutil.strcmp(bcSolicitudFrasco.getgxTv_SdtSolicitudFrasco_Mode(), "") == 0 )
         {
            bcSolicitudFrasco.setgxTv_SdtSolicitudFrasco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcSolicitudFrasco) ;
         }
         else
         {
            RowToVars3( bcSolicitudFrasco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcSolicitudFrasco.getgxTv_SdtSolicitudFrasco_Mode(), "") == 0 )
         {
            bcSolicitudFrasco.setgxTv_SdtSolicitudFrasco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcSolicitudFrasco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtSolicitudFrasco getSolicitudFrasco_BC( )
   {
      return bcSolicitudFrasco ;
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
      BC00034_A3SFId = new long[1] ;
      BC00034_A32SFIdNet = new long[1] ;
      BC00034_n32SFIdNet = new boolean[] {false} ;
      BC00034_A33SFNombre = new String[] {""} ;
      BC00034_n33SFNombre = new boolean[] {false} ;
      BC00034_A34SFDireccion = new String[] {""} ;
      BC00034_n34SFDireccion = new boolean[] {false} ;
      BC00034_A35SFAgencia = new short[1] ;
      BC00034_n35SFAgencia = new boolean[] {false} ;
      BC00034_A36SFTelefono = new String[] {""} ;
      BC00034_n36SFTelefono = new boolean[] {false} ;
      BC00034_A37SFEmail = new String[] {""} ;
      BC00034_n37SFEmail = new boolean[] {false} ;
      BC00034_A38SFFrascosConC = new short[1] ;
      BC00034_n38SFFrascosConC = new boolean[] {false} ;
      BC00034_A39SFFrascosSinC = new short[1] ;
      BC00034_n39SFFrascosSinC = new boolean[] {false} ;
      BC00034_A167SFFrascosAgua = new short[1] ;
      BC00034_n167SFFrascosAgua = new boolean[] {false} ;
      BC00034_A40SFFrascosSangre = new short[1] ;
      BC00034_n40SFFrascosSangre = new boolean[] {false} ;
      BC00034_A41SFObservaciones = new String[] {""} ;
      BC00034_n41SFObservaciones = new boolean[] {false} ;
      BC00034_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      BC00034_n42SFFechaCreacion = new boolean[] {false} ;
      BC00034_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00034_n43SFFechaModificado = new boolean[] {false} ;
      BC00034_A44SFFrascosIsopo = new short[1] ;
      BC00034_n44SFFrascosIsopo = new boolean[] {false} ;
      A33SFNombre = "" ;
      A34SFDireccion = "" ;
      A36SFTelefono = "" ;
      A37SFEmail = "" ;
      A41SFObservaciones = "" ;
      A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      gx_restcollection = new GXBCCollection<com.colaveco.SdtSolicitudFrasco>(com.colaveco.SdtSolicitudFrasco.class, "SolicitudFrasco", "Colaveco", remoteHandle);
      sMode3 = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z33SFNombre = "" ;
      Z34SFDireccion = "" ;
      Z36SFTelefono = "" ;
      Z37SFEmail = "" ;
      Z41SFObservaciones = "" ;
      Z42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      BC00035_A3SFId = new long[1] ;
      BC00035_A32SFIdNet = new long[1] ;
      BC00035_n32SFIdNet = new boolean[] {false} ;
      BC00035_A33SFNombre = new String[] {""} ;
      BC00035_n33SFNombre = new boolean[] {false} ;
      BC00035_A34SFDireccion = new String[] {""} ;
      BC00035_n34SFDireccion = new boolean[] {false} ;
      BC00035_A35SFAgencia = new short[1] ;
      BC00035_n35SFAgencia = new boolean[] {false} ;
      BC00035_A36SFTelefono = new String[] {""} ;
      BC00035_n36SFTelefono = new boolean[] {false} ;
      BC00035_A37SFEmail = new String[] {""} ;
      BC00035_n37SFEmail = new boolean[] {false} ;
      BC00035_A38SFFrascosConC = new short[1] ;
      BC00035_n38SFFrascosConC = new boolean[] {false} ;
      BC00035_A39SFFrascosSinC = new short[1] ;
      BC00035_n39SFFrascosSinC = new boolean[] {false} ;
      BC00035_A167SFFrascosAgua = new short[1] ;
      BC00035_n167SFFrascosAgua = new boolean[] {false} ;
      BC00035_A40SFFrascosSangre = new short[1] ;
      BC00035_n40SFFrascosSangre = new boolean[] {false} ;
      BC00035_A41SFObservaciones = new String[] {""} ;
      BC00035_n41SFObservaciones = new boolean[] {false} ;
      BC00035_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      BC00035_n42SFFechaCreacion = new boolean[] {false} ;
      BC00035_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00035_n43SFFechaModificado = new boolean[] {false} ;
      BC00035_A44SFFrascosIsopo = new short[1] ;
      BC00035_n44SFFrascosIsopo = new boolean[] {false} ;
      BC00036_A3SFId = new long[1] ;
      BC00037_A3SFId = new long[1] ;
      BC00037_A32SFIdNet = new long[1] ;
      BC00037_n32SFIdNet = new boolean[] {false} ;
      BC00037_A33SFNombre = new String[] {""} ;
      BC00037_n33SFNombre = new boolean[] {false} ;
      BC00037_A34SFDireccion = new String[] {""} ;
      BC00037_n34SFDireccion = new boolean[] {false} ;
      BC00037_A35SFAgencia = new short[1] ;
      BC00037_n35SFAgencia = new boolean[] {false} ;
      BC00037_A36SFTelefono = new String[] {""} ;
      BC00037_n36SFTelefono = new boolean[] {false} ;
      BC00037_A37SFEmail = new String[] {""} ;
      BC00037_n37SFEmail = new boolean[] {false} ;
      BC00037_A38SFFrascosConC = new short[1] ;
      BC00037_n38SFFrascosConC = new boolean[] {false} ;
      BC00037_A39SFFrascosSinC = new short[1] ;
      BC00037_n39SFFrascosSinC = new boolean[] {false} ;
      BC00037_A167SFFrascosAgua = new short[1] ;
      BC00037_n167SFFrascosAgua = new boolean[] {false} ;
      BC00037_A40SFFrascosSangre = new short[1] ;
      BC00037_n40SFFrascosSangre = new boolean[] {false} ;
      BC00037_A41SFObservaciones = new String[] {""} ;
      BC00037_n41SFObservaciones = new boolean[] {false} ;
      BC00037_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      BC00037_n42SFFechaCreacion = new boolean[] {false} ;
      BC00037_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00037_n43SFFechaModificado = new boolean[] {false} ;
      BC00037_A44SFFrascosIsopo = new short[1] ;
      BC00037_n44SFFrascosIsopo = new boolean[] {false} ;
      BC00038_A3SFId = new long[1] ;
      BC00038_A32SFIdNet = new long[1] ;
      BC00038_n32SFIdNet = new boolean[] {false} ;
      BC00038_A33SFNombre = new String[] {""} ;
      BC00038_n33SFNombre = new boolean[] {false} ;
      BC00038_A34SFDireccion = new String[] {""} ;
      BC00038_n34SFDireccion = new boolean[] {false} ;
      BC00038_A35SFAgencia = new short[1] ;
      BC00038_n35SFAgencia = new boolean[] {false} ;
      BC00038_A36SFTelefono = new String[] {""} ;
      BC00038_n36SFTelefono = new boolean[] {false} ;
      BC00038_A37SFEmail = new String[] {""} ;
      BC00038_n37SFEmail = new boolean[] {false} ;
      BC00038_A38SFFrascosConC = new short[1] ;
      BC00038_n38SFFrascosConC = new boolean[] {false} ;
      BC00038_A39SFFrascosSinC = new short[1] ;
      BC00038_n39SFFrascosSinC = new boolean[] {false} ;
      BC00038_A167SFFrascosAgua = new short[1] ;
      BC00038_n167SFFrascosAgua = new boolean[] {false} ;
      BC00038_A40SFFrascosSangre = new short[1] ;
      BC00038_n40SFFrascosSangre = new boolean[] {false} ;
      BC00038_A41SFObservaciones = new String[] {""} ;
      BC00038_n41SFObservaciones = new boolean[] {false} ;
      BC00038_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      BC00038_n42SFFechaCreacion = new boolean[] {false} ;
      BC00038_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      BC00038_n43SFFechaModificado = new boolean[] {false} ;
      BC00038_A44SFFrascosIsopo = new short[1] ;
      BC00038_n44SFFrascosIsopo = new boolean[] {false} ;
      BC000312_A3SFId = new long[1] ;
      BC000312_A32SFIdNet = new long[1] ;
      BC000312_n32SFIdNet = new boolean[] {false} ;
      BC000312_A33SFNombre = new String[] {""} ;
      BC000312_n33SFNombre = new boolean[] {false} ;
      BC000312_A34SFDireccion = new String[] {""} ;
      BC000312_n34SFDireccion = new boolean[] {false} ;
      BC000312_A35SFAgencia = new short[1] ;
      BC000312_n35SFAgencia = new boolean[] {false} ;
      BC000312_A36SFTelefono = new String[] {""} ;
      BC000312_n36SFTelefono = new boolean[] {false} ;
      BC000312_A37SFEmail = new String[] {""} ;
      BC000312_n37SFEmail = new boolean[] {false} ;
      BC000312_A38SFFrascosConC = new short[1] ;
      BC000312_n38SFFrascosConC = new boolean[] {false} ;
      BC000312_A39SFFrascosSinC = new short[1] ;
      BC000312_n39SFFrascosSinC = new boolean[] {false} ;
      BC000312_A167SFFrascosAgua = new short[1] ;
      BC000312_n167SFFrascosAgua = new boolean[] {false} ;
      BC000312_A40SFFrascosSangre = new short[1] ;
      BC000312_n40SFFrascosSangre = new boolean[] {false} ;
      BC000312_A41SFObservaciones = new String[] {""} ;
      BC000312_n41SFObservaciones = new boolean[] {false} ;
      BC000312_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      BC000312_n42SFFechaCreacion = new boolean[] {false} ;
      BC000312_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      BC000312_n43SFFechaModificado = new boolean[] {false} ;
      BC000312_A44SFFrascosIsopo = new short[1] ;
      BC000312_n44SFFrascosIsopo = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_gam = new DataStoreProvider(context, remoteHandle, new com.colaveco.solicitudfrasco_bc__gam(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.solicitudfrasco_bc__default(),
         new Object[] {
             new Object[] {
            BC00032_A3SFId, BC00032_A32SFIdNet, BC00032_n32SFIdNet, BC00032_A33SFNombre, BC00032_n33SFNombre, BC00032_A34SFDireccion, BC00032_n34SFDireccion, BC00032_A35SFAgencia, BC00032_n35SFAgencia, BC00032_A36SFTelefono,
            BC00032_n36SFTelefono, BC00032_A37SFEmail, BC00032_n37SFEmail, BC00032_A38SFFrascosConC, BC00032_n38SFFrascosConC, BC00032_A39SFFrascosSinC, BC00032_n39SFFrascosSinC, BC00032_A167SFFrascosAgua, BC00032_n167SFFrascosAgua, BC00032_A40SFFrascosSangre,
            BC00032_n40SFFrascosSangre, BC00032_A41SFObservaciones, BC00032_n41SFObservaciones, BC00032_A42SFFechaCreacion, BC00032_n42SFFechaCreacion, BC00032_A43SFFechaModificado, BC00032_n43SFFechaModificado, BC00032_A44SFFrascosIsopo, BC00032_n44SFFrascosIsopo
            }
            , new Object[] {
            BC00033_A3SFId, BC00033_A32SFIdNet, BC00033_n32SFIdNet, BC00033_A33SFNombre, BC00033_n33SFNombre, BC00033_A34SFDireccion, BC00033_n34SFDireccion, BC00033_A35SFAgencia, BC00033_n35SFAgencia, BC00033_A36SFTelefono,
            BC00033_n36SFTelefono, BC00033_A37SFEmail, BC00033_n37SFEmail, BC00033_A38SFFrascosConC, BC00033_n38SFFrascosConC, BC00033_A39SFFrascosSinC, BC00033_n39SFFrascosSinC, BC00033_A167SFFrascosAgua, BC00033_n167SFFrascosAgua, BC00033_A40SFFrascosSangre,
            BC00033_n40SFFrascosSangre, BC00033_A41SFObservaciones, BC00033_n41SFObservaciones, BC00033_A42SFFechaCreacion, BC00033_n42SFFechaCreacion, BC00033_A43SFFechaModificado, BC00033_n43SFFechaModificado, BC00033_A44SFFrascosIsopo, BC00033_n44SFFrascosIsopo
            }
            , new Object[] {
            BC00034_A3SFId, BC00034_A32SFIdNet, BC00034_n32SFIdNet, BC00034_A33SFNombre, BC00034_n33SFNombre, BC00034_A34SFDireccion, BC00034_n34SFDireccion, BC00034_A35SFAgencia, BC00034_n35SFAgencia, BC00034_A36SFTelefono,
            BC00034_n36SFTelefono, BC00034_A37SFEmail, BC00034_n37SFEmail, BC00034_A38SFFrascosConC, BC00034_n38SFFrascosConC, BC00034_A39SFFrascosSinC, BC00034_n39SFFrascosSinC, BC00034_A167SFFrascosAgua, BC00034_n167SFFrascosAgua, BC00034_A40SFFrascosSangre,
            BC00034_n40SFFrascosSangre, BC00034_A41SFObservaciones, BC00034_n41SFObservaciones, BC00034_A42SFFechaCreacion, BC00034_n42SFFechaCreacion, BC00034_A43SFFechaModificado, BC00034_n43SFFechaModificado, BC00034_A44SFFrascosIsopo, BC00034_n44SFFrascosIsopo
            }
            , new Object[] {
            BC00035_A3SFId, BC00035_A32SFIdNet, BC00035_n32SFIdNet, BC00035_A33SFNombre, BC00035_n33SFNombre, BC00035_A34SFDireccion, BC00035_n34SFDireccion, BC00035_A35SFAgencia, BC00035_n35SFAgencia, BC00035_A36SFTelefono,
            BC00035_n36SFTelefono, BC00035_A37SFEmail, BC00035_n37SFEmail, BC00035_A38SFFrascosConC, BC00035_n38SFFrascosConC, BC00035_A39SFFrascosSinC, BC00035_n39SFFrascosSinC, BC00035_A167SFFrascosAgua, BC00035_n167SFFrascosAgua, BC00035_A40SFFrascosSangre,
            BC00035_n40SFFrascosSangre, BC00035_A41SFObservaciones, BC00035_n41SFObservaciones, BC00035_A42SFFechaCreacion, BC00035_n42SFFechaCreacion, BC00035_A43SFFechaModificado, BC00035_n43SFFechaModificado, BC00035_A44SFFrascosIsopo, BC00035_n44SFFrascosIsopo
            }
            , new Object[] {
            BC00036_A3SFId
            }
            , new Object[] {
            BC00037_A3SFId, BC00037_A32SFIdNet, BC00037_n32SFIdNet, BC00037_A33SFNombre, BC00037_n33SFNombre, BC00037_A34SFDireccion, BC00037_n34SFDireccion, BC00037_A35SFAgencia, BC00037_n35SFAgencia, BC00037_A36SFTelefono,
            BC00037_n36SFTelefono, BC00037_A37SFEmail, BC00037_n37SFEmail, BC00037_A38SFFrascosConC, BC00037_n38SFFrascosConC, BC00037_A39SFFrascosSinC, BC00037_n39SFFrascosSinC, BC00037_A167SFFrascosAgua, BC00037_n167SFFrascosAgua, BC00037_A40SFFrascosSangre,
            BC00037_n40SFFrascosSangre, BC00037_A41SFObservaciones, BC00037_n41SFObservaciones, BC00037_A42SFFechaCreacion, BC00037_n42SFFechaCreacion, BC00037_A43SFFechaModificado, BC00037_n43SFFechaModificado, BC00037_A44SFFrascosIsopo, BC00037_n44SFFrascosIsopo
            }
            , new Object[] {
            BC00038_A3SFId, BC00038_A32SFIdNet, BC00038_n32SFIdNet, BC00038_A33SFNombre, BC00038_n33SFNombre, BC00038_A34SFDireccion, BC00038_n34SFDireccion, BC00038_A35SFAgencia, BC00038_n35SFAgencia, BC00038_A36SFTelefono,
            BC00038_n36SFTelefono, BC00038_A37SFEmail, BC00038_n37SFEmail, BC00038_A38SFFrascosConC, BC00038_n38SFFrascosConC, BC00038_A39SFFrascosSinC, BC00038_n39SFFrascosSinC, BC00038_A167SFFrascosAgua, BC00038_n167SFFrascosAgua, BC00038_A40SFFrascosSangre,
            BC00038_n40SFFrascosSangre, BC00038_A41SFObservaciones, BC00038_n41SFObservaciones, BC00038_A42SFFechaCreacion, BC00038_n42SFFechaCreacion, BC00038_A43SFFechaModificado, BC00038_n43SFFechaModificado, BC00038_A44SFFrascosIsopo, BC00038_n44SFFrascosIsopo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000312_A3SFId, BC000312_A32SFIdNet, BC000312_n32SFIdNet, BC000312_A33SFNombre, BC000312_n33SFNombre, BC000312_A34SFDireccion, BC000312_n34SFDireccion, BC000312_A35SFAgencia, BC000312_n35SFAgencia, BC000312_A36SFTelefono,
            BC000312_n36SFTelefono, BC000312_A37SFEmail, BC000312_n37SFEmail, BC000312_A38SFFrascosConC, BC000312_n38SFFrascosConC, BC000312_A39SFFrascosSinC, BC000312_n39SFFrascosSinC, BC000312_A167SFFrascosAgua, BC000312_n167SFFrascosAgua, BC000312_A40SFFrascosSangre,
            BC000312_n40SFFrascosSangre, BC000312_A41SFObservaciones, BC000312_n41SFObservaciones, BC000312_A42SFFechaCreacion, BC000312_n42SFFechaCreacion, BC000312_A43SFFechaModificado, BC000312_n43SFFechaModificado, BC000312_A44SFFrascosIsopo, BC000312_n44SFFrascosIsopo
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
   private short RcdFound3 ;
   private short A35SFAgencia ;
   private short A38SFFrascosConC ;
   private short A39SFFrascosSinC ;
   private short A167SFFrascosAgua ;
   private short A40SFFrascosSangre ;
   private short A44SFFrascosIsopo ;
   private short Z35SFAgencia ;
   private short Z38SFFrascosConC ;
   private short Z39SFFrascosSinC ;
   private short Z167SFFrascosAgua ;
   private short Z40SFFrascosSangre ;
   private short Z44SFFrascosIsopo ;
   private short nIsDirty_3 ;
   private int trnEnded ;
   private int Start ;
   private int Count ;
   private int GXPagingFrom3 ;
   private int GXPagingTo3 ;
   private int GX_JID ;
   private long A3SFId ;
   private long A32SFIdNet ;
   private long Z3SFId ;
   private long Z32SFIdNet ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sMode3 ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private java.util.Date A42SFFechaCreacion ;
   private java.util.Date A43SFFechaModificado ;
   private java.util.Date Z42SFFechaCreacion ;
   private java.util.Date Z43SFFechaModificado ;
   private boolean n32SFIdNet ;
   private boolean n33SFNombre ;
   private boolean n34SFDireccion ;
   private boolean n35SFAgencia ;
   private boolean n36SFTelefono ;
   private boolean n37SFEmail ;
   private boolean n38SFFrascosConC ;
   private boolean n39SFFrascosSinC ;
   private boolean n167SFFrascosAgua ;
   private boolean n40SFFrascosSangre ;
   private boolean n41SFObservaciones ;
   private boolean n42SFFechaCreacion ;
   private boolean n43SFFechaModificado ;
   private boolean n44SFFrascosIsopo ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String A33SFNombre ;
   private String A34SFDireccion ;
   private String A36SFTelefono ;
   private String A37SFEmail ;
   private String A41SFObservaciones ;
   private String Z33SFNombre ;
   private String Z34SFDireccion ;
   private String Z36SFTelefono ;
   private String Z37SFEmail ;
   private String Z41SFObservaciones ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBCCollection<com.colaveco.SdtSolicitudFrasco> gx_restcollection ;
   private com.colaveco.SdtSolicitudFrasco bcSolicitudFrasco ;
   private com.colaveco.SdtSolicitudFrasco gx_sdt_item ;
   private IDataStoreProvider pr_default ;
   private long[] BC00034_A3SFId ;
   private long[] BC00034_A32SFIdNet ;
   private boolean[] BC00034_n32SFIdNet ;
   private String[] BC00034_A33SFNombre ;
   private boolean[] BC00034_n33SFNombre ;
   private String[] BC00034_A34SFDireccion ;
   private boolean[] BC00034_n34SFDireccion ;
   private short[] BC00034_A35SFAgencia ;
   private boolean[] BC00034_n35SFAgencia ;
   private String[] BC00034_A36SFTelefono ;
   private boolean[] BC00034_n36SFTelefono ;
   private String[] BC00034_A37SFEmail ;
   private boolean[] BC00034_n37SFEmail ;
   private short[] BC00034_A38SFFrascosConC ;
   private boolean[] BC00034_n38SFFrascosConC ;
   private short[] BC00034_A39SFFrascosSinC ;
   private boolean[] BC00034_n39SFFrascosSinC ;
   private short[] BC00034_A167SFFrascosAgua ;
   private boolean[] BC00034_n167SFFrascosAgua ;
   private short[] BC00034_A40SFFrascosSangre ;
   private boolean[] BC00034_n40SFFrascosSangre ;
   private String[] BC00034_A41SFObservaciones ;
   private boolean[] BC00034_n41SFObservaciones ;
   private java.util.Date[] BC00034_A42SFFechaCreacion ;
   private boolean[] BC00034_n42SFFechaCreacion ;
   private java.util.Date[] BC00034_A43SFFechaModificado ;
   private boolean[] BC00034_n43SFFechaModificado ;
   private short[] BC00034_A44SFFrascosIsopo ;
   private boolean[] BC00034_n44SFFrascosIsopo ;
   private long[] BC00035_A3SFId ;
   private long[] BC00035_A32SFIdNet ;
   private boolean[] BC00035_n32SFIdNet ;
   private String[] BC00035_A33SFNombre ;
   private boolean[] BC00035_n33SFNombre ;
   private String[] BC00035_A34SFDireccion ;
   private boolean[] BC00035_n34SFDireccion ;
   private short[] BC00035_A35SFAgencia ;
   private boolean[] BC00035_n35SFAgencia ;
   private String[] BC00035_A36SFTelefono ;
   private boolean[] BC00035_n36SFTelefono ;
   private String[] BC00035_A37SFEmail ;
   private boolean[] BC00035_n37SFEmail ;
   private short[] BC00035_A38SFFrascosConC ;
   private boolean[] BC00035_n38SFFrascosConC ;
   private short[] BC00035_A39SFFrascosSinC ;
   private boolean[] BC00035_n39SFFrascosSinC ;
   private short[] BC00035_A167SFFrascosAgua ;
   private boolean[] BC00035_n167SFFrascosAgua ;
   private short[] BC00035_A40SFFrascosSangre ;
   private boolean[] BC00035_n40SFFrascosSangre ;
   private String[] BC00035_A41SFObservaciones ;
   private boolean[] BC00035_n41SFObservaciones ;
   private java.util.Date[] BC00035_A42SFFechaCreacion ;
   private boolean[] BC00035_n42SFFechaCreacion ;
   private java.util.Date[] BC00035_A43SFFechaModificado ;
   private boolean[] BC00035_n43SFFechaModificado ;
   private short[] BC00035_A44SFFrascosIsopo ;
   private boolean[] BC00035_n44SFFrascosIsopo ;
   private long[] BC00036_A3SFId ;
   private long[] BC00037_A3SFId ;
   private long[] BC00037_A32SFIdNet ;
   private boolean[] BC00037_n32SFIdNet ;
   private String[] BC00037_A33SFNombre ;
   private boolean[] BC00037_n33SFNombre ;
   private String[] BC00037_A34SFDireccion ;
   private boolean[] BC00037_n34SFDireccion ;
   private short[] BC00037_A35SFAgencia ;
   private boolean[] BC00037_n35SFAgencia ;
   private String[] BC00037_A36SFTelefono ;
   private boolean[] BC00037_n36SFTelefono ;
   private String[] BC00037_A37SFEmail ;
   private boolean[] BC00037_n37SFEmail ;
   private short[] BC00037_A38SFFrascosConC ;
   private boolean[] BC00037_n38SFFrascosConC ;
   private short[] BC00037_A39SFFrascosSinC ;
   private boolean[] BC00037_n39SFFrascosSinC ;
   private short[] BC00037_A167SFFrascosAgua ;
   private boolean[] BC00037_n167SFFrascosAgua ;
   private short[] BC00037_A40SFFrascosSangre ;
   private boolean[] BC00037_n40SFFrascosSangre ;
   private String[] BC00037_A41SFObservaciones ;
   private boolean[] BC00037_n41SFObservaciones ;
   private java.util.Date[] BC00037_A42SFFechaCreacion ;
   private boolean[] BC00037_n42SFFechaCreacion ;
   private java.util.Date[] BC00037_A43SFFechaModificado ;
   private boolean[] BC00037_n43SFFechaModificado ;
   private short[] BC00037_A44SFFrascosIsopo ;
   private boolean[] BC00037_n44SFFrascosIsopo ;
   private long[] BC00038_A3SFId ;
   private long[] BC00038_A32SFIdNet ;
   private boolean[] BC00038_n32SFIdNet ;
   private String[] BC00038_A33SFNombre ;
   private boolean[] BC00038_n33SFNombre ;
   private String[] BC00038_A34SFDireccion ;
   private boolean[] BC00038_n34SFDireccion ;
   private short[] BC00038_A35SFAgencia ;
   private boolean[] BC00038_n35SFAgencia ;
   private String[] BC00038_A36SFTelefono ;
   private boolean[] BC00038_n36SFTelefono ;
   private String[] BC00038_A37SFEmail ;
   private boolean[] BC00038_n37SFEmail ;
   private short[] BC00038_A38SFFrascosConC ;
   private boolean[] BC00038_n38SFFrascosConC ;
   private short[] BC00038_A39SFFrascosSinC ;
   private boolean[] BC00038_n39SFFrascosSinC ;
   private short[] BC00038_A167SFFrascosAgua ;
   private boolean[] BC00038_n167SFFrascosAgua ;
   private short[] BC00038_A40SFFrascosSangre ;
   private boolean[] BC00038_n40SFFrascosSangre ;
   private String[] BC00038_A41SFObservaciones ;
   private boolean[] BC00038_n41SFObservaciones ;
   private java.util.Date[] BC00038_A42SFFechaCreacion ;
   private boolean[] BC00038_n42SFFechaCreacion ;
   private java.util.Date[] BC00038_A43SFFechaModificado ;
   private boolean[] BC00038_n43SFFechaModificado ;
   private short[] BC00038_A44SFFrascosIsopo ;
   private boolean[] BC00038_n44SFFrascosIsopo ;
   private long[] BC000312_A3SFId ;
   private long[] BC000312_A32SFIdNet ;
   private boolean[] BC000312_n32SFIdNet ;
   private String[] BC000312_A33SFNombre ;
   private boolean[] BC000312_n33SFNombre ;
   private String[] BC000312_A34SFDireccion ;
   private boolean[] BC000312_n34SFDireccion ;
   private short[] BC000312_A35SFAgencia ;
   private boolean[] BC000312_n35SFAgencia ;
   private String[] BC000312_A36SFTelefono ;
   private boolean[] BC000312_n36SFTelefono ;
   private String[] BC000312_A37SFEmail ;
   private boolean[] BC000312_n37SFEmail ;
   private short[] BC000312_A38SFFrascosConC ;
   private boolean[] BC000312_n38SFFrascosConC ;
   private short[] BC000312_A39SFFrascosSinC ;
   private boolean[] BC000312_n39SFFrascosSinC ;
   private short[] BC000312_A167SFFrascosAgua ;
   private boolean[] BC000312_n167SFFrascosAgua ;
   private short[] BC000312_A40SFFrascosSangre ;
   private boolean[] BC000312_n40SFFrascosSangre ;
   private String[] BC000312_A41SFObservaciones ;
   private boolean[] BC000312_n41SFObservaciones ;
   private java.util.Date[] BC000312_A42SFFechaCreacion ;
   private boolean[] BC000312_n42SFFechaCreacion ;
   private java.util.Date[] BC000312_A43SFFechaModificado ;
   private boolean[] BC000312_n43SFFechaModificado ;
   private short[] BC000312_A44SFFrascosIsopo ;
   private boolean[] BC000312_n44SFFrascosIsopo ;
   private IDataStoreProvider pr_gam ;
   private long[] BC00032_A3SFId ;
   private long[] BC00032_A32SFIdNet ;
   private String[] BC00032_A33SFNombre ;
   private String[] BC00032_A34SFDireccion ;
   private short[] BC00032_A35SFAgencia ;
   private String[] BC00032_A36SFTelefono ;
   private String[] BC00032_A37SFEmail ;
   private short[] BC00032_A38SFFrascosConC ;
   private short[] BC00032_A39SFFrascosSinC ;
   private short[] BC00032_A167SFFrascosAgua ;
   private short[] BC00032_A40SFFrascosSangre ;
   private String[] BC00032_A41SFObservaciones ;
   private java.util.Date[] BC00032_A42SFFechaCreacion ;
   private java.util.Date[] BC00032_A43SFFechaModificado ;
   private short[] BC00032_A44SFFrascosIsopo ;
   private long[] BC00033_A3SFId ;
   private long[] BC00033_A32SFIdNet ;
   private String[] BC00033_A33SFNombre ;
   private String[] BC00033_A34SFDireccion ;
   private short[] BC00033_A35SFAgencia ;
   private String[] BC00033_A36SFTelefono ;
   private String[] BC00033_A37SFEmail ;
   private short[] BC00033_A38SFFrascosConC ;
   private short[] BC00033_A39SFFrascosSinC ;
   private short[] BC00033_A167SFFrascosAgua ;
   private short[] BC00033_A40SFFrascosSangre ;
   private String[] BC00033_A41SFObservaciones ;
   private java.util.Date[] BC00033_A42SFFechaCreacion ;
   private java.util.Date[] BC00033_A43SFFechaModificado ;
   private short[] BC00033_A44SFFrascosIsopo ;
   private boolean[] BC00032_n32SFIdNet ;
   private boolean[] BC00032_n33SFNombre ;
   private boolean[] BC00032_n34SFDireccion ;
   private boolean[] BC00032_n35SFAgencia ;
   private boolean[] BC00032_n36SFTelefono ;
   private boolean[] BC00032_n37SFEmail ;
   private boolean[] BC00032_n38SFFrascosConC ;
   private boolean[] BC00032_n39SFFrascosSinC ;
   private boolean[] BC00032_n167SFFrascosAgua ;
   private boolean[] BC00032_n40SFFrascosSangre ;
   private boolean[] BC00032_n41SFObservaciones ;
   private boolean[] BC00032_n42SFFechaCreacion ;
   private boolean[] BC00032_n43SFFechaModificado ;
   private boolean[] BC00032_n44SFFrascosIsopo ;
   private boolean[] BC00033_n32SFIdNet ;
   private boolean[] BC00033_n33SFNombre ;
   private boolean[] BC00033_n34SFDireccion ;
   private boolean[] BC00033_n35SFAgencia ;
   private boolean[] BC00033_n36SFTelefono ;
   private boolean[] BC00033_n37SFEmail ;
   private boolean[] BC00033_n38SFFrascosConC ;
   private boolean[] BC00033_n39SFFrascosSinC ;
   private boolean[] BC00033_n167SFFrascosAgua ;
   private boolean[] BC00033_n40SFFrascosSangre ;
   private boolean[] BC00033_n41SFObservaciones ;
   private boolean[] BC00033_n42SFFechaCreacion ;
   private boolean[] BC00033_n43SFFechaModificado ;
   private boolean[] BC00033_n44SFFrascosIsopo ;
}

final  class solicitudfrasco_bc__gam extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class solicitudfrasco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00032", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00033", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00034", "SELECT TM1.`SFId`, TM1.`SFIdNet`, TM1.`SFNombre`, TM1.`SFDireccion`, TM1.`SFAgencia`, TM1.`SFTelefono`, TM1.`SFEmail`, TM1.`SFFrascosConC`, TM1.`SFFrascosSinC`, TM1.`SFFrascosAgua`, TM1.`SFFrascosSangre`, TM1.`SFObservaciones`, TM1.`SFFechaCreacion`, TM1.`SFFechaModificado`, TM1.`SFFrascosIsopo` FROM `SolicitudFrasco` TM1 ORDER BY TM1.`SFId`  LIMIT ?, ?",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00035", "SELECT TM1.`SFId`, TM1.`SFIdNet`, TM1.`SFNombre`, TM1.`SFDireccion`, TM1.`SFAgencia`, TM1.`SFTelefono`, TM1.`SFEmail`, TM1.`SFFrascosConC`, TM1.`SFFrascosSinC`, TM1.`SFFrascosAgua`, TM1.`SFFrascosSangre`, TM1.`SFObservaciones`, TM1.`SFFechaCreacion`, TM1.`SFFechaModificado`, TM1.`SFFrascosIsopo` FROM `SolicitudFrasco` TM1 WHERE TM1.`SFId` = ? ORDER BY TM1.`SFId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00036", "SELECT `SFId` FROM `SolicitudFrasco` WHERE `SFId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00037", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00038", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00039", "INSERT INTO `SolicitudFrasco`(`SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000310", "UPDATE `SolicitudFrasco` SET `SFIdNet`=?, `SFNombre`=?, `SFDireccion`=?, `SFAgencia`=?, `SFTelefono`=?, `SFEmail`=?, `SFFrascosConC`=?, `SFFrascosSinC`=?, `SFFrascosAgua`=?, `SFFrascosSangre`=?, `SFObservaciones`=?, `SFFechaCreacion`=?, `SFFechaModificado`=?, `SFFrascosIsopo`=?  WHERE `SFId` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000311", "DELETE FROM `SolicitudFrasco`  WHERE `SFId` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000312", "SELECT TM1.`SFId`, TM1.`SFIdNet`, TM1.`SFNombre`, TM1.`SFDireccion`, TM1.`SFAgencia`, TM1.`SFTelefono`, TM1.`SFEmail`, TM1.`SFFrascosConC`, TM1.`SFFrascosSinC`, TM1.`SFFrascosAgua`, TM1.`SFFrascosSangre`, TM1.`SFObservaciones`, TM1.`SFFechaCreacion`, TM1.`SFFechaModificado`, TM1.`SFFrascosIsopo` FROM `SolicitudFrasco` TM1 WHERE TM1.`SFId` = ? ORDER BY TM1.`SFId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 50);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
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
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 200);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 50);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setLong(15, ((Number) parms[28]).longValue());
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

