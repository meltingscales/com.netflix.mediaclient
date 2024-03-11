package o;

import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: o.dGk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7816dGk {
    public static final C7816dGk b = new C7816dGk();

    private C7816dGk() {
    }

    public static final String a(String str, String str2, Charset charset) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d((Object) str2, "");
        C8632dsu.d(charset, "");
        String d = ByteString.c.e(str + ':' + str2, charset).d();
        return "Basic " + d;
    }
}
