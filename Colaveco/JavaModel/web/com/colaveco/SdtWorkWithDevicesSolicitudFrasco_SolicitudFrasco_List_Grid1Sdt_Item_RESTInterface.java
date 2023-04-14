package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item>
{
   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item ());
   }

   public SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("SFId")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid(), 18, 0)) ;
   }

   @JsonProperty("SFId")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfid( GXutil.lval( Value) );
   }


   @JsonProperty("SFIdNet")
   public String getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet(), 18, 0)) ;
   }

   @JsonProperty("SFIdNet")
   public void setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesSolicitudFrasco_SolicitudFrasco_List_Grid1Sdt_Item_Sfidnet( GXutil.lval( Value) );
   }


   int remoteHandle = -1;
}

