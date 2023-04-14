package com.colaveco ;
import com.colaveco.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "insertsolicitudfrasco_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class insertsolicitudfrasco_RESTInterfaceIN
{
   String AV8SDTAgenciaId;
   @JsonProperty("SDTAgenciaId")
   public String getSDTAgenciaId( )
   {
      return AV8SDTAgenciaId ;
   }

   @JsonProperty("SDTAgenciaId")
   public void setSDTAgenciaId(  String Value )
   {
      AV8SDTAgenciaId= Value;
   }


   short AV11SFFrascosAgua;
   @JsonProperty("SFFrascosAgua")
   public short getSFFrascosAgua( )
   {
      return AV11SFFrascosAgua ;
   }

   @JsonProperty("SFFrascosAgua")
   public void setSFFrascosAgua(  short Value )
   {
      AV11SFFrascosAgua= Value;
   }


   short AV9SFFrascosConC;
   @JsonProperty("SFFrascosConC")
   public short getSFFrascosConC( )
   {
      return AV9SFFrascosConC ;
   }

   @JsonProperty("SFFrascosConC")
   public void setSFFrascosConC(  short Value )
   {
      AV9SFFrascosConC= Value;
   }


   short AV14SFFrascosIsopo;
   @JsonProperty("SFFrascosIsopo")
   public short getSFFrascosIsopo( )
   {
      return AV14SFFrascosIsopo ;
   }

   @JsonProperty("SFFrascosIsopo")
   public void setSFFrascosIsopo(  short Value )
   {
      AV14SFFrascosIsopo= Value;
   }


   short AV12SFFrascosSangre;
   @JsonProperty("SFFrascosSangre")
   public short getSFFrascosSangre( )
   {
      return AV12SFFrascosSangre ;
   }

   @JsonProperty("SFFrascosSangre")
   public void setSFFrascosSangre(  short Value )
   {
      AV12SFFrascosSangre= Value;
   }


   short AV10SFFrascosSinC;
   @JsonProperty("SFFrascosSinC")
   public short getSFFrascosSinC( )
   {
      return AV10SFFrascosSinC ;
   }

   @JsonProperty("SFFrascosSinC")
   public void setSFFrascosSinC(  short Value )
   {
      AV10SFFrascosSinC= Value;
   }


   String AV13SFObservaciones;
   @JsonProperty("SFObservaciones")
   public String getSFObservaciones( )
   {
      if ( GXutil.strcmp(AV13SFObservaciones, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV13SFObservaciones ;
      }
   }

   @JsonProperty("SFObservaciones")
   public void setSFObservaciones(  String Value )
   {
      if ( Value == null )
      {
         AV13SFObservaciones = "" ;
      }
      else
      {
         AV13SFObservaciones= Value;
      }
   }


   String AV19UsuarioDireccion;
   @JsonProperty("UsuarioDireccion")
   public String getUsuarioDireccion( )
   {
      if ( GXutil.strcmp(AV19UsuarioDireccion, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV19UsuarioDireccion ;
      }
   }

   @JsonProperty("UsuarioDireccion")
   public void setUsuarioDireccion(  String Value )
   {
      if ( Value == null )
      {
         AV19UsuarioDireccion = "" ;
      }
      else
      {
         AV19UsuarioDireccion= Value;
      }
   }


   String AV18UsuarioEmail;
   @JsonProperty("UsuarioEmail")
   public String getUsuarioEmail( )
   {
      if ( GXutil.strcmp(AV18UsuarioEmail, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV18UsuarioEmail ;
      }
   }

   @JsonProperty("UsuarioEmail")
   public void setUsuarioEmail(  String Value )
   {
      if ( Value == null )
      {
         AV18UsuarioEmail = "" ;
      }
      else
      {
         AV18UsuarioEmail= Value;
      }
   }


   String AV15UsuarioIdNet;
   @JsonProperty("UsuarioIdNet")
   public String getUsuarioIdNet( )
   {
      return AV15UsuarioIdNet ;
   }

   @JsonProperty("UsuarioIdNet")
   public void setUsuarioIdNet(  String Value )
   {
      AV15UsuarioIdNet= Value;
   }


   String AV16UsuarioNombre;
   @JsonProperty("UsuarioNombre")
   public String getUsuarioNombre( )
   {
      if ( GXutil.strcmp(AV16UsuarioNombre, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV16UsuarioNombre ;
      }
   }

   @JsonProperty("UsuarioNombre")
   public void setUsuarioNombre(  String Value )
   {
      if ( Value == null )
      {
         AV16UsuarioNombre = "" ;
      }
      else
      {
         AV16UsuarioNombre= Value;
      }
   }


   String AV17UsuarioTecnicoTelefono1;
   @JsonProperty("UsuarioTecnicoTelefono1")
   public String getUsuarioTecnicoTelefono1( )
   {
      if ( GXutil.strcmp(AV17UsuarioTecnicoTelefono1, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV17UsuarioTecnicoTelefono1 ;
      }
   }

   @JsonProperty("UsuarioTecnicoTelefono1")
   public void setUsuarioTecnicoTelefono1(  String Value )
   {
      if ( Value == null )
      {
         AV17UsuarioTecnicoTelefono1 = "" ;
      }
      else
      {
         AV17UsuarioTecnicoTelefono1= Value;
      }
   }


}

