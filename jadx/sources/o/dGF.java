package o;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import o.C7819dGn;
import o.C7824dGs;

/* loaded from: classes5.dex */
public final class dGF {
    public static final a c = new a(null);
    private final C7826dGu a;
    private final C7824dGs e;

    public final C7824dGs b() {
        return this.e;
    }

    public final C7826dGu d() {
        return this.a;
    }

    public dGF(C7826dGu c7826dGu, C7824dGs c7824dGs) {
        this.a = c7826dGu;
        this.e = c7824dGs;
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private Date a;
        private final C7824dGs b;
        private Date c;
        private String d;
        private int e;
        private long f;
        private long g;
        private String h;
        private final long i;
        private final C7826dGu j;
        private Date l;
        private String m;

        public b(long j, C7826dGu c7826dGu, C7824dGs c7824dGs) {
            boolean a;
            boolean a2;
            boolean a3;
            boolean a4;
            boolean a5;
            C8632dsu.d(c7826dGu, "");
            this.i = j;
            this.j = c7826dGu;
            this.b = c7824dGs;
            this.e = -1;
            if (c7824dGs != null) {
                this.f = c7824dGs.s();
                this.g = c7824dGs.o();
                C7819dGn j2 = c7824dGs.j();
                int c = j2.c();
                for (int i = 0; i < c; i++) {
                    String c2 = j2.c(i);
                    String a6 = j2.a(i);
                    a = C8691duz.a(c2, "Date", true);
                    if (a) {
                        this.l = dGW.e(a6);
                        this.m = a6;
                    } else {
                        a2 = C8691duz.a(c2, "Expires", true);
                        if (a2) {
                            this.c = dGW.e(a6);
                        } else {
                            a3 = C8691duz.a(c2, "Last-Modified", true);
                            if (a3) {
                                this.a = dGW.e(a6);
                                this.h = a6;
                            } else {
                                a4 = C8691duz.a(c2, "ETag", true);
                                if (a4) {
                                    this.d = a6;
                                } else {
                                    a5 = C8691duz.a(c2, "Age", true);
                                    if (a5) {
                                        this.e = dGB.c(a6, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private final boolean d() {
            C7824dGs c7824dGs = this.b;
            if (c7824dGs == null) {
                C8632dsu.e();
            }
            return c7824dGs.b().b() == -1 && this.c == null;
        }

        public final dGF b() {
            dGF e = e();
            return (e.d() == null || !this.j.e().j()) ? e : new dGF(null, null);
        }

        private final dGF e() {
            String str;
            if (this.b == null) {
                return new dGF(this.j, null);
            }
            if (this.j.a() && this.b.i() == null) {
                return new dGF(this.j, null);
            }
            if (!dGF.c.d(this.b, this.j)) {
                return new dGF(this.j, null);
            }
            C7806dGa e = this.j.e();
            if (e.h() || a(this.j)) {
                return new dGF(this.j, null);
            }
            C7806dGa b = this.b.b();
            long c = c();
            long a = a();
            if (e.b() != -1) {
                a = Math.min(a, TimeUnit.SECONDS.toMillis(e.b()));
            }
            long j = 0;
            long millis = e.e() != -1 ? TimeUnit.SECONDS.toMillis(e.e()) : 0L;
            if (!b.i() && e.a() != -1) {
                j = TimeUnit.SECONDS.toMillis(e.a());
            }
            if (!b.h()) {
                long j2 = millis + c;
                if (j2 < j + a) {
                    C7824dGs.b k = this.b.k();
                    if (j2 >= a) {
                        k.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (c > 86400000 && d()) {
                        k.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new dGF(null, k.a());
                }
            }
            String str2 = this.d;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.a != null) {
                    str2 = this.h;
                } else if (this.l == null) {
                    return new dGF(this.j, null);
                } else {
                    str2 = this.m;
                }
                str = "If-Modified-Since";
            }
            C7819dGn.d e2 = this.j.c().e();
            if (str2 == null) {
                C8632dsu.e();
            }
            e2.e(str, str2);
            return new dGF(this.j.g().b(e2.b()).a(), this.b);
        }

        private final long a() {
            C7824dGs c7824dGs = this.b;
            if (c7824dGs == null) {
                C8632dsu.e();
            }
            C7806dGa b = c7824dGs.b();
            if (b.b() != -1) {
                return TimeUnit.SECONDS.toMillis(b.b());
            }
            Date date = this.c;
            if (date != null) {
                Date date2 = this.l;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.a == null || this.b.n().j().o() != null) {
                return 0L;
            } else {
                Date date3 = this.l;
                long time2 = date3 != null ? date3.getTime() : this.f;
                Date date4 = this.a;
                if (date4 == null) {
                    C8632dsu.e();
                }
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        private final long c() {
            Date date = this.l;
            long max = date != null ? Math.max(0L, this.g - date.getTime()) : 0L;
            int i = this.e;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.g;
            return max + (j - this.f) + (this.i - j);
        }

        private final boolean a(C7826dGu c7826dGu) {
            return (c7826dGu.a("If-Modified-Since") == null && c7826dGu.a("If-None-Match") == null) ? false : true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final boolean d(C7824dGs c7824dGs, C7826dGu c7826dGu) {
            C8632dsu.d(c7824dGs, "");
            C8632dsu.d(c7826dGu, "");
            int c = c7824dGs.c();
            if (c != 200 && c != 410 && c != 414 && c != 501 && c != 203 && c != 204) {
                if (c != 307) {
                    if (c != 308 && c != 404 && c != 405) {
                        switch (c) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C7824dGs.c(c7824dGs, "Expires", null, 2, null) == null && c7824dGs.b().b() == -1 && !c7824dGs.b().d() && !c7824dGs.b().c()) {
                    return false;
                }
            }
            return (c7824dGs.b().f() || c7826dGu.e().f()) ? false : true;
        }
    }
}
