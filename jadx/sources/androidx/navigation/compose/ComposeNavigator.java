package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;

@Navigator.Name("composable")
/* loaded from: classes5.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.m2733getLambda1$navigation_compose_release());
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        C8632dsu.c((Object) navBackStackEntry, "");
        getState().popWithTransition(navBackStackEntry, z);
    }

    public final void onTransitionComplete$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        C8632dsu.c((Object) navBackStackEntry, "");
        getState().markTransitionComplete(navBackStackEntry);
    }

    /* loaded from: classes5.dex */
    public static final class Destination extends NavDestination {
        private final InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> content;

        public final InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> getContent$navigation_compose_release() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Destination(ComposeNavigator composeNavigator, InterfaceC8612dsa<? super NavBackStackEntry, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
            super(composeNavigator);
            C8632dsu.c((Object) composeNavigator, "");
            C8632dsu.c((Object) interfaceC8612dsa, "");
            this.content = interfaceC8612dsa;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        C8632dsu.c((Object) list, "");
        for (NavBackStackEntry navBackStackEntry : list) {
            getState().pushWithTransition(navBackStackEntry);
        }
    }
}
