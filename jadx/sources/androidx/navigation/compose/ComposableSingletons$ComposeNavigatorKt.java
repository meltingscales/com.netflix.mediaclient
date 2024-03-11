package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes5.dex */
public final class ComposableSingletons$ComposeNavigatorKt {
    public static final ComposableSingletons$ComposeNavigatorKt INSTANCE = new ComposableSingletons$ComposeNavigatorKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> f25lambda1 = ComposableLambdaKt.composableLambdaInstance(1621820099, false, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda-1$1
        public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
            C8632dsu.c((Object) navBackStackEntry, "");
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return dpR.c;
        }
    });

    /* renamed from: getLambda-1$navigation_compose_release  reason: not valid java name */
    public final InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR> m2733getLambda1$navigation_compose_release() {
        return f25lambda1;
    }
}
