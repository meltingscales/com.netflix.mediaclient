package o;

import com.netflix.mediaclient.service.offline.download.DownloadableType;

/* renamed from: o.bbb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4283bbb {
    final String a;
    final String b;
    final String c;
    final DownloadableType d;
    final String e;

    private C4283bbb(String str, String str2, String str3, DownloadableType downloadableType, String str4) {
        this.c = str;
        this.e = str2;
        this.d = downloadableType;
        this.a = str3;
        this.b = str4;
    }

    public static C4283bbb b(InterfaceC4299bbr interfaceC4299bbr, InterfaceC4285bbd interfaceC4285bbd, String str) {
        return new C4283bbb(interfaceC4299bbr.i(), interfaceC4299bbr.g(), interfaceC4285bbd.e(), interfaceC4285bbd.a(), str);
    }
}
