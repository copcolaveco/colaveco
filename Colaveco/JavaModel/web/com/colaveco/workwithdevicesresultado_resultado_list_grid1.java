package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesresultado_resultado_list_grid1 extends GXProcedure
{
   public workwithdevicesresultado_resultado_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_list_grid1.class ), "" );
   }

   public workwithdevicesresultado_resultado_list_grid1( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                              long aP1 ,
                                                                                                              String aP2 ,
                                                                                                              java.util.Date aP3 ,
                                                                                                              java.util.Date aP4 ,
                                                                                                              java.util.Date aP5 ,
                                                                                                              java.util.Date aP6 ,
                                                                                                              long aP7 ,
                                                                                                              long aP8 ,
                                                                                                              int aP9 )
   {
      workwithdevicesresultado_resultado_list_grid1.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        long aP7 ,
                        long aP8 ,
                        int aP9 ,
                        GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             long aP7 ,
                             long aP8 ,
                             int aP9 ,
                             GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>[] aP10 )
   {
      workwithdevicesresultado_resultado_list_grid1.this.AV7ExternalId = aP0;
      workwithdevicesresultado_resultado_list_grid1.this.AV8TipoinformeId = aP1;
      workwithdevicesresultado_resultado_list_grid1.this.AV25SearchText = aP2;
      workwithdevicesresultado_resultado_list_grid1.this.AV16cresultadoFechaCreadoFrom = aP3;
      workwithdevicesresultado_resultado_list_grid1.this.AV17cresultadoFechaCreadoTo = aP4;
      workwithdevicesresultado_resultado_list_grid1.this.AV18cresultadoFechaEmisionFrom = aP5;
      workwithdevicesresultado_resultado_list_grid1.this.AV19cresultadoFechaEmisionTo = aP6;
      workwithdevicesresultado_resultado_list_grid1.this.AV23start = aP7;
      workwithdevicesresultado_resultado_list_grid1.this.AV24count = aP8;
      workwithdevicesresultado_resultado_list_grid1.this.AV20gxid = aP9;
      workwithdevicesresultado_resultado_list_grid1.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV20gxid, 8, 0) ;
      AV30Imagen_GXI = (Gxwebsession.getValue(Gxids+"gxvar_Imagen")) ;
      AV6imagen = "" ;
      AV5estado = Gxwebsession.getValue(Gxids+"gxvar_Estado") ;
      AV14TipoinformeNombre = Gxwebsession.getValue(Gxids+"gxvar_Tipoinformenombre") ;
      GXPagingFrom2 = (int)(AV23start) ;
      GXPagingTo2 = (int)(((AV24count>0) ? AV24count : 100000000)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV8TipoinformeId) ,
                                           AV25SearchText ,
                                           AV16cresultadoFechaCreadoFrom ,
                                           AV17cresultadoFechaCreadoTo ,
                                           AV18cresultadoFechaEmisionFrom ,
                                           AV19cresultadoFechaEmisionTo ,
                                           Long.valueOf(A166resultadoIdNetTipoinforme) ,
                                           Long.valueOf(A7resultadoFicha) ,
                                           A12resultadoFechaCreado ,
                                           A13resultadoFechaEmision ,
                                           Long.valueOf(A11resultadoIdNetUsuario) ,
                                           Long.valueOf(AV7ExternalId) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV25SearchText = GXutil.concat( GXutil.rtrim( AV25SearchText), "%", "") ;
      lV25SearchText = GXutil.concat( GXutil.rtrim( AV25SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV7ExternalId), Long.valueOf(AV8TipoinformeId), lV25SearchText, lV25SearchText, AV16cresultadoFechaCreadoFrom, AV17cresultadoFechaCreadoTo, AV18cresultadoFechaEmisionFrom, AV19cresultadoFechaEmisionTo, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11resultadoIdNetUsuario = P00002_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = P00002_n11resultadoIdNetUsuario[0] ;
         A13resultadoFechaEmision = P00002_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = P00002_n13resultadoFechaEmision[0] ;
         A12resultadoFechaCreado = P00002_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = P00002_n12resultadoFechaCreado[0] ;
         A7resultadoFicha = P00002_A7resultadoFicha[0] ;
         n7resultadoFicha = P00002_n7resultadoFicha[0] ;
         A166resultadoIdNetTipoinforme = P00002_A166resultadoIdNetTipoinforme[0] ;
         A17resultadoIdEstado = P00002_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = P00002_n17resultadoIdEstado[0] ;
         A1resultadoId = P00002_A1resultadoId[0] ;
         A15resultadoPathPdf = P00002_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = P00002_n15resultadoPathPdf[0] ;
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item(remoteHandle, context);
         AV26GXM2RootCol.add(AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt, 0);
         if ( A166resultadoIdNetTipoinforme == 1 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Control Lechero" ;
         }
         if ( A166resultadoIdNetTipoinforme == 3 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Agua" ;
         }
         if ( A166resultadoIdNetTipoinforme == 4 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Aislamiento y Antibiograma" ;
         }
         if ( A166resultadoIdNetTipoinforme == 5 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "PAL" ;
         }
         if ( A166resultadoIdNetTipoinforme == 6 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Parasitología" ;
         }
         if ( A166resultadoIdNetTipoinforme == 7 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Alimento" ;
         }
         if ( A166resultadoIdNetTipoinforme == 8 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Serología" ;
         }
         if ( A166resultadoIdNetTipoinforme == 9 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Patología" ;
         }
         if ( A166resultadoIdNetTipoinforme == 10 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Calidad de Leche" ;
         }
         if ( A166resultadoIdNetTipoinforme == 11 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Ambiental" ;
         }
         if ( A166resultadoIdNetTipoinforme == 12 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Lactómetro - Chequeos" ;
         }
         if ( A166resultadoIdNetTipoinforme == 13 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Nutrición" ;
         }
         if ( A166resultadoIdNetTipoinforme == 14 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Suelos" ;
         }
         if ( A166resultadoIdNetTipoinforme == 15 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Bruselosis en leche" ;
         }
         if ( A166resultadoIdNetTipoinforme == 16 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Efluentes" ;
         }
         if ( A166resultadoIdNetTipoinforme == 17 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Bacteriología de tanque" ;
         }
         if ( A166resultadoIdNetTipoinforme == 18 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Bacteriología clínica aeróbica" ;
         }
         if ( A166resultadoIdNetTipoinforme == 19 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Foliares" ;
         }
         if ( A166resultadoIdNetTipoinforme == 99 )
         {
            AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV14TipoinformeNombre = "Control Lechero" ;
         }
         if ( A17resultadoIdEstado == 1 )
         {
            AV5estado = "En proceso" ;
         }
         if ( A17resultadoIdEstado == 2 )
         {
            AV5estado = "Pendiente de aceptación" ;
         }
         if ( A17resultadoIdEstado == 3 )
         {
            AV5estado = "Finalizado" ;
         }
         if ( A17resultadoIdEstado == 4 )
         {
            AV5estado = "No aceptado" ;
         }
         if ( A17resultadoIdEstado == 5 )
         {
            AV5estado = "Finalizado" ;
         }
         if ( A17resultadoIdEstado == 6 )
         {
            AV5estado = "Finalizado" ;
         }
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( A1resultadoId );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( A7resultadoFicha );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( A12resultadoFechaCreado );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadopathpdf( A15resultadoPathPdf );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen( AV6imagen );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi( AV30Imagen_GXI );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado( AV5estado );
         AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Tipoinformenombre( AV14TipoinformeNombre );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV30Imagen_GXI);
      Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado);
      Gxwebsession.setValue(Gxids+"gxvar_Tipoinformenombre", AV14TipoinformeNombre);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP10[0] = workwithdevicesresultado_resultado_list_grid1.this.AV26GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item.class, "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV30Imagen_GXI = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV6imagen = "" ;
      AV5estado = "" ;
      AV14TipoinformeNombre = "" ;
      scmdbuf = "" ;
      lV25SearchText = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      P00002_A11resultadoIdNetUsuario = new long[1] ;
      P00002_n11resultadoIdNetUsuario = new boolean[] {false} ;
      P00002_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n13resultadoFechaEmision = new boolean[] {false} ;
      P00002_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n12resultadoFechaCreado = new boolean[] {false} ;
      P00002_A7resultadoFicha = new long[1] ;
      P00002_n7resultadoFicha = new boolean[] {false} ;
      P00002_A166resultadoIdNetTipoinforme = new long[1] ;
      P00002_A17resultadoIdEstado = new long[1] ;
      P00002_n17resultadoIdEstado = new boolean[] {false} ;
      P00002_A1resultadoId = new long[1] ;
      P00002_A15resultadoPathPdf = new String[] {""} ;
      P00002_n15resultadoPathPdf = new boolean[] {false} ;
      A15resultadoPathPdf = "" ;
      AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesresultado_resultado_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A11resultadoIdNetUsuario, P00002_n11resultadoIdNetUsuario, P00002_A13resultadoFechaEmision, P00002_n13resultadoFechaEmision, P00002_A12resultadoFechaCreado, P00002_n12resultadoFechaCreado, P00002_A7resultadoFicha, P00002_n7resultadoFicha, P00002_A166resultadoIdNetTipoinforme, P00002_A17resultadoIdEstado,
            P00002_n17resultadoIdEstado, P00002_A1resultadoId, P00002_A15resultadoPathPdf, P00002_n15resultadoPathPdf
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV20gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV7ExternalId ;
   private long AV8TipoinformeId ;
   private long AV23start ;
   private long AV24count ;
   private long A166resultadoIdNetTipoinforme ;
   private long A7resultadoFicha ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A1resultadoId ;
   private String Gxids ;
   private String scmdbuf ;
   private java.util.Date AV16cresultadoFechaCreadoFrom ;
   private java.util.Date AV17cresultadoFechaCreadoTo ;
   private java.util.Date AV18cresultadoFechaEmisionFrom ;
   private java.util.Date AV19cresultadoFechaEmisionTo ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n13resultadoFechaEmision ;
   private boolean n12resultadoFechaCreado ;
   private boolean n7resultadoFicha ;
   private boolean n17resultadoIdEstado ;
   private boolean n15resultadoPathPdf ;
   private String AV25SearchText ;
   private String AV30Imagen_GXI ;
   private String AV5estado ;
   private String AV14TipoinformeNombre ;
   private String lV25SearchText ;
   private String A15resultadoPathPdf ;
   private String AV6imagen ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>[] aP10 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A11resultadoIdNetUsuario ;
   private boolean[] P00002_n11resultadoIdNetUsuario ;
   private java.util.Date[] P00002_A13resultadoFechaEmision ;
   private boolean[] P00002_n13resultadoFechaEmision ;
   private java.util.Date[] P00002_A12resultadoFechaCreado ;
   private boolean[] P00002_n12resultadoFechaCreado ;
   private long[] P00002_A7resultadoFicha ;
   private boolean[] P00002_n7resultadoFicha ;
   private long[] P00002_A166resultadoIdNetTipoinforme ;
   private long[] P00002_A17resultadoIdEstado ;
   private boolean[] P00002_n17resultadoIdEstado ;
   private long[] P00002_A1resultadoId ;
   private String[] P00002_A15resultadoPathPdf ;
   private boolean[] P00002_n15resultadoPathPdf ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item> AV26GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item AV27GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt ;
}

