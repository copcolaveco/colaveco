/*
               File: WorkWithDevicesResultado_Resultado_List_Grid1
        Description: WorkWithDevicesResultado_Resultado_List_Grid1
             Author: GeneXus Android Generator version 17_0_7-156546
       Generated on: November 14, 2022 8:16:54.65
       Program type: Callable routine
          Main DBMS: SQLite
*/
package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.genexus.db.*;
import java.sql.*;
import com.artech.base.services.*;

public final  class workwithdevicesresultado_resultado_list_grid1 extends GXProcedure implements IGxProcedure
{
   public boolean execute( IPropertiesObject androidPropertiesObject )
   {

      long aP0 = 0;
      long aP1 = 0;
      String aP2 = "";
      java.util.Date aP3 = GXutil.nullDate();
      java.util.Date aP4 = GXutil.nullDate();
      java.util.Date aP5 = GXutil.nullDate();
      java.util.Date aP6 = GXutil.nullDate();
      long aP7 = 0;
      long aP8 = 0;
      int aP9 = 0;
      GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>[] aP10 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item.class, "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle)};

      aP0 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("ExternalId"));
      aP1 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("TipoinformeId"));
      aP2 = (String) androidPropertiesObject.optStringProperty("SearchText");
      aP3 = (java.util.Date) GXutil.charToDateREST( androidPropertiesObject.optStringProperty("cresultadoFechaCreadoFrom"));
      aP4 = (java.util.Date) GXutil.charToDateREST( androidPropertiesObject.optStringProperty("cresultadoFechaCreadoTo"));
      aP5 = (java.util.Date) GXutil.charToDateREST( androidPropertiesObject.optStringProperty("cresultadoFechaEmisionFrom"));
      aP6 = (java.util.Date) GXutil.charToDateREST( androidPropertiesObject.optStringProperty("cresultadoFechaEmisionTo"));
      aP7 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("start"));
      aP8 = (long) GXutil.lval( androidPropertiesObject.optStringProperty("count"));
      aP9 = (int) GXutil.lval( androidPropertiesObject.optStringProperty("gxid"));

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);

      IEntityList outObjGXM2RootCol = AndroidContext.ApplicationContext.createEntityList();
      if (aP10[0] != null)
      {
         for (int i = 0; i < aP10[0].size(); i++)
         {
            com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item sdttyped = (com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item) aP10[0].elementAt(i);
            IEntity objOutElement = AndroidContext.ApplicationContext.createEntity("", "WorkWithDevicesResultado_Resultado_List_Grid1", null, outObjGXM2RootCol);
            sdttyped.sdttoentity(objOutElement);
            outObjGXM2RootCol.add(objOutElement);
         }
      }
      androidPropertiesObject.setProperty("Gx_Output",outObjGXM2RootCol);


      return true ;
   }

   public workwithdevicesresultado_resultado_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesresultado_resultado_list_grid1.class ), "" );
   }

   public workwithdevicesresultado_resultado_list_grid1( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

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
      workwithdevicesresultado_resultado_list_grid1.this.AV7ExternalId = aP0;
      workwithdevicesresultado_resultado_list_grid1.this.AV8TipoinformeId = aP1;
      workwithdevicesresultado_resultado_list_grid1.this.AV22SearchText = aP2;
      workwithdevicesresultado_resultado_list_grid1.this.AV13cresultadoFechaCreadoFrom = aP3;
      workwithdevicesresultado_resultado_list_grid1.this.AV14cresultadoFechaCreadoTo = aP4;
      workwithdevicesresultado_resultado_list_grid1.this.AV15cresultadoFechaEmisionFrom = aP5;
      workwithdevicesresultado_resultado_list_grid1.this.AV16cresultadoFechaEmisionTo = aP6;
      workwithdevicesresultado_resultado_list_grid1.this.AV20start = aP7;
      workwithdevicesresultado_resultado_list_grid1.this.AV21count = aP8;
      workwithdevicesresultado_resultado_list_grid1.this.AV17gxid = aP9;
      workwithdevicesresultado_resultado_list_grid1.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>()};
      initialize();
      privateExecute();
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
      workwithdevicesresultado_resultado_list_grid1.this.AV22SearchText = aP2;
      workwithdevicesresultado_resultado_list_grid1.this.AV13cresultadoFechaCreadoFrom = aP3;
      workwithdevicesresultado_resultado_list_grid1.this.AV14cresultadoFechaCreadoTo = aP4;
      workwithdevicesresultado_resultado_list_grid1.this.AV15cresultadoFechaEmisionFrom = aP5;
      workwithdevicesresultado_resultado_list_grid1.this.AV16cresultadoFechaEmisionTo = aP6;
      workwithdevicesresultado_resultado_list_grid1.this.AV20start = aP7;
      workwithdevicesresultado_resultado_list_grid1.this.AV21count = aP8;
      workwithdevicesresultado_resultado_list_grid1.this.AV17gxid = aP9;
      workwithdevicesresultado_resultado_list_grid1.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV17gxid, 8, 0) ;
      AV27Imagen_GXI = (Gxwebsession.getValue(Gxids+"gxvar_Imagen")) ;
      AV6imagen = "" ;
      AV5estado = Gxwebsession.getValue(Gxids+"gxvar_Estado") ;
      GXPagingIdx2 = 0 ;
      GXPagingFrom2 = (int)(AV20start) ;
      GXPagingTo2 = (int)(AV20start+AV21count) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           new Long(AV8TipoinformeId) ,
                                           AV22SearchText ,
                                           AV13cresultadoFechaCreadoFrom ,
                                           AV14cresultadoFechaCreadoTo ,
                                           AV15cresultadoFechaEmisionFrom ,
                                           AV16cresultadoFechaEmisionTo ,
                                           new Long(A166resultadoIdNetTipoinforme) ,
                                           A8resultadoComentarios ,
                                           A14resultadoPathExcel ,
                                           A15resultadoPathPdf ,
                                           A16resultadoPathCsv ,
                                           A12resultadoFechaCreado ,
                                           A13resultadoFechaEmision ,
                                           new Long(A11resultadoIdNetUsuario) ,
                                           new Long(AV7ExternalId) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                           TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      });
      lV22SearchText = GXutil.concat( GXutil.rtrim( AV22SearchText), "%", "") ;
      lV22SearchText = GXutil.concat( GXutil.rtrim( AV22SearchText), "%", "") ;
      lV22SearchText = GXutil.concat( GXutil.rtrim( AV22SearchText), "%", "") ;
      lV22SearchText = GXutil.concat( GXutil.rtrim( AV22SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {new Long(AV7ExternalId), new Long(AV8TipoinformeId), lV22SearchText, lV22SearchText, lV22SearchText, lV22SearchText, AV13cresultadoFechaCreadoFrom, AV14cresultadoFechaCreadoTo, AV15cresultadoFechaEmisionFrom, AV16cresultadoFechaEmisionTo});
      while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GXPagingTo2 == GXPagingFrom2 ) || ( GXPagingIdx2 < GXPagingTo2 ) ) )
      {
         A11resultadoIdNetUsuario = P00002_A11resultadoIdNetUsuario[0] ;
         n11resultadoIdNetUsuario = P00002_n11resultadoIdNetUsuario[0] ;
         A13resultadoFechaEmision = P00002_A13resultadoFechaEmision[0] ;
         n13resultadoFechaEmision = P00002_n13resultadoFechaEmision[0] ;
         A12resultadoFechaCreado = P00002_A12resultadoFechaCreado[0] ;
         n12resultadoFechaCreado = P00002_n12resultadoFechaCreado[0] ;
         A8resultadoComentarios = P00002_A8resultadoComentarios[0] ;
         n8resultadoComentarios = P00002_n8resultadoComentarios[0] ;
         A14resultadoPathExcel = P00002_A14resultadoPathExcel[0] ;
         n14resultadoPathExcel = P00002_n14resultadoPathExcel[0] ;
         A15resultadoPathPdf = P00002_A15resultadoPathPdf[0] ;
         n15resultadoPathPdf = P00002_n15resultadoPathPdf[0] ;
         A16resultadoPathCsv = P00002_A16resultadoPathCsv[0] ;
         n16resultadoPathCsv = P00002_n16resultadoPathCsv[0] ;
         A166resultadoIdNetTipoinforme = P00002_A166resultadoIdNetTipoinforme[0] ;
         A17resultadoIdEstado = P00002_A17resultadoIdEstado[0] ;
         n17resultadoIdEstado = P00002_n17resultadoIdEstado[0] ;
         A1resultadoId = P00002_A1resultadoId[0] ;
         A7resultadoFicha = P00002_A7resultadoFicha[0] ;
         n7resultadoFicha = P00002_n7resultadoFicha[0] ;
         GXPagingIdx2 = (int)(GXPagingIdx2+1) ;
         if ( GXPagingIdx2 > GXPagingFrom2 )
         {
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item(remoteHandle, context);
            AV23GXM2RootCol.add(AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt, 0);
            if ( A166resultadoIdNetTipoinforme == 1 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 3 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 4 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 6 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 7 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 8 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 9 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 10 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 11 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 13 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 14 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 15 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 16 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            }
            if ( A166resultadoIdNetTipoinforme == 99 )
            {
               AV6imagen = context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) ;
               AV27Imagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoid( A1resultadoId );
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadofechacreado( A12resultadoFechaCreado );
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Resultadoficha( A7resultadoFicha );
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen( AV6imagen );
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Imagen_gxi( AV27Imagen_GXI );
            AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item_Estado( AV5estado );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Imagen", AV27Imagen_GXI);
      Gxwebsession.setValue(Gxids+"gxvar_Estado", AV5estado);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP10[0] = workwithdevicesresultado_resultado_list_grid1.this.AV23GXM2RootCol;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item.class, "WorkWithDevicesResultado_Resultado_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV27Imagen_GXI = "" ;
      Gxwebsession = AndroidContext.ApplicationContext.getAndroidSession();
      AV6imagen = "" ;
      AV5estado = "" ;
      scmdbuf = "" ;
      lV22SearchText = "" ;
      A8resultadoComentarios = "" ;
      A14resultadoPathExcel = "" ;
      A15resultadoPathPdf = "" ;
      A16resultadoPathCsv = "" ;
      A12resultadoFechaCreado = GXutil.nullDate() ;
      A13resultadoFechaEmision = GXutil.nullDate() ;
      P00002_A11resultadoIdNetUsuario = new long[1] ;
      P00002_n11resultadoIdNetUsuario = new boolean[] {false} ;
      P00002_A13resultadoFechaEmision = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n13resultadoFechaEmision = new boolean[] {false} ;
      P00002_A12resultadoFechaCreado = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n12resultadoFechaCreado = new boolean[] {false} ;
      P00002_A8resultadoComentarios = new String[] {""} ;
      P00002_n8resultadoComentarios = new boolean[] {false} ;
      P00002_A14resultadoPathExcel = new String[] {""} ;
      P00002_n14resultadoPathExcel = new boolean[] {false} ;
      P00002_A15resultadoPathPdf = new String[] {""} ;
      P00002_n15resultadoPathPdf = new boolean[] {false} ;
      P00002_A16resultadoPathCsv = new String[] {""} ;
      P00002_n16resultadoPathCsv = new boolean[] {false} ;
      P00002_A166resultadoIdNetTipoinforme = new long[1] ;
      P00002_A17resultadoIdEstado = new long[1] ;
      P00002_n17resultadoIdEstado = new boolean[] {false} ;
      P00002_A1resultadoId = new long[1] ;
      P00002_A7resultadoFicha = new long[1] ;
      P00002_n7resultadoFicha = new boolean[] {false} ;
      AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesresultado_resultado_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A11resultadoIdNetUsuario, P00002_n11resultadoIdNetUsuario, P00002_A13resultadoFechaEmision, P00002_n13resultadoFechaEmision, P00002_A12resultadoFechaCreado, P00002_n12resultadoFechaCreado, P00002_A8resultadoComentarios, P00002_n8resultadoComentarios, P00002_A14resultadoPathExcel, P00002_n14resultadoPathExcel,
            P00002_A15resultadoPathPdf, P00002_n15resultadoPathPdf, P00002_A16resultadoPathCsv, P00002_n16resultadoPathCsv, P00002_A166resultadoIdNetTipoinforme, P00002_A17resultadoIdEstado, P00002_n17resultadoIdEstado, P00002_A1resultadoId, P00002_A7resultadoFicha, P00002_n7resultadoFicha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV17gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXPagingIdx2 ;
   private long AV7ExternalId ;
   private long AV8TipoinformeId ;
   private long AV20start ;
   private long AV21count ;
   private long A166resultadoIdNetTipoinforme ;
   private long A11resultadoIdNetUsuario ;
   private long A17resultadoIdEstado ;
   private long A1resultadoId ;
   private long A7resultadoFicha ;
   private String Gxids ;
   private String scmdbuf ;
   private java.util.Date AV13cresultadoFechaCreadoFrom ;
   private java.util.Date AV14cresultadoFechaCreadoTo ;
   private java.util.Date AV15cresultadoFechaEmisionFrom ;
   private java.util.Date AV16cresultadoFechaEmisionTo ;
   private java.util.Date A12resultadoFechaCreado ;
   private java.util.Date A13resultadoFechaEmision ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n13resultadoFechaEmision ;
   private boolean n12resultadoFechaCreado ;
   private boolean n8resultadoComentarios ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean n17resultadoIdEstado ;
   private boolean n7resultadoFicha ;
   private String AV22SearchText ;
   private String AV27Imagen_GXI ;
   private String AV5estado ;
   private String lV22SearchText ;
   private String A8resultadoComentarios ;
   private String A14resultadoPathExcel ;
   private String A15resultadoPathPdf ;
   private String A16resultadoPathCsv ;
   private String AV6imagen ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item>[] aP10 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A11resultadoIdNetUsuario ;
   private boolean[] P00002_n11resultadoIdNetUsuario ;
   private java.util.Date[] P00002_A13resultadoFechaEmision ;
   private boolean[] P00002_n13resultadoFechaEmision ;
   private java.util.Date[] P00002_A12resultadoFechaCreado ;
   private boolean[] P00002_n12resultadoFechaCreado ;
   private String[] P00002_A8resultadoComentarios ;
   private boolean[] P00002_n8resultadoComentarios ;
   private String[] P00002_A14resultadoPathExcel ;
   private boolean[] P00002_n14resultadoPathExcel ;
   private String[] P00002_A15resultadoPathPdf ;
   private boolean[] P00002_n15resultadoPathPdf ;
   private String[] P00002_A16resultadoPathCsv ;
   private boolean[] P00002_n16resultadoPathCsv ;
   private long[] P00002_A166resultadoIdNetTipoinforme ;
   private long[] P00002_A17resultadoIdEstado ;
   private boolean[] P00002_n17resultadoIdEstado ;
   private long[] P00002_A1resultadoId ;
   private long[] P00002_A7resultadoFicha ;
   private boolean[] P00002_n7resultadoFicha ;
   private com.artech.base.services.IAndroidSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item> AV23GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesResultado_Resultado_List_Grid1Sdt_Item AV24GXM1WorkWithDevicesResultado_Resultado_List_Grid1Sdt ;
}

final  class workwithdevicesresultado_resultado_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV8TipoinformeId ,
                                          String AV22SearchText ,
                                          java.util.Date AV13cresultadoFechaCreadoFrom ,
                                          java.util.Date AV14cresultadoFechaCreadoTo ,
                                          java.util.Date AV15cresultadoFechaEmisionFrom ,
                                          java.util.Date AV16cresultadoFechaEmisionTo ,
                                          long A166resultadoIdNetTipoinforme ,
                                          String A8resultadoComentarios ,
                                          String A14resultadoPathExcel ,
                                          String A15resultadoPathPdf ,
                                          String A16resultadoPathCsv ,
                                          java.util.Date A12resultadoFechaCreado ,
                                          java.util.Date A13resultadoFechaEmision ,
                                          long A11resultadoIdNetUsuario ,
                                          long AV7ExternalId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[10];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT [resultadoIdNetUsuario], [resultadoFechaEmision], [resultadoFechaCreado], [resultadoComentarios], [resultadoPathExcel], [resultadoPathPdf], [resultadoPathCsv]," ;
      scmdbuf += " [resultadoIdNetTipoinforme], [resultadoIdEstado], [resultadoId], [resultadoFicha] FROM [Resultado]" ;
      addWhere(sWhereString, "([resultadoIdNetUsuario] = ?)");
      if ( AV8TipoinformeId != 0 )
      {
         addWhere(sWhereString, "([resultadoIdNetTipoinforme] = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER([resultadoComentarios]) like '%' || UPPER(?) or UPPER([resultadoPathExcel]) like '%' || UPPER(?) or UPPER([resultadoPathPdf]) like '%' || UPPER(?) or UPPER([resultadoPathCsv]) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
         GXv_int1[4] = (byte)(1) ;
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13cresultadoFechaCreadoFrom)) )
      {
         addWhere(sWhereString, "([resultadoFechaCreado] >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14cresultadoFechaCreadoTo)) )
      {
         addWhere(sWhereString, "([resultadoFechaCreado] <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15cresultadoFechaEmisionFrom)) )
      {
         addWhere(sWhereString, "([resultadoFechaEmision] >= ?)");
      }
      else
      {
         GXv_int1[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16cresultadoFechaEmisionTo)) )
      {
         addWhere(sWhereString, "([resultadoFechaEmision] <= ?)");
      }
      else
      {
         GXv_int1[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [resultadoFicha] DESC" ;
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
                  return conditional_P00002(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).longValue() , ((Number) dynConstraints[14]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, 0,false )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8);
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10);
               ((long[]) buf[18])[0] = rslt.getLong(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[14], 1000);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 1000);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               return;
      }
   }

}

