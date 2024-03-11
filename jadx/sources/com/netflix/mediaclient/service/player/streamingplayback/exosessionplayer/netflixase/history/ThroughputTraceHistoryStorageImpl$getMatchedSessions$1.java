package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import com.netflix.mediaclient.storage.db.AppHistoryDb;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import o.C1044Mm;
import o.C4755bkv;
import o.C5339bwr;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8737dwr;
import o.C8779dyf;
import o.GF;
import o.InterfaceC5324bwc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* loaded from: classes6.dex */
public final class ThroughputTraceHistoryStorageImpl$getMatchedSessions$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Object>, Object> {
    final /* synthetic */ Ref.ObjectRef<List<C5339bwr>> a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThroughputTraceHistoryStorageImpl$getMatchedSessions$1(Ref.ObjectRef<List<C5339bwr>> objectRef, String str, String str2, String str3, InterfaceC8585dra<? super ThroughputTraceHistoryStorageImpl$getMatchedSessions$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = objectRef;
        this.e = str;
        this.c = str2;
        this.b = str3;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<Object> interfaceC8585dra) {
        return ((ThroughputTraceHistoryStorageImpl$getMatchedSessions$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ThroughputTraceHistoryStorageImpl$getMatchedSessions$1(this.a, this.e, this.c, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i != 0) {
                if (i == 1) {
                    C8556dpz.d(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8556dpz.d(obj);
            Object obj2 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getField("c").get(null);
            Object obj3 = C4755bkv.q.get(32279138);
            if (obj3 == null) {
                obj3 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getMethod("d", null);
                C4755bkv.q.put(32279138, obj3);
            }
            long longValue = ((Long) ((Method) obj3).invoke(obj2, null)).longValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.e, this.c, this.b, null);
            this.d = 1;
            Object a = C8779dyf.a(longValue, anonymousClass1, this);
            return a == e ? e : a;
        } catch (TimeoutCancellationException e2) {
            return C8589dre.c(C1044Mm.e("ThroughputTraceHistoryStorageImpl", e2, "Cancelled DB lookup", new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history.ThroughputTraceHistoryStorageImpl$getMatchedSessions$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dxD>, Object> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Ref.ObjectRef<List<C5339bwr>> c;
        final /* synthetic */ String d;
        int e;
        private /* synthetic */ Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<List<C5339bwr>> objectRef, String str, String str2, String str3, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = objectRef;
            this.a = str;
            this.b = str2;
            this.d = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.a, this.b, this.d, interfaceC8585dra);
            anonymousClass1.f = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dxD> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history.ThroughputTraceHistoryStorageImpl$getMatchedSessions$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C00521 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ String a;
            Object b;
            final /* synthetic */ String c;
            final /* synthetic */ Ref.ObjectRef<List<C5339bwr>> d;
            final /* synthetic */ String e;
            int h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00521(Ref.ObjectRef<List<C5339bwr>> objectRef, String str, String str2, String str3, InterfaceC8585dra<? super C00521> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.d = objectRef;
                this.c = str;
                this.a = str2;
                this.e = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new C00521(this.d, this.c, this.a, this.e, interfaceC8585dra);
            }

            @Override // o.drX
            /* renamed from: d */
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00521) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                Ref.ObjectRef<List<C5339bwr>> objectRef;
                T t;
                e = C8586drb.e();
                int i = this.h;
                if (i == 0) {
                    C8556dpz.d(obj);
                    Ref.ObjectRef<List<C5339bwr>> objectRef2 = this.d;
                    try {
                        Object obj2 = C4755bkv.q.get(32276255);
                        if (obj2 == null) {
                            obj2 = ((Class) C4755bkv.b((char) 0, 5, 1484)).getMethod("a", null);
                            C4755bkv.q.put(32276255, obj2);
                        }
                        InterfaceC5324bwc b = ((AppHistoryDb) ((Method) obj2).invoke(null, null)).b();
                        String str = this.c;
                        String str2 = this.a;
                        String str3 = this.e;
                        this.b = objectRef2;
                        this.h = 1;
                        Object e2 = b.e(str, str2, str3, this);
                        if (e2 == e) {
                            return e;
                        }
                        objectRef = objectRef2;
                        t = e2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    objectRef = (Ref.ObjectRef) this.b;
                    C8556dpz.d(obj);
                    t = obj;
                }
                objectRef.d = t;
                return dpR.c;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dxD c;
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                c = C8737dwr.c((dwU) this.f, GF.c(), null, new C00521(this.c, this.a, this.b, this.d, null), 2, null);
                return c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
