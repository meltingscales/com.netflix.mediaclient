package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import o.C8569dql;
import o.C8571dqn;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;
import o.duD;

/* loaded from: classes5.dex */
public final class NavDeepLink {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final String action;
    private boolean isExactDeepLink;
    private boolean isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private String mimeTypeFinalRegex;
    private final InterfaceC8554dpx mimeTypePattern$delegate;
    private final InterfaceC8554dpx pattern$delegate;
    private String patternFinalRegex;
    private final String uriPattern;
    private final List<String> arguments = new ArrayList();
    private final Map<String, ParamQuery> paramArgMap = new LinkedHashMap();

    public final String getAction() {
        return this.action;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public NavDeepLink(String str, String str2, String str3) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        String b3;
        String b4;
        String b5;
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        b = dpB.b(new drO<Pattern>() { // from class: androidx.navigation.NavDeepLink$pattern$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final Pattern invoke() {
                String str4;
                str4 = NavDeepLink.this.patternFinalRegex;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.pattern$delegate = b;
        b2 = dpB.b(new drO<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final Pattern invoke() {
                String str4;
                str4 = NavDeepLink.this.mimeTypeFinalRegex;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        this.mimeTypePattern$delegate = b2;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.isParameterizedQuery = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!SCHEME_PATTERN.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.isParameterizedQuery) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    C8632dsu.a(substring, "");
                    C8632dsu.a(compile, "");
                    this.isExactDeepLink = buildPathRegex(substring, sb, compile);
                }
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.isSingleQueryParamValueOnly = true;
                        queryParameter = str4;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    ParamQuery paramQuery = new ParamQuery();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        paramQuery.addArgumentName(group);
                        C8632dsu.a(queryParameter, "");
                        String substring2 = queryParameter.substring(i, matcher2.start());
                        C8632dsu.a(substring2, "");
                        sb2.append(Pattern.quote(substring2));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                    }
                    if (i < queryParameter.length()) {
                        C8632dsu.a(queryParameter, "");
                        String substring3 = queryParameter.substring(i);
                        C8632dsu.a(substring3, "");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    C8632dsu.a(sb3, "");
                    b5 = C8691duz.b(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null);
                    paramQuery.setParamRegex(b5);
                    Map<String, ParamQuery> map = this.paramArgMap;
                    C8632dsu.a(str4, "");
                    map.put(str4, paramQuery);
                }
            } else {
                C8632dsu.a(compile, "");
                this.isExactDeepLink = buildPathRegex(str, sb, compile);
            }
            String sb4 = sb.toString();
            C8632dsu.a(sb4, "");
            b4 = C8691duz.b(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
            this.patternFinalRegex = b4;
        }
        if (this.mimeType != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
                throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
            }
            MimeType mimeType = new MimeType(this.mimeType);
            b3 = C8691duz.b("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            this.mimeTypeFinalRegex = b3;
        }
    }

    private final Pattern getPattern() {
        return (Pattern) this.pattern$delegate.getValue();
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> g;
        List<String> list = this.arguments;
        ArrayList arrayList = new ArrayList();
        for (ParamQuery paramQuery : this.paramArgMap.values()) {
            C8571dqn.b(arrayList, paramQuery.getArguments());
        }
        g = C8576dqs.g((Collection) list, (Iterable) arrayList);
        return g;
    }

