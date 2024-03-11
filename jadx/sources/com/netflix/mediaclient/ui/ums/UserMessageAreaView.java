package com.netflix.mediaclient.ui.ums;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.UserInput;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.NotifyUms;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.ListOfMoviesSummary;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import o.AbstractC5164btb;
import o.ActivityC6188cXc;
import o.C1044Mm;
import o.C1203Sq;
import o.C1282Vr;
import o.C1596aHd;
import o.C3983bRx;
import o.C4000bSn;
import o.C5087bsD;
import o.C6004cQk;
import o.C6186cXa;
import o.C6196cXk;
import o.C8054ddD;
import o.C8126deW;
import o.C8150deu;
import o.C8166dfJ;
import o.C8168dfL;
import o.C8237dgb;
import o.C8263dhA;
import o.C8310dhv;
import o.C9618tM;
import o.C9870yD;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC5844cKl;
import o.InterfaceC6373ccA;
import o.InterfaceC6419ccu;
import o.InterfaceC6746cjC;
import o.InterfaceC6761cjR;
import o.aMX;
import o.bDM;
import o.cNT;
import o.cQQ;
import o.cWM;
import o.cWX;
import o.cWY;
import o.dpR;
import o.drM;
import o.drO;
import org.json.JSONException;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes5.dex */
public class UserMessageAreaView extends cWM {
    private final ViewPropertyAnimator a;
    private NetflixDialogFrag b;
    private PublishSubject<Boolean> c;
    @Inject
    public CollectPhone collectPhone;
    private final Space d;
    private Long e;
    public final View f;
    public ViewGroup g;
    public final NetflixImageView h;
    public final TextView i;
    protected final TextView j;
    private InterfaceC6373ccA k;
    private final ValueAnimator l;
    @Inject
    public LoginApi loginApi;
    public UmaAlert m;
    @Inject
    public Lazy<InterfaceC6761cjR> mhuEbiApiLazy;
    public final TextView n;

    /* renamed from: o  reason: collision with root package name */
    public MessageType f13325o;
    private Long p;
    @Inject
    public InterfaceC5844cKl profileApi;
    @Inject
    public cNT profileSelectionLauncher;
    private LifecycleOwner q;
    private Long r;
    private Space s;
    private final cQQ t;
    private Long y;

    /* loaded from: classes5.dex */
    public enum MessageType {
        BANNER,
        TOOLTIP,
        DIALOG,
        SHEET
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
    }

    protected boolean bL_() {
        return true;
    }

    protected void f() {
    }

    protected boolean g() {
        return false;
    }

    protected void i() {
    }

    protected boolean l() {
        return true;
    }

    public Observable<Boolean> q() {
        return this.c;
    }

    public LifecycleOwner t() {
        return this.q;
    }

    protected boolean v() {
        return true;
    }

