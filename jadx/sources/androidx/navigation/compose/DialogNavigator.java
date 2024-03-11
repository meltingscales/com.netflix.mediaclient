package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.InterfaceC8822dzv;
import o.dpR;

@Navigator.Name("dialog")
/* loaded from: classes5.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion(null);

    public final InterfaceC8822dzv<List<NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        C8632dsu.c((Object) navBackStackEntry, "");
        getState().popWithTransition(navBackStackEntry, false);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m2734getLambda1$navigation_compose_release(), 2, null);
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
    public static final class Destination extends NavDestination implements FloatingWindow {
        private final InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> content;
        private final DialogProperties dialogProperties;

        public final InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> getContent$navigation_compose_release() {
            return this.content;
        }

        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC8612dsa interfaceC8612dsa, int i, C8627dsp c8627dsp) {
            this(dialogNavigator, (i & 2) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (C8627dsp) null) : dialogProperties, interfaceC8612dsa);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC8612dsa<? super NavBackStackEntry, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
            super(dialogNavigator);
            C8632dsu.c((Object) dialogNavigator, "");
            C8632dsu.c((Object) dialogProperties, "");
            C8632dsu.c((Object) interfaceC8612dsa, "");
            this.dialogProperties = dialogProperties;
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
            getState().push(navBackStackEntry);
        }
    }
}
