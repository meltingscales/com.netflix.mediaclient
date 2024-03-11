package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.CfourMoneyballData"})
/* renamed from: o.bzq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5497bzq implements MembersInjector<DemographicCollectionFragment> {
    private final Provider<MoneyballDataSource> c;
    private final Provider<InterfaceC1573aGh> d;
    private final Provider<InterfaceC5427byZ> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(DemographicCollectionFragment demographicCollectionFragment) {
        C1095Om.d(demographicCollectionFragment, DoubleCheck.lazy(this.d));
        b(demographicCollectionFragment, this.e.get());
        e(demographicCollectionFragment, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment.moneyballEntryPoint")
    public static void b(DemographicCollectionFragment demographicCollectionFragment, InterfaceC5427byZ interfaceC5427byZ) {
        demographicCollectionFragment.moneyballEntryPoint = interfaceC5427byZ;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionFragment.moneyballDataSource")
    public static void e(DemographicCollectionFragment demographicCollectionFragment, MoneyballDataSource moneyballDataSource) {
        demographicCollectionFragment.moneyballDataSource = moneyballDataSource;
    }
}
