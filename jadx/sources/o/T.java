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
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import o.C;
import o.C8632dsu;
import o.D;
import o.H;
import o.InterfaceC8613dsb;
import o.K;
import o.P;
import o.T;
import o.dpR;
import o.drM;
import o.drO;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class T {
    public static final void b(final Map<String, ? extends List<C>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        final List c;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(-627798939);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-627798939, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreen (ShowkaseComponentStylesScreen.kt:14)");
        }
        List<C> list = map.get(mutableState.getValue().c());
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (C8632dsu.c((Object) ((C) obj).e(), (Object) mutableState.getValue().b())) {
                    arrayList.add(obj);
                }
            }
            c = C8576dqs.c((Iterable) arrayList, new Comparator() { // from class: o.X
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int d;
                    d = T.d((C) obj2, (C) obj3);
                    return d;
                }
            });
            if (c != null) {
                final List<C> c2 = c(c, mutableState);
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new drM<LazyListScope, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return dpR.c;
                    }

                    public final void b(LazyListScope lazyListScope) {
                        C8632dsu.c((Object) lazyListScope, "");
                        final List<C> list2 = c2;
                        final List<C> list3 = c;
                        final MutableState<D> mutableState2 = mutableState;
                        final NavHostController navHostController2 = navHostController;
                        final ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1 showkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1
                            @Override // o.drM
                            /* renamed from: d */
                            public final Void invoke(C c3) {
                                return null;
                            }
                        };
                        lazyListScope.items(list2.size(), null, new drM<Integer, Object>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ Object invoke(Integer num) {
                                return d(num.intValue());
                            }

                            public final Object d(int i2) {
                                return drM.this.invoke(list2.get(i2));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // o.InterfaceC8613dsb
                            public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                e(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                return dpR.c;
                            }

                            public final void e(LazyItemScope lazyItemScope, int i2, Composer composer2, int i3) {
                                int i4;
                                String b;
                                C8632dsu.c((Object) lazyItemScope, "");
                                if ((i3 & 14) == 0) {
                                    i4 = (composer2.changed(lazyItemScope) ? 4 : 2) | i3;
                                } else {
                                    i4 = i3;
                                }
                                if ((i3 & 112) == 0) {
                                    i4 |= composer2.changed(i2) ? 32 : 16;
                                }
                                if ((i4 & 731) != 146 || !composer2.getSkipping()) {
                                    final C c3 = (C) list2.get(i2);
                                    int i5 = (i4 & 14) | (composer2.changed(c3) ? 32 : 16);
                                    if ((i5 & 721) != 144 || !composer2.getSkipping()) {
                                        b = T.b(c3.g(), list3.size());
                                        String e = c3.e();
                                        K.c(e + " " + b, composer2, 0);
                                        final MutableState mutableState3 = mutableState2;
                                        final NavHostController navHostController3 = navHostController2;
                                        K.d(c3, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // o.drO
                                            public /* synthetic */ dpR invoke() {
                                                b();
                                                return dpR.c;
                                            }

                                            public final void b() {
                                                MutableState<D> mutableState4 = mutableState3;
                                                final C c4 = c3;
                                                H.b(mutableState4, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // o.drM
                                                    /* renamed from: d */
                                                    public final D invoke(D d) {
                                                        C8632dsu.c((Object) d, "");
                                                        return D.e(d, null, C.this.e(), C.this.g(), C.this.c(), false, null, 33, null);
                                                    }
                                                });
                                                P.e(navHostController3, ShowkaseCurrentScreen.COMPONENT_DETAIL);
                                            }
                                        }, composer2, (i5 >> 3) & 14, 0);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                    }
                }, startRestartGroup, 0, PrivateKeyType.INVALID);
                G.b(new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }

                    public final void b() {
                        T.e(mutableState, navHostController);
                    }
                }, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(Composer composer2, int i2) {
                        T.b(map, mutableState, navHostController, composer2, i | 1);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        b(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$componentStylesList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void d(Composer composer2, int i2) {
                T.b(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C c, C c2) {
        if (c.i()) {
            return -1;
        }
        if (c2.i()) {
            return 1;
        }
        String g = c.g();
        if (g == null) {
            g = "";
        }
        String g2 = c2.g();
        return g.compareTo(g2 != null ? g2 : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str, int i) {
        if (str == null || str.length() == 0) {
            return i == 1 ? "[Default Style]" : "";
        }
        return "[" + str + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<D> mutableState, NavHostController navHostController) {
        if (mutableState.getValue().h()) {
            H.c(mutableState);
            return;
        }
        H.b(mutableState, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$back$1
            @Override // o.drM
            /* renamed from: d */
            public final D invoke(D d) {
                C8632dsu.c((Object) d, "");
                return D.e(d, null, null, null, null, false, null, 11, null);
            }
        });
        P.e(navHostController, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List<o.C> c(java.util.List<o.C> r8, androidx.compose.runtime.MutableState<o.D> r9) {
        /*
            java.lang.Object r0 = r9.getValue()
            o.D r0 = (o.D) r0
            boolean r0 = r0.h()
            if (r0 != 0) goto Ld
            goto L69
        Ld:
            java.lang.Object r1 = r9.getValue()
            o.D r1 = (o.D) r1
            java.lang.String r1 = r1.e()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = r2
            goto L25
        L24:
            r1 = r3
        L25:
            r1 = r1 ^ r3
            if (r0 != r1) goto L69
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L31:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            r4 = r1
            o.C r4 = (o.C) r4
            java.lang.Object r5 = r9.getValue()
            o.D r5 = (o.D) r5
            java.lang.String r5 = r5.e()
            o.C8632dsu.d(r5)
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = r4.e()
            r6[r2] = r7
            java.lang.String r4 = r4.g()
            if (r4 != 0) goto L5c
            java.lang.String r4 = ""
        L5c:
            r6[r3] = r4
            boolean r4 = e(r5, r6)
            if (r4 == 0) goto L31
            r0.add(r1)
            goto L31
        L68:
            r8 = r0
        L69:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.T.c(java.util.List, androidx.compose.runtime.MutableState):java.util.List");
    }

    public static final boolean e(String str, String... strArr) {
        boolean e;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) strArr, "");
        for (String str2 : strArr) {
            e = duD.e((CharSequence) str2, (CharSequence) str, true);
            if (e) {
                return true;
            }
        }
        return false;
    }
}
