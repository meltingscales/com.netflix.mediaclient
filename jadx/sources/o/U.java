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
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C;
import o.C8632dsu;
import o.D;
import o.H;
import o.InterfaceC8613dsb;
import o.K;
import o.P;
import o.U;
import o.dpR;
import o.drM;
import o.drO;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class U {
    public static final void c(final Map<String, ? extends List<C>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        int d;
        Object obj;
        Object y;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(1292251161);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1292251161, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreen (ShowkaseComponentsInAGroupScreen.kt:16)");
        }
        List<C> list = map.get(mutableState.getValue().c());
        if (list == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$groupByComponentName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i2) {
                    U.c(map, mutableState, navHostController, composer2, i | 1);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String e = ((C) obj2).e();
            Object obj3 = linkedHashMap.get(e);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(e, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection<List> values = linkedHashMap.values();
        d = C8572dqo.d(values, 10);
        ArrayList arrayList = new ArrayList(d);
        for (List list2 : values) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C) obj).i()) {
                    break;
                }
            }
            C c = (C) obj;
            if (c == null) {
                y = C8576dqs.y(list2);
                c = (C) y;
            }
            arrayList.add(c);
        }
        final List<C> b = b(arrayList, mutableState);
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new drM<LazyListScope, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                d(lazyListScope);
                return dpR.c;
            }

            public final void d(LazyListScope lazyListScope) {
                C8632dsu.c((Object) lazyListScope, "");
                final List<C> list3 = b;
                final MutableState<D> mutableState2 = mutableState;
                final NavHostController navHostController2 = navHostController;
                final ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$invoke$$inlined$items$default$1 showkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$invoke$$inlined$items$default$1
                    @Override // o.drM
                    /* renamed from: d */
                    public final Void invoke(C c2) {
                        return null;
                    }
                };
                lazyListScope.items(list3.size(), null, new drM<Integer, Object>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Object invoke(Integer num) {
                        return e(num.intValue());
                    }

                    public final Object e(int i2) {
                        return drM.this.invoke(list3.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        a(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return dpR.c;
                    }

                    public final void a(LazyItemScope lazyItemScope, int i2, Composer composer2, int i3) {
                        int i4;
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
                            final C c2 = (C) list3.get(i2);
                            int i5 = (i4 & 14) | (composer2.changed(c2) ? 32 : 16);
                            if ((i5 & 721) != 144 || !composer2.getSkipping()) {
                                K.c(c2.e(), composer2, 0);
                                final MutableState mutableState3 = mutableState2;
                                final NavHostController navHostController3 = navHostController2;
                                K.d(c2, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // o.drO
                                    public /* synthetic */ dpR invoke() {
                                        e();
                                        return dpR.c;
                                    }

                                    public final void e() {
                                        MutableState<D> mutableState4 = mutableState3;
                                        final C c3 = c2;
                                        H.b(mutableState4, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$1$1$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // o.drM
                                            /* renamed from: a */
                                            public final D invoke(D d2) {
                                                C8632dsu.c((Object) d2, "");
                                                return D.e(d2, null, C.this.e(), C.this.g(), C.this.c(), false, null, 33, null);
                                            }
                                        });
                                        P.e(navHostController3, ShowkaseCurrentScreen.COMPONENT_STYLES);
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
        G.b(new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                U.c(mutableState, navHostController);
            }
        }, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentsInAGroupScreenKt$ShowkaseComponentsInAGroupScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void d(Composer composer2, int i2) {
                U.c(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<D> mutableState, NavHostController navHostController) {
        if (mutableState.getValue().h()) {
            H.c(mutableState);
            return;
        }
        H.d(mutableState);
        P.e(navHostController, ShowkaseCurrentScreen.COMPONENT_GROUPS);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List<o.C> b(java.util.List<o.C> r4, androidx.compose.runtime.MutableState<o.D> r5) {
        /*
            java.lang.Object r0 = r5.getValue()
            o.D r0 = (o.D) r0
            boolean r0 = r0.h()
            if (r0 != 0) goto Ld
            goto L5d
        Ld:
            java.lang.Object r1 = r5.getValue()
            o.D r1 = (o.D) r1
            java.lang.String r1 = r1.e()
            r2 = 1
            if (r1 == 0) goto L23
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = r2
        L24:
            r1 = r1 ^ r2
            if (r0 != r1) goto L5d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r4.next()
            r2 = r1
            o.C r2 = (o.C) r2
            java.lang.Object r3 = r5.getValue()
            o.D r3 = (o.D) r3
            java.lang.String r3 = r3.e()
            o.C8632dsu.d(r3)
            java.lang.String r2 = r2.e()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            boolean r2 = o.T.e(r3, r2)
            if (r2 == 0) goto L30
            r0.add(r1)
            goto L30
        L5c:
            r4 = r0
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.U.b(java.util.List, androidx.compose.runtime.MutableState):java.util.List");
    }
}
