package o;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import java.util.Arrays;
import o.C8489dnm;
import o.dpR;

/* renamed from: o.dnn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8490dnn {
    public static final <T> T b(final Object[] objArr, String str, drO<? extends T> dro, Composer composer, int i, int i2) {
        int c;
        final String num;
        Object invoke;
        Object[] e;
        Object rememberedValue;
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) dro, "");
        composer.startReplaceableGroup(-197622428);
        String str2 = (i2 & 2) != 0 ? null : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-197622428, i, -1, "com.slack.circuit.retained.rememberRetained (RememberRetained.kt:68)");
        }
        final InterfaceC8488dnl interfaceC8488dnl = (InterfaceC8488dnl) composer.consume(C8492dnp.d());
        composer.startReplaceableGroup(-1387441617);
        if (interfaceC8488dnl == C8485dni.c) {
            int length = objArr.length;
            if (length == 0) {
                composer.startReplaceableGroup(-1387441528);
                composer.startReplaceableGroup(-492369756);
                rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = (T) dro.invoke();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (length == 1) {
                composer.startReplaceableGroup(-1387441502);
                Object obj = objArr[0];
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(obj);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue = (T) dro.invoke();
                    composer.updateRememberedValue(rememberedValue);
                } else {
                    rememberedValue = (T) rememberedValue2;
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (length == 2) {
                composer.startReplaceableGroup(-1387441465);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                composer.startReplaceableGroup(511388516);
                boolean changed2 = composer.changed(obj2);
                boolean changed3 = composer.changed(obj3);
                Object rememberedValue3 = composer.rememberedValue();
                if ((changed2 || changed3) || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue = (T) dro.invoke();
                    composer.updateRememberedValue(rememberedValue);
                } else {
                    rememberedValue = (T) rememberedValue3;
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (length == 3) {
                composer.startReplaceableGroup(-1387441417);
                Object obj4 = objArr[0];
                Object obj5 = objArr[1];
                Object obj6 = objArr[2];
                composer.startReplaceableGroup(1618982084);
                boolean changed4 = composer.changed(obj4);
                boolean changed5 = composer.changed(obj5);
                boolean changed6 = composer.changed(obj6);
                Object rememberedValue4 = composer.rememberedValue();
                if (((changed4 || changed5) || changed6) || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue = (T) dro.invoke();
                    composer.updateRememberedValue(rememberedValue);
                } else {
                    rememberedValue = (T) rememberedValue4;
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1387441355);
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                composer.startReplaceableGroup(-568225417);
                boolean z = false;
                for (Object obj7 : copyOf) {
                    z |= composer.changed(obj7);
                }
                rememberedValue = composer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = (T) dro.invoke();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return (T) rememberedValue;
        }
        composer.endReplaceableGroup();
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str2 == null || str2.length() == 0) {
            c = C8672dug.c(36);
            num = Integer.toString(currentCompositeKeyHash, c);
            C8632dsu.a(num, "");
        } else {
            num = str2;
        }
        InterfaceC8479dnc interfaceC8479dnc = (InterfaceC8479dnc) composer.consume(C8481dne.d());
        composer.startReplaceableGroup(-1387441033);
        if (interfaceC8479dnc == null) {
            interfaceC8479dnc = C8483dng.b(composer, 0);
        }
        InterfaceC8479dnc interfaceC8479dnc2 = interfaceC8479dnc;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1157296644);
        boolean changed7 = composer.changed(interfaceC8479dnc2);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed7 || rememberedValue5 == Composer.Companion.getEmpty()) {
            Object b = interfaceC8488dnl.b(num);
            C8489dnm.d dVar = b instanceof C8489dnm.d ? (C8489dnm.d) b : null;
            if (dVar == null || (invoke = dVar.a()) == null) {
                invoke = dro.invoke();
            }
            rememberedValue5 = new C8489dnm(interfaceC8488dnl, interfaceC8479dnc2, num, invoke, (dVar == null || (e = dVar.e()) == null) ? objArr : e);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        final C8489dnm c8489dnm = (C8489dnm) rememberedValue5;
        T t = (T) c8489dnm.e(objArr);
        if (t == null) {
            t = dro.invoke();
        }
        final T t2 = t;
        EffectsKt.SideEffect(new drO<dpR>() { // from class: com.slack.circuit.retained.RememberRetainedKt$rememberRetained$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final void d() {
                c8489dnm.d(interfaceC8488dnl, num, t2, objArr);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        }, composer, 0);
        C8632dsu.d(t2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t2;
    }
}
