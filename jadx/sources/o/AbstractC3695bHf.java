package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bHf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3695bHf extends AbstractC3336ax<c> {
    public static final d d = new d(null);
    private Integer b;
    private Integer c;
    private CharSequence j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.H;
    }

    public final void a(Integer num) {
        this.b = num;
    }

    public final void b(CharSequence charSequence) {
        this.j = charSequence;
    }

    public final void d(Integer num) {
        this.c = num;
    }

    public final Integer i() {
        return this.b;
    }

    public final Integer m() {
        return this.c;
    }

    public final CharSequence n() {
        return this.j;
    }

    /* renamed from: o.bHf$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DpSupplementalMessageModel");
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.d().setText(this.j);
        Integer num = this.b;
        if (num != null) {
            cVar.d().setCompoundDrawablesRelativeWithIntrinsicBounds(num.intValue(), 0, 0, 0);
        }
        Integer num2 = this.c;
        if (num2 != null) {
            C9870yD.d(cVar.d(), 1, num2.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.d().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* renamed from: o.bHf$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C3670bGh.a.z, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.b.getValue(this, d[0]);
        }
    }
}
