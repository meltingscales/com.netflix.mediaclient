package o;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$4;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C8632dsu;
import o.KK;
import o.LA;
import o.cPF;
import o.cPG;
import o.cPM;
import o.cPN;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class cPF {
    public static final void a(final cPN cpn, final String str, final String str2, final String str3, final String str4, final cPI cpi, Modifier modifier, Composer composer, final int i, final int i2) {
        Object B;
        C8632dsu.c((Object) cpn, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) cpi, "");
        Composer startRestartGroup = composer.startRestartGroup(416295605);
        int currentMarker = startRestartGroup.getCurrentMarker();
        Modifier.Companion companion = (i2 & 64) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(416295605, i, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreen (MaturityRatingScreen.kt:56)");
        }
        Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), androidx.compose.ui.unit.Dp.m2492constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion2.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m273padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-2070120600);
        State a = C8983gx.a(cpn, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$ratings$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPM) obj).d();
            }
        }, startRestartGroup, 72);
        State a2 = C8983gx.a(cpn, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$maturityLevel$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPM) obj).e();
            }
        }, startRestartGroup, 72);
        State a3 = C8983gx.a(cpn, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$isPrimaryProfile$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return Boolean.valueOf(((cPM) obj).c());
            }
        }, startRestartGroup, 72);
        State a4 = C8983gx.a(cpn, new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$userOptedInForKids$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return Boolean.valueOf(((cPM) obj).a());
            }
        }, startRestartGroup, 72);
        if (e(a).isEmpty()) {
            startRestartGroup.endToMarker(currentMarker);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final Modifier modifier2 = companion;
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(Composer composer2, int i3) {
                        cPF.a(cPN.this, str, str2, str3, str4, cpi, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        a(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        B = C8576dqs.B((List<? extends Object>) e(a));
        int intValue = ((Number) ((Pair) B).d()).intValue();
        C1020Ln.c(str, (Modifier) null, (Token.Color) Token.Color.C0499df.d, (Theme) null, (Token.Typography) Token.Typography.C0690c.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, ((i >> 3) & 14) | 24960, 0, 16362);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(24)), startRestartGroup, 6);
        String c1333Xq = C1333Xq.d(cPG.b.a).toString();
        C8632dsu.a(c1333Xq, "");
        String c1333Xq2 = C1333Xq.d(cPG.b.c).toString();
        C8632dsu.a(c1333Xq2, "");
        duS a5 = duO.a(e(a));
        Integer b = b(a2);
        a(a5, b != null ? b.intValue() : intValue, str2, str3, str4, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                a(num.intValue());
                return dpR.c;
            }

            public final void a(int i3) {
                cPN.this.b(i3);
                cpi.e();
            }
        }, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$1$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                a(bool.booleanValue());
                return dpR.c;
            }

            public final void a(boolean z) {
                cPN.this.a(z);
            }
        }, c1333Xq, MaturityRatingScreenKt$MaturityRatingScreen$1$4.b, c1333Xq2, d(a3), a(a4), null, startRestartGroup, (i & 896) | (i & 7168) | (57344 & i), 0, 4096);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier3 = companion;
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$MaturityRatingScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    cPF.a(cPN.this, str, str2, str3, str4, cpi, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str) {
        String c1333Xq = C1333Xq.d(cPG.b.h).d("rating", str).toString();
        C8632dsu.a(c1333Xq, "");
        return c1333Xq;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final o.duS<kotlin.Pair<java.lang.Integer, java.lang.String>> r41, final int r42, final java.lang.String r43, final java.lang.String r44, final java.lang.String r45, final o.drM<? super java.lang.Integer, o.dpR> r46, final o.drM<? super java.lang.Boolean, o.dpR> r47, final java.lang.String r48, final o.drM<? super java.lang.String, java.lang.String> r49, final java.lang.String r50, final boolean r51, final boolean r52, androidx.compose.ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPF.a(o.duS, int, java.lang.String, java.lang.String, java.lang.String, o.drM, o.drM, java.lang.String, o.drM, java.lang.String, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(576676107);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576676107, i3, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.RatingBubble (MaturityRatingScreen.kt:217)");
            }
            startRestartGroup.startReplaceableGroup(1281230632);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<AnimatedContentTransitionScope<Boolean>, ContentTransform>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingBubble$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final ContentTransform invoke(AnimatedContentTransitionScope<Boolean> animatedContentTransitionScope) {
                        ContentTransform with;
                        C8632dsu.c((Object) animatedContentTransitionScope, "");
                        if (z) {
                            with = AnimatedContentKt.with(EnterExitTransitionKt.m20scaleInL8ZKhE$default(null, 0.0f, 0L, 7, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.m22scaleOutL8ZKhE$default(null, 0.0f, 0L, 7, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
                        } else {
                            with = AnimatedContentKt.with(EnterTransition.Companion.getNone(), EnterExitTransitionKt.m22scaleOutL8ZKhE$default(null, 0.0f, 0L, 7, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
                        }
                        return animatedContentTransitionScope.using(with, AnimatedContentKt.SizeTransform$default(false, null, 2, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(z), null, (drM) rememberedValue, null, "MaturityPickerAnimation", null, ComposableLambdaKt.composableLambda(startRestartGroup, -164083928, true, new InterfaceC8613dsb<AnimatedContentScope, Boolean, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingBubble$2
                {
                    super(4);
                }

                @Override // o.InterfaceC8613dsb
                public /* synthetic */ dpR invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    b(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return dpR.c;
                }

                public final void b(AnimatedContentScope animatedContentScope, boolean z3, Composer composer2, int i6) {
                    C8632dsu.c((Object) animatedContentScope, "");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-164083928, i6, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.RatingBubble.<anonymous> (MaturityRatingScreen.kt:231)");
                    }
                    if (z3) {
                        composer2.startReplaceableGroup(-1104045115);
                        KK.c(HawkinsIcon.aY.e, null, SizeKt.m295size3ABfNKs(Modifier.this, Dp.m2492constructorimpl(24)), null, null, Token.Color.C0521eb.b, composer2, 196662, 24);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1104044860);
                        CanvasKt.Canvas(SizeKt.m295size3ABfNKs(Modifier.Companion, Dp.m2492constructorimpl(24)), new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingBubble$2.1
                            @Override // o.drM
                            public /* synthetic */ dpR invoke(DrawScope drawScope) {
                                d(drawScope);
                                return dpR.c;
                            }

                            public final void d(DrawScope drawScope) {
                                C8632dsu.c((Object) drawScope, "");
                                DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, LA.e(Token.Color.Cdo.e), 0.0f, 0L, 0.0f, new Stroke(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(2)), 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
                            }
                        }, composer2, 54);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, i5 | 1597440, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingBubble$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i6) {
                    cPF.d(z, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r26, final boolean r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPF.d(java.lang.String, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Token.Color color;
        Composer startRestartGroup = composer.startRestartGroup(734834995);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734834995, i3, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.RatingLine (MaturityRatingScreen.kt:280)");
            }
            if (z) {
                color = Token.Color.C0521eb.b;
            } else {
                color = Token.Color.Cdo.e;
            }
            Modifier m295size3ABfNKs = SizeKt.m295size3ABfNKs(modifier, androidx.compose.ui.unit.Dp.m2492constructorimpl(24));
            startRestartGroup.startReplaceableGroup(1596822788);
            boolean changed = startRestartGroup.changed(color);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingLine$1$1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(DrawScope drawScope) {
                        d(drawScope);
                        return dpR.c;
                    }

                    public final void d(DrawScope drawScope) {
                        C8632dsu.c((Object) drawScope, "");
                        DrawScope.m1557drawRectnJ9OG0$default(drawScope, LA.e(Token.Color.this), OffsetKt.Offset(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(11)), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(2)), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(24))), 0.0f, null, null, 0, 120, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m295size3ABfNKs, (drM) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.MaturityRatingScreenKt$RatingLine$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i5) {
                    cPF.e(z, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final List<Pair<Integer, String>> e(State<? extends List<Pair<Integer, String>>> state) {
        return state.getValue();
    }

    private static final Integer b(State<Integer> state) {
        return state.getValue();
    }

    private static final boolean d(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean a(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
