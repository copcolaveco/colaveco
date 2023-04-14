package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt>
{
   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt ());
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_RESTInterface( com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("SFId")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid(), 18, 0)) ;
   }

   @JsonProperty("SFId")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfid( GXutil.lval( Value) );
   }


   @JsonProperty("SFIdNet")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet(), 18, 0)) ;
   }

   @JsonProperty("SFIdNet")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfidnet( GXutil.lval( Value) );
   }


   @JsonProperty("SFNombre")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre()) ;
   }

   @JsonProperty("SFNombre")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfnombre(Value);
   }


   @JsonProperty("SFDireccion")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion()) ;
   }

   @JsonProperty("SFDireccion")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfdireccion(Value);
   }


   @JsonProperty("SFAgencia")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia() ;
   }

   @JsonProperty("SFAgencia")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfagencia(Value);
   }


   @JsonProperty("SFTelefono")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono()) ;
   }

   @JsonProperty("SFTelefono")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sftelefono(Value);
   }


   @JsonProperty("SFEmail")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail()) ;
   }

   @JsonProperty("SFEmail")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfemail(Value);
   }


   @JsonProperty("SFFrascosConC")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc() ;
   }

   @JsonProperty("SFFrascosConC")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosconc(Value);
   }


   @JsonProperty("SFFrascosSinC")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc() ;
   }

   @JsonProperty("SFFrascosSinC")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossinc(Value);
   }


   @JsonProperty("SFFrascosAgua")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua() ;
   }

   @JsonProperty("SFFrascosAgua")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosagua(Value);
   }


   @JsonProperty("SFFrascosSangre")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre() ;
   }

   @JsonProperty("SFFrascosSangre")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascossangre(Value);
   }


   @JsonProperty("SFObservaciones")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones()) ;
   }

   @JsonProperty("SFObservaciones")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sfobservaciones(Value);
   }


   @JsonProperty("SFFechaCreacion")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion()) ;
   }

   @JsonProperty("SFFechaCreacion")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechacreacion( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("SFFechaModificado")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado( )
   {
      return GXutil.timeToCharREST( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado()) ;
   }

   @JsonProperty("SFFechaModificado")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffechamodificado( GXutil.charToTimeREST( Value) );
   }


   @JsonProperty("SFFrascosIsopo")
   public Short getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo( )
   {
      return ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo() ;
   }

   @JsonProperty("SFFrascosIsopo")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo(  Short Value )
   {
      ((com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt)getSdt()).setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_Section_GeneralSdt_Sffrascosisopo(Value);
   }


   int remoteHandle = -1;
}

