package o;

import android.content.Context;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.Url;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC4537bgQ;
import o.InterfaceC4348bcn;

/* renamed from: o.bbT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4275bbT implements InterfaceC4348bcn.c {
    private final String a;
    private final byte[] b;
    private final String c;
    private final List<String> d;
    private final C1980aVk e;
    private final Long f;
    private final AbstractC4561bgo g;
    private final String h;
    private final InterfaceC4525bgE i;
    private final List<String> j;
    private final List<String> n;

    /* renamed from: o  reason: collision with root package name */
    private final List<String> f13565o;

    private void a() {
    }

    public C4275bbT(Context context, String str, InterfaceC4525bgE interfaceC4525bgE, byte[] bArr, AbstractC4561bgo abstractC4561bgo, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str2, String str3, C1980aVk c1980aVk) {
        this.i = interfaceC4525bgE;
        this.c = str;
        this.d = list;
        this.f13565o = list2;
        this.j = list3;
        this.n = list4;
        this.b = bArr;
        this.h = str2;
        this.a = str3;
        this.e = c1980aVk;
        this.g = abstractC4561bgo;
        this.f = interfaceC4525bgE.aa();
        a();
    }

    @Override // o.InterfaceC4348bcn.c
    public InterfaceC4525bgE d() {
        boolean z = true;
        ArrayList arrayList = new ArrayList(1);
        for (AbstractC4541bgU abstractC4541bgU : this.i.z()) {
            if (this.n.contains(abstractC4541bgU.e())) {
                String e = C4336bcb.e(this.c, this.n.get(0), DownloadableType.TrickPlay);
                if (e.startsWith("/")) {
                    e = "file://" + e;
                }
                arrayList.add(abstractC4541bgU.f().c(Collections.singletonList(e)).c());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC4472bfE abstractC4472bfE : this.i.N()) {
            ArrayList arrayList3 = new ArrayList();
            for (Stream stream : abstractC4472bfE.q()) {
                if (this.d.contains(stream.downloadableId())) {
                    arrayList3.add(stream.toBuilder().urls(Collections.singletonList(Url.newInstance(-1, C4336bcb.e(this.c, stream.downloadableId(), DownloadableType.Audio)))).build());
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(abstractC4472bfE.t().c(arrayList3).e());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (VideoTrack videoTrack : this.i.an()) {
            ArrayList arrayList5 = new ArrayList();
            for (Stream stream2 : videoTrack.streams()) {
                if (this.f13565o.contains(stream2.downloadableId())) {
                    arrayList5.add(stream2.toBuilder().urls(Collections.singletonList(Url.newInstance(-1, C4336bcb.e(this.c, stream2.downloadableId(), DownloadableType.Video)))).build());
                }
            }
            if (!arrayList5.isEmpty()) {
                arrayList4.add(videoTrack.toBuilder().streams(arrayList5).build());
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (AbstractC4537bgQ abstractC4537bgQ : this.i.ai()) {
            AbstractC4537bgQ.e e2 = abstractC4537bgQ.s().isEmpty() ? abstractC4537bgQ.l().e(z) : null;
            AbstractC4537bgQ.e eVar = e2;
            HashMap hashMap = null;
            HashMap hashMap2 = null;
            for (Map.Entry<String, String> entry : abstractC4537bgQ.c().entrySet()) {
                if (this.j.contains(entry.getValue())) {
                    if (eVar == null) {
                        hashMap = new HashMap();
                        hashMap2 = new HashMap();
                        eVar = abstractC4537bgQ.l().d(hashMap).a(hashMap2);
                    }
                    String e3 = C4336bcb.e(this.c, entry.getValue(), DownloadableType.Subtitle);
                    hashMap.put(entry.getKey(), entry.getValue());
                    hashMap2.put(entry.getKey(), abstractC4537bgQ.t().get(entry.getKey()).j().c(Collections.singletonMap(Integer.toString(-1), e3)).c());
                }
            }
            if (eVar != null) {
                arrayList6.add(eVar.d());
            }
            z = true;
        }
        AbstractC4534bgN a = AbstractC4534bgN.a(false, "offline", 1, -1, "offline", "offline");
        Location create = Location.create(1, 1, 100, "offline");
        RecommendedMediaData ag = this.i.ag();
        AbstractC4530bgJ b = ag == null ? null : AbstractC4530bgJ.b(ag.getVideoTrackId(), ag.getAudioTrackId(), ag.getTimedTextTrackId());
        long longValue = this.i.aa().longValue();
        List<AbstractC4567bgu> ab = this.i.ab();
        long P = this.i.P();
        AbstractC4564bgr U = this.i.U();
        List<AbstractC4562bgp> L = this.i.L();
        String ac = this.i.ac();
        long r = this.i.r();
        Watermark ar = this.i.ar();
        AbstractC4556bgj f = this.i.f();
        List singletonList = Collections.singletonList(a);
        List singletonList2 = Collections.singletonList(create);
        byte[] bArr = this.b;
        String str = this.h;
        String str2 = this.a;
        AbstractC4561bgo abstractC4561bgo = this.g;
        C1980aVk c1980aVk = this.e;
        return AbstractC4566bgt.a(longValue, arrayList6, ab, null, P, arrayList, arrayList2, arrayList4, U, L, ac, r, ar, 0L, f, singletonList, singletonList2, bArr, str, str2, abstractC4561bgo, c1980aVk == null ? null : c1980aVk.d(), b, this.i.T(), this.i.Z());
    }
}
