package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.SourceMethod;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import j$.time.Instant;
import java.lang.annotation.Annotation;
import java.util.Set;
import o.C8632dsu;
import o.dnD;
import o.dnK;
import o.dnN;
import o.dnT;
import o.dqN;

/* loaded from: classes6.dex */
public final class CloudGameSSIDBeaconJsonJsonAdapter extends dnD<CloudGameSSIDBeaconJson> {
    private final dnD<String> a;
    private final JsonReader.c b;
    private final dnD<SourceMethod> c;
    private final dnD<Instant> d;
    private final dnD<Integer> e;

    public CloudGameSSIDBeaconJsonJsonAdapter(dnN dnn) {
        Set<? extends Annotation> e;
        Set<? extends Annotation> e2;
        Set<? extends Annotation> e3;
        Set<? extends Annotation> e4;
        C8632dsu.c((Object) dnn, "");
        JsonReader.c a = JsonReader.c.a("beaconType", "sourceMethod", "beaconCode", "validUntil", "gameId");
        C8632dsu.a(a, "");
        this.b = a;
        e = dqN.e();
        dnD<String> e5 = dnn.e(String.class, e, "beaconType");
        C8632dsu.a(e5, "");
        this.a = e5;
        e2 = dqN.e();
        dnD<SourceMethod> e6 = dnn.e(SourceMethod.class, e2, "sourceMethod");
        C8632dsu.a(e6, "");
        this.c = e6;
        e3 = dqN.e();
        dnD<Instant> e7 = dnn.e(Instant.class, e3, "validUntil");
        C8632dsu.a(e7, "");
        this.d = e7;
        Class cls = Integer.TYPE;
        e4 = dqN.e();
        dnD<Integer> e8 = dnn.e(cls, e4, "gameId");
        C8632dsu.a(e8, "");
        this.e = e8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CloudGameSSIDBeaconJson");
        sb.append(')');
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    @Override // o.dnD
    /* renamed from: e */
    public CloudGameSSIDBeaconJson d(JsonReader jsonReader) {
        C8632dsu.c((Object) jsonReader, "");
        jsonReader.e();
        Integer num = null;
        String str = null;
        SourceMethod sourceMethod = null;
        String str2 = null;
        Instant instant = null;
        while (jsonReader.h()) {
            int d = jsonReader.d(this.b);
            if (d == -1) {
                jsonReader.t();
                jsonReader.p();
            } else if (d == 0) {
                str = this.a.d(jsonReader);
                if (str == null) {
                    JsonDataException d2 = dnT.d("beaconType", "beaconType", jsonReader);
                    C8632dsu.a((Object) d2, "");
                    throw d2;
                }
            } else if (d == 1) {
                sourceMethod = this.c.d(jsonReader);
                if (sourceMethod == null) {
                    JsonDataException d3 = dnT.d("sourceMethod", "sourceMethod", jsonReader);
                    C8632dsu.a((Object) d3, "");
                    throw d3;
                }
            } else if (d == 2) {
                str2 = this.a.d(jsonReader);
                if (str2 == null) {
                    JsonDataException d4 = dnT.d("beaconCode", "beaconCode", jsonReader);
                    C8632dsu.a((Object) d4, "");
                    throw d4;
                }
            } else if (d == 3) {
                instant = this.d.d(jsonReader);
                if (instant == null) {
                    JsonDataException d5 = dnT.d("validUntil", "validUntil", jsonReader);
                    C8632dsu.a((Object) d5, "");
                    throw d5;
                }
            } else if (d == 4 && (num = this.e.d(jsonReader)) == null) {
                JsonDataException d6 = dnT.d("gameId", "gameId", jsonReader);
                C8632dsu.a((Object) d6, "");
                throw d6;
            }
        }
        jsonReader.b();
        if (str == null) {
            JsonDataException b = dnT.b("beaconType", "beaconType", jsonReader);
            C8632dsu.a((Object) b, "");
            throw b;
        } else if (sourceMethod == null) {
            JsonDataException b2 = dnT.b("sourceMethod", "sourceMethod", jsonReader);
            C8632dsu.a((Object) b2, "");
            throw b2;
        } else if (str2 == null) {
            JsonDataException b3 = dnT.b("beaconCode", "beaconCode", jsonReader);
            C8632dsu.a((Object) b3, "");
            throw b3;
        } else if (instant == null) {
            JsonDataException b4 = dnT.b("validUntil", "validUntil", jsonReader);
            C8632dsu.a((Object) b4, "");
            throw b4;
        } else if (num != null) {
            return new CloudGameSSIDBeaconJson(str, sourceMethod, str2, instant, num.intValue());
        } else {
            JsonDataException b5 = dnT.b("gameId", "gameId", jsonReader);
            C8632dsu.a((Object) b5, "");
            throw b5;
        }
    }

    @Override // o.dnD
    /* renamed from: d */
    public void b(dnK dnk, CloudGameSSIDBeaconJson cloudGameSSIDBeaconJson) {
        C8632dsu.c((Object) dnk, "");
        if (cloudGameSSIDBeaconJson == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        dnk.e();
        dnk.d("beaconType");
        this.a.b(dnk, (dnK) cloudGameSSIDBeaconJson.c());
        dnk.d("sourceMethod");
        this.c.b(dnk, (dnK) cloudGameSSIDBeaconJson.e());
        dnk.d("beaconCode");
        this.a.b(dnk, (dnK) cloudGameSSIDBeaconJson.d());
        dnk.d("validUntil");
        this.d.b(dnk, (dnK) cloudGameSSIDBeaconJson.a());
        dnk.d("gameId");
        this.e.b(dnk, (dnK) Integer.valueOf(cloudGameSSIDBeaconJson.b()));
        dnk.a();
    }
}
