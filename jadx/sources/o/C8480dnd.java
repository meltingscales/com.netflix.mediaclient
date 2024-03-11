package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RememberObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.slack.circuit.retained.AndroidContinuityKt$continuityRetainedStateRegistry$2;
import o.C8484dnh;

/* renamed from: o.dnd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8480dnd {
    public static final InterfaceC8488dnl a(String str, InterfaceC8479dnc interfaceC8479dnc, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(416494302);
        if ((i2 & 1) != 0) {
            str = "CircuitContinuity";
        }
        String str2 = str;
        if ((i2 & 2) != 0 && (interfaceC8479dnc = (InterfaceC8479dnc) composer.consume(C8481dne.d())) == null) {
            interfaceC8479dnc = C8483dng.b(composer, 0);
        }
        InterfaceC8479dnc interfaceC8479dnc2 = interfaceC8479dnc;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(416494302, i, -1, "com.slack.circuit.retained.continuityRetainedStateRegistry (AndroidContinuity.kt:68)");
        }
        InterfaceC8488dnl a = a(str2, C8484dnh.b.b, interfaceC8479dnc2, composer, (i & 14) | 48 | ((i << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a;
    }

    public static final InterfaceC8488dnl a(String str, ViewModelProvider.Factory factory, InterfaceC8479dnc interfaceC8479dnc, Composer composer, int i, int i2) {
        CreationExtras creationExtras;
        composer.startReplaceableGroup(788868380);
        if ((i2 & 1) != 0) {
            str = "CircuitContinuity";
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            factory = C8484dnh.b.b;
        }
        ViewModelProvider.Factory factory2 = factory;
        if ((i2 & 4) != 0) {
            InterfaceC8479dnc interfaceC8479dnc2 = (InterfaceC8479dnc) composer.consume(C8481dne.d());
            if (interfaceC8479dnc2 == null) {
                interfaceC8479dnc2 = C8483dng.b(composer, 0);
            }
            interfaceC8479dnc = interfaceC8479dnc2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(788868380, i, -1, "com.slack.circuit.retained.continuityRetainedStateRegistry (AndroidContinuity.kt:83)");
        }
        composer.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(C8484dnh.class, current, str2, factory2, creationExtras, composer, (((((i << 3) & 112) | 512) << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        C8484dnh c8484dnh = (C8484dnh) viewModel;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(c8484dnh);
        boolean changed2 = composer.changed(interfaceC8479dnc);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new c(interfaceC8479dnc, c8484dnh));
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(c8484dnh, new AndroidContinuityKt$continuityRetainedStateRegistry$2(c8484dnh, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c8484dnh;
    }

    /* renamed from: o.dnd$c */
    /* loaded from: classes5.dex */
    public static final class c implements RememberObserver {
        final /* synthetic */ C8484dnh a;
        final /* synthetic */ InterfaceC8479dnc e;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        c(InterfaceC8479dnc interfaceC8479dnc, C8484dnh c8484dnh) {
            this.e = interfaceC8479dnc;
            this.a = c8484dnh;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            c();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            c();
        }

        public final void c() {
            if (this.e.d(this.a)) {
                this.a.a();
            }
        }
    }
}
