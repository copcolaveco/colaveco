package com.colaveco ;
import com.genexus.*;

public final  class StructSdtCliente implements Cloneable, java.io.Serializable
{
   public StructSdtCliente( )
   {
      this( -1, new ModelContext( StructSdtCliente.class ));
   }

   public StructSdtCliente( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtCliente_Clientenombre = "" ;
      gxTv_SdtCliente_Clienteemail = "" ;
      gxTv_SdtCliente_Clientenombreemail1 = "" ;
      gxTv_SdtCliente_Clienteemail1 = "" ;
      gxTv_SdtCliente_Clientenombreemail2 = "" ;
      gxTv_SdtCliente_Clienteemail2 = "" ;
      gxTv_SdtCliente_Clienteenvio = "" ;
      gxTv_SdtCliente_Clienteusuarioweb = "" ;
      gxTv_SdtCliente_Clientenombrecelular1 = "" ;
      gxTv_SdtCliente_Clientecelular1 = "" ;
      gxTv_SdtCliente_Clientenombrecelular2 = "" ;
      gxTv_SdtCliente_Clientecelular2 = "" ;
      gxTv_SdtCliente_Clientecodigofigaro = "" ;
      gxTv_SdtCliente_Clientedireccion = "" ;
      gxTv_SdtCliente_Clientenombretelefono1 = "" ;
      gxTv_SdtCliente_Clientetelefono1 = "" ;
      gxTv_SdtCliente_Clientenombretelefono2 = "" ;
      gxTv_SdtCliente_Clientetelefono2 = "" ;
      gxTv_SdtCliente_Clientefax = "" ;
      gxTv_SdtCliente_Clientedicose = "" ;
      gxTv_SdtCliente_Clienteobservaciones = "" ;
      gxTv_SdtCliente_Clientefacrsocial = "" ;
      gxTv_SdtCliente_Clientefaccedula = "" ;
      gxTv_SdtCliente_Clientefacrut = "" ;
      gxTv_SdtCliente_Clientefacdireccion = "" ;
      gxTv_SdtCliente_Clientefaclocalidad = "" ;
      gxTv_SdtCliente_Clientefaccpostal = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono1 = "" ;
      gxTv_SdtCliente_Clientefactelefonos = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono2 = "" ;
      gxTv_SdtCliente_Clientecobtelefono2 = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular1 = "" ;
      gxTv_SdtCliente_Clientecobcelular1 = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular2 = "" ;
      gxTv_SdtCliente_Clientecobcelular2 = "" ;
      gxTv_SdtCliente_Clientecobnombreemail1 = "" ;
      gxTv_SdtCliente_Clientecobemail1 = "" ;
      gxTv_SdtCliente_Clientecobnombreemail2 = "" ;
      gxTv_SdtCliente_Clientecobemail2 = "" ;
      gxTv_SdtCliente_Clientefacfax = "" ;
      gxTv_SdtCliente_Clientefacemail = "" ;
      gxTv_SdtCliente_Clientefaccontrato = "" ;
      gxTv_SdtCliente_Clientefacobservaciones = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos1 = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos2 = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra1 = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra2 = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis1 = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis2 = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral1 = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral2 = "" ;
      gxTv_SdtCliente_Mode = "" ;
      gxTv_SdtCliente_Clientenombre_Z = "" ;
      gxTv_SdtCliente_Clienteemail_Z = "" ;
      gxTv_SdtCliente_Clientenombreemail1_Z = "" ;
      gxTv_SdtCliente_Clienteemail1_Z = "" ;
      gxTv_SdtCliente_Clientenombreemail2_Z = "" ;
      gxTv_SdtCliente_Clienteemail2_Z = "" ;
      gxTv_SdtCliente_Clienteenvio_Z = "" ;
      gxTv_SdtCliente_Clienteusuarioweb_Z = "" ;
      gxTv_SdtCliente_Clientenombrecelular1_Z = "" ;
      gxTv_SdtCliente_Clientecelular1_Z = "" ;
      gxTv_SdtCliente_Clientenombrecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecodigofigaro_Z = "" ;
      gxTv_SdtCliente_Clientedireccion_Z = "" ;
      gxTv_SdtCliente_Clientenombretelefono1_Z = "" ;
      gxTv_SdtCliente_Clientetelefono1_Z = "" ;
      gxTv_SdtCliente_Clientenombretelefono2_Z = "" ;
      gxTv_SdtCliente_Clientetelefono2_Z = "" ;
      gxTv_SdtCliente_Clientefax_Z = "" ;
      gxTv_SdtCliente_Clientedicose_Z = "" ;
      gxTv_SdtCliente_Clienteobservaciones_Z = "" ;
      gxTv_SdtCliente_Clientefacrsocial_Z = "" ;
      gxTv_SdtCliente_Clientefaccedula_Z = "" ;
      gxTv_SdtCliente_Clientefacrut_Z = "" ;
      gxTv_SdtCliente_Clientefacdireccion_Z = "" ;
      gxTv_SdtCliente_Clientefaclocalidad_Z = "" ;
      gxTv_SdtCliente_Clientefaccpostal_Z = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono1_Z = "" ;
      gxTv_SdtCliente_Clientefactelefonos_Z = "" ;
      gxTv_SdtCliente_Clientecobnombretelefono2_Z = "" ;
      gxTv_SdtCliente_Clientecobtelefono2_Z = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular1_Z = "" ;
      gxTv_SdtCliente_Clientecobcelular1_Z = "" ;
      gxTv_SdtCliente_Clientecobnombrecelular2_Z = "" ;
      gxTv_SdtCliente_Clientecobcelular2_Z = "" ;
      gxTv_SdtCliente_Clientecobnombreemail1_Z = "" ;
      gxTv_SdtCliente_Clientecobemail1_Z = "" ;
      gxTv_SdtCliente_Clientecobnombreemail2_Z = "" ;
      gxTv_SdtCliente_Clientecobemail2_Z = "" ;
      gxTv_SdtCliente_Clientefacfax_Z = "" ;
      gxTv_SdtCliente_Clientefacemail_Z = "" ;
      gxTv_SdtCliente_Clientefaccontrato_Z = "" ;
      gxTv_SdtCliente_Clientefacobservaciones_Z = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailfrascos2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailmuestra2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailanalisis2_Z = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral1_Z = "" ;
      gxTv_SdtCliente_Clientenotemailgeneral2_Z = "" ;
      gxTv_SdtCliente_Clientenombre_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombreemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombreemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteenvio_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetipousuario_N = (byte)(1) ;
      gxTv_SdtCliente_Clientedireccion_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefax_N = (byte)(1) ;
      gxTv_SdtCliente_Clientedicose_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetecnico1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientetecnico2_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteidagencia_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecontrato_N = (byte)(1) ;
      gxTv_SdtCliente_Clientesocio_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenousar_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecodbar_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecaravanas_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteprolesa_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteobservaciones_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacrsocial_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccedula_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacrut_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacdireccion_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccpostal_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacgiro_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefactelefonos_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobcelular1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobcelular2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobemail1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientecobemail2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacfax_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacemail_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccontrato_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaclista_N = (byte)(1) ;
      gxTv_SdtCliente_Clientefaccontado_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(1) ;
      gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(1) ;
      gxTv_SdtCliente_Clienteincobrable_N = (byte)(1) ;
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

   public long getClienteid( )
   {
      return gxTv_SdtCliente_Clienteid ;
   }

   public void setClienteid( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteid = value ;
   }

   public String getClientenombre( )
   {
      return gxTv_SdtCliente_Clientenombre ;
   }

   public void setClientenombre( String value )
   {
      gxTv_SdtCliente_Clientenombre_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombre = value ;
   }

   public String getClienteemail( )
   {
      return gxTv_SdtCliente_Clienteemail ;
   }

   public void setClienteemail( String value )
   {
      gxTv_SdtCliente_Clienteemail_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail = value ;
   }

   public String getClientenombreemail1( )
   {
      return gxTv_SdtCliente_Clientenombreemail1 ;
   }

   public void setClientenombreemail1( String value )
   {
      gxTv_SdtCliente_Clientenombreemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail1 = value ;
   }

   public String getClienteemail1( )
   {
      return gxTv_SdtCliente_Clienteemail1 ;
   }

   public void setClienteemail1( String value )
   {
      gxTv_SdtCliente_Clienteemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail1 = value ;
   }

   public String getClientenombreemail2( )
   {
      return gxTv_SdtCliente_Clientenombreemail2 ;
   }

   public void setClientenombreemail2( String value )
   {
      gxTv_SdtCliente_Clientenombreemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail2 = value ;
   }

   public String getClienteemail2( )
   {
      return gxTv_SdtCliente_Clienteemail2 ;
   }

   public void setClienteemail2( String value )
   {
      gxTv_SdtCliente_Clienteemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail2 = value ;
   }

   public String getClienteenvio( )
   {
      return gxTv_SdtCliente_Clienteenvio ;
   }

   public void setClienteenvio( String value )
   {
      gxTv_SdtCliente_Clienteenvio_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteenvio = value ;
   }

   public String getClienteusuarioweb( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb ;
   }

   public void setClienteusuarioweb( String value )
   {
      gxTv_SdtCliente_Clienteusuarioweb_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteusuarioweb = value ;
   }

   public String getClientenombrecelular1( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1 ;
   }

   public void setClientenombrecelular1( String value )
   {
      gxTv_SdtCliente_Clientenombrecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular1 = value ;
   }

   public String getClientecelular1( )
   {
      return gxTv_SdtCliente_Clientecelular1 ;
   }

   public void setClientecelular1( String value )
   {
      gxTv_SdtCliente_Clientecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular1 = value ;
   }

   public String getClientenombrecelular2( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2 ;
   }

   public void setClientenombrecelular2( String value )
   {
      gxTv_SdtCliente_Clientenombrecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular2 = value ;
   }

   public String getClientecelular2( )
   {
      return gxTv_SdtCliente_Clientecelular2 ;
   }

   public void setClientecelular2( String value )
   {
      gxTv_SdtCliente_Clientecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular2 = value ;
   }

   public String getClientecodigofigaro( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro ;
   }

   public void setClientecodigofigaro( String value )
   {
      gxTv_SdtCliente_Clientecodigofigaro_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodigofigaro = value ;
   }

   public short getClientetipousuario( )
   {
      return gxTv_SdtCliente_Clientetipousuario ;
   }

   public void setClientetipousuario( short value )
   {
      gxTv_SdtCliente_Clientetipousuario_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetipousuario = value ;
   }

   public String getClientedireccion( )
   {
      return gxTv_SdtCliente_Clientedireccion ;
   }

   public void setClientedireccion( String value )
   {
      gxTv_SdtCliente_Clientedireccion_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedireccion = value ;
   }

   public String getClientenombretelefono1( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1 ;
   }

   public void setClientenombretelefono1( String value )
   {
      gxTv_SdtCliente_Clientenombretelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono1 = value ;
   }

   public String getClientetelefono1( )
   {
      return gxTv_SdtCliente_Clientetelefono1 ;
   }

   public void setClientetelefono1( String value )
   {
      gxTv_SdtCliente_Clientetelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono1 = value ;
   }

   public String getClientenombretelefono2( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2 ;
   }

   public void setClientenombretelefono2( String value )
   {
      gxTv_SdtCliente_Clientenombretelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono2 = value ;
   }

   public String getClientetelefono2( )
   {
      return gxTv_SdtCliente_Clientetelefono2 ;
   }

   public void setClientetelefono2( String value )
   {
      gxTv_SdtCliente_Clientetelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono2 = value ;
   }

   public String getClientefax( )
   {
      return gxTv_SdtCliente_Clientefax ;
   }

   public void setClientefax( String value )
   {
      gxTv_SdtCliente_Clientefax_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefax = value ;
   }

   public String getClientedicose( )
   {
      return gxTv_SdtCliente_Clientedicose ;
   }

   public void setClientedicose( String value )
   {
      gxTv_SdtCliente_Clientedicose_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedicose = value ;
   }

   public long getClienteiddepartamento( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento ;
   }

   public void setClienteiddepartamento( long value )
   {
      gxTv_SdtCliente_Clienteiddepartamento_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteiddepartamento = value ;
   }

   public long getClienteidlocalidad( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad ;
   }

   public void setClienteidlocalidad( long value )
   {
      gxTv_SdtCliente_Clienteidlocalidad_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidlocalidad = value ;
   }

   public long getClientetecnico1( )
   {
      return gxTv_SdtCliente_Clientetecnico1 ;
   }

   public void setClientetecnico1( long value )
   {
      gxTv_SdtCliente_Clientetecnico1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico1 = value ;
   }

   public long getClientetecnico2( )
   {
      return gxTv_SdtCliente_Clientetecnico2 ;
   }

   public void setClientetecnico2( long value )
   {
      gxTv_SdtCliente_Clientetecnico2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico2 = value ;
   }

   public long getClienteidagencia( )
   {
      return gxTv_SdtCliente_Clienteidagencia ;
   }

   public void setClienteidagencia( long value )
   {
      gxTv_SdtCliente_Clienteidagencia_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidagencia = value ;
   }

   public short getClientecontrato( )
   {
      return gxTv_SdtCliente_Clientecontrato ;
   }

   public void setClientecontrato( short value )
   {
      gxTv_SdtCliente_Clientecontrato_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecontrato = value ;
   }

   public short getClientesocio( )
   {
      return gxTv_SdtCliente_Clientesocio ;
   }

   public void setClientesocio( short value )
   {
      gxTv_SdtCliente_Clientesocio_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientesocio = value ;
   }

   public short getClientenousar( )
   {
      return gxTv_SdtCliente_Clientenousar ;
   }

   public void setClientenousar( short value )
   {
      gxTv_SdtCliente_Clientenousar_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenousar = value ;
   }

   public short getClientecodbar( )
   {
      return gxTv_SdtCliente_Clientecodbar ;
   }

   public void setClientecodbar( short value )
   {
      gxTv_SdtCliente_Clientecodbar_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodbar = value ;
   }

   public short getClientecaravanas( )
   {
      return gxTv_SdtCliente_Clientecaravanas ;
   }

   public void setClientecaravanas( short value )
   {
      gxTv_SdtCliente_Clientecaravanas_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecaravanas = value ;
   }

   public short getClienteprolesa( )
   {
      return gxTv_SdtCliente_Clienteprolesa ;
   }

   public void setClienteprolesa( short value )
   {
      gxTv_SdtCliente_Clienteprolesa_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesa = value ;
   }

   public long getClienteprolesasuc( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc ;
   }

   public void setClienteprolesasuc( long value )
   {
      gxTv_SdtCliente_Clienteprolesasuc_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesasuc = value ;
   }

   public long getClienteprolesamat( )
   {
      return gxTv_SdtCliente_Clienteprolesamat ;
   }

   public void setClienteprolesamat( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesamat = value ;
   }

   public String getClienteobservaciones( )
   {
      return gxTv_SdtCliente_Clienteobservaciones ;
   }

   public void setClienteobservaciones( String value )
   {
      gxTv_SdtCliente_Clienteobservaciones_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteobservaciones = value ;
   }

   public String getClientefacrsocial( )
   {
      return gxTv_SdtCliente_Clientefacrsocial ;
   }

   public void setClientefacrsocial( String value )
   {
      gxTv_SdtCliente_Clientefacrsocial_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrsocial = value ;
   }

   public String getClientefaccedula( )
   {
      return gxTv_SdtCliente_Clientefaccedula ;
   }

   public void setClientefaccedula( String value )
   {
      gxTv_SdtCliente_Clientefaccedula_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccedula = value ;
   }

   public String getClientefacrut( )
   {
      return gxTv_SdtCliente_Clientefacrut ;
   }

   public void setClientefacrut( String value )
   {
      gxTv_SdtCliente_Clientefacrut_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrut = value ;
   }

   public String getClientefacdireccion( )
   {
      return gxTv_SdtCliente_Clientefacdireccion ;
   }

   public void setClientefacdireccion( String value )
   {
      gxTv_SdtCliente_Clientefacdireccion_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdireccion = value ;
   }

   public String getClientefaclocalidad( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad ;
   }

   public void setClientefaclocalidad( String value )
   {
      gxTv_SdtCliente_Clientefaclocalidad_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclocalidad = value ;
   }

   public long getClientefacdepartamento( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento ;
   }

   public void setClientefacdepartamento( long value )
   {
      gxTv_SdtCliente_Clientefacdepartamento_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdepartamento = value ;
   }

   public String getClientefaccpostal( )
   {
      return gxTv_SdtCliente_Clientefaccpostal ;
   }

   public void setClientefaccpostal( String value )
   {
      gxTv_SdtCliente_Clientefaccpostal_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccpostal = value ;
   }

   public long getClientefacgiro( )
   {
      return gxTv_SdtCliente_Clientefacgiro ;
   }

   public void setClientefacgiro( long value )
   {
      gxTv_SdtCliente_Clientefacgiro_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacgiro = value ;
   }

   public String getClientecobnombretelefono1( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1 ;
   }

   public void setClientecobnombretelefono1( String value )
   {
      gxTv_SdtCliente_Clientecobnombretelefono1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono1 = value ;
   }

   public String getClientefactelefonos( )
   {
      return gxTv_SdtCliente_Clientefactelefonos ;
   }

   public void setClientefactelefonos( String value )
   {
      gxTv_SdtCliente_Clientefactelefonos_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefactelefonos = value ;
   }

   public String getClientecobnombretelefono2( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2 ;
   }

   public void setClientecobnombretelefono2( String value )
   {
      gxTv_SdtCliente_Clientecobnombretelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono2 = value ;
   }

   public String getClientecobtelefono2( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2 ;
   }

   public void setClientecobtelefono2( String value )
   {
      gxTv_SdtCliente_Clientecobtelefono2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobtelefono2 = value ;
   }

   public String getClientecobnombrecelular1( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1 ;
   }

   public void setClientecobnombrecelular1( String value )
   {
      gxTv_SdtCliente_Clientecobnombrecelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular1 = value ;
   }

   public String getClientecobcelular1( )
   {
      return gxTv_SdtCliente_Clientecobcelular1 ;
   }

   public void setClientecobcelular1( String value )
   {
      gxTv_SdtCliente_Clientecobcelular1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular1 = value ;
   }

   public String getClientecobnombrecelular2( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2 ;
   }

   public void setClientecobnombrecelular2( String value )
   {
      gxTv_SdtCliente_Clientecobnombrecelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular2 = value ;
   }

   public String getClientecobcelular2( )
   {
      return gxTv_SdtCliente_Clientecobcelular2 ;
   }

   public void setClientecobcelular2( String value )
   {
      gxTv_SdtCliente_Clientecobcelular2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular2 = value ;
   }

   public String getClientecobnombreemail1( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1 ;
   }

   public void setClientecobnombreemail1( String value )
   {
      gxTv_SdtCliente_Clientecobnombreemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail1 = value ;
   }

   public String getClientecobemail1( )
   {
      return gxTv_SdtCliente_Clientecobemail1 ;
   }

   public void setClientecobemail1( String value )
   {
      gxTv_SdtCliente_Clientecobemail1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail1 = value ;
   }

   public String getClientecobnombreemail2( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2 ;
   }

   public void setClientecobnombreemail2( String value )
   {
      gxTv_SdtCliente_Clientecobnombreemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail2 = value ;
   }

   public String getClientecobemail2( )
   {
      return gxTv_SdtCliente_Clientecobemail2 ;
   }

   public void setClientecobemail2( String value )
   {
      gxTv_SdtCliente_Clientecobemail2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail2 = value ;
   }

   public String getClientefacfax( )
   {
      return gxTv_SdtCliente_Clientefacfax ;
   }

   public void setClientefacfax( String value )
   {
      gxTv_SdtCliente_Clientefacfax_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacfax = value ;
   }

   public String getClientefacemail( )
   {
      return gxTv_SdtCliente_Clientefacemail ;
   }

   public void setClientefacemail( String value )
   {
      gxTv_SdtCliente_Clientefacemail_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacemail = value ;
   }

   public String getClientefaccontrato( )
   {
      return gxTv_SdtCliente_Clientefaccontrato ;
   }

   public void setClientefaccontrato( String value )
   {
      gxTv_SdtCliente_Clientefaccontrato_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontrato = value ;
   }

   public String getClientefacobservaciones( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones ;
   }

   public void setClientefacobservaciones( String value )
   {
      gxTv_SdtCliente_Clientefacobservaciones_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacobservaciones = value ;
   }

   public long getClientefaclista( )
   {
      return gxTv_SdtCliente_Clientefaclista ;
   }

   public void setClientefaclista( long value )
   {
      gxTv_SdtCliente_Clientefaclista_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclista = value ;
   }

   public short getClientefaccontado( )
   {
      return gxTv_SdtCliente_Clientefaccontado ;
   }

   public void setClientefaccontado( short value )
   {
      gxTv_SdtCliente_Clientefaccontado_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontado = value ;
   }

   public String getClientenotemailfrascos1( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1 ;
   }

   public void setClientenotemailfrascos1( String value )
   {
      gxTv_SdtCliente_Clientenotemailfrascos1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos1 = value ;
   }

   public String getClientenotemailfrascos2( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2 ;
   }

   public void setClientenotemailfrascos2( String value )
   {
      gxTv_SdtCliente_Clientenotemailfrascos2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos2 = value ;
   }

   public String getClientenotemailmuestra1( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1 ;
   }

   public void setClientenotemailmuestra1( String value )
   {
      gxTv_SdtCliente_Clientenotemailmuestra1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra1 = value ;
   }

   public String getClientenotemailmuestra2( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2 ;
   }

   public void setClientenotemailmuestra2( String value )
   {
      gxTv_SdtCliente_Clientenotemailmuestra2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra2 = value ;
   }

   public String getClientenotemailanalisis1( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1 ;
   }

   public void setClientenotemailanalisis1( String value )
   {
      gxTv_SdtCliente_Clientenotemailanalisis1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis1 = value ;
   }

   public String getClientenotemailanalisis2( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2 ;
   }

   public void setClientenotemailanalisis2( String value )
   {
      gxTv_SdtCliente_Clientenotemailanalisis2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis2 = value ;
   }

   public String getClientenotemailgeneral1( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1 ;
   }

   public void setClientenotemailgeneral1( String value )
   {
      gxTv_SdtCliente_Clientenotemailgeneral1_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral1 = value ;
   }

   public String getClientenotemailgeneral2( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2 ;
   }

   public void setClientenotemailgeneral2( String value )
   {
      gxTv_SdtCliente_Clientenotemailgeneral2_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral2 = value ;
   }

   public short getClienteincobrable( )
   {
      return gxTv_SdtCliente_Clienteincobrable ;
   }

   public void setClienteincobrable( short value )
   {
      gxTv_SdtCliente_Clienteincobrable_N = (byte)(0) ;
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteincobrable = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtCliente_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtCliente_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Initialized = value ;
   }

   public long getClienteid_Z( )
   {
      return gxTv_SdtCliente_Clienteid_Z ;
   }

   public void setClienteid_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteid_Z = value ;
   }

