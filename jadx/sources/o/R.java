package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Base64;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavHostController;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.C;
import o.C8566dqi;
import o.C8632dsu;
import o.C8691duz;
import o.C9919z;
import o.D;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.K;
import o.M;
import o.R;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class R {
    private static int a = 0x00000001;
    private static int e = 0x00000000;
    private static byte e$ss2$221 = 24;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static final void a(final Map<String, ? extends List<C>> map, final MutableState<D> mutableState, final NavHostController navHostController, Composer composer, final int i) {
        Object obj;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) navHostController, "");
        Composer startRestartGroup = composer.startRestartGroup(1434288519);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1434288519, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreen (ShowkaseComponentDetailScreen.kt:56)");
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$componentMetadataList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    R.a(map, mutableState, navHostController, composer2, i | 1);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((C) obj).c(), (Object) mutableState.getValue().d())) {
                break;
            }
        }
        final C c = (C) obj;
        if (c == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 == null) {
                return;
            }
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$componentMetadata$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i2) {
                    R.a(map, mutableState, navHostController, composer2, i | 1);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
            return;
        }
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "ShowkaseComponentDetailList");
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(c);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drM<LazyListScope, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1

                /* loaded from: classes5.dex */
                public final /* synthetic */ class b {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[ShowkaseComponentCardType.values().length];
                        iArr[ShowkaseComponentCardType.BASIC.ordinal()] = 1;
                        iArr[ShowkaseComponentCardType.FONT_SCALE.ordinal()] = 2;
                        iArr[ShowkaseComponentCardType.DISPLAY_SCALED.ordinal()] = 3;
                        iArr[ShowkaseComponentCardType.RTL.ordinal()] = 4;
                        iArr[ShowkaseComponentCardType.DARK_MODE.ordinal()] = 5;
                        a = iArr;
                    }
                }

                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                    d(lazyListScope);
                    return dpR.c;
                }

                public final void d(LazyListScope lazyListScope) {
                    final List e2;
                    C8632dsu.c((Object) lazyListScope, "");
                    e2 = C8566dqi.e(C.this);
                    final ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1$invoke$$inlined$items$default$1 showkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1$invoke$$inlined$items$default$1
                        @Override // o.drM
                        /* renamed from: e */
                        public final Void invoke(C c2) {
                            return null;
                        }
                    };
                    lazyListScope.items(e2.size(), null, new drM<Integer, Object>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1$invoke$$inlined$items$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ Object invoke(Integer num) {
                            return b(num.intValue());
                        }

                        public final Object b(int i2) {
                            return drM.this.invoke(e2.get(i2));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1$invoke$$inlined$items$default$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // o.InterfaceC8613dsb
                        public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                            b(lazyItemScope, num.intValue(), composer2, num2.intValue());
                            return dpR.c;
                        }

                        public final void b(LazyItemScope lazyItemScope, int i2, Composer composer2, int i3) {
                            boolean g;
                            C8632dsu.c((Object) lazyItemScope, "");
                            int i4 = (i3 & 14) == 0 ? (composer2.changed(lazyItemScope) ? 4 : 2) | i3 : i3;
                            if ((i3 & 112) == 0) {
                                i4 |= composer2.changed(i2) ? 32 : 16;
                            }
                            if ((i4 & 731) != 146 || !composer2.getSkipping()) {
                                C c2 = (C) e2.get(i2);
                                int i5 = (i4 & 14) | (composer2.changed(c2) ? 32 : 16);
                                if ((i5 & 721) != 144 || !composer2.getSkipping()) {
                                    for (ShowkaseComponentCardType showkaseComponentCardType : ShowkaseComponentCardType.values()) {
                                        int i6 = ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$1$1.b.a[showkaseComponentCardType.ordinal()];
                                        if (i6 == 1) {
                                            composer2.startReplaceableGroup(-252925743);
                                            composer2.startReplaceableGroup(-252925713);
                                            g = C8691duz.g(c2.b());
                                            if (!g) {
                                                R.e(c2.b(), composer2, 0);
                                            }
                                            composer2.endReplaceableGroup();
                                            R.h(c2, composer2, (i5 >> 3) & 14);
                                            composer2.endReplaceableGroup();
                                        } else if (i6 == 2) {
                                            composer2.startReplaceableGroup(-252925420);
                                            R.i(c2, composer2, (i5 >> 3) & 14);
                                            composer2.endReplaceableGroup();
                                        } else if (i6 == 3) {
                                            composer2.startReplaceableGroup(-252925318);
                                            R.f(c2, composer2, (i5 >> 3) & 14);
                                            composer2.endReplaceableGroup();
                                        } else if (i6 == 4) {
                                            composer2.startReplaceableGroup(-252925170);
                                            R.g(c2, composer2, (i5 >> 3) & 14);
                                            composer2.endReplaceableGroup();
                                        } else if (i6 == 5) {
                                            composer2.startReplaceableGroup(-252925080);
                                            R.j(c2, composer2, (i5 >> 3) & 14);
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-252925027);
                                            composer2.endReplaceableGroup();
                                        }
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LazyDslKt.LazyColumn(testTag, null, null, false, null, null, null, false, rememberedValue, startRestartGroup, 6, 254);
        G.b(new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$2
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
                R.c(mutableState, navHostController);
            }
        }, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
        if (endRestartGroup3 == null) {
            return;
        }
        endRestartGroup3.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(Composer composer2, int i2) {
                R.a(map, mutableState, navHostController, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                b(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final String str, Composer composer, final int i) {
        int i2;
        String str2;
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(1583735985);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1583735985, i2, -1, "com.airbnb.android.showkase.ui.DocumentationPanel (ShowkaseComponentDetailScreen.kt:98)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            Pair<String, ImageVector> e2 = e((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), c(mutableState));
            String b = e2.b();
            ImageVector c = e2.c();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DocumentationPanel$onClick$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final void d() {
                        boolean c2;
                        MutableState<Boolean> mutableState2 = mutableState;
                        c2 = R.c(mutableState2);
                        R.e(mutableState2, !c2);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        d();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            drO dro = (drO) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-270372034);
            if (c(mutableState)) {
                str2 = b;
                composer2 = startRestartGroup;
                TextKt.m698TextfLXpl1I(str, PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, M.e(), M.a(), M.e(), 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new TextStyle(Color.Companion.m1305getDarkGray0d7_KjU(), TextUnitKt.getSp(14), FontWeight.Companion.getW300(), null, null, FontFamily.Companion.getDefault(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262104, null), composer2, i2 & 14, 0, 32764);
            } else {
                str2 = b;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            Modifier m130clickableXHw0xAI$default = ClickableKt.m130clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, M.e(), M.a(), M.e(), 0.0f, 8, null), 0.0f, 1, null), false, null, null, dro, 7, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composer3 = composer2;
            composer3.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
            composer3.startReplaceableGroup(-1323940314);
            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> materializerOf = LayoutKt.materializerOf(m130clickableXHw0xAI$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer m1009constructorimpl = Updater.m1009constructorimpl(composer3);
            Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, density, companion2.getSetDensity());
            Updater.m1013setimpl(m1009constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1013setimpl(m1009constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final String str3 = str2;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, 8).getButton(), ComposableLambdaKt.composableLambda(composer3, -1714000762, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DocumentationPanel$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer4, Integer num) {
                    c(composer4, num.intValue());
                    return dpR.c;
                }

                public final void c(Composer composer4, int i3) {
                    if ((i3 & 11) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1714000762, i3, -1, "com.airbnb.android.showkase.ui.DocumentationPanel.<anonymous>.<anonymous> (ShowkaseComponentDetailScreen.kt:122)");
                        }
                        String str4 = str3;
                        C8632dsu.a(str4, "");
                        TextKt.m698TextfLXpl1I(str4, null, MaterialTheme.INSTANCE.getColors(composer4, 8).m565getPrimary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer4, 0, 0, 65530);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer3, 48);
            IconKt.m611Iconww6aTOc(c, str3, (Modifier) null, 0L, composer3, 0, 12);
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DocumentationPanel$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void e(Composer composer4, int i3) {
                R.e(str, composer4, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer4, Integer num) {
                e(composer4, num.intValue());
                return dpR.c;
            }
        });
    }

    private static final Pair<String, ImageVector> e(Context context, boolean z) {
        String string;
        ImageVector keyboardArrowDown;
        int i = 2 % 2;
        if (z) {
            int i2 = e + 53;
            a = i2 % 128;
            int i3 = i2 % 2;
            string = context.getString(C9919z.a.b);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            keyboardArrowDown = KeyboardArrowUpKt.getKeyboardArrowUp(Icons.Filled.INSTANCE);
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        } else {
            string = context.getString(C9919z.a.a);
            if (string.startsWith("'!#+")) {
                int i4 = e + 93;
                a = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr2 = new Object[1];
                k(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                int i6 = e + 29;
                a = i6 % 128;
                int i7 = i6 % 2;
            }
            keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(Icons.Filled.INSTANCE);
        }
        return dpD.a(string, keyboardArrowDown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final C c, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1109648901);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1109648901, i2, -1, "com.airbnb.android.showkase.ui.BasicComponentCard (ShowkaseComponentDetailScreen.kt:141)");
            }
            String e2 = c.e();
            K.c(e2 + " [Basic Example]", startRestartGroup, 0);
            K.d(c, null, startRestartGroup, i2 & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$BasicComponentCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(Composer composer2, int i3) {
                R.h(C.this, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                a(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final C c, Composer composer, final int i) {
        final int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1318122244);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1318122244, i2, -1, "com.airbnb.android.showkase.ui.FontScaledComponentCard (ShowkaseComponentDetailScreen.kt:147)");
            }
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Density Density = DensityKt.Density(density.getDensity(), density.getFontScale() * 2);
            String e2 = c.e();
            K.c(e2 + " [Font Scaled x 2]", startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{CompositionLocalsKt.getLocalDensity().provides(Density)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1591381956, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$FontScaledComponentCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }

                public final void a(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1591381956, i3, -1, "com.airbnb.android.showkase.ui.FontScaledComponentCard.<anonymous> (ShowkaseComponentDetailScreen.kt:152)");
                    }
                    K.d(C.this, null, composer2, i2 & 14, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$FontScaledComponentCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Composer composer2, int i3) {
                R.i(C.this, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                b(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final C c, Composer composer, final int i) {
        final int i2;
        Composer startRestartGroup = composer.startRestartGroup(-398167917);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-398167917, i2, -1, "com.airbnb.android.showkase.ui.DisplayScaledComponentCard (ShowkaseComponentDetailScreen.kt:158)");
            }
            Density Density$default = DensityKt.Density$default(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity() * 2.0f, 0.0f, 2, null);
            String e2 = c.e();
            K.c(e2 + " [Display Scaled x 2]", startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{CompositionLocalsKt.getLocalDensity().provides(Density$default)}, ComposableLambdaKt.composableLambda(startRestartGroup, -2115222189, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DisplayScaledComponentCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }

                public final void c(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2115222189, i3, -1, "com.airbnb.android.showkase.ui.DisplayScaledComponentCard.<anonymous> (ShowkaseComponentDetailScreen.kt:163)");
                    }
                    K.d(C.this, null, composer2, i2 & 14, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DisplayScaledComponentCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void c(Composer composer2, int i3) {
                R.f(C.this, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final C c, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-362242367);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-362242367, i, -1, "com.airbnb.android.showkase.ui.RTLComponentCard (ShowkaseComponentDetailScreen.kt:169)");
            }
            String e2 = c.e();
            K.c(e2 + " [RTL]", startRestartGroup, 0);
            Modifier.Companion companion = Modifier.Companion;
            final Modifier a2 = a(companion, c);
            CardKt.m556CardFjzlyU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1680166244, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$RTLComponentCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }

                public final void e(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1680166244, i3, -1, "com.airbnb.android.showkase.ui.RTLComponentCard.<anonymous> (ShowkaseComponentDetailScreen.kt:172)");
                        }
                        ProvidedValue[] providedValueArr = {CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl)};
                        final Modifier modifier = Modifier.this;
                        final C c2 = c;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1301118428, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$RTLComponentCard$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // o.drX
                            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                                c(composer3, num.intValue());
                                return dpR.c;
                            }

                            public final void c(Composer composer3, int i4) {
                                if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1301118428, i4, -1, "com.airbnb.android.showkase.ui.RTLComponentCard.<anonymous>.<anonymous> (ShowkaseComponentDetailScreen.kt:173)");
                                    }
                                    Modifier modifier2 = Modifier.this;
                                    C c3 = c2;
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    drO<ComposeUiNode> constructor = companion2.getConstructor();
                                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> materializerOf = LayoutKt.materializerOf(modifier2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer3);
                                    Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1013setimpl(m1009constructorimpl, density, companion2.getSetDensity());
                                    Updater.m1013setimpl(m1009constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m1013setimpl(m1009constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-1163856341);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    c3.a().invoke(composer3, 0);
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$RTLComponentCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void e(Composer composer2, int i3) {
                R.g(C.this, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final C c, Composer composer, final int i) {
        final int i2;
        Composer startRestartGroup = composer.startRestartGroup(207411500);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(c) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(207411500, i2, -1, "com.airbnb.android.showkase.ui.DarkModeComponentCard (ShowkaseComponentDetailScreen.kt:182)");
            }
            Configuration configuration = new Configuration((Configuration) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()));
            configuration.uiMode = 32;
            String e2 = c.e();
            K.c(e2 + " [Dark Mode]", startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(configuration)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1087573100, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DarkModeComponentCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }

                public final void b(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1087573100, i3, -1, "com.airbnb.android.showkase.ui.DarkModeComponentCard.<anonymous> (ShowkaseComponentDetailScreen.kt:187)");
                    }
                    K.d(C.this, null, composer2, i2 & 14, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$DarkModeComponentCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void e(Composer composer2, int i3) {
                R.j(C.this, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final Modifier a(Modifier modifier, final C c) {
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) c, "");
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$generateComposableModifier$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return c(modifier2, composer, num.intValue());
            }

            public final Modifier c(Modifier modifier2, Composer composer, int i) {
                Modifier m300width3ABfNKs;
                C8632dsu.c((Object) modifier2, "");
                composer.startReplaceableGroup(-466752859);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466752859, i, -1, "com.airbnb.android.showkase.ui.generateComposableModifier.<anonymous> (ShowkaseComponentDetailScreen.kt:192)");
                }
                Modifier m299sizeInqDBjuR0$default = SizeKt.m299sizeInqDBjuR0$default(PaddingKt.m273padding3ABfNKs(modifier2, M.e()), 0.0f, 0.0f, 0.0f, Dp.m2492constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp), 7, null);
                if (C.this.j() != null && C.this.f() != null) {
                    m300width3ABfNKs = SizeKt.m297sizeVpY3zN4(m299sizeInqDBjuR0$default, Dp.m2492constructorimpl(C.this.f().intValue()), Dp.m2492constructorimpl(C.this.j().intValue()));
                } else if (C.this.j() != null) {
                    m300width3ABfNKs = SizeKt.m288height3ABfNKs(m299sizeInqDBjuR0$default, Dp.m2492constructorimpl(C.this.j().intValue()));
                } else {
                    m300width3ABfNKs = C.this.f() != null ? SizeKt.m300width3ABfNKs(m299sizeInqDBjuR0$default, Dp.m2492constructorimpl(C.this.f().intValue())) : SizeKt.fillMaxWidth$default(m299sizeInqDBjuR0$default, 0.0f, 1, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m300width3ABfNKs;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<D> mutableState, NavHostController navHostController) {
        H.b(mutableState, new drM<D, D>() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$back$1
            @Override // o.drM
            /* renamed from: e */
            public final D invoke(D d2) {
                C8632dsu.c((Object) d2, "");
                return D.e(d2, null, null, null, null, false, null, 11, null);
            }
        });
        P.e(navHostController, ShowkaseCurrentScreen.COMPONENT_STYLES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$221);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
