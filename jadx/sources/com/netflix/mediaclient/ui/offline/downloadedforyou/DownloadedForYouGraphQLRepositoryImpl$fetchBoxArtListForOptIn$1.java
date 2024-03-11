package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C1351Yi;
import o.C2625ajc;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.aDB;
import o.aGD;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends String>>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ InterfaceC5283bvo b;
    Object c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1(InterfaceC5283bvo interfaceC5283bvo, int i, InterfaceC8585dra<? super DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC5283bvo;
        this.a = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1(this.b, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<String>> interfaceC8585dra) {
        return ((DownloadedForYouGraphQLRepositoryImpl$fetchBoxArtListForOptIn$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List list;
        C1351Yi.c b;
        List<C1351Yi.b> a;
        C2625ajc a2;
        C2625ajc.b e2;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            aCG.e eVar = aCG.b;
            C1332Xp c1332Xp = C1332Xp.b;
            aCG e3 = eVar.e((Context) C1332Xp.b(Context.class), this.b);
            Context d = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d, "");
            aDB d2 = aGD.d(d);
            C1351Yi c1351Yi = new C1351Yi(null, C8589dre.c(this.a), aDB.b(d2, d2.s(), null, 2, null));
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.e = 1;
            Object d3 = aCE.d.d((aCE) e3, (InterfaceC8999hM) c1351Yi, (QueryMode) null, (RequestPriority) null, false, (InterfaceC8585dra) this, 14, (Object) null);
            if (d3 == e) {
                return e;
            }
            list = arrayList;
            obj = d3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            list = (List) this.c;
            C8556dpz.d(obj);
        }
        C1351Yi.e eVar2 = (C1351Yi.e) ((C8954gU) obj).d;
        if (eVar2 != null && (b = eVar2.b()) != null && (a = b.a()) != null) {
            for (C1351Yi.b bVar : a) {
                C1351Yi.a e4 = bVar.e();
                String e5 = (e4 == null || (a2 = e4.a()) == null || (e2 = a2.e()) == null) ? null : e2.e();
                if (e5 != null && e5.length() != 0) {
                    list.add(e5);
                }
            }
        }
        return list;
    }
}
