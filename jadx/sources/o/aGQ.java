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
@QualifierMetadata({"com.netflix.common.di.App", "com.netflix.mediaclient.libs.process.hooks.LowPriorityProcessInit"})
/* loaded from: classes3.dex */
public final class aGQ implements Factory<aGN> {
    private final Provider<dwU> a;
    private final Provider<Map<String, Provider<aGN>>> b;
    private final CoreInitModule c;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public aGN get() {
        return d(this.c, this.a.get(), this.b.get());
    }

    public static aGN d(CoreInitModule coreInitModule, dwU dwu, Map<String, Provider<aGN>> map) {
        return (aGN) Preconditions.checkNotNullFromProvides(coreInitModule.d(dwu, map));
    }
}
