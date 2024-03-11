package o;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C4478bfK;

/* renamed from: o.bfE  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4472bfE {

    /* renamed from: o.bfE$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract d c(List<Stream> list);

        public abstract AbstractC4472bfE e();
    }

    @SerializedName("bitrates")
    public abstract List<Integer> a();

    @SerializedName("codecName")
    public abstract String b();

    @SerializedName("defaultTimedText")
    public abstract String c();

    @SerializedName("streams")
    public abstract List<Stream> d();

    /* JADX INFO: Access modifiers changed from: protected */
    @SerializedName("channels")
    public abstract String e();

    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract String f();

    @SerializedName("hydrated")
    public abstract boolean g();

    @SerializedName("language")
    public abstract String h();

    @SerializedName("isNative")
    public abstract boolean i();

    @SerializedName("disallowedSubtitleTracks")
    public abstract List<String> j();

    @SerializedName("rank")
    public abstract int k();

    @SerializedName("profile")
    public abstract String l();

    @SerializedName("offTrackDisallowed")
    public abstract boolean m();

    @SerializedName("new_track_id")
    public abstract String n();

    @SerializedName("languageDescription")
    public abstract String o();

    @SerializedName("trackType")
    public abstract String p();

    @SerializedName("track_id")
    public abstract String r();

    public abstract d t();

    public static TypeAdapter<AbstractC4472bfE> a(Gson gson) {
        return new C4478bfK.a(gson).d(true).d(Collections.emptyList());
    }

    public List<Stream> q() {
        if (g()) {
            return d();
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : a()) {
            arrayList.add(Stream.createDummyAudioStreamForProfileAndBitrate(l(), num.intValue()));
        }
        return arrayList.size() == 0 ? Collections.singletonList(Stream.DUMMY_STREAM) : arrayList;
    }

    public int s() {
        String e = e();
        if (TextUtils.isEmpty(e)) {
            return 0;
        }
        int parseDouble = (int) Double.parseDouble(e());
        return e.endsWith(".1") ? parseDouble + 1 : parseDouble;
    }
}
