package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.model.leafs.VideoInfo;

/* renamed from: o.Ta  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1213Ta extends C1220Th {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1213Ta(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1213Ta(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C1213Ta(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213Ta(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C1220Th
    public String d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM) {
        String url;
        C8632dsu.c((Object) interfaceC5223buh, "");
        if (interfaceC5223buh instanceof InterfaceC8366diy) {
            InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) interfaceC5223buh;
            VideoInfo.TopTenBoxart b = interfaceC8366diy.b();
            return (b == null || (url = b.getUrl()) == null) ? interfaceC8366diy.getBoxshotUrl() : url;
        }
        return super.d(interfaceC5223buh, interfaceC5149btM);
    }
}
