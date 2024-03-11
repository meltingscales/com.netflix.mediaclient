package com.netflix.mediaclient.service.player.common;

import androidx.media3.common.util.Util;
import com.netflix.mediaclient.media.manifest.Url;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC4536bgP;
import o.AbstractC4537bgQ;

/* loaded from: classes3.dex */
public class NetflixTimedTextTrackData extends NetflixIdMetadataEntry {
    public final boolean a;
    public final String c;
    public final String d;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;

    /* renamed from: o  reason: collision with root package name */
    public final List<Url> f13215o;

    public NetflixTimedTextTrackData(long j, AbstractC4537bgQ abstractC4537bgQ, String str) {
        super(j, abstractC4537bgQ.m(), abstractC4537bgQ.k());
        this.f13215o = new ArrayList();
        this.g = str;
        this.d = abstractC4537bgQ.h();
        this.c = abstractC4537bgQ.o();
        this.j = abstractC4537bgQ.n();
        this.a = abstractC4537bgQ.i();
        AbstractC4536bgP abstractC4536bgP = abstractC4537bgQ.t().get(str);
        if (abstractC4536bgP == null) {
            this.f = -1;
            this.h = -1;
            this.i = -1;
            return;
        }
        this.i = abstractC4536bgP.g();
        this.f = abstractC4536bgP.e();
        this.h = abstractC4536bgP.a();
        for (Map.Entry<String, String> entry : abstractC4536bgP.c().entrySet()) {
            try {
                int intValue = Integer.valueOf(entry.getKey()).intValue();
                if (abstractC4536bgP.b() != null && abstractC4536bgP.b().containsKey(entry.getKey())) {
                    this.f13215o.add(Url.newInstance(intValue, entry.getValue(), abstractC4536bgP.b().get(entry.getKey())));
                } else {
                    this.f13215o.add(Url.newInstance(intValue, entry.getValue()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry
    public boolean equals(Object obj) {
        if (obj instanceof NetflixTimedTextTrackData) {
            NetflixTimedTextTrackData netflixTimedTextTrackData = (NetflixTimedTextTrackData) obj;
            return super.equals(obj) && Util.areEqual(this.g, netflixTimedTextTrackData.g) && Util.areEqual(this.d, netflixTimedTextTrackData.d) && Util.areEqual(this.c, netflixTimedTextTrackData.c) && Util.areEqual(this.j, netflixTimedTextTrackData.j) && this.a == netflixTimedTextTrackData.a && this.i == netflixTimedTextTrackData.i && this.f == netflixTimedTextTrackData.f && this.h == netflixTimedTextTrackData.h && Util.areEqual(this.f13215o, netflixTimedTextTrackData.f13215o);
        }
        return false;
    }
}
