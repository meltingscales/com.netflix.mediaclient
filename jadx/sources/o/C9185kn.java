package o;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.kn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9185kn {
    private final CopyOnWriteArrayList<InterfaceC9263mL> observers = new CopyOnWriteArrayList<>();

    public final CopyOnWriteArrayList<InterfaceC9263mL> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void addObserver(InterfaceC9263mL interfaceC9263mL) {
        this.observers.addIfAbsent(interfaceC9263mL);
    }

    public final void removeObserver(InterfaceC9263mL interfaceC9263mL) {
        this.observers.remove(interfaceC9263mL);
    }

    public final void updateState$bugsnag_android_core_release(drO<? extends AbstractC9286mi> dro) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        AbstractC9286mi invoke = dro.invoke();
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(invoke);
        }
    }

    public final void updateState(AbstractC9286mi abstractC9286mi) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(abstractC9286mi);
        }
    }
}
