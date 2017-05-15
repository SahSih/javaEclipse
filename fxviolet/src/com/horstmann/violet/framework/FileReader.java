package com.horstmann.violet.framework;

import java.io.File;
import java.io.IOException;

/**
 * read some file
 */
public interface FileReader<E> {
    E getContent();
    void read(File filename) throws IOException;
}