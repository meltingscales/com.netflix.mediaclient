package o;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import o.AbstractC7757dEf;
import o.InterfaceC7717dCt;
import o.InterfaceC7720dCw;
import o.dBP;

/* renamed from: o.dEf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7757dEf<Tag> implements InterfaceC7720dCw, InterfaceC7717dCt {
    private final ArrayList<Tag> c = new ArrayList<>();
    private boolean d;

    @Override // o.InterfaceC7720dCw
    public InterfaceC7717dCt c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this;
    }

    @Override // o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
    }

    @Override // o.InterfaceC7720dCw
    public final Void g() {
        return null;
    }

    protected boolean i(Tag tag) {
        return true;
    }

    protected abstract Tag n(InterfaceC7707dCj interfaceC7707dCj, int i);

    @Override // o.InterfaceC7717dCt
    public int b(InterfaceC7707dCj interfaceC7707dCj) {
        return InterfaceC7717dCt.d.a(this, interfaceC7707dCj);
    }

    @Override // o.InterfaceC7720dCw
    public <T> T d(dBP<? extends T> dbp) {
        return (T) InterfaceC7720dCw.a.c(this, dbp);
    }

    @Override // o.InterfaceC7717dCt
    public boolean h() {
        return InterfaceC7717dCt.d.d(this);
    }

    @Override // o.InterfaceC7717dCt
    public dFP n() {
        return dFU.a();
    }

    protected Object m(Tag tag) {
        throw new SerializationException(dsA.a(getClass()) + " can't retrieve untyped values");
    }

    protected boolean b(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Boolean) m).booleanValue();
    }

    protected byte a(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Byte) m).byteValue();
    }

    protected short h(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Short) m).shortValue();
    }

    protected int j(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Integer) m).intValue();
    }

    protected long f(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Long) m).longValue();
    }

    protected float e(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Float) m).floatValue();
    }

    protected double d(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Double) m).doubleValue();
    }

    protected char c(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Character) m).charValue();
    }

    protected String g(Tag tag) {
        Object m = m(tag);
        C8632dsu.d(m);
        return (String) m;
    }

    protected int b(Tag tag, InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        Object m = m(tag);
        C8632dsu.d(m);
        return ((Integer) m).intValue();
    }

    public InterfaceC7720dCw a(Tag tag, InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        n(tag);
        return this;
    }

    public <T> T c(dBP<? extends T> dbp, T t) {
        C8632dsu.c((Object) dbp, "");
        return (T) d((dBP<? extends Object>) dbp);
    }

    @Override // o.InterfaceC7720dCw
    public InterfaceC7720dCw a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return a((AbstractC7757dEf<Tag>) cA_(), interfaceC7707dCj);
    }

    @Override // o.InterfaceC7720dCw
    public boolean i() {
        Tag cz_ = cz_();
        if (cz_ == null) {
            return false;
        }
        return i(cz_);
    }

    @Override // o.InterfaceC7720dCw
    public final boolean c() {
        return b((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final byte a() {
        return a((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final short o() {
        return h((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final int f() {
        return j(cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final long j() {
        return f(cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final float b() {
        return e((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final double d() {
        return d((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final char e() {
        return c((AbstractC7757dEf<Tag>) cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final String m() {
        return g(cA_());
    }

    @Override // o.InterfaceC7720dCw
    public final int d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return b((AbstractC7757dEf<Tag>) cA_(), interfaceC7707dCj);
    }

    @Override // o.InterfaceC7717dCt
    public final boolean a(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return b((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final byte d(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return a((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final short g(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return h((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final int j(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return j(n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final long i(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return f(n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final float e(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return e((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final double b(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return d((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final char c(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return c((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final String h(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return g(n(interfaceC7707dCj, i));
    }

    @Override // o.InterfaceC7717dCt
    public final InterfaceC7720dCw f(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return a((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i), interfaceC7707dCj.c(i));
    }

    @Override // o.InterfaceC7717dCt
    public final <T> T d(InterfaceC7707dCj interfaceC7707dCj, int i, final dBP<? extends T> dbp, final T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbp, "");
        return (T) e((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i), (drO<? extends Object>) ((drO<T>) new drO<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1
            final /* synthetic */ AbstractC7757dEf<Tag> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.a = this;
            }

            @Override // o.drO
            public final T invoke() {
                return (T) this.a.c((dBP<? extends dBP<T>>) dbp, (dBP<T>) t);
            }
        }));
    }

    @Override // o.InterfaceC7717dCt
    public final <T> T e(InterfaceC7707dCj interfaceC7707dCj, int i, final dBP<? extends T> dbp, final T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbp, "");
        return (T) e((AbstractC7757dEf<Tag>) n(interfaceC7707dCj, i), (drO<? extends Object>) ((drO<T>) new drO<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1
            final /* synthetic */ AbstractC7757dEf<Tag> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.b = this;
            }

            @Override // o.drO
            public final T invoke() {
                return this.b.i() ? (T) this.b.c((dBP<? extends dBP<T>>) dbp, (dBP<T>) t) : (T) this.b.g();
            }
        }));
    }

    private final <E> E e(Tag tag, drO<? extends E> dro) {
        n(tag);
        E invoke = dro.invoke();
        if (!this.d) {
            cA_();
        }
        this.d = false;
        return invoke;
    }

    public final Tag cz_() {
        Object D;
        D = C8576dqs.D((List<? extends Object>) this.c);
        return (Tag) D;
    }

    public final void n(Tag tag) {
        this.c.add(tag);
    }

    protected final Tag cA_() {
        int t;
        ArrayList<Tag> arrayList = this.c;
        t = C8569dql.t(arrayList);
        Tag remove = arrayList.remove(t);
        this.d = true;
        return remove;
    }
}
