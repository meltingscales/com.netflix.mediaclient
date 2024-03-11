package androidx.navigation;

import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;

    public final String getRoute() {
        return this.route;
    }

    public NavDestinationBuilder(Navigator<? extends D> navigator, int i, String str) {
        C8632dsu.c((Object) navigator, "");
        this.navigator = navigator;
        this.id = i;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        C8632dsu.c((Object) navigator, "");
    }

    public D build() {
        D createDestination = this.navigator.createDestination();
        String str = this.route;
        if (str != null) {
            createDestination.setRoute(str);
        }
        int i = this.id;
        if (i != -1) {
            createDestination.setId(i);
        }
        createDestination.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            createDestination.addArgument(entry.getKey(), entry.getValue());
        }
        for (NavDeepLink navDeepLink : this.deepLinks) {
            createDestination.addDeepLink(navDeepLink);
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            createDestination.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        return createDestination;
    }
}
