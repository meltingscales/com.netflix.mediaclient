package com.netflix.mediaclient.ui.commander.impl.ui.modes.language;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ListItemKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C1020Ln;
import o.C1292Wb;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.KK;
import o.VI;
import o.VR;
import o.bCO;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class AudioSubtitlesSheetKt$AudioSubtitlesSheet$2 extends Lambda implements drX<Composer, Integer, dpR> {
    final /* synthetic */ drM<ControllerScreen.e, dpR> a;
    final /* synthetic */ drM<Integer, dpR> c;
    final /* synthetic */ AudioSubtitlesScreen.e d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioSubtitlesSheetKt$AudioSubtitlesSheet$2(AudioSubtitlesScreen.e eVar, int i, drM<? super Integer, dpR> drm, drM<? super ControllerScreen.e, dpR> drm2) {
        super(2);
        this.d = eVar;
        this.e = i;
        this.c = drm;
        this.a = drm2;
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
        a(composer, num.intValue());
        return dpR.c;
    }

    public final void a(Composer composer, int i) {
        final List j;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074682519, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheet.<anonymous> (AudioSubtitlesSheet.kt:67)");
            }
            AudioSubtitlesScreen.e eVar = this.d;
            if (eVar instanceof AudioSubtitlesScreen.e.C0056e) {
                composer.startReplaceableGroup(-467550461);
                bCO.a(this.e, this.c, this.a, null, composer, 0, 8);
                composer.endReplaceableGroup();
            } else if (eVar instanceof AudioSubtitlesScreen.e.a) {
                composer.startReplaceableGroup(-467550175);
                VR d = ((AudioSubtitlesScreen.e.a) this.d).e().d();
                List<VI> b = ((AudioSubtitlesScreen.e.a) this.d).e().b();
                List<C1292Wb> c = ((AudioSubtitlesScreen.e.a) this.d).e().c();
                composer.startReplaceableGroup(-467549911);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(d, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                composer.endReplaceableGroup();
                j = C8569dql.j(b, c);
                final int i2 = this.e;
                drM<Integer, dpR> drm = this.c;
                final drM<ControllerScreen.e, dpR> drm2 = this.a;
                bCO.a(i2, drm, drm2, ComposableLambdaKt.composableLambda(composer, 997488009, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                                ComposerKt.traceEventStart(997488009, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheet.<anonymous>.<anonymous> (AudioSubtitlesSheet.kt:92)");
                            }
                            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m2492constructorimpl(22), 0.0f, 0.0f, 13, null);
                            Arrangement.HorizontalOrVertical m230spacedBy0680j_4 = Arrangement.INSTANCE.m230spacedBy0680j_4(Dp.m2492constructorimpl(20));
                            Alignment.Horizontal start = Alignment.Companion.getStart();
                            final List<List<Object>> list = j;
                            final int i4 = i2;
                            final MutableState<VR> mutableState2 = mutableState;
                            final drM<ControllerScreen.e, dpR> drm3 = drm2;
                            LazyDslKt.LazyColumn(m277paddingqDBjuR0$default, null, null, false, m230spacedBy0680j_4, start, null, false, new drM<LazyListScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt.AudioSubtitlesSheet.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    final List<Object> list2 = list.get(i4);
                                    final MutableState<VR> mutableState3 = mutableState2;
                                    final drM<ControllerScreen.e, dpR> drm4 = drm3;
                                    final AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$invoke$$inlined$items$default$1 audioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$invoke$$inlined$items$default$1
                                        @Override // o.drM
                                        /* renamed from: b */
                                        public final Void invoke(Object obj) {
                                            return null;
                                        }
                                    };
                                    lazyListScope.items(list2.size(), null, new drM<Integer, Object>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$invoke$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // o.drM
                                        public /* synthetic */ Object invoke(Integer num) {
                                            return c(num.intValue());
                                        }

                                        public final Object c(int i5) {
                                            return drM.this.invoke(list2.get(i5));
                                        }
                                    }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$invoke$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // o.InterfaceC8613dsb
                                        public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                            d(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                            return dpR.c;
                                        }

                                        public final void d(LazyItemScope lazyItemScope, int i5, Composer composer3, int i6) {
                                            int i7;
                                            VR d2;
                                            VR d3;
                                            if ((i6 & 14) == 0) {
                                                i7 = i6 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i7 = i6;
                                            }
                                            if ((i6 & 112) == 0) {
                                                i7 |= composer3.changed(i5) ? 32 : 16;
                                            }
                                            if ((i7 & 731) == 146 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-632812321, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                            }
                                            final Object obj = list2.get(i5);
                                            if (obj instanceof VI) {
                                                composer3.startReplaceableGroup(1139025055);
                                                d3 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState3);
                                                final boolean c2 = C8632dsu.c((Object) d3.e(), (Object) ((VI) obj).b());
                                                Modifier.Companion companion = Modifier.Companion;
                                                final drM drm5 = drm4;
                                                final MutableState mutableState4 = mutableState3;
                                                ListItemKt.ListItem(ClickableKt.m130clickableXHw0xAI$default(companion, false, null, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$1$1
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // o.drO
                                                    public /* synthetic */ dpR invoke() {
                                                        d();
                                                        return dpR.c;
                                                    }

                                                    public final void d() {
                                                        VR d4;
                                                        VR d5;
                                                        MutableState<VR> mutableState5 = mutableState4;
                                                        String b2 = ((VI) obj).b();
                                                        d4 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState4);
                                                        AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.e(mutableState5, new VR(b2, d4.a()));
                                                        drM<ControllerScreen.e, dpR> drm6 = drm5;
                                                        d5 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState4);
                                                        drm6.invoke(new ControllerScreen.e.D(d5));
                                                    }
                                                }, 7, null), null, null, false, null, null, ComposableLambdaKt.composableLambda(composer3, -1395570078, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$1$2
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // o.drX
                                                    public /* synthetic */ dpR invoke(Composer composer4, Integer num) {
                                                        e(composer4, num.intValue());
                                                        return dpR.c;
                                                    }

                                                    public final void e(Composer composer4, int i8) {
                                                        Token.Typography typography;
                                                        if ((i8 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1395570078, i8, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioSubtitlesSheet.kt:102)");
                                                            }
                                                            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                                            boolean z = c2;
                                                            Object obj2 = obj;
                                                            composer4.startReplaceableGroup(693286680);
                                                            Modifier.Companion companion2 = Modifier.Companion;
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start2, centerVertically, composer4, 54);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                            drO<ComposeUiNode> constructor = companion3.getConstructor();
                                                            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer m1009constructorimpl = Updater.m1009constructorimpl(composer4);
                                                            Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            if (z) {
                                                                composer4.startReplaceableGroup(-1229252772);
                                                                KK.c(HawkinsIcon.aP.e, null, null, null, null, Token.Color.cW.c, composer4, 196662, 28);
                                                                composer4.endReplaceableGroup();
                                                            } else {
                                                                composer4.startReplaceableGroup(-1229252340);
                                                                SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion2, Dp.m2492constructorimpl(24)), composer4, 6);
                                                                composer4.endReplaceableGroup();
                                                            }
                                                            SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion2, Dp.m2492constructorimpl(12)), composer4, 6);
                                                            String e = ((VI) obj2).e();
                                                            if (z) {
                                                                typography = Token.Typography.C0693f.b;
                                                            } else {
                                                                typography = Token.Typography.C0694g.e;
                                                            }
                                                            C1020Ln.c(e, (Modifier) null, (Token.Color) Token.Color.cW.c, (Theme) null, typography, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m2458getEllipsisgIe3tQ8(), false, 0, 2, (drM<? super TextLayoutResult, dpR>) null, composer4, 805306752, 384, 11754);
                                                            composer4.endReplaceableGroup();
                                                            composer4.endNode();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 1572864, 62);
                                                composer3.endReplaceableGroup();
                                            } else if (obj instanceof C1292Wb) {
                                                composer3.startReplaceableGroup(1139027854);
                                                d2 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState3);
                                                final boolean c3 = C8632dsu.c((Object) d2.a(), (Object) ((C1292Wb) obj).d());
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                final drM drm6 = drm4;
                                                final MutableState mutableState5 = mutableState3;
                                                ListItemKt.ListItem(ClickableKt.m130clickableXHw0xAI$default(companion2, false, null, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$1$3
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // o.drO
                                                    public /* synthetic */ dpR invoke() {
                                                        b();
                                                        return dpR.c;
                                                    }

                                                    public final void b() {
                                                        VR d4;
                                                        VR d5;
                                                        MutableState<VR> mutableState6 = mutableState5;
                                                        d4 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState6);
                                                        AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.e(mutableState6, new VR(d4.e(), ((C1292Wb) obj).d()));
                                                        drM<ControllerScreen.e, dpR> drm7 = drm6;
                                                        d5 = AudioSubtitlesSheetKt$AudioSubtitlesSheet$2.d(mutableState5);
                                                        drm7.invoke(new ControllerScreen.e.C(d5));
                                                    }
                                                }, 7, null), null, null, false, null, null, ComposableLambdaKt.composableLambda(composer3, -1664065141, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheetKt$AudioSubtitlesSheet$2$1$1$1$4
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // o.drX
                                                    public /* synthetic */ dpR invoke(Composer composer4, Integer num) {
                                                        b(composer4, num.intValue());
                                                        return dpR.c;
                                                    }

                                                    public final void b(Composer composer4, int i8) {
                                                        Token.Typography typography;
                                                        if ((i8 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1664065141, i8, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.AudioSubtitlesSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioSubtitlesSheet.kt:145)");
                                                            }
                                                            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                                            boolean z = c3;
                                                            Object obj2 = obj;
                                                            composer4.startReplaceableGroup(693286680);
                                                            Modifier.Companion companion3 = Modifier.Companion;
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start2, centerVertically, composer4, 54);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                            drO<ComposeUiNode> constructor = companion4.getConstructor();
                                                            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer m1009constructorimpl = Updater.m1009constructorimpl(composer4);
                                                            Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion4.getSetMeasurePolicy());
                                                            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            if (z) {
                                                                composer4.startReplaceableGroup(-1229249969);
                                                                KK.c(HawkinsIcon.aP.e, null, null, null, null, Token.Color.cW.c, composer4, 196662, 28);
                                                                composer4.endReplaceableGroup();
                                                            } else {
                                                                composer4.startReplaceableGroup(-1229249537);
                                                                SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion3, Dp.m2492constructorimpl(24)), composer4, 6);
                                                                composer4.endReplaceableGroup();
                                                            }
                                                            SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion3, Dp.m2492constructorimpl(12)), composer4, 6);
                                                            String c4 = ((C1292Wb) obj2).c();
                                                            if (z) {
                                                                typography = Token.Typography.C0693f.b;
                                                            } else {
                                                                typography = Token.Typography.C0694g.e;
                                                            }
                                                            C1020Ln.c(c4, (Modifier) null, (Token.Color) Token.Color.cW.c, (Theme) null, typography, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m2458getEllipsisgIe3tQ8(), false, 0, 2, (drM<? super TextLayoutResult, dpR>) null, composer4, 805306752, 384, 11754);
                                                            composer4.endReplaceableGroup();
                                                            composer4.endNode();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 1572864, 62);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(1139030618);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                }
                            }, composer2, 221190, 206);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-467543471);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VR d(MutableState<VR> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<VR> mutableState, VR vr) {
        mutableState.setValue(vr);
    }
}
