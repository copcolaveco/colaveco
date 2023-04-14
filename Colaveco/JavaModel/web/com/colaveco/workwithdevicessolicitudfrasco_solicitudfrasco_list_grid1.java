package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1 extends GXProcedure
{
   public workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.class ), "" );
   }

   public workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1( int remoteHandle ,
                                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item> executeUdp( String aP0 ,
                                                                                                                          long aP1 ,
                                                                                                                          long aP2 ,
                                                                                                                          int aP3 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        long aP2 ,
                        int aP3 ,
                        GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             long aP2 ,
                             int aP3 ,
                             GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>[] aP4 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.AV8SearchText = aP0;
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.AV6start = aP1;
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.AV7count = aP2;
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.AV5gxid = aP3;
      workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.aP4 = aP4;
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
                                           A33SFNombre ,
                                           A34SFDireccion ,
                                           A36SFTelefono ,
                                           A37SFEmail ,
                                           A41SFObservaciones } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      lV8SearchText = GXutil.concat( GXutil.rtrim( AV8SearchText), "%", "") ;
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, lV8SearchText, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33SFNombre = P00002_A33SFNombre[0] ;
         n33SFNombre = P00002_n33SFNombre[0] ;
         A34SFDireccion = P00002_A34SFDireccion[0] ;
         n34SFDireccion = P00002_n34SFDireccion[0] ;
         A36SFTelefono = P00002_A36SFTelefono[0] ;
         n36SFTelefono = P00002_n36SFTelefono[0] ;
         A37SFEmail = P00002_A37SFEmail[0] ;
         n37SFEmail = P00002_n37SFEmail[0] ;
         A41SFObservaciones = P00002_A41SFObservaciones[0] ;
         n41SFObservaciones = P00002_n41SFObservaciones[0] ;
         A3SFId = P00002_A3SFId[0] ;
         A32SFIdNet = P00002_A32SFIdNet[0] ;
         n32SFIdNet = P00002_n32SFIdNet[0] ;
         AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt = (com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item)new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item(remoteHandle, context);
         AV9GXM2RootCol.add(AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt, 0);
         AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid( A3SFId );
         AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet( A32SFIdNet );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1.this.AV9GXM2RootCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9GXM2RootCol = new GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>(com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item.class, "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt.Item", "http://tempuri.org/", remoteHandle);
      scmdbuf = "" ;
      lV8SearchText = "" ;
      A33SFNombre = "" ;
      A34SFDireccion = "" ;
      A36SFTelefono = "" ;
      A37SFEmail = "" ;
      A41SFObservaciones = "" ;
      P00002_A33SFNombre = new String[] {""} ;
      P00002_n33SFNombre = new boolean[] {false} ;
      P00002_A34SFDireccion = new String[] {""} ;
      P00002_n34SFDireccion = new boolean[] {false} ;
      P00002_A36SFTelefono = new String[] {""} ;
      P00002_n36SFTelefono = new boolean[] {false} ;
      P00002_A37SFEmail = new String[] {""} ;
      P00002_n37SFEmail = new boolean[] {false} ;
      P00002_A41SFObservaciones = new String[] {""} ;
      P00002_n41SFObservaciones = new boolean[] {false} ;
      P00002_A3SFId = new long[1] ;
      P00002_A32SFIdNet = new long[1] ;
      P00002_n32SFIdNet = new boolean[] {false} ;
      AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt = new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1__default(),
         new Object[] {
             new Object[] {
            P00002_A33SFNombre, P00002_n33SFNombre, P00002_A34SFDireccion, P00002_n34SFDireccion, P00002_A36SFTelefono, P00002_n36SFTelefono, P00002_A37SFEmail, P00002_n37SFEmail, P00002_A41SFObservaciones, P00002_n41SFObservaciones,
            P00002_A3SFId, P00002_A32SFIdNet, P00002_n32SFIdNet
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
   private long A3SFId ;
   private long A32SFIdNet ;
   private String scmdbuf ;
   private boolean n33SFNombre ;
   private boolean n34SFDireccion ;
   private boolean n36SFTelefono ;
   private boolean n37SFEmail ;
   private boolean n41SFObservaciones ;
   private boolean n32SFIdNet ;
   private String AV8SearchText ;
   private String lV8SearchText ;
   private String A33SFNombre ;
   private String A34SFDireccion ;
   private String A36SFTelefono ;
   private String A37SFEmail ;
   private String A41SFObservaciones ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00002_A33SFNombre ;
   private boolean[] P00002_n33SFNombre ;
   private String[] P00002_A34SFDireccion ;
   private boolean[] P00002_n34SFDireccion ;
   private String[] P00002_A36SFTelefono ;
   private boolean[] P00002_n36SFTelefono ;
   private String[] P00002_A37SFEmail ;
   private boolean[] P00002_n37SFEmail ;
   private String[] P00002_A41SFObservaciones ;
   private boolean[] P00002_n41SFObservaciones ;
   private long[] P00002_A3SFId ;
   private long[] P00002_A32SFIdNet ;
   private boolean[] P00002_n32SFIdNet ;
   private GXBaseCollection<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item> AV9GXM2RootCol ;
   private com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item AV10GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt ;
}

final  class workwithdevicessolicitudfrasco_solicitudfrasco_list_grid1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV8SearchText ,
                                          String A33SFNombre ,
                                          String A34SFDireccion ,
                                          String A36SFTelefono ,
                                          String A37SFEmail ,
                                          String A41SFObservaciones )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " `SFNombre`, `SFDireccion`, `SFTelefono`, `SFEmail`, `SFObservaciones`, `SFId`, `SFIdNet`" ;
      sFromString = " FROM `SolicitudFrasco`" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV8SearchText)==0) )
      {
         addWhere(sWhereString, "(UPPER(`SFNombre`) like CONCAT('%', UPPER(?)) or UPPER(`SFDireccion`) like CONCAT('%', UPPER(?)) or UPPER(`SFTelefono`) like CONCAT('%', UPPER(?)) or UPPER(`SFEmail`) like CONCAT('%', UPPER(?)) or UPPER(`SFObservaciones`) like CONCAT('%', UPPER(?)))");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
         GXv_int1[1] = (byte)(1) ;
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY `SFIdNet`" ;
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
                  return conditional_P00002(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
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
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[7], 1000);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1000);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1000);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 1000);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 1000);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

