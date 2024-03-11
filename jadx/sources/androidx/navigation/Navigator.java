package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import o.C8576dqs;
import o.C8632dsu;
import o.C8670due;
import o.dpR;
import o.drM;
import o.dtQ;

/* loaded from: classes5.dex */
public abstract class Navigator<D extends NavDestination> {
    private NavigatorState _state;
    private boolean isAttached;

    /* loaded from: classes5.dex */
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Name {
        String value();
    }

    public abstract D createDestination();

    public final boolean isAttached() {
        return this.isAttached;
    }

    public NavDestination navigate(D d, Bundle bundle, NavOptions navOptions, Extras extras) {
        C8632dsu.c((Object) d, "");
        return d;
    }

    public void onAttach(NavigatorState navigatorState) {
        C8632dsu.c((Object) navigatorState, "");
        this._state = navigatorState;
        this.isAttached = true;
    }

    public void onRestoreState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void navigate(List<NavBackStackEntry> list, final NavOptions navOptions, final Extras extras) {
        dtQ C;
        dtQ k;
        dtQ<NavBackStackEntry> p;
        C8632dsu.c((Object) list, "");
        C = C8576dqs.C((Iterable) list);
        k = C8670due.k(C, new drM<NavBackStackEntry, NavBackStackEntry>(this) { // from class: androidx.navigation.Navigator$navigate$1
            final /* synthetic */ Navigator<D> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // o.drM
            public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
                NavDestination navigate;
                C8632dsu.c((Object) navBackStackEntry, "");
                NavDestination destination = navBackStackEntry.getDestination();
                if (!(destination instanceof NavDestination)) {
                    destination = null;
                }
                if (destination != null && (navigate = this.this$0.navigate(destination, navBackStackEntry.getArguments(), navOptions, extras)) != null) {
                    return C8632dsu.c(navigate, destination) ? navBackStackEntry : this.this$0.getState().createBackStackEntry(navigate, navigate.addInDefaultArgs(navBackStackEntry.getArguments()));
                }
                return null;
            }
        });
        p = C8670due.p(k);
        for (NavBackStackEntry navBackStackEntry : p) {
            getState().push(navBackStackEntry);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        C8632dsu.c((Object) navBackStackEntry, "");
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new drM<NavOptionsBuilder, dpR>() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(NavOptionsBuilder navOptionsBuilder) {
                invoke2(navOptionsBuilder);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(NavOptionsBuilder navOptionsBuilder) {
                C8632dsu.c((Object) navOptionsBuilder, "");
                navOptionsBuilder.setLaunchSingleTop(true);
            }
        }), null);
        getState().onLaunchSingleTop(navBackStackEntry);
    }

    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        C8632dsu.c((Object) navBackStackEntry, "");
        List<NavBackStackEntry> b = getState().getBackStack().b();
        if (!b.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + b).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = b.listIterator(b.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (popBackStack()) {
            navBackStackEntry2 = listIterator.previous();
            if (C8632dsu.c(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            getState().pop(navBackStackEntry2, z);
        }
    }
}
