package o;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.ProgramInformation;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: o.bju  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4726bju extends DashManifest {
    public final boolean a;
    public final long b;
    public final String c;
    public final long d;
    public final JsonObject e;
    public final String f;
    private final AbstractC4473bfF g;
    public final String h;
    public final long i;
    private final String j;
    private final Long k;
    private final C4678biz l;
    private final C4666bin m;
    private final LanguageChoice n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13613o;
    private Long p;
    private final StreamProfileType q;
    private final String r;
    private final int s;

    public long a() {
        return this.d;
    }

    public String b() {
        return this.j;
    }

    public void b(Long l) {
        this.p = l;
    }

    public long c() {
        return this.i;
    }

    public C4678biz d() {
        return this.l;
    }

    public int f() {
        return this.s;
    }

    public LanguageChoice g() {
        return this.n;
    }

    public C4666bin h() {
        return this.m;
    }

    public String i() {
        return this.r;
    }

    public Long j() {
        return this.k;
    }

    public Long k() {
        return this.p;
    }

    public boolean l() {
        return this.h != null;
    }

    public String m() {
        return this.f13613o;
    }

    public StreamProfileType n() {
        return this.q;
    }

    public boolean o() {
        return this.d != -9223372036854775807L;
    }

    public C4726bju(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list, C4666bin c4666bin, C4678biz c4678biz, StreamProfileType streamProfileType, Long l, String str, String str2, String str3, String str4, String str5, LanguageChoice languageChoice, AbstractC4473bfF abstractC4473bfF, String str6, long j8, long j9, boolean z2, long j10, int i, JsonObject jsonObject) {
        super(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
        this.m = c4666bin;
        this.l = c4678biz;
        this.q = streamProfileType;
        this.k = l;
        this.f13613o = str;
        this.h = str2;
        this.c = str3;
        this.j = str4;
        this.f = str5;
        this.n = languageChoice;
        this.p = l;
        this.g = abstractC4473bfF;
        this.r = str6;
        this.i = j8;
        this.d = j9;
        this.a = z2;
        this.b = j10;
        this.s = i;
        this.e = jsonObject;
    }

    public String e() {
        List<Representation> list;
        if (l()) {
            for (int i = 0; i < getPeriodCount(); i++) {
                for (AdaptationSet adaptationSet : getPeriod(i).adaptationSets) {
                    if (2 == adaptationSet.type && (list = adaptationSet.representations) != null && list.size() > 0) {
                        return adaptationSet.representations.get(0).format.id;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public String d(String str) {
        Format e;
        if (str == null || (e = e(str)) == null) {
            return null;
        }
        return e.language;
    }

    private Format e(String str) {
        for (int i = 0; i < getPeriodCount(); i++) {
            for (AdaptationSet adaptationSet : getPeriod(i).adaptationSets) {
                for (Representation representation : adaptationSet.representations) {
                    if (Objects.equals(str, representation.format.id)) {
                        return representation.format;
                    }
                }
            }
        }
        return null;
    }

    public boolean e(int i, String str) {
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            for (AdaptationSet adaptationSet : getPeriod(i2).adaptationSets) {
                if (adaptationSet.type == i) {
                    for (Representation representation : adaptationSet.representations) {
                        if (Objects.equals(str, representation.format.language)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public void d(List<Stream> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Stream stream : list) {
            arrayList.add(stream.downloadableId());
        }
        for (int i = 0; i < getPeriodCount(); i++) {
            for (AdaptationSet adaptationSet : getPeriod(i).adaptationSets) {
                if (adaptationSet.type == 1) {
                    for (Representation representation : adaptationSet.representations) {
                        if (arrayList.contains(representation.format.id)) {
                            representation.format.selectionFlags |= 1;
                        } else {
                            representation.format.selectionFlags &= -2;
                        }
                    }
                }
            }
        }
    }

    public boolean a(AseConfig aseConfig) {
        return o() && aseConfig.bE();
    }
}
