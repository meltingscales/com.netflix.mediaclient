package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.InterfaceC4660bih;

/* renamed from: o.bnG  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4825bnG {
    @SerializedName("ts")
    private Long b;
    @SerializedName(SignupConstants.Language.SPANISH_ES)
    private String c;
    @SerializedName("hc")
    private Integer d;
    @SerializedName("pb")
    private Integer e;

    public C4825bnG c(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public C4825bnG e(InterfaceC4660bih.f fVar) {
        this.c = fVar.b;
        this.e = Integer.valueOf(fVar.c);
        this.d = Integer.valueOf(fVar.a);
        return this;
    }
}
