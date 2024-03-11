package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class DialogHostKt {
    public static final void DialogHost(final DialogNavigator dialogNavigator, Composer composer, final int i) {
        C8632dsu.c((Object) dialogNavigator, "");
        Composer startRestartGroup = composer.startRestartGroup(294589392);
        if ((((i & 14) == 0 ? (startRestartGroup.changed(dialogNavigator) ? 4 : 2) | i : i) & 11) != 2 || !startRestartGroup.getSkipping()) {
            final SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            State collectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 8, 1);
            SnapshotStateList<NavBackStackEntry> rememberVisibleList = rememberVisibleList(m2735DialogHost$lambda0(collectAsState), startRestartGroup, 8);
            PopulateVisibleList(rememberVisibleList, m2735DialogHost$lambda0(collectAsState), startRestartGroup, 64);
            for (final NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                final DialogNavigator.Destination destination = (DialogNavigator.Destination) navBackStackEntry.getDestination();
                AndroidDialog_androidKt.Dialog(new drO<dpR>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DialogNavigator.this.dismiss$navigation_compose_release(navBackStackEntry);
                    }
                }, destination.getDialogProperties$navigation_compose_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1129586364, true, new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                            final NavBackStackEntry navBackStackEntry2 = NavBackStackEntry.this;
                            final DialogNavigator dialogNavigator2 = dialogNavigator;
                            EffectsKt.DisposableEffect(navBackStackEntry2, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    C8632dsu.c((Object) disposableEffectScope, "");
                                    final DialogNavigator dialogNavigator3 = DialogNavigator.this;
                                    final NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry3);
                                        }
                                    };
                                }
                            }, composer2, 8);
                            final NavBackStackEntry navBackStackEntry3 = NavBackStackEntry.this;
                            SaveableStateHolder saveableStateHolder = rememberSaveableStateHolder;
                            final DialogNavigator.Destination destination2 = destination;
                            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, saveableStateHolder, ComposableLambdaKt.composableLambda(composer2, -497631156, true, new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return dpR.c;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        DialogNavigator.Destination.this.getContent$navigation_compose_release().invoke(navBackStackEntry3, composer3, 8);
                                    }
                                }
                            }), composer2, 456);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 384, 0);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i2) {
                DialogHostKt.DialogHost(DialogNavigator.this, composer2, i | 1);
            }
        });
    }

    public static final void PopulateVisibleList(final List<NavBackStackEntry> list, final Collection<NavBackStackEntry> collection, Composer composer, final int i) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) collection, "");
        Composer startRestartGroup = composer.startRestartGroup(1537894851);
        for (NavBackStackEntry navBackStackEntry : collection) {
            EffectsKt.DisposableEffect(navBackStackEntry.getLifecycle(), new DialogHostKt$PopulateVisibleList$1$1(navBackStackEntry, list), startRestartGroup, 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i2) {
                DialogHostKt.PopulateVisibleList(list, collection, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.navigation.NavBackStackEntry> r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            java.lang.String r6 = ""
            o.C8632dsu.c(r4, r6)
            r6 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r5.startReplaceableGroup(r6)
            r6 = -3686930(0xffffffffffc7bdee, float:NaN)
            r5.startReplaceableGroup(r6)
            boolean r6 = r5.changed(r4)
            java.lang.Object r0 = r5.rememberedValue()
            if (r6 != 0) goto L23
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L59
        L23:
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r4.next()
            r2 = r1
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r3)
            if (r2 == 0) goto L32
            r6.add(r1)
            goto L32
        L53:
            r0.addAll(r6)
            r5.updateRememberedValue(r0)
        L59:
            r5.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            r5.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }

    /* renamed from: DialogHost$lambda-0  reason: not valid java name */
    private static final List<NavBackStackEntry> m2735DialogHost$lambda0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
