package com.artech.colaveco.homecolaveco;

import com.artech.providers.EntityDataProvider;

public class AppEntityDataProvider extends EntityDataProvider
{
	public AppEntityDataProvider()
	{
		EntityDataProvider.AUTHORITY = "com.artech.colaveco.homecolaveco.appentityprovider";
		EntityDataProvider.URI_MATCHER = buildUriMatcher();
	}
}
