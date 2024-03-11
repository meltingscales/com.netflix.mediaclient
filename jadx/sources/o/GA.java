package o;

import com.netflix.common.di.RxJavaModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.SingleThread"})
/* loaded from: classes3.dex */
public final class GA implements Factory<Scheduler> {
    private final RxJavaModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Scheduler get() {
        return c(this.e);
    }

    public static Scheduler c(RxJavaModule rxJavaModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(rxJavaModule.a());
    }
}
