package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6502ceX;

/* renamed from: o.cfe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6562cfe extends AbstractC6502ceX implements InterfaceC1673aK<AbstractC6502ceX.d>, InterfaceC6503ceY {
    private InterfaceC4414be<C6562cfe, AbstractC6502ceX.d> b;
    private InterfaceC4573bh<C6562cfe, AbstractC6502ceX.d> c;
    private InterfaceC4467bf<C6562cfe, AbstractC6502ceX.d> d;
    private InterfaceC4732bk<C6562cfe, AbstractC6502ceX.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC6502ceX.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6502ceX.d dVar, int i) {
        InterfaceC4467bf<C6562cfe, AbstractC6502ceX.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6502ceX.d dVar) {
        super.b((C6562cfe) dVar);
        InterfaceC4414be<C6562cfe, AbstractC6502ceX.d> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6502ceX.d dVar) {
        InterfaceC4732bk<C6562cfe, AbstractC6502ceX.d> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6502ceX.d dVar) {
        InterfaceC4573bh<C6562cfe, AbstractC6502ceX.d> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC6503ceY
    /* renamed from: b */
    public C6562cfe e(CharSequence charSequence) {
        h();
        super.H_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6503ceY
    /* renamed from: a */
    public C6562cfe e(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6562cfe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6503ceY
    /* renamed from: d */
    public C6562cfe c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6562cfe a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6562cfe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6502ceX.d b(ViewParent viewParent) {
        return new AbstractC6502ceX.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6562cfe) && super.equals(obj)) {
            C6562cfe c6562cfe = (C6562cfe) obj;
            if ((this.d == null) != (c6562cfe.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6562cfe.b == null)) {
                return false;
            }
            if ((this.j == null) != (c6562cfe.j == null)) {
                return false;
            }
            if ((this.c == null) != (c6562cfe.c == null)) {
                return false;
            }
            if (n() == null ? c6562cfe.n() == null : n().equals(c6562cfe.n())) {
                return (i() == null) == (c6562cfe.i() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetDeviceModel_{deviceName=" + ((Object) n()) + ", clickListener=" + i() + "}" + super.toString();
    }
}
