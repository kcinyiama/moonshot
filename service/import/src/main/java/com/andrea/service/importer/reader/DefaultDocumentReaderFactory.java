/*
 * Copyright (c) 2020. Inyiama Kossy
 */

package com.andrea.service.importer.reader;

import com.andrea.service.importer.reader.csv.CsvDocumentReader;
import com.andrea.service.importer.reader.xls.SpreadsheetDocumentReader;

public class DefaultDocumentReaderFactory implements DocumentReaderFactory {

    @Override
    public DocumentReader createReader(ReaderType type) {
        if (type == ReaderType.CSV) {
            return new CsvDocumentReader();
        } else if (type == ReaderType.SPREADSHEET) {
            return new SpreadsheetDocumentReader();
        }
        throw new IllegalArgumentException("ReaderType: " + type + " is not supported");
    }
}
