package o;

import o.AbstractC9286mi;

/* renamed from: o.lG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9205lG extends C9185kn {
    private boolean d;
    private Integer e;

    public final void b(boolean z) {
        this.d = z;
    }

    public final boolean b() {
        return this.d;
    }

    public final Integer d() {
        return this.e;
    }

    public final String c() {
        return c(this.e);
    }

    public final boolean a(Integer num) {
        if (C8632dsu.c(this.e, num)) {
            return false;
        }
        this.e = num;
        return true;
    }

    private final String c(Integer num) {
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.p pVar = new AbstractC9286mi.p(b(), d(), c());
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(pVar);
        }
    }
}
