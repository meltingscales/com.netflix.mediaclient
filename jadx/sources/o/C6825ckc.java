package o;

import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApplicationStartupListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ckc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6825ckc implements Factory<MhuEbiApplicationStartupListener> {
    private final Provider<InterfaceC6767cjX> d;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public MhuEbiApplicationStartupListener get() {
        MhuEbiApplicationStartupListener e = e();
        C6824ckb.e(e, this.d.get());
        return e;
    }

    public static MhuEbiApplicationStartupListener e() {
        return new MhuEbiApplicationStartupListener();
    }
}
