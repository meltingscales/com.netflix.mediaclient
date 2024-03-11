package o;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ro  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC9557ro extends AbstractC9323nS {
    protected Object a;
    protected final AbstractC9557ro c;
    protected String e;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.a;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.a = obj;
    }

    @Override // o.AbstractC9323nS
    public final String c() {
        return this.e;
    }

    public abstract JsonToken l();

    public abstract boolean m();

    @Override // o.AbstractC9323nS
    /* renamed from: n */
    public final AbstractC9557ro b() {
        return this.c;
    }

    public abstract AbstractC9454pr o();

    public abstract JsonToken p();

    public AbstractC9557ro(int i, AbstractC9557ro abstractC9557ro) {
        this.b = i;
        this.d = -1;
        this.c = abstractC9557ro;
    }

    public final AbstractC9557ro r() {
        AbstractC9454pr o2 = o();
        if (o2 == null) {
            throw new IllegalStateException("No current node");
        }
        if (o2.l()) {
            return new e(o2, this);
        }
        if (o2.p()) {
            return new d(o2, this);
        }
        throw new IllegalStateException("Current node of type " + o2.getClass().getName());
    }

    /* renamed from: o.ro$c */
    /* loaded from: classes5.dex */
    protected static final class c extends AbstractC9557ro {
        protected boolean g;
        protected AbstractC9454pr j;

        @Override // o.AbstractC9557ro
        public JsonToken l() {
            return null;
        }

        @Override // o.AbstractC9557ro
        public boolean m() {
            return false;
        }

        @Override // o.AbstractC9557ro
        public AbstractC9454pr o() {
            return this.j;
        }

        @Override // o.AbstractC9557ro, o.AbstractC9323nS
        public /* synthetic */ AbstractC9323nS b() {
            return super.b();
        }

        public c(AbstractC9454pr abstractC9454pr, AbstractC9557ro abstractC9557ro) {
            super(0, abstractC9557ro);
            this.g = false;
            this.j = abstractC9454pr;
        }

        @Override // o.AbstractC9557ro
        public JsonToken p() {
            if (this.g) {
                this.j = null;
                return null;
            }
            this.d++;
            this.g = true;
            return this.j.e();
        }
    }

    /* renamed from: o.ro$e */
    /* loaded from: classes5.dex */
    protected static final class e extends AbstractC9557ro {
        protected Iterator<AbstractC9454pr> h;
        protected AbstractC9454pr j;

        @Override // o.AbstractC9557ro
        public AbstractC9454pr o() {
            return this.j;
        }

        @Override // o.AbstractC9557ro, o.AbstractC9323nS
        public /* synthetic */ AbstractC9323nS b() {
            return super.b();
        }

        public e(AbstractC9454pr abstractC9454pr, AbstractC9557ro abstractC9557ro) {
            super(1, abstractC9557ro);
            this.h = abstractC9454pr.i();
        }

        @Override // o.AbstractC9557ro
        public JsonToken p() {
            if (!this.h.hasNext()) {
                this.j = null;
                return null;
            }
            this.d++;
            AbstractC9454pr next = this.h.next();
            this.j = next;
            return next.e();
        }

        @Override // o.AbstractC9557ro
        public JsonToken l() {
            return JsonToken.END_ARRAY;
        }

        @Override // o.AbstractC9557ro
        public boolean m() {
            return ((ContainerNode) o()).u() > 0;
        }
    }

    /* renamed from: o.ro$d */
    /* loaded from: classes5.dex */
    protected static final class d extends AbstractC9557ro {
        protected boolean g;
        protected Map.Entry<String, AbstractC9454pr> h;
        protected Iterator<Map.Entry<String, AbstractC9454pr>> j;

        @Override // o.AbstractC9557ro, o.AbstractC9323nS
        public /* synthetic */ AbstractC9323nS b() {
            return super.b();
        }

        public d(AbstractC9454pr abstractC9454pr, AbstractC9557ro abstractC9557ro) {
            super(2, abstractC9557ro);
            this.j = ((ObjectNode) abstractC9454pr).k();
            this.g = true;
        }

        @Override // o.AbstractC9557ro
        public JsonToken p() {
            if (this.g) {
                if (!this.j.hasNext()) {
                    this.e = null;
                    this.h = null;
                    return null;
                }
                this.d++;
                this.g = false;
                Map.Entry<String, AbstractC9454pr> next = this.j.next();
                this.h = next;
                this.e = next != null ? next.getKey() : null;
                return JsonToken.FIELD_NAME;
            }
            this.g = true;
            return this.h.getValue().e();
        }

        @Override // o.AbstractC9557ro
        public JsonToken l() {
            return JsonToken.END_OBJECT;
        }

        @Override // o.AbstractC9557ro
        public AbstractC9454pr o() {
            Map.Entry<String, AbstractC9454pr> entry = this.h;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // o.AbstractC9557ro
        public boolean m() {
            return ((ContainerNode) o()).u() > 0;
        }
    }
}
