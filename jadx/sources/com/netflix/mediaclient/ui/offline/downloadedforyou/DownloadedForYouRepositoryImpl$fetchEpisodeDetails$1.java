package com.netflix.mediaclient.ui.offline.downloadedforyou;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6004cQk;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5227bul;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5227bul>>, Object> {
    final /* synthetic */ TaskMode a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1(String str, String str2, boolean z, TaskMode taskMode, String str3, InterfaceC8585dra<? super DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.c = str2;
        this.b = z;
        this.a = taskMode;
        this.d = str3;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5227bul>> interfaceC8585dra) {
        return ((DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouRepositoryImpl$fetchEpisodeDetails$1(this.e, this.c, this.b, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.h == 0) {
            C8556dpz.d(obj);
            C6004cQk.b<InterfaceC5227bul> blockingGet = new C6004cQk().e(this.e, this.c, this.b, this.a, this.d).blockingGet();
            C8632dsu.a(blockingGet, "");
            return blockingGet;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
