package o;

import android.os.Bundle;
import android.util.Log;
import o.C9607ss;

/* renamed from: o.sv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9610sv {
    private final boolean d;
    private final String e;

    public C9610sv(String str, boolean z) {
        this.d = z;
        this.e = str;
    }

    public C9607ss a(Bundle bundle) {
        if (bundle == null) {
            Log.e("FJD.ExternalReceiver", "Unexpected null Bundle provided");
            return null;
        }
        Bundle bundle2 = bundle.getBundle("extras");
        if (bundle2 == null) {
            return null;
        }
        return b(bundle2).c();
    }

    public C9607ss.e b(Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        }
        boolean z = bundle.getBoolean(this.e + "recurring");
        boolean z2 = bundle.getBoolean(this.e + "replace_current");
        int i = bundle.getInt(this.e + "persistent");
        int[] a = C9598sj.a(bundle.getInt(this.e + "constraints"));
        C9611sw e = e(bundle);
        C9614sz c = c(bundle);
        String string = bundle.getString(this.e + "tag");
        String string2 = bundle.getString(this.e + "service");
        if (string == null || string2 == null || e == null || c == null) {
            return null;
        }
        C9607ss.e eVar = new C9607ss.e();
        eVar.b(string);
        eVar.a(string2);
        eVar.c(e);
        eVar.d(c);
        eVar.d(z);
        eVar.a(i);
        eVar.c(a);
        eVar.e(z2);
        eVar.c(bundle);
        return eVar;
    }

    private C9611sw e(Bundle bundle) {
        int i = bundle.getInt(this.e + "trigger_type");
        if (i != 1) {
            if (i == 2) {
                return C9613sy.e;
            }
            if (Log.isLoggable("FJD.ExternalReceiver", 3)) {
                Log.d("FJD.ExternalReceiver", "Unsupported trigger.");
                return null;
            }
            return null;
        }
        int i2 = bundle.getInt(this.e + "window_start");
        return C9613sy.a(i2, bundle.getInt(this.e + "window_end"));
    }

    private C9614sz c(Bundle bundle) {
        int i = bundle.getInt(this.e + "retry_policy");
        if (i != 1 && i != 2) {
            return C9614sz.e;
        }
        int i2 = bundle.getInt(this.e + "initial_backoff_seconds");
        return new C9614sz(i, i2, bundle.getInt(this.e + "maximum_backoff_seconds"));
    }
}
