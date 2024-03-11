package o;

import com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeApplicationStartupListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cjG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6750cjG implements Factory<MultihouseholdNudgeApplicationStartupListener> {
    private final Provider<InterfaceC6748cjE> e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public MultihouseholdNudgeApplicationStartupListener get() {
        MultihouseholdNudgeApplicationStartupListener d = d();
        C6751cjH.d(d, this.e.get());
        return d;
    }

    public static MultihouseholdNudgeApplicationStartupListener d() {
        return new MultihouseholdNudgeApplicationStartupListener();
    }
}
