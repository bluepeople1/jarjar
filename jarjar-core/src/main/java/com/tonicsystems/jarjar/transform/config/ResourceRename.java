/**
 * Copyright 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tonicsystems.jarjar.transform.config;

import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public class ResourceRename extends AbstractResourcePattern {

    // private final String replaceText;
    private final List<Object> replace;

    public ResourceRename(@Nonnull String patternText, @Nonnull String replaceText) {
        super(patternText);
        if (replaceText == null)
            throw new IllegalArgumentException("Result may not be null.");
        // this.replaceText = replaceText;
        this.replace = PatternUtils.newReplace(getPattern(), replaceText);
    }

    @CheckForNull
    public String replace(@Nonnull String value) {
        return PatternUtils.replace(this, replace, value);
    }
}