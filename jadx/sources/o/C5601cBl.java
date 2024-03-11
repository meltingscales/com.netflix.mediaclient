package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.player.v2.PlayerPrefetchRepository_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cBl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5601cBl implements Factory<InterfaceC5602cBm> {
    private final Provider<Activity> a;
    private final PlayerPrefetchRepository_ActivityComponent_HiltModule c;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC5602cBm get() {
        return a(this.c, this.a.get());
    }

    public static InterfaceC5602cBm a(PlayerPrefetchRepository_ActivityComponent_HiltModule playerPrefetchRepository_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC5602cBm) Preconditions.checkNotNullFromProvides(playerPrefetchRepository_ActivityComponent_HiltModule.a(activity));
    }
}
