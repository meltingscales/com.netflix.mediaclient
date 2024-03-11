package o;

import android.content.Context;

/* renamed from: o.bpZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4950bpZ {
    private Context a;
    private String d;

    public final String d() {
        return this.d;
    }

    public final void e(String str) {
        this.d = str;
    }

    public C4950bpZ(Context context) {
        C8632dsu.c((Object) context, "");
        this.a = context;
        this.d = C8157dfA.e(context, "nf_token_from_stub", (String) null);
    }

    public final void b() {
        if (C8168dfL.g(this.d)) {
            return;
        }
        this.d = null;
        C8157dfA.a(this.a, "nf_token_from_stub", (String) null);
    }
}
