package com.netflix.mediaclient.ui.commander.impl.ui.components;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.drM;

/* loaded from: classes4.dex */
public final class SearchBoxKt$SearchBox$1$1 extends Lambda implements drM<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Lifecycle c;
    final /* synthetic */ SoftwareKeyboardController d;
    final /* synthetic */ FocusRequester e;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBoxKt$SearchBox$1$1(Lifecycle lifecycle, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController) {
        super(1);
        this.c = lifecycle;
        this.e = focusRequester;
        this.d = softwareKeyboardController;
    }

    /* loaded from: classes4.dex */
    public static final class c implements DisposableEffectResult {
        final /* synthetic */ LifecycleEventObserver b;
        final /* synthetic */ Lifecycle c;

        public c(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.c = lifecycle;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.c.removeObserver(this.b);
        }
    }

    @Override // o.drM
    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C8632dsu.c((Object) disposableEffectScope, "");
        final FocusRequester focusRequester = this.e;
        final SoftwareKeyboardController softwareKeyboardController = this.d;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.SearchBoxKt$SearchBox$1$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SearchBoxKt$SearchBox$1$1.a(FocusRequester.this, softwareKeyboardController, lifecycleOwner, event);
            }
        };
        this.c.addObserver(lifecycleEventObserver);
        return new c(this.c, lifecycleEventObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) focusRequester, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (d.a[event.ordinal()] == 1) {
            focusRequester.freeFocus();
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }
}
