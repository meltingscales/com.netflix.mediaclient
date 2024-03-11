package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import o.aHS;

/* loaded from: classes3.dex */
class aHE extends ContextWrapper {
    private final Context b;

    public aHE(Context context) {
        super(context);
        this.b = context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return new d(this.b.getResources());
    }

    /* loaded from: classes3.dex */
    final class d extends aHW {
        public d(Resources resources) {
            super(resources);
        }

        @Override // o.aHW, android.content.res.Resources
        public int getIdentifier(String str, String str2, String str3) {
            return "CronetProviderClassName".equals(str) ? aHS.a.d : this.a.getIdentifier(str, str2, str3);
        }
    }
}
