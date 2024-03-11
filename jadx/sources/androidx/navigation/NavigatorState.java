package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.dpR;
import o.dqM;
import o.dqN;
import o.dyR;
import o.dzB;

/* loaded from: classes5.dex */
public abstract class NavigatorState {
    private final InterfaceC8812dzl<List<NavBackStackEntry>> _backStack;
    private final InterfaceC8812dzl<Set<NavBackStackEntry>> _transitionsInProgress;
    private final InterfaceC8822dzv<List<NavBackStackEntry>> backStack;
    private final ReentrantLock backStackLock = new ReentrantLock(true);
    private boolean isNavigating;
    private final InterfaceC8822dzv<Set<NavBackStackEntry>> transitionsInProgress;

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final InterfaceC8822dzv<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    public final InterfaceC8822dzv<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public final void setNavigating(boolean z) {
        this.isNavigating = z;
    }

    public NavigatorState() {
        List i;
        Set e;
        i = C8569dql.i();
        InterfaceC8812dzl<List<NavBackStackEntry>> d = dzB.d(i);
        this._backStack = d;
        e = dqN.e();
        InterfaceC8812dzl<Set<NavBackStackEntry>> d2 = dzB.d(e);
        this._transitionsInProgress = d2;
        this.backStack = dyR.b((InterfaceC8812dzl) d);
        this.transitionsInProgress = dyR.b((InterfaceC8812dzl) d2);
    }

    public void push(NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> b;
        C8632dsu.c((Object) navBackStackEntry, "");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            InterfaceC8812dzl<List<NavBackStackEntry>> interfaceC8812dzl = this._backStack;
            b = C8576dqs.b((Collection<? extends NavBackStackEntry>) ((Collection<? extends Object>) interfaceC8812dzl.b()), navBackStackEntry);
            interfaceC8812dzl.d(b);
            dpR dpr = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(NavBackStackEntry navBackStackEntry) {
        Object D;
        Set<NavBackStackEntry> a;
        Set<NavBackStackEntry> a2;
        C8632dsu.c((Object) navBackStackEntry, "");
        D = C8576dqs.D((List<? extends Object>) this.backStack.b());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) D;
        if (navBackStackEntry2 != null) {
            InterfaceC8812dzl<Set<NavBackStackEntry>> interfaceC8812dzl = this._transitionsInProgress;
            a2 = dqM.a(interfaceC8812dzl.b(), navBackStackEntry2);
            interfaceC8812dzl.d(a2);
        }
        InterfaceC8812dzl<Set<NavBackStackEntry>> interfaceC8812dzl2 = this._transitionsInProgress;
        a = dqM.a(interfaceC8812dzl2.b(), navBackStackEntry);
        interfaceC8812dzl2.d(a);
        push(navBackStackEntry);
    }

    public void pop(NavBackStackEntry navBackStackEntry, boolean z) {
        C8632dsu.c((Object) navBackStackEntry, "");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            InterfaceC8812dzl<List<NavBackStackEntry>> interfaceC8812dzl = this._backStack;
            ArrayList arrayList = new ArrayList();
            for (Object obj : interfaceC8812dzl.b()) {
                if (!(!C8632dsu.c((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                }
                arrayList.add(obj);
            }
            interfaceC8812dzl.d(arrayList);
            dpR dpr = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z) {
        Set<NavBackStackEntry> a;
        NavBackStackEntry navBackStackEntry2;
        Set<NavBackStackEntry> a2;
        C8632dsu.c((Object) navBackStackEntry, "");
        InterfaceC8812dzl<Set<NavBackStackEntry>> interfaceC8812dzl = this._transitionsInProgress;
        a = dqM.a(interfaceC8812dzl.b(), navBackStackEntry);
        interfaceC8812dzl.d(a);
        List<NavBackStackEntry> b = this.backStack.b();
        ListIterator<NavBackStackEntry> listIterator = b.listIterator(b.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry2 = null;
                break;
            }
            navBackStackEntry2 = listIterator.previous();
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!C8632dsu.c(navBackStackEntry3, navBackStackEntry) && this.backStack.b().lastIndexOf(navBackStackEntry3) < this.backStack.b().lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry4 = navBackStackEntry2;
        if (navBackStackEntry4 != null) {
            InterfaceC8812dzl<Set<NavBackStackEntry>> interfaceC8812dzl2 = this._transitionsInProgress;
            a2 = dqM.a(interfaceC8812dzl2.b(), navBackStackEntry4);
            interfaceC8812dzl2.d(a2);
        }
        pop(navBackStackEntry, z);
    }

    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        Object B;
        List c;
        List<NavBackStackEntry> b;
        C8632dsu.c((Object) navBackStackEntry, "");
        InterfaceC8812dzl<List<NavBackStackEntry>> interfaceC8812dzl = this._backStack;
        B = C8576dqs.B((List<? extends Object>) this._backStack.b());
        c = C8576dqs.c(interfaceC8812dzl.b(), B);
        b = C8576dqs.b((Collection<? extends NavBackStackEntry>) ((Collection<? extends Object>) c), navBackStackEntry);
        interfaceC8812dzl.d(b);
    }

    public void markTransitionComplete(NavBackStackEntry navBackStackEntry) {
        Set<NavBackStackEntry> e;
        C8632dsu.c((Object) navBackStackEntry, "");
        InterfaceC8812dzl<Set<NavBackStackEntry>> interfaceC8812dzl = this._transitionsInProgress;
        e = dqM.e(interfaceC8812dzl.b(), navBackStackEntry);
        interfaceC8812dzl.d(e);
    }
}
