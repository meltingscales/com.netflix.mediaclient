package o;

import android.content.Context;
import com.netflix.mediaclient.storage.db.RdidCtaConsentStateDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* renamed from: o.bvx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5292bvx implements Factory<RdidCtaConsentStateDatabase> {
    private final Provider<Context> d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public RdidCtaConsentStateDatabase get() {
        return e(this.d.get());
    }

    public static RdidCtaConsentStateDatabase e(Context context) {
        return (RdidCtaConsentStateDatabase) Preconditions.checkNotNullFromProvides(RdidCtaConsentStateDatabase.AppModule.b.e(context));
    }
}
