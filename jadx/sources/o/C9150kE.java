package o;

import o.AbstractC9286mi;

/* renamed from: o.kE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9150kE extends C9185kn {
    public static final e b = new e(null);
    private String a;
    private String c;

    public final String d() {
        String str = this.a;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        return str == null ? this.c : str;
    }

    /* renamed from: o.kE$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public final void d(String str) {
        this.c = str;
        this.a = "__BUGSNAG_MANUAL_CONTEXT__";
        a();
    }

    public final void e(String str) {
        if (this.a != "__BUGSNAG_MANUAL_CONTEXT__") {
            this.a = str;
            a();
        }
    }

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.l lVar = new AbstractC9286mi.l(d());
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(lVar);
        }
    }
}
