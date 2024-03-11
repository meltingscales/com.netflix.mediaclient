package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C5948cOh;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cOh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5948cOh {
    public static final void d(final String str, final String str2, final drO<dpR> dro, Composer composer, final int i) {
        int i2;
        Composer composer2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(325935578);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? JSONzip.end : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325935578, i3, -1, "com.netflix.mediaclient.ui.profiles.ShareContainer (ShareContainer.kt:29)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            float f = 4;
            Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics$default(ClickableKt.m130clickableXHw0xAI$default(SizeKt.m288height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m110backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m401RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(f), androidx.compose.ui.unit.Dp.m2492constructorimpl(f), 3, null)), LA.e(Token.Color.C0621hu.d), null, 2, null), 0.0f, 1, null), C5895cMi.c.e()), false, str2, null, dro, 5, null), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ShareContainerKt$ShareContainer$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    d(semanticsPropertyReceiver);
                    return dpR.c;
                }

                public final void d(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver, true);
                }
            }, 1, null), "my_netflix_favorites_row_share_button");
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            KK.c(HawkinsIcon.hJ.e, null, PaddingKt.m277paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(f), 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(8), 0.0f, 10, null), null, null, Token.Color.C0655jb.c, startRestartGroup, 197046, 24);
            composer2 = startRestartGroup;
            C1020Ln.c(str, (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.C0681aa.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, (i3 & 14) | 24576, 0, 16366);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ShareContainerKt$ShareContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer3, int i4) {
                    C5948cOh.d(str, str2, dro, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    c(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
