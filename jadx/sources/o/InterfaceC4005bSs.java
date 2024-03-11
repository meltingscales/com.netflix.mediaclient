package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import io.reactivex.Completable;

/* renamed from: o.bSs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4005bSs extends InterfaceC4004bSr {
    public static final e a = e.d;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.bSs$c */
    /* loaded from: classes4.dex */
    public interface c {
        InterfaceC4005bSs c();
    }

    static InterfaceC4005bSs a(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        return a.a(context, interfaceC5283bvo);
    }

    Completable a(String str, String str2);

    Completable d(String str);

    Completable e();

    Completable e(int i, String str, boolean z, boolean z2, boolean z3);

    /* renamed from: o.bSs$e */
    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e d = new e();

        private e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
            if (r0 != false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.InterfaceC4005bSs a(android.content.Context r12, o.InterfaceC5283bvo r13) {
            /*
                r11 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r12, r0)
                o.C8632dsu.c(r13, r0)
                java.lang.String r0 = r13.getProfileGuid()
                if (r0 == 0) goto L14
                boolean r0 = o.C8684dus.a(r0)
                if (r0 == 0) goto Lb2
            L14:
                o.aHe$d r0 = o.InterfaceC1597aHe.b
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r6 = o.dqF.d(r0)
                o.aHd r0 = new o.aHd
                java.lang.String r2 = "SPY-35060 - User profile has a null or blank profile GUID"
                r3 = 0
                r4 = 0
                r5 = 1
                r7 = 0
                r8 = 0
                r9 = 96
                r10 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                com.netflix.mediaclient.api.logging.error.ErrorType r1 = r0.a
                if (r1 == 0) goto L5f
                java.util.Map<java.lang.String, java.lang.String> r2 = r0.e
                java.lang.String r3 = "errorType"
                java.lang.String r4 = r1.c()
                r2.put(r3, r4)
                java.lang.String r2 = r0.b()
                if (r2 == 0) goto L5f
                java.lang.String r1 = r1.c()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = " "
                r3.append(r1)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                r0.a(r1)
            L5f:
                java.lang.String r1 = r0.b()
                if (r1 == 0) goto L75
                java.lang.Throwable r1 = r0.i
                if (r1 == 0) goto L75
                java.lang.Throwable r1 = new java.lang.Throwable
                java.lang.String r2 = r0.b()
                java.lang.Throwable r3 = r0.i
                r1.<init>(r2, r3)
                goto L9f
            L75:
                java.lang.String r1 = r0.b()
                if (r1 == 0) goto L85
                java.lang.Throwable r1 = new java.lang.Throwable
                java.lang.String r2 = r0.b()
                r1.<init>(r2)
                goto L9f
            L85:
                java.lang.Throwable r1 = r0.i
                if (r1 == 0) goto L98
                if (r1 == 0) goto L8c
                goto L9f
            L8c:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Required value was null."
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L98:
                java.lang.Throwable r1 = new java.lang.Throwable
                java.lang.String r2 = "Handled exception with no message"
                r1.<init>(r2)
            L9f:
                o.aHi$d r2 = o.InterfaceC1601aHi.c
                o.aHe r3 = r2.c()
                if (r3 == 0) goto Lab
                r3.d(r0, r1)
                goto Lb2
            Lab:
                o.aHb r2 = r2.e()
                r2.b(r0, r1)
            Lb2:
                o.aGb$e r0 = o.C1567aGb.a
                o.aGb r13 = r0.e(r13)
                o.aFY$b r0 = o.aFY.b
                o.aFY r12 = r0.e(r12)
                o.aFU r12 = r12.e(r13)
                java.lang.Class<o.bSs$c> r13 = o.InterfaceC4005bSs.c.class
                java.lang.Object r12 = dagger.hilt.EntryPoints.get(r12, r13)
                o.bSs$c r12 = (o.InterfaceC4005bSs.c) r12
                o.bSs r12 = r12.c()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC4005bSs.e.a(android.content.Context, o.bvo):o.bSs");
        }
    }

    /* renamed from: o.bSs$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ Completable d(InterfaceC4005bSs interfaceC4005bSs, int i, String str, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                return interfaceC4005bSs.e(i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetchInitialLolomo");
        }
    }
}
