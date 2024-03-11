package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import o.C8737dwr;
import o.C8799dyz;
import o.InterfaceC8792dys;
import o.InterfaceC8817dzq;
import o.InterfaceC8822dzv;
import o.dpR;
import o.dqY;
import o.dqZ;
import o.dwU;
import o.dwY;
import o.dyR;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, InterfaceC8822dzv<Float>> animationScale = new LinkedHashMap();

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    private static final View getContentChild(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View contentChild = getContentChild(view);
        CompositionContext compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
        }
        if (compositionContext instanceof Recomposer) {
            return (Recomposer) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, dqZ dqz, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, dqz, lifecycle);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    public static final Recomposer createLifecycleAwareWindowRecomposer(final View view, dqZ dqz, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (dqz.get(dqY.d) == null || dqz.get(MonotonicFrameClock.Key) == null) {
            dqz = AndroidUiDispatcher.Companion.getCurrentThread().plus(dqz);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) dqz.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MotionDurationScale motionDurationScale = (MotionDurationScale) dqz.get(MotionDurationScale.Key);
        MotionDurationScale motionDurationScale2 = motionDurationScale;
        if (motionDurationScale == null) {
            ?? motionDurationScaleImpl = new MotionDurationScaleImpl();
            objectRef.d = motionDurationScaleImpl;
            motionDurationScale2 = motionDurationScaleImpl;
        }
        dqZ plus = dqz.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.e).plus(motionDurationScale2);
        final Recomposer recomposer = new Recomposer(plus);
        recomposer.pauseCompositionFrameClock();
        final dwU c = dwY.c(plus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle == null) {
            throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view.removeOnAttachStateChangeListener(this);
                recomposer.cancel();
            }
        });
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

            /* loaded from: classes.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    C8737dwr.c(dwU.this, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, lifecycleOwner2, this, view, null), 1, null);
                } else if (i == 2) {
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        pausableMonotonicFrameClock3.resume();
                    }
                    recomposer.resumeCompositionFrameClock();
                } else if (i == 3) {
                    recomposer.pauseCompositionFrameClock();
                } else if (i != 4) {
                } else {
                    recomposer.cancel();
                }
            }
        });
        return recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final InterfaceC8822dzv<Float> getAnimationScaleFlowFor(Context context) {
        InterfaceC8822dzv<Float> interfaceC8822dzv;
        Map<Context, InterfaceC8822dzv<Float>> map = animationScale;
        synchronized (map) {
            InterfaceC8822dzv<Float> interfaceC8822dzv2 = map.get(context);
            if (interfaceC8822dzv2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final InterfaceC8792dys e = C8799dyz.e(-1, null, null, 6, null);
                final Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                interfaceC8822dzv2 = dyR.e(dyR.d(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z, Uri uri) {
                        e.d((InterfaceC8792dys<dpR>) dpR.c);
                    }
                }, e, context, null)), dwY.a(), InterfaceC8817dzq.a.e(InterfaceC8817dzq.d, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, interfaceC8822dzv2);
            }
            interfaceC8822dzv = interfaceC8822dzv2;
        }
        return interfaceC8822dzv;
    }
}
