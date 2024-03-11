package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.netflix.model.leafs.ArtworkColors;
import o.dlS;

/* renamed from: o.bgV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4542bgV implements InterfaceC4340bcf {
    private final Bitmap a;
    private final Context b;

    @Override // o.InterfaceC4340bcf
    public int a() {
        return ArtworkColors.DEFAULT_BACKGROUND_COLOR;
    }

    @Override // o.InterfaceC4340bcf
    public String c() {
        return "playback_notification_channel";
    }

    @Override // o.InterfaceC4340bcf
    public int d() {
        return 3;
    }

    @Override // o.InterfaceC4340bcf
    public int e() {
        return dlS.c.b;
    }

    @Override // o.InterfaceC4340bcf
    public String f() {
        return "Stop";
    }

    @Override // o.InterfaceC4340bcf
    public int j() {
        return dlS.c.e;
    }

    public C4542bgV(Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
        this.a = BitmapFactory.decodeResource(context.getResources(), dlS.c.d);
    }

    @Override // o.InterfaceC4340bcf
    public Bitmap b() {
        Bitmap bitmap = this.a;
        C8632dsu.a(bitmap, "");
        return bitmap;
    }
}
