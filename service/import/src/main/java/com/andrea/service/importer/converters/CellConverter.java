/*
 * Copyright (c) 2020. Inyiama Kossy
 */

package com.andrea.service.importer.converters;

import com.andrea.service.importer.reader.Cell;

public interface CellConverter {

    Object convert(String extras, Cell... cells);
}