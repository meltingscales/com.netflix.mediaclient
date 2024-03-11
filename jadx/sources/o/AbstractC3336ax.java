package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3179au;

/* renamed from: o.ax  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3336ax<T extends AbstractC3179au> extends AbstractC3073as<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T b(ViewParent viewParent);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* bridge */ /* synthetic */ void a(Object obj) {
        a((AbstractC3336ax<T>) ((AbstractC3179au) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* synthetic */ void c(int i, Object obj) {
        a(i, (int) ((AbstractC3179au) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* synthetic */ void c(Object obj) {
        e((AbstractC3336ax<T>) ((AbstractC3179au) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        a((AbstractC3336ax<T>) ((AbstractC3179au) obj), (AbstractC3073as<?>) abstractC3073as);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* bridge */ /* synthetic */ void d(Object obj) {
        d((AbstractC3336ax<T>) ((AbstractC3179au) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* synthetic */ void d(Object obj, List list) {
        b((AbstractC3336ax<T>) ((AbstractC3179au) obj), (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3073as
    public /* synthetic */ void e(Object obj) {
        b((AbstractC3336ax<T>) ((AbstractC3179au) obj));
    }

    public void e(T t) {
        super.c((AbstractC3336ax<T>) t);
    }

    public void b(T t, List<Object> list) {
        super.d(t, list);
    }

    public void a(T t, AbstractC3073as<?> abstractC3073as) {
        super.c((AbstractC3336ax<T>) t, abstractC3073as);
    }

    public void b(T t) {
        super.e((AbstractC3336ax<T>) t);
    }

    public void a(int i, T t) {
        super.c(i, (int) t);
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void b(float f, float f2, int i, int i2, T t) {
        super.b(f, f2, i, i2, t);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a_ */
    public boolean b(T t) {
        return super.b((AbstractC3336ax<T>) t);
    }

    public void a(T t) {
        super.a((AbstractC3336ax<T>) t);
    }

    public void d(T t) {
        super.d((AbstractC3336ax<T>) t);
    }
}
