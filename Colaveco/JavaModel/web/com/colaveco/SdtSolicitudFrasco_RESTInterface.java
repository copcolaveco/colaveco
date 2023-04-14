package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SolicitudFrasco", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSolicitudFrasco_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSolicitudFrasco>
{
   public SdtSolicitudFrasco_RESTInterface( )
   {
      super(new com.colaveco.SdtSolicitudFrasco (-1));
   }

   public SdtSolicitudFrasco_RESTInterface( com.colaveco.SdtSolicitudFrasco psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("SFId")
   public String getgxTv_SdtSolicitudFrasco_Sfid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudFrasco_Sfid(), 18, 0)) ;
   }

   @JsonProperty("SFId")
   public void setgxTv_SdtSolicitudFrasco_Sfid(  String Value )
   {
      sdt.setgxTv_SdtSolicitudFrasco_Sfid( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("SFIdNet")
   public String getgxTv_SdtSolicitudFrasco_Sfidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudFrasco_Sfidnet(), 18, 0)) ;
   }

   @JsonProperty("SFIdNet")
   public void setgxTv_SdtSolicitudFrasco_Sfidnet(  String Value )
   {
      sdt.setgxTv_SdtSolicitudFrasco_Sfidnet( GXutil.lval( Value) );
   }


   @GxSeudo
   @JsonProperty("SFNombre")
   public String getgxTv_SdtSolicitudFrasco_Sfnombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sfnombre()) ;
   }

   @JsonProperty("SFNombre")
   public void setgxTv_SdtSolicitudFrasco_Sfnombre(  String Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfnombre(Value);
   }


   @GxSeudo
   @JsonProperty("SFDireccion")
   public String getgxTv_SdtSolicitudFrasco_Sfdireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sfdireccion()) ;
   }

   @JsonProperty("SFDireccion")
   public void setgxTv_SdtSolicitudFrasco_Sfdireccion(  String Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfdireccion(Value);
   }


   @GxSeudo
   @JsonProperty("SFAgencia")
   public Short getgxTv_SdtSolicitudFrasco_Sfagencia( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sfagencia() ;
   }

   @JsonProperty("SFAgencia")
   public void setgxTv_SdtSolicitudFrasco_Sfagencia(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfagencia(Value);
   }


   @GxSeudo
   @JsonProperty("SFTelefono")
   public String getgxTv_SdtSolicitudFrasco_Sftelefono( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sftelefono()) ;
   }

   @JsonProperty("SFTelefono")
   public void setgxTv_SdtSolicitudFrasco_Sftelefono(  String Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sftelefono(Value);
   }


   @GxSeudo
   @JsonProperty("SFEmail")
   public String getgxTv_SdtSolicitudFrasco_Sfemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sfemail()) ;
   }

   @JsonProperty("SFEmail")
   public void setgxTv_SdtSolicitudFrasco_Sfemail(  String Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfemail(Value);
   }


   @GxSeudo
   @JsonProperty("SFFrascosConC")
   public Short getgxTv_SdtSolicitudFrasco_Sffrascosconc( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sffrascosconc() ;
   }

   @JsonProperty("SFFrascosConC")
   public void setgxTv_SdtSolicitudFrasco_Sffrascosconc(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosconc(Value);
   }


   @GxSeudo
   @JsonProperty("SFFrascosSinC")
   public Short getgxTv_SdtSolicitudFrasco_Sffrascossinc( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sffrascossinc() ;
   }

   @JsonProperty("SFFrascosSinC")
   public void setgxTv_SdtSolicitudFrasco_Sffrascossinc(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascossinc(Value);
   }


   @GxSeudo
   @JsonProperty("SFFrascosAgua")
   public Short getgxTv_SdtSolicitudFrasco_Sffrascosagua( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sffrascosagua() ;
   }

   @JsonProperty("SFFrascosAgua")
   public void setgxTv_SdtSolicitudFrasco_Sffrascosagua(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosagua(Value);
   }


   @GxSeudo
   @JsonProperty("SFFrascosSangre")
   public Short getgxTv_SdtSolicitudFrasco_Sffrascossangre( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sffrascossangre() ;
   }

   @JsonProperty("SFFrascosSangre")
   public void setgxTv_SdtSolicitudFrasco_Sffrascossangre(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascossangre(Value);
   }


   @GxSeudo
   @JsonProperty("SFObservaciones")
   public String getgxTv_SdtSolicitudFrasco_Sfobservaciones( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sfobservaciones()) ;
   }

   @JsonProperty("SFObservaciones")
   public void setgxTv_SdtSolicitudFrasco_Sfobservaciones(  String Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfobservaciones(Value);
   }


   @GxSeudo
   @JsonProperty("SFFechaCreacion")
   public String getgxTv_SdtSolicitudFrasco_Sffechacreacion( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtSolicitudFrasco_Sffechacreacion()) ;
   }

   @JsonProperty("SFFechaCreacion")
   public void setgxTv_SdtSolicitudFrasco_Sffechacreacion(  String Value )
   {
      sdt.setgxTv_SdtSolicitudFrasco_Sffechacreacion( GXutil.charToTimeREST( Value) );
   }


   @GxSeudo
   @JsonProperty("SFFechaModificado")
   public String getgxTv_SdtSolicitudFrasco_Sffechamodificado( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtSolicitudFrasco_Sffechamodificado()) ;
   }

   @JsonProperty("SFFechaModificado")
   public void setgxTv_SdtSolicitudFrasco_Sffechamodificado(  String Value )
   {
      sdt.setgxTv_SdtSolicitudFrasco_Sffechamodificado( GXutil.charToTimeREST( Value) );
   }


   @GxSeudo
   @JsonProperty("SFFrascosIsopo")
   public Short getgxTv_SdtSolicitudFrasco_Sffrascosisopo( )
   {
      return ((com.colaveco.SdtSolicitudFrasco)getSdt()).getgxTv_SdtSolicitudFrasco_Sffrascosisopo() ;
   }

   @JsonProperty("SFFrascosIsopo")
   public void setgxTv_SdtSolicitudFrasco_Sffrascosisopo(  Short Value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosisopo(Value);
   }


   public void copyFrom( com.colaveco.SdtSolicitudFrasco_RESTInterface value )
   {
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfid(((com.colaveco.SdtSolicitudFrasco)value.getSdt()).getgxTv_SdtSolicitudFrasco_Sfid());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfidnet(((com.colaveco.SdtSolicitudFrasco)value.getSdt()).getgxTv_SdtSolicitudFrasco_Sfidnet());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfnombre(value.getgxTv_SdtSolicitudFrasco_Sfnombre());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfdireccion(value.getgxTv_SdtSolicitudFrasco_Sfdireccion());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfagencia(value.getgxTv_SdtSolicitudFrasco_Sfagencia());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sftelefono(value.getgxTv_SdtSolicitudFrasco_Sftelefono());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfemail(value.getgxTv_SdtSolicitudFrasco_Sfemail());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosconc(value.getgxTv_SdtSolicitudFrasco_Sffrascosconc());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascossinc(value.getgxTv_SdtSolicitudFrasco_Sffrascossinc());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosagua(value.getgxTv_SdtSolicitudFrasco_Sffrascosagua());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascossangre(value.getgxTv_SdtSolicitudFrasco_Sffrascossangre());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sfobservaciones(value.getgxTv_SdtSolicitudFrasco_Sfobservaciones());
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffechacreacion(GXutil.DateTimefromTimeZone(((com.colaveco.SdtSolicitudFrasco)value.getSdt()).getgxTv_SdtSolicitudFrasco_Sffechacreacion(), "Etc/UTC"));
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffechamodificado(GXutil.DateTimefromTimeZone(((com.colaveco.SdtSolicitudFrasco)value.getSdt()).getgxTv_SdtSolicitudFrasco_Sffechamodificado(), "Etc/UTC"));
      ((com.colaveco.SdtSolicitudFrasco)getSdt()).setgxTv_SdtSolicitudFrasco_Sffrascosisopo(value.getgxTv_SdtSolicitudFrasco_Sffrascosisopo());
   }

   @JsonProperty("gx_md5_hash")
   public String getHash( )
   {
      if ( GXutil.strcmp(md5Hash, null) == 0 )
      {
         md5Hash = super.getHash() ;
      }
      return md5Hash ;
   }

   @JsonProperty("gx_md5_hash")
   public void setHash(  String Value )
   {
      md5Hash = Value ;
   }


   private String md5Hash ;
}

