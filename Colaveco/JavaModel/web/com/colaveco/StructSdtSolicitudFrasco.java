package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSolicitudFrasco implements Cloneable, java.io.Serializable
{
   public StructSdtSolicitudFrasco( )
   {
      this( -1, new ModelContext( StructSdtSolicitudFrasco.class ));
   }

   public StructSdtSolicitudFrasco( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSolicitudFrasco_Sfnombre = "" ;
      gxTv_SdtSolicitudFrasco_Sfdireccion = "" ;
      gxTv_SdtSolicitudFrasco_Sftelefono = "" ;
      gxTv_SdtSolicitudFrasco_Sfemail = "" ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones = "" ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion = cal.getTime() ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado = cal.getTime() ;
      gxTv_SdtSolicitudFrasco_Mode = "" ;
      gxTv_SdtSolicitudFrasco_Sfnombre_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfdireccion_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sftelefono_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfemail_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = "" ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = cal.getTime() ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = cal.getTime() ;
      gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(1) ;
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public long getSfid( )
   {
      return gxTv_SdtSolicitudFrasco_Sfid ;
   }

   public void setSfid( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfid = value ;
   }

   public long getSfidnet( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet ;
   }

   public void setSfidnet( long value )
   {
      gxTv_SdtSolicitudFrasco_Sfidnet_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfidnet = value ;
   }

   public String getSfnombre( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre ;
   }

   public void setSfnombre( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfnombre_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfnombre = value ;
   }

   public String getSfdireccion( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion ;
   }

   public void setSfdireccion( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfdireccion = value ;
   }

   public short getSfagencia( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia ;
   }

   public void setSfagencia( short value )
   {
      gxTv_SdtSolicitudFrasco_Sfagencia_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfagencia = value ;
   }

   public String getSftelefono( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono ;
   }

   public void setSftelefono( String value )
   {
      gxTv_SdtSolicitudFrasco_Sftelefono_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sftelefono = value ;
   }

   public String getSfemail( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail ;
   }

   public void setSfemail( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfemail_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfemail = value ;
   }

   public short getSffrascosconc( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc ;
   }

   public void setSffrascosconc( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosconc = value ;
   }

   public short getSffrascossinc( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc ;
   }

   public void setSffrascossinc( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossinc = value ;
   }

   public short getSffrascosagua( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua ;
   }

   public void setSffrascosagua( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosagua = value ;
   }

   public short getSffrascossangre( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre ;
   }

   public void setSffrascossangre( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossangre = value ;
   }

   public String getSfobservaciones( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones ;
   }

   public void setSfobservaciones( String value )
   {
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones = value ;
   }

   public java.util.Date getSffechacreacion( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion ;
   }

   public void setSffechacreacion( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion = value ;
   }

   public java.util.Date getSffechamodificado( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado ;
   }

   public void setSffechamodificado( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado = value ;
   }

   public short getSffrascosisopo( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo ;
   }

   public void setSffrascosisopo( short value )
   {
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosisopo = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtSolicitudFrasco_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtSolicitudFrasco_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Initialized = value ;
   }

   public long getSfid_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfid_Z ;
   }

   public void setSfid_Z( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfid_Z = value ;
   }

   public long getSfidnet_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet_Z ;
   }

   public void setSfidnet_Z( long value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfidnet_Z = value ;
   }

   public String getSfnombre_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre_Z ;
   }

   public void setSfnombre_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfnombre_Z = value ;
   }

   public String getSfdireccion_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion_Z ;
   }

   public void setSfdireccion_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfdireccion_Z = value ;
   }

   public short getSfagencia_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia_Z ;
   }

   public void setSfagencia_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfagencia_Z = value ;
   }

   public String getSftelefono_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono_Z ;
   }

   public void setSftelefono_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sftelefono_Z = value ;
   }

   public String getSfemail_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail_Z ;
   }

   public void setSfemail_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfemail_Z = value ;
   }

   public short getSffrascosconc_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc_Z ;
   }

   public void setSffrascosconc_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosconc_Z = value ;
   }

   public short getSffrascossinc_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc_Z ;
   }

   public void setSffrascossinc_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossinc_Z = value ;
   }

   public short getSffrascosagua_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua_Z ;
   }

   public void setSffrascosagua_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosagua_Z = value ;
   }

   public short getSffrascossangre_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre_Z ;
   }

   public void setSffrascossangre_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossangre_Z = value ;
   }

   public String getSfobservaciones_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones_Z ;
   }

   public void setSfobservaciones_Z( String value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones_Z = value ;
   }

   public java.util.Date getSffechacreacion_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion_Z ;
   }

   public void setSffechacreacion_Z( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion_Z = value ;
   }

   public java.util.Date getSffechamodificado_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado_Z ;
   }

   public void setSffechamodificado_Z( java.util.Date value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado_Z = value ;
   }

   public short getSffrascosisopo_Z( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z ;
   }

   public void setSffrascosisopo_Z( short value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z = value ;
   }

   public byte getSfidnet_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfidnet_N ;
   }

   public void setSfidnet_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfidnet_N = value ;
   }

   public byte getSfnombre_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfnombre_N ;
   }

   public void setSfnombre_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfnombre_N = value ;
   }

   public byte getSfdireccion_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfdireccion_N ;
   }

   public void setSfdireccion_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfdireccion_N = value ;
   }

   public byte getSfagencia_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfagencia_N ;
   }

   public void setSfagencia_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfagencia_N = value ;
   }

   public byte getSftelefono_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sftelefono_N ;
   }

   public void setSftelefono_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sftelefono_N = value ;
   }

   public byte getSfemail_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfemail_N ;
   }

   public void setSfemail_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfemail_N = value ;
   }

   public byte getSffrascosconc_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosconc_N ;
   }

   public void setSffrascosconc_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosconc_N = value ;
   }

   public byte getSffrascossinc_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossinc_N ;
   }

   public void setSffrascossinc_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossinc_N = value ;
   }

   public byte getSffrascosagua_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosagua_N ;
   }

   public void setSffrascosagua_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosagua_N = value ;
   }

   public byte getSffrascossangre_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascossangre_N ;
   }

   public void setSffrascossangre_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascossangre_N = value ;
   }

   public byte getSfobservaciones_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sfobservaciones_N ;
   }

   public void setSfobservaciones_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sfobservaciones_N = value ;
   }

   public byte getSffechacreacion_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechacreacion_N ;
   }

   public void setSffechacreacion_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechacreacion_N = value ;
   }

   public byte getSffechamodificado_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffechamodificado_N ;
   }

   public void setSffechamodificado_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffechamodificado_N = value ;
   }

   public byte getSffrascosisopo_N( )
   {
      return gxTv_SdtSolicitudFrasco_Sffrascosisopo_N ;
   }

   public void setSffrascosisopo_N( byte value )
   {
      gxTv_SdtSolicitudFrasco_N = (byte)(0) ;
      gxTv_SdtSolicitudFrasco_Sffrascosisopo_N = value ;
   }

   protected byte gxTv_SdtSolicitudFrasco_Sfidnet_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sfnombre_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sfdireccion_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sfagencia_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sftelefono_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sfemail_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffrascosconc_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffrascossinc_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffrascosagua_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffrascossangre_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sfobservaciones_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffechacreacion_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffechamodificado_N ;
   protected byte gxTv_SdtSolicitudFrasco_Sffrascosisopo_N ;
   private byte gxTv_SdtSolicitudFrasco_N ;
   protected short gxTv_SdtSolicitudFrasco_Sfagencia ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosconc ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascossinc ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosagua ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascossangre ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosisopo ;
   protected short gxTv_SdtSolicitudFrasco_Initialized ;
   protected short gxTv_SdtSolicitudFrasco_Sfagencia_Z ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosconc_Z ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascossinc_Z ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosagua_Z ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascossangre_Z ;
   protected short gxTv_SdtSolicitudFrasco_Sffrascosisopo_Z ;
   protected long gxTv_SdtSolicitudFrasco_Sfid ;
   protected long gxTv_SdtSolicitudFrasco_Sfidnet ;
   protected long gxTv_SdtSolicitudFrasco_Sfid_Z ;
   protected long gxTv_SdtSolicitudFrasco_Sfidnet_Z ;
   protected String gxTv_SdtSolicitudFrasco_Mode ;
   protected String gxTv_SdtSolicitudFrasco_Sfnombre ;
   protected String gxTv_SdtSolicitudFrasco_Sfdireccion ;
   protected String gxTv_SdtSolicitudFrasco_Sftelefono ;
   protected String gxTv_SdtSolicitudFrasco_Sfemail ;
   protected String gxTv_SdtSolicitudFrasco_Sfobservaciones ;
   protected String gxTv_SdtSolicitudFrasco_Sfnombre_Z ;
   protected String gxTv_SdtSolicitudFrasco_Sfdireccion_Z ;
   protected String gxTv_SdtSolicitudFrasco_Sftelefono_Z ;
   protected String gxTv_SdtSolicitudFrasco_Sfemail_Z ;
   protected String gxTv_SdtSolicitudFrasco_Sfobservaciones_Z ;
   protected java.util.Date gxTv_SdtSolicitudFrasco_Sffechacreacion ;
   protected java.util.Date gxTv_SdtSolicitudFrasco_Sffechamodificado ;
   protected java.util.Date gxTv_SdtSolicitudFrasco_Sffechacreacion_Z ;
   protected java.util.Date gxTv_SdtSolicitudFrasco_Sffechamodificado_Z ;
}

