package com.colaveco ;
import com.genexus.*;

public final  class StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt implements Cloneable, java.io.Serializable
{
   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( )
   {
      this( -1, new ModelContext( StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt.class ));
   }

   public StructSdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt( int remoteHandle ,
                                                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones = "" ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = cal.getTime() ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = cal.getTime() ;
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
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid ;
   }

   public void setSfid( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid = value ;
   }

   public long getSfidnet( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet ;
   }

   public void setSfidnet( long value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet = value ;
   }

   public String getSfnombre( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre ;
   }

   public void setSfnombre( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre = value ;
   }

   public String getSfdireccion( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion ;
   }

   public void setSfdireccion( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion = value ;
   }

   public short getSfagencia( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia ;
   }

   public void setSfagencia( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia = value ;
   }

   public String getSftelefono( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono ;
   }

   public void setSftelefono( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono = value ;
   }

   public String getSfemail( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail ;
   }

   public void setSfemail( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail = value ;
   }

   public short getSffrascosconc( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc ;
   }

   public void setSffrascosconc( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc = value ;
   }

   public short getSffrascossinc( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc ;
   }

   public void setSffrascossinc( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc = value ;
   }

   public short getSffrascosagua( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua ;
   }

   public void setSffrascosagua( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua = value ;
   }

   public short getSffrascossangre( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre ;
   }

   public void setSffrascossangre( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre = value ;
   }

   public String getSfobservaciones( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones ;
   }

   public void setSfobservaciones( String value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones = value ;
   }

   public java.util.Date getSffechacreacion( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion ;
   }

   public void setSffechacreacion( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion = value ;
   }

   public java.util.Date getSffechamodificado( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado ;
   }

   public void setSffechamodificado( java.util.Date value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado = value ;
   }

   public short getSffrascosisopo( )
   {
      return gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo ;
   }

   public void setSffrascosisopo( short value )
   {
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N = (byte)(0) ;
      gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo = value ;
   }

   protected byte gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_N ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre ;
   protected short gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid ;
   protected long gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail ;
   protected String gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones ;
   protected java.util.Date gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion ;
   protected java.util.Date gxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado ;
}

