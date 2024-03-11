package androidx.navigation.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8569dql;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8822dzv;
import o.dpR;
import o.drM;
import o.drX;
import o.dyQ;
import o.dyS;

/* loaded from: classes5.dex */
public final class NavHostKt {
    public static final void NavHost(final NavHostController navHostController, final String str, Modifier modifier, String str2, final drM<? super NavGraphBuilder, dpR> drm, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        final String str3 = (i2 & 8) != 0 ? null : str2;
        startRestartGroup.startReplaceableGroup(-3686095);
        boolean changed = startRestartGroup.changed(str3);
        boolean changed2 = startRestartGroup.changed(str);
        boolean changed3 = startRestartGroup.changed(drm);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            drm.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, startRestartGroup, (i & 896) | 72, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$2
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

            public final void invoke(Composer composer2, int i3) {
                NavHostKt.NavHost(NavHostController.this, str, modifier2, str3, drm, composer2, i | 1, i2);
            }
        });
    }

    public static final void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Composer composer, final int i, final int i2) {
        List i3;
        Object D;
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) navGraph, "");
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 8);
        if (current == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        OnBackPressedDispatcherOwner current2 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 8);
        OnBackPressedDispatcher onBackPressedDispatcher = current2 != null ? current2.getOnBackPressedDispatcher() : null;
        navHostController.setLifecycleOwner(lifecycleOwner);
        ViewModelStore viewModelStore = current.getViewModelStore();
        C8632dsu.a(viewModelStore, "");
        navHostController.setViewModelStore(viewModelStore);
        if (onBackPressedDispatcher != null) {
            navHostController.setOnBackPressedDispatcher(onBackPressedDispatcher);
        }
        EffectsKt.DisposableEffect(navHostController, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                C8632dsu.c((Object) disposableEffectScope, "");
                NavHostController.this.enableOnBackPressed(true);
                final NavHostController navHostController2 = NavHostController.this;
                return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        NavHostController.this.enableOnBackPressed(false);
                    }
                };
            }
        }, startRestartGroup, 8);
        navHostController.setGraph(navGraph);
        final SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
        Navigator navigator = navHostController.getNavigatorProvider().getNavigator("composable");
        final ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
        if (composeNavigator == null) {
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
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

                public final void invoke(Composer composer2, int i4) {
                    NavHostKt.NavHost(NavHostController.this, navGraph, modifier2, composer2, i | 1, i2);
                }
            });
            return;
        }
        InterfaceC8822dzv<List<NavBackStackEntry>> visibleEntries = navHostController.getVisibleEntries();
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(visibleEntries);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final InterfaceC8822dzv<List<NavBackStackEntry>> visibleEntries2 = navHostController.getVisibleEntries();
            rememberedValue = new dyS<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1
                @Override // o.dyS
                public Object collect(dyQ<? super List<? extends NavBackStackEntry>> dyq, InterfaceC8585dra interfaceC8585dra) {
                    Object e;
                    Object collect = dyS.this.collect(new AnonymousClass2(dyq), interfaceC8585dra);
                    e = C8586drb.e();
                    return collect == e ? collect : dpR.c;
                }

                /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass2<T> implements dyQ {
                    final /* synthetic */ dyQ $this_unsafeFlow;

                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC8585dra interfaceC8585dra) {
                            super(interfaceC8585dra);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(dyQ dyq) {
                        this.$this_unsafeFlow = dyq;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // o.dyQ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r8, o.InterfaceC8585dra r9) {
                        /*
                            r7 = this;
                            boolean r0 = r9 instanceof androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1 r0 = (androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 + r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = o.C8588drd.c()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            o.C8556dpz.d(r9)
                            goto L6b
                        L29:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L31:
                            o.C8556dpz.d(r9)
                            o.dyQ r9 = r7.$this_unsafeFlow
                            java.util.List r8 = (java.util.List) r8
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r8 = r8.iterator()
                        L41:
                            boolean r4 = r8.hasNext()
                            if (r4 == 0) goto L62
                            java.lang.Object r4 = r8.next()
                            r5 = r4
                            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
                            androidx.navigation.NavDestination r5 = r5.getDestination()
                            java.lang.String r5 = r5.getNavigatorName()
                            java.lang.String r6 = "composable"
                            boolean r5 = o.C8632dsu.c(r5, r6)
                            if (r5 == 0) goto L41
                            r2.add(r4)
                            goto L41
                        L62:
                            r0.label = r3
                            java.lang.Object r8 = r9.emit(r2, r0)
                            if (r8 != r1) goto L6b
                            return r1
                        L6b:
                            o.dpR r8 = o.dpR.c
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        i3 = C8569dql.i();
        final State collectAsState = SnapshotStateKt.collectAsState((dyS) rememberedValue, i3, null, startRestartGroup, 8, 2);
        D = C8576dqs.D((List<? extends Object>) m2737NavHost$lambda5(collectAsState));
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) D;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1822173528);
        if (navBackStackEntry != null) {
            CrossfadeKt.Crossfade(navBackStackEntry.getId(), modifier, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1319254703, true, new InterfaceC8612dsa<String, Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(String str, Composer composer2, Integer num) {
                    invoke(str, composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(String str, Composer composer2, int i4) {
                    List m2737NavHost$lambda5;
                    Object obj;
                    C8632dsu.c((Object) str, "");
                    if ((i4 & 14) == 0) {
                        i4 |= composer2.changed(str) ? 4 : 2;
                    }
                    if ((i4 & 91) != 18 || !composer2.getSkipping()) {
                        m2737NavHost$lambda5 = NavHostKt.m2737NavHost$lambda5(collectAsState);
                        ListIterator listIterator = m2737NavHost$lambda5.listIterator(m2737NavHost$lambda5.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj = null;
                                break;
                            }
                            obj = listIterator.previous();
                            if (C8632dsu.c((Object) str, (Object) ((NavBackStackEntry) obj).getId())) {
                                break;
                            }
                        }
                        final NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                        dpR dpr = dpR.c;
                        final MutableState<Boolean> mutableState2 = mutableState;
                        final State<List<NavBackStackEntry>> state = collectAsState;
                        final ComposeNavigator composeNavigator2 = composeNavigator;
                        composer2.startReplaceableGroup(-3686095);
                        boolean changed2 = composer2.changed(mutableState2);
                        boolean changed3 = composer2.changed(state);
                        boolean changed4 = composer2.changed(composeNavigator2);
                        Object rememberedValue3 = composer2.rememberedValue();
                        if ((changed2 | changed3 | changed4) || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    boolean m2738NavHost$lambda7;
                                    List<NavBackStackEntry> m2737NavHost$lambda52;
                                    C8632dsu.c((Object) disposableEffectScope, "");
                                    m2738NavHost$lambda7 = NavHostKt.m2738NavHost$lambda7(mutableState2);
                                    if (m2738NavHost$lambda7) {
                                        m2737NavHost$lambda52 = NavHostKt.m2737NavHost$lambda5(state);
                                        ComposeNavigator composeNavigator3 = composeNavigator2;
                                        for (NavBackStackEntry navBackStackEntry3 : m2737NavHost$lambda52) {
                                            composeNavigator3.onTransitionComplete$navigation_compose_release(navBackStackEntry3);
                                        }
                                        NavHostKt.m2739NavHost$lambda8(mutableState2, false);
                                    }
                                    final State<List<NavBackStackEntry>> state2 = state;
                                    final ComposeNavigator composeNavigator4 = composeNavigator2;
                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            List<NavBackStackEntry> m2737NavHost$lambda53;
                                            m2737NavHost$lambda53 = NavHostKt.m2737NavHost$lambda5(State.this);
                                            for (NavBackStackEntry navBackStackEntry4 : m2737NavHost$lambda53) {
                                                composeNavigator4.onTransitionComplete$navigation_compose_release(navBackStackEntry4);
                                            }
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.DisposableEffect(dpr, (drM) rememberedValue3, composer2, 0);
                        if (navBackStackEntry2 == null) {
                            return;
                        }
                        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, rememberSaveableStateHolder, ComposableLambdaKt.composableLambda(composer2, -631736544, true, new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4.2
                            {
                                super(2);
                            }

                            @Override // o.drX
                            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return dpR.c;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    ((ComposeNavigator.Destination) NavBackStackEntry.this.getDestination()).getContent$navigation_compose_release().invoke(NavBackStackEntry.this, composer3, 8);
                                }
                            }
                        }), composer2, 456);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i >> 3) & 112) | 3072, 4);
        }
        startRestartGroup.endReplaceableGroup();
        Navigator navigator2 = navHostController.getNavigatorProvider().getNavigator("dialog");
        DialogNavigator dialogNavigator = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : null;
        if (dialogNavigator == null) {
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 == null) {
                return;
            }
            final Modifier modifier3 = modifier;
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
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

                public final void invoke(Composer composer2, int i4) {
                    NavHostKt.NavHost(NavHostController.this, navGraph, modifier3, composer2, i | 1, i2);
                }
            });
            return;
        }
        DialogHostKt.DialogHost(dialogNavigator, startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
        if (endRestartGroup3 == null) {
            return;
        }
        final Modifier modifier4 = modifier;
        endRestartGroup3.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$5
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

            public final void invoke(Composer composer2, int i4) {
                NavHostKt.NavHost(NavHostController.this, navGraph, modifier4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavHost$lambda-5  reason: not valid java name */
    public static final List<NavBackStackEntry> m2737NavHost$lambda5(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavHost$lambda-7  reason: not valid java name */
    public static final boolean m2738NavHost$lambda7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavHost$lambda-8  reason: not valid java name */
    public static final void m2739NavHost$lambda8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