   public String getClientenombre_Z( )
   {
      return gxTv_SdtCliente_Clientenombre_Z ;
   }

   public void setClientenombre_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombre_Z = value ;
   }

   public String getClienteemail_Z( )
   {
      return gxTv_SdtCliente_Clienteemail_Z ;
   }

   public void setClienteemail_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail_Z = value ;
   }

   public String getClientenombreemail1_Z( )
   {
      return gxTv_SdtCliente_Clientenombreemail1_Z ;
   }

   public void setClientenombreemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail1_Z = value ;
   }

   public String getClienteemail1_Z( )
   {
      return gxTv_SdtCliente_Clienteemail1_Z ;
   }

   public void setClienteemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail1_Z = value ;
   }

   public String getClientenombreemail2_Z( )
   {
      return gxTv_SdtCliente_Clientenombreemail2_Z ;
   }

   public void setClientenombreemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail2_Z = value ;
   }

   public String getClienteemail2_Z( )
   {
      return gxTv_SdtCliente_Clienteemail2_Z ;
   }

   public void setClienteemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail2_Z = value ;
   }

   public String getClienteenvio_Z( )
   {
      return gxTv_SdtCliente_Clienteenvio_Z ;
   }

   public void setClienteenvio_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteenvio_Z = value ;
   }

   public String getClienteusuarioweb_Z( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb_Z ;
   }

   public void setClienteusuarioweb_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteusuarioweb_Z = value ;
   }

   public String getClientenombrecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1_Z ;
   }

   public void setClientenombrecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular1_Z = value ;
   }

   public String getClientecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecelular1_Z ;
   }

   public void setClientecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular1_Z = value ;
   }

   public String getClientenombrecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2_Z ;
   }

   public void setClientenombrecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular2_Z = value ;
   }

   public String getClientecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecelular2_Z ;
   }

   public void setClientecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular2_Z = value ;
   }

   public String getClientecodigofigaro_Z( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro_Z ;
   }

   public void setClientecodigofigaro_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodigofigaro_Z = value ;
   }

   public short getClientetipousuario_Z( )
   {
      return gxTv_SdtCliente_Clientetipousuario_Z ;
   }

   public void setClientetipousuario_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetipousuario_Z = value ;
   }

   public String getClientedireccion_Z( )
   {
      return gxTv_SdtCliente_Clientedireccion_Z ;
   }

   public void setClientedireccion_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedireccion_Z = value ;
   }

   public String getClientenombretelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1_Z ;
   }

   public void setClientenombretelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono1_Z = value ;
   }

   public String getClientetelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientetelefono1_Z ;
   }

   public void setClientetelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono1_Z = value ;
   }

   public String getClientenombretelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2_Z ;
   }

   public void setClientenombretelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono2_Z = value ;
   }

   public String getClientetelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientetelefono2_Z ;
   }

   public void setClientetelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono2_Z = value ;
   }

   public String getClientefax_Z( )
   {
      return gxTv_SdtCliente_Clientefax_Z ;
   }

   public void setClientefax_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefax_Z = value ;
   }

   public String getClientedicose_Z( )
   {
      return gxTv_SdtCliente_Clientedicose_Z ;
   }

   public void setClientedicose_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedicose_Z = value ;
   }

   public long getClienteiddepartamento_Z( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento_Z ;
   }

   public void setClienteiddepartamento_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteiddepartamento_Z = value ;
   }

   public long getClienteidlocalidad_Z( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad_Z ;
   }

   public void setClienteidlocalidad_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidlocalidad_Z = value ;
   }

   public long getClientetecnico1_Z( )
   {
      return gxTv_SdtCliente_Clientetecnico1_Z ;
   }

   public void setClientetecnico1_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico1_Z = value ;
   }

   public long getClientetecnico2_Z( )
   {
      return gxTv_SdtCliente_Clientetecnico2_Z ;
   }

   public void setClientetecnico2_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico2_Z = value ;
   }

   public long getClienteidagencia_Z( )
   {
      return gxTv_SdtCliente_Clienteidagencia_Z ;
   }

   public void setClienteidagencia_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidagencia_Z = value ;
   }

   public short getClientecontrato_Z( )
   {
      return gxTv_SdtCliente_Clientecontrato_Z ;
   }

   public void setClientecontrato_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecontrato_Z = value ;
   }

   public short getClientesocio_Z( )
   {
      return gxTv_SdtCliente_Clientesocio_Z ;
   }

   public void setClientesocio_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientesocio_Z = value ;
   }

   public short getClientenousar_Z( )
   {
      return gxTv_SdtCliente_Clientenousar_Z ;
   }

   public void setClientenousar_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenousar_Z = value ;
   }

   public short getClientecodbar_Z( )
   {
      return gxTv_SdtCliente_Clientecodbar_Z ;
   }

   public void setClientecodbar_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodbar_Z = value ;
   }

   public short getClientecaravanas_Z( )
   {
      return gxTv_SdtCliente_Clientecaravanas_Z ;
   }

   public void setClientecaravanas_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecaravanas_Z = value ;
   }

   public short getClienteprolesa_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesa_Z ;
   }

   public void setClienteprolesa_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesa_Z = value ;
   }

   public long getClienteprolesasuc_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc_Z ;
   }

   public void setClienteprolesasuc_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesasuc_Z = value ;
   }

   public long getClienteprolesamat_Z( )
   {
      return gxTv_SdtCliente_Clienteprolesamat_Z ;
   }

   public void setClienteprolesamat_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesamat_Z = value ;
   }

   public String getClienteobservaciones_Z( )
   {
      return gxTv_SdtCliente_Clienteobservaciones_Z ;
   }

   public void setClienteobservaciones_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteobservaciones_Z = value ;
   }

   public String getClientefacrsocial_Z( )
   {
      return gxTv_SdtCliente_Clientefacrsocial_Z ;
   }

   public void setClientefacrsocial_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrsocial_Z = value ;
   }

   public String getClientefaccedula_Z( )
   {
      return gxTv_SdtCliente_Clientefaccedula_Z ;
   }

   public void setClientefaccedula_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccedula_Z = value ;
   }

   public String getClientefacrut_Z( )
   {
      return gxTv_SdtCliente_Clientefacrut_Z ;
   }

   public void setClientefacrut_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrut_Z = value ;
   }

   public String getClientefacdireccion_Z( )
   {
      return gxTv_SdtCliente_Clientefacdireccion_Z ;
   }

   public void setClientefacdireccion_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdireccion_Z = value ;
   }

   public String getClientefaclocalidad_Z( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad_Z ;
   }

   public void setClientefaclocalidad_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclocalidad_Z = value ;
   }

   public long getClientefacdepartamento_Z( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento_Z ;
   }

   public void setClientefacdepartamento_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdepartamento_Z = value ;
   }

   public String getClientefaccpostal_Z( )
   {
      return gxTv_SdtCliente_Clientefaccpostal_Z ;
   }

   public void setClientefaccpostal_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccpostal_Z = value ;
   }

   public long getClientefacgiro_Z( )
   {
      return gxTv_SdtCliente_Clientefacgiro_Z ;
   }

   public void setClientefacgiro_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacgiro_Z = value ;
   }

   public String getClientecobnombretelefono1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1_Z ;
   }

   public void setClientecobnombretelefono1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono1_Z = value ;
   }

   public String getClientefactelefonos_Z( )
   {
      return gxTv_SdtCliente_Clientefactelefonos_Z ;
   }

   public void setClientefactelefonos_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefactelefonos_Z = value ;
   }

   public String getClientecobnombretelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2_Z ;
   }

   public void setClientecobnombretelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono2_Z = value ;
   }

   public String getClientecobtelefono2_Z( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2_Z ;
   }

   public void setClientecobtelefono2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobtelefono2_Z = value ;
   }

   public String getClientecobnombrecelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1_Z ;
   }

   public void setClientecobnombrecelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular1_Z = value ;
   }

   public String getClientecobcelular1_Z( )
   {
      return gxTv_SdtCliente_Clientecobcelular1_Z ;
   }

   public void setClientecobcelular1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular1_Z = value ;
   }

   public String getClientecobnombrecelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2_Z ;
   }

   public void setClientecobnombrecelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular2_Z = value ;
   }

   public String getClientecobcelular2_Z( )
   {
      return gxTv_SdtCliente_Clientecobcelular2_Z ;
   }

   public void setClientecobcelular2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular2_Z = value ;
   }

   public String getClientecobnombreemail1_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1_Z ;
   }

   public void setClientecobnombreemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail1_Z = value ;
   }

   public String getClientecobemail1_Z( )
   {
      return gxTv_SdtCliente_Clientecobemail1_Z ;
   }

   public void setClientecobemail1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail1_Z = value ;
   }

   public String getClientecobnombreemail2_Z( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2_Z ;
   }

   public void setClientecobnombreemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail2_Z = value ;
   }

   public String getClientecobemail2_Z( )
   {
      return gxTv_SdtCliente_Clientecobemail2_Z ;
   }

   public void setClientecobemail2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail2_Z = value ;
   }

   public String getClientefacfax_Z( )
   {
      return gxTv_SdtCliente_Clientefacfax_Z ;
   }

   public void setClientefacfax_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacfax_Z = value ;
   }

   public String getClientefacemail_Z( )
   {
      return gxTv_SdtCliente_Clientefacemail_Z ;
   }

   public void setClientefacemail_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacemail_Z = value ;
   }

   public String getClientefaccontrato_Z( )
   {
      return gxTv_SdtCliente_Clientefaccontrato_Z ;
   }

   public void setClientefaccontrato_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontrato_Z = value ;
   }

   public String getClientefacobservaciones_Z( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones_Z ;
   }

   public void setClientefacobservaciones_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacobservaciones_Z = value ;
   }

   public long getClientefaclista_Z( )
   {
      return gxTv_SdtCliente_Clientefaclista_Z ;
   }

   public void setClientefaclista_Z( long value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclista_Z = value ;
   }

   public short getClientefaccontado_Z( )
   {
      return gxTv_SdtCliente_Clientefaccontado_Z ;
   }

   public void setClientefaccontado_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontado_Z = value ;
   }

   public String getClientenotemailfrascos1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1_Z ;
   }

   public void setClientenotemailfrascos1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos1_Z = value ;
   }

   public String getClientenotemailfrascos2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2_Z ;
   }

   public void setClientenotemailfrascos2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos2_Z = value ;
   }

   public String getClientenotemailmuestra1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1_Z ;
   }

   public void setClientenotemailmuestra1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra1_Z = value ;
   }

   public String getClientenotemailmuestra2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2_Z ;
   }

   public void setClientenotemailmuestra2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra2_Z = value ;
   }

   public String getClientenotemailanalisis1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1_Z ;
   }

   public void setClientenotemailanalisis1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis1_Z = value ;
   }

   public String getClientenotemailanalisis2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2_Z ;
   }

   public void setClientenotemailanalisis2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis2_Z = value ;
   }

   public String getClientenotemailgeneral1_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1_Z ;
   }

   public void setClientenotemailgeneral1_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral1_Z = value ;
   }

   public String getClientenotemailgeneral2_Z( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2_Z ;
   }

   public void setClientenotemailgeneral2_Z( String value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral2_Z = value ;
   }

   public short getClienteincobrable_Z( )
   {
      return gxTv_SdtCliente_Clienteincobrable_Z ;
   }

   public void setClienteincobrable_Z( short value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteincobrable_Z = value ;
   }

   public byte getClientenombre_N( )
   {
      return gxTv_SdtCliente_Clientenombre_N ;
   }

   public void setClientenombre_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombre_N = value ;
   }

   public byte getClienteemail_N( )
   {
      return gxTv_SdtCliente_Clienteemail_N ;
   }

   public void setClienteemail_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail_N = value ;
   }

   public byte getClientenombreemail1_N( )
   {
      return gxTv_SdtCliente_Clientenombreemail1_N ;
   }

   public void setClientenombreemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail1_N = value ;
   }

   public byte getClienteemail1_N( )
   {
      return gxTv_SdtCliente_Clienteemail1_N ;
   }

   public void setClienteemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail1_N = value ;
   }

   public byte getClientenombreemail2_N( )
   {
      return gxTv_SdtCliente_Clientenombreemail2_N ;
   }

   public void setClientenombreemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombreemail2_N = value ;
   }

   public byte getClienteemail2_N( )
   {
      return gxTv_SdtCliente_Clienteemail2_N ;
   }

   public void setClienteemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteemail2_N = value ;
   }

   public byte getClienteenvio_N( )
   {
      return gxTv_SdtCliente_Clienteenvio_N ;
   }

   public void setClienteenvio_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteenvio_N = value ;
   }

   public byte getClienteusuarioweb_N( )
   {
      return gxTv_SdtCliente_Clienteusuarioweb_N ;
   }

   public void setClienteusuarioweb_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteusuarioweb_N = value ;
   }

   public byte getClientenombrecelular1_N( )
   {
      return gxTv_SdtCliente_Clientenombrecelular1_N ;
   }

   public void setClientenombrecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular1_N = value ;
   }

   public byte getClientecelular1_N( )
   {
      return gxTv_SdtCliente_Clientecelular1_N ;
   }

   public void setClientecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular1_N = value ;
   }

   public byte getClientenombrecelular2_N( )
   {
      return gxTv_SdtCliente_Clientenombrecelular2_N ;
   }

   public void setClientenombrecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombrecelular2_N = value ;
   }

   public byte getClientecelular2_N( )
   {
      return gxTv_SdtCliente_Clientecelular2_N ;
   }

   public void setClientecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecelular2_N = value ;
   }

   public byte getClientecodigofigaro_N( )
   {
      return gxTv_SdtCliente_Clientecodigofigaro_N ;
   }

   public void setClientecodigofigaro_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodigofigaro_N = value ;
   }

   public byte getClientetipousuario_N( )
   {
      return gxTv_SdtCliente_Clientetipousuario_N ;
   }

   public void setClientetipousuario_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetipousuario_N = value ;
   }

   public byte getClientedireccion_N( )
   {
      return gxTv_SdtCliente_Clientedireccion_N ;
   }

   public void setClientedireccion_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedireccion_N = value ;
   }

   public byte getClientenombretelefono1_N( )
   {
      return gxTv_SdtCliente_Clientenombretelefono1_N ;
   }

   public void setClientenombretelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono1_N = value ;
   }

   public byte getClientetelefono1_N( )
   {
      return gxTv_SdtCliente_Clientetelefono1_N ;
   }

   public void setClientetelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono1_N = value ;
   }

   public byte getClientenombretelefono2_N( )
   {
      return gxTv_SdtCliente_Clientenombretelefono2_N ;
   }

   public void setClientenombretelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenombretelefono2_N = value ;
   }

   public byte getClientetelefono2_N( )
   {
      return gxTv_SdtCliente_Clientetelefono2_N ;
   }

   public void setClientetelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetelefono2_N = value ;
   }

   public byte getClientefax_N( )
   {
      return gxTv_SdtCliente_Clientefax_N ;
   }

   public void setClientefax_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefax_N = value ;
   }

   public byte getClientedicose_N( )
   {
      return gxTv_SdtCliente_Clientedicose_N ;
   }

   public void setClientedicose_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientedicose_N = value ;
   }

   public byte getClienteiddepartamento_N( )
   {
      return gxTv_SdtCliente_Clienteiddepartamento_N ;
   }

   public void setClienteiddepartamento_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteiddepartamento_N = value ;
   }

   public byte getClienteidlocalidad_N( )
   {
      return gxTv_SdtCliente_Clienteidlocalidad_N ;
   }

   public void setClienteidlocalidad_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidlocalidad_N = value ;
   }

   public byte getClientetecnico1_N( )
   {
      return gxTv_SdtCliente_Clientetecnico1_N ;
   }

   public void setClientetecnico1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico1_N = value ;
   }

   public byte getClientetecnico2_N( )
   {
      return gxTv_SdtCliente_Clientetecnico2_N ;
   }

   public void setClientetecnico2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientetecnico2_N = value ;
   }

   public byte getClienteidagencia_N( )
   {
      return gxTv_SdtCliente_Clienteidagencia_N ;
   }

   public void setClienteidagencia_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteidagencia_N = value ;
   }

   public byte getClientecontrato_N( )
   {
      return gxTv_SdtCliente_Clientecontrato_N ;
   }

   public void setClientecontrato_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecontrato_N = value ;
   }

   public byte getClientesocio_N( )
   {
      return gxTv_SdtCliente_Clientesocio_N ;
   }

   public void setClientesocio_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientesocio_N = value ;
   }

   public byte getClientenousar_N( )
   {
      return gxTv_SdtCliente_Clientenousar_N ;
   }

   public void setClientenousar_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenousar_N = value ;
   }

   public byte getClientecodbar_N( )
   {
      return gxTv_SdtCliente_Clientecodbar_N ;
   }

   public void setClientecodbar_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecodbar_N = value ;
   }

   public byte getClientecaravanas_N( )
   {
      return gxTv_SdtCliente_Clientecaravanas_N ;
   }

   public void setClientecaravanas_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecaravanas_N = value ;
   }

   public byte getClienteprolesa_N( )
   {
      return gxTv_SdtCliente_Clienteprolesa_N ;
   }

   public void setClienteprolesa_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesa_N = value ;
   }

   public byte getClienteprolesasuc_N( )
   {
      return gxTv_SdtCliente_Clienteprolesasuc_N ;
   }

   public void setClienteprolesasuc_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteprolesasuc_N = value ;
   }

   public byte getClienteobservaciones_N( )
   {
      return gxTv_SdtCliente_Clienteobservaciones_N ;
   }

   public void setClienteobservaciones_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteobservaciones_N = value ;
   }

   public byte getClientefacrsocial_N( )
   {
      return gxTv_SdtCliente_Clientefacrsocial_N ;
   }

   public void setClientefacrsocial_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrsocial_N = value ;
   }

   public byte getClientefaccedula_N( )
   {
      return gxTv_SdtCliente_Clientefaccedula_N ;
   }

   public void setClientefaccedula_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccedula_N = value ;
   }

   public byte getClientefacrut_N( )
   {
      return gxTv_SdtCliente_Clientefacrut_N ;
   }

   public void setClientefacrut_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacrut_N = value ;
   }

   public byte getClientefacdireccion_N( )
   {
      return gxTv_SdtCliente_Clientefacdireccion_N ;
   }

   public void setClientefacdireccion_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdireccion_N = value ;
   }

   public byte getClientefaclocalidad_N( )
   {
      return gxTv_SdtCliente_Clientefaclocalidad_N ;
   }

   public void setClientefaclocalidad_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclocalidad_N = value ;
   }

   public byte getClientefacdepartamento_N( )
   {
      return gxTv_SdtCliente_Clientefacdepartamento_N ;
   }

   public void setClientefacdepartamento_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacdepartamento_N = value ;
   }

   public byte getClientefaccpostal_N( )
   {
      return gxTv_SdtCliente_Clientefaccpostal_N ;
   }

   public void setClientefaccpostal_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccpostal_N = value ;
   }

   public byte getClientefacgiro_N( )
   {
      return gxTv_SdtCliente_Clientefacgiro_N ;
   }

   public void setClientefacgiro_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacgiro_N = value ;
   }

   public byte getClientecobnombretelefono1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono1_N ;
   }

   public void setClientecobnombretelefono1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono1_N = value ;
   }

   public byte getClientefactelefonos_N( )
   {
      return gxTv_SdtCliente_Clientefactelefonos_N ;
   }

   public void setClientefactelefonos_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefactelefonos_N = value ;
   }

   public byte getClientecobnombretelefono2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombretelefono2_N ;
   }

   public void setClientecobnombretelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombretelefono2_N = value ;
   }

   public byte getClientecobtelefono2_N( )
   {
      return gxTv_SdtCliente_Clientecobtelefono2_N ;
   }

   public void setClientecobtelefono2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobtelefono2_N = value ;
   }

   public byte getClientecobnombrecelular1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular1_N ;
   }

   public void setClientecobnombrecelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular1_N = value ;
   }

   public byte getClientecobcelular1_N( )
   {
      return gxTv_SdtCliente_Clientecobcelular1_N ;
   }

   public void setClientecobcelular1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular1_N = value ;
   }

   public byte getClientecobnombrecelular2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombrecelular2_N ;
   }

   public void setClientecobnombrecelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombrecelular2_N = value ;
   }

   public byte getClientecobcelular2_N( )
   {
      return gxTv_SdtCliente_Clientecobcelular2_N ;
   }

   public void setClientecobcelular2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobcelular2_N = value ;
   }

   public byte getClientecobnombreemail1_N( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail1_N ;
   }

   public void setClientecobnombreemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail1_N = value ;
   }

   public byte getClientecobemail1_N( )
   {
      return gxTv_SdtCliente_Clientecobemail1_N ;
   }

   public void setClientecobemail1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail1_N = value ;
   }

   public byte getClientecobnombreemail2_N( )
   {
      return gxTv_SdtCliente_Clientecobnombreemail2_N ;
   }

   public void setClientecobnombreemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobnombreemail2_N = value ;
   }

   public byte getClientecobemail2_N( )
   {
      return gxTv_SdtCliente_Clientecobemail2_N ;
   }

   public void setClientecobemail2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientecobemail2_N = value ;
   }

   public byte getClientefacfax_N( )
   {
      return gxTv_SdtCliente_Clientefacfax_N ;
   }

   public void setClientefacfax_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacfax_N = value ;
   }

   public byte getClientefacemail_N( )
   {
      return gxTv_SdtCliente_Clientefacemail_N ;
   }

   public void setClientefacemail_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacemail_N = value ;
   }

   public byte getClientefaccontrato_N( )
   {
      return gxTv_SdtCliente_Clientefaccontrato_N ;
   }

   public void setClientefaccontrato_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontrato_N = value ;
   }

   public byte getClientefacobservaciones_N( )
   {
      return gxTv_SdtCliente_Clientefacobservaciones_N ;
   }

   public void setClientefacobservaciones_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefacobservaciones_N = value ;
   }

   public byte getClientefaclista_N( )
   {
      return gxTv_SdtCliente_Clientefaclista_N ;
   }

   public void setClientefaclista_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaclista_N = value ;
   }

   public byte getClientefaccontado_N( )
   {
      return gxTv_SdtCliente_Clientefaccontado_N ;
   }

   public void setClientefaccontado_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientefaccontado_N = value ;
   }

   public byte getClientenotemailfrascos1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos1_N ;
   }

   public void setClientenotemailfrascos1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos1_N = value ;
   }

   public byte getClientenotemailfrascos2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailfrascos2_N ;
   }

   public void setClientenotemailfrascos2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailfrascos2_N = value ;
   }

   public byte getClientenotemailmuestra1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra1_N ;
   }

   public void setClientenotemailmuestra1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra1_N = value ;
   }

   public byte getClientenotemailmuestra2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailmuestra2_N ;
   }

   public void setClientenotemailmuestra2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailmuestra2_N = value ;
   }

   public byte getClientenotemailanalisis1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis1_N ;
   }

   public void setClientenotemailanalisis1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis1_N = value ;
   }

   public byte getClientenotemailanalisis2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailanalisis2_N ;
   }

   public void setClientenotemailanalisis2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailanalisis2_N = value ;
   }

   public byte getClientenotemailgeneral1_N( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral1_N ;
   }

   public void setClientenotemailgeneral1_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral1_N = value ;
   }

   public byte getClientenotemailgeneral2_N( )
   {
      return gxTv_SdtCliente_Clientenotemailgeneral2_N ;
   }

   public void setClientenotemailgeneral2_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clientenotemailgeneral2_N = value ;
   }

   public byte getClienteincobrable_N( )
   {
      return gxTv_SdtCliente_Clienteincobrable_N ;
   }

   public void setClienteincobrable_N( byte value )
   {
      gxTv_SdtCliente_N = (byte)(0) ;
      gxTv_SdtCliente_Clienteincobrable_N = value ;
   }

   protected byte gxTv_SdtCliente_Clientenombre_N ;
   protected byte gxTv_SdtCliente_Clienteemail_N ;
   protected byte gxTv_SdtCliente_Clientenombreemail1_N ;
   protected byte gxTv_SdtCliente_Clienteemail1_N ;
   protected byte gxTv_SdtCliente_Clientenombreemail2_N ;
   protected byte gxTv_SdtCliente_Clienteemail2_N ;
   protected byte gxTv_SdtCliente_Clienteenvio_N ;
   protected byte gxTv_SdtCliente_Clienteusuarioweb_N ;
   protected byte gxTv_SdtCliente_Clientenombrecelular1_N ;
   protected byte gxTv_SdtCliente_Clientecelular1_N ;
   protected byte gxTv_SdtCliente_Clientenombrecelular2_N ;
   protected byte gxTv_SdtCliente_Clientecelular2_N ;
   protected byte gxTv_SdtCliente_Clientecodigofigaro_N ;
   protected byte gxTv_SdtCliente_Clientetipousuario_N ;
   protected byte gxTv_SdtCliente_Clientedireccion_N ;
   protected byte gxTv_SdtCliente_Clientenombretelefono1_N ;
   protected byte gxTv_SdtCliente_Clientetelefono1_N ;
   protected byte gxTv_SdtCliente_Clientenombretelefono2_N ;
   protected byte gxTv_SdtCliente_Clientetelefono2_N ;
   protected byte gxTv_SdtCliente_Clientefax_N ;
   protected byte gxTv_SdtCliente_Clientedicose_N ;
   protected byte gxTv_SdtCliente_Clienteiddepartamento_N ;
   protected byte gxTv_SdtCliente_Clienteidlocalidad_N ;
   protected byte gxTv_SdtCliente_Clientetecnico1_N ;
   protected byte gxTv_SdtCliente_Clientetecnico2_N ;
   protected byte gxTv_SdtCliente_Clienteidagencia_N ;
   protected byte gxTv_SdtCliente_Clientecontrato_N ;
   protected byte gxTv_SdtCliente_Clientesocio_N ;
   protected byte gxTv_SdtCliente_Clientenousar_N ;
   protected byte gxTv_SdtCliente_Clientecodbar_N ;
   protected byte gxTv_SdtCliente_Clientecaravanas_N ;
   protected byte gxTv_SdtCliente_Clienteprolesa_N ;
   protected byte gxTv_SdtCliente_Clienteprolesasuc_N ;
   protected byte gxTv_SdtCliente_Clienteobservaciones_N ;
   protected byte gxTv_SdtCliente_Clientefacrsocial_N ;
   protected byte gxTv_SdtCliente_Clientefaccedula_N ;
   protected byte gxTv_SdtCliente_Clientefacrut_N ;
   protected byte gxTv_SdtCliente_Clientefacdireccion_N ;
   protected byte gxTv_SdtCliente_Clientefaclocalidad_N ;
   protected byte gxTv_SdtCliente_Clientefacdepartamento_N ;
   protected byte gxTv_SdtCliente_Clientefaccpostal_N ;
   protected byte gxTv_SdtCliente_Clientefacgiro_N ;
   protected byte gxTv_SdtCliente_Clientecobnombretelefono1_N ;
   protected byte gxTv_SdtCliente_Clientefactelefonos_N ;
   protected byte gxTv_SdtCliente_Clientecobnombretelefono2_N ;
   protected byte gxTv_SdtCliente_Clientecobtelefono2_N ;
   protected byte gxTv_SdtCliente_Clientecobnombrecelular1_N ;
   protected byte gxTv_SdtCliente_Clientecobcelular1_N ;
   protected byte gxTv_SdtCliente_Clientecobnombrecelular2_N ;
   protected byte gxTv_SdtCliente_Clientecobcelular2_N ;
   protected byte gxTv_SdtCliente_Clientecobnombreemail1_N ;
   protected byte gxTv_SdtCliente_Clientecobemail1_N ;
   protected byte gxTv_SdtCliente_Clientecobnombreemail2_N ;
   protected byte gxTv_SdtCliente_Clientecobemail2_N ;
   protected byte gxTv_SdtCliente_Clientefacfax_N ;
   protected byte gxTv_SdtCliente_Clientefacemail_N ;
   protected byte gxTv_SdtCliente_Clientefaccontrato_N ;
   protected byte gxTv_SdtCliente_Clientefacobservaciones_N ;
   protected byte gxTv_SdtCliente_Clientefaclista_N ;
   protected byte gxTv_SdtCliente_Clientefaccontado_N ;
   protected byte gxTv_SdtCliente_Clientenotemailfrascos1_N ;
   protected byte gxTv_SdtCliente_Clientenotemailfrascos2_N ;
   protected byte gxTv_SdtCliente_Clientenotemailmuestra1_N ;
   protected byte gxTv_SdtCliente_Clientenotemailmuestra2_N ;
   protected byte gxTv_SdtCliente_Clientenotemailanalisis1_N ;
   protected byte gxTv_SdtCliente_Clientenotemailanalisis2_N ;
   protected byte gxTv_SdtCliente_Clientenotemailgeneral1_N ;
   protected byte gxTv_SdtCliente_Clientenotemailgeneral2_N ;
   protected byte gxTv_SdtCliente_Clienteincobrable_N ;
   private byte gxTv_SdtCliente_N ;
   protected short gxTv_SdtCliente_Clientetipousuario ;
   protected short gxTv_SdtCliente_Clientecontrato ;
   protected short gxTv_SdtCliente_Clientesocio ;
   protected short gxTv_SdtCliente_Clientenousar ;
   protected short gxTv_SdtCliente_Clientecodbar ;
   protected short gxTv_SdtCliente_Clientecaravanas ;
   protected short gxTv_SdtCliente_Clienteprolesa ;
   protected short gxTv_SdtCliente_Clientefaccontado ;
   protected short gxTv_SdtCliente_Clienteincobrable ;
   protected short gxTv_SdtCliente_Initialized ;
   protected short gxTv_SdtCliente_Clientetipousuario_Z ;
   protected short gxTv_SdtCliente_Clientecontrato_Z ;
   protected short gxTv_SdtCliente_Clientesocio_Z ;
   protected short gxTv_SdtCliente_Clientenousar_Z ;
   protected short gxTv_SdtCliente_Clientecodbar_Z ;
   protected short gxTv_SdtCliente_Clientecaravanas_Z ;
   protected short gxTv_SdtCliente_Clienteprolesa_Z ;
   protected short gxTv_SdtCliente_Clientefaccontado_Z ;
   protected short gxTv_SdtCliente_Clienteincobrable_Z ;
   protected long gxTv_SdtCliente_Clienteid ;
   protected long gxTv_SdtCliente_Clienteiddepartamento ;
   protected long gxTv_SdtCliente_Clienteidlocalidad ;
   protected long gxTv_SdtCliente_Clientetecnico1 ;
   protected long gxTv_SdtCliente_Clientetecnico2 ;
   protected long gxTv_SdtCliente_Clienteidagencia ;
   protected long gxTv_SdtCliente_Clienteprolesasuc ;
   protected long gxTv_SdtCliente_Clienteprolesamat ;
   protected long gxTv_SdtCliente_Clientefacdepartamento ;
   protected long gxTv_SdtCliente_Clientefacgiro ;
   protected long gxTv_SdtCliente_Clientefaclista ;
   protected long gxTv_SdtCliente_Clienteid_Z ;
   protected long gxTv_SdtCliente_Clienteiddepartamento_Z ;
   protected long gxTv_SdtCliente_Clienteidlocalidad_Z ;
   protected long gxTv_SdtCliente_Clientetecnico1_Z ;
   protected long gxTv_SdtCliente_Clientetecnico2_Z ;
   protected long gxTv_SdtCliente_Clienteidagencia_Z ;
   protected long gxTv_SdtCliente_Clienteprolesasuc_Z ;
   protected long gxTv_SdtCliente_Clienteprolesamat_Z ;
   protected long gxTv_SdtCliente_Clientefacdepartamento_Z ;
   protected long gxTv_SdtCliente_Clientefacgiro_Z ;
   protected long gxTv_SdtCliente_Clientefaclista_Z ;
   protected String gxTv_SdtCliente_Mode ;
   protected String gxTv_SdtCliente_Clientenombre ;
   protected String gxTv_SdtCliente_Clienteemail ;
   protected String gxTv_SdtCliente_Clientenombreemail1 ;
   protected String gxTv_SdtCliente_Clienteemail1 ;
   protected String gxTv_SdtCliente_Clientenombreemail2 ;
   protected String gxTv_SdtCliente_Clienteemail2 ;
   protected String gxTv_SdtCliente_Clienteenvio ;
   protected String gxTv_SdtCliente_Clienteusuarioweb ;
   protected String gxTv_SdtCliente_Clientenombrecelular1 ;
   protected String gxTv_SdtCliente_Clientecelular1 ;
   protected String gxTv_SdtCliente_Clientenombrecelular2 ;
   protected String gxTv_SdtCliente_Clientecelular2 ;
   protected String gxTv_SdtCliente_Clientecodigofigaro ;
   protected String gxTv_SdtCliente_Clientedireccion ;
   protected String gxTv_SdtCliente_Clientenombretelefono1 ;
   protected String gxTv_SdtCliente_Clientetelefono1 ;
   protected String gxTv_SdtCliente_Clientenombretelefono2 ;
   protected String gxTv_SdtCliente_Clientetelefono2 ;
   protected String gxTv_SdtCliente_Clientefax ;
   protected String gxTv_SdtCliente_Clientedicose ;
   protected String gxTv_SdtCliente_Clienteobservaciones ;
   protected String gxTv_SdtCliente_Clientefacrsocial ;
   protected String gxTv_SdtCliente_Clientefaccedula ;
   protected String gxTv_SdtCliente_Clientefacrut ;
   protected String gxTv_SdtCliente_Clientefacdireccion ;
   protected String gxTv_SdtCliente_Clientefaclocalidad ;
   protected String gxTv_SdtCliente_Clientefaccpostal ;
   protected String gxTv_SdtCliente_Clientecobnombretelefono1 ;
   protected String gxTv_SdtCliente_Clientefactelefonos ;
   protected String gxTv_SdtCliente_Clientecobnombretelefono2 ;
   protected String gxTv_SdtCliente_Clientecobtelefono2 ;
   protected String gxTv_SdtCliente_Clientecobnombrecelular1 ;
   protected String gxTv_SdtCliente_Clientecobcelular1 ;
   protected String gxTv_SdtCliente_Clientecobnombrecelular2 ;
   protected String gxTv_SdtCliente_Clientecobcelular2 ;
   protected String gxTv_SdtCliente_Clientecobnombreemail1 ;
   protected String gxTv_SdtCliente_Clientecobemail1 ;
   protected String gxTv_SdtCliente_Clientecobnombreemail2 ;
   protected String gxTv_SdtCliente_Clientecobemail2 ;
   protected String gxTv_SdtCliente_Clientefacfax ;
   protected String gxTv_SdtCliente_Clientefacemail ;
   protected String gxTv_SdtCliente_Clientefaccontrato ;
   protected String gxTv_SdtCliente_Clientefacobservaciones ;
   protected String gxTv_SdtCliente_Clientenotemailfrascos1 ;
   protected String gxTv_SdtCliente_Clientenotemailfrascos2 ;
   protected String gxTv_SdtCliente_Clientenotemailmuestra1 ;
   protected String gxTv_SdtCliente_Clientenotemailmuestra2 ;
   protected String gxTv_SdtCliente_Clientenotemailanalisis1 ;
   protected String gxTv_SdtCliente_Clientenotemailanalisis2 ;
   protected String gxTv_SdtCliente_Clientenotemailgeneral1 ;
   protected String gxTv_SdtCliente_Clientenotemailgeneral2 ;
   protected String gxTv_SdtCliente_Clientenombre_Z ;
   protected String gxTv_SdtCliente_Clienteemail_Z ;
   protected String gxTv_SdtCliente_Clientenombreemail1_Z ;
   protected String gxTv_SdtCliente_Clienteemail1_Z ;
   protected String gxTv_SdtCliente_Clientenombreemail2_Z ;
   protected String gxTv_SdtCliente_Clienteemail2_Z ;
   protected String gxTv_SdtCliente_Clienteenvio_Z ;
   protected String gxTv_SdtCliente_Clienteusuarioweb_Z ;
   protected String gxTv_SdtCliente_Clientenombrecelular1_Z ;
   protected String gxTv_SdtCliente_Clientecelular1_Z ;
   protected String gxTv_SdtCliente_Clientenombrecelular2_Z ;
   protected String gxTv_SdtCliente_Clientecelular2_Z ;
   protected String gxTv_SdtCliente_Clientecodigofigaro_Z ;
   protected String gxTv_SdtCliente_Clientedireccion_Z ;
   protected String gxTv_SdtCliente_Clientenombretelefono1_Z ;
   protected String gxTv_SdtCliente_Clientetelefono1_Z ;
   protected String gxTv_SdtCliente_Clientenombretelefono2_Z ;
   protected String gxTv_SdtCliente_Clientetelefono2_Z ;
   protected String gxTv_SdtCliente_Clientefax_Z ;
   protected String gxTv_SdtCliente_Clientedicose_Z ;
   protected String gxTv_SdtCliente_Clienteobservaciones_Z ;
   protected String gxTv_SdtCliente_Clientefacrsocial_Z ;
   protected String gxTv_SdtCliente_Clientefaccedula_Z ;
   protected String gxTv_SdtCliente_Clientefacrut_Z ;
   protected String gxTv_SdtCliente_Clientefacdireccion_Z ;
   protected String gxTv_SdtCliente_Clientefaclocalidad_Z ;
   protected String gxTv_SdtCliente_Clientefaccpostal_Z ;
   protected String gxTv_SdtCliente_Clientecobnombretelefono1_Z ;
   protected String gxTv_SdtCliente_Clientefactelefonos_Z ;
   protected String gxTv_SdtCliente_Clientecobnombretelefono2_Z ;
   protected String gxTv_SdtCliente_Clientecobtelefono2_Z ;
   protected String gxTv_SdtCliente_Clientecobnombrecelular1_Z ;
   protected String gxTv_SdtCliente_Clientecobcelular1_Z ;
   protected String gxTv_SdtCliente_Clientecobnombrecelular2_Z ;
   protected String gxTv_SdtCliente_Clientecobcelular2_Z ;
   protected String gxTv_SdtCliente_Clientecobnombreemail1_Z ;
   protected String gxTv_SdtCliente_Clientecobemail1_Z ;
   protected String gxTv_SdtCliente_Clientecobnombreemail2_Z ;
   protected String gxTv_SdtCliente_Clientecobemail2_Z ;
   protected String gxTv_SdtCliente_Clientefacfax_Z ;
   protected String gxTv_SdtCliente_Clientefacemail_Z ;
   protected String gxTv_SdtCliente_Clientefaccontrato_Z ;
   protected String gxTv_SdtCliente_Clientefacobservaciones_Z ;
   protected String gxTv_SdtCliente_Clientenotemailfrascos1_Z ;
   protected String gxTv_SdtCliente_Clientenotemailfrascos2_Z ;
   protected String gxTv_SdtCliente_Clientenotemailmuestra1_Z ;
   protected String gxTv_SdtCliente_Clientenotemailmuestra2_Z ;
   protected String gxTv_SdtCliente_Clientenotemailanalisis1_Z ;
   protected String gxTv_SdtCliente_Clientenotemailanalisis2_Z ;
   protected String gxTv_SdtCliente_Clientenotemailgeneral1_Z ;
   protected String gxTv_SdtCliente_Clientenotemailgeneral2_Z ;
}

