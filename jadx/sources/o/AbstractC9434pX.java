package o;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.util.Map;

/* renamed from: o.pX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9434pX {
    public final Object b;
    public final AbstractC9434pX e;

    public abstract void d(Object obj);

    protected AbstractC9434pX(AbstractC9434pX abstractC9434pX, Object obj) {
        this.e = abstractC9434pX;
        this.b = obj;
    }

    /* renamed from: o.pX$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC9434pX {
        final SettableBeanProperty a;

        public a(AbstractC9434pX abstractC9434pX, Object obj, SettableBeanProperty settableBeanProperty) {
            super(abstractC9434pX, obj);
            this.a = settableBeanProperty;
        }

        @Override // o.AbstractC9434pX
        public void d(Object obj) {
            this.a.e(obj, this.b);
        }
    }

    /* renamed from: o.pX$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC9434pX {
        final String a;
        final SettableAnyProperty d;

        public b(AbstractC9434pX abstractC9434pX, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(abstractC9434pX, obj);
            this.d = settableAnyProperty;
            this.a = str;
        }

        @Override // o.AbstractC9434pX
        public void d(Object obj) {
            this.d.d(obj, this.a, this.b);
        }
    }

    /* renamed from: o.pX$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC9434pX {
        final Object a;

        public c(AbstractC9434pX abstractC9434pX, Object obj, Object obj2) {
            super(abstractC9434pX, obj);
            this.a = obj2;
        }

        @Override // o.AbstractC9434pX
        public void d(Object obj) {
            ((Map) obj).put(this.a, this.b);
        }
    }
}
