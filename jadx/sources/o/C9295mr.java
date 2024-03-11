package o;

import o.AbstractC9286mi;

/* renamed from: o.mr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9295mr extends C9185kn {
    private C9294mq b;

    public final C9294mq c() {
        return this.b;
    }

    public C9295mr(C9294mq c9294mq) {
        this.b = c9294mq;
    }

    public final void b(C9294mq c9294mq) {
        this.b = c9294mq;
        a();
    }

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi.q qVar = new AbstractC9286mi.q(c());
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(qVar);
        }
    }
}
