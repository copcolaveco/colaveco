package com.colaveco ;
import com.genexus.*;

public final  class StructSdtGAMSDLogin_Level_DetailSdt implements Cloneable, java.io.Serializable
{
   public StructSdtGAMSDLogin_Level_DetailSdt( )
   {
      this( -1, new ModelContext( StructSdtGAMSDLogin_Level_DetailSdt.class ));
   }

   public StructSdtGAMSDLogin_Level_DetailSdt( int remoteHandle ,
                                               ModelContext context )
   {
      gxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin = "" ;
      gxTv_SdtGAMSDLogin_Level_DetailSdt_User = "" ;
      gxTv_SdtGAMSDLogin_Level_DetailSdt_Password = "" ;
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

   public String getBienvenidalogin( )
   {
      return gxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin ;
   }

   public void setBienvenidalogin( String value )
   {
      gxTv_SdtGAMSDLogin_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin = value ;
   }

   public String getUser( )
   {
      return gxTv_SdtGAMSDLogin_Level_DetailSdt_User ;
   }

   public void setUser( String value )
   {
      gxTv_SdtGAMSDLogin_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtGAMSDLogin_Level_DetailSdt_User = value ;
   }

   public String getPassword( )
   {
      return gxTv_SdtGAMSDLogin_Level_DetailSdt_Password ;
   }

   public void setPassword( String value )
   {
      gxTv_SdtGAMSDLogin_Level_DetailSdt_N = (byte)(0) ;
      gxTv_SdtGAMSDLogin_Level_DetailSdt_Password = value ;
   }

   protected byte gxTv_SdtGAMSDLogin_Level_DetailSdt_N ;
   protected String gxTv_SdtGAMSDLogin_Level_DetailSdt_Password ;
   protected String gxTv_SdtGAMSDLogin_Level_DetailSdt_Bienvenidalogin ;
   protected String gxTv_SdtGAMSDLogin_Level_DetailSdt_User ;
}

