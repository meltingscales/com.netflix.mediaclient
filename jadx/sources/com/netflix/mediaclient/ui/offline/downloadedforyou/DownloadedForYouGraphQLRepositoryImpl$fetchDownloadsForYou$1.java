package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1332Xp;
import o.C1352Yj;
import o.C2293adX;
import o.C8556dpz;
import o.C8569dql;
import o.C8572dqo;
import o.C8586drb;
import o.C8589dre;
import o.C8954gU;
import o.InterfaceC5184btv;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.aDI;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends InterfaceC5184btv>>, Object> {
    final /* synthetic */ InterfaceC5283bvo c;
    int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1(InterfaceC5283bvo interfaceC5283bvo, int i, InterfaceC8585dra<? super DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = interfaceC5283bvo;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<? extends InterfaceC5184btv>> interfaceC8585dra) {
        return ((DownloadedForYouGraphQLRepositoryImpl$fetchDownloadsForYou$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List i;
        List i2;
        List<C1352Yj.c> c;
        int d;
        e = C8586drb.e();
        int i3 = this.d;
        if (i3 == 0) {
            C8556dpz.d(obj);
            aCG.e eVar = aCG.b;
            C1332Xp c1332Xp = C1332Xp.b;
            aCG e2 = eVar.e((Context) C1332Xp.b(Context.class), this.c);
            C1352Yj c1352Yj = new C1352Yj(null, C8589dre.c(this.e));
            QueryMode queryMode = QueryMode.d;
            this.d = 1;
            obj = aCE.d.d((aCE) e2, (InterfaceC8999hM) c1352Yj, queryMode, (RequestPriority) null, false, (InterfaceC8585dra) this, 12, (Object) null);
            if (obj == e) {
                return e;
            }
        } else if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C1352Yj.d dVar = (C1352Yj.d) ((C8954gU) obj).d;
        if (dVar != null) {
            C1352Yj.b e3 = dVar.e();
            if (e3 == null || (c = e3.c()) == null) {
                i2 = C8569dql.i();
                return i2;
            }
            d = C8572dqo.d(c, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C1352Yj.c cVar : c) {
                C1352Yj.a d2 = cVar.d();
                C2293adX e4 = d2 != null ? d2.e() : null;
                if (e4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                arrayList.add(new aDI(e4));
            }
            return arrayList;
        }
        i = C8569dql.i();
        return i;
    }
}
