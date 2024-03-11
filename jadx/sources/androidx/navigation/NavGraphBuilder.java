package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;
    private int startDestinationId;
    private String startDestinationRoute;

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void addDestination(NavDestination navDestination) {
        C8632dsu.c((Object) navDestination, "");
        this.destinations.add(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i = this.startDestinationId;
        if (i == 0 && this.startDestinationRoute == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            C8632dsu.d((Object) str);
            navGraph.setStartDestination(str);
        } else {
            navGraph.setStartDestination(i);
        }
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), str2);
        C8632dsu.c((Object) navigatorProvider, "");
        C8632dsu.c((Object) str, "");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationRoute = str;
    }
}
