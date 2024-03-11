package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.service.user.UserAgent;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1317Xa;
import o.C1331Xo;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.VN;
import o.VT;
import o.VZ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class PrefetchInfraImpl$fetchTargetProfileData$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ VZ b;
    final /* synthetic */ InterfaceC5283bvo d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchInfraImpl$fetchTargetProfileData$1(String str, VZ vz, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super PrefetchInfraImpl$fetchTargetProfileData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.b = vz;
        this.d = interfaceC5283bvo;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PrefetchInfraImpl$fetchTargetProfileData$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PrefetchInfraImpl$fetchTargetProfileData$1(this.e, this.b, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            UserAgent b = C1331Xo.b.b();
            InterfaceC5283bvo b2 = b != null ? b.b(this.e) : null;
            if (b2 != null) {
                VZ vz = this.b;
                InterfaceC5283bvo interfaceC5283bvo = this.d;
                C1317Xa c1317Xa = C1317Xa.e;
                String profileName = b2.getProfileName();
                C8632dsu.a(profileName, "");
                String e = vz.e();
                String b3 = vz.b();
                String profileGuid = b2.getProfileGuid();
                C8632dsu.a(profileGuid, "");
                VN vn = new VN(profileName, e, b3, profileGuid, b2.getAvatarUrl(), false, vz.j(), null, null, 384, null);
                String profileName2 = interfaceC5283bvo.getProfileName();
                C8632dsu.a(profileName2, "");
                String profileGuid2 = interfaceC5283bvo.getProfileGuid();
                C8632dsu.a(profileGuid2, "");
                String avatarUrl = interfaceC5283bvo.getAvatarUrl();
                String i = c1317Xa.i();
                c1317Xa.d(new VT(vz, vn, new VN(profileName2, "", null, profileGuid2, avatarUrl, true, i == null ? "" : i, null, null, 384, null)));
                c1317Xa.c().d(ConnectionState.f);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
