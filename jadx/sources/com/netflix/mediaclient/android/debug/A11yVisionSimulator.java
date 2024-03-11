package com.netflix.mediaclient.android.debug;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.mediaclient.android.debug.A11yVisionSimulator;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.ArtworkColors;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Ref;
import o.C8157dfA;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dpR;
import o.drM;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public final class A11yVisionSimulator {
    private final Activity d;
    private Disposable e;
    public static final Companion b = new Companion(null);
    public static final int a = 8;

    public final Activity d() {
        return this.d;
    }

    public A11yVisionSimulator(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.d = activity;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public final boolean a() {
            return false;
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes3.dex */
        public static final class Options {
            private static final /* synthetic */ Options[] f;
            private static final /* synthetic */ InterfaceC8598drn j;
            private final String i;
            public static final Options h = new Options("OFF", 0, "Simulation Off");
            public static final Options d = new Options("BLIND", 1, "Blind (only with TalkBack on)");
            public static final Options e = new Options("CATARACTS", 2, "Cataracts");
            public static final Options b = new Options("DYSLEXIA", 3, "Dyslexia");
            public static final Options g = new Options("RED_BLIND", 4, "Protanomaly (red-weak)");
            public static final Options a = new Options("GREEN_BLIND", 5, "Deuteranomaly (green-weak)");
            public static final Options c = new Options("BLUE_BLIND", 6, "Tritanomaly (blue weak)");

            private static final /* synthetic */ Options[] a() {
                return new Options[]{h, d, e, b, g, a, c};
            }

            public static Options valueOf(String str) {
                return (Options) Enum.valueOf(Options.class, str);
            }

            public static Options[] values() {
                return (Options[]) f.clone();
            }

            private Options(String str, int i, String str2) {
                this.i = str2;
            }

            static {
                Options[] a2 = a();
                f = a2;
                j = C8600drp.e(a2);
            }
        }

        public final int d(Context context) {
            C8632dsu.c((Object) context, "");
            if (a()) {
                return C8157dfA.d(context, "vision_sim_preference", Options.h.ordinal());
            }
            return Options.h.ordinal();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, com.netflix.mediaclient.android.debug.A11yVisionSimulator] */
        public final void c(final Activity activity) {
            C8632dsu.c((Object) activity, "");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.d = new A11yVisionSimulator(activity);
            ((AppCompatActivity) activity).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.android.debug.A11yVisionSimulator$Companion$setup$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    super.onResume(lifecycleOwner);
                    A11yVisionSimulator a11yVisionSimulator = objectRef.d;
                    if (a11yVisionSimulator != null) {
                        a11yVisionSimulator.b();
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    A11yVisionSimulator a11yVisionSimulator = objectRef.d;
                    if (a11yVisionSimulator != null) {
                        a11yVisionSimulator.c();
                    }
                    super.onPause(lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    Activity activity2 = activity;
                    C8632dsu.d(activity2);
                    ((AppCompatActivity) activity2).getLifecycle().removeObserver(this);
                    objectRef.d = null;
                    super.onDestroy(lifecycleOwner);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void b() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.e = null;
        final ViewGroup viewGroup = (ViewGroup) this.d.findViewById(16908290);
        if (viewGroup == null) {
            return;
        }
        int d = b.d(this.d);
        if (d == Companion.Options.h.ordinal()) {
            View findViewWithTag = viewGroup.findViewWithTag("accessibility_vision_simulator");
            if (findViewWithTag == null) {
                return;
            }
            findViewWithTag.setVisibility(8);
        } else if (d == Companion.Options.b.ordinal()) {
            TextView c = c(this.d, viewGroup);
            c.setVisibility(0);
            c.setText("simulating dyslexia");
            AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(this.d, R.e.g);
            C8632dsu.d(create);
            c.setBackground(create);
            create.start();
        } else if (d == Companion.Options.g.ordinal()) {
            c(this.d, viewGroup, "simulating red-weak", Color.argb(128, (int) PrivateKeyType.INVALID, 0, 0));
        } else if (d == Companion.Options.a.ordinal()) {
            c(this.d, viewGroup, "simulating green-weak", Color.argb(112, 0, (int) PrivateKeyType.INVALID, 0));
        } else if (d == Companion.Options.c.ordinal()) {
            c(this.d, viewGroup, "simulating blue-weak", Color.argb(112, 0, 0, (int) PrivateKeyType.INVALID));
        } else if (d == Companion.Options.e.ordinal()) {
            c(this.d, viewGroup, "simulating cataracts", Color.argb(160, 192, 128, 128));
        } else if (d == Companion.Options.d.ordinal()) {
            Observable<Boolean> distinctUntilChanged = AccessibilityUtils.c(this.d).distinctUntilChanged();
            final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.android.debug.A11yVisionSimulator$start$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool.booleanValue());
                    return dpR.c;
                }

                public final void c(boolean z) {
                    TextView c2;
                    A11yVisionSimulator a11yVisionSimulator = A11yVisionSimulator.this;
                    c2 = a11yVisionSimulator.c(a11yVisionSimulator.d(), viewGroup);
                    c2.setVisibility(z ? 0 : 8);
                    if (z) {
                        c2.setText("simulating blindness");
                        c2.setBackgroundColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
                    }
                }
            };
            this.e = distinctUntilChanged.subscribe(new Consumer() { // from class: o.NI
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    A11yVisionSimulator.c(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.e = null;
    }

    private final void c(Activity activity, ViewGroup viewGroup, String str, int i) {
        TextView c = c(activity, viewGroup);
        c.setVisibility(0);
        c.setText(str);
        c.setBackgroundColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView c(Activity activity, ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewWithTag("accessibility_vision_simulator");
        if (textView == null) {
            TextView textView2 = new TextView(new ContextThemeWrapper(activity, R.l.m));
            textView2.setTag("accessibility_vision_simulator");
            textView2.setImportantForAccessibility(4);
            textView2.setElevation(200.0f);
            textView2.setPadding(0, 0, 0, 0);
            viewGroup.addView(textView2, -1, -1);
            return textView2;
        }
        return textView;
    }
}
