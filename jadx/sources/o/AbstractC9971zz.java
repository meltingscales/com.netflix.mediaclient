package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import com.netflix.android.widgetry.widget.menu.MenuController;
import com.netflix.android.widgetry.widget.menu.MenuDialogFragment$loadController$2;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import o.AbstractC9971zz;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.zz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9971zz<T> extends NetflixDialogFrag {
    private Disposable a;
    private ViewGroup d;
    private View e;
    private MenuController<T> f;
    private final Runnable g;
    private ImageButton h;
    private Disposable i;
    private Observable<MenuController<T>> j;
    private boolean k = true;
    private final Runnable l;
    private Disposable m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final Observable<T> f13936o;
    private final Integer p;
    private ProgressBar q;
    private final ViewGroup.LayoutParams r;
    private RecyclerView s;
    private final PublishSubject<T> t;
    private final ValueAnimator w;
    private final boolean x;
    private final long y;
    public static final a c = new a(null);
    public static final int b = 8;

    public int b() {
        return com.netflix.mediaclient.ui.R.i.aF;
    }

    public abstract void c(NetflixActivity netflixActivity, Bundle bundle);

    public final void c(Observable<MenuController<T>> observable) {
        this.j = observable;
    }

    public final Observable<T> e() {
        return this.f13936o;
    }

    /* renamed from: o.zz$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public AbstractC9971zz(long j, boolean z, ViewGroup.LayoutParams layoutParams, Integer num, boolean z2) {
        this.y = j;
        this.n = z;
        this.r = layoutParams;
        this.p = num;
        this.x = z2;
        PublishSubject<T> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.t = create;
        C8632dsu.d(create);
        this.f13936o = create;
        this.l = new Runnable() { // from class: o.zA
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9971zz.o(AbstractC9971zz.this);
            }
        };
        this.g = new Runnable() { // from class: o.zx
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9971zz.g(AbstractC9971zz.this);
            }
        };
        this.w = new ValueAnimator();
        setStyle(0, com.netflix.mediaclient.ui.R.l.k);
        if (z2) {
            return;
        }
        Slide slide = new Slide();
        slide.setSlideEdge(80);
        slide.setDuration(j);
        setEnterTransition(slide);
        setExitTransition(slide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AbstractC9971zz abstractC9971zz) {
        ViewStub viewStub;
        C8632dsu.c((Object) abstractC9971zz, "");
        if (abstractC9971zz.q == null) {
            View view = abstractC9971zz.getView();
            View inflate = (view == null || (viewStub = (ViewStub) view.findViewById(com.netflix.mediaclient.ui.R.g.dB)) == null) ? null : viewStub.inflate();
            abstractC9971zz.q = inflate instanceof ProgressBar ? inflate : null;
        }
        ProgressBar progressBar = abstractC9971zz.q;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AbstractC9971zz abstractC9971zz) {
        C8632dsu.c((Object) abstractC9971zz, "");
        ImageButton imageButton = abstractC9971zz.h;
        if (imageButton == null) {
            return;
        }
        imageButton.setVisibility(0);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        super.onCreate(bundle);
        if (getActivity() instanceof NetflixActivity) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("ShareDialogFragment - arguments null", null, null, true, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                dismiss();
                return;
            }
            this.k = arguments.getBoolean("DismissOnSelection", true);
            FragmentActivity activity = getActivity();
            C8632dsu.d(activity);
            c((NetflixActivity) activity, arguments);
            return;
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        String str = "MenuDialogFragment - activity " + (getActivity() == null ? "null" : "not NetflixActivity");
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd2 = new C1596aHd(str, null, null, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd2.a;
        if (errorType2 != null) {
            c1596aHd2.e.put("errorType", errorType2.c());
            String b3 = c1596aHd2.b();
            if (b3 != null) {
                c1596aHd2.a(errorType2.c() + " " + b3);
            }
        }
        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
            th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
        } else if (c1596aHd2.b() != null) {
            th = new Throwable(c1596aHd2.b());
        } else {
            Throwable th4 = c1596aHd2.i;
            if (th4 == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                th = th4;
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a3 = dVar2.a();
        if (a3 != null) {
            a3.e(c1596aHd2, th);
        } else {
            dVar2.e().b(c1596aHd2, th);
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(b(), viewGroup, false);
        View findViewById = inflate.findViewById(com.netflix.mediaclient.ui.R.g.w);
        C8632dsu.a(findViewById, "");
        this.d = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(com.netflix.mediaclient.ui.R.g.dH);
        C8632dsu.a(findViewById2, "");
        this.s = (RecyclerView) findViewById2;
        if (this.x) {
            n();
        } else {
            ViewGroup viewGroup2 = this.d;
            if (viewGroup2 == null) {
                C8632dsu.d("");
                viewGroup2 = null;
            }
            viewGroup2.setVisibility(0);
            ViewGroup viewGroup3 = this.d;
            if (viewGroup3 == null) {
                C8632dsu.d("");
                viewGroup3 = null;
            }
            viewGroup3.getBackground().mutate().setAlpha(PrivateKeyType.INVALID);
        }
        d();
        if (this.n) {
            ViewStub viewStub = (ViewStub) inflate.findViewById(com.netflix.mediaclient.ui.R.g.ay);
            View inflate2 = viewStub != null ? viewStub.inflate() : null;
            ImageButton imageButton = inflate2 instanceof ImageButton ? (ImageButton) inflate2 : null;
            this.h = imageButton;
            if (imageButton != null) {
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.zy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC9971zz.d(AbstractC9971zz.this, view);
                    }
                });
            }
            ViewStub viewStub2 = (ViewStub) inflate.findViewById(com.netflix.mediaclient.ui.R.g.T);
            this.e = viewStub2 != null ? viewStub2.inflate() : null;
        }
        h();
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC9971zz abstractC9971zz, View view) {
        C8632dsu.c((Object) abstractC9971zz, "");
        abstractC9971zz.dismiss();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (this.x) {
            m();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireActivity(), com.netflix.mediaclient.ui.R.l.k);
        Window window = dialog.getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = com.netflix.mediaclient.ui.R.l.d;
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (!BrowseExperience.e()) {
                systemUiVisibility |= 512;
            } else if (Build.VERSION.SDK_INT >= 26) {
                systemUiVisibility |= 528;
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
        }
        return dialog;
    }

    private final void h() {
        Observable<MenuController<T>> take;
        Observable<MenuController<T>> subscribeOn;
        Observable<MenuController<T>> observeOn;
        g();
        C8187dfe.a(this.g, 750L);
        Observable<MenuController<T>> observable = this.j;
        ViewGroup viewGroup = null;
        this.i = (observable == null || (take = observable.take(1L)) == null || (subscribeOn = take.subscribeOn(Schedulers.io())) == null || (observeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread())) == null) ? null : SubscribersKt.subscribeBy$default(observeOn, new drM<Throwable, dpR>(this) { // from class: com.netflix.android.widgetry.widget.menu.MenuDialogFragment$loadController$1
            final /* synthetic */ AbstractC9971zz<T> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.e = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("MenuDialogFragment - Error emitted by controller observable", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                this.e.dismiss();
            }
        }, (drO) null, new MenuDialogFragment$loadController$2(this), 2, (Object) null);
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 == null) {
            C8632dsu.d("");
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: o.zE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC9971zz.b(AbstractC9971zz.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC9971zz abstractC9971zz, View view) {
        C8632dsu.c((Object) abstractC9971zz, "");
        abstractC9971zz.dismiss();
    }

    public final NetflixActivity i() {
        Map d2;
        Map k;
        Throwable th;
        FragmentActivity activity = getActivity();
        if (activity instanceof NetflixActivity) {
            return (NetflixActivity) activity;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str = "MenuDialogFragment - activity " + (getActivity() == null ? "null" : "not NetflixActivity");
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType.c() + " " + b2);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
        dismiss();
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (this.x) {
            j();
        } else {
            dismissAllowingStateLoss();
        }
    }

    public void a() {
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.m;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.i;
        if (disposable3 != null) {
            disposable3.dispose();
        }
    }

    protected void d() {
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            C8632dsu.d("");
            viewGroup = null;
        }
        viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.zF
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets b2;
                b2 = AbstractC9971zz.b(AbstractC9971zz.this, view, windowInsets);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets b(AbstractC9971zz abstractC9971zz, View view, WindowInsets windowInsets) {
        C8632dsu.c((Object) abstractC9971zz, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) windowInsets, "");
        RecyclerView recyclerView = abstractC9971zz.s;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            C8632dsu.d("");
            recyclerView = null;
        }
        C9870yD.d(recyclerView, 1, windowInsets.getSystemWindowInsetTop());
        RecyclerView recyclerView3 = abstractC9971zz.s;
        if (recyclerView3 == null) {
            C8632dsu.d("");
        } else {
            recyclerView2 = recyclerView3;
        }
        C9870yD.d(recyclerView2, 3, windowInsets.getSystemWindowInsetBottom());
        ImageButton imageButton = abstractC9971zz.h;
        if (imageButton != null) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            C1332Xp c1332Xp = C1332Xp.b;
            C9870yD.d(imageButton, 3, systemWindowInsetBottom + ((int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        }
        View view2 = abstractC9971zz.e;
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public Disposable a(Observable<T> observable, final PublishSubject<T> publishSubject, final boolean z) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) publishSubject, "");
        Observable<T> take = observable.take(1L);
        final drM<T, dpR> drm = new drM<T, dpR>() { // from class: com.netflix.android.widgetry.widget.menu.MenuDialogFragment$getClickItemSubscription$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                c(obj);
                return dpR.c;
            }

            public final void c(T t) {
                publishSubject.onNext(t);
                publishSubject.onComplete();
                if (z) {
                    this.dismiss();
                }
            }
        };
        return take.subscribe(new Consumer() { // from class: o.zB
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC9971zz.a(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void g() {
        C8187dfe.a(this.l, 750L);
    }

    public final void f() {
        C8187dfe.e(this.l);
        ProgressBar progressBar = this.q;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        dismiss();
        return true;
    }

    private final void n() {
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            C8632dsu.d("");
            viewGroup = null;
        }
        viewGroup.setVisibility(4);
        this.w.setDuration(this.y);
        this.w.setInterpolator(new AccelerateDecelerateInterpolator());
        this.w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.zG
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC9971zz.e(AbstractC9971zz.this, valueAnimator);
            }
        });
        this.w.setFloatValues(0.0f);
        this.w.addListener(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC9971zz abstractC9971zz, ValueAnimator valueAnimator) {
        Drawable mutate;
        C8632dsu.c((Object) abstractC9971zz, "");
        C8632dsu.c((Object) valueAnimator, "");
        RecyclerView recyclerView = abstractC9971zz.s;
        ViewGroup viewGroup = null;
        if (recyclerView == null) {
            C8632dsu.d("");
            recyclerView = null;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        Object animatedValue = abstractC9971zz.w.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        float f = 1;
        float f2 = measuredHeight;
        RecyclerView recyclerView2 = abstractC9971zz.s;
        if (recyclerView2 == null) {
            C8632dsu.d("");
            recyclerView2 = null;
        }
        recyclerView2.setTranslationY((f - floatValue) * f2);
        ViewGroup viewGroup2 = abstractC9971zz.d;
        if (viewGroup2 == null) {
            C8632dsu.d("");
            viewGroup2 = null;
        }
        Drawable background = viewGroup2.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setAlpha((int) (((float) PrivateKeyType.INVALID) * floatValue));
            ViewGroup viewGroup3 = abstractC9971zz.d;
            if (viewGroup3 == null) {
                C8632dsu.d("");
                viewGroup3 = null;
            }
            viewGroup3.invalidate();
        }
        ViewGroup viewGroup4 = abstractC9971zz.d;
        if (viewGroup4 == null) {
            C8632dsu.d("");
            viewGroup4 = null;
        }
        viewGroup4.requestLayout();
        if (floatValue > 0.1d) {
            ViewGroup viewGroup5 = abstractC9971zz.d;
            if (viewGroup5 == null) {
                C8632dsu.d("");
                viewGroup5 = null;
            }
            if (viewGroup5.getVisibility() == 4) {
                ViewGroup viewGroup6 = abstractC9971zz.d;
                if (viewGroup6 == null) {
                    C8632dsu.d("");
                } else {
                    viewGroup = viewGroup6;
                }
                viewGroup.setVisibility(0);
            }
        }
    }

    /* renamed from: o.zz$d */
    /* loaded from: classes2.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ AbstractC9971zz<T> a;

        d(AbstractC9971zz<T> abstractC9971zz) {
            this.a = abstractC9971zz;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            Object animatedValue = ((AbstractC9971zz) this.a).w.getAnimatedValue();
            C8632dsu.d(animatedValue);
            if (C9913yu.a(((Float) animatedValue).floatValue(), 0.0f)) {
                this.a.dismissAllowingStateLoss();
            }
        }
    }

    private final void m() {
        if (this.w.isRunning()) {
            this.w.cancel();
        }
        ValueAnimator valueAnimator = this.w;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), 1.0f);
        this.w.start();
    }

    private final void j() {
        if (this.w.isRunning()) {
            this.w.cancel();
        }
        ValueAnimator valueAnimator = this.w;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), 0.0f);
        this.w.start();
    }
}
