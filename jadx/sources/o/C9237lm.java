package o;

import java.util.List;
import o.AbstractC9286mi;

/* renamed from: o.lm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9237lm extends C9185kn {
    private final C9236ll e;

    public C9237lm() {
        this(null, 1, null);
    }

    public final C9236ll c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9237lm) && C8632dsu.c(this.e, ((C9237lm) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "FeatureFlagState(featureFlags=" + this.e + ')';
    }

    public /* synthetic */ C9237lm(C9236ll c9236ll, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C9236ll(null, 1, null) : c9236ll);
    }

    public C9237lm(C9236ll c9236ll) {
        this.e = c9236ll;
    }

    public void b(String str, String str2) {
        this.e.e(str, str2);
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.c cVar = new AbstractC9286mi.c(str, str2);
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(cVar);
        }
    }

    public void a() {
        this.e.e();
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.e eVar = AbstractC9286mi.e.b;
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(eVar);
        }
    }

    public final void d() {
        for (C9240lp c9240lp : b()) {
            String key = c9240lp.getKey();
            String value = c9240lp.getValue();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                AbstractC9286mi.c cVar = new AbstractC9286mi.c(key, value);
                for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
                    interfaceC9263mL.onStateChange(cVar);
                }
            }
        }
    }

    public final List<C9240lp> b() {
        return this.e.b();
    }

    public final C9237lm e() {
        return new C9237lm(this.e.c());
    }
}
