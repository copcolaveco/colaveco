package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "ResultadoList_Level_Detail_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item>
{
   public SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item ());
   }

   public SdtResultadoList_Level_Detail_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("Sdtresultadolist")
   public Vector<com.colaveco.SdtSDTResultado_RESTInterface> getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist( )
   {
      return SdtSDTResultado_RESTInterfacefromGXObjectCollection(((com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist()) ;
   }

   @JsonProperty("Sdtresultadolist")
   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist(  Vector<com.colaveco.SdtSDTResultado_RESTInterface> Value )
   {
      ((com.colaveco.SdtResultadoList_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Sdtresultadolist(SdtSDTResultado_RESTInterfacetoGXObjectCollection(Value));
   }


   @JsonProperty("Tipoinformeid")
   public String getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid(), 18, 0)) ;
   }

   @JsonProperty("Tipoinformeid")
   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid(  String Value )
   {
      sdt.setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Tipoinformeid( GXutil.lval( Value) );
   }


   @JsonProperty("Externalid")
   public String getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid(), 18, 0)) ;
   }

   @JsonProperty("Externalid")
   public void setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid(  String Value )
   {
      sdt.setgxTv_SdtResultadoList_Level_Detail_Grid1Sdt_Item_Externalid( GXutil.lval( Value) );
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> SdtSDTResultado_RESTInterfacetoGXObjectCollection( Vector<com.colaveco.SdtSDTResultado_RESTInterface> collection )
   {
      GXBaseCollection<com.colaveco.SdtSDTResultado> result = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((com.colaveco.SdtSDTResultado)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.colaveco.SdtSDTResultado_RESTInterface> SdtSDTResultado_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtSDTResultado> collection )
   {
      Vector<com.colaveco.SdtSDTResultado_RESTInterface> result = new Vector<com.colaveco.SdtSDTResultado_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtSDTResultado_RESTInterface((com.colaveco.SdtSDTResultado)collection.elementAt(i)));
      }
      return result ;
   }

}

