package o;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavHostController;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import o.C8576dqs;
import o.C8632dsu;
import o.D;
import o.H;
import o.InterfaceC8613dsb;
import o.K;
import o.P;
import o.S;
import o.V;
import o.dpR;
import o.drM;
import o.drO;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class V {
    public static final void e(final Map<String, ? extends List<?>> map, final MutableState<D> mutableState, final NavHostController navHostController, final drO<dpR> dro, Composer composer, final int i) {
        SortedMap j;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(177457901);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(177457901, i, -1, "com.airbnb.android.showkase.ui.ShowkaseGroupsScreen (ShowkaseGroupsScreen.kt:16)");
        }
        j = dqD.j(map);
        final Map e = e(j, mutableState);
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new drM<LazyListScope, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                c(lazyListScope);
                return dpR.c;
            }

            public final void c(LazyListScope lazyListScope) {
                final List U;
                C8632dsu.c((Object) lazyListScope, "");
                U = C8576dqs.U(e.entrySet());
                final MutableState<D> mutableState2 = mutableState;
                final drO<dpR> dro2 = dro;
                final int i2 = i;
                final ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1 showkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1
                    @Override // o.drM
                    /* renamed from: b */
                    public final Void invoke(Map.Entry<? extends String, ? extends List<? extends Object>> entry) {
                        return null;
                    }
                };
                lazyListScope.items(U.size(), null, new drM<Integer, Object>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Object invoke(Integer num) {
                        return a(num.intValue());
                    }

                    public final Object a(int i3) {
                        return drM.this.invoke(U.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        d(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return dpR.c;
                    }

                    public final void d(LazyItemScope lazyItemScope, int i3, Composer composer2, int i4) {
                        int i5;
                        C8632dsu.c((Object) lazyItemScope, "");
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer2.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) != 146 || !composer2.getSkipping()) {
                            Map.Entry entry = (Map.Entry) U.get(i3);
                            final String str = (String) entry.getKey();
                            String str2 = str + " (" + V.e((List) entry.getValue()) + ")";
                            composer2.startReplaceableGroup(1618982084);
                            boolean changed = composer2.changed(mutableState2);
                            boolean changed2 = composer2.changed(str);
                            boolean changed3 = composer2.changed(dro2);
                            Object rememberedValue = composer2.rememberedValue();
                            if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
                                final MutableState mutableState3 = mutableState2;
                                final drO dro3 = dro2;
                                rememberedValue = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$1$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // o.drO
                                    public /* synthetic */ dpR invoke() {
                                        d();
                                        return dpR.c;
                                    }

                                    public final void d() {
                                        MutableState<D> mutableState4 = mutableState3;
                                        final String str3 = str;
                                        H.b(mutableState4, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // o.drM
                                            /* renamed from: b */
                                            public final D invoke(D d) {
                                                C8632dsu.c((Object) d, "");
                                                return D.e(d, str3, null, null, null, false, null, 14, null);
                                            }
                                        });
                                        dro3.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            K.e(str2, (drO) rememberedValue, composer2, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }));
            }
        }, startRestartGroup, 0, PrivateKeyType.INVALID);
        G.b(new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                S.d(mutableState, navHostController);
            }
        }, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void e(Composer composer2, int i2) {
                V.e(map, mutableState, navHostController, dro, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final int e(List<?> list) {
        List b;
        C8632dsu.c((Object) list, "");
        b = C8580dqw.b(list, C.class);
        if (!(!b.isEmpty())) {
            return list.size();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (hashSet.add(((C) obj).e())) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.util.Map<java.lang.String, java.util.List<T>> e(java.util.Map<java.lang.String, ? extends java.util.List<? extends T>> r4, androidx.compose.runtime.MutableState<o.D> r5) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            java.lang.Object r0 = r5.getValue()
            o.D r0 = (o.D) r0
            boolean r0 = r0.h()
            if (r0 != 0) goto L15
            goto L72
        L15:
            java.lang.Object r1 = r5.getValue()
            o.D r1 = (o.D) r1
            java.lang.String r1 = r1.e()
            r2 = 1
            if (r1 == 0) goto L2b
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = r2
        L2c:
            r1 = r1 ^ r2
            if (r0 != r1) goto L72
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r5.getValue()
            o.D r2 = (o.D) r2
            java.lang.String r2 = r2.e()
            o.C8632dsu.d(r2)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String[] r3 = new java.lang.String[]{r3}
            boolean r2 = o.T.e(r2, r3)
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L3c
        L71:
            r4 = r0
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.V.e(java.util.Map, androidx.compose.runtime.MutableState):java.util.Map");
    }

    public static final void d(final Map<String, ? extends List<C>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(-220559280);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-220559280, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentGroupsScreen (ShowkaseGroupsScreen.kt:79)");
        }
        e(map, mutableState, navHostController, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseComponentGroupsScreen$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                P.e(NavHostController.this, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP);
            }
        }, startRestartGroup, (i & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseComponentGroupsScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void e(Composer composer2, int i2) {
                V.d(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void b(final Map<String, ? extends List<A>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(1542709814);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1542709814, i, -1, "com.airbnb.android.showkase.ui.ShowkaseColorGroupsScreen (ShowkaseGroupsScreen.kt:94)");
        }
        e(map, mutableState, navHostController, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseColorGroupsScreen$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                P.e(NavHostController.this, ShowkaseCurrentScreen.COLORS_IN_A_GROUP);
            }
        }, startRestartGroup, (i & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseColorGroupsScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void c(Composer composer2, int i2) {
                V.b(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void e(final Map<String, ? extends List<F>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(946867784);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(946867784, i, -1, "com.airbnb.android.showkase.ui.ShowkaseTypographyGroupsScreen (ShowkaseGroupsScreen.kt:109)");
        }
        if (map.size() == 1) {
            startRestartGroup.startReplaceableGroup(-1768702573);
            H.b(mutableState, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final D invoke(D d) {
                    Object E;
                    C8632dsu.c((Object) d, "");
                    E = C8576dqs.E(map.entrySet());
                    return D.e(d, (String) ((Map.Entry) E).getKey(), null, null, null, false, null, 62, null);
                }
            });
            Y.c(map, mutableState, navHostController, startRestartGroup, (i & 112) | 520);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1768702172);
            e(map, mutableState, navHostController, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$2
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    P.e(NavHostController.this, ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP);
                }
            }, startRestartGroup, (i & 112) | 520);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void d(Composer composer2, int i2) {
                V.e(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }
        });
    }
}
