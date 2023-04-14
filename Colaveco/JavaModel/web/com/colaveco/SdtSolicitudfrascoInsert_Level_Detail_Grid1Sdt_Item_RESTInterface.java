package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SolicitudfrascoInsert_Level_Detail_Grid1Sdt.Item", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_RESTInterface extends GxGenericCollectionItem<com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item>
{
   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_RESTInterface( )
   {
      super(new com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item ());
   }

   public SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_RESTInterface( com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("UsuarioId")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid(), 18, 0)) ;
   }

   @JsonProperty("UsuarioId")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid(  String Value )
   {
      sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioid( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioIdNet")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet(), 18, 0)) ;
   }

   @JsonProperty("UsuarioIdNet")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet(  String Value )
   {
      sdt.setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioidnet( GXutil.lval( Value) );
   }


   @JsonProperty("UsuarioNombre")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre()) ;
   }

   @JsonProperty("UsuarioNombre")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarionombre(Value);
   }


   @JsonProperty("UsuarioAgenciaFrasco")
   public Short getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco( )
   {
      return ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco() ;
   }

   @JsonProperty("UsuarioAgenciaFrasco")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco(  Short Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioagenciafrasco(Value);
   }


   @JsonProperty("UsuarioDireccion")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion()) ;
   }

   @JsonProperty("UsuarioDireccion")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariodireccion(Value);
   }


   @JsonProperty("UsuarioEmail")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail()) ;
   }

   @JsonProperty("UsuarioEmail")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuarioemail(Value);
   }


   @JsonProperty("UsuarioTecnicoTelefono1")
   public String getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1( )
   {
      return GXutil.rtrim(((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).getgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1()) ;
   }

   @JsonProperty("UsuarioTecnicoTelefono1")
   public void setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1(  String Value )
   {
      ((com.colaveco.SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item)getSdt()).setgxTv_SdtSolicitudfrascoInsert_Level_Detail_Grid1Sdt_Item_Usuariotecnicotelefono1(Value);
   }


   int remoteHandle = -1;
}

