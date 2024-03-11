package o;

/* renamed from: o.dHc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7835dHc {
    public static final C7835dHc a = new C7835dHc();

    private C7835dHc() {
    }

    public final boolean d(String str) {
        C8632dsu.d((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "POST") || C8632dsu.c((Object) str, (Object) "PATCH") || C8632dsu.c((Object) str, (Object) "PUT") || C8632dsu.c((Object) str, (Object) "DELETE") || C8632dsu.c((Object) str, (Object) "MOVE");
    }

    public static final boolean b(String str) {
        C8632dsu.d((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "POST") || C8632dsu.c((Object) str, (Object) "PUT") || C8632dsu.c((Object) str, (Object) "PATCH") || C8632dsu.c((Object) str, (Object) "PROPPATCH") || C8632dsu.c((Object) str, (Object) "REPORT");
    }

    public static final boolean c(String str) {
        C8632dsu.d((Object) str, "");
        return (C8632dsu.c((Object) str, (Object) "GET") || C8632dsu.c((Object) str, (Object) "HEAD")) ? false : true;
    }

    public final boolean e(String str) {
        C8632dsu.d((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "PROPFIND");
    }

    public final boolean a(String str) {
        C8632dsu.d((Object) str, "");
        return !C8632dsu.c((Object) str, (Object) "PROPFIND");
    }
}
