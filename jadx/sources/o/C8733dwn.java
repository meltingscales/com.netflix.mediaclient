package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.dwn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8733dwn {
    public static final <T> Object a(Collection<? extends dwZ<? extends T>> collection, InterfaceC8585dra<? super List<? extends T>> interfaceC8585dra) {
        List i;
        if (collection.isEmpty()) {
            i = C8569dql.i();
            return i;
        }
        return new C8732dwm((dwZ[]) collection.toArray(new dwZ[0])).a(interfaceC8585dra);
    }
}
