package com.netflix.mediaclient.viewportttr.impl;

import android.view.View;
import android.view.ViewParent;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class ViewPortMembershipTracker implements View.OnAttachStateChangeListener {
    public static final a b = new a(null);
    private View a;
    private final drO<dpR> c;
    private final View d;
    private Membership e;

    public final Membership d() {
        return this.e;
    }

    public ViewPortMembershipTracker(View view, drO<dpR> dro) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) dro, "");
        this.d = view;
        this.c = dro;
        this.e = Membership.c;
        view.addOnAttachStateChangeListener(this);
    }

    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ViewPortTtr-Membership");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class Membership {
        private static final /* synthetic */ Membership[] d;
        private static final /* synthetic */ InterfaceC8598drn e;
        public static final Membership c = new Membership("PENDING", 0);
        public static final Membership a = new Membership("IS_MEMBER", 1);
        public static final Membership b = new Membership("NOT_MEMBER", 2);

        private static final /* synthetic */ Membership[] e() {
            return new Membership[]{c, a, b};
        }

        public static Membership valueOf(String str) {
            return (Membership) Enum.valueOf(Membership.class, str);
        }

        public static Membership[] values() {
            return (Membership[]) d.clone();
        }

        private Membership(String str, int i) {
        }

        static {
            Membership[] e2 = e();
            d = e2;
            e = C8600drp.e(e2);
        }
    }

    public final void a(View view) {
        C8632dsu.c((Object) view, "");
        this.a = view;
        c();
        if (this.e == Membership.c) {
            b.getLogTag();
        }
    }

    public final void e() {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        C8632dsu.c((Object) view, "");
        b();
    }

    private final void c() {
        Membership membership;
        View view = this.a;
        if (view == null) {
            membership = Membership.c;
        } else if (this.d.isAttachedToWindow()) {
            membership = c(view) ? Membership.a : Membership.b;
        } else {
            membership = Membership.c;
        }
        if (this.e != membership) {
            b.getLogTag();
            this.e = membership;
            this.c.invoke();
        }
    }

    private final void b() {
        this.d.removeOnAttachStateChangeListener(this);
    }

    private final boolean c(View view) {
        for (ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
            if (C8632dsu.c(parent, view)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        C8632dsu.c((Object) view, "");
        b.getLogTag();
        b();
        c();
    }
}
