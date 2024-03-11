package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C4656bid;
import o.C4755bkv;
import o.C8556dpz;
import o.C8566dqi;
import o.C8586drb;
import o.C8589dre;
import o.C8737dwr;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes6.dex */
public final class QualityBasedSelector$selectPlaying$elapsedTime$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ List<? extends C4656bid> c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ Ref.LongRef g;
    final /* synthetic */ int h;
    final /* synthetic */ Ref.IntRef i;
    final /* synthetic */ float j;
    final /* synthetic */ long k;
    private /* synthetic */ Object l;
    int m;
    final /* synthetic */ Object n$7488013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityBasedSelector$selectPlaying$elapsedTime$1$1(Object obj, int i, long j, long j2, long j3, List<? extends C4656bid> list, long j4, Ref.LongRef longRef, int i2, float f, Ref.IntRef intRef, long j5, InterfaceC8585dra<? super QualityBasedSelector$selectPlaying$elapsedTime$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.n$7488013c = obj;
        this.h = i;
        this.k = j;
        this.a = j2;
        this.e = j3;
        this.c = list;
        this.b = j4;
        this.g = longRef;
        this.d = i2;
        this.j = f;
        this.i = intRef;
        this.f = j5;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((QualityBasedSelector$selectPlaying$elapsedTime$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        QualityBasedSelector$selectPlaying$elapsedTime$1$1 qualityBasedSelector$selectPlaying$elapsedTime$1$1 = new QualityBasedSelector$selectPlaying$elapsedTime$1$1(this.n$7488013c, this.h, this.k, this.a, this.e, this.c, this.b, this.g, this.d, this.j, this.i, this.f, interfaceC8585dra);
        qualityBasedSelector$selectPlaying$elapsedTime$1$1.l = obj;
        return qualityBasedSelector$selectPlaying$elapsedTime$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dwU dwu;
        Object[] objArr;
        Iterable<Number> iterable;
        C8586drb.e();
        if (this.m == 0) {
            C8556dpz.d(obj);
            dwU dwu2 = (dwU) this.l;
            Object obj2 = this.n$7488013c;
            try {
                Object obj3 = C4755bkv.q.get(48900594);
                if (obj3 == null) {
                    obj3 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("b", null);
                    C4755bkv.q.put(48900594, obj3);
                }
                Iterable<int[]> iterable2 = (Iterable) ((Method) obj3).invoke(obj2, null);
                Object obj4 = this.n$7488013c;
                int i = this.h;
                long j = this.k;
                long j2 = this.a;
                long j3 = this.e;
                List<? extends C4656bid> list = this.c;
                long j4 = j2;
                long j5 = this.b;
                Ref.LongRef longRef = this.g;
                int i2 = this.d;
                float f = this.j;
                Ref.IntRef intRef = this.i;
                long j6 = j5;
                long j7 = this.f;
                for (int[] iArr : iterable2) {
                    if (iArr[0] == iArr[1]) {
                        try {
                            Object obj5 = C4755bkv.q.get(48901555);
                            if (obj5 == null) {
                                obj5 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("c", null);
                                C4755bkv.q.put(48901555, obj5);
                            }
                            iterable = C8566dqi.e(C8589dre.b(((Integer) ((Method) obj5).invoke(obj4, null)).intValue()));
                            dwu = dwu2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        try {
                            Object obj6 = C4755bkv.q.get(48904438);
                            if (obj6 != null) {
                                dwu = dwu2;
                                objArr = null;
                            } else {
                                dwu = dwu2;
                                objArr = null;
                                obj6 = ((Class) C4755bkv.b((char) 0, 5, 2499)).getMethod("f", null);
                                C4755bkv.q.put(48904438, obj6);
                            }
                            iterable = (Iterable) ((Method) obj6).invoke(obj4, objArr);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                    for (Number number : iterable) {
                        long longValue = number.longValue();
                        Ref.LongRef longRef2 = longRef;
                        long j8 = j3;
                        long j9 = j4;
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        long j10 = j6;
                        int i5 = i + i4;
                        C8737dwr.c(dwu, GF.c(), null, new QualityBasedSelector$selectPlaying$elapsedTime$1$1$1$1$1(longValue, obj4, j, j9, j8, list, j10, longRef2, i + i3, i5, i2, f, intRef, j7, iArr, null), 2, null);
                        obj4 = obj4;
                        list = list;
                        j = j;
                        i = i;
                        j4 = j9;
                        j3 = j8;
                        longRef = longRef2;
                        j6 = j10;
                    }
                    dwu2 = dwu;
                }
                return dpR.c;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
