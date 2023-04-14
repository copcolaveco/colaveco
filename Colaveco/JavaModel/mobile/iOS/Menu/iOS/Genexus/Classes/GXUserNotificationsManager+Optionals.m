//
//  GXUserNotificationsManager+Optionals.m
//  Menu
//

#if TARGET_OS_IOS

@import GXCoreBL;

@implementation GXUserNotificationsManager (GXUserNotificatinManagerOptionals)

- (BOOL)supportsRemoteNotifications {
	return YES;
}

- (BOOL)supportsLocalNotifications {
	return NO;
}

@end



@implementation GXUserNotificationsManager (GXUserNotificationsManagerRemoteOptionals)

- (NSString *const)applicationLaunchOptionsRemoteNotificationKey {
	return UIApplicationLaunchOptionsRemoteNotificationKey;
}

- (void)applicationRegisterForRemoteNotifications {
	id <GXUserNotificationsProviderProtocol> provider = self.class.notificationsProvider;
	if (provider && [provider respondsToSelector:@selector(registerForPushNotifications)]) {
		[provider registerForPushNotifications];
	}
	else {
		[[UIApplication sharedApplication] registerForRemoteNotifications];
	}
}

@end
#endif // TARGET_OS_IOS
