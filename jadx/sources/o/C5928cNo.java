package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;

/* renamed from: o.cNo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5928cNo implements InterfaceC5929cNp {
    public static final C5928cNo b = new C5928cNo();

    private C5928cNo() {
    }

    @Override // o.InterfaceC5929cNp
    public void a(Activity activity, String str, AvatarInfo avatarInfo) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        Intent d = cMX.c.d(activity, str);
        c(d, avatarInfo);
        d.putExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK", true);
        activity.startActivity(d);
    }

    @Override // o.InterfaceC5929cNp
    public void c(Intent intent, AvatarInfo avatarInfo) {
        C8632dsu.c((Object) intent, "");
        intent.putExtra("avatar_name", avatarInfo);
    }

    public AvatarInfo c(Intent intent) {
        if (intent != null) {
            return (AvatarInfo) intent.getParcelableExtra("avatar_name");
        }
        return null;
    }

    public AvatarInfo b(Bundle bundle) {
        if (bundle != null) {
            return (AvatarInfo) bundle.getParcelable("avatar_name");
        }
        return null;
    }
}
