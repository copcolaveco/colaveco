package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpagencia extends GXProcedure
{
   public dpagencia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpagencia.class ), "" );
   }

   public dpagencia( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> executeUdp( )
   {
      dpagencia.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>[] aP0 )
   {
      dpagencia.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 1 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Agencia Central" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 2 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Tiempost" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 3 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "CIA. COLONIA" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 4 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "COT" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 5 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "COMSA" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 6 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Turil" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 7 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "RETIRA EN COLAVECO" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 9 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "CORREO" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 10 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Retira en Florida" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 11 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Retira en Cardal" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 12 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Retira en Canelones" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 13 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Retiro ahora" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 14 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "MIRTRANS" );
      Gxm1sdtagencia = (com.colaveco.SdtSDTAgencia_SDTAgenciaItem)new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtagencia, 0);
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagenciaid( 15 );
      Gxm1sdtagencia.setgxTv_SdtSDTAgencia_SDTAgenciaItem_Sdtagencianombre( "Deposito Colaveco" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpagencia.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>(com.colaveco.SdtSDTAgencia_SDTAgenciaItem.class, "SDTAgenciaItem", "Colaveco", remoteHandle);
      Gxm1sdtagencia = new com.colaveco.SdtSDTAgencia_SDTAgenciaItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem>[] aP0 ;
   private GXBaseCollection<com.colaveco.SdtSDTAgencia_SDTAgenciaItem> Gxm2rootcol ;
   private com.colaveco.SdtSDTAgencia_SDTAgenciaItem Gxm1sdtagencia ;
}

