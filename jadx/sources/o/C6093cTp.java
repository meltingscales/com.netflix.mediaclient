package o;

import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;
import com.netflix.mediaclient.graphql.models.type.PinotEntityKind;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLPQSIrmaRepositoryImpl$fetchPrequeryList$1;
import io.reactivex.Observable;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.cTp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6093cTp extends C6096cTs {
    private final InterfaceC1469aCl a;
    private final aLP b;
    private final aDB d;
    private final aCG e;

    /* renamed from: o.cTp$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ImageResolutionClass.values().length];
            try {
                iArr[ImageResolutionClass.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResolutionClass.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6093cTp(aLP alp, aCG acg, aDB adb, InterfaceC1469aCl interfaceC1469aCl) {
        super(alp, acg, adb);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) interfaceC1469aCl, "");
        this.b = alp;
        this.e = acg;
        this.d = adb;
        this.a = interfaceC1469aCl;
    }

    @Override // o.C6096cTs, o.C6095cTr, o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d() {
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLPQSIrmaRepositoryImpl$fetchPrequeryList$1(this, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6096cTs
    protected C3110ask e(boolean z) {
        List<? extends PinotEntityKind> e2;
        List<? extends PinotEntityKind> e3;
        List<? extends PinotEntityKind> e4;
        List<? extends PinotEntityKind> e5;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e6 = cVar.e(Integer.valueOf(C6062cSo.c.a(z)));
        PinotEntityKind pinotEntityKind = PinotEntityKind.d;
        e2 = C8566dqi.e(pinotEntityKind);
        AbstractC8997hK.b e7 = cVar.e(new C3028arH(cVar.e(d(e2))));
        PinotEntityKind pinotEntityKind2 = PinotEntityKind.h;
        e3 = C8566dqi.e(pinotEntityKind2);
        AbstractC8997hK.b e8 = cVar.e(new C3033arM(cVar.e(d(e3))));
        e4 = C8566dqi.e(pinotEntityKind);
        AbstractC8997hK.b e9 = cVar.e(new C2961apu(cVar.e(d(e4))));
        e5 = C8566dqi.e(pinotEntityKind2);
        return new C3110ask(cVar.e(new C3112asm(cVar.e(new C3037arQ(e7, e9, null, null, null, null, e8, cVar.e(new C2966apz(cVar.e(d(e5)))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194108, null)), e6)));
    }

    @Override // o.C6096cTs
    protected C3102asc c() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3102asc(cVar.e(new C3109asj(cVar.e(new C3036arP(null, null, null, cVar.e(f()), cVar.e(i()), null, null, cVar.e(e(false)), null, null, null, null, null, 8039, null)))));
    }

    private final C2916apB i() {
        List e2;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e3 = cVar.e(Integer.valueOf(C6062cSo.c.a(false)));
        e2 = C8566dqi.e(PinotEntityKind.h);
        return new C2916apB(cVar.e(new C3112asm(cVar.e(new C3037arQ(null, null, null, null, null, null, null, cVar.e(new C2966apz(cVar.e(new C3046arZ(cVar.e(e2))))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194175, null)), e3)));
    }

    @Override // o.C6096cTs
    protected C3110ask j() {
        List<? extends PinotEntityKind> e2;
        List<? extends PinotEntityKind> e3;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e4 = cVar.e(Integer.valueOf(C6062cSo.c.a(false)));
        PinotEntityKind pinotEntityKind = PinotEntityKind.h;
        e2 = C8566dqi.e(pinotEntityKind);
        AbstractC8997hK.b e5 = cVar.e(new C3100asa(cVar.e(d(e2))));
        AbstractC8997hK.b e6 = cVar.e(new C3116asq(cVar.e(new C3046arZ(cVar.d()))));
        e3 = C8566dqi.e(pinotEntityKind);
        return new C3110ask(cVar.e(new C3112asm(cVar.e(new C3037arQ(null, null, null, null, null, null, null, null, null, null, null, null, null, e5, cVar.e(new C2917apC(cVar.e(d(e3)))), null, e6, null, null, null, null, null, 4104191, null)), e4)));
    }

    @Override // o.C6096cTs
    public C3165atm b() {
        return new C3165atm(AbstractC8997hK.e.c, null, 2, null);
    }

    public PinotDeviceResolution a() {
        ImageResolutionClass e2 = this.a.e();
        int i = e2 == null ? -1 : e.e[e2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return PinotDeviceResolution.a;
                }
                return PinotDeviceResolution.a;
            }
            return PinotDeviceResolution.e;
        }
        return PinotDeviceResolution.b;
    }
}
