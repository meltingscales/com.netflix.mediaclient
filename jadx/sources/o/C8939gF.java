package o;

import android.os.Bundle;

/* renamed from: o.gF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8939gF {
    private final Bundle e;

    public C8939gF(Bundle bundle) {
        this.e = bundle;
    }

    public long b() {
        return this.e.getLong("install_begin_timestamp_seconds");
    }

    public String d() {
        return this.e.getString("install_referrer");
    }

    public long e() {
        return this.e.getLong("referrer_click_timestamp_seconds");
    }
}
