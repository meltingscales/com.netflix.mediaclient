package o;

import android.content.Context;

/* loaded from: classes3.dex */
public final class aGV {
    public static final b a = new b(null);
    private final Context b;
    private boolean c;
    private boolean e;

    public final boolean a() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public aGV(Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
        this.c = C8157dfA.b(context, "pref_local_discovery_state", false);
        this.e = C8157dfA.b(context, "pref_local_discovery_dialog_state", false);
        a.getLogTag();
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_local_discovery_state");
        }
    }

    public final void c() {
        synchronized (this) {
            this.e = false;
            this.c = false;
            C8157dfA.e(this.b, "pref_local_discovery_state");
            C8157dfA.e(this.b, "pref_local_discovery_dialog_state");
        }
    }

    public final void b(boolean z) {
        synchronized (this) {
            this.c = z;
            this.e = true;
            C8157dfA.d(this.b, "pref_local_discovery_state", z);
            C8157dfA.d(this.b, "pref_local_discovery_dialog_state", true);
        }
    }
}
