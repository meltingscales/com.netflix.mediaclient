package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.model.leafs.VideoInfo;

/* loaded from: classes3.dex */
public class SB extends C1220Th {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SB(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
    }

    @Override // o.C1220Th
    public String d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        if (interfaceC5223buh instanceof InterfaceC8366diy) {
            VideoInfo.TallPanelArt a = ((InterfaceC8366diy) interfaceC5223buh).a();
            if (a != null) {
                return a.getUrl();
            }
            return null;
        }
        return super.d(interfaceC5223buh, interfaceC5149btM);
    }
}
