package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SolicitudfrascoInsert_Level_DetailSdt", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSolicitudfrascoInsert_Level_DetailSdt_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt>
{
   public SdtSolicitudfrascoInsert_Level_DetailSdt_RESTInterface( )
   {
      super(new com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt ());
   }

   public SdtSolicitudfrascoInsert_Level_DetailSdt_RESTInterface( com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt psdt )
   {
      super(psdt);
   }

   @JsonProperty("Usuarioidnet")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet(), 18, 0)) ;
   }

   @JsonProperty("Usuarioidnet")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet(  String Value )
   {
      sdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioidnet( GXutil.lval( Value) );
   }


   @JsonProperty("Usuarionombre")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre()) ;
   }

   @JsonProperty("Usuarionombre")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarionombre(Value);
   }


   @JsonProperty("Usuariodireccion")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion()) ;
   }

   @JsonProperty("Usuariodireccion")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariodireccion(Value);
   }


   @JsonProperty("Agencianombre")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre()) ;
   }

   @JsonProperty("Agencianombre")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Agencianombre(Value);
   }


   @JsonProperty("Usuariotecnicotelefono1")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1()) ;
   }

   @JsonProperty("Usuariotecnicotelefono1")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuariotecnicotelefono1(Value);
   }


   @JsonProperty("Usuarioemail")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail()) ;
   }

   @JsonProperty("Usuarioemail")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Usuarioemail(Value);
   }


   @JsonProperty("Sffrascosconc")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc() ;
   }

   @JsonProperty("Sffrascosconc")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosconc(Value);
   }


   @JsonProperty("Sffrascossinc")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc() ;
   }

   @JsonProperty("Sffrascossinc")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossinc(Value);
   }


   @JsonProperty("Sffrascosagua")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua() ;
   }

   @JsonProperty("Sffrascosagua")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosagua(Value);
   }


   @JsonProperty("Sffrascossangre")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre() ;
   }

   @JsonProperty("Sffrascossangre")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascossangre(Value);
   }


   @JsonProperty("Sffrascosisopo")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo() ;
   }

   @JsonProperty("Sffrascosisopo")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sffrascosisopo(Value);
   }


   @JsonProperty("Sfobservaciones")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones()) ;
   }

   @JsonProperty("Sfobservaciones")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_DetailSdt)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sfobservaciones(Value);
   }


   @JsonProperty("Sdtagenciaid")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid(), 18, 0)) ;
   }

   @JsonProperty("Sdtagenciaid")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid(  String Value )
   {
      sdt.setgxTv_SdtSolicitudfrascoInsert_Level_DetailSdt_Sdtagenciaid( GXutil.lval( Value) );
   }


   int remoteHandle = -1;
}

