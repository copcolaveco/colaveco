package com.artech.colaveco.menu;
import android.content.Context;
import androidx.multidex.MultiDex;

import com.artech.android.ContextImpl;
import com.artech.application.MyApplication;
import com.artech.base.metadata.GenexusApplication;
import com.artech.base.services.AndroidContext;
import com.artech.base.services.IGxProcedure;
import com.artech.base.services.Services;
import com.artech.providers.EntityDataProvider;
import com.artech.controls.ads.Ads;

import com.genexus.Application;
import com.genexus.ClientContext;

public class MainApplication extends MyApplication
{
	@Override
	public final void onCreate()
	{
		GenexusApplication application = new GenexusApplication();
		application.setName("colaveco");
		application.setAPIUri("http://192.168.1.4:8080/ColavecoJavaEnvironment/");
		application.setAppEntry("Menu");
		application.setMajorVersion(1);
		application.setMinorVersion(0);

		// Extensibility Point for Logging
 

		// Security
		application.setIsSecure(true);
		application.setEnableAnonymousUser(false);
		application.setClientId("94cd50f6dcfe4537a96e37cec5789d26");
		application.setLoginObject("GAMSDLogin");
		application.setNotAuthorizedObject("GAMSDNotAuthorized");
		application.setChangePasswordObject("GAMSDChangePassword");
		//application.setCompleteUserDataObject("");

		application.setAllowWebViewExecuteJavascripts(true);
		application.setAllowWebViewExecuteLocalFiles(true);

		application.setShareSessionToWebView(false);

		// Dynamic Url		
		application.setUseDynamicUrl(false);
		application.setDynamicUrlAppId("Colaveco");

		// Notifications
		application.setUseNotification(true);
		application.setNotificationSenderId("115627045230440649209");
		application.setNotificationRegistrationHandler("NotificationsRegistrationHandler");

		MyApplication.setApp(application);

		registerModule(new com.genexus.coreexternalobjects.CoreExternalObjectsModule());

		registerModule(new com.genexus.coreusercontrols.CoreUserControlsModule());

		registerModule(new com.genexus.controls.smartgrid.SmartGridModule());


	

		super.onCreate();

		
		AndroidContext.ApplicationContext = new ContextImpl(getApplicationContext());

    }

	@Override
	public Class<? extends com.artech.services.EntityService> getEntityServiceClass()
	{
		return AppEntityService.class;
	}

	@Override
	public EntityDataProvider getProvider()
	{
		return new AppEntityDataProvider();
	}

	@Override
	protected void attachBaseContext(Context base)
	{
		super.attachBaseContext(base);
		MultiDex.install(this);
	}

}
