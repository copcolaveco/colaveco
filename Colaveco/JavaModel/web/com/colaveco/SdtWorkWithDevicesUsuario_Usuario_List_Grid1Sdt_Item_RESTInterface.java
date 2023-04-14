package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "WorkWithDevicesUsuario_Usuario_List_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item>
{
   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item ());
   }

   public SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("UsuarioId")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid(), 18, 0)) ;
   }

   @JsonProperty("UsuarioId")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid(  String Value )
   {
      sdt.setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioid( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioEmail")
   public String getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item)getSdt()).getgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail()) ;
   }

   @JsonProperty("UsuarioEmail")
   public void setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail(  String Value )
   {
      ((com.colaveco.SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item)getSdt()).setgxTv_SdtWorkWithDevicesUsuario_Usuario_List_Grid1Sdt_Item_Usuarioemail(Value);
   }


   int remoteHandle = -1;
}

