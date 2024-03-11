package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import o.InterfaceC1601aHi;

/* renamed from: o.aHe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1597aHe {
    public static final d b = d.b;

    static void b(String str, Throwable th, ErrorType errorType) {
        b.d(str, th, errorType);
    }

    static void b(C1596aHd c1596aHd) {
        b.c(c1596aHd);
    }

    static void c(String str, Throwable th) {
        b.b(str, th);
    }

    static void e(String str) {
        b.c(str);
    }

    void d(C1596aHd c1596aHd, Throwable th);

    /* renamed from: o.aHe$d */
    /* loaded from: classes.dex */
    public static final class d {
        static final /* synthetic */ d b = new d();

        private d() {
        }

        public final void c(C1596aHd c1596aHd) {
            Throwable th;
            C8632dsu.c((Object) c1596aHd, "");
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }

        public final boolean d() {
            Boolean d = InterfaceC1601aHi.c.d();
            if (d != null) {
                return d.booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final void d(String str, Throwable th, ErrorType errorType) {
            Throwable th2;
            C1596aHd c1596aHd = new C1596aHd(str, th, errorType, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType2.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1597aHe c2 = dVar.c();
            if (c2 != null) {
                c2.d(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void b(String str, Throwable th) {
            Throwable th2;
            C1596aHd c1596aHd = new C1596aHd(str, th, null, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1597aHe c2 = dVar.c();
            if (c2 != null) {
                c2.d(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void c(String str) {
            Throwable th;
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
