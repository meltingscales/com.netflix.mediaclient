package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cUO {
    public static final a d = new a(null);

    public final List<c> c(boolean z) {
        boolean a2;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(a());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                a2 = C8691duz.a(jSONObject.getString(InteractiveAnimation.States.display), "yes", true);
                if (!z || a2) {
                    String string = a2 ? jSONObject.getString("licenseType") : jSONObject.optString("licenseType");
                    String string2 = a2 ? jSONObject.getString("name") : jSONObject.optString("name");
                    String string3 = jSONObject.getString(SignupConstants.Field.LANG_ID);
                    C8632dsu.a(string3, "");
                    C8632dsu.d((Object) string2);
                    String optString = jSONObject.optString("copyright");
                    C8632dsu.a(optString, "");
                    String optString2 = jSONObject.optString("website");
                    C8632dsu.a(optString2, "");
                    arrayList.add(new c(string3, string2, optString, optString2, string, jSONObject.optString("licenseText")));
                }
            }
        } catch (IOException | JSONException unused) {
        }
        return arrayList;
    }

    private final String a() {
        InputStream open = ((Context) C1332Xp.b(Context.class)).getAssets().open("attributions.json");
        C8632dsu.a(open, "");
        try {
            int available = open.available();
            byte[] bArr = new byte[available];
            open.read(bArr, 0, available);
            String str = new String(bArr, C8674dui.i);
            C8608drx.a(open, null);
            return str;
        } finally {
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public static final a e = new a(null);
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String i;
        private final String j;

        public final String b() {
            return this.i;
        }

        public final String d() {
            return this.j;
        }

        public final String e() {
            return this.c;
        }

        public c(String str, String str2, String str3, String str4, String str5, String str6) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) str4, "");
            this.b = str;
            this.i = str2;
            this.c = str3;
            this.j = str4;
            this.d = str5;
            this.a = str6;
        }

        public final String c() {
            String str = this.d;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1349088399:
                        if (str.equals("custom")) {
                            String str2 = this.a;
                            if (str2 == null || str2.length() == 0) {
                                String str3 = this.b;
                                throw new IllegalArgumentException("LicenseType is custom, but no license text was supplied for id: " + str3);
                            }
                            return this.a;
                        }
                        break;
                    case -977423767:
                        if (str.equals("public")) {
                            return "\nLicensed under Public Domain";
                        }
                        break;
                    case -163851147:
                        if (str.equals("apache-2.0")) {
                            return "\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License.";
                        }
                        break;
                    case 108120:
                        if (str.equals("mit")) {
                            return "\nPermission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:\nThe above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.";
                        }
                        break;
                }
            }
            String str4 = this.d;
            String str5 = this.b;
            throw new IllegalArgumentException("Need to add entry for this license type (" + str4 + ") in OslInfo - id: " + str5);
        }

        /* loaded from: classes4.dex */
        public static final class a {
            public /* synthetic */ a(C8627dsp c8627dsp) {
                this();
            }

            private a() {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("OpenSourceLicenses");
        }
    }
}
