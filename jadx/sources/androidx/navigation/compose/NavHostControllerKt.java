package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import o.C8632dsu;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class NavHostControllerKt {
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(NavController navController, Composer composer, int i) {
        C8632dsu.c((Object) navController, "");
        composer.startReplaceableGroup(-120375203);
        State<NavBackStackEntry> collectAsState = SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 56, 2);
        composer.endReplaceableGroup();
        return collectAsState;
    }

    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i) {
        C8632dsu.c((Object) navigatorArr, "");
        composer.startReplaceableGroup(-312215566);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        NavHostController navHostController = (NavHostController) RememberSaveableKt.rememberSaveable(Arrays.copyOf(navigatorArr, navigatorArr.length), NavControllerSaver(context), null, new drO<NavHostController>() { // from class: androidx.navigation.compose.NavHostControllerKt$rememberNavController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final NavHostController invoke() {
                NavHostController createNavController;
                createNavController = NavHostControllerKt.createNavController(context);
                return createNavController;
            }
        }, composer, 72, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        composer.endReplaceableGroup();
        return navHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController createNavController(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    private static final Saver<NavHostController, ?> NavControllerSaver(final Context context) {
        return SaverKt.Saver(new drX<SaverScope, NavHostController, Bundle>() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$1
            @Override // o.drX
            public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
                C8632dsu.c((Object) saverScope, "");
                C8632dsu.c((Object) navHostController, "");
                return navHostController.saveState();
            }
        }, new drM<Bundle, NavHostController>() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final NavHostController invoke(Bundle bundle) {
                NavHostController createNavController;
                C8632dsu.c((Object) bundle, "");
                createNavController = NavHostControllerKt.createNavController(context);
                createNavController.restoreState(bundle);
                return createNavController;
            }
        });
    }
}
