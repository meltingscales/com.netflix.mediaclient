package o;

import java.util.Collection;
import java.util.Set;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* renamed from: o.iP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9055iP implements InterfaceC9052iM {
    public static final e b = new e(null);
    private static final String e = "()^$.*?+{}";
    private AbstractC9055iP d;

    public abstract int a(String str);

    public final AbstractC9055iP b() {
        return this.d;
    }

    public abstract Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE);

    public abstract void c();

    public abstract Set<String> e(C9053iN c9053iN, C9044iE c9044iE);

    public final AbstractC9055iP a(AbstractC9055iP abstractC9055iP) {
        C8632dsu.c((Object) abstractC9055iP, "");
        AbstractC9055iP abstractC9055iP2 = this;
        while (true) {
            AbstractC9055iP abstractC9055iP3 = abstractC9055iP2.d;
            if (abstractC9055iP3 != null) {
                C8632dsu.d(abstractC9055iP3);
                abstractC9055iP2 = abstractC9055iP3;
            } else {
                abstractC9055iP2.d = abstractC9055iP;
                return this;
            }
        }
    }

    /* renamed from: o.iP$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final Regex c(String str) {
            boolean a;
            C8632dsu.c((Object) str, "");
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (z) {
                    if (charAt == '\\') {
                        sb.append("\\\\");
                    } else if (charAt == '%') {
                        sb.append("%");
                    } else if (charAt != '_') {
                        throw new IllegalStateException(("Invalid escape in pattern: " + str).toString());
                    } else {
                        sb.append("_");
                    }
                } else if (charAt == '\\') {
                    z = true;
                } else if (charAt == '%') {
                    sb.append(".*");
                } else if (charAt == '_') {
                    sb.append(".");
                } else {
                    a = duD.a((CharSequence) AbstractC9055iP.e, charAt, false, 2, (Object) null);
                    if (a) {
                        sb.append("\\");
                    }
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return new Regex(sb2, RegexOption.e);
        }
    }
}
