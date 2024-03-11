package com.netflix.model.leafs.social;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Map;
import o.C1045Mp;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;

/* loaded from: classes.dex */
public final class VideoTypeAdapter extends TypeAdapter<VideoType> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("VideoTypeAdapter");
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, VideoType videoType) {
        C8632dsu.c((Object) jsonWriter, "");
        C8632dsu.c((Object) videoType, "");
        jsonWriter.name("videoType").value(videoType.name());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public VideoType read(JsonReader jsonReader) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) jsonReader, "");
        if (jsonReader.hasNext()) {
            VideoType create = VideoType.create(jsonReader.nextString() + "s");
            C8632dsu.d(create);
            return create;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.m;
        String str = Companion.getLogTag() + ": VideoType field not present";
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(str, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b = c1596aHd.b();
            if (b != null) {
                c1596aHd.a(errorType2.c() + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        return VideoType.UNKNOWN;
    }
}
