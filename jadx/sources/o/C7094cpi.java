package o;

import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionApplicationStartupListener;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cpi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7094cpi implements MembersInjector<NotificationPermissionApplicationStartupListener> {
    private final Provider<InterfaceC7088cpc> c;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(NotificationPermissionApplicationStartupListener notificationPermissionApplicationStartupListener) {
        d(notificationPermissionApplicationStartupListener, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionApplicationStartupListener.notificationPermissionApplication")
    public static void d(NotificationPermissionApplicationStartupListener notificationPermissionApplicationStartupListener, InterfaceC7088cpc interfaceC7088cpc) {
        notificationPermissionApplicationStartupListener.notificationPermissionApplication = interfaceC7088cpc;
    }
}
