package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import java.util.List;
import o.C8566dqi;
import o.C8632dsu;

@Navigator.Name("navigation")
/* loaded from: classes5.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        C8632dsu.c((Object) navigatorProvider, "");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        C8632dsu.c((Object) list, "");
        for (NavBackStackEntry navBackStackEntry : list) {
            navigate(navBackStackEntry, navOptions, extras);
        }
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination findNode;
        List<NavBackStackEntry> e;
        NavGraph navGraph = (NavGraph) navBackStackEntry.getDestination();
        Bundle arguments = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            findNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            findNode = navGraph.findNode(startDestinationId, false);
        }
        if (findNode == null) {
            String startDestDisplayName = navGraph.getStartDestDisplayName();
            throw new IllegalArgumentException("navigation destination " + startDestDisplayName + " is not a direct child of this NavGraph");
        }
        Navigator navigator = this.navigatorProvider.getNavigator(findNode.getNavigatorName());
        e = C8566dqi.e(getState().createBackStackEntry(findNode, findNode.addInDefaultArgs(arguments)));
        navigator.navigate(e, navOptions, extras);
    }
}
