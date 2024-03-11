package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC8991hE;

/* renamed from: o.aDh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1492aDh extends AbstractC9054iO {
    public static final a a = new a(null);
    private final C9120jb b;
    private final C9050iK c;
    private final Context d;

    public C1492aDh(Context context, int i, long j, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.d = context;
        this.c = new C9050iK(i, j);
        this.b = new C9120jb(context, str, null, false, 12, null);
    }

    /* renamed from: o.aDh$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final <D extends InterfaceC8991hE.b> C8942gI<D> c(C8942gI<D> c8942gI) {
            C8632dsu.c((Object) c8942gI, "");
            return (C8942gI) C9083ir.e(c8942gI, C9044iE.b.d().d("BYPASS_MEMORY_CACHE", "true").e());
        }

        public final <D extends InterfaceC8991hE.b> C8942gI<D> d(C8942gI<D> c8942gI) {
            C8632dsu.c((Object) c8942gI, "");
            return (C8942gI) C9083ir.e(c8942gI, C9044iE.b.d().d("BYPASS_DISK_CACHE", "true").e());
        }
    }

    @Override // o.AbstractC9054iO
    public AbstractC9055iP b() {
        Map b;
        Map k;
        Throwable th;
        AbstractC9055iP b2;
        if (this.d.getFilesDir().getFreeSpace() >= 104857600) {
            try {
                b2 = this.b.b();
            } catch (Exception e) {
                long freeSpace = this.d.getFilesDir().getFreeSpace();
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                ErrorType errorType = ErrorType.l;
                b = dqD.b(dpD.a("availableFreeSpace", String.valueOf(freeSpace)));
                k = dqE.k(b);
                C1596aHd c1596aHd = new C1596aHd("GraphQL: buildNormalizedCacheFactory used memory-only cache", e, errorType, true, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c = errorType2.c();
                        c1596aHd.a(c + " " + b3);
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
            return new C1489aDe(this.c.b(), b2);
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        Context context = this.d;
        aVar.a("GraphQL: buildNormalizedCacheFactory uses only the memory cache, free space = " + context + ".filesDir.freeSpace");
        b2 = null;
        return new C1489aDe(this.c.b(), b2);
    }
}
