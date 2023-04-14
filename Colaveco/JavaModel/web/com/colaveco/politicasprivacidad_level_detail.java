package com.colaveco ;
import com.colaveco.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class politicasprivacidad_level_detail extends GXProcedure
{
   public politicasprivacidad_level_detail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( politicasprivacidad_level_detail.class ), "" );
   }

   public politicasprivacidad_level_detail( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt executeUdp( int aP0 )
   {
      politicasprivacidad_level_detail.this.aP1 = new com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt[] {new com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt[] aP1 )
   {
      politicasprivacidad_level_detail.this.AV19gxid = aP0;
      politicasprivacidad_level_detail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxids = "gxid_" + GXutil.str( AV19gxid, 8, 0) ;
      if ( GXutil.strcmp(Gxwebsession.getValue(Gxids), "") == 0 )
      {
         Gxwebsession.setValue(Gxids+"gxvar_Politicasprivacidad", AV5PoliticasPrivacidad);
         Gxwebsession.setValue(Gxids+"gxvar_Body1", AV7Body1);
         Gxwebsession.setValue(Gxids+"gxvar_Body2", AV8Body2);
         Gxwebsession.setValue(Gxids+"gxvar_Body3", AV9Body3);
         Gxwebsession.setValue(Gxids+"gxvar_Body4", AV10Body4);
         Gxwebsession.setValue(Gxids+"gxvar_Body5", AV11Body5);
         Gxwebsession.setValue(Gxids+"gxvar_Body6", AV12Body6);
         Gxwebsession.setValue(Gxids+"gxvar_Body7link", AV13Body7Link);
         Gxwebsession.setValue(Gxids+"gxvar_Body8", AV14Body8);
         Gxwebsession.setValue(Gxids+"gxvar_Body9", AV15Body9);
         Gxwebsession.setValue(Gxids+"gxvar_Body10", AV16Body10);
         Gxwebsession.setValue(Gxids+"gxvar_Body11", AV17Body11);
         Gxwebsession.setValue(Gxids+"gxvar_Body12", AV18Body12);
         Gxwebsession.setValue(Gxids, "true");
      }
      else
      {
         AV5PoliticasPrivacidad = Gxwebsession.getValue(Gxids+"gxvar_Politicasprivacidad") ;
         AV7Body1 = Gxwebsession.getValue(Gxids+"gxvar_Body1") ;
         AV8Body2 = Gxwebsession.getValue(Gxids+"gxvar_Body2") ;
         AV9Body3 = Gxwebsession.getValue(Gxids+"gxvar_Body3") ;
         AV10Body4 = Gxwebsession.getValue(Gxids+"gxvar_Body4") ;
         AV11Body5 = Gxwebsession.getValue(Gxids+"gxvar_Body5") ;
         AV12Body6 = Gxwebsession.getValue(Gxids+"gxvar_Body6") ;
         AV13Body7Link = Gxwebsession.getValue(Gxids+"gxvar_Body7link") ;
         AV14Body8 = Gxwebsession.getValue(Gxids+"gxvar_Body8") ;
         AV15Body9 = Gxwebsession.getValue(Gxids+"gxvar_Body9") ;
         AV16Body10 = Gxwebsession.getValue(Gxids+"gxvar_Body10") ;
         AV17Body11 = Gxwebsession.getValue(Gxids+"gxvar_Body11") ;
         AV18Body12 = Gxwebsession.getValue(Gxids+"gxvar_Body12") ;
      }
      AV5PoliticasPrivacidad = "Privacy Policy" ;
      AV6Subtitle = "Cooperativa COLAVECO built the COLAVEO App app as a Free app. This SERVICE is provided by Cooperativa COLAVECO at no cost and is intended for use as is." ;
      AV7Body1 = "This page is used to inform visitors regarding our policies with the collection, use, and disclosure of Personal Information if anyone decided to use our Service." ;
      AV8Body2 = "If you choose to use our Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that we collect is used for providing and improving the Service. We will not use or share your information with anyone except as described in this Privacy Policy." ;
      AV9Body3 = "The terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at COLAVEO App unless otherwise defined in this Privacy Policy." ;
      AV10Body4 = "Information Collection and Use</strong></p> <p>For a better experience, while using our Service, we may require you to provide us with certain personally identifiable information, including but not limited to Android advertising identifier. The information that we request will be retained by us and used as described in this privacy policy." ;
      AV11Body5 = "The app does use third party services that may collect information used to identify you." ;
      AV12Body6 = "Link to privacy policy of third party service providers used by the app" ;
      AV13Body7Link = "Google Play Services" ;
      AV14Body8 = " We want to inform you that whenever you use our Service, in a case of an error in the app we collect data and information (through third party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, Links to Other Sites" ;
      AV15Body9 = "This Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by us. Therefore, we strongly advise you to review the Privacy Policy of these websites. We have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services." ;
      AV16Body10 = "Children’s Privacy These Services do not address anyone under the age of 13. We do not knowingly collect our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact us so that we will be able to do necessary actions" ;
      AV17Body11 = "Changes to This Privacy Policy  We may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. We will notify you of any changes by posting the new Privacy Policy on this page. These changes are effective immediately after they are posted on this page." ;
      AV18Body12 = "Changes to This Privacy Policy, Contact Us If you have any questions or suggestions about our Privacy Policy, do not hesitate to contact" ;
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Politicasprivacidad( AV5PoliticasPrivacidad );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body1( AV7Body1 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body2( AV8Body2 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body3( AV9Body3 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body4( AV10Body4 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body5( AV11Body5 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body6( AV12Body6 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body7link( AV13Body7Link );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body8( AV14Body8 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body9( AV15Body9 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body10( AV16Body10 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body11( AV17Body11 );
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt.setgxTv_SdtPoliticasPrivacidad_Level_DetailSdt_Body12( AV18Body12 );
      Gxwebsession.setValue(Gxids+"gxvar_Politicasprivacidad", AV5PoliticasPrivacidad);
      Gxwebsession.setValue(Gxids+"gxvar_Body1", AV7Body1);
      Gxwebsession.setValue(Gxids+"gxvar_Body2", AV8Body2);
      Gxwebsession.setValue(Gxids+"gxvar_Body3", AV9Body3);
      Gxwebsession.setValue(Gxids+"gxvar_Body4", AV10Body4);
      Gxwebsession.setValue(Gxids+"gxvar_Body5", AV11Body5);
      Gxwebsession.setValue(Gxids+"gxvar_Body6", AV12Body6);
      Gxwebsession.setValue(Gxids+"gxvar_Body7link", AV13Body7Link);
      Gxwebsession.setValue(Gxids+"gxvar_Body8", AV14Body8);
      Gxwebsession.setValue(Gxids+"gxvar_Body9", AV15Body9);
      Gxwebsession.setValue(Gxids+"gxvar_Body10", AV16Body10);
      Gxwebsession.setValue(Gxids+"gxvar_Body11", AV17Body11);
      Gxwebsession.setValue(Gxids+"gxvar_Body12", AV18Body12);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = politicasprivacidad_level_detail.this.AV22GXM1PoliticasPrivacidad_Level_DetailSdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22GXM1PoliticasPrivacidad_Level_DetailSdt = new com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt(remoteHandle, context);
      Gxids = "" ;
      Gxwebsession = httpContext.getWebSession();
      AV5PoliticasPrivacidad = "" ;
      AV7Body1 = "" ;
      AV8Body2 = "" ;
      AV9Body3 = "" ;
      AV10Body4 = "" ;
      AV11Body5 = "" ;
      AV12Body6 = "" ;
      AV13Body7Link = "" ;
      AV14Body8 = "" ;
      AV15Body9 = "" ;
      AV16Body10 = "" ;
      AV17Body11 = "" ;
      AV18Body12 = "" ;
      AV6Subtitle = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV19gxid ;
   private String Gxids ;
   private String AV5PoliticasPrivacidad ;
   private String AV7Body1 ;
   private String AV8Body2 ;
   private String AV9Body3 ;
   private String AV10Body4 ;
   private String AV11Body5 ;
   private String AV12Body6 ;
   private String AV13Body7Link ;
   private String AV14Body8 ;
   private String AV15Body9 ;
   private String AV16Body10 ;
   private String AV17Body11 ;
   private String AV18Body12 ;
   private String AV6Subtitle ;
   private com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt[] aP1 ;
   private com.genexus.webpanels.WebSession Gxwebsession ;
   private com.colaveco.SdtPoliticasPrivacidad_Level_DetailSdt AV22GXM1PoliticasPrivacidad_Level_DetailSdt ;
}

