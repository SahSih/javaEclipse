package com.horstmann.violet.framework;

import java.io.File;
import java.io.IOException;

/**
 * write some file
 */
public interface FileWriter<E> {
    void setContent(E content);
    void write(File filename) throws IOException;
}