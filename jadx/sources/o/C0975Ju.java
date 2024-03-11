package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import o.C8143den;

/* renamed from: o.Ju  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0975Ju extends IQ {
    private final String a;
    private final String b;
    private final String c;
    private final InterfaceC1242Ud d;
    private final List<String> e;
    private final StateHistory f;
    private final String g;
    private final String h;
    private final String i;
    private final long j;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    @Override // o.IQ, o.IO
    public int j() {
        return 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0975Ju(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List<java.lang.String> r13, com.netflix.model.leafs.originals.interactive.condition.StateHistory r14) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r7, r0)
            boolean r1 = o.C8684dus.a(r7)
            r1 = r1 ^ 1
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FetchInteractiveMoments:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            goto L27
        L25:
            java.lang.String r7 = "FetchInteractiveMoments"
        L27:
            r3.<init>(r7)
            r3.h = r4
            r3.c = r5
            r3.b = r6
            r3.j = r8
            r3.a = r10
            r3.g = r11
            r3.i = r12
            r3.e = r13
            r3.f = r14
            java.lang.String r5 = "videos"
            java.lang.String r6 = "interactiveMoments"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4, r6}
            o.Ud r4 = o.IE.b(r4)
            o.C8632dsu.a(r4, r0)
            r3.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0975Ju.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.netflix.model.leafs.originals.interactive.condition.StateHistory):void");
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.d);
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        String d;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C8143den.d("supported_locales", C4984bqG.b.d()));
        if (this.g != null) {
            arrayList.add(new C8143den.d("text_language", this.g));
        }
        if (this.a != null) {
            arrayList.add(new C8143den.d("audio_language", this.a));
        }
        if (this.i != null) {
            arrayList.add(new C8143den.d("segmentId", this.i));
        }
        List<String> list = this.e;
        if (list != null) {
            d = C8576dqs.d(list, null, null, null, 0, null, null, 63, null);
            arrayList.add(new C8143den.d("momentIds", d));
        }
        if (this.b != null) {
            arrayList.add(new C8143den.d("schemaVersion", this.b));
        }
        if (this.f != null) {
            arrayList.add(new C8143den.d("interactiveUserState", this.f.toJson().toString()));
        }
        arrayList.add(new C8143den.d("playbackPositionMs", String.valueOf(this.j)));
        arrayList.add(new C8143den.d("intent", this.c));
        return arrayList;
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(2);
        TimeZone timeZone = TimeZone.getDefault();
        arrayList.add(new C8143den.d("X-Netflix.request.client.timeZoneId", timeZone.getID()));
        arrayList.add(new C8143den.d("X-Netflix.request.client.gmtOffsetMs", String.valueOf(timeZone.getRawOffset())));
        return arrayList;
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC5150btN interfaceC5150btN = (InterfaceC5150btN) iy.d.b(this.d);
        interfaceC1757aNc.b(interfaceC5150btN != null ? interfaceC5150btN.az() : null, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.b((InteractiveMoments) null, status);
    }
}
