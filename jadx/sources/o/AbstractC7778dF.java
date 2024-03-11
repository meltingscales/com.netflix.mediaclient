package o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.dF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC7778dF<V, O> implements InterfaceC7643dA<V, O> {
    final List<C8910fd<V>> a;

    @Override // o.InterfaceC7643dA
    public List<C8910fd<V>> c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7778dF(List<C8910fd<V>> list) {
        this.a = list;
    }

    @Override // o.InterfaceC7643dA
    public boolean a() {
        if (this.a.isEmpty()) {
            return true;
        }
        return this.a.size() == 1 && this.a.get(0).g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
