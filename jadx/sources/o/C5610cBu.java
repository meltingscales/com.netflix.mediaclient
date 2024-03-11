package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.player.v2.PlayerRepositoryFactory_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cBu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5610cBu implements Factory<InterfaceC5603cBn> {
    private final PlayerRepositoryFactory_ActivityComponent_HiltModule c;
    private final Provider<Activity> e;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public InterfaceC5603cBn get() {
        return b(this.c, this.e.get());
    }

    public static InterfaceC5603cBn b(PlayerRepositoryFactory_ActivityComponent_HiltModule playerRepositoryFactory_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC5603cBn) Preconditions.checkNotNullFromProvides(playerRepositoryFactory_ActivityComponent_HiltModule.b(activity));
    }
}
