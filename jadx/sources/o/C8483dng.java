package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: o.dng  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8483dng {
    public static final InterfaceC8479dnc b(Composer composer, int i) {
        composer.startReplaceableGroup(-1317856948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1317856948, i, -1, "com.slack.circuit.retained.rememberCanRetainChecker (CanRetainChecker.android.kt:13)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = b(context);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Activity activity = (Activity) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new b(activity);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        InterfaceC8479dnc interfaceC8479dnc = (InterfaceC8479dnc) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return interfaceC8479dnc;
    }

    /* renamed from: o.dng$b */
    /* loaded from: classes5.dex */
    static final class b implements InterfaceC8479dnc {
        final /* synthetic */ Activity c;

        b(Activity activity) {
            this.c = activity;
        }

        @Override // o.InterfaceC8479dnc
        public final boolean d(InterfaceC8488dnl interfaceC8488dnl) {
            C8632dsu.c((Object) interfaceC8488dnl, "");
            if (interfaceC8488dnl instanceof C8484dnh) {
                Activity activity = this.c;
                return activity != null && activity.isChangingConfigurations();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity b(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C8632dsu.a(context, "");
        }
        return (Activity) context;
    }
}
