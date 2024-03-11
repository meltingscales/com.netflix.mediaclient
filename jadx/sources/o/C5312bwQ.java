package o;

import com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bwQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5312bwQ implements MembersInjector<AdsPlanApplicationImpl> {
    private final Provider<C8242dgg> b;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(AdsPlanApplicationImpl adsPlanApplicationImpl) {
        e(adsPlanApplicationImpl, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.adsplan.impl.AdsPlanApplicationImpl.cacheHelper")
    public static void e(AdsPlanApplicationImpl adsPlanApplicationImpl, C8242dgg c8242dgg) {
        adsPlanApplicationImpl.cacheHelper = c8242dgg;
    }
}
