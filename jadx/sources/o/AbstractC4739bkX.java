package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;

/* renamed from: o.bkX  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4739bkX {
    @SerializedName("debuglog")
    public abstract boolean a();

    @SerializedName("bufferLevelExpConstant")
    public abstract double b();

    @SerializedName("avgVMAFFactor")
    public abstract double c();

    @SerializedName("bufferLevelDeltaFactor")
    public abstract double d();

    @SerializedName("firstMaxDownSwitch")
    public abstract int e();

    @SerializedName("secondMaxUpSwitch")
    public abstract int f();

    @SerializedName("matchByDownloadableVMAF")
    public abstract boolean g();

    @SerializedName("rebufferProbabilityFactor")
    public abstract double h();

    @SerializedName("firstMaxUpSwitch")
    public abstract int i();

    @SerializedName("secondMaxDownSwitch")
    public abstract int j();

    @SerializedName("simulationOffsetFactors")
    public abstract int[] k();

    @SerializedName("simulationStepSize")
    public abstract int l();

    @SerializedName("simulationWindowSize")
    public abstract int m();

    @SerializedName("segVMAFPNDDownFactor")
    public abstract double n();

    @SerializedName("segVMAFPNDUpFactor")
    public abstract double o();

    public static TypeAdapter<AbstractC4739bkX> e(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C1043Ml.p.get(1278444412);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 51105, 7, 105)).getDeclaredConstructor(Gson.class);
                C1043Ml.p.put(1278444412, obj);
            }
            return (TypeAdapter) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
