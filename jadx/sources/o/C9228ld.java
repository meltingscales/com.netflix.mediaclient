package o;

import com.bugsnag.android.ErrorType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: o.ld  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9228ld {
    public static final d e = new d(null);
    private final long a;
    private final Set<ErrorType> b;
    private final String c;
    private final String d;
    private final String f;

    public final Set<ErrorType> b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9228ld) {
            C9228ld c9228ld = (C9228ld) obj;
            return C8632dsu.c((Object) this.d, (Object) c9228ld.d) && C8632dsu.c((Object) this.f, (Object) c9228ld.f) && this.a == c9228ld.a && C8632dsu.c((Object) this.c, (Object) c9228ld.c) && C8632dsu.c(this.b, c9228ld.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.d.hashCode() * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.a)) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "EventFilenameInfo(apiKey=" + this.d + ", uuid=" + this.f + ", timestamp=" + this.a + ", suffix=" + this.c + ", errorTypes=" + this.b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9228ld(String str, String str2, long j, String str3, Set<? extends ErrorType> set) {
        this.d = str;
        this.f = str2;
        this.a = j;
        this.c = str3;
        this.b = set;
    }

    public final String a() {
        return e.d(this.d, this.f, this.a, this.c, this.b);
    }

    public final boolean d() {
        return C8632dsu.c((Object) this.c, (Object) "startupcrash");
    }

    /* renamed from: o.ld$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final String d(String str, String str2, long j, String str3, Set<? extends ErrorType> set) {
            return j + '_' + str + '_' + C9154kI.c(set) + '_' + str2 + '_' + str3 + ".json";
        }

        public final C9228ld a(Object obj, String str, String str2, long j, C9258mG c9258mG, Boolean bool) {
            if (obj instanceof C9229le) {
                str2 = ((C9229le) obj).a();
            } else if (str2 == null || str2.length() == 0) {
                str2 = c9258mG.b();
            }
            return new C9228ld(str2, str, j, a(obj, bool), b(obj));
        }

        public final C9228ld b(File file, C9258mG c9258mG) {
            return new C9228ld(a(file, c9258mG), "", e(file), a(file), b(file));
        }

        public final String a(File file, C9258mG c9258mG) {
            String b;
            int d;
            int d2;
            String str;
            b = duD.b(file.getName(), (CharSequence) "_startupcrash.json");
            d = duD.d((CharSequence) b, "_", 0, false, 6, (Object) null);
            int i = d + 1;
            d2 = duD.d((CharSequence) b, "_", i, false, 4, (Object) null);
            if (i == 0 || d2 == -1 || d2 <= i) {
                str = null;
            } else if (b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else {
                str = b.substring(i, d2);
                C8632dsu.a(str, "");
            }
            return str == null ? c9258mG.b() : str;
        }

        public final Set<ErrorType> b(File file) {
            int c;
            int c2;
            int c3;
            Set<ErrorType> e;
            List d;
            Set<ErrorType> W;
            String name = file.getName();
            c = duD.c((CharSequence) name, "_", 0, false, 6, (Object) null);
            c2 = duD.c((CharSequence) name, "_", c - 1, false, 4, (Object) null);
            c3 = duD.c((CharSequence) name, "_", c2 - 1, false, 4, (Object) null);
            int i = c3 + 1;
            if (i >= c2) {
                e = dqN.e();
                return e;
            } else if (name != null) {
                String substring = name.substring(i, c2);
                C8632dsu.a(substring, "");
                d = duD.d((CharSequence) substring, new String[]{","}, false, 0, 6, (Object) null);
                ErrorType[] valuesCustom = ErrorType.valuesCustom();
                ArrayList arrayList = new ArrayList();
                for (ErrorType errorType : valuesCustom) {
                    if (d.contains(errorType.getDesc$bugsnag_android_core_release())) {
                        arrayList.add(errorType);
                    }
                }
                W = C8576dqs.W(arrayList);
                return W;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }

        public final String a(File file) {
            String j;
            int c;
            j = drA.j(file);
            c = duD.c((CharSequence) j, "_", 0, false, 6, (Object) null);
            if (j != null) {
                String substring = j.substring(c + 1);
                C8632dsu.a(substring, "");
                return (C8632dsu.c((Object) substring, (Object) "startupcrash") || C8632dsu.c((Object) substring, (Object) "not-jvm")) ? substring : "";
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public final long e(File file) {
            String j;
            String d;
            Long m;
            j = drA.j(file);
            d = duD.d(j, "_", "-1");
            m = C8689dux.m(d);
            if (m == null) {
                return -1L;
            }
            return m.longValue();
        }

        public final Set<ErrorType> b(Object obj) {
            Set<ErrorType> a;
            if (obj instanceof C9229le) {
                return ((C9229le) obj).e().e();
            }
            a = dqP.a(ErrorType.C);
            return a;
        }

        public final String a(Object obj, Boolean bool) {
            return (((obj instanceof C9229le) && C8632dsu.c(((C9229le) obj).b().n(), Boolean.TRUE)) || C8632dsu.c(bool, Boolean.TRUE)) ? "startupcrash" : "";
        }
    }
}
