package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public interface aCG extends aCE {
    public static final e b = e.a;

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes3.dex */
    public interface a {
        aCG r();
    }

    @EntryPoint
    @InstallIn({MC.class})
    /* loaded from: classes3.dex */
    public interface c {
        aCG c();
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface d {
        InterfaceC1476aCs aA();
    }

    /* loaded from: classes3.dex */
    public static final class e {
        static final /* synthetic */ e a = new e();

        private e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
            if (r0 != false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.aCG e(android.content.Context r12, o.InterfaceC5283bvo r13) {
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
                java.lang.Class<o.aCG$a> r13 = o.aCG.a.class
                java.lang.Object r12 = dagger.hilt.EntryPoints.get(r12, r13)
                o.aCG$a r12 = (o.aCG.a) r12
                o.aCG r12 = r12.r()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aCG.e.e(android.content.Context, o.bvo):o.aCG");
        }

        public final aCG a(Context context, C1567aGb c1567aGb) {
            boolean g;
            Map k;
            Throwable th;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c1567aGb, "");
            g = C8691duz.g(c1567aGb.a());
            if (g) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("SPY-35060 - User profile has a null or blank profile GUID", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
            return ((a) EntryPoints.get(aFY.b.e(context).e(c1567aGb), a.class)).r();
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            if (r1 != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.aCG e(android.content.Context r13) {
            /*
                r12 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r13, r0)
                java.lang.Class<o.aCG$d> r0 = o.aCG.d.class
                java.lang.Object r0 = dagger.hilt.android.EntryPointAccessors.fromApplication(r13, r0)
                o.aCG$d r0 = (o.aCG.d) r0
                o.aCs r0 = r0.aA()
                o.bvn r0 = r0.d()
                if (r0 != 0) goto L19
                r13 = 0
                return r13
            L19:
                java.lang.String r1 = r0.getUserGuid()
                if (r1 == 0) goto L25
                boolean r1 = o.C8684dus.a(r1)
                if (r1 == 0) goto Lc3
            L25:
                o.aHe$d r1 = o.InterfaceC1597aHe.b
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Map r7 = o.dqF.d(r1)
                o.aHd r1 = new o.aHd
                java.lang.String r3 = "SPY-35060 - User has a null or blank user GUID"
                r4 = 0
                r5 = 0
                r6 = 1
                r8 = 0
                r9 = 0
                r10 = 96
                r11 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                com.netflix.mediaclient.api.logging.error.ErrorType r2 = r1.a
                if (r2 == 0) goto L70
                java.util.Map<java.lang.String, java.lang.String> r3 = r1.e
                java.lang.String r4 = "errorType"
                java.lang.String r5 = r2.c()
                r3.put(r4, r5)
                java.lang.String r3 = r1.b()
                if (r3 == 0) goto L70
                java.lang.String r2 = r2.c()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r1.a(r2)
            L70:
                java.lang.String r2 = r1.b()
                if (r2 == 0) goto L86
                java.lang.Throwable r2 = r1.i
                if (r2 == 0) goto L86
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = r1.b()
                java.lang.Throwable r4 = r1.i
                r2.<init>(r3, r4)
                goto Lb0
            L86:
                java.lang.String r2 = r1.b()
                if (r2 == 0) goto L96
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = r1.b()
                r2.<init>(r3)
                goto Lb0
            L96:
                java.lang.Throwable r2 = r1.i
                if (r2 == 0) goto La9
                if (r2 == 0) goto L9d
                goto Lb0
            L9d:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                java.lang.String r0 = r0.toString()
                r13.<init>(r0)
                throw r13
            La9:
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = "Handled exception with no message"
                r2.<init>(r3)
            Lb0:
                o.aHi$d r3 = o.InterfaceC1601aHi.c
                o.aHe r4 = r3.c()
                if (r4 == 0) goto Lbc
                r4.d(r1, r2)
                goto Lc3
            Lbc:
                o.aHb r3 = r3.e()
                r3.b(r1, r2)
            Lc3:
                o.MF$d r1 = o.MF.c
                o.MF r0 = r1.c(r0)
                o.MD$b r1 = o.MD.a
                o.MD r13 = r1.a(r13)
                o.MC r13 = r13.b(r0)
                java.lang.Class<o.aCG$c> r0 = o.aCG.c.class
                java.lang.Object r13 = dagger.hilt.EntryPoints.get(r13, r0)
                o.aCG$c r13 = (o.aCG.c) r13
                o.aCG r13 = r13.c()
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aCG.e.e(android.content.Context):o.aCG");
        }

        public final aCG c(Context context, MF mf) {
            boolean g;
            Map k;
            Throwable th;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) mf, "");
            g = C8691duz.g(mf.d());
            if (g) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("SPY-35060 - User has a null or blank user GUID", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
            return ((c) EntryPoints.get(MD.a.a(context).b(mf), c.class)).c();
        }
    }
}
