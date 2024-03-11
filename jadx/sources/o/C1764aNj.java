package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.cdx.UserAgentEventsReceiver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.aNj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1764aNj implements Factory<CdxAgentImpl> {
    private final Provider<aGT> c;
    private final Provider<UserAgentEventsReceiver> d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public CdxAgentImpl get() {
        CdxAgentImpl b = b();
        C1770aNp.a(b, this.d.get());
        C1770aNp.c(b, this.c.get());
        return b;
    }

    public static CdxAgentImpl b() {
        return new CdxAgentImpl();
    }
}
