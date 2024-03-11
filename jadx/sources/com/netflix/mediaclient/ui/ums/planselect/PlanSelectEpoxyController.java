package com.netflix.mediaclient.ui.ums.planselect;

import android.content.Context;
import android.util.Base64;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.ui.R;
import io.reactivex.subjects.BehaviorSubject;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import o.C3814bLq;
import o.C6217cYe;
import o.C6221cYi;
import o.C6230cYr;
import o.C8569dql;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class PlanSelectEpoxyController extends TypedEpoxyController<C6217cYe> {
    public static final int $stable = 8;
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$54;
    private final Context context;
    private final BehaviorSubject<Integer> planSelectionClicks;

    static {
        c();
    }

    static void c() {
        e$ss2$54 = (byte) 24;
    }

    public PlanSelectEpoxyController(Context context, BehaviorSubject<Integer> behaviorSubject) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) behaviorSubject, "");
        this.context = context;
        this.planSelectionClicks = behaviorSubject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C6217cYe c6217cYe) {
        int i = 2 % 2;
        int i2 = c + 89;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (c6217cYe == null) {
            return;
        }
        C6221cYi c6221cYi = new C6221cYi();
        c6221cYi.e((CharSequence) "header");
        c6221cYi.d(c6217cYe.c());
        add(c6221cYi);
        Iterator<T> it = c6217cYe.b().getChoices().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = c + 51;
            e = i5 % 128;
            if (i5 % 2 == 0) {
                it.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                C8569dql.h();
            }
            C6230cYr c6230cYr = new C6230cYr();
            c6230cYr.d((CharSequence) ("product-choice-" + i4));
            c6230cYr.d((MembershipProductChoice) next);
            c6230cYr.a(this.planSelectionClicks);
            add(c6230cYr);
            i4++;
        }
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.d(R.i.ba);
        c3814bLq.b((CharSequence) "text-1");
        String string = this.context.getString(R.o.jH);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c3814bLq.d((CharSequence) string);
        add(c3814bLq);
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$54);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
