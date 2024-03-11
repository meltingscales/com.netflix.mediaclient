package o;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.real.RealGameControllerMagicPathModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bNI implements Factory<C3858bNg> {
    private final RealGameControllerMagicPathModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public C3858bNg get() {
        return d(this.e);
    }

    public static C3858bNg d(RealGameControllerMagicPathModule realGameControllerMagicPathModule) {
        return (C3858bNg) Preconditions.checkNotNullFromProvides(realGameControllerMagicPathModule.b());
    }
}
