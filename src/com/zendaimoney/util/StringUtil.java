package com.zendaimoney.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class StringUtil {

	public static String InputStreamToString(InputStream in, String encoding) throws Exception {
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[1024];
		int count = -1;
		while ((count = in.read(data, 0, 1024)) != -1) {
			outStream.write(data, 0, 1024);
		}
		
		data = null;
		return new String(outStream.toByteArray(), "utf-8");
	}
}
