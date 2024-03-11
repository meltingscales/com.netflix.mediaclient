package o;

import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationStartupListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bwO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5310bwO implements Factory<AdsPlanApplicationStartupListener> {
    private final Provider<InterfaceC5304bwI> b;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public AdsPlanApplicationStartupListener get() {
        AdsPlanApplicationStartupListener d = d();
        C5313bwR.d(d, this.b.get());
        return d;
    }

    public static AdsPlanApplicationStartupListener d() {
        return new AdsPlanApplicationStartupListener();
    }
}
