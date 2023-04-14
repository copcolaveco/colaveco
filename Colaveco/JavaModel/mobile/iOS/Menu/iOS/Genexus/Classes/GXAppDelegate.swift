//
//  GXAppDelegate.swift
//  Menu
//

import Foundation
import GXCoreBL

extension GXUIApplication {
	override open func registerForRemoteNotifications() {
		GXUserNotificationsManager.markRemoteNotificationsTokenRenewNotNeeded()
		super.registerForRemoteNotifications()
	}
}

@objc
public class GXAppDelegate: AppDelegate_Shared {

#if DEBUG
	override public var gxShowDeveloperInfo: Bool {
		get { return true }
	}
#endif

	// MARK: - User Notifications

	@available(iOS, deprecated: 10.0)
	public func application(_ application: UIApplication, didRegister notificationSettings: UIUserNotificationSettings) {
		GXUserNotificationsManager.onDidRegisterUserNotificationSettings()
	}

	// MARK: - Remote Notifications

	public func application(_ application: UIApplication, didRegisterForRemoteNotificationsWithDeviceToken deviceToken: Data) {
		GXUserNotificationsManager.onDidRegisterForRemoteNotifications(withDeviceToken: deviceToken)
	}

	public func application(_ application: UIApplication, didFailToRegisterForRemoteNotificationsWithError error: Error) {
		GXUserNotificationsManager.onDidFailToRegisterForRemoteNotificationsWithError(error)
	}

	@available(iOS, deprecated: 10.0)
	public func application(_ application: UIApplication, didReceiveRemoteNotification userInfo: [AnyHashable : Any]) {
		GXUserNotificationsManager.onDidReceiveRemoteNotification(userInfo)
	}

	@available(iOS, introduced: 9.0, deprecated: 10.0)
	public func application(_ application: UIApplication, handleActionWithIdentifier identifier: String?, forRemoteNotification userInfo: [AnyHashable : Any], withResponseInfo responseInfo: [AnyHashable : Any], completionHandler: @escaping () -> Swift.Void) {

		GXUserNotificationsManager.onHandleAction(withIdentifier: identifier, forRemoteNotification: userInfo, withResponseInfo: responseInfo, completionHandler: completionHandler)
	}

	@available(iOS, deprecated: 10.0)
	public func application(_ application: UIApplication, handleActionWithIdentifier identifier: String?, forRemoteNotification userInfo: [AnyHashable : Any], completionHandler: @escaping () -> Swift.Void) {

		GXUserNotificationsManager.onHandleAction(withIdentifier: identifier, forRemoteNotification: userInfo, completionHandler: completionHandler)
	}

}
