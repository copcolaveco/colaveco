package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class homecolaveco_level_detail extends GXProcedure
{
   public homecolaveco_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( homecolaveco_level_detail.class ), "" );
   }

   public homecolaveco_level_detail( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtHomeColaveco_Level_DetailSdt executeUdp( int aP0 )
   {
      homecolaveco_level_detail.this.aP1 = new com.colaveco.SdtHomeColaveco_Level_DetailSdt[] {new com.colaveco.SdtHomeColaveco_Level_DetailSdt()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        com.colaveco.SdtHomeColaveco_Level_DetailSdt[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             com.colaveco.SdtHomeColaveco_Level_DetailSdt[] aP1 )
   {
      homecolaveco_level_detail.this.AV7gxid = aP0;
      homecolaveco_level_detail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_objcol_SdtSDTAnuncio1 = AV6Anuncios ;
      GXv_objcol_SdtSDTAnuncio2[0] = GXt_objcol_SdtSDTAnuncio1 ;
      new com.colaveco.dpanuncios(remoteHandle, context).execute( GXv_objcol_SdtSDTAnuncio2) ;
      GXt_objcol_SdtSDTAnuncio1 = GXv_objcol_SdtSDTAnuncio2[0] ;
      AV6Anuncios = GXt_objcol_SdtSDTAnuncio1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = homecolaveco_level_detail.this.AV8GXM1HomeColaveco_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8GXM1HomeColaveco_Level_DetailSdt = new com.colaveco.SdtHomeColaveco_Level_DetailSdt(remoteHandle, context);
      AV6Anuncios = new GXBaseCollection<com.colaveco.SdtSDTAnuncio>(com.colaveco.SdtSDTAnuncio.class, "SDTAnuncio", "Colaveco", remoteHandle);
      GXt_objcol_SdtSDTAnuncio1 = new GXBaseCollection<com.colaveco.SdtSDTAnuncio>(com.colaveco.SdtSDTAnuncio.class, "SDTAnuncio", "Colaveco", remoteHandle);
      GXv_objcol_SdtSDTAnuncio2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV7gxid ;
   private com.colaveco.SdtHomeColaveco_Level_DetailSdt[] aP1 ;
   private GXBaseCollection<com.colaveco.SdtSDTAnuncio> AV6Anuncios ;
   private GXBaseCollection<com.colaveco.SdtSDTAnuncio> GXt_objcol_SdtSDTAnuncio1 ;
   private GXBaseCollection<com.colaveco.SdtSDTAnuncio> GXv_objcol_SdtSDTAnuncio2[] ;
   private com.colaveco.SdtHomeColaveco_Level_DetailSdt AV8GXM1HomeColaveco_Level_DetailSdt ;
}

