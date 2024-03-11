package o;

import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.dgz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8261dgz implements ImageLoader.b {
    public final long a = System.currentTimeMillis();
    public final ImageLoader.a b;
    private boolean c;
    private Map<String, InteractiveTrackerInterface> d;
    public final String e;
    private boolean j;

    public String e() {
        return this.e;
    }

    public C8261dgz(ImageLoader.a aVar, String str, boolean z) {
        this.b = aVar;
        this.e = str;
        this.j = z;
    }

    public void e(Map<String, InteractiveTrackerInterface> map) {
        this.d = map;
        for (InteractiveTrackerInterface interactiveTrackerInterface : map.values()) {
            interactiveTrackerInterface.b(this, this.b, this.j);
        }
        this.c = true;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.b
    public void e(C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, InterfaceC9640uH interfaceC9640uH) {
        C8166dfJ.d();
        ImageLoader.a aVar = this.b;
        if (aVar != null) {
            aVar.setImageDataSource(c(assetLocationType));
            this.b.setAssetFetchLatency((int) (System.currentTimeMillis() - this.a));
        }
        if (!this.c || this.d == null) {
            return;
        }
        for (InteractiveTrackerInterface interactiveTrackerInterface : new ArrayList(this.d.values())) {
            interactiveTrackerInterface.e(this, c8259dgx, assetLocationType, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dgz$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ImageLoader.AssetLocationType.values().length];
            d = iArr;
            try {
                iArr[ImageLoader.AssetLocationType.DISKCACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ImageLoader.AssetLocationType.MEMCACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ImageLoader.AssetLocationType.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[ImageLoader.AssetLocationType.PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private ImageDataSource c(ImageLoader.AssetLocationType assetLocationType) {
        int i = AnonymousClass1.d[assetLocationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("unknown asset location type");
                }
                return ImageDataSource.e;
            }
            return ImageDataSource.b;
        }
        return ImageDataSource.a;
    }

    @Override // o.C9864xy.b
    public void b(VolleyError volleyError) {
        C8166dfJ.d();
        if (!this.c || this.d == null) {
            return;
        }
        for (InteractiveTrackerInterface interactiveTrackerInterface : new ArrayList(this.d.values())) {
            interactiveTrackerInterface.e(this, null, null, volleyError);
        }
    }
}
