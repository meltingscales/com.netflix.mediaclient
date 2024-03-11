package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import o.InterfaceC4660bih;

/* renamed from: o.bnD  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4822bnD {
    @SerializedName("pb")
    private Integer a;
    @SerializedName("bp")
    private Long b;
    @SerializedName("ts")
    private Long c;
    @SerializedName(SignupConstants.Language.SPANISH_ES)
    private String d;
    @SerializedName(VisualStateDefinition.ELEMENT_STATE.RESULT)
    private Integer e;

    public C4822bnD c(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public C4822bnD c(InterfaceC4660bih.j jVar) {
        this.d = jVar.a;
        this.a = Integer.valueOf(jVar.b);
        this.e = Integer.valueOf(jVar.e);
        this.b = Long.valueOf(jVar.c);
        return this;
    }
}
