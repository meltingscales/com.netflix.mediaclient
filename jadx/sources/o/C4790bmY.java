package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.InterfaceC4660bih;

/* renamed from: o.bmY  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4790bmY {
    @SerializedName(SignupConstants.Language.SPANISH_ES)
    private String a;
    @SerializedName("fn")
    private String b;
    @SerializedName("pb")
    private int[] c;
    @SerializedName("ts")
    private Long e;

    public C4790bmY b(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    public C4790bmY c(InterfaceC4660bih.a aVar) {
        this.a = aVar.h;
        this.b = aVar.d;
        this.c = aVar.a;
        return this;
    }
}
