package o;

import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bzT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5474bzT implements MembersInjector<CollectPhoneFragment> {
    private final Provider<InterfaceC1573aGh> c;
    private final Provider<CollectPhone.e> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(CollectPhoneFragment collectPhoneFragment) {
        C1095Om.d(collectPhoneFragment, DoubleCheck.lazy(this.c));
        d(collectPhoneFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment.injectedAgent")
    public static void d(CollectPhoneFragment collectPhoneFragment, CollectPhone.e eVar) {
        collectPhoneFragment.injectedAgent = eVar;
    }
}
