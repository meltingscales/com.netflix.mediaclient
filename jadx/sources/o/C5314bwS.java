package o;

import android.app.Application;
import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bwS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5314bwS implements Factory<AdsPlanApplicationImpl> {
    private final Provider<C8242dgg> a;
    private final Provider<Application> c;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public AdsPlanApplicationImpl get() {
        AdsPlanApplicationImpl e = e(this.c.get());
        C5312bwQ.e(e, this.a.get());
        return e;
    }

    public static AdsPlanApplicationImpl e(Application application) {
        return new AdsPlanApplicationImpl(application);
    }
}
