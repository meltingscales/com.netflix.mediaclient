package o;

import android.content.Context;
import com.netflix.common.di.CoroutinesModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.App", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class GB implements Factory<dwU> {
    private final CoroutinesModule d;
    private final Provider<Context> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public dwU get() {
        return a(this.d, this.e.get());
    }

    public static dwU a(CoroutinesModule coroutinesModule, Context context) {
        return (dwU) Preconditions.checkNotNullFromProvides(coroutinesModule.d(context));
    }
}
