package o;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.netflix.mediaclient.NetflixApplication;
import o.cBO;
import o.cIE;

/* renamed from: o.cHg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5758cHg extends AbstractC5765cHn implements cFZ {
    public static final c e = new c(null);
    private final View a;
    private View.OnTouchListener b;
    private boolean c;
    private GestureDetector d;

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        this.c = true;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        this.c = false;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.a;
    }

    public final GestureDetector i() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5758cHg(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.P, (ViewGroup) null, false);
        C8632dsu.a(inflate, "");
        this.a = inflate;
        viewGroup.addView(e());
        this.d = b(viewGroup);
        this.b = new View.OnTouchListener(viewGroup) { // from class: o.cHg.5
            private final ScaleGestureDetector a;

            {
                Context context = viewGroup.getContext();
                C8632dsu.a(context, "");
                this.a = new ScaleGestureDetector(C5758cHg.this.e(context), new b(C5758cHg.this));
            }

            /* renamed from: o.cHg$5$b */
            /* loaded from: classes4.dex */
            public static final class b implements ScaleGestureDetector.OnScaleGestureListener {
                private float a;
                private float d;
                final /* synthetic */ C5758cHg e;

                b(C5758cHg c5758cHg) {
                    this.e = c5758cHg;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                    C8632dsu.c((Object) scaleGestureDetector, "");
                    this.a = scaleGestureDetector.getScaleFactor();
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    C8632dsu.c((Object) scaleGestureDetector, "");
                    this.d = scaleGestureDetector.getScaleFactor();
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                    C8632dsu.c((Object) scaleGestureDetector, "");
                    if (this.d > this.a) {
                        this.e.b((C5758cHg) cBO.C5580p.c);
                    } else {
                        this.e.b((C5758cHg) cBO.C5576l.c);
                    }
                }
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C8632dsu.c((Object) view, "");
                C8632dsu.c((Object) motionEvent, "");
                C5758cHg.this.i().onTouchEvent(motionEvent);
                this.a.onTouchEvent(motionEvent);
                view.performClick();
                return true;
            }
        };
        e().setOnTouchListener(this.b);
        ViewCompat.replaceAccessibilityAction(e(), AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, null, new AccessibilityViewCommand() { // from class: o.cHk
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                boolean c2;
                c2 = C5758cHg.c(C5758cHg.this, view, commandArguments);
                return c2;
            }
        });
    }

    /* renamed from: o.cHg$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context e(Context context) {
        if (C8054ddD.d()) {
            return context;
        }
        NetflixApplication netflixApplication = NetflixApplication.getInstance();
        C8632dsu.d(netflixApplication);
        return netflixApplication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C5758cHg c5758cHg, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        C8632dsu.c((Object) c5758cHg, "");
        C8632dsu.c((Object) view, "");
        c5758cHg.b((C5758cHg) cBO.O.c);
        return true;
    }

    /* renamed from: o.cHg$b */
    /* loaded from: classes4.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ ViewGroup b;
        private final int a = 20;
        private final int d = C9870yD.b(NetflixApplication.getInstance(), 20);

        b(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            C5758cHg.this.b((C5758cHg) cBO.O.c);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            Activity activity;
            Window window;
            View decorView;
            C8632dsu.c((Object) motionEvent, "");
            if (!C5758cHg.this.c && (activity = (Activity) C9737vz.b(this.b.getContext(), Activity.class)) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                int measuredWidth = decorView.getMeasuredWidth() / 2;
                if (motionEvent.getX() < measuredWidth - this.d) {
                    C5758cHg.this.b((C5758cHg) new cBO.P(true));
                    return true;
                } else if (motionEvent.getX() > measuredWidth + this.d) {
                    C5758cHg.this.b((C5758cHg) new cBO.P(false));
                    return true;
                }
            }
            return false;
        }
    }

    private final GestureDetector b(ViewGroup viewGroup) {
        return new GestureDetector(viewGroup.getContext(), new b(viewGroup));
    }

    @Override // o.cFZ
    public void f() {
        b((C5758cHg) cBO.C5568d.e);
    }

    @Override // o.cFZ
    public void j() {
        b((C5758cHg) cBO.I.b);
    }

    @Override // o.cFZ
    public void b(boolean z, boolean z2) {
        b((C5758cHg) new cBO.C5586v(z, z2));
    }
}
