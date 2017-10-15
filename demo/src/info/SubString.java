package info;

import java.io.UnsupportedEncodingException;

public class SubString {
	public static void main(String args[]) {
		SubString ss = new SubString();
		
		String ostring = "中国abc";
		byte[] strbyte = null;
		try {
			strbyte = ostring.getBytes("gbk");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//调用mySubString方法
		String result = ss.mySubString(strbyte, 2, 5);
		System.out.println(result);
	}
	
	public String mySubString(byte[] bytes,int start,int end){
		byte[] b;
		b = new byte[end-start];
		for(int i=0;start<end;i++) {
			b[i] = bytes[start];
			start++;
		}
		
		String r = null;
		try {
			//设定字符编码方式
			r = new String(b,"gbk");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		
	}
}