    private final boolean buildPathRegex(String str, StringBuilder sb, Pattern pattern) {
        boolean d;
        Matcher matcher = pattern.matcher(str);
        d = duD.d((CharSequence) str, (CharSequence) ".*", false, 2, (Object) null);
        boolean z = !d;
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.arguments.add(group);
            String substring = str.substring(i, matcher.start());
            C8632dsu.a(substring, "");
            sb.append(Pattern.quote(substring));
            sb.append("([^/]+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            C8632dsu.a(substring2, "");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public final int getMimeTypeMatchRating(String str) {
        C8632dsu.c((Object) str, "");
        if (this.mimeType != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            C8632dsu.d(mimeTypePattern);
            if (mimeTypePattern.matcher(str).matches()) {
                return new MimeType(this.mimeType).compareTo(new MimeType(str));
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Bundle, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final Bundle getMatchingArguments(Uri uri, Map<String, NavArgument> map) {
        Matcher matcher;
        String str;
        String d;
        C8632dsu.c((Object) uri, "");
        C8632dsu.c((Object) map, "");
        Pattern pattern = getPattern();
        ?? r5 = 0;
        Matcher matcher2 = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher2 != null && matcher2.matches()) {
            Bundle bundle = new Bundle();
            int size = this.arguments.size();
            int i = 0;
            while (i < size) {
                String str2 = this.arguments.get(i);
                i++;
                String decode = Uri.decode(matcher2.group(i));
                NavArgument navArgument = map.get(str2);
                try {
                    C8632dsu.a(decode, "");
                } catch (IllegalArgumentException unused) {
                }
                if (parseArgument(bundle, str2, decode, navArgument)) {
                    return null;
                }
            }
            if (this.isParameterizedQuery) {
                for (String str3 : this.paramArgMap.keySet()) {
                    ParamQuery paramQuery = this.paramArgMap.get(str3);
                    String queryParameter = uri.getQueryParameter(str3);
                    if (this.isSingleQueryParamValueOnly) {
                        String uri2 = uri.toString();
                        C8632dsu.a(uri2, "");
                        d = duD.d(uri2, '?', (String) r5, 2, (Object) r5);
                        if (!C8632dsu.c((Object) d, (Object) uri2)) {
                            queryParameter = d;
                        }
                    }
                    if (queryParameter != null) {
                        C8632dsu.d(paramQuery);
                        matcher = Pattern.compile(paramQuery.getParamRegex(), 32).matcher(queryParameter);
                        if (!matcher.matches()) {
                            return r5;
                        }
                    } else {
                        matcher = r5;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        C8632dsu.d(paramQuery);
                        int size2 = paramQuery.size();
                        int i2 = 0;
                        String str4 = r5;
                        while (i2 < size2) {
                            if (matcher != null) {
                                str = matcher.group(i2 + 1);
                                if (str == null) {
                                    str = "";
                                }
                            } else {
                                str = str4;
                            }
                            String argumentName = paramQuery.getArgumentName(i2);
                            NavArgument navArgument2 = map.get(argumentName);
                            if (str != null) {
                                if (!C8632dsu.c((Object) str, (Object) ('{' + argumentName + '}')) && parseArgument(bundle2, argumentName, str, navArgument2)) {
                                    return null;
                                }
                            }
                            i2++;
                            str4 = null;
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                    r5 = 0;
                }
            }
            for (Map.Entry<String, NavArgument> entry : map.entrySet()) {
                String key = entry.getKey();
                NavArgument value = entry.getValue();
                if (value != null && !value.isNullable() && !value.isDefaultValuePresent() && !bundle.containsKey(key)) {
                    return null;
                }
            }
            return bundle;
        }
        return null;
    }

    private final boolean parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final void addArgumentName(String str) {
            C8632dsu.c((Object) str, "");
            this.arguments.add(str);
        }

        public final String getArgumentName(int i) {
            return this.arguments.get(i);
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public MimeType(String str) {
            List i;
            C8632dsu.c((Object) str, "");
            List<String> c = new Regex("/").c(str, 0);
            if (!c.isEmpty()) {
                ListIterator<String> listIterator = c.listIterator(c.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        i = C8576dqs.j((Iterable) c, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i = C8569dql.i();
            this.type = (String) i.get(0);
            this.subType = (String) i.get(1);
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType mimeType) {
            C8632dsu.c((Object) mimeType, "");
            int i = C8632dsu.c((Object) this.type, (Object) mimeType.type) ? 2 : 0;
            return C8632dsu.c((Object) this.subType, (Object) mimeType.subType) ? i + 1 : i;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (C8632dsu.c((Object) this.uriPattern, (Object) navDeepLink.uriPattern) && C8632dsu.c((Object) this.action, (Object) navDeepLink.action) && C8632dsu.c((Object) this.mimeType, (Object) navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.action;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.mimeType;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* loaded from: classes5.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public final Builder setUriPattern(String str) {
            C8632dsu.c((Object) str, "");
            this.uriPattern = str;
            return this;
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
