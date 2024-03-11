package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;

/* renamed from: o.bWm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4107bWm implements InterfaceC4005bSs {
    public static final b b = new b(null);
    private final GraphQLHomeLolomoRepositoryImpl e;

    @Override // o.InterfaceC4005bSs
    public Completable a(String str, String str2) {
        return this.e.a(str, str2);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4003bSq> a(int i, int i2) {
        return this.e.a(i, i2);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4001bSo> a(int i, int i2, List<Integer> list, int i3, int i4, String str, String str2) {
        C8632dsu.c((Object) list, "");
        return this.e.a(i, i2, list, i3, i4, str, str2);
    }

    @Override // o.InterfaceC4007bSu
    public Single<Optional<C4003bSq>> b(int i, boolean z) {
        return this.e.b(i, z);
    }

    @Override // o.InterfaceC4004bSr
    public Single<InterfaceC5241buz> b(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        return this.e.b(str, z);
    }

    @Override // o.InterfaceC4004bSr
    public void b() {
        this.e.b();
    }

    @Override // o.InterfaceC4007bSu
    public Completable c(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2) {
        C8632dsu.c((Object) str3, "");
        return this.e.c(str, str2, str3, num, str4, str5, num2);
    }

    @Override // o.InterfaceC4007bSu
    public Single<InterfaceC5155btS> c() {
        return this.e.c();
    }

    @Override // o.InterfaceC4007bSu
    public Single<Optional<C4003bSq>> c(int i, boolean z) {
        return this.e.c(i, z);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4003bSq> c(InterfaceC5155btS interfaceC5155btS, int i, int i2, boolean z) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        return this.e.c(interfaceC5155btS, i, i2, z);
    }

    @Override // o.InterfaceC4007bSu
    public Single<List<C4003bSq>> c(InterfaceC5155btS interfaceC5155btS, int i, LoMo loMo, Integer num) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        return this.e.c(interfaceC5155btS, i, loMo, num);
    }

    @Override // o.InterfaceC4007bSu
    public Single<List<C4002bSp>> c(InterfaceC5155btS interfaceC5155btS, LoMo loMo, int i, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        return this.e.c(interfaceC5155btS, loMo, i, interfaceC5222bug);
    }

    @Override // o.InterfaceC4005bSs
    public Completable d(String str) {
        Completable d = this.e.d(str);
        C8632dsu.a(d, "");
        return d;
    }

    @Override // o.InterfaceC4007bSu
    public Completable d(String str, int i, int i2) {
        C8632dsu.c((Object) str, "");
        return this.e.d(str, i, i2);
    }

    @Override // o.InterfaceC4007bSu
    public dyS<String> d() {
        return this.e.d();
    }

    @Override // o.InterfaceC4005bSs
    public Completable e(int i, String str, boolean z, boolean z2, boolean z3) {
        return this.e.e(i, str, z, z2, z3);
    }

    @Inject
    public C4107bWm(GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, C4135bXn c4135bXn, C4133bXl c4133bXl, C4135bXn c4135bXn2) {
        C8632dsu.c((Object) graphQLHomeLolomoRepositoryImpl, "");
        C8632dsu.c((Object) c4135bXn, "");
        C8632dsu.c((Object) c4133bXl, "");
        C8632dsu.c((Object) c4135bXn2, "");
        this.e = graphQLHomeLolomoRepositoryImpl;
    }

    /* renamed from: o.bWm$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GraphQLHomeLolomoOnDeppRepositoryImpl");
        }
    }

    @Override // o.InterfaceC4005bSs
    public Completable e() {
        return this.e.e();
    }
}
