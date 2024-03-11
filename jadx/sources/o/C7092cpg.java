package o;

import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionApplicationStartupListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cpg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7092cpg implements Factory<NotificationPermissionApplicationStartupListener> {
    private final Provider<InterfaceC7088cpc> b;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public NotificationPermissionApplicationStartupListener get() {
        NotificationPermissionApplicationStartupListener b = b();
        C7094cpi.d(b, this.b.get());
        return b;
    }

    public static NotificationPermissionApplicationStartupListener b() {
        return new NotificationPermissionApplicationStartupListener();
    }
}
