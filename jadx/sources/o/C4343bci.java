package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bci  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4343bci {
    @SerializedName("present")
    private final boolean b;
    private final transient Context d;
    @SerializedName("technology")
    private final String g;
    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.SCALE)
    private final int i;
    @SerializedName("wasCharged")
    private boolean j;
    @SerializedName("thermalStates")
    private List<Integer> f = new ArrayList();
    @SerializedName("maxThermalState")
    private int a = 0;
    @SerializedName("atStart")
    private d c = new d();
    @SerializedName("atEnd")
    private d e = new d();

    public void b(boolean z) {
        this.j = z;
    }

    public boolean e() {
        return this.j || !this.b;
    }

    /* renamed from: o.bci$d */
    /* loaded from: classes3.dex */
    public static class d {
        @SerializedName("temperature")
        public Integer a;
        @SerializedName("health")
        public Integer b;
        @SerializedName("plugged")
        public Integer c;
        @SerializedName("level")
        public Integer d;
        @SerializedName("status")
        public Integer e;
        @SerializedName("voltage")
        public Integer f;

        public void d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.d = Integer.valueOf(i);
            this.b = Integer.valueOf(i2);
            this.c = Integer.valueOf(i3);
            this.e = Integer.valueOf(i4);
            this.a = Integer.valueOf(i5);
            this.f = Integer.valueOf(i6);
        }

        public String toString() {
            return "BStat{level=" + this.d + ", health=" + this.b + ", plugged=" + this.c + ", status=" + this.e + ", temperature=" + this.a + ", voltage=" + this.f + '}';
        }
    }

    public C4343bci(Context context, boolean z, String str, int i) {
        this.d = context;
        this.b = z;
        this.g = str;
        this.i = i;
    }

    public void e(int i) {
        this.f.add(Integer.valueOf(i));
        this.a = Math.max(this.a, i);
    }

    public void e(boolean z) {
        Intent b = b(this.d);
        if (b == null) {
            return;
        }
        int intExtra = b.getIntExtra("level", -1);
        int intExtra2 = b.getIntExtra("health", 0);
        int intExtra3 = b.getIntExtra("plugged", 0);
        int intExtra4 = b.getIntExtra("status", 0);
        int intExtra5 = b.getIntExtra("temperature", 0);
        int intExtra6 = b.getIntExtra("voltage", 0);
        if (z) {
            this.c.d(intExtra, intExtra2, intExtra3, intExtra4, intExtra5, intExtra6);
        } else {
            this.e.d(intExtra, intExtra2, intExtra3, intExtra4, intExtra5, intExtra6);
        }
    }

    public static C4343bci d(Context context) {
        Intent b = b(context);
        if (b == null) {
            return new C4343bci(context, false, null, -1);
        }
        return new C4343bci(context, b.getExtras().getBoolean("present"), b.getExtras().getString("technology"), b.getIntExtra(InteractiveAnimation.ANIMATION_TYPE.SCALE, -1));
    }

    private static Intent b(Context context) {
        try {
            return ContextCompat.registerReceiver(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 2);
        } catch (IllegalArgumentException e) {
            C1044Mm.a("nf_playreport", e, "unable to request battery stats");
            return null;
        }
    }

    public boolean a(boolean z) {
        Integer num;
        d dVar = z ? this.c : this.e;
        return (dVar == null || (num = dVar.e) == null || (num.intValue() != 2 && dVar.e.intValue() != 5)) ? false : true;
    }
}
