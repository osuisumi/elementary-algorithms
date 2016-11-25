package fun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(FileTest.class.getResource("ride.in").getPath()));
		Stream<String> stream = br.lines();
		System.out.println(stream.count());;
		System.out.println(stream.getClass());
//		System.out.println(br.readLine());;
//		System.out.println(br.readLine());;
//		System.out.println(br.readLine());;
		/*StringTokenizer st = new StringTokenizer(br.readLine());
		Stream<String> stream = br.lines();
		System.out.println(stream);
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());*/
	}

}
