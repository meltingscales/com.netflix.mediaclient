package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Interactive extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("bandersnatch")
    private boolean bandersnatch;
    @SerializedName("bandersnatchPrePlay")
    private boolean bandersnatchPreplay;
    @SerializedName("branchingtemplates")
    private boolean branchingTemplates;
    @SerializedName("branchingTemplatesPrePlay")
    private boolean branchingTemplatesPreplay;
    @SerializedName("minecraft")
    private boolean minecraft;

    public final boolean getBandersnatch() {
        return this.bandersnatch;
    }

    public final boolean getBandersnatchPreplay() {
        return this.bandersnatchPreplay;
    }

    public final boolean getBranchingTemplates() {
        return this.branchingTemplates;
    }

    public final boolean getBranchingTemplatesPreplay() {
        return this.branchingTemplatesPreplay;
    }

    public final boolean getMinecraft() {
        return this.minecraft;
    }

    @Override // o.aRW
    public String getName() {
        return "interactive";
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_Interactive");
        }

        public final String b() {
            boolean g;
            StringBuilder sb = new StringBuilder();
            Config_FastProperty_Interactive config_FastProperty_Interactive = (Config_FastProperty_Interactive) C1822aPn.b("interactive");
            config_FastProperty_Interactive.getBandersnatchPreplay();
            if (config_FastProperty_Interactive.getBandersnatch()) {
                sb.append("bandersnatch");
            }
            if (config_FastProperty_Interactive.getBandersnatchPreplay()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append("bandersnatchPrePlay");
            }
            if (config_FastProperty_Interactive.getBranchingTemplates()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append("branchingtemplates");
            }
            if (config_FastProperty_Interactive.getBranchingTemplatesPreplay()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append("branchingTemplatesPrePlay");
            }
            if (config_FastProperty_Interactive.getMinecraft()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append("minecraft");
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            g = C8691duz.g(sb2);
            if (!g) {
                getLogTag();
            }
            return sb2;
        }
    }
}
