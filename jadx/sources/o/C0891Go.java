package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.platform.TestTagKt;
import com.netflix.clcs.ui.ClcsPinEntryKt$ClcsPinEntry$3$1;
import com.netflix.hawkins.consumer.component.input.HawkinsInputPinCodeSize;
import com.netflix.hawkins.consumer.tokens.Theme;
import o.C0880Gd;
import o.C0891Go;
import o.C8632dsu;
import o.FE;
import o.FP;
import o.dpR;

/* renamed from: o.Go  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0891Go {
    public static final void c(final FP fp, final Theme theme, final FY fy, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) fp, "");
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) fy, "");
        Composer startRestartGroup = composer.startRestartGroup(-1090701990);
        Modifier.Companion companion = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1090701990, i, -1, "com.netflix.clcs.ui.ClcsPinEntry (ClcsPinEntry.kt:24)");
        }
        startRestartGroup.startReplaceableGroup(-484144024);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-484143979);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        String d = d(mutableState);
        HawkinsInputPinCodeSize h = fp.h();
        Integer c = fp.c();
        final Modifier modifier2 = companion;
        KQ.b((drM<? super String, dpR>) new drM<String, dpR>() { // from class: com.netflix.clcs.ui.ClcsPinEntryKt$ClcsPinEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str2) {
                b(str2);
                return dpR.c;
            }

            public final void b(String str2) {
                FE a;
                C8632dsu.c((Object) str2, "");
                C0891Go.a(mutableState, str2);
                C0880Gd d2 = FP.this.d();
                if (d2 != null) {
                    fy.a(str2, d2);
                }
                int length = str2.length();
                Integer c2 = FP.this.c();
                if (c2 == null || length != c2.intValue() || (a = FP.this.a()) == null) {
                    return;
                }
                fy.e(a);
            }
        }, TestTagKt.testTag(FocusRequesterModifierKt.focusRequester(companion, focusRequester), fp.b()), c != null ? c.intValue() : 4, d, h, (KT) null, false, new drO<dpR>() { // from class: com.netflix.clcs.ui.ClcsPinEntryKt$ClcsPinEntry$2
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
                FE e = FP.this.e();
                if (e != null) {
                    fy.e(e);
                }
            }
        }, theme, startRestartGroup, (i << 21) & 234881024, 96);
        if (C8632dsu.c((Object) fp.b(), (Object) str)) {
            dpR dpr = dpR.c;
            startRestartGroup.startReplaceableGroup(-484143115);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new ClcsPinEntryKt$ClcsPinEntry$3$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(dpr, (drX) rememberedValue3, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsPinEntryKt$ClcsPinEntry$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    C0891Go.c(FP.this, theme, fy, str, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final String d(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
