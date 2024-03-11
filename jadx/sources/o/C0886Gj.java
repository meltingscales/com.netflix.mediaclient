package o;

import androidx.compose.foundation.text.KeyboardOptions;
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
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import com.netflix.clcs.models.Input;
import com.netflix.clcs.ui.ClcsInputKt$ClcsInput$2$1;
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C0880Gd;
import o.C0886Gj;
import o.C8632dsu;
import o.FE;
import o.KP;
import o.dpR;

/* renamed from: o.Gj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0886Gj {

    /* renamed from: o.Gj$b */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Input.Type.values().length];
            try {
                iArr[Input.Type.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Input.Type.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void e(final Input input, final FY fy, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        KP cVar;
        VisualTransformation none;
        KeyboardOptions m418copyij11fho$default;
        C8632dsu.c((Object) input, "");
        C8632dsu.c((Object) fy, "");
        Composer startRestartGroup = composer.startRestartGroup(-303108300);
        Modifier.Companion companion = (i2 & 8) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-303108300, i, -1, "com.netflix.clcs.ui.ClcsInput (ClcsInput.kt:28)");
        }
        startRestartGroup.startReplaceableGroup(1018215332);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            C0880Gd b2 = input.b();
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((b2 == null || (r3 = b2.c()) == null) ? "" : "", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1018215418);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        String f = input.f();
        if (f == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String a = a(mutableState);
        Modifier testTag = TestTagKt.testTag(FocusRequesterModifierKt.focusRequester(companion, focusRequester), input.c());
        HawkinsInputSize g = input.g();
        if (g == null) {
            g = HawkinsInputSize.e;
        }
        HawkinsInputSize hawkinsInputSize = g;
        if (input.a() != null) {
            cVar = new KP.e(input.a());
        } else {
            cVar = new KP.c("");
        }
        HawkinsIcon e = input.e();
        if (input.h() == Input.Type.d) {
            none = new PasswordVisualTransformation((char) 0, 1, null);
        } else {
            none = VisualTransformation.Companion.getNone();
        }
        VisualTransformation visualTransformation = none;
        Input.Type h = input.h();
        int i3 = h != null ? b.a[h.ordinal()] : -1;
        if (i3 == 1) {
            m418copyij11fho$default = KeyboardOptions.m418copyij11fho$default(KeyboardOptions.Companion.getDefault(), 0, false, KeyboardType.Companion.m2290getEmailPjHm6EE(), 0, null, 27, null);
        } else if (i3 == 2) {
            m418copyij11fho$default = KeyboardOptions.m418copyij11fho$default(KeyboardOptions.Companion.getDefault(), 0, false, KeyboardType.Companion.m2294getPhonePjHm6EE(), 0, null, 27, null);
        } else {
            m418copyij11fho$default = KeyboardOptions.Companion.getDefault();
        }
        final Modifier modifier2 = companion;
        KR.e(f, a, new drM<String, dpR>() { // from class: com.netflix.clcs.ui.ClcsInputKt$ClcsInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str2) {
                d(str2);
                return dpR.c;
            }

            public final void d(String str2) {
                C8632dsu.c((Object) str2, "");
                C0886Gj.a(mutableState, str2);
                C0880Gd b3 = Input.this.b();
                if (b3 != null) {
                    fy.a(str2, b3);
                }
                FE d = Input.this.d();
                if (d != null) {
                    fy.e(d);
                }
            }
        }, testTag, false, e, null, cVar, hawkinsInputSize, visualTransformation, m418copyij11fho$default, null, null, null, null, startRestartGroup, KP.b << 21, 0, 30800);
        if (C8632dsu.c((Object) input.c(), (Object) str)) {
            dpR dpr = dpR.c;
            startRestartGroup.startReplaceableGroup(1018216808);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new ClcsInputKt$ClcsInput$2$1(focusRequester, null);
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsInputKt$ClcsInput$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i4) {
                    C0886Gj.e(Input.this, fy, str, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final String a(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
