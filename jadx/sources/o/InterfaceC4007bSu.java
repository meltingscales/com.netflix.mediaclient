package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import java.util.Optional;

/* renamed from: o.bSu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4007bSu {
    Single<C4003bSq> a(int i, int i2);

    Single<C4001bSo> a(int i, int i2, List<Integer> list, int i3, int i4, String str, String str2);

    Single<Optional<C4003bSq>> b(int i, boolean z);

    Completable c(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2);

    Single<InterfaceC5155btS> c();

    Single<Optional<C4003bSq>> c(int i, boolean z);

    Single<C4003bSq> c(InterfaceC5155btS interfaceC5155btS, int i, int i2, boolean z);

    Single<List<C4003bSq>> c(InterfaceC5155btS interfaceC5155btS, int i, LoMo loMo, Integer num);

    Single<List<C4002bSp>> c(InterfaceC5155btS interfaceC5155btS, LoMo loMo, int i, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug);

    Completable d(String str, int i, int i2);

    dyS<String> d();

    /* renamed from: o.bSu$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ Single a(InterfaceC4007bSu interfaceC4007bSu, int i, int i2, List list, int i3, int i4, String str, String str2, int i5, Object obj) {
            List list2;
            List i6;
            if (obj == null) {
                if ((i5 & 4) != 0) {
                    i6 = C8569dql.i();
                    list2 = i6;
                } else {
                    list2 = list;
                }
                return interfaceC4007bSu.a(i, i2, list2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4, (i5 & 32) != 0 ? null : str, (i5 & 64) != 0 ? null : str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLolomo");
        }

        public static /* synthetic */ Single e(InterfaceC4007bSu interfaceC4007bSu, InterfaceC5155btS interfaceC5155btS, int i, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 8) != 0) {
                    z = false;
                }
                return interfaceC4007bSu.c(interfaceC5155btS, i, i2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRow");
        }
    }
}
