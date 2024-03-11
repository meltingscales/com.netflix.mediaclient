package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import o.C5949cOi;
import o.C8632dsu;
import o.InterfaceC1571aGf;
import o.InterfaceC8612dsa;
import o.cMR;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class cMR {
    private static final float c = androidx.compose.ui.unit.Dp.m2492constructorimpl(72);

    public static final void c(final InterfaceC1571aGf interfaceC1571aGf, final C5949cOi c5949cOi, final drO<dpR> dro, Composer composer, final int i) {
        C8632dsu.c((Object) interfaceC1571aGf, "");
        C8632dsu.c((Object) c5949cOi, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-972014930);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-972014930, i, -1, "com.netflix.mediaclient.ui.profiles.ProfilesRow (ProfileAvatar.kt:40)");
        }
        C1572aGg.b(interfaceC1571aGf, ComposableLambdaKt.composableLambda(startRestartGroup, 1795552639, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileAvatarKt$ProfilesRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                a(composer2, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1795552639, i2, -1, "com.netflix.mediaclient.ui.profiles.ProfilesRow.<anonymous> (ProfileAvatar.kt:42)");
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(TestTagKt.testTag(IntrinsicKt.width(Modifier.Companion, IntrinsicSize.Max), "profile_avatar"), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileAvatarKt$ProfilesRow$1.1
                        @Override // o.drM
                        public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            e(semanticsPropertyReceiver);
                            return dpR.c;
                        }

                        public final void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            C8632dsu.c((Object) semanticsPropertyReceiver, "");
                            SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver, true);
                        }
                    }, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                    C5949cOi c5949cOi2 = C5949cOi.this;
                    drO<dpR> dro2 = dro;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                    Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    cMR.d(c5949cOi2, dro2, null, composer2, 0, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileAvatarKt$ProfilesRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    cMR.c(InterfaceC1571aGf.this, c5949cOi, dro, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final o.C5949cOi r32, final o.drO<o.dpR> r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cMR.d(o.cOi, o.drO, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
