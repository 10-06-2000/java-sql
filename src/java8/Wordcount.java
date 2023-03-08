package java8;
import java.util.*;
import java.util.stream.Collectors;

public class Wordcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Student article");
		String article=sc.nextLine();
		String[] articleToWord=article.split("[,:;?! ]");
	    List<String> theWords=Arrays.stream(articleToWord).filter(val->!val.isEmpty()).collect(Collectors.toList());
		List<String> theUniqueWords=theWords.stream().map(val->val.toLowerCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Number of words:"+theWords.size());
		System.out.println("Number of Unique words:"+theUniqueWords.size());
		System.out.println(theUniqueWords);
	}}
	   