package o;

import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cgJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6594cgJ implements MembersInjector<MemberRejoinImpl> {
    private final Provider<InterfaceC6590cgF> a;
    private final Provider<C8242dgg> c;
    private final Provider<InterfaceC6636cgz> d;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(MemberRejoinImpl memberRejoinImpl) {
        e(memberRejoinImpl, this.d.get());
        c(memberRejoinImpl, this.a.get());
        d(memberRejoinImpl, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl.memberRejoinFlags")
    public static void e(MemberRejoinImpl memberRejoinImpl, InterfaceC6636cgz interfaceC6636cgz) {
        memberRejoinImpl.memberRejoinFlags = interfaceC6636cgz;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl.moneyballEntryPoint")
    public static void c(MemberRejoinImpl memberRejoinImpl, InterfaceC6590cgF interfaceC6590cgF) {
        memberRejoinImpl.moneyballEntryPoint = interfaceC6590cgF;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl.cacheHelper")
    public static void d(MemberRejoinImpl memberRejoinImpl, C8242dgg c8242dgg) {
        memberRejoinImpl.cacheHelper = c8242dgg;
    }
}
