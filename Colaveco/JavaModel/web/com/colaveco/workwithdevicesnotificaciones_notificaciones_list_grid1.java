package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicesnotificaciones_notificaciones_list_grid1 extends GXProcedure
{
   public workwithdevicesnotificaciones_notificaciones_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicesnotificaciones_notificaciones_list_grid1.class ), "" );
   }

   public workwithdevicesnotificaciones_notificaciones_list_grid1( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item> executeUdp( long aP0 ,
                                                                                                                        String aP1 ,
                                                                                                                        long aP2 ,
                                                                                                                        long aP3 ,
                                                                                                                        int aP4 )
   {
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        long aP2 ,
                        long aP3 ,
                        int aP4 ,
                        GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             long aP2 ,
                             long aP3 ,
                             int aP4 ,
                             GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>[] aP5 )
   {
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV5ExternalId = aP0;
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV12SearchText = aP1;
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV10start = aP2;
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV11count = aP3;
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV7gxid = aP4;
      workwithdevicesnotificaciones_notificaciones_list_grid1.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV7gxid, 8, 0) ;
      AV17Notificacionesimagen_GXI = (Gxwebsession.getValue(Gxids+"gxvar_Notificacionesimagen")) ;
      AV6NotificacionesImagen = "" ;
      GXPagingFrom2 = (int)(AV10start) ;
      GXPagingTo2 = (int)(((AV11count>0) ? AV11count : 100000000)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV5ExternalId) ,
                                           AV12SearchText ,
                                           Long.valueOf(A172NotificacionesIdNetUsuario) ,
                                           A170NotificacionesTipo ,
                                           A171NotificacionesMensaje ,
                                           A173NotificacionesDetalle } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV12SearchText = GXutil.concat( GXutil.rtrim( AV12SearchText), "%", "") ;
      lV12SearchText = GXutil.concat( GXutil.rtrim( AV12SearchText), "%", "") ;
      lV12SearchText = GXutil.concat( GXutil.rtrim( AV12SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV5ExternalId), lV12SearchText, lV12SearchText, lV12SearchText, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A170NotificacionesTipo = P00002_A170NotificacionesTipo[0] ;
         n170NotificacionesTipo = P00002_n170NotificacionesTipo[0] ;
         A171NotificacionesMensaje = P00002_A171NotificacionesMensaje[0] ;
         n171NotificacionesMensaje = P00002_n171NotificacionesMensaje[0] ;
         A173NotificacionesDetalle = P00002_A173NotificacionesDetalle[0] ;
         n173NotificacionesDetalle = P00002_n173NotificacionesDetalle[0] ;
         A172NotificacionesIdNetUsuario = P00002_A172NotificacionesIdNetUsuario[0] ;
         n172NotificacionesIdNetUsuario = P00002_n172NotificacionesIdNetUsuario[0] ;
         A6NotificacionesId = P00002_A6NotificacionesId[0] ;
         A169NotificacionesFecha = P00002_A169NotificacionesFecha[0] ;
         n169NotificacionesFecha = P00002_n169NotificacionesFecha[0] ;
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item(remoteHandle, context);
         AV13GXM2RootCol.add(AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt, 0);
         if ( GXutil.strcmp(A170NotificacionesTipo, "resultado") == 0 )
         {
            AV6NotificacionesImagen = context.getHttpContext().getImagePath( "27f95ecf-2967-4b4c-81dd-ed580c79a972", "", context.getHttpContext().getTheme( )) ;
            AV17Notificacionesimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "27f95ecf-2967-4b4c-81dd-ed580c79a972", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         }
         if ( GXutil.strcmp(A170NotificacionesTipo, "solicitud_creada") == 0 )
         {
            AV6NotificacionesImagen = context.getHttpContext().getImagePath( "cfab4145-4473-45ff-ba76-f41d35f7d0d3", "", context.getHttpContext().getTheme( )) ;
            AV17Notificacionesimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "cfab4145-4473-45ff-ba76-f41d35f7d0d3", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         }
         if ( GXutil.strcmp(A170NotificacionesTipo, "envio_frasco") == 0 )
         {
            AV6NotificacionesImagen = context.getHttpContext().getImagePath( "49a64cd0-2247-4809-bec9-b4416bf4f5bf", "", context.getHttpContext().getTheme( )) ;
            AV17Notificacionesimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "49a64cd0-2247-4809-bec9-b4416bf4f5bf", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         }
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesid( A6NotificacionesId );
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesfecha( A169NotificacionesFecha );
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesmensaje( A171NotificacionesMensaje );
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen( AV6NotificacionesImagen );
         AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item_Notificacionesimagen_gxi( AV17Notificacionesimagen_GXI );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gxwebsession.setValue(Gxids+"gxvar_Notificacionesimagen", AV17Notificacionesimagen_GXI);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = workwithdevicesnotificaciones_notificaciones_list_grid1.this.AV13GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item.class, "WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      Gxids = "" ;
      AV17Notificacionesimagen_GXI = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV6NotificacionesImagen = "" ;
      scmdbuf = "" ;
      lV12SearchText = "" ;
      A170NotificacionesTipo = "" ;
      A171NotificacionesMensaje = "" ;
      A173NotificacionesDetalle = "" ;
      P00002_A170NotificacionesTipo = new String[] {""} ;
      P00002_n170NotificacionesTipo = new boolean[] {false} ;
      P00002_A171NotificacionesMensaje = new String[] {""} ;
      P00002_n171NotificacionesMensaje = new boolean[] {false} ;
      P00002_A173NotificacionesDetalle = new String[] {""} ;
      P00002_n173NotificacionesDetalle = new boolean[] {false} ;
      P00002_A172NotificacionesIdNetUsuario = new long[1] ;
      P00002_n172NotificacionesIdNetUsuario = new boolean[] {false} ;
      P00002_A6NotificacionesId = new long[1] ;
      P00002_A169NotificacionesFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n169NotificacionesFecha = new boolean[] {false} ;
      A169NotificacionesFecha = GXutil.resetTime( GXutil.nullDate() );
      AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicesnotificaciones_notificaciones_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A170NotificacionesTipo, P00002_n170NotificacionesTipo, P00002_A171NotificacionesMensaje, P00002_n171NotificacionesMensaje, P00002_A173NotificacionesDetalle, P00002_n173NotificacionesDetalle, P00002_A172NotificacionesIdNetUsuario, P00002_n172NotificacionesIdNetUsuario, P00002_A6NotificacionesId, P00002_A169NotificacionesFecha,
            P00002_n169NotificacionesFecha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5ExternalId ;
   private long AV10start ;
   private long AV11count ;
   private long A172NotificacionesIdNetUsuario ;
   private long A6NotificacionesId ;
   private String Gxids ;
   private String scmdbuf ;
   private java.util.Date A169NotificacionesFecha ;
   private boolean n170NotificacionesTipo ;
   private boolean n171NotificacionesMensaje ;
   private boolean n173NotificacionesDetalle ;
   private boolean n172NotificacionesIdNetUsuario ;
   private boolean n169NotificacionesFecha ;
   private String AV12SearchText ;
   private String AV17Notificacionesimagen_GXI ;
   private String lV12SearchText ;
   private String A170NotificacionesTipo ;
   private String A171NotificacionesMensaje ;
   private String A173NotificacionesDetalle ;
   private String AV6NotificacionesImagen ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00002_A170NotificacionesTipo ;
   private boolean[] P00002_n170NotificacionesTipo ;
   private String[] P00002_A171NotificacionesMensaje ;
   private boolean[] P00002_n171NotificacionesMensaje ;
   private String[] P00002_A173NotificacionesDetalle ;
   private boolean[] P00002_n173NotificacionesDetalle ;
   private long[] P00002_A172NotificacionesIdNetUsuario ;
   private boolean[] P00002_n172NotificacionesIdNetUsuario ;
   private long[] P00002_A6NotificacionesId ;
   private java.util.Date[] P00002_A169NotificacionesFecha ;
   private boolean[] P00002_n169NotificacionesFecha ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item> AV13GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt_Item AV14GXM1WorkWithDevicesNotificaciones_Notificaciones_List_Grid1Sdt ;
}

final  class workwithdevicesnotificaciones_notificaciones_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV5ExternalId ,
                                          String AV12SearchText ,
                                          long A172NotificacionesIdNetUsuario ,
                                          String A170NotificacionesTipo ,
                                          String A171NotificacionesMensaje ,
                                          String A173NotificacionesDetalle )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `NotificacionesTipo`, `NotificacionesMensaje`, `NotificacionesDetalle`, `NotificacionesIdNetUsuario`, `NotificacionesId`, `NotificacionesFecha`" ;
      sFromString = " FROM `Notificaciones`" ;
      sOrderString = "" ;
      if ( (0==AV5ExternalId) )
      {
         addWhere(sWhereString, "(`NotificacionesIdNetUsuario` = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER(`NotificacionesTipo`) like CONCAT('%', UPPER(?)) or UPPER(`NotificacionesMensaje`) like CONCAT('%', UPPER(?)) or UPPER(`NotificacionesDetalle`) like CONCAT('%', UPPER(?)))");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `NotificacionesFecha` DESC" ;
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
                  return conditional_P00002(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
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
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 1000);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1000);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1000);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

