package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gpxmenudemo extends GXProcedure
{
   public gpxmenudemo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gpxmenudemo.class ), "" );
   }

   public gpxmenudemo( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> executeUdp( )
   {
      gpxmenudemo.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 )
   {
      gpxmenudemo.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "GProjex" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://www.gprojex.com" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( "Making things happen!" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Stone Framework" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Home" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://open.genexus.com/projecthome.aspx?SSID-32" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Documentation" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://open.genexus.com/wiki.aspx?SSID-32,Stone+Framework+by+GProjex,article" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Download" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "https://marketplace.genexus.com/viewproduct.aspx?597" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "GX Resources" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Home" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://www.genexus.com" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "GX Technical" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://www.gxtechnical.com" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Wiki" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://wiki.gxtechnical.com" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Marketplace" );
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "https://marketplace.genexus.com" );
      Gxm3gpxmenuitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm1gpxmenuitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm3gpxmenuitems_subitems, 0);
      Gxm3gpxmenuitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Submenu" );
      Gxm4gpxmenuitems_subitems_subitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm3gpxmenuitems_subitems.getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().add(Gxm4gpxmenuitems_subitems_subitems, 0);
      Gxm4gpxmenuitems_subitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Home" );
      Gxm4gpxmenuitems_subitems_subitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "http://www.gprojex.com" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "Click test" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Code( "CTST" );
      Gxm1gpxmenuitems = (com.colaveco.SdtgpxMenuItems_gpxMenuItem)new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1gpxmenuitems, 0);
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( "LinkTarget" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( "https://marketplace.genexus.com/viewproduct.aspx?607" );
      Gxm1gpxmenuitems.setgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget( "_blank" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = gpxmenudemo.this.Gxm2rootcol;
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
      Gxm4gpxmenuitems_subitems_subitems = new com.colaveco.SdtgpxMenuItems_gpxMenuItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem>[] aP0 ;
   private GXBaseCollection<com.colaveco.SdtgpxMenuItems_gpxMenuItem> Gxm2rootcol ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm1gpxmenuitems ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm3gpxmenuitems_subitems ;
   private com.colaveco.SdtgpxMenuItems_gpxMenuItem Gxm4gpxmenuitems_subitems_subitems ;
}

