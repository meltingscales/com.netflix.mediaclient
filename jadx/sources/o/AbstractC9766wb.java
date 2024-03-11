package o;

import com.netflix.android.mdxpanel.MdxPanelController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observable;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.wb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9766wb {
    public /* synthetic */ AbstractC9766wb(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC9766wb() {
    }

    /* renamed from: o.wb$n  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9780n extends AbstractC9766wb {
        public static final C9780n c = new C9780n();

        private C9780n() {
            super(null);
        }
    }

    /* renamed from: o.wb$x  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9788x extends AbstractC9766wb {
        public static final C9788x a = new C9788x();

        private C9788x() {
            super(null);
        }
    }

    /* renamed from: o.wb$w */
    /* loaded from: classes2.dex */
    public static final class w extends AbstractC9766wb {
        public static final w d = new w();

        private w() {
            super(null);
        }
    }

    /* renamed from: o.wb$V */
    /* loaded from: classes2.dex */
    public static final class V extends AbstractC9766wb {
        private boolean b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof V) && this.b == ((V) obj).b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public String toString() {
            boolean z = this.b;
            return "VisibilityChanged(visible=" + z + ")";
        }

        public V(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            boolean z = this.b;
            return a + " " + z;
        }
    }

    /* renamed from: o.wb$l  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9778l extends AbstractC9766wb {
        private final CharSequence d;

        public final CharSequence d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9778l) && C8632dsu.c(this.d, ((C9778l) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.d;
            return "Loading(deviceName=" + ((Object) charSequence) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9778l(CharSequence charSequence) {
            super(null);
            C8632dsu.c((Object) charSequence, "");
            this.d = charSequence;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            CharSequence charSequence = this.d;
            return a + " " + ((Object) charSequence);
        }
    }

    /* renamed from: o.wb$u  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9786u extends AbstractC9766wb {
        public static final C9786u a = new C9786u();

        private C9786u() {
            super(null);
        }
    }

    /* renamed from: o.wb$v  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9787v extends AbstractC9766wb {
        public static final C9787v d = new C9787v();

        private C9787v() {
            super(null);
        }
    }

    /* renamed from: o.wb$A */
    /* loaded from: classes2.dex */
    public static final class A extends AbstractC9766wb {
        public static final A e = new A();

        private A() {
            super(null);
        }
    }

    /* renamed from: o.wb$k  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9777k extends AbstractC9766wb {
        public static final C9777k e = new C9777k();

        private C9777k() {
            super(null);
        }
    }

    /* renamed from: o.wb$X */
    /* loaded from: classes2.dex */
    public static final class X extends AbstractC9766wb {
        private final Observable<Integer> a;

        public final Observable<Integer> c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof X) && C8632dsu.c(this.a, ((X) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            Observable<Integer> observable = this.a;
            return "UserSeekStarted(seeksInSeconds=" + observable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X(Observable<Integer> observable) {
            super(null);
            C8632dsu.c((Object) observable, "");
            this.a = observable;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            Observable<Integer> observable = this.a;
            return a + " " + observable;
        }
    }

    /* renamed from: o.wb$R */
    /* loaded from: classes2.dex */
    public static final class R extends AbstractC9766wb {
        private final boolean c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof R) && this.c == ((R) obj).c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.c);
        }

        public String toString() {
            boolean z = this.c;
            return "UserSeekEnded(cancelled=" + z + ")";
        }

        public R(boolean z) {
            super(null);
            this.c = z;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            boolean z = this.c;
            return a + " " + z;
        }
    }

    /* renamed from: o.wb$o  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9781o extends AbstractC9766wb {
        private final Object b;

        public final Object e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9781o) && C8632dsu.c(this.b, ((C9781o) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            Object obj = this.b;
            return "LanguagesReady(language=" + obj + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9781o(Object obj) {
            super(null);
            C8632dsu.c(obj, "");
            this.b = obj;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            Object obj = this.b;
            return a + " " + obj;
        }
    }

    /* renamed from: o.wb$M */
    /* loaded from: classes2.dex */
    public static final class M extends AbstractC9766wb {
        private final float b;
        private final int e;

        public final int b() {
            return this.e;
        }

        public final float c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof M) {
                M m = (M) obj;
                return Float.compare(this.b, m.b) == 0 && this.e == m.e;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.b) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            float f = this.b;
            int i = this.e;
            return "SlideOffsetChanged(offset=" + f + ", availableWidth=" + i + ")";
        }

        public M(float f, int i) {
            super(null);
            this.b = f;
            this.e = i;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            float f = this.b;
            int i = this.e;
            return a + " " + f + " " + i;
        }
    }

    /* renamed from: o.wb$r  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static class C9784r extends AbstractC9766wb {
        private final Class<? extends C9784r> b;
        private final boolean d;

        public C9784r() {
            this(false, null, 3, null);
        }

        public final boolean g() {
            return this.d;
        }

        public final Class<? extends C9784r> i() {
            return this.b;
        }

        public /* synthetic */ C9784r(boolean z, Class cls, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : cls);
        }

        public C9784r(boolean z, Class<? extends C9784r> cls) {
            super(null);
            this.d = z;
            this.b = cls;
        }
    }

    /* renamed from: o.wb$p  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9782p extends C9784r {
        public AbstractC9782p() {
            super(false, null, 2, null);
        }
    }

    /* renamed from: o.wb$a  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9767a extends AbstractC9782p {
        private final String e;

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9767a) && C8632dsu.c((Object) this.e, (Object) ((C9767a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "Connected(uuid=" + str + ")";
        }

        public C9767a(String str) {
            C8632dsu.c((Object) str, "");
            this.e = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$g  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9773g extends AbstractC9782p {
        private final String a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9773g) && C8632dsu.c((Object) this.a, (Object) ((C9773g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Disconnected(uuid=" + str + ")";
        }

        public C9773g(String str) {
            C8632dsu.c((Object) str, "");
            this.a = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$B */
    /* loaded from: classes2.dex */
    public static abstract class B extends C9784r {
        public B() {
            super(false, B.class, 1, null);
        }
    }

    /* renamed from: o.wb$f  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9772f extends B {
        private final int a;
        private final String b;
        private final String d;
        private final Integer e;

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9772f) {
                C9772f c9772f = (C9772f) obj;
                return C8632dsu.c((Object) this.b, (Object) c9772f.b) && C8632dsu.c((Object) this.d, (Object) c9772f.d) && C8632dsu.c(this.e, c9772f.e) && this.a == c9772f.a;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            Integer num = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            Integer num = this.e;
            int i = this.a;
            return "EpisodePlaybackInitiated(uuid=" + str + ", episodeId=" + str2 + ", trackId=" + num + ", positionSeconds=" + i + ")";
        }

        public C9772f(String str, String str2, Integer num, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.e = num;
            this.a = i;
            if (num == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("No track id for " + str2, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.b;
            String str2 = this.d;
            Integer num = this.e;
            int i = this.a;
            return a + " " + str + " " + str2 + " " + num + " " + i;
        }
    }

    /* renamed from: o.wb$s  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9785s extends B {
        private final Integer a;
        private final String c;
        private final String d;
        private final int e;

        public final String b() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9785s) {
                C9785s c9785s = (C9785s) obj;
                return C8632dsu.c((Object) this.c, (Object) c9785s.c) && C8632dsu.c((Object) this.d, (Object) c9785s.d) && C8632dsu.c(this.a, c9785s.a) && this.e == c9785s.e;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.d.hashCode();
            Integer num = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            Integer num = this.a;
            int i = this.e;
            return "MoviePlaybackInitiated(uuid=" + str + ", movieId=" + str2 + ", trackId=" + num + ", positionSeconds=" + i + ")";
        }

        public C9785s(String str, String str2, Integer num, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
            this.a = num;
            this.e = i;
            if (num == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("No track id for " + str2, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.c;
            String str2 = this.d;
            Integer num = this.a;
            int i = this.e;
            return a + " " + str + " " + str2 + " " + num + " " + i;
        }
    }

    /* renamed from: o.wb$S */
    /* loaded from: classes2.dex */
    public static final class S extends C9784r {
        public static final S a = new S();

        private S() {
            super(false, null, 2, null);
        }
    }

    /* renamed from: o.wb$q  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9783q extends C9784r {
        public static final C9783q c = new C9783q();

        private C9783q() {
            super(false, null, 3, null);
        }
    }

    /* renamed from: o.wb$O */
    /* loaded from: classes2.dex */
    public static abstract class O extends C9784r {
        public O() {
            super(false, O.class, 1, null);
        }
    }

    /* renamed from: o.wb$h  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9774h extends O {
        private final String a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9774h) {
                C9774h c9774h = (C9774h) obj;
                return C8632dsu.c((Object) this.e, (Object) c9774h.e) && C8632dsu.c((Object) this.a, (Object) c9774h.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            return "EpisodeReady(uuid=" + str + ", episodeId=" + str2 + ")";
        }

        public C9774h(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.a = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            String str2 = this.a;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$t */
    /* loaded from: classes2.dex */
    public static final class t extends O {
        private final String b;
        private final String e;

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.b, (Object) tVar.b) && C8632dsu.c((Object) this.e, (Object) tVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "MovieReady(uuid=" + str + ", movieId=" + str2 + ")";
        }

        public t(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.e = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.b;
            String str2 = this.e;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$e  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9771e extends C9784r {
        private final String a;
        private final MdxPanelController.d d;

        public final MdxPanelController.d b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9771e) {
                C9771e c9771e = (C9771e) obj;
                return C8632dsu.c((Object) this.a, (Object) c9771e.a) && C8632dsu.c(this.d, c9771e.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            MdxPanelController.d dVar = this.d;
            return "DataLoaded(uuid=" + str + ", data=" + dVar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9771e(String str, MdxPanelController.d dVar) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dVar, "");
            this.a = str;
            this.d = dVar;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            MdxPanelController.d dVar = this.d;
            return a + " " + str + " " + dVar;
        }
    }

    /* renamed from: o.wb$J */
    /* loaded from: classes2.dex */
    public static final class J extends C9784r {
        private final String a;
        private final CharSequence b;
        private final String c;

        public final String c() {
            return this.a;
        }

        public final CharSequence d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof J) {
                J j = (J) obj;
                return C8632dsu.c((Object) this.c, (Object) j.c) && C8632dsu.c(this.b, j.b) && C8632dsu.c((Object) this.a, (Object) j.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            CharSequence charSequence = this.b;
            String str2 = this.a;
            return "SkipIntroIn(uuid=" + str + ", skipIntroText=" + ((Object) charSequence) + ", skipIntroType=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(String str, CharSequence charSequence, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) charSequence, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = charSequence;
            this.a = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.c;
            CharSequence charSequence = this.b;
            String str2 = this.a;
            return a + " " + str + " " + ((Object) charSequence) + " " + str2;
        }
    }

    /* renamed from: o.wb$L */
    /* loaded from: classes2.dex */
    public static final class L extends C9784r {
        private final String d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof L) && C8632dsu.c((Object) this.d, (Object) ((L) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "SkipIntroOut(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(String str) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.d;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$U */
    /* loaded from: classes2.dex */
    public static final class U extends C9784r {
        private final int a;
        private final String e;

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof U) {
                U u = (U) obj;
                return C8632dsu.c((Object) this.e, (Object) u.e) && this.a == u.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            return "Volume(uuid=" + str + ", volume=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(String str, int i) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            int i = this.a;
            return a + " " + str + " " + i;
        }
    }

    /* renamed from: o.wb$Q */
    /* loaded from: classes2.dex */
    public static final class Q extends C9784r {
        private final String a;
        private final String c;
        private final Integer d;
        private final Integer e;

        public final Integer b() {
            return this.e;
        }

        public final Integer c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Q) {
                Q q = (Q) obj;
                return C8632dsu.c((Object) this.a, (Object) q.a) && C8632dsu.c(this.d, q.d) && C8632dsu.c(this.e, q.e) && C8632dsu.c((Object) this.c, (Object) q.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            String str = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            Integer num = this.d;
            Integer num2 = this.e;
            String str2 = this.c;
            return "SyncPosition(uuid=" + str + ", positionSeconds=" + num + ", runtimeSeconds=" + num2 + ", state=" + str2 + ")";
        }

        public /* synthetic */ Q(String str, Integer num, Integer num2, String str2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(String str, Integer num, Integer num2, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = num;
            this.e = num2;
            this.c = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            Integer num = this.d;
            Integer num2 = this.e;
            String str2 = this.c;
            return a + " " + str + " " + num + " " + num2 + " " + str2;
        }
    }

    /* renamed from: o.wb$P */
    /* loaded from: classes2.dex */
    public static final class P extends C9784r {
        private final String d;
        private final String e;

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof P) {
                P p = (P) obj;
                return C8632dsu.c((Object) this.e, (Object) p.e) && C8632dsu.c((Object) this.d, (Object) p.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "State(uuid=" + str + ", state=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            String str2 = this.d;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$j  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9776j extends C9784r {
        private final int b;
        private final String c;
        private final String d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final int d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9776j) {
                C9776j c9776j = (C9776j) obj;
                return C8632dsu.c((Object) this.d, (Object) c9776j.d) && this.b == c9776j.b && C8632dsu.c((Object) this.e, (Object) c9776j.e) && C8632dsu.c((Object) this.c, (Object) c9776j.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            int i = this.b;
            String str2 = this.e;
            String str3 = this.c;
            return "Error(uuid=" + str + ", errorCode=" + i + ", errorDesc=" + str2 + ", errorDisplayCode=" + str3 + ")";
        }

        public C9776j(String str, int i, String str2, String str3) {
            super(false, null, 2, null);
            this.d = str;
            this.b = i;
            this.e = str2;
            this.c = str3;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.d;
            String str2 = this.c;
            String str3 = this.e;
            return a + " " + str + " " + str2 + " " + str3;
        }
    }

    /* renamed from: o.wb$d  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9770d extends C9784r {
        private final String a;
        private final String b;

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9770d) {
                C9770d c9770d = (C9770d) obj;
                return C8632dsu.c((Object) this.a, (Object) c9770d.a) && C8632dsu.c((Object) this.b, (Object) c9770d.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "Capability(uuid=" + str + ", json=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9770d(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.b = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            String str2 = this.b;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$b  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9768b extends C9784r {
        private final String b;
        private final String c;

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9768b) {
                C9768b c9768b = (C9768b) obj;
                return C8632dsu.c((Object) this.c, (Object) c9768b.c) && C8632dsu.c((Object) this.b, (Object) c9768b.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "AudioSubtitles(uuid=" + str + ", json=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9768b(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.c;
            String str2 = this.b;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$i  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9775i extends C9784r {
        private final String c;
        private final String d;

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9775i) {
                C9775i c9775i = (C9775i) obj;
                return C8632dsu.c((Object) this.c, (Object) c9775i.c) && C8632dsu.c((Object) this.d, (Object) c9775i.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            return "DialogShow(uuid=" + str + ", json=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9775i(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.c;
            String str2 = this.d;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$c  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9769c extends C9784r {
        private final String c;
        private final String d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9769c) {
                C9769c c9769c = (C9769c) obj;
                return C8632dsu.c((Object) this.c, (Object) c9769c.c) && C8632dsu.c((Object) this.d, (Object) c9769c.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            return "DialogCancel(uuid=" + str + ", json=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9769c(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.c;
            String str2 = this.d;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$E */
    /* loaded from: classes2.dex */
    public static final class E extends C9784r {
        private final String a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof E) {
                E e = (E) obj;
                return C8632dsu.c((Object) this.a, (Object) e.a) && C8632dsu.c((Object) this.e, (Object) e.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "RemoteLoginConsentDialogShow(uuid=" + str + ", friendlyName=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(String str, String str2) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            String str2 = this.e;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$G */
    /* loaded from: classes2.dex */
    public static final class G extends C9784r {
        private final String a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof G) {
                G g = (G) obj;
                return C8632dsu.c((Object) this.a, (Object) g.a) && C8632dsu.c((Object) this.c, (Object) g.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            return "RegPairPinConfirmationDialogShow(uuid=" + str + ", userMessage=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(String str, String str2) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.c = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.a;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$F */
    /* loaded from: classes2.dex */
    public static final class F extends C9784r {
        private final String d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F) && C8632dsu.c((Object) this.d, (Object) ((F) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "RegPairPinConfirmationDialogCancel(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(String str) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.d;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$H */
    /* loaded from: classes2.dex */
    public static final class H extends C9784r {
        private final String b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && C8632dsu.c((Object) this.b, (Object) ((H) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "RemoteLoginConsentDialogCancel(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(String str) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            this.b = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.b;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$N */
    /* loaded from: classes2.dex */
    public static final class N extends C9784r {
        private final C1999aWc a;
        private final String b;
        private boolean c;
        private final String d;
        private final boolean e;

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof N) {
                N n = (N) obj;
                return C8632dsu.c((Object) this.d, (Object) n.d) && C8632dsu.c(this.a, n.a) && this.e == n.e && this.c == n.c && C8632dsu.c((Object) this.b, (Object) n.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C1999aWc c1999aWc = this.a;
            int hashCode2 = c1999aWc == null ? 0 : c1999aWc.hashCode();
            int hashCode3 = Boolean.hashCode(this.e);
            int hashCode4 = Boolean.hashCode(this.c);
            String str = this.b;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            C1999aWc c1999aWc = this.a;
            boolean z = this.e;
            boolean z2 = this.c;
            String str2 = this.b;
            return "RemoteLoginStatusUpdated(uuid=" + str + ", loginPolicy=" + c1999aWc + ", started=" + z + ", completed=" + z2 + ", errorDisplayCode=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(String str, C1999aWc c1999aWc, boolean z, boolean z2, String str2) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = c1999aWc;
            this.e = z;
            this.c = z2;
            this.b = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.d;
            C1999aWc c1999aWc = this.a;
            boolean z = this.e;
            boolean z2 = this.c;
            String str2 = this.b;
            return a + " " + str + " " + c1999aWc + " " + z + " " + z2 + " " + str2;
        }
    }

    /* renamed from: o.wb$K */
    /* loaded from: classes2.dex */
    public static final class K extends C9784r {
        private final String e;

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K) && C8632dsu.c((Object) this.e, (Object) ((K) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "RemoteLoginShowToast(message=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(String str) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$y */
    /* loaded from: classes2.dex */
    public static final class y extends C9784r {
        private final boolean b;
        private final String d;

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return C8632dsu.c((Object) this.d, (Object) yVar.d) && this.b == yVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.b;
            return "NetworkConnectivityChanged(uuid=" + str + ", connected=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, boolean z) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = z;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.d;
            boolean z = this.b;
            return a + " " + str + " " + z;
        }
    }

    /* renamed from: o.wb$z */
    /* loaded from: classes2.dex */
    public static final class z extends C9784r {
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && C8632dsu.c((Object) this.e, (Object) ((z) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "PostPlayHide(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(false, null, 2, null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$C */
    /* loaded from: classes2.dex */
    public static final class C extends C9784r {
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && C8632dsu.c((Object) this.e, (Object) ((C) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "PostPlayEnd(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(String str) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            return a + " " + str;
        }
    }

    /* renamed from: o.wb$I */
    /* loaded from: classes2.dex */
    public static final class I extends C9784r {
        private final String a;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof I) {
                I i = (I) obj;
                return C8632dsu.c((Object) this.e, (Object) i.e) && C8632dsu.c((Object) this.a, (Object) i.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            return "PostPlayNextEpisodeReady(uuid=" + str + ", episodeId=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(String str, String str2) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.a = str2;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            String str2 = this.a;
            return a + " " + str + " " + str2;
        }
    }

    /* renamed from: o.wb$D */
    /* loaded from: classes2.dex */
    public static final class D extends C9784r {
        private final String a;
        private final String b;
        private final boolean c;
        private final String d;
        private final String e;
        private final String j;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof D) {
                D d = (D) obj;
                return C8632dsu.c((Object) this.j, (Object) d.j) && C8632dsu.c((Object) this.b, (Object) d.b) && C8632dsu.c((Object) this.d, (Object) d.d) && this.c == d.c && C8632dsu.c((Object) this.a, (Object) d.a) && C8632dsu.c((Object) this.e, (Object) d.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.j.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            String str = this.j;
            String str2 = this.b;
            String str3 = this.d;
            boolean z = this.c;
            String str4 = this.a;
            String str5 = this.e;
            return "PostPlayNextEpisode(uuid=" + str + ", episodeId=" + str2 + ", showId=" + str3 + ", previewProtected=" + z + ", title=" + str4 + ", description=" + str5 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(String str, String str2, String str3, boolean z, String str4, String str5) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) str4, "");
            C8632dsu.c((Object) str5, "");
            this.j = str;
            this.b = str2;
            this.d = str3;
            this.c = z;
            this.a = str4;
            this.e = str5;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.j;
            String str2 = this.b;
            String str3 = this.a;
            String str4 = this.e;
            return a + " " + str + " " + str2 + " " + str3 + " " + str4;
        }
    }

    /* renamed from: o.wb$m  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C9779m extends C9784r {
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9779m) && C8632dsu.c((Object) this.e, (Object) ((C9779m) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "IncorrectPin(uuid=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9779m(String str) {
            super(false, null, 3, null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }

        @Override // o.AbstractC9766wb
        public String a() {
            String a = super.a();
            String str = this.e;
            return a + " " + str;
        }
    }

    public String a() {
        String simpleName = getClass().getSimpleName();
        C8632dsu.a(simpleName, "");
        return simpleName;
    }
}
