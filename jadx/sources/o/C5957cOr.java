package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C5957cOr;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cOr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5957cOr {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(boolean r28, o.drO<o.dpR> r29, o.drO<o.dpR> r30, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5957cOr.d(boolean, o.drO, o.drO, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final drO<dpR> dro, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-30355023);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(dro) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetKt$ManageProfilesButton$1
                    public final void d() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        d();
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-30355023, i3, -1, "com.netflix.mediaclient.ui.profiles.ManageProfilesButton (SwitchProfileSheet.kt:168)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetKt$ManageProfilesButton$2
                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    a(semanticsPropertyReceiver);
                    return dpR.c;
                }

                public final void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver, true);
                }
            }, 1, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
            HawkinsButtonType hawkinsButtonType = HawkinsButtonType.d;
            String stringResource = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.hn, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1349009711);
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetKt$ManageProfilesButton$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final void b() {
                        dro.invoke();
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            KF.e(hawkinsButtonType, stringResource, (drO) rememberedValue, HawkinsIcon.C0314gy.b, TestTagKt.testTag(companion, "manage_profiles"), null, null, false, startRestartGroup, 27654, 224);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheetKt$ManageProfilesButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i5) {
                    C5957cOr.a(dro, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
