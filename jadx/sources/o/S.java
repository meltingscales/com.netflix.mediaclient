package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavHostController;
import com.airbnb.android.showkase.models.ShowkaseCategory;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C8576dqs;
import o.C8632dsu;
import o.C8672dug;
import o.D;
import o.H;
import o.InterfaceC8613dsb;
import o.K;
import o.P;
import o.S;
import o.dpR;
import o.drM;
import o.drO;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class S {
    public static final void a(final MutableState<D> mutableState, final NavHostController navHostController, final Map<ShowkaseCategory, Integer> map, Composer composer, final int i) {
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) map, "");
        Composer startRestartGroup = composer.startRestartGroup(-1029290343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1029290343, i, -1, "com.airbnb.android.showkase.ui.ShowkaseCategoriesScreen (ShowkaseCategoriesScreen.kt:18)");
        }
        Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        C8632dsu.d(consume);
        final AppCompatActivity appCompatActivity = (AppCompatActivity) consume;
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new drM<LazyListScope, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                a(lazyListScope);
                return dpR.c;
            }

            public final void a(LazyListScope lazyListScope) {
                final List U;
                C8632dsu.c((Object) lazyListScope, "");
                U = C8576dqs.U(map.entrySet());
                final MutableState<D> mutableState2 = mutableState;
                final NavHostController navHostController2 = navHostController;
                final ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1 showkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1
                    @Override // o.drM
                    /* renamed from: b */
                    public final Void invoke(Map.Entry<? extends ShowkaseCategory, ? extends Integer> entry) {
                        return null;
                    }
                };
                lazyListScope.items(U.size(), null, new drM<Integer, Object>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Object invoke(Integer num) {
                        return a(num.intValue());
                    }

                    public final Object a(int i2) {
                        return drM.this.invoke(U.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$4
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
                        String d;
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
                            Map.Entry entry = (Map.Entry) U.get(i2);
                            final ShowkaseCategory showkaseCategory = (ShowkaseCategory) entry.getKey();
                            int intValue = ((Number) entry.getValue()).intValue();
                            Locale locale = Locale.getDefault();
                            String name = showkaseCategory.name();
                            C8632dsu.a(locale, "");
                            String lowerCase = name.toLowerCase(locale);
                            C8632dsu.a(lowerCase, "");
                            if (lowerCase.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                d = C8672dug.d(lowerCase.charAt(0), locale);
                                sb.append((Object) d);
                                String substring = lowerCase.substring(1);
                                C8632dsu.a(substring, "");
                                sb.append(substring);
                                lowerCase = sb.toString();
                            }
                            String str = lowerCase + " (" + intValue + ")";
                            final MutableState mutableState3 = mutableState2;
                            final NavHostController navHostController3 = navHostController2;
                            K.e(str, new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$1$1

                                /* loaded from: classes5.dex */
                                public final /* synthetic */ class d {
                                    public static final /* synthetic */ int[] a;

                                    static {
                                        int[] iArr = new int[ShowkaseCategory.values().length];
                                        iArr[ShowkaseCategory.COMPONENTS.ordinal()] = 1;
                                        iArr[ShowkaseCategory.COLORS.ordinal()] = 2;
                                        iArr[ShowkaseCategory.TYPOGRAPHY.ordinal()] = 3;
                                        a = iArr;
                                    }
                                }

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
                                    H.b(mutableState3, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$1$1.1
                                        @Override // o.drM
                                        /* renamed from: d */
                                        public final D invoke(D d2) {
                                            C8632dsu.c((Object) d2, "");
                                            return D.e(d2, null, null, null, null, false, null, 14, null);
                                        }
                                    });
                                    int i5 = d.a[showkaseCategory.ordinal()];
                                    if (i5 == 1) {
                                        P.e(navHostController3, ShowkaseCurrentScreen.COMPONENT_GROUPS);
                                    } else if (i5 == 2) {
                                        P.e(navHostController3, ShowkaseCurrentScreen.COLOR_GROUPS);
                                    } else if (i5 != 3) {
                                    } else {
                                        P.e(navHostController3, ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS);
                                    }
                                }
                            }, composer2, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }));
            }
        }, startRestartGroup, 0, PrivateKeyType.INVALID);
        G.b(new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                S.a(AppCompatActivity.this, mutableState);
            }
        }, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(Composer composer2, int i2) {
                S.a(mutableState, navHostController, map, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                a(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AppCompatActivity appCompatActivity, MutableState<D> mutableState) {
        if (mutableState.getValue().h()) {
            H.c(mutableState);
        } else {
            appCompatActivity.finish();
        }
    }

    public static final void d(MutableState<D> mutableState, NavHostController navHostController) {
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        if (mutableState.getValue().h()) {
            H.c(mutableState);
            return;
        }
        H.d(mutableState);
        P.e(navHostController, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES);
    }
}
