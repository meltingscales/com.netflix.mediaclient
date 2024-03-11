package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PreferenceInflater {
    private final Object[] mConstructorArgs = new Object[2];
    private final Context mContext;
    private String[] mDefaultPackages;
    private PreferenceManager mPreferenceManager;
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor> CONSTRUCTOR_MAP = new HashMap<>();

    public Context getContext() {
        return this.mContext;
    }

    public void setDefaultPackages(String[] strArr) {
        this.mDefaultPackages = strArr;
    }

    public PreferenceInflater(Context context, PreferenceManager preferenceManager) {
        this.mContext = context;
        init(preferenceManager);
    }

    private void init(PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        setDefaultPackages(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    public Preference inflate(int i, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = getContext().getResources().getXml(i);
        try {
            return inflate(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public Preference inflate(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup onMergeRoots;
        synchronized (this.mConstructorArgs) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.mConstructorArgs[0] = this.mContext;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            onMergeRoots = onMergeRoots(preferenceGroup, (PreferenceGroup) createItemFromTag(xmlPullParser.getName(), asAttributeSet));
            rInflate(xmlPullParser, onMergeRoots, asAttributeSet);
        }
        return onMergeRoots;
    }

    private PreferenceGroup onMergeRoots(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.onAttachedToHierarchy(this.mPreferenceManager);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    private Preference createItem(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> loadClass;
        Constructor<?> constructor = CONSTRUCTOR_MAP.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.mContext.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        loadClass = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                loadClass = classLoader.loadClass(str2 + str);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (loadClass == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                        constructor = loadClass.getConstructor(CONSTRUCTOR_SIGNATURE);
                        constructor.setAccessible(true);
                        CONSTRUCTOR_MAP.put(str, constructor);
                    }
                    loadClass = classLoader.loadClass(str);
                    constructor = loadClass.getConstructor(CONSTRUCTOR_SIGNATURE);
                    constructor.setAccessible(true);
                    CONSTRUCTOR_MAP.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        Object[] objArr = this.mConstructorArgs;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    protected Preference onCreateItem(String str, AttributeSet attributeSet) {
        return createItem(str, this.mDefaultPackages, attributeSet);
    }

    private Preference createItemFromTag(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return onCreateItem(str, attributeSet);
            }
            return createItem(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    private void rInflate(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.setIntent(Intent.parseIntent(getContext().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    getContext().getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                    try {
                        skipCurrentTag(xmlPullParser);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference createItemFromTag = createItemFromTag(name, attributeSet);
                    ((PreferenceGroup) preference).addItemFromInflater(createItemFromTag);
                    rInflate(xmlPullParser, createItemFromTag, attributeSet);
                }
            }
        }
    }

    private static void skipCurrentTag(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}