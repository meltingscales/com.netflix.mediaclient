package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bnI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4827bnI extends BaseEventJson {
    @SerializedName("metrics")
    protected List<e> e;

    protected C4827bnI() {
    }

    public C4827bnI(String str, String str2, String str3, String str4, String str5) {
        super("subtitleqoe", str, str2, str3, str4, str5);
    }

    public C4827bnI a(List<C4970bpt> list) {
        this.e = new ArrayList(list.size());
        for (C4970bpt c4970bpt : list) {
            this.e.add(new e(c4970bpt));
        }
        return this;
    }

    /* renamed from: o.bnI$e */
    /* loaded from: classes3.dex */
    static class e {
        @SerializedName("expected")
        private int a;
        @SerializedName("shown")
        private int b;
        @SerializedName("missed")
        private int c;
        @SerializedName("dlid")
        private String e;

        public e(C4970bpt c4970bpt) {
            this.e = c4970bpt.d;
            int i = c4970bpt.e;
            this.a = i;
            int i2 = c4970bpt.b;
            this.b = i2;
            this.c = i - i2;
        }
    }
}
