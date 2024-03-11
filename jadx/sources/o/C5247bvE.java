package o;

import com.netflix.mediaclient.storage.db.RdidCtaConsentStateDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bvE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5247bvE implements Factory<InterfaceC5323bwb> {
    private final Provider<RdidCtaConsentStateDatabase> d;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC5323bwb get() {
        return d(this.d.get());
    }

    public static InterfaceC5323bwb d(RdidCtaConsentStateDatabase rdidCtaConsentStateDatabase) {
        return (InterfaceC5323bwb) Preconditions.checkNotNullFromProvides(RdidCtaConsentStateDatabase.AppModule.b.e(rdidCtaConsentStateDatabase));
    }
}
