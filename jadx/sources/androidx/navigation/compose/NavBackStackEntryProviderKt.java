package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import java.lang.ref.WeakReference;
import o.C8632dsu;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
public final class NavBackStackEntryProviderKt {
    public static final void LocalOwnersProvider(final NavBackStackEntry navBackStackEntry, final SaveableStateHolder saveableStateHolder, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        C8632dsu.c((Object) navBackStackEntry, "");
        C8632dsu.c((Object) saveableStateHolder, "");
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(-1579360880);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.composableLambda(startRestartGroup, -52928304, true, new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    NavBackStackEntryProviderKt.SaveableStateProvider(SaveableStateHolder.this, drx, composer2, ((i >> 3) & 112) | 8);
                }
            }
        }), startRestartGroup, 56);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i2) {
                NavBackStackEntryProviderKt.LocalOwnersProvider(NavBackStackEntry.this, saveableStateHolder, drx, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SaveableStateProvider(final SaveableStateHolder saveableStateHolder, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        CreationExtras creationExtras;
        Composer startRestartGroup = composer.startRestartGroup(1211832233);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            C8632dsu.a(creationExtras, "");
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(BackStackEntryIdViewModel.class, current, null, null, creationExtras, startRestartGroup, 36936, 0);
        startRestartGroup.endReplaceableGroup();
        BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
        backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
        saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), drx, startRestartGroup, (i & 112) | 520);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$SaveableStateProvider$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i2) {
                NavBackStackEntryProviderKt.SaveableStateProvider(SaveableStateHolder.this, drx, composer2, i | 1);
            }
        });
    }
}
