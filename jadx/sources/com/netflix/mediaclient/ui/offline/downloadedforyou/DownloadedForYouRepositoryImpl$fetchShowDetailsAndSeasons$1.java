package com.netflix.mediaclient.ui.offline.downloadedforyou;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6004cQk;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>>, Object> {
    final /* synthetic */ TaskMode a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1(String str, String str2, boolean z, TaskMode taskMode, String str3, InterfaceC8585dra<? super DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = str;
        this.d = str2;
        this.e = z;
        this.a = taskMode;
        this.b = str3;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> interfaceC8585dra) {
        return ((DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouRepositoryImpl$fetchShowDetailsAndSeasons$1(this.c, this.d, this.e, this.a, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.i == 0) {
            C8556dpz.d(obj);
            C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF> blockingGet = new C6004cQk().b(this.c, this.d, this.e, this.a, this.b).blockingGet();
            C8632dsu.a(blockingGet, "");
            return blockingGet;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
