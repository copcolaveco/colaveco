package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptipoinforme extends GXProcedure
{
   public dptipoinforme( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptipoinforme.class ), "" );
   }

   public dptipoinforme( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> executeUdp( )
   {
      dptipoinforme.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>[] aP0 )
   {
      dptipoinforme.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 0 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Todos" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 1 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Control Lechero" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 3 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Agua" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 4 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Aislamiento y Antibiograma" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 5 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "PAL" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 6 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Parasitolog�a" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 7 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Alimentos" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 8 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Serolog�a" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 9 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Patolog�a" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 10 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Calidad de leche" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 11 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Ambiental" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 12 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Lact�metro - Chequeos" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 13 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Nutrici�n" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 14 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Suelos" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 15 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Bruselosis en leche" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 16 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Efluentes" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 17 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Bacteriolog�a de tanque" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 18 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Bacteriolog�a cl�nica aer�bica" );
      Gxm1sdttipoinforme = (com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem)new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdttipoinforme, 0);
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformeid( 19 );
      Gxm1sdttipoinforme.setgxTv_SdtSDTTipoinforme_SDTTipoinformeItem_Sdttipoinformenombre( "Foliares" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dptipoinforme.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>(com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem.class, "SDTTipoinformeItem", "Colaveco", remoteHandle);
      Gxm1sdttipoinforme = new com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem>[] aP0 ;
   private GXBaseCollection<com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem> Gxm2rootcol ;
   private com.colaveco.SdtSDTTipoinforme_SDTTipoinformeItem Gxm1sdttipoinforme ;
}

