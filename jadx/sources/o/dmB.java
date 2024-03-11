package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import o.C8475dmz;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmB implements InterfaceC8470dmu<InterfaceC8466dmq.a> {
    public static final dmB c = new dmB();

    private dmB() {
    }

    @Override // o.InterfaceC8470dmu
    public dmD d(InterfaceC8466dmq.a aVar, Composer composer, int i) {
        C8632dsu.c((Object) aVar, "");
        composer.startReplaceableGroup(211508705);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(211508705, i, -1, "com.slack.circuit.backstack.SaveableStateRegistryBackStackRecordLocalProvider.providedValuesFor (SaveableStateRegistryBackStackRecordLocalProvider.kt:37)");
        }
        C8475dmz c8475dmz = (C8475dmz) RememberSaveableKt.rememberSaveable(new Object[]{aVar}, C8475dmz.e.d(), aVar.d(), new drO<C8475dmz>() { // from class: com.slack.circuit.backstack.SaveableStateRegistryBackStackRecordLocalProvider$providedValuesFor$childRegistry$1
            @Override // o.drO
            /* renamed from: d */
            public final C8475dmz invoke() {
                return new C8475dmz(SnapshotStateKt.mutableStateMapOf());
            }
        }, composer, 3144, 0);
        c8475dmz.a((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(c8475dmz);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c(c8475dmz);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        c cVar = (c) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cVar;
    }

    /* loaded from: classes5.dex */
    public static final class c implements dmD {
        private final duT<ProvidedValue<SaveableStateRegistry>> a;
        final /* synthetic */ C8475dmz c;

        c(C8475dmz c8475dmz) {
            this.c = c8475dmz;
            this.a = duO.b(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(c8475dmz));
        }

        @Override // o.dmD
        public duS<ProvidedValue<?>> b(Composer composer, int i) {
            composer.startReplaceableGroup(-555139661);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555139661, i, -1, "com.slack.circuit.backstack.SaveableStateRegistryBackStackRecordLocalProvider.providedValuesFor.<anonymous>.<no name provided>.provideValues (SaveableStateRegistryBackStackRecordLocalProvider.kt:53)");
            }
            C8475dmz c8475dmz = this.c;
            composer.startReplaceableGroup(-492369756);
            if (composer.rememberedValue() == Composer.Companion.getEmpty()) {
                composer.updateRememberedValue(new a(c8475dmz));
            }
            composer.endReplaceableGroup();
            duT<ProvidedValue<SaveableStateRegistry>> dut = this.a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return dut;
        }

        /* loaded from: classes5.dex */
        public static final class a implements RememberObserver {
            final /* synthetic */ C8475dmz d;

            @Override // androidx.compose.runtime.RememberObserver
            public void onAbandoned() {
            }

            @Override // androidx.compose.runtime.RememberObserver
            public void onRemembered() {
            }

            a(C8475dmz c8475dmz) {
                this.d = c8475dmz;
            }

            @Override // androidx.compose.runtime.RememberObserver
            public void onForgotten() {
                this.d.a();
            }
        }
    }
}
