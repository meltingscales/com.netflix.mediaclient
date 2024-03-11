package com.netflix.mediaclient.hendrixconfig.impl;

import android.system.OsConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1552aFn;
import o.C1555aFq;
import o.C1563aFy;
import o.C1596aHd;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC1544aFf;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8585dra;
import o.aFO;
import o.aFQ;
import o.aFT;
import o.aFW;
import o.dEP;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class ConfigScopeState$persistChanges$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1563aFy a;
    int b;
    private /* synthetic */ Object c;
    final /* synthetic */ C1555aFq d;
    final /* synthetic */ C1563aFy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigScopeState$persistChanges$1(C1555aFq c1555aFq, C1563aFy c1563aFy, C1563aFy c1563aFy2, InterfaceC8585dra<? super ConfigScopeState$persistChanges$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c1555aFq;
        this.e = c1563aFy;
        this.a = c1563aFy2;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ConfigScopeState$persistChanges$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ConfigScopeState$persistChanges$1 configScopeState$persistChanges$1 = new ConfigScopeState$persistChanges$1(this.d, this.e, this.a, interfaceC8585dra);
        configScopeState$persistChanges$1.c = obj;
        return configScopeState$persistChanges$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Map k;
        Throwable th;
        Map k2;
        Throwable th2;
        aFT aft;
        Object a;
        boolean z;
        aFO afo;
        Set<InterfaceC1544aFf> set;
        e = C8586drb.e();
        int i = this.b;
        try {
        } catch (IOException e2) {
            Integer c = aFQ.c(e2);
            int i2 = OsConstants.ENOSPC;
            if (c != null && c.intValue() == i2) {
                C1552aFn.e();
            } else {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                Map<String, String> c2 = this.a.c().c().c();
                ErrorType errorType = ErrorType.g;
                k2 = dqE.k(c2);
                C1596aHd c1596aHd = new C1596aHd("Error updating config", e2, errorType, true, k2, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c3 = errorType2.c();
                        c1596aHd.a(c3 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        } catch (Throwable th3) {
            InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
            Map<String, String> c4 = this.a.c().c().c();
            ErrorType errorType3 = ErrorType.g;
            k = dqE.k(c4);
            C1596aHd c1596aHd2 = new C1596aHd("Error updating config", th3, errorType3, true, k, false, false, 96, null);
            ErrorType errorType4 = c1596aHd2.a;
            if (errorType4 != null) {
                c1596aHd2.e.put("errorType", errorType4.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c5 = errorType4.c();
                    c1596aHd2.a(c5 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c6 = dVar3.c();
            if (c6 != null) {
                c6.d(c1596aHd2, th);
            } else {
                dVar3.e().b(c1596aHd2, th);
            }
        }
        if (i == 0) {
            C8556dpz.d(obj);
            aft = this.d.n;
            dEP e3 = this.e.c().e();
            dEP e4 = this.a.c().e();
            this.c = (dwU) this.c;
            this.b = 1;
            a = aft.a(e3, e4, this);
            if (a == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu = (dwU) this.c;
            C8556dpz.d(obj);
            a = obj;
        }
        Set<String> set2 = (Set) a;
        if (!set2.isEmpty()) {
            set = this.d.b;
            C1555aFq c1555aFq = this.d;
            for (InterfaceC1544aFf interfaceC1544aFf : set) {
                try {
                    Result.c cVar2 = Result.e;
                    interfaceC1544aFf.e(c1555aFq, set2);
                    Result.e(dpR.c);
                } catch (Throwable th4) {
                    Result.c cVar3 = Result.e;
                    Result.e(C8556dpz.a(th4));
                }
            }
        }
        z = this.d.f;
        if (z) {
            afo = this.d.j;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.a, null);
            this.c = null;
            this.b = 2;
            if (afo.b(anonymousClass2, this) == e) {
                return e;
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$persistChanges$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<aFW, InterfaceC8585dra<? super aFW>, Object> {
        final /* synthetic */ C1563aFy b;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C1563aFy c1563aFy, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = c1563aFy;
        }

        @Override // o.drX
        /* renamed from: c */
        public final Object invoke(aFW afw, InterfaceC8585dra<? super aFW> interfaceC8585dra) {
            return ((AnonymousClass2) create(afw, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.b, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                return this.b.c();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
