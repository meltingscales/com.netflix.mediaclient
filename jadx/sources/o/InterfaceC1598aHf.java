package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1601aHi;

/* renamed from: o.aHf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1598aHf {
    public static final c a = c.b;

    static void a(String str) {
        a.b(str);
    }

    static void a(String str, Throwable th, ErrorType errorType) {
        a.b(str, th, errorType);
    }

    static void a(C1596aHd c1596aHd) {
        a.c(c1596aHd);
    }

    static void e(String str, Throwable th) {
        a.a(str, th);
    }

    static void e(String str, Throwable th, ErrorType errorType, boolean z) {
        a.b(str, th, errorType, z);
    }

    static void e(String str, Throwable th, ErrorType errorType, boolean z, Map<String, String> map) {
        a.a(str, th, errorType, z, map);
    }

    void e(C1596aHd c1596aHd, Throwable th);

    /* renamed from: o.aHf$c */
    /* loaded from: classes.dex */
    public static final class c {
        static final /* synthetic */ c b = new c();

        private c() {
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }

        public final void a(String str, Throwable th, ErrorType errorType, boolean z, Map<String, String> map) {
            Throwable th2;
            C8632dsu.c((Object) map, "");
            C1596aHd c1596aHd = new C1596aHd(str, th, errorType, z, dqF.d(map), false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void b(String str, Throwable th, ErrorType errorType, boolean z) {
            Throwable th2;
            C1596aHd c1596aHd = new C1596aHd(str, th, errorType, z, dqF.d(dqF.c()), false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void b(String str, Throwable th, ErrorType errorType) {
            Throwable th2;
            C1596aHd c1596aHd = new C1596aHd(str, th, errorType, true, dqF.d(dqF.c()), false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void a(String str, Throwable th) {
            Throwable th2;
            C1596aHd c1596aHd = new C1596aHd(str, th, null, true, dqF.d(dqF.c()), false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }

        public final void b(String str) {
            Throwable th;
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, dqF.d(dqF.c()), false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
