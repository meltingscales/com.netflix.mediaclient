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
@QualifierMetadata({"com.netflix.common.di.IO", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class GC implements Factory<dwQ> {
    private final CoroutinesModule a;
    private final Provider<Context> d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public dwQ get() {
        return d(this.a, this.d.get());
    }

    public static dwQ d(CoroutinesModule coroutinesModule, Context context) {
        return (dwQ) Preconditions.checkNotNullFromProvides(coroutinesModule.e(context));
    }
}
