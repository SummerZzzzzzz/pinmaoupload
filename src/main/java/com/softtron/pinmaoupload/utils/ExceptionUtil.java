package com.softtron.pinmaoupload.utils;

import com.softtron.pinmaoupload.exceptions.NotFileException;

public class ExceptionUtil {
    public static final Exception NOTFILEEXCEPTION = new NotFileException("上传文件为空", "50001");
}
