package o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import o.C8471dmv;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmJ implements InterfaceC8470dmu<InterfaceC8466dmq.a> {
    public static final dmJ a = new dmJ();

    private dmJ() {
    }

    @Override // o.InterfaceC8470dmu
    public dmD d(InterfaceC8466dmq.a aVar, Composer composer, int i) {
        CreationExtras creationExtras;
        Activity e2;
        C8632dsu.c((Object) aVar, "");
        composer.startReplaceableGroup(-1382329599);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1382329599, i, -1, "com.slack.circuit.backstack.ViewModelBackStackRecordLocalProvider.providedValuesFor (ViewModelBackStackRecordLocalProvider.kt:47)");
        }
        C8471dmv.e eVar = C8471dmv.e.d;
        composer.startReplaceableGroup(1729797275);
        LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
        ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(C8471dmv.class, current, null, eVar, creationExtras, composer, 36936, 0);
        composer.endReplaceableGroup();
        C8471dmv c8471dmv = (C8471dmv) viewModel;
        ViewModelStore b2 = c8471dmv.b(aVar.d());
        e2 = dmI.e((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(aVar);
        boolean changed2 = composer.changed(b2);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new e(e2, c8471dmv, aVar));
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1157296644);
        boolean changed3 = composer.changed(b2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new b(duO.b(localViewModelStoreOwner.provides(new d(b2))));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        b bVar = (b) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    /* loaded from: classes5.dex */
    public static final class e implements RememberObserver {
        final /* synthetic */ InterfaceC8466dmq.a a;
        final /* synthetic */ C8471dmv b;
        final /* synthetic */ Activity c;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        e(Activity activity, C8471dmv c8471dmv, InterfaceC8466dmq.a aVar) {
            this.c = activity;
            this.b = c8471dmv;
            this.a = aVar;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            a();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            a();
        }

        public final void a() {
            ViewModelStore a;
            Activity activity = this.c;
            if ((activity == null || !activity.isChangingConfigurations()) && (a = this.b.a(this.a.d())) != null) {
                a.clear();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements ViewModelStoreOwner {
        private final ViewModelStore d;

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public ViewModelStore getViewModelStore() {
            return this.d;
        }

        d(ViewModelStore viewModelStore) {
            this.d = viewModelStore;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements dmD {
        final /* synthetic */ duT<ProvidedValue<?>> e;

        /* JADX WARN: Multi-variable type inference failed */
        b(duT<? extends ProvidedValue<?>> dut) {
            this.e = dut;
        }

        @Override // o.dmD
        /* renamed from: a */
        public duT<ProvidedValue<?>> b(Composer composer, int i) {
            composer.startReplaceableGroup(-835989783);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835989783, i, -1, "com.slack.circuit.backstack.ViewModelBackStackRecordLocalProvider.providedValuesFor.<anonymous>.<no name provided>.provideValues (ViewModelBackStackRecordLocalProvider.kt:87)");
            }
            duT<ProvidedValue<?>> dut = this.e;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return dut;
        }
    }
}
