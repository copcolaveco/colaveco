package com.colaveco ;
import com.genexus.*;

public final  class StructSdtPDFdownload_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtPDFdownload_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtPDFdownload_Level_DetailSdt.class ));
   }

   public StructSdtPDFdownload_Level_DetailSdt( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_Url = "" ;
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

   public String getUrl( )
   {
      return gxTv_SdtPDFdownload_Level_DetailSdt_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtPDFdownload_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtPDFdownload_Level_DetailSdt_Url = value ;
   }

   protected byte gxTv_SdtPDFdownload_Level_DetailSdt_N ;
   protected String gxTv_SdtPDFdownload_Level_DetailSdt_Url ;
}

