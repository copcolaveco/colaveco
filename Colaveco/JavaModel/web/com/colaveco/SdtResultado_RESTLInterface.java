package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Resultado", namespace ="Colaveco")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtResultado_RESTLInterface extends GxGenericCollectionItem<com.colaveco.SdtResultado>
{
   public SdtResultado_RESTLInterface( )
   {
      super(new com.colaveco.SdtResultado (-1));
   }

   public SdtResultado_RESTLInterface( com.colaveco.SdtResultado psdt )
   {
      super(psdt);
   }

   @GxSeudo
   @JsonProperty("resultadoFicha")
   public String getgxTv_SdtResultado_Resultadoficha( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultado_Resultadoficha(), 18, 0)) ;
   }

   @JsonProperty("resultadoFicha")
   public void setgxTv_SdtResultado_Resultadoficha(  String Value )
   {
      sdt.setgxTv_SdtResultado_Resultadoficha( GXutil.lval( Value) );
   }


   @JsonProperty("uri")
   public String URI( )
   {
      return "" ;
   }

   private int startRow ;
   private int maxRows ;
   private boolean n7resultadoFicha ;
   private boolean n8resultadoComentarios ;
   private boolean n9resultadoUserId ;
   private boolean n10resultadoTypeId ;
   private boolean n11resultadoIdNetUsuario ;
   private boolean n12resultadoFechaCreado ;
   private boolean n13resultadoFechaEmision ;
   private boolean n14resultadoPathExcel ;
   private boolean n15resultadoPathPdf ;
   private boolean n16resultadoPathCsv ;
   private boolean n17resultadoIdEstado ;
   private boolean n18resultadoIdLibro ;
   private boolean n19resultadoEliminado ;
   private boolean n20resultadoAbonado ;
}

