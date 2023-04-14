package com.artech.colaveco.menu;

import com.artech.providers.EntityDataProvider;

public class AppEntityDataProvider extends EntityDataProvider
{
	public AppEntityDataProvider()
	{
		EntityDataProvider.AUTHORITY = "com.artech.colaveco.menu.appentityprovider";
		EntityDataProvider.URI_MATCHER = buildUriMatcher();
	}
}
