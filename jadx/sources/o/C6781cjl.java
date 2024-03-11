package o;

import android.content.Context;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* renamed from: o.cjl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6781cjl implements Factory<aCE> {
    private final Provider<Context> a;
    private final Provider<aCI> b;
    private final GameControllerModule d;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public aCE get() {
        return b(this.d, this.a.get(), this.b.get());
    }

    public static aCE b(GameControllerModule gameControllerModule, Context context, aCI aci) {
        return (aCE) Preconditions.checkNotNullFromProvides(gameControllerModule.d(context, aci));
    }
}
