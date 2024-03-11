package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Handler;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.util.ViewUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import o.C8094ddr;
import o.C9834xU;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ddl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8088ddl {
    private static int F = 1;
    private static int I = 0;
    private static byte e$ss2$4733 = 24;
    private boolean A;
    private final ImageView B;
    private final TextView C;
    private final TextView D;
    private ToneGenerator G;
    private int a;
    private final AudioManager b;
    private View[] c;
    private final TextView d;
    private final View e;
    private final TableLayout f;
    private final TextView g;
    private final ImageView h;
    private final View i;
    private boolean j;
    private final TextView k;
    private C8174dfR l;
    private final View n;

    /* renamed from: o  reason: collision with root package name */
    private final FloatingActionButton f13834o;
    private final ImageView q;
    private boolean r;
    private final View s;
    private int t;
    private final ActivityC8087ddk u;
    private final View v;
    private int w;
    private int x;
    private final View z;
    private CompositeDisposable m = new CompositeDisposable();
    private final Handler p = new Handler();
    private final View.OnTouchListener y = new View.OnTouchListener() { // from class: o.ddl.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                C8088ddl.this.c(view, true);
            } else if (action == 1) {
                C8088ddl.this.c(view, false);
            }
            return false;
        }
    };
    private final Runnable E = new Runnable() { // from class: o.ddl.7
        @Override // java.lang.Runnable
        public void run() {
            if (C8054ddD.l(C8088ddl.this.u)) {
                C1044Mm.e("VoipActivity", "timer update exit");
                return;
            }
            C8088ddl.this.k();
            C8088ddl.this.d(1000);
        }
    };

    private ActivityC8087ddk j() {
        return this.u;
    }

    public boolean i() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8088ddl(ActivityC8087ddk activityC8087ddk) {
        this.u = activityC8087ddk;
        this.x = activityC8087ddk.getResources().getInteger(C9834xU.f.d);
        this.d = (TextView) activityC8087ddk.findViewById(C8094ddr.b.t);
        this.g = (TextView) activityC8087ddk.findViewById(C8094ddr.b.q);
        ImageView imageView = (ImageView) activityC8087ddk.findViewById(C8094ddr.b.A);
        this.B = imageView;
        CompositeDisposable compositeDisposable = this.m;
        Observable<dpR> c = C9618tM.c(imageView);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        compositeDisposable.add(c.debounce(300L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Object>() { // from class: o.ddl.2
            @Override // io.reactivex.functions.Consumer
            public void accept(Object obj) {
                C8088ddl.this.t();
            }
        }));
        TextView textView = (TextView) activityC8087ddk.findViewById(C8094ddr.b.D);
        this.C = textView;
        this.m.add(C9618tM.c(textView).debounce(300L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Object>() { // from class: o.ddl.3
            @Override // io.reactivex.functions.Consumer
            public void accept(Object obj) {
                C8088ddl.this.t();
            }
        }));
        this.D = (TextView) activityC8087ddk.findViewById(C8094ddr.b.u);
        this.q = (ImageView) activityC8087ddk.findViewById(C8094ddr.b.y);
        this.h = (ImageView) activityC8087ddk.findViewById(C8094ddr.b.p);
        this.n = activityC8087ddk.findViewById(C8094ddr.b.v);
        boolean z = false;
        b(false);
        this.i = activityC8087ddk.findViewById(C8094ddr.b.S);
        this.z = activityC8087ddk.findViewById(C8094ddr.b.P);
        this.e = activityC8087ddk.findViewById(C8094ddr.b.Q);
        this.s = activityC8087ddk.findViewById(C8094ddr.b.W);
        this.v = activityC8087ddk.findViewById(C8094ddr.b.x);
        this.f13834o = (FloatingActionButton) activityC8087ddk.findViewById(C8094ddr.b.n);
        this.f = (TableLayout) activityC8087ddk.findViewById(C8094ddr.b.O);
        TextView textView2 = (TextView) activityC8087ddk.findViewById(C8094ddr.b.z);
        this.k = textView2;
        if (o()) {
            textView2.setVisibility(0);
        }
        try {
            this.G = new ToneGenerator(0, 100);
        } catch (Throwable th) {
            C1044Mm.e("VoipActivity", "Failed to initiate tone generator", th);
        }
        l();
        AudioManager audioManager = (AudioManager) j().getSystemService("audio");
        this.b = audioManager;
        ActivityC8087ddk activityC8087ddk2 = this.u;
        this.A = (activityC8087ddk2 == null || activityC8087ddk2.e() == null) ? audioManager.isSpeakerphoneOn() : this.u.e().v();
        ActivityC8087ddk activityC8087ddk3 = this.u;
        if (activityC8087ddk3 != null && activityC8087ddk3.e() != null && this.u.e().w()) {
            z = true;
        }
        this.r = z;
        this.l = new C8174dfR();
        this.t = activityC8087ddk.getColor(C8094ddr.e.a);
        this.w = activityC8087ddk.getColor(C8094ddr.e.b);
        this.a = activityC8087ddk.getColor(C8094ddr.e.c);
        n();
    }

    public void e() {
        this.m.dispose();
    }

    private void b(boolean z) {
        b(this.u, z, this.h, C8094ddr.c.c);
        this.n.setEnabled(z);
    }

    private void n() {
        if (this.u.isTablet()) {
            C1044Mm.e("VoipActivity", "Tablet: hide speaker option");
            View view = this.v;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private void c(boolean z) {
        View[] viewArr = this.c;
        if (viewArr == null || viewArr.length < 1) {
            return;
        }
        for (View view : viewArr) {
            view.setEnabled(z);
            view.setAlpha(z ? 1.0f : 0.25f);
        }
    }

    private void l() {
        View[] viewArr = new View[12];
        this.c = viewArr;
        boolean z = false;
        viewArr[0] = this.u.findViewById(C8094ddr.b.e);
        this.c[1] = this.u.findViewById(C8094ddr.b.b);
        this.c[2] = this.u.findViewById(C8094ddr.b.c);
        this.c[3] = this.u.findViewById(C8094ddr.b.d);
        this.c[4] = this.u.findViewById(C8094ddr.b.j);
        this.c[5] = this.u.findViewById(C8094ddr.b.g);
        this.c[6] = this.u.findViewById(C8094ddr.b.f);
        this.c[7] = this.u.findViewById(C8094ddr.b.h);
        this.c[8] = this.u.findViewById(C8094ddr.b.i);
        this.c[9] = this.u.findViewById(C8094ddr.b.m);
        this.c[10] = this.u.findViewById(C8094ddr.b.k);
        this.c[11] = this.u.findViewById(C8094ddr.b.l);
        for (View view : this.c) {
            view.setOnTouchListener(this.y);
        }
        if (this.u.getServiceManager().y() != null && this.u.getServiceManager().y().j()) {
            z = true;
        }
        c(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view, boolean z) {
        int id = view.getId();
        int i = C8094ddr.b.b;
        if (id == i) {
            d(i, '1', z, 1);
            return;
        }
        int i2 = C8094ddr.b.c;
        if (id == i2) {
            d(i2, '2', z, 2);
            return;
        }
        int i3 = C8094ddr.b.d;
        if (id == i3) {
            d(i3, '3', z, 3);
            return;
        }
        int i4 = C8094ddr.b.j;
        if (id == i4) {
            d(i4, '4', z, 4);
            return;
        }
        int i5 = C8094ddr.b.g;
        if (id == i5) {
            d(i5, '5', z, 5);
            return;
        }
        int i6 = C8094ddr.b.f;
        if (id == i6) {
            d(i6, '6', z, 6);
            return;
        }
        int i7 = C8094ddr.b.h;
        if (id == i7) {
            d(i7, '7', z, 7);
            return;
        }
        int i8 = C8094ddr.b.i;
        if (id == i8) {
            d(i8, '8', z, 8);
            return;
        }
        int i9 = C8094ddr.b.m;
        if (id == i9) {
            d(i9, '9', z, 9);
            return;
        }
        int i10 = C8094ddr.b.e;
        if (id == i10) {
            d(i10, '0', z, 0);
            return;
        }
        int i11 = C8094ddr.b.k;
        if (id == i11) {
            d(i11, '*', z, 10);
            return;
        }
        int i12 = C8094ddr.b.l;
        if (id == i12) {
            d(i12, '#', z, 11);
        }
    }

    private void d(int i, char c, boolean z, int i2) {
        TextView textView = (TextView) this.u.findViewById(i);
        if (z) {
            this.u.e().e(c);
            ToneGenerator toneGenerator = this.G;
            if (toneGenerator != null) {
                toneGenerator.startTone(i2);
            }
        } else {
            this.u.e().D();
            ToneGenerator toneGenerator2 = this.G;
            if (toneGenerator2 != null) {
                toneGenerator2.stopTone();
            }
        }
        if (textView == null) {
            C1044Mm.j("VoipActivity", "Button label not found!");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.z.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.ddl.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (C8150deu.s(C8088ddl.this.u)) {
                    int measuredHeight = C8088ddl.this.z.getMeasuredHeight();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(measuredHeight, measuredHeight);
                    layoutParams.gravity = 1;
                    C8088ddl.this.i.setLayoutParams(layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(measuredHeight, -2);
                    layoutParams2.gravity = 1;
                    C8088ddl.this.e.setLayoutParams(layoutParams2);
                } else {
                    int measuredWidth = C8088ddl.this.z.getMeasuredWidth();
                    int measuredHeight2 = C8088ddl.this.z.getMeasuredHeight() + C8088ddl.this.e.getMeasuredHeight();
                    int measuredHeight3 = C8088ddl.this.e.getMeasuredHeight() + measuredWidth;
                    if (measuredHeight3 > measuredHeight2) {
                        measuredWidth = (measuredWidth - measuredHeight3) + measuredHeight2;
                    }
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(measuredWidth, measuredWidth);
                    layoutParams3.gravity = 1;
                    C8088ddl.this.i.setLayoutParams(layoutParams3);
                }
                ViewUtils.d(C8088ddl.this.z, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z) {
        u();
        v();
        this.j = z;
        r();
        if (this.j) {
            h();
        }
        c(z);
    }

    private void r() {
        int i = 2 % 2;
        int i2 = F + 121;
        I = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.e("VoipActivity", "Update call status...");
        if (!this.j) {
            b(false);
            TextView textView = this.d;
            String string = this.u.getString(C8094ddr.i.n);
            if (string.startsWith("'!#+")) {
                int i4 = I + 41;
                F = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                H(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            textView.setText(string);
            TextView textView2 = this.g;
            String string2 = this.u.getString(C8094ddr.i.l);
            if (string2.startsWith("'!#+")) {
                int i6 = F + 11;
                I = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = new Object[1];
                H(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            textView2.setText(string2);
            this.D.setVisibility(8);
            this.s.setVisibility(0);
            return;
        }
        b(true);
        TextView textView3 = this.d;
        String string3 = this.u.getString(C8094ddr.i.k);
        if (string3.startsWith("'!#+")) {
            Object[] objArr3 = new Object[1];
            H(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
            int i8 = F + 29;
            I = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 3;
            }
        }
        textView3.setText(string3);
        TextView textView4 = this.g;
        String string4 = this.u.getString(C8094ddr.i.f13837o);
        if (!(!string4.startsWith("'!#+"))) {
            Object[] objArr4 = new Object[1];
            H(string4.substring(4), objArr4);
            string4 = ((String) objArr4[0]).intern();
        }
        textView4.setText(string4);
        this.D.setVisibility(0);
        this.s.setVisibility(8);
        if (o()) {
            int i10 = F + 37;
            I = i10 % 128;
            int i11 = i10 % 2;
            s();
        }
    }

    private boolean o() {
        return (j() == null || j().getServiceManager() == null || j().getServiceManager().g() == null || j().getServiceManager().g().ac() == null || !j().getServiceManager().g().ac().isOpenDialpadByDefault()) ? false : true;
    }

    private void u() {
        if (this.q == null) {
            return;
        }
        ActivityC8087ddk activityC8087ddk = this.u;
        this.r = (activityC8087ddk == null || activityC8087ddk.e() == null || !this.u.e().w()) ? false : true;
        b(new Runnable() { // from class: o.ddl.4
            @Override // java.lang.Runnable
            public void run() {
                if (C8088ddl.this.r) {
                    C8088ddl.this.q.setImageResource(C8094ddr.c.e);
                    C8088ddl.this.q.setSelected(true);
                    return;
                }
                C8088ddl.this.q.setImageResource(C8094ddr.c.d);
                C8088ddl.this.q.setSelected(false);
            }
        }, this.x);
    }

    private void b(Runnable runnable, int i) {
        this.p.postDelayed(runnable, i);
    }

    private void v() {
        if (this.u.isTablet() || this.B == null) {
            return;
        }
        ActivityC8087ddk activityC8087ddk = this.u;
        this.A = (activityC8087ddk == null || activityC8087ddk.e() == null) ? this.b.isSpeakerphoneOn() : this.u.e().v();
        b(new Runnable() { // from class: o.ddl.10
            @Override // java.lang.Runnable
            public void run() {
                if (C8088ddl.this.A) {
                    C8088ddl.this.B.setImageResource(C8094ddr.c.j);
                    C8088ddl.this.B.setSelected(true);
                    return;
                }
                C8088ddl.this.B.setImageResource(C8094ddr.c.f);
                C8088ddl.this.B.setSelected(false);
            }
        }, this.x);
    }

    public void g() {
        C1044Mm.e("VoipActivity", "Call started!");
        e(false);
        this.j = false;
        if (this.u.e().u()) {
            C1044Mm.e("VoipActivity", "Success on starting call");
        } else {
            C1044Mm.d("VoipActivity", "Failed to start call");
            this.u.e(null, null, -1);
        }
        this.i.setVisibility(8);
        this.z.setVisibility(0);
        b(false);
    }

    public void b() {
        C1044Mm.e("VoipActivity", "Call is connected");
        this.j = true;
        r();
        c(true);
        m();
    }

    public void c() {
        C1044Mm.e("VoipActivity", "Call is ringing");
    }

    public void a() {
        this.j = false;
        r();
        p();
    }

    public boolean b(View view) {
        if (view == null) {
            C1044Mm.d("VoipActivity", "DialScreen:: null view? This should never happen!");
            return true;
        }
        int id = view.getId();
        if (id == C8094ddr.b.y || id == C8094ddr.b.w) {
            q();
        } else if (id == C8094ddr.b.n) {
            f();
        } else if (id != C8094ddr.b.p && id != C8094ddr.b.v) {
            return false;
        } else {
            s();
        }
        return true;
    }

    private void f() {
        C1044Mm.e("VoipActivity", "Cancel call by user");
        ActivityC8087ddk activityC8087ddk = this.u;
        if (activityC8087ddk != null) {
            activityC8087ddk.a();
            if (this.u.e() != null) {
                this.u.e().A();
            }
            this.u.a((IVoip.b) null);
        }
    }

    private void s() {
        final boolean z = this.i.getVisibility() == 0;
        if (z) {
            C1044Mm.e("VoipActivity", "Dialpad was visible, remove it!");
            this.z.setVisibility(0);
            this.i.setVisibility(8);
        } else {
            C1044Mm.e("VoipActivity", "Dialpad was NOT visible, show it!");
            this.z.setVisibility(8);
            this.i.setVisibility(0);
        }
        b(new Runnable() { // from class: o.ddl.6
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    C8088ddl.this.h.setImageResource(C8094ddr.c.c);
                    C8088ddl.this.h.setSelected(false);
                    return;
                }
                C8088ddl.this.h.setImageResource(C8094ddr.c.b);
                C8088ddl.this.h.setSelected(true);
            }
        }, this.x);
    }

    private void q() {
        if (this.r) {
            C1044Mm.e("VoipActivity", "Unmute");
        } else {
            C1044Mm.e("VoipActivity", "Mute");
        }
        this.r = !this.r;
        ActivityC8087ddk activityC8087ddk = this.u;
        if (activityC8087ddk != null && activityC8087ddk.e() != null) {
            this.u.e().e(this.r);
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.A) {
            C1044Mm.e("VoipActivity", "Set speaker from on to off");
        } else {
            C1044Mm.e("VoipActivity", "Set speaker from off to on");
        }
        this.A = !this.A;
        ActivityC8087ddk activityC8087ddk = this.u;
        if (activityC8087ddk != null && activityC8087ddk.e() != null) {
            this.u.e().a(this.A);
        }
        v();
    }

    private void p() {
        C1044Mm.e("VoipActivity", "Stop timer...");
        this.p.removeCallbacks(this.E);
    }

    private void m() {
        C1044Mm.e("VoipActivity", "Start timer...");
        this.p.post(this.E);
    }

    private void h() {
        p();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.p.removeCallbacks(this.E);
        this.p.postDelayed(this.E, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.u.e().c());
            this.D.setText(this.l.b(currentTimeMillis));
            this.k.setText(j().getString(C8094ddr.i.m, this.l.b(currentTimeMillis)));
        }
    }

    private static void b(Context context, boolean z, ImageView imageView, int i) {
        imageView.setEnabled(z);
        Drawable drawable = context.getResources().getDrawable(i);
        if (!z) {
            drawable = e(drawable);
        }
        imageView.setImageDrawable(drawable);
    }

    private static Drawable e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    private void H(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4733);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
