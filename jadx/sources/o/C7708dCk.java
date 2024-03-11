package o;

import java.util.Iterator;

/* renamed from: o.dCk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7708dCk {

    /* renamed from: o.dCk$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterable<InterfaceC7707dCj>, dsK {
        final /* synthetic */ InterfaceC7707dCj b;

        public a(InterfaceC7707dCj interfaceC7707dCj) {
            this.b = interfaceC7707dCj;
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC7707dCj> iterator() {
            return new d(this.b);
        }
    }

    /* renamed from: o.dCk$e */
    /* loaded from: classes5.dex */
    public static final class e implements Iterable<String>, dsK {
        final /* synthetic */ InterfaceC7707dCj c;

        public e(InterfaceC7707dCj interfaceC7707dCj) {
            this.c = interfaceC7707dCj;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new c(this.c);
        }
    }

    /* renamed from: o.dCk$d */
    /* loaded from: classes5.dex */
    public static final class d implements Iterator<InterfaceC7707dCj>, dsK {
        private int c;
        final /* synthetic */ InterfaceC7707dCj d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        d(InterfaceC7707dCj interfaceC7707dCj) {
            this.d = interfaceC7707dCj;
            this.c = interfaceC7707dCj.e();
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public InterfaceC7707dCj next() {
            InterfaceC7707dCj interfaceC7707dCj = this.d;
            int e = interfaceC7707dCj.e();
            int i = this.c;
            this.c = i - 1;
            return interfaceC7707dCj.c(e - i);
        }
    }

    public static final Iterable<InterfaceC7707dCj> d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return new a(interfaceC7707dCj);
    }

    /* renamed from: o.dCk$c */
    /* loaded from: classes5.dex */
    public static final class c implements Iterator<String>, dsK {
        final /* synthetic */ InterfaceC7707dCj a;
        private int d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        c(InterfaceC7707dCj interfaceC7707dCj) {
            this.a = interfaceC7707dCj;
            this.d = interfaceC7707dCj.e();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public String next() {
            InterfaceC7707dCj interfaceC7707dCj = this.a;
            int e = interfaceC7707dCj.e();
            int i = this.d;
            this.d = i - 1;
            return interfaceC7707dCj.a(e - i);
        }
    }

    public static final Iterable<String> b(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return new e(interfaceC7707dCj);
    }
}
