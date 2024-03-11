package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aFz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564aFz implements aEZ {
    private static final d c = new d(null);
    private final Context d;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.aFz$b */
    /* loaded from: classes3.dex */
    public interface b {
        InterfaceC1545aFg j();
    }

    @Inject
    public C1564aFz(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.d = context;
    }

    @Override // o.aEZ
    public void d(dEP dep) {
        boolean g;
        Map k;
        Throwable th;
        C8632dsu.c((Object) dep, "");
        c e = e(dep);
        if (e instanceof c.b) {
            Context context = this.d;
            C1567aGb c1567aGb = new C1567aGb(((c.b) e).b());
            g = C8691duz.g(c1567aGb.a());
            if (g) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("SPY-35060 - User profile has a null or blank profile GUID", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
                InterfaceC1597aHe c3 = dVar2.c();
                if (c3 != null) {
                    c3.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
            ((b) EntryPoints.get(aFY.b.e(context).e(c1567aGb), b.class)).j().a(dep);
        }
    }

    private final c e(dEP dep) {
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        dEI dei = (dEI) dep.get("metadata");
        dEP c2 = dei != null ? dEG.c(dei) : null;
        if (c2 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.g;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Missing hendrixConfig.metadata", null, errorType, true, k2, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c3 = errorType2.c();
                    c1596aHd.a(c3 + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                Throwable th3 = c1596aHd.i;
                if (th3 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th2 = th3;
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
            return c.e.c;
        }
        AbstractC7773dEv d3 = C1540aFb.d();
        d3.d();
        aFR afr = (aFR) d3.e((dBP<? extends Object>) aFR.Companion.a(), (dEI) c2);
        String e = afr.e();
        if (e == null) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ErrorType errorType3 = ErrorType.g;
            k = dqE.k(afr.c());
            C1596aHd c1596aHd2 = new C1596aHd("Missing hendrixConfig.metadata.profileGuid", null, errorType3, true, k, false, false, 96, null);
            ErrorType errorType4 = c1596aHd2.a;
            if (errorType4 != null) {
                c1596aHd2.e.put("errorType", errorType4.c());
                String b3 = c1596aHd2.b();
                if (b3 != null) {
                    String c4 = errorType4.c();
                    c1596aHd2.a(c4 + " " + b3);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
            return c.e.c;
        } else if (C8168dfL.g(e)) {
            return c.e.c;
        } else {
            if (C8632dsu.c((Object) e, (Object) "missing")) {
                return c.a.a;
            }
            if (C8632dsu.c((Object) e, (Object) "profile-lookup-failed")) {
                return c.e.c;
            }
            return new c.b(e);
        }
    }

    /* renamed from: o.aFz$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.aFz$c$e */
        /* loaded from: classes3.dex */
        public static final class e extends c {
            public static final e c = new e();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 902182788;
            }

            public String toString() {
                return "Error";
            }

            private e() {
                super(null);
            }
        }

        private c() {
        }

        /* renamed from: o.aFz$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends c {
            public static final a a = new a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -959405902;
            }

            public String toString() {
                return "Unauthenticated";
            }

            private a() {
                super(null);
            }
        }

        /* renamed from: o.aFz$c$b */
        /* loaded from: classes3.dex */
        public static final class b extends c {
            private final String b;

            public final String b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C8632dsu.c((Object) this.b, (Object) ((b) obj).b);
            }

            public int hashCode() {
                return this.b.hashCode();
            }

            public String toString() {
                String str = this.b;
                return "Success(data=" + str + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                C8632dsu.c((Object) str, "");
                this.b = str;
            }
        }
    }

    /* renamed from: o.aFz$d */
    /* loaded from: classes3.dex */
    static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
