package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: o.cxH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7491cxH {
    public static /* synthetic */ void a(C7491cxH c7491cxH, View view, boolean z, Runnable runnable, int i, Object obj) {
        if ((i & 4) != 0) {
            runnable = null;
        }
        c7491cxH.b(view, z, runnable);
    }

    public final void b(View view, boolean z, Runnable runnable) {
        C8632dsu.c((Object) view, "");
        if (z == (view.getVisibility() == 0)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (z) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        view.animate().setDuration(150L).alpha(z ? 1.0f : 0.0f).setStartDelay(z ? 100 : 0).setListener(new e(z, view, runnable));
    }

    /* renamed from: o.cxH$e */
    /* loaded from: classes4.dex */
    public static final class e extends AnimatorListenerAdapter {
        final /* synthetic */ View b;
        final /* synthetic */ boolean d;
        final /* synthetic */ Runnable e;

        e(boolean z, View view, Runnable runnable) {
            this.d = z;
            this.b = view;
            this.e = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (!this.d) {
                this.b.setVisibility(8);
                this.b.setAlpha(1.0f);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void a(View view, boolean z) {
        C8632dsu.c((Object) view, "");
        float f = z ? 1.0f : 0.3f;
        if (C8141del.a()) {
            view.setAlpha(f);
            view.setClickable(z);
            return;
        }
        view.clearAnimation();
        view.animate().alpha(f).setDuration(200L).setListener(new a(view, z)).start();
    }

    /* renamed from: o.cxH$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ View d;

        a(View view, boolean z) {
            this.d = view;
            this.a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.d.setClickable(this.a);
        }
    }

    public final void c(View view, boolean z) {
        C8632dsu.c((Object) view, "");
        float f = z ? 1.0f : 0.3f;
        if (C8141del.a()) {
            view.setAlpha(f);
            view.setEnabled(z);
            return;
        }
        view.clearAnimation();
        view.animate().alpha(f).setDuration(200L).setListener(new d(view, z)).start();
    }

    /* renamed from: o.cxH$d */
    /* loaded from: classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ View c;
        final /* synthetic */ boolean e;

        d(View view, boolean z) {
            this.c = view;
            this.e = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.c.setEnabled(this.e);
        }
    }
}
