package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.cN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5913cN<K, A> {
    protected C8912ff<A> a;
    private final a<K> h;
    final List<d> e = new ArrayList(1);
    private boolean f = false;
    protected float d = 0.0f;
    private A b = null;
    private float g = -1.0f;
    private float c = -1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cN$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        C8910fd<T> a();

        boolean a(float f);

        float b();

        boolean c();

        float d();

        boolean d(float f);
    }

    /* renamed from: o.cN$d */
    /* loaded from: classes2.dex */
    public interface d {
        void b();
    }

    public float c() {
        return this.d;
    }

    abstract A c(C8910fd<K> c8910fd, float f);

    public void i() {
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5913cN(List<? extends C8910fd<K>> list) {
        this.h = c(list);
    }

    public void b(d dVar) {
        this.e.add(dVar);
    }

    public void c(float f) {
        if (this.h.c()) {
            return;
        }
        if (f < h()) {
            f = h();
        } else if (f > e()) {
            f = e();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (this.h.d(f)) {
            f();
        }
    }

    public void f() {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8910fd<K> b() {
        C3550bC.d("BaseKeyframeAnimation#getCurrentKeyframe");
        C8910fd<K> a2 = this.h.a();
        C3550bC.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        if (this.f) {
            return 0.0f;
        }
        C8910fd<K> b2 = b();
        if (b2.g()) {
            return 0.0f;
        }
        return (this.d - b2.j()) / (b2.b() - b2.j());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        C8910fd<K> b2 = b();
        if (b2 == null || b2.g()) {
            return 0.0f;
        }
        return b2.a.getInterpolation(a());
    }

    private float h() {
        if (this.g == -1.0f) {
            this.g = this.h.d();
        }
        return this.g;
    }

    float e() {
        if (this.c == -1.0f) {
            this.c = this.h.b();
        }
        return this.c;
    }

    public A g() {
        A c2;
        float a2 = a();
        if (this.a == null && this.h.a(a2)) {
            return this.b;
        }
        C8910fd<K> b2 = b();
        Interpolator interpolator = b2.i;
        if (interpolator != null && b2.h != null) {
            c2 = a(b2, a2, interpolator.getInterpolation(a2), b2.h.getInterpolation(a2));
        } else {
            c2 = c(b2, d());
        }
        this.b = c2;
        return c2;
    }

    public void b(C8912ff<A> c8912ff) {
        C8912ff<A> c8912ff2 = this.a;
        if (c8912ff2 != null) {
            c8912ff2.c((AbstractC5913cN<?, ?>) null);
        }
        this.a = c8912ff;
        if (c8912ff != null) {
            c8912ff.c((AbstractC5913cN<?, ?>) this);
        }
    }

    protected A a(C8910fd<K> c8910fd, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> a<T> c(List<? extends C8910fd<T>> list) {
        if (list.isEmpty()) {
            return new e();
        }
        if (list.size() == 1) {
            return new c(list);
        }
        return new b(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cN$e */
    /* loaded from: classes2.dex */
    public static final class e<T> implements a<T> {
        @Override // o.AbstractC5913cN.a
        public float b() {
            return 1.0f;
        }

        @Override // o.AbstractC5913cN.a
        public boolean c() {
            return true;
        }

        @Override // o.AbstractC5913cN.a
        public float d() {
            return 0.0f;
        }

        @Override // o.AbstractC5913cN.a
        public boolean d(float f) {
            return false;
        }

        private e() {
        }

        @Override // o.AbstractC5913cN.a
        public C8910fd<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.AbstractC5913cN.a
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cN$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements a<T> {
        private float c = -1.0f;
        private final C8910fd<T> e;

        @Override // o.AbstractC5913cN.a
        public C8910fd<T> a() {
            return this.e;
        }

        @Override // o.AbstractC5913cN.a
        public boolean a(float f) {
            if (this.c == f) {
                return true;
            }
            this.c = f;
            return false;
        }

        @Override // o.AbstractC5913cN.a
        public boolean c() {
            return false;
        }

        c(List<? extends C8910fd<T>> list) {
            this.e = list.get(0);
        }

        @Override // o.AbstractC5913cN.a
        public boolean d(float f) {
            return !this.e.g();
        }

        @Override // o.AbstractC5913cN.a
        public float d() {
            return this.e.j();
        }

        @Override // o.AbstractC5913cN.a
        public float b() {
            return this.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cN$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements a<T> {
        private final List<? extends C8910fd<T>> a;
        private C8910fd<T> b = null;
        private float c = -1.0f;
        private C8910fd<T> e = e(0.0f);

        @Override // o.AbstractC5913cN.a
        public C8910fd<T> a() {
            return this.e;
        }

        @Override // o.AbstractC5913cN.a
        public boolean a(float f) {
            C8910fd<T> c8910fd = this.b;
            C8910fd<T> c8910fd2 = this.e;
            if (c8910fd == c8910fd2 && this.c == f) {
                return true;
            }
            this.b = c8910fd2;
            this.c = f;
            return false;
        }

        @Override // o.AbstractC5913cN.a
        public boolean c() {
            return false;
        }

        b(List<? extends C8910fd<T>> list) {
            this.a = list;
        }

        @Override // o.AbstractC5913cN.a
        public boolean d(float f) {
            if (this.e.b(f)) {
                return !this.e.g();
            }
            this.e = e(f);
            return true;
        }

        private C8910fd<T> e(float f) {
            List<? extends C8910fd<T>> list = this.a;
            C8910fd<T> c8910fd = list.get(list.size() - 1);
            if (f >= c8910fd.j()) {
                return c8910fd;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                C8910fd<T> c8910fd2 = this.a.get(size);
                if (this.e != c8910fd2 && c8910fd2.b(f)) {
                    return c8910fd2;
                }
            }
            return this.a.get(0);
        }

        @Override // o.AbstractC5913cN.a
        public float d() {
            return this.a.get(0).j();
        }

        @Override // o.AbstractC5913cN.a
        public float b() {
            List<? extends C8910fd<T>> list = this.a;
            return list.get(list.size() - 1).b();
        }
    }
}
