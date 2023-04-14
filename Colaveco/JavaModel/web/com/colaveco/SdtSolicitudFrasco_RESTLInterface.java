package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SolicitudFrasco", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSolicitudFrasco_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtSolicitudFrasco>
{
   public SdtSolicitudFrasco_RESTLInterface( )
   {
      super(new com.colaveco.SdtSolicitudFrasco (-1));
   }

   public SdtSolicitudFrasco_RESTLInterface( com.colaveco.SdtSolicitudFrasco psdt )
   {
      super(psdt);
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


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
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
}

