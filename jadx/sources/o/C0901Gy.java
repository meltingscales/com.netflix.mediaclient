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
@QualifierMetadata({"com.netflix.common.di.Main", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* renamed from: o.Gy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0901Gy implements Factory<dwQ> {
    private final CoroutinesModule c;
    private final Provider<Context> e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public dwQ get() {
        return a(this.c, this.e.get());
    }

    public static dwQ a(CoroutinesModule coroutinesModule, Context context) {
        return (dwQ) Preconditions.checkNotNullFromProvides(coroutinesModule.b(context));
    }
}
