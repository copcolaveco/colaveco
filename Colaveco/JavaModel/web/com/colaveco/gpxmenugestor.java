package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gpxmenugestor extends GXProcedure
{
   public gpxmenugestor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gpxmenugestor.class ), "" );
   }

   public gpxmenugestor( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> executeUdp( )
   {
      gpxmenugestor.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      gpxmenugestor.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Inicio" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.iniciogestor", new String[] {}, new String[] {})  );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Resultados" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.wwresultado", new String[] {}, new String[] {})  );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Resultados2" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.gestorresultado", new String[] {}, new String[] {})  );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Pedido de Frascos" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.wwnotificaciones", new String[] {}, new String[] {})  );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( "Cerraste Seción!" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Mis Datos" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.gamremotelogin", new String[] {}, new String[] {"IDP_State"})  );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( "Cerraste Seción!" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Alertas" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.gamremotelogin", new String[] {}, new String[] {"IDP_State"})  );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( "Cerraste Seción!" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gpxmenugestor.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>(com.colaveco.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItem", "Colaveco", remoteHandle);
      Gxm1gpxmenuitems = new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> Gxm2rootcol ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm1gpxmenuitems ;
}

