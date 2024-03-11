package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes5.dex */
public final class NavGraphBuilderKt {
    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj) {
        if ((i & 2) != 0) {
            list = C8569dql.i();
        }
        if ((i & 4) != 0) {
            list2 = C8569dql.i();
        }
        composable(navGraphBuilder, str, list, list2, interfaceC8612dsa);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, InterfaceC8612dsa<? super NavBackStackEntry, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) navGraphBuilder, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), interfaceC8612dsa);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        for (NavDeepLink navDeepLink : list2) {
            destination.addDeepLink(navDeepLink);
        }
        navGraphBuilder.addDestination(destination);
    }
}
