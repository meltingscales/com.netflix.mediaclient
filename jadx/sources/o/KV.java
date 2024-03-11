package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import com.netflix.hawkins.consumer.tokens.Theme;
import o.C8632dsu;
import o.InterfaceC8812dzl;
import o.KP;
import o.KR;
import o.KV;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes3.dex */
public final class KV extends KC {
    private final InterfaceC8812dzl<Integer> a;
    private final InterfaceC8812dzl<String> b;
    private final InterfaceC8812dzl<Boolean> d;
    private final InterfaceC8812dzl<KeyboardOptions> e;
    private final InterfaceC8812dzl<String> f;
    private final InterfaceC8812dzl<Theme> g;
    private final InterfaceC8812dzl<HawkinsInputSize> h;
    private final InterfaceC8812dzl<KP> i;
    private final InterfaceC8812dzl<String> j;

    /* renamed from: o  reason: collision with root package name */
    private drX<? super KV, ? super String, dpR> f13364o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KV(Context context) {
        this(context, null, 2, null);
        C8632dsu.c((Object) context, "");
    }

    public final drX<KV, String, dpR> a() {
        return this.f13364o;
    }

    public final void setOnValueChange(drX<? super KV, ? super String, dpR> drx) {
        this.f13364o = drx;
    }

    public /* synthetic */ KV(Context context, AttributeSet attributeSet, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
        this.g = dzB.d(Theme.b);
        this.f = dzB.d("");
        this.b = dzB.d("Label");
        this.i = dzB.d(new KP.c(""));
        this.h = dzB.d(HawkinsInputSize.e);
        this.d = dzB.d(Boolean.TRUE);
        this.e = dzB.d(null);
        this.a = dzB.d(null);
        this.j = dzB.d(null);
        ComposeView e = e();
        e.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        e.setContent(ComposableLambdaKt.composableLambdaInstance(-1448023134, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.input.HawkinsInputView$1$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer, int i) {
                InterfaceC8812dzl interfaceC8812dzl;
                InterfaceC8812dzl interfaceC8812dzl2;
                InterfaceC8812dzl interfaceC8812dzl3;
                InterfaceC8812dzl interfaceC8812dzl4;
                InterfaceC8812dzl interfaceC8812dzl5;
                InterfaceC8812dzl interfaceC8812dzl6;
                InterfaceC8812dzl interfaceC8812dzl7;
                InterfaceC8812dzl interfaceC8812dzl8;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1448023134, i, -1, "com.netflix.hawkins.consumer.component.input.HawkinsInputView.<anonymous>.<anonymous> (HawkinsInputView.kt:91)");
                    }
                    interfaceC8812dzl = KV.this.g;
                    Theme theme = (Theme) SnapshotStateKt.collectAsState(interfaceC8812dzl, null, composer, 8, 1).getValue();
                    interfaceC8812dzl2 = KV.this.f;
                    String str = (String) SnapshotStateKt.collectAsState(interfaceC8812dzl2, null, composer, 8, 1).getValue();
                    interfaceC8812dzl3 = KV.this.b;
                    String str2 = (String) SnapshotStateKt.collectAsState(interfaceC8812dzl3, null, composer, 8, 1).getValue();
                    interfaceC8812dzl4 = KV.this.i;
                    KP kp = (KP) SnapshotStateKt.collectAsState(interfaceC8812dzl4, null, composer, 8, 1).getValue();
                    interfaceC8812dzl5 = KV.this.h;
                    HawkinsInputSize hawkinsInputSize = (HawkinsInputSize) SnapshotStateKt.collectAsState(interfaceC8812dzl5, null, composer, 8, 1).getValue();
                    interfaceC8812dzl6 = KV.this.d;
                    boolean booleanValue = ((Boolean) SnapshotStateKt.collectAsState(interfaceC8812dzl6, null, composer, 8, 1).getValue()).booleanValue();
                    interfaceC8812dzl7 = KV.this.e;
                    KeyboardOptions keyboardOptions = (KeyboardOptions) SnapshotStateKt.collectAsState(interfaceC8812dzl7, null, composer, 8, 1).getValue();
                    if (keyboardOptions == null) {
                        keyboardOptions = KeyboardOptions.Companion.getDefault();
                    }
                    KeyboardOptions keyboardOptions2 = keyboardOptions;
                    interfaceC8812dzl8 = KV.this.a;
                    Integer num = (Integer) SnapshotStateKt.collectAsState(interfaceC8812dzl8, null, composer, 8, 1).getValue();
                    Modifier.Companion companion = Modifier.Companion;
                    String d = KV.this.d();
                    if (d == null) {
                        d = "HawkinsInput";
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTagKt.testTag(companion, d), 0.0f, 1, null);
                    final KV kv = KV.this;
                    KR.e(str2, str, new drM<String, dpR>() { // from class: com.netflix.hawkins.consumer.component.input.HawkinsInputView$1$1.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(String str3) {
                            c(str3);
                            return dpR.c;
                        }

                        public final void c(String str3) {
                            C8632dsu.c((Object) str3, "");
                            if (C8632dsu.c((Object) KV.this.b(), (Object) str3)) {
                                return;
                            }
                            KV.this.setText(str3);
                            drX<KV, String, dpR> a = KV.this.a();
                            if (a != null) {
                                a.invoke(KV.this, str3);
                            }
                        }
                    }, fillMaxWidth$default, booleanValue, null, null, kp, hawkinsInputSize, null, keyboardOptions2, null, null, theme, num, composer, KP.b << 21, 0, 6752);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    public final void setTheme(Theme theme) {
        C8632dsu.c((Object) theme, "");
        this.g.d(theme);
    }

    public final String b() {
        return this.f.b();
    }

    public final void setText(String str) {
        C8632dsu.c((Object) str, "");
        this.f.d(str);
    }

    public final void setLabel(String str) {
        C8632dsu.c((Object) str, "");
        this.b.d(str);
    }

    public final void setValidation(KP kp) {
        C8632dsu.c((Object) kp, "");
        this.i.d(kp);
    }

    public final void setSize(HawkinsInputSize hawkinsInputSize) {
        C8632dsu.c((Object) hawkinsInputSize, "");
        this.h.d(hawkinsInputSize);
    }

    public final void setKeyboardOptions(KeyboardOptions keyboardOptions) {
        this.e.d(keyboardOptions);
    }

    public final void setMaxCharacterCount(Integer num) {
        this.a.d(num);
    }

    public final String d() {
        return this.j.b();
    }

    public final void setTestTag(String str) {
        this.j.d(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.d.d(Boolean.valueOf(z));
        super.setEnabled(z);
    }
}
