/*
 * MIT License
 *
 * Copyright (c) 2022 TheKodeToad, artDev & other contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all
 *	copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.solclient.installer.util;

import java.io.*;

import io.github.solclient.installer.InstallStatusCallback;

public interface VersionCreator {

    boolean load(InstallStatusCallback cb) throws IOException;

    void addProperty(String property, String name);

    void addGameArguments(String... arguments);

    void putLibrary(File origin, String mavenName) throws IOException;

    void removeLibrary(String mavenName);

    boolean putFullLibrary(String url, String mavenName, InstallStatusCallback cb) throws IOException;

    File getSourceClient();

    File getTargetClient();

    String getTargetName();

    void computeTargetClient() throws IOException;

    void save(String mainClass) throws IOException;

    void setTweakerClass(String tweakerClass);

}
