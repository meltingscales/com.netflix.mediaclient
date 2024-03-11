package o;

import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import java.util.Objects;
import java.util.Set;

/* renamed from: o.aWc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1999aWc {
    private final MdxLoginPolicyEnum e;
    private String c = null;
    private boolean b = true;

    public boolean a() {
        return this.b;
    }

    public MdxLoginPolicyEnum b() {
        return this.e;
    }

    public String d() {
        return this.c;
    }

    public C1999aWc e(boolean z) {
        this.b = z;
        return this;
    }

    public C1999aWc(MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        Objects.requireNonNull(mdxLoginPolicyEnum);
        this.e = mdxLoginPolicyEnum;
    }

    public String toString() {
        return this.e.toString();
    }

    public boolean c() {
        return !this.e.d(MdxLoginPolicyEnum.LoginDisabled);
    }

    public boolean a(MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        return this.e.d(mdxLoginPolicyEnum);
    }

    public boolean e(Set<MdxLoginPolicyEnum> set) {
        return set != null && set.contains(this.e);
    }

    public static C1999aWc d(int i) {
        MdxLoginPolicyEnum e = MdxLoginPolicyEnum.e(i);
        if (e != null) {
            return new C1999aWc(e);
        }
        return null;
    }

    public static C1999aWc d(String str) {
        if ("".equals(str)) {
            return null;
        }
        return d(Integer.parseInt(str));
    }
}