final  class workwithdevicesresultado_resultado_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV8TipoinformeId ,
                                          String AV25SearchText ,
                                          java.util.Date AV16cresultadoFechaCreadoFrom ,
                                          java.util.Date AV17cresultadoFechaCreadoTo ,
                                          java.util.Date AV18cresultadoFechaEmisionFrom ,
                                          java.util.Date AV19cresultadoFechaEmisionTo ,
                                          long A166resultadoIdNetTipoinforme ,
                                          long A7resultadoFicha ,
                                          java.util.Date A12resultadoFechaCreado ,
                                          java.util.Date A13resultadoFechaEmision ,
                                          long A11resultadoIdNetUsuario ,
                                          long AV7ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[10];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `resultadoIdNetUsuario`, `resultadoFechaEmision`, `resultadoFechaCreado`, `resultadoFicha`, `resultadoIdNetTipoinforme`, `resultadoIdEstado`, `resultadoId`, `resultadoPathPdf`" ;
      sFromString = " FROM `Resultado`" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(`resultadoIdNetUsuario` = ?)");
      if ( AV8TipoinformeId != 0 )
      {
         addWhere(sWhereString, "(`resultadoIdNetTipoinforme` = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER((LPAD(REPLACE(FORMAT(`resultadoFicha`,0), ',', ''), 18, ' '))) like CONCAT('%', UPPER(?)) or UPPER((LPAD(REPLACE(FORMAT(`resultadoIdNetTipoinforme`,0), ',', ''), 18, ' '))) like CONCAT('%', UPPER(?)))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16cresultadoFechaCreadoFrom)) )
      {
         addWhere(sWhereString, "(`resultadoFechaCreado` >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17cresultadoFechaCreadoTo)) )
      {
         addWhere(sWhereString, "(`resultadoFechaCreado` <= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18cresultadoFechaEmisionFrom)) )
      {
         addWhere(sWhereString, "(`resultadoFechaEmision` >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19cresultadoFechaEmisionTo)) )
      {
         addWhere(sWhereString, "(`resultadoFechaEmision` <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `resultadoFicha` DESC" ;
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
                  return conditional_P00002(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() );
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 1000);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 1000);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
      }
   }

}

