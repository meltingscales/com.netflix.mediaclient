package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C4555bgi;

/* renamed from: o.bgU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4541bgU {

    /* renamed from: o.bgU$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract c c(List<String> list);

        public abstract AbstractC4541bgU c();
    }

    @SerializedName(SignupConstants.Field.LANG_ID)
    public abstract String a();

    @SerializedName("interval")
    public abstract int b();

    @SerializedName("pixelsAspectX")
    public abstract int c();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)
    public abstract int d();

    @SerializedName("downloadable_id")
    public abstract String e();

    public abstract c f();

    @SerializedName("size")
    public abstract int g();

    @SerializedName("pixelsAspectY")
    public abstract int h();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.WIDTH)
    public abstract int i();

    @SerializedName("urls")
    public abstract List<String> j();

    public static TypeAdapter<AbstractC4541bgU> c(Gson gson) {
        return new C4555bgi.b(gson);
    }
}
