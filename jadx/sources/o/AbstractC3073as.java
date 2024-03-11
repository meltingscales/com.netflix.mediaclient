package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.IllegalEpoxyUsage;
import com.airbnb.epoxy.ImmutableModelException;
import java.util.List;
import o.AbstractC2914ap;

/* renamed from: o.as  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3073as<T> {
    private static long c = -1;
    AbstractC2914ap a;
    private AbstractC2914ap b;
    private boolean d;
    boolean e;
    private int f;
    private boolean g;
    private long h;
    private boolean i;
    private int j;
    private b n;

    /* renamed from: o.as$b */
    /* loaded from: classes2.dex */
    public interface b {
        int b(int i, int i2, int i3);
    }

    protected abstract int a();

    public AbstractC3073as<T> a(b bVar) {
        this.n = bVar;
        return this;
    }

    public void a(T t) {
    }

    public int b(int i, int i2, int i3) {
        return 1;
    }

    public long b() {
        return this.h;
    }

    public void b(float f, float f2, int i, int i2, T t) {
    }

    public boolean b(T t) {
        return false;
    }

    public void c(int i, T t) {
    }

    public void c(T t) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.g;
    }

    public void d(T t) {
    }

    public void e(T t) {
    }

    public void e(T t, AbstractC3073as<?> abstractC3073as) {
    }

    public boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.b != null;
    }

    public boolean j() {
        return this.i;
    }

    protected AbstractC3073as(long j) {
        this.i = true;
        e(j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC3073as() {
        /*
            r4 = this;
            long r0 = o.AbstractC3073as.c
            r2 = 1
            long r2 = r0 - r2
            o.AbstractC3073as.c = r2
            r4.<init>(r0)
            r0 = 1
            r4.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3073as.<init>():void");
    }

    public int Z_() {
        return Y_();
    }

    public View d(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(Y_(), viewGroup, false);
    }

    public void d(T t, List<Object> list) {
        c((AbstractC3073as<T>) t);
    }

    public void c(T t, AbstractC3073as<?> abstractC3073as) {
        c((AbstractC3073as<T>) t);
    }

    public AbstractC3073as<T> e(long j) {
        if ((this.e || this.b != null) && j != this.h) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.g = false;
        this.h = j;
        return this;
    }

    public AbstractC3073as<T> a(CharSequence charSequence) {
        e(C1862aR.c(charSequence));
        return this;
    }

    public AbstractC3073as<T> a(int i) {
        h();
        this.f = i;
        return this;
    }

    public final int Y_() {
        int i = this.f;
        return i == 0 ? a() : i;
    }

    public void b(AbstractC2914ap abstractC2914ap) {
        abstractC2914ap.addInternal(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(AbstractC2914ap abstractC2914ap) {
        if (abstractC2914ap == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (abstractC2914ap.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + abstractC2914ap.getFirstIndexOfModelInBuildingList(this));
        } else if (this.b == null) {
            this.b = abstractC2914ap;
            this.j = hashCode();
            abstractC2914ap.addAfterInterceptorCallback(new AbstractC2914ap.b() { // from class: o.as.4
                @Override // o.AbstractC2914ap.b
                public void d(AbstractC2914ap abstractC2914ap2) {
                    AbstractC3073as.this.d = true;
                }

                @Override // o.AbstractC2914ap.b
                public void b(AbstractC2914ap abstractC2914ap2) {
                    AbstractC3073as abstractC3073as = AbstractC3073as.this;
                    abstractC3073as.j = abstractC3073as.hashCode();
                    AbstractC3073as.this.d = false;
                }
            });
        }
    }

    public final void h() {
        if (g() && !this.d) {
            throw new ImmutableModelException(this, e(this.b, (AbstractC3073as<?>) this));
        }
        AbstractC2914ap abstractC2914ap = this.a;
        if (abstractC2914ap != null) {
            abstractC2914ap.setStagedModel(this);
        }
    }

    private static int e(AbstractC2914ap abstractC2914ap, AbstractC3073as<?> abstractC3073as) {
        if (abstractC2914ap.isBuildingModels()) {
            return abstractC2914ap.getFirstIndexOfModelInBuildingList(abstractC3073as);
        }
        return abstractC2914ap.getAdapter().c(abstractC3073as);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str, int i) {
        if (g() && !this.d && this.j != hashCode()) {
            throw new ImmutableModelException(this, str, i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC3073as) {
            AbstractC3073as abstractC3073as = (AbstractC3073as) obj;
            return this.h == abstractC3073as.h && Z_() == abstractC3073as.Z_() && this.i == abstractC3073as.i;
        }
        return false;
    }

    public int hashCode() {
        long j = this.h;
        return (((((int) (j ^ (j >>> 32))) * 31) + Z_()) * 31) + (this.i ? 1 : 0);
    }

    public final int e(int i, int i2, int i3) {
        b bVar = this.n;
        if (bVar != null) {
            return bVar.b(i, i2, i3);
        }
        return b(i, i2, i3);
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.h + ", viewType=" + Z_() + ", shown=" + this.i + ", addedToAdapter=" + this.e + '}';
    }
}
