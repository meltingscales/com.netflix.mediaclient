package o;

import com.netflix.cl.model.event.Event;
import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.Session;
import o.AbstractC8152dew;

/* loaded from: classes3.dex */
public class aTS implements AbstractC8152dew.c {
    private InterfaceC8154dey c;
    private aTQ d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aTS(InterfaceC8154dey interfaceC8154dey, aTQ atq) {
        this.c = interfaceC8154dey;
        this.d = atq;
    }

    @Override // o.AbstractC8152dew.c
    public boolean e(int i, long j) {
        String[] b;
        String[] d;
        Event b2 = this.c.b();
        if (b2 == null) {
            C1044Mm.e("EventAddedFlushCriterion", "Flush check is not triggered by added event, ignore");
            return false;
        }
        for (String str : this.d.b()) {
            if (C8168dfL.d(b(b2), str)) {
                if (b2 instanceof NavigationLevel) {
                    if (this.d.d().length == 0) {
                        C1044Mm.e("EventAddedFlushCriterion", "Flush queue for trigger event NavigationLevel, no limit found on appView");
                        return true;
                    }
                    NavigationLevel navigationLevel = (NavigationLevel) b2;
                    for (String str2 : this.d.d()) {
                        if (str2.equals(navigationLevel.getView().name())) {
                            C1044Mm.a("EventAddedFlushCriterion", "Flush queue for trigger event NavigationLevel, appView %s", str2);
                            return true;
                        }
                    }
                    C1044Mm.e("EventAddedFlushCriterion", "Flush queue trigger not found for event NavigationLevel");
                    return false;
                }
                C1044Mm.a("EventAddedFlushCriterion", "Flush queue for trigger event %s", str);
                return true;
            }
        }
        return false;
    }

    private String b(Event event) {
        if (event instanceof Session) {
            return ((Session) event).getSessionName();
        }
        if (event instanceof DiscreteEvent) {
            return ((DiscreteEvent) event).getEventMostDerivedType();
        }
        return null;
    }
}
