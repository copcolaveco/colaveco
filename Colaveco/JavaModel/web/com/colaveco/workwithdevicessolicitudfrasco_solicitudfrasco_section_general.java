package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workwithdevicessolicitudfrasco_solicitudfrasco_section_general extends GXProcedure
{
   public workwithdevicessolicitudfrasco_solicitudfrasco_section_general( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithdevicessolicitudfrasco_solicitudfrasco_section_general.class ), "" );
   }

   public workwithdevicessolicitudfrasco_solicitudfrasco_section_general( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt executeUdp( long aP0 ,
                                                                                                        int aP1 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_section_general.this.aP2 = new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt[] {new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt[] aP2 )
   {
      workwithdevicessolicitudfrasco_solicitudfrasco_section_general.this.A3SFId = aP0;
      workwithdevicessolicitudfrasco_solicitudfrasco_section_general.this.AV6gxid = aP1;
      workwithdevicessolicitudfrasco_solicitudfrasco_section_general.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00002 */
      pr_default.execute(0, new Object[] {Long.valueOf(A3SFId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A32SFIdNet = P00002_A32SFIdNet[0] ;
         n32SFIdNet = P00002_n32SFIdNet[0] ;
         A33SFNombre = P00002_A33SFNombre[0] ;
         n33SFNombre = P00002_n33SFNombre[0] ;
         A34SFDireccion = P00002_A34SFDireccion[0] ;
         n34SFDireccion = P00002_n34SFDireccion[0] ;
         A35SFAgencia = P00002_A35SFAgencia[0] ;
         n35SFAgencia = P00002_n35SFAgencia[0] ;
         A36SFTelefono = P00002_A36SFTelefono[0] ;
         n36SFTelefono = P00002_n36SFTelefono[0] ;
         A37SFEmail = P00002_A37SFEmail[0] ;
         n37SFEmail = P00002_n37SFEmail[0] ;
         A38SFFrascosConC = P00002_A38SFFrascosConC[0] ;
         n38SFFrascosConC = P00002_n38SFFrascosConC[0] ;
         A39SFFrascosSinC = P00002_A39SFFrascosSinC[0] ;
         n39SFFrascosSinC = P00002_n39SFFrascosSinC[0] ;
         A167SFFrascosAgua = P00002_A167SFFrascosAgua[0] ;
         n167SFFrascosAgua = P00002_n167SFFrascosAgua[0] ;
         A40SFFrascosSangre = P00002_A40SFFrascosSangre[0] ;
         n40SFFrascosSangre = P00002_n40SFFrascosSangre[0] ;
         A41SFObservaciones = P00002_A41SFObservaciones[0] ;
         n41SFObservaciones = P00002_n41SFObservaciones[0] ;
         A42SFFechaCreacion = P00002_A42SFFechaCreacion[0] ;
         n42SFFechaCreacion = P00002_n42SFFechaCreacion[0] ;
         A43SFFechaModificado = P00002_A43SFFechaModificado[0] ;
         n43SFFechaModificado = P00002_n43SFFechaModificado[0] ;
         A44SFFrascosIsopo = P00002_A44SFFrascosIsopo[0] ;
         n44SFFrascosIsopo = P00002_n44SFFrascosIsopo[0] ;
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid( A3SFId );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet( A32SFIdNet );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre( A33SFNombre );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion( A34SFDireccion );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia( A35SFAgencia );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono( A36SFTelefono );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail( A37SFEmail );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc( A38SFFrascosConC );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc( A39SFFrascosSinC );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua( A167SFFrascosAgua );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre( A40SFFrascosSangre );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones( A41SFObservaciones );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion( A42SFFechaCreacion );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado( A43SFFechaModificado );
         AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo( A44SFFrascosIsopo );
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
      this.aP2[0] = workwithdevicessolicitudfrasco_solicitudfrasco_section_general.this.AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt = new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt(remoteHandle, context);
      scmdbuf = "" ;
      P00002_A3SFId = new long[1] ;
      P00002_A32SFIdNet = new long[1] ;
      P00002_n32SFIdNet = new boolean[] {false} ;
      P00002_A33SFNombre = new String[] {""} ;
      P00002_n33SFNombre = new boolean[] {false} ;
      P00002_A34SFDireccion = new String[] {""} ;
      P00002_n34SFDireccion = new boolean[] {false} ;
      P00002_A35SFAgencia = new short[1] ;
      P00002_n35SFAgencia = new boolean[] {false} ;
      P00002_A36SFTelefono = new String[] {""} ;
      P00002_n36SFTelefono = new boolean[] {false} ;
      P00002_A37SFEmail = new String[] {""} ;
      P00002_n37SFEmail = new boolean[] {false} ;
      P00002_A38SFFrascosConC = new short[1] ;
      P00002_n38SFFrascosConC = new boolean[] {false} ;
      P00002_A39SFFrascosSinC = new short[1] ;
      P00002_n39SFFrascosSinC = new boolean[] {false} ;
      P00002_A167SFFrascosAgua = new short[1] ;
      P00002_n167SFFrascosAgua = new boolean[] {false} ;
      P00002_A40SFFrascosSangre = new short[1] ;
      P00002_n40SFFrascosSangre = new boolean[] {false} ;
      P00002_A41SFObservaciones = new String[] {""} ;
      P00002_n41SFObservaciones = new boolean[] {false} ;
      P00002_A42SFFechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n42SFFechaCreacion = new boolean[] {false} ;
      P00002_A43SFFechaModificado = new java.util.Date[] {GXutil.nullDate()} ;
      P00002_n43SFFechaModificado = new boolean[] {false} ;
      P00002_A44SFFrascosIsopo = new short[1] ;
      P00002_n44SFFrascosIsopo = new boolean[] {false} ;
      A33SFNombre = "" ;
      A34SFDireccion = "" ;
      A36SFTelefono = "" ;
      A37SFEmail = "" ;
      A41SFObservaciones = "" ;
      A42SFFechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A43SFFechaModificado = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.colaveco.workwithdevicessolicitudfrasco_solicitudfrasco_section_general__default(),
         new Object[] {
             new Object[] {
            P00002_A3SFId, P00002_A32SFIdNet, P00002_n32SFIdNet, P00002_A33SFNombre, P00002_n33SFNombre, P00002_A34SFDireccion, P00002_n34SFDireccion, P00002_A35SFAgencia, P00002_n35SFAgencia, P00002_A36SFTelefono,
            P00002_n36SFTelefono, P00002_A37SFEmail, P00002_n37SFEmail, P00002_A38SFFrascosConC, P00002_n38SFFrascosConC, P00002_A39SFFrascosSinC, P00002_n39SFFrascosSinC, P00002_A167SFFrascosAgua, P00002_n167SFFrascosAgua, P00002_A40SFFrascosSangre,
            P00002_n40SFFrascosSangre, P00002_A41SFObservaciones, P00002_n41SFObservaciones, P00002_A42SFFechaCreacion, P00002_n42SFFechaCreacion, P00002_A43SFFechaModificado, P00002_n43SFFechaModificado, P00002_A44SFFrascosIsopo, P00002_n44SFFrascosIsopo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A35SFAgencia ;
   private short A38SFFrascosConC ;
   private short A39SFFrascosSinC ;
   private short A167SFFrascosAgua ;
   private short A40SFFrascosSangre ;
   private short A44SFFrascosIsopo ;
   private short Gx_err ;
   private int AV6gxid ;
   private long A3SFId ;
   private long A32SFIdNet ;
   private String scmdbuf ;
   private java.util.Date A42SFFechaCreacion ;
   private java.util.Date A43SFFechaModificado ;
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
   private String A33SFNombre ;
   private String A34SFDireccion ;
   private String A36SFTelefono ;
   private String A37SFEmail ;
   private String A41SFObservaciones ;
   private com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P00002_A3SFId ;
   private long[] P00002_A32SFIdNet ;
   private boolean[] P00002_n32SFIdNet ;
   private String[] P00002_A33SFNombre ;
   private boolean[] P00002_n33SFNombre ;
   private String[] P00002_A34SFDireccion ;
   private boolean[] P00002_n34SFDireccion ;
   private short[] P00002_A35SFAgencia ;
   private boolean[] P00002_n35SFAgencia ;
   private String[] P00002_A36SFTelefono ;
   private boolean[] P00002_n36SFTelefono ;
   private String[] P00002_A37SFEmail ;
   private boolean[] P00002_n37SFEmail ;
   private short[] P00002_A38SFFrascosConC ;
   private boolean[] P00002_n38SFFrascosConC ;
   private short[] P00002_A39SFFrascosSinC ;
   private boolean[] P00002_n39SFFrascosSinC ;
   private short[] P00002_A167SFFrascosAgua ;
   private boolean[] P00002_n167SFFrascosAgua ;
   private short[] P00002_A40SFFrascosSangre ;
   private boolean[] P00002_n40SFFrascosSangre ;
   private String[] P00002_A41SFObservaciones ;
   private boolean[] P00002_n41SFObservaciones ;
   private java.util.Date[] P00002_A42SFFechaCreacion ;
   private boolean[] P00002_n42SFFechaCreacion ;
   private java.util.Date[] P00002_A43SFFechaModificado ;
   private boolean[] P00002_n43SFFechaModificado ;
   private short[] P00002_A44SFFrascosIsopo ;
   private boolean[] P00002_n44SFFrascosIsopo ;
   private com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt AV7GXM1WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt ;
}

final  class workwithdevicessolicitudfrasco_solicitudfrasco_section_general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00002", "SELECT `SFId`, `SFIdNet`, `SFNombre`, `SFDireccion`, `SFAgencia`, `SFTelefono`, `SFEmail`, `SFFrascosConC`, `SFFrascosSinC`, `SFFrascosAgua`, `SFFrascosSangre`, `SFObservaciones`, `SFFechaCreacion`, `SFFechaModificado`, `SFFrascosIsopo` FROM `SolicitudFrasco` WHERE `SFId` = ? ORDER BY `SFId`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

