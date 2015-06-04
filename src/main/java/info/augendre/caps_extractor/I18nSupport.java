/*
 * Copyright (c) 2013 Philippe VIENNE
 *
 * This file is a part of SpeleoGraph
 *
 * SpeleoGraph is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General
 * Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * SpeleoGraph is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with SpeleoGraph.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package info.augendre.caps_extractor;

import com.jgoodies.common.internal.StringLocalizer;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Distributed on licence GNU GPL V3.
 */
public class I18nSupport implements StringLocalizer {
    @NonNls
    private static final ResourceBundle bundle = ResourceBundle.getBundle("info/augendre/caps_extractor/strings");

    public static String translate
            (@PropertyKey(resourceBundle = "info.augendre.caps_extractor.strings")
             String key, Object... params) {
        String value = bundle.getString(key);
        if (params.length > 0) return MessageFormat.format(value, params);
        return value;
    }

    /**
     * Returns a localized String for the given key.
     *
     * @param key the key used to look up the localized String
     * @return the localized String
     */
    @Override
    public String getString(@PropertyKey(resourceBundle = "info.augendre.caps_extractor.strings") String key) {
        return translate(key);
    }
}
