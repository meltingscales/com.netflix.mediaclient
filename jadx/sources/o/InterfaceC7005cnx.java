package o;

import com.netflix.mediaclient.graphql.models.type.MyListGenreFilter;
import com.netflix.mediaclient.graphql.models.type.MyListProgressFilter;
import com.netflix.mediaclient.graphql.models.type.MyListSort;

/* renamed from: o.cnx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7005cnx {
    Object c(int i, MyListSort myListSort, MyListGenreFilter myListGenreFilter, MyListProgressFilter myListProgressFilter, String str, InterfaceC8585dra<? super C7013coE> interfaceC8585dra);

    /* renamed from: o.cnx$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static /* synthetic */ Object a(InterfaceC7005cnx interfaceC7005cnx, int i, MyListSort myListSort, MyListGenreFilter myListGenreFilter, MyListProgressFilter myListProgressFilter, String str, InterfaceC8585dra interfaceC8585dra, int i2, Object obj) {
            if (obj == null) {
                return interfaceC7005cnx.c(i, myListSort, (i2 & 4) != 0 ? null : myListGenreFilter, (i2 & 8) != 0 ? null : myListProgressFilter, (i2 & 16) != 0 ? null : str, interfaceC8585dra);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMyList");
        }
    }
}
