package o;

import android.app.Activity;
import com.netflix.mediaclient.uxconfigclientcapabilities.api.UxConfigClientCapabilities_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.dik  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8352dik implements Factory<InterfaceC8351dij> {
    private final Provider<Activity> c;
    private final UxConfigClientCapabilities_ActivityComponent_HiltModule d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC8351dij get() {
        return c(this.d, this.c.get());
    }

    public static InterfaceC8351dij c(UxConfigClientCapabilities_ActivityComponent_HiltModule uxConfigClientCapabilities_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC8351dij) Preconditions.checkNotNullFromProvides(uxConfigClientCapabilities_ActivityComponent_HiltModule.d(activity));
    }
}
