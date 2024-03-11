package o;

import com.netflix.mediaclient.net.CronetModule;
import com.netflix.mediaclient.net.NetflixCronetProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* renamed from: o.aHx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1616aHx implements Factory<List<NetflixCronetProvider.PreferredCronetProvider>> {
    private final Provider<dEB> c;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public List<NetflixCronetProvider.PreferredCronetProvider> get() {
        return e(this.c.get());
    }

    public static List<NetflixCronetProvider.PreferredCronetProvider> e(dEB deb) {
        return (List) Preconditions.checkNotNullFromProvides(CronetModule.d.e(deb));
    }
}
