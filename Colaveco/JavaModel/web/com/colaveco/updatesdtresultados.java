package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class updatesdtresultados extends GXProcedure
{
   public updatesdtresultados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( updatesdtresultados.class ), "" );
   }

   public updatesdtresultados( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTResultado> executeUdp( GXBaseCollection<com.colaveco.SdtSDTResultado> aP0 )
   {
      updatesdtresultados.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTResultado>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtSDTResultado> aP0 ,
                        GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtSDTResultado> aP0 ,
                             GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP1 )
   {
      updatesdtresultados.this.AV8SDTResultadoIn = aP0;
      updatesdtresultados.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXV1 = 1 ;
      while ( AV14GXV1 <= AV8SDTResultadoIn.size() )
      {
         AV10item = (com.colaveco.SdtSDTResultado)((com.colaveco.SdtSDTResultado)AV8SDTResultadoIn.elementAt(-1+AV14GXV1));
         AV11item2 = (com.colaveco.SdtSDTResultado)new com.colaveco.SdtSDTResultado(remoteHandle, context);
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 1 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "En proceso" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
         }
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 2 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "Pendiente de aceptación" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
         }
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 3 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "Finalizado" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         }
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 4 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "No aceptado" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
         }
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 5 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "Finalizado" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         }
         if ( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() == 6 )
         {
            AV11item2.setgxTv_SdtSDTResultado_Resultadoabonado( AV10item.getgxTv_SdtSDTResultado_Resultadoabonado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocomentarios( AV10item.getgxTv_SdtSDTResultado_Resultadocomentarios() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoeliminado( AV10item.getgxTv_SdtSDTResultado_Resultadoeliminado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoestado( "Finalizado" );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechacreado( AV10item.getgxTv_SdtSDTResultado_Resultadofechacreado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadofechaemision( AV10item.getgxTv_SdtSDTResultado_Resultadofechaemision() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoficha( AV10item.getgxTv_SdtSDTResultado_Resultadoficha() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoid( AV10item.getgxTv_SdtSDTResultado_Resultadoid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidestado( AV10item.getgxTv_SdtSDTResultado_Resultadoidestado() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidlibro( AV10item.getgxTv_SdtSDTResultado_Resultadoidlibro() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnettipoinforme( AV10item.getgxTv_SdtSDTResultado_Resultadoidnettipoinforme() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoidnetusuario( AV10item.getgxTv_SdtSDTResultado_Resultadoidnetusuario() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathcsv( AV10item.getgxTv_SdtSDTResultado_Resultadopathcsv() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathexcel( AV10item.getgxTv_SdtSDTResultado_Resultadopathexcel() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopathpdf( AV10item.getgxTv_SdtSDTResultado_Resultadopathpdf() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadotypeid( AV10item.getgxTv_SdtSDTResultado_Resultadotypeid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadouserid( AV10item.getgxTv_SdtSDTResultado_Resultadouserid() );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadocsvimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadopdfimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )) );
            AV11item2.setgxTv_SdtSDTResultado_Resultadoexcelimagen_gxi( GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5dcddcce-df89-424f-8cbe-19c24b6a0567", "", context.getHttpContext().getTheme( )), context.getHttpContext()) );
         }
         AV9SDTResultadoOut.add(AV11item2, 0);
         AV14GXV1 = (int)(AV14GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = updatesdtresultados.this.AV9SDTResultadoOut;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SDTResultadoOut = new GXBaseCollection<com.colaveco.SdtSDTResultado>(com.colaveco.SdtSDTResultado.class, "SDTResultado", "Colaveco", remoteHandle);
      AV10item = new com.colaveco.SdtSDTResultado(remoteHandle, context);
      AV11item2 = new com.colaveco.SdtSDTResultado(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV14GXV1 ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado>[] aP1 ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV8SDTResultadoIn ;
   private GXBaseCollection<com.colaveco.SdtSDTResultado> AV9SDTResultadoOut ;
   private com.colaveco.SdtSDTResultado AV10item ;
   private com.colaveco.SdtSDTResultado AV11item2 ;
}

