package com.netflix.mediaclient.ui.offline.downloadedforyou;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6004cQk;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5238buw;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouRepositoryImpl$fetchMovieDetails$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5238buw>>, Object> {
    final /* synthetic */ TaskMode a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouRepositoryImpl$fetchMovieDetails$1(String str, String str2, boolean z, TaskMode taskMode, String str3, InterfaceC8585dra<? super DownloadedForYouRepositoryImpl$fetchMovieDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = str;
        this.d = str2;
        this.e = z;
        this.a = taskMode;
        this.c = str3;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5238buw>> interfaceC8585dra) {
        return ((DownloadedForYouRepositoryImpl$fetchMovieDetails$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouRepositoryImpl$fetchMovieDetails$1(this.b, this.d, this.e, this.a, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.g == 0) {
            C8556dpz.d(obj);
            C6004cQk.b<InterfaceC5238buw> blockingGet = new C6004cQk().a(this.b, this.d, this.e, this.a, this.c).blockingGet();
            C8632dsu.a(blockingGet, "");
            return blockingGet;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
