package o;

import o.AbstractC9286mi;

/* renamed from: o.ku  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9192ku extends C9185kn {
    public final void a(String str) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.r rVar = new AbstractC9286mi.r(str);
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(rVar);
        }
    }

    public final void d(C9258mG c9258mG, String str, int i) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.i iVar = new AbstractC9286mi.i(c9258mG.b(), c9258mG.g().e(), c9258mG.a(), c9258mG.h(), c9258mG.w(), str, i, c9258mG.z());
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(iVar);
        }
    }

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.g gVar = AbstractC9286mi.g.a;
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(gVar);
        }
    }
}
