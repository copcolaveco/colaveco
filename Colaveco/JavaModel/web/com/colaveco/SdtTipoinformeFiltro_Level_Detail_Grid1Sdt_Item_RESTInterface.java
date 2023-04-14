package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "TipoinformeFiltro_Level_Detail_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item>
{
   public SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item ());
   }

   public SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("Tipoinformelist")
   public Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface> getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist( )
   {
      return SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterfacefromGXObjectCollection(((com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist()) ;
   }

   @JsonProperty("Tipoinformelist")
   public void setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist(  Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface> Value )
   {
      ((com.colaveco.SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtTipoinformeFiltro_Level_Detail_Grid1Sdt_Item_Tipoinformelist(SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterfacetoGXObjectCollection( Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface> collection )
   {
      GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> result = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinforme.SDTTipoinformeItem", "Colaveco.SDTTipoinforme", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface> SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> collection )
   {
      Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface> result = new Vector<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem_RESTInterface((com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)collection.elementAt(i)));
      }
      return result ;
   }

}

