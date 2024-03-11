package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import o.AbstractC9900yh;
import o.C9834xU;

/* renamed from: o.yt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9912yt {
    private final AbstractC9900yh a;
    private final int b;
    private final boolean c;
    private final Handler d;
    private int e;
    private int f;
    private final Runnable h;
    private boolean i;
    private int j;

    /* renamed from: o.yt$a */
    /* loaded from: classes2.dex */
    public interface a {
        boolean ak_();

        Rect g();

        View h();

        AnimatedVectorDrawable i();
    }

    public void a() {
        this.i = false;
    }

    public boolean e() {
        return this.i;
    }

    public C9912yt(Context context, AbstractC9900yh abstractC9900yh) {
        this(context, abstractC9900yh, false);
    }

    public C9912yt(Context context, AbstractC9900yh abstractC9900yh, boolean z) {
        this.d = new Handler();
        this.j = 0;
        this.e = 0;
        this.f = 0;
        this.i = false;
        this.h = new Runnable() { // from class: o.yt.3
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView b = C9912yt.this.a.b();
                if (b != null && b.isAttachedToWindow() && !C8141del.c(b.getContext())) {
                    C1044Mm.a("PulseAnimator", "Row#%s run at %s with %s pulses", Integer.valueOf(C9912yt.this.a.e()), Integer.valueOf(C9912yt.this.e), Integer.valueOf(C9912yt.this.j));
                    AbstractC9900yh.c cVar = null;
                    while (cVar == null && b.getAdapter() != null && C9912yt.this.e < b.getAdapter().getItemCount()) {
                        C9912yt c9912yt = C9912yt.this;
                        int i = c9912yt.e;
                        c9912yt.e = i + 1;
                        cVar = (AbstractC9900yh.c) b.findViewHolderForAdapterPosition(i);
                    }
                    if (cVar instanceof a) {
                        a aVar = (a) cVar;
                        if (aVar.ak_()) {
                            View h = aVar.h();
                            AnimatedVectorDrawable i2 = aVar.i();
                            Rect g = aVar.g();
                            if (g != null) {
                                int i3 = g.right - g.left;
                                int i4 = g.bottom - g.top;
                                if (i3 >= 0 && i4 >= 0) {
                                    h.getLayoutParams().width = i3;
                                    h.getLayoutParams().height = i4;
                                    i2.setBounds(g);
                                } else {
                                    InterfaceC1598aHf.a(String.format(Locale.US, "%s - Invalid dimensions for image view: width: %d, height: %d", "PulseAnimator", Integer.valueOf(i3), Integer.valueOf(i4)));
                                }
                            }
                            h.setBackground(i2);
                            i2.start();
                        }
                    }
                    if (C9912yt.this.e >= b.getAdapter().getItemCount()) {
                        C9912yt.this.e = 0;
                    }
                    if (C9912yt.this.i) {
                        C9912yt.this.d.postDelayed(C9912yt.this.h, C9912yt.this.b);
                        return;
                    }
                    return;
                }
                C1044Mm.a("PulseAnimator", "Row#%s run... wait, no RecyclerView or valid activity detected, stopping...", Integer.valueOf(C9912yt.this.a.e()));
                C9912yt.this.i = false;
            }
        };
        this.a = abstractC9900yh;
        this.f = abstractC9900yh.e();
        this.c = z;
        this.b = (int) (context.getResources().getInteger(C9834xU.f.b) * 0.33333334f);
    }

    public void d() {
        this.i = true;
        if (this.c) {
            this.d.postDelayed(this.h, (this.f % 2 == 0 ? 0 : 1) * 250);
        } else {
            this.h.run();
        }
    }

    public void b() {
        int i = this.j + 1;
        this.j = i;
        if (i > 0 && !e()) {
            d();
        }
        C1044Mm.a("PulseAnimator", "Row#%s onPulseAttached with %s attached", Integer.valueOf(this.a.e()), Integer.valueOf(this.j));
    }

    public void c() {
        int i = this.j - 1;
        this.j = i;
        if (i < 0) {
            throw new IllegalStateException("mPulsesCount should not be negative");
        }
        if (i == 0 && e()) {
            a();
        }
        C1044Mm.a("PulseAnimator", "Row#%s onPulseDetached with %s attached", Integer.valueOf(this.a.e()), Integer.valueOf(this.j));
    }

    public void e(RecyclerView recyclerView) {
        if (this.j > 0) {
            d();
        }
        C1044Mm.a("PulseAnimator", "Row#%s onAttachedToRecyclerView with %s attached", Integer.valueOf(this.a.e()), Integer.valueOf(this.j));
    }

    public void b(RecyclerView recyclerView) {
        if (e()) {
            a();
        }
        C1044Mm.a("PulseAnimator", "Row#%s onDetachedFromRecyclerView with %s attached", Integer.valueOf(this.a.e()), Integer.valueOf(this.j));
    }
}
