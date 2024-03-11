package o;

import com.google.common.hash.Hashing;

/* loaded from: classes3.dex */
public final class aYC {
    public static final aYC d = new aYC();

    private aYC() {
    }

    public static final String a(String str) {
        C8632dsu.c((Object) str, "");
        String b = C8071ddU.b(Hashing.sha256().hashString(str, C8674dui.i).asBytes());
        C8632dsu.a(b, "");
        return b;
    }
}
