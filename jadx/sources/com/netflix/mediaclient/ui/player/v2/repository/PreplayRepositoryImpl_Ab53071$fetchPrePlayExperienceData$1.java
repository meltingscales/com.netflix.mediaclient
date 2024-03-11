package com.netflix.mediaclient.ui.player.v2.repository;

import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import io.reactivex.Single;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1044Mm;
import o.C1386Zk;
import o.C2584aio;
import o.C2586aiq;
import o.C5713cFp;
import o.C5720cFw;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.aEG;
import o.dAU;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C5713cFp.d>, Object> {
    final /* synthetic */ C5720cFw b;
    int d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1(String str, C5720cFw c5720cFw, InterfaceC8585dra<? super PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.b = c5720cFw;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C5713cFp.d> interfaceC8585dra) {
        return ((PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PreplayRepositoryImpl_Ab53071$fetchPrePlayExperienceData$1(this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C5713cFp.d c;
        aDB adb;
        aDB adb2;
        aCG acg;
        Object d;
        Object d2;
        e = C8586drb.e();
        int i = this.d;
        try {
        } catch (ApolloException e2) {
            String localizedMessage = e2.getLocalizedMessage();
            C1044Mm.d("PreplayRepositoryImpl_Ab53071", "An apollo exception happened " + localizedMessage);
            c = C5713cFp.e.c();
        } catch (IllegalArgumentException e3) {
            String localizedMessage2 = e3.getLocalizedMessage();
            C1044Mm.d("PreplayRepositoryImpl_Ab53071", "Received illegal data " + localizedMessage2);
            c = C5713cFp.e.c();
        }
        if (i == 0) {
            C8556dpz.d(obj);
            int parseInt = Integer.parseInt(this.e);
            Integer c2 = C8589dre.c(1);
            adb = this.b.b;
            adb2 = this.b.b;
            C1386Zk c1386Zk = new C1386Zk(parseInt, c2, aDB.b(adb, adb2.t(), null, 2, null));
            acg = this.b.c;
            this.d = 1;
            d = aCE.d.d((aCE) acg, (InterfaceC8999hM) c1386Zk, (QueryMode) null, (RequestPriority) null, false, (InterfaceC8585dra) this, 14, (Object) null);
            if (d == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                d2 = obj;
                c = (C5713cFp.d) d2;
                C8632dsu.d(c);
                return c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            d = obj;
        }
        C1386Zk.d b = ((C1386Zk.c) aCK.e((C8954gU) d)).b();
        C2584aio b2 = b != null ? b.b() : null;
        if (b2 == null) {
            c = C5713cFp.e.c();
        } else {
            C2584aio.a b3 = b2.b();
            if (b3 != null && b3.e() > 0) {
                List<C2584aio.b> a = b3.a();
                if (a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C2584aio.c e4 = a.get(0).e();
                C2586aiq d3 = e4 != null ? e4.d() : null;
                if (d3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                aEG aeg = new aEG(d3);
                String prePlayVideoId = aeg.getPrePlayVideoId();
                if (prePlayVideoId != null && prePlayVideoId.length() != 0) {
                    PlayContextImp playContextImp = new PlayContextImp(aeg.getType(), aeg.getTrackId(), 0, 0);
                    playContextImp.b(aeg.getAutoPlay());
                    String prePlayVideoId2 = aeg.getPrePlayVideoId();
                    if (prePlayVideoId2 != null && prePlayVideoId2.length() != 0) {
                        Single<C5713cFp.d> c3 = this.b.c(prePlayVideoId2, playContextImp, aeg.getUiLabel(), aeg.getImpressionData());
                        this.d = 2;
                        d2 = dAU.d(c3, this);
                        if (d2 == e) {
                            return e;
                        }
                        c = (C5713cFp.d) d2;
                    }
                    c = C5713cFp.e.c();
                }
                c = C5713cFp.e.c();
            } else {
                c = C5713cFp.e.c();
            }
        }
        C8632dsu.d(c);
        return c;
    }
}
