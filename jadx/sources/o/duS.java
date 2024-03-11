package o;

import java.util.List;

/* loaded from: classes5.dex */
public interface duS<E> extends List<E>, duR<E> {

    /* loaded from: classes5.dex */
    public static final class e {
        public static <E> duS<E> d(duS<? extends E> dus, int i, int i2) {
            C8632dsu.c((Object) dus, "");
            return new a(dus, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<E> extends dpT<E> implements duS<E> {
        private final int a;
        private final int b;
        private final duS<E> c;
        private int d;

        @Override // o.dpQ
        public int getSize() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(duS<? extends E> dus, int i, int i2) {
            C8632dsu.c((Object) dus, "");
            this.c = dus;
            this.b = i;
            this.a = i2;
            C8728dwi.a(i, i2, dus.size());
            this.d = i2 - i;
        }

        @Override // o.dpT, java.util.List
        public E get(int i) {
            C8728dwi.b(i, this.d);
            return this.c.get(this.b + i);
        }

        @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        /* renamed from: b */
        public duS<E> subList(int i, int i2) {
            C8728dwi.a(i, i2, this.d);
            duS<E> dus = this.c;
            int i3 = this.b;
            return new a(dus, i + i3, i3 + i2);
        }
    }
}
