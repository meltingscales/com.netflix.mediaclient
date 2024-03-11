package o;

import com.netflix.mediaclient.android.osp.AsyncTaskCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.C1079Nx;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Np  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071Np {
    private final e c = new e();

    public final void d(C1079Nx.b bVar) {
        C8632dsu.c((Object) bVar, "");
        this.c.d(AsyncTaskCompat.a, bVar);
    }

    /* renamed from: o.Np$c */
    /* loaded from: classes.dex */
    public static final class c implements C1079Nx.b {
        final /* synthetic */ drO<dpR> c;

        c(drO<dpR> dro) {
            this.c = dro;
        }

        @Override // o.C1079Nx.b
        public void run() {
            this.c.invoke();
        }
    }

    public final void c(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.c.d(AsyncTaskCompat.a, new c(dro));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.Np$e */
    /* loaded from: classes.dex */
    public static final class e extends AsyncTaskCompat<C1079Nx.b, Void, Void> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.netflix.mediaclient.android.osp.AsyncTaskCompat
        /* renamed from: e */
        public Void a(C1079Nx.b... bVarArr) {
            Map b;
            Map k;
            Throwable th;
            Map b2;
            Map k2;
            Throwable th2;
            C8632dsu.c((Object) bVarArr, "");
            try {
                for (C1079Nx.b bVar : bVarArr) {
                    Thread.currentThread().setName("BackgroundTask-" + bVar.getClass().getSimpleName());
                    bVar.run();
                }
                return null;
            } catch (Exception e) {
                if (C1079Nx.e(e)) {
                    InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                    b2 = dqD.b(dpD.a("errorSource", "BackgroundTask"));
                    k2 = dqE.k(b2);
                    C1596aHd c1596aHd = new C1596aHd(null, e, null, true, k2, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            c1596aHd.a(errorType.c() + " " + b3);
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
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1597aHe c = dVar2.c();
                    if (c != null) {
                        c.d(c1596aHd, th2);
                        return null;
                    }
                    dVar2.e().b(c1596aHd, th2);
                    return null;
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                b = dqD.b(dpD.a("errorSource", "BackgroundTask"));
                k = dqE.k(b);
                C1596aHd c1596aHd2 = new C1596aHd(null, e, null, true, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b4 = c1596aHd2.b();
                    if (b4 != null) {
                        c1596aHd2.a(errorType2.c() + " " + b4);
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
                InterfaceC1598aHf a = dVar3.a();
                if (a != null) {
                    a.e(c1596aHd2, th);
                    return null;
                }
                dVar3.e().b(c1596aHd2, th);
                return null;
            }
        }
    }
}
