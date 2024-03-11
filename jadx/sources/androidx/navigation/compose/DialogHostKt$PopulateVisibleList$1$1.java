package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.drM;

/* loaded from: classes5.dex */
final class DialogHostKt$PopulateVisibleList$1$1 extends Lambda implements drM<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1(NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$this_PopulateVisibleList = list;
    }

    @Override // o.drM
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C8632dsu.c((Object) disposableEffectScope, "");
        final List<NavBackStackEntry> list = this.$this_PopulateVisibleList;
        final NavBackStackEntry navBackStackEntry = this.$entry;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt$PopulateVisibleList$1$1.m2736invoke$lambda0(list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        this.$entry.getLifecycle().addObserver(lifecycleEventObserver);
        final NavBackStackEntry navBackStackEntry2 = this.$entry;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavBackStackEntry.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m2736invoke$lambda0(List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) navBackStackEntry, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }
}
