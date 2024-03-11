package o;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.C7174crI;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* renamed from: o.crQ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7182crQ implements Factory<C7174crI.b> {
    private final Provider<Boolean> b;
    private final Provider<InterfaceC7303ctf> e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public C7174crI.b get() {
        return a(this.b.get().booleanValue(), this.e.get());
    }

    public static C7174crI.b a(boolean z, InterfaceC7303ctf interfaceC7303ctf) {
        return new C7174crI.b(z, interfaceC7303ctf);
    }
}
