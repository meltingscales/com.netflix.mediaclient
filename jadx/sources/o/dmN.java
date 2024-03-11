package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.slack.circuit.runtime.screen.Screen;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC8466dmq;
import o.InterfaceC8499dnw;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.dmF;
import o.dmH;
import o.dmN;
import o.dmS;
import o.dpR;

/* loaded from: classes5.dex */
public final class dmN {
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final o.InterfaceC8499dnw r19, final o.InterfaceC8466dmq<? extends o.InterfaceC8466dmq.a> r20, androidx.compose.ui.Modifier r21, o.dmH r22, o.duU<? extends o.InterfaceC8466dmq.a, ? extends o.dmD> r23, o.dmC r24, o.InterfaceC8613dsb<? super com.slack.circuit.runtime.screen.Screen, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmN.e(o.dnw, o.dmq, androidx.compose.ui.Modifier, o.dmH, o.duU, o.dmC, o.dsb, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final duS<dmS> e(InterfaceC8466dmq<? extends InterfaceC8466dmq.a> interfaceC8466dmq, InterfaceC8499dnw interfaceC8499dnw, dmH dmh, InterfaceC8613dsb<? super Screen, ? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8613dsb, Composer composer, int i) {
        dtQ b;
        dtQ k;
        composer.startReplaceableGroup(643470577);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(643470577, i, -1, "com.slack.circuit.foundation.buildCircuitContentProviders (NavigableCircuitContent.kt:117)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LinkedHashMap();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Map map = (Map) rememberedValue;
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC8499dnw, composer, (i >> 3) & 14);
        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(dmh, composer, (i >> 6) & 14);
        final State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(interfaceC8613dsb, composer, (i >> 9) & 14);
        b = dtY.b(interfaceC8466dmq.iterator());
        k = C8670due.k(b, new drM<InterfaceC8466dmq.a, dmS>() { // from class: com.slack.circuit.foundation.NavigableCircuitContentKt$buildCircuitContentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final dmS invoke(InterfaceC8466dmq.a aVar) {
                C8632dsu.c((Object) aVar, "");
                Map<String, dmS> map2 = map;
                String d = aVar.d();
                final State<InterfaceC8499dnw> state = rememberUpdatedState;
                final State<dmH> state2 = rememberUpdatedState2;
                final State<InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR>> state3 = rememberUpdatedState3;
                dmS dms = map2.get(d);
                if (dms == null) {
                    dms = new dmS(aVar, MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(463791492, true, new InterfaceC8612dsa<InterfaceC8466dmq.a, Composer, Integer, dpR>() { // from class: com.slack.circuit.foundation.NavigableCircuitContentKt$buildCircuitContentProviders$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(InterfaceC8466dmq.a aVar2, Composer composer2, Integer num) {
                            e(aVar2, composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void e(InterfaceC8466dmq.a aVar2, Composer composer2, int i2) {
                            InterfaceC8499dnw b2;
                            dmH a;
                            InterfaceC8613dsb g;
                            C8632dsu.c((Object) aVar2, "");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(463791492, i2, -1, "com.slack.circuit.foundation.buildCircuitContentProviders.<anonymous>.<anonymous>.<anonymous> (NavigableCircuitContent.kt:134)");
                            }
                            Screen c = aVar2.c();
                            Modifier.Companion companion = Modifier.Companion;
                            b2 = dmN.b(state);
                            a = dmN.a(state2);
                            g = dmN.g(state3);
                            dmF.d(c, b2, companion, a, g, composer2, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    })));
                    map2.put(d, dms);
                }
                return dms;
            }
        });
        duS<dmS> c = duO.c(k);
        map.clear();
        for (dmS dms : c) {
            map.put(dms.b().d(), dms);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC8466dmq.a aVar) {
        String d = aVar.d();
        return "_registry_" + d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8499dnw b(State<? extends InterfaceC8499dnw> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dmH a(State<dmH> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> g(State<? extends InterfaceC8613dsb<? super Screen, ? super Modifier, ? super Composer, ? super Integer, dpR>> state) {
        return (InterfaceC8613dsb) state.getValue();
    }
}
