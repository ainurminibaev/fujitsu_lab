package com.fujitsu.fs.java.tableview;

import java.io.File;

/**
 * Разбирает таблицы в текстовом формате.
 */
public interface TableParser {
    
    /**
     * Разбирает указанный файл.
     * 
     * Если файл не найден или не может быть прочитан,
     * то возвращает пустой массив.
     * 
     * @param path путь до файла
     * 
     * @return таблицу
     */
    String[][] parser123(String path);

    String[][] parse(File file);

}
