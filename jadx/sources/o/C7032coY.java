package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import javax.inject.Inject;

/* renamed from: o.coY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7032coY implements InterfaceC7018coJ {
    private final Activity e;

    @Inject
    public C7032coY(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.e = activity;
    }

    @Override // o.InterfaceC7018coJ
    public Intent d() {
        return NonMemberHomeActivity.e.d(this.e);
    }
}
