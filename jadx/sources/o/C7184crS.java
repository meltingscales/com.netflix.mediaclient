package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import java.nio.charset.StandardCharsets;

/* renamed from: o.crS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7184crS extends DownloadButton {
    public static final int b;
    private static byte e$ss2$85 = 0;
    private static int f = 0;
    private static int h = 1;
    public static final a i;
    private int g;
    private String j;

    /* renamed from: o.crS$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[DownloadButton.ButtonState.values().length];
            try {
                iArr[DownloadButton.ButtonState.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadButton.ButtonState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadButton.ButtonState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    static {
        m();
        i = new a(null);
        b = 8;
    }

    static void m() {
        e$ss2$85 = (byte) 24;
    }

    public final void setEpisodeNumber(int i2) {
        this.g = i2;
    }

    public final void setSeasonNumberAbbreviation(String str) {
        this.j = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7184crS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        this.g = -1;
    }

    /* renamed from: o.crS$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadButtonForDetailsPage");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7184crS.j():void");
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    public void d(String str) {
        setTag("DownloadButtonForDetailsPage" + str);
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    public AppView e() {
        if (h()) {
            return AppView.addNextCachedVideoButton;
        }
        AppView e = super.e();
        C8632dsu.a(e, "");
        return e;
    }

    private void q(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$85);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
