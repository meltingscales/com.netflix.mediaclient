package com.netflix.mediaclient.ui.player.v2;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1383Zh;
import o.C2572aic;
import o.C2579aij;
import o.C2630ajh;
import o.C5593cBd;
import o.C5611cBv;
import o.C8113deJ;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.aEF;
import o.cBB;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;
import org.chromium.net.NetError;

/* loaded from: classes4.dex */
public final class PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C5593cBd>, Object> {
    final /* synthetic */ PlayerExtras a;
    long b;
    final /* synthetic */ String c;
    final /* synthetic */ TaskMode d;
    final /* synthetic */ PlayContext e;
    private /* synthetic */ Object f;
    int g;
    final /* synthetic */ cBB i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1(String str, cBB cbb, PlayerExtras playerExtras, TaskMode taskMode, PlayContext playContext, InterfaceC8585dra<? super PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = str;
        this.i = cbb;
        this.a = playerExtras;
        this.d = taskMode;
        this.e = playContext;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C5593cBd> interfaceC8585dra) {
        return ((PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1 playerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1 = new PlayerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1(this.c, this.i, this.a, this.d, this.e, interfaceC8585dra);
        playerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1.f = obj;
        return playerRepositoryImpl_Ab52320$requestNextEpisodeVideoDetails$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwU dwu;
        aDB adb;
        aDB adb2;
        aCG acg;
        Object d;
        long j;
        Object y;
        e = C8586drb.e();
        int i = this.g;
        if (i == 0) {
            C8556dpz.d(obj);
            dwu = (dwU) this.f;
            int parseInt = Integer.parseInt(this.c);
            adb = this.i.e;
            adb2 = this.i.e;
            C1383Zh c1383Zh = new C1383Zh(parseInt, aDB.b(adb, adb2.t(), null, 2, null));
            PlayerExtras playerExtras = this.a;
            long e2 = playerExtras != null ? playerExtras.e() : -1L;
            try {
                acg = this.i.d;
                QueryMode b = C8113deJ.e.b(this.d);
                this.f = dwu;
                this.b = e2;
                this.g = 1;
                d = aCE.d.d((aCE) acg, (InterfaceC8999hM) c1383Zh, b, (RequestPriority) null, false, (InterfaceC8585dra) this, 12, (Object) null);
                if (d == e) {
                    return e;
                }
                j = e2;
            } catch (Exception unused) {
                dwY.c(dwu);
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                C8632dsu.a(netflixImmutableStatus, "");
                return new C5593cBd(null, netflixImmutableStatus, null, new EmptyPlayContext(C5611cBv.a.getLogTag(), NetError.ERR_CONTENT_DECODING_FAILED), 0L, null, null, 117, null);
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            long j2 = this.b;
            try {
                C8556dpz.d(obj);
                j = j2;
                d = obj;
            } catch (Exception unused2) {
                dwu = (dwU) this.f;
                dwY.c(dwu);
                NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ad;
                C8632dsu.a(netflixImmutableStatus2, "");
                return new C5593cBd(null, netflixImmutableStatus2, null, new EmptyPlayContext(C5611cBv.a.getLogTag(), NetError.ERR_CONTENT_DECODING_FAILED), 0L, null, null, 117, null);
            }
        }
        List<C1383Zh.c> b2 = ((C1383Zh.b) aCK.e((C8954gU) d)).b();
        if (b2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        y = C8576dqs.y(b2);
        C1383Zh.c cVar = (C1383Zh.c) y;
        if (cVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C1383Zh.a a = cVar.a();
        C1383Zh.e b3 = a != null ? a.b() : null;
        if (b3 != null) {
            C2579aij b4 = b3.b();
            C2630ajh b5 = b4.b();
            C2572aic.b e3 = b3.d().e();
            aEF aef = new aEF(b5, b4, null, e3 != null ? e3.d() : null, b3.d());
            NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.aJ;
            C8632dsu.a(netflixImmutableStatus3, "");
            return new C5593cBd(aef, netflixImmutableStatus3, null, this.e, j, null, null, 100, null);
        }
        NetflixImmutableStatus netflixImmutableStatus4 = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus4, "");
        return new C5593cBd(null, netflixImmutableStatus4, null, new EmptyPlayContext(C5611cBv.a.getLogTag(), NetError.ERR_CONTENT_DECODING_FAILED), 0L, null, null, 117, null);
    }
}
