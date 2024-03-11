package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import o.AbstractC3073as;

/* renamed from: o.csS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7237csS extends AbstractC3073as<C7231csM> implements InterfaceC1673aK<C7231csM>, InterfaceC7235csQ {
    private InterfaceC4467bf<C7237csS, C7231csM> f;
    private InterfaceC4573bh<C7237csS, C7231csM> h;
    private InterfaceC4414be<C7237csS, C7231csM> j;
    private InterfaceC4732bk<C7237csS, C7231csM> m;
    private final BitSet d = new BitSet(4);
    private int i = 0;
    private C4679bj g = new C4679bj();
    private C4679bj c = new C4679bj(null);
    private View.OnClickListener b = null;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, C7231csM c7231csM, int i) {
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7231csM d(ViewGroup viewGroup) {
        C7231csM c7231csM = new C7231csM(viewGroup.getContext());
        c7231csM.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return c7231csM;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C7231csM c7231csM) {
        super.c((C7237csS) c7231csM);
        c7231csM.setIcon(this.i);
        c7231csM.setButton(this.c.d(c7231csM.getContext()));
        c7231csM.setMessage(this.g.d(c7231csM.getContext()));
        c7231csM.d(this.b);
    }

    @Override // o.AbstractC3073as
    public void c(C7231csM c7231csM, AbstractC3073as abstractC3073as) {
        if (!(abstractC3073as instanceof C7237csS)) {
            c(c7231csM);
            return;
        }
        C7237csS c7237csS = (C7237csS) abstractC3073as;
        super.c((C7237csS) c7231csM);
        int i = this.i;
        if (i != c7237csS.i) {
            c7231csM.setIcon(i);
        }
        C4679bj c4679bj = this.c;
        if (c4679bj == null ? c7237csS.c != null : !c4679bj.equals(c7237csS.c)) {
            c7231csM.setButton(this.c.d(c7231csM.getContext()));
        }
        C4679bj c4679bj2 = this.g;
        if (c4679bj2 == null ? c7237csS.g != null : !c4679bj2.equals(c7237csS.g)) {
            c7231csM.setMessage(this.g.d(c7231csM.getContext()));
        }
        View.OnClickListener onClickListener = this.b;
        if ((onClickListener == null) != (c7237csS.b == null)) {
            c7231csM.d(onClickListener);
        }
    }

    @Override // o.InterfaceC1673aK
    public void a(C7231csM c7231csM, int i) {
        InterfaceC4467bf<C7237csS, C7231csM> interfaceC4467bf = this.f;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c7231csM, i);
        }
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public void e(C7231csM c7231csM) {
        super.e((C7237csS) c7231csM);
        InterfaceC4414be<C7237csS, C7231csM> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c7231csM);
        }
        c7231csM.d((View.OnClickListener) null);
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C7231csM c7231csM) {
        InterfaceC4732bk<C7237csS, C7231csM> interfaceC4732bk = this.m;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c7231csM, i);
        }
        super.c(i, (int) c7231csM);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public void b(float f, float f2, int i, int i2, C7231csM c7231csM) {
        InterfaceC4573bh<C7237csS, C7231csM> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c7231csM, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c7231csM);
    }

    @Override // o.InterfaceC7235csQ
    /* renamed from: g */
    public C7237csS c(int i) {
        h();
        this.i = i;
        return this;
    }

    @Override // o.InterfaceC7235csQ
    /* renamed from: i */
    public C7237csS e(int i) {
        h();
        this.d.set(1);
        this.g.a(i);
        return this;
    }

    @Override // o.InterfaceC7235csQ
    /* renamed from: b */
    public C7237csS d(int i) {
        h();
        this.c.a(i);
        return this;
    }

    @Override // o.InterfaceC7235csQ
    /* renamed from: e */
    public C7237csS c(View.OnClickListener onClickListener) {
        h();
        this.b = onClickListener;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7237csS e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7235csQ
    /* renamed from: c */
    public C7237csS e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: j */
    public C7237csS a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7237csS a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    @Override // o.AbstractC3073as
    public int a() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7237csS) && super.equals(obj)) {
            C7237csS c7237csS = (C7237csS) obj;
            if ((this.f == null) != (c7237csS.f == null)) {
                return false;
            }
            if ((this.j == null) != (c7237csS.j == null)) {
                return false;
            }
            if ((this.m == null) != (c7237csS.m == null)) {
                return false;
            }
            if ((this.h == null) == (c7237csS.h == null) && this.i == c7237csS.i) {
                C4679bj c4679bj = this.g;
                if (c4679bj == null ? c7237csS.g == null : c4679bj.equals(c7237csS.g)) {
                    C4679bj c4679bj2 = this.c;
                    if (c4679bj2 == null ? c7237csS.c == null : c4679bj2.equals(c7237csS.c)) {
                        return (this.b == null) == (c7237csS.b == null);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.f != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.m != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int i5 = this.i;
        C4679bj c4679bj = this.g;
        int hashCode2 = c4679bj != null ? c4679bj.hashCode() : 0;
        C4679bj c4679bj2 = this.c;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + (c4679bj2 != null ? c4679bj2.hashCode() : 0)) * 31) + (this.b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "EmptyStateEpoxyViewModel_{icon_Int=" + this.i + ", message_StringAttributeData=" + this.g + ", button_StringAttributeData=" + this.c + ", clickListener_OnClickListener=" + this.b + "}" + super.toString();
    }
}
