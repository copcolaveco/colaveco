package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gpxmenucolaveco extends GXProcedure
{
   public gpxmenucolaveco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gpxmenucolaveco.class ), "" );
   }

   public gpxmenucolaveco( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> executeUdp( )
   {
      gpxmenucolaveco.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      gpxmenucolaveco.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Gerencia" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Anuncios" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( formatLink("com.colaveco.wwanuncio", new String[] {}, new String[] {})  );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gpxmenucolaveco.this.Gxm2rootcol;
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
      Gxm3gpxmenuitems_subitems = new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> Gxm2rootcol ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm1gpxmenuitems ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm3gpxmenuitems_subitems ;
}

