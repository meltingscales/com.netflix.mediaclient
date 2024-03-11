package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.VideoView;
import android.window.SplashScreen;
import androidx.activity.ComponentActivity;
import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AnimatedSplashScreen;
import com.netflix.mediaclient.ui.launch.AppSplash$runAfterSplashComplete$1;
import com.netflix.mediaclient.ui.launch.AppSplash$runAfterSplashComplete$3;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import o.bYE;
import o.dpR;

/* loaded from: classes.dex */
public final class bYE {
    public static final e a = new e(null);
    public static final int d = 8;
    private static boolean e;
    private final BehaviorSubject<Boolean> b;
    private final C1665aJs c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return false;
    }

    public bYE() {
        BehaviorSubject<Boolean> createDefault = BehaviorSubject.createDefault(Boolean.TRUE);
        C8632dsu.a(createDefault, "");
        this.b = createDefault;
        this.c = new C1665aJs(0L, null, false, null, 14, null);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AppSplash");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bYE bye, MediaPlayer mediaPlayer) {
        C8632dsu.c((Object) bye, "");
        bye.b.onNext(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bYE bye, long j, VideoView videoView, ViewTreeObserver.OnPreDrawListener onPreDrawListener, MediaPlayer mediaPlayer) {
        C8632dsu.c((Object) bye, "");
        C8632dsu.c((Object) videoView, "");
        C8632dsu.c((Object) onPreDrawListener, "");
        bye.c(j);
        videoView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        videoView.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bYE bye, long j, VideoView videoView, MediaPlayer mediaPlayer) {
        C8632dsu.c((Object) bye, "");
        C8632dsu.c((Object) videoView, "");
        bye.c(j);
        videoView.start();
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    public final void e(Observable<dpR> observable, final Runnable runnable) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) runnable, "");
        if (Config_FastProperty_AnimatedSplashScreen.Companion.e()) {
            Observable<Boolean> observeOn = this.b.mergeWith(Observable.just(Boolean.TRUE).delay(2L, TimeUnit.SECONDS)).takeUntil(observable).observeOn(AndroidSchedulers.mainThread());
            final AppSplash$runAfterSplashComplete$1 appSplash$runAfterSplashComplete$1 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.launch.AppSplash$runAfterSplashComplete$1
                public final Boolean a(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // o.drM
                public /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            };
            Observable<Boolean> take = observeOn.filter(new Predicate() { // from class: o.bYK
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d2;
                    d2 = bYE.d(drM.this, obj);
                    return d2;
                }
            }).take(1L);
            final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.launch.AppSplash$runAfterSplashComplete$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool);
                    return dpR.c;
                }

                public final void c(Boolean bool) {
                    runnable.run();
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: o.bYJ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    bYE.b(drM.this, obj);
                }
            };
            final AppSplash$runAfterSplashComplete$3 appSplash$runAfterSplashComplete$3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.launch.AppSplash$runAfterSplashComplete$3
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    bYE.e eVar = bYE.a;
                }
            };
            take.subscribe(consumer, new Consumer() { // from class: o.bYO
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    bYE.h(drM.this, obj);
                }
            });
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void b(Activity activity) {
        SplashScreen splashScreen;
        C8632dsu.c((Object) activity, "");
        if (Build.VERSION.SDK_INT >= 31) {
            splashScreen = activity.getSplashScreen();
            splashScreen.setSplashScreenTheme(0);
        }
    }

    private final void c(long j) {
        this.c.e("splashVideoLoad", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
        e eVar = a;
        eVar.getLogTag();
        PerformanceTraceReported c = this.c.c();
        eVar.getLogTag();
        Logger.INSTANCE.logEvent(c);
    }

    public final void a(ComponentActivity componentActivity, final VideoView videoView, View view) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) videoView, "");
        C8632dsu.c((Object) view, "");
        if (e) {
            videoView.setVisibility(8);
            view.setVisibility(0);
            this.b.onNext(Boolean.TRUE);
            return;
        }
        a.getLogTag();
        e = true;
        this.b.onNext(Boolean.FALSE);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            videoView.setAudioFocusRequest(0);
        }
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.bYH
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                bYE.b(bYE.this, mediaPlayer);
            }
        });
        this.c.d("splashVideoLoad");
        final long a2 = this.c.a();
        if (i >= 31) {
            final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: o.bYI
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean d2;
                    d2 = bYE.d();
                    return d2;
                }
            };
            videoView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.bYL
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    bYE.b(bYE.this, a2, videoView, onPreDrawListener, mediaPlayer);
                }
            });
        } else {
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.bYM
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    bYE.c(bYE.this, a2, videoView, mediaPlayer);
                }
            });
        }
        String packageName = componentActivity.getApplicationContext().getPackageName();
        int i2 = com.netflix.mediaclient.ui.R.m.d;
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + i2));
    }
}
