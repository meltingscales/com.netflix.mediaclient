package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardCTA;
import com.netflix.model.leafs.originals.BillboardPhase;
import com.netflix.model.leafs.originals.BillboardSummary;
import com.netflix.model.leafs.originals.TagSummary;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.cdp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6467cdp extends BillboardView {
    private static final Interpolator d = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
    private AnimationSet B;
    private boolean E;
    private final BroadcastReceiver F;
    private List<BillboardCTA> G;
    private Disposable H;
    private final BroadcastReceiver I;

    /* renamed from: J  reason: collision with root package name */
    private NetflixTagsTextView f13721J;
    private final ArrayList<TagSummary> M;
    protected Button a;
    protected int b;
    public NetflixImageView c;
    protected TextView e;
    protected NetflixImageView f;

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public int i() {
        return com.netflix.mediaclient.ui.R.i.n;
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public boolean j() {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void m() {
    }

    public C6467cdp(Context context, int i) {
        super(context);
        this.M = new ArrayList<>();
        this.I = new BroadcastReceiver() { // from class: o.cdp.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (C6467cdp.this.E) {
                    C6467cdp.this.setVisibility(0);
                    C6467cdp.this.E = false;
                    C6467cdp.this.a();
                }
            }
        };
        this.F = new BroadcastReceiver() { // from class: o.cdp.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C6467cdp.this.E = true;
            }
        };
        e(i);
    }

    public C6467cdp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.M = new ArrayList<>();
        this.I = new BroadcastReceiver() { // from class: o.cdp.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (C6467cdp.this.E) {
                    C6467cdp.this.setVisibility(0);
                    C6467cdp.this.E = false;
                    C6467cdp.this.a();
                }
            }
        };
        this.F = new BroadcastReceiver() { // from class: o.cdp.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C6467cdp.this.E = true;
            }
        };
        e(i);
    }

    public C6467cdp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.M = new ArrayList<>();
        this.I = new BroadcastReceiver() { // from class: o.cdp.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (C6467cdp.this.E) {
                    C6467cdp.this.setVisibility(0);
                    C6467cdp.this.E = false;
                    C6467cdp.this.a();
                }
            }
        };
        this.F = new BroadcastReceiver() { // from class: o.cdp.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C6467cdp.this.E = true;
            }
        };
        e(i2);
    }

    private void e(int i) {
        this.B = new AnimationSet(false);
        this.b = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        LocalBroadcastManager.getInstance(context).registerReceiver(this.I, new IntentFilter("com.netflix.mediaclient.intent.action.BILLBOARD_ANIMATION_STARTED"));
        LocalBroadcastManager.getInstance(context).registerReceiver(this.F, new IntentFilter("com.netflix.mediaclient.intent.action.BILLBOARD_CHANGED"));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.I);
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.F);
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void b() {
        this.k = (TextView) findViewById(com.netflix.mediaclient.ui.R.g.Q);
        this.n = (TextView) findViewById(com.netflix.mediaclient.ui.R.g.D);
        this.f = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.M);
        this.e = (TextView) findViewById(com.netflix.mediaclient.ui.R.g.z);
        this.c = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.dl);
        this.f13721J = (NetflixTagsTextView) findViewById(com.netflix.mediaclient.ui.R.g.gp);
        o();
    }

    protected void o() {
        this.h = (C1203Sq) findViewById(com.netflix.mediaclient.ui.R.g.C);
        this.i = (C1203Sq) findViewById(com.netflix.mediaclient.ui.R.g.B);
        this.y = (C1206St) findViewById(com.netflix.mediaclient.ui.R.g.I);
        this.a = (Button) findViewById(com.netflix.mediaclient.ui.R.g.L);
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void g() {
        setOnClickListener(this.s);
        this.f.setVisibility(0);
        this.f.setForeground(null);
        this.a.setVisibility(0);
        this.a.setOnClickListener(this.s);
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void l() {
        ViewUtils.a((View) this.k, false);
        ViewUtils.d((View) this.h, false);
        ViewUtils.d((View) this.y, false);
        ViewUtils.d((View) this.a, false);
        ViewUtils.d((View) this.f, false);
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(BillboardSummary billboardSummary) {
        if (BillboardView.BillboardType.a(billboardSummary)) {
            ViewUtils.a((View) this.y, 8);
            ViewUtils.a((View) this.a, 8);
        } else {
            ViewUtils.a((View) this.y, 0);
            ViewUtils.a((View) this.a, 0);
        }
        C9870yD.d(this.h, 0, 100, 100, 0);
        C9870yD.d(this.a, 0, 100, 100, 0);
    }

    protected BillboardAsset c(BillboardSummary billboardSummary) {
        return billboardSummary.getLogo();
    }

    protected void e(BillboardSummary billboardSummary, String str) {
        if (e(billboardSummary)) {
            c(billboardSummary, str);
            return;
        }
        ViewUtils.d((View) this.f, false);
        ViewUtils.d((View) this.e, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(BillboardSummary billboardSummary, String str) {
        BillboardAsset c = c(billboardSummary);
        if (c != null && c.getWidth() != null && c.getHeight() != null) {
            String url = c.getUrl();
            c(c.getWidth().intValue(), c.getHeight().intValue(), this.f.getId(), 0.6f);
            ViewUtils.d((View) this.f, true);
            ViewUtils.d((View) this.e, false);
            this.f.showImage(new ShowImageRequest().a(url).e(true).a(true).c(ShowImageRequest.Priority.a));
            e(this.f, this.p, str, billboardSummary);
            return;
        }
        String title = billboardSummary.getTitle();
        ViewUtils.d((View) this.f, false);
        ViewUtils.d((View) this.e, true);
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(title);
        }
    }

    private List<BillboardCTA> a(InterfaceC5180btr interfaceC5180btr) {
        BillboardSummary f = interfaceC5180btr.f();
        return (f.getPhase() == null || f.getAvailabilityDates() == null) ? this.G : f.getPhase().actions();
    }

    protected void d(BillboardSummary billboardSummary) {
        float f;
        float f2;
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(com.netflix.mediaclient.ui.R.g.u);
        constraintSet.clone(constraintLayout);
        Guideline guideline = (Guideline) findViewById(com.netflix.mediaclient.ui.R.g.gy);
        if (guideline != null) {
            int d2 = d();
            if (!e(billboardSummary)) {
                constraintSet.setGuidelineBegin(guideline.getId(), (int) (d2 * 0.2f));
            } else {
                if (BillboardView.BillboardType.c(billboardSummary)) {
                    f = d2;
                    f2 = 0.4f;
                } else {
                    f = d2;
                    f2 = 0.6f;
                }
                constraintSet.setGuidelineBegin(guideline.getId(), (int) (f * f2));
            }
            constraintSet.applyTo(constraintLayout);
        }
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView, o.InterfaceC6434cdI.c
    /* renamed from: a */
    public void c(InterfaceC5180btr interfaceC5180btr, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        BillboardSummary f;
        this.D = interfaceC5180btr;
        if (interfaceC5180btr == null || (f = interfaceC5180btr.f()) == null) {
            C6469cdr.d(interfaceC5180btr);
            l();
            return;
        }
        boolean a = BillboardView.BillboardType.a(f);
        this.z = trackingInfoHolder;
        setVisibility(0);
        String title = interfaceC5180btr.getTitle();
        setContentDescription(title);
        g(f);
        this.q = f.getActionToken();
        this.r = f.getImpressionToken();
        d(f);
        boolean z2 = (f.getTags() == null || f.getTags().isEmpty() || a(this.D, f) || a || BillboardView.BillboardType.c(f) || interfaceC5180btr.A_() == SupplementalMessageType.i) ? false : true;
        if (z2) {
            if (!this.M.equals(f.getTags())) {
                this.M.clear();
                this.M.addAll(f.getTags());
                this.f13721J.setVisibility(0);
                d(this.M, f.getHighlightColor());
            }
        } else {
            this.M.clear();
            this.f13721J.setVisibility(8);
        }
        if (a) {
            this.p = String.format(getResources().getString(com.netflix.mediaclient.ui.R.o.al), f.getTitle());
        } else if (i(interfaceC5180btr)) {
            this.p = e(interfaceC5180btr);
        } else {
            this.p = f.getSupplementalMessage();
        }
        if (!interfaceC5180btr.isAvailableToPlay()) {
            f(interfaceC5180btr);
        }
        c(f, z2);
        b(f, a(f));
        b(interfaceC5180btr, f, title);
        b(f);
        b(interfaceC5180btr);
        c(BillboardInteractionType.IMPRESSION);
        a(interfaceC5180btr, this.l);
        m();
    }

    protected void b(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary, String str) {
        e(billboardSummary, str);
        a(billboardSummary, str);
        f(billboardSummary);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(BillboardSummary billboardSummary) {
        BillboardAsset background = billboardSummary.getBackground();
        if (background == null || background.getWidth() == null || background.getHeight() == null || background.getUrl() == null) {
            j(billboardSummary);
        }
    }

    private void d(List<TagSummary> list, Integer num) {
        ArrayList arrayList = new ArrayList();
        for (TagSummary tagSummary : list) {
            if (tagSummary.getTitle() != null) {
                arrayList.add(tagSummary.getTitle());
            }
        }
        if (num != null) {
            this.f13721J.setSeparatorColor(num.intValue());
        }
        this.f13721J.setTags(arrayList);
    }

    protected void b(BillboardSummary billboardSummary, boolean z) {
        LoMoUtils.c(billboardSummary.getBadgeKeys(), this.n);
    }

    private void c(BillboardSummary billboardSummary, boolean z) {
        c(this.D, billboardSummary, this.k);
        if (!C8168dfL.g(this.p) && (!z || a(this.D, billboardSummary))) {
            this.k.setText(this.p);
            this.k.setVisibility(0);
            return;
        }
        this.k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BillboardPhase billboardPhase, BillboardSummary billboardSummary) {
        this.p = billboardPhase.supplementalMessage();
        c(billboardSummary, (billboardSummary.getTags() == null || billboardSummary.getTags().isEmpty()) ? false : true);
        this.G = billboardPhase.actions();
        c(false, billboardSummary);
    }

    private void f(InterfaceC5180btr interfaceC5180btr) {
        final BillboardSummary f = interfaceC5180btr.f();
        if (f == null || f.getPhase() == null || f.getAvailabilityDates() == null) {
            return;
        }
        final BillboardPhase phase = f.getPhase();
        Long valueOf = Long.valueOf(f.getAvailabilityDates().start().longValue() - Long.valueOf(System.currentTimeMillis()).longValue());
        if (valueOf.longValue() <= 0 || this.H != null) {
            return;
        }
        C1044Mm.e("BillboardPhoneView", " adding the delayed handlers for Pre Release content");
        this.H = Completable.timer(valueOf.longValue(), TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: o.cdp.2
            @Override // io.reactivex.functions.Action
            public void run() {
                C6467cdp.this.d(phase, f);
            }
        });
    }

    private void c(boolean z, BillboardSummary billboardSummary) {
        boolean a = BillboardView.BillboardType.a(billboardSummary);
        List<BillboardCTA> list = this.G;
        if (list != null) {
            if (list.size() >= 1) {
                if (a) {
                    this.i.setVisibility(8);
                } else {
                    this.i.setVisibility(8);
                }
                b(b("play", this.G), this.h, z, a);
                return;
            }
            this.h.setVisibility(8);
        }
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void k() {
        f();
        this.f.onViewRecycled();
        this.c.onViewRecycled();
    }

    public void f() {
        Disposable disposable = this.H;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.H.dispose();
        this.H = null;
    }

    protected void a(BillboardSummary billboardSummary, String str) {
        if (e(billboardSummary)) {
            ViewUtils.d((View) this.c, false);
        } else if (billboardSummary.getBackground() != null && billboardSummary.getBackground().getWidth() != null && billboardSummary.getBackground().getHeight() != null) {
            String url = billboardSummary.getBackground().getUrl();
            c(billboardSummary.getBackground().getWidth().intValue(), billboardSummary.getBackground().getHeight().intValue(), this.c.getId(), 0.55f);
            ViewUtils.d((View) this.c, true);
            this.c.showImage(new ShowImageRequest().a(url).e(true).c(ShowImageRequest.Priority.a));
            this.c.setContentDescription(str);
        } else {
            ViewUtils.d((View) this.c, false);
            j(billboardSummary);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(BillboardSummary billboardSummary) {
        StringBuilder sb = new StringBuilder();
        sb.append("Billboard id: ");
        sb.append(billboardSummary.getId());
        sb.append(" type: ");
        sb.append(billboardSummary.getBillboardType());
        sb.append(" url: ");
        sb.append(billboardSummary.getBackground() != null ? billboardSummary.getBackground().getUrl() : "");
        sb.append(" width: ");
        sb.append(billboardSummary.getBackground() != null ? billboardSummary.getBackground().getWidth() : "");
        sb.append(" height: ");
        sb.append(billboardSummary.getBackground() != null ? billboardSummary.getBackground().getHeight() : "");
        InterfaceC1593aHa.b(sb.toString());
        InterfaceC1598aHf.a("SPY-31798: Null licensed background");
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public String d(InterfaceC5180btr interfaceC5180btr, InterfaceC5149btM interfaceC5149btM) {
        BillboardSummary f = interfaceC5180btr.f();
        String url = (f == null || f.getBackground() == null) ? "" : f.getBackground().getUrl();
        if (f == null || f.getLogo() == null || f.getBackground() == null) {
            C1044Mm.d("BillboardPhoneView", "Data missing when trying to render billboard image");
        } else {
            C1044Mm.b("BillboardPhoneView", String.format("Showing artwork only, image url: %s", url));
        }
        return url;
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView, o.InterfaceC6434cdI.c
    public boolean c() {
        return super.c() || this.f.isImageContentMissingForPresentationTracking() || this.c.isImageContentMissingForPresentationTracking();
    }

    private void b(InterfaceC5180btr interfaceC5180btr) {
        if (!NetflixActivity.requireNetflixActivity(this).getServiceManager().c()) {
            C1044Mm.j("BillboardPhoneView", "Manager is null/notReady - can't reload data");
            return;
        }
        if (interfaceC5180btr == null || interfaceC5180btr.f() == null || interfaceC5180btr.f().getActions() == null) {
            this.G = new ArrayList();
        } else if (i(interfaceC5180btr)) {
            this.G = a(interfaceC5180btr);
        } else {
            this.G = interfaceC5180btr.f().getActions();
        }
        BillboardSummary f = interfaceC5180btr.f();
        boolean i = i(f);
        boolean a = BillboardView.BillboardType.a(f);
        c(i, f);
        if (this.y == null) {
            C1044Mm.j("BillboardPhoneView", "MyList button is null: can't initialize button");
        } else if (!a && interfaceC5180btr.getId() != null && interfaceC5180btr.getType() != null) {
            this.w.e(interfaceC5180btr.getId(), interfaceC5180btr.getType(), this.z, !interfaceC5180btr.isAvailableToPlay());
            t();
        } else {
            this.y.setVisibility(8);
        }
    }

    public void c(int i, int i2, int i3, float f) {
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(com.netflix.mediaclient.ui.R.g.u);
        constraintSet.clone(constraintLayout);
        constraintSet.constrainMaxWidth(i3, (int) (f * C8150deu.p(getContext())));
        constraintSet.setDimensionRatio(i3, i + ":" + i2);
        constraintSet.applyTo(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.15f, 1.0f, 1.15f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600L);
        scaleAnimation.setInterpolator(d);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        this.B.addAnimation(scaleAnimation);
        this.B.addAnimation(alphaAnimation);
        this.B.setFillAfter(false);
        startAnimation(this.B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(BillboardSummary billboardSummary) {
        return BillboardView.BackgroundArtworkType.b(billboardSummary);
    }

    private static BillboardCTA b(String str, List<BillboardCTA> list) {
        for (BillboardCTA billboardCTA : list) {
            if (billboardCTA != null && billboardCTA.type() != null && billboardCTA.type().equalsIgnoreCase(str)) {
                return billboardCTA;
            }
        }
        return null;
    }

    private static boolean a(BillboardSummary billboardSummary) {
        return billboardSummary.getBadgeKeys() != null && billboardSummary.getBadgeKeys().size() > 0;
    }

    private static boolean i(InterfaceC5180btr interfaceC5180btr) {
        BillboardSummary f = interfaceC5180btr.f();
        if (f.getPhase() != null && f.getAvailabilityDates() != null && !interfaceC5180btr.isAvailableToPlay()) {
            if (Long.valueOf(f.getAvailabilityDates().start().longValue() - Long.valueOf(System.currentTimeMillis()).longValue()).longValue() < 0) {
                return true;
            }
        }
        return false;
    }

    private static String e(InterfaceC5180btr interfaceC5180btr) {
        BillboardSummary f = interfaceC5180btr.f();
        return (f.getPhase() == null || f.getAvailabilityDates() == null) ? "" : f.getPhase().supplementalMessage();
    }
}
