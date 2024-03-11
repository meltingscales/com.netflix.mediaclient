package o;

import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import io.reactivex.Single;
import io.reactivex.subjects.SingleSubject;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bzN  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5468bzN implements CollectPhone.e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long e$s69$156 = -2399797067919902302L;
    private static int f = 0;
    private static int g = 1;
    private String a;
    private String b;
    private final List<CollectPhone.d> c;
    private String d;
    private SingleSubject<String> e;

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void a(String str) {
        int i = 2 % 2;
        int i2 = g + 43;
        f = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) str, "");
        this.a = str;
        int i4 = g + 125;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public List<CollectPhone.d> b() {
        int i = 2 % 2;
        int i2 = g + 3;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            return this.c;
        }
        throw null;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void d(String str) {
        int i = 2 % 2;
        int i2 = f + 99;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            throw null;
        }
        C8632dsu.c((Object) str, "");
        this.d = str;
        int i3 = f + 97;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public String e() {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 105;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.b;
        int i5 = i2 + 63;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public void e(String str) {
        int i = 2 % 2;
        int i2 = g + 93;
        f = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) str, "");
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
    }

    public C5468bzN() {
        List<CollectPhone.d> j;
        Object[] objArr = new Object[1];
        k(0, new char[]{51338, 42821, 51387, 20785, 48987}, objArr);
        j = C8569dql.j(new CollectPhone.d("US", ((String) objArr[0]).intern(), "United States"), new CollectPhone.d("AF", "93", "Afghanistan"));
        this.c = j;
        this.b = "+1 5555555555";
        this.d = "";
        this.a = "";
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public CollectPhone.d d() {
        Object x;
        int i = 2 % 2;
        int i2 = f + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        x = C8576dqs.x(b());
        CollectPhone.d dVar = (CollectPhone.d) x;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return dVar;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public boolean c() {
        boolean g2;
        int i = 2 % 2;
        int i2 = g + 51;
        f = i2 % 128;
        int i3 = i2 % 2;
        g2 = C8691duz.g(this.d);
        boolean z = !g2;
        int i4 = g + 61;
        f = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> a() {
        int i = 2 % 2;
        int i2 = g + 33;
        f = i2 % 128;
        int i3 = i2 % 2;
        Single<dpR> just = Single.just(dpR.c);
        C8632dsu.a(just, "");
        int i4 = f + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return just;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> i() {
        Single<dpR> delay;
        int i = 2 % 2;
        int i2 = f + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (this.d.length() == 10) {
            if (C8632dsu.c((Object) this.d, (Object) "1234567890")) {
                Single<dpR> delay2 = Single.error(CollectPhone.Error.GenericFailure.c).delay(500L, TimeUnit.MILLISECONDS);
                C8632dsu.a(delay2, "");
                return delay2;
            }
            Single<dpR> delay3 = Single.just(dpR.c).delay(1000L, TimeUnit.MILLISECONDS);
            C8632dsu.a(delay3, "");
            return delay3;
        }
        int i4 = g + 31;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            delay = Single.error(CollectPhone.Error.InvalidPhoneNumber.b).delay(500L, TimeUnit.MILLISECONDS);
            C8632dsu.a(delay, "");
            int i5 = 12 / 0;
        } else {
            delay = Single.error(CollectPhone.Error.InvalidPhoneNumber.b).delay(500L, TimeUnit.MILLISECONDS);
            C8632dsu.a(delay, "");
        }
        int i6 = f + 107;
        g = i6 % 128;
        int i7 = i6 % 2;
        return delay;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> f() {
        Single<dpR> just;
        int i = 2 % 2;
        int i2 = f + 51;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            just = Single.just(dpR.c);
            C8632dsu.a(just, "");
            int i3 = 31 / 0;
        } else {
            just = Single.just(dpR.c);
            C8632dsu.a(just, "");
        }
        int i4 = g + 17;
        f = i4 % 128;
        int i5 = i4 % 2;
        return just;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> g() {
        int i = 2 % 2;
        int i2 = f + 41;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            C8632dsu.a(Single.just(dpR.c), "");
            throw null;
        }
        Single<dpR> just = Single.just(dpR.c);
        C8632dsu.a(just, "");
        int i3 = g + 63;
        f = i3 % 128;
        int i4 = i3 % 2;
        return just;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<String> h() {
        int i = 2 % 2;
        int i2 = g + 75;
        f = i2 % 128;
        int i3 = i2 % 2;
        SingleSubject<String> create = SingleSubject.create();
        C8632dsu.a(create, "");
        this.e = create;
        Single<String> delay = create.delay(2000L, TimeUnit.MILLISECONDS);
        C8632dsu.a(delay, "");
        int i4 = f + 79;
        g = i4 % 128;
        int i5 = i4 % 2;
        return delay;
    }

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone.e
    public Single<dpR> j() {
        int i = 2 % 2;
        String str = this.a;
        switch (str.hashCode()) {
            case 1420005888:
                if (str.equals("000000")) {
                    Single<dpR> delay = Single.error(CollectPhone.Error.InvalidSmsCode.c).delay(500L, TimeUnit.MILLISECONDS);
                    C8632dsu.a(delay, "");
                    return delay;
                }
                break;
            case 1449589344:
                if (str.equals("111111")) {
                    Single<dpR> delay2 = Single.error(CollectPhone.Error.GenericFailure.c).delay(500L, TimeUnit.MILLISECONDS);
                    C8632dsu.a(delay2, "");
                    return delay2;
                }
                break;
            case 1450575459:
                if (str.equals("123456")) {
                    Single<dpR> delay3 = Single.error(CollectPhone.Error.ExpiredSmsCode.c).delay(500L, TimeUnit.MILLISECONDS);
                    C8632dsu.a(delay3, "");
                    return delay3;
                }
                break;
            case 1479172800:
                if (str.equals("222222")) {
                    SingleSubject<String> singleSubject = this.e;
                    if (singleSubject != null) {
                        int i2 = f + 95;
                        g = i2 % 128;
                        int i3 = i2 % 2;
                        singleSubject.onSuccess("827348");
                        int i4 = g + 17;
                        f = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    Single<dpR> delay4 = Single.error(CollectPhone.Error.InvalidSmsCode.c).delay(500L, TimeUnit.MILLISECONDS);
                    C8632dsu.d(delay4);
                    return delay4;
                }
                break;
        }
        Single<dpR> delay5 = Single.just(dpR.c).delay(1000L, TimeUnit.MILLISECONDS);
        C8632dsu.a(delay5, "");
        int i6 = f + 95;
        g = i6 % 128;
        int i7 = i6 % 2;
        return delay5;
    }

    private static void k(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b = C9586sT.b(e$s69$156 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        while (c9586sT.d < b.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            c9586sT.b = c9586sT.d - 4;
            b[c9586sT.d] = (char) ((b[c9586sT.d] ^ b[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$156 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        String str = new String(b, 4, b.length - 4);
        int i5 = $10 + 47;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
