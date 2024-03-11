package o;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class drD implements dtQ<String> {
    private final BufferedReader c;

    public drD(BufferedReader bufferedReader) {
        C8632dsu.c((Object) bufferedReader, "");
        this.c = bufferedReader;
    }

    /* loaded from: classes5.dex */
    public static final class b implements Iterator<String>, dsK {
        private boolean a;
        private String b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == null && !this.a) {
                String readLine = drD.this.c.readLine();
                this.b = readLine;
                if (readLine == null) {
                    this.a = true;
                }
            }
            return this.b != null;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.b;
            this.b = null;
            C8632dsu.d((Object) str);
            return str;
        }
    }

    @Override // o.dtQ
    public Iterator<String> iterator() {
        return new b();
    }
}