    public UserMessageAreaView(Context context, MessageType messageType) {
        super(context);
        this.t = new cQQ();
        this.c = PublishSubject.create();
        this.f13325o = messageType;
        View.inflate(context, j(), this);
        TextView textView = (TextView) findViewById(R.g.gr);
        this.n = textView;
        if (textView != null && bL_()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView2 = (TextView) findViewById(R.g.U);
        this.i = textView2;
        if (l()) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.g = (ViewGroup) findViewById(R.g.aC);
        TextView textView3 = (TextView) findViewById(R.g.bY);
        this.j = textView3;
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.h = (NetflixImageView) findViewById(R.g.cv);
        this.f = findViewById(R.g.f13247o);
        this.d = (Space) findViewById(R.g.bb);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        C8310dhv.c(this.g);
        ViewPropertyAnimator animate = animate();
        this.a = animate;
        animate.setDuration(getResources().getInteger(17694721));
        animate.setListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (UserMessageAreaView.this.isAttachedToWindow()) {
                    InterfaceC1593aHa.b("Uma Banner shrinkAnimator start");
                    UserMessageAreaView.this.l.start();
                }
            }
        });
        ValueAnimator valueAnimator = new ValueAnimator();
        this.l = valueAnimator;
        valueAnimator.setStartDelay(20L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(getResources().getInteger(17694721));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (UserMessageAreaView.this.isAttachedToWindow()) {
                    InterfaceC1593aHa.b("Uma Banner shrinkAnimator update");
                    View view = UserMessageAreaView.this.m.blocking() ? UserMessageAreaView.this.s : UserMessageAreaView.this;
                    if (valueAnimator2.getAnimatedFraction() != 1.0f) {
                        if (view != null) {
                            view.getLayoutParams().height = Math.max(1, (int) (view.getMeasuredHeight() - (valueAnimator2.getAnimatedFraction() * view.getMeasuredHeight())));
                            view.requestLayout();
                            return;
                        }
                        return;
                    }
                    UserMessageAreaView.this.k.setHeaderView(null);
                    if (UserMessageAreaView.this.m.blocking()) {
                        C8166dfJ.b("SPY-18152: UMAs should only be removed on the main thread");
                        ((ViewGroup) UserMessageAreaView.this.getParent()).removeView(UserMessageAreaView.this);
                    }
                }
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (UserMessageAreaView.this.isAttachedToWindow()) {
                    InterfaceC1593aHa.b("Uma Banner shrinkAnimator end");
                    UserMessageAreaView.this.k.setHeaderView(null);
                }
            }
        });
        if (messageType == MessageType.BANNER) {
            setVisibility(8);
        }
    }

    protected int j() {
        return this.f13325o == MessageType.BANNER ? R.i.bD : R.i.bE;
    }

    public void a(UmaAlert umaAlert, InterfaceC6373ccA interfaceC6373ccA, ViewGroup viewGroup) {
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            InterfaceC1593aHa.b("Uma Banner showBanner start");
            this.k = interfaceC6373ccA;
            this.m = umaAlert;
            b();
            setVisibility(0);
            if (this.m.blocking()) {
                C9870yD.b((View) this, 1, netflixActivity.getGlobalNavBarHeight());
                if (!InterfaceC6419ccu.c.b(getContext())) {
                    getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.6
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            UserMessageAreaView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            UserMessageAreaView.this.s = new Space(UserMessageAreaView.this.getContext());
                            UserMessageAreaView.this.s.setLayoutParams(new AbsListView.LayoutParams(-1, UserMessageAreaView.this.f.getMeasuredHeight()));
                            UserMessageAreaView.this.k.setHeaderView(UserMessageAreaView.this.s);
                        }
                    });
                }
                AccessibilityUtils.d(viewGroup, this, true);
                if (!TextUtils.isEmpty(umaAlert.title())) {
                    AccessibilityUtils.b(netflixActivity, umaAlert.title());
                } else if (!TextUtils.isEmpty(umaAlert.body())) {
                    AccessibilityUtils.b(netflixActivity, umaAlert.body());
                }
                viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -1));
                InterfaceC1593aHa.b("Uma Banner [blocking] addView");
                this.d.setVisibility(0);
                setBackgroundResource(R.c.x);
            } else if (InterfaceC6419ccu.c.b(getContext())) {
                viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -2));
                InterfaceC1593aHa.b("Uma Banner [nonblocking] addView");
                C9870yD.b((View) this, 1, netflixActivity.getGlobalNavBarHeight() + C9870yD.c(netflixActivity));
                setBackgroundResource(R.c.x);
            } else {
                this.k.setHeaderView(this);
                this.d.setVisibility(8);
                setBackground(null);
            }
            y();
            InterfaceC1593aHa.b("Uma Banner showBanner complete");
            C1044Mm.e("UserMessageAreaView", "Displaying uma alert for banner created on " + new Date(this.m.timestamp()));
        }
    }

    public void a(UmaAlert umaAlert, NetflixDialogFrag netflixDialogFrag) {
        if (((NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class)) != null) {
            this.m = umaAlert;
            this.b = netflixDialogFrag;
            b();
            C1044Mm.e("UserMessageAreaView", "Displaying uma alert for modal created on " + new Date(this.m.timestamp()));
        }
    }

    public void y() {
        TrackingInfo trackingInfo;
        NetflixActivity netflixActivity;
        UmaAlert umaAlert = this.m;
        if (umaAlert == null) {
            return;
        }
        try {
        } catch (Throwable unused) {
            InterfaceC1598aHf.a(new C1596aHd("Bad UMA trackingInfo " + this.m.trackingInfo()).b(false));
        }
        if (umaAlert.trackingInfo() != null) {
            String trackingInfo2 = this.m.trackingInfo();
            if (C8168dfL.h(trackingInfo2)) {
                trackingInfo = C1282Vr.a(new JSONObject(trackingInfo2));
                this.p = Logger.INSTANCE.startSession(new Presentation(AppView.umsAlert, trackingInfo));
                if (this.m.umsAlertRenderFeedback() != null || (netflixActivity = (NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class)) == null) {
                }
                netflixActivity.getServiceManager().c(this.m.umsAlertRenderFeedback());
                return;
            }
        }
        trackingInfo = null;
        this.p = Logger.INSTANCE.startSession(new Presentation(AppView.umsAlert, trackingInfo));
        if (this.m.umsAlertRenderFeedback() != null) {
        }
    }

    public void x() {
        Logger.INSTANCE.endSession(this.p);
        this.p = null;
    }

    public void d(UmaCta umaCta, UserInput userInput) {
        TrackingInfo trackingInfo;
        NetflixActivity netflixActivity;
        final String trackingInfo2;
        new C8263dhA().e(umaCta.trackingInfo());
        try {
            trackingInfo2 = umaCta.trackingInfo();
        } catch (Throwable unused) {
            InterfaceC1598aHf.a(new C1596aHd("Bad UMA cta trackingInfo " + umaCta.trackingInfo()).b(false));
        }
        if (C8168dfL.h(trackingInfo2)) {
            trackingInfo = new TrackingInfo() { // from class: o.cXE
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject a;
                    a = UserMessageAreaView.a(trackingInfo2);
                    return a;
                }
            };
            Logger logger = Logger.INSTANCE;
            this.e = logger.startSession(new Focus(AppView.umsAlertButton, trackingInfo));
            this.y = Long.valueOf(logger.addContext(userInput));
            this.r = logger.startSession(new SubmitCommand());
            if (umaCta.umsAlertCtaFeedback() != null || (netflixActivity = (NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class)) == null) {
            }
            netflixActivity.getServiceManager().c(umaCta.umsAlertCtaFeedback());
            return;
        }
        trackingInfo = null;
        Logger logger2 = Logger.INSTANCE;
        this.e = logger2.startSession(new Focus(AppView.umsAlertButton, trackingInfo));
        this.y = Long.valueOf(logger2.addContext(userInput));
        this.r = logger2.startSession(new SubmitCommand());
        if (umaCta.umsAlertCtaFeedback() != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject a(String str) {
        return new JSONObject(str);
    }

    public void r() {
        d((Error) null);
    }

    void d(Error error) {
        if (error != null) {
            ExtLogger.INSTANCE.logError(error);
        }
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.r);
        logger.removeContext(this.y);
        logger.endSession(this.e);
    }

    public void e(boolean z) {
        if (this.m != null) {
            C8166dfJ.b("SPY-18152: UMAs should only be removed on the main thread");
            if (this.f13325o != MessageType.BANNER) {
                NetflixDialogFrag netflixDialogFrag = this.b;
                if (netflixDialogFrag == null || !netflixDialogFrag.isAdded()) {
                    return;
                }
                this.b.dismissAllowingStateLoss();
                return;
            }
            x();
            if (z && this.m.blocking()) {
                InterfaceC1593aHa.b("Uma Banner dismiss [with animation] started");
                this.a.alpha(0.0f);
                ViewParent parent = getParent();
                if (parent instanceof ViewGroup) {
                    AccessibilityUtils.d((ViewGroup) parent, this, false);
                }
            } else {
                InterfaceC1593aHa.b("Uma Banner dismiss [no animation] started");
                if (this.m.blocking()) {
                    InterfaceC1593aHa.b("Uma Banner [blocking] removeView");
                    ViewParent parent2 = getParent();
                    if (parent2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent2;
                        AccessibilityUtils.d(viewGroup, this, false);
                        viewGroup.removeView(this);
                    }
                    this.k.setHeaderView(null);
                } else {
                    InterfaceC1593aHa.b("Uma Banner [non-blocking] removeView");
                    if (C8150deu.g()) {
                        ViewParent parent3 = getParent();
                        if (parent3 instanceof ViewGroup) {
                            ((ViewGroup) parent3).removeView(this);
                        }
                    } else {
                        this.k.setHeaderView(null);
                    }
                }
            }
            InterfaceC1593aHa.b("Uma Banner dismiss complete");
        }
    }

    public void e(UmaAlert umaAlert) {
        this.m = umaAlert;
        boolean z = this.b != null ? umaAlert.modalAlert() && this.b.isVisible() : umaAlert.bannerAlert() && isAttachedToWindow();
        if (z) {
            x();
        }
        b();
        if (z) {
            y();
        }
    }

    public void b() {
        if (this.n != null) {
            String bannerTitle = this.f13325o == MessageType.BANNER ? this.m.bannerTitle() : this.m.title();
            this.n.setText(bannerTitle == null ? null : C8168dfL.c(bannerTitle));
        }
        MessageType messageType = this.f13325o;
        MessageType messageType2 = MessageType.BANNER;
        String bannerBody = messageType == messageType2 ? this.m.bannerBody() : this.m.body();
        this.i.setText(bannerBody != null ? C8168dfL.c(bannerBody) : null);
        if (this.j != null) {
            String footer = this.m.footer();
            if (C8168dfL.h(footer)) {
                this.j.setText(C8168dfL.c(footer));
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
        }
        if (v()) {
            this.g.removeAllViews();
        }
        f();
        boolean g = g();
        k();
        i();
        if (g || this.h == null) {
            return;
        }
        String bannerIcon = this.f13325o == messageType2 ? this.m.bannerIcon() : this.m.icon();
        if (TextUtils.isEmpty(bannerIcon)) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        b(bannerIcon);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b(String str) {
        char c;
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case 3237038:
                if (lowerCase.equals(UmaAlert.ICON_INFO)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3641990:
                if (lowerCase.equals(UmaAlert.ICON_WARN)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (lowerCase.equals(UmaAlert.ICON_ERROR)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1934780818:
                if (lowerCase.equals(UmaAlert.ICON_WHATSAPP)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.h.setImageResource(R.e.f13243J);
            this.h.setColorFilter(ContextCompat.getColor(getContext(), R.c.h));
            return true;
        } else if (c == 1) {
            this.h.setImageResource(R.e.an);
            this.h.setColorFilter(ContextCompat.getColor(getContext(), R.c.i));
            return true;
        } else if (c == 2) {
            this.h.setImageResource(R.e.an);
            this.h.setColorFilter(ContextCompat.getColor(getContext(), R.c.j));
            return true;
        } else if (c == 3) {
            this.h.setImageResource(R.e.aq);
            return true;
        } else {
            this.h.setVisibility(8);
            return false;
        }
    }

    public void k() {
        boolean z = true;
        boolean z2 = this.f13325o == MessageType.BANNER;
        UmaAlert umaAlert = this.m;
        List<UmaCta> bannerCtas = z2 ? umaAlert.bannerCtas() : umaAlert.ctas();
        if (bannerCtas == null || bannerCtas.isEmpty()) {
            return;
        }
        if (bannerCtas.size() >= 1 && bannerCtas.get(0) != null) {
            c(bannerCtas.get(0), R.g.gI, (z2 || bannerCtas.size() < 2 || bannerCtas.get(1) == null) ? false : true);
        }
        if (bannerCtas.size() >= 2 && bannerCtas.get(1) != null) {
            c(bannerCtas.get(1), R.g.gF, (z2 || bannerCtas.size() < 3 || bannerCtas.get(2) == null) ? false : true);
        }
        if (bannerCtas.size() < 3 || bannerCtas.get(2) == null) {
            return;
        }
        if (z2 || bannerCtas.size() < 4 || bannerCtas.get(3) == null) {
            z = false;
        }
        c(bannerCtas.get(2), R.g.gH, z);
    }

    public int a() {
        return this.f13325o == MessageType.BANNER ? R.l.C : R.l.E;
    }

    public int h() {
        return this.f13325o == MessageType.BANNER ? R.l.z : R.l.B;
    }

    public void b(View view) {
        this.g.addView(view, new ViewGroup.LayoutParams(-1, -2));
    }

    public void c(UmaCta umaCta, int i) {
        c(umaCta, i, false);
    }

    public void c(UmaCta umaCta, int i, boolean z) {
        TextView button;
        try {
            button = new C1203Sq(new ContextThemeWrapper(getContext(), umaCta.selected() ? a() : h()));
            TextViewCompat.setTextAppearance(button, umaCta.selected() ? a() : h());
        } catch (IndexOutOfBoundsException e) {
            InterfaceC1598aHf.e("SPY-13671 - NetflixTextButton with font-family failed", e);
            try {
                button = new C1203Sq(new ContextThemeWrapper(getContext(), R.l.i));
            } catch (IndexOutOfBoundsException e2) {
                InterfaceC1598aHf.e("SPY-13671 - NetflixTextButton with NetflixButtonDebugForSPY13671 failed", e2);
                try {
                    button = new AppCompatButton(new ContextThemeWrapper(getContext(), R.l.i));
                } catch (IndexOutOfBoundsException e3) {
                    InterfaceC1598aHf.e("SPY-13671 - AppCompatButton with NetflixButtonDebugForSPY13671 failed", e3);
                    try {
                        button = new AppCompatButton(NetflixApplication.getInstance());
                        button.setTextColor(-1);
                    } catch (IndexOutOfBoundsException e4) {
                        InterfaceC1598aHf.e("SPY-13671 - AppCompatButton without style failed", e4);
                        try {
                            button = new Button(new ContextThemeWrapper(getContext(), R.l.i));
                        } catch (IndexOutOfBoundsException e5) {
                            InterfaceC1598aHf.e("SPY-13671 - Button with NetflixButtonDebugForSPY13671 failed (last resort, no UMA for this device!!", e5);
                            return;
                        }
                    }
                }
            }
        }
        button.setText(umaCta.text());
        button.setId(i);
        if (this.f13325o == MessageType.BANNER) {
            this.g.addView(button, new ViewGroup.LayoutParams(-2, -2));
        } else {
            b(button);
        }
        this.g.setVisibility(0);
        this.g.requestLayout();
        button.setOnClickListener(e(umaCta));
        if (z) {
            int o2 = o();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, o2);
            button.setLayoutParams(layoutParams);
        }
    }

    public View.OnClickListener e(UmaCta umaCta) {
        if (TextUtils.equals(UmaCta.ACTION_TYPE_LINK, umaCta.actionType())) {
            return h(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_RETRY_PAYMENT, umaCta.action())) {
            return p(umaCta);
        }
        if (TextUtils.equals("BACKGROUND_CALL", umaCta.actionType()) && TextUtils.equals(UmaCta.ACTION_UNPAUSE_MEMBERSHIP, umaCta.action())) {
            return s(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_RESTART_MEMBERSHIP, umaCta.action())) {
            return n(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_TYPE_UMS_IMPRESSION, umaCta.actionType()) && TextUtils.equals(UmaCta.ACTION_NOT_NOW, umaCta.action())) {
            return a(umaCta, true);
        }
        if (TextUtils.equals("BACKGROUND_CALL", umaCta.actionType()) && TextUtils.equals("DISMISS", umaCta.action())) {
            return a(umaCta, false);
        }
        if (TextUtils.equals("BACKGROUND_CALL", umaCta.actionType()) && TextUtils.equals(UmaCta.ACTION_CONNECT_TO_WHATSAPP, umaCta.action())) {
            return c(umaCta);
        }
        if (TextUtils.equals("BACKGROUND_CALL", umaCta.actionType()) && TextUtils.equals(UmaCta.ACTION_TOU_AGREE, umaCta.action())) {
            return t(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_PRICE_ACKNOWLEDGE, umaCta.action()) && TextUtils.equals("BACKGROUND_CALL", umaCta.actionType())) {
            return k(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_PLAN_ACKNOWLEDGE, umaCta.action()) && TextUtils.equals("BACKGROUND_CALL", umaCta.actionType())) {
            return k(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_PLAN_SELECT, umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return f(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_REFER_FRIENDS, umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return o(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_VIEW_COLLECTION, umaCta.action())) {
            return w(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_COLLECT_PHONE, umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return d(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_PROFILE_GATE, umaCta.action())) {
            return l(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_PROFILE_SWITCH, umaCta.action())) {
            return m(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_CREATE_PROFILE_KIDS, umaCta.action())) {
            return j(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_SIGN_OUT, umaCta.action())) {
            return r(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_COPY_TEXT, umaCta.action())) {
            return i(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_COPY_LINK, umaCta.action())) {
            return a(umaCta);
        }
        if (TextUtils.equals("EMAIL_CODE_VALIDATION", umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return q(umaCta);
        }
        if (TextUtils.equals("SMS_CODE_VALIDATION", umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return q(umaCta);
        }
        if (TextUtils.equals(UmaCta.ACTION_CREATE_ACCOUNT, umaCta.action()) && TextUtils.equals(UmaCta.ACTION_TYPE_APP_REDIRECT, umaCta.actionType())) {
            return b(umaCta);
        }
        if (TextUtils.equals(UmaCta.MANAGE_PRIMARY_LOCATION, umaCta.action())) {
            return g(umaCta);
        }
        if (TextUtils.equals(UmaCta.MHU_TRAVEL_ALLOW_OTP, umaCta.action())) {
            return g(umaCta);
        }
        return null;
    }

    public int o() {
        return getContext().getResources().getDimensionPixelSize(R.b.aa);
    }

    public void e(NetflixActivity netflixActivity, String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.equals(UmaCta.ACTION_RETRY_PAYMENT, str)) {
            c((String) null, (String) null, netflixActivity, (String) null, true);
        }
        if (TextUtils.equals(UmaCta.ACTION_UNPAUSE_MEMBERSHIP, str)) {
            e((String) null, (String) null, netflixActivity);
        }
    }

    private View.OnClickListener h(final UmaCta umaCta) {
        return cWY.e(umaCta, this, new cWX() { // from class: o.cXN
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.b(umaCta, umaCta2, view, netflixActivity);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(UmaCta umaCta, UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
        NetflixApplication.getInstance().y().c();
        if (umaCta.action() != null) {
            if (umaCta.autoLogin()) {
                ActivityC6188cXc.e(umaCta.action());
            }
            if (this.f13325o == MessageType.BANNER || !umaCta.autoLogin() || umaCta.openLinkInWebView()) {
                e(true);
            }
            if (umaCta.openLinkInWebView()) {
                Intent b = ActivityC6188cXc.b(netflixActivity, umaCta.action(), umaCta.successMessage(), umaCta.failureMessage(), umaCta.autoLogin());
                if (b != null) {
                    netflixActivity.startActivity(b);
                    return;
                }
                return;
            }
            if (umaCta.autoLogin()) {
                d(netflixActivity, umaCta);
            } else {
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(umaCta.action())));
            }
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
            return;
        }
        v(umaCta);
    }

    private void e(final String str, final String str2, NetflixActivity netflixActivity) {
        netflixActivity.getServiceManager().r().c(new MoneyballCallData(SignupConstants.Flow.MEMBER_SIMPLICITY, SignupConstants.Mode.HEADLESS_ACTION_MODE, SignupConstants.Action.UNPAUSE_MEMBERSHIP_ACTION), new aMX() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.9
            @Override // o.aMX
            public void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                C1044Mm.a("UserMessageAreaView", "onDataFetched statusCode=%d", Integer.valueOf(status.c().getValue()));
                if (status.j() && moneyballData != null && moneyballData.getErrorCode() == null) {
                    if (str != null) {
                        C8054ddD.a(UserMessageAreaView.this.getContext(), str, 1);
                        return;
                    }
                    return;
                }
                C1044Mm.e("UserMessageAreaView", "error in fetching Moneyball data status: %s, moneyballData: %s", status, moneyballData);
                if (str2 != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), str2, 1);
                }
            }
        });
    }

    private void c(final String str, final String str2, final NetflixActivity netflixActivity, final String str3, final boolean z) {
        Observable<Status> Q = netflixActivity.getServiceManager().Q();
        if (Q == null) {
            d(new Error(InterfaceC1078Nw.ak.toString(), null, null));
            InterfaceC1598aHf.a("Retry payment rx is null, request is not sent out");
            if (z) {
                this.c.onError(new Throwable("Retry payment rx is null"));
                return;
            }
            if (str2 != null) {
                C8054ddD.a(getContext(), str2, 1);
            }
            netflixActivity.getServiceManager().e(true);
            return;
        }
        Q.observeOn(AndroidSchedulers.mainThread()).take(1L).takeUntil(C9618tM.d(this)).subscribe(new Observer<Status>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.10
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.Observer
            /* renamed from: c */
            public void onNext(Status status) {
                UserMessageAreaView.this.e(true);
                if (status == InterfaceC1078Nw.aJ) {
                    UserMessageAreaView.this.r();
                    if (z) {
                        UserMessageAreaView.this.c.onNext(Boolean.TRUE);
                        UserMessageAreaView.this.c.onComplete();
                        return;
                    } else if (str != null) {
                        C8054ddD.a(UserMessageAreaView.this.getContext(), str, 1);
                        LocalBroadcastManager.getInstance(UserMessageAreaView.this.getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
                        return;
                    } else {
                        return;
                    }
                }
                UserMessageAreaView.this.d(new Error(status.toString(), null, null));
                if (z) {
                    UserMessageAreaView.this.c.onNext(Boolean.FALSE);
                    UserMessageAreaView.this.c.onComplete();
                    return;
                }
                if (str2 != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), str2, 1);
                    InterfaceC1598aHf.a(new C1596aHd("Request (ecom-api) for Retry Payment failed").b(false));
                }
                if (C8168dfL.g(str3)) {
                    return;
                }
                ActivityC6188cXc.e(str3);
                Intent b = ActivityC6188cXc.b(netflixActivity, str3, null, null, true);
                if (b == null || C8054ddD.l(netflixActivity)) {
                    return;
                }
                netflixActivity.startActivity(b);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                UserMessageAreaView.this.d(new Error(InterfaceC1078Nw.ad.toString(), null, null));
                InterfaceC1598aHf.a("Retry Payment request rx exceptioned out");
                if (z) {
                    UserMessageAreaView.this.c.onError(th);
                    return;
                }
                if (str2 != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), str2, 1);
                }
                netflixActivity.getServiceManager().e(true);
            }
        });
    }

    private View.OnClickListener p(UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXO
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.h(umaCta2, view, netflixActivity);
            }
        }, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        c(umaCta.successMessage(), umaCta.failureMessage(), netflixActivity, umaCta.fallbackUrl(), false);
    }

    private View.OnClickListener s(UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXH
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.m(umaCta2, view, netflixActivity);
            }
        }, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        e(umaCta.successMessage(), umaCta.failureMessage(), netflixActivity);
    }

    private View.OnClickListener n(final UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXL
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.f(umaCta, umaCta2, view, netflixActivity);
            }
        }, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final UmaCta umaCta, UmaCta umaCta2, View view, final NetflixActivity netflixActivity) {
        Single<Status> K = netflixActivity.getServiceManager().K();
        if (K == null) {
            d(new Error(InterfaceC1078Nw.ak.toString(), null, null));
            InterfaceC1598aHf.a("Restart membership rx is null, request is not sent out");
            if (umaCta.failureMessage() != null) {
                C8054ddD.a(getContext(), umaCta.failureMessage(), 1);
            }
            netflixActivity.getServiceManager().e(true);
            return;
        }
        K.observeOn(AndroidSchedulers.mainThread()).subscribe(new SingleObserver<Status>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.14
            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: e */
            public void onSuccess(Status status) {
                if (status == InterfaceC1078Nw.aJ) {
                    UserMessageAreaView.this.r();
                    if (umaCta.successMessage() != null) {
                        C8054ddD.a(UserMessageAreaView.this.getContext(), umaCta.successMessage(), 1);
                    }
                    LocalBroadcastManager.getInstance(UserMessageAreaView.this.getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
                    return;
                }
                UserMessageAreaView.this.d(new Error(status.toString(), null, null));
                if (umaCta.failureMessage() != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), umaCta.failureMessage(), 1);
                    InterfaceC1598aHf.a("Request (ecom-api) for Restart Membership failed");
                }
                netflixActivity.getServiceManager().e(true);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                UserMessageAreaView.this.d(new Error(InterfaceC1078Nw.ad.toString(), null, null));
                InterfaceC1598aHf.a("Restart Membership request rx exceptioned out");
                if (umaCta.failureMessage() != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), umaCta.failureMessage(), 1);
                }
                netflixActivity.getServiceManager().e(true);
            }
        });
    }

    private View.OnClickListener c(final UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXy
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.e(umaCta, umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(UmaCta umaCta, UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new NotifyUms(null, null, null, null));
        netflixActivity.getServiceManager().a(this.m.messageName(), umaCta.callback());
        netflixActivity.getServiceManager().I();
        netflixActivity.getServiceManager().b();
        logger.endSession(startSession);
        if (umaCta.successMessage() != null) {
            C8054ddD.a(getContext(), umaCta.successMessage(), 0);
        }
    }

    private View.OnClickListener t(final UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXR
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.j(umaCta, umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(UmaCta umaCta, UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new NotifyUms(null, null, null, null));
        netflixActivity.getServiceManager().a(this.m.messageName(), umaCta.callback());
        new C6004cQk().d().subscribe();
        logger.endSession(startSession);
    }

    private View.OnClickListener a(final UmaCta umaCta, final boolean z) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXu
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.c(z, umaCta, umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z, UmaCta umaCta, UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new NotifyUms(null, null, null, null));
        if (z) {
            netflixActivity.getServiceManager().a(this.m.messageName(), umaCta.callback());
        }
        logger.endSession(startSession);
    }

    private View.OnClickListener k(final UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXs
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.a(umaCta, umaCta2, view, netflixActivity);
            }
        }, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final UmaCta umaCta, UmaCta umaCta2, View view, final NetflixActivity netflixActivity) {
        if (umaCta.parameters() == null) {
            InterfaceC1598aHf.a("Expected UMA view to run in a NetflixActivity");
            return;
        }
        final Long startSession = Logger.INSTANCE.startSession(new NotifyUms(null, null, null, null));
        netflixActivity.getServiceManager().a(this.m.messageName(), umaCta.callback());
        netflixActivity.getServiceManager().c(umaCta.parameters(), new C5087bsD("UserMessageAreaView") { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.11
            @Override // o.C5087bsD, o.InterfaceC5094bsK
            public void c(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
                super.c(updateProductChoiceResponse, status);
                Logger.INSTANCE.endSession(startSession);
                if (status.j()) {
                    UserMessageAreaView.this.r();
                    if (umaCta.successMessage() != null) {
                        C8054ddD.a(UserMessageAreaView.this.getContext(), umaCta.successMessage(), 1);
                        return;
                    }
                    return;
                }
                UserMessageAreaView.this.d(new Error(status.toString(), null, null));
                if (umaCta.failureMessage() != null) {
                    C8054ddD.a(UserMessageAreaView.this.getContext(), umaCta.failureMessage(), 1);
                    InterfaceC1598aHf.a(new C1596aHd("Request updateProductChoiceMap for price change UMA failed").b(false));
                }
                netflixActivity.getServiceManager().e(true);
            }
        });
    }

    private View.OnClickListener f(final UmaCta umaCta) {
        return new View.OnClickListener() { // from class: o.cXt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserMessageAreaView.this.b(umaCta, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(UmaCta umaCta, View view) {
        NetflixActivity netflixActivity;
        C1044Mm.a("UserMessageAreaView", "on plan select click");
        NetflixDialogFrag netflixDialogFrag = this.b;
        if (netflixDialogFrag instanceof C6186cXa) {
            ((C6186cXa) netflixDialogFrag).b(umaCta.trackingInfo(), umaCta.parameters());
        }
        if (umaCta.umsAlertCtaFeedback() == null || (netflixActivity = (NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class)) == null) {
            return;
        }
        netflixActivity.getServiceManager().c(umaCta.umsAlertCtaFeedback());
    }

    private View.OnClickListener o(UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXP
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.i(umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        netflixActivity.startActivity(new Intent(netflixActivity, MoreTabActivity.c()));
    }

    private View.OnClickListener w(final UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXJ
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.g(umaCta, umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(UmaCta umaCta, UmaCta umaCta2, View view, final NetflixActivity netflixActivity) {
        String str;
        String parameters = umaCta.parameters();
        if (C8168dfL.g(parameters)) {
            return;
        }
        try {
            str = new JSONObject(parameters).optString("collection_id");
        } catch (JSONException unused) {
            InterfaceC1598aHf.a("Error while parsing CTA params for view collection UMA");
            str = null;
        }
        String str2 = str;
        if (C8168dfL.g(str2)) {
            InterfaceC1598aHf.a("Invalid or missing genreId in CTA params for view collection UMA");
            return;
        }
        netflixActivity.getServiceManager().j().c(str2, 0, C4000bSn.b(netflixActivity, LoMoType.FLAT_GENRE) - 1, false, false, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.4
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
                super.d(listOfMoviesSummary, list, status);
                if (status.j() && listOfMoviesSummary != null && list != null && C8168dfL.h(listOfMoviesSummary.getId()) && C8168dfL.h(listOfMoviesSummary.getTitle())) {
                    String title = listOfMoviesSummary.getTitle();
                    String id = listOfMoviesSummary.getId();
                    GenreItem.GenreType genreType = GenreItem.GenreType.GALLERY;
                    int trackId = listOfMoviesSummary.getTrackId();
                    HomeActivity.e(netflixActivity, new DefaultGenreItem(title, id, genreType, trackId, "Collection:" + listOfMoviesSummary.getId(), null));
                    return;
                }
                InterfaceC1598aHf.a("HandleGenre failed for view collection uma.");
            }
        });
    }

    private View.OnClickListener d(UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXD
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.d(umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(UmaCta umaCta, View view, final NetflixActivity netflixActivity) {
        netflixActivity.dismissFullScreenDialog(true);
        netflixActivity.runOnUiThread(new Runnable() { // from class: o.cXA
            @Override // java.lang.Runnable
            public final void run() {
                UserMessageAreaView.this.a(netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NetflixActivity netflixActivity) {
        this.collectPhone.c(netflixActivity, false);
    }

    private View.OnClickListener l(final UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXv
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.c(umaCta, umaCta2, view, netflixActivity);
            }
        }, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(UmaCta umaCta, UmaCta umaCta2, View view, final NetflixActivity netflixActivity) {
        final Runnable runnable = new Runnable() { // from class: o.cXT
            @Override // java.lang.Runnable
            public final void run() {
                UserMessageAreaView.this.c(netflixActivity);
            }
        };
        C6196cXk c6196cXk = new C6196cXk(umaCta, this);
        if (c6196cXk.e()) {
            c6196cXk.c(new C6196cXk.c() { // from class: o.cXQ
                @Override // o.C6196cXk.c
                public final void e(boolean z, String str) {
                    UserMessageAreaView.this.a(runnable, z, str);
                }
            });
            return;
        }
        r();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(NetflixActivity netflixActivity) {
        netflixActivity.startActivity(this.profileSelectionLauncher.d(netflixActivity, AppView.umsAlert));
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable, boolean z, String str) {
        if (!z || C8168dfL.g(str)) {
            d(new Error(InterfaceC1078Nw.ad.toString(), null, null));
        } else {
            r();
        }
        runnable.run();
    }

    private View.OnClickListener m(final UmaCta umaCta) {
        return cWY.d(umaCta, this, new cWX() { // from class: o.cXz
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.i(umaCta, umaCta2, view, netflixActivity);
            }
        }, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(UmaCta umaCta, UmaCta umaCta2, View view, final NetflixActivity netflixActivity) {
        C6196cXk c6196cXk = new C6196cXk(umaCta, this);
        if (c6196cXk.e()) {
            c6196cXk.c(new C6196cXk.c() { // from class: o.cXF
                @Override // o.C6196cXk.c
                public final void e(boolean z, String str) {
                    UserMessageAreaView.this.e(netflixActivity, z, str);
                }
            });
            return;
        }
        netflixActivity.startActivity(this.profileSelectionLauncher.e(netflixActivity, AppView.umsAlert, false, c6196cXk.b()));
        r();
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(NetflixActivity netflixActivity, boolean z, String str) {
        if (!z || C8168dfL.g(str)) {
            d(new Error(InterfaceC1078Nw.ad.toString(), null, null));
        } else {
            r();
        }
        netflixActivity.startActivity(this.profileSelectionLauncher.e(netflixActivity, AppView.umsAlert, false, str));
    }

    private View.OnClickListener j(UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXr
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.j(umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        this.profileApi.c().b(netflixActivity, ProfileCreator.AgeSetting.b, 1002);
    }

    private View.OnClickListener r(UmaCta umaCta) {
        return cWY.e(umaCta, this, false, false, new cWX() { // from class: o.cXx
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.l(umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        netflixActivity.startActivity(this.loginApi.e(netflixActivity));
    }

    private View.OnClickListener i(UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXq
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.g(umaCta2, view, netflixActivity);
            }
        });
    }

    private View.OnClickListener a(UmaCta umaCta) {
        return cWY.e(umaCta, this, new cWX() { // from class: o.cXw
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.f(umaCta2, view, netflixActivity);
            }
        }, false);
    }

    private View.OnClickListener g(final UmaCta umaCta) {
        return cWY.c(umaCta, this, new cWX() { // from class: o.cXI
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.d(umaCta, umaCta2, view, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(UmaCta umaCta, UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
        InterfaceC6761cjR interfaceC6761cjR = this.mhuEbiApiLazy.get();
        this.q = interfaceC6761cjR.c();
        String action = umaCta.action();
        Objects.requireNonNull(action);
        interfaceC6761cjR.e(action, null, umaCta2.trackingInfo(), new drO() { // from class: o.cXK
            @Override // o.drO
            public final Object invoke() {
                dpR dpr;
                dpr = dpR.c;
                return dpr;
            }
        });
    }

    private void v(UmaCta umaCta) {
        InterfaceC1598aHf.a(new C1596aHd("Invalid UMA, no link provided on cta. [uma:" + this.m.messageId() + "/" + this.m.messageName() + "/" + umaCta.actionType() + "]").b(false));
    }

    private View.OnClickListener q(final UmaCta umaCta) {
        return cWY.e(umaCta, this, new cWX() { // from class: o.cXB
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.h(umaCta, umaCta2, view, netflixActivity);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(UmaCta umaCta, UmaCta umaCta2, final View view, NetflixActivity netflixActivity) {
        InterfaceC6746cjC.a(netflixActivity).b(umaCta.action(), umaCta.parameters(), new drM() { // from class: o.cXC
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a;
                a = UserMessageAreaView.this.a((LifecycleOwner) obj);
                return a;
            }
        }, new drO() { // from class: o.cXM
            @Override // o.drO
            public final Object invoke() {
                dpR c;
                c = UserMessageAreaView.c(view);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(LifecycleOwner lifecycleOwner) {
        this.q = lifecycleOwner;
        e(true);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dpR c(View view) {
        view.setEnabled(true);
        return dpR.c;
    }

    private View.OnClickListener b(UmaCta umaCta) {
        return cWY.e(umaCta, this, new cWX() { // from class: o.cXG
            @Override // o.cWX
            public final void d(UmaCta umaCta2, View view, NetflixActivity netflixActivity) {
                UserMessageAreaView.this.a(umaCta2, view, netflixActivity);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UmaCta umaCta, View view, NetflixActivity netflixActivity) {
        this.q = InterfaceC6746cjC.a(netflixActivity).e();
    }

    private void d(final NetflixActivity netflixActivity, final UmaCta umaCta) {
        if (C8126deW.c(netflixActivity) == null) {
            InterfaceC1598aHf.a(new C1596aHd("Unable to generate token, no userAgent").b(false));
            return;
        }
        final C3983bRx c3983bRx = new C3983bRx(netflixActivity);
        final NetworkErrorStatus networkErrorStatus = new NetworkErrorStatus(C8237dgb.c);
        final Runnable runnable = new Runnable() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.5
            @Override // java.lang.Runnable
            public void run() {
                c3983bRx.c(null, networkErrorStatus, umaCta.action());
            }
        };
        netflixActivity.getHandler().postDelayed(runnable, 10000L);
        this.t.c(3600000L).takeUntil(netflixActivity.getActivityDestroy()).subscribe(new bDM<cQQ.d>("UMA createAutoLoginToken") { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaView.2
            @Override // io.reactivex.Observer
            /* renamed from: d */
            public void onNext(cQQ.d dVar) {
                UserMessageAreaView userMessageAreaView = UserMessageAreaView.this;
                if (userMessageAreaView.f13325o != MessageType.BANNER) {
                    userMessageAreaView.e(true);
                }
                netflixActivity.getHandler().removeCallbacks(runnable);
                c3983bRx.c(dVar.b(), dVar.e(), umaCta.action());
            }
        });
    }
}
