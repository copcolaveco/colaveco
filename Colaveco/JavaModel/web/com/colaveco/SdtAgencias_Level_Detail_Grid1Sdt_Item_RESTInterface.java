package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Agencias_Level_Detail_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item>
{
   public SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item ());
   }

   public SdtAgencias_Level_Detail_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("Sdtagencia")
   public Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface> getgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia( )
   {
      return SdtSDTAgencia_SDTAgenciaItem_RESTInterfacefromGXObjectCollection(((com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia()) ;
   }

   @JsonProperty("Sdtagencia")
   public void setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia(  Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface> Value )
   {
      ((com.colaveco.SdtAgencias_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtAgencias_Level_Detail_Grid1Sdt_Item_Sdtagencia(SdtSDTAgencia_SDTAgenciaItem_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> SdtSDTAgencia_SDTAgenciaItem_RESTInterfacetoGXObjectCollection( Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface> collection )
   {
      GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> result = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgencia.SDTAgenciaItem", "Colaveco.SDTAgencia", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((com.colaveco.SdtSDTAgencia_SDTAgenciaItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface> SdtSDTAgencia_SDTAgenciaItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> collection )
   {
      Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface> result = new Vector<com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.colaveco.SdtSDTAgencia_SDTAgenciaItem_RESTInterface((com.colaveco.SdtSDTAgencia_SDTAgenciaItem)collection.elementAt(i)));
      }
      return result ;
   }

}

