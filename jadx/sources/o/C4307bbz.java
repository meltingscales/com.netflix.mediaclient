package o;

import com.netflix.mediaclient.media.SubtitleTrackData;
import com.netflix.mediaclient.media.SubtitleUrl;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bbz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4307bbz implements InterfaceC4285bbd {
    private final String c;
    private final List<C4223baU> d;
    private final long e;

    @Override // o.InterfaceC4285bbd
    public List<C4223baU> b() {
        return this.d;
    }

    @Override // o.InterfaceC4285bbd
    public long c() {
        return this.e;
    }

    @Override // o.InterfaceC4285bbd
    public String e() {
        return this.c;
    }

    private C4307bbz(List<C4223baU> list, long j, String str) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(list);
        C4223baU.a(arrayList);
        this.e = j;
        this.c = str;
    }

    public static C4307bbz d(SubtitleTrackData subtitleTrackData, List<SubtitleUrl> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str = null;
        long j = 0;
        for (SubtitleUrl subtitleUrl : list) {
            if (C8168dfL.h(subtitleUrl.getDownloadUrl())) {
                if (str == null) {
                    str = subtitleUrl.getDownloadableId();
                } else if (!str.equals(subtitleUrl.getDownloadableId())) {
                    C1044Mm.d("nf_subtitleDlInfo", "subtitleUrl has different downloadableId.. ignore");
                }
                arrayList.add(new C4223baU(subtitleUrl.getDownloadUrl(), subtitleTrackData.getRankForCdn(subtitleUrl.getCdnId() + ""), subtitleUrl.getCdnId()));
                j = subtitleUrl.getSize();
            }
        }
        if (arrayList.size() <= 0 || j <= 0) {
            return null;
        }
        return new C4307bbz(arrayList, j, str);
    }

    @Override // o.InterfaceC4285bbd
    public DownloadableType a() {
        return DownloadableType.Subtitle;
    }
}
