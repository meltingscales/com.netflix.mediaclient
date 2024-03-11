package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8560dqc;
import o.C8570dqm;
import o.C8627dsp;
import o.C8632dsu;
import o.C8684dus;
import o.dqF;
import o.drM;
import o.dsH;
import o.dtQ;
import o.dtX;

/* loaded from: classes5.dex */
public class NavDestination {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;

    public final int getId() {
        return this.id;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setId(int i) {
        this.id = i;
        this.idName = null;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public boolean supportsActions() {
        return true;
    }

    public NavDestination(String str) {
        C8632dsu.c((Object) str, "");
        this.navigatorName = str;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>();
        this._arguments = new LinkedHashMap();
    }

    /* loaded from: classes5.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int mimeTypeMatchLevel;

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
            C8632dsu.c((Object) navDestination, "");
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.hasMatchingAction = z2;
            this.mimeTypeMatchLevel = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch deepLinkMatch) {
            C8632dsu.c((Object) deepLinkMatch, "");
            boolean z = this.isExactDeepLink;
            if (!z || deepLinkMatch.isExactDeepLink) {
                if (z || !deepLinkMatch.isExactDeepLink) {
                    Bundle bundle = this.matchingArgs;
                    if (bundle == null || deepLinkMatch.matchingArgs != null) {
                        if (bundle != null || deepLinkMatch.matchingArgs == null) {
                            if (bundle != null) {
                                int size = bundle.size();
                                Bundle bundle2 = deepLinkMatch.matchingArgs;
                                C8632dsu.d(bundle2);
                                int size2 = size - bundle2.size();
                                if (size2 > 0) {
                                    return 1;
                                }
                                if (size2 < 0) {
                                    return -1;
                                }
                            }
                            boolean z2 = this.hasMatchingAction;
                            if (!z2 || deepLinkMatch.hasMatchingAction) {
                                if (z2 || !deepLinkMatch.hasMatchingAction) {
                                    return this.mimeTypeMatchLevel - deepLinkMatch.mimeTypeMatchLevel;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    public final Map<String, NavArgument> getArguments() {
        return dqF.c(this._arguments);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        C8632dsu.c((Object) navigator, "");
    }

    public final void setRoute(String str) {
        Object obj;
        if (str == null) {
            setId(0);
        } else if (!(!C8684dus.a((CharSequence) str))) {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        } else {
            String createRoute = Companion.createRoute(str);
            setId(createRoute.hashCode());
            addDeepLink(createRoute);
        }
        List<NavDeepLink> list = this.deepLinks;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((NavDeepLink) obj).getUriPattern(), (Object) Companion.createRoute(this.route))) {
                break;
            }
        }
        dsH.b(list).remove(obj);
        this.route = str;
    }

    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    public final void addDeepLink(String str) {
        C8632dsu.c((Object) str, "");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(str).build());
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        C8632dsu.c((Object) navDeepLink, "");
        Map<String, NavArgument> arguments = getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, NavArgument> entry : arguments.entrySet()) {
            NavArgument value = entry.getValue();
            if (!value.isNullable() && !value.isDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (!navDeepLink.getArgumentsNames$navigation_common_release().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
        }
        this.deepLinks.add(navDeepLink);
    }

    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        C8632dsu.c((Object) navDeepLinkRequest, "");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, getArguments()) : null;
            String action = navDeepLinkRequest.getAction();
            boolean z = action != null && C8632dsu.c((Object) action, (Object) navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments != null || z || mimeTypeMatchRating > -1) {
                DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), z, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.buildDeepLinkIds(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final int[] buildDeepLinkIds(NavDestination navDestination) {
        C8560dqc c8560dqc = new C8560dqc();
        NavGraph navGraph = this;
        while (true) {
            C8632dsu.d(navGraph);
            NavGraph navGraph2 = navGraph.parent;
            if ((navDestination != null ? navDestination.parent : null) != null) {
                NavGraph navGraph3 = navDestination.parent;
                C8632dsu.d(navGraph3);
                if (navGraph3.findNode(navGraph.id) == navGraph) {
                    c8560dqc.c((C8560dqc) navGraph);
                    break;
                }
            }
            if (navGraph2 == null || navGraph2.getStartDestinationId() != navGraph.id) {
                c8560dqc.c((C8560dqc) navGraph);
            }
            if (C8632dsu.c(navGraph2, navDestination) || navGraph2 == null) {
                break;
            }
            navGraph = navGraph2;
        }
        List<NavDestination> w = C8570dqm.w((Iterable) c8560dqc);
        ArrayList arrayList = new ArrayList(C8570dqm.a((Iterable) w, 10));
        for (NavDestination navDestination2 : w) {
            arrayList.add(Integer.valueOf(navDestination2.id));
        }
        return C8570dqm.c((Collection) arrayList);
    }

    public final void putAction(int i, NavAction navAction) {
        C8632dsu.c((Object) navAction, "");
        if (supportsActions()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.actions.put(i, navAction);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void addArgument(String str, NavArgument navArgument) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) navArgument, "");
        this._arguments.put(str, navArgument);
    }

    public final Bundle addInDefaultArgs(Bundle bundle) {
        Map<String, NavArgument> map;
        if (bundle == null && ((map = this._arguments) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.verify(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !C8684dus.a((CharSequence) str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        NavDestination navDestination = (NavDestination) obj;
        boolean z3 = C8570dqm.c((Iterable) this.deepLinks, (Iterable) navDestination.deepLinks).size() == this.deepLinks.size();
        if (this.actions.size() == navDestination.actions.size()) {
            Iterator it = dtX.a(SparseArrayKt.valueIterator(this.actions)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    for (NavAction navAction : dtX.a(SparseArrayKt.valueIterator(navDestination.actions))) {
                        if (!this.actions.containsValue(navAction)) {
                        }
                    }
                    z = true;
                } else if (!navDestination.actions.containsValue((NavAction) it.next())) {
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (getArguments().size() == navDestination.getArguments().size()) {
            Iterator it2 = dqF.b(getArguments()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (navDestination.getArguments().containsKey(entry.getKey())) {
                        if (!C8632dsu.c(navDestination.getArguments().get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    for (Map.Entry entry2 : dqF.b(navDestination.getArguments())) {
                        if (getArguments().containsKey(entry2.getKey())) {
                            if (!C8632dsu.c(getArguments().get(entry2.getKey()), entry2.getValue())) {
                            }
                        }
                    }
                    z2 = true;
                }
            }
        }
        z2 = false;
        return this.id == navDestination.id && C8632dsu.c((Object) this.route, (Object) navDestination.route) && z3 && z && z2;
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.id;
        String str = this.route;
        int hashCode = (i * 31) + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.deepLinks) {
            String uriPattern = navDeepLink.getUriPattern();
            int hashCode2 = uriPattern != null ? uriPattern.hashCode() : 0;
            String action = navDeepLink.getAction();
            int hashCode3 = action != null ? action.hashCode() : 0;
            String mimeType = navDeepLink.getMimeType();
            hashCode = (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.actions);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = navAction.getDestinationId();
            NavOptions navOptions = navAction.getNavOptions();
            hashCode = (((hashCode * 31) + destinationId) * 31) + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                C8632dsu.a(keySet, "");
                for (String str2 : keySet) {
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    C8632dsu.d(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    hashCode = (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : getArguments().keySet()) {
            int hashCode4 = str3.hashCode();
            NavArgument navArgument = getArguments().get(str3);
            hashCode = (((hashCode * 31) + hashCode4) * 31) + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return hashCode;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final String getDisplayName(Context context, int i) {
            String valueOf;
            C8632dsu.c((Object) context, "");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            C8632dsu.a(valueOf, "");
            return valueOf;
        }

        public final String createRoute(String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        public final dtQ<NavDestination> getHierarchy(NavDestination navDestination) {
            C8632dsu.c((Object) navDestination, "");
            return dtX.b(navDestination, new drM<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // o.drM
                public final NavDestination invoke(NavDestination navDestination2) {
                    C8632dsu.c((Object) navDestination2, "");
                    return navDestination2.getParent();
                }
            });
        }
    }
}
