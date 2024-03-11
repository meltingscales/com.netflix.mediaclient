package o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pservice.PDiskData;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.bpK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4935bpK {
    @SerializedName(SignupConstants.Field.LANG_ID)
    public String a;
    @SerializedName("isPlayable")
    public boolean b;
    @SerializedName("horzDispUrl")
    public String c;
    @SerializedName("boxartUrl")
    public String d;
    @SerializedName("isEpisodeNumberHidden")
    public boolean e;
    @SerializedName("playableParentId")
    public String f;
    @SerializedName("playableEndtime")
    public int g;
    @SerializedName("playableEpisodeNumber")
    public int h;
    @SerializedName("isPlayableEpisode")
    public boolean i;
    @SerializedName("playableId")
    public String j;
    @SerializedName("seasonTitle")
    public String k;
    @SerializedName("plyableBookmarkPos")
    public long l;
    @SerializedName("playableParentTitle")
    public String m;
    @SerializedName("playableRuntime")
    public int n;
    @SerializedName("playableTitle")

    /* renamed from: o  reason: collision with root package name */
    public String f13627o;
    @SerializedName("tvCardUrl")
    public String p;
    @SerializedName("synopsys")
    public String q;
    @SerializedName("trickplayUrl")
    public String r;
    @SerializedName(SignupConstants.Field.VIDEO_TITLE)
    public String s;
    @SerializedName("videoType")
    public VideoType t;

    public boolean d(String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        if (C8168dfL.h(this.c) && this.c.contains(str)) {
            return true;
        }
        if (C8168dfL.h(this.r) && this.r.contains(str)) {
            return true;
        }
        return C8168dfL.h(this.p) && this.p.contains(str);
    }

    public static String c(String str) {
        if (C8168dfL.g(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf("/") + 1;
        int lastIndexOf2 = str.lastIndexOf(".");
        try {
            if (lastIndexOf >= lastIndexOf2) {
                return str.substring(str.indexOf("://") + 3);
            }
            return str.substring(lastIndexOf, lastIndexOf2);
        } catch (IndexOutOfBoundsException e) {
            InterfaceC1598aHf.a("pre-app url parsing exception " + e);
            return str;
        }
    }

    /* renamed from: o.bpK$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PDiskData.ImageType.values().length];
            b = iArr;
            try {
                iArr[PDiskData.ImageType.TITLE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[PDiskData.ImageType.TRICKPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[PDiskData.ImageType.HORIZONTAL_ART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String c(C4935bpK c4935bpK, PDiskData.ImageType imageType) {
        String str;
        if (c4935bpK == null) {
            return null;
        }
        int i = AnonymousClass3.b[imageType.ordinal()];
        if (i == 1) {
            str = c4935bpK.p;
        } else if (i == 2) {
            str = c4935bpK.r;
        } else {
            str = c4935bpK.c;
        }
        if (C8168dfL.g(str)) {
            String str2 = c4935bpK.c;
            if (C8168dfL.g(str2)) {
                String str3 = c4935bpK.p;
                C1044Mm.j("PVideo", "even fallback url empty try tvCardUrl: %s", str3);
                return str3;
            }
            return str2;
        }
        return str;
    }

    public C4935bpK b() {
        Gson gson = (Gson) C1332Xp.b(Gson.class);
        return (C4935bpK) gson.fromJson(gson.toJson(this), (Class<Object>) C4935bpK.class);
    }

    public String toString() {
        return ((Gson) C1332Xp.b(Gson.class)).toJson(this);
    }

    public C4935bpK b(String str) {
        if (d()) {
            InterfaceC1598aHf.a("SPY-31901 PVideo validate failed, listType: " + str + ", video id is null: " + toString());
            return null;
        }
        return this;
    }

    public boolean d() {
        return C8168dfL.g(this.a) || (this.b && (C8168dfL.g(this.j) || C8168dfL.d(this.j, "-1")));
    }
}
