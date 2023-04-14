package com.colaveco ;
import com.genexus.*;

public final  class StructSdtSDTAgencia_SDTAgenciaItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTAgencia_SDTAgenciaItem( )
   {
      this( -1, new ModelContext( StructSdtSDTAgencia_SDTAgenciaItem.class ));
   }

   public StructSdtSDTAgencia_SDTAgenciaItem( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre = "" ;
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

   public long getSdtagenciaid( )
   {
      return gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid ;
   }

   public void setSdtagenciaid( long value )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_N = (byte)(0) ;
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid = value ;
   }

   public String getSdtagencianombre( )
   {
      return gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre ;
   }

   public void setSdtagencianombre( String value )
   {
      gxTv_SdtSDTAgencia_SDTAgenciaItem_N = (byte)(0) ;
      gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre = value ;
   }

   protected byte gxTv_SdtSDTAgencia_SDTAgenciaItem_N ;
   protected long gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid ;
   protected String gxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre ;
}

