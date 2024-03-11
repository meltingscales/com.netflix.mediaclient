package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8670due;
import o.C8691duz;
import o.drM;
import o.dsK;
import o.dtQ;
import o.dtY;

/* loaded from: classes5.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, dsK {
    public static final Companion Companion = new Companion(null);
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    public final int getStartDestinationId() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        C8632dsu.c((Object) navigator, "");
        this.nodes = new SparseArrayCompat<>();
    }

    @Override // androidx.navigation.NavDestination
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Comparable F;
        List i;
        Comparable F2;
        C8632dsu.c((Object) navDeepLinkRequest, "");
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch matchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (matchDeepLink2 != null) {
                arrayList.add(matchDeepLink2);
            }
        }
        F = C8576dqs.F(arrayList);
        i = C8569dql.i(matchDeepLink, (NavDestination.DeepLinkMatch) F);
        F2 = C8576dqs.F(i);
        return (NavDestination.DeepLinkMatch) F2;
    }

    public final void addDestination(NavDestination navDestination) {
        C8632dsu.c((Object) navDestination, "");
        int id = navDestination.getId();
        String route = navDestination.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (getRoute() != null && !(!C8632dsu.c((Object) route, (Object) getRoute()))) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        } else if (id == getId()) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        } else {
            NavDestination navDestination2 = this.nodes.get(id);
            if (navDestination2 == navDestination) {
                return;
            }
            if (navDestination.getParent() != null) {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            if (navDestination2 != null) {
                navDestination2.setParent(null);
            }
            navDestination.setParent(this);
            this.nodes.put(navDestination.getId(), navDestination);
        }
    }

    public final void addDestinations(Collection<? extends NavDestination> collection) {
        C8632dsu.c((Object) collection, "");
        for (NavDestination navDestination : collection) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final NavDestination findNode(int i) {
        return findNode(i, true);
    }

    public final NavDestination findNode(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                return findNode(str, true);
            }
        }
        return null;
    }

    public final NavDestination findNode(int i, boolean z) {
        NavDestination navDestination = this.nodes.get(i);
        if (navDestination == null) {
            if (!z || getParent() == null) {
                return null;
            }
            NavGraph parent = getParent();
            C8632dsu.d(parent);
            return parent.findNode(i);
        }
        return navDestination;
    }

    public final NavDestination findNode(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        NavDestination navDestination = this.nodes.get(NavDestination.Companion.createRoute(str).hashCode());
        if (navDestination == null) {
            if (!z || getParent() == null) {
                return null;
            }
            NavGraph parent = getParent();
            C8632dsu.d(parent);
            return parent.findNode(str);
        }
        return navDestination;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    private final void setStartDestinationId(int i) {
        if (i != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    public final void setStartDestination(int i) {
        setStartDestinationId(i);
    }

    public final void setStartDestination(String str) {
        C8632dsu.c((Object) str, "");
        setStartDestinationRoute(str);
    }

    private final void setStartDestinationRoute(String str) {
        boolean g;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!(!C8632dsu.c((Object) str, (Object) getRoute()))) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else {
            g = C8691duz.g(str);
            if (!(!g)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            hashCode = NavDestination.Companion.createRoute(str).hashCode();
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        C8632dsu.d((Object) str2);
        return str2;
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination findNode = findNode(this.startDestinationRoute);
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        dtQ b;
        List t;
        if (obj != null && (obj instanceof NavGraph)) {
            b = dtY.b(SparseArrayKt.valueIterator(this.nodes));
            t = C8670due.t(b);
            NavGraph navGraph = (NavGraph) obj;
            Iterator valueIterator = SparseArrayKt.valueIterator(navGraph.nodes);
            while (valueIterator.hasNext()) {
                t.remove((NavDestination) valueIterator.next());
            }
            if (super.equals(obj) && this.nodes.size() == navGraph.nodes.size() && getStartDestinationId() == navGraph.getStartDestinationId() && t.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i)) * 31) + sparseArrayCompat.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final NavDestination findStartDestination(NavGraph navGraph) {
            dtQ a;
            Object r;
            C8632dsu.c((Object) navGraph, "");
            a = dtY.a(navGraph.findNode(navGraph.getStartDestinationId()), new drM<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$findStartDestination$1
                @Override // o.drM
                public final NavDestination invoke(NavDestination navDestination) {
                    C8632dsu.c((Object) navDestination, "");
                    if (navDestination instanceof NavGraph) {
                        NavGraph navGraph2 = (NavGraph) navDestination;
                        return navGraph2.findNode(navGraph2.getStartDestinationId());
                    }
                    return null;
                }
            });
            r = C8670due.r(a);
            return (NavDestination) r;
        }
    }
}
