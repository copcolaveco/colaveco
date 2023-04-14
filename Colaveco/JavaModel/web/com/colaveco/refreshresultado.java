package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class refreshresultado extends GXProcedure
{
   public refreshresultado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( refreshresultado.class ), "" );
   }

   public refreshresultado( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtSDTResultado executeUdp( com.colaveco.SdtSDTResultado aP0 ,
                                                   short aP1 )
   {
      refreshresultado.this.aP2 = new com.colaveco.SdtSDTResultado[] {new com.colaveco.SdtSDTResultado()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( com.colaveco.SdtSDTResultado aP0 ,
                        short aP1 ,
                        com.colaveco.SdtSDTResultado[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.colaveco.SdtSDTResultado aP0 ,
                             short aP1 ,
                             com.colaveco.SdtSDTResultado[] aP2 )
   {
      refreshresultado.this.AV15item = aP0;
      refreshresultado.this.AV17TipoInforme = aP1;
      refreshresultado.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "6fe83b86-f2ef-4cdc-96e4-212159b8b00b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Control Lechero" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "ea977fc6-d211-448e-ade1-f59eca454eea", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Agua" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Aislamiento y Antibiograma" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "PAL" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Parasitología" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "dba83ce5-7c58-49d2-8edd-5e35a18402ab", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Alimento" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Serología" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "c8f9857a-043c-4e00-a15c-00a86e2fdb7d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Patología" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Calidad de Leche" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Ambiental" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1a941648-f7d8-4a95-9058-b0cf810d51fa", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Lactómetro - Chequeos" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Nutrición" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "e8887987-78e0-4008-941a-4f62bbe87c4d", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Suelos" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b7b07a3d-8aa3-44c5-9f1b-7fbf5ce351d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Bruselosis en leche" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "72161498-ee12-470e-8aab-d8b2d9761b43", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Efluentes" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Bacteriología de tanque" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Bacteriología clínica aeróbica" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Foliares" );
      }
      if ( AV15item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() == AV17TipoInforme )
      {
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadoimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "de1c8545-466f-4d9e-8922-f6d71d595cd2", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         AV16item2.setgxTv_SdtSDTResultado_Resultadotipoinformenombre( "Control Lechero" );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = refreshresultado.this.AV16item2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16item2 = new com.colaveco.SdtSDTResultado(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17TipoInforme ;
   private short Gx_err ;
   private com.colaveco.SdtSDTResultado[] aP2 ;
   private com.colaveco.SdtSDTResultado AV15item ;
   private com.colaveco.SdtSDTResultado AV16item2 ;
}

