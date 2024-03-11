package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;

/* renamed from: o.bxn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5388bxn implements InterfaceC5378bxd {
    @Override // o.InterfaceC5378bxd
    public Drawable a(Context context, RatingDetails ratingDetails, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) ratingDetails, "");
        return null;
    }

    @Override // o.InterfaceC5378bxd
    public InterfaceC5396bxv d(Context context, ContentAdvisory contentAdvisory, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        String message = contentAdvisory.getMessage();
        C8632dsu.a(message, "");
        if (message.length() == 0) {
            return null;
        }
        LayoutInflater from = LayoutInflater.from(context);
        C8632dsu.a(from, "");
        C5393bxs c5393bxs = new C5393bxs(from);
        String message2 = contentAdvisory.getMessage();
        C8632dsu.a(message2, "");
        c5393bxs.a(message2);
        c5393bxs.c(contentAdvisory.getSecondaryMessage());
        return c5393bxs;
    }

    public final InterfaceC5396bxv c(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) charSequence, "");
        if (charSequence.length() == 0) {
            return null;
        }
        LayoutInflater from = LayoutInflater.from(context);
        C8632dsu.a(from, "");
        C5393bxs c5393bxs = new C5393bxs(from);
        c5393bxs.a(charSequence);
        c5393bxs.c(charSequence2);
        return c5393bxs;
    }
}
