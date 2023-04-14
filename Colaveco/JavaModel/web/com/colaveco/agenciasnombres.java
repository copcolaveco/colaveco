package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class agenciasnombres extends GXProcedure
{
   public agenciasnombres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agenciasnombres.class ), "" );
   }

   public agenciasnombres( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( long aP0 )
   {
      agenciasnombres.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( long aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             String[] aP1 )
   {
      agenciasnombres.this.AV8Agencia = aP0;
      agenciasnombres.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV8Agencia == 1 )
      {
         AV9AgenciaNombre = "Agencia Central" ;
      }
      if ( AV8Agencia == 2 )
      {
         AV9AgenciaNombre = "Tiempost" ;
      }
      if ( AV8Agencia == 3 )
      {
         AV9AgenciaNombre = "CIA. COLONIA" ;
      }
      if ( AV8Agencia == 4 )
      {
         AV9AgenciaNombre = "COT" ;
      }
      if ( AV8Agencia == 5 )
      {
         AV9AgenciaNombre = "COMSA" ;
      }
      if ( AV8Agencia == 6 )
      {
         AV9AgenciaNombre = "Turil" ;
      }
      if ( AV8Agencia == 7 )
      {
         AV9AgenciaNombre = "RETIRA EN COLAVECO" ;
      }
      if ( AV8Agencia == 9 )
      {
         AV9AgenciaNombre = "CORREO" ;
      }
      if ( AV8Agencia == 10 )
      {
         AV9AgenciaNombre = "Retira en Florida" ;
      }
      if ( AV8Agencia == 11 )
      {
         AV9AgenciaNombre = "Retira en Cardal" ;
      }
      if ( AV8Agencia == 12 )
      {
         AV9AgenciaNombre = "Retira en Canelones" ;
      }
      if ( AV8Agencia == 13 )
      {
         AV9AgenciaNombre = "Retira ahora" ;
      }
      if ( AV8Agencia == 14 )
      {
         AV9AgenciaNombre = "MIRTRANS" ;
      }
      if ( AV8Agencia == 15 )
      {
         AV9AgenciaNombre = "Deposito Colaveco" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = agenciasnombres.this.AV9AgenciaNombre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9AgenciaNombre = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Agencia ;
   private String AV9AgenciaNombre ;
   private String[] aP1 ;
}

