package o;

import android.content.Context;
import com.netflix.mediaclient.hendrixconfig.impl.CoreSingletonConfigModule;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext", "com.netflix.common.di.App", "com.netflix.mediaclient.hendrixconfig.impl.ConfigInternal"})
/* renamed from: o.aFt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1558aFt implements Factory<UserAgentListener> {
    private final Provider<Context> a;
    private final Provider<C1555aFq> b;
    private final CoreSingletonConfigModule d;
    private final Provider<dwU> e;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public UserAgentListener get() {
        return d(this.d, this.a.get(), this.e.get(), this.b.get());
    }

    public static UserAgentListener d(CoreSingletonConfigModule coreSingletonConfigModule, Context context, dwU dwu, C1555aFq c1555aFq) {
        return (UserAgentListener) Preconditions.checkNotNullFromProvides(coreSingletonConfigModule.d(context, dwu, c1555aFq));
    }
}
