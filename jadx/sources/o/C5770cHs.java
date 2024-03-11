package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import o.C9834xU;
import o.cBO;
import o.cBQ;
import o.cIE;

/* renamed from: o.cHs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5770cHs extends AbstractC5765cHn implements InterfaceC5732cGh {
    private aJY a;
    public aJY b;
    private boolean c;
    private final ViewGroup e;

    public void b(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        this.b = ajy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770cHs(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.e = viewGroup;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: o */
    public aJY e() {
        aJY ajy = this.b;
        if (ajy != null) {
            return ajy;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        aJY ajy = this.a;
        if (ajy == null) {
            return;
        }
        ajy.setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        aJY ajy = this.a;
        if (ajy == null) {
            return;
        }
        ajy.setVisibility(8);
    }

    /* renamed from: o.cHs$d */
    /* loaded from: classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C5770cHs.this.c();
            C5770cHs.this.b((C5770cHs) cBQ.o.b);
        }
    }

    @Override // o.InterfaceC5732cGh
    public void i() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleY;
        a();
        aJY ajy = this.a;
        if (ajy == null || (animate = ajy.animate()) == null || (scaleY = animate.scaleY(1.0f)) == null) {
            return;
        }
        scaleY.setListener(null);
    }

    @Override // o.InterfaceC5732cGh
    public void b(Interactivity interactivity, boolean z, int i) {
        aJY ajy;
        aJY ajy2 = this.a;
        if (ajy2 != null) {
            this.e.removeView(ajy2);
        }
        if (interactivity == Interactivity.e && !z) {
            View inflate = LayoutInflater.from(this.e.getContext()).inflate(cIE.c.X, this.e, false);
            C8632dsu.d(inflate);
            ajy = (aJY) inflate;
        } else {
            View inflate2 = LayoutInflater.from(this.e.getContext()).inflate(cIE.c.X, this.e, false);
            C8632dsu.d(inflate2);
            ajy = (aJY) inflate2;
        }
        this.a = ajy;
        this.e.addView(ajy, i);
        aJY ajy3 = this.a;
        C8632dsu.d(ajy3);
        b(ajy3);
        b((C5770cHs) new cBQ.t(e()));
    }

    @Override // o.InterfaceC5732cGh
    public void j() {
        if (this.c) {
            return;
        }
        this.c = true;
        b((C5770cHs) cBO.C5578n.e);
        new AlertDialog.Builder(e().getContext(), C9834xU.o.c).setMessage(com.netflix.mediaclient.ui.R.o.ft).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.cHw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5770cHs.i(C5770cHs.this, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cHz
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C5770cHs.c(C5770cHs.this, dialogInterface);
            }
        }).show();
        Logger.INSTANCE.logEvent(new Presented(AppView.endOfPartialDownload, Boolean.FALSE, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C5770cHs c5770cHs, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5770cHs, "");
        dialogInterface.dismiss();
        c5770cHs.b((C5770cHs) cBO.C5574j.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5770cHs c5770cHs, DialogInterface dialogInterface) {
        C8632dsu.c((Object) c5770cHs, "");
        c5770cHs.c = false;
    }

    @Override // o.InterfaceC5732cGh
    public void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        b((C5770cHs) cBO.C5578n.e);
        new AlertDialog.Builder(e().getContext(), C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.fz).setMessage(com.netflix.mediaclient.ui.R.o.fy).setNegativeButton(com.netflix.mediaclient.ui.R.o.fA, new DialogInterface.OnClickListener() { // from class: o.cHq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5770cHs.h(C5770cHs.this, dialogInterface, i);
            }
        }).setPositiveButton(com.netflix.mediaclient.ui.R.o.fD, new DialogInterface.OnClickListener() { // from class: o.cHr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5770cHs.g(C5770cHs.this, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cHt
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C5770cHs.j(C5770cHs.this, dialogInterface);
            }
        }).show();
        Logger.INSTANCE.logEvent(new Presented(AppView.endOfPartialDownload, Boolean.FALSE, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C5770cHs c5770cHs, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5770cHs, "");
        dialogInterface.dismiss();
        c5770cHs.b((C5770cHs) cBO.C5574j.e);
        CLv2Utils.INSTANCE.e(new Focus(AppView.endOfPartialDownload, null), new CloseCommand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C5770cHs c5770cHs, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5770cHs, "");
        c5770cHs.b((C5770cHs) cBO.C5569e.b);
        c5770cHs.b((C5770cHs) cBO.C5575k.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C5770cHs c5770cHs, DialogInterface dialogInterface) {
        C8632dsu.c((Object) c5770cHs, "");
        c5770cHs.c = false;
    }

    @Override // o.InterfaceC5732cGh
    public void h() {
        if (this.c) {
            return;
        }
        this.c = true;
        b((C5770cHs) cBO.C5578n.e);
        new AlertDialog.Builder(e().getContext(), C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.fs).setMessage(com.netflix.mediaclient.ui.R.o.fw).setNegativeButton(com.netflix.mediaclient.ui.R.o.fA, new DialogInterface.OnClickListener() { // from class: o.cHv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5770cHs.f(C5770cHs.this, dialogInterface, i);
            }
        }).setPositiveButton(com.netflix.mediaclient.ui.R.o.fD, new DialogInterface.OnClickListener() { // from class: o.cHy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5770cHs.j(C5770cHs.this, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cHx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C5770cHs.b(C5770cHs.this, dialogInterface);
            }
        }).show();
        Logger.INSTANCE.logEvent(new Presented(AppView.endOfPartialDownload, Boolean.FALSE, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C5770cHs c5770cHs, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5770cHs, "");
        dialogInterface.dismiss();
        c5770cHs.b((C5770cHs) cBO.C5574j.e);
        CLv2Utils.INSTANCE.e(new Focus(AppView.endOfPartialDownload, null), new CloseCommand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C5770cHs c5770cHs, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5770cHs, "");
        c5770cHs.b((C5770cHs) cBO.C5587w.a);
        c5770cHs.b((C5770cHs) cBO.C5575k.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5770cHs c5770cHs, DialogInterface dialogInterface) {
        C8632dsu.c((Object) c5770cHs, "");
        c5770cHs.c = false;
    }

    @Override // o.InterfaceC5732cGh
    public void l() {
        aJY ajy = this.a;
        if (ajy != null) {
            ajy.ak();
        }
    }

    @Override // o.InterfaceC5732cGh
    public void b(int i) {
        aJY ajy = this.a;
        if (ajy != null) {
            Rect F = ajy.F();
            int i2 = F != null ? F.left : 0;
            Rect F2 = ajy.F();
            int i3 = F2 != null ? F2.top : 0;
            Rect F3 = ajy.F();
            ajy.c(i2, i3, F3 != null ? F3.right : 0, i);
        }
    }

    @Override // o.InterfaceC5732cGh
    public void f() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        aJY ajy = this.a;
        if (ajy != null && ajy.getVisibility() != 0) {
            b((C5770cHs) cBQ.o.b);
            return;
        }
        aJY ajy2 = this.a;
        if (ajy2 == null || (animate = ajy2.animate()) == null || (scaleY = animate.scaleY(0.0f)) == null || (duration = scaleY.setDuration(300L)) == null) {
            return;
        }
        duration.setListener(new d());
    }
}
