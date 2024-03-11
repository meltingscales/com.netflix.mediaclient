package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final Companion Companion = new Companion(null);
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;
    private boolean pauseSent = true;
    private boolean stopSent = true;
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(ProcessLifecycleOwner.this);
        }
    };
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
        }
    };

    public static final LifecycleOwner get() {
        return Companion.get();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner processLifecycleOwner) {
        C8632dsu.c((Object) processLifecycleOwner, "");
        processLifecycleOwner.dispatchPauseIfNeeded$lifecycle_process_release();
        processLifecycleOwner.dispatchStopIfNeeded$lifecycle_process_release();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        public final void init$lifecycle_process_release(Context context) {
            C8632dsu.c((Object) context, "");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
                return;
            }
            Handler handler = this.handler;
            C8632dsu.d(handler);
            handler.removeCallbacks(this.delayedPauseRunnable);
        }
    }

    public final void activityPaused$lifecycle_process_release() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            C8632dsu.d(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    public final void attach$lifecycle_process_release(Context context) {
        C8632dsu.c((Object) context, "");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C8632dsu.d(applicationContext);
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                C8632dsu.c((Object) activity, "");
                final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        C8632dsu.c((Object) activity2, "");
                        ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        C8632dsu.c((Object) activity2, "");
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                ReportFragment.ActivityInitializationListener activityInitializationListener;
                C8632dsu.c((Object) activity, "");
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment reportFragment = ReportFragment.Companion.get(activity);
                    activityInitializationListener = ProcessLifecycleOwner.this.initializationListener;
                    reportFragment.setProcessListener(activityInitializationListener);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                C8632dsu.c((Object) activity, "");
                ProcessLifecycleOwner.this.activityPaused$lifecycle_process_release();
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                C8632dsu.c((Object) activity, "");
                ProcessLifecycleOwner.this.activityStopped$lifecycle_process_release();
            }
        });
    }

    /* loaded from: classes5.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) activityLifecycleCallbacks, "");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }
}
