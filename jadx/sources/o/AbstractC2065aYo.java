package o;

import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import java.util.Objects;
import o.aWW;

/* renamed from: o.aYo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2065aYo<T extends aWW> {
    private static String a;
    private static String c;
    protected boolean b;
    public String d;
    private AbstractC2049aXz e;
    public String f;
    public final aWP g;
    String h;
    public final T i;
    String j;
    public SessionMdxTarget k;
    String l;
    public final aVJ m;
    public final InterfaceC5129bst n;

    /* renamed from: o  reason: collision with root package name */
    public final C2013aWq f13459o;
    public final String t;

    public static void b(String str) {
        c = str;
    }

    public static void c(String str) {
        a = str;
    }

    public static String f() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h() {
        return a;
    }

    public abstract boolean a();

    public String b() {
        return this.l;
    }

    public SessionMdxTarget c() {
        return this.k;
    }

    public void c(String str, String str2) {
        this.f = str;
        this.d = str2;
    }

    public void c(AbstractC2049aXz abstractC2049aXz) {
        this.e = abstractC2049aXz;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.j;
    }

    public abstract boolean i();

    public String k() {
        return this.d;
    }

    public aVJ l() {
        return this.m;
    }

    public T m() {
        return this.i;
    }

    public String n() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2049aXz o() {
        AbstractC2049aXz abstractC2049aXz = this.e;
        this.e = null;
        return abstractC2049aXz;
    }

    public String t() {
        return this.t;
    }

    /* renamed from: o.aYo$e */
    /* loaded from: classes3.dex */
    public static abstract class e<U extends e<U, ?, ?>, V extends aWW, W extends AbstractC2065aYo> {
        private String a;
        private String b;
        private V c;
        private String d;
        private String e;
        private String i;
        private String j;

        protected abstract U b();

        public e(String str, String str2, String str3, V v) {
            this.i = str;
            this.a = str2;
            this.e = str3;
            this.c = v;
        }

        public U d(String str) {
            this.d = str;
            return b();
        }

        public U b(String str) {
            this.b = str;
            return b();
        }

        public U e(String str) {
            this.j = str;
            return b();
        }
    }

    public AbstractC2065aYo(e<?, T, ?> eVar) {
        this.t = ((e) eVar).i;
        this.d = ((e) eVar).a;
        this.f = ((e) eVar).e;
        T t = (T) ((e) eVar).c;
        Objects.requireNonNull(t);
        this.i = t;
        this.m = t.o();
        this.n = t.k();
        this.g = t.m();
        this.f13459o = t.r();
    }

    public boolean a(String str) {
        if (!C8168dfL.g(this.t) && !C8168dfL.g(str)) {
            if (this.t.equals(str)) {
                return true;
            }
            SessionMdxTarget sessionMdxTarget = this.k;
            if (sessionMdxTarget != null && !(this instanceof SessionMdxTarget)) {
                String t = sessionMdxTarget.t();
                if (C8168dfL.h(t) && str.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(AbstractC2065aYo abstractC2065aYo) {
        if (abstractC2065aYo != null) {
            if (a(abstractC2065aYo.t())) {
                return true;
            }
            return C8168dfL.d(this.f, abstractC2065aYo.n());
        }
        return false;
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        c(str, str2);
        this.h = str3;
        this.j = str4;
        this.l = str5;
    }

    public void a(boolean z) {
        if (z) {
            this.b = false;
        }
        SessionMdxTarget sessionMdxTarget = this.k;
        if (sessionMdxTarget != null) {
            MdxConnectionLogblobLogger.e(sessionMdxTarget.n());
            sessionMdxTarget.Q();
            if (this instanceof C2066aYp) {
                this.k = null;
            }
        }
    }
}
