package o;

import com.netflix.mediaclient.libs.process.impl.CoreInitModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.App", "com.netflix.mediaclient.libs.process.hooks.HighPriorityProcessInit"})
/* loaded from: classes3.dex */
public final class aGO implements Factory<aGN> {
    private final Provider<Map<String, Provider<aGN>>> a;
    private final CoreInitModule b;
    private final Provider<dwU> e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public aGN get() {
        return e(this.b, this.e.get(), this.a.get());
    }

    public static aGN e(CoreInitModule coreInitModule, dwU dwu, Map<String, Provider<aGN>> map) {
        return (aGN) Preconditions.checkNotNullFromProvides(coreInitModule.c(dwu, map));
    }
}
