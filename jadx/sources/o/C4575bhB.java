package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;

/* renamed from: o.bhB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4575bhB implements InterfaceC4856bnl {
    private final InterfaceC5090bsG e;

    public C4575bhB(InterfaceC5090bsG interfaceC5090bsG) {
        this.e = interfaceC5090bsG;
    }

    @Override // o.InterfaceC4856bnl
    public void d(BaseEventJson baseEventJson) {
        this.e.a(new C4576bhC(baseEventJson.j(), baseEventJson.d(), baseEventJson.e(), baseEventJson));
    }

    @Override // o.InterfaceC4856bnl
    public void b(String str, String str2, boolean z, int... iArr) {
        if ("skipByDelta".equals(str2)) {
            this.e.a(new aUN(str, iArr.length > 0 ? iArr[0] : 0, true));
        } else {
            this.e.a(new C1973aVd(str, str2, true));
        }
    }
}
