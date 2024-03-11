package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import o.C1204Sr;
import o.C6195cXj;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bES;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.cXj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6195cXj extends UserMessageAreaView {
    public static final c a = new c(null);
    public static final int c = 8;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx e;
    private Disposable k;
    private final ImageResolutionClass l;

    /* renamed from: o.cXj$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int a() {
        return com.netflix.mediaclient.ui.R.l.y;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean b(String str) {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int h() {
        return com.netflix.mediaclient.ui.R.l.u;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int j() {
        return com.netflix.mediaclient.ui.R.i.bC;
    }

    public final void setShowImageDisposable(Disposable disposable) {
        this.k = disposable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6195cXj(Context context, ImageResolutionClass imageResolutionClass) {
        super(context, UserMessageAreaView.MessageType.DIALOG);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        C8632dsu.c((Object) context, "");
        this.l = imageResolutionClass;
        b = dpB.b(new drO<bES>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaCollectionsView$binding$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final bES invoke() {
                bES a2 = bES.a(C6195cXj.this);
                C8632dsu.a(a2, "");
                return a2;
            }
        });
        this.d = b;
        b2 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaCollectionsView$header$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C1204Sr invoke() {
                bES u;
                u = C6195cXj.this.u();
                return u.j;
            }
        });
        this.e = b2;
        b3 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaCollectionsView$backgroundImage$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final NetflixImageView invoke() {
                bES u;
                u = C6195cXj.this.u();
                NetflixImageView netflixImageView = u.f;
                C8632dsu.a(netflixImageView, "");
                return netflixImageView;
            }
        });
        this.b = b3;
    }

    /* renamed from: o.cXj$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bES u() {
        return (bES) this.d.getValue();
    }

    private final TextView w() {
        Object value = this.e.getValue();
        C8632dsu.a(value, "");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetflixImageView p() {
        return (NetflixImageView) this.b.getValue();
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void b() {
        String headline;
        super.b();
        setBackgroundResource(com.netflix.mediaclient.ui.R.e.aW);
        UmaAlert umaAlert = this.m;
        if (umaAlert != null && (headline = umaAlert.headline()) != null) {
            w().setText(headline);
        }
        n();
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void e(boolean z) {
        super.e(z);
        Disposable disposable = this.k;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void n() {
        String backgroundImageUrlLow;
        Map d2;
        Map k;
        Throwable th;
        ImageResolutionClass imageResolutionClass = this.l;
        int i = imageResolutionClass == null ? -1 : d.d[imageResolutionClass.ordinal()];
        if (i == 1) {
            UmaAlert umaAlert = this.m;
            if (umaAlert != null) {
                backgroundImageUrlLow = umaAlert.backgroundImageUrlLow();
            }
            backgroundImageUrlLow = null;
        } else if (i == 2) {
            UmaAlert umaAlert2 = this.m;
            if (umaAlert2 != null) {
                backgroundImageUrlLow = umaAlert2.backgroundImageUrlMedium();
            }
            backgroundImageUrlLow = null;
        } else if (i == 3) {
            UmaAlert umaAlert3 = this.m;
            if (umaAlert3 != null) {
                backgroundImageUrlLow = umaAlert3.backgroundImageUrlHigh();
            }
            backgroundImageUrlLow = null;
        } else if (C8120deQ.a()) {
            UmaAlert umaAlert4 = this.m;
            if (umaAlert4 != null) {
                backgroundImageUrlLow = umaAlert4.backgroundImageUrlLow();
            }
            backgroundImageUrlLow = null;
        } else {
            UmaAlert umaAlert5 = this.m;
            if (umaAlert5 != null) {
                backgroundImageUrlLow = umaAlert5.backgroundImageUrlHigh();
            }
            backgroundImageUrlLow = null;
        }
        if (backgroundImageUrlLow == null || backgroundImageUrlLow.length() == 0) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Got null or empty image url for collections UMA", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        p().showImage(new ShowImageRequest().a(backgroundImageUrlLow).a(true).a(new a(System.currentTimeMillis(), this)));
    }

    /* renamed from: o.cXj$a */
    /* loaded from: classes5.dex */
    public static final class a implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ C6195cXj a;
        final /* synthetic */ long d;

        a(long j, C6195cXj c6195cXj) {
            this.d = j;
            this.a = c6195cXj;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: e */
        public void onSuccess(ShowImageRequest.a aVar) {
            C8632dsu.c((Object) aVar, "");
            if (System.currentTimeMillis() - this.d <= 250 || C9737vz.a(this.a.getContext()) || C8120deQ.a()) {
                this.a.p().setAlpha(1.0f);
            } else {
                this.a.p().animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator());
            }
            this.a.setShowImageDisposable(null);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
            this.a.setShowImageDisposable(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            Map d;
            Map k;
            Throwable th2;
            C8632dsu.c((Object) th, "");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Could not load image for collections UMA", th, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                th2 = c1596aHd.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        }
    }
}
