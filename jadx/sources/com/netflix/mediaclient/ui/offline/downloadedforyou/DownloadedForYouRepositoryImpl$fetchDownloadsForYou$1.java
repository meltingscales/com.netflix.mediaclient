package com.netflix.mediaclient.ui.offline.downloadedforyou;

import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6004cQk;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5184btv;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends InterfaceC5184btv>>, Object> {
    final /* synthetic */ InterfaceC5283bvo a;
    final /* synthetic */ int b;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1(InterfaceC5283bvo interfaceC5283bvo, int i, InterfaceC8585dra<? super DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC5283bvo;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1(this.a, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<? extends InterfaceC5184btv>> interfaceC8585dra) {
        return ((DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            C6004cQk c6004cQk = new C6004cQk();
            String profileGuid = this.a.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            Single<C6004cQk.d<List<InterfaceC5184btv>>> e = c6004cQk.e(profileGuid, this.b);
            final AnonymousClass1 anonymousClass1 = new drM<C6004cQk.d<List<? extends InterfaceC5184btv>>, List<? extends InterfaceC5184btv>>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1.1
                @Override // o.drM
                /* renamed from: c */
                public final List<InterfaceC5184btv> invoke(C6004cQk.d<List<InterfaceC5184btv>> dVar) {
                    List<InterfaceC5184btv> i;
                    C8632dsu.c((Object) dVar, "");
                    List<InterfaceC5184btv> c = dVar.c();
                    if (c == null || c.isEmpty()) {
                        i = C8569dql.i();
                        return i;
                    }
                    return c;
                }
            };
            Object blockingGet = e.map(new Function() { // from class: o.cvm
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    List e2;
                    e2 = DownloadedForYouRepositoryImpl$fetchDownloadsForYou$1.e(drM.this, obj2);
                    return e2;
                }
            }).blockingGet();
            C8632dsu.a(blockingGet, "");
            return blockingGet;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(drM drm, Object obj) {
        return (List) drm.invoke(obj);
    }
}
