package o;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.SourceMethod;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.CloudGameSSIDBeaconJson;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.InstantAdapter;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.SourceMethodAdapter;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC3855bNd;
import o.dnN;

/* renamed from: o.bNz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3877bNz implements InterfaceC3856bNe {
    public static final b e = new b(null);

    /* renamed from: o.bNz$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SourceMethod.values().length];
            try {
                iArr[SourceMethod.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SourceMethod.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SourceMethod.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    /* renamed from: o.bNz$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("RealCloudGameSSIDBeaconJsonAdapter");
        }
    }

    @Override // o.InterfaceC3856bNe
    public AbstractC3855bNd c(String str) {
        C8632dsu.c((Object) str, "");
        try {
            CloudGameSSIDBeaconJson b2 = a().b(str);
            if (b2 != null) {
                return b(b2);
            }
        } catch (JsonDataException unused) {
            e.getLogTag();
        } catch (IOException unused2) {
            e.getLogTag();
        }
        return null;
    }

    @Override // o.InterfaceC3856bNe
    public String a(AbstractC3855bNd abstractC3855bNd) {
        C8632dsu.c((Object) abstractC3855bNd, "");
        String d2 = a().d((dnD<CloudGameSSIDBeaconJson>) c(abstractC3855bNd));
        C8632dsu.a(d2, "");
        return d2;
    }

    private final AbstractC3855bNd b(CloudGameSSIDBeaconJson cloudGameSSIDBeaconJson) {
        int i = d.e[cloudGameSSIDBeaconJson.e().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new AbstractC3855bNd.a(cloudGameSSIDBeaconJson.c(), cloudGameSSIDBeaconJson.d(), cloudGameSSIDBeaconJson.a(), cloudGameSSIDBeaconJson.b());
                }
                throw new NoWhenBranchMatchedException();
            }
            return new AbstractC3855bNd.d(cloudGameSSIDBeaconJson.c(), cloudGameSSIDBeaconJson.d(), cloudGameSSIDBeaconJson.a(), cloudGameSSIDBeaconJson.b());
        }
        return new AbstractC3855bNd.c(cloudGameSSIDBeaconJson.c(), cloudGameSSIDBeaconJson.d(), cloudGameSSIDBeaconJson.a(), cloudGameSSIDBeaconJson.b());
    }

    private final CloudGameSSIDBeaconJson c(AbstractC3855bNd abstractC3855bNd) {
        SourceMethod sourceMethod;
        if (abstractC3855bNd instanceof AbstractC3855bNd.d) {
            sourceMethod = SourceMethod.c;
        } else if (abstractC3855bNd instanceof AbstractC3855bNd.c) {
            sourceMethod = SourceMethod.a;
        } else if (!(abstractC3855bNd instanceof AbstractC3855bNd.a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            sourceMethod = SourceMethod.e;
        }
        return new CloudGameSSIDBeaconJson(abstractC3855bNd.c(), sourceMethod, abstractC3855bNd.b(), abstractC3855bNd.e(), abstractC3855bNd.d());
    }

    private final dnD<CloudGameSSIDBeaconJson> a() {
        dnD<CloudGameSSIDBeaconJson> e2 = new dnN.e().b(new InstantAdapter()).b(new SourceMethodAdapter()).d().b(CloudGameSSIDBeaconJson.class).e();
        C8632dsu.a(e2, "");
        return e2;
    }
}
